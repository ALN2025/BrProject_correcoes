// Bytecode for: ext.mods.gameserver.model.residence.clanhall.Auction
// File: ext\mods\gameserver\model\residence\clanhall\Auction.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/residence/clanhall/Auction.class
  Last modified 9 de jul de 2026; size 13183 bytes
  MD5 checksum 6a3375aa75363b42d34d8814fd01b3b1
  Compiled from "Auction.java"
public class ext.mods.gameserver.model.residence.clanhall.Auction
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/residence/clanhall/Auction
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 13, methods: 20, attributes: 3
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/residence/clanhall/Auction._bidders:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/model/residence/clanhall/Auction
   #12 = NameAndType        #14:#15       // _bidders:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/model/residence/clanhall/Auction
   #14 = Utf8               _bidders
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/residence/clanhall/Auction._ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #17 = NameAndType        #18:#19       // _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #18 = Utf8               _ch
   #19 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/model/residence/clanhall/Auction._endDate:J
   #21 = NameAndType        #22:#23       // _endDate:J
   #22 = Utf8               _endDate
   #23 = Utf8               J
   #24 = Class              #25           // java/lang/String
   #25 = Utf8               java/lang/String
   #26 = Methodref          #27.#28       // ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
   #27 = Class              #29           // ext/mods/commons/lang/StringUtil
   #28 = NameAndType        #30:#31       // isEmpty:([Ljava/lang/String;)Z
   #29 = Utf8               ext/mods/commons/lang/StringUtil
   #30 = Utf8               isEmpty
   #31 = Utf8               ([Ljava/lang/String;)Z
   #32 = Class              #33           // ext/mods/gameserver/model/residence/clanhall/Seller
   #33 = Utf8               ext/mods/gameserver/model/residence/clanhall/Seller
   #34 = Methodref          #32.#35       // ext/mods/gameserver/model/residence/clanhall/Seller."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #35 = NameAndType        #5:#36        // "<init>":(Ljava/lang/String;Ljava/lang/String;I)V
   #36 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)V
   #37 = Fieldref           #11.#38       // ext/mods/gameserver/model/residence/clanhall/Auction._seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
   #38 = NameAndType        #39:#40       // _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
   #39 = Utf8               _seller
   #40 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Seller;
   #41 = Methodref          #42.#43       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #42 = Class              #44           // ext/mods/commons/pool/ConnectionPool
   #43 = NameAndType        #45:#46       // getConnection:()Ljava/sql/Connection;
   #44 = Utf8               ext/mods/commons/pool/ConnectionPool
   #45 = Utf8               getConnection
   #46 = Utf8               ()Ljava/sql/Connection;
   #47 = String             #48           // SELECT bidder_name, clan_oid, clan_name, max_bid, time_bid FROM auctions WHERE clanhall_id = ? ORDER BY max_bid DESC
   #48 = Utf8               SELECT bidder_name, clan_oid, clan_name, max_bid, time_bid FROM auctions WHERE clanhall_id = ? ORDER BY max_bid DESC
   #49 = InterfaceMethodref #50.#51       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #50 = Class              #52           // java/sql/Connection
   #51 = NameAndType        #53:#54       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #52 = Utf8               java/sql/Connection
   #53 = Utf8               prepareStatement
   #54 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
   #56 = Class              #58           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #57 = NameAndType        #59:#60       // getId:()I
   #58 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #59 = Utf8               getId
   #60 = Utf8               ()I
   #61 = InterfaceMethodref #62.#63       // java/sql/PreparedStatement.setInt:(II)V
   #62 = Class              #64           // java/sql/PreparedStatement
   #63 = NameAndType        #65:#66       // setInt:(II)V
   #64 = Utf8               java/sql/PreparedStatement
   #65 = Utf8               setInt
   #66 = Utf8               (II)V
   #67 = InterfaceMethodref #62.#68       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #68 = NameAndType        #69:#70       // executeQuery:()Ljava/sql/ResultSet;
   #69 = Utf8               executeQuery
   #70 = Utf8               ()Ljava/sql/ResultSet;
   #71 = InterfaceMethodref #72.#73       // java/sql/ResultSet.next:()Z
   #72 = Class              #74           // java/sql/ResultSet
   #73 = NameAndType        #75:#76       // next:()Z
   #74 = Utf8               java/sql/ResultSet
   #75 = Utf8               next
   #76 = Utf8               ()Z
   #77 = Class              #78           // ext/mods/gameserver/model/residence/clanhall/Bidder
   #78 = Utf8               ext/mods/gameserver/model/residence/clanhall/Bidder
   #79 = String             #80           // bidder_name
   #80 = Utf8               bidder_name
   #81 = InterfaceMethodref #72.#82       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #82 = NameAndType        #83:#84       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #83 = Utf8               getString
   #84 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #85 = String             #86           // clan_name
   #86 = Utf8               clan_name
   #87 = String             #88           // max_bid
   #88 = Utf8               max_bid
   #89 = InterfaceMethodref #72.#90       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #90 = NameAndType        #91:#92       // getInt:(Ljava/lang/String;)I
   #91 = Utf8               getInt
   #92 = Utf8               (Ljava/lang/String;)I
   #93 = String             #94           // time_bid
   #94 = Utf8               time_bid
   #95 = InterfaceMethodref #72.#96       // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #96 = NameAndType        #97:#98       // getLong:(Ljava/lang/String;)J
   #97 = Utf8               getLong
   #98 = Utf8               (Ljava/lang/String;)J
   #99 = Methodref          #77.#100      // ext/mods/gameserver/model/residence/clanhall/Bidder."<init>":(Ljava/lang/String;Ljava/lang/String;IJ)V
  #100 = NameAndType        #5:#101       // "<init>":(Ljava/lang/String;Ljava/lang/String;IJ)V
  #101 = Utf8               (Ljava/lang/String;Ljava/lang/String;IJ)V
  #102 = InterfaceMethodref #72.#103      // java/sql/ResultSet.isFirst:()Z
  #103 = NameAndType        #104:#76      // isFirst:()Z
  #104 = Utf8               isFirst
  #105 = Fieldref           #11.#106      // ext/mods/gameserver/model/residence/clanhall/Auction._highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #106 = NameAndType        #107:#108     // _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #107 = Utf8               _highestBidder
  #108 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #109 = String             #110          // clan_oid
  #110 = Utf8               clan_oid
  #111 = Methodref          #112.#113     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #112 = Class              #114          // java/lang/Integer
  #113 = NameAndType        #115:#116     // valueOf:(I)Ljava/lang/Integer;
  #114 = Utf8               java/lang/Integer
  #115 = Utf8               valueOf
  #116 = Utf8               (I)Ljava/lang/Integer;
  #117 = InterfaceMethodref #118.#119     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = Class              #120          // java/util/Map
  #119 = NameAndType        #121:#122     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #120 = Utf8               java/util/Map
  #121 = Utf8               put
  #122 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #123 = InterfaceMethodref #72.#124      // java/sql/ResultSet.close:()V
  #124 = NameAndType        #125:#6       // close:()V
  #125 = Utf8               close
  #126 = Class              #127          // java/lang/Throwable
  #127 = Utf8               java/lang/Throwable
  #128 = Methodref          #126.#129     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #129 = NameAndType        #130:#131     // addSuppressed:(Ljava/lang/Throwable;)V
  #130 = Utf8               addSuppressed
  #131 = Utf8               (Ljava/lang/Throwable;)V
  #132 = InterfaceMethodref #62.#124      // java/sql/PreparedStatement.close:()V
  #133 = InterfaceMethodref #50.#124      // java/sql/Connection.close:()V
  #134 = Class              #135          // java/lang/Exception
  #135 = Utf8               java/lang/Exception
  #136 = Fieldref           #11.#137      // ext/mods/gameserver/model/residence/clanhall/Auction.LOGGER:Lext/mods/commons/logging/CLogger;
  #137 = NameAndType        #138:#139     // LOGGER:Lext/mods/commons/logging/CLogger;
  #138 = Utf8               LOGGER
  #139 = Utf8               Lext/mods/commons/logging/CLogger;
  #140 = String             #141          // Couldn\'t load Auction bid.
  #141 = Utf8               Couldn\'t load Auction bid.
  #142 = Methodref          #143.#144     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #143 = Class              #145          // ext/mods/commons/logging/CLogger
  #144 = NameAndType        #146:#147     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #145 = Utf8               ext/mods/commons/logging/CLogger
  #146 = Utf8               error
  #147 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #148 = Methodref          #11.#149      // ext/mods/gameserver/model/residence/clanhall/Auction.startAutoTask:()V
  #149 = NameAndType        #150:#6       // startAutoTask:()V
  #150 = Utf8               startAutoTask
  #151 = Methodref          #152.#153     // java/lang/System.currentTimeMillis:()J
  #152 = Class              #154          // java/lang/System
  #153 = NameAndType        #155:#156     // currentTimeMillis:()J
  #154 = Utf8               java/lang/System
  #155 = Utf8               currentTimeMillis
  #156 = Utf8               ()J
  #157 = Methodref          #158.#159     // ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
  #158 = Class              #160          // ext/mods/gameserver/model/pledge/Clan
  #159 = NameAndType        #161:#162     // getLeaderName:()Ljava/lang/String;
  #160 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #161 = Utf8               getLeaderName
  #162 = Utf8               ()Ljava/lang/String;
  #163 = Methodref          #158.#164     // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #164 = NameAndType        #165:#162     // getName:()Ljava/lang/String;
  #165 = Utf8               getName
  #166 = Long               604800000l
  #168 = String             #169          // UPDATE clanhall SET endDate = ? WHERE id = ?
  #169 = Utf8               UPDATE clanhall SET endDate = ? WHERE id = ?
  #170 = InterfaceMethodref #62.#171      // java/sql/PreparedStatement.setLong:(IJ)V
  #171 = NameAndType        #172:#173     // setLong:(IJ)V
  #172 = Utf8               setLong
  #173 = Utf8               (IJ)V
  #174 = InterfaceMethodref #62.#175      // java/sql/PreparedStatement.execute:()Z
  #175 = NameAndType        #176:#76      // execute:()Z
  #176 = Utf8               execute
  #177 = String             #178          // Couldn\'t save Auction date.
  #178 = Utf8               Couldn\'t save Auction date.
  #179 = InvokeDynamic      #0:#180       // #0:run:(Lext/mods/gameserver/model/residence/clanhall/Auction;)Ljava/lang/Runnable;
  #180 = NameAndType        #181:#182     // run:(Lext/mods/gameserver/model/residence/clanhall/Auction;)Ljava/lang/Runnable;
  #181 = Utf8               run
  #182 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/Auction;)Ljava/lang/Runnable;
  #183 = Methodref          #184.#185     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #184 = Class              #186          // ext/mods/commons/pool/ThreadPool
  #185 = NameAndType        #187:#188     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #186 = Utf8               ext/mods/commons/pool/ThreadPool
  #187 = Utf8               schedule
  #188 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #189 = Fieldref           #11.#190      // ext/mods/gameserver/model/residence/clanhall/Auction._task:Ljava/util/concurrent/Future;
  #190 = NameAndType        #191:#192     // _task:Ljava/util/concurrent/Future;
  #191 = Utf8               _task
  #192 = Utf8               Ljava/util/concurrent/Future;
  #193 = Methodref          #194.#195     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #194 = Class              #196          // ext/mods/gameserver/model/actor/Player
  #195 = NameAndType        #197:#198     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #196 = Utf8               ext/mods/gameserver/model/actor/Player
  #197 = Utf8               getClan
  #198 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #199 = Methodref          #11.#200      // ext/mods/gameserver/model/residence/clanhall/Auction.getMinimumBid:()I
  #200 = NameAndType        #201:#60      // getMinimumBid:()I
  #201 = Utf8               getMinimumBid
  #202 = Fieldref           #203.#204     // ext/mods/gameserver/network/SystemMessageId.BID_PRICE_MUST_BE_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
  #203 = Class              #205          // ext/mods/gameserver/network/SystemMessageId
  #204 = NameAndType        #206:#207     // BID_PRICE_MUST_BE_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
  #205 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #206 = Utf8               BID_PRICE_MUST_BE_HIGHER
  #207 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #208 = Methodref          #194.#209     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #209 = NameAndType        #210:#211     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #210 = Utf8               sendPacket
  #211 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #212 = Methodref          #194.#213     // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #213 = NameAndType        #214:#60      // getClanId:()I
  #214 = Utf8               getClanId
  #215 = InterfaceMethodref #118.#216     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #216 = NameAndType        #217:#218     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #217 = Utf8               get
  #218 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #219 = Methodref          #77.#220      // ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
  #220 = NameAndType        #221:#60      // getBid:()I
  #221 = Utf8               getBid
  #222 = Methodref          #11.#223      // ext/mods/gameserver/model/residence/clanhall/Auction.takeItem:(Lext/mods/gameserver/model/actor/Player;I)Z
  #223 = NameAndType        #224:#225     // takeItem:(Lext/mods/gameserver/model/actor/Player;I)Z
  #224 = Utf8               takeItem
  #225 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #226 = Methodref          #77.#227      // ext/mods/gameserver/model/residence/clanhall/Bidder.setBid:(I)V
  #227 = NameAndType        #228:#229     // setBid:(I)V
  #228 = Utf8               setBid
  #229 = Utf8               (I)V
  #230 = Methodref          #77.#231      // ext/mods/gameserver/model/residence/clanhall/Bidder.setTime:(J)V
  #231 = NameAndType        #232:#233     // setTime:(J)V
  #232 = Utf8               setTime
  #233 = Utf8               (J)V
  #234 = Methodref          #11.#235      // ext/mods/gameserver/model/residence/clanhall/Auction.recalculateHighestBidder:()V
  #235 = NameAndType        #236:#6       // recalculateHighestBidder:()V
  #236 = Utf8               recalculateHighestBidder
  #237 = Fieldref           #203.#238     // ext/mods/gameserver/network/SystemMessageId.BID_IN_CLANHALL_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
  #238 = NameAndType        #239:#207     // BID_IN_CLANHALL_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
  #239 = Utf8               BID_IN_CLANHALL_AUCTION
  #240 = Methodref          #158.#241     // ext/mods/gameserver/model/pledge/Clan.setAuctionBiddedAt:(I)V
  #241 = NameAndType        #242:#229     // setAuctionBiddedAt:(I)V
  #242 = Utf8               setAuctionBiddedAt
  #243 = String             #244          // INSERT INTO auctions (clanhall_id, bidder_name, clan_oid, clan_name, max_bid, time_bid) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE bidder_name = VALUES(bidder_name), max_bid = VALUES(max_bid), time_bid = VALUES(time_bid)
  #244 = Utf8               INSERT INTO auctions (clanhall_id, bidder_name, clan_oid, clan_name, max_bid, time_bid) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE bidder_name = VALUES(bidder_name), max_bid = VALUES(max_bid), time_bid = VALUES(time_bid)
  #245 = Methodref          #194.#164     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #246 = InterfaceMethodref #62.#247      // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #247 = NameAndType        #248:#249     // setString:(ILjava/lang/String;)V
  #248 = Utf8               setString
  #249 = Utf8               (ILjava/lang/String;)V
  #250 = String             #251          // Couldn\'t update Auction.
  #251 = Utf8               Couldn\'t update Auction.
  #252 = Double             0.9d
  #254 = Integer            2147483647
  #255 = Methodref          #158.#256     // ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #256 = NameAndType        #257:#258     // getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #257 = Utf8               getWarehouse
  #258 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #259 = Methodref          #260.#261     // ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
  #260 = Class              #262          // ext/mods/gameserver/model/itemcontainer/ItemContainer
  #261 = NameAndType        #263:#60      // getAdena:()I
  #262 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
  #263 = Utf8               getAdena
  #264 = Methodref          #265.#266     // java/lang/Math.min:(II)I
  #265 = Class              #267          // java/lang/Math
  #266 = NameAndType        #268:#269     // min:(II)I
  #267 = Utf8               java/lang/Math
  #268 = Utf8               min
  #269 = Utf8               (II)I
  #270 = Methodref          #260.#271     // ext/mods/gameserver/model/itemcontainer/ItemContainer.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #271 = NameAndType        #272:#273     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #272 = Utf8               addItem
  #273 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #274 = Fieldref           #203.#275     // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ADENA_IN_CWH:Lext/mods/gameserver/network/SystemMessageId;
  #275 = NameAndType        #276:#207     // NOT_ENOUGH_ADENA_IN_CWH:Lext/mods/gameserver/network/SystemMessageId;
  #276 = Utf8               NOT_ENOUGH_ADENA_IN_CWH
  #277 = Methodref          #260.#278     // ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #278 = NameAndType        #279:#273     // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #279 = Utf8               destroyItemByItemId
  #280 = String             #281          // DELETE FROM auctions WHERE clanhall_id = ?
  #281 = Utf8               DELETE FROM auctions WHERE clanhall_id = ?
  #282 = String             #283          // Couldn\'t remove Auction bids.
  #283 = Utf8               Couldn\'t remove Auction bids.
  #284 = InterfaceMethodref #118.#285     // java/util/Map.values:()Ljava/util/Collection;
  #285 = NameAndType        #286:#287     // values:()Ljava/util/Collection;
  #286 = Utf8               values
  #287 = Utf8               ()Ljava/util/Collection;
  #288 = InterfaceMethodref #289.#290     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #289 = Class              #291          // java/util/Collection
  #290 = NameAndType        #292:#293     // iterator:()Ljava/util/Iterator;
  #291 = Utf8               java/util/Collection
  #292 = Utf8               iterator
  #293 = Utf8               ()Ljava/util/Iterator;
  #294 = InterfaceMethodref #295.#296     // java/util/Iterator.hasNext:()Z
  #295 = Class              #297          // java/util/Iterator
  #296 = NameAndType        #298:#76      // hasNext:()Z
  #297 = Utf8               java/util/Iterator
  #298 = Utf8               hasNext
  #299 = InterfaceMethodref #295.#300     // java/util/Iterator.next:()Ljava/lang/Object;
  #300 = NameAndType        #75:#301      // next:()Ljava/lang/Object;
  #301 = Utf8               ()Ljava/lang/Object;
  #302 = Methodref          #77.#195      // ext/mods/gameserver/model/residence/clanhall/Bidder.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #303 = Methodref          #11.#304      // ext/mods/gameserver/model/residence/clanhall/Auction.returnItem:(Lext/mods/gameserver/model/pledge/Clan;IZ)V
  #304 = NameAndType        #305:#306     // returnItem:(Lext/mods/gameserver/model/pledge/Clan;IZ)V
  #305 = Utf8               returnItem
  #306 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;IZ)V
  #307 = Class              #308          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #308 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #309 = Fieldref           #203.#310     // ext/mods/gameserver/network/SystemMessageId.CLANHALL_AWARDED_TO_CLAN_S1:Lext/mods/gameserver/network/SystemMessageId;
  #310 = NameAndType        #311:#207     // CLANHALL_AWARDED_TO_CLAN_S1:Lext/mods/gameserver/network/SystemMessageId;
  #311 = Utf8               CLANHALL_AWARDED_TO_CLAN_S1
  #312 = Methodref          #313.#314     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #313 = Class              #315          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #314 = NameAndType        #316:#317     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #315 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #316 = Utf8               getSystemMessage
  #317 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #318 = Methodref          #313.#319     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #319 = NameAndType        #320:#321     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #320 = Utf8               addString
  #321 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #322 = Methodref          #158.#323     // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #323 = NameAndType        #324:#325     // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #324 = Utf8               broadcastToMembers
  #325 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #326 = InterfaceMethodref #118.#327     // java/util/Map.clear:()V
  #327 = NameAndType        #328:#6       // clear:()V
  #328 = Utf8               clear
  #329 = InterfaceMethodref #330.#331     // java/util/concurrent/Future.cancel:(Z)Z
  #330 = Class              #332          // java/util/concurrent/Future
  #331 = NameAndType        #333:#334     // cancel:(Z)Z
  #332 = Utf8               java/util/concurrent/Future
  #333 = Utf8               cancel
  #334 = Utf8               (Z)Z
  #335 = Methodref          #32.#195      // ext/mods/gameserver/model/residence/clanhall/Seller.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #336 = Fieldref           #203.#337     // ext/mods/gameserver/network/SystemMessageId.CLANHALL_NOT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
  #337 = NameAndType        #338:#207     // CLANHALL_NOT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
  #338 = Utf8               CLANHALL_NOT_SOLD
  #339 = Methodref          #56.#340      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
  #340 = NameAndType        #341:#60      // getLease:()I
  #341 = Utf8               getLease
  #342 = Methodref          #56.#343      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #343 = NameAndType        #344:#345     // setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
  #344 = Utf8               setOwner
  #345 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)V
  #346 = Methodref          #158.#213     // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #347 = InterfaceMethodref #118.#348     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #348 = NameAndType        #349:#218     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #349 = Utf8               remove
  #350 = String             #351          // DELETE FROM auctions WHERE clanhall_id = ? AND clan_oid = ?
  #351 = Utf8               DELETE FROM auctions WHERE clanhall_id = ? AND clan_oid = ?
  #352 = String             #353          // Couldn\'t cancel Auction bid.
  #353 = Utf8               Couldn\'t cancel Auction bid.
  #354 = Methodref          #11.#355      // ext/mods/gameserver/model/residence/clanhall/Auction.removeBids:(Lext/mods/gameserver/model/pledge/Clan;)V
  #355 = NameAndType        #356:#345     // removeBids:(Lext/mods/gameserver/model/pledge/Clan;)V
  #356 = Utf8               removeBids
  #357 = Methodref          #11.#358      // ext/mods/gameserver/model/residence/clanhall/Auction.reset:(Z)V
  #358 = NameAndType        #359:#360     // reset:(Z)V
  #359 = Utf8               reset
  #360 = Utf8               (Z)V
  #361 = Methodref          #56.#362      // ext/mods/gameserver/model/residence/clanhall/ClanHall.updateDb:()V
  #362 = NameAndType        #363:#6       // updateDb:()V
  #363 = Utf8               updateDb
  #364 = String             #365          // UPDATE clanhall SET sellerBid = ?, sellerName = ?, sellerClanName = ?, endDate = ? WHERE id = ?
  #365 = Utf8               UPDATE clanhall SET sellerBid = ?, sellerName = ?, sellerClanName = ?, endDate = ? WHERE id = ?
  #366 = Methodref          #32.#220      // ext/mods/gameserver/model/residence/clanhall/Seller.getBid:()I
  #367 = Methodref          #32.#164      // ext/mods/gameserver/model/residence/clanhall/Seller.getName:()Ljava/lang/String;
  #368 = Methodref          #32.#369      // ext/mods/gameserver/model/residence/clanhall/Seller.getClanName:()Ljava/lang/String;
  #369 = NameAndType        #370:#162     // getClanName:()Ljava/lang/String;
  #370 = Utf8               getClanName
  #371 = String             #372          // Couldn\'t confirm Auction.
  #372 = Utf8               Couldn\'t confirm Auction.
  #373 = Methodref          #56.#374      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
  #374 = NameAndType        #375:#60      // getAuctionMin:()I
  #375 = Utf8               getAuctionMin
  #376 = Methodref          #265.#377     // java/lang/Math.max:(II)I
  #377 = NameAndType        #378:#269     // max:(II)I
  #378 = Utf8               max
  #379 = Methodref          #380.#164     // java/lang/Class.getName:()Ljava/lang/String;
  #380 = Class              #381          // java/lang/Class
  #381 = Utf8               java/lang/Class
  #382 = Methodref          #143.#383     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #383 = NameAndType        #5:#384       // "<init>":(Ljava/lang/String;)V
  #384 = Utf8               (Ljava/lang/String;)V
  #385 = Utf8               LOAD_BIDDERS
  #386 = Utf8               Ljava/lang/String;
  #387 = Utf8               ConstantValue
  #388 = Utf8               UPDATE_DATE
  #389 = Utf8               INSERT_OR_UPDATE_BIDDER
  #390 = Utf8               DELETE_BIDDERS
  #391 = Utf8               DELETE_BIDDER
  #392 = Utf8               UPDATE_SELLER
  #393 = Utf8               Signature
  #394 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/clanhall/Bidder;>;
  #395 = Utf8               Ljava/util/concurrent/Future<*>;
  #396 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;ILjava/lang/String;Ljava/lang/String;J)V
  #397 = Utf8               Code
  #398 = Utf8               LineNumberTable
  #399 = Utf8               LocalVariableTable
  #400 = Utf8               bidder
  #401 = Utf8               rs
  #402 = Utf8               Ljava/sql/ResultSet;
  #403 = Utf8               ps
  #404 = Utf8               Ljava/sql/PreparedStatement;
  #405 = Utf8               con
  #406 = Utf8               Ljava/sql/Connection;
  #407 = Utf8               e
  #408 = Utf8               Ljava/lang/Exception;
  #409 = Utf8               this
  #410 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Auction;
  #411 = Utf8               ch
  #412 = Utf8               sellerBid
  #413 = Utf8               I
  #414 = Utf8               sellerName
  #415 = Utf8               sellerClanName
  #416 = Utf8               endDate
  #417 = Utf8               StackMapTable
  #418 = Utf8               getEndDate
  #419 = Utf8               setEndDate
  #420 = Utf8               getHighestBidder
  #421 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Bidder;
  #422 = Utf8               getSeller
  #423 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #424 = Utf8               setSeller
  #425 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;I)V
  #426 = Utf8               clan
  #427 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #428 = Utf8               bid
  #429 = Utf8               getBidders
  #430 = Utf8               ()Ljava/util/Map;
  #431 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/clanhall/Bidder;>;
  #432 = Utf8               currentTime
  #433 = Utf8               taskDelay
  #434 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #435 = Utf8               player
  #436 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #437 = Utf8               requiredAdena
  #438 = Utf8               time
  #439 = Utf8               quantity
  #440 = Utf8               penalty
  #441 = Utf8               Z
  #442 = Utf8               limit
  #443 = Utf8               newOwner
  #444 = Utf8               endAuction
  #445 = Utf8               owner
  #446 = Utf8               cancelBid
  #447 = Utf8               cancelAuction
  #448 = Utf8               confirmAuction
  #449 = Utf8               highestBidder
  #450 = Utf8               highestBid
  #451 = Utf8               runTask
  #452 = Utf8               <clinit>
  #453 = Utf8               SourceFile
  #454 = Utf8               Auction.java
  #455 = Utf8               BootstrapMethods
  #456 = MethodType         #6            //  ()V
  #457 = MethodHandle       5:#458        // REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/Auction.endAuction:()V
  #458 = Methodref          #11.#459      // ext/mods/gameserver/model/residence/clanhall/Auction.endAuction:()V
  #459 = NameAndType        #444:#6       // endAuction:()V
  #460 = MethodHandle       6:#461        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #461 = Methodref          #462.#463     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #462 = Class              #464          // java/lang/invoke/LambdaMetafactory
  #463 = NameAndType        #465:#466     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #464 = Utf8               java/lang/invoke/LambdaMetafactory
  #465 = Utf8               metafactory
  #466 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #467 = Utf8               InnerClasses
  #468 = Class              #469          // java/lang/invoke/MethodHandles$Lookup
  #469 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #470 = Class              #471          // java/lang/invoke/MethodHandles
  #471 = Utf8               java/lang/invoke/MethodHandles
  #472 = Utf8               Lookup
{
  public ext.mods.gameserver.model.residence.clanhall.Auction(ext.mods.gameserver.model.residence.clanhall.ClanHall, int, java.lang.String, java.lang.String, long);
    descriptor: (Lext/mods/gameserver/model/residence/clanhall/ClanHall;ILjava/lang/String;Ljava/lang/String;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=12, args_size=6
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _bidders:Ljava/util/Map;
        15: aload_0
        16: aload_1
        17: putfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        20: aload_0
        21: lload         5
        23: putfield      #20                 // Field _endDate:J
        26: iconst_2
        27: anewarray     #24                 // class java/lang/String
        30: dup
        31: iconst_0
        32: aload_3
        33: aastore
        34: dup
        35: iconst_1
        36: aload         4
        38: aastore
        39: invokestatic  #26                 // Method ext/mods/commons/lang/StringUtil.isEmpty:([Ljava/lang/String;)Z
        42: ifne          60
        45: aload_0
        46: new           #32                 // class ext/mods/gameserver/model/residence/clanhall/Seller
        49: dup
        50: aload_3
        51: aload         4
        53: iload_2
        54: invokespecial #34                 // Method ext/mods/gameserver/model/residence/clanhall/Seller."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
        57: putfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        60: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        63: astore        7
        65: aload         7
        67: ldc           #47                 // String SELECT bidder_name, clan_oid, clan_name, max_bid, time_bid FROM auctions WHERE clanhall_id = ? ORDER BY max_bid DESC
        69: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        74: astore        8
        76: aload         8
        78: iconst_1
        79: aload_1
        80: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        83: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        88: aload         8
        90: invokeinterface #67,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        95: astore        9
        97: aload         9
        99: invokeinterface #71,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       104: ifeq          195
       107: new           #77                 // class ext/mods/gameserver/model/residence/clanhall/Bidder
       110: dup
       111: aload         9
       113: ldc           #79                 // String bidder_name
       115: invokeinterface #81,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       120: aload         9
       122: ldc           #85                 // String clan_name
       124: invokeinterface #81,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       129: aload         9
       131: ldc           #87                 // String max_bid
       133: invokeinterface #89,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       138: aload         9
       140: ldc           #93                 // String time_bid
       142: invokeinterface #95,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       147: invokespecial #99                 // Method ext/mods/gameserver/model/residence/clanhall/Bidder."<init>":(Ljava/lang/String;Ljava/lang/String;IJ)V
       150: astore        10
       152: aload         9
       154: invokeinterface #102,  1          // InterfaceMethod java/sql/ResultSet.isFirst:()Z
       159: ifeq          168
       162: aload_0
       163: aload         10
       165: putfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
       168: aload_0
       169: getfield      #10                 // Field _bidders:Ljava/util/Map;
       172: aload         9
       174: ldc           #109                // String clan_oid
       176: invokeinterface #89,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       181: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       184: aload         10
       186: invokeinterface #117,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       191: pop
       192: goto          97
       195: aload         9
       197: ifnull        239
       200: aload         9
       202: invokeinterface #123,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       207: goto          239
       210: astore        10
       212: aload         9
       214: ifnull        236
       217: aload         9
       219: invokeinterface #123,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       224: goto          236
       227: astore        11
       229: aload         10
       231: aload         11
       233: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       236: aload         10
       238: athrow
       239: aload         8
       241: ifnull        283
       244: aload         8
       246: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       251: goto          283
       254: astore        9
       256: aload         8
       258: ifnull        280
       261: aload         8
       263: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       268: goto          280
       271: astore        10
       273: aload         9
       275: aload         10
       277: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       280: aload         9
       282: athrow
       283: aload         7
       285: ifnull        327
       288: aload         7
       290: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       295: goto          327
       298: astore        8
       300: aload         7
       302: ifnull        324
       305: aload         7
       307: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       312: goto          324
       315: astore        9
       317: aload         8
       319: aload         9
       321: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       324: aload         8
       326: athrow
       327: goto          342
       330: astore        7
       332: getstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       335: ldc           #140                // String Couldn\'t load Auction bid.
       337: aload         7
       339: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       342: aload_0
       343: invokevirtual #148                // Method startAutoTask:()V
       346: return
      Exception table:
         from    to  target type
            97   195   210   Class java/lang/Throwable
           217   224   227   Class java/lang/Throwable
            76   239   254   Class java/lang/Throwable
           261   268   271   Class java/lang/Throwable
            65   283   298   Class java/lang/Throwable
           305   312   315   Class java/lang/Throwable
            60   327   330   Class java/lang/Exception
      LineNumberTable:
        line 88: 0
        line 77: 4
        line 89: 15
        line 90: 20
        line 92: 26
        line 93: 45
        line 95: 60
        line 96: 65
        line 98: 76
        line 100: 88
        line 102: 97
        line 104: 107
        line 106: 152
        line 107: 162
        line 109: 168
        line 110: 192
        line 111: 195
        line 100: 210
        line 112: 239
        line 95: 254
        line 112: 283
        line 95: 298
        line 116: 327
        line 113: 330
        line 115: 332
        line 118: 342
        line 119: 346
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          152      40    10 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
           97     142     9    rs   Ljava/sql/ResultSet;
           76     207     8    ps   Ljava/sql/PreparedStatement;
           65     262     7   con   Ljava/sql/Connection;
          332      10     7     e   Ljava/lang/Exception;
            0     347     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0     347     1    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0     347     2 sellerBid   I
            0     347     3 sellerName   Ljava/lang/String;
            0     347     4 sellerClanName   Ljava/lang/String;
            0     347     5 endDate   J
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int, class java/lang/String, class java/lang/String, long ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 36
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Bidder ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int, class java/lang/String, class java/lang/String, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int, class java/lang/String, class java/lang/String, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/residence/clanhall/ClanHall, int, class java/lang/String, class java/lang/String, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public final long getEndDate();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _endDate:J
         4: lreturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;

  public final void setEndDate(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokestatic  #151                // Method java/lang/System.currentTimeMillis:()J
         4: lload_1
         5: ladd
         6: putfield      #20                 // Field _endDate:J
         9: return
      LineNumberTable:
        line 128: 0
        line 129: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0      10     1 endDate   J

  public final ext.mods.gameserver.model.residence.clanhall.Bidder getHighestBidder();
    descriptor: ()Lext/mods/gameserver/model/residence/clanhall/Bidder;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
         4: areturn
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;

  public final ext.mods.gameserver.model.residence.clanhall.Seller getSeller();
    descriptor: ()Lext/mods/gameserver/model/residence/clanhall/Seller;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
         4: areturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;

  public final void setSeller(ext.mods.gameserver.model.pledge.Clan, int);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: new           #32                 // class ext/mods/gameserver/model/residence/clanhall/Seller
         9: dup
        10: aload_1
        11: invokevirtual #157                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
        14: aload_1
        15: invokevirtual #163                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        18: iload_2
        19: invokespecial #34                 // Method ext/mods/gameserver/model/residence/clanhall/Seller."<init>":(Ljava/lang/String;Ljava/lang/String;I)V
        22: putfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        25: return
      LineNumberTable:
        line 143: 0
        line 144: 4
        line 146: 5
        line 147: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0      26     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0      26     2   bid   I
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.model.residence.clanhall.Bidder> getBidders();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _bidders:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
    Signature: #431                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/clanhall/Bidder;>;

  public void startAutoTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=1
         0: invokestatic  #151                // Method java/lang/System.currentTimeMillis:()J
         3: lstore_1
         4: lconst_0
         5: lstore_3
         6: aload_0
         7: getfield      #20                 // Field _endDate:J
        10: lload_1
        11: lcmp
        12: ifgt          181
        15: aload_0
        16: lload_1
        17: ldc2_w        #166                // long 604800000l
        20: ladd
        21: putfield      #20                 // Field _endDate:J
        24: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        27: astore        5
        29: aload         5
        31: ldc           #168                // String UPDATE clanhall SET endDate = ? WHERE id = ?
        33: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        38: astore        6
        40: aload         6
        42: iconst_1
        43: aload_0
        44: getfield      #20                 // Field _endDate:J
        47: invokeinterface #170,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        52: aload         6
        54: iconst_2
        55: aload_0
        56: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        59: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        62: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        67: aload         6
        69: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        74: pop
        75: aload         6
        77: ifnull        119
        80: aload         6
        82: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        87: goto          119
        90: astore        7
        92: aload         6
        94: ifnull        116
        97: aload         6
        99: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       104: goto          116
       107: astore        8
       109: aload         7
       111: aload         8
       113: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       116: aload         7
       118: athrow
       119: aload         5
       121: ifnull        163
       124: aload         5
       126: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       131: goto          163
       134: astore        6
       136: aload         5
       138: ifnull        160
       141: aload         5
       143: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       148: goto          160
       151: astore        7
       153: aload         6
       155: aload         7
       157: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       160: aload         6
       162: athrow
       163: goto          188
       166: astore        5
       168: getstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       171: ldc           #177                // String Couldn\'t save Auction date.
       173: aload         5
       175: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       178: goto          188
       181: aload_0
       182: getfield      #20                 // Field _endDate:J
       185: lload_1
       186: lsub
       187: lstore_3
       188: aload_0
       189: aload_0
       190: invokedynamic #179,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/residence/clanhall/Auction;)Ljava/lang/Runnable;
       195: lload_3
       196: invokestatic  #183                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       199: putfield      #189                // Field _task:Ljava/util/concurrent/Future;
       202: return
      Exception table:
         from    to  target type
            40    75    90   Class java/lang/Throwable
            97   104   107   Class java/lang/Throwable
            29   119   134   Class java/lang/Throwable
           141   148   151   Class java/lang/Throwable
            24   163   166   Class java/lang/Exception
      LineNumberTable:
        line 161: 0
        line 162: 4
        line 164: 6
        line 166: 15
        line 168: 24
        line 169: 29
        line 171: 40
        line 172: 52
        line 173: 67
        line 174: 75
        line 168: 90
        line 174: 119
        line 168: 134
        line 178: 163
        line 175: 166
        line 177: 168
        line 178: 178
        line 181: 181
        line 183: 188
        line 184: 202
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      79     6    ps   Ljava/sql/PreparedStatement;
           29     134     5   con   Ljava/sql/Connection;
          168      10     5     e   Ljava/lang/Exception;
            0     203     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            4     199     1 currentTime   J
            6     197     3 taskDelay   J
      StackMapTable: number_of_entries = 11
        frame_type = 255 /* full_frame */
          offset_delta = 90
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, long, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, long, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, long, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 14 /* same */
        frame_type = 6 /* same */

  public void setBid(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=12, args_size=3
         0: aload_1
         1: invokevirtual #193                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: iload_2
        11: aload_0
        12: invokevirtual #199                // Method getMinimumBid:()I
        15: if_icmpgt     26
        18: aload_1
        19: getstatic     #202                // Field ext/mods/gameserver/network/SystemMessageId.BID_PRICE_MUST_BE_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
        22: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        25: return
        26: iload_2
        27: istore        4
        29: aload_0
        30: getfield      #10                 // Field _bidders:Ljava/util/Map;
        33: aload_1
        34: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        37: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: invokeinterface #215,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        45: checkcast     #77                 // class ext/mods/gameserver/model/residence/clanhall/Bidder
        48: astore        5
        50: aload         5
        52: ifnull        82
        55: iload_2
        56: aload         5
        58: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
        61: if_icmpgt     72
        64: aload_1
        65: getstatic     #202                // Field ext/mods/gameserver/network/SystemMessageId.BID_PRICE_MUST_BE_HIGHER:Lext/mods/gameserver/network/SystemMessageId;
        68: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        71: return
        72: iload         4
        74: aload         5
        76: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
        79: isub
        80: istore        4
        82: aload_0
        83: aload_1
        84: iload         4
        86: invokevirtual #222                // Method takeItem:(Lext/mods/gameserver/model/actor/Player;I)Z
        89: ifne          93
        92: return
        93: invokestatic  #151                // Method java/lang/System.currentTimeMillis:()J
        96: lstore        6
        98: aload         5
       100: ifnonnull     145
       103: new           #77                 // class ext/mods/gameserver/model/residence/clanhall/Bidder
       106: dup
       107: aload_3
       108: invokevirtual #157                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderName:()Ljava/lang/String;
       111: aload_3
       112: invokevirtual #163                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       115: iload_2
       116: lload         6
       118: invokespecial #99                 // Method ext/mods/gameserver/model/residence/clanhall/Bidder."<init>":(Ljava/lang/String;Ljava/lang/String;IJ)V
       121: astore        5
       123: aload_0
       124: getfield      #10                 // Field _bidders:Ljava/util/Map;
       127: aload_1
       128: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       131: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       134: aload         5
       136: invokeinterface #117,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       141: pop
       142: goto          158
       145: aload         5
       147: iload_2
       148: invokevirtual #226                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.setBid:(I)V
       151: aload         5
       153: lload         6
       155: invokevirtual #230                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.setTime:(J)V
       158: aload_0
       159: invokevirtual #234                // Method recalculateHighestBidder:()V
       162: aload_1
       163: getstatic     #237                // Field ext/mods/gameserver/network/SystemMessageId.BID_IN_CLANHALL_AUCTION:Lext/mods/gameserver/network/SystemMessageId;
       166: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       169: aload_3
       170: aload_0
       171: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       174: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
       177: invokevirtual #240                // Method ext/mods/gameserver/model/pledge/Clan.setAuctionBiddedAt:(I)V
       180: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
       183: astore        8
       185: aload         8
       187: ldc           #243                // String INSERT INTO auctions (clanhall_id, bidder_name, clan_oid, clan_name, max_bid, time_bid) VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE bidder_name = VALUES(bidder_name), max_bid = VALUES(max_bid), time_bid = VALUES(time_bid)
       189: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       194: astore        9
       196: aload         9
       198: iconst_1
       199: aload_0
       200: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       203: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
       206: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       211: aload         9
       213: iconst_2
       214: aload_1
       215: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       218: invokeinterface #246,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       223: aload         9
       225: iconst_3
       226: aload_1
       227: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       230: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       235: aload         9
       237: iconst_4
       238: aload_3
       239: invokevirtual #163                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       242: invokeinterface #246,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
       247: aload         9
       249: iconst_5
       250: iload_2
       251: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       256: aload         9
       258: bipush        6
       260: lload         6
       262: invokeinterface #170,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       267: aload         9
       269: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       274: pop
       275: aload         9
       277: ifnull        319
       280: aload         9
       282: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       287: goto          319
       290: astore        10
       292: aload         9
       294: ifnull        316
       297: aload         9
       299: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       304: goto          316
       307: astore        11
       309: aload         10
       311: aload         11
       313: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       316: aload         10
       318: athrow
       319: aload         8
       321: ifnull        363
       324: aload         8
       326: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       331: goto          363
       334: astore        9
       336: aload         8
       338: ifnull        360
       341: aload         8
       343: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       348: goto          360
       351: astore        10
       353: aload         9
       355: aload         10
       357: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       360: aload         9
       362: athrow
       363: goto          378
       366: astore        8
       368: getstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       371: ldc           #250                // String Couldn\'t update Auction.
       373: aload         8
       375: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       378: return
      Exception table:
         from    to  target type
           196   275   290   Class java/lang/Throwable
           297   304   307   Class java/lang/Throwable
           185   319   334   Class java/lang/Throwable
           341   348   351   Class java/lang/Throwable
           180   363   366   Class java/lang/Exception
      LineNumberTable:
        line 193: 0
        line 194: 5
        line 195: 9
        line 197: 10
        line 199: 18
        line 200: 25
        line 203: 26
        line 205: 29
        line 207: 50
        line 209: 55
        line 211: 64
        line 212: 71
        line 215: 72
        line 218: 82
        line 219: 92
        line 221: 93
        line 223: 98
        line 225: 103
        line 227: 123
        line 231: 145
        line 232: 151
        line 235: 158
        line 237: 162
        line 239: 169
        line 241: 180
        line 242: 185
        line 244: 196
        line 245: 211
        line 246: 223
        line 247: 235
        line 248: 247
        line 249: 256
        line 250: 267
        line 251: 275
        line 241: 290
        line 251: 319
        line 241: 334
        line 255: 363
        line 252: 366
        line 254: 368
        line 256: 378
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          196     123     9    ps   Ljava/sql/PreparedStatement;
          185     178     8   con   Ljava/sql/Connection;
          368      10     8     e   Ljava/lang/Exception;
            0     379     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0     379     1 player   Lext/mods/gameserver/model/actor/Player;
            0     379     2   bid   I
            5     374     3  clan   Lext/mods/gameserver/model/pledge/Clan;
           29     350     4 requiredAdena   I
           50     329     5 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
           98     281     6  time   J
      StackMapTable: number_of_entries = 17
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ int, class ext/mods/gameserver/model/residence/clanhall/Bidder ]
        frame_type = 9 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ long ]
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 131
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/model/residence/clanhall/Bidder, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/model/residence/clanhall/Bidder, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/pledge/Clan, int, class ext/mods/gameserver/model/residence/clanhall/Bidder, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public boolean takeItem(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #193                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_3
         5: aload_3
         6: ifnonnull     11
         9: iconst_0
        10: ireturn
        11: aload_3
        12: invokevirtual #255                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
        15: invokevirtual #259                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.getAdena:()I
        18: iload_2
        19: if_icmpge     31
        22: aload_1
        23: getstatic     #274                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ADENA_IN_CWH:Lext/mods/gameserver/network/SystemMessageId;
        26: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        29: iconst_0
        30: ireturn
        31: aload_3
        32: invokevirtual #255                // Method ext/mods/gameserver/model/pledge/Clan.getWarehouse:()Lext/mods/gameserver/model/itemcontainer/ItemContainer;
        35: bipush        57
        37: iload_2
        38: invokevirtual #277                // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        41: pop
        42: iconst_1
        43: ireturn
      LineNumberTable:
        line 286: 0
        line 287: 5
        line 288: 9
        line 290: 11
        line 292: 22
        line 293: 29
        line 296: 31
        line 297: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0      44     1 bidder   Lext/mods/gameserver/model/actor/Player;
            0      44     2 quantity   I
            5      39     3  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 19 /* same */

  public void removeBids(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc_w         #280                // String DELETE FROM auctions WHERE clanhall_id = ?
         8: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        13: astore_3
        14: aload_3
        15: iconst_1
        16: aload_0
        17: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        20: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        23: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        28: aload_3
        29: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        34: pop
        35: aload_3
        36: ifnull        75
        39: aload_3
        40: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        45: goto          75
        48: astore        4
        50: aload_3
        51: ifnull        72
        54: aload_3
        55: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        60: goto          72
        63: astore        5
        65: aload         4
        67: aload         5
        69: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        72: aload         4
        74: athrow
        75: aload_2
        76: ifnull        112
        79: aload_2
        80: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
        85: goto          112
        88: astore_3
        89: aload_2
        90: ifnull        110
        93: aload_2
        94: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
        99: goto          110
       102: astore        4
       104: aload_3
       105: aload         4
       107: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       110: aload_3
       111: athrow
       112: goto          126
       115: astore_2
       116: getstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       119: ldc_w         #282                // String Couldn\'t remove Auction bids.
       122: aload_2
       123: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       126: aload_0
       127: getfield      #10                 // Field _bidders:Ljava/util/Map;
       130: invokeinterface #284,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       135: invokeinterface #288,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       140: astore_2
       141: aload_2
       142: invokeinterface #294,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       147: ifeq          228
       150: aload_2
       151: invokeinterface #299,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       156: checkcast     #77                 // class ext/mods/gameserver/model/residence/clanhall/Bidder
       159: astore_3
       160: aload_3
       161: invokevirtual #302                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       164: astore        4
       166: aload         4
       168: ifnonnull     174
       171: goto          141
       174: aload         4
       176: iconst_0
       177: invokevirtual #240                // Method ext/mods/gameserver/model/pledge/Clan.setAuctionBiddedAt:(I)V
       180: aload         4
       182: aload_1
       183: if_acmpeq     196
       186: aload         4
       188: aload_3
       189: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
       192: iconst_1
       193: invokestatic  #303                // Method returnItem:(Lext/mods/gameserver/model/pledge/Clan;IZ)V
       196: aload_1
       197: ifnull        225
       200: aload         4
       202: iconst_1
       203: anewarray     #307                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       206: dup
       207: iconst_0
       208: getstatic     #309                // Field ext/mods/gameserver/network/SystemMessageId.CLANHALL_AWARDED_TO_CLAN_S1:Lext/mods/gameserver/network/SystemMessageId;
       211: invokestatic  #312                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       214: aload_1
       215: invokevirtual #163                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       218: invokevirtual #318                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       221: aastore
       222: invokevirtual #322                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       225: goto          141
       228: aload_0
       229: getfield      #10                 // Field _bidders:Ljava/util/Map;
       232: invokeinterface #326,  1          // InterfaceMethod java/util/Map.clear:()V
       237: return
      Exception table:
         from    to  target type
            14    35    48   Class java/lang/Throwable
            54    60    63   Class java/lang/Throwable
             4    75    88   Class java/lang/Throwable
            93    99   102   Class java/lang/Throwable
             0   112   115   Class java/lang/Exception
      LineNumberTable:
        line 306: 0
        line 307: 4
        line 309: 14
        line 310: 28
        line 311: 35
        line 306: 48
        line 311: 75
        line 306: 88
        line 315: 112
        line 312: 115
        line 314: 116
        line 317: 126
        line 319: 160
        line 320: 166
        line 321: 171
        line 323: 174
        line 325: 180
        line 326: 186
        line 328: 196
        line 329: 200
        line 330: 225
        line 331: 228
        line 332: 237
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      61     3    ps   Ljava/sql/PreparedStatement;
            4     108     2   con   Ljava/sql/Connection;
          116      10     2     e   Ljava/lang/Exception;
          166      59     4  clan   Lext/mods/gameserver/model/pledge/Clan;
          160      65     3 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
            0     238     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0     238     1 newOwner   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 15
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/pledge/Clan, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Bidder, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 21 /* same */
        frame_type = 249 /* chop */
          offset_delta = 28
        frame_type = 250 /* chop */
          offset_delta = 2

  public void endAuction();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: getfield      #189                // Field _task:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #189                // Field _task:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #329,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #189                // Field _task:Ljava/util/concurrent/Future;
        23: aload_0
        24: getfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
        27: ifnonnull     75
        30: aload_0
        31: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        34: ifnonnull     44
        37: aload_0
        38: invokevirtual #148                // Method startAutoTask:()V
        41: goto          74
        44: aload_0
        45: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        48: invokevirtual #335                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        51: astore_1
        52: aload_1
        53: ifnonnull     57
        56: return
        57: aload_1
        58: iconst_1
        59: anewarray     #307                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        62: dup
        63: iconst_0
        64: getstatic     #336                // Field ext/mods/gameserver/network/SystemMessageId.CLANHALL_NOT_SOLD:Lext/mods/gameserver/network/SystemMessageId;
        67: invokestatic  #312                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: aastore
        71: invokevirtual #322                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        74: return
        75: aload_0
        76: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        79: ifnull        114
        82: aload_0
        83: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        86: invokevirtual #335                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        89: astore_1
        90: aload_1
        91: aload_0
        92: getfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
        95: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
        98: iconst_1
        99: invokestatic  #303                // Method returnItem:(Lext/mods/gameserver/model/pledge/Clan;IZ)V
       102: aload_1
       103: aload_0
       104: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       107: invokevirtual #339                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getLease:()I
       110: iconst_0
       111: invokestatic  #303                // Method returnItem:(Lext/mods/gameserver/model/pledge/Clan;IZ)V
       114: aload_0
       115: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       118: aload_0
       119: getfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
       122: invokevirtual #302                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       125: invokevirtual #342                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setOwner:(Lext/mods/gameserver/model/pledge/Clan;)V
       128: return
      LineNumberTable:
        line 337: 0
        line 339: 7
        line 340: 18
        line 343: 23
        line 345: 30
        line 346: 37
        line 349: 44
        line 350: 52
        line 351: 56
        line 353: 57
        line 355: 74
        line 358: 75
        line 360: 82
        line 362: 90
        line 363: 102
        line 366: 114
        line 367: 128
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      22     1 owner   Lext/mods/gameserver/model/pledge/Clan;
           90      24     1  clan   Lext/mods/gameserver/model/pledge/Clan;
            0     129     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
      StackMapTable: number_of_entries = 6
        frame_type = 23 /* same */
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 0 /* same */
        frame_type = 38 /* same */

  public void cancelBid(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #10                 // Field _bidders:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #346                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        13: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokeinterface #347,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        21: checkcast     #77                 // class ext/mods/gameserver/model/residence/clanhall/Bidder
        24: astore_2
        25: aload_2
        26: ifnonnull     30
        29: return
        30: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        33: astore_3
        34: aload_3
        35: ldc_w         #350                // String DELETE FROM auctions WHERE clanhall_id = ? AND clan_oid = ?
        38: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        43: astore        4
        45: aload         4
        47: iconst_1
        48: aload_0
        49: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        52: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        55: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        60: aload         4
        62: iconst_2
        63: aload_1
        64: invokevirtual #346                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        67: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        72: aload         4
        74: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        79: pop
        80: aload         4
        82: ifnull        124
        85: aload         4
        87: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        92: goto          124
        95: astore        5
        97: aload         4
        99: ifnull        121
       102: aload         4
       104: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       109: goto          121
       112: astore        6
       114: aload         5
       116: aload         6
       118: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       121: aload         5
       123: athrow
       124: aload_3
       125: ifnull        164
       128: aload_3
       129: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       134: goto          164
       137: astore        4
       139: aload_3
       140: ifnull        161
       143: aload_3
       144: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       149: goto          161
       152: astore        5
       154: aload         4
       156: aload         5
       158: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       161: aload         4
       163: athrow
       164: goto          178
       167: astore_3
       168: getstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       171: ldc_w         #352                // String Couldn\'t cancel Auction bid.
       174: aload_3
       175: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       178: aload_1
       179: aload_2
       180: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
       183: iconst_1
       184: invokestatic  #303                // Method returnItem:(Lext/mods/gameserver/model/pledge/Clan;IZ)V
       187: aload_1
       188: iconst_0
       189: invokevirtual #240                // Method ext/mods/gameserver/model/pledge/Clan.setAuctionBiddedAt:(I)V
       192: aload_2
       193: aload_0
       194: getfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
       197: if_acmpne     204
       200: aload_0
       201: invokevirtual #234                // Method recalculateHighestBidder:()V
       204: return
      Exception table:
         from    to  target type
            45    80    95   Class java/lang/Throwable
           102   109   112   Class java/lang/Throwable
            34   124   137   Class java/lang/Throwable
           143   149   152   Class java/lang/Throwable
            30   164   167   Class java/lang/Exception
      LineNumberTable:
        line 375: 0
        line 376: 4
        line 378: 5
        line 379: 25
        line 380: 29
        line 382: 30
        line 383: 34
        line 385: 45
        line 386: 60
        line 387: 72
        line 388: 80
        line 382: 95
        line 388: 124
        line 382: 137
        line 392: 164
        line 389: 167
        line 391: 168
        line 394: 178
        line 396: 187
        line 398: 192
        line 399: 200
        line 400: 204
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      79     4    ps   Ljava/sql/PreparedStatement;
           34     130     3   con   Ljava/sql/Connection;
          168      10     3     e   Ljava/lang/Exception;
            0     205     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0     205     1  clan   Lext/mods/gameserver/model/pledge/Clan;
           25     180     2 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
      StackMapTable: number_of_entries = 13
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Bidder ]
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/residence/clanhall/Bidder, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/residence/clanhall/Bidder, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/residence/clanhall/Bidder, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 25 /* same */

  public void cancelAuction();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: aload_0
        10: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        13: invokevirtual #335                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        16: invokevirtual #354                // Method removeBids:(Lext/mods/gameserver/model/pledge/Clan;)V
        19: aload_0
        20: iconst_0
        21: invokevirtual #357                // Method reset:(Z)V
        24: aload_0
        25: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        28: invokevirtual #361                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.updateDb:()V
        31: return
      LineNumberTable:
        line 405: 0
        line 406: 7
        line 408: 8
        line 410: 19
        line 412: 24
        line 413: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void confirmAuction();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
         4: ifnonnull     8
         7: return
         8: invokestatic  #41                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        11: astore_1
        12: aload_1
        13: ldc_w         #364                // String UPDATE clanhall SET sellerBid = ?, sellerName = ?, sellerClanName = ?, endDate = ? WHERE id = ?
        16: invokeinterface #49,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        21: astore_2
        22: aload_2
        23: iconst_1
        24: aload_0
        25: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        28: invokevirtual #366                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getBid:()I
        31: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        36: aload_2
        37: iconst_2
        38: aload_0
        39: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        42: invokevirtual #367                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getName:()Ljava/lang/String;
        45: invokeinterface #246,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        50: aload_2
        51: iconst_3
        52: aload_0
        53: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        56: invokevirtual #368                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getClanName:()Ljava/lang/String;
        59: invokeinterface #246,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        64: aload_2
        65: iconst_4
        66: aload_0
        67: getfield      #20                 // Field _endDate:J
        70: invokeinterface #170,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        75: aload_2
        76: iconst_5
        77: aload_0
        78: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        81: invokevirtual #55                 // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getId:()I
        84: invokeinterface #61,  3           // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        89: aload_2
        90: invokeinterface #174,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        95: pop
        96: aload_2
        97: ifnull        133
       100: aload_2
       101: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       106: goto          133
       109: astore_3
       110: aload_2
       111: ifnull        131
       114: aload_2
       115: invokeinterface #132,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       120: goto          131
       123: astore        4
       125: aload_3
       126: aload         4
       128: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       131: aload_3
       132: athrow
       133: aload_1
       134: ifnull        168
       137: aload_1
       138: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       143: goto          168
       146: astore_2
       147: aload_1
       148: ifnull        166
       151: aload_1
       152: invokeinterface #133,  1          // InterfaceMethod java/sql/Connection.close:()V
       157: goto          166
       160: astore_3
       161: aload_2
       162: aload_3
       163: invokevirtual #128                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload_2
       167: athrow
       168: goto          182
       171: astore_1
       172: getstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       175: ldc_w         #371                // String Couldn\'t confirm Auction.
       178: aload_1
       179: invokevirtual #142                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       182: return
      Exception table:
         from    to  target type
            22    96   109   Class java/lang/Throwable
           114   120   123   Class java/lang/Throwable
            12   133   146   Class java/lang/Throwable
           151   157   160   Class java/lang/Throwable
             8   168   171   Class java/lang/Exception
      LineNumberTable:
        line 418: 0
        line 419: 7
        line 421: 8
        line 422: 12
        line 424: 22
        line 425: 36
        line 426: 50
        line 427: 64
        line 428: 75
        line 429: 89
        line 430: 96
        line 421: 109
        line 430: 133
        line 421: 146
        line 434: 168
        line 431: 171
        line 433: 172
        line 435: 182
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22     111     2    ps   Ljava/sql/PreparedStatement;
           12     156     1   con   Ljava/sql/Connection;
          172      10     1     e   Ljava/lang/Exception;
            0     183     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
      StackMapTable: number_of_entries = 11
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 100
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Auction, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void recalculateHighestBidder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: aconst_null
         1: astore_1
         2: iconst_0
         3: istore_2
         4: aload_0
         5: getfield      #10                 // Field _bidders:Ljava/util/Map;
         8: invokeinterface #284,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        13: invokeinterface #288,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        18: astore_3
        19: aload_3
        20: invokeinterface #294,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        25: ifeq          60
        28: aload_3
        29: invokeinterface #299,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        34: checkcast     #77                 // class ext/mods/gameserver/model/residence/clanhall/Bidder
        37: astore        4
        39: aload         4
        41: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
        44: iload_2
        45: if_icmple     57
        48: aload         4
        50: astore_1
        51: aload         4
        53: invokevirtual #219                // Method ext/mods/gameserver/model/residence/clanhall/Bidder.getBid:()I
        56: istore_2
        57: goto          19
        60: aload_0
        61: aload_1
        62: putfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
        65: return
      LineNumberTable:
        line 439: 0
        line 440: 2
        line 442: 4
        line 444: 39
        line 446: 48
        line 448: 51
        line 450: 57
        line 452: 60
        line 453: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      18     4 bidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
            0      66     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            2      64     1 highestBidder   Lext/mods/gameserver/model/residence/clanhall/Bidder;
            4      62     2 highestBid   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/residence/clanhall/Bidder, int, class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void reset(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aconst_null
         2: putfield      #105                // Field _highestBidder:Lext/mods/gameserver/model/residence/clanhall/Bidder;
         5: aload_0
         6: aconst_null
         7: putfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        10: aload_0
        11: lconst_0
        12: putfield      #20                 // Field _endDate:J
        15: aload_0
        16: getfield      #189                // Field _task:Ljava/util/concurrent/Future;
        19: ifnull        38
        22: aload_0
        23: getfield      #189                // Field _task:Ljava/util/concurrent/Future;
        26: iconst_0
        27: invokeinterface #329,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        32: pop
        33: aload_0
        34: aconst_null
        35: putfield      #189                // Field _task:Ljava/util/concurrent/Future;
        38: iload_1
        39: ifeq          46
        42: aload_0
        43: invokevirtual #148                // Method startAutoTask:()V
        46: return
      LineNumberTable:
        line 461: 0
        line 462: 5
        line 464: 10
        line 466: 15
        line 468: 22
        line 469: 33
        line 472: 38
        line 473: 42
        line 474: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
            0      47     1 runTask   Z
      StackMapTable: number_of_entries = 2
        frame_type = 38 /* same */
        frame_type = 7 /* same */

  public int getMinimumBid();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
         4: ifnonnull     17
         7: aload_0
         8: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        11: invokevirtual #373                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
        14: goto          34
        17: aload_0
        18: getfield      #16                 // Field _ch:Lext/mods/gameserver/model/residence/clanhall/ClanHall;
        21: invokevirtual #373                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
        24: aload_0
        25: getfield      #37                 // Field _seller:Lext/mods/gameserver/model/residence/clanhall/Seller;
        28: invokevirtual #366                // Method ext/mods/gameserver/model/residence/clanhall/Seller.getBid:()I
        31: invokestatic  #376                // Method java/lang/Math.max:(II)I
        34: ireturn
      LineNumberTable:
        line 478: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/residence/clanhall/Auction;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #143                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/residence/clanhall/Auction
         6: invokevirtual #379                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #382                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #136                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 68: 0
}
SourceFile: "Auction.java"
BootstrapMethods:
  0: #460 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 ()V
      #457 REF_invokeVirtual ext/mods/gameserver/model/residence/clanhall/Auction.endAuction:()V
      #456 ()V
InnerClasses:
  public static final #472= #468 of #470; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
