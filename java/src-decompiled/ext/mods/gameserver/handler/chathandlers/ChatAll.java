// Bytecode for: ext.mods.gameserver.handler.chathandlers.ChatAll
// File: ext\mods\gameserver\handler\chathandlers\ChatAll.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/chathandlers/ChatAll.class
  Last modified 9 de jul de 2026; size 3829 bytes
  MD5 checksum b57b0bfaff842b833d7cb1d9aa19ef1b
  Compiled from "ChatAll.java"
public class ext.mods.gameserver.handler.chathandlers.ChatAll implements ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #89                         // ext/mods/gameserver/handler/chathandlers/ChatAll
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getClient:()Lext/mods/gameserver/network/GameClient;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getClient
   #12 = Utf8               ()Lext/mods/gameserver/network/GameClient;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/FloodProtector.GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #14 = Class              #16           // ext/mods/gameserver/enums/FloodProtector
   #15 = NameAndType        #17:#18       // GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
   #16 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #17 = Utf8               GLOBAL_CHAT
   #18 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #20 = Class              #22           // ext/mods/gameserver/network/GameClient
   #21 = NameAndType        #23:#24       // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Utf8               performAction
   #24 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
   #25 = String             #26           // .
   #26 = Utf8               .
   #27 = Methodref          #28.#29       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #28 = Class              #30           // java/lang/String
   #29 = NameAndType        #31:#32       // startsWith:(Ljava/lang/String;)Z
   #30 = Utf8               java/lang/String
   #31 = Utf8               startsWith
   #32 = Utf8               (Ljava/lang/String;)Z
   #33 = Class              #34           // java/util/StringTokenizer
   #34 = Utf8               java/util/StringTokenizer
   #35 = Methodref          #33.#36       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #36 = NameAndType        #5:#37        // "<init>":(Ljava/lang/String;)V
   #37 = Utf8               (Ljava/lang/String;)V
   #38 = String             #39           //
   #39 = Utf8
   #40 = Methodref          #33.#41       // java/util/StringTokenizer.countTokens:()I
   #41 = NameAndType        #42:#43       // countTokens:()I
   #42 = Utf8               countTokens
   #43 = Utf8               ()I
   #44 = Methodref          #33.#45       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #45 = NameAndType        #46:#47       // nextToken:()Ljava/lang/String;
   #46 = Utf8               nextToken
   #47 = Utf8               ()Ljava/lang/String;
   #48 = Methodref          #28.#49       // java/lang/String.substring:(I)Ljava/lang/String;
   #49 = NameAndType        #50:#51       // substring:(I)Ljava/lang/String;
   #50 = Utf8               substring
   #51 = Utf8               (I)Ljava/lang/String;
   #52 = Methodref          #28.#53       // java/lang/String.length:()I
   #53 = NameAndType        #54:#43       // length:()I
   #54 = Utf8               length
   #55 = Methodref          #56.#57       // ext/mods/gameserver/handler/VoicedCommandHandler.getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
   #56 = Class              #58           // ext/mods/gameserver/handler/VoicedCommandHandler
   #57 = NameAndType        #59:#60       // getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
   #58 = Utf8               ext/mods/gameserver/handler/VoicedCommandHandler
   #59 = Utf8               getInstance
   #60 = Utf8               ()Lext/mods/gameserver/handler/VoicedCommandHandler;
   #61 = Methodref          #56.#62       // ext/mods/gameserver/handler/VoicedCommandHandler.getHandler:(Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #62 = NameAndType        #63:#64       // getHandler:(Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #63 = Utf8               getHandler
   #64 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #65 = InterfaceMethodref #66.#67       // ext/mods/gameserver/handler/IVoicedCommandHandler.useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #66 = Class              #68           // ext/mods/gameserver/handler/IVoicedCommandHandler
   #67 = NameAndType        #69:#70       // useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #68 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
   #69 = Utf8               useVoicedCommand
   #70 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #71 = Class              #72           // ext/mods/gameserver/network/serverpackets/CreatureSay
   #72 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #73 = Methodref          #71.#74       // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #74 = NameAndType        #5:#75        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
   #76 = Methodref          #8.#77        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #77 = NameAndType        #78:#79       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = Utf8               sendPacket
   #79 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #80 = InvokeDynamic      #0:#81        // #0:accept:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
   #81 = NameAndType        #82:#83       // accept:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
   #82 = Utf8               accept
   #83 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
   #84 = Methodref          #8.#85        // ext/mods/gameserver/model/actor/Player.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #85 = NameAndType        #86:#87       // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #86 = Utf8               forEachKnownTypeInRadius
   #87 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/handler/chathandlers/ChatAll.COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
   #89 = Class              #91           // ext/mods/gameserver/handler/chathandlers/ChatAll
   #90 = NameAndType        #92:#93       // COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
   #91 = Utf8               ext/mods/gameserver/handler/chathandlers/ChatAll
   #92 = Utf8               COMMAND_IDS
   #93 = Utf8               [Lext/mods/gameserver/enums/SayType;
   #94 = Class              #95           // ext/mods/gameserver/enums/SayType
   #95 = Utf8               ext/mods/gameserver/enums/SayType
   #96 = Fieldref           #94.#97       // ext/mods/gameserver/enums/SayType.ALL:Lext/mods/gameserver/enums/SayType;
   #97 = NameAndType        #98:#99       // ALL:Lext/mods/gameserver/enums/SayType;
   #98 = Utf8               ALL
   #99 = Utf8               Lext/mods/gameserver/enums/SayType;
  #100 = Class              #101          // ext/mods/gameserver/handler/IChatHandler
  #101 = Utf8               ext/mods/gameserver/handler/IChatHandler
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/gameserver/handler/chathandlers/ChatAll;
  #107 = Utf8               handleChat
  #108 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
  #109 = Utf8               vch
  #110 = Utf8               Lext/mods/gameserver/handler/IVoicedCommandHandler;
  #111 = Utf8               st
  #112 = Utf8               Ljava/util/StringTokenizer;
  #113 = Utf8               command
  #114 = Utf8               Ljava/lang/String;
  #115 = Utf8               cs
  #116 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #117 = Utf8               type
  #118 = Utf8               player
  #119 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #120 = Utf8               target
  #121 = Utf8               text
  #122 = Utf8               useHandler
  #123 = Utf8               Z
  #124 = Utf8               StackMapTable
  #125 = Utf8               getChatTypeList
  #126 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
  #127 = Utf8               lambda$handleChat$0
  #128 = Utf8               (Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #129 = Utf8               p
  #130 = Utf8               <clinit>
  #131 = Utf8               SourceFile
  #132 = Utf8               ChatAll.java
  #133 = Utf8               BootstrapMethods
  #134 = MethodType         #135          //  (Ljava/lang/Object;)V
  #135 = Utf8               (Ljava/lang/Object;)V
  #136 = MethodHandle       6:#137        // REF_invokeStatic ext/mods/gameserver/handler/chathandlers/ChatAll.lambda$handleChat$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #137 = Methodref          #89.#138      // ext/mods/gameserver/handler/chathandlers/ChatAll.lambda$handleChat$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #138 = NameAndType        #127:#128     // lambda$handleChat$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
  #139 = MethodType         #140          //  (Lext/mods/gameserver/model/actor/Player;)V
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #141 = MethodHandle       6:#142        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #142 = Methodref          #143.#144     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #143 = Class              #145          // java/lang/invoke/LambdaMetafactory
  #144 = NameAndType        #146:#147     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #145 = Utf8               java/lang/invoke/LambdaMetafactory
  #146 = Utf8               metafactory
  #147 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #148 = Utf8               InnerClasses
  #149 = Class              #150          // java/lang/invoke/MethodHandles$Lookup
  #150 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #151 = Class              #152          // java/lang/invoke/MethodHandles
  #152 = Utf8               java/lang/invoke/MethodHandles
  #153 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.chathandlers.ChatAll();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/chathandlers/ChatAll;

  public void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
         4: getstatic     #13                 // Field ext/mods/gameserver/enums/FloodProtector.GLOBAL_CHAT:Lext/mods/gameserver/enums/FloodProtector;
         7: invokevirtual #19                 // Method ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
        10: ifne          14
        13: return
        14: iconst_0
        15: istore        5
        17: aload         4
        19: ldc           #25                 // String .
        21: invokevirtual #27                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        24: ifeq          126
        27: new           #33                 // class java/util/StringTokenizer
        30: dup
        31: aload         4
        33: invokespecial #35                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        36: astore        6
        38: ldc           #38                 // String
        40: astore        8
        42: aload         6
        44: invokevirtual #40                 // Method java/util/StringTokenizer.countTokens:()I
        47: iconst_1
        48: if_icmple     88
        51: aload         6
        53: invokevirtual #44                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        56: iconst_1
        57: invokevirtual #48                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        60: astore        8
        62: aload         4
        64: aload         8
        66: invokevirtual #52                 // Method java/lang/String.length:()I
        69: iconst_2
        70: iadd
        71: invokevirtual #48                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        74: astore_3
        75: invokestatic  #55                 // Method ext/mods/gameserver/handler/VoicedCommandHandler.getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
        78: aload         8
        80: invokevirtual #61                 // Method ext/mods/gameserver/handler/VoicedCommandHandler.getHandler:(Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
        83: astore        7
        85: goto          106
        88: aload         4
        90: iconst_1
        91: invokevirtual #48                 // Method java/lang/String.substring:(I)Ljava/lang/String;
        94: astore        8
        96: invokestatic  #55                 // Method ext/mods/gameserver/handler/VoicedCommandHandler.getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
        99: aload         8
       101: invokevirtual #61                 // Method ext/mods/gameserver/handler/VoicedCommandHandler.getHandler:(Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
       104: astore        7
       106: aload         7
       108: ifnull        126
       111: aload         7
       113: aload         8
       115: aload_2
       116: aload_3
       117: invokeinterface #65,  4           // InterfaceMethod ext/mods/gameserver/handler/IVoicedCommandHandler.useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       122: pop
       123: iconst_1
       124: istore        5
       126: iload         5
       128: ifne          166
       131: new           #71                 // class ext/mods/gameserver/network/serverpackets/CreatureSay
       134: dup
       135: aload_2
       136: aload_1
       137: aload         4
       139: invokespecial #73                 // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
       142: astore        6
       144: aload_2
       145: aload         6
       147: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       150: aload_2
       151: ldc           #8                  // class ext/mods/gameserver/model/actor/Player
       153: sipush        1250
       156: aload         6
       158: invokedynamic #80,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/network/serverpackets/CreatureSay;)Ljava/util/function/Consumer;
       163: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       166: return
      LineNumberTable:
        line 40: 0
        line 41: 13
        line 43: 14
        line 44: 17
        line 46: 27
        line 48: 38
        line 50: 42
        line 52: 51
        line 53: 62
        line 54: 75
        line 58: 88
        line 59: 96
        line 62: 106
        line 64: 111
        line 65: 123
        line 69: 126
        line 71: 131
        line 73: 144
        line 74: 150
        line 76: 166
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           85       3     7   vch   Lext/mods/gameserver/handler/IVoicedCommandHandler;
           38      88     6    st   Ljava/util/StringTokenizer;
          106      20     7   vch   Lext/mods/gameserver/handler/IVoicedCommandHandler;
           42      84     8 command   Ljava/lang/String;
          144      22     6    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
            0     167     0  this   Lext/mods/gameserver/handler/chathandlers/ChatAll;
            0     167     1  type   Lext/mods/gameserver/enums/SayType;
            0     167     2 player   Lext/mods/gameserver/model/actor/Player;
            0     167     3 target   Ljava/lang/String;
            0     167     4  text   Ljava/lang/String;
           17     150     5 useHandler   Z
      StackMapTable: number_of_entries = 5
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/handler/chathandlers/ChatAll, class ext/mods/gameserver/enums/SayType, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class java/util/StringTokenizer, top, class java/lang/String ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/chathandlers/ChatAll, class ext/mods/gameserver/enums/SayType, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int, class java/util/StringTokenizer, class ext/mods/gameserver/handler/IVoicedCommandHandler, class java/lang/String ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 19
        frame_type = 39 /* same */

  public ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #88                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
         3: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/chathandlers/ChatAll;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #94                 // class ext/mods/gameserver/enums/SayType
         4: dup
         5: iconst_0
         6: getstatic     #96                 // Field ext/mods/gameserver/enums/SayType.ALL:Lext/mods/gameserver/enums/SayType;
         9: aastore
        10: putstatic     #88                 // Field COMMAND_IDS:[Lext/mods/gameserver/enums/SayType;
        13: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "ChatAll.java"
BootstrapMethods:
  0: #141 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #134 (Ljava/lang/Object;)V
      #136 REF_invokeStatic ext/mods/gameserver/handler/chathandlers/ChatAll.lambda$handleChat$0:(Lext/mods/gameserver/network/serverpackets/CreatureSay;Lext/mods/gameserver/model/actor/Player;)V
      #139 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #153= #149 of #151; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
