// Bytecode for: ext.mods.gameserver.model.actor.ai.type.NpcAI$1
// File: ext\mods\gameserver\model\actor\ai\type\NpcAI$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/NpcAI$1.class
  Last modified 9 de jul de 2026; size 881 bytes
  MD5 checksum 05e309e4e06d9a08e0317391dc17bf84
  Compiled from "NpcAI.java"
class ext.mods.gameserver.model.actor.ai.type.NpcAI$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/NpcAI$1
  super_class: #32                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/IntentionType.values:()[Lext/mods/gameserver/enums/IntentionType;
   #2 = Class              #4             // ext/mods/gameserver/enums/IntentionType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/IntentionType;
   #4 = Utf8               ext/mods/gameserver/enums/IntentionType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/IntentionType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/ai/type/NpcAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/ai/type/NpcAI$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #14 = NameAndType        #15:#16        // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #15 = Utf8               MOVE_TO
  #16 = Utf8               Lext/mods/gameserver/enums/IntentionType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/IntentionType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
  #24 = NameAndType        #25:#16        // FLEE:Lext/mods/gameserver/enums/IntentionType;
  #25 = Utf8               FLEE
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
  #27 = NameAndType        #28:#16        // WANDER:Lext/mods/gameserver/enums/IntentionType;
  #28 = Utf8               WANDER
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #30 = NameAndType        #31:#16        // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #31 = Utf8               FOLLOW
  #32 = Class              #33            // java/lang/Object
  #33 = Utf8               java/lang/Object
  #34 = Utf8               <clinit>
  #35 = Utf8               ()V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               StackMapTable
  #40 = Utf8               SourceFile
  #41 = Utf8               NpcAI.java
  #42 = Utf8               EnclosingMethod
  #43 = Class              #44            // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #44 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #45 = Utf8               NestHost
  #46 = Utf8               InnerClasses
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
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
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
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 497: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 8
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
}
SourceFile: "NpcAI.java"
EnclosingMethod: #43.#0                 // ext.mods.gameserver.model.actor.ai.type.NpcAI
NestHost: class ext/mods/gameserver/model/actor/ai/type/NpcAI
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/ai/type/NpcAI$1
