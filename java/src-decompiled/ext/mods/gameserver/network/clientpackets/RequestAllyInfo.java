// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAllyInfo
// File: ext\mods\gameserver\network\clientpackets\RequestAllyInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAllyInfo.class
  Last modified 9 de jul de 2026; size 3219 bytes
  MD5 checksum f6d83477c18d5a8a989ea6457da10c04
  Compiled from "RequestAllyInfo.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAllyInfo extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAllyInfo
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAllyInfo.getClient:()Lext/mods/commons/mmocore/MMOClient;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAllyInfo
    #9 = NameAndType        #11:#12       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAllyInfo
   #11 = Utf8               getClient
   #12 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #13 = Class              #14           // ext/mods/gameserver/network/GameClient
   #14 = Utf8               ext/mods/gameserver/network/GameClient
   #15 = Methodref          #13.#16       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #16 = NameAndType        #17:#18       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #17 = Utf8               getPlayer
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Player.getAllyId:()I
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #21 = NameAndType        #23:#24       // getAllyId:()I
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Utf8               getAllyId
   #24 = Utf8               ()I
   #25 = Class              #26           // ext/mods/gameserver/network/serverpackets/AllianceInfo
   #26 = Utf8               ext/mods/gameserver/network/serverpackets/AllianceInfo
   #27 = Methodref          #25.#28       // ext/mods/gameserver/network/serverpackets/AllianceInfo."<init>":(I)V
   #28 = NameAndType        #5:#29        // "<init>":(I)V
   #29 = Utf8               (I)V
   #30 = Methodref          #20.#31       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #31 = NameAndType        #32:#33       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #32 = Utf8               sendPacket
   #33 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #34 = Fieldref           #35.#36       // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_INFO_HEAD:Lext/mods/gameserver/network/SystemMessageId;
   #35 = Class              #37           // ext/mods/gameserver/network/SystemMessageId
   #36 = NameAndType        #38:#39       // ALLIANCE_INFO_HEAD:Lext/mods/gameserver/network/SystemMessageId;
   #37 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #38 = Utf8               ALLIANCE_INFO_HEAD
   #39 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #41 = Class              #43           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #42 = NameAndType        #44:#45       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #43 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #44 = Utf8               getSystemMessage
   #45 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #46 = Fieldref           #35.#47       // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_NAME_S1:Lext/mods/gameserver/network/SystemMessageId;
   #47 = NameAndType        #48:#39       // ALLIANCE_NAME_S1:Lext/mods/gameserver/network/SystemMessageId;
   #48 = Utf8               ALLIANCE_NAME_S1
   #49 = Methodref          #25.#50       // ext/mods/gameserver/network/serverpackets/AllianceInfo.getName:()Ljava/lang/String;
   #50 = NameAndType        #51:#52       // getName:()Ljava/lang/String;
   #51 = Utf8               getName
   #52 = Utf8               ()Ljava/lang/String;
   #53 = Methodref          #41.#54       // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #54 = NameAndType        #55:#56       // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #55 = Utf8               addString
   #56 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #57 = Fieldref           #35.#58       // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_LEADER_S2_OF_S1:Lext/mods/gameserver/network/SystemMessageId;
   #58 = NameAndType        #59:#39       // ALLIANCE_LEADER_S2_OF_S1:Lext/mods/gameserver/network/SystemMessageId;
   #59 = Utf8               ALLIANCE_LEADER_S2_OF_S1
   #60 = Methodref          #25.#61       // ext/mods/gameserver/network/serverpackets/AllianceInfo.getClanName:()Ljava/lang/String;
   #61 = NameAndType        #62:#52       // getClanName:()Ljava/lang/String;
   #62 = Utf8               getClanName
   #63 = Methodref          #25.#64       // ext/mods/gameserver/network/serverpackets/AllianceInfo.getLeaderName:()Ljava/lang/String;
   #64 = NameAndType        #65:#52       // getLeaderName:()Ljava/lang/String;
   #65 = Utf8               getLeaderName
   #66 = Fieldref           #35.#67       // ext/mods/gameserver/network/SystemMessageId.CONNECTION_S1_TOTAL_S2:Lext/mods/gameserver/network/SystemMessageId;
   #67 = NameAndType        #68:#39       // CONNECTION_S1_TOTAL_S2:Lext/mods/gameserver/network/SystemMessageId;
   #68 = Utf8               CONNECTION_S1_TOTAL_S2
   #69 = Methodref          #25.#70       // ext/mods/gameserver/network/serverpackets/AllianceInfo.getOnline:()I
   #70 = NameAndType        #71:#24       // getOnline:()I
   #71 = Utf8               getOnline
   #72 = Methodref          #41.#73       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #73 = NameAndType        #74:#75       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = Utf8               addNumber
   #75 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #76 = Methodref          #25.#77       // ext/mods/gameserver/network/serverpackets/AllianceInfo.getTotal:()I
   #77 = NameAndType        #78:#24       // getTotal:()I
   #78 = Utf8               getTotal
   #79 = Fieldref           #35.#80       // ext/mods/gameserver/network/SystemMessageId.ALLIANCE_CLAN_TOTAL_S1:Lext/mods/gameserver/network/SystemMessageId;
   #80 = NameAndType        #81:#39       // ALLIANCE_CLAN_TOTAL_S1:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Utf8               ALLIANCE_CLAN_TOTAL_S1
   #82 = Methodref          #25.#83       // ext/mods/gameserver/network/serverpackets/AllianceInfo.getAllies:()[Lext/mods/gameserver/model/pledge/ClanInfo;
   #83 = NameAndType        #84:#85       // getAllies:()[Lext/mods/gameserver/model/pledge/ClanInfo;
   #84 = Utf8               getAllies
   #85 = Utf8               ()[Lext/mods/gameserver/model/pledge/ClanInfo;
   #86 = Fieldref           #35.#87       // ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_HEAD:Lext/mods/gameserver/network/SystemMessageId;
   #87 = NameAndType        #88:#39       // CLAN_INFO_HEAD:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Utf8               CLAN_INFO_HEAD
   #89 = Fieldref           #35.#90       // ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_NAME_S1:Lext/mods/gameserver/network/SystemMessageId;
   #90 = NameAndType        #91:#39       // CLAN_INFO_NAME_S1:Lext/mods/gameserver/network/SystemMessageId;
   #91 = Utf8               CLAN_INFO_NAME_S1
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/pledge/ClanInfo.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #93 = Class              #95           // ext/mods/gameserver/model/pledge/ClanInfo
   #94 = NameAndType        #96:#97       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #95 = Utf8               ext/mods/gameserver/model/pledge/ClanInfo
   #96 = Utf8               getClan
   #97 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #98 = Methodref          #99.#50       // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
   #99 = Class              #100          // ext/mods/gameserver/model/pledge/Clan
  #100 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #101 = Fieldref           #35.#102      // ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_LEADER_S1:Lext/mods/gameserver/network/SystemMessageId;
  #102 = NameAndType        #103:#39      // CLAN_INFO_LEADER_S1:Lext/mods/gameserver/network/SystemMessageId;
  #103 = Utf8               CLAN_INFO_LEADER_S1
  #104 = Methodref          #99.#64       // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #105 = Fieldref           #35.#106      // ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_LEVEL_S1:Lext/mods/gameserver/network/SystemMessageId;
  #106 = NameAndType        #107:#39      // CLAN_INFO_LEVEL_S1:Lext/mods/gameserver/network/SystemMessageId;
  #107 = Utf8               CLAN_INFO_LEVEL_S1
  #108 = Methodref          #99.#109      // ext/mods/gameserver/model/pledge/Clan.getLevel:()I
  #109 = NameAndType        #110:#24      // getLevel:()I
  #110 = Utf8               getLevel
  #111 = Methodref          #93.#70       // ext/mods/gameserver/model/pledge/ClanInfo.getOnline:()I
  #112 = Methodref          #93.#77       // ext/mods/gameserver/model/pledge/ClanInfo.getTotal:()I
  #113 = Fieldref           #35.#114      // ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_SEPARATOR:Lext/mods/gameserver/network/SystemMessageId;
  #114 = NameAndType        #115:#39      // CLAN_INFO_SEPARATOR:Lext/mods/gameserver/network/SystemMessageId;
  #115 = Utf8               CLAN_INFO_SEPARATOR
  #116 = Fieldref           #35.#117      // ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_FOOT:Lext/mods/gameserver/network/SystemMessageId;
  #117 = NameAndType        #118:#39      // CLAN_INFO_FOOT:Lext/mods/gameserver/network/SystemMessageId;
  #118 = Utf8               CLAN_INFO_FOOT
  #119 = Fieldref           #35.#120      // ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
  #120 = NameAndType        #121:#39      // NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
  #121 = Utf8               NO_CURRENT_ALLIANCES
  #122 = Methodref          #20.#123      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #123 = NameAndType        #32:#124      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #124 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #125 = Utf8               Code
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               this
  #129 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAllyInfo;
  #130 = Utf8               readImpl
  #131 = Utf8               runImpl
  #132 = Utf8               aci
  #133 = Utf8               Lext/mods/gameserver/model/pledge/ClanInfo;
  #134 = Utf8               ai
  #135 = Utf8               Lext/mods/gameserver/network/serverpackets/AllianceInfo;
  #136 = Utf8               sm
  #137 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #138 = Utf8               player
  #139 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #140 = Utf8               allianceId
  #141 = Utf8               I
  #142 = Utf8               StackMapTable
  #143 = Class              #144          // "[Lext/mods/gameserver/model/pledge/ClanInfo;"
  #144 = Utf8               [Lext/mods/gameserver/model/pledge/ClanInfo;
  #145 = Utf8               SourceFile
  #146 = Utf8               RequestAllyInfo.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAllyInfo();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAllyInfo;

  public void readImpl();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/RequestAllyInfo;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=9, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #13                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #15                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
        20: istore_3
        21: iload_3
        22: ifle          338
        25: new           #25                 // class ext/mods/gameserver/network/serverpackets/AllianceInfo
        28: dup
        29: iload_3
        30: invokespecial #27                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo."<init>":(I)V
        33: astore        4
        35: aload_1
        36: aload         4
        38: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        41: getstatic     #34                 // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_INFO_HEAD:Lext/mods/gameserver/network/SystemMessageId;
        44: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        47: astore_2
        48: aload_1
        49: aload_2
        50: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        53: getstatic     #46                 // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_NAME_S1:Lext/mods/gameserver/network/SystemMessageId;
        56: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        59: astore_2
        60: aload_2
        61: aload         4
        63: invokevirtual #49                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getName:()Ljava/lang/String;
        66: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        69: pop
        70: aload_1
        71: aload_2
        72: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: getstatic     #57                 // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_LEADER_S2_OF_S1:Lext/mods/gameserver/network/SystemMessageId;
        78: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        81: astore_2
        82: aload_2
        83: aload         4
        85: invokevirtual #60                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getClanName:()Ljava/lang/String;
        88: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        91: pop
        92: aload_2
        93: aload         4
        95: invokevirtual #63                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getLeaderName:()Ljava/lang/String;
        98: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       101: pop
       102: aload_1
       103: aload_2
       104: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       107: getstatic     #66                 // Field ext/mods/gameserver/network/SystemMessageId.CONNECTION_S1_TOTAL_S2:Lext/mods/gameserver/network/SystemMessageId;
       110: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       113: astore_2
       114: aload_2
       115: aload         4
       117: invokevirtual #69                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getOnline:()I
       120: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       123: pop
       124: aload_2
       125: aload         4
       127: invokevirtual #76                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getTotal:()I
       130: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       133: pop
       134: aload_1
       135: aload_2
       136: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       139: getstatic     #79                 // Field ext/mods/gameserver/network/SystemMessageId.ALLIANCE_CLAN_TOTAL_S1:Lext/mods/gameserver/network/SystemMessageId;
       142: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       145: astore_2
       146: aload_2
       147: aload         4
       149: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getAllies:()[Lext/mods/gameserver/model/pledge/ClanInfo;
       152: arraylength
       153: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       156: pop
       157: aload_1
       158: aload_2
       159: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       162: getstatic     #86                 // Field ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_HEAD:Lext/mods/gameserver/network/SystemMessageId;
       165: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       168: astore_2
       169: aload         4
       171: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/AllianceInfo.getAllies:()[Lext/mods/gameserver/model/pledge/ClanInfo;
       174: astore        5
       176: aload         5
       178: arraylength
       179: istore        6
       181: iconst_0
       182: istore        7
       184: iload         7
       186: iload         6
       188: if_icmpge     323
       191: aload         5
       193: iload         7
       195: aaload
       196: astore        8
       198: aload_1
       199: aload_2
       200: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       203: getstatic     #89                 // Field ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_NAME_S1:Lext/mods/gameserver/network/SystemMessageId;
       206: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       209: astore_2
       210: aload_2
       211: aload         8
       213: invokevirtual #92                 // Method ext/mods/gameserver/model/pledge/ClanInfo.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       216: invokevirtual #98                 // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       219: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       222: pop
       223: aload_1
       224: aload_2
       225: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       228: getstatic     #101                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_LEADER_S1:Lext/mods/gameserver/network/SystemMessageId;
       231: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       234: astore_2
       235: aload_2
       236: aload         8
       238: invokevirtual #92                 // Method ext/mods/gameserver/model/pledge/ClanInfo.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       241: invokevirtual #104                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
       244: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       247: pop
       248: aload_1
       249: aload_2
       250: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       253: getstatic     #105                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_LEVEL_S1:Lext/mods/gameserver/network/SystemMessageId;
       256: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       259: astore_2
       260: aload_2
       261: aload         8
       263: invokevirtual #92                 // Method ext/mods/gameserver/model/pledge/ClanInfo.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       266: invokevirtual #108                // Method ext/mods/gameserver/model/pledge/Clan.getLevel:()I
       269: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       272: pop
       273: aload_1
       274: aload_2
       275: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       278: getstatic     #66                 // Field ext/mods/gameserver/network/SystemMessageId.CONNECTION_S1_TOTAL_S2:Lext/mods/gameserver/network/SystemMessageId;
       281: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       284: astore_2
       285: aload_2
       286: aload         8
       288: invokevirtual #111                // Method ext/mods/gameserver/model/pledge/ClanInfo.getOnline:()I
       291: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       294: pop
       295: aload_2
       296: aload         8
       298: invokevirtual #112                // Method ext/mods/gameserver/model/pledge/ClanInfo.getTotal:()I
       301: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       304: pop
       305: aload_1
       306: aload_2
       307: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       310: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_SEPARATOR:Lext/mods/gameserver/network/SystemMessageId;
       313: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       316: astore_2
       317: iinc          7, 1
       320: goto          184
       323: getstatic     #116                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_INFO_FOOT:Lext/mods/gameserver/network/SystemMessageId;
       326: invokestatic  #40                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       329: astore_2
       330: aload_1
       331: aload_2
       332: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       335: goto          345
       338: aload_1
       339: getstatic     #119                // Field ext/mods/gameserver/network/SystemMessageId.NO_CURRENT_ALLIANCES:Lext/mods/gameserver/network/SystemMessageId;
       342: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       345: return
      LineNumberTable:
        line 36: 0
        line 37: 11
        line 38: 15
        line 42: 16
        line 43: 21
        line 45: 25
        line 46: 35
        line 48: 41
        line 49: 48
        line 51: 53
        line 52: 60
        line 53: 70
        line 55: 75
        line 56: 82
        line 57: 92
        line 58: 102
        line 60: 107
        line 61: 114
        line 62: 124
        line 63: 134
        line 65: 139
        line 66: 146
        line 67: 157
        line 69: 162
        line 70: 169
        line 72: 198
        line 74: 203
        line 75: 210
        line 76: 223
        line 78: 228
        line 79: 235
        line 80: 248
        line 82: 253
        line 83: 260
        line 84: 273
        line 86: 278
        line 87: 285
        line 88: 295
        line 89: 305
        line 91: 310
        line 70: 317
        line 94: 323
        line 95: 330
        line 96: 335
        line 98: 338
        line 99: 345
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          198     119     8   aci   Lext/mods/gameserver/model/pledge/ClanInfo;
           35     300     4    ai   Lext/mods/gameserver/network/serverpackets/AllianceInfo;
           48     290     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     346     0  this   Lext/mods/gameserver/network/clientpackets/RequestAllyInfo;
           11     335     1 player   Lext/mods/gameserver/model/actor/Player;
           21     325     3 allianceId   I
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 167
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAllyInfo, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/SystemMessage, int, class ext/mods/gameserver/network/serverpackets/AllianceInfo, class "[Lext/mods/gameserver/model/pledge/ClanInfo;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 138
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestAllyInfo, class ext/mods/gameserver/model/actor/Player, top, int ]
          stack = []
        frame_type = 6 /* same */
}
SourceFile: "RequestAllyInfo.java"
