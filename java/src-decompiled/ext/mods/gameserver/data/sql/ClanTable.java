// Bytecode for: ext.mods.gameserver.data.sql.ClanTable
// File: ext\mods\gameserver\data\sql\ClanTable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/sql/ClanTable.class
  Last modified 9 de jul de 2026; size 21784 bytes
  MD5 checksum 0c13a6569f24c8108dd84ba326db9bb2
  Compiled from "ClanTable.java"
public class ext.mods.gameserver.data.sql.ClanTable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/sql/ClanTable
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 17, methods: 25, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/sql/ClanTable._clans:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/sql/ClanTable
   #12 = NameAndType        #14:#15       // _clans:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #14 = Utf8               _clans
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM clan_data
   #23 = Utf8               SELECT * FROM clan_data
   #24 = InterfaceMethodref #25.#26       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #25 = Class              #27           // java/sql/Connection
   #26 = NameAndType        #28:#29       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #27 = Utf8               java/sql/Connection
   #28 = Utf8               prepareStatement
   #29 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = InterfaceMethodref #31.#32       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #31 = Class              #33           // java/sql/PreparedStatement
   #32 = NameAndType        #34:#35       // executeQuery:()Ljava/sql/ResultSet;
   #33 = Utf8               java/sql/PreparedStatement
   #34 = Utf8               executeQuery
   #35 = Utf8               ()Ljava/sql/ResultSet;
   #36 = InterfaceMethodref #37.#38       // java/sql/ResultSet.next:()Z
   #37 = Class              #39           // java/sql/ResultSet
   #38 = NameAndType        #40:#41       // next:()Z
   #39 = Utf8               java/sql/ResultSet
   #40 = Utf8               next
   #41 = Utf8               ()Z
   #42 = String             #43           // clan_id
   #43 = Utf8               clan_id
   #44 = InterfaceMethodref #37.#45       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #45 = NameAndType        #46:#47       // getInt:(Ljava/lang/String;)I
   #46 = Utf8               getInt
   #47 = Utf8               (Ljava/lang/String;)I
   #48 = Class              #49           // ext/mods/gameserver/model/pledge/Clan
   #49 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #50 = String             #51           // leader_id
   #51 = Utf8               leader_id
   #52 = Methodref          #48.#53       // ext/mods/gameserver/model/pledge/Clan."<init>":(II)V
   #53 = NameAndType        #5:#54        // "<init>":(II)V
   #54 = Utf8               (II)V
   #55 = Methodref          #56.#57       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #56 = Class              #58           // java/lang/Integer
   #57 = NameAndType        #59:#60       // valueOf:(I)Ljava/lang/Integer;
   #58 = Utf8               java/lang/Integer
   #59 = Utf8               valueOf
   #60 = Utf8               (I)Ljava/lang/Integer;
   #61 = InterfaceMethodref #62.#63       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #62 = Class              #64           // java/util/Map
   #63 = NameAndType        #65:#66       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Utf8               java/util/Map
   #65 = Utf8               put
   #66 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #67 = String             #68           // clan_name
   #68 = Utf8               clan_name
   #69 = InterfaceMethodref #37.#70       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #70 = NameAndType        #71:#72       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #71 = Utf8               getString
   #72 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #73 = Methodref          #48.#74       // ext/mods/gameserver/model/pledge/Clan.setName:(Ljava/lang/String;)V
   #74 = NameAndType        #75:#76       // setName:(Ljava/lang/String;)V
   #75 = Utf8               setName
   #76 = Utf8               (Ljava/lang/String;)V
   #77 = String             #78           // clan_level
   #78 = Utf8               clan_level
   #79 = Methodref          #48.#80       // ext/mods/gameserver/model/pledge/Clan.setLevel:(I)V
   #80 = NameAndType        #81:#82       // setLevel:(I)V
   #81 = Utf8               setLevel
   #82 = Utf8               (I)V
   #83 = String             #84           // hasCastle
   #84 = Utf8               hasCastle
   #85 = Methodref          #48.#86       // ext/mods/gameserver/model/pledge/Clan.setCastle:(I)V
   #86 = NameAndType        #87:#82       // setCastle:(I)V
   #87 = Utf8               setCastle
   #88 = String             #89           // ally_id
   #89 = Utf8               ally_id
   #90 = Methodref          #48.#91       // ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
   #91 = NameAndType        #92:#82       // setAllyId:(I)V
   #92 = Utf8               setAllyId
   #93 = String             #94           // ally_name
   #94 = Utf8               ally_name
   #95 = Methodref          #48.#96       // ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
   #96 = NameAndType        #97:#76       // setAllyName:(Ljava/lang/String;)V
   #97 = Utf8               setAllyName
   #98 = String             #99           // ally_penalty_expiry_time
   #99 = Utf8               ally_penalty_expiry_time
  #100 = InterfaceMethodref #37.#101      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #101 = NameAndType        #102:#103     // getLong:(Ljava/lang/String;)J
  #102 = Utf8               getLong
  #103 = Utf8               (Ljava/lang/String;)J
  #104 = Methodref          #105.#106     // java/lang/System.currentTimeMillis:()J
  #105 = Class              #107          // java/lang/System
  #106 = NameAndType        #108:#109     // currentTimeMillis:()J
  #107 = Utf8               java/lang/System
  #108 = Utf8               currentTimeMillis
  #109 = Utf8               ()J
  #110 = String             #111          // ally_penalty_type
  #111 = Utf8               ally_penalty_type
  #112 = Methodref          #48.#113      // ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
  #113 = NameAndType        #114:#115     // setAllyPenaltyExpiryTime:(JI)V
  #114 = Utf8               setAllyPenaltyExpiryTime
  #115 = Utf8               (JI)V
  #116 = String             #117          // char_penalty_expiry_time
  #117 = Utf8               char_penalty_expiry_time
  #118 = Fieldref           #119.#120     // ext/mods/Config.CLAN_JOIN_DAYS:I
  #119 = Class              #121          // ext/mods/Config
  #120 = NameAndType        #122:#123     // CLAN_JOIN_DAYS:I
  #121 = Utf8               ext/mods/Config
  #122 = Utf8               CLAN_JOIN_DAYS
  #123 = Utf8               I
  #124 = Long               86400000l
  #126 = Methodref          #48.#127      // ext/mods/gameserver/model/pledge/Clan.setCharPenaltyExpiryTime:(J)V
  #127 = NameAndType        #128:#129     // setCharPenaltyExpiryTime:(J)V
  #128 = Utf8               setCharPenaltyExpiryTime
  #129 = Utf8               (J)V
  #130 = String             #131          // dissolving_expiry_time
  #131 = Utf8               dissolving_expiry_time
  #132 = Methodref          #48.#133      // ext/mods/gameserver/model/pledge/Clan.setDissolvingExpiryTime:(J)V
  #133 = NameAndType        #134:#129     // setDissolvingExpiryTime:(J)V
  #134 = Utf8               setDissolvingExpiryTime
  #135 = String             #136          // crest_id
  #136 = Utf8               crest_id
  #137 = Methodref          #48.#138      // ext/mods/gameserver/model/pledge/Clan.setCrestId:(I)V
  #138 = NameAndType        #139:#82      // setCrestId:(I)V
  #139 = Utf8               setCrestId
  #140 = String             #141          // crest_large_id
  #141 = Utf8               crest_large_id
  #142 = Methodref          #48.#143      // ext/mods/gameserver/model/pledge/Clan.setCrestLargeId:(I)V
  #143 = NameAndType        #144:#82      // setCrestLargeId:(I)V
  #144 = Utf8               setCrestLargeId
  #145 = String             #146          // ally_crest_id
  #146 = Utf8               ally_crest_id
  #147 = Methodref          #48.#148      // ext/mods/gameserver/model/pledge/Clan.setAllyCrestId:(I)V
  #148 = NameAndType        #149:#82      // setAllyCrestId:(I)V
  #149 = Utf8               setAllyCrestId
  #150 = String             #151          // reputation_score
  #151 = Utf8               reputation_score
  #152 = Methodref          #48.#153      // ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
  #153 = NameAndType        #154:#155     // addReputationScore:(I)Z
  #154 = Utf8               addReputationScore
  #155 = Utf8               (I)Z
  #156 = String             #157          // auction_bid_at
  #157 = Utf8               auction_bid_at
  #158 = Methodref          #48.#159      // ext/mods/gameserver/model/pledge/Clan.setAuctionBiddedAt:(I)V
  #159 = NameAndType        #160:#82      // setAuctionBiddedAt:(I)V
  #160 = Utf8               setAuctionBiddedAt
  #161 = String             #162          // new_leader_id
  #162 = Utf8               new_leader_id
  #163 = Methodref          #48.#164      // ext/mods/gameserver/model/pledge/Clan.setNewLeaderId:(IZ)V
  #164 = NameAndType        #165:#166     // setNewLeaderId:(IZ)V
  #165 = Utf8               setNewLeaderId
  #166 = Utf8               (IZ)V
  #167 = Methodref          #48.#168      // ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
  #168 = NameAndType        #169:#109     // getDissolvingExpiryTime:()J
  #169 = Utf8               getDissolvingExpiryTime
  #170 = Methodref          #11.#171      // ext/mods/gameserver/data/sql/ClanTable.scheduleRemoveClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #171 = NameAndType        #172:#173     // scheduleRemoveClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #172 = Utf8               scheduleRemoveClan
  #173 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #174 = String             #175          // notice
  #175 = Utf8               notice
  #176 = String             #177          // enabled
  #177 = Utf8               enabled
  #178 = InterfaceMethodref #37.#179      // java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
  #179 = NameAndType        #180:#181     // getBoolean:(Ljava/lang/String;)Z
  #180 = Utf8               getBoolean
  #181 = Utf8               (Ljava/lang/String;)Z
  #182 = Methodref          #48.#183      // ext/mods/gameserver/model/pledge/Clan.setNotice:(Ljava/lang/String;ZZ)V
  #183 = NameAndType        #184:#185     // setNotice:(Ljava/lang/String;ZZ)V
  #184 = Utf8               setNotice
  #185 = Utf8               (Ljava/lang/String;ZZ)V
  #186 = String             #187          // introduction
  #187 = Utf8               introduction
  #188 = Methodref          #48.#189      // ext/mods/gameserver/model/pledge/Clan.setIntroduction:(Ljava/lang/String;Z)V
  #189 = NameAndType        #190:#191     // setIntroduction:(Ljava/lang/String;Z)V
  #190 = Utf8               setIntroduction
  #191 = Utf8               (Ljava/lang/String;Z)V
  #192 = String             #193          // graduates
  #193 = Utf8               graduates
  #194 = Methodref          #48.#195      // ext/mods/gameserver/model/pledge/Clan.setGraduates:(Ljava/lang/String;)V
  #195 = NameAndType        #196:#76      // setGraduates:(Ljava/lang/String;)V
  #196 = Utf8               setGraduates
  #197 = InterfaceMethodref #37.#198      // java/sql/ResultSet.close:()V
  #198 = NameAndType        #199:#6       // close:()V
  #199 = Utf8               close
  #200 = Class              #201          // java/lang/Throwable
  #201 = Utf8               java/lang/Throwable
  #202 = Methodref          #200.#203     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #203 = NameAndType        #204:#205     // addSuppressed:(Ljava/lang/Throwable;)V
  #204 = Utf8               addSuppressed
  #205 = Utf8               (Ljava/lang/Throwable;)V
  #206 = InterfaceMethodref #31.#198      // java/sql/PreparedStatement.close:()V
  #207 = InterfaceMethodref #25.#198      // java/sql/Connection.close:()V
  #208 = Class              #209          // java/lang/Exception
  #209 = Utf8               java/lang/Exception
  #210 = Fieldref           #11.#211      // ext/mods/gameserver/data/sql/ClanTable.LOGGER:Lext/mods/commons/logging/CLogger;
  #211 = NameAndType        #212:#213     // LOGGER:Lext/mods/commons/logging/CLogger;
  #212 = Utf8               LOGGER
  #213 = Utf8               Lext/mods/commons/logging/CLogger;
  #214 = String             #215          // Couldn\'t restore clans.
  #215 = Utf8               Couldn\'t restore clans.
  #216 = Methodref          #217.#218     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #217 = Class              #219          // ext/mods/commons/logging/CLogger
  #218 = NameAndType        #220:#221     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #219 = Utf8               ext/mods/commons/logging/CLogger
  #220 = Utf8               error
  #221 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #222 = String             #223          // Loaded {} clans.
  #223 = Utf8               Loaded {} clans.
  #224 = InterfaceMethodref #62.#225      // java/util/Map.size:()I
  #225 = NameAndType        #226:#227     // size:()I
  #226 = Utf8               size
  #227 = Utf8               ()I
  #228 = Methodref          #217.#229     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #229 = NameAndType        #230:#231     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #230 = Utf8               info
  #231 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #232 = Methodref          #11.#233      // ext/mods/gameserver/data/sql/ClanTable.allianceCheck:()V
  #233 = NameAndType        #234:#6       // allianceCheck:()V
  #234 = Utf8               allianceCheck
  #235 = Methodref          #11.#236      // ext/mods/gameserver/data/sql/ClanTable.restoreWars:()V
  #236 = NameAndType        #237:#6       // restoreWars:()V
  #237 = Utf8               restoreWars
  #238 = Methodref          #11.#239      // ext/mods/gameserver/data/sql/ClanTable.refreshClansLadder:(Z)V
  #239 = NameAndType        #240:#241     // refreshClansLadder:(Z)V
  #240 = Utf8               refreshClansLadder
  #241 = Utf8               (Z)V
  #242 = InterfaceMethodref #62.#243      // java/util/Map.values:()Ljava/util/Collection;
  #243 = NameAndType        #244:#245     // values:()Ljava/util/Collection;
  #244 = Utf8               values
  #245 = Utf8               ()Ljava/util/Collection;
  #246 = InterfaceMethodref #62.#247      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #247 = NameAndType        #248:#249     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #248 = Utf8               get
  #249 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #250 = InterfaceMethodref #251.#252     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #251 = Class              #253          // java/util/Collection
  #252 = NameAndType        #254:#255     // stream:()Ljava/util/stream/Stream;
  #253 = Utf8               java/util/Collection
  #254 = Utf8               stream
  #255 = Utf8               ()Ljava/util/stream/Stream;
  #256 = InvokeDynamic      #0:#257       // #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #257 = NameAndType        #258:#259     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #258 = Utf8               test
  #259 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #260 = InterfaceMethodref #261.#262     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #261 = Class              #263          // java/util/stream/Stream
  #262 = NameAndType        #264:#265     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #263 = Utf8               java/util/stream/Stream
  #264 = Utf8               filter
  #265 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #266 = InterfaceMethodref #261.#267     // java/util/stream/Stream.findAny:()Ljava/util/Optional;
  #267 = NameAndType        #268:#269     // findAny:()Ljava/util/Optional;
  #268 = Utf8               findAny
  #269 = Utf8               ()Ljava/util/Optional;
  #270 = Methodref          #271.#272     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #271 = Class              #273          // java/util/Optional
  #272 = NameAndType        #274:#249     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #273 = Utf8               java/util/Optional
  #274 = Utf8               orElse
  #275 = Methodref          #276.#277     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #276 = Class              #278          // ext/mods/gameserver/model/actor/Player
  #277 = NameAndType        #279:#280     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #278 = Utf8               ext/mods/gameserver/model/actor/Player
  #279 = Utf8               getStatus
  #280 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #281 = Methodref          #282.#283     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #282 = Class              #284          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #283 = NameAndType        #285:#227     // getLevel:()I
  #284 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #285 = Utf8               getLevel
  #286 = Fieldref           #287.#288     // ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #287 = Class              #289          // ext/mods/gameserver/network/SystemMessageId
  #288 = NameAndType        #290:#291     // YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #289 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #290 = Utf8               YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN
  #291 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #292 = Methodref          #276.#293     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #293 = NameAndType        #294:#295     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #294 = Utf8               sendPacket
  #295 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #296 = Methodref          #276.#297     // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #297 = NameAndType        #298:#227     // getClanId:()I
  #298 = Utf8               getClanId
  #299 = Fieldref           #287.#300     // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_CREATE_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #300 = NameAndType        #301:#291     // FAILED_TO_CREATE_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #301 = Utf8               FAILED_TO_CREATE_CLAN
  #302 = Methodref          #276.#303     // ext/mods/gameserver/model/actor/Player.getClanCreateExpiryTime:()J
  #303 = NameAndType        #304:#109     // getClanCreateExpiryTime:()J
  #304 = Utf8               getClanCreateExpiryTime
  #305 = Fieldref           #287.#306     // ext/mods/gameserver/network/SystemMessageId.YOU_MUST_WAIT_XX_DAYS_BEFORE_CREATING_A_NEW_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #306 = NameAndType        #307:#291     // YOU_MUST_WAIT_XX_DAYS_BEFORE_CREATING_A_NEW_CLAN:Lext/mods/gameserver/network/SystemMessageId;
  #307 = Utf8               YOU_MUST_WAIT_XX_DAYS_BEFORE_CREATING_A_NEW_CLAN
  #308 = Methodref          #309.#310     // ext/mods/commons/lang/StringUtil.isAlphaNumeric:(Ljava/lang/String;)Z
  #309 = Class              #311          // ext/mods/commons/lang/StringUtil
  #310 = NameAndType        #312:#181     // isAlphaNumeric:(Ljava/lang/String;)Z
  #311 = Utf8               ext/mods/commons/lang/StringUtil
  #312 = Utf8               isAlphaNumeric
  #313 = String             #314          // Clan name is incorrect.
  #314 = Utf8               Clan name is incorrect.
  #315 = Methodref          #276.#316     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #316 = NameAndType        #317:#76      // sendMessage:(Ljava/lang/String;)V
  #317 = Utf8               sendMessage
  #318 = Methodref          #319.#320     // java/lang/String.length:()I
  #319 = Class              #321          // java/lang/String
  #320 = NameAndType        #322:#227     // length:()I
  #321 = Utf8               java/lang/String
  #322 = Utf8               length
  #323 = Fieldref           #287.#324     // ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_LENGTH_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #324 = NameAndType        #325:#291     // CLAN_NAME_LENGTH_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #325 = Utf8               CLAN_NAME_LENGTH_INCORRECT
  #326 = Methodref          #11.#327      // ext/mods/gameserver/data/sql/ClanTable.getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #327 = NameAndType        #328:#329     // getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #328 = Utf8               getClanByName
  #329 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #330 = Fieldref           #287.#331     // ext/mods/gameserver/network/SystemMessageId.S1_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #331 = NameAndType        #332:#291     // S1_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
  #332 = Utf8               S1_ALREADY_EXISTS
  #333 = Methodref          #334.#335     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #334 = Class              #336          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #335 = NameAndType        #337:#338     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #336 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #337 = Utf8               getSystemMessage
  #338 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #339 = Methodref          #334.#340     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #340 = NameAndType        #341:#342     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #341 = Utf8               addString
  #342 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #343 = Methodref          #276.#344     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #344 = NameAndType        #294:#345     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #345 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #346 = Methodref          #347.#348     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #347 = Class              #349          // ext/mods/gameserver/idfactory/IdFactory
  #348 = NameAndType        #350:#351     // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #349 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #350 = Utf8               getInstance
  #351 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #352 = Methodref          #347.#353     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #353 = NameAndType        #354:#227     // getNextId:()I
  #354 = Utf8               getNextId
  #355 = Methodref          #48.#356      // ext/mods/gameserver/model/pledge/Clan."<init>":(ILjava/lang/String;)V
  #356 = NameAndType        #5:#357       // "<init>":(ILjava/lang/String;)V
  #357 = Utf8               (ILjava/lang/String;)V
  #358 = Class              #359          // ext/mods/gameserver/model/pledge/ClanMember
  #359 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
  #360 = Methodref          #358.#361     // ext/mods/gameserver/model/pledge/ClanMember."<init>":(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
  #361 = NameAndType        #5:#362       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
  #362 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
  #363 = Class              #364          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #364 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #365 = Methodref          #358.#366     // ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
  #366 = NameAndType        #367:#227     // getObjectId:()I
  #367 = Utf8               getObjectId
  #368 = Methodref          #363.#369     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #369 = NameAndType        #5:#82        // "<init>":(I)V
  #370 = Methodref          #48.#371      // ext/mods/gameserver/model/pledge/Clan.setLeader:(Lext/mods/gameserver/model/pledge/ClanMember;)V
  #371 = NameAndType        #372:#373     // setLeader:(Lext/mods/gameserver/model/pledge/ClanMember;)V
  #372 = Utf8               setLeader
  #373 = Utf8               (Lext/mods/gameserver/model/pledge/ClanMember;)V
  #374 = Methodref          #358.#375     // ext/mods/gameserver/model/pledge/ClanMember.setPlayerInstance:(Lext/mods/gameserver/model/actor/Player;)V
  #375 = NameAndType        #376:#377     // setPlayerInstance:(Lext/mods/gameserver/model/actor/Player;)V
  #376 = Utf8               setPlayerInstance
  #377 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #378 = Methodref          #48.#379      // ext/mods/gameserver/model/pledge/Clan.store:()V
  #379 = NameAndType        #380:#6       // store:()V
  #380 = Utf8               store
  #381 = Methodref          #276.#382     // ext/mods/gameserver/model/actor/Player.setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #382 = NameAndType        #383:#173     // setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #383 = Utf8               setClan
  #384 = Methodref          #358.#385     // ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
  #385 = NameAndType        #386:#387     // calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
  #386 = Utf8               calculatePledgeClass
  #387 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #388 = Methodref          #276.#389     // ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
  #389 = NameAndType        #390:#82      // setPledgeClass:(I)V
  #390 = Utf8               setPledgeClass
  #391 = Methodref          #48.#297      // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #392 = Methodref          #276.#393     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #393 = NameAndType        #394:#395     // getLocale:()Ljava/util/Locale;
  #394 = Utf8               getLocale
  #395 = Utf8               ()Ljava/util/Locale;
  #396 = String             #397          // html/script/feature/Clan/9000-02-success.htm
  #397 = Utf8               html/script/feature/Clan/9000-02-success.htm
  #398 = Methodref          #363.#399     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #399 = NameAndType        #400:#401     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #400 = Utf8               setFile
  #401 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #402 = Class              #403          // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
  #403 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
  #404 = Methodref          #402.#405     // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
  #405 = NameAndType        #5:#406       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
  #406 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
  #407 = Class              #408          // ext/mods/gameserver/network/serverpackets/UserInfo
  #408 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #409 = Methodref          #407.#410     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #410 = NameAndType        #5:#377       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #411 = InterfaceMethodref #62.#412      // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #412 = NameAndType        #413:#414     // containsKey:(Ljava/lang/Object;)Z
  #413 = Utf8               containsKey
  #414 = Utf8               (Ljava/lang/Object;)Z
  #415 = Class              #416          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #416 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #417 = Fieldref           #287.#418     // ext/mods/gameserver/network/SystemMessageId.CLAN_HAS_DISPERSED:Lext/mods/gameserver/network/SystemMessageId;
  #418 = NameAndType        #419:#291     // CLAN_HAS_DISPERSED:Lext/mods/gameserver/network/SystemMessageId;
  #419 = Utf8               CLAN_HAS_DISPERSED
  #420 = Methodref          #48.#421      // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #421 = NameAndType        #422:#423     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #422 = Utf8               broadcastToMembers
  #423 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #424 = Methodref          #425.#426     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #425 = Class              #427          // ext/mods/gameserver/data/manager/CastleManager
  #426 = NameAndType        #350:#428     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #427 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #428 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #429 = Methodref          #425.#430     // ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
  #430 = NameAndType        #431:#245     // getCastles:()Ljava/util/Collection;
  #431 = Utf8               getCastles
  #432 = InterfaceMethodref #251.#433     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #433 = NameAndType        #434:#435     // iterator:()Ljava/util/Iterator;
  #434 = Utf8               iterator
  #435 = Utf8               ()Ljava/util/Iterator;
  #436 = InterfaceMethodref #437.#438     // java/util/Iterator.hasNext:()Z
  #437 = Class              #439          // java/util/Iterator
  #438 = NameAndType        #440:#41      // hasNext:()Z
  #439 = Utf8               java/util/Iterator
  #440 = Utf8               hasNext
  #441 = InterfaceMethodref #437.#442     // java/util/Iterator.next:()Ljava/lang/Object;
  #442 = NameAndType        #40:#443      // next:()Ljava/lang/Object;
  #443 = Utf8               ()Ljava/lang/Object;
  #444 = Class              #445          // ext/mods/gameserver/model/residence/castle/Castle
  #445 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #446 = Methodref          #444.#447     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #447 = NameAndType        #448:#449     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #448 = Utf8               getSiege
  #449 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #450 = Methodref          #451.#452     // ext/mods/gameserver/model/residence/castle/Siege.getRegisteredClans:()Ljava/util/Map;
  #451 = Class              #453          // ext/mods/gameserver/model/residence/castle/Siege
  #452 = NameAndType        #454:#455     // getRegisteredClans:()Ljava/util/Map;
  #453 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #454 = Utf8               getRegisteredClans
  #455 = Utf8               ()Ljava/util/Map;
  #456 = InterfaceMethodref #62.#457      // java/util/Map.keySet:()Ljava/util/Set;
  #457 = NameAndType        #458:#459     // keySet:()Ljava/util/Set;
  #458 = Utf8               keySet
  #459 = Utf8               ()Ljava/util/Set;
  #460 = InvokeDynamic      #1:#461       // #1:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #461 = NameAndType        #258:#462     // test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #462 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #463 = InterfaceMethodref #464.#465     // java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
  #464 = Class              #466          // java/util/Set
  #465 = NameAndType        #467:#468     // removeIf:(Ljava/util/function/Predicate;)Z
  #466 = Utf8               java/util/Set
  #467 = Utf8               removeIf
  #468 = Utf8               (Ljava/util/function/Predicate;)Z
  #469 = Methodref          #48.#470      // ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
  #470 = NameAndType        #471:#227     // getClanHallId:()I
  #471 = Utf8               getClanHallId
  #472 = Methodref          #473.#474     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #473 = Class              #475          // ext/mods/gameserver/data/manager/ClanHallManager
  #474 = NameAndType        #350:#476     // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #475 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #476 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #477 = Methodref          #473.#478     // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHalls:()Ljava/util/List;
  #478 = NameAndType        #479:#480     // getSiegableHalls:()Ljava/util/List;
  #479 = Utf8               getSiegableHalls
  #480 = Utf8               ()Ljava/util/List;
  #481 = InterfaceMethodref #482.#433     // java/util/List.iterator:()Ljava/util/Iterator;
  #482 = Class              #483          // java/util/List
  #483 = Utf8               java/util/List
  #484 = Class              #485          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #485 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #486 = Methodref          #484.#487     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.removeAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
  #487 = NameAndType        #488:#173     // removeAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
  #488 = Utf8               removeAttacker
  #489 = Methodref          #473.#490     // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #490 = NameAndType        #491:#492     // getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #491 = Utf8               getSiegableHall
  #492 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #493 = Methodref          #484.#494     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
  #494 = NameAndType        #495:#227     // getOwnerId:()I
  #495 = Utf8               getOwnerId
  #496 = Methodref          #484.#497     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.free:()V
  #497 = NameAndType        #498:#6       // free:()V
  #498 = Utf8               free
  #499 = Methodref          #48.#500      // ext/mods/gameserver/model/pledge/Clan.getAttackerList:()Ljava/util/Set;
  #500 = NameAndType        #501:#459     // getAttackerList:()Ljava/util/Set;
  #501 = Utf8               getAttackerList
  #502 = InterfaceMethodref #464.#433     // java/util/Set.iterator:()Ljava/util/Iterator;
  #503 = Methodref          #56.#504      // java/lang/Integer.intValue:()I
  #504 = NameAndType        #505:#227     // intValue:()I
  #505 = Utf8               intValue
  #506 = Methodref          #48.#507      // ext/mods/gameserver/model/pledge/Clan.deleteAttackerClan:(I)V
  #507 = NameAndType        #508:#82      // deleteAttackerClan:(I)V
  #508 = Utf8               deleteAttackerClan
  #509 = Methodref          #48.#510      // ext/mods/gameserver/model/pledge/Clan.deleteEnemyClan:(I)V
  #510 = NameAndType        #511:#82      // deleteEnemyClan:(I)V
  #511 = Utf8               deleteEnemyClan
  #512 = Methodref          #48.#513      // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #513 = NameAndType        #514:#515     // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #514 = Utf8               getWarehouse
  #515 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #516 = Methodref          #517.#518     // ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyAllItems:()V
  #517 = Class              #519          // ext/mods/gameserver/model/itemcontainer/ItemContainer
  #518 = NameAndType        #520:#6       // destroyAllItems:()V
  #519 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
  #520 = Utf8               destroyAllItems
  #521 = Methodref          #48.#522      // ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
  #522 = NameAndType        #523:#245     // getMembers:()Ljava/util/Collection;
  #523 = Utf8               getMembers
  #524 = Methodref          #48.#525      // ext/mods/gameserver/model/pledge/Clan.removeClanMember:(IJ)V
  #525 = NameAndType        #526:#527     // removeClanMember:(IJ)V
  #526 = Utf8               removeClanMember
  #527 = Utf8               (IJ)V
  #528 = String             #529          // DELETE FROM clan_data WHERE clan_id=?
  #529 = Utf8               DELETE FROM clan_data WHERE clan_id=?
  #530 = InterfaceMethodref #31.#531      // java/sql/PreparedStatement.setInt:(II)V
  #531 = NameAndType        #532:#54      // setInt:(II)V
  #532 = Utf8               setInt
  #533 = InterfaceMethodref #31.#534      // java/sql/PreparedStatement.executeUpdate:()I
  #534 = NameAndType        #535:#227     // executeUpdate:()I
  #535 = Utf8               executeUpdate
  #536 = String             #537          // DELETE FROM clan_privs WHERE clan_id=?
  #537 = Utf8               DELETE FROM clan_privs WHERE clan_id=?
  #538 = String             #539          // DELETE FROM clan_skills WHERE clan_id=?
  #539 = Utf8               DELETE FROM clan_skills WHERE clan_id=?
  #540 = String             #541          // DELETE FROM clan_subpledges WHERE clan_id=?
  #541 = Utf8               DELETE FROM clan_subpledges WHERE clan_id=?
  #542 = String             #543          // DELETE FROM clan_wars WHERE clan1=? OR clan2=?
  #543 = Utf8               DELETE FROM clan_wars WHERE clan1=? OR clan2=?
  #544 = String             #545          // DELETE FROM siege_clans WHERE clan_id=?
  #545 = Utf8               DELETE FROM siege_clans WHERE clan_id=?
  #546 = Methodref          #48.#547      // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
  #547 = NameAndType        #548:#227     // getCastleId:()I
  #548 = Utf8               getCastleId
  #549 = String             #550          // UPDATE castle SET currentTaxPercent=0, nextTaxPercent=0 WHERE id=?
  #550 = Utf8               UPDATE castle SET currentTaxPercent=0, nextTaxPercent=0 WHERE id=?
  #551 = String             #552          // Couldn\'t delete clan.
  #552 = Utf8               Couldn\'t delete clan.
  #553 = Methodref          #347.#554     // ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
  #554 = NameAndType        #555:#82      // releaseId:(I)V
  #555 = Utf8               releaseId
  #556 = InterfaceMethodref #62.#557      // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #557 = NameAndType        #558:#249     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #558 = Utf8               remove
  #559 = InvokeDynamic      #2:#560       // #2:run:(Lext/mods/gameserver/data/sql/ClanTable;Lext/mods/gameserver/model/pledge/Clan;)Ljava/lang/Runnable;
  #560 = NameAndType        #561:#562     // run:(Lext/mods/gameserver/data/sql/ClanTable;Lext/mods/gameserver/model/pledge/Clan;)Ljava/lang/Runnable;
  #561 = Utf8               run
  #562 = Utf8               (Lext/mods/gameserver/data/sql/ClanTable;Lext/mods/gameserver/model/pledge/Clan;)Ljava/lang/Runnable;
  #563 = Long               60000l
  #565 = Methodref          #566.#567     // java/lang/Math.max:(JJ)J
  #566 = Class              #568          // java/lang/Math
  #567 = NameAndType        #569:#570     // max:(JJ)J
  #568 = Utf8               java/lang/Math
  #569 = Utf8               max
  #570 = Utf8               (JJ)J
  #571 = Methodref          #572.#573     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #572 = Class              #574          // ext/mods/commons/pool/ThreadPool
  #573 = NameAndType        #575:#576     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #574 = Utf8               ext/mods/commons/pool/ThreadPool
  #575 = Utf8               schedule
  #576 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #577 = Methodref          #48.#578      // ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
  #578 = NameAndType        #579:#580     // getAllyName:()Ljava/lang/String;
  #579 = Utf8               getAllyName
  #580 = Utf8               ()Ljava/lang/String;
  #581 = Methodref          #319.#582     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #582 = NameAndType        #583:#181     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #583 = Utf8               equalsIgnoreCase
  #584 = Methodref          #48.#585      // ext/mods/gameserver/model/pledge/Clan.setEnemyClan:(I)V
  #585 = NameAndType        #586:#82      // setEnemyClan:(I)V
  #586 = Utf8               setEnemyClan
  #587 = Class              #588          // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #588 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
  #589 = Methodref          #587.#590     // ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #590 = NameAndType        #5:#173       // "<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
  #591 = Fieldref           #287.#592     // ext/mods/gameserver/network/SystemMessageId.CLAN_WAR_DECLARED_AGAINST_S1_IF_KILLED_LOSE_LOW_EXP:Lext/mods/gameserver/network/SystemMessageId;
  #592 = NameAndType        #593:#291     // CLAN_WAR_DECLARED_AGAINST_S1_IF_KILLED_LOSE_LOW_EXP:Lext/mods/gameserver/network/SystemMessageId;
  #593 = Utf8               CLAN_WAR_DECLARED_AGAINST_S1_IF_KILLED_LOSE_LOW_EXP
  #594 = Methodref          #48.#595      // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #595 = NameAndType        #596:#580     // getName:()Ljava/lang/String;
  #596 = Utf8               getName
  #597 = Methodref          #48.#598      // ext/mods/gameserver/model/pledge/Clan.setAttackerClan:(I)V
  #598 = NameAndType        #599:#82      // setAttackerClan:(I)V
  #599 = Utf8               setAttackerClan
  #600 = Fieldref           #287.#601     // ext/mods/gameserver/network/SystemMessageId.CLAN_S1_DECLARED_WAR:Lext/mods/gameserver/network/SystemMessageId;
  #601 = NameAndType        #602:#291     // CLAN_S1_DECLARED_WAR:Lext/mods/gameserver/network/SystemMessageId;
  #602 = Utf8               CLAN_S1_DECLARED_WAR
  #603 = String             #604          // REPLACE INTO clan_wars (clan1, clan2) VALUES(?,?)
  #604 = Utf8               REPLACE INTO clan_wars (clan1, clan2) VALUES(?,?)
  #605 = InterfaceMethodref #31.#606      // java/sql/PreparedStatement.execute:()Z
  #606 = NameAndType        #607:#41      // execute:()Z
  #607 = Utf8               execute
  #608 = String             #609          // Couldn\'t store clans wars.
  #609 = Utf8               Couldn\'t store clans wars.
  #610 = Fieldref           #287.#611     // ext/mods/gameserver/network/SystemMessageId.WAR_AGAINST_S1_HAS_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
  #611 = NameAndType        #612:#291     // WAR_AGAINST_S1_HAS_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
  #612 = Utf8               WAR_AGAINST_S1_HAS_STOPPED
  #613 = Fieldref           #287.#614     // ext/mods/gameserver/network/SystemMessageId.CLAN_S1_HAS_DECIDED_TO_STOP:Lext/mods/gameserver/network/SystemMessageId;
  #614 = NameAndType        #615:#291     // CLAN_S1_HAS_DECIDED_TO_STOP:Lext/mods/gameserver/network/SystemMessageId;
  #615 = Utf8               CLAN_S1_HAS_DECIDED_TO_STOP
  #616 = Fieldref           #119.#617     // ext/mods/Config.CLAN_WAR_PENALTY_WHEN_ENDED:I
  #617 = NameAndType        #618:#123     // CLAN_WAR_PENALTY_WHEN_ENDED:I
  #618 = Utf8               CLAN_WAR_PENALTY_WHEN_ENDED
  #619 = Methodref          #48.#620      // ext/mods/gameserver/model/pledge/Clan.addWarPenaltyTime:(IJ)V
  #620 = NameAndType        #621:#527     // addWarPenaltyTime:(IJ)V
  #621 = Utf8               addWarPenaltyTime
  #622 = String             #623          // UPDATE clan_wars SET expiry_time=? WHERE clan1=? AND clan2=?
  #623 = Utf8               UPDATE clan_wars SET expiry_time=? WHERE clan1=? AND clan2=?
  #624 = InterfaceMethodref #31.#625      // java/sql/PreparedStatement.setLong:(IJ)V
  #625 = NameAndType        #626:#527     // setLong:(IJ)V
  #626 = Utf8               setLong
  #627 = String             #628          // DELETE FROM clan_wars WHERE clan1=? AND clan2=?
  #628 = Utf8               DELETE FROM clan_wars WHERE clan1=? AND clan2=?
  #629 = String             #630          // Couldn\'t delete clans wars.
  #630 = Utf8               Couldn\'t delete clans wars.
  #631 = Methodref          #358.#632     // ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #632 = NameAndType        #633:#634     // getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
  #633 = Utf8               getPlayerInstance
  #634 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #635 = Methodref          #276.#636     // ext/mods/gameserver/model/actor/Player.wantsPeace:()Z
  #636 = NameAndType        #637:#41      // wantsPeace:()Z
  #637 = Utf8               wantsPeace
  #638 = Methodref          #48.#639      // ext/mods/gameserver/model/pledge/Clan.getMembersCount:()I
  #639 = NameAndType        #640:#227     // getMembersCount:()I
  #640 = Utf8               getMembersCount
  #641 = Methodref          #11.#642      // ext/mods/gameserver/data/sql/ClanTable.deleteClansWars:(II)V
  #642 = NameAndType        #643:#54      // deleteClansWars:(II)V
  #643 = Utf8               deleteClansWars
  #644 = String             #645          // DELETE FROM clan_wars WHERE expiry_time > 0 AND expiry_time <= ?
  #645 = Utf8               DELETE FROM clan_wars WHERE expiry_time > 0 AND expiry_time <= ?
  #646 = String             #647          // SELECT * FROM clan_wars
  #647 = Utf8               SELECT * FROM clan_wars
  #648 = String             #649          // clan1
  #649 = Utf8               clan1
  #650 = String             #651          // clan2
  #651 = Utf8               clan2
  #652 = String             #653          // expiry_time
  #653 = Utf8               expiry_time
  #654 = String             #655          // Couldn\'t restore clans wars.
  #655 = Utf8               Couldn\'t restore clans wars.
  #656 = InvokeDynamic      #3:#657       // #3:test:(Lext/mods/gameserver/data/sql/ClanTable;)Ljava/util/function/Predicate;
  #657 = NameAndType        #258:#658     // test:(Lext/mods/gameserver/data/sql/ClanTable;)Ljava/util/function/Predicate;
  #658 = Utf8               (Lext/mods/gameserver/data/sql/ClanTable;)Ljava/util/function/Predicate;
  #659 = InvokeDynamic      #4:#660       // #4:accept:()Ljava/util/function/Consumer;
  #660 = NameAndType        #661:#662     // accept:()Ljava/util/function/Consumer;
  #661 = Utf8               accept
  #662 = Utf8               ()Ljava/util/function/Consumer;
  #663 = InterfaceMethodref #261.#664     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #664 = NameAndType        #665:#666     // forEach:(Ljava/util/function/Consumer;)V
  #665 = Utf8               forEach
  #666 = Utf8               (Ljava/util/function/Consumer;)V
  #667 = Methodref          #668.#669     // java/util/Collections.emptyList:()Ljava/util/List;
  #668 = Class              #670          // java/util/Collections
  #669 = NameAndType        #671:#480     // emptyList:()Ljava/util/List;
  #670 = Utf8               java/util/Collections
  #671 = Utf8               emptyList
  #672 = InvokeDynamic      #5:#673       // #5:test:(I)Ljava/util/function/Predicate;
  #673 = NameAndType        #258:#674     // test:(I)Ljava/util/function/Predicate;
  #674 = Utf8               (I)Ljava/util/function/Predicate;
  #675 = InterfaceMethodref #261.#676     // java/util/stream/Stream.toList:()Ljava/util/List;
  #676 = NameAndType        #677:#480     // toList:()Ljava/util/List;
  #677 = Utf8               toList
  #678 = Methodref          #48.#679      // ext/mods/gameserver/model/pledge/Clan.getRank:()I
  #679 = NameAndType        #680:#227     // getRank:()I
  #680 = Utf8               getRank
  #681 = Methodref          #48.#682      // ext/mods/gameserver/model/pledge/Clan.setRank:(I)V
  #682 = NameAndType        #683:#82      // setRank:(I)V
  #683 = Utf8               setRank
  #684 = String             #685          // SELECT clan_id FROM clan_data ORDER BY reputation_score DESC LIMIT 99
  #685 = Utf8               SELECT clan_id FROM clan_data ORDER BY reputation_score DESC LIMIT 99
  #686 = Methodref          #48.#687      // ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
  #687 = NameAndType        #688:#227     // getReputationScore:()I
  #688 = Utf8               getReputationScore
  #689 = String             #690          // Couldn\'t refresh clans ladder.
  #690 = Utf8               Couldn\'t refresh clans ladder.
  #691 = InvokeDynamic      #6:#660       // #6:accept:()Ljava/util/function/Consumer;
  #692 = InterfaceMethodref #251.#664     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #693 = String             #694          // UPDATE clan_data SET graduates=NULL
  #694 = Utf8               UPDATE clan_data SET graduates=NULL
  #695 = String             #696          // Couldn\'t clear graduates.
  #696 = Utf8               Couldn\'t clear graduates.
  #697 = Fieldref           #698.#699     // ext/mods/gameserver/data/sql/ClanTable$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/sql/ClanTable;
  #698 = Class              #700          // ext/mods/gameserver/data/sql/ClanTable$SingletonHolder
  #699 = NameAndType        #701:#702     // INSTANCE:Lext/mods/gameserver/data/sql/ClanTable;
  #700 = Utf8               ext/mods/gameserver/data/sql/ClanTable$SingletonHolder
  #701 = Utf8               INSTANCE
  #702 = Utf8               Lext/mods/gameserver/data/sql/ClanTable;
  #703 = Methodref          #48.#704      // ext/mods/gameserver/model/pledge/Clan.getGraduates:()Ljava/util/Set;
  #704 = NameAndType        #705:#459     // getGraduates:()Ljava/util/Set;
  #705 = Utf8               getGraduates
  #706 = InterfaceMethodref #464.#707     // java/util/Set.clear:()V
  #707 = NameAndType        #708:#6       // clear:()V
  #708 = Utf8               clear
  #709 = Methodref          #48.#710      // ext/mods/gameserver/model/pledge/Clan.getAllyId:()I
  #710 = NameAndType        #711:#227     // getAllyId:()I
  #711 = Utf8               getAllyId
  #712 = Methodref          #48.#713      // ext/mods/gameserver/model/pledge/Clan.changeAllyCrest:(IZ)V
  #713 = NameAndType        #714:#166     // changeAllyCrest:(IZ)V
  #714 = Utf8               changeAllyCrest
  #715 = Methodref          #48.#716      // ext/mods/gameserver/model/pledge/Clan.updateClanInDB:()V
  #716 = NameAndType        #717:#6       // updateClanInDB:()V
  #717 = Utf8               updateClanInDB
  #718 = Methodref          #11.#719      // ext/mods/gameserver/data/sql/ClanTable.destroyClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #719 = NameAndType        #720:#173     // destroyClan:(Lext/mods/gameserver/model/pledge/Clan;)V
  #720 = Utf8               destroyClan
  #721 = Methodref          #722.#595     // java/lang/Class.getName:()Ljava/lang/String;
  #722 = Class              #723          // java/lang/Class
  #723 = Utf8               java/lang/Class
  #724 = Methodref          #217.#725     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #725 = NameAndType        #5:#76        // "<init>":(Ljava/lang/String;)V
  #726 = Utf8               LOAD_CLANS
  #727 = Utf8               Ljava/lang/String;
  #728 = Utf8               ConstantValue
  #729 = Utf8               DELETE_CLAN
  #730 = Utf8               DELETE_CLAN_PRIVS
  #731 = Utf8               DELETE_CLAN_SKILLS
  #732 = Utf8               DELETE_CLAN_SUBPLEDGES
  #733 = Utf8               DELETE_CLAN_WARS
  #734 = Utf8               DELETE_CLAN_SIEGES
  #735 = Utf8               RESET_CASTLE_TAX
  #736 = Utf8               INSERT_WAR
  #737 = Utf8               UPDATE_WAR_TIME
  #738 = Utf8               DELETE_WAR
  #739 = Utf8               DELETE_OLD_WARS
  #740 = Utf8               LOAD_WARS
  #741 = Utf8               LOAD_RANK
  #742 = Utf8               CLEAR_GRADUATES
  #743 = Utf8               Signature
  #744 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/pledge/Clan;>;
  #745 = Utf8               Code
  #746 = Utf8               LineNumberTable
  #747 = Utf8               LocalVariableTable
  #748 = Utf8               clanId
  #749 = Utf8               clan
  #750 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #751 = Utf8               allyExpireTime
  #752 = Utf8               J
  #753 = Utf8               charExpireTime
  #754 = Utf8               rs
  #755 = Utf8               Ljava/sql/ResultSet;
  #756 = Utf8               ps
  #757 = Utf8               Ljava/sql/PreparedStatement;
  #758 = Utf8               con
  #759 = Utf8               Ljava/sql/Connection;
  #760 = Utf8               e
  #761 = Utf8               Ljava/lang/Exception;
  #762 = Utf8               this
  #763 = Utf8               StackMapTable
  #764 = Utf8               getClans
  #765 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/pledge/Clan;>;
  #766 = Utf8               getClan
  #767 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #768 = Utf8               clanName
  #769 = Utf8               createClan
  #770 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
  #771 = Utf8               player
  #772 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #773 = Utf8               leader
  #774 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
  #775 = Utf8               html
  #776 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #777 = Utf8               castle
  #778 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #779 = Utf8               sh
  #780 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #781 = Utf8               hall
  #782 = Utf8               attackerClan
  #783 = Utf8               member
  #784 = Utf8               hallId
  #785 = Utf8               isAllyExists
  #786 = Utf8               allyName
  #787 = Utf8               storeClansWars
  #788 = Utf8               clanId1
  #789 = Utf8               clanId2
  #790 = Utf8               penaltyExpiryTime
  #791 = Utf8               checkSurrender
  #792 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)V
  #793 = Utf8               count
  #794 = Utf8               expiryTime
  #795 = Utf8               getClanAllies
  #796 = Utf8               (I)Ljava/util/List;
  #797 = Utf8               allianceId
  #798 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;
  #799 = Utf8               rank
  #800 = Utf8               cleanupRank
  #801 = Utf8               Z
  #802 = Utf8               clearGraduates
  #803 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #804 = Utf8               lambda$clearGraduates$0
  #805 = Utf8               c
  #806 = Utf8               lambda$getClanAllies$0
  #807 = Utf8               (ILext/mods/gameserver/model/pledge/Clan;)Z
  #808 = Utf8               lambda$allianceCheck$1
  #809 = Utf8               lambda$allianceCheck$0
  #810 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #811 = Utf8               lambda$scheduleRemoveClan$0
  #812 = Utf8               lambda$destroyClan$0
  #813 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #814 = Utf8               lambda$getClanByName$0
  #815 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/pledge/Clan;)Z
  #816 = Utf8               <clinit>
  #817 = Utf8               SourceFile
  #818 = Utf8               ClanTable.java
  #819 = Utf8               NestMembers
  #820 = Utf8               BootstrapMethods
  #821 = MethodType         #414          //  (Ljava/lang/Object;)Z
  #822 = MethodHandle       6:#823        // REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$getClanByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/Clan;)Z
  #823 = Methodref          #11.#824      // ext/mods/gameserver/data/sql/ClanTable.lambda$getClanByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/Clan;)Z
  #824 = NameAndType        #814:#815     // lambda$getClanByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/Clan;)Z
  #825 = MethodType         #810          //  (Lext/mods/gameserver/model/pledge/Clan;)Z
  #826 = MethodHandle       6:#827        // REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$destroyClan$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #827 = Methodref          #11.#828      // ext/mods/gameserver/data/sql/ClanTable.lambda$destroyClan$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #828 = NameAndType        #812:#813     // lambda$destroyClan$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #829 = MethodType         #6            //  ()V
  #830 = MethodHandle       5:#831        // REF_invokeVirtual ext/mods/gameserver/data/sql/ClanTable.lambda$scheduleRemoveClan$0:(Lext/mods/gameserver/model/pledge/Clan;)V
  #831 = Methodref          #11.#832      // ext/mods/gameserver/data/sql/ClanTable.lambda$scheduleRemoveClan$0:(Lext/mods/gameserver/model/pledge/Clan;)V
  #832 = NameAndType        #811:#173     // lambda$scheduleRemoveClan$0:(Lext/mods/gameserver/model/pledge/Clan;)V
  #833 = MethodHandle       5:#834        // REF_invokeVirtual ext/mods/gameserver/data/sql/ClanTable.lambda$allianceCheck$0:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #834 = Methodref          #11.#835      // ext/mods/gameserver/data/sql/ClanTable.lambda$allianceCheck$0:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #835 = NameAndType        #809:#810     // lambda$allianceCheck$0:(Lext/mods/gameserver/model/pledge/Clan;)Z
  #836 = MethodType         #837          //  (Ljava/lang/Object;)V
  #837 = Utf8               (Ljava/lang/Object;)V
  #838 = MethodHandle       6:#839        // REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$allianceCheck$1:(Lext/mods/gameserver/model/pledge/Clan;)V
  #839 = Methodref          #11.#840      // ext/mods/gameserver/data/sql/ClanTable.lambda$allianceCheck$1:(Lext/mods/gameserver/model/pledge/Clan;)V
  #840 = NameAndType        #808:#173     // lambda$allianceCheck$1:(Lext/mods/gameserver/model/pledge/Clan;)V
  #841 = MethodType         #173          //  (Lext/mods/gameserver/model/pledge/Clan;)V
  #842 = MethodHandle       6:#843        // REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$getClanAllies$0:(ILext/mods/gameserver/model/pledge/Clan;)Z
  #843 = Methodref          #11.#844      // ext/mods/gameserver/data/sql/ClanTable.lambda$getClanAllies$0:(ILext/mods/gameserver/model/pledge/Clan;)Z
  #844 = NameAndType        #806:#807     // lambda$getClanAllies$0:(ILext/mods/gameserver/model/pledge/Clan;)Z
  #845 = MethodHandle       6:#846        // REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$clearGraduates$0:(Lext/mods/gameserver/model/pledge/Clan;)V
  #846 = Methodref          #11.#847      // ext/mods/gameserver/data/sql/ClanTable.lambda$clearGraduates$0:(Lext/mods/gameserver/model/pledge/Clan;)V
  #847 = NameAndType        #804:#173     // lambda$clearGraduates$0:(Lext/mods/gameserver/model/pledge/Clan;)V
  #848 = MethodHandle       6:#849        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #849 = Methodref          #850.#851     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #850 = Class              #852          // java/lang/invoke/LambdaMetafactory
  #851 = NameAndType        #853:#854     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #852 = Utf8               java/lang/invoke/LambdaMetafactory
  #853 = Utf8               metafactory
  #854 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #855 = Utf8               InnerClasses
  #856 = Utf8               SingletonHolder
  #857 = Class              #858          // java/lang/invoke/MethodHandles$Lookup
  #858 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #859 = Class              #860          // java/lang/invoke/MethodHandles
  #860 = Utf8               java/lang/invoke/MethodHandles
  #861 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.sql.ClanTable();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=10, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _clans:Ljava/util/Map;
        15: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        18: astore_1
        19: aload_1
        20: ldc           #22                 // String SELECT * FROM clan_data
        22: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_2
        28: aload_2
        29: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        34: astore_3
        35: aload_3
        36: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        41: ifeq          385
        44: aload_3
        45: ldc           #42                 // String clan_id
        47: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        52: istore        4
        54: new           #48                 // class ext/mods/gameserver/model/pledge/Clan
        57: dup
        58: iload         4
        60: aload_3
        61: ldc           #50                 // String leader_id
        63: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        68: invokespecial #52                 // Method ext/mods/gameserver/model/pledge/Clan."<init>":(II)V
        71: astore        5
        73: aload_0
        74: getfield      #10                 // Field _clans:Ljava/util/Map;
        77: iload         4
        79: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        82: aload         5
        84: invokeinterface #61,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        89: pop
        90: aload         5
        92: aload_3
        93: ldc           #67                 // String clan_name
        95: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       100: invokevirtual #73                 // Method ext/mods/gameserver/model/pledge/Clan.setName:(Ljava/lang/String;)V
       103: aload         5
       105: aload_3
       106: ldc           #77                 // String clan_level
       108: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       113: invokevirtual #79                 // Method ext/mods/gameserver/model/pledge/Clan.setLevel:(I)V
       116: aload         5
       118: aload_3
       119: ldc           #83                 // String hasCastle
       121: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       126: invokevirtual #85                 // Method ext/mods/gameserver/model/pledge/Clan.setCastle:(I)V
       129: aload         5
       131: aload_3
       132: ldc           #88                 // String ally_id
       134: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       139: invokevirtual #90                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyId:(I)V
       142: aload         5
       144: aload_3
       145: ldc           #93                 // String ally_name
       147: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       152: invokevirtual #95                 // Method ext/mods/gameserver/model/pledge/Clan.setAllyName:(Ljava/lang/String;)V
       155: aload_3
       156: ldc           #98                 // String ally_penalty_expiry_time
       158: invokeinterface #100,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       163: lstore        6
       165: lload         6
       167: invokestatic  #104                // Method java/lang/System.currentTimeMillis:()J
       170: lcmp
       171: ifle          189
       174: aload         5
       176: lload         6
       178: aload_3
       179: ldc           #110                // String ally_penalty_type
       181: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       186: invokevirtual #112                // Method ext/mods/gameserver/model/pledge/Clan.setAllyPenaltyExpiryTime:(JI)V
       189: aload_3
       190: ldc           #116                // String char_penalty_expiry_time
       192: invokeinterface #100,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       197: lstore        8
       199: lload         8
       201: getstatic     #118                // Field ext/mods/Config.CLAN_JOIN_DAYS:I
       204: i2l
       205: ldc2_w        #124                // long 86400000l
       208: lmul
       209: ladd
       210: invokestatic  #104                // Method java/lang/System.currentTimeMillis:()J
       213: lcmp
       214: ifle          224
       217: aload         5
       219: lload         8
       221: invokevirtual #126                // Method ext/mods/gameserver/model/pledge/Clan.setCharPenaltyExpiryTime:(J)V
       224: aload         5
       226: aload_3
       227: ldc           #130                // String dissolving_expiry_time
       229: invokeinterface #100,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       234: invokevirtual #132                // Method ext/mods/gameserver/model/pledge/Clan.setDissolvingExpiryTime:(J)V
       237: aload         5
       239: aload_3
       240: ldc           #135                // String crest_id
       242: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       247: invokevirtual #137                // Method ext/mods/gameserver/model/pledge/Clan.setCrestId:(I)V
       250: aload         5
       252: aload_3
       253: ldc           #140                // String crest_large_id
       255: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       260: invokevirtual #142                // Method ext/mods/gameserver/model/pledge/Clan.setCrestLargeId:(I)V
       263: aload         5
       265: aload_3
       266: ldc           #145                // String ally_crest_id
       268: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       273: invokevirtual #147                // Method ext/mods/gameserver/model/pledge/Clan.setAllyCrestId:(I)V
       276: aload         5
       278: aload_3
       279: ldc           #150                // String reputation_score
       281: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       286: invokevirtual #152                // Method ext/mods/gameserver/model/pledge/Clan.addReputationScore:(I)Z
       289: pop
       290: aload         5
       292: aload_3
       293: ldc           #156                // String auction_bid_at
       295: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       300: invokevirtual #158                // Method ext/mods/gameserver/model/pledge/Clan.setAuctionBiddedAt:(I)V
       303: aload         5
       305: aload_3
       306: ldc           #161                // String new_leader_id
       308: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       313: iconst_0
       314: invokevirtual #163                // Method ext/mods/gameserver/model/pledge/Clan.setNewLeaderId:(IZ)V
       317: aload         5
       319: invokevirtual #167                // Method ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
       322: lconst_0
       323: lcmp
       324: ifeq          333
       327: aload_0
       328: aload         5
       330: invokevirtual #170                // Method scheduleRemoveClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       333: aload         5
       335: aload_3
       336: ldc           #174                // String notice
       338: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       343: aload_3
       344: ldc           #176                // String enabled
       346: invokeinterface #178,  2          // InterfaceMethod java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
       351: iconst_0
       352: invokevirtual #182                // Method ext/mods/gameserver/model/pledge/Clan.setNotice:(Ljava/lang/String;ZZ)V
       355: aload         5
       357: aload_3
       358: ldc           #186                // String introduction
       360: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       365: iconst_0
       366: invokevirtual #188                // Method ext/mods/gameserver/model/pledge/Clan.setIntroduction:(Ljava/lang/String;Z)V
       369: aload         5
       371: aload_3
       372: ldc           #192                // String graduates
       374: invokeinterface #69,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       379: invokevirtual #194                // Method ext/mods/gameserver/model/pledge/Clan.setGraduates:(Ljava/lang/String;)V
       382: goto          35
       385: aload_3
       386: ifnull        425
       389: aload_3
       390: invokeinterface #197,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       395: goto          425
       398: astore        4
       400: aload_3
       401: ifnull        422
       404: aload_3
       405: invokeinterface #197,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       410: goto          422
       413: astore        5
       415: aload         4
       417: aload         5
       419: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       422: aload         4
       424: athrow
       425: aload_2
       426: ifnull        462
       429: aload_2
       430: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       435: goto          462
       438: astore_3
       439: aload_2
       440: ifnull        460
       443: aload_2
       444: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       449: goto          460
       452: astore        4
       454: aload_3
       455: aload         4
       457: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       460: aload_3
       461: athrow
       462: aload_1
       463: ifnull        497
       466: aload_1
       467: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       472: goto          497
       475: astore_2
       476: aload_1
       477: ifnull        495
       480: aload_1
       481: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       486: goto          495
       489: astore_3
       490: aload_2
       491: aload_3
       492: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       495: aload_2
       496: athrow
       497: goto          510
       500: astore_1
       501: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       504: ldc           #214                // String Couldn\'t restore clans.
       506: aload_1
       507: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       510: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       513: ldc           #222                // String Loaded {} clans.
       515: iconst_1
       516: anewarray     #2                  // class java/lang/Object
       519: dup
       520: iconst_0
       521: aload_0
       522: getfield      #10                 // Field _clans:Ljava/util/Map;
       525: invokeinterface #224,  1          // InterfaceMethod java/util/Map.size:()I
       530: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       533: aastore
       534: invokevirtual #228                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       537: aload_0
       538: invokevirtual #232                // Method allianceCheck:()V
       541: aload_0
       542: invokevirtual #235                // Method restoreWars:()V
       545: aload_0
       546: iconst_0
       547: invokevirtual #238                // Method refreshClansLadder:(Z)V
       550: return
      Exception table:
         from    to  target type
            35   385   398   Class java/lang/Throwable
           404   410   413   Class java/lang/Throwable
            28   425   438   Class java/lang/Throwable
           443   449   452   Class java/lang/Throwable
            19   462   475   Class java/lang/Throwable
           480   486   489   Class java/lang/Throwable
            15   497   500   Class java/lang/Exception
      LineNumberTable:
        line 77: 0
        line 74: 4
        line 78: 15
        line 79: 19
        line 80: 28
        line 82: 35
        line 84: 44
        line 85: 54
        line 87: 73
        line 89: 90
        line 90: 103
        line 91: 116
        line 92: 129
        line 93: 142
        line 95: 155
        line 96: 165
        line 97: 174
        line 99: 189
        line 100: 199
        line 101: 217
        line 103: 224
        line 105: 237
        line 106: 250
        line 107: 263
        line 109: 276
        line 110: 290
        line 111: 303
        line 113: 317
        line 114: 327
        line 116: 333
        line 117: 355
        line 118: 369
        line 119: 382
        line 120: 385
        line 78: 398
        line 120: 425
        line 78: 438
        line 120: 462
        line 78: 475
        line 124: 497
        line 121: 500
        line 123: 501
        line 125: 510
        line 127: 537
        line 129: 541
        line 131: 545
        line 132: 550
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54     328     4 clanId   I
           73     309     5  clan   Lext/mods/gameserver/model/pledge/Clan;
          165     217     6 allyExpireTime   J
          199     183     8 charExpireTime   J
           35     390     3    rs   Ljava/sql/ResultSet;
           28     434     2    ps   Ljava/sql/PreparedStatement;
           19     478     1   con   Ljava/sql/Connection;
          501       9     1     e   Ljava/lang/Exception;
            0     551     0  this   Lext/mods/gameserver/data/sql/ClanTable;
      StackMapTable: number_of_entries = 19
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 153
          locals = [ int, class ext/mods/gameserver/model/pledge/Clan, long ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ long ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 108
        frame_type = 255 /* full_frame */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public java.util.Collection<ext.mods.gameserver.model.pledge.Clan> getClans();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: invokeinterface #242,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 139: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/sql/ClanTable;
    Signature: #765                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/pledge/Clan;>;

  public ext.mods.gameserver.model.pledge.Clan getClan(int);
    descriptor: (I)Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        16: areturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0      17     1 clanId   I

  public ext.mods.gameserver.model.pledge.Clan getClanByName(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: invokeinterface #242,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #250,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #256,  0            // InvokeDynamic #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #266,  1          // InterfaceMethod java/util/stream/Stream.findAny:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #270                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        37: areturn
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0      38     1 clanName   Ljava/lang/String;

  public ext.mods.gameserver.model.pledge.Clan createClan(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: aload_1
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_1
         7: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        10: invokevirtual #281                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        13: bipush        10
        15: if_icmpge     27
        18: aload_1
        19: getstatic     #286                // Field ext/mods/gameserver/network/SystemMessageId.YOU_DO_NOT_MEET_CRITERIA_IN_ORDER_TO_CREATE_A_CLAN:Lext/mods/gameserver/network/SystemMessageId;
        22: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        25: aconst_null
        26: areturn
        27: aload_1
        28: invokevirtual #296                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        31: ifeq          43
        34: aload_1
        35: getstatic     #299                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_CREATE_CLAN:Lext/mods/gameserver/network/SystemMessageId;
        38: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        41: aconst_null
        42: areturn
        43: invokestatic  #104                // Method java/lang/System.currentTimeMillis:()J
        46: aload_1
        47: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.getClanCreateExpiryTime:()J
        50: lcmp
        51: ifge          63
        54: aload_1
        55: getstatic     #305                // Field ext/mods/gameserver/network/SystemMessageId.YOU_MUST_WAIT_XX_DAYS_BEFORE_CREATING_A_NEW_CLAN:Lext/mods/gameserver/network/SystemMessageId;
        58: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        61: aconst_null
        62: areturn
        63: aload_2
        64: invokestatic  #308                // Method ext/mods/commons/lang/StringUtil.isAlphaNumeric:(Ljava/lang/String;)Z
        67: ifne          79
        70: aload_1
        71: ldc_w         #313                // String Clan name is incorrect.
        74: invokevirtual #315                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        77: aconst_null
        78: areturn
        79: aload_2
        80: invokevirtual #318                // Method java/lang/String.length:()I
        83: iconst_2
        84: if_icmplt     96
        87: aload_2
        88: invokevirtual #318                // Method java/lang/String.length:()I
        91: bipush        16
        93: if_icmple     105
        96: aload_1
        97: getstatic     #323                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_NAME_LENGTH_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       100: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       103: aconst_null
       104: areturn
       105: aload_0
       106: aload_2
       107: invokevirtual #326                // Method getClanByName:(Ljava/lang/String;)Lext/mods/gameserver/model/pledge/Clan;
       110: ifnull        129
       113: aload_1
       114: getstatic     #330                // Field ext/mods/gameserver/network/SystemMessageId.S1_ALREADY_EXISTS:Lext/mods/gameserver/network/SystemMessageId;
       117: invokestatic  #333                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       120: aload_2
       121: invokevirtual #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       124: invokevirtual #343                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       127: aconst_null
       128: areturn
       129: new           #48                 // class ext/mods/gameserver/model/pledge/Clan
       132: dup
       133: invokestatic  #346                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       136: invokevirtual #352                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       139: aload_2
       140: invokespecial #355                // Method ext/mods/gameserver/model/pledge/Clan."<init>":(ILjava/lang/String;)V
       143: astore_3
       144: new           #358                // class ext/mods/gameserver/model/pledge/ClanMember
       147: dup
       148: aload_3
       149: aload_1
       150: invokespecial #360                // Method ext/mods/gameserver/model/pledge/ClanMember."<init>":(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/actor/Player;)V
       153: astore        4
       155: new           #363                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       158: dup
       159: aload         4
       161: invokevirtual #365                // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       164: invokespecial #368                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       167: astore        5
       169: aload_3
       170: aload         4
       172: invokevirtual #370                // Method ext/mods/gameserver/model/pledge/Clan.setLeader:(Lext/mods/gameserver/model/pledge/ClanMember;)V
       175: aload         4
       177: aload_1
       178: invokevirtual #374                // Method ext/mods/gameserver/model/pledge/ClanMember.setPlayerInstance:(Lext/mods/gameserver/model/actor/Player;)V
       181: aload_3
       182: invokevirtual #378                // Method ext/mods/gameserver/model/pledge/Clan.store:()V
       185: aload_1
       186: aload_3
       187: invokevirtual #381                // Method ext/mods/gameserver/model/actor/Player.setClan:(Lext/mods/gameserver/model/pledge/Clan;)V
       190: aload_1
       191: aload_1
       192: invokestatic  #384                // Method ext/mods/gameserver/model/pledge/ClanMember.calculatePledgeClass:(Lext/mods/gameserver/model/actor/Player;)I
       195: invokevirtual #388                // Method ext/mods/gameserver/model/actor/Player.setPledgeClass:(I)V
       198: aload_0
       199: getfield      #10                 // Field _clans:Ljava/util/Map;
       202: aload_3
       203: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       206: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       209: aload_3
       210: invokeinterface #61,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       215: pop
       216: aload         5
       218: aload_1
       219: invokevirtual #392                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       222: ldc_w         #396                // String html/script/feature/Clan/9000-02-success.htm
       225: invokevirtual #398                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       228: aload_1
       229: new           #402                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll
       232: dup
       233: aload_3
       234: iconst_0
       235: invokespecial #404                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListAll."<init>":(Lext/mods/gameserver/model/pledge/Clan;I)V
       238: invokevirtual #343                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       241: aload_1
       242: new           #407                // class ext/mods/gameserver/network/serverpackets/UserInfo
       245: dup
       246: aload_1
       247: invokespecial #409                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       250: invokevirtual #343                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       253: aload_1
       254: aload         5
       256: invokevirtual #343                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       259: aload_3
       260: areturn
      LineNumberTable:
        line 168: 0
        line 169: 4
        line 171: 6
        line 173: 18
        line 174: 25
        line 177: 27
        line 179: 34
        line 180: 41
        line 183: 43
        line 185: 54
        line 186: 61
        line 189: 63
        line 191: 70
        line 192: 77
        line 195: 79
        line 197: 96
        line 198: 103
        line 201: 105
        line 203: 113
        line 204: 127
        line 207: 129
        line 208: 144
        line 209: 155
        line 211: 169
        line 212: 175
        line 213: 181
        line 214: 185
        line 215: 190
        line 217: 198
        line 219: 216
        line 220: 228
        line 221: 241
        line 222: 253
        line 223: 259
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     261     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0     261     1 player   Lext/mods/gameserver/model/actor/Player;
            0     261     2 clanName   Ljava/lang/String;
          144     117     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          155     106     4 leader   Lext/mods/gameserver/model/pledge/ClanMember;
          169      92     5  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 8
        frame_type = 6 /* same */
        frame_type = 20 /* same */
        frame_type = 15 /* same */
        frame_type = 19 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 23 /* same */

  public void destroyClan(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
         8: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #411,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        16: ifne          20
        19: return
        20: aload_1
        21: iconst_1
        22: anewarray     #415                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        25: dup
        26: iconst_0
        27: getstatic     #417                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_HAS_DISPERSED:Lext/mods/gameserver/network/SystemMessageId;
        30: invokestatic  #333                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        33: aastore
        34: invokevirtual #420                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        37: invokestatic  #424                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        40: invokevirtual #429                // Method ext/mods/gameserver/data/manager/CastleManager.getCastles:()Ljava/util/Collection;
        43: invokeinterface #432,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        48: astore_2
        49: aload_2
        50: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        55: ifeq          95
        58: aload_2
        59: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        64: checkcast     #444                // class ext/mods/gameserver/model/residence/castle/Castle
        67: astore_3
        68: aload_3
        69: invokevirtual #446                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        72: invokevirtual #450                // Method ext/mods/gameserver/model/residence/castle/Siege.getRegisteredClans:()Ljava/util/Map;
        75: invokeinterface #456,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        80: aload_1
        81: invokedynamic #460,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
        86: invokeinterface #463,  2          // InterfaceMethod java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
        91: pop
        92: goto          49
        95: aload_1
        96: invokevirtual #469                // Method ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
        99: istore_2
       100: iload_2
       101: ifne          148
       104: invokestatic  #472                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       107: invokevirtual #477                // Method ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHalls:()Ljava/util/List;
       110: invokeinterface #481,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       115: astore_3
       116: aload_3
       117: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       122: ifeq          145
       125: aload_3
       126: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       131: checkcast     #484                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       134: astore        4
       136: aload         4
       138: aload_1
       139: invokevirtual #486                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.removeAttacker:(Lext/mods/gameserver/model/pledge/Clan;)V
       142: goto          116
       145: goto          175
       148: invokestatic  #472                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       151: iload_2
       152: invokevirtual #489                // Method ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHall:(I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
       155: astore_3
       156: aload_3
       157: ifnull        175
       160: aload_3
       161: invokevirtual #493                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getOwnerId:()I
       164: aload_1
       165: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       168: if_icmpne     175
       171: aload_3
       172: invokevirtual #496                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.free:()V
       175: aload_1
       176: invokevirtual #499                // Method ext/mods/gameserver/model/pledge/Clan.getAttackerList:()Ljava/util/Set;
       179: invokeinterface #502,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       184: astore_3
       185: aload_3
       186: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       191: ifeq          248
       194: aload_3
       195: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       200: checkcast     #56                 // class java/lang/Integer
       203: invokevirtual #503                // Method java/lang/Integer.intValue:()I
       206: istore        4
       208: aload_0
       209: getfield      #10                 // Field _clans:Ljava/util/Map;
       212: iload         4
       214: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       217: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       222: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
       225: astore        5
       227: aload         5
       229: aload_1
       230: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       233: invokevirtual #506                // Method ext/mods/gameserver/model/pledge/Clan.deleteAttackerClan:(I)V
       236: aload         5
       238: aload_1
       239: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       242: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.deleteEnemyClan:(I)V
       245: goto          185
       248: aload_1
       249: invokevirtual #512                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
       252: invokevirtual #516                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyAllItems:()V
       255: aload_1
       256: invokevirtual #521                // Method ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
       259: invokeinterface #432,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       264: astore_3
       265: aload_3
       266: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       271: ifeq          298
       274: aload_3
       275: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       280: checkcast     #358                // class ext/mods/gameserver/model/pledge/ClanMember
       283: astore        4
       285: aload_1
       286: aload         4
       288: invokevirtual #365                // Method ext/mods/gameserver/model/pledge/ClanMember.getObjectId:()I
       291: lconst_0
       292: invokevirtual #524                // Method ext/mods/gameserver/model/pledge/Clan.removeClanMember:(IJ)V
       295: goto          265
       298: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       301: astore_3
       302: aload_3
       303: ldc_w         #528                // String DELETE FROM clan_data WHERE clan_id=?
       306: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       311: astore        4
       313: aload         4
       315: iconst_1
       316: aload_1
       317: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       320: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       325: aload         4
       327: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       332: pop
       333: aload         4
       335: ifnull        377
       338: aload         4
       340: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       345: goto          377
       348: astore        5
       350: aload         4
       352: ifnull        374
       355: aload         4
       357: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       362: goto          374
       365: astore        6
       367: aload         5
       369: aload         6
       371: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       374: aload         5
       376: athrow
       377: aload_3
       378: ldc_w         #536                // String DELETE FROM clan_privs WHERE clan_id=?
       381: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       386: astore        4
       388: aload         4
       390: iconst_1
       391: aload_1
       392: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       395: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       400: aload         4
       402: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       407: pop
       408: aload         4
       410: ifnull        452
       413: aload         4
       415: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       420: goto          452
       423: astore        5
       425: aload         4
       427: ifnull        449
       430: aload         4
       432: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       437: goto          449
       440: astore        6
       442: aload         5
       444: aload         6
       446: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       449: aload         5
       451: athrow
       452: aload_3
       453: ldc_w         #538                // String DELETE FROM clan_skills WHERE clan_id=?
       456: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       461: astore        4
       463: aload         4
       465: iconst_1
       466: aload_1
       467: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       470: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       475: aload         4
       477: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       482: pop
       483: aload         4
       485: ifnull        527
       488: aload         4
       490: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       495: goto          527
       498: astore        5
       500: aload         4
       502: ifnull        524
       505: aload         4
       507: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       512: goto          524
       515: astore        6
       517: aload         5
       519: aload         6
       521: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       524: aload         5
       526: athrow
       527: aload_3
       528: ldc_w         #540                // String DELETE FROM clan_subpledges WHERE clan_id=?
       531: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       536: astore        4
       538: aload         4
       540: iconst_1
       541: aload_1
       542: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       545: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       550: aload         4
       552: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       557: pop
       558: aload         4
       560: ifnull        602
       563: aload         4
       565: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       570: goto          602
       573: astore        5
       575: aload         4
       577: ifnull        599
       580: aload         4
       582: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       587: goto          599
       590: astore        6
       592: aload         5
       594: aload         6
       596: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       599: aload         5
       601: athrow
       602: aload_3
       603: ldc_w         #542                // String DELETE FROM clan_wars WHERE clan1=? OR clan2=?
       606: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       611: astore        4
       613: aload         4
       615: iconst_1
       616: aload_1
       617: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       620: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       625: aload         4
       627: iconst_2
       628: aload_1
       629: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       632: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       637: aload         4
       639: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       644: pop
       645: aload         4
       647: ifnull        689
       650: aload         4
       652: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       657: goto          689
       660: astore        5
       662: aload         4
       664: ifnull        686
       667: aload         4
       669: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       674: goto          686
       677: astore        6
       679: aload         5
       681: aload         6
       683: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       686: aload         5
       688: athrow
       689: aload_3
       690: ldc_w         #544                // String DELETE FROM siege_clans WHERE clan_id=?
       693: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       698: astore        4
       700: aload         4
       702: iconst_1
       703: aload_1
       704: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       707: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       712: aload         4
       714: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       719: pop
       720: aload         4
       722: ifnull        764
       725: aload         4
       727: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       732: goto          764
       735: astore        5
       737: aload         4
       739: ifnull        761
       742: aload         4
       744: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       749: goto          761
       752: astore        6
       754: aload         5
       756: aload         6
       758: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       761: aload         5
       763: athrow
       764: aload_1
       765: invokevirtual #546                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
       768: ifeq          846
       771: aload_3
       772: ldc_w         #549                // String UPDATE castle SET currentTaxPercent=0, nextTaxPercent=0 WHERE id=?
       775: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       780: astore        4
       782: aload         4
       784: iconst_1
       785: aload_1
       786: invokevirtual #546                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
       789: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       794: aload         4
       796: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       801: pop
       802: aload         4
       804: ifnull        846
       807: aload         4
       809: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       814: goto          846
       817: astore        5
       819: aload         4
       821: ifnull        843
       824: aload         4
       826: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       831: goto          843
       834: astore        6
       836: aload         5
       838: aload         6
       840: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       843: aload         5
       845: athrow
       846: aload_3
       847: ifnull        886
       850: aload_3
       851: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       856: goto          886
       859: astore        4
       861: aload_3
       862: ifnull        883
       865: aload_3
       866: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       871: goto          883
       874: astore        5
       876: aload         4
       878: aload         5
       880: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       883: aload         4
       885: athrow
       886: goto          900
       889: astore_3
       890: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       893: ldc_w         #551                // String Couldn\'t delete clan.
       896: aload_3
       897: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       900: invokestatic  #346                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       903: aload_1
       904: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       907: invokevirtual #553                // Method ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
       910: aload_0
       911: getfield      #10                 // Field _clans:Ljava/util/Map;
       914: aload_1
       915: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
       918: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       921: invokeinterface #556,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       926: pop
       927: return
      Exception table:
         from    to  target type
           313   333   348   Class java/lang/Throwable
           355   362   365   Class java/lang/Throwable
           388   408   423   Class java/lang/Throwable
           430   437   440   Class java/lang/Throwable
           463   483   498   Class java/lang/Throwable
           505   512   515   Class java/lang/Throwable
           538   558   573   Class java/lang/Throwable
           580   587   590   Class java/lang/Throwable
           613   645   660   Class java/lang/Throwable
           667   674   677   Class java/lang/Throwable
           700   720   735   Class java/lang/Throwable
           742   749   752   Class java/lang/Throwable
           782   802   817   Class java/lang/Throwable
           824   831   834   Class java/lang/Throwable
           302   846   859   Class java/lang/Throwable
           865   871   874   Class java/lang/Throwable
           298   886   889   Class java/lang/Exception
      LineNumberTable:
        line 232: 0
        line 233: 19
        line 235: 20
        line 237: 37
        line 238: 68
        line 240: 95
        line 241: 100
        line 243: 104
        line 244: 136
        line 248: 148
        line 249: 156
        line 250: 171
        line 253: 175
        line 255: 208
        line 257: 227
        line 258: 236
        line 259: 245
        line 261: 248
        line 263: 255
        line 264: 285
        line 266: 298
        line 268: 302
        line 270: 313
        line 271: 325
        line 272: 333
        line 268: 348
        line 274: 377
        line 276: 388
        line 277: 400
        line 278: 408
        line 274: 423
        line 280: 452
        line 282: 463
        line 283: 475
        line 284: 483
        line 280: 498
        line 286: 527
        line 288: 538
        line 289: 550
        line 290: 558
        line 286: 573
        line 292: 602
        line 294: 613
        line 295: 625
        line 296: 637
        line 297: 645
        line 292: 660
        line 299: 689
        line 301: 700
        line 302: 712
        line 303: 720
        line 299: 735
        line 305: 764
        line 307: 771
        line 309: 782
        line 310: 794
        line 311: 802
        line 307: 817
        line 313: 846
        line 266: 859
        line 317: 886
        line 314: 889
        line 316: 890
        line 319: 900
        line 321: 910
        line 322: 927
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      24     3 castle   Lext/mods/gameserver/model/residence/castle/Castle;
          136       6     4    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
          156      19     3  hall   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
          227      18     5 attackerClan   Lext/mods/gameserver/model/pledge/Clan;
          208      37     4 clanId   I
          285      10     4 member   Lext/mods/gameserver/model/pledge/ClanMember;
          313      64     4    ps   Ljava/sql/PreparedStatement;
          388      64     4    ps   Ljava/sql/PreparedStatement;
          463      64     4    ps   Ljava/sql/PreparedStatement;
          538      64     4    ps   Ljava/sql/PreparedStatement;
          613      76     4    ps   Ljava/sql/PreparedStatement;
          700      64     4    ps   Ljava/sql/PreparedStatement;
          782      64     4    ps   Ljava/sql/PreparedStatement;
          302     584     3   con   Ljava/sql/Connection;
          890      10     3     e   Ljava/lang/Exception;
            0     928     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0     928     1  clan   Lext/mods/gameserver/model/pledge/Clan;
          100     828     2 hallId   I
      StackMapTable: number_of_entries = 45
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 45
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 2 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 62
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 57
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class ext/mods/gameserver/model/pledge/Clan, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void scheduleRemoveClan(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: aload_1
         7: invokedynamic #559,  0            // InvokeDynamic #2:run:(Lext/mods/gameserver/data/sql/ClanTable;Lext/mods/gameserver/model/pledge/Clan;)Ljava/lang/Runnable;
        12: aload_1
        13: invokevirtual #167                // Method ext/mods/gameserver/model/pledge/Clan.getDissolvingExpiryTime:()J
        16: invokestatic  #104                // Method java/lang/System.currentTimeMillis:()J
        19: lsub
        20: ldc2_w        #563                // long 60000l
        23: invokestatic  #565                // Method java/lang/Math.max:(JJ)J
        26: invokestatic  #571                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        29: pop
        30: return
      LineNumberTable:
        line 330: 0
        line 331: 4
        line 333: 5
        line 337: 13
        line 333: 26
        line 338: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0      31     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public boolean isAllyExists(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: invokeinterface #242,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #432,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_2
        15: aload_2
        16: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          57
        24: aload_2
        25: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        33: astore_3
        34: aload_3
        35: invokevirtual #577                // Method ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
        38: ifnull        54
        41: aload_3
        42: invokevirtual #577                // Method ext/mods/gameserver/model/pledge/Clan.getAllyName:()Ljava/lang/String;
        45: aload_1
        46: invokevirtual #581                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        49: ifeq          54
        52: iconst_1
        53: ireturn
        54: goto          15
        57: iconst_0
        58: ireturn
      LineNumberTable:
        line 346: 0
        line 348: 34
        line 349: 52
        line 350: 54
        line 351: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      20     3  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      59     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0      59     1 allyName   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 38 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void storeClansWars(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        16: astore_3
        17: aload_0
        18: getfield      #10                 // Field _clans:Ljava/util/Map;
        21: iload_2
        22: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        25: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        33: astore        4
        35: aload_3
        36: iload_2
        37: invokevirtual #584                // Method ext/mods/gameserver/model/pledge/Clan.setEnemyClan:(I)V
        40: aload_3
        41: iconst_2
        42: anewarray     #415                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        45: dup
        46: iconst_0
        47: new           #587                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
        50: dup
        51: aload_3
        52: invokespecial #589                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        55: aastore
        56: dup
        57: iconst_1
        58: getstatic     #591                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_WAR_DECLARED_AGAINST_S1_IF_KILLED_LOSE_LOW_EXP:Lext/mods/gameserver/network/SystemMessageId;
        61: invokestatic  #333                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        64: aload         4
        66: invokevirtual #594                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        69: invokevirtual #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: aastore
        73: invokevirtual #420                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        76: aload         4
        78: iload_1
        79: invokevirtual #597                // Method ext/mods/gameserver/model/pledge/Clan.setAttackerClan:(I)V
        82: aload         4
        84: iconst_2
        85: anewarray     #415                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        88: dup
        89: iconst_0
        90: new           #587                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
        93: dup
        94: aload         4
        96: invokespecial #589                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        99: aastore
       100: dup
       101: iconst_1
       102: getstatic     #600                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_S1_DECLARED_WAR:Lext/mods/gameserver/network/SystemMessageId;
       105: invokestatic  #333                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       108: aload_3
       109: invokevirtual #594                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       112: invokevirtual #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       115: aastore
       116: invokevirtual #420                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       119: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       122: astore        5
       124: aload         5
       126: ldc_w         #603                // String REPLACE INTO clan_wars (clan1, clan2) VALUES(?,?)
       129: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       134: astore        6
       136: aload         6
       138: iconst_1
       139: iload_1
       140: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       145: aload         6
       147: iconst_2
       148: iload_2
       149: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       154: aload         6
       156: invokeinterface #605,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       161: pop
       162: aload         6
       164: ifnull        206
       167: aload         6
       169: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       174: goto          206
       177: astore        7
       179: aload         6
       181: ifnull        203
       184: aload         6
       186: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       191: goto          203
       194: astore        8
       196: aload         7
       198: aload         8
       200: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       203: aload         7
       205: athrow
       206: aload         5
       208: ifnull        250
       211: aload         5
       213: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       218: goto          250
       221: astore        6
       223: aload         5
       225: ifnull        247
       228: aload         5
       230: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       235: goto          247
       238: astore        7
       240: aload         6
       242: aload         7
       244: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       247: aload         6
       249: athrow
       250: goto          266
       253: astore        5
       255: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       258: ldc_w         #608                // String Couldn\'t store clans wars.
       261: aload         5
       263: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       266: return
      Exception table:
         from    to  target type
           136   162   177   Class java/lang/Throwable
           184   191   194   Class java/lang/Throwable
           124   206   221   Class java/lang/Throwable
           228   235   238   Class java/lang/Throwable
           119   250   253   Class java/lang/Exception
      LineNumberTable:
        line 361: 0
        line 362: 17
        line 364: 35
        line 365: 40
        line 367: 76
        line 368: 82
        line 370: 119
        line 371: 124
        line 373: 136
        line 374: 145
        line 375: 154
        line 376: 162
        line 370: 177
        line 376: 206
        line 370: 221
        line 380: 250
        line 377: 253
        line 379: 255
        line 381: 266
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          136      70     6    ps   Ljava/sql/PreparedStatement;
          124     126     5   con   Ljava/sql/Connection;
          255      11     5     e   Ljava/lang/Exception;
            0     267     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0     267     1 clanId1   I
            0     267     2 clanId2   I
           17     250     3 clan1   Lext/mods/gameserver/model/pledge/Clan;
           35     232     4 clan2   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 177
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public void deleteClansWars(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=11, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        16: astore_3
        17: aload_0
        18: getfield      #10                 // Field _clans:Ljava/util/Map;
        21: iload_2
        22: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        25: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        33: astore        4
        35: aload_3
        36: iload_2
        37: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.deleteEnemyClan:(I)V
        40: aload_3
        41: iconst_2
        42: anewarray     #415                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        45: dup
        46: iconst_0
        47: new           #587                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
        50: dup
        51: aload_3
        52: invokespecial #589                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        55: aastore
        56: dup
        57: iconst_1
        58: getstatic     #610                // Field ext/mods/gameserver/network/SystemMessageId.WAR_AGAINST_S1_HAS_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
        61: invokestatic  #333                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        64: aload         4
        66: invokevirtual #594                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        69: invokevirtual #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: aastore
        73: invokevirtual #420                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        76: aload         4
        78: iload_1
        79: invokevirtual #506                // Method ext/mods/gameserver/model/pledge/Clan.deleteAttackerClan:(I)V
        82: aload         4
        84: iconst_2
        85: anewarray     #415                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        88: dup
        89: iconst_0
        90: new           #587                // class ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate
        93: dup
        94: aload         4
        96: invokespecial #589                // Method ext/mods/gameserver/network/serverpackets/PledgeShowInfoUpdate."<init>":(Lext/mods/gameserver/model/pledge/Clan;)V
        99: aastore
       100: dup
       101: iconst_1
       102: getstatic     #613                // Field ext/mods/gameserver/network/SystemMessageId.CLAN_S1_HAS_DECIDED_TO_STOP:Lext/mods/gameserver/network/SystemMessageId;
       105: invokestatic  #333                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       108: aload_3
       109: invokevirtual #594                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       112: invokevirtual #339                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       115: aastore
       116: invokevirtual #420                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       119: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       122: astore        5
       124: getstatic     #616                // Field ext/mods/Config.CLAN_WAR_PENALTY_WHEN_ENDED:I
       127: ifle          246
       130: invokestatic  #104                // Method java/lang/System.currentTimeMillis:()J
       133: getstatic     #616                // Field ext/mods/Config.CLAN_WAR_PENALTY_WHEN_ENDED:I
       136: i2l
       137: ldc2_w        #124                // long 86400000l
       140: lmul
       141: ladd
       142: lstore        6
       144: aload_3
       145: iload_2
       146: lload         6
       148: invokevirtual #619                // Method ext/mods/gameserver/model/pledge/Clan.addWarPenaltyTime:(IJ)V
       151: aload         5
       153: ldc_w         #622                // String UPDATE clan_wars SET expiry_time=? WHERE clan1=? AND clan2=?
       156: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       161: astore        8
       163: aload         8
       165: iconst_1
       166: lload         6
       168: invokeinterface #624,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       173: aload         8
       175: iconst_2
       176: iload_1
       177: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       182: aload         8
       184: iconst_3
       185: iload_2
       186: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       191: aload         8
       193: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       198: pop
       199: aload         8
       201: ifnull        243
       204: aload         8
       206: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       211: goto          243
       214: astore        9
       216: aload         8
       218: ifnull        240
       221: aload         8
       223: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       228: goto          240
       231: astore        10
       233: aload         9
       235: aload         10
       237: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       240: aload         9
       242: athrow
       243: goto          328
       246: aload         5
       248: ldc_w         #627                // String DELETE FROM clan_wars WHERE clan1=? AND clan2=?
       251: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       256: astore        6
       258: aload         6
       260: iconst_1
       261: iload_1
       262: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       267: aload         6
       269: iconst_2
       270: iload_2
       271: invokeinterface #530,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       276: aload         6
       278: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       283: pop
       284: aload         6
       286: ifnull        328
       289: aload         6
       291: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       296: goto          328
       299: astore        7
       301: aload         6
       303: ifnull        325
       306: aload         6
       308: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       313: goto          325
       316: astore        8
       318: aload         7
       320: aload         8
       322: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       325: aload         7
       327: athrow
       328: aload         5
       330: ifnull        372
       333: aload         5
       335: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       340: goto          372
       343: astore        6
       345: aload         5
       347: ifnull        369
       350: aload         5
       352: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       357: goto          369
       360: astore        7
       362: aload         6
       364: aload         7
       366: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       369: aload         6
       371: athrow
       372: goto          388
       375: astore        5
       377: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       380: ldc_w         #629                // String Couldn\'t delete clans wars.
       383: aload         5
       385: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       388: return
      Exception table:
         from    to  target type
           163   199   214   Class java/lang/Throwable
           221   228   231   Class java/lang/Throwable
           258   284   299   Class java/lang/Throwable
           306   313   316   Class java/lang/Throwable
           124   328   343   Class java/lang/Throwable
           350   357   360   Class java/lang/Throwable
           119   372   375   Class java/lang/Exception
      LineNumberTable:
        line 390: 0
        line 391: 17
        line 393: 35
        line 394: 40
        line 396: 76
        line 397: 82
        line 399: 119
        line 401: 124
        line 403: 130
        line 405: 144
        line 407: 151
        line 409: 163
        line 410: 173
        line 411: 182
        line 412: 191
        line 413: 199
        line 407: 214
        line 414: 243
        line 417: 246
        line 419: 258
        line 420: 267
        line 421: 276
        line 422: 284
        line 417: 299
        line 424: 328
        line 399: 343
        line 428: 372
        line 425: 375
        line 427: 377
        line 429: 388
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          163      80     8    ps   Ljava/sql/PreparedStatement;
          144      99     6 penaltyExpiryTime   J
          258      70     6    ps   Ljava/sql/PreparedStatement;
          124     248     5   con   Ljava/sql/Connection;
          377      11     5     e   Ljava/lang/Exception;
            0     389     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0     389     1 clanId1   I
            0     389     2 clanId2   I
           17     372     3 clan1   Lext/mods/gameserver/model/pledge/Clan;
           35     354     4 clan2   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 214
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, long, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, long, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, int, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public void checkSurrender(ext.mods.gameserver.model.pledge.Clan, ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: iconst_0
         1: istore_3
         2: aload_1
         3: invokevirtual #521                // Method ext/mods/gameserver/model/pledge/Clan.getMembers:()Ljava/util/Collection;
         6: invokeinterface #432,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        11: astore        4
        13: aload         4
        15: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          57
        23: aload         4
        25: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #358                // class ext/mods/gameserver/model/pledge/ClanMember
        33: astore        5
        35: aload         5
        37: ifnull        54
        40: aload         5
        42: invokevirtual #631                // Method ext/mods/gameserver/model/pledge/ClanMember.getPlayerInstance:()Lext/mods/gameserver/model/actor/Player;
        45: invokevirtual #635                // Method ext/mods/gameserver/model/actor/Player.wantsPeace:()Z
        48: ifeq          54
        51: iinc          3, 1
        54: goto          13
        57: iload_3
        58: aload_1
        59: invokevirtual #638                // Method ext/mods/gameserver/model/pledge/Clan.getMembersCount:()I
        62: iconst_1
        63: isub
        64: if_icmpne     95
        67: aload_1
        68: aload_2
        69: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        72: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.deleteEnemyClan:(I)V
        75: aload_2
        76: aload_1
        77: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        80: invokevirtual #509                // Method ext/mods/gameserver/model/pledge/Clan.deleteEnemyClan:(I)V
        83: aload_0
        84: aload_1
        85: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        88: aload_2
        89: invokevirtual #391                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        92: invokevirtual #641                // Method deleteClansWars:(II)V
        95: return
      LineNumberTable:
        line 438: 0
        line 439: 2
        line 441: 35
        line 442: 51
        line 443: 54
        line 445: 57
        line 447: 67
        line 448: 75
        line 449: 83
        line 451: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      19     5 player   Lext/mods/gameserver/model/pledge/ClanMember;
            0      96     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0      96     1 clan1   Lext/mods/gameserver/model/pledge/Clan;
            0      96     2 clan2   Lext/mods/gameserver/model/pledge/Clan;
            2      94     3 count   I
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 13
          locals = [ int, class java/util/Iterator ]
        frame_type = 40 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 37 /* same */

  public java.util.List<ext.mods.gameserver.model.pledge.Clan> getClanAllies(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ifne          8
         4: invokestatic  #667                // Method java/util/Collections.emptyList:()Ljava/util/List;
         7: areturn
         8: aload_0
         9: getfield      #10                 // Field _clans:Ljava/util/Map;
        12: invokeinterface #242,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: invokeinterface #250,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        22: iload_1
        23: invokedynamic #672,  0            // InvokeDynamic #5:test:(I)Ljava/util/function/Predicate;
        28: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        33: invokeinterface #675,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        38: areturn
      LineNumberTable:
        line 511: 0
        line 512: 4
        line 514: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0      39     1 allianceId   I
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
    Signature: #798                         // (I)Ljava/util/List<Lext/mods/gameserver/model/pledge/Clan;>;

  public void refreshClansLadder(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: iload_1
         1: ifeq          57
         4: aload_0
         5: getfield      #10                 // Field _clans:Ljava/util/Map;
         8: invokeinterface #242,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        13: invokeinterface #432,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        18: astore_2
        19: aload_2
        20: invokeinterface #436,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          57
        28: aload_2
        29: invokeinterface #441,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        34: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
        37: astore_3
        38: aload_3
        39: ifnull        54
        42: aload_3
        43: invokevirtual #678                // Method ext/mods/gameserver/model/pledge/Clan.getRank:()I
        46: ifeq          54
        49: aload_3
        50: iconst_0
        51: invokevirtual #681                // Method ext/mods/gameserver/model/pledge/Clan.setRank:(I)V
        54: goto          19
        57: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        60: astore_2
        61: aload_2
        62: ldc_w         #684                // String SELECT clan_id FROM clan_data ORDER BY reputation_score DESC LIMIT 99
        65: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        70: astore_3
        71: aload_3
        72: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        77: astore        4
        79: iconst_1
        80: istore        5
        82: aload         4
        84: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        89: ifeq          144
        92: aload_0
        93: getfield      #10                 // Field _clans:Ljava/util/Map;
        96: aload         4
        98: ldc           #42                 // String clan_id
       100: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       105: invokestatic  #55                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       108: invokeinterface #246,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       113: checkcast     #48                 // class ext/mods/gameserver/model/pledge/Clan
       116: astore        6
       118: aload         6
       120: ifnull        141
       123: aload         6
       125: invokevirtual #686                // Method ext/mods/gameserver/model/pledge/Clan.getReputationScore:()I
       128: ifle          141
       131: aload         6
       133: iload         5
       135: iinc          5, 1
       138: invokevirtual #681                // Method ext/mods/gameserver/model/pledge/Clan.setRank:(I)V
       141: goto          82
       144: aload         4
       146: ifnull        188
       149: aload         4
       151: invokeinterface #197,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       156: goto          188
       159: astore        5
       161: aload         4
       163: ifnull        185
       166: aload         4
       168: invokeinterface #197,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       173: goto          185
       176: astore        6
       178: aload         5
       180: aload         6
       182: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       185: aload         5
       187: athrow
       188: aload_3
       189: ifnull        228
       192: aload_3
       193: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       198: goto          228
       201: astore        4
       203: aload_3
       204: ifnull        225
       207: aload_3
       208: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       213: goto          225
       216: astore        5
       218: aload         4
       220: aload         5
       222: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       225: aload         4
       227: athrow
       228: aload_2
       229: ifnull        265
       232: aload_2
       233: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       238: goto          265
       241: astore_3
       242: aload_2
       243: ifnull        263
       246: aload_2
       247: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       252: goto          263
       255: astore        4
       257: aload_3
       258: aload         4
       260: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       263: aload_3
       264: athrow
       265: goto          279
       268: astore_2
       269: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       272: ldc_w         #689                // String Couldn\'t refresh clans ladder.
       275: aload_2
       276: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       279: return
      Exception table:
         from    to  target type
            79   144   159   Class java/lang/Throwable
           166   173   176   Class java/lang/Throwable
            71   188   201   Class java/lang/Throwable
           207   213   216   Class java/lang/Throwable
            61   228   241   Class java/lang/Throwable
           246   252   255   Class java/lang/Throwable
            57   265   268   Class java/lang/Exception
      LineNumberTable:
        line 523: 0
        line 525: 4
        line 526: 38
        line 527: 49
        line 526: 54
        line 530: 57
        line 531: 61
        line 532: 71
        line 534: 79
        line 536: 82
        line 538: 92
        line 539: 118
        line 540: 131
        line 541: 141
        line 542: 144
        line 530: 159
        line 542: 188
        line 530: 201
        line 542: 228
        line 530: 241
        line 546: 265
        line 543: 268
        line 545: 269
        line 547: 279
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      16     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          118      23     6  clan   Lext/mods/gameserver/model/pledge/Clan;
           82      62     5  rank   I
           79     109     4    rs   Ljava/sql/ResultSet;
           71     157     3    ps   Ljava/sql/PreparedStatement;
           61     204     2   con   Ljava/sql/Connection;
          269      10     2     e   Ljava/lang/Exception;
            0     280     0  this   Lext/mods/gameserver/data/sql/ClanTable;
            0     280     1 cleanupRank   Z
      StackMapTable: number_of_entries = 20
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 34 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int ]
          stack = []
        frame_type = 58 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void clearGraduates();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _clans:Ljava/util/Map;
         4: invokeinterface #242,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #691,  0            // InvokeDynamic #6:accept:()Ljava/util/function/Consumer;
        14: invokeinterface #692,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        19: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        22: astore_1
        23: aload_1
        24: ldc_w         #693                // String UPDATE clan_data SET graduates=NULL
        27: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        32: astore_2
        33: aload_2
        34: invokeinterface #533,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        39: pop
        40: aload_2
        41: ifnull        77
        44: aload_2
        45: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        50: goto          77
        53: astore_3
        54: aload_2
        55: ifnull        75
        58: aload_2
        59: invokeinterface #206,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        64: goto          75
        67: astore        4
        69: aload_3
        70: aload         4
        72: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        75: aload_3
        76: athrow
        77: aload_1
        78: ifnull        112
        81: aload_1
        82: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
        87: goto          112
        90: astore_2
        91: aload_1
        92: ifnull        110
        95: aload_1
        96: invokeinterface #207,  1          // InterfaceMethod java/sql/Connection.close:()V
       101: goto          110
       104: astore_3
       105: aload_2
       106: aload_3
       107: invokevirtual #202                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       110: aload_2
       111: athrow
       112: goto          126
       115: astore_1
       116: getstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       119: ldc_w         #695                // String Couldn\'t clear graduates.
       122: aload_1
       123: invokevirtual #216                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       126: return
      Exception table:
         from    to  target type
            33    40    53   Class java/lang/Throwable
            58    64    67   Class java/lang/Throwable
            23    77    90   Class java/lang/Throwable
            95   101   104   Class java/lang/Throwable
            19   112   115   Class java/lang/Exception
      LineNumberTable:
        line 554: 0
        line 556: 19
        line 557: 23
        line 559: 33
        line 560: 40
        line 556: 53
        line 560: 77
        line 556: 90
        line 564: 112
        line 561: 115
        line 563: 116
        line 565: 126
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      44     2    ps   Ljava/sql/PreparedStatement;
           23      89     1   con   Ljava/sql/Connection;
          116      10     1     e   Ljava/lang/Exception;
            0     127     0  this   Lext/mods/gameserver/data/sql/ClanTable;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/sql/ClanTable, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public static ext.mods.gameserver.data.sql.ClanTable getInstance();
    descriptor: ()Lext/mods/gameserver/data/sql/ClanTable;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #697                // Field ext/mods/gameserver/data/sql/ClanTable$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/sql/ClanTable;
         3: areturn
      LineNumberTable:
        line 569: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #217                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/sql/ClanTable
         6: invokevirtual #721                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #724                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #210                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 52: 0
}
SourceFile: "ClanTable.java"
NestMembers:
  ext/mods/gameserver/data/sql/ClanTable$SingletonHolder
BootstrapMethods:
  0: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #821 (Ljava/lang/Object;)Z
      #822 REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$getClanByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/pledge/Clan;)Z
      #825 (Lext/mods/gameserver/model/pledge/Clan;)Z
  1: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #821 (Ljava/lang/Object;)Z
      #826 REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$destroyClan$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
      #825 (Lext/mods/gameserver/model/pledge/Clan;)Z
  2: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #829 ()V
      #830 REF_invokeVirtual ext/mods/gameserver/data/sql/ClanTable.lambda$scheduleRemoveClan$0:(Lext/mods/gameserver/model/pledge/Clan;)V
      #829 ()V
  3: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #821 (Ljava/lang/Object;)Z
      #833 REF_invokeVirtual ext/mods/gameserver/data/sql/ClanTable.lambda$allianceCheck$0:(Lext/mods/gameserver/model/pledge/Clan;)Z
      #825 (Lext/mods/gameserver/model/pledge/Clan;)Z
  4: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 (Ljava/lang/Object;)V
      #838 REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$allianceCheck$1:(Lext/mods/gameserver/model/pledge/Clan;)V
      #841 (Lext/mods/gameserver/model/pledge/Clan;)V
  5: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #821 (Ljava/lang/Object;)Z
      #842 REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$getClanAllies$0:(ILext/mods/gameserver/model/pledge/Clan;)Z
      #825 (Lext/mods/gameserver/model/pledge/Clan;)Z
  6: #848 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #836 (Ljava/lang/Object;)V
      #845 REF_invokeStatic ext/mods/gameserver/data/sql/ClanTable.lambda$clearGraduates$0:(Lext/mods/gameserver/model/pledge/Clan;)V
      #841 (Lext/mods/gameserver/model/pledge/Clan;)V
InnerClasses:
  public static final #861= #857 of #859; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
