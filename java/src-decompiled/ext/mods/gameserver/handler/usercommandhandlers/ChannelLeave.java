// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.ChannelLeave
// File: ext\mods\gameserver\handler\usercommandhandlers\ChannelLeave.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/ChannelLeave.class
  Last modified 9 de jul de 2026; size 2159 bytes
  MD5 checksum 1ea646fabba91716fb5ff9f4a8c8eaf2
  Compiled from "ChannelLeave.java"
public class ext.mods.gameserver.handler.usercommandhandlers.ChannelLeave implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #57                         // ext/mods/gameserver/handler/usercommandhandlers/ChannelLeave
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // getParty:()Lext/mods/gameserver/model/group/Party;
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               getParty
  #12 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #14 = Class              #16            // ext/mods/gameserver/model/group/Party
  #15 = NameAndType        #17:#18        // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #16 = Utf8               ext/mods/gameserver/model/group/Party
  #17 = Utf8               isLeader
  #18 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #19 = Methodref          #14.#20        // ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
  #20 = NameAndType        #21:#22        // getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
  #21 = Utf8               getCommandChannel
  #22 = Utf8               ()Lext/mods/gameserver/model/group/CommandChannel;
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/group/CommandChannel.removeParty:(Lext/mods/gameserver/model/group/Party;)Z
  #24 = Class              #26            // ext/mods/gameserver/model/group/CommandChannel
  #25 = NameAndType        #27:#28        // removeParty:(Lext/mods/gameserver/model/group/Party;)Z
  #26 = Utf8               ext/mods/gameserver/model/group/CommandChannel
  #27 = Utf8               removeParty
  #28 = Utf8               (Lext/mods/gameserver/model/group/Party;)Z
  #29 = Fieldref           #30.#31        // ext/mods/gameserver/network/SystemMessageId.LEFT_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
  #30 = Class              #32            // ext/mods/gameserver/network/SystemMessageId
  #31 = NameAndType        #33:#34        // LEFT_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
  #32 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #33 = Utf8               LEFT_COMMAND_CHANNEL
  #34 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #35 = Methodref          #14.#36        // ext/mods/gameserver/model/group/Party.broadcastMessage:(Lext/mods/gameserver/network/SystemMessageId;)V
  #36 = NameAndType        #37:#38        // broadcastMessage:(Lext/mods/gameserver/network/SystemMessageId;)V
  #37 = Utf8               broadcastMessage
  #38 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #39 = Fieldref           #30.#40        // ext/mods/gameserver/network/SystemMessageId.S1_PARTY_LEFT_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
  #40 = NameAndType        #41:#34        // S1_PARTY_LEFT_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
  #41 = Utf8               S1_PARTY_LEFT_COMMAND_CHANNEL
  #42 = Methodref          #43.#44        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #43 = Class              #45            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #44 = NameAndType        #46:#47        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #45 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #46 = Utf8               getSystemMessage
  #47 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #48 = Methodref          #43.#49        // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #49 = NameAndType        #50:#51        // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #50 = Utf8               addCharName
  #51 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #52 = Methodref          #24.#53        // ext/mods/gameserver/model/group/CommandChannel.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #53 = NameAndType        #54:#55        // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #54 = Utf8               broadcastPacket
  #55 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #56 = Fieldref           #57.#58        // ext/mods/gameserver/handler/usercommandhandlers/ChannelLeave.COMMAND_IDS:[I
  #57 = Class              #59            // ext/mods/gameserver/handler/usercommandhandlers/ChannelLeave
  #58 = NameAndType        #60:#61        // COMMAND_IDS:[I
  #59 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/ChannelLeave
  #60 = Utf8               COMMAND_IDS
  #61 = Utf8               [I
  #62 = Class              #63            // ext/mods/gameserver/handler/IUserCommandHandler
  #63 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #64 = Utf8               Code
  #65 = Utf8               LineNumberTable
  #66 = Utf8               LocalVariableTable
  #67 = Utf8               this
  #68 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/ChannelLeave;
  #69 = Utf8               useUserCommand
  #70 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #71 = Utf8               id
  #72 = Utf8               I
  #73 = Utf8               player
  #74 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #75 = Utf8               party
  #76 = Utf8               Lext/mods/gameserver/model/group/Party;
  #77 = Utf8               channel
  #78 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
  #79 = Utf8               StackMapTable
  #80 = Utf8               getUserCommandList
  #81 = Utf8               ()[I
  #82 = Utf8               <clinit>
  #83 = Utf8               SourceFile
  #84 = Utf8               ChannelLeave.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.ChannelLeave();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelLeave;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
         4: astore_3
         5: aload_3
         6: ifnull        17
         9: aload_3
        10: aload_2
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        14: ifne          18
        17: return
        18: aload_3
        19: invokevirtual #19                 // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
        22: astore        4
        24: aload         4
        26: ifnonnull     30
        29: return
        30: aload         4
        32: aload_3
        33: invokevirtual #23                 // Method ext/mods/gameserver/model/group/CommandChannel.removeParty:(Lext/mods/gameserver/model/group/Party;)Z
        36: pop
        37: aload_3
        38: getstatic     #29                 // Field ext/mods/gameserver/network/SystemMessageId.LEFT_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
        41: invokevirtual #35                 // Method ext/mods/gameserver/model/group/Party.broadcastMessage:(Lext/mods/gameserver/network/SystemMessageId;)V
        44: aload         4
        46: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.S1_PARTY_LEFT_COMMAND_CHANNEL:Lext/mods/gameserver/network/SystemMessageId;
        49: invokestatic  #42                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        52: aload_2
        53: invokevirtual #48                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        56: invokevirtual #52                 // Method ext/mods/gameserver/model/group/CommandChannel.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        59: return
      LineNumberTable:
        line 37: 0
        line 38: 5
        line 39: 17
        line 41: 18
        line 42: 24
        line 43: 29
        line 45: 30
        line 47: 37
        line 48: 44
        line 49: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelLeave;
            0      60     1    id   I
            0      60     2 player   Lext/mods/gameserver/model/actor/Player;
            5      55     3 party   Lext/mods/gameserver/model/group/Party;
           24      36     4 channel   Lext/mods/gameserver/model/group/CommandChannel;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/group/Party ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/group/CommandChannel ]

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #56                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelLeave;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        96
         7: iastore
         8: putstatic     #56                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "ChannelLeave.java"
