// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.Location
// File: ext\mods\gameserver\geoengine\pathfinding\model\Location.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/Location.class
  Last modified 9 de jul de 2026; size 4245 bytes
  MD5 checksum 40f70341bc9d7d42e790b78ee4d9f50c
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.Location
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/Location
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 17, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/Location
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (III)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               x
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // x:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/model/Location.x:I
   #14 = Utf8               y
   #15 = NameAndType        #14:#11       // y:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/model/Location.y:I
   #17 = Utf8               z
   #18 = NameAndType        #17:#11       // z:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/model/Location.z:I
   #20 = Utf8               this
   #21 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #22 = Utf8               getX
   #23 = Utf8               ()I
   #24 = Utf8               getY
   #25 = Utf8               getZ
   #26 = Utf8               toGeo
   #27 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #28 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #29 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
   #30 = Class              #29           // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
   #31 = Integer            65536
   #32 = Integer            40960
   #33 = Utf8               (IIS)V
   #34 = NameAndType        #5:#33        // "<init>":(IIS)V
   #35 = Methodref          #30.#34       // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
   #36 = Utf8               distance2D
   #37 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)D
   #38 = Utf8               java/lang/Math
   #39 = Class              #38           // java/lang/Math
   #40 = Utf8               sqrt
   #41 = Utf8               (D)D
   #42 = NameAndType        #40:#41       // sqrt:(D)D
   #43 = Methodref          #39.#42       // java/lang/Math.sqrt:(D)D
   #44 = Utf8               dx
   #45 = Utf8               D
   #46 = Utf8               dy
   #47 = Utf8               other
   #48 = Utf8               distanceManhattan
   #49 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)I
   #50 = Utf8               abs
   #51 = Utf8               (I)I
   #52 = NameAndType        #50:#51       // abs:(I)I
   #53 = Methodref          #39.#52       // java/lang/Math.abs:(I)I
   #54 = Utf8               component1
   #55 = Utf8               component2
   #56 = Utf8               component3
   #57 = Utf8               copy
   #58 = Utf8               (III)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #59 = NameAndType        #5:#6         // "<init>":(III)V
   #60 = Methodref          #2.#59        // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
   #61 = Utf8               copy$default
   #62 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;IIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #63 = NameAndType        #57:#58       // copy:(III)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #64 = Methodref          #2.#63        // ext/mods/gameserver/geoengine/pathfinding/model/Location.copy:(III)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #65 = Utf8               toString
   #66 = Utf8               ()Ljava/lang/String;
   #67 = Utf8               Location(x=\u0001, y=\u0001, z=\u0001)
   #68 = String             #67           // Location(x=\u0001, y=\u0001, z=\u0001)
   #69 = Utf8               java/lang/invoke/StringConcatFactory
   #70 = Class              #69           // java/lang/invoke/StringConcatFactory
   #71 = Utf8               makeConcatWithConstants
   #72 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #73 = NameAndType        #71:#72       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #74 = Methodref          #70.#73       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #75 = MethodHandle       6:#74         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #76 = Utf8               (III)Ljava/lang/String;
   #77 = NameAndType        #71:#76       // makeConcatWithConstants:(III)Ljava/lang/String;
   #78 = InvokeDynamic      #0:#77        // #0:makeConcatWithConstants:(III)Ljava/lang/String;
   #79 = Utf8               hashCode
   #80 = Utf8               java/lang/Integer
   #81 = Class              #80           // java/lang/Integer
   #82 = NameAndType        #79:#51       // hashCode:(I)I
   #83 = Methodref          #81.#82       // java/lang/Integer.hashCode:(I)I
   #84 = Utf8               result
   #85 = Utf8               equals
   #86 = Utf8               (Ljava/lang/Object;)Z
   #87 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #88 = Utf8               Ljava/lang/Object;
   #89 = Utf8               access$getZERO$cp
   #90 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #91 = Utf8               ZERO
   #92 = NameAndType        #91:#21       // ZERO:Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #93 = Fieldref           #2.#92        // ext/mods/gameserver/geoengine/pathfinding/model/Location.ZERO:Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #94 = Utf8               <clinit>
   #95 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location$Companion
   #96 = Class              #95           // ext/mods/gameserver/geoengine/pathfinding/model/Location$Companion
   #97 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #98 = NameAndType        #5:#97        // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #99 = Methodref          #96.#98       // ext/mods/gameserver/geoengine/pathfinding/model/Location$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #100 = Utf8               Companion
  #101 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location$Companion;
  #102 = NameAndType        #100:#101     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Location$Companion;
  #103 = Fieldref           #2.#102       // ext/mods/gameserver/geoengine/pathfinding/model/Location.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Location$Companion;
  #104 = Utf8               Lkotlin/Metadata;
  #105 = Utf8               mv
  #106 = Integer            2
  #107 = Integer            3
  #108 = Integer            0
  #109 = Utf8               k
  #110 = Integer            1
  #111 = Utf8               xi
  #112 = Integer            48
  #113 = Utf8               d1
  #114 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0000J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001c
  #115 = Utf8               d2
  #116 = Utf8
  #117 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #118 = Utf8               Brproject
  #119 = Utf8               Location.kt
  #120 = Utf8               RuntimeInvisibleAnnotations
  #121 = Utf8               Code
  #122 = Utf8               LineNumberTable
  #123 = Utf8               LocalVariableTable
  #124 = Utf8               RuntimeInvisibleParameterAnnotations
  #125 = Utf8               StackMapTable
  #126 = Utf8               InnerClasses
  #127 = Utf8               SourceFile
  #128 = Utf8               RuntimeVisibleAnnotations
  #129 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.Location$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Location$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #28()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.model.Location(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field x:I
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field y:I
        14: aload_0
        15: iload_3
        16: putfield      #19                 // Field z:I
        19: return
      LineNumberTable:
        line 25: 0
        line 26: 4
        line 27: 9
        line 28: 14
        line 25: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0      20     1     x   I
            0      20     2     y   I
            0      20     3     z   I

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

  public final ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation toGeo();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: new           #30                 // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
         3: dup
         4: aload_0
         5: getfield      #13                 // Field x:I
         8: ldc           #31                 // int 65536
        10: isub
        11: bipush        16
        13: idiv
        14: aload_0
        15: getfield      #16                 // Field y:I
        18: ldc           #32                 // int 40960
        20: isub
        21: bipush        16
        23: idiv
        24: aload_0
        25: getfield      #19                 // Field z:I
        28: bipush        16
        30: idiv
        31: i2s
        32: invokespecial #35                 // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
        35: areturn
      LineNumberTable:
        line 32: 0
        line 33: 4
        line 34: 14
        line 35: 24
        line 32: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleAnnotations:
      0: #28()
        org.jetbrains.annotations.NotNull

  public final double distance2D(ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=6, args_size=2
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: aload_1
         5: getfield      #13                 // Field x:I
         8: isub
         9: i2d
        10: dstore_2
        11: aload_0
        12: getfield      #16                 // Field y:I
        15: aload_1
        16: getfield      #16                 // Field y:I
        19: isub
        20: i2d
        21: dstore        4
        23: dload_2
        24: dload_2
        25: dmul
        26: dload         4
        28: dload         4
        30: dmul
        31: dadd
        32: invokestatic  #43                 // Method java/lang/Math.sqrt:(D)D
        35: dreturn
      LineNumberTable:
        line 40: 0
        line 41: 11
        line 42: 23
        line 42: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11      25     2    dx   D
           23      13     4    dy   D
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0      36     1 other   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #28()
          org.jetbrains.annotations.NotNull

  public final int distanceManhattan(ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: aload_1
         5: getfield      #13                 // Field x:I
         8: isub
         9: invokestatic  #53                 // Method java/lang/Math.abs:(I)I
        12: aload_0
        13: getfield      #16                 // Field y:I
        16: aload_1
        17: getfield      #16                 // Field y:I
        20: isub
        21: invokestatic  #53                 // Method java/lang/Math.abs:(I)I
        24: iadd
        25: aload_0
        26: getfield      #19                 // Field z:I
        29: aload_1
        30: getfield      #19                 // Field z:I
        33: isub
        34: invokestatic  #53                 // Method java/lang/Math.abs:(I)I
        37: iadd
        38: ireturn
      LineNumberTable:
        line 46: 0
        line 46: 12
        line 46: 24
        line 46: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0      39     1 other   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #28()
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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field z:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

  public final ext.mods.gameserver.geoengine.pathfinding.model.Location copy(int, int, int);
    descriptor: (III)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=4
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Location
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokespecial #60                 // Method "<init>":(III)V
        10: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0      11     1     x   I
            0      11     2     y   I
            0      11     3     z   I
    RuntimeInvisibleAnnotations:
      0: #28()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.model.Location copy$default(ext.mods.gameserver.geoengine.pathfinding.model.Location, int, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;IIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field x:I
        11: istore_1
        12: iload         4
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field y:I
        23: istore_2
        24: iload         4
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field z:I
        35: istore_3
        36: aload_0
        37: iload_1
        38: iload_2
        39: iload_3
        40: invokevirtual #64                 // Method copy:(III)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
        43: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: aload_0
         5: getfield      #16                 // Field y:I
         8: aload_0
         9: getfield      #19                 // Field z:I
        12: invokedynamic #78,  0             // InvokeDynamic #0:makeConcatWithConstants:(III)Ljava/lang/String;
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleAnnotations:
      0: #28()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: invokestatic  #83                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field y:I
        16: invokestatic  #83                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field z:I
        29: invokestatic  #83                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      28     1 result   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Location
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
        47: aload_0
        48: getfield      #19                 // Field z:I
        51: aload_2
        52: getfield      #19                 // Field z:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: iconst_1
        61: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/Location ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0      62     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #87()
          org.jetbrains.annotations.Nullable

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Location access$getZERO$cp();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #93                 // Field ZERO:Lext/mods/gameserver/geoengine/pathfinding/model/Location;
         3: areturn
      LineNumberTable:
        line 25: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #96                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location$Companion
         3: dup
         4: aconst_null
         5: invokespecial #99                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Location$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #103                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Location$Companion;
        11: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        14: dup
        15: iconst_0
        16: iconst_0
        17: iconst_0
        18: invokespecial #60                 // Method "<init>":(III)V
        21: putstatic     #93                 // Field ZERO:Lext/mods/gameserver/geoengine/pathfinding/model/Location;
        24: return
      LineNumberTable:
        line 49: 11
}
InnerClasses:
  public static final #100= #96 of #2;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/Location$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/Location
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #104(#105=[I#106,I#107,I#108],#109=I#110,#111=I#112,#113=[s#114],#115=[s#21,s#116,s#10,s#116,s#14,s#17,s#5,s#6,s#22,s#23,s#24,s#25,s#26,s#117,s#36,s#116,s#47,s#48,s#54,s#55,s#56,s#57,s#85,s#116,s#79,s#65,s#116,s#100,s#118])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0000J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001c"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/Location;","","x","","y","z","<init>","(III)V","getX","()I","getY","getZ","toGeo","Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","distance2D","","other","distanceManhattan","component1","component2","component3","copy","equals","","hashCode","toString","","Companion","Brproject"]
    )
BootstrapMethods:
  0: #75 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #68 Location(x=\u0001, y=\u0001, z=\u0001)
