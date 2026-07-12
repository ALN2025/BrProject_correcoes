// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.PathNode
// File: ext\mods\gameserver\geoengine\pathfinding\model\PathNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/PathNode.class
  Last modified 9 de jul de 2026; size 6320 bytes
  MD5 checksum 38c7200ad0431d8945d63e0a25ea0025
  Compiled from "PathNode.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.PathNode
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 20, methods: 21, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/lang/foreign/MemorySegment;I)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               segment
   #11 = Utf8               Ljava/lang/foreign/MemorySegment;
   #12 = NameAndType        #10:#11       // segment:Ljava/lang/foreign/MemorySegment;
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.segment:Ljava/lang/foreign/MemorySegment;
   #14 = Utf8               nodeId
   #15 = Utf8               I
   #16 = NameAndType        #14:#15       // nodeId:I
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.nodeId:I
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #20 = Utf8               getNodeId
   #21 = Utf8               ()I
   #22 = Utf8               getX
   #23 = Utf8               java/lang/foreign/ValueLayout
   #24 = Class              #23           // java/lang/foreign/ValueLayout
   #25 = Utf8               JAVA_SHORT
   #26 = Utf8               Ljava/lang/foreign/ValueLayout$OfShort;
   #27 = NameAndType        #25:#26       // JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
   #28 = Fieldref           #24.#27       // java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
   #29 = Utf8               java/lang/foreign/MemorySegment
   #30 = Class              #29           // java/lang/foreign/MemorySegment
   #31 = Utf8               get
   #32 = Utf8               (Ljava/lang/foreign/ValueLayout$OfShort;J)S
   #33 = NameAndType        #31:#32       // get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
   #34 = InterfaceMethodref #30.#33       // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
   #35 = Integer            65535
   #36 = Utf8               getY
   #37 = Long               2l
   #39 = Utf8               getZ
   #40 = Utf8               JAVA_BYTE
   #41 = Utf8               Ljava/lang/foreign/ValueLayout$OfByte;
   #42 = NameAndType        #40:#41       // JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
   #43 = Fieldref           #24.#42       // java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
   #44 = Long               4l
   #46 = Utf8               (Ljava/lang/foreign/ValueLayout$OfByte;J)B
   #47 = NameAndType        #31:#46       // get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
   #48 = InterfaceMethodref #30.#47       // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
   #49 = Utf8               getFlags
   #50 = Utf8               ()B
   #51 = Long               5l
   #53 = Utf8               getJpsDistances
   #54 = Utf8               JAVA_INT
   #55 = Utf8               Ljava/lang/foreign/ValueLayout$OfInt;
   #56 = NameAndType        #54:#55       // JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
   #57 = Fieldref           #24.#56       // java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
   #58 = Long               8l
   #60 = Utf8               (Ljava/lang/foreign/ValueLayout$OfInt;J)I
   #61 = NameAndType        #31:#60       // get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
   #62 = InterfaceMethodref #30.#61       // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
   #63 = Utf8               getSuccessorOffset
   #64 = Long               12l
   #66 = Utf8               getSuccessorCount
   #67 = Long               16l
   #69 = Utf8               getClusterId
   #70 = Long               20l
   #72 = Utf8               isWalkable
   #73 = Utf8               ()Z
   #74 = NameAndType        #49:#50       // getFlags:()B
   #75 = Methodref          #2.#74        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getFlags:()B
   #76 = Utf8               getHasDynamicCheck
   #77 = Utf8               getJpsDistance
   #78 = Utf8               (I)I
   #79 = NameAndType        #53:#21       // getJpsDistances:()I
   #80 = Methodref          #2.#79        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getJpsDistances:()I
   #81 = Utf8               direction
   #82 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
   #83 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #84 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #85 = Class              #84           // ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #86 = Utf8               ordinal
   #87 = NameAndType        #86:#21       // ordinal:()I
   #88 = Methodref          #85.#87       // ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
   #89 = NameAndType        #77:#78       // getJpsDistance:(I)I
   #90 = Methodref          #2.#89        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getJpsDistance:(I)I
   #91 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #92 = Utf8               toLocation
   #93 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #94 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
   #95 = Class              #94           // ext/mods/gameserver/geoengine/pathfinding/model/Location
   #96 = NameAndType        #22:#21       // getX:()I
   #97 = Methodref          #2.#96        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getX:()I
   #98 = Integer            65536
   #99 = NameAndType        #36:#21       // getY:()I
  #100 = Methodref          #2.#99        // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getY:()I
  #101 = Integer            40960
  #102 = NameAndType        #39:#21       // getZ:()I
  #103 = Methodref          #2.#102       // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getZ:()I
  #104 = Utf8               (III)V
  #105 = NameAndType        #5:#104       // "<init>":(III)V
  #106 = Methodref          #95.#105      // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
  #107 = Utf8               toGeoLocation
  #108 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #109 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  #110 = Class              #109          // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  #111 = Utf8               (IIS)V
  #112 = NameAndType        #5:#111       // "<init>":(IIS)V
  #113 = Methodref          #110.#112     // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
  #114 = Utf8               equals
  #115 = Utf8               (Ljava/lang/Object;)Z
  #116 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #117 = Utf8               other
  #118 = Utf8               Ljava/lang/Object;
  #119 = Utf8               hashCode
  #120 = Utf8               toString
  #121 = Utf8               ()Ljava/lang/String;
  #122 = NameAndType        #72:#73       // isWalkable:()Z
  #123 = Methodref          #2.#122       // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
  #124 = Utf8               PathNode(id=\u0001, pos=(\u0001,\u0001,\u0001), walkable=\u0001)
  #125 = String             #124          // PathNode(id=\u0001, pos=(\u0001,\u0001,\u0001), walkable=\u0001)
  #126 = Utf8               java/lang/invoke/StringConcatFactory
  #127 = Class              #126          // java/lang/invoke/StringConcatFactory
  #128 = Utf8               makeConcatWithConstants
  #129 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #130 = NameAndType        #128:#129     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #131 = Methodref          #127.#130     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #132 = MethodHandle       6:#131        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #133 = Utf8               (IIIIZ)Ljava/lang/String;
  #134 = NameAndType        #128:#133     // makeConcatWithConstants:(IIIIZ)Ljava/lang/String;
  #135 = InvokeDynamic      #0:#134       // #0:makeConcatWithConstants:(IIIIZ)Ljava/lang/String;
  #136 = Utf8               (Ljava/lang/foreign/MemorySegment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #137 = NameAndType        #5:#6         // "<init>":(Ljava/lang/foreign/MemorySegment;I)V
  #138 = Methodref          #2.#137       // ext/mods/gameserver/geoengine/pathfinding/model/PathNode."<init>":(Ljava/lang/foreign/MemorySegment;I)V
  #139 = Utf8               $constructor_marker
  #140 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #141 = Utf8               <clinit>
  #142 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
  #143 = Class              #142          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
  #144 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #145 = NameAndType        #5:#144       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #146 = Methodref          #143.#145     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #147 = Utf8               Companion
  #148 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
  #149 = NameAndType        #147:#148     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
  #150 = Fieldref           #2.#149       // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
  #151 = Utf8               NODE_SIZE
  #152 = Utf8               J
  #153 = Long               32l
  #155 = Utf8               OFFSET_X
  #156 = Long               0l
  #158 = Utf8               OFFSET_Y
  #159 = Utf8               OFFSET_Z
  #160 = Utf8               OFFSET_FLAGS
  #161 = Utf8               OFFSET_JPS_DISTANCES
  #162 = Utf8               OFFSET_SUCCESSOR_OFFSET
  #163 = Utf8               OFFSET_SUCCESSOR_COUNT
  #164 = Utf8               OFFSET_CLUSTER_ID
  #165 = Utf8               FLAG_WALKABLE
  #166 = Integer            1
  #167 = Utf8               FLAG_DYNAMIC
  #168 = Integer            2
  #169 = Utf8               FLAG_MULTILAYER
  #170 = Integer            4
  #171 = Utf8               FLAG_RESERVED1
  #172 = Integer            8
  #173 = Utf8               FLAG_RESERVED2
  #174 = Integer            16
  #175 = Utf8               FLAG_RESERVED3
  #176 = Integer            32
  #177 = Utf8               FLAG_RESERVED4
  #178 = Integer            64
  #179 = Utf8               FLAG_RESERVED5
  #180 = Integer            128
  #181 = Utf8               Lkotlin/Metadata;
  #182 = Utf8               mv
  #183 = Integer            3
  #184 = Integer            0
  #185 = Utf8               k
  #186 = Utf8               xi
  #187 = Integer            48
  #188 = Utf8               d1
  #189 = Utf8               \u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\'J\u0014\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010*\u001a\u00020\u0005H\u0096\u0080\u0004J\n\u0010+\u001a\u00020,H\u0096\u0080\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006.
  #190 = Utf8               d2
  #191 = Utf8
  #192 = Utf8               x
  #193 = Utf8               y
  #194 = Utf8               z
  #195 = Utf8               flags
  #196 = Utf8               jpsDistances
  #197 = Utf8               successorOffset
  #198 = Utf8               successorCount
  #199 = Utf8               clusterId
  #200 = Utf8               hasDynamicCheck
  #201 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #202 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #203 = Utf8               Brproject
  #204 = Utf8               java/lang/foreign/ValueLayout$OfByte
  #205 = Class              #204          // java/lang/foreign/ValueLayout$OfByte
  #206 = Utf8               OfByte
  #207 = Utf8               java/lang/foreign/ValueLayout$OfInt
  #208 = Class              #207          // java/lang/foreign/ValueLayout$OfInt
  #209 = Utf8               OfInt
  #210 = Utf8               java/lang/foreign/ValueLayout$OfShort
  #211 = Class              #210          // java/lang/foreign/ValueLayout$OfShort
  #212 = Utf8               OfShort
  #213 = Utf8               PathNode.kt
  #214 = Utf8               RuntimeInvisibleAnnotations
  #215 = Utf8               ConstantValue
  #216 = Utf8               Code
  #217 = Utf8               LineNumberTable
  #218 = Utf8               LocalVariableTable
  #219 = Utf8               StackMapTable
  #220 = Utf8               RuntimeInvisibleParameterAnnotations
  #221 = Utf8               InnerClasses
  #222 = Utf8               SourceFile
  #223 = Utf8               RuntimeVisibleAnnotations
  #224 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.PathNode$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #83()
        org.jetbrains.annotations.NotNull

  public static final long NODE_SIZE;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 32l

  public static final long OFFSET_X;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 0l

  public static final long OFFSET_Y;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 2l

  public static final long OFFSET_Z;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 4l

  public static final long OFFSET_FLAGS;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 5l

  public static final long OFFSET_JPS_DISTANCES;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 8l

  public static final long OFFSET_SUCCESSOR_OFFSET;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 12l

  public static final long OFFSET_SUCCESSOR_COUNT;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 16l

  public static final long OFFSET_CLUSTER_ID;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 20l

  public static final int FLAG_WALKABLE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int FLAG_DYNAMIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int FLAG_MULTILAYER;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int FLAG_RESERVED1;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int FLAG_RESERVED2;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int FLAG_RESERVED3;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32

  public static final int FLAG_RESERVED4;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 64

  public static final int FLAG_RESERVED5;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 128

  public final int getNodeId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field nodeId:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #28                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
         7: lconst_0
         8: invokeinterface #34,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
        13: ldc           #35                 // int 65535
        15: iand
        16: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #28                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
         7: ldc2_w        #37                 // long 2l
        10: invokeinterface #34,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
        15: ldc           #35                 // int 65535
        17: iand
        18: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #43                 // Field java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
         7: ldc2_w        #44                 // long 4l
        10: invokeinterface #48,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
        15: sipush        255
        18: iand
        19: ireturn
      LineNumberTable:
        line 58: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final byte getFlags();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #43                 // Field java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
         7: ldc2_w        #51                 // long 5l
        10: invokeinterface #48,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
        15: ireturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getJpsDistances();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #57                 // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
         7: ldc2_w        #58                 // long 8l
        10: invokeinterface #62,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
        15: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getSuccessorOffset();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #57                 // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
         7: ldc2_w        #64                 // long 12l
        10: invokeinterface #62,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
        15: ireturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getSuccessorCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #28                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
         7: ldc2_w        #67                 // long 16l
        10: invokeinterface #34,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
        15: ldc           #35                 // int 65535
        17: iand
        18: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getClusterId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: getstatic     #57                 // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
         7: ldc2_w        #70                 // long 20l
        10: invokeinterface #62,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
        15: ireturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final boolean isWalkable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #75                 // Method getFlags:()B
         4: iconst_1
         5: iand
         6: ifeq          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final boolean getHasDynamicCheck();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #75                 // Method getFlags:()B
         4: iconst_2
         5: iand
         6: ifeq          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public final int getJpsDistance(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #80                 // Method getJpsDistances:()I
         4: iload_1
         5: iconst_4
         6: imul
         7: iushr
         8: bipush        15
        10: iand
        11: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
            0      12     1 direction   I

  public final int getJpsDistance(ext.mods.gameserver.geoengine.pathfinding.model.Direction);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #88                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
         5: invokevirtual #90                 // Method getJpsDistance:(I)I
         8: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
            0       9     1 direction   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #83()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.model.Location toLocation();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: new           #95                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location
         3: dup
         4: aload_0
         5: invokevirtual #97                 // Method getX:()I
         8: bipush        16
        10: imul
        11: ldc           #98                 // int 65536
        13: iadd
        14: aload_0
        15: invokevirtual #100                // Method getY:()I
        18: bipush        16
        20: imul
        21: ldc           #101                // int 40960
        23: iadd
        24: aload_0
        25: invokevirtual #103                // Method getZ:()I
        28: bipush        16
        30: imul
        31: invokespecial #106                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        34: areturn
      LineNumberTable:
        line 76: 0
        line 77: 4
        line 78: 14
        line 79: 24
        line 76: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
    RuntimeInvisibleAnnotations:
      0: #83()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation toGeoLocation();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=1, args_size=1
         0: new           #110                // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
         3: dup
         4: aload_0
         5: invokevirtual #97                 // Method getX:()I
         8: aload_0
         9: invokevirtual #100                // Method getY:()I
        12: aload_0
        13: invokevirtual #103                // Method getZ:()I
        16: i2s
        17: invokespecial #113                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
        20: areturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
    RuntimeInvisibleAnnotations:
      0: #83()
        org.jetbrains.annotations.NotNull

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathNode
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #17                 // Field nodeId:I
        20: aload_1
        21: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathNode
        24: getfield      #17                 // Field nodeId:I
        27: if_icmpne     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 85: 0
        line 86: 7
        line 87: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
            0      36     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #116()
          org.jetbrains.annotations.Nullable

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field nodeId:I
         4: ireturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field nodeId:I
         4: aload_0
         5: invokevirtual #97                 // Method getX:()I
         8: aload_0
         9: invokevirtual #100                // Method getY:()I
        12: aload_0
        13: invokevirtual #103                // Method getZ:()I
        16: aload_0
        17: invokevirtual #123                // Method isWalkable:()Z
        20: invokedynamic #135,  0            // InvokeDynamic #0:makeConcatWithConstants:(IIIIZ)Ljava/lang/String;
        25: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
    RuntimeInvisibleAnnotations:
      0: #83()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.model.PathNode(java.lang.foreign.MemorySegment, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/lang/foreign/MemorySegment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokespecial #138                // Method "<init>":(Ljava/lang/foreign/MemorySegment;I)V
         6: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
            0       7     1 segment   Ljava/lang/foreign/MemorySegment;
            0       7     2 nodeId   I
            0       7     3 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #143                // class ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
         3: dup
         4: aconst_null
         5: invokespecial #146                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #150                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
        11: return
}
InnerClasses:
  public static final #147= #143 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  public static #206= #205 of #24;        // OfByte=class java/lang/foreign/ValueLayout$OfByte of class java/lang/foreign/ValueLayout
  public static #209= #208 of #24;        // OfInt=class java/lang/foreign/ValueLayout$OfInt of class java/lang/foreign/ValueLayout
  public static #212= #211 of #24;        // OfShort=class java/lang/foreign/ValueLayout$OfShort of class java/lang/foreign/ValueLayout
