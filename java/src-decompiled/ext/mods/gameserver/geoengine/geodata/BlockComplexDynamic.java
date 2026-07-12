// Bytecode for: ext.mods.gameserver.geoengine.geodata.BlockComplexDynamic
// File: ext\mods\gameserver\geoengine\geodata\BlockComplexDynamic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic.class
  Last modified 9 de jul de 2026; size 5213 bytes
  MD5 checksum daaa59388cb0b3b5fc135d2dcd3b360c
  Compiled from "BlockComplexDynamic.java"
public final class ext.mods.gameserver.geoengine.geodata.BlockComplexDynamic extends ext.mods.gameserver.geoengine.geodata.BlockComplex implements ext.mods.gameserver.geoengine.geodata.IBlockDynamic
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic
  super_class: #2                         // ext/mods/gameserver/geoengine/geodata/BlockComplex
  interfaces: 1, fields: 4, methods: 11, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/geoengine/geodata/BlockComplex."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/geoengine/geodata/BlockComplex
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockComplex
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/geoengine/geodata/BlockFlat._nswe:B
    #8 = Class              #10           // ext/mods/gameserver/geoengine/geodata/BlockFlat
    #9 = NameAndType        #11:#12       // _nswe:B
   #10 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockFlat
   #11 = Utf8               _nswe
   #12 = Utf8               B
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/geoengine/geodata/BlockFlat._height:S
   #14 = NameAndType        #15:#16       // _height:S
   #15 = Utf8               _height
   #16 = Utf8               S
   #17 = Class              #18           // ext/mods/gameserver/geoengine/geodata/GeoStructure
   #18 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic._buffer:[B
   #20 = Class              #22           // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic
   #21 = NameAndType        #23:#24       // _buffer:[B
   #22 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic
   #23 = Utf8               _buffer
   #24 = Utf8               [B
   #25 = Fieldref           #20.#26       // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic._bx:I
   #26 = NameAndType        #27:#28       // _bx:I
   #27 = Utf8               _bx
   #28 = Utf8               I
   #29 = Fieldref           #20.#30       // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic._by:I
   #30 = NameAndType        #31:#28       // _by:I
   #31 = Utf8               _by
   #32 = Fieldref           #20.#33       // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic._original:[B
   #33 = NameAndType        #34:#24       // _original:[B
   #34 = Utf8               _original
   #35 = Methodref          #36.#37       // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
   #36 = Class              #38           // java/lang/System
   #37 = NameAndType        #39:#40       // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
   #38 = Utf8               java/lang/System
   #39 = Utf8               arraycopy
   #40 = Utf8               (Ljava/lang/Object;ILjava/lang/Object;II)V
   #41 = Class              #42           // java/util/LinkedList
   #42 = Utf8               java/util/LinkedList
   #43 = Methodref          #41.#3        // java/util/LinkedList."<init>":()V
   #44 = Fieldref           #20.#45       // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic._objects:Ljava/util/List;
   #45 = NameAndType        #46:#47       // _objects:Ljava/util/List;
   #46 = Utf8               _objects
   #47 = Utf8               Ljava/util/List;
   #48 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/geodata/BlockComplex._buffer:[B
   #49 = InterfaceMethodref #50.#51       // java/util/List.contains:(Ljava/lang/Object;)Z
   #50 = Class              #52           // java/util/List
   #51 = NameAndType        #53:#54       // contains:(Ljava/lang/Object;)Z
   #52 = Utf8               java/util/List
   #53 = Utf8               contains
   #54 = Utf8               (Ljava/lang/Object;)Z
   #55 = InterfaceMethodref #50.#56       // java/util/List.add:(Ljava/lang/Object;)Z
   #56 = NameAndType        #57:#54       // add:(Ljava/lang/Object;)Z
   #57 = Utf8               add
   #58 = Methodref          #20.#59       // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic.update:()V
   #59 = NameAndType        #60:#6        // update:()V
   #60 = Utf8               update
   #61 = InterfaceMethodref #50.#62       // java/util/List.remove:(Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#54       // remove:(Ljava/lang/Object;)Z
   #63 = Utf8               remove
   #64 = InterfaceMethodref #50.#65       // java/util/List.iterator:()Ljava/util/Iterator;
   #65 = NameAndType        #66:#67       // iterator:()Ljava/util/Iterator;
   #66 = Utf8               iterator
   #67 = Utf8               ()Ljava/util/Iterator;
   #68 = InterfaceMethodref #69.#70       // java/util/Iterator.hasNext:()Z
   #69 = Class              #71           // java/util/Iterator
   #70 = NameAndType        #72:#73       // hasNext:()Z
   #71 = Utf8               java/util/Iterator
   #72 = Utf8               hasNext
   #73 = Utf8               ()Z
   #74 = InterfaceMethodref #69.#75       // java/util/Iterator.next:()Ljava/lang/Object;
   #75 = NameAndType        #76:#77       // next:()Ljava/lang/Object;
   #76 = Utf8               next
   #77 = Utf8               ()Ljava/lang/Object;
   #78 = Class              #79           // ext/mods/gameserver/geoengine/geodata/IGeoObject
   #79 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
   #80 = InterfaceMethodref #78.#81       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoX:()I
   #81 = NameAndType        #82:#83       // getGeoX:()I
   #82 = Utf8               getGeoX
   #83 = Utf8               ()I
   #84 = InterfaceMethodref #78.#85       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoY:()I
   #85 = NameAndType        #86:#83       // getGeoY:()I
   #86 = Utf8               getGeoY
   #87 = InterfaceMethodref #78.#88       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoZ:()I
   #88 = NameAndType        #89:#83       // getGeoZ:()I
   #89 = Utf8               getGeoZ
   #90 = InterfaceMethodref #78.#91       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getHeight:()I
   #91 = NameAndType        #92:#83       // getHeight:()I
   #92 = Utf8               getHeight
   #93 = InterfaceMethodref #78.#94       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getObjectGeoData:()[[B
   #94 = NameAndType        #95:#96       // getObjectGeoData:()[[B
   #95 = Utf8               getObjectGeoData
   #96 = Utf8               ()[[B
   #97 = Methodref          #98.#99       // java/lang/Math.max:(II)I
   #98 = Class              #100          // java/lang/Math
   #99 = NameAndType        #101:#102     // max:(II)I
  #100 = Utf8               java/lang/Math
  #101 = Utf8               max
  #102 = Utf8               (II)I
  #103 = Methodref          #98.#104      // java/lang/Math.min:(II)I
  #104 = NameAndType        #105:#102     // min:(II)I
  #105 = Utf8               min
  #106 = Methodref          #20.#107      // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #107 = NameAndType        #92:#108      // getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #108 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #109 = Methodref          #98.#110      // java/lang/Math.abs:(I)I
  #110 = NameAndType        #111:#112     // abs:(I)I
  #111 = Utf8               abs
  #112 = Utf8               (I)I
  #113 = Class              #114          // ext/mods/gameserver/geoengine/geodata/IBlockDynamic
  #114 = Utf8               ext/mods/gameserver/geoengine/geodata/IBlockDynamic
  #115 = Utf8               Signature
  #116 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/geodata/IGeoObject;>;
  #117 = Utf8               (IILext/mods/gameserver/geoengine/geodata/BlockFlat;)V
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               i
  #122 = Utf8               this
  #123 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
  #124 = Utf8               bx
  #125 = Utf8               by
  #126 = Utf8               block
  #127 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockFlat;
  #128 = Utf8               nswe
  #129 = Utf8               heightLow
  #130 = Utf8               heightHigh
  #131 = Utf8               StackMapTable
  #132 = Utf8               (IILext/mods/gameserver/geoengine/geodata/BlockComplex;)V
  #133 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockComplex;
  #134 = Utf8               getHeightNearest
  #135 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #136 = Utf8               geoX
  #137 = Utf8               geoY
  #138 = Utf8               worldZ
  #139 = Utf8               ignore
  #140 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #141 = Utf8               buffer
  #142 = Utf8               index
  #143 = Class              #24           // "[B"
  #144 = Utf8               getNsweNearest
  #145 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #146 = Utf8               getIndexAbove
  #147 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #148 = Utf8               height
  #149 = Utf8               getIndexBelow
  #150 = Utf8               getNswe
  #151 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #152 = Utf8               addGeoObject
  #153 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #154 = Utf8               object
  #155 = Utf8               removeGeoObject
  #156 = Utf8               z
  #157 = Utf8               objNswe
  #158 = Utf8               ib
  #159 = Utf8               gy
  #160 = Utf8               gx
  #161 = Utf8               minOX
  #162 = Utf8               minOY
  #163 = Utf8               minOZ
  #164 = Utf8               maxOZ
  #165 = Utf8               geoData
  #166 = Utf8               [[B
  #167 = Utf8               minGX
  #168 = Utf8               minGY
  #169 = Utf8               maxGX
  #170 = Utf8               maxGY
  #171 = Utf8               minBX
  #172 = Utf8               minBY
  #173 = Utf8               maxBX
  #174 = Utf8               maxBY
  #175 = Class              #166          // "[[B"
  #176 = Utf8               SourceFile
  #177 = Utf8               BlockComplexDynamic.java
{
  public ext.mods.gameserver.geoengine.geodata.BlockComplexDynamic(int, int, ext.mods.gameserver.geoengine.geodata.BlockFlat);
    descriptor: (IILext/mods/gameserver/geoengine/geodata/BlockFlat;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/geoengine/geodata/BlockComplex."<init>":()V
         4: aload_3
         5: getfield      #7                  // Field ext/mods/gameserver/geoengine/geodata/BlockFlat._nswe:B
         8: istore        4
        10: aload_3
        11: getfield      #13                 // Field ext/mods/gameserver/geoengine/geodata/BlockFlat._height:S
        14: sipush        255
        17: iand
        18: i2b
        19: istore        5
        21: aload_3
        22: getfield      #13                 // Field ext/mods/gameserver/geoengine/geodata/BlockFlat._height:S
        25: bipush        8
        27: ishr
        28: i2b
        29: istore        6
        31: aload_0
        32: sipush        192
        35: newarray       byte
        37: putfield      #19                 // Field _buffer:[B
        40: iconst_0
        41: istore        7
        43: iload         7
        45: bipush        64
        47: if_icmpge     93
        50: aload_0
        51: getfield      #19                 // Field _buffer:[B
        54: iload         7
        56: iconst_3
        57: imul
        58: iload         4
        60: bastore
        61: aload_0
        62: getfield      #19                 // Field _buffer:[B
        65: iload         7
        67: iconst_3
        68: imul
        69: iconst_1
        70: iadd
        71: iload         5
        73: bastore
        74: aload_0
        75: getfield      #19                 // Field _buffer:[B
        78: iload         7
        80: iconst_3
        81: imul
        82: iconst_2
        83: iadd
        84: iload         6
        86: bastore
        87: iinc          7, 1
        90: goto          43
        93: aload_0
        94: iload_1
        95: putfield      #25                 // Field _bx:I
        98: aload_0
        99: iload_2
       100: putfield      #29                 // Field _by:I
       103: aload_0
       104: sipush        192
       107: newarray       byte
       109: putfield      #32                 // Field _original:[B
       112: aload_0
       113: getfield      #19                 // Field _buffer:[B
       116: iconst_0
       117: aload_0
       118: getfield      #32                 // Field _original:[B
       121: iconst_0
       122: sipush        192
       125: invokestatic  #35                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
       128: aload_0
       129: new           #41                 // class java/util/LinkedList
       132: dup
       133: invokespecial #43                 // Method java/util/LinkedList."<init>":()V
       136: putfield      #44                 // Field _objects:Ljava/util/List;
       139: return
      LineNumberTable:
        line 37: 0
        line 38: 4
        line 39: 10
        line 40: 21
        line 42: 31
        line 44: 40
        line 46: 50
        line 48: 61
        line 49: 74
        line 44: 87
        line 52: 93
        line 53: 98
        line 55: 103
        line 56: 112
        line 58: 128
        line 59: 139
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      50     7     i   I
            0     140     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0     140     1    bx   I
            0     140     2    by   I
            0     140     3 block   Lext/mods/gameserver/geoengine/geodata/BlockFlat;
           10     130     4  nswe   B
           21     119     5 heightLow   B
           31     109     6 heightHigh   B
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic, int, int, class ext/mods/gameserver/geoengine/geodata/BlockFlat, int, int, int, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 49

  public ext.mods.gameserver.geoengine.geodata.BlockComplexDynamic(int, int, ext.mods.gameserver.geoengine.geodata.BlockComplex);
    descriptor: (IILext/mods/gameserver/geoengine/geodata/BlockComplex;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/geoengine/geodata/BlockComplex."<init>":()V
         4: aload_0
         5: aload_3
         6: getfield      #48                 // Field ext/mods/gameserver/geoengine/geodata/BlockComplex._buffer:[B
         9: putfield      #19                 // Field _buffer:[B
        12: aload_3
        13: aconst_null
        14: putfield      #48                 // Field ext/mods/gameserver/geoengine/geodata/BlockComplex._buffer:[B
        17: aload_0
        18: iload_1
        19: putfield      #25                 // Field _bx:I
        22: aload_0
        23: iload_2
        24: putfield      #29                 // Field _by:I
        27: aload_0
        28: sipush        192
        31: newarray       byte
        33: putfield      #32                 // Field _original:[B
        36: aload_0
        37: getfield      #19                 // Field _buffer:[B
        40: iconst_0
        41: aload_0
        42: getfield      #32                 // Field _original:[B
        45: iconst_0
        46: sipush        192
        49: invokestatic  #35                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        52: aload_0
        53: new           #41                 // class java/util/LinkedList
        56: dup
        57: invokespecial #43                 // Method java/util/LinkedList."<init>":()V
        60: putfield      #44                 // Field _objects:Ljava/util/List;
        63: return
      LineNumberTable:
        line 68: 0
        line 69: 4
        line 70: 12
        line 72: 17
        line 73: 22
        line 75: 27
        line 76: 36
        line 78: 52
        line 79: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      64     1    bx   I
            0      64     2    by   I
            0      64     3 block   Lext/mods/gameserver/geoengine/geodata/BlockComplex;

  public final short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=7, args_size=5
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #49,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #32                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #19                 // Field _buffer:[B
        25: astore        5
        27: iload_1
        28: bipush        8
        30: irem
        31: bipush        8
        33: imul
        34: iload_2
        35: bipush        8
        37: irem
        38: iadd
        39: iconst_3
        40: imul
        41: istore        6
        43: aload         5
        45: iload         6
        47: iconst_1
        48: iadd
        49: baload
        50: sipush        255
        53: iand
        54: aload         5
        56: iload         6
        58: iconst_2
        59: iadd
        60: baload
        61: bipush        8
        63: ishl
        64: ior
        65: i2s
        66: ireturn
      LineNumberTable:
        line 84: 0
        line 86: 27
        line 88: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      67     1  geoX   I
            0      67     2  geoY   I
            0      67     3 worldZ   I
            0      67     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27      40     5 buffer   [B
           43      24     6 index   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public final byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=7, args_size=5
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #49,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #32                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #19                 // Field _buffer:[B
        25: astore        5
        27: iload_1
        28: bipush        8
        30: irem
        31: bipush        8
        33: imul
        34: iload_2
        35: bipush        8
        37: irem
        38: iadd
        39: iconst_3
        40: imul
        41: istore        6
        43: aload         5
        45: iload         6
        47: baload
        48: ireturn
      LineNumberTable:
        line 94: 0
        line 96: 27
        line 98: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      49     1  geoX   I
            0      49     2  geoY   I
            0      49     3 worldZ   I
            0      49     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27      22     5 buffer   [B
           43       6     6 index   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public final int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=8, args_size=5
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #49,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #32                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #19                 // Field _buffer:[B
        25: astore        5
        27: iload_1
        28: bipush        8
        30: irem
        31: bipush        8
        33: imul
        34: iload_2
        35: bipush        8
        37: irem
        38: iadd
        39: iconst_3
        40: imul
        41: istore        6
        43: aload         5
        45: iload         6
        47: iconst_1
        48: iadd
        49: baload
        50: sipush        255
        53: iand
        54: aload         5
        56: iload         6
        58: iconst_2
        59: iadd
        60: baload
        61: bipush        8
        63: ishl
        64: ior
        65: istore        7
        67: iload         7
        69: iload_3
        70: if_icmple     78
        73: iload         6
        75: goto          79
        78: iconst_m1
        79: ireturn
      LineNumberTable:
        line 104: 0
        line 106: 27
        line 108: 43
        line 110: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      80     1  geoX   I
            0      80     2  geoY   I
            0      80     3 worldZ   I
            0      80     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27      53     5 buffer   [B
           43      37     6 index   I
           67      13     7 height   I
      StackMapTable: number_of_entries = 4
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ class "[B", int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=8, args_size=5
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #49,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #32                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #19                 // Field _buffer:[B
        25: astore        5
        27: iload_1
        28: bipush        8
        30: irem
        31: bipush        8
        33: imul
        34: iload_2
        35: bipush        8
        37: irem
        38: iadd
        39: iconst_3
        40: imul
        41: istore        6
        43: aload         5
        45: iload         6
        47: iconst_1
        48: iadd
        49: baload
        50: sipush        255
        53: iand
        54: aload         5
        56: iload         6
        58: iconst_2
        59: iadd
        60: baload
        61: bipush        8
        63: ishl
        64: ior
        65: istore        7
        67: iload         7
        69: iload_3
        70: if_icmpge     78
        73: iload         6
        75: goto          79
        78: iconst_m1
        79: ireturn
      LineNumberTable:
        line 116: 0
        line 118: 27
        line 120: 43
        line 122: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      80     1  geoX   I
            0      80     2  geoY   I
            0      80     3 worldZ   I
            0      80     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27      53     5 buffer   [B
           43      37     6 index   I
           67      13     7 height   I
      StackMapTable: number_of_entries = 4
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ class "[B", int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload_2
         5: invokeinterface #49,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ifeq          20
        13: aload_0
        14: getfield      #32                 // Field _original:[B
        17: goto          24
        20: aload_0
        21: getfield      #19                 // Field _buffer:[B
        24: astore_3
        25: aload_3
        26: iload_1
        27: iconst_1
        28: iadd
        29: baload
        30: sipush        255
        33: iand
        34: aload_3
        35: iload_1
        36: iconst_2
        37: iadd
        38: baload
        39: bipush        8
        41: ishl
        42: ior
        43: i2s
        44: ireturn
      LineNumberTable:
        line 128: 0
        line 130: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      45     1 index   I
            0      45     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           25      20     3 buffer   [B
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public final byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload_2
         5: invokeinterface #49,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ifeq          20
        13: aload_0
        14: getfield      #32                 // Field _original:[B
        17: goto          24
        20: aload_0
        21: getfield      #19                 // Field _buffer:[B
        24: astore_3
        25: aload_3
        26: iload_1
        27: baload
        28: ireturn
      LineNumberTable:
        line 136: 0
        line 138: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      29     1 index   I
            0      29     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           25       4     3 buffer   [B
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public final synchronized void addGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload_1
         5: invokeinterface #55,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: ifeq          17
        13: aload_0
        14: invokevirtual #58                 // Method update:()V
        17: return
      LineNumberTable:
        line 144: 0
        line 145: 13
        line 146: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      18     1 object   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public final synchronized void removeGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #44                 // Field _objects:Ljava/util/List;
         4: aload_1
         5: invokeinterface #61,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: ifeq          17
        13: aload_0
        14: invokevirtual #58                 // Method update:()V
        17: return
      LineNumberTable:
        line 151: 0
        line 152: 13
        line 153: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/geodata/BlockComplexDynamic;
            0      18     1 object   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
}
SourceFile: "BlockComplexDynamic.java"
