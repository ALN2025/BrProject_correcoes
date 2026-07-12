// Bytecode for: ext.mods.gameserver.model.actor.instance.CastleChamberlain$1
// File: ext\mods\gameserver\model\actor\instance\CastleChamberlain$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.class
  Last modified 9 de jul de 2026; size 1205 bytes
  MD5 checksum a6fc8ce74efe7c545dc92156f8481951
  Compiled from "CastleChamberlain.java"
class ext.mods.gameserver.model.actor.instance.CastleChamberlain$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
  super_class: #45                        // java/lang/Object
  interfaces: 0, fields: 2, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/actors/NpcTalkCond.values:()[Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #2 = Class              #4             // ext/mods/gameserver/enums/actors/NpcTalkCond
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #4 = Utf8               ext/mods/gameserver/enums/actors/NpcTalkCond
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/actors/NpcTalkCond;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #14 = NameAndType        #15:#16        // NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #15 = Utf8               NONE
  #16 = Utf8               Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #24 = NameAndType        #25:#16        // UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
  #25 = Utf8               UNDER_SIEGE
  #26 = Methodref          #27.#28        // ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
  #27 = Class              #29            // ext/mods/gameserver/enums/CabalType
  #28 = NameAndType        #5:#30         // values:()[Lext/mods/gameserver/enums/CabalType;
  #29 = Utf8               ext/mods/gameserver/enums/CabalType
  #30 = Utf8               ()[Lext/mods/gameserver/enums/CabalType;
  #31 = Fieldref           #8.#32         // ext/mods/gameserver/model/actor/instance/CastleChamberlain$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #32 = NameAndType        #33:#12        // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #33 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
  #34 = Fieldref           #27.#35        // ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
  #35 = NameAndType        #36:#37        // NORMAL:Lext/mods/gameserver/enums/CabalType;
  #36 = Utf8               NORMAL
  #37 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #38 = Methodref          #27.#18        // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #39 = Fieldref           #27.#40        // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #40 = NameAndType        #41:#37        // DAWN:Lext/mods/gameserver/enums/CabalType;
  #41 = Utf8               DAWN
  #42 = Fieldref           #27.#43        // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #43 = NameAndType        #44:#37        // DUSK:Lext/mods/gameserver/enums/CabalType;
  #44 = Utf8               DUSK
  #45 = Class              #46            // java/lang/Object
  #46 = Utf8               java/lang/Object
  #47 = Utf8               <clinit>
  #48 = Utf8               ()V
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               StackMapTable
  #53 = Utf8               SourceFile
  #54 = Utf8               CastleChamberlain.java
  #55 = Utf8               EnclosingMethod
  #56 = Class              #57            // ext/mods/gameserver/model/actor/instance/CastleChamberlain
  #57 = Utf8               ext/mods/gameserver/model/actor/instance/CastleChamberlain
  #58 = Utf8               NestHost
  #59 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$CabalType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static final int[] $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/actors/NpcTalkCond.values:()[Lext/mods/gameserver/enums/actors/NpcTalkCond;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.NONE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$NpcTalkCond:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/actors/NpcTalkCond.UNDER_SIEGE:Lext/mods/gameserver/enums/actors/NpcTalkCond;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/actors/NpcTalkCond.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: invokestatic  #26                 // Method ext/mods/gameserver/enums/CabalType.values:()[Lext/mods/gameserver/enums/CabalType;
        42: arraylength
        43: newarray       int
        45: putstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        48: getstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        51: getstatic     #34                 // Field ext/mods/gameserver/enums/CabalType.NORMAL:Lext/mods/gameserver/enums/CabalType;
        54: invokevirtual #38                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        57: iconst_1
        58: iastore
        59: goto          63
        62: astore_0
        63: getstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        66: getstatic     #39                 // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
        69: invokevirtual #38                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        72: iconst_2
        73: iastore
        74: goto          78
        77: astore_0
        78: getstatic     #31                 // Field $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
        81: getstatic     #42                 // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
        84: invokevirtual #38                 // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
        87: iconst_3
        88: iastore
        89: goto          93
        92: astore_0
        93: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            48    59    62   Class java/lang/NoSuchFieldError
            63    74    77   Class java/lang/NoSuchFieldError
            78    89    92   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 1355: 0
        line 830: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
      StackMapTable: number_of_entries = 10
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "CastleChamberlain.java"
EnclosingMethod: #56.#0                 // ext.mods.gameserver.model.actor.instance.CastleChamberlain
NestHost: class ext/mods/gameserver/model/actor/instance/CastleChamberlain
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/instance/CastleChamberlain$1
