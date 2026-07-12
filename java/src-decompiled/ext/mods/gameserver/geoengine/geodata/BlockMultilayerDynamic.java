// Bytecode for: ext.mods.gameserver.geoengine.geodata.BlockMultilayerDynamic
// File: ext\mods\gameserver\geoengine\geodata\BlockMultilayerDynamic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic.class
  Last modified 9 de jul de 2026; size 5520 bytes
  MD5 checksum 49463105841749f7970ccb071d4b1d85
  Compiled from "BlockMultilayerDynamic.java"
public final class ext.mods.gameserver.geoengine.geodata.BlockMultilayerDynamic extends ext.mods.gameserver.geoengine.geodata.BlockMultilayer implements ext.mods.gameserver.geoengine.geodata.IBlockDynamic
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic
  super_class: #2                         // ext/mods/gameserver/geoengine/geodata/BlockMultilayer
  interfaces: 1, fields: 4, methods: 11, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/geoengine/geodata/BlockMultilayer."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/geoengine/geodata/BlockMultilayer
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockMultilayer
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #2.#8         // ext/mods/gameserver/geoengine/geodata/BlockMultilayer._buffer:[B
    #8 = NameAndType        #9:#10        // _buffer:[B
    #9 = Utf8               _buffer
   #10 = Utf8               [B
   #11 = Fieldref           #12.#8        // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic._buffer:[B
   #12 = Class              #13           // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic
   #13 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic
   #14 = Fieldref           #12.#15       // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic._bx:I
   #15 = NameAndType        #16:#17       // _bx:I
   #16 = Utf8               _bx
   #17 = Utf8               I
   #18 = Fieldref           #12.#19       // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic._by:I
   #19 = NameAndType        #20:#17       // _by:I
   #20 = Utf8               _by
   #21 = Fieldref           #12.#22       // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic._original:[B
   #22 = NameAndType        #23:#10       // _original:[B
   #23 = Utf8               _original
   #24 = Methodref          #25.#26       // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
   #25 = Class              #27           // java/lang/System
   #26 = NameAndType        #28:#29       // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
   #27 = Utf8               java/lang/System
   #28 = Utf8               arraycopy
   #29 = Utf8               (Ljava/lang/Object;ILjava/lang/Object;II)V
   #30 = Class              #31           // java/util/LinkedList
   #31 = Utf8               java/util/LinkedList
   #32 = Methodref          #30.#3        // java/util/LinkedList."<init>":()V
   #33 = Fieldref           #12.#34       // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic._objects:Ljava/util/List;
   #34 = NameAndType        #35:#36       // _objects:Ljava/util/List;
   #35 = Utf8               _objects
   #36 = Utf8               Ljava/util/List;
   #37 = InterfaceMethodref #38.#39       // java/util/List.contains:(Ljava/lang/Object;)Z
   #38 = Class              #40           // java/util/List
   #39 = NameAndType        #41:#42       // contains:(Ljava/lang/Object;)Z
   #40 = Utf8               java/util/List
   #41 = Utf8               contains
   #42 = Utf8               (Ljava/lang/Object;)Z
   #43 = Methodref          #12.#44       // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic.getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #44 = NameAndType        #45:#46       // getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #45 = Utf8               getIndexNearest
   #46 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #47 = Class              #48           // ext/mods/gameserver/geoengine/geodata/GeoStructure
   #48 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
   #49 = Class              #50           // java/lang/Integer
   #50 = Utf8               java/lang/Integer
   #51 = Integer            2147483647
   #52 = Methodref          #53.#54       // java/lang/Math.abs:(I)I
   #53 = Class              #55           // java/lang/Math
   #54 = NameAndType        #56:#57       // abs:(I)I
   #55 = Utf8               java/lang/Math
   #56 = Utf8               abs
   #57 = Utf8               (I)I
   #58 = InterfaceMethodref #38.#59       // java/util/List.add:(Ljava/lang/Object;)Z
   #59 = NameAndType        #60:#42       // add:(Ljava/lang/Object;)Z
   #60 = Utf8               add
   #61 = Methodref          #12.#62       // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic.update:()V
   #62 = NameAndType        #63:#6        // update:()V
   #63 = Utf8               update
   #64 = InterfaceMethodref #38.#65       // java/util/List.remove:(Ljava/lang/Object;)Z
   #65 = NameAndType        #66:#42       // remove:(Ljava/lang/Object;)Z
   #66 = Utf8               remove
   #67 = InterfaceMethodref #38.#68       // java/util/List.iterator:()Ljava/util/Iterator;
   #68 = NameAndType        #69:#70       // iterator:()Ljava/util/Iterator;
   #69 = Utf8               iterator
   #70 = Utf8               ()Ljava/util/Iterator;
   #71 = InterfaceMethodref #72.#73       // java/util/Iterator.hasNext:()Z
   #72 = Class              #74           // java/util/Iterator
   #73 = NameAndType        #75:#76       // hasNext:()Z
   #74 = Utf8               java/util/Iterator
   #75 = Utf8               hasNext
   #76 = Utf8               ()Z
   #77 = InterfaceMethodref #72.#78       // java/util/Iterator.next:()Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // next:()Ljava/lang/Object;
   #79 = Utf8               next
   #80 = Utf8               ()Ljava/lang/Object;
   #81 = Class              #82           // ext/mods/gameserver/geoengine/geodata/IGeoObject
   #82 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
   #83 = InterfaceMethodref #81.#84       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoX:()I
   #84 = NameAndType        #85:#86       // getGeoX:()I
   #85 = Utf8               getGeoX
   #86 = Utf8               ()I
   #87 = InterfaceMethodref #81.#88       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoY:()I
   #88 = NameAndType        #89:#86       // getGeoY:()I
   #89 = Utf8               getGeoY
   #90 = InterfaceMethodref #81.#91       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoZ:()I
   #91 = NameAndType        #92:#86       // getGeoZ:()I
   #92 = Utf8               getGeoZ
   #93 = InterfaceMethodref #81.#94       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getHeight:()I
   #94 = NameAndType        #95:#86       // getHeight:()I
   #95 = Utf8               getHeight
   #96 = InterfaceMethodref #81.#97       // ext/mods/gameserver/geoengine/geodata/IGeoObject.getObjectGeoData:()[[B
   #97 = NameAndType        #98:#99       // getObjectGeoData:()[[B
   #98 = Utf8               getObjectGeoData
   #99 = Utf8               ()[[B
  #100 = Methodref          #53.#101      // java/lang/Math.max:(II)I
  #101 = NameAndType        #102:#103     // max:(II)I
  #102 = Utf8               max
  #103 = Utf8               (II)I
  #104 = Methodref          #53.#105      // java/lang/Math.min:(II)I
  #105 = NameAndType        #106:#103     // min:(II)I
  #106 = Utf8               min
  #107 = Methodref          #12.#108      // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #108 = NameAndType        #109:#46      // getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #109 = Utf8               getIndexAbove
  #110 = Methodref          #12.#111      // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #111 = NameAndType        #95:#112      // getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #112 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #113 = Class              #114          // ext/mods/gameserver/geoengine/geodata/IBlockDynamic
  #114 = Utf8               ext/mods/gameserver/geoengine/geodata/IBlockDynamic
  #115 = Utf8               Signature
  #116 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/geodata/IGeoObject;>;
  #117 = Utf8               (IILext/mods/gameserver/geoengine/geodata/BlockMultilayer;)V
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               this
  #122 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
  #123 = Utf8               bx
  #124 = Utf8               by
  #125 = Utf8               block
  #126 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;
  #127 = Utf8               getHeightNearest
  #128 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #129 = Utf8               geoX
  #130 = Utf8               geoY
  #131 = Utf8               worldZ
  #132 = Utf8               ignore
  #133 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
  #134 = Utf8               buffer
  #135 = Utf8               index
  #136 = Utf8               StackMapTable
  #137 = Class              #10           // "[B"
  #138 = Utf8               getNsweNearest
  #139 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #140 = Utf8               i
  #141 = Utf8               height
  #142 = Utf8               distance
  #143 = Utf8               layers
  #144 = Utf8               B
  #145 = Utf8               limit
  #146 = Utf8               getIndexBelow
  #147 = Utf8               getNswe
  #148 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #149 = Utf8               addGeoObject
  #150 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
  #151 = Utf8               object
  #152 = Utf8               removeGeoObject
  #153 = Utf8               az
  #154 = Utf8               z
  #155 = Utf8               S
  #156 = Utf8               objNswe
  #157 = Utf8               ib
  #158 = Utf8               gy
  #159 = Utf8               gx
  #160 = Utf8               minOX
  #161 = Utf8               minOY
  #162 = Utf8               minOZ
  #163 = Utf8               maxOZ
  #164 = Utf8               geoData
  #165 = Utf8               [[B
  #166 = Utf8               minGX
  #167 = Utf8               minGY
  #168 = Utf8               maxGX
  #169 = Utf8               maxGY
  #170 = Utf8               minBX
  #171 = Utf8               minBY
  #172 = Utf8               maxBX
  #173 = Utf8               maxBY
  #174 = Class              #165          // "[[B"
  #175 = Utf8               SourceFile
  #176 = Utf8               BlockMultilayerDynamic.java
{
  public ext.mods.gameserver.geoengine.geodata.BlockMultilayerDynamic(int, int, ext.mods.gameserver.geoengine.geodata.BlockMultilayer);
    descriptor: (IILext/mods/gameserver/geoengine/geodata/BlockMultilayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/geoengine/geodata/BlockMultilayer."<init>":()V
         4: aload_0
         5: aload_3
         6: getfield      #7                  // Field ext/mods/gameserver/geoengine/geodata/BlockMultilayer._buffer:[B
         9: putfield      #11                 // Field _buffer:[B
        12: aload_3
        13: aconst_null
        14: putfield      #7                  // Field ext/mods/gameserver/geoengine/geodata/BlockMultilayer._buffer:[B
        17: aload_0
        18: iload_1
        19: putfield      #14                 // Field _bx:I
        22: aload_0
        23: iload_2
        24: putfield      #18                 // Field _by:I
        27: aload_0
        28: aload_0
        29: getfield      #11                 // Field _buffer:[B
        32: arraylength
        33: newarray       byte
        35: putfield      #21                 // Field _original:[B
        38: aload_0
        39: getfield      #11                 // Field _buffer:[B
        42: iconst_0
        43: aload_0
        44: getfield      #21                 // Field _original:[B
        47: iconst_0
        48: aload_0
        49: getfield      #11                 // Field _buffer:[B
        52: arraylength
        53: invokestatic  #24                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        56: aload_0
        57: new           #30                 // class java/util/LinkedList
        60: dup
        61: invokespecial #32                 // Method java/util/LinkedList."<init>":()V
        64: putfield      #33                 // Field _objects:Ljava/util/List;
        67: return
      LineNumberTable:
        line 37: 0
        line 38: 4
        line 39: 12
        line 41: 17
        line 42: 22
        line 44: 27
        line 45: 38
        line 47: 56
        line 48: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0      68     1    bx   I
            0      68     2    by   I
            0      68     3 block   Lext/mods/gameserver/geoengine/geodata/BlockMultilayer;

  public short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #21                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #11                 // Field _buffer:[B
        25: astore        5
        27: aload_0
        28: iload_1
        29: iload_2
        30: iload_3
        31: aload         4
        33: invokevirtual #43                 // Method getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
        36: istore        6
        38: aload         5
        40: iload         6
        42: iconst_1
        43: iadd
        44: baload
        45: sipush        255
        48: iand
        49: aload         5
        51: iload         6
        53: iconst_2
        54: iadd
        55: baload
        56: bipush        8
        58: ishl
        59: ior
        60: i2s
        61: ireturn
      LineNumberTable:
        line 53: 0
        line 55: 27
        line 57: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0      62     1  geoX   I
            0      62     2  geoY   I
            0      62     3 worldZ   I
            0      62     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27      35     5 buffer   [B
           38      24     6 index   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #21                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #11                 // Field _buffer:[B
        25: astore        5
        27: aload_0
        28: iload_1
        29: iload_2
        30: iload_3
        31: aload         4
        33: invokevirtual #43                 // Method getIndexNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
        36: istore        6
        38: aload         5
        40: iload         6
        42: baload
        43: ireturn
      LineNumberTable:
        line 63: 0
        line 65: 27
        line 67: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0      44     1  geoX   I
            0      44     2  geoY   I
            0      44     3 worldZ   I
            0      44     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27      17     5 buffer   [B
           38       6     6 index   I
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public final int getIndexNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=11, args_size=5
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #21                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #11                 // Field _buffer:[B
        25: astore        5
        27: iconst_0
        28: istore        6
        30: iconst_0
        31: istore        7
        33: iload         7
        35: iload_1
        36: bipush        8
        38: irem
        39: bipush        8
        41: imul
        42: iload_2
        43: bipush        8
        45: irem
        46: iadd
        47: if_icmpge     70
        50: iload         6
        52: aload         5
        54: iload         6
        56: baload
        57: iconst_3
        58: imul
        59: iconst_1
        60: iadd
        61: iadd
        62: istore        6
        64: iinc          7, 1
        67: goto          33
        70: aload         5
        72: iload         6
        74: iinc          6, 1
        77: baload
        78: istore        7
        80: ldc           #51                 // int 2147483647
        82: istore        8
        84: iload         7
        86: iload         7
        88: iconst_1
        89: isub
        90: i2b
        91: istore        7
        93: ifle          149
        96: aload         5
        98: iload         6
       100: iconst_1
       101: iadd
       102: baload
       103: sipush        255
       106: iand
       107: aload         5
       109: iload         6
       111: iconst_2
       112: iadd
       113: baload
       114: bipush        8
       116: ishl
       117: ior
       118: istore        9
       120: iload         9
       122: iload_3
       123: isub
       124: invokestatic  #52                 // Method java/lang/Math.abs:(I)I
       127: istore        10
       129: iload         10
       131: iload         8
       133: if_icmple     139
       136: goto          149
       139: iload         10
       141: istore        8
       143: iinc          6, 3
       146: goto          84
       149: iload         6
       151: iconst_3
       152: isub
       153: ireturn
      LineNumberTable:
        line 73: 0
        line 75: 27
        line 76: 30
        line 78: 50
        line 76: 64
        line 81: 70
        line 83: 80
        line 84: 84
        line 86: 96
        line 88: 120
        line 89: 129
        line 90: 136
        line 92: 139
        line 93: 143
        line 94: 146
        line 96: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      37     7     i   I
          120      26     9 height   I
          129      17    10 distance   I
            0     154     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0     154     1  geoX   I
            0     154     2  geoY   I
            0     154     3 worldZ   I
            0     154     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27     127     5 buffer   [B
           30     124     6 index   I
           80      74     7 layers   B
           84      70     8 limit   I
      StackMapTable: number_of_entries = 7
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[B", int, int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 253 /* append */
          offset_delta = 13
          locals = [ int, int ]
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ int, int ]
        frame_type = 249 /* chop */
          offset_delta = 9

  public final int getIndexAbove(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=9, args_size=5
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #21                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #11                 // Field _buffer:[B
        25: astore        5
        27: iconst_0
        28: istore        6
        30: iconst_0
        31: istore        7
        33: iload         7
        35: iload_1
        36: bipush        8
        38: irem
        39: bipush        8
        41: imul
        42: iload_2
        43: bipush        8
        45: irem
        46: iadd
        47: if_icmpge     70
        50: iload         6
        52: aload         5
        54: iload         6
        56: baload
        57: iconst_3
        58: imul
        59: iconst_1
        60: iadd
        61: iadd
        62: istore        6
        64: iinc          7, 1
        67: goto          33
        70: aload         5
        72: iload         6
        74: iinc          6, 1
        77: baload
        78: istore        7
        80: iload         6
        82: iload         7
        84: iconst_1
        85: isub
        86: iconst_3
        87: imul
        88: iadd
        89: istore        6
        91: iload         7
        93: iload         7
        95: iconst_1
        96: isub
        97: i2b
        98: istore        7
       100: ifle          142
       103: aload         5
       105: iload         6
       107: iconst_1
       108: iadd
       109: baload
       110: sipush        255
       113: iand
       114: aload         5
       116: iload         6
       118: iconst_2
       119: iadd
       120: baload
       121: bipush        8
       123: ishl
       124: ior
       125: istore        8
       127: iload         8
       129: iload_3
       130: if_icmple     136
       133: iload         6
       135: ireturn
       136: iinc          6, -3
       139: goto          91
       142: iconst_m1
       143: ireturn
      LineNumberTable:
        line 102: 0
        line 104: 27
        line 105: 30
        line 107: 50
        line 105: 64
        line 110: 70
        line 111: 80
        line 113: 91
        line 115: 103
        line 117: 127
        line 118: 133
        line 120: 136
        line 121: 139
        line 123: 142
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      37     7     i   I
          127      12     8 height   I
            0     144     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0     144     1  geoX   I
            0     144     2  geoY   I
            0     144     3 worldZ   I
            0     144     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27     117     5 buffer   [B
           30     114     6 index   I
           80      64     7 layers   B
      StackMapTable: number_of_entries = 7
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[B", int, int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 5

  public final int getIndexBelow(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=9, args_size=5
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload         4
         6: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        11: ifeq          21
        14: aload_0
        15: getfield      #21                 // Field _original:[B
        18: goto          25
        21: aload_0
        22: getfield      #11                 // Field _buffer:[B
        25: astore        5
        27: iconst_0
        28: istore        6
        30: iconst_0
        31: istore        7
        33: iload         7
        35: iload_1
        36: bipush        8
        38: irem
        39: bipush        8
        41: imul
        42: iload_2
        43: bipush        8
        45: irem
        46: iadd
        47: if_icmpge     70
        50: iload         6
        52: aload         5
        54: iload         6
        56: baload
        57: iconst_3
        58: imul
        59: iconst_1
        60: iadd
        61: iadd
        62: istore        6
        64: iinc          7, 1
        67: goto          33
        70: aload         5
        72: iload         6
        74: iinc          6, 1
        77: baload
        78: istore        7
        80: iload         7
        82: iload         7
        84: iconst_1
        85: isub
        86: i2b
        87: istore        7
        89: ifle          131
        92: aload         5
        94: iload         6
        96: iconst_1
        97: iadd
        98: baload
        99: sipush        255
       102: iand
       103: aload         5
       105: iload         6
       107: iconst_2
       108: iadd
       109: baload
       110: bipush        8
       112: ishl
       113: ior
       114: istore        8
       116: iload         8
       118: iload_3
       119: if_icmpge     125
       122: iload         6
       124: ireturn
       125: iinc          6, 3
       128: goto          80
       131: iconst_m1
       132: ireturn
      LineNumberTable:
        line 129: 0
        line 131: 27
        line 132: 30
        line 134: 50
        line 132: 64
        line 137: 70
        line 139: 80
        line 141: 92
        line 143: 116
        line 144: 122
        line 146: 125
        line 147: 128
        line 149: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      37     7     i   I
          116      12     8 height   I
            0     133     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0     133     1  geoX   I
            0     133     2  geoY   I
            0     133     3 worldZ   I
            0     133     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           27     106     5 buffer   [B
           30     103     6 index   I
           80      53     7 layers   B
      StackMapTable: number_of_entries = 7
        frame_type = 21 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[B", int, int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 5

  public short getHeight(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload_2
         5: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ifeq          20
        13: aload_0
        14: getfield      #21                 // Field _original:[B
        17: goto          24
        20: aload_0
        21: getfield      #11                 // Field _buffer:[B
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
        line 155: 0
        line 157: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0      45     1 index   I
            0      45     2 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
           25      20     3 buffer   [B
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class "[B" ]

  public byte getNswe(int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload_2
         5: invokeinterface #37,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ifeq          20
        13: aload_0
        14: getfield      #21                 // Field _original:[B
        17: goto          24
        20: aload_0
        21: getfield      #11                 // Field _buffer:[B
        24: astore_3
        25: aload_3
        26: iload_1
        27: baload
        28: ireturn
      LineNumberTable:
        line 163: 0
        line 165: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
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
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload_1
         5: invokeinterface #58,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: ifeq          17
        13: aload_0
        14: invokevirtual #61                 // Method update:()V
        17: return
      LineNumberTable:
        line 171: 0
        line 172: 13
        line 173: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0      18     1 object   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public final synchronized void removeGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #33                 // Field _objects:Ljava/util/List;
         4: aload_1
         5: invokeinterface #64,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: ifeq          17
        13: aload_0
        14: invokevirtual #61                 // Method update:()V
        17: return
      LineNumberTable:
        line 178: 0
        line 179: 13
        line 180: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic;
            0      18     1 object   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
}
SourceFile: "BlockMultilayerDynamic.java"
