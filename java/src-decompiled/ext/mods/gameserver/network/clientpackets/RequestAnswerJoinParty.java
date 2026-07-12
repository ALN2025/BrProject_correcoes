// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAnswerJoinParty
// File: ext\mods\gameserver\network\clientpackets\RequestAnswerJoinParty.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty.class
  Last modified 9 de jul de 2026; size 2692 bytes
  MD5 checksum e72934b4d9e333302bdbfbc4c6dad42d
  Compiled from "RequestAnswerJoinParty.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAnswerJoinParty extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty._response:I
   #14 = NameAndType        #15:#16       // _response:I
   #15 = Utf8               _response
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#26       // getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getActiveRequester
   #32 = Class              #33           // ext/mods/gameserver/network/serverpackets/JoinParty
   #33 = Utf8               ext/mods/gameserver/network/serverpackets/JoinParty
   #34 = Methodref          #32.#35       // ext/mods/gameserver/network/serverpackets/JoinParty."<init>":(I)V
   #35 = NameAndType        #5:#36        // "<init>":(I)V
   #36 = Utf8               (I)V
   #37 = Methodref          #28.#38       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #38 = NameAndType        #39:#40       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #39 = Utf8               sendPacket
   #40 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #41 = Methodref          #28.#42       // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #42 = NameAndType        #43:#44       // getParty:()Lext/mods/gameserver/model/group/Party;
   #43 = Utf8               getParty
   #44 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #45 = Class              #46           // ext/mods/gameserver/model/group/Party
   #46 = Utf8               ext/mods/gameserver/model/group/Party
   #47 = Methodref          #28.#48       // ext/mods/gameserver/model/actor/Player.getLootRule:()Lext/mods/gameserver/enums/LootRule;
   #48 = NameAndType        #49:#50       // getLootRule:()Lext/mods/gameserver/enums/LootRule;
   #49 = Utf8               getLootRule
   #50 = Utf8               ()Lext/mods/gameserver/enums/LootRule;
   #51 = Methodref          #45.#52       // ext/mods/gameserver/model/group/Party."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/LootRule;)V
   #52 = NameAndType        #5:#53        // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/LootRule;)V
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/LootRule;)V
   #54 = Methodref          #45.#55       // ext/mods/gameserver/model/group/Party.addPartyMember:(Lext/mods/gameserver/model/actor/Player;)V
   #55 = NameAndType        #56:#57       // addPartyMember:(Lext/mods/gameserver/model/actor/Player;)V
   #56 = Utf8               addPartyMember
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #58 = Methodref          #28.#59       // ext/mods/gameserver/model/actor/Player.isInPartyMatchRoom:()Z
   #59 = NameAndType        #60:#61       // isInPartyMatchRoom:()Z
   #60 = Utf8               isInPartyMatchRoom
   #61 = Utf8               ()Z
   #62 = Methodref          #63.#64       // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #63 = Class              #65           // ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #64 = NameAndType        #66:#67       // getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #65 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #66 = Utf8               getInstance
   #67 = Utf8               ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #68 = Methodref          #28.#69       // ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
   #69 = NameAndType        #70:#12       // getPartyRoom:()I
   #70 = Utf8               getPartyRoom
   #71 = Methodref          #63.#72       // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
   #72 = NameAndType        #73:#74       // getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
   #73 = Utf8               getRoom
   #74 = Utf8               (I)Lext/mods/gameserver/model/group/PartyMatchRoom;
   #75 = Class              #76           // ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
   #76 = Utf8               ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
   #77 = Methodref          #75.#78       // ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
   #78 = NameAndType        #5:#79        // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
   #80 = Methodref          #81.#82       // ext/mods/gameserver/model/group/PartyMatchRoom.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = Class              #83           // ext/mods/gameserver/model/group/PartyMatchRoom
   #82 = NameAndType        #84:#40       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #83 = Utf8               ext/mods/gameserver/model/group/PartyMatchRoom
   #84 = Utf8               broadcastPacket
   #85 = Methodref          #81.#86       // ext/mods/gameserver/model/group/PartyMatchRoom.getId:()I
   #86 = NameAndType        #87:#12       // getId:()I
   #87 = Utf8               getId
   #88 = Methodref          #81.#89       // ext/mods/gameserver/model/group/PartyMatchRoom.addMember:(Lext/mods/gameserver/model/actor/Player;I)V
   #89 = NameAndType        #90:#91       // addMember:(Lext/mods/gameserver/model/actor/Player;I)V
   #90 = Utf8               addMember
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #92 = Methodref          #45.#93       // ext/mods/gameserver/model/group/Party.setPendingInvitation:(Z)V
   #93 = NameAndType        #94:#95       // setPendingInvitation:(Z)V
   #94 = Utf8               setPendingInvitation
   #95 = Utf8               (Z)V
   #96 = Methodref          #28.#97       // ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #97 = NameAndType        #98:#57       // setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #98 = Utf8               setActiveRequester
   #99 = Methodref          #28.#100      // ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
  #100 = NameAndType        #101:#6       // onTransactionResponse:()V
  #101 = Utf8               onTransactionResponse
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty;
  #107 = Utf8               readImpl
  #108 = Utf8               runImpl
  #109 = Utf8               room
  #110 = Utf8               Lext/mods/gameserver/model/group/PartyMatchRoom;
  #111 = Utf8               player
  #112 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #113 = Utf8               requestor
  #114 = Utf8               party
  #115 = Utf8               Lext/mods/gameserver/model/group/Party;
  #116 = Utf8               StackMapTable
  #117 = Utf8               SourceFile
  #118 = Utf8               RequestAnswerJoinParty.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAnswerJoinParty();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _response:I
         8: return
      LineNumberTable:
        line 34: 0
        line 35: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
        20: astore_2
        21: aload_2
        22: ifnonnull     26
        25: return
        26: aload_2
        27: new           #32                 // class ext/mods/gameserver/network/serverpackets/JoinParty
        30: dup
        31: aload_0
        32: getfield      #13                 // Field _response:I
        35: invokespecial #34                 // Method ext/mods/gameserver/network/serverpackets/JoinParty."<init>":(I)V
        38: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        41: aload_2
        42: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        45: astore_3
        46: aload_0
        47: getfield      #13                 // Field _response:I
        50: iconst_1
        51: if_icmpne     168
        54: aload_3
        55: ifnonnull     75
        58: new           #45                 // class ext/mods/gameserver/model/group/Party
        61: dup
        62: aload_2
        63: aload_1
        64: aload_2
        65: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getLootRule:()Lext/mods/gameserver/enums/LootRule;
        68: invokespecial #51                 // Method ext/mods/gameserver/model/group/Party."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/LootRule;)V
        71: astore_3
        72: goto          80
        75: aload_3
        76: aload_1
        77: invokevirtual #54                 // Method ext/mods/gameserver/model/group/Party.addPartyMember:(Lext/mods/gameserver/model/actor/Player;)V
        80: aload_2
        81: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.isInPartyMatchRoom:()Z
        84: ifeq          168
        87: invokestatic  #62                 // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
        90: aload_2
        91: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
        94: invokevirtual #71                 // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
        97: astore        4
        99: aload         4
       101: ifnull        168
       104: aload_1
       105: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.isInPartyMatchRoom:()Z
       108: ifeq          141
       111: aload_2
       112: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
       115: aload_1
       116: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
       119: if_icmpne     168
       122: aload         4
       124: new           #75                 // class ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
       127: dup
       128: aload_1
       129: aload         4
       131: iconst_1
       132: invokespecial #77                 // Method ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
       135: invokevirtual #80                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       138: goto          168
       141: aload         4
       143: aload_1
       144: aload         4
       146: invokevirtual #85                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.getId:()I
       149: invokevirtual #88                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.addMember:(Lext/mods/gameserver/model/actor/Player;I)V
       152: aload         4
       154: new           #75                 // class ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
       157: dup
       158: aload_1
       159: aload         4
       161: iconst_1
       162: invokespecial #77                 // Method ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
       165: invokevirtual #80                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       168: aload_3
       169: ifnull        177
       172: aload_3
       173: iconst_0
       174: invokevirtual #92                 // Method ext/mods/gameserver/model/group/Party.setPendingInvitation:(Z)V
       177: aload_1
       178: aconst_null
       179: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
       182: aload_2
       183: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
       186: return
      LineNumberTable:
        line 40: 0
        line 41: 11
        line 42: 15
        line 44: 16
        line 45: 21
        line 46: 25
        line 48: 26
        line 50: 41
        line 51: 46
        line 53: 54
        line 54: 58
        line 56: 75
        line 58: 80
        line 60: 87
        line 61: 99
        line 63: 104
        line 65: 111
        line 66: 122
        line 70: 141
        line 71: 152
        line 77: 168
        line 78: 172
        line 80: 177
        line 81: 182
        line 82: 186
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           99      69     4  room   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0     187     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty;
           11     176     1 player   Lext/mods/gameserver/model/actor/Player;
           21     166     2 requestor   Lext/mods/gameserver/model/actor/Player;
           46     141     3 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/group/Party ]
        frame_type = 4 /* same */
        frame_type = 252 /* append */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/group/PartyMatchRoom ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 8 /* same */
}
SourceFile: "RequestAnswerJoinParty.java"
