// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatPetition
// File: ext\mods\gameserver\handler\chathandlers\ChatPetition.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatPetition.class
  Last modified 9 de jul de 2026; size 1873 bytes
  MD5 checksum 55fb83ffa5f89ea6822313d8e8ec9563
  Compiled from "ChatPetition.java"
public class ext.mods.gameserver.handler.chathandlers.ChatPetition implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #36                         // ext/mods/gameserver/handler/chathandlers/ChatPetition
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #8 = Class              #10            // ext/mods/gameserver/data/manager/PetitionManager
   #9 = NameAndType        #11:#12        // getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
  #10 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
  #11 = Utf8               getInstance
  #12 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
  #13 = Methodref          #8.#14         // ext/mods/gameserver/data/manager/PetitionManager.getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #14 = NameAndType        #15:#16        // getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #15 = Utf8               getPetitionInProcess
  #16 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
  #17 = Fieldref           #18.#19        // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_IN_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
  #18 = Class              #20            // ext/mods/gameserver/network/SystemMessageId
  #19 = NameAndType        #21:#22        // YOU_ARE_NOT_IN_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
  #20 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #21 = Utf8               YOU_ARE_NOT_IN_PETITION_CHAT
  #22 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #24 = Class              #26            // ext/mods/gameserver/model/actor/Player
  #25 = NameAndType        #27:#28        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #26 = Utf8               ext/mods/gameserver/model/actor/Player
  #27 = Utf8               sendPacket
  #28 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/Petition.sendMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #30 = Class              #32            // ext/mods/gameserver/model/Petition
  #31 = NameAndType        #33:#34        // sendMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #32 = Utf8               ext/mods/gameserver/model/Petition
  #33 = Utf8               sendMessage
  #34 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #35 = Fieldref           #36.#37        // ext/mods/gameserver/handler/chathandlers/ChatPetition.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #36 = Class              #38            // ext/mods/gameserver/handler/chathandlers/ChatPetition
  #37 = NameAndType        #39:#40        // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
  #38 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatPetition
  #39 = Utf8               COMMAND_IDS
  #40 = Utf8               [Lext/mods/gameserver/enums/SayType;
  #41 = Class              #42            // ext/mods/gameserver/enums/SayType
  #42 = Utf8               ext/mods/gameserver/enums/SayType
  #43 = Fieldref           #41.#44        // ext/mods/gameserver/enums/SayType.PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
  #44 = NameAndType        #45:#46        // PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
  #45 = Utf8               PETITION_PLAYER
  #46 = Utf8               Lext/mods/gameserver/enums/SayType;
  #47 = Fieldref           #41.#48        // ext/mods/gameserver/enums/SayType.PETITION_GM:Lext/mods/gameserver/enums/SayType;
  #48 = NameAndType        #49:#46        // PETITION_GM:Lext/mods/gameserver/enums/SayType;
  #49 = Utf8               PETITION_GM
  #50 = Class              #51            // ext/mods/gameserver/handler/IChatHandler
  #51 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatPetition;
  #57 = Utf8               handleChat
  #58 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #59 = Utf8               type
  #60 = Utf8               player
  #61 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #62 = Utf8               target
  #63 = Utf8               Ljava/lang/String;
  #64 = Utf8               text
  #65 = Utf8               petition
  #66 = Utf8               Lext/mods/gameserver/model/Petition;
  #67 = Utf8               StackMapTable
  #68 = Utf8               getChatTypeList
  #69 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #70 = Utf8               <clinit>
  #71 = Utf8               SourceFile
  #72 = Utf8               ChatPetition.java
{
  public ext.mods.gameserver.handler.chathandlers.ChatPetition();
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
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatPetition;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: invokestatic  #7                  // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
         3: aload_2
         4: invokevirtual #13                 // Method ext/mods/gameserver/data/manager/PetitionManager.getPetitionInProcess:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/Petition;
         7: astore        5
         9: aload         5
        11: ifnonnull     22
        14: aload_2
        15: getstatic     #17                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_IN_PETITION_CHAT:Lext/mods/gameserver/network/SystemMessageId;
        18: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        21: return
        22: aload         5
        24: aload_2
        25: aload         4
        27: invokevirtual #29                 // Method ext/mods/gameserver/model/Petition.sendMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        30: return
      LineNumberTable:
        line 38: 0
        line 39: 9
        line 41: 14
        line 42: 21
        line 45: 22
        line 46: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/handler/chathandlers/ChatPetition;
            0      31     1  type   Lext/mods/gameserver/enums/SayType;
            0      31     2 player   Lext/mods/gameserver/model/actor/Player;
            0      31     3 target   Ljava/lang/String;
            0      31     4  text   Ljava/lang/String;
            9      22     5 petition   Lext/mods/gameserver/model/Petition;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/Petition ]

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #35                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatPetition;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #41                 // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #43                 // Field ext/mods/gameserver/enums/SayType.PETITION_PLAYER:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #47                 // Field ext/mods/gameserver/enums/SayType.PETITION_GM:Lext/mods/gameserver/enums/SayType;
        15: aastore
        16: putstatic     #35                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        19: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "ChatPetition.java"
