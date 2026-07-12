// Bytecode for: ext.mods.commons.pool.CoroutinePool$WhenMappings
// File: ext\mods\commons\pool\CoroutinePool$WhenMappings.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/CoroutinePool$WhenMappings.class
  Last modified 9 de jul de 2026; size 855 bytes
  MD5 checksum 9e4f136007502ca24a4afe519a845c50
  Compiled from "CoroutinePool.kt"
public final class ext.mods.commons.pool.CoroutinePool$WhenMappings
  minor version: 0
  major version: 69
  flags: (0x1031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_SYNTHETIC
  this_class: #2                          // ext/mods/commons/pool/CoroutinePool$WhenMappings
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 3
Constant pool:
   #1 = Utf8               ext/mods/commons/pool/CoroutinePool$WhenMappings
   #2 = Class              #1             // ext/mods/commons/pool/CoroutinePool$WhenMappings
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               <clinit>
   #6 = Utf8               ()V
   #7 = Utf8               java/lang/NoSuchFieldError
   #8 = Class              #7             // java/lang/NoSuchFieldError
   #9 = Utf8               ext/mods/commons/pool/CoroutinePool$ExecutionRoute
  #10 = Class              #9             // ext/mods/commons/pool/CoroutinePool$ExecutionRoute
  #11 = Utf8               values
  #12 = Utf8               ()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #13 = NameAndType        #11:#12        // values:()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #14 = Methodref          #10.#13        // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.values:()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #15 = Utf8               PLATFORM
  #16 = Utf8               Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #17 = NameAndType        #15:#16        // PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #18 = Fieldref           #10.#17        // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = NameAndType        #19:#20        // ordinal:()I
  #22 = Methodref          #10.#21        // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.ordinal:()I
  #23 = Utf8               VIRTUAL
  #24 = NameAndType        #23:#16        // VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #25 = Fieldref           #10.#24        // ext/mods/commons/pool/CoroutinePool$ExecutionRoute.VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
  #26 = Utf8               $EnumSwitchMapping$0
  #27 = Utf8               [I
  #28 = NameAndType        #26:#27        // $EnumSwitchMapping$0:[I
  #29 = Fieldref           #2.#28         // ext/mods/commons/pool/CoroutinePool$WhenMappings.$EnumSwitchMapping$0:[I
  #30 = Class              #27            // "[I"
  #31 = Utf8               Lkotlin/Metadata;
  #32 = Utf8               mv
  #33 = Integer            2
  #34 = Integer            3
  #35 = Integer            0
  #36 = Utf8               k
  #37 = Utf8               xi
  #38 = Integer            48
  #39 = Utf8               ext/mods/commons/pool/CoroutinePool
  #40 = Class              #39            // ext/mods/commons/pool/CoroutinePool
  #41 = Utf8               ExecutionRoute
  #42 = Utf8               WhenMappings
  #43 = Utf8               CoroutinePool.kt
  #44 = Utf8               Code
  #45 = Utf8               StackMapTable
  #46 = Utf8               InnerClasses
  #47 = Utf8               SourceFile
  #48 = Utf8               RuntimeVisibleAnnotations
{
  public static final int[] $EnumSwitchMapping$0;
    descriptor: [I
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=2, args_size=0
         0: invokestatic  #14                 // Method ext/mods/commons/pool/CoroutinePool$ExecutionRoute.values:()[Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
         3: arraylength
         4: newarray       int
         6: astore_0
         7: nop
         8: aload_0
         9: getstatic     #18                 // Field ext/mods/commons/pool/CoroutinePool$ExecutionRoute.PLATFORM:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        12: invokevirtual #22                 // Method ext/mods/commons/pool/CoroutinePool$ExecutionRoute.ordinal:()I
        15: iconst_1
        16: iastore
        17: goto          21
        20: astore_1
        21: nop
        22: aload_0
        23: getstatic     #25                 // Field ext/mods/commons/pool/CoroutinePool$ExecutionRoute.VIRTUAL:Lext/mods/commons/pool/CoroutinePool$ExecutionRoute;
        26: invokevirtual #22                 // Method ext/mods/commons/pool/CoroutinePool$ExecutionRoute.ordinal:()I
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
  public static final #41= #10 of #40;    // ExecutionRoute=class ext/mods/commons/pool/CoroutinePool$ExecutionRoute of class ext/mods/commons/pool/CoroutinePool
  public static final #42= #2 of #40;     // WhenMappings=class ext/mods/commons/pool/CoroutinePool$WhenMappings of class ext/mods/commons/pool/CoroutinePool
SourceFile: "CoroutinePool.kt"
RuntimeVisibleAnnotations:
  0: #31(#32=[I#33,I#34,I#35],#36=I#34,#37=I#38)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
