// Bytecode for: ext.mods.gameserver.data.manager.CastleManorManager$1
// File: ext\mods\gameserver\data\manager\CastleManorManager$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/CastleManorManager$1.class
  Last modified 9 de jul de 2026; size 863 bytes
  MD5 checksum c7a53c4fd60e7f96602d7bde10ef2300
  Compiled from "CastleManorManager.java"
class ext.mods.gameserver.data.manager.CastleManorManager$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/data/manager/CastleManorManager$1
  super_class: #29                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/ManorStatus.values:()[Lext/mods/gameserver/enums/ManorStatus;
   #2 = Class              #4             // ext/mods/gameserver/enums/ManorStatus
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/ManorStatus;
   #4 = Utf8               ext/mods/gameserver/enums/ManorStatus
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/ManorStatus;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/manager/CastleManorManager$1.$SwitchMap$ext$mods$gameserver$enums$ManorStatus:[I
   #8 = Class              #10            // ext/mods/gameserver/data/manager/CastleManorManager$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$ManorStatus:[I
  #10 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$ManorStatus
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/ManorStatus.MODIFIABLE:Lext/mods/gameserver/enums/ManorStatus;
  #14 = NameAndType        #15:#16        // MODIFIABLE:Lext/mods/gameserver/enums/ManorStatus;
  #15 = Utf8               MODIFIABLE
  #16 = Utf8               Lext/mods/gameserver/enums/ManorStatus;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/ManorStatus.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/ManorStatus.MAINTENANCE:Lext/mods/gameserver/enums/ManorStatus;
  #24 = NameAndType        #25:#16        // MAINTENANCE:Lext/mods/gameserver/enums/ManorStatus;
  #25 = Utf8               MAINTENANCE
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/ManorStatus.APPROVED:Lext/mods/gameserver/enums/ManorStatus;
  #27 = NameAndType        #28:#16        // APPROVED:Lext/mods/gameserver/enums/ManorStatus;
  #28 = Utf8               APPROVED
  #29 = Class              #30            // java/lang/Object
  #30 = Utf8               java/lang/Object
  #31 = Utf8               <clinit>
  #32 = Utf8               ()V
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               StackMapTable
  #37 = Utf8               SourceFile
  #38 = Utf8               CastleManorManager.java
  #39 = Utf8               EnclosingMethod
  #40 = Class              #41            // ext/mods/gameserver/data/manager/CastleManorManager
  #41 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
  #42 = Utf8               NestHost
  #43 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$ManorStatus;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/ManorStatus.values:()[Lext/mods/gameserver/enums/ManorStatus;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$ManorStatus:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$ManorStatus:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/ManorStatus.MODIFIABLE:Lext/mods/gameserver/enums/ManorStatus;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/ManorStatus.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$ManorStatus:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/ManorStatus.MAINTENANCE:Lext/mods/gameserver/enums/ManorStatus;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/ManorStatus.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$ManorStatus:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/ManorStatus.APPROVED:Lext/mods/gameserver/enums/ManorStatus;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/ManorStatus.ordinal:()I
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
        line 191: 0
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
SourceFile: "CastleManorManager.java"
EnclosingMethod: #40.#0                 // ext.mods.gameserver.data.manager.CastleManorManager
NestHost: class ext/mods/gameserver/data/manager/CastleManorManager
InnerClasses:
  static #8;                              // class ext/mods/gameserver/data/manager/CastleManorManager$1
