// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation
// File: ext\mods\gameserver\geoengine\pathfinding\model\GeoLocation.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.class
  Last modified 9 de jul de 2026; size 3835 bytes
  MD5 checksum 8b8bb6653ec31f87f99626b9c99f5116
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 15, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIS)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               x
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // x:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.x:I
   #14 = Utf8               y
   #15 = NameAndType        #14:#11       // y:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.y:I
   #17 = Utf8               z
   #18 = Utf8               S
   #19 = NameAndType        #17:#18       // z:S
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.z:S
   #21 = Utf8               this
   #22 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #23 = Utf8               getX
   #24 = Utf8               ()I
   #25 = Utf8               getY
   #26 = Utf8               getZ
   #27 = Utf8               ()S
   #28 = Utf8               toWorld
   #29 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #30 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #31 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
   #32 = Class              #31           // ext/mods/gameserver/geoengine/pathfinding/model/Location
   #33 = Integer            65536
   #34 = Integer            40960
   #35 = Utf8               (III)V
   #36 = NameAndType        #5:#35        // "<init>":(III)V
   #37 = Methodref          #32.#36       // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
   #38 = Utf8               getRegion
   #39 = Utf8               ()Lkotlin/Pair;
   #40 = Utf8               ()Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;
   #41 = Utf8               java/lang/Integer
   #42 = Class              #41           // java/lang/Integer
   #43 = Utf8               valueOf
   #44 = Utf8               (I)Ljava/lang/Integer;
   #45 = NameAndType        #43:#44       // valueOf:(I)Ljava/lang/Integer;
   #46 = Methodref          #42.#45       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #47 = Utf8               kotlin/TuplesKt
   #48 = Class              #47           // kotlin/TuplesKt
   #49 = Utf8               to
   #50 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #51 = NameAndType        #49:#50       // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #52 = Methodref          #48.#51       // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #53 = Utf8               regionX
   #54 = Utf8               regionY
   #55 = Utf8               getNodeIdInRegion
   #56 = Utf8               localX
   #57 = Utf8               localY
   #58 = Utf8               component1
   #59 = Utf8               component2
   #60 = Utf8               component3
   #61 = Utf8               copy
   #62 = Utf8               (IIS)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #63 = NameAndType        #5:#6         // "<init>":(IIS)V
   #64 = Methodref          #2.#63        // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
   #65 = Utf8               copy$default
   #66 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;IISILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #67 = NameAndType        #61:#62       // copy:(IIS)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #68 = Methodref          #2.#67        // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.copy:(IIS)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
   #69 = Utf8               toString
   #70 = Utf8               ()Ljava/lang/String;
   #71 = Utf8               GeoLocation(x=\u0001, y=\u0001, z=\u0001)
   #72 = String             #71           // GeoLocation(x=\u0001, y=\u0001, z=\u0001)
   #73 = Utf8               java/lang/invoke/StringConcatFactory
   #74 = Class              #73           // java/lang/invoke/StringConcatFactory
   #75 = Utf8               makeConcatWithConstants
   #76 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #77 = NameAndType        #75:#76       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #78 = Methodref          #74.#77       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #79 = MethodHandle       6:#78         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = Utf8               (IIS)Ljava/lang/String;
   #81 = NameAndType        #75:#80       // makeConcatWithConstants:(IIS)Ljava/lang/String;
   #82 = InvokeDynamic      #0:#81        // #0:makeConcatWithConstants:(IIS)Ljava/lang/String;
   #83 = Utf8               hashCode
   #84 = Utf8               (I)I
   #85 = NameAndType        #83:#84       // hashCode:(I)I
   #86 = Methodref          #42.#85       // java/lang/Integer.hashCode:(I)I
   #87 = Utf8               java/lang/Short
   #88 = Class              #87           // java/lang/Short
   #89 = Utf8               (S)I
   #90 = NameAndType        #83:#89       // hashCode:(S)I
   #91 = Methodref          #88.#90       // java/lang/Short.hashCode:(S)I
   #92 = Utf8               result
   #93 = Utf8               equals
   #94 = Utf8               (Ljava/lang/Object;)Z
   #95 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #96 = Utf8               other
   #97 = Utf8               Ljava/lang/Object;
   #98 = Utf8               Lkotlin/Metadata;
   #99 = Utf8               mv
  #100 = Integer            2
  #101 = Integer            3
  #102 = Integer            0
  #103 = Utf8               k
  #104 = Integer            1
  #105 = Utf8               xi
  #106 = Integer            48
  #107 = Utf8               d1
  #108 = Utf8               \u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d
  #109 = Utf8               d2
  #110 = Utf8
  #111 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #112 = Utf8               Lkotlin/Pair;
  #113 = Utf8               Brproject
  #114 = Utf8               Location.kt
  #115 = Utf8               Code
  #116 = Utf8               LineNumberTable
  #117 = Utf8               LocalVariableTable
  #118 = Utf8               RuntimeInvisibleAnnotations
  #119 = Utf8               Signature
  #120 = Utf8               StackMapTable
  #121 = Utf8               RuntimeInvisibleParameterAnnotations
  #122 = Utf8               SourceFile
  #123 = Utf8               RuntimeVisibleAnnotations
  #124 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation(int, int, short);
    descriptor: (IIS)V
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
        16: putfield      #20                 // Field z:S
        19: return
      LineNumberTable:
        line 52: 0
        line 53: 4
        line 54: 9
        line 55: 14
        line 52: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
            0      20     1     x   I
            0      20     2     y   I
            0      20     3     z   S

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

  public final short getZ();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field z:S
         4: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

  public final ext.mods.gameserver.geoengine.pathfinding.model.Location toWorld();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: new           #32                 // class ext/mods/gameserver/geoengine/pathfinding/model/Location
         3: dup
         4: aload_0
         5: getfield      #13                 // Field x:I
         8: bipush        16
        10: imul
        11: ldc           #33                 // int 65536
        13: iadd
        14: aload_0
        15: getfield      #16                 // Field y:I
        18: bipush        16
        20: imul
        21: ldc           #34                 // int 40960
        23: iadd
        24: aload_0
        25: getfield      #20                 // Field z:S
        28: bipush        16
        30: imul
        31: invokespecial #37                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
        34: areturn
      LineNumberTable:
        line 59: 0
        line 60: 4
        line 61: 14
        line 62: 24
        line 59: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    RuntimeInvisibleAnnotations:
      0: #30()
        org.jetbrains.annotations.NotNull

  public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getRegion();
    descriptor: ()Lkotlin/Pair;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: sipush        256
         7: idiv
         8: bipush        16
        10: iadd
        11: istore_1
        12: aload_0
        13: getfield      #16                 // Field y:I
        16: sipush        256
        19: idiv
        20: bipush        10
        22: iadd
        23: istore_2
        24: iload_1
        25: invokestatic  #46                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: iload_2
        29: invokestatic  #46                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokestatic  #52                 // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        35: areturn
      LineNumberTable:
        line 67: 0
        line 68: 12
        line 69: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      24     1 regionX   I
           24      12     2 regionY   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    Signature: #40                          // ()Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;
    RuntimeInvisibleAnnotations:
      0: #30()
        org.jetbrains.annotations.NotNull

  public final int getNodeIdInRegion();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: sipush        256
         7: irem
         8: istore_1
         9: aload_0
        10: getfield      #16                 // Field y:I
        13: sipush        256
        16: irem
        17: istore_2
        18: iload_2
        19: sipush        256
        22: imul
        23: iload_1
        24: iadd
        25: ireturn
      LineNumberTable:
        line 73: 0
        line 74: 9
        line 75: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      17     1 localX   I
           18       8     2 localY   I
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

  public final short component3();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field z:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

  public final ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation copy(int, int, short);
    descriptor: (IIS)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=4
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokespecial #64                 // Method "<init>":(IIS)V
        10: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
            0      11     1     x   I
            0      11     2     y   I
            0      11     3     z   S
    RuntimeInvisibleAnnotations:
      0: #30()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation copy$default(ext.mods.gameserver.geoengine.pathfinding.model.GeoLocation, int, int, short, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;IISILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
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
        32: getfield      #20                 // Field z:S
        35: istore_3
        36: aload_0
        37: iload_1
        38: iload_2
        39: iload_3
        40: invokevirtual #68                 // Method copy:(IIS)Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
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
         9: getfield      #20                 // Field z:S
        12: invokedynamic #82,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIS)Ljava/lang/String;
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
    RuntimeInvisibleAnnotations:
      0: #30()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: invokestatic  #86                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field y:I
        16: invokestatic  #86                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field z:S
        29: invokestatic  #91                 // Method java/lang/Short.hashCode:(S)I
        32: iadd
        33: istore_1
        34: iload_1
        35: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      28     1 result   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
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
        48: getfield      #20                 // Field z:S
        51: aload_2
        52: getfield      #20                 // Field z:S
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
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
            0      62     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #95()
          org.jetbrains.annotations.Nullable
}
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #98(#99=[I#100,I#101,I#102],#103=I#104,#105=I#106,#107=[s#108],#109=[s#22,s#110,s#10,s#110,s#14,s#17,s#110,s#5,s#6,s#23,s#24,s#25,s#26,s#27,s#28,s#111,s#38,s#112,s#55,s#58,s#59,s#60,s#61,s#93,s#110,s#96,s#83,s#69,s#110,s#113])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","","x","","y","z","","<init>","(IIS)V","getX","()I","getY","getZ","()S","toWorld","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","getRegion","Lkotlin/Pair;","getNodeIdInRegion","component1","component2","component3","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #79 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #72 GeoLocation(x=\u0001, y=\u0001, z=\u0001)
