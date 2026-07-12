// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$special$$inlined$compareBy$1
// File: ext\mods\gameserver\geoengine\pathfinding\core\jps\JPSPlusCalculator$special$$inlined$compareBy$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1.class
  Last modified 9 de jul de 2026; size 2407 bytes
  MD5 checksum af440a39893e359de21b8011f50979ff
  Compiled from "Comparisons.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$special$$inlined$compareBy$1<T extends java.lang.Object> extends java.lang.Object implements java.util.Comparator
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
  super_class: #5                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 7
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
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
  #18 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1;
  #19 = Utf8               compare
  #20 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #21 = Utf8               (TT;TT;)I
  #22 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
  #23 = Class              #22            // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
  #24 = Utf8               getFScore
  #25 = Utf8               ()I
  #26 = NameAndType        #24:#25        // getFScore:()I
  #27 = Methodref          #23.#26        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry.getFScore:()I
  #28 = Utf8               java/lang/Integer
  #29 = Class              #28            // java/lang/Integer
  #30 = Utf8               valueOf
  #31 = Utf8               (I)Ljava/lang/Integer;
  #32 = NameAndType        #30:#31        // valueOf:(I)Ljava/lang/Integer;
  #33 = Methodref          #29.#32        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #34 = Utf8               java/lang/Comparable
  #35 = Class              #34            // java/lang/Comparable
  #36 = Utf8               kotlin/comparisons/ComparisonsKt
  #37 = Class              #36            // kotlin/comparisons/ComparisonsKt
  #38 = Utf8               compareValues
  #39 = Utf8               (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #40 = NameAndType        #38:#39        // compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #41 = Methodref          #37.#40        // kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #42 = Utf8               $i$a$-compareBy-JPSPlusCalculator$openSet$1
  #43 = Utf8               I
  #44 = Utf8               it
  #45 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry;
  #46 = Utf8               a
  #47 = Utf8               Ljava/lang/Object;
  #48 = Utf8               b
  #49 = Utf8               Lkotlin/Metadata;
  #50 = Utf8               mv
  #51 = Integer            2
  #52 = Integer            3
  #53 = Integer            0
  #54 = Utf8               k
  #55 = Utf8               xi
  #56 = Integer            48
  #57 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  #58 = Class              #57            // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  #59 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #60 = NameAndType        #13:#59        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #61 = Utf8               Comparisons.kt
  #62 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #63 = Utf8               value
  #64 = Utf8               SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 JPSPlusCalculator.kt\next/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator\n*L\n1#1,328:1\n33#2:329\n*E\n
  #65 = Utf8               Code
  #66 = Utf8               LocalVariableTable
  #67 = Utf8               LineNumberTable
  #68 = Utf8               Signature
  #69 = Utf8               InnerClasses
  #70 = Utf8               EnclosingMethod
  #71 = Utf8               SourceFile
  #72 = Utf8               SourceDebugExtension
  #73 = Utf8               RuntimeVisibleAnnotations
  #74 = Utf8               RuntimeInvisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$special$$inlined$compareBy$1();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #16                 // Method java/lang/Object."<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1;

  public final int compare(T, T);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=6, args_size=3
         0: aload_1
         1: checkcast     #23                 // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
         4: astore_3
         5: iconst_0
         6: istore        4
         8: aload_3
         9: invokevirtual #27                 // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry.getFScore:()I
        12: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: checkcast     #35                 // class java/lang/Comparable
        18: aload_2
        19: checkcast     #23                 // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
        22: astore_3
        23: astore        5
        25: iconst_0
        26: istore        4
        28: aload_3
        29: invokevirtual #27                 // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry.getFScore:()I
        32: invokestatic  #33                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: checkcast     #35                 // class java/lang/Comparable
        38: aload         5
        40: swap
        41: invokestatic  #41                 // Method kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        44: ireturn
      LineNumberTable:
        line 102: 0
        line 329: 8
        line 102: 18
        line 329: 28
        line 102: 41
        line 102: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      10     4 $i$a$-compareBy-JPSPlusCalculator$openSet$1   I
            5      13     3    it   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry;
           28      10     4 $i$a$-compareBy-JPSPlusCalculator$openSet$1   I
           25      13     3    it   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry;
            0      45     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1;
            0      45     1     a   Ljava/lang/Object;
            0      45     2     b   Ljava/lang/Object;
    Signature: #21                          // (TT;TT;)I
}
InnerClasses:
  public static final #2;                 // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
EnclosingMethod: #58.#60                // ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator.<init>
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
  + 2 JPSPlusCalculator.kt
  ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  *L
  1#1,328:1
  33#2:329
  *E
RuntimeVisibleAnnotations:
  0: #49(#50=[I#51,I#52,I#53],#54=I#52,#55=I#56)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
RuntimeInvisibleAnnotations:
  0: #62(#63=[s#64])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 JPSPlusCalculator.kt\next/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator\n*L\n1#1,328:1\n33#2:329\n*E\n"]
    )
