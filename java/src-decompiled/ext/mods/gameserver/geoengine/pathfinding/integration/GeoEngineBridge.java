// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineBridge.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.class
  Last modified 9 de jul de 2026; size 31311 bytes
  MD5 checksum 26f2c24cfc16dd82cf113cea982c2484
  Compiled from "GeoEngineBridge.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 32, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               java/lang/Class
   #10 = Class              #9            // java/lang/Class
   #11 = Utf8               getName
   #12 = Utf8               ()Ljava/lang/String;
   #13 = NameAndType        #11:#12       // getName:()Ljava/lang/String;
   #14 = Methodref          #10.#13       // java/lang/Class.getName:()Ljava/lang/String;
   #15 = Utf8               java/util/logging/Logger
   #16 = Class              #15           // java/util/logging/Logger
   #17 = Utf8               getLogger
   #18 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #19 = NameAndType        #17:#18       // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #20 = Methodref          #16.#19       // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #21 = Utf8               logger
   #22 = Utf8               Ljava/util/logging/Logger;
   #23 = NameAndType        #21:#22       // logger:Ljava/util/logging/Logger;
   #24 = Fieldref           #2.#23        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.logger:Ljava/util/logging/Logger;
   #25 = Utf8               java/util/concurrent/ConcurrentHashMap
   #26 = Class              #25           // java/util/concurrent/ConcurrentHashMap
   #27 = Methodref          #26.#7        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #28 = Utf8               l2brEngines
   #29 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #30 = NameAndType        #28:#29       // l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
   #31 = Fieldref           #2.#30        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
   #32 = Utf8               data
   #33 = String             #32           // data
   #34 = Utf8               java/lang/String
   #35 = Class              #34           // java/lang/String
   #36 = Utf8               pathfinder
   #37 = String             #36           // pathfinder
   #38 = Utf8               java/nio/file/Paths
   #39 = Class              #38           // java/nio/file/Paths
   #40 = Utf8               get
   #41 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #42 = NameAndType        #40:#41       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #43 = Methodref          #39.#42       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #44 = Utf8               basePath
   #45 = Utf8               Ljava/nio/file/Path;
   #46 = NameAndType        #44:#45       // basePath:Ljava/nio/file/Path;
   #47 = Fieldref           #2.#46        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.basePath:Ljava/nio/file/Path;
   #48 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
   #49 = Class              #48           // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
   #50 = Utf8               (ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #51 = NameAndType        #5:#50        // "<init>":(ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #52 = Methodref          #49.#51       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig."<init>":(ZZZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #53 = Utf8               config
   #54 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #55 = NameAndType        #53:#54       // config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #56 = Fieldref           #2.#55        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
   #57 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
   #58 = Class              #57           // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics
   #59 = Utf8               (Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #60 = NameAndType        #5:#59        // "<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #61 = Methodref          #58.#60       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics."<init>":(Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #62 = Utf8               metrics
   #63 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #64 = NameAndType        #62:#63       // metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #65 = Fieldref           #2.#64        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
   #66 = Utf8               this
   #67 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #68 = Utf8               initialize
   #69 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;)V
   #70 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #71 = Utf8               legacyEngine
   #72 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
   #73 = NameAndType        #71:#72       // legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
   #74 = Fieldref           #2.#73        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
   #75 = Utf8               _initialized
   #76 = Utf8               Z
   #77 = NameAndType        #75:#76       // _initialized:Z
   #78 = Fieldref           #2.#77        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge._initialized:Z
   #79 = Utf8               java/nio/file/Path
   #80 = Class              #79           // java/nio/file/Path
   #81 = Utf8               toFile
   #82 = Utf8               ()Ljava/io/File;
   #83 = NameAndType        #81:#82       // toFile:()Ljava/io/File;
   #84 = InterfaceMethodref #80.#83       // java/nio/file/Path.toFile:()Ljava/io/File;
   #85 = Utf8               java/io/File
   #86 = Class              #85           // java/io/File
   #87 = Utf8               mkdirs
   #88 = Utf8               ()Z
   #89 = NameAndType        #87:#88       // mkdirs:()Z
   #90 = Methodref          #86.#89       // java/io/File.mkdirs:()Z
   #91 = Utf8               [GeoEngineBridge] Inicializado. Diretório: \u0001
   #92 = String             #91           // [GeoEngineBridge] Inicializado. Diretório: \u0001
   #93 = Utf8               java/lang/invoke/StringConcatFactory
   #94 = Class              #93           // java/lang/invoke/StringConcatFactory
   #95 = Utf8               makeConcatWithConstants
   #96 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #97 = NameAndType        #95:#96       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #98 = Methodref          #94.#97       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #99 = MethodHandle       6:#98         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #100 = Utf8               (Ljava/nio/file/Path;)Ljava/lang/String;
  #101 = NameAndType        #95:#100      // makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #102 = InvokeDynamic      #0:#101       // #0:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #103 = Utf8               info
  #104 = Utf8               (Ljava/lang/String;)V
  #105 = NameAndType        #103:#104     // info:(Ljava/lang/String;)V
  #106 = Methodref          #16.#105      // java/util/logging/Logger.info:(Ljava/lang/String;)V
  #107 = Utf8               legacy
  #108 = Utf8               isInitialized
  #109 = Utf8               getAdminCommands
  #110 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
  #111 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #112 = Utf8               _adminCommands
  #113 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
  #114 = NameAndType        #112:#113     // _adminCommands:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
  #115 = Fieldref           #2.#114       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge._adminCommands:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
  #116 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #117 = Class              #116          // ext/mods/gameserver/geoengine/GeoEngine
  #118 = Utf8               Companion
  #119 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #120 = NameAndType        #118:#119     // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #121 = Fieldref           #117.#120     // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #122 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
  #123 = Class              #122          // ext/mods/gameserver/geoengine/GeoEngine$Companion
  #124 = Utf8               getInstance
  #125 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #126 = NameAndType        #124:#125     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #127 = Methodref          #123.#126     // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #128 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
  #129 = Class              #128          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
  #130 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #131 = NameAndType        #5:#130       // "<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #132 = Methodref          #129.#131     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider."<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #133 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #134 = Class              #133          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #135 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #136 = Class              #135          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #137 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #138 = NameAndType        #5:#137       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #139 = Methodref          #134.#138     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #140 = Utf8               kotlin/Unit
  #141 = Class              #140          // kotlin/Unit
  #142 = Utf8               INSTANCE
  #143 = Utf8               Lkotlin/Unit;
  #144 = NameAndType        #142:#143     // INSTANCE:Lkotlin/Unit;
  #145 = Fieldref           #141.#144     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #146 = Utf8               geo
  #147 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
  #148 = Utf8               provider
  #149 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
  #150 = Utf8               $i$a$-synchronized-GeoEngineBridge$getAdminCommands$1
  #151 = Utf8               I
  #152 = Utf8               java/lang/Throwable
  #153 = Class              #152          // java/lang/Throwable
  #154 = Utf8               unloadRegion
  #155 = Utf8               (II)V
  #156 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
  #157 = Class              #156          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
  #158 = NameAndType        #5:#155       // "<init>":(II)V
  #159 = Methodref          #157.#158     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey."<init>":(II)V
  #160 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #161 = NameAndType        #40:#160      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Methodref          #26.#161      // java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #163 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #164 = Class              #163          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #165 = Utf8               close
  #166 = NameAndType        #165:#6       // close:()V
  #167 = Methodref          #164.#166     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.close:()V
  #168 = Utf8               remove
  #169 = NameAndType        #168:#160     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #170 = Methodref          #26.#169      // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #171 = Utf8               Região \u0001 descarregada
  #172 = String             #171          // Região \u0001 descarregada
  #173 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;)Ljava/lang/String;
  #174 = NameAndType        #95:#173      // makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;)Ljava/lang/String;
  #175 = InvokeDynamic      #1:#174       // #1:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;)Ljava/lang/String;
  #176 = Utf8               key
  #177 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
  #178 = Utf8               regionX
  #179 = Utf8               regionY
  #180 = Utf8               loadL2BRRegions
  #181 = Utf8               (Ljava/util/List;)V
  #182 = Utf8               (Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;)V
  #183 = Utf8               java/lang/Exception
  #184 = Class              #183          // java/lang/Exception
  #185 = Utf8               java/util/List
  #186 = Class              #185          // java/util/List
  #187 = Utf8               size
  #188 = Utf8               ()I
  #189 = NameAndType        #187:#188     // size:()I
  #190 = InterfaceMethodref #186.#189     // java/util/List.size:()I
  #191 = Utf8               [GeoEngineBridge] Carregando \u0001 regiões...
  #192 = String             #191          // [GeoEngineBridge] Carregando \u0001 regiões...
  #193 = Utf8               (I)Ljava/lang/String;
  #194 = NameAndType        #95:#193      // makeConcatWithConstants:(I)Ljava/lang/String;
  #195 = InvokeDynamic      #2:#194       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #196 = Utf8               java/util/ArrayList
  #197 = Class              #196          // java/util/ArrayList
  #198 = Methodref          #197.#7       // java/util/ArrayList."<init>":()V
  #199 = Utf8               java/lang/Iterable
  #200 = Class              #199          // java/lang/Iterable
  #201 = Utf8               iterator
  #202 = Utf8               ()Ljava/util/Iterator;
  #203 = NameAndType        #201:#202     // iterator:()Ljava/util/Iterator;
  #204 = InterfaceMethodref #200.#203     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #205 = Utf8               java/util/Iterator
  #206 = Class              #205          // java/util/Iterator
  #207 = Utf8               hasNext
  #208 = NameAndType        #207:#88      // hasNext:()Z
  #209 = InterfaceMethodref #206.#208     // java/util/Iterator.hasNext:()Z
  #210 = Utf8               next
  #211 = Utf8               ()Ljava/lang/Object;
  #212 = NameAndType        #210:#211     // next:()Ljava/lang/Object;
  #213 = InterfaceMethodref #206.#212     // java/util/Iterator.next:()Ljava/lang/Object;
  #214 = Utf8               kotlin/Pair
  #215 = Class              #214          // kotlin/Pair
  #216 = Utf8               component1
  #217 = NameAndType        #216:#211     // component1:()Ljava/lang/Object;
  #218 = Methodref          #215.#217     // kotlin/Pair.component1:()Ljava/lang/Object;
  #219 = Utf8               java/lang/Number
  #220 = Class              #219          // java/lang/Number
  #221 = Utf8               intValue
  #222 = NameAndType        #221:#188     // intValue:()I
  #223 = Methodref          #220.#222     // java/lang/Number.intValue:()I
  #224 = Utf8               component2
  #225 = NameAndType        #224:#211     // component2:()Ljava/lang/Object;
  #226 = Methodref          #215.#225     // kotlin/Pair.component2:()Ljava/lang/Object;
  #227 = Utf8               \u0001_\u0001.l2br
  #228 = String             #227          // \u0001_\u0001.l2br
  #229 = Utf8               (II)Ljava/lang/String;
  #230 = NameAndType        #95:#229      // makeConcatWithConstants:(II)Ljava/lang/String;
  #231 = InvokeDynamic      #3:#230       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #232 = Utf8               resolve
  #233 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #234 = NameAndType        #232:#233     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #235 = InterfaceMethodref #80.#234      // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #236 = Utf8               exists
  #237 = NameAndType        #236:#88      // exists:()Z
  #238 = Methodref          #86.#237      // java/io/File.exists:()Z
  #239 = Utf8               loadL2BREngine
  #240 = Utf8               (IILjava/nio/file/Path;)V
  #241 = NameAndType        #239:#240     // loadL2BREngine:(IILjava/nio/file/Path;)V
  #242 = Methodref          #2.#241       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.loadL2BREngine:(IILjava/nio/file/Path;)V
  #243 = Utf8               ? [\u0001, \u0001]
  #244 = String             #243          // ? [\u0001, \u0001]
  #245 = InvokeDynamic      #4:#230       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #246 = Utf8               add
  #247 = Utf8               (Ljava/lang/Object;)Z
  #248 = NameAndType        #246:#247     // add:(Ljava/lang/Object;)Z
  #249 = InterfaceMethodref #186.#248     // java/util/List.add:(Ljava/lang/Object;)Z
  #250 = Utf8               java/lang/Boolean
  #251 = Class              #250          // java/lang/Boolean
  #252 = Utf8               valueOf
  #253 = Utf8               (Z)Ljava/lang/Boolean;
  #254 = NameAndType        #252:#253     // valueOf:(Z)Ljava/lang/Boolean;
  #255 = Methodref          #251.#254     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #256 = Utf8               getMessage
  #257 = NameAndType        #256:#12      // getMessage:()Ljava/lang/String;
  #258 = Methodref          #184.#257     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #259 = Utf8               ? Falha ao carregar L2BR para [\u0001, \u0001]: \u0001
  #260 = String             #259          // ? Falha ao carregar L2BR para [\u0001, \u0001]: \u0001
  #261 = Utf8               (IILjava/lang/String;)Ljava/lang/String;
  #262 = NameAndType        #95:#261      // makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #263 = InvokeDynamic      #5:#262       // #5:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #264 = Utf8               warning
  #265 = NameAndType        #264:#104     // warning:(Ljava/lang/String;)V
  #266 = Methodref          #16.#265      // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #267 = Utf8               ? Região [\u0001, \u0001] ? GeoEngine (legacy)
  #268 = String             #267          // ? Região [\u0001, \u0001] ? GeoEngine (legacy)
  #269 = InvokeDynamic      #6:#230       // #6:makeConcatWithConstants:(II)Ljava/lang/String;
  #270 = Utf8               fine
  #271 = NameAndType        #270:#104     // fine:(Ljava/lang/String;)V
  #272 = Methodref          #16.#271      // java/util/logging/Logger.fine:(Ljava/lang/String;)V
  #273 = Utf8               java/util/Collection
  #274 = Class              #273          // java/util/Collection
  #275 = Utf8               isEmpty
  #276 = NameAndType        #275:#88      // isEmpty:()Z
  #277 = InterfaceMethodref #274.#276     // java/util/Collection.isEmpty:()Z
  #278 = Utf8               ,
  #279 = String             #278          // ,
  #280 = Utf8               java/lang/CharSequence
  #281 = Class              #280          // java/lang/CharSequence
  #282 = Utf8               kotlin/collections/CollectionsKt
  #283 = Class              #282          // kotlin/collections/CollectionsKt
  #284 = Utf8               joinToString$default
  #285 = Utf8               (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
  #286 = NameAndType        #284:#285     // joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
  #287 = Methodref          #283.#286     // kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
  #288 = Utf8               , \u0001 falhas
  #289 = String             #288          // , \u0001 falhas
  #290 = InvokeDynamic      #7:#194       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #291 = Utf8
  #292 = String             #291          //
  #293 = Utf8               [GeoEngineBridge] \u0001 regiões em L2BR, \u0001 em legacy\u0001
  #294 = String             #293          // [GeoEngineBridge] \u0001 regiões em L2BR, \u0001 em legacy\u0001
  #295 = InvokeDynamic      #8:#262       // #8:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #296 = Utf8               e
  #297 = Utf8               Ljava/lang/Exception;
  #298 = Utf8               path
  #299 = Utf8               $i$a$-forEach-GeoEngineBridge$loadL2BRRegions$1
  #300 = Utf8               rx
  #301 = Utf8               ry
  #302 = Utf8               element$iv
  #303 = Utf8               Ljava/lang/Object;
  #304 = Utf8               $i$f$forEach
  #305 = Utf8               $this$forEach$iv
  #306 = Utf8               Ljava/lang/Iterable;
  #307 = Utf8               loaded
  #308 = Utf8               failed
  #309 = Utf8               loadedRegions
  #310 = Utf8               Ljava/util/List;
  #311 = Utf8               regions
  #312 = Utf8               loadL2BRRegions$default
  #313 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Ljava/util/List;ILjava/lang/Object;)V
  #314 = Utf8               discoverRegions
  #315 = Utf8               ()Ljava/util/List;
  #316 = NameAndType        #314:#315     // discoverRegions:()Ljava/util/List;
  #317 = Methodref          #2.#316       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.discoverRegions:()Ljava/util/List;
  #318 = NameAndType        #180:#181     // loadL2BRRegions:(Ljava/util/List;)V
  #319 = Methodref          #2.#318       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.loadL2BRRegions:(Ljava/util/List;)V
  #320 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #321 = Class              #320          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #322 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #323 = NameAndType        #118:#322     // Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #324 = Fieldref           #321.#323     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #325 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  #326 = Class              #325          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  #327 = Utf8               open
  #328 = Utf8               (Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #329 = NameAndType        #327:#328     // open:(Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #330 = Methodref          #326.#329     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.open:(Ljava/nio/file/Path;Z)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #331 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #332 = Class              #331          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #333 = Utf8               getNodeCount
  #334 = NameAndType        #333:#188     // getNodeCount:()I
  #335 = Methodref          #321.#334     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
  #336 = Utf8               (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #337 = NameAndType        #5:#336       // "<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #338 = Methodref          #332.#337     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer."<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #339 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #340 = NameAndType        #5:#339       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #341 = Methodref          #164.#340     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine."<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #342 = Utf8               getWarmupOnLoad
  #343 = NameAndType        #342:#88      // getWarmupOnLoad:()Z
  #344 = Methodref          #49.#343      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getWarmupOnLoad:()Z
  #345 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
  #346 = Class              #345          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
  #347 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
  #348 = NameAndType        #5:#347       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
  #349 = Methodref          #346.#348     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
  #350 = Utf8               kotlin/jvm/functions/Function2
  #351 = Class              #350          // kotlin/jvm/functions/Function2
  #352 = Utf8               kotlinx/coroutines/BuildersKt
  #353 = Class              #352          // kotlinx/coroutines/BuildersKt
  #354 = Utf8               runBlocking$default
  #355 = Utf8               (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
  #356 = NameAndType        #354:#355     // runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
  #357 = Methodref          #353.#356     // kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
  #358 = Utf8               java/util/Map
  #359 = Class              #358          // java/util/Map
  #360 = Utf8               put
  #361 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #362 = NameAndType        #360:#361     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #363 = InterfaceMethodref #359.#362     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #364 = Utf8               file
  #365 = Utf8               Ljava/io/File;
  #366 = Utf8               storage
  #367 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #368 = Utf8               dynamicLayer
  #369 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
  #370 = Utf8               engine
  #371 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #372 = Utf8               ()Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;
  #373 = Utf8               kotlin/ranges/IntRange
  #374 = Class              #373          // kotlin/ranges/IntRange
  #375 = Methodref          #374.#158     // kotlin/ranges/IntRange."<init>":(II)V
  #376 = Utf8               kotlin/collections/IntIterator
  #377 = Class              #376          // kotlin/collections/IntIterator
  #378 = Utf8               nextInt
  #379 = NameAndType        #378:#188     // nextInt:()I
  #380 = Methodref          #377.#379     // kotlin/collections/IntIterator.nextInt:()I
  #381 = Utf8               collectionSizeOrDefault
  #382 = Utf8               (Ljava/lang/Iterable;I)I
  #383 = NameAndType        #381:#382     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #384 = Methodref          #283.#383     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #385 = Utf8               (I)V
  #386 = NameAndType        #5:#385       // "<init>":(I)V
  #387 = Methodref          #197.#386     // java/util/ArrayList."<init>":(I)V
  #388 = Utf8               java/lang/Integer
  #389 = Class              #388          // java/lang/Integer
  #390 = Utf8               (I)Ljava/lang/Integer;
  #391 = NameAndType        #252:#390     // valueOf:(I)Ljava/lang/Integer;
  #392 = Methodref          #389.#391     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #393 = Utf8               kotlin/TuplesKt
  #394 = Class              #393          // kotlin/TuplesKt
  #395 = Utf8               to
  #396 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #397 = NameAndType        #395:#396     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #398 = Methodref          #394.#397     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #399 = InterfaceMethodref #274.#248     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #400 = Utf8               addAll
  #401 = Utf8               (Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #402 = NameAndType        #400:#401     // addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #403 = Methodref          #283.#402     // kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #404 = Utf8               $i$a$-map-GeoEngineBridge$discoverRegions$1$1
  #405 = Utf8               item$iv$iv
  #406 = Utf8               $i$f$mapTo
  #407 = Utf8               $this$mapTo$iv$iv
  #408 = Utf8               destination$iv$iv
  #409 = Utf8               Ljava/util/Collection;
  #410 = Utf8               $i$f$map
  #411 = Utf8               $this$map$iv
  #412 = Utf8               $i$a$-flatMap-GeoEngineBridge$discoverRegions$1
  #413 = Utf8               list$iv$iv
  #414 = Utf8               element$iv$iv
  #415 = Utf8               $i$f$flatMapTo
  #416 = Utf8               $this$flatMapTo$iv$iv
  #417 = Utf8               $i$f$flatMap
  #418 = Utf8               $this$flatMap$iv
  #419 = Utf8               findPath
  #420 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #421 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
  #422 = Utf8               getGlobalEnabled
  #423 = NameAndType        #422:#88      // getGlobalEnabled:()Z
  #424 = Methodref          #49.#423      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getGlobalEnabled:()Z
  #425 = Utf8               getMetricsEnabled
  #426 = NameAndType        #425:#88      // getMetricsEnabled:()Z
  #427 = Methodref          #49.#426      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
  #428 = String             #71           // legacyEngine
  #429 = Utf8               kotlin/jvm/internal/Intrinsics
  #430 = Class              #429          // kotlin/jvm/internal/Intrinsics
  #431 = Utf8               throwUninitializedPropertyAccessException
  #432 = NameAndType        #431:#104     // throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
  #433 = Methodref          #430.#432     // kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
  #434 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
  #435 = Class              #434          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
  #436 = NameAndType        #419:#420     // findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #437 = InterfaceMethodref #435.#436     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #438 = Utf8               java/lang/System
  #439 = Class              #438          // java/lang/System
  #440 = Utf8               nanoTime
  #441 = Utf8               ()J
  #442 = NameAndType        #440:#441     // nanoTime:()J
  #443 = Methodref          #439.#442     // java/lang/System.nanoTime:()J
  #444 = Utf8               getLegacyCalls
  #445 = Utf8               ()Ljava/util/concurrent/atomic/AtomicLong;
  #446 = NameAndType        #444:#445     // getLegacyCalls:()Ljava/util/concurrent/atomic/AtomicLong;
  #447 = Methodref          #58.#446      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyCalls:()Ljava/util/concurrent/atomic/AtomicLong;
  #448 = Utf8               java/util/concurrent/atomic/AtomicLong
  #449 = Class              #448          // java/util/concurrent/atomic/AtomicLong
  #450 = Utf8               incrementAndGet
  #451 = NameAndType        #450:#441     // incrementAndGet:()J
  #452 = Methodref          #449.#451     // java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
  #453 = Utf8               getLegacyTotalTimeNs
  #454 = NameAndType        #453:#445     // getLegacyTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
  #455 = Methodref          #58.#454      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
  #456 = Utf8               addAndGet
  #457 = Utf8               (J)J
  #458 = NameAndType        #456:#457     // addAndGet:(J)J
  #459 = Methodref          #449.#458     // java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
  #460 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #461 = Class              #460          // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #462 = Utf8               (III)V
  #463 = NameAndType        #5:#462       // "<init>":(III)V
  #464 = Methodref          #461.#463     // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
  #465 = Utf8               getL2BREngineForLocation
  #466 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #467 = NameAndType        #465:#466     // getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #468 = Methodref          #2.#467       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #469 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #470 = NameAndType        #419:#469     // findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #471 = Methodref          #164.#470     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #472 = Utf8               getL2brCalls
  #473 = NameAndType        #472:#445     // getL2brCalls:()Ljava/util/concurrent/atomic/AtomicLong;
  #474 = Methodref          #58.#473      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brCalls:()Ljava/util/concurrent/atomic/AtomicLong;
  #475 = Utf8               getL2brTotalTimeNs
  #476 = NameAndType        #475:#445     // getL2brTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
  #477 = Methodref          #58.#476      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
  #478 = Utf8               getFallbackToLegacy
  #479 = NameAndType        #478:#88      // getFallbackToLegacy:()Z
  #480 = Methodref          #49.#479      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getFallbackToLegacy:()Z
  #481 = Utf8               getFallbackCalls
  #482 = NameAndType        #481:#445     // getFallbackCalls:()Ljava/util/concurrent/atomic/AtomicLong;
  #483 = Methodref          #58.#482      // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getFallbackCalls:()Ljava/util/concurrent/atomic/AtomicLong;
  #484 = Utf8               emptyList
  #485 = NameAndType        #484:#315     // emptyList:()Ljava/util/List;
  #486 = Methodref          #283.#485     // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
  #487 = Utf8               $i$a$-measureLegacy-GeoEngineBridge$findPath$1
  #488 = Utf8               $i$a$-also-GeoEngineBridge$measureLegacy$1$iv
  #489 = Utf8               it$iv
  #490 = Utf8               $i$f$measureLegacy
  #491 = Utf8               start$iv
  #492 = Utf8               J
  #493 = Utf8               this_$iv
  #494 = Utf8               $i$a$-measureL2BR-GeoEngineBridge$findPath$2
  #495 = Utf8               $i$a$-also-GeoEngineBridge$measureL2BR$1$iv
  #496 = Utf8               $i$f$measureL2BR
  #497 = Utf8               $i$a$-measureLegacy-GeoEngineBridge$findPath$3
  #498 = Utf8               startLoc
  #499 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #500 = Utf8               endLoc
  #501 = Utf8               startL2BR
  #502 = Utf8               endL2BR
  #503 = Utf8               ox
  #504 = Utf8               oy
  #505 = Utf8               oz
  #506 = Utf8               tx
  #507 = Utf8               ty
  #508 = Utf8               tz
  #509 = Utf8               playable
  #510 = Utf8               debug
  #511 = Utf8               findPath$default
  #512 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIIZLjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;
  #513 = Methodref          #2.#436       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #514 = Utf8               canMove
  #515 = Utf8               (IIIIII)Z
  #516 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
  #517 = NameAndType        #514:#516     // canMove:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
  #518 = Methodref          #164.#517     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.canMove:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
  #519 = NameAndType        #514:#515     // canMove:(IIIIII)Z
  #520 = InterfaceMethodref #435.#519     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.canMove:(IIIIII)Z
  #521 = Utf8               $i$a$-measureL2BR-GeoEngineBridge$canMove$1
  #522 = Utf8               $i$a$-measureLegacy-GeoEngineBridge$canMove$2
  #523 = Utf8               l2br
  #524 = Utf8               canSee
  #525 = Utf8               (IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
  #526 = NameAndType        #524:#525     // canSee:(IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
  #527 = InterfaceMethodref #435.#526     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.canSee:(IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
  #528 = Utf8               oheight
  #529 = Utf8               D
  #530 = Utf8               theight
  #531 = Utf8               ignore
  #532 = Utf8               canSee$default
  #533 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIDIIIDLjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Z
  #534 = Methodref          #2.#526       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.canSee:(IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
  #535 = Utf8               getHeight
  #536 = Utf8               (III)S
  #537 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)S
  #538 = NameAndType        #535:#537     // getHeight:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)S
  #539 = Methodref          #164.#538     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getHeight:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)S
  #540 = NameAndType        #535:#536     // getHeight:(III)S
  #541 = InterfaceMethodref #435.#540     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.getHeight:(III)S
  #542 = Utf8               worldX
  #543 = Utf8               worldY
  #544 = Utf8               worldZ
  #545 = Utf8               getValidLocation
  #546 = Utf8               (IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #547 = NameAndType        #545:#546     // getValidLocation:(IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #548 = InterfaceMethodref #435.#547     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.getValidLocation:(IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #549 = Utf8               getValidLocation$default
  #550 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIILjava/lang/Object;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #551 = Methodref          #2.#547       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getValidLocation:(IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #552 = Utf8               addGeoObject
  #553 = Utf8               (Ljava/lang/Object;)V
  #554 = NameAndType        #552:#553     // addGeoObject:(Ljava/lang/Object;)V
  #555 = InterfaceMethodref #435.#554     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.addGeoObject:(Ljava/lang/Object;)V
  #556 = Utf8               obj
  #557 = Utf8               removeGeoObject
  #558 = NameAndType        #557:#553     // removeGeoObject:(Ljava/lang/Object;)V
  #559 = InterfaceMethodref #435.#558     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.removeGeoObject:(Ljava/lang/Object;)V
  #560 = Utf8               getGeoX
  #561 = Utf8               (I)I
  #562 = NameAndType        #560:#561     // getGeoX:(I)I
  #563 = InterfaceMethodref #435.#562     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.getGeoX:(I)I
  #564 = Utf8               getGeoY
  #565 = NameAndType        #564:#561     // getGeoY:(I)I
  #566 = InterfaceMethodref #435.#565     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.getGeoY:(I)I
  #567 = Utf8               geoX
  #568 = Utf8               geoY
  #569 = Utf8               measureL2BR
  #570 = Utf8               (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
  #571 = Utf8               <T:Ljava/lang/Object;>(Lkotlin/jvm/functions/Function0<+TT;>;)TT;
  #572 = Utf8               kotlin/jvm/functions/Function0
  #573 = Class              #572          // kotlin/jvm/functions/Function0
  #574 = Utf8               invoke
  #575 = NameAndType        #574:#211     // invoke:()Ljava/lang/Object;
  #576 = InterfaceMethodref #573.#575     // kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
  #577 = Utf8               $i$a$-also-GeoEngineBridge$measureL2BR$1
  #578 = Utf8               it
  #579 = Utf8               start
  #580 = Utf8               block
  #581 = Utf8               Lkotlin/jvm/functions/Function0;
  #582 = Utf8               measureLegacy
  #583 = Utf8               $i$a$-also-GeoEngineBridge$measureLegacy$1
  #584 = Utf8               getMetrics
  #585 = Utf8               ()Ljava/util/Map;
  #586 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
  #587 = NameAndType        #40:#441      // get:()J
  #588 = Methodref          #449.#587     // java/util/concurrent/atomic/AtomicLong.get:()J
  #589 = Utf8               l2brRegions
  #590 = String             #589          // l2brRegions
  #591 = Methodref          #26.#189      // java/util/concurrent/ConcurrentHashMap.size:()I
  #592 = Utf8               l2brCalls
  #593 = String             #592          // l2brCalls
  #594 = Utf8               java/lang/Long
  #595 = Class              #594          // java/lang/Long
  #596 = Utf8               (J)Ljava/lang/Long;
  #597 = NameAndType        #252:#596     // valueOf:(J)Ljava/lang/Long;
  #598 = Methodref          #595.#597     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #599 = Utf8               legacyCalls
  #600 = String             #599          // legacyCalls
  #601 = Utf8               fallbackCalls
  #602 = String             #601          // fallbackCalls
  #603 = Utf8               l2brPercentage
  #604 = String             #603          // l2brPercentage
  #605 = Utf8               avgL2BRTimeUs
  #606 = String             #605          // avgL2BRTimeUs
  #607 = Utf8               avgLegacyTimeUs
  #608 = String             #607          // avgLegacyTimeUs
  #609 = Utf8               engines
  #610 = String             #609          // engines
  #611 = InterfaceMethodref #359.#189     // java/util/Map.size:()I
  #612 = Utf8               entrySet
  #613 = Utf8               ()Ljava/util/Set;
  #614 = NameAndType        #612:#613     // entrySet:()Ljava/util/Set;
  #615 = InterfaceMethodref #359.#614     // java/util/Map.entrySet:()Ljava/util/Set;
  #616 = Utf8               java/util/Set
  #617 = Class              #616          // java/util/Set
  #618 = InterfaceMethodref #617.#203     // java/util/Set.iterator:()Ljava/util/Iterator;
  #619 = Utf8               java/util/Map$Entry
  #620 = Class              #619          // java/util/Map$Entry
  #621 = Utf8               getKey
  #622 = NameAndType        #621:#211     // getKey:()Ljava/lang/Object;
  #623 = InterfaceMethodref #620.#622     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #624 = Utf8               getValue
  #625 = NameAndType        #624:#211     // getValue:()Ljava/lang/Object;
  #626 = InterfaceMethodref #620.#625     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #627 = Utf8               region
  #628 = String             #627          // region
  #629 = Utf8               toString
  #630 = NameAndType        #629:#12      // toString:()Ljava/lang/String;
  #631 = Methodref          #157.#630     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey.toString:()Ljava/lang/String;
  #632 = Utf8               nodes
  #633 = String             #632          // nodes
  #634 = Utf8               getStorage
  #635 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #636 = NameAndType        #634:#635     // getStorage:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #637 = Methodref          #164.#636     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getStorage:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #638 = String             #62           // metrics
  #639 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #640 = NameAndType        #584:#639     // getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #641 = Methodref          #164.#640     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #642 = Utf8               kotlin/collections/MapsKt
  #643 = Class              #642          // kotlin/collections/MapsKt
  #644 = Utf8               mapOf
  #645 = Utf8               ([Lkotlin/Pair;)Ljava/util/Map;
  #646 = NameAndType        #644:#645     // mapOf:([Lkotlin/Pair;)Ljava/util/Map;
  #647 = Methodref          #643.#646     // kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
  #648 = Utf8               $i$a$-map-GeoEngineBridge$getMetrics$1
  #649 = Utf8               Ljava/util/Map$Entry;
  #650 = Utf8               Ljava/util/Map;
  #651 = Utf8               totalCalls
  #652 = Utf8               [Lkotlin/Pair;
  #653 = Class              #652          // "[Lkotlin/Pair;"
  #654 = Utf8               verifyL2BRFile
  #655 = Utf8               data/pathfinder/\u0001_\u0001.l2br
  #656 = String             #655          // data/pathfinder/\u0001_\u0001.l2br
  #657 = InvokeDynamic      #9:#230       // #9:makeConcatWithConstants:(II)Ljava/lang/String;
  #658 = Utf8               ARQUIVO_NAO_ENCONTRADO
  #659 = String             #658          // ARQUIVO_NAO_ENCONTRADO
  #660 = Utf8               java/io/RandomAccessFile
  #661 = Class              #660          // java/io/RandomAccessFile
  #662 = Utf8               r
  #663 = String             #662          // r
  #664 = Utf8               (Ljava/io/File;Ljava/lang/String;)V
  #665 = NameAndType        #5:#664       // "<init>":(Ljava/io/File;Ljava/lang/String;)V
  #666 = Methodref          #661.#665     // java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
  #667 = Utf8               java/io/Closeable
  #668 = Class              #667          // java/io/Closeable
  #669 = Utf8               read
  #670 = Utf8               ([B)I
  #671 = NameAndType        #669:#670     // read:([B)I
  #672 = Methodref          #661.#671     // java/io/RandomAccessFile.read:([B)I
  #673 = Utf8               java/nio/ByteBuffer
  #674 = Class              #673          // java/nio/ByteBuffer
  #675 = Utf8               wrap
  #676 = Utf8               ([B)Ljava/nio/ByteBuffer;
  #677 = NameAndType        #675:#676     // wrap:([B)Ljava/nio/ByteBuffer;
  #678 = Methodref          #674.#677     // java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
  #679 = Utf8               java/nio/ByteOrder
  #680 = Class              #679          // java/nio/ByteOrder
  #681 = Utf8               LITTLE_ENDIAN
  #682 = Utf8               Ljava/nio/ByteOrder;
  #683 = NameAndType        #681:#682     // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #684 = Fieldref           #680.#683     // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #685 = Utf8               order
  #686 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #687 = NameAndType        #685:#686     // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #688 = Methodref          #674.#687     // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #689 = Utf8               getLong
  #690 = NameAndType        #689:#441     // getLong:()J
  #691 = Methodref          #674.#690     // java/nio/ByteBuffer.getLong:()J
  #692 = Utf8               getShort
  #693 = Utf8               ()S
  #694 = NameAndType        #692:#693     // getShort:()S
  #695 = Methodref          #674.#694     // java/nio/ByteBuffer.getShort:()S
  #696 = Long               5490523817655992320l
  #698 = Utf8               MAGIC_INVALIDO (esperado: 5490523817655992320, obtido: \u0001)
  #699 = String             #698          // MAGIC_INVALIDO (esperado: 5490523817655992320, obtido: \u0001)
  #700 = Utf8               (J)Ljava/lang/String;
  #701 = NameAndType        #95:#700      // makeConcatWithConstants:(J)Ljava/lang/String;
  #702 = InvokeDynamic      #10:#701      // #10:makeConcatWithConstants:(J)Ljava/lang/String;
  #703 = Utf8               VERSAO_INVALIDA (esperado: 5, obtido: \u0001)
  #704 = String             #703          // VERSAO_INVALIDA (esperado: 5, obtido: \u0001)
  #705 = Utf8               (S)Ljava/lang/String;
  #706 = NameAndType        #95:#705      // makeConcatWithConstants:(S)Ljava/lang/String;
  #707 = InvokeDynamic      #11:#706      // #11:makeConcatWithConstants:(S)Ljava/lang/String;
  #708 = Utf8               OK - Magic e Versão corretos
  #709 = String             #708          // OK - Magic e Versão corretos
  #710 = Utf8               kotlin/io/CloseableKt
  #711 = Class              #710          // kotlin/io/CloseableKt
  #712 = Utf8               closeFinally
  #713 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #714 = NameAndType        #712:#713     // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #715 = Methodref          #711.#714     // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #716 = Utf8               ERRO_LEITURA: \u0001
  #717 = String             #716          // ERRO_LEITURA: \u0001
  #718 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #719 = NameAndType        #95:#718      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #720 = InvokeDynamic      #12:#719      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #721 = Utf8               $i$a$-use-GeoEngineBridge$verifyL2BRFile$1
  #722 = Utf8               buffer
  #723 = Utf8               [B
  #724 = Utf8               bb
  #725 = Utf8               Ljava/nio/ByteBuffer;
  #726 = Utf8               magic
  #727 = Utf8               version
  #728 = Utf8               S
  #729 = Utf8               raf
  #730 = Utf8               Ljava/io/RandomAccessFile;
  #731 = Utf8               filePath
  #732 = Class              #723          // "[B"
  #733 = Utf8               reloadRegion
  #734 = Utf8               [L2BR] Tentando carregar: \u0001
  #735 = String             #734          // [L2BR] Tentando carregar: \u0001
  #736 = InvokeDynamic      #13:#101      // #13:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #737 = Utf8               out
  #738 = Utf8               Ljava/io/PrintStream;
  #739 = NameAndType        #737:#738     // out:Ljava/io/PrintStream;
  #740 = Fieldref           #439.#739     // java/lang/System.out:Ljava/io/PrintStream;
  #741 = Utf8               java/io/PrintStream
  #742 = Class              #741          // java/io/PrintStream
  #743 = Utf8               println
  #744 = NameAndType        #743:#553     // println:(Ljava/lang/Object;)V
  #745 = Methodref          #742.#744     // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #746 = Utf8               java/io/FileNotFoundException
  #747 = Class              #746          // java/io/FileNotFoundException
  #748 = Utf8               Arquivo não encontrado: \u0001
  #749 = String             #748          // Arquivo não encontrado: \u0001
  #750 = InvokeDynamic      #14:#101      // #14:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #751 = NameAndType        #5:#104       // "<init>":(Ljava/lang/String;)V
  #752 = Methodref          #747.#751     // java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
  #753 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #754 = Class              #753          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #755 = Methodref          #754.#7       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer."<init>":()V
  #756 = Utf8               deserialize
  #757 = Utf8               (Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #758 = NameAndType        #756:#757     // deserialize:(Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #759 = Methodref          #754.#758     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.deserialize:(Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #760 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  #761 = Class              #760          // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  #762 = Utf8               getRegionX
  #763 = NameAndType        #762:#188     // getRegionX:()I
  #764 = Methodref          #761.#763     // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionX:()I
  #765 = Utf8               getRegionY
  #766 = NameAndType        #765:#188     // getRegionY:()I
  #767 = Methodref          #761.#766     // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionY:()I
  #768 = Utf8               getNodes
  #769 = NameAndType        #768:#585     // getNodes:()Ljava/util/Map;
  #770 = Methodref          #761.#769     // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
  #771 = Utf8               [L2BR] Região \u0001_\u0001 carregada: \u0001 nós
  #772 = String             #771          // [L2BR] Região \u0001_\u0001 carregada: \u0001 nós
  #773 = Utf8               (III)Ljava/lang/String;
  #774 = NameAndType        #95:#773      // makeConcatWithConstants:(III)Ljava/lang/String;
  #775 = InvokeDynamic      #15:#774      // #15:makeConcatWithConstants:(III)Ljava/lang/String;
  #776 = Long               64l
  #778 = Long               32l
  #780 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  #781 = Class              #780          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  #782 = Utf8               (JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #783 = NameAndType        #5:#782       // "<init>":(JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #784 = Methodref          #781.#783     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader."<init>":(JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #785 = Utf8               create
  #786 = Utf8               (Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #787 = NameAndType        #785:#786     // create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #788 = Methodref          #326.#787     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #789 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  #790 = Class              #789          // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  #791 = Methodref          #790.#7       // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder."<init>":()V
  #792 = Utf8               values
  #793 = Utf8               ()Ljava/util/Collection;
  #794 = NameAndType        #792:#793     // values:()Ljava/util/Collection;
  #795 = InterfaceMethodref #359.#794     // java/util/Map.values:()Ljava/util/Collection;
  #796 = Utf8               throwIndexOverflow
  #797 = NameAndType        #796:#6       // throwIndexOverflow:()V
  #798 = Methodref          #283.#797     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #799 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  #800 = Class              #799          // ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  #801 = Utf8               getX
  #802 = NameAndType        #801:#188     // getX:()I
  #803 = Methodref          #800.#802     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getX:()I
  #804 = Utf8               getY
  #805 = NameAndType        #804:#188     // getY:()I
  #806 = Methodref          #800.#805     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getY:()I
  #807 = Utf8               getZ
  #808 = NameAndType        #807:#188     // getZ:()I
  #809 = Methodref          #800.#808     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getZ:()I
  #810 = Utf8               setPosition
  #811 = Utf8               (IIS)V
  #812 = NameAndType        #810:#811     // setPosition:(IIS)V
  #813 = Methodref          #790.#812     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setPosition:(IIS)V
  #814 = Utf8               isWalkable
  #815 = NameAndType        #814:#88      // isWalkable:()Z
  #816 = Methodref          #800.#815     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.isWalkable:()Z
  #817 = Utf8               setWalkable
  #818 = Utf8               (Z)V
  #819 = NameAndType        #817:#818     // setWalkable:(Z)V
  #820 = Methodref          #790.#819     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setWalkable:(Z)V
  #821 = Utf8               setJpsDistances
  #822 = NameAndType        #821:#385     // setJpsDistances:(I)V
  #823 = Methodref          #790.#822     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setJpsDistances:(I)V
  #824 = Utf8               setSuccessorOffset
  #825 = NameAndType        #824:#385     // setSuccessorOffset:(I)V
  #826 = Methodref          #790.#825     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setSuccessorOffset:(I)V
  #827 = Utf8               setSuccessorCount
  #828 = NameAndType        #827:#385     // setSuccessorCount:(I)V
  #829 = Methodref          #790.#828     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setSuccessorCount:(I)V
  #830 = Utf8               setClusterId
  #831 = NameAndType        #830:#385     // setClusterId:(I)V
  #832 = Methodref          #790.#831     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setClusterId:(I)V
  #833 = Utf8               getSegment
  #834 = Utf8               ()Ljava/lang/foreign/MemorySegment;
  #835 = NameAndType        #833:#834     // getSegment:()Ljava/lang/foreign/MemorySegment;
  #836 = Methodref          #321.#835     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getSegment:()Ljava/lang/foreign/MemorySegment;
  #837 = Utf8               writeTo
  #838 = Utf8               (Ljava/lang/foreign/MemorySegment;J)V
  #839 = NameAndType        #837:#838     // writeTo:(Ljava/lang/foreign/MemorySegment;J)V
  #840 = Methodref          #790.#839     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.writeTo:(Ljava/lang/foreign/MemorySegment;J)V
  #841 = Utf8               [L2BR] Região [\u0001, \u0001] carregada com sucesso!
  #842 = String             #841          // [L2BR] Região [\u0001, \u0001] carregada com sucesso!
  #843 = InvokeDynamic      #16:#230      // #16:makeConcatWithConstants:(II)Ljava/lang/String;
  #844 = Utf8               [L2BR] ERRO ao carregar região: \u0001
  #845 = String             #844          // [L2BR] ERRO ao carregar região: \u0001
  #846 = InvokeDynamic      #17:#719      // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #847 = Utf8               printStackTrace
  #848 = NameAndType        #847:#6       // printStackTrace:()V
  #849 = Methodref          #184.#848     // java/lang/Exception.printStackTrace:()V
  #850 = Utf8               $i$a$-forEachIndexed-GeoEngineBridge$reloadRegion$1
  #851 = Utf8               nodeOffset
  #852 = Utf8               index
  #853 = Utf8               node
  #854 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #855 = Utf8               item$iv
  #856 = Utf8               $i$f$forEachIndexed
  #857 = Utf8               index$iv
  #858 = Utf8               $this$forEachIndexed$iv
  #859 = Utf8               serializer
  #860 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #861 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #862 = Utf8               storageSize
  #863 = Utf8               builder
  #864 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
  #865 = Utf8               updateConfig
  #866 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)V
  #867 = Utf8               Configuração atualizada: \u0001
  #868 = String             #867          // Configuração atualizada: \u0001
  #869 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)Ljava/lang/String;
  #870 = NameAndType        #95:#869      // makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)Ljava/lang/String;
  #871 = InvokeDynamic      #18:#870      // #18:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)Ljava/lang/String;
  #872 = Utf8               newConfig
  #873 = Utf8               getConfig
  #874 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #875 = Utf8               unloadAll
  #876 = Methodref          #26.#794      // java/util/concurrent/ConcurrentHashMap.values:()Ljava/util/Collection;
  #877 = Utf8               clear
  #878 = NameAndType        #877:#6       // clear:()V
  #879 = Methodref          #26.#878      // java/util/concurrent/ConcurrentHashMap.clear:()V
  #880 = Utf8               Todas as regiões L2BR descarregadas
  #881 = String             #880          // Todas as regiões L2BR descarregadas
  #882 = Utf8               $i$a$-forEach-GeoEngineBridge$unloadAll$1
  #883 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #884 = Utf8               Lkotlin/jvm/JvmStatic;
  #885 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
  #886 = NameAndType        #118:#885     // Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
  #887 = Fieldref           #2.#886       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
  #888 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
  #889 = Class              #888          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
  #890 = NameAndType        #124:#883     // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #891 = Methodref          #889.#890     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #892 = Utf8               access$getINSTANCE$cp
  #893 = NameAndType        #142:#67      // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #894 = Fieldref           #2.#893       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #895 = Utf8               access$getLogger$p
  #896 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
  #897 = Utf8               $this
  #898 = Utf8               <clinit>
  #899 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #900 = NameAndType        #5:#899       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #901 = Methodref          #889.#900     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #902 = Methodref          #2.#7         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge."<init>":()V
  #903 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;>;
  #904 = Utf8               Lkotlin/Metadata;
  #905 = Utf8               mv
  #906 = Integer            2
  #907 = Integer            3
  #908 = Integer            0
  #909 = Utf8               k
  #910 = Integer            1
  #911 = Utf8               xi
  #912 = Integer            48
  #913 = Utf8               d1
  #914 = Utf8               \u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 R2\u00020\u0001:\u0004PQRSB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\"\u0010 \u001a\u00020\u00162\u001a\b\u0002\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0#0\"J \u0010$\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u000eH\u0002J\u001a\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0#0\"H\u0002JR\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001J6\u00101\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001eJ^\u00102\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0006\u00105\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001J\u001e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001eJB\u0010<\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0001J\u000e\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0001J\u001a\u0010@\u001a\u0004\u0018\u00010\f2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001eH\u0002J\"\u0010A\u001a\u0002HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0082\b¢\u0006\u0002\u0010EJ\"\u0010F\u001a\u0002HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0082\b¢\u0006\u0002\u0010EJ\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00010HJ\u0016\u0010J\u001a\u00020I2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010K\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T
  #915 = Utf8               d2
  #916 = Utf8               kotlin.jvm.PlatformType
  #917 = Utf8               Lkotlin/Pair;
  #918 = Utf8               T
  #919 = Utf8               Lkotlin/Function0;
  #920 = Utf8               BridgeConfig
  #921 = Utf8               Metrics
  #922 = Utf8               GeoEngineInterface
  #923 = Utf8               Brproject
  #924 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #925 = Class              #924          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #926 = Utf8               EngineMetricsSnapshot
  #927 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #928 = Class              #927          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #929 = Utf8               GeoDataProvider
  #930 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
  #931 = Class              #930          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
  #932 = Utf8               SourcePriority
  #933 = Utf8               RegionKey
  #934 = Utf8               Entry
  #935 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #936 = Class              #935          // kotlin/jvm/internal/Ref$IntRef
  #937 = Utf8               kotlin/jvm/internal/Ref
  #938 = Class              #937          // kotlin/jvm/internal/Ref
  #939 = Utf8               IntRef
  #940 = Utf8               GeoEngineBridge.kt
  #941 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #942 = Utf8               value
  #943 = Utf8               SMAP\nGeoEngineBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngineBridge.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,441:1\n305#1,7:454\n295#1,7:461\n305#1,7:468\n295#1,7:475\n305#1,7:482\n1915#2,2:442\n1391#2:444\n1480#2,2:445\n1586#2:447\n1661#2,3:448\n1482#2,3:451\n1924#2,3:493\n1915#2,2:496\n129#3:489\n158#3,3:490\n*S KotlinDebug\n*F\n+ 1 GeoEngineBridge.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge\n*L\n213#1:454,7\n225#1:461,7\n230#1:468,7\n242#1:475,7\n246#1:482,7\n151#1:442,2\n200#1:444\n200#1:445,2\n201#1:447\n201#1:448,3\n200#1:451,3\n396#1:493,3\n433#1:496,2\n327#1:489\n327#1:490,3\n*E\n
  #944 = Utf8               RuntimeInvisibleAnnotations
  #945 = Utf8               Signature
  #946 = Utf8               Code
  #947 = Utf8               LineNumberTable
  #948 = Utf8               LocalVariableTable
  #949 = Utf8               RuntimeInvisibleParameterAnnotations
  #950 = Utf8               StackMapTable
  #951 = Utf8               RuntimeVisibleAnnotations
  #952 = Utf8               InnerClasses
  #953 = Utf8               SourceFile
  #954 = Utf8               SourceDebugExtension
  #955 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull

  public final void initialize(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$GeoEngineInterface);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
         5: aload_0
         6: iconst_1
         7: putfield      #78                 // Field _initialized:Z
        10: aload_0
        11: getfield      #47                 // Field basePath:Ljava/nio/file/Path;
        14: invokeinterface #84,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        19: invokevirtual #90                 // Method java/io/File.mkdirs:()Z
        22: pop
        23: aload_0
        24: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
        27: aload_0
        28: getfield      #47                 // Field basePath:Ljava/nio/file/Path;
        31: invokedynamic #102,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        36: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        39: return
      LineNumberTable:
        line 112: 0
        line 113: 5
        line 115: 10
        line 117: 23
        line 118: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      40     1 legacy   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #70()
          org.jetbrains.annotations.NotNull

  public final boolean isInitialized();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _initialized:Z
         4: ireturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;

  public final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands getAdminCommands();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=5, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _initialized:Z
         4: ifne          9
         7: aconst_null
         8: areturn
         9: aload_0
        10: getfield      #115                // Field _adminCommands:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        13: ifnonnull     88
        16: aload_0
        17: astore_1
        18: aload_1
        19: monitorenter
        20: nop
        21: iconst_0
        22: istore_2
        23: aload_0
        24: getfield      #115                // Field _adminCommands:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        27: ifnonnull     73
        30: getstatic     #121                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        33: invokevirtual #127                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        36: astore_3
        37: new           #129                // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
        40: dup
        41: aload_3
        42: aconst_null
        43: aconst_null
        44: aconst_null
        45: bipush        14
        47: aconst_null
        48: invokespecial #132                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider."<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        51: astore        4
        53: aload_0
        54: new           #134                // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
        57: dup
        58: aload_0
        59: aload         4
        61: checkcast     #136                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
        64: aconst_null
        65: iconst_4
        66: aconst_null
        67: invokespecial #139                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        70: putfield      #115                // Field _adminCommands:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        73: nop
        74: getstatic     #145                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        77: astore_2
        78: aload_1
        79: monitorexit
        80: goto          88
        83: astore_3
        84: aload_1
        85: monitorexit
        86: aload_3
        87: athrow
        88: aload_0
        89: getfield      #115                // Field _adminCommands:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        92: areturn
      Exception table:
         from    to  target type
            20    78    83   any
            83    84    83   any
      StackMapTable: number_of_entries = 4
        frame_type = 9 /* same */
        frame_type = 253 /* append */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge ]
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
      LineNumberTable:
        line 125: 0
        line 126: 9
        line 127: 16
        line 128: 23
        line 129: 30
        line 130: 37
        line 131: 53
        line 133: 73
        line 127: 77
        line 135: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      36     3   geo   Lext/mods/gameserver/geoengine/GeoEngine;
           53      20     4 provider   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
           23      51     2 $i$a$-synchronized-GeoEngineBridge$getAdminCommands$1   I
            0      93     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    RuntimeInvisibleAnnotations:
      0: #111()
        org.jetbrains.annotations.Nullable

  public final void unloadRegion(int, int);
    descriptor: (II)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: new           #157                // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #159                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey."<init>":(II)V
         9: astore_3
        10: aload_0
        11: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
        14: aload_3
        15: invokevirtual #162                // Method java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        18: checkcast     #164                // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
        21: dup
        22: ifnull        31
        25: invokevirtual #167                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.close:()V
        28: goto          32
        31: pop
        32: aload_0
        33: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
        36: aload_3
        37: invokevirtual #170                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        40: pop
        41: aload_0
        42: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
        45: aload_3
        46: invokedynamic #175,  0            // InvokeDynamic #1:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;)Ljava/lang/String;
        51: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        54: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 138: 0
        line 139: 10
        line 140: 32
        line 141: 41
        line 142: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           10      45     3   key   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
            0      55     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      55     1 regionX   I
            0      55     2 regionY   I

  public final void loadL2BRRegions(java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=16, args_size=2
         0: aload_0
         1: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
         4: aload_1
         5: invokeinterface #190,  1          // InterfaceMethod java/util/List.size:()I
        10: invokedynamic #195,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        15: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        18: iconst_0
        19: istore_2
        20: iconst_0
        21: istore_3
        22: new           #197                // class java/util/ArrayList
        25: dup
        26: invokespecial #198                // Method java/util/ArrayList."<init>":()V
        29: checkcast     #186                // class java/util/List
        32: astore        4
        34: aload_1
        35: checkcast     #200                // class java/lang/Iterable
        38: astore        5
        40: iconst_0
        41: istore        6
        43: aload         5
        45: invokeinterface #204,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        50: astore        7
        52: aload         7
        54: invokeinterface #209,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          235
        62: aload         7
        64: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        69: astore        8
        71: aload         8
        73: checkcast     #215                // class kotlin/Pair
        76: astore        9
        78: iconst_0
        79: istore        10
        81: aload         9
        83: invokevirtual #218                // Method kotlin/Pair.component1:()Ljava/lang/Object;
        86: checkcast     #220                // class java/lang/Number
        89: invokevirtual #223                // Method java/lang/Number.intValue:()I
        92: istore        11
        94: aload         9
        96: invokevirtual #226                // Method kotlin/Pair.component2:()Ljava/lang/Object;
        99: checkcast     #220                // class java/lang/Number
       102: invokevirtual #223                // Method java/lang/Number.intValue:()I
       105: istore        12
       107: aload_0
       108: getfield      #47                 // Field basePath:Ljava/nio/file/Path;
       111: iload         11
       113: iload         12
       115: invokedynamic #231,  0            // InvokeDynamic #3:makeConcatWithConstants:(II)Ljava/lang/String;
       120: invokeinterface #235,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       125: astore        13
       127: aload         13
       129: invokeinterface #84,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
       134: invokevirtual #238                // Method java/io/File.exists:()Z
       137: ifeq          214
       140: nop
       141: aload_0
       142: iload         11
       144: iload         12
       146: aload         13
       148: invokespecial #242                // Method loadL2BREngine:(IILjava/nio/file/Path;)V
       151: iload_2
       152: iconst_1
       153: iadd
       154: istore_2
       155: aload         4
       157: iload         11
       159: iload         12
       161: invokedynamic #245,  0            // InvokeDynamic #4:makeConcatWithConstants:(II)Ljava/lang/String;
       166: invokeinterface #249,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       171: invokestatic  #255                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       174: astore        14
       176: goto          230
       179: astore        15
       181: iload_3
       182: iconst_1
       183: iadd
       184: istore_3
       185: aload_0
       186: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
       189: iload         11
       191: iload         12
       193: aload         15
       195: invokevirtual #258                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       198: invokedynamic #263,  0            // InvokeDynamic #5:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
       203: invokevirtual #266                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
       206: getstatic     #145                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       209: astore        14
       211: goto          230
       214: aload_0
       215: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
       218: iload         11
       220: iload         12
       222: invokedynamic #269,  0            // InvokeDynamic #6:makeConcatWithConstants:(II)Ljava/lang/String;
       227: invokevirtual #272                // Method java/util/logging/Logger.fine:(Ljava/lang/String;)V
       230: nop
       231: nop
       232: goto          52
       235: nop
       236: aload         4
       238: checkcast     #274                // class java/util/Collection
       241: invokeinterface #277,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       246: ifne          253
       249: iconst_1
       250: goto          254
       253: iconst_0
       254: ifeq          286
       257: aload_0
       258: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
       261: aload         4
       263: checkcast     #200                // class java/lang/Iterable
       266: ldc_w         #279                // String ,
       269: checkcast     #281                // class java/lang/CharSequence
       272: aconst_null
       273: aconst_null
       274: iconst_0
       275: aconst_null
       276: aconst_null
       277: bipush        62
       279: aconst_null
       280: invokestatic  #287                // Method kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
       283: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       286: aload_0
       287: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
       290: iload_2
       291: aload_1
       292: invokeinterface #190,  1          // InterfaceMethod java/util/List.size:()I
       297: iload_2
       298: isub
       299: iload_3
       300: isub
       301: iload_3
       302: ifle          314
       305: iload_3
       306: invokedynamic #290,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
       311: goto          317
       314: ldc_w         #292                // String
       317: invokedynamic #295,  0            // InvokeDynamic #8:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
       322: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       325: return
      Exception table:
         from    to  target type
           140   176   179   Class java/lang/Exception
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class java/util/List, int, int, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 126
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class java/util/List, int, int, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator, class java/lang/Object, class kotlin/Pair, int, int, int, class java/nio/file/Path ]
          stack = [ class java/lang/Exception ]
        frame_type = 34 /* same */
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class java/util/List, int, int, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class java/util/List, int, int, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = [ class java/util/logging/Logger, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, class java/util/List, int, int, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = [ class java/util/logging/Logger, int, int, class java/lang/String ]
      LineNumberTable:
        line 145: 0
        line 147: 18
        line 148: 20
        line 149: 22
        line 149: 32
        line 151: 34
        line 442: 43
        line 152: 107
        line 154: 127
        line 155: 140
        line 156: 141
        line 157: 151
        line 158: 155
        line 159: 179
        line 160: 181
        line 161: 185
        line 164: 214
        line 166: 230
        line 442: 231
        line 443: 235
        line 168: 236
        line 168: 254
        line 169: 257
        line 172: 286
        line 173: 301
        line 172: 322
        line 174: 325
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          181      30    15     e   Ljava/lang/Exception;
          127     103    13  path   Ljava/nio/file/Path;
           81     150    10 $i$a$-forEach-GeoEngineBridge$loadL2BRRegions$1   I
           94     137    11    rx   I
          107     124    12    ry   I
           71     161     8 element$iv   Ljava/lang/Object;
           43     193     6 $i$f$forEach   I
           40     196     5 $this$forEach$iv   Ljava/lang/Iterable;
           20     306     2 loaded   I
           22     304     3 failed   I
           34     292     4 loadedRegions   Ljava/util/List;
            0     326     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0     326     1 regions   Ljava/util/List;
    Signature: #182                         // (Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #70()
          org.jetbrains.annotations.NotNull

  public static void loadL2BRRegions$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, java.util.List, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Ljava/util/List;ILjava/lang/Object;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          11
         6: aload_0
         7: invokespecial #317                // Method discoverRegions:()Ljava/util/List;
        10: astore_1
        11: aload_0
        12: aload_1
        13: invokevirtual #319                // Method loadL2BRRegions:(Ljava/util/List;)V
        16: return
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
      LineNumberTable:
        line 144: 0

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> findPath(int, int, int, int, int, int, boolean, java.lang.Object);
    descriptor: (IIIIIIZLjava/lang/Object;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=21, args_size=9
         0: aload_0
         1: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
         4: invokevirtual #424                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getGlobalEnabled:()Z
         7: ifne          153
        10: aload_0
        11: astore        9
        13: iconst_0
        14: istore        10
        16: aload         9
        18: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
        21: invokevirtual #427                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
        24: ifne          67
        27: iconst_0
        28: istore        11
        30: aload_0
        31: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
        34: dup
        35: ifnonnull     46
        38: pop
        39: ldc_w         #428                // String legacyEngine
        42: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        45: aconst_null
        46: iload_1
        47: iload_2
        48: iload_3
        49: iload         4
        51: iload         5
        53: iload         6
        55: iload         7
        57: aload         8
        59: invokeinterface #437,  9          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
        64: goto          152
        67: invokestatic  #443                // Method java/lang/System.nanoTime:()J
        70: lstore        12
        72: iconst_0
        73: istore        11
        75: aload_0
        76: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
        79: dup
        80: ifnonnull     91
        83: pop
        84: ldc_w         #428                // String legacyEngine
        87: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        90: aconst_null
        91: iload_1
        92: iload_2
        93: iload_3
        94: iload         4
        96: iload         5
        98: iload         6
       100: iload         7
       102: aload         8
       104: invokeinterface #437,  9          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
       109: astore        14
       111: aload         14
       113: astore        15
       115: iconst_0
       116: istore        16
       118: aload         9
       120: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       123: invokevirtual #447                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyCalls:()Ljava/util/concurrent/atomic/AtomicLong;
       126: invokevirtual #452                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       129: pop2
       130: aload         9
       132: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       135: invokevirtual #455                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       138: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       141: lload         12
       143: lsub
       144: invokevirtual #459                // Method java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
       147: pop2
       148: nop
       149: aload         14
       151: nop
       152: areturn
       153: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
       156: dup
       157: iload_1
       158: iload_2
       159: iload_3
       160: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
       163: astore        9
       165: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
       168: dup
       169: iload         4
       171: iload         5
       173: iload         6
       175: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
       178: astore        10
       180: aload_0
       181: iload_1
       182: iload_2
       183: invokespecial #468                // Method getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
       186: astore        11
       188: aload_0
       189: iload         4
       191: iload         5
       193: invokespecial #468                // Method getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
       196: astore        12
       198: aload         11
       200: ifnull        310
       203: aload         12
       205: ifnull        310
       208: aload         11
       210: aload         12
       212: if_acmpne     310
       215: aload_0
       216: astore        13
       218: iconst_0
       219: istore        14
       221: aload         13
       223: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
       226: invokevirtual #427                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
       229: ifne          247
       232: iconst_0
       233: istore        15
       235: aload         11
       237: aload         9
       239: aload         10
       241: invokevirtual #471                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
       244: goto          479
       247: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       250: lstore        16
       252: iconst_0
       253: istore        15
       255: aload         11
       257: aload         9
       259: aload         10
       261: invokevirtual #471                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
       264: astore        18
       266: aload         18
       268: astore        19
       270: iconst_0
       271: istore        20
       273: aload         13
       275: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       278: invokevirtual #474                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brCalls:()Ljava/util/concurrent/atomic/AtomicLong;
       281: invokevirtual #452                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       284: pop2
       285: aload         13
       287: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       290: invokevirtual #477                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       293: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       296: lload         16
       298: lsub
       299: invokevirtual #459                // Method java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
       302: pop2
       303: nop
       304: aload         18
       306: nop
       307: goto          479
       310: aload_0
       311: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
       314: invokevirtual #480                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getFallbackToLegacy:()Z
       317: ifeq          476
       320: aload_0
       321: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       324: invokevirtual #483                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getFallbackCalls:()Ljava/util/concurrent/atomic/AtomicLong;
       327: invokevirtual #452                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       330: pop2
       331: aload_0
       332: astore        13
       334: iconst_0
       335: istore        14
       337: aload         13
       339: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
       342: invokevirtual #427                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
       345: ifne          388
       348: iconst_0
       349: istore        15
       351: aload_0
       352: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
       355: dup
       356: ifnonnull     367
       359: pop
       360: ldc_w         #428                // String legacyEngine
       363: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
       366: aconst_null
       367: iload_1
       368: iload_2
       369: iload_3
       370: iload         4
       372: iload         5
       374: iload         6
       376: iload         7
       378: aload         8
       380: invokeinterface #437,  9          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
       385: goto          479
       388: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       391: lstore        16
       393: iconst_0
       394: istore        15
       396: aload_0
       397: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
       400: dup
       401: ifnonnull     412
       404: pop
       405: ldc_w         #428                // String legacyEngine
       408: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
       411: aconst_null
       412: iload_1
       413: iload_2
       414: iload_3
       415: iload         4
       417: iload         5
       419: iload         6
       421: iload         7
       423: aload         8
       425: invokeinterface #437,  9          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
       430: astore        18
       432: aload         18
       434: astore        19
       436: iconst_0
       437: istore        20
       439: aload         13
       441: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       444: invokevirtual #447                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyCalls:()Ljava/util/concurrent/atomic/AtomicLong;
       447: invokevirtual #452                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       450: pop2
       451: aload         13
       453: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       456: invokevirtual #455                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       459: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       462: lload         16
       464: lsub
       465: invokevirtual #459                // Method java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
       468: pop2
       469: nop
       470: aload         18
       472: nop
       473: goto          479
       476: invokestatic  #486                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       479: areturn
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 250 /* chop */
          offset_delta = 20
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, long ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int ]
          stack = [ class java/util/List ]
        frame_type = 248 /* chop */
          offset_delta = 0
        frame_type = 255 /* full_frame */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 62
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 250 /* chop */
          offset_delta = 20
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, long ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, int, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
      LineNumberTable:
        line 212: 0
        line 213: 10
        line 454: 16
        line 214: 30
        line 454: 64
        line 456: 67
        line 457: 72
        line 214: 75
        line 457: 109
        line 458: 118
        line 459: 130
        line 460: 148
        line 457: 149
        line 457: 151
        line 213: 152
        line 218: 153
        line 219: 165
        line 221: 180
        line 222: 188
        line 224: 198
        line 225: 215
        line 461: 221
        line 226: 235
        line 461: 244
        line 463: 247
        line 464: 252
        line 226: 255
        line 464: 264
        line 465: 273
        line 466: 285
        line 467: 303
        line 464: 304
        line 464: 306
        line 228: 310
        line 229: 320
        line 230: 331
        line 468: 337
        line 231: 351
        line 468: 385
        line 470: 388
        line 471: 393
        line 231: 396
        line 471: 430
        line 472: 439
        line 473: 451
        line 474: 469
        line 471: 470
        line 471: 472
        line 234: 476
        line 224: 479
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      34    11 $i$a$-measureLegacy-GeoEngineBridge$findPath$1   I
           75      34    11 $i$a$-measureLegacy-GeoEngineBridge$findPath$1   I
          118      31    16 $i$a$-also-GeoEngineBridge$measureLegacy$1$iv   I
          115      34    15 it$iv   Ljava/lang/Object;
           16     136    10 $i$f$measureLegacy   I
           72      80    12 start$iv   J
           13     139     9 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
          235       9    15 $i$a$-measureL2BR-GeoEngineBridge$findPath$2   I
          255       9    15 $i$a$-measureL2BR-GeoEngineBridge$findPath$2   I
          273      31    20 $i$a$-also-GeoEngineBridge$measureL2BR$1$iv   I
          270      34    19 it$iv   Ljava/lang/Object;
          221      86    14 $i$f$measureL2BR   I
          252      55    16 start$iv   J
          218      89    13 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
          351      34    15 $i$a$-measureLegacy-GeoEngineBridge$findPath$3   I
          396      34    15 $i$a$-measureLegacy-GeoEngineBridge$findPath$3   I
          439      31    20 $i$a$-also-GeoEngineBridge$measureLegacy$1$iv   I
          436      34    19 it$iv   Ljava/lang/Object;
          337     136    14 $i$f$measureLegacy   I
          393      80    16 start$iv   J
          334     139    13 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
          165     315     9 startLoc   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
          180     300    10 endLoc   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
          188     292    11 startL2BR   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
          198     282    12 endL2BR   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     480     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0     480     1    ox   I
            0     480     2    oy   I
            0     480     3    oz   I
            0     480     4    tx   I
            0     480     5    ty   I
            0     480     6    tz   I
            0     480     7 playable   Z
            0     480     8 debug   Ljava/lang/Object;
    Signature: #421                         // (IIIIIIZLjava/lang/Object;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #111()
          org.jetbrains.annotations.Nullable

  public static java.util.List findPath$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, int, int, int, int, int, int, boolean, java.lang.Object, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIIZLjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=11, args_size=11
         0: iload         9
         2: bipush        64
         4: iand
         5: ifeq          11
         8: iconst_0
         9: istore        7
        11: iload         9
        13: sipush        128
        16: iand
        17: ifeq          23
        20: aconst_null
        21: astore        8
        23: aload_0
        24: iload_1
        25: iload_2
        26: iload_3
        27: iload         4
        29: iload         5
        31: iload         6
        33: iload         7
        35: aload         8
        37: invokevirtual #513                // Method findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
        40: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 11 /* same */
      LineNumberTable:
        line 205: 0
        line 208: 8
        line 205: 11
        line 209: 20
        line 205: 23

  public final boolean canMove(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=16, args_size=7
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #468                // Method getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         6: astore        7
         8: aload         7
        10: ifnull        159
        13: aload         7
        15: aload_0
        16: iload         4
        18: iload         5
        20: invokespecial #468                // Method getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
        23: if_acmpne     159
        26: aload_0
        27: astore        8
        29: iconst_0
        30: istore        9
        32: aload         8
        34: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
        37: invokevirtual #427                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
        40: ifne          77
        43: iconst_0
        44: istore        10
        46: aload         7
        48: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        51: dup
        52: iload_1
        53: iload_2
        54: iload_3
        55: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        58: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        61: dup
        62: iload         4
        64: iload         5
        66: iload         6
        68: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        71: invokevirtual #518                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.canMove:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
        74: goto          293
        77: invokestatic  #443                // Method java/lang/System.nanoTime:()J
        80: lstore        11
        82: iconst_0
        83: istore        10
        85: aload         7
        87: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        90: dup
        91: iload_1
        92: iload_2
        93: iload_3
        94: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        97: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
       100: dup
       101: iload         4
       103: iload         5
       105: iload         6
       107: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
       110: invokevirtual #518                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.canMove:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
       113: istore        13
       115: iload         13
       117: istore        14
       119: iconst_0
       120: istore        15
       122: aload         8
       124: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       127: invokevirtual #474                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brCalls:()Ljava/util/concurrent/atomic/AtomicLong;
       130: invokevirtual #452                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       133: pop2
       134: aload         8
       136: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       139: invokevirtual #477                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       142: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       145: lload         11
       147: lsub
       148: invokevirtual #459                // Method java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
       151: pop2
       152: nop
       153: iload         13
       155: nop
       156: goto          293
       159: aload_0
       160: astore        8
       162: iconst_0
       163: istore        9
       165: aload         8
       167: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
       170: invokevirtual #427                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
       173: ifne          212
       176: iconst_0
       177: istore        10
       179: aload_0
       180: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
       183: dup
       184: ifnonnull     195
       187: pop
       188: ldc_w         #428                // String legacyEngine
       191: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
       194: aconst_null
       195: iload_1
       196: iload_2
       197: iload_3
       198: iload         4
       200: iload         5
       202: iload         6
       204: invokeinterface #520,  7          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.canMove:(IIIIII)Z
       209: goto          293
       212: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       215: lstore        11
       217: iconst_0
       218: istore        10
       220: aload_0
       221: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
       224: dup
       225: ifnonnull     236
       228: pop
       229: ldc_w         #428                // String legacyEngine
       232: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
       235: aconst_null
       236: iload_1
       237: iload_2
       238: iload_3
       239: iload         4
       241: iload         5
       243: iload         6
       245: invokeinterface #520,  7          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.canMove:(IIIIII)Z
       250: istore        13
       252: iload         13
       254: istore        14
       256: iconst_0
       257: istore        15
       259: aload         8
       261: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       264: invokevirtual #447                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyCalls:()Ljava/util/concurrent/atomic/AtomicLong;
       267: invokevirtual #452                // Method java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
       270: pop2
       271: aload         8
       273: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       276: invokevirtual #455                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       279: invokestatic  #443                // Method java/lang/System.nanoTime:()J
       282: lload         11
       284: lsub
       285: invokevirtual #459                // Method java/util/concurrent/atomic/AtomicLong.addAndGet:(J)J
       288: pop2
       289: nop
       290: iload         13
       292: nop
       293: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int ]
        frame_type = 249 /* chop */
          offset_delta = 81
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, long ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int ]
          stack = [ int ]
      LineNumberTable:
        line 239: 0
        line 241: 8
        line 242: 26
        line 475: 32
        line 243: 46
        line 475: 74
        line 477: 77
        line 478: 82
        line 243: 85
        line 478: 113
        line 479: 122
        line 480: 134
        line 481: 152
        line 478: 153
        line 478: 155
        line 246: 159
        line 482: 165
        line 247: 179
        line 482: 209
        line 484: 212
        line 485: 217
        line 247: 220
        line 485: 250
        line 486: 259
        line 487: 271
        line 488: 289
        line 485: 290
        line 485: 292
        line 241: 293
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      28    10 $i$a$-measureL2BR-GeoEngineBridge$canMove$1   I
           85      28    10 $i$a$-measureL2BR-GeoEngineBridge$canMove$1   I
          122      31    15 $i$a$-also-GeoEngineBridge$measureL2BR$1$iv   I
          119      34    14 it$iv   Z
           32     124     9 $i$f$measureL2BR   I
           82      74    11 start$iv   J
           29     127     8 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
          179      30    10 $i$a$-measureLegacy-GeoEngineBridge$canMove$2   I
          220      30    10 $i$a$-measureLegacy-GeoEngineBridge$canMove$2   I
          259      31    15 $i$a$-also-GeoEngineBridge$measureLegacy$1$iv   I
          256      34    14 it$iv   Z
          165     128     9 $i$f$measureLegacy   I
          217      76    11 start$iv   J
          162     131     8 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            8     286     7  l2br   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     294     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0     294     1    ox   I
            0     294     2    oy   I
            0     294     3    oz   I
            0     294     4    tx   I
            0     294     5    ty   I
            0     294     6    tz   I

  public final boolean canSee(int, int, int, double, int, int, int, double, java.lang.Object, java.lang.Object);
    descriptor: (IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=13, locals=13, args_size=11
         0: aload_0
         1: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
         4: dup
         5: ifnonnull     16
         8: pop
         9: ldc_w         #428                // String legacyEngine
        12: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        15: aconst_null
        16: iload_1
        17: iload_2
        18: iload_3
        19: dload         4
        21: iload         6
        23: iload         7
        25: iload         8
        27: dload         9
        29: aload         11
        31: aload         12
        33: invokeinterface #527,  13         // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.canSee:(IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
        38: ireturn
      StackMapTable: number_of_entries = 1
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
      LineNumberTable:
        line 258: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      39     1    ox   I
            0      39     2    oy   I
            0      39     3    oz   I
            0      39     4 oheight   D
            0      39     6    tx   I
            0      39     7    ty   I
            0      39     8    tz   I
            0      39     9 theight   D
            0      39    11 ignore   Ljava/lang/Object;
            0      39    12 debug   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
      parameter 8:
        0: #111()
          org.jetbrains.annotations.Nullable
      parameter 9:
        0: #111()
          org.jetbrains.annotations.Nullable

  public static boolean canSee$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, int, int, int, double, int, int, int, double, java.lang.Object, java.lang.Object, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIDIIIDLjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Z
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=13, locals=15, args_size=13
         0: iload         13
         2: sipush        256
         5: iand
         6: ifeq          12
         9: aconst_null
        10: astore        11
        12: iload         13
        14: sipush        512
        17: iand
        18: ifeq          24
        21: aconst_null
        22: astore        12
        24: aload_0
        25: iload_1
        26: iload_2
        27: iload_3
        28: dload         4
        30: iload         6
        32: iload         7
        34: iload         8
        36: dload         9
        38: aload         11
        40: aload         12
        42: invokevirtual #534                // Method canSee:(IIIDIIIDLjava/lang/Object;Ljava/lang/Object;)Z
        45: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 11 /* same */
      LineNumberTable:
        line 252: 0
        line 255: 9
        line 252: 12
        line 256: 21
        line 252: 24

  public final short getHeight(int, int, int);
    descriptor: (III)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #468                // Method getL2BREngineForLocation:(II)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         6: astore        4
         8: aload         4
        10: dup
        11: ifnull        30
        14: new           #461                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        17: dup
        18: iload_1
        19: iload_2
        20: iload_3
        21: invokespecial #464                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        24: invokevirtual #539                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getHeight:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)S
        27: goto          55
        30: pop
        31: aload_0
        32: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
        35: dup
        36: ifnonnull     47
        39: pop
        40: ldc_w         #428                // String legacyEngine
        43: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        46: aconst_null
        47: iload_1
        48: iload_2
        49: iload_3
        50: invokeinterface #541,  4          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.getHeight:(III)S
        55: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine ]
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 262: 0
        line 263: 8
        line 264: 31
        line 263: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      48     4  l2br   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0      56     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      56     1 worldX   I
            0      56     2 worldY   I
            0      56     3 worldZ   I

  public final ext.mods.gameserver.geoengine.pathfinding.model.Location getValidLocation(int, int, int, int, int, int, java.lang.Object);
    descriptor: (IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=8, args_size=8
         0: aload_0
         1: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
         4: dup
         5: ifnonnull     16
         8: pop
         9: ldc_w         #428                // String legacyEngine
        12: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        15: aconst_null
        16: iload_1
        17: iload_2
        18: iload_3
        19: iload         4
        21: iload         5
        23: iload         6
        25: aload         7
        27: invokeinterface #548,  8          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.getValidLocation:(IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
        32: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
      LineNumberTable:
        line 272: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      33     1    ox   I
            0      33     2    oy   I
            0      33     3    oz   I
            0      33     4    tx   I
            0      33     5    ty   I
            0      33     6    tz   I
            0      33     7 debug   Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #111()
          org.jetbrains.annotations.Nullable

  public static ext.mods.gameserver.geoengine.pathfinding.model.Location getValidLocation$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, int, int, int, int, int, int, java.lang.Object, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIILjava/lang/Object;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=10
         0: iload         8
         2: bipush        64
         4: iand
         5: ifeq          11
         8: aconst_null
         9: astore        7
        11: aload_0
        12: iload_1
        13: iload_2
        14: iload_3
        15: iload         4
        17: iload         5
        19: iload         6
        21: aload         7
        23: invokevirtual #551                // Method getValidLocation:(IIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
        26: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
      LineNumberTable:
        line 267: 0
        line 270: 8
        line 267: 11

  public final void addGeoObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
         4: dup
         5: ifnonnull     16
         8: pop
         9: ldc_w         #428                // String legacyEngine
        12: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        15: aconst_null
        16: aload_1
        17: invokeinterface #555,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.addGeoObject:(Ljava/lang/Object;)V
        22: return
      StackMapTable: number_of_entries = 1
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
      LineNumberTable:
        line 276: 0
        line 278: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      23     1   obj   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #70()
          org.jetbrains.annotations.NotNull

  public final void removeGeoObject(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #74                 // Field legacyEngine:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;
         4: dup
         5: ifnonnull     16
         8: pop
         9: ldc_w         #428                // String legacyEngine
        12: invokestatic  #433                // Method kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException:(Ljava/lang/String;)V
        15: aconst_null
        16: aload_1
        17: invokeinterface #559,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface.removeGeoObject:(Ljava/lang/Object;)V
        22: return
      StackMapTable: number_of_entries = 1
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface ]
      LineNumberTable:
        line 281: 0
        line 282: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      23     1   obj   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #70()
          org.jetbrains.annotations.NotNull

  public final java.util.Map<java.lang.String, java.lang.Object> getMetrics();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=24, args_size=1
         0: aload_0
         1: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
         4: invokevirtual #474                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brCalls:()Ljava/util/concurrent/atomic/AtomicLong;
         7: invokevirtual #588                // Method java/util/concurrent/atomic/AtomicLong.get:()J
        10: lstore_1
        11: aload_0
        12: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
        15: invokevirtual #447                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyCalls:()Ljava/util/concurrent/atomic/AtomicLong;
        18: invokevirtual #588                // Method java/util/concurrent/atomic/AtomicLong.get:()J
        21: lstore_3
        22: lload_1
        23: lload_3
        24: ladd
        25: lstore        5
        27: bipush        8
        29: anewarray     #215                // class kotlin/Pair
        32: astore        7
        34: aload         7
        36: iconst_0
        37: ldc_w         #590                // String l2brRegions
        40: aload_0
        41: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
        44: invokevirtual #591                // Method java/util/concurrent/ConcurrentHashMap.size:()I
        47: invokestatic  #392                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        50: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        53: aastore
        54: aload         7
        56: iconst_1
        57: ldc_w         #593                // String l2brCalls
        60: lload_1
        61: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        64: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        67: aastore
        68: aload         7
        70: iconst_2
        71: ldc_w         #600                // String legacyCalls
        74: lload_3
        75: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        78: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        81: aastore
        82: aload         7
        84: iconst_3
        85: ldc_w         #602                // String fallbackCalls
        88: aload_0
        89: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
        92: invokevirtual #483                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getFallbackCalls:()Ljava/util/concurrent/atomic/AtomicLong;
        95: invokevirtual #588                // Method java/util/concurrent/atomic/AtomicLong.get:()J
        98: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       101: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       104: aastore
       105: aload         7
       107: iconst_4
       108: ldc_w         #604                // String l2brPercentage
       111: lload         5
       113: lconst_0
       114: lcmp
       115: ifle          129
       118: lload_1
       119: bipush        100
       121: i2l
       122: lmul
       123: lload         5
       125: ldiv
       126: goto          130
       129: lconst_0
       130: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       133: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       136: aastore
       137: aload         7
       139: iconst_5
       140: ldc_w         #606                // String avgL2BRTimeUs
       143: lload_1
       144: lconst_0
       145: lcmp
       146: ifle          169
       149: aload_0
       150: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       153: invokevirtual #477                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getL2brTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       156: invokevirtual #588                // Method java/util/concurrent/atomic/AtomicLong.get:()J
       159: lload_1
       160: ldiv
       161: sipush        1000
       164: i2l
       165: ldiv
       166: goto          170
       169: lconst_0
       170: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       173: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       176: aastore
       177: aload         7
       179: bipush        6
       181: ldc_w         #608                // String avgLegacyTimeUs
       184: lload_3
       185: lconst_0
       186: lcmp
       187: ifle          210
       190: aload_0
       191: getfield      #65                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;
       194: invokevirtual #455                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics.getLegacyTotalTimeNs:()Ljava/util/concurrent/atomic/AtomicLong;
       197: invokevirtual #588                // Method java/util/concurrent/atomic/AtomicLong.get:()J
       200: lload_3
       201: ldiv
       202: sipush        1000
       205: i2l
       206: ldiv
       207: goto          211
       210: lconst_0
       211: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       214: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       217: aastore
       218: aload         7
       220: bipush        7
       222: ldc_w         #610                // String engines
       225: aload_0
       226: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
       229: checkcast     #359                // class java/util/Map
       232: astore        8
       234: astore        22
       236: istore        21
       238: astore        20
       240: iconst_0
       241: istore        9
       243: aload         8
       245: astore        10
       247: new           #197                // class java/util/ArrayList
       250: dup
       251: aload         8
       253: invokeinterface #611,  1          // InterfaceMethod java/util/Map.size:()I
       258: invokespecial #387                // Method java/util/ArrayList."<init>":(I)V
       261: checkcast     #274                // class java/util/Collection
       264: astore        11
       266: iconst_0
       267: istore        12
       269: aload         10
       271: invokeinterface #615,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       276: invokeinterface #618,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       281: astore        13
       283: aload         13
       285: invokeinterface #209,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       290: ifeq          415
       293: aload         13
       295: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       300: checkcast     #620                // class java/util/Map$Entry
       303: astore        14
       305: aload         11
       307: aload         14
       309: astore        15
       311: astore        23
       313: iconst_0
       314: istore        16
       316: aload         15
       318: invokeinterface #623,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       323: checkcast     #157                // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
       326: astore        17
       328: aload         15
       330: invokeinterface #626,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       335: checkcast     #164                // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
       338: astore        18
       340: iconst_3
       341: anewarray     #215                // class kotlin/Pair
       344: astore        19
       346: aload         19
       348: iconst_0
       349: ldc_w         #628                // String region
       352: aload         17
       354: invokevirtual #631                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey.toString:()Ljava/lang/String;
       357: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       360: aastore
       361: aload         19
       363: iconst_1
       364: ldc_w         #633                // String nodes
       367: aload         18
       369: invokevirtual #637                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getStorage:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       372: invokevirtual #335                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
       375: invokestatic  #392                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       378: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       381: aastore
       382: aload         19
       384: iconst_2
       385: ldc_w         #638                // String metrics
       388: aload         18
       390: invokevirtual #641                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
       393: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       396: aastore
       397: aload         19
       399: invokestatic  #647                // Method kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
       402: nop
       403: aload         23
       405: swap
       406: invokeinterface #399,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       411: pop
       412: goto          283
       415: aload         11
       417: checkcast     #186                // class java/util/List
       420: nop
       421: astore        23
       423: aload         20
       425: iload         21
       427: aload         22
       429: aload         23
       431: invokestatic  #398                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       434: aastore
       435: aload         7
       437: invokestatic  #647                // Method kotlin/collections/MapsKt.mapOf:([Lkotlin/Pair;)Ljava/util/Map;
       440: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 129
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;" ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;" ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;" ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;" ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;" ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;" ]
          stack = [ class "[Lkotlin/Pair;", int, class java/lang/String, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, long, long, long, class "[Lkotlin/Pair;", class java/util/Map, int, class java/util/Map, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, top, top, class "[Lkotlin/Pair;", int, class java/lang/String ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 131
      LineNumberTable:
        line 315: 0
        line 316: 11
        line 317: 22
        line 320: 27
        line 321: 57
        line 320: 68
        line 322: 71
        line 320: 82
        line 323: 85
        line 320: 105
        line 324: 108
        line 320: 137
        line 325: 140
        line 320: 177
        line 326: 181
        line 320: 218
        line 327: 222
        line 489: 243
        line 490: 269
        line 490: 281
        line 491: 305
        line 329: 340
        line 330: 364
        line 329: 382
        line 331: 385
        line 329: 397
        line 328: 399
        line 332: 402
        line 491: 406
        line 492: 415
        line 489: 420
        line 327: 431
        line 320: 435
        line 319: 437
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          316      87    16 $i$a$-map-GeoEngineBridge$getMetrics$1   I
          328      75    17   key   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
          340      63    18 engine   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
          305     107    14 item$iv$iv   Ljava/util/Map$Entry;
          269     148    12 $i$f$mapTo   I
          266     151    10 $this$mapTo$iv$iv   Ljava/util/Map;
          266     151    11 destination$iv$iv   Ljava/util/Collection;
          243     178     9 $i$f$map   I
          240     181     8 $this$map$iv   Ljava/util/Map;
           11     430     1 l2brCalls   J
           22     419     3 legacyCalls   J
           27     414     5 totalCalls   J
            0     441     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    Signature: #586                         // ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull

  public final java.lang.String verifyL2BRFile(int, int);
    descriptor: (II)Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=13, args_size=3
         0: iload_1
         1: iload_2
         2: invokedynamic #657,  0            // InvokeDynamic #9:makeConcatWithConstants:(II)Ljava/lang/String;
         7: iconst_0
         8: anewarray     #35                 // class java/lang/String
        11: invokestatic  #43                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        14: astore_3
        15: aload_3
        16: invokeinterface #84,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        21: invokevirtual #238                // Method java/io/File.exists:()Z
        24: ifne          31
        27: ldc_w         #659                // String ARQUIVO_NAO_ENCONTRADO
        30: areturn
        31: nop
        32: new           #661                // class java/io/RandomAccessFile
        35: dup
        36: aload_3
        37: invokeinterface #84,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        42: ldc_w         #663                // String r
        45: invokespecial #666                // Method java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
        48: checkcast     #668                // class java/io/Closeable
        51: astore        4
        53: aconst_null
        54: astore        5
        56: nop
        57: aload         4
        59: checkcast     #661                // class java/io/RandomAccessFile
        62: astore        6
        64: iconst_0
        65: istore        7
        67: bipush        64
        69: newarray       byte
        71: astore        8
        73: aload         6
        75: aload         8
        77: invokevirtual #672                // Method java/io/RandomAccessFile.read:([B)I
        80: pop
        81: aload         8
        83: invokestatic  #678                // Method java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        86: getstatic     #684                // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        89: invokevirtual #688                // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        92: astore        9
        94: aload         9
        96: invokevirtual #691                // Method java/nio/ByteBuffer.getLong:()J
        99: lstore        10
       101: aload         9
       103: invokevirtual #695                // Method java/nio/ByteBuffer.getShort:()S
       106: istore        12
       108: nop
       109: lload         10
       111: ldc2_w        #696                // long 5490523817655992320l
       114: lcmp
       115: ifeq          128
       118: lload         10
       120: invokedynamic #702,  0            // InvokeDynamic #10:makeConcatWithConstants:(J)Ljava/lang/String;
       125: goto          147
       128: iload         12
       130: iconst_5
       131: if_icmpeq     144
       134: iload         12
       136: invokedynamic #707,  0            // InvokeDynamic #11:makeConcatWithConstants:(S)Ljava/lang/String;
       141: goto          147
       144: ldc_w         #709                // String OK - Magic e Versão corretos
       147: nop
       148: astore        6
       150: aload         4
       152: aload         5
       154: invokestatic  #715                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       157: aload         6
       159: goto          183
       162: astore        7
       164: aload         7
       166: astore        5
       168: aload         7
       170: athrow
       171: astore        7
       173: aload         4
       175: aload         5
       177: invokestatic  #715                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       180: aload         7
       182: athrow
       183: astore        4
       185: goto          202
       188: astore        5
       190: aload         5
       192: invokevirtual #258                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       195: invokedynamic #720,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       200: astore        4
       202: aload         4
       204: areturn
      Exception table:
         from    to  target type
            56   150   162   Class java/lang/Throwable
            56   150   171   any
           162   171   171   any
           171   173   171   any
            31   185   188   Class java/lang/Exception
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class java/nio/file/Path ]
        frame_type = 255 /* full_frame */
          offset_delta = 96
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path, class java/io/Closeable, null, class java/io/RandomAccessFile, int, class "[B", class java/nio/ByteBuffer, long, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path, class java/io/Closeable, null ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path, class java/io/Closeable, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path, class java/io/Closeable, null, class java/lang/String, int, class "[B", class java/nio/ByteBuffer, long, int ]
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path ]
          stack = [ class java/lang/Exception ]
        frame_type = 253 /* append */
          offset_delta = 13
          locals = [ class java/lang/String, class java/lang/Exception ]
      LineNumberTable:
        line 337: 0
        line 339: 15
        line 340: 27
        line 343: 31
        line 344: 32
        line 345: 67
        line 346: 73
        line 348: 81
        line 349: 94
        line 350: 101
        line 352: 108
        line 353: 109
        line 354: 118
        line 355: 128
        line 356: 134
        line 357: 144
        line 358: 147
        line 344: 148
        line 360: 188
        line 361: 190
        line 343: 204
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      81     7 $i$a$-use-GeoEngineBridge$verifyL2BRFile$1   I
           73      75     8 buffer   [B
           94      54     9    bb   Ljava/nio/ByteBuffer;
          101      47    10 magic   J
          108      40    12 version   S
           64      84     6   raf   Ljava/io/RandomAccessFile;
          190      12     5     e   Ljava/lang/Exception;
           15     190     3 filePath   Ljava/nio/file/Path;
            0     205     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0     205     1 regionX   I
            0     205     2 regionY   I
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull

  public final void reloadRegion(int, int);
    descriptor: (II)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=18, locals=21, args_size=3
         0: iload_1
         1: iload_2
         2: invokedynamic #657,  0            // InvokeDynamic #9:makeConcatWithConstants:(II)Ljava/lang/String;
         7: iconst_0
         8: anewarray     #35                 // class java/lang/String
        11: invokestatic  #43                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        14: astore_3
        15: aload_3
        16: invokedynamic #736,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        21: getstatic     #740                // Field java/lang/System.out:Ljava/io/PrintStream;
        24: swap
        25: invokevirtual #745                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        28: aload_3
        29: invokeinterface #84,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        34: invokevirtual #238                // Method java/io/File.exists:()Z
        37: ifne          54
        40: new           #747                // class java/io/FileNotFoundException
        43: dup
        44: aload_3
        45: invokedynamic #750,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
        50: invokespecial #752                // Method java/io/FileNotFoundException."<init>":(Ljava/lang/String;)V
        53: athrow
        54: nop
        55: new           #754                // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
        58: dup
        59: invokespecial #755                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer."<init>":()V
        62: astore        4
        64: aload         4
        66: aload_3
        67: invokevirtual #759                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.deserialize:(Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
        70: astore        5
        72: aload         5
        74: invokevirtual #764                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionX:()I
        77: aload         5
        79: invokevirtual #767                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionY:()I
        82: aload         5
        84: invokevirtual #770                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
        87: invokeinterface #611,  1          // InterfaceMethod java/util/Map.size:()I
        92: invokedynamic #775,  0            // InvokeDynamic #15:makeConcatWithConstants:(III)Ljava/lang/String;
        97: getstatic     #740                // Field java/lang/System.out:Ljava/io/PrintStream;
       100: swap
       101: invokevirtual #745                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       104: ldc2_w        #776                // long 64l
       107: aload         5
       109: invokevirtual #770                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
       112: invokeinterface #611,  1          // InterfaceMethod java/util/Map.size:()I
       117: i2l
       118: ldc2_w        #778                // long 32l
       121: lmul
       122: ladd
       123: sipush        4096
       126: i2l
       127: ladd
       128: lstore        6
       130: getstatic     #324                // Field ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
       133: aload_3
       134: new           #781                // class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
       137: dup
       138: lconst_0
       139: iconst_0
       140: aload         5
       142: invokevirtual #764                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionX:()I
       145: i2s
       146: aload         5
       148: invokevirtual #767                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionY:()I
       151: i2s
       152: aload         5
       154: invokevirtual #770                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
       157: invokeinterface #611,  1          // InterfaceMethod java/util/Map.size:()I
       162: ldc2_w        #776                // long 64l
       165: ldc2_w        #776                // long 64l
       168: aload         5
       170: invokevirtual #770                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
       173: invokeinterface #611,  1          // InterfaceMethod java/util/Map.size:()I
       178: i2l
       179: ldc2_w        #778                // long 32l
       182: lmul
       183: ladd
       184: lconst_0
       185: iconst_3
       186: aconst_null
       187: invokespecial #784                // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader."<init>":(JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
       190: lload         6
       192: invokestatic  #598                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       195: invokevirtual #788                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       198: astore        8
       200: new           #790                // class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
       203: dup
       204: invokespecial #791                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder."<init>":()V
       207: astore        9
       209: aload         5
       211: invokevirtual #770                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
       214: invokeinterface #795,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       219: checkcast     #200                // class java/lang/Iterable
       222: astore        10
       224: iconst_0
       225: istore        11
       227: iconst_0
       228: istore        12
       230: aload         10
       232: invokeinterface #204,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       237: astore        13
       239: aload         13
       241: invokeinterface #209,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       246: ifeq          372
       249: aload         13
       251: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       256: astore        14
       258: iload         12
       260: iinc          12, 1
       263: istore        15
       265: iload         15
       267: ifge          273
       270: invokestatic  #798                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
       273: iload         15
       275: aload         14
       277: checkcast     #800                // class ext/mods/gameserver/geoengine/pathfinding/serialization/Node
       280: astore        16
       282: istore        17
       284: iconst_0
       285: istore        18
       287: aload         9
       289: aload         16
       291: invokevirtual #803                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getX:()I
       294: aload         16
       296: invokevirtual #806                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getY:()I
       299: aload         16
       301: invokevirtual #809                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getZ:()I
       304: i2s
       305: invokevirtual #813                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setPosition:(IIS)V
       308: aload         9
       310: aload         16
       312: invokevirtual #816                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.isWalkable:()Z
       315: invokevirtual #820                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setWalkable:(Z)V
       318: aload         9
       320: iconst_0
       321: invokevirtual #823                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setJpsDistances:(I)V
       324: aload         9
       326: iconst_0
       327: invokevirtual #826                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setSuccessorOffset:(I)V
       330: aload         9
       332: iconst_0
       333: invokevirtual #829                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setSuccessorCount:(I)V
       336: aload         9
       338: iconst_0
       339: invokevirtual #832                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setClusterId:(I)V
       342: ldc2_w        #776                // long 64l
       345: iload         17
       347: i2l
       348: ldc2_w        #778                // long 32l
       351: lmul
       352: ladd
       353: lstore        19
       355: aload         9
       357: aload         8
       359: invokevirtual #836                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getSegment:()Ljava/lang/foreign/MemorySegment;
       362: lload         19
       364: invokevirtual #840                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.writeTo:(Ljava/lang/foreign/MemorySegment;J)V
       367: nop
       368: nop
       369: goto          239
       372: nop
       373: new           #164                // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
       376: dup
       377: aload         8
       379: new           #332                // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
       382: dup
       383: aload         5
       385: invokevirtual #770                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
       388: invokeinterface #611,  1          // InterfaceMethod java/util/Map.size:()I
       393: iconst_0
       394: iconst_2
       395: aconst_null
       396: invokespecial #338                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer."<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
       399: invokespecial #341                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine."<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
       402: astore        10
       404: new           #157                // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
       407: dup
       408: iload_1
       409: iload_2
       410: invokespecial #159                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey."<init>":(II)V
       413: astore        11
       415: aload_0
       416: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
       419: checkcast     #359                // class java/util/Map
       422: aload         11
       424: aload         10
       426: invokeinterface #363,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       431: pop
       432: iload_1
       433: iload_2
       434: invokedynamic #843,  0            // InvokeDynamic #16:makeConcatWithConstants:(II)Ljava/lang/String;
       439: getstatic     #740                // Field java/lang/System.out:Ljava/io/PrintStream;
       442: swap
       443: invokevirtual #745                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       446: goto          476
       449: astore        4
       451: aload         4
       453: invokevirtual #258                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       456: invokedynamic #846,  0            // InvokeDynamic #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       461: getstatic     #740                // Field java/lang/System.out:Ljava/io/PrintStream;
       464: swap
       465: invokevirtual #745                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       468: aload         4
       470: invokevirtual #849                // Method java/lang/Exception.printStackTrace:()V
       473: aload         4
       475: athrow
       476: return
      Exception table:
         from    to  target type
            54   446   449   Class java/lang/Exception
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class java/nio/file/Path ]
        frame_type = 255 /* full_frame */
          offset_delta = 184
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, long, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder, class java/lang/Iterable, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class java/lang/Object, int ]
        frame_type = 249 /* chop */
          offset_delta = 98
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge, int, int, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, long, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey, int, class java/util/Iterator ]
          stack = []
      LineNumberTable:
        line 366: 0
        line 368: 15
        line 370: 28
        line 371: 40
        line 374: 54
        line 375: 55
        line 376: 64
        line 378: 72
        line 380: 104
        line 382: 130
        line 383: 133
        line 384: 134
        line 385: 140
        line 386: 146
        line 387: 152
        line 388: 162
        line 389: 165
        line 390: 184
        line 384: 185
        line 392: 190
        line 382: 195
        line 395: 200
        line 396: 209
        line 493: 227
        line 494: 230
        line 494: 275
        line 397: 287
        line 398: 308
        line 399: 318
        line 400: 324
        line 401: 330
        line 402: 336
        line 404: 342
        line 405: 355
        line 406: 367
        line 494: 368
        line 495: 372
        line 408: 373
        line 409: 377
        line 410: 379
        line 408: 399
        line 413: 404
        line 414: 415
        line 416: 432
        line 418: 449
        line 419: 451
        line 420: 468
        line 421: 473
        line 423: 476
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          287      81    18 $i$a$-forEachIndexed-GeoEngineBridge$reloadRegion$1   I
          355      13    19 nodeOffset   J
          284      84    17 index   I
          284      84    16  node   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
          258     111    14 item$iv   Ljava/lang/Object;
          227     146    11 $i$f$forEachIndexed   I
          230     143    12 index$iv   I
          224     149    10 $this$forEachIndexed$iv   Ljava/lang/Iterable;
           64     382     4 serializer   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
           72     374     5 region   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
          130     316     6 storageSize   J
          200     246     8 storage   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
          209     237     9 builder   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
          404      42    10 engine   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
          415      31    11   key   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
          451      25     4     e   Ljava/lang/Exception;
           15     462     3 filePath   Ljava/nio/file/Path;
            0     477     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0     477     1 regionX   I
            0     477     2 regionY   I

  public final void updateConfig(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
         5: aload_0
         6: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
         9: aload_1
        10: invokedynamic #871,  0            // InvokeDynamic #18:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)Ljava/lang/String;
        15: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        18: return
      LineNumberTable:
        line 426: 0
        line 427: 5
        line 428: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      19     1 newConfig   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #70()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$BridgeConfig getConfig();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
         4: areturn
      LineNumberTable:
        line 430: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull

  public final void unloadAll();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=7, args_size=1
         0: aload_0
         1: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
         4: invokevirtual #876                // Method java/util/concurrent/ConcurrentHashMap.values:()Ljava/util/Collection;
         7: checkcast     #200                // class java/lang/Iterable
        10: astore_1
        11: iconst_0
        12: istore_2
        13: aload_1
        14: invokeinterface #204,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        19: astore_3
        20: aload_3
        21: invokeinterface #209,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          56
        29: aload_3
        30: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        35: astore        4
        37: aload         4
        39: checkcast     #164                // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
        42: astore        5
        44: iconst_0
        45: istore        6
        47: aload         5
        49: invokevirtual #167                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.close:()V
        52: nop
        53: goto          20
        56: nop
        57: aload_0
        58: getfield      #31                 // Field l2brEngines:Ljava/util/concurrent/ConcurrentHashMap;
        61: invokevirtual #879                // Method java/util/concurrent/ConcurrentHashMap.clear:()V
        64: aload_0
        65: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
        68: ldc_w         #881                // String Todas as regiões L2BR descarregadas
        71: invokevirtual #106                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        74: return
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/lang/Iterable, int, class java/util/Iterator ]
        frame_type = 35 /* same */
      LineNumberTable:
        line 433: 0
        line 496: 13
        line 433: 47
        line 496: 52
        line 497: 56
        line 434: 57
        line 435: 64
        line 436: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47       5     6 $i$a$-forEach-GeoEngineBridge$unloadAll$1   I
           44       8     5    it   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
           37      16     4 element$iv   Ljava/lang/Object;
           13      44     2 $i$f$forEach   I
           11      46     1 $this$forEach$iv   Ljava/lang/Iterable;
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;

  public static final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge getInstance();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #887                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
         3: invokevirtual #891                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
         6: areturn
      LineNumberTable:
        line 77: 6
    RuntimeVisibleAnnotations:
      0: #884()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #70()
        org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge access$getINSTANCE$cp();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #894                // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
         3: areturn
      LineNumberTable:
        line 43: 0

  public static final java.util.logging.Logger access$getLogger$p(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field logger:Ljava/util/logging/Logger;
         4: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #889                // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
         3: dup
         4: aconst_null
         5: invokespecial #901                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #887                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
        11: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
        14: dup
        15: invokespecial #902                // Method "<init>":()V
        18: putstatic     #894                // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
        21: return
      LineNumberTable:
        line 74: 11
}
InnerClasses:
  public static final #118= #123 of #117; // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
  public static final #926= #925 of #164; // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  public static #929= #136 of #928;       // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #932= #931 of #136; // SourcePriority=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #920= #49 of #2;    // BridgeConfig=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  public static final #118= #889 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  public static #922= #435 of #2;         // GeoEngineInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  public static final #921= #58 of #2;    // Metrics=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  static final #346;                      // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
  public static final #118= #326 of #321; // Companion=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  public static #934= #620 of #359;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #939= #936 of #938; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
