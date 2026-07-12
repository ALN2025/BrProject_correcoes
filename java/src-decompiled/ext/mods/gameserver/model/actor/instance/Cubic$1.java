// Bytecode for: ext.mods.gameserver.model.actor.instance.Cubic$1
// File: ext\mods\gameserver\model\actor\instance\Cubic$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Cubic$1.class
  Last modified 9 de jul de 2026; size 1130 bytes
  MD5 checksum 94935c5db3874aed11c045984edcf296
  Compiled from "Cubic.java"
class ext.mods.gameserver.model.actor.instance.Cubic$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Cubic$1
  super_class: #47                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #2 = Class              #4             // ext/mods/gameserver/enums/skills/SkillType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #4 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/instance/Cubic$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/Cubic$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/Cubic$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
  #14 = NameAndType        #15:#16        // PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
  #15 = Utf8               PARALYZE
  #16 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
  #24 = NameAndType        #25:#16        // STUN:Lext/mods/gameserver/enums/skills/SkillType;
  #25 = Utf8               STUN
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/skills/SkillType.ROOT:Lext/mods/gameserver/enums/skills/SkillType;
  #27 = NameAndType        #28:#16        // ROOT:Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Utf8               ROOT
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #30 = NameAndType        #31:#16        // AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Utf8               AGGDAMAGE
  #32 = Fieldref           #2.#33         // ext/mods/gameserver/enums/skills/SkillType.MDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #33 = NameAndType        #34:#16        // MDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #34 = Utf8               MDAM
  #35 = Fieldref           #2.#36         // ext/mods/gameserver/enums/skills/SkillType.POISON:Lext/mods/gameserver/enums/skills/SkillType;
  #36 = NameAndType        #37:#16        // POISON:Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Utf8               POISON
  #38 = Fieldref           #2.#39         // ext/mods/gameserver/enums/skills/SkillType.DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #39 = NameAndType        #40:#16        // DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #40 = Utf8               DEBUFF
  #41 = Fieldref           #2.#42         // ext/mods/gameserver/enums/skills/SkillType.DOT:Lext/mods/gameserver/enums/skills/SkillType;
  #42 = NameAndType        #43:#16        // DOT:Lext/mods/gameserver/enums/skills/SkillType;
  #43 = Utf8               DOT
  #44 = Fieldref           #2.#45         // ext/mods/gameserver/enums/skills/SkillType.DRAIN:Lext/mods/gameserver/enums/skills/SkillType;
  #45 = NameAndType        #46:#16        // DRAIN:Lext/mods/gameserver/enums/skills/SkillType;
  #46 = Utf8               DRAIN
  #47 = Class              #48            // java/lang/Object
  #48 = Utf8               java/lang/Object
  #49 = Utf8               <clinit>
  #50 = Utf8               ()V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               StackMapTable
  #55 = Utf8               SourceFile
  #56 = Utf8               Cubic.java
  #57 = Utf8               EnclosingMethod
  #58 = Class              #59            // ext/mods/gameserver/model/actor/instance/Cubic
  #59 = Utf8               ext/mods/gameserver/model/actor/instance/Cubic
  #60 = Utf8               NestHost
  #61 = Utf8               InnerClasses
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
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
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
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/skills/SkillType.MDAM:Lext/mods/gameserver/enums/skills/SkillType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.POISON:Lext/mods/gameserver/enums/skills/SkillType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       103: getstatic     #38                 // Field ext/mods/gameserver/enums/skills/SkillType.DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
       106: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       109: bipush        7
       111: iastore
       112: goto          116
       115: astore_0
       116: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       119: getstatic     #41                 // Field ext/mods/gameserver/enums/skills/SkillType.DOT:Lext/mods/gameserver/enums/skills/SkillType;
       122: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       125: bipush        8
       127: iastore
       128: goto          132
       131: astore_0
       132: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       135: getstatic     #44                 // Field ext/mods/gameserver/enums/skills/SkillType.DRAIN:Lext/mods/gameserver/enums/skills/SkillType;
       138: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       141: bipush        9
       143: iastore
       144: goto          148
       147: astore_0
       148: return
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
      LineNumberTable:
        line 349: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 18
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
}
SourceFile: "Cubic.java"
EnclosingMethod: #58.#0                 // ext.mods.gameserver.model.actor.instance.Cubic
NestHost: class ext/mods/gameserver/model/actor/instance/Cubic
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/instance/Cubic$1
