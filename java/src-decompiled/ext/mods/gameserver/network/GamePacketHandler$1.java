// Bytecode for: ext.mods.gameserver.network.GamePacketHandler$1
// File: ext\mods\gameserver\network\GamePacketHandler$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/GamePacketHandler$1.class
  Last modified 9 de jul de 2026; size 1030 bytes
  MD5 checksum 031fc69952d8327837831deb9b11e861
  Compiled from "GamePacketHandler.java"
class ext.mods.gameserver.network.GamePacketHandler$1
  minor version: 0
  major version: 69
  flags: (0x1020) ACC_SUPER, ACC_SYNTHETIC
  this_class: #8                          // ext/mods/gameserver/network/GamePacketHandler$1
  super_class: #32                        // java/lang/Object
  interfaces: 0, fields: 1, methods: 1, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/GameClient$GameClientState.values:()[Lext/mods/gameserver/network/GameClient$GameClientState;
   #2 = Class              #4             // ext/mods/gameserver/network/GameClient$GameClientState
   #3 = NameAndType        #5:#6          // values:()[Lext/mods/gameserver/network/GameClient$GameClientState;
   #4 = Utf8               ext/mods/gameserver/network/GameClient$GameClientState
   #5 = Utf8               values
   #6 = Utf8               ()[Lext/mods/gameserver/network/GameClient$GameClientState;
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/network/GamePacketHandler$1.$SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
   #8 = Class              #10            // ext/mods/gameserver/network/GamePacketHandler$1
   #9 = NameAndType        #11:#12        // $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
  #10 = Utf8               ext/mods/gameserver/network/GamePacketHandler$1
  #11 = Utf8               $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState
  #12 = Utf8               [I
  #13 = Fieldref           #2.#14         // ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
  #14 = NameAndType        #15:#16        // CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
  #15 = Utf8               CONNECTED
  #16 = Utf8               Lext/mods/gameserver/network/GameClient$GameClientState;
  #17 = Methodref          #2.#18         // ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
  #18 = NameAndType        #19:#20        // ordinal:()I
  #19 = Utf8               ordinal
  #20 = Utf8               ()I
  #21 = Class              #22            // java/lang/NoSuchFieldError
  #22 = Utf8               java/lang/NoSuchFieldError
  #23 = Fieldref           #2.#24         // ext/mods/gameserver/network/GameClient$GameClientState.AUTHED:Lext/mods/gameserver/network/GameClient$GameClientState;
  #24 = NameAndType        #25:#16        // AUTHED:Lext/mods/gameserver/network/GameClient$GameClientState;
  #25 = Utf8               AUTHED
  #26 = Fieldref           #2.#27         // ext/mods/gameserver/network/GameClient$GameClientState.ENTERING:Lext/mods/gameserver/network/GameClient$GameClientState;
  #27 = NameAndType        #28:#16        // ENTERING:Lext/mods/gameserver/network/GameClient$GameClientState;
  #28 = Utf8               ENTERING
  #29 = Fieldref           #2.#30         // ext/mods/gameserver/network/GameClient$GameClientState.IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
  #30 = NameAndType        #31:#16        // IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
  #31 = Utf8               IN_GAME
  #32 = Class              #33            // java/lang/Object
  #33 = Utf8               java/lang/Object
  #34 = Utf8               <clinit>
  #35 = Utf8               ()V
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               StackMapTable
  #40 = Utf8               SourceFile
  #41 = Utf8               GamePacketHandler.java
  #42 = Utf8               EnclosingMethod
  #43 = Class              #44            // ext/mods/gameserver/network/GamePacketHandler
  #44 = Utf8               ext/mods/gameserver/network/GamePacketHandler
  #45 = Utf8               NestHost
  #46 = Utf8               InnerClasses
  #47 = Class              #48            // ext/mods/gameserver/network/GameClient
  #48 = Utf8               ext/mods/gameserver/network/GameClient
  #49 = Utf8               GameClientState
{
  static final int[] $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState;
    descriptor: [I
    flags: (0x1018) ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: invokestatic  #1                  // Method ext/mods/gameserver/network/GameClient$GameClientState.values:()[Lext/mods/gameserver/network/GameClient$GameClientState;
         3: arraylength
         4: newarray       int
         6: putstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
         9: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
        12: getstatic     #13                 // Field ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
        15: invokevirtual #17                 // Method ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
        18: iconst_1
        19: iastore
        20: goto          24
        23: astore_0
        24: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
        27: getstatic     #23                 // Field ext/mods/gameserver/network/GameClient$GameClientState.AUTHED:Lext/mods/gameserver/network/GameClient$GameClientState;
        30: invokevirtual #17                 // Method ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
        33: iconst_2
        34: iastore
        35: goto          39
        38: astore_0
        39: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
        42: getstatic     #26                 // Field ext/mods/gameserver/network/GameClient$GameClientState.ENTERING:Lext/mods/gameserver/network/GameClient$GameClientState;
        45: invokevirtual #17                 // Method ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
        48: iconst_3
        49: iastore
        50: goto          54
        53: astore_0
        54: getstatic     #7                  // Field $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
        57: getstatic     #29                 // Field ext/mods/gameserver/network/GameClient$GameClientState.IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
        60: invokevirtual #17                 // Method ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
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
        line 54: 0
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
SourceFile: "GamePacketHandler.java"
EnclosingMethod: #43.#0                 // ext.mods.gameserver.network.GamePacketHandler
NestHost: class ext/mods/gameserver/network/GamePacketHandler
InnerClasses:
  public static final #49= #2 of #47;     // GameClientState=class ext/mods/gameserver/network/GameClient$GameClientState of class ext/mods/gameserver/network/GameClient
  static #8;                              // class ext/mods/gameserver/network/GamePacketHandler$1
