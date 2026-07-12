// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$GeoDataProvider$LayerInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.class
  Last modified 9 de jul de 2026; size 2969 bytes
  MD5 checksum 16aa4fd497a8aeeedcda8f55d6395676
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 10, attributes: 4
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               (SB)V
   #7 = Utf8               ()V
   #8 = NameAndType        #5:#7          // "<init>":()V
   #9 = Methodref          #4.#8          // java/lang/Object."<init>":()V
  #10 = Utf8               height
  #11 = Utf8               S
  #12 = NameAndType        #10:#11        // height:S
  #13 = Fieldref           #2.#12         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.height:S
  #14 = Utf8               nswe
  #15 = Utf8               B
  #16 = NameAndType        #14:#15        // nswe:B
  #17 = Fieldref           #2.#16         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.nswe:B
  #18 = Utf8               this
  #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #20 = Utf8               getHeight
  #21 = Utf8               ()S
  #22 = Utf8               getNswe
  #23 = Utf8               ()B
  #24 = Utf8               component1
  #25 = Utf8               component2
  #26 = Utf8               copy
  #27 = Utf8               (SB)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #28 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #29 = NameAndType        #5:#6          // "<init>":(SB)V
  #30 = Methodref          #2.#29         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
  #31 = Utf8               copy$default
  #32 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;SBILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #33 = NameAndType        #26:#27        // copy:(SB)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #34 = Methodref          #2.#33         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.copy:(SB)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #35 = Utf8               toString
  #36 = Utf8               ()Ljava/lang/String;
  #37 = Utf8               LayerInfo(height=\u0001, nswe=\u0001)
  #38 = String             #37            // LayerInfo(height=\u0001, nswe=\u0001)
  #39 = Utf8               java/lang/invoke/StringConcatFactory
  #40 = Class              #39            // java/lang/invoke/StringConcatFactory
  #41 = Utf8               makeConcatWithConstants
  #42 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #43 = NameAndType        #41:#42        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #44 = Methodref          #40.#43        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #45 = MethodHandle       6:#44          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #46 = Utf8               (SB)Ljava/lang/String;
  #47 = NameAndType        #41:#46        // makeConcatWithConstants:(SB)Ljava/lang/String;
  #48 = InvokeDynamic      #0:#47         // #0:makeConcatWithConstants:(SB)Ljava/lang/String;
  #49 = Utf8               hashCode
  #50 = Utf8               ()I
  #51 = Utf8               java/lang/Short
  #52 = Class              #51            // java/lang/Short
  #53 = Utf8               (S)I
  #54 = NameAndType        #49:#53        // hashCode:(S)I
  #55 = Methodref          #52.#54        // java/lang/Short.hashCode:(S)I
  #56 = Utf8               java/lang/Byte
  #57 = Class              #56            // java/lang/Byte
  #58 = Utf8               (B)I
  #59 = NameAndType        #49:#58        // hashCode:(B)I
  #60 = Methodref          #57.#59        // java/lang/Byte.hashCode:(B)I
  #61 = Utf8               result
  #62 = Utf8               I
  #63 = Utf8               equals
  #64 = Utf8               (Ljava/lang/Object;)Z
  #65 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #66 = Utf8               other
  #67 = Utf8               Ljava/lang/Object;
  #68 = Utf8               Lkotlin/Metadata;
  #69 = Utf8               mv
  #70 = Integer            2
  #71 = Integer            3
  #72 = Integer            0
  #73 = Utf8               k
  #74 = Integer            1
  #75 = Utf8               xi
  #76 = Integer            48
  #77 = Utf8               d1
  #78 = Utf8               \u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016
  #79 = Utf8               d2
  #80 = Utf8
  #81 = Utf8               Brproject
  #82 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #83 = Class              #82            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #84 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #85 = Class              #84            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #86 = Utf8               GeoDataProvider
  #87 = Utf8               LayerInfo
  #88 = Utf8               GeoIndexer.kt
  #89 = Utf8               Code
  #90 = Utf8               LineNumberTable
  #91 = Utf8               LocalVariableTable
  #92 = Utf8               RuntimeInvisibleAnnotations
  #93 = Utf8               StackMapTable
  #94 = Utf8               RuntimeInvisibleParameterAnnotations
  #95 = Utf8               InnerClasses
  #96 = Utf8               SourceFile
  #97 = Utf8               RuntimeVisibleAnnotations
  #98 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo(short, byte);
    descriptor: (SB)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #9                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #13                 // Field height:S
         9: aload_0
        10: iload_2
        11: putfield      #17                 // Field nswe:B
        14: return
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
            0      15     1 height   S
            0      15     2  nswe   B

  public final short getHeight();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field height:S
         4: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;

  public final byte getNswe();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field nswe:B
         4: ireturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;

  public final short component1();
    descriptor: ()S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field height:S
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;

  public final byte component2();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field nswe:B
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;

  public final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo copy(short, byte);
    descriptor: (SB)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #30                 // Method "<init>":(SB)V
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
            0      10     1 height   S
            0      10     2  nswe   B
    RuntimeInvisibleAnnotations:
      0: #28()
        org.jetbrains.annotations.NotNull

  public static ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo copy$default(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo, short, byte, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;SBILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_1
         2: iand
         3: ifeq          11
         6: aload_0
         7: getfield      #13                 // Field height:S
        10: istore_1
        11: iload_3
        12: iconst_2
        13: iand
        14: ifeq          22
        17: aload_0
        18: getfield      #17                 // Field nswe:B
        21: istore_2
        22: aload_0
        23: iload_1
        24: iload_2
        25: invokevirtual #34                 // Method copy:(SB)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
        28: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 10 /* same */

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field height:S
         4: aload_0
         5: getfield      #17                 // Field nswe:B
         8: invokedynamic #48,  0             // InvokeDynamic #0:makeConcatWithConstants:(SB)Ljava/lang/String;
        13: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
    RuntimeInvisibleAnnotations:
      0: #28()
        org.jetbrains.annotations.NotNull

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field height:S
         4: invokestatic  #55                 // Method java/lang/Short.hashCode:(S)I
         7: istore_1
         8: iload_1
         9: bipush        31
        11: imul
        12: aload_0
        13: getfield      #17                 // Field nswe:B
        16: invokestatic  #60                 // Method java/lang/Byte.hashCode:(B)I
        19: iadd
        20: istore_1
        21: iload_1
        22: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      15     1 result   I
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;

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
         8: instanceof    #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        20: astore_2
        21: aload_0
        22: getfield      #13                 // Field height:S
        25: aload_2
        26: getfield      #13                 // Field height:S
        29: if_icmpeq     34
        32: iconst_0
        33: ireturn
        34: aload_0
        35: getfield      #17                 // Field nswe:B
        38: aload_2
        39: getfield      #17                 // Field nswe:B
        42: if_icmpeq     47
        45: iconst_0
        46: ireturn
        47: iconst_1
        48: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo ]
        frame_type = 12 /* same */
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
            0      49     1 other   Ljava/lang/Object;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #65()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static #86= #83 of #85;          // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #87= #2 of #83;     // LayerInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #68(#69=[I#70,I#71,I#72],#73=I#74,#75=I#76,#77=[s#78],#79=[s#19,s#80,s#10,s#80,s#14,s#80,s#5,s#6,s#20,s#21,s#22,s#23,s#24,s#25,s#26,s#63,s#80,s#66,s#49,s#80,s#35,s#80,s#81])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;","","height","","nswe","","<init>","(SB)V","getHeight","()S","getNswe","()B","component1","component2","copy","equals","","other","hashCode","","toString","","Brproject"]
    )
BootstrapMethods:
  0: #45 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #38 LayerInfo(height=\u0001, nswe=\u0001)
