// Bytecode for: ext.mods.gameserver.network.clientpackets.AnswerTradeRequest
// File: ext\mods\gameserver\network\clientpackets\AnswerTradeRequest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AnswerTradeRequest.class
  Last modified 9 de jul de 2026; size 2516 bytes
  MD5 checksum ff935ba1b6d46e2844b0fcb5a338f80d
  Compiled from "AnswerTradeRequest.java"
public final class ext.mods.gameserver.network.clientpackets.AnswerTradeRequest extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/AnswerTradeRequest
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest._response:I
   #14 = NameAndType        #15:#16       // _response:I
   #15 = Utf8               _response
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getAccessLevel
   #32 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/AccessLevel.allowTransaction:()Z
   #34 = Class              #36           // ext/mods/gameserver/model/AccessLevel
   #35 = NameAndType        #37:#38       // allowTransaction:()Z
   #36 = Utf8               ext/mods/gameserver/model/AccessLevel
   #37 = Utf8               allowTransaction
   #38 = Utf8               ()Z
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Class              #42           // ext/mods/gameserver/network/SystemMessageId
   #41 = NameAndType        #43:#44       // YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #43 = Utf8               YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT
   #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #45 = Methodref          #28.#46       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = NameAndType        #47:#48       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #47 = Utf8               sendPacket
   #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #49 = Methodref          #28.#50       // ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #50 = NameAndType        #51:#26       // getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #51 = Utf8               getActiveRequester
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #53 = Class              #55           // ext/mods/gameserver/model/World
   #54 = NameAndType        #56:#57       // getInstance:()Lext/mods/gameserver/model/World;
   #55 = Utf8               ext/mods/gameserver/model/World
   #56 = Utf8               getInstance
   #57 = Utf8               ()Lext/mods/gameserver/model/World;
   #58 = Methodref          #28.#59       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #59 = NameAndType        #60:#12       // getObjectId:()I
   #60 = Utf8               getObjectId
   #61 = Methodref          #53.#62       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #62 = NameAndType        #25:#63       // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #63 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #64 = Fieldref           #65.#66       // ext/mods/gameserver/network/serverpackets/SendTradeDone.FAIL_STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SendTradeDone;
   #65 = Class              #67           // ext/mods/gameserver/network/serverpackets/SendTradeDone
   #66 = NameAndType        #68:#69       // FAIL_STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SendTradeDone;
   #67 = Utf8               ext/mods/gameserver/network/serverpackets/SendTradeDone
   #68 = Utf8               FAIL_STATIC_PACKET
   #69 = Utf8               Lext/mods/gameserver/network/serverpackets/SendTradeDone;
   #70 = Methodref          #28.#71       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #71 = NameAndType        #47:#72       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #72 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #73 = Fieldref           #40.#74       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #74 = NameAndType        #75:#44       // TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #75 = Utf8               TARGET_IS_NOT_FOUND_IN_THE_GAME
   #76 = Methodref          #28.#77       // ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #77 = NameAndType        #78:#79       // setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
   #78 = Utf8               setActiveRequester
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #80 = Methodref          #28.#81       // ext/mods/gameserver/model/actor/Player.isRequestExpired:()Z
   #81 = NameAndType        #82:#38       // isRequestExpired:()Z
   #82 = Utf8               isRequestExpired
   #83 = Methodref          #28.#84       // ext/mods/gameserver/model/actor/Player.startTrade:(Lext/mods/gameserver/model/actor/Player;)V
   #84 = NameAndType        #85:#79       // startTrade:(Lext/mods/gameserver/model/actor/Player;)V
   #85 = Utf8               startTrade
   #86 = Fieldref           #40.#87       // ext/mods/gameserver/network/SystemMessageId.S1_DENIED_TRADE_REQUEST:Lext/mods/gameserver/network/SystemMessageId;
   #87 = NameAndType        #88:#44       // S1_DENIED_TRADE_REQUEST:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Utf8               S1_DENIED_TRADE_REQUEST
   #89 = Methodref          #90.#91       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #90 = Class              #92           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #91 = NameAndType        #93:#94       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #92 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #93 = Utf8               getSystemMessage
   #94 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #95 = Methodref          #90.#96       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = NameAndType        #97:#98       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #97 = Utf8               addCharName
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = Methodref          #28.#100      // ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
  #100 = NameAndType        #101:#6       // onTransactionResponse:()V
  #101 = Utf8               onTransactionResponse
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/gameserver/network/clientpackets/AnswerTradeRequest;
  #107 = Utf8               readImpl
  #108 = Utf8               runImpl
  #109 = Utf8               player
  #110 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #111 = Utf8               partner
  #112 = Utf8               StackMapTable
  #113 = Utf8               SourceFile
  #114 = Utf8               AnswerTradeRequest.java
{
  public ext.mods.gameserver.network.clientpackets.AnswerTradeRequest();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AnswerTradeRequest;

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
        line 33: 0
        line 34: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/AnswerTradeRequest;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
        20: invokevirtual #33                 // Method ext/mods/gameserver/model/AccessLevel.allowTransaction:()Z
        23: ifne          34
        26: aload_1
        27: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
        30: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        33: return
        34: aload_1
        35: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
        38: astore_2
        39: aload_2
        40: ifnull        56
        43: invokestatic  #52                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        46: aload_2
        47: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: invokevirtual #61                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        53: ifnonnull     76
        56: aload_1
        57: getstatic     #64                 // Field ext/mods/gameserver/network/serverpackets/SendTradeDone.FAIL_STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/SendTradeDone;
        60: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        63: aload_1
        64: getstatic     #73                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        67: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        70: aload_1
        71: aconst_null
        72: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
        75: return
        76: aload_0
        77: getfield      #13                 // Field _response:I
        80: iconst_1
        81: if_icmpne     99
        84: aload_2
        85: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.isRequestExpired:()Z
        88: ifne          99
        91: aload_1
        92: aload_2
        93: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.startTrade:(Lext/mods/gameserver/model/actor/Player;)V
        96: goto          113
        99: aload_2
       100: getstatic     #86                 // Field ext/mods/gameserver/network/SystemMessageId.S1_DENIED_TRADE_REQUEST:Lext/mods/gameserver/network/SystemMessageId;
       103: invokestatic  #89                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       106: aload_1
       107: invokevirtual #95                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       110: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: aload_1
       114: aconst_null
       115: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.setActiveRequester:(Lext/mods/gameserver/model/actor/Player;)V
       118: aload_2
       119: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.onTransactionResponse:()V
       122: return
      LineNumberTable:
        line 39: 0
        line 40: 11
        line 41: 15
        line 43: 16
        line 45: 26
        line 46: 33
        line 49: 34
        line 50: 39
        line 52: 56
        line 53: 63
        line 54: 70
        line 55: 75
        line 58: 76
        line 59: 91
        line 61: 99
        line 63: 113
        line 64: 118
        line 65: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     123     0  this   Lext/mods/gameserver/network/clientpackets/AnswerTradeRequest;
           11     112     1 player   Lext/mods/gameserver/model/actor/Player;
           39      84     2 partner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 19 /* same */
        frame_type = 22 /* same */
        frame_type = 13 /* same */
}
SourceFile: "AnswerTradeRequest.java"
