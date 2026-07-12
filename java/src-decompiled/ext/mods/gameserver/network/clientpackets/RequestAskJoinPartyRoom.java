// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAskJoinPartyRoom
// File: ext\mods\gameserver\network\clientpackets\RequestAskJoinPartyRoom.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom.class
  Last modified 9 de jul de 2026; size 2185 bytes
  MD5 checksum d0e2772479f0c5274027c5f373686bc3
  Compiled from "RequestAskJoinPartyRoom.java"
public class ext.mods.gameserver.network.clientpackets.RequestAskJoinPartyRoom extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom.readS:()Ljava/lang/String;
   #8 = Class              #10            // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom
   #9 = NameAndType        #11:#12        // readS:()Ljava/lang/String;
  #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom
  #11 = Utf8               readS
  #12 = Utf8               ()Ljava/lang/String;
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom._targetName:Ljava/lang/String;
  #14 = NameAndType        #15:#16        // _targetName:Ljava/lang/String;
  #15 = Utf8               _targetName
  #16 = Utf8               Ljava/lang/String;
  #17 = Methodref          #8.#18         // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #18 = NameAndType        #19:#20        // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #19 = Utf8               getClient
  #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #21 = Class              #22            // ext/mods/gameserver/network/GameClient
  #22 = Utf8               ext/mods/gameserver/network/GameClient
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #28 = Class              #30            // ext/mods/gameserver/model/World
  #29 = NameAndType        #31:#32        // getInstance:()Lext/mods/gameserver/model/World;
  #30 = Utf8               ext/mods/gameserver/model/World
  #31 = Utf8               getInstance
  #32 = Utf8               ()Lext/mods/gameserver/model/World;
  #33 = Methodref          #28.#34        // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #34 = NameAndType        #25:#35        // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #35 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #36 = Methodref          #37.#38        // ext/mods/gameserver/model/actor/Player.isProcessingRequest:()Z
  #37 = Class              #39            // ext/mods/gameserver/model/actor/Player
  #38 = NameAndType        #40:#41        // isProcessingRequest:()Z
  #39 = Utf8               ext/mods/gameserver/model/actor/Player
  #40 = Utf8               isProcessingRequest
  #41 = Utf8               ()Z
  #42 = Methodref          #37.#43        // ext/mods/gameserver/model/actor/Player.onTransactionRequest:(Lext/mods/gameserver/model/actor/Player;)V
  #43 = NameAndType        #44:#45        // onTransactionRequest:(Lext/mods/gameserver/model/actor/Player;)V
  #44 = Utf8               onTransactionRequest
  #45 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #46 = Class              #47            // ext/mods/gameserver/network/serverpackets/ExAskJoinPartyRoom
  #47 = Utf8               ext/mods/gameserver/network/serverpackets/ExAskJoinPartyRoom
  #48 = Methodref          #37.#49        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #49 = NameAndType        #50:#12        // getName:()Ljava/lang/String;
  #50 = Utf8               getName
  #51 = Methodref          #46.#52        // ext/mods/gameserver/network/serverpackets/ExAskJoinPartyRoom."<init>":(Ljava/lang/String;)V
  #52 = NameAndType        #5:#53         // "<init>":(Ljava/lang/String;)V
  #53 = Utf8               (Ljava/lang/String;)V
  #54 = Methodref          #37.#55        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #55 = NameAndType        #56:#57        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #56 = Utf8               sendPacket
  #57 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #58 = Fieldref           #59.#60        // ext/mods/gameserver/network/SystemMessageId.S1_IS_BUSY_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
  #59 = Class              #61            // ext/mods/gameserver/network/SystemMessageId
  #60 = NameAndType        #62:#63        // S1_IS_BUSY_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
  #61 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #62 = Utf8               S1_IS_BUSY_TRY_LATER
  #63 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #64 = Methodref          #65.#66        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #65 = Class              #67            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #66 = NameAndType        #68:#69        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #67 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #68 = Utf8               getSystemMessage
  #69 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #70 = Methodref          #65.#71        // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #71 = NameAndType        #72:#73        // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #72 = Utf8               addCharName
  #73 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #74 = Fieldref           #59.#75        // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #75 = NameAndType        #76:#63        // TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #76 = Utf8               TARGET_IS_NOT_FOUND_IN_THE_GAME
  #77 = Methodref          #37.#78        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #78 = NameAndType        #56:#79        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #79 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #80 = Utf8               Code
  #81 = Utf8               LineNumberTable
  #82 = Utf8               LocalVariableTable
  #83 = Utf8               this
  #84 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom;
  #85 = Utf8               readImpl
  #86 = Utf8               runImpl
  #87 = Utf8               player
  #88 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #89 = Utf8               target
  #90 = Utf8               StackMapTable
  #91 = Utf8               SourceFile
  #92 = Utf8               RequestAskJoinPartyRoom.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAskJoinPartyRoom();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom;

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
        line 33: 0
        line 34: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: invokestatic  #27                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        19: aload_0
        20: getfield      #13                 // Field _targetName:Ljava/lang/String;
        23: invokevirtual #33                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
        26: astore_2
        27: aload_2
        28: ifnull        78
        31: aload_2
        32: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.isProcessingRequest:()Z
        35: ifne          61
        38: aload_1
        39: aload_2
        40: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.onTransactionRequest:(Lext/mods/gameserver/model/actor/Player;)V
        43: aload_2
        44: new           #46                 // class ext/mods/gameserver/network/serverpackets/ExAskJoinPartyRoom
        47: dup
        48: aload_1
        49: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        52: invokespecial #51                 // Method ext/mods/gameserver/network/serverpackets/ExAskJoinPartyRoom."<init>":(Ljava/lang/String;)V
        55: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: goto          85
        61: aload_1
        62: getstatic     #58                 // Field ext/mods/gameserver/network/SystemMessageId.S1_IS_BUSY_TRY_LATER:Lext/mods/gameserver/network/SystemMessageId;
        65: invokestatic  #64                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        68: aload_2
        69: invokevirtual #70                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: goto          85
        78: aload_1
        79: getstatic     #74                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        82: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        85: return
      LineNumberTable:
        line 39: 0
        line 40: 11
        line 41: 15
        line 43: 16
        line 44: 27
        line 46: 31
        line 48: 38
        line 49: 43
        line 52: 61
        line 55: 78
        line 56: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom;
           11      75     1 player   Lext/mods/gameserver/model/actor/Player;
           27      59     2 target   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 16 /* same */
        frame_type = 6 /* same */
}
SourceFile: "RequestAskJoinPartyRoom.java"
