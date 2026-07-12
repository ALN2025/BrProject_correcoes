// Bytecode for: ext.mods.gameserver.network.GameCrypt
// File: ext\mods\gameserver\network\GameCrypt.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/GameCrypt.class
  Last modified 9 de jul de 2026; size 1651 bytes
  MD5 checksum d6228c299a3b062eea17cf5cec3c8fa2
  Compiled from "GameCrypt.java"
public class ext.mods.gameserver.network.GameCrypt
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/GameCrypt
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/network/GameCrypt._inKey:[B
   #8 = Class              #10            // ext/mods/gameserver/network/GameCrypt
   #9 = NameAndType        #11:#12        // _inKey:[B
  #10 = Utf8               ext/mods/gameserver/network/GameCrypt
  #11 = Utf8               _inKey
  #12 = Utf8               [B
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/GameCrypt._outKey:[B
  #14 = NameAndType        #15:#12        // _outKey:[B
  #15 = Utf8               _outKey
  #16 = Methodref          #17.#18        // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #17 = Class              #19            // java/lang/System
  #18 = NameAndType        #20:#21        // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #19 = Utf8               java/lang/System
  #20 = Utf8               arraycopy
  #21 = Utf8               (Ljava/lang/Object;ILjava/lang/Object;II)V
  #22 = Fieldref           #23.#24        // ext/mods/Config.USE_BLOWFISH_CIPHER:Z
  #23 = Class              #25            // ext/mods/Config
  #24 = NameAndType        #26:#27        // USE_BLOWFISH_CIPHER:Z
  #25 = Utf8               ext/mods/Config
  #26 = Utf8               USE_BLOWFISH_CIPHER
  #27 = Utf8               Z
  #28 = Fieldref           #8.#29         // ext/mods/gameserver/network/GameCrypt._isEnabled:Z
  #29 = NameAndType        #30:#27        // _isEnabled:Z
  #30 = Utf8               _isEnabled
  #31 = Integer            65280
  #32 = Integer            16711680
  #33 = Integer            -16777216
  #34 = Utf8               Code
  #35 = Utf8               LineNumberTable
  #36 = Utf8               LocalVariableTable
  #37 = Utf8               this
  #38 = Utf8               Lext/mods/gameserver/network/GameCrypt;
  #39 = Utf8               setKey
  #40 = Utf8               ([B)V
  #41 = Utf8               key
  #42 = Utf8               decrypt
  #43 = Utf8               ([BII)V
  #44 = Utf8               temp2
  #45 = Utf8               I
  #46 = Utf8               i
  #47 = Utf8               raw
  #48 = Utf8               offset
  #49 = Utf8               size
  #50 = Utf8               temp
  #51 = Utf8               old
  #52 = Utf8               StackMapTable
  #53 = Utf8               encrypt
  #54 = Utf8               SourceFile
  #55 = Utf8               GameCrypt.java
{
  public ext.mods.gameserver.network.GameCrypt();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: bipush        16
         7: newarray       byte
         9: putfield      #7                  // Field _inKey:[B
        12: aload_0
        13: bipush        16
        15: newarray       byte
        17: putfield      #13                 // Field _outKey:[B
        20: return
      LineNumberTable:
        line 22: 0
        line 24: 4
        line 25: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/network/GameCrypt;

  public void setKey(byte[]);
    descriptor: ([B)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: iconst_0
         2: aload_0
         3: getfield      #7                  // Field _inKey:[B
         6: iconst_0
         7: bipush        16
         9: invokestatic  #16                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        12: aload_1
        13: iconst_0
        14: aload_0
        15: getfield      #13                 // Field _outKey:[B
        18: iconst_0
        19: bipush        16
        21: invokestatic  #16                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        24: return
      LineNumberTable:
        line 30: 0
        line 31: 12
        line 32: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/GameCrypt;
            0      25     1   key   [B

  public void decrypt(byte[], int, int);
    descriptor: ([BII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=4
         0: getstatic     #22                 // Field ext/mods/Config.USE_BLOWFISH_CIPHER:Z
         3: ifeq          13
         6: aload_0
         7: getfield      #28                 // Field _isEnabled:Z
        10: ifne          14
        13: return
        14: iconst_0
        15: istore        4
        17: iconst_0
        18: istore        5
        20: iload         5
        22: iload_3
        23: if_icmpge     71
        26: aload_1
        27: iload_2
        28: iload         5
        30: iadd
        31: baload
        32: sipush        255
        35: iand
        36: istore        6
        38: aload_1
        39: iload_2
        40: iload         5
        42: iadd
        43: iload         6
        45: aload_0
        46: getfield      #7                  // Field _inKey:[B
        49: iload         5
        51: bipush        15
        53: iand
        54: baload
        55: ixor
        56: iload         4
        58: ixor
        59: i2b
        60: bastore
        61: iload         6
        63: istore        4
        65: iinc          5, 1
        68: goto          20
        71: aload_0
        72: getfield      #7                  // Field _inKey:[B
        75: bipush        8
        77: baload
        78: sipush        255
        81: iand
        82: istore        5
        84: iload         5
        86: aload_0
        87: getfield      #7                  // Field _inKey:[B
        90: bipush        9
        92: baload
        93: bipush        8
        95: ishl
        96: ldc           #31                 // int 65280
        98: iand
        99: ior
       100: istore        5
       102: iload         5
       104: aload_0
       105: getfield      #7                  // Field _inKey:[B
       108: bipush        10
       110: baload
       111: bipush        16
       113: ishl
       114: ldc           #32                 // int 16711680
       116: iand
       117: ior
       118: istore        5
       120: iload         5
       122: aload_0
       123: getfield      #7                  // Field _inKey:[B
       126: bipush        11
       128: baload
       129: bipush        24
       131: ishl
       132: ldc           #33                 // int -16777216
       134: iand
       135: ior
       136: istore        5
       138: iload         5
       140: iload_3
       141: iadd
       142: istore        5
       144: aload_0
       145: getfield      #7                  // Field _inKey:[B
       148: bipush        8
       150: iload         5
       152: sipush        255
       155: iand
       156: i2b
       157: bastore
       158: aload_0
       159: getfield      #7                  // Field _inKey:[B
       162: bipush        9
       164: iload         5
       166: bipush        8
       168: ishr
       169: sipush        255
       172: iand
       173: i2b
       174: bastore
       175: aload_0
       176: getfield      #7                  // Field _inKey:[B
       179: bipush        10
       181: iload         5
       183: bipush        16
       185: ishr
       186: sipush        255
       189: iand
       190: i2b
       191: bastore
       192: aload_0
       193: getfield      #7                  // Field _inKey:[B
       196: bipush        11
       198: iload         5
       200: bipush        24
       202: ishr
       203: sipush        255
       206: iand
       207: i2b
       208: bastore
       209: return
      LineNumberTable:
        line 36: 0
        line 37: 13
        line 39: 14
        line 40: 17
        line 42: 26
        line 43: 38
        line 44: 61
        line 40: 65
        line 47: 71
        line 48: 84
        line 49: 102
        line 50: 120
        line 52: 138
        line 54: 144
        line 55: 158
        line 56: 175
        line 57: 192
        line 58: 209
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      27     6 temp2   I
           20      51     5     i   I
            0     210     0  this   Lext/mods/gameserver/network/GameCrypt;
            0     210     1   raw   [B
            0     210     2 offset   I
            0     210     3  size   I
           17     193     4  temp   I
           84     126     5   old   I
      StackMapTable: number_of_entries = 4
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 5
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 50

  public void encrypt(byte[], int, int);
    descriptor: ([BII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_0
         1: getfield      #28                 // Field _isEnabled:Z
         4: ifne          15
         7: aload_0
         8: getstatic     #22                 // Field ext/mods/Config.USE_BLOWFISH_CIPHER:Z
        11: putfield      #28                 // Field _isEnabled:Z
        14: return
        15: iconst_0
        16: istore        4
        18: iconst_0
        19: istore        5
        21: iload         5
        23: iload_3
        24: if_icmpge     72
        27: aload_1
        28: iload_2
        29: iload         5
        31: iadd
        32: baload
        33: sipush        255
        36: iand
        37: istore        6
        39: iload         6
        41: aload_0
        42: getfield      #13                 // Field _outKey:[B
        45: iload         5
        47: bipush        15
        49: iand
        50: baload
        51: ixor
        52: iload         4
        54: ixor
        55: istore        4
        57: aload_1
        58: iload_2
        59: iload         5
        61: iadd
        62: iload         4
        64: i2b
        65: bastore
        66: iinc          5, 1
        69: goto          21
        72: aload_0
        73: getfield      #13                 // Field _outKey:[B
        76: bipush        8
        78: baload
        79: sipush        255
        82: iand
        83: istore        5
        85: iload         5
        87: aload_0
        88: getfield      #13                 // Field _outKey:[B
        91: bipush        9
        93: baload
        94: bipush        8
        96: ishl
        97: ldc           #31                 // int 65280
        99: iand
       100: ior
       101: istore        5
       103: iload         5
       105: aload_0
       106: getfield      #13                 // Field _outKey:[B
       109: bipush        10
       111: baload
       112: bipush        16
       114: ishl
       115: ldc           #32                 // int 16711680
       117: iand
       118: ior
       119: istore        5
       121: iload         5
       123: aload_0
       124: getfield      #13                 // Field _outKey:[B
       127: bipush        11
       129: baload
       130: bipush        24
       132: ishl
       133: ldc           #33                 // int -16777216
       135: iand
       136: ior
       137: istore        5
       139: iload         5
       141: iload_3
       142: iadd
       143: istore        5
       145: aload_0
       146: getfield      #13                 // Field _outKey:[B
       149: bipush        8
       151: iload         5
       153: sipush        255
       156: iand
       157: i2b
       158: bastore
       159: aload_0
       160: getfield      #13                 // Field _outKey:[B
       163: bipush        9
       165: iload         5
       167: bipush        8
       169: ishr
       170: sipush        255
       173: iand
       174: i2b
       175: bastore
       176: aload_0
       177: getfield      #13                 // Field _outKey:[B
       180: bipush        10
       182: iload         5
       184: bipush        16
       186: ishr
       187: sipush        255
       190: iand
       191: i2b
       192: bastore
       193: aload_0
       194: getfield      #13                 // Field _outKey:[B
       197: bipush        11
       199: iload         5
       201: bipush        24
       203: ishr
       204: sipush        255
       207: iand
       208: i2b
       209: bastore
       210: return
      LineNumberTable:
        line 62: 0
        line 64: 7
        line 65: 14
        line 68: 15
        line 69: 18
        line 71: 27
        line 72: 39
        line 73: 57
        line 69: 66
        line 76: 72
        line 77: 85
        line 78: 103
        line 79: 121
        line 81: 139
        line 83: 145
        line 84: 159
        line 85: 176
        line 86: 193
        line 87: 210
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      27     6 temp2   I
           21      51     5     i   I
            0     211     0  this   Lext/mods/gameserver/network/GameCrypt;
            0     211     1   raw   [B
            0     211     2 offset   I
            0     211     3  size   I
           18     193     4  temp   I
           85     126     5   old   I
      StackMapTable: number_of_entries = 3
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 5
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 50
}
SourceFile: "GameCrypt.java"
