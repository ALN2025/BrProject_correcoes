// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion$RegionKey
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineBridge$Companion$RegionKey.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey.class
  Last modified 9 de jul de 2026; size 2872 bytes
  MD5 checksum b9eadeb49ceceaf410673083a62f2ae3
  Compiled from "GeoEngineBridge.kt"
final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion$RegionKey
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 10, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               (II)V
   #7 = Utf8               ()V
   #8 = NameAndType        #5:#7          // "<init>":()V
   #9 = Methodref          #4.#8          // java/lang/Object."<init>":()V
  #10 = Utf8               x
  #11 = Utf8               I
  #12 = NameAndType        #10:#11        // x:I
  #13 = Fieldref           #2.#12         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey.x:I
  #14 = Utf8               y
  #15 = NameAndType        #14:#11        // y:I
  #16 = Fieldref           #2.#15         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey.y:I
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
  #19 = Utf8               getX
  #20 = Utf8               ()I
  #21 = Utf8               getY
  #22 = Utf8               toString
  #23 = Utf8               ()Ljava/lang/String;
  #24 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #25 = Utf8               [\u0001, \u0001]
  #26 = String             #25            // [\u0001, \u0001]
  #27 = Utf8               java/lang/invoke/StringConcatFactory
  #28 = Class              #27            // java/lang/invoke/StringConcatFactory
  #29 = Utf8               makeConcatWithConstants
  #30 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #31 = NameAndType        #29:#30        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #32 = Methodref          #28.#31        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #33 = MethodHandle       6:#32          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #34 = Utf8               (II)Ljava/lang/String;
  #35 = NameAndType        #29:#34        // makeConcatWithConstants:(II)Ljava/lang/String;
  #36 = InvokeDynamic      #0:#35         // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #37 = Utf8               component1
  #38 = Utf8               component2
  #39 = Utf8               copy
  #40 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
  #41 = NameAndType        #5:#6          // "<init>":(II)V
  #42 = Methodref          #2.#41         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey."<init>":(II)V
  #43 = Utf8               copy$default
  #44 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;IIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
  #45 = NameAndType        #39:#40        // copy:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
  #46 = Methodref          #2.#45         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey.copy:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
  #47 = Utf8               hashCode
  #48 = Utf8               java/lang/Integer
  #49 = Class              #48            // java/lang/Integer
  #50 = Utf8               (I)I
  #51 = NameAndType        #47:#50        // hashCode:(I)I
  #52 = Methodref          #49.#51        // java/lang/Integer.hashCode:(I)I
  #53 = Utf8               result
  #54 = Utf8               equals
  #55 = Utf8               (Ljava/lang/Object;)Z
  #56 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #57 = Utf8               other
  #58 = Utf8               Ljava/lang/Object;
  #59 = Utf8               Lkotlin/Metadata;
  #60 = Utf8               mv
  #61 = Integer            2
  #62 = Integer            3
  #63 = Integer            0
  #64 = Utf8               k
  #65 = Integer            1
  #66 = Utf8               xi
  #67 = Integer            48
  #68 = Utf8               d1
  #69 = Utf8               \u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\n\u001a\u00020\u000bH\u0096\u0080\u0004J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013
  #70 = Utf8               d2
  #71 = Utf8
  #72 = Utf8               Brproject
  #73 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
  #74 = Class              #73            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
  #75 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #76 = Class              #75            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #77 = Utf8               Companion
  #78 = Utf8               RegionKey
  #79 = Utf8               GeoEngineBridge.kt
  #80 = Utf8               Code
  #81 = Utf8               LineNumberTable
  #82 = Utf8               LocalVariableTable
  #83 = Utf8               RuntimeInvisibleAnnotations
  #84 = Utf8               StackMapTable
  #85 = Utf8               RuntimeInvisibleParameterAnnotations
  #86 = Utf8               InnerClasses
  #87 = Utf8               SourceFile
  #88 = Utf8               RuntimeVisibleAnnotations
  #89 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion$RegionKey(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field x:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field y:I
        14: return
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
            0      15     1     x   I
            0      15     2     y   I

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: aload_0
         5: getfield      #16                 // Field y:I
         8: invokedynamic #36,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
    RuntimeInvisibleAnnotations:
      0: #24()
        org.jetbrains.annotations.NotNull

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field y:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;

  public final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion$RegionKey copy(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #42                 // Method "<init>":(II)V
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
            0      10     1     x   I
            0      10     2     y   I
    RuntimeInvisibleAnnotations:
      0: #24()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion$RegionKey copy$default(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$Companion$RegionKey, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;IIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_1
         2: iand
         3: ifeq          11
         6: aload_0
         7: getfield      #13                 // Field x:I
        10: istore_1
        11: iload_3
        12: iconst_2
        13: iand
        14: ifeq          22
        17: aload_0
        18: getfield      #16                 // Field y:I
        21: istore_2
        22: aload_0
        23: iload_1
        24: iload_2
        25: invokevirtual #46                 // Method copy:(II)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
        28: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 10 /* same */

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: invokestatic  #52                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field y:I
        16: invokestatic  #52                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      15     1 result   I
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field x:I
        25: aload_2
        26: getfield      #13                 // Field x:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #16                 // Field y:I
        38: aload_2
        39: getfield      #16                 // Field y:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: iconst_1
        48: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey ]
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;
            0      49     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #56()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #77= #74 of #76;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
SourceFile: "GeoEngineBridge.kt"
RuntimeVisibleAnnotations:
  0: #59(#60=[I#61,I#62,I#63],#64=I#65,#66=I#67,#68=[s#69],#70=[s#18,s#71,s#10,s#71,s#14,s#5,s#6,s#19,s#20,s#21,s#22,s#71,s#37,s#38,s#39,s#54,s#71,s#57,s#47,s#72])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\n\u001a\u00020\u000bH\u0096\u0080\u0004J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion$RegionKey;","","x","","y","<init>","(II)V","getX","()I","getY","toString","","component1","component2","copy","equals","","other","hashCode","Brproject"]
    )
BootstrapMethods:
  0: #33 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #26 [\u0001, \u0001]
