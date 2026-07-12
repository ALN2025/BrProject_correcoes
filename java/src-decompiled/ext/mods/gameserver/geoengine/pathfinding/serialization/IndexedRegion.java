// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\IndexedRegion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.class
  Last modified 9 de jul de 2026; size 7736 bytes
  MD5 checksum f4f4432d30fe06f147b5c51d136995b2
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 22, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
    #7 = Utf8               (IILjava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ()V
   #10 = NameAndType        #5:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               regionX
   #13 = Utf8               I
   #14 = NameAndType        #12:#13       // regionX:I
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.regionX:I
   #16 = Utf8               regionY
   #17 = NameAndType        #16:#13       // regionY:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.regionY:I
   #19 = Utf8               nodes
   #20 = Utf8               Ljava/util/Map;
   #21 = NameAndType        #19:#20       // nodes:Ljava/util/Map;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.nodes:Ljava/util/Map;
   #23 = Utf8               walkableCount
   #24 = NameAndType        #23:#13       // walkableCount:I
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.walkableCount:I
   #26 = Utf8               spatialGrid
   #27 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #28 = NameAndType        #26:#27       // spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #30 = Utf8               connectivity
   #31 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
   #32 = NameAndType        #30:#31       // connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
   #33 = Fieldref           #2.#32        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
   #34 = Utf8               sourceType
   #35 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
   #36 = NameAndType        #34:#35       // sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
   #37 = Fieldref           #2.#36        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
   #38 = Utf8               generationTimeMs
   #39 = Utf8               J
   #40 = NameAndType        #38:#39       // generationTimeMs:J
   #41 = Fieldref           #2.#40        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.generationTimeMs:J
   #42 = Utf8               this
   #43 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
   #44 = Utf8               getRegionX
   #45 = Utf8               ()I
   #46 = Utf8               getRegionY
   #47 = Utf8               getNodes
   #48 = Utf8               ()Ljava/util/Map;
   #49 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;
   #50 = Utf8               getWalkableCount
   #51 = Utf8               getSpatialGrid
   #52 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #53 = Utf8               getConnectivity
   #54 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
   #55 = Utf8               getSourceType
   #56 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
   #57 = Utf8               getGenerationTimeMs
   #58 = Utf8               ()J
   #59 = Utf8               component1
   #60 = Utf8               component2
   #61 = Utf8               component3
   #62 = Utf8               component4
   #63 = Utf8               component5
   #64 = Utf8               component6
   #65 = Utf8               component7
   #66 = Utf8               component8
   #67 = Utf8               copy
   #68 = Utf8               (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
   #69 = Utf8               (IILjava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
   #70 = NameAndType        #5:#6         // "<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
   #71 = Methodref          #2.#70        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
   #72 = Utf8               copy$default
   #73 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;JILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
   #74 = NameAndType        #67:#68       // copy:(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
   #75 = Methodref          #2.#74        // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion.copy:(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
   #76 = Utf8               toString
   #77 = Utf8               ()Ljava/lang/String;
   #78 = Utf8               IndexedRegion(regionX=\u0001, regionY=\u0001, nodes=\u0001, walkableCount=\u0001, spatialGrid=\u0001, connectivity=\u0001, sourceType=\u0001, generationTimeMs=\u0001)
   #79 = String             #78           // IndexedRegion(regionX=\u0001, regionY=\u0001, nodes=\u0001, walkableCount=\u0001, spatialGrid=\u0001, connectivity=\u0001, sourceType=\u0001, generationTimeMs=\u0001)
   #80 = Utf8               java/lang/invoke/StringConcatFactory
   #81 = Class              #80           // java/lang/invoke/StringConcatFactory
   #82 = Utf8               makeConcatWithConstants
   #83 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #84 = NameAndType        #82:#83       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #85 = Methodref          #81.#84       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #86 = MethodHandle       6:#85         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #87 = Utf8               (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Ljava/lang/String;
   #88 = NameAndType        #82:#87       // makeConcatWithConstants:(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Ljava/lang/String;
   #89 = InvokeDynamic      #0:#88        // #0:makeConcatWithConstants:(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Ljava/lang/String;
   #90 = Utf8               hashCode
   #91 = Utf8               java/lang/Integer
   #92 = Class              #91           // java/lang/Integer
   #93 = Utf8               (I)I
   #94 = NameAndType        #90:#93       // hashCode:(I)I
   #95 = Methodref          #92.#94       // java/lang/Integer.hashCode:(I)I
   #96 = NameAndType        #90:#45       // hashCode:()I
   #97 = Methodref          #4.#96        // java/lang/Object.hashCode:()I
   #98 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
   #99 = Class              #98           // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #100 = Methodref          #99.#96       // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.hashCode:()I
  #101 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #102 = Class              #101          // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #103 = Methodref          #102.#96      // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity.hashCode:()I
  #104 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #105 = Class              #104          // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #106 = Methodref          #105.#96      // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.hashCode:()I
  #107 = Utf8               java/lang/Long
  #108 = Class              #107          // java/lang/Long
  #109 = Utf8               (J)I
  #110 = NameAndType        #90:#109      // hashCode:(J)I
  #111 = Methodref          #108.#110     // java/lang/Long.hashCode:(J)I
  #112 = Utf8               result
  #113 = Utf8               equals
  #114 = Utf8               (Ljava/lang/Object;)Z
  #115 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #116 = Utf8               kotlin/jvm/internal/Intrinsics
  #117 = Class              #116          // kotlin/jvm/internal/Intrinsics
  #118 = Utf8               areEqual
  #119 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #120 = NameAndType        #118:#119     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #121 = Methodref          #117.#120     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #122 = Utf8               other
  #123 = Utf8               Ljava/lang/Object;
  #124 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;
  #125 = Utf8               Lkotlin/Metadata;
  #126 = Utf8               mv
  #127 = Integer            2
  #128 = Integer            3
  #129 = Integer            0
  #130 = Utf8               k
  #131 = Integer            1
  #132 = Utf8               xi
  #133 = Integer            48
  #134 = Utf8               d1
  #135 = Utf8               \u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010\'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Je\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010.\u001a\u00020/HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060
  #136 = Utf8               d2
  #137 = Utf8
  #138 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #139 = Utf8               Brproject
  #140 = Utf8               L2BRSerializer.kt
  #141 = Utf8               Signature
  #142 = Utf8               RuntimeInvisibleAnnotations
  #143 = Utf8               Code
  #144 = Utf8               LineNumberTable
  #145 = Utf8               LocalVariableTable
  #146 = Utf8               RuntimeInvisibleParameterAnnotations
  #147 = Utf8               StackMapTable
  #148 = Utf8               SourceFile
  #149 = Utf8               RuntimeVisibleAnnotations
  #150 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion(int, int, java.util.Map<java.lang.Integer, ext.mods.gameserver.geoengine.pathfinding.serialization.Node>, int, ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid, ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity, ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType, long);
    descriptor: (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=10, args_size=9
         0: aload_0
         1: invokespecial #11                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #15                 // Field regionX:I
         9: aload_0
        10: iload_2
        11: putfield      #18                 // Field regionY:I
        14: aload_0
        15: aload_3
        16: putfield      #22                 // Field nodes:Ljava/util/Map;
        19: aload_0
        20: iload         4
        22: putfield      #25                 // Field walkableCount:I
        25: aload_0
        26: aload         5
        28: putfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        31: aload_0
        32: aload         6
        34: putfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
        37: aload_0
        38: aload         7
        40: putfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        43: aload_0
        44: lload         8
        46: putfield      #41                 // Field generationTimeMs:J
        49: return
      LineNumberTable:
        line 400: 0
        line 401: 4
        line 402: 9
        line 403: 14
        line 404: 19
        line 405: 25
        line 406: 31
        line 407: 37
        line 408: 43
        line 400: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
            0      50     1 regionX   I
            0      50     2 regionY   I
            0      50     3 nodes   Ljava/util/Map;
            0      50     4 walkableCount   I
            0      50     5 spatialGrid   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0      50     6 connectivity   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
            0      50     7 sourceType   Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
            0      50     8 generationTimeMs   J
    Signature: #7                           // (IILjava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 3:
      parameter 4:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 5:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 6:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 7:

  public final int getRegionX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field regionX:I
         4: ireturn
      LineNumberTable:
        line 401: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final int getRegionY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field regionY:I
         4: ireturn
      LineNumberTable:
        line 402: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.geoengine.pathfinding.serialization.Node> getNodes();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field nodes:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 403: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    Signature: #49                          // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final int getWalkableCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field walkableCount:I
         4: ireturn
      LineNumberTable:
        line 404: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid getSpatialGrid();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
         4: areturn
      LineNumberTable:
        line 405: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity getConnectivity();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
         4: areturn
      LineNumberTable:
        line 406: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType getSourceType();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
         4: areturn
      LineNumberTable:
        line 407: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final long getGenerationTimeMs();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field generationTimeMs:J
         4: lreturn
      LineNumberTable:
        line 408: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field regionX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field regionY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.geoengine.pathfinding.serialization.Node> component3();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field nodes:Ljava/util/Map;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    Signature: #49                          // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final int component4();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field walkableCount:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid component5();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity component6();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType component7();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final long component8();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field generationTimeMs:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion copy(int, int, java.util.Map<java.lang.Integer, ext.mods.gameserver.geoengine.pathfinding.serialization.Node>, int, ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid, ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity, ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType, long);
    descriptor: (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=10, args_size=9
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
         3: dup
         4: iload_1
         5: iload_2
         6: aload_3
         7: iload         4
         9: aload         5
        11: aload         6
        13: aload         7
        15: lload         8
        17: invokespecial #71                 // Method "<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
        20: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
            0      21     1 regionX   I
            0      21     2 regionY   I
            0      21     3 nodes   Ljava/util/Map;
            0      21     4 walkableCount   I
            0      21     5 spatialGrid   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0      21     6 connectivity   Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
            0      21     7 sourceType   Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
            0      21     8 generationTimeMs   J
    Signature: #69                          // (IILjava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;>;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 3:
      parameter 4:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 5:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 6:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 7:

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.IndexedRegion, int, int, java.util.Map, int, ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid, ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity, ext.mods.gameserver.geoengine.pathfinding.serialization.SourceType, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;JILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=10, locals=12, args_size=11
         0: iload         10
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #15                 // Field regionX:I
        11: istore_1
        12: iload         10
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #18                 // Field regionY:I
        23: istore_2
        24: iload         10
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #22                 // Field nodes:Ljava/util/Map;
        35: astore_3
        36: iload         10
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #25                 // Field walkableCount:I
        48: istore        4
        50: iload         10
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        62: astore        5
        64: iload         10
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
        76: astore        6
        78: iload         10
        80: bipush        64
        82: iand
        83: ifeq          92
        86: aload_0
        87: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        90: astore        7
        92: iload         10
        94: sipush        128
        97: iand
        98: ifeq          107
       101: aload_0
       102: getfield      #41                 // Field generationTimeMs:J
       105: lstore        8
       107: aload_0
       108: iload_1
       109: iload_2
       110: aload_3
       111: iload         4
       113: aload         5
       115: aload         6
       117: aload         7
       119: lload         8
       121: invokevirtual #75                 // Method copy:(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
       124: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field regionX:I
         4: aload_0
         5: getfield      #18                 // Field regionY:I
         8: aload_0
         9: getfield      #22                 // Field nodes:Ljava/util/Map;
        12: aload_0
        13: getfield      #25                 // Field walkableCount:I
        16: aload_0
        17: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        20: aload_0
        21: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
        24: aload_0
        25: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        28: aload_0
        29: getfield      #41                 // Field generationTimeMs:J
        32: invokedynamic #89,  0             // InvokeDynamic #0:makeConcatWithConstants:(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)Ljava/lang/String;
        37: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #15                 // Field regionX:I
         4: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #18                 // Field regionY:I
        16: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #22                 // Field nodes:Ljava/util/Map;
        29: invokevirtual #97                 // Method java/lang/Object.hashCode:()I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #25                 // Field walkableCount:I
        42: invokestatic  #95                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        55: invokevirtual #100                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.hashCode:()I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
        68: invokevirtual #103                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity.hashCode:()I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
        81: invokevirtual #106                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.hashCode:()I
        84: iadd
        85: istore_1
        86: iload_1
        87: bipush        31
        89: imul
        90: aload_0
        91: getfield      #41                 // Field generationTimeMs:J
        94: invokestatic  #111                // Method java/lang/Long.hashCode:(J)I
        97: iadd
        98: istore_1
        99: iload_1
       100: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      93     1 result   I
            0     101     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
        20: astore_2
        21: aload_0
        22: getfield      #15                 // Field regionX:I
        25: aload_2
        26: getfield      #15                 // Field regionX:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #18                 // Field regionY:I
        38: aload_2
        39: getfield      #18                 // Field regionY:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #22                 // Field nodes:Ljava/util/Map;
        51: aload_2
        52: getfield      #22                 // Field nodes:Ljava/util/Map;
        55: invokestatic  #121                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        58: ifne          63
        61: iconst_0
        62: ireturn
        63: aload_0
        64: getfield      #25                 // Field walkableCount:I
        67: aload_2
        68: getfield      #25                 // Field walkableCount:I
        71: if_icmpeq     76
        74: iconst_0
        75: ireturn
        76: aload_0
        77: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        80: aload_2
        81: getfield      #29                 // Field spatialGrid:Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        84: invokestatic  #121                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        87: ifne          92
        90: iconst_0
        91: ireturn
        92: aload_0
        93: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
        96: aload_2
        97: getfield      #33                 // Field connectivity:Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
       100: invokestatic  #121                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       103: ifne          108
       106: iconst_0
       107: ireturn
       108: aload_0
       109: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       112: aload_2
       113: getfield      #37                 // Field sourceType:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       116: if_acmpeq     121
       119: iconst_0
       120: ireturn
       121: aload_0
       122: getfield      #41                 // Field generationTimeMs:J
       125: aload_2
       126: getfield      #41                 // Field generationTimeMs:J
       129: lcmp
       130: ifeq          135
       133: iconst_0
       134: ireturn
       135: iconst_1
       136: ireturn
      StackMapTable: number_of_entries = 10
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion ]
        frame_type = 12 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
            0     137     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #115()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #125(#126=[I#127,I#128,I#129],#130=I#131,#132=I#133,#134=[s#135],#136=[s#43,s#137,s#12,s#137,s#16,s#19,s#137,s#138,s#23,s#26,s#27,s#30,s#31,s#34,s#35,s#38,s#137,s#5,s#6,s#44,s#45,s#46,s#47,s#48,s#50,s#51,s#52,s#53,s#54,s#55,s#56,s#57,s#58,s#59,s#60,s#61,s#62,s#63,s#64,s#65,s#66,s#67,s#113,s#137,s#122,s#90,s#76,s#137,s#139])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010\'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Je\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010.\u001a\u00020/HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;","","regionX","","regionY","nodes","","Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;","walkableCount","spatialGrid","Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;","connectivity","Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;","sourceType","Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;","generationTimeMs","","<init>","(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V","getRegionX","()I","getRegionY","getNodes","()Ljava/util/Map;","getWalkableCount","getSpatialGrid","()Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;","getConnectivity","()Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;","getSourceType","()Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;","getGenerationTimeMs","()J","component1","component2","component3","component4","component5","component6","component7","component8","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #86 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #79 IndexedRegion(regionX=\u0001, regionY=\u0001, nodes=\u0001, walkableCount=\u0001, spatialGrid=\u0001, connectivity=\u0001, sourceType=\u0001, generationTimeMs=\u0001)
