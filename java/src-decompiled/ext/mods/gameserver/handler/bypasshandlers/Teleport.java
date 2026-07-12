// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.Teleport
// File: ext\mods\gameserver\handler\bypasshandlers\Teleport.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/Teleport.class
  Last modified 9 de jul de 2026; size 4058 bytes
  MD5 checksum 3df57f9967c762821cfa3dbe3ec722e5
  Compiled from "Teleport.java"
public class ext.mods.gameserver.handler.bypasshandlers.Teleport implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #27                         // ext/mods/gameserver/handler/bypasshandlers/Teleport
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = Class              #19           // ext/mods/gameserver/model/actor/Npc
   #19 = Utf8               ext/mods/gameserver/model/actor/Npc
   #20 = Methodref          #21.#22       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #21 = Class              #23           // java/lang/Integer
   #22 = NameAndType        #24:#25       // parseInt:(Ljava/lang/String;)I
   #23 = Utf8               java/lang/Integer
   #24 = Utf8               parseInt
   #25 = Utf8               (Ljava/lang/String;)I
   #26 = Methodref          #27.#28       // ext/mods/gameserver/handler/bypasshandlers/Teleport.teleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
   #27 = Class              #29           // ext/mods/gameserver/handler/bypasshandlers/Teleport
   #28 = NameAndType        #30:#31       // teleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
   #29 = Utf8               ext/mods/gameserver/handler/bypasshandlers/Teleport
   #30 = Utf8               teleport
   #31 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
   #32 = Class              #33           // java/lang/Exception
   #33 = Utf8               java/lang/Exception
   #34 = Fieldref           #35.#36       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #35 = Class              #37           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #36 = NameAndType        #38:#39       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #37 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #38 = Utf8               STATIC_PACKET
   #39 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               sendPacket
   #45 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #46 = Methodref          #18.#47       // ext/mods/gameserver/model/actor/Npc.isTeleportAllowed:(Lext/mods/gameserver/model/actor/Player;)Z
   #47 = NameAndType        #48:#49       // isTeleportAllowed:(Lext/mods/gameserver/model/actor/Player;)Z
   #48 = Utf8               isTeleportAllowed
   #49 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #50 = Methodref          #51.#52       // ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
   #51 = Class              #53           // ext/mods/gameserver/data/xml/TeleportData
   #52 = NameAndType        #54:#55       // getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
   #53 = Utf8               ext/mods/gameserver/data/xml/TeleportData
   #54 = Utf8               getInstance
   #55 = Utf8               ()Lext/mods/gameserver/data/xml/TeleportData;
   #56 = Methodref          #18.#57       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #57 = NameAndType        #58:#59       // getNpcId:()I
   #58 = Utf8               getNpcId
   #59 = Utf8               ()I
   #60 = Methodref          #51.#61       // ext/mods/gameserver/data/xml/TeleportData.getTeleports:(I)Ljava/util/List;
   #61 = NameAndType        #62:#63       // getTeleports:(I)Ljava/util/List;
   #62 = Utf8               getTeleports
   #63 = Utf8               (I)Ljava/util/List;
   #64 = InterfaceMethodref #65.#66       // java/util/List.size:()I
   #65 = Class              #67           // java/util/List
   #66 = NameAndType        #68:#59       // size:()I
   #67 = Utf8               java/util/List
   #68 = Utf8               size
   #69 = InterfaceMethodref #65.#70       // java/util/List.get:(I)Ljava/lang/Object;
   #70 = NameAndType        #71:#72       // get:(I)Ljava/lang/Object;
   #71 = Utf8               get
   #72 = Utf8               (I)Ljava/lang/Object;
   #73 = Class              #74           // ext/mods/gameserver/model/location/TeleportLocation
   #74 = Utf8               ext/mods/gameserver/model/location/TeleportLocation
   #75 = Methodref          #73.#76       // ext/mods/gameserver/model/location/TeleportLocation.getCastleId:()I
   #76 = NameAndType        #77:#59       // getCastleId:()I
   #77 = Utf8               getCastleId
   #78 = Methodref          #79.#80       // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #79 = Class              #81           // ext/mods/gameserver/data/manager/CastleManager
   #80 = NameAndType        #54:#82       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #81 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #82 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #83 = Methodref          #79.#84       // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #84 = NameAndType        #85:#86       // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
   #85 = Utf8               getCastleById
   #86 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
   #87 = Methodref          #88.#89       // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #88 = Class              #90           // ext/mods/gameserver/model/residence/castle/Castle
   #89 = NameAndType        #91:#92       // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
   #90 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #91 = Utf8               getSiege
   #92 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
   #94 = Class              #96           // ext/mods/gameserver/model/residence/castle/Siege
   #95 = NameAndType        #97:#98       // isInProgress:()Z
   #96 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #97 = Utf8               isInProgress
   #98 = Utf8               ()Z
   #99 = Fieldref           #100.#101     // ext/mods/gameserver/network/SystemMessageId.CANNOT_PORT_VILLAGE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #100 = Class              #102          // ext/mods/gameserver/network/SystemMessageId
  #101 = NameAndType        #103:#104     // CANNOT_PORT_VILLAGE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #102 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #103 = Utf8               CANNOT_PORT_VILLAGE_IN_SIEGE
  #104 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #105 = Methodref          #41.#106      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #106 = NameAndType        #44:#107      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #107 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #108 = Fieldref           #109.#110     // ext/mods/Config.FREE_TELEPORT:Z
  #109 = Class              #111          // ext/mods/Config
  #110 = NameAndType        #112:#113     // FREE_TELEPORT:Z
  #111 = Utf8               ext/mods/Config
  #112 = Utf8               FREE_TELEPORT
  #113 = Utf8               Z
  #114 = Methodref          #41.#115      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #115 = NameAndType        #116:#117     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #116 = Utf8               getStatus
  #117 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #119 = Class              #121          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #120 = NameAndType        #122:#59      // getLevel:()I
  #121 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #122 = Utf8               getLevel
  #123 = Fieldref           #109.#124     // ext/mods/Config.LVL_FREE_TELEPORT:I
  #124 = NameAndType        #125:#126     // LVL_FREE_TELEPORT:I
  #125 = Utf8               LVL_FREE_TELEPORT
  #126 = Utf8               I
  #127 = Methodref          #73.#128      // ext/mods/gameserver/model/location/TeleportLocation.getPriceCount:()I
  #128 = NameAndType        #129:#59      // getPriceCount:()I
  #129 = Utf8               getPriceCount
  #130 = Methodref          #73.#131      // ext/mods/gameserver/model/location/TeleportLocation.getPriceId:()I
  #131 = NameAndType        #132:#59      // getPriceId:()I
  #132 = Utf8               getPriceId
  #133 = Methodref          #73.#134      // ext/mods/gameserver/model/location/TeleportLocation.getCalculatedPriceCount:(Lext/mods/gameserver/model/actor/Player;)I
  #134 = NameAndType        #135:#136     // getCalculatedPriceCount:(Lext/mods/gameserver/model/actor/Player;)I
  #135 = Utf8               getCalculatedPriceCount
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #137 = Methodref          #41.#138      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #138 = NameAndType        #139:#140     // destroyItemByItemId:(IIZ)Z
  #139 = Utf8               destroyItemByItemId
  #140 = Utf8               (IIZ)Z
  #141 = Methodref          #41.#142      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #142 = NameAndType        #143:#144     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #143 = Utf8               teleportTo
  #144 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #145 = Fieldref           #27.#146      // ext/mods/gameserver/handler/bypasshandlers/Teleport.COMMANDS:[Ljava/lang/String;
  #146 = NameAndType        #147:#148     // COMMANDS:[Ljava/lang/String;
  #147 = Utf8               COMMANDS
  #148 = Utf8               [Ljava/lang/String;
  #149 = Class              #150          // java/lang/String
  #150 = Utf8               java/lang/String
  #151 = String             #30           // teleport
  #152 = Class              #153          // ext/mods/gameserver/handler/IBypassHandler
  #153 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #154 = Utf8               Code
  #155 = Utf8               LineNumberTable
  #156 = Utf8               LocalVariableTable
  #157 = Utf8               this
  #158 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/Teleport;
  #159 = Utf8               useBypass
  #160 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #161 = Utf8               npc
  #162 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #163 = Utf8               st
  #164 = Utf8               Ljava/util/StringTokenizer;
  #165 = Utf8               e
  #166 = Utf8               Ljava/lang/Exception;
  #167 = Utf8               command
  #168 = Utf8               Ljava/lang/String;
  #169 = Utf8               player
  #170 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #171 = Utf8               target
  #172 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #173 = Utf8               StackMapTable
  #174 = Utf8               castle
  #175 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #176 = Utf8               index
  #177 = Utf8               teleports
  #178 = Utf8               Ljava/util/List;
  #179 = Utf8               Lext/mods/gameserver/model/location/TeleportLocation;
  #180 = Utf8               LocalVariableTypeTable
  #181 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #182 = Utf8               getBypassList
  #183 = Utf8               ()[Ljava/lang/String;
  #184 = Utf8               <clinit>
  #185 = Utf8               SourceFile
  #186 = Utf8               Teleport.java
{
  public ext.mods.gameserver.handler.bypasshandlers.Teleport();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/Teleport;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore        4
        12: aload         4
        14: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        17: pop
        18: aload_3
        19: instanceof    #18                 // class ext/mods/gameserver/model/actor/Npc
        22: ifeq          46
        25: aload_3
        26: checkcast     #18                 // class ext/mods/gameserver/model/actor/Npc
        29: astore        5
        31: aload_0
        32: aload_2
        33: aload         5
        35: aload         4
        37: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        40: invokestatic  #20                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        43: invokevirtual #26                 // Method teleport:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
        46: goto          58
        49: astore        4
        51: aload_2
        52: getstatic     #34                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        55: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: iconst_1
        59: ireturn
      Exception table:
         from    to  target type
             0    46    49   Class java/lang/Exception
      LineNumberTable:
        line 44: 0
        line 45: 12
        line 47: 18
        line 48: 31
        line 53: 46
        line 50: 49
        line 52: 51
        line 54: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      15     5   npc   Lext/mods/gameserver/model/actor/Npc;
           12      34     4    st   Ljava/util/StringTokenizer;
           51       7     4     e   Ljava/lang/Exception;
            0      60     0  this   Lext/mods/gameserver/handler/bypasshandlers/Teleport;
            0      60     1 command   Ljava/lang/String;
            0      60     2 player   Lext/mods/gameserver/model/actor/Player;
            0      60     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 46 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */

  public void teleport(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_2
         1: aload_1
         2: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Npc.isTeleportAllowed:(Lext/mods/gameserver/model/actor/Player;)Z
         5: ifne          9
         8: return
         9: invokestatic  #50                 // Method ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
        12: aload_2
        13: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        16: invokevirtual #60                 // Method ext/mods/gameserver/data/xml/TeleportData.getTeleports:(I)Ljava/util/List;
        19: astore        4
        21: aload         4
        23: ifnull        37
        26: iload_3
        27: aload         4
        29: invokeinterface #64,  1           // InterfaceMethod java/util/List.size:()I
        34: if_icmple     38
        37: return
        38: aload         4
        40: iload_3
        41: invokeinterface #69,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        46: checkcast     #73                 // class ext/mods/gameserver/model/location/TeleportLocation
        49: astore        5
        51: aload         5
        53: ifnonnull     57
        56: return
        57: aload         5
        59: invokevirtual #75                 // Method ext/mods/gameserver/model/location/TeleportLocation.getCastleId:()I
        62: ifle          102
        65: invokestatic  #78                 // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        68: aload         5
        70: invokevirtual #75                 // Method ext/mods/gameserver/model/location/TeleportLocation.getCastleId:()I
        73: invokevirtual #83                 // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        76: astore        6
        78: aload         6
        80: ifnull        102
        83: aload         6
        85: invokevirtual #87                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        88: invokevirtual #93                 // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        91: ifeq          102
        94: aload_1
        95: getstatic     #99                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_PORT_VILLAGE_IN_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
        98: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       101: return
       102: getstatic     #108                // Field ext/mods/Config.FREE_TELEPORT:Z
       105: ifeq          121
       108: aload_1
       109: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       112: invokevirtual #118                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       115: getstatic     #123                // Field ext/mods/Config.LVL_FREE_TELEPORT:I
       118: if_icmple     148
       121: aload         5
       123: invokevirtual #127                // Method ext/mods/gameserver/model/location/TeleportLocation.getPriceCount:()I
       126: ifeq          148
       129: aload_1
       130: aload         5
       132: invokevirtual #130                // Method ext/mods/gameserver/model/location/TeleportLocation.getPriceId:()I
       135: aload         5
       137: aload_1
       138: invokevirtual #133                // Method ext/mods/gameserver/model/location/TeleportLocation.getCalculatedPriceCount:(Lext/mods/gameserver/model/actor/Player;)I
       141: iconst_1
       142: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
       145: ifeq          156
       148: aload_1
       149: aload         5
       151: bipush        20
       153: invokevirtual #141                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       156: aload_1
       157: getstatic     #34                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       160: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       163: return
      LineNumberTable:
        line 67: 0
        line 68: 8
        line 70: 9
        line 71: 21
        line 72: 37
        line 74: 38
        line 75: 51
        line 76: 56
        line 78: 57
        line 80: 65
        line 81: 78
        line 83: 94
        line 84: 101
        line 88: 102
        line 89: 148
        line 91: 156
        line 92: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      24     6 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0     164     0  this   Lext/mods/gameserver/handler/bypasshandlers/Teleport;
            0     164     1 player   Lext/mods/gameserver/model/actor/Player;
            0     164     2   npc   Lext/mods/gameserver/model/actor/Npc;
            0     164     3 index   I
           21     143     4 teleports   Ljava/util/List;
           51     113     5 teleport   Lext/mods/gameserver/model/location/TeleportLocation;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           21     143     4 teleports   Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
      StackMapTable: number_of_entries = 8
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/List ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/location/TeleportLocation ]
        frame_type = 44 /* same */
        frame_type = 18 /* same */
        frame_type = 26 /* same */
        frame_type = 7 /* same */

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #145                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/Teleport;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #149                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #151                // String teleport
         8: aastore
         9: putstatic     #145                // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "Teleport.java"
