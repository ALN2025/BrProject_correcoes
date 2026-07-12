// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.World
// File: ext\mods\gameserver\geoengine\pathfinding\model\World.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/World.class
  Last modified 9 de jul de 2026; size 1026 bytes
  MD5 checksum 2e68c8f5f0e929a2399c0f8d4127f069
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.World
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/World
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 2, attributes: 2
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/World
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/model/World
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = NameAndType        #5:#6          // "<init>":()V
   #8 = Methodref          #4.#7          // java/lang/Object."<init>":()V
   #9 = Utf8               this
  #10 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/World;
  #11 = Utf8               <clinit>
  #12 = Methodref          #2.#7          // ext/mods/gameserver/geoengine/pathfinding/model/World."<init>":()V
  #13 = Utf8               INSTANCE
  #14 = NameAndType        #13:#10        // INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/model/World;
  #15 = Fieldref           #2.#14         // ext/mods/gameserver/geoengine/pathfinding/model/World.INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/model/World;
  #16 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #17 = Utf8               TILE_X_MIN
  #18 = Utf8               I
  #19 = Integer            16
  #20 = Utf8               TILE_X_MAX
  #21 = Integer            26
  #22 = Utf8               TILE_Y_MIN
  #23 = Integer            10
  #24 = Utf8               TILE_Y_MAX
  #25 = Utf8               TILE_SIZE
  #26 = Integer            32768
  #27 = Utf8               Lkotlin/Metadata;
  #28 = Utf8               mv
  #29 = Integer            2
  #30 = Integer            3
  #31 = Integer            0
  #32 = Utf8               k
  #33 = Integer            1
  #34 = Utf8               xi
  #35 = Integer            48
  #36 = Utf8               d1
  #37 = Utf8               \u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n
  #38 = Utf8               d2
  #39 = Utf8
  #40 = Utf8               Brproject
  #41 = Utf8               Location.kt
  #42 = Utf8               RuntimeInvisibleAnnotations
  #43 = Utf8               ConstantValue
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               SourceFile
  #48 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.World INSTANCE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/World;
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

  public static final int TILE_SIZE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32768

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/World
         3: dup
         4: invokespecial #12                 // Method "<init>":()V
         7: putstatic     #15                 // Field INSTANCE:Lext/mods/gameserver/geoengine/pathfinding/model/World;
        10: return
}
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #27(#28=[I#29,I#30,I#31],#32=I#33,#34=I#35,#36=[s#37],#38=[s#10,s#39,s#5,s#6,s#17,s#39,s#20,s#22,s#24,s#25,s#40])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/World;","","<init>","()V","TILE_X_MIN","","TILE_X_MAX","TILE_Y_MIN","TILE_Y_MAX","TILE_SIZE","Brproject"]
    )
