// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot
// File: ext\mods\gameserver\geoengine\pathfinding\core\L2BREngine$EngineMetricsSnapshot.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.class
  Last modified 9 de jul de 2026; size 6467 bytes
  MD5 checksum cbb1a95c69d84b62b27608a32b73d1ec
  Compiled from "L2BREngine.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 21, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (JJJDD[J)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               totalCalls
   #12 = Utf8               J
   #13 = NameAndType        #11:#12       // totalCalls:J
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.totalCalls:J
   #15 = Utf8               successfulCalls
   #16 = NameAndType        #15:#12       // successfulCalls:J
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.successfulCalls:J
   #18 = Utf8               failedCalls
   #19 = NameAndType        #18:#12       // failedCalls:J
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.failedCalls:J
   #21 = Utf8               averageTimeMicros
   #22 = Utf8               D
   #23 = NameAndType        #21:#22       // averageTimeMicros:D
   #24 = Fieldref           #2.#23        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.averageTimeMicros:D
   #25 = Utf8               successRate
   #26 = NameAndType        #25:#22       // successRate:D
   #27 = Fieldref           #2.#26        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.successRate:D
   #28 = Utf8               timeDistribution
   #29 = Utf8               [J
   #30 = NameAndType        #28:#29       // timeDistribution:[J
   #31 = Fieldref           #2.#30        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.timeDistribution:[J
   #32 = Utf8               this
   #33 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
   #34 = Utf8               getTotalCalls
   #35 = Utf8               ()J
   #36 = Utf8               getSuccessfulCalls
   #37 = Utf8               getFailedCalls
   #38 = Utf8               getAverageTimeMicros
   #39 = Utf8               ()D
   #40 = Utf8               getSuccessRate
   #41 = Utf8               getTimeDistribution
   #42 = Utf8               ()[J
   #43 = Utf8               getP50Estimate
   #44 = Utf8               calculatePercentile
   #45 = Utf8               (I)J
   #46 = NameAndType        #44:#45       // calculatePercentile:(I)J
   #47 = Methodref          #2.#46        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.calculatePercentile:(I)J
   #48 = Utf8               getP99Estimate
   #49 = Utf8               kotlin/collections/ArraysKt
   #50 = Class              #49           // kotlin/collections/ArraysKt
   #51 = Utf8               sum
   #52 = Utf8               ([J)J
   #53 = NameAndType        #51:#52       // sum:([J)J
   #54 = Methodref          #50.#53       // kotlin/collections/ArraysKt.sum:([J)J
   #55 = Long               5l
   #57 = Long               10l
   #59 = Long               50l
   #61 = Long               100l
   #63 = Long               500l
   #65 = Long               1000l
   #67 = Long               5000l
   #69 = Long               10000l
   #71 = Long               9223372036854775807l
   #73 = Utf8               last
   #74 = NameAndType        #73:#52       // last:([J)J
   #75 = Methodref          #50.#74       // kotlin/collections/ArraysKt.last:([J)J
   #76 = Utf8               $i$a$-forEachIndexed-L2BREngine$EngineMetricsSnapshot$calculatePercentile$1
   #77 = Utf8               I
   #78 = Utf8               index
   #79 = Utf8               count
   #80 = Utf8               item$iv
   #81 = Utf8               $i$f$forEachIndexed
   #82 = Utf8               index$iv
   #83 = Utf8               $this$forEachIndexed$iv
   #84 = Utf8               total
   #85 = Utf8               target
   #86 = Utf8               cumulative
   #87 = Utf8               thresholds
   #88 = Utf8               percentile
   #89 = Class              #29           // "[J"
   #90 = Utf8               equals
   #91 = Utf8               (Ljava/lang/Object;)Z
   #92 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #93 = Utf8               other
   #94 = Utf8               Ljava/lang/Object;
   #95 = Utf8               hashCode
   #96 = Utf8               ()I
   #97 = Utf8               java/lang/Long
   #98 = Class              #97           // java/lang/Long
   #99 = Utf8               (J)I
  #100 = NameAndType        #95:#99       // hashCode:(J)I
  #101 = Methodref          #98.#100      // java/lang/Long.hashCode:(J)I
  #102 = Utf8               result
  #103 = Utf8               component1
  #104 = Utf8               component2
  #105 = Utf8               component3
  #106 = Utf8               component4
  #107 = Utf8               component5
  #108 = Utf8               component6
  #109 = Utf8               copy
  #110 = Utf8               (JJJDD[J)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #111 = NameAndType        #5:#6         // "<init>":(JJJDD[J)V
  #112 = Methodref          #2.#111       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot."<init>":(JJJDD[J)V
  #113 = Utf8               copy$default
  #114 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;JJJDD[JILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #115 = NameAndType        #109:#110     // copy:(JJJDD[J)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #116 = Methodref          #2.#115       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.copy:(JJJDD[J)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #117 = Utf8               toString
  #118 = Utf8               ()Ljava/lang/String;
  #119 = Utf8               java/util/Arrays
  #120 = Class              #119          // java/util/Arrays
  #121 = Utf8               ([J)Ljava/lang/String;
  #122 = NameAndType        #117:#121     // toString:([J)Ljava/lang/String;
  #123 = Methodref          #120.#122     // java/util/Arrays.toString:([J)Ljava/lang/String;
  #124 = Utf8               EngineMetricsSnapshot(totalCalls=\u0001, successfulCalls=\u0001, failedCalls=\u0001, averageTimeMicros=\u0001, successRate=\u0001, timeDistribution=\u0001)
  #125 = String             #124          // EngineMetricsSnapshot(totalCalls=\u0001, successfulCalls=\u0001, failedCalls=\u0001, averageTimeMicros=\u0001, successRate=\u0001, timeDistribution=\u0001)
  #126 = Utf8               java/lang/invoke/StringConcatFactory
  #127 = Class              #126          // java/lang/invoke/StringConcatFactory
  #128 = Utf8               makeConcatWithConstants
  #129 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #130 = NameAndType        #128:#129     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #131 = Methodref          #127.#130     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #132 = MethodHandle       6:#131        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #133 = Utf8               (JJJDDLjava/lang/String;)Ljava/lang/String;
  #134 = NameAndType        #128:#133     // makeConcatWithConstants:(JJJDDLjava/lang/String;)Ljava/lang/String;
  #135 = InvokeDynamic      #0:#134       // #0:makeConcatWithConstants:(JJJDDLjava/lang/String;)Ljava/lang/String;
  #136 = Utf8               Lkotlin/Metadata;
  #137 = Utf8               mv
  #138 = Integer            2
  #139 = Integer            3
  #140 = Integer            0
  #141 = Utf8               k
  #142 = Integer            1
  #143 = Utf8               xi
  #144 = Integer            48
  #145 = Utf8               d1
  #146 = Utf8               \u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010 \u001a\u00020\u001cH\u0096\u0080\u0004J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003JE\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006*
  #147 = Utf8               d2
  #148 = Utf8
  #149 = Utf8               p50Estimate
  #150 = Utf8               p99Estimate
  #151 = Utf8               Brproject
  #152 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #153 = Class              #152          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #154 = Utf8               EngineMetricsSnapshot
  #155 = Utf8               kotlin/jvm/internal/Ref$LongRef
  #156 = Class              #155          // kotlin/jvm/internal/Ref$LongRef
  #157 = Utf8               kotlin/jvm/internal/Ref
  #158 = Class              #157          // kotlin/jvm/internal/Ref
  #159 = Utf8               LongRef
  #160 = Utf8               L2BREngine.kt
  #161 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #162 = Utf8               value
  #163 = Utf8               SMAP\nL2BREngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,354:1\n14165#2,3:355\n*S KotlinDebug\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot\n*L\n330#1:355,3\n*E\n
  #164 = Utf8               RuntimeInvisibleAnnotations
  #165 = Utf8               Code
  #166 = Utf8               LineNumberTable
  #167 = Utf8               LocalVariableTable
  #168 = Utf8               RuntimeInvisibleParameterAnnotations
  #169 = Utf8               StackMapTable
  #170 = Utf8               InnerClasses
  #171 = Utf8               SourceFile
  #172 = Utf8               SourceDebugExtension
  #173 = Utf8               RuntimeVisibleAnnotations
  #174 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot(long, long, long, double, double, long[]);
    descriptor: (JJJDD[J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=12, args_size=7
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #14                 // Field totalCalls:J
         9: aload_0
        10: lload_3
        11: putfield      #17                 // Field successfulCalls:J
        14: aload_0
        15: lload         5
        17: putfield      #20                 // Field failedCalls:J
        20: aload_0
        21: dload         7
        23: putfield      #24                 // Field averageTimeMicros:D
        26: aload_0
        27: dload         9
        29: putfield      #27                 // Field successRate:D
        32: aload_0
        33: aload         11
        35: putfield      #31                 // Field timeDistribution:[J
        38: return
      LineNumberTable:
        line 310: 0
        line 311: 4
        line 312: 9
        line 313: 14
        line 314: 20
        line 315: 26
        line 316: 32
        line 310: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
            0      39     1 totalCalls   J
            0      39     3 successfulCalls   J
            0      39     5 failedCalls   J
            0      39     7 averageTimeMicros   D
            0      39     9 successRate   D
            0      39    11 timeDistribution   [J
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final long getTotalCalls();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field totalCalls:J
         4: lreturn
      LineNumberTable:
        line 311: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long getSuccessfulCalls();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field successfulCalls:J
         4: lreturn
      LineNumberTable:
        line 312: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long getFailedCalls();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field failedCalls:J
         4: lreturn
      LineNumberTable:
        line 313: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final double getAverageTimeMicros();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field averageTimeMicros:D
         4: dreturn
      LineNumberTable:
        line 314: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final double getSuccessRate();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field successRate:D
         4: dreturn
      LineNumberTable:
        line 315: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long[] getTimeDistribution();
    descriptor: ()[J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field timeDistribution:[J
         4: areturn
      LineNumberTable:
        line 316: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final long getP50Estimate();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: bipush        50
         3: invokespecial #47                 // Method calculatePercentile:(I)J
         6: lreturn
      LineNumberTable:
        line 318: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long getP99Estimate();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: bipush        99
         3: invokespecial #47                 // Method calculatePercentile:(I)J
         6: lreturn
      LineNumberTable:
        line 319: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #14                 // Field totalCalls:J
        20: aload_1
        21: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
        24: getfield      #14                 // Field totalCalls:J
        27: lcmp
        28: ifne          65
        31: aload_0
        32: getfield      #17                 // Field successfulCalls:J
        35: aload_1
        36: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
        39: getfield      #17                 // Field successfulCalls:J
        42: lcmp
        43: ifne          65
        46: aload_0
        47: getfield      #20                 // Field failedCalls:J
        50: aload_1
        51: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
        54: getfield      #20                 // Field failedCalls:J
        57: lcmp
        58: ifne          65
        61: iconst_1
        62: goto          66
        65: iconst_0
        66: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 48 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 340: 0
        line 341: 7
        line 342: 16
        line 343: 31
        line 344: 46
        line 342: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
            0      67     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #92()
          org.jetbrains.annotations.Nullable

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field totalCalls:J
         4: invokestatic  #101                // Method java/lang/Long.hashCode:(J)I
         7: istore_1
         8: bipush        31
        10: iload_1
        11: imul
        12: aload_0
        13: getfield      #17                 // Field successfulCalls:J
        16: invokestatic  #101                // Method java/lang/Long.hashCode:(J)I
        19: iadd
        20: istore_1
        21: bipush        31
        23: iload_1
        24: imul
        25: aload_0
        26: getfield      #20                 // Field failedCalls:J
        29: invokestatic  #101                // Method java/lang/Long.hashCode:(J)I
        32: iadd
        33: istore_1
        34: iload_1
        35: ireturn
      LineNumberTable:
        line 348: 0
        line 349: 8
        line 350: 21
        line 351: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      28     1 result   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long component1();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field totalCalls:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long component2();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field successfulCalls:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long component3();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field failedCalls:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final double component4();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field averageTimeMicros:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final double component5();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field successRate:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;

  public final long[] component6();
    descriptor: ()[J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field timeDistribution:[J
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot copy(long, long, long, double, double, long[]);
    descriptor: (JJJDD[J)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=13, locals=12, args_size=7
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
         3: dup
         4: lload_1
         5: lload_3
         6: lload         5
         8: dload         7
        10: dload         9
        12: aload         11
        14: invokespecial #112                // Method "<init>":(JJJDD[J)V
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
            0      18     1 totalCalls   J
            0      18     3 successfulCalls   J
            0      18     5 failedCalls   J
            0      18     7 averageTimeMicros   D
            0      18     9 successRate   D
            0      18    11 timeDistribution   [J
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot copy$default(ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot, long, long, long, double, double, long[], int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;JJJDD[JILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=12, locals=14, args_size=9
         0: iload         12
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field totalCalls:J
        11: lstore_1
        12: iload         12
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field successfulCalls:J
        23: lstore_3
        24: iload         12
        26: iconst_4
        27: iand
        28: ifeq          37
        31: aload_0
        32: getfield      #20                 // Field failedCalls:J
        35: lstore        5
        37: iload         12
        39: bipush        8
        41: iand
        42: ifeq          51
        45: aload_0
        46: getfield      #24                 // Field averageTimeMicros:D
        49: dstore        7
        51: iload         12
        53: bipush        16
        55: iand
        56: ifeq          65
        59: aload_0
        60: getfield      #27                 // Field successRate:D
        63: dstore        9
        65: iload         12
        67: bipush        32
        69: iand
        70: ifeq          79
        73: aload_0
        74: getfield      #31                 // Field timeDistribution:[J
        77: astore        11
        79: aload_0
        80: lload_1
        81: lload_3
        82: lload         5
        84: dload         7
        86: dload         9
        88: aload         11
        90: invokevirtual #116                // Method copy:(JJJDD[J)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
        93: areturn
      StackMapTable: number_of_entries = 6
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field totalCalls:J
         4: aload_0
         5: getfield      #17                 // Field successfulCalls:J
         8: aload_0
         9: getfield      #20                 // Field failedCalls:J
        12: aload_0
        13: getfield      #24                 // Field averageTimeMicros:D
        16: aload_0
        17: getfield      #27                 // Field successRate:D
        20: aload_0
        21: getfield      #31                 // Field timeDistribution:[J
        24: invokestatic  #123                // Method java/util/Arrays.toString:([J)Ljava/lang/String;
        27: invokedynamic #135,  0            // InvokeDynamic #0:makeConcatWithConstants:(JJJDDLjava/lang/String;)Ljava/lang/String;
        32: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #154= #2 of #153;   // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  public static final #159= #156 of #158; // LongRef=class kotlin/jvm/internal/Ref$LongRef of class kotlin/jvm/internal/Ref
SourceFile: "L2BREngine.kt"
SourceDebugExtension:
  SMAP
  L2BREngine.kt
  Kotlin
  *S Kotlin
  *F
  + 1 L2BREngine.kt
  ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  + 2 _Arrays.kt
  kotlin/collections/ArraysKt___ArraysKt
  *L
  1#1,354:1
  14165#2,3:355
  *S KotlinDebug
  *F
  + 1 L2BREngine.kt
  ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  *L
  330#1:355,3
  *E
RuntimeVisibleAnnotations:
  0: #136(#137=[I#138,I#139,I#140],#141=I#142,#143=I#144,#145=[s#146],#147=[s#33,s#148,s#11,s#148,s#15,s#18,s#21,s#148,s#25,s#28,s#148,s#5,s#6,s#34,s#35,s#36,s#37,s#38,s#39,s#40,s#41,s#42,s#149,s#43,s#150,s#48,s#44,s#88,s#148,s#90,s#148,s#93,s#95,s#103,s#104,s#105,s#106,s#107,s#108,s#109,s#117,s#148,s#151])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010 \u001a\u00020\u001cH\u0096\u0080\u0004J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003JE\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006*"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;","","totalCalls","","successfulCalls","failedCalls","averageTimeMicros","","successRate","timeDistribution","","<init>","(JJJDD[J)V","getTotalCalls","()J","getSuccessfulCalls","getFailedCalls","getAverageTimeMicros","()D","getSuccessRate","getTimeDistribution","()[J","p50Estimate","getP50Estimate","p99Estimate","getP99Estimate","calculatePercentile","percentile","","equals","","other","hashCode","component1","component2","component3","component4","component5","component6","copy","toString","","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #161(#162=[s#163])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nL2BREngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,354:1\n14165#2,3:355\n*S KotlinDebug\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot\n*L\n330#1:355,3\n*E\n"]
    )
BootstrapMethods:
  0: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #125 EngineMetricsSnapshot(totalCalls=\u0001, successfulCalls=\u0001, failedCalls=\u0001, averageTimeMicros=\u0001, successRate=\u0001, timeDistribution=\u0001)
