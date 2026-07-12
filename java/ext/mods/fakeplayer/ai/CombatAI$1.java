// Bytecode for: ext.mods.fakeplayer.ai.CombatAI$1
// File: ext\mods\fakeplayer\ai\CombatAI$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/CombatAI$1.class
  Last modified 9 de jul de 2026; size 842 bytes
  MD5 checksum 3a097c19649d35acd59f297bbe5e9f39
  Compiled from "CombatAI.java"
class ext.mods.fakeplayer.ai.CombatAI$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/fakeplayer/ai/CombatAI$1
  super_class: #29                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/fakeplayer/model/SpellUsageCondition.values:()[Lext/mods/fakeplayer/model/SpellUsageCondition;
   #2 = Class              #4             // ext/mods/fakeplayer/model/SpellUsageCondition
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/fakeplayer/model/SpellUsageCondition;
   #4 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/fakeplayer/model/SpellUsageCondition;
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/ai/CombatAI$1.$SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
   #8 = Class              #10            // ext/mods/fakeplayer/ai/CombatAI$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
  #10 = Utf8               ext/mods/fakeplayer/ai/CombatAI$1
  #11 = Utf8               $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #14 = NameAndType        #15:#16        // LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #15 = Utf8               LESSHPPERCENT
  #16 = Utf8               Lext/mods/fakeplayer/model/SpellUsageCondition;
  #17 = Methodref          #2.#18         // ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/fakeplayer/model/SpellUsageCondition.MISSINGCP:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #24 = NameAndType        #25:#16        // MISSINGCP:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #25 = Utf8               MISSINGCP
  #26 = Fieldref           #2.#27         // ext/mods/fakeplayer/model/SpellUsageCondition.NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #27 = NameAndType        #28:#16        // NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #28 = Utf8               NONE
  #29 = Class              #30            // java/lang/Object
  #30 = Utf8               java/lang/Object
  #31 = Utf8               <clinit>
  #32 = Utf8               ()V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               StackMapTable
  #37 = Utf8               SourceFile
  #38 = Utf8               CombatAI.java
  #39 = Utf8               EnclosingMethod
  #40 = Class              #41            // ext/mods/fakeplayer/ai/CombatAI
  #41 = Utf8               ext/mods/fakeplayer/ai/CombatAI
  #42 = Utf8               NestHost
  #43 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/fakeplayer/model/SpellUsageCondition.values:()[Lext/mods/fakeplayer/model/SpellUsageCondition;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
        12: getstatic     #13                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
        15: invokevirtual #17                 // Method ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
        27: getstatic     #23                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.MISSINGCP:Lext/mods/fakeplayer/model/SpellUsageCondition;
        30: invokevirtual #17                 // Method ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
        42: getstatic     #26                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
        45: invokevirtual #17                 // Method ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 357: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 6
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "CombatAI.java"
EnclosingMethod: #40.#0                 // ext.mods.fakeplayer.ai.CombatAI
NestHost: class ext/mods/fakeplayer/ai/CombatAI
InnerClasses:
  static #8;                              // class ext/mods/fakeplayer/ai/CombatAI$1
