// Bytecode for: ext.mods.gameserver.network.clientpackets.Appearing
// File: ext\mods\gameserver\network\clientpackets\Appearing.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/Appearing.class
  Last modified 9 de jul de 2026; size 1233 bytes
  MD5 checksum eeecfd9e4fafde8550d794d5b93f904d
  Compiled from "Appearing.java"
public final class ext.mods.gameserver.network.clientpackets.Appearing extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/Appearing
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/Appearing.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/Appearing
   #9 = NameAndType        #11:#12        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/Appearing
  #11 = Utf8               getClient
  #12 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #13 = Class              #14            // ext/mods/gameserver/network/GameClient
  #14 = Utf8               ext/mods/gameserver/network/GameClient
  #15 = Methodref          #13.#16        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #16 = NameAndType        #17:#18        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #17 = Utf8               getPlayer
  #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #19 = Methodref          #20.#21        // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #20 = Class              #22            // ext/mods/gameserver/model/actor/Player
  #21 = NameAndType        #23:#24        // isTeleporting:()Z
  #22 = Utf8               ext/mods/gameserver/model/actor/Player
  #23 = Utf8               isTeleporting
  #24 = Utf8               ()Z
  #25 = Methodref          #20.#26        // ext/mods/gameserver/model/actor/Player.onTeleported:()V
  #26 = NameAndType        #27:#6         // onTeleported:()V
  #27 = Utf8               onTeleported
  #28 = Class              #29            // ext/mods/gameserver/network/serverpackets/UserInfo
  #29 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #30 = Methodref          #28.#31        // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #31 = NameAndType        #5:#32         // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #32 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #33 = Methodref          #8.#34         // ext/mods/gameserver/network/clientpackets/Appearing.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #34 = NameAndType        #35:#36        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #35 = Utf8               sendPacket
  #36 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/gameserver/network/clientpackets/Appearing;
  #42 = Utf8               readImpl
  #43 = Utf8               runImpl
  #44 = Utf8               player
  #45 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #46 = Utf8               StackMapTable
  #47 = Utf8               triggersOnActionRequest
  #48 = Utf8               SourceFile
  #49 = Utf8               Appearing.java
{
  public ext.mods.gameserver.network.clientpackets.Appearing();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/Appearing;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/Appearing;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #13                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #15                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
        20: ifeq          27
        23: aload_1
        24: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.onTeleported:()V
        27: aload_0
        28: new           #28                 // class ext/mods/gameserver/network/serverpackets/UserInfo
        31: dup
        32: aload_1
        33: invokespecial #30                 // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        36: invokevirtual #33                 // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        39: return
      LineNumberTable:
        line 33: 0
        line 34: 11
        line 35: 15
        line 37: 16
        line 38: 23
        line 40: 27
        line 41: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/network/clientpackets/Appearing;
           11      29     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */

  protected boolean triggersOnActionRequest();
    descriptor: ()Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/network/clientpackets/Appearing;
}
SourceFile: "Appearing.java"
