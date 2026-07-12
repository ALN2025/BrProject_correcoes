// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.PathNodeBuilder
// File: ext\mods\gameserver\geoengine\pathfinding\model\PathNodeBuilder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.class
  Last modified 9 de jul de 2026; size 5656 bytes
  MD5 checksum 1ee3b386906f1bf85eabd70846743489
  Compiled from "PathNode.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.PathNodeBuilder
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 25, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
   #11 = Utf8               getX
   #12 = Utf8               ()I
   #13 = Utf8               x
   #14 = Utf8               I
   #15 = NameAndType        #13:#14       // x:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.x:I
   #17 = Utf8               setX
   #18 = Utf8               (I)V
   #19 = Utf8               <set-?>
   #20 = Utf8               getY
   #21 = Utf8               y
   #22 = NameAndType        #21:#14       // y:I
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.y:I
   #24 = Utf8               setY
   #25 = Utf8               getZ
   #26 = Utf8               z
   #27 = NameAndType        #26:#14       // z:I
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.z:I
   #29 = Utf8               setZ
   #30 = Utf8               getFlags
   #31 = Utf8               ()B
   #32 = Utf8               flags
   #33 = Utf8               B
   #34 = NameAndType        #32:#33       // flags:B
   #35 = Fieldref           #2.#34        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.flags:B
   #36 = Utf8               setFlags
   #37 = Utf8               (B)V
   #38 = Utf8               getJpsDistances
   #39 = Utf8               jpsDistances
   #40 = NameAndType        #39:#14       // jpsDistances:I
   #41 = Fieldref           #2.#40        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.jpsDistances:I
   #42 = Utf8               setJpsDistances
   #43 = Utf8               getSuccessorOffset
   #44 = Utf8               successorOffset
   #45 = NameAndType        #44:#14       // successorOffset:I
   #46 = Fieldref           #2.#45        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.successorOffset:I
   #47 = Utf8               setSuccessorOffset
   #48 = Utf8               getSuccessorCount
   #49 = Utf8               successorCount
   #50 = NameAndType        #49:#14       // successorCount:I
   #51 = Fieldref           #2.#50        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.successorCount:I
   #52 = Utf8               setSuccessorCount
   #53 = Utf8               getClusterId
   #54 = Utf8               clusterId
   #55 = NameAndType        #54:#14       // clusterId:I
   #56 = Fieldref           #2.#55        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.clusterId:I
   #57 = Utf8               setClusterId
   #58 = Utf8               setPosition
   #59 = Utf8               (IIS)V
   #60 = Utf8               kotlin/ranges/RangesKt
   #61 = Class              #60           // kotlin/ranges/RangesKt
   #62 = Utf8               coerceIn
   #63 = Utf8               (III)I
   #64 = NameAndType        #62:#63       // coerceIn:(III)I
   #65 = Methodref          #61.#64       // kotlin/ranges/RangesKt.coerceIn:(III)I
   #66 = Utf8               geoX
   #67 = Utf8               geoY
   #68 = Utf8               worldZ
   #69 = Utf8               S
   #70 = Utf8               setWalkable
   #71 = Utf8               (Z)V
   #72 = Utf8               walkable
   #73 = Utf8               Z
   #74 = Utf8               setDynamic
   #75 = Utf8               dynamic
   #76 = Utf8               setJpsDistance
   #77 = Utf8               (II)V
   #78 = Utf8               shift
   #79 = Utf8               mask
   #80 = Utf8               direction
   #81 = Utf8               distance
   #82 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Direction;I)V
   #83 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #84 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #85 = Class              #84           // ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #86 = Utf8               ordinal
   #87 = NameAndType        #86:#12       // ordinal:()I
   #88 = Methodref          #85.#87       // ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
   #89 = NameAndType        #76:#77       // setJpsDistance:(II)V
   #90 = Methodref          #2.#89        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setJpsDistance:(II)V
   #91 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #92 = Utf8               writeTo
   #93 = Utf8               (Ljava/lang/foreign/MemorySegment;J)V
   #94 = Utf8               java/lang/foreign/ValueLayout
   #95 = Class              #94           // java/lang/foreign/ValueLayout
   #96 = Utf8               JAVA_SHORT
   #97 = Utf8               Ljava/lang/foreign/ValueLayout$OfShort;
   #98 = NameAndType        #96:#97       // JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
   #99 = Fieldref           #95.#98       // java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
  #100 = Utf8               java/lang/foreign/MemorySegment
  #101 = Class              #100          // java/lang/foreign/MemorySegment
  #102 = Utf8               set
  #103 = Utf8               (Ljava/lang/foreign/ValueLayout$OfShort;JS)V
  #104 = NameAndType        #102:#103     // set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
  #105 = InterfaceMethodref #101.#104     // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
  #106 = Long               2l
  #108 = Utf8               JAVA_BYTE
  #109 = Utf8               Ljava/lang/foreign/ValueLayout$OfByte;
  #110 = NameAndType        #108:#109     // JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #111 = Fieldref           #95.#110      // java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #112 = Long               4l
  #114 = Utf8               (Ljava/lang/foreign/ValueLayout$OfByte;JB)V
  #115 = NameAndType        #102:#114     // set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
  #116 = InterfaceMethodref #101.#115     // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
  #117 = Long               5l
  #119 = Utf8               JAVA_INT
  #120 = Utf8               Ljava/lang/foreign/ValueLayout$OfInt;
  #121 = NameAndType        #119:#120     // JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
  #122 = Fieldref           #95.#121      // java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
  #123 = Long               8l
  #125 = Utf8               (Ljava/lang/foreign/ValueLayout$OfInt;JI)V
  #126 = NameAndType        #102:#125     // set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
  #127 = InterfaceMethodref #101.#126     // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
  #128 = Long               12l
  #130 = Long               16l
  #132 = Long               20l
  #134 = Utf8               i
  #135 = Utf8               segment
  #136 = Utf8               Ljava/lang/foreign/MemorySegment;
  #137 = Utf8               offset
  #138 = Utf8               J
  #139 = Utf8               writeTo$default
  #140 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;Ljava/lang/foreign/MemorySegment;JILjava/lang/Object;)V
  #141 = NameAndType        #92:#93       // writeTo:(Ljava/lang/foreign/MemorySegment;J)V
  #142 = Methodref          #2.#141       // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.writeTo:(Ljava/lang/foreign/MemorySegment;J)V
  #143 = Utf8               build
  #144 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
  #145 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
  #146 = Class              #145          // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
  #147 = Utf8               (IIIBIIII)V
  #148 = NameAndType        #5:#147       // "<init>":(IIIBIIII)V
  #149 = Methodref          #146.#148     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData."<init>":(IIIBIIII)V
  #150 = Utf8               Lkotlin/Metadata;
  #151 = Utf8               mv
  #152 = Integer            2
  #153 = Integer            3
  #154 = Integer            0
  #155 = Utf8               k
  #156 = Integer            1
  #157 = Utf8               xi
  #158 = Integer            48
  #159 = Utf8               d1
  #160 = Utf8               \u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020*J\u0016\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005J\u0016\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u0002002\u0006\u0010/\u001a\u00020\u0005J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205J\u0006\u00106\u001a\u000207R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u00068
  #161 = Utf8               d2
  #162 = Utf8
  #163 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
  #164 = Utf8               Brproject
  #165 = Utf8               java/lang/foreign/ValueLayout$OfByte
  #166 = Class              #165          // java/lang/foreign/ValueLayout$OfByte
  #167 = Utf8               OfByte
  #168 = Utf8               java/lang/foreign/ValueLayout$OfInt
  #169 = Class              #168          // java/lang/foreign/ValueLayout$OfInt
  #170 = Utf8               OfInt
  #171 = Utf8               java/lang/foreign/ValueLayout$OfShort
  #172 = Class              #171          // java/lang/foreign/ValueLayout$OfShort
  #173 = Utf8               OfShort
  #174 = Utf8               PathNode.kt
  #175 = Utf8               Code
  #176 = Utf8               LineNumberTable
  #177 = Utf8               LocalVariableTable
  #178 = Utf8               StackMapTable
  #179 = Utf8               RuntimeInvisibleParameterAnnotations
  #180 = Utf8               RuntimeInvisibleAnnotations
  #181 = Utf8               InnerClasses
  #182 = Utf8               SourceFile
  #183 = Utf8               RuntimeVisibleAnnotations
{
  public ext.mods.gameserver.geoengine.pathfinding.model.PathNodeBuilder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setX(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #16                 // Field x:I
         5: return
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setY(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #23                 // Field y:I
         5: return
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setZ(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #28                 // Field z:I
         5: return
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final byte getFlags();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field flags:B
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setFlags(byte);
    descriptor: (B)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #35                 // Field flags:B
         5: return
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   B

  public final int getJpsDistances();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field jpsDistances:I
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setJpsDistances(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #41                 // Field jpsDistances:I
         5: return
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final int getSuccessorOffset();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field successorOffset:I
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setSuccessorOffset(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #46                 // Field successorOffset:I
         5: return
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final int getSuccessorCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #51                 // Field successorCount:I
         4: ireturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setSuccessorCount(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #51                 // Field successorCount:I
         5: return
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final int getClusterId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field clusterId:I
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;

  public final void setClusterId(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #56                 // Field clusterId:I
         5: return
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0       6     1 <set-?>   I

  public final void setPosition(int, int, short);
    descriptor: (IIS)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: putfield      #16                 // Field x:I
         5: aload_0
         6: iload_2
         7: putfield      #23                 // Field y:I
        10: aload_0
        11: iload_3
        12: iconst_4
        13: ishr
        14: iconst_0
        15: sipush        255
        18: invokestatic  #65                 // Method kotlin/ranges/RangesKt.coerceIn:(III)I
        21: putfield      #28                 // Field z:I
        24: return
      LineNumberTable:
        line 102: 0
        line 103: 5
        line 104: 10
        line 105: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0      25     1  geoX   I
            0      25     2  geoY   I
            0      25     3 worldZ   S

  public final void setWalkable(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: ifeq          15
         5: aload_0
         6: getfield      #35                 // Field flags:B
         9: iconst_1
        10: ior
        11: i2b
        12: goto          23
        15: aload_0
        16: getfield      #35                 // Field flags:B
        19: bipush        -2
        21: iand
        22: i2b
        23: putfield      #35                 // Field flags:B
        26: return
      StackMapTable: number_of_entries = 2
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder, int ]
      LineNumberTable:
        line 107: 0
        line 108: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0      27     1 walkable   Z

  public final void setDynamic(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: ifeq          15
         5: aload_0
         6: getfield      #35                 // Field flags:B
         9: iconst_2
        10: ior
        11: i2b
        12: goto          23
        15: aload_0
        16: getfield      #35                 // Field flags:B
        19: bipush        -3
        21: iand
        22: i2b
        23: putfield      #35                 // Field flags:B
        26: return
      StackMapTable: number_of_entries = 2
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder, int ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder, int ]
      LineNumberTable:
        line 110: 0
        line 111: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0      27     1 dynamic   Z

  public final void setJpsDistance(int, int);
    descriptor: (II)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=3
         0: iload_1
         1: iconst_4
         2: imul
         3: istore_3
         4: bipush        15
         6: iload_3
         7: ishl
         8: istore        4
        10: aload_0
        11: aload_0
        12: getfield      #41                 // Field jpsDistances:I
        15: iload         4
        17: iconst_m1
        18: ixor
        19: iand
        20: iload_2
        21: bipush        15
        23: iand
        24: iload_3
        25: ishl
        26: ior
        27: putfield      #41                 // Field jpsDistances:I
        30: return
      LineNumberTable:
        line 114: 0
        line 115: 4
        line 116: 10
        line 117: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      27     3 shift   I
           10      21     4  mask   I
            0      31     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0      31     1 direction   I
            0      31     2 distance   I

  public final void setJpsDistance(ext.mods.gameserver.geoengine.pathfinding.model.Direction, int);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Direction;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #88                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
         5: iload_2
         6: invokevirtual #90                 // Method setJpsDistance:(II)V
         9: return
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0      10     1 direction   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
            0      10     2 distance   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #83()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final void writeTo(java.lang.foreign.MemorySegment, long);
    descriptor: (Ljava/lang/foreign/MemorySegment;J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=3
         0: aload_1
         1: getstatic     #99                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
         4: lload_2
         5: lconst_0
         6: ladd
         7: aload_0
         8: getfield      #16                 // Field x:I
        11: i2s
        12: invokeinterface #105,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
        17: aload_1
        18: getstatic     #99                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        21: lload_2
        22: ldc2_w        #106                // long 2l
        25: ladd
        26: aload_0
        27: getfield      #23                 // Field y:I
        30: i2s
        31: invokeinterface #105,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
        36: aload_1
        37: getstatic     #111                // Field java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
        40: lload_2
        41: ldc2_w        #112                // long 4l
        44: ladd
        45: aload_0
        46: getfield      #28                 // Field z:I
        49: i2b
        50: invokeinterface #116,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
        55: aload_1
        56: getstatic     #111                // Field java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
        59: lload_2
        60: ldc2_w        #117                // long 5l
        63: ladd
        64: aload_0
        65: getfield      #35                 // Field flags:B
        68: invokeinterface #116,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
        73: aload_1
        74: getstatic     #122                // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
        77: lload_2
        78: ldc2_w        #123                // long 8l
        81: ladd
        82: aload_0
        83: getfield      #41                 // Field jpsDistances:I
        86: invokeinterface #127,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
        91: aload_1
        92: getstatic     #122                // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
        95: lload_2
        96: ldc2_w        #128                // long 12l
        99: ladd
       100: aload_0
       101: getfield      #46                 // Field successorOffset:I
       104: invokeinterface #127,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
       109: aload_1
       110: getstatic     #99                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
       113: lload_2
       114: ldc2_w        #130                // long 16l
       117: ladd
       118: aload_0
       119: getfield      #51                 // Field successorCount:I
       122: i2s
       123: invokeinterface #105,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
       128: aload_1
       129: getstatic     #122                // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
       132: lload_2
       133: ldc2_w        #132                // long 20l
       136: ladd
       137: aload_0
       138: getfield      #56                 // Field clusterId:I
       141: invokeinterface #127,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
       146: bipush        24
       148: istore        4
       150: iload         4
       152: bipush        32
       154: if_icmpge     178
       157: aload_1
       158: getstatic     #111                // Field java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
       161: lload_2
       162: iload         4
       164: i2l
       165: ladd
       166: iconst_0
       167: invokeinterface #116,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
       172: iinc          4, 1
       175: goto          150
       178: return
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 150
          locals = [ int ]
        frame_type = 27 /* same */
      LineNumberTable:
        line 121: 0
        line 122: 17
        line 123: 36
        line 124: 55
        line 125: 73
        line 126: 91
        line 127: 109
        line 128: 128
        line 129: 146
        line 130: 157
        line 129: 172
        line 132: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          150      28     4     i   I
            0     179     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
            0     179     1 segment   Ljava/lang/foreign/MemorySegment;
            0     179     2 offset   J
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #83()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public static void writeTo$default(ext.mods.gameserver.geoengine.pathfinding.model.PathNodeBuilder, java.lang.foreign.MemorySegment, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;Ljava/lang/foreign/MemorySegment;JILjava/lang/Object;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=5
         0: iload         4
         2: iconst_2
         3: iand
         4: ifeq          9
         7: lconst_0
         8: lstore_2
         9: aload_0
        10: aload_1
        11: lload_2
        12: invokevirtual #142                // Method writeTo:(Ljava/lang/foreign/MemorySegment;J)V
        15: return
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */
      LineNumberTable:
        line 120: 0

  public final ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData build();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=1, args_size=1
         0: new           #146                // class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
         3: dup
         4: aload_0
         5: getfield      #16                 // Field x:I
         8: aload_0
         9: getfield      #23                 // Field y:I
        12: aload_0
        13: getfield      #28                 // Field z:I
        16: aload_0
        17: getfield      #35                 // Field flags:B
        20: aload_0
        21: getfield      #41                 // Field jpsDistances:I
        24: aload_0
        25: getfield      #46                 // Field successorOffset:I
        28: aload_0
        29: getfield      #51                 // Field successorCount:I
        32: aload_0
        33: getfield      #56                 // Field clusterId:I
        36: invokespecial #149                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData."<init>":(IIIBIIII)V
        39: areturn
      LineNumberTable:
        line 133: 0
        line 134: 4
        line 135: 16
        line 136: 20
        line 137: 24
        line 138: 28
        line 139: 32
        line 133: 36
        line 140: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
    RuntimeInvisibleAnnotations:
      0: #83()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static #167= #166 of #95;        // OfByte=class java/lang/foreign/ValueLayout$OfByte of class java/lang/foreign/ValueLayout
  public static #170= #169 of #95;        // OfInt=class java/lang/foreign/ValueLayout$OfInt of class java/lang/foreign/ValueLayout
  public static #173= #172 of #95;        // OfShort=class java/lang/foreign/ValueLayout$OfShort of class java/lang/foreign/ValueLayout
SourceFile: "PathNode.kt"
RuntimeVisibleAnnotations:
  0: #150(#151=[I#152,I#153,I#154],#155=I#156,#157=I#158,#159=[s#160],#161=[s#10,s#162,s#5,s#6,s#13,s#162,s#11,s#12,s#17,s#18,s#21,s#20,s#24,s#26,s#25,s#29,s#32,s#162,s#30,s#31,s#36,s#37,s#39,s#38,s#42,s#44,s#43,s#47,s#49,s#48,s#52,s#54,s#53,s#57,s#58,s#162,s#66,s#67,s#68,s#162,s#70,s#72,s#162,s#74,s#75,s#76,s#80,s#81,s#91,s#92,s#135,s#136,s#137,s#162,s#143,s#163,s#164])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020*J\u0016\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005J\u0016\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u0002002\u0006\u0010/\u001a\u00020\u0005J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u000205J\u0006\u00106\u001a\u000207R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u00068"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;","","<init>","()V","x","","getX","()I","setX","(I)V","y","getY","setY","z","getZ","setZ","flags","","getFlags","()B","setFlags","(B)V","jpsDistances","getJpsDistances","setJpsDistances","successorOffset","getSuccessorOffset","setSuccessorOffset","successorCount","getSuccessorCount","setSuccessorCount","clusterId","getClusterId","setClusterId","setPosition","","geoX","geoY","worldZ","","setWalkable","walkable","","setDynamic","dynamic","setJpsDistance","direction","distance","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","writeTo","segment","Ljava/lang/foreign/MemorySegment;","offset","","build","Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;","Brproject"]
    )
