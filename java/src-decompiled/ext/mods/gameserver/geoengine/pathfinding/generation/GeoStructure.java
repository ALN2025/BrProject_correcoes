// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoStructure
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoStructure.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure.class
  Last modified 9 de jul de 2026; size 1345 bytes
  MD5 checksum 1caf40d45664a56bcdd1ff2a49cc6617
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoStructure
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 11, methods: 2, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure;
  #11 = Utf8               <clinit>
  #12 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure."<init>":()V
  #13 = Utf8               INSTANCE
  #14 = NameAndType        #13:#10        // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure;
  #15 = Fieldref           #2.#14         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure;
  #16 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #17 = Utf8               REGION_CELLS_X
  #18 = Utf8               I
  #19 = Integer            256
  #20 = Utf8               REGION_CELLS_Y
  #21 = Utf8               CELL_SIZE
  #22 = Integer            16
  #23 = Utf8               GEO_CELLS_X
  #24 = Integer            32768
  #25 = Utf8               GEO_CELLS_Y
  #26 = Utf8               CELL_FLAG_NONE
  #27 = Utf8               B
  #28 = Integer            0
  #29 = Utf8               CELL_FLAG_N
  #30 = Integer            1
  #31 = Utf8               CELL_FLAG_S
  #32 = Integer            2
  #33 = Utf8               CELL_FLAG_W
  #34 = Integer            4
  #35 = Utf8               CELL_FLAG_E
  #36 = Integer            8
  #37 = Utf8               Lkotlin/Metadata;
  #38 = Utf8               mv
  #39 = Integer            3
  #40 = Utf8               k
  #41 = Utf8               xi
  #42 = Integer            48
  #43 = Utf8               d1
  #44 = Utf8               \u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010
  #45 = Utf8               d2
  #46 = Utf8
  #47 = Utf8               Brproject
  #48 = Utf8               GeoIndexer.kt
  #49 = Utf8               RuntimeInvisibleAnnotations
  #50 = Utf8               ConstantValue
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               SourceFile
  #55 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.generation.GeoStructure INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #16()
        org.jetbrains.annotations.NotNull

  public static final int REGION_CELLS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int REGION_CELLS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int CELL_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int GEO_CELLS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32768

  public static final int GEO_CELLS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32768

  public static final byte CELL_FLAG_NONE;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final byte CELL_FLAG_N;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final byte CELL_FLAG_S;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final byte CELL_FLAG_W;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final byte CELL_FLAG_E;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: putstatic     #15                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure;
        10: return
}
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #37(#38=[I#32,I#39,I#28],#40=I#30,#41=I#42,#43=[s#44],#45=[s#10,s#46,s#5,s#6,s#17,s#46,s#20,s#21,s#23,s#25,s#26,s#46,s#29,s#31,s#33,s#35,s#47])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoStructure;","","<init>","()V","REGION_CELLS_X","","REGION_CELLS_Y","CELL_SIZE","GEO_CELLS_X","GEO_CELLS_Y","CELL_FLAG_NONE","","CELL_FLAG_N","CELL_FLAG_S","CELL_FLAG_W","CELL_FLAG_E","Brproject"]
    )
