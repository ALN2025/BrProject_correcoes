// Bytecode for: ext.mods.commons.geometry.Rectangle
// File: ext\mods\commons\geometry\Rectangle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/Rectangle.class
  Last modified 9 de jul de 2026; size 3153 bytes
  MD5 checksum 602ee35717df69e5ca4b89c19329b500
  Compiled from "Rectangle.java"
public class ext.mods.commons.geometry.Rectangle extends ext.mods.commons.geometry.AShape
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/commons/geometry/Rectangle
  super_class: #2                         // ext/mods/commons/geometry/AShape
  interfaces: 0, fields: 4, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/geometry/AShape."<init>":()V
    #2 = Class              #4            // ext/mods/commons/geometry/AShape
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/commons/geometry/AShape
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = InterfaceMethodref #8.#9         // java/util/List.get:(I)Ljava/lang/Object;
    #8 = Class              #10           // java/util/List
    #9 = NameAndType        #11:#12       // get:(I)Ljava/lang/Object;
   #10 = Utf8               java/util/List
   #11 = Utf8               get
   #12 = Utf8               (I)Ljava/lang/Object;
   #13 = Class              #14           // ext/mods/gameserver/model/location/Point2D
   #14 = Utf8               ext/mods/gameserver/model/location/Point2D
   #15 = Methodref          #13.#16       // ext/mods/gameserver/model/location/Point2D.getX:()I
   #16 = NameAndType        #17:#18       // getX:()I
   #17 = Utf8               getX
   #18 = Utf8               ()I
   #19 = Methodref          #20.#21       // java/lang/Math.min:(II)I
   #20 = Class              #22           // java/lang/Math
   #21 = NameAndType        #23:#24       // min:(II)I
   #22 = Utf8               java/lang/Math
   #23 = Utf8               min
   #24 = Utf8               (II)I
   #25 = Fieldref           #26.#27       // ext/mods/commons/geometry/Rectangle._x:I
   #26 = Class              #28           // ext/mods/commons/geometry/Rectangle
   #27 = NameAndType        #29:#30       // _x:I
   #28 = Utf8               ext/mods/commons/geometry/Rectangle
   #29 = Utf8               _x
   #30 = Utf8               I
   #31 = Methodref          #13.#32       // ext/mods/gameserver/model/location/Point2D.getY:()I
   #32 = NameAndType        #33:#18       // getY:()I
   #33 = Utf8               getY
   #34 = Fieldref           #26.#35       // ext/mods/commons/geometry/Rectangle._y:I
   #35 = NameAndType        #36:#30       // _y:I
   #36 = Utf8               _y
   #37 = Methodref          #20.#38       // java/lang/Math.abs:(I)I
   #38 = NameAndType        #39:#40       // abs:(I)I
   #39 = Utf8               abs
   #40 = Utf8               (I)I
   #41 = Fieldref           #26.#42       // ext/mods/commons/geometry/Rectangle._w:I
   #42 = NameAndType        #43:#30       // _w:I
   #43 = Utf8               _w
   #44 = Fieldref           #26.#45       // ext/mods/commons/geometry/Rectangle._h:I
   #45 = NameAndType        #46:#30       // _h:I
   #46 = Utf8               _h
   #47 = Methodref          #13.#48       // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
   #48 = NameAndType        #5:#49        // "<init>":(II)V
   #49 = Utf8               (II)V
   #50 = Fieldref           #26.#51       // ext/mods/commons/geometry/Rectangle._center:Lext/mods/gameserver/model/location/Point2D;
   #51 = NameAndType        #52:#53       // _center:Lext/mods/gameserver/model/location/Point2D;
   #52 = Utf8               _center
   #53 = Utf8               Lext/mods/gameserver/model/location/Point2D;
   #54 = Fieldref           #26.#55       // ext/mods/commons/geometry/Rectangle._area:J
   #55 = NameAndType        #56:#57       // _area:J
   #56 = Utf8               _area
   #57 = Utf8               J
   #58 = Class              #59           // ext/mods/gameserver/model/location/Location
   #59 = Utf8               ext/mods/gameserver/model/location/Location
   #60 = Methodref          #61.#62       // ext/mods/commons/random/Rnd.get:(I)I
   #61 = Class              #63           // ext/mods/commons/random/Rnd
   #62 = NameAndType        #11:#40       // get:(I)I
   #63 = Utf8               ext/mods/commons/random/Rnd
   #64 = Methodref          #58.#65       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #65 = NameAndType        #5:#66        // "<init>":(III)V
   #66 = Utf8               (III)V
   #67 = Fieldref           #68.#69       // java/awt/Color.YELLOW:Ljava/awt/Color;
   #68 = Class              #70           // java/awt/Color
   #69 = NameAndType        #71:#72       // YELLOW:Ljava/awt/Color;
   #70 = Utf8               java/awt/Color
   #71 = Utf8               YELLOW
   #72 = Utf8               Ljava/awt/Color;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #74 = Class              #76           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #75 = NameAndType        #77:#78       // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #76 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #77 = Utf8               addLine
   #78 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #79 = Fieldref           #68.#80       // java/awt/Color.GREEN:Ljava/awt/Color;
   #80 = NameAndType        #81:#72       // GREEN:Ljava/awt/Color;
   #81 = Utf8               GREEN
   #82 = Fieldref           #68.#83       // java/awt/Color.RED:Ljava/awt/Color;
   #83 = NameAndType        #84:#72       // RED:Ljava/awt/Color;
   #84 = Utf8               RED
   #85 = Utf8               (Ljava/util/List;)V
   #86 = Utf8               Code
   #87 = Utf8               LineNumberTable
   #88 = Utf8               LocalVariableTable
   #89 = Utf8               this
   #90 = Utf8               Lext/mods/commons/geometry/Rectangle;
   #91 = Utf8               coords
   #92 = Utf8               Ljava/util/List;
   #93 = Utf8               p1
   #94 = Utf8               p2
   #95 = Utf8               LocalVariableTypeTable
   #96 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
   #97 = Utf8               Signature
   #98 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V
   #99 = Utf8               isInside
  #100 = Utf8               (II)Z
  #101 = Utf8               x
  #102 = Utf8               y
  #103 = Utf8               d
  #104 = Utf8               StackMapTable
  #105 = Utf8               intersects
  #106 = Utf8               (IIII)Z
  #107 = Utf8               x1
  #108 = Utf8               y1
  #109 = Utf8               x2
  #110 = Utf8               y2
  #111 = Utf8               getRandomLocation
  #112 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #113 = Utf8               visualize
  #114 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
  #115 = Utf8               info
  #116 = Utf8               Ljava/lang/String;
  #117 = Utf8               debug
  #118 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #119 = Utf8               z
  #120 = Utf8               visualize3D
  #121 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
  #122 = Utf8               minZ
  #123 = Utf8               maxZ
  #124 = Utf8               SourceFile
  #125 = Utf8               Rectangle.java
{
  protected final int _x;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _y;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _w;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _h;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  public ext.mods.commons.geometry.Rectangle(java.util.List<ext.mods.gameserver.model.location.Point2D>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/geometry/AShape."<init>":()V
         4: aload_1
         5: iconst_0
         6: invokeinterface #7,  2            // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        11: checkcast     #13                 // class ext/mods/gameserver/model/location/Point2D
        14: astore_2
        15: aload_1
        16: iconst_1
        17: invokeinterface #7,  2            // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        22: checkcast     #13                 // class ext/mods/gameserver/model/location/Point2D
        25: astore_3
        26: aload_0
        27: aload_2
        28: invokevirtual #15                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        31: aload_3
        32: invokevirtual #15                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        35: invokestatic  #19                 // Method java/lang/Math.min:(II)I
        38: putfield      #25                 // Field _x:I
        41: aload_0
        42: aload_2
        43: invokevirtual #31                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        46: aload_3
        47: invokevirtual #31                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        50: invokestatic  #19                 // Method java/lang/Math.min:(II)I
        53: putfield      #34                 // Field _y:I
        56: aload_0
        57: aload_3
        58: invokevirtual #15                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        61: aload_2
        62: invokevirtual #15                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        65: isub
        66: invokestatic  #37                 // Method java/lang/Math.abs:(I)I
        69: putfield      #41                 // Field _w:I
        72: aload_0
        73: aload_3
        74: invokevirtual #31                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        77: aload_2
        78: invokevirtual #31                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        81: isub
        82: invokestatic  #37                 // Method java/lang/Math.abs:(I)I
        85: putfield      #44                 // Field _h:I
        88: aload_0
        89: new           #13                 // class ext/mods/gameserver/model/location/Point2D
        92: dup
        93: aload_0
        94: getfield      #25                 // Field _x:I
        97: aload_0
        98: getfield      #41                 // Field _w:I
       101: iconst_2
       102: idiv
       103: iadd
       104: aload_0
       105: getfield      #34                 // Field _y:I
       108: aload_0
       109: getfield      #44                 // Field _h:I
       112: iconst_2
       113: idiv
       114: iadd
       115: invokespecial #47                 // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
       118: putfield      #50                 // Field _center:Lext/mods/gameserver/model/location/Point2D;
       121: aload_0
       122: aload_0
       123: getfield      #41                 // Field _w:I
       126: i2l
       127: aload_0
       128: getfield      #44                 // Field _h:I
       131: i2l
       132: lmul
       133: putfield      #54                 // Field _area:J
       136: return
      LineNumberTable:
        line 38: 0
        line 39: 4
        line 40: 15
        line 42: 26
        line 43: 41
        line 45: 56
        line 46: 72
        line 48: 88
        line 49: 121
        line 50: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/commons/geometry/Rectangle;
            0     137     1 coords   Ljava/util/List;
           15     122     2    p1   Lext/mods/gameserver/model/location/Point2D;
           26     111     3    p2   Lext/mods/gameserver/model/location/Point2D;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     137     1 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
    Signature: #98                          // (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V

  public boolean isInside(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: iload_1
         1: aload_0
         2: getfield      #25                 // Field _x:I
         5: isub
         6: istore_3
         7: iload_3
         8: iflt          19
        11: iload_3
        12: aload_0
        13: getfield      #41                 // Field _w:I
        16: if_icmple     21
        19: iconst_0
        20: ireturn
        21: iload_2
        22: aload_0
        23: getfield      #34                 // Field _y:I
        26: isub
        27: istore_3
        28: iload_3
        29: iflt          40
        32: iload_3
        33: aload_0
        34: getfield      #44                 // Field _h:I
        37: if_icmple     42
        40: iconst_0
        41: ireturn
        42: iconst_1
        43: ireturn
      LineNumberTable:
        line 55: 0
        line 56: 7
        line 57: 19
        line 59: 21
        line 60: 28
        line 61: 40
        line 63: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/commons/geometry/Rectangle;
            0      44     1     x   I
            0      44     2     y   I
            7      37     3     d   I
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 1 /* same */
        frame_type = 18 /* same */
        frame_type = 1 /* same */

  public boolean intersects(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: getfield      #25                 // Field _x:I
         4: iload_3
         5: if_icmpge     47
         8: aload_0
         9: getfield      #25                 // Field _x:I
        12: aload_0
        13: getfield      #41                 // Field _w:I
        16: iadd
        17: iload_1
        18: if_icmple     47
        21: aload_0
        22: getfield      #34                 // Field _y:I
        25: iload         4
        27: if_icmpge     47
        30: aload_0
        31: getfield      #34                 // Field _y:I
        34: aload_0
        35: getfield      #44                 // Field _h:I
        38: iadd
        39: iload_2
        40: if_icmple     47
        43: iconst_1
        44: goto          48
        47: iconst_0
        48: ireturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/commons/geometry/Rectangle;
            0      49     1    x1   I
            0      49     2    y1   I
            0      49     3    x2   I
            0      49     4    y2   I
      StackMapTable: number_of_entries = 2
        frame_type = 47 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.location.Location getRandomLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #58                 // class ext/mods/gameserver/model/location/Location
         3: dup
         4: aload_0
         5: getfield      #25                 // Field _x:I
         8: aload_0
         9: getfield      #41                 // Field _w:I
        12: invokestatic  #60                 // Method ext/mods/commons/random/Rnd.get:(I)I
        15: iadd
        16: aload_0
        17: getfield      #34                 // Field _y:I
        20: aload_0
        21: getfield      #44                 // Field _h:I
        24: invokestatic  #60                 // Method ext/mods/commons/random/Rnd.get:(I)I
        27: iadd
        28: iconst_0
        29: invokespecial #64                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        32: areturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/commons/geometry/Rectangle;

  public void visualize(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=6, args_size=4
         0: aload_0
         1: getfield      #25                 // Field _x:I
         4: aload_0
         5: getfield      #41                 // Field _w:I
         8: iadd
         9: istore        4
        11: aload_0
        12: getfield      #34                 // Field _y:I
        15: aload_0
        16: getfield      #44                 // Field _h:I
        19: iadd
        20: istore        5
        22: iinc          3, -32
        25: aload_2
        26: aload_1
        27: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        30: iconst_1
        31: aload_0
        32: getfield      #25                 // Field _x:I
        35: aload_0
        36: getfield      #34                 // Field _y:I
        39: iload_3
        40: aload_0
        41: getfield      #25                 // Field _x:I
        44: iload         5
        46: iload_3
        47: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        50: aload_2
        51: aload_1
        52: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        55: iconst_1
        56: aload_0
        57: getfield      #25                 // Field _x:I
        60: iload         5
        62: iload_3
        63: iload         4
        65: iload         5
        67: iload_3
        68: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        71: aload_2
        72: aload_1
        73: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        76: iconst_1
        77: iload         4
        79: iload         5
        81: iload_3
        82: iload         4
        84: aload_0
        85: getfield      #34                 // Field _y:I
        88: iload_3
        89: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        92: aload_2
        93: aload_1
        94: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        97: iconst_1
        98: iload         4
       100: aload_0
       101: getfield      #34                 // Field _y:I
       104: iload_3
       105: aload_0
       106: getfield      #25                 // Field _x:I
       109: aload_0
       110: getfield      #34                 // Field _y:I
       113: iload_3
       114: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       117: return
      LineNumberTable:
        line 81: 0
        line 82: 11
        line 83: 22
        line 85: 25
        line 86: 50
        line 87: 71
        line 88: 92
        line 89: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     118     0  this   Lext/mods/commons/geometry/Rectangle;
            0     118     1  info   Ljava/lang/String;
            0     118     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            0     118     3     z   I
           11     107     4    x2   I
           22      96     5    y2   I

  public void visualize3D(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=7, args_size=5
         0: aload_0
         1: getfield      #25                 // Field _x:I
         4: aload_0
         5: getfield      #41                 // Field _w:I
         8: iadd
         9: istore        5
        11: aload_0
        12: getfield      #34                 // Field _y:I
        15: aload_0
        16: getfield      #44                 // Field _h:I
        19: iadd
        20: istore        6
        22: aload_2
        23: aload_1
        24: getstatic     #79                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        27: iconst_1
        28: aload_0
        29: getfield      #25                 // Field _x:I
        32: aload_0
        33: getfield      #34                 // Field _y:I
        36: iload_3
        37: aload_0
        38: getfield      #25                 // Field _x:I
        41: iload         6
        43: iload_3
        44: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        47: aload_2
        48: aload_1
        49: getstatic     #79                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        52: iconst_1
        53: aload_0
        54: getfield      #25                 // Field _x:I
        57: iload         6
        59: iload_3
        60: iload         5
        62: iload         6
        64: iload_3
        65: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        68: aload_2
        69: aload_1
        70: getstatic     #79                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        73: iconst_1
        74: iload         5
        76: iload         6
        78: iload_3
        79: iload         5
        81: aload_0
        82: getfield      #34                 // Field _y:I
        85: iload_3
        86: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        89: aload_2
        90: aload_1
        91: getstatic     #79                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        94: iconst_1
        95: iload         5
        97: aload_0
        98: getfield      #34                 // Field _y:I
       101: iload_3
       102: aload_0
       103: getfield      #25                 // Field _x:I
       106: aload_0
       107: getfield      #34                 // Field _y:I
       110: iload_3
       111: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       114: aload_2
       115: aload_1
       116: getstatic     #82                 // Field java/awt/Color.RED:Ljava/awt/Color;
       119: iconst_1
       120: aload_0
       121: getfield      #25                 // Field _x:I
       124: aload_0
       125: getfield      #34                 // Field _y:I
       128: iload         4
       130: aload_0
       131: getfield      #25                 // Field _x:I
       134: iload         6
       136: iload         4
       138: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       141: aload_2
       142: aload_1
       143: getstatic     #82                 // Field java/awt/Color.RED:Ljava/awt/Color;
       146: iconst_1
       147: aload_0
       148: getfield      #25                 // Field _x:I
       151: iload         6
       153: iload         4
       155: iload         5
       157: iload         6
       159: iload         4
       161: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       164: aload_2
       165: aload_1
       166: getstatic     #82                 // Field java/awt/Color.RED:Ljava/awt/Color;
       169: iconst_1
       170: iload         5
       172: iload         6
       174: iload         4
       176: iload         5
       178: aload_0
       179: getfield      #34                 // Field _y:I
       182: iload         4
       184: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       187: aload_2
       188: aload_1
       189: getstatic     #82                 // Field java/awt/Color.RED:Ljava/awt/Color;
       192: iconst_1
       193: iload         5
       195: aload_0
       196: getfield      #34                 // Field _y:I
       199: iload         4
       201: aload_0
       202: getfield      #25                 // Field _x:I
       205: aload_0
       206: getfield      #34                 // Field _y:I
       209: iload         4
       211: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       214: aload_2
       215: aload_1
       216: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       219: iconst_1
       220: aload_0
       221: getfield      #25                 // Field _x:I
       224: aload_0
       225: getfield      #34                 // Field _y:I
       228: iload_3
       229: aload_0
       230: getfield      #25                 // Field _x:I
       233: aload_0
       234: getfield      #34                 // Field _y:I
       237: iload         4
       239: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       242: aload_2
       243: aload_1
       244: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       247: iconst_1
       248: aload_0
       249: getfield      #25                 // Field _x:I
       252: iload         6
       254: iload_3
       255: aload_0
       256: getfield      #25                 // Field _x:I
       259: iload         6
       261: iload         4
       263: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       266: aload_2
       267: aload_1
       268: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       271: iconst_1
       272: iload         5
       274: iload         6
       276: iload_3
       277: iload         5
       279: iload         6
       281: iload         4
       283: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       286: aload_2
       287: aload_1
       288: getstatic     #67                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       291: iconst_1
       292: iload         5
       294: aload_0
       295: getfield      #34                 // Field _y:I
       298: iload_3
       299: iload         5
       301: aload_0
       302: getfield      #34                 // Field _y:I
       305: iload         4
       307: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       310: return
      LineNumberTable:
        line 94: 0
        line 95: 11
        line 97: 22
        line 98: 47
        line 99: 68
        line 100: 89
        line 102: 114
        line 103: 141
        line 104: 164
        line 105: 187
        line 107: 214
        line 108: 242
        line 109: 266
        line 110: 286
        line 111: 310
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     311     0  this   Lext/mods/commons/geometry/Rectangle;
            0     311     1  info   Ljava/lang/String;
            0     311     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            0     311     3  minZ   I
            0     311     4  maxZ   I
           11     300     5    x2   I
           22     289     6    y2   I
}
SourceFile: "Rectangle.java"
