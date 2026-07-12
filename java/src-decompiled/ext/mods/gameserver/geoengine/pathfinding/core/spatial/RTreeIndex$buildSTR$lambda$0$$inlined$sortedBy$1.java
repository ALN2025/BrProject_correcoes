// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1.class
  Last modified 9 de jul de 2026; size 2535 bytes
  MD5 checksum 96edf1c91fa788e2893fa4925eae05f5
  Compiled from "Comparisons.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1<T extends java.lang.Object> extends java.lang.Object implements java.util.Comparator
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
  super_class: #5                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 7
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
   #3 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator;
   #4 = Utf8               java/lang/Object
   #5 = Class              #4             // java/lang/Object
   #6 = Utf8               java/util/Comparator
   #7 = Class              #6             // java/util/Comparator
   #8 = Utf8               kotlin/comparisons/ComparisonsKt__ComparisonsKt
   #9 = Class              #8             // kotlin/comparisons/ComparisonsKt__ComparisonsKt
  #10 = Utf8               compareBy
  #11 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #12 = NameAndType        #10:#11        // compareBy:(Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = NameAndType        #13:#14        // "<init>":()V
  #16 = Methodref          #5.#15         // java/lang/Object."<init>":()V
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1;
  #19 = Utf8               compare
  #20 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #21 = Utf8               (TT;TT;)I
  #22 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
  #23 = Class              #22            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
  #24 = Utf8               getRect
  #25 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #26 = NameAndType        #24:#25        // getRect:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #27 = Methodref          #23.#26        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getRect:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #28 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #29 = Class              #28            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #30 = Utf8               getMinY
  #31 = Utf8               ()I
  #32 = NameAndType        #30:#31        // getMinY:()I
  #33 = Methodref          #29.#32        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.getMinY:()I
  #34 = Utf8               java/lang/Integer
  #35 = Class              #34            // java/lang/Integer
  #36 = Utf8               valueOf
  #37 = Utf8               (I)Ljava/lang/Integer;
  #38 = NameAndType        #36:#37        // valueOf:(I)Ljava/lang/Integer;
  #39 = Methodref          #35.#38        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #40 = Utf8               java/lang/Comparable
  #41 = Class              #40            // java/lang/Comparable
  #42 = Utf8               kotlin/comparisons/ComparisonsKt
  #43 = Class              #42            // kotlin/comparisons/ComparisonsKt
  #44 = Utf8               compareValues
  #45 = Utf8               (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #46 = NameAndType        #44:#45        // compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #47 = Methodref          #43.#46        // kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #48 = Utf8               $i$a$-sortedBy-RTreeIndex$buildSTR$children$1$1
  #49 = Utf8               I
  #50 = Utf8               it
  #51 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
  #52 = Utf8               a
  #53 = Utf8               Ljava/lang/Object;
  #54 = Utf8               b
  #55 = Utf8               Lkotlin/Metadata;
  #56 = Utf8               mv
  #57 = Integer            2
  #58 = Integer            3
  #59 = Integer            0
  #60 = Utf8               k
  #61 = Utf8               xi
  #62 = Integer            48
  #63 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #64 = Class              #63            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #65 = Utf8               buildSTR
  #66 = Utf8               (Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #67 = NameAndType        #65:#66        // buildSTR:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #68 = Utf8               Comparisons.kt
  #69 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #70 = Utf8               value
  #71 = Utf8               SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n*L\n1#1,328:1\n65#2:329\n*E\n
  #72 = Utf8               Code
  #73 = Utf8               LocalVariableTable
  #74 = Utf8               LineNumberTable
  #75 = Utf8               Signature
  #76 = Utf8               InnerClasses
  #77 = Utf8               EnclosingMethod
  #78 = Utf8               SourceFile
  #79 = Utf8               SourceDebugExtension
  #80 = Utf8               RuntimeVisibleAnnotations
  #81 = Utf8               RuntimeInvisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #16                 // Method java/lang/Object."<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1;

  public final int compare(T, T);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=6, args_size=3
         0: aload_1
         1: checkcast     #23                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
         4: astore_3
         5: iconst_0
         6: istore        4
         8: aload_3
         9: invokevirtual #27                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getRect:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        12: invokevirtual #33                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.getMinY:()I
        15: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        18: checkcast     #41                 // class java/lang/Comparable
        21: aload_2
        22: checkcast     #23                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        25: astore_3
        26: astore        5
        28: iconst_0
        29: istore        4
        31: aload_3
        32: invokevirtual #27                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.getRect:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        35: invokevirtual #33                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.getMinY:()I
        38: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        41: aload         5
        43: swap
        44: checkcast     #41                 // class java/lang/Comparable
        47: invokestatic  #47                 // Method kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        50: ireturn
      LineNumberTable:
        line 102: 0
        line 329: 8
        line 102: 18
        line 329: 31
        line 102: 44
        line 102: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      10     4 $i$a$-sortedBy-RTreeIndex$buildSTR$children$1$1   I
            5      13     3    it   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
           31      10     4 $i$a$-sortedBy-RTreeIndex$buildSTR$children$1$1   I
           28      13     3    it   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
            0      51     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1;
            0      51     1     a   Ljava/lang/Object;
            0      51     2     b   Ljava/lang/Object;
    Signature: #21                          // (TT;TT;)I
}
InnerClasses:
  public static final #2;                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$buildSTR$lambda$0$$inlined$sortedBy$1
EnclosingMethod: #64.#67                // ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex.buildSTR
Signature: #3                           // <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator;
SourceFile: "Comparisons.kt"
SourceDebugExtension:
  SMAP
  Comparisons.kt
  Kotlin
  *S Kotlin
  *F
  + 1 Comparisons.kt
  kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2
  + 2 RTreeIndex.kt
  ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  *L
  1#1,328:1
  65#2:329
  *E
RuntimeVisibleAnnotations:
  0: #55(#56=[I#57,I#58,I#59],#60=I#58,#61=I#62)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
RuntimeInvisibleAnnotations:
  0: #69(#70=[s#71])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n*L\n1#1,328:1\n65#2:329\n*E\n"]
    )
