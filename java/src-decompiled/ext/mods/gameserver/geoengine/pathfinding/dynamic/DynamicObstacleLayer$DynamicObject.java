// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject
// File: ext\mods\gameserver\geoengine\pathfinding\dynamic\DynamicObstacleLayer$DynamicObject.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.class
  Last modified 9 de jul de 2026; size 4413 bytes
  MD5 checksum 343b5306813b0948c376f4c269f46b13
  Compiled from "DynamicObstacleLayer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 14, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               id
   #12 = Utf8               Ljava/lang/String;
   #13 = NameAndType        #11:#12       // id:Ljava/lang/String;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.id:Ljava/lang/String;
   #15 = Utf8               nodeIds
   #16 = Utf8               [I
   #17 = NameAndType        #15:#16       // nodeIds:[I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.nodeIds:[I
   #19 = Utf8               type
   #20 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #21 = NameAndType        #19:#20       // type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #23 = Utf8               blocked
   #24 = Utf8               Z
   #25 = NameAndType        #23:#24       // blocked:Z
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.blocked:Z
   #27 = Utf8               this
   #28 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
   #29 = Utf8               getId
   #30 = Utf8               ()Ljava/lang/String;
   #31 = Utf8               getNodeIds
   #32 = Utf8               ()[I
   #33 = Utf8               getType
   #34 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
   #35 = Utf8               getBlocked
   #36 = Utf8               ()Z
   #37 = Utf8               equals
   #38 = Utf8               (Ljava/lang/Object;)Z
   #39 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #40 = Utf8               kotlin/jvm/internal/Intrinsics
   #41 = Class              #40           // kotlin/jvm/internal/Intrinsics
   #42 = Utf8               areEqual
   #43 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #44 = NameAndType        #42:#43       // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #45 = Methodref          #41.#44       // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #46 = Utf8               other
   #47 = Utf8               Ljava/lang/Object;
   #48 = Utf8               hashCode
   #49 = Utf8               ()I
   #50 = Utf8               java/lang/String
   #51 = Class              #50           // java/lang/String
   #52 = NameAndType        #48:#49       // hashCode:()I
   #53 = Methodref          #51.#52       // java/lang/String.hashCode:()I
   #54 = Utf8               component1
   #55 = Utf8               component2
   #56 = Utf8               component3
   #57 = Utf8               component4
   #58 = Utf8               copy
   #59 = Utf8               (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
   #60 = NameAndType        #5:#6         // "<init>":(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
   #61 = Methodref          #2.#60        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject."<init>":(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
   #62 = Utf8               copy$default
   #63 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
   #64 = NameAndType        #58:#59       // copy:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
   #65 = Methodref          #2.#64        // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject.copy:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
   #66 = Utf8               toString
   #67 = Utf8               java/util/Arrays
   #68 = Class              #67           // java/util/Arrays
   #69 = Utf8               ([I)Ljava/lang/String;
   #70 = NameAndType        #66:#69       // toString:([I)Ljava/lang/String;
   #71 = Methodref          #68.#70       // java/util/Arrays.toString:([I)Ljava/lang/String;
   #72 = Utf8               DynamicObject(id=\u0001, nodeIds=\u0001, type=\u0001, blocked=\u0001)
   #73 = String             #72           // DynamicObject(id=\u0001, nodeIds=\u0001, type=\u0001, blocked=\u0001)
   #74 = Utf8               java/lang/invoke/StringConcatFactory
   #75 = Class              #74           // java/lang/invoke/StringConcatFactory
   #76 = Utf8               makeConcatWithConstants
   #77 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #78 = NameAndType        #76:#77       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #79 = Methodref          #75.#78       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = MethodHandle       6:#79         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #81 = Utf8               (Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Ljava/lang/String;
   #82 = NameAndType        #76:#81       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Ljava/lang/String;
   #83 = InvokeDynamic      #0:#82        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Ljava/lang/String;
   #84 = Utf8               Lkotlin/Metadata;
   #85 = Utf8               mv
   #86 = Integer            2
   #87 = Integer            3
   #88 = Integer            0
   #89 = Utf8               k
   #90 = Integer            1
   #91 = Utf8               xi
   #92 = Integer            48
   #93 = Utf8               d1
   #94 = Utf8               \u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e
   #95 = Utf8               d2
   #96 = Utf8
   #97 = Utf8               Brproject
   #98 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #99 = Class              #98           // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #100 = Utf8               DynamicObject
  #101 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  #102 = Class              #101          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  #103 = Utf8               ObjectType
  #104 = Utf8               DynamicObstacleLayer.kt
  #105 = Utf8               RuntimeInvisibleAnnotations
  #106 = Utf8               Code
  #107 = Utf8               LineNumberTable
  #108 = Utf8               LocalVariableTable
  #109 = Utf8               RuntimeInvisibleParameterAnnotations
  #110 = Utf8               StackMapTable
  #111 = Utf8               InnerClasses
  #112 = Utf8               SourceFile
  #113 = Utf8               RuntimeVisibleAnnotations
  #114 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject(java.lang.String, int[], ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType, boolean);
    descriptor: (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field id:Ljava/lang/String;
         9: aload_0
        10: aload_2
        11: putfield      #18                 // Field nodeIds:[I
        14: aload_0
        15: aload_3
        16: putfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        19: aload_0
        20: iload         4
        22: putfield      #26                 // Field blocked:Z
        25: return
      LineNumberTable:
        line 167: 0
        line 168: 4
        line 169: 9
        line 170: 14
        line 171: 19
        line 167: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
            0      26     1    id   Ljava/lang/String;
            0      26     2 nodeIds   [I
            0      26     3  type   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
            0      26     4 blocked   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 3:

  public final java.lang.String getId();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int[] getNodeIds();
    descriptor: ()[I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field nodeIds:[I
         4: areturn
      LineNumberTable:
        line 169: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType getType();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
         4: areturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final boolean getBlocked();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field blocked:Z
         4: ireturn
      LineNumberTable:
        line 171: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #14                 // Field id:Ljava/lang/String;
        20: aload_1
        21: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
        24: getfield      #14                 // Field id:Ljava/lang/String;
        27: invokestatic  #45                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        30: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 7 /* same */
        frame_type = 8 /* same */
      LineNumberTable:
        line 174: 0
        line 175: 7
        line 176: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
            0      31     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #39()
          org.jetbrains.annotations.Nullable

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:Ljava/lang/String;
         4: invokevirtual #53                 // Method java/lang/String.hashCode:()I
         7: ireturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;

  public final java.lang.String component1();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field id:Ljava/lang/String;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final int[] component2();
    descriptor: ()[I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field nodeIds:[I
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType component3();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final boolean component4();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field blocked:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject copy(java.lang.String, int[], ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType, boolean);
    descriptor: (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject
         3: dup
         4: aload_1
         5: aload_2
         6: aload_3
         7: iload         4
         9: invokespecial #61                 // Method "<init>":(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
            0      13     1    id   Ljava/lang/String;
            0      13     2 nodeIds   [I
            0      13     3  type   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
            0      13     4 blocked   Z
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 3:

  public static ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject copy$default(ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$DynamicObject, java.lang.String, int[], ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field id:Ljava/lang/String;
        11: astore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #18                 // Field nodeIds:[I
        23: astore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        35: astore_3
        36: iload         5
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #26                 // Field blocked:Z
        48: istore        4
        50: aload_0
        51: aload_1
        52: aload_2
        53: aload_3
        54: iload         4
        56: invokevirtual #65                 // Method copy:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
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
         1: getfield      #14                 // Field id:Ljava/lang/String;
         4: aload_0
         5: getfield      #18                 // Field nodeIds:[I
         8: invokestatic  #71                 // Method java/util/Arrays.toString:([I)Ljava/lang/String;
        11: aload_0
        12: getfield      #22                 // Field type:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
        15: aload_0
        16: getfield      #26                 // Field blocked:Z
        19: invokedynamic #83,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)Ljava/lang/String;
        24: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #100= #2 of #99;    // DynamicObject=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  public static final #103= #102 of #99;  // ObjectType=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
SourceFile: "DynamicObstacleLayer.kt"
RuntimeVisibleAnnotations:
  0: #84(#85=[I#86,I#87,I#88],#89=I#90,#91=I#92,#93=[s#94],#95=[s#28,s#96,s#11,s#96,s#15,s#96,s#19,s#20,s#23,s#96,s#5,s#6,s#29,s#30,s#31,s#32,s#33,s#34,s#35,s#36,s#37,s#46,s#48,s#96,s#54,s#55,s#56,s#57,s#58,s#66,s#97])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$DynamicObject;","","id","","nodeIds","","type","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;","blocked","","<init>","(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;Z)V","getId","()Ljava/lang/String;","getNodeIds","()[I","getType","()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;","getBlocked","()Z","equals","other","hashCode","","component1","component2","component3","component4","copy","toString","Brproject"]
    )
BootstrapMethods:
  0: #80 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #73 DynamicObject(id=\u0001, nodeIds=\u0001, type=\u0001, blocked=\u0001)
