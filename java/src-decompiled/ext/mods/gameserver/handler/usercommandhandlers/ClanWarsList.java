// Bytecode for: ext.mods.gameserver.handler.usercommandhandlers.ClanWarsList
// File: ext\mods\gameserver\handler\usercommandhandlers\ClanWarsList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList.class
  Last modified 9 de jul de 2026; size 4358 bytes
  MD5 checksum 36ca125bea5bab1a690dbdbb856b2b16
  Compiled from "ClanWarsList.java"
public class ext.mods.gameserver.handler.usercommandhandlers.ClanWarsList implements ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #29                         // ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getClan
   #12 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #14 = Class              #16           // ext/mods/gameserver/network/SystemMessageId
   #15 = NameAndType        #17:#18       // YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #17 = Utf8               YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT
   #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #20 = NameAndType        #21:#22       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #21 = Utf8               sendPacket
   #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Methodref          #24.#25       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #24 = Class              #26           // ext/mods/commons/pool/ConnectionPool
   #25 = NameAndType        #27:#28       // getConnection:()Ljava/sql/Connection;
   #26 = Utf8               ext/mods/commons/pool/ConnectionPool
   #27 = Utf8               getConnection
   #28 = Utf8               ()Ljava/sql/Connection;
   #29 = Class              #30           // ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList
   #30 = Utf8               ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList
   #31 = String             #32           // SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan1=? AND clan_id=clan2 AND clan2 NOT IN (SELECT clan1 FROM clan_wars WHERE clan2=?)
   #32 = Utf8               SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan1=? AND clan_id=clan2 AND clan2 NOT IN (SELECT clan1 FROM clan_wars WHERE clan2=?)
   #33 = String             #34           // SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan2=? AND clan_id=clan1 AND clan1 NOT IN (SELECT clan2 FROM clan_wars WHERE clan1=?)
   #34 = Utf8               SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan2=? AND clan_id=clan1 AND clan1 NOT IN (SELECT clan2 FROM clan_wars WHERE clan1=?)
   #35 = String             #36           // SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan1=? AND clan_id=clan2 AND clan2 IN (SELECT clan1 FROM clan_wars WHERE clan2=?)
   #36 = Utf8               SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan1=? AND clan_id=clan2 AND clan2 IN (SELECT clan1 FROM clan_wars WHERE clan2=?)
   #37 = InterfaceMethodref #38.#39       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #38 = Class              #40           // java/sql/Connection
   #39 = NameAndType        #41:#42       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #40 = Utf8               java/sql/Connection
   #41 = Utf8               prepareStatement
   #42 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
   #44 = Class              #46           // ext/mods/gameserver/model/pledge/Clan
   #45 = NameAndType        #47:#48       // getClanId:()I
   #46 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #47 = Utf8               getClanId
   #48 = Utf8               ()I
   #49 = InterfaceMethodref #50.#51       // java/sql/PreparedStatement.setInt:(II)V
   #50 = Class              #52           // java/sql/PreparedStatement
   #51 = NameAndType        #53:#54       // setInt:(II)V
   #52 = Utf8               java/sql/PreparedStatement
   #53 = Utf8               setInt
   #54 = Utf8               (II)V
   #55 = InterfaceMethodref #50.#56       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #56 = NameAndType        #57:#58       // executeQuery:()Ljava/sql/ResultSet;
   #57 = Utf8               executeQuery
   #58 = Utf8               ()Ljava/sql/ResultSet;
   #59 = InterfaceMethodref #60.#61       // java/sql/ResultSet.first:()Z
   #60 = Class              #62           // java/sql/ResultSet
   #61 = NameAndType        #63:#64       // first:()Z
   #62 = Utf8               java/sql/ResultSet
   #63 = Utf8               first
   #64 = Utf8               ()Z
   #65 = Fieldref           #14.#66       // ext/mods/gameserver/network/SystemMessageId.CLANS_YOU_DECLARED_WAR_ON:Lext/mods/gameserver/network/SystemMessageId;
   #66 = NameAndType        #67:#18       // CLANS_YOU_DECLARED_WAR_ON:Lext/mods/gameserver/network/SystemMessageId;
   #67 = Utf8               CLANS_YOU_DECLARED_WAR_ON
   #68 = Fieldref           #14.#69       // ext/mods/gameserver/network/SystemMessageId.CLANS_THAT_HAVE_DECLARED_WAR_ON_YOU:Lext/mods/gameserver/network/SystemMessageId;
   #69 = NameAndType        #70:#18       // CLANS_THAT_HAVE_DECLARED_WAR_ON_YOU:Lext/mods/gameserver/network/SystemMessageId;
   #70 = Utf8               CLANS_THAT_HAVE_DECLARED_WAR_ON_YOU
   #71 = Fieldref           #14.#72       // ext/mods/gameserver/network/SystemMessageId.WAR_LIST:Lext/mods/gameserver/network/SystemMessageId;
   #72 = NameAndType        #73:#18       // WAR_LIST:Lext/mods/gameserver/network/SystemMessageId;
   #73 = Utf8               WAR_LIST
   #74 = InterfaceMethodref #60.#75       // java/sql/ResultSet.next:()Z
   #75 = NameAndType        #76:#64       // next:()Z
   #76 = Utf8               next
   #77 = String             #78           // clan_name
   #78 = Utf8               clan_name
   #79 = InterfaceMethodref #60.#80       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #80 = NameAndType        #81:#82       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #81 = Utf8               getString
   #82 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #83 = String             #84           // ally_id
   #84 = Utf8               ally_id
   #85 = InterfaceMethodref #60.#86       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #86 = NameAndType        #87:#88       // getInt:(Ljava/lang/String;)I
   #87 = Utf8               getInt
   #88 = Utf8               (Ljava/lang/String;)I
   #89 = Fieldref           #14.#90       // ext/mods/gameserver/network/SystemMessageId.S1_S2_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #90 = NameAndType        #91:#18       // S1_S2_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
   #91 = Utf8               S1_S2_ALLIANCE
   #92 = Methodref          #93.#94       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #93 = Class              #95           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #94 = NameAndType        #96:#97       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #95 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #96 = Utf8               getSystemMessage
   #97 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #98 = Methodref          #93.#99       // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = NameAndType        #100:#101     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Utf8               addString
  #101 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = String             #103          // ally_name
  #103 = Utf8               ally_name
  #104 = Fieldref           #14.#105      // ext/mods/gameserver/network/SystemMessageId.S1_NO_ALLI_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #105 = NameAndType        #106:#18      // S1_NO_ALLI_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #106 = Utf8               S1_NO_ALLI_EXISTS
  #107 = Methodref          #8.#108       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = NameAndType        #21:#109      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = Fieldref           #14.#111      // ext/mods/gameserver/network/SystemMessageId.FRIEND_LIST_FOOTER:Lext/mods/gameserver/network/SystemMessageId;
  #111 = NameAndType        #112:#18      // FRIEND_LIST_FOOTER:Lext/mods/gameserver/network/SystemMessageId;
  #112 = Utf8               FRIEND_LIST_FOOTER
  #113 = Fieldref           #14.#114      // ext/mods/gameserver/network/SystemMessageId.YOU_ARENT_IN_CLAN_WARS:Lext/mods/gameserver/network/SystemMessageId;
  #114 = NameAndType        #115:#18      // YOU_ARENT_IN_CLAN_WARS:Lext/mods/gameserver/network/SystemMessageId;
  #115 = Utf8               YOU_ARENT_IN_CLAN_WARS
  #116 = Fieldref           #14.#117      // ext/mods/gameserver/network/SystemMessageId.NO_CLAN_WARS_VS_YOU:Lext/mods/gameserver/network/SystemMessageId;
  #117 = NameAndType        #118:#18      // NO_CLAN_WARS_VS_YOU:Lext/mods/gameserver/network/SystemMessageId;
  #118 = Utf8               NO_CLAN_WARS_VS_YOU
  #119 = Fieldref           #14.#120      // ext/mods/gameserver/network/SystemMessageId.NOT_INVOLVED_IN_WAR:Lext/mods/gameserver/network/SystemMessageId;
  #120 = NameAndType        #121:#18      // NOT_INVOLVED_IN_WAR:Lext/mods/gameserver/network/SystemMessageId;
  #121 = Utf8               NOT_INVOLVED_IN_WAR
  #122 = InterfaceMethodref #60.#123      // java/sql/ResultSet.close:()V
  #123 = NameAndType        #124:#6       // close:()V
  #124 = Utf8               close
  #125 = Class              #126          // java/lang/Throwable
  #126 = Utf8               java/lang/Throwable
  #127 = Methodref          #125.#128     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #128 = NameAndType        #129:#130     // addSuppressed:(Ljava/lang/Throwable;)V
  #129 = Utf8               addSuppressed
  #130 = Utf8               (Ljava/lang/Throwable;)V
  #131 = InterfaceMethodref #50.#123      // java/sql/PreparedStatement.close:()V
  #132 = InterfaceMethodref #38.#123      // java/sql/Connection.close:()V
  #133 = Class              #134          // java/lang/Exception
  #134 = Utf8               java/lang/Exception
  #135 = Fieldref           #29.#136      // ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList.COMMAND_IDS:[I
  #136 = NameAndType        #137:#138     // COMMAND_IDS:[I
  #137 = Utf8               COMMAND_IDS
  #138 = Utf8               [I
  #139 = Class              #140          // ext/mods/gameserver/handler/IUserCommandHandler
  #140 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
  #141 = Utf8               SELECT_ATTACK_LIST
  #142 = Utf8               Ljava/lang/String;
  #143 = Utf8               ConstantValue
  #144 = Utf8               SELECT_UNDER_ATTACK_LIST
  #145 = Utf8               SELECT_WAR_LIST
  #146 = Utf8               Code
  #147 = Utf8               LineNumberTable
  #148 = Utf8               LocalVariableTable
  #149 = Utf8               this
  #150 = Utf8               Lext/mods/gameserver/handler/usercommandhandlers/ClanWarsList;
  #151 = Utf8               useUserCommand
  #152 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #153 = Utf8               sm
  #154 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #155 = Utf8               clanName
  #156 = Utf8               rs
  #157 = Utf8               Ljava/sql/ResultSet;
  #158 = Utf8               ps
  #159 = Utf8               Ljava/sql/PreparedStatement;
  #160 = Utf8               con
  #161 = Utf8               Ljava/sql/Connection;
  #162 = Utf8               id
  #163 = Utf8               I
  #164 = Utf8               player
  #165 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #166 = Utf8               clan
  #167 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #168 = Utf8               StackMapTable
  #169 = Class              #170          // java/lang/String
  #170 = Utf8               java/lang/String
  #171 = Utf8               getUserCommandList
  #172 = Utf8               ()[I
  #173 = Utf8               <clinit>
  #174 = Utf8               SourceFile
  #175 = Utf8               ClanWarsList.java
{
  public ext.mods.gameserver.handler.usercommandhandlers.ClanWarsList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ClanWarsList;

  public void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_3
         5: aload_3
         6: ifnonnull     17
         9: aload_2
        10: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
        13: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        16: return
        17: invokestatic  #23                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        20: astore        4
        22: aload         4
        24: iload_1
        25: bipush        88
        27: if_icmpne     35
        30: ldc           #31                 // String SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan1=? AND clan_id=clan2 AND clan2 NOT IN (SELECT clan1 FROM clan_wars WHERE clan2=?)
        32: goto          48
        35: iload_1
        36: bipush        89
        38: if_icmpne     46
        41: ldc           #33                 // String SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan2=? AND clan_id=clan1 AND clan1 NOT IN (SELECT clan2 FROM clan_wars WHERE clan1=?)
        43: goto          48
        46: ldc           #35                 // String SELECT clan_name,clan_id,ally_id,ally_name FROM clan_data,clan_wars WHERE clan1=? AND clan_id=clan2 AND clan2 IN (SELECT clan1 FROM clan_wars WHERE clan2=?)
        48: invokeinterface #37,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        53: astore        5
        55: aload         5
        57: iconst_1
        58: aload_3
        59: invokevirtual #43                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        62: invokeinterface #49,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        67: aload         5
        69: iconst_2
        70: aload_3
        71: invokevirtual #43                 // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        74: invokeinterface #49,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        79: aload         5
        81: invokeinterface #55,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        86: astore        6
        88: aload         6
        90: invokeinterface #59,  1           // InterfaceMethod java/sql/ResultSet.first:()Z
        95: ifeq          230
        98: iload_1
        99: bipush        88
       101: if_icmpne     114
       104: aload_2
       105: getstatic     #65                 // Field ext/mods/gameserver/network/SystemMessageId.CLANS_YOU_DECLARED_WAR_ON:Lext/mods/gameserver/network/SystemMessageId;
       108: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       111: goto          137
       114: iload_1
       115: bipush        89
       117: if_icmpne     130
       120: aload_2
       121: getstatic     #68                 // Field ext/mods/gameserver/network/SystemMessageId.CLANS_THAT_HAVE_DECLARED_WAR_ON_YOU:Lext/mods/gameserver/network/SystemMessageId;
       124: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       127: goto          137
       130: aload_2
       131: getstatic     #71                 // Field ext/mods/gameserver/network/SystemMessageId.WAR_LIST:Lext/mods/gameserver/network/SystemMessageId;
       134: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       137: aload         6
       139: invokeinterface #74,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       144: ifeq          220
       147: aload         6
       149: ldc           #77                 // String clan_name
       151: invokeinterface #79,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       156: astore        8
       158: aload         6
       160: ldc           #83                 // String ally_id
       162: invokeinterface #85,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       167: ifle          198
       170: getstatic     #89                 // Field ext/mods/gameserver/network/SystemMessageId.S1_S2_ALLIANCE:Lext/mods/gameserver/network/SystemMessageId;
       173: invokestatic  #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       176: aload         8
       178: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       181: aload         6
       183: ldc           #102                // String ally_name
       185: invokeinterface #79,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       190: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       193: astore        7
       195: goto          211
       198: getstatic     #104                // Field ext/mods/gameserver/network/SystemMessageId.S1_NO_ALLI_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
       201: invokestatic  #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       204: aload         8
       206: invokevirtual #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       209: astore        7
       211: aload_2
       212: aload         7
       214: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       217: goto          137
       220: aload_2
       221: getstatic     #110                // Field ext/mods/gameserver/network/SystemMessageId.FRIEND_LIST_FOOTER:Lext/mods/gameserver/network/SystemMessageId;
       224: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       227: goto          275
       230: iload_1
       231: bipush        88
       233: if_icmpne     246
       236: aload_2
       237: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARENT_IN_CLAN_WARS:Lext/mods/gameserver/network/SystemMessageId;
       240: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       243: goto          275
       246: iload_1
       247: bipush        89
       249: if_icmpne     262
       252: aload_2
       253: getstatic     #116                // Field ext/mods/gameserver/network/SystemMessageId.NO_CLAN_WARS_VS_YOU:Lext/mods/gameserver/network/SystemMessageId;
       256: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       259: goto          275
       262: iload_1
       263: bipush        90
       265: if_icmpne     275
       268: aload_2
       269: getstatic     #119                // Field ext/mods/gameserver/network/SystemMessageId.NOT_INVOLVED_IN_WAR:Lext/mods/gameserver/network/SystemMessageId;
       272: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       275: aload         6
       277: ifnull        319
       280: aload         6
       282: invokeinterface #122,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       287: goto          319
       290: astore        7
       292: aload         6
       294: ifnull        316
       297: aload         6
       299: invokeinterface #122,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       304: goto          316
       307: astore        8
       309: aload         7
       311: aload         8
       313: invokevirtual #127                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       316: aload         7
       318: athrow
       319: aload         5
       321: ifnull        363
       324: aload         5
       326: invokeinterface #131,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       331: goto          363
       334: astore        6
       336: aload         5
       338: ifnull        360
       341: aload         5
       343: invokeinterface #131,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       348: goto          360
       351: astore        7
       353: aload         6
       355: aload         7
       357: invokevirtual #127                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       360: aload         6
       362: athrow
       363: aload         4
       365: ifnull        407
       368: aload         4
       370: invokeinterface #132,  1          // InterfaceMethod java/sql/Connection.close:()V
       375: goto          407
       378: astore        5
       380: aload         4
       382: ifnull        404
       385: aload         4
       387: invokeinterface #132,  1          // InterfaceMethod java/sql/Connection.close:()V
       392: goto          404
       395: astore        6
       397: aload         5
       399: aload         6
       401: invokevirtual #127                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       404: aload         5
       406: athrow
       407: goto          412
       410: astore        4
       412: return
      Exception table:
         from    to  target type
            88   275   290   Class java/lang/Throwable
           297   304   307   Class java/lang/Throwable
            55   319   334   Class java/lang/Throwable
           341   348   351   Class java/lang/Throwable
            22   363   378   Class java/lang/Throwable
           385   392   395   Class java/lang/Throwable
            17   407   410   Class java/lang/Exception
      LineNumberTable:
        line 48: 0
        line 49: 5
        line 51: 9
        line 52: 16
        line 55: 17
        line 56: 22
        line 58: 55
        line 59: 67
        line 61: 79
        line 63: 88
        line 65: 98
        line 66: 104
        line 67: 114
        line 68: 120
        line 70: 130
        line 73: 137
        line 75: 147
        line 76: 158
        line 77: 170
        line 79: 198
        line 81: 211
        line 82: 217
        line 84: 220
        line 88: 230
        line 89: 236
        line 90: 246
        line 91: 252
        line 92: 262
        line 93: 268
        line 95: 275
        line 61: 290
        line 96: 319
        line 55: 334
        line 96: 363
        line 55: 378
        line 99: 407
        line 97: 410
        line 100: 412
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          195       3     7    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          158      59     8 clanName   Ljava/lang/String;
          211       9     7    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
           88     231     6    rs   Ljava/sql/ResultSet;
           55     308     5    ps   Ljava/sql/PreparedStatement;
           22     385     4   con   Ljava/sql/Connection;
            0     413     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ClanWarsList;
            0     413     1    id   I
            0     413     2 player   Lext/mods/gameserver/model/actor/Player;
            5     408     3  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 28
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection ]
          stack = [ class java/sql/Connection ]
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ class java/sql/Connection ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection ]
          stack = [ class java/sql/Connection, class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 65
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 15 /* same */
        frame_type = 6 /* same */
        frame_type = 253 /* append */
          offset_delta = 60
          locals = [ top, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/network/serverpackets/SystemMessage, class java/lang/String ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 9 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/usercommandhandlers/ClanWarsList, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 1 /* same */

  public int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #135                // Field COMMAND_IDS:[I
         3: areturn
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/usercommandhandlers/ClanWarsList;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_3
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        88
         7: iastore
         8: dup
         9: iconst_1
        10: bipush        89
        12: iastore
        13: dup
        14: iconst_2
        15: bipush        90
        17: iastore
        18: putstatic     #135                // Field COMMAND_IDS:[I
        21: return
      LineNumberTable:
        line 38: 0
}
SourceFile: "ClanWarsList.java"
