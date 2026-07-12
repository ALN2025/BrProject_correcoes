// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\L2BRSerializer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.class
  Last modified 9 de jul de 2026; size 24829 bytes
  MD5 checksum e2552b11249cd38b4b5bcdc8f3f022d7
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 13, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
   #11 = Utf8               serialize
   #12 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
   #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #14 = Utf8               java/lang/Throwable
   #15 = Class              #14           // java/lang/Throwable
   #16 = Utf8               java/nio/file/Path
   #17 = Class              #16           // java/nio/file/Path
   #18 = Utf8               getParent
   #19 = Utf8               ()Ljava/nio/file/Path;
   #20 = NameAndType        #18:#19       // getParent:()Ljava/nio/file/Path;
   #21 = InterfaceMethodref #17.#20       // java/nio/file/Path.getParent:()Ljava/nio/file/Path;
   #22 = Utf8               toFile
   #23 = Utf8               ()Ljava/io/File;
   #24 = NameAndType        #22:#23       // toFile:()Ljava/io/File;
   #25 = InterfaceMethodref #17.#24       // java/nio/file/Path.toFile:()Ljava/io/File;
   #26 = Utf8               java/io/File
   #27 = Class              #26           // java/io/File
   #28 = Utf8               mkdirs
   #29 = Utf8               ()Z
   #30 = NameAndType        #28:#29       // mkdirs:()Z
   #31 = Methodref          #27.#30       // java/io/File.mkdirs:()Z
   #32 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
   #33 = Class              #32           // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
   #34 = Utf8               getNodes
   #35 = Utf8               ()Ljava/util/Map;
   #36 = NameAndType        #34:#35       // getNodes:()Ljava/util/Map;
   #37 = Methodref          #33.#36       // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
   #38 = Utf8               java/util/Map
   #39 = Class              #38           // java/util/Map
   #40 = Utf8               size
   #41 = Utf8               ()I
   #42 = NameAndType        #40:#41       // size:()I
   #43 = InterfaceMethodref #39.#42       // java/util/Map.size:()I
   #44 = Utf8               kotlin/collections/MapsKt
   #45 = Class              #44           // kotlin/collections/MapsKt
   #46 = Utf8               toSortedMap
   #47 = Utf8               (Ljava/util/Map;)Ljava/util/SortedMap;
   #48 = NameAndType        #46:#47       // toSortedMap:(Ljava/util/Map;)Ljava/util/SortedMap;
   #49 = Methodref          #45.#48       // kotlin/collections/MapsKt.toSortedMap:(Ljava/util/Map;)Ljava/util/SortedMap;
   #50 = Utf8               java/util/SortedMap
   #51 = Class              #50           // java/util/SortedMap
   #52 = Utf8               firstKey
   #53 = Utf8               ()Ljava/lang/Object;
   #54 = NameAndType        #52:#53       // firstKey:()Ljava/lang/Object;
   #55 = InterfaceMethodref #51.#54       // java/util/SortedMap.firstKey:()Ljava/lang/Object;
   #56 = Utf8               java/lang/Integer
   #57 = Class              #56           // java/lang/Integer
   #58 = Utf8               intValue
   #59 = NameAndType        #58:#41       // intValue:()I
   #60 = Methodref          #57.#59       // java/lang/Integer.intValue:()I
   #61 = Utf8               lastKey
   #62 = NameAndType        #61:#53       // lastKey:()Ljava/lang/Object;
   #63 = InterfaceMethodref #51.#62       // java/util/SortedMap.lastKey:()Ljava/lang/Object;
   #64 = Utf8               java/io/IOException
   #65 = Class              #64           // java/io/IOException
   #66 = Utf8               IDs dos nós não são sequenciais de 0 a \u0001. Min: \u0001, Max: \u0001, Count: \u0001
   #67 = String             #66           // IDs dos nós não são sequenciais de 0 a \u0001. Min: \u0001, Max: \u0001, Count: \u0001
   #68 = Utf8               java/lang/invoke/StringConcatFactory
   #69 = Class              #68           // java/lang/invoke/StringConcatFactory
   #70 = Utf8               makeConcatWithConstants
   #71 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #72 = NameAndType        #70:#71       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #73 = Methodref          #69.#72       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #74 = MethodHandle       6:#73         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #75 = Utf8               (ILjava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;
   #76 = NameAndType        #70:#75       // makeConcatWithConstants:(ILjava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;
   #77 = InvokeDynamic      #0:#76        // #0:makeConcatWithConstants:(ILjava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;
   #78 = Utf8               (Ljava/lang/String;)V
   #79 = NameAndType        #5:#78        // "<init>":(Ljava/lang/String;)V
   #80 = Methodref          #65.#79       // java/io/IOException."<init>":(Ljava/lang/String;)V
   #81 = Utf8               java/io/ByteArrayOutputStream
   #82 = Class              #81           // java/io/ByteArrayOutputStream
   #83 = Methodref          #82.#7        // java/io/ByteArrayOutputStream."<init>":()V
   #84 = Utf8               java/io/DataOutputStream
   #85 = Class              #84           // java/io/DataOutputStream
   #86 = Utf8               java/io/BufferedOutputStream
   #87 = Class              #86           // java/io/BufferedOutputStream
   #88 = Utf8               com/github/luben/zstd/ZstdOutputStream
   #89 = Class              #88           // com/github/luben/zstd/ZstdOutputStream
   #90 = Utf8               java/io/OutputStream
   #91 = Class              #90           // java/io/OutputStream
   #92 = Utf8               (Ljava/io/OutputStream;I)V
   #93 = NameAndType        #5:#92        // "<init>":(Ljava/io/OutputStream;I)V
   #94 = Methodref          #89.#93       // com/github/luben/zstd/ZstdOutputStream."<init>":(Ljava/io/OutputStream;I)V
   #95 = Utf8               (Ljava/io/OutputStream;)V
   #96 = NameAndType        #5:#95        // "<init>":(Ljava/io/OutputStream;)V
   #97 = Methodref          #87.#96       // java/io/BufferedOutputStream."<init>":(Ljava/io/OutputStream;)V
   #98 = Methodref          #85.#96       // java/io/DataOutputStream."<init>":(Ljava/io/OutputStream;)V
   #99 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
  #100 = Class              #99           // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
  #101 = Utf8               getRegionX
  #102 = NameAndType        #101:#41      // getRegionX:()I
  #103 = Methodref          #33.#102      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionX:()I
  #104 = Utf8               writeInt
  #105 = Utf8               (I)V
  #106 = NameAndType        #104:#105     // writeInt:(I)V
  #107 = Methodref          #85.#106      // java/io/DataOutputStream.writeInt:(I)V
  #108 = Utf8               getRegionY
  #109 = NameAndType        #108:#41      // getRegionY:()I
  #110 = Methodref          #33.#109      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionY:()I
  #111 = Utf8               getSourceType
  #112 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #113 = NameAndType        #111:#112     // getSourceType:()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #114 = Methodref          #33.#113      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getSourceType:()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #115 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #116 = Class              #115          // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #117 = Utf8               ordinal
  #118 = NameAndType        #117:#41      // ordinal:()I
  #119 = Methodref          #116.#118     // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.ordinal:()I
  #120 = Utf8               getGenerationTimeMs
  #121 = Utf8               ()J
  #122 = NameAndType        #120:#121     // getGenerationTimeMs:()J
  #123 = Methodref          #33.#122      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getGenerationTimeMs:()J
  #124 = Utf8               writeLong
  #125 = Utf8               (J)V
  #126 = NameAndType        #124:#125     // writeLong:(J)V
  #127 = Methodref          #85.#126      // java/io/DataOutputStream.writeLong:(J)V
  #128 = Utf8               entrySet
  #129 = Utf8               ()Ljava/util/Set;
  #130 = NameAndType        #128:#129     // entrySet:()Ljava/util/Set;
  #131 = InterfaceMethodref #39.#130      // java/util/Map.entrySet:()Ljava/util/Set;
  #132 = Utf8               java/util/Set
  #133 = Class              #132          // java/util/Set
  #134 = Utf8               iterator
  #135 = Utf8               ()Ljava/util/Iterator;
  #136 = NameAndType        #134:#135     // iterator:()Ljava/util/Iterator;
  #137 = InterfaceMethodref #133.#136     // java/util/Set.iterator:()Ljava/util/Iterator;
  #138 = Utf8               java/util/Iterator
  #139 = Class              #138          // java/util/Iterator
  #140 = Utf8               hasNext
  #141 = NameAndType        #140:#29      // hasNext:()Z
  #142 = InterfaceMethodref #139.#141     // java/util/Iterator.hasNext:()Z
  #143 = Utf8               next
  #144 = NameAndType        #143:#53      // next:()Ljava/lang/Object;
  #145 = InterfaceMethodref #139.#144     // java/util/Iterator.next:()Ljava/lang/Object;
  #146 = Utf8               java/util/Map$Entry
  #147 = Class              #146          // java/util/Map$Entry
  #148 = Utf8               getKey
  #149 = NameAndType        #148:#53      // getKey:()Ljava/lang/Object;
  #150 = InterfaceMethodref #147.#149     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #151 = Utf8               getValue
  #152 = NameAndType        #151:#53      // getValue:()Ljava/lang/Object;
  #153 = InterfaceMethodref #147.#152     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #154 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  #155 = Class              #154          // ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  #156 = Utf8               ID do nó fora dos limites: \u0001 (esperado: 0..\u0001)
  #157 = String             #156          // ID do nó fora dos limites: \u0001 (esperado: 0..\u0001)
  #158 = Utf8               (Ljava/lang/Integer;I)Ljava/lang/String;
  #159 = NameAndType        #70:#158      // makeConcatWithConstants:(Ljava/lang/Integer;I)Ljava/lang/String;
  #160 = InvokeDynamic      #1:#159       // #1:makeConcatWithConstants:(Ljava/lang/Integer;I)Ljava/lang/String;
  #161 = Methodref          #85.#42       // java/io/DataOutputStream.size:()I
  #162 = Utf8               writeNode
  #163 = Utf8               (Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)V
  #164 = NameAndType        #162:#163     // writeNode:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)V
  #165 = Methodref          #2.#164       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.writeNode:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)V
  #166 = Utf8               getX
  #167 = NameAndType        #166:#41      // getX:()I
  #168 = Methodref          #155.#167     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getX:()I
  #169 = Utf8               getY
  #170 = NameAndType        #169:#41      // getY:()I
  #171 = Methodref          #155.#170     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getY:()I
  #172 = Utf8               getZ
  #173 = NameAndType        #172:#41      // getZ:()I
  #174 = Methodref          #155.#173     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getZ:()I
  #175 = Utf8               getOriginalId
  #176 = NameAndType        #175:#41      // getOriginalId:()I
  #177 = Methodref          #155.#176     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getOriginalId:()I
  #178 = Utf8               buildFlags
  #179 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)B
  #180 = NameAndType        #178:#179     // buildFlags:(Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)B
  #181 = Methodref          #2.#180       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.buildFlags:(Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)B
  #182 = Utf8               getEdges
  #183 = Utf8               ()Ljava/util/List;
  #184 = NameAndType        #182:#183     // getEdges:()Ljava/util/List;
  #185 = Methodref          #155.#184     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getEdges:()Ljava/util/List;
  #186 = Utf8               java/util/List
  #187 = Class              #186          // java/util/List
  #188 = InterfaceMethodref #187.#42      // java/util/List.size:()I
  #189 = Utf8               (ISSSIBS)V
  #190 = NameAndType        #5:#189       // "<init>":(ISSSIBS)V
  #191 = Methodref          #100.#190     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry."<init>":(ISSSIBS)V
  #192 = Utf8               kotlin/collections/ArraysKt
  #193 = Class              #192          // kotlin/collections/ArraysKt
  #194 = Utf8               withIndex
  #195 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Iterable;
  #196 = NameAndType        #194:#195     // withIndex:([Ljava/lang/Object;)Ljava/lang/Iterable;
  #197 = Methodref          #193.#196     // kotlin/collections/ArraysKt.withIndex:([Ljava/lang/Object;)Ljava/lang/Iterable;
  #198 = Utf8               java/util/ArrayList
  #199 = Class              #198          // java/util/ArrayList
  #200 = Methodref          #199.#7       // java/util/ArrayList."<init>":()V
  #201 = Utf8               java/util/Collection
  #202 = Class              #201          // java/util/Collection
  #203 = Utf8               java/lang/Iterable
  #204 = Class              #203          // java/lang/Iterable
  #205 = InterfaceMethodref #204.#136     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #206 = Utf8               kotlin/collections/IndexedValue
  #207 = Class              #206          // kotlin/collections/IndexedValue
  #208 = Methodref          #207.#152     // kotlin/collections/IndexedValue.getValue:()Ljava/lang/Object;
  #209 = Utf8               add
  #210 = Utf8               (Ljava/lang/Object;)Z
  #211 = NameAndType        #209:#210     // add:(Ljava/lang/Object;)Z
  #212 = InterfaceMethodref #202.#211     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #213 = Utf8               kotlin/collections/CollectionsKt
  #214 = Class              #213          // kotlin/collections/CollectionsKt
  #215 = Utf8               collectionSizeOrDefault
  #216 = Utf8               (Ljava/lang/Iterable;I)I
  #217 = NameAndType        #215:#216     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #218 = Methodref          #214.#217     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #219 = NameAndType        #5:#105       // "<init>":(I)V
  #220 = Methodref          #199.#219     // java/util/ArrayList."<init>":(I)V
  #221 = Utf8               getIndex
  #222 = NameAndType        #221:#41      // getIndex:()I
  #223 = Methodref          #207.#222     // kotlin/collections/IndexedValue.getIndex:()I
  #224 = Utf8               valueOf
  #225 = Utf8               (I)Ljava/lang/Integer;
  #226 = NameAndType        #224:#225     // valueOf:(I)Ljava/lang/Integer;
  #227 = Methodref          #57.#226      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #228 = Utf8               take
  #229 = Utf8               (Ljava/lang/Iterable;I)Ljava/util/List;
  #230 = NameAndType        #228:#229     // take:(Ljava/lang/Iterable;I)Ljava/util/List;
  #231 = Methodref          #214.#230     // kotlin/collections/CollectionsKt.take:(Ljava/lang/Iterable;I)Ljava/util/List;
  #232 = Utf8               Nós não indexados (buracos): \u0001...
  #233 = String             #232          // Nós não indexados (buracos): \u0001...
  #234 = Utf8               (Ljava/util/List;)Ljava/lang/String;
  #235 = NameAndType        #70:#234      // makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
  #236 = InvokeDynamic      #2:#235       // #2:makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
  #237 = Utf8               getSpatialGrid
  #238 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #239 = NameAndType        #237:#238     // getSpatialGrid:()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #240 = Methodref          #33.#239      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getSpatialGrid:()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #241 = Utf8               writeSpatialGrid
  #242 = Utf8               (Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;)V
  #243 = NameAndType        #241:#242     // writeSpatialGrid:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;)V
  #244 = Methodref          #2.#243       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.writeSpatialGrid:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;)V
  #245 = Utf8               getConnectivity
  #246 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #247 = NameAndType        #245:#246     // getConnectivity:()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #248 = Methodref          #33.#247      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getConnectivity:()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #249 = Utf8               writeConnectivity
  #250 = Utf8               (Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;)V
  #251 = NameAndType        #249:#250     // writeConnectivity:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;)V
  #252 = Methodref          #2.#251       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.writeConnectivity:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;)V
  #253 = Utf8               close
  #254 = NameAndType        #253:#6       // close:()V
  #255 = Methodref          #85.#254      // java/io/DataOutputStream.close:()V
  #256 = Utf8               toByteArray
  #257 = Utf8               ()[B
  #258 = NameAndType        #256:#257     // toByteArray:()[B
  #259 = Methodref          #82.#258      // java/io/ByteArrayOutputStream.toByteArray:()[B
  #260 = Long               64l
  #262 = Utf8               Tamanho do índice não é múltiplo de 32: \u0001
  #263 = String             #262          // Tamanho do índice não é múltiplo de 32: \u0001
  #264 = Utf8               (I)Ljava/lang/String;
  #265 = NameAndType        #70:#264      // makeConcatWithConstants:(I)Ljava/lang/String;
  #266 = InvokeDynamic      #3:#265       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #267 = Utf8               java/io/FileOutputStream
  #268 = Class              #267          // java/io/FileOutputStream
  #269 = Utf8               (Ljava/io/File;)V
  #270 = NameAndType        #5:#269       // "<init>":(Ljava/io/File;)V
  #271 = Methodref          #268.#270     // java/io/FileOutputStream."<init>":(Ljava/io/File;)V
  #272 = Utf8               java/io/Closeable
  #273 = Class              #272          // java/io/Closeable
  #274 = Utf8               java/nio/ByteBuffer
  #275 = Class              #274          // java/nio/ByteBuffer
  #276 = Utf8               allocate
  #277 = Utf8               (I)Ljava/nio/ByteBuffer;
  #278 = NameAndType        #276:#277     // allocate:(I)Ljava/nio/ByteBuffer;
  #279 = Methodref          #275.#278     // java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
  #280 = Utf8               java/nio/ByteOrder
  #281 = Class              #280          // java/nio/ByteOrder
  #282 = Utf8               LITTLE_ENDIAN
  #283 = Utf8               Ljava/nio/ByteOrder;
  #284 = NameAndType        #282:#283     // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #285 = Fieldref           #281.#284     // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #286 = Utf8               order
  #287 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #288 = NameAndType        #286:#287     // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #289 = Methodref          #275.#288     // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #290 = Utf8               MAGIC
  #291 = Utf8               J
  #292 = NameAndType        #290:#291     // MAGIC:J
  #293 = Fieldref           #2.#292       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.MAGIC:J
  #294 = Utf8               putLong
  #295 = Utf8               (J)Ljava/nio/ByteBuffer;
  #296 = NameAndType        #294:#295     // putLong:(J)Ljava/nio/ByteBuffer;
  #297 = Methodref          #275.#296     // java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
  #298 = Utf8               putShort
  #299 = Utf8               (S)Ljava/nio/ByteBuffer;
  #300 = NameAndType        #298:#299     // putShort:(S)Ljava/nio/ByteBuffer;
  #301 = Methodref          #275.#300     // java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
  #302 = Utf8               putInt
  #303 = Utf8               (II)Ljava/nio/ByteBuffer;
  #304 = NameAndType        #302:#303     // putInt:(II)Ljava/nio/ByteBuffer;
  #305 = Methodref          #275.#304     // java/nio/ByteBuffer.putInt:(II)Ljava/nio/ByteBuffer;
  #306 = Utf8               getWalkableCount
  #307 = NameAndType        #306:#41      // getWalkableCount:()I
  #308 = Methodref          #33.#307      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getWalkableCount:()I
  #309 = Utf8               (IJ)Ljava/nio/ByteBuffer;
  #310 = NameAndType        #294:#309     // putLong:(IJ)Ljava/nio/ByteBuffer;
  #311 = Methodref          #275.#310     // java/nio/ByteBuffer.putLong:(IJ)Ljava/nio/ByteBuffer;
  #312 = Utf8               calculateChecksum
  #313 = Utf8               ([B)I
  #314 = NameAndType        #312:#313     // calculateChecksum:([B)I
  #315 = Methodref          #2.#314       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.calculateChecksum:([B)I
  #316 = Utf8               array
  #317 = NameAndType        #316:#257     // array:()[B
  #318 = Methodref          #275.#317     // java/nio/ByteBuffer.array:()[B
  #319 = Utf8               write
  #320 = Utf8               ([B)V
  #321 = NameAndType        #319:#320     // write:([B)V
  #322 = Methodref          #268.#321     // java/io/FileOutputStream.write:([B)V
  #323 = Utf8               Entry nulo no índice na posição \u0001
  #324 = String             #323          // Entry nulo no índice na posição \u0001
  #325 = InvokeDynamic      #4:#265       // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #326 = Utf8               getOffset
  #327 = NameAndType        #326:#41      // getOffset:()I
  #328 = Methodref          #100.#327     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getOffset:()I
  #329 = Methodref          #100.#176     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getOriginalId:()I
  #330 = NameAndType        #302:#277     // putInt:(I)Ljava/nio/ByteBuffer;
  #331 = Methodref          #275.#330     // java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
  #332 = Utf8               ()S
  #333 = NameAndType        #166:#332     // getX:()S
  #334 = Methodref          #100.#333     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getX:()S
  #335 = NameAndType        #169:#332     // getY:()S
  #336 = Methodref          #100.#335     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getY:()S
  #337 = NameAndType        #172:#332     // getZ:()S
  #338 = Methodref          #100.#337     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getZ:()S
  #339 = Utf8               getFlags
  #340 = Utf8               ()B
  #341 = NameAndType        #339:#340     // getFlags:()B
  #342 = Methodref          #100.#341     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getFlags:()B
  #343 = Utf8               put
  #344 = Utf8               (B)Ljava/nio/ByteBuffer;
  #345 = NameAndType        #343:#344     // put:(B)Ljava/nio/ByteBuffer;
  #346 = Methodref          #275.#345     // java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
  #347 = Utf8               getEdgeCount
  #348 = NameAndType        #347:#332     // getEdgeCount:()S
  #349 = Methodref          #100.#348     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getEdgeCount:()S
  #350 = Utf8               position
  #351 = NameAndType        #350:#41      // position:()I
  #352 = Methodref          #275.#351     // java/nio/ByteBuffer.position:()I
  #353 = NameAndType        #350:#277     // position:(I)Ljava/nio/ByteBuffer;
  #354 = Methodref          #275.#353     // java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
  #355 = Utf8               Buffer do índice incompleto: \u0001 vs \u0001
  #356 = String             #355          // Buffer do índice incompleto: \u0001 vs \u0001
  #357 = Utf8               (II)Ljava/lang/String;
  #358 = NameAndType        #70:#357      // makeConcatWithConstants:(II)Ljava/lang/String;
  #359 = InvokeDynamic      #5:#358       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #360 = Utf8               flush
  #361 = NameAndType        #360:#6       // flush:()V
  #362 = Methodref          #268.#361     // java/io/FileOutputStream.flush:()V
  #363 = Utf8               kotlin/Unit
  #364 = Class              #363          // kotlin/Unit
  #365 = Utf8               INSTANCE
  #366 = Utf8               Lkotlin/Unit;
  #367 = NameAndType        #365:#366     // INSTANCE:Lkotlin/Unit;
  #368 = Fieldref           #364.#367     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #369 = Utf8               kotlin/io/CloseableKt
  #370 = Class              #369          // kotlin/io/CloseableKt
  #371 = Utf8               closeFinally
  #372 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #373 = NameAndType        #371:#372     // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #374 = Methodref          #370.#373     // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #375 = Utf8               length
  #376 = NameAndType        #375:#121     // length:()J
  #377 = Methodref          #27.#376      // java/io/File.length:()J
  #378 = Utf8               Tamanho do arquivo incorreto! Esperado: \u0001, Real: \u0001, Diferença: \u0001
  #379 = String             #378          // Tamanho do arquivo incorreto! Esperado: \u0001, Real: \u0001, Diferença: \u0001
  #380 = Utf8               (JJJ)Ljava/lang/String;
  #381 = NameAndType        #70:#380      // makeConcatWithConstants:(JJJ)Ljava/lang/String;
  #382 = InvokeDynamic      #6:#381       // #6:makeConcatWithConstants:(JJJ)Ljava/lang/String;
  #383 = Utf8               getFileName
  #384 = NameAndType        #383:#19      // getFileName:()Ljava/nio/file/Path;
  #385 = InterfaceMethodref #17.#384      // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
  #386 = Utf8               [L2BR] Arquivo gerado com sucesso: \u0001
  #387 = String             #386          // [L2BR] Arquivo gerado com sucesso: \u0001
  #388 = Utf8               (Ljava/nio/file/Path;)Ljava/lang/String;
  #389 = NameAndType        #70:#388      // makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #390 = InvokeDynamic      #7:#389       // #7:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #391 = Utf8               java/lang/System
  #392 = Class              #391          // java/lang/System
  #393 = Utf8               out
  #394 = Utf8               Ljava/io/PrintStream;
  #395 = NameAndType        #393:#394     // out:Ljava/io/PrintStream;
  #396 = Fieldref           #392.#395     // java/lang/System.out:Ljava/io/PrintStream;
  #397 = Utf8               java/io/PrintStream
  #398 = Class              #397          // java/io/PrintStream
  #399 = Utf8               println
  #400 = Utf8               (Ljava/lang/Object;)V
  #401 = NameAndType        #399:#400     // println:(Ljava/lang/Object;)V
  #402 = Methodref          #398.#401     // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #403 = Utf8                      Nodes: \u0001, Index: \u0001 bytes, Data: \u0001 bytes
  #404 = String             #403          //        Nodes: \u0001, Index: \u0001 bytes, Data: \u0001 bytes
  #405 = Utf8               (III)Ljava/lang/String;
  #406 = NameAndType        #70:#405      // makeConcatWithConstants:(III)Ljava/lang/String;
  #407 = InvokeDynamic      #8:#406       // #8:makeConcatWithConstants:(III)Ljava/lang/String;
  #408 = Utf8                      Total: \u0001 bytes, DataOffset: \u0001
  #409 = String             #408          //        Total: \u0001 bytes, DataOffset: \u0001
  #410 = Utf8               (JJ)Ljava/lang/String;
  #411 = NameAndType        #70:#410      // makeConcatWithConstants:(JJ)Ljava/lang/String;
  #412 = InvokeDynamic      #9:#411       // #9:makeConcatWithConstants:(JJ)Ljava/lang/String;
  #413 = Utf8               offset
  #414 = Utf8               I
  #415 = Utf8               $i$a$-forEach-L2BRSerializer$serialize$1
  #416 = Utf8               index
  #417 = Utf8               Ljava/lang/Integer;
  #418 = Utf8               node
  #419 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #420 = Utf8               element$iv
  #421 = Utf8               Ljava/util/Map$Entry;
  #422 = Utf8               $i$f$forEach
  #423 = Utf8               $this$forEach$iv
  #424 = Utf8               Ljava/util/Map;
  #425 = Utf8               $i$a$-any-L2BRSerializer$serialize$2
  #426 = Utf8               it
  #427 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
  #428 = Utf8               Ljava/lang/Object;
  #429 = Utf8               $i$f$any
  #430 = Utf8               $this$any$iv
  #431 = Utf8               [Ljava/lang/Object;
  #432 = Utf8               $i$a$-filter-L2BRSerializer$serialize$missing$1
  #433 = Utf8               Lkotlin/collections/IndexedValue;
  #434 = Utf8               element$iv$iv
  #435 = Utf8               $i$f$filterTo
  #436 = Utf8               $this$filterTo$iv$iv
  #437 = Utf8               Ljava/lang/Iterable;
  #438 = Utf8               destination$iv$iv
  #439 = Utf8               Ljava/util/Collection;
  #440 = Utf8               $i$f$filter
  #441 = Utf8               $this$filter$iv
  #442 = Utf8               $i$a$-map-L2BRSerializer$serialize$missing$2
  #443 = Utf8               item$iv$iv
  #444 = Utf8               $i$f$mapTo
  #445 = Utf8               $this$mapTo$iv$iv
  #446 = Utf8               $i$f$map
  #447 = Utf8               $this$map$iv
  #448 = Utf8               missing
  #449 = Utf8               Ljava/util/List;
  #450 = Utf8               $i$a$-apply-L2BRSerializer$serialize$3$headerBytes$1
  #451 = Utf8               $this$serialize_u24lambda_u244_u240
  #452 = Utf8               Ljava/nio/ByteBuffer;
  #453 = Utf8               $i$a$-apply-L2BRSerializer$serialize$3$1$1
  #454 = Utf8               $this$serialize_u24lambda_u244_u241_u240
  #455 = Utf8               $i$a$-forEachIndexed-L2BRSerializer$serialize$3$1
  #456 = Utf8               i
  #457 = Utf8               entry
  #458 = Utf8               item$iv
  #459 = Utf8               $i$f$forEachIndexed
  #460 = Utf8               index$iv
  #461 = Utf8               $this$forEachIndexed$iv
  #462 = Utf8               $i$a$-use-L2BRSerializer$serialize$3
  #463 = Utf8               headerBytes
  #464 = Utf8               indexBuffer
  #465 = Utf8               fos
  #466 = Utf8               Ljava/io/FileOutputStream;
  #467 = Utf8               nodeCount
  #468 = Utf8               sortedNodes
  #469 = Utf8               Ljava/util/SortedMap;
  #470 = Utf8               dataBuffer
  #471 = Utf8               Ljava/io/ByteArrayOutputStream;
  #472 = Utf8               dataStream
  #473 = Utf8               Ljava/io/DataOutputStream;
  #474 = Utf8               indexEntries
  #475 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
  #476 = Utf8               compressedData
  #477 = Utf8               [B
  #478 = Utf8               indexSize
  #479 = Utf8               dataOffset
  #480 = Utf8               expectedFileSize
  #481 = Utf8               actualSize
  #482 = Utf8               region
  #483 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #484 = Utf8               outputPath
  #485 = Utf8               Ljava/nio/file/Path;
  #486 = Class              #475          // "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;"
  #487 = Class              #477          // "[B"
  #488 = Utf8               deserialize
  #489 = Utf8               (Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #490 = Utf8               java/io/FileInputStream
  #491 = Class              #490          // java/io/FileInputStream
  #492 = Methodref          #491.#270     // java/io/FileInputStream."<init>":(Ljava/io/File;)V
  #493 = Utf8               read
  #494 = NameAndType        #493:#313     // read:([B)I
  #495 = Methodref          #491.#494     // java/io/FileInputStream.read:([B)I
  #496 = Utf8               Header incompleto
  #497 = String             #496          // Header incompleto
  #498 = Utf8               wrap
  #499 = Utf8               ([B)Ljava/nio/ByteBuffer;
  #500 = NameAndType        #498:#499     // wrap:([B)Ljava/nio/ByteBuffer;
  #501 = Methodref          #275.#500     // java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
  #502 = Utf8               getLong
  #503 = NameAndType        #502:#121     // getLong:()J
  #504 = Methodref          #275.#503     // java/nio/ByteBuffer.getLong:()J
  #505 = Utf8               kotlin/text/CharsKt
  #506 = Class              #505          // kotlin/text/CharsKt
  #507 = Utf8               checkRadix
  #508 = Utf8               (I)I
  #509 = NameAndType        #507:#508     // checkRadix:(I)I
  #510 = Methodref          #506.#509     // kotlin/text/CharsKt.checkRadix:(I)I
  #511 = Utf8               java/lang/Long
  #512 = Class              #511          // java/lang/Long
  #513 = Utf8               toString
  #514 = Utf8               (JI)Ljava/lang/String;
  #515 = NameAndType        #513:#514     // toString:(JI)Ljava/lang/String;
  #516 = Methodref          #512.#515     // java/lang/Long.toString:(JI)Ljava/lang/String;
  #517 = Utf8               toString(...)
  #518 = String             #517          // toString(...)
  #519 = Utf8               kotlin/jvm/internal/Intrinsics
  #520 = Class              #519          // kotlin/jvm/internal/Intrinsics
  #521 = Utf8               checkNotNullExpressionValue
  #522 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #523 = NameAndType        #521:#522     // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #524 = Methodref          #520.#523     // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #525 = Utf8               Formato inválido: 0x\u0001
  #526 = String             #525          // Formato inválido: 0x\u0001
  #527 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #528 = NameAndType        #70:#527      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #529 = InvokeDynamic      #10:#528      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #530 = Utf8               getShort
  #531 = NameAndType        #530:#332     // getShort:()S
  #532 = Methodref          #275.#531     // java/nio/ByteBuffer.getShort:()S
  #533 = Utf8               Versão não suportada: \u0001
  #534 = String             #533          // Versão não suportada: \u0001
  #535 = Utf8               (S)Ljava/lang/String;
  #536 = NameAndType        #70:#535      // makeConcatWithConstants:(S)Ljava/lang/String;
  #537 = InvokeDynamic      #11:#536      // #11:makeConcatWithConstants:(S)Ljava/lang/String;
  #538 = Utf8               getInt
  #539 = NameAndType        #538:#41      // getInt:()I
  #540 = Methodref          #275.#539     // java/nio/ByteBuffer.getInt:()I
  #541 = Utf8               IndexOffset inválido: \u0001 (esperado: 64)
  #542 = String             #541          // IndexOffset inválido: \u0001 (esperado: 64)
  #543 = Utf8               (J)Ljava/lang/String;
  #544 = NameAndType        #70:#543      // makeConcatWithConstants:(J)Ljava/lang/String;
  #545 = InvokeDynamic      #12:#544      // #12:makeConcatWithConstants:(J)Ljava/lang/String;
  #546 = Utf8               DataOffset inconsistente: \u0001 vs esperado \u0001
  #547 = String             #546          // DataOffset inconsistente: \u0001 vs esperado \u0001
  #548 = NameAndType        #70:#514      // makeConcatWithConstants:(JI)Ljava/lang/String;
  #549 = InvokeDynamic      #13:#548      // #13:makeConcatWithConstants:(JI)Ljava/lang/String;
  #550 = Utf8               IndexEntrySize incorreto: \u0001 (esperado: 32)
  #551 = String             #550          // IndexEntrySize incorreto: \u0001 (esperado: 32)
  #552 = InvokeDynamic      #14:#265      // #14:makeConcatWithConstants:(I)Ljava/lang/String;
  #553 = Utf8               Arquivo truncado: \u0001 < \u0001
  #554 = String             #553          // Arquivo truncado: \u0001 < \u0001
  #555 = InvokeDynamic      #15:#411      // #15:makeConcatWithConstants:(JJ)Ljava/lang/String;
  #556 = Utf8               skip
  #557 = Utf8               (J)J
  #558 = NameAndType        #556:#557     // skip:(J)J
  #559 = Methodref          #491.#558     // java/io/FileInputStream.skip:(J)J
  #560 = Utf8               Falha ao pular índice
  #561 = String             #560          // Falha ao pular índice
  #562 = Utf8               Dados comprimidos incompletos
  #563 = String             #562          // Dados comprimidos incompletos
  #564 = Utf8               Checksum inválido
  #565 = String             #564          // Checksum inválido
  #566 = Utf8               java/io/DataInputStream
  #567 = Class              #566          // java/io/DataInputStream
  #568 = Utf8               java/io/BufferedInputStream
  #569 = Class              #568          // java/io/BufferedInputStream
  #570 = Utf8               com/github/luben/zstd/ZstdInputStream
  #571 = Class              #570          // com/github/luben/zstd/ZstdInputStream
  #572 = Utf8               java/io/ByteArrayInputStream
  #573 = Class              #572          // java/io/ByteArrayInputStream
  #574 = NameAndType        #5:#320       // "<init>":([B)V
  #575 = Methodref          #573.#574     // java/io/ByteArrayInputStream."<init>":([B)V
  #576 = Utf8               java/io/InputStream
  #577 = Class              #576          // java/io/InputStream
  #578 = Utf8               (Ljava/io/InputStream;)V
  #579 = NameAndType        #5:#578       // "<init>":(Ljava/io/InputStream;)V
  #580 = Methodref          #571.#579     // com/github/luben/zstd/ZstdInputStream."<init>":(Ljava/io/InputStream;)V
  #581 = Methodref          #569.#579     // java/io/BufferedInputStream."<init>":(Ljava/io/InputStream;)V
  #582 = Methodref          #567.#579     // java/io/DataInputStream."<init>":(Ljava/io/InputStream;)V
  #583 = Utf8               readInt
  #584 = NameAndType        #583:#41      // readInt:()I
  #585 = Methodref          #567.#584     // java/io/DataInputStream.readInt:()I
  #586 = Utf8               values
  #587 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #588 = NameAndType        #586:#587     // values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #589 = Methodref          #116.#588     // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #590 = Utf8               SourceType inválido
  #591 = String             #590          // SourceType inválido
  #592 = Utf8               readLong
  #593 = NameAndType        #592:#121     // readLong:()J
  #594 = Methodref          #567.#593     // java/io/DataInputStream.readLong:()J
  #595 = Utf8               readNodes
  #596 = Utf8               (Ljava/io/DataInputStream;I)Ljava/util/Map;
  #597 = NameAndType        #595:#596     // readNodes:(Ljava/io/DataInputStream;I)Ljava/util/Map;
  #598 = Methodref          #2.#597       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.readNodes:(Ljava/io/DataInputStream;I)Ljava/util/Map;
  #599 = Utf8               readSpatialGrid
  #600 = Utf8               (Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #601 = NameAndType        #599:#600     // readSpatialGrid:(Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #602 = Methodref          #2.#601       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.readSpatialGrid:(Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #603 = Utf8               readConnectivity
  #604 = Utf8               (Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #605 = NameAndType        #603:#604     // readConnectivity:(Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #606 = Methodref          #2.#605       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.readConnectivity:(Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #607 = Utf8               Inconsistência de metadados: header(\u0001,\u0001) vs data(\u0001,\u0001)
  #608 = String             #607          // Inconsistência de metadados: header(\u0001,\u0001) vs data(\u0001,\u0001)
  #609 = Utf8               (IIII)Ljava/lang/String;
  #610 = NameAndType        #70:#609      // makeConcatWithConstants:(IIII)Ljava/lang/String;
  #611 = InvokeDynamic      #16:#610      // #16:makeConcatWithConstants:(IIII)Ljava/lang/String;
  #612 = Utf8               (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #613 = NameAndType        #5:#612       // "<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #614 = Methodref          #33.#613      // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #615 = Methodref          #567.#254     // java/io/DataInputStream.close:()V
  #616 = Utf8               $i$a$-getOrElse-L2BRSerializer$deserialize$1$sourceType$1
  #617 = Utf8               readRegionX
  #618 = Utf8               readRegionY
  #619 = Utf8               sourceType
  #620 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #621 = Utf8               genTime
  #622 = Utf8               nodes
  #623 = Utf8               spatialGrid
  #624 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #625 = Utf8               connectivity
  #626 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #627 = Utf8               $i$a$-use-L2BRSerializer$deserialize$1
  #628 = Utf8               header
  #629 = Utf8               buffer
  #630 = Utf8               magic
  #631 = Utf8               version
  #632 = Utf8               S
  #633 = Utf8               regionX
  #634 = Utf8               regionY
  #635 = Utf8               walkableCount
  #636 = Utf8               indexOffset
  #637 = Utf8               checksum
  #638 = Utf8               compressedSize
  #639 = Utf8               indexEntrySize
  #640 = Utf8               expectedIndexSize
  #641 = Utf8               expectedDataOffset
  #642 = Utf8               fileSize
  #643 = Utf8               skipBytes
  #644 = Utf8               Ljava/io/DataInputStream;
  #645 = Utf8               fis
  #646 = Utf8               Ljava/io/FileInputStream;
  #647 = Utf8               inputPath
  #648 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #649 = Class              #648          // "[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;"
  #650 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #651 = Class              #650          // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #652 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #653 = Class              #652          // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #654 = Utf8               isWalkable
  #655 = NameAndType        #654:#29      // isWalkable:()Z
  #656 = Methodref          #155.#655     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.isWalkable:()Z
  #657 = Utf8               isCellEdge
  #658 = NameAndType        #657:#29      // isCellEdge:()Z
  #659 = Methodref          #155.#658     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.isCellEdge:()Z
  #660 = Utf8               flags
  #661 = Utf8               B
  #662 = Utf8               writeShort
  #663 = NameAndType        #662:#105     // writeShort:(I)V
  #664 = Methodref          #85.#663      // java/io/DataOutputStream.writeShort:(I)V
  #665 = Utf8               writeByte
  #666 = NameAndType        #665:#105     // writeByte:(I)V
  #667 = Methodref          #85.#666      // java/io/DataOutputStream.writeByte:(I)V
  #668 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
  #669 = Class              #668          // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
  #670 = Utf8               getTargetId
  #671 = NameAndType        #670:#41      // getTargetId:()I
  #672 = Methodref          #669.#671     // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.getTargetId:()I
  #673 = Utf8               getCost
  #674 = Utf8               ()D
  #675 = NameAndType        #673:#674     // getCost:()D
  #676 = Methodref          #669.#675     // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.getCost:()D
  #677 = Utf8               getType
  #678 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #679 = NameAndType        #677:#678     // getType:()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #680 = Methodref          #669.#679     // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.getType:()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #681 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
  #682 = Class              #681          // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
  #683 = Methodref          #682.#118     // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.ordinal:()I
  #684 = Utf8               $i$a$-forEach-L2BRSerializer$writeNode$1
  #685 = Utf8               edge
  #686 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
  #687 = Utf8               stream
  #688 = Utf8               (Ljava/io/DataInputStream;I)Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;
  #689 = Utf8               Contagem inconsistente: \u0001 vs \u0001
  #690 = String             #689          // Contagem inconsistente: \u0001 vs \u0001
  #691 = InvokeDynamic      #17:#358      // #17:makeConcatWithConstants:(II)Ljava/lang/String;
  #692 = Utf8               it/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap
  #693 = Class              #692          // it/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap
  #694 = Methodref          #693.#219     // it/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap."<init>":(I)V
  #695 = Utf8               readShort
  #696 = NameAndType        #695:#332     // readShort:()S
  #697 = Methodref          #567.#696     // java/io/DataInputStream.readShort:()S
  #698 = Utf8               readByte
  #699 = NameAndType        #698:#340     // readByte:()B
  #700 = Methodref          #567.#699     // java/io/DataInputStream.readByte:()B
  #701 = Double             10.0d
  #703 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #704 = NameAndType        #586:#703     // values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #705 = Methodref          #682.#704     // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #706 = Utf8               WALK
  #707 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #708 = NameAndType        #706:#707     // WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #709 = Fieldref           #682.#708     // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #710 = Utf8               (IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #711 = NameAndType        #5:#710       // "<init>":(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #712 = Methodref          #669.#711     // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge."<init>":(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #713 = Methodref          #199.#211     // java/util/ArrayList.add:(Ljava/lang/Object;)Z
  #714 = Utf8               (IIIIZZLjava/util/List;)V
  #715 = NameAndType        #5:#714       // "<init>":(IIIIZZLjava/util/List;)V
  #716 = Methodref          #155.#715     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node."<init>":(IIIIZZLjava/util/List;)V
  #717 = Utf8               (ILjava/lang/Object;)Ljava/lang/Object;
  #718 = NameAndType        #343:#717     // put:(ILjava/lang/Object;)Ljava/lang/Object;
  #719 = Methodref          #693.#718     // it/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap.put:(ILjava/lang/Object;)Ljava/lang/Object;
  #720 = Utf8               $i$a$-getOrElse-L2BRSerializer$readNodes$1$edges$1$1$1
  #721 = Utf8               $i$a$-repeat-L2BRSerializer$readNodes$1$edges$1$1
  #722 = Utf8               $i$a$-apply-L2BRSerializer$readNodes$1$edges$1
  #723 = Utf8               $this$readNodes_u24lambda_u240_u240
  #724 = Utf8               Ljava/util/ArrayList;
  #725 = Utf8               $i$a$-repeat-L2BRSerializer$readNodes$1
  #726 = Utf8               x
  #727 = Utf8               y
  #728 = Utf8               z
  #729 = Utf8               originalId
  #730 = Utf8               Z
  #731 = Utf8               edgeCount
  #732 = Utf8               edges
  #733 = Utf8               count
  #734 = Utf8               Lit/unimi/dsi/fastutil/ints/Int2ObjectOpenHashMap;
  #735 = Utf8               expectedCount
  #736 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #737 = Class              #736          // "[Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;"
  #738 = Utf8               getCellSize
  #739 = NameAndType        #738:#41      // getCellSize:()I
  #740 = Methodref          #651.#739     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.getCellSize:()I
  #741 = Utf8               getWidth
  #742 = NameAndType        #741:#41      // getWidth:()I
  #743 = Methodref          #651.#742     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.getWidth:()I
  #744 = Utf8               getHeight
  #745 = NameAndType        #744:#41      // getHeight:()I
  #746 = Methodref          #651.#745     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.getHeight:()I
  #747 = Utf8               getCell
  #748 = Utf8               (II)Lit/unimi/dsi/fastutil/ints/IntArrayList;
  #749 = NameAndType        #747:#748     // getCell:(II)Lit/unimi/dsi/fastutil/ints/IntArrayList;
  #750 = Methodref          #651.#749     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.getCell:(II)Lit/unimi/dsi/fastutil/ints/IntArrayList;
  #751 = Utf8               it/unimi/dsi/fastutil/ints/IntArrayList
  #752 = Class              #751          // it/unimi/dsi/fastutil/ints/IntArrayList
  #753 = Methodref          #752.#42      // it/unimi/dsi/fastutil/ints/IntArrayList.size:()I
  #754 = Utf8               $i$a$-forEach-L2BRSerializer$writeSpatialGrid$1
  #755 = Utf8               Lit/unimi/dsi/fastutil/ints/IntArrayList;
  #756 = Utf8               grid
  #757 = Utf8               (III)V
  #758 = NameAndType        #5:#757       // "<init>":(III)V
  #759 = Methodref          #651.#758     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid."<init>":(III)V
  #760 = Utf8               addNode
  #761 = NameAndType        #760:#757     // addNode:(III)V
  #762 = Methodref          #651.#761     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.addNode:(III)V
  #763 = Utf8               $i$a$-repeat-L2BRSerializer$readSpatialGrid$1
  #764 = Utf8               cellSize
  #765 = Utf8               width
  #766 = Utf8               height
  #767 = Methodref          #653.#184     // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity.getEdges:()Ljava/util/List;
  #768 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
  #769 = Class              #768          // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
  #770 = Utf8               getFrom
  #771 = NameAndType        #770:#41      // getFrom:()I
  #772 = Methodref          #769.#771     // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.getFrom:()I
  #773 = Utf8               getTo
  #774 = NameAndType        #773:#41      // getTo:()I
  #775 = Methodref          #769.#774     // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.getTo:()I
  #776 = Methodref          #769.#675     // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.getCost:()D
  #777 = Methodref          #769.#679     // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.getType:()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #778 = Utf8               $i$a$-forEach-L2BRSerializer$writeConnectivity$1
  #779 = Utf8               conn
  #780 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
  #781 = Utf8               (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #782 = NameAndType        #5:#781       // "<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #783 = Methodref          #769.#782     // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection."<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #784 = Utf8               (Ljava/util/List;)V
  #785 = NameAndType        #5:#784       // "<init>":(Ljava/util/List;)V
  #786 = Methodref          #653.#785     // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity."<init>":(Ljava/util/List;)V
  #787 = Utf8               $i$a$-getOrElse-L2BRSerializer$readConnectivity$1$1
  #788 = Utf8               $i$a$-repeat-L2BRSerializer$readConnectivity$1
  #789 = Integer            65521
  #790 = Utf8               byte
  #791 = Utf8               a
  #792 = Utf8               b
  #793 = Utf8               data
  #794 = Utf8               access$getMAGIC$cp
  #795 = Utf8               <clinit>
  #796 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion
  #797 = Class              #796          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion
  #798 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #799 = NameAndType        #5:#798       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #800 = Methodref          #797.#799     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #801 = Utf8               Companion
  #802 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion;
  #803 = NameAndType        #801:#802     // Companion:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion;
  #804 = Fieldref           #2.#803       // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.Companion:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion;
  #805 = Long               5490523817655992320l
  #807 = Utf8               HEADER_SIZE
  #808 = Integer            64
  #809 = Utf8               INDEX_ENTRY_SIZE
  #810 = Integer            32
  #811 = Utf8               ZSTD_LEVEL
  #812 = Integer            3
  #813 = Utf8               MAGIC_STRING
  #814 = Utf8               Ljava/lang/String;
  #815 = Utf8               L2BRv5
  #816 = String             #815          // L2BRv5
  #817 = Utf8               VERSION
  #818 = Integer            5
  #819 = Utf8               Lkotlin/Metadata;
  #820 = Utf8               mv
  #821 = Integer            2
  #822 = Integer            0
  #823 = Utf8               k
  #824 = Integer            1
  #825 = Utf8               xi
  #826 = Integer            48
  #827 = Utf8               d1
  #828 = Utf8               \u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0002¨\u0006%
  #829 = Utf8               d2
  #830 = Utf8
  #831 = Utf8               NodeIndexEntry
  #832 = Utf8               Brproject
  #833 = Utf8               Entry
  #834 = Utf8               L2BRSerializer.kt
  #835 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #836 = Utf8               value
  #837 = Utf8               SMAP\nL2BRSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRSerializer.kt\next/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n221#2,2:436\n13225#3,2:438\n14125#3,3:447\n777#4:440\n873#4,2:441\n1586#4:443\n1661#4,3:444\n1915#4,2:450\n1915#4,2:453\n1915#4,2:455\n1#5:452\n*S KotlinDebug\n*F\n+ 1 L2BRSerializer.kt\next/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer\n*L\n70#1:436,2\n89#1:438,2\n133#1:447,3\n90#1:440\n90#1:441,2\n90#1:443\n90#1:444,3\n283#1:450,2\n336#1:453,2\n358#1:455,2\n*E\n
  #838 = Utf8               RuntimeInvisibleAnnotations
  #839 = Utf8               ConstantValue
  #840 = Utf8               Code
  #841 = Utf8               LineNumberTable
  #842 = Utf8               LocalVariableTable
  #843 = Utf8               StackMapTable
  #844 = Utf8               RuntimeInvisibleParameterAnnotations
  #845 = Utf8               Signature
  #846 = Utf8               InnerClasses
  #847 = Utf8               SourceFile
  #848 = Utf8               SourceDebugExtension
  #849 = Utf8               RuntimeVisibleAnnotations
  #850 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public static final int HEADER_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 64

  public static final int INDEX_ENTRY_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32

  public static final int ZSTD_LEVEL;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final java.lang.String MAGIC_STRING;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: String L2BRv5
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull

  public static final short VERSION;
    descriptor: S
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;

  public final void serialize(ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion, java.nio.file.Path);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=33, args_size=3
         0: aload_2
         1: invokeinterface #21,  1           // InterfaceMethod java/nio/file/Path.getParent:()Ljava/nio/file/Path;
         6: invokeinterface #25,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        11: invokevirtual #31                 // Method java/io/File.mkdirs:()Z
        14: pop
        15: aload_1
        16: invokevirtual #37                 // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
        19: invokeinterface #43,  1           // InterfaceMethod java/util/Map.size:()I
        24: istore_3
        25: aload_1
        26: invokevirtual #37                 // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getNodes:()Ljava/util/Map;
        29: invokestatic  #49                 // Method kotlin/collections/MapsKt.toSortedMap:(Ljava/util/Map;)Ljava/util/SortedMap;
        32: astore        4
        34: aload         4
        36: invokeinterface #55,  1           // InterfaceMethod java/util/SortedMap.firstKey:()Ljava/lang/Object;
        41: checkcast     #57                 // class java/lang/Integer
        44: dup
        45: ifnonnull     52
        48: pop
        49: goto          89
        52: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
        55: ifne          89
        58: aload         4
        60: invokeinterface #63,  1           // InterfaceMethod java/util/SortedMap.lastKey:()Ljava/lang/Object;
        65: checkcast     #57                 // class java/lang/Integer
        68: iload_3
        69: iconst_1
        70: isub
        71: istore        5
        73: dup
        74: ifnonnull     81
        77: pop
        78: goto          89
        81: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
        84: iload         5
        86: if_icmpeq     120
        89: new           #65                 // class java/io/IOException
        92: dup
        93: iload_3
        94: iconst_1
        95: isub
        96: aload         4
        98: invokeinterface #55,  1           // InterfaceMethod java/util/SortedMap.firstKey:()Ljava/lang/Object;
       103: aload         4
       105: invokeinterface #63,  1           // InterfaceMethod java/util/SortedMap.lastKey:()Ljava/lang/Object;
       110: iload_3
       111: invokedynamic #77,  0             // InvokeDynamic #0:makeConcatWithConstants:(ILjava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;
       116: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       119: athrow
       120: new           #82                 // class java/io/ByteArrayOutputStream
       123: dup
       124: invokespecial #83                 // Method java/io/ByteArrayOutputStream."<init>":()V
       127: astore        5
       129: new           #85                 // class java/io/DataOutputStream
       132: dup
       133: new           #87                 // class java/io/BufferedOutputStream
       136: dup
       137: new           #89                 // class com/github/luben/zstd/ZstdOutputStream
       140: dup
       141: aload         5
       143: checkcast     #91                 // class java/io/OutputStream
       146: iconst_3
       147: invokespecial #94                 // Method com/github/luben/zstd/ZstdOutputStream."<init>":(Ljava/io/OutputStream;I)V
       150: checkcast     #91                 // class java/io/OutputStream
       153: invokespecial #97                 // Method java/io/BufferedOutputStream."<init>":(Ljava/io/OutputStream;)V
       156: checkcast     #91                 // class java/io/OutputStream
       159: invokespecial #98                 // Method java/io/DataOutputStream."<init>":(Ljava/io/OutputStream;)V
       162: astore        6
       164: iconst_0
       165: istore        8
       167: iload_3
       168: anewarray     #100                // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
       171: astore        9
       173: iload         8
       175: iload_3
       176: if_icmpge     195
       179: iload         8
       181: istore        10
       183: aload         9
       185: iload         10
       187: aconst_null
       188: aastore
       189: iinc          8, 1
       192: goto          173
       195: aload         9
       197: astore        7
       199: nop
       200: aload         6
       202: aload_1
       203: invokevirtual #103                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionX:()I
       206: invokevirtual #107                // Method java/io/DataOutputStream.writeInt:(I)V
       209: aload         6
       211: aload_1
       212: invokevirtual #110                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionY:()I
       215: invokevirtual #107                // Method java/io/DataOutputStream.writeInt:(I)V
       218: aload         6
       220: aload_1
       221: invokevirtual #114                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getSourceType:()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       224: invokevirtual #119                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.ordinal:()I
       227: invokevirtual #107                // Method java/io/DataOutputStream.writeInt:(I)V
       230: aload         6
       232: aload_1
       233: invokevirtual #123                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getGenerationTimeMs:()J
       236: invokevirtual #127                // Method java/io/DataOutputStream.writeLong:(J)V
       239: aload         6
       241: iload_3
       242: invokevirtual #107                // Method java/io/DataOutputStream.writeInt:(I)V
       245: aload         4
       247: checkcast     #39                 // class java/util/Map
       250: astore        8
       252: iconst_0
       253: istore        9
       255: aload         8
       257: invokeinterface #131,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       262: invokeinterface #137,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       267: astore        10
       269: aload         10
       271: invokeinterface #142,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       276: ifeq          434
       279: aload         10
       281: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       286: checkcast     #147                // class java/util/Map$Entry
       289: astore        11
       291: aload         11
       293: astore        12
       295: iconst_0
       296: istore        13
       298: aload         12
       300: invokeinterface #150,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
       305: checkcast     #57                 // class java/lang/Integer
       308: astore        14
       310: aload         12
       312: invokeinterface #153,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
       317: checkcast     #155                // class ext/mods/gameserver/geoengine/pathfinding/serialization/Node
       320: astore        15
       322: aload         14
       324: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
       327: iflt          339
       330: aload         14
       332: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
       335: iload_3
       336: if_icmplt     357
       339: new           #65                 // class java/io/IOException
       342: dup
       343: aload         14
       345: iload_3
       346: iconst_1
       347: isub
       348: invokedynamic #160,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/Integer;I)Ljava/lang/String;
       353: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       356: athrow
       357: aload         6
       359: invokevirtual #161                // Method java/io/DataOutputStream.size:()I
       362: istore        16
       364: aload_0
       365: aload         6
       367: aload         15
       369: invokespecial #165                // Method writeNode:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)V
       372: aload         7
       374: aload         14
       376: invokevirtual #60                 // Method java/lang/Integer.intValue:()I
       379: new           #100                // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
       382: dup
       383: iload         16
       385: aload         15
       387: invokevirtual #168                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getX:()I
       390: i2s
       391: aload         15
       393: invokevirtual #171                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getY:()I
       396: i2s
       397: aload         15
       399: invokevirtual #174                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getZ:()I
       402: i2s
       403: aload         15
       405: invokevirtual #177                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getOriginalId:()I
       408: aload_0
       409: aload         15
       411: invokespecial #181                // Method buildFlags:(Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;)B
       414: aload         15
       416: invokevirtual #185                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/Node.getEdges:()Ljava/util/List;
       419: invokeinterface #188,  1          // InterfaceMethod java/util/List.size:()I
       424: i2s
       425: invokespecial #191                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry."<init>":(ISSSIBS)V
       428: aastore
       429: nop
       430: nop
       431: goto          269
       434: nop
       435: aload         7
       437: astore        8
       439: iconst_0
       440: istore        9
       442: iconst_0
       443: istore        10
       445: aload         8
       447: arraylength
       448: istore        11
       450: iload         10
       452: iload         11
       454: if_icmpge     494
       457: aload         8
       459: iload         10
       461: aaload
       462: astore        12
       464: aload         12
       466: astore        13
       468: iconst_0
       469: istore        14
       471: aload         13
       473: ifnonnull     480
       476: iconst_1
       477: goto          481
       480: iconst_0
       481: ifeq          488
       484: iconst_1
       485: goto          495
       488: iinc          10, 1
       491: goto          450
       494: iconst_0
       495: ifeq          728
       498: aload         7
       500: invokestatic  #197                // Method kotlin/collections/ArraysKt.withIndex:([Ljava/lang/Object;)Ljava/lang/Iterable;
       503: astore        9
       505: iconst_0
       506: istore        10
       508: aload         9
       510: astore        11
       512: new           #199                // class java/util/ArrayList
       515: dup
       516: invokespecial #200                // Method java/util/ArrayList."<init>":()V
       519: checkcast     #202                // class java/util/Collection
       522: astore        12
       524: iconst_0
       525: istore        13
       527: aload         11
       529: invokeinterface #205,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       534: astore        14
       536: aload         14
       538: invokeinterface #142,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       543: ifeq          594
       546: aload         14
       548: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       553: astore        15
       555: aload         15
       557: checkcast     #207                // class kotlin/collections/IndexedValue
       560: astore        16
       562: iconst_0
       563: istore        17
       565: aload         16
       567: invokevirtual #208                // Method kotlin/collections/IndexedValue.getValue:()Ljava/lang/Object;
       570: ifnonnull     577
       573: iconst_1
       574: goto          578
       577: iconst_0
       578: ifeq          536
       581: aload         12
       583: aload         15
       585: invokeinterface #212,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       590: pop
       591: goto          536
       594: aload         12
       596: checkcast     #187                // class java/util/List
       599: nop
       600: checkcast     #204                // class java/lang/Iterable
       603: astore        9
       605: nop
       606: iconst_0
       607: istore        10
       609: aload         9
       611: astore        11
       613: new           #199                // class java/util/ArrayList
       616: dup
       617: aload         9
       619: bipush        10
       621: invokestatic  #218                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       624: invokespecial #220                // Method java/util/ArrayList."<init>":(I)V
       627: checkcast     #202                // class java/util/Collection
       630: astore        12
       632: iconst_0
       633: istore        13
       635: aload         11
       637: invokeinterface #205,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       642: astore        14
       644: aload         14
       646: invokeinterface #142,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       651: ifeq          697
       654: aload         14
       656: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       661: astore        15
       663: aload         12
       665: aload         15
       667: checkcast     #207                // class kotlin/collections/IndexedValue
       670: astore        16
       672: astore        32
       674: iconst_0
       675: istore        17
       677: aload         16
       679: invokevirtual #223                // Method kotlin/collections/IndexedValue.getIndex:()I
       682: invokestatic  #227                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       685: aload         32
       687: swap
       688: invokeinterface #212,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       693: pop
       694: goto          644
       697: aload         12
       699: checkcast     #187                // class java/util/List
       702: nop
       703: astore        8
       705: new           #65                 // class java/io/IOException
       708: dup
       709: aload         8
       711: checkcast     #204                // class java/lang/Iterable
       714: bipush        10
       716: invokestatic  #231                // Method kotlin/collections/CollectionsKt.take:(Ljava/lang/Iterable;I)Ljava/util/List;
       719: invokedynamic #236,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
       724: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       727: athrow
       728: aload_0
       729: aload         6
       731: aload_1
       732: invokevirtual #240                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getSpatialGrid:()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
       735: invokespecial #244                // Method writeSpatialGrid:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;)V
       738: aload_0
       739: aload         6
       741: aload_1
       742: invokevirtual #248                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getConnectivity:()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
       745: invokespecial #252                // Method writeConnectivity:(Ljava/io/DataOutputStream;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;)V
       748: aload         6
       750: invokevirtual #255                // Method java/io/DataOutputStream.close:()V
       753: goto          766
       756: astore        8
       758: aload         6
       760: invokevirtual #255                // Method java/io/DataOutputStream.close:()V
       763: aload         8
       765: athrow
       766: aload         5
       768: invokevirtual #259                // Method java/io/ByteArrayOutputStream.toByteArray:()[B
       771: astore        8
       773: iload_3
       774: bipush        32
       776: imul
       777: istore        9
       779: ldc2_w        #260                // long 64l
       782: iload         9
       784: i2l
       785: ladd
       786: lstore        10
       788: lload         10
       790: aload         8
       792: arraylength
       793: i2l
       794: ladd
       795: lstore        12
       797: iload         9
       799: bipush        32
       801: irem
       802: ifeq          820
       805: new           #65                 // class java/io/IOException
       808: dup
       809: iload         9
       811: invokedynamic #266,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       816: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       819: athrow
       820: new           #268                // class java/io/FileOutputStream
       823: dup
       824: aload_2
       825: invokeinterface #25,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
       830: invokespecial #271                // Method java/io/FileOutputStream."<init>":(Ljava/io/File;)V
       833: checkcast     #273                // class java/io/Closeable
       836: astore        14
       838: aconst_null
       839: astore        15
       841: nop
       842: aload         14
       844: checkcast     #268                // class java/io/FileOutputStream
       847: astore        16
       849: iconst_0
       850: istore        17
       852: bipush        64
       854: invokestatic  #279                // Method java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
       857: getstatic     #285                // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
       860: invokevirtual #289                // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
       863: astore        18
       865: aload         18
       867: astore        19
       869: iconst_0
       870: istore        20
       872: aload         19
       874: getstatic     #293                // Field MAGIC:J
       877: invokevirtual #297                // Method java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
       880: pop
       881: aload         19
       883: iconst_5
       884: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
       887: pop
       888: aload         19
       890: aload_1
       891: invokevirtual #103                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionX:()I
       894: i2s
       895: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
       898: pop
       899: aload         19
       901: aload_1
       902: invokevirtual #110                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getRegionY:()I
       905: i2s
       906: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
       909: pop
       910: aload         19
       912: bipush        16
       914: iload_3
       915: invokevirtual #305                // Method java/nio/ByteBuffer.putInt:(II)Ljava/nio/ByteBuffer;
       918: pop
       919: aload         19
       921: bipush        20
       923: aload_1
       924: invokevirtual #308                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.getWalkableCount:()I
       927: invokevirtual #305                // Method java/nio/ByteBuffer.putInt:(II)Ljava/nio/ByteBuffer;
       930: pop
       931: aload         19
       933: bipush        24
       935: ldc2_w        #260                // long 64l
       938: invokevirtual #311                // Method java/nio/ByteBuffer.putLong:(IJ)Ljava/nio/ByteBuffer;
       941: pop
       942: aload         19
       944: bipush        32
       946: lload         10
       948: invokevirtual #311                // Method java/nio/ByteBuffer.putLong:(IJ)Ljava/nio/ByteBuffer;
       951: pop
       952: aload         19
       954: bipush        40
       956: aload_0
       957: aload         8
       959: invokespecial #315                // Method calculateChecksum:([B)I
       962: i2l
       963: invokevirtual #311                // Method java/nio/ByteBuffer.putLong:(IJ)Ljava/nio/ByteBuffer;
       966: pop
       967: aload         19
       969: bipush        48
       971: aload         8
       973: arraylength
       974: invokevirtual #305                // Method java/nio/ByteBuffer.putInt:(II)Ljava/nio/ByteBuffer;
       977: pop
       978: aload         19
       980: bipush        52
       982: bipush        32
       984: invokevirtual #305                // Method java/nio/ByteBuffer.putInt:(II)Ljava/nio/ByteBuffer;
       987: pop
       988: nop
       989: aload         18
       991: astore        21
       993: aload         16
       995: aload         21
       997: invokevirtual #318                // Method java/nio/ByteBuffer.array:()[B
      1000: invokevirtual #322                // Method java/io/FileOutputStream.write:([B)V
      1003: iload         9
      1005: invokestatic  #279                // Method java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
      1008: getstatic     #285                // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
      1011: invokevirtual #289                // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
      1014: astore        18
      1016: aload         7
      1018: astore        19
      1020: iconst_0
      1021: istore        20
      1023: iconst_0
      1024: istore        22
      1026: iconst_0
      1027: istore        23
      1029: aload         19
      1031: arraylength
      1032: istore        24
      1034: iload         23
      1036: iload         24
      1038: if_icmpge     1195
      1041: aload         19
      1043: iload         23
      1045: aaload
      1046: astore        25
      1048: iload         22
      1050: iinc          22, 1
      1053: aload         25
      1055: astore        26
      1057: istore        27
      1059: iconst_0
      1060: istore        28
      1062: aload         26
      1064: ifnonnull     1082
      1067: new           #65                 // class java/io/IOException
      1070: dup
      1071: iload         27
      1073: invokedynamic #325,  0            // InvokeDynamic #4:makeConcatWithConstants:(I)Ljava/lang/String;
      1078: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
      1081: athrow
      1082: aload         18
      1084: astore        29
      1086: aload         29
      1088: astore        30
      1090: iconst_0
      1091: istore        31
      1093: aload         30
      1095: aload         26
      1097: invokevirtual #328                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getOffset:()I
      1100: i2l
      1101: invokevirtual #297                // Method java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
      1104: pop
      1105: aload         30
      1107: aload         26
      1109: invokevirtual #329                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getOriginalId:()I
      1112: invokevirtual #331                // Method java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
      1115: pop
      1116: aload         30
      1118: aload         26
      1120: invokevirtual #334                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getX:()S
      1123: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
      1126: pop
      1127: aload         30
      1129: aload         26
      1131: invokevirtual #336                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getY:()S
      1134: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
      1137: pop
      1138: aload         30
      1140: aload         26
      1142: invokevirtual #338                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getZ:()S
      1145: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
      1148: pop
      1149: aload         30
      1151: aload         26
      1153: invokevirtual #342                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getFlags:()B
      1156: invokevirtual #346                // Method java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
      1159: pop
      1160: aload         30
      1162: aload         26
      1164: invokevirtual #349                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.getEdgeCount:()S
      1167: invokevirtual #301                // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
      1170: pop
      1171: aload         30
      1173: aload         30
      1175: invokevirtual #352                // Method java/nio/ByteBuffer.position:()I
      1178: bipush        11
      1180: iadd
      1181: invokevirtual #354                // Method java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
      1184: pop
      1185: nop
      1186: nop
      1187: nop
      1188: nop
      1189: iinc          23, 1
      1192: goto          1034
      1195: nop
      1196: aload         18
      1198: invokevirtual #352                // Method java/nio/ByteBuffer.position:()I
      1201: iload         9
      1203: if_icmpeq     1226
      1206: new           #65                 // class java/io/IOException
      1209: dup
      1210: aload         18
      1212: invokevirtual #352                // Method java/nio/ByteBuffer.position:()I
      1215: iload         9
      1217: invokedynamic #359,  0            // InvokeDynamic #5:makeConcatWithConstants:(II)Ljava/lang/String;
      1222: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
      1225: athrow
      1226: aload         16
      1228: aload         18
      1230: invokevirtual #318                // Method java/nio/ByteBuffer.array:()[B
      1233: invokevirtual #322                // Method java/io/FileOutputStream.write:([B)V
      1236: aload         16
      1238: aload         8
      1240: invokevirtual #322                // Method java/io/FileOutputStream.write:([B)V
      1243: aload         16
      1245: invokevirtual #362                // Method java/io/FileOutputStream.flush:()V
      1248: nop
      1249: getstatic     #368                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      1252: astore        16
      1254: aload         14
      1256: aload         15
      1258: invokestatic  #374                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
      1261: goto          1285
      1264: astore        17
      1266: aload         17
      1268: astore        15
      1270: aload         17
      1272: athrow
      1273: astore        17
      1275: aload         14
      1277: aload         15
      1279: invokestatic  #374                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
      1282: aload         17
      1284: athrow
      1285: aload_2
      1286: invokeinterface #25,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
      1291: invokevirtual #377                // Method java/io/File.length:()J
      1294: lstore        14
      1296: lload         14
      1298: lload         12
      1300: lcmp
      1301: ifeq          1326
      1304: new           #65                 // class java/io/IOException
      1307: dup
      1308: lload         12
      1310: lload         14
      1312: lload         12
      1314: lload         14
      1316: lsub
      1317: invokedynamic #382,  0            // InvokeDynamic #6:makeConcatWithConstants:(JJJ)Ljava/lang/String;
      1322: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
      1325: athrow
      1326: aload_2
      1327: invokeinterface #385,  1          // InterfaceMethod java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
      1332: invokedynamic #390,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
      1337: getstatic     #396                // Field java/lang/System.out:Ljava/io/PrintStream;
      1340: swap
      1341: invokevirtual #402                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      1344: iload_3
      1345: iload         9
      1347: aload         8
      1349: arraylength
      1350: invokedynamic #407,  0            // InvokeDynamic #8:makeConcatWithConstants:(III)Ljava/lang/String;
      1355: getstatic     #396                // Field java/lang/System.out:Ljava/io/PrintStream;
      1358: swap
      1359: invokevirtual #402                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      1362: lload         14
      1364: lload         10
      1366: invokedynamic #412,  0            // InvokeDynamic #9:makeConcatWithConstants:(JJ)Ljava/lang/String;
      1371: getstatic     #396                // Field java/lang/System.out:Ljava/io/PrintStream;
      1374: swap
      1375: invokevirtual #402                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      1378: return
      Exception table:
         from    to  target type
           199   748   756   any
           756   758   756   any
           841  1254  1264   Class java/lang/Throwable
           841  1254  1273   any
          1264  1273  1273   any
          1273  1275  1273   any
      StackMapTable: number_of_entries = 34
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap ]
          stack = [ class java/lang/Integer ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, int ]
          stack = [ class java/lang/Integer ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, top, int, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;" ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class java/util/Map, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class java/util/Map, int, class java/util/Iterator, class java/util/Map$Entry, class java/util/Map$Entry, int, class java/lang/Integer, class ext/mods/gameserver/geoengine/pathfinding/serialization/Node ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class java/util/Map, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, int, int ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry, class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 6 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 40
          locals = [ class java/lang/Object, class kotlin/collections/IndexedValue, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 15
        frame_type = 49 /* same */
        frame_type = 52 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;" ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 213
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, class java/io/Closeable, null, class java/io/FileOutputStream, int, class java/nio/ByteBuffer, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, class java/nio/ByteBuffer, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, class java/io/Closeable, null, class java/io/FileOutputStream, int, class java/nio/ByteBuffer, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, class java/nio/ByteBuffer, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry, class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, class java/io/Closeable, null, class java/io/FileOutputStream, int, class java/nio/ByteBuffer, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, class java/nio/ByteBuffer, int, int, int ]
          stack = []
        frame_type = 30 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, class java/io/Closeable, null ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, class java/io/Closeable, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, class java/io/Closeable, null, class kotlin/Unit, int, class java/nio/ByteBuffer, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, class java/nio/ByteBuffer, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/nio/file/Path, int, class java/util/SortedMap, class java/io/ByteArrayOutputStream, class java/io/DataOutputStream, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", class "[B", int, long, long, long, class kotlin/Unit, int, class java/nio/ByteBuffer, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;", int, class java/nio/ByteBuffer, int, int, int ]
          stack = []
      LineNumberTable:
        line 46: 0
        line 48: 15
        line 49: 25
        line 51: 34
        line 52: 89
        line 53: 96
        line 52: 116
        line 56: 120
        line 57: 129
        line 59: 164
        line 61: 199
        line 63: 200
        line 64: 209
        line 65: 218
        line 66: 230
        line 68: 239
        line 70: 245
        line 436: 255
        line 436: 267
        line 71: 322
        line 72: 339
        line 75: 357
        line 76: 364
        line 78: 372
        line 79: 383
        line 80: 385
        line 81: 391
        line 82: 397
        line 83: 403
        line 84: 408
        line 85: 414
        line 78: 425
        line 87: 429
        line 436: 430
        line 437: 434
        line 89: 435
        line 438: 442
        line 89: 471
        line 438: 481
        line 439: 494
        line 89: 495
        line 90: 498
        line 440: 508
        line 441: 527
        line 90: 565
        line 441: 578
        line 442: 594
        line 440: 599
        line 90: 605
        line 443: 609
        line 444: 635
        line 445: 663
        line 90: 677
        line 445: 688
        line 446: 697
        line 443: 702
        line 90: 703
        line 91: 705
        line 94: 728
        line 95: 738
        line 98: 748
        line 99: 753
        line 98: 756
        line 101: 766
        line 102: 773
        line 103: 779
        line 104: 788
        line 106: 797
        line 107: 805
        line 110: 820
        line 112: 852
        line 113: 857
        line 114: 865
        line 115: 872
        line 116: 881
        line 117: 888
        line 118: 899
        line 120: 910
        line 121: 919
        line 122: 931
        line 123: 942
        line 124: 952
        line 125: 967
        line 126: 978
        line 128: 988
        line 114: 989
        line 114: 991
        line 112: 991
        line 129: 993
        line 131: 1003
        line 133: 1016
        line 447: 1023
        line 448: 1026
        line 134: 1062
        line 135: 1067
        line 138: 1082
        line 139: 1093
        line 140: 1105
        line 141: 1116
        line 142: 1127
        line 143: 1138
        line 144: 1149
        line 145: 1160
        line 147: 1171
        line 148: 1185
        line 138: 1186
        line 149: 1187
        line 448: 1188
        line 449: 1195
        line 151: 1196
        line 152: 1206
        line 155: 1226
        line 156: 1236
        line 157: 1243
        line 158: 1248
        line 110: 1252
        line 160: 1285
        line 161: 1296
        line 162: 1304
        line 163: 1310
        line 162: 1322
        line 166: 1326
        line 167: 1344
        line 168: 1362
        line 169: 1378
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          364      65    16 offset   I
          298     132    13 $i$a$-forEach-L2BRSerializer$serialize$1   I
          310     120    14 index   Ljava/lang/Integer;
          322     108    15  node   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
          291     140    11 element$iv   Ljava/util/Map$Entry;
          255     180     9 $i$f$forEach   I
          252     183     8 $this$forEach$iv   Ljava/util/Map;
          471      10    14 $i$a$-any-L2BRSerializer$serialize$2   I
          468      13    13    it   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
          464      24    12 element$iv   Ljava/lang/Object;
          442      53     9 $i$f$any   I
          439      56     8 $this$any$iv   [Ljava/lang/Object;
          565      13    17 $i$a$-filter-L2BRSerializer$serialize$missing$1   I
          562      16    16    it   Lkotlin/collections/IndexedValue;
          555      36    15 element$iv$iv   Ljava/lang/Object;
          527      69    13 $i$f$filterTo   I
          524      72    11 $this$filterTo$iv$iv   Ljava/lang/Iterable;
          524      72    12 destination$iv$iv   Ljava/util/Collection;
          508      92    10 $i$f$filter   I
          505      95     9 $this$filter$iv   Ljava/lang/Iterable;
          677       5    17 $i$a$-map-L2BRSerializer$serialize$missing$2   I
          674       8    16    it   Lkotlin/collections/IndexedValue;
          663      31    15 item$iv$iv   Ljava/lang/Object;
          635      64    13 $i$f$mapTo   I
          632      67    11 $this$mapTo$iv$iv   Ljava/lang/Iterable;
          632      67    12 destination$iv$iv   Ljava/util/Collection;
          609      94    10 $i$f$map   I
          606      97     9 $this$map$iv   Ljava/lang/Iterable;
          705      23     8 missing   Ljava/util/List;
          872     117    20 $i$a$-apply-L2BRSerializer$serialize$3$headerBytes$1   I
          869     120    19 $this$serialize_u24lambda_u244_u240   Ljava/nio/ByteBuffer;
         1093      93    31 $i$a$-apply-L2BRSerializer$serialize$3$1$1   I
         1090      96    30 $this$serialize_u24lambda_u244_u241_u240   Ljava/nio/ByteBuffer;
         1062     126    28 $i$a$-forEachIndexed-L2BRSerializer$serialize$3$1   I
         1059     129    27     i   I
         1059     129    26 entry   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
         1048     141    25 item$iv   Ljava/lang/Object;
         1023     173    20 $i$f$forEachIndexed   I
         1026     170    22 index$iv   I
         1020     176    19 $this$forEachIndexed$iv   [Ljava/lang/Object;
          852     397    17 $i$a$-use-L2BRSerializer$serialize$3   I
          993     256    21 headerBytes   Ljava/nio/ByteBuffer;
         1016     233    18 indexBuffer   Ljava/nio/ByteBuffer;
          849     400    16   fos   Ljava/io/FileOutputStream;
           25    1354     3 nodeCount   I
           34    1345     4 sortedNodes   Ljava/util/SortedMap;
          129    1250     5 dataBuffer   Ljava/io/ByteArrayOutputStream;
          164    1215     6 dataStream   Ljava/io/DataOutputStream;
          199    1180     7 indexEntries   [Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
          773     606     8 compressedData   [B
          779     600     9 indexSize   I
          788     591    10 dataOffset   J
          797     582    12 expectedFileSize   J
         1296      83    14 actualSize   J
            0    1379     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
            0    1379     1 region   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
            0    1379     2 outputPath   Ljava/nio/file/Path;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #13()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion deserialize(java.nio.file.Path);
    descriptor: (Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=44, args_size=2
         0: new           #491                // class java/io/FileInputStream
         3: dup
         4: aload_1
         5: invokeinterface #25,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
        10: invokespecial #492                // Method java/io/FileInputStream."<init>":(Ljava/io/File;)V
        13: checkcast     #273                // class java/io/Closeable
        16: astore_2
        17: aconst_null
        18: astore_3
        19: nop
        20: aload_2
        21: checkcast     #491                // class java/io/FileInputStream
        24: astore        4
        26: iconst_0
        27: istore        5
        29: bipush        64
        31: newarray       byte
        33: astore        6
        35: aload         4
        37: aload         6
        39: invokevirtual #495                // Method java/io/FileInputStream.read:([B)I
        42: bipush        64
        44: if_icmpeq     58
        47: new           #65                 // class java/io/IOException
        50: dup
        51: ldc_w         #497                // String Header incompleto
        54: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
        57: athrow
        58: aload         6
        60: invokestatic  #501                // Method java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        63: getstatic     #285                // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        66: invokevirtual #289                // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        69: astore        7
        71: aload         7
        73: invokevirtual #504                // Method java/nio/ByteBuffer.getLong:()J
        76: lstore        8
        78: lload         8
        80: getstatic     #293                // Field MAGIC:J
        83: lcmp
        84: ifeq          117
        87: new           #65                 // class java/io/IOException
        90: dup
        91: lload         8
        93: bipush        16
        95: invokestatic  #510                // Method kotlin/text/CharsKt.checkRadix:(I)I
        98: invokestatic  #516                // Method java/lang/Long.toString:(JI)Ljava/lang/String;
       101: dup
       102: ldc_w         #518                // String toString(...)
       105: invokestatic  #524                // Method kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
       108: invokedynamic #529,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       113: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       116: athrow
       117: aload         7
       119: invokevirtual #532                // Method java/nio/ByteBuffer.getShort:()S
       122: istore        10
       124: iload         10
       126: iconst_5
       127: if_icmpeq     145
       130: new           #65                 // class java/io/IOException
       133: dup
       134: iload         10
       136: invokedynamic #537,  0            // InvokeDynamic #11:makeConcatWithConstants:(S)Ljava/lang/String;
       141: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       144: athrow
       145: aload         7
       147: invokevirtual #532                // Method java/nio/ByteBuffer.getShort:()S
       150: istore        11
       152: aload         7
       154: invokevirtual #532                // Method java/nio/ByteBuffer.getShort:()S
       157: istore        12
       159: aload         7
       161: aload         7
       163: invokevirtual #352                // Method java/nio/ByteBuffer.position:()I
       166: iconst_2
       167: iadd
       168: invokevirtual #354                // Method java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
       171: pop
       172: aload         7
       174: invokevirtual #540                // Method java/nio/ByteBuffer.getInt:()I
       177: istore        13
       179: aload         7
       181: invokevirtual #540                // Method java/nio/ByteBuffer.getInt:()I
       184: istore        14
       186: aload         7
       188: invokevirtual #504                // Method java/nio/ByteBuffer.getLong:()J
       191: lstore        15
       193: aload         7
       195: invokevirtual #504                // Method java/nio/ByteBuffer.getLong:()J
       198: lstore        17
       200: aload         7
       202: invokevirtual #504                // Method java/nio/ByteBuffer.getLong:()J
       205: lstore        19
       207: aload         7
       209: invokevirtual #540                // Method java/nio/ByteBuffer.getInt:()I
       212: istore        21
       214: aload         7
       216: invokevirtual #540                // Method java/nio/ByteBuffer.getInt:()I
       219: istore        22
       221: lload         15
       223: ldc2_w        #260                // long 64l
       226: lcmp
       227: ifeq          245
       230: new           #65                 // class java/io/IOException
       233: dup
       234: lload         15
       236: invokedynamic #545,  0            // InvokeDynamic #12:makeConcatWithConstants:(J)Ljava/lang/String;
       241: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       244: athrow
       245: iload         13
       247: bipush        32
       249: imul
       250: istore        23
       252: bipush        64
       254: iload         23
       256: iadd
       257: istore        24
       259: lload         17
       261: iload         24
       263: i2l
       264: lcmp
       265: ifeq          285
       268: new           #65                 // class java/io/IOException
       271: dup
       272: lload         17
       274: iload         24
       276: invokedynamic #549,  0            // InvokeDynamic #13:makeConcatWithConstants:(JI)Ljava/lang/String;
       281: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       284: athrow
       285: iload         22
       287: bipush        32
       289: if_icmpeq     307
       292: new           #65                 // class java/io/IOException
       295: dup
       296: iload         22
       298: invokedynamic #552,  0            // InvokeDynamic #14:makeConcatWithConstants:(I)Ljava/lang/String;
       303: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       306: athrow
       307: aload_1
       308: invokeinterface #25,  1           // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
       313: invokevirtual #377                // Method java/io/File.length:()J
       316: lstore        25
       318: lload         17
       320: iload         21
       322: i2l
       323: ladd
       324: lstore        27
       326: lload         25
       328: lload         27
       330: lcmp
       331: ifge          351
       334: new           #65                 // class java/io/IOException
       337: dup
       338: lload         25
       340: lload         27
       342: invokedynamic #555,  0            // InvokeDynamic #15:makeConcatWithConstants:(JJ)Ljava/lang/String;
       347: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       350: athrow
       351: lload         17
       353: bipush        64
       355: i2l
       356: lsub
       357: lstore        29
       359: aload         4
       361: lload         29
       363: invokevirtual #559                // Method java/io/FileInputStream.skip:(J)J
       366: lload         29
       368: lcmp
       369: ifeq          383
       372: new           #65                 // class java/io/IOException
       375: dup
       376: ldc_w         #561                // String Falha ao pular índice
       379: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       382: athrow
       383: iload         21
       385: newarray       byte
       387: astore        31
       389: aload         4
       391: aload         31
       393: invokevirtual #495                // Method java/io/FileInputStream.read:([B)I
       396: iload         21
       398: if_icmpeq     412
       401: new           #65                 // class java/io/IOException
       404: dup
       405: ldc_w         #563                // String Dados comprimidos incompletos
       408: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       411: athrow
       412: aload_0
       413: aload         31
       415: invokespecial #315                // Method calculateChecksum:([B)I
       418: i2l
       419: lload         19
       421: lcmp
       422: ifeq          436
       425: new           #65                 // class java/io/IOException
       428: dup
       429: ldc_w         #565                // String Checksum inválido
       432: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       435: athrow
       436: new           #567                // class java/io/DataInputStream
       439: dup
       440: new           #569                // class java/io/BufferedInputStream
       443: dup
       444: new           #571                // class com/github/luben/zstd/ZstdInputStream
       447: dup
       448: new           #573                // class java/io/ByteArrayInputStream
       451: dup
       452: aload         31
       454: invokespecial #575                // Method java/io/ByteArrayInputStream."<init>":([B)V
       457: checkcast     #577                // class java/io/InputStream
       460: invokespecial #580                // Method com/github/luben/zstd/ZstdInputStream."<init>":(Ljava/io/InputStream;)V
       463: checkcast     #577                // class java/io/InputStream
       466: invokespecial #581                // Method java/io/BufferedInputStream."<init>":(Ljava/io/InputStream;)V
       469: checkcast     #577                // class java/io/InputStream
       472: invokespecial #582                // Method java/io/DataInputStream."<init>":(Ljava/io/InputStream;)V
       475: astore        32
       477: nop
       478: aload         32
       480: invokevirtual #585                // Method java/io/DataInputStream.readInt:()I
       483: istore        33
       485: aload         32
       487: invokevirtual #585                // Method java/io/DataInputStream.readInt:()I
       490: istore        34
       492: invokestatic  #589                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.values:()[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       495: astore        35
       497: aload         32
       499: invokevirtual #585                // Method java/io/DataInputStream.readInt:()I
       502: istore        36
       504: iconst_0
       505: iload         36
       507: if_icmpgt     526
       510: iload         36
       512: aload         35
       514: arraylength
       515: if_icmpge     522
       518: iconst_1
       519: goto          527
       522: iconst_0
       523: goto          527
       526: iconst_0
       527: ifeq          538
       530: aload         35
       532: iload         36
       534: aaload
       535: goto          556
       538: iload         36
       540: istore        37
       542: iconst_0
       543: istore        38
       545: new           #65                 // class java/io/IOException
       548: dup
       549: ldc_w         #591                // String SourceType inválido
       552: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       555: athrow
       556: astore        39
       558: aload         32
       560: invokevirtual #594                // Method java/io/DataInputStream.readLong:()J
       563: lstore        40
       565: aload_0
       566: aload         32
       568: iload         13
       570: invokespecial #598                // Method readNodes:(Ljava/io/DataInputStream;I)Ljava/util/Map;
       573: astore        37
       575: aload_0
       576: aload         32
       578: invokespecial #602                // Method readSpatialGrid:(Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
       581: astore        38
       583: aload_0
       584: aload         32
       586: invokespecial #606                // Method readConnectivity:(Ljava/io/DataInputStream;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
       589: astore        42
       591: iload         33
       593: iload         11
       595: if_icmpne     605
       598: iload         34
       600: iload         12
       602: if_icmpeq     626
       605: new           #65                 // class java/io/IOException
       608: dup
       609: iload         11
       611: iload         12
       613: iload         33
       615: iload         34
       617: invokedynamic #611,  0            // InvokeDynamic #16:makeConcatWithConstants:(IIII)Ljava/lang/String;
       622: invokespecial #80                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
       625: athrow
       626: new           #33                 // class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
       629: dup
       630: iload         11
       632: iload         12
       634: aload         37
       636: iload         14
       638: aload         38
       640: aload         42
       642: aload         39
       644: lload         40
       646: invokespecial #614                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
       649: astore        33
       651: aload         32
       653: invokevirtual #615                // Method java/io/DataInputStream.close:()V
       656: goto          669
       659: astore        34
       661: aload         32
       663: invokevirtual #615                // Method java/io/DataInputStream.close:()V
       666: aload         34
       668: athrow
       669: aload         33
       671: astore        43
       673: aload_2
       674: aload_3
       675: invokestatic  #374                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       678: aload         43
       680: areturn
       681: astore        5
       683: aload         5
       685: astore_3
       686: aload         5
       688: athrow
       689: astore        5
       691: aload_2
       692: aload_3
       693: invokestatic  #374                // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       696: aload         5
       698: athrow
      Exception table:
         from    to  target type
           477   651   659   any
           659   661   659   any
            19   673   681   Class java/lang/Throwable
            19   673   689   any
           681   689   689   any
           689   691   689   any
      StackMapTable: number_of_entries = 21
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null, class java/io/FileInputStream, int, class "[B" ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 58
          locals = [ class java/nio/ByteBuffer, long ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 99
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null, class java/io/FileInputStream, int, class "[B", class java/nio/ByteBuffer, long, int, int, int, int, int, long, long, long, int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ int, int ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ long, long ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ long ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class "[B" ]
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null, class java/io/FileInputStream, int, class "[B", class java/nio/ByteBuffer, long, int, int, int, int, int, long, long, long, int, int, int, int, long, long, long, class "[B", class java/io/DataInputStream, int, int, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;", int ]
          stack = []
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 10 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType ]
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null, class java/io/FileInputStream, int, class "[B", class java/nio/ByteBuffer, long, int, int, int, int, int, long, long, long, int, int, int, int, long, long, long, class "[B", class java/io/DataInputStream, int, int, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;", int, class java/util/Map, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType, long, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity ]
          stack = []
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null, class java/io/FileInputStream, int, class "[B", class java/nio/ByteBuffer, long, int, int, int, int, int, long, long, long, int, int, int, int, long, long, long, class "[B", class java/io/DataInputStream ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null, class java/io/FileInputStream, int, class "[B", class java/nio/ByteBuffer, long, int, int, int, int, int, long, long, long, int, int, int, int, long, long, long, class "[B", class java/io/DataInputStream, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, int, class "[Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;", int, class java/util/Map, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType, long, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, null ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer, class java/nio/file/Path, class java/io/Closeable, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 172: 0
        line 173: 29
        line 174: 35
        line 175: 47
        line 178: 58
        line 180: 71
        line 181: 78
        line 181: 113
        line 183: 117
        line 184: 124
        line 186: 145
        line 187: 152
        line 188: 159
        line 190: 172
        line 191: 179
        line 192: 186
        line 193: 193
        line 194: 200
        line 195: 207
        line 196: 214
        line 198: 221
        line 199: 230
        line 202: 245
        line 203: 252
        line 205: 259
        line 206: 268
        line 209: 285
        line 210: 292
        line 213: 307
        line 214: 318
        line 216: 326
        line 217: 334
        line 220: 351
        line 221: 359
        line 222: 372
        line 225: 383
        line 226: 389
        line 227: 401
        line 230: 412
        line 231: 425
        line 234: 436
        line 236: 477
        line 237: 478
        line 238: 485
        line 239: 492
        line 240: 545
        line 239: 556
        line 242: 558
        line 244: 565
        line 245: 575
        line 246: 583
        line 248: 591
        line 249: 605
        line 252: 626
        line 253: 630
        line 254: 632
        line 255: 634
        line 256: 636
        line 257: 638
        line 258: 640
        line 259: 642
        line 260: 644
        line 252: 646
        line 263: 651
        line 264: 656
        line 263: 659
        line 236: 671
        line 172: 671
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          545      11    38 $i$a$-getOrElse-L2BRSerializer$deserialize$1$sourceType$1   I
          542      14    37    it   I
          485     164    33 readRegionX   I
          492     157    34 readRegionY   I
          558      91    39 sourceType   Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
          565      84    40 genTime   J
          575      74    37 nodes   Ljava/util/Map;
          583      66    38 spatialGrid   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
          591      58    42 connectivity   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
           29     642     5 $i$a$-use-L2BRSerializer$deserialize$1   I
           35     636     6 header   [B
           71     600     7 buffer   Ljava/nio/ByteBuffer;
           78     593     8 magic   J
          124     547    10 version   S
          152     519    11 regionX   I
          159     512    12 regionY   I
          179     492    13 nodeCount   I
          186     485    14 walkableCount   I
          193     478    15 indexOffset   J
          200     471    17 dataOffset   J
          207     464    19 checksum   J
          214     457    21 compressedSize   I
          221     450    22 indexEntrySize   I
          252     419    23 expectedIndexSize   I
          259     412    24 expectedDataOffset   I
          318     353    25 fileSize   J
          326     345    27 expectedFileSize   J
          359     312    29 skipBytes   J
          389     282    31 compressedData   [B
          477     194    32 dataStream   Ljava/io/DataInputStream;
           26     645     4   fis   Ljava/io/FileInputStream;
            0     699     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
            0     699     1 inputPath   Ljava/nio/file/Path;
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public static final long access$getMAGIC$cp();
    descriptor: ()J
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #293                // Field MAGIC:J
         3: lreturn
      LineNumberTable:
        line 33: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #797                // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion
         3: dup
         4: aconst_null
         5: invokespecial #800                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #804                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion;
        11: ldc2_w        #805                // long 5490523817655992320l
        14: putstatic     #293                // Field MAGIC:J
        17: return
      LineNumberTable:
        line 41: 11
}
InnerClasses:
  public static final #801= #797 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$Companion of class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  public static #833= #147 of #39;        // Entry=class java/util/Map$Entry of class java/util/Map
SourceFile: "L2BRSerializer.kt"
SourceDebugExtension:
  SMAP
  L2BRSerializer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 L2BRSerializer.kt
  ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  + 2 _Maps.kt
  kotlin/collections/MapsKt___MapsKt
  + 3 _Arrays.kt
  kotlin/collections/ArraysKt___ArraysKt
  + 4 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 5 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,435:1
  221#2,2:436
  13225#3,2:438
  14125#3,3:447
  777#4:440
  873#4,2:441
  1586#4:443
  1661#4,3:444
  1915#4,2:450
  1915#4,2:453
  1915#4,2:455
  1#5:452
  *S KotlinDebug
  *F
  + 1 L2BRSerializer.kt
  ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  *L
  70#1:436,2
  89#1:438,2
  133#1:447,3
  90#1:440
  90#1:441,2
  90#1:443
  90#1:444,3
  283#1:450,2
  336#1:453,2
  358#1:455,2
  *E
RuntimeVisibleAnnotations:
  0: #819(#820=[I#821,I#812,I#822],#823=I#824,#825=I#826,#827=[s#828],#829=[s#10,s#830,s#5,s#6,s#11,s#830,s#482,s#483,s#484,s#485,s#488,s#647,s#178,s#830,s#418,s#419,s#162,s#687,s#473,s#595,s#830,s#830,s#644,s#735,s#241,s#756,s#624,s#599,s#249,s#625,s#626,s#603,s#312,s#793,s#830,s#801,s#831,s#832])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0002¨\u0006%"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;","","<init>","()V","serialize","","region","Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;","outputPath","Ljava/nio/file/Path;","deserialize","inputPath","buildFlags","","node","Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;","writeNode","stream","Ljava/io/DataOutputStream;","readNodes","","","Ljava/io/DataInputStream;","expectedCount","writeSpatialGrid","grid","Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;","readSpatialGrid","writeConnectivity","connectivity","Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;","readConnectivity","calculateChecksum","data","","Companion","NodeIndexEntry","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #835(#836=[s#837])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nL2BRSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRSerializer.kt\next/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n221#2,2:436\n13225#3,2:438\n14125#3,3:447\n777#4:440\n873#4,2:441\n1586#4:443\n1661#4,3:444\n1915#4,2:450\n1915#4,2:453\n1915#4,2:455\n1#5:452\n*S KotlinDebug\n*F\n+ 1 L2BRSerializer.kt\next/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer\n*L\n70#1:436,2\n89#1:438,2\n133#1:447,3\n90#1:440\n90#1:441,2\n90#1:443\n90#1:444,3\n283#1:450,2\n336#1:453,2\n358#1:455,2\n*E\n"]
    )
BootstrapMethods:
  0: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #67 IDs dos nós não são sequenciais de 0 a \u0001. Min: \u0001, Max: \u0001, Count: \u0001
  1: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 ID do nó fora dos limites: \u0001 (esperado: 0..\u0001)
  2: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #233 Nós não indexados (buracos): \u0001...
  3: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #263 Tamanho do índice não é múltiplo de 32: \u0001
  4: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #324 Entry nulo no índice na posição \u0001
  5: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #356 Buffer do índice incompleto: \u0001 vs \u0001
  6: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #379 Tamanho do arquivo incorreto! Esperado: \u0001, Real: \u0001, Diferença: \u0001
  7: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #387 [L2BR] Arquivo gerado com sucesso: \u0001
  8: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #404        Nodes: \u0001, Index: \u0001 bytes, Data: \u0001 bytes
  9: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #409        Total: \u0001 bytes, DataOffset: \u0001
  10: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #526 Formato inválido: 0x\u0001
  11: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #534 Versão não suportada: \u0001
  12: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #542 IndexOffset inválido: \u0001 (esperado: 64)
  13: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #547 DataOffset inconsistente: \u0001 vs esperado \u0001
  14: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #551 IndexEntrySize incorreto: \u0001 (esperado: 32)
  15: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #554 Arquivo truncado: \u0001 < \u0001
  16: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #608 Inconsistência de metadados: header(\u0001,\u0001) vs data(\u0001,\u0001)
  17: #74 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #690 Contagem inconsistente: \u0001 vs \u0001
