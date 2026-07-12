// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.Mount
// File: ext\mods\gameserver\handler\usercommandhandlers\Mount.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/Mount.class
  Last modified 9 de jul de 2026; size 972 bytes
  MD5 checksum 3994c9a891359c20b810b5936b9cf927
  Compiled from "Mount.java"
public class ext.mods.gameserver.handler.usercommandhandlers.Mount implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/handler/usercommandhandlers/Mount
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               getSummon
  #12 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/actor/Player.mountPlayer:(Lext/mods/gameserver/model/actor/Summon;)V
  #14 = NameAndType        #15:#16        // mountPlayer:(Lext/mods/gameserver/model/actor/Summon;)V
  #15 = Utf8               mountPlayer
  #16 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
  #17 = Fieldref           #18.#19        // ext/mods/gameserver/handler/usercommandhandlers/Mount.COMMAND_IDS:[I
  #18 = Class              #20            // ext/mods/gameserver/handler/usercommandhandlers/Mount
  #19 = NameAndType        #21:#22        // COMMAND_IDS:[I
  #20 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/Mount
  #21 = Utf8               COMMAND_IDS
  #22 = Utf8               [I
  #23 = Class              #24            // ext/mods/gameserver/handler/IUserCommandHandler
  #24 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/Mount;
  #30 = Utf8               useUserCommand
  #31 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #32 = Utf8               id
  #33 = Utf8               I
  #34 = Utf8               player
  #35 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #36 = Utf8               getUserCommandList
  #37 = Utf8               ()[I
  #38 = Utf8               <clinit>
  #39 = Utf8               SourceFile
  #40 = Utf8               Mount.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.Mount();
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
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Mount;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_2
         1: aload_2
         2: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.mountPlayer:(Lext/mods/gameserver/model/actor/Summon;)V
         8: return
      LineNumberTable:
        line 33: 0
        line 34: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Mount;
            0       9     1    id   I
            0       9     2 player   Lext/mods/gameserver/model/actor/Player;

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #17                 // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Mount;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        61
         7: iastore
         8: putstatic     #17                 // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 25: 0
}
SourceFile: "Mount.java"
