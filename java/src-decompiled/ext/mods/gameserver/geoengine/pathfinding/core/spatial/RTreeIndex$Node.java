// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Node
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex$Node.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.class
  Last modified 9 de jul de 2026; size 1770 bytes
  MD5 checksum 50a8874593728fae503e460131799ac8
  Compiled from "RTreeIndex.kt"
public abstract class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Node
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
   #6 = Class              #5             // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode
   #7 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode
   #8 = Class              #7             // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode
   #9 = Utf8               <init>
  #10 = Utf8               ()V
  #11 = NameAndType        #9:#10         // "<init>":()V
  #12 = Methodref          #4.#11         // java/lang/Object."<init>":()V
  #13 = Utf8               this
  #14 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #15 = Utf8               getMbr
  #16 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #17 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #18 = Utf8               calculateMBR
  #19 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #20 = Methodref          #2.#11         // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node."<init>":()V
  #21 = Utf8               $constructor_marker
  #22 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #23 = Utf8               Lkotlin/Metadata;
  #24 = Utf8               mv
  #25 = Integer            2
  #26 = Integer            3
  #27 = Integer            0
  #28 = Utf8               k
  #29 = Integer            1
  #30 = Utf8               xi
  #31 = Integer            48
  #32 = Utf8               d1
  #33 = Utf8               \u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b
  #34 = Utf8               d2
  #35 = Utf8
  #36 = Utf8               mbr
  #37 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;
  #39 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode;
  #40 = Utf8               Brproject
  #41 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #42 = Class              #41            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #43 = Utf8               InternalNode
  #44 = Utf8               LeafNode
  #45 = Utf8               Node
  #46 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #47 = Class              #46            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #48 = Utf8               Rectangle
  #49 = Utf8               RTreeIndex.kt
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               RuntimeInvisibleAnnotations
  #54 = Utf8               InnerClasses
  #55 = Utf8               SourceFile
  #56 = Utf8               RuntimeVisibleAnnotations
  #57 = Utf8               PermittedSubclasses
{
  public abstract ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle getMbr();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #17()
        org.jetbrains.annotations.NotNull

  public abstract ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle calculateMBR();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    RuntimeInvisibleAnnotations:
      0: #17()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Node(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #20                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #43= #6 of #42;     // InternalNode=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #44= #8 of #42;     // LeafNode=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static abstract #45= #2 of #42;  // Node=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #48= #47 of #42;    // Rectangle=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
SourceFile: "RTreeIndex.kt"
RuntimeVisibleAnnotations:
  0: #23(#24=[I#25,I#26,I#27],#28=I#29,#30=I#31,#32=[s#33],#34=[s#14,s#35,s#9,s#10,s#36,s#37,s#15,s#16,s#18,s#38,s#39,s#40])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;","","<init>","()V","mbr","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","getMbr","()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","calculateMBR","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$InternalNode;","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$LeafNode;","Brproject"]
    )
  PermittedSubclasses: length = 0x6 (unknown attribute)
   00 02 00 06 00 08
