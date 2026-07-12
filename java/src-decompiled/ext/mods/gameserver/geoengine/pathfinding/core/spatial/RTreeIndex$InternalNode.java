// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$InternalNode
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex$InternalNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.class
  Last modified 9 de jul de 2026; size 5341 bytes
  MD5 checksum 86ee24661cf3f5df96e05ff32a87b81f
  Compiled from "RTreeIndex.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$InternalNode extends ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Node
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
  super_class: #4                         // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
  interfaces: 0, fields: 2, methods: 7, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
    #3 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
    #4 = Class              #3            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/util/List;)V
    #7 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;>;)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #10 = NameAndType        #5:#9         // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #11 = Methodref          #4.#10        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #12 = Utf8               children
   #13 = Utf8               Ljava/util/List;
   #14 = NameAndType        #12:#13       // children:Ljava/util/List;
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.children:Ljava/util/List;
   #16 = Utf8               ()Ljava/lang/Object;
   #17 = MethodType         #16           //  ()Ljava/lang/Object;
   #18 = Utf8               mbr_delegate$lambda$0
   #19 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #20 = NameAndType        #18:#19       // mbr_delegate$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #21 = Methodref          #2.#20        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.mbr_delegate$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #22 = MethodHandle       6:#21         // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.mbr_delegate$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #23 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #24 = MethodType         #23           //  ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #25 = Utf8               java/lang/invoke/LambdaMetafactory
   #26 = Class              #25           // java/lang/invoke/LambdaMetafactory
   #27 = Utf8               metafactory
   #28 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #29 = NameAndType        #27:#28       // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #30 = Methodref          #26.#29       // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #31 = MethodHandle       6:#30         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #32 = Utf8               invoke
   #33 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lkotlin/jvm/functions/Function0;
   #34 = NameAndType        #32:#33       // invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lkotlin/jvm/functions/Function0;
   #35 = InvokeDynamic      #0:#34        // #0:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lkotlin/jvm/functions/Function0;
   #36 = Utf8               kotlin/LazyKt
   #37 = Class              #36           // kotlin/LazyKt
   #38 = Utf8               lazy
   #39 = Utf8               (Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
   #40 = NameAndType        #38:#39       // lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
   #41 = Methodref          #37.#40       // kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
   #42 = Utf8               mbr$delegate
   #43 = Utf8               Lkotlin/Lazy;
   #44 = NameAndType        #42:#43       // mbr$delegate:Lkotlin/Lazy;
   #45 = Fieldref           #2.#44        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.mbr$delegate:Lkotlin/Lazy;
   #46 = Utf8               this
   #47 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
   #48 = Utf8               (Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #49 = Utf8               java/util/ArrayList
   #50 = Class              #49           // java/util/ArrayList
   #51 = Utf8               ()V
   #52 = NameAndType        #5:#51        // "<init>":()V
   #53 = Methodref          #50.#52       // java/util/ArrayList."<init>":()V
   #54 = Utf8               java/util/List
   #55 = Class              #54           // java/util/List
   #56 = NameAndType        #5:#6         // "<init>":(Ljava/util/List;)V
   #57 = Methodref          #2.#56        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode."<init>":(Ljava/util/List;)V
   #58 = Utf8               getChildren
   #59 = Utf8               ()Ljava/util/List;
   #60 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;>;
   #61 = Utf8               getMbr
   #62 = Utf8               kotlin/Lazy
   #63 = Class              #62           // kotlin/Lazy
   #64 = Utf8               getValue
   #65 = NameAndType        #64:#16       // getValue:()Ljava/lang/Object;
   #66 = InterfaceMethodref #63.#65       // kotlin/Lazy.getValue:()Ljava/lang/Object;
   #67 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
   #68 = Class              #67           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
   #69 = Utf8               calculateMBR
   #70 = Utf8               isEmpty
   #71 = Utf8               ()Z
   #72 = NameAndType        #70:#71       // isEmpty:()Z
   #73 = InterfaceMethodref #55.#72       // java/util/List.isEmpty:()Z
   #74 = Utf8               Companion
   #75 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
   #76 = NameAndType        #74:#75       // Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
   #77 = Fieldref           #68.#76       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
   #78 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
   #79 = Class              #78           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
   #80 = Utf8               getEMPTY
   #81 = NameAndType        #80:#23       // getEMPTY:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #82 = Methodref          #79.#81       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion.getEMPTY:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #83 = Utf8               java/lang/Iterable
   #84 = Class              #83           // java/lang/Iterable
   #85 = Utf8               kotlin/collections/CollectionsKt
   #86 = Class              #85           // kotlin/collections/CollectionsKt
   #87 = Utf8               first
   #88 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #89 = NameAndType        #87:#88       // first:(Ljava/util/List;)Ljava/lang/Object;
   #90 = Methodref          #86.#89       // kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
   #91 = NameAndType        #61:#23       // getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #92 = Methodref          #4.#91        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #93 = Utf8               iterator
   #94 = Utf8               ()Ljava/util/Iterator;
   #95 = NameAndType        #93:#94       // iterator:()Ljava/util/Iterator;
   #96 = InterfaceMethodref #84.#95       // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #97 = Utf8               java/util/Iterator
   #98 = Class              #97           // java/util/Iterator
   #99 = Utf8               hasNext
  #100 = NameAndType        #99:#71       // hasNext:()Z
  #101 = InterfaceMethodref #98.#100      // java/util/Iterator.hasNext:()Z
  #102 = Utf8               next
  #103 = NameAndType        #102:#16      // next:()Ljava/lang/Object;
  #104 = InterfaceMethodref #98.#103      // java/util/Iterator.next:()Ljava/lang/Object;
  #105 = Utf8               expand
  #106 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #107 = NameAndType        #105:#106     // expand:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #108 = Methodref          #68.#107      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.expand:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #109 = Utf8               $i$a$-fold-RTreeIndex$InternalNode$calculateMBR$1
  #110 = Utf8               I
  #111 = Utf8               acc
  #112 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #113 = Utf8               child
  #114 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #115 = Utf8               element$iv
  #116 = Utf8               Ljava/lang/Object;
  #117 = Utf8               $i$f$fold
  #118 = Utf8               accumulator$iv
  #119 = Utf8               $this$fold$iv
  #120 = Utf8               Ljava/lang/Iterable;
  #121 = Utf8               initial$iv
  #122 = NameAndType        #69:#23       // calculateMBR:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #123 = Methodref          #2.#122       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.calculateMBR:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #124 = Utf8               this$0
  #125 = NameAndType        #5:#48        // "<init>":(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #126 = Methodref          #2.#125       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode."<init>":(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #127 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;>;
  #128 = Utf8               Lkotlin/Metadata;
  #129 = Utf8               mv
  #130 = Integer            2
  #131 = Integer            3
  #132 = Integer            0
  #133 = Utf8               k
  #134 = Integer            1
  #135 = Utf8               xi
  #136 = Integer            48
  #137 = Utf8               d1
  #138 = Utf8               \u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\tH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f
  #139 = Utf8               d2
  #140 = Utf8
  #141 = Utf8               mbr
  #142 = Utf8               Brproject
  #143 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #144 = Class              #143          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #145 = Utf8               InternalNode
  #146 = Utf8               Node
  #147 = Utf8               Rectangle
  #148 = Utf8               RTreeIndex.kt
  #149 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #150 = Utf8               value
  #151 = Utf8               SMAP\nRTreeIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1849#2,3:322\n*S KotlinDebug\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode\n*L\n277#1:322,3\n*E\n
  #152 = Utf8               Signature
  #153 = Utf8               RuntimeInvisibleAnnotations
  #154 = Utf8               Code
  #155 = Utf8               LineNumberTable
  #156 = Utf8               LocalVariableTable
  #157 = Utf8               RuntimeInvisibleParameterAnnotations
  #158 = Utf8               StackMapTable
  #159 = Utf8               InnerClasses
  #160 = Utf8               SourceFile
  #161 = Utf8               SourceDebugExtension
  #162 = Utf8               RuntimeVisibleAnnotations
  #163 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$InternalNode(java.util.List<ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Node>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aconst_null
         2: invokespecial #11                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         5: aload_0
         6: aload_1
         7: putfield      #15                 // Field children:Ljava/util/List;
        10: aload_0
        11: aload_0
        12: invokedynamic #35,  0             // InvokeDynamic #0:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lkotlin/jvm/functions/Function0;
        17: invokestatic  #41                 // Method kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
        20: putfield      #45                 // Field mbr$delegate:Lkotlin/Lazy;
        23: return
      LineNumberTable:
        line 271: 0
        line 272: 5
        line 274: 10
        line 271: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
            0      24     1 children   Ljava/util/List;
    Signature: #7                           // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$InternalNode(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          17
         6: new           #50                 // class java/util/ArrayList
         9: dup
        10: invokespecial #53                 // Method java/util/ArrayList."<init>":()V
        13: checkcast     #55                 // class java/util/List
        16: astore_1
        17: aload_0
        18: aload_1
        19: invokespecial #57                 // Method "<init>":(Ljava/util/List;)V
        22: return
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
      LineNumberTable:
        line 271: 0
        line 272: 6
        line 271: 17
        line 273: 22

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Node> getChildren();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field children:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 272: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
    Signature: #60                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle getMbr();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: getfield      #45                 // Field mbr$delegate:Lkotlin/Lazy;
         4: astore_1
         5: aload_1
         6: invokeinterface #66,  1           // InterfaceMethod kotlin/Lazy.getValue:()Ljava/lang/Object;
        11: checkcast     #68                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
        14: areturn
      LineNumberTable:
        line 274: 0
        line 274: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle calculateMBR();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=10, args_size=1
         0: aload_0
         1: getfield      #15                 // Field children:Ljava/util/List;
         4: invokeinterface #73,  1           // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          19
        12: getstatic     #77                 // Field ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
        15: invokevirtual #82                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion.getEMPTY:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        18: areturn
        19: aload_0
        20: getfield      #15                 // Field children:Ljava/util/List;
        23: checkcast     #84                 // class java/lang/Iterable
        26: astore_1
        27: aload_0
        28: getfield      #15                 // Field children:Ljava/util/List;
        31: invokestatic  #90                 // Method kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        34: checkcast     #4                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
        37: invokevirtual #92                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        40: astore_2
        41: iconst_0
        42: istore_3
        43: aload_2
        44: astore        4
        46: aload_1
        47: invokeinterface #96,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        52: astore        5
        54: aload         5
        56: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        61: ifeq          102
        64: aload         5
        66: invokeinterface #104,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        71: astore        6
        73: aload         4
        75: aload         6
        77: checkcast     #4                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
        80: astore        7
        82: astore        8
        84: iconst_0
        85: istore        9
        87: aload         8
        89: aload         7
        91: invokevirtual #92                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        94: invokevirtual #108                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.expand:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        97: astore        4
        99: goto          54
       102: aload         4
       104: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle, int, class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle, class java/util/Iterator ]
          stack = []
        frame_type = 47 /* same */
      LineNumberTable:
        line 276: 0
        line 277: 19
        line 322: 43
        line 323: 46
        line 277: 87
        line 323: 97
        line 324: 102
        line 277: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87      10     9 $i$a$-fold-RTreeIndex$InternalNode$calculateMBR$1   I
           84      13     8   acc   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
           84      13     7 child   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
           73      26     6 element$iv   Ljava/lang/Object;
           43      61     3 $i$f$fold   I
           46      58     4 accumulator$iv   Ljava/lang/Object;
           41      63     1 $this$fold$iv   Ljava/lang/Iterable;
           41      63     2 initial$iv   Ljava/lang/Object;
            0     105     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$InternalNode();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: iconst_1
         3: aconst_null
         4: invokespecial #126                // Method "<init>":(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
         7: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
}
InnerClasses:
  public static final #145= #2 of #144;   // InternalNode=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static abstract #146= #4 of #144; // Node=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #147= #68 of #144;  // Rectangle=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #74= #79 of #68;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
SourceFile: "RTreeIndex.kt"
SourceDebugExtension:
  SMAP
  RTreeIndex.kt
  Kotlin
  *S Kotlin
  *F
  + 1 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,321:1
  1849#2,3:322
  *S KotlinDebug
  *F
  + 1 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
  *L
  277#1:322,3
  *E
RuntimeVisibleAnnotations:
  0: #128(#129=[I#130,I#131,I#132],#133=I#134,#135=I#136,#137=[s#138],#139=[s#47,s#114,s#12,s#140,s#5,s#6,s#58,s#59,s#141,s#112,s#61,s#23,s#42,s#43,s#69,s#142])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\tH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;","children","","<init>","(Ljava/util/List;)V","getChildren","()Ljava/util/List;","mbr","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","getMbr","()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","mbr$delegate","Lkotlin/Lazy;","calculateMBR","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #149(#150=[s#151])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nRTreeIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1849#2,3:322\n*S KotlinDebug\n*F\n+ 1 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode\n*L\n277#1:322,3\n*E\n"]
    )
BootstrapMethods:
  0: #31 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #17 ()Ljava/lang/Object;
      #22 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode.mbr_delegate$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
      #24 ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
