// Bytecode for: ext.mods.gameserver.network.clientpackets.AllyDismiss
// File: ext\mods\gameserver\network\clientpackets\AllyDismiss.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AllyDismiss.class
  Last modified 9 de jul de 2026; size 2591 bytes
  MD5 checksum 53a047521819569af3b7833e9684207f
  Compiled from "AllyDismiss.java"
public final class ext.mods.gameserver.network.clientpackets.AllyDismiss extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AllyDismiss
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/AllyDismiss.readS:()Ljava/lang/String;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/AllyDismiss
    #9 = NameAndType        #11:#12       // readS:()Ljava/lang/String;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/AllyDismiss
   #11 = Utf8               readS
   #12 = Utf8               ()Ljava/lang/String;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/AllyDismiss._pledgeName:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // _pledgeName:Ljava/lang/String;
   #15 = Utf8               _pledgeName
   #16 = Utf8               Ljava/lang/String;
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/AllyDismiss.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getClan
   #32 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #33 = Fieldref           #34.#35       // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
   #34 = Class              #36           // ext/mods/gameserver/network/SystemMessageId
   #35 = NameAndType        #37:#38       // YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
   #36 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #37 = Utf8               YOU_ARE_NOT_A_CLAN_MEMBER
   #38 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #39 = Methodref          #28.#40       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #40 = NameAndType        #41:#42       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #41 = Utf8               sendPacket
   #42 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
   #44 = Class              #46           // ext/mods/gameserver/model/pledge/Clan
   #45 = NameAndType        #47:#48       // getAllyId:()I
   #46 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #47 = Utf8               getAllyId
   #48 = Utf8               ()I
   #49 = Fieldref           #34.#50       // ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
   #50 = NameAndType        #51:#38       // NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
   #51 = Utf8               NO_CURRENT_ALLIANCES
   #52 = Methodref          #28.#53       // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
   #53 = NameAndType        #54:#55       // isClanLeader:()Z
   #54 = Utf8               isClanLeader
   #55 = Utf8               ()Z
   #56 = Methodref          #44.#57       // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #57 = NameAndType        #58:#48       // getClanId:()I
   #58 = Utf8               getClanId
   #59 = Fieldref           #34.#60       // ext/mods/gameserver/network/SystemMessageId.FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
   #60 = NameAndType        #61:#38       // FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
   #61 = Utf8               FEATURE_ONLY_FOR_ALLIANCE_LEADER
   #62 = Methodref          #63.#64       // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #63 = Class              #65           // ext/mods/gameserver/data/sql/ClanTable
   #64 = NameAndType        #66:#67       // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #65 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #66 = Utf8               getInstance
   #67 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #68 = Methodref          #63.#69       // ext/mods/gameserver/data/sql/ClanTable.getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
   #69 = NameAndType        #70:#71       // getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
   #70 = Utf8               getClanByName
   #71 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
   #72 = Fieldref           #34.#73       // ext/mods/gameserver/network/SystemMessageId.CLAN_DOESNT_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
   #73 = NameAndType        #74:#38       // CLAN_DOESNT_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
   #74 = Utf8               CLAN_DOESNT_EXISTS
   #75 = Fieldref           #34.#76       // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_LEADER_CANT_WITHDRAW:Lext/mods/gameserver/network/SystemMessageId;
   #76 = NameAndType        #77:#38       // ALLIANCE_LEADER_CANT_WITHDRAW:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Utf8               ALLIANCE_LEADER_CANT_WITHDRAW
   #78 = Fieldref           #34.#79       // ext/mods/gameserver/network/SystemMessageId.DIFFERENT_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #79 = NameAndType        #80:#38       // DIFFERENT_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #80 = Utf8               DIFFERENT_ALLIANCE
   #81 = Methodref          #82.#83       // java/lang/System.currentTimeMillis:()J
   #82 = Class              #84           // java/lang/System
   #83 = NameAndType        #85:#86       // currentTimeMillis:()J
   #84 = Utf8               java/lang/System
   #85 = Utf8               currentTimeMillis
   #86 = Utf8               ()J
   #87 = Fieldref           #88.#89       // ext/mods/Config.ACCEPT_CLAN_DAYS_WHEN_DISMISSED:I
   #88 = Class              #90           // ext/mods/Config
   #89 = NameAndType        #91:#92       // ACCEPT_CLAN_DAYS_WHEN_DISMISSED:I
   #90 = Utf8               ext/mods/Config
   #91 = Utf8               ACCEPT_CLAN_DAYS_WHEN_DISMISSED
   #92 = Utf8               I
   #93 = Long               86400000l
   #95 = Methodref          #44.#96       // ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
   #96 = NameAndType        #97:#98       // setAllyPenaltyExpiryTime:(JI)V
   #97 = Utf8               setAllyPenaltyExpiryTime
   #98 = Utf8               (JI)V
   #99 = Methodref          #44.#100      // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
  #100 = NameAndType        #101:#6       // updateClanInDB:()V
  #101 = Utf8               updateClanInDB
  #102 = Methodref          #44.#103      // ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
  #103 = NameAndType        #104:#105     // setAllyId:(I)V
  #104 = Utf8               setAllyId
  #105 = Utf8               (I)V
  #106 = Methodref          #44.#107      // ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
  #107 = NameAndType        #108:#109     // setAllyName:(Ljava/lang/String;)V
  #108 = Utf8               setAllyName
  #109 = Utf8               (Ljava/lang/String;)V
  #110 = Methodref          #44.#111      // ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
  #111 = NameAndType        #112:#113     // changeAllyCrest:(IZ)V
  #112 = Utf8               changeAllyCrest
  #113 = Utf8               (IZ)V
  #114 = Fieldref           #88.#115      // ext/mods/Config.ALLY_JOIN_DAYS_WHEN_DISMISSED:I
  #115 = NameAndType        #116:#92      // ALLY_JOIN_DAYS_WHEN_DISMISSED:I
  #116 = Utf8               ALLY_JOIN_DAYS_WHEN_DISMISSED
  #117 = Fieldref           #34.#118      // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXPELED_A_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #118 = NameAndType        #119:#38      // YOU_HAVE_EXPELED_A_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #119 = Utf8               YOU_HAVE_EXPELED_A_CLAN
  #120 = Utf8               Code
  #121 = Utf8               LineNumberTable
  #122 = Utf8               LocalVariableTable
  #123 = Utf8               this
  #124 = Utf8               Lext/mods/gameserver/network/clientpackets/AllyDismiss;
  #125 = Utf8               readImpl
  #126 = Utf8               runImpl
  #127 = Utf8               player
  #128 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #129 = Utf8               leaderClan
  #130 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #131 = Utf8               clan
  #132 = Utf8               currentTime
  #133 = Utf8               J
  #134 = Utf8               StackMapTable
  #135 = Utf8               SourceFile
  #136 = Utf8               AllyDismiss.java
{
  public ext.mods.gameserver.network.clientpackets.AllyDismiss();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AllyDismiss;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readS:()Ljava/lang/String;
         5: putfield      #13                 // Field _pledgeName:Ljava/lang/String;
         8: return
      LineNumberTable:
        line 33: 0
        line 34: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/AllyDismiss;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=6, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _pledgeName:Ljava/lang/String;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        12: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
        15: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: astore_1
        19: aload_1
        20: ifnonnull     24
        23: return
        24: aload_1
        25: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        28: astore_2
        29: aload_2
        30: ifnonnull     41
        33: aload_1
        34: getstatic     #33                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_A_CLAN_MEMBER:Lext/mods/gameserver/network/SystemMessageId;
        37: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        40: return
        41: aload_2
        42: invokevirtual #43                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        45: ifne          56
        48: aload_1
        49: getstatic     #49                 // Field ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
        52: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        55: return
        56: aload_1
        57: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        60: ifeq          74
        63: aload_2
        64: invokevirtual #56                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        67: aload_2
        68: invokevirtual #43                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
        71: if_icmpeq     82
        74: aload_1
        75: getstatic     #59                 // Field ext/mods/gameserver/network/SystemMessageId.FEATURE_ONLY_FOR_ALLIANCE_LEADER:Lext/mods/gameserver/network/SystemMessageId;
        78: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        81: return
        82: invokestatic  #62                 // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        85: aload_0
        86: getfield      #13                 // Field _pledgeName:Ljava/lang/String;
        89: invokevirtual #68                 // Method ext/mods/gameserver/data/sql/ClanTable.getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
        92: astore_3
        93: aload_3
        94: ifnonnull     105
        97: aload_1
        98: getstatic     #72                 // Field ext/mods/gameserver/network/SystemMessageId.CLAN_DOESNT_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
       101: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       104: return
       105: aload_3
       106: invokevirtual #56                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       109: aload_2
       110: invokevirtual #56                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       113: if_icmpne     124
       116: aload_1
       117: getstatic     #75                 // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_LEADER_CANT_WITHDRAW:Lext/mods/gameserver/network/SystemMessageId;
       120: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       123: return
       124: aload_3
       125: invokevirtual #43                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
       128: aload_2
       129: invokevirtual #43                 // Method ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
       132: if_icmpeq     143
       135: aload_1
       136: getstatic     #78                 // Field ext/mods/gameserver/network/SystemMessageId.DIFFERENT_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       139: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       142: return
       143: invokestatic  #81                 // Method java/lang/System.currentTimeMillis:()J
       146: lstore        4
       148: aload_2
       149: lload         4
       151: getstatic     #87                 // Field ext/mods/Config.ACCEPT_CLAN_DAYS_WHEN_DISMISSED:I
       154: i2l
       155: ldc2_w        #93                 // long 86400000l
       158: lmul
       159: ladd
       160: iconst_3
       161: invokevirtual #95                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
       164: aload_2
       165: invokevirtual #99                 // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
       168: aload_3
       169: iconst_0
       170: invokevirtual #102                // Method ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
       173: aload_3
       174: aconst_null
       175: invokevirtual #106                // Method ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
       178: aload_3
       179: iconst_0
       180: iconst_1
       181: invokevirtual #110                // Method ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
       184: aload_3
       185: lload         4
       187: getstatic     #114                // Field ext/mods/Config.ALLY_JOIN_DAYS_WHEN_DISMISSED:I
       190: i2l
       191: ldc2_w        #93                 // long 86400000l
       194: lmul
       195: ladd
       196: iconst_2
       197: invokevirtual #95                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
       200: aload_3
       201: invokevirtual #99                 // Method ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
       204: aload_1
       205: getstatic     #117                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXPELED_A_CLAN:Lext/mods/gameserver/network/SystemMessageId;
       208: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       211: return
      LineNumberTable:
        line 39: 0
        line 40: 7
        line 42: 8
        line 43: 19
        line 44: 23
        line 46: 24
        line 47: 29
        line 49: 33
        line 50: 40
        line 53: 41
        line 55: 48
        line 56: 55
        line 59: 56
        line 61: 74
        line 62: 81
        line 65: 82
        line 66: 93
        line 68: 97
        line 69: 104
        line 72: 105
        line 74: 116
        line 75: 123
        line 78: 124
        line 80: 135
        line 81: 142
        line 84: 143
        line 85: 148
        line 86: 164
        line 88: 168
        line 89: 173
        line 90: 178
        line 91: 184
        line 92: 200
        line 94: 204
        line 95: 211
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     212     0  this   Lext/mods/gameserver/network/clientpackets/AllyDismiss;
           19     193     1 player   Lext/mods/gameserver/model/actor/Player;
           29     183     2 leaderClan   Lext/mods/gameserver/model/pledge/Clan;
           93     119     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          148      64     4 currentTime   J
      StackMapTable: number_of_entries = 9
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 18 /* same */
        frame_type = 18 /* same */
}
SourceFile: "AllyDismiss.java"
