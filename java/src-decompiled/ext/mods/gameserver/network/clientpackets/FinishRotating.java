// Bytecode for: ext.mods.gameserver.network.clientpackets.FinishRotating
// File: ext\mods\gameserver\network\clientpackets\FinishRotating.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/FinishRotating.class
  Last modified 9 de jul de 2026; size 1347 bytes
  MD5 checksum bb3e2aa05ee6206ad879dbbd0917eecf
  Compiled from "FinishRotating.java"
public final class ext.mods.gameserver.network.clientpackets.FinishRotating extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/FinishRotating
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/FinishRotating.readD:()I
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/FinishRotating
   #9 = NameAndType        #11:#12        // readD:()I
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/FinishRotating
  #11 = Utf8               readD
  #12 = Utf8               ()I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/FinishRotating._degree:I
  #14 = NameAndType        #15:#16        // _degree:I
  #15 = Utf8               _degree
  #16 = Utf8               I
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/FinishRotating.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Class              #28            // ext/mods/gameserver/network/serverpackets/StopRotation
  #28 = Utf8               ext/mods/gameserver/network/serverpackets/StopRotation
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Player
  #31 = NameAndType        #33:#12        // getObjectId:()I
  #32 = Utf8               ext/mods/gameserver/model/actor/Player
  #33 = Utf8               getObjectId
  #34 = Methodref          #27.#35        // ext/mods/gameserver/network/serverpackets/StopRotation."<init>":(III)V
  #35 = NameAndType        #5:#36         // "<init>":(III)V
  #36 = Utf8               (III)V
  #37 = Methodref          #30.#38        // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #38 = NameAndType        #39:#40        // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #39 = Utf8               broadcastPacket
  #40 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #41 = Fieldref           #42.#43        // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #42 = Class              #44            // ext/mods/gameserver/network/serverpackets/ActionFailed
  #43 = NameAndType        #45:#46        // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #44 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #45 = Utf8               STATIC_PACKET
  #46 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #47 = Methodref          #30.#48        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #48 = NameAndType        #49:#40        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #49 = Utf8               sendPacket
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               this
  #54 = Utf8               Lext/mods/gameserver/network/clientpackets/FinishRotating;
  #55 = Utf8               readImpl
  #56 = Utf8               runImpl
  #57 = Utf8               player
  #58 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #59 = Utf8               StackMapTable
  #60 = Utf8               SourceFile
  #61 = Utf8               FinishRotating.java
{
  public ext.mods.gameserver.network.clientpackets.FinishRotating();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/FinishRotating;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _degree:I
         8: aload_0
         9: invokevirtual #7                  // Method readD:()I
        12: pop
        13: return
      LineNumberTable:
        line 31: 0
        line 32: 8
        line 33: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/network/clientpackets/FinishRotating;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: new           #27                 // class ext/mods/gameserver/network/serverpackets/StopRotation
        20: dup
        21: aload_1
        22: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        25: aload_0
        26: getfield      #13                 // Field _degree:I
        29: iconst_0
        30: invokespecial #34                 // Method ext/mods/gameserver/network/serverpackets/StopRotation."<init>":(III)V
        33: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: aload_1
        37: getstatic     #41                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        40: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: return
      LineNumberTable:
        line 38: 0
        line 39: 11
        line 40: 15
        line 42: 16
        line 43: 36
        line 44: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/network/clientpackets/FinishRotating;
           11      33     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
}
SourceFile: "FinishRotating.java"
