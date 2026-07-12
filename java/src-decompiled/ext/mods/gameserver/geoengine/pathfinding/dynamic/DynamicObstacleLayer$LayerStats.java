// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats
// File: ext\mods\gameserver\geoengine\pathfinding\dynamic\DynamicObstacleLayer$LayerStats.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats.class
  Last modified 9 de jul de 2026; size 3695 bytes
  MD5 checksum 5960d10b6c2a5193b3c2aa13ee616f0e
  Compiled from "DynamicObstacleLayer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 15, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIIJ)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               totalNodes
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // totalNodes:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats.totalNodes:I
   #14 = Utf8               blockedNodes
   #15 = NameAndType        #14:#11       // blockedNodes:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats.blockedNodes:I
   #17 = Utf8               activeObjects
   #18 = NameAndType        #17:#11       // activeObjects:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats.activeObjects:I
   #20 = Utf8               memoryBytes
   #21 = Utf8               J
   #22 = NameAndType        #20:#21       // memoryBytes:J
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats.memoryBytes:J
   #24 = Utf8               this
   #25 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
   #26 = Utf8               getTotalNodes
   #27 = Utf8               ()I
   #28 = Utf8               getBlockedNodes
   #29 = Utf8               getActiveObjects
   #30 = Utf8               getMemoryBytes
   #31 = Utf8               ()J
   #32 = Utf8               getBlockedPercentage
   #33 = Utf8               ()D
   #34 = Utf8               component1
   #35 = Utf8               component2
   #36 = Utf8               component3
   #37 = Utf8               component4
   #38 = Utf8               copy
   #39 = Utf8               (IIIJ)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
   #40 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #41 = NameAndType        #5:#6         // "<init>":(IIIJ)V
   #42 = Methodref          #2.#41        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats."<init>":(IIIJ)V
   #43 = Utf8               copy$default
   #44 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;IIIJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
   #45 = NameAndType        #38:#39       // copy:(IIIJ)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
   #46 = Methodref          #2.#45        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats.copy:(IIIJ)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
   #47 = Utf8               toString
   #48 = Utf8               ()Ljava/lang/String;
   #49 = Utf8               LayerStats(totalNodes=\u0001, blockedNodes=\u0001, activeObjects=\u0001, memoryBytes=\u0001)
   #50 = String             #49           // LayerStats(totalNodes=\u0001, blockedNodes=\u0001, activeObjects=\u0001, memoryBytes=\u0001)
   #51 = Utf8               java/lang/invoke/StringConcatFactory
   #52 = Class              #51           // java/lang/invoke/StringConcatFactory
   #53 = Utf8               makeConcatWithConstants
   #54 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #55 = NameAndType        #53:#54       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #56 = Methodref          #52.#55       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #57 = MethodHandle       6:#56         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #58 = Utf8               (IIIJ)Ljava/lang/String;
   #59 = NameAndType        #53:#58       // makeConcatWithConstants:(IIIJ)Ljava/lang/String;
   #60 = InvokeDynamic      #0:#59        // #0:makeConcatWithConstants:(IIIJ)Ljava/lang/String;
   #61 = Utf8               hashCode
   #62 = Utf8               java/lang/Integer
   #63 = Class              #62           // java/lang/Integer
   #64 = Utf8               (I)I
   #65 = NameAndType        #61:#64       // hashCode:(I)I
   #66 = Methodref          #63.#65       // java/lang/Integer.hashCode:(I)I
   #67 = Utf8               java/lang/Long
   #68 = Class              #67           // java/lang/Long
   #69 = Utf8               (J)I
   #70 = NameAndType        #61:#69       // hashCode:(J)I
   #71 = Methodref          #68.#70       // java/lang/Long.hashCode:(J)I
   #72 = Utf8               result
   #73 = Utf8               equals
   #74 = Utf8               (Ljava/lang/Object;)Z
   #75 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #76 = Utf8               other
   #77 = Utf8               Ljava/lang/Object;
   #78 = Utf8               Lkotlin/Metadata;
   #79 = Utf8               mv
   #80 = Integer            2
   #81 = Integer            3
   #82 = Integer            0
   #83 = Utf8               k
   #84 = Integer            1
   #85 = Utf8               xi
   #86 = Integer            48
   #87 = Utf8               d1
   #88 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f
   #89 = Utf8               d2
   #90 = Utf8
   #91 = Utf8               blockedPercentage
   #92 = Utf8               Brproject
   #93 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #94 = Class              #93           // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #95 = Utf8               LayerStats
   #96 = Utf8               DynamicObstacleLayer.kt
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               RuntimeInvisibleAnnotations
  #101 = Utf8               StackMapTable
  #102 = Utf8               RuntimeInvisibleParameterAnnotations
  #103 = Utf8               InnerClasses
  #104 = Utf8               SourceFile
  #105 = Utf8               RuntimeVisibleAnnotations
  #106 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats(int, int, int, long);
    descriptor: (IIIJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field totalNodes:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field blockedNodes:I
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field activeObjects:I
        19: aload_0
        20: lload         4
        22: putfield      #23                 // Field memoryBytes:J
        25: return
      LineNumberTable:
        line 187: 0
        line 188: 4
        line 189: 9
        line 190: 14
        line 191: 19
        line 187: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
            0      26     1 totalNodes   I
            0      26     2 blockedNodes   I
            0      26     3 activeObjects   I
            0      26     4 memoryBytes   J

  public final int getTotalNodes();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalNodes:I
         4: ireturn
      LineNumberTable:
        line 188: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final int getBlockedNodes();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field blockedNodes:I
         4: ireturn
      LineNumberTable:
        line 189: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final int getActiveObjects();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field activeObjects:I
         4: ireturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final long getMemoryBytes();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field memoryBytes:J
         4: lreturn
      LineNumberTable:
        line 191: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final double getBlockedPercentage();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field blockedNodes:I
         4: i2d
         5: aload_0
         6: getfield      #13                 // Field totalNodes:I
         9: i2d
        10: ddiv
        11: bipush        100
        13: i2d
        14: dmul
        15: dreturn
      LineNumberTable:
        line 193: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalNodes:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field blockedNodes:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field activeObjects:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final long component4();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field memoryBytes:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats copy(int, int, int, long);
    descriptor: (IIIJ)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=6, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: lload         4
         9: invokespecial #42                 // Method "<init>":(IIIJ)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
            0      13     1 totalNodes   I
            0      13     2 blockedNodes   I
            0      13     3 activeObjects   I
            0      13     4 memoryBytes   J
    RuntimeInvisibleAnnotations:
      0: #40()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats copy$default(ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats, int, int, int, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;IIIJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=8, args_size=7
         0: iload         6
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field totalNodes:I
        11: istore_1
        12: iload         6
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field blockedNodes:I
        23: istore_2
        24: iload         6
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field activeObjects:I
        35: istore_3
        36: iload         6
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #23                 // Field memoryBytes:J
        48: lstore        4
        50: aload_0
        51: iload_1
        52: iload_2
        53: iload_3
        54: lload         4
        56: invokevirtual #46                 // Method copy:(IIIJ)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
        59: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalNodes:I
         4: aload_0
         5: getfield      #16                 // Field blockedNodes:I
         8: aload_0
         9: getfield      #19                 // Field activeObjects:I
        12: aload_0
        13: getfield      #23                 // Field memoryBytes:J
        16: invokedynamic #60,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIIJ)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
    RuntimeInvisibleAnnotations:
      0: #40()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field totalNodes:I
         4: invokestatic  #66                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field blockedNodes:I
        16: invokestatic  #66                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field activeObjects:I
        29: invokestatic  #66                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field memoryBytes:J
        42: invokestatic  #71                 // Method java/lang/Long.hashCode:(J)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field totalNodes:I
        25: aload_2
        26: getfield      #13                 // Field totalNodes:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field blockedNodes:I
        38: aload_2
        39: getfield      #16                 // Field blockedNodes:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #19                 // Field activeObjects:I
        51: aload_2
        52: getfield      #19                 // Field activeObjects:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #23                 // Field memoryBytes:J
        64: aload_2
        65: getfield      #23                 // Field memoryBytes:J
        68: lcmp
        69: ifeq          74
        72: iconst_0
        73: ireturn
        74: iconst_1
        75: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
            0      76     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #75()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #95= #2 of #94;     // LayerStats=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
SourceFile: "DynamicObstacleLayer.kt"
RuntimeVisibleAnnotations:
  0: #78(#79=[I#80,I#81,I#82],#83=I#84,#85=I#86,#87=[s#88],#89=[s#25,s#90,s#10,s#90,s#14,s#17,s#20,s#90,s#5,s#6,s#26,s#27,s#28,s#29,s#30,s#31,s#91,s#90,s#32,s#33,s#34,s#35,s#36,s#37,s#38,s#73,s#90,s#76,s#61,s#47,s#90,s#92])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;","","totalNodes","","blockedNodes","activeObjects","memoryBytes","","<init>","(IIIJ)V","getTotalNodes","()I","getBlockedNodes","getActiveObjects","getMemoryBytes","()J","blockedPercentage","","getBlockedPercentage","()D","component1","component2","component3","component4","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #57 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #50 LayerStats(totalNodes=\u0001, blockedNodes=\u0001, activeObjects=\u0001, memoryBytes=\u0001)
