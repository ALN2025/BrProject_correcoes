// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAnswerJoinAlly
// File: ext\mods\gameserver\network\clientpackets\RequestAnswerJoinAlly.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly.class
  Last modified 9 de jul de 2026; size 2362 bytes
  MD5 checksum 91b7e05d9cca52b129e3189eb6499296
  Compiled from "RequestAnswerJoinAlly.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAnswerJoinAlly extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly._response:I
   #14 = NameAndType        #15:#16       // _response:I
   #15 = Utf8               _response
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getRequest
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Request;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/container/player/Request.getPartner:()Lext/mods/gameserver/model/actor/Player;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/container/player/Request
   #35 = NameAndType        #37:#26       // getPartner:()Lext/mods/gameserver/model/actor/Player;
   #36 = Utf8               ext/mods/gameserver/model/actor/container/player/Request
   #37 = Utf8               getPartner
   #38 = Fieldref           #39.#40       // ext/mods/gameserver/network/SystemMessageId.YOU_DID_NOT_RESPOND_TO_ALLY_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #39 = Class              #41           // ext/mods/gameserver/network/SystemMessageId
   #40 = NameAndType        #42:#43       // YOU_DID_NOT_RESPOND_TO_ALLY_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #41 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #42 = Utf8               YOU_DID_NOT_RESPOND_TO_ALLY_INVITATION
   #43 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #44 = Methodref          #28.#45       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #45 = NameAndType        #46:#47       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = Utf8               sendPacket
   #47 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #48 = Fieldref           #39.#49       // ext/mods/gameserver/network/SystemMessageId.NO_RESPONSE_TO_ALLY_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #49 = NameAndType        #50:#43       // NO_RESPONSE_TO_ALLY_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Utf8               NO_RESPONSE_TO_ALLY_INVITATION
   #51 = Methodref          #34.#52       // ext/mods/gameserver/model/actor/container/player/Request.getRequestPacket:()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #52 = NameAndType        #53:#54       // getRequestPacket:()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #53 = Utf8               getRequestPacket
   #54 = Utf8               ()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
   #55 = Class              #56           // ext/mods/gameserver/network/clientpackets/RequestJoinAlly
   #56 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinAlly
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/pledge/Clan.checkAllyJoinCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #58 = Class              #60           // ext/mods/gameserver/model/pledge/Clan
   #59 = NameAndType        #61:#62       // checkAllyJoinCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #60 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #61 = Utf8               checkAllyJoinCondition
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #63 = Methodref          #28.#64       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #64 = NameAndType        #65:#66       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #65 = Utf8               getClan
   #66 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #67 = Methodref          #58.#68       // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
   #68 = NameAndType        #69:#12       // getAllyId:()I
   #69 = Utf8               getAllyId
   #70 = Methodref          #58.#71       // ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
   #71 = NameAndType        #72:#73       // setAllyId:(I)V
   #72 = Utf8               setAllyId
   #73 = Utf8               (I)V
   #74 = Methodref          #58.#75       // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
   #75 = NameAndType        #76:#77       // getAllyName:()Ljava/lang/String;
   #76 = Utf8               getAllyName
   #77 = Utf8               ()Ljava/lang/String;
   #78 = Methodref          #58.#79       // ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
   #79 = NameAndType        #80:#81       // setAllyName:(Ljava/lang/String;)V
   #80 = Utf8               setAllyName
   #81 = Utf8               (Ljava/lang/String;)V
   #82 = Methodref          #58.#83       // ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
   #83 = NameAndType        #84:#85       // setAllyPenaltyExpiryTime:(JI)V
   #84 = Utf8               setAllyPenaltyExpiryTime
   #85 = Utf8               (JI)V
   #86 = Methodref          #58.#87       // ext/mods/gameserver/model/pledge/Clan.getAllyCrestId:()I
   #87 = NameAndType        #88:#12       // getAllyCrestId:()I
   #88 = Utf8               getAllyCrestId
   #89 = Methodref          #58.#90       // ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
   #90 = NameAndType        #91:#92       // changeAllyCrest:(IZ)V
   #91 = Utf8               changeAllyCrest
   #92 = Utf8               (IZ)V
   #93 = Methodref          #58.#94       // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
   #94 = NameAndType        #95:#6        // updateClanInDB:()V
   #95 = Utf8               updateClanInDB
   #96 = Fieldref           #39.#97       // ext/mods/gameserver/network/SystemMessageId.YOU_ACCEPTED_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #97 = NameAndType        #98:#43       // YOU_ACCEPTED_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Utf8               YOU_ACCEPTED_ALLIANCE
   #99 = Methodref          #34.#100      // ext/mods/gameserver/model/actor/container/player/Request.onRequestResponse:()V
  #100 = NameAndType        #101:#6       // onRequestResponse:()V
  #101 = Utf8               onRequestResponse
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly;
  #107 = Utf8               readImpl
  #108 = Utf8               runImpl
  #109 = Utf8               player
  #110 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #111 = Utf8               requestor
  #112 = Utf8               StackMapTable
  #113 = Utf8               SourceFile
  #114 = Utf8               RequestAnswerJoinAlly.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAnswerJoinAlly();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly;

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
        line 31: 0
        line 32: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly;

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
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        20: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/container/player/Request.getPartner:()Lext/mods/gameserver/model/actor/Player;
        23: astore_2
        24: aload_2
        25: ifnonnull     29
        28: return
        29: aload_0
        30: getfield      #13                 // Field _response:I
        33: ifne          53
        36: aload_1
        37: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_DID_NOT_RESPOND_TO_ALLY_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
        40: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        43: aload_2
        44: getstatic     #48                 // Field ext/mods/gameserver/network/SystemMessageId.NO_RESPONSE_TO_ALLY_INVITATION:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: goto          142
        53: aload_2
        54: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
        57: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/container/player/Request.getRequestPacket:()Lext/mods/gameserver/network/clientpackets/L2GameClientPacket;
        60: instanceof    #55                 // class ext/mods/gameserver/network/clientpackets/RequestJoinAlly
        63: ifne          67
        66: return
        67: aload_2
        68: aload_1
        69: invokestatic  #57                 // Method ext/mods/gameserver/model/pledge/Clan.checkAllyJoinCondition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        72: ifne          76
        75: return
        76: aload_1
        77: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        80: aload_2
        81: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        84: invokevirtual #67                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        87: invokevirtual #70                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
        90: aload_1
        91: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        94: aload_2
        95: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        98: invokevirtual #74                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
       101: invokevirtual #78                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
       104: aload_1
       105: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       108: lconst_0
       109: iconst_0
       110: invokevirtual #82                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
       113: aload_1
       114: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       117: aload_2
       118: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       121: invokevirtual #86                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyCrestId:()I
       124: iconst_1
       125: invokevirtual #89                 // Method ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
       128: aload_1
       129: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       132: invokevirtual #93                 // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
       135: aload_1
       136: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ACCEPTED_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       139: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       142: aload_1
       143: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getRequest:()Lext/mods/gameserver/model/actor/container/player/Request;
       146: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/container/player/Request.onRequestResponse:()V
       149: return
      LineNumberTable:
        line 37: 0
        line 38: 11
        line 39: 15
        line 41: 16
        line 42: 24
        line 43: 28
        line 45: 29
        line 47: 36
        line 48: 43
        line 52: 53
        line 53: 66
        line 55: 67
        line 56: 75
        line 58: 76
        line 59: 90
        line 60: 104
        line 61: 113
        line 62: 128
        line 64: 135
        line 66: 142
        line 67: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     150     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly;
           11     139     1 player   Lext/mods/gameserver/model/actor/Player;
           24     126     2 requestor   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 8 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 65
}
SourceFile: "RequestAnswerJoinAlly.java"
