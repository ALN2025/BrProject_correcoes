// Bytecode for: ext.mods.commons.geometry.basic.Line2D
// File: ext\mods\commons\geometry\basic\Line2D.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/geometry/basic/Line2D.class
  Last modified 9 de jul de 2026; size 3882 bytes
  MD5 checksum 200799abae8c2dca6d25efd36b592d5a
  Compiled from "Line2D.java"
public class ext.mods.commons.geometry.basic.Line2D
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/geometry/basic/Line2D
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 18, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/geometry/basic/Line2D._p1x:I
    #8 = Class              #10           // ext/mods/commons/geometry/basic/Line2D
    #9 = NameAndType        #11:#12       // _p1x:I
   #10 = Utf8               ext/mods/commons/geometry/basic/Line2D
   #11 = Utf8               _p1x
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/commons/geometry/basic/Line2D._p1y:I
   #14 = NameAndType        #15:#12       // _p1y:I
   #15 = Utf8               _p1y
   #16 = Fieldref           #8.#17        // ext/mods/commons/geometry/basic/Line2D._p2x:I
   #17 = NameAndType        #18:#12       // _p2x:I
   #18 = Utf8               _p2x
   #19 = Fieldref           #8.#20        // ext/mods/commons/geometry/basic/Line2D._p2y:I
   #20 = NameAndType        #21:#12       // _p2y:I
   #21 = Utf8               _p2y
   #22 = Methodref          #8.#23        // ext/mods/commons/geometry/basic/Line2D."<init>":(IIII)V
   #23 = NameAndType        #5:#24        // "<init>":(IIII)V
   #24 = Utf8               (IIII)V
   #25 = Methodref          #8.#26        // ext/mods/commons/geometry/basic/Line2D.getIntersectionPoint:(IIII)Lext/mods/gameserver/model/location/Point2D;
   #26 = NameAndType        #27:#28       // getIntersectionPoint:(IIII)Lext/mods/gameserver/model/location/Point2D;
   #27 = Utf8               getIntersectionPoint
   #28 = Utf8               (IIII)Lext/mods/gameserver/model/location/Point2D;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/location/Point2D.getX:()I
   #30 = Class              #32           // ext/mods/gameserver/model/location/Point2D
   #31 = NameAndType        #33:#34       // getX:()I
   #32 = Utf8               ext/mods/gameserver/model/location/Point2D
   #33 = Utf8               getX
   #34 = Utf8               ()I
   #35 = Methodref          #30.#36       // ext/mods/gameserver/model/location/Point2D.getY:()I
   #36 = NameAndType        #37:#34       // getY:()I
   #37 = Utf8               getY
   #38 = Methodref          #8.#39        // ext/mods/commons/geometry/basic/Line2D.getIntersectionPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Lext/mods/gameserver/model/location/Point2D;
   #39 = NameAndType        #27:#40       // getIntersectionPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Lext/mods/gameserver/model/location/Point2D;
   #40 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Lext/mods/gameserver/model/location/Point2D;
   #41 = Methodref          #42.#43       // java/lang/Math.round:(D)J
   #42 = Class              #44           // java/lang/Math
   #43 = NameAndType        #45:#46       // round:(D)J
   #44 = Utf8               java/lang/Math
   #45 = Utf8               round
   #46 = Utf8               (D)J
   #47 = Methodref          #30.#48       // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
   #48 = NameAndType        #5:#49        // "<init>":(II)V
   #49 = Utf8               (II)V
   #50 = Double             2.0d
   #52 = Methodref          #42.#53       // java/lang/Math.pow:(DD)D
   #53 = NameAndType        #54:#55       // pow:(DD)D
   #54 = Utf8               pow
   #55 = Utf8               (DD)D
   #56 = Methodref          #42.#57       // java/lang/Math.sqrt:(D)D
   #57 = NameAndType        #58:#59       // sqrt:(D)D
   #58 = Utf8               sqrt
   #59 = Utf8               (D)D
   #60 = Methodref          #8.#61        // ext/mods/commons/geometry/basic/Line2D.getX:()D
   #61 = NameAndType        #33:#62       // getX:()D
   #62 = Utf8               ()D
   #63 = Methodref          #8.#64        // ext/mods/commons/geometry/basic/Line2D.getY:()D
   #64 = NameAndType        #37:#62       // getY:()D
   #65 = Methodref          #8.#66        // ext/mods/commons/geometry/basic/Line2D.clone:()Lext/mods/commons/geometry/basic/Line2D;
   #66 = NameAndType        #67:#68       // clone:()Lext/mods/commons/geometry/basic/Line2D;
   #67 = Utf8               clone
   #68 = Utf8               ()Lext/mods/commons/geometry/basic/Line2D;
   #69 = Utf8               Code
   #70 = Utf8               LineNumberTable
   #71 = Utf8               LocalVariableTable
   #72 = Utf8               this
   #73 = Utf8               Lext/mods/commons/geometry/basic/Line2D;
   #74 = Utf8               p1x
   #75 = Utf8               p1y
   #76 = Utf8               p2x
   #77 = Utf8               p2y
   #78 = Utf8               getP1x
   #79 = Utf8               getP1y
   #80 = Utf8               getP2x
   #81 = Utf8               getP2y
   #82 = Utf8               intersectsLine
   #83 = Utf8               (Lext/mods/commons/geometry/basic/Line2D;)Z
   #84 = Utf8               other
   #85 = Utf8               dx1
   #86 = Utf8               D
   #87 = Utf8               dy1
   #88 = Utf8               dx2
   #89 = Utf8               dy2
   #90 = Utf8               delta
   #91 = Utf8               t
   #92 = Utf8               u
   #93 = Utf8               StackMapTable
   #94 = Utf8               (Lext/mods/commons/geometry/basic/Line2D;)Lext/mods/gameserver/model/location/Point2D;
   #95 = Utf8               line
   #96 = Utf8               start
   #97 = Utf8               Lext/mods/gameserver/model/location/Point2D;
   #98 = Utf8               end
   #99 = Utf8               getAdjustedIntersectionPoint
  #100 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;D)Lext/mods/gameserver/model/location/Point2D;
  #101 = Utf8               ratio
  #102 = Utf8               intersection
  #103 = Utf8               x
  #104 = Utf8               y
  #105 = Utf8               x3
  #106 = Utf8               y3
  #107 = Utf8               x4
  #108 = Utf8               y4
  #109 = Utf8               distance
  #110 = Utf8               (II)D
  #111 = Utf8               x2
  #112 = Utf8               y2
  #113 = Utf8               getCenterX
  #114 = Utf8               getCenterY
  #115 = Utf8               getPoint
  #116 = Utf8               ()Lext/mods/gameserver/model/location/Point2D;
  #117 = Utf8               ()Ljava/lang/Object;
  #118 = Utf8               Exceptions
  #119 = Class              #120          // java/lang/CloneNotSupportedException
  #120 = Utf8               java/lang/CloneNotSupportedException
  #121 = Utf8               SourceFile
  #122 = Utf8               Line2D.java
{
  public ext.mods.commons.geometry.basic.Line2D(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _p1x:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _p1y:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _p2x:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field _p2y:I
        25: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 9
        line 35: 14
        line 36: 19
        line 37: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0      26     1   p1x   I
            0      26     2   p1y   I
            0      26     3   p2x   I
            0      26     4   p2y   I

  public ext.mods.commons.geometry.basic.Line2D clone();
    descriptor: ()Lext/mods/commons/geometry/basic/Line2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: new           #8                  // class ext/mods/commons/geometry/basic/Line2D
         3: dup
         4: aload_0
         5: getfield      #7                  // Field _p1x:I
         8: aload_0
         9: getfield      #13                 // Field _p1y:I
        12: aload_0
        13: getfield      #16                 // Field _p2x:I
        16: aload_0
        17: getfield      #19                 // Field _p2y:I
        20: invokespecial #22                 // Method "<init>":(IIII)V
        23: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public int getP1x();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _p1x:I
         4: ireturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public int getP1y();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _p1y:I
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public int getP2x();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _p2x:I
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public int getP2y();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _p2y:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public boolean intersectsLine(ext.mods.commons.geometry.basic.Line2D);
    descriptor: (Lext/mods/commons/geometry/basic/Line2D;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=16, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _p2x:I
         4: aload_0
         5: getfield      #7                  // Field _p1x:I
         8: isub
         9: i2d
        10: dstore_2
        11: aload_0
        12: getfield      #19                 // Field _p2y:I
        15: aload_0
        16: getfield      #13                 // Field _p1y:I
        19: isub
        20: i2d
        21: dstore        4
        23: aload_1
        24: getfield      #16                 // Field _p2x:I
        27: aload_1
        28: getfield      #7                  // Field _p1x:I
        31: isub
        32: i2d
        33: dstore        6
        35: aload_1
        36: getfield      #19                 // Field _p2y:I
        39: aload_1
        40: getfield      #13                 // Field _p1y:I
        43: isub
        44: i2d
        45: dstore        8
        47: dload_2
        48: dload         8
        50: dmul
        51: dload         4
        53: dload         6
        55: dmul
        56: dsub
        57: dstore        10
        59: dload         10
        61: dconst_0
        62: dcmpl
        63: ifne          68
        66: iconst_0
        67: ireturn
        68: aload_0
        69: getfield      #13                 // Field _p1y:I
        72: aload_1
        73: getfield      #13                 // Field _p1y:I
        76: isub
        77: i2d
        78: dload         6
        80: dmul
        81: aload_0
        82: getfield      #7                  // Field _p1x:I
        85: aload_1
        86: getfield      #7                  // Field _p1x:I
        89: isub
        90: i2d
        91: dload         8
        93: dmul
        94: dsub
        95: dload         10
        97: ddiv
        98: dstore        12
       100: aload_0
       101: getfield      #13                 // Field _p1y:I
       104: aload_1
       105: getfield      #13                 // Field _p1y:I
       108: isub
       109: i2d
       110: dload_2
       111: dmul
       112: aload_0
       113: getfield      #7                  // Field _p1x:I
       116: aload_1
       117: getfield      #7                  // Field _p1x:I
       120: isub
       121: i2d
       122: dload         4
       124: dmul
       125: dsub
       126: dload         10
       128: ddiv
       129: dstore        14
       131: dload         12
       133: dconst_0
       134: dcmpl
       135: iflt          163
       138: dload         12
       140: dconst_1
       141: dcmpg
       142: ifgt          163
       145: dload         14
       147: dconst_0
       148: dcmpl
       149: iflt          163
       152: dload         14
       154: dconst_1
       155: dcmpg
       156: ifgt          163
       159: iconst_1
       160: goto          164
       163: iconst_0
       164: ireturn
      LineNumberTable:
        line 67: 0
        line 68: 11
        line 69: 23
        line 70: 35
        line 72: 47
        line 74: 59
        line 75: 66
        line 77: 68
        line 78: 100
        line 80: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     165     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0     165     1 other   Lext/mods/commons/geometry/basic/Line2D;
           11     154     2   dx1   D
           23     142     4   dy1   D
           35     130     6   dx2   D
           47     118     8   dy2   D
           59     106    10 delta   D
          100      65    12     t   D
          131      34    14     u   D
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/commons/geometry/basic/Line2D, class ext/mods/commons/geometry/basic/Line2D, double, double, double, double, double ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 94
          locals = [ double, double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.location.Point2D getIntersectionPoint(ext.mods.commons.geometry.basic.Line2D);
    descriptor: (Lext/mods/commons/geometry/basic/Line2D;)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: getfield      #7                  // Field _p1x:I
         5: aload_1
         6: getfield      #13                 // Field _p1y:I
         9: aload_1
        10: getfield      #16                 // Field _p2x:I
        13: aload_1
        14: getfield      #19                 // Field _p2y:I
        17: invokevirtual #25                 // Method getIntersectionPoint:(IIII)Lext/mods/gameserver/model/location/Point2D;
        20: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0      21     1  line   Lext/mods/commons/geometry/basic/Line2D;

  public ext.mods.gameserver.model.location.Point2D getIntersectionPoint(ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #29                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
         5: aload_1
         6: invokevirtual #35                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
         9: aload_2
        10: invokevirtual #29                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        13: aload_2
        14: invokevirtual #35                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        17: invokevirtual #25                 // Method getIntersectionPoint:(IIII)Lext/mods/gameserver/model/location/Point2D;
        20: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0      21     1 start   Lext/mods/gameserver/model/location/Point2D;
            0      21     2   end   Lext/mods/gameserver/model/location/Point2D;

  public ext.mods.gameserver.model.location.Point2D getAdjustedIntersectionPoint(ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.location.Point2D, double);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;D)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #38                 // Method getIntersectionPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;)Lext/mods/gameserver/model/location/Point2D;
         6: astore        5
         8: aload         5
        10: ifnonnull     15
        13: aconst_null
        14: areturn
        15: aload_1
        16: invokevirtual #29                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        19: i2d
        20: dload_3
        21: aload         5
        23: invokevirtual #29                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        26: aload_1
        27: invokevirtual #29                 // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        30: isub
        31: i2d
        32: dmul
        33: dadd
        34: invokestatic  #41                 // Method java/lang/Math.round:(D)J
        37: l2i
        38: istore        6
        40: aload_1
        41: invokevirtual #35                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        44: i2d
        45: dload_3
        46: aload         5
        48: invokevirtual #35                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        51: aload_1
        52: invokevirtual #35                 // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        55: isub
        56: i2d
        57: dmul
        58: dadd
        59: invokestatic  #41                 // Method java/lang/Math.round:(D)J
        62: l2i
        63: istore        7
        65: new           #30                 // class ext/mods/gameserver/model/location/Point2D
        68: dup
        69: iload         6
        71: iload         7
        73: invokespecial #47                 // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        76: areturn
      LineNumberTable:
        line 95: 0
        line 97: 8
        line 98: 13
        line 100: 15
        line 101: 40
        line 103: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0      77     1 start   Lext/mods/gameserver/model/location/Point2D;
            0      77     2   end   Lext/mods/gameserver/model/location/Point2D;
            0      77     3 ratio   D
            8      69     5 intersection   Lext/mods/gameserver/model/location/Point2D;
           40      37     6     x   I
           65      12     7     y   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/location/Point2D ]

  public ext.mods.gameserver.model.location.Point2D getIntersectionPoint(int, int, int, int);
    descriptor: (IIII)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=21, args_size=5
         0: aload_0
         1: getfield      #16                 // Field _p2x:I
         4: aload_0
         5: getfield      #7                  // Field _p1x:I
         8: isub
         9: i2d
        10: dstore        5
        12: aload_0
        13: getfield      #19                 // Field _p2y:I
        16: aload_0
        17: getfield      #13                 // Field _p1y:I
        20: isub
        21: i2d
        22: dstore        7
        24: iload_3
        25: iload_1
        26: isub
        27: i2d
        28: dstore        9
        30: iload         4
        32: iload_2
        33: isub
        34: i2d
        35: dstore        11
        37: dload         5
        39: dload         11
        41: dmul
        42: dload         7
        44: dload         9
        46: dmul
        47: dsub
        48: dstore        13
        50: dload         13
        52: dconst_0
        53: dcmpl
        54: ifne          59
        57: aconst_null
        58: areturn
        59: aload_0
        60: getfield      #13                 // Field _p1y:I
        63: iload_2
        64: isub
        65: i2d
        66: dload         9
        68: dmul
        69: aload_0
        70: getfield      #7                  // Field _p1x:I
        73: iload_1
        74: isub
        75: i2d
        76: dload         11
        78: dmul
        79: dsub
        80: dload         13
        82: ddiv
        83: dstore        15
        85: aload_0
        86: getfield      #13                 // Field _p1y:I
        89: iload_2
        90: isub
        91: i2d
        92: dload         5
        94: dmul
        95: aload_0
        96: getfield      #7                  // Field _p1x:I
        99: iload_1
       100: isub
       101: i2d
       102: dload         7
       104: dmul
       105: dsub
       106: dload         13
       108: ddiv
       109: dstore        17
       111: dload         15
       113: dconst_0
       114: dcmpg
       115: iflt          139
       118: dload         15
       120: dconst_1
       121: dcmpl
       122: ifgt          139
       125: dload         17
       127: dconst_0
       128: dcmpg
       129: iflt          139
       132: dload         17
       134: dconst_1
       135: dcmpl
       136: ifle          141
       139: aconst_null
       140: areturn
       141: aload_0
       142: getfield      #7                  // Field _p1x:I
       145: i2d
       146: dload         15
       148: dload         5
       150: dmul
       151: dadd
       152: d2i
       153: istore        19
       155: aload_0
       156: getfield      #13                 // Field _p1y:I
       159: i2d
       160: dload         15
       162: dload         7
       164: dmul
       165: dadd
       166: d2i
       167: istore        20
       169: new           #30                 // class ext/mods/gameserver/model/location/Point2D
       172: dup
       173: iload         19
       175: iload         20
       177: invokespecial #47                 // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
       180: areturn
      LineNumberTable:
        line 108: 0
        line 109: 12
        line 110: 24
        line 111: 30
        line 113: 37
        line 115: 50
        line 116: 57
        line 118: 59
        line 119: 85
        line 121: 111
        line 122: 139
        line 124: 141
        line 125: 155
        line 127: 169
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     181     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0     181     1    x3   I
            0     181     2    y3   I
            0     181     3    x4   I
            0     181     4    y4   I
           12     169     5   dx1   D
           24     157     7   dy1   D
           30     151     9   dx2   D
           37     144    11   dy2   D
           50     131    13 delta   D
           85      96    15     t   D
          111      70    17     u   D
          155      26    19     x   I
          169      12    20     y   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/commons/geometry/basic/Line2D, int, int, int, int, double, double, double, double, double ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 79
          locals = [ double, double ]
        frame_type = 1 /* same */

  public double distance(int, int);
    descriptor: (II)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: iload_1
         1: aload_0
         2: getfield      #7                  // Field _p1x:I
         5: isub
         6: i2d
         7: ldc2_w        #50                 // double 2.0d
        10: invokestatic  #52                 // Method java/lang/Math.pow:(DD)D
        13: iload_2
        14: aload_0
        15: getfield      #13                 // Field _p1y:I
        18: isub
        19: i2d
        20: ldc2_w        #50                 // double 2.0d
        23: invokestatic  #52                 // Method java/lang/Math.pow:(DD)D
        26: dadd
        27: invokestatic  #56                 // Method java/lang/Math.sqrt:(D)D
        30: dreturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/commons/geometry/basic/Line2D;
            0      31     1    x2   I
            0      31     2    y2   I

  public double getY();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _p2y:I
         4: aload_0
         5: getfield      #13                 // Field _p1y:I
         8: isub
         9: i2d
        10: dreturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public double getX();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _p2x:I
         4: aload_0
         5: getfield      #7                  // Field _p1x:I
         8: isub
         9: i2d
        10: dreturn
      LineNumberTable:
        line 142: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public int getCenterX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _p1x:I
         4: aload_0
         5: getfield      #16                 // Field _p2x:I
         8: iadd
         9: iconst_2
        10: idiv
        11: ireturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public int getCenterY();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _p1y:I
         4: aload_0
         5: getfield      #19                 // Field _p2y:I
         8: iadd
         9: iconst_2
        10: idiv
        11: ireturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public ext.mods.gameserver.model.location.Point2D getPoint();
    descriptor: ()Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: new           #30                 // class ext/mods/gameserver/model/location/Point2D
         3: dup
         4: aload_0
         5: invokevirtual #60                 // Method getX:()D
         8: d2i
         9: aload_0
        10: invokevirtual #63                 // Method getY:()D
        13: d2i
        14: invokespecial #47                 // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        17: areturn
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/geometry/basic/Line2D;

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
    descriptor: ()Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #65                 // Method clone:()Lext/mods/commons/geometry/basic/Line2D;
         4: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/geometry/basic/Line2D;
    Exceptions:
      throws java.lang.CloneNotSupportedException
}
SourceFile: "Line2D.java"
