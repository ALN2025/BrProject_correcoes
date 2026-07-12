// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.ChannelDelete
// File: ext\mods\gameserver\handler\usercommandhandlers\ChannelDelete.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/ChannelDelete.class
  Last modified 9 de jul de 2026; size 1423 bytes
  MD5 checksum de70c731a1187ea69769cbe1b8d76e87
  Compiled from "ChannelDelete.java"
public class ext.mods.gameserver.handler.usercommandhandlers.ChannelDelete implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #30                         // ext/mods/gameserver/handler/usercommandhandlers/ChannelDelete
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
  #23 = Methodref          #24.#15        // ext/mods/gameserver/model/group/CommandChannel.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
  #24 = Class              #25            // ext/mods/gameserver/model/group/CommandChannel
  #25 = Utf8               ext/mods/gameserver/model/group/CommandChannel
  #26 = Methodref          #24.#27        // ext/mods/gameserver/model/group/CommandChannel.disband:()V
  #27 = NameAndType        #28:#6         // disband:()V
  #28 = Utf8               disband
  #29 = Fieldref           #30.#31        // ext/mods/gameserver/handler/usercommandhandlers/ChannelDelete.COMMAND_IDS:[I
  #30 = Class              #32            // ext/mods/gameserver/handler/usercommandhandlers/ChannelDelete
  #31 = NameAndType        #33:#34        // COMMAND_IDS:[I
  #32 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/ChannelDelete
  #33 = Utf8               COMMAND_IDS
  #34 = Utf8               [I
  #35 = Class              #36            // ext/mods/gameserver/handler/IUserCommandHandler
  #36 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/ChannelDelete;
  #42 = Utf8               useUserCommand
  #43 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #44 = Utf8               id
  #45 = Utf8               I
  #46 = Utf8               player
  #47 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #48 = Utf8               party
  #49 = Utf8               Lext/mods/gameserver/model/group/Party;
  #50 = Utf8               channel
  #51 = Utf8               Lext/mods/gameserver/model/group/CommandChannel;
  #52 = Utf8               StackMapTable
  #53 = Utf8               getUserCommandList
  #54 = Utf8               ()[I
  #55 = Utf8               <clinit>
  #56 = Utf8               SourceFile
  #57 = Utf8               ChannelDelete.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.ChannelDelete();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelDelete;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
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
        26: ifnull        38
        29: aload         4
        31: aload_2
        32: invokevirtual #23                 // Method ext/mods/gameserver/model/group/CommandChannel.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
        35: ifne          39
        38: return
        39: aload         4
        41: invokevirtual #26                 // Method ext/mods/gameserver/model/group/CommandChannel.disband:()V
        44: return
      LineNumberTable:
        line 35: 0
        line 36: 5
        line 37: 17
        line 39: 18
        line 40: 24
        line 41: 38
        line 43: 39
        line 44: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelDelete;
            0      45     1    id   I
            0      45     2 player   Lext/mods/gameserver/model/actor/Player;
            5      40     3 party   Lext/mods/gameserver/model/group/Party;
           24      21     4 channel   Lext/mods/gameserver/model/group/CommandChannel;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/group/Party ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/group/CommandChannel ]
        frame_type = 0 /* same */

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #29                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ChannelDelete;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        93
         7: iastore
         8: putstatic     #29                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 27: 0
}
SourceFile: "ChannelDelete.java"
