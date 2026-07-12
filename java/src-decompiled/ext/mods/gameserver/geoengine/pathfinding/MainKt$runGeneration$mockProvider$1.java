// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$mockProvider$1
// File: ext\mods\gameserver\geoengine\pathfinding\MainKt$runGeneration$mockProvider$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1.class
  Last modified 9 de jul de 2026; size 3579 bytes
  MD5 checksum a8dd3199fc193b6de4b2e9b4ec670f32
  Compiled from "Main.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$mockProvider$1 implements ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 10, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
    #6 = Class              #5            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = NameAndType        #7:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               this
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
   #13 = Utf8               getBlockType
   #14 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #15 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
   #16 = Class              #15           // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
   #17 = Utf8               MULTILAYER
   #18 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #19 = NameAndType        #17:#18       // MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #20 = Fieldref           #16.#19       // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #21 = Utf8               COMPLEX
   #22 = NameAndType        #21:#18       // COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #23 = Fieldref           #16.#22       // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #24 = Utf8               FLAT
   #25 = NameAndType        #24:#18       // FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #26 = Fieldref           #16.#25       // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
   #27 = Utf8               geoX
   #28 = Utf8               I
   #29 = Utf8               geoY
   #30 = Utf8               getHeight
   #31 = Utf8               (II)S
   #32 = Utf8               getNswe
   #33 = Utf8               (II)B
   #34 = Utf8               getLayers
   #35 = Utf8               (II)Ljava/util/List;
   #36 = Utf8               (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;
   #37 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
   #38 = Class              #37           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
   #39 = NameAndType        #30:#31       // getHeight:(II)S
   #40 = Methodref          #2.#39        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1.getHeight:(II)S
   #41 = NameAndType        #32:#33       // getNswe:(II)B
   #42 = Methodref          #2.#41        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1.getNswe:(II)B
   #43 = Utf8               (SB)V
   #44 = NameAndType        #7:#43        // "<init>":(SB)V
   #45 = Methodref          #38.#44       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
   #46 = Utf8               kotlin/collections/CollectionsKt
   #47 = Class              #46           // kotlin/collections/CollectionsKt
   #48 = Utf8               listOf
   #49 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #50 = NameAndType        #48:#49       // listOf:([Ljava/lang/Object;)Ljava/util/List;
   #51 = Methodref          #47.#50       // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
   #52 = Utf8               isLoaded
   #53 = Utf8               (II)Z
   #54 = Utf8               hasL2JData
   #55 = Utf8               regionX
   #56 = Utf8               regionY
   #57 = Utf8               hasConvDatData
   #58 = Utf8               getConvDatHeight
   #59 = Utf8               (II)Ljava/lang/Short;
   #60 = Utf8               getSourcePriority
   #61 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #62 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
   #63 = Class              #62           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
   #64 = Utf8               L2J_PRIORITY
   #65 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #66 = NameAndType        #64:#65       // L2J_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
   #67 = Fieldref           #63.#66       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.L2J_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
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
   #78 = Utf8               \u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0018
   #79 = Utf8               d2
   #80 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #81 = Utf8
   #82 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
   #83 = Utf8               Brproject
   #84 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt
   #85 = Class              #84           // ext/mods/gameserver/geoengine/pathfinding/MainKt
   #86 = Utf8               runGeneration
   #87 = Utf8               (II)V
   #88 = NameAndType        #86:#87       // runGeneration:(II)V
   #89 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #90 = Class              #89           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #91 = Utf8               GeoDataProvider
   #92 = Utf8               LayerInfo
   #93 = Utf8               SourcePriority
   #94 = Utf8               Main.kt
   #95 = Utf8               Code
   #96 = Utf8               LineNumberTable
   #97 = Utf8               LocalVariableTable
   #98 = Utf8               StackMapTable
   #99 = Utf8               Signature
  #100 = Utf8               InnerClasses
  #101 = Utf8               EnclosingMethod
  #102 = Utf8               SourceFile
  #103 = Utf8               RuntimeVisibleAnnotations
{
  ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$mockProvider$1();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;

  public ext.mods.gameserver.geoengine.pathfinding.model.BlockType getBlockType(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1
         1: iload_2
         2: iadd
         3: bipush        10
         5: irem
         6: tableswitch   { // 0 to 2

                       0: 32

                       1: 38

                       2: 38
                 default: 44
            }
        32: getstatic     #20                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        35: goto          47
        38: getstatic     #23                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        41: goto          47
        44: getstatic     #26                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        47: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 32 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/model/BlockType ]
      LineNumberTable:
        line 73: 0
        line 74: 32
        line 75: 38
        line 76: 44
        line 73: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0      48     1  geoX   I
            0      48     2  geoY   I

  public short getHeight(int, int);
    descriptor: (II)S
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: iload_1
         1: bipush        10
         3: imul
         4: iload_2
         5: iconst_5
         6: imul
         7: iadd
         8: sipush        4000
        11: irem
        12: i2s
        13: ireturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0      14     1  geoX   I
            0      14     2  geoY   I

  public byte getNswe(int, int);
    descriptor: (II)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: iload_1
         1: iload_2
         2: imul
         3: bipush        7
         5: irem
         6: ifne          13
         9: iconst_0
        10: goto          15
        13: bipush        15
        15: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 85: 0
        line 86: 9
        line 88: 13
        line 85: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0      16     1  geoX   I
            0      16     2  geoY   I

  public java.util.List<ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$LayerInfo> getLayers(int, int);
    descriptor: (II)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=4, args_size=3
         0: iconst_2
         1: anewarray     #38                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
         4: astore_3
         5: aload_3
         6: iconst_0
         7: new           #38                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        10: dup
        11: aload_0
        12: iload_1
        13: iload_2
        14: invokevirtual #40                 // Method getHeight:(II)S
        17: aload_0
        18: iload_1
        19: iload_2
        20: invokevirtual #42                 // Method getNswe:(II)B
        23: invokespecial #45                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
        26: aastore
        27: aload_3
        28: iconst_1
        29: new           #38                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
        32: dup
        33: aload_0
        34: iload_1
        35: iload_2
        36: invokevirtual #40                 // Method getHeight:(II)S
        39: sipush        500
        42: isub
        43: i2s
        44: bipush        15
        46: invokespecial #45                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo."<init>":(SB)V
        49: aastore
        50: aload_3
        51: invokestatic  #51                 // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        54: areturn
      LineNumberTable:
        line 94: 0
        line 95: 11
        line 96: 17
        line 94: 23
        line 98: 29
        line 99: 33
        line 100: 44
        line 98: 46
        line 94: 50
        line 93: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0      55     1  geoX   I
            0      55     2  geoY   I
    Signature: #36                          // (II)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;>;

  public boolean isLoaded(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0       2     1  geoX   I
            0       2     2  geoY   I

  public boolean hasL2JData(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0       2     1 regionX   I
            0       2     2 regionY   I

  public boolean hasConvDatData(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0       2     1 regionX   I
            0       2     2 regionY   I

  public java.lang.Short getConvDatHeight(int, int);
    descriptor: (II)Ljava/lang/Short;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 116: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0       2     1  geoX   I
            0       2     2  geoY   I

  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider$SourcePriority getSourcePriority();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #67                 // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.L2J_PRIORITY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
         3: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
}
InnerClasses:
  public static final #2;                 // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
  public static #91= #6 of #90;           // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #92= #38 of #6;     // LayerInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #93= #63 of #6;     // SourcePriority=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
EnclosingMethod: #85.#88                // ext.mods.gameserver.geoengine.pathfinding.MainKt.runGeneration
SourceFile: "Main.kt"
RuntimeVisibleAnnotations:
  0: #68(#69=[I#70,I#71,I#72],#73=I#74,#75=I#76,#77=[s#78],#79=[s#1,s#80,s#13,s#18,s#27,s#81,s#29,s#30,s#81,s#32,s#81,s#34,s#81,s#82,s#52,s#81,s#54,s#55,s#56,s#57,s#58,s#59,s#60,s#65,s#83])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0018"]
      d2=["ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;","getBlockType","Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","geoX","","geoY","getHeight","","getNswe","","getLayers","","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;","isLoaded","","hasL2JData","regionX","regionY","hasConvDatData","getConvDatHeight","(II)Ljava/lang/Short;","getSourcePriority","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;","Brproject"]
    )
