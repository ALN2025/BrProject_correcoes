// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.GeoStructure
// File: ext\mods\gameserver\geoengine\pathfinding\model\GeoStructure.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure.class
  Last modified 9 de jul de 2026; size 1623 bytes
  MD5 checksum 561a0edacdbdfe867a38e7c39443db0d
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.GeoStructure
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 16, methods: 2, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
  #11 = Utf8               <clinit>
  #12 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure."<init>":()V
  #13 = Utf8               INSTANCE
  #14 = NameAndType        #13:#10        // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
  #15 = Fieldref           #2.#14         // ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
  #16 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #17 = Utf8               CELL_SIZE
  #18 = Utf8               I
  #19 = Integer            16
  #20 = Utf8               REGION_CELLS_X
  #21 = Integer            256
  #22 = Utf8               REGION_CELLS_Y
  #23 = Utf8               REGION_SIZE
  #24 = Integer            4096
  #25 = Utf8               GEO_CELLS_X
  #26 = Integer            32768
  #27 = Utf8               GEO_CELLS_Y
  #28 = Utf8               CELL_FLAG_NONE
  #29 = Utf8               B
  #30 = Integer            0
  #31 = Utf8               CELL_FLAG_N
  #32 = Integer            1
  #33 = Utf8               CELL_FLAG_S
  #34 = Integer            2
  #35 = Utf8               CELL_FLAG_W
  #36 = Integer            4
  #37 = Utf8               CELL_FLAG_E
  #38 = Integer            8
  #39 = Utf8               CELL_FLAG_ALL
  #40 = Integer            15
  #41 = Utf8               BLOCKTYPE_FLAT
  #42 = Utf8               BLOCKTYPE_COMPLEX
  #43 = Utf8               BLOCKTYPE_MULTILAYER
  #44 = Utf8               Lkotlin/Metadata;
  #45 = Utf8               mv
  #46 = Integer            3
  #47 = Utf8               k
  #48 = Utf8               xi
  #49 = Integer            48
  #50 = Utf8               d1
  #51 = Utf8               \u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015
  #52 = Utf8               d2
  #53 = Utf8
  #54 = Utf8               Brproject
  #55 = Utf8               Location.kt
  #56 = Utf8               RuntimeInvisibleAnnotations
  #57 = Utf8               ConstantValue
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               SourceFile
  #62 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.GeoStructure INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #16()
        org.jetbrains.annotations.NotNull

  public static final int CELL_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int REGION_CELLS_X;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int REGION_CELLS_Y;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int REGION_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4096

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

  public static final byte CELL_FLAG_ALL;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 15

  public static final byte BLOCKTYPE_FLAT;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final byte BLOCKTYPE_COMPLEX;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final byte BLOCKTYPE_MULTILAYER;
    descriptor: B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/GeoStructure
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: putstatic     #15                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
        10: return
}
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #44(#45=[I#34,I#46,I#30],#47=I#32,#48=I#49,#50=[s#51],#52=[s#10,s#53,s#5,s#6,s#17,s#53,s#20,s#22,s#23,s#25,s#27,s#28,s#53,s#31,s#33,s#35,s#37,s#39,s#41,s#42,s#43,s#54])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;","","<init>","()V","CELL_SIZE","","REGION_CELLS_X","REGION_CELLS_Y","REGION_SIZE","GEO_CELLS_X","GEO_CELLS_Y","CELL_FLAG_NONE","","CELL_FLAG_N","CELL_FLAG_S","CELL_FLAG_W","CELL_FLAG_E","CELL_FLAG_ALL","BLOCKTYPE_FLAT","BLOCKTYPE_COMPLEX","BLOCKTYPE_MULTILAYER","Brproject"]
    )
