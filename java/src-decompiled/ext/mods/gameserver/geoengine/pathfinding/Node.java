// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.Node
// File: ext\mods\gameserver\geoengine\pathfinding\Node.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/Node.class
  Last modified 9 de jul de 2026; size 4477 bytes
  MD5 checksum 9335400cd75670716894a4acea7f0faf
  Compiled from "Node.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.Node extends java.lang.Object implements java.lang.Comparable<ext.mods.gameserver.geoengine.pathfinding.Node>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/Node
  super_class: #5                         // java/lang/Object
  interfaces: 1, fields: 10, methods: 20, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/Node
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/Node
    #3 = Utf8               Ljava/lang/Object;Ljava/lang/Comparable<Lext/mods/gameserver/geoengine/pathfinding/Node;>;
    #4 = Utf8               java/lang/Object
    #5 = Class              #4            // java/lang/Object
    #6 = Utf8               java/lang/Comparable
    #7 = Class              #6            // java/lang/Comparable
    #8 = Utf8               <init>
    #9 = Utf8               (IIIB)V
   #10 = Utf8               ()V
   #11 = NameAndType        #8:#10        // "<init>":()V
   #12 = Methodref          #5.#11        // java/lang/Object."<init>":()V
   #13 = Utf8               geoX
   #14 = Utf8               I
   #15 = NameAndType        #13:#14       // geoX:I
   #16 = Fieldref           #2.#15        // ext/mods/gameserver/geoengine/pathfinding/Node.geoX:I
   #17 = Utf8               geoY
   #18 = NameAndType        #17:#14       // geoY:I
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/Node.geoY:I
   #20 = Utf8               z
   #21 = NameAndType        #20:#14       // z:I
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/Node.z:I
   #23 = Utf8               nswe
   #24 = Utf8               B
   #25 = NameAndType        #23:#24       // nswe:B
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/Node.nswe:B
   #27 = Utf8               this
   #28 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/Node;
   #29 = Utf8               getGeoX
   #30 = Utf8               ()I
   #31 = Utf8               getGeoY
   #32 = Utf8               getZ
   #33 = Utf8               getNswe
   #34 = Utf8               ()B
   #35 = Utf8               getCostG
   #36 = Utf8               costG
   #37 = NameAndType        #36:#14       // costG:I
   #38 = Fieldref           #2.#37        // ext/mods/gameserver/geoengine/pathfinding/Node.costG:I
   #39 = Utf8               setCostG
   #40 = Utf8               (I)V
   #41 = Utf8               <set-?>
   #42 = Utf8               getCostH
   #43 = Utf8               costH
   #44 = NameAndType        #43:#14       // costH:I
   #45 = Fieldref           #2.#44        // ext/mods/gameserver/geoengine/pathfinding/Node.costH:I
   #46 = Utf8               setCostH
   #47 = Utf8               getCostF
   #48 = Utf8               costF
   #49 = NameAndType        #48:#14       // costF:I
   #50 = Fieldref           #2.#49        // ext/mods/gameserver/geoengine/pathfinding/Node.costF:I
   #51 = Utf8               setCostF
   #52 = Utf8               getParent
   #53 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/Node;
   #54 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #55 = Utf8               parent
   #56 = NameAndType        #55:#28       // parent:Lext/mods/gameserver/geoengine/pathfinding/Node;
   #57 = Fieldref           #2.#56        // ext/mods/gameserver/geoengine/pathfinding/Node.parent:Lext/mods/gameserver/geoengine/pathfinding/Node;
   #58 = Utf8               setParent
   #59 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;)V
   #60 = Utf8               setCost
   #61 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;II)V
   #62 = Utf8               parentNode
   #63 = Utf8               weight
   #64 = Utf8               hCost
   #65 = Utf8               compareTo
   #66 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;)I
   #67 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #68 = Utf8               other
   #69 = Utf8               equals
   #70 = Utf8               (Ljava/lang/Object;)Z
   #71 = Utf8               getClass
   #72 = Utf8               ()Ljava/lang/Class;
   #73 = NameAndType        #71:#72       // getClass:()Ljava/lang/Class;
   #74 = Methodref          #5.#73        // java/lang/Object.getClass:()Ljava/lang/Class;
   #75 = Utf8               kotlin/jvm/internal/Intrinsics
   #76 = Class              #75           // kotlin/jvm/internal/Intrinsics
   #77 = Utf8               areEqual
   #78 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #79 = NameAndType        #77:#78       // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #80 = Methodref          #76.#79       // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #81 = Utf8               null cannot be cast to non-null type ext.mods.gameserver.geoengine.pathfinding.Node
   #82 = String             #81           // null cannot be cast to non-null type ext.mods.gameserver.geoengine.pathfinding.Node
   #83 = Utf8               checkNotNull
   #84 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #85 = NameAndType        #83:#84       // checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #86 = Methodref          #76.#85       // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #87 = Utf8               Ljava/lang/Object;
   #88 = Utf8               java/lang/Class
   #89 = Class              #88           // java/lang/Class
   #90 = Utf8               hashCode
   #91 = Utf8               result
   #92 = Utf8               clean
   #93 = Utf8               (Ljava/lang/Object;)I
   #94 = NameAndType        #65:#66       // compareTo:(Lext/mods/gameserver/geoengine/pathfinding/Node;)I
   #95 = Methodref          #2.#94        // ext/mods/gameserver/geoengine/pathfinding/Node.compareTo:(Lext/mods/gameserver/geoengine/pathfinding/Node;)I
   #96 = Utf8               <clinit>
   #97 = Utf8               ext/mods/gameserver/geoengine/pathfinding/Node$Companion
   #98 = Class              #97           // ext/mods/gameserver/geoengine/pathfinding/Node$Companion
   #99 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #100 = NameAndType        #8:#99        // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #101 = Methodref          #98.#100      // ext/mods/gameserver/geoengine/pathfinding/Node$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #102 = Utf8               Companion
  #103 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/Node$Companion;
  #104 = NameAndType        #102:#103     // Companion:Lext/mods/gameserver/geoengine/pathfinding/Node$Companion;
  #105 = Fieldref           #2.#104       // ext/mods/gameserver/geoengine/pathfinding/Node.Companion:Lext/mods/gameserver/geoengine/pathfinding/Node$Companion;
  #106 = Utf8               START_COST
  #107 = Integer            0
  #108 = Utf8               Lkotlin/Metadata;
  #109 = Utf8               mv
  #110 = Integer            2
  #111 = Integer            3
  #112 = Utf8               k
  #113 = Integer            1
  #114 = Utf8               xi
  #115 = Integer            48
  #116 = Utf8               d1
  #117 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003J\u0012\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0000H\u0096\u0082\u0004J\u0014\u0010&\u001a\u00020\'2\b\u0010%\u001a\u0004\u0018\u00010(H\u0096\u0082\u0004J\n\u0010)\u001a\u00020\u0003H\u0096\u0080\u0004J\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,
  #118 = Utf8               d2
  #119 = Utf8
  #120 = Utf8               Brproject
  #121 = Utf8               Node.kt
  #122 = Utf8               RuntimeInvisibleAnnotations
  #123 = Utf8               ConstantValue
  #124 = Utf8               Code
  #125 = Utf8               LineNumberTable
  #126 = Utf8               LocalVariableTable
  #127 = Utf8               RuntimeInvisibleParameterAnnotations
  #128 = Utf8               StackMapTable
  #129 = Utf8               InnerClasses
  #130 = Utf8               Signature
  #131 = Utf8               SourceFile
  #132 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.Node$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/Node$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #67()
        org.jetbrains.annotations.NotNull

  public static final int START_COST;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public ext.mods.gameserver.geoengine.pathfinding.Node(int, int, int, byte);
    descriptor: (IIIB)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #16                 // Field geoX:I
         9: aload_0
        10: iload_2
        11: putfield      #19                 // Field geoY:I
        14: aload_0
        15: iload_3
        16: putfield      #22                 // Field z:I
        19: aload_0
        20: iload         4
        22: putfield      #26                 // Field nswe:B
        25: return
      LineNumberTable:
        line 26: 0
        line 27: 4
        line 28: 9
        line 29: 14
        line 30: 19
        line 26: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0      26     1  geoX   I
            0      26     2  geoY   I
            0      26     3     z   I
            0      26     4  nswe   B

  public final int getGeoX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field geoX:I
         4: ireturn
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final int getGeoY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field geoY:I
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final int getZ();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field z:I
         4: ireturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final byte getNswe();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field nswe:B
         4: ireturn
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final int getCostG();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field costG:I
         4: ireturn
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final void setCostG(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #38                 // Field costG:I
         5: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0       6     1 <set-?>   I

  public final int getCostH();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field costH:I
         4: ireturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final void setCostH(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #45                 // Field costH:I
         5: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0       6     1 <set-?>   I

  public final int getCostF();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field costF:I
         4: ireturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final void setCostF(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #50                 // Field costF:I
         5: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0       6     1 <set-?>   I

  public final ext.mods.gameserver.geoengine.pathfinding.Node getParent();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/Node;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field parent:Lext/mods/gameserver/geoengine/pathfinding/Node;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
    RuntimeInvisibleAnnotations:
      0: #54()
        org.jetbrains.annotations.Nullable

  public final void setParent(ext.mods.gameserver.geoengine.pathfinding.Node);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/Node;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #57                 // Field parent:Lext/mods/gameserver/geoengine/pathfinding/Node;
         5: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0       6     1 <set-?>   Lext/mods/gameserver/geoengine/pathfinding/Node;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #54()
          org.jetbrains.annotations.Nullable

  public final void setCost(ext.mods.gameserver.geoengine.pathfinding.Node, int, int);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/Node;II)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: iload_2
         2: putfield      #38                 // Field costG:I
         5: aload_1
         6: ifnull        22
         9: aload_0
        10: aload_0
        11: getfield      #38                 // Field costG:I
        14: aload_1
        15: getfield      #38                 // Field costG:I
        18: iadd
        19: putfield      #38                 // Field costG:I
        22: aload_0
        23: iload_3
        24: putfield      #45                 // Field costH:I
        27: aload_0
        28: aload_0
        29: getfield      #38                 // Field costG:I
        32: aload_0
        33: getfield      #45                 // Field costH:I
        36: iadd
        37: putfield      #50                 // Field costF:I
        40: aload_0
        41: aload_1
        42: putfield      #57                 // Field parent:Lext/mods/gameserver/geoengine/pathfinding/Node;
        45: return
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */
      LineNumberTable:
        line 38: 0
        line 39: 5
        line 40: 9
        line 43: 22
        line 44: 27
        line 45: 40
        line 46: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0      46     1 parentNode   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0      46     2 weight   I
            0      46     3 hCost   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #54()
          org.jetbrains.annotations.Nullable
      parameter 1:
      parameter 2:

  public int compareTo(ext.mods.gameserver.geoengine.pathfinding.Node);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/Node;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #50                 // Field costF:I
         4: aload_1
         5: getfield      #50                 // Field costF:I
         8: isub
         9: ireturn
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0      10     1 other   Lext/mods/gameserver/geoengine/pathfinding/Node;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #67()
          org.jetbrains.annotations.NotNull

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_0
         8: invokevirtual #74                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        11: aload_1
        12: dup
        13: ifnull        22
        16: invokevirtual #74                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        19: goto          24
        22: pop
        23: aconst_null
        24: invokestatic  #80                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        27: ifne          32
        30: iconst_0
        31: ireturn
        32: aload_1
        33: dup
        34: ldc           #82                 // String null cannot be cast to non-null type ext.mods.gameserver.geoengine.pathfinding.Node
        36: invokestatic  #86                 // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        39: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/Node
        42: pop
        43: aload_0
        44: getfield      #16                 // Field geoX:I
        47: aload_1
        48: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/Node
        51: getfield      #16                 // Field geoX:I
        54: if_icmpeq     59
        57: iconst_0
        58: ireturn
        59: aload_0
        60: getfield      #19                 // Field geoY:I
        63: aload_1
        64: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/Node
        67: getfield      #19                 // Field geoY:I
        70: if_icmpeq     75
        73: iconst_0
        74: ireturn
        75: aload_0
        76: getfield      #22                 // Field z:I
        79: aload_1
        80: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/Node
        83: getfield      #22                 // Field z:I
        86: if_icmpeq     91
        89: iconst_0
        90: ireturn
        91: iconst_1
        92: ireturn
      StackMapTable: number_of_entries = 7
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/Node, class java/lang/Object ]
          stack = [ class java/lang/Class, class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/Node, class java/lang/Object ]
          stack = [ class java/lang/Class, class java/lang/Class ]
        frame_type = 7 /* same */
        frame_type = 26 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
      LineNumberTable:
        line 51: 0
        line 52: 7
        line 53: 32
        line 54: 43
        line 55: 59
        line 56: 75
        line 57: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      93     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0      93     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #54()
          org.jetbrains.annotations.Nullable

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #16                 // Field geoX:I
         4: istore_1
         5: bipush        31
         7: iload_1
         8: imul
         9: aload_0
        10: getfield      #19                 // Field geoY:I
        13: iadd
        14: istore_1
        15: bipush        31
        17: iload_1
        18: imul
        19: aload_0
        20: getfield      #22                 // Field z:I
        23: iadd
        24: istore_1
        25: iload_1
        26: ireturn
      LineNumberTable:
        line 60: 0
        line 61: 5
        line 62: 15
        line 63: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            5      22     1 result   I
            0      27     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public final void clean();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #38                 // Field costG:I
         5: aload_0
         6: iconst_0
         7: putfield      #45                 // Field costH:I
        10: aload_0
        11: iconst_0
        12: putfield      #50                 // Field costF:I
        15: aload_0
        16: aconst_null
        17: putfield      #57                 // Field parent:Lext/mods/gameserver/geoengine/pathfinding/Node;
        20: return
      LineNumberTable:
        line 66: 0
        line 67: 5
        line 68: 10
        line 69: 15
        line 70: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;

  public int compareTo(java.lang.Object);
    descriptor: (Ljava/lang/Object;)I
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/Node
         5: invokevirtual #95                 // Method compareTo:(Lext/mods/gameserver/geoengine/pathfinding/Node;)I
         8: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/Node;
            0       9     1 other   Ljava/lang/Object;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #98                 // class ext/mods/gameserver/geoengine/pathfinding/Node$Companion
         3: dup
         4: aconst_null
         5: invokespecial #101                // Method ext/mods/gameserver/geoengine/pathfinding/Node$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #105                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/Node$Companion;
        11: return
}
InnerClasses:
  public static final #102= #98 of #2;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/Node$Companion of class ext/mods/gameserver/geoengine/pathfinding/Node
