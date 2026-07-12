// Bytecode for: ext.mods.gameserver.model.actor.ai.type.PlayerAI$1
// File: ext\mods\gameserver\model\actor\ai\type\PlayerAI$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.class
  Last modified 9 de jul de 2026; size 1209 bytes
  MD5 checksum face3d073e8dc5ea50bac6959311c8a0
  Compiled from "PlayerAI.java"
class ext.mods.gameserver.model.actor.ai.type.PlayerAI$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
  super_class: #45                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/IntentionType.values:()[Lext/mods/gameserver/enums/IntentionType;
   #2 = Class              #4             // ext/mods/gameserver/enums/IntentionType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/IntentionType;
   #4 = Utf8               ext/mods/gameserver/enums/IntentionType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/IntentionType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #14 = NameAndType        #15:#16        // ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #15 = Utf8               ATTACK
  #16 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/IntentionType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
  #24 = NameAndType        #25:#16        // CAST:Lext/mods/gameserver/enums/IntentionType;
  #25 = Utf8               CAST
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #27 = NameAndType        #28:#16        // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #28 = Utf8               MOVE_TO
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #30 = NameAndType        #31:#16        // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #31 = Utf8               PICK_UP
  #32 = Methodref          #33.#34        // ext/mods/gameserver/enums/skills/SkillTargetType.values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
  #33 = Class              #35            // ext/mods/gameserver/enums/skills/SkillTargetType
  #34 = NameAndType        #5:#36         // values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
  #35 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #36 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillTargetType;
  #37 = Fieldref           #8.#38         // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
  #38 = NameAndType        #39:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
  #39 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType
  #40 = Fieldref           #33.#41        // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #41 = NameAndType        #42:#43        // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #42 = Utf8               GROUND
  #43 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #44 = Methodref          #33.#18        // ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
  #45 = Class              #46            // java/lang/Object
  #46 = Utf8               java/lang/Object
  #47 = Utf8               <clinit>
  #48 = Utf8               ()V
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               StackMapTable
  #53 = Utf8               SourceFile
  #54 = Utf8               PlayerAI.java
  #55 = Utf8               EnclosingMethod
  #56 = Class              #57            // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #57 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #58 = Utf8               NestHost
  #59 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

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
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: invokestatic  #32                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
        72: arraylength
        73: newarray       int
        75: putstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
        78: getstatic     #37                 // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
        81: getstatic     #40                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
        84: invokevirtual #44                 // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
        87: iconst_1
        88: iastore
        89: goto          93
        92: astore_0
        93: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 897: 0
        line 378: 69
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
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "PlayerAI.java"
EnclosingMethod: #56.#0                 // ext.mods.gameserver.model.actor.ai.type.PlayerAI
NestHost: class ext/mods/gameserver/model/actor/ai/type/PlayerAI
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
