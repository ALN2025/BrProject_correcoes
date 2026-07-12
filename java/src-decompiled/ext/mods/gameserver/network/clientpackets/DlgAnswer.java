// Bytecode for: ext.mods.gameserver.network.clientpackets.DlgAnswer
// File: ext\mods\gameserver\network\clientpackets\DlgAnswer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/DlgAnswer.class
  Last modified 9 de jul de 2026; size 4037 bytes
  MD5 checksum 046e3b8d61574b19a61d0d8c57dd98d2
  Compiled from "DlgAnswer.java"
public final class ext.mods.gameserver.network.clientpackets.DlgAnswer extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/DlgAnswer
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/DlgAnswer.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/DlgAnswer
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/DlgAnswer
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/DlgAnswer._messageId:I
   #14 = NameAndType        #15:#16       // _messageId:I
   #15 = Utf8               _messageId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/DlgAnswer._answer:I
   #18 = NameAndType        #19:#16       // _answer:I
   #19 = Utf8               _answer
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/DlgAnswer._requesterId:I
   #21 = NameAndType        #22:#16       // _requesterId:I
   #22 = Utf8               _requesterId
   #23 = Methodref          #8.#24        // ext/mods/gameserver/network/clientpackets/DlgAnswer.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #24 = NameAndType        #25:#26       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = Utf8               getClient
   #26 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #27 = Class              #28           // ext/mods/gameserver/network/GameClient
   #28 = Utf8               ext/mods/gameserver/network/GameClient
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Class              #34           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #34 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #35 = Integer            100001
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #37 = Class              #39           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #38 = NameAndType        #40:#41       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #39 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #40 = Utf8               getInstance
   #41 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #42 = String             #43           // ctf_event_participation
   #43 = Utf8               ctf_event_participation
   #44 = Methodref          #37.#45       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #45 = NameAndType        #46:#47       // onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #46 = Utf8               onBypass
   #47 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #48 = Class              #49           // ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #49 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #50 = Integer            100002
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #52 = Class              #54           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #53 = NameAndType        #40:#55       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #54 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #55 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #56 = String             #57           // dm_event_participation
   #57 = Utf8               dm_event_participation
   #58 = Methodref          #52.#45       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #59 = Class              #60           // ext/mods/gameserver/model/entity/events/lastman/LMManager
   #60 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager
   #61 = Integer            100003
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #63 = Class              #65           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #64 = NameAndType        #40:#66       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #65 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #66 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #67 = String             #68           // lm_event_participation
   #68 = Utf8               lm_event_participation
   #69 = Methodref          #63.#45       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #70 = Class              #71           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
   #71 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
   #72 = Integer            100004
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #74 = Class              #76           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #75 = NameAndType        #40:#77       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #76 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #77 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #78 = String             #79           // tvt_event_participation
   #79 = Utf8               tvt_event_participation
   #80 = Methodref          #74.#45       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #81 = Fieldref           #82.#83       // ext/mods/gameserver/network/SystemMessageId.RESSURECTION_REQUEST_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #82 = Class              #84           // ext/mods/gameserver/network/SystemMessageId
   #83 = NameAndType        #85:#86       // RESSURECTION_REQUEST_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #84 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #85 = Utf8               RESSURECTION_REQUEST_BY_S1
   #86 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #87 = Methodref          #82.#88       // ext/mods/gameserver/network/SystemMessageId.getId:()I
   #88 = NameAndType        #89:#12       // getId:()I
   #89 = Utf8               getId
   #90 = Fieldref           #82.#91       // ext/mods/gameserver/network/SystemMessageId.DO_YOU_WANT_TO_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #91 = NameAndType        #92:#86       // DO_YOU_WANT_TO_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Utf8               DO_YOU_WANT_TO_BE_RESTORED
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/actor/Player.reviveAnswer:(I)V
   #94 = Class              #96           // ext/mods/gameserver/model/actor/Player
   #95 = NameAndType        #97:#98       // reviveAnswer:(I)V
   #96 = Utf8               ext/mods/gameserver/model/actor/Player
   #97 = Utf8               reviveAnswer
   #98 = Utf8               (I)V
   #99 = Fieldref           #82.#100      // ext/mods/gameserver/network/SystemMessageId.S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT:Lext/mods/gameserver/network/SystemMessageId;
  #100 = NameAndType        #101:#86      // S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT:Lext/mods/gameserver/network/SystemMessageId;
  #101 = Utf8               S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT
  #102 = Methodref          #94.#103      // ext/mods/gameserver/model/actor/Player.teleportAnswer:(II)V
  #103 = NameAndType        #104:#105     // teleportAnswer:(II)V
  #104 = Utf8               teleportAnswer
  #105 = Utf8               (II)V
  #106 = Methodref          #94.#107      // ext/mods/gameserver/model/actor/Player.engageAnswer:(I)V
  #107 = NameAndType        #108:#98      // engageAnswer:(I)V
  #108 = Utf8               engageAnswer
  #109 = Fieldref           #82.#110      // ext/mods/gameserver/network/SystemMessageId.WOULD_YOU_LIKE_TO_OPEN_THE_GATE:Lext/mods/gameserver/network/SystemMessageId;
  #110 = NameAndType        #111:#86      // WOULD_YOU_LIKE_TO_OPEN_THE_GATE:Lext/mods/gameserver/network/SystemMessageId;
  #111 = Utf8               WOULD_YOU_LIKE_TO_OPEN_THE_GATE
  #112 = Methodref          #94.#113      // ext/mods/gameserver/model/actor/Player.activateGate:(II)V
  #113 = NameAndType        #114:#105     // activateGate:(II)V
  #114 = Utf8               activateGate
  #115 = Fieldref           #82.#116      // ext/mods/gameserver/network/SystemMessageId.WOULD_YOU_LIKE_TO_CLOSE_THE_GATE:Lext/mods/gameserver/network/SystemMessageId;
  #116 = NameAndType        #117:#86      // WOULD_YOU_LIKE_TO_CLOSE_THE_GATE:Lext/mods/gameserver/network/SystemMessageId;
  #117 = Utf8               WOULD_YOU_LIKE_TO_CLOSE_THE_GATE
  #118 = Fieldref           #82.#119      // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #119 = NameAndType        #120:#86      // S1:Lext/mods/gameserver/network/SystemMessageId;
  #120 = Utf8               S1
  #121 = String             #122          // away
  #122 = Utf8               away
  #123 = Methodref          #94.#124      // ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
  #124 = NameAndType        #125:#126     // getLastCommand:()Ljava/lang/String;
  #125 = Utf8               getLastCommand
  #126 = Utf8               ()Ljava/lang/String;
  #127 = Methodref          #128.#129     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #128 = Class              #130          // java/lang/String
  #129 = NameAndType        #131:#132     // equals:(Ljava/lang/Object;)Z
  #130 = Utf8               java/lang/String
  #131 = Utf8               equals
  #132 = Utf8               (Ljava/lang/Object;)Z
  #133 = Class              #134          // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm
  #134 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm
  #135 = Methodref          #133.#3       // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm."<init>":()V
  #136 = Methodref          #133.#137     // ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.handleConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #137 = NameAndType        #138:#139     // handleConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #138 = Utf8               handleConfirmation
  #139 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #140 = String             #141          // farm_teleport
  #141 = Utf8               farm_teleport
  #142 = Class              #143          // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport
  #143 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport
  #144 = Methodref          #142.#3       // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport."<init>":()V
  #145 = Methodref          #142.#137     // ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.handleConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #146 = String             #147          // farm_event_teleport
  #147 = Utf8               farm_event_teleport
  #148 = Methodref          #149.#150     // ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
  #149 = Class              #151          // ext/mods/Crypta/RandomManager
  #150 = NameAndType        #40:#152      // getInstance:()Lext/mods/Crypta/RandomManager;
  #151 = Utf8               ext/mods/Crypta/RandomManager
  #152 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #153 = Methodref          #149.#154     // ext/mods/Crypta/RandomManager.handleEventTeleportConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #154 = NameAndType        #155:#139     // handleEventTeleportConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #155 = Utf8               handleEventTeleportConfirmation
  #156 = Utf8               Code
  #157 = Utf8               LineNumberTable
  #158 = Utf8               LocalVariableTable
  #159 = Utf8               this
  #160 = Utf8               Lext/mods/gameserver/network/clientpackets/DlgAnswer;
  #161 = Utf8               readImpl
  #162 = Utf8               runImpl
  #163 = Utf8               offlineFarmHandler
  #164 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;
  #165 = Utf8               farmHandler
  #166 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;
  #167 = Utf8               randomManager
  #168 = Utf8               Ljava/lang/Object;
  #169 = Utf8               player
  #170 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #171 = Utf8               StackMapTable
  #172 = Class              #173          // java/lang/Object
  #173 = Utf8               java/lang/Object
  #174 = Utf8               SourceFile
  #175 = Utf8               DlgAnswer.java
{
  public ext.mods.gameserver.network.clientpackets.DlgAnswer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/DlgAnswer;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _messageId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _answer:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _requesterId:I
        24: return
      LineNumberTable:
        line 42: 0
        line 43: 8
        line 44: 16
        line 45: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/clientpackets/DlgAnswer;

  public void runImpl();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_0
        17: getfield      #20                 // Field _requesterId:I
        20: ldc           #35                 // int 100001
        22: if_icmpne     45
        25: aload_0
        26: getfield      #17                 // Field _answer:I
        29: iconst_1
        30: if_icmpne     45
        33: invokestatic  #36                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        36: ldc           #42                 // String ctf_event_participation
        38: aload_1
        39: invokevirtual #44                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        42: goto          434
        45: aload_0
        46: getfield      #20                 // Field _requesterId:I
        49: ldc           #50                 // int 100002
        51: if_icmpne     74
        54: aload_0
        55: getfield      #17                 // Field _answer:I
        58: iconst_1
        59: if_icmpne     74
        62: invokestatic  #51                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        65: ldc           #56                 // String dm_event_participation
        67: aload_1
        68: invokevirtual #58                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        71: goto          434
        74: aload_0
        75: getfield      #20                 // Field _requesterId:I
        78: ldc           #61                 // int 100003
        80: if_icmpne     103
        83: aload_0
        84: getfield      #17                 // Field _answer:I
        87: iconst_1
        88: if_icmpne     103
        91: invokestatic  #62                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        94: ldc           #67                 // String lm_event_participation
        96: aload_1
        97: invokevirtual #69                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       100: goto          434
       103: aload_0
       104: getfield      #20                 // Field _requesterId:I
       107: ldc           #72                 // int 100004
       109: if_icmpne     132
       112: aload_0
       113: getfield      #17                 // Field _answer:I
       116: iconst_1
       117: if_icmpne     132
       120: invokestatic  #73                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       123: ldc           #78                 // String tvt_event_participation
       125: aload_1
       126: invokevirtual #80                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       129: goto          434
       132: aload_0
       133: getfield      #13                 // Field _messageId:I
       136: getstatic     #81                 // Field ext/mods/gameserver/network/SystemMessageId.RESSURECTION_REQUEST_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       139: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       142: if_icmpeq     158
       145: aload_0
       146: getfield      #13                 // Field _messageId:I
       149: getstatic     #90                 // Field ext/mods/gameserver/network/SystemMessageId.DO_YOU_WANT_TO_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
       152: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       155: if_icmpne     169
       158: aload_1
       159: aload_0
       160: getfield      #17                 // Field _answer:I
       163: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.reviveAnswer:(I)V
       166: goto          434
       169: aload_0
       170: getfield      #13                 // Field _messageId:I
       173: getstatic     #99                 // Field ext/mods/gameserver/network/SystemMessageId.S1_WISHES_TO_SUMMON_YOU_FROM_S2_DO_YOU_ACCEPT:Lext/mods/gameserver/network/SystemMessageId;
       176: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       179: if_icmpne     197
       182: aload_1
       183: aload_0
       184: getfield      #17                 // Field _answer:I
       187: aload_0
       188: getfield      #20                 // Field _requesterId:I
       191: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.teleportAnswer:(II)V
       194: goto          434
       197: aload_0
       198: getfield      #13                 // Field _messageId:I
       201: sipush        1983
       204: if_icmpne     218
       207: aload_1
       208: aload_0
       209: getfield      #17                 // Field _answer:I
       212: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.engageAnswer:(I)V
       215: goto          434
       218: aload_0
       219: getfield      #13                 // Field _messageId:I
       222: getstatic     #109                // Field ext/mods/gameserver/network/SystemMessageId.WOULD_YOU_LIKE_TO_OPEN_THE_GATE:Lext/mods/gameserver/network/SystemMessageId;
       225: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       228: if_icmpne     243
       231: aload_1
       232: aload_0
       233: getfield      #17                 // Field _answer:I
       236: iconst_1
       237: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.activateGate:(II)V
       240: goto          434
       243: aload_0
       244: getfield      #13                 // Field _messageId:I
       247: getstatic     #115                // Field ext/mods/gameserver/network/SystemMessageId.WOULD_YOU_LIKE_TO_CLOSE_THE_GATE:Lext/mods/gameserver/network/SystemMessageId;
       250: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       253: if_icmpne     268
       256: aload_1
       257: aload_0
       258: getfield      #17                 // Field _answer:I
       261: iconst_0
       262: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.activateGate:(II)V
       265: goto          434
       268: aload_0
       269: getfield      #13                 // Field _messageId:I
       272: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       275: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       278: if_icmpne     323
       281: ldc           #121                // String away
       283: aload_1
       284: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
       287: invokevirtual #127                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       290: ifeq          323
       293: new           #133                // class ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm
       296: dup
       297: invokespecial #135                // Method ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm."<init>":()V
       300: astore_2
       301: aload_2
       302: aload_1
       303: aload_0
       304: getfield      #17                 // Field _answer:I
       307: iconst_1
       308: if_icmpne     315
       311: iconst_1
       312: goto          316
       315: iconst_0
       316: invokevirtual #136                // Method ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm.handleConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
       319: pop
       320: goto          434
       323: aload_0
       324: getfield      #13                 // Field _messageId:I
       327: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       330: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       333: if_icmpne     378
       336: ldc           #140                // String farm_teleport
       338: aload_1
       339: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
       342: invokevirtual #127                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       345: ifeq          378
       348: new           #142                // class ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport
       351: dup
       352: invokespecial #144                // Method ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport."<init>":()V
       355: astore_2
       356: aload_2
       357: aload_1
       358: aload_0
       359: getfield      #17                 // Field _answer:I
       362: iconst_1
       363: if_icmpne     370
       366: iconst_1
       367: goto          371
       370: iconst_0
       371: invokevirtual #145                // Method ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport.handleConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
       374: pop
       375: goto          434
       378: aload_0
       379: getfield      #13                 // Field _messageId:I
       382: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       385: invokevirtual #87                 // Method ext/mods/gameserver/network/SystemMessageId.getId:()I
       388: if_icmpne     434
       391: ldc           #146                // String farm_event_teleport
       393: aload_1
       394: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
       397: invokevirtual #127                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       400: ifeq          434
       403: invokestatic  #148                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       406: astore_2
       407: invokestatic  #148                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       410: ifnull        434
       413: invokestatic  #148                // Method ext/mods/Crypta/RandomManager.getInstance:()Lext/mods/Crypta/RandomManager;
       416: aload_1
       417: aload_0
       418: getfield      #17                 // Field _answer:I
       421: iconst_1
       422: if_icmpne     429
       425: iconst_1
       426: goto          430
       429: iconst_0
       430: invokevirtual #153                // Method ext/mods/Crypta/RandomManager.handleEventTeleportConfirmation:(Lext/mods/gameserver/model/actor/Player;Z)Z
       433: pop
       434: return
      LineNumberTable:
        line 50: 0
        line 51: 11
        line 52: 15
        line 54: 16
        line 55: 33
        line 56: 45
        line 57: 62
        line 58: 74
        line 59: 91
        line 60: 103
        line 61: 120
        line 62: 132
        line 63: 158
        line 64: 169
        line 65: 182
        line 66: 197
        line 67: 207
        line 68: 218
        line 69: 231
        line 70: 243
        line 71: 256
        line 72: 268
        line 74: 293
        line 75: 301
        line 76: 320
        line 77: 323
        line 79: 348
        line 80: 356
        line 81: 375
        line 82: 378
        line 84: 403
        line 85: 407
        line 87: 413
        line 90: 434
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          301      19     2 offlineFarmHandler   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm;
          356      19     2 farmHandler   Lext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport;
          407      27     2 randomManager   Ljava/lang/Object;
            0     435     0  this   Lext/mods/gameserver/network/clientpackets/DlgAnswer;
           11     424     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 20
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 28 /* same */
        frame_type = 28 /* same */
        frame_type = 28 /* same */
        frame_type = 28 /* same */
        frame_type = 25 /* same */
        frame_type = 10 /* same */
        frame_type = 27 /* same */
        frame_type = 20 /* same */
        frame_type = 24 /* same */
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/network/clientpackets/DlgAnswer, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm ]
          stack = [ class ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/DlgAnswer, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm ]
          stack = [ class ext/mods/gameserver/handler/voicedcommandhandlers/OfflineFarm, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/network/clientpackets/DlgAnswer, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport ]
          stack = [ class ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/DlgAnswer, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport ]
          stack = [ class ext/mods/gameserver/handler/voicedcommandhandlers/FarmZoneTeleport, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/network/clientpackets/DlgAnswer, class ext/mods/gameserver/model/actor/Player, class java/lang/Object ]
          stack = [ class ext/mods/Crypta/RandomManager, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/DlgAnswer, class ext/mods/gameserver/model/actor/Player, class java/lang/Object ]
          stack = [ class ext/mods/Crypta/RandomManager, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 250 /* chop */
          offset_delta = 3
}
SourceFile: "DlgAnswer.java"
