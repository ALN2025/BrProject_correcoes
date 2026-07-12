// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.VoicedQuest
// File: ext\mods\gameserver\handler\voicedcommandhandlers\VoicedQuest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest.class
  Last modified 9 de jul de 2026; size 1219 bytes
  MD5 checksum 7c97fdb3febb56a0952542dd21d03779
  Compiled from "VoicedQuest.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.VoicedQuest implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = String             #8             // quest
   #8 = Utf8               quest
   #9 = Methodref          #10.#11        // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #10 = Class              #12            // java/lang/String
  #11 = NameAndType        #13:#14        // startsWith:(Ljava/lang/String;)Z
  #12 = Utf8               java/lang/String
  #13 = Utf8               startsWith
  #14 = Utf8               (Ljava/lang/String;)Z
  #15 = Methodref          #16.#17        // ext/mods/quests/QuestManager.getInstance:()Lext/mods/quests/QuestManager;
  #16 = Class              #18            // ext/mods/quests/QuestManager
  #17 = NameAndType        #19:#20        // getInstance:()Lext/mods/quests/QuestManager;
  #18 = Utf8               ext/mods/quests/QuestManager
  #19 = Utf8               getInstance
  #20 = Utf8               ()Lext/mods/quests/QuestManager;
  #21 = Methodref          #16.#22        // ext/mods/quests/QuestManager.showMenuQuest:(Lext/mods/gameserver/model/actor/Player;I)V
  #22 = NameAndType        #23:#24        // showMenuQuest:(Lext/mods/gameserver/model/actor/Player;I)V
  #23 = Utf8               showMenuQuest
  #24 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #25 = Fieldref           #26.#27        // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest.VOICED_COMMANDS:[Ljava/lang/String;
  #26 = Class              #28            // ext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest
  #27 = NameAndType        #29:#30        // VOICED_COMMANDS:[Ljava/lang/String;
  #28 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest
  #29 = Utf8               VOICED_COMMANDS
  #30 = Utf8               [Ljava/lang/String;
  #31 = Class              #32            // ext/mods/gameserver/handler/IVoicedCommandHandler
  #32 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest;
  #38 = Utf8               useVoicedCommand
  #39 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #40 = Utf8               command
  #41 = Utf8               Ljava/lang/String;
  #42 = Utf8               player
  #43 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #44 = Utf8               target
  #45 = Utf8               StackMapTable
  #46 = Utf8               getVoicedCommandList
  #47 = Utf8               ()[Ljava/lang/String;
  #48 = Utf8               <clinit>
  #49 = Utf8               SourceFile
  #50 = Utf8               VoicedQuest.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.VoicedQuest();
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
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_1
         1: ldc           #7                  // String quest
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          17
         9: invokestatic  #15                 // Method ext/mods/quests/QuestManager.getInstance:()Lext/mods/quests/QuestManager;
        12: aload_2
        13: iconst_1
        14: invokevirtual #21                 // Method ext/mods/quests/QuestManager.showMenuQuest:(Lext/mods/gameserver/model/actor/Player;I)V
        17: iconst_1
        18: ireturn
      LineNumberTable:
        line 34: 0
        line 36: 9
        line 38: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest;
            0      19     1 command   Ljava/lang/String;
            0      19     2 player   Lext/mods/gameserver/model/actor/Player;
            0      19     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #25                 // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/VoicedQuest;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String quest
         8: aastore
         9: putstatic     #25                 // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 26: 0
}
SourceFile: "VoicedQuest.java"
