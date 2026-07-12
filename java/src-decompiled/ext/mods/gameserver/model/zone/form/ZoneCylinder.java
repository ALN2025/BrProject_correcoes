// Bytecode for: ext.mods.gameserver.model.zone.form.ZoneCylinder
// File: ext\mods\gameserver\model\zone\form\ZoneCylinder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/form/ZoneCylinder.class
  Last modified 9 de jul de 2026; size 2649 bytes
  MD5 checksum 0337cb956f59581b4de738b17d265c9e
  Compiled from "ZoneCylinder.java"
public class ext.mods.gameserver.model.zone.form.ZoneCylinder extends ext.mods.gameserver.model.zone.ZoneForm
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/form/ZoneCylinder
  super_class: #2                         // ext/mods/gameserver/model/zone/ZoneForm
  interfaces: 0, fields: 7, methods: 6, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/zone/ZoneForm."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/zone/ZoneForm
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/zone/form/ZoneCylinder._x:I
    #8 = Class              #10           // ext/mods/gameserver/model/zone/form/ZoneCylinder
    #9 = NameAndType        #11:#12       // _x:I
   #10 = Utf8               ext/mods/gameserver/model/zone/form/ZoneCylinder
   #11 = Utf8               _x
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/zone/form/ZoneCylinder._y:I
   #14 = NameAndType        #15:#12       // _y:I
   #15 = Utf8               _y
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/zone/form/ZoneCylinder._z1:I
   #17 = NameAndType        #18:#12       // _z1:I
   #18 = Utf8               _z1
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/zone/form/ZoneCylinder._z2:I
   #20 = NameAndType        #21:#12       // _z2:I
   #21 = Utf8               _z2
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/zone/form/ZoneCylinder._rad:I
   #23 = NameAndType        #24:#12       // _rad:I
   #24 = Utf8               _rad
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/zone/form/ZoneCylinder._radS:I
   #26 = NameAndType        #27:#12       // _radS:I
   #27 = Utf8               _radS
   #28 = Double             2.0d
   #30 = Methodref          #31.#32       // java/lang/Math.pow:(DD)D
   #31 = Class              #33           // java/lang/Math
   #32 = NameAndType        #34:#35       // pow:(DD)D
   #33 = Utf8               java/lang/Math
   #34 = Utf8               pow
   #35 = Utf8               (DD)D
   #36 = Methodref          #31.#37       // java/lang/Math.abs:(I)I
   #37 = NameAndType        #38:#39       // abs:(I)I
   #38 = Utf8               abs
   #39 = Utf8               (I)I
   #40 = Double             6.283185307179586d
   #42 = Double             50.0d
   #44 = Methodref          #31.#45       // java/lang/Math.cos:(D)D
   #45 = NameAndType        #46:#47       // cos:(D)D
   #46 = Utf8               cos
   #47 = Utf8               (D)D
   #48 = Methodref          #31.#49       // java/lang/Math.sin:(D)D
   #49 = NameAndType        #50:#47       // sin:(D)D
   #50 = Utf8               sin
   #51 = Fieldref           #52.#53       // java/awt/Color.GREEN:Ljava/awt/Color;
   #52 = Class              #54           // java/awt/Color
   #53 = NameAndType        #55:#56       // GREEN:Ljava/awt/Color;
   #54 = Utf8               java/awt/Color
   #55 = Utf8               GREEN
   #56 = Utf8               Ljava/awt/Color;
   #57 = Methodref          #58.#59       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #58 = Class              #60           // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #59 = NameAndType        #61:#62       // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #60 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #61 = Utf8               addPoint
   #62 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #63 = Fieldref           #52.#64       // java/awt/Color.RED:Ljava/awt/Color;
   #64 = NameAndType        #65:#56       // RED:Ljava/awt/Color;
   #65 = Utf8               RED
   #66 = String             #67           //
   #67 = Utf8
   #68 = Fieldref           #52.#69       // java/awt/Color.YELLOW:Ljava/awt/Color;
   #69 = NameAndType        #70:#56       // YELLOW:Ljava/awt/Color;
   #70 = Utf8               YELLOW
   #71 = Methodref          #58.#72       // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #72 = NameAndType        #73:#74       // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #73 = Utf8               addLine
   #74 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #75 = Utf8               STEP
   #76 = Utf8               ConstantValue
   #77 = Integer            50
   #78 = Utf8               (IIIII)V
   #79 = Utf8               Code
   #80 = Utf8               LineNumberTable
   #81 = Utf8               LocalVariableTable
   #82 = Utf8               this
   #83 = Utf8               Lext/mods/gameserver/model/zone/form/ZoneCylinder;
   #84 = Utf8               x
   #85 = Utf8               y
   #86 = Utf8               z1
   #87 = Utf8               z2
   #88 = Utf8               rad
   #89 = Utf8               isInsideZone
   #90 = Utf8               (III)Z
   #91 = Utf8               z
   #92 = Utf8               StackMapTable
   #93 = Utf8               intersectsRectangle
   #94 = Utf8               (IIII)Z
   #95 = Utf8               ax1
   #96 = Utf8               ax2
   #97 = Utf8               ay1
   #98 = Utf8               ay2
   #99 = Utf8               getLowZ
  #100 = Utf8               ()I
  #101 = Utf8               getHighZ
  #102 = Utf8               visualizeZone
  #103 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #104 = Utf8               i
  #105 = Utf8               info
  #106 = Utf8               Ljava/lang/String;
  #107 = Utf8               debug
  #108 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #109 = Utf8               count
  #110 = Utf8               angle
  #111 = Utf8               D
  #112 = Class              #113          // java/lang/String
  #113 = Utf8               java/lang/String
  #114 = Utf8               SourceFile
  #115 = Utf8               ZoneCylinder.java
{
  protected static final int STEP;
    descriptor: I
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: int 50

  protected final int _x;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _y;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _z1;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _z2;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _rad;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _radS;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  public ext.mods.gameserver.model.zone.form.ZoneCylinder(int, int, int, int, int);
    descriptor: (IIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/zone/ZoneForm."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _x:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _y:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _z1:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field _z2:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field _rad:I
        31: aload_0
        32: iload         5
        34: iload         5
        36: imul
        37: putfield      #25                 // Field _radS:I
        40: return
      LineNumberTable:
        line 37: 0
        line 38: 4
        line 39: 9
        line 40: 14
        line 41: 19
        line 42: 25
        line 43: 31
        line 44: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/zone/form/ZoneCylinder;
            0      41     1     x   I
            0      41     2     y   I
            0      41     3    z1   I
            0      41     4    z2   I
            0      41     5   rad   I

  public boolean isInsideZone(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: iload_1
         5: isub
         6: i2d
         7: ldc2_w        #28                 // double 2.0d
        10: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
        13: aload_0
        14: getfield      #13                 // Field _y:I
        17: iload_2
        18: isub
        19: i2d
        20: ldc2_w        #28                 // double 2.0d
        23: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
        26: dadd
        27: aload_0
        28: getfield      #25                 // Field _radS:I
        31: i2d
        32: dcmpl
        33: ifgt          52
        36: iload_3
        37: aload_0
        38: getfield      #16                 // Field _z1:I
        41: if_icmplt     52
        44: iload_3
        45: aload_0
        46: getfield      #19                 // Field _z2:I
        49: if_icmple     54
        52: iconst_0
        53: ireturn
        54: iconst_1
        55: ireturn
      LineNumberTable:
        line 49: 0
        line 50: 52
        line 52: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/zone/form/ZoneCylinder;
            0      56     1     x   I
            0      56     2     y   I
            0      56     3     z   I
      StackMapTable: number_of_entries = 2
        frame_type = 52 /* same */
        frame_type = 1 /* same */

  public boolean intersectsRectangle(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=5
         0: aload_0
         1: getfield      #7                  // Field _x:I
         4: iload_1
         5: if_icmple     35
         8: aload_0
         9: getfield      #7                  // Field _x:I
        12: iload_2
        13: if_icmpge     35
        16: aload_0
        17: getfield      #13                 // Field _y:I
        20: iload_3
        21: if_icmple     35
        24: aload_0
        25: getfield      #13                 // Field _y:I
        28: iload         4
        30: if_icmpge     35
        33: iconst_1
        34: ireturn
        35: iload_1
        36: aload_0
        37: getfield      #7                  // Field _x:I
        40: isub
        41: i2d
        42: ldc2_w        #28                 // double 2.0d
        45: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
        48: iload_3
        49: aload_0
        50: getfield      #13                 // Field _y:I
        53: isub
        54: i2d
        55: ldc2_w        #28                 // double 2.0d
        58: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
        61: dadd
        62: aload_0
        63: getfield      #25                 // Field _radS:I
        66: i2d
        67: dcmpg
        68: ifge          73
        71: iconst_1
        72: ireturn
        73: iload_1
        74: aload_0
        75: getfield      #7                  // Field _x:I
        78: isub
        79: i2d
        80: ldc2_w        #28                 // double 2.0d
        83: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
        86: iload         4
        88: aload_0
        89: getfield      #13                 // Field _y:I
        92: isub
        93: i2d
        94: ldc2_w        #28                 // double 2.0d
        97: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
       100: dadd
       101: aload_0
       102: getfield      #25                 // Field _radS:I
       105: i2d
       106: dcmpg
       107: ifge          112
       110: iconst_1
       111: ireturn
       112: iload_2
       113: aload_0
       114: getfield      #7                  // Field _x:I
       117: isub
       118: i2d
       119: ldc2_w        #28                 // double 2.0d
       122: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
       125: iload_3
       126: aload_0
       127: getfield      #13                 // Field _y:I
       130: isub
       131: i2d
       132: ldc2_w        #28                 // double 2.0d
       135: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
       138: dadd
       139: aload_0
       140: getfield      #25                 // Field _radS:I
       143: i2d
       144: dcmpg
       145: ifge          150
       148: iconst_1
       149: ireturn
       150: iload_2
       151: aload_0
       152: getfield      #7                  // Field _x:I
       155: isub
       156: i2d
       157: ldc2_w        #28                 // double 2.0d
       160: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
       163: iload         4
       165: aload_0
       166: getfield      #13                 // Field _y:I
       169: isub
       170: i2d
       171: ldc2_w        #28                 // double 2.0d
       174: invokestatic  #30                 // Method java/lang/Math.pow:(DD)D
       177: dadd
       178: aload_0
       179: getfield      #25                 // Field _radS:I
       182: i2d
       183: dcmpg
       184: ifge          189
       187: iconst_1
       188: ireturn
       189: aload_0
       190: getfield      #7                  // Field _x:I
       193: iload_1
       194: if_icmple     242
       197: aload_0
       198: getfield      #7                  // Field _x:I
       201: iload_2
       202: if_icmpge     242
       205: aload_0
       206: getfield      #13                 // Field _y:I
       209: iload         4
       211: isub
       212: invokestatic  #36                 // Method java/lang/Math.abs:(I)I
       215: aload_0
       216: getfield      #22                 // Field _rad:I
       219: if_icmpge     224
       222: iconst_1
       223: ireturn
       224: aload_0
       225: getfield      #13                 // Field _y:I
       228: iload_3
       229: isub
       230: invokestatic  #36                 // Method java/lang/Math.abs:(I)I
       233: aload_0
       234: getfield      #22                 // Field _rad:I
       237: if_icmpge     242
       240: iconst_1
       241: ireturn
       242: aload_0
       243: getfield      #13                 // Field _y:I
       246: iload_3
       247: if_icmple     295
       250: aload_0
       251: getfield      #13                 // Field _y:I
       254: iload         4
       256: if_icmpge     295
       259: aload_0
       260: getfield      #7                  // Field _x:I
       263: iload_2
       264: isub
       265: invokestatic  #36                 // Method java/lang/Math.abs:(I)I
       268: aload_0
       269: getfield      #22                 // Field _rad:I
       272: if_icmpge     277
       275: iconst_1
       276: ireturn
       277: aload_0
       278: getfield      #7                  // Field _x:I
       281: iload_1
       282: isub
       283: invokestatic  #36                 // Method java/lang/Math.abs:(I)I
       286: aload_0
       287: getfield      #22                 // Field _rad:I
       290: if_icmpge     295
       293: iconst_1
       294: ireturn
       295: iconst_0
       296: ireturn
      LineNumberTable:
        line 58: 0
        line 59: 33
        line 61: 35
        line 62: 71
        line 64: 73
        line 65: 110
        line 67: 112
        line 68: 148
        line 70: 150
        line 71: 187
        line 73: 189
        line 75: 205
        line 76: 222
        line 78: 224
        line 79: 240
        line 82: 242
        line 84: 259
        line 85: 275
        line 87: 277
        line 88: 293
        line 91: 295
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     297     0  this   Lext/mods/gameserver/model/zone/form/ZoneCylinder;
            0     297     1   ax1   I
            0     297     2   ax2   I
            0     297     3   ay1   I
            0     297     4   ay2   I
      StackMapTable: number_of_entries = 9
        frame_type = 35 /* same */
        frame_type = 37 /* same */
        frame_type = 38 /* same */
        frame_type = 37 /* same */
        frame_type = 38 /* same */
        frame_type = 34 /* same */
        frame_type = 17 /* same */
        frame_type = 34 /* same */
        frame_type = 17 /* same */

  public int getLowZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _z1:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/form/ZoneCylinder;

  public int getHighZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _z2:I
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/form/ZoneCylinder;

  public void visualizeZone(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=11, args_size=3
         0: aload_0
         1: getfield      #16                 // Field _z1:I
         4: bipush        32
         6: isub
         7: istore_3
         8: aload_0
         9: getfield      #19                 // Field _z2:I
        12: bipush        32
        14: isub
        15: istore        4
        17: ldc2_w        #40                 // double 6.283185307179586d
        20: aload_0
        21: getfield      #22                 // Field _rad:I
        24: i2d
        25: dmul
        26: ldc2_w        #42                 // double 50.0d
        29: ddiv
        30: d2i
        31: istore        5
        33: ldc2_w        #40                 // double 6.283185307179586d
        36: iload         5
        38: i2d
        39: ddiv
        40: dstore        6
        42: iconst_0
        43: istore        8
        45: iload         8
        47: iload         5
        49: if_icmpge     154
        52: dload         6
        54: iload         8
        56: i2d
        57: dmul
        58: invokestatic  #44                 // Method java/lang/Math.cos:(D)D
        61: aload_0
        62: getfield      #22                 // Field _rad:I
        65: i2d
        66: dmul
        67: d2i
        68: aload_0
        69: getfield      #7                  // Field _x:I
        72: iadd
        73: istore        9
        75: dload         6
        77: iload         8
        79: i2d
        80: dmul
        81: invokestatic  #48                 // Method java/lang/Math.sin:(D)D
        84: aload_0
        85: getfield      #22                 // Field _rad:I
        88: i2d
        89: dmul
        90: d2i
        91: aload_0
        92: getfield      #13                 // Field _y:I
        95: iadd
        96: istore        10
        98: aload_2
        99: aload_1
       100: getstatic     #51                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
       103: iconst_1
       104: iload         9
       106: iload         10
       108: iload_3
       109: invokevirtual #57                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       112: aload_2
       113: aload_1
       114: getstatic     #63                 // Field java/awt/Color.RED:Ljava/awt/Color;
       117: iconst_1
       118: iload         9
       120: iload         10
       122: iload         4
       124: invokevirtual #57                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       127: aload_2
       128: ldc           #66                 // String
       130: getstatic     #68                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       133: iconst_1
       134: iload         9
       136: iload         10
       138: iload_3
       139: iload         9
       141: iload         10
       143: iload         4
       145: invokevirtual #71                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       148: iinc          8, 1
       151: goto          45
       154: return
      LineNumberTable:
        line 109: 0
        line 110: 8
        line 112: 17
        line 113: 33
        line 115: 42
        line 117: 52
        line 118: 75
        line 120: 98
        line 121: 112
        line 123: 127
        line 115: 148
        line 125: 154
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           75      73     9     x   I
           98      50    10     y   I
           45     109     8     i   I
            0     155     0  this   Lext/mods/gameserver/model/zone/form/ZoneCylinder;
            0     155     1  info   Ljava/lang/String;
            0     155     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            8     147     3    z1   I
           17     138     4    z2   I
           33     122     5 count   I
           42     113     6 angle   D
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/zone/form/ZoneCylinder, class java/lang/String, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, double, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 108
}
SourceFile: "ZoneCylinder.java"
