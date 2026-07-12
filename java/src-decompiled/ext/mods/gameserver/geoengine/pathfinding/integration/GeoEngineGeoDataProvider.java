// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineGeoDataProvider.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.class
  Last modified 9 de jul de 2026; size 11642 bytes
  MD5 checksum 5e58bdef1f431259ebfaa1c429314a1c
  Compiled from "GeoEngineGeoDataProvider.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider implements ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 5, methods: 15, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
    #6 = Class              #5            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
    #7 = Utf8               <init>
    #8 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
    #9 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #10 = Utf8               ()V
   #11 = NameAndType        #7:#10        // "<init>":()V
   #12 = Methodref          #4.#11        // java/lang/Object."<init>":()V
   #13 = Utf8               geoEngine
   #14 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #15 = NameAndType        #13:#14       // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #17 = Utf8               geoDataPath
   #18 = Utf8               Ljava/nio/file/Path;
   #19 = NameAndType        #17:#18       // geoDataPath:Ljava/nio/file/Path;
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.geoDataPath:Ljava/nio/file/Path;
   #21 = Utf8               convDatPath
   #22 = NameAndType        #21:#18       // convDatPath:Ljava/nio/file/Path;
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.convDatPath:Ljava/nio/file/Path;
   #24 = Utf8               priority
   #25 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #26 = NameAndType        #24:#25       // priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #27 = Fieldref           #2.#26        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #28 = Utf8               java/util/LinkedHashMap
   #29 = Class              #28           // java/util/LinkedHashMap
   #30 = Methodref          #29.#11       // java/util/LinkedHashMap."<init>":()V
   #31 = Utf8               java/util/Map
   #32 = Class              #31           // java/util/Map
   #33 = Utf8               convDatCache
   #34 = Utf8               Ljava/util/Map;
   #35 = NameAndType        #33:#34       // convDatCache:Ljava/util/Map;
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.convDatCache:Ljava/util/Map;
   #37 = Utf8               this
   #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
   #39 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #40 = Utf8               data/geodata
   #41 = String             #40           // data/geodata
   #42 = Utf8               java/lang/String
   #43 = Class              #42           // java/lang/String
   #44 = Utf8               java/nio/file/Paths
   #45 = Class              #44           // java/nio/file/Paths
   #46 = Utf8               get
   #47 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #48 = NameAndType        #46:#47       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #49 = Methodref          #45.#48       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #50 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
   #51 = Class              #50           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
   #52 = Utf8               CONV_DAT_PRIORITY
   #53 = NameAndType        #52:#25       // CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #54 = Fieldref           #51.#53       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #55 = NameAndType        #7:#8         // "<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
   #56 = Methodref          #2.#55        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider."<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
   #57 = Utf8               getBlockType
   #58 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #59 = Utf8               java/lang/Exception
   #60 = Class              #59           // java/lang/Exception
   #61 = Utf8               getClass
   #62 = Utf8               ()Ljava/lang/Class;
   #63 = NameAndType        #61:#62       // getClass:()Ljava/lang/Class;
   #64 = Methodref          #4.#63        // java/lang/Object.getClass:()Ljava/lang/Class;
   #65 = String             #57           // getBlockType
   #66 = Utf8               java/lang/Class
   #67 = Class              #66           // java/lang/Class
   #68 = Utf8               java/lang/Integer
   #69 = Class              #68           // java/lang/Integer
   #70 = Utf8               TYPE
   #71 = Utf8               Ljava/lang/Class;
   #72 = NameAndType        #70:#71       // TYPE:Ljava/lang/Class;
   #73 = Fieldref           #69.#72       // java/lang/Integer.TYPE:Ljava/lang/Class;
   #74 = Utf8               getMethod
   #75 = Utf8               (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
   #76 = NameAndType        #74:#75       // getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
   #77 = Methodref          #67.#76       // java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
   #78 = Utf8               valueOf
   #79 = Utf8               (I)Ljava/lang/Integer;
   #80 = NameAndType        #78:#79       // valueOf:(I)Ljava/lang/Integer;
   #81 = Methodref          #69.#80       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #82 = Utf8               java/lang/reflect/Method
   #83 = Class              #82           // java/lang/reflect/Method
   #84 = Utf8               invoke
   #85 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #86 = NameAndType        #84:#85       // invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #87 = Methodref          #83.#86       // java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #88 = Utf8               intValue
   #89 = Utf8               ()I
   #90 = NameAndType        #88:#89       // intValue:()I
   #91 = Methodref          #69.#90       // java/lang/Integer.intValue:()I
   #92 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
   #93 = Class              #92           // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
   #94 = Utf8               FLAT
   #95 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #96 = NameAndType        #94:#95       // FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #97 = Fieldref           #93.#96       // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #98 = Utf8               COMPLEX
   #99 = NameAndType        #98:#95       // COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #100 = Fieldref           #93.#99       // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #101 = Utf8               MULTILAYER
  #102 = NameAndType        #101:#95      // MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #103 = Fieldref           #93.#102      // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #104 = Utf8               type
  #105 = Utf8               I
  #106 = Utf8               e
  #107 = Utf8               Ljava/lang/Exception;
  #108 = Utf8               geoX
  #109 = Utf8               geoY
  #110 = Utf8               [Ljava/lang/Class;
  #111 = Class              #110          // "[Ljava/lang/Class;"
  #112 = Utf8               [Ljava/lang/Object;
  #113 = Class              #112          // "[Ljava/lang/Object;"
  #114 = Utf8               getHeight
  #115 = Utf8               (II)S
  #116 = Utf8               getConvDatHeight
  #117 = Utf8               (II)Ljava/lang/Short;
  #118 = NameAndType        #116:#117     // getConvDatHeight:(II)Ljava/lang/Short;
  #119 = Methodref          #2.#118       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatHeight:(II)Ljava/lang/Short;
  #120 = Utf8               java/lang/Number
  #121 = Class              #120          // java/lang/Number
  #122 = Utf8               shortValue
  #123 = Utf8               ()S
  #124 = NameAndType        #122:#123     // shortValue:()S
  #125 = Methodref          #121.#124     // java/lang/Number.shortValue:()S
  #126 = String             #114          // getHeight
  #127 = Utf8               java/lang/Short
  #128 = Class              #127          // java/lang/Short
  #129 = Methodref          #128.#124     // java/lang/Short.shortValue:()S
  #130 = Utf8               $i$a$-let-GeoEngineGeoDataProvider$getHeight$1
  #131 = Utf8               it
  #132 = Utf8               S
  #133 = Utf8               e2
  #134 = Utf8               getNswe
  #135 = Utf8               (II)B
  #136 = String             #134          // getNswe
  #137 = Utf8               java/lang/Byte
  #138 = Class              #137          // java/lang/Byte
  #139 = Utf8               byteValue
  #140 = Utf8               ()B
  #141 = NameAndType        #139:#140     // byteValue:()B
  #142 = Methodref          #138.#141     // java/lang/Byte.byteValue:()B
  #143 = Utf8               getLayers
  #144 = Utf8               (II)Ljava/util/List;
  #145 = Utf8               (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
  #146 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #147 = Class              #146          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #148 = NameAndType        #114:#115     // getHeight:(II)S
  #149 = Methodref          #2.#148       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getHeight:(II)S
  #150 = NameAndType        #134:#135     // getNswe:(II)B
  #151 = Methodref          #2.#150       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getNswe:(II)B
  #152 = Utf8               (SB)V
  #153 = NameAndType        #7:#152       // "<init>":(SB)V
  #154 = Methodref          #147.#153     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
  #155 = Utf8               kotlin/collections/CollectionsKt
  #156 = Class              #155          // kotlin/collections/CollectionsKt
  #157 = Utf8               listOf
  #158 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #159 = NameAndType        #157:#158     // listOf:(Ljava/lang/Object;)Ljava/util/List;
  #160 = Methodref          #156.#159     // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
  #161 = Utf8               isLoaded
  #162 = Utf8               (II)Z
  #163 = String             #161          // isLoaded
  #164 = Utf8               java/lang/Boolean
  #165 = Class              #164          // java/lang/Boolean
  #166 = Utf8               booleanValue
  #167 = Utf8               ()Z
  #168 = NameAndType        #166:#167     // booleanValue:()Z
  #169 = Methodref          #165.#168     // java/lang/Boolean.booleanValue:()Z
  #170 = Utf8               hasL2JData
  #171 = Utf8               \u0001_\u0001.l2j
  #172 = String             #171          // \u0001_\u0001.l2j
  #173 = Utf8               java/lang/invoke/StringConcatFactory
  #174 = Class              #173          // java/lang/invoke/StringConcatFactory
  #175 = Utf8               makeConcatWithConstants
  #176 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #177 = NameAndType        #175:#176     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #178 = Methodref          #174.#177     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #179 = MethodHandle       6:#178        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #180 = Utf8               (II)Ljava/lang/String;
  #181 = NameAndType        #175:#180     // makeConcatWithConstants:(II)Ljava/lang/String;
  #182 = InvokeDynamic      #0:#181       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #183 = Utf8               java/nio/file/Path
  #184 = Class              #183          // java/nio/file/Path
  #185 = Utf8               resolve
  #186 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #187 = NameAndType        #185:#186     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #188 = InterfaceMethodref #184.#187     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #189 = Utf8               toFile
  #190 = Utf8               ()Ljava/io/File;
  #191 = NameAndType        #189:#190     // toFile:()Ljava/io/File;
  #192 = InterfaceMethodref #184.#191     // java/nio/file/Path.toFile:()Ljava/io/File;
  #193 = Utf8               java/io/File
  #194 = Class              #193          // java/io/File
  #195 = Utf8               exists
  #196 = NameAndType        #195:#167     // exists:()Z
  #197 = Methodref          #194.#196     // java/io/File.exists:()Z
  #198 = Utf8               regionX
  #199 = Utf8               regionY
  #200 = Utf8               hasConvDatData
  #201 = Utf8               getConvDatFile
  #202 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #203 = NameAndType        #201:#202     // getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #204 = Methodref          #2.#203       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #205 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #206 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile
  #207 = Class              #206          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile
  #208 = NameAndType        #114:#117     // getHeight:(II)Ljava/lang/Short;
  #209 = Methodref          #207.#208     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile.getHeight:(II)Ljava/lang/Short;
  #210 = Utf8               convFile
  #211 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #212 = Utf8               getSourcePriority
  #213 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #214 = Utf8               kotlin/Pair
  #215 = Class              #214          // kotlin/Pair
  #216 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #217 = NameAndType        #7:#216       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #218 = Methodref          #215.#217     // kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #219 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #220 = MethodType         #219          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #221 = Utf8               getConvDatFile$lambda$0
  #222 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #223 = NameAndType        #221:#222     // getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #224 = Methodref          #2.#223       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #225 = MethodHandle       6:#224        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #226 = Utf8               (Lkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #227 = MethodType         #226          //  (Lkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #228 = Utf8               java/lang/invoke/LambdaMetafactory
  #229 = Class              #228          // java/lang/invoke/LambdaMetafactory
  #230 = Utf8               metafactory
  #231 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #232 = NameAndType        #230:#231     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #233 = Methodref          #229.#232     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #234 = MethodHandle       6:#233        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #235 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;II)Lkotlin/jvm/functions/Function1;
  #236 = NameAndType        #84:#235      // invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;II)Lkotlin/jvm/functions/Function1;
  #237 = InvokeDynamic      #1:#236       // #1:invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;II)Lkotlin/jvm/functions/Function1;
  #238 = Utf8               getConvDatFile$lambda$1
  #239 = Utf8               (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #240 = NameAndType        #238:#239     // getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #241 = Methodref          #2.#240       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #242 = MethodHandle       6:#241        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #243 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #244 = MethodType         #243          //  (Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #245 = Utf8               apply
  #246 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
  #247 = NameAndType        #245:#246     // apply:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
  #248 = InvokeDynamic      #2:#247       // #2:apply:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
  #249 = Utf8               computeIfAbsent
  #250 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #251 = NameAndType        #249:#250     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #252 = InterfaceMethodref #32.#251      // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #253 = Utf8               loadConvDatFile
  #254 = Utf8               \u0001_\u0001_conv.dat
  #255 = String             #254          // \u0001_\u0001_conv.dat
  #256 = InvokeDynamic      #3:#181       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #257 = Utf8               \u0001_\u0001.conv.dat
  #258 = String             #257          // \u0001_\u0001.conv.dat
  #259 = InvokeDynamic      #4:#181       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #260 = Utf8               conv_\u0001_\u0001.dat
  #261 = String             #260          // conv_\u0001_\u0001.dat
  #262 = InvokeDynamic      #5:#181       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #263 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #264 = NameAndType        #157:#263     // listOf:([Ljava/lang/Object;)Ljava/util/List;
  #265 = Methodref          #156.#264     // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
  #266 = Utf8               java/util/List
  #267 = Class              #266          // java/util/List
  #268 = Utf8               iterator
  #269 = Utf8               ()Ljava/util/Iterator;
  #270 = NameAndType        #268:#269     // iterator:()Ljava/util/Iterator;
  #271 = InterfaceMethodref #267.#270     // java/util/List.iterator:()Ljava/util/Iterator;
  #272 = Utf8               java/util/Iterator
  #273 = Class              #272          // java/util/Iterator
  #274 = Utf8               hasNext
  #275 = NameAndType        #274:#167     // hasNext:()Z
  #276 = InterfaceMethodref #273.#275     // java/util/Iterator.hasNext:()Z
  #277 = Utf8               next
  #278 = Utf8               ()Ljava/lang/Object;
  #279 = NameAndType        #277:#278     // next:()Ljava/lang/Object;
  #280 = InterfaceMethodref #273.#279     // java/util/Iterator.next:()Ljava/lang/Object;
  #281 = Utf8               (Ljava/io/File;)V
  #282 = NameAndType        #7:#281       // "<init>":(Ljava/io/File;)V
  #283 = Methodref          #207.#282     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile."<init>":(Ljava/io/File;)V
  #284 = Utf8               file
  #285 = Utf8               Ljava/io/File;
  #286 = Utf8               name
  #287 = Utf8               Ljava/lang/String;
  #288 = Utf8               names
  #289 = Utf8               Ljava/util/List;
  #290 = NameAndType        #253:#202     // loadConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #291 = Methodref          #2.#290       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.loadConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #292 = Utf8               this$0
  #293 = Utf8               $regionX
  #294 = Utf8               $regionY
  #295 = Utf8               Lkotlin/Pair;
  #296 = Utf8               kotlin/jvm/functions/Function1
  #297 = Class              #296          // kotlin/jvm/functions/Function1
  #298 = NameAndType        #84:#219      // invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #299 = InterfaceMethodref #297.#298     // kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #300 = Utf8               $tmp0
  #301 = Utf8               Lkotlin/jvm/functions/Function1;
  #302 = Utf8               p0
  #303 = Utf8               Ljava/lang/Object;
  #304 = Utf8               Ljava/util/Map<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;>;
  #305 = Utf8               Lkotlin/Metadata;
  #306 = Utf8               mv
  #307 = Integer            2
  #308 = Integer            3
  #309 = Integer            0
  #310 = Utf8               k
  #311 = Integer            1
  #312 = Utf8               xi
  #313 = Integer            48
  #314 = Utf8               d1
  #315 = Utf8               \u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u001f\u0010!\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\bH\u0016J\u001a\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u001a\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\'
  #316 = Utf8               d2
  #317 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #318 = Utf8
  #319 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #320 = Utf8               ConvDatFile
  #321 = Utf8               Brproject
  #322 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #323 = Class              #322          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #324 = Utf8               GeoDataProvider
  #325 = Utf8               LayerInfo
  #326 = Utf8               SourcePriority
  #327 = Utf8               GeoEngineGeoDataProvider.kt
  #328 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #329 = Utf8               value
  #330 = Utf8               SMAP\nGeoEngineGeoDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngineGeoDataProvider.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n
  #331 = Utf8               RuntimeInvisibleAnnotations
  #332 = Utf8               Signature
  #333 = Utf8               Code
  #334 = Utf8               LineNumberTable
  #335 = Utf8               LocalVariableTable
  #336 = Utf8               RuntimeInvisibleParameterAnnotations
  #337 = Utf8               StackMapTable
  #338 = Utf8               InnerClasses
  #339 = Utf8               SourceFile
  #340 = Utf8               SourceDebugExtension
  #341 = Utf8               RuntimeVisibleAnnotations
  #342 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider(ext.mods.gameserver.geoengine.GeoEngine, java.nio.file.Path, java.nio.file.Path, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority);
    descriptor: (Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         9: aload_0
        10: aload_2
        11: putfield      #20                 // Field geoDataPath:Ljava/nio/file/Path;
        14: aload_0
        15: aload_3
        16: putfield      #23                 // Field convDatPath:Ljava/nio/file/Path;
        19: aload_0
        20: aload         4
        22: putfield      #27                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
        25: aload_0
        26: new           #29                 // class java/util/LinkedHashMap
        29: dup
        30: invokespecial #30                 // Method java/util/LinkedHashMap."<init>":()V
        33: checkcast     #32                 // class java/util/Map
        36: putfield      #36                 // Field convDatCache:Ljava/util/Map;
        39: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 9
        line 33: 14
        line 34: 19
        line 37: 25
        line 37: 36
        line 30: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0      40     1 geoEngine   Lext/mods/gameserver/geoengine/GeoEngine;
            0      40     2 geoDataPath   Ljava/nio/file/Path;
            0      40     3 convDatPath   Ljava/nio/file/Path;
            0      40     4 priority   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 3:
        0: #9()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider(ext.mods.gameserver.geoengine.GeoEngine, java.nio.file.Path, java.nio.file.Path, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_2
         3: iand
         4: ifeq          17
         7: ldc           #41                 // String data/geodata
         9: iconst_0
        10: anewarray     #43                 // class java/lang/String
        13: invokestatic  #49                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        16: astore_2
        17: iload         5
        19: iconst_4
        20: iand
        21: ifeq          34
        24: ldc           #41                 // String data/geodata
        26: iconst_0
        27: anewarray     #43                 // class java/lang/String
        30: invokestatic  #49                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        33: astore_3
        34: iload         5
        36: bipush        8
        38: iand
        39: ifeq          47
        42: getstatic     #54                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
        45: astore        4
        47: aload_0
        48: aload_1
        49: aload_2
        50: aload_3
        51: aload         4
        53: invokespecial #56                 // Method "<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
        56: return
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 12 /* same */
      LineNumberTable:
        line 30: 0
        line 32: 7
        line 30: 17
        line 33: 24
        line 30: 34
        line 34: 42
        line 30: 47
        line 35: 56

  public ext.mods.gameserver.geoengine.pathfinding.model.BlockType getBlockType(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=3
         0: nop
         1: aload_0
         2: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         5: invokevirtual #64                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         8: ldc           #65                 // String getBlockType
        10: iconst_2
        11: anewarray     #67                 // class java/lang/Class
        14: astore        7
        16: aload         7
        18: iconst_0
        19: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        22: aastore
        23: aload         7
        25: iconst_1
        26: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        29: aastore
        30: aload         7
        32: invokevirtual #77                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        35: astore        6
        37: aload         6
        39: ifnull        78
        42: aload         6
        44: aload_0
        45: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        48: iconst_2
        49: anewarray     #4                  // class java/lang/Object
        52: astore        7
        54: aload         7
        56: iconst_0
        57: iload_1
        58: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        61: aastore
        62: aload         7
        64: iconst_1
        65: iload_2
        66: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: aastore
        70: aload         7
        72: invokevirtual #87                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        75: goto          79
        78: aconst_null
        79: astore        5
        81: aload         5
        83: instanceof    #69                 // class java/lang/Integer
        86: ifeq          97
        89: aload         5
        91: checkcast     #69                 // class java/lang/Integer
        94: goto          98
        97: aconst_null
        98: dup
        99: ifnull        108
       102: invokevirtual #91                 // Method java/lang/Integer.intValue:()I
       105: goto          110
       108: pop
       109: iconst_0
       110: istore_3
       111: iload_3
       112: tableswitch   { // 0 to 2

                       0: 140

                       1: 146

                       2: 152
                 default: 158
            }
       140: getstatic     #97                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       143: goto          161
       146: getstatic     #100                // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       149: goto          161
       152: getstatic     #103                // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       155: goto          161
       158: getstatic     #97                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       161: astore_3
       162: goto          171
       165: astore        4
       167: getstatic     #97                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       170: astore_3
       171: aload_3
       172: areturn
      Exception table:
         from    to  target type
             0   162   165   Class java/lang/Exception
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Class;" ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, int, top, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = []
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/model/BlockType ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/BlockType ]
      LineNumberTable:
        line 40: 0
        line 41: 1
        line 42: 1
        line 41: 1
        line 42: 37
        line 41: 42
        line 42: 44
        line 41: 81
        line 43: 109
        line 41: 110
        line 44: 111
        line 45: 140
        line 46: 146
        line 47: 152
        line 48: 158
        line 50: 165
        line 51: 167
        line 40: 172
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          111      50     3  type   I
          167       4     4     e   Ljava/lang/Exception;
            0     173     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0     173     1  geoX   I
            0     173     2  geoY   I
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public short getHeight(int, int);
    descriptor: (II)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=3
         0: aload_0
         1: getfield      #27                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         4: getstatic     #54                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         7: if_acmpne     36
        10: aload_0
        11: iload_1
        12: iload_2
        13: invokevirtual #119                // Method getConvDatHeight:(II)Ljava/lang/Short;
        16: astore_3
        17: aload_3
        18: ifnull        36
        21: aload_3
        22: checkcast     #121                // class java/lang/Number
        25: invokevirtual #125                // Method java/lang/Number.shortValue:()S
        28: istore        5
        30: iconst_0
        31: istore        6
        33: iload         5
        35: ireturn
        36: nop
        37: aload_0
        38: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        41: invokevirtual #64                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        44: ldc           #126                // String getHeight
        46: iconst_3
        47: anewarray     #67                 // class java/lang/Class
        50: astore        6
        52: aload         6
        54: iconst_0
        55: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        58: aastore
        59: aload         6
        61: iconst_1
        62: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        65: aastore
        66: aload         6
        68: iconst_2
        69: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        72: aastore
        73: aload         6
        75: invokevirtual #77                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        78: astore        5
        80: aload         5
        82: ifnull        129
        85: aload         5
        87: aload_0
        88: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        91: iconst_3
        92: anewarray     #4                  // class java/lang/Object
        95: astore        6
        97: aload         6
        99: iconst_0
       100: iload_1
       101: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       104: aastore
       105: aload         6
       107: iconst_1
       108: iload_2
       109: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       112: aastore
       113: aload         6
       115: iconst_2
       116: iconst_0
       117: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       120: aastore
       121: aload         6
       123: invokevirtual #87                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
       126: goto          130
       129: aconst_null
       130: astore        4
       132: aload         4
       134: instanceof    #128                // class java/lang/Short
       137: ifeq          148
       140: aload         4
       142: checkcast     #128                // class java/lang/Short
       145: goto          149
       148: aconst_null
       149: dup
       150: ifnull        159
       153: invokevirtual #129                // Method java/lang/Short.shortValue:()S
       156: goto          161
       159: pop
       160: iconst_0
       161: istore_3
       162: goto          290
       165: astore        4
       167: nop
       168: aload_0
       169: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       172: invokevirtual #64                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       175: ldc           #126                // String getHeight
       177: iconst_2
       178: anewarray     #67                 // class java/lang/Class
       181: astore        8
       183: aload         8
       185: iconst_0
       186: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
       189: aastore
       190: aload         8
       192: iconst_1
       193: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
       196: aastore
       197: aload         8
       199: invokevirtual #77                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
       202: astore        7
       204: aload         7
       206: ifnull        245
       209: aload         7
       211: aload_0
       212: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       215: iconst_2
       216: anewarray     #4                  // class java/lang/Object
       219: astore        8
       221: aload         8
       223: iconst_0
       224: iload_1
       225: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       228: aastore
       229: aload         8
       231: iconst_1
       232: iload_2
       233: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       236: aastore
       237: aload         8
       239: invokevirtual #87                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
       242: goto          246
       245: aconst_null
       246: astore        6
       248: aload         6
       250: instanceof    #128                // class java/lang/Short
       253: ifeq          264
       256: aload         6
       258: checkcast     #128                // class java/lang/Short
       261: goto          265
       264: aconst_null
       265: dup
       266: ifnull        275
       269: invokevirtual #129                // Method java/lang/Short.shortValue:()S
       272: goto          277
       275: pop
       276: iconst_0
       277: istore        5
       279: goto          287
       282: astore        6
       284: iconst_0
       285: istore        5
       287: iload         5
       289: istore_3
       290: iload_3
       291: ireturn
      Exception table:
         from    to  target type
           167   279   282   Class java/lang/Exception
            36   162   165   Class java/lang/Exception
      StackMapTable: number_of_entries = 17
        frame_type = 36 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Class;" ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Short ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Short ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Exception, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Class;" ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Exception, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Exception, top, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Short ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Short ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Exception ]
          stack = [ class java/lang/Exception ]
        frame_type = 253 /* append */
          offset_delta = 4
          locals = [ int, class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, int, class java/lang/Object, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 56: 0
        line 57: 10
        line 168: 30
        line 57: 33
        line 60: 36
        line 61: 37
        line 62: 37
        line 61: 37
        line 62: 80
        line 61: 85
        line 62: 87
        line 61: 132
        line 63: 160
        line 64: 165
        line 65: 167
        line 66: 168
        line 67: 168
        line 66: 168
        line 67: 204
        line 66: 209
        line 67: 211
        line 66: 248
        line 68: 276
        line 69: 282
        line 70: 284
        line 60: 291
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33       3     6 $i$a$-let-GeoEngineGeoDataProvider$getHeight$1   I
           30       6     5    it   S
          284       3     6    e2   Ljava/lang/Exception;
          167     123     4     e   Ljava/lang/Exception;
            0     292     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0     292     1  geoX   I
            0     292     2  geoY   I

  public byte getNswe(int, int);
    descriptor: (II)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=3
         0: nop
         1: aload_0
         2: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         5: invokevirtual #64                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         8: ldc           #136                // String getNswe
        10: iconst_2
        11: anewarray     #67                 // class java/lang/Class
        14: astore        6
        16: aload         6
        18: iconst_0
        19: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        22: aastore
        23: aload         6
        25: iconst_1
        26: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        29: aastore
        30: aload         6
        32: invokevirtual #77                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        35: astore        5
        37: aload         5
        39: ifnull        78
        42: aload         5
        44: aload_0
        45: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        48: iconst_2
        49: anewarray     #4                  // class java/lang/Object
        52: astore        6
        54: aload         6
        56: iconst_0
        57: iload_1
        58: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        61: aastore
        62: aload         6
        64: iconst_1
        65: iload_2
        66: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: aastore
        70: aload         6
        72: invokevirtual #87                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        75: goto          79
        78: aconst_null
        79: astore        4
        81: aload         4
        83: instanceof    #138                // class java/lang/Byte
        86: ifeq          97
        89: aload         4
        91: checkcast     #138                // class java/lang/Byte
        94: goto          98
        97: aconst_null
        98: dup
        99: ifnull        108
       102: invokevirtual #142                // Method java/lang/Byte.byteValue:()B
       105: goto          111
       108: pop
       109: bipush        15
       111: istore_3
       112: goto          120
       115: astore        4
       117: bipush        15
       119: istore_3
       120: iload_3
       121: ireturn
      Exception table:
         from    to  target type
             0   112   115   Class java/lang/Exception
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Class;" ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Byte ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Byte ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 253 /* append */
          offset_delta = 4
          locals = [ int, class java/lang/Object ]
      LineNumberTable:
        line 76: 0
        line 77: 1
        line 78: 1
        line 77: 1
        line 78: 37
        line 77: 42
        line 78: 44
        line 77: 81
        line 79: 109
        line 80: 115
        line 81: 117
        line 76: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          117       3     4     e   Ljava/lang/Exception;
            0     122     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0     122     1  geoX   I
            0     122     2  geoY   I

  public java.util.List<ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo> getLayers(int, int);
    descriptor: (II)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: new           #147                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
         3: dup
         4: aload_0
         5: iload_1
         6: iload_2
         7: invokevirtual #149                // Method getHeight:(II)S
        10: aload_0
        11: iload_1
        12: iload_2
        13: invokevirtual #151                // Method getNswe:(II)B
        16: invokespecial #154                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
        19: invokestatic  #160                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        22: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0      23     1  geoX   I
            0      23     2  geoY   I
    Signature: #145                         // (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public boolean isLoaded(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=3
         0: nop
         1: aload_0
         2: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         5: invokevirtual #64                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         8: ldc           #163                // String isLoaded
        10: iconst_2
        11: anewarray     #67                 // class java/lang/Class
        14: astore        6
        16: aload         6
        18: iconst_0
        19: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        22: aastore
        23: aload         6
        25: iconst_1
        26: getstatic     #73                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
        29: aastore
        30: aload         6
        32: invokevirtual #77                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        35: astore        5
        37: aload         5
        39: ifnull        78
        42: aload         5
        44: aload_0
        45: getfield      #16                 // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        48: iconst_2
        49: anewarray     #4                  // class java/lang/Object
        52: astore        6
        54: aload         6
        56: iconst_0
        57: iload_1
        58: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        61: aastore
        62: aload         6
        64: iconst_1
        65: iload_2
        66: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: aastore
        70: aload         6
        72: invokevirtual #87                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        75: goto          79
        78: aconst_null
        79: astore        4
        81: aload         4
        83: instanceof    #165                // class java/lang/Boolean
        86: ifeq          97
        89: aload         4
        91: checkcast     #165                // class java/lang/Boolean
        94: goto          98
        97: aconst_null
        98: dup
        99: ifnull        108
       102: invokevirtual #169                // Method java/lang/Boolean.booleanValue:()Z
       105: goto          110
       108: pop
       109: iconst_1
       110: istore_3
       111: goto          118
       114: astore        4
       116: iconst_1
       117: istore_3
       118: iload_3
       119: ireturn
      Exception table:
         from    to  target type
             0   111   114   Class java/lang/Exception
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Class;" ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, top, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, top, class java/lang/Object, class java/lang/reflect/Method, class "[Ljava/lang/Object;" ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Boolean ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/Boolean ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 253 /* append */
          offset_delta = 3
          locals = [ int, class java/lang/Object ]
      LineNumberTable:
        line 90: 0
        line 91: 1
        line 92: 1
        line 91: 1
        line 92: 37
        line 91: 42
        line 92: 44
        line 91: 81
        line 93: 109
        line 94: 114
        line 95: 116
        line 90: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          116       2     4     e   Ljava/lang/Exception;
            0     120     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0     120     1  geoX   I
            0     120     2  geoY   I

  public boolean hasL2JData(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #20                 // Field geoDataPath:Ljava/nio/file/Path;
         4: iload_1
         5: iload_2
         6: invokedynamic #182,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        11: invokeinterface #188,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        16: invokeinterface #192,  1          // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        21: invokevirtual #197                // Method java/io/File.exists:()Z
        24: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0      25     1 regionX   I
            0      25     2 regionY   I

  public boolean hasConvDatData(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #204                // Method getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
         6: ifnull        13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0      15     1 regionX   I
            0      15     2 regionY   I

  public java.lang.Short getConvDatHeight(int, int);
    descriptor: (II)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=3
         0: iload_1
         1: sipush        256
         4: idiv
         5: bipush        16
         7: iadd
         8: istore_3
         9: iload_2
        10: sipush        256
        13: idiv
        14: bipush        10
        16: iadd
        17: istore        4
        19: aload_0
        20: iload_3
        21: iload         4
        23: invokespecial #204                // Method getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
        26: dup
        27: ifnonnull     33
        30: pop
        31: aconst_null
        32: areturn
        33: astore        5
        35: aload         5
        37: iload_1
        38: sipush        256
        41: irem
        42: iload_2
        43: sipush        256
        46: irem
        47: invokevirtual #209                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile.getHeight:(II)Ljava/lang/Short;
        50: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider, int, int, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile ]
      LineNumberTable:
        line 108: 0
        line 109: 9
        line 110: 19
        line 111: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      42     3 regionX   I
           19      32     4 regionY   I
           35      16     5 convFile   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
            0      51     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
            0      51     1  geoX   I
            0      51     2  geoY   I
    RuntimeInvisibleAnnotations:
      0: #205()
        org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority getSourcePriority();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         4: areturn
      LineNumberTable:
        line 114: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static #324= #6 of #323;         // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #325= #147 of #6;   // LayerInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #326= #51 of #6;    // SourcePriority=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #320= #207 of #2;   // ConvDatFile=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
SourceFile: "GeoEngineGeoDataProvider.kt"
SourceDebugExtension:
  SMAP
  GeoEngineGeoDataProvider.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoEngineGeoDataProvider.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,167:1
  1#2:168
  *E
RuntimeVisibleAnnotations:
  0: #305(#306=[I#307,I#308,I#309],#310=I#311,#312=I#313,#314=[s#315],#316=[s#38,s#317,s#13,s#14,s#17,s#18,s#21,s#24,s#25,s#7,s#8,s#33,s#318,s#295,s#318,s#211,s#57,s#95,s#108,s#109,s#114,s#318,s#134,s#318,s#143,s#318,s#319,s#161,s#318,s#170,s#198,s#199,s#200,s#116,s#117,s#212,s#201,s#253,s#320,s#321])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u001f\u0010!\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\bH\u0016J\u001a\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u001a\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\'"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;","geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","geoDataPath","Ljava/nio/file/Path;","convDatPath","priority","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;","<init>","(Lext/mods/gameserver/geoengine/GeoEngine;Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V","convDatCache","","Lkotlin/Pair;","","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;","getBlockType","Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","geoX","geoY","getHeight","","getNswe","","getLayers","","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;","isLoaded","","hasL2JData","regionX","regionY","hasConvDatData","getConvDatHeight","(II)Ljava/lang/Short;","getSourcePriority","getConvDatFile","loadConvDatFile","ConvDatFile","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #328(#329=[s#330])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoEngineGeoDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngineGeoDataProvider.kt\next/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"]
    )
BootstrapMethods:
  0: #179 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #172 \u0001_\u0001.l2j
  1: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #220 (Ljava/lang/Object;)Ljava/lang/Object;
      #225 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
      #227 (Lkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  2: #234 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #220 (Ljava/lang/Object;)Ljava/lang/Object;
      #242 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider.getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
      #244 (Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  3: #179 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #255 \u0001_\u0001_conv.dat
  4: #179 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #258 \u0001_\u0001.conv.dat
  5: #179 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #261 conv_\u0001_\u0001.dat
