// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneNPolyZ
// File: ext\mods\gameserver\model\entity\autofarm\zone\form\ZoneNPolyZ.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.class
  Last modified 9 de jul de 2026; size 3971 bytes
  MD5 checksum eb4fa0e8305363eb1b5697e4ef64fcc8
  Compiled from "ZoneNPolyZ.java"
public class ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneNPolyZ extends ext.mods.gameserver.model.zone.form.ZoneNPoly
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  super_class: #2                         // ext/mods/gameserver/model/zone/form/ZoneNPoly
  interfaces: 0, fields: 1, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/form/ZoneNPoly."<init>":([I[III)V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/form/ZoneNPoly
    #3 = NameAndType        #5:#6         // "<init>":([I[III)V
    #4 = Utf8               ext/mods/gameserver/model/zone/form/ZoneNPoly
    #5 = Utf8               <init>
    #6 = Utf8               ([I[III)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ._z:[I
    #8 = Class              #10           // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
    #9 = NameAndType        #11:#12       // _z:[I
   #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
   #11 = Utf8               _z
   #12 = Utf8               [I
   #13 = Methodref          #14.#15       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
   #14 = Class              #16           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #15 = NameAndType        #17:#18       // reset:()V
   #16 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #17 = Utf8               reset
   #18 = Utf8               ()V
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ._x:[I
   #20 = NameAndType        #21:#12       // _x:[I
   #21 = Utf8               _x
   #22 = Methodref          #23.#24       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #23 = Class              #25           // java/lang/String
   #24 = NameAndType        #26:#27       // valueOf:(I)Ljava/lang/String;
   #25 = Utf8               java/lang/String
   #26 = Utf8               valueOf
   #27 = Utf8               (I)Ljava/lang/String;
   #28 = Fieldref           #29.#30       // java/awt/Color.RED:Ljava/awt/Color;
   #29 = Class              #31           // java/awt/Color
   #30 = NameAndType        #32:#33       // RED:Ljava/awt/Color;
   #31 = Utf8               java/awt/Color
   #32 = Utf8               RED
   #33 = Utf8               Ljava/awt/Color;
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ._y:[I
   #35 = NameAndType        #36:#12       // _y:[I
   #36 = Utf8               _y
   #37 = Methodref          #14.#38       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #38 = NameAndType        #39:#40       // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #39 = Utf8               addPoint
   #40 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #41 = String             #42           // ROTA
   #42 = Utf8               ROTA
   #43 = Methodref          #23.#44       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #44 = NameAndType        #45:#46       // contains:(Ljava/lang/CharSequence;)Z
   #45 = Utf8               contains
   #46 = Utf8               (Ljava/lang/CharSequence;)Z
   #47 = Methodref          #14.#48       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #48 = NameAndType        #49:#50       // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #49 = Utf8               addLine
   #50 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.isInsideZone:(III)Z
   #52 = NameAndType        #53:#54       // isInsideZone:(III)Z
   #53 = Utf8               isInsideZone
   #54 = Utf8               (III)Z
   #55 = Methodref          #8.#56        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.lineSegmentsIntersect:(IIIIIIII)Z
   #56 = NameAndType        #57:#58       // lineSegmentsIntersect:(IIIIIIII)Z
   #57 = Utf8               lineSegmentsIntersect
   #58 = Utf8               (IIIIIIII)Z
   #59 = Methodref          #8.#60        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.getLowZ:()I
   #60 = NameAndType        #61:#62       // getLowZ:()I
   #61 = Utf8               getLowZ
   #62 = Utf8               ()I
   #63 = Methodref          #8.#64        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.getHighZ:()I
   #64 = NameAndType        #65:#62       // getHighZ:()I
   #65 = Utf8               getHighZ
   #66 = Class              #67           // ext/mods/gameserver/model/location/Location
   #67 = Utf8               ext/mods/gameserver/model/location/Location
   #68 = Methodref          #66.#69       // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #69 = NameAndType        #5:#70        // "<init>":(III)V
   #70 = Utf8               (III)V
   #71 = Methodref          #72.#73       // java/util/Arrays.stream:([I)Ljava/util/stream/IntStream;
   #72 = Class              #74           // java/util/Arrays
   #73 = NameAndType        #75:#76       // stream:([I)Ljava/util/stream/IntStream;
   #74 = Utf8               java/util/Arrays
   #75 = Utf8               stream
   #76 = Utf8               ([I)Ljava/util/stream/IntStream;
   #77 = InterfaceMethodref #78.#79       // java/util/stream/IntStream.min:()Ljava/util/OptionalInt;
   #78 = Class              #80           // java/util/stream/IntStream
   #79 = NameAndType        #81:#82       // min:()Ljava/util/OptionalInt;
   #80 = Utf8               java/util/stream/IntStream
   #81 = Utf8               min
   #82 = Utf8               ()Ljava/util/OptionalInt;
   #83 = Methodref          #84.#85       // java/util/OptionalInt.getAsInt:()I
   #84 = Class              #86           // java/util/OptionalInt
   #85 = NameAndType        #87:#62       // getAsInt:()I
   #86 = Utf8               java/util/OptionalInt
   #87 = Utf8               getAsInt
   #88 = InterfaceMethodref #78.#89       // java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
   #89 = NameAndType        #90:#82       // max:()Ljava/util/OptionalInt;
   #90 = Utf8               max
   #91 = Methodref          #92.#93       // ext/mods/commons/random/Rnd.nextInt:(I)I
   #92 = Class              #94           // ext/mods/commons/random/Rnd
   #93 = NameAndType        #95:#96       // nextInt:(I)I
   #94 = Utf8               ext/mods/commons/random/Rnd
   #95 = Utf8               nextInt
   #96 = Utf8               (I)I
   #97 = Utf8               ([I[I[III)V
   #98 = Utf8               Code
   #99 = Utf8               LineNumberTable
  #100 = Utf8               LocalVariableTable
  #101 = Utf8               this
  #102 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #103 = Utf8               x
  #104 = Utf8               y
  #105 = Utf8               z
  #106 = Utf8               z1
  #107 = Utf8               I
  #108 = Utf8               z2
  #109 = Utf8               visualizeZone
  #110 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #111 = Utf8               nextIndex
  #112 = Utf8               i
  #113 = Utf8               info
  #114 = Utf8               Ljava/lang/String;
  #115 = Utf8               debug
  #116 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #117 = Utf8               StackMapTable
  #118 = Utf8               intersectsRectangle
  #119 = Utf8               (IIIIII)Z
  #120 = Utf8               tX
  #121 = Utf8               tY
  #122 = Utf8               tZ
  #123 = Utf8               uX
  #124 = Utf8               uY
  #125 = Utf8               uZ
  #126 = Utf8               ax1
  #127 = Utf8               ax2
  #128 = Utf8               ay1
  #129 = Utf8               ay2
  #130 = Utf8               minZ
  #131 = Utf8               maxZ
  #132 = Utf8               intersectsRectangleOnEdge
  #133 = Utf8               (IIII)Z
  #134 = Utf8               x1
  #135 = Utf8               x2
  #136 = Utf8               y1
  #137 = Utf8               y2
  #138 = Utf8               findPointInCenter
  #139 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #140 = Utf8               centerX
  #141 = Utf8               centerY
  #142 = Utf8               centerZ
  #143 = Utf8               getRandomPoint
  #144 = Utf8               randomX
  #145 = Utf8               randomY
  #146 = Utf8               randomZ
  #147 = Utf8               minX
  #148 = Utf8               maxX
  #149 = Utf8               minY
  #150 = Utf8               maxY
  #151 = Utf8               SourceFile
  #152 = Utf8               ZoneNPolyZ.java
{
  public ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneNPolyZ(int[], int[], int[], int, int);
    descriptor: ([I[I[III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=6
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload         4
         5: iload         5
         7: invokespecial #1                  // Method ext/mods/gameserver/model/zone/form/ZoneNPoly."<init>":([I[III)V
        10: aload_0
        11: aload_3
        12: putfield      #7                  // Field _z:[I
        15: return
      LineNumberTable:
        line 35: 0
        line 37: 10
        line 38: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
            0      16     1     x   [I
            0      16     2     y   [I
            0      16     3     z   [I
            0      16     4    z1   I
            0      16     5    z2   I

  public void visualizeZone(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=5, args_size=3
         0: aload_2
         1: invokevirtual #13                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
         4: iconst_0
         5: istore_3
         6: iload_3
         7: aload_0
         8: getfield      #19                 // Field _x:[I
        11: arraylength
        12: if_icmpge     136
        15: iload_3
        16: iconst_1
        17: iadd
        18: istore        4
        20: iload         4
        22: aload_0
        23: getfield      #19                 // Field _x:[I
        26: arraylength
        27: if_icmpne     33
        30: iconst_0
        31: istore        4
        33: aload_2
        34: iload_3
        35: iconst_1
        36: iadd
        37: invokestatic  #22                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        40: getstatic     #28                 // Field java/awt/Color.RED:Ljava/awt/Color;
        43: iconst_1
        44: aload_0
        45: getfield      #19                 // Field _x:[I
        48: iload_3
        49: iaload
        50: aload_0
        51: getfield      #34                 // Field _y:[I
        54: iload_3
        55: iaload
        56: aload_0
        57: getfield      #7                  // Field _z:[I
        60: iload_3
        61: iaload
        62: invokevirtual #37                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
        65: aload_1
        66: ldc           #41                 // String ROTA
        68: invokevirtual #43                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        71: ifeq          82
        74: iload         4
        76: ifne          82
        79: goto          130
        82: aload_2
        83: aload_1
        84: getstatic     #28                 // Field java/awt/Color.RED:Ljava/awt/Color;
        87: iconst_1
        88: aload_0
        89: getfield      #19                 // Field _x:[I
        92: iload_3
        93: iaload
        94: aload_0
        95: getfield      #34                 // Field _y:[I
        98: iload_3
        99: iaload
       100: aload_0
       101: getfield      #7                  // Field _z:[I
       104: iload_3
       105: iaload
       106: aload_0
       107: getfield      #19                 // Field _x:[I
       110: iload         4
       112: iaload
       113: aload_0
       114: getfield      #34                 // Field _y:[I
       117: iload         4
       119: iaload
       120: aload_0
       121: getfield      #7                  // Field _z:[I
       124: iload         4
       126: iaload
       127: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       130: iinc          3, 1
       133: goto          6
       136: return
      LineNumberTable:
        line 43: 0
        line 45: 4
        line 47: 15
        line 49: 20
        line 50: 30
        line 52: 33
        line 54: 65
        line 55: 79
        line 57: 82
        line 45: 130
        line 59: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20     110     4 nextIndex   I
            6     130     3     i   I
            0     137     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
            0     137     1  info   Ljava/lang/String;
            0     137     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 6
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ int ]
        frame_type = 48 /* same */
        frame_type = 250 /* chop */
          offset_delta = 47
        frame_type = 250 /* chop */
          offset_delta = 5

  public boolean intersectsRectangle(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=14, args_size=7
         0: aload_0
         1: getfield      #19                 // Field _x:[I
         4: iconst_0
         5: iaload
         6: iload_1
         7: if_icmple     65
        10: aload_0
        11: getfield      #19                 // Field _x:[I
        14: iconst_0
        15: iaload
        16: iload_2
        17: if_icmpge     65
        20: aload_0
        21: getfield      #34                 // Field _y:[I
        24: iconst_0
        25: iaload
        26: iload_3
        27: if_icmple     65
        30: aload_0
        31: getfield      #34                 // Field _y:[I
        34: iconst_0
        35: iaload
        36: iload         4
        38: if_icmpge     65
        41: aload_0
        42: getfield      #7                  // Field _z:[I
        45: iconst_0
        46: iaload
        47: iload         5
        49: if_icmplt     65
        52: aload_0
        53: getfield      #7                  // Field _z:[I
        56: iconst_0
        57: iaload
        58: iload         6
        60: if_icmpgt     65
        63: iconst_1
        64: ireturn
        65: aload_0
        66: iload_1
        67: iload_3
        68: iload         5
        70: invokevirtual #51                 // Method isInsideZone:(III)Z
        73: ifne          87
        76: aload_0
        77: iload_1
        78: iload_3
        79: iload         6
        81: invokevirtual #51                 // Method isInsideZone:(III)Z
        84: ifeq          89
        87: iconst_1
        88: ireturn
        89: iconst_0
        90: istore        13
        92: iload         13
        94: aload_0
        95: getfield      #34                 // Field _y:[I
        98: arraylength
        99: if_icmpge     302
       102: aload_0
       103: getfield      #19                 // Field _x:[I
       106: iload         13
       108: iaload
       109: istore        7
       111: aload_0
       112: getfield      #34                 // Field _y:[I
       115: iload         13
       117: iaload
       118: istore        8
       120: aload_0
       121: getfield      #7                  // Field _z:[I
       124: iload         13
       126: iaload
       127: istore        9
       129: aload_0
       130: getfield      #19                 // Field _x:[I
       133: iload         13
       135: iconst_1
       136: iadd
       137: aload_0
       138: getfield      #19                 // Field _x:[I
       141: arraylength
       142: irem
       143: iaload
       144: istore        10
       146: aload_0
       147: getfield      #34                 // Field _y:[I
       150: iload         13
       152: iconst_1
       153: iadd
       154: aload_0
       155: getfield      #19                 // Field _x:[I
       158: arraylength
       159: irem
       160: iaload
       161: istore        11
       163: aload_0
       164: getfield      #7                  // Field _z:[I
       167: iload         13
       169: iconst_1
       170: iadd
       171: aload_0
       172: getfield      #19                 // Field _x:[I
       175: arraylength
       176: irem
       177: iaload
       178: istore        12
       180: iload         9
       182: iload         5
       184: if_icmplt     296
       187: iload         9
       189: iload         6
       191: if_icmpgt     296
       194: iload         12
       196: iload         5
       198: if_icmplt     296
       201: iload         12
       203: iload         6
       205: if_icmpgt     296
       208: aload_0
       209: iload         7
       211: iload         8
       213: iload         10
       215: iload         11
       217: iload_1
       218: iload_3
       219: iload_1
       220: iload         4
       222: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       225: ifeq          230
       228: iconst_1
       229: ireturn
       230: aload_0
       231: iload         7
       233: iload         8
       235: iload         10
       237: iload         11
       239: iload_1
       240: iload_3
       241: iload_2
       242: iload_3
       243: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       246: ifeq          251
       249: iconst_1
       250: ireturn
       251: aload_0
       252: iload         7
       254: iload         8
       256: iload         10
       258: iload         11
       260: iload_2
       261: iload         4
       263: iload_1
       264: iload         4
       266: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       269: ifeq          274
       272: iconst_1
       273: ireturn
       274: aload_0
       275: iload         7
       277: iload         8
       279: iload         10
       281: iload         11
       283: iload_2
       284: iload         4
       286: iload_2
       287: iload_3
       288: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       291: ifeq          296
       294: iconst_1
       295: ireturn
       296: iinc          13, 1
       299: goto          92
       302: iconst_0
       303: ireturn
      LineNumberTable:
        line 69: 0
        line 70: 63
        line 72: 65
        line 73: 87
        line 75: 89
        line 77: 102
        line 78: 111
        line 79: 120
        line 81: 129
        line 82: 146
        line 83: 163
        line 85: 180
        line 87: 208
        line 88: 228
        line 90: 230
        line 91: 249
        line 93: 251
        line 94: 272
        line 96: 274
        line 97: 294
        line 75: 296
        line 101: 302
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          111     191     7    tX   I
          120     182     8    tY   I
          129     173     9    tZ   I
          146     156    10    uX   I
          163     139    11    uY   I
          180     122    12    uZ   I
           92     210    13     i   I
            0     304     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
            0     304     1   ax1   I
            0     304     2   ax2   I
            0     304     3   ay1   I
            0     304     4   ay2   I
            0     304     5  minZ   I
            0     304     6  maxZ   I
      StackMapTable: number_of_entries = 9
        frame_type = 251 /* same_frame_extended */
          offset_delta = 65
        frame_type = 21 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int, int, int, top, top, top, top, top, top, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 137
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int, int, int, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 20 /* same */
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int, int, int ]
          stack = []

  public boolean intersectsRectangleOnEdge(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=10, args_size=5
         0: iconst_0
         1: istore        5
         3: iload         5
         5: aload_0
         6: getfield      #34                 // Field _y:[I
         9: arraylength
        10: if_icmpge     159
        13: aload_0
        14: getfield      #19                 // Field _x:[I
        17: iload         5
        19: iaload
        20: istore        6
        22: aload_0
        23: getfield      #34                 // Field _y:[I
        26: iload         5
        28: iaload
        29: istore        7
        31: aload_0
        32: getfield      #19                 // Field _x:[I
        35: iload         5
        37: iconst_1
        38: iadd
        39: aload_0
        40: getfield      #19                 // Field _x:[I
        43: arraylength
        44: irem
        45: iaload
        46: istore        8
        48: aload_0
        49: getfield      #34                 // Field _y:[I
        52: iload         5
        54: iconst_1
        55: iadd
        56: aload_0
        57: getfield      #19                 // Field _x:[I
        60: arraylength
        61: irem
        62: iaload
        63: istore        9
        65: aload_0
        66: iload         6
        68: iload         7
        70: iload         8
        72: iload         9
        74: iload_1
        75: iload_3
        76: iload_1
        77: iload         4
        79: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
        82: ifeq          87
        85: iconst_1
        86: ireturn
        87: aload_0
        88: iload         6
        90: iload         7
        92: iload         8
        94: iload         9
        96: iload_1
        97: iload_3
        98: iload_2
        99: iload_3
       100: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       103: ifeq          108
       106: iconst_1
       107: ireturn
       108: aload_0
       109: iload         6
       111: iload         7
       113: iload         8
       115: iload         9
       117: iload_2
       118: iload         4
       120: iload_1
       121: iload         4
       123: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       126: ifeq          131
       129: iconst_1
       130: ireturn
       131: aload_0
       132: iload         6
       134: iload         7
       136: iload         8
       138: iload         9
       140: iload_2
       141: iload         4
       143: iload_2
       144: iload_3
       145: invokevirtual #55                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       148: ifeq          153
       151: iconst_1
       152: ireturn
       153: iinc          5, 1
       156: goto          3
       159: iconst_0
       160: ireturn
      LineNumberTable:
        line 106: 0
        line 108: 13
        line 109: 22
        line 110: 31
        line 111: 48
        line 113: 65
        line 114: 85
        line 116: 87
        line 117: 106
        line 119: 108
        line 120: 129
        line 122: 131
        line 123: 151
        line 106: 153
        line 126: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22     131     6    tX   I
           31     122     7    tY   I
           48     105     8    uX   I
           65      88     9    uY   I
            3     156     5     i   I
            0     161     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
            0     161     1    x1   I
            0     161     2    x2   I
            0     161     3    y1   I
            0     161     4    y2   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 3
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 20 /* same */
        frame_type = 22 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.model.location.Location findPointInCenter();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=1
         0: iconst_0
         1: istore_1
         2: iconst_0
         3: istore_2
         4: aload_0
         5: invokevirtual #59                 // Method getLowZ:()I
         8: aload_0
         9: invokevirtual #63                 // Method getHighZ:()I
        12: iadd
        13: iconst_2
        14: idiv
        15: istore_3
        16: iconst_0
        17: istore        4
        19: iload         4
        21: aload_0
        22: getfield      #19                 // Field _x:[I
        25: arraylength
        26: if_icmpge     55
        29: iload_1
        30: aload_0
        31: getfield      #19                 // Field _x:[I
        34: iload         4
        36: iaload
        37: iadd
        38: istore_1
        39: iload_2
        40: aload_0
        41: getfield      #34                 // Field _y:[I
        44: iload         4
        46: iaload
        47: iadd
        48: istore_2
        49: iinc          4, 1
        52: goto          19
        55: iload_1
        56: aload_0
        57: getfield      #19                 // Field _x:[I
        60: arraylength
        61: idiv
        62: istore_1
        63: iload_2
        64: aload_0
        65: getfield      #34                 // Field _y:[I
        68: arraylength
        69: idiv
        70: istore_2
        71: new           #66                 // class ext/mods/gameserver/model/location/Location
        74: dup
        75: iload_1
        76: iload_2
        77: iload_3
        78: invokespecial #68                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        81: areturn
      LineNumberTable:
        line 132: 0
        line 133: 2
        line 134: 4
        line 136: 16
        line 138: 29
        line 139: 39
        line 136: 49
        line 141: 55
        line 142: 63
        line 144: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      36     4     i   I
            0      82     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
            2      80     1 centerX   I
            4      78     2 centerY   I
           16      66     3 centerZ   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 35

  public ext.mods.gameserver.model.location.Location getRandomPoint();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _x:[I
         4: invokestatic  #71                 // Method java/util/Arrays.stream:([I)Ljava/util/stream/IntStream;
         7: invokeinterface #77,  1           // InterfaceMethod java/util/stream/IntStream.min:()Ljava/util/OptionalInt;
        12: invokevirtual #83                 // Method java/util/OptionalInt.getAsInt:()I
        15: istore_1
        16: aload_0
        17: getfield      #19                 // Field _x:[I
        20: invokestatic  #71                 // Method java/util/Arrays.stream:([I)Ljava/util/stream/IntStream;
        23: invokeinterface #88,  1           // InterfaceMethod java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
        28: invokevirtual #83                 // Method java/util/OptionalInt.getAsInt:()I
        31: istore_2
        32: aload_0
        33: getfield      #34                 // Field _y:[I
        36: invokestatic  #71                 // Method java/util/Arrays.stream:([I)Ljava/util/stream/IntStream;
        39: invokeinterface #77,  1           // InterfaceMethod java/util/stream/IntStream.min:()Ljava/util/OptionalInt;
        44: invokevirtual #83                 // Method java/util/OptionalInt.getAsInt:()I
        47: istore_3
        48: aload_0
        49: getfield      #34                 // Field _y:[I
        52: invokestatic  #71                 // Method java/util/Arrays.stream:([I)Ljava/util/stream/IntStream;
        55: invokeinterface #88,  1           // InterfaceMethod java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
        60: invokevirtual #83                 // Method java/util/OptionalInt.getAsInt:()I
        63: istore        4
        65: iconst_0
        66: istore        5
        68: iload         5
        70: bipush        20
        72: if_icmpge     154
        75: iload_2
        76: iload_1
        77: isub
        78: iconst_1
        79: iadd
        80: invokestatic  #91                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
        83: iload_1
        84: iadd
        85: istore        6
        87: iload         4
        89: iload_3
        90: isub
        91: iconst_1
        92: iadd
        93: invokestatic  #91                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
        96: iload_3
        97: iadd
        98: istore        7
       100: aload_0
       101: invokevirtual #63                 // Method getHighZ:()I
       104: aload_0
       105: invokevirtual #59                 // Method getLowZ:()I
       108: isub
       109: iconst_1
       110: iadd
       111: invokestatic  #91                 // Method ext/mods/commons/random/Rnd.nextInt:(I)I
       114: aload_0
       115: invokevirtual #59                 // Method getLowZ:()I
       118: iadd
       119: istore        8
       121: aload_0
       122: iload         6
       124: iload         7
       126: iload         8
       128: invokevirtual #51                 // Method isInsideZone:(III)Z
       131: ifeq          148
       134: new           #66                 // class ext/mods/gameserver/model/location/Location
       137: dup
       138: iload         6
       140: iload         7
       142: iload         8
       144: invokespecial #68                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       147: areturn
       148: iinc          5, 1
       151: goto          68
       154: aconst_null
       155: areturn
      LineNumberTable:
        line 149: 0
        line 150: 16
        line 151: 32
        line 152: 48
        line 154: 65
        line 156: 75
        line 157: 87
        line 158: 100
        line 160: 121
        line 161: 134
        line 154: 148
        line 164: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87      61     6 randomX   I
          100      48     7 randomY   I
          121      27     8 randomZ   I
           68      86     5     i   I
            0     156     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
           16     140     1  minX   I
           32     124     2  maxX   I
           48     108     3  minY   I
           65      91     4  maxY   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ, int, int, int, int, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 79
        frame_type = 250 /* chop */
          offset_delta = 5
}
SourceFile: "ZoneNPolyZ.java"
