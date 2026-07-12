// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAnswerFriendInvite
// File: ext\mods\gameserver\network\clientpackets\RequestAnswerFriendInvite.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite.class
  Last modified 9 de jul de 2026; size 2515 bytes
  MD5 checksum 9d2e17042f2b74e5567d573116433c62
  Compiled from "RequestAnswerFriendInvite.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAnswerFriendInvite extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite._response:I
   #14 = NameAndType        #15:#16       // _response:I
   #15 = Utf8               _response
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite.getClient:()Lext/mods/commons/mmocore/MMOClient;
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
   #32 = Fieldref           #33.#34       // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_SUCCEEDED_INVITING_FRIEND:Lext/mods/gameserver/network/SystemMessageId;
   #33 = Class              #35           // ext/mods/gameserver/network/SystemMessageId
   #34 = NameAndType        #36:#37       // YOU_HAVE_SUCCEEDED_INVITING_FRIEND:Lext/mods/gameserver/network/SystemMessageId;
   #35 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #36 = Utf8               YOU_HAVE_SUCCEEDED_INVITING_FRIEND
   #37 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #38 = Methodref          #28.#39       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #39 = NameAndType        #40:#41       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #40 = Utf8               sendPacket
   #41 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #42 = Methodref          #43.#44       // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #43 = Class              #45           // ext/mods/gameserver/data/manager/RelationManager
   #44 = NameAndType        #46:#47       // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #45 = Utf8               ext/mods/gameserver/data/manager/RelationManager
   #46 = Utf8               getInstance
   #47 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
   #48 = Methodref          #28.#49       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #49 = NameAndType        #50:#12       // getObjectId:()I
   #50 = Utf8               getObjectId
   #51 = Methodref          #43.#52       // ext/mods/gameserver/data/manager/RelationManager.addToFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
   #52 = NameAndType        #53:#54       // addToFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
   #53 = Utf8               addToFriendList
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #55 = Fieldref           #56.#57       // ext/mods/gameserver/network/serverpackets/FriendAddRequestResult.STATIC_ACCEPT:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
   #56 = Class              #58           // ext/mods/gameserver/network/serverpackets/FriendAddRequestResult
   #57 = NameAndType        #59:#60       // STATIC_ACCEPT:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
   #58 = Utf8               ext/mods/gameserver/network/serverpackets/FriendAddRequestResult
   #59 = Utf8               STATIC_ACCEPT
   #60 = Utf8               Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
   #61 = Methodref          #28.#62       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #62 = NameAndType        #40:#63       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #63 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #64 = Fieldref           #33.#65       // ext/mods/gameserver/network/SystemMessageId.S1_ADDED_TO_FRIENDS:Lext/mods/gameserver/network/SystemMessageId;
   #65 = NameAndType        #66:#37       // S1_ADDED_TO_FRIENDS:Lext/mods/gameserver/network/SystemMessageId;
   #66 = Utf8               S1_ADDED_TO_FRIENDS
   #67 = Methodref          #68.#69       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #68 = Class              #70           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #69 = NameAndType        #71:#72       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #70 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #71 = Utf8               getSystemMessage
   #72 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #73 = Methodref          #68.#74       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = NameAndType        #75:#76       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #75 = Utf8               addCharName
   #76 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = Class              #78           // ext/mods/gameserver/network/serverpackets/L2Friend
   #78 = Utf8               ext/mods/gameserver/network/serverpackets/L2Friend
   #79 = Methodref          #77.#80       // ext/mods/gameserver/network/serverpackets/L2Friend."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #80 = NameAndType        #5:#54        // "<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #81 = Fieldref           #33.#82       // ext/mods/gameserver/network/SystemMessageId.S1_JOINED_AS_FRIEND:Lext/mods/gameserver/network/SystemMessageId;
   #82 = NameAndType        #83:#37       // S1_JOINED_AS_FRIEND:Lext/mods/gameserver/network/SystemMessageId;
   #83 = Utf8               S1_JOINED_AS_FRIEND
   #84 = Fieldref           #56.#85       // ext/mods/gameserver/network/serverpackets/FriendAddRequestResult.STATIC_FAIL:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
   #85 = NameAndType        #86:#60       // STATIC_FAIL:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
   #86 = Utf8               STATIC_FAIL
   #87 = Methodref          #28.#88       // ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #88 = NameAndType        #89:#90       // setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #89 = Utf8               setActiveRequester
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #91 = Methodref          #28.#92       // ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
   #92 = NameAndType        #93:#6        // onTransactionResponse:()V
   #93 = Utf8               onTransactionResponse
   #94 = Utf8               Code
   #95 = Utf8               LineNumberTable
   #96 = Utf8               LocalVariableTable
   #97 = Utf8               this
   #98 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite;
   #99 = Utf8               readImpl
  #100 = Utf8               runImpl
  #101 = Utf8               player
  #102 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #103 = Utf8               requestor
  #104 = Utf8               StackMapTable
  #105 = Utf8               SourceFile
  #106 = Utf8               RequestAnswerFriendInvite.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAnswerFriendInvite();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite;

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
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
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
        26: aload_0
        27: getfield      #13                 // Field _response:I
        30: iconst_1
        31: if_icmpne     134
        34: aload_2
        35: getstatic     #32                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_SUCCEEDED_INVITING_FRIEND:Lext/mods/gameserver/network/SystemMessageId;
        38: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        41: invokestatic  #42                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
        44: aload_2
        45: aload_1
        46: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        49: invokevirtual #51                 // Method ext/mods/gameserver/data/manager/RelationManager.addToFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
        52: aload_2
        53: getstatic     #55                 // Field ext/mods/gameserver/network/serverpackets/FriendAddRequestResult.STATIC_ACCEPT:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
        56: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        59: aload_2
        60: getstatic     #64                 // Field ext/mods/gameserver/network/SystemMessageId.S1_ADDED_TO_FRIENDS:Lext/mods/gameserver/network/SystemMessageId;
        63: invokestatic  #67                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        66: aload_1
        67: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        73: aload_2
        74: new           #77                 // class ext/mods/gameserver/network/serverpackets/L2Friend
        77: dup
        78: aload_1
        79: iconst_1
        80: invokespecial #79                 // Method ext/mods/gameserver/network/serverpackets/L2Friend."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
        83: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        86: invokestatic  #42                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
        89: aload_1
        90: aload_2
        91: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        94: invokevirtual #51                 // Method ext/mods/gameserver/data/manager/RelationManager.addToFriendList:(Lext/mods/gameserver/model/actor/Player;I)V
        97: aload_1
        98: getstatic     #55                 // Field ext/mods/gameserver/network/serverpackets/FriendAddRequestResult.STATIC_ACCEPT:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
       101: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       104: aload_1
       105: getstatic     #81                 // Field ext/mods/gameserver/network/SystemMessageId.S1_JOINED_AS_FRIEND:Lext/mods/gameserver/network/SystemMessageId;
       108: invokestatic  #67                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       111: aload_2
       112: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       115: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       118: aload_1
       119: new           #77                 // class ext/mods/gameserver/network/serverpackets/L2Friend
       122: dup
       123: aload_2
       124: iconst_1
       125: invokespecial #79                 // Method ext/mods/gameserver/network/serverpackets/L2Friend."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       128: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       131: goto          141
       134: aload_2
       135: getstatic     #84                 // Field ext/mods/gameserver/network/serverpackets/FriendAddRequestResult.STATIC_FAIL:Lext/mods/gameserver/network/serverpackets/FriendAddRequestResult;
       138: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       141: aload_1
       142: aconst_null
       143: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
       146: aload_2
       147: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
       150: return
      LineNumberTable:
        line 40: 0
        line 41: 11
        line 42: 15
        line 44: 16
        line 45: 21
        line 46: 25
        line 48: 26
        line 50: 34
        line 52: 41
        line 53: 52
        line 54: 59
        line 55: 73
        line 57: 86
        line 58: 97
        line 59: 104
        line 60: 118
        line 63: 134
        line 65: 141
        line 66: 146
        line 67: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     151     0  this   Lext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite;
           11     140     1 player   Lext/mods/gameserver/model/actor/Player;
           21     130     2 requestor   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 107
        frame_type = 6 /* same */
}
SourceFile: "RequestAnswerFriendInvite.java"
