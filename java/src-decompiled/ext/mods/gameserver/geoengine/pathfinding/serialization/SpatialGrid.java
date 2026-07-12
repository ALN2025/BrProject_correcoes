// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\SpatialGrid.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.class
  Last modified 9 de jul de 2026; size 3936 bytes
  MD5 checksum 954e263a90996615951750e813cd78b8
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 14, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (III)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               cellSize
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // cellSize:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.cellSize:I
   #14 = Utf8               width
   #15 = NameAndType        #14:#11       // width:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.width:I
   #17 = Utf8               height
   #18 = NameAndType        #17:#11       // height:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.height:I
   #20 = Utf8               [Lit/unimi/dsi/fastutil/ints/IntArrayList;
   #21 = Class              #20           // "[Lit/unimi/dsi/fastutil/ints/IntArrayList;"
   #22 = Utf8               it/unimi/dsi/fastutil/ints/IntArrayList
   #23 = Class              #22           // it/unimi/dsi/fastutil/ints/IntArrayList
   #24 = Methodref          #23.#8        // it/unimi/dsi/fastutil/ints/IntArrayList."<init>":()V
   #25 = Utf8               cells
   #26 = Utf8               [[Lit/unimi/dsi/fastutil/ints/IntArrayList;
   #27 = NameAndType        #25:#26       // cells:[[Lit/unimi/dsi/fastutil/ints/IntArrayList;
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.cells:[[Lit/unimi/dsi/fastutil/ints/IntArrayList;
   #29 = Utf8               this
   #30 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #31 = Class              #26           // "[[Lit/unimi/dsi/fastutil/ints/IntArrayList;"
   #32 = Utf8               getCellSize
   #33 = Utf8               ()I
   #34 = Utf8               getWidth
   #35 = Utf8               getHeight
   #36 = Utf8               addNode
   #37 = Utf8               add
   #38 = Utf8               (I)Z
   #39 = NameAndType        #37:#38       // add:(I)Z
   #40 = Methodref          #23.#39       // it/unimi/dsi/fastutil/ints/IntArrayList.add:(I)Z
   #41 = Utf8               cellX
   #42 = Utf8               cellY
   #43 = Utf8               nodeId
   #44 = Utf8               getCell
   #45 = Utf8               (II)Lit/unimi/dsi/fastutil/ints/IntArrayList;
   #46 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #47 = Utf8               x
   #48 = Utf8               y
   #49 = Utf8               component1
   #50 = Utf8               component2
   #51 = Utf8               component3
   #52 = Utf8               copy
   #53 = Utf8               (III)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #54 = NameAndType        #5:#6         // "<init>":(III)V
   #55 = Methodref          #2.#54        // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid."<init>":(III)V
   #56 = Utf8               copy$default
   #57 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;IIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #58 = NameAndType        #52:#53       // copy:(III)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #59 = Methodref          #2.#58        // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.copy:(III)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
   #60 = Utf8               toString
   #61 = Utf8               ()Ljava/lang/String;
   #62 = Utf8               SpatialGrid(cellSize=\u0001, width=\u0001, height=\u0001)
   #63 = String             #62           // SpatialGrid(cellSize=\u0001, width=\u0001, height=\u0001)
   #64 = Utf8               java/lang/invoke/StringConcatFactory
   #65 = Class              #64           // java/lang/invoke/StringConcatFactory
   #66 = Utf8               makeConcatWithConstants
   #67 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #68 = NameAndType        #66:#67       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #69 = Methodref          #65.#68       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #70 = MethodHandle       6:#69         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #71 = Utf8               (III)Ljava/lang/String;
   #72 = NameAndType        #66:#71       // makeConcatWithConstants:(III)Ljava/lang/String;
   #73 = InvokeDynamic      #0:#72        // #0:makeConcatWithConstants:(III)Ljava/lang/String;
   #74 = Utf8               hashCode
   #75 = Utf8               java/lang/Integer
   #76 = Class              #75           // java/lang/Integer
   #77 = Utf8               (I)I
   #78 = NameAndType        #74:#77       // hashCode:(I)I
   #79 = Methodref          #76.#78       // java/lang/Integer.hashCode:(I)I
   #80 = Utf8               result
   #81 = Utf8               equals
   #82 = Utf8               (Ljava/lang/Object;)Z
   #83 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #84 = Utf8               other
   #85 = Utf8               Ljava/lang/Object;
   #86 = Utf8               Lkotlin/Metadata;
   #87 = Utf8               mv
   #88 = Integer            2
   #89 = Integer            3
   #90 = Integer            0
   #91 = Utf8               k
   #92 = Integer            1
   #93 = Utf8               xi
   #94 = Integer            48
   #95 = Utf8               d1
   #96 = Utf8               \u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\"
   #97 = Utf8               d2
   #98 = Utf8
   #99 = Utf8               Lit/unimi/dsi/fastutil/ints/IntArrayList;
  #100 = Utf8               Brproject
  #101 = Utf8               L2BRSerializer.kt
  #102 = Utf8               RuntimeInvisibleAnnotations
  #103 = Utf8               Code
  #104 = Utf8               StackMapTable
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               RuntimeInvisibleParameterAnnotations
  #108 = Utf8               SourceFile
  #109 = Utf8               RuntimeVisibleAnnotations
  #110 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=15, args_size=4
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field cellSize:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field width:I
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field height:I
        19: aload_0
        20: iconst_0
        21: istore        4
        23: aload_0
        24: getfield      #16                 // Field width:I
        27: istore        5
        29: iload         5
        31: anewarray     #21                 // class "[Lit/unimi/dsi/fastutil/ints/IntArrayList;"
        34: astore        6
        36: astore        12
        38: iload         4
        40: iload         5
        42: if_icmpge     115
        45: iload         4
        47: istore        7
        49: aload         6
        51: iload         7
        53: iconst_0
        54: istore        8
        56: aload_0
        57: getfield      #19                 // Field height:I
        60: istore        9
        62: iload         9
        64: anewarray     #23                 // class it/unimi/dsi/fastutil/ints/IntArrayList
        67: astore        10
        69: istore        14
        71: astore        13
        73: iload         8
        75: iload         9
        77: if_icmpge     102
        80: iload         8
        82: istore        11
        84: aload         10
        86: iload         11
        88: new           #23                 // class it/unimi/dsi/fastutil/ints/IntArrayList
        91: dup
        92: invokespecial #24                 // Method it/unimi/dsi/fastutil/ints/IntArrayList."<init>":()V
        95: aastore
        96: iinc          8, 1
        99: goto          73
       102: aload         13
       104: iload         14
       106: aload         10
       108: aastore
       109: iinc          4, 1
       112: goto          38
       115: aload         12
       117: aload         6
       119: putfield      #28                 // Field cells:[[Lit/unimi/dsi/fastutil/ints/IntArrayList;
       122: return
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, int, int, int, int, int, class "[[Lit/unimi/dsi/fastutil/ints/IntArrayList;", top, top, top, top, top, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, int, int, int, int, int, class "[[Lit/unimi/dsi/fastutil/ints/IntArrayList;", int, int, int, class "[Lit/unimi/dsi/fastutil/ints/IntArrayList;", top, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class "[[Lit/unimi/dsi/fastutil/ints/IntArrayList;", int ]
          stack = []
        frame_type = 28 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, int, int, int, int, int, class "[[Lit/unimi/dsi/fastutil/ints/IntArrayList;", top, top, top, top, top, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid ]
          stack = []
      LineNumberTable:
        line 421: 0
        line 422: 19
        line 421: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     123     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0     123     1 cellSize   I
            0     123     2 width   I
            0     123     3 height   I

  public final int getCellSize();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field cellSize:I
         4: ireturn
      LineNumberTable:
        line 421: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

  public final int getWidth();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field width:I
         4: ireturn
      LineNumberTable:
        line 421: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

  public final int getHeight();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field height:I
         4: ireturn
      LineNumberTable:
        line 421: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

  public final void addNode(int, int, int);
    descriptor: (III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=4
         0: iconst_0
         1: iload_1
         2: if_icmpgt     21
         5: iload_1
         6: aload_0
         7: getfield      #16                 // Field width:I
        10: if_icmpge     17
        13: iconst_1
        14: goto          22
        17: iconst_0
        18: goto          22
        21: iconst_0
        22: ifeq          63
        25: iconst_0
        26: iload_2
        27: if_icmpgt     46
        30: iload_2
        31: aload_0
        32: getfield      #19                 // Field height:I
        35: if_icmpge     42
        38: iconst_1
        39: goto          47
        42: iconst_0
        43: goto          47
        46: iconst_0
        47: ifeq          63
        50: aload_0
        51: getfield      #28                 // Field cells:[[Lit/unimi/dsi/fastutil/ints/IntArrayList;
        54: iload_1
        55: aaload
        56: iload_2
        57: aaload
        58: iload_3
        59: invokevirtual #40                 // Method it/unimi/dsi/fastutil/ints/IntArrayList.add:(I)Z
        62: pop
        63: return
      StackMapTable: number_of_entries = 7
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 15 /* same */
      LineNumberTable:
        line 425: 0
        line 426: 50
        line 428: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0      64     1 cellX   I
            0      64     2 cellY   I
            0      64     3 nodeId   I

  public final it.unimi.dsi.fastutil.ints.IntArrayList getCell(int, int);
    descriptor: (II)Lit/unimi/dsi/fastutil/ints/IntArrayList;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: iconst_0
         1: iload_1
         2: if_icmpgt     21
         5: iload_1
         6: aload_0
         7: getfield      #16                 // Field width:I
        10: if_icmpge     17
        13: iconst_1
        14: goto          22
        17: iconst_0
        18: goto          22
        21: iconst_0
        22: ifeq          61
        25: iconst_0
        26: iload_2
        27: if_icmpgt     46
        30: iload_2
        31: aload_0
        32: getfield      #19                 // Field height:I
        35: if_icmpge     42
        38: iconst_1
        39: goto          47
        42: iconst_0
        43: goto          47
        46: iconst_0
        47: ifeq          61
        50: aload_0
        51: getfield      #28                 // Field cells:[[Lit/unimi/dsi/fastutil/ints/IntArrayList;
        54: iload_1
        55: aaload
        56: iload_2
        57: aaload
        58: goto          68
        61: new           #23                 // class it/unimi/dsi/fastutil/ints/IntArrayList
        64: dup
        65: invokespecial #24                 // Method it/unimi/dsi/fastutil/ints/IntArrayList."<init>":()V
        68: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 13 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class it/unimi/dsi/fastutil/ints/IntArrayList ]
      LineNumberTable:
        line 431: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0      69     1     x   I
            0      69     2     y   I
    RuntimeInvisibleAnnotations:
      0: #46()
        org.jetbrains.annotations.NotNull

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field cellSize:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field width:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field height:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid copy(int, int, int);
    descriptor: (III)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=4
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokespecial #55                 // Method "<init>":(III)V
        10: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0      11     1 cellSize   I
            0      11     2 width   I
            0      11     3 height   I
    RuntimeInvisibleAnnotations:
      0: #46()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid, int, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;IIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field cellSize:I
        11: istore_1
        12: iload         4
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field width:I
        23: istore_2
        24: iload         4
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field height:I
        35: istore_3
        36: aload_0
        37: iload_1
        38: iload_2
        39: iload_3
        40: invokevirtual #59                 // Method copy:(III)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
        43: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field cellSize:I
         4: aload_0
         5: getfield      #16                 // Field width:I
         8: aload_0
         9: getfield      #19                 // Field height:I
        12: invokedynamic #73,  0             // InvokeDynamic #0:makeConcatWithConstants:(III)Ljava/lang/String;
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
    RuntimeInvisibleAnnotations:
      0: #46()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field cellSize:I
         4: invokestatic  #79                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field width:I
        16: invokestatic  #79                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field height:I
        29: invokestatic  #79                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      28     1 result   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field cellSize:I
        25: aload_2
        26: getfield      #13                 // Field cellSize:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field width:I
        38: aload_2
        39: getfield      #16                 // Field width:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #19                 // Field height:I
        51: aload_2
        52: getfield      #19                 // Field height:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: iconst_1
        61: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
            0      62     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #83()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #86(#87=[I#88,I#89,I#90],#91=I#92,#93=I#94,#95=[s#96],#97=[s#30,s#98,s#10,s#98,s#14,s#17,s#5,s#6,s#32,s#33,s#34,s#35,s#25,s#98,s#99,s#26,s#36,s#98,s#41,s#42,s#43,s#44,s#47,s#48,s#49,s#50,s#51,s#52,s#81,s#98,s#84,s#74,s#60,s#98,s#100])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\""]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;","","cellSize","","width","height","<init>","(III)V","getCellSize","()I","getWidth","getHeight","cells","","Lit/unimi/dsi/fastutil/ints/IntArrayList;","[[Lit/unimi/dsi/fastutil/ints/IntArrayList;","addNode","","cellX","cellY","nodeId","getCell","x","y","component1","component2","component3","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #70 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #63 SpatialGrid(cellSize=\u0001, width=\u0001, height=\u0001)
