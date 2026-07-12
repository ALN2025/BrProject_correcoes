// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$MultiSourceGeoProvider
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$MultiSourceGeoProvider.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.class
  Last modified 9 de jul de 2026; size 10919 bytes
  MD5 checksum 70a53f45d3a9939428fde31ce797f5d1
  Compiled from "GeoIndexer.kt"
public class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$MultiSourceGeoProvider implements ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 21, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
    #6 = Class              #5            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
    #9 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #10 = Utf8               ()V
   #11 = NameAndType        #7:#10        // "<init>":()V
   #12 = Methodref          #4.#11        // java/lang/Object."<init>":()V
   #13 = Utf8               geoDataPath
   #14 = Utf8               Ljava/nio/file/Path;
   #15 = NameAndType        #13:#14       // geoDataPath:Ljava/nio/file/Path;
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.geoDataPath:Ljava/nio/file/Path;
   #17 = Utf8               convDatPath
   #18 = NameAndType        #17:#14       // convDatPath:Ljava/nio/file/Path;
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.convDatPath:Ljava/nio/file/Path;
   #20 = Utf8               priority
   #21 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #22 = NameAndType        #20:#21       // priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #24 = Utf8               java/util/concurrent/ConcurrentHashMap
   #25 = Class              #24           // java/util/concurrent/ConcurrentHashMap
   #26 = Methodref          #25.#11       // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #27 = Utf8               convDatCache
   #28 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #29 = NameAndType        #27:#28       // convDatCache:Ljava/util/concurrent/ConcurrentHashMap;
   #30 = Fieldref           #2.#29        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.convDatCache:Ljava/util/concurrent/ConcurrentHashMap;
   #31 = Utf8               this
   #32 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
   #33 = Utf8               (Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #34 = Utf8               data/geodata
   #35 = String             #34           // data/geodata
   #36 = Utf8               java/lang/String
   #37 = Class              #36           // java/lang/String
   #38 = Utf8               java/nio/file/Paths
   #39 = Class              #38           // java/nio/file/Paths
   #40 = Utf8               get
   #41 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #42 = NameAndType        #40:#41       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #43 = Methodref          #39.#42       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #44 = Utf8               data/geodata/convdat
   #45 = String             #44           // data/geodata/convdat
   #46 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
   #47 = Class              #46           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
   #48 = Utf8               CONV_DAT_PRIORITY
   #49 = NameAndType        #48:#21       // CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #50 = Fieldref           #47.#49       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #51 = NameAndType        #7:#8         // "<init>":(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
   #52 = Methodref          #2.#51        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider."<init>":(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
   #53 = Utf8               getRawBlockType
   #54 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #55 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
   #56 = Class              #55           // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
   #57 = Utf8               FLAT
   #58 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #59 = NameAndType        #57:#58       // FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #60 = Fieldref           #56.#59       // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #61 = Utf8               geoX
   #62 = Utf8               I
   #63 = Utf8               geoY
   #64 = Utf8               getRawHeight
   #65 = Utf8               (II)S
   #66 = Utf8               getRawNswe
   #67 = Utf8               (II)B
   #68 = Utf8               getRawLayers
   #69 = Utf8               (II)Ljava/util/List;
   #70 = Utf8               (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
   #71 = Utf8               kotlin/collections/CollectionsKt
   #72 = Class              #71           // kotlin/collections/CollectionsKt
   #73 = Utf8               emptyList
   #74 = Utf8               ()Ljava/util/List;
   #75 = NameAndType        #73:#74       // emptyList:()Ljava/util/List;
   #76 = Methodref          #72.#75       // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
   #77 = Utf8               isRawLoaded
   #78 = Utf8               (II)Z
   #79 = Utf8               getBlockType
   #80 = NameAndType        #53:#54       // getRawBlockType:(II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #81 = Methodref          #2.#80        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getRawBlockType:(II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #82 = Utf8               getHeight
   #83 = Utf8               MERGE
   #84 = NameAndType        #83:#21       // MERGE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #85 = Fieldref           #47.#84       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.MERGE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #86 = Utf8               getConvDatHeight
   #87 = Utf8               (II)Ljava/lang/Short;
   #88 = NameAndType        #86:#87       // getConvDatHeight:(II)Ljava/lang/Short;
   #89 = Methodref          #2.#88        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatHeight:(II)Ljava/lang/Short;
   #90 = Utf8               java/lang/Number
   #91 = Class              #90           // java/lang/Number
   #92 = Utf8               shortValue
   #93 = Utf8               ()S
   #94 = NameAndType        #92:#93       // shortValue:()S
   #95 = Methodref          #91.#94       // java/lang/Number.shortValue:()S
   #96 = NameAndType        #64:#65       // getRawHeight:(II)S
   #97 = Methodref          #2.#96        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getRawHeight:(II)S
   #98 = Utf8               $i$a$-let-GeoIndexer$MultiSourceGeoProvider$getHeight$1
   #99 = Utf8               it
  #100 = Utf8               S
  #101 = Utf8               java/lang/Short
  #102 = Class              #101          // java/lang/Short
  #103 = Utf8               getNswe
  #104 = NameAndType        #66:#67       // getRawNswe:(II)B
  #105 = Methodref          #2.#104       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getRawNswe:(II)B
  #106 = Utf8               getLayers
  #107 = NameAndType        #68:#69       // getRawLayers:(II)Ljava/util/List;
  #108 = Methodref          #2.#107       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getRawLayers:(II)Ljava/util/List;
  #109 = Utf8               java/util/Collection
  #110 = Class              #109          // java/util/Collection
  #111 = Utf8               isEmpty
  #112 = Utf8               ()Z
  #113 = NameAndType        #111:#112     // isEmpty:()Z
  #114 = InterfaceMethodref #110.#113     // java/util/Collection.isEmpty:()Z
  #115 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #116 = Class              #115          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #117 = Methodref          #102.#94      // java/lang/Short.shortValue:()S
  #118 = Utf8               first
  #119 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #120 = NameAndType        #118:#119     // first:(Ljava/util/List;)Ljava/lang/Object;
  #121 = Methodref          #72.#120      // kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
  #122 = Utf8               ()B
  #123 = NameAndType        #103:#122     // getNswe:()B
  #124 = Methodref          #116.#123     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.getNswe:()B
  #125 = Utf8               (SB)V
  #126 = NameAndType        #7:#125       // "<init>":(SB)V
  #127 = Methodref          #116.#126     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
  #128 = Utf8               listOf
  #129 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #130 = NameAndType        #128:#129     // listOf:(Ljava/lang/Object;)Ljava/util/List;
  #131 = Methodref          #72.#130      // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
  #132 = Utf8               java/lang/Iterable
  #133 = Class              #132          // java/lang/Iterable
  #134 = Utf8               drop
  #135 = Utf8               (Ljava/lang/Iterable;I)Ljava/util/List;
  #136 = NameAndType        #134:#135     // drop:(Ljava/lang/Iterable;I)Ljava/util/List;
  #137 = Methodref          #72.#136      // kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
  #138 = Utf8               plus
  #139 = Utf8               (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
  #140 = NameAndType        #138:#139     // plus:(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
  #141 = Methodref          #72.#140      // kotlin/collections/CollectionsKt.plus:(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
  #142 = Utf8               rawLayers
  #143 = Utf8               Ljava/util/List;
  #144 = Utf8               convHeight
  #145 = Utf8               Ljava/lang/Short;
  #146 = Utf8               java/util/List
  #147 = Class              #146          // java/util/List
  #148 = Utf8               isLoaded
  #149 = NameAndType        #77:#78       // isRawLoaded:(II)Z
  #150 = Methodref          #2.#149       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.isRawLoaded:(II)Z
  #151 = Utf8               hasL2JData
  #152 = Utf8               \u0001_\u0001.l2j
  #153 = String             #152          // \u0001_\u0001.l2j
  #154 = Utf8               java/lang/invoke/StringConcatFactory
  #155 = Class              #154          // java/lang/invoke/StringConcatFactory
  #156 = Utf8               makeConcatWithConstants
  #157 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #158 = NameAndType        #156:#157     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #159 = Methodref          #155.#158     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #160 = MethodHandle       6:#159        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #161 = Utf8               (II)Ljava/lang/String;
  #162 = NameAndType        #156:#161     // makeConcatWithConstants:(II)Ljava/lang/String;
  #163 = InvokeDynamic      #0:#162       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #164 = Utf8               java/nio/file/Path
  #165 = Class              #164          // java/nio/file/Path
  #166 = Utf8               resolve
  #167 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #168 = NameAndType        #166:#167     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #169 = InterfaceMethodref #165.#168     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #170 = Utf8               toFile
  #171 = Utf8               ()Ljava/io/File;
  #172 = NameAndType        #170:#171     // toFile:()Ljava/io/File;
  #173 = InterfaceMethodref #165.#172     // java/nio/file/Path.toFile:()Ljava/io/File;
  #174 = Utf8               java/io/File
  #175 = Class              #174          // java/io/File
  #176 = Utf8               exists
  #177 = NameAndType        #176:#112     // exists:()Z
  #178 = Methodref          #175.#177     // java/io/File.exists:()Z
  #179 = Utf8               fileName
  #180 = Utf8               Ljava/lang/String;
  #181 = Utf8               regionX
  #182 = Utf8               regionY
  #183 = Utf8               hasConvDatData
  #184 = Utf8               getConvDatFile
  #185 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #186 = NameAndType        #184:#185     // getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #187 = Methodref          #2.#186       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #188 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #189 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
  #190 = Class              #189          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
  #191 = NameAndType        #82:#87       // getHeight:(II)Ljava/lang/Short;
  #192 = Methodref          #190.#191     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile.getHeight:(II)Ljava/lang/Short;
  #193 = Utf8               convFile
  #194 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #195 = Utf8               localX
  #196 = Utf8               localY
  #197 = Utf8               getSourcePriority
  #198 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #199 = Utf8               kotlin/Pair
  #200 = Class              #199          // kotlin/Pair
  #201 = Utf8               java/lang/Integer
  #202 = Class              #201          // java/lang/Integer
  #203 = Utf8               valueOf
  #204 = Utf8               (I)Ljava/lang/Integer;
  #205 = NameAndType        #203:#204     // valueOf:(I)Ljava/lang/Integer;
  #206 = Methodref          #202.#205     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #207 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #208 = NameAndType        #7:#207       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #209 = Methodref          #200.#208     // kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #210 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #211 = MethodType         #210          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #212 = Utf8               getConvDatFile$lambda$0
  #213 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #214 = NameAndType        #212:#213     // getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #215 = Methodref          #2.#214       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #216 = MethodHandle       6:#215        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #217 = Utf8               (Lkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #218 = MethodType         #217          //  (Lkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #219 = Utf8               java/lang/invoke/LambdaMetafactory
  #220 = Class              #219          // java/lang/invoke/LambdaMetafactory
  #221 = Utf8               metafactory
  #222 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #223 = NameAndType        #221:#222     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #224 = Methodref          #220.#223     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #225 = MethodHandle       6:#224        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #226 = Utf8               invoke
  #227 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;II)Lkotlin/jvm/functions/Function1;
  #228 = NameAndType        #226:#227     // invoke:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;II)Lkotlin/jvm/functions/Function1;
  #229 = InvokeDynamic      #1:#228       // #1:invoke:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;II)Lkotlin/jvm/functions/Function1;
  #230 = Utf8               getConvDatFile$lambda$1
  #231 = Utf8               (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #232 = NameAndType        #230:#231     // getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #233 = Methodref          #2.#232       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #234 = MethodHandle       6:#233        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #235 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #236 = MethodType         #235          //  (Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #237 = Utf8               apply
  #238 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
  #239 = NameAndType        #237:#238     // apply:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
  #240 = InvokeDynamic      #2:#239       // #2:apply:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Function;
  #241 = Utf8               computeIfAbsent
  #242 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #243 = NameAndType        #241:#242     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #244 = Methodref          #25.#243      // java/util/concurrent/ConcurrentHashMap.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #245 = Utf8               key
  #246 = Utf8               Lkotlin/Pair;
  #247 = Utf8               loadConvDatFile
  #248 = Utf8               java/lang/Exception
  #249 = Class              #248          // java/lang/Exception
  #250 = Utf8               \u0001_\u0001_conv.dat
  #251 = String             #250          // \u0001_\u0001_conv.dat
  #252 = InvokeDynamic      #3:#162       // #3:makeConcatWithConstants:(II)Ljava/lang/String;
  #253 = Utf8               \u0001_\u0001.conv.dat
  #254 = String             #253          // \u0001_\u0001.conv.dat
  #255 = InvokeDynamic      #4:#162       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #256 = Utf8               conv_\u0001_\u0001.dat
  #257 = String             #256          // conv_\u0001_\u0001.dat
  #258 = InvokeDynamic      #5:#162       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #259 = Utf8               \u0001_\u0001_height.dat
  #260 = String             #259          // \u0001_\u0001_height.dat
  #261 = InvokeDynamic      #6:#162       // #6:makeConcatWithConstants:(II)Ljava/lang/String;
  #262 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #263 = NameAndType        #128:#262     // listOf:([Ljava/lang/Object;)Ljava/util/List;
  #264 = Methodref          #72.#263      // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
  #265 = Utf8               iterator
  #266 = Utf8               ()Ljava/util/Iterator;
  #267 = NameAndType        #265:#266     // iterator:()Ljava/util/Iterator;
  #268 = InterfaceMethodref #147.#267     // java/util/List.iterator:()Ljava/util/Iterator;
  #269 = Utf8               java/util/Iterator
  #270 = Class              #269          // java/util/Iterator
  #271 = Utf8               hasNext
  #272 = NameAndType        #271:#112     // hasNext:()Z
  #273 = InterfaceMethodref #270.#272     // java/util/Iterator.hasNext:()Z
  #274 = Utf8               next
  #275 = Utf8               ()Ljava/lang/Object;
  #276 = NameAndType        #274:#275     // next:()Ljava/lang/Object;
  #277 = InterfaceMethodref #270.#276     // java/util/Iterator.next:()Ljava/lang/Object;
  #278 = Utf8               (Ljava/io/File;)V
  #279 = NameAndType        #7:#278       // "<init>":(Ljava/io/File;)V
  #280 = Methodref          #190.#279     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile."<init>":(Ljava/io/File;)V
  #281 = Utf8               printStackTrace
  #282 = NameAndType        #281:#10      // printStackTrace:()V
  #283 = Methodref          #249.#282     // java/lang/Exception.printStackTrace:()V
  #284 = Utf8               e
  #285 = Utf8               Ljava/lang/Exception;
  #286 = Utf8               file
  #287 = Utf8               Ljava/io/File;
  #288 = Utf8               name
  #289 = Utf8               possibleNames
  #290 = NameAndType        #247:#185     // loadConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #291 = Methodref          #2.#290       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.loadConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #292 = Utf8               this$0
  #293 = Utf8               $regionX
  #294 = Utf8               $regionY
  #295 = Utf8               kotlin/jvm/functions/Function1
  #296 = Class              #295          // kotlin/jvm/functions/Function1
  #297 = NameAndType        #226:#210     // invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #298 = InterfaceMethodref #296.#297     // kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #299 = Utf8               $tmp0
  #300 = Utf8               Lkotlin/jvm/functions/Function1;
  #301 = Utf8               p0
  #302 = Utf8               Ljava/lang/Object;
  #303 = NameAndType        #7:#33        // "<init>":(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #304 = Methodref          #2.#303       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider."<init>":(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #305 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;>;
  #306 = Utf8               Lkotlin/Metadata;
  #307 = Utf8               mv
  #308 = Integer            2
  #309 = Integer            3
  #310 = Integer            0
  #311 = Utf8               k
  #312 = Integer            1
  #313 = Utf8               xi
  #314 = Integer            48
  #315 = Utf8               d1
  #316 = Utf8               \u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0016J\u001f\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0006H\u0016J\u001a\u0010\'\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002J\u001a\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)
  #317 = Utf8               d2
  #318 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #319 = Utf8
  #320 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #321 = Utf8               Brproject
  #322 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #323 = Class              #322          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #324 = Utf8               ConvDatFile
  #325 = Utf8               GeoDataProvider
  #326 = Utf8               LayerInfo
  #327 = Utf8               SourcePriority
  #328 = Utf8               MultiSourceGeoProvider
  #329 = Utf8               GeoIndexer.kt
  #330 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #331 = Utf8               value
  #332 = Utf8               SMAP\nGeoIndexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n1#2:473\n*E\n
  #333 = Utf8               RuntimeInvisibleAnnotations
  #334 = Utf8               Signature
  #335 = Utf8               Code
  #336 = Utf8               LineNumberTable
  #337 = Utf8               LocalVariableTable
  #338 = Utf8               RuntimeInvisibleParameterAnnotations
  #339 = Utf8               StackMapTable
  #340 = Utf8               InnerClasses
  #341 = Utf8               SourceFile
  #342 = Utf8               SourceDebugExtension
  #343 = Utf8               RuntimeVisibleAnnotations
  #344 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$MultiSourceGeoProvider(java.nio.file.Path, java.nio.file.Path, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority);
    descriptor: (Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #16                 // Field geoDataPath:Ljava/nio/file/Path;
         9: aload_0
        10: aload_2
        11: putfield      #19                 // Field convDatPath:Ljava/nio/file/Path;
        14: aload_0
        15: aload_3
        16: putfield      #23                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
        19: aload_0
        20: new           #25                 // class java/util/concurrent/ConcurrentHashMap
        23: dup
        24: invokespecial #26                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        27: putfield      #30                 // Field convDatCache:Ljava/util/concurrent/ConcurrentHashMap;
        30: return
      LineNumberTable:
        line 86: 0
        line 87: 4
        line 88: 9
        line 89: 14
        line 92: 19
        line 86: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0      31     1 geoDataPath   Ljava/nio/file/Path;
            0      31     2 convDatPath   Ljava/nio/file/Path;
            0      31     3 priority   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
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

  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$MultiSourceGeoProvider(java.nio.file.Path, java.nio.file.Path, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_1
         3: iand
         4: ifeq          17
         7: ldc           #35                 // String data/geodata
         9: iconst_0
        10: anewarray     #37                 // class java/lang/String
        13: invokestatic  #43                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        16: astore_1
        17: iload         4
        19: iconst_2
        20: iand
        21: ifeq          34
        24: ldc           #45                 // String data/geodata/convdat
        26: iconst_0
        27: anewarray     #37                 // class java/lang/String
        30: invokestatic  #43                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        33: astore_2
        34: iload         4
        36: iconst_4
        37: iand
        38: ifeq          45
        41: getstatic     #50                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
        44: astore_3
        45: aload_0
        46: aload_1
        47: aload_2
        48: aload_3
        49: invokespecial #52                 // Method "<init>":(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V
        52: return
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 10 /* same */
      LineNumberTable:
        line 86: 0
        line 87: 7
        line 86: 17
        line 88: 24
        line 86: 34
        line 89: 41
        line 86: 45
        line 90: 52

  protected ext.mods.gameserver.geoengine.pathfinding.model.BlockType getRawBlockType(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=3, args_size=3
         0: getstatic     #60                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
         3: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       4     1  geoX   I
            0       4     2  geoY   I
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  protected short getRawHeight(int, int);
    descriptor: (II)S
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       2     1  geoX   I
            0       2     2  geoY   I

  protected byte getRawNswe(int, int);
    descriptor: (II)B
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=3, args_size=3
         0: bipush        15
         2: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       3     1  geoX   I
            0       3     2  geoY   I

  protected java.util.List<ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo> getRawLayers(int, int);
    descriptor: (II)Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=3, args_size=3
         0: invokestatic  #76                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       4     1  geoX   I
            0       4     2  geoY   I
    Signature: #70                          // (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  protected boolean isRawLoaded(int, int);
    descriptor: (II)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       2     1  geoX   I
            0       2     2  geoY   I

  public ext.mods.gameserver.geoengine.pathfinding.model.BlockType getBlockType(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokevirtual #81                 // Method getRawBlockType:(II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
         6: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       7     1  geoX   I
            0       7     2  geoY   I
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public short getHeight(int, int);
    descriptor: (II)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: getfield      #23                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         4: getstatic     #50                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         7: if_acmpeq     20
        10: aload_0
        11: getfield      #23                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
        14: getstatic     #85                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.MERGE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
        17: if_acmpne     43
        20: aload_0
        21: iload_1
        22: iload_2
        23: invokevirtual #89                 // Method getConvDatHeight:(II)Ljava/lang/Short;
        26: dup
        27: ifnull        42
        30: checkcast     #91                 // class java/lang/Number
        33: invokevirtual #95                 // Method java/lang/Number.shortValue:()S
        36: istore_3
        37: iconst_0
        38: istore        4
        40: iload_3
        41: ireturn
        42: pop
        43: aload_0
        44: iload_1
        45: iload_2
        46: invokevirtual #97                 // Method getRawHeight:(II)S
        49: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class java/lang/Short ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 104: 0
        line 105: 10
        line 106: 20
        line 473: 37
        line 106: 40
        line 106: 0
        line 106: 0
        line 108: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40       2     4 $i$a$-let-GeoIndexer$MultiSourceGeoProvider$getHeight$1   I
           37       5     3    it   S
            0      50     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0      50     1  geoX   I
            0      50     2  geoY   I

  public byte getNswe(int, int);
    descriptor: (II)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokevirtual #105                // Method getRawNswe:(II)B
         6: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       7     1  geoX   I
            0       7     2  geoY   I

  public java.util.List<ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo> getLayers(int, int);
    descriptor: (II)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_0
         1: getfield      #23                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         4: getstatic     #50                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.CONV_DAT_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         7: if_acmpne     111
        10: aload_0
        11: iload_1
        12: iload_2
        13: invokevirtual #89                 // Method getConvDatHeight:(II)Ljava/lang/Short;
        16: astore_3
        17: aload_3
        18: ifnull        111
        21: aload_0
        22: iload_1
        23: iload_2
        24: invokevirtual #108                // Method getRawLayers:(II)Ljava/util/List;
        27: astore        4
        29: aload         4
        31: checkcast     #110                // class java/util/Collection
        34: invokeinterface #114,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
        39: ifne          46
        42: iconst_1
        43: goto          47
        46: iconst_0
        47: ifeq          94
        50: new           #116                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        53: dup
        54: aload_3
        55: invokevirtual #117                // Method java/lang/Short.shortValue:()S
        58: aload         4
        60: invokestatic  #121                // Method kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        63: checkcast     #116                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        66: invokevirtual #124                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.getNswe:()B
        69: invokespecial #127                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
        72: invokestatic  #131                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        75: checkcast     #110                // class java/util/Collection
        78: aload         4
        80: checkcast     #133                // class java/lang/Iterable
        83: iconst_1
        84: invokestatic  #137                // Method kotlin/collections/CollectionsKt.drop:(Ljava/lang/Iterable;I)Ljava/util/List;
        87: checkcast     #133                // class java/lang/Iterable
        90: invokestatic  #141                // Method kotlin/collections/CollectionsKt.plus:(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
        93: areturn
        94: new           #116                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        97: dup
        98: aload_3
        99: invokevirtual #117                // Method java/lang/Short.shortValue:()S
       102: bipush        15
       104: invokespecial #127                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
       107: invokestatic  #131                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
       110: areturn
       111: aload_0
       112: iload_1
       113: iload_2
       114: invokevirtual #108                // Method getRawLayers:(II)Ljava/util/List;
       117: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ class java/lang/Short, class java/util/List ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 46 /* same */
        frame_type = 249 /* chop */
          offset_delta = 16
      LineNumberTable:
        line 115: 0
        line 116: 10
        line 117: 17
        line 119: 21
        line 120: 29
        line 120: 47
        line 122: 50
        line 123: 54
        line 124: 58
        line 122: 69
        line 121: 72
        line 126: 78
        line 121: 90
        line 128: 94
        line 131: 111
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      82     4 rawLayers   Ljava/util/List;
           17      94     3 convHeight   Ljava/lang/Short;
            0     118     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0     118     1  geoX   I
            0     118     2  geoY   I
    Signature: #70                          // (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public boolean isLoaded(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokevirtual #150                // Method isRawLoaded:(II)Z
         6: ireturn
      LineNumberTable:
        line 134: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0       7     1  geoX   I
            0       7     2  geoY   I

  public boolean hasL2JData(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: iload_1
         1: iload_2
         2: invokedynamic #163,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
         7: astore_3
         8: aload_0
         9: getfield      #16                 // Field geoDataPath:Ljava/nio/file/Path;
        12: aload_3
        13: invokeinterface #169,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        18: invokeinterface #173,  1          // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        23: invokevirtual #178                // Method java/io/File.exists:()Z
        26: ireturn
      LineNumberTable:
        line 137: 0
        line 138: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      19     3 fileName   Ljava/lang/String;
            0      27     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0      27     1 regionX   I
            0      27     2 regionY   I

  public boolean hasConvDatData(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #187                // Method getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
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
        line 142: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0      15     1 regionX   I
            0      15     2 regionY   I

  public java.lang.Short getConvDatHeight(int, int);
    descriptor: (II)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=3
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
        23: invokespecial #187                // Method getConvDatFile:(II)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
        26: dup
        27: ifnonnull     33
        30: pop
        31: aconst_null
        32: areturn
        33: astore        5
        35: iload_1
        36: sipush        256
        39: irem
        40: istore        6
        42: iload_2
        43: sipush        256
        46: irem
        47: istore        7
        49: aload         5
        51: iload         6
        53: iload         7
        55: invokevirtual #192                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile.getHeight:(II)Ljava/lang/Short;
        58: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider, int, int, int, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile ]
      LineNumberTable:
        line 147: 0
        line 148: 9
        line 150: 19
        line 152: 35
        line 153: 42
        line 155: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      50     3 regionX   I
           19      40     4 regionY   I
           35      24     5 convFile   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
           42      17     6 localX   I
           49      10     7 localY   I
            0      59     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
            0      59     1  geoX   I
            0      59     2  geoY   I
    RuntimeInvisibleAnnotations:
      0: #188()
        org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority getSourcePriority();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field priority:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         4: areturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$MultiSourceGeoProvider();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: aconst_null
         3: aconst_null
         4: bipush        7
         6: aconst_null
         7: invokespecial #304                // Method "<init>":(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        10: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;
}
InnerClasses:
  public static final #324= #190 of #323; // ConvDatFile=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #325= #6 of #323;         // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #326= #116 of #6;   // LayerInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #327= #47 of #6;    // SourcePriority=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static #328= #2 of #323;         // MultiSourceGeoProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
SourceFile: "GeoIndexer.kt"
SourceDebugExtension:
  SMAP
  GeoIndexer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoIndexer.kt
  ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,472:1
  1#2:473
  *E
RuntimeVisibleAnnotations:
  0: #306(#307=[I#308,I#309,I#310],#311=I#312,#313=I#314,#315=[s#316],#317=[s#32,s#318,s#13,s#14,s#17,s#20,s#21,s#7,s#8,s#27,s#28,s#246,s#319,s#194,s#53,s#58,s#61,s#63,s#64,s#319,s#66,s#319,s#68,s#319,s#320,s#77,s#319,s#79,s#82,s#103,s#106,s#148,s#151,s#181,s#182,s#183,s#86,s#87,s#197,s#184,s#247,s#321])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0016J\u001f\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0006H\u0016J\u001a\u0010\'\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002J\u001a\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;","geoDataPath","Ljava/nio/file/Path;","convDatPath","priority","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;","<init>","(Ljava/nio/file/Path;Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;)V","convDatCache","Ljava/util/concurrent/ConcurrentHashMap;","Lkotlin/Pair;","","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;","getRawBlockType","Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","geoX","geoY","getRawHeight","","getRawNswe","","getRawLayers","","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;","isRawLoaded","","getBlockType","getHeight","getNswe","getLayers","isLoaded","hasL2JData","regionX","regionY","hasConvDatData","getConvDatHeight","(II)Ljava/lang/Short;","getSourcePriority","getConvDatFile","loadConvDatFile","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #330(#331=[s#332])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoIndexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n1#2:473\n*E\n"]
    )
BootstrapMethods:
  0: #160 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #153 \u0001_\u0001.l2j
  1: #225 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #211 (Ljava/lang/Object;)Ljava/lang/Object;
      #216 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider;IILkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
      #218 (Lkotlin/Pair;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  2: #225 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #211 (Ljava/lang/Object;)Ljava/lang/Object;
      #234 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider.getConvDatFile$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
      #236 (Ljava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  3: #160 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #251 \u0001_\u0001_conv.dat
  4: #160 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #254 \u0001_\u0001.conv.dat
  5: #160 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #257 conv_\u0001_\u0001.dat
  6: #160 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #260 \u0001_\u0001_height.dat
