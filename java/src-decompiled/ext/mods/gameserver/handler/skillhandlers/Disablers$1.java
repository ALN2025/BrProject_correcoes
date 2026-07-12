// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Disablers$1
// File: ext\mods\gameserver\handler\skillhandlers\Disablers$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Disablers$1.class
  Last modified 9 de jul de 2026; size 1462 bytes
  MD5 checksum b48d6620161d1d6b4b0226e657b35170
  Compiled from "Disablers.java"
class ext.mods.gameserver.handler.skillhandlers.Disablers$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/handler/skillhandlers/Disablers$1
  super_class: #65                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #2 = Class              #4             // ext/mods/gameserver/enums/skills/SkillType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #4 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/handler/skillhandlers/Disablers$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #8 = Class              #10            // ext/mods/gameserver/handler/skillhandlers/Disablers$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #10 = Utf8               ext/mods/gameserver/handler/skillhandlers/Disablers$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/skills/SkillType.BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
  #14 = NameAndType        #15:#16        // BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
  #15 = Utf8               BETRAY
  #16 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/skills/SkillType.FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
  #24 = NameAndType        #25:#16        // FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
  #25 = Utf8               FAKE_DEATH
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/skills/SkillType.ROOT:Lext/mods/gameserver/enums/skills/SkillType;
  #27 = NameAndType        #28:#16        // ROOT:Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Utf8               ROOT
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
  #30 = NameAndType        #31:#16        // STUN:Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Utf8               STUN
  #32 = Fieldref           #2.#33         // ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #33 = NameAndType        #34:#16        // SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #34 = Utf8               SLEEP
  #35 = Fieldref           #2.#36         // ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
  #36 = NameAndType        #37:#16        // PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Utf8               PARALYZE
  #38 = Fieldref           #2.#39         // ext/mods/gameserver/enums/skills/SkillType.MUTE:Lext/mods/gameserver/enums/skills/SkillType;
  #39 = NameAndType        #40:#16        // MUTE:Lext/mods/gameserver/enums/skills/SkillType;
  #40 = Utf8               MUTE
  #41 = Fieldref           #2.#42         // ext/mods/gameserver/enums/skills/SkillType.CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #42 = NameAndType        #43:#16        // CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #43 = Utf8               CONFUSION
  #44 = Fieldref           #2.#45         // ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #45 = NameAndType        #46:#16        // AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #46 = Utf8               AGGDAMAGE
  #47 = Fieldref           #2.#48         // ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
  #48 = NameAndType        #49:#16        // AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
  #49 = Utf8               AGGREDUCE
  #50 = Fieldref           #2.#51         // ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
  #51 = NameAndType        #52:#16        // AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
  #52 = Utf8               AGGREDUCE_CHAR
  #53 = Fieldref           #2.#54         // ext/mods/gameserver/enums/skills/SkillType.AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
  #54 = NameAndType        #55:#16        // AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
  #55 = Utf8               AGGREMOVE
  #56 = Fieldref           #2.#57         // ext/mods/gameserver/enums/skills/SkillType.ERASE:Lext/mods/gameserver/enums/skills/SkillType;
  #57 = NameAndType        #58:#16        // ERASE:Lext/mods/gameserver/enums/skills/SkillType;
  #58 = Utf8               ERASE
  #59 = Fieldref           #2.#60         // ext/mods/gameserver/enums/skills/SkillType.CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #60 = NameAndType        #61:#16        // CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #61 = Utf8               CANCEL_DEBUFF
  #62 = Fieldref           #2.#63         // ext/mods/gameserver/enums/skills/SkillType.NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #63 = NameAndType        #64:#16        // NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #64 = Utf8               NEGATE
  #65 = Class              #66            // java/lang/Object
  #66 = Utf8               java/lang/Object
  #67 = Utf8               <clinit>
  #68 = Utf8               ()V
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               StackMapTable
  #73 = Utf8               SourceFile
  #74 = Utf8               Disablers.java
  #75 = Utf8               EnclosingMethod
  #76 = Class              #77            // ext/mods/gameserver/handler/skillhandlers/Disablers
  #77 = Utf8               ext/mods/gameserver/handler/skillhandlers/Disablers
  #78 = Utf8               NestHost
  #79 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/SkillType.FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/skills/SkillType.ROOT:Lext/mods/gameserver/enums/skills/SkillType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       103: getstatic     #38                 // Field ext/mods/gameserver/enums/skills/SkillType.MUTE:Lext/mods/gameserver/enums/skills/SkillType;
       106: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       109: bipush        7
       111: iastore
       112: goto          116
       115: astore_0
       116: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       119: getstatic     #41                 // Field ext/mods/gameserver/enums/skills/SkillType.CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
       122: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       125: bipush        8
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       135: getstatic     #44                 // Field ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
       138: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       141: bipush        9
       143: iastore
       144: goto          148
       147: astore_0
       148: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       151: getstatic     #47                 // Field ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
       154: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       157: bipush        10
       159: iastore
       160: goto          164
       163: astore_0
       164: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       167: getstatic     #50                 // Field ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
       170: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       173: bipush        11
       175: iastore
       176: goto          180
       179: astore_0
       180: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       183: getstatic     #53                 // Field ext/mods/gameserver/enums/skills/SkillType.AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
       186: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       189: bipush        12
       191: iastore
       192: goto          196
       195: astore_0
       196: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       199: getstatic     #56                 // Field ext/mods/gameserver/enums/skills/SkillType.ERASE:Lext/mods/gameserver/enums/skills/SkillType;
       202: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       205: bipush        13
       207: iastore
       208: goto          212
       211: astore_0
       212: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       215: getstatic     #59                 // Field ext/mods/gameserver/enums/skills/SkillType.CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
       218: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       221: bipush        14
       223: iastore
       224: goto          228
       227: astore_0
       228: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       231: getstatic     #62                 // Field ext/mods/gameserver/enums/skills/SkillType.NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
       234: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       237: bipush        15
       239: iastore
       240: goto          244
       243: astore_0
       244: return
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
           180   192   195   Class java/lang/NoSuchFieldError
           196   208   211   Class java/lang/NoSuchFieldError
           212   224   227   Class java/lang/NoSuchFieldError
           228   240   243   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 30
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
SourceFile: "Disablers.java"
EnclosingMethod: #76.#0                 // ext.mods.gameserver.handler.skillhandlers.Disablers
NestHost: class ext/mods/gameserver/handler/skillhandlers/Disablers
InnerClasses:
  static #8;                              // class ext/mods/gameserver/handler/skillhandlers/Disablers$1
