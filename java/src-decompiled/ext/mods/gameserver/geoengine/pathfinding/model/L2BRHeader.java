// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader
// File: ext\mods\gameserver\geoengine\pathfinding\model\L2BRHeader.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.class
  Last modified 9 de jul de 2026; size 5701 bytes
  MD5 checksum 2eda6cfe60025b23b0b9aa9cb89b39e5
  Compiled from "PathNode.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 20, methods: 25, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (JSSSIJJJ)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               magic
   #11 = Utf8               J
   #12 = NameAndType        #10:#11       // magic:J
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.magic:J
   #14 = Utf8               version
   #15 = Utf8               S
   #16 = NameAndType        #14:#15       // version:S
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.version:S
   #18 = Utf8               regionX
   #19 = NameAndType        #18:#15       // regionX:S
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.regionX:S
   #21 = Utf8               regionY
   #22 = NameAndType        #21:#15       // regionY:S
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.regionY:S
   #24 = Utf8               nodeCount
   #25 = Utf8               I
   #26 = NameAndType        #24:#25       // nodeCount:I
   #27 = Fieldref           #2.#26        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.nodeCount:I
   #28 = Utf8               indexOffset
   #29 = NameAndType        #28:#11       // indexOffset:J
   #30 = Fieldref           #2.#29        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.indexOffset:J
   #31 = Utf8               dataOffset
   #32 = NameAndType        #31:#11       // dataOffset:J
   #33 = Fieldref           #2.#32        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.dataOffset:J
   #34 = Utf8               checksum
   #35 = NameAndType        #34:#11       // checksum:J
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.checksum:J
   #37 = Utf8               this
   #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #39 = Utf8               (JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #40 = Long               5490523817655992320l
   #42 = NameAndType        #5:#6         // "<init>":(JSSSIJJJ)V
   #43 = Methodref          #2.#42        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader."<init>":(JSSSIJJJ)V
   #44 = Utf8               getMagic
   #45 = Utf8               ()J
   #46 = Utf8               getVersion
   #47 = Utf8               ()S
   #48 = Utf8               getRegionX
   #49 = Utf8               getRegionY
   #50 = Utf8               getNodeCount
   #51 = Utf8               ()I
   #52 = Utf8               getIndexOffset
   #53 = Utf8               getDataOffset
   #54 = Utf8               getChecksum
   #55 = Utf8               isValid
   #56 = Utf8               ()Z
   #57 = Utf8               component1
   #58 = Utf8               component2
   #59 = Utf8               component3
   #60 = Utf8               component4
   #61 = Utf8               component5
   #62 = Utf8               component6
   #63 = Utf8               component7
   #64 = Utf8               component8
   #65 = Utf8               copy
   #66 = Utf8               (JSSSIJJJ)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #67 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #68 = Utf8               copy$default
   #69 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;JSSSIJJJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #70 = NameAndType        #65:#66       // copy:(JSSSIJJJ)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #71 = Methodref          #2.#70        // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.copy:(JSSSIJJJ)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #72 = Utf8               toString
   #73 = Utf8               ()Ljava/lang/String;
   #74 = Utf8               L2BRHeader(magic=\u0001, version=\u0001, regionX=\u0001, regionY=\u0001, nodeCount=\u0001, indexOffset=\u0001, dataOffset=\u0001, checksum=\u0001)
   #75 = String             #74           // L2BRHeader(magic=\u0001, version=\u0001, regionX=\u0001, regionY=\u0001, nodeCount=\u0001, indexOffset=\u0001, dataOffset=\u0001, checksum=\u0001)
   #76 = Utf8               java/lang/invoke/StringConcatFactory
   #77 = Class              #76           // java/lang/invoke/StringConcatFactory
   #78 = Utf8               makeConcatWithConstants
   #79 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = NameAndType        #78:#79       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #81 = Methodref          #77.#80       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #82 = MethodHandle       6:#81         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #83 = Utf8               (JSSSIJJJ)Ljava/lang/String;
   #84 = NameAndType        #78:#83       // makeConcatWithConstants:(JSSSIJJJ)Ljava/lang/String;
   #85 = InvokeDynamic      #0:#84        // #0:makeConcatWithConstants:(JSSSIJJJ)Ljava/lang/String;
   #86 = Utf8               hashCode
   #87 = Utf8               java/lang/Long
   #88 = Class              #87           // java/lang/Long
   #89 = Utf8               (J)I
   #90 = NameAndType        #86:#89       // hashCode:(J)I
   #91 = Methodref          #88.#90       // java/lang/Long.hashCode:(J)I
   #92 = Utf8               java/lang/Short
   #93 = Class              #92           // java/lang/Short
   #94 = Utf8               (S)I
   #95 = NameAndType        #86:#94       // hashCode:(S)I
   #96 = Methodref          #93.#95       // java/lang/Short.hashCode:(S)I
   #97 = Utf8               java/lang/Integer
   #98 = Class              #97           // java/lang/Integer
   #99 = Utf8               (I)I
  #100 = NameAndType        #86:#99       // hashCode:(I)I
  #101 = Methodref          #98.#100      // java/lang/Integer.hashCode:(I)I
  #102 = Utf8               result
  #103 = Utf8               equals
  #104 = Utf8               (Ljava/lang/Object;)Z
  #105 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #106 = Utf8               other
  #107 = Utf8               Ljava/lang/Object;
  #108 = Utf8               <clinit>
  #109 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
  #110 = Class              #109          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
  #111 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #112 = NameAndType        #5:#111       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #113 = Methodref          #110.#112     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #114 = Utf8               Companion
  #115 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
  #116 = NameAndType        #114:#115     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
  #117 = Fieldref           #2.#116       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
  #118 = Utf8               MAGIC
  #119 = Utf8               VERSION
  #120 = Integer            5
  #121 = Utf8               HEADER_SIZE
  #122 = Long               64l
  #124 = Utf8               OFFSET_MAGIC
  #125 = Long               0l
  #127 = Utf8               OFFSET_VERSION
  #128 = Long               8l
  #130 = Utf8               OFFSET_REGION_X
  #131 = Long               10l
  #133 = Utf8               OFFSET_REGION_Y
  #134 = Long               12l
  #136 = Utf8               OFFSET_NODE_COUNT
  #137 = Long               16l
  #139 = Utf8               OFFSET_INDEX_OFFSET
  #140 = Long               24l
  #142 = Utf8               OFFSET_DATA_OFFSET
  #143 = Long               32l
  #145 = Utf8               OFFSET_CHECKSUM
  #146 = Long               40l
  #148 = Utf8               Lkotlin/Metadata;
  #149 = Utf8               mv
  #150 = Integer            2
  #151 = Integer            3
  #152 = Integer            0
  #153 = Utf8               k
  #154 = Integer            1
  #155 = Utf8               xi
  #156 = Integer            48
  #157 = Utf8               d1
  #158 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\'\u001a\u00020\tHÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+
  #159 = Utf8               d2
  #160 = Utf8
  #161 = Utf8               Brproject
  #162 = Utf8               PathNode.kt
  #163 = Utf8               RuntimeInvisibleAnnotations
  #164 = Utf8               ConstantValue
  #165 = Utf8               Code
  #166 = Utf8               LineNumberTable
  #167 = Utf8               LocalVariableTable
  #168 = Utf8               StackMapTable
  #169 = Utf8               RuntimeInvisibleParameterAnnotations
  #170 = Utf8               InnerClasses
  #171 = Utf8               SourceFile
  #172 = Utf8               RuntimeVisibleAnnotations
  #173 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #67()
        org.jetbrains.annotations.NotNull

  public static final long MAGIC;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 5490523817655992320l

  public static final short VERSION;
    descriptor: S
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public static final long HEADER_SIZE;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 64l

  public static final long OFFSET_MAGIC;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 0l

  public static final long OFFSET_VERSION;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 8l

  public static final long OFFSET_REGION_X;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 10l

  public static final long OFFSET_REGION_Y;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 12l

  public static final long OFFSET_NODE_COUNT;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 16l

  public static final long OFFSET_INDEX_OFFSET;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 24l

  public static final long OFFSET_DATA_OFFSET;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 32l

  public static final long OFFSET_CHECKSUM;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 40l

  public ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader(long, short, short, short, int, long, long, long);
    descriptor: (JSSSIJJJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=13, args_size=9
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #13                 // Field magic:J
         9: aload_0
        10: iload_3
        11: putfield      #17                 // Field version:S
        14: aload_0
        15: iload         4
        17: putfield      #20                 // Field regionX:S
        20: aload_0
        21: iload         5
        23: putfield      #23                 // Field regionY:S
        26: aload_0
        27: iload         6
        29: putfield      #27                 // Field nodeCount:I
        32: aload_0
        33: lload         7
        35: putfield      #30                 // Field indexOffset:J
        38: aload_0
        39: lload         9
        41: putfield      #33                 // Field dataOffset:J
        44: aload_0
        45: lload         11
        47: putfield      #36                 // Field checksum:J
        50: return
      LineNumberTable:
        line 157: 0
        line 158: 4
        line 159: 9
        line 160: 14
        line 161: 20
        line 162: 26
        line 163: 32
        line 164: 38
        line 165: 44
        line 157: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
            0      51     1 magic   J
            0      51     3 version   S
            0      51     4 regionX   S
            0      51     5 regionY   S
            0      51     6 nodeCount   I
            0      51     7 indexOffset   J
            0      51     9 dataOffset   J
            0      51    11 checksum   J

  public ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader(long, short, short, short, int, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=13, locals=15, args_size=11
         0: iload         13
         2: iconst_1
         3: iand
         4: ifeq          11
         7: ldc2_w        #40                 // long 5490523817655992320l
        10: lstore_1
        11: iload         13
        13: iconst_2
        14: iand
        15: ifeq          20
        18: iconst_5
        19: istore_3
        20: aload_0
        21: lload_1
        22: iload_3
        23: iload         4
        25: iload         5
        27: iload         6
        29: lload         7
        31: lload         9
        33: lload         11
        35: invokespecial #43                 // Method "<init>":(JSSSIJJJ)V
        38: return
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 8 /* same */
      LineNumberTable:
        line 157: 0
        line 158: 7
        line 157: 11
        line 159: 18
        line 157: 20
        line 166: 38

  public final long getMagic();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field magic:J
         4: lreturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final short getVersion();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field version:S
         4: ireturn
      LineNumberTable:
        line 159: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final short getRegionX();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field regionX:S
         4: ireturn
      LineNumberTable:
        line 160: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final short getRegionY();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field regionY:S
         4: ireturn
      LineNumberTable:
        line 161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final int getNodeCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field nodeCount:I
         4: ireturn
      LineNumberTable:
        line 162: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long getIndexOffset();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field indexOffset:J
         4: lreturn
      LineNumberTable:
        line 163: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long getDataOffset();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field dataOffset:J
         4: lreturn
      LineNumberTable:
        line 164: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long getChecksum();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field checksum:J
         4: lreturn
      LineNumberTable:
        line 165: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final boolean isValid();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field magic:J
         4: ldc2_w        #40                 // long 5490523817655992320l
         7: lcmp
         8: ifne          23
        11: aload_0
        12: getfield      #17                 // Field version:S
        15: iconst_5
        16: if_icmpne     23
        19: iconst_1
        20: goto          24
        23: iconst_0
        24: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 205: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long component1();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field magic:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final short component2();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field version:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final short component3();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field regionX:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final short component4();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field regionY:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final int component5();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field nodeCount:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long component6();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field indexOffset:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long component7();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field dataOffset:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final long component8();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field checksum:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public final ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader copy(long, short, short, short, int, long, long, long);
    descriptor: (JSSSIJJJ)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=14, locals=13, args_size=9
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
         3: dup
         4: lload_1
         5: iload_3
         6: iload         4
         8: iload         5
        10: iload         6
        12: lload         7
        14: lload         9
        16: lload         11
        18: invokespecial #43                 // Method "<init>":(JSSSIJJJ)V
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
            0      22     1 magic   J
            0      22     3 version   S
            0      22     4 regionX   S
            0      22     5 regionY   S
            0      22     6 nodeCount   I
            0      22     7 indexOffset   J
            0      22     9 dataOffset   J
            0      22    11 checksum   J
    RuntimeInvisibleAnnotations:
      0: #67()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader copy$default(ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader, long, short, short, short, int, long, long, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;JSSSIJJJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=13, locals=15, args_size=11
         0: iload         13
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field magic:J
        11: lstore_1
        12: iload         13
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field version:S
        23: istore_3
        24: iload         13
        26: iconst_4
        27: iand
        28: ifeq          37
        31: aload_0
        32: getfield      #20                 // Field regionX:S
        35: istore        4
        37: iload         13
        39: bipush        8
        41: iand
        42: ifeq          51
        45: aload_0
        46: getfield      #23                 // Field regionY:S
        49: istore        5
        51: iload         13
        53: bipush        16
        55: iand
        56: ifeq          65
        59: aload_0
        60: getfield      #27                 // Field nodeCount:I
        63: istore        6
        65: iload         13
        67: bipush        32
        69: iand
        70: ifeq          79
        73: aload_0
        74: getfield      #30                 // Field indexOffset:J
        77: lstore        7
        79: iload         13
        81: bipush        64
        83: iand
        84: ifeq          93
        87: aload_0
        88: getfield      #33                 // Field dataOffset:J
        91: lstore        9
        93: iload         13
        95: sipush        128
        98: iand
        99: ifeq          108
       102: aload_0
       103: getfield      #36                 // Field checksum:J
       106: lstore        11
       108: aload_0
       109: lload_1
       110: iload_3
       111: iload         4
       113: iload         5
       115: iload         6
       117: lload         7
       119: lload         9
       121: lload         11
       123: invokevirtual #71                 // Method copy:(JSSSIJJJ)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
       126: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field magic:J
         4: aload_0
         5: getfield      #17                 // Field version:S
         8: aload_0
         9: getfield      #20                 // Field regionX:S
        12: aload_0
        13: getfield      #23                 // Field regionY:S
        16: aload_0
        17: getfield      #27                 // Field nodeCount:I
        20: aload_0
        21: getfield      #30                 // Field indexOffset:J
        24: aload_0
        25: getfield      #33                 // Field dataOffset:J
        28: aload_0
        29: getfield      #36                 // Field checksum:J
        32: invokedynamic #85,  0             // InvokeDynamic #0:makeConcatWithConstants:(JSSSIJJJ)Ljava/lang/String;
        37: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
    RuntimeInvisibleAnnotations:
      0: #67()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field magic:J
         4: invokestatic  #91                 // Method java/lang/Long.hashCode:(J)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field version:S
        16: invokestatic  #96                 // Method java/lang/Short.hashCode:(S)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field regionX:S
        29: invokestatic  #96                 // Method java/lang/Short.hashCode:(S)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field regionY:S
        42: invokestatic  #96                 // Method java/lang/Short.hashCode:(S)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #27                 // Field nodeCount:I
        55: invokestatic  #101                // Method java/lang/Integer.hashCode:(I)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #30                 // Field indexOffset:J
        68: invokestatic  #91                 // Method java/lang/Long.hashCode:(J)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #33                 // Field dataOffset:J
        81: invokestatic  #91                 // Method java/lang/Long.hashCode:(J)I
        84: iadd
        85: istore_1
        86: iload_1
        87: bipush        31
        89: imul
        90: aload_0
        91: getfield      #36                 // Field checksum:J
        94: invokestatic  #91                 // Method java/lang/Long.hashCode:(J)I
        97: iadd
        98: istore_1
        99: iload_1
       100: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      93     1 result   I
            0     101     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field magic:J
        25: aload_2
        26: getfield      #13                 // Field magic:J
        29: lcmp
        30: ifeq          35
        33: iconst_0
        34: ireturn
        35: aload_0
        36: getfield      #17                 // Field version:S
        39: aload_2
        40: getfield      #17                 // Field version:S
        43: if_icmpeq     48
        46: iconst_0
        47: ireturn
        48: aload_0
        49: getfield      #20                 // Field regionX:S
        52: aload_2
        53: getfield      #20                 // Field regionX:S
        56: if_icmpeq     61
        59: iconst_0
        60: ireturn
        61: aload_0
        62: getfield      #23                 // Field regionY:S
        65: aload_2
        66: getfield      #23                 // Field regionY:S
        69: if_icmpeq     74
        72: iconst_0
        73: ireturn
        74: aload_0
        75: getfield      #27                 // Field nodeCount:I
        78: aload_2
        79: getfield      #27                 // Field nodeCount:I
        82: if_icmpeq     87
        85: iconst_0
        86: ireturn
        87: aload_0
        88: getfield      #30                 // Field indexOffset:J
        91: aload_2
        92: getfield      #30                 // Field indexOffset:J
        95: lcmp
        96: ifeq          101
        99: iconst_0
       100: ireturn
       101: aload_0
       102: getfield      #33                 // Field dataOffset:J
       105: aload_2
       106: getfield      #33                 // Field dataOffset:J
       109: lcmp
       110: ifeq          115
       113: iconst_0
       114: ireturn
       115: aload_0
       116: getfield      #36                 // Field checksum:J
       119: aload_2
       120: getfield      #36                 // Field checksum:J
       123: lcmp
       124: ifeq          129
       127: iconst_0
       128: ireturn
       129: iconst_1
       130: ireturn
      StackMapTable: number_of_entries = 10
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     131     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
            0     131     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #105()
          org.jetbrains.annotations.Nullable

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #110                // class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
         3: dup
         4: aconst_null
         5: invokespecial #113                // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #117                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
        11: return
}
InnerClasses:
  public static final #114= #110 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
SourceFile: "PathNode.kt"
RuntimeVisibleAnnotations:
  0: #148(#149=[I#150,I#151,I#152],#153=I#154,#155=I#156,#157=[s#158],#159=[s#38,s#160,s#10,s#160,s#14,s#160,s#18,s#21,s#24,s#160,s#28,s#31,s#34,s#5,s#6,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#54,s#55,s#160,s#57,s#58,s#59,s#60,s#61,s#62,s#63,s#64,s#65,s#103,s#106,s#86,s#72,s#160,s#114,s#161])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\'\u001a\u00020\tHÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;","","magic","","version","","regionX","regionY","nodeCount","","indexOffset","dataOffset","checksum","<init>","(JSSSIJJJ)V","getMagic","()J","getVersion","()S","getRegionX","getRegionY","getNodeCount","()I","getIndexOffset","getDataOffset","getChecksum","isValid","","component1","component2","component3","component4","component5","component6","component7","component8","copy","equals","other","hashCode","toString","","Companion","Brproject"]
    )
BootstrapMethods:
  0: #82 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #75 L2BRHeader(magic=\u0001, version=\u0001, regionX=\u0001, regionY=\u0001, nodeCount=\u0001, indexOffset=\u0001, dataOffset=\u0001, checksum=\u0001)
