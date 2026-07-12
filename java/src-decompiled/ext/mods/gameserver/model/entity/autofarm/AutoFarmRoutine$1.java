// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$1
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmRoutine$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1.class
  Last modified 9 de jul de 2026; size 1645 bytes
  MD5 checksum 1f7b8c54013ea72f2eec37cf31b4b1e2
  Compiled from "AutoFarmRoutine.java"
class ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
  super_class: #51                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #2 = Class              #4             // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #4 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
   #8 = Class              #10            // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
  #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ESCAPE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #14 = NameAndType        #15:#16        // ESCAPE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #15 = Utf8               ESCAPE
  #16 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.LOGOUT:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #24 = NameAndType        #25:#16        // LOGOUT:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #25 = Utf8               LOGOUT
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ITEM:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #27 = NameAndType        #28:#16        // ITEM:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #28 = Utf8               ITEM
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.SKILL:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #30 = NameAndType        #31:#16        // SKILL:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #31 = Utf8               SKILL
  #32 = Methodref          #33.#34        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #33 = Class              #35            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #34 = NameAndType        #5:#36         // values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #35 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #36 = Utf8               ()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #37 = Fieldref           #8.#38         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
  #38 = NameAndType        #39:#12        // $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
  #39 = Utf8               $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType
  #40 = Fieldref           #33.#41        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #41 = NameAndType        #42:#43        // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #42 = Utf8               ROTA
  #43 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #44 = Methodref          #33.#18        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
  #45 = Fieldref           #33.#46        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #46 = NameAndType        #47:#43        // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #47 = Utf8               ZONA
  #48 = Fieldref           #33.#49        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #49 = NameAndType        #50:#43        // OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #50 = Utf8               OPEN
  #51 = Class              #52            // java/lang/Object
  #52 = Utf8               java/lang/Object
  #53 = Utf8               <clinit>
  #54 = Utf8               ()V
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               StackMapTable
  #59 = Utf8               SourceFile
  #60 = Utf8               AutoFarmRoutine.java
  #61 = Utf8               EnclosingMethod
  #62 = Class              #63            // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  #63 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  #64 = Utf8               NestHost
  #65 = Utf8               InnerClasses
  #66 = Class              #67            // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #67 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #68 = Utf8               AutoFarmMacro
  #69 = Utf8               AutoFarmType
{
  static final int[] $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ESCAPE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        15: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.LOGOUT:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        30: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ITEM:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        45: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.SKILL:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        60: invokevirtual #17                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: invokestatic  #32                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.values:()[Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        72: arraylength
        73: newarray       int
        75: putstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
        78: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
        81: getstatic     #40                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        84: invokevirtual #44                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
        87: iconst_1
        88: iastore
        89: goto          93
        92: astore_0
        93: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
        96: getstatic     #45                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        99: invokevirtual #44                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
       102: iconst_2
       103: iastore
       104: goto          108
       107: astore_0
       108: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
       111: getstatic     #48                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       114: invokevirtual #44                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
       117: iconst_3
       118: iastore
       119: goto          123
       122: astore_0
       123: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
            93   104   107   Class java/lang/NoSuchFieldError
           108   119   122   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 2479: 0
        line 729: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 14
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "AutoFarmRoutine.java"
EnclosingMethod: #62.#0                 // ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine
NestHost: class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
InnerClasses:
  public static final #68= #2 of #66;     // AutoFarmMacro=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  static #8;                              // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
  public static final #69= #33 of #66;    // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
