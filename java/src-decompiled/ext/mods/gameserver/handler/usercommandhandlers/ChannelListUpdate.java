// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.ChannelListUpdate
// File: ext\mods\gameserver\handler\usercommandhandlers\ChannelListUpdate.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate.class
  Last modified 9 de jul de 2026; size 1565 bytes
  MD5 checksum 11bd84a8afd39600754b627001d1d795
  Compiled from "ChannelListUpdate.java"
public class ext.mods.gameserver.handler.usercommandhandlers.ChannelListUpdate implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #29                         // ext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate
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
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
  #14 = Class              #16            // ext/mods/gameserver/model/group/Party
  #15 = NameAndType        #17:#18        // getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
  #16 = Utf8               ext/mods/gameserver/model/group/Party
  #17 = Utf8               getCommandChannel
  #18 = Utf8               ()Lext/mods/gameserver/model/group/CommandChannel;
  #19 = Class              #20            // ext/mods/gameserver/network/serverpackets/ExMultiPartyCommandChannelInfo
  #20 = Utf8               ext/mods/gameserver/network/serverpackets/ExMultiPartyCommandChannelInfo
  #21 = Methodref          #19.#22        // ext/mods/gameserver/network/serverpackets/ExMultiPartyCommandChannelInfo."<init>":(Lext/mods/gameserver/model/group/CommandChannel;)V
  #22 = NameAndType        #5:#23         // "<init>":(Lext/mods/gameserver/model/group/CommandChannel;)V
  #23 = Utf8               (Lext/mods/gameserver/model/group/CommandChannel;)V
  #24 = Methodref          #8.#25         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #25 = NameAndType        #26:#27        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #26 = Utf8               sendPacket
  #27 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #28 = Fieldref           #29.#30        // ext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate.COMMAND_IDS:[I
  #29 = Class              #31            // ext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate
  #30 = NameAndType        #32:#33        // COMMAND_IDS:[I
  #31 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate
  #32 = Utf8               COMMAND_IDS
  #33 = Utf8               [I
  #34 = Class              #35            // ext/mods/gameserver/handler/IUserCommandHandler
  #35 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate;
  #41 = Utf8               useUserCommand
  #42 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #43 = Utf8               id
  #44 = Utf8               I
  #45 = Utf8               player
  #46 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #47 = Utf8               party
  #48 = Utf8               Lext/mods/gameserver/model/group/Party;
  #49 = Utf8               channel
  #50 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
  #51 = Utf8               StackMapTable
  #52 = Class              #53            // ext/mods/gameserver/model/group/CommandChannel
  #53 = Utf8               ext/mods/gameserver/model/group/CommandChannel
  #54 = Utf8               getUserCommandList
  #55 = Utf8               ()[I
  #56 = Utf8               <clinit>
  #57 = Utf8               SourceFile
  #58 = Utf8               ChannelListUpdate.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.ChannelListUpdate();
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
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: aload_3
        11: invokevirtual #13                 // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
        14: astore        4
        16: aload         4
        18: ifnonnull     22
        21: return
        22: aload_2
        23: new           #19                 // class ext/mods/gameserver/network/serverpackets/ExMultiPartyCommandChannelInfo
        26: dup
        27: aload         4
        29: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/ExMultiPartyCommandChannelInfo."<init>":(Lext/mods/gameserver/model/group/CommandChannel;)V
        32: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: return
      LineNumberTable:
        line 36: 0
        line 37: 5
        line 38: 9
        line 40: 10
        line 41: 16
        line 42: 21
        line 44: 22
        line 45: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate;
            0      36     1    id   I
            0      36     2 player   Lext/mods/gameserver/model/actor/Player;
            5      31     3 party   Lext/mods/gameserver/model/group/Party;
           16      20     4 channel   Lext/mods/gameserver/model/group/CommandChannel;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/group/Party ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/group/CommandChannel ]

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #28                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelListUpdate;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        97
         7: iastore
         8: putstatic     #28                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "ChannelListUpdate.java"
