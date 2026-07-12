// Bytecode for: ext.mods.commons.math.MathUtil
// File: ext\mods\commons\math\MathUtil.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/math/MathUtil.class
  Last modified 9 de jul de 2026; size 3883 bytes
  MD5 checksum eebc2f1a39e5692e6a2443a650b029c2
  Compiled from "MathUtil.java"
public class ext.mods.commons.math.MathUtil
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/commons/math/MathUtil
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 13, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/IllegalStateException
    #8 = Utf8               java/lang/IllegalStateException
    #9 = String             #10           // Utility class
   #10 = Utf8               Utility class
   #11 = Methodref          #7.#12        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = Methodref          #15.#16       // ext/mods/gameserver/model/WorldObject.getX:()I
   #15 = Class              #17           // ext/mods/gameserver/model/WorldObject
   #16 = NameAndType        #18:#19       // getX:()I
   #17 = Utf8               ext/mods/gameserver/model/WorldObject
   #18 = Utf8               getX
   #19 = Utf8               ()I
   #20 = Methodref          #15.#21       // ext/mods/gameserver/model/WorldObject.getY:()I
   #21 = NameAndType        #22:#19       // getY:()I
   #22 = Utf8               getY
   #23 = Methodref          #24.#25       // ext/mods/commons/math/MathUtil.calculateAngleFrom:(IIII)D
   #24 = Class              #26           // ext/mods/commons/math/MathUtil
   #25 = NameAndType        #27:#28       // calculateAngleFrom:(IIII)D
   #26 = Utf8               ext/mods/commons/math/MathUtil
   #27 = Utf8               calculateAngleFrom
   #28 = Utf8               (IIII)D
   #29 = Methodref          #30.#31       // java/lang/Math.atan2:(DD)D
   #30 = Class              #32           // java/lang/Math
   #31 = NameAndType        #33:#34       // atan2:(DD)D
   #32 = Utf8               java/lang/Math
   #33 = Utf8               atan2
   #34 = Utf8               (DD)D
   #35 = Methodref          #30.#36       // java/lang/Math.toDegrees:(D)D
   #36 = NameAndType        #37:#38       // toDegrees:(D)D
   #37 = Utf8               toDegrees
   #38 = Utf8               (D)D
   #39 = Double             360.0d
   #41 = Double             182.04444444444445d
   #43 = Methodref          #24.#44       // ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
   #44 = NameAndType        #45:#46       // convertHeadingToDegree:(I)D
   #45 = Utf8               convertHeadingToDegree
   #46 = Utf8               (I)D
   #47 = Methodref          #24.#48       // ext/mods/commons/math/MathUtil.getNewLocationByDistanceAndDegree:(IIDI)Lext/mods/gameserver/model/location/Point2D;
   #48 = NameAndType        #49:#50       // getNewLocationByDistanceAndDegree:(IIDI)Lext/mods/gameserver/model/location/Point2D;
   #49 = Utf8               getNewLocationByDistanceAndDegree
   #50 = Utf8               (IIDI)Lext/mods/gameserver/model/location/Point2D;
   #51 = Methodref          #30.#52       // java/lang/Math.toRadians:(D)D
   #52 = NameAndType        #53:#38       // toRadians:(D)D
   #53 = Utf8               toRadians
   #54 = Methodref          #30.#55       // java/lang/Math.cos:(D)D
   #55 = NameAndType        #56:#38       // cos:(D)D
   #56 = Utf8               cos
   #57 = Methodref          #30.#58       // java/lang/Math.sin:(D)D
   #58 = NameAndType        #59:#38       // sin:(D)D
   #59 = Utf8               sin
   #60 = Class              #61           // ext/mods/gameserver/model/location/Point2D
   #61 = Utf8               ext/mods/gameserver/model/location/Point2D
   #62 = Methodref          #60.#63       // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
   #63 = NameAndType        #5:#64        // "<init>":(II)V
   #64 = Utf8               (II)V
   #65 = Methodref          #30.#66       // java/lang/Math.round:(D)J
   #66 = NameAndType        #67:#68       // round:(D)J
   #67 = Utf8               round
   #68 = Utf8               (D)J
   #69 = Methodref          #30.#70       // java/lang/Math.round:(F)I
   #70 = NameAndType        #67:#71       // round:(F)I
   #71 = Utf8               (F)I
   #72 = Double             10.0d
   #74 = Methodref          #30.#75       // java/lang/Math.pow:(DD)D
   #75 = NameAndType        #76:#34       // pow:(DD)D
   #76 = Utf8               pow
   #77 = Methodref          #30.#78       // java/lang/Math.sqrt:(D)D
   #78 = NameAndType        #79:#38       // sqrt:(D)D
   #79 = Utf8               sqrt
   #80 = Class              #81           // java/lang/Double
   #81 = Utf8               java/lang/Double
   #82 = Double             1.7976931348623157E308d
   #84 = Methodref          #85.#16       // ext/mods/gameserver/model/actor/Player.getX:()I
   #85 = Class              #86           // ext/mods/gameserver/model/actor/Player
   #86 = Utf8               ext/mods/gameserver/model/actor/Player
   #87 = Methodref          #85.#21       // ext/mods/gameserver/model/actor/Player.getY:()I
   #88 = Methodref          #85.#89       // ext/mods/gameserver/model/actor/Player.getZ:()I
   #89 = NameAndType        #90:#19       // getZ:()I
   #90 = Utf8               getZ
   #91 = Methodref          #92.#16       // ext/mods/gameserver/model/actor/Creature.getX:()I
   #92 = Class              #93           // ext/mods/gameserver/model/actor/Creature
   #93 = Utf8               ext/mods/gameserver/model/actor/Creature
   #94 = Methodref          #92.#21       // ext/mods/gameserver/model/actor/Creature.getY:()I
   #95 = Methodref          #92.#89       // ext/mods/gameserver/model/actor/Creature.getZ:()I
   #96 = Methodref          #24.#97       // ext/mods/commons/math/MathUtil.calculateDistance:(IIIIIIZ)D
   #97 = NameAndType        #98:#99       // calculateDistance:(IIIIIIZ)D
   #98 = Utf8               calculateDistance
   #99 = Utf8               (IIIIIIZ)D
  #100 = Methodref          #101.#16      // ext/mods/gameserver/model/location/Location.getX:()I
  #101 = Class              #102          // ext/mods/gameserver/model/location/Location
  #102 = Utf8               ext/mods/gameserver/model/location/Location
  #103 = Methodref          #101.#21      // ext/mods/gameserver/model/location/Location.getY:()I
  #104 = Methodref          #101.#89      // ext/mods/gameserver/model/location/Location.getZ:()I
  #105 = Class              #106          // "[I"
  #106 = Utf8               [I
  #107 = Fieldref           #24.#108      // ext/mods/commons/math/MathUtil.MATRICE_3X3_LINES:[[I
  #108 = NameAndType        #109:#110     // MATRICE_3X3_LINES:[[I
  #109 = Utf8               MATRICE_3X3_LINES
  #110 = Utf8               [[I
  #111 = Utf8               Code
  #112 = Utf8               LineNumberTable
  #113 = Utf8               LocalVariableTable
  #114 = Utf8               this
  #115 = Utf8               Lext/mods/commons/math/MathUtil;
  #116 = Utf8               countPagesNumber
  #117 = Utf8               (II)I
  #118 = Utf8               objectsSize
  #119 = Utf8               I
  #120 = Utf8               pageSize
  #121 = Utf8               StackMapTable
  #122 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)D
  #123 = Utf8               obj1
  #124 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #125 = Utf8               obj2
  #126 = Utf8               obj1X
  #127 = Utf8               obj1Y
  #128 = Utf8               obj2X
  #129 = Utf8               obj2Y
  #130 = Utf8               angleTarget
  #131 = Utf8               D
  #132 = Utf8               clientHeading
  #133 = Utf8               getNewLocationByDistanceAndHeading
  #134 = Utf8               (IIII)Lext/mods/gameserver/model/location/Point2D;
  #135 = Utf8               x
  #136 = Utf8               y
  #137 = Utf8               heading
  #138 = Utf8               distance
  #139 = Utf8               degree
  #140 = Utf8               radians
  #141 = Utf8               deltaX
  #142 = Utf8               deltaY
  #143 = Utf8               calculateHeadingFrom
  #144 = Utf8               (IIII)I
  #145 = Utf8               roundTo
  #146 = Utf8               (FI)F
  #147 = Utf8               val
  #148 = Utf8               F
  #149 = Utf8               numPlaces
  #150 = Utf8               exponent
  #151 = Utf8               x1
  #152 = Utf8               y1
  #153 = Utf8               z1
  #154 = Utf8               x2
  #155 = Utf8               y2
  #156 = Utf8               z2
  #157 = Utf8               includeZAxis
  #158 = Utf8               Z
  #159 = Utf8               dx
  #160 = Utf8               dy
  #161 = Utf8               dz
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #163 = Utf8               fakePlayer
  #164 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #165 = Utf8               creature
  #166 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #167 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Z)D
  #168 = Utf8               loc
  #169 = Utf8               Lext/mods/gameserver/model/location/Location;
  #170 = Utf8               <clinit>
  #171 = Utf8               SourceFile
  #172 = Utf8               MathUtil.java
{
  public static final int[][] MATRICE_3X3_LINES;
    descriptor: [[I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static int countPagesNumber(int, int);
    descriptor: (II)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_0
         1: iload_1
         2: idiv
         3: iload_0
         4: iload_1
         5: irem
         6: ifne          13
         9: iconst_0
        10: goto          14
        13: iconst_1
        14: iadd
        15: ireturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0 objectsSize   I
            0      16     1 pageSize   I
      StackMapTable: number_of_entries = 2
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ int, int ]
          stack = [ int, int ]

  public static double calculateAngleFrom(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #14                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
         4: aload_0
         5: invokevirtual #20                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
         8: aload_1
         9: invokevirtual #14                 // Method ext/mods/gameserver/model/WorldObject.getX:()I
        12: aload_1
        13: invokevirtual #20                 // Method ext/mods/gameserver/model/WorldObject.getY:()I
        16: invokestatic  #23                 // Method calculateAngleFrom:(IIII)D
        19: dreturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  obj1   Lext/mods/gameserver/model/WorldObject;
            0      20     1  obj2   Lext/mods/gameserver/model/WorldObject;

  public static final double calculateAngleFrom(int, int, int, int);
    descriptor: (IIII)D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=6, args_size=4
         0: iload_3
         1: iload_1
         2: isub
         3: i2d
         4: iload_2
         5: iload_0
         6: isub
         7: i2d
         8: invokestatic  #29                 // Method java/lang/Math.atan2:(DD)D
        11: invokestatic  #35                 // Method java/lang/Math.toDegrees:(D)D
        14: dstore        4
        16: dload         4
        18: dconst_0
        19: dcmpg
        20: ifge          31
        23: dload         4
        25: ldc2_w        #39                 // double 360.0d
        28: dadd
        29: dstore        4
        31: dload         4
        33: dreturn
      LineNumberTable:
        line 112: 0
        line 113: 16
        line 114: 23
        line 116: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0 obj1X   I
            0      34     1 obj1Y   I
            0      34     2 obj2X   I
            0      34     3 obj2Y   I
           16      18     4 angleTarget   D
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ double ]

  public static final double convertHeadingToDegree(int);
    descriptor: (I)D
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: iload_0
         1: i2d
         2: ldc2_w        #41                 // double 182.04444444444445d
         5: ddiv
         6: dreturn
      LineNumberTable:
        line 128: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 clientHeading   I

  public static final ext.mods.gameserver.model.location.Point2D getNewLocationByDistanceAndHeading(int, int, int, int);
    descriptor: (IIII)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=4
         0: iload_0
         1: iload_1
         2: iload_2
         3: invokestatic  #43                 // Method convertHeadingToDegree:(I)D
         6: iload_3
         7: invokestatic  #47                 // Method getNewLocationByDistanceAndDegree:(IIDI)Lext/mods/gameserver/model/location/Point2D;
        10: areturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0     x   I
            0      11     1     y   I
            0      11     2 heading   I
            0      11     3 distance   I

  public static final ext.mods.gameserver.model.location.Point2D getNewLocationByDistanceAndDegree(int, int, double, int);
    descriptor: (IIDI)Lext/mods/gameserver/model/location/Point2D;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=5, locals=9, args_size=4
         0: dload_2
         1: invokestatic  #51                 // Method java/lang/Math.toRadians:(D)D
         4: dstore        5
         6: iload         4
         8: i2d
         9: dload         5
        11: invokestatic  #54                 // Method java/lang/Math.cos:(D)D
        14: dmul
        15: d2i
        16: istore        7
        18: iload         4
        20: i2d
        21: dload         5
        23: invokestatic  #57                 // Method java/lang/Math.sin:(D)D
        26: dmul
        27: d2i
        28: istore        8
        30: new           #60                 // class ext/mods/gameserver/model/location/Point2D
        33: dup
        34: iload_0
        35: iload         7
        37: iadd
        38: iload_1
        39: iload         8
        41: iadd
        42: invokespecial #62                 // Method ext/mods/gameserver/model/location/Point2D."<init>":(II)V
        45: areturn
      LineNumberTable:
        line 158: 0
        line 159: 6
        line 160: 18
        line 162: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0     x   I
            0      46     1     y   I
            0      46     2 degree   D
            0      46     4 distance   I
            6      40     5 radians   D
           18      28     7 deltaX   I
           30      16     8 deltaY   I

  public static final int calculateHeadingFrom(int, int, int, int);
    descriptor: (IIII)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=6, args_size=4
         0: iload_3
         1: iload_1
         2: isub
         3: i2d
         4: iload_2
         5: iload_0
         6: isub
         7: i2d
         8: invokestatic  #29                 // Method java/lang/Math.atan2:(DD)D
        11: invokestatic  #35                 // Method java/lang/Math.toDegrees:(D)D
        14: dstore        4
        16: dload         4
        18: dconst_0
        19: dcmpg
        20: ifge          31
        23: dload         4
        25: ldc2_w        #39                 // double 360.0d
        28: dadd
        29: dstore        4
        31: dload         4
        33: ldc2_w        #41                 // double 182.04444444444445d
        36: dmul
        37: invokestatic  #65                 // Method java/lang/Math.round:(D)J
        40: l2i
        41: ireturn
      LineNumberTable:
        line 177: 0
        line 179: 16
        line 180: 23
        line 182: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0 obj1X   I
            0      42     1 obj1Y   I
            0      42     2 obj2X   I
            0      42     3 obj2Y   I
           16      26     4 angleTarget   D
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ double ]

  public static float roundTo(float, int);
    descriptor: (FI)F
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: iload_1
         1: iconst_1
         2: if_icmpgt     11
         5: fload_0
         6: invokestatic  #69                 // Method java/lang/Math.round:(F)I
         9: i2f
        10: freturn
        11: ldc2_w        #72                 // double 10.0d
        14: iload_1
        15: i2d
        16: invokestatic  #74                 // Method java/lang/Math.pow:(DD)D
        19: d2f
        20: fstore_2
        21: fload_0
        22: fload_2
        23: fmul
        24: invokestatic  #69                 // Method java/lang/Math.round:(F)I
        27: i2f
        28: fload_2
        29: fdiv
        30: freturn
      LineNumberTable:
        line 192: 0
        line 193: 5
        line 195: 11
        line 197: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0   val   F
            0      31     1 numPlaces   I
           21      10     2 exponent   F
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public static double calculateDistance(int, int, int, int, int, int, boolean);
    descriptor: (IIIIIIZ)D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=13, args_size=7
         0: iload_0
         1: iload_3
         2: isub
         3: i2d
         4: dstore        7
         6: iload_1
         7: iload         4
         9: isub
        10: i2d
        11: dstore        9
        13: iload         6
        15: ifeq          26
        18: iload_2
        19: iload         5
        21: isub
        22: i2d
        23: goto          27
        26: dconst_0
        27: dstore        11
        29: dload         7
        31: dload         7
        33: dmul
        34: dload         9
        36: dload         9
        38: dmul
        39: dadd
        40: dload         11
        42: dload         11
        44: dmul
        45: dadd
        46: invokestatic  #77                 // Method java/lang/Math.sqrt:(D)D
        49: dreturn
      LineNumberTable:
        line 202: 0
        line 203: 6
        line 204: 13
        line 205: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0    x1   I
            0      50     1    y1   I
            0      50     2    z1   I
            0      50     3    x2   I
            0      50     4    y2   I
            0      50     5    z2   I
            0      50     6 includeZAxis   Z
            6      44     7    dx   D
           13      37     9    dy   D
           29      21    11    dz   D
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ double, double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]

  public static double calculateDistance(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     12
         8: ldc2_w        #82                 // double 1.7976931348623157E308d
        11: dreturn
        12: aload_0
        13: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
        16: aload_0
        17: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
        20: aload_0
        21: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        24: aload_1
        25: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Creature.getX:()I
        28: aload_1
        29: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Creature.getY:()I
        32: aload_1
        33: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
        36: iload_2
        37: invokestatic  #96                 // Method calculateDistance:(IIIIIIZ)D
        40: dreturn
      LineNumberTable:
        line 210: 0
        line 211: 8
        line 213: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0 fakePlayer   Lext/mods/gameserver/model/actor/Player;
            0      41     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      41     2 includeZAxis   Z
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 3 /* same */

  public static double calculateDistance(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.location.Location, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Z)D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=7, locals=3, args_size=3
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     12
         8: ldc2_w        #82                 // double 1.7976931348623157E308d
        11: dreturn
        12: aload_0
        13: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.getX:()I
        16: aload_0
        17: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getY:()I
        20: aload_0
        21: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        24: aload_1
        25: invokevirtual #100                // Method ext/mods/gameserver/model/location/Location.getX:()I
        28: aload_1
        29: invokevirtual #103                // Method ext/mods/gameserver/model/location/Location.getY:()I
        32: aload_1
        33: invokevirtual #104                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        36: iload_2
        37: invokestatic  #96                 // Method calculateDistance:(IIIIIIZ)D
        40: dreturn
      LineNumberTable:
        line 218: 0
        line 220: 8
        line 223: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0 fakePlayer   Lext/mods/gameserver/model/actor/Player;
            0      41     1   loc   Lext/mods/gameserver/model/location/Location;
            0      41     2 includeZAxis   Z
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 3 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: bipush        8
         2: anewarray     #105                // class "[I"
         5: dup
         6: iconst_0
         7: iconst_3
         8: newarray       int
        10: dup
        11: iconst_0
        12: iconst_1
        13: iastore
        14: dup
        15: iconst_1
        16: iconst_2
        17: iastore
        18: dup
        19: iconst_2
        20: iconst_3
        21: iastore
        22: aastore
        23: dup
        24: iconst_1
        25: iconst_3
        26: newarray       int
        28: dup
        29: iconst_0
        30: iconst_4
        31: iastore
        32: dup
        33: iconst_1
        34: iconst_5
        35: iastore
        36: dup
        37: iconst_2
        38: bipush        6
        40: iastore
        41: aastore
        42: dup
        43: iconst_2
        44: iconst_3
        45: newarray       int
        47: dup
        48: iconst_0
        49: bipush        7
        51: iastore
        52: dup
        53: iconst_1
        54: bipush        8
        56: iastore
        57: dup
        58: iconst_2
        59: bipush        9
        61: iastore
        62: aastore
        63: dup
        64: iconst_3
        65: iconst_3
        66: newarray       int
        68: dup
        69: iconst_0
        70: iconst_1
        71: iastore
        72: dup
        73: iconst_1
        74: iconst_4
        75: iastore
        76: dup
        77: iconst_2
        78: bipush        7
        80: iastore
        81: aastore
        82: dup
        83: iconst_4
        84: iconst_3
        85: newarray       int
        87: dup
        88: iconst_0
        89: iconst_2
        90: iastore
        91: dup
        92: iconst_1
        93: iconst_5
        94: iastore
        95: dup
        96: iconst_2
        97: bipush        8
        99: iastore
       100: aastore
       101: dup
       102: iconst_5
       103: iconst_3
       104: newarray       int
       106: dup
       107: iconst_0
       108: iconst_3
       109: iastore
       110: dup
       111: iconst_1
       112: bipush        6
       114: iastore
       115: dup
       116: iconst_2
       117: bipush        9
       119: iastore
       120: aastore
       121: dup
       122: bipush        6
       124: iconst_3
       125: newarray       int
       127: dup
       128: iconst_0
       129: iconst_1
       130: iastore
       131: dup
       132: iconst_1
       133: iconst_5
       134: iastore
       135: dup
       136: iconst_2
       137: bipush        9
       139: iastore
       140: aastore
       141: dup
       142: bipush        7
       144: iconst_3
       145: newarray       int
       147: dup
       148: iconst_0
       149: iconst_3
       150: iastore
       151: dup
       152: iconst_1
       153: iconst_5
       154: iastore
       155: dup
       156: iconst_2
       157: bipush        7
       159: iastore
       160: aastore
       161: putstatic     #107                // Field MATRICE_3X3_LINES:[[I
       164: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "MathUtil.java"
