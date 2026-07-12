// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatHeroVoice
// File: ext\mods\gameserver\handler\chathandlers\ChatHeroVoice.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatHeroVoice.class
  Last modified 9 de jul de 2026; size 1813 bytes
  MD5 checksum aeb4faa0dbc06a61ad2acbe44246a654
  Compiled from "ChatHeroVoice.java"
public class ext.mods.gameserver.handler.chathandlers.ChatHeroVoice implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #41                         // ext/mods/gameserver/handler/chathandlers/ChatHeroVoice
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/actor/Player.isHero:()Z
   #8 = Class              #10            // ext/mods/gameserver/model/actor/Player
   #9 = NameAndType        #11:#12        // isHero:()Z
  #10 = Utf8               ext/mods/gameserver/model/actor/Player
  #11 = Utf8               isHero
  #12 = Utf8               ()Z
  #13 = Methodref          #8.#14         // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #14 = NameAndType        #15:#16        // getClient:()Lext/mods/gameserver/network/GameClient;
  #15 = Utf8               getClient
  #16 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #17 = Fieldref           #18.#19        // ext/mods/gameserver/enums/FloodProtector.HERO_VOICE:Lext/mods/gameserver/enums/FloodProtector;
  #18 = Class              #20            // ext/mods/gameserver/enums/FloodProtector
  #19 = NameAndType        #21:#22        // HERO_VOICE:Lext/mods/gameserver/enums/FloodProtector;
  #20 = Utf8               ext/mods/gameserver/enums/FloodProtector
  #21 = Utf8               HERO_VOICE
  #22 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
  #23 = Methodref          #24.#25        // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #24 = Class              #26            // ext/mods/gameserver/network/GameClient
  #25 = NameAndType        #27:#28        // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
  #26 = Utf8               ext/mods/gameserver/network/GameClient
  #27 = Utf8               performAction
  #28 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
  #29 = Class              #30            // ext/mods/gameserver/network/serverpackets/CreatureSay
  #30 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #31 = Methodref          #29.#32        // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #32 = NameAndType        #5:#33         // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #33 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #34 = Methodref          #35.#36        // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #35 = Class              #37            // ext/mods/gameserver/model/World
  #36 = NameAndType        #38:#39        // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #37 = Utf8               ext/mods/gameserver/model/World
  #38 = Utf8               toAllOnlinePlayers
  #39 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #40 = Fieldref           #41.#42        // ext/mods/gameserver/handler/chathandlers/ChatHeroVoice.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #41 = Class              #43            // ext/mods/gameserver/handler/chathandlers/ChatHeroVoice
  #42 = NameAndType        #44:#45        // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #43 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatHeroVoice
  #44 = Utf8               COMMAND_IDS
  #45 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #46 = Class              #47            // ext/mods/gameserver/enums/SayType
  #47 = Utf8               ext/mods/gameserver/enums/SayType
  #48 = Fieldref           #46.#49        // ext/mods/gameserver/enums/SayType.HERO_VOICE:Lext/mods/gameserver/enums/SayType;
  #49 = NameAndType        #21:#50        // HERO_VOICE:Lext/mods/gameserver/enums/SayType;
  #50 = Utf8               Lext/mods/gameserver/enums/SayType;
  #51 = Class              #52            // ext/mods/gameserver/handler/IChatHandler
  #52 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatHeroVoice;
  #58 = Utf8               handleChat
  #59 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #60 = Utf8               type
  #61 = Utf8               player
  #62 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #63 = Utf8               target
  #64 = Utf8               Ljava/lang/String;
  #65 = Utf8               text
  #66 = Utf8               StackMapTable
  #67 = Utf8               getChatTypeList
  #68 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #69 = Utf8               <clinit>
  #70 = Utf8               SourceFile
  #71 = Utf8               ChatHeroVoice.java
{
  public ext.mods.gameserver.handler.chathandlers.ChatHeroVoice();
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
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatHeroVoice;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
         4: ifne          8
         7: return
         8: aload_2
         9: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        12: getstatic     #17                 // Field ext/mods/gameserver/enums/FloodProtector.HERO_VOICE:Lext/mods/gameserver/enums/FloodProtector;
        15: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        18: ifne          22
        21: return
        22: new           #29                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
        25: dup
        26: aload_2
        27: aload_1
        28: aload         4
        30: invokespecial #31                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
        33: invokestatic  #34                 // Method ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: return
      LineNumberTable:
        line 37: 0
        line 38: 7
        line 40: 8
        line 41: 21
        line 43: 22
        line 44: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/handler/chathandlers/ChatHeroVoice;
            0      37     1  type   Lext/mods/gameserver/enums/SayType;
            0      37     2 player   Lext/mods/gameserver/model/actor/Player;
            0      37     3 target   Ljava/lang/String;
            0      37     4  text   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 13 /* same */

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #40                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatHeroVoice;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #46                 // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #48                 // Field ext/mods/gameserver/enums/SayType.HERO_VOICE:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #40                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "ChatHeroVoice.java"
