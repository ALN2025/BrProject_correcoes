// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry
// File: ext\mods\gameserver\geoengine\pathfinding\core\spatial\RTreeIndex$Entry.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.class
  Last modified 9 de jul de 2026; size 4190 bytes
  MD5 checksum 83ced359643ab71eea48c2ad29041bfe
  Compiled from "RTreeIndex.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 13, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               Lorg/jetbrains/annotations/Nullable;
    #9 = Utf8               ()V
   #10 = NameAndType        #5:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               rect
   #13 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #14 = NameAndType        #12:#13       // rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #16 = Utf8               nodeId
   #17 = Utf8               I
   #18 = NameAndType        #16:#17       // nodeId:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.nodeId:I
   #20 = Utf8               data
   #21 = Utf8               Ljava/lang/Object;
   #22 = NameAndType        #20:#21       // data:Ljava/lang/Object;
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.data:Ljava/lang/Object;
   #24 = Utf8               this
   #25 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #26 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #27 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V
   #28 = Methodref          #2.#27        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V
   #29 = Utf8               getRect
   #30 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
   #31 = Utf8               getNodeId
   #32 = Utf8               ()I
   #33 = Utf8               getData
   #34 = Utf8               ()Ljava/lang/Object;
   #35 = Utf8               component1
   #36 = Utf8               component2
   #37 = Utf8               component3
   #38 = Utf8               copy
   #39 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #40 = Utf8               copy$default
   #41 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #42 = NameAndType        #38:#39       // copy:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #43 = Methodref          #2.#42        // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry.copy:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
   #44 = Utf8               toString
   #45 = Utf8               ()Ljava/lang/String;
   #46 = Utf8               Entry(rect=\u0001, nodeId=\u0001, data=\u0001)
   #47 = String             #46           // Entry(rect=\u0001, nodeId=\u0001, data=\u0001)
   #48 = Utf8               java/lang/invoke/StringConcatFactory
   #49 = Class              #48           // java/lang/invoke/StringConcatFactory
   #50 = Utf8               makeConcatWithConstants
   #51 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #52 = NameAndType        #50:#51       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #53 = Methodref          #49.#52       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #54 = MethodHandle       6:#53         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #55 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Ljava/lang/String;
   #56 = NameAndType        #50:#55       // makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Ljava/lang/String;
   #57 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Ljava/lang/String;
   #58 = Utf8               hashCode
   #59 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
   #60 = Class              #59           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle
   #61 = NameAndType        #58:#32       // hashCode:()I
   #62 = Methodref          #60.#61       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.hashCode:()I
   #63 = Utf8               java/lang/Integer
   #64 = Class              #63           // java/lang/Integer
   #65 = Utf8               (I)I
   #66 = NameAndType        #58:#65       // hashCode:(I)I
   #67 = Methodref          #64.#66       // java/lang/Integer.hashCode:(I)I
   #68 = Methodref          #4.#61        // java/lang/Object.hashCode:()I
   #69 = Utf8               result
   #70 = Utf8               equals
   #71 = Utf8               (Ljava/lang/Object;)Z
   #72 = Utf8               kotlin/jvm/internal/Intrinsics
   #73 = Class              #72           // kotlin/jvm/internal/Intrinsics
   #74 = Utf8               areEqual
   #75 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #76 = NameAndType        #74:#75       // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #77 = Methodref          #73.#76       // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #78 = Utf8               other
   #79 = Utf8               Lkotlin/Metadata;
   #80 = Utf8               mv
   #81 = Integer            2
   #82 = Integer            3
   #83 = Integer            0
   #84 = Utf8               k
   #85 = Integer            1
   #86 = Utf8               xi
   #87 = Integer            48
   #88 = Utf8               d1
   #89 = Utf8               \u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019
   #90 = Utf8               d2
   #91 = Utf8
   #92 = Utf8               Brproject
   #93 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
   #94 = Class              #93           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
   #95 = Utf8               Entry
   #96 = Utf8               Rectangle
   #97 = Utf8               RTreeIndex.kt
   #98 = Utf8               RuntimeInvisibleAnnotations
   #99 = Utf8               Code
  #100 = Utf8               LineNumberTable
  #101 = Utf8               LocalVariableTable
  #102 = Utf8               RuntimeInvisibleParameterAnnotations
  #103 = Utf8               StackMapTable
  #104 = Utf8               InnerClasses
  #105 = Utf8               SourceFile
  #106 = Utf8               RuntimeVisibleAnnotations
  #107 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #11                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
         9: aload_0
        10: iload_2
        11: putfield      #19                 // Field nodeId:I
        14: aload_0
        15: aload_3
        16: putfield      #23                 // Field data:Ljava/lang/Object;
        19: return
      LineNumberTable:
        line 261: 0
        line 262: 4
        line 263: 9
        line 264: 14
        line 261: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
            0      20     1  rect   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      20     2 nodeId   I
            0      20     3  data   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
        0: #8()
          org.jetbrains.annotations.Nullable

  public ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle, int, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_4
         3: iand
         4: ifeq          9
         7: aconst_null
         8: astore_3
         9: aload_0
        10: aload_1
        11: iload_2
        12: aload_3
        13: invokespecial #28                 // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V
        16: return
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */
      LineNumberTable:
        line 261: 0
        line 264: 7
        line 261: 9
        line 265: 16

  public final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle getRect();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
         4: areturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int getNodeId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field nodeId:I
         4: ireturn
      LineNumberTable:
        line 263: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;

  public final java.lang.Object getData();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field data:Ljava/lang/Object;
         4: areturn
      LineNumberTable:
        line 264: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle component1();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int component2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field nodeId:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;

  public final java.lang.Object component3();
    descriptor: ()Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field data:Ljava/lang/Object;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry copy(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=4
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
         3: dup
         4: aload_1
         5: iload_2
         6: aload_3
         7: invokespecial #28                 // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V
        10: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
            0      11     1  rect   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
            0      11     2 nodeId   I
            0      11     3  data   Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
        0: #8()
          org.jetbrains.annotations.Nullable

  public static ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry copy$default(ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Entry, ext.mods.gameserver.geoengine.pathfinding.core.spatial.RTreeIndex$Rectangle, int, java.lang.Object, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        11: astore_1
        12: iload         4
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #19                 // Field nodeId:I
        23: istore_2
        24: iload         4
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #23                 // Field data:Ljava/lang/Object;
        35: astore_3
        36: aload_0
        37: aload_1
        38: iload_2
        39: aload_3
        40: invokevirtual #43                 // Method copy:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
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
         1: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
         4: aload_0
         5: getfield      #19                 // Field nodeId:I
         8: aload_0
         9: getfield      #23                 // Field data:Ljava/lang/Object;
        12: invokedynamic #57,  0             // InvokeDynamic #0:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)Ljava/lang/String;
        17: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
         4: invokevirtual #62                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle.hashCode:()I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #19                 // Field nodeId:I
        16: invokestatic  #67                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #23                 // Field data:Ljava/lang/Object;
        29: ifnonnull     36
        32: iconst_0
        33: goto          43
        36: aload_0
        37: getfield      #23                 // Field data:Ljava/lang/Object;
        40: invokevirtual #68                 // Method java/lang/Object.hashCode:()I
        43: iadd
        44: istore_1
        45: iload_1
        46: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry, int ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry, int ]
          stack = [ int, int ]
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      39     1 result   I
            0      47     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry
        20: astore_2
        21: aload_0
        22: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        25: aload_2
        26: getfield      #15                 // Field rect:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;
        29: invokestatic  #77                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        32: ifne          37
        35: iconst_0
        36: ireturn
        37: aload_0
        38: getfield      #19                 // Field nodeId:I
        41: aload_2
        42: getfield      #19                 // Field nodeId:I
        45: if_icmpeq     50
        48: iconst_0
        49: ireturn
        50: aload_0
        51: getfield      #23                 // Field data:Ljava/lang/Object;
        54: aload_2
        55: getfield      #23                 // Field data:Ljava/lang/Object;
        58: invokestatic  #77                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        61: ifne          66
        64: iconst_0
        65: ireturn
        66: iconst_1
        67: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry ]
        frame_type = 12 /* same */
        frame_type = 15 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;
            0      68     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #95= #2 of #94;     // Entry=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
  public static final #96= #60 of #94;    // Rectangle=class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle of class ext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex
SourceFile: "RTreeIndex.kt"
RuntimeVisibleAnnotations:
  0: #79(#80=[I#81,I#82,I#83],#84=I#85,#86=I#87,#88=[s#89],#90=[s#25,s#91,s#12,s#13,s#16,s#91,s#20,s#5,s#6,s#29,s#30,s#31,s#32,s#33,s#34,s#35,s#36,s#37,s#38,s#70,s#91,s#78,s#58,s#44,s#91,s#92])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Entry;","","rect","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","nodeId","","data","<init>","(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;ILjava/lang/Object;)V","getRect","()Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex$Rectangle;","getNodeId","()I","getData","()Ljava/lang/Object;","component1","component2","component3","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #54 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #47 Entry(rect=\u0001, nodeId=\u0001, data=\u0001)