Signature: #3                           // Ljava/lang/Object;Ljava/lang/Comparable<Lext/mods/gameserver/geoengine/pathfinding/Node;>;
SourceFile: "Node.kt"
RuntimeVisibleAnnotations:
  0: #108(#109=[I#110,I#111,I#107],#112=I#113,#114=I#115,#116=[s#117],#118=[s#28,s#119,s#13,s#119,s#17,s#20,s#23,s#119,s#8,s#9,s#29,s#30,s#31,s#32,s#33,s#34,s#36,s#35,s#39,s#40,s#43,s#42,s#46,s#48,s#47,s#51,s#55,s#52,s#53,s#58,s#59,s#60,s#119,s#62,s#63,s#64,s#65,s#68,s#69,s#119,s#119,s#90,s#92,s#102,s#120])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003J\u0012\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0000H\u0096\u0082\u0004J\u0014\u0010&\u001a\u00020\'2\b\u0010%\u001a\u0004\u0018\u00010(H\u0096\u0082\u0004J\n\u0010)\u001a\u00020\u0003H\u0096\u0080\u0004J\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/Node;","","geoX","","geoY","z","nswe","","<init>","(IIIB)V","getGeoX","()I","getGeoY","getZ","getNswe","()B","costG","getCostG","setCostG","(I)V","costH","getCostH","setCostH","costF","getCostF","setCostF","parent","getParent","()Lext/mods/gameserver/geoengine/pathfinding/Node;","setParent","(Lext/mods/gameserver/geoengine/pathfinding/Node;)V","setCost","","parentNode","weight","hCost","compareTo","other","equals","","","hashCode","clean","Companion","Brproject"]
    )
