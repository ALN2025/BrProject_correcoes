// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatShout
// File: ext\mods\gameserver\handler\chathandlers\ChatShout.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatShout.class
  Last modified 9 de jul de 2026; size 2604 bytes
  MD5 checksum e88bb06326ac2db00a61c27dba795412
  Compiled from "ChatShout.java"
public class ext.mods.gameserver.handler.chathandlers.ChatShout implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #88                         // ext/mods/gameserver/handler/chathandlers/ChatShout
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
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/FloodProtector.GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #14 = Class              #16           // ext/mods/gameserver/enums/FloodProtector
   #15 = NameAndType        #17:#18       // GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #16 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #17 = Utf8               GLOBAL_CHAT
   #18 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #20 = Class              #22           // ext/mods/gameserver/network/GameClient
   #21 = NameAndType        #23:#24       // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Utf8               performAction
   #24 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
   #25 = Class              #26           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #26 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #27 = Methodref          #25.#28       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #28 = NameAndType        #5:#29        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #29 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #30 = Fieldref           #31.#32       // ext/mods/Config.GLOBAL_CHAT:Ljava/lang/String;
   #31 = Class              #33           // ext/mods/Config
   #32 = NameAndType        #17:#34       // GLOBAL_CHAT:Ljava/lang/String;
   #33 = Utf8               ext/mods/Config
   #34 = Utf8               Ljava/lang/String;
   #35 = String             #36           // global
   #36 = Utf8               global
   #37 = Methodref          #38.#39       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #38 = Class              #40           // java/lang/String
   #39 = NameAndType        #41:#42       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #40 = Utf8               java/lang/String
   #41 = Utf8               equalsIgnoreCase
   #42 = Utf8               (Ljava/lang/String;)Z
   #43 = String             #44           // gm
   #44 = Utf8               gm
   #45 = Methodref          #8.#46        // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #46 = NameAndType        #47:#48       // isGM:()Z
   #47 = Utf8               isGM
   #48 = Utf8               ()Z
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #50 = Class              #52           // ext/mods/gameserver/model/World
   #51 = NameAndType        #53:#54       // getInstance:()Lext/mods/gameserver/model/World;
   #52 = Utf8               ext/mods/gameserver/model/World
   #53 = Utf8               getInstance
   #54 = Utf8               ()Lext/mods/gameserver/model/World;
   #55 = Methodref          #50.#56       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
   #56 = NameAndType        #57:#58       // getPlayers:()Ljava/util/Collection;
   #57 = Utf8               getPlayers
   #58 = Utf8               ()Ljava/util/Collection;
   #59 = InterfaceMethodref #60.#61       // java/util/Collection.iterator:()Ljava/util/Iterator;
   #60 = Class              #62           // java/util/Collection
   #61 = NameAndType        #63:#64       // iterator:()Ljava/util/Iterator;
   #62 = Utf8               java/util/Collection
   #63 = Utf8               iterator
   #64 = Utf8               ()Ljava/util/Iterator;
   #65 = InterfaceMethodref #66.#67       // java/util/Iterator.hasNext:()Z
   #66 = Class              #68           // java/util/Iterator
   #67 = NameAndType        #69:#48       // hasNext:()Z
   #68 = Utf8               java/util/Iterator
   #69 = Utf8               hasNext
   #70 = InterfaceMethodref #66.#71       // java/util/Iterator.next:()Ljava/lang/Object;
   #71 = NameAndType        #72:#73       // next:()Ljava/lang/Object;
   #72 = Utf8               next
   #73 = Utf8               ()Ljava/lang/Object;
   #74 = Methodref          #8.#75        // ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
   #75 = NameAndType        #76:#48       // isBlockingAll:()Z
   #76 = Utf8               isBlockingAll
   #77 = Methodref          #8.#78        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = NameAndType        #79:#80       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #79 = Utf8               sendPacket
   #80 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = String             #82           // on
   #82 = Utf8               on
   #83 = Methodref          #50.#84       // ext/mods/gameserver/model/World.broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = NameAndType        #85:#86       // broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #85 = Utf8               broadcastToSameRegion
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = Fieldref           #88.#89       // ext/mods/gameserver/handler/chathandlers/ChatShout.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
   #88 = Class              #90           // ext/mods/gameserver/handler/chathandlers/ChatShout
   #89 = NameAndType        #91:#92       // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
   #90 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatShout
   #91 = Utf8               COMMAND_IDS
   #92 = Utf8               [Lext/mods/gameserver/enums/SayType;
   #93 = Class              #94           // ext/mods/gameserver/enums/SayType
   #94 = Utf8               ext/mods/gameserver/enums/SayType
   #95 = Fieldref           #93.#96       // ext/mods/gameserver/enums/SayType.SHOUT:Lext/mods/gameserver/enums/SayType;
   #96 = NameAndType        #97:#98       // SHOUT:Lext/mods/gameserver/enums/SayType;
   #97 = Utf8               SHOUT
   #98 = Utf8               Lext/mods/gameserver/enums/SayType;
   #99 = Class              #100          // ext/mods/gameserver/handler/IChatHandler
  #100 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatShout;
  #106 = Utf8               handleChat
  #107 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #108 = Utf8               players
  #109 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #110 = Utf8               type
  #111 = Utf8               player
  #112 = Utf8               target
  #113 = Utf8               text
  #114 = Utf8               cs
  #115 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #116 = Utf8               StackMapTable
  #117 = Utf8               getChatTypeList
  #118 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #119 = Utf8               <clinit>
  #120 = Utf8               SourceFile
  #121 = Utf8               ChatShout.java
{
  public ext.mods.gameserver.handler.chathandlers.ChatShout();
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
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatShout;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         4: getstatic     #13                 // Field ext/mods/gameserver/enums/FloodProtector.GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
         7: invokevirtual #19                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        10: ifne          14
        13: return
        14: new           #25                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        17: dup
        18: aload_2
        19: aload_1
        20: aload         4
        22: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        25: astore        5
        27: getstatic     #30                 // Field ext/mods/Config.GLOBAL_CHAT:Ljava/lang/String;
        30: ldc           #35                 // String global
        32: invokevirtual #37                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        35: ifne          56
        38: getstatic     #30                 // Field ext/mods/Config.GLOBAL_CHAT:Ljava/lang/String;
        41: ldc           #43                 // String gm
        43: invokevirtual #37                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        46: ifeq          112
        49: aload_2
        50: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        53: ifeq          112
        56: invokestatic  #49                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        59: invokevirtual #55                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        62: invokeinterface #59,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        67: astore        6
        69: aload         6
        71: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        76: ifeq          109
        79: aload         6
        81: invokeinterface #70,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        86: checkcast     #8                  // class ext/mods/gameserver/model/actor/Player
        89: astore        7
        91: aload         7
        93: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
        96: ifne          106
        99: aload         7
       101: aload         5
       103: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       106: goto          69
       109: goto          138
       112: getstatic     #30                 // Field ext/mods/Config.GLOBAL_CHAT:Ljava/lang/String;
       115: ldc           #81                 // String on
       117: invokevirtual #37                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       120: ifeq          138
       123: aload_2
       124: new           #25                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       127: dup
       128: aload_2
       129: aload_1
       130: aload         4
       132: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
       135: invokestatic  #83                 // Method ext/mods/gameserver/model/World.broadcastToSameRegion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       138: return
      LineNumberTable:
        line 38: 0
        line 39: 13
        line 41: 14
        line 42: 27
        line 44: 56
        line 46: 91
        line 47: 99
        line 48: 106
        line 50: 112
        line 51: 123
        line 52: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           91      15     7 players   Lext/mods/gameserver/model/actor/Player;
            0     139     0  this   Lext/mods/gameserver/handler/chathandlers/ChatShout;
            0     139     1  type   Lext/mods/gameserver/enums/SayType;
            0     139     2 player   Lext/mods/gameserver/model/actor/Player;
            0     139     3 target   Ljava/lang/String;
            0     139     4  text   Ljava/lang/String;
           27     112     5    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
      StackMapTable: number_of_entries = 7
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
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
         0: getstatic     #87                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatShout;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #93                 // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #95                 // Field ext/mods/gameserver/enums/SayType.SHOUT:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #87                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 30: 0
}
SourceFile: "ChatShout.java"
