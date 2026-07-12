// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService$MapBounds.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.class
  Last modified 9 de jul de 2026; size 3348 bytes
  MD5 checksum f07fd23d9dff6340a1219313a5c536d1
  Compiled from "L2BRWarmUpService.kt"
final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 14, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               (IIII)V
   #7 = Utf8               ()V
   #8 = NameAndType        #5:#7          // "<init>":()V
   #9 = Methodref          #4.#8          // java/lang/Object."<init>":()V
  #10 = Utf8               minX
  #11 = Utf8               I
  #12 = NameAndType        #10:#11        // minX:I
  #13 = Fieldref           #2.#12         // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.minX:I
  #14 = Utf8               minY
  #15 = NameAndType        #14:#11        // minY:I
  #16 = Fieldref           #2.#15         // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.minY:I
  #17 = Utf8               maxX
  #18 = NameAndType        #17:#11        // maxX:I
  #19 = Fieldref           #2.#18         // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.maxX:I
  #20 = Utf8               maxY
  #21 = NameAndType        #20:#11        // maxY:I
  #22 = Fieldref           #2.#21         // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.maxY:I
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #25 = Utf8               getMinX
  #26 = Utf8               ()I
  #27 = Utf8               getMinY
  #28 = Utf8               getMaxX
  #29 = Utf8               getMaxY
  #30 = Utf8               component1
  #31 = Utf8               component2
  #32 = Utf8               component3
  #33 = Utf8               component4
  #34 = Utf8               copy
  #35 = Utf8               (IIII)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #36 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #37 = NameAndType        #5:#6          // "<init>":(IIII)V
  #38 = Methodref          #2.#37         // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds."<init>":(IIII)V
  #39 = Utf8               copy$default
  #40 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;IIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #41 = NameAndType        #34:#35        // copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #42 = Methodref          #2.#41         // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #43 = Utf8               toString
  #44 = Utf8               ()Ljava/lang/String;
  #45 = Utf8               MapBounds(minX=\u0001, minY=\u0001, maxX=\u0001, maxY=\u0001)
  #46 = String             #45            // MapBounds(minX=\u0001, minY=\u0001, maxX=\u0001, maxY=\u0001)
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
  #83 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  #84 = Class              #83            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  #85 = Utf8               MapBounds
  #86 = Utf8               L2BRWarmUpService.kt
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
  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field minX:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field minY:I
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field maxX:I
        19: aload_0
        20: iload         4
        22: putfield      #22                 // Field maxY:I
        25: return
      LineNumberTable:
        line 244: 0
        line 245: 4
        line 246: 9
        line 247: 14
        line 248: 19
        line 244: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
            0      26     1  minX   I
            0      26     2  minY   I
            0      26     3  maxX   I
            0      26     4  maxY   I

  public final int getMinX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: ireturn
      LineNumberTable:
        line 245: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int getMinY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field minY:I
         4: ireturn
      LineNumberTable:
        line 246: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int getMaxX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field maxX:I
         4: ireturn
      LineNumberTable:
        line 247: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int getMaxY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field maxY:I
         4: ireturn
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field minY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field maxX:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final int component4();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field maxY:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

  public final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds copy(int, int, int, int);
    descriptor: (IIII)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: invokespecial #38                 // Method "<init>":(IIII)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
            0      13     1  minX   I
            0      13     2  minY   I
            0      13     3  maxX   I
            0      13     4  maxY   I
    RuntimeInvisibleAnnotations:
      0: #36()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds copy$default(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds, int, int, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;IIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field minX:I
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field minY:I
        23: istore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field maxX:I
        35: istore_3
        36: iload         5
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #22                 // Field maxY:I
        48: istore        4
        50: aload_0
        51: iload_1
        52: iload_2
        53: iload_3
        54: iload         4
        56: invokevirtual #42                 // Method copy:(IIII)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
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
         1: getfield      #13                 // Field minX:I
         4: aload_0
         5: getfield      #16                 // Field minY:I
         8: aload_0
         9: getfield      #19                 // Field maxX:I
        12: aload_0
        13: getfield      #22                 // Field maxY:I
        16: invokedynamic #56,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIII)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
    RuntimeInvisibleAnnotations:
      0: #36()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field minX:I
         4: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field minY:I
        16: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field maxX:I
        29: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #22                 // Field maxY:I
        42: invokestatic  #62                 // Method java/lang/Integer.hashCode:(I)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field minX:I
        25: aload_2
        26: getfield      #13                 // Field minX:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field minY:I
        38: aload_2
        39: getfield      #16                 // Field minY:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #19                 // Field maxX:I
        51: aload_2
        52: getfield      #19                 // Field maxX:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #22                 // Field maxY:I
        64: aload_2
        65: getfield      #22                 // Field maxY:I
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
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
            0      75     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #66()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRWarmUpService.kt"
RuntimeVisibleAnnotations:
  0: #69(#70=[I#71,I#72,I#73],#74=I#75,#76=I#77,#78=[s#79],#80=[s#24,s#81,s#10,s#81,s#14,s#17,s#20,s#5,s#6,s#25,s#26,s#27,s#28,s#29,s#30,s#31,s#32,s#33,s#34,s#64,s#81,s#67,s#57,s#43,s#81,s#82])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;","","minX","","minY","maxX","maxY","<init>","(IIII)V","getMinX","()I","getMinY","getMaxX","getMaxY","component1","component2","component3","component4","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #53 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #46 MapBounds(minX=\u0001, minY=\u0001, maxX=\u0001, maxY=\u0001)
