// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats
// File: ext\mods\gameserver\geoengine\pathfinding\native\NativeStorage$MemoryStats.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.class
  Last modified 9 de jul de 2026; size 4416 bytes
  MD5 checksum f6d0569a7dc847068cac79fd50ccae8c
  Compiled from "NativeStorage.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 20, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (JJIJJJ)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               fileSize
   #11 = Utf8               J
   #12 = NameAndType        #10:#11       // fileSize:J
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.fileSize:J
   #14 = Utf8               mappedSize
   #15 = NameAndType        #14:#11       // mappedSize:J
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.mappedSize:J
   #17 = Utf8               nodeCount
   #18 = Utf8               I
   #19 = NameAndType        #17:#18       // nodeCount:I
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.nodeCount:I
   #21 = Utf8               indexSize
   #22 = NameAndType        #21:#11       // indexSize:J
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.indexSize:J
   #24 = Utf8               dataOffset
   #25 = NameAndType        #24:#11       // dataOffset:J
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.dataOffset:J
   #27 = Utf8               headerSize
   #28 = NameAndType        #27:#11       // headerSize:J
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.headerSize:J
   #30 = Utf8               this
   #31 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #32 = Utf8               getFileSize
   #33 = Utf8               ()J
   #34 = Utf8               getMappedSize
   #35 = Utf8               getNodeCount
   #36 = Utf8               ()I
   #37 = Utf8               getIndexSize
   #38 = Utf8               getDataOffset
   #39 = Utf8               getHeaderSize
   #40 = Utf8               getIndexEndOffset
   #41 = Utf8               getEfficiency
   #42 = Utf8               ()D
   #43 = Utf8               component1
   #44 = Utf8               component2
   #45 = Utf8               component3
   #46 = Utf8               component4
   #47 = Utf8               component5
   #48 = Utf8               component6
   #49 = Utf8               copy
   #50 = Utf8               (JJIJJJ)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #51 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #52 = NameAndType        #5:#6         // "<init>":(JJIJJJ)V
   #53 = Methodref          #2.#52        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats."<init>":(JJIJJJ)V
   #54 = Utf8               copy$default
   #55 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;JJIJJJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #56 = NameAndType        #49:#50       // copy:(JJIJJJ)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #57 = Methodref          #2.#56        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.copy:(JJIJJJ)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #58 = Utf8               toString
   #59 = Utf8               ()Ljava/lang/String;
   #60 = Utf8               MemoryStats(fileSize=\u0001, mappedSize=\u0001, nodeCount=\u0001, indexSize=\u0001, dataOffset=\u0001, headerSize=\u0001)
   #61 = String             #60           // MemoryStats(fileSize=\u0001, mappedSize=\u0001, nodeCount=\u0001, indexSize=\u0001, dataOffset=\u0001, headerSize=\u0001)
   #62 = Utf8               java/lang/invoke/StringConcatFactory
   #63 = Class              #62           // java/lang/invoke/StringConcatFactory
   #64 = Utf8               makeConcatWithConstants
   #65 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #66 = NameAndType        #64:#65       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #67 = Methodref          #63.#66       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #68 = MethodHandle       6:#67         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #69 = Utf8               (JJIJJJ)Ljava/lang/String;
   #70 = NameAndType        #64:#69       // makeConcatWithConstants:(JJIJJJ)Ljava/lang/String;
   #71 = InvokeDynamic      #0:#70        // #0:makeConcatWithConstants:(JJIJJJ)Ljava/lang/String;
   #72 = Utf8               hashCode
   #73 = Utf8               java/lang/Long
   #74 = Class              #73           // java/lang/Long
   #75 = Utf8               (J)I
   #76 = NameAndType        #72:#75       // hashCode:(J)I
   #77 = Methodref          #74.#76       // java/lang/Long.hashCode:(J)I
   #78 = Utf8               java/lang/Integer
   #79 = Class              #78           // java/lang/Integer
   #80 = Utf8               (I)I
   #81 = NameAndType        #72:#80       // hashCode:(I)I
   #82 = Methodref          #79.#81       // java/lang/Integer.hashCode:(I)I
   #83 = Utf8               result
   #84 = Utf8               equals
   #85 = Utf8               (Ljava/lang/Object;)Z
   #86 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #87 = Utf8               other
   #88 = Utf8               Ljava/lang/Object;
   #89 = Utf8               Lkotlin/Metadata;
   #90 = Utf8               mv
   #91 = Integer            2
   #92 = Integer            3
   #93 = Integer            0
   #94 = Utf8               k
   #95 = Integer            1
   #96 = Utf8               xi
   #97 = Integer            48
   #98 = Utf8               d1
   #99 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\'
  #100 = Utf8               d2
  #101 = Utf8
  #102 = Utf8               indexEndOffset
  #103 = Utf8               efficiency
  #104 = Utf8               Brproject
  #105 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #106 = Class              #105          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #107 = Utf8               MemoryStats
  #108 = Utf8               NativeStorage.kt
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               StackMapTable
  #113 = Utf8               RuntimeInvisibleAnnotations
  #114 = Utf8               RuntimeInvisibleParameterAnnotations
  #115 = Utf8               InnerClasses
  #116 = Utf8               SourceFile
  #117 = Utf8               RuntimeVisibleAnnotations
  #118 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats(long, long, int, long, long, long);
    descriptor: (JJIJJJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=12, args_size=7
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: lload_1
         6: putfield      #13                 // Field fileSize:J
         9: aload_0
        10: lload_3
        11: putfield      #16                 // Field mappedSize:J
        14: aload_0
        15: iload         5
        17: putfield      #20                 // Field nodeCount:I
        20: aload_0
        21: lload         6
        23: putfield      #23                 // Field indexSize:J
        26: aload_0
        27: lload         8
        29: putfield      #26                 // Field dataOffset:J
        32: aload_0
        33: lload         10
        35: putfield      #29                 // Field headerSize:J
        38: return
      LineNumberTable:
        line 246: 0
        line 247: 4
        line 248: 9
        line 249: 14
        line 250: 20
        line 251: 26
        line 252: 32
        line 246: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
            0      39     1 fileSize   J
            0      39     3 mappedSize   J
            0      39     5 nodeCount   I
            0      39     6 indexSize   J
            0      39     8 dataOffset   J
            0      39    10 headerSize   J

  public final long getFileSize();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field fileSize:J
         4: lreturn
      LineNumberTable:
        line 247: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long getMappedSize();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field mappedSize:J
         4: lreturn
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final int getNodeCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field nodeCount:I
         4: ireturn
      LineNumberTable:
        line 249: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long getIndexSize();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field indexSize:J
         4: lreturn
      LineNumberTable:
        line 250: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long getDataOffset();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field dataOffset:J
         4: lreturn
      LineNumberTable:
        line 251: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long getHeaderSize();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field headerSize:J
         4: lreturn
      LineNumberTable:
        line 252: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long getIndexEndOffset();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field headerSize:J
         4: aload_0
         5: getfield      #23                 // Field indexSize:J
         8: ladd
         9: lreturn
      LineNumberTable:
        line 254: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final double getEfficiency();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field fileSize:J
         4: lconst_0
         5: lcmp
         6: ifle          23
         9: aload_0
        10: getfield      #23                 // Field indexSize:J
        13: l2d
        14: aload_0
        15: getfield      #13                 // Field fileSize:J
        18: l2d
        19: ddiv
        20: goto          24
        23: dconst_0
        24: dreturn
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
      LineNumberTable:
        line 255: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long component1();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field fileSize:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long component2();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field mappedSize:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field nodeCount:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long component4();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field indexSize:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long component5();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field dataOffset:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final long component6();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field headerSize:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

  public final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats copy(long, long, int, long, long, long);
    descriptor: (JJIJJJ)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=13, locals=12, args_size=7
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
         3: dup
         4: lload_1
         5: lload_3
         6: iload         5
         8: lload         6
        10: lload         8
        12: lload         10
        14: invokespecial #53                 // Method "<init>":(JJIJJJ)V
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
            0      18     1 fileSize   J
            0      18     3 mappedSize   J
            0      18     5 nodeCount   I
            0      18     6 indexSize   J
            0      18     8 dataOffset   J
            0      18    10 headerSize   J
    RuntimeInvisibleAnnotations:
      0: #51()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats copy$default(ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats, long, long, int, long, long, long, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;JJIJJJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=12, locals=14, args_size=9
         0: iload         12
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field fileSize:J
        11: lstore_1
        12: iload         12
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field mappedSize:J
        23: lstore_3
        24: iload         12
        26: iconst_4
        27: iand
        28: ifeq          37
        31: aload_0
        32: getfield      #20                 // Field nodeCount:I
        35: istore        5
        37: iload         12
        39: bipush        8
        41: iand
        42: ifeq          51
        45: aload_0
        46: getfield      #23                 // Field indexSize:J
        49: lstore        6
        51: iload         12
        53: bipush        16
        55: iand
        56: ifeq          65
        59: aload_0
        60: getfield      #26                 // Field dataOffset:J
        63: lstore        8
        65: iload         12
        67: bipush        32
        69: iand
        70: ifeq          79
        73: aload_0
        74: getfield      #29                 // Field headerSize:J
        77: lstore        10
        79: aload_0
        80: lload_1
        81: lload_3
        82: iload         5
        84: lload         6
        86: lload         8
        88: lload         10
        90: invokevirtual #57                 // Method copy:(JJIJJJ)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
        93: areturn
      StackMapTable: number_of_entries = 6
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field fileSize:J
         4: aload_0
         5: getfield      #16                 // Field mappedSize:J
         8: aload_0
         9: getfield      #20                 // Field nodeCount:I
        12: aload_0
        13: getfield      #23                 // Field indexSize:J
        16: aload_0
        17: getfield      #26                 // Field dataOffset:J
        20: aload_0
        21: getfield      #29                 // Field headerSize:J
        24: invokedynamic #71,  0             // InvokeDynamic #0:makeConcatWithConstants:(JJIJJJ)Ljava/lang/String;
        29: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
    RuntimeInvisibleAnnotations:
      0: #51()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field fileSize:J
         4: invokestatic  #77                 // Method java/lang/Long.hashCode:(J)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field mappedSize:J
        16: invokestatic  #77                 // Method java/lang/Long.hashCode:(J)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field nodeCount:I
        29: invokestatic  #82                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field indexSize:J
        42: invokestatic  #77                 // Method java/lang/Long.hashCode:(J)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #26                 // Field dataOffset:J
        55: invokestatic  #77                 // Method java/lang/Long.hashCode:(J)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #29                 // Field headerSize:J
        68: invokestatic  #77                 // Method java/lang/Long.hashCode:(J)I
        71: iadd
        72: istore_1
        73: iload_1
        74: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      67     1 result   I
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field fileSize:J
        25: aload_2
        26: getfield      #13                 // Field fileSize:J
        29: lcmp
        30: ifeq          35
        33: iconst_0
        34: ireturn
        35: aload_0
        36: getfield      #16                 // Field mappedSize:J
        39: aload_2
        40: getfield      #16                 // Field mappedSize:J
        43: lcmp
        44: ifeq          49
        47: iconst_0
        48: ireturn
        49: aload_0
        50: getfield      #20                 // Field nodeCount:I
        53: aload_2
        54: getfield      #20                 // Field nodeCount:I
        57: if_icmpeq     62
        60: iconst_0
        61: ireturn
        62: aload_0
        63: getfield      #23                 // Field indexSize:J
        66: aload_2
        67: getfield      #23                 // Field indexSize:J
        70: lcmp
        71: ifeq          76
        74: iconst_0
        75: ireturn
        76: aload_0
        77: getfield      #26                 // Field dataOffset:J
        80: aload_2
        81: getfield      #26                 // Field dataOffset:J
        84: lcmp
        85: ifeq          90
        88: iconst_0
        89: ireturn
        90: aload_0
        91: getfield      #29                 // Field headerSize:J
        94: aload_2
        95: getfield      #29                 // Field headerSize:J
        98: lcmp
        99: ifeq          104
       102: iconst_0
       103: ireturn
       104: iconst_1
       105: ireturn
      StackMapTable: number_of_entries = 8
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats ]
        frame_type = 13 /* same */
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     106     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
            0     106     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #86()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #107= #2 of #106;   // MemoryStats=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
SourceFile: "NativeStorage.kt"
RuntimeVisibleAnnotations:
  0: #89(#90=[I#91,I#92,I#93],#94=I#95,#96=I#97,#98=[s#99],#100=[s#31,s#101,s#10,s#101,s#14,s#17,s#101,s#21,s#24,s#27,s#5,s#6,s#32,s#33,s#34,s#35,s#36,s#37,s#38,s#39,s#102,s#40,s#103,s#101,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#84,s#101,s#87,s#72,s#58,s#101,s#104])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\'"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;","","fileSize","","mappedSize","nodeCount","","indexSize","dataOffset","headerSize","<init>","(JJIJJJ)V","getFileSize","()J","getMappedSize","getNodeCount","()I","getIndexSize","getDataOffset","getHeaderSize","indexEndOffset","getIndexEndOffset","efficiency","","getEfficiency","()D","component1","component2","component3","component4","component5","component6","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #68 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #61 MemoryStats(fileSize=\u0001, mappedSize=\u0001, nodeCount=\u0001, indexSize=\u0001, dataOffset=\u0001, headerSize=\u0001)
