// Bytecode for: ext.mods.gameserver.data.manager.CastleManager
// File: ext\mods\gameserver\data\manager\CastleManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/CastleManager.class
  Last modified 9 de jul de 2026; size 22002 bytes
  MD5 checksum 2e8b7e2644581dbdcf523cfdaebd0de3
  Compiled from "CastleManager.java"
public final class ext.mods.gameserver.data.manager.CastleManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/CastleManager
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 6, methods: 47, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/CastleManager._castles:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/CastleManager
   #12 = NameAndType        #14:#15       // _castles:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #14 = Utf8               _castles
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #11.#17       // ext/mods/gameserver/data/manager/CastleManager.load:()V
   #17 = NameAndType        #18:#6        // load:()V
   #18 = Utf8               load
   #19 = Methodref          #20.#21       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #20 = Class              #22           // ext/mods/commons/pool/ConnectionPool
   #21 = NameAndType        #23:#24       // getConnection:()Ljava/sql/Connection;
   #22 = Utf8               ext/mods/commons/pool/ConnectionPool
   #23 = Utf8               getConnection
   #24 = Utf8               ()Ljava/sql/Connection;
   #25 = String             #26           // SELECT * FROM castle ORDER BY id
   #26 = Utf8               SELECT * FROM castle ORDER BY id
   #27 = InterfaceMethodref #28.#29       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #28 = Class              #30           // java/sql/Connection
   #29 = NameAndType        #31:#32       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #30 = Utf8               java/sql/Connection
   #31 = Utf8               prepareStatement
   #32 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #33 = InterfaceMethodref #34.#35       // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #34 = Class              #36           // java/sql/PreparedStatement
   #35 = NameAndType        #37:#38       // executeQuery:()Ljava/sql/ResultSet;
   #36 = Utf8               java/sql/PreparedStatement
   #37 = Utf8               executeQuery
   #38 = Utf8               ()Ljava/sql/ResultSet;
   #39 = InterfaceMethodref #40.#41       // java/sql/ResultSet.next:()Z
   #40 = Class              #42           // java/sql/ResultSet
   #41 = NameAndType        #43:#44       // next:()Z
   #42 = Utf8               java/sql/ResultSet
   #43 = Utf8               next
   #44 = Utf8               ()Z
   #45 = String             #46           // id
   #46 = Utf8               id
   #47 = InterfaceMethodref #40.#48       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #48 = NameAndType        #49:#50       // getInt:(Ljava/lang/String;)I
   #49 = Utf8               getInt
   #50 = Utf8               (Ljava/lang/String;)I
   #51 = Methodref          #52.#53       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #52 = Class              #54           // java/lang/Integer
   #53 = NameAndType        #55:#56       // valueOf:(I)Ljava/lang/Integer;
   #54 = Utf8               java/lang/Integer
   #55 = Utf8               valueOf
   #56 = Utf8               (I)Ljava/lang/Integer;
   #57 = InterfaceMethodref #58.#59       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #58 = Class              #60           // java/util/Map
   #59 = NameAndType        #61:#62       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #60 = Utf8               java/util/Map
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #63 = Class              #64           // ext/mods/gameserver/model/residence/castle/Castle
   #64 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #65 = Methodref          #66.#67       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #66 = Class              #68           // java/util/Calendar
   #67 = NameAndType        #69:#70       // getInstance:()Ljava/util/Calendar;
   #68 = Utf8               java/util/Calendar
   #69 = Utf8               getInstance
   #70 = Utf8               ()Ljava/util/Calendar;
   #71 = Methodref          #63.#72       // ext/mods/gameserver/model/residence/castle/Castle.setSiegeDate:(Ljava/util/Calendar;)V
   #72 = NameAndType        #73:#74       // setSiegeDate:(Ljava/util/Calendar;)V
   #73 = Utf8               setSiegeDate
   #74 = Utf8               (Ljava/util/Calendar;)V
   #75 = Methodref          #63.#76       // ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
   #76 = NameAndType        #77:#70       // getSiegeDate:()Ljava/util/Calendar;
   #77 = Utf8               getSiegeDate
   #78 = String             #79           // siegeDate
   #79 = Utf8               siegeDate
   #80 = InterfaceMethodref #40.#81       // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
   #81 = NameAndType        #82:#83       // getLong:(Ljava/lang/String;)J
   #82 = Utf8               getLong
   #83 = Utf8               (Ljava/lang/String;)J
   #84 = Methodref          #66.#85       // java/util/Calendar.setTimeInMillis:(J)V
   #85 = NameAndType        #86:#87       // setTimeInMillis:(J)V
   #86 = Utf8               setTimeInMillis
   #87 = Utf8               (J)V
   #88 = String             #89           // regTimeOver
   #89 = Utf8               regTimeOver
   #90 = InterfaceMethodref #40.#91       // java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
   #91 = NameAndType        #92:#93       // getBoolean:(Ljava/lang/String;)Z
   #92 = Utf8               getBoolean
   #93 = Utf8               (Ljava/lang/String;)Z
   #94 = Methodref          #63.#95       // ext/mods/gameserver/model/residence/castle/Castle.setTimeRegistrationOver:(Z)V
   #95 = NameAndType        #96:#97       // setTimeRegistrationOver:(Z)V
   #96 = Utf8               setTimeRegistrationOver
   #97 = Utf8               (Z)V
   #98 = String             #99           // currentTaxPercent
   #99 = Utf8               currentTaxPercent
  #100 = Methodref          #63.#101      // ext/mods/gameserver/model/residence/castle/Castle.setCurrentTaxPercent:(IZ)V
  #101 = NameAndType        #102:#103     // setCurrentTaxPercent:(IZ)V
  #102 = Utf8               setCurrentTaxPercent
  #103 = Utf8               (IZ)V
  #104 = String             #105          // nextTaxPercent
  #105 = Utf8               nextTaxPercent
  #106 = Methodref          #63.#107      // ext/mods/gameserver/model/residence/castle/Castle.setNextTaxPercent:(IZ)V
  #107 = NameAndType        #108:#103     // setNextTaxPercent:(IZ)V
  #108 = Utf8               setNextTaxPercent
  #109 = String             #110          // treasury
  #110 = Utf8               treasury
  #111 = Methodref          #63.#112      // ext/mods/gameserver/model/residence/castle/Castle.setTreasury:(J)V
  #112 = NameAndType        #113:#87      // setTreasury:(J)V
  #113 = Utf8               setTreasury
  #114 = String             #115          // taxRevenue
  #115 = Utf8               taxRevenue
  #116 = Methodref          #63.#117      // ext/mods/gameserver/model/residence/castle/Castle.setTaxRevenue:(J)V
  #117 = NameAndType        #118:#87      // setTaxRevenue:(J)V
  #118 = Utf8               setTaxRevenue
  #119 = String             #120          // seedIncome
  #120 = Utf8               seedIncome
  #121 = Methodref          #63.#122      // ext/mods/gameserver/model/residence/castle/Castle.setSeedIncome:(J)V
  #122 = NameAndType        #123:#87      // setSeedIncome:(J)V
  #123 = Utf8               setSeedIncome
  #124 = String             #125          // certificates
  #125 = Utf8               certificates
  #126 = Methodref          #63.#127      // ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
  #127 = NameAndType        #128:#103     // setLeftCertificates:(IZ)V
  #128 = Utf8               setLeftCertificates
  #129 = String             #130          // SELECT clan_id FROM clan_data WHERE hasCastle=?
  #130 = Utf8               SELECT clan_id FROM clan_data WHERE hasCastle=?
  #131 = String             #132          // SELECT * FROM castle_trapupgrade WHERE castleId=?
  #132 = Utf8               SELECT * FROM castle_trapupgrade WHERE castleId=?
  #133 = String             #134          // SELECT * FROM castle_doorupgrade WHERE castleId=?
  #134 = Utf8               SELECT * FROM castle_doorupgrade WHERE castleId=?
  #135 = Methodref          #63.#136      // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #136 = NameAndType        #137:#138     // getId:()I
  #137 = Utf8               getId
  #138 = Utf8               ()I
  #139 = InterfaceMethodref #34.#140      // java/sql/PreparedStatement.setInt:(II)V
  #140 = NameAndType        #141:#142     // setInt:(II)V
  #141 = Utf8               setInt
  #142 = Utf8               (II)V
  #143 = String             #144          // clan_id
  #144 = Utf8               clan_id
  #145 = Methodref          #146.#147     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #146 = Class              #148          // ext/mods/gameserver/data/sql/ClanTable
  #147 = NameAndType        #69:#149      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #148 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #149 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #150 = Methodref          #146.#151     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #151 = NameAndType        #152:#153     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #152 = Utf8               getClan
  #153 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #154 = Methodref          #63.#155      // ext/mods/gameserver/model/residence/castle/Castle.setOwnerId:(I)V
  #155 = NameAndType        #156:#157     // setOwnerId:(I)V
  #156 = Utf8               setOwnerId
  #157 = Utf8               (I)V
  #158 = InterfaceMethodref #40.#159      // java/sql/ResultSet.close:()V
  #159 = NameAndType        #160:#6       // close:()V
  #160 = Utf8               close
  #161 = Class              #162          // java/lang/Throwable
  #162 = Utf8               java/lang/Throwable
  #163 = Methodref          #161.#164     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #164 = NameAndType        #165:#166     // addSuppressed:(Ljava/lang/Throwable;)V
  #165 = Utf8               addSuppressed
  #166 = Utf8               (Ljava/lang/Throwable;)V
  #167 = Methodref          #63.#168      // ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
  #168 = NameAndType        #169:#170     // getControlTowers:()Ljava/util/List;
  #169 = Utf8               getControlTowers
  #170 = Utf8               ()Ljava/util/List;
  #171 = String             #172          // towerIndex
  #172 = Utf8               towerIndex
  #173 = InterfaceMethodref #174.#175     // java/util/List.get:(I)Ljava/lang/Object;
  #174 = Class              #176          // java/util/List
  #175 = NameAndType        #61:#177      // get:(I)Ljava/lang/Object;
  #176 = Utf8               java/util/List
  #177 = Utf8               (I)Ljava/lang/Object;
  #178 = Class              #179          // ext/mods/gameserver/model/location/TowerSpawnLocation
  #179 = Utf8               ext/mods/gameserver/model/location/TowerSpawnLocation
  #180 = String             #181          // level
  #181 = Utf8               level
  #182 = Methodref          #178.#183     // ext/mods/gameserver/model/location/TowerSpawnLocation.setUpgradeLevel:(I)V
  #183 = NameAndType        #184:#157     // setUpgradeLevel:(I)V
  #184 = Utf8               setUpgradeLevel
  #185 = Methodref          #63.#186      // ext/mods/gameserver/model/residence/castle/Castle.launchSiege:()V
  #186 = NameAndType        #187:#6       // launchSiege:()V
  #187 = Utf8               launchSiege
  #188 = String             #189          // doorId
  #189 = Utf8               doorId
  #190 = String             #191          // hp
  #191 = Utf8               hp
  #192 = Methodref          #63.#193      // ext/mods/gameserver/model/residence/castle/Castle.upgradeDoor:(IIZ)V
  #193 = NameAndType        #194:#195     // upgradeDoor:(IIZ)V
  #194 = Utf8               upgradeDoor
  #195 = Utf8               (IIZ)V
  #196 = InterfaceMethodref #34.#159      // java/sql/PreparedStatement.close:()V
  #197 = InterfaceMethodref #28.#159      // java/sql/Connection.close:()V
  #198 = Class              #199          // java/lang/Exception
  #199 = Utf8               java/lang/Exception
  #200 = Fieldref           #11.#201      // ext/mods/gameserver/data/manager/CastleManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #201 = NameAndType        #202:#203     // LOGGER:Lext/mods/commons/logging/CLogger;
  #202 = Utf8               LOGGER
  #203 = Utf8               Lext/mods/commons/logging/CLogger;
  #204 = String             #205          // Failed to load castles.
  #205 = Utf8               Failed to load castles.
  #206 = Methodref          #207.#208     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #207 = Class              #209          // ext/mods/commons/logging/CLogger
  #208 = NameAndType        #210:#211     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #209 = Utf8               ext/mods/commons/logging/CLogger
  #210 = Utf8               error
  #211 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #212 = String             #213          // xml/castles.xml
  #213 = Utf8               xml/castles.xml
  #214 = Methodref          #11.#215      // ext/mods/gameserver/data/manager/CastleManager.parseDataFile:(Ljava/lang/String;)V
  #215 = NameAndType        #216:#217     // parseDataFile:(Ljava/lang/String;)V
  #216 = Utf8               parseDataFile
  #217 = Utf8               (Ljava/lang/String;)V
  #218 = String             #219          // Loaded {} castles.
  #219 = Utf8               Loaded {} castles.
  #220 = InterfaceMethodref #58.#221      // java/util/Map.size:()I
  #221 = NameAndType        #222:#138     // size:()I
  #222 = Utf8               size
  #223 = Methodref          #207.#224     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #224 = NameAndType        #225:#226     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #225 = Utf8               info
  #226 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #227 = String             #228          // list
  #228 = Utf8               list
  #229 = InvokeDynamic      #0:#230       // #0:accept:(Lext/mods/gameserver/data/manager/CastleManager;)Ljava/util/function/Consumer;
  #230 = NameAndType        #231:#232     // accept:(Lext/mods/gameserver/data/manager/CastleManager;)Ljava/util/function/Consumer;
  #231 = Utf8               accept
  #232 = Utf8               (Lext/mods/gameserver/data/manager/CastleManager;)Ljava/util/function/Consumer;
  #233 = Methodref          #11.#234      // ext/mods/gameserver/data/manager/CastleManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #234 = NameAndType        #235:#236     // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #235 = Utf8               forEach
  #236 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
  #237 = InterfaceMethodref #58.#238      // java/util/Map.values:()Ljava/util/Collection;
  #238 = NameAndType        #239:#240     // values:()Ljava/util/Collection;
  #239 = Utf8               values
  #240 = Utf8               ()Ljava/util/Collection;
  #241 = InterfaceMethodref #242.#243     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #242 = Class              #244          // java/util/Collection
  #243 = NameAndType        #245:#246     // stream:()Ljava/util/stream/Stream;
  #244 = Utf8               java/util/Collection
  #245 = Utf8               stream
  #246 = Utf8               ()Ljava/util/stream/Stream;
  #247 = InvokeDynamic      #1:#248       // #1:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #248 = NameAndType        #249:#250     // test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #249 = Utf8               test
  #250 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
  #251 = InterfaceMethodref #252.#253     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #252 = Class              #254          // java/util/stream/Stream
  #253 = NameAndType        #255:#256     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #254 = Utf8               java/util/stream/Stream
  #255 = Utf8               filter
  #256 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #257 = InterfaceMethodref #252.#258     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #258 = NameAndType        #259:#260     // findFirst:()Ljava/util/Optional;
  #259 = Utf8               findFirst
  #260 = Utf8               ()Ljava/util/Optional;
  #261 = Methodref          #262.#263     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #262 = Class              #264          // java/util/Optional
  #263 = NameAndType        #265:#62      // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #264 = Utf8               java/util/Optional
  #265 = Utf8               orElse
  #266 = InvokeDynamic      #2:#267       // #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #267 = NameAndType        #249:#268     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #268 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #269 = InvokeDynamic      #3:#270       // #3:test:(III)Ljava/util/function/Predicate;
  #270 = NameAndType        #249:#271     // test:(III)Ljava/util/function/Predicate;
  #271 = Utf8               (III)Ljava/util/function/Predicate;
  #272 = Methodref          #273.#274     // ext/mods/gameserver/model/WorldObject.getX:()I
  #273 = Class              #275          // ext/mods/gameserver/model/WorldObject
  #274 = NameAndType        #276:#138     // getX:()I
  #275 = Utf8               ext/mods/gameserver/model/WorldObject
  #276 = Utf8               getX
  #277 = Methodref          #273.#278     // ext/mods/gameserver/model/WorldObject.getY:()I
  #278 = NameAndType        #279:#138     // getY:()I
  #279 = Utf8               getY
  #280 = Methodref          #273.#281     // ext/mods/gameserver/model/WorldObject.getZ:()I
  #281 = NameAndType        #282:#138     // getZ:()I
  #282 = Utf8               getZ
  #283 = Methodref          #11.#284      // ext/mods/gameserver/data/manager/CastleManager.getCastle:(III)Lext/mods/gameserver/model/residence/castle/Castle;
  #284 = NameAndType        #285:#286     // getCastle:(III)Lext/mods/gameserver/model/residence/castle/Castle;
  #285 = Utf8               getCastle
  #286 = Utf8               (III)Lext/mods/gameserver/model/residence/castle/Castle;
  #287 = Fieldref           #288.#289     // ext/mods/gameserver/data/manager/CastleManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #288 = Class              #290          // ext/mods/gameserver/data/manager/CastleManager$1
  #289 = NameAndType        #291:#292     // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
  #290 = Utf8               ext/mods/gameserver/data/manager/CastleManager$1
  #291 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
  #292 = Utf8               [I
  #293 = Methodref          #294.#295     // ext/mods/gameserver/enums/CabalType.ordinal:()I
  #294 = Class              #296          // ext/mods/gameserver/enums/CabalType
  #295 = NameAndType        #297:#138     // ordinal:()I
  #296 = Utf8               ext/mods/gameserver/enums/CabalType
  #297 = Utf8               ordinal
  #298 = InvokeDynamic      #4:#299       // #4:test:(I)Ljava/util/function/Predicate;
  #299 = NameAndType        #249:#300     // test:(I)Ljava/util/function/Predicate;
  #300 = Utf8               (I)Ljava/util/function/Predicate;
  #301 = InvokeDynamic      #5:#302       // #5:accept:(I)Ljava/util/function/Consumer;
  #302 = NameAndType        #231:#303     // accept:(I)Ljava/util/function/Consumer;
  #303 = Utf8               (I)Ljava/util/function/Consumer;
  #304 = InterfaceMethodref #252.#305     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #305 = NameAndType        #235:#306     // forEach:(Ljava/util/function/Consumer;)V
  #306 = Utf8               (Ljava/util/function/Consumer;)V
  #307 = Methodref          #11.#308      // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(III)Lext/mods/gameserver/model/residence/castle/Siege;
  #308 = NameAndType        #309:#310     // getActiveSiege:(III)Lext/mods/gameserver/model/residence/castle/Siege;
  #309 = Utf8               getActiveSiege
  #310 = Utf8               (III)Lext/mods/gameserver/model/residence/castle/Siege;
  #311 = InterfaceMethodref #242.#312     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #312 = NameAndType        #313:#314     // iterator:()Ljava/util/Iterator;
  #313 = Utf8               iterator
  #314 = Utf8               ()Ljava/util/Iterator;
  #315 = InterfaceMethodref #316.#317     // java/util/Iterator.hasNext:()Z
  #316 = Class              #318          // java/util/Iterator
  #317 = NameAndType        #319:#44      // hasNext:()Z
  #318 = Utf8               java/util/Iterator
  #319 = Utf8               hasNext
  #320 = InterfaceMethodref #316.#321     // java/util/Iterator.next:()Ljava/lang/Object;
  #321 = NameAndType        #43:#322      // next:()Ljava/lang/Object;
  #322 = Utf8               ()Ljava/lang/Object;
  #323 = Methodref          #63.#324      // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #324 = NameAndType        #325:#326     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #325 = Utf8               getSiege
  #326 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #327 = Methodref          #328.#329     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #328 = Class              #330          // ext/mods/gameserver/model/residence/castle/Siege
  #329 = NameAndType        #331:#44      // isInProgress:()Z
  #330 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #331 = Utf8               isInProgress
  #332 = Methodref          #63.#333      // ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #333 = NameAndType        #334:#335     // getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #334 = Utf8               getSiegeZone
  #335 = Utf8               ()Lext/mods/gameserver/model/zone/type/SiegeZone;
  #336 = Methodref          #337.#338     // ext/mods/gameserver/model/zone/type/SiegeZone.isInsideZone:(III)Z
  #337 = Class              #339          // ext/mods/gameserver/model/zone/type/SiegeZone
  #338 = NameAndType        #340:#341     // isInsideZone:(III)Z
  #339 = Utf8               ext/mods/gameserver/model/zone/type/SiegeZone
  #340 = Utf8               isInsideZone
  #341 = Utf8               (III)Z
  #342 = String             #343          // UPDATE castle SET certificates=300
  #343 = Utf8               UPDATE castle SET certificates=300
  #344 = InterfaceMethodref #34.#345      // java/sql/PreparedStatement.executeUpdate:()I
  #345 = NameAndType        #346:#138     // executeUpdate:()I
  #346 = Utf8               executeUpdate
  #347 = String             #348          // Failed to reset certificates.
  #348 = Utf8               Failed to reset certificates.
  #349 = InvokeDynamic      #6:#350       // #6:accept:()Ljava/util/function/Consumer;
  #350 = NameAndType        #231:#351     // accept:()Ljava/util/function/Consumer;
  #351 = Utf8               ()Ljava/util/function/Consumer;
  #352 = InterfaceMethodref #242.#305     // java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
  #353 = InvokeDynamic      #7:#350       // #7:accept:()Ljava/util/function/Consumer;
  #354 = Fieldref           #355.#356     // ext/mods/gameserver/data/manager/CastleManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CastleManager;
  #355 = Class              #357          // ext/mods/gameserver/data/manager/CastleManager$SingletonHolder
  #356 = NameAndType        #358:#359     // INSTANCE:Lext/mods/gameserver/data/manager/CastleManager;
  #357 = Utf8               ext/mods/gameserver/data/manager/CastleManager$SingletonHolder
  #358 = Utf8               INSTANCE
  #359 = Utf8               Lext/mods/gameserver/data/manager/CastleManager;
  #360 = InvokeDynamic      #8:#350       // #8:accept:()Ljava/util/function/Consumer;
  #361 = InterfaceMethodref #174.#305     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #362 = Methodref          #63.#363      // ext/mods/gameserver/model/residence/castle/Castle.getArtifacts:()Ljava/util/Map;
  #363 = NameAndType        #364:#365     // getArtifacts:()Ljava/util/Map;
  #364 = Utf8               getArtifacts
  #365 = Utf8               ()Ljava/util/Map;
  #366 = InvokeDynamic      #9:#367       // #9:accept:(Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/BiConsumer;
  #367 = NameAndType        #231:#368     // accept:(Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/BiConsumer;
  #368 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/BiConsumer;
  #369 = InterfaceMethodref #58.#370      // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #370 = NameAndType        #235:#371     // forEach:(Ljava/util/function/BiConsumer;)V
  #371 = Utf8               (Ljava/util/function/BiConsumer;)V
  #372 = Class              #373          // ext/mods/gameserver/model/spawn/Spawn
  #373 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #374 = Methodref          #52.#375      // java/lang/Integer.intValue:()I
  #375 = NameAndType        #376:#138     // intValue:()I
  #376 = Utf8               intValue
  #377 = Methodref          #372.#378     // ext/mods/gameserver/model/spawn/Spawn."<init>":(I)V
  #378 = NameAndType        #5:#157       // "<init>":(I)V
  #379 = Methodref          #372.#380     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #380 = NameAndType        #381:#382     // setLoc:(Lext/mods/gameserver/model/location/SpawnLocation;)V
  #381 = Utf8               setLoc
  #382 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;)V
  #383 = Methodref          #372.#384     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #384 = NameAndType        #385:#386     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #385 = Utf8               doSpawn
  #386 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #387 = String             #388          // Couldn\'t spawn artifact for {} castle.
  #388 = Utf8               Couldn\'t spawn artifact for {} castle.
  #389 = Methodref          #63.#390      // ext/mods/gameserver/model/residence/castle/Castle.getName:()Ljava/lang/String;
  #390 = NameAndType        #391:#392     // getName:()Ljava/lang/String;
  #391 = Utf8               getName
  #392 = Utf8               ()Ljava/lang/String;
  #393 = Methodref          #207.#394     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #394 = NameAndType        #210:#226     // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #395 = Methodref          #63.#396      // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
  #396 = NameAndType        #397:#138     // getCurrentTaxPercent:()I
  #397 = Utf8               getCurrentTaxPercent
  #398 = Methodref          #63.#399      // ext/mods/gameserver/model/residence/castle/Castle.getAlias:()Ljava/lang/String;
  #399 = NameAndType        #400:#392     // getAlias:()Ljava/lang/String;
  #400 = Utf8               getAlias
  #401 = Methodref          #402.#403     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #402 = Class              #404          // java/lang/String
  #403 = NameAndType        #405:#93      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #404 = Utf8               java/lang/String
  #405 = Utf8               equalsIgnoreCase
  #406 = Methodref          #63.#407      // ext/mods/gameserver/model/residence/castle/Castle.getOwnerId:()I
  #407 = NameAndType        #408:#138     // getOwnerId:()I
  #408 = Utf8               getOwnerId
  #409 = Methodref          #410.#411     // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #410 = Class              #412          // ext/mods/gameserver/model/pledge/Clan
  #411 = NameAndType        #413:#138     // getClanId:()I
  #412 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #413 = Utf8               getClanId
  #414 = String             #415          // castle
  #415 = Utf8               castle
  #416 = InvokeDynamic      #10:#230      // #10:accept:(Lext/mods/gameserver/data/manager/CastleManager;)Ljava/util/function/Consumer;
  #417 = Methodref          #11.#418      // ext/mods/gameserver/data/manager/CastleManager.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #418 = NameAndType        #419:#420     // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #419 = Utf8               parseAttributes
  #420 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
  #421 = String             #422          // tax
  #422 = Utf8               tax
  #423 = InvokeDynamic      #11:#424      // #11:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #424 = NameAndType        #231:#425     // accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #425 = Utf8               (Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/commons/data/StatSet;)Ljava/util/function/Consumer;
  #426 = Methodref          #63.#427      // ext/mods/gameserver/model/residence/castle/Castle."<init>":(Lext/mods/commons/data/StatSet;)V
  #427 = NameAndType        #5:#428       // "<init>":(Lext/mods/commons/data/StatSet;)V
  #428 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #429 = String             #430          // sieges
  #430 = Utf8               sieges
  #431 = InvokeDynamic      #12:#432      // #12:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #432 = NameAndType        #231:#433     // accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #433 = Utf8               (Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #434 = String             #435          // skills
  #435 = Utf8               skills
  #436 = InvokeDynamic      #13:#432      // #13:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #437 = String             #438          // rewards
  #438 = Utf8               rewards
  #439 = InvokeDynamic      #14:#432      // #14:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #440 = String             #441          // artifacts
  #441 = Utf8               artifacts
  #442 = InvokeDynamic      #15:#432      // #15:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #443 = String             #444          // controlTowers
  #444 = Utf8               controlTowers
  #445 = InvokeDynamic      #16:#432      // #16:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #446 = String             #447          // gates
  #447 = Utf8               gates
  #448 = InvokeDynamic      #17:#432      // #17:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #449 = String             #450          // npcs
  #450 = Utf8               npcs
  #451 = InvokeDynamic      #18:#432      // #18:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #452 = String             #453          // spawns
  #453 = Utf8               spawns
  #454 = InvokeDynamic      #19:#432      // #19:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #455 = String             #456          // tickets
  #456 = Utf8               tickets
  #457 = InvokeDynamic      #20:#432      // #20:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #458 = InterfaceMethodref #58.#459      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #459 = NameAndType        #460:#461     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #460 = Utf8               put
  #461 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #462 = String             #463          // ticket
  #463 = Utf8               ticket
  #464 = InvokeDynamic      #21:#432      // #21:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #465 = Methodref          #63.#466      // ext/mods/gameserver/model/residence/castle/Castle.addTicket:(Lext/mods/commons/data/StatSet;)V
  #466 = NameAndType        #467:#428     // addTicket:(Lext/mods/commons/data/StatSet;)V
  #467 = Utf8               addTicket
  #468 = String             #469          // spawn
  #469 = Utf8               spawn
  #470 = InvokeDynamic      #22:#432      // #22:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #471 = InterfaceMethodref #472.#473     // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #472 = Class              #474          // org/w3c/dom/Node
  #473 = NameAndType        #475:#476     // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
  #474 = Utf8               org/w3c/dom/Node
  #475 = Utf8               getAttributes
  #476 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
  #477 = Class              #478          // ext/mods/gameserver/enums/SpawnType
  #478 = Utf8               ext/mods/gameserver/enums/SpawnType
  #479 = String             #480          // type
  #480 = Utf8               type
  #481 = Methodref          #11.#482      // ext/mods/gameserver/data/manager/CastleManager.parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #482 = NameAndType        #483:#484     // parseEnum:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #483 = Utf8               parseEnum
  #484 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #485 = Methodref          #11.#486      // ext/mods/gameserver/data/manager/CastleManager.parseLocation:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #486 = NameAndType        #487:#488     // parseLocation:(Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #487 = Utf8               parseLocation
  #488 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/gameserver/model/location/Location;
  #489 = Methodref          #63.#490      // ext/mods/gameserver/model/residence/castle/Castle.addSpawn:(Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #490 = NameAndType        #491:#492     // addSpawn:(Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #491 = Utf8               addSpawn
  #492 = Utf8               (Lext/mods/gameserver/enums/SpawnType;Lext/mods/gameserver/model/location/Location;)V
  #493 = String             #494          // val
  #494 = Utf8               val
  #495 = Methodref          #11.#496      // ext/mods/gameserver/data/manager/CastleManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #496 = NameAndType        #497:#498     // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #497 = Utf8               parseString
  #498 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
  #499 = Methodref          #63.#500      // ext/mods/gameserver/model/residence/castle/Castle.setNpcs:(Ljava/lang/String;)V
  #500 = NameAndType        #501:#217     // setNpcs:(Ljava/lang/String;)V
  #501 = Utf8               setNpcs
  #502 = Methodref          #63.#503      // ext/mods/gameserver/model/residence/castle/Castle.setDoors:(Ljava/lang/String;)V
  #503 = NameAndType        #504:#217     // setDoors:(Ljava/lang/String;)V
  #504 = Utf8               setDoors
  #505 = String             #506          // controlTower
  #506 = Utf8               controlTower
  #507 = InvokeDynamic      #23:#432      // #23:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #508 = String             #509          // alias
  #509 = Utf8               alias
  #510 = Class              #511          // ext/mods/gameserver/enums/actors/TowerType
  #511 = Utf8               ext/mods/gameserver/enums/actors/TowerType
  #512 = Methodref          #178.#513     // ext/mods/gameserver/model/location/TowerSpawnLocation."<init>":(Lext/mods/gameserver/enums/actors/TowerType;Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)V
  #513 = NameAndType        #5:#514       // "<init>":(Lext/mods/gameserver/enums/actors/TowerType;Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)V
  #514 = Utf8               (Lext/mods/gameserver/enums/actors/TowerType;Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)V
  #515 = String             #516          // position
  #516 = Utf8               position
  #517 = InvokeDynamic      #24:#518      // #24:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/location/TowerSpawnLocation;)Ljava/util/function/Consumer;
  #518 = NameAndType        #231:#519     // accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/location/TowerSpawnLocation;)Ljava/util/function/Consumer;
  #519 = Utf8               (Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/location/TowerSpawnLocation;)Ljava/util/function/Consumer;
  #520 = String             #521          // stats
  #521 = Utf8               stats
  #522 = InvokeDynamic      #25:#518      // #25:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/location/TowerSpawnLocation;)Ljava/util/function/Consumer;
  #523 = String             #524          // zones
  #524 = Utf8               zones
  #525 = InvokeDynamic      #26:#518      // #26:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/location/TowerSpawnLocation;)Ljava/util/function/Consumer;
  #526 = InterfaceMethodref #174.#527     // java/util/List.add:(Ljava/lang/Object;)Z
  #527 = NameAndType        #528:#529     // add:(Ljava/lang/Object;)Z
  #528 = Utf8               add
  #529 = Utf8               (Ljava/lang/Object;)Z
  #530 = String             #531          // ;
  #531 = Utf8               ;
  #532 = Methodref          #402.#533     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #533 = NameAndType        #534:#535     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #534 = Utf8               split
  #535 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #536 = Methodref          #178.#537     // ext/mods/gameserver/model/location/TowerSpawnLocation.setZones:([Ljava/lang/String;)V
  #537 = NameAndType        #538:#539     // setZones:([Ljava/lang/String;)V
  #538 = Utf8               setZones
  #539 = Utf8               ([Ljava/lang/String;)V
  #540 = Methodref          #11.#541      // ext/mods/gameserver/data/manager/CastleManager.parseDouble:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #541 = NameAndType        #542:#543     // parseDouble:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #542 = Utf8               parseDouble
  #543 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Double;
  #544 = Methodref          #545.#546     // java/lang/Double.doubleValue:()D
  #545 = Class              #547          // java/lang/Double
  #546 = NameAndType        #548:#549     // doubleValue:()D
  #547 = Utf8               java/lang/Double
  #548 = Utf8               doubleValue
  #549 = Utf8               ()D
  #550 = String             #551          // pDef
  #551 = Utf8               pDef
  #552 = String             #553          // mDef
  #553 = Utf8               mDef
  #554 = Methodref          #178.#555     // ext/mods/gameserver/model/location/TowerSpawnLocation.setStats:(DDD)V
  #555 = NameAndType        #556:#557     // setStats:(DDD)V
  #556 = Utf8               setStats
  #557 = Utf8               (DDD)V
  #558 = String             #559          // x
  #559 = Utf8               x
  #560 = Methodref          #11.#561      // ext/mods/gameserver/data/manager/CastleManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #561 = NameAndType        #562:#563     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #562 = Utf8               parseInteger
  #563 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
  #564 = String             #565          // y
  #565 = Utf8               y
  #566 = String             #567          // z
  #567 = Utf8               z
  #568 = Methodref          #178.#569     // ext/mods/gameserver/model/location/TowerSpawnLocation.set:(III)V
  #569 = NameAndType        #570:#571     // set:(III)V
  #570 = Utf8               set
  #571 = Utf8               (III)V
  #572 = String             #573          // artifact
  #573 = Utf8               artifact
  #574 = InvokeDynamic      #27:#432      // #27:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #575 = String             #576          // pos
  #576 = Utf8               pos
  #577 = Methodref          #11.#578      // ext/mods/gameserver/data/manager/CastleManager.parseSpawnLocation:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/SpawnLocation;
  #578 = NameAndType        #579:#580     // parseSpawnLocation:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/SpawnLocation;
  #579 = Utf8               parseSpawnLocation
  #580 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Lext/mods/gameserver/model/location/SpawnLocation;
  #581 = String             #582          // member
  #582 = Utf8               member
  #583 = InvokeDynamic      #28:#432      // #28:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #584 = String             #585          // leader
  #585 = Utf8               leader
  #586 = InvokeDynamic      #29:#432      // #29:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #587 = String             #588          // count
  #588 = Utf8               count
  #589 = String             #590          // enchant
  #590 = Utf8               enchant
  #591 = Methodref          #11.#592      // ext/mods/gameserver/data/manager/CastleManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #592 = NameAndType        #562:#593     // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #593 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
  #594 = Class              #595          // ext/mods/gameserver/model/pledge/ItemInfo
  #595 = Utf8               ext/mods/gameserver/model/pledge/ItemInfo
  #596 = Methodref          #594.#597     // ext/mods/gameserver/model/pledge/ItemInfo."<init>":(II)V
  #597 = NameAndType        #5:#142       // "<init>":(II)V
  #598 = Methodref          #63.#599      // ext/mods/gameserver/model/residence/castle/Castle.getItemsLeader:()Ljava/util/Map;
  #599 = NameAndType        #600:#365     // getItemsLeader:()Ljava/util/Map;
  #600 = Utf8               getItemsLeader
  #601 = Methodref          #63.#602      // ext/mods/gameserver/model/residence/castle/Castle.getItemsMember:()Ljava/util/Map;
  #602 = NameAndType        #603:#365     // getItemsMember:()Ljava/util/Map;
  #603 = Utf8               getItemsMember
  #604 = InvokeDynamic      #30:#432      // #30:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #605 = InvokeDynamic      #31:#432      // #31:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #606 = Methodref          #63.#607      // ext/mods/gameserver/model/residence/castle/Castle.getSkillsLeader:()Ljava/util/Map;
  #607 = NameAndType        #608:#365     // getSkillsLeader:()Ljava/util/Map;
  #608 = Utf8               getSkillsLeader
  #609 = Methodref          #63.#610      // ext/mods/gameserver/model/residence/castle/Castle.getSkillsMember:()Ljava/util/Map;
  #610 = NameAndType        #611:#365     // getSkillsMember:()Ljava/util/Map;
  #611 = Utf8               getSkillsMember
  #612 = String             #613          // siege
  #613 = Utf8               siege
  #614 = InvokeDynamic      #32:#432      // #32:accept:(Lext/mods/gameserver/data/manager/CastleManager;Lext/mods/gameserver/model/residence/castle/Castle;)Ljava/util/function/Consumer;
  #615 = String             #616          // week
  #616 = Utf8               week
  #617 = String             #618          // day
  #618 = Utf8               day
  #619 = String             #620          // hour
  #620 = Utf8               hour
  #621 = String             #622          // minute
  #622 = Utf8               minute
  #623 = Class              #624          // ext/mods/gameserver/model/records/custom/SiegeInfo
  #624 = Utf8               ext/mods/gameserver/model/records/custom/SiegeInfo
  #625 = Methodref          #623.#626     // ext/mods/gameserver/model/records/custom/SiegeInfo."<init>":(III)V
  #626 = NameAndType        #5:#571       // "<init>":(III)V
  #627 = Methodref          #63.#628      // ext/mods/gameserver/model/residence/castle/Castle.getSieges:()Ljava/util/Map;
  #628 = NameAndType        #629:#365     // getSieges:()Ljava/util/Map;
  #629 = Utf8               getSieges
  #630 = Methodref          #11.#631      // ext/mods/gameserver/data/manager/CastleManager.addAttributes:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #631 = NameAndType        #632:#633     // addAttributes:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #632 = Utf8               addAttributes
  #633 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/NamedNodeMap;)V
  #634 = Class              #635          // ext/mods/commons/data/xml/IXmlReader
  #635 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #636 = Utf8               LOAD_CASTLES
  #637 = Utf8               Ljava/lang/String;
  #638 = Utf8               ConstantValue
  #639 = Utf8               LOAD_OWNER
  #640 = Utf8               LOAD_TRAPS
  #641 = Utf8               LOAD_DOORS
  #642 = Utf8               RESET_CERTIFICATES
  #643 = Utf8               Signature
  #644 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/residence/castle/Castle;>;
  #645 = Utf8               Code
  #646 = Utf8               LineNumberTable
  #647 = Utf8               LocalVariableTable
  #648 = Utf8               clan
  #649 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #650 = Utf8               ownerId
  #651 = Utf8               I
  #652 = Utf8               rs1
  #653 = Utf8               Ljava/sql/ResultSet;
  #654 = Utf8               rs2
  #655 = Utf8               rs3
  #656 = Utf8               ps3
  #657 = Utf8               Ljava/sql/PreparedStatement;
  #658 = Utf8               ps2
  #659 = Utf8               ps1
  #660 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #661 = Utf8               rs
  #662 = Utf8               ps
  #663 = Utf8               con
  #664 = Utf8               Ljava/sql/Connection;
  #665 = Utf8               e
  #666 = Utf8               Ljava/lang/Exception;
  #667 = Utf8               this
  #668 = Utf8               StackMapTable
  #669 = Utf8               parseDocument
  #670 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #671 = Utf8               doc
  #672 = Utf8               Lorg/w3c/dom/Document;
  #673 = Utf8               path
  #674 = Utf8               Ljava/nio/file/Path;
  #675 = Utf8               getCastleById
  #676 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle;
  #677 = Utf8               castleId
  #678 = Utf8               getCastleByOwner
  #679 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #680 = Utf8               getCastleByAlias
  #681 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
  #682 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #683 = Utf8               object
  #684 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #685 = Utf8               getCastles
  #686 = Utf8               ()Ljava/util/Collection<Lext/mods/gameserver/model/residence/castle/Castle;>;
  #687 = Utf8               validateTaxes
  #688 = Utf8               (Lext/mods/gameserver/enums/CabalType;)V
  #689 = Utf8               maxTax
  #690 = Utf8               sealStrifeOwner
  #691 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #692 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #693 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #694 = Utf8               resetCertificates
  #695 = Utf8               spawnEntities
  #696 = Utf8               updateTaxes
  #697 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #698 = Utf8               lambda$spawnEntities$0
  #699 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)V
  #700 = Utf8               lambda$spawnEntities$1
  #701 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  #702 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #703 = Utf8               npcId
  #704 = Utf8               Ljava/lang/Integer;
  #705 = Utf8               spawnLoc
  #706 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #707 = Utf8               lambda$validateTaxes$1
  #708 = Utf8               (ILext/mods/gameserver/model/residence/castle/Castle;)V
  #709 = Utf8               c
  #710 = Utf8               lambda$validateTaxes$0
  #711 = Utf8               (ILext/mods/gameserver/model/residence/castle/Castle;)Z
  #712 = Utf8               lambda$getCastle$0
  #713 = Utf8               (IIILext/mods/gameserver/model/residence/castle/Castle;)Z
  #714 = Utf8               lambda$getCastleByAlias$0
  #715 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #716 = Utf8               lambda$getCastleByOwner$0
  #717 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #718 = Utf8               lambda$parseDocument$0
  #719 = Utf8               (Lorg/w3c/dom/Node;)V
  #720 = Utf8               listNode
  #721 = Utf8               Lorg/w3c/dom/Node;
  #722 = Utf8               lambda$parseDocument$1
  #723 = Utf8               castleNode
  #724 = Utf8               Lext/mods/commons/data/StatSet;
  #725 = Utf8               lambda$parseDocument$22
  #726 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #727 = Utf8               ticketsNode
  #728 = Utf8               lambda$parseDocument$23
  #729 = Utf8               ticketNode
  #730 = Utf8               lambda$parseDocument$20
  #731 = Utf8               spawnsNode
  #732 = Utf8               lambda$parseDocument$21
  #733 = Utf8               spawnNode
  #734 = Utf8               lambda$parseDocument$19
  #735 = Utf8               npcsNode
  #736 = Utf8               lambda$parseDocument$18
  #737 = Utf8               gatesNode
  #738 = Utf8               lambda$parseDocument$13
  #739 = Utf8               controlTowersNode
  #740 = Utf8               lambda$parseDocument$14
  #741 = Utf8               towerNode
  #742 = Utf8               towerAttrs
  #743 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #744 = Utf8               Lext/mods/gameserver/enums/actors/TowerType;
  #745 = Utf8               tsl
  #746 = Utf8               Lext/mods/gameserver/model/location/TowerSpawnLocation;
  #747 = Utf8               lambda$parseDocument$17
  #748 = Utf8               (Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #749 = Utf8               zoneNode
  #750 = Utf8               lambda$parseDocument$16
  #751 = Utf8               statNode
  #752 = Utf8               attrs
  #753 = Utf8               lambda$parseDocument$15
  #754 = Utf8               positionNode
  #755 = Utf8               lambda$parseDocument$11
  #756 = Utf8               artifactsNode
  #757 = Utf8               lambda$parseDocument$12
  #758 = Utf8               artifactNode
  #759 = Utf8               artifactAttrs
  #760 = Utf8               lambda$parseDocument$8
  #761 = Utf8               rewardsNode
  #762 = Utf8               lambda$parseDocument$10
  #763 = Utf8               leaderNode
  #764 = Utf8               rewardAttrs
  #765 = Utf8               itemId
  #766 = Utf8               itemCount
  #767 = Utf8               itemInfo
  #768 = Utf8               Lext/mods/gameserver/model/pledge/ItemInfo;
  #769 = Utf8               lambda$parseDocument$9
  #770 = Utf8               memberNode
  #771 = Utf8               lambda$parseDocument$5
  #772 = Utf8               skillsNode
  #773 = Utf8               lambda$parseDocument$7
  #774 = Utf8               skillAttrs
  #775 = Utf8               skillId
  #776 = Utf8               skillLvl
  #777 = Utf8               lambda$parseDocument$6
  #778 = Utf8               lambda$parseDocument$3
  #779 = Utf8               siegesNode
  #780 = Utf8               lambda$parseDocument$4
  #781 = Utf8               siegeNode
  #782 = Utf8               siegeAttrs
  #783 = Utf8               siegeInfo
  #784 = Utf8               Lext/mods/gameserver/model/records/custom/SiegeInfo;
  #785 = Utf8               lambda$parseDocument$2
  #786 = Utf8               (Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #787 = Utf8               taxNode
  #788 = Utf8               SourceFile
  #789 = Utf8               CastleManager.java
  #790 = Utf8               NestMembers
  #791 = Utf8               BootstrapMethods
  #792 = MethodType         #793          //  (Ljava/lang/Object;)V
  #793 = Utf8               (Ljava/lang/Object;)V
  #794 = MethodHandle       5:#795        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #795 = Methodref          #11.#796      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #796 = NameAndType        #718:#719     // lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
  #797 = MethodType         #719          //  (Lorg/w3c/dom/Node;)V
  #798 = MethodType         #529          //  (Ljava/lang/Object;)Z
  #799 = MethodHandle       6:#800        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$getCastleByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #800 = Methodref          #11.#801      // ext/mods/gameserver/data/manager/CastleManager.lambda$getCastleByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #801 = NameAndType        #716:#717     // lambda$getCastleByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #802 = MethodType         #803          //  (Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #803 = Utf8               (Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #804 = MethodHandle       6:#805        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$getCastleByAlias$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #805 = Methodref          #11.#806      // ext/mods/gameserver/data/manager/CastleManager.lambda$getCastleByAlias$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #806 = NameAndType        #714:#715     // lambda$getCastleByAlias$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)Z
  #807 = MethodHandle       6:#808        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$getCastle$0:(IIILext/mods/gameserver/model/residence/castle/Castle;)Z
  #808 = Methodref          #11.#809      // ext/mods/gameserver/data/manager/CastleManager.lambda$getCastle$0:(IIILext/mods/gameserver/model/residence/castle/Castle;)Z
  #809 = NameAndType        #712:#713     // lambda$getCastle$0:(IIILext/mods/gameserver/model/residence/castle/Castle;)Z
  #810 = MethodHandle       6:#811        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$validateTaxes$0:(ILext/mods/gameserver/model/residence/castle/Castle;)Z
  #811 = Methodref          #11.#812      // ext/mods/gameserver/data/manager/CastleManager.lambda$validateTaxes$0:(ILext/mods/gameserver/model/residence/castle/Castle;)Z
  #812 = NameAndType        #710:#711     // lambda$validateTaxes$0:(ILext/mods/gameserver/model/residence/castle/Castle;)Z
  #813 = MethodHandle       6:#814        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$validateTaxes$1:(ILext/mods/gameserver/model/residence/castle/Castle;)V
  #814 = Methodref          #11.#815      // ext/mods/gameserver/data/manager/CastleManager.lambda$validateTaxes$1:(ILext/mods/gameserver/model/residence/castle/Castle;)V
  #815 = NameAndType        #707:#708     // lambda$validateTaxes$1:(ILext/mods/gameserver/model/residence/castle/Castle;)V
  #816 = MethodType         #699          //  (Lext/mods/gameserver/model/residence/castle/Castle;)V
  #817 = MethodHandle       6:#818        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$spawnEntities$0:(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #818 = Methodref          #11.#819      // ext/mods/gameserver/data/manager/CastleManager.lambda$spawnEntities$0:(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #819 = NameAndType        #698:#699     // lambda$spawnEntities$0:(Lext/mods/gameserver/model/residence/castle/Castle;)V
  #820 = MethodHandle       5:#821        // REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Castle.updateTaxes:()V
  #821 = Methodref          #63.#822      // ext/mods/gameserver/model/residence/castle/Castle.updateTaxes:()V
  #822 = NameAndType        #696:#6       // updateTaxes:()V
  #823 = MethodHandle       5:#824        // REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.spawnMe:()V
  #824 = Methodref          #178.#825     // ext/mods/gameserver/model/location/TowerSpawnLocation.spawnMe:()V
  #825 = NameAndType        #826:#6       // spawnMe:()V
  #826 = Utf8               spawnMe
  #827 = MethodType         #828          //  (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  #828 = Utf8               (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  #829 = MethodType         #830          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #830 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #831 = MethodHandle       6:#832        // REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$spawnEntities$1:(Lext/mods/gameserver/model/residence/castle/Castle;Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  #832 = Methodref          #11.#833      // ext/mods/gameserver/data/manager/CastleManager.lambda$spawnEntities$1:(Lext/mods/gameserver/model/residence/castle/Castle;Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  #833 = NameAndType        #700:#701     // lambda$spawnEntities$1:(Lext/mods/gameserver/model/residence/castle/Castle;Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  #834 = MethodType         #835          //  (Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  #835 = Utf8               (Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  #836 = MethodHandle       5:#837        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #837 = Methodref          #11.#838      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #838 = NameAndType        #722:#719     // lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
  #839 = MethodHandle       5:#840        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #840 = Methodref          #11.#841      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #841 = NameAndType        #785:#786     // lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
  #842 = MethodHandle       5:#843        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$3:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #843 = Methodref          #11.#844      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$3:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #844 = NameAndType        #778:#726     // lambda$parseDocument$3:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #845 = MethodHandle       5:#846        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #846 = Methodref          #11.#847      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #847 = NameAndType        #771:#726     // lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #848 = MethodHandle       5:#849        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$8:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #849 = Methodref          #11.#850      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$8:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #850 = NameAndType        #760:#726     // lambda$parseDocument$8:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #851 = MethodHandle       5:#852        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$11:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #852 = Methodref          #11.#853      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$11:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #853 = NameAndType        #755:#726     // lambda$parseDocument$11:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #854 = MethodHandle       5:#855        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$13:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #855 = Methodref          #11.#856      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$13:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #856 = NameAndType        #738:#726     // lambda$parseDocument$13:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #857 = MethodHandle       5:#858        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$18:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #858 = Methodref          #11.#859      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$18:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #859 = NameAndType        #736:#726     // lambda$parseDocument$18:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #860 = MethodHandle       5:#861        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$19:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #861 = Methodref          #11.#862      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$19:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #862 = NameAndType        #734:#726     // lambda$parseDocument$19:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #863 = MethodHandle       5:#864        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$20:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #864 = Methodref          #11.#865      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$20:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #865 = NameAndType        #730:#726     // lambda$parseDocument$20:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #866 = MethodHandle       5:#867        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$22:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #867 = Methodref          #11.#868      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$22:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #868 = NameAndType        #725:#726     // lambda$parseDocument$22:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #869 = MethodHandle       5:#870        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$23:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #870 = Methodref          #11.#871      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$23:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #871 = NameAndType        #728:#726     // lambda$parseDocument$23:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #872 = MethodHandle       5:#873        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$21:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #873 = Methodref          #11.#874      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$21:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #874 = NameAndType        #732:#726     // lambda$parseDocument$21:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #875 = MethodHandle       5:#876        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$14:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #876 = Methodref          #11.#877      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$14:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #877 = NameAndType        #740:#726     // lambda$parseDocument$14:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #878 = MethodHandle       5:#879        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$15:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #879 = Methodref          #11.#880      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$15:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #880 = NameAndType        #753:#748     // lambda$parseDocument$15:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #881 = MethodHandle       5:#882        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$16:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #882 = Methodref          #11.#883      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$16:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #883 = NameAndType        #750:#748     // lambda$parseDocument$16:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #884 = MethodHandle       5:#885        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$17:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #885 = Methodref          #11.#886      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$17:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #886 = NameAndType        #747:#748     // lambda$parseDocument$17:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
  #887 = MethodHandle       5:#888        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$12:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #888 = Methodref          #11.#889      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$12:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #889 = NameAndType        #757:#726     // lambda$parseDocument$12:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #890 = MethodHandle       5:#891        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$9:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #891 = Methodref          #11.#892      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$9:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #892 = NameAndType        #769:#726     // lambda$parseDocument$9:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #893 = MethodHandle       5:#894        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$10:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #894 = Methodref          #11.#895      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$10:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #895 = NameAndType        #762:#726     // lambda$parseDocument$10:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #896 = MethodHandle       5:#897        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #897 = Methodref          #11.#898      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #898 = NameAndType        #777:#726     // lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #899 = MethodHandle       5:#900        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #900 = Methodref          #11.#901      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #901 = NameAndType        #773:#726     // lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #902 = MethodHandle       5:#903        // REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #903 = Methodref          #11.#904      // ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #904 = NameAndType        #780:#726     // lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
  #905 = MethodHandle       6:#906        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #906 = Methodref          #907.#908     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #907 = Class              #909          // java/lang/invoke/LambdaMetafactory
  #908 = NameAndType        #910:#911     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #909 = Utf8               java/lang/invoke/LambdaMetafactory
  #910 = Utf8               metafactory
  #911 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #912 = Utf8               InnerClasses
  #913 = Utf8               SingletonHolder
  #914 = Class              #915          // java/lang/invoke/MethodHandles$Lookup
  #915 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #916 = Class              #917          // java/lang/invoke/MethodHandles
  #917 = Utf8               java/lang/invoke/MethodHandles
  #918 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.CastleManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=11, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _castles:Ljava/util/Map;
        15: aload_0
        16: invokevirtual #16                 // Method load:()V
        19: invokestatic  #19                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        22: astore_1
        23: aload_1
        24: ldc           #25                 // String SELECT * FROM castle ORDER BY id
        26: invokeinterface #27,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        31: astore_2
        32: aload_2
        33: invokeinterface #33,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        38: astore_3
        39: aload_3
        40: invokeinterface #39,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        45: ifeq          702
        48: aload_0
        49: getfield      #10                 // Field _castles:Ljava/util/Map;
        52: aload_3
        53: ldc           #45                 // String id
        55: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        60: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        63: invokeinterface #57,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        68: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        71: astore        4
        73: aload         4
        75: ifnonnull     81
        78: goto          39
        81: aload         4
        83: invokestatic  #65                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        86: invokevirtual #71                 // Method ext/mods/gameserver/model/residence/castle/Castle.setSiegeDate:(Ljava/util/Calendar;)V
        89: aload         4
        91: invokevirtual #75                 // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeDate:()Ljava/util/Calendar;
        94: aload_3
        95: ldc           #78                 // String siegeDate
        97: invokeinterface #80,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       102: invokevirtual #84                 // Method java/util/Calendar.setTimeInMillis:(J)V
       105: aload         4
       107: aload_3
       108: ldc           #88                 // String regTimeOver
       110: invokeinterface #90,  2           // InterfaceMethod java/sql/ResultSet.getBoolean:(Ljava/lang/String;)Z
       115: invokevirtual #94                 // Method ext/mods/gameserver/model/residence/castle/Castle.setTimeRegistrationOver:(Z)V
       118: aload         4
       120: aload_3
       121: ldc           #98                 // String currentTaxPercent
       123: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       128: iconst_0
       129: invokevirtual #100                // Method ext/mods/gameserver/model/residence/castle/Castle.setCurrentTaxPercent:(IZ)V
       132: aload         4
       134: aload_3
       135: ldc           #104                // String nextTaxPercent
       137: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       142: iconst_0
       143: invokevirtual #106                // Method ext/mods/gameserver/model/residence/castle/Castle.setNextTaxPercent:(IZ)V
       146: aload         4
       148: aload_3
       149: ldc           #109                // String treasury
       151: invokeinterface #80,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       156: invokevirtual #111                // Method ext/mods/gameserver/model/residence/castle/Castle.setTreasury:(J)V
       159: aload         4
       161: aload_3
       162: ldc           #114                // String taxRevenue
       164: invokeinterface #80,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       169: invokevirtual #116                // Method ext/mods/gameserver/model/residence/castle/Castle.setTaxRevenue:(J)V
       172: aload         4
       174: aload_3
       175: ldc           #119                // String seedIncome
       177: invokeinterface #80,  2           // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       182: invokevirtual #121                // Method ext/mods/gameserver/model/residence/castle/Castle.setSeedIncome:(J)V
       185: aload         4
       187: aload_3
       188: ldc           #124                // String certificates
       190: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       195: iconst_0
       196: invokevirtual #126                // Method ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
       199: aload_1
       200: ldc           #129                // String SELECT clan_id FROM clan_data WHERE hasCastle=?
       202: invokeinterface #27,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       207: astore        5
       209: aload_1
       210: ldc           #131                // String SELECT * FROM castle_trapupgrade WHERE castleId=?
       212: invokeinterface #27,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       217: astore        6
       219: aload_1
       220: ldc           #133                // String SELECT * FROM castle_doorupgrade WHERE castleId=?
       222: invokeinterface #27,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       227: astore        7
       229: aload         5
       231: iconst_1
       232: aload         4
       234: invokevirtual #135                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       237: invokeinterface #139,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       242: aload         5
       244: invokeinterface #33,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       249: astore        8
       251: aload         8
       253: invokeinterface #39,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       258: ifeq          302
       261: aload         8
       263: ldc           #143                // String clan_id
       265: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       270: istore        9
       272: iload         9
       274: ifle          299
       277: invokestatic  #145                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       280: iload         9
       282: invokevirtual #150                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       285: astore        10
       287: aload         10
       289: ifnull        299
       292: aload         4
       294: iload         9
       296: invokevirtual #154                // Method ext/mods/gameserver/model/residence/castle/Castle.setOwnerId:(I)V
       299: goto          251
       302: aload         8
       304: ifnull        346
       307: aload         8
       309: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       314: goto          346
       317: astore        9
       319: aload         8
       321: ifnull        343
       324: aload         8
       326: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       331: goto          343
       334: astore        10
       336: aload         9
       338: aload         10
       340: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       343: aload         9
       345: athrow
       346: aload         6
       348: iconst_1
       349: aload         4
       351: invokevirtual #135                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       354: invokeinterface #139,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       359: aload         6
       361: invokeinterface #33,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       366: astore        8
       368: aload         8
       370: invokeinterface #39,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       375: ifeq          415
       378: aload         4
       380: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Castle.getControlTowers:()Ljava/util/List;
       383: aload         8
       385: ldc           #171                // String towerIndex
       387: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       392: invokeinterface #173,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       397: checkcast     #178                // class ext/mods/gameserver/model/location/TowerSpawnLocation
       400: aload         8
       402: ldc           #180                // String level
       404: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       409: invokevirtual #182                // Method ext/mods/gameserver/model/location/TowerSpawnLocation.setUpgradeLevel:(I)V
       412: goto          368
       415: aload         8
       417: ifnull        459
       420: aload         8
       422: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       427: goto          459
       430: astore        9
       432: aload         8
       434: ifnull        456
       437: aload         8
       439: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       444: goto          456
       447: astore        10
       449: aload         9
       451: aload         10
       453: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       456: aload         9
       458: athrow
       459: aload         4
       461: invokevirtual #185                // Method ext/mods/gameserver/model/residence/castle/Castle.launchSiege:()V
       464: aload         7
       466: iconst_1
       467: aload         4
       469: invokevirtual #135                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
       472: invokeinterface #139,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       477: aload         7
       479: invokeinterface #33,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
       484: astore        8
       486: aload         8
       488: invokeinterface #39,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
       493: ifeq          523
       496: aload         4
       498: aload         8
       500: ldc           #188                // String doorId
       502: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       507: aload         8
       509: ldc           #190                // String hp
       511: invokeinterface #47,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       516: iconst_0
       517: invokevirtual #192                // Method ext/mods/gameserver/model/residence/castle/Castle.upgradeDoor:(IIZ)V
       520: goto          486
       523: aload         8
       525: ifnull        567
       528: aload         8
       530: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       535: goto          567
       538: astore        9
       540: aload         8
       542: ifnull        564
       545: aload         8
       547: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       552: goto          564
       555: astore        10
       557: aload         9
       559: aload         10
       561: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       564: aload         9
       566: athrow
       567: aload         7
       569: ifnull        611
       572: aload         7
       574: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       579: goto          611
       582: astore        8
       584: aload         7
       586: ifnull        608
       589: aload         7
       591: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       596: goto          608
       599: astore        9
       601: aload         8
       603: aload         9
       605: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       608: aload         8
       610: athrow
       611: aload         6
       613: ifnull        655
       616: aload         6
       618: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       623: goto          655
       626: astore        7
       628: aload         6
       630: ifnull        652
       633: aload         6
       635: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       640: goto          652
       643: astore        8
       645: aload         7
       647: aload         8
       649: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       652: aload         7
       654: athrow
       655: aload         5
       657: ifnull        699
       660: aload         5
       662: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       667: goto          699
       670: astore        6
       672: aload         5
       674: ifnull        696
       677: aload         5
       679: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       684: goto          696
       687: astore        7
       689: aload         6
       691: aload         7
       693: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       696: aload         6
       698: athrow
       699: goto          39
       702: aload_3
       703: ifnull        742
       706: aload_3
       707: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       712: goto          742
       715: astore        4
       717: aload_3
       718: ifnull        739
       721: aload_3
       722: invokeinterface #158,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       727: goto          739
       730: astore        5
       732: aload         4
       734: aload         5
       736: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       739: aload         4
       741: athrow
       742: aload_2
       743: ifnull        779
       746: aload_2
       747: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       752: goto          779
       755: astore_3
       756: aload_2
       757: ifnull        777
       760: aload_2
       761: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       766: goto          777
       769: astore        4
       771: aload_3
       772: aload         4
       774: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       777: aload_3
       778: athrow
       779: aload_1
       780: ifnull        814
       783: aload_1
       784: invokeinterface #197,  1          // InterfaceMethod java/sql/Connection.close:()V
       789: goto          814
       792: astore_2
       793: aload_1
       794: ifnull        812
       797: aload_1
       798: invokeinterface #197,  1          // InterfaceMethod java/sql/Connection.close:()V
       803: goto          812
       806: astore_3
       807: aload_2
       808: aload_3
       809: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       812: aload_2
       813: athrow
       814: goto          827
       817: astore_1
       818: getstatic     #200                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       821: ldc           #204                // String Failed to load castles.
       823: aload_1
       824: invokevirtual #206                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       827: return
      Exception table:
         from    to  target type
           251   302   317   Class java/lang/Throwable
           324   331   334   Class java/lang/Throwable
           368   415   430   Class java/lang/Throwable
           437   444   447   Class java/lang/Throwable
           486   523   538   Class java/lang/Throwable
           545   552   555   Class java/lang/Throwable
           229   567   582   Class java/lang/Throwable
           589   596   599   Class java/lang/Throwable
           219   611   626   Class java/lang/Throwable
           633   640   643   Class java/lang/Throwable
           209   655   670   Class java/lang/Throwable
           677   684   687   Class java/lang/Throwable
            39   702   715   Class java/lang/Throwable
           721   727   730   Class java/lang/Throwable
            32   742   755   Class java/lang/Throwable
           760   766   769   Class java/lang/Throwable
            23   779   792   Class java/lang/Throwable
           797   803   806   Class java/lang/Throwable
            19   814   817   Class java/lang/Exception
      LineNumberTable:
        line 66: 0
        line 63: 4
        line 67: 15
        line 69: 19
        line 70: 23
        line 71: 32
        line 73: 39
        line 75: 48
        line 76: 73
        line 77: 78
        line 79: 81
        line 80: 89
        line 81: 105
        line 82: 118
        line 83: 132
        line 84: 146
        line 85: 159
        line 86: 172
        line 87: 185
        line 89: 199
        line 90: 209
        line 91: 219
        line 93: 229
        line 95: 242
        line 97: 251
        line 99: 261
        line 100: 272
        line 102: 277
        line 103: 287
        line 104: 292
        line 106: 299
        line 107: 302
        line 95: 317
        line 109: 346
        line 111: 359
        line 113: 368
        line 114: 378
        line 115: 415
        line 111: 430
        line 117: 459
        line 119: 464
        line 121: 477
        line 123: 486
        line 124: 496
        line 125: 523
        line 121: 538
        line 126: 567
        line 89: 582
        line 126: 611
        line 89: 626
        line 126: 655
        line 89: 670
        line 127: 699
        line 128: 702
        line 69: 715
        line 128: 742
        line 69: 755
        line 128: 779
        line 69: 792
        line 132: 814
        line 129: 817
        line 131: 818
        line 133: 827
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          287      12    10  clan   Lext/mods/gameserver/model/pledge/Clan;
          272      27     9 ownerId   I
          251      95     8   rs1   Ljava/sql/ResultSet;
          368      91     8   rs2   Ljava/sql/ResultSet;
          486      81     8   rs3   Ljava/sql/ResultSet;
          229     382     7   ps3   Ljava/sql/PreparedStatement;
          219     436     6   ps2   Ljava/sql/PreparedStatement;
          209     490     5   ps1   Ljava/sql/PreparedStatement;
           73     626     4 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           39     703     3    rs   Ljava/sql/ResultSet;
           32     747     2    ps   Ljava/sql/PreparedStatement;
           23     791     1   con   Ljava/sql/Connection;
          818       9     1     e   Ljava/lang/Exception;
            0     828     0  this   Lext/mods/gameserver/data/manager/CastleManager;
      StackMapTable: number_of_entries = 48
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 255 /* full_frame */
          offset_delta = 169
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 47 /* same */
        frame_type = 2 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/sql/ResultSet ]
        frame_type = 46 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/sql/ResultSet ]
        frame_type = 36 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class ext/mods/gameserver/model/residence/castle/Castle, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: ldc           #212                // String xml/castles.xml
         3: invokevirtual #214                // Method parseDataFile:(Ljava/lang/String;)V
         6: getstatic     #200                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #218                // String Loaded {} castles.
        11: iconst_1
        12: anewarray     #2                  // class java/lang/Object
        15: dup
        16: iconst_0
        17: aload_0
        18: getfield      #10                 // Field _castles:Ljava/util/Map;
        21: invokeinterface #220,  1          // InterfaceMethod java/util/Map.size:()I
        26: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: aastore
        30: invokevirtual #223                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        33: return
      LineNumberTable:
        line 138: 0
        line 139: 6
        line 140: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/manager/CastleManager;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: ldc           #227                // String list
         4: aload_0
         5: invokedynamic #229,  0            // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/manager/CastleManager;)Ljava/util/function/Consumer;
        10: invokevirtual #233                // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        13: return
      LineNumberTable:
        line 145: 0
        line 245: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      14     1   doc   Lorg/w3c/dom/Document;
            0      14     2  path   Ljava/nio/file/Path;

  public ext.mods.gameserver.model.residence.castle.Castle getCastleById(int);
    descriptor: (I)Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #51                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #57,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        16: areturn
      LineNumberTable:
        line 249: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      17     1 castleId   I

  public ext.mods.gameserver.model.residence.castle.Castle getCastleByOwner(ext.mods.gameserver.model.pledge.Clan);
    descriptor: (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #241,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #247,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/pledge/Clan;)Ljava/util/function/Predicate;
        20: invokeinterface #251,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #257,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #261                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        37: areturn
      LineNumberTable:
        line 254: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      38     1  clan   Lext/mods/gameserver/model/pledge/Clan;

  public ext.mods.gameserver.model.residence.castle.Castle getCastleByAlias(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #241,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_1
        15: invokedynamic #266,  0            // InvokeDynamic #2:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        20: invokeinterface #251,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        25: invokeinterface #257,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        30: aconst_null
        31: invokevirtual #261                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        34: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        37: areturn
      LineNumberTable:
        line 259: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      38     1 alias   Ljava/lang/String;

  public ext.mods.gameserver.model.residence.castle.Castle getCastle(int, int, int);
    descriptor: (III)Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #241,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: iload_1
        15: iload_2
        16: iload_3
        17: invokedynamic #269,  0            // InvokeDynamic #3:test:(III)Ljava/util/function/Predicate;
        22: invokeinterface #251,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        27: invokeinterface #257,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        32: aconst_null
        33: invokevirtual #261                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        36: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        39: areturn
      LineNumberTable:
        line 264: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      40     1     x   I
            0      40     2     y   I
            0      40     3     z   I

  public ext.mods.gameserver.model.residence.castle.Castle getCastle(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #272                // Method ext/mods/gameserver/model/WorldObject.getX:()I
         5: aload_1
         6: invokevirtual #277                // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: aload_1
        10: invokevirtual #280                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        13: invokevirtual #283                // Method getCastle:(III)Lext/mods/gameserver/model/residence/castle/Castle;
        16: areturn
      LineNumberTable:
        line 269: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      17     1 object   Lext/mods/gameserver/model/WorldObject;

  public java.util.Collection<ext.mods.gameserver.model.residence.castle.Castle> getCastles();
    descriptor: ()Ljava/util/Collection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: areturn
      LineNumberTable:
        line 274: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/data/manager/CastleManager;
    Signature: #686                         // ()Ljava/util/Collection<Lext/mods/gameserver/model/residence/castle/Castle;>;

  public void validateTaxes(ext.mods.gameserver.enums.CabalType);
    descriptor: (Lext/mods/gameserver/enums/CabalType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: getstatic     #287                // Field ext/mods/gameserver/data/manager/CastleManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
         3: aload_1
         4: invokevirtual #293                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
         7: iaload
         8: lookupswitch  { // 2

                       1: 36

                       2: 42
                 default: 47
            }
        36: bipush        25
        38: istore_2
        39: goto          50
        42: iconst_5
        43: istore_2
        44: goto          50
        47: bipush        15
        49: istore_2
        50: aload_0
        51: getfield      #10                 // Field _castles:Ljava/util/Map;
        54: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        59: invokeinterface #241,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        64: iload_2
        65: invokedynamic #298,  0            // InvokeDynamic #4:test:(I)Ljava/util/function/Predicate;
        70: invokeinterface #251,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        75: iload_2
        76: invokedynamic #301,  0            // InvokeDynamic #5:accept:(I)Ljava/util/function/Consumer;
        81: invokeinterface #304,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        86: return
      LineNumberTable:
        line 280: 0
        line 283: 36
        line 284: 39
        line 287: 42
        line 288: 44
        line 291: 47
        line 295: 50
        line 296: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39       3     2 maxTax   I
           44       3     2 maxTax   I
            0      87     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      87     1 sealStrifeOwner   Lext/mods/gameserver/enums/CabalType;
           50      37     2 maxTax   I
      StackMapTable: number_of_entries = 4
        frame_type = 36 /* same */
        frame_type = 5 /* same */
        frame_type = 4 /* same */
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]

  public ext.mods.gameserver.model.residence.castle.Siege getActiveSiege(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #272                // Method ext/mods/gameserver/model/WorldObject.getX:()I
         5: aload_1
         6: invokevirtual #277                // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: aload_1
        10: invokevirtual #280                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        13: invokevirtual #307                // Method getActiveSiege:(III)Lext/mods/gameserver/model/residence/castle/Siege;
        16: areturn
      LineNumberTable:
        line 304: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      17     1 object   Lext/mods/gameserver/model/WorldObject;

  public ext.mods.gameserver.model.residence.castle.Siege getActiveSiege(int, int, int);
    descriptor: (III)Lext/mods/gameserver/model/residence/castle/Siege;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #311,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore        4
        16: aload         4
        18: invokeinterface #315,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        23: ifeq          73
        26: aload         4
        28: invokeinterface #320,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        33: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        36: astore        5
        38: aload         5
        40: invokevirtual #323                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
        43: astore        6
        45: aload         6
        47: invokevirtual #327                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
        50: ifeq          70
        53: aload         5
        55: invokevirtual #332                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiegeZone:()Lext/mods/gameserver/model/zone/type/SiegeZone;
        58: iload_1
        59: iload_2
        60: iload_3
        61: invokevirtual #336                // Method ext/mods/gameserver/model/zone/type/SiegeZone.isInsideZone:(III)Z
        64: ifeq          70
        67: aload         6
        69: areturn
        70: goto          16
        73: aconst_null
        74: areturn
      LineNumberTable:
        line 315: 0
        line 317: 38
        line 318: 45
        line 319: 67
        line 320: 70
        line 321: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45      25     6 siege   Lext/mods/gameserver/model/residence/castle/Siege;
           38      32     5 castle   Lext/mods/gameserver/model/residence/castle/Castle;
            0      75     0  this   Lext/mods/gameserver/data/manager/CastleManager;
            0      75     1     x   I
            0      75     2     y   I
            0      75     3     z   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Iterator ]
        frame_type = 53 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void resetCertificates();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #311,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        14: astore_1
        15: aload_1
        16: invokeinterface #315,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          45
        24: aload_1
        25: invokeinterface #320,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        30: checkcast     #63                 // class ext/mods/gameserver/model/residence/castle/Castle
        33: astore_2
        34: aload_2
        35: sipush        300
        38: iconst_0
        39: invokevirtual #126                // Method ext/mods/gameserver/model/residence/castle/Castle.setLeftCertificates:(IZ)V
        42: goto          15
        45: invokestatic  #19                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        48: astore_1
        49: aload_1
        50: ldc_w         #342                // String UPDATE castle SET certificates=300
        53: invokeinterface #27,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        58: astore_2
        59: aload_2
        60: invokeinterface #344,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        65: pop
        66: aload_2
        67: ifnull        103
        70: aload_2
        71: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        76: goto          103
        79: astore_3
        80: aload_2
        81: ifnull        101
        84: aload_2
        85: invokeinterface #196,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        90: goto          101
        93: astore        4
        95: aload_3
        96: aload         4
        98: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       101: aload_3
       102: athrow
       103: aload_1
       104: ifnull        138
       107: aload_1
       108: invokeinterface #197,  1          // InterfaceMethod java/sql/Connection.close:()V
       113: goto          138
       116: astore_2
       117: aload_1
       118: ifnull        136
       121: aload_1
       122: invokeinterface #197,  1          // InterfaceMethod java/sql/Connection.close:()V
       127: goto          136
       130: astore_3
       131: aload_2
       132: aload_3
       133: invokevirtual #163                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       136: aload_2
       137: athrow
       138: goto          152
       141: astore_1
       142: getstatic     #200                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       145: ldc_w         #347                // String Failed to reset certificates.
       148: aload_1
       149: invokevirtual #206                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       152: return
      Exception table:
         from    to  target type
            59    66    79   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
            49   103   116   Class java/lang/Throwable
           121   127   130   Class java/lang/Throwable
            45   138   141   Class java/lang/Exception
      LineNumberTable:
        line 329: 0
        line 330: 34
        line 332: 45
        line 333: 49
        line 335: 59
        line 336: 66
        line 332: 79
        line 336: 103
        line 332: 116
        line 340: 138
        line 337: 141
        line 339: 142
        line 341: 152
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       8     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           59      44     2    ps   Ljava/sql/PreparedStatement;
           49      89     1   con   Ljava/sql/Connection;
          142      10     1     e   Ljava/lang/Exception;
            0     153     0  this   Lext/mods/gameserver/data/manager/CastleManager;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 29
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/CastleManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public void spawnEntities();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #349,  0            // InvokeDynamic #6:accept:()Ljava/util/function/Consumer;
        14: invokeinterface #352,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        19: return
      LineNumberTable:
        line 345: 0
        line 363: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/CastleManager;

  public void updateTaxes();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _castles:Ljava/util/Map;
         4: invokeinterface #237,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokedynamic #353,  0            // InvokeDynamic #7:accept:()Ljava/util/function/Consumer;
        14: invokeinterface #352,  2          // InterfaceMethod java/util/Collection.forEach:(Ljava/util/function/Consumer;)V
        19: return
      LineNumberTable:
        line 382: 0
        line 383: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/CastleManager;

  public static final ext.mods.gameserver.data.manager.CastleManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/CastleManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #354                // Field ext/mods/gameserver/data/manager/CastleManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CastleManager;
         3: areturn
      LineNumberTable:
        line 387: 0
}
SourceFile: "CastleManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/CastleManager$1
  ext/mods/gameserver/data/manager/CastleManager$SingletonHolder
BootstrapMethods:
  0: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #794 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$0:(Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  1: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #798 (Ljava/lang/Object;)Z
      #799 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$getCastleByOwner$0:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/residence/castle/Castle;)Z
      #802 (Lext/mods/gameserver/model/residence/castle/Castle;)Z
  2: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #798 (Ljava/lang/Object;)Z
      #804 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$getCastleByAlias$0:(Ljava/lang/String;Lext/mods/gameserver/model/residence/castle/Castle;)Z
      #802 (Lext/mods/gameserver/model/residence/castle/Castle;)Z
  3: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #798 (Ljava/lang/Object;)Z
      #807 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$getCastle$0:(IIILext/mods/gameserver/model/residence/castle/Castle;)Z
      #802 (Lext/mods/gameserver/model/residence/castle/Castle;)Z
  4: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #798 (Ljava/lang/Object;)Z
      #810 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$validateTaxes$0:(ILext/mods/gameserver/model/residence/castle/Castle;)Z
      #802 (Lext/mods/gameserver/model/residence/castle/Castle;)Z
  5: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #813 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$validateTaxes$1:(ILext/mods/gameserver/model/residence/castle/Castle;)V
      #816 (Lext/mods/gameserver/model/residence/castle/Castle;)V
  6: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #817 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$spawnEntities$0:(Lext/mods/gameserver/model/residence/castle/Castle;)V
      #816 (Lext/mods/gameserver/model/residence/castle/Castle;)V
  7: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #820 REF_invokeVirtual ext/mods/gameserver/model/residence/castle/Castle.updateTaxes:()V
      #816 (Lext/mods/gameserver/model/residence/castle/Castle;)V
  8: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #823 REF_invokeVirtual ext/mods/gameserver/model/location/TowerSpawnLocation.spawnMe:()V
      #827 (Lext/mods/gameserver/model/location/TowerSpawnLocation;)V
  9: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #829 (Ljava/lang/Object;Ljava/lang/Object;)V
      #831 REF_invokeStatic ext/mods/gameserver/data/manager/CastleManager.lambda$spawnEntities$1:(Lext/mods/gameserver/model/residence/castle/Castle;Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
      #834 (Ljava/lang/Integer;Lext/mods/gameserver/model/location/SpawnLocation;)V
  10: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #836 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$1:(Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  11: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #839 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$2:(Lext/mods/commons/data/StatSet;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  12: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #842 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$3:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  13: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #845 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$5:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  14: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #848 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$8:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  15: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #851 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$11:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  16: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #854 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$13:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  17: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #857 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$18:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  18: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #860 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$19:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  19: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #863 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$20:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  20: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #866 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$22:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  21: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #869 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$23:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  22: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #872 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$21:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  23: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #875 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$14:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  24: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #878 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$15:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  25: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #881 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$16:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  26: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #884 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$17:(Lext/mods/gameserver/model/location/TowerSpawnLocation;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  27: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #887 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$12:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  28: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #890 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$9:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  29: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #893 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$10:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  30: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #896 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  31: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #899 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$7:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
  32: #905 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #792 (Ljava/lang/Object;)V
      #902 REF_invokeVirtual ext/mods/gameserver/data/manager/CastleManager.lambda$parseDocument$4:(Lext/mods/gameserver/model/residence/castle/Castle;Lorg/w3c/dom/Node;)V
      #797 (Lorg/w3c/dom/Node;)V
InnerClasses:
  static #288;                            // class ext/mods/gameserver/data/manager/CastleManager$1
  public static final #918= #914 of #916; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
