// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatTell
// File: ext\mods\gameserver\handler\chathandlers\ChatTell.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatTell.class
  Last modified 9 de jul de 2026; size 3543 bytes
  MD5 checksum e0e96ec066aaa3a7fff878bd16829bf1
  Compiled from "ChatTell.java"
public class ext.mods.gameserver.handler.chathandlers.ChatTell implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #103                        // ext/mods/gameserver/handler/chathandlers/ChatTell
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
    #8 = Class              #10           // ext/mods/gameserver/model/World
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/model/World;
   #10 = Utf8               ext/mods/gameserver/model/World
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/model/World;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #14 = NameAndType        #15:#16       // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #15 = Utf8               getPlayer
   #16 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
   #18 = Class              #20           // ext/mods/gameserver/model/actor/Player
   #19 = NameAndType        #21:#22       // getClient:()Lext/mods/gameserver/network/GameClient;
   #20 = Utf8               ext/mods/gameserver/model/actor/Player
   #21 = Utf8               getClient
   #22 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #23 = Methodref          #24.#25       // ext/mods/gameserver/network/GameClient.isDetached:()Z
   #24 = Class              #26           // ext/mods/gameserver/network/GameClient
   #25 = NameAndType        #27:#28       // isDetached:()Z
   #26 = Utf8               ext/mods/gameserver/network/GameClient
   #27 = Utf8               isDetached
   #28 = Utf8               ()Z
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Class              #32           // ext/mods/gameserver/network/SystemMessageId
   #31 = NameAndType        #33:#34       // TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #32 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #33 = Utf8               TARGET_IS_NOT_FOUND_IN_THE_GAME
   #34 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #35 = Methodref          #18.#36       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #36 = NameAndType        #37:#38       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #37 = Utf8               sendPacket
   #38 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #39 = Methodref          #18.#40       // ext/mods/gameserver/model/actor/Player.isInJail:()Z
   #40 = NameAndType        #41:#28       // isInJail:()Z
   #41 = Utf8               isInJail
   #42 = Methodref          #18.#43       // ext/mods/gameserver/model/actor/Player.isChatBanned:()Z
   #43 = NameAndType        #44:#28       // isChatBanned:()Z
   #44 = Utf8               isChatBanned
   #45 = Fieldref           #30.#46       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_CHAT_BANNED:Lext/mods/gameserver/network/SystemMessageId;
   #46 = NameAndType        #47:#34       // TARGET_IS_CHAT_BANNED:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               TARGET_IS_CHAT_BANNED
   #48 = Methodref          #18.#49       // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #49 = NameAndType        #50:#28       // isGM:()Z
   #50 = Utf8               isGM
   #51 = Methodref          #18.#52       // ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
   #52 = NameAndType        #53:#28       // isBlockingAll:()Z
   #53 = Utf8               isBlockingAll
   #54 = Fieldref           #30.#55       // ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
   #55 = NameAndType        #56:#34       // S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
   #56 = Utf8               S1_BLOCKED_EVERYTHING
   #57 = Methodref          #58.#59       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #58 = Class              #60           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #59 = NameAndType        #61:#62       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #60 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #61 = Utf8               getSystemMessage
   #62 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #63 = Methodref          #58.#64       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #64 = NameAndType        #65:#66       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #65 = Utf8               addCharName
   #66 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #67 = Methodref          #18.#68       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #68 = NameAndType        #37:#69       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #69 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #70 = Methodref          #71.#72       // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #71 = Class              #73           // ext/mods/gameserver/data/manager/RelationManager
   #72 = NameAndType        #11:#74       // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
   #73 = Utf8               ext/mods/gameserver/data/manager/RelationManager
   #74 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
   #75 = Methodref          #71.#76       // ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #76 = NameAndType        #77:#78       // isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #77 = Utf8               isInBlockList
   #78 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #79 = Fieldref           #30.#80       // ext/mods/gameserver/network/SystemMessageId.THE_PERSON_IS_IN_MESSAGE_REFUSAL_MODE:Lext/mods/gameserver/network/SystemMessageId;
   #80 = NameAndType        #81:#34       // THE_PERSON_IS_IN_MESSAGE_REFUSAL_MODE:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Utf8               THE_PERSON_IS_IN_MESSAGE_REFUSAL_MODE
   #82 = Class              #83           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #83 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #84 = Methodref          #82.#85       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #85 = NameAndType        #5:#86        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #87 = Methodref          #18.#88       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #88 = NameAndType        #89:#90       // getObjectId:()I
   #89 = Utf8               getObjectId
   #90 = Utf8               ()I
   #91 = Methodref          #18.#92       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #92 = NameAndType        #93:#94       // getName:()Ljava/lang/String;
   #93 = Utf8               getName
   #94 = Utf8               ()Ljava/lang/String;
   #95 = InvokeDynamic      #0:#96        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #96 = NameAndType        #97:#98       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #97 = Utf8               makeConcatWithConstants
   #98 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #99 = Methodref          #82.#100      // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #100 = NameAndType        #5:#101       // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #101 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #102 = Fieldref           #103.#104     // ext/mods/gameserver/handler/chathandlers/ChatTell.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #103 = Class              #105          // ext/mods/gameserver/handler/chathandlers/ChatTell
  #104 = NameAndType        #106:#107     // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #105 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatTell
  #106 = Utf8               COMMAND_IDS
  #107 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #108 = Class              #109          // ext/mods/gameserver/enums/SayType
  #109 = Utf8               ext/mods/gameserver/enums/SayType
  #110 = Fieldref           #108.#111     // ext/mods/gameserver/enums/SayType.TELL:Lext/mods/gameserver/enums/SayType;
  #111 = NameAndType        #112:#113     // TELL:Lext/mods/gameserver/enums/SayType;
  #112 = Utf8               TELL
  #113 = Utf8               Lext/mods/gameserver/enums/SayType;
  #114 = Class              #115          // ext/mods/gameserver/handler/IChatHandler
  #115 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #116 = Utf8               Code
  #117 = Utf8               LineNumberTable
  #118 = Utf8               LocalVariableTable
  #119 = Utf8               this
  #120 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatTell;
  #121 = Utf8               handleChat
  #122 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #123 = Utf8               type
  #124 = Utf8               player
  #125 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #126 = Utf8               target
  #127 = Utf8               Ljava/lang/String;
  #128 = Utf8               text
  #129 = Utf8               targetPlayer
  #130 = Utf8               StackMapTable
  #131 = Utf8               getChatTypeList
  #132 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #133 = Utf8               <clinit>
  #134 = Utf8               SourceFile
  #135 = Utf8               ChatTell.java
  #136 = Utf8               BootstrapMethods
  #137 = String             #138          // ->\u0001
  #138 = Utf8               ->\u0001
  #139 = MethodHandle       6:#140        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #140 = Methodref          #141.#142     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #141 = Class              #143          // java/lang/invoke/StringConcatFactory
  #142 = NameAndType        #97:#144      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #143 = Utf8               java/lang/invoke/StringConcatFactory
  #144 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #145 = Utf8               InnerClasses
  #146 = Class              #147          // java/lang/invoke/MethodHandles$Lookup
  #147 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #148 = Class              #149          // java/lang/invoke/MethodHandles
  #149 = Utf8               java/lang/invoke/MethodHandles
  #150 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.chathandlers.ChatTell();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatTell;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=5
         0: aload_3
         1: ifnonnull     5
         4: return
         5: invokestatic  #7                  // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         8: aload_3
         9: invokevirtual #13                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
        12: astore        5
        14: aload         5
        16: ifnull        30
        19: aload         5
        21: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        24: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        27: ifeq          38
        30: aload_2
        31: getstatic     #29                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        34: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        37: return
        38: aload         5
        40: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
        43: ifne          54
        46: aload         5
        48: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.isChatBanned:()Z
        51: ifeq          62
        54: aload_2
        55: getstatic     #45                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_CHAT_BANNED:Lext/mods/gameserver/network/SystemMessageId;
        58: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        61: return
        62: aload_2
        63: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        66: ifne          113
        69: aload         5
        71: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
        74: ifeq          93
        77: aload_2
        78: getstatic     #54                 // Field ext/mods/gameserver/network/SystemMessageId.S1_BLOCKED_EVERYTHING:Lext/mods/gameserver/network/SystemMessageId;
        81: invokestatic  #57                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        84: aload         5
        86: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        89: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        92: return
        93: invokestatic  #70                 // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
        96: aload         5
        98: aload_2
        99: invokevirtual #75                 // Method ext/mods/gameserver/data/manager/RelationManager.isInBlockList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
       102: ifeq          113
       105: aload_2
       106: getstatic     #79                 // Field ext/mods/gameserver/network/SystemMessageId.THE_PERSON_IS_IN_MESSAGE_REFUSAL_MODE:Lext/mods/gameserver/network/SystemMessageId;
       109: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       112: return
       113: aload         5
       115: new           #82                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       118: dup
       119: aload_2
       120: aload_1
       121: aload         4
       123: invokespecial #84                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
       126: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: aload_2
       130: new           #82                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       133: dup
       134: aload_2
       135: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       138: aload_1
       139: aload         5
       141: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       144: invokedynamic #95,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       149: aload         4
       151: invokespecial #99                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
       154: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       157: return
      LineNumberTable:
        line 39: 0
        line 40: 4
        line 42: 5
        line 43: 14
        line 45: 30
        line 46: 37
        line 49: 38
        line 51: 54
        line 52: 61
        line 55: 62
        line 57: 69
        line 59: 77
        line 60: 92
        line 63: 93
        line 65: 105
        line 66: 112
        line 70: 113
        line 71: 129
        line 72: 157
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     158     0  this   Lext/mods/gameserver/handler/chathandlers/ChatTell;
            0     158     1  type   Lext/mods/gameserver/enums/SayType;
            0     158     2 player   Lext/mods/gameserver/model/actor/Player;
            0     158     3 target   Ljava/lang/String;
            0     158     4  text   Ljava/lang/String;
           14     144     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 7
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 15 /* same */
        frame_type = 7 /* same */
        frame_type = 30 /* same */
        frame_type = 19 /* same */

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #102                // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatTell;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #108                // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #110                // Field ext/mods/gameserver/enums/SayType.TELL:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #102                // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "ChatTell.java"
BootstrapMethods:
  0: #139 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #137 ->\u0001
InnerClasses:
  public static final #150= #146 of #148; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
