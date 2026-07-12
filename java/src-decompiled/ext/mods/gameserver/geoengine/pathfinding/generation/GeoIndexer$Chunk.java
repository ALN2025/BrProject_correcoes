// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$Chunk.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.class
  Last modified 9 de jul de 2026; size 3307 bytes
  MD5 checksum 1831d8ccd18cf6525aebb0f72ef17532
  Compiled from "GeoIndexer.kt"
final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 14, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               (IIII)V
   #7 = Utf8               ()V
   #8 = NameAndType        #5:#7          // "<init>":()V
   #9 = Methodref          #4.#8          // java/lang/Object."<init>":()V
  #10 = Utf8               startX
  #11 = Utf8               I
  #12 = NameAndType        #10:#11        // startX:I
  #13 = Fieldref           #2.#12         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.startX:I
  #14 = Utf8               startY
  #15 = NameAndType        #14:#11        // startY:I
  #16 = Fieldref           #2.#15         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.startY:I
  #17 = Utf8               endX
  #18 = NameAndType        #17:#11        // endX:I
  #19 = Fieldref           #2.#18         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.endX:I
  #20 = Utf8               endY
  #21 = NameAndType        #20:#11        // endY:I
  #22 = Fieldref           #2.#21         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.endY:I
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #25 = Utf8               getStartX
  #26 = Utf8               ()I
  #27 = Utf8               getStartY
  #28 = Utf8               getEndX
  #29 = Utf8               getEndY
  #30 = Utf8               component1
  #31 = Utf8               component2
  #32 = Utf8               component3
  #33 = Utf8               component4
  #34 = Utf8               copy
  #35 = Utf8               (IIII)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #36 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #37 = NameAndType        #5:#6          // "<init>":(IIII)V
  #38 = Methodref          #2.#37         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk."<init>":(IIII)V
  #39 = Utf8               copy$default
  #40 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;IIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #41 = NameAndType        #34:#35        // copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #42 = Methodref          #2.#41         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #43 = Utf8               toString
  #44 = Utf8               ()Ljava/lang/String;
  #45 = Utf8               Chunk(startX=\u0001, startY=\u0001, endX=\u0001, endY=\u0001)
  #46 = String             #45            // Chunk(startX=\u0001, startY=\u0001, endX=\u0001, endY=\u0001)
  #47 = Utf8               java/lang/invoke/StringConcatFactory
  #48 = Class              #47            // java/lang/invoke/StringConcatFactory
  #49 = Utf8               makeConcatWithConstants
  #50 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #51 = NameAndType        #49:#50        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #52 = Methodref          #48.#51        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #53 = MethodHandle       6:#52          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #54 = Utf8               (IIII)Ljava/lang/String;
  #55 = NameAndType        #49:#54        // makeConcatWithConstants:(IIII)Ljava/lang/String;
  #56 = InvokeDynamic      #0:#55         // #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
  #57 = Utf8               hashCode
  #58 = Utf8               java/lang/Integer
  #59 = Class              #58            // java/lang/Integer
  #60 = Utf8               (I)I
  #61 = NameAndType        #57:#60        // hashCode:(I)I
  #62 = Methodref          #59.#61        // java/lang/Integer.hashCode:(I)I
  #63 = Utf8               result
  #64 = Utf8               equals
  #65 = Utf8               (Ljava/lang/Object;)Z
  #66 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #67 = Utf8               other
  #68 = Utf8               Ljava/lang/Object;
  #69 = Utf8               Lkotlin/Metadata;
  #70 = Utf8               mv
  #71 = Integer            2
  #72 = Integer            3
  #73 = Integer            0
  #74 = Utf8               k
  #75 = Integer            1
  #76 = Utf8               xi
  #77 = Integer            48
  #78 = Utf8               d1
  #79 = Utf8               \u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019
  #80 = Utf8               d2
  #81 = Utf8
  #82 = Utf8               Brproject
  #83 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #84 = Class              #83            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #85 = Utf8               Chunk
  #86 = Utf8               GeoIndexer.kt
  #87 = Utf8               Code
  #88 = Utf8               LineNumberTable
  #89 = Utf8               LocalVariableTable
  #90 = Utf8               RuntimeInvisibleAnnotations
  #91 = Utf8               StackMapTable
  #92 = Utf8               RuntimeInvisibleParameterAnnotations
  #93 = Utf8               InnerClasses
  #94 = Utf8               SourceFile
  #95 = Utf8               RuntimeVisibleAnnotations
  #96 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field startX:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field startY:I
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field endX:I
        19: aload_0
        20: iload         4
        22: putfield      #22                 // Field endY:I
        25: return
      LineNumberTable:
        line 447: 0
        line 448: 4
        line 449: 9
        line 450: 14
        line 451: 19
        line 447: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
            0      26     1 startX   I
            0      26     2 startY   I
            0      26     3  endX   I
            0      26     4  endY   I

  public final int getStartX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field startX:I
         4: ireturn
      LineNumberTable:
        line 448: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int getStartY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field startY:I
         4: ireturn
      LineNumberTable:
        line 449: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int getEndX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field endX:I
         4: ireturn
      LineNumberTable:
        line 450: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int getEndY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field endY:I
         4: ireturn
      LineNumberTable:
        line 451: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field startX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field startY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field endX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final int component4();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field endY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk copy(int, int, int, int);
    descriptor: (IIII)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: invokespecial #38                 // Method "<init>":(IIII)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
            0      13     1 startX   I
            0      13     2 startY   I
            0      13     3  endX   I
            0      13     4  endY   I
    RuntimeInvisibleAnnotations:
      0: #36()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk copy$default(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk, int, int, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;IIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field startX:I
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field startY:I
        23: istore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field endX:I
        35: istore_3
        36: iload         5
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #22                 // Field endY:I
        48: istore        4
        50: aload_0
        51: iload_1
        52: iload_2
        53: iload_3
        54: iload         4
        56: invokevirtual #42                 // Method copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
        59: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field startX:I
         4: aload_0
         5: getfield      #16                 // Field startY:I
         8: aload_0
         9: getfield      #19                 // Field endX:I
        12: aload_0
        13: getfield      #22                 // Field endY:I
        16: invokedynamic #56,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
    RuntimeInvisibleAnnotations:
      0: #36()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field startX:I
         4: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field startY:I
        16: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field endX:I
        29: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #22                 // Field endY:I
        42: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field startX:I
        25: aload_2
        26: getfield      #13                 // Field startX:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field startY:I
        38: aload_2
        39: getfield      #16                 // Field startY:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #19                 // Field endX:I
        51: aload_2
        52: getfield      #19                 // Field endX:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #22                 // Field endY:I
        64: aload_2
        65: getfield      #22                 // Field endY:I
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: iconst_1
        74: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
            0      75     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #66()
          org.jetbrains.annotations.Nullable
}
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #69(#70=[I#71,I#72,I#73],#74=I#75,#76=I#77,#78=[s#79],#80=[s#24,s#81,s#10,s#81,s#14,s#17,s#20,s#5,s#6,s#25,s#26,s#27,s#28,s#29,s#30,s#31,s#32,s#33,s#34,s#64,s#81,s#67,s#57,s#43,s#81,s#82])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;","","startX","","startY","endX","endY","<init>","(IIII)V","getStartX","()I","getStartY","getEndX","getEndY","component1","component2","component3","component4","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #53 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #46 Chunk(startX=\u0001, startY=\u0001, endX=\u0001, endY=\u0001)
