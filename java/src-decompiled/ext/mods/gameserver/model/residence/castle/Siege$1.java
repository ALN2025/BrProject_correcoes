// Bytecode for: ext.mods.gameserver.model.residence.castle.Siege$1
// File: ext\mods\gameserver\model\residence\castle\Siege$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/castle/Siege$1.class
  Last modified 9 de jul de 2026; size 1273 bytes
  MD5 checksum dcc823c2a0404e1692d7e96d1d831a48
  Compiled from "Siege.java"
class ext.mods.gameserver.model.residence.castle.Siege$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/residence/castle/Siege$1
  super_class: #51                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/SiegeStatus.values:()[Lext/mods/gameserver/enums/SiegeStatus;
   #2 = Class              #4             // ext/mods/gameserver/enums/SiegeStatus
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/SiegeStatus;
   #4 = Utf8               ext/mods/gameserver/enums/SiegeStatus
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/SiegeStatus;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
   #8 = Class              #10            // ext/mods/gameserver/model/residence/castle/Siege$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
  #10 = Utf8               ext/mods/gameserver/model/residence/castle/Siege$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SiegeStatus
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
  #14 = NameAndType        #15:#16        // REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
  #15 = Utf8               REGISTRATION_OPENED
  #16 = Utf8               Lext/mods/gameserver/enums/SiegeStatus;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/SiegeStatus.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
  #24 = NameAndType        #25:#16        // REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
  #25 = Utf8               REGISTRATION_OVER
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
  #27 = NameAndType        #28:#16        // IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
  #28 = Utf8               IN_PROGRESS
  #29 = Methodref          #30.#31        // ext/mods/gameserver/enums/SiegeSide.values:()[Lext/mods/gameserver/enums/SiegeSide;
  #30 = Class              #32            // ext/mods/gameserver/enums/SiegeSide
  #31 = NameAndType        #5:#33         // values:()[Lext/mods/gameserver/enums/SiegeSide;
  #32 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #33 = Utf8               ()[Lext/mods/gameserver/enums/SiegeSide;
  #34 = Fieldref           #8.#35         // ext/mods/gameserver/model/residence/castle/Siege$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
  #35 = NameAndType        #36:#12        // $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
  #36 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SiegeSide
  #37 = Fieldref           #30.#38        // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #38 = NameAndType        #39:#40        // OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #39 = Utf8               OWNER
  #40 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #41 = Methodref          #30.#18        // ext/mods/gameserver/enums/SiegeSide.ordinal:()I
  #42 = Fieldref           #30.#43        // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #43 = NameAndType        #44:#40        // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #44 = Utf8               DEFENDER
  #45 = Fieldref           #30.#46        // ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
  #46 = NameAndType        #47:#40        // PENDING:Lext/mods/gameserver/enums/SiegeSide;
  #47 = Utf8               PENDING
  #48 = Fieldref           #30.#49        // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #49 = NameAndType        #50:#40        // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #50 = Utf8               ATTACKER
  #51 = Class              #52            // java/lang/Object
  #52 = Utf8               java/lang/Object
  #53 = Utf8               <clinit>
  #54 = Utf8               ()V
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               StackMapTable
  #59 = Utf8               SourceFile
  #60 = Utf8               Siege.java
  #61 = Utf8               EnclosingMethod
  #62 = Class              #63            // ext/mods/gameserver/model/residence/castle/Siege
  #63 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #64 = Utf8               NestHost
  #65 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$SiegeSide;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$SiegeStatus;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/SiegeStatus.values:()[Lext/mods/gameserver/enums/SiegeStatus;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OPENED:Lext/mods/gameserver/enums/SiegeStatus;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/SiegeStatus.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/SiegeStatus.REGISTRATION_OVER:Lext/mods/gameserver/enums/SiegeStatus;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/SiegeStatus.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$SiegeStatus:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/SiegeStatus.IN_PROGRESS:Lext/mods/gameserver/enums/SiegeStatus;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/SiegeStatus.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: invokestatic  #29                 // Method ext/mods/gameserver/enums/SiegeSide.values:()[Lext/mods/gameserver/enums/SiegeSide;
        57: arraylength
        58: newarray       int
        60: putstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
        63: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
        66: getstatic     #37                 // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
        69: invokevirtual #41                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
        72: iconst_1
        73: iastore
        74: goto          78
        77: astore_0
        78: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
        81: getstatic     #42                 // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        84: invokevirtual #41                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
        87: iconst_2
        88: iastore
        89: goto          93
        92: astore_0
        93: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
        96: getstatic     #45                 // Field ext/mods/gameserver/enums/SiegeSide.PENDING:Lext/mods/gameserver/enums/SiegeSide;
        99: invokevirtual #41                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
       102: iconst_3
       103: iastore
       104: goto          108
       107: astore_0
       108: getstatic     #34                 // Field $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
       111: getstatic     #48                 // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       114: invokevirtual #41                 // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
       117: iconst_4
       118: iastore
       119: goto          123
       122: astore_0
       123: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            63    74    77   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
            93   104   107   Class java/lang/NoSuchFieldError
           108   119   122   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 901: 0
        line 388: 54
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
SourceFile: "Siege.java"
EnclosingMethod: #62.#0                 // ext.mods.gameserver.model.residence.castle.Siege
NestHost: class ext/mods/gameserver/model/residence/castle/Siege
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/residence/castle/Siege$1
