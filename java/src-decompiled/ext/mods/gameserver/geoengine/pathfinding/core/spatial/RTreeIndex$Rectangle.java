// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex$Rectangle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.class
  Last modified 9 de jul de 2026; size 5433 bytes
  MD5 checksum e73752e60f84d76550058a8e00c526ed
  Compiled from "RTreeIndex.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 21, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIII)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               minX
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // minX:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.minX:I
   #14 = Utf8               minY
   #15 = NameAndType        #14:#11       // minY:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.minY:I
   #17 = Utf8               maxX
   #18 = NameAndType        #17:#11       // maxX:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.maxX:I
   #20 = Utf8               maxY
   #21 = NameAndType        #20:#11       // maxY:I
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.maxY:I
   #23 = Utf8               this
   #24 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #25 = Utf8               getMinX
   #26 = Utf8               ()I
   #27 = Utf8               getMinY
   #28 = Utf8               getMaxX
   #29 = Utf8               getMaxY
   #30 = Utf8               area
   #31 = Utf8               ()J
   #32 = Utf8               expand
   #33 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #34 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #35 = Utf8               java/lang/Math
   #36 = Class              #35           // java/lang/Math
   #37 = Utf8               min
   #38 = Utf8               (II)I
   #39 = NameAndType        #37:#38       // min:(II)I
   #40 = Methodref          #36.#39       // java/lang/Math.min:(II)I
   #41 = Utf8               max
   #42 = NameAndType        #41:#38       // max:(II)I
   #43 = Methodref          #36.#42       // java/lang/Math.max:(II)I
   #44 = NameAndType        #5:#6         // "<init>":(IIII)V
   #45 = Methodref          #2.#44        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle."<init>":(IIII)V
   #46 = Utf8               other
   #47 = Utf8               intersects
   #48 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Z
   #49 = Utf8               distance
   #50 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)D
   #51 = Utf8               sqrt
   #52 = Utf8               (D)D
   #53 = NameAndType        #51:#52       // sqrt:(D)D
   #54 = Methodref          #36.#53       // java/lang/Math.sqrt:(D)D
   #55 = Utf8               dx
   #56 = Utf8               dy
   #57 = Utf8               distanceToPoint
   #58 = Utf8               (II)D
   #59 = Utf8               x
   #60 = Utf8               y
   #61 = Utf8               component1
   #62 = Utf8               component2
   #63 = Utf8               component3
   #64 = Utf8               component4
   #65 = Utf8               copy
   #66 = Utf8               (IIII)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #67 = Utf8               copy$default
   #68 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;IIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #69 = NameAndType        #65:#66       // copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #70 = Methodref          #2.#69        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #71 = Utf8               toString
   #72 = Utf8               ()Ljava/lang/String;
   #73 = Utf8               Rectangle(minX=\u0001, minY=\u0001, maxX=\u0001, maxY=\u0001)
   #74 = String             #73           // Rectangle(minX=\u0001, minY=\u0001, maxX=\u0001, maxY=\u0001)
   #75 = Utf8               java/lang/invoke/StringConcatFactory
   #76 = Class              #75           // java/lang/invoke/StringConcatFactory
   #77 = Utf8               makeConcatWithConstants
   #78 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #79 = NameAndType        #77:#78       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = Methodref          #76.#79       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #81 = MethodHandle       6:#80         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #82 = Utf8               (IIII)Ljava/lang/String;
   #83 = NameAndType        #77:#82       // makeConcatWithConstants:(IIII)Ljava/lang/String;
   #84 = InvokeDynamic      #0:#83        // #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
   #85 = Utf8               hashCode
   #86 = Utf8               java/lang/Integer
   #87 = Class              #86           // java/lang/Integer
   #88 = Utf8               (I)I
   #89 = NameAndType        #85:#88       // hashCode:(I)I
   #90 = Methodref          #87.#89       // java/lang/Integer.hashCode:(I)I
   #91 = Utf8               result
   #92 = Utf8               equals
   #93 = Utf8               (Ljava/lang/Object;)Z
   #94 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #95 = Utf8               Ljava/lang/Object;
   #96 = Utf8               access$getEMPTY$cp
   #97 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #98 = Utf8               EMPTY
   #99 = NameAndType        #98:#24       // EMPTY:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #100 = Fieldref           #2.#99        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.EMPTY:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
  #101 = Utf8               <clinit>
  #102 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
  #103 = Class              #102          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
  #104 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #105 = NameAndType        #5:#104       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #106 = Methodref          #103.#105     // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #107 = Utf8               Companion
  #108 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
  #109 = NameAndType        #107:#108     // Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
  #110 = Fieldref           #2.#109       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
  #111 = Utf8               Lkotlin/Metadata;
  #112 = Utf8               mv
  #113 = Integer            2
  #114 = Integer            3
  #115 = Integer            0
  #116 = Utf8               k
  #117 = Integer            1
  #118 = Utf8               xi
  #119 = Integer            48
  #120 = Utf8               d1
  #121 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0000J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006#
  #122 = Utf8               d2
  #123 = Utf8
  #124 = Utf8               Brproject
  #125 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #126 = Class              #125          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  #127 = Utf8               Rectangle
  #128 = Utf8               RTreeIndex.kt
  #129 = Utf8               RuntimeInvisibleAnnotations
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               RuntimeInvisibleParameterAnnotations
  #134 = Utf8               StackMapTable
  #135 = Utf8               InnerClasses
  #136 = Utf8               SourceFile
  #137 = Utf8               RuntimeVisibleAnnotations
  #138 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #34()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field minX:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field minY:I
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field maxX:I
        19: aload_0
        20: iload         4
        22: putfield      #22                 // Field maxY:I
        25: return
      LineNumberTable:
        line 209: 0
        line 210: 4
        line 211: 9
        line 212: 14
        line 213: 19
        line 209: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      26     1  minX   I
            0      26     2  minY   I
            0      26     3  maxX   I
            0      26     4  maxY   I

  public final int getMinX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: ireturn
      LineNumberTable:
        line 210: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final int getMinY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field minY:I
         4: ireturn
      LineNumberTable:
        line 211: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final int getMaxX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field maxX:I
         4: ireturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final int getMaxY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field maxY:I
         4: ireturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final long area();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field maxX:I
         4: aload_0
         5: getfield      #13                 // Field minX:I
         8: isub
         9: i2l
        10: aload_0
        11: getfield      #22                 // Field maxY:I
        14: aload_0
        15: getfield      #16                 // Field minY:I
        18: isub
        19: i2l
        20: lmul
        21: lreturn
      LineNumberTable:
        line 215: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle expand(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=2, args_size=2
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
         3: dup
         4: aload_0
         5: getfield      #13                 // Field minX:I
         8: aload_1
         9: getfield      #13                 // Field minX:I
        12: invokestatic  #40                 // Method java/lang/Math.min:(II)I
        15: aload_0
        16: getfield      #16                 // Field minY:I
        19: aload_1
        20: getfield      #16                 // Field minY:I
        23: invokestatic  #40                 // Method java/lang/Math.min:(II)I
        26: aload_0
        27: getfield      #19                 // Field maxX:I
        30: aload_1
        31: getfield      #19                 // Field maxX:I
        34: invokestatic  #43                 // Method java/lang/Math.max:(II)I
        37: aload_0
        38: getfield      #22                 // Field maxY:I
        41: aload_1
        42: getfield      #22                 // Field maxY:I
        45: invokestatic  #43                 // Method java/lang/Math.max:(II)I
        48: invokespecial #45                 // Method "<init>":(IIII)V
        51: areturn
      LineNumberTable:
        line 217: 0
        line 218: 4
        line 219: 15
        line 220: 26
        line 221: 37
        line 217: 48
        line 222: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      52     1 other   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    RuntimeInvisibleAnnotations:
      0: #34()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #34()
          org.jetbrains.annotations.NotNull

  public final boolean intersects(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: aload_1
         5: getfield      #19                 // Field maxX:I
         8: if_icmpgt     48
        11: aload_0
        12: getfield      #19                 // Field maxX:I
        15: aload_1
        16: getfield      #13                 // Field minX:I
        19: if_icmplt     48
        22: aload_0
        23: getfield      #16                 // Field minY:I
        26: aload_1
        27: getfield      #22                 // Field maxY:I
        30: if_icmpgt     48
        33: aload_0
        34: getfield      #22                 // Field maxY:I
        37: aload_1
        38: getfield      #16                 // Field minY:I
        41: if_icmplt     48
        44: iconst_1
        45: goto          49
        48: iconst_0
        49: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 48 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 225: 0
        line 226: 22
        line 225: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      50     1 other   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #34()
          org.jetbrains.annotations.NotNull

  public final double distance(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=2
         0: nop
         1: aload_0
         2: getfield      #19                 // Field maxX:I
         5: aload_1
         6: getfield      #13                 // Field minX:I
         9: if_icmpge     24
        12: aload_1
        13: getfield      #13                 // Field minX:I
        16: aload_0
        17: getfield      #19                 // Field maxX:I
        20: isub
        21: goto          48
        24: aload_0
        25: getfield      #13                 // Field minX:I
        28: aload_1
        29: getfield      #19                 // Field maxX:I
        32: if_icmple     47
        35: aload_0
        36: getfield      #13                 // Field minX:I
        39: aload_1
        40: getfield      #19                 // Field maxX:I
        43: isub
        44: goto          48
        47: iconst_0
        48: istore_2
        49: nop
        50: aload_0
        51: getfield      #22                 // Field maxY:I
        54: aload_1
        55: getfield      #16                 // Field minY:I
        58: if_icmpge     73
        61: aload_1
        62: getfield      #16                 // Field minY:I
        65: aload_0
        66: getfield      #22                 // Field maxY:I
        69: isub
        70: goto          97
        73: aload_0
        74: getfield      #16                 // Field minY:I
        77: aload_1
        78: getfield      #22                 // Field maxY:I
        81: if_icmple     96
        84: aload_0
        85: getfield      #16                 // Field minY:I
        88: aload_1
        89: getfield      #22                 // Field maxY:I
        92: isub
        93: goto          97
        96: iconst_0
        97: istore_3
        98: iload_2
        99: iload_2
       100: imul
       101: iload_3
       102: iload_3
       103: imul
       104: iadd
       105: i2d
       106: invokestatic  #54                 // Method java/lang/Math.sqrt:(D)D
       109: dreturn
      StackMapTable: number_of_entries = 6
        frame_type = 24 /* same */
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 230: 0
        line 231: 1
        line 232: 24
        line 233: 47
        line 230: 48
        line 235: 49
        line 236: 50
        line 237: 73
        line 238: 96
        line 235: 97
        line 240: 98
        line 240: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      61     2    dx   I
           98      12     3    dy   I
            0     110     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0     110     1 other   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #34()
          org.jetbrains.annotations.NotNull

  public final double distanceToPoint(int, int);
    descriptor: (II)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=3
         0: nop
         1: iload_1
         2: aload_0
         3: getfield      #13                 // Field minX:I
         6: if_icmpge     18
         9: aload_0
        10: getfield      #13                 // Field minX:I
        13: iload_1
        14: isub
        15: goto          36
        18: iload_1
        19: aload_0
        20: getfield      #19                 // Field maxX:I
        23: if_icmple     35
        26: iload_1
        27: aload_0
        28: getfield      #19                 // Field maxX:I
        31: isub
        32: goto          36
        35: iconst_0
        36: istore_3
        37: nop
        38: iload_2
        39: aload_0
        40: getfield      #16                 // Field minY:I
        43: if_icmpge     55
        46: aload_0
        47: getfield      #16                 // Field minY:I
        50: iload_2
        51: isub
        52: goto          73
        55: iload_2
        56: aload_0
        57: getfield      #22                 // Field maxY:I
        60: if_icmple     72
        63: iload_2
        64: aload_0
        65: getfield      #22                 // Field maxY:I
        68: isub
        69: goto          73
        72: iconst_0
        73: istore        4
        75: iload_3
        76: iload_3
        77: imul
        78: iload         4
        80: iload         4
        82: imul
        83: iadd
        84: i2d
        85: invokestatic  #54                 // Method java/lang/Math.sqrt:(D)D
        88: dreturn
      StackMapTable: number_of_entries = 6
        frame_type = 18 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 244: 0
        line 245: 1
        line 246: 18
        line 247: 35
        line 244: 36
        line 249: 37
        line 250: 38
        line 251: 55
        line 252: 72
        line 249: 73
        line 254: 75
        line 254: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      52     3    dx   I
           75      14     4    dy   I
            0      89     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      89     1     x   I
            0      89     2     y   I

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field minY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field maxX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final int component4();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field maxY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

  public final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle copy(int, int, int, int);
    descriptor: (IIII)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: invokespecial #45                 // Method "<init>":(IIII)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      13     1  minX   I
            0      13     2  minY   I
            0      13     3  maxX   I
            0      13     4  maxY   I
    RuntimeInvisibleAnnotations:
      0: #34()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle copy$default(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle, int, int, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;IIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field minX:I
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field minY:I
        23: istore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field maxX:I
        35: istore_3
        36: iload         5
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #22                 // Field maxY:I
        48: istore        4
        50: aload_0
        51: iload_1
        52: iload_2
        53: iload_3
        54: iload         4
        56: invokevirtual #70                 // Method copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
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
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: aload_0
         5: getfield      #16                 // Field minY:I
         8: aload_0
         9: getfield      #19                 // Field maxX:I
        12: aload_0
        13: getfield      #22                 // Field maxY:I
        16: invokedynamic #84,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    RuntimeInvisibleAnnotations:
      0: #34()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: invokestatic  #90                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field minY:I
        16: invokestatic  #90                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field maxX:I
        29: invokestatic  #90                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #22                 // Field maxY:I
        42: invokestatic  #90                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field minX:I
        25: aload_2
        26: getfield      #13                 // Field minX:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field minY:I
        38: aload_2
        39: getfield      #16                 // Field minY:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #19                 // Field maxX:I
        51: aload_2
        52: getfield      #19                 // Field maxX:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #22                 // Field maxY:I
        64: aload_2
        65: getfield      #22                 // Field maxY:I
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: iconst_1
        74: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      75     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #94()
          org.jetbrains.annotations.Nullable

  public static final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle access$getEMPTY$cp();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #100                // Field EMPTY:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
         3: areturn
      LineNumberTable:
        line 209: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #103                // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion
         3: dup
         4: aconst_null
         5: invokespecial #106                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #110                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion;
        11: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
        14: dup
        15: iconst_0
        16: iconst_0
        17: iconst_0
        18: iconst_0
        19: invokespecial #45                 // Method "<init>":(IIII)V
        22: putstatic     #100                // Field EMPTY:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        25: return
      LineNumberTable:
        line 257: 11
}
InnerClasses:
  public static final #127= #2 of #126;   // Rectangle=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #107= #103 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle$Companion of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
SourceFile: "RTreeIndex.kt"
RuntimeVisibleAnnotations:
  0: #111(#112=[I#113,I#114,I#115],#116=I#117,#118=I#119,#120=[s#121],#122=[s#24,s#123,s#10,s#123,s#14,s#17,s#20,s#5,s#6,s#25,s#26,s#27,s#28,s#29,s#30,s#123,s#32,s#46,s#47,s#123,s#49,s#123,s#57,s#59,s#60,s#61,s#62,s#63,s#64,s#65,s#92,s#85,s#71,s#123,s#107,s#124])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0000J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006#"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","","minX","","minY","maxX","maxY","<init>","(IIII)V","getMinX","()I","getMinY","getMaxX","getMaxY","area","","expand","other","intersects","","distance","","distanceToPoint","x","y","component1","component2","component3","component4","copy","equals","hashCode","toString","","Companion","Brproject"]
    )
BootstrapMethods:
  0: #81 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #74 Rectangle(minX=\u0001, minY=\u0001, maxX=\u0001, maxY=\u0001)
