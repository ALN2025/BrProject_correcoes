// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData
// File: ext\mods\gameserver\geoengine\pathfinding\model\PathNodeData.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.class
  Last modified 9 de jul de 2026; size 5118 bytes
  MD5 checksum f04373c541e61a777abe13f40c508edb
  Compiled from "PathNode.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 25, attributes: 3
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (IIIBIIII)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               x
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // x:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.x:I
   #14 = Utf8               y
   #15 = NameAndType        #14:#11       // y:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.y:I
   #17 = Utf8               z
   #18 = NameAndType        #17:#11       // z:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.z:I
   #20 = Utf8               flags
   #21 = Utf8               B
   #22 = NameAndType        #20:#21       // flags:B
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.flags:B
   #24 = Utf8               jpsDistances
   #25 = NameAndType        #24:#11       // jpsDistances:I
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.jpsDistances:I
   #27 = Utf8               successorOffset
   #28 = NameAndType        #27:#11       // successorOffset:I
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.successorOffset:I
   #30 = Utf8               successorCount
   #31 = NameAndType        #30:#11       // successorCount:I
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.successorCount:I
   #33 = Utf8               clusterId
   #34 = NameAndType        #33:#11       // clusterId:I
   #35 = Fieldref           #2.#34        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.clusterId:I
   #36 = Utf8               this
   #37 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
   #38 = Utf8               getX
   #39 = Utf8               ()I
   #40 = Utf8               getY
   #41 = Utf8               getZ
   #42 = Utf8               getFlags
   #43 = Utf8               ()B
   #44 = Utf8               getJpsDistances
   #45 = Utf8               getSuccessorOffset
   #46 = Utf8               getSuccessorCount
   #47 = Utf8               getClusterId
   #48 = Utf8               isWalkable
   #49 = Utf8               ()Z
   #50 = Utf8               getJpsDistance
   #51 = Utf8               (I)I
   #52 = Utf8               direction
   #53 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
   #54 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #55 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #56 = Class              #55           // ext/mods/gameserver/geoengine/pathfinding/model/Direction
   #57 = Utf8               ordinal
   #58 = NameAndType        #57:#39       // ordinal:()I
   #59 = Methodref          #56.#58       // ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
   #60 = NameAndType        #50:#51       // getJpsDistance:(I)I
   #61 = Methodref          #2.#60        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.getJpsDistance:(I)I
   #62 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #63 = Utf8               component1
   #64 = Utf8               component2
   #65 = Utf8               component3
   #66 = Utf8               component4
   #67 = Utf8               component5
   #68 = Utf8               component6
   #69 = Utf8               component7
   #70 = Utf8               component8
   #71 = Utf8               copy
   #72 = Utf8               (IIIBIIII)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
   #73 = NameAndType        #5:#6         // "<init>":(IIIBIIII)V
   #74 = Methodref          #2.#73        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData."<init>":(IIIBIIII)V
   #75 = Utf8               copy$default
   #76 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;IIIBIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
   #77 = NameAndType        #71:#72       // copy:(IIIBIIII)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
   #78 = Methodref          #2.#77        // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData.copy:(IIIBIIII)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
   #79 = Utf8               toString
   #80 = Utf8               ()Ljava/lang/String;
   #81 = Utf8               PathNodeData(x=\u0001, y=\u0001, z=\u0001, flags=\u0001, jpsDistances=\u0001, successorOffset=\u0001, successorCount=\u0001, clusterId=\u0001)
   #82 = String             #81           // PathNodeData(x=\u0001, y=\u0001, z=\u0001, flags=\u0001, jpsDistances=\u0001, successorOffset=\u0001, successorCount=\u0001, clusterId=\u0001)
   #83 = Utf8               java/lang/invoke/StringConcatFactory
   #84 = Class              #83           // java/lang/invoke/StringConcatFactory
   #85 = Utf8               makeConcatWithConstants
   #86 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #87 = NameAndType        #85:#86       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #88 = Methodref          #84.#87       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #89 = MethodHandle       6:#88         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #90 = Utf8               (IIIBIIII)Ljava/lang/String;
   #91 = NameAndType        #85:#90       // makeConcatWithConstants:(IIIBIIII)Ljava/lang/String;
   #92 = InvokeDynamic      #0:#91        // #0:makeConcatWithConstants:(IIIBIIII)Ljava/lang/String;
   #93 = Utf8               hashCode
   #94 = Utf8               java/lang/Integer
   #95 = Class              #94           // java/lang/Integer
   #96 = NameAndType        #93:#51       // hashCode:(I)I
   #97 = Methodref          #95.#96       // java/lang/Integer.hashCode:(I)I
   #98 = Utf8               java/lang/Byte
   #99 = Class              #98           // java/lang/Byte
  #100 = Utf8               (B)I
  #101 = NameAndType        #93:#100      // hashCode:(B)I
  #102 = Methodref          #99.#101      // java/lang/Byte.hashCode:(B)I
  #103 = Utf8               result
  #104 = Utf8               equals
  #105 = Utf8               (Ljava/lang/Object;)Z
  #106 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #107 = Utf8               other
  #108 = Utf8               Ljava/lang/Object;
  #109 = Utf8               Lkotlin/Metadata;
  #110 = Utf8               mv
  #111 = Integer            2
  #112 = Integer            3
  #113 = Integer            0
  #114 = Utf8               k
  #115 = Integer            1
  #116 = Utf8               xi
  #117 = Integer            48
  #118 = Utf8               d1
  #119 = Utf8               \u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a¨\u0006,
  #120 = Utf8               d2
  #121 = Utf8
  #122 = Utf8               Brproject
  #123 = Utf8               PathNode.kt
  #124 = Utf8               Code
  #125 = Utf8               LineNumberTable
  #126 = Utf8               LocalVariableTable
  #127 = Utf8               StackMapTable
  #128 = Utf8               RuntimeInvisibleParameterAnnotations
  #129 = Utf8               RuntimeInvisibleAnnotations
  #130 = Utf8               SourceFile
  #131 = Utf8               RuntimeVisibleAnnotations
  #132 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData(int, int, int, byte, int, int, int, int);
    descriptor: (IIIBIIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=9, args_size=9
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
        19: aload_0
        20: iload         4
        22: putfield      #23                 // Field flags:B
        25: aload_0
        26: iload         5
        28: putfield      #26                 // Field jpsDistances:I
        31: aload_0
        32: iload         6
        34: putfield      #29                 // Field successorOffset:I
        37: aload_0
        38: iload         7
        40: putfield      #32                 // Field successorCount:I
        43: aload_0
        44: iload         8
        46: putfield      #35                 // Field clusterId:I
        49: return
      LineNumberTable:
        line 142: 0
        line 143: 4
        line 144: 9
        line 145: 14
        line 146: 19
        line 147: 25
        line 148: 31
        line 149: 37
        line 150: 43
        line 142: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
            0      50     1     x   I
            0      50     2     y   I
            0      50     3     z   I
            0      50     4 flags   B
            0      50     5 jpsDistances   I
            0      50     6 successorOffset   I
            0      50     7 successorCount   I
            0      50     8 clusterId   I

  public final int getX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 144: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 145: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final byte getFlags();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field flags:B
         4: ireturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getJpsDistances();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field jpsDistances:I
         4: ireturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getSuccessorOffset();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field successorOffset:I
         4: ireturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getSuccessorCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field successorCount:I
         4: ireturn
      LineNumberTable:
        line 149: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getClusterId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field clusterId:I
         4: ireturn
      LineNumberTable:
        line 150: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final boolean isWalkable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field flags:B
         4: iconst_1
         5: iand
         6: ifeq          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int getJpsDistance(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #26                 // Field jpsDistances:I
         4: iload_1
         5: iconst_4
         6: imul
         7: iushr
         8: bipush        15
        10: iand
        11: ireturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
            0      12     1 direction   I

  public final int getJpsDistance(ext.mods.gameserver.geoengine.pathfinding.model.Direction);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #59                 // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
         5: invokevirtual #61                 // Method getJpsDistance:(I)I
         8: ireturn
      LineNumberTable:
        line 155: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
            0       9     1 direction   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #54()
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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

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
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final byte component4();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field flags:B
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int component5();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field jpsDistances:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int component6();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field successorOffset:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int component7();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field successorCount:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final int component8();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field clusterId:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

  public final ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData copy(int, int, int, byte, int, int, int, int);
    descriptor: (IIIBIIII)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=9, args_size=9
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: iload         7
        15: iload         8
        17: invokespecial #74                 // Method "<init>":(IIIBIIII)V
        20: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
            0      21     1     x   I
            0      21     2     y   I
            0      21     3     z   I
            0      21     4 flags   B
            0      21     5 jpsDistances   I
            0      21     6 successorOffset   I
            0      21     7 successorCount   I
            0      21     8 clusterId   I
    RuntimeInvisibleAnnotations:
      0: #54()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData copy$default(ext.mods.gameserver.geoengine.pathfinding.model.PathNodeData, int, int, int, byte, int, int, int, int, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;IIIBIIIIILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=11, args_size=11
         0: iload         9
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field x:I
        11: istore_1
        12: iload         9
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #16                 // Field y:I
        23: istore_2
        24: iload         9
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #19                 // Field z:I
        35: istore_3
        36: iload         9
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #23                 // Field flags:B
        48: istore        4
        50: iload         9
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #26                 // Field jpsDistances:I
        62: istore        5
        64: iload         9
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #29                 // Field successorOffset:I
        76: istore        6
        78: iload         9
        80: bipush        64
        82: iand
        83: ifeq          92
        86: aload_0
        87: getfield      #32                 // Field successorCount:I
        90: istore        7
        92: iload         9
        94: sipush        128
        97: iand
        98: ifeq          107
       101: aload_0
       102: getfield      #35                 // Field clusterId:I
       105: istore        8
       107: aload_0
       108: iload_1
       109: iload_2
       110: iload_3
       111: iload         4
       113: iload         5
       115: iload         6
       117: iload         7
       119: iload         8
       121: invokevirtual #78                 // Method copy:(IIIBIIII)Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
       124: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: aload_0
         5: getfield      #16                 // Field y:I
         8: aload_0
         9: getfield      #19                 // Field z:I
        12: aload_0
        13: getfield      #23                 // Field flags:B
        16: aload_0
        17: getfield      #26                 // Field jpsDistances:I
        20: aload_0
        21: getfield      #29                 // Field successorOffset:I
        24: aload_0
        25: getfield      #32                 // Field successorCount:I
        28: aload_0
        29: getfield      #35                 // Field clusterId:I
        32: invokedynamic #92,  0             // InvokeDynamic #0:makeConcatWithConstants:(IIIBIIII)Ljava/lang/String;
        37: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
    RuntimeInvisibleAnnotations:
      0: #54()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field x:I
         4: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #16                 // Field y:I
        16: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #19                 // Field z:I
        29: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field flags:B
        42: invokestatic  #102                // Method java/lang/Byte.hashCode:(B)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #26                 // Field jpsDistances:I
        55: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #29                 // Field successorOffset:I
        68: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #32                 // Field successorCount:I
        81: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
        84: iadd
        85: istore_1
        86: iload_1
        87: bipush        31
        89: imul
        90: aload_0
        91: getfield      #35                 // Field clusterId:I
        94: invokestatic  #97                 // Method java/lang/Integer.hashCode:(I)I
        97: iadd
        98: istore_1
        99: iload_1
       100: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      93     1 result   I
            0     101     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData
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
        60: aload_0
        61: getfield      #23                 // Field flags:B
        64: aload_2
        65: getfield      #23                 // Field flags:B
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: aload_0
        74: getfield      #26                 // Field jpsDistances:I
        77: aload_2
        78: getfield      #26                 // Field jpsDistances:I
        81: if_icmpeq     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #29                 // Field successorOffset:I
        90: aload_2
        91: getfield      #29                 // Field successorOffset:I
        94: if_icmpeq     99
        97: iconst_0
        98: ireturn
        99: aload_0
       100: getfield      #32                 // Field successorCount:I
       103: aload_2
       104: getfield      #32                 // Field successorCount:I
       107: if_icmpeq     112
       110: iconst_0
       111: ireturn
       112: aload_0
       113: getfield      #35                 // Field clusterId:I
       116: aload_2
       117: getfield      #35                 // Field clusterId:I
       120: if_icmpeq     125
       123: iconst_0
       124: ireturn
       125: iconst_1
       126: ireturn
      StackMapTable: number_of_entries = 10
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNodeData ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     127     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;
            0     127     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #106()
          org.jetbrains.annotations.Nullable
}
SourceFile: "PathNode.kt"
RuntimeVisibleAnnotations:
  0: #109(#110=[I#111,I#112,I#113],#114=I#115,#116=I#117,#118=[s#119],#120=[s#37,s#121,s#10,s#121,s#14,s#17,s#20,s#121,s#24,s#27,s#30,s#33,s#5,s#6,s#38,s#39,s#40,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#121,s#49,s#50,s#52,s#62,s#63,s#64,s#65,s#66,s#67,s#68,s#69,s#70,s#71,s#104,s#107,s#93,s#79,s#121,s#122])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a¨\u0006,"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeData;","","x","","y","z","flags","","jpsDistances","successorOffset","successorCount","clusterId","<init>","(IIIBIIII)V","getX","()I","getY","getZ","getFlags","()B","getJpsDistances","getSuccessorOffset","getSuccessorCount","getClusterId","isWalkable","","()Z","getJpsDistance","direction","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","component1","component2","component3","component4","component5","component6","component7","component8","copy","equals","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #82 PathNodeData(x=\u0001, y=\u0001, z=\u0001, flags=\u0001, jpsDistances=\u0001, successorOffset=\u0001, successorCount=\u0001, clusterId=\u0001)
