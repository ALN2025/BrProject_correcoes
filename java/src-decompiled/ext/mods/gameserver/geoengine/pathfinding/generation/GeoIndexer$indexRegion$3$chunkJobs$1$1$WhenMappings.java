// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings.class
  Last modified 9 de jul de 2026; size 1105 bytes
  MD5 checksum 90bb7a0518db6f485ff193413b0b25f1
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
  minor version: 0
  major version: 69
  flags: (0x1031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_SYNTHETIC
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
   #2 = Class              #1             // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <clinit>
   #6 = Utf8               ()V
   #7 = Utf8               java/lang/NoSuchFieldError
   #8 = Class              #7             // java/lang/NoSuchFieldError
   #9 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #10 = Class              #9             // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #11 = Utf8               values
  #12 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #13 = NameAndType        #11:#12        // values:()[Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #14 = Methodref          #10.#13        // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.values:()[Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #15 = Utf8               FLAT
  #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #17 = NameAndType        #15:#16        // FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #18 = Fieldref           #10.#17        // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = NameAndType        #19:#20        // ordinal:()I
  #22 = Methodref          #10.#21        // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.ordinal:()I
  #23 = Utf8               COMPLEX
  #24 = NameAndType        #23:#16        // COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #25 = Fieldref           #10.#24        // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #26 = Utf8               MULTILAYER
  #27 = NameAndType        #26:#16        // MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #28 = Fieldref           #10.#27        // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #29 = Utf8               $EnumSwitchMapping$0
  #30 = Utf8               [I
  #31 = NameAndType        #29:#30        // $EnumSwitchMapping$0:[I
  #32 = Fieldref           #2.#31         // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings.$EnumSwitchMapping$0:[I
  #33 = Class              #30            // "[I"
  #34 = Utf8               Lkotlin/Metadata;
  #35 = Utf8               mv
  #36 = Integer            2
  #37 = Integer            3
  #38 = Integer            0
  #39 = Utf8               k
  #40 = Utf8               xi
  #41 = Integer            48
  #42 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  #43 = Class              #42            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  #44 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  #45 = Class              #44            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  #46 = Utf8               WhenMappings
  #47 = Utf8               GeoIndexer.kt
  #48 = Utf8               Code
  #49 = Utf8               StackMapTable
  #50 = Utf8               InnerClasses
  #51 = Utf8               SourceFile
  #52 = Utf8               RuntimeVisibleAnnotations
{
  public static final int[] $EnumSwitchMapping$0;
    descriptor: [I
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=2, args_size=0
         0: invokestatic  #14                 // Method ext/mods/gameserver/geoengine/pathfinding/model/BlockType.values:()[Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
         3: arraylength
         4: newarray       int
         6: astore_0
         7: nop
         8: aload_0
         9: getstatic     #18                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.FLAT:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        12: invokevirtual #22                 // Method ext/mods/gameserver/geoengine/pathfinding/model/BlockType.ordinal:()I
        15: iconst_1
        16: iastore
        17: goto          21
        20: astore_1
        21: nop
        22: aload_0
        23: getstatic     #25                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.COMPLEX:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        26: invokevirtual #22                 // Method ext/mods/gameserver/geoengine/pathfinding/model/BlockType.ordinal:()I
        29: iconst_2
        30: iastore
        31: goto          35
        34: astore_1
        35: nop
        36: aload_0
        37: getstatic     #28                 // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
        40: invokevirtual #22                 // Method ext/mods/gameserver/geoengine/pathfinding/model/BlockType.ordinal:()I
        43: iconst_3
        44: iastore
        45: goto          49
        48: astore_1
        49: aload_0
        50: putstatic     #32                 // Field $EnumSwitchMapping$0:[I
        53: return
      Exception table:
         from    to  target type
             7    17    20   Class java/lang/NoSuchFieldError
            21    31    34   Class java/lang/NoSuchFieldError
            35    45    48   Class java/lang/NoSuchFieldError
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class "[I" ]
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
InnerClasses:
  static final #43;                       // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  static final #45;                       // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  public static final #46= #2 of #45;     // WhenMappings=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #34(#35=[I#36,I#37,I#38],#39=I#37,#40=I#41)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
