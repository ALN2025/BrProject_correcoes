// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.World
// File: ext\mods\gameserver\geoengine\pathfinding\generation\World.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/World.class
  Last modified 9 de jul de 2026; size 983 bytes
  MD5 checksum 59db476f7e0151665a5855f309c386f3
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.World
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/World
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 2, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/World
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/generation/World
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/World;
  #11 = Utf8               <clinit>
  #12 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/generation/World."<init>":()V
  #13 = Utf8               INSTANCE
  #14 = NameAndType        #13:#10        // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/generation/World;
  #15 = Fieldref           #2.#14         // ext/mods/gameserver/geoengine/pathfinding/generation/World.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/generation/World;
  #16 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #17 = Utf8               TILE_X_MIN
  #18 = Utf8               I
  #19 = Integer            16
  #20 = Utf8               TILE_X_MAX
  #21 = Integer            26
  #22 = Utf8               TILE_Y_MIN
  #23 = Integer            10
  #24 = Utf8               TILE_Y_MAX
  #25 = Utf8               Lkotlin/Metadata;
  #26 = Utf8               mv
  #27 = Integer            2
  #28 = Integer            3
  #29 = Integer            0
  #30 = Utf8               k
  #31 = Integer            1
  #32 = Utf8               xi
  #33 = Integer            48
  #34 = Utf8               d1
  #35 = Utf8               \u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t
  #36 = Utf8               d2
  #37 = Utf8
  #38 = Utf8               Brproject
  #39 = Utf8               GeoIndexer.kt
  #40 = Utf8               RuntimeInvisibleAnnotations
  #41 = Utf8               ConstantValue
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               SourceFile
  #46 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.generation.World INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/World;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #16()
        org.jetbrains.annotations.NotNull

  public static final int TILE_X_MIN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int TILE_X_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 26

  public static final int TILE_Y_MIN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 10

  public static final int TILE_Y_MAX;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 26

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/World
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: putstatic     #15                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/generation/World;
        10: return
}
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #25(#26=[I#27,I#28,I#29],#30=I#31,#32=I#33,#34=[s#35],#36=[s#10,s#37,s#5,s#6,s#17,s#37,s#20,s#22,s#24,s#38])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/World;","","<init>","()V","TILE_X_MIN","","TILE_X_MAX","TILE_Y_MIN","TILE_Y_MAX","Brproject"]
    )
