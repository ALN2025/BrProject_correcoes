// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$SearchStats
// File: ext\mods\gameserver\geoengine\pathfinding\core\jps\JPSPlusCalculator$SearchStats.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats.class
  Last modified 9 de jul de 2026; size 3186 bytes
  MD5 checksum db58d2f524c504a687cc758be464be75
  Compiled from "JPSPlusCalculator.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$SearchStats
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 12, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               (IIJ)V
   #7 = Utf8               ()V
   #8 = NameAndType        #5:#7          // "<init>":()V
   #9 = Methodref          #4.#8          // java/lang/Object."<init>":()V
  #10 = Utf8               nodesExplored
  #11 = Utf8               I
  #12 = NameAndType        #10:#11        // nodesExplored:I
  #13 = Fieldref           #2.#12         // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats.nodesExplored:I
  #14 = Utf8               iterations
  #15 = NameAndType        #14:#11        // iterations:I
  #16 = Fieldref           #2.#15         // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats.iterations:I
  #17 = Utf8               timeNanos
  #18 = Utf8               J
  #19 = NameAndType        #17:#18        // timeNanos:J
  #20 = Fieldref           #2.#19         // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats.timeNanos:J
  #21 = Utf8               this
  #22 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
  #23 = Utf8               getNodesExplored
  #24 = Utf8               ()I
  #25 = Utf8               getIterations
  #26 = Utf8               getTimeNanos
  #27 = Utf8               ()J
  #28 = Utf8               component1
  #29 = Utf8               component2
  #30 = Utf8               component3
  #31 = Utf8               copy
  #32 = Utf8               (IIJ)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
  #33 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #34 = NameAndType        #5:#6          // "<init>":(IIJ)V
  #35 = Methodref          #2.#34         // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats."<init>":(IIJ)V
  #36 = Utf8               copy$default
  #37 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;IIJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
  #38 = NameAndType        #31:#32        // copy:(IIJ)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
  #39 = Methodref          #2.#38         // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats.copy:(IIJ)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
  #40 = Utf8               toString
  #41 = Utf8               ()Ljava/lang/String;
  #42 = Utf8               SearchStats(nodesExplored=\u0001, iterations=\u0001, timeNanos=\u0001)
  #43 = String             #42            // SearchStats(nodesExplored=\u0001, iterations=\u0001, timeNanos=\u0001)
  #44 = Utf8               java/lang/invoke/StringConcatFactory
  #45 = Class              #44            // java/lang/invoke/StringConcatFactory
  #46 = Utf8               makeConcatWithConstants
  #47 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #48 = NameAndType        #46:#47        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #49 = Methodref          #45.#48        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #50 = MethodHandle       6:#49          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #51 = Utf8               (IIJ)Ljava/lang/String;
  #52 = NameAndType        #46:#51        // makeConcatWithConstants:(IIJ)Ljava/lang/String;
  #53 = InvokeDynamic      #0:#52         // #0:makeConcatWithConstants:(IIJ)Ljava/lang/String;
  #54 = Utf8               hashCode
  #55 = Utf8               java/lang/Integer
  #56 = Class              #55            // java/lang/Integer
  #57 = Utf8               (I)I
  #58 = NameAndType        #54:#57        // hashCode:(I)I
  #59 = Methodref          #56.#58        // java/lang/Integer.hashCode:(I)I
  #60 = Utf8               java/lang/Long
  #61 = Class              #60            // java/lang/Long
  #62 = Utf8               (J)I
  #63 = NameAndType        #54:#62        // hashCode:(J)I
  #64 = Methodref          #61.#63        // java/lang/Long.hashCode:(J)I
  #65 = Utf8               result
  #66 = Utf8               equals
  #67 = Utf8               (Ljava/lang/Object;)Z
  #68 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #69 = Utf8               other
  #70 = Utf8               Ljava/lang/Object;
  #71 = Utf8               Lkotlin/Metadata;
  #72 = Utf8               mv
  #73 = Integer            2
  #74 = Integer            3
  #75 = Integer            0
  #76 = Utf8               k
  #77 = Integer            1
  #78 = Utf8               xi
  #79 = Integer            48
  #80 = Utf8               d1
  #81 = Utf8               \u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018
  #82 = Utf8               d2
  #83 = Utf8
  #84 = Utf8               Brproject
  #85 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  #86 = Class              #85            // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  #87 = Utf8               SearchStats
  #88 = Utf8               JPSPlusCalculator.kt
  #89 = Utf8               Code
  #90 = Utf8               LineNumberTable
  #91 = Utf8               LocalVariableTable
  #92 = Utf8               RuntimeInvisibleAnnotations
  #93 = Utf8               StackMapTable
  #94 = Utf8               RuntimeInvisibleParameterAnnotations
  #95 = Utf8               InnerClasses
  #96 = Utf8               SourceFile
  #97 = Utf8               RuntimeVisibleAnnotations
  #98 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$SearchStats(int, int, long);
    descriptor: (IIJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field nodesExplored:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field iterations:I
        14: aload_0
        15: lload_3
        16: putfield      #20                 // Field timeNanos:J
        19: return
      LineNumberTable:
        line 211: 0
        line 212: 4
        line 213: 9
        line 214: 14
        line 211: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
            0      20     1 nodesExplored   I
            0      20     2 iterations   I
            0      20     3 timeNanos   J

  public final int getNodesExplored();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field nodesExplored:I
         4: ireturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

  public final int getIterations();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field iterations:I
         4: ireturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

  public final long getTimeNanos();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field timeNanos:J
         4: lreturn
      LineNumberTable:
        line 214: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field nodesExplored:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field iterations:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

  public final long component3();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field timeNanos:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

  public final ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$SearchStats copy(int, int, long);
    descriptor: (IIJ)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=4
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
         3: dup
         4: iload_1
         5: iload_2
         6: lload_3
         7: invokespecial #35                 // Method "<init>":(IIJ)V
        10: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
            0      11     1 nodesExplored   I
            0      11     2 iterations   I
            0      11     3 timeNanos   J
    RuntimeInvisibleAnnotations:
      0: #33()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$SearchStats copy$default(ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator$SearchStats, int, int, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;IIJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=6
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field nodesExplored:I
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field iterations:I
        23: istore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #20                 // Field timeNanos:J
        35: lstore_3
        36: aload_0
        37: iload_1
        38: iload_2
        39: lload_3
        40: invokevirtual #39                 // Method copy:(IIJ)Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
        43: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field nodesExplored:I
         4: aload_0
         5: getfield      #16                 // Field iterations:I
         8: aload_0
         9: getfield      #20                 // Field timeNanos:J
        12: invokedynamic #53,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIJ)Ljava/lang/String;
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
    RuntimeInvisibleAnnotations:
      0: #33()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field nodesExplored:I
         4: invokestatic  #59                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field iterations:I
        16: invokestatic  #59                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field timeNanos:J
        29: invokestatic  #64                 // Method java/lang/Long.hashCode:(J)I
        32: iadd
        33: istore_1
        34: iload_1
        35: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      28     1 result   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field nodesExplored:I
        25: aload_2
        26: getfield      #13                 // Field nodesExplored:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field iterations:I
        38: aload_2
        39: getfield      #16                 // Field iterations:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #20                 // Field timeNanos:J
        51: aload_2
        52: getfield      #20                 // Field timeNanos:J
        55: lcmp
        56: ifeq          61
        59: iconst_0
        60: ireturn
        61: iconst_1
        62: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats ]
        frame_type = 12 /* same */
        frame_type = 13 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;
            0      63     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #68()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #87= #2 of #86;     // SearchStats=class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats of class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
SourceFile: "JPSPlusCalculator.kt"
RuntimeVisibleAnnotations:
  0: #71(#72=[I#73,I#74,I#75],#76=I#77,#78=I#79,#80=[s#81],#82=[s#22,s#83,s#10,s#83,s#14,s#17,s#83,s#5,s#6,s#23,s#24,s#25,s#26,s#27,s#28,s#29,s#30,s#31,s#66,s#83,s#69,s#54,s#40,s#83,s#84])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats;","","nodesExplored","","iterations","timeNanos","","<init>","(IIJ)V","getNodesExplored","()I","getIterations","getTimeNanos","()J","component1","component2","component3","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #50 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #43 SearchStats(nodesExplored=\u0001, iterations=\u0001, timeNanos=\u0001)
