// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.Node
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\Node.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/Node.class
  Last modified 9 de jul de 2026; size 5218 bytes
  MD5 checksum beb58aaba5b8e893f64887542ac11343
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.Node
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 21, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Node
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/Node
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIIIZZLjava/util/List;)V
    #7 = Utf8               (IIIIZZLjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ()V
   #10 = NameAndType        #5:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               x
   #13 = Utf8               I
   #14 = NameAndType        #12:#13       // x:I
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.x:I
   #16 = Utf8               y
   #17 = NameAndType        #16:#13       // y:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.y:I
   #19 = Utf8               z
   #20 = NameAndType        #19:#13       // z:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.z:I
   #22 = Utf8               originalId
   #23 = NameAndType        #22:#13       // originalId:I
   #24 = Fieldref           #2.#23        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.originalId:I
   #25 = Utf8               isWalkable
   #26 = Utf8               Z
   #27 = NameAndType        #25:#26       // isWalkable:Z
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.isWalkable:Z
   #29 = Utf8               isCellEdge
   #30 = NameAndType        #29:#26       // isCellEdge:Z
   #31 = Fieldref           #2.#30        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.isCellEdge:Z
   #32 = Utf8               edges
   #33 = Utf8               Ljava/util/List;
   #34 = NameAndType        #32:#33       // edges:Ljava/util/List;
   #35 = Fieldref           #2.#34        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.edges:Ljava/util/List;
   #36 = Utf8               this
   #37 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
   #38 = Utf8               (IIIIZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #39 = Utf8               kotlin/collections/CollectionsKt
   #40 = Class              #39           // kotlin/collections/CollectionsKt
   #41 = Utf8               emptyList
   #42 = Utf8               ()Ljava/util/List;
   #43 = NameAndType        #41:#42       // emptyList:()Ljava/util/List;
   #44 = Methodref          #40.#43       // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
   #45 = NameAndType        #5:#6         // "<init>":(IIIIZZLjava/util/List;)V
   #46 = Methodref          #2.#45        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node."<init>":(IIIIZZLjava/util/List;)V
   #47 = Utf8               getX
   #48 = Utf8               ()I
   #49 = Utf8               getY
   #50 = Utf8               getZ
   #51 = Utf8               getOriginalId
   #52 = Utf8               ()Z
   #53 = Utf8               getEdges
   #54 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;
   #55 = Utf8               component1
   #56 = Utf8               component2
   #57 = Utf8               component3
   #58 = Utf8               component4
   #59 = Utf8               component5
   #60 = Utf8               component6
   #61 = Utf8               component7
   #62 = Utf8               copy
   #63 = Utf8               (IIIIZZLjava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
   #64 = Utf8               (IIIIZZLjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
   #65 = Utf8               copy$default
   #66 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;IIIIZZLjava/util/List;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
   #67 = NameAndType        #62:#63       // copy:(IIIIZZLjava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
   #68 = Methodref          #2.#67        // ext/mods/gameserver/geoengine/pathfinding/serialization/Node.copy:(IIIIZZLjava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
   #69 = Utf8               toString
   #70 = Utf8               ()Ljava/lang/String;
   #71 = Utf8               Node(x=\u0001, y=\u0001, z=\u0001, originalId=\u0001, isWalkable=\u0001, isCellEdge=\u0001, edges=\u0001)
   #72 = String             #71           // Node(x=\u0001, y=\u0001, z=\u0001, originalId=\u0001, isWalkable=\u0001, isCellEdge=\u0001, edges=\u0001)
   #73 = Utf8               java/lang/invoke/StringConcatFactory
   #74 = Class              #73           // java/lang/invoke/StringConcatFactory
   #75 = Utf8               makeConcatWithConstants
   #76 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #77 = NameAndType        #75:#76       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #78 = Methodref          #74.#77       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #79 = MethodHandle       6:#78         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = Utf8               (IIIIZZLjava/util/List;)Ljava/lang/String;
   #81 = NameAndType        #75:#80       // makeConcatWithConstants:(IIIIZZLjava/util/List;)Ljava/lang/String;
   #82 = InvokeDynamic      #0:#81        // #0:makeConcatWithConstants:(IIIIZZLjava/util/List;)Ljava/lang/String;
   #83 = Utf8               hashCode
   #84 = Utf8               java/lang/Integer
   #85 = Class              #84           // java/lang/Integer
   #86 = Utf8               (I)I
   #87 = NameAndType        #83:#86       // hashCode:(I)I
   #88 = Methodref          #85.#87       // java/lang/Integer.hashCode:(I)I
   #89 = Utf8               java/lang/Boolean
   #90 = Class              #89           // java/lang/Boolean
   #91 = Utf8               (Z)I
   #92 = NameAndType        #83:#91       // hashCode:(Z)I
   #93 = Methodref          #90.#92       // java/lang/Boolean.hashCode:(Z)I
   #94 = NameAndType        #83:#48       // hashCode:()I
   #95 = Methodref          #4.#94        // java/lang/Object.hashCode:()I
   #96 = Utf8               result
   #97 = Utf8               equals
   #98 = Utf8               (Ljava/lang/Object;)Z
   #99 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #100 = Utf8               kotlin/jvm/internal/Intrinsics
  #101 = Class              #100          // kotlin/jvm/internal/Intrinsics
  #102 = Utf8               areEqual
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #104 = NameAndType        #102:#103     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #105 = Methodref          #101.#104     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #106 = Utf8               other
  #107 = Utf8               Ljava/lang/Object;
  #108 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;
  #109 = Utf8               Lkotlin/Metadata;
  #110 = Utf8               mv
  #111 = Integer            2
  #112 = Integer            3
  #113 = Integer            0
  #114 = Utf8               k
  #115 = Integer            1
  #116 = Utf8               xi
  #117 = Integer            48
  #118 = Utf8               d1
  #119 = Utf8               \u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$
  #120 = Utf8               d2
  #121 = Utf8
  #122 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
  #123 = Utf8               Brproject
  #124 = Utf8               L2BRSerializer.kt
  #125 = Utf8               Signature
  #126 = Utf8               RuntimeInvisibleAnnotations
  #127 = Utf8               Code
  #128 = Utf8               LineNumberTable
  #129 = Utf8               LocalVariableTable
  #130 = Utf8               RuntimeInvisibleParameterAnnotations
  #131 = Utf8               StackMapTable
  #132 = Utf8               SourceFile
  #133 = Utf8               RuntimeVisibleAnnotations
  #134 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.Node(int, int, int, int, boolean, boolean, java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Edge>);
    descriptor: (IIIIZZLjava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=8, args_size=8
         0: aload_0
         1: invokespecial #11                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #15                 // Field x:I
         9: aload_0
        10: iload_2
        11: putfield      #18                 // Field y:I
        14: aload_0
        15: iload_3
        16: putfield      #21                 // Field z:I
        19: aload_0
        20: iload         4
        22: putfield      #24                 // Field originalId:I
        25: aload_0
        26: iload         5
        28: putfield      #28                 // Field isWalkable:Z
        31: aload_0
        32: iload         6
        34: putfield      #31                 // Field isCellEdge:Z
        37: aload_0
        38: aload         7
        40: putfield      #35                 // Field edges:Ljava/util/List;
        43: return
      LineNumberTable:
        line 410: 0
        line 411: 4
        line 412: 9
        line 413: 14
        line 414: 19
        line 415: 25
        line 416: 31
        line 417: 37
        line 410: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
            0      44     1     x   I
            0      44     2     y   I
            0      44     3     z   I
            0      44     4 originalId   I
            0      44     5 isWalkable   Z
            0      44     6 isCellEdge   Z
            0      44     7 edges   Ljava/util/List;
    Signature: #7                           // (IIIIZZLjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #8()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.serialization.Node(int, int, int, int, boolean, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (IIIIZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=10
         0: iload         8
         2: bipush        64
         4: iand
         5: ifeq          13
         8: invokestatic  #44                 // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        11: astore        7
        13: aload_0
        14: iload_1
        15: iload_2
        16: iload_3
        17: iload         4
        19: iload         5
        21: iload         6
        23: aload         7
        25: invokespecial #46                 // Method "<init>":(IIIIZZLjava/util/List;)V
        28: return
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */
      LineNumberTable:
        line 410: 0
        line 417: 8
        line 410: 13
        line 418: 28

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 411: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 412: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 413: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final int getOriginalId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field originalId:I
         4: ireturn
      LineNumberTable:
        line 414: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final boolean isWalkable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field isWalkable:Z
         4: ireturn
      LineNumberTable:
        line 415: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final boolean isCellEdge();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field isCellEdge:Z
         4: ireturn
      LineNumberTable:
        line 416: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Edge> getEdges();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field edges:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 417: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    Signature: #54                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field x:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field y:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field z:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final int component4();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field originalId:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final boolean component5();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field isWalkable:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final boolean component6();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field isCellEdge:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Edge> component7();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field edges:Ljava/util/List;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    Signature: #54                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.Node copy(int, int, int, int, boolean, boolean, java.util.List<ext.mods.gameserver.geoengine.pathfinding.serialization.Edge>);
    descriptor: (IIIIZZLjava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=8, args_size=8
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Node
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: aload         7
        15: invokespecial #46                 // Method "<init>":(IIIIZZLjava/util/List;)V
        18: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
            0      19     1     x   I
            0      19     2     y   I
            0      19     3     z   I
            0      19     4 originalId   I
            0      19     5 isWalkable   Z
            0      19     6 isCellEdge   Z
            0      19     7 edges   Ljava/util/List;
    Signature: #64                          // (IIIIZZLjava/util/List<Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;>;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #8()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.Node copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.Node, int, int, int, int, boolean, boolean, java.util.List, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;IIIIZZLjava/util/List;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=10
         0: iload         8
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #15                 // Field x:I
        11: istore_1
        12: iload         8
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #18                 // Field y:I
        23: istore_2
        24: iload         8
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #21                 // Field z:I
        35: istore_3
        36: iload         8
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #24                 // Field originalId:I
        48: istore        4
        50: iload         8
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #28                 // Field isWalkable:Z
        62: istore        5
        64: iload         8
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #31                 // Field isCellEdge:Z
        76: istore        6
        78: iload         8
        80: bipush        64
        82: iand
        83: ifeq          92
        86: aload_0
        87: getfield      #35                 // Field edges:Ljava/util/List;
        90: astore        7
        92: aload_0
        93: iload_1
        94: iload_2
        95: iload_3
        96: iload         4
        98: iload         5
       100: iload         6
       102: aload         7
       104: invokevirtual #68                 // Method copy:(IIIIZZLjava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
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
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field x:I
         4: aload_0
         5: getfield      #18                 // Field y:I
         8: aload_0
         9: getfield      #21                 // Field z:I
        12: aload_0
        13: getfield      #24                 // Field originalId:I
        16: aload_0
        17: getfield      #28                 // Field isWalkable:Z
        20: aload_0
        21: getfield      #31                 // Field isCellEdge:Z
        24: aload_0
        25: getfield      #35                 // Field edges:Ljava/util/List;
        28: invokedynamic #82,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIIIZZLjava/util/List;)Ljava/lang/String;
        33: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #15                 // Field x:I
         4: invokestatic  #88                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #18                 // Field y:I
        16: invokestatic  #88                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #21                 // Field z:I
        29: invokestatic  #88                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #24                 // Field originalId:I
        42: invokestatic  #88                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #28                 // Field isWalkable:Z
        55: invokestatic  #93                 // Method java/lang/Boolean.hashCode:(Z)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #31                 // Field isCellEdge:Z
        68: invokestatic  #93                 // Method java/lang/Boolean.hashCode:(Z)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #35                 // Field edges:Ljava/util/List;
        81: invokevirtual #95                 // Method java/lang/Object.hashCode:()I
        84: iadd
        85: istore_1
        86: iload_1
        87: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      80     1 result   I
            0      88     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Node
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Node
        20: astore_2
        21: aload_0
        22: getfield      #15                 // Field x:I
        25: aload_2
        26: getfield      #15                 // Field x:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #18                 // Field y:I
        38: aload_2
        39: getfield      #18                 // Field y:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #21                 // Field z:I
        51: aload_2
        52: getfield      #21                 // Field z:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #24                 // Field originalId:I
        64: aload_2
        65: getfield      #24                 // Field originalId:I
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: aload_0
        74: getfield      #28                 // Field isWalkable:Z
        77: aload_2
        78: getfield      #28                 // Field isWalkable:Z
        81: if_icmpeq     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #31                 // Field isCellEdge:Z
        90: aload_2
        91: getfield      #31                 // Field isCellEdge:Z
        94: if_icmpeq     99
        97: iconst_0
        98: ireturn
        99: aload_0
       100: getfield      #35                 // Field edges:Ljava/util/List;
       103: aload_2
       104: getfield      #35                 // Field edges:Ljava/util/List;
       107: invokestatic  #105                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       110: ifne          115
       113: iconst_0
       114: ireturn
       115: iconst_1
       116: ireturn
      StackMapTable: number_of_entries = 9
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/Node ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 15 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     117     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
            0     117     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #99()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #109(#110=[I#111,I#112,I#113],#114=I#115,#116=I#117,#118=[s#119],#120=[s#37,s#121,s#12,s#121,s#16,s#19,s#22,s#25,s#121,s#29,s#32,s#121,s#122,s#5,s#6,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#42,s#55,s#56,s#57,s#58,s#59,s#60,s#61,s#62,s#97,s#106,s#83,s#69,s#121,s#123])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;","","x","","y","z","originalId","isWalkable","","isCellEdge","edges","","Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;","<init>","(IIIIZZLjava/util/List;)V","getX","()I","getY","getZ","getOriginalId","()Z","getEdges","()Ljava/util/List;","component1","component2","component3","component4","component5","component6","component7","copy","equals","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #79 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #72 Node(x=\u0001, y=\u0001, z=\u0001, originalId=\u0001, isWalkable=\u0001, isCellEdge=\u0001, edges=\u0001)
