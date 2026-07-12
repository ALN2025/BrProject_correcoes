// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.Connection
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\Connection.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.class
  Last modified 9 de jul de 2026; size 3816 bytes
  MD5 checksum 6e45ec37d9d4c1f89521e098684eae0b
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.Connection
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 14, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               from
   #12 = Utf8               I
   #13 = NameAndType        #11:#12       // from:I
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.from:I
   #15 = Utf8               to
   #16 = NameAndType        #15:#12       // to:I
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.to:I
   #18 = Utf8               cost
   #19 = Utf8               D
   #20 = NameAndType        #18:#19       // cost:D
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.cost:D
   #22 = Utf8               type
   #23 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #24 = NameAndType        #22:#23       // type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #26 = Utf8               this
   #27 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
   #28 = Utf8               getFrom
   #29 = Utf8               ()I
   #30 = Utf8               getTo
   #31 = Utf8               getCost
   #32 = Utf8               ()D
   #33 = Utf8               getType
   #34 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #35 = Utf8               component1
   #36 = Utf8               component2
   #37 = Utf8               component3
   #38 = Utf8               component4
   #39 = Utf8               copy
   #40 = Utf8               (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
   #41 = NameAndType        #5:#6         // "<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
   #42 = Methodref          #2.#41        // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection."<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
   #43 = Utf8               copy$default
   #44 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
   #45 = NameAndType        #39:#40       // copy:(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
   #46 = Methodref          #2.#45        // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection.copy:(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
   #47 = Utf8               toString
   #48 = Utf8               ()Ljava/lang/String;
   #49 = Utf8               Connection(from=\u0001, to=\u0001, cost=\u0001, type=\u0001)
   #50 = String             #49           // Connection(from=\u0001, to=\u0001, cost=\u0001, type=\u0001)
   #51 = Utf8               java/lang/invoke/StringConcatFactory
   #52 = Class              #51           // java/lang/invoke/StringConcatFactory
   #53 = Utf8               makeConcatWithConstants
   #54 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #55 = NameAndType        #53:#54       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #56 = Methodref          #52.#55       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #57 = MethodHandle       6:#56         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #58 = Utf8               (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
   #59 = NameAndType        #53:#58       // makeConcatWithConstants:(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
   #60 = InvokeDynamic      #0:#59        // #0:makeConcatWithConstants:(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
   #61 = Utf8               hashCode
   #62 = Utf8               java/lang/Integer
   #63 = Class              #62           // java/lang/Integer
   #64 = Utf8               (I)I
   #65 = NameAndType        #61:#64       // hashCode:(I)I
   #66 = Methodref          #63.#65       // java/lang/Integer.hashCode:(I)I
   #67 = Utf8               java/lang/Double
   #68 = Class              #67           // java/lang/Double
   #69 = Utf8               (D)I
   #70 = NameAndType        #61:#69       // hashCode:(D)I
   #71 = Methodref          #68.#70       // java/lang/Double.hashCode:(D)I
   #72 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
   #73 = Class              #72           // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
   #74 = NameAndType        #61:#29       // hashCode:()I
   #75 = Methodref          #73.#74       // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.hashCode:()I
   #76 = Utf8               result
   #77 = Utf8               equals
   #78 = Utf8               (Ljava/lang/Object;)Z
   #79 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #80 = Utf8               compare
   #81 = Utf8               (DD)I
   #82 = NameAndType        #80:#81       // compare:(DD)I
   #83 = Methodref          #68.#82       // java/lang/Double.compare:(DD)I
   #84 = Utf8               other
   #85 = Utf8               Ljava/lang/Object;
   #86 = Utf8               Lkotlin/Metadata;
   #87 = Utf8               mv
   #88 = Integer            2
   #89 = Integer            3
   #90 = Integer            0
   #91 = Utf8               k
   #92 = Integer            1
   #93 = Utf8               xi
   #94 = Integer            48
   #95 = Utf8               d1
   #96 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d
   #97 = Utf8               d2
   #98 = Utf8
   #99 = Utf8               Brproject
  #100 = Utf8               L2BRSerializer.kt
  #101 = Utf8               RuntimeInvisibleAnnotations
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               RuntimeInvisibleParameterAnnotations
  #106 = Utf8               StackMapTable
  #107 = Utf8               SourceFile
  #108 = Utf8               RuntimeVisibleAnnotations
  #109 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.Connection(int, int, double, ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType);
    descriptor: (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #14                 // Field from:I
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field to:I
        14: aload_0
        15: dload_3
        16: putfield      #21                 // Field cost:D
        19: aload_0
        20: aload         5
        22: putfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        25: return
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
            0      26     1  from   I
            0      26     2    to   I
            0      26     3  cost   D
            0      26     5  type   Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final int getFrom();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field from:I
         4: ireturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

  public final int getTo();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field to:I
         4: ireturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

  public final double getCost();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field cost:D
         4: dreturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType getType();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
         4: areturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field from:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field to:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

  public final double component3();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field cost:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType component4();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.Connection copy(int, int, double, ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType);
    descriptor: (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=6, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
         3: dup
         4: iload_1
         5: iload_2
         6: dload_3
         7: aload         5
         9: invokespecial #42                 // Method "<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
            0      13     1  from   I
            0      13     2    to   I
            0      13     3  cost   D
            0      13     5  type   Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.Connection copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.Connection, int, int, double, ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=8, args_size=7
         0: iload         6
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field from:I
        11: istore_1
        12: iload         6
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field to:I
        23: istore_2
        24: iload         6
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #21                 // Field cost:D
        35: dstore_3
        36: iload         6
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        48: astore        5
        50: aload_0
        51: iload_1
        52: iload_2
        53: dload_3
        54: aload         5
        56: invokevirtual #46                 // Method copy:(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
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
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field from:I
         4: aload_0
         5: getfield      #17                 // Field to:I
         8: aload_0
         9: getfield      #21                 // Field cost:D
        12: aload_0
        13: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        16: invokedynamic #60,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field from:I
         4: invokestatic  #66                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field to:I
        16: invokestatic  #66                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #21                 // Field cost:D
        29: invokestatic  #71                 // Method java/lang/Double.hashCode:(D)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        42: invokevirtual #75                 // Method ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.hashCode:()I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
        20: astore_2
        21: aload_0
        22: getfield      #14                 // Field from:I
        25: aload_2
        26: getfield      #14                 // Field from:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #17                 // Field to:I
        38: aload_2
        39: getfield      #17                 // Field to:I
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #21                 // Field cost:D
        51: aload_2
        52: getfield      #21                 // Field cost:D
        55: invokestatic  #83                 // Method java/lang/Double.compare:(DD)I
        58: ifeq          63
        61: iconst_0
        62: ireturn
        63: aload_0
        64: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        67: aload_2
        68: getfield      #25                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        71: if_acmpeq     76
        74: iconst_0
        75: ireturn
        76: iconst_1
        77: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/Connection ]
        frame_type = 12 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;
            0      78     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #79()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #86(#87=[I#88,I#89,I#90],#91=I#92,#93=I#94,#95=[s#96],#97=[s#27,s#98,s#11,s#98,s#15,s#18,s#98,s#22,s#23,s#5,s#6,s#28,s#29,s#30,s#31,s#32,s#33,s#34,s#35,s#36,s#37,s#38,s#39,s#77,s#98,s#84,s#61,s#47,s#98,s#99])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/Connection;","","from","","to","cost","","type","Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;","<init>","(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V","getFrom","()I","getTo","getCost","()D","getType","()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;","component1","component2","component3","component4","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #57 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #50 Connection(from=\u0001, to=\u0001, cost=\u0001, type=\u0001)
