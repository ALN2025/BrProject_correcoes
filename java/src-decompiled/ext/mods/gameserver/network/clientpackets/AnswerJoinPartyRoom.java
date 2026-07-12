// Bytecode for: ext.mods.gameserver.network.clientpackets.AnswerJoinPartyRoom
// File: ext\mods\gameserver\network\clientpackets\AnswerJoinPartyRoom.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom.class
  Last modified 9 de jul de 2026; size 3565 bytes
  MD5 checksum 33742d6aba4a6aeffd165b4a4c94c09b
  Compiled from "AnswerJoinPartyRoom.java"
public final class ext.mods.gameserver.network.clientpackets.AnswerJoinPartyRoom extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom._answer:I
   #14 = NameAndType        #15:#16       // _answer:I
   #15 = Utf8               _answer
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom.getClient:()Lext/mods/commons/mmocore/MMOClient;
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
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #33 = Class              #35           // ext/mods/gameserver/model/World
   #34 = NameAndType        #36:#37       // getInstance:()Lext/mods/gameserver/model/World;
   #35 = Utf8               ext/mods/gameserver/model/World
   #36 = Utf8               getInstance
   #37 = Utf8               ()Lext/mods/gameserver/model/World;
   #38 = Methodref          #28.#39       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #39 = NameAndType        #40:#12       // getObjectId:()I
   #40 = Utf8               getObjectId
   #41 = Methodref          #33.#42       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #42 = NameAndType        #25:#43       // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #43 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Class              #47           // ext/mods/gameserver/network/SystemMessageId
   #46 = NameAndType        #48:#49       // TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #48 = Utf8               TARGET_IS_NOT_FOUND_IN_THE_GAME
   #49 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #50 = Methodref          #28.#51       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = NameAndType        #52:#53       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #52 = Utf8               sendPacket
   #53 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #54 = Methodref          #28.#55       // ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #55 = NameAndType        #56:#57       // setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #56 = Utf8               setActiveRequester
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #58 = Methodref          #28.#59       // ext/mods/gameserver/model/actor/Player.isRequestExpired:()Z
   #59 = NameAndType        #60:#61       // isRequestExpired:()Z
   #60 = Utf8               isRequestExpired
   #61 = Utf8               ()Z
   #62 = Methodref          #63.#64       // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #63 = Class              #65           // ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #64 = NameAndType        #36:#66       // getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #65 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #66 = Utf8               ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #67 = Methodref          #28.#68       // ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
   #68 = NameAndType        #69:#12       // getPartyRoom:()I
   #69 = Utf8               getPartyRoom
   #70 = Methodref          #63.#71       // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
   #71 = NameAndType        #72:#73       // getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
   #72 = Utf8               getRoom
   #73 = Utf8               (I)Lext/mods/gameserver/model/group/PartyMatchRoom;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/group/PartyMatchRoom.checkEntrance:(Lext/mods/gameserver/model/actor/Player;)Z
   #75 = Class              #77           // ext/mods/gameserver/model/group/PartyMatchRoom
   #76 = NameAndType        #78:#79       // checkEntrance:(Lext/mods/gameserver/model/actor/Player;)Z
   #77 = Utf8               ext/mods/gameserver/model/group/PartyMatchRoom
   #78 = Utf8               checkEntrance
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #80 = Fieldref           #45.#81       // ext/mods/gameserver/network/SystemMessageId.CANT_ENTER_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
   #81 = NameAndType        #82:#49       // CANT_ENTER_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
   #82 = Utf8               CANT_ENTER_PARTY_ROOM
   #83 = Methodref          #63.#84       // ext/mods/gameserver/data/manager/PartyMatchRoomManager.removeWaitingPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
   #84 = NameAndType        #85:#79       // removeWaitingPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
   #85 = Utf8               removeWaitingPlayer
   #86 = Class              #87           // ext/mods/gameserver/network/serverpackets/PartyMatchDetail
   #87 = Utf8               ext/mods/gameserver/network/serverpackets/PartyMatchDetail
   #88 = Methodref          #86.#89       // ext/mods/gameserver/network/serverpackets/PartyMatchDetail."<init>":(Lext/mods/gameserver/model/group/PartyMatchRoom;)V
   #89 = NameAndType        #5:#90        // "<init>":(Lext/mods/gameserver/model/group/PartyMatchRoom;)V
   #90 = Utf8               (Lext/mods/gameserver/model/group/PartyMatchRoom;)V
   #91 = Methodref          #28.#92       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = NameAndType        #52:#93       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #93 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = Class              #95           // ext/mods/gameserver/network/serverpackets/ExPartyRoomMember
   #95 = Utf8               ext/mods/gameserver/network/serverpackets/ExPartyRoomMember
   #96 = Methodref          #94.#97       // ext/mods/gameserver/network/serverpackets/ExPartyRoomMember."<init>":(Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
   #97 = NameAndType        #5:#98        // "<init>":(Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
   #98 = Utf8               (Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
   #99 = Methodref          #75.#100      // ext/mods/gameserver/model/group/PartyMatchRoom.getMembers:()Ljava/util/List;
  #100 = NameAndType        #101:#102     // getMembers:()Ljava/util/List;
  #101 = Utf8               getMembers
  #102 = Utf8               ()Ljava/util/List;
  #103 = InterfaceMethodref #104.#105     // java/util/List.iterator:()Ljava/util/Iterator;
  #104 = Class              #106          // java/util/List
  #105 = NameAndType        #107:#108     // iterator:()Ljava/util/Iterator;
  #106 = Utf8               java/util/List
  #107 = Utf8               iterator
  #108 = Utf8               ()Ljava/util/Iterator;
  #109 = InterfaceMethodref #110.#111     // java/util/Iterator.hasNext:()Z
  #110 = Class              #112          // java/util/Iterator
  #111 = NameAndType        #113:#61      // hasNext:()Z
  #112 = Utf8               java/util/Iterator
  #113 = Utf8               hasNext
  #114 = InterfaceMethodref #110.#115     // java/util/Iterator.next:()Ljava/lang/Object;
  #115 = NameAndType        #116:#117     // next:()Ljava/lang/Object;
  #116 = Utf8               next
  #117 = Utf8               ()Ljava/lang/Object;
  #118 = Class              #119          // ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
  #119 = Utf8               ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
  #120 = Methodref          #118.#121     // ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
  #121 = NameAndType        #5:#122       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
  #123 = Fieldref           #45.#124      // ext/mods/gameserver/network/SystemMessageId.S1_ENTERED_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
  #124 = NameAndType        #125:#49      // S1_ENTERED_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
  #125 = Utf8               S1_ENTERED_PARTY_ROOM
  #126 = Methodref          #127.#128     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #127 = Class              #129          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #128 = NameAndType        #130:#131     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #129 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #130 = Utf8               getSystemMessage
  #131 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #132 = Methodref          #127.#133     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #133 = NameAndType        #134:#135     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #134 = Utf8               addCharName
  #135 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #136 = Methodref          #75.#137      // ext/mods/gameserver/model/group/PartyMatchRoom.addMember:(Lext/mods/gameserver/model/actor/Player;I)V
  #137 = NameAndType        #138:#139     // addMember:(Lext/mods/gameserver/model/actor/Player;I)V
  #138 = Utf8               addMember
  #139 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #140 = Fieldref           #45.#141      // ext/mods/gameserver/network/SystemMessageId.PARTY_MATCHING_REQUEST_NO_RESPONSE:Lext/mods/gameserver/network/SystemMessageId;
  #141 = NameAndType        #142:#49      // PARTY_MATCHING_REQUEST_NO_RESPONSE:Lext/mods/gameserver/network/SystemMessageId;
  #142 = Utf8               PARTY_MATCHING_REQUEST_NO_RESPONSE
  #143 = Methodref          #28.#144      // ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
  #144 = NameAndType        #145:#6       // onTransactionResponse:()V
  #145 = Utf8               onTransactionResponse
  #146 = Utf8               Code
  #147 = Utf8               LineNumberTable
  #148 = Utf8               LocalVariableTable
  #149 = Utf8               this
  #150 = Utf8               Lext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom;
  #151 = Utf8               readImpl
  #152 = Utf8               runImpl
  #153 = Utf8               member
  #154 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #155 = Utf8               room
  #156 = Utf8               Lext/mods/gameserver/model/group/PartyMatchRoom;
  #157 = Utf8               player
  #158 = Utf8               partner
  #159 = Utf8               StackMapTable
  #160 = Utf8               SourceFile
  #161 = Utf8               AnswerJoinPartyRoom.java
{
  public ext.mods.gameserver.network.clientpackets.AnswerJoinPartyRoom();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _answer:I
         8: return
      LineNumberTable:
        line 37: 0
        line 38: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=6, args_size=1
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
        22: ifnull        38
        25: invokestatic  #32                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        28: aload_2
        29: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: invokevirtual #41                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        35: ifnonnull     51
        38: aload_1
        39: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        42: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        45: aload_1
        46: aconst_null
        47: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
        50: return
        51: aload_0
        52: getfield      #13                 // Field _answer:I
        55: iconst_1
        56: if_icmpne     211
        59: aload_2
        60: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.isRequestExpired:()Z
        63: ifne          211
        66: invokestatic  #62                 // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
        69: aload_2
        70: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
        73: invokevirtual #70                 // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getRoom:(I)Lext/mods/gameserver/model/group/PartyMatchRoom;
        76: astore_3
        77: aload_3
        78: ifnonnull     82
        81: return
        82: aload_3
        83: aload_1
        84: invokevirtual #74                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.checkEntrance:(Lext/mods/gameserver/model/actor/Player;)Z
        87: ifne          98
        90: aload_1
        91: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ENTER_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
        94: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        97: return
        98: invokestatic  #62                 // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
       101: aload_1
       102: invokevirtual #83                 // Method ext/mods/gameserver/data/manager/PartyMatchRoomManager.removeWaitingPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
       105: ifeq          208
       108: aload_1
       109: new           #86                 // class ext/mods/gameserver/network/serverpackets/PartyMatchDetail
       112: dup
       113: aload_3
       114: invokespecial #88                 // Method ext/mods/gameserver/network/serverpackets/PartyMatchDetail."<init>":(Lext/mods/gameserver/model/group/PartyMatchRoom;)V
       117: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       120: aload_1
       121: new           #94                 // class ext/mods/gameserver/network/serverpackets/ExPartyRoomMember
       124: dup
       125: aload_3
       126: iconst_0
       127: invokespecial #96                 // Method ext/mods/gameserver/network/serverpackets/ExPartyRoomMember."<init>":(Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
       130: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       133: aload_3
       134: invokevirtual #99                 // Method ext/mods/gameserver/model/group/PartyMatchRoom.getMembers:()Ljava/util/List;
       137: invokeinterface #103,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       142: astore        4
       144: aload         4
       146: invokeinterface #109,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       151: ifeq          199
       154: aload         4
       156: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       161: checkcast     #28                 // class ext/mods/gameserver/model/actor/Player
       164: astore        5
       166: aload         5
       168: new           #118                // class ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember
       171: dup
       172: aload_1
       173: aload_3
       174: iconst_0
       175: invokespecial #120                // Method ext/mods/gameserver/network/serverpackets/ExManagePartyRoomMember."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/group/PartyMatchRoom;I)V
       178: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       181: aload         5
       183: getstatic     #123                // Field ext/mods/gameserver/network/SystemMessageId.S1_ENTERED_PARTY_ROOM:Lext/mods/gameserver/network/SystemMessageId;
       186: invokestatic  #126                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       189: aload_1
       190: invokevirtual #132                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       193: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       196: goto          144
       199: aload_3
       200: aload_1
       201: aload_2
       202: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.getPartyRoom:()I
       205: invokevirtual #136                // Method ext/mods/gameserver/model/group/PartyMatchRoom.addMember:(Lext/mods/gameserver/model/actor/Player;I)V
       208: goto          218
       211: aload_2
       212: getstatic     #140                // Field ext/mods/gameserver/network/SystemMessageId.PARTY_MATCHING_REQUEST_NO_RESPONSE:Lext/mods/gameserver/network/SystemMessageId;
       215: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       218: aload_1
       219: aconst_null
       220: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
       223: aload_2
       224: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
       227: return
      LineNumberTable:
        line 43: 0
        line 44: 11
        line 45: 15
        line 47: 16
        line 48: 21
        line 50: 38
        line 51: 45
        line 52: 50
        line 55: 51
        line 57: 66
        line 58: 77
        line 59: 81
        line 61: 82
        line 63: 90
        line 64: 97
        line 67: 98
        line 69: 108
        line 70: 120
        line 72: 133
        line 74: 166
        line 75: 181
        line 76: 196
        line 77: 199
        line 79: 208
        line 81: 211
        line 83: 218
        line 84: 223
        line 85: 227
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          166      30     5 member   Lext/mods/gameserver/model/actor/Player;
           77     131     3  room   Lext/mods/gameserver/model/group/PartyMatchRoom;
            0     228     0  this   Lext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom;
           11     217     1 player   Lext/mods/gameserver/model/actor/Player;
           21     207     2 partner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/group/PartyMatchRoom ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 54
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 2 /* same */
        frame_type = 6 /* same */
}
SourceFile: "AnswerJoinPartyRoom.java"
