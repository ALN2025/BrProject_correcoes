// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint
// File: ext\mods\gameserver\geoengine\pathfinding\model\JumpPoint.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint.class
  Last modified 9 de jul de 2026; size 3947 bytes
  MD5 checksum 746132d59232f3199f44e8e119b29236
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 15, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               targetNodeId
   #12 = Utf8               I
   #13 = NameAndType        #11:#12       // targetNodeId:I
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint.targetNodeId:I
   #15 = Utf8               direction
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #17 = NameAndType        #15:#16       // direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint.direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #19 = Utf8               cost
   #20 = NameAndType        #19:#12       // cost:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint.cost:I
   #22 = Utf8               flags
   #23 = Utf8               B
   #24 = NameAndType        #22:#23       // flags:B
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint.flags:B
   #26 = Utf8               this
   #27 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
   #28 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IBILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #29 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V
   #30 = Methodref          #2.#29        // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint."<init>":(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V
   #31 = Utf8               getTargetNodeId
   #32 = Utf8               ()I
   #33 = Utf8               getDirection
   #34 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #35 = Utf8               getCost
   #36 = Utf8               getFlags
   #37 = Utf8               ()B
   #38 = Utf8               component1
   #39 = Utf8               component2
   #40 = Utf8               component3
   #41 = Utf8               component4
   #42 = Utf8               copy
   #43 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
   #44 = Utf8               copy$default
   #45 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IBILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
   #46 = NameAndType        #42:#43       // copy:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
   #47 = Methodref          #2.#46        // ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint.copy:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
   #48 = Utf8               toString
   #49 = Utf8               ()Ljava/lang/String;
   #50 = Utf8               JumpPoint(targetNodeId=\u0001, direction=\u0001, cost=\u0001, flags=\u0001)
   #51 = String             #50           // JumpPoint(targetNodeId=\u0001, direction=\u0001, cost=\u0001, flags=\u0001)
   #52 = Utf8               java/lang/invoke/StringConcatFactory
   #53 = Class              #52           // java/lang/invoke/StringConcatFactory
   #54 = Utf8               makeConcatWithConstants
   #55 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #56 = NameAndType        #54:#55       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #57 = Methodref          #53.#56       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #58 = MethodHandle       6:#57         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #59 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Ljava/lang/String;
   #60 = NameAndType        #54:#59       // makeConcatWithConstants:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Ljava/lang/String;
   #61 = InvokeDynamic      #0:#60        // #0:makeConcatWithConstants:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Ljava/lang/String;
   #62 = Utf8               hashCode
   #63 = Utf8               java/lang/Integer
   #64 = Class              #63           // java/lang/Integer
   #65 = Utf8               (I)I
   #66 = NameAndType        #62:#65       // hashCode:(I)I
   #67 = Methodref          #64.#66       // java/lang/Integer.hashCode:(I)I
   #68 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #69 = Class              #68           // ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #70 = NameAndType        #62:#32       // hashCode:()I
   #71 = Methodref          #69.#70       // ext/mods/gameserver/geoengine/pathfinding/model/Direction.hashCode:()I
   #72 = Utf8               java/lang/Byte
   #73 = Class              #72           // java/lang/Byte
   #74 = Utf8               (B)I
   #75 = NameAndType        #62:#74       // hashCode:(B)I
   #76 = Methodref          #73.#75       // java/lang/Byte.hashCode:(B)I
   #77 = Utf8               result
   #78 = Utf8               equals
   #79 = Utf8               (Ljava/lang/Object;)Z
   #80 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #81 = Utf8               other
   #82 = Utf8               Ljava/lang/Object;
   #83 = Utf8               Lkotlin/Metadata;
   #84 = Utf8               mv
   #85 = Integer            2
   #86 = Integer            3
   #87 = Integer            0
   #88 = Utf8               k
   #89 = Integer            1
   #90 = Utf8               xi
   #91 = Integer            48
   #92 = Utf8               d1
   #93 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d
   #94 = Utf8               d2
   #95 = Utf8
   #96 = Utf8               Brproject
   #97 = Utf8               Location.kt
   #98 = Utf8               RuntimeInvisibleAnnotations
   #99 = Utf8               Code
  #100 = Utf8               LineNumberTable
  #101 = Utf8               LocalVariableTable
  #102 = Utf8               RuntimeInvisibleParameterAnnotations
  #103 = Utf8               StackMapTable
  #104 = Utf8               SourceFile
  #105 = Utf8               RuntimeVisibleAnnotations
  #106 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint(int, ext.mods.gameserver.geoengine.pathfinding.model.Direction, int, byte);
    descriptor: (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #14                 // Field targetNodeId:I
         9: aload_0
        10: aload_2
        11: putfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        14: aload_0
        15: iload_3
        16: putfield      #21                 // Field cost:I
        19: aload_0
        20: iload         4
        22: putfield      #25                 // Field flags:B
        25: return
      LineNumberTable:
        line 130: 0
        line 131: 4
        line 132: 9
        line 133: 14
        line 134: 19
        line 130: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
            0      26     1 targetNodeId   I
            0      26     2 direction   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
            0      26     3  cost   I
            0      26     4 flags   B
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
      parameter 3:

  public ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint(int, ext.mods.gameserver.geoengine.pathfinding.model.Direction, int, byte, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IBILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: bipush        8
         4: iand
         5: ifeq          11
         8: iconst_0
         9: istore        4
        11: aload_0
        12: iload_1
        13: aload_2
        14: iload_3
        15: iload         4
        17: invokespecial #30                 // Method "<init>":(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V
        20: return
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
      LineNumberTable:
        line 130: 0
        line 134: 8
        line 130: 11
        line 135: 20

  public final int getTargetNodeId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetNodeId:I
         4: ireturn
      LineNumberTable:
        line 131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

  public final ext.mods.gameserver.geoengine.pathfinding.model.Direction getDirection();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
         4: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int getCost();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field cost:I
         4: ireturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

  public final byte getFlags();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field flags:B
         4: ireturn
      LineNumberTable:
        line 134: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetNodeId:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

  public final ext.mods.gameserver.geoengine.pathfinding.model.Direction component2();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int component3();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field cost:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

  public final byte component4();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field flags:B
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

  public final ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint copy(int, ext.mods.gameserver.geoengine.pathfinding.model.Direction, int, byte);
    descriptor: (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint
         3: dup
         4: iload_1
         5: aload_2
         6: iload_3
         7: iload         4
         9: invokespecial #30                 // Method "<init>":(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
            0      13     1 targetNodeId   I
            0      13     2 direction   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
            0      13     3  cost   I
            0      13     4 flags   B
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
      parameter 3:

  public static ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint copy$default(ext.mods.gameserver.geoengine.pathfinding.model.JumpPoint, int, ext.mods.gameserver.geoengine.pathfinding.model.Direction, int, byte, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IBILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field targetNodeId:I
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        23: astore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #21                 // Field cost:I
        35: istore_3
        36: iload         5
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #25                 // Field flags:B
        48: istore        4
        50: aload_0
        51: iload_1
        52: aload_2
        53: iload_3
        54: iload         4
        56: invokevirtual #47                 // Method copy:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
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
         1: getfield      #14                 // Field targetNodeId:I
         4: aload_0
         5: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
         8: aload_0
         9: getfield      #21                 // Field cost:I
        12: aload_0
        13: getfield      #25                 // Field flags:B
        16: invokedynamic #61,  0             // InvokeDynamic #0:makeConcatWithConstants:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field targetNodeId:I
         4: invokestatic  #67                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        16: invokevirtual #71                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.hashCode:()I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #21                 // Field cost:I
        29: invokestatic  #67                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #25                 // Field flags:B
        42: invokestatic  #76                 // Method java/lang/Byte.hashCode:(B)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint
        20: astore_2
        21: aload_0
        22: getfield      #14                 // Field targetNodeId:I
        25: aload_2
        26: getfield      #14                 // Field targetNodeId:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        38: aload_2
        39: getfield      #18                 // Field direction:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        42: if_acmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #21                 // Field cost:I
        51: aload_2
        52: getfield      #21                 // Field cost:I
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #25                 // Field flags:B
        64: aload_2
        65: getfield      #25                 // Field flags:B
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
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/JumpPoint ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;
            0      75     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #80()
          org.jetbrains.annotations.Nullable
}
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #83(#84=[I#85,I#86,I#87],#88=I#89,#90=I#91,#92=[s#93],#94=[s#27,s#95,s#11,s#95,s#15,s#16,s#19,s#22,s#95,s#5,s#6,s#31,s#32,s#33,s#34,s#35,s#36,s#37,s#38,s#39,s#40,s#41,s#42,s#78,s#95,s#81,s#62,s#48,s#95,s#96])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/JumpPoint;","","targetNodeId","","direction","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","cost","flags","","<init>","(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;IB)V","getTargetNodeId","()I","getDirection","()Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","getCost","getFlags","()B","component1","component2","component3","component4","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #58 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #51 JumpPoint(targetNodeId=\u0001, direction=\u0001, cost=\u0001, flags=\u0001)
