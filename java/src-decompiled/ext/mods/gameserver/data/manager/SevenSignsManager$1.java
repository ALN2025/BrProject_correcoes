// Bytecode for: ext.mods.gameserver.data.manager.SevenSignsManager$1
// File: ext\mods\gameserver\data\manager\SevenSignsManager$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/SevenSignsManager$1.class
  Last modified 9 de jul de 2026; size 1624 bytes
  MD5 checksum fae5e8cf5315b7e077d831daacc8e1ae
  Compiled from "SevenSignsManager.java"
class ext.mods.gameserver.data.manager.SevenSignsManager$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/data/manager/SevenSignsManager$1
  super_class: #70                        // java/lang/Object
  interfaces: 0, fields: 3, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/SealType.values:()[Lext/mods/gameserver/enums/SealType;
   #2 = Class              #4             // ext/mods/gameserver/enums/SealType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/SealType;
   #4 = Utf8               ext/mods/gameserver/enums/SealType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/SealType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/SevenSignsManager$1.$SwitchMap$ext$mods$gameserver$enums$SealType:[I
   #8 = Class              #10            // ext/mods/gameserver/data/manager/SevenSignsManager$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$SealType:[I
  #10 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SealType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
  #14 = NameAndType        #15:#16        // AVARICE:Lext/mods/gameserver/enums/SealType;
  #15 = Utf8               AVARICE
  #16 = Utf8               Lext/mods/gameserver/enums/SealType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/SealType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
  #24 = NameAndType        #25:#16        // GNOSIS:Lext/mods/gameserver/enums/SealType;
  #25 = Utf8               GNOSIS
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
  #27 = NameAndType        #28:#16        // STRIFE:Lext/mods/gameserver/enums/SealType;
  #28 = Utf8               STRIFE
  #29 = Methodref          #30.#31        // ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
  #30 = Class              #32            // ext/mods/gameserver/enums/CabalType
  #31 = NameAndType        #5:#33         // values:()[Lext/mods/gameserver/enums/CabalType;
  #32 = Utf8               ext/mods/gameserver/enums/CabalType
  #33 = Utf8               ()[Lext/mods/gameserver/enums/CabalType;
  #34 = Fieldref           #8.#35         // ext/mods/gameserver/data/manager/SevenSignsManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #35 = NameAndType        #36:#12        // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #36 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
  #37 = Fieldref           #30.#38        // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #38 = NameAndType        #39:#40        // DAWN:Lext/mods/gameserver/enums/CabalType;
  #39 = Utf8               DAWN
  #40 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #41 = Methodref          #30.#18        // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #42 = Fieldref           #30.#43        // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #43 = NameAndType        #44:#40        // DUSK:Lext/mods/gameserver/enums/CabalType;
  #44 = Utf8               DUSK
  #45 = Fieldref           #30.#46        // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
  #46 = NameAndType        #47:#40        // NORMAL:Lext/mods/gameserver/enums/CabalType;
  #47 = Utf8               NORMAL
  #48 = Methodref          #49.#50        // ext/mods/gameserver/enums/PeriodType.values:()[Lext/mods/gameserver/enums/PeriodType;
  #49 = Class              #51            // ext/mods/gameserver/enums/PeriodType
  #50 = NameAndType        #5:#52         // values:()[Lext/mods/gameserver/enums/PeriodType;
  #51 = Utf8               ext/mods/gameserver/enums/PeriodType
  #52 = Utf8               ()[Lext/mods/gameserver/enums/PeriodType;
  #53 = Fieldref           #8.#54         // ext/mods/gameserver/data/manager/SevenSignsManager$1.$SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
  #54 = NameAndType        #55:#12        // $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
  #55 = Utf8               $SwitchMap$ext$mods$gameserver$enums$PeriodType
  #56 = Fieldref           #49.#57        // ext/mods/gameserver/enums/PeriodType.SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
  #57 = NameAndType        #58:#59        // SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
  #58 = Utf8               SEAL_VALIDATION
  #59 = Utf8               Lext/mods/gameserver/enums/PeriodType;
  #60 = Methodref          #49.#18        // ext/mods/gameserver/enums/PeriodType.ordinal:()I
  #61 = Fieldref           #49.#62        // ext/mods/gameserver/enums/PeriodType.COMPETITION:Lext/mods/gameserver/enums/PeriodType;
  #62 = NameAndType        #63:#59        // COMPETITION:Lext/mods/gameserver/enums/PeriodType;
  #63 = Utf8               COMPETITION
  #64 = Fieldref           #49.#65        // ext/mods/gameserver/enums/PeriodType.RECRUITING:Lext/mods/gameserver/enums/PeriodType;
  #65 = NameAndType        #66:#59        // RECRUITING:Lext/mods/gameserver/enums/PeriodType;
  #66 = Utf8               RECRUITING
  #67 = Fieldref           #49.#68        // ext/mods/gameserver/enums/PeriodType.RESULTS:Lext/mods/gameserver/enums/PeriodType;
  #68 = NameAndType        #69:#59        // RESULTS:Lext/mods/gameserver/enums/PeriodType;
  #69 = Utf8               RESULTS
  #70 = Class              #71            // java/lang/Object
  #71 = Utf8               java/lang/Object
  #72 = Utf8               <clinit>
  #73 = Utf8               ()V
  #74 = Utf8               Code
  #75 = Utf8               LineNumberTable
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               StackMapTable
  #78 = Utf8               SourceFile
  #79 = Utf8               SevenSignsManager.java
  #80 = Utf8               EnclosingMethod
  #81 = Class              #82            // ext/mods/gameserver/data/manager/SevenSignsManager
  #82 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #83 = Utf8               NestHost
  #84 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$PeriodType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$CabalType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$SealType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/SealType.values:()[Lext/mods/gameserver/enums/SealType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SealType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SealType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/SealType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SealType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/SealType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SealType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/SealType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: invokestatic  #29                 // Method ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
        57: arraylength
        58: newarray       int
        60: putstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        63: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        66: getstatic     #37                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        69: invokevirtual #41                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        72: iconst_1
        73: iastore
        74: goto          78
        77: astore_0
        78: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        81: getstatic     #42                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        84: invokevirtual #41                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        87: iconst_2
        88: iastore
        89: goto          93
        92: astore_0
        93: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        96: getstatic     #45                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
        99: invokevirtual #41                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
       102: iconst_3
       103: iastore
       104: goto          108
       107: astore_0
       108: invokestatic  #48                 // Method ext/mods/gameserver/enums/PeriodType.values:()[Lext/mods/gameserver/enums/PeriodType;
       111: arraylength
       112: newarray       int
       114: putstatic     #53                 // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
       117: getstatic     #53                 // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
       120: getstatic     #56                 // Field ext/mods/gameserver/enums/PeriodType.SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
       123: invokevirtual #60                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
       126: iconst_1
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #53                 // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
       135: getstatic     #61                 // Field ext/mods/gameserver/enums/PeriodType.COMPETITION:Lext/mods/gameserver/enums/PeriodType;
       138: invokevirtual #60                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
       141: iconst_2
       142: iastore
       143: goto          147
       146: astore_0
       147: getstatic     #53                 // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
       150: getstatic     #64                 // Field ext/mods/gameserver/enums/PeriodType.RECRUITING:Lext/mods/gameserver/enums/PeriodType;
       153: invokevirtual #60                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
       156: iconst_3
       157: iastore
       158: goto          162
       161: astore_0
       162: getstatic     #53                 // Field $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
       165: getstatic     #67                 // Field ext/mods/gameserver/enums/PeriodType.RESULTS:Lext/mods/gameserver/enums/PeriodType;
       168: invokevirtual #60                 // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
       171: iconst_4
       172: iastore
       173: goto          177
       176: astore_0
       177: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            63    74    77   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
            93   104   107   Class java/lang/NoSuchFieldError
           117   128   131   Class java/lang/NoSuchFieldError
           132   143   146   Class java/lang/NoSuchFieldError
           147   158   161   Class java/lang/NoSuchFieldError
           162   173   176   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 731: 0
        line 222: 54
        line 124: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 20
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
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "SevenSignsManager.java"
EnclosingMethod: #81.#0                 // ext.mods.gameserver.data.manager.SevenSignsManager
NestHost: class ext/mods/gameserver/data/manager/SevenSignsManager
InnerClasses:
  static #8;                              // class ext/mods/gameserver/data/manager/SevenSignsManager$1
