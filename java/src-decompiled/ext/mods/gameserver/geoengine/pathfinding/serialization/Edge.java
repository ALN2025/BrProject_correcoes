// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.Edge
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\Edge.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.class
  Last modified 9 de jul de 2026; size 3491 bytes
  MD5 checksum dbc9547315162daa57897b6edc68c4f9
  Compiled from "L2BRSerializer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.serialization.Edge
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 12, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               targetId
   #12 = Utf8               I
   #13 = NameAndType        #11:#12       // targetId:I
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.targetId:I
   #15 = Utf8               cost
   #16 = Utf8               D
   #17 = NameAndType        #15:#16       // cost:D
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.cost:D
   #19 = Utf8               type
   #20 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #21 = NameAndType        #19:#20       // type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #23 = Utf8               this
   #24 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
   #25 = Utf8               getTargetId
   #26 = Utf8               ()I
   #27 = Utf8               getCost
   #28 = Utf8               ()D
   #29 = Utf8               getType
   #30 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
   #31 = Utf8               component1
   #32 = Utf8               component2
   #33 = Utf8               component3
   #34 = Utf8               copy
   #35 = Utf8               (IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
   #36 = NameAndType        #5:#6         // "<init>":(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
   #37 = Methodref          #2.#36        // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge."<init>":(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
   #38 = Utf8               copy$default
   #39 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
   #40 = NameAndType        #34:#35       // copy:(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
   #41 = Methodref          #2.#40        // ext/mods/gameserver/geoengine/pathfinding/serialization/Edge.copy:(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
   #42 = Utf8               toString
   #43 = Utf8               ()Ljava/lang/String;
   #44 = Utf8               Edge(targetId=\u0001, cost=\u0001, type=\u0001)
   #45 = String             #44           // Edge(targetId=\u0001, cost=\u0001, type=\u0001)
   #46 = Utf8               java/lang/invoke/StringConcatFactory
   #47 = Class              #46           // java/lang/invoke/StringConcatFactory
   #48 = Utf8               makeConcatWithConstants
   #49 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #50 = NameAndType        #48:#49       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #51 = Methodref          #47.#50       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #52 = MethodHandle       6:#51         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #53 = Utf8               (IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
   #54 = NameAndType        #48:#53       // makeConcatWithConstants:(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
   #55 = InvokeDynamic      #0:#54        // #0:makeConcatWithConstants:(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
   #56 = Utf8               hashCode
   #57 = Utf8               java/lang/Integer
   #58 = Class              #57           // java/lang/Integer
   #59 = Utf8               (I)I
   #60 = NameAndType        #56:#59       // hashCode:(I)I
   #61 = Methodref          #58.#60       // java/lang/Integer.hashCode:(I)I
   #62 = Utf8               java/lang/Double
   #63 = Class              #62           // java/lang/Double
   #64 = Utf8               (D)I
   #65 = NameAndType        #56:#64       // hashCode:(D)I
   #66 = Methodref          #63.#65       // java/lang/Double.hashCode:(D)I
   #67 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
   #68 = Class              #67           // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
   #69 = NameAndType        #56:#26       // hashCode:()I
   #70 = Methodref          #68.#69       // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.hashCode:()I
   #71 = Utf8               result
   #72 = Utf8               equals
   #73 = Utf8               (Ljava/lang/Object;)Z
   #74 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #75 = Utf8               compare
   #76 = Utf8               (DD)I
   #77 = NameAndType        #75:#76       // compare:(DD)I
   #78 = Methodref          #63.#77       // java/lang/Double.compare:(DD)I
   #79 = Utf8               other
   #80 = Utf8               Ljava/lang/Object;
   #81 = Utf8               Lkotlin/Metadata;
   #82 = Utf8               mv
   #83 = Integer            2
   #84 = Integer            3
   #85 = Integer            0
   #86 = Utf8               k
   #87 = Integer            1
   #88 = Utf8               xi
   #89 = Integer            48
   #90 = Utf8               d1
   #91 = Utf8               \u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a
   #92 = Utf8               d2
   #93 = Utf8
   #94 = Utf8               Brproject
   #95 = Utf8               L2BRSerializer.kt
   #96 = Utf8               RuntimeInvisibleAnnotations
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               RuntimeInvisibleParameterAnnotations
  #101 = Utf8               StackMapTable
  #102 = Utf8               SourceFile
  #103 = Utf8               RuntimeVisibleAnnotations
  #104 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.Edge(int, double, ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType);
    descriptor: (IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #14                 // Field targetId:I
         9: aload_0
        10: dload_2
        11: putfield      #18                 // Field cost:D
        14: aload_0
        15: aload         4
        17: putfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        20: return
      LineNumberTable:
        line 419: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
            0      21     1 targetId   I
            0      21     2  cost   D
            0      21     4  type   Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final int getTargetId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetId:I
         4: ireturn
      LineNumberTable:
        line 419: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;

  public final double getCost();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field cost:D
         4: dreturn
      LineNumberTable:
        line 419: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType getType();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
         4: areturn
      LineNumberTable:
        line 419: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetId:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;

  public final double component2();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field cost:D
         4: dreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType component3();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.Edge copy(int, double, ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType);
    descriptor: (IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=4
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
         3: dup
         4: iload_1
         5: dload_2
         6: aload         4
         8: invokespecial #37                 // Method "<init>":(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
        11: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
            0      12     1 targetId   I
            0      12     2  cost   D
            0      12     4  type   Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.Edge copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.Edge, int, double, ext.mods.gameserver.geoengine.pathfinding.serialization.EdgeType, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=6
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field targetId:I
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #18                 // Field cost:D
        23: dstore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          37
        31: aload_0
        32: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        35: astore        4
        37: aload_0
        38: iload_1
        39: dload_2
        40: aload         4
        42: invokevirtual #41                 // Method copy:(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
        45: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetId:I
         4: aload_0
         5: getfield      #18                 // Field cost:D
         8: aload_0
         9: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        12: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)Ljava/lang/String;
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetId:I
         4: invokestatic  #61                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #18                 // Field cost:D
        16: invokestatic  #66                 // Method java/lang/Double.hashCode:(D)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        29: invokevirtual #70                 // Method ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.hashCode:()I
        32: iadd
        33: istore_1
        34: iload_1
        35: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      28     1 result   I
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/Edge
        20: astore_2
        21: aload_0
        22: getfield      #14                 // Field targetId:I
        25: aload_2
        26: getfield      #14                 // Field targetId:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #18                 // Field cost:D
        38: aload_2
        39: getfield      #18                 // Field cost:D
        42: invokestatic  #78                 // Method java/lang/Double.compare:(DD)I
        45: ifeq          50
        48: iconst_0
        49: ireturn
        50: aload_0
        51: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        54: aload_2
        55: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
        58: if_acmpeq     63
        61: iconst_0
        62: ireturn
        63: iconst_1
        64: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/Edge ]
        frame_type = 15 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;
            0      65     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #74()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #81(#82=[I#83,I#84,I#85],#86=I#87,#88=I#89,#90=[s#91],#92=[s#24,s#93,s#11,s#93,s#15,s#93,s#19,s#20,s#5,s#6,s#25,s#26,s#27,s#28,s#29,s#30,s#31,s#32,s#33,s#34,s#72,s#93,s#79,s#56,s#42,s#93,s#94])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/Edge;","","targetId","","cost","","type","Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;","<init>","(IDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V","getTargetId","()I","getCost","()D","getType","()Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;","component1","component2","component3","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #52 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #45 Edge(targetId=\u0001, cost=\u0001, type=\u0001)
