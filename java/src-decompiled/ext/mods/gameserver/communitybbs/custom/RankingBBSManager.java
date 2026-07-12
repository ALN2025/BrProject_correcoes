// Bytecode for: ext.mods.gameserver.communitybbs.custom.RankingBBSManager
// File: ext\mods\gameserver\communitybbs\custom\RankingBBSManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/RankingBBSManager.class
  Last modified 9 de jul de 2026; size 11134 bytes
  MD5 checksum 9ddc3307036124cfb6249fd76f9c098f
  Compiled from "RankingBBSManager.java"
public class ext.mods.gameserver.communitybbs.custom.RankingBBSManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/communitybbs/custom/RankingBBSManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 5, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _bbsclan
    #8 = Utf8               _bbsclan
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.showRakingList:(Lext/mods/gameserver/model/actor/Player;)V
   #16 = Class              #18           // ext/mods/gameserver/communitybbs/custom/RankingBBSManager
   #17 = NameAndType        #19:#20       // showRakingList:(Lext/mods/gameserver/model/actor/Player;)V
   #18 = Utf8               ext/mods/gameserver/communitybbs/custom/RankingBBSManager
   #19 = Utf8               showRakingList
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #21 = Methodref          #2.#22        // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #22 = NameAndType        #23:#24       // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #23 = Utf8               parseCmd
   #24 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #25 = Fieldref           #16.#26       // ext/mods/gameserver/communitybbs/custom/RankingBBSManager._nextUpdate:J
   #26 = NameAndType        #27:#28       // _nextUpdate:J
   #27 = Utf8               _nextUpdate
   #28 = Utf8               J
   #29 = Methodref          #30.#31       // java/lang/System.currentTimeMillis:()J
   #30 = Class              #32           // java/lang/System
   #31 = NameAndType        #33:#34       // currentTimeMillis:()J
   #32 = Utf8               java/lang/System
   #33 = Utf8               currentTimeMillis
   #34 = Utf8               ()J
   #35 = Fieldref           #16.#36       // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.PVP:Ljava/lang/StringBuilder;
   #36 = NameAndType        #37:#38       // PVP:Ljava/lang/StringBuilder;
   #37 = Utf8               PVP
   #38 = Utf8               Ljava/lang/StringBuilder;
   #39 = Methodref          #40.#41       // java/lang/StringBuilder.setLength:(I)V
   #40 = Class              #42           // java/lang/StringBuilder
   #41 = NameAndType        #43:#44       // setLength:(I)V
   #42 = Utf8               java/lang/StringBuilder
   #43 = Utf8               setLength
   #44 = Utf8               (I)V
   #45 = Fieldref           #16.#46       // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.PKS:Ljava/lang/StringBuilder;
   #46 = NameAndType        #47:#38       // PKS:Ljava/lang/StringBuilder;
   #47 = Utf8               PKS
   #48 = Fieldref           #16.#49       // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.CLAN:Ljava/lang/StringBuilder;
   #49 = NameAndType        #50:#38       // CLAN:Ljava/lang/StringBuilder;
   #50 = Utf8               CLAN
   #51 = Methodref          #52.#53       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #52 = Class              #54           // ext/mods/commons/pool/ConnectionPool
   #53 = NameAndType        #55:#56       // getConnection:()Ljava/sql/Connection;
   #54 = Utf8               ext/mods/commons/pool/ConnectionPool
   #55 = Utf8               getConnection
   #56 = Utf8               ()Ljava/sql/Connection;
   #57 = String             #58           // SELECT char_name, pvpkills FROM characters WHERE pvpkills > 0 ORDER BY pvpkills DESC LIMIT 5
   #58 = Utf8               SELECT char_name, pvpkills FROM characters WHERE pvpkills > 0 ORDER BY pvpkills DESC LIMIT 5
   #59 = InterfaceMethodref #60.#61       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #60 = Class              #62           // java/sql/Connection
   #61 = NameAndType        #63:#64       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #62 = Utf8               java/sql/Connection
   #63 = Utf8               prepareStatement
   #64 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #65 = InterfaceMethodref #66.#67       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #66 = Class              #68           // java/sql/PreparedStatement
   #67 = NameAndType        #69:#70       // executeQuery:()Ljava/sql/ResultSet;
   #68 = Utf8               java/sql/PreparedStatement
   #69 = Utf8               executeQuery
   #70 = Utf8               ()Ljava/sql/ResultSet;
   #71 = InterfaceMethodref #72.#73       // java/sql/ResultSet.next:()Z
   #72 = Class              #74           // java/sql/ResultSet
   #73 = NameAndType        #75:#76       // next:()Z
   #74 = Utf8               java/sql/ResultSet
   #75 = Utf8               next
   #76 = Utf8               ()Z
   #77 = String             #78           // char_name
   #78 = Utf8               char_name
   #79 = InterfaceMethodref #72.#80       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #80 = NameAndType        #81:#82       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #81 = Utf8               getString
   #82 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #84 = Class              #86           // ext/mods/gameserver/model/World
   #85 = NameAndType        #87:#88       // getInstance:()Lext/mods/gameserver/model/World;
   #86 = Utf8               ext/mods/gameserver/model/World
   #87 = Utf8               getInstance
   #88 = Utf8               ()Lext/mods/gameserver/model/World;
   #89 = Methodref          #84.#90       // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #90 = NameAndType        #91:#92       // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #91 = Utf8               getPlayer
   #92 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #94 = Class              #96           // ext/mods/gameserver/model/actor/Player
   #95 = NameAndType        #97:#76       // isOnline:()Z
   #96 = Utf8               ext/mods/gameserver/model/actor/Player
   #97 = Utf8               isOnline
   #98 = String             #99           // 1
   #99 = Utf8               1
  #100 = String             #101          // 4
  #101 = Utf8               4
  #102 = InvokeDynamic      #0:#103       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #103 = NameAndType        #104:#82      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #104 = Utf8               makeConcatWithConstants
  #105 = Class              #106          // java/lang/Object
  #106 = Utf8               java/lang/Object
  #107 = String             #108          // <table width=300 bgcolor=000000><tr><td width=20 align=right>
  #108 = Utf8               <table width=300 bgcolor=000000><tr><td width=20 align=right>
  #109 = Methodref          #16.#110      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.getColor:(I)Ljava/lang/String;
  #110 = NameAndType        #111:#112     // getColor:(I)Ljava/lang/String;
  #111 = Utf8               getColor
  #112 = Utf8               (I)Ljava/lang/String;
  #113 = String             #114          // %02d
  #114 = Utf8               %02d
  #115 = Methodref          #116.#117     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #116 = Class              #118          // java/lang/Integer
  #117 = NameAndType        #119:#120     // valueOf:(I)Ljava/lang/Integer;
  #118 = Utf8               java/lang/Integer
  #119 = Utf8               valueOf
  #120 = Utf8               (I)Ljava/lang/Integer;
  #121 = Methodref          #10.#122      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #122 = NameAndType        #123:#124     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #123 = Utf8               format
  #124 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #125 = String             #126          // </td>
  #126 = Utf8               </td>
  #127 = Methodref          #128.#129     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #128 = Class              #130          // ext/mods/commons/lang/StringUtil
  #129 = NameAndType        #131:#132     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #130 = Utf8               ext/mods/commons/lang/StringUtil
  #131 = Utf8               append
  #132 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #133 = String             #134          // <td width=20 height=18><img src=
  #134 = Utf8               <td width=20 height=18><img src=
  #135 = String             #136          //  width=16 height=16></td><td width=160 align=left>
  #136 = Utf8                width=16 height=16></td><td width=160 align=left>
  #137 = String             #138          // <td width=100 align=right>
  #138 = Utf8               <td width=100 align=right>
  #139 = String             #140          // pvpkills
  #140 = Utf8               pvpkills
  #141 = InterfaceMethodref #72.#142      // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #142 = NameAndType        #143:#144     // getInt:(Ljava/lang/String;)I
  #143 = Utf8               getInt
  #144 = Utf8               (Ljava/lang/String;)I
  #145 = Methodref          #128.#146     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #146 = NameAndType        #147:#148     // formatNumber:(J)Ljava/lang/String;
  #147 = Utf8               formatNumber
  #148 = Utf8               (J)Ljava/lang/String;
  #149 = String             #150          // </font></td></tr></table><img src=L2UI.SquareGray width=296 height=1>
  #150 = Utf8               </font></td></tr></table><img src=L2UI.SquareGray width=296 height=1>
  #151 = InterfaceMethodref #152.#153     // java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
  #152 = Class              #154          // java/util/stream/IntStream
  #153 = NameAndType        #155:#156     // range:(II)Ljava/util/stream/IntStream;
  #154 = Utf8               java/util/stream/IntStream
  #155 = Utf8               range
  #156 = Utf8               (II)Ljava/util/stream/IntStream;
  #157 = InvokeDynamic      #1:#158       // #1:accept:(Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;)Ljava/util/function/IntConsumer;
  #158 = NameAndType        #159:#160     // accept:(Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;)Ljava/util/function/IntConsumer;
  #159 = Utf8               accept
  #160 = Utf8               (Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;)Ljava/util/function/IntConsumer;
  #161 = InterfaceMethodref #152.#162     // java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
  #162 = NameAndType        #163:#164     // forEach:(Ljava/util/function/IntConsumer;)V
  #163 = Utf8               forEach
  #164 = Utf8               (Ljava/util/function/IntConsumer;)V
  #165 = InterfaceMethodref #72.#166      // java/sql/ResultSet.close:()V
  #166 = NameAndType        #167:#6       // close:()V
  #167 = Utf8               close
  #168 = Class              #169          // java/lang/Throwable
  #169 = Utf8               java/lang/Throwable
  #170 = Methodref          #168.#171     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #171 = NameAndType        #172:#173     // addSuppressed:(Ljava/lang/Throwable;)V
  #172 = Utf8               addSuppressed
  #173 = Utf8               (Ljava/lang/Throwable;)V
  #174 = InterfaceMethodref #66.#166      // java/sql/PreparedStatement.close:()V
  #175 = String             #176          // SELECT char_name, pkkills FROM characters WHERE pkkills > 0 ORDER BY pkkills DESC LIMIT 5
  #176 = Utf8               SELECT char_name, pkkills FROM characters WHERE pkkills > 0 ORDER BY pkkills DESC LIMIT 5
  #177 = String             #178          // pkkills
  #178 = Utf8               pkkills
  #179 = InvokeDynamic      #2:#158       // #2:accept:(Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;)Ljava/util/function/IntConsumer;
  #180 = InterfaceMethodref #60.#166      // java/sql/Connection.close:()V
  #181 = Class              #182          // java/lang/Exception
  #182 = Utf8               java/lang/Exception
  #183 = Fieldref           #16.#184      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #184 = NameAndType        #185:#186     // LOGGER:Lext/mods/commons/logging/CLogger;
  #185 = Utf8               LOGGER
  #186 = Utf8               Lext/mods/commons/logging/CLogger;
  #187 = String             #188          // There was problem while updating ranking system.
  #188 = Utf8               There was problem while updating ranking system.
  #189 = Methodref          #190.#191     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #190 = Class              #192          // ext/mods/commons/logging/CLogger
  #191 = NameAndType        #193:#194     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #192 = Utf8               ext/mods/commons/logging/CLogger
  #193 = Utf8               warn
  #194 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #195 = String             #196          // SELECT clan_id, clan_name, clan_level, reputation_score, leader_id, hasCastle, crest_id FROM clan_data WHERE clan_level > 0 ORDER BY reputation_score DESC LIMIT 5
  #196 = Utf8               SELECT clan_id, clan_name, clan_level, reputation_score, leader_id, hasCastle, crest_id FROM clan_data WHERE clan_level > 0 ORDER BY reputation_score DESC LIMIT 5
  #197 = String             #198          // clan_id
  #198 = Utf8               clan_id
  #199 = String             #200          // clan_name
  #200 = Utf8               clan_name
  #201 = String             #202          // clan_level
  #202 = Utf8               clan_level
  #203 = String             #204          // reputation_score
  #204 = Utf8               reputation_score
  #205 = Methodref          #206.#207     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #206 = Class              #208          // ext/mods/gameserver/data/sql/ClanTable
  #207 = NameAndType        #87:#209      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #208 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #209 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #210 = Methodref          #206.#211     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #211 = NameAndType        #212:#213     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #212 = Utf8               getClan
  #213 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #214 = String             #215          // hasCastle
  #215 = Utf8               hasCastle
  #216 = String             #217          // crest_id
  #217 = Utf8               crest_id
  #218 = Methodref          #219.#220     // ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
  #219 = Class              #221          // ext/mods/gameserver/data/cache/CrestCache
  #220 = NameAndType        #87:#222      // getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
  #221 = Utf8               ext/mods/gameserver/data/cache/CrestCache
  #222 = Utf8               ()Lext/mods/gameserver/data/cache/CrestCache;
  #223 = Fieldref           #224.#225     // ext/mods/gameserver/enums/CrestType.PLEDGE:Lext/mods/gameserver/enums/CrestType;
  #224 = Class              #226          // ext/mods/gameserver/enums/CrestType
  #225 = NameAndType        #227:#228     // PLEDGE:Lext/mods/gameserver/enums/CrestType;
  #226 = Utf8               ext/mods/gameserver/enums/CrestType
  #227 = Utf8               PLEDGE
  #228 = Utf8               Lext/mods/gameserver/enums/CrestType;
  #229 = Methodref          #219.#230     // ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
  #230 = NameAndType        #231:#232     // getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
  #231 = Utf8               getCrest
  #232 = Utf8               (Lext/mods/gameserver/enums/CrestType;I)[B
  #233 = Class              #234          // ext/mods/gameserver/network/serverpackets/PledgeCrest
  #234 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeCrest
  #235 = Methodref          #233.#236     // ext/mods/gameserver/network/serverpackets/PledgeCrest."<init>":(I[B)V
  #236 = NameAndType        #5:#237       // "<init>":(I[B)V
  #237 = Utf8               (I[B)V
  #238 = Methodref          #94.#239      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #239 = NameAndType        #240:#241     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #240 = Utf8               sendPacket
  #241 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #242 = InvokeDynamic      #3:#243       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #243 = NameAndType        #104:#112     // makeConcatWithConstants:(I)Ljava/lang/String;
  #244 = String             #245          // <table width=630 bgcolor=000000><tr><td width=75 align=center>
  #245 = Utf8               <table width=630 bgcolor=000000><tr><td width=75 align=center>
  #246 = String             #247          // <td width=25 height=18><img src=
  #247 = Utf8               <td width=25 height=18><img src=
  #248 = String             #249          //  width=16 height=16></td><td width=185 align=center>
  #249 = Utf8                width=16 height=16></td><td width=185 align=center>
  #250 = String             #251          // <td width=120 align=center>
  #251 = Utf8               <td width=120 align=center>
  #252 = Methodref          #253.#254     // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #253 = Class              #255          // ext/mods/gameserver/model/pledge/Clan
  #254 = NameAndType        #256:#257     // getLeaderName:()Ljava/lang/String;
  #255 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #256 = Utf8               getLeaderName
  #257 = Utf8               ()Ljava/lang/String;
  #258 = String             #259          // </td><td width=100 align=center>
  #259 = Utf8               </td><td width=100 align=center>
  #260 = String             #261          // </font></td><td width=100 align=center>
  #261 = Utf8               </font></td><td width=100 align=center>
  #262 = Methodref          #16.#263      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.getNameCastle:(I)Ljava/lang/String;
  #263 = NameAndType        #264:#112     // getNameCastle:(I)Ljava/lang/String;
  #264 = Utf8               getNameCastle
  #265 = String             #266          // </td></tr></table><img src=L2UI.SquareGray width=296 height=1>
  #266 = Utf8               </td></tr></table><img src=L2UI.SquareGray width=296 height=1>
  #267 = Long               60000l
  #269 = Methodref          #270.#271     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #270 = Class              #272          // ext/mods/gameserver/data/HTMLData
  #271 = NameAndType        #87:#273      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #272 = Utf8               ext/mods/gameserver/data/HTMLData
  #273 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #274 = Methodref          #94.#275      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #275 = NameAndType        #276:#277     // getLocale:()Ljava/util/Locale;
  #276 = Utf8               getLocale
  #277 = Utf8               ()Ljava/util/Locale;
  #278 = Methodref          #16.#279      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.getFolder:()Ljava/lang/String;
  #279 = NameAndType        #280:#257     // getFolder:()Ljava/lang/String;
  #280 = Utf8               getFolder
  #281 = InvokeDynamic      #4:#103       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #282 = Methodref          #270.#283     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #283 = NameAndType        #284:#285     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #284 = Utf8               getHtm
  #285 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #286 = String             #287          // %name%
  #287 = Utf8               %name%
  #288 = Methodref          #94.#289      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #289 = NameAndType        #290:#257     // getName:()Ljava/lang/String;
  #290 = Utf8               getName
  #291 = Methodref          #10.#292      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #292 = NameAndType        #293:#294     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #293 = Utf8               replaceAll
  #294 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #295 = String             #296          // %pvp%
  #296 = Utf8               %pvp%
  #297 = Methodref          #40.#298      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #298 = NameAndType        #299:#257     // toString:()Ljava/lang/String;
  #299 = Utf8               toString
  #300 = String             #301          // %pks%
  #301 = Utf8               %pks%
  #302 = String             #303          // %clan%
  #303 = Utf8               %clan%
  #304 = String             #305          // %time%
  #305 = Utf8               %time%
  #306 = Long               1000l
  #308 = Methodref          #10.#309      // java/lang/String.valueOf:(J)Ljava/lang/String;
  #309 = NameAndType        #119:#148     // valueOf:(J)Ljava/lang/String;
  #310 = Methodref          #16.#311      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #311 = NameAndType        #312:#24      // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #312 = Utf8               separateAndSend
  #313 = String             #314          // <table width=300 bgcolor=000000><tr>
  #314 = Utf8               <table width=300 bgcolor=000000><tr>
  #315 = Methodref          #40.#316      // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #316 = NameAndType        #131:#317     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #317 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #318 = String             #319          // <td width=20 align=right><font color=B09878>--</font></td><td width=20 height=18></td>
  #319 = Utf8               <td width=20 align=right><font color=B09878>--</font></td><td width=20 height=18></td>
  #320 = String             #321          // <td width=160 align=left><font color=B09878>----------------</font></td>
  #321 = Utf8               <td width=160 align=left><font color=B09878>----------------</font></td>
  #322 = String             #323          // <td width=100 align=right><font color=FF0000>0</font></td>
  #323 = Utf8               <td width=100 align=right><font color=FF0000>0</font></td>
  #324 = String             #325          // </tr></table><img src=L2UI.SquareGray width=296 height=1>
  #325 = Utf8               </tr></table><img src=L2UI.SquareGray width=296 height=1>
  #326 = String             #327          // <font color=FFFF00>
  #327 = Utf8               <font color=FFFF00>
  #328 = String             #329          // <font color=FFA500>
  #329 = Utf8               <font color=FFA500>
  #330 = String             #331          // <font color=E9967A>
  #331 = Utf8               <font color=E9967A>
  #332 = String             #333          //
  #333 = Utf8
  #334 = Methodref          #335.#336     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #335 = Class              #337          // ext/mods/gameserver/data/manager/CastleManager
  #336 = NameAndType        #87:#338      // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #337 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #338 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #339 = Methodref          #335.#340     // ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #340 = NameAndType        #341:#342     // getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
  #341 = Utf8               getCastleById
  #342 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
  #343 = Methodref          #344.#345     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #344 = Class              #346          // ext/mods/gameserver/model/residence/castle/Castle
  #345 = NameAndType        #347:#348     // getId:()I
  #346 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #347 = Utf8               getId
  #348 = Utf8               ()I
  #349 = String             #350          // Gludio
  #350 = Utf8               Gludio
  #351 = String             #352          // Dion
  #352 = Utf8               Dion
  #353 = String             #354          // Giran
  #354 = Utf8               Giran
  #355 = String             #356          // Oren
  #356 = Utf8               Oren
  #357 = String             #358          // Aden
  #358 = Utf8               Aden
  #359 = String             #360          // Innadril
  #360 = Utf8               Innadril
  #361 = String             #362          // Goddard
  #362 = Utf8               Goddard
  #363 = String             #364          // Rune
  #364 = Utf8               Rune
  #365 = String             #366          // Schuttgart
  #366 = Utf8               Schuttgart
  #367 = String             #368          // custom/ranking/
  #368 = Utf8               custom/ranking/
  #369 = Fieldref           #370.#371     // ext/mods/gameserver/communitybbs/custom/RankingBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #370 = Class              #372          // ext/mods/gameserver/communitybbs/custom/RankingBBSManager$SingletonHolder
  #371 = NameAndType        #373:#374     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #372 = Utf8               ext/mods/gameserver/communitybbs/custom/RankingBBSManager$SingletonHolder
  #373 = Utf8               INSTANCE
  #374 = Utf8               Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #375 = Methodref          #16.#376      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.applyEmpty:(Ljava/lang/StringBuilder;)V
  #376 = NameAndType        #377:#378     // applyEmpty:(Ljava/lang/StringBuilder;)V
  #377 = Utf8               applyEmpty
  #378 = Utf8               (Ljava/lang/StringBuilder;)V
  #379 = Methodref          #40.#3        // java/lang/StringBuilder."<init>":()V
  #380 = Utf8               PAGE_LIMIT_5
  #381 = Utf8               I
  #382 = Utf8               ConstantValue
  #383 = Integer            5
  #384 = Utf8               Code
  #385 = Utf8               LineNumberTable
  #386 = Utf8               LocalVariableTable
  #387 = Utf8               this
  #388 = Utf8               command
  #389 = Utf8               Ljava/lang/String;
  #390 = Utf8               player
  #391 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #392 = Utf8               StackMapTable
  #393 = Utf8               name
  #394 = Utf8               databasePlayer
  #395 = Utf8               status
  #396 = Utf8               index
  #397 = Utf8               rs
  #398 = Utf8               Ljava/sql/ResultSet;
  #399 = Utf8               ps
  #400 = Utf8               Ljava/sql/PreparedStatement;
  #401 = Utf8               con
  #402 = Utf8               Ljava/sql/Connection;
  #403 = Utf8               e
  #404 = Utf8               Ljava/lang/Exception;
  #405 = Utf8               pc
  #406 = Utf8               Lext/mods/gameserver/network/serverpackets/PledgeCrest;
  #407 = Utf8               clanId
  #408 = Utf8               clanname
  #409 = Utf8               clanlvl
  #410 = Utf8               reputation
  #411 = Utf8               clan
  #412 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #413 = Utf8               castle
  #414 = Utf8               crestid
  #415 = Utf8               data
  #416 = Utf8               [B
  #417 = Utf8               content
  #418 = Class              #416          // "[B"
  #419 = Utf8               sb
  #420 = Utf8               castleId
  #421 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #422 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #423 = Utf8               lambda$showRakingList$1
  #424 = Utf8               x
  #425 = Utf8               lambda$showRakingList$0
  #426 = Utf8               <clinit>
  #427 = Utf8               SourceFile
  #428 = Utf8               RankingBBSManager.java
  #429 = Utf8               NestMembers
  #430 = Utf8               BootstrapMethods
  #431 = String             #432          // L2UI_CH3.msnicon\u0001
  #432 = Utf8               L2UI_CH3.msnicon\u0001
  #433 = MethodType         #44           //  (I)V
  #434 = MethodHandle       5:#435        // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/RankingBBSManager.lambda$showRakingList$0:(I)V
  #435 = Methodref          #16.#436      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.lambda$showRakingList$0:(I)V
  #436 = NameAndType        #425:#44      // lambda$showRakingList$0:(I)V
  #437 = MethodHandle       5:#438        // REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/RankingBBSManager.lambda$showRakingList$1:(I)V
  #438 = Methodref          #16.#439      // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.lambda$showRakingList$1:(I)V
  #439 = NameAndType        #423:#44      // lambda$showRakingList$1:(I)V
  #440 = String             #441          // Crest.crest_1_\u0001
  #441 = Utf8               Crest.crest_1_\u0001
  #442 = String             #443          // html/CommunityBoard/\u0001ranklist.htm
  #443 = Utf8               html/CommunityBoard/\u0001ranklist.htm
  #444 = MethodHandle       6:#445        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #445 = Methodref          #446.#447     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #446 = Class              #448          // java/lang/invoke/StringConcatFactory
  #447 = NameAndType        #104:#449     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #448 = Utf8               java/lang/invoke/StringConcatFactory
  #449 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #450 = MethodHandle       6:#451        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #451 = Methodref          #452.#453     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #452 = Class              #454          // java/lang/invoke/LambdaMetafactory
  #453 = NameAndType        #455:#456     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #454 = Utf8               java/lang/invoke/LambdaMetafactory
  #455 = Utf8               metafactory
  #456 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #457 = Utf8               InnerClasses
  #458 = Utf8               SingletonHolder
  #459 = Class              #460          // java/lang/invoke/MethodHandles$Lookup
  #460 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #461 = Class              #462          // java/lang/invoke/MethodHandles
  #462 = Utf8               java/lang/invoke/MethodHandles
  #463 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.custom.RankingBBSManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 51: 0
        line 52: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbsclan
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifeq          17
         9: aload_0
        10: aload_2
        11: invokevirtual #15                 // Method showRakingList:(Lext/mods/gameserver/model/actor/Player;)V
        14: goto          23
        17: aload_0
        18: aload_1
        19: aload_2
        20: invokespecial #21                 // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        23: return
      LineNumberTable:
        line 57: 0
        line 58: 9
        line 60: 17
        line 61: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
            0      24     1 command   Ljava/lang/String;
            0      24     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 5 /* same */

  public void showRakingList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=15, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _nextUpdate:J
         4: invokestatic  #29                 // Method java/lang/System.currentTimeMillis:()J
         7: lcmp
         8: ifge          1176
        11: getstatic     #35                 // Field PVP:Ljava/lang/StringBuilder;
        14: iconst_0
        15: invokevirtual #39                 // Method java/lang/StringBuilder.setLength:(I)V
        18: getstatic     #45                 // Field PKS:Ljava/lang/StringBuilder;
        21: iconst_0
        22: invokevirtual #39                 // Method java/lang/StringBuilder.setLength:(I)V
        25: getstatic     #48                 // Field CLAN:Ljava/lang/StringBuilder;
        28: iconst_0
        29: invokevirtual #39                 // Method java/lang/StringBuilder.setLength:(I)V
        32: invokestatic  #51                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        35: astore_2
        36: aload_2
        37: ldc           #57                 // String SELECT char_name, pvpkills FROM characters WHERE pvpkills > 0 ORDER BY pvpkills DESC LIMIT 5
        39: invokeinterface #59,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        44: astore_3
        45: aload_3
        46: invokeinterface #65,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        51: astore        4
        53: iconst_1
        54: istore        5
        56: aload         4
        58: invokeinterface #71,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        63: ifeq          240
        66: aload         4
        68: ldc           #77                 // String char_name
        70: invokeinterface #79,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        75: astore        6
        77: invokestatic  #83                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        80: aload         6
        82: invokevirtual #89                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
        85: astore        7
        87: aload         7
        89: ifnull        105
        92: aload         7
        94: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        97: ifeq          105
       100: ldc           #98                 // String 1
       102: goto          107
       105: ldc           #100                // String 4
       107: invokedynamic #102,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       112: astore        8
       114: getstatic     #35                 // Field PVP:Ljava/lang/StringBuilder;
       117: iconst_4
       118: anewarray     #105                // class java/lang/Object
       121: dup
       122: iconst_0
       123: ldc           #107                // String <table width=300 bgcolor=000000><tr><td width=20 align=right>
       125: aastore
       126: dup
       127: iconst_1
       128: aload_0
       129: iload         5
       131: invokevirtual #109                // Method getColor:(I)Ljava/lang/String;
       134: aastore
       135: dup
       136: iconst_2
       137: ldc           #113                // String %02d
       139: iconst_1
       140: anewarray     #105                // class java/lang/Object
       143: dup
       144: iconst_0
       145: iload         5
       147: invokestatic  #115                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       150: aastore
       151: invokestatic  #121                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       154: aastore
       155: dup
       156: iconst_3
       157: ldc           #125                // String </td>
       159: aastore
       160: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       163: getstatic     #35                 // Field PVP:Ljava/lang/StringBuilder;
       166: iconst_5
       167: anewarray     #105                // class java/lang/Object
       170: dup
       171: iconst_0
       172: ldc           #133                // String <td width=20 height=18><img src=
       174: aastore
       175: dup
       176: iconst_1
       177: aload         8
       179: aastore
       180: dup
       181: iconst_2
       182: ldc           #135                // String  width=16 height=16></td><td width=160 align=left>
       184: aastore
       185: dup
       186: iconst_3
       187: aload         6
       189: aastore
       190: dup
       191: iconst_4
       192: ldc           #125                // String </td>
       194: aastore
       195: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       198: getstatic     #35                 // Field PVP:Ljava/lang/StringBuilder;
       201: iconst_3
       202: anewarray     #105                // class java/lang/Object
       205: dup
       206: iconst_0
       207: ldc           #137                // String <td width=100 align=right>
       209: aastore
       210: dup
       211: iconst_1
       212: aload         4
       214: ldc           #139                // String pvpkills
       216: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       221: i2l
       222: invokestatic  #145                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       225: aastore
       226: dup
       227: iconst_2
       228: ldc           #149                // String </font></td></tr></table><img src=L2UI.SquareGray width=296 height=1>
       230: aastore
       231: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       234: iinc          5, 1
       237: goto          56
       240: iload         5
       242: iconst_1
       243: isub
       244: iconst_5
       245: invokestatic  #151                // InterfaceMethod java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
       248: aload_0
       249: invokedynamic #157,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;)Ljava/util/function/IntConsumer;
       254: invokeinterface #161,  2          // InterfaceMethod java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
       259: aload         4
       261: ifnull        303
       264: aload         4
       266: invokeinterface #165,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       271: goto          303
       274: astore        5
       276: aload         4
       278: ifnull        300
       281: aload         4
       283: invokeinterface #165,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       288: goto          300
       291: astore        6
       293: aload         5
       295: aload         6
       297: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       300: aload         5
       302: athrow
       303: aload_3
       304: ifnull        343
       307: aload_3
       308: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       313: goto          343
       316: astore        4
       318: aload_3
       319: ifnull        340
       322: aload_3
       323: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       328: goto          340
       331: astore        5
       333: aload         4
       335: aload         5
       337: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       340: aload         4
       342: athrow
       343: aload_2
       344: ldc           #175                // String SELECT char_name, pkkills FROM characters WHERE pkkills > 0 ORDER BY pkkills DESC LIMIT 5
       346: invokeinterface #59,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       351: astore_3
       352: aload_3
       353: invokeinterface #65,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       358: astore        4
       360: iconst_1
       361: istore        5
       363: aload         4
       365: invokeinterface #71,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       370: ifeq          547
       373: aload         4
       375: ldc           #77                 // String char_name
       377: invokeinterface #79,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       382: astore        6
       384: invokestatic  #83                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       387: aload         6
       389: invokevirtual #89                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
       392: astore        7
       394: aload         7
       396: ifnull        412
       399: aload         7
       401: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       404: ifeq          412
       407: ldc           #98                 // String 1
       409: goto          414
       412: ldc           #100                // String 4
       414: invokedynamic #102,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       419: astore        8
       421: getstatic     #45                 // Field PKS:Ljava/lang/StringBuilder;
       424: iconst_4
       425: anewarray     #105                // class java/lang/Object
       428: dup
       429: iconst_0
       430: ldc           #107                // String <table width=300 bgcolor=000000><tr><td width=20 align=right>
       432: aastore
       433: dup
       434: iconst_1
       435: aload_0
       436: iload         5
       438: invokevirtual #109                // Method getColor:(I)Ljava/lang/String;
       441: aastore
       442: dup
       443: iconst_2
       444: ldc           #113                // String %02d
       446: iconst_1
       447: anewarray     #105                // class java/lang/Object
       450: dup
       451: iconst_0
       452: iload         5
       454: invokestatic  #115                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       457: aastore
       458: invokestatic  #121                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       461: aastore
       462: dup
       463: iconst_3
       464: ldc           #125                // String </td>
       466: aastore
       467: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       470: getstatic     #45                 // Field PKS:Ljava/lang/StringBuilder;
       473: iconst_5
       474: anewarray     #105                // class java/lang/Object
       477: dup
       478: iconst_0
       479: ldc           #133                // String <td width=20 height=18><img src=
       481: aastore
       482: dup
       483: iconst_1
       484: aload         8
       486: aastore
       487: dup
       488: iconst_2
       489: ldc           #135                // String  width=16 height=16></td><td width=160 align=left>
       491: aastore
       492: dup
       493: iconst_3
       494: aload         6
       496: aastore
       497: dup
       498: iconst_4
       499: ldc           #125                // String </td>
       501: aastore
       502: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       505: getstatic     #45                 // Field PKS:Ljava/lang/StringBuilder;
       508: iconst_3
       509: anewarray     #105                // class java/lang/Object
       512: dup
       513: iconst_0
       514: ldc           #137                // String <td width=100 align=right>
       516: aastore
       517: dup
       518: iconst_1
       519: aload         4
       521: ldc           #177                // String pkkills
       523: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       528: i2l
       529: invokestatic  #145                // Method ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
       532: aastore
       533: dup
       534: iconst_2
       535: ldc           #149                // String </font></td></tr></table><img src=L2UI.SquareGray width=296 height=1>
       537: aastore
       538: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       541: iinc          5, 1
       544: goto          363
       547: iload         5
       549: iconst_1
       550: isub
       551: iconst_5
       552: invokestatic  #151                // InterfaceMethod java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
       555: aload_0
       556: invokedynamic #179,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;)Ljava/util/function/IntConsumer;
       561: invokeinterface #161,  2          // InterfaceMethod java/util/stream/IntStream.forEach:(Ljava/util/function/IntConsumer;)V
       566: aload         4
       568: ifnull        610
       571: aload         4
       573: invokeinterface #165,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       578: goto          610
       581: astore        5
       583: aload         4
       585: ifnull        607
       588: aload         4
       590: invokeinterface #165,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       595: goto          607
       598: astore        6
       600: aload         5
       602: aload         6
       604: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       607: aload         5
       609: athrow
       610: aload_3
       611: ifnull        650
       614: aload_3
       615: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       620: goto          650
       623: astore        4
       625: aload_3
       626: ifnull        647
       629: aload_3
       630: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       635: goto          647
       638: astore        5
       640: aload         4
       642: aload         5
       644: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       647: aload         4
       649: athrow
       650: aload_2
       651: ifnull        687
       654: aload_2
       655: invokeinterface #180,  1          // InterfaceMethod java/sql/Connection.close:()V
       660: goto          687
       663: astore_3
       664: aload_2
       665: ifnull        685
       668: aload_2
       669: invokeinterface #180,  1          // InterfaceMethod java/sql/Connection.close:()V
       674: goto          685
       677: astore        4
       679: aload_3
       680: aload         4
       682: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       685: aload_3
       686: athrow
       687: goto          700
       690: astore_2
       691: getstatic     #183                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       694: ldc           #187                // String There was problem while updating ranking system.
       696: aload_2
       697: invokevirtual #189                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       700: invokestatic  #51                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       703: astore_2
       704: aload_2
       705: ldc           #195                // String SELECT clan_id, clan_name, clan_level, reputation_score, leader_id, hasCastle, crest_id FROM clan_data WHERE clan_level > 0 ORDER BY reputation_score DESC LIMIT 5
       707: invokeinterface #59,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       712: astore_3
       713: aload_3
       714: invokeinterface #65,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       719: astore        4
       721: iconst_1
       722: istore        5
       724: aload         4
       726: invokeinterface #71,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       731: ifeq          1022
       734: aload         4
       736: ldc           #197                // String clan_id
       738: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       743: istore        6
       745: aload         4
       747: ldc           #199                // String clan_name
       749: invokeinterface #79,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       754: astore        7
       756: aload         4
       758: ldc           #201                // String clan_level
       760: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       765: istore        8
       767: aload         4
       769: ldc           #203                // String reputation_score
       771: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       776: istore        9
       778: invokestatic  #205                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       781: iload         6
       783: invokevirtual #210                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       786: astore        10
       788: aload         4
       790: ldc           #214                // String hasCastle
       792: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       797: istore        11
       799: aload         4
       801: ldc           #216                // String crest_id
       803: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       808: istore        12
       810: invokestatic  #218                // Method ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
       813: getstatic     #223                // Field ext/mods/gameserver/enums/CrestType.PLEDGE:Lext/mods/gameserver/enums/CrestType;
       816: iload         12
       818: invokevirtual #229                // Method ext/mods/gameserver/data/cache/CrestCache.getCrest:(Lext/mods/gameserver/enums/CrestType;I)[B
       821: astore        13
       823: aload         13
       825: ifnull        847
       828: new           #233                // class ext/mods/gameserver/network/serverpackets/PledgeCrest
       831: dup
       832: iload         12
       834: aload         13
       836: invokespecial #235                // Method ext/mods/gameserver/network/serverpackets/PledgeCrest."<init>":(I[B)V
       839: astore        14
       841: aload_1
       842: aload         14
       844: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       847: iload         12
       849: invokedynamic #242,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       854: astore        14
       856: getstatic     #48                 // Field CLAN:Ljava/lang/StringBuilder;
       859: iconst_4
       860: anewarray     #105                // class java/lang/Object
       863: dup
       864: iconst_0
       865: ldc           #244                // String <table width=630 bgcolor=000000><tr><td width=75 align=center>
       867: aastore
       868: dup
       869: iconst_1
       870: aload_0
       871: iload         5
       873: invokevirtual #109                // Method getColor:(I)Ljava/lang/String;
       876: aastore
       877: dup
       878: iconst_2
       879: ldc           #113                // String %02d
       881: iconst_1
       882: anewarray     #105                // class java/lang/Object
       885: dup
       886: iconst_0
       887: iload         5
       889: invokestatic  #115                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       892: aastore
       893: invokestatic  #121                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
       896: aastore
       897: dup
       898: iconst_3
       899: ldc           #125                // String </td>
       901: aastore
       902: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       905: getstatic     #48                 // Field CLAN:Ljava/lang/StringBuilder;
       908: iconst_5
       909: anewarray     #105                // class java/lang/Object
       912: dup
       913: iconst_0
       914: ldc           #246                // String <td width=25 height=18><img src=
       916: aastore
       917: dup
       918: iconst_1
       919: aload         14
       921: aastore
       922: dup
       923: iconst_2
       924: ldc           #248                // String  width=16 height=16></td><td width=185 align=center>
       926: aastore
       927: dup
       928: iconst_3
       929: aload         7
       931: aastore
       932: dup
       933: iconst_4
       934: ldc           #125                // String </td>
       936: aastore
       937: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       940: getstatic     #48                 // Field CLAN:Ljava/lang/StringBuilder;
       943: bipush        9
       945: anewarray     #105                // class java/lang/Object
       948: dup
       949: iconst_0
       950: ldc           #250                // String <td width=120 align=center>
       952: aastore
       953: dup
       954: iconst_1
       955: aload         10
       957: invokevirtual #252                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
       960: aastore
       961: dup
       962: iconst_2
       963: ldc_w         #258                // String </td><td width=100 align=center>
       966: aastore
       967: dup
       968: iconst_3
       969: iload         8
       971: invokestatic  #115                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       974: aastore
       975: dup
       976: iconst_4
       977: ldc_w         #260                // String </font></td><td width=100 align=center>
       980: aastore
       981: dup
       982: iconst_5
       983: iload         9
       985: invokestatic  #115                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       988: aastore
       989: dup
       990: bipush        6
       992: ldc_w         #258                // String </td><td width=100 align=center>
       995: aastore
       996: dup
       997: bipush        7
       999: aload_0
      1000: iload         11
      1002: invokevirtual #262                // Method getNameCastle:(I)Ljava/lang/String;
      1005: aastore
      1006: dup
      1007: bipush        8
      1009: ldc_w         #265                // String </td></tr></table><img src=L2UI.SquareGray width=296 height=1>
      1012: aastore
      1013: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
      1016: iinc          5, 1
      1019: goto          724
      1022: iload         5
      1024: iconst_1
      1025: isub
      1026: iconst_5
      1027: invokestatic  #151                // InterfaceMethod java/util/stream/IntStream.range:(II)Ljava/util/stream/IntStream;
      1030: pop
      1031: aload         4
      1033: ifnull        1075
      1036: aload         4
      1038: invokeinterface #165,  1          // InterfaceMethod java/sql/ResultSet.close:()V
      1043: goto          1075
      1046: astore        5
      1048: aload         4
      1050: ifnull        1072
      1053: aload         4
      1055: invokeinterface #165,  1          // InterfaceMethod java/sql/ResultSet.close:()V
      1060: goto          1072
      1063: astore        6
      1065: aload         5
      1067: aload         6
      1069: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1072: aload         5
      1074: athrow
      1075: aload_3
      1076: ifnull        1115
      1079: aload_3
      1080: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1085: goto          1115
      1088: astore        4
      1090: aload_3
      1091: ifnull        1112
      1094: aload_3
      1095: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1100: goto          1112
      1103: astore        5
      1105: aload         4
      1107: aload         5
      1109: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1112: aload         4
      1114: athrow
      1115: aload_2
      1116: ifnull        1152
      1119: aload_2
      1120: invokeinterface #180,  1          // InterfaceMethod java/sql/Connection.close:()V
      1125: goto          1152
      1128: astore_3
      1129: aload_2
      1130: ifnull        1150
      1133: aload_2
      1134: invokeinterface #180,  1          // InterfaceMethod java/sql/Connection.close:()V
      1139: goto          1150
      1142: astore        4
      1144: aload_3
      1145: aload         4
      1147: invokevirtual #170                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1150: aload_3
      1151: athrow
      1152: goto          1165
      1155: astore_2
      1156: getstatic     #183                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1159: ldc           #187                // String There was problem while updating ranking system.
      1161: aload_2
      1162: invokevirtual #189                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
      1165: aload_0
      1166: invokestatic  #29                 // Method java/lang/System.currentTimeMillis:()J
      1169: ldc2_w        #267                // long 60000l
      1172: ladd
      1173: putfield      #25                 // Field _nextUpdate:J
      1176: invokestatic  #269                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
      1179: aload_1
      1180: invokevirtual #274                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1183: aload_0
      1184: invokevirtual #278                // Method getFolder:()Ljava/lang/String;
      1187: invokedynamic #281,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1192: invokevirtual #282                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
      1195: astore_2
      1196: aload_2
      1197: ldc_w         #286                // String %name%
      1200: aload_1
      1201: invokevirtual #288                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1204: invokevirtual #291                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1207: astore_2
      1208: aload_2
      1209: ldc_w         #295                // String %pvp%
      1212: getstatic     #35                 // Field PVP:Ljava/lang/StringBuilder;
      1215: invokevirtual #297                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1218: invokevirtual #291                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1221: astore_2
      1222: aload_2
      1223: ldc_w         #300                // String %pks%
      1226: getstatic     #45                 // Field PKS:Ljava/lang/StringBuilder;
      1229: invokevirtual #297                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1232: invokevirtual #291                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1235: astore_2
      1236: aload_2
      1237: ldc_w         #302                // String %clan%
      1240: getstatic     #48                 // Field CLAN:Ljava/lang/StringBuilder;
      1243: invokevirtual #297                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      1246: invokevirtual #291                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1249: astore_2
      1250: aload_2
      1251: ldc_w         #304                // String %time%
      1254: aload_0
      1255: getfield      #25                 // Field _nextUpdate:J
      1258: invokestatic  #29                 // Method java/lang/System.currentTimeMillis:()J
      1261: lsub
      1262: ldc2_w        #306                // long 1000l
      1265: ldiv
      1266: invokestatic  #308                // Method java/lang/String.valueOf:(J)Ljava/lang/String;
      1269: invokevirtual #291                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      1272: astore_2
      1273: aload_2
      1274: aload_1
      1275: invokestatic  #310                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
      1278: return
      Exception table:
         from    to  target type
            53   259   274   Class java/lang/Throwable
           281   288   291   Class java/lang/Throwable
            45   303   316   Class java/lang/Throwable
           322   328   331   Class java/lang/Throwable
           360   566   581   Class java/lang/Throwable
           588   595   598   Class java/lang/Throwable
           352   610   623   Class java/lang/Throwable
           629   635   638   Class java/lang/Throwable
            36   650   663   Class java/lang/Throwable
           668   674   677   Class java/lang/Throwable
            32   687   690   Class java/lang/Exception
           721  1031  1046   Class java/lang/Throwable
          1053  1060  1063   Class java/lang/Throwable
           713  1075  1088   Class java/lang/Throwable
          1094  1100  1103   Class java/lang/Throwable
           704  1115  1128   Class java/lang/Throwable
          1133  1139  1142   Class java/lang/Throwable
           700  1152  1155   Class java/lang/Exception
      LineNumberTable:
        line 65: 0
        line 67: 11
        line 68: 18
        line 69: 25
        line 71: 32
        line 73: 36
        line 74: 45
        line 76: 53
        line 77: 56
        line 79: 66
        line 80: 77
        line 81: 87
        line 83: 114
        line 84: 163
        line 85: 198
        line 86: 234
        line 87: 237
        line 88: 240
        line 89: 259
        line 73: 274
        line 89: 303
        line 73: 316
        line 91: 343
        line 92: 352
        line 94: 360
        line 95: 363
        line 97: 373
        line 98: 384
        line 99: 394
        line 101: 421
        line 102: 470
        line 103: 505
        line 104: 541
        line 105: 544
        line 106: 547
        line 107: 566
        line 91: 581
        line 107: 610
        line 91: 623
        line 108: 650
        line 71: 663
        line 112: 687
        line 109: 690
        line 111: 691
        line 114: 700
        line 116: 704
        line 117: 713
        line 119: 721
        line 120: 724
        line 122: 734
        line 123: 745
        line 124: 756
        line 125: 767
        line 126: 778
        line 127: 788
        line 128: 799
        line 130: 810
        line 132: 823
        line 134: 828
        line 135: 841
        line 138: 847
        line 140: 856
        line 141: 905
        line 142: 940
        line 143: 1016
        line 144: 1019
        line 145: 1022
        line 146: 1031
        line 116: 1046
        line 146: 1075
        line 116: 1088
        line 147: 1115
        line 114: 1128
        line 151: 1152
        line 148: 1155
        line 150: 1156
        line 153: 1165
        line 156: 1176
        line 157: 1196
        line 158: 1208
        line 159: 1222
        line 160: 1236
        line 162: 1250
        line 163: 1273
        line 164: 1278
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           77     160     6  name   Ljava/lang/String;
           87     150     7 databasePlayer   Lext/mods/gameserver/model/actor/Player;
          114     123     8 status   Ljava/lang/String;
           56     203     5 index   I
           53     250     4    rs   Ljava/sql/ResultSet;
           45     298     3    ps   Ljava/sql/PreparedStatement;
          384     160     6  name   Ljava/lang/String;
          394     150     7 databasePlayer   Lext/mods/gameserver/model/actor/Player;
          421     123     8 status   Ljava/lang/String;
          363     203     5 index   I
          360     250     4    rs   Ljava/sql/ResultSet;
          352     298     3    ps   Ljava/sql/PreparedStatement;
           36     651     2   con   Ljava/sql/Connection;
          691       9     2     e   Ljava/lang/Exception;
          841       6    14    pc   Lext/mods/gameserver/network/serverpackets/PledgeCrest;
          745     274     6 clanId   I
          756     263     7 clanname   Ljava/lang/String;
          767     252     8 clanlvl   I
          778     241     9 reputation   I
          788     231    10  clan   Lext/mods/gameserver/model/pledge/Clan;
          799     220    11 castle   I
          810     209    12 crestid   I
          823     196    13  data   [B
          856     163    14 status   Ljava/lang/String;
          724     307     5 index   I
          721     354     4    rs   Ljava/sql/ResultSet;
          713     402     3    ps   Ljava/sql/PreparedStatement;
          704     448     2   con   Ljava/sql/Connection;
         1156       9     2     e   Ljava/lang/Exception;
            0    1279     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
            0    1279     1 player   Lext/mods/gameserver/model/actor/Player;
         1196      83     2 content   Ljava/lang/String;
      StackMapTable: number_of_entries = 48
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 132
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 249 /* chop */
          offset_delta = 132
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, int, class java/lang/String, int, int, class ext/mods/gameserver/model/pledge/Clan, int, int, class "[B" ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 174
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/communitybbs/custom/RankingBBSManager, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 10 /* same */

  protected void applyEmpty(java.lang.StringBuilder);
    descriptor: (Ljava/lang/StringBuilder;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ldc_w         #313                // String <table width=300 bgcolor=000000><tr>
         4: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         7: pop
         8: aload_1
         9: ldc_w         #318                // String <td width=20 align=right><font color=B09878>--</font></td><td width=20 height=18></td>
        12: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        15: pop
        16: aload_1
        17: ldc_w         #320                // String <td width=160 align=left><font color=B09878>----------------</font></td>
        20: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        23: pop
        24: aload_1
        25: ldc_w         #322                // String <td width=100 align=right><font color=FF0000>0</font></td>
        28: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        31: pop
        32: aload_1
        33: ldc_w         #324                // String </tr></table><img src=L2UI.SquareGray width=296 height=1>
        36: invokevirtual #315                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        39: pop
        40: return
      LineNumberTable:
        line 168: 0
        line 169: 8
        line 170: 16
        line 171: 24
        line 172: 32
        line 173: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
            0      41     1    sb   Ljava/lang/StringBuilder;

  protected java.lang.String getColor(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: iload_1
         1: tableswitch   { // 1 to 3

                       1: 28

                       2: 32

                       3: 36
                 default: 40
            }
        28: ldc_w         #326                // String <font color=FFFF00>
        31: areturn
        32: ldc_w         #328                // String <font color=FFA500>
        35: areturn
        36: ldc_w         #330                // String <font color=E9967A>
        39: areturn
        40: ldc_w         #332                // String
        43: areturn
      LineNumberTable:
        line 177: 0
        line 180: 28
        line 182: 32
        line 184: 36
        line 186: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
            0      44     1 index   I
      StackMapTable: number_of_entries = 4
        frame_type = 28 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */

  protected java.lang.String getNameCastle(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #334                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
         3: iload_1
         4: invokevirtual #339                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
         7: astore_2
         8: invokestatic  #334                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        11: iload_1
        12: invokevirtual #339                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleById:(I)Lext/mods/gameserver/model/residence/castle/Castle;
        15: ifnonnull     22
        18: ldc_w         #332                // String
        21: areturn
        22: aload_2
        23: invokevirtual #343                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        26: tableswitch   { // 1 to 9

                       1: 76

                       2: 80

                       3: 84

                       4: 88

                       5: 92

                       6: 96

                       7: 100

                       8: 104

                       9: 108
                 default: 112
            }
        76: ldc_w         #349                // String Gludio
        79: areturn
        80: ldc_w         #351                // String Dion
        83: areturn
        84: ldc_w         #353                // String Giran
        87: areturn
        88: ldc_w         #355                // String Oren
        91: areturn
        92: ldc_w         #357                // String Aden
        95: areturn
        96: ldc_w         #359                // String Innadril
        99: areturn
       100: ldc_w         #361                // String Goddard
       103: areturn
       104: ldc_w         #363                // String Rune
       107: areturn
       108: ldc_w         #365                // String Schuttgart
       111: areturn
       112: aconst_null
       113: areturn
      LineNumberTable:
        line 191: 0
        line 193: 8
        line 194: 18
        line 197: 22
        line 200: 76
        line 202: 80
        line 204: 84
        line 206: 88
        line 208: 92
        line 210: 96
        line 212: 100
        line 214: 104
        line 216: 108
        line 220: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
            0     114     1 castleId   I
            8     106     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 53 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #367                // String custom/ranking/
         3: areturn
      LineNumberTable:
        line 226: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;

  public static ext.mods.gameserver.communitybbs.custom.RankingBBSManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #369                // Field ext/mods/gameserver/communitybbs/custom/RankingBBSManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
         3: areturn
      LineNumberTable:
        line 231: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #40                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #379                // Method java/lang/StringBuilder."<init>":()V
         7: putstatic     #48                 // Field CLAN:Ljava/lang/StringBuilder;
        10: new           #40                 // class java/lang/StringBuilder
        13: dup
        14: invokespecial #379                // Method java/lang/StringBuilder."<init>":()V
        17: putstatic     #35                 // Field PVP:Ljava/lang/StringBuilder;
        20: new           #40                 // class java/lang/StringBuilder
        23: dup
        24: invokespecial #379                // Method java/lang/StringBuilder."<init>":()V
        27: putstatic     #45                 // Field PKS:Ljava/lang/StringBuilder;
        30: return
      LineNumberTable:
        line 42: 0
        line 43: 10
        line 44: 20
}
SourceFile: "RankingBBSManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/RankingBBSManager$SingletonHolder
BootstrapMethods:
  0: #444 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #431 L2UI_CH3.msnicon\u0001
  1: #450 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #433 (I)V
      #434 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/RankingBBSManager.lambda$showRakingList$0:(I)V
      #433 (I)V
  2: #450 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #433 (I)V
      #437 REF_invokeVirtual ext/mods/gameserver/communitybbs/custom/RankingBBSManager.lambda$showRakingList$1:(I)V
      #433 (I)V
  3: #444 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #440 Crest.crest_1_\u0001
  4: #444 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #442 html/CommunityBoard/\u0001ranklist.htm
InnerClasses:
  public static final #463= #459 of #461; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
