// Bytecode for: ext.mods.gameserver.network.clientpackets.GameGuardReply
// File: ext\mods\gameserver\network\clientpackets\GameGuardReply.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/GameGuardReply.class
  Last modified 9 de jul de 2026; size 917 bytes
  MD5 checksum 423d0a53e6ce03113a13f1db66c3df4e
  Compiled from "GameGuardReply.java"
public class ext.mods.gameserver.network.clientpackets.GameGuardReply extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/GameGuardReply
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/GameGuardReply.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/GameGuardReply
   #9 = NameAndType        #11:#12        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/GameGuardReply
  #11 = Utf8               getClient
  #12 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #13 = Class              #14            // ext/mods/gameserver/network/GameClient
  #14 = Utf8               ext/mods/gameserver/network/GameClient
  #15 = Methodref          #13.#16        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #16 = NameAndType        #17:#18        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #17 = Utf8               getPlayer
  #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #19 = Methodref          #13.#20        // ext/mods/gameserver/network/GameClient.setGameGuardOk:(Z)V
  #20 = NameAndType        #21:#22        // setGameGuardOk:(Z)V
  #21 = Utf8               setGameGuardOk
  #22 = Utf8               (Z)V
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lext/mods/gameserver/network/clientpackets/GameGuardReply;
  #28 = Utf8               readImpl
  #29 = Utf8               runImpl
  #30 = Utf8               player
  #31 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #32 = Utf8               StackMapTable
  #33 = Class              #34            // ext/mods/gameserver/model/actor/Player
  #34 = Utf8               ext/mods/gameserver/model/actor/Player
  #35 = Utf8               SourceFile
  #36 = Utf8               GameGuardReply.java
{
  public ext.mods.gameserver.network.clientpackets.GameGuardReply();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/GameGuardReply;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/GameGuardReply;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #13                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #15                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_0
        17: invokevirtual #7                  // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        20: checkcast     #13                 // class ext/mods/gameserver/network/GameClient
        23: iconst_1
        24: invokevirtual #19                 // Method ext/mods/gameserver/network/GameClient.setGameGuardOk:(Z)V
        27: return
      LineNumberTable:
        line 32: 0
        line 33: 11
        line 34: 15
        line 36: 16
        line 37: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/network/clientpackets/GameGuardReply;
           11      17     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "GameGuardReply.java"
