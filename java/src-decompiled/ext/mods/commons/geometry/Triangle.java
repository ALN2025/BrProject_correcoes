// Bytecode for: ext.mods.commons.geometry.Triangle
// File: ext\mods\commons\geometry\Triangle.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/Triangle.class
  Last modified 9 de jul de 2026; size 3997 bytes
  MD5 checksum 6e4c758698e377d9d1c912dfdbfd14b2
  Compiled from "Triangle.java"
public class ext.mods.commons.geometry.Triangle extends ext.mods.commons.geometry.AShape
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/commons/geometry/Triangle
  super_class: #16                        // ext/mods/commons/geometry/AShape
  interfaces: 0, fields: 6, methods: 7, attributes: 1
Constant pool:
    #1 = InterfaceMethodref #2.#3         // java/util/List.get:(I)Ljava/lang/Object;
    #2 = Class              #4            // java/util/List
    #3 = NameAndType        #5:#6         // get:(I)Ljava/lang/Object;
    #4 = Utf8               java/util/List
    #5 = Utf8               get
    #6 = Utf8               (I)Ljava/lang/Object;
    #7 = Class              #8            // ext/mods/gameserver/model/location/Point2D
    #8 = Utf8               ext/mods/gameserver/model/location/Point2D
    #9 = Methodref          #10.#11       // ext/mods/commons/geometry/Triangle."<init>":(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
   #10 = Class              #12           // ext/mods/commons/geometry/Triangle
   #11 = NameAndType        #13:#14       // "<init>":(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
   #12 = Utf8               ext/mods/commons/geometry/Triangle
   #13 = Utf8               <init>
   #14 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
   #15 = Methodref          #16.#17       // ext/mods/commons/geometry/AShape."<init>":()V
   #16 = Class              #18           // ext/mods/commons/geometry/AShape
   #17 = NameAndType        #13:#19       // "<init>":()V
   #18 = Utf8               ext/mods/commons/geometry/AShape
   #19 = Utf8               ()V
   #20 = Methodref          #7.#21        // ext/mods/gameserver/model/location/Point2D.getX:()I
   #21 = NameAndType        #22:#23       // getX:()I
   #22 = Utf8               getX
   #23 = Utf8               ()I
   #24 = Fieldref           #10.#25       // ext/mods/commons/geometry/Triangle._Ax:I
   #25 = NameAndType        #26:#27       // _Ax:I
   #26 = Utf8               _Ax
   #27 = Utf8               I
   #28 = Methodref          #7.#29        // ext/mods/gameserver/model/location/Point2D.getY:()I
   #29 = NameAndType        #30:#23       // getY:()I
   #30 = Utf8               getY
   #31 = Fieldref           #10.#32       // ext/mods/commons/geometry/Triangle._Ay:I
   #32 = NameAndType        #33:#27       // _Ay:I
   #33 = Utf8               _Ay
   #34 = Fieldref           #10.#35       // ext/mods/commons/geometry/Triangle._BAx:I
   #35 = NameAndType        #36:#27       // _BAx:I
   #36 = Utf8               _BAx
   #37 = Fieldref           #10.#38       // ext/mods/commons/geometry/Triangle._BAy:I
   #38 = NameAndType        #39:#27       // _BAy:I
   #39 = Utf8               _BAy
   #40 = Fieldref           #10.#41       // ext/mods/commons/geometry/Triangle._CAx:I
   #41 = NameAndType        #42:#27       // _CAx:I
   #42 = Utf8               _CAx
   #43 = Fieldref           #10.#44       // ext/mods/commons/geometry/Triangle._CAy:I
   #44 = NameAndType        #45:#27       // _CAy:I
   #45 = Utf8               _CAy
   #46 = Methodref          #7.#47        // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
   #47 = NameAndType        #13:#48       // "<init>":(II)V
   #48 = Utf8               (II)V
   #49 = Fieldref           #10.#50       // ext/mods/commons/geometry/Triangle._center:Lext/mods/gameserver/model/location/Point2D;
   #50 = NameAndType        #51:#52       // _center:Lext/mods/gameserver/model/location/Point2D;
   #51 = Utf8               _center
   #52 = Utf8               Lext/mods/gameserver/model/location/Point2D;
   #53 = Methodref          #54.#55       // java/lang/Math.abs:(J)J
   #54 = Class              #56           // java/lang/Math
   #55 = NameAndType        #57:#58       // abs:(J)J
   #56 = Utf8               java/lang/Math
   #57 = Utf8               abs
   #58 = Utf8               (J)J
   #59 = Long               2l
   #61 = Fieldref           #10.#62       // ext/mods/commons/geometry/Triangle._area:J
   #62 = NameAndType        #63:#64       // _area:J
   #63 = Utf8               _area
   #64 = Utf8               J
   #65 = Methodref          #54.#66       // java/lang/Math.min:(II)I
   #66 = NameAndType        #67:#68       // min:(II)I
   #67 = Utf8               min
   #68 = Utf8               (II)I
   #69 = Methodref          #54.#70       // java/lang/Math.max:(II)I
   #70 = NameAndType        #71:#68       // max:(II)I
   #71 = Utf8               max
   #72 = Methodref          #73.#74       // ext/mods/commons/random/Rnd.nextDouble:()D
   #73 = Class              #75           // ext/mods/commons/random/Rnd
   #74 = NameAndType        #76:#77       // nextDouble:()D
   #75 = Utf8               ext/mods/commons/random/Rnd
   #76 = Utf8               nextDouble
   #77 = Utf8               ()D
   #78 = Class              #79           // ext/mods/gameserver/model/location/Location
   #79 = Utf8               ext/mods/gameserver/model/location/Location
   #80 = Methodref          #78.#81       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #81 = NameAndType        #13:#82       // "<init>":(III)V
   #82 = Utf8               (III)V
   #83 = Fieldref           #84.#85       // java/awt/Color.YELLOW:Ljava/awt/Color;
   #84 = Class              #86           // java/awt/Color
   #85 = NameAndType        #87:#88       // YELLOW:Ljava/awt/Color;
   #86 = Utf8               java/awt/Color
   #87 = Utf8               YELLOW
   #88 = Utf8               Ljava/awt/Color;
   #89 = Methodref          #90.#91       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #90 = Class              #92           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #91 = NameAndType        #93:#94       // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #92 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #93 = Utf8               addLine
   #94 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #95 = Fieldref           #84.#96       // java/awt/Color.GREEN:Ljava/awt/Color;
   #96 = NameAndType        #97:#88       // GREEN:Ljava/awt/Color;
   #97 = Utf8               GREEN
   #98 = Fieldref           #84.#99       // java/awt/Color.RED:Ljava/awt/Color;
   #99 = NameAndType        #100:#88      // RED:Ljava/awt/Color;
  #100 = Utf8               RED
  #101 = Utf8               (Ljava/util/List;)V
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/commons/geometry/Triangle;
  #107 = Utf8               coords
  #108 = Utf8               Ljava/util/List;
  #109 = Utf8               LocalVariableTypeTable
  #110 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #111 = Utf8               Signature
  #112 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V
  #113 = Utf8               A
  #114 = Utf8               B
  #115 = Utf8               C
  #116 = Utf8               isInside
  #117 = Utf8               (II)Z
  #118 = Utf8               x
  #119 = Utf8               y
  #120 = Utf8               dx
  #121 = Utf8               dy
  #122 = Utf8               a
  #123 = Utf8               Z
  #124 = Utf8               b
  #125 = Utf8               c
  #126 = Utf8               StackMapTable
  #127 = Utf8               intersects
  #128 = Utf8               (IIII)Z
  #129 = Utf8               x1
  #130 = Utf8               y1
  #131 = Utf8               x2
  #132 = Utf8               y2
  #133 = Utf8               minX
  #134 = Utf8               maxX
  #135 = Utf8               minY
  #136 = Utf8               maxY
  #137 = Utf8               getRandomLocation
  #138 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #139 = Utf8               ba
  #140 = Utf8               D
  #141 = Utf8               ca
  #142 = Utf8               visualize
  #143 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
  #144 = Utf8               info
  #145 = Utf8               Ljava/lang/String;
  #146 = Utf8               debug
  #147 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #148 = Utf8               z
  #149 = Utf8               x3
  #150 = Utf8               y3
  #151 = Utf8               visualize3D
  #152 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
  #153 = Utf8               minZ
  #154 = Utf8               maxZ
  #155 = Utf8               SourceFile
  #156 = Utf8               Triangle.java
{
  protected final int _Ax;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _Ay;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _BAx;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _BAy;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _CAx;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _CAy;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  public ext.mods.commons.geometry.Triangle(java.util.List<ext.mods.gameserver.model.location.Point2D>);
    descriptor: (Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokeinterface #1,  2            // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
         8: checkcast     #7                  // class ext/mods/gameserver/model/location/Point2D
        11: aload_1
        12: iconst_1
        13: invokeinterface #1,  2            // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        18: checkcast     #7                  // class ext/mods/gameserver/model/location/Point2D
        21: aload_1
        22: iconst_2
        23: invokeinterface #1,  2            // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        28: checkcast     #7                  // class ext/mods/gameserver/model/location/Point2D
        31: invokespecial #9                  // Method "<init>":(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
        34: return
      LineNumberTable:
        line 42: 0
        line 43: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/commons/geometry/Triangle;
            0      35     1 coords   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      35     1 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
    Signature: #112                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;)V

  public ext.mods.commons.geometry.Triangle(ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: invokespecial #15                 // Method ext/mods/commons/geometry/AShape."<init>":()V
         4: aload_0
         5: aload_1
         6: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
         9: putfield      #24                 // Field _Ax:I
        12: aload_0
        13: aload_1
        14: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        17: putfield      #31                 // Field _Ay:I
        20: aload_0
        21: aload_2
        22: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        25: aload_1
        26: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        29: isub
        30: putfield      #34                 // Field _BAx:I
        33: aload_0
        34: aload_2
        35: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        38: aload_1
        39: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        42: isub
        43: putfield      #37                 // Field _BAy:I
        46: aload_0
        47: aload_3
        48: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        51: aload_1
        52: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        55: isub
        56: putfield      #40                 // Field _CAx:I
        59: aload_0
        60: aload_3
        61: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        64: aload_1
        65: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        68: isub
        69: putfield      #43                 // Field _CAy:I
        72: aload_0
        73: new           #7                  // class ext/mods/gameserver/model/location/Point2D
        76: dup
        77: aload_1
        78: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        81: aload_2
        82: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        85: iadd
        86: aload_3
        87: invokevirtual #20                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        90: iadd
        91: iconst_3
        92: idiv
        93: aload_1
        94: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        97: aload_2
        98: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       101: iadd
       102: aload_3
       103: invokevirtual #28                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       106: iadd
       107: iconst_3
       108: idiv
       109: invokespecial #46                 // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
       112: putfield      #49                 // Field _center:Lext/mods/gameserver/model/location/Point2D;
       115: aload_0
       116: aload_0
       117: getfield      #34                 // Field _BAx:I
       120: aload_0
       121: getfield      #43                 // Field _CAy:I
       124: imul
       125: aload_0
       126: getfield      #40                 // Field _CAx:I
       129: aload_0
       130: getfield      #37                 // Field _BAy:I
       133: imul
       134: isub
       135: i2l
       136: invokestatic  #53                 // Method java/lang/Math.abs:(J)J
       139: ldc2_w        #59                 // long 2l
       142: ldiv
       143: putfield      #61                 // Field _area:J
       146: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 48: 12
        line 50: 20
        line 51: 33
        line 53: 46
        line 54: 59
        line 56: 72
        line 57: 115
        line 58: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     147     0  this   Lext/mods/commons/geometry/Triangle;
            0     147     1     A   Lext/mods/gameserver/model/location/Point2D;
            0     147     2     B   Lext/mods/gameserver/model/location/Point2D;
            0     147     3     C   Lext/mods/gameserver/model/location/Point2D;

  public final boolean isInside(int, int);
    descriptor: (II)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=10, args_size=3
         0: iload_1
         1: aload_0
         2: getfield      #24                 // Field _Ax:I
         5: isub
         6: i2l
         7: lstore_3
         8: iload_2
         9: aload_0
        10: getfield      #31                 // Field _Ay:I
        13: isub
        14: i2l
        15: lstore        5
        17: lconst_0
        18: lload_3
        19: lsub
        20: aload_0
        21: getfield      #37                 // Field _BAy:I
        24: iconst_0
        25: isub
        26: i2l
        27: lmul
        28: aload_0
        29: getfield      #34                 // Field _BAx:I
        32: iconst_0
        33: isub
        34: i2l
        35: lconst_0
        36: lload         5
        38: lsub
        39: lmul
        40: lsub
        41: lconst_0
        42: lcmp
        43: iflt          50
        46: iconst_1
        47: goto          51
        50: iconst_0
        51: istore        7
        53: aload_0
        54: getfield      #34                 // Field _BAx:I
        57: i2l
        58: lload_3
        59: lsub
        60: aload_0
        61: getfield      #43                 // Field _CAy:I
        64: aload_0
        65: getfield      #37                 // Field _BAy:I
        68: isub
        69: i2l
        70: lmul
        71: aload_0
        72: getfield      #40                 // Field _CAx:I
        75: aload_0
        76: getfield      #34                 // Field _BAx:I
        79: isub
        80: i2l
        81: aload_0
        82: getfield      #37                 // Field _BAy:I
        85: i2l
        86: lload         5
        88: lsub
        89: lmul
        90: lsub
        91: lconst_0
        92: lcmp
        93: iflt          100
        96: iconst_1
        97: goto          101
       100: iconst_0
       101: istore        8
       103: aload_0
       104: getfield      #40                 // Field _CAx:I
       107: i2l
       108: lload_3
       109: lsub
       110: iconst_0
       111: aload_0
       112: getfield      #43                 // Field _CAy:I
       115: isub
       116: i2l
       117: lmul
       118: iconst_0
       119: aload_0
       120: getfield      #40                 // Field _CAx:I
       123: isub
       124: i2l
       125: aload_0
       126: getfield      #43                 // Field _CAy:I
       129: i2l
       130: lload         5
       132: lsub
       133: lmul
       134: lsub
       135: lconst_0
       136: lcmp
       137: iflt          144
       140: iconst_1
       141: goto          145
       144: iconst_0
       145: istore        9
       147: iload         7
       149: iload         8
       151: if_icmpne     165
       154: iload         8
       156: iload         9
       158: if_icmpne     165
       161: iconst_1
       162: goto          166
       165: iconst_0
       166: ireturn
      LineNumberTable:
        line 63: 0
        line 64: 8
        line 66: 17
        line 67: 53
        line 68: 103
        line 70: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     167     0  this   Lext/mods/commons/geometry/Triangle;
            0     167     1     x   I
            0     167     2     y   I
            8     159     3    dx   J
           17     150     5    dy   J
           53     114     7     a   Z
          103      64     8     b   Z
          147      20     9     c   Z
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ long, long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean intersects(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=5
         0: aload_0
         1: getfield      #24                 // Field _Ax:I
         4: iload_1
         5: iload_3
         6: invokestatic  #65                 // Method java/lang/Math.min:(II)I
         9: invokestatic  #65                 // Method java/lang/Math.min:(II)I
        12: istore        5
        14: aload_0
        15: getfield      #24                 // Field _Ax:I
        18: iload_1
        19: iload_3
        20: invokestatic  #69                 // Method java/lang/Math.max:(II)I
        23: invokestatic  #69                 // Method java/lang/Math.max:(II)I
        26: istore        6
        28: aload_0
        29: getfield      #31                 // Field _Ay:I
        32: iload_2
        33: iload         4
        35: invokestatic  #65                 // Method java/lang/Math.min:(II)I
        38: invokestatic  #65                 // Method java/lang/Math.min:(II)I
        41: istore        7
        43: aload_0
        44: getfield      #31                 // Field _Ay:I
        47: iload_2
        48: iload         4
        50: invokestatic  #69                 // Method java/lang/Math.max:(II)I
        53: invokestatic  #69                 // Method java/lang/Math.max:(II)I
        56: istore        8
        58: iload         5
        60: aload_0
        61: getfield      #24                 // Field _Ax:I
        64: aload_0
        65: getfield      #34                 // Field _BAx:I
        68: iadd
        69: if_icmpge     108
        72: iload         6
        74: aload_0
        75: getfield      #24                 // Field _Ax:I
        78: if_icmple     108
        81: iload         7
        83: aload_0
        84: getfield      #31                 // Field _Ay:I
        87: aload_0
        88: getfield      #37                 // Field _BAy:I
        91: iadd
        92: if_icmpge     108
        95: iload         8
        97: aload_0
        98: getfield      #31                 // Field _Ay:I
       101: if_icmple     108
       104: iconst_1
       105: goto          109
       108: iconst_0
       109: ireturn
      LineNumberTable:
        line 76: 0
        line 77: 14
        line 78: 28
        line 79: 43
        line 81: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/commons/geometry/Triangle;
            0     110     1    x1   I
            0     110     2    y1   I
            0     110     3    x2   I
            0     110     4    y2   I
           14      96     5  minX   I
           28      82     6  maxX   I
           43      67     7  minY   I
           58      52     8  maxY   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/commons/geometry/Triangle, int, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.location.Location getRandomLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=1
         0: invokestatic  #72                 // Method ext/mods/commons/random/Rnd.nextDouble:()D
         3: dstore_1
         4: invokestatic  #72                 // Method ext/mods/commons/random/Rnd.nextDouble:()D
         7: dstore_3
         8: dload_1
         9: dload_3
        10: dadd
        11: dconst_1
        12: dcmpl
        13: ifle          24
        16: dconst_1
        17: dload_1
        18: dsub
        19: dstore_1
        20: dconst_1
        21: dload_3
        22: dsub
        23: dstore_3
        24: aload_0
        25: getfield      #24                 // Field _Ax:I
        28: dload_1
        29: aload_0
        30: getfield      #34                 // Field _BAx:I
        33: i2d
        34: dmul
        35: dload_3
        36: aload_0
        37: getfield      #40                 // Field _CAx:I
        40: i2d
        41: dmul
        42: dadd
        43: d2i
        44: iadd
        45: istore        5
        47: aload_0
        48: getfield      #31                 // Field _Ay:I
        51: dload_1
        52: aload_0
        53: getfield      #37                 // Field _BAy:I
        56: i2d
        57: dmul
        58: dload_3
        59: aload_0
        60: getfield      #43                 // Field _CAy:I
        63: i2d
        64: dmul
        65: dadd
        66: d2i
        67: iadd
        68: istore        6
        70: new           #78                 // class ext/mods/gameserver/model/location/Location
        73: dup
        74: iload         5
        76: iload         6
        78: iconst_0
        79: invokespecial #80                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        82: areturn
      LineNumberTable:
        line 87: 0
        line 88: 4
        line 90: 8
        line 92: 16
        line 93: 20
        line 96: 24
        line 97: 47
        line 99: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/commons/geometry/Triangle;
            4      79     1    ba   D
            8      75     3    ca   D
           47      36     5     x   I
           70      13     6     y   I
      StackMapTable: number_of_entries = 1
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ double, double ]

  public void visualize(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=8, args_size=4
         0: aload_0
         1: getfield      #24                 // Field _Ax:I
         4: aload_0
         5: getfield      #34                 // Field _BAx:I
         8: iadd
         9: istore        4
        11: aload_0
        12: getfield      #31                 // Field _Ay:I
        15: aload_0
        16: getfield      #37                 // Field _BAy:I
        19: iadd
        20: istore        5
        22: aload_0
        23: getfield      #24                 // Field _Ax:I
        26: aload_0
        27: getfield      #40                 // Field _CAx:I
        30: iadd
        31: istore        6
        33: aload_0
        34: getfield      #31                 // Field _Ay:I
        37: aload_0
        38: getfield      #43                 // Field _CAy:I
        41: iadd
        42: istore        7
        44: aload_2
        45: aload_1
        46: getstatic     #83                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        49: iconst_1
        50: aload_0
        51: getfield      #24                 // Field _Ax:I
        54: aload_0
        55: getfield      #31                 // Field _Ay:I
        58: iload_3
        59: iload         4
        61: iload         5
        63: iload_3
        64: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        67: aload_2
        68: aload_1
        69: getstatic     #83                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        72: iconst_1
        73: aload_0
        74: getfield      #24                 // Field _Ax:I
        77: aload_0
        78: getfield      #31                 // Field _Ay:I
        81: iload_3
        82: iload         6
        84: iload         7
        86: iload_3
        87: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        90: aload_2
        91: aload_1
        92: getstatic     #83                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        95: iconst_1
        96: iload         4
        98: iload         5
       100: iload_3
       101: iload         6
       103: iload         7
       105: iload_3
       106: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       109: return
      LineNumberTable:
        line 105: 0
        line 106: 11
        line 107: 22
        line 108: 33
        line 110: 44
        line 111: 67
        line 112: 90
        line 113: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/commons/geometry/Triangle;
            0     110     1  info   Ljava/lang/String;
            0     110     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            0     110     3     z   I
           11      99     4    x2   I
           22      88     5    y2   I
           33      77     6    x3   I
           44      66     7    y3   I

  public void visualize3D(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive, int, int);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=9, args_size=5
         0: aload_0
         1: getfield      #24                 // Field _Ax:I
         4: aload_0
         5: getfield      #34                 // Field _BAx:I
         8: iadd
         9: istore        5
        11: aload_0
        12: getfield      #31                 // Field _Ay:I
        15: aload_0
        16: getfield      #37                 // Field _BAy:I
        19: iadd
        20: istore        6
        22: aload_0
        23: getfield      #24                 // Field _Ax:I
        26: aload_0
        27: getfield      #40                 // Field _CAx:I
        30: iadd
        31: istore        7
        33: aload_0
        34: getfield      #31                 // Field _Ay:I
        37: aload_0
        38: getfield      #43                 // Field _CAy:I
        41: iadd
        42: istore        8
        44: aload_2
        45: aload_1
        46: getstatic     #95                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        49: iconst_1
        50: aload_0
        51: getfield      #24                 // Field _Ax:I
        54: aload_0
        55: getfield      #31                 // Field _Ay:I
        58: iload_3
        59: iload         5
        61: iload         6
        63: iload_3
        64: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        67: aload_2
        68: aload_1
        69: getstatic     #95                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        72: iconst_1
        73: aload_0
        74: getfield      #24                 // Field _Ax:I
        77: aload_0
        78: getfield      #31                 // Field _Ay:I
        81: iload_3
        82: iload         7
        84: iload         8
        86: iload_3
        87: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        90: aload_2
        91: aload_1
        92: getstatic     #95                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        95: iconst_1
        96: iload         5
        98: iload         6
       100: iload_3
       101: iload         7
       103: iload         8
       105: iload_3
       106: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       109: aload_2
       110: aload_1
       111: getstatic     #98                 // Field java/awt/Color.RED:Ljava/awt/Color;
       114: iconst_1
       115: aload_0
       116: getfield      #24                 // Field _Ax:I
       119: aload_0
       120: getfield      #31                 // Field _Ay:I
       123: iload         4
       125: iload         5
       127: iload         6
       129: iload         4
       131: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       134: aload_2
       135: aload_1
       136: getstatic     #98                 // Field java/awt/Color.RED:Ljava/awt/Color;
       139: iconst_1
       140: aload_0
       141: getfield      #24                 // Field _Ax:I
       144: aload_0
       145: getfield      #31                 // Field _Ay:I
       148: iload         4
       150: iload         7
       152: iload         8
       154: iload         4
       156: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       159: aload_2
       160: aload_1
       161: getstatic     #98                 // Field java/awt/Color.RED:Ljava/awt/Color;
       164: iconst_1
       165: iload         5
       167: iload         6
       169: iload         4
       171: iload         7
       173: iload         8
       175: iload         4
       177: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       180: aload_2
       181: aload_1
       182: getstatic     #83                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       185: iconst_1
       186: aload_0
       187: getfield      #24                 // Field _Ax:I
       190: aload_0
       191: getfield      #31                 // Field _Ay:I
       194: iload_3
       195: aload_0
       196: getfield      #24                 // Field _Ax:I
       199: aload_0
       200: getfield      #31                 // Field _Ay:I
       203: iload         4
       205: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       208: aload_2
       209: aload_1
       210: getstatic     #83                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       213: iconst_1
       214: iload         5
       216: iload         6
       218: iload_3
       219: iload         5
       221: iload         6
       223: iload         4
       225: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       228: aload_2
       229: aload_1
       230: getstatic     #83                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       233: iconst_1
       234: iload         7
       236: iload         8
       238: iload_3
       239: iload         7
       241: iload         8
       243: iload         4
       245: invokevirtual #89                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       248: return
      LineNumberTable:
        line 118: 0
        line 119: 11
        line 120: 22
        line 121: 33
        line 123: 44
        line 124: 67
        line 125: 90
        line 127: 109
        line 128: 134
        line 129: 159
        line 131: 180
        line 132: 208
        line 133: 228
        line 134: 248
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     249     0  this   Lext/mods/commons/geometry/Triangle;
            0     249     1  info   Ljava/lang/String;
            0     249     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            0     249     3  minZ   I
            0     249     4  maxZ   I
           11     238     5    x2   I
           22     227     6    y2   I
           33     216     7    x3   I
           44     205     8    y3   I
}
SourceFile: "Triangle.java"
