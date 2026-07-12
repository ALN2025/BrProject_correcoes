// Bytecode for: ext.mods.gameserver.data.manager.ClanHallManager
// File: ext\mods\gameserver\data\manager\ClanHallManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/ClanHallManager.class
  Last modified 9 de jul de 2026; size 17020 bytes
  MD5 checksum 83be13b3be5c6f217b63c395a79cc17a
  Compiled from "ClanHallManager.java"
public class ext.mods.gameserver.data.manager.ClanHallManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/ClanHallManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 32, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/HashMap
    #8 = Utf8               java/util/HashMap
    #9 = Methodref          #7.#3         // java/util/HashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/ClanHallManager._clanHalls:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/ClanHallManager
   #12 = NameAndType        #14:#15       // _clanHalls:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #14 = Utf8               _clanHalls
   #15 = Utf8               Ljava/util/Map;
   #16 = Class              #17           // java/util/ArrayList
   #17 = Utf8               java/util/ArrayList
   #18 = Methodref          #16.#3        // java/util/ArrayList."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/manager/ClanHallManager._decos:Ljava/util/List;
   #20 = NameAndType        #21:#22       // _decos:Ljava/util/List;
   #21 = Utf8               _decos
   #22 = Utf8               Ljava/util/List;
   #23 = Methodref          #11.#24       // ext/mods/gameserver/data/manager/ClanHallManager.load:()V
   #24 = NameAndType        #25:#6        // load:()V
   #25 = Utf8               load
   #26 = Methodref          #27.#28       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #27 = Class              #29           // ext/mods/commons/pool/ConnectionPool
   #28 = NameAndType        #30:#31       // getConnection:()Ljava/sql/Connection;
   #29 = Utf8               ext/mods/commons/pool/ConnectionPool
   #30 = Utf8               getConnection
   #31 = Utf8               ()Ljava/sql/Connection;
   #32 = String             #33           // SELECT * FROM clanhall
   #33 = Utf8               SELECT * FROM clanhall
   #34 = InterfaceMethodref #35.#36       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #35 = Class              #37           // java/sql/Connection
   #36 = NameAndType        #38:#39       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #37 = Utf8               java/sql/Connection
   #38 = Utf8               prepareStatement
   #39 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #40 = String             #41           // SELECT * FROM clanhall_functions WHERE hall_id = ?
   #41 = Utf8               SELECT * FROM clanhall_functions WHERE hall_id = ?
   #42 = InterfaceMethodref #43.#44       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #43 = Class              #45           // java/sql/PreparedStatement
   #44 = NameAndType        #46:#47       // executeQuery:()Ljava/sql/ResultSet;
   #45 = Utf8               java/sql/PreparedStatement
   #46 = Utf8               executeQuery
   #47 = Utf8               ()Ljava/sql/ResultSet;
   #48 = InterfaceMethodref #49.#50       // java/sql/ResultSet.next:()Z
   #49 = Class              #51           // java/sql/ResultSet
   #50 = NameAndType        #52:#53       // next:()Z
   #51 = Utf8               java/sql/ResultSet
   #52 = Utf8               next
   #53 = Utf8               ()Z
   #54 = String             #55           // id
   #55 = Utf8               id
   #56 = InterfaceMethodref #49.#57       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #57 = NameAndType        #58:#59       // getInt:(Ljava/lang/String;)I
   #58 = Utf8               getInt
   #59 = Utf8               (Ljava/lang/String;)I
   #60 = Methodref          #61.#62       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #61 = Class              #63           // java/lang/Integer
   #62 = NameAndType        #64:#65       // valueOf:(I)Ljava/lang/Integer;
   #63 = Utf8               java/lang/Integer
   #64 = Utf8               valueOf
   #65 = Utf8               (I)Ljava/lang/Integer;
   #66 = InterfaceMethodref #67.#68       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Class              #69           // java/util/Map
   #68 = NameAndType        #70:#71       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #69 = Utf8               java/util/Map
   #70 = Utf8               get
   #71 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #72 = Class              #73           // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #73 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #74 = Methodref          #75.#76       // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #75 = Class              #77           // ext/mods/gameserver/data/manager/ZoneManager
   #76 = NameAndType        #78:#79       // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #77 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #78 = Utf8               getInstance
   #79 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #80 = Class              #81           // ext/mods/gameserver/model/zone/type/ClanHallZone
   #81 = Utf8               ext/mods/gameserver/model/zone/type/ClanHallZone
   #82 = Methodref          #75.#83       // ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #83 = NameAndType        #84:#85       // getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #84 = Utf8               getAllZones
   #85 = Utf8               (Ljava/lang/Class;)Ljava/util/Collection;
   #86 = InterfaceMethodref #87.#88       // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #87 = Class              #89           // java/util/Collection
   #88 = NameAndType        #90:#91       // stream:()Ljava/util/stream/Stream;
   #89 = Utf8               java/util/Collection
   #90 = Utf8               stream
   #91 = Utf8               ()Ljava/util/stream/Stream;
   #92 = InvokeDynamic      #0:#93        // #0:test:(I)Ljava/util/function/Predicate;
   #93 = NameAndType        #94:#95       // test:(I)Ljava/util/function/Predicate;
   #94 = Utf8               test
   #95 = Utf8               (I)Ljava/util/function/Predicate;
   #96 = InterfaceMethodref #97.#98       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #97 = Class              #99           // java/util/stream/Stream
   #98 = NameAndType        #100:#101     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #99 = Utf8               java/util/stream/Stream
  #100 = Utf8               filter
  #101 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #102 = InterfaceMethodref #97.#103      // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #103 = NameAndType        #104:#105     // findFirst:()Ljava/util/Optional;
  #104 = Utf8               findFirst
  #105 = Utf8               ()Ljava/util/Optional;
  #106 = Methodref          #107.#108     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #107 = Class              #109          // java/util/Optional
  #108 = NameAndType        #110:#71      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #109 = Utf8               java/util/Optional
  #110 = Utf8               orElse
  #111 = Fieldref           #11.#112      // ext/mods/gameserver/data/manager/ClanHallManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #112 = NameAndType        #113:#114     // LOGGER:Lext/mods/commons/logging/CLogger;
  #113 = Utf8               LOGGER
  #114 = Utf8               Lext/mods/commons/logging/CLogger;
  #115 = String             #116          // No existing ClanHallZone for ClanHall {}.
  #116 = Utf8               No existing ClanHallZone for ClanHall {}.
  #117 = Methodref          #118.#119     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #118 = Class              #120          // ext/mods/commons/logging/CLogger
  #119 = NameAndType        #121:#122     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #120 = Utf8               ext/mods/commons/logging/CLogger
  #121 = Utf8               warn
  #122 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #123 = Methodref          #72.#124      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
  #124 = NameAndType        #125:#126     // getAuctionMin:()I
  #125 = Utf8               getAuctionMin
  #126 = Utf8               ()I
  #127 = Class              #128          // ext/mods/gameserver/model/residence/clanhall/Auction
  #128 = Utf8               ext/mods/gameserver/model/residence/clanhall/Auction
  #129 = String             #130          // sellerBid
  #130 = Utf8               sellerBid
  #131 = String             #132          // sellerName
  #132 = Utf8               sellerName
  #133 = InterfaceMethodref #49.#134      // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
  #134 = NameAndType        #135:#136     // getString:(Ljava/lang/String;)Ljava/lang/String;
  #135 = Utf8               getString
  #136 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #137 = String             #138          // sellerClanName
  #138 = Utf8               sellerClanName
  #139 = String             #140          // endDate
  #140 = Utf8               endDate
  #141 = InterfaceMethodref #49.#142      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #142 = NameAndType        #143:#144     // getLong:(Ljava/lang/String;)J
  #143 = Utf8               getLong
  #144 = Utf8               (Ljava/lang/String;)J
  #145 = Methodref          #127.#146     // ext/mods/gameserver/model/residence/clanhall/Auction."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;ILjava/lang/String;Ljava/lang/String;J)V
  #146 = NameAndType        #5:#147       // "<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;ILjava/lang/String;Ljava/lang/String;J)V
  #147 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;ILjava/lang/String;Ljava/lang/String;J)V
  #148 = Methodref          #72.#149      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setAuction:(Lext/mods/gameserver/model/residence/clanhall/Auction;)V
  #149 = NameAndType        #150:#151     // setAuction:(Lext/mods/gameserver/model/residence/clanhall/Auction;)V
  #150 = Utf8               setAuction
  #151 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/Auction;)V
  #152 = Methodref          #153.#154     // java/lang/System.currentTimeMillis:()J
  #153 = Class              #155          // java/lang/System
  #154 = NameAndType        #156:#157     // currentTimeMillis:()J
  #155 = Utf8               java/lang/System
  #156 = Utf8               currentTimeMillis
  #157 = Utf8               ()J
  #158 = Class              #159          // ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #159 = Utf8               ext/mods/gameserver/model/residence/clanhall/SiegableHall
  #160 = Methodref          #158.#161     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateNextSiege:()V
  #161 = NameAndType        #162:#6       // updateNextSiege:()V
  #162 = Utf8               updateNextSiege
  #163 = Methodref          #164.#165     // java/util/Calendar.getInstance:()Ljava/util/Calendar;
  #164 = Class              #166          // java/util/Calendar
  #165 = NameAndType        #78:#167      // getInstance:()Ljava/util/Calendar;
  #166 = Utf8               java/util/Calendar
  #167 = Utf8               ()Ljava/util/Calendar;
  #168 = Methodref          #164.#169     // java/util/Calendar.setTimeInMillis:(J)V
  #169 = NameAndType        #170:#171     // setTimeInMillis:(J)V
  #170 = Utf8               setTimeInMillis
  #171 = Utf8               (J)V
  #172 = Methodref          #158.#173     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.setNextSiegeDate:(Ljava/util/Calendar;)V
  #173 = NameAndType        #174:#175     // setNextSiegeDate:(Ljava/util/Calendar;)V
  #174 = Utf8               setNextSiegeDate
  #175 = Utf8               (Ljava/util/Calendar;)V
  #176 = Methodref          #72.#177      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setZone:(Lext/mods/gameserver/model/zone/type/ClanHallZone;)V
  #177 = NameAndType        #178:#179     // setZone:(Lext/mods/gameserver/model/zone/type/ClanHallZone;)V
  #178 = Utf8               setZone
  #179 = Utf8               (Lext/mods/gameserver/model/zone/type/ClanHallZone;)V
  #180 = String             #181          // ownerId
  #181 = Utf8               ownerId
  #182 = Methodref          #183.#184     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #183 = Class              #185          // ext/mods/gameserver/data/sql/ClanTable
  #184 = NameAndType        #78:#186      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #185 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #186 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #187 = Methodref          #183.#188     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #188 = NameAndType        #189:#190     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #189 = Utf8               getClan
  #190 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #191 = Methodref          #72.#192      // ext/mods/gameserver/model/residence/clanhall/ClanHall.free:()V
  #192 = NameAndType        #193:#6       // free:()V
  #193 = Utf8               free
  #194 = Methodref          #195.#196     // ext/mods/gameserver/model/pledge/Clan.setClanHallId:(I)V
  #195 = Class              #197          // ext/mods/gameserver/model/pledge/Clan
  #196 = NameAndType        #198:#199     // setClanHallId:(I)V
  #197 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #198 = Utf8               setClanHallId
  #199 = Utf8               (I)V
  #200 = Methodref          #72.#201      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setOwnerId:(I)V
  #201 = NameAndType        #202:#199     // setOwnerId:(I)V
  #202 = Utf8               setOwnerId
  #203 = String             #204          // paidUntil
  #204 = Utf8               paidUntil
  #205 = Methodref          #72.#206      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setPaidUntil:(J)V
  #206 = NameAndType        #207:#171     // setPaidUntil:(J)V
  #207 = Utf8               setPaidUntil
  #208 = String             #209          // paid
  #209 = Utf8               paid
  #210 = InterfaceMethodref #49.#211      // java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
  #211 = NameAndType        #212:#213     // getBoolean:(Ljava/lang/String;)Z
  #212 = Utf8               getBoolean
  #213 = Utf8               (Ljava/lang/String;)Z
  #214 = Methodref          #72.#215      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setPaid:(Z)V
  #215 = NameAndType        #216:#217     // setPaid:(Z)V
  #216 = Utf8               setPaid
  #217 = Utf8               (Z)V
  #218 = Methodref          #72.#219      // ext/mods/gameserver/model/residence/clanhall/ClanHall.initializeFeeTask:()V
  #219 = NameAndType        #220:#6       // initializeFeeTask:()V
  #220 = Utf8               initializeFeeTask
  #221 = InterfaceMethodref #43.#222      // java/sql/PreparedStatement.setInt:(II)V
  #222 = NameAndType        #223:#224     // setInt:(II)V
  #223 = Utf8               setInt
  #224 = Utf8               (II)V
  #225 = Methodref          #72.#226      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunctions:()Ljava/util/Map;
  #226 = NameAndType        #227:#228     // getFunctions:()Ljava/util/Map;
  #227 = Utf8               getFunctions
  #228 = Utf8               ()Ljava/util/Map;
  #229 = String             #230          // type
  #230 = Utf8               type
  #231 = Class              #232          // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
  #232 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
  #233 = String             #234          // lvl
  #234 = Utf8               lvl
  #235 = String             #236          // lease
  #236 = Utf8               lease
  #237 = String             #238          // rate
  #238 = Utf8               rate
  #239 = String             #240          // endTime
  #240 = Utf8               endTime
  #241 = Methodref          #231.#242     // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;IIIJJ)V
  #242 = NameAndType        #5:#243       // "<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;IIIJJ)V
  #243 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;IIIJJ)V
  #244 = InterfaceMethodref #67.#245      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #245 = NameAndType        #246:#247     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #246 = Utf8               put
  #247 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #248 = InterfaceMethodref #49.#249      // java/sql/ResultSet.close:()V
  #249 = NameAndType        #250:#6       // close:()V
  #250 = Utf8               close
  #251 = Class              #252          // java/lang/Throwable
  #252 = Utf8               java/lang/Throwable
  #253 = Methodref          #251.#254     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #254 = NameAndType        #255:#256     // addSuppressed:(Ljava/lang/Throwable;)V
  #255 = Utf8               addSuppressed
  #256 = Utf8               (Ljava/lang/Throwable;)V
  #257 = InterfaceMethodref #43.#258      // java/sql/PreparedStatement.clearParameters:()V
  #258 = NameAndType        #259:#6       // clearParameters:()V
  #259 = Utf8               clearParameters
  #260 = InterfaceMethodref #43.#249      // java/sql/PreparedStatement.close:()V
  #261 = InterfaceMethodref #35.#249      // java/sql/Connection.close:()V
  #262 = Class              #263          // java/lang/Exception
  #263 = Utf8               java/lang/Exception
  #264 = String             #265          // Couldn\'t load clan hall data.
  #265 = Utf8               Couldn\'t load clan hall data.
  #266 = Methodref          #118.#267     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #267 = NameAndType        #268:#269     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #268 = Utf8               error
  #269 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #270 = String             #271          // xml/clanHalls.xml
  #271 = Utf8               xml/clanHalls.xml
  #272 = Methodref          #11.#273      // ext/mods/gameserver/data/manager/ClanHallManager.parseDataFile:(Ljava/lang/String;)V
  #273 = NameAndType        #274:#275     // parseDataFile:(Ljava/lang/String;)V
  #274 = Utf8               parseDataFile
  #275 = Utf8               (Ljava/lang/String;)V
  #276 = String             #277          // xml/clanHallDeco.xml
  #277 = Utf8               xml/clanHallDeco.xml
  #278 = String             #279          // Loaded {} clan halls and {} siegable clan halls.
  #279 = Utf8               Loaded {} clan halls and {} siegable clan halls.
  #280 = InterfaceMethodref #67.#281      // java/util/Map.size:()I
  #281 = NameAndType        #282:#126     // size:()I
  #282 = Utf8               size
  #283 = Methodref          #11.#284      // ext/mods/gameserver/data/manager/ClanHallManager.getSiegableHalls:()Ljava/util/List;
  #284 = NameAndType        #285:#286     // getSiegableHalls:()Ljava/util/List;
  #285 = Utf8               getSiegableHalls
  #286 = Utf8               ()Ljava/util/List;
  #287 = InterfaceMethodref #288.#281     // java/util/List.size:()I
  #288 = Class              #289          // java/util/List
  #289 = Utf8               java/util/List
  #290 = Methodref          #118.#291     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #291 = NameAndType        #292:#122     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #292 = Utf8               info
  #293 = String             #294          // clanHalls.xml
  #294 = Utf8               clanHalls.xml
  #295 = InterfaceMethodref #296.#297     // java/nio/file/Path.endsWith:(Ljava/lang/String;)Z
  #296 = Class              #298          // java/nio/file/Path
  #297 = NameAndType        #299:#213     // endsWith:(Ljava/lang/String;)Z
  #298 = Utf8               java/nio/file/Path
  #299 = Utf8               endsWith
  #300 = String             #301          // list
  #301 = Utf8               list
  #302 = InvokeDynamic      #1:#303       // #1:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
  #303 = NameAndType        #304:#305     // accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
  #304 = Utf8               accept
  #305 = Utf8               (Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
  #306 = Methodref          #11.#307      // ext/mods/gameserver/data/manager/ClanHallManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #307 = NameAndType        #308:#309     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #308 = Utf8               forEach
  #309 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #310 = InvokeDynamic      #2:#303       // #2:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
  #311 = InterfaceMethodref #67.#312      // java/util/Map.values:()Ljava/util/Collection;
  #312 = NameAndType        #313:#314     // values:()Ljava/util/Collection;
  #313 = Utf8               values
  #314 = Utf8               ()Ljava/util/Collection;
  #315 = Methodref          #316.#317     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #316 = Class              #318          // java/util/Objects
  #317 = NameAndType        #319:#71      // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #318 = Utf8               java/util/Objects
  #319 = Utf8               requireNonNull
  #320 = InvokeDynamic      #3:#321       // #3:test:(Ljava/lang/Class;)Ljava/util/function/Predicate;
  #321 = NameAndType        #94:#322      // test:(Ljava/lang/Class;)Ljava/util/function/Predicate;
  #322 = Utf8               (Ljava/lang/Class;)Ljava/util/function/Predicate;
  #323 = InvokeDynamic      #4:#324       // #4:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
  #324 = NameAndType        #325:#326     // apply:(Ljava/lang/Class;)Ljava/util/function/Function;
  #325 = Utf8               apply
  #326 = Utf8               (Ljava/lang/Class;)Ljava/util/function/Function;
  #327 = InterfaceMethodref #97.#328      // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #328 = NameAndType        #329:#330     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #329 = Utf8               map
  #330 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #331 = InterfaceMethodref #97.#332      // java/util/stream/Stream.toList:()Ljava/util/List;
  #332 = NameAndType        #333:#286     // toList:()Ljava/util/List;
  #333 = Utf8               toList
  #334 = InterfaceMethodref #87.#335      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #335 = NameAndType        #336:#337     // iterator:()Ljava/util/Iterator;
  #336 = Utf8               iterator
  #337 = Utf8               ()Ljava/util/Iterator;
  #338 = InterfaceMethodref #339.#340     // java/util/Iterator.hasNext:()Z
  #339 = Class              #341          // java/util/Iterator
  #340 = NameAndType        #342:#53      // hasNext:()Z
  #341 = Utf8               java/util/Iterator
  #342 = Utf8               hasNext
  #343 = InterfaceMethodref #339.#344     // java/util/Iterator.next:()Ljava/lang/Object;
  #344 = NameAndType        #52:#345      // next:()Ljava/lang/Object;
  #345 = Utf8               ()Ljava/lang/Object;
  #346 = Methodref          #72.#347      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
  #347 = NameAndType        #348:#349     // getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
  #348 = Utf8               getAuction
  #349 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Auction;
  #350 = Methodref          #72.#351      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
  #351 = NameAndType        #352:#126     // getOwnerId:()I
  #352 = Utf8               getOwnerId
  #353 = Methodref          #127.#354     // ext/mods/gameserver/model/residence/clanhall/Auction.getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #354 = NameAndType        #355:#356     // getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #355 = Utf8               getSeller
  #356 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/Seller;
  #357 = InterfaceMethodref #288.#358     // java/util/List.add:(Ljava/lang/Object;)Z
  #358 = NameAndType        #359:#360     // add:(Ljava/lang/Object;)Z
  #359 = Utf8               add
  #360 = Utf8               (Ljava/lang/Object;)Z
  #361 = InvokeDynamic      #5:#362       // #5:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #362 = NameAndType        #94:#363      // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #363 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #364 = InvokeDynamic      #6:#365       // #6:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #365 = NameAndType        #94:#366      // test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #366 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #367 = Methodref          #158.#368     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #368 = NameAndType        #369:#370     // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #369 = Utf8               getSiegeZone
  #370 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #371 = Methodref          #372.#373     // ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
  #372 = Class              #374          // ext/mods/gameserver/model/zone/type/SiegeZone
  #373 = NameAndType        #375:#53      // isActive:()Z
  #374 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
  #375 = Utf8               isActive
  #376 = Methodref          #372.#377     // ext/mods/gameserver/model/zone/type/SiegeZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
  #377 = NameAndType        #378:#379     // isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
  #378 = Utf8               isInsideZone
  #379 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #380 = Methodref          #158.#381     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #381 = NameAndType        #382:#383     // getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #382 = Utf8               getSiege
  #383 = Utf8               ()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #384 = InterfaceMethodref #288.#335     // java/util/List.iterator:()Ljava/util/Iterator;
  #385 = Methodref          #386.#387     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
  #386 = Class              #388          // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #387 = NameAndType        #389:#286     // getAttackerClans:()Ljava/util/List;
  #388 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallSiege
  #389 = Utf8               getAttackerClans
  #390 = InterfaceMethodref #288.#391     // java/util/List.contains:(Ljava/lang/Object;)Z
  #391 = NameAndType        #392:#360     // contains:(Ljava/lang/Object;)Z
  #392 = Utf8               contains
  #393 = Methodref          #158.#394     // ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
  #394 = NameAndType        #395:#126     // getId:()I
  #395 = Utf8               getId
  #396 = Methodref          #386.#397     // ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.saveAttackers:()V
  #397 = NameAndType        #398:#6       // saveAttackers:()V
  #398 = Utf8               saveAttackers
  #399 = InterfaceMethodref #288.#88      // java/util/List.stream:()Ljava/util/stream/Stream;
  #400 = InvokeDynamic      #7:#401       // #7:test:(II)Ljava/util/function/Predicate;
  #401 = NameAndType        #94:#402      // test:(II)Ljava/util/function/Predicate;
  #402 = Utf8               (II)Ljava/util/function/Predicate;
  #403 = Class              #404          // ext/mods/gameserver/model/records/ClanHallDeco
  #404 = Utf8               ext/mods/gameserver/model/records/ClanHallDeco
  #405 = Methodref          #403.#406     // ext/mods/gameserver/model/records/ClanHallDeco.price:()I
  #406 = NameAndType        #407:#126     // price:()I
  #407 = Utf8               price
  #408 = InvokeDynamic      #8:#401       // #8:test:(II)Ljava/util/function/Predicate;
  #409 = Methodref          #403.#410     // ext/mods/gameserver/model/records/ClanHallDeco.days:()I
  #410 = NameAndType        #411:#126     // days:()I
  #411 = Utf8               days
  #412 = Fieldref           #413.#414     // ext/mods/gameserver/data/manager/ClanHallManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ClanHallManager;
  #413 = Class              #415          // ext/mods/gameserver/data/manager/ClanHallManager$SingletonHolder
  #414 = NameAndType        #416:#417     // INSTANCE:Lext/mods/gameserver/data/manager/ClanHallManager;
  #415 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager$SingletonHolder
  #416 = Utf8               INSTANCE
  #417 = Utf8               Lext/mods/gameserver/data/manager/ClanHallManager;
  #418 = Methodref          #403.#419     // ext/mods/gameserver/model/records/ClanHallDeco.type:()I
  #419 = NameAndType        #230:#126     // type:()I
  #420 = Methodref          #403.#421     // ext/mods/gameserver/model/records/ClanHallDeco.level:()I
  #421 = NameAndType        #422:#126     // level:()I
  #422 = Utf8               level
  #423 = Methodref          #195.#424     // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #424 = NameAndType        #425:#126     // getClanId:()I
  #425 = Utf8               getClanId
  #426 = Methodref          #72.#427      // ext/mods/gameserver/model/residence/clanhall/ClanHall.getTownName:()Ljava/lang/String;
  #427 = NameAndType        #428:#429     // getTownName:()Ljava/lang/String;
  #428 = Utf8               getTownName
  #429 = Utf8               ()Ljava/lang/String;
  #430 = Methodref          #431.#432     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #431 = Class              #433          // java/lang/String
  #432 = NameAndType        #434:#213     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #433 = Utf8               java/lang/String
  #434 = Utf8               equalsIgnoreCase
  #435 = String             #436          // deco
  #436 = Utf8               deco
  #437 = InvokeDynamic      #9:#303       // #9:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
  #438 = Methodref          #11.#439      // ext/mods/gameserver/data/manager/ClanHallManager.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #439 = NameAndType        #440:#441     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #440 = Utf8               parseAttributes
  #441 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #442 = Methodref          #403.#443     // ext/mods/gameserver/model/records/ClanHallDeco."<init>":(Lext/mods/commons/data/StatSet;)V
  #443 = NameAndType        #5:#444       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #444 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #445 = String             #446          // clanHall
  #446 = Utf8               clanHall
  #447 = InvokeDynamic      #10:#303      // #10:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
  #448 = String             #449          // agit
  #449 = Utf8               agit
  #450 = InvokeDynamic      #11:#451      // #11:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #451 = NameAndType        #304:#452     // accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #452 = Utf8               (Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #453 = String             #454          // tax
  #454 = Utf8               tax
  #455 = InvokeDynamic      #12:#451      // #12:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #456 = String             #457          // siegeLength
  #457 = Utf8               siegeLength
  #458 = Methodref          #459.#460     // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
  #459 = Class              #461          // ext/mods/commons/data/StatSet
  #460 = NameAndType        #462:#360     // containsKey:(Ljava/lang/Object;)Z
  #461 = Utf8               ext/mods/commons/data/StatSet
  #462 = Utf8               containsKey
  #463 = Methodref          #158.#443     // ext/mods/gameserver/model/residence/clanhall/SiegableHall."<init>":(Lext/mods/commons/data/StatSet;)V
  #464 = Methodref          #72.#443      // ext/mods/gameserver/model/residence/clanhall/ClanHall."<init>":(Lext/mods/commons/data/StatSet;)V
  #465 = String             #466          // gates
  #466 = Utf8               gates
  #467 = InvokeDynamic      #13:#468      // #13:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Ljava/util/function/Consumer;
  #468 = NameAndType        #304:#469     // accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Ljava/util/function/Consumer;
  #469 = Utf8               (Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Ljava/util/function/Consumer;
  #470 = String             #471          // npcs
  #471 = Utf8               npcs
  #472 = InvokeDynamic      #14:#468      // #14:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Ljava/util/function/Consumer;
  #473 = String             #474          // spawns
  #474 = Utf8               spawns
  #475 = InvokeDynamic      #15:#468      // #15:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Ljava/util/function/Consumer;
  #476 = Methodref          #459.#477     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #477 = NameAndType        #478:#59      // getInteger:(Ljava/lang/String;)I
  #478 = Utf8               getInteger
  #479 = String             #480          // spawn
  #480 = Utf8               spawn
  #481 = InvokeDynamic      #16:#468      // #16:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Ljava/util/function/Consumer;
  #482 = InterfaceMethodref #483.#484     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #483 = Class              #485          // org/w3c/dom/Node
  #484 = NameAndType        #486:#487     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #485 = Utf8               org/w3c/dom/Node
  #486 = Utf8               getAttributes
  #487 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #488 = Class              #489          // ext/mods/gameserver/enums/SpawnType
  #489 = Utf8               ext/mods/gameserver/enums/SpawnType
  #490 = Methodref          #11.#491      // ext/mods/gameserver/data/manager/ClanHallManager.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #491 = NameAndType        #492:#493     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #492 = Utf8               parseEnum
  #493 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #494 = Methodref          #11.#495      // ext/mods/gameserver/data/manager/ClanHallManager.parseLocation:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #495 = NameAndType        #496:#497     // parseLocation:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #496 = Utf8               parseLocation
  #497 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #498 = Methodref          #72.#499      // ext/mods/gameserver/model/residence/clanhall/ClanHall.addSpawn:(Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #499 = NameAndType        #500:#501     // addSpawn:(Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #500 = Utf8               addSpawn
  #501 = Utf8               (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #502 = String             #503          // val
  #503 = Utf8               val
  #504 = Methodref          #11.#505      // ext/mods/gameserver/data/manager/ClanHallManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #505 = NameAndType        #506:#507     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #506 = Utf8               parseString
  #507 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #508 = Methodref          #72.#509      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setNpcs:(Ljava/lang/String;)V
  #509 = NameAndType        #510:#275     // setNpcs:(Ljava/lang/String;)V
  #510 = Utf8               setNpcs
  #511 = Methodref          #72.#512      // ext/mods/gameserver/model/residence/clanhall/ClanHall.setDoors:(Ljava/lang/String;)V
  #512 = NameAndType        #513:#275     // setDoors:(Ljava/lang/String;)V
  #513 = Utf8               setDoors
  #514 = Methodref          #11.#515      // ext/mods/gameserver/data/manager/ClanHallManager.addAttributes:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #515 = NameAndType        #516:#517     // addAttributes:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #516 = Utf8               addAttributes
  #517 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #518 = Methodref          #80.#519      // ext/mods/gameserver/model/zone/type/ClanHallZone.getResidenceId:()I
  #519 = NameAndType        #520:#126     // getResidenceId:()I
  #520 = Utf8               getResidenceId
  #521 = Class              #522          // ext/mods/commons/data/xml/IXmlReader
  #522 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #523 = Utf8               LOAD_CLANHALLS
  #524 = Utf8               Ljava/lang/String;
  #525 = Utf8               ConstantValue
  #526 = Utf8               LOAD_FUNCTIONS
  #527 = Utf8               Signature
  #528 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #529 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/ClanHallDeco;>;
  #530 = Utf8               Code
  #531 = Utf8               LineNumberTable
  #532 = Utf8               LocalVariableTable
  #533 = Utf8               cal
  #534 = Utf8               Ljava/util/Calendar;
  #535 = Utf8               nextSiege
  #536 = Utf8               J
  #537 = Utf8               rs2
  #538 = Utf8               Ljava/sql/ResultSet;
  #539 = Utf8               clan
  #540 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #541 = Utf8               I
  #542 = Utf8               ch
  #543 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #544 = Utf8               zone
  #545 = Utf8               Lext/mods/gameserver/model/zone/type/ClanHallZone;
  #546 = Utf8               rs
  #547 = Utf8               ps2
  #548 = Utf8               Ljava/sql/PreparedStatement;
  #549 = Utf8               ps
  #550 = Utf8               con
  #551 = Utf8               Ljava/sql/Connection;
  #552 = Utf8               e
  #553 = Utf8               Ljava/lang/Exception;
  #554 = Utf8               this
  #555 = Utf8               StackMapTable
  #556 = Utf8               parseDocument
  #557 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #558 = Utf8               doc
  #559 = Utf8               Lorg/w3c/dom/Document;
  #560 = Utf8               path
  #561 = Utf8               Ljava/nio/file/Path;
  #562 = Utf8               getClanHall
  #563 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #564 = Utf8               getSiegableHall
  #565 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #566 = Utf8               sh
  #567 = Utf8               Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #568 = Utf8               getClanHalls
  #569 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #570 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/SiegableHall;>;
  #571 = Utf8               getAuctionableClanHalls
  #572 = Utf8               auction
  #573 = Utf8               Lext/mods/gameserver/model/residence/clanhall/Auction;
  #574 = Utf8               LocalVariableTypeTable
  #575 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #576 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #577 = Utf8               getClanHallsByLocation
  #578 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #579 = Utf8               location
  #580 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
  #581 = Utf8               getClanHallByOwner
  #582 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #583 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/Auction;
  #584 = Utf8               getActiveSiege
  #585 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
  #586 = Utf8               creature
  #587 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #588 = Utf8               isClanParticipating
  #589 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Z
  #590 = Utf8               hall
  #591 = Utf8               save
  #592 = Utf8               getDecoFee
  #593 = Utf8               (II)I
  #594 = Utf8               Lext/mods/gameserver/model/records/ClanHallDeco;
  #595 = Utf8               getDecoDays
  #596 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #597 = Utf8               lambda$getDecoDays$0
  #598 = Utf8               (IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #599 = Utf8               d
  #600 = Utf8               lambda$getDecoFee$0
  #601 = Utf8               lambda$getClanHallByOwner$0
  #602 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #603 = Utf8               lambda$getClanHallsByLocation$0
  #604 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #605 = Utf8               lambda$parseDocument$8
  #606 = Utf8               (Lorg/w3c/dom/Node;)V
  #607 = Utf8               listNode
  #608 = Utf8               Lorg/w3c/dom/Node;
  #609 = Utf8               lambda$parseDocument$9
  #610 = Utf8               chdNode
  #611 = Utf8               lambda$parseDocument$0
  #612 = Utf8               lambda$parseDocument$1
  #613 = Utf8               chNode
  #614 = Utf8               set
  #615 = Utf8               Lext/mods/commons/data/StatSet;
  #616 = Utf8               lambda$parseDocument$6
  #617 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #618 = Utf8               spawnsNode
  #619 = Utf8               lambda$parseDocument$7
  #620 = Utf8               spawnNode
  #621 = Utf8               lambda$parseDocument$5
  #622 = Utf8               npcsNode
  #623 = Utf8               lambda$parseDocument$4
  #624 = Utf8               gatesNode
  #625 = Utf8               lambda$parseDocument$3
  #626 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #627 = Utf8               taxNode
  #628 = Utf8               lambda$parseDocument$2
  #629 = Utf8               agitNode
  #630 = Utf8               lambda$new$0
  #631 = Utf8               (ILext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  #632 = Utf8               z
  #633 = Utf8               SourceFile
  #634 = Utf8               ClanHallManager.java
  #635 = Utf8               NestMembers
  #636 = Utf8               BootstrapMethods
  #637 = MethodType         #360          //  (Ljava/lang/Object;)Z
  #638 = MethodHandle       6:#639        // REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$new$0:(ILext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  #639 = Methodref          #11.#640      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$new$0:(ILext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  #640 = NameAndType        #630:#631     // lambda$new$0:(ILext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  #641 = MethodType         #642          //  (Lext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  #642 = Utf8               (Lext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  #643 = MethodType         #644          //  (Ljava/lang/Object;)V
  #644 = Utf8               (Ljava/lang/Object;)V
  #645 = MethodHandle       5:#646        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #646 = Methodref          #11.#647      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #647 = NameAndType        #611:#606     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #648 = MethodType         #606          //  (Lorg/w3c/dom/Node;)V
  #649 = MethodHandle       5:#650        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$8:(Lorg/w3c/dom/Node;)V
  #650 = Methodref          #11.#651      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$8:(Lorg/w3c/dom/Node;)V
  #651 = NameAndType        #605:#606     // lambda$parseDocument$8:(Lorg/w3c/dom/Node;)V
  #652 = MethodHandle       5:#653        // REF_invokeVirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #653 = Methodref          #654.#655     // java/lang/Class.isInstance:(Ljava/lang/Object;)Z
  #654 = Class              #656          // java/lang/Class
  #655 = NameAndType        #657:#360     // isInstance:(Ljava/lang/Object;)Z
  #656 = Utf8               java/lang/Class
  #657 = Utf8               isInstance
  #658 = MethodType         #659          //  (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #659 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #660 = MethodType         #71           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #661 = MethodHandle       5:#662        // REF_invokeVirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #662 = Methodref          #654.#663     // java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #663 = NameAndType        #664:#71      // cast:(Ljava/lang/Object;)Ljava/lang/Object;
  #664 = Utf8               cast
  #665 = MethodType         #666          //  (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #666 = Utf8               (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  #667 = MethodHandle       6:#668        // REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getClanHallsByLocation$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #668 = Methodref          #11.#669      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$getClanHallsByLocation$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #669 = NameAndType        #603:#604     // lambda$getClanHallsByLocation$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #670 = MethodHandle       6:#671        // REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getClanHallByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #671 = Methodref          #11.#672      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$getClanHallByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #672 = NameAndType        #601:#602     // lambda$getClanHallByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  #673 = MethodHandle       6:#674        // REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getDecoFee$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #674 = Methodref          #11.#675      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$getDecoFee$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #675 = NameAndType        #600:#598     // lambda$getDecoFee$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #676 = MethodType         #677          //  (Lext/mods/gameserver/model/records/ClanHallDeco;)Z
  #677 = Utf8               (Lext/mods/gameserver/model/records/ClanHallDeco;)Z
  #678 = MethodHandle       6:#679        // REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getDecoDays$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #679 = Methodref          #11.#680      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$getDecoDays$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #680 = NameAndType        #597:#598     // lambda$getDecoDays$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
  #681 = MethodHandle       5:#682        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$9:(Lorg/w3c/dom/Node;)V
  #682 = Methodref          #11.#683      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$9:(Lorg/w3c/dom/Node;)V
  #683 = NameAndType        #609:#606     // lambda$parseDocument$9:(Lorg/w3c/dom/Node;)V
  #684 = MethodHandle       5:#685        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #685 = Methodref          #11.#686      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #686 = NameAndType        #612:#606     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #687 = MethodHandle       5:#688        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #688 = Methodref          #11.#689      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #689 = NameAndType        #628:#626     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #690 = MethodHandle       5:#691        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #691 = Methodref          #11.#692      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #692 = NameAndType        #625:#626     // lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #693 = MethodHandle       5:#694        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #694 = Methodref          #11.#695      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #695 = NameAndType        #623:#617     // lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #696 = MethodHandle       5:#697        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #697 = Methodref          #11.#698      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #698 = NameAndType        #621:#617     // lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #699 = MethodHandle       5:#700        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #700 = Methodref          #11.#701      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #701 = NameAndType        #616:#617     // lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #702 = MethodHandle       5:#703        // REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #703 = Methodref          #11.#704      // ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #704 = NameAndType        #619:#617     // lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
  #705 = MethodHandle       6:#706        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #706 = Methodref          #707.#708     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #707 = Class              #709          // java/lang/invoke/LambdaMetafactory
  #708 = NameAndType        #710:#711     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #709 = Utf8               java/lang/invoke/LambdaMetafactory
  #710 = Utf8               metafactory
  #711 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #712 = Utf8               InnerClasses
  #713 = Utf8               SingletonHolder
  #714 = Class              #715          // java/lang/invoke/MethodHandles$Lookup
  #715 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #716 = Class              #717          // java/lang/invoke/MethodHandles
  #717 = Utf8               java/lang/invoke/MethodHandles
  #718 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.ClanHallManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=12, locals=13, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _clanHalls:Ljava/util/Map;
        15: aload_0
        16: new           #16                 // class java/util/ArrayList
        19: dup
        20: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
        23: putfield      #19                 // Field _decos:Ljava/util/List;
        26: aload_0
        27: invokevirtual #23                 // Method load:()V
        30: invokestatic  #26                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        33: astore_1
        34: aload_1
        35: ldc           #32                 // String SELECT * FROM clanhall
        37: invokeinterface #34,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        42: astore_2
        43: aload_1
        44: ldc           #40                 // String SELECT * FROM clanhall_functions WHERE hall_id = ?
        46: invokeinterface #34,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        51: astore_3
        52: aload_2
        53: invokeinterface #42,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        58: astore        4
        60: aload         4
        62: invokeinterface #48,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        67: ifeq          541
        70: aload         4
        72: ldc           #54                 // String id
        74: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        79: istore        5
        81: aload_0
        82: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
        85: iload         5
        87: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        90: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        95: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        98: astore        6
       100: aload         6
       102: ifnonnull     108
       105: goto          60
       108: invokestatic  #74                 // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       111: ldc           #80                 // class ext/mods/gameserver/model/zone/type/ClanHallZone
       113: invokevirtual #82                 // Method ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
       116: invokeinterface #86,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
       121: iload         5
       123: invokedynamic #92,  0             // InvokeDynamic #0:test:(I)Ljava/util/function/Predicate;
       128: invokeinterface #96,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       133: invokeinterface #102,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       138: aconst_null
       139: invokevirtual #106                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       142: checkcast     #80                 // class ext/mods/gameserver/model/zone/type/ClanHallZone
       145: astore        7
       147: aload         7
       149: ifnonnull     172
       152: getstatic     #111                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       155: ldc           #115                // String No existing ClanHallZone for ClanHall {}.
       157: iconst_1
       158: anewarray     #2                  // class java/lang/Object
       161: dup
       162: iconst_0
       163: iload         5
       165: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       168: aastore
       169: invokevirtual #117                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       172: aload         6
       174: invokevirtual #123                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuctionMin:()I
       177: ifle          233
       180: aload         6
       182: new           #127                // class ext/mods/gameserver/model/residence/clanhall/Auction
       185: dup
       186: aload         6
       188: aload         4
       190: ldc           #129                // String sellerBid
       192: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       197: aload         4
       199: ldc           #131                // String sellerName
       201: invokeinterface #133,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       206: aload         4
       208: ldc           #137                // String sellerClanName
       210: invokeinterface #133,  2          // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
       215: aload         4
       217: ldc           #139                // String endDate
       219: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       224: invokespecial #145                // Method ext/mods/gameserver/model/residence/clanhall/Auction."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;ILjava/lang/String;Ljava/lang/String;J)V
       227: invokevirtual #148                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setAuction:(Lext/mods/gameserver/model/residence/clanhall/Auction;)V
       230: goto          288
       233: aload         4
       235: ldc           #139                // String endDate
       237: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       242: lstore        8
       244: lload         8
       246: invokestatic  #152                // Method java/lang/System.currentTimeMillis:()J
       249: lsub
       250: lconst_0
       251: lcmp
       252: ifge          266
       255: aload         6
       257: checkcast     #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       260: invokevirtual #160                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.updateNextSiege:()V
       263: goto          288
       266: invokestatic  #163                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       269: astore        10
       271: aload         10
       273: lload         8
       275: invokevirtual #168                // Method java/util/Calendar.setTimeInMillis:(J)V
       278: aload         6
       280: checkcast     #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
       283: aload         10
       285: invokevirtual #172                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.setNextSiegeDate:(Ljava/util/Calendar;)V
       288: aload         6
       290: aload         7
       292: invokevirtual #176                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setZone:(Lext/mods/gameserver/model/zone/type/ClanHallZone;)V
       295: aload         4
       297: ldc           #180                // String ownerId
       299: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       304: istore        8
       306: iload         8
       308: ifle          538
       311: invokestatic  #182                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       314: iload         8
       316: invokevirtual #187                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       319: astore        9
       321: aload         9
       323: ifnonnull     334
       326: aload         6
       328: invokevirtual #191                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.free:()V
       331: goto          60
       334: aload         9
       336: iload         5
       338: invokevirtual #194                // Method ext/mods/gameserver/model/pledge/Clan.setClanHallId:(I)V
       341: aload         6
       343: iload         8
       345: invokevirtual #200                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setOwnerId:(I)V
       348: aload         6
       350: aload         4
       352: ldc           #203                // String paidUntil
       354: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       359: invokevirtual #205                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setPaidUntil:(J)V
       362: aload         6
       364: aload         4
       366: ldc           #208                // String paid
       368: invokeinterface #210,  2          // InterfaceMethod java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
       373: invokevirtual #214                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.setPaid:(Z)V
       376: aload         6
       378: invokevirtual #218                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.initializeFeeTask:()V
       381: aload_3
       382: iconst_1
       383: iload         5
       385: invokeinterface #221,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       390: aload_3
       391: invokeinterface #42,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       396: astore        10
       398: aload         10
       400: invokeinterface #48,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       405: ifeq          488
       408: aload         6
       410: invokevirtual #225                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunctions:()Ljava/util/Map;
       413: aload         10
       415: ldc           #229                // String type
       417: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       422: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       425: new           #231                // class ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
       428: dup
       429: aload         6
       431: aload         10
       433: ldc           #229                // String type
       435: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       440: aload         10
       442: ldc           #233                // String lvl
       444: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       449: aload         10
       451: ldc           #235                // String lease
       453: invokeinterface #56,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       458: aload         10
       460: ldc           #237                // String rate
       462: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       467: aload         10
       469: ldc           #239                // String endTime
       471: invokeinterface #141,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       476: invokespecial #241                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction."<init>":(Lext/mods/gameserver/model/residence/clanhall/ClanHall;IIIJJ)V
       479: invokeinterface #244,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       484: pop
       485: goto          398
       488: aload         10
       490: ifnull        532
       493: aload         10
       495: invokeinterface #248,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       500: goto          532
       503: astore        11
       505: aload         10
       507: ifnull        529
       510: aload         10
       512: invokeinterface #248,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       517: goto          529
       520: astore        12
       522: aload         11
       524: aload         12
       526: invokevirtual #253                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       529: aload         11
       531: athrow
       532: aload_3
       533: invokeinterface #257,  1          // InterfaceMethod java/sql/PreparedStatement.clearParameters:()V
       538: goto          60
       541: aload         4
       543: ifnull        585
       546: aload         4
       548: invokeinterface #248,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       553: goto          585
       556: astore        5
       558: aload         4
       560: ifnull        582
       563: aload         4
       565: invokeinterface #248,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       570: goto          582
       573: astore        6
       575: aload         5
       577: aload         6
       579: invokevirtual #253                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       582: aload         5
       584: athrow
       585: aload_3
       586: ifnull        625
       589: aload_3
       590: invokeinterface #260,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       595: goto          625
       598: astore        4
       600: aload_3
       601: ifnull        622
       604: aload_3
       605: invokeinterface #260,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       610: goto          622
       613: astore        5
       615: aload         4
       617: aload         5
       619: invokevirtual #253                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       622: aload         4
       624: athrow
       625: aload_2
       626: ifnull        662
       629: aload_2
       630: invokeinterface #260,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       635: goto          662
       638: astore_3
       639: aload_2
       640: ifnull        660
       643: aload_2
       644: invokeinterface #260,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       649: goto          660
       652: astore        4
       654: aload_3
       655: aload         4
       657: invokevirtual #253                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       660: aload_3
       661: athrow
       662: aload_1
       663: ifnull        697
       666: aload_1
       667: invokeinterface #261,  1          // InterfaceMethod java/sql/Connection.close:()V
       672: goto          697
       675: astore_2
       676: aload_1
       677: ifnull        695
       680: aload_1
       681: invokeinterface #261,  1          // InterfaceMethod java/sql/Connection.close:()V
       686: goto          695
       689: astore_3
       690: aload_2
       691: aload_3
       692: invokevirtual #253                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       695: aload_2
       696: athrow
       697: goto          711
       700: astore_1
       701: getstatic     #111                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       704: ldc_w         #264                // String Couldn\'t load clan hall data.
       707: aload_1
       708: invokevirtual #266                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       711: return
      Exception table:
         from    to  target type
           398   488   503   Class java/lang/Throwable
           510   517   520   Class java/lang/Throwable
            60   541   556   Class java/lang/Throwable
           563   570   573   Class java/lang/Throwable
            52   585   598   Class java/lang/Throwable
           604   610   613   Class java/lang/Throwable
            43   625   638   Class java/lang/Throwable
           643   649   652   Class java/lang/Throwable
            34   662   675   Class java/lang/Throwable
           680   686   689   Class java/lang/Throwable
            30   697   700   Class java/lang/Exception
      LineNumberTable:
        line 60: 0
        line 56: 4
        line 57: 15
        line 61: 26
        line 63: 30
        line 64: 34
        line 65: 43
        line 66: 52
        line 68: 60
        line 70: 70
        line 72: 81
        line 73: 100
        line 74: 105
        line 76: 108
        line 77: 147
        line 78: 152
        line 80: 172
        line 81: 180
        line 84: 233
        line 85: 244
        line 86: 255
        line 89: 266
        line 90: 271
        line 92: 278
        line 96: 288
        line 98: 295
        line 99: 306
        line 101: 311
        line 102: 321
        line 104: 326
        line 105: 331
        line 108: 334
        line 110: 341
        line 111: 348
        line 112: 362
        line 114: 376
        line 116: 381
        line 118: 390
        line 120: 398
        line 121: 408
        line 122: 488
        line 118: 503
        line 123: 532
        line 125: 538
        line 126: 541
        line 63: 556
        line 126: 585
        line 63: 598
        line 126: 625
        line 63: 638
        line 126: 662
        line 63: 675
        line 130: 697
        line 127: 700
        line 129: 701
        line 131: 711
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          271      17    10   cal   Ljava/util/Calendar;
          244      44     8 nextSiege   J
          398     134    10   rs2   Ljava/sql/ResultSet;
          321     217     9  clan   Lext/mods/gameserver/model/pledge/Clan;
           81     457     5    id   I
          100     438     6    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
          147     391     7  zone   Lext/mods/gameserver/model/zone/type/ClanHallZone;
          306     232     8 ownerId   I
           60     525     4    rs   Ljava/sql/ResultSet;
           52     573     3   ps2   Ljava/sql/PreparedStatement;
           43     619     2    ps   Ljava/sql/PreparedStatement;
           34     663     1   con   Ljava/sql/Connection;
          701      10     1     e   Ljava/lang/Exception;
            0     712     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
      StackMapTable: number_of_entries = 33
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ int, class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/model/zone/type/ClanHallZone ]
        frame_type = 60 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ long ]
        frame_type = 250 /* chop */
          offset_delta = 21
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ int, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class java/sql/ResultSet ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 89
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/gameserver/model/residence/clanhall/ClanHall, class ext/mods/gameserver/model/zone/type/ClanHallZone, int, class ext/mods/gameserver/model/pledge/Clan, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/ClanHallManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc_w         #270                // String xml/clanHalls.xml
         4: invokevirtual #272                // Method parseDataFile:(Ljava/lang/String;)V
         7: aload_0
         8: ldc_w         #276                // String xml/clanHallDeco.xml
        11: invokevirtual #272                // Method parseDataFile:(Ljava/lang/String;)V
        14: getstatic     #111                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        17: ldc_w         #278                // String Loaded {} clan halls and {} siegable clan halls.
        20: iconst_2
        21: anewarray     #2                  // class java/lang/Object
        24: dup
        25: iconst_0
        26: aload_0
        27: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
        30: invokeinterface #280,  1          // InterfaceMethod java/util/Map.size:()I
        35: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: aastore
        39: dup
        40: iconst_1
        41: aload_0
        42: invokevirtual #283                // Method getSiegableHalls:()Ljava/util/List;
        45: invokeinterface #287,  1          // InterfaceMethod java/util/List.size:()I
        50: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: aastore
        54: invokevirtual #290                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        57: return
      LineNumberTable:
        line 136: 0
        line 137: 7
        line 138: 14
        line 139: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_2
         1: ldc_w         #293                // String clanHalls.xml
         4: invokeinterface #295,  2          // InterfaceMethod java/nio/file/Path.endsWith:(Ljava/lang/String;)Z
         9: ifeq          29
        12: aload_0
        13: aload_1
        14: ldc_w         #300                // String list
        17: aload_0
        18: invokedynamic #302,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
        23: invokevirtual #306                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        26: goto          43
        29: aload_0
        30: aload_1
        31: ldc_w         #300                // String list
        34: aload_0
        35: invokedynamic #310,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/data/manager/ClanHallManager;)Ljava/util/function/Consumer;
        40: invokevirtual #306                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        43: return
      LineNumberTable:
        line 144: 0
        line 146: 12
        line 163: 29
        line 168: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      44     1   doc   Lorg/w3c/dom/Document;
            0      44     2  path   Ljava/nio/file/Path;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 13 /* same */

  public final ext.mods.gameserver.model.residence.clanhall.ClanHall getClanHall(int);
    descriptor: (I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        16: areturn
      LineNumberTable:
        line 176: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      17     1    id   I

  public ext.mods.gameserver.model.residence.clanhall.SiegableHall getSiegableHall(int);
    descriptor: (I)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        16: astore_2
        17: aload_2
        18: instanceof    #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        21: ifeq          33
        24: aload_2
        25: checkcast     #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        28: astore_3
        29: aload_3
        30: goto          34
        33: aconst_null
        34: areturn
      LineNumberTable:
        line 185: 0
        line 186: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       4     3    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      35     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      35     1    id   I
           17      18     2    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall ]

  public final java.util.Map<java.lang.Integer, ext.mods.gameserver.model.residence.clanhall.ClanHall> getClanHalls();
    descriptor: ()Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: areturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
    Signature: #569                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;

  public java.util.List<ext.mods.gameserver.model.residence.clanhall.SiegableHall> getSiegableHalls();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: invokeinterface #311,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #86,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: ldc           #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        16: dup
        17: invokestatic  #315                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        20: pop
        21: invokedynamic #320,  0            // InvokeDynamic #3:test:(Ljava/lang/Class;)Ljava/util/function/Predicate;
        26: invokeinterface #96,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        31: ldc           #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        33: dup
        34: invokestatic  #315                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        37: pop
        38: invokedynamic #323,  0            // InvokeDynamic #4:apply:(Ljava/lang/Class;)Ljava/util/function/Function;
        43: invokeinterface #327,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        48: invokeinterface #331,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        53: areturn
      LineNumberTable:
        line 202: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
    Signature: #570                         // ()Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/SiegableHall;>;

  public final java.util.List<ext.mods.gameserver.model.residence.clanhall.ClanHall> getAuctionableClanHalls();
    descriptor: ()Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=1
         0: new           #16                 // class java/util/ArrayList
         3: dup
         4: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
        12: invokeinterface #311,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        17: invokeinterface #334,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        22: astore_2
        23: aload_2
        24: invokeinterface #338,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          85
        32: aload_2
        33: invokeinterface #343,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        41: astore_3
        42: aload_3
        43: invokevirtual #346                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
        46: astore        4
        48: aload         4
        50: ifnonnull     56
        53: goto          23
        56: aload_3
        57: invokevirtual #350                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getOwnerId:()I
        60: ifle          74
        63: aload         4
        65: invokevirtual #353                // Method ext/mods/gameserver/model/residence/clanhall/Auction.getSeller:()Lext/mods/gameserver/model/residence/clanhall/Seller;
        68: ifnonnull     74
        71: goto          23
        74: aload_1
        75: aload_3
        76: invokeinterface #357,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        81: pop
        82: goto          23
        85: aload_1
        86: areturn
      LineNumberTable:
        line 210: 0
        line 211: 8
        line 213: 42
        line 214: 48
        line 215: 53
        line 217: 56
        line 218: 71
        line 220: 74
        line 221: 82
        line 222: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      34     4 auction   Lext/mods/gameserver/model/residence/clanhall/Auction;
           42      40     3    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0      87     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            8      79     1  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      79     1  list   Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall, class ext/mods/gameserver/model/residence/clanhall/Auction ]
        frame_type = 17 /* same */
        frame_type = 248 /* chop */
          offset_delta = 10
    Signature: #576                         // ()Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;

  public final java.util.List<ext.mods.gameserver.model.residence.clanhall.ClanHall> getClanHallsByLocation(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: invokeinterface #311,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #86,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #361,  0            // InvokeDynamic #5:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #96,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #331,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        30: areturn
      LineNumberTable:
        line 231: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      31     1 location   Ljava/lang/String;
    Signature: #580                         // (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/residence/clanhall/ClanHall;>;

  public final ext.mods.gameserver.model.residence.clanhall.ClanHall getClanHallByOwner(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: invokeinterface #311,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #86,  1           // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #364,  0            // InvokeDynamic #6:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
        20: invokeinterface #96,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #102,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #106                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        37: areturn
      LineNumberTable:
        line 240: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      38     1  clan   Lext/mods/gameserver/model/pledge/Clan;

  public final ext.mods.gameserver.model.residence.clanhall.Auction getAuction(int);
    descriptor: (I)Lext/mods/gameserver/model/residence/clanhall/Auction;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #60                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #66,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        16: astore_2
        17: aload_2
        18: ifnonnull     25
        21: aconst_null
        22: goto          29
        25: aload_2
        26: invokevirtual #346                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getAuction:()Lext/mods/gameserver/model/residence/clanhall/Auction;
        29: areturn
      LineNumberTable:
        line 249: 0
        line 250: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      30     1    id   I
           17      13     2    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/residence/clanhall/ClanHall ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/residence/clanhall/Auction ]

  public final ext.mods.gameserver.model.residence.clanhall.ClanHallSiege getActiveSiege(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _clanHalls:Ljava/util/Map;
         4: invokeinterface #311,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #334,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_2
        15: aload_2
        16: invokeinterface #338,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          79
        24: aload_2
        25: invokeinterface #343,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #72                 // class ext/mods/gameserver/model/residence/clanhall/ClanHall
        33: astore_3
        34: aload_3
        35: instanceof    #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        38: ifeq          15
        41: aload_3
        42: checkcast     #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        45: astore        4
        47: aload         4
        49: invokevirtual #367                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        52: invokevirtual #371                // Method ext/mods/gameserver/model/zone/type/SiegeZone.isActive:()Z
        55: ifeq          76
        58: aload         4
        60: invokevirtual #367                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        63: aload_1
        64: invokevirtual #376                // Method ext/mods/gameserver/model/zone/type/SiegeZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        67: ifeq          76
        70: aload         4
        72: invokevirtual #380                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        75: areturn
        76: goto          15
        79: aconst_null
        80: areturn
      LineNumberTable:
        line 255: 0
        line 257: 34
        line 260: 47
        line 261: 70
        line 262: 76
        line 263: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      29     4    sh   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
           34      42     3    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
            0      81     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      81     1 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 60 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final boolean isClanParticipating(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #283                // Method getSiegableHalls:()Ljava/util/List;
         4: invokeinterface #384,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_2
        10: aload_2
        11: invokeinterface #338,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          57
        19: aload_2
        20: invokeinterface #343,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        28: astore_3
        29: aload_3
        30: invokevirtual #380                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        33: ifnull        54
        36: aload_3
        37: invokevirtual #380                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        40: invokevirtual #385                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.getAttackerClans:()Ljava/util/List;
        43: aload_1
        44: invokeinterface #390,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        49: ifeq          54
        52: iconst_1
        53: ireturn
        54: goto          10
        57: iconst_0
        58: ireturn
      LineNumberTable:
        line 268: 0
        line 270: 29
        line 271: 52
        line 272: 54
        line 273: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      25     3  hall   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      59     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      59     1  clan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 43 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public final void save();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #283                // Method getSiegableHalls:()Ljava/util/List;
         4: invokeinterface #384,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #338,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          58
        19: aload_1
        20: invokeinterface #343,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #158                // class ext/mods/gameserver/model/residence/clanhall/SiegableHall
        28: astore_2
        29: aload_2
        30: invokevirtual #393                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getId:()I
        33: bipush        62
        35: if_icmpeq     10
        38: aload_2
        39: invokevirtual #380                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        42: ifnonnull     48
        45: goto          10
        48: aload_2
        49: invokevirtual #380                // Method ext/mods/gameserver/model/residence/clanhall/SiegableHall.getSiege:()Lext/mods/gameserver/model/residence/clanhall/ClanHallSiege;
        52: invokevirtual #396                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallSiege.saveAttackers:()V
        55: goto          10
        58: return
      LineNumberTable:
        line 278: 0
        line 280: 29
        line 281: 45
        line 283: 48
        line 284: 55
        line 285: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      26     2  hall   Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
            0      59     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/residence/clanhall/SiegableHall ]
        frame_type = 249 /* chop */
          offset_delta = 9

  public final int getDecoFee(int, int);
    descriptor: (II)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: getfield      #19                 // Field _decos:Ljava/util/List;
         4: invokeinterface #399,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: iload_2
        11: invokedynamic #400,  0            // InvokeDynamic #7:test:(II)Ljava/util/function/Predicate;
        16: invokeinterface #96,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokeinterface #102,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        26: aconst_null
        27: invokevirtual #106                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #403                // class ext/mods/gameserver/model/records/ClanHallDeco
        33: astore_3
        34: aload_3
        35: ifnull        43
        38: aload_3
        39: invokevirtual #405                // Method ext/mods/gameserver/model/records/ClanHallDeco.price:()I
        42: ireturn
        43: iconst_0
        44: ireturn
      LineNumberTable:
        line 289: 0
        line 290: 34
        line 291: 38
        line 293: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      45     1  type   I
            0      45     2 level   I
           34      11     3  deco   Lext/mods/gameserver/model/records/ClanHallDeco;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/records/ClanHallDeco ]

  public final int getDecoDays(int, int);
    descriptor: (II)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: getfield      #19                 // Field _decos:Ljava/util/List;
         4: invokeinterface #399,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: iload_1
        10: iload_2
        11: invokedynamic #408,  0            // InvokeDynamic #8:test:(II)Ljava/util/function/Predicate;
        16: invokeinterface #96,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        21: invokeinterface #102,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        26: aconst_null
        27: invokevirtual #106                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #403                // class ext/mods/gameserver/model/records/ClanHallDeco
        33: astore_3
        34: aload_3
        35: ifnull        43
        38: aload_3
        39: invokevirtual #409                // Method ext/mods/gameserver/model/records/ClanHallDeco.days:()I
        42: ireturn
        43: iconst_0
        44: ireturn
      LineNumberTable:
        line 298: 0
        line 299: 34
        line 300: 38
        line 302: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/data/manager/ClanHallManager;
            0      45     1  type   I
            0      45     2 level   I
           34      11     3  deco   Lext/mods/gameserver/model/records/ClanHallDeco;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/records/ClanHallDeco ]

  public static ext.mods.gameserver.data.manager.ClanHallManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/ClanHallManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #412                // Field ext/mods/gameserver/data/manager/ClanHallManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/ClanHallManager;
         3: areturn
      LineNumberTable:
        line 307: 0
}
SourceFile: "ClanHallManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/ClanHallManager$SingletonHolder
BootstrapMethods:
  0: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #637 (Ljava/lang/Object;)Z
      #638 REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$new$0:(ILext/mods/gameserver/model/zone/type/ClanHallZone;)Z
      #641 (Lext/mods/gameserver/model/zone/type/ClanHallZone;)Z
  1: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #645 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  2: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #649 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$8:(Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  3: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #637 (Ljava/lang/Object;)Z
      #652 REF_invokeVirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
      #658 (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  4: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #660 (Ljava/lang/Object;)Ljava/lang/Object;
      #661 REF_invokeVirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
      #665 (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Lext/mods/gameserver/model/residence/clanhall/SiegableHall;
  5: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #637 (Ljava/lang/Object;)Z
      #667 REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getClanHallsByLocation$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
      #658 (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  6: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #637 (Ljava/lang/Object;)Z
      #670 REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getClanHallByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
      #658 (Lext/mods/gameserver/model/residence/clanhall/ClanHall;)Z
  7: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #637 (Ljava/lang/Object;)Z
      #673 REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getDecoFee$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
      #676 (Lext/mods/gameserver/model/records/ClanHallDeco;)Z
  8: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #637 (Ljava/lang/Object;)Z
      #678 REF_invokeStatic ext/mods/gameserver/data/manager/ClanHallManager.lambda$getDecoDays$0:(IILext/mods/gameserver/model/records/ClanHallDeco;)Z
      #676 (Lext/mods/gameserver/model/records/ClanHallDeco;)Z
  9: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #681 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$9:(Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  10: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #684 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  11: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #687 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  12: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #690 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$3:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  13: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #693 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  14: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #696 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  15: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #699 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
  16: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #643 (Ljava/lang/Object;)V
      #702 REF_invokeVirtual ext/mods/gameserver/data/manager/ClanHallManager.lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/clanhall/ClanHall;Lorg/w3c/dom/Node;)V
      #648 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #718= #714 of #716; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
