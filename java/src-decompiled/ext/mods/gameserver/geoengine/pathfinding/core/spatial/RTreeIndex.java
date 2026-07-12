// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.class
  Last modified 9 de jul de 2026; size 20264 bytes
  MD5 checksum 4016d597da4b09cc2005115ae0c3bd0f
  Compiled from "RTreeIndex.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 17, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (II)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               maxEntries
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // maxEntries:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.maxEntries:I
   #14 = Utf8               minEntries
   #15 = NameAndType        #14:#11       // minEntries:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.minEntries:I
   #17 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode
   #18 = Class              #17           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode
   #19 = Utf8               (Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #20 = NameAndType        #5:#19        // "<init>":(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #21 = Methodref          #18.#20       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode."<init>":(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #22 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
   #23 = Class              #22           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
   #24 = Utf8               root
   #25 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
   #26 = NameAndType        #24:#25       // root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
   #27 = Fieldref           #2.#26        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
   #28 = Utf8               this
   #29 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
   #30 = Utf8               (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #31 = NameAndType        #5:#6         // "<init>":(II)V
   #32 = Methodref          #2.#31        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex."<init>":(II)V
   #33 = Utf8               insert
   #34 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)V
   #35 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #36 = Utf8               insertRecursive
   #37 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
   #38 = NameAndType        #36:#37       // insertRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
   #39 = Methodref          #2.#38        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.insertRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
   #40 = Utf8               size
   #41 = NameAndType        #40:#11       // size:I
   #42 = Fieldref           #2.#41        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.size:I
   #43 = Utf8               entry
   #44 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #45 = Utf8               search
   #46 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
   #47 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;>;
   #48 = Utf8               java/util/ArrayList
   #49 = Class              #48           // java/util/ArrayList
   #50 = Methodref          #49.#8        // java/util/ArrayList."<init>":()V
   #51 = Utf8               java/util/List
   #52 = Class              #51           // java/util/List
   #53 = Utf8               searchRecursive
   #54 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;Ljava/util/List;)V
   #55 = NameAndType        #53:#54       // searchRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;Ljava/util/List;)V
   #56 = Methodref          #2.#55        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.searchRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;Ljava/util/List;)V
   #57 = Utf8               results
   #58 = Utf8               Ljava/util/List;
   #59 = Utf8               rect
   #60 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #61 = Utf8               nearestNeighbor
   #62 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #63 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #64 = Double             1.7976931348623157E308d
   #66 = Utf8               nearestNeighborRecursive
   #67 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair;
   #68 = NameAndType        #66:#67       // nearestNeighborRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair;
   #69 = Methodref          #2.#68        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.nearestNeighborRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair;
   #70 = Utf8               kotlin/Pair
   #71 = Class              #70           // kotlin/Pair
   #72 = Utf8               getFirst
   #73 = Utf8               ()Ljava/lang/Object;
   #74 = NameAndType        #72:#73       // getFirst:()Ljava/lang/Object;
   #75 = Methodref          #71.#74       // kotlin/Pair.getFirst:()Ljava/lang/Object;
   #76 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
   #77 = Class              #76           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
   #78 = Utf8               x
   #79 = Utf8               y
   #80 = Utf8               bulkLoad
   #81 = Utf8               (Ljava/util/List;)V
   #82 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;>;)V
   #83 = Utf8               isEmpty
   #84 = Utf8               ()Z
   #85 = NameAndType        #83:#84       // isEmpty:()Z
   #86 = InterfaceMethodref #52.#85       // java/util/List.isEmpty:()Z
   #87 = Utf8               java/lang/Iterable
   #88 = Class              #87           // java/lang/Iterable
   #89 = Utf8               kotlin/jvm/functions/Function1
   #90 = Class              #89           // kotlin/jvm/functions/Function1
   #91 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #92 = MethodType         #91           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Utf8               bulkLoad$lambda$0
   #94 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
   #95 = NameAndType        #93:#94       // bulkLoad$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
   #96 = Methodref          #2.#95        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
   #97 = MethodHandle       6:#96         // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
   #98 = MethodType         #94           //  (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
   #99 = Utf8               java/lang/invoke/LambdaMetafactory
  #100 = Class              #99           // java/lang/invoke/LambdaMetafactory
  #101 = Utf8               metafactory
  #102 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #103 = NameAndType        #101:#102     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #104 = Methodref          #100.#103     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #105 = MethodHandle       6:#104        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               invoke
  #107 = Utf8               ()Lkotlin/jvm/functions/Function1;
  #108 = NameAndType        #106:#107     // invoke:()Lkotlin/jvm/functions/Function1;
  #109 = InvokeDynamic      #0:#108       // #0:invoke:()Lkotlin/jvm/functions/Function1;
  #110 = Utf8               bulkLoad$lambda$1
  #111 = NameAndType        #110:#94      // bulkLoad$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
  #112 = Methodref          #2.#111       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
  #113 = MethodHandle       6:#112        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
  #114 = InvokeDynamic      #1:#108       // #1:invoke:()Lkotlin/jvm/functions/Function1;
  #115 = Utf8               kotlin/comparisons/ComparisonsKt
  #116 = Class              #115          // kotlin/comparisons/ComparisonsKt
  #117 = Utf8               compareBy
  #118 = Utf8               ([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #119 = NameAndType        #117:#118     // compareBy:([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #120 = Methodref          #116.#119     // kotlin/comparisons/ComparisonsKt.compareBy:([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #121 = Utf8               kotlin/collections/CollectionsKt
  #122 = Class              #121          // kotlin/collections/CollectionsKt
  #123 = Utf8               sortedWith
  #124 = Utf8               (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
  #125 = NameAndType        #123:#124     // sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
  #126 = Methodref          #122.#125     // kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
  #127 = Utf8               buildSTR
  #128 = Utf8               (Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #129 = NameAndType        #127:#128     // buildSTR:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #130 = Methodref          #2.#129       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.buildSTR:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #131 = Utf8               ()I
  #132 = NameAndType        #40:#131      // size:()I
  #133 = InterfaceMethodref #52.#132      // java/util/List.size:()I
  #134 = Utf8               entries
  #135 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;>;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #136 = Utf8               java/util/Collection
  #137 = Class              #136          // java/util/Collection
  #138 = Utf8               toMutableList
  #139 = Utf8               (Ljava/util/Collection;)Ljava/util/List;
  #140 = NameAndType        #138:#139     // toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #141 = Methodref          #122.#140     // kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #142 = NameAndType        #5:#81        // "<init>":(Ljava/util/List;)V
  #143 = Methodref          #18.#142      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode."<init>":(Ljava/util/List;)V
  #144 = Utf8               java/lang/Math
  #145 = Class              #144          // java/lang/Math
  #146 = Utf8               ceil
  #147 = Utf8               (D)D
  #148 = NameAndType        #146:#147     // ceil:(D)D
  #149 = Methodref          #145.#148     // java/lang/Math.ceil:(D)D
  #150 = Utf8               chunked
  #151 = Utf8               (Ljava/lang/Iterable;I)Ljava/util/List;
  #152 = NameAndType        #150:#151     // chunked:(Ljava/lang/Iterable;I)Ljava/util/List;
  #153 = Methodref          #122.#152     // kotlin/collections/CollectionsKt.chunked:(Ljava/lang/Iterable;I)Ljava/util/List;
  #154 = Utf8               iterator
  #155 = Utf8               ()Ljava/util/Iterator;
  #156 = NameAndType        #154:#155     // iterator:()Ljava/util/Iterator;
  #157 = InterfaceMethodref #88.#156      // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #158 = Utf8               java/util/Iterator
  #159 = Class              #158          // java/util/Iterator
  #160 = Utf8               hasNext
  #161 = NameAndType        #160:#84      // hasNext:()Z
  #162 = InterfaceMethodref #159.#161     // java/util/Iterator.hasNext:()Z
  #163 = Utf8               next
  #164 = NameAndType        #163:#73      // next:()Ljava/lang/Object;
  #165 = InterfaceMethodref #159.#164     // java/util/Iterator.next:()Ljava/lang/Object;
  #166 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
  #167 = Class              #166          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
  #168 = Methodref          #167.#8       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1."<init>":()V
  #169 = Utf8               java/util/Comparator
  #170 = Class              #169          // java/util/Comparator
  #171 = Utf8               collectionSizeOrDefault
  #172 = Utf8               (Ljava/lang/Iterable;I)I
  #173 = NameAndType        #171:#172     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #174 = Methodref          #122.#173     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #175 = Utf8               (I)V
  #176 = NameAndType        #5:#175       // "<init>":(I)V
  #177 = Methodref          #49.#176      // java/util/ArrayList."<init>":(I)V
  #178 = Utf8               add
  #179 = Utf8               (Ljava/lang/Object;)Z
  #180 = NameAndType        #178:#179     // add:(Ljava/lang/Object;)Z
  #181 = InterfaceMethodref #137.#180     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #182 = Utf8               addAll
  #183 = Utf8               (Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #184 = NameAndType        #182:#183     // addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #185 = Methodref          #122.#184     // kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #186 = Utf8               buildTreeLevel
  #187 = NameAndType        #186:#128     // buildTreeLevel:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #188 = Methodref          #2.#187       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.buildTreeLevel:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #189 = Utf8               $i$f$sortedBy
  #190 = Utf8               $this$sortedBy$iv
  #191 = Utf8               Ljava/lang/Iterable;
  #192 = Utf8               $i$a$-map-RTreeIndex$buildSTR$children$1$2
  #193 = Utf8               chunk
  #194 = Utf8               item$iv$iv
  #195 = Utf8               Ljava/lang/Object;
  #196 = Utf8               $i$f$mapTo
  #197 = Utf8               $this$mapTo$iv$iv
  #198 = Utf8               destination$iv$iv
  #199 = Utf8               Ljava/util/Collection;
  #200 = Utf8               $i$f$map
  #201 = Utf8               $this$map$iv
  #202 = Utf8               $i$a$-flatMap-RTreeIndex$buildSTR$children$1
  #203 = Utf8               slice
  #204 = Utf8               list$iv$iv
  #205 = Utf8               element$iv$iv
  #206 = Utf8               $i$f$flatMapTo
  #207 = Utf8               $this$flatMapTo$iv$iv
  #208 = Utf8               $i$f$flatMap
  #209 = Utf8               $this$flatMap$iv
  #210 = Utf8               sliceCount
  #211 = Utf8               sliceCapacity
  #212 = Utf8               slices
  #213 = Utf8               children
  #214 = Utf8               (Ljava/util/List<+Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;>;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #215 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
  #216 = Class              #215          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
  #217 = Methodref          #216.#142     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode."<init>":(Ljava/util/List;)V
  #218 = Utf8               $i$a$-map-RTreeIndex$buildTreeLevel$parents$1
  #219 = Utf8               parents
  #220 = Utf8               nodes
  #221 = Utf8               getEntries
  #222 = Utf8               ()Ljava/util/List;
  #223 = NameAndType        #221:#222     // getEntries:()Ljava/util/List;
  #224 = Methodref          #18.#223      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode.getEntries:()Ljava/util/List;
  #225 = InterfaceMethodref #52.#180      // java/util/List.add:(Ljava/lang/Object;)Z
  #226 = Utf8               splitNode
  #227 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #228 = NameAndType        #226:#227     // splitNode:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #229 = Methodref          #2.#228       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.splitNode:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #230 = Utf8               null cannot be cast to non-null type ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex.InternalNode
  #231 = String             #230          // null cannot be cast to non-null type ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex.InternalNode
  #232 = Utf8               kotlin/jvm/internal/Intrinsics
  #233 = Class              #232          // kotlin/jvm/internal/Intrinsics
  #234 = Utf8               checkNotNull
  #235 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #236 = NameAndType        #234:#235     // checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #237 = Methodref          #233.#236     // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #238 = Utf8               chooseBestChild
  #239 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #240 = NameAndType        #238:#239     // chooseBestChild:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #241 = Methodref          #2.#240       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.chooseBestChild:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #242 = Utf8               getChildren
  #243 = NameAndType        #242:#222     // getChildren:()Ljava/util/List;
  #244 = Methodref          #216.#243     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.getChildren:()Ljava/util/List;
  #245 = Utf8               indexOf
  #246 = Utf8               (Ljava/lang/Object;)I
  #247 = NameAndType        #245:#246     // indexOf:(Ljava/lang/Object;)I
  #248 = InterfaceMethodref #52.#247      // java/util/List.indexOf:(Ljava/lang/Object;)I
  #249 = Utf8               set
  #250 = Utf8               (ILjava/lang/Object;)Ljava/lang/Object;
  #251 = NameAndType        #249:#250     // set:(ILjava/lang/Object;)Ljava/lang/Object;
  #252 = InterfaceMethodref #52.#251      // java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
  #253 = Utf8               bestChild
  #254 = Utf8               newChild
  #255 = Utf8               index
  #256 = Utf8               node
  #257 = Utf8               getMbr
  #258 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #259 = NameAndType        #257:#258     // getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #260 = Methodref          #23.#259      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #261 = Utf8               getRect
  #262 = NameAndType        #261:#258     // getRect:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #263 = Methodref          #77.#262      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getRect:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #264 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #265 = Class              #264          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #266 = Utf8               expand
  #267 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #268 = NameAndType        #266:#267     // expand:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #269 = Methodref          #265.#268     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.expand:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #270 = Utf8               area
  #271 = Utf8               ()J
  #272 = NameAndType        #270:#271     // area:()J
  #273 = Methodref          #265.#272     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.area:()J
  #274 = Utf8               first
  #275 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #276 = NameAndType        #274:#275     // first:(Ljava/util/List;)Ljava/lang/Object;
  #277 = Methodref          #122.#276     // kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
  #278 = Utf8               $i$a$-minByOrNull-RTreeIndex$chooseBestChild$1
  #279 = Utf8               expanded
  #280 = Utf8               child
  #281 = Utf8               e$iv
  #282 = Utf8               v$iv
  #283 = Utf8               J
  #284 = Utf8               $i$f$minByOrNull
  #285 = Utf8               iterator$iv
  #286 = Utf8               Ljava/util/Iterator;
  #287 = Utf8               minElem$iv
  #288 = Utf8               minValue$iv
  #289 = Utf8               $this$minByOrNull$iv
  #290 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
  #291 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #292 = NameAndType        #5:#291       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #293 = Methodref          #77.#292      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #294 = Utf8               kotlin/NoWhenBranchMatchedException
  #295 = Class              #294          // kotlin/NoWhenBranchMatchedException
  #296 = Methodref          #295.#8       // kotlin/NoWhenBranchMatchedException."<init>":()V
  #297 = Double             -1.0d
  #299 = InterfaceMethodref #137.#132     // java/util/Collection.size:()I
  #300 = Utf8               get
  #301 = Utf8               (I)Ljava/lang/Object;
  #302 = NameAndType        #300:#301     // get:(I)Ljava/lang/Object;
  #303 = InterfaceMethodref #52.#302      // java/util/List.get:(I)Ljava/lang/Object;
  #304 = Utf8               distance
  #305 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)D
  #306 = NameAndType        #304:#305     // distance:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)D
  #307 = Methodref          #265.#306     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.distance:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)D
  #308 = Utf8               mutableListOf
  #309 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #310 = NameAndType        #308:#309     // mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
  #311 = Methodref          #122.#310     // kotlin/collections/CollectionsKt.mutableListOf:([Ljava/lang/Object;)Ljava/util/List;
  #312 = Utf8               throwIndexOverflow
  #313 = NameAndType        #312:#7       // throwIndexOverflow:()V
  #314 = Methodref          #122.#313     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #315 = InterfaceMethodref #137.#85      // java/util/Collection.isEmpty:()Z
  #316 = Utf8               (Ljava/util/Collection;)Z
  #317 = NameAndType        #182:#316     // addAll:(Ljava/util/Collection;)Z
  #318 = InterfaceMethodref #52.#317      // java/util/List.addAll:(Ljava/util/Collection;)Z
  #319 = Utf8               removeFirst
  #320 = NameAndType        #319:#73      // removeFirst:()Ljava/lang/Object;
  #321 = InterfaceMethodref #52.#320      // java/util/List.removeFirst:()Ljava/lang/Object;
  #322 = Utf8               Companion
  #323 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
  #324 = NameAndType        #322:#323     // Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
  #325 = Fieldref           #265.#324     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
  #326 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
  #327 = Class              #326          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
  #328 = Utf8               getEMPTY
  #329 = NameAndType        #328:#258     // getEMPTY:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #330 = Methodref          #327.#329     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion.getEMPTY:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #331 = Utf8               clear
  #332 = NameAndType        #331:#7       // clear:()V
  #333 = InterfaceMethodref #52.#332      // java/util/List.clear:()V
  #334 = Utf8               $i$a$-map-RTreeIndex$splitNode$entries$1
  #335 = Utf8               it
  #336 = Utf8               dist
  #337 = Utf8               D
  #338 = Utf8               j
  #339 = Utf8               i
  #340 = Utf8               $i$a$-filterIndexed-RTreeIndex$splitNode$remaining$1
  #341 = Utf8               $i$a$-forEachIndexed-CollectionsKt___CollectionsKt$filterIndexedTo$1$iv$iv
  #342 = Utf8               index$iv$iv
  #343 = Utf8               item$iv$iv$iv
  #344 = Utf8               $i$f$forEachIndexed
  #345 = Utf8               index$iv$iv$iv
  #346 = Utf8               $this$forEachIndexed$iv$iv$iv
  #347 = Utf8               $i$f$filterIndexedTo
  #348 = Utf8               $this$filterIndexedTo$iv$iv
  #349 = Utf8               $i$f$filterIndexed
  #350 = Utf8               $this$filterIndexed$iv
  #351 = Utf8               $i$a$-fold-RTreeIndex$splitNode$mbr1$1
  #352 = Utf8               acc
  #353 = Utf8               e
  #354 = Utf8               element$iv
  #355 = Utf8               $i$f$fold
  #356 = Utf8               accumulator$iv
  #357 = Utf8               $this$fold$iv
  #358 = Utf8               initial$iv
  #359 = Utf8               $i$a$-fold-RTreeIndex$splitNode$mbr2$1
  #360 = Utf8               mbr1
  #361 = Utf8               mbr2
  #362 = Utf8               cost1
  #363 = Utf8               cost2
  #364 = Utf8               seed1
  #365 = Utf8               seed2
  #366 = Utf8               maxDist
  #367 = Utf8               group1
  #368 = Utf8               group2
  #369 = Utf8               remaining
  #370 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
  #371 = Class              #370          // "[Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;"
  #372 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;>;)V
  #373 = Utf8               intersects
  #374 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Z
  #375 = NameAndType        #373:#374     // intersects:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Z
  #376 = Methodref          #265.#375     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.intersects:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Z
  #377 = Utf8               $i$a$-filter-RTreeIndex$searchRecursive$1
  #378 = Utf8               $i$f$filterTo
  #379 = Utf8               $this$filterTo$iv$iv
  #380 = Utf8               $i$f$filter
  #381 = Utf8               $this$filter$iv
  #382 = Utf8               $i$a$-forEach-RTreeIndex$searchRecursive$2
  #383 = Utf8               $i$f$forEach
  #384 = Utf8               $this$forEach$iv
  #385 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;Ljava/lang/Double;>;
  #386 = Utf8               distanceToPoint
  #387 = Utf8               (II)D
  #388 = NameAndType        #386:#387     // distanceToPoint:(II)D
  #389 = Methodref          #265.#388     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.distanceToPoint:(II)D
  #390 = Utf8               java/lang/Double
  #391 = Class              #390          // java/lang/Double
  #392 = Utf8               valueOf
  #393 = Utf8               (D)Ljava/lang/Double;
  #394 = NameAndType        #392:#393     // valueOf:(D)Ljava/lang/Double;
  #395 = Methodref          #391.#394     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #396 = Utf8               kotlin/TuplesKt
  #397 = Class              #396          // kotlin/TuplesKt
  #398 = Utf8               to
  #399 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #400 = NameAndType        #398:#399     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #401 = Methodref          #397.#400     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #402 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
  #403 = Class              #402          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
  #404 = Methodref          #403.#31      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1."<init>":(II)V
  #405 = Utf8               getSecond
  #406 = NameAndType        #405:#73      // getSecond:()Ljava/lang/Object;
  #407 = Methodref          #71.#406      // kotlin/Pair.getSecond:()Ljava/lang/Object;
  #408 = Utf8               java/lang/Number
  #409 = Class              #408          // java/lang/Number
  #410 = Utf8               doubleValue
  #411 = Utf8               ()D
  #412 = NameAndType        #410:#411     // doubleValue:()D
  #413 = Methodref          #409.#412     // java/lang/Number.doubleValue:()D
  #414 = Utf8               $i$a$-forEach-RTreeIndex$nearestNeighborRecursive$1
  #415 = Utf8               d
  #416 = Utf8               best
  #417 = Utf8               $i$a$-forEach-RTreeIndex$nearestNeighborRecursive$2
  #418 = Utf8               result
  #419 = Utf8               Lkotlin/Pair;
  #420 = Utf8               sorted
  #421 = Utf8               bestEntry
  #422 = Utf8               bestDist
  #423 = Utf8               getMinX
  #424 = NameAndType        #423:#131     // getMinX:()I
  #425 = Methodref          #265.#424     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.getMinX:()I
  #426 = Utf8               java/lang/Integer
  #427 = Class              #426          // java/lang/Integer
  #428 = Utf8               (I)Ljava/lang/Integer;
  #429 = NameAndType        #392:#428     // valueOf:(I)Ljava/lang/Integer;
  #430 = Methodref          #427.#429     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #431 = Utf8               java/lang/Comparable
  #432 = Class              #431          // java/lang/Comparable
  #433 = Utf8               getMinY
  #434 = NameAndType        #433:#131     // getMinY:()I
  #435 = Methodref          #265.#434     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.getMinY:()I
  #436 = NameAndType        #5:#30        // "<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #437 = Methodref          #2.#436       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex."<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #438 = Utf8               Lkotlin/Metadata;
  #439 = Utf8               mv
  #440 = Integer            2
  #441 = Integer            3
  #442 = Integer            0
  #443 = Utf8               k
  #444 = Integer            1
  #445 = Utf8               xi
  #446 = Integer            48
  #447 = Utf8               d1
  #448 = Utf8               \u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\'()*+B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\u0016\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J&\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002J@\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010\t\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,
  #449 = Utf8               d2
  #450 = Utf8
  #451 = Utf8               Rectangle
  #452 = Utf8               Entry
  #453 = Utf8               Node
  #454 = Utf8               InternalNode
  #455 = Utf8               LeafNode
  #456 = Utf8               Brproject
  #457 = Utf8               kotlin/jvm/internal/Ref$DoubleRef
  #458 = Class              #457          // kotlin/jvm/internal/Ref$DoubleRef
  #459 = Utf8               kotlin/jvm/internal/Ref
  #460 = Class              #459          // kotlin/jvm/internal/Ref
  #461 = Utf8               DoubleRef
  #462 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #463 = Class              #462          // kotlin/jvm/internal/Ref$IntRef
  #464 = Utf8               IntRef
  #465 = Utf8               kotlin/jvm/internal/Ref$ObjectRef
  #466 = Class              #465          // kotlin/jvm/internal/Ref$ObjectRef
  #467 = Utf8               ObjectRef
  #468 = Utf8               RTreeIndex.kt
  #469 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #470 = Utf8               value
  #471 = Utf8               SMAP\nRTreeIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1391#2:322\n1480#2,2:323\n1068#2:325\n1586#2:326\n1661#2,3:327\n1482#2,3:330\n1586#2:333\n1661#2,3:334\n2469#2,14:337\n1586#2:351\n1661#2,3:352\n788#2:355\n800#2:356\n1924#2,2:357\n801#2,2:359\n1926#2:361\n803#2:362\n1849#2,3:363\n1849#2,3:366\n777#2:369\n873#2,2:370\n1915#2,2:372\n1915#2,2:374\n1068#2:376\n1915#2,2:377\n*S KotlinDebug\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n*L\n64#1:322\n64#1:323,2\n65#1:325\n67#1:326\n67#1:327,3\n64#1:330,3\n75#1:333\n75#1:334,3\n104#1:337,14\n112#1:351\n112#1:352,3\n129#1:355\n129#1:356\n129#1:357,2\n129#1:359,2\n129#1:361\n129#1:362\n140#1:363,3\n141#1:366,3\n161#1:369\n161#1:370,2\n164#1:372,2\n180#1:374,2\n191#1:376\n195#1:377,2\n*E\n
  #472 = Utf8               RuntimeInvisibleAnnotations
  #473 = Utf8               Code
  #474 = Utf8               LineNumberTable
  #475 = Utf8               LocalVariableTable
  #476 = Utf8               StackMapTable
  #477 = Utf8               RuntimeInvisibleParameterAnnotations
  #478 = Utf8               Signature
  #479 = Utf8               InnerClasses
  #480 = Utf8               SourceFile
  #481 = Utf8               SourceDebugExtension
  #482 = Utf8               RuntimeVisibleAnnotations
  #483 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field maxEntries:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field minEntries:I
        14: aload_0
        15: new           #18                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode
        18: dup
        19: aconst_null
        20: iconst_1
        21: aconst_null
        22: invokespecial #21                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode."<init>":(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        25: checkcast     #23                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
        28: putfield      #27                 // Field root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
        31: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 32: 14
        line 28: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
            0      32     1 maxEntries   I
            0      32     2 minEntries   I

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex(int, int, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_1
         2: iand
         3: ifeq          9
         6: bipush        16
         8: istore_1
         9: iload_3
        10: iconst_2
        11: iand
        12: ifeq          19
        15: iload_1
        16: iconst_2
        17: idiv
        18: istore_2
        19: aload_0
        20: iload_1
        21: iload_2
        22: invokespecial #32                 // Method "<init>":(II)V
        25: return
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 9 /* same */
      LineNumberTable:
        line 28: 0
        line 29: 6
        line 28: 9
        line 30: 15
        line 28: 19
        line 31: 25

  public final void insert(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_0
         2: aload_0
         3: getfield      #27                 // Field root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
         6: aload_1
         7: invokespecial #39                 // Method insertRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
        10: putfield      #27                 // Field root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
        13: aload_0
        14: getfield      #42                 // Field size:I
        17: istore_2
        18: aload_0
        19: iload_2
        20: iconst_1
        21: iadd
        22: putfield      #42                 // Field size:I
        25: return
      LineNumberTable:
        line 36: 0
        line 37: 13
        line 38: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
            0      26     1 entry   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry> search(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: new           #49                 // class java/util/ArrayList
         3: dup
         4: invokespecial #50                 // Method java/util/ArrayList."<init>":()V
         7: checkcast     #52                 // class java/util/List
        10: astore_2
        11: aload_0
        12: aload_0
        13: getfield      #27                 // Field root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
        16: aload_1
        17: aload_2
        18: invokespecial #56                 // Method searchRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;Ljava/util/List;)V
        21: aload_2
        22: areturn
      LineNumberTable:
        line 41: 0
        line 41: 10
        line 42: 11
        line 43: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11      12     2 results   Ljava/util/List;
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
            0      23     1  rect   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    Signature: #47                          // (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;>;
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry nearestNeighbor(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: getfield      #27                 // Field root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
         5: iload_1
         6: iload_2
         7: aconst_null
         8: ldc2_w        #64                 // double 1.7976931348623157E308d
        11: invokespecial #69                 // Method nearestNeighborRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair;
        14: dup
        15: ifnull        27
        18: invokevirtual #75                 // Method kotlin/Pair.getFirst:()Ljava/lang/Object;
        21: checkcast     #77                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        24: goto          29
        27: pop
        28: aconst_null
        29: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class kotlin/Pair ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry ]
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
            0      30     1     x   I
            0      30     2     y   I
    RuntimeInvisibleAnnotations:
      0: #63()
        org.jetbrains.annotations.Nullable

  public final void bulkLoad(java.util.List<ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=2
         0: aload_1
         1: invokeinterface #86,  1           // InterfaceMethod java/util/List.isEmpty:()Z
         6: ifeq          10
         9: return
        10: aload_0
        11: aload_0
        12: aload_1
        13: checkcast     #88                 // class java/lang/Iterable
        16: iconst_2
        17: anewarray     #90                 // class kotlin/jvm/functions/Function1
        20: astore_2
        21: aload_2
        22: iconst_0
        23: invokedynamic #109,  0            // InvokeDynamic #0:invoke:()Lkotlin/jvm/functions/Function1;
        28: aastore
        29: aload_2
        30: iconst_1
        31: invokedynamic #114,  0            // InvokeDynamic #1:invoke:()Lkotlin/jvm/functions/Function1;
        36: aastore
        37: aload_2
        38: invokestatic  #120                // Method kotlin/comparisons/ComparisonsKt.compareBy:([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
        41: invokestatic  #126                // Method kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        44: invokespecial #130                // Method buildSTR:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
        47: putfield      #27                 // Field root:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
        50: aload_0
        51: aload_1
        52: invokeinterface #133,  1          // InterfaceMethod java/util/List.size:()I
        57: putfield      #42                 // Field size:I
        60: return
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */
      LineNumberTable:
        line 51: 0
        line 53: 10
        line 54: 50
        line 55: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
            0      61     1 entries   Ljava/util/List;
    Signature: #82                          // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final int size();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field size:I
         4: ireturn
      LineNumberTable:
        line 207: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: iconst_0
         3: iconst_3
         4: aconst_null
         5: invokespecial #437                // Method "<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
}
InnerClasses:
  public static final #452= #77 of #2;    // Entry=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #454= #216 of #2;   // InternalNode=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #455= #18 of #2;    // LeafNode=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static abstract #453= #23 of #2; // Node=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #451= #265 of #2;   // Rectangle=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #322= #327 of #265; // Companion=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  public static final #461= #458 of #460; // DoubleRef=class kotlin/jvm/internal/Ref$DoubleRef of class kotlin/jvm/internal/Ref
  public static final #464= #463 of #460; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
  public static final #467= #466 of #460; // ObjectRef=class kotlin/jvm/internal/Ref$ObjectRef of class kotlin/jvm/internal/Ref
SourceFile: "RTreeIndex.kt"
SourceDebugExtension:
  SMAP
  RTreeIndex.kt
  Kotlin
  *S Kotlin
  *F
  + 1 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,321:1
  1391#2:322
  1480#2,2:323
  1068#2:325
  1586#2:326
  1661#2,3:327
  1482#2,3:330
  1586#2:333
  1661#2,3:334
  2469#2,14:337
  1586#2:351
  1661#2,3:352
  788#2:355
  800#2:356
  1924#2,2:357
  801#2,2:359
  1926#2:361
  803#2:362
  1849#2,3:363
  1849#2,3:366
  777#2:369
  873#2,2:370
  1915#2,2:372
  1915#2,2:374
  1068#2:376
  1915#2,2:377
  *S KotlinDebug
  *F
  + 1 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  *L
  64#1:322
  64#1:323,2
  65#1:325
  67#1:326
  67#1:327,3
  64#1:330,3
  75#1:333
  75#1:334,3
  104#1:337,14
  112#1:351
  112#1:352,3
  129#1:355
  129#1:356
  129#1:357,2
  129#1:359,2
  129#1:361
  129#1:362
  140#1:363,3
  141#1:366,3
  161#1:369
  161#1:370,2
  164#1:372,2
  180#1:374,2
  191#1:376
  195#1:377,2
  *E
RuntimeVisibleAnnotations:
  0: #438(#439=[I#440,I#441,I#442],#443=I#444,#445=I#446,#447=[s#448],#449=[s#29,s#450,s#10,s#450,s#14,s#5,s#6,s#24,s#25,s#40,s#33,s#450,s#43,s#44,s#45,s#450,s#59,s#60,s#61,s#78,s#79,s#80,s#134,s#127,s#186,s#220,s#36,s#256,s#238,s#290,s#226,s#53,s#57,s#450,s#66,s#419,s#450,s#421,s#422,s#451,s#452,s#453,s#454,s#455,s#456])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\'()*+B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J\u0016\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0002J&\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002J@\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010\t\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;","","maxEntries","","minEntries","<init>","(II)V","root","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;","size","insert","","entry","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;","search","","rect","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","nearestNeighbor","x","y","bulkLoad","entries","buildSTR","buildTreeLevel","nodes","insertRecursive","node","chooseBestChild","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;","splitNode","searchRecursive","results","","nearestNeighborRecursive","Lkotlin/Pair;","","bestEntry","bestDist","Rectangle","Entry","Node","InternalNode","LeafNode","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #469(#470=[s#471])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nRTreeIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1391#2:322\n1480#2,2:323\n1068#2:325\n1586#2:326\n1661#2,3:327\n1482#2,3:330\n1586#2:333\n1661#2,3:334\n2469#2,14:337\n1586#2:351\n1661#2,3:352\n788#2:355\n800#2:356\n1924#2,2:357\n801#2,2:359\n1926#2:361\n803#2:362\n1849#2,3:363\n1849#2,3:366\n777#2:369\n873#2,2:370\n1915#2,2:372\n1915#2,2:374\n1068#2:376\n1915#2,2:377\n*S KotlinDebug\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n*L\n64#1:322\n64#1:323,2\n65#1:325\n67#1:326\n67#1:327,3\n64#1:330,3\n75#1:333\n75#1:334,3\n104#1:337,14\n112#1:351\n112#1:352,3\n129#1:355\n129#1:356\n129#1:357,2\n129#1:359,2\n129#1:361\n129#1:362\n140#1:363,3\n141#1:366,3\n161#1:369\n161#1:370,2\n164#1:372,2\n180#1:374,2\n191#1:376\n195#1:377,2\n*E\n"]
    )
BootstrapMethods:
  0: #105 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #92 (Ljava/lang/Object;)Ljava/lang/Object;
      #97 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
      #98 (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
  1: #105 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #92 (Ljava/lang/Object;)Ljava/lang/Object;
      #113 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
      #98 (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)Ljava/lang/Comparable;
