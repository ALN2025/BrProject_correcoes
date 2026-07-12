// Bytecode for: ext.mods.gameserver.geoengine.geodata.BlockMultilayer
// File: ext\mods\gameserver\geoengine\geodata\BlockMultilayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/BlockMultilayer.class
  Last modified 9 de jul de 2026; size 4117 bytes
  MD5 checksum 6a7bf99c7846f1e55908924c36fae919
  Compiled from "BlockMultilayer.java"
public class ext.mods.gameserver.geoengine.geodata.BlockMultilayer extends ext.mods.gameserver.geoengine.geodata.ABlock
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #5                          // ext/mods/gameserver/geoengine/geodata/BlockMultilayer
  super_class: #28                        // ext/mods/gameserver/geoengine/geodata/ABlock
  interfaces: 0, fields: 3, methods: 12, attributes: 1
Constant pool:
    #1 = Class              #2            // java/lang/Byte
    #2 = Utf8               java/lang/Byte
    #3 = Class              #4            // ext/mods/gameserver/geoengine/geodata/GeoStructure
    #4 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
    #5 = Class              #6            // ext/mods/gameserver/geoengine/geodata/BlockMultilayer
    #6 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockMultilayer
    #7 = Methodref          #8.#9         // java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
    #8 = Class              #10           // java/nio/ByteBuffer
    #9 = NameAndType        #11:#12       // allocate:(I)Ljava/nio/ByteBuffer;
   #10 = Utf8               java/nio/ByteBuffer
   #11 = Utf8               allocate
   #12 = Utf8               (I)Ljava/nio/ByteBuffer;
   #13 = Fieldref           #5.#14        // ext/mods/gameserver/geoengine/geodata/BlockMultilayer._temp:Ljava/nio/ByteBuffer;
   #14 = NameAndType        #15:#16       // _temp:Ljava/nio/ByteBuffer;
   #15 = Utf8               _temp
   #16 = Utf8               Ljava/nio/ByteBuffer;
   #17 = Fieldref           #18.#19       // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #18 = Class              #20           // java/nio/ByteOrder
   #19 = NameAndType        #21:#22       // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #20 = Utf8               java/nio/ByteOrder
   #21 = Utf8               LITTLE_ENDIAN
   #22 = Utf8               Ljava/nio/ByteOrder;
   #23 = Methodref          #8.#24        // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #24 = NameAndType        #25:#26       // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #25 = Utf8               order
   #26 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
   #28 = Class              #30           // ext/mods/gameserver/geoengine/geodata/ABlock
   #29 = NameAndType        #31:#32       // "<init>":()V
   #30 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
   #31 = Utf8               <init>
   #32 = Utf8               ()V
   #33 = Fieldref           #5.#34        // ext/mods/gameserver/geoengine/geodata/BlockMultilayer._buffer:[B
   #34 = NameAndType        #35:#36       // _buffer:[B
   #35 = Utf8               _buffer
   #36 = Utf8               [B
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
   #38 = Class              #40           // ext/mods/gameserver/enums/GeoType
   #39 = NameAndType        #41:#42       // L2OFF:Lext/mods/gameserver/enums/GeoType;
   #40 = Utf8               ext/mods/gameserver/enums/GeoType
   #41 = Utf8               L2OFF
   #42 = Utf8               Lext/mods/gameserver/enums/GeoType;
   #43 = Methodref          #8.#44        // java/nio/ByteBuffer.get:()B
   #44 = NameAndType        #45:#46       // get:()B
   #45 = Utf8               get
   #46 = Utf8               ()B
   #47 = Methodref          #8.#48        // java/nio/ByteBuffer.getShort:()S
   #48 = NameAndType        #49:#50       // getShort:()S
   #49 = Utf8               getShort
   #50 = Utf8               ()S
   #51 = Class              #52           // java/lang/RuntimeException
   #52 = Utf8               java/lang/RuntimeException
   #53 = String             #54           // Invalid layer count for MultilayerBlock
   #54 = Utf8               Invalid layer count for MultilayerBlock
   #55 = Methodref          #51.#56       // java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
   #56 = NameAndType        #31:#57       // "<init>":(Ljava/lang/String;)V
   #57 = Utf8               (Ljava/lang/String;)V
   #58 = Methodref          #8.#59        // java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
   #59 = NameAndType        #60:#61       // put:(B)Ljava/nio/ByteBuffer;
   #60 = Utf8               put
   #61 = Utf8               (B)Ljava/nio/ByteBuffer;
   #62 = Integer            65520
   #63 = Methodref          #8.#64        // java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
   #64 = NameAndType        #65:#66       // putShort:(S)Ljava/nio/ByteBuffer;
   #65 = Utf8               putShort
   #66 = Utf8               (S)Ljava/nio/ByteBuffer;
   #67 = Methodref          #8.#68        // java/nio/ByteBuffer.array:()[B
   #68 = NameAndType        #69:#70       // array:()[B
   #69 = Utf8               array
   #70 = Utf8               ()[B
   #71 = Methodref          #8.#72        // java/nio/ByteBuffer.position:()I
   #72 = NameAndType        #73:#74       // position:()I
   #73 = Utf8               position
   #74 = Utf8               ()I
   #75 = Methodref          #76.#77       // java/util/Arrays.copyOf:([BI)[B
   #76 = Class              #78           // java/util/Arrays
   #77 = NameAndType        #79:#80       // copyOf:([BI)[B
   #78 = Utf8               java/util/Arrays
   #79 = Utf8               copyOf
   #80 = Utf8               ([BI)[B
   #81 = Methodref          #8.#82        // java/nio/ByteBuffer.clear:()Ljava/nio/ByteBuffer;
   #82 = NameAndType        #83:#84       // clear:()Ljava/nio/ByteBuffer;
   #83 = Utf8               clear
   #84 = Utf8               ()Ljava/nio/ByteBuffer;
   #85 = Methodref          #5.#86        // ext/mods/gameserver/geoengine/geodata/BlockMultilayer.getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #86 = NameAndType        #87:#88       // getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #87 = Utf8               getIndexNearest
   #88 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #89 = Class              #90           // java/lang/Integer
   #90 = Utf8               java/lang/Integer
   #91 = Integer            2147483647
   #92 = Methodref          #93.#94       // java/lang/Math.abs:(I)I
   #93 = Class              #95           // java/lang/Math
   #94 = NameAndType        #96:#97       // abs:(I)I
   #95 = Utf8               java/lang/Math
   #96 = Utf8               abs
   #97 = Utf8               (I)I
   #98 = Utf8               MAX_LAYERS
   #99 = Utf8               I
  #100 = Utf8               ConstantValue
  #101 = Integer            127
  #102 = Utf8               initialize
  #103 = Utf8               Code
  #104 = Utf8               LineNumberTable
  #105 = Utf8               release
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
  #109 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
  #110 = Utf8               data
  #111 = Utf8               S
  #112 = Utf8               layer
  #113 = Utf8               B
  #114 = Utf8               layers
  #115 = Utf8               cell
  #116 = Utf8               bb
  #117 = Utf8               type
  #118 = Utf8               StackMapTable
  #119 = Utf8               hasGeoPos
  #120 = Utf8               ()Z
  #121 = Utf8               getHeightNearest
  #122 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #123 = Utf8               geoX
  #124 = Utf8               geoY
  #125 = Utf8               worldZ
  #126 = Utf8               ignore
  #127 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #128 = Utf8               index
  #129 = Utf8               getNsweNearest
  #130 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #131 = Utf8               i
  #132 = Utf8               height
  #133 = Utf8               distance
  #134 = Utf8               limit
  #135 = Utf8               getIndexAbove
  #136 = Utf8               getIndexBelow
  #137 = Utf8               getHeight
  #138 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #139 = Utf8               getNswe
  #140 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #141 = Utf8               SourceFile
  #142 = Utf8               BlockMultilayer.java
{
  protected byte[] _buffer;
    descriptor: [B
    flags: (0x0004) ACC_PROTECTED

  public static final void initialize();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: sipush        24384
         3: invokestatic  #7                  // Method java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
         6: putstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
         9: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
        12: getstatic     #17                 // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        15: invokevirtual #23                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        18: pop
        19: return
      LineNumberTable:
        line 37: 0
        line 38: 9
        line 39: 19

  public static final void release();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: aconst_null
         1: putstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
         4: return
      LineNumberTable:
        line 46: 0
        line 47: 4

  protected ext.mods.gameserver.geoengine.geodata.BlockMultilayer();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #27                 // Method ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #33                 // Field _buffer:[B
         9: return
      LineNumberTable:
        line 55: 0
        line 56: 4
        line 57: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;

  public ext.mods.gameserver.geoengine.geodata.BlockMultilayer(java.nio.ByteBuffer, ext.mods.gameserver.enums.GeoType);
    descriptor: (Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=3
         0: aload_0
         1: invokespecial #27                 // Method ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
         4: iconst_0
         5: istore_3
         6: iload_3
         7: bipush        64
         9: if_icmpge     125
        12: aload_2
        13: getstatic     #37                 // Field ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
        16: if_acmpeq     26
        19: aload_1
        20: invokevirtual #43                 // Method java/nio/ByteBuffer.get:()B
        23: goto          31
        26: aload_1
        27: invokevirtual #47                 // Method java/nio/ByteBuffer.getShort:()S
        30: i2b
        31: istore        4
        33: iload         4
        35: ifle          45
        38: iload         4
        40: bipush        127
        42: if_icmple     55
        45: new           #51                 // class java/lang/RuntimeException
        48: dup
        49: ldc           #53                 // String Invalid layer count for MultilayerBlock
        51: invokespecial #55                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
        54: athrow
        55: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
        58: iload         4
        60: invokevirtual #58                 // Method java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        63: pop
        64: iconst_0
        65: istore        5
        67: iload         5
        69: iload         4
        71: if_icmpge     119
        74: aload_1
        75: invokevirtual #47                 // Method java/nio/ByteBuffer.getShort:()S
        78: istore        6
        80: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
        83: iload         6
        85: bipush        15
        87: iand
        88: i2b
        89: invokevirtual #58                 // Method java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        92: pop
        93: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
        96: iload         6
        98: ldc           #62                 // int 65520
       100: iand
       101: i2s
       102: iconst_1
       103: ishr
       104: i2s
       105: invokevirtual #63                 // Method java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
       108: pop
       109: iload         5
       111: iconst_1
       112: iadd
       113: i2b
       114: istore        5
       116: goto          67
       119: iinc          3, 1
       122: goto          6
       125: aload_0
       126: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
       129: invokevirtual #67                 // Method java/nio/ByteBuffer.array:()[B
       132: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
       135: invokevirtual #71                 // Method java/nio/ByteBuffer.position:()I
       138: invokestatic  #75                 // Method java/util/Arrays.copyOf:([BI)[B
       141: putfield      #33                 // Field _buffer:[B
       144: getstatic     #13                 // Field _temp:Ljava/nio/ByteBuffer;
       147: invokevirtual #81                 // Method java/nio/ByteBuffer.clear:()Ljava/nio/ByteBuffer;
       150: pop
       151: return
      LineNumberTable:
        line 65: 0
        line 66: 4
        line 68: 12
        line 70: 33
        line 71: 45
        line 73: 55
        line 75: 64
        line 77: 74
        line 79: 80
        line 80: 93
        line 75: 109
        line 66: 119
        line 84: 125
        line 86: 144
        line 87: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           80      29     6  data   S
           67      52     5 layer   B
           33      86     4 layers   B
            6     119     3  cell   I
            0     152     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0     152     1    bb   Ljava/nio/ByteBuffer;
            0     152     2  type   Lext/mods/gameserver/enums/GeoType;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/geodata/BlockMultilayer, class java/nio/ByteBuffer, class ext/mods/gameserver/enums/GeoType, int ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ int ]
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 51
        frame_type = 250 /* chop */
          offset_delta = 5

  public final boolean hasGeoPos();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;

  public short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: aload         4
         6: invokevirtual #85                 // Method getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
         9: istore        5
        11: aload_0
        12: getfield      #33                 // Field _buffer:[B
        15: iload         5
        17: iconst_1
        18: iadd
        19: baload
        20: sipush        255
        23: iand
        24: aload_0
        25: getfield      #33                 // Field _buffer:[B
        28: iload         5
        30: iconst_2
        31: iadd
        32: baload
        33: bipush        8
        35: ishl
        36: ior
        37: i2s
        38: ireturn
      LineNumberTable:
        line 98: 0
        line 100: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0      39     1  geoX   I
            0      39     2  geoY   I
            0      39     3 worldZ   I
            0      39     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           11      28     5 index   I

  public byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: aload         4
         6: invokevirtual #85                 // Method getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
         9: istore        5
        11: aload_0
        12: getfield      #33                 // Field _buffer:[B
        15: iload         5
        17: baload
        18: ireturn
      LineNumberTable:
        line 106: 0
        line 108: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0      19     1  geoX   I
            0      19     2  geoY   I
            0      19     3 worldZ   I
            0      19     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           11       8     5 index   I

  public int getIndexNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=5
         0: iconst_0
         1: istore        5
         3: iconst_0
         4: istore        6
         6: iload         6
         8: iload_1
         9: bipush        8
        11: irem
        12: bipush        8
        14: imul
        15: iload_2
        16: bipush        8
        18: irem
        19: iadd
        20: if_icmpge     45
        23: iload         5
        25: aload_0
        26: getfield      #33                 // Field _buffer:[B
        29: iload         5
        31: baload
        32: iconst_3
        33: imul
        34: iconst_1
        35: iadd
        36: iadd
        37: istore        5
        39: iinc          6, 1
        42: goto          6
        45: aload_0
        46: getfield      #33                 // Field _buffer:[B
        49: iload         5
        51: iinc          5, 1
        54: baload
        55: istore        6
        57: ldc           #91                 // int 2147483647
        59: istore        7
        61: iload         6
        63: iload         6
        65: iconst_1
        66: isub
        67: i2b
        68: istore        6
        70: ifle          130
        73: aload_0
        74: getfield      #33                 // Field _buffer:[B
        77: iload         5
        79: iconst_1
        80: iadd
        81: baload
        82: sipush        255
        85: iand
        86: aload_0
        87: getfield      #33                 // Field _buffer:[B
        90: iload         5
        92: iconst_2
        93: iadd
        94: baload
        95: bipush        8
        97: ishl
        98: ior
        99: istore        8
       101: iload         8
       103: iload_3
       104: isub
       105: invokestatic  #92                 // Method java/lang/Math.abs:(I)I
       108: istore        9
       110: iload         9
       112: iload         7
       114: if_icmple     120
       117: goto          130
       120: iload         9
       122: istore        7
       124: iinc          5, 3
       127: goto          61
       130: iload         5
       132: iconst_3
       133: isub
       134: ireturn
      LineNumberTable:
        line 114: 0
        line 115: 3
        line 117: 23
        line 115: 39
        line 120: 45
        line 122: 57
        line 123: 61
        line 125: 73
        line 127: 101
        line 128: 110
        line 129: 117
        line 131: 120
        line 132: 124
        line 133: 127
        line 135: 130
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      39     6     i   I
          101      26     8 height   I
          110      17     9 distance   I
            0     135     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0     135     1  geoX   I
            0     135     2  geoY   I
            0     135     3 worldZ   I
            0     135     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            3     132     5 index   I
           57      78     6 layers   B
           61      74     7 limit   I
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 6
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ int, int ]
        frame_type = 253 /* append */
          offset_delta = 58
          locals = [ int, int ]
        frame_type = 249 /* chop */
          offset_delta = 9

  public int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=5
         0: iconst_0
         1: istore        5
         3: iconst_0
         4: istore        6
         6: iload         6
         8: iload_1
         9: bipush        8
        11: irem
        12: bipush        8
        14: imul
        15: iload_2
        16: bipush        8
        18: irem
        19: iadd
        20: if_icmpge     45
        23: iload         5
        25: aload_0
        26: getfield      #33                 // Field _buffer:[B
        29: iload         5
        31: baload
        32: iconst_3
        33: imul
        34: iconst_1
        35: iadd
        36: iadd
        37: istore        5
        39: iinc          6, 1
        42: goto          6
        45: aload_0
        46: getfield      #33                 // Field _buffer:[B
        49: iload         5
        51: iinc          5, 1
        54: baload
        55: istore        6
        57: iload         5
        59: iload         6
        61: iconst_1
        62: isub
        63: iconst_3
        64: imul
        65: iadd
        66: istore        5
        68: iload         6
        70: iload         6
        72: iconst_1
        73: isub
        74: i2b
        75: istore        6
        77: ifle          123
        80: aload_0
        81: getfield      #33                 // Field _buffer:[B
        84: iload         5
        86: iconst_1
        87: iadd
        88: baload
        89: sipush        255
        92: iand
        93: aload_0
        94: getfield      #33                 // Field _buffer:[B
        97: iload         5
        99: iconst_2
       100: iadd
       101: baload
       102: bipush        8
       104: ishl
       105: ior
       106: istore        7
       108: iload         7
       110: iload_3
       111: if_icmple     117
       114: iload         5
       116: ireturn
       117: iinc          5, -3
       120: goto          68
       123: iconst_m1
       124: ireturn
      LineNumberTable:
        line 141: 0
        line 142: 3
        line 144: 23
        line 142: 39
        line 147: 45
        line 148: 57
        line 150: 68
        line 152: 80
        line 154: 108
        line 155: 114
        line 157: 117
        line 158: 120
        line 160: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      39     6     i   I
          108      12     7 height   I
            0     125     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0     125     1  geoX   I
            0     125     2  geoY   I
            0     125     3 worldZ   I
            0     125     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            3     122     5 index   I
           57      68     6 layers   B
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 6
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 5

  public int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=5
         0: iconst_0
         1: istore        5
         3: iconst_0
         4: istore        6
         6: iload         6
         8: iload_1
         9: bipush        8
        11: irem
        12: bipush        8
        14: imul
        15: iload_2
        16: bipush        8
        18: irem
        19: iadd
        20: if_icmpge     45
        23: iload         5
        25: aload_0
        26: getfield      #33                 // Field _buffer:[B
        29: iload         5
        31: baload
        32: iconst_3
        33: imul
        34: iconst_1
        35: iadd
        36: iadd
        37: istore        5
        39: iinc          6, 1
        42: goto          6
        45: aload_0
        46: getfield      #33                 // Field _buffer:[B
        49: iload         5
        51: iinc          5, 1
        54: baload
        55: istore        6
        57: iload         6
        59: iload         6
        61: iconst_1
        62: isub
        63: i2b
        64: istore        6
        66: ifle          112
        69: aload_0
        70: getfield      #33                 // Field _buffer:[B
        73: iload         5
        75: iconst_1
        76: iadd
        77: baload
        78: sipush        255
        81: iand
        82: aload_0
        83: getfield      #33                 // Field _buffer:[B
        86: iload         5
        88: iconst_2
        89: iadd
        90: baload
        91: bipush        8
        93: ishl
        94: ior
        95: istore        7
        97: iload         7
        99: iload_3
       100: if_icmpge     106
       103: iload         5
       105: ireturn
       106: iinc          5, 3
       109: goto          57
       112: iconst_m1
       113: ireturn
      LineNumberTable:
        line 166: 0
        line 167: 3
        line 169: 23
        line 167: 39
        line 172: 45
        line 174: 57
        line 176: 69
        line 178: 97
        line 179: 103
        line 181: 106
        line 182: 109
        line 184: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      39     6     i   I
           97      12     7 height   I
            0     114     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0     114     1  geoX   I
            0     114     2  geoY   I
            0     114     3 worldZ   I
            0     114     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            3     111     5 index   I
           57      57     6 layers   B
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 6
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 38
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 5

  public short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #33                 // Field _buffer:[B
         4: iload_1
         5: iconst_1
         6: iadd
         7: baload
         8: sipush        255
        11: iand
        12: aload_0
        13: getfield      #33                 // Field _buffer:[B
        16: iload_1
        17: iconst_2
        18: iadd
        19: baload
        20: bipush        8
        22: ishl
        23: ior
        24: i2s
        25: ireturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0      26     1 index   I
            0      26     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #33                 // Field _buffer:[B
         4: iload_1
         5: baload
         6: ireturn
      LineNumberTable:
        line 196: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
            0       7     1 index   I
            0       7     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
}
SourceFile: "BlockMultilayer.java"