SourceFile: "PathNode.kt"
RuntimeVisibleAnnotations:
  0: #181(#182=[I#168,I#183,I#184],#185=I#166,#186=I#187,#188=[s#189],#190=[s#19,s#191,s#10,s#11,s#14,s#191,s#5,s#6,s#20,s#21,s#192,s#22,s#193,s#36,s#194,s#39,s#195,s#191,s#49,s#50,s#196,s#53,s#197,s#63,s#198,s#66,s#199,s#69,s#72,s#191,s#73,s#200,s#76,s#77,s#81,s#91,s#92,s#201,s#107,s#202,s#114,s#117,s#119,s#120,s#191,s#147,s#203])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\'J\u0014\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010*\u001a\u00020\u0005H\u0096\u0080\u0004J\n\u0010+\u001a\u00020,H\u0096\u0080\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006."]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;","","segment","Ljava/lang/foreign/MemorySegment;","nodeId","","<init>","(Ljava/lang/foreign/MemorySegment;I)V","getNodeId","()I","x","getX","y","getY","z","getZ","flags","","getFlags","()B","jpsDistances","getJpsDistances","successorOffset","getSuccessorOffset","successorCount","getSuccessorCount","clusterId","getClusterId","isWalkable","","()Z","hasDynamicCheck","getHasDynamicCheck","getJpsDistance","direction","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","toLocation","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","toGeoLocation","Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","equals","other","hashCode","toString","","Companion","Brproject"]
    )
BootstrapMethods:
  0: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #125 PathNode(id=\u0001, pos=(\u0001,\u0001,\u0001), walkable=\u0001)
