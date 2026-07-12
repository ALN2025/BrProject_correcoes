// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.Dismount
// File: ext\mods\gameserver\handler\usercommandhandlers\Dismount.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/Dismount.class
  Last modified 9 de jul de 2026; size 925 bytes
  MD5 checksum 2d78a34cfe8f8cf1baccfd4dffaa21b4
  Compiled from "Dismount.java"
public class ext.mods.gameserver.handler.usercommandhandlers.Dismount implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/gameserver/handler/usercommandhandlers/Dismount
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // isMounted:()Z
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               isMounted
  #12 = Utf8               ()Z
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/actor/Player.dismount:()V
  #14 = NameAndType        #15:#6         // dismount:()V
  #15 = Utf8               dismount
  #16 = Fieldref           #17.#18        // ext/mods/gameserver/handler/usercommandhandlers/Dismount.COMMAND_IDS:[I
  #17 = Class              #19            // ext/mods/gameserver/handler/usercommandhandlers/Dismount
  #18 = NameAndType        #20:#21        // COMMAND_IDS:[I
  #19 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/Dismount
  #20 = Utf8               COMMAND_IDS
  #21 = Utf8               [I
  #22 = Class              #23            // ext/mods/gameserver/handler/IUserCommandHandler
  #23 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #24 = Utf8               Code
  #25 = Utf8               LineNumberTable
  #26 = Utf8               LocalVariableTable
  #27 = Utf8               this
  #28 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/Dismount;
  #29 = Utf8               useUserCommand
  #30 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #31 = Utf8               id
  #32 = Utf8               I
  #33 = Utf8               player
  #34 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #35 = Utf8               StackMapTable
  #36 = Utf8               getUserCommandList
  #37 = Utf8               ()[I
  #38 = Utf8               <clinit>
  #39 = Utf8               SourceFile
  #40 = Utf8               Dismount.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.Dismount();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Dismount;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
         4: ifeq          11
         7: aload_2
         8: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.dismount:()V
        11: return
      LineNumberTable:
        line 33: 0
        line 34: 7
        line 35: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Dismount;
            0      12     1    id   I
            0      12     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #16                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Dismount;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        62
         7: iastore
         8: putstatic     #16                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 25: 0
}
SourceFile: "Dismount.java"
