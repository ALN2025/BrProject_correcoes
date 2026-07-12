// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$SourceInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.class
  Last modified 9 de jul de 2026; size 4103 bytes
  MD5 checksum 4c33c04eb4b553ce6af063f7aff3d8b2
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 14, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               l2jAvailable
   #12 = Utf8               Z
   #13 = NameAndType        #11:#12       // l2jAvailable:Z
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.l2jAvailable:Z
   #15 = Utf8               convDatAvailable
   #16 = NameAndType        #15:#12       // convDatAvailable:Z
   #17 = Fieldref           #2.#16        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.convDatAvailable:Z
   #18 = Utf8               primarySource
   #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
   #20 = NameAndType        #18:#19       // primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
   #22 = Utf8               mergedData
   #23 = NameAndType        #22:#12       // mergedData:Z
   #24 = Fieldref           #2.#23        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.mergedData:Z
   #25 = Utf8               this
   #26 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #27 = Utf8               getL2jAvailable
   #28 = Utf8               ()Z
   #29 = Utf8               getConvDatAvailable
   #30 = Utf8               getPrimarySource
   #31 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
   #32 = Utf8               getMergedData
   #33 = Utf8               component1
   #34 = Utf8               component2
   #35 = Utf8               component3
   #36 = Utf8               component4
   #37 = Utf8               copy
   #38 = Utf8               (ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #39 = NameAndType        #5:#6         // "<init>":(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
   #40 = Methodref          #2.#39        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo."<init>":(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
   #41 = Utf8               copy$default
   #42 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #43 = NameAndType        #37:#38       // copy:(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #44 = Methodref          #2.#43        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.copy:(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #45 = Utf8               toString
   #46 = Utf8               ()Ljava/lang/String;
   #47 = Utf8               SourceInfo(l2jAvailable=\u0001, convDatAvailable=\u0001, primarySource=\u0001, mergedData=\u0001)
   #48 = String             #47           // SourceInfo(l2jAvailable=\u0001, convDatAvailable=\u0001, primarySource=\u0001, mergedData=\u0001)
   #49 = Utf8               java/lang/invoke/StringConcatFactory
   #50 = Class              #49           // java/lang/invoke/StringConcatFactory
   #51 = Utf8               makeConcatWithConstants
   #52 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #53 = NameAndType        #51:#52       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #54 = Methodref          #50.#53       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #55 = MethodHandle       6:#54         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #56 = Utf8               (ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Ljava/lang/String;
   #57 = NameAndType        #51:#56       // makeConcatWithConstants:(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Ljava/lang/String;
   #58 = InvokeDynamic      #0:#57        // #0:makeConcatWithConstants:(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Ljava/lang/String;
   #59 = Utf8               hashCode
   #60 = Utf8               ()I
   #61 = Utf8               java/lang/Boolean
   #62 = Class              #61           // java/lang/Boolean
   #63 = Utf8               (Z)I
   #64 = NameAndType        #59:#63       // hashCode:(Z)I
   #65 = Methodref          #62.#64       // java/lang/Boolean.hashCode:(Z)I
   #66 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
   #67 = Class              #66           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
   #68 = NameAndType        #59:#60       // hashCode:()I
   #69 = Methodref          #67.#68       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.hashCode:()I
   #70 = Utf8               result
   #71 = Utf8               I
   #72 = Utf8               equals
   #73 = Utf8               (Ljava/lang/Object;)Z
   #74 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #75 = Utf8               other
   #76 = Utf8               Ljava/lang/Object;
   #77 = Utf8               Lkotlin/Metadata;
   #78 = Utf8               mv
   #79 = Integer            2
   #80 = Integer            3
   #81 = Integer            0
   #82 = Utf8               k
   #83 = Integer            1
   #84 = Utf8               xi
   #85 = Integer            48
   #86 = Utf8               d1
   #87 = Utf8               \u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b
   #88 = Utf8               d2
   #89 = Utf8
   #90 = Utf8               Brproject
   #91 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #92 = Class              #91           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #93 = Utf8               DataSource
   #94 = Utf8               SourceInfo
   #95 = Utf8               GeoIndexer.kt
   #96 = Utf8               RuntimeInvisibleAnnotations
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               RuntimeInvisibleParameterAnnotations
  #101 = Utf8               StackMapTable
  #102 = Utf8               InnerClasses
  #103 = Utf8               SourceFile
  #104 = Utf8               RuntimeVisibleAnnotations
  #105 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo(boolean, boolean, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$DataSource, boolean);
    descriptor: (ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #14                 // Field l2jAvailable:Z
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field convDatAvailable:Z
        14: aload_0
        15: aload_3
        16: putfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
        19: aload_0
        20: iload         4
        22: putfield      #24                 // Field mergedData:Z
        25: return
      LineNumberTable:
        line 51: 0
        line 52: 4
        line 53: 9
        line 54: 14
        line 55: 19
        line 51: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
            0      26     1 l2jAvailable   Z
            0      26     2 convDatAvailable   Z
            0      26     3 primarySource   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
            0      26     4 mergedData   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 3:

  public final boolean getL2jAvailable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2jAvailable:Z
         4: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

  public final boolean getConvDatAvailable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field convDatAvailable:Z
         4: ireturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$DataSource getPrimarySource();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final boolean getMergedData();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field mergedData:Z
         4: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

  public final boolean component1();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2jAvailable:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

  public final boolean component2();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field convDatAvailable:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$DataSource component3();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public final boolean component4();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field mergedData:Z
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo copy(boolean, boolean, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$DataSource, boolean);
    descriptor: (ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=5
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
         3: dup
         4: iload_1
         5: iload_2
         6: aload_3
         7: iload         4
         9: invokespecial #40                 // Method "<init>":(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
            0      13     1 l2jAvailable   Z
            0      13     2 convDatAvailable   Z
            0      13     3 primarySource   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
            0      13     4 mergedData   Z
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 3:

  public static ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo copy$default(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo, boolean, boolean, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$DataSource, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;ZILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: iconst_1
         3: iand
         4: ifeq          12
         7: aload_0
         8: getfield      #14                 // Field l2jAvailable:Z
        11: istore_1
        12: iload         5
        14: iconst_2
        15: iand
        16: ifeq          24
        19: aload_0
        20: getfield      #17                 // Field convDatAvailable:Z
        23: istore_2
        24: iload         5
        26: iconst_4
        27: iand
        28: ifeq          36
        31: aload_0
        32: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
        35: astore_3
        36: iload         5
        38: bipush        8
        40: iand
        41: ifeq          50
        44: aload_0
        45: getfield      #24                 // Field mergedData:Z
        48: istore        4
        50: aload_0
        51: iload_1
        52: iload_2
        53: aload_3
        54: iload         4
        56: invokevirtual #44                 // Method copy:(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
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
         1: getfield      #14                 // Field l2jAvailable:Z
         4: aload_0
         5: getfield      #17                 // Field convDatAvailable:Z
         8: aload_0
         9: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
        12: aload_0
        13: getfield      #24                 // Field mergedData:Z
        16: invokedynamic #58,  0             // InvokeDynamic #0:makeConcatWithConstants:(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)Ljava/lang/String;
        21: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #14                 // Field l2jAvailable:Z
         4: invokestatic  #65                 // Method java/lang/Boolean.hashCode:(Z)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field convDatAvailable:Z
        16: invokestatic  #65                 // Method java/lang/Boolean.hashCode:(Z)I
        19: iadd
        20: istore_1
        21: iload_1
        22: bipush        31
        24: imul
        25: aload_0
        26: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
        29: invokevirtual #69                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.hashCode:()I
        32: iadd
        33: istore_1
        34: iload_1
        35: bipush        31
        37: imul
        38: aload_0
        39: getfield      #24                 // Field mergedData:Z
        42: invokestatic  #65                 // Method java/lang/Boolean.hashCode:(Z)I
        45: iadd
        46: istore_1
        47: iload_1
        48: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      41     1 result   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
        20: astore_2
        21: aload_0
        22: getfield      #14                 // Field l2jAvailable:Z
        25: aload_2
        26: getfield      #14                 // Field l2jAvailable:Z
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #17                 // Field convDatAvailable:Z
        38: aload_2
        39: getfield      #17                 // Field convDatAvailable:Z
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: aload_0
        48: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
        51: aload_2
        52: getfield      #21                 // Field primarySource:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
        55: if_acmpeq     60
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #24                 // Field mergedData:Z
        64: aload_2
        65: getfield      #24                 // Field mergedData:Z
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
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
            0      75     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #74()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #93= #67 of #92;    // DataSource=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #94= #2 of #92;     // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #77(#78=[I#79,I#80,I#81],#82=I#83,#84=I#85,#86=[s#87],#88=[s#26,s#89,s#11,s#89,s#15,s#18,s#19,s#22,s#5,s#6,s#27,s#28,s#29,s#30,s#31,s#32,s#33,s#34,s#35,s#36,s#37,s#72,s#75,s#59,s#89,s#45,s#89,s#90])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;","","l2jAvailable","","convDatAvailable","primarySource","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;","mergedData","<init>","(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V","getL2jAvailable","()Z","getConvDatAvailable","getPrimarySource","()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;","getMergedData","component1","component2","component3","component4","copy","equals","other","hashCode","","toString","","Brproject"]
    )
BootstrapMethods:
  0: #55 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #48 SourceInfo(l2jAvailable=\u0001, convDatAvailable=\u0001, primarySource=\u0001, mergedData=\u0001)
