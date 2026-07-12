// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatTrade
// File: ext\mods\gameserver\handler\chathandlers\ChatTrade.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatTrade.class
  Last modified 9 de jul de 2026; size 2775 bytes
  MD5 checksum 052b4f23afec1e204ecc5b56146099ec
  Compiled from "ChatTrade.java"
public class ext.mods.gameserver.handler.chathandlers.ChatTrade implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #99                         // ext/mods/gameserver/handler/chathandlers/ChatTrade
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getClient:()Lext/mods/gameserver/network/GameClient;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getClient
   #12 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/FloodProtector.TRADE_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #14 = Class              #16           // ext/mods/gameserver/enums/FloodProtector
   #15 = NameAndType        #17:#18       // TRADE_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #16 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #17 = Utf8               TRADE_CHAT
   #18 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #20 = Class              #22           // ext/mods/gameserver/network/GameClient
   #21 = NameAndType        #23:#24       // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Utf8               performAction
   #24 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
   #25 = Class              #26           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #26 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #27 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #28 = NameAndType        #29:#30       // getObjectId:()I
   #29 = Utf8               getObjectId
   #30 = Utf8               ()I
   #31 = Methodref          #8.#32        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #32 = NameAndType        #33:#34       // getName:()Ljava/lang/String;
   #33 = Utf8               getName
   #34 = Utf8               ()Ljava/lang/String;
   #35 = Methodref          #25.#36       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #36 = NameAndType        #5:#37        // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #37 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #38 = Fieldref           #39.#40       // ext/mods/Config.TRADE_CHAT:Ljava/lang/String;
   #39 = Class              #41           // ext/mods/Config
   #40 = NameAndType        #17:#42       // TRADE_CHAT:Ljava/lang/String;
   #41 = Utf8               ext/mods/Config
   #42 = Utf8               Ljava/lang/String;
   #43 = String             #44           // global
   #44 = Utf8               global
   #45 = Methodref          #46.#47       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #46 = Class              #48           // java/lang/String
   #47 = NameAndType        #49:#50       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #48 = Utf8               java/lang/String
   #49 = Utf8               equalsIgnoreCase
   #50 = Utf8               (Ljava/lang/String;)Z
   #51 = String             #52           // gm
   #52 = Utf8               gm
   #53 = Methodref          #8.#54        // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #54 = NameAndType        #55:#56       // isGM:()Z
   #55 = Utf8               isGM
   #56 = Utf8               ()Z
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #58 = Class              #60           // ext/mods/gameserver/model/World
   #59 = NameAndType        #61:#62       // getInstance:()Lext/mods/gameserver/model/World;
   #60 = Utf8               ext/mods/gameserver/model/World
   #61 = Utf8               getInstance
   #62 = Utf8               ()Lext/mods/gameserver/model/World;
   #63 = Methodref          #58.#64       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
   #64 = NameAndType        #65:#66       // getPlayers:()Ljava/util/Collection;
   #65 = Utf8               getPlayers
   #66 = Utf8               ()Ljava/util/Collection;
   #67 = InterfaceMethodref #68.#69       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #68 = Class              #70           // java/util/Collection
   #69 = NameAndType        #71:#72       // iterator:()Ljava/util/Iterator;
   #70 = Utf8               java/util/Collection
   #71 = Utf8               iterator
   #72 = Utf8               ()Ljava/util/Iterator;
   #73 = InterfaceMethodref #74.#75       // java/util/Iterator.hasNext:()Z
   #74 = Class              #76           // java/util/Iterator
   #75 = NameAndType        #77:#56       // hasNext:()Z
   #76 = Utf8               java/util/Iterator
   #77 = Utf8               hasNext
   #78 = InterfaceMethodref #74.#79       // java/util/Iterator.next:()Ljava/lang/Object;
   #79 = NameAndType        #80:#81       // next:()Ljava/lang/Object;
   #80 = Utf8               next
   #81 = Utf8               ()Ljava/lang/Object;
   #82 = Methodref          #8.#83        // ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
   #83 = NameAndType        #84:#56       // isBlockingAll:()Z
   #84 = Utf8               isBlockingAll
   #85 = Methodref          #8.#86        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #86 = NameAndType        #87:#88       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = Utf8               sendPacket
   #88 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #89 = String             #90           // on
   #90 = Utf8               on
   #91 = Methodref          #25.#92       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #92 = NameAndType        #5:#93        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #94 = Methodref          #58.#95       // ext/mods/gameserver/model/World.broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = NameAndType        #96:#97       // broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #96 = Utf8               broadcastToSameRegion
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #98 = Fieldref           #99.#100      // ext/mods/gameserver/handler/chathandlers/ChatTrade.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
   #99 = Class              #101          // ext/mods/gameserver/handler/chathandlers/ChatTrade
  #100 = NameAndType        #102:#103     // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #101 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatTrade
  #102 = Utf8               COMMAND_IDS
  #103 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #104 = Class              #105          // ext/mods/gameserver/enums/SayType
  #105 = Utf8               ext/mods/gameserver/enums/SayType
  #106 = Fieldref           #104.#107     // ext/mods/gameserver/enums/SayType.TRADE:Lext/mods/gameserver/enums/SayType;
  #107 = NameAndType        #108:#109     // TRADE:Lext/mods/gameserver/enums/SayType;
  #108 = Utf8               TRADE
  #109 = Utf8               Lext/mods/gameserver/enums/SayType;
  #110 = Class              #111          // ext/mods/gameserver/handler/IChatHandler
  #111 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatTrade;
  #117 = Utf8               handleChat
  #118 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #119 = Utf8               worldPlayer
  #120 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #121 = Utf8               type
  #122 = Utf8               player
  #123 = Utf8               target
  #124 = Utf8               text
  #125 = Utf8               cs
  #126 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #127 = Utf8               StackMapTable
  #128 = Utf8               getChatTypeList
  #129 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #130 = Utf8               <clinit>
  #131 = Utf8               SourceFile
  #132 = Utf8               ChatTrade.java
{
  public ext.mods.gameserver.handler.chathandlers.ChatTrade();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatTrade;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         4: getstatic     #13                 // Field ext/mods/gameserver/enums/FloodProtector.TRADE_CHAT:Lext/mods/gameserver/enums/FloodProtector;
         7: invokevirtual #19                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        10: ifne          14
        13: return
        14: new           #25                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        17: dup
        18: aload_2
        19: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        22: aload_1
        23: aload_2
        24: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        27: aload         4
        29: invokespecial #35                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        32: astore        5
        34: getstatic     #38                 // Field ext/mods/Config.TRADE_CHAT:Ljava/lang/String;
        37: ldc           #43                 // String global
        39: invokevirtual #45                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        42: ifne          63
        45: getstatic     #38                 // Field ext/mods/Config.TRADE_CHAT:Ljava/lang/String;
        48: ldc           #51                 // String gm
        50: invokevirtual #45                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        53: ifeq          119
        56: aload_2
        57: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        60: ifeq          119
        63: invokestatic  #57                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        66: invokevirtual #63                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        69: invokeinterface #67,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        74: astore        6
        76: aload         6
        78: invokeinterface #73,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        83: ifeq          116
        86: aload         6
        88: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        93: checkcast     #8                  // class ext/mods/gameserver/model/actor/Player
        96: astore        7
        98: aload         7
       100: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
       103: ifne          113
       106: aload         7
       108: aload         5
       110: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: goto          76
       116: goto          145
       119: getstatic     #38                 // Field ext/mods/Config.TRADE_CHAT:Ljava/lang/String;
       122: ldc           #89                 // String on
       124: invokevirtual #45                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       127: ifeq          145
       130: aload_2
       131: new           #25                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       134: dup
       135: aload_2
       136: aload_1
       137: aload         4
       139: invokespecial #91                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
       142: invokestatic  #94                 // Method ext/mods/gameserver/model/World.broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       145: return
      LineNumberTable:
        line 38: 0
        line 39: 13
        line 41: 14
        line 42: 34
        line 44: 63
        line 46: 98
        line 47: 106
        line 48: 113
        line 50: 119
        line 51: 130
        line 52: 145
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           98      15     7 worldPlayer   Lext/mods/gameserver/model/actor/Player;
            0     146     0  this   Lext/mods/gameserver/handler/chathandlers/ChatTrade;
            0     146     1  type   Lext/mods/gameserver/enums/SayType;
            0     146     2 player   Lext/mods/gameserver/model/actor/Player;
            0     146     3 target   Ljava/lang/String;
            0     146     4  text   Ljava/lang/String;
           34     112     5    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
      StackMapTable: number_of_entries = 7
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/network/serverpackets/CreatureSay ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 25 /* same */

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #98                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatTrade;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #104                // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #106                // Field ext/mods/gameserver/enums/SayType.TRADE:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #98                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "ChatTrade.java"
