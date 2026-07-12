// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatClan
// File: ext\mods\gameserver\handler\chathandlers\ChatClan.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatClan.class
  Last modified 9 de jul de 2026; size 1676 bytes
  MD5 checksum c70156bb138d25e3799bfcdbe3c3c9ca
  Compiled from "ChatClan.java"
public class ext.mods.gameserver.handler.chathandlers.ChatClan implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #27                         // ext/mods/gameserver/handler/chathandlers/ChatClan
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               getClan
  #12 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #13 = Class              #14            // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #14 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #15 = Class              #16            // ext/mods/gameserver/network/serverpackets/CreatureSay
  #16 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #17 = Methodref          #15.#18        // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #18 = NameAndType        #5:#19         // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #19 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #20 = Methodref          #21.#22        // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #21 = Class              #23            // ext/mods/gameserver/model/pledge/Clan
  #22 = NameAndType        #24:#25        // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #23 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #24 = Utf8               broadcastToMembers
  #25 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #26 = Fieldref           #27.#28        // ext/mods/gameserver/handler/chathandlers/ChatClan.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #27 = Class              #29            // ext/mods/gameserver/handler/chathandlers/ChatClan
  #28 = NameAndType        #30:#31        // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #29 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatClan
  #30 = Utf8               COMMAND_IDS
  #31 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #32 = Class              #33            // ext/mods/gameserver/enums/SayType
  #33 = Utf8               ext/mods/gameserver/enums/SayType
  #34 = Fieldref           #32.#35        // ext/mods/gameserver/enums/SayType.CLAN:Lext/mods/gameserver/enums/SayType;
  #35 = NameAndType        #36:#37        // CLAN:Lext/mods/gameserver/enums/SayType;
  #36 = Utf8               CLAN
  #37 = Utf8               Lext/mods/gameserver/enums/SayType;
  #38 = Class              #39            // ext/mods/gameserver/handler/IChatHandler
  #39 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #40 = Utf8               Code
  #41 = Utf8               LineNumberTable
  #42 = Utf8               LocalVariableTable
  #43 = Utf8               this
  #44 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatClan;
  #45 = Utf8               handleChat
  #46 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #47 = Utf8               type
  #48 = Utf8               player
  #49 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #50 = Utf8               target
  #51 = Utf8               Ljava/lang/String;
  #52 = Utf8               text
  #53 = Utf8               clan
  #54 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #55 = Utf8               StackMapTable
  #56 = Utf8               getChatTypeList
  #57 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #58 = Utf8               <clinit>
  #59 = Utf8               SourceFile
  #60 = Utf8               ChatClan.java
{
  public ext.mods.gameserver.handler.chathandlers.ChatClan();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatClan;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=6, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore        5
         6: aload         5
         8: ifnonnull     12
        11: return
        12: aload         5
        14: iconst_1
        15: anewarray     #13                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        18: dup
        19: iconst_0
        20: new           #15                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        23: dup
        24: aload_2
        25: aload_1
        26: aload         4
        28: invokespecial #17                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        31: aastore
        32: invokevirtual #20                 // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: return
      LineNumberTable:
        line 36: 0
        line 37: 6
        line 38: 11
        line 40: 12
        line 41: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/handler/chathandlers/ChatClan;
            0      36     1  type   Lext/mods/gameserver/enums/SayType;
            0      36     2 player   Lext/mods/gameserver/model/actor/Player;
            0      36     3 target   Ljava/lang/String;
            0      36     4  text   Ljava/lang/String;
            6      30     5  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #26                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatClan;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #32                 // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #34                 // Field ext/mods/gameserver/enums/SayType.CLAN:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #26                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "ChatClan.java"
