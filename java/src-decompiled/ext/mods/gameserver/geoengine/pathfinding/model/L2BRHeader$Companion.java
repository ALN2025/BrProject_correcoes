// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader$Companion
// File: ext\mods\gameserver\geoengine\pathfinding\model\L2BRHeader$Companion.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion.class
  Last modified 9 de jul de 2026; size 3680 bytes
  MD5 checksum 72ab9478afdb624279e5309cfbbbc5ce
  Compiled from "PathNode.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader$Companion
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               this
   #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
   #11 = Utf8               readFrom
   #12 = Utf8               (Ljava/lang/foreign/MemorySegment;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #13 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #14 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
   #15 = Class              #14           // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
   #16 = Utf8               java/lang/foreign/ValueLayout
   #17 = Class              #16           // java/lang/foreign/ValueLayout
   #18 = Utf8               JAVA_LONG
   #19 = Utf8               Ljava/lang/foreign/ValueLayout$OfLong;
   #20 = NameAndType        #18:#19       // JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
   #21 = Fieldref           #17.#20       // java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
   #22 = Utf8               java/lang/foreign/MemorySegment
   #23 = Class              #22           // java/lang/foreign/MemorySegment
   #24 = Utf8               get
   #25 = Utf8               (Ljava/lang/foreign/ValueLayout$OfLong;J)J
   #26 = NameAndType        #24:#25       // get:(Ljava/lang/foreign/ValueLayout$OfLong;J)J
   #27 = InterfaceMethodref #23.#26       // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfLong;J)J
   #28 = Utf8               JAVA_SHORT
   #29 = Utf8               Ljava/lang/foreign/ValueLayout$OfShort;
   #30 = NameAndType        #28:#29       // JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
   #31 = Fieldref           #17.#30       // java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
   #32 = Long               8l
   #34 = Utf8               (Ljava/lang/foreign/ValueLayout$OfShort;J)S
   #35 = NameAndType        #24:#34       // get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
   #36 = InterfaceMethodref #23.#35       // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
   #37 = Long               10l
   #39 = Long               12l
   #41 = Utf8               JAVA_INT
   #42 = Utf8               Ljava/lang/foreign/ValueLayout$OfInt;
   #43 = NameAndType        #41:#42       // JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
   #44 = Fieldref           #17.#43       // java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
   #45 = Long               16l
   #47 = Utf8               (Ljava/lang/foreign/ValueLayout$OfInt;J)I
   #48 = NameAndType        #24:#47       // get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
   #49 = InterfaceMethodref #23.#48       // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
   #50 = Long               24l
   #52 = Long               32l
   #54 = Long               40l
   #56 = Utf8               (JSSSIJJJ)V
   #57 = NameAndType        #5:#56        // "<init>":(JSSSIJJJ)V
   #58 = Methodref          #15.#57       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader."<init>":(JSSSIJJJ)V
   #59 = Utf8               segment
   #60 = Utf8               Ljava/lang/foreign/MemorySegment;
   #61 = Utf8               writeTo
   #62 = Utf8               (Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;)V
   #63 = Utf8               getMagic
   #64 = Utf8               ()J
   #65 = NameAndType        #63:#64       // getMagic:()J
   #66 = Methodref          #15.#65       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getMagic:()J
   #67 = Utf8               set
   #68 = Utf8               (Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
   #69 = NameAndType        #67:#68       // set:(Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
   #70 = InterfaceMethodref #23.#69       // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
   #71 = Utf8               getVersion
   #72 = Utf8               ()S
   #73 = NameAndType        #71:#72       // getVersion:()S
   #74 = Methodref          #15.#73       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getVersion:()S
   #75 = Utf8               (Ljava/lang/foreign/ValueLayout$OfShort;JS)V
   #76 = NameAndType        #67:#75       // set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
   #77 = InterfaceMethodref #23.#76       // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
   #78 = Utf8               getRegionX
   #79 = NameAndType        #78:#72       // getRegionX:()S
   #80 = Methodref          #15.#79       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getRegionX:()S
   #81 = Utf8               getRegionY
   #82 = NameAndType        #81:#72       // getRegionY:()S
   #83 = Methodref          #15.#82       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getRegionY:()S
   #84 = Utf8               getNodeCount
   #85 = Utf8               ()I
   #86 = NameAndType        #84:#85       // getNodeCount:()I
   #87 = Methodref          #15.#86       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
   #88 = Utf8               (Ljava/lang/foreign/ValueLayout$OfInt;JI)V
   #89 = NameAndType        #67:#88       // set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
   #90 = InterfaceMethodref #23.#89       // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
   #91 = Utf8               getIndexOffset
   #92 = NameAndType        #91:#64       // getIndexOffset:()J
   #93 = Methodref          #15.#92       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
   #94 = Utf8               getDataOffset
   #95 = NameAndType        #94:#64       // getDataOffset:()J
   #96 = Methodref          #15.#95       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getDataOffset:()J
   #97 = Utf8               getChecksum
   #98 = NameAndType        #97:#64       // getChecksum:()J
   #99 = Methodref          #15.#98       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getChecksum:()J
  #100 = Utf8               JAVA_BYTE
  #101 = Utf8               Ljava/lang/foreign/ValueLayout$OfByte;
  #102 = NameAndType        #100:#101     // JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #103 = Fieldref           #17.#102      // java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #104 = Utf8               (Ljava/lang/foreign/ValueLayout$OfByte;JB)V
  #105 = NameAndType        #67:#104      // set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
  #106 = InterfaceMethodref #23.#105      // java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
  #107 = Utf8               i
  #108 = Utf8               I
  #109 = Utf8               header
  #110 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
  #111 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #112 = Methodref          #2.#7         // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion."<init>":()V
  #113 = Utf8               $constructor_marker
  #114 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #115 = Utf8               Lkotlin/Metadata;
  #116 = Utf8               mv
  #117 = Integer            2
  #118 = Integer            3
  #119 = Integer            0
  #120 = Utf8               k
  #121 = Integer            1
  #122 = Utf8               xi
  #123 = Integer            48
  #124 = Utf8               d1
  #125 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018
  #126 = Utf8               d2
  #127 = Utf8
  #128 = Utf8               MAGIC
  #129 = Utf8               VERSION
  #130 = Utf8               HEADER_SIZE
  #131 = Utf8               OFFSET_MAGIC
  #132 = Utf8               OFFSET_VERSION
  #133 = Utf8               OFFSET_REGION_X
  #134 = Utf8               OFFSET_REGION_Y
  #135 = Utf8               OFFSET_NODE_COUNT
  #136 = Utf8               OFFSET_INDEX_OFFSET
  #137 = Utf8               OFFSET_DATA_OFFSET
  #138 = Utf8               OFFSET_CHECKSUM
  #139 = Utf8               Brproject
  #140 = Utf8               Companion
  #141 = Utf8               java/lang/foreign/ValueLayout$OfByte
  #142 = Class              #141          // java/lang/foreign/ValueLayout$OfByte
  #143 = Utf8               OfByte
  #144 = Utf8               java/lang/foreign/ValueLayout$OfInt
  #145 = Class              #144          // java/lang/foreign/ValueLayout$OfInt
  #146 = Utf8               OfInt
  #147 = Utf8               java/lang/foreign/ValueLayout$OfLong
  #148 = Class              #147          // java/lang/foreign/ValueLayout$OfLong
  #149 = Utf8               OfLong
  #150 = Utf8               java/lang/foreign/ValueLayout$OfShort
  #151 = Class              #150          // java/lang/foreign/ValueLayout$OfShort
  #152 = Utf8               OfShort
  #153 = Utf8               PathNode.kt
  #154 = Utf8               Code
  #155 = Utf8               LineNumberTable
  #156 = Utf8               LocalVariableTable
  #157 = Utf8               RuntimeInvisibleAnnotations
  #158 = Utf8               RuntimeInvisibleParameterAnnotations
  #159 = Utf8               StackMapTable
  #160 = Utf8               InnerClasses
  #161 = Utf8               SourceFile
  #162 = Utf8               RuntimeVisibleAnnotations
{
  public final ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader readFrom(java.lang.foreign.MemorySegment);
    descriptor: (Ljava/lang/foreign/MemorySegment;)Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=16, locals=2, args_size=2
         0: new           #15                 // class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
         3: dup
         4: aload_1
         5: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
         8: lconst_0
         9: invokeinterface #27,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfLong;J)J
        14: aload_1
        15: getstatic     #31                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        18: ldc2_w        #32                 // long 8l
        21: invokeinterface #36,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
        26: aload_1
        27: getstatic     #31                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        30: ldc2_w        #37                 // long 10l
        33: invokeinterface #36,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
        38: aload_1
        39: getstatic     #31                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        42: ldc2_w        #39                 // long 12l
        45: invokeinterface #36,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfShort;J)S
        50: aload_1
        51: getstatic     #44                 // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
        54: ldc2_w        #45                 // long 16l
        57: invokeinterface #49,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfInt;J)I
        62: aload_1
        63: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
        66: ldc2_w        #50                 // long 24l
        69: invokeinterface #27,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfLong;J)J
        74: aload_1
        75: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
        78: ldc2_w        #52                 // long 32l
        81: invokeinterface #27,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfLong;J)J
        86: aload_1
        87: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
        90: ldc2_w        #54                 // long 40l
        93: invokeinterface #27,  4           // InterfaceMethod java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfLong;J)J
        98: invokespecial #58                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader."<init>":(JSSSIJJJ)V
       101: areturn
      LineNumberTable:
        line 180: 0
        line 181: 4
        line 182: 14
        line 183: 26
        line 184: 38
        line 185: 50
        line 186: 62
        line 187: 74
        line 188: 86
        line 180: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     102     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
            0     102     1 segment   Ljava/lang/foreign/MemorySegment;
    RuntimeInvisibleAnnotations:
      0: #13()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull

  public final void writeTo(java.lang.foreign.MemorySegment, ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader);
    descriptor: (Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=3
         0: aload_1
         1: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
         4: lconst_0
         5: aload_2
         6: invokevirtual #66                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getMagic:()J
         9: invokeinterface #70,  6           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
        14: aload_1
        15: getstatic     #31                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        18: ldc2_w        #32                 // long 8l
        21: aload_2
        22: invokevirtual #74                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getVersion:()S
        25: invokeinterface #77,  5           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
        30: aload_1
        31: getstatic     #31                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        34: ldc2_w        #37                 // long 10l
        37: aload_2
        38: invokevirtual #80                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getRegionX:()S
        41: invokeinterface #77,  5           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
        46: aload_1
        47: getstatic     #31                 // Field java/lang/foreign/ValueLayout.JAVA_SHORT:Ljava/lang/foreign/ValueLayout$OfShort;
        50: ldc2_w        #39                 // long 12l
        53: aload_2
        54: invokevirtual #83                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getRegionY:()S
        57: invokeinterface #77,  5           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfShort;JS)V
        62: aload_1
        63: getstatic     #44                 // Field java/lang/foreign/ValueLayout.JAVA_INT:Ljava/lang/foreign/ValueLayout$OfInt;
        66: ldc2_w        #45                 // long 16l
        69: aload_2
        70: invokevirtual #87                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        73: invokeinterface #90,  5           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfInt;JI)V
        78: aload_1
        79: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
        82: ldc2_w        #50                 // long 24l
        85: aload_2
        86: invokevirtual #93                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
        89: invokeinterface #70,  6           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
        94: aload_1
        95: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
        98: ldc2_w        #52                 // long 32l
       101: aload_2
       102: invokevirtual #96                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getDataOffset:()J
       105: invokeinterface #70,  6           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
       110: aload_1
       111: getstatic     #21                 // Field java/lang/foreign/ValueLayout.JAVA_LONG:Ljava/lang/foreign/ValueLayout$OfLong;
       114: ldc2_w        #54                 // long 40l
       117: aload_2
       118: invokevirtual #99                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getChecksum:()J
       121: invokeinterface #70,  6           // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfLong;JJ)V
       126: bipush        48
       128: istore_3
       129: iload_3
       130: bipush        64
       132: if_icmpge     153
       135: aload_1
       136: getstatic     #103                // Field java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
       139: iload_3
       140: i2l
       141: iconst_0
       142: invokeinterface #106,  5          // InterfaceMethod java/lang/foreign/MemorySegment.set:(Ljava/lang/foreign/ValueLayout$OfByte;JB)V
       147: iinc          3, 1
       150: goto          129
       153: return
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 129
          locals = [ int ]
        frame_type = 23 /* same */
      LineNumberTable:
        line 192: 0
        line 193: 14
        line 194: 30
        line 195: 46
        line 196: 62
        line 197: 78
        line 198: 94
        line 199: 110
        line 200: 126
        line 201: 135
        line 200: 147
        line 203: 153
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          129      24     3     i   I
            0     154     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
            0     154     1 segment   Ljava/lang/foreign/MemorySegment;
            0     154     2 header   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #13()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #13()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader$Companion(kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokespecial #112                // Method "<init>":()V
         4: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;
            0       5     1 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;
}
InnerClasses:
  public static final #140= #2 of #15;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  public static #143= #142 of #17;        // OfByte=class java/lang/foreign/ValueLayout$OfByte of class java/lang/foreign/ValueLayout
  public static #146= #145 of #17;        // OfInt=class java/lang/foreign/ValueLayout$OfInt of class java/lang/foreign/ValueLayout
  public static #149= #148 of #17;        // OfLong=class java/lang/foreign/ValueLayout$OfLong of class java/lang/foreign/ValueLayout
  public static #152= #151 of #17;        // OfShort=class java/lang/foreign/ValueLayout$OfShort of class java/lang/foreign/ValueLayout
SourceFile: "PathNode.kt"
RuntimeVisibleAnnotations:
  0: #115(#116=[I#117,I#118,I#119],#120=I#121,#122=I#123,#124=[s#125],#126=[s#10,s#127,s#5,s#6,s#128,s#127,s#129,s#127,s#130,s#131,s#132,s#133,s#134,s#135,s#136,s#137,s#138,s#11,s#110,s#59,s#60,s#61,s#127,s#109,s#139])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader$Companion;","","<init>","()V","MAGIC","","VERSION","","HEADER_SIZE","OFFSET_MAGIC","OFFSET_VERSION","OFFSET_REGION_X","OFFSET_REGION_Y","OFFSET_NODE_COUNT","OFFSET_INDEX_OFFSET","OFFSET_DATA_OFFSET","OFFSET_CHECKSUM","readFrom","Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;","segment","Ljava/lang/foreign/MemorySegment;","writeTo","","header","Brproject"]
    )
