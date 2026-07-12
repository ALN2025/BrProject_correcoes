// Bytecode for: ext.mods.gameserver.LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
// File: ext\mods\gameserver\LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1.class
  Last modified 9 de jul de 2026; size 2116 bytes
  MD5 checksum 37cf722087666b832ab9b167d052390b
  Compiled from "Comparisons.kt"
public final class ext.mods.gameserver.LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1<T extends java.lang.Object> extends java.lang.Object implements java.util.Comparator
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
  super_class: #5                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 7
Constant pool:
   #1 = Utf8               ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
   #2 = Class              #1             // ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
   #3 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator;
   #4 = Utf8               java/lang/Object
   #5 = Class              #4             // java/lang/Object
   #6 = Utf8               java/util/Comparator
   #7 = Class              #6             // java/util/Comparator
   #8 = Utf8               kotlin/comparisons/ComparisonsKt__ComparisonsKt
   #9 = Class              #8             // kotlin/comparisons/ComparisonsKt__ComparisonsKt
  #10 = Utf8               compareByDescending
  #11 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #12 = NameAndType        #10:#11        // compareByDescending:(Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = NameAndType        #13:#14        // "<init>":()V
  #16 = Methodref          #5.#15         // java/lang/Object."<init>":()V
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1;
  #19 = Utf8               compare
  #20 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #21 = Utf8               (TT;TT;)I
  #22 = Utf8               java/util/Map$Entry
  #23 = Class              #22            // java/util/Map$Entry
  #24 = Utf8               getValue
  #25 = Utf8               ()Ljava/lang/Object;
  #26 = NameAndType        #24:#25        // getValue:()Ljava/lang/Object;
  #27 = InterfaceMethodref #23.#26        // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #28 = Utf8               java/lang/Long
  #29 = Class              #28            // java/lang/Long
  #30 = Utf8               java/lang/Comparable
  #31 = Class              #30            // java/lang/Comparable
  #32 = Utf8               kotlin/comparisons/ComparisonsKt
  #33 = Class              #32            // kotlin/comparisons/ComparisonsKt
  #34 = Utf8               compareValues
  #35 = Utf8               (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #36 = NameAndType        #34:#35        // compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #37 = Methodref          #33.#36        // kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #38 = Utf8               $i$a$-sortedByDescending-LoadMetricsService$getReportSortedBySlowest$1
  #39 = Utf8               I
  #40 = Utf8               it
  #41 = Utf8               Ljava/util/Map$Entry;
  #42 = Utf8               a
  #43 = Utf8               Ljava/lang/Object;
  #44 = Utf8               b
  #45 = Utf8               Lkotlin/Metadata;
  #46 = Utf8               mv
  #47 = Integer            2
  #48 = Integer            3
  #49 = Integer            0
  #50 = Utf8               k
  #51 = Utf8               xi
  #52 = Integer            48
  #53 = Utf8               ext/mods/gameserver/LoadMetricsService
  #54 = Class              #53            // ext/mods/gameserver/LoadMetricsService
  #55 = Utf8               getReportSortedBySlowest
  #56 = Utf8               ()Ljava/lang/String;
  #57 = NameAndType        #55:#56        // getReportSortedBySlowest:()Ljava/lang/String;
  #58 = Utf8               Comparisons.kt
  #59 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #60 = Utf8               value
  #61 = Utf8               SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 GameServer.kt\next/mods/gameserver/LoadMetricsService\n*L\n1#1,328:1\n198#2:329\n*E\n
  #62 = Utf8               Code
  #63 = Utf8               LocalVariableTable
  #64 = Utf8               LineNumberTable
  #65 = Utf8               Signature
  #66 = Utf8               InnerClasses
  #67 = Utf8               EnclosingMethod
  #68 = Utf8               SourceFile
  #69 = Utf8               SourceDebugExtension
  #70 = Utf8               RuntimeVisibleAnnotations
  #71 = Utf8               RuntimeInvisibleAnnotations
{
  public ext.mods.gameserver.LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #16                 // Method java/lang/Object."<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1;

  public final int compare(T, T);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=6, args_size=3
         0: aload_2
         1: checkcast     #23                 // class java/util/Map$Entry
         4: astore_3
         5: iconst_0
         6: istore        4
         8: aload_3
         9: invokeinterface #27,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        14: checkcast     #29                 // class java/lang/Long
        17: checkcast     #31                 // class java/lang/Comparable
        20: aload_1
        21: checkcast     #23                 // class java/util/Map$Entry
        24: astore_3
        25: astore        5
        27: iconst_0
        28: istore        4
        30: aload_3
        31: invokeinterface #27,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        36: checkcast     #29                 // class java/lang/Long
        39: aload         5
        41: swap
        42: checkcast     #31                 // class java/lang/Comparable
        45: invokestatic  #37                 // Method kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        48: ireturn
      LineNumberTable:
        line 121: 0
        line 329: 8
        line 121: 17
        line 329: 30
        line 121: 42
        line 121: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8       9     4 $i$a$-sortedByDescending-LoadMetricsService$getReportSortedBySlowest$1   I
            5      12     3    it   Ljava/util/Map$Entry;
           30       9     4 $i$a$-sortedByDescending-LoadMetricsService$getReportSortedBySlowest$1   I
           27      12     3    it   Ljava/util/Map$Entry;
            0      49     0  this   Lext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1;
            0      49     1     a   Ljava/lang/Object;
            0      49     2     b   Ljava/lang/Object;
    Signature: #21                          // (TT;TT;)I
}
InnerClasses:
  public static final #2;                 // class ext/mods/gameserver/LoadMetricsService$getReportSortedBySlowest$$inlined$sortedByDescending$1
EnclosingMethod: #54.#57                // ext.mods.gameserver.LoadMetricsService.getReportSortedBySlowest
Signature: #3                           // <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator;
SourceFile: "Comparisons.kt"
SourceDebugExtension:
  SMAP
  Comparisons.kt
  Kotlin
  *S Kotlin
  *F
  + 1 Comparisons.kt
  kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1
  + 2 GameServer.kt
  ext/mods/gameserver/LoadMetricsService
  *L
  1#1,328:1
  198#2:329
  *E
RuntimeVisibleAnnotations:
  0: #45(#46=[I#47,I#48,I#49],#50=I#48,#51=I#52)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
RuntimeInvisibleAnnotations:
  0: #59(#60=[s#61])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 GameServer.kt\next/mods/gameserver/LoadMetricsService\n*L\n1#1,328:1\n198#2:329\n*E\n"]
    )
