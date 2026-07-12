// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatAlliance
// File: ext\mods\gameserver\handler\chathandlers\ChatAlliance.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatAlliance.class
  Last modified 9 de jul de 2026; size 1733 bytes
  MD5 checksum 7b95c960cfd7089aa8615c2f11e9888f
  Compiled from "ChatAlliance.java"
public class ext.mods.gameserver.handler.chathandlers.ChatAlliance implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/chathandlers/ChatAlliance
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
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #14 = Class              #16            // ext/mods/gameserver/model/pledge/Clan
  #15 = NameAndType        #17:#18        // getAllyId:()I
  #16 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #17 = Utf8               getAllyId
  #18 = Utf8               ()I
  #19 = Class              #20            // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #20 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #21 = Class              #22            // ext/mods/gameserver/network/serverpackets/CreatureSay
  #22 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #23 = Methodref          #21.#24        // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #24 = NameAndType        #5:#25         // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #25 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #26 = Methodref          #14.#27        // ext/mods/gameserver/model/pledge/Clan.broadcastToAllyMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #27 = NameAndType        #28:#29        // broadcastToAllyMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #28 = Utf8               broadcastToAllyMembers
  #29 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #30 = Fieldref           #31.#32        // ext/mods/gameserver/handler/chathandlers/ChatAlliance.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #31 = Class              #33            // ext/mods/gameserver/handler/chathandlers/ChatAlliance
  #32 = NameAndType        #34:#35        // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #33 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatAlliance
  #34 = Utf8               COMMAND_IDS
  #35 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #36 = Class              #37            // ext/mods/gameserver/enums/SayType
  #37 = Utf8               ext/mods/gameserver/enums/SayType
  #38 = Fieldref           #36.#39        // ext/mods/gameserver/enums/SayType.ALLIANCE:Lext/mods/gameserver/enums/SayType;
  #39 = NameAndType        #40:#41        // ALLIANCE:Lext/mods/gameserver/enums/SayType;
  #40 = Utf8               ALLIANCE
  #41 = Utf8               Lext/mods/gameserver/enums/SayType;
  #42 = Class              #43            // ext/mods/gameserver/handler/IChatHandler
  #43 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #44 = Utf8               Code
  #45 = Utf8               LineNumberTable
  #46 = Utf8               LocalVariableTable
  #47 = Utf8               this
  #48 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatAlliance;
  #49 = Utf8               handleChat
  #50 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #51 = Utf8               type
  #52 = Utf8               player
  #53 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #54 = Utf8               target
  #55 = Utf8               Ljava/lang/String;
  #56 = Utf8               text
  #57 = Utf8               clan
  #58 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #59 = Utf8               StackMapTable
  #60 = Utf8               getChatTypeList
  #61 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #62 = Utf8               <clinit>
  #63 = Utf8               SourceFile
  #64 = Utf8               ChatAlliance.java
{
  public ext.mods.gameserver.handler.chathandlers.ChatAlliance();
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
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatAlliance;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=6, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore        5
         6: aload         5
         8: ifnull        19
        11: aload         5
        13: invokevirtual #13                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        16: ifne          20
        19: return
        20: aload         5
        22: iconst_1
        23: anewarray     #19                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        26: dup
        27: iconst_0
        28: new           #21                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        31: dup
        32: aload_2
        33: aload_1
        34: aload         4
        36: invokespecial #23                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        39: aastore
        40: invokevirtual #26                 // Method ext/mods/gameserver/model/pledge/Clan.broadcastToAllyMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: return
      LineNumberTable:
        line 36: 0
        line 37: 6
        line 38: 19
        line 40: 20
        line 41: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/handler/chathandlers/ChatAlliance;
            0      44     1  type   Lext/mods/gameserver/enums/SayType;
            0      44     2 player   Lext/mods/gameserver/model/actor/Player;
            0      44     3 target   Ljava/lang/String;
            0      44     4  text   Ljava/lang/String;
            6      38     5  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 0 /* same */

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #30                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatAlliance;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #36                 // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #38                 // Field ext/mods/gameserver/enums/SayType.ALLIANCE:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #30                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "ChatAlliance.java"
