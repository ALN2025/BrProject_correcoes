// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$ConvDatFile
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$ConvDatFile.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile.class
  Last modified 9 de jul de 2026; size 3124 bytes
  MD5 checksum ffc294f8fc6d28c9f6c0668331cc35a0
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$ConvDatFile
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 2, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/io/File;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               java/lang/Throwable
    #9 = Class              #8            // java/lang/Throwable
   #10 = Utf8               ()V
   #11 = NameAndType        #5:#10        // "<init>":()V
   #12 = Methodref          #4.#11        // java/lang/Object."<init>":()V
   #13 = Utf8               java/io/RandomAccessFile
   #14 = Class              #13           // java/io/RandomAccessFile
   #15 = Utf8               r
   #16 = String             #15           // r
   #17 = Utf8               (Ljava/io/File;Ljava/lang/String;)V
   #18 = NameAndType        #5:#17        // "<init>":(Ljava/io/File;Ljava/lang/String;)V
   #19 = Methodref          #14.#18       // java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
   #20 = Utf8               java/io/Closeable
   #21 = Class              #20           // java/io/Closeable
   #22 = Utf8               getChannel
   #23 = Utf8               ()Ljava/nio/channels/FileChannel;
   #24 = NameAndType        #22:#23       // getChannel:()Ljava/nio/channels/FileChannel;
   #25 = Methodref          #14.#24       // java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
   #26 = Utf8               length
   #27 = Utf8               ()J
   #28 = NameAndType        #26:#27       // length:()J
   #29 = Methodref          #14.#28       // java/io/RandomAccessFile.length:()J
   #30 = Utf8               java/nio/ByteBuffer
   #31 = Class              #30           // java/nio/ByteBuffer
   #32 = Utf8               allocate
   #33 = Utf8               (I)Ljava/nio/ByteBuffer;
   #34 = NameAndType        #32:#33       // allocate:(I)Ljava/nio/ByteBuffer;
   #35 = Methodref          #31.#34       // java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
   #36 = Utf8               java/nio/ByteOrder
   #37 = Class              #36           // java/nio/ByteOrder
   #38 = Utf8               LITTLE_ENDIAN
   #39 = Utf8               Ljava/nio/ByteOrder;
   #40 = NameAndType        #38:#39       // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #41 = Fieldref           #37.#40       // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #42 = Utf8               order
   #43 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #44 = NameAndType        #42:#43       // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #45 = Methodref          #31.#44       // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #46 = Utf8               java/nio/channels/FileChannel
   #47 = Class              #46           // java/nio/channels/FileChannel
   #48 = Utf8               read
   #49 = Utf8               (Ljava/nio/ByteBuffer;)I
   #50 = NameAndType        #48:#49       // read:(Ljava/nio/ByteBuffer;)I
   #51 = Methodref          #47.#50       // java/nio/channels/FileChannel.read:(Ljava/nio/ByteBuffer;)I
   #52 = Utf8               flip
   #53 = Utf8               ()Ljava/nio/ByteBuffer;
   #54 = NameAndType        #52:#53       // flip:()Ljava/nio/ByteBuffer;
   #55 = Methodref          #31.#54       // java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
   #56 = Utf8               remaining
   #57 = Utf8               ()I
   #58 = NameAndType        #56:#57       // remaining:()I
   #59 = Methodref          #31.#58       // java/nio/ByteBuffer.remaining:()I
   #60 = Integer            131080
   #61 = Utf8               width
   #62 = Utf8               I
   #63 = NameAndType        #61:#62       // width:I
   #64 = Fieldref           #2.#63        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile.width:I
   #65 = Utf8               height
   #66 = NameAndType        #65:#62       // height:I
   #67 = Fieldref           #2.#66        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile.height:I
   #68 = Utf8               position
   #69 = NameAndType        #68:#33       // position:(I)Ljava/nio/ByteBuffer;
   #70 = Methodref          #31.#69       // java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
   #71 = Integer            32768
   #72 = Utf8               java/lang/Math
   #73 = Class              #72           // java/lang/Math
   #74 = Utf8               sqrt
   #75 = Utf8               (D)D
   #76 = NameAndType        #74:#75       // sqrt:(D)D
   #77 = Methodref          #73.#76       // java/lang/Math.sqrt:(D)D
   #78 = Utf8               heights
   #79 = Utf8               [S
   #80 = NameAndType        #78:#79       // heights:[S
   #81 = Fieldref           #2.#80        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile.heights:[S
   #82 = Utf8               getShort
   #83 = Utf8               ()S
   #84 = NameAndType        #82:#83       // getShort:()S
   #85 = Methodref          #31.#84       // java/nio/ByteBuffer.getShort:()S
   #86 = Utf8               kotlin/Unit
   #87 = Class              #86           // kotlin/Unit
   #88 = Utf8               INSTANCE
   #89 = Utf8               Lkotlin/Unit;
   #90 = NameAndType        #88:#89       // INSTANCE:Lkotlin/Unit;
   #91 = Fieldref           #87.#90       // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #92 = Utf8               kotlin/io/CloseableKt
   #93 = Class              #92           // kotlin/io/CloseableKt
   #94 = Utf8               closeFinally
   #95 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #96 = NameAndType        #94:#95       // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #97 = Methodref          #93.#96       // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #98 = Utf8               totalCells
   #99 = Utf8               dim
  #100 = Utf8               i
  #101 = Utf8               $i$a$-use-GeoIndexer$ConvDatFile$1
  #102 = Utf8               channel
  #103 = Utf8               Ljava/nio/channels/FileChannel;
  #104 = Utf8               buffer
  #105 = Utf8               Ljava/nio/ByteBuffer;
  #106 = Utf8               fileSize
  #107 = Utf8               raf
  #108 = Utf8               Ljava/io/RandomAccessFile;
  #109 = Utf8               this
  #110 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
  #111 = Utf8               file
  #112 = Utf8               Ljava/io/File;
  #113 = Utf8               java/io/File
  #114 = Class              #113          // java/io/File
  #115 = Utf8               getHeight
  #116 = Utf8               (II)Ljava/lang/Short;
  #117 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #118 = Utf8               java/lang/Short
  #119 = Class              #118          // java/lang/Short
  #120 = Utf8               valueOf
  #121 = Utf8               (S)Ljava/lang/Short;
  #122 = NameAndType        #120:#121     // valueOf:(S)Ljava/lang/Short;
  #123 = Methodref          #119.#122     // java/lang/Short.valueOf:(S)Ljava/lang/Short;
  #124 = Utf8               x
  #125 = Utf8               y
  #126 = Utf8               Lkotlin/Metadata;
  #127 = Utf8               mv
  #128 = Integer            2
  #129 = Integer            3
  #130 = Integer            0
  #131 = Utf8               k
  #132 = Integer            1
  #133 = Utf8               xi
  #134 = Integer            48
  #135 = Utf8               d1
  #136 = Utf8               \u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010
  #137 = Utf8               d2
  #138 = Utf8
  #139 = Utf8               Brproject
  #140 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #141 = Class              #140          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #142 = Utf8               ConvDatFile
  #143 = Utf8               GeoIndexer.kt
  #144 = Utf8               RuntimeInvisibleAnnotations
  #145 = Utf8               Code
  #146 = Utf8               StackMapTable
  #147 = Utf8               LineNumberTable
  #148 = Utf8               LocalVariableTable
  #149 = Utf8               RuntimeInvisibleParameterAnnotations
  #150 = Utf8               InnerClasses
  #151 = Utf8               SourceFile
  #152 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$ConvDatFile(java.io.File);
    descriptor: (Ljava/io/File;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=2
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: nop
         5: new           #14                 // class java/io/RandomAccessFile
         8: dup
         9: aload_1
        10: ldc           #16                 // String r
        12: invokespecial #19                 // Method java/io/RandomAccessFile."<init>":(Ljava/io/File;Ljava/lang/String;)V
        15: checkcast     #21                 // class java/io/Closeable
        18: astore_2
        19: aconst_null
        20: astore_3
        21: nop
        22: aload_2
        23: checkcast     #14                 // class java/io/RandomAccessFile
        26: astore        4
        28: iconst_0
        29: istore        5
        31: aload         4
        33: invokevirtual #25                 // Method java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        36: astore        6
        38: aload         4
        40: invokevirtual #29                 // Method java/io/RandomAccessFile.length:()J
        43: l2i
        44: invokestatic  #35                 // Method java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        47: getstatic     #41                 // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        50: invokevirtual #45                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        53: astore        7
        55: aload         6
        57: aload         7
        59: invokevirtual #51                 // Method java/nio/channels/FileChannel.read:(Ljava/nio/ByteBuffer;)I
        62: pop
        63: aload         7
        65: invokevirtual #55                 // Method java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
        68: pop
        69: aload         7
        71: invokevirtual #59                 // Method java/nio/ByteBuffer.remaining:()I
        74: istore        8
        76: nop
        77: iload         8
        79: ldc           #60                 // int 131080
        81: if_icmplt     108
        84: aload_0
        85: sipush        256
        88: putfield      #64                 // Field width:I
        91: aload_0
        92: sipush        256
        95: putfield      #67                 // Field height:I
        98: aload         7
       100: bipush        8
       102: invokevirtual #70                 // Method java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
       105: goto          171
       108: iload         8
       110: ldc           #71                 // int 32768
       112: if_icmplt     138
       115: aload_0
       116: sipush        128
       119: putfield      #64                 // Field width:I
       122: aload_0
       123: sipush        128
       126: putfield      #67                 // Field height:I
       129: aload         7
       131: iconst_0
       132: invokevirtual #70                 // Method java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
       135: goto          171
       138: iload         8
       140: iconst_2
       141: idiv
       142: istore        9
       144: iload         9
       146: i2d
       147: invokestatic  #77                 // Method java/lang/Math.sqrt:(D)D
       150: d2i
       151: istore        10
       153: aload_0
       154: iload         10
       156: putfield      #64                 // Field width:I
       159: aload_0
       160: iload         10
       162: putfield      #67                 // Field height:I
       165: aload         7
       167: iconst_0
       168: invokevirtual #70                 // Method java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
       171: pop
       172: aload_0
       173: aload_0
       174: getfield      #64                 // Field width:I
       177: aload_0
       178: getfield      #67                 // Field height:I
       181: imul
       182: newarray       short
       184: putfield      #81                 // Field heights:[S
       187: iconst_0
       188: istore        9
       190: aload_0
       191: getfield      #81                 // Field heights:[S
       194: arraylength
       195: istore        10
       197: iload         9
       199: iload         10
       201: if_icmpge     242
       204: aload         7
       206: invokevirtual #59                 // Method java/nio/ByteBuffer.remaining:()I
       209: iconst_2
       210: if_icmplt     228
       213: aload_0
       214: getfield      #81                 // Field heights:[S
       217: iload         9
       219: aload         7
       221: invokevirtual #85                 // Method java/nio/ByteBuffer.getShort:()S
       224: sastore
       225: goto          236
       228: aload_0
       229: getfield      #81                 // Field heights:[S
       232: iload         9
       234: iconst_0
       235: sastore
       236: iinc          9, 1
       239: goto          197
       242: nop
       243: getstatic     #91                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       246: astore        4
       248: aload_2
       249: aload_3
       250: invokestatic  #97                 // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       253: goto          274
       256: astore        5
       258: aload         5
       260: astore_3
       261: aload         5
       263: athrow
       264: astore        5
       266: aload_2
       267: aload_3
       268: invokestatic  #97                 // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       271: aload         5
       273: athrow
       274: nop
       275: return
      Exception table:
         from    to  target type
            21   248   256   Class java/lang/Throwable
            21   248   264   any
           256   264   264   any
           264   266   264   any
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile, class java/io/File, class java/io/Closeable, null, class java/io/RandomAccessFile, int, class java/nio/channels/FileChannel, class java/nio/ByteBuffer, int ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 96 /* same_locals_1_stack_item */
          stack = [ class java/nio/ByteBuffer ]
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ int, int ]
        frame_type = 30 /* same */
        frame_type = 7 /* same */
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile, class java/io/File, class java/io/Closeable, null ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile, class java/io/File, class java/io/Closeable, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile, class java/io/File, class java/io/Closeable, null, class kotlin/Unit, int, class java/nio/channels/FileChannel, class java/nio/ByteBuffer, int, int, int ]
          stack = []
      LineNumberTable:
        line 191: 0
        line 196: 4
        line 197: 5
        line 198: 31
        line 199: 38
        line 200: 55
        line 201: 63
        line 203: 69
        line 205: 76
        line 206: 77
        line 207: 84
        line 208: 91
        line 209: 98
        line 211: 108
        line 212: 115
        line 213: 122
        line 214: 129
        line 217: 138
        line 218: 144
        line 218: 150
        line 219: 153
        line 220: 159
        line 221: 165
        line 225: 172
        line 226: 187
        line 227: 204
        line 228: 213
        line 230: 228
        line 226: 236
        line 233: 242
        line 197: 246
        line 234: 274
        line 191: 275
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          144      27     9 totalCells   I
          153      18    10   dim   I
          190      52     9     i   I
           31     212     5 $i$a$-use-GeoIndexer$ConvDatFile$1   I
           38     205     6 channel   Ljava/nio/channels/FileChannel;
           55     188     7 buffer   Ljava/nio/ByteBuffer;
           76     167     8 fileSize   I
           28     215     4   raf   Ljava/io/RandomAccessFile;
            0     276     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
            0     276     1  file   Ljava/io/File;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final java.lang.Short getHeight(int, int);
    descriptor: (II)Ljava/lang/Short;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: iload_1
         1: iflt          24
         4: iload_1
         5: aload_0
         6: getfield      #64                 // Field width:I
         9: if_icmpge     24
        12: iload_2
        13: iflt          24
        16: iload_2
        17: aload_0
        18: getfield      #67                 // Field height:I
        21: if_icmplt     26
        24: aconst_null
        25: areturn
        26: aload_0
        27: getfield      #81                 // Field heights:[S
        30: iload_2
        31: aload_0
        32: getfield      #64                 // Field width:I
        35: imul
        36: iload_1
        37: iadd
        38: saload
        39: invokestatic  #123                // Method java/lang/Short.valueOf:(S)Ljava/lang/Short;
        42: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 1 /* same */
      LineNumberTable:
        line 237: 0
        line 238: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;
            0      43     1     x   I
            0      43     2     y   I
    RuntimeInvisibleAnnotations:
      0: #117()
        org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #142= #2 of #141;   // ConvDatFile=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #126(#127=[I#128,I#129,I#130],#131=I#132,#133=I#134,#135=[s#136],#137=[s#110,s#138,s#111,s#112,s#5,s#6,s#78,s#138,s#61,s#138,s#65,s#115,s#138,s#124,s#125,s#116,s#139])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile;","","file","Ljava/io/File;","<init>","(Ljava/io/File;)V","heights","","width","","height","getHeight","","x","y","(II)Ljava/lang/Short;","Brproject"]
    )
