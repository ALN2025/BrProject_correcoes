// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.SpatialIndexAdapter
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\SpatialIndexAdapter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.class
  Last modified 9 de jul de 2026; size 6790 bytes
  MD5 checksum 1a074aea0316d4181df36262097144a3
  Compiled from "RTreeIndex.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.SpatialIndexAdapter
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 8, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               rtree
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
   #13 = NameAndType        #11:#12       // rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
   #15 = Utf8               this
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
   #17 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #18 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
   #19 = Class              #18           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
   #20 = Utf8               (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #21 = NameAndType        #5:#20        // "<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #22 = Methodref          #19.#21       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex."<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #23 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;)V
   #24 = Methodref          #2.#23        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;)V
   #25 = Utf8               insertNode
   #26 = Utf8               (III)V
   #27 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
   #28 = Class              #27           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
   #29 = Utf8               (IIII)V
   #30 = NameAndType        #5:#29        // "<init>":(IIII)V
   #31 = Methodref          #28.#30       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle."<init>":(IIII)V
   #32 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
   #33 = Class              #32           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
   #34 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #35 = NameAndType        #5:#34        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #36 = Methodref          #33.#35       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #37 = Utf8               insert
   #38 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)V
   #39 = NameAndType        #37:#38       // insert:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)V
   #40 = Methodref          #19.#39       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.insert:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)V
   #41 = Utf8               rect
   #42 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #43 = Utf8               geoX
   #44 = Utf8               I
   #45 = Utf8               geoY
   #46 = Utf8               nodeId
   #47 = Utf8               findAt
   #48 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;
   #49 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #50 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
   #51 = Class              #50           // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
   #52 = Utf8               getX
   #53 = Utf8               ()I
   #54 = NameAndType        #52:#53       // getX:()I
   #55 = Methodref          #51.#54       // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
   #56 = Utf8               getY
   #57 = NameAndType        #56:#53       // getY:()I
   #58 = Methodref          #51.#57       // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
   #59 = Utf8               search
   #60 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
   #61 = NameAndType        #59:#60       // search:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
   #62 = Methodref          #19.#61       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.search:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
   #63 = Utf8               kotlin/collections/CollectionsKt
   #64 = Class              #63           // kotlin/collections/CollectionsKt
   #65 = Utf8               firstOrNull
   #66 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #67 = NameAndType        #65:#66       // firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
   #68 = Methodref          #64.#67       // kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
   #69 = Utf8               getNodeId
   #70 = NameAndType        #69:#53       // getNodeId:()I
   #71 = Methodref          #33.#70       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getNodeId:()I
   #72 = Utf8               java/lang/Integer
   #73 = Class              #72           // java/lang/Integer
   #74 = Utf8               valueOf
   #75 = Utf8               (I)Ljava/lang/Integer;
   #76 = NameAndType        #74:#75       // valueOf:(I)Ljava/lang/Integer;
   #77 = Methodref          #73.#76       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #78 = Utf8               geo
   #79 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #80 = Utf8               findNearest
   #81 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
   #82 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
   #83 = Class              #82           // ext/mods/gameserver/geoengine/pathfinding/model/Location
   #84 = Utf8               toGeo
   #85 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #86 = NameAndType        #84:#85       // toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #87 = Methodref          #83.#86       // ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #88 = Utf8               nearestNeighbor
   #89 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #90 = NameAndType        #88:#89       // nearestNeighbor:(II)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #91 = Methodref          #19.#90       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.nearestNeighbor:(II)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #92 = Utf8               location
   #93 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #94 = Utf8               findInArea
   #95 = Utf8               (IIII)Ljava/util/List;
   #96 = Utf8               (IIII)Ljava/util/List<Ljava/lang/Integer;>;
   #97 = Utf8               java/lang/Iterable
   #98 = Class              #97           // java/lang/Iterable
   #99 = Utf8               java/util/ArrayList
  #100 = Class              #99           // java/util/ArrayList
  #101 = Utf8               collectionSizeOrDefault
  #102 = Utf8               (Ljava/lang/Iterable;I)I
  #103 = NameAndType        #101:#102     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #104 = Methodref          #64.#103      // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #105 = Utf8               (I)V
  #106 = NameAndType        #5:#105       // "<init>":(I)V
  #107 = Methodref          #100.#106     // java/util/ArrayList."<init>":(I)V
  #108 = Utf8               java/util/Collection
  #109 = Class              #108          // java/util/Collection
  #110 = Utf8               iterator
  #111 = Utf8               ()Ljava/util/Iterator;
  #112 = NameAndType        #110:#111     // iterator:()Ljava/util/Iterator;
  #113 = InterfaceMethodref #98.#112      // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #114 = Utf8               java/util/Iterator
  #115 = Class              #114          // java/util/Iterator
  #116 = Utf8               hasNext
  #117 = Utf8               ()Z
  #118 = NameAndType        #116:#117     // hasNext:()Z
  #119 = InterfaceMethodref #115.#118     // java/util/Iterator.hasNext:()Z
  #120 = Utf8               next
  #121 = Utf8               ()Ljava/lang/Object;
  #122 = NameAndType        #120:#121     // next:()Ljava/lang/Object;
  #123 = InterfaceMethodref #115.#122     // java/util/Iterator.next:()Ljava/lang/Object;
  #124 = Utf8               add
  #125 = Utf8               (Ljava/lang/Object;)Z
  #126 = NameAndType        #124:#125     // add:(Ljava/lang/Object;)Z
  #127 = InterfaceMethodref #109.#126     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #128 = Utf8               java/util/List
  #129 = Class              #128          // java/util/List
  #130 = Utf8               $i$a$-map-SpatialIndexAdapter$findInArea$1
  #131 = Utf8               it
  #132 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
  #133 = Utf8               item$iv$iv
  #134 = Utf8               Ljava/lang/Object;
  #135 = Utf8               $i$f$mapTo
  #136 = Utf8               $this$mapTo$iv$iv
  #137 = Utf8               Ljava/lang/Iterable;
  #138 = Utf8               destination$iv$iv
  #139 = Utf8               Ljava/util/Collection;
  #140 = Utf8               $i$f$map
  #141 = Utf8               $this$map$iv
  #142 = Utf8               minX
  #143 = Utf8               minY
  #144 = Utf8               maxX
  #145 = Utf8               maxY
  #146 = Utf8               bulkLoadFromNodes
  #147 = Utf8               (Ljava/util/List;)V
  #148 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;)V
  #149 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #150 = Class              #149          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #151 = Utf8               getGeoX
  #152 = NameAndType        #151:#53      // getGeoX:()I
  #153 = Methodref          #150.#152     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoX:()I
  #154 = Utf8               getGeoY
  #155 = NameAndType        #154:#53      // getGeoY:()I
  #156 = Methodref          #150.#155     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoY:()I
  #157 = Utf8               getId
  #158 = NameAndType        #157:#53      // getId:()I
  #159 = Methodref          #150.#158     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getId:()I
  #160 = Utf8               bulkLoad
  #161 = NameAndType        #160:#147     // bulkLoad:(Ljava/util/List;)V
  #162 = Methodref          #19.#161      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad:(Ljava/util/List;)V
  #163 = Utf8               $i$a$-map-SpatialIndexAdapter$bulkLoadFromNodes$entries$1
  #164 = Utf8               node
  #165 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #166 = Utf8               entries
  #167 = Utf8               Ljava/util/List;
  #168 = Utf8               nodes
  #169 = NameAndType        #5:#17        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #170 = Methodref          #2.#169       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #171 = Utf8               Lkotlin/Metadata;
  #172 = Utf8               mv
  #173 = Integer            2
  #174 = Integer            3
  #175 = Integer            0
  #176 = Utf8               k
  #177 = Integer            1
  #178 = Utf8               xi
  #179 = Integer            48
  #180 = Utf8               d1
  #181 = Utf8               \u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\u0014\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d
  #182 = Utf8               d2
  #183 = Utf8
  #184 = Utf8               Brproject
  #185 = Utf8               Entry
  #186 = Utf8               Rectangle
  #187 = Utf8               RTreeIndex.kt
  #188 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #189 = Utf8               value
  #190 = Utf8               SMAP\nRTreeIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1586#2:322\n1661#2,3:323\n1586#2:326\n1661#2,3:327\n*S KotlinDebug\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter\n*L\n309#1:322\n309#1:323,3\n313#1:326\n313#1:327,3\n*E\n
  #191 = Utf8               RuntimeInvisibleAnnotations
  #192 = Utf8               Code
  #193 = Utf8               LineNumberTable
  #194 = Utf8               LocalVariableTable
  #195 = Utf8               RuntimeInvisibleParameterAnnotations
  #196 = Utf8               StackMapTable
  #197 = Utf8               Signature
  #198 = Utf8               InnerClasses
  #199 = Utf8               SourceFile
  #200 = Utf8               SourceDebugExtension
  #201 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.SpatialIndexAdapter(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
         9: return
      LineNumberTable:
        line 290: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
            0      10     1 rtree   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.SpatialIndexAdapter(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          18
         6: new           #19                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
         9: dup
        10: iconst_0
        11: iconst_0
        12: iconst_3
        13: aconst_null
        14: invokespecial #22                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex."<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        17: astore_1
        18: aload_0
        19: aload_1
        20: invokespecial #24                 // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;)V
        23: return
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */
      LineNumberTable:
        line 290: 0

  public final void insertNode(int, int, int);
    descriptor: (III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=5, args_size=4
         0: new           #28                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
         3: dup
         4: iload_1
         5: iload_2
         6: iload_1
         7: iconst_1
         8: iadd
         9: iload_2
        10: iconst_1
        11: iadd
        12: invokespecial #31                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle."<init>":(IIII)V
        15: astore        4
        17: aload_0
        18: getfield      #14                 // Field rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
        21: new           #33                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        24: dup
        25: aload         4
        27: iload_3
        28: aconst_null
        29: iconst_4
        30: aconst_null
        31: invokespecial #36                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        34: invokevirtual #40                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.insert:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;)V
        37: return
      LineNumberTable:
        line 293: 0
        line 294: 17
        line 295: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      21     4  rect   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
            0      38     1  geoX   I
            0      38     2  geoY   I
            0      38     3 nodeId   I

  public final java.lang.Integer findAt(ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=2
         0: new           #28                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
         3: dup
         4: aload_1
         5: invokevirtual #55                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
         8: aload_1
         9: invokevirtual #58                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
        12: aload_1
        13: invokevirtual #55                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
        16: iconst_1
        17: iadd
        18: aload_1
        19: invokevirtual #58                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
        22: iconst_1
        23: iadd
        24: invokespecial #31                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle."<init>":(IIII)V
        27: astore_2
        28: aload_0
        29: getfield      #14                 // Field rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
        32: aload_2
        33: invokevirtual #62                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.search:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
        36: invokestatic  #68                 // Method kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
        39: checkcast     #33                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        42: dup
        43: ifnull        55
        46: invokevirtual #71                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getNodeId:()I
        49: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        52: goto          57
        55: pop
        56: aconst_null
        57: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
      LineNumberTable:
        line 298: 0
        line 299: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           28      30     2  rect   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      58     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
            0      58     1   geo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    RuntimeInvisibleAnnotations:
      0: #49()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final java.lang.Integer findNearest(ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #87                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
         4: astore_2
         5: aload_0
         6: getfield      #14                 // Field rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
         9: aload_2
        10: invokevirtual #55                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
        13: aload_2
        14: invokevirtual #58                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
        17: invokevirtual #91                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.nearestNeighbor:(II)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
        20: dup
        21: ifnull        33
        24: invokevirtual #71                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getNodeId:()I
        27: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        30: goto          35
        33: pop
        34: aconst_null
        35: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
      LineNumberTable:
        line 303: 0
        line 304: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            5      31     2   geo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
            0      36     1 location   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleAnnotations:
      0: #49()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final java.util.List<java.lang.Integer> findInArea(int, int, int, int);
    descriptor: (IIII)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=16, args_size=5
         0: new           #28                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: invokespecial #31                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle."<init>":(IIII)V
        12: astore        5
        14: aload_0
        15: getfield      #14                 // Field rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
        18: aload         5
        20: invokevirtual #62                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.search:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Ljava/util/List;
        23: checkcast     #98                 // class java/lang/Iterable
        26: astore        6
        28: iconst_0
        29: istore        7
        31: aload         6
        33: astore        8
        35: new           #100                // class java/util/ArrayList
        38: dup
        39: aload         6
        41: bipush        10
        43: invokestatic  #104                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        46: invokespecial #107                // Method java/util/ArrayList."<init>":(I)V
        49: checkcast     #109                // class java/util/Collection
        52: astore        9
        54: iconst_0
        55: istore        10
        57: aload         8
        59: invokeinterface #113,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        64: astore        11
        66: aload         11
        68: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        73: ifeq          119
        76: aload         11
        78: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        83: astore        12
        85: aload         9
        87: aload         12
        89: checkcast     #33                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        92: astore        13
        94: astore        15
        96: iconst_0
        97: istore        14
        99: aload         13
       101: invokevirtual #71                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getNodeId:()I
       104: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       107: aload         15
       109: swap
       110: invokeinterface #127,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       115: pop
       116: goto          66
       119: aload         9
       121: checkcast     #129                // class java/util/List
       124: nop
       125: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 52 /* same */
      LineNumberTable:
        line 308: 0
        line 309: 14
        line 322: 31
        line 323: 57
        line 324: 85
        line 309: 99
        line 324: 110
        line 325: 119
        line 322: 124
        line 309: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           99       5    14 $i$a$-map-SpatialIndexAdapter$findInArea$1   I
           96       8    13    it   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
           85      31    12 item$iv$iv   Ljava/lang/Object;
           57      64    10 $i$f$mapTo   I
           54      67     8 $this$mapTo$iv$iv   Ljava/lang/Iterable;
           54      67     9 destination$iv$iv   Ljava/util/Collection;
           31      94     7 $i$f$map   I
           28      97     6 $this$map$iv   Ljava/lang/Iterable;
           14     112     5  rect   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0     126     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
            0     126     1  minX   I
            0     126     2  minY   I
            0     126     3  maxX   I
            0     126     4  maxY   I
    Signature: #96                          // (IIII)Ljava/util/List<Ljava/lang/Integer;>;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final void bulkLoadFromNodes(java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=13, args_size=2
         0: aload_1
         1: checkcast     #98                 // class java/lang/Iterable
         4: astore_3
         5: iconst_0
         6: istore        4
         8: aload_3
         9: astore        5
        11: new           #100                // class java/util/ArrayList
        14: dup
        15: aload_3
        16: bipush        10
        18: invokestatic  #104                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        21: invokespecial #107                // Method java/util/ArrayList."<init>":(I)V
        24: checkcast     #109                // class java/util/Collection
        27: astore        6
        29: iconst_0
        30: istore        7
        32: aload         5
        34: invokeinterface #113,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        39: astore        8
        41: aload         8
        43: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        48: ifeq          133
        51: aload         8
        53: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        58: astore        9
        60: aload         6
        62: aload         9
        64: checkcast     #150                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
        67: astore        10
        69: astore        12
        71: iconst_0
        72: istore        11
        74: new           #33                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        77: dup
        78: new           #28                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
        81: dup
        82: aload         10
        84: invokevirtual #153                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoX:()I
        87: aload         10
        89: invokevirtual #156                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoY:()I
        92: aload         10
        94: invokevirtual #153                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoX:()I
        97: iconst_1
        98: iadd
        99: aload         10
       101: invokevirtual #156                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoY:()I
       104: iconst_1
       105: iadd
       106: invokespecial #31                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle."<init>":(IIII)V
       109: aload         10
       111: invokevirtual #159                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getId:()I
       114: aconst_null
       115: iconst_4
       116: aconst_null
       117: invokespecial #36                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
       120: nop
       121: aload         12
       123: swap
       124: invokeinterface #127,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       129: pop
       130: goto          41
       133: aload         6
       135: checkcast     #129                // class java/util/List
       138: nop
       139: astore_2
       140: aload_0
       141: getfield      #14                 // Field rtree:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;
       144: aload_2
       145: invokevirtual #162                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex.bulkLoad:(Ljava/util/List;)V
       148: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter, class java/util/List, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 91
      LineNumberTable:
        line 313: 0
        line 326: 8
        line 327: 32
        line 328: 60
        line 314: 74
        line 315: 78
        line 316: 109
        line 314: 114
        line 317: 120
        line 328: 124
        line 329: 133
        line 326: 138
        line 313: 139
        line 319: 140
        line 320: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      47    11 $i$a$-map-SpatialIndexAdapter$bulkLoadFromNodes$entries$1   I
           71      50    10  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
           60      70     9 item$iv$iv   Ljava/lang/Object;
           32     103     7 $i$f$mapTo   I
           29     106     5 $this$mapTo$iv$iv   Ljava/lang/Iterable;
           29     106     6 destination$iv$iv   Ljava/util/Collection;
            8     131     4 $i$f$map   I
            5     134     3 $this$map$iv   Ljava/lang/Iterable;
          140       9     2 entries   Ljava/util/List;
            0     149     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
            0     149     1 nodes   Ljava/util/List;
    Signature: #148                         // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.SpatialIndexAdapter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: iconst_1
         3: aconst_null
         4: invokespecial #170                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
         7: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
}
InnerClasses:
  public static final #185= #33 of #19;   // Entry=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #186= #28 of #19;   // Rectangle=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
SourceFile: "RTreeIndex.kt"
SourceDebugExtension:
  SMAP
  RTreeIndex.kt
  Kotlin
  *S Kotlin
  *F
  + 1 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,321:1
  1586#2:322
  1661#2,3:323
  1586#2:326
  1661#2,3:327
  *S KotlinDebug
  *F
  + 1 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
  *L
  309#1:322
  309#1:323,3
  313#1:326
  313#1:327,3
  *E
RuntimeVisibleAnnotations:
  0: #171(#172=[I#173,I#174,I#175],#176=I#177,#178=I#179,#180=[s#181],#182=[s#16,s#183,s#11,s#12,s#5,s#6,s#25,s#183,s#43,s#183,s#45,s#46,s#47,s#78,s#79,s#48,s#80,s#92,s#93,s#81,s#94,s#183,s#142,s#143,s#144,s#145,s#146,s#168,s#165,s#184])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\u0014\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;","","rtree","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;","<init>","(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;)V","insertNode","","geoX","","geoY","nodeId","findAt","geo","Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;","findNearest","location","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;","findInArea","","minX","minY","maxX","maxY","bulkLoadFromNodes","nodes","Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #188(#189=[s#190])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nRTreeIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1586#2:322\n1661#2,3:323\n1586#2:326\n1661#2,3:327\n*S KotlinDebug\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter\n*L\n309#1:322\n309#1:323,3\n313#1:326\n313#1:327,3\n*E\n"]
    )
