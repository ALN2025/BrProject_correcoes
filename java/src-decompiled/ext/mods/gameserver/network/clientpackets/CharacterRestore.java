// Bytecode for: ext.mods.gameserver.network.clientpackets.CharacterRestore
// File: ext\mods\gameserver\network\clientpackets\CharacterRestore.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/CharacterRestore.class
  Last modified 9 de jul de 2026; size 1679 bytes
  MD5 checksum 073daa11a75fd19f2105174433c28b5e
  Compiled from "CharacterRestore.java"
public final class ext.mods.gameserver.network.clientpackets.CharacterRestore extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/CharacterRestore
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/CharacterRestore.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/CharacterRestore
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/CharacterRestore
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/CharacterRestore._slot:I
  #14 = NameAndType        #15:#16        // _slot:I
  #15 = Utf8               _slot
  #16 = Utf8               I
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/CharacterRestore.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/enums/FloodProtector.CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
  #24 = Class              #26            // ext/mods/gameserver/enums/FloodProtector
  #25 = NameAndType        #27:#28        // CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
  #26 = Utf8               ext/mods/gameserver/enums/FloodProtector
  #27 = Utf8               CHARACTER_SELECT
  #28 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
  #29 = Methodref          #21.#30        // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #30 = NameAndType        #31:#32        // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #31 = Utf8               performAction
  #32 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
  #33 = Methodref          #21.#34        // ext/mods/gameserver/network/GameClient.markRestoredChar:(I)V
  #34 = NameAndType        #35:#36        // markRestoredChar:(I)V
  #35 = Utf8               markRestoredChar
  #36 = Utf8               (I)V
  #37 = Class              #38            // ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #38 = Utf8               ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #39 = Methodref          #21.#40        // ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
  #40 = NameAndType        #41:#42        // getAccountName:()Ljava/lang/String;
  #41 = Utf8               getAccountName
  #42 = Utf8               ()Ljava/lang/String;
  #43 = Methodref          #21.#44        // ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #44 = NameAndType        #45:#46        // getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #45 = Utf8               getSessionId
  #46 = Utf8               ()Lext/mods/gameserver/network/SessionKey;
  #47 = Fieldref           #48.#49        // ext/mods/gameserver/network/SessionKey.playOkID1:I
  #48 = Class              #50            // ext/mods/gameserver/network/SessionKey
  #49 = NameAndType        #51:#16        // playOkID1:I
  #50 = Utf8               ext/mods/gameserver/network/SessionKey
  #51 = Utf8               playOkID1
  #52 = Methodref          #37.#53        // ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;II)V
  #53 = NameAndType        #5:#54         // "<init>":(Ljava/lang/String;II)V
  #54 = Utf8               (Ljava/lang/String;II)V
  #55 = Methodref          #8.#56         // ext/mods/gameserver/network/clientpackets/CharacterRestore.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #56 = NameAndType        #57:#58        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #57 = Utf8               sendPacket
  #58 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #59 = Methodref          #37.#60        // ext/mods/gameserver/network/serverpackets/CharSelectInfo.getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
  #60 = NameAndType        #61:#62        // getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
  #61 = Utf8               getCharacterSlots
  #62 = Utf8               ()[Lext/mods/gameserver/model/CharSelectSlot;
  #63 = Methodref          #21.#64        // ext/mods/gameserver/network/GameClient.setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
  #64 = NameAndType        #65:#66        // setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
  #65 = Utf8               setCharSelectSlot
  #66 = Utf8               ([Lext/mods/gameserver/model/CharSelectSlot;)V
  #67 = Utf8               Code
  #68 = Utf8               LineNumberTable
  #69 = Utf8               LocalVariableTable
  #70 = Utf8               this
  #71 = Utf8               Lext/mods/gameserver/network/clientpackets/CharacterRestore;
  #72 = Utf8               readImpl
  #73 = Utf8               runImpl
  #74 = Utf8               csi
  #75 = Utf8               Lext/mods/gameserver/network/serverpackets/CharSelectInfo;
  #76 = Utf8               StackMapTable
  #77 = Utf8               SourceFile
  #78 = Utf8               CharacterRestore.java
{
  public ext.mods.gameserver.network.clientpackets.CharacterRestore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/CharacterRestore;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _slot:I
         8: return
      LineNumberTable:
        line 30: 0
        line 31: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/CharacterRestore;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: getstatic     #23                 // Field ext/mods/gameserver/enums/FloodProtector.CHARACTER_SELECT:Lext/mods/gameserver/enums/FloodProtector;
        10: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        13: ifne          17
        16: return
        17: aload_0
        18: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        21: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
        24: aload_0
        25: getfield      #13                 // Field _slot:I
        28: invokevirtual #33                 // Method ext/mods/gameserver/network/GameClient.markRestoredChar:(I)V
        31: new           #37                 // class ext/mods/gameserver/network/serverpackets/CharSelectInfo
        34: dup
        35: aload_0
        36: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        39: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
        42: invokevirtual #39                 // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
        45: aload_0
        46: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        49: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
        52: invokevirtual #43                 // Method ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
        55: getfield      #47                 // Field ext/mods/gameserver/network/SessionKey.playOkID1:I
        58: iconst_0
        59: invokespecial #52                 // Method ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;II)V
        62: astore_1
        63: aload_0
        64: aload_1
        65: invokevirtual #55                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        68: aload_0
        69: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        72: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
        75: aload_1
        76: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/CharSelectInfo.getCharacterSlots:()[Lext/mods/gameserver/model/CharSelectSlot;
        79: invokevirtual #63                 // Method ext/mods/gameserver/network/GameClient.setCharSelectSlot:([Lext/mods/gameserver/model/CharSelectSlot;)V
        82: return
      LineNumberTable:
        line 36: 0
        line 37: 16
        line 39: 17
        line 41: 31
        line 42: 63
        line 43: 68
        line 44: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      83     0  this   Lext/mods/gameserver/network/clientpackets/CharacterRestore;
           63      20     1   csi   Lext/mods/gameserver/network/serverpackets/CharSelectInfo;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
}
SourceFile: "CharacterRestore.java"
