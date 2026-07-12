// Bytecode for: ext.mods.gameserver.model.zone.form.ZoneNPoly
// File: ext\mods\gameserver\model\zone\form\ZoneNPoly.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/zone/form/ZoneNPoly.class
  Last modified 9 de jul de 2026; size 2544 bytes
  MD5 checksum 3b41dd464ad4a7cd1114ed72157c8ce6
  Compiled from "ZoneNPoly.java"
public class ext.mods.gameserver.model.zone.form.ZoneNPoly extends ext.mods.gameserver.model.zone.ZoneForm
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/zone/form/ZoneNPoly
  super_class: #2                         // ext/mods/gameserver/model/zone/ZoneForm
  interfaces: 0, fields: 4, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/zone/ZoneForm."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/model/zone/ZoneForm
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/model/zone/ZoneForm
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/zone/form/ZoneNPoly._x:[I
   #8 = Class              #10            // ext/mods/gameserver/model/zone/form/ZoneNPoly
   #9 = NameAndType        #11:#12        // _x:[I
  #10 = Utf8               ext/mods/gameserver/model/zone/form/ZoneNPoly
  #11 = Utf8               _x
  #12 = Utf8               [I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/zone/form/ZoneNPoly._y:[I
  #14 = NameAndType        #15:#12        // _y:[I
  #15 = Utf8               _y
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/zone/form/ZoneNPoly._z1:I
  #17 = NameAndType        #18:#19        // _z1:I
  #18 = Utf8               _z1
  #19 = Utf8               I
  #20 = Fieldref           #8.#21         // ext/mods/gameserver/model/zone/form/ZoneNPoly._z2:I
  #21 = NameAndType        #22:#19        // _z2:I
  #22 = Utf8               _z2
  #23 = Methodref          #8.#24         // ext/mods/gameserver/model/zone/form/ZoneNPoly.isInsideZone:(III)Z
  #24 = NameAndType        #25:#26        // isInsideZone:(III)Z
  #25 = Utf8               isInsideZone
  #26 = Utf8               (III)Z
  #27 = Methodref          #8.#28         // ext/mods/gameserver/model/zone/form/ZoneNPoly.lineSegmentsIntersect:(IIIIIIII)Z
  #28 = NameAndType        #29:#30        // lineSegmentsIntersect:(IIIIIIII)Z
  #29 = Utf8               lineSegmentsIntersect
  #30 = Utf8               (IIIIIIII)Z
  #31 = Fieldref           #32.#33        // java/awt/Color.GREEN:Ljava/awt/Color;
  #32 = Class              #34            // java/awt/Color
  #33 = NameAndType        #35:#36        // GREEN:Ljava/awt/Color;
  #34 = Utf8               java/awt/Color
  #35 = Utf8               GREEN
  #36 = Utf8               Ljava/awt/Color;
  #37 = Methodref          #38.#39        // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #38 = Class              #40            // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #39 = NameAndType        #41:#42        // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #40 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #41 = Utf8               addLine
  #42 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #43 = Fieldref           #32.#44        // java/awt/Color.RED:Ljava/awt/Color;
  #44 = NameAndType        #45:#36        // RED:Ljava/awt/Color;
  #45 = Utf8               RED
  #46 = String             #47            //
  #47 = Utf8
  #48 = Fieldref           #32.#49        // java/awt/Color.YELLOW:Ljava/awt/Color;
  #49 = NameAndType        #50:#36        // YELLOW:Ljava/awt/Color;
  #50 = Utf8               YELLOW
  #51 = Utf8               ([I[III)V
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               Lext/mods/gameserver/model/zone/form/ZoneNPoly;
  #57 = Utf8               x
  #58 = Utf8               y
  #59 = Utf8               z1
  #60 = Utf8               z2
  #61 = Utf8               i
  #62 = Utf8               j
  #63 = Utf8               z
  #64 = Utf8               inside
  #65 = Utf8               Z
  #66 = Utf8               StackMapTable
  #67 = Utf8               intersectsRectangle
  #68 = Utf8               (IIII)Z
  #69 = Utf8               tX
  #70 = Utf8               tY
  #71 = Utf8               uX
  #72 = Utf8               uY
  #73 = Utf8               ax1
  #74 = Utf8               ax2
  #75 = Utf8               ay1
  #76 = Utf8               ay2
  #77 = Utf8               getLowZ
  #78 = Utf8               ()I
  #79 = Utf8               getHighZ
  #80 = Utf8               visualizeZone
  #81 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #82 = Utf8               nextIndex
  #83 = Utf8               info
  #84 = Utf8               Ljava/lang/String;
  #85 = Utf8               debug
  #86 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #87 = Utf8               SourceFile
  #88 = Utf8               ZoneNPoly.java
{
  protected final int[] _x;
    descriptor: [I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int[] _y;
    descriptor: [I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  public ext.mods.gameserver.model.zone.form.ZoneNPoly(int[], int[], int, int);
    descriptor: ([I[III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/zone/ZoneForm."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _x:[I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _y:[I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _z1:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field _z2:I
        25: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 9
        line 36: 14
        line 37: 19
        line 38: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/zone/form/ZoneNPoly;
            0      26     1     x   [I
            0      26     2     y   [I
            0      26     3    z1   I
            0      26     4    z2   I

  public boolean isInsideZone(int, int, int);
    descriptor: (III)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=4
         0: iload_3
         1: aload_0
         2: getfield      #16                 // Field _z1:I
         5: if_icmplt     16
         8: iload_3
         9: aload_0
        10: getfield      #20                 // Field _z2:I
        13: if_icmple     18
        16: iconst_0
        17: ireturn
        18: iconst_0
        19: istore        4
        21: iconst_0
        22: istore        5
        24: aload_0
        25: getfield      #7                  // Field _x:[I
        28: arraylength
        29: iconst_1
        30: isub
        31: istore        6
        33: iload         5
        35: aload_0
        36: getfield      #7                  // Field _x:[I
        39: arraylength
        40: if_icmpge     162
        43: aload_0
        44: getfield      #13                 // Field _y:[I
        47: iload         5
        49: iaload
        50: iload_2
        51: if_icmpgt     65
        54: iload_2
        55: aload_0
        56: getfield      #13                 // Field _y:[I
        59: iload         6
        61: iaload
        62: if_icmplt     87
        65: aload_0
        66: getfield      #13                 // Field _y:[I
        69: iload         6
        71: iaload
        72: iload_2
        73: if_icmpgt     152
        76: iload_2
        77: aload_0
        78: getfield      #13                 // Field _y:[I
        81: iload         5
        83: iaload
        84: if_icmpge     152
        87: iload_1
        88: aload_0
        89: getfield      #7                  // Field _x:[I
        92: iload         6
        94: iaload
        95: aload_0
        96: getfield      #7                  // Field _x:[I
        99: iload         5
       101: iaload
       102: isub
       103: iload_2
       104: aload_0
       105: getfield      #13                 // Field _y:[I
       108: iload         5
       110: iaload
       111: isub
       112: imul
       113: aload_0
       114: getfield      #13                 // Field _y:[I
       117: iload         6
       119: iaload
       120: aload_0
       121: getfield      #13                 // Field _y:[I
       124: iload         5
       126: iaload
       127: isub
       128: idiv
       129: aload_0
       130: getfield      #7                  // Field _x:[I
       133: iload         5
       135: iaload
       136: iadd
       137: if_icmpge     152
       140: iload         4
       142: ifne          149
       145: iconst_1
       146: goto          150
       149: iconst_0
       150: istore        4
       152: iload         5
       154: iinc          5, 1
       157: istore        6
       159: goto          33
       162: iload         4
       164: ireturn
      LineNumberTable:
        line 43: 0
        line 44: 16
        line 46: 18
        line 47: 21
        line 49: 43
        line 50: 140
        line 47: 152
        line 52: 162
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24     138     5     i   I
           33     129     6     j   I
            0     165     0  this   Lext/mods/gameserver/model/zone/form/ZoneNPoly;
            0     165     1     x   I
            0     165     2     y   I
            0     165     3     z   I
           21     144     4 inside   Z
      StackMapTable: number_of_entries = 9
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ int, int, int ]
        frame_type = 31 /* same */
        frame_type = 21 /* same */
        frame_type = 61 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 1 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9

  public boolean intersectsRectangle(int, int, int, int);
    descriptor: (IIII)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=10, args_size=5
         0: aload_0
         1: getfield      #7                  // Field _x:[I
         4: iconst_0
         5: iaload
         6: iload_1
         7: if_icmple     43
        10: aload_0
        11: getfield      #7                  // Field _x:[I
        14: iconst_0
        15: iaload
        16: iload_2
        17: if_icmpge     43
        20: aload_0
        21: getfield      #13                 // Field _y:[I
        24: iconst_0
        25: iaload
        26: iload_3
        27: if_icmple     43
        30: aload_0
        31: getfield      #13                 // Field _y:[I
        34: iconst_0
        35: iaload
        36: iload         4
        38: if_icmpge     43
        41: iconst_1
        42: ireturn
        43: aload_0
        44: iload_1
        45: iload_3
        46: aload_0
        47: getfield      #20                 // Field _z2:I
        50: iconst_1
        51: isub
        52: invokevirtual #23                 // Method isInsideZone:(III)Z
        55: ifeq          60
        58: iconst_1
        59: ireturn
        60: iconst_0
        61: istore        9
        63: iload         9
        65: aload_0
        66: getfield      #13                 // Field _y:[I
        69: arraylength
        70: if_icmpge     219
        73: aload_0
        74: getfield      #7                  // Field _x:[I
        77: iload         9
        79: iaload
        80: istore        5
        82: aload_0
        83: getfield      #13                 // Field _y:[I
        86: iload         9
        88: iaload
        89: istore        6
        91: aload_0
        92: getfield      #7                  // Field _x:[I
        95: iload         9
        97: iconst_1
        98: iadd
        99: aload_0
       100: getfield      #7                  // Field _x:[I
       103: arraylength
       104: irem
       105: iaload
       106: istore        7
       108: aload_0
       109: getfield      #13                 // Field _y:[I
       112: iload         9
       114: iconst_1
       115: iadd
       116: aload_0
       117: getfield      #7                  // Field _x:[I
       120: arraylength
       121: irem
       122: iaload
       123: istore        8
       125: aload_0
       126: iload         5
       128: iload         6
       130: iload         7
       132: iload         8
       134: iload_1
       135: iload_3
       136: iload_1
       137: iload         4
       139: invokevirtual #27                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       142: ifeq          147
       145: iconst_1
       146: ireturn
       147: aload_0
       148: iload         5
       150: iload         6
       152: iload         7
       154: iload         8
       156: iload_1
       157: iload_3
       158: iload_2
       159: iload_3
       160: invokevirtual #27                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       163: ifeq          168
       166: iconst_1
       167: ireturn
       168: aload_0
       169: iload         5
       171: iload         6
       173: iload         7
       175: iload         8
       177: iload_2
       178: iload         4
       180: iload_1
       181: iload         4
       183: invokevirtual #27                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       186: ifeq          191
       189: iconst_1
       190: ireturn
       191: aload_0
       192: iload         5
       194: iload         6
       196: iload         7
       198: iload         8
       200: iload_2
       201: iload         4
       203: iload_2
       204: iload_3
       205: invokevirtual #27                 // Method lineSegmentsIntersect:(IIIIIIII)Z
       208: ifeq          213
       211: iconst_1
       212: ireturn
       213: iinc          9, 1
       216: goto          63
       219: iconst_0
       220: ireturn
      LineNumberTable:
        line 63: 0
        line 64: 41
        line 66: 43
        line 67: 58
        line 69: 60
        line 71: 73
        line 72: 82
        line 73: 91
        line 74: 108
        line 76: 125
        line 77: 145
        line 79: 147
        line 80: 166
        line 82: 168
        line 83: 189
        line 85: 191
        line 86: 211
        line 69: 213
        line 89: 219
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           82     137     5    tX   I
           91     128     6    tY   I
          108     111     7    uX   I
          125      94     8    uY   I
           63     156     9     i   I
            0     221     0  this   Lext/mods/gameserver/model/zone/form/ZoneNPoly;
            0     221     1   ax1   I
            0     221     2   ax2   I
            0     221     3   ay1   I
            0     221     4   ay2   I
      StackMapTable: number_of_entries = 8
        frame_type = 43 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/zone/form/ZoneNPoly, int, int, int, int, top, top, top, top, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/model/zone/form/ZoneNPoly, int, int, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 20 /* same */
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/zone/form/ZoneNPoly, int, int, int, int ]
          stack = []

  public int getLowZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _z1:I
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/form/ZoneNPoly;

  public int getHighZ();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _z2:I
         4: ireturn
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/zone/form/ZoneNPoly;

  public void visualizeZone(java.lang.String, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=7, args_size=3
         0: aload_0
         1: getfield      #16                 // Field _z1:I
         4: bipush        32
         6: isub
         7: istore_3
         8: aload_0
         9: getfield      #20                 // Field _z2:I
        12: bipush        32
        14: isub
        15: istore        4
        17: iconst_0
        18: istore        5
        20: iload         5
        22: aload_0
        23: getfield      #7                  // Field _x:[I
        26: arraylength
        27: if_icmpge     176
        30: iload         5
        32: iconst_1
        33: iadd
        34: istore        6
        36: iload         6
        38: aload_0
        39: getfield      #7                  // Field _x:[I
        42: arraylength
        43: if_icmpne     49
        46: iconst_0
        47: istore        6
        49: aload_2
        50: aload_1
        51: getstatic     #31                 // Field java/awt/Color.GREEN:Ljava/awt/Color;
        54: iconst_1
        55: aload_0
        56: getfield      #7                  // Field _x:[I
        59: iload         5
        61: iaload
        62: aload_0
        63: getfield      #13                 // Field _y:[I
        66: iload         5
        68: iaload
        69: iload_3
        70: aload_0
        71: getfield      #7                  // Field _x:[I
        74: iload         6
        76: iaload
        77: aload_0
        78: getfield      #13                 // Field _y:[I
        81: iload         6
        83: iaload
        84: iload_3
        85: invokevirtual #37                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
        88: aload_2
        89: aload_1
        90: getstatic     #43                 // Field java/awt/Color.RED:Ljava/awt/Color;
        93: iconst_1
        94: aload_0
        95: getfield      #7                  // Field _x:[I
        98: iload         5
       100: iaload
       101: aload_0
       102: getfield      #13                 // Field _y:[I
       105: iload         5
       107: iaload
       108: iload         4
       110: aload_0
       111: getfield      #7                  // Field _x:[I
       114: iload         6
       116: iaload
       117: aload_0
       118: getfield      #13                 // Field _y:[I
       121: iload         6
       123: iaload
       124: iload         4
       126: invokevirtual #37                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       129: aload_2
       130: ldc           #46                 // String
       132: getstatic     #48                 // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       135: iconst_1
       136: aload_0
       137: getfield      #7                  // Field _x:[I
       140: iload         5
       142: iaload
       143: aload_0
       144: getfield      #13                 // Field _y:[I
       147: iload         5
       149: iaload
       150: iload_3
       151: aload_0
       152: getfield      #7                  // Field _x:[I
       155: iload         5
       157: iaload
       158: aload_0
       159: getfield      #13                 // Field _y:[I
       162: iload         5
       164: iaload
       165: iload         4
       167: invokevirtual #37                 // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
       170: iinc          5, 1
       173: goto          20
       176: return
      LineNumberTable:
        line 107: 0
        line 108: 8
        line 110: 17
        line 112: 30
        line 114: 36
        line 115: 46
        line 117: 49
        line 118: 88
        line 120: 129
        line 110: 170
        line 122: 176
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36     134     6 nextIndex   I
           20     156     5     i   I
            0     177     0  this   Lext/mods/gameserver/model/zone/form/ZoneNPoly;
            0     177     1  info   Ljava/lang/String;
            0     177     2 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
            8     169     3    z1   I
           17     160     4    z2   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 126
}
SourceFile: "ZoneNPoly.java"
