// Bytecode for: ext.mods.gameserver.model.actor.container.player.Punishment$1
// File: ext\mods\gameserver\model\actor\container\player\Punishment$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/Punishment$1.class
  Last modified 9 de jul de 2026; size 955 bytes
  MD5 checksum c504c9e281a50a23dddb6d2895b886cf
  Compiled from "Punishment.java"
class ext.mods.gameserver.model.actor.container.player.Punishment$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/model/actor/container/player/Punishment$1
  super_class: #35                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/PunishmentType.values:()[Lext/mods/gameserver/enums/PunishmentType;
   #2 = Class              #4             // ext/mods/gameserver/enums/PunishmentType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/PunishmentType;
   #4 = Utf8               ext/mods/gameserver/enums/PunishmentType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/PunishmentType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/actor/container/player/Punishment$1.$SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
   #8 = Class              #10            // ext/mods/gameserver/model/actor/container/player/Punishment$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
  #10 = Utf8               ext/mods/gameserver/model/actor/container/player/Punishment$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$PunishmentType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/PunishmentType.CHAT:Lext/mods/gameserver/enums/PunishmentType;
  #14 = NameAndType        #15:#16        // CHAT:Lext/mods/gameserver/enums/PunishmentType;
  #15 = Utf8               CHAT
  #16 = Utf8               Lext/mods/gameserver/enums/PunishmentType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/PunishmentType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #24 = NameAndType        #25:#16        // JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #25 = Utf8               JAIL
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
  #27 = NameAndType        #28:#16        // NONE:Lext/mods/gameserver/enums/PunishmentType;
  #28 = Utf8               NONE
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/PunishmentType.CHAR:Lext/mods/gameserver/enums/PunishmentType;
  #30 = NameAndType        #31:#16        // CHAR:Lext/mods/gameserver/enums/PunishmentType;
  #31 = Utf8               CHAR
  #32 = Fieldref           #2.#33         // ext/mods/gameserver/enums/PunishmentType.ACC:Lext/mods/gameserver/enums/PunishmentType;
  #33 = NameAndType        #34:#16        // ACC:Lext/mods/gameserver/enums/PunishmentType;
  #34 = Utf8               ACC
  #35 = Class              #36            // java/lang/Object
  #36 = Utf8               java/lang/Object
  #37 = Utf8               <clinit>
  #38 = Utf8               ()V
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               StackMapTable
  #43 = Utf8               SourceFile
  #44 = Utf8               Punishment.java
  #45 = Utf8               EnclosingMethod
  #46 = Class              #47            // ext/mods/gameserver/model/actor/container/player/Punishment
  #47 = Utf8               ext/mods/gameserver/model/actor/container/player/Punishment
  #48 = Utf8               NestHost
  #49 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$PunishmentType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/PunishmentType.values:()[Lext/mods/gameserver/enums/PunishmentType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/PunishmentType.CHAT:Lext/mods/gameserver/enums/PunishmentType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/PunishmentType.CHAR:Lext/mods/gameserver/enums/PunishmentType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
        63: iconst_4
        64: iastore
        65: goto          69
        68: astore_0
        69: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
        72: getstatic     #32                 // Field ext/mods/gameserver/enums/PunishmentType.ACC:Lext/mods/gameserver/enums/PunishmentType;
        75: invokevirtual #17                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
        78: iconst_5
        79: iastore
        80: goto          84
        83: astore_0
        84: return
      Exception table:
         from    to  target type
             9    20    23   Class java/lang/NoSuchFieldError
            24    35    38   Class java/lang/NoSuchFieldError
            39    50    53   Class java/lang/NoSuchFieldError
            54    65    68   Class java/lang/NoSuchFieldError
            69    80    83   Class java/lang/NoSuchFieldError
      LineNumberTable:
        line 82: 0
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
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/NoSuchFieldError ]
        frame_type = 0 /* same */
}
SourceFile: "Punishment.java"
EnclosingMethod: #46.#0                 // ext.mods.gameserver.model.actor.container.player.Punishment
NestHost: class ext/mods/gameserver/model/actor/container/player/Punishment
InnerClasses:
  static #8;                              // class ext/mods/gameserver/model/actor/container/player/Punishment$1
