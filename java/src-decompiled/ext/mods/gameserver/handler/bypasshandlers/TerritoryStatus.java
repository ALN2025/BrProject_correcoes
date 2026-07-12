// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.TerritoryStatus
// File: ext\mods\gameserver\handler\bypasshandlers\TerritoryStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus.class
  Last modified 9 de jul de 2026; size 3033 bytes
  MD5 checksum 9c3d469be28f41ba84f929040607258d
  Compiled from "TerritoryStatus.java"
public class ext.mods.gameserver.handler.bypasshandlers.TerritoryStatus implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #107                        // ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Npc
    #8 = Utf8               ext/mods/gameserver/model/actor/Npc
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #10 = NameAndType        #11:#12       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #11 = Utf8               getCastle
   #12 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #13 = Class              #14           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #14 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Creature
   #17 = NameAndType        #19:#20       // getObjectId:()I
   #18 = Utf8               ext/mods/gameserver/model/actor/Creature
   #19 = Utf8               getObjectId
   #20 = Utf8               ()I
   #21 = Methodref          #13.#22       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #22 = NameAndType        #5:#23        // "<init>":(I)V
   #23 = Utf8               (I)V
   #24 = Methodref          #25.#26       // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #25 = Class              #27           // ext/mods/gameserver/data/sql/ClanTable
   #26 = NameAndType        #28:#29       // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #27 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #28 = Utf8               getInstance
   #29 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
   #31 = Class              #33           // ext/mods/gameserver/model/residence/castle/Castle
   #32 = NameAndType        #34:#20       // getOwnerId:()I
   #33 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #34 = Utf8               getOwnerId
   #35 = Methodref          #25.#36       // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #36 = NameAndType        #37:#38       // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
   #37 = Utf8               getClan
   #38 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #40 = Class              #42           // ext/mods/gameserver/model/actor/Player
   #41 = NameAndType        #43:#44       // getLocale:()Ljava/util/Locale;
   #42 = Utf8               ext/mods/gameserver/model/actor/Player
   #43 = Utf8               getLocale
   #44 = Utf8               ()Ljava/util/Locale;
   #45 = String             #46           // html/territorystatus.htm
   #46 = Utf8               html/territorystatus.htm
   #47 = Methodref          #13.#48       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #48 = NameAndType        #49:#50       // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #49 = Utf8               setFile
   #50 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #51 = String             #52           // %clanName%
   #52 = Utf8               %clanName%
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #54 = Class              #56           // ext/mods/gameserver/model/pledge/Clan
   #55 = NameAndType        #57:#58       // getName:()Ljava/lang/String;
   #56 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #57 = Utf8               getName
   #58 = Utf8               ()Ljava/lang/String;
   #59 = Methodref          #13.#60       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #60 = NameAndType        #61:#62       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #61 = Utf8               replace
   #62 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #63 = String             #64           // %clanLeaderName%
   #64 = Utf8               %clanLeaderName%
   #65 = Methodref          #54.#66       // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
   #66 = NameAndType        #67:#58       // getLeaderName:()Ljava/lang/String;
   #67 = Utf8               getLeaderName
   #68 = String             #69           // %taxPercent%
   #69 = Utf8               %taxPercent%
   #70 = Methodref          #31.#71       // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
   #71 = NameAndType        #72:#20       // getCurrentTaxPercent:()I
   #72 = Utf8               getCurrentTaxPercent
   #73 = Methodref          #13.#74       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #74 = NameAndType        #61:#75       // replace:(Ljava/lang/String;I)V
   #75 = Utf8               (Ljava/lang/String;I)V
   #76 = String             #77           // html/territorynoclan.htm
   #77 = Utf8               html/territorynoclan.htm
   #78 = String             #79           // %territory%
   #79 = Utf8               %territory%
   #80 = Methodref          #31.#81       // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
   #81 = NameAndType        #82:#20       // getId:()I
   #82 = Utf8               getId
   #83 = Fieldref           #84.#85       // ext/mods/gameserver/network/NpcStringId.ID_1001100:Lext/mods/gameserver/network/NpcStringId;
   #84 = Class              #86           // ext/mods/gameserver/network/NpcStringId
   #85 = NameAndType        #87:#88       // ID_1001100:Lext/mods/gameserver/network/NpcStringId;
   #86 = Utf8               ext/mods/gameserver/network/NpcStringId
   #87 = Utf8               ID_1001100
   #88 = Utf8               Lext/mods/gameserver/network/NpcStringId;
   #89 = Methodref          #84.#90       // ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
   #90 = NameAndType        #91:#58       // getMessage:()Ljava/lang/String;
   #91 = Utf8               getMessage
   #92 = Fieldref           #84.#93       // ext/mods/gameserver/network/NpcStringId.ID_1001000:Lext/mods/gameserver/network/NpcStringId;
   #93 = NameAndType        #94:#88       // ID_1001000:Lext/mods/gameserver/network/NpcStringId;
   #94 = Utf8               ID_1001000
   #95 = String             #96           // %townName%
   #96 = Utf8               %townName%
   #97 = Methodref          #31.#98       // ext/mods/gameserver/model/residence/castle/Castle.getTownName:()Ljava/lang/String;
   #98 = NameAndType        #99:#58       // getTownName:()Ljava/lang/String;
   #99 = Utf8               getTownName
  #100 = String             #101          // %objectId%
  #101 = Utf8               %objectId%
  #102 = Methodref          #40.#103      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = NameAndType        #104:#105     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #104 = Utf8               sendPacket
  #105 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #106 = Fieldref           #107.#108     // ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus.COMMANDS:[Ljava/lang/String;
  #107 = Class              #109          // ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus
  #108 = NameAndType        #110:#111     // COMMANDS:[Ljava/lang/String;
  #109 = Utf8               ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus
  #110 = Utf8               COMMANDS
  #111 = Utf8               [Ljava/lang/String;
  #112 = Class              #113          // java/lang/String
  #113 = Utf8               java/lang/String
  #114 = String             #115          // TerritoryStatus
  #115 = Utf8               TerritoryStatus
  #116 = Class              #117          // ext/mods/gameserver/handler/IBypassHandler
  #117 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               this
  #122 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/TerritoryStatus;
  #123 = Utf8               useBypass
  #124 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #125 = Utf8               castle
  #126 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #127 = Utf8               html
  #128 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #129 = Utf8               clan
  #130 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #131 = Utf8               npc
  #132 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #133 = Utf8               command
  #134 = Utf8               Ljava/lang/String;
  #135 = Utf8               player
  #136 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #137 = Utf8               target
  #138 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #139 = Utf8               StackMapTable
  #140 = Utf8               getBypassList
  #141 = Utf8               ()[Ljava/lang/String;
  #142 = Utf8               <clinit>
  #143 = Utf8               SourceFile
  #144 = Utf8               TerritoryStatus.java
{
  public ext.mods.gameserver.handler.bypasshandlers.TerritoryStatus();
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
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/TerritoryStatus;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: aload_3
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Npc
         4: ifeq          180
         7: aload_3
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Npc
        11: astore        4
        13: aload         4
        15: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
        18: astore        5
        20: aload         5
        22: ifnonnull     27
        25: iconst_0
        26: ireturn
        27: new           #13                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        30: dup
        31: aload_3
        32: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        35: invokespecial #21                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        38: astore        6
        40: invokestatic  #24                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        43: aload         5
        45: invokevirtual #30                 // Method ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
        48: invokevirtual #35                 // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        51: astore        7
        53: aload         7
        55: ifnull        108
        58: aload         6
        60: aload_2
        61: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        64: ldc           #45                 // String html/territorystatus.htm
        66: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        69: aload         6
        71: ldc           #51                 // String %clanName%
        73: aload         7
        75: invokevirtual #53                 // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        78: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        81: aload         6
        83: ldc           #63                 // String %clanLeaderName%
        85: aload         7
        87: invokevirtual #65                 // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
        90: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        93: aload         6
        95: ldc           #68                 // String %taxPercent%
        97: aload         5
        99: invokevirtual #70                 // Method ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
       102: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       105: goto          119
       108: aload         6
       110: aload_2
       111: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       114: ldc           #76                 // String html/territorynoclan.htm
       116: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       119: aload         6
       121: ldc           #78                 // String %territory%
       123: aload         5
       125: invokevirtual #80                 // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       128: bipush        6
       130: if_icmple     142
       133: getstatic     #83                 // Field ext/mods/gameserver/network/NpcStringId.ID_1001100:Lext/mods/gameserver/network/NpcStringId;
       136: invokevirtual #89                 // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
       139: goto          148
       142: getstatic     #92                 // Field ext/mods/gameserver/network/NpcStringId.ID_1001000:Lext/mods/gameserver/network/NpcStringId;
       145: invokevirtual #89                 // Method ext/mods/gameserver/network/NpcStringId.getMessage:()Ljava/lang/String;
       148: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       151: aload         6
       153: ldc           #95                 // String %townName%
       155: aload         5
       157: invokevirtual #97                 // Method ext/mods/gameserver/model/residence/castle/Castle.getTownName:()Ljava/lang/String;
       160: invokevirtual #59                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       163: aload         6
       165: ldc           #100                // String %objectId%
       167: aload_3
       168: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       171: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       174: aload_2
       175: aload         6
       177: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       180: iconst_1
       181: ireturn
      LineNumberTable:
        line 40: 0
        line 42: 13
        line 43: 20
        line 44: 25
        line 46: 27
        line 48: 40
        line 49: 53
        line 51: 58
        line 52: 69
        line 53: 81
        line 54: 93
        line 57: 108
        line 59: 119
        line 60: 151
        line 61: 163
        line 63: 174
        line 65: 180
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20     160     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           40     140     6  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           53     127     7  clan   Lext/mods/gameserver/model/pledge/Clan;
           13     167     4   npc   Lext/mods/gameserver/model/actor/Npc;
            0     182     0  this   Lext/mods/gameserver/handler/bypasshandlers/TerritoryStatus;
            0     182     1 command   Ljava/lang/String;
            0     182     2 player   Lext/mods/gameserver/model/actor/Player;
            0     182     3 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 253 /* append */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/residence/castle/Castle, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/TerritoryStatus, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature ]
          stack = []

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #106                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/TerritoryStatus;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #112                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #114                // String TerritoryStatus
         8: aastore
         9: putstatic     #106                // Field COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "TerritoryStatus.java"
