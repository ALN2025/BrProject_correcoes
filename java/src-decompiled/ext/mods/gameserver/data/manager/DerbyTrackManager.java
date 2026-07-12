// Bytecode for: ext.mods.gameserver.data.manager.DerbyTrackManager
// File: ext\mods\gameserver\data\manager\DerbyTrackManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/DerbyTrackManager.class
  Last modified 9 de jul de 2026; size 16106 bytes
  MD5 checksum 4a0da9dba59f43bd9a68db8e955e8fe5
  Compiled from "DerbyTrackManager.java"
public class ext.mods.gameserver.data.manager.DerbyTrackManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/DerbyTrackManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 21, methods: 22, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/DerbyTrackManager._runners:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/DerbyTrackManager
   #12 = NameAndType        #14:#15       // _runners:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager
   #14 = Utf8               _runners
   #15 = Utf8               Ljava/util/List;
   #16 = Class              #17           // java/util/TreeMap
   #17 = Utf8               java/util/TreeMap
   #18 = Methodref          #16.#3        // java/util/TreeMap."<init>":()V
   #19 = Fieldref           #11.#20       // ext/mods/gameserver/data/manager/DerbyTrackManager._history:Ljava/util/TreeMap;
   #20 = NameAndType        #21:#22       // _history:Ljava/util/TreeMap;
   #21 = Utf8               _history
   #22 = Utf8               Ljava/util/TreeMap;
   #23 = Class              #24           // java/util/concurrent/ConcurrentHashMap
   #24 = Utf8               java/util/concurrent/ConcurrentHashMap
   #25 = Methodref          #23.#3        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #26 = Fieldref           #11.#27       // ext/mods/gameserver/data/manager/DerbyTrackManager._betsPerLane:Ljava/util/Map;
   #27 = NameAndType        #28:#29       // _betsPerLane:Ljava/util/Map;
   #28 = Utf8               _betsPerLane
   #29 = Utf8               Ljava/util/Map;
   #30 = Fieldref           #11.#31       // ext/mods/gameserver/data/manager/DerbyTrackManager._odds:Ljava/util/List;
   #31 = NameAndType        #32:#15       // _odds:Ljava/util/List;
   #32 = Utf8               _odds
   #33 = Fieldref           #11.#34       // ext/mods/gameserver/data/manager/DerbyTrackManager._raceNumber:I
   #34 = NameAndType        #35:#36       // _raceNumber:I
   #35 = Utf8               _raceNumber
   #36 = Utf8               I
   #37 = Fieldref           #11.#38       // ext/mods/gameserver/data/manager/DerbyTrackManager._finalCountdown:I
   #38 = NameAndType        #39:#36       // _finalCountdown:I
   #39 = Utf8               _finalCountdown
   #40 = Fieldref           #41.#42       // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.RACE_END:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #41 = Class              #43           // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
   #42 = NameAndType        #44:#45       // RACE_END:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #43 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
   #44 = Utf8               RACE_END
   #45 = Utf8               Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #46 = Fieldref           #11.#47       // ext/mods/gameserver/data/manager/DerbyTrackManager._state:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #47 = NameAndType        #48:#45       // _state:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
   #48 = Utf8               _state
   #49 = Methodref          #11.#50       // ext/mods/gameserver/data/manager/DerbyTrackManager.loadHistory:()V
   #50 = NameAndType        #51:#6        // loadHistory:()V
   #51 = Utf8               loadHistory
   #52 = Methodref          #11.#53       // ext/mods/gameserver/data/manager/DerbyTrackManager.loadBets:()V
   #53 = NameAndType        #54:#6        // loadBets:()V
   #54 = Utf8               loadBets
   #55 = Methodref          #56.#57       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #56 = Class              #58           // ext/mods/gameserver/data/xml/NpcData
   #57 = NameAndType        #59:#60       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #58 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #59 = Utf8               getInstance
   #60 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #61 = Methodref          #56.#62       // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #62 = NameAndType        #63:#64       // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #63 = Utf8               getTemplate
   #64 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
   #66 = Class              #68           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #67 = NameAndType        #69:#70       // getType:()Ljava/lang/String;
   #68 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #69 = Utf8               getType
   #70 = Utf8               ()Ljava/lang/String;
   #71 = InvokeDynamic      #0:#72        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #72 = NameAndType        #73:#74       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #73 = Utf8               makeConcatWithConstants
   #74 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #75 = Methodref          #76.#77       // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
   #76 = Class              #78           // java/lang/Class
   #77 = NameAndType        #79:#80       // forName:(Ljava/lang/String;)Ljava/lang/Class;
   #78 = Utf8               java/lang/Class
   #79 = Utf8               forName
   #80 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
   #81 = Methodref          #76.#82       // java/lang/Class.getConstructors:()[Ljava/lang/reflect/Constructor;
   #82 = NameAndType        #83:#84       // getConstructors:()[Ljava/lang/reflect/Constructor;
   #83 = Utf8               getConstructors
   #84 = Utf8               ()[Ljava/lang/reflect/Constructor;
   #85 = Methodref          #86.#87       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #86 = Class              #88           // ext/mods/gameserver/idfactory/IdFactory
   #87 = NameAndType        #59:#89       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #88 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #89 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #90 = Methodref          #86.#91       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #91 = NameAndType        #92:#93       // getNextId:()I
   #92 = Utf8               getNextId
   #93 = Utf8               ()I
   #94 = Methodref          #95.#96       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #95 = Class              #97           // java/lang/Integer
   #96 = NameAndType        #98:#99       // valueOf:(I)Ljava/lang/Integer;
   #97 = Utf8               java/lang/Integer
   #98 = Utf8               valueOf
   #99 = Utf8               (I)Ljava/lang/Integer;
  #100 = Methodref          #101.#102     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #101 = Class              #103          // java/lang/reflect/Constructor
  #102 = NameAndType        #104:#105     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #103 = Utf8               java/lang/reflect/Constructor
  #104 = Utf8               newInstance
  #105 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #106 = Class              #107          // ext/mods/gameserver/model/actor/Npc
  #107 = Utf8               ext/mods/gameserver/model/actor/Npc
  #108 = InterfaceMethodref #109.#110     // java/util/List.add:(Ljava/lang/Object;)Z
  #109 = Class              #111          // java/util/List
  #110 = NameAndType        #112:#113     // add:(Ljava/lang/Object;)Z
  #111 = Utf8               java/util/List
  #112 = Utf8               add
  #113 = Utf8               (Ljava/lang/Object;)Z
  #114 = Class              #115          // java/lang/Exception
  #115 = Utf8               java/lang/Exception
  #116 = Fieldref           #11.#117      // ext/mods/gameserver/data/manager/DerbyTrackManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #117 = NameAndType        #118:#119     // LOGGER:Lext/mods/commons/logging/CLogger;
  #118 = Utf8               LOGGER
  #119 = Utf8               Lext/mods/commons/logging/CLogger;
  #120 = String             #121          // Couldn\'t initialize runners.
  #121 = Utf8               Couldn\'t initialize runners.
  #122 = Methodref          #123.#124     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #123 = Class              #125          // ext/mods/commons/logging/CLogger
  #124 = NameAndType        #126:#127     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #125 = Utf8               ext/mods/commons/logging/CLogger
  #126 = Utf8               error
  #127 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #128 = Class              #129          // "[[I"
  #129 = Utf8               [[I
  #130 = Fieldref           #11.#131      // ext/mods/gameserver/data/manager/DerbyTrackManager._speeds:[[I
  #131 = NameAndType        #132:#129     // _speeds:[[I
  #132 = Utf8               _speeds
  #133 = InvokeDynamic      #1:#134       // #1:run:(Lext/mods/gameserver/data/manager/DerbyTrackManager;)Ljava/lang/Runnable;
  #134 = NameAndType        #135:#136     // run:(Lext/mods/gameserver/data/manager/DerbyTrackManager;)Ljava/lang/Runnable;
  #135 = Utf8               run
  #136 = Utf8               (Lext/mods/gameserver/data/manager/DerbyTrackManager;)Ljava/lang/Runnable;
  #137 = Long               1000l
  #139 = Methodref          #140.#141     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #140 = Class              #142          // ext/mods/commons/pool/ThreadPool
  #141 = NameAndType        #143:#144     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #142 = Utf8               ext/mods/commons/pool/ThreadPool
  #143 = Utf8               scheduleAtFixedRate
  #144 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #145 = Fieldref           #11.#146      // ext/mods/gameserver/data/manager/DerbyTrackManager._chosenRunners:Ljava/util/List;
  #146 = NameAndType        #147:#15      // _chosenRunners:Ljava/util/List;
  #147 = Utf8               _chosenRunners
  #148 = InterfaceMethodref #109.#149     // java/util/List.get:(I)Ljava/lang/Object;
  #149 = NameAndType        #150:#151     // get:(I)Ljava/lang/Object;
  #150 = Utf8               get
  #151 = Utf8               (I)Ljava/lang/Object;
  #152 = String             #153          //
  #153 = Utf8
  #154 = Methodref          #106.#155     // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #155 = NameAndType        #156:#70      // getName:()Ljava/lang/String;
  #156 = Utf8               getName
  #157 = Fieldref           #11.#158      // ext/mods/gameserver/data/manager/DerbyTrackManager._firstIndex:I
  #158 = NameAndType        #159:#36      // _firstIndex:I
  #159 = Utf8               _firstIndex
  #160 = Fieldref           #11.#161      // ext/mods/gameserver/data/manager/DerbyTrackManager._secondIndex:I
  #161 = NameAndType        #162:#36      // _secondIndex:I
  #162 = Utf8               _secondIndex
  #163 = Fieldref           #11.#164      // ext/mods/gameserver/data/manager/DerbyTrackManager._packet:Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #164 = NameAndType        #165:#166     // _packet:Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #165 = Utf8               _packet
  #166 = Utf8               Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #167 = Methodref          #16.#168      // java/util/TreeMap.descendingMap:()Ljava/util/NavigableMap;
  #168 = NameAndType        #169:#170     // descendingMap:()Ljava/util/NavigableMap;
  #169 = Utf8               descendingMap
  #170 = Utf8               ()Ljava/util/NavigableMap;
  #171 = InterfaceMethodref #172.#173     // java/util/NavigableMap.values:()Ljava/util/Collection;
  #172 = Class              #174          // java/util/NavigableMap
  #173 = NameAndType        #175:#176     // values:()Ljava/util/Collection;
  #174 = Utf8               java/util/NavigableMap
  #175 = Utf8               values
  #176 = Utf8               ()Ljava/util/Collection;
  #177 = InterfaceMethodref #178.#179     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #178 = Class              #180          // java/util/Collection
  #179 = NameAndType        #181:#182     // stream:()Ljava/util/stream/Stream;
  #180 = Utf8               java/util/Collection
  #181 = Utf8               stream
  #182 = Utf8               ()Ljava/util/stream/Stream;
  #183 = Long               8l
  #185 = InterfaceMethodref #186.#187     // java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
  #186 = Class              #188          // java/util/stream/Stream
  #187 = NameAndType        #189:#190     // limit:(J)Ljava/util/stream/Stream;
  #188 = Utf8               java/util/stream/Stream
  #189 = Utf8               limit
  #190 = Utf8               (J)Ljava/util/stream/Stream;
  #191 = InterfaceMethodref #186.#192     // java/util/stream/Stream.toList:()Ljava/util/List;
  #192 = NameAndType        #193:#194     // toList:()Ljava/util/List;
  #193 = Utf8               toList
  #194 = Utf8               ()Ljava/util/List;
  #195 = Methodref          #16.#196      // java/util/TreeMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #196 = NameAndType        #150:#197     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #197 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #198 = Class              #199          // ext/mods/gameserver/model/HistoryInfo
  #199 = Utf8               ext/mods/gameserver/model/HistoryInfo
  #200 = Methodref          #198.#201     // ext/mods/gameserver/model/HistoryInfo."<init>":(IIID)V
  #201 = NameAndType        #5:#202       // "<init>":(IIID)V
  #202 = Utf8               (IIID)V
  #203 = Methodref          #16.#204      // java/util/TreeMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #204 = NameAndType        #205:#206     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #205 = Utf8               put
  #206 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #207 = Methodref          #208.#209     // java/util/Collections.shuffle:(Ljava/util/List;)V
  #208 = Class              #210          // java/util/Collections
  #209 = NameAndType        #211:#212     // shuffle:(Ljava/util/List;)V
  #210 = Utf8               java/util/Collections
  #211 = Utf8               shuffle
  #212 = Utf8               (Ljava/util/List;)V
  #213 = InterfaceMethodref #109.#214     // java/util/List.subList:(II)Ljava/util/List;
  #214 = NameAndType        #215:#216     // subList:(II)Ljava/util/List;
  #215 = Utf8               subList
  #216 = Utf8               (II)Ljava/util/List;
  #217 = Methodref          #218.#219     // ext/mods/commons/random/Rnd.get:(I)I
  #218 = Class              #220          // ext/mods/commons/random/Rnd
  #219 = NameAndType        #150:#221     // get:(I)I
  #220 = Utf8               ext/mods/commons/random/Rnd
  #221 = Utf8               (I)I
  #222 = Methodref          #223.#224     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #223 = Class              #225          // ext/mods/commons/pool/ConnectionPool
  #224 = NameAndType        #226:#227     // getConnection:()Ljava/sql/Connection;
  #225 = Utf8               ext/mods/commons/pool/ConnectionPool
  #226 = Utf8               getConnection
  #227 = Utf8               ()Ljava/sql/Connection;
  #228 = String             #229          // SELECT * FROM mdt_history
  #229 = Utf8               SELECT * FROM mdt_history
  #230 = InterfaceMethodref #231.#232     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #231 = Class              #233          // java/sql/Connection
  #232 = NameAndType        #234:#235     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #233 = Utf8               java/sql/Connection
  #234 = Utf8               prepareStatement
  #235 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #236 = InterfaceMethodref #237.#238     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #237 = Class              #239          // java/sql/PreparedStatement
  #238 = NameAndType        #240:#241     // executeQuery:()Ljava/sql/ResultSet;
  #239 = Utf8               java/sql/PreparedStatement
  #240 = Utf8               executeQuery
  #241 = Utf8               ()Ljava/sql/ResultSet;
  #242 = InterfaceMethodref #243.#244     // java/sql/ResultSet.next:()Z
  #243 = Class              #245          // java/sql/ResultSet
  #244 = NameAndType        #246:#247     // next:()Z
  #245 = Utf8               java/sql/ResultSet
  #246 = Utf8               next
  #247 = Utf8               ()Z
  #248 = String             #249          // race_id
  #249 = Utf8               race_id
  #250 = InterfaceMethodref #243.#251     // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
  #251 = NameAndType        #252:#253     // getInt:(Ljava/lang/String;)I
  #252 = Utf8               getInt
  #253 = Utf8               (Ljava/lang/String;)I
  #254 = String             #255          // first
  #255 = Utf8               first
  #256 = String             #257          // second
  #257 = Utf8               second
  #258 = String             #259          // odd_rate
  #259 = Utf8               odd_rate
  #260 = InterfaceMethodref #243.#261     // java/sql/ResultSet.getDouble:(Ljava/lang/String;)D
  #261 = NameAndType        #262:#263     // getDouble:(Ljava/lang/String;)D
  #262 = Utf8               getDouble
  #263 = Utf8               (Ljava/lang/String;)D
  #264 = InterfaceMethodref #243.#265     // java/sql/ResultSet.close:()V
  #265 = NameAndType        #266:#6       // close:()V
  #266 = Utf8               close
  #267 = Class              #268          // java/lang/Throwable
  #268 = Utf8               java/lang/Throwable
  #269 = Methodref          #267.#270     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #270 = NameAndType        #271:#272     // addSuppressed:(Ljava/lang/Throwable;)V
  #271 = Utf8               addSuppressed
  #272 = Utf8               (Ljava/lang/Throwable;)V
  #273 = InterfaceMethodref #237.#265     // java/sql/PreparedStatement.close:()V
  #274 = InterfaceMethodref #231.#265     // java/sql/Connection.close:()V
  #275 = String             #276          // Can\'t load Derby Track history.
  #276 = Utf8               Can\'t load Derby Track history.
  #277 = String             #278          // Loaded {} Derby Track records, currently on race #{}.
  #278 = Utf8               Loaded {} Derby Track records, currently on race #{}.
  #279 = Methodref          #16.#280      // java/util/TreeMap.size:()I
  #280 = NameAndType        #281:#93      // size:()I
  #281 = Utf8               size
  #282 = Methodref          #123.#283     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #283 = NameAndType        #284:#285     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #284 = Utf8               info
  #285 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #286 = String             #287          // SELECT * FROM mdt_bets
  #287 = Utf8               SELECT * FROM mdt_bets
  #288 = String             #289          // lane_id
  #289 = Utf8               lane_id
  #290 = String             #291          // bet
  #291 = Utf8               bet
  #292 = InterfaceMethodref #243.#293     // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #293 = NameAndType        #294:#295     // getLong:(Ljava/lang/String;)J
  #294 = Utf8               getLong
  #295 = Utf8               (Ljava/lang/String;)J
  #296 = Methodref          #11.#297      // ext/mods/gameserver/data/manager/DerbyTrackManager.setBetOnLane:(IJZ)V
  #297 = NameAndType        #298:#299     // setBetOnLane:(IJZ)V
  #298 = Utf8               setBetOnLane
  #299 = Utf8               (IJZ)V
  #300 = String             #301          // Can\'t load Derby Track bets.
  #301 = Utf8               Can\'t load Derby Track bets.
  #302 = InterfaceMethodref #303.#304     // java/util/Map.keySet:()Ljava/util/Set;
  #303 = Class              #305          // java/util/Map
  #304 = NameAndType        #306:#307     // keySet:()Ljava/util/Set;
  #305 = Utf8               java/util/Map
  #306 = Utf8               keySet
  #307 = Utf8               ()Ljava/util/Set;
  #308 = InterfaceMethodref #309.#310     // java/util/Set.iterator:()Ljava/util/Iterator;
  #309 = Class              #311          // java/util/Set
  #310 = NameAndType        #312:#313     // iterator:()Ljava/util/Iterator;
  #311 = Utf8               java/util/Set
  #312 = Utf8               iterator
  #313 = Utf8               ()Ljava/util/Iterator;
  #314 = InterfaceMethodref #315.#316     // java/util/Iterator.hasNext:()Z
  #315 = Class              #317          // java/util/Iterator
  #316 = NameAndType        #318:#247     // hasNext:()Z
  #317 = Utf8               java/util/Iterator
  #318 = Utf8               hasNext
  #319 = InterfaceMethodref #315.#320     // java/util/Iterator.next:()Ljava/lang/Object;
  #320 = NameAndType        #246:#321     // next:()Ljava/lang/Object;
  #321 = Utf8               ()Ljava/lang/Object;
  #322 = Methodref          #95.#323      // java/lang/Integer.intValue:()I
  #323 = NameAndType        #324:#93      // intValue:()I
  #324 = Utf8               intValue
  #325 = Methodref          #326.#327     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #326 = Class              #328          // java/lang/Long
  #327 = NameAndType        #98:#329      // valueOf:(J)Ljava/lang/Long;
  #328 = Utf8               java/lang/Long
  #329 = Utf8               (J)Ljava/lang/Long;
  #330 = InterfaceMethodref #303.#204     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #331 = String             #332          // UPDATE mdt_bets SET bet = 0
  #332 = Utf8               UPDATE mdt_bets SET bet = 0
  #333 = InterfaceMethodref #237.#334     // java/sql/PreparedStatement.execute:()Z
  #334 = NameAndType        #335:#247     // execute:()Z
  #335 = Utf8               execute
  #336 = String             #337          // Can\'t clear Derby Track bets.
  #337 = Utf8               Can\'t clear Derby Track bets.
  #338 = InterfaceMethodref #303.#339     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #339 = NameAndType        #340:#206     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #340 = Utf8               getOrDefault
  #341 = Methodref          #326.#342     // java/lang/Long.longValue:()J
  #342 = NameAndType        #343:#344     // longValue:()J
  #343 = Utf8               longValue
  #344 = Utf8               ()J
  #345 = String             #346          // REPLACE INTO mdt_bets (lane_id, bet) VALUES (?,?)
  #346 = Utf8               REPLACE INTO mdt_bets (lane_id, bet) VALUES (?,?)
  #347 = InterfaceMethodref #237.#348     // java/sql/PreparedStatement.setInt:(II)V
  #348 = NameAndType        #349:#350     // setInt:(II)V
  #349 = Utf8               setInt
  #350 = Utf8               (II)V
  #351 = InterfaceMethodref #237.#352     // java/sql/PreparedStatement.setLong:(IJ)V
  #352 = NameAndType        #353:#354     // setLong:(IJ)V
  #353 = Utf8               setLong
  #354 = Utf8               (IJ)V
  #355 = String             #356          // Can\'t save Derby Track bet.
  #356 = Utf8               Can\'t save Derby Track bet.
  #357 = InterfaceMethodref #109.#358     // java/util/List.clear:()V
  #358 = NameAndType        #359:#6       // clear:()V
  #359 = Utf8               clear
  #360 = Methodref          #16.#361      // java/util/TreeMap."<init>":(Ljava/util/Map;)V
  #361 = NameAndType        #5:#362       // "<init>":(Ljava/util/Map;)V
  #362 = Utf8               (Ljava/util/Map;)V
  #363 = InterfaceMethodref #303.#173     // java/util/Map.values:()Ljava/util/Collection;
  #364 = InterfaceMethodref #178.#310     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #365 = Double             1.25d
  #367 = Double             0.7d
  #369 = Methodref          #370.#371     // java/lang/Math.max:(DD)D
  #370 = Class              #372          // java/lang/Math
  #371 = NameAndType        #373:#374     // max:(DD)D
  #372 = Utf8               java/lang/Math
  #373 = Utf8               max
  #374 = Utf8               (DD)D
  #375 = Methodref          #376.#377     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #376 = Class              #378          // java/lang/Double
  #377 = NameAndType        #98:#379      // valueOf:(D)Ljava/lang/Double;
  #378 = Utf8               java/lang/Double
  #379 = Utf8               (D)Ljava/lang/Double;
  #380 = Methodref          #11.#381      // ext/mods/gameserver/data/manager/DerbyTrackManager.newRace:()V
  #381 = NameAndType        #382:#6       // newRace:()V
  #382 = Utf8               newRace
  #383 = Methodref          #11.#384      // ext/mods/gameserver/data/manager/DerbyTrackManager.newSpeeds:()V
  #384 = NameAndType        #385:#6       // newSpeeds:()V
  #385 = Utf8               newSpeeds
  #386 = Fieldref           #41.#387      // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #387 = NameAndType        #388:#45      // ACCEPTING_BETS:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #388 = Utf8               ACCEPTING_BETS
  #389 = Class              #390          // ext/mods/gameserver/network/serverpackets/MonRaceInfo
  #390 = Utf8               ext/mods/gameserver/network/serverpackets/MonRaceInfo
  #391 = Fieldref           #11.#392      // ext/mods/gameserver/data/manager/DerbyTrackManager.CODES:[[I
  #392 = NameAndType        #393:#129     // CODES:[[I
  #393 = Utf8               CODES
  #394 = Methodref          #11.#395      // ext/mods/gameserver/data/manager/DerbyTrackManager.getRunners:()Ljava/util/List;
  #395 = NameAndType        #396:#194     // getRunners:()Ljava/util/List;
  #396 = Utf8               getRunners
  #397 = Methodref          #11.#398      // ext/mods/gameserver/data/manager/DerbyTrackManager.getSpeeds:()[[I
  #398 = NameAndType        #399:#400     // getSpeeds:()[[I
  #399 = Utf8               getSpeeds
  #400 = Utf8               ()[[I
  #401 = Methodref          #389.#402     // ext/mods/gameserver/network/serverpackets/MonRaceInfo."<init>":(IILjava/util/List;[[I)V
  #402 = NameAndType        #5:#403       // "<init>":(IILjava/util/List;[[I)V
  #403 = Utf8               (IILjava/util/List;[[I)V
  #404 = Class              #405          // ext/mods/gameserver/model/zone/type/DerbyTrackZone
  #405 = Utf8               ext/mods/gameserver/model/zone/type/DerbyTrackZone
  #406 = Class              #407          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #407 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #408 = Fieldref           #409.#410     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_TICKETS_AVAILABLE_FOR_S1_RACE:Lext/mods/gameserver/network/SystemMessageId;
  #409 = Class              #411          // ext/mods/gameserver/network/SystemMessageId
  #410 = NameAndType        #412:#413     // MONSRACE_TICKETS_AVAILABLE_FOR_S1_RACE:Lext/mods/gameserver/network/SystemMessageId;
  #411 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #412 = Utf8               MONSRACE_TICKETS_AVAILABLE_FOR_S1_RACE
  #413 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #414 = Methodref          #415.#416     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #415 = Class              #417          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #416 = NameAndType        #418:#419     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #417 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #418 = Utf8               getSystemMessage
  #419 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #420 = Methodref          #415.#421     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #421 = NameAndType        #422:#423     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #422 = Utf8               addNumber
  #423 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #424 = Methodref          #425.#426     // ext/mods/gameserver/data/manager/ZoneManager.toAllPlayersInZoneType:(Ljava/lang/Class;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #425 = Class              #427          // ext/mods/gameserver/data/manager/ZoneManager
  #426 = NameAndType        #428:#429     // toAllPlayersInZoneType:(Ljava/lang/Class;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #427 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #428 = Utf8               toAllPlayersInZoneType
  #429 = Utf8               (Ljava/lang/Class;[Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #430 = Fieldref           #409.#431     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_TICKETS_NOW_AVAILABLE_FOR_S1_RACE:Lext/mods/gameserver/network/SystemMessageId;
  #431 = NameAndType        #432:#413     // MONSRACE_TICKETS_NOW_AVAILABLE_FOR_S1_RACE:Lext/mods/gameserver/network/SystemMessageId;
  #432 = Utf8               MONSRACE_TICKETS_NOW_AVAILABLE_FOR_S1_RACE
  #433 = Fieldref           #409.#434     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_TICKETS_STOP_IN_S1_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #434 = NameAndType        #435:#413     // MONSRACE_TICKETS_STOP_IN_S1_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #435 = Utf8               MONSRACE_TICKETS_STOP_IN_S1_MINUTES
  #436 = Fieldref           #41.#437      // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.WAITING:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #437 = NameAndType        #438:#45      // WAITING:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #438 = Utf8               WAITING
  #439 = Methodref          #11.#440      // ext/mods/gameserver/data/manager/DerbyTrackManager.calculateOdds:()V
  #440 = NameAndType        #441:#6       // calculateOdds:()V
  #441 = Utf8               calculateOdds
  #442 = Fieldref           #409.#443     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_S1_TICKET_SALES_CLOSED:Lext/mods/gameserver/network/SystemMessageId;
  #443 = NameAndType        #444:#413     // MONSRACE_S1_TICKET_SALES_CLOSED:Lext/mods/gameserver/network/SystemMessageId;
  #444 = Utf8               MONSRACE_S1_TICKET_SALES_CLOSED
  #445 = Fieldref           #409.#446     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_S2_BEGINS_IN_S1_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #446 = NameAndType        #447:#413     // MONSRACE_S2_BEGINS_IN_S1_MINUTES:Lext/mods/gameserver/network/SystemMessageId;
  #447 = Utf8               MONSRACE_S2_BEGINS_IN_S1_MINUTES
  #448 = Fieldref           #409.#449     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_S1_BEGINS_IN_30_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #449 = NameAndType        #450:#413     // MONSRACE_S1_BEGINS_IN_30_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #450 = Utf8               MONSRACE_S1_BEGINS_IN_30_SECONDS
  #451 = Fieldref           #409.#452     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_S1_COUNTDOWN_IN_FIVE_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #452 = NameAndType        #453:#413     // MONSRACE_S1_COUNTDOWN_IN_FIVE_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #453 = Utf8               MONSRACE_S1_COUNTDOWN_IN_FIVE_SECONDS
  #454 = Fieldref           #409.#455     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_BEGINS_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #455 = NameAndType        #456:#413     // MONSRACE_BEGINS_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #456 = Utf8               MONSRACE_BEGINS_IN_S1_SECONDS
  #457 = Fieldref           #41.#458      // ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.STARTING_RACE:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #458 = NameAndType        #459:#45      // STARTING_RACE:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #459 = Utf8               STARTING_RACE
  #460 = Fieldref           #409.#461     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_RACE_START:Lext/mods/gameserver/network/SystemMessageId;
  #461 = NameAndType        #462:#413     // MONSRACE_RACE_START:Lext/mods/gameserver/network/SystemMessageId;
  #462 = Utf8               MONSRACE_RACE_START
  #463 = Fieldref           #11.#464      // ext/mods/gameserver/data/manager/DerbyTrackManager.SOUND_1:Lext/mods/gameserver/network/serverpackets/PlaySound;
  #464 = NameAndType        #465:#466     // SOUND_1:Lext/mods/gameserver/network/serverpackets/PlaySound;
  #465 = Utf8               SOUND_1
  #466 = Utf8               Lext/mods/gameserver/network/serverpackets/PlaySound;
  #467 = Fieldref           #11.#468      // ext/mods/gameserver/data/manager/DerbyTrackManager.SOUND_2:Lext/mods/gameserver/network/serverpackets/PlaySound;
  #468 = NameAndType        #469:#466     // SOUND_2:Lext/mods/gameserver/network/serverpackets/PlaySound;
  #469 = Utf8               SOUND_2
  #470 = Methodref          #11.#471      // ext/mods/gameserver/data/manager/DerbyTrackManager.getHistoryInfo:(I)Lext/mods/gameserver/model/HistoryInfo;
  #471 = NameAndType        #472:#473     // getHistoryInfo:(I)Lext/mods/gameserver/model/HistoryInfo;
  #472 = Utf8               getHistoryInfo
  #473 = Utf8               (I)Lext/mods/gameserver/model/HistoryInfo;
  #474 = Methodref          #11.#475      // ext/mods/gameserver/data/manager/DerbyTrackManager.getFirst:()I
  #475 = NameAndType        #476:#93      // getFirst:()I
  #476 = Utf8               getFirst
  #477 = Methodref          #198.#478     // ext/mods/gameserver/model/HistoryInfo.setFirst:(I)V
  #478 = NameAndType        #479:#480     // setFirst:(I)V
  #479 = Utf8               setFirst
  #480 = Utf8               (I)V
  #481 = Methodref          #11.#482      // ext/mods/gameserver/data/manager/DerbyTrackManager.getSecond:()I
  #482 = NameAndType        #483:#93      // getSecond:()I
  #483 = Utf8               getSecond
  #484 = Methodref          #198.#485     // ext/mods/gameserver/model/HistoryInfo.setSecond:(I)V
  #485 = NameAndType        #486:#480     // setSecond:(I)V
  #486 = Utf8               setSecond
  #487 = Methodref          #376.#488     // java/lang/Double.doubleValue:()D
  #488 = NameAndType        #489:#490     // doubleValue:()D
  #489 = Utf8               doubleValue
  #490 = Utf8               ()D
  #491 = Methodref          #198.#492     // ext/mods/gameserver/model/HistoryInfo.setOddRate:(D)V
  #492 = NameAndType        #493:#494     // setOddRate:(D)V
  #493 = Utf8               setOddRate
  #494 = Utf8               (D)V
  #495 = String             #496          // INSERT INTO mdt_history (race_id, first, second, odd_rate) VALUES (?,?,?,?)
  #496 = Utf8               INSERT INTO mdt_history (race_id, first, second, odd_rate) VALUES (?,?,?,?)
  #497 = Methodref          #198.#498     // ext/mods/gameserver/model/HistoryInfo.getRaceId:()I
  #498 = NameAndType        #499:#93      // getRaceId:()I
  #499 = Utf8               getRaceId
  #500 = Methodref          #198.#475     // ext/mods/gameserver/model/HistoryInfo.getFirst:()I
  #501 = Methodref          #198.#482     // ext/mods/gameserver/model/HistoryInfo.getSecond:()I
  #502 = Methodref          #198.#503     // ext/mods/gameserver/model/HistoryInfo.getOddRate:()D
  #503 = NameAndType        #504:#490     // getOddRate:()D
  #504 = Utf8               getOddRate
  #505 = InterfaceMethodref #237.#506     // java/sql/PreparedStatement.setDouble:(ID)V
  #506 = NameAndType        #507:#508     // setDouble:(ID)V
  #507 = Utf8               setDouble
  #508 = Utf8               (ID)V
  #509 = String             #510          // Can\'t save Derby Track history.
  #510 = Utf8               Can\'t save Derby Track history.
  #511 = Methodref          #11.#512      // ext/mods/gameserver/data/manager/DerbyTrackManager.clearBets:()V
  #512 = NameAndType        #513:#6       // clearBets:()V
  #513 = Utf8               clearBets
  #514 = Fieldref           #409.#515     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_FIRST_PLACE_S1_SECOND_S2:Lext/mods/gameserver/network/SystemMessageId;
  #515 = NameAndType        #516:#413     // MONSRACE_FIRST_PLACE_S1_SECOND_S2:Lext/mods/gameserver/network/SystemMessageId;
  #516 = Utf8               MONSRACE_FIRST_PLACE_S1_SECOND_S2
  #517 = Fieldref           #409.#518     // ext/mods/gameserver/network/SystemMessageId.MONSRACE_S1_RACE_END:Lext/mods/gameserver/network/SystemMessageId;
  #518 = NameAndType        #519:#413     // MONSRACE_S1_RACE_END:Lext/mods/gameserver/network/SystemMessageId;
  #519 = Utf8               MONSRACE_S1_RACE_END
  #520 = Class              #521          // ext/mods/gameserver/network/serverpackets/DeleteObject
  #521 = Utf8               ext/mods/gameserver/network/serverpackets/DeleteObject
  #522 = Class              #523          // ext/mods/gameserver/model/WorldObject
  #523 = Utf8               ext/mods/gameserver/model/WorldObject
  #524 = Methodref          #520.#525     // ext/mods/gameserver/network/serverpackets/DeleteObject."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #525 = NameAndType        #5:#526       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #526 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #527 = Fieldref           #528.#529     // ext/mods/gameserver/data/manager/DerbyTrackManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/DerbyTrackManager;
  #528 = Class              #530          // ext/mods/gameserver/data/manager/DerbyTrackManager$SingletonHolder
  #529 = NameAndType        #531:#532     // INSTANCE:Lext/mods/gameserver/data/manager/DerbyTrackManager;
  #530 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager$SingletonHolder
  #531 = Utf8               INSTANCE
  #532 = Utf8               Lext/mods/gameserver/data/manager/DerbyTrackManager;
  #533 = Methodref          #76.#155      // java/lang/Class.getName:()Ljava/lang/String;
  #534 = Methodref          #123.#535     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #535 = NameAndType        #5:#536       // "<init>":(Ljava/lang/String;)V
  #536 = Utf8               (Ljava/lang/String;)V
  #537 = Class              #538          // ext/mods/gameserver/network/serverpackets/PlaySound
  #538 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #539 = String             #540          // S_Race
  #540 = Utf8               S_Race
  #541 = Methodref          #537.#542     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
  #542 = NameAndType        #5:#543       // "<init>":(ILjava/lang/String;)V
  #543 = Utf8               (ILjava/lang/String;)V
  #544 = String             #545          // ItemSound2.race_start
  #545 = Utf8               ItemSound2.race_start
  #546 = Methodref          #537.#535     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #547 = Class              #548          // "[I"
  #548 = Utf8               [I
  #549 = Utf8               SAVE_HISTORY
  #550 = Utf8               Ljava/lang/String;
  #551 = Utf8               ConstantValue
  #552 = Utf8               LOAD_HISTORY
  #553 = Utf8               LOAD_BETS
  #554 = Utf8               SAVE_BETS
  #555 = Utf8               CLEAR_BETS
  #556 = Utf8               Signature
  #557 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;
  #558 = Utf8               Ljava/util/TreeMap<Ljava/lang/Integer;Lext/mods/gameserver/model/HistoryInfo;>;
  #559 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #560 = Utf8               Ljava/util/List<Ljava/lang/Double;>;
  #561 = Utf8               Code
  #562 = Utf8               LineNumberTable
  #563 = Utf8               LocalVariableTable
  #564 = Utf8               template
  #565 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #566 = Utf8               constructor
  #567 = Utf8               Ljava/lang/reflect/Constructor;
  #568 = Utf8               i
  #569 = Utf8               e
  #570 = Utf8               Ljava/lang/Exception;
  #571 = Utf8               this
  #572 = Utf8               LocalVariableTypeTable
  #573 = Utf8               Ljava/lang/reflect/Constructor<*>;
  #574 = Utf8               StackMapTable
  #575 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;
  #576 = Utf8               getRunnerName
  #577 = Utf8               (I)Ljava/lang/String;
  #578 = Utf8               index
  #579 = Utf8               npc
  #580 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #581 = Class              #582          // java/lang/String
  #582 = Utf8               java/lang/String
  #583 = Utf8               getRacePacket
  #584 = Utf8               ()Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
  #585 = Utf8               getCurrentRaceState
  #586 = Utf8               ()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
  #587 = Utf8               getRaceNumber
  #588 = Utf8               getLastHistoryEntries
  #589 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/HistoryInfo;>;
  #590 = Utf8               raceNumber
  #591 = Utf8               getOdds
  #592 = Utf8               ()Ljava/util/List<Ljava/lang/Double;>;
  #593 = Utf8               j
  #594 = Utf8               total
  #595 = Utf8               winnerDistance
  #596 = Utf8               secondDistance
  #597 = Utf8               savedRaceNumber
  #598 = Utf8               rs
  #599 = Utf8               Ljava/sql/ResultSet;
  #600 = Utf8               ps
  #601 = Utf8               Ljava/sql/PreparedStatement;
  #602 = Utf8               con
  #603 = Utf8               Ljava/sql/Connection;
  #604 = Utf8               key
  #605 = Utf8               lane
  #606 = Utf8               amount
  #607 = Utf8               J
  #608 = Utf8               saveOnDb
  #609 = Utf8               Z
  #610 = Utf8               sum
  #611 = Utf8               sortedLanes
  #612 = Utf8               sumOfAllLanes
  #613 = Utf8               countdown
  #614 = Utf8               minutes
  #615 = Utf8               seconds
  #616 = Utf8               Lext/mods/gameserver/model/HistoryInfo;
  #617 = Utf8               ()Lext/mods/gameserver/data/manager/DerbyTrackManager;
  #618 = Utf8               <clinit>
  #619 = Utf8               SourceFile
  #620 = Utf8               DerbyTrackManager.java
  #621 = Utf8               NestMembers
  #622 = Utf8               BootstrapMethods
  #623 = String             #624          // ext.mods.gameserver.model.actor.instance.\u0001
  #624 = Utf8               ext.mods.gameserver.model.actor.instance.\u0001
  #625 = MethodType         #6            //  ()V
  #626 = MethodHandle       5:#627        // REF_invokeVirtual ext/mods/gameserver/data/manager/DerbyTrackManager.countdown:()V
  #627 = Methodref          #11.#628      // ext/mods/gameserver/data/manager/DerbyTrackManager.countdown:()V
  #628 = NameAndType        #613:#6       // countdown:()V
  #629 = MethodHandle       6:#630        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #630 = Methodref          #631.#632     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #631 = Class              #633          // java/lang/invoke/StringConcatFactory
  #632 = NameAndType        #73:#634      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #633 = Utf8               java/lang/invoke/StringConcatFactory
  #634 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #635 = MethodHandle       6:#636        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #636 = Methodref          #637.#638     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #637 = Class              #639          // java/lang/invoke/LambdaMetafactory
  #638 = NameAndType        #640:#641     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #639 = Utf8               java/lang/invoke/LambdaMetafactory
  #640 = Utf8               metafactory
  #641 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #642 = Utf8               InnerClasses
  #643 = Utf8               RaceState
  #644 = Utf8               SingletonHolder
  #645 = Class              #646          // java/lang/invoke/MethodHandles$Lookup
  #646 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #647 = Class              #648          // java/lang/invoke/MethodHandles
  #648 = Utf8               java/lang/invoke/MethodHandles
  #649 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.DerbyTrackManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _runners:Ljava/util/List;
        15: aload_0
        16: new           #16                 // class java/util/TreeMap
        19: dup
        20: invokespecial #18                 // Method java/util/TreeMap."<init>":()V
        23: putfield      #19                 // Field _history:Ljava/util/TreeMap;
        26: aload_0
        27: new           #23                 // class java/util/concurrent/ConcurrentHashMap
        30: dup
        31: invokespecial #25                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        34: putfield      #26                 // Field _betsPerLane:Ljava/util/Map;
        37: aload_0
        38: new           #7                  // class java/util/ArrayList
        41: dup
        42: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        45: putfield      #30                 // Field _odds:Ljava/util/List;
        48: aload_0
        49: iconst_1
        50: putfield      #33                 // Field _raceNumber:I
        53: aload_0
        54: iconst_0
        55: putfield      #37                 // Field _finalCountdown:I
        58: aload_0
        59: getstatic     #40                 // Field ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState.RACE_END:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        62: putfield      #46                 // Field _state:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
        65: aload_0
        66: invokevirtual #49                 // Method loadHistory:()V
        69: aload_0
        70: invokevirtual #52                 // Method loadBets:()V
        73: sipush        31003
        76: istore_1
        77: iload_1
        78: sipush        31027
        81: if_icmpge     160
        84: invokestatic  #55                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
        87: iload_1
        88: invokevirtual #61                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
        91: astore_2
        92: aload_2
        93: ifnonnull     99
        96: goto          154
        99: aload_2
       100: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
       103: invokedynamic #71,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       108: invokestatic  #75                 // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
       111: invokevirtual #81                 // Method java/lang/Class.getConstructors:()[Ljava/lang/reflect/Constructor;
       114: iconst_0
       115: aaload
       116: astore_3
       117: aload_0
       118: getfield      #10                 // Field _runners:Ljava/util/List;
       121: aload_3
       122: iconst_2
       123: anewarray     #2                  // class java/lang/Object
       126: dup
       127: iconst_0
       128: invokestatic  #85                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
       131: invokevirtual #90                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
       134: invokestatic  #94                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       137: aastore
       138: dup
       139: iconst_1
       140: aload_2
       141: aastore
       142: invokevirtual #100                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
       145: checkcast     #106                // class ext/mods/gameserver/model/actor/Npc
       148: invokeinterface #108,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       153: pop
       154: iinc          1, 1
       157: goto          77
       160: goto          173
       163: astore_1
       164: getstatic     #116                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       167: ldc           #120                // String Couldn\'t initialize runners.
       169: aload_1
       170: invokevirtual #122                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       173: aload_0
       174: bipush        8
       176: bipush        20
       178: multianewarray #128,  2           // class "[[I"
       182: putfield      #130                // Field _speeds:[[I
       185: aload_0
       186: invokedynamic #133,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/data/manager/DerbyTrackManager;)Ljava/lang/Runnable;
       191: lconst_0
       192: ldc2_w        #137                // long 1000l
       195: invokestatic  #139                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       198: pop
       199: return
      Exception table:
         from    to  target type
            73   160   163   Class java/lang/Exception
      LineNumberTable:
        line 102: 0
        line 85: 4
        line 86: 15
        line 87: 26
        line 88: 37
        line 90: 48
        line 91: 53
        line 92: 58
        line 103: 65
        line 105: 69
        line 109: 73
        line 111: 84
        line 112: 92
        line 113: 96
        line 115: 99
        line 117: 117
        line 109: 154
        line 123: 160
        line 120: 163
        line 122: 164
        line 125: 173
        line 127: 185
        line 128: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           92      62     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
          117      37     3 constructor   Ljava/lang/reflect/Constructor;
           77      83     1     i   I
          164       9     1     e   Ljava/lang/Exception;
            0     200     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          117      37     3 constructor   Ljava/lang/reflect/Constructor<*>;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 77
          locals = [ class ext/mods/gameserver/data/manager/DerbyTrackManager, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 250 /* chop */
          offset_delta = 54
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public java.util.List<ext.mods.gameserver.model.actor.Npc> getRunners();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #145                // Field _chosenRunners:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
    Signature: #575                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;

  public java.lang.String getRunnerName(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #145                // Field _chosenRunners:Ljava/util/List;
         4: iload_1
         5: invokeinterface #148,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        10: checkcast     #106                // class ext/mods/gameserver/model/actor/Npc
        13: astore_2
        14: aload_2
        15: ifnonnull     23
        18: ldc           #152                // String
        20: goto          27
        23: aload_2
        24: invokevirtual #154                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
        27: areturn
      LineNumberTable:
        line 141: 0
        line 142: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
            0      28     1 index   I
           14      14     2   npc   Lext/mods/gameserver/model/actor/Npc;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public int[][] getSpeeds();
    descriptor: ()[[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #130                // Field _speeds:[[I
         4: areturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;

  public int getFirst();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #157                // Field _firstIndex:I
         4: ireturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;

  public int getSecond();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #160                // Field _secondIndex:I
         4: ireturn
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;

  public ext.mods.gameserver.network.serverpackets.MonRaceInfo getRacePacket();
    descriptor: ()Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #163                // Field _packet:Lext/mods/gameserver/network/serverpackets/MonRaceInfo;
         4: areturn
      LineNumberTable:
        line 162: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;

  public ext.mods.gameserver.data.manager.DerbyTrackManager$RaceState getCurrentRaceState();
    descriptor: ()Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _state:Lext/mods/gameserver/data/manager/DerbyTrackManager$RaceState;
         4: areturn
      LineNumberTable:
        line 167: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;

  public int getRaceNumber();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #33                 // Field _raceNumber:I
         4: ireturn
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;

  public java.util.List<ext.mods.gameserver.model.HistoryInfo> getLastHistoryEntries();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _history:Ljava/util/TreeMap;
         4: invokevirtual #167                // Method java/util/TreeMap.descendingMap:()Ljava/util/NavigableMap;
         7: invokeinterface #171,  1          // InterfaceMethod java/util/NavigableMap.values:()Ljava/util/Collection;
        12: invokeinterface #177,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        17: ldc2_w        #183                // long 8l
        20: invokeinterface #185,  3          // InterfaceMethod java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
        25: invokeinterface #191,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        30: areturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
    Signature: #589                         // ()Ljava/util/List<Lext/mods/gameserver/model/HistoryInfo;>;

  public ext.mods.gameserver.model.HistoryInfo getHistoryInfo(int);
    descriptor: (I)Lext/mods/gameserver/model/HistoryInfo;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field _history:Ljava/util/TreeMap;
         4: iload_1
         5: invokestatic  #94                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokevirtual #195                // Method java/util/TreeMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        11: checkcast     #198                // class ext/mods/gameserver/model/HistoryInfo
        14: areturn
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
            0      15     1 raceNumber   I

  public java.util.List<java.lang.Double> getOdds();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _odds:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 187: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
    Signature: #592                         // ()Ljava/util/List<Ljava/lang/Double;>;

  public void setBetOnLane(int, long, boolean);
    descriptor: (IJZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=4
         0: aload_0
         1: getfield      #26                 // Field _betsPerLane:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #94                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: lconst_0
         9: invokestatic  #325                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        12: invokeinterface #338,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #326                // class java/lang/Long
        20: invokevirtual #341                // Method java/lang/Long.longValue:()J
        23: lload_2
        24: ladd
        25: lstore        5
        27: aload_0
        28: getfield      #26                 // Field _betsPerLane:Ljava/util/Map;
        31: iload_1
        32: invokestatic  #94                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        35: lload         5
        37: invokestatic  #325                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        40: invokeinterface #330,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        45: pop
        46: iload         4
        48: ifeq          199
        51: invokestatic  #222                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        54: astore        7
        56: aload         7
        58: ldc_w         #345                // String REPLACE INTO mdt_bets (lane_id, bet) VALUES (?,?)
        61: invokeinterface #230,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        66: astore        8
        68: aload         8
        70: iconst_1
        71: iload_1
        72: invokeinterface #347,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        77: aload         8
        79: iconst_2
        80: lload         5
        82: invokeinterface #351,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        87: aload         8
        89: invokeinterface #333,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        94: pop
        95: aload         8
        97: ifnull        139
       100: aload         8
       102: invokeinterface #273,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       107: goto          139
       110: astore        9
       112: aload         8
       114: ifnull        136
       117: aload         8
       119: invokeinterface #273,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       124: goto          136
       127: astore        10
       129: aload         9
       131: aload         10
       133: invokevirtual #269                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       136: aload         9
       138: athrow
       139: aload         7
       141: ifnull        183
       144: aload         7
       146: invokeinterface #274,  1          // InterfaceMethod java/sql/Connection.close:()V
       151: goto          183
       154: astore        8
       156: aload         7
       158: ifnull        180
       161: aload         7
       163: invokeinterface #274,  1          // InterfaceMethod java/sql/Connection.close:()V
       168: goto          180
       171: astore        9
       173: aload         8
       175: aload         9
       177: invokevirtual #269                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       180: aload         8
       182: athrow
       183: goto          199
       186: astore        7
       188: getstatic     #116                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       191: ldc_w         #355                // String Can\'t save Derby Track bet.
       194: aload         7
       196: invokevirtual #122                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       199: return
      Exception table:
         from    to  target type
            68    95   110   Class java/lang/Throwable
           117   124   127   Class java/lang/Throwable
            56   139   154   Class java/lang/Throwable
           161   168   171   Class java/lang/Throwable
            51   183   186   Class java/lang/Exception
      LineNumberTable:
        line 312: 0
        line 314: 27
        line 316: 46
        line 318: 51
        line 319: 56
        line 321: 68
        line 322: 77
        line 323: 87
        line 324: 95
        line 318: 110
        line 324: 139
        line 318: 154
        line 328: 183
        line 325: 186
        line 327: 188
        line 330: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      71     8    ps   Ljava/sql/PreparedStatement;
           56     127     7   con   Ljava/sql/Connection;
          188      11     7     e   Ljava/lang/Exception;
            0     200     0  this   Lext/mods/gameserver/data/manager/DerbyTrackManager;
            0     200     1  lane   I
            0     200     2 amount   J
            0     200     4 saveOnDb   Z
           27     173     5   sum   J
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 110
          locals = [ class ext/mods/gameserver/data/manager/DerbyTrackManager, int, long, int, long, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/DerbyTrackManager, int, long, int, long, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/DerbyTrackManager, int, long, int, long, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */

  public static ext.mods.gameserver.data.manager.DerbyTrackManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/DerbyTrackManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #527                // Field ext/mods/gameserver/data/manager/DerbyTrackManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/DerbyTrackManager;
         3: areturn
      LineNumberTable:
        line 461: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: new           #123                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/DerbyTrackManager
         6: invokevirtual #533                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #534                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #116                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #537                // class ext/mods/gameserver/network/serverpackets/PlaySound
        18: dup
        19: iconst_1
        20: ldc_w         #539                // String S_Race
        23: invokespecial #541                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(ILjava/lang/String;)V
        26: putstatic     #463                // Field SOUND_1:Lext/mods/gameserver/network/serverpackets/PlaySound;
        29: new           #537                // class ext/mods/gameserver/network/serverpackets/PlaySound
        32: dup
        33: ldc_w         #544                // String ItemSound2.race_start
        36: invokespecial #546                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
        39: putstatic     #467                // Field SOUND_2:Lext/mods/gameserver/network/serverpackets/PlaySound;
        42: iconst_3
        43: anewarray     #547                // class "[I"
        46: dup
        47: iconst_0
        48: iconst_2
        49: newarray       int
        51: dup
        52: iconst_0
        53: iconst_m1
        54: iastore
        55: dup
        56: iconst_1
        57: iconst_0
        58: iastore
        59: aastore
        60: dup
        61: iconst_1
        62: iconst_2
        63: newarray       int
        65: dup
        66: iconst_0
        67: iconst_0
        68: iastore
        69: dup
        70: iconst_1
        71: sipush        15322
        74: iastore
        75: aastore
        76: dup
        77: iconst_2
        78: iconst_2
        79: newarray       int
        81: dup
        82: iconst_0
        83: sipush        13765
        86: iastore
        87: dup
        88: iconst_1
        89: iconst_m1
        90: iastore
        91: aastore
        92: putstatic     #391                // Field CODES:[[I
        95: return
      LineNumberTable:
        line 50: 0
        line 66: 15
        line 67: 29
        line 69: 42
}
SourceFile: "DerbyTrackManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/DerbyTrackManager$SingletonHolder
  ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState
BootstrapMethods:
  0: #629 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #623 ext.mods.gameserver.model.actor.instance.\u0001
  1: #635 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #625 ()V
      #626 REF_invokeVirtual ext/mods/gameserver/data/manager/DerbyTrackManager.countdown:()V
      #625 ()V
InnerClasses:
  public static final #643= #41 of #11;   // RaceState=class ext/mods/gameserver/data/manager/DerbyTrackManager$RaceState of class ext/mods/gameserver/data/manager/DerbyTrackManager
  public static final #649= #645 of #647; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
