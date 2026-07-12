// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.BuffManagerVCmd
// File: ext\mods\gameserver\handler\voicedcommandhandlers\BuffManagerVCmd.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd.class
  Last modified 9 de jul de 2026; size 1307 bytes
  MD5 checksum 5e592b2843a482d630dd0085e63b98fa
  Compiled from "BuffManagerVCmd.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.BuffManagerVCmd implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #28                         // ext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // rembuff
   #8 = Utf8               rembuff
   #9 = Methodref          #10.#11        // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // equalsIgnoreCase:(Ljava/lang/String;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               equalsIgnoreCase
  #14 = Utf8               (Ljava/lang/String;)Z
  #15 = Methodref          #16.#17        // ext/mods/sellBuffEngine/BuffShopUIManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopUIManager;
  #16 = Class              #18            // ext/mods/sellBuffEngine/BuffShopUIManager
  #17 = NameAndType        #19:#20        // getInstance:()Lext/mods/sellBuffEngine/BuffShopUIManager;
  #18 = Utf8               ext/mods/sellBuffEngine/BuffShopUIManager
  #19 = Utf8               getInstance
  #20 = Utf8               ()Lext/mods/sellBuffEngine/BuffShopUIManager;
  #21 = String             #22            // player
  #22 = Utf8               player
  #23 = Methodref          #16.#24        // ext/mods/sellBuffEngine/BuffShopUIManager.showBuffRemovalWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #24 = NameAndType        #25:#26        // showBuffRemovalWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #25 = Utf8               showBuffRemovalWindow
  #26 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #27 = Fieldref           #28.#29        // ext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd.VOICED_COMMANDS:[Ljava/lang/String;
  #28 = Class              #30            // ext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd
  #29 = NameAndType        #31:#32        // VOICED_COMMANDS:[Ljava/lang/String;
  #30 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd
  #31 = Utf8               VOICED_COMMANDS
  #32 = Utf8               [Ljava/lang/String;
  #33 = Class              #34            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #34 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #35 = Utf8               Code
  #36 = Utf8               LineNumberTable
  #37 = Utf8               LocalVariableTable
  #38 = Utf8               this
  #39 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd;
  #40 = Utf8               useVoicedCommand
  #41 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #42 = Utf8               command
  #43 = Utf8               Ljava/lang/String;
  #44 = Utf8               activeChar
  #45 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #46 = Utf8               target
  #47 = Utf8               StackMapTable
  #48 = Utf8               getVoicedCommandList
  #49 = Utf8               ()[Ljava/lang/String;
  #50 = Utf8               <clinit>
  #51 = Utf8               SourceFile
  #52 = Utf8               BuffManagerVCmd.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.BuffManagerVCmd();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_1
         1: ldc           #7                  // String rembuff
         3: invokevirtual #9                  // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         6: ifeq          18
         9: invokestatic  #15                 // Method ext/mods/sellBuffEngine/BuffShopUIManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopUIManager;
        12: aload_2
        13: ldc           #21                 // String player
        15: invokevirtual #23                 // Method ext/mods/sellBuffEngine/BuffShopUIManager.showBuffRemovalWindow:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        18: iconst_1
        19: ireturn
      LineNumberTable:
        line 34: 0
        line 36: 9
        line 38: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd;
            0      20     1 command   Ljava/lang/String;
            0      20     2 activeChar   Lext/mods/gameserver/model/actor/Player;
            0      20     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #27                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/BuffManagerVCmd;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String rembuff
         8: aastore
         9: putstatic     #27                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 26: 0
}
SourceFile: "BuffManagerVCmd.java"
