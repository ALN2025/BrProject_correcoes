// Bytecode for: ext.mods.gameserver.geoengine.GeoEngine$WhenMappings
// File: ext\mods\gameserver\geoengine\GeoEngine$WhenMappings.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/GeoEngine$WhenMappings.class
  Last modified 9 de jul de 2026; size 776 bytes
  MD5 checksum 7dd9862301a418f68461ee4e7a5e0e0c
  Compiled from "GeoEngine.kt"
public final class ext.mods.gameserver.geoengine.GeoEngine$WhenMappings
  minor version: 0
  major version: 69
  flags: (0x1031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_SYNTHETIC
  this_class: #2                          // ext/mods/gameserver/geoengine/GeoEngine$WhenMappings
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$WhenMappings
   #2 = Class              #1             // ext/mods/gameserver/geoengine/GeoEngine$WhenMappings
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <clinit>
   #6 = Utf8               ()V
   #7 = Utf8               java/lang/NoSuchFieldError
   #8 = Class              #7             // java/lang/NoSuchFieldError
   #9 = Utf8               ext/mods/gameserver/enums/GeoType
  #10 = Class              #9             // ext/mods/gameserver/enums/GeoType
  #11 = Utf8               values
  #12 = Utf8               ()[Lext/mods/gameserver/enums/GeoType;
  #13 = NameAndType        #11:#12        // values:()[Lext/mods/gameserver/enums/GeoType;
  #14 = Methodref          #10.#13        // ext/mods/gameserver/enums/GeoType.values:()[Lext/mods/gameserver/enums/GeoType;
  #15 = Utf8               L2OFF
  #16 = Utf8               Lext/mods/gameserver/enums/GeoType;
  #17 = NameAndType        #15:#16        // L2OFF:Lext/mods/gameserver/enums/GeoType;
  #18 = Fieldref           #10.#17        // ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = NameAndType        #19:#20        // ordinal:()I
  #22 = Methodref          #10.#21        // ext/mods/gameserver/enums/GeoType.ordinal:()I
  #23 = Utf8               L2J
  #24 = NameAndType        #23:#16        // L2J:Lext/mods/gameserver/enums/GeoType;
  #25 = Fieldref           #10.#24        // ext/mods/gameserver/enums/GeoType.L2J:Lext/mods/gameserver/enums/GeoType;
  #26 = Utf8               $EnumSwitchMapping$0
  #27 = Utf8               [I
  #28 = NameAndType        #26:#27        // $EnumSwitchMapping$0:[I
  #29 = Fieldref           #2.#28         // ext/mods/gameserver/geoengine/GeoEngine$WhenMappings.$EnumSwitchMapping$0:[I
  #30 = Class              #27            // "[I"
  #31 = Utf8               Lkotlin/Metadata;
  #32 = Utf8               mv
  #33 = Integer            2
  #34 = Integer            3
  #35 = Integer            0
  #36 = Utf8               k
  #37 = Utf8               xi
  #38 = Integer            48
  #39 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #40 = Class              #39            // ext/mods/gameserver/geoengine/GeoEngine
  #41 = Utf8               WhenMappings
  #42 = Utf8               GeoEngine.kt
  #43 = Utf8               Code
  #44 = Utf8               StackMapTable
  #45 = Utf8               InnerClasses
  #46 = Utf8               SourceFile
  #47 = Utf8               RuntimeVisibleAnnotations
{
  public static final int[] $EnumSwitchMapping$0;
    descriptor: [I
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=2, args_size=0
         0: invokestatic  #14                 // Method ext/mods/gameserver/enums/GeoType.values:()[Lext/mods/gameserver/enums/GeoType;
         3: arraylength
         4: newarray       int
         6: astore_0
         7: nop
         8: aload_0
         9: getstatic     #18                 // Field ext/mods/gameserver/enums/GeoType.L2OFF:Lext/mods/gameserver/enums/GeoType;
        12: invokevirtual #22                 // Method ext/mods/gameserver/enums/GeoType.ordinal:()I
        15: iconst_1
        16: iastore
        17: goto          21
        20: astore_1
        21: nop
        22: aload_0
        23: getstatic     #25                 // Field ext/mods/gameserver/enums/GeoType.L2J:Lext/mods/gameserver/enums/GeoType;
        26: invokevirtual #22                 // Method ext/mods/gameserver/enums/GeoType.ordinal:()I
        29: iconst_2
        30: iastore
        31: goto          35
        34: astore_1
        35: aload_0
        36: putstatic     #29                 // Field $EnumSwitchMapping$0:[I
        39: return
      Exception table:
         from    to  target type
             7    17    20   Class java/lang/NoSuchFieldError
            21    31    34   Class java/lang/NoSuchFieldError
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class "[I" ]
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
InnerClasses:
  public static final #41= #2 of #40;     // WhenMappings=class ext/mods/gameserver/geoengine/GeoEngine$WhenMappings of class ext/mods/gameserver/geoengine/GeoEngine
SourceFile: "GeoEngine.kt"
RuntimeVisibleAnnotations:
  0: #31(#32=[I#33,I#34,I#35],#36=I#34,#37=I#38)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
