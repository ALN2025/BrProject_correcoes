// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.PathResult
// File: ext\mods\gameserver\geoengine\pathfinding\model\PathResult.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/PathResult.class
  Last modified 9 de jul de 2026; size 4474 bytes
  MD5 checksum c5c80d56439301af4959fe32c28c45b9
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.PathResult
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/PathResult
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 15, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathResult
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/PathResult
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/util/List;IJZ)V
    #7 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;IJZ)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ()V
   #10 = NameAndType        #5:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               path
   #13 = Utf8               Ljava/util/List;
   #14 = NameAndType        #12:#13       // path:Ljava/util/List;
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/model/PathResult.path:Ljava/util/List;
   #16 = Utf8               nodesExplored
   #17 = Utf8               I
   #18 = NameAndType        #16:#17       // nodesExplored:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/model/PathResult.nodesExplored:I
   #20 = Utf8               timeMicros
   #21 = Utf8               J
   #22 = NameAndType        #20:#21       // timeMicros:J
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/model/PathResult.timeMicros:J
   #24 = Utf8               success
   #25 = Utf8               Z
   #26 = NameAndType        #24:#25       // success:Z
   #27 = Fieldref           #2.#26        // ext/mods/gameserver/geoengine/pathfinding/model/PathResult.success:Z
   #28 = Utf8               this
   #29 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
   #30 = Utf8               getPath
   #31 = Utf8               ()Ljava/util/List;
   #32 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
   #33 = Utf8               getNodesExplored
   #34 = Utf8               ()I
   #35 = Utf8               getTimeMicros
   #36 = Utf8               ()J
   #37 = Utf8               getSuccess
   #38 = Utf8               ()Z
   #39 = Utf8               component1
   #40 = Utf8               component2
   #41 = Utf8               component3
   #42 = Utf8               component4
   #43 = Utf8               copy
   #44 = Utf8               (Ljava/util/List;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
   #45 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
   #46 = NameAndType        #5:#6         // "<init>":(Ljava/util/List;IJZ)V
   #47 = Methodref          #2.#46        // ext/mods/gameserver/geoengine/pathfinding/model/PathResult."<init>":(Ljava/util/List;IJZ)V
   #48 = Utf8               copy$default
   #49 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;Ljava/util/List;IJZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
   #50 = NameAndType        #43:#44       // copy:(Ljava/util/List;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
   #51 = Methodref          #2.#50        // ext/mods/gameserver/geoengine/pathfinding/model/PathResult.copy:(Ljava/util/List;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
   #52 = Utf8               toString
   #53 = Utf8               ()Ljava/lang/String;
   #54 = Utf8               PathResult(path=\u0001, nodesExplored=\u0001, timeMicros=\u0001, success=\u0001)
   #55 = String             #54           // PathResult(path=\u0001, nodesExplored=\u0001, timeMicros=\u0001, success=\u0001)
   #56 = Utf8               java/lang/invoke/StringConcatFactory
   #57 = Class              #56           // java/lang/invoke/StringConcatFactory
   #58 = Utf8               makeConcatWithConstants
   #59 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #60 = NameAndType        #58:#59       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #61 = Methodref          #57.#60       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #62 = MethodHandle       6:#61         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #63 = Utf8               (Ljava/util/List;IJZ)Ljava/lang/String;
   #64 = NameAndType        #58:#63       // makeConcatWithConstants:(Ljava/util/List;IJZ)Ljava/lang/String;
   #65 = InvokeDynamic      #0:#64        // #0:makeConcatWithConstants:(Ljava/util/List;IJZ)Ljava/lang/String;
   #66 = Utf8               hashCode
   #67 = NameAndType        #66:#34       // hashCode:()I
   #68 = Methodref          #4.#67        // java/lang/Object.hashCode:()I
   #69 = Utf8               java/lang/Integer
   #70 = Class              #69           // java/lang/Integer
   #71 = Utf8               (I)I
   #72 = NameAndType        #66:#71       // hashCode:(I)I
   #73 = Methodref          #70.#72       // java/lang/Integer.hashCode:(I)I
   #74 = Utf8               java/lang/Long
   #75 = Class              #74           // java/lang/Long
   #76 = Utf8               (J)I
   #77 = NameAndType        #66:#76       // hashCode:(J)I
   #78 = Methodref          #75.#77       // java/lang/Long.hashCode:(J)I
   #79 = Utf8               java/lang/Boolean
   #80 = Class              #79           // java/lang/Boolean
   #81 = Utf8               (Z)I
   #82 = NameAndType        #66:#81       // hashCode:(Z)I
   #83 = Methodref          #80.#82       // java/lang/Boolean.hashCode:(Z)I
   #84 = Utf8               result
   #85 = Utf8               equals
   #86 = Utf8               (Ljava/lang/Object;)Z
   #87 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #88 = Utf8               kotlin/jvm/internal/Intrinsics
   #89 = Class              #88           // kotlin/jvm/internal/Intrinsics
   #90 = Utf8               areEqual
   #91 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #92 = NameAndType        #90:#91       // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #93 = Methodref          #89.#92       // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #94 = Utf8               other
   #95 = Utf8               Ljava/lang/Object;
   #96 = Utf8               <clinit>
   #97 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion
   #98 = Class              #97           // ext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion
   #99 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #100 = NameAndType        #5:#99        // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #101 = Methodref          #98.#100      // ext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #102 = Utf8               Companion
  #103 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion;
  #104 = NameAndType        #102:#103     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion;
  #105 = Fieldref           #2.#104       // ext/mods/gameserver/geoengine/pathfinding/model/PathResult.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion;
  #106 = Utf8               Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
  #107 = Utf8               Lkotlin/Metadata;
  #108 = Utf8               mv
  #109 = Integer            2
  #110 = Integer            3
  #111 = Integer            0
  #112 = Utf8               k
  #113 = Integer            1
  #114 = Utf8               xi
  #115 = Integer            48
  #116 = Utf8               d1
  #117 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006
  #118 = Utf8               d2
  #119 = Utf8
  #120 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #121 = Utf8               Brproject
  #122 = Utf8               Location.kt
  #123 = Utf8               RuntimeInvisibleAnnotations
  #124 = Utf8               Signature
  #125 = Utf8               Code
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               RuntimeInvisibleParameterAnnotations
  #129 = Utf8               StackMapTable
  #130 = Utf8               InnerClasses
  #131 = Utf8               SourceFile
  #132 = Utf8               RuntimeVisibleAnnotations
  #133 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.PathResult$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.model.PathResult(java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location>, int, long, boolean);
    descriptor: (Ljava/util/List;IJZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_0
         1: invokespecial #11                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #15                 // Field path:Ljava/util/List;
         9: aload_0
        10: iload_2
        11: putfield      #19                 // Field nodesExplored:I
        14: aload_0
        15: lload_3
        16: putfield      #23                 // Field timeMicros:J
        19: aload_0
        20: iload         5
        22: putfield      #27                 // Field success:Z
        25: return
      LineNumberTable:
        line 152: 0
        line 153: 4
        line 154: 9
        line 155: 14
        line 156: 19
        line 152: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
            0      26     1  path   Ljava/util/List;
            0      26     2 nodesExplored   I
            0      26     3 timeMicros   J
            0      26     5 success   Z
    Signature: #7                           // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;IJZ)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
      parameter 3:

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> getPath();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field path:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
    Signature: #32                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final int getNodesExplored();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field nodesExplored:I
         4: ireturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

  public final long getTimeMicros();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field timeMicros:J
         4: lreturn
      LineNumberTable:
        line 155: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

  public final boolean getSuccess();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field success:Z
         4: ireturn
      LineNumberTable:
        line 156: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> component1();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field path:Ljava/util/List;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
    Signature: #32                          // ()Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field nodesExplored:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

  public final long component3();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field timeMicros:J
         4: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

  public final boolean component4();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field success:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

  public final ext.mods.gameserver.geoengine.pathfinding.model.PathResult copy(java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location>, int, long, boolean);
    descriptor: (Ljava/util/List;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=6, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathResult
         3: dup
         4: aload_1
         5: iload_2
         6: lload_3
         7: iload         5
         9: invokespecial #47                 // Method "<init>":(Ljava/util/List;IJZ)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
            0      13     1  path   Ljava/util/List;
            0      13     2 nodesExplored   I
            0      13     3 timeMicros   J
            0      13     5 success   Z
    Signature: #45                          // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
      parameter 3:

  public static ext.mods.gameserver.geoengine.pathfinding.model.PathResult copy$default(ext.mods.gameserver.geoengine.pathfinding.model.PathResult, java.util.List, int, long, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;Ljava/util/List;IJZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=8, args_size=7
         0: iload         6
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #15                 // Field path:Ljava/util/List;
        11: astore_1
        12: iload         6
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #19                 // Field nodesExplored:I
        23: istore_2
        24: iload         6
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #23                 // Field timeMicros:J
        35: lstore_3
        36: iload         6
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #27                 // Field success:Z
        48: istore        5
        50: aload_0
        51: aload_1
        52: iload_2
        53: lload_3
        54: iload         5
        56: invokevirtual #51                 // Method copy:(Ljava/util/List;IJZ)Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
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
         1: getfield      #15                 // Field path:Ljava/util/List;
         4: aload_0
         5: getfield      #19                 // Field nodesExplored:I
         8: aload_0
         9: getfield      #23                 // Field timeMicros:J
        12: aload_0
        13: getfield      #27                 // Field success:Z
        16: invokedynamic #65,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/util/List;IJZ)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #15                 // Field path:Ljava/util/List;
         4: invokevirtual #68                 // Method java/lang/Object.hashCode:()I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #19                 // Field nodesExplored:I
        16: invokestatic  #73                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #23                 // Field timeMicros:J
        29: invokestatic  #78                 // Method java/lang/Long.hashCode:(J)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #27                 // Field success:Z
        42: invokestatic  #83                 // Method java/lang/Boolean.hashCode:(Z)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathResult
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathResult
        20: astore_2
        21: aload_0
        22: getfield      #15                 // Field path:Ljava/util/List;
        25: aload_2
        26: getfield      #15                 // Field path:Ljava/util/List;
        29: invokestatic  #93                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        32: ifne          37
        35: iconst_0
        36: ireturn
        37: aload_0
        38: getfield      #19                 // Field nodesExplored:I
        41: aload_2
        42: getfield      #19                 // Field nodesExplored:I
        45: if_icmpeq     50
        48: iconst_0
        49: ireturn
        50: aload_0
        51: getfield      #23                 // Field timeMicros:J
        54: aload_2
        55: getfield      #23                 // Field timeMicros:J
        58: lcmp
        59: ifeq          64
        62: iconst_0
        63: ireturn
        64: aload_0
        65: getfield      #27                 // Field success:Z
        68: aload_2
        69: getfield      #27                 // Field success:Z
        72: if_icmpeq     77
        75: iconst_0
        76: ireturn
        77: iconst_1
        78: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathResult ]
        frame_type = 12 /* same */
        frame_type = 13 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;
            0      79     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #87()
          org.jetbrains.annotations.Nullable

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #98                 // class ext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion
         3: dup
         4: aconst_null
         5: invokespecial #101                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #105                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion;
        11: return
}
InnerClasses:
  public static final #102= #98 of #2;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/PathResult$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/PathResult
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #107(#108=[I#109,I#110,I#111],#112=I#113,#114=I#115,#116=[s#117],#118=[s#29,s#119,s#12,s#119,s#120,s#16,s#119,s#20,s#119,s#24,s#119,s#5,s#6,s#30,s#31,s#33,s#34,s#35,s#36,s#37,s#38,s#39,s#40,s#41,s#42,s#43,s#85,s#94,s#66,s#52,s#119,s#102,s#121])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/PathResult;","","path","","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","nodesExplored","","timeMicros","","success","","<init>","(Ljava/util/List;IJZ)V","getPath","()Ljava/util/List;","getNodesExplored","()I","getTimeMicros","()J","getSuccess","()Z","component1","component2","component3","component4","copy","equals","other","hashCode","toString","","Companion","Brproject"]
    )
BootstrapMethods:
  0: #62 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #55 PathResult(path=\u0001, nodesExplored=\u0001, timeMicros=\u0001, success=\u0001)
