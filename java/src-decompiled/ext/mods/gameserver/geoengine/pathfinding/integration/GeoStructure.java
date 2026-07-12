// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoStructure
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoStructure.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure.class
  Last modified 9 de jul de 2026; size 900 bytes
  MD5 checksum a0c188349cd73c9459765eae996387f4
  Compiled from "GeoEngineBridge.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoStructure
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 2, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure;
  #11 = Utf8               <clinit>
  #12 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure."<init>":()V
  #13 = Utf8               INSTANCE
  #14 = NameAndType        #13:#10        // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure;
  #15 = Fieldref           #2.#14         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure;
  #16 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #17 = Utf8               REGION_CELLS_X
  #18 = Utf8               I
  #19 = Integer            256
  #20 = Utf8               REGION_CELLS_Y
  #21 = Utf8               Lkotlin/Metadata;
  #22 = Utf8               mv
  #23 = Integer            2
  #24 = Integer            3
  #25 = Integer            0
  #26 = Utf8               k
  #27 = Integer            1
  #28 = Utf8               xi
  #29 = Integer            48
  #30 = Utf8               d1
  #31 = Utf8               \u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007
  #32 = Utf8               d2
  #33 = Utf8
  #34 = Utf8               Brproject
  #35 = Utf8               GeoEngineBridge.kt
  #36 = Utf8               RuntimeInvisibleAnnotations
  #37 = Utf8               ConstantValue
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               SourceFile
  #42 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.integration.GeoStructure INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure;
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

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: putstatic     #15                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure;
        10: return
}
SourceFile: "GeoEngineBridge.kt"
RuntimeVisibleAnnotations:
  0: #21(#22=[I#23,I#24,I#25],#26=I#27,#28=I#29,#30=[s#31],#32=[s#10,s#33,s#5,s#6,s#17,s#33,s#20,s#34])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/GeoStructure;","","<init>","()V","REGION_CELLS_X","","REGION_CELLS_Y","Brproject"]
    )
