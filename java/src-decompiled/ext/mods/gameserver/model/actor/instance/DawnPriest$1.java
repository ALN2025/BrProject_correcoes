// Bytecode for: ext.mods.gameserver.model.actor.instance.DawnPriest$1
// File: ext\mods\gameserver\model\actor\instance\DawnPriest$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/DawnPriest$1.class
  Last modified 9 de jul de 2026; size 785 bytes
  MD5 checksum 4b605d12e4bed183a8e70c6e8674f65b
  Compiled from "DawnPriest.java"
class ext.mods.gameserver.model.actor.instance.DawnPriest$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/DawnPriest$1
  super_class: #26                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
   #2 = Class              #4             // ext/mods/gameserver/enums/CabalType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/CabalType;
   #4 = Utf8               ext/mods/gameserver/enums/CabalType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/CabalType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/instance/DawnPriest$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/DawnPriest$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/DawnPriest$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #14 = NameAndType        #15:#16        // DAWN:Lext/mods/gameserver/enums/CabalType;
  #15 = Utf8               DAWN
  #16 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #24 = NameAndType        #25:#16        // DUSK:Lext/mods/gameserver/enums/CabalType;
  #25 = Utf8               DUSK
  #26 = Class              #27            // java/lang/Object
  #27 = Utf8               java/lang/Object
  #28 = Utf8               <clinit>
  #29 = Utf8               ()V
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               StackMapTable
  #34 = Utf8               SourceFile
  #35 = Utf8               DawnPriest.java
  #36 = Utf8               EnclosingMethod
  #37 = Class              #38            // ext/mods/gameserver/model/actor/instance/DawnPriest
  #38 = Utf8               ext/mods/gameserver/model/actor/instance/DawnPriest
  #39 = Utf8               NestHost
  #40 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$CabalType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 4
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "DawnPriest.java"
EnclosingMethod: #37.#0                 // ext.mods.gameserver.model.actor.instance.DawnPriest
NestHost: class ext/mods/gameserver/model/actor/instance/DawnPriest
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/instance/DawnPriest$1
