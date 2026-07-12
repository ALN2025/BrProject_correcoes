// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea$1
// File: ext\mods\gameserver\model\entity\autofarm\zone\AutoFarmArea$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1.class
  Last modified 9 de jul de 2026; size 1029 bytes
  MD5 checksum 04d90a1799cd4be388fff30dacf4826b
  Compiled from "AutoFarmArea.java"
class ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
  super_class: #26                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #2 = Class              #4             // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #4 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
  #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #14 = NameAndType        #15:#16        // OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #15 = Utf8               OPEN
  #16 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #24 = NameAndType        #25:#16        // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #25 = Utf8               ROTA
  #26 = Class              #27            // java/lang/Object
  #27 = Utf8               java/lang/Object
  #28 = Utf8               <clinit>
  #29 = Utf8               ()V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               StackMapTable
  #34 = Utf8               SourceFile
  #35 = Utf8               AutoFarmArea.java
  #36 = Utf8               EnclosingMethod
  #37 = Class              #38            // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #38 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  #39 = Utf8               NestHost
  #40 = Utf8               InnerClasses
  #41 = Class              #42            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #42 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #43 = Utf8               AutoFarmType
{
  static final int[] $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 218: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 4
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "AutoFarmArea.java"
EnclosingMethod: #37.#0                 // ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea
NestHost: class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
InnerClasses:
  public static final #43= #2 of #41;     // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  static #8;                              // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
