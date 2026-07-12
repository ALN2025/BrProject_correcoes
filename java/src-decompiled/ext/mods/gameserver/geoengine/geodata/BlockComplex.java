// Bytecode for: ext.mods.gameserver.geoengine.geodata.BlockComplex
// File: ext\mods\gameserver\geoengine\geodata\BlockComplex.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/BlockComplex.class
  Last modified 9 de jul de 2026; size 2401 bytes
  MD5 checksum 03149931e1d44f97a33168a8e7a4ca15
  Compiled from "BlockComplex.java"
public class ext.mods.gameserver.geoengine.geodata.BlockComplex extends ext.mods.gameserver.geoengine.geodata.ABlock
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/geoengine/geodata/BlockComplex
  super_class: #2                         // ext/mods/gameserver/geoengine/geodata/ABlock
  interfaces: 0, fields: 1, methods: 10, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/geoengine/geodata/ABlock
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/geoengine/geodata/BlockComplex._buffer:[B
   #8 = Class              #10            // ext/mods/gameserver/geoengine/geodata/BlockComplex
   #9 = NameAndType        #11:#12        // _buffer:[B
  #10 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockComplex
  #11 = Utf8               _buffer
  #12 = Utf8               [B
  #13 = Class              #14            // ext/mods/gameserver/geoengine/geodata/GeoStructure
  #14 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
  #15 = Methodref          #16.#17        // java/nio/ByteBuffer.getShort:()S
  #16 = Class              #18            // java/nio/ByteBuffer
  #17 = NameAndType        #19:#20        // getShort:()S
  #18 = Utf8               java/nio/ByteBuffer
  #19 = Utf8               getShort
  #20 = Utf8               ()S
  #21 = Integer            65520
  #22 = Utf8               Code
  #23 = Utf8               LineNumberTable
  #24 = Utf8               LocalVariableTable
  #25 = Utf8               this
  #26 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockComplex;
  #27 = Utf8               (Ljava/nio/ByteBuffer;)V
  #28 = Utf8               data
  #29 = Utf8               S
  #30 = Utf8               i
  #31 = Utf8               I
  #32 = Utf8               bb
  #33 = Utf8               Ljava/nio/ByteBuffer;
  #34 = Utf8               StackMapTable
  #35 = Utf8               hasGeoPos
  #36 = Utf8               ()Z
  #37 = Utf8               getHeightNearest
  #38 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #39 = Utf8               geoX
  #40 = Utf8               geoY
  #41 = Utf8               worldZ
  #42 = Utf8               ignore
  #43 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #44 = Utf8               index
  #45 = Utf8               getNsweNearest
  #46 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #47 = Utf8               getIndexNearest
  #48 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #49 = Utf8               getIndexAbove
  #50 = Utf8               height
  #51 = Utf8               getIndexBelow
  #52 = Utf8               getHeight
  #53 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #54 = Utf8               getNswe
  #55 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #56 = Utf8               SourceFile
  #57 = Utf8               BlockComplex.java
{
  protected byte[] _buffer;
    descriptor: [B
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.geoengine.geodata.BlockComplex();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field _buffer:[B
         9: return
      LineNumberTable:
        line 30: 0
        line 31: 4
        line 32: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;

  public ext.mods.gameserver.geoengine.geodata.BlockComplex(java.nio.ByteBuffer);
    descriptor: (Ljava/nio/ByteBuffer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/geoengine/geodata/ABlock."<init>":()V
         4: aload_0
         5: sipush        192
         8: newarray       byte
        10: putfield      #7                  // Field _buffer:[B
        13: iconst_0
        14: istore_2
        15: iload_2
        16: bipush        64
        18: if_icmpge     85
        21: aload_1
        22: invokevirtual #15                 // Method java/nio/ByteBuffer.getShort:()S
        25: istore_3
        26: aload_0
        27: getfield      #7                  // Field _buffer:[B
        30: iload_2
        31: iconst_3
        32: imul
        33: iload_3
        34: bipush        15
        36: iand
        37: i2b
        38: bastore
        39: iload_3
        40: ldc           #21                 // int 65520
        42: iand
        43: i2s
        44: iconst_1
        45: ishr
        46: i2s
        47: istore_3
        48: aload_0
        49: getfield      #7                  // Field _buffer:[B
        52: iload_2
        53: iconst_3
        54: imul
        55: iconst_1
        56: iadd
        57: iload_3
        58: sipush        255
        61: iand
        62: i2b
        63: bastore
        64: aload_0
        65: getfield      #7                  // Field _buffer:[B
        68: iload_2
        69: iconst_3
        70: imul
        71: iconst_2
        72: iadd
        73: iload_3
        74: bipush        8
        76: ishr
        77: i2b
        78: bastore
        79: iinc          2, 1
        82: goto          15
        85: return
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 42: 13
        line 44: 21
        line 46: 26
        line 48: 39
        line 49: 48
        line 50: 64
        line 42: 79
        line 52: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      53     3  data   S
           15      70     2     i   I
            0      86     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      86     1    bb   Ljava/nio/ByteBuffer;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/geoengine/geodata/BlockComplex, class java/nio/ByteBuffer, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 69

  public final boolean hasGeoPos();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;

  public short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=5
         0: iload_1
         1: bipush        8
         3: irem
         4: bipush        8
         6: imul
         7: iload_2
         8: bipush        8
        10: irem
        11: iadd
        12: iconst_3
        13: imul
        14: istore        5
        16: aload_0
        17: getfield      #7                  // Field _buffer:[B
        20: iload         5
        22: iconst_1
        23: iadd
        24: baload
        25: sipush        255
        28: iand
        29: aload_0
        30: getfield      #7                  // Field _buffer:[B
        33: iload         5
        35: iconst_2
        36: iadd
        37: baload
        38: bipush        8
        40: ishl
        41: ior
        42: i2s
        43: ireturn
      LineNumberTable:
        line 63: 0
        line 65: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      44     1  geoX   I
            0      44     2  geoY   I
            0      44     3 worldZ   I
            0      44     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           16      28     5 index   I

  public byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: iload_1
         1: bipush        8
         3: irem
         4: bipush        8
         6: imul
         7: iload_2
         8: bipush        8
        10: irem
        11: iadd
        12: iconst_3
        13: imul
        14: istore        5
        16: aload_0
        17: getfield      #7                  // Field _buffer:[B
        20: iload         5
        22: baload
        23: ireturn
      LineNumberTable:
        line 71: 0
        line 73: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      24     1  geoX   I
            0      24     2  geoY   I
            0      24     3 worldZ   I
            0      24     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           16       8     5 index   I

  public final int getIndexNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=5
         0: iload_1
         1: bipush        8
         3: irem
         4: bipush        8
         6: imul
         7: iload_2
         8: bipush        8
        10: irem
        11: iadd
        12: iconst_3
        13: imul
        14: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      15     1  geoX   I
            0      15     2  geoY   I
            0      15     3 worldZ   I
            0      15     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=5
         0: iload_1
         1: bipush        8
         3: irem
         4: bipush        8
         6: imul
         7: iload_2
         8: bipush        8
        10: irem
        11: iadd
        12: iconst_3
        13: imul
        14: istore        5
        16: aload_0
        17: getfield      #7                  // Field _buffer:[B
        20: iload         5
        22: iconst_1
        23: iadd
        24: baload
        25: sipush        255
        28: iand
        29: aload_0
        30: getfield      #7                  // Field _buffer:[B
        33: iload         5
        35: iconst_2
        36: iadd
        37: baload
        38: bipush        8
        40: ishl
        41: ior
        42: istore        6
        44: iload         6
        46: iload_3
        47: if_icmple     55
        50: iload         5
        52: goto          56
        55: iconst_m1
        56: ireturn
      LineNumberTable:
        line 85: 0
        line 87: 16
        line 89: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      57     1  geoX   I
            0      57     2  geoY   I
            0      57     3 worldZ   I
            0      57     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           16      41     5 index   I
           44      13     6 height   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=5
         0: iload_1
         1: bipush        8
         3: irem
         4: bipush        8
         6: imul
         7: iload_2
         8: bipush        8
        10: irem
        11: iadd
        12: iconst_3
        13: imul
        14: istore        5
        16: aload_0
        17: getfield      #7                  // Field _buffer:[B
        20: iload         5
        22: iconst_1
        23: iadd
        24: baload
        25: sipush        255
        28: iand
        29: aload_0
        30: getfield      #7                  // Field _buffer:[B
        33: iload         5
        35: iconst_2
        36: iadd
        37: baload
        38: bipush        8
        40: ishl
        41: ior
        42: istore        6
        44: iload         6
        46: iload_3
        47: if_icmpge     55
        50: iload         5
        52: goto          56
        55: iconst_m1
        56: ireturn
      LineNumberTable:
        line 95: 0
        line 97: 16
        line 99: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      57     1  geoX   I
            0      57     2  geoY   I
            0      57     3 worldZ   I
            0      57     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           16      41     5 index   I
           44      13     6 height   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _buffer:[B
         4: iload_1
         5: iconst_1
         6: iadd
         7: baload
         8: sipush        255
        11: iand
        12: aload_0
        13: getfield      #7                  // Field _buffer:[B
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
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0      26     1 index   I
            0      26     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;

  public byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _buffer:[B
         4: iload_1
         5: baload
         6: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplex;
            0       7     1 index   I
            0       7     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
}
SourceFile: "BlockComplex.java"
