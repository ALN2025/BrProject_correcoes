// Bytecode for: ext.mods.gameserver.model.zone.form.ZoneCuboid
// File: ext\mods\gameserver\model\zone\form\ZoneCuboid.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/form/ZoneCuboid.class
  Last modified 9 de jul de 2026; size 2777 bytes
  MD5 checksum 0883a31df8ec310b95ae633c62d87cbf
  Compiled from "ZoneCuboid.java"
public class ext.mods.gameserver.model.zone.form.ZoneCuboid extends ext.mods.gameserver.model.zone.ZoneForm
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/form/ZoneCuboid
  super_class: #2                         // ext/mods/gameserver/model/zone/ZoneForm
  interfaces: 0, fields: 6, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/ZoneForm."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/ZoneForm
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/zone/form/ZoneCuboid._x1:I
   #8 = Class              #10            // ext/mods/gameserver/model/zone/form/ZoneCuboid
   #9 = NameAndType        #11:#12        // _x1:I
  #10 = Utf8               ext/mods/gameserver/model/zone/form/ZoneCuboid
  #11 = Utf8               _x1
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/zone/form/ZoneCuboid._x2:I
  #14 = NameAndType        #15:#12        // _x2:I
  #15 = Utf8               _x2
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/zone/form/ZoneCuboid._y1:I
  #17 = NameAndType        #18:#12        // _y1:I
  #18 = Utf8               _y1
  #19 = Fieldref           #8.#20         // ext/mods/gameserver/model/zone/form/ZoneCuboid._y2:I
  #20 = NameAndType        #21:#12        // _y2:I
  #21 = Utf8               _y2
  #22 = Fieldref           #8.#23         // ext/mods/gameserver/model/zone/form/ZoneCuboid._z1:I
  #23 = NameAndType        #24:#12        // _z1:I
  #24 = Utf8               _z1
  #25 = Fieldref           #8.#26         // ext/mods/gameserver/model/zone/form/ZoneCuboid._z2:I
  #26 = NameAndType        #27:#12        // _z2:I
  #27 = Utf8               _z2
  #28 = Methodref          #8.#29         // ext/mods/gameserver/model/zone/form/ZoneCuboid.isInsideZone:(III)Z
  #29 = NameAndType        #30:#31        // isInsideZone:(III)Z
  #30 = Utf8               isInsideZone
  #31 = Utf8               (III)Z
  #32 = Methodref          #8.#33         // ext/mods/gameserver/model/zone/form/ZoneCuboid.lineSegmentsIntersect:(IIIIIIII)Z
  #33 = NameAndType        #34:#35        // lineSegmentsIntersect:(IIIIIIII)Z
  #34 = Utf8               lineSegmentsIntersect
  #35 = Utf8               (IIIIIIII)Z
  #36 = Fieldref           #37.#38        // java/awt/Color.GREEN:Ljava/awt/Color;
  #37 = Class              #39            // java/awt/Color
  #38 = NameAndType        #40:#41        // GREEN:Ljava/awt/Color;
  #39 = Utf8               java/awt/Color
  #40 = Utf8               GREEN
  #41 = Utf8               Ljava/awt/Color;
  #42 = Methodref          #43.#44        // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addRectangle:(Ljava/lang/String;Ljava/awt/Color;ZIIIII)V
  #43 = Class              #45            // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #44 = NameAndType        #46:#47        // addRectangle:(Ljava/lang/String;Ljava/awt/Color;ZIIIII)V
  #45 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #46 = Utf8               addRectangle
  #47 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIII)V
  #48 = Fieldref           #37.#49        // java/awt/Color.RED:Ljava/awt/Color;
  #49 = NameAndType        #50:#41        // RED:Ljava/awt/Color;
  #50 = Utf8               RED
  #51 = String             #52            //
  #52 = Utf8
  #53 = Fieldref           #37.#54        // java/awt/Color.YELLOW:Ljava/awt/Color;
  #54 = NameAndType        #55:#41        // YELLOW:Ljava/awt/Color;
  #55 = Utf8               YELLOW
  #56 = Methodref          #43.#57        // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #57 = NameAndType        #58:#59        // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #58 = Utf8               addLine
  #59 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #60 = Utf8               (IIIIII)V
  #61 = Utf8               Code
  #62 = Utf8               LineNumberTable
  #63 = Utf8               LocalVariableTable
  #64 = Utf8               this
  #65 = Utf8               Lext/mods/gameserver/model/zone/form/ZoneCuboid;
  #66 = Utf8               x1
  #67 = Utf8               x2
  #68 = Utf8               y1
  #69 = Utf8               y2
  #70 = Utf8               z1
  #71 = Utf8               z2
  #72 = Utf8               StackMapTable
  #73 = Utf8               x
  #74 = Utf8               y
  #75 = Utf8               z
  #76 = Utf8               intersectsRectangle
  #77 = Utf8               (IIII)Z
  #78 = Utf8               ax1
  #79 = Utf8               ax2
  #80 = Utf8               ay1
  #81 = Utf8               ay2
  #82 = Utf8               getLowZ
  #83 = Utf8               ()I
  #84 = Utf8               getHighZ
  #85 = Utf8               visualizeZone
  #86 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #87 = Utf8               info
  #88 = Utf8               Ljava/lang/String;
  #89 = Utf8               debug
  #90 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #91 = Utf8               SourceFile
  #92 = Utf8               ZoneCuboid.java
{
  public ext.mods.gameserver.model.zone.form.ZoneCuboid(int, int, int, int, int, int);
    descriptor: (IIIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=7
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/zone/ZoneForm."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _x1:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _x2:I
        14: aload_0
        15: getfield      #7                  // Field _x1:I
        18: aload_0
        19: getfield      #13                 // Field _x2:I
        22: if_icmple     35
        25: aload_0
        26: iload_2
        27: putfield      #7                  // Field _x1:I
        30: aload_0
        31: iload_1
        32: putfield      #13                 // Field _x2:I
        35: aload_0
        36: iload_3
        37: putfield      #16                 // Field _y1:I
        40: aload_0
        41: iload         4
        43: putfield      #19                 // Field _y2:I
        46: aload_0
        47: getfield      #16                 // Field _y1:I
        50: aload_0
        51: getfield      #19                 // Field _y2:I
        54: if_icmple     68
        57: aload_0
        58: iload         4
        60: putfield      #16                 // Field _y1:I
        63: aload_0
        64: iload_3
        65: putfield      #19                 // Field _y2:I
        68: aload_0
        69: iload         5
        71: putfield      #22                 // Field _z1:I
        74: aload_0
        75: iload         6
        77: putfield      #25                 // Field _z2:I
        80: aload_0
        81: getfield      #22                 // Field _z1:I
        84: aload_0
        85: getfield      #25                 // Field _z2:I
        88: if_icmple     103
        91: aload_0
        92: iload         6
        94: putfield      #22                 // Field _z1:I
        97: aload_0
        98: iload         5
       100: putfield      #25                 // Field _z2:I
       103: return
      LineNumberTable:
        line 35: 0
        line 36: 4
        line 37: 9
        line 39: 14
        line 41: 25
        line 42: 30
        line 45: 35
        line 46: 40
        line 48: 46
        line 50: 57
        line 51: 63
        line 54: 68
        line 55: 74
        line 57: 80
        line 59: 91
        line 60: 97
        line 62: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     104     0  this   Lext/mods/gameserver/model/zone/form/ZoneCuboid;
            0     104     1    x1   I
            0     104     2    x2   I
            0     104     3    y1   I
            0     104     4    y2   I
            0     104     5    z1   I
            0     104     6    z2   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/zone/form/ZoneCuboid, int, int, int, int, int, int ]
          stack = []
        frame_type = 32 /* same */
        frame_type = 34 /* same */

  public boolean isInsideZone(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_1
         1: aload_0
         2: getfield      #7                  // Field _x1:I
         5: if_icmplt     48
         8: iload_1
         9: aload_0
        10: getfield      #13                 // Field _x2:I
        13: if_icmpgt     48
        16: iload_2
        17: aload_0
        18: getfield      #16                 // Field _y1:I
        21: if_icmplt     48
        24: iload_2
        25: aload_0
        26: getfield      #19                 // Field _y2:I
        29: if_icmpgt     48
        32: iload_3
        33: aload_0
        34: getfield      #22                 // Field _z1:I
        37: if_icmplt     48
        40: iload_3
        41: aload_0
        42: getfield      #25                 // Field _z2:I
        45: if_icmple     50
        48: iconst_0
        49: ireturn
        50: iconst_1
        51: ireturn
      LineNumberTable:
        line 67: 0
        line 68: 48
        line 70: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/zone/form/ZoneCuboid;
            0      52     1     x   I
            0      52     2     y   I
            0      52     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 48 /* same */
        frame_type = 1 /* same */

  public boolean intersectsRectangle(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: iload_3
         3: aload_0
         4: getfield      #25                 // Field _z2:I
         7: iconst_1
         8: isub
         9: invokevirtual #28                 // Method isInsideZone:(III)Z
        12: ifeq          17
        15: iconst_1
        16: ireturn
        17: aload_0
        18: iload_1
        19: iload         4
        21: aload_0
        22: getfield      #25                 // Field _z2:I
        25: iconst_1
        26: isub
        27: invokevirtual #28                 // Method isInsideZone:(III)Z
        30: ifeq          35
        33: iconst_1
        34: ireturn
        35: aload_0
        36: iload_2
        37: iload_3
        38: aload_0
        39: getfield      #25                 // Field _z2:I
        42: iconst_1
        43: isub
        44: invokevirtual #28                 // Method isInsideZone:(III)Z
        47: ifeq          52
        50: iconst_1
        51: ireturn
        52: aload_0
        53: iload_2
        54: iload         4
        56: aload_0
        57: getfield      #25                 // Field _z2:I
        60: iconst_1
        61: isub
        62: invokevirtual #28                 // Method isInsideZone:(III)Z
        65: ifeq          70
        68: iconst_1
        69: ireturn
        70: aload_0
        71: getfield      #7                  // Field _x1:I
        74: iload_1
        75: if_icmple     105
        78: aload_0
        79: getfield      #7                  // Field _x1:I
        82: iload_2
        83: if_icmpge     105
        86: aload_0
        87: getfield      #16                 // Field _y1:I
        90: iload_3
        91: if_icmple     105
        94: aload_0
        95: getfield      #16                 // Field _y1:I
        98: iload         4
       100: if_icmpge     105
       103: iconst_1
       104: ireturn
       105: aload_0
       106: getfield      #7                  // Field _x1:I
       109: iload_1
       110: if_icmple     140
       113: aload_0
       114: getfield      #7                  // Field _x1:I
       117: iload_2
       118: if_icmpge     140
       121: aload_0
       122: getfield      #19                 // Field _y2:I
       125: iload_3
       126: if_icmple     140
       129: aload_0
       130: getfield      #19                 // Field _y2:I
       133: iload         4
       135: if_icmpge     140
       138: iconst_1
       139: ireturn
       140: aload_0
       141: getfield      #13                 // Field _x2:I
       144: iload_1
       145: if_icmple     175
       148: aload_0
       149: getfield      #13                 // Field _x2:I
       152: iload_2
       153: if_icmpge     175
       156: aload_0
       157: getfield      #16                 // Field _y1:I
       160: iload_3
       161: if_icmple     175
       164: aload_0
       165: getfield      #16                 // Field _y1:I
       168: iload         4
       170: if_icmpge     175
       173: iconst_1
       174: ireturn
       175: aload_0
       176: getfield      #13                 // Field _x2:I
       179: iload_1
       180: if_icmple     210
       183: aload_0
       184: getfield      #13                 // Field _x2:I
       187: iload_2
       188: if_icmpge     210
       191: aload_0
       192: getfield      #19                 // Field _y2:I
       195: iload_3
       196: if_icmple     210
       199: aload_0
       200: getfield      #19                 // Field _y2:I
       203: iload         4
       205: if_icmpge     210
       208: iconst_1
       209: ireturn
       210: aload_0
       211: aload_0
       212: getfield      #7                  // Field _x1:I
       215: aload_0
       216: getfield      #16                 // Field _y1:I
       219: aload_0
       220: getfield      #13                 // Field _x2:I
       223: aload_0
       224: getfield      #16                 // Field _y1:I
       227: iload_1
       228: iload_3
       229: iload_1
       230: iload         4
       232: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       235: ifeq          240
       238: iconst_1
       239: ireturn
       240: aload_0
       241: aload_0
       242: getfield      #7                  // Field _x1:I
       245: aload_0
       246: getfield      #16                 // Field _y1:I
       249: aload_0
       250: getfield      #13                 // Field _x2:I
       253: aload_0
       254: getfield      #16                 // Field _y1:I
       257: iload_2
       258: iload_3
       259: iload_2
       260: iload         4
       262: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       265: ifeq          270
       268: iconst_1
       269: ireturn
       270: aload_0
       271: aload_0
       272: getfield      #7                  // Field _x1:I
       275: aload_0
       276: getfield      #19                 // Field _y2:I
       279: aload_0
       280: getfield      #13                 // Field _x2:I
       283: aload_0
       284: getfield      #19                 // Field _y2:I
       287: iload_1
       288: iload_3
       289: iload_1
       290: iload         4
       292: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       295: ifeq          300
       298: iconst_1
       299: ireturn
       300: aload_0
       301: aload_0
       302: getfield      #7                  // Field _x1:I
       305: aload_0
       306: getfield      #19                 // Field _y2:I
       309: aload_0
       310: getfield      #13                 // Field _x2:I
       313: aload_0
       314: getfield      #19                 // Field _y2:I
       317: iload_2
       318: iload_3
       319: iload_2
       320: iload         4
       322: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       325: ifeq          330
       328: iconst_1
       329: ireturn
       330: aload_0
       331: aload_0
       332: getfield      #7                  // Field _x1:I
       335: aload_0
       336: getfield      #16                 // Field _y1:I
       339: aload_0
       340: getfield      #7                  // Field _x1:I
       343: aload_0
       344: getfield      #19                 // Field _y2:I
       347: iload_1
       348: iload_3
       349: iload_2
       350: iload_3
       351: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       354: ifeq          359
       357: iconst_1
       358: ireturn
       359: aload_0
       360: aload_0
       361: getfield      #7                  // Field _x1:I
       364: aload_0
       365: getfield      #16                 // Field _y1:I
       368: aload_0
       369: getfield      #7                  // Field _x1:I
       372: aload_0
       373: getfield      #19                 // Field _y2:I
       376: iload_1
       377: iload         4
       379: iload_2
       380: iload         4
       382: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       385: ifeq          390
       388: iconst_1
       389: ireturn
       390: aload_0
       391: aload_0
       392: getfield      #13                 // Field _x2:I
       395: aload_0
       396: getfield      #16                 // Field _y1:I
       399: aload_0
       400: getfield      #13                 // Field _x2:I
       403: aload_0
       404: getfield      #19                 // Field _y2:I
       407: iload_1
       408: iload_3
       409: iload_2
       410: iload_3
       411: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       414: ifeq          419
       417: iconst_1
       418: ireturn
       419: aload_0
       420: aload_0
       421: getfield      #13                 // Field _x2:I
       424: aload_0
       425: getfield      #16                 // Field _y1:I
       428: aload_0
       429: getfield      #13                 // Field _x2:I
       432: aload_0
       433: getfield      #19                 // Field _y2:I
       436: iload_1
       437: iload         4
       439: iload_2
       440: iload         4
       442: invokevirtual #32                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       445: ifeq          450
       448: iconst_1
       449: ireturn
       450: iconst_0
       451: ireturn
      LineNumberTable:
        line 76: 0
        line 77: 15
        line 79: 17
        line 80: 33
        line 82: 35
        line 83: 50
        line 85: 52
        line 86: 68
        line 88: 70
        line 89: 103
        line 91: 105
        line 92: 138
        line 94: 140
        line 95: 173
        line 97: 175
        line 98: 208
        line 100: 210
        line 101: 238
        line 103: 240
        line 104: 268
        line 106: 270
        line 107: 298
        line 109: 300
        line 110: 328
        line 112: 330
        line 113: 357
        line 115: 359
        line 116: 388
        line 118: 390
        line 119: 417
        line 121: 419
        line 122: 448
        line 124: 450
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     452     0  this   Lext/mods/gameserver/model/zone/form/ZoneCuboid;
            0     452     1   ax1   I
            0     452     2   ax2   I
            0     452     3   ay1   I
            0     452     4   ay2   I
      StackMapTable: number_of_entries = 16
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 17 /* same */
        frame_type = 34 /* same */
        frame_type = 34 /* same */
        frame_type = 34 /* same */
        frame_type = 34 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */
        frame_type = 28 /* same */
        frame_type = 30 /* same */
        frame_type = 28 /* same */
        frame_type = 30 /* same */

  public int getLowZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _z1:I
         4: ireturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/form/ZoneCuboid;

  public int getHighZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _z2:I
         4: ireturn
      LineNumberTable:
        line 136: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/form/ZoneCuboid;

  public void visualizeZone(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=5, args_size=3
         0: aload_0
         1: getfield      #22                 // Field _z1:I
         4: bipush        32
         6: isub
         7: istore_3
         8: aload_0
         9: getfield      #25                 // Field _z2:I
        12: bipush        32
        14: isub
        15: istore        4
        17: aload_2
        18: aload_1
        19: getstatic     #36                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        22: iconst_1
        23: aload_0
        24: getfield      #7                  // Field _x1:I
        27: aload_0
        28: getfield      #16                 // Field _y1:I
        31: aload_0
        32: getfield      #7                  // Field _x1:I
        35: aload_0
        36: getfield      #19                 // Field _y2:I
        39: iload_3
        40: invokevirtual #42                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addRectangle:(Ljava/lang/String;Ljava/awt/Color;ZIIIII)V
        43: aload_2
        44: aload_1
        45: getstatic     #48                 // Field java/awt/Color.RED:Ljava/awt/Color;
        48: iconst_1
        49: aload_0
        50: getfield      #7                  // Field _x1:I
        53: aload_0
        54: getfield      #16                 // Field _y1:I
        57: aload_0
        58: getfield      #7                  // Field _x1:I
        61: aload_0
        62: getfield      #19                 // Field _y2:I
        65: iload         4
        67: invokevirtual #42                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addRectangle:(Ljava/lang/String;Ljava/awt/Color;ZIIIII)V
        70: aload_2
        71: ldc           #51                 // String
        73: getstatic     #53                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
        76: iconst_1
        77: aload_0
        78: getfield      #7                  // Field _x1:I
        81: aload_0
        82: getfield      #16                 // Field _y1:I
        85: iload_3
        86: aload_0
        87: getfield      #7                  // Field _x1:I
        90: aload_0
        91: getfield      #16                 // Field _y1:I
        94: iload         4
        96: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        99: aload_2
       100: ldc           #51                 // String
       102: getstatic     #53                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       105: iconst_1
       106: aload_0
       107: getfield      #7                  // Field _x1:I
       110: aload_0
       111: getfield      #19                 // Field _y2:I
       114: iload_3
       115: aload_0
       116: getfield      #7                  // Field _x1:I
       119: aload_0
       120: getfield      #19                 // Field _y2:I
       123: iload         4
       125: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       128: aload_2
       129: ldc           #51                 // String
       131: getstatic     #53                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       134: iconst_1
       135: aload_0
       136: getfield      #13                 // Field _x2:I
       139: aload_0
       140: getfield      #16                 // Field _y1:I
       143: iload_3
       144: aload_0
       145: getfield      #13                 // Field _x2:I
       148: aload_0
       149: getfield      #16                 // Field _y1:I
       152: iload         4
       154: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       157: aload_2
       158: ldc           #51                 // String
       160: getstatic     #53                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       163: iconst_1
       164: aload_0
       165: getfield      #13                 // Field _x2:I
       168: aload_0
       169: getfield      #19                 // Field _y2:I
       172: iload_3
       173: aload_0
       174: getfield      #13                 // Field _x2:I
       177: aload_0
       178: getfield      #19                 // Field _y2:I
       181: iload         4
       183: invokevirtual #56                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       186: return
      LineNumberTable:
        line 142: 0
        line 143: 8
        line 145: 17
        line 146: 43
        line 148: 70
        line 149: 99
        line 150: 128
        line 151: 157
        line 152: 186
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     187     0  this   Lext/mods/gameserver/model/zone/form/ZoneCuboid;
            0     187     1  info   Ljava/lang/String;
            0     187     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            8     179     3    z1   I
           17     170     4    z2   I
}
SourceFile: "ZoneCuboid.java"