SourceFile: "GeoEngineBridge.kt"
SourceDebugExtension:
  SMAP
  GeoEngineBridge.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoEngineBridge.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 _Maps.kt
  kotlin/collections/MapsKt___MapsKt
  *L
  1#1,441:1
  305#1,7:454
  295#1,7:461
  305#1,7:468
  295#1,7:475
  305#1,7:482
  1915#2,2:442
  1391#2:444
  1480#2,2:445
  1586#2:447
  1661#2,3:448
  1482#2,3:451
  1924#2,3:493
  1915#2,2:496
  129#3:489
  158#3,3:490
  *S KotlinDebug
  *F
  + 1 GeoEngineBridge.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  *L
  213#1:454,7
  225#1:461,7
  230#1:468,7
  242#1:475,7
  246#1:482,7
  151#1:442,2
  200#1:444
  200#1:445,2
  201#1:447
  201#1:448,3
  200#1:451,3
  396#1:493,3
  433#1:496,2
  327#1:489
  327#1:490,3
  *E
RuntimeVisibleAnnotations:
  0: #904(#905=[I#906,I#907,I#908],#909=I#910,#911=I#912,#913=[s#914],#915=[s#67,s#291,s#5,s#6,s#21,s#22,s#916,s#71,s#72,s#28,s#29,s#177,s#371,s#44,s#45,s#53,s#54,s#62,s#63,s#75,s#291,s#68,s#291,s#107,s#108,s#112,s#113,s#109,s#154,s#178,s#291,s#179,s#180,s#311,s#291,s#917,s#239,s#298,s#314,s#419,s#499,s#503,s#504,s#505,s#506,s#507,s#508,s#509,s#510,s#514,s#524,s#528,s#291,s#530,s#531,s#535,s#291,s#542,s#543,s#544,s#545,s#552,s#556,s#557,s#465,s#569,s#918,s#580,s#919,s#570,s#582,s#584,s#291,s#291,s#654,s#733,s#865,s#872,s#873,s#875,s#920,s#921,s#118,s#922,s#923])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 R2\u00020\u0001:\u0004PQRSB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\"\u0010 \u001a\u00020\u00162\u001a\b\u0002\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0#0\"J \u0010$\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u000eH\u0002J\u001a\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0#0\"H\u0002JR\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001J6\u00101\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001eJ^\u00102\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0006\u00105\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001J\u001e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001eJB\u0010<\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0001J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0001J\u000e\u0010?\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0001J\u001a\u0010@\u001a\u0004\u0018\u00010\f2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001eH\u0002J\"\u0010A\u001a\u0002HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0082\b¢\u0006\u0002\u0010EJ\"\u0010F\u001a\u0002HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0082\b¢\u0006\u0002\u0010EJ\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00010HJ\u0016\u0010J\u001a\u00020I2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010K\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;","","<init>","()V","logger","Ljava/util/logging/Logger;","kotlin.jvm.PlatformType","legacyEngine","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;","l2brEngines","Ljava/util/concurrent/ConcurrentHashMap;","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;","Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;","basePath","Ljava/nio/file/Path;","config","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;","metrics","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Metrics;","_initialized","","initialize","","legacy","isInitialized","_adminCommands","Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;","getAdminCommands","unloadRegion","regionX","","regionY","loadL2BRRegions","regions","","Lkotlin/Pair;","loadL2BREngine","path","discoverRegions","findPath","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","ox","oy","oz","tx","ty","tz","playable","debug","canMove","canSee","oheight","","theight","ignore","getHeight","","worldX","worldY","worldZ","getValidLocation","addGeoObject","obj","removeGeoObject","getL2BREngineForLocation","measureL2BR","T","block","Lkotlin/Function0;","(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;","measureLegacy","getMetrics","","","verifyL2BRFile","reloadRegion","updateConfig","newConfig","getConfig","unloadAll","BridgeConfig","Metrics","Companion","GeoEngineInterface","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #941(#942=[s#943])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoEngineBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngineBridge.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,441:1\n305#1,7:454\n295#1,7:461\n305#1,7:468\n295#1,7:475\n305#1,7:482\n1915#2,2:442\n1391#2:444\n1480#2,2:445\n1586#2:447\n1661#2,3:448\n1482#2,3:451\n1924#2,3:493\n1915#2,2:496\n129#3:489\n158#3,3:490\n*S KotlinDebug\n*F\n+ 1 GeoEngineBridge.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge\n*L\n213#1:454,7\n225#1:461,7\n230#1:468,7\n242#1:475,7\n246#1:482,7\n151#1:442,2\n200#1:444\n200#1:445,2\n201#1:447\n201#1:448,3\n200#1:451,3\n396#1:493,3\n433#1:496,2\n327#1:489\n327#1:490,3\n*E\n"]
    )
