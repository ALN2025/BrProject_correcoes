// Bytecode for: ext.mods.gameserver.geoengine.GeoEngine$Companion
// File: ext\mods\gameserver\geoengine\GeoEngine$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/GeoEngine$Companion.class
  Last modified 9 de jul de 2026; size 2859 bytes
  MD5 checksum a77db100ae5112f29d28cffc7e01eeae
  Compiled from "GeoEngine.kt"
public final class ext.mods.gameserver.geoengine.GeoEngine$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/GeoEngine$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 9, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #2 = Class              #1             // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
  #11 = Utf8               get_instance
  #12 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #13 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #14 = Class              #13            // ext/mods/gameserver/geoengine/GeoEngine
  #15 = Utf8               access$get_instance$delegate$cp
  #16 = Utf8               ()Lkotlin/Lazy;
  #17 = NameAndType        #15:#16        // access$get_instance$delegate$cp:()Lkotlin/Lazy;
  #18 = Methodref          #14.#17        // ext/mods/gameserver/geoengine/GeoEngine.access$get_instance$delegate$cp:()Lkotlin/Lazy;
  #19 = Utf8               kotlin/Lazy
  #20 = Class              #19            // kotlin/Lazy
  #21 = Utf8               getValue
  #22 = Utf8               ()Ljava/lang/Object;
  #23 = NameAndType        #21:#22        // getValue:()Ljava/lang/Object;
  #24 = InterfaceMethodref #20.#23        // kotlin/Lazy.getValue:()Ljava/lang/Object;
  #25 = Utf8               getInstance
  #26 = Utf8               Lkotlin/jvm/JvmStatic;
  #27 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #28 = NameAndType        #11:#12        // get_instance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #29 = Methodref          #2.#28         // ext/mods/gameserver/geoengine/GeoEngine$Companion.get_instance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #30 = Utf8               getGeoX
  #31 = Utf8               (I)I
  #32 = Integer            -131072
  #33 = Utf8               worldX
  #34 = Utf8               I
  #35 = Utf8               getGeoY
  #36 = Integer            -262144
  #37 = Utf8               worldY
  #38 = Utf8               getWorldX
  #39 = Utf8               geoX
  #40 = Utf8               getWorldY
  #41 = Utf8               geoY
  #42 = Utf8               calculateGeoObject
  #43 = Utf8               ([[Z)[[B
  #44 = Utf8               [Ljava/lang/Object;
  #45 = Class              #44            // "[Ljava/lang/Object;"
  #46 = Utf8               [B
  #47 = Class              #46            // "[B"
  #48 = Utf8               nswe
  #49 = Utf8               B
  #50 = Utf8               iy
  #51 = Utf8               ix
  #52 = Utf8               width
  #53 = Utf8               height
  #54 = Utf8               result
  #55 = Utf8               [[B
  #56 = Utf8               inside
  #57 = Utf8               [[Z
  #58 = Class              #57            // "[[Z"
  #59 = Class              #55            // "[[B"
  #60 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #61 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/GeoEngine$Companion."<init>":()V
  #62 = Utf8               $constructor_marker
  #63 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #64 = Utf8               Lkotlin/Metadata;
  #65 = Utf8               mv
  #66 = Integer            2
  #67 = Integer            3
  #68 = Integer            0
  #69 = Utf8               k
  #70 = Integer            1
  #71 = Utf8               xi
  #72 = Integer            48
  #73 = Utf8               d1
  #74 = Utf8               \u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0007¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001c
  #75 = Utf8               d2
  #76 = Utf8
  #77 = Utf8               LOGGER
  #78 = Utf8               Lext/mods/commons/logging/CLogger;
  #79 = Utf8               _instance
  #80 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
  #81 = Utf8               _instance$delegate
  #82 = Utf8               Lkotlin/Lazy;
  #83 = Utf8               Brproject
  #84 = Utf8               Companion
  #85 = Utf8               GeoEngine.kt
  #86 = Utf8               Code
  #87 = Utf8               LineNumberTable
  #88 = Utf8               LocalVariableTable
  #89 = Utf8               RuntimeVisibleAnnotations
  #90 = Utf8               RuntimeInvisibleAnnotations
  #91 = Utf8               StackMapTable
  #92 = Utf8               RuntimeInvisibleParameterAnnotations
  #93 = Utf8               InnerClasses
  #94 = Utf8               SourceFile
{
  public final ext.mods.gameserver.geoengine.GeoEngine getInstance();
    descriptor: ()Lext/mods/gameserver/geoengine/GeoEngine;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #29                 // Method get_instance:()Lext/mods/gameserver/geoengine/GeoEngine;
         4: areturn
      LineNumberTable:
        line 1287: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
    RuntimeVisibleAnnotations:
      0: #26()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #27()
        org.jetbrains.annotations.NotNull

  public final int getGeoX(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ldc           #32                 // int -131072
         3: isub
         4: iconst_4
         5: ishr
         6: ireturn
      LineNumberTable:
        line 1290: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
            0       7     1 worldX   I
    RuntimeVisibleAnnotations:
      0: #26()
        kotlin.jvm.JvmStatic

  public final int getGeoY(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ldc           #36                 // int -262144
         3: isub
         4: iconst_4
         5: ishr
         6: ireturn
      LineNumberTable:
        line 1292: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
            0       7     1 worldY   I
    RuntimeVisibleAnnotations:
      0: #26()
        kotlin.jvm.JvmStatic

  public final int getWorldX(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: iconst_4
         2: ishl
         3: ldc           #32                 // int -131072
         5: iadd
         6: bipush        8
         8: iadd
         9: ireturn
      LineNumberTable:
        line 1294: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
            0      10     1  geoX   I
    RuntimeVisibleAnnotations:
      0: #26()
        kotlin.jvm.JvmStatic

  public final int getWorldY(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: iconst_4
         2: ishl
         3: ldc           #36                 // int -262144
         5: iadd
         6: bipush        8
         8: iadd
         9: ireturn
      LineNumberTable:
        line 1296: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
            0      10     1  geoY   I
    RuntimeVisibleAnnotations:
      0: #26()
        kotlin.jvm.JvmStatic

  public final byte[][] calculateGeoObject(boolean[][]);
    descriptor: ([[Z)[[B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=8, args_size=2
         0: aload_1
         1: checkcast     #45                 // class "[Ljava/lang/Object;"
         4: arraylength
         5: istore_2
         6: aload_1
         7: iconst_0
         8: aaload
         9: arraylength
        10: istore_3
        11: iconst_0
        12: istore        5
        14: iload_2
        15: anewarray     #47                 // class "[B"
        18: astore        6
        20: iload         5
        22: iload_2
        23: if_icmpge     44
        26: iload         5
        28: istore        7
        30: aload         6
        32: iload         7
        34: iload_3
        35: newarray       byte
        37: aastore
        38: iinc          5, 1
        41: goto          20
        44: aload         6
        46: astore        4
        48: iconst_0
        49: istore        5
        51: iload         5
        53: iload_2
        54: if_icmpge     220
        57: iconst_0
        58: istore        6
        60: iload         6
        62: iload_3
        63: if_icmpge     214
        66: aload_1
        67: iload         5
        69: aaload
        70: iload         6
        72: baload
        73: ifeq          88
        76: aload         4
        78: iload         5
        80: aaload
        81: iload         6
        83: iconst_0
        84: bastore
        85: goto          208
        88: bipush        15
        90: istore        7
        92: iload         6
        94: iload_3
        95: iconst_1
        96: isub
        97: if_icmpge     120
       100: aload_1
       101: iload         5
       103: aaload
       104: iload         6
       106: iconst_1
       107: iadd
       108: baload
       109: ifeq          120
       112: iload         7
       114: bipush        -5
       116: iand
       117: i2b
       118: istore        7
       120: iload         6
       122: ifle          145
       125: aload_1
       126: iload         5
       128: aaload
       129: iload         6
       131: iconst_1
       132: isub
       133: baload
       134: ifeq          145
       137: iload         7
       139: bipush        -9
       141: iand
       142: i2b
       143: istore        7
       145: iload         5
       147: iload_2
       148: iconst_1
       149: isub
       150: if_icmpge     173
       153: aload_1
       154: iload         5
       156: iconst_1
       157: iadd
       158: aaload
       159: iload         6
       161: baload
       162: ifeq          173
       165: iload         7
       167: bipush        -2
       169: iand
       170: i2b
       171: istore        7
       173: iload         5
       175: ifle          198
       178: aload_1
       179: iload         5
       181: iconst_1
       182: isub
       183: aaload
       184: iload         6
       186: baload
       187: ifeq          198
       190: iload         7
       192: bipush        -3
       194: iand
       195: i2b
       196: istore        7
       198: aload         4
       200: iload         5
       202: aaload
       203: iload         6
       205: iload         7
       207: bastore
       208: iinc          6, 1
       211: goto          60
       214: iinc          5, 1
       217: goto          51
       220: aload         4
       222: areturn
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$Companion, class "[[Z", int, int, top, int, class "[[B" ]
          stack = []
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$Companion, class "[[Z", int, int, class "[[B", int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 24 /* same */
        frame_type = 27 /* same */
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 5 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
      LineNumberTable:
        line 1299: 0
        line 1300: 6
        line 1301: 11
        line 1302: 48
        line 1303: 57
        line 1304: 66
        line 1305: 76
        line 1307: 88
        line 1308: 92
        line 1309: 120
        line 1310: 145
        line 1311: 173
        line 1312: 198
        line 1303: 208
        line 1302: 214
        line 1316: 220
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           92     116     7  nswe   B
           60     154     6    iy   I
           51     169     5    ix   I
            6     217     2 width   I
           11     212     3 height   I
           48     175     4 result   [[B
            0     223     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
            0     223     1 inside   [[Z
    RuntimeVisibleAnnotations:
      0: #26()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #27()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #27()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.GeoEngine$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #61                 // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/GeoEngine$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #84= #2 of #14;     // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
SourceFile: "GeoEngine.kt"
RuntimeVisibleAnnotations:
  0: #64(#65=[I#66,I#67,I#68],#69=I#70,#71=I#72,#73=[s#74],#75=[s#10,s#76,s#5,s#6,s#77,s#78,s#79,s#80,s#11,s#12,s#81,s#82,s#25,s#30,s#76,s#33,s#35,s#37,s#38,s#39,s#40,s#41,s#42,s#76,s#76,s#56,s#76,s#43,s#83])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0007¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001c"]
      d2=["Lext/mods/gameserver/geoengine/GeoEngine$Companion;","","<init>","()V","LOGGER","Lext/mods/commons/logging/CLogger;","_instance","Lext/mods/gameserver/geoengine/GeoEngine;","get_instance","()Lext/mods/gameserver/geoengine/GeoEngine;","_instance$delegate","Lkotlin/Lazy;","getInstance","getGeoX","","worldX","getGeoY","worldY","getWorldX","geoX","getWorldY","geoY","calculateGeoObject","","","inside","","([[Z)[[B","Brproject"]
    )
