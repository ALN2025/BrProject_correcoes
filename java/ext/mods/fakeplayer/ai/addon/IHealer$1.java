// Bytecode for: ext.mods.fakeplayer.ai.addon.IHealer$1
// File: ext\mods\fakeplayer\ai\addon\IHealer$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/addon/IHealer$1.class
  Last modified 9 de jul de 2026; size 756 bytes
  MD5 checksum 92b3b77049ff64fd050a3bbf7a206e43
  Compiled from "IHealer.java"
class ext.mods.fakeplayer.ai.addon.IHealer$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/fakeplayer/ai/addon/IHealer$1
  super_class: #23                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/fakeplayer/model/SpellUsageCondition.values:()[Lext/mods/fakeplayer/model/SpellUsageCondition;
   #2 = Class              #4             // ext/mods/fakeplayer/model/SpellUsageCondition
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/fakeplayer/model/SpellUsageCondition;
   #4 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/fakeplayer/model/SpellUsageCondition;
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/ai/addon/IHealer$1.$SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
   #8 = Class              #10            // ext/mods/fakeplayer/ai/addon/IHealer$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
  #10 = Utf8               ext/mods/fakeplayer/ai/addon/IHealer$1
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
  #23 = Class              #24            // java/lang/Object
  #24 = Utf8               java/lang/Object
  #25 = Utf8               <clinit>
  #26 = Utf8               ()V
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               StackMapTable
  #31 = Utf8               SourceFile
  #32 = Utf8               IHealer.java
  #33 = Utf8               EnclosingMethod
  #34 = Class              #35            // ext/mods/fakeplayer/ai/addon/IHealer
  #35 = Utf8               ext/mods/fakeplayer/ai/addon/IHealer
  #36 = Utf8               NestHost
  #37 = Utf8               InnerClasses
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
        24: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 2
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "IHealer.java"
EnclosingMethod: #34.#0                 // ext.mods.fakeplayer.ai.addon.IHealer
NestHost: class ext/mods/fakeplayer/ai/addon/IHealer
InnerClasses:
  static #8;                              // class ext/mods/fakeplayer/ai/addon/IHealer$1