BootstrapMethods:
  0: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #92 [GeoEngineBridge] Inicializado. Diretório: \u0001
  1: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #172 Região \u0001 descarregada
  2: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #192 [GeoEngineBridge] Carregando \u0001 regiões...
  3: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #228 \u0001_\u0001.l2br
  4: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #244 ? [\u0001, \u0001]
  5: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #260 ? Falha ao carregar L2BR para [\u0001, \u0001]: \u0001
  6: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #268 ? Região [\u0001, \u0001] ? GeoEngine (legacy)
  7: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #289 , \u0001 falhas
  8: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #294 [GeoEngineBridge] \u0001 regiões em L2BR, \u0001 em legacy\u0001
  9: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #656 data/pathfinder/\u0001_\u0001.l2br
  10: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #699 MAGIC_INVALIDO (esperado: 5490523817655992320, obtido: \u0001)
  11: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #704 VERSAO_INVALIDA (esperado: 5, obtido: \u0001)
  12: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #717 ERRO_LEITURA: \u0001
  13: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #735 [L2BR] Tentando carregar: \u0001
  14: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #749 Arquivo não encontrado: \u0001
  15: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #772 [L2BR] Região \u0001_\u0001 carregada: \u0001 nós
  16: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #842 [L2BR] Região [\u0001, \u0001] carregada com sucesso!
  17: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #845 [L2BR] ERRO ao carregar região: \u0001
  18: #99 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #868 Configuração atualizada: \u0001
