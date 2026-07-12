// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestChangePartyLeader
// File: ext\mods\gameserver\network\clientpackets\RequestChangePartyLeader.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader.class
  Last modified 9 de jul de 2026; size 1599 bytes
  MD5 checksum 618edea08f15d31be2243b5d19d9399d
  Compiled from "RequestChangePartyLeader.java"
public final class ext.mods.gameserver.network.clientpackets.RequestChangePartyLeader extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader.readS:()Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader
   #9 = NameAndType        #11:#12        // readS:()Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader
  #11 = Utf8               readS
  #12 = Utf8               ()Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader._targetName:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // _targetName:Ljava/lang/String;
  #15 = Utf8               _targetName
  #16 = Utf8               Ljava/lang/String;
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #28 = Class              #30            // ext/mods/gameserver/model/actor/Player
  #29 = NameAndType        #31:#32        // getParty:()Lext/mods/gameserver/model/group/Party;
  #30 = Utf8               ext/mods/gameserver/model/actor/Player
  #31 = Utf8               getParty
  #32 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #33 = Methodref          #34.#35        // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #34 = Class              #36            // ext/mods/gameserver/model/group/Party
  #35 = NameAndType        #37:#38        // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #36 = Utf8               ext/mods/gameserver/model/group/Party
  #37 = Utf8               isLeader
  #38 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #39 = Fieldref           #40.#41        // ext/mods/gameserver/network/SystemMessageId.ONLY_A_PARTY_LEADER_CAN_TRANSFER_ONES_RIGHTS_TO_ANOTHER_PLAYER:Lext/mods/gameserver/network/SystemMessageId;
  #40 = Class              #42            // ext/mods/gameserver/network/SystemMessageId
  #41 = NameAndType        #43:#44        // ONLY_A_PARTY_LEADER_CAN_TRANSFER_ONES_RIGHTS_TO_ANOTHER_PLAYER:Lext/mods/gameserver/network/SystemMessageId;
  #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #43 = Utf8               ONLY_A_PARTY_LEADER_CAN_TRANSFER_ONES_RIGHTS_TO_ANOTHER_PLAYER
  #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #45 = Methodref          #28.#46        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #46 = NameAndType        #47:#48        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #47 = Utf8               sendPacket
  #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #49 = Methodref          #34.#50        // ext/mods/gameserver/model/group/Party.changePartyLeader:(Ljava/lang/String;)V
  #50 = NameAndType        #51:#52        // changePartyLeader:(Ljava/lang/String;)V
  #51 = Utf8               changePartyLeader
  #52 = Utf8               (Ljava/lang/String;)V
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestChangePartyLeader;
  #58 = Utf8               readImpl
  #59 = Utf8               runImpl
  #60 = Utf8               player
  #61 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #62 = Utf8               party
  #63 = Utf8               Lext/mods/gameserver/model/group/Party;
  #64 = Utf8               StackMapTable
  #65 = Utf8               SourceFile
  #66 = Utf8               RequestChangePartyLeader.java
{
  public ext.mods.gameserver.network.clientpackets.RequestChangePartyLeader();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangePartyLeader;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readS:()Ljava/lang/String;
         5: putfield      #13                 // Field _targetName:Ljava/lang/String;
         8: return
      LineNumberTable:
        line 31: 0
        line 32: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangePartyLeader;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        20: astore_2
        21: aload_2
        22: ifnull        33
        25: aload_2
        26: aload_1
        27: invokevirtual #33                 // Method ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        30: ifne          41
        33: aload_1
        34: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.ONLY_A_PARTY_LEADER_CAN_TRANSFER_ONES_RIGHTS_TO_ANOTHER_PLAYER:Lext/mods/gameserver/network/SystemMessageId;
        37: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        40: return
        41: aload_2
        42: aload_0
        43: getfield      #13                 // Field _targetName:Ljava/lang/String;
        46: invokevirtual #49                 // Method ext/mods/gameserver/model/group/Party.changePartyLeader:(Ljava/lang/String;)V
        49: return
      LineNumberTable:
        line 37: 0
        line 38: 11
        line 39: 15
        line 41: 16
        line 42: 21
        line 44: 33
        line 45: 40
        line 48: 41
        line 49: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/network/clientpackets/RequestChangePartyLeader;
           11      39     1 player   Lext/mods/gameserver/model/actor/Player;
           21      29     2 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/group/Party ]
        frame_type = 7 /* same */
}
SourceFile: "RequestChangePartyLeader.java"
