// Bytecode for: ext.mods.gameserver.model.actor.container.creature.EffectList$1
// File: ext\mods\gameserver\model\actor\container\creature\EffectList$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/creature/EffectList$1.class
  Last modified 9 de jul de 2026; size 1055 bytes
  MD5 checksum ab3eb769ea99002908fd1f61c64ffc92
  Compiled from "EffectList.java"
class ext.mods.gameserver.model.actor.container.creature.EffectList$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/container/creature/EffectList$1
  super_class: #38                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #2 = Class              #4             // ext/mods/gameserver/enums/skills/SkillType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #4 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/creature/EffectList$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/creature/EffectList$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/container/creature/EffectList$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #14 = NameAndType        #15:#16        // BUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #15 = Utf8               BUFF
  #16 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #24 = NameAndType        #25:#16        // COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #25 = Utf8               COMBATPOINTHEAL
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/skills/SkillType.REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
  #27 = NameAndType        #28:#16        // REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Utf8               REFLECT
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #30 = NameAndType        #31:#16        // HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Utf8               HEAL_PERCENT
  #32 = Fieldref           #2.#33         // ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
  #33 = NameAndType        #34:#16        // HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
  #34 = Utf8               HEAL_STATIC
  #35 = Fieldref           #2.#36         // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #36 = NameAndType        #37:#16        // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Utf8               MANAHEAL_PERCENT
  #38 = Class              #39            // java/lang/Object
  #39 = Utf8               java/lang/Object
  #40 = Utf8               <clinit>
  #41 = Utf8               ()V
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               StackMapTable
  #46 = Utf8               SourceFile
  #47 = Utf8               EffectList.java
  #48 = Utf8               EnclosingMethod
  #49 = Class              #50            // ext/mods/gameserver/model/actor/container/creature/EffectList
  #50 = Utf8               ext/mods/gameserver/model/actor/container/creature/EffectList
  #51 = Utf8               NestHost
  #52 = Utf8               InnerClasses
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
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/skills/SkillType.REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        87: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        90: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        93: bipush        6
        95: iastore
        96: goto          100
        99: astore_0
       100: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
            84    96    99   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 284: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 12
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
}
SourceFile: "EffectList.java"
EnclosingMethod: #49.#0                 // ext.mods.gameserver.model.actor.container.creature.EffectList
NestHost: class ext/mods/gameserver/model/actor/container/creature/EffectList
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/container/creature/EffectList$1
