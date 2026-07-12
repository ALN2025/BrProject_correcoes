// Bytecode for: ext.mods.gameserver.data.manager.SpawnManager$1
// File: ext\mods\gameserver\data\manager\SpawnManager$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/SpawnManager$1.class
  Last modified 9 de jul de 2026; size 1252 bytes
  MD5 checksum 781697f90ddac8144ccd2d6a11d77e54
  Compiled from "SpawnManager.java"
class ext.mods.gameserver.data.manager.SpawnManager$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/data/manager/SpawnManager$1
  super_class: #51                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/PeriodType.values:()[Lext/mods/gameserver/enums/PeriodType;
   #2 = Class              #4             // ext/mods/gameserver/enums/PeriodType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/PeriodType;
   #4 = Utf8               ext/mods/gameserver/enums/PeriodType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/PeriodType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
   #8 = Class              #10            // ext/mods/gameserver/data/manager/SpawnManager$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
  #10 = Utf8               ext/mods/gameserver/data/manager/SpawnManager$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$PeriodType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/PeriodType.RECRUITING:Lext/mods/gameserver/enums/PeriodType;
  #14 = NameAndType        #15:#16        // RECRUITING:Lext/mods/gameserver/enums/PeriodType;
  #15 = Utf8               RECRUITING
  #16 = Utf8               Lext/mods/gameserver/enums/PeriodType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/PeriodType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/PeriodType.COMPETITION:Lext/mods/gameserver/enums/PeriodType;
  #24 = NameAndType        #25:#16        // COMPETITION:Lext/mods/gameserver/enums/PeriodType;
  #25 = Utf8               COMPETITION
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/PeriodType.RESULTS:Lext/mods/gameserver/enums/PeriodType;
  #27 = NameAndType        #28:#16        // RESULTS:Lext/mods/gameserver/enums/PeriodType;
  #28 = Utf8               RESULTS
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/PeriodType.SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
  #30 = NameAndType        #31:#16        // SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
  #31 = Utf8               SEAL_VALIDATION
  #32 = Methodref          #33.#34        // ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
  #33 = Class              #35            // ext/mods/gameserver/enums/CabalType
  #34 = NameAndType        #5:#36         // values:()[Lext/mods/gameserver/enums/CabalType;
  #35 = Utf8               ext/mods/gameserver/enums/CabalType
  #36 = Utf8               ()[Lext/mods/gameserver/enums/CabalType;
  #37 = Fieldref           #8.#38         // ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #38 = NameAndType        #39:#12        // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #39 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
  #40 = Fieldref           #33.#41        // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
  #41 = NameAndType        #42:#43        // NORMAL:Lext/mods/gameserver/enums/CabalType;
  #42 = Utf8               NORMAL
  #43 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #44 = Methodref          #33.#18        // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #45 = Fieldref           #33.#46        // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #46 = NameAndType        #47:#43        // DUSK:Lext/mods/gameserver/enums/CabalType;
  #47 = Utf8               DUSK
  #48 = Fieldref           #33.#49        // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #49 = NameAndType        #50:#43        // DAWN:Lext/mods/gameserver/enums/CabalType;
  #50 = Utf8               DAWN
  #51 = Class              #52            // java/lang/Object
  #52 = Utf8               java/lang/Object
  #53 = Utf8               <clinit>
  #54 = Utf8               ()V
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               StackMapTable
  #59 = Utf8               SourceFile
  #60 = Utf8               SpawnManager.java
  #61 = Utf8               EnclosingMethod
  #62 = Class              #63            // ext/mods/gameserver/data/manager/SpawnManager
  #63 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #64 = Utf8               NestHost
  #65 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$CabalType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$PeriodType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/PeriodType.values:()[Lext/mods/gameserver/enums/PeriodType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/PeriodType.RECRUITING:Lext/mods/gameserver/enums/PeriodType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/PeriodType.COMPETITION:Lext/mods/gameserver/enums/PeriodType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/PeriodType.RESULTS:Lext/mods/gameserver/enums/PeriodType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/PeriodType.SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: invokestatic  #32                 // Method ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
        72: arraylength
        73: newarray       int
        75: putstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        78: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        81: getstatic     #40                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
        84: invokevirtual #44                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        87: iconst_1
        88: iastore
        89: goto          93
        92: astore_0
        93: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        96: getstatic     #45                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        99: invokevirtual #44                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
       102: iconst_2
       103: iastore
       104: goto          108
       107: astore_0
       108: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
       111: getstatic     #48                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       114: invokevirtual #44                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
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
        line 408: 0
        line 418: 69
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
SourceFile: "SpawnManager.java"
EnclosingMethod: #62.#0                 // ext.mods.gameserver.data.manager.SpawnManager
NestHost: class ext/mods/gameserver/data/manager/SpawnManager
InnerClasses:
  static #8;                              // class ext/mods/gameserver/data/manager/SpawnManager$1
