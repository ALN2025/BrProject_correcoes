// Bytecode for: ext.mods.gameserver.model.olympiad.Olympiad$1
// File: ext\mods\gameserver\model\olympiad\Olympiad$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/Olympiad$1.class
  Last modified 9 de jul de 2026; size 1230 bytes
  MD5 checksum 7b0912295022d599ad88d1ee25a2cf6d
  Compiled from "Olympiad.java"
class ext.mods.gameserver.model.olympiad.Olympiad$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/olympiad/Olympiad$1
  super_class: #45                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.values:()[Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
   #2 = Class              #4             // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
   #4 = Utf8               ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/olympiad/Olympiad$1.$SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
   #8 = Class              #10            // ext/mods/gameserver/model/olympiad/Olympiad$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
  #10 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.DAY:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #14 = NameAndType        #15:#16        // DAY:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #15 = Utf8               DAY
  #16 = Utf8               Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.WEEK:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #24 = NameAndType        #25:#16        // WEEK:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #25 = Utf8               WEEK
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.MONTH:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #27 = NameAndType        #28:#16        // MONTH:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #28 = Utf8               MONTH
  #29 = Methodref          #30.#31        // ext/mods/gameserver/enums/OlympiadState.values:()[Lext/mods/gameserver/enums/OlympiadState;
  #30 = Class              #32            // ext/mods/gameserver/enums/OlympiadState
  #31 = NameAndType        #5:#33         // values:()[Lext/mods/gameserver/enums/OlympiadState;
  #32 = Utf8               ext/mods/gameserver/enums/OlympiadState
  #33 = Utf8               ()[Lext/mods/gameserver/enums/OlympiadState;
  #34 = Fieldref           #8.#35         // ext/mods/gameserver/model/olympiad/Olympiad$1.$SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
  #35 = NameAndType        #36:#12        // $SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
  #36 = Utf8               $SwitchMap$ext$mods$gameserver$enums$OlympiadState
  #37 = Fieldref           #30.#38        // ext/mods/gameserver/enums/OlympiadState.COMPETITION:Lext/mods/gameserver/enums/OlympiadState;
  #38 = NameAndType        #39:#40        // COMPETITION:Lext/mods/gameserver/enums/OlympiadState;
  #39 = Utf8               COMPETITION
  #40 = Utf8               Lext/mods/gameserver/enums/OlympiadState;
  #41 = Methodref          #30.#18        // ext/mods/gameserver/enums/OlympiadState.ordinal:()I
  #42 = Fieldref           #30.#43        // ext/mods/gameserver/enums/OlympiadState.VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
  #43 = NameAndType        #44:#40        // VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
  #44 = Utf8               VALIDATION
  #45 = Class              #46            // java/lang/Object
  #46 = Utf8               java/lang/Object
  #47 = Utf8               <clinit>
  #48 = Utf8               ()V
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               StackMapTable
  #53 = Utf8               SourceFile
  #54 = Utf8               Olympiad.java
  #55 = Utf8               EnclosingMethod
  #56 = Class              #57            // ext/mods/gameserver/model/olympiad/Olympiad
  #57 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
  #58 = Utf8               NestHost
  #59 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$OlympiadState;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.values:()[Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.DAY:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
        15: invokevirtual #17                 // Method ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.WEEK:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
        30: invokevirtual #17                 // Method ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$model$olympiad$enums$OlympiadPeriod:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.MONTH:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
        45: invokevirtual #17                 // Method ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: invokestatic  #29                 // Method ext/mods/gameserver/enums/OlympiadState.values:()[Lext/mods/gameserver/enums/OlympiadState;
        57: arraylength
        58: newarray       int
        60: putstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
        63: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
        66: getstatic     #37                 // Field ext/mods/gameserver/enums/OlympiadState.COMPETITION:Lext/mods/gameserver/enums/OlympiadState;
        69: invokevirtual #41                 // Method ext/mods/gameserver/enums/OlympiadState.ordinal:()I
        72: iconst_1
        73: iastore
        74: goto          78
        77: astore_0
        78: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$OlympiadState:[I
        81: getstatic     #42                 // Field ext/mods/gameserver/enums/OlympiadState.VALIDATION:Lext/mods/gameserver/enums/OlympiadState;
        84: invokevirtual #41                 // Method ext/mods/gameserver/enums/OlympiadState.ordinal:()I
        87: iconst_2
        88: iastore
        89: goto          93
        92: astore_0
        93: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            63    74    77   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 469: 0
        line 181: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 10
        frame_type = 87 /* same_locals_1_stack_item */
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
}
SourceFile: "Olympiad.java"
EnclosingMethod: #56.#0                 // ext.mods.gameserver.model.olympiad.Olympiad
NestHost: class ext/mods/gameserver/model/olympiad/Olympiad
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/olympiad/Olympiad$1
