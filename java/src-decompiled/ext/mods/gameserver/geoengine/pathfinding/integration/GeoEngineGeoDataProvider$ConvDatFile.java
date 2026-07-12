// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider$ConvDatFile
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineGeoDataProvider$ConvDatFile.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile.class
  Last modified 9 de jul de 2026; size 3090 bytes
  MD5 checksum 4e468b7e7a9333ceb3c27ed2fcbaf389
  Compiled from "GeoEngineGeoDataProvider.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider$ConvDatFile
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 2, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile
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
   #22 = Utf8               length
   #23 = Utf8               ()J
   #24 = NameAndType        #22:#23       // length:()J
   #25 = Methodref          #14.#24       // java/io/RandomAccessFile.length:()J
   #26 = Utf8               java/nio/ByteBuffer
   #27 = Class              #26           // java/nio/ByteBuffer
   #28 = Utf8               allocate
   #29 = Utf8               (I)Ljava/nio/ByteBuffer;
   #30 = NameAndType        #28:#29       // allocate:(I)Ljava/nio/ByteBuffer;
   #31 = Methodref          #27.#30       // java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
   #32 = Utf8               java/nio/ByteOrder
   #33 = Class              #32           // java/nio/ByteOrder
   #34 = Utf8               LITTLE_ENDIAN
   #35 = Utf8               Ljava/nio/ByteOrder;
   #36 = NameAndType        #34:#35       // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #37 = Fieldref           #33.#36       // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #38 = Utf8               order
   #39 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #40 = NameAndType        #38:#39       // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #41 = Methodref          #27.#40       // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #42 = Utf8               getChannel
   #43 = Utf8               ()Ljava/nio/channels/FileChannel;
   #44 = NameAndType        #42:#43       // getChannel:()Ljava/nio/channels/FileChannel;
   #45 = Methodref          #14.#44       // java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
   #46 = Utf8               java/nio/channels/FileChannel
   #47 = Class              #46           // java/nio/channels/FileChannel
   #48 = Utf8               read
   #49 = Utf8               (Ljava/nio/ByteBuffer;)I
   #50 = NameAndType        #48:#49       // read:(Ljava/nio/ByteBuffer;)I
   #51 = Methodref          #47.#50       // java/nio/channels/FileChannel.read:(Ljava/nio/ByteBuffer;)I
   #52 = Utf8               flip
   #53 = Utf8               ()Ljava/nio/ByteBuffer;
   #54 = NameAndType        #52:#53       // flip:()Ljava/nio/ByteBuffer;
   #55 = Methodref          #27.#54       // java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
   #56 = Utf8               remaining
   #57 = Utf8               ()I
   #58 = NameAndType        #56:#57       // remaining:()I
   #59 = Methodref          #27.#58       // java/nio/ByteBuffer.remaining:()I
   #60 = Integer            131072
   #61 = Utf8               width
   #62 = Utf8               I
   #63 = NameAndType        #61:#62       // width:I
   #64 = Fieldref           #2.#63        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile.width:I
   #65 = Utf8               height
   #66 = NameAndType        #65:#62       // height:I
   #67 = Fieldref           #2.#66        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile.height:I
   #68 = Integer            32768
   #69 = Utf8               java/lang/Math
   #70 = Class              #69           // java/lang/Math
   #71 = Utf8               sqrt
   #72 = Utf8               (D)D
   #73 = NameAndType        #71:#72       // sqrt:(D)D
   #74 = Methodref          #70.#73       // java/lang/Math.sqrt:(D)D
   #75 = Utf8               getShort
   #76 = Utf8               ()S
   #77 = NameAndType        #75:#76       // getShort:()S
   #78 = Methodref          #27.#77       // java/nio/ByteBuffer.getShort:()S
   #79 = Utf8               heights
   #80 = Utf8               [S
   #81 = NameAndType        #79:#80       // heights:[S
   #82 = Fieldref           #2.#81        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile.heights:[S
   #83 = Utf8               kotlin/Unit
   #84 = Class              #83           // kotlin/Unit
   #85 = Utf8               INSTANCE
   #86 = Utf8               Lkotlin/Unit;
   #87 = NameAndType        #85:#86       // INSTANCE:Lkotlin/Unit;
   #88 = Fieldref           #84.#87       // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #89 = Utf8               kotlin/io/CloseableKt
   #90 = Class              #89           // kotlin/io/CloseableKt
   #91 = Utf8               closeFinally
   #92 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #93 = NameAndType        #91:#92       // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #94 = Methodref          #90.#93       // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #95 = Utf8               dim
   #96 = Utf8               $i$a$-use-GeoEngineGeoDataProvider$ConvDatFile$1
   #97 = Utf8               buffer
   #98 = Utf8               Ljava/nio/ByteBuffer;
   #99 = Utf8               raf
  #100 = Utf8               Ljava/io/RandomAccessFile;
  #101 = Utf8               this
  #102 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
  #103 = Utf8               file
  #104 = Utf8               Ljava/io/File;
  #105 = Utf8               java/io/File
  #106 = Class              #105          // java/io/File
  #107 = Class              #80           // "[S"
  #108 = Utf8               getHeight
  #109 = Utf8               (II)Ljava/lang/Short;
  #110 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #111 = Utf8               java/lang/Short
  #112 = Class              #111          // java/lang/Short
  #113 = Utf8               valueOf
  #114 = Utf8               (S)Ljava/lang/Short;
  #115 = NameAndType        #113:#114     // valueOf:(S)Ljava/lang/Short;
  #116 = Methodref          #112.#115     // java/lang/Short.valueOf:(S)Ljava/lang/Short;
  #117 = Utf8               x
  #118 = Utf8               y
  #119 = Utf8               Lkotlin/Metadata;
  #120 = Utf8               mv
  #121 = Integer            2
  #122 = Integer            3
  #123 = Integer            0
  #124 = Utf8               k
  #125 = Integer            1
  #126 = Utf8               xi
  #127 = Integer            48
  #128 = Utf8               d1
  #129 = Utf8               \u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010
  #130 = Utf8               d2
  #131 = Utf8
  #132 = Utf8               Brproject
  #133 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
  #134 = Class              #133          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
  #135 = Utf8               ConvDatFile
  #136 = Utf8               GeoEngineGeoDataProvider.kt
  #137 = Utf8               RuntimeInvisibleAnnotations
  #138 = Utf8               Code
  #139 = Utf8               StackMapTable
  #140 = Utf8               LineNumberTable
  #141 = Utf8               LocalVariableTable
  #142 = Utf8               RuntimeInvisibleParameterAnnotations
  #143 = Utf8               InnerClasses
  #144 = Utf8               SourceFile
  #145 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineGeoDataProvider$ConvDatFile(java.io.File);
    descriptor: (Ljava/io/File;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=12, args_size=2
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
        33: invokevirtual #25                 // Method java/io/RandomAccessFile.length:()J
        36: l2i
        37: invokestatic  #31                 // Method java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        40: getstatic     #37                 // Field java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        43: invokevirtual #41                 // Method java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        46: astore        6
        48: aload         4
        50: invokevirtual #45                 // Method java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        53: aload         6
        55: invokevirtual #51                 // Method java/nio/channels/FileChannel.read:(Ljava/nio/ByteBuffer;)I
        58: pop
        59: aload         6
        61: invokevirtual #55                 // Method java/nio/ByteBuffer.flip:()Ljava/nio/ByteBuffer;
        64: pop
        65: nop
        66: aload         6
        68: invokevirtual #59                 // Method java/nio/ByteBuffer.remaining:()I
        71: ldc           #60                 // int 131072
        73: if_icmplt     93
        76: aload_0
        77: sipush        256
        80: putfield      #64                 // Field width:I
        83: aload_0
        84: sipush        256
        87: putfield      #67                 // Field height:I
        90: goto          146
        93: aload         6
        95: invokevirtual #59                 // Method java/nio/ByteBuffer.remaining:()I
        98: ldc           #68                 // int 32768
       100: if_icmplt     120
       103: aload_0
       104: sipush        128
       107: putfield      #64                 // Field width:I
       110: aload_0
       111: sipush        128
       114: putfield      #67                 // Field height:I
       117: goto          146
       120: aload         6
       122: invokevirtual #59                 // Method java/nio/ByteBuffer.remaining:()I
       125: iconst_2
       126: idiv
       127: i2d
       128: invokestatic  #74                 // Method java/lang/Math.sqrt:(D)D
       131: d2i
       132: istore        7
       134: aload_0
       135: iload         7
       137: putfield      #64                 // Field width:I
       140: aload_0
       141: iload         7
       143: putfield      #67                 // Field height:I
       146: aload_0
       147: iconst_0
       148: istore        7
       150: aload_0
       151: getfield      #64                 // Field width:I
       154: aload_0
       155: getfield      #67                 // Field height:I
       158: imul
       159: istore        8
       161: iload         8
       163: newarray       short
       165: astore        9
       167: astore        10
       169: iload         7
       171: iload         8
       173: if_icmpge     209
       176: iload         7
       178: istore        11
       180: aload         9
       182: iload         11
       184: aload         6
       186: invokevirtual #59                 // Method java/nio/ByteBuffer.remaining:()I
       189: iconst_2
       190: if_icmplt     201
       193: aload         6
       195: invokevirtual #78                 // Method java/nio/ByteBuffer.getShort:()S
       198: goto          202
       201: iconst_0
       202: sastore
       203: iinc          7, 1
       206: goto          169
       209: aload         10
       211: aload         9
       213: putfield      #82                 // Field heights:[S
       216: nop
       217: getstatic     #88                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       220: astore        4
       222: aload_2
       223: aload_3
       224: invokestatic  #94                 // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       227: goto          248
       230: astore        5
       232: aload         5
       234: astore_3
       235: aload         5
       237: athrow
       238: astore        5
       240: aload_2
       241: aload_3
       242: invokestatic  #94                 // Method kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
       245: aload         5
       247: athrow
       248: nop
       249: return
      Exception table:
         from    to  target type
            21   222   230   Class java/lang/Throwable
            21   222   238   any
           230   238   238   any
           238   240   238   any
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, null, class java/io/RandomAccessFile, int, class java/nio/ByteBuffer ]
          stack = []
        frame_type = 26 /* same */
        frame_type = 25 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, null, class java/io/RandomAccessFile, int, class java/nio/ByteBuffer, int, int, class "[S", class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, null, class java/io/RandomAccessFile, int, class java/nio/ByteBuffer, int, int, class "[S", class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, int ]
          stack = [ class "[S", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, null, class java/io/RandomAccessFile, int, class java/nio/ByteBuffer, int, int, class "[S", class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, int ]
          stack = [ class "[S", int, int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, null ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile, class java/io/File, class java/io/Closeable, null, class kotlin/Unit, int, class java/nio/ByteBuffer, int, int, class "[S", class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile ]
          stack = []
      LineNumberTable:
        line 135: 0
        line 140: 4
        line 141: 5
        line 142: 31
        line 143: 40
        line 142: 46
        line 144: 48
        line 145: 59
        line 147: 65
        line 148: 66
        line 149: 93
        line 151: 120
        line 151: 131
        line 152: 134
        line 156: 146
        line 157: 184
        line 156: 203
        line 159: 216
        line 141: 220
        line 160: 248
        line 135: 249
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          134      12     7   dim   I
           31     186     5 $i$a$-use-GeoEngineGeoDataProvider$ConvDatFile$1   I
           48     169     6 buffer   Ljava/nio/ByteBuffer;
           28     189     4   raf   Ljava/io/RandomAccessFile;
            0     250     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
            0     250     1  file   Ljava/io/File;
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
        27: getfield      #82                 // Field heights:[S
        30: iload_2
        31: aload_0
        32: getfield      #64                 // Field width:I
        35: imul
        36: iload_1
        37: iadd
        38: saload
        39: invokestatic  #116                // Method java/lang/Short.valueOf:(S)Ljava/lang/Short;
        42: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 1 /* same */
      LineNumberTable:
        line 163: 0
        line 164: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;
            0      43     1     x   I
            0      43     2     y   I
    RuntimeInvisibleAnnotations:
      0: #110()
        org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #135= #2 of #134;   // ConvDatFile=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider
SourceFile: "GeoEngineGeoDataProvider.kt"
RuntimeVisibleAnnotations:
  0: #119(#120=[I#121,I#122,I#123],#124=I#125,#126=I#127,#128=[s#129],#130=[s#102,s#131,s#103,s#104,s#5,s#6,s#79,s#131,s#61,s#131,s#65,s#108,s#131,s#117,s#118,s#109,s#132])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineGeoDataProvider$ConvDatFile;","","file","Ljava/io/File;","<init>","(Ljava/io/File;)V","heights","","width","","height","getHeight","","x","y","(II)Ljava/lang/Short;","Brproject"]
    )
