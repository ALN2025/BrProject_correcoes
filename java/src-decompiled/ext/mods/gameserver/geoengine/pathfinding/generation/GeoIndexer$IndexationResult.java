// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$IndexationResult.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.class
  Last modified 9 de jul de 2026; size 6145 bytes
  MD5 checksum 795dee2dc8c76daec7b36543345194f4
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 20, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
    #7 = Utf8               (IILjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ()V
   #10 = NameAndType        #5:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               regionX
   #13 = Utf8               I
   #14 = NameAndType        #12:#13       // regionX:I
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.regionX:I
   #16 = Utf8               regionY
   #17 = NameAndType        #16:#13       // regionY:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.regionY:I
   #19 = Utf8               nodes
   #20 = Utf8               Ljava/util/List;
   #21 = NameAndType        #19:#20       // nodes:Ljava/util/List;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.nodes:Ljava/util/List;
   #23 = Utf8               walkableCount
   #24 = NameAndType        #23:#13       // walkableCount:I
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.walkableCount:I
   #26 = Utf8               multilayerCount
   #27 = NameAndType        #26:#13       // multilayerCount:I
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.multilayerCount:I
   #29 = Utf8               durationMs
   #30 = Utf8               J
   #31 = NameAndType        #29:#30       // durationMs:J
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.durationMs:J
   #33 = Utf8               sourceInfo
   #34 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #35 = NameAndType        #33:#34       // sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #37 = Utf8               this
   #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
   #39 = Utf8               getRegionX
   #40 = Utf8               ()I
   #41 = Utf8               getRegionY
   #42 = Utf8               getNodes
   #43 = Utf8               ()Ljava/util/List;
   #44 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
   #45 = Utf8               getWalkableCount
   #46 = Utf8               getMultilayerCount
   #47 = Utf8               getDurationMs
   #48 = Utf8               ()J
   #49 = Utf8               getSourceInfo
   #50 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #51 = Utf8               component1
   #52 = Utf8               component2
   #53 = Utf8               component3
   #54 = Utf8               component4
   #55 = Utf8               component5
   #56 = Utf8               component6
   #57 = Utf8               component7
   #58 = Utf8               copy
   #59 = Utf8               (IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
   #60 = Utf8               (IILjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
   #61 = NameAndType        #5:#6         // "<init>":(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
   #62 = Methodref          #2.#61        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult."<init>":(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
   #63 = Utf8               copy$default
   #64 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
   #65 = NameAndType        #58:#59       // copy:(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
   #66 = Methodref          #2.#65        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.copy:(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
   #67 = Utf8               toString
   #68 = Utf8               ()Ljava/lang/String;
   #69 = Utf8               IndexationResult(regionX=\u0001, regionY=\u0001, nodes=\u0001, walkableCount=\u0001, multilayerCount=\u0001, durationMs=\u0001, sourceInfo=\u0001)
   #70 = String             #69           // IndexationResult(regionX=\u0001, regionY=\u0001, nodes=\u0001, walkableCount=\u0001, multilayerCount=\u0001, durationMs=\u0001, sourceInfo=\u0001)
   #71 = Utf8               java/lang/invoke/StringConcatFactory
   #72 = Class              #71           // java/lang/invoke/StringConcatFactory
   #73 = Utf8               makeConcatWithConstants
   #74 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #75 = NameAndType        #73:#74       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #76 = Methodref          #72.#75       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #77 = MethodHandle       6:#76         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #78 = Utf8               (IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Ljava/lang/String;
   #79 = NameAndType        #73:#78       // makeConcatWithConstants:(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Ljava/lang/String;
   #80 = InvokeDynamic      #0:#79        // #0:makeConcatWithConstants:(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Ljava/lang/String;
   #81 = Utf8               hashCode
   #82 = Utf8               java/lang/Integer
   #83 = Class              #82           // java/lang/Integer
   #84 = Utf8               (I)I
   #85 = NameAndType        #81:#84       // hashCode:(I)I
   #86 = Methodref          #83.#85       // java/lang/Integer.hashCode:(I)I
   #87 = NameAndType        #81:#40       // hashCode:()I
   #88 = Methodref          #4.#87        // java/lang/Object.hashCode:()I
   #89 = Utf8               java/lang/Long
   #90 = Class              #89           // java/lang/Long
   #91 = Utf8               (J)I
   #92 = NameAndType        #81:#91       // hashCode:(J)I
   #93 = Methodref          #90.#92       // java/lang/Long.hashCode:(J)I
   #94 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
   #95 = Class              #94           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
   #96 = Methodref          #95.#87       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.hashCode:()I
   #97 = Utf8               result
   #98 = Utf8               equals
   #99 = Utf8               (Ljava/lang/Object;)Z
  #100 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #101 = Utf8               kotlin/jvm/internal/Intrinsics
  #102 = Class              #101          // kotlin/jvm/internal/Intrinsics
  #103 = Utf8               areEqual
  #104 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #105 = NameAndType        #103:#104     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #106 = Methodref          #102.#105     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #107 = Utf8               other
  #108 = Utf8               Ljava/lang/Object;
  #109 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
  #110 = Utf8               Lkotlin/Metadata;
  #111 = Utf8               mv
  #112 = Integer            2
  #113 = Integer            3
  #114 = Integer            0
  #115 = Utf8               k
  #116 = Integer            1
  #117 = Utf8               xi
  #118 = Integer            48
  #119 = Utf8               d1
  #120 = Utf8               \u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\'\u001a\u00020(HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)
  #121 = Utf8               d2
  #122 = Utf8
  #123 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #124 = Utf8               Brproject
  #125 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #126 = Class              #125          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #127 = Utf8               IndexationResult
  #128 = Utf8               SourceInfo
  #129 = Utf8               GeoIndexer.kt
  #130 = Utf8               Signature
  #131 = Utf8               RuntimeInvisibleAnnotations
  #132 = Utf8               Code
  #133 = Utf8               LineNumberTable
  #134 = Utf8               LocalVariableTable
  #135 = Utf8               RuntimeInvisibleParameterAnnotations
  #136 = Utf8               StackMapTable
  #137 = Utf8               InnerClasses
  #138 = Utf8               SourceFile
  #139 = Utf8               RuntimeVisibleAnnotations
  #140 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult(int, int, java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>, int, int, long, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo);
    descriptor: (IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=8
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
        16: putfield      #22                 // Field nodes:Ljava/util/List;
        19: aload_0
        20: iload         4
        22: putfield      #25                 // Field walkableCount:I
        25: aload_0
        26: iload         5
        28: putfield      #28                 // Field multilayerCount:I
        31: aload_0
        32: lload         6
        34: putfield      #32                 // Field durationMs:J
        37: aload_0
        38: aload         8
        40: putfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
        43: return
      LineNumberTable:
        line 41: 0
        line 42: 4
        line 43: 9
        line 44: 14
        line 45: 19
        line 46: 25
        line 47: 31
        line 48: 37
        line 41: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
            0      44     1 regionX   I
            0      44     2 regionY   I
            0      44     3 nodes   Ljava/util/List;
            0      44     4 walkableCount   I
            0      44     5 multilayerCount   I
            0      44     6 durationMs   J
            0      44     8 sourceInfo   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    Signature: #7                           // (IILjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #8()
          org.jetbrains.annotations.NotNull

  public final int getRegionX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field regionX:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final int getRegionY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field regionY:I
         4: ireturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode> getNodes();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field nodes:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
    Signature: #44                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
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
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final int getMultilayerCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field multilayerCount:I
         4: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final long getDurationMs();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field durationMs:J
         4: lreturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo getSourceInfo();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
         4: areturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode> component3();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field nodes:Ljava/util/List;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
    Signature: #44                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final int component5();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field multilayerCount:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final long component6();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field durationMs:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo component7();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult copy(int, int, java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>, int, int, long, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo);
    descriptor: (IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=9, args_size=8
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
         3: dup
         4: iload_1
         5: iload_2
         6: aload_3
         7: iload         4
         9: iload         5
        11: lload         6
        13: aload         8
        15: invokespecial #62                 // Method "<init>":(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
        18: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
            0      19     1 regionX   I
            0      19     2 regionY   I
            0      19     3 nodes   Ljava/util/List;
            0      19     4 walkableCount   I
            0      19     5 multilayerCount   I
            0      19     6 durationMs   J
            0      19     8 sourceInfo   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    Signature: #60                          // (IILjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
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
      parameter 5:
      parameter 6:
        0: #8()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult copy$default(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult, int, int, java.util.List, int, int, long, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=11, args_size=10
         0: iload         9
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #15                 // Field regionX:I
        11: istore_1
        12: iload         9
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #18                 // Field regionY:I
        23: istore_2
        24: iload         9
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #22                 // Field nodes:Ljava/util/List;
        35: astore_3
        36: iload         9
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #25                 // Field walkableCount:I
        48: istore        4
        50: iload         9
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #28                 // Field multilayerCount:I
        62: istore        5
        64: iload         9
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #32                 // Field durationMs:J
        76: lstore        6
        78: iload         9
        80: bipush        64
        82: iand
        83: ifeq          92
        86: aload_0
        87: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
        90: astore        8
        92: aload_0
        93: iload_1
        94: iload_2
        95: aload_3
        96: iload         4
        98: iload         5
       100: lload         6
       102: aload         8
       104: invokevirtual #66                 // Method copy:(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
       107: areturn
      StackMapTable: number_of_entries = 7
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field regionX:I
         4: aload_0
         5: getfield      #18                 // Field regionY:I
         8: aload_0
         9: getfield      #22                 // Field nodes:Ljava/util/List;
        12: aload_0
        13: getfield      #25                 // Field walkableCount:I
        16: aload_0
        17: getfield      #28                 // Field multilayerCount:I
        20: aload_0
        21: getfield      #32                 // Field durationMs:J
        24: aload_0
        25: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
        28: invokedynamic #80,  0             // InvokeDynamic #0:makeConcatWithConstants:(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)Ljava/lang/String;
        33: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
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
         4: invokestatic  #86                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #18                 // Field regionY:I
        16: invokestatic  #86                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #22                 // Field nodes:Ljava/util/List;
        29: invokevirtual #88                 // Method java/lang/Object.hashCode:()I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #25                 // Field walkableCount:I
        42: invokestatic  #86                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #28                 // Field multilayerCount:I
        55: invokestatic  #86                 // Method java/lang/Integer.hashCode:(I)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #32                 // Field durationMs:J
        68: invokestatic  #93                 // Method java/lang/Long.hashCode:(J)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
        81: invokevirtual #96                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.hashCode:()I
        84: iadd
        85: istore_1
        86: iload_1
        87: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      80     1 result   I
            0      88     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
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
        48: getfield      #22                 // Field nodes:Ljava/util/List;
        51: aload_2
        52: getfield      #22                 // Field nodes:Ljava/util/List;
        55: invokestatic  #106                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
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
        77: getfield      #28                 // Field multilayerCount:I
        80: aload_2
        81: getfield      #28                 // Field multilayerCount:I
        84: if_icmpeq     89
        87: iconst_0
        88: ireturn
        89: aload_0
        90: getfield      #32                 // Field durationMs:J
        93: aload_2
        94: getfield      #32                 // Field durationMs:J
        97: lcmp
        98: ifeq          103
       101: iconst_0
       102: ireturn
       103: aload_0
       104: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
       107: aload_2
       108: getfield      #36                 // Field sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
       111: invokestatic  #106                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       114: ifne          119
       117: iconst_0
       118: ireturn
       119: iconst_1
       120: ireturn
      StackMapTable: number_of_entries = 9
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult ]
        frame_type = 12 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 15 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     121     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
            0     121     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #100()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #127= #2 of #126;   // IndexationResult=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #128= #95 of #126;  // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #110(#111=[I#112,I#113,I#114],#115=I#116,#117=I#118,#119=[s#120],#121=[s#38,s#122,s#12,s#122,s#16,s#19,s#122,s#123,s#23,s#26,s#29,s#122,s#33,s#34,s#5,s#6,s#39,s#40,s#41,s#42,s#43,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#54,s#55,s#56,s#57,s#58,s#98,s#122,s#107,s#81,s#67,s#122,s#124])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\'\u001a\u00020(HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;","","regionX","","regionY","nodes","","Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","walkableCount","multilayerCount","durationMs","","sourceInfo","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;","<init>","(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V","getRegionX","()I","getRegionY","getNodes","()Ljava/util/List;","getWalkableCount","getMultilayerCount","getDurationMs","()J","getSourceInfo","()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;","component1","component2","component3","component4","component5","component6","component7","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #77 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #70 IndexationResult(regionX=\u0001, regionY=\u0001, nodes=\u0001, walkableCount=\u0001, multilayerCount=\u0001, durationMs=\u0001, sourceInfo=\u0001)
