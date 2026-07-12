// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1.class
  Last modified 9 de jul de 2026; size 2753 bytes
  MD5 checksum b36f636efd95cf59277aa57e91027285
  Compiled from "Comparisons.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1<T extends java.lang.Object> extends java.lang.Object implements java.util.Comparator
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
  super_class: #5                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 2, attributes: 7
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
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
  #14 = Utf8               (II)V
  #15 = Utf8               $x$inlined
  #16 = Utf8               I
  #17 = Utf8               $y$inlined
  #18 = NameAndType        #15:#16        // $x$inlined:I
  #19 = Fieldref           #2.#18         // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1.$x$inlined:I
  #20 = NameAndType        #17:#16        // $y$inlined:I
  #21 = Fieldref           #2.#20         // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1.$y$inlined:I
  #22 = Utf8               ()V
  #23 = NameAndType        #13:#22        // "<init>":()V
  #24 = Methodref          #5.#23         // java/lang/Object."<init>":()V
  #25 = Utf8               this
  #26 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1;
  #27 = Utf8               compare
  #28 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #29 = Utf8               (TT;TT;)I
  #30 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
  #31 = Class              #30            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
  #32 = Utf8               getMbr
  #33 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #34 = NameAndType        #32:#33        // getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #35 = Methodref          #31.#34        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #36 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #37 = Class              #36            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  #38 = Utf8               distanceToPoint
  #39 = Utf8               (II)D
  #40 = NameAndType        #38:#39        // distanceToPoint:(II)D
  #41 = Methodref          #37.#40        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.distanceToPoint:(II)D
  #42 = Utf8               java/lang/Double
  #43 = Class              #42            // java/lang/Double
  #44 = Utf8               valueOf
  #45 = Utf8               (D)Ljava/lang/Double;
  #46 = NameAndType        #44:#45        // valueOf:(D)Ljava/lang/Double;
  #47 = Methodref          #43.#46        // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #48 = Utf8               java/lang/Comparable
  #49 = Class              #48            // java/lang/Comparable
  #50 = Utf8               kotlin/comparisons/ComparisonsKt
  #51 = Class              #50            // kotlin/comparisons/ComparisonsKt
  #52 = Utf8               compareValues
  #53 = Utf8               (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #54 = NameAndType        #52:#53        // compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #55 = Methodref          #51.#54        // kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #56 = Utf8               $i$a$-sortedBy-RTreeIndex$nearestNeighborRecursive$sorted$1
  #57 = Utf8               it
  #58 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
  #59 = Utf8               a
  #60 = Utf8               Ljava/lang/Object;
  #61 = Utf8               b
  #62 = Utf8               Lkotlin/Metadata;
  #63 = Utf8               mv
  #64 = Integer            2
  #65 = Integer            3
  #66 = Integer            0
  #67 = Utf8               k
  #68 = Utf8               xi
  #69 = Integer            48
  #70 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #71 = Class              #70            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #72 = Utf8               nearestNeighborRecursive
  #73 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair;
  #74 = NameAndType        #72:#73        // nearestNeighborRecursive:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;IILext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;D)Lkotlin/Pair;
  #75 = Utf8               Comparisons.kt
  #76 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #77 = Utf8               value
  #78 = Utf8               SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n*L\n1#1,328:1\n191#2:329\n*E\n
  #79 = Utf8               Code
  #80 = Utf8               LocalVariableTable
  #81 = Utf8               LineNumberTable
  #82 = Utf8               Signature
  #83 = Utf8               InnerClasses
  #84 = Utf8               EnclosingMethod
  #85 = Utf8               SourceFile
  #86 = Utf8               SourceDebugExtension
  #87 = Utf8               RuntimeVisibleAnnotations
  #88 = Utf8               RuntimeInvisibleAnnotations
{
  final int $x$inlined;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $y$inlined;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #19                 // Field $x$inlined:I
         5: aload_0
         6: iload_2
         7: putfield      #21                 // Field $y$inlined:I
        10: aload_0
        11: invokespecial #24                 // Method java/lang/Object."<init>":()V
        14: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1;

  public final int compare(T, T);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=6, args_size=3
         0: aload_1
         1: checkcast     #31                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
         4: astore_3
         5: iconst_0
         6: istore        4
         8: aload_3
         9: invokevirtual #35                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        12: aload_0
        13: getfield      #19                 // Field $x$inlined:I
        16: aload_0
        17: getfield      #21                 // Field $y$inlined:I
        20: invokevirtual #41                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.distanceToPoint:(II)D
        23: invokestatic  #47                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        26: checkcast     #49                 // class java/lang/Comparable
        29: aload_2
        30: checkcast     #31                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node
        33: astore_3
        34: astore        5
        36: iconst_0
        37: istore        4
        39: aload_3
        40: invokevirtual #35                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node.getMbr:()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        43: aload_0
        44: getfield      #19                 // Field $x$inlined:I
        47: aload_0
        48: getfield      #21                 // Field $y$inlined:I
        51: invokevirtual #41                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.distanceToPoint:(II)D
        54: invokestatic  #47                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        57: aload         5
        59: swap
        60: checkcast     #49                 // class java/lang/Comparable
        63: invokestatic  #55                 // Method kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        66: ireturn
      LineNumberTable:
        line 102: 0
        line 329: 8
        line 102: 26
        line 329: 39
        line 102: 60
        line 102: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      18     4 $i$a$-sortedBy-RTreeIndex$nearestNeighborRecursive$sorted$1   I
            5      21     3    it   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
           39      18     4 $i$a$-sortedBy-RTreeIndex$nearestNeighborRecursive$sorted$1   I
           36      21     3    it   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Node;
            0      67     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1;
            0      67     1     a   Ljava/lang/Object;
            0      67     2     b   Ljava/lang/Object;
    Signature: #29                          // (TT;TT;)I
}
InnerClasses:
  public static final #2;                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$nearestNeighborRecursive$$inlined$sortedBy$1
EnclosingMethod: #71.#74                // ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex.nearestNeighborRecursive
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
  191#2:329
  *E
RuntimeVisibleAnnotations:
  0: #62(#63=[I#64,I#65,I#66],#67=I#65,#68=I#69)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
RuntimeInvisibleAnnotations:
  0: #76(#77=[s#78])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RTreeIndex.kt\next/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex\n*L\n1#1,328:1\n191#2:329\n*E\n"]
    )
