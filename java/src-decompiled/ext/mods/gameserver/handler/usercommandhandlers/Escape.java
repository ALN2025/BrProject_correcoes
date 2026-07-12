// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.Escape
// File: ext\mods\gameserver\handler\usercommandhandlers\Escape.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/Escape.class
  Last modified 9 de jul de 2026; size 2862 bytes
  MD5 checksum 2c83238b1426cc618616b35f76fc653d
  Compiled from "Escape.java"
public class ext.mods.gameserver.handler.usercommandhandlers.Escape implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #112                        // ext/mods/gameserver/handler/usercommandhandlers/Escape
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #10 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #14 = NameAndType        #15:#16       // isStarted:()Z
   #15 = Utf8               isStarted
   #16 = Utf8               ()Z
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #18 = Class              #20           // ext/mods/gameserver/model/actor/Player
   #19 = NameAndType        #21:#22       // getObjectId:()I
   #20 = Utf8               ext/mods/gameserver/model/actor/Player
   #21 = Utf8               getObjectId
   #22 = Utf8               ()I
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onEscapeUse:(I)Z
   #24 = NameAndType        #25:#26       // onEscapeUse:(I)Z
   #25 = Utf8               onEscapeUse
   #26 = Utf8               (I)Z
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #28 = Class              #30           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #29 = NameAndType        #11:#31       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #30 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #31 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #32 = Methodref          #28.#14       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
   #33 = Methodref          #28.#24       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
   #34 = Methodref          #35.#36       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #35 = Class              #37           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #36 = NameAndType        #11:#38       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #37 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #38 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #39 = Methodref          #35.#14       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #40 = Methodref          #35.#24       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #42 = Class              #44           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #43 = NameAndType        #11:#45       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #44 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #45 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #46 = Methodref          #42.#14       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
   #47 = Methodref          #42.#24       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
   #48 = Methodref          #18.#49       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #49 = NameAndType        #50:#16       // isInOlympiadMode:()Z
   #50 = Utf8               isInOlympiadMode
   #51 = Methodref          #18.#52       // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #52 = NameAndType        #53:#16       // isInObserverMode:()Z
   #53 = Utf8               isInObserverMode
   #54 = Methodref          #18.#55       // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
   #55 = NameAndType        #56:#16       // isFestivalParticipant:()Z
   #56 = Utf8               isFestivalParticipant
   #57 = Methodref          #18.#58       // ext/mods/gameserver/model/actor/Player.isInJail:()Z
   #58 = NameAndType        #59:#16       // isInJail:()Z
   #59 = Utf8               isInJail
   #60 = Fieldref           #61.#62       // ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
   #61 = Class              #63           // ext/mods/gameserver/enums/ZoneId
   #62 = NameAndType        #64:#65       // BOSS:Lext/mods/gameserver/enums/ZoneId;
   #63 = Utf8               ext/mods/gameserver/enums/ZoneId
   #64 = Utf8               BOSS
   #65 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #66 = Methodref          #18.#67       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #67 = NameAndType        #68:#69       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #68 = Utf8               isInsideZone
   #69 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #70 = String             #71           // Your current state doesn\'t allow you to use the /unstuck command.
   #71 = Utf8               Your current state doesn\'t allow you to use the /unstuck command.
   #72 = Methodref          #18.#73       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #73 = NameAndType        #74:#75       // sendMessage:(Ljava/lang/String;)V
   #74 = Utf8               sendMessage
   #75 = Utf8               (Ljava/lang/String;)V
   #76 = Fieldref           #77.#78       // ext/mods/gameserver/network/SystemMessageId.NO_UNSTUCK_PLEASE_SEND_PETITION:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Class              #79           // ext/mods/gameserver/network/SystemMessageId
   #78 = NameAndType        #80:#81       // NO_UNSTUCK_PLEASE_SEND_PETITION:Lext/mods/gameserver/network/SystemMessageId;
   #79 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #80 = Utf8               NO_UNSTUCK_PLEASE_SEND_PETITION
   #81 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #82 = Methodref          #18.#83       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #83 = NameAndType        #84:#85       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #84 = Utf8               sendPacket
   #85 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #86 = Methodref          #18.#87       // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #87 = NameAndType        #88:#16       // isGM:()Z
   #88 = Utf8               isGM
   #89 = Methodref          #18.#90       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #90 = NameAndType        #91:#92       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #91 = Utf8               getAI
   #92 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;II)V
   #94 = Class              #96           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #95 = NameAndType        #97:#98       // tryToCast:(Lext/mods/gameserver/model/actor/Creature;II)V
   #96 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #97 = Utf8               tryToCast
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Creature;II)V
   #99 = Class              #100          // ext/mods/gameserver/network/serverpackets/PlaySound
  #100 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #101 = String             #102          // systemmsg_e.809
  #102 = Utf8               systemmsg_e.809
  #103 = Methodref          #99.#104      // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #104 = NameAndType        #5:#75        // "<init>":(Ljava/lang/String;)V
  #105 = Methodref          #18.#106      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #106 = NameAndType        #84:#107      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #107 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = Fieldref           #77.#109      // ext/mods/gameserver/network/SystemMessageId.STUCK_TRANSPORT_IN_FIVE_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #109 = NameAndType        #110:#81      // STUCK_TRANSPORT_IN_FIVE_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #110 = Utf8               STUCK_TRANSPORT_IN_FIVE_MINUTES
  #111 = Fieldref           #112.#113     // ext/mods/gameserver/handler/usercommandhandlers/Escape.COMMAND_IDS:[I
  #112 = Class              #114          // ext/mods/gameserver/handler/usercommandhandlers/Escape
  #113 = NameAndType        #115:#116     // COMMAND_IDS:[I
  #114 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/Escape
  #115 = Utf8               COMMAND_IDS
  #116 = Utf8               [I
  #117 = Class              #118          // ext/mods/gameserver/handler/IUserCommandHandler
  #118 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #119 = Utf8               Code
  #120 = Utf8               LineNumberTable
  #121 = Utf8               LocalVariableTable
  #122 = Utf8               this
  #123 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/Escape;
  #124 = Utf8               useUserCommand
  #125 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #126 = Utf8               id
  #127 = Utf8               I
  #128 = Utf8               player
  #129 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #130 = Utf8               StackMapTable
  #131 = Utf8               getUserCommandList
  #132 = Utf8               ()[I
  #133 = Utf8               <clinit>
  #134 = Utf8               SourceFile
  #135 = Utf8               Escape.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.Escape();
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
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Escape;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         3: invokevirtual #13                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
         6: ifeq          22
         9: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        12: aload_2
        13: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #23                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onEscapeUse:(I)Z
        19: ifne          126
        22: invokestatic  #27                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        25: invokevirtual #32                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
        28: ifeq          44
        31: invokestatic  #27                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        34: aload_2
        35: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        38: invokevirtual #33                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
        41: ifne          126
        44: invokestatic  #34                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        47: invokevirtual #39                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
        50: ifeq          66
        53: invokestatic  #34                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        56: aload_2
        57: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        60: invokevirtual #40                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
        63: ifne          126
        66: invokestatic  #41                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        69: invokevirtual #46                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
        72: ifeq          88
        75: invokestatic  #41                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        78: aload_2
        79: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        82: invokevirtual #47                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
        85: ifne          126
        88: aload_2
        89: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        92: ifne          126
        95: aload_2
        96: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        99: ifne          126
       102: aload_2
       103: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       106: ifne          126
       109: aload_2
       110: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
       113: ifne          126
       116: aload_2
       117: getstatic     #60                 // Field ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
       120: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       123: ifeq          133
       126: aload_2
       127: ldc           #70                 // String Your current state doesn\'t allow you to use the /unstuck command.
       129: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       132: return
       133: aload_2
       134: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       137: ifne          171
       140: aload_2
       141: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       144: ifne          171
       147: aload_2
       148: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       151: ifne          171
       154: aload_2
       155: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
       158: ifne          171
       161: aload_2
       162: getstatic     #60                 // Field ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
       165: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       168: ifeq          179
       171: aload_2
       172: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.NO_UNSTUCK_PLEASE_SEND_PETITION:Lext/mods/gameserver/network/SystemMessageId;
       175: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       178: return
       179: aload_2
       180: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       183: ifeq          201
       186: aload_2
       187: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       190: aload_2
       191: sipush        2100
       194: iconst_1
       195: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;II)V
       198: goto          233
       201: aload_2
       202: new           #99                 // class ext/mods/gameserver/network/serverpackets/PlaySound
       205: dup
       206: ldc           #101                // String systemmsg_e.809
       208: invokespecial #103                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       211: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       214: aload_2
       215: getstatic     #108                // Field ext/mods/gameserver/network/SystemMessageId.STUCK_TRANSPORT_IN_FIVE_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
       218: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       221: aload_2
       222: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       225: aload_2
       226: sipush        2099
       229: iconst_1
       230: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;II)V
       233: return
      LineNumberTable:
        line 40: 0
        line 42: 126
        line 43: 132
        line 46: 133
        line 48: 171
        line 49: 178
        line 52: 179
        line 53: 186
        line 56: 201
        line 57: 214
        line 59: 221
        line 61: 233
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     234     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Escape;
            0     234     1    id   I
            0     234     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 10
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 37 /* same */
        frame_type = 6 /* same */
        frame_type = 37 /* same */
        frame_type = 7 /* same */
        frame_type = 21 /* same */
        frame_type = 31 /* same */

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #111                // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/Escape;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        52
         7: iastore
         8: putstatic     #111                // Field COMMAND_IDS:[I
        11: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "Escape.java"
