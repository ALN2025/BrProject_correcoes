// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$NodeIndexEntry
// File: ext\mods\gameserver\geoengine\pathfinding\serialization\L2BRSerializer$NodeIndexEntry.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.class
  Last modified 9 de jul de 2026; size 4471 bytes
  MD5 checksum a9f9b27bdc8edfebd99c53212fca0c13
  Compiled from "L2BRSerializer.kt"
final class ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$NodeIndexEntry
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 7, methods: 20, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (ISSSIBS)V
    #7 = Utf8               ()V
    #8 = NameAndType        #5:#7         // "<init>":()V
    #9 = Methodref          #4.#8         // java/lang/Object."<init>":()V
   #10 = Utf8               offset
   #11 = Utf8               I
   #12 = NameAndType        #10:#11       // offset:I
   #13 = Fieldref           #2.#12        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.offset:I
   #14 = Utf8               x
   #15 = Utf8               S
   #16 = NameAndType        #14:#15       // x:S
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.x:S
   #18 = Utf8               y
   #19 = NameAndType        #18:#15       // y:S
   #20 = Fieldref           #2.#19        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.y:S
   #21 = Utf8               z
   #22 = NameAndType        #21:#15       // z:S
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.z:S
   #24 = Utf8               originalId
   #25 = NameAndType        #24:#11       // originalId:I
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.originalId:I
   #27 = Utf8               flags
   #28 = Utf8               B
   #29 = NameAndType        #27:#28       // flags:B
   #30 = Fieldref           #2.#29        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.flags:B
   #31 = Utf8               edgeCount
   #32 = NameAndType        #31:#15       // edgeCount:S
   #33 = Fieldref           #2.#32        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.edgeCount:S
   #34 = Utf8               this
   #35 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
   #36 = Utf8               getOffset
   #37 = Utf8               ()I
   #38 = Utf8               getX
   #39 = Utf8               ()S
   #40 = Utf8               getY
   #41 = Utf8               getZ
   #42 = Utf8               getOriginalId
   #43 = Utf8               getFlags
   #44 = Utf8               ()B
   #45 = Utf8               getEdgeCount
   #46 = Utf8               component1
   #47 = Utf8               component2
   #48 = Utf8               component3
   #49 = Utf8               component4
   #50 = Utf8               component5
   #51 = Utf8               component6
   #52 = Utf8               component7
   #53 = Utf8               copy
   #54 = Utf8               (ISSSIBS)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
   #55 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #56 = NameAndType        #5:#6         // "<init>":(ISSSIBS)V
   #57 = Methodref          #2.#56        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry."<init>":(ISSSIBS)V
   #58 = Utf8               copy$default
   #59 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;ISSSIBSILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
   #60 = NameAndType        #53:#54       // copy:(ISSSIBS)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
   #61 = Methodref          #2.#60        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry.copy:(ISSSIBS)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
   #62 = Utf8               toString
   #63 = Utf8               ()Ljava/lang/String;
   #64 = Utf8               NodeIndexEntry(offset=\u0001, x=\u0001, y=\u0001, z=\u0001, originalId=\u0001, flags=\u0001, edgeCount=\u0001)
   #65 = String             #64           // NodeIndexEntry(offset=\u0001, x=\u0001, y=\u0001, z=\u0001, originalId=\u0001, flags=\u0001, edgeCount=\u0001)
   #66 = Utf8               java/lang/invoke/StringConcatFactory
   #67 = Class              #66           // java/lang/invoke/StringConcatFactory
   #68 = Utf8               makeConcatWithConstants
   #69 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #70 = NameAndType        #68:#69       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #71 = Methodref          #67.#70       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #72 = MethodHandle       6:#71         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #73 = Utf8               (ISSSIBS)Ljava/lang/String;
   #74 = NameAndType        #68:#73       // makeConcatWithConstants:(ISSSIBS)Ljava/lang/String;
   #75 = InvokeDynamic      #0:#74        // #0:makeConcatWithConstants:(ISSSIBS)Ljava/lang/String;
   #76 = Utf8               hashCode
   #77 = Utf8               java/lang/Integer
   #78 = Class              #77           // java/lang/Integer
   #79 = Utf8               (I)I
   #80 = NameAndType        #76:#79       // hashCode:(I)I
   #81 = Methodref          #78.#80       // java/lang/Integer.hashCode:(I)I
   #82 = Utf8               java/lang/Short
   #83 = Class              #82           // java/lang/Short
   #84 = Utf8               (S)I
   #85 = NameAndType        #76:#84       // hashCode:(S)I
   #86 = Methodref          #83.#85       // java/lang/Short.hashCode:(S)I
   #87 = Utf8               java/lang/Byte
   #88 = Class              #87           // java/lang/Byte
   #89 = Utf8               (B)I
   #90 = NameAndType        #76:#89       // hashCode:(B)I
   #91 = Methodref          #88.#90       // java/lang/Byte.hashCode:(B)I
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
  #108 = Utf8               \u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&
  #109 = Utf8               d2
  #110 = Utf8
  #111 = Utf8               Brproject
  #112 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #113 = Class              #112          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #114 = Utf8               NodeIndexEntry
  #115 = Utf8               L2BRSerializer.kt
  #116 = Utf8               Code
  #117 = Utf8               LineNumberTable
  #118 = Utf8               LocalVariableTable
  #119 = Utf8               RuntimeInvisibleAnnotations
  #120 = Utf8               StackMapTable
  #121 = Utf8               RuntimeInvisibleParameterAnnotations
  #122 = Utf8               InnerClasses
  #123 = Utf8               SourceFile
  #124 = Utf8               RuntimeVisibleAnnotations
  #125 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$NodeIndexEntry(int, short, short, short, int, byte, short);
    descriptor: (ISSSIBS)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=8, args_size=8
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field offset:I
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field x:S
        14: aload_0
        15: iload_3
        16: putfield      #20                 // Field y:S
        19: aload_0
        20: iload         4
        22: putfield      #23                 // Field z:S
        25: aload_0
        26: iload         5
        28: putfield      #26                 // Field originalId:I
        31: aload_0
        32: iload         6
        34: putfield      #30                 // Field flags:B
        37: aload_0
        38: iload         7
        40: putfield      #33                 // Field edgeCount:S
        43: return
      LineNumberTable:
        line 390: 0
        line 391: 4
        line 392: 9
        line 393: 14
        line 394: 19
        line 395: 25
        line 396: 31
        line 397: 37
        line 390: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
            0      44     1 offset   I
            0      44     2     x   S
            0      44     3     y   S
            0      44     4     z   S
            0      44     5 originalId   I
            0      44     6 flags   B
            0      44     7 edgeCount   S

  public final int getOffset();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field offset:I
         4: ireturn
      LineNumberTable:
        line 391: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short getX();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field x:S
         4: ireturn
      LineNumberTable:
        line 392: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short getY();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field y:S
         4: ireturn
      LineNumberTable:
        line 393: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short getZ();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field z:S
         4: ireturn
      LineNumberTable:
        line 394: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final int getOriginalId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field originalId:I
         4: ireturn
      LineNumberTable:
        line 395: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final byte getFlags();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field flags:B
         4: ireturn
      LineNumberTable:
        line 396: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short getEdgeCount();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field edgeCount:S
         4: ireturn
      LineNumberTable:
        line 397: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final int component1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field offset:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short component2();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field x:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short component3();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field y:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short component4();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field z:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final int component5();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field originalId:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final byte component6();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field flags:B
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final short component7();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field edgeCount:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

  public final ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$NodeIndexEntry copy(int, short, short, short, int, byte, short);
    descriptor: (ISSSIBS)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=8, args_size=8
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
         3: dup
         4: iload_1
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: iload         7
        15: invokespecial #57                 // Method "<init>":(ISSSIBS)V
        18: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
            0      19     1 offset   I
            0      19     2     x   S
            0      19     3     y   S
            0      19     4     z   S
            0      19     5 originalId   I
            0      19     6 flags   B
            0      19     7 edgeCount   S
    RuntimeInvisibleAnnotations:
      0: #55()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$NodeIndexEntry copy$default(ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer$NodeIndexEntry, int, short, short, short, int, byte, short, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;ISSSIBSILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=8, locals=10, args_size=10
         0: iload         8
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #13                 // Field offset:I
        11: istore_1
        12: iload         8
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field x:S
        23: istore_2
        24: iload         8
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #20                 // Field y:S
        35: istore_3
        36: iload         8
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #23                 // Field z:S
        48: istore        4
        50: iload         8
        52: bipush        16
        54: iand
        55: ifeq          64
        58: aload_0
        59: getfield      #26                 // Field originalId:I
        62: istore        5
        64: iload         8
        66: bipush        32
        68: iand
        69: ifeq          78
        72: aload_0
        73: getfield      #30                 // Field flags:B
        76: istore        6
        78: iload         8
        80: bipush        64
        82: iand
        83: ifeq          92
        86: aload_0
        87: getfield      #33                 // Field edgeCount:S
        90: istore        7
        92: aload_0
        93: iload_1
        94: iload_2
        95: iload_3
        96: iload         4
        98: iload         5
       100: iload         6
       102: iload         7
       104: invokevirtual #61                 // Method copy:(ISSSIBS)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
       107: areturn
      StackMapTable: number_of_entries = 7
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 13 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field offset:I
         4: aload_0
         5: getfield      #17                 // Field x:S
         8: aload_0
         9: getfield      #20                 // Field y:S
        12: aload_0
        13: getfield      #23                 // Field z:S
        16: aload_0
        17: getfield      #26                 // Field originalId:I
        20: aload_0
        21: getfield      #30                 // Field flags:B
        24: aload_0
        25: getfield      #33                 // Field edgeCount:S
        28: invokedynamic #75,  0             // InvokeDynamic #0:makeConcatWithConstants:(ISSSIBS)Ljava/lang/String;
        33: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
    RuntimeInvisibleAnnotations:
      0: #55()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field offset:I
         4: invokestatic  #81                 // Method java/lang/Integer.hashCode:(I)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field x:S
        16: invokestatic  #86                 // Method java/lang/Short.hashCode:(S)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #20                 // Field y:S
        29: invokestatic  #86                 // Method java/lang/Short.hashCode:(S)I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #23                 // Field z:S
        42: invokestatic  #86                 // Method java/lang/Short.hashCode:(S)I
        45: iadd
        46: istore_1
        47: iload_1
        48: bipush        31
        50: imul
        51: aload_0
        52: getfield      #26                 // Field originalId:I
        55: invokestatic  #81                 // Method java/lang/Integer.hashCode:(I)I
        58: iadd
        59: istore_1
        60: iload_1
        61: bipush        31
        63: imul
        64: aload_0
        65: getfield      #30                 // Field flags:B
        68: invokestatic  #91                 // Method java/lang/Byte.hashCode:(B)I
        71: iadd
        72: istore_1
        73: iload_1
        74: bipush        31
        76: imul
        77: aload_0
        78: getfield      #33                 // Field edgeCount:S
        81: invokestatic  #86                 // Method java/lang/Short.hashCode:(S)I
        84: iadd
        85: istore_1
        86: iload_1
        87: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      80     1 result   I
            0      88     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field offset:I
        25: aload_2
        26: getfield      #13                 // Field offset:I
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #17                 // Field x:S
        38: aload_2
        39: getfield      #17                 // Field x:S
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #20                 // Field y:S
        51: aload_2
        52: getfield      #20                 // Field y:S
        55: if_icmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #23                 // Field z:S
        64: aload_2
        65: getfield      #23                 // Field z:S
        68: if_icmpeq     73
        71: iconst_0
        72: ireturn
        73: aload_0
        74: getfield      #26                 // Field originalId:I
        77: aload_2
        78: getfield      #26                 // Field originalId:I
        81: if_icmpeq     86
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #30                 // Field flags:B
        90: aload_2
        91: getfield      #30                 // Field flags:B
        94: if_icmpeq     99
        97: iconst_0
        98: ireturn
        99: aload_0
       100: getfield      #33                 // Field edgeCount:S
       103: aload_2
       104: getfield      #33                 // Field edgeCount:S
       107: if_icmpeq     112
       110: iconst_0
       111: ireturn
       112: iconst_1
       113: ireturn
      StackMapTable: number_of_entries = 9
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;
            0     114     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #95()
          org.jetbrains.annotations.Nullable
}
SourceFile: "L2BRSerializer.kt"
RuntimeVisibleAnnotations:
  0: #98(#99=[I#100,I#101,I#102],#103=I#104,#105=I#106,#107=[s#108],#109=[s#35,s#110,s#10,s#110,s#14,s#110,s#18,s#21,s#24,s#27,s#110,s#31,s#5,s#6,s#36,s#37,s#38,s#39,s#40,s#41,s#42,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#93,s#110,s#96,s#76,s#62,s#110,s#111])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer$NodeIndexEntry;","","offset","","x","","y","z","originalId","flags","","edgeCount","<init>","(ISSSIBS)V","getOffset","()I","getX","()S","getY","getZ","getOriginalId","getFlags","()B","getEdgeCount","component1","component2","component3","component4","component5","component6","component7","copy","equals","","other","hashCode","toString","","Brproject"]
    )
BootstrapMethods:
  0: #72 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #65 NodeIndexEntry(offset=\u0001, x=\u0001, y=\u0001, z=\u0001, originalId=\u0001, flags=\u0001, edgeCount=\u0001)
