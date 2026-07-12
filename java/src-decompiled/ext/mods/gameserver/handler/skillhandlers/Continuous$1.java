// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Continuous$1
// File: ext\mods\gameserver\handler\skillhandlers\Continuous$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Continuous$1.class
  Last modified 9 de jul de 2026; size 905 bytes
  MD5 checksum 01f06dbd758b0f4aa194dc8a4b0c95d9
  Compiled from "Continuous.java"
class ext.mods.gameserver.handler.skillhandlers.Continuous$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/handler/skillhandlers/Continuous$1
  super_class: #32                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/skills/SkillType.values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #2 = Class              #4             // ext/mods/gameserver/enums/skills/SkillType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/skills/SkillType;
   #4 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/handler/skillhandlers/Continuous$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #8 = Class              #10            // ext/mods/gameserver/handler/skillhandlers/Continuous$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #10 = Utf8               ext/mods/gameserver/handler/skillhandlers/Continuous$1
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
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/skills/SkillType.HOT:Lext/mods/gameserver/enums/skills/SkillType;
  #24 = NameAndType        #25:#16        // HOT:Lext/mods/gameserver/enums/skills/SkillType;
  #25 = Utf8               HOT
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/skills/SkillType.MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #27 = NameAndType        #28:#16        // MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Utf8               MPHOT
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/skills/SkillType.FEAR:Lext/mods/gameserver/enums/skills/SkillType;
  #30 = NameAndType        #31:#16        // FEAR:Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Utf8               FEAR
  #32 = Class              #33            // java/lang/Object
  #33 = Utf8               java/lang/Object
  #34 = Utf8               <clinit>
  #35 = Utf8               ()V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               StackMapTable
  #40 = Utf8               SourceFile
  #41 = Utf8               Continuous.java
  #42 = Utf8               EnclosingMethod
  #43 = Class              #44            // ext/mods/gameserver/handler/skillhandlers/Continuous
  #44 = Utf8               ext/mods/gameserver/handler/skillhandlers/Continuous
  #45 = Utf8               NestHost
  #46 = Utf8               InnerClasses
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
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/SkillType.HOT:Lext/mods/gameserver/enums/skills/SkillType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/skills/SkillType.MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/skills/SkillType.FEAR:Lext/mods/gameserver/enums/skills/SkillType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
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
        line 91: 0
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
SourceFile: "Continuous.java"
EnclosingMethod: #43.#0                 // ext.mods.gameserver.handler.skillhandlers.Continuous
NestHost: class ext/mods/gameserver/handler/skillhandlers/Continuous
InnerClasses:
  static #8;                              // class ext/mods/gameserver/handler/skillhandlers/Continuous$1
