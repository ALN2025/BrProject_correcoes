// Bytecode for: ext.mods.gameserver.data.sql.OfflineTradersTable$1
// File: ext\mods\gameserver\data\sql\OfflineTradersTable$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/sql/OfflineTradersTable$1.class
  Last modified 9 de jul de 2026; size 928 bytes
  MD5 checksum d1710a77cbc8439f037f33e50662afe6
  Compiled from "OfflineTradersTable.java"
class ext.mods.gameserver.data.sql.OfflineTradersTable$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/data/sql/OfflineTradersTable$1
  super_class: #32                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/enums/actors/OperateType.values:()[Lext/mods/gameserver/enums/actors/OperateType;
   #2 = Class              #4             // ext/mods/gameserver/enums/actors/OperateType
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/enums/actors/OperateType;
   #4 = Utf8               ext/mods/gameserver/enums/actors/OperateType
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/enums/actors/OperateType;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/data/sql/OfflineTradersTable$1.$SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
   #8 = Class              #10            // ext/mods/gameserver/data/sql/OfflineTradersTable$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
  #10 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$enums$actors$OperateType
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
  #14 = NameAndType        #15:#16        // BUY:Lext/mods/gameserver/enums/actors/OperateType;
  #15 = Utf8               BUY
  #16 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #24 = NameAndType        #25:#16        // SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #25 = Utf8               SELL
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #27 = NameAndType        #28:#16        // PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
  #28 = Utf8               PACKAGE_SELL
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
  #30 = NameAndType        #31:#16        // MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
  #31 = Utf8               MANUFACTURE
  #32 = Class              #33            // java/lang/Object
  #33 = Utf8               java/lang/Object
  #34 = Utf8               <clinit>
  #35 = Utf8               ()V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               StackMapTable
  #40 = Utf8               SourceFile
  #41 = Utf8               OfflineTradersTable.java
  #42 = Utf8               EnclosingMethod
  #43 = Class              #44            // ext/mods/gameserver/data/sql/OfflineTradersTable
  #44 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable
  #45 = Utf8               NestHost
  #46 = Utf8               InnerClasses
{
  static final int[] $SwitchMap$ext$mods$gameserver$enums$actors$OperateType;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/enums/actors/OperateType.values:()[Lext/mods/gameserver/enums/actors/OperateType;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
        15: invokevirtual #17                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
        30: invokevirtual #17                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/enums/actors/OperateType.PACKAGE_SELL:Lext/mods/gameserver/enums/actors/OperateType;
        45: invokevirtual #17                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$enums$actors$OperateType:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
        60: invokevirtual #17                 // Method ext/mods/gameserver/enums/actors/OperateType.ordinal:()I
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
        line 75: 0
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
SourceFile: "OfflineTradersTable.java"
EnclosingMethod: #43.#0                 // ext.mods.gameserver.data.sql.OfflineTradersTable
NestHost: class ext/mods/gameserver/data/sql/OfflineTradersTable
InnerClasses:
  static #8;                              // class ext/mods/gameserver/data/sql/OfflineTradersTable$1
