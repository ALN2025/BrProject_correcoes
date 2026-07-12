// Bytecode for: ext.mods.gameserver.model.actor.ai.Intention$1
// File: ext\mods\gameserver\model\actor\ai\Intention$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/Intention$1.class
  Last modified 9 de jul de 2026; size 1220 bytes
  MD5 checksum 312f888cfbe3408898d2a4f07afb4a5c
  Compiled from "Intention.java"
class ext.mods.gameserver.model.actor.ai.Intention$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/Intention$1
  super_class: #53                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/IntentionType.values:()[Lext/mods/gameserver/enums/IntentionType;
   #2 = Class              #4             // ext/mods/gameserver/enums/IntentionType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/IntentionType;
   #4 = Utf8               ext/mods/gameserver/enums/IntentionType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/IntentionType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/ai/Intention$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/ai/Intention$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/ai/Intention$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
  #14 = NameAndType        #15:#16        // IDLE:Lext/mods/gameserver/enums/IntentionType;
  #15 = Utf8               IDLE
  #16 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/IntentionType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
  #24 = NameAndType        #25:#16        // NOTHING:Lext/mods/gameserver/enums/IntentionType;
  #25 = Utf8               NOTHING
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
  #27 = NameAndType        #28:#16        // WANDER:Lext/mods/gameserver/enums/IntentionType;
  #28 = Utf8               WANDER
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #30 = NameAndType        #31:#16        // ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #31 = Utf8               ATTACK
  #32 = Fieldref           #2.#33         // ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
  #33 = NameAndType        #34:#16        // FLEE:Lext/mods/gameserver/enums/IntentionType;
  #34 = Utf8               FLEE
  #35 = Fieldref           #2.#36         // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #36 = NameAndType        #37:#16        // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #37 = Utf8               FOLLOW
  #38 = Fieldref           #2.#39         // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #39 = NameAndType        #40:#16        // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #40 = Utf8               PICK_UP
  #41 = Fieldref           #2.#42         // ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
  #42 = NameAndType        #43:#16        // MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
  #43 = Utf8               MOVE_ROUTE
  #44 = Fieldref           #2.#45         // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
  #45 = NameAndType        #46:#16        // CAST:Lext/mods/gameserver/enums/IntentionType;
  #46 = Utf8               CAST
  #47 = Fieldref           #2.#48         // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #48 = NameAndType        #49:#16        // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #49 = Utf8               MOVE_TO
  #50 = Fieldref           #2.#51         // ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
  #51 = NameAndType        #52:#16        // SOCIAL:Lext/mods/gameserver/enums/IntentionType;
  #52 = Utf8               SOCIAL
  #53 = Class              #54            // java/lang/Object
  #54 = Utf8               java/lang/Object
  #55 = Utf8               <clinit>
  #56 = Utf8               ()V
  #57 = Utf8               Code
  #58 = Utf8               LineNumberTable
  #59 = Utf8               LocalVariableTable
  #60 = Utf8               StackMapTable
  #61 = Utf8               SourceFile
  #62 = Utf8               Intention.java
  #63 = Utf8               EnclosingMethod
  #64 = Class              #65            // ext/mods/gameserver/model/actor/ai/Intention
  #65 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #66 = Utf8               NestHost
  #67 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$IntentionType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/IntentionType.values:()[Lext/mods/gameserver/enums/IntentionType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/IntentionType.NOTHING:Lext/mods/gameserver/enums/IntentionType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       103: getstatic     #38                 // Field ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
       106: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       109: bipush        7
       111: iastore
       112: goto          116
       115: astore_0
       116: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       119: getstatic     #41                 // Field ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
       122: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       125: bipush        8
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       135: getstatic     #44                 // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
       138: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       141: bipush        9
       143: iastore
       144: goto          148
       147: astore_0
       148: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       151: getstatic     #47                 // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
       154: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       157: bipush        10
       159: iastore
       160: goto          164
       163: astore_0
       164: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
       167: getstatic     #50                 // Field ext/mods/gameserver/enums/IntentionType.SOCIAL:Lext/mods/gameserver/enums/IntentionType;
       170: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
       173: bipush        11
       175: iastore
       176: goto          180
       179: astore_0
       180: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
            84    96    99   Class java/lang/NoSuchFieldError
           100   112   115   Class java/lang/NoSuchFieldError
           116   128   131   Class java/lang/NoSuchFieldError
           132   144   147   Class java/lang/NoSuchFieldError
           148   160   163   Class java/lang/NoSuchFieldError
           164   176   179   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 22
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
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "Intention.java"
EnclosingMethod: #64.#0                 // ext.mods.gameserver.model.actor.ai.Intention
NestHost: class ext/mods/gameserver/model/actor/ai/Intention
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/ai/Intention$1
