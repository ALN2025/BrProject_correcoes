// Bytecode for: ext.mods.gameserver.data.manager.RaidPointManager
// File: ext\mods\gameserver\data\manager\RaidPointManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/RaidPointManager.class
  Last modified 9 de jul de 2026; size 8899 bytes
  MD5 checksum 55fcce3d1dcf3b3498f9c30f17056e4a
  Compiled from "RaidPointManager.java"
public class ext.mods.gameserver.data.manager.RaidPointManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/RaidPointManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 5, methods: 13, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/RaidPointManager._entries:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/RaidPointManager
   #12 = NameAndType        #14:#15       // _entries:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager
   #14 = Utf8               _entries
   #15 = Utf8               Ljava/util/Map;
   #16 = Methodref          #17.#18       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #17 = Class              #19           // ext/mods/commons/pool/ConnectionPool
   #18 = NameAndType        #20:#21       // getConnection:()Ljava/sql/Connection;
   #19 = Utf8               ext/mods/commons/pool/ConnectionPool
   #20 = Utf8               getConnection
   #21 = Utf8               ()Ljava/sql/Connection;
   #22 = String             #23           // SELECT * FROM character_raid_points
   #23 = Utf8               SELECT * FROM character_raid_points
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
   #42 = String             #43           // char_id
   #43 = Utf8               char_id
   #44 = InterfaceMethodref #37.#45       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #45 = NameAndType        #46:#47       // getInt:(Ljava/lang/String;)I
   #46 = Utf8               getInt
   #47 = Utf8               (Ljava/lang/String;)I
   #48 = String             #49           // boss_id
   #49 = Utf8               boss_id
   #50 = String             #51           // points
   #51 = Utf8               points
   #52 = Methodref          #53.#54       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #53 = Class              #55           // java/lang/Integer
   #54 = NameAndType        #56:#57       // valueOf:(I)Ljava/lang/Integer;
   #55 = Utf8               java/lang/Integer
   #56 = Utf8               valueOf
   #57 = Utf8               (I)Ljava/lang/Integer;
   #58 = InvokeDynamic      #0:#59        // #0:apply:()Ljava/util/function/Function;
   #59 = NameAndType        #60:#61       // apply:()Ljava/util/function/Function;
   #60 = Utf8               apply
   #61 = Utf8               ()Ljava/util/function/Function;
   #62 = InterfaceMethodref #63.#64       // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #63 = Class              #65           // java/util/Map
   #64 = NameAndType        #66:#67       // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #65 = Utf8               java/util/Map
   #66 = Utf8               computeIfAbsent
   #67 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #68 = InterfaceMethodref #63.#69       // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #69 = NameAndType        #70:#71       // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #70 = Utf8               put
   #71 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #72 = InterfaceMethodref #37.#73       // java/sql/ResultSet.close:()V
   #73 = NameAndType        #74:#6        // close:()V
   #74 = Utf8               close
   #75 = Class              #76           // java/lang/Throwable
   #76 = Utf8               java/lang/Throwable
   #77 = Methodref          #75.#78       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #78 = NameAndType        #79:#80       // addSuppressed:(Ljava/lang/Throwable;)V
   #79 = Utf8               addSuppressed
   #80 = Utf8               (Ljava/lang/Throwable;)V
   #81 = InterfaceMethodref #31.#73       // java/sql/PreparedStatement.close:()V
   #82 = InterfaceMethodref #25.#73       // java/sql/Connection.close:()V
   #83 = Class              #84           // java/lang/Exception
   #84 = Utf8               java/lang/Exception
   #85 = Fieldref           #11.#86       // ext/mods/gameserver/data/manager/RaidPointManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #86 = NameAndType        #87:#88       // LOGGER:Lext/mods/commons/logging/CLogger;
   #87 = Utf8               LOGGER
   #88 = Utf8               Lext/mods/commons/logging/CLogger;
   #89 = String             #90           // Couldn\'t load RaidPoints entries.
   #90 = Utf8               Couldn\'t load RaidPoints entries.
   #91 = Methodref          #92.#93       // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #92 = Class              #94           // ext/mods/commons/logging/CLogger
   #93 = NameAndType        #95:#96       // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #94 = Utf8               ext/mods/commons/logging/CLogger
   #95 = Utf8               error
   #96 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #97 = String             #98           // Loaded {} RaidPoints entries.
   #98 = Utf8               Loaded {} RaidPoints entries.
   #99 = InterfaceMethodref #63.#100      // java/util/Map.size:()I
  #100 = NameAndType        #101:#102     // size:()I
  #101 = Utf8               size
  #102 = Utf8               ()I
  #103 = Methodref          #92.#104      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #104 = NameAndType        #105:#106     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #105 = Utf8               info
  #106 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #107 = Methodref          #108.#109     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #108 = Class              #110          // ext/mods/gameserver/model/actor/Player
  #109 = NameAndType        #111:#102     // getObjectId:()I
  #110 = Utf8               ext/mods/gameserver/model/actor/Player
  #111 = Utf8               getObjectId
  #112 = InterfaceMethodref #63.#113      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #113 = NameAndType        #114:#115     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #114 = Utf8               get
  #115 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #116 = InvokeDynamic      #1:#59        // #1:apply:()Ljava/util/function/Function;
  #117 = InvokeDynamic      #2:#118       // #2:apply:()Ljava/util/function/BiFunction;
  #118 = NameAndType        #60:#119      // apply:()Ljava/util/function/BiFunction;
  #119 = Utf8               ()Ljava/util/function/BiFunction;
  #120 = InterfaceMethodref #63.#121      // java/util/Map.merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #121 = NameAndType        #122:#123     // merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #122 = Utf8               merge
  #123 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #124 = Methodref          #53.#125      // java/lang/Integer.intValue:()I
  #125 = NameAndType        #126:#102     // intValue:()I
  #126 = Utf8               intValue
  #127 = String             #128          // REPLACE INTO character_raid_points (char_id,boss_id,points) VALUES (?,?,?)
  #128 = Utf8               REPLACE INTO character_raid_points (char_id,boss_id,points) VALUES (?,?,?)
  #129 = InterfaceMethodref #31.#130      // java/sql/PreparedStatement.setInt:(II)V
  #130 = NameAndType        #131:#132     // setInt:(II)V
  #131 = Utf8               setInt
  #132 = Utf8               (II)V
  #133 = InterfaceMethodref #31.#134      // java/sql/PreparedStatement.executeUpdate:()I
  #134 = NameAndType        #135:#102     // executeUpdate:()I
  #135 = Utf8               executeUpdate
  #136 = String             #137          // Couldn\'t update RaidPoints entries.
  #137 = Utf8               Couldn\'t update RaidPoints entries.
  #138 = InterfaceMethodref #63.#139      // java/util/Map.isEmpty:()Z
  #139 = NameAndType        #140:#41      // isEmpty:()Z
  #140 = Utf8               isEmpty
  #141 = InterfaceMethodref #63.#142      // java/util/Map.values:()Ljava/util/Collection;
  #142 = NameAndType        #143:#144     // values:()Ljava/util/Collection;
  #143 = Utf8               values
  #144 = Utf8               ()Ljava/util/Collection;
  #145 = InterfaceMethodref #146.#147     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #146 = Class              #148          // java/util/Collection
  #147 = NameAndType        #149:#150     // stream:()Ljava/util/stream/Stream;
  #148 = Utf8               java/util/Collection
  #149 = Utf8               stream
  #150 = Utf8               ()Ljava/util/stream/Stream;
  #151 = InvokeDynamic      #3:#152       // #3:applyAsInt:()Ljava/util/function/ToIntFunction;
  #152 = NameAndType        #153:#154     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #153 = Utf8               applyAsInt
  #154 = Utf8               ()Ljava/util/function/ToIntFunction;
  #155 = InterfaceMethodref #156.#157     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #156 = Class              #158          // java/util/stream/Stream
  #157 = NameAndType        #159:#160     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #158 = Utf8               java/util/stream/Stream
  #159 = Utf8               mapToInt
  #160 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #161 = InterfaceMethodref #162.#163     // java/util/stream/IntStream.sum:()I
  #162 = Class              #164          // java/util/stream/IntStream
  #163 = NameAndType        #165:#102     // sum:()I
  #164 = Utf8               java/util/stream/IntStream
  #165 = Utf8               sum
  #166 = InterfaceMethodref #63.#167      // java/util/Map.clear:()V
  #167 = NameAndType        #168:#6       // clear:()V
  #168 = Utf8               clear
  #169 = String             #170          // TRUNCATE character_raid_points
  #170 = Utf8               TRUNCATE character_raid_points
  #171 = String             #172          // Couldn\'t delete RaidPoints entries.
  #172 = Utf8               Couldn\'t delete RaidPoints entries.
  #173 = Class              #174          // java/util/HashMap
  #174 = Utf8               java/util/HashMap
  #175 = Methodref          #173.#3       // java/util/HashMap."<init>":()V
  #176 = InterfaceMethodref #63.#177      // java/util/Map.keySet:()Ljava/util/Set;
  #177 = NameAndType        #178:#179     // keySet:()Ljava/util/Set;
  #178 = Utf8               keySet
  #179 = Utf8               ()Ljava/util/Set;
  #180 = InterfaceMethodref #181.#182     // java/util/Set.iterator:()Ljava/util/Iterator;
  #181 = Class              #183          // java/util/Set
  #182 = NameAndType        #184:#185     // iterator:()Ljava/util/Iterator;
  #183 = Utf8               java/util/Set
  #184 = Utf8               iterator
  #185 = Utf8               ()Ljava/util/Iterator;
  #186 = InterfaceMethodref #187.#188     // java/util/Iterator.hasNext:()Z
  #187 = Class              #189          // java/util/Iterator
  #188 = NameAndType        #190:#41      // hasNext:()Z
  #189 = Utf8               java/util/Iterator
  #190 = Utf8               hasNext
  #191 = InterfaceMethodref #187.#192     // java/util/Iterator.next:()Ljava/lang/Object;
  #192 = NameAndType        #40:#193      // next:()Ljava/lang/Object;
  #193 = Utf8               ()Ljava/lang/Object;
  #194 = Methodref          #11.#195      // ext/mods/gameserver/data/manager/RaidPointManager.getPointsByOwnerId:(I)I
  #195 = NameAndType        #196:#197     // getPointsByOwnerId:(I)I
  #196 = Utf8               getPointsByOwnerId
  #197 = Utf8               (I)I
  #198 = Class              #199          // java/util/concurrent/atomic/AtomicInteger
  #199 = Utf8               java/util/concurrent/atomic/AtomicInteger
  #200 = Methodref          #198.#201     // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
  #201 = NameAndType        #5:#202       // "<init>":(I)V
  #202 = Utf8               (I)V
  #203 = Class              #204          // java/util/LinkedHashMap
  #204 = Utf8               java/util/LinkedHashMap
  #205 = Methodref          #203.#3       // java/util/LinkedHashMap."<init>":()V
  #206 = InterfaceMethodref #63.#207      // java/util/Map.entrySet:()Ljava/util/Set;
  #207 = NameAndType        #208:#179     // entrySet:()Ljava/util/Set;
  #208 = Utf8               entrySet
  #209 = InterfaceMethodref #181.#147     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #210 = InterfaceMethodref #211.#212     // java/util/Map$Entry.comparingByValue:()Ljava/util/Comparator;
  #211 = Class              #213          // java/util/Map$Entry
  #212 = NameAndType        #214:#215     // comparingByValue:()Ljava/util/Comparator;
  #213 = Utf8               java/util/Map$Entry
  #214 = Utf8               comparingByValue
  #215 = Utf8               ()Ljava/util/Comparator;
  #216 = Methodref          #217.#218     // java/util/Collections.reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #217 = Class              #219          // java/util/Collections
  #218 = NameAndType        #220:#221     // reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #219 = Utf8               java/util/Collections
  #220 = Utf8               reverseOrder
  #221 = Utf8               (Ljava/util/Comparator;)Ljava/util/Comparator;
  #222 = InterfaceMethodref #156.#223     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #223 = NameAndType        #224:#225     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #224 = Utf8               sorted
  #225 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #226 = InvokeDynamic      #4:#227       // #4:accept:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
  #227 = NameAndType        #228:#229     // accept:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
  #228 = Utf8               accept
  #229 = Utf8               (Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
  #230 = InterfaceMethodref #156.#231     // java/util/stream/Stream.forEachOrdered:(Ljava/util/function/Consumer;)V
  #231 = NameAndType        #232:#233     // forEachOrdered:(Ljava/util/function/Consumer;)V
  #232 = Utf8               forEachOrdered
  #233 = Utf8               (Ljava/util/function/Consumer;)V
  #234 = Long               100l
  #236 = InterfaceMethodref #156.#237     // java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
  #237 = NameAndType        #238:#239     // limit:(J)Ljava/util/stream/Stream;
  #238 = Utf8               limit
  #239 = Utf8               (J)Ljava/util/stream/Stream;
  #240 = InvokeDynamic      #5:#227       // #5:accept:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
  #241 = Fieldref           #242.#243     // ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/RaidPointManager;
  #242 = Class              #244          // ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder
  #243 = NameAndType        #245:#246     // INSTANCE:Lext/mods/gameserver/data/manager/RaidPointManager;
  #244 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder
  #245 = Utf8               INSTANCE
  #246 = Utf8               Lext/mods/gameserver/data/manager/RaidPointManager;
  #247 = InterfaceMethodref #211.#248     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #248 = NameAndType        #249:#193     // getKey:()Ljava/lang/Object;
  #249 = Utf8               getKey
  #250 = Methodref          #198.#251     // java/util/concurrent/atomic/AtomicInteger.getAndIncrement:()I
  #251 = NameAndType        #252:#102     // getAndIncrement:()I
  #252 = Utf8               getAndIncrement
  #253 = Methodref          #254.#255     // java/lang/Class.getName:()Ljava/lang/String;
  #254 = Class              #256          // java/lang/Class
  #255 = NameAndType        #257:#258     // getName:()Ljava/lang/String;
  #256 = Utf8               java/lang/Class
  #257 = Utf8               getName
  #258 = Utf8               ()Ljava/lang/String;
  #259 = Methodref          #92.#260      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #260 = NameAndType        #5:#261       // "<init>":(Ljava/lang/String;)V
  #261 = Utf8               (Ljava/lang/String;)V
  #262 = Utf8               LOAD_DATA
  #263 = Utf8               Ljava/lang/String;
  #264 = Utf8               ConstantValue
  #265 = Utf8               INSERT_DATA
  #266 = Utf8               TRUNCATE_DATA
  #267 = Utf8               Signature
  #268 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;>;
  #269 = Utf8               Code
  #270 = Utf8               LineNumberTable
  #271 = Utf8               LocalVariableTable
  #272 = Utf8               objectId
  #273 = Utf8               I
  #274 = Utf8               bossId
  #275 = Utf8               playerData
  #276 = Utf8               rs
  #277 = Utf8               Ljava/sql/ResultSet;
  #278 = Utf8               ps
  #279 = Utf8               Ljava/sql/PreparedStatement;
  #280 = Utf8               con
  #281 = Utf8               Ljava/sql/Connection;
  #282 = Utf8               e
  #283 = Utf8               Ljava/lang/Exception;
  #284 = Utf8               this
  #285 = Utf8               LocalVariableTypeTable
  #286 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #287 = Utf8               StackMapTable
  #288 = Utf8               getList
  #289 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
  #290 = Utf8               player
  #291 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #292 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #293 = Utf8               addPoints
  #294 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #295 = Utf8               cleanUp
  #296 = Utf8               calculateRanking
  #297 = Utf8               ownerId
  #298 = Utf8               playersData
  #299 = Utf8               counter
  #300 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
  #301 = Utf8               rankMap
  #302 = Utf8               rank
  #303 = Utf8               Ljava/lang/Integer;
  #304 = Utf8               getWinners
  #305 = Utf8               ()Ljava/util/Map;
  #306 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #307 = Utf8               getInstance
  #308 = Utf8               ()Lext/mods/gameserver/data/manager/RaidPointManager;
  #309 = Utf8               lambda$getWinners$0
  #310 = Utf8               (Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #311 = Utf8               Ljava/util/Map$Entry;
  #312 = Utf8               lambda$calculateRanking$0
  #313 = Utf8               lambda$addPoints$0
  #314 = Utf8               (Ljava/lang/Integer;)Ljava/util/Map;
  #315 = Utf8               m
  #316 = Utf8               lambda$new$0
  #317 = Utf8               <clinit>
  #318 = Utf8               SourceFile
  #319 = Utf8               RaidPointManager.java
  #320 = Utf8               NestMembers
  #321 = Utf8               BootstrapMethods
  #322 = MethodType         #115          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #323 = MethodHandle       6:#324        // REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #324 = Methodref          #11.#325      // ext/mods/gameserver/data/manager/RaidPointManager.lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #325 = NameAndType        #316:#314     // lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #326 = MethodType         #314          //  (Ljava/lang/Integer;)Ljava/util/Map;
  #327 = MethodHandle       6:#328        // REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$addPoints$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #328 = Methodref          #11.#329      // ext/mods/gameserver/data/manager/RaidPointManager.lambda$addPoints$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #329 = NameAndType        #313:#314     // lambda$addPoints$0:(Ljava/lang/Integer;)Ljava/util/Map;
  #330 = MethodType         #71           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #331 = MethodHandle       6:#332        // REF_invokeStatic java/lang/Integer.sum:(II)I
  #332 = Methodref          #53.#333      // java/lang/Integer.sum:(II)I
  #333 = NameAndType        #165:#334     // sum:(II)I
  #334 = Utf8               (II)I
  #335 = MethodType         #336          //  (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  #336 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  #337 = MethodType         #338          //  (Ljava/lang/Object;)I
  #338 = Utf8               (Ljava/lang/Object;)I
  #339 = MethodHandle       5:#340        // REF_invokeVirtual java/lang/Number.intValue:()I
  #340 = Methodref          #341.#125     // java/lang/Number.intValue:()I
  #341 = Class              #342          // java/lang/Number
  #342 = Utf8               java/lang/Number
  #343 = MethodType         #344          //  (Ljava/lang/Integer;)I
  #344 = Utf8               (Ljava/lang/Integer;)I
  #345 = MethodType         #346          //  (Ljava/lang/Object;)V
  #346 = Utf8               (Ljava/lang/Object;)V
  #347 = MethodHandle       6:#348        // REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$calculateRanking$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #348 = Methodref          #11.#349      // ext/mods/gameserver/data/manager/RaidPointManager.lambda$calculateRanking$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #349 = NameAndType        #312:#310     // lambda$calculateRanking$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #350 = MethodType         #351          //  (Ljava/util/Map$Entry;)V
  #351 = Utf8               (Ljava/util/Map$Entry;)V
  #352 = MethodHandle       6:#353        // REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$getWinners$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #353 = Methodref          #11.#354      // ext/mods/gameserver/data/manager/RaidPointManager.lambda$getWinners$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #354 = NameAndType        #309:#310     // lambda$getWinners$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
  #355 = MethodHandle       6:#356        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #356 = Methodref          #357.#358     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #357 = Class              #359          // java/lang/invoke/LambdaMetafactory
  #358 = NameAndType        #360:#361     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #359 = Utf8               java/lang/invoke/LambdaMetafactory
  #360 = Utf8               metafactory
  #361 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #362 = Utf8               InnerClasses
  #363 = Utf8               Entry
  #364 = Utf8               SingletonHolder
  #365 = Class              #366          // java/lang/invoke/MethodHandles$Lookup
  #366 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #367 = Class              #368          // java/lang/invoke/MethodHandles
  #368 = Utf8               java/lang/invoke/MethodHandles
  #369 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.RaidPointManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _entries:Ljava/util/Map;
        15: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        18: astore_1
        19: aload_1
        20: ldc           #22                 // String SELECT * FROM character_raid_points
        22: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        27: astore_2
        28: aload_2
        29: invokeinterface #30,  1           // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        34: astore_3
        35: aload_3
        36: invokeinterface #36,  1           // InterfaceMethod java/sql/ResultSet.next:()Z
        41: ifeq          119
        44: aload_3
        45: ldc           #42                 // String char_id
        47: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        52: istore        4
        54: aload_3
        55: ldc           #48                 // String boss_id
        57: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        62: istore        5
        64: aload_3
        65: ldc           #50                 // String points
        67: invokeinterface #44,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        72: istore        6
        74: aload_0
        75: getfield      #10                 // Field _entries:Ljava/util/Map;
        78: iload         4
        80: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        83: invokedynamic #58,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        88: invokeinterface #62,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        93: checkcast     #63                 // class java/util/Map
        96: astore        7
        98: aload         7
       100: iload         5
       102: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       105: iload         6
       107: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       110: invokeinterface #68,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       115: pop
       116: goto          35
       119: aload_3
       120: ifnull        159
       123: aload_3
       124: invokeinterface #72,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       129: goto          159
       132: astore        4
       134: aload_3
       135: ifnull        156
       138: aload_3
       139: invokeinterface #72,  1           // InterfaceMethod java/sql/ResultSet.close:()V
       144: goto          156
       147: astore        5
       149: aload         4
       151: aload         5
       153: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       156: aload         4
       158: athrow
       159: aload_2
       160: ifnull        196
       163: aload_2
       164: invokeinterface #81,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       169: goto          196
       172: astore_3
       173: aload_2
       174: ifnull        194
       177: aload_2
       178: invokeinterface #81,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       183: goto          194
       186: astore        4
       188: aload_3
       189: aload         4
       191: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       194: aload_3
       195: athrow
       196: aload_1
       197: ifnull        231
       200: aload_1
       201: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
       206: goto          231
       209: astore_2
       210: aload_1
       211: ifnull        229
       214: aload_1
       215: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
       220: goto          229
       223: astore_3
       224: aload_2
       225: aload_3
       226: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       229: aload_2
       230: athrow
       231: goto          244
       234: astore_1
       235: getstatic     #85                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       238: ldc           #89                 // String Couldn\'t load RaidPoints entries.
       240: aload_1
       241: invokevirtual #91                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       244: getstatic     #85                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       247: ldc           #97                 // String Loaded {} RaidPoints entries.
       249: iconst_1
       250: anewarray     #2                  // class java/lang/Object
       253: dup
       254: iconst_0
       255: aload_0
       256: getfield      #10                 // Field _entries:Ljava/util/Map;
       259: invokeinterface #99,  1           // InterfaceMethod java/util/Map.size:()I
       264: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       267: aastore
       268: invokevirtual #103                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       271: return
      Exception table:
         from    to  target type
            35   119   132   Class java/lang/Throwable
           138   144   147   Class java/lang/Throwable
            28   159   172   Class java/lang/Throwable
           177   183   186   Class java/lang/Throwable
            19   196   209   Class java/lang/Throwable
           214   220   223   Class java/lang/Throwable
            15   231   234   Class java/lang/Exception
      LineNumberTable:
        line 51: 0
        line 48: 4
        line 52: 15
        line 53: 19
        line 54: 28
        line 56: 35
        line 58: 44
        line 59: 54
        line 60: 64
        line 62: 74
        line 63: 98
        line 64: 116
        line 65: 119
        line 52: 132
        line 65: 159
        line 52: 172
        line 65: 196
        line 52: 209
        line 69: 231
        line 66: 234
        line 68: 235
        line 70: 244
        line 71: 271
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      62     4 objectId   I
           64      52     5 bossId   I
           74      42     6 points   I
           98      18     7 playerData   Ljava/util/Map;
           35     124     3    rs   Ljava/sql/ResultSet;
           28     168     2    ps   Ljava/sql/PreparedStatement;
           19     212     1   con   Ljava/sql/Connection;
          235       9     1     e   Ljava/lang/Exception;
            0     272     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           98      18     7 playerData   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 83
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public final java.util.Map<java.lang.Integer, java.lang.Integer> getList(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: aload_1
         5: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         8: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: invokeinterface #112,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        16: checkcast     #63                 // class java/util/Map
        19: areturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
            0      20     1 player   Lext/mods/gameserver/model/actor/Player;
    Signature: #292                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public final void addPoints(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=10, args_size=4
         0: iload_3
         1: ifge          5
         4: return
         5: aload_1
         6: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         9: istore        4
        11: aload_0
        12: getfield      #10                 // Field _entries:Ljava/util/Map;
        15: iload         4
        17: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: invokedynamic #116,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        25: invokeinterface #62,  3           // InterfaceMethod java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        30: checkcast     #63                 // class java/util/Map
        33: astore        5
        35: aload         5
        37: iload_2
        38: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        41: iload_3
        42: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        45: invokedynamic #117,  0            // InvokeDynamic #2:apply:()Ljava/util/function/BiFunction;
        50: invokeinterface #120,  4          // InterfaceMethod java/util/Map.merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
        55: checkcast     #53                 // class java/lang/Integer
        58: invokevirtual #124                // Method java/lang/Integer.intValue:()I
        61: istore_3
        62: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        65: astore        6
        67: aload         6
        69: ldc           #127                // String REPLACE INTO character_raid_points (char_id,boss_id,points) VALUES (?,?,?)
        71: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        76: astore        7
        78: aload         7
        80: iconst_1
        81: iload         4
        83: invokeinterface #129,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        88: aload         7
        90: iconst_2
        91: iload_2
        92: invokeinterface #129,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        97: aload         7
        99: iconst_3
       100: iload_3
       101: invokeinterface #129,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       106: aload         7
       108: invokeinterface #133,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
       113: pop
       114: aload         7
       116: ifnull        158
       119: aload         7
       121: invokeinterface #81,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       126: goto          158
       129: astore        8
       131: aload         7
       133: ifnull        155
       136: aload         7
       138: invokeinterface #81,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
       143: goto          155
       146: astore        9
       148: aload         8
       150: aload         9
       152: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       155: aload         8
       157: athrow
       158: aload         6
       160: ifnull        202
       163: aload         6
       165: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
       170: goto          202
       173: astore        7
       175: aload         6
       177: ifnull        199
       180: aload         6
       182: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
       187: goto          199
       190: astore        8
       192: aload         7
       194: aload         8
       196: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       199: aload         7
       201: athrow
       202: goto          217
       205: astore        6
       207: getstatic     #85                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       210: ldc           #136                // String Couldn\'t update RaidPoints entries.
       212: aload         6
       214: invokevirtual #91                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       217: return
      Exception table:
         from    to  target type
            78   114   129   Class java/lang/Throwable
           136   143   146   Class java/lang/Throwable
            67   158   173   Class java/lang/Throwable
           180   187   190   Class java/lang/Throwable
            62   202   205   Class java/lang/Exception
      LineNumberTable:
        line 86: 0
        line 87: 4
        line 89: 5
        line 90: 11
        line 92: 35
        line 94: 62
        line 95: 67
        line 97: 78
        line 98: 88
        line 99: 97
        line 100: 106
        line 101: 114
        line 94: 129
        line 101: 158
        line 94: 173
        line 105: 202
        line 102: 205
        line 104: 207
        line 106: 217
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      80     7    ps   Ljava/sql/PreparedStatement;
           67     135     6   con   Ljava/sql/Connection;
          207      10     6     e   Ljava/lang/Exception;
            0     218     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
            0     218     1 player   Lext/mods/gameserver/model/actor/Player;
            0     218     2 bossId   I
            0     218     3 points   I
           11     207     4 objectId   I
           35     183     5 playerData   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           35     183     5 playerData   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 11
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 123
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/Map, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class ext/mods/gameserver/model/actor/Player, int, int, int, class java/util/Map, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public final int getPointsByOwnerId(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: iload_1
         5: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         8: invokeinterface #112,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        13: checkcast     #63                 // class java/util/Map
        16: astore_2
        17: aload_2
        18: ifnull        30
        21: aload_2
        22: invokeinterface #138,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        27: ifeq          32
        30: iconst_0
        31: ireturn
        32: aload_2
        33: invokeinterface #141,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        38: invokeinterface #145,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        43: invokedynamic #151,  0            // InvokeDynamic #3:applyAsInt:()Ljava/util/function/ToIntFunction;
        48: invokeinterface #155,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        53: invokeinterface #161,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        58: ireturn
      LineNumberTable:
        line 114: 0
        line 115: 17
        line 116: 30
        line 118: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
            0      59     1 objectId   I
           17      42     2 playerData   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           17      42     2 playerData   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class java/util/Map ]
        frame_type = 1 /* same */

  public final void cleanUp();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _entries:Ljava/util/Map;
         4: invokeinterface #166,  1          // InterfaceMethod java/util/Map.clear:()V
         9: invokestatic  #16                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        12: astore_1
        13: aload_1
        14: ldc           #169                // String TRUNCATE character_raid_points
        16: invokeinterface #24,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        21: astore_2
        22: aload_2
        23: invokeinterface #133,  1          // InterfaceMethod java/sql/PreparedStatement.executeUpdate:()I
        28: pop
        29: aload_2
        30: ifnull        66
        33: aload_2
        34: invokeinterface #81,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        39: goto          66
        42: astore_3
        43: aload_2
        44: ifnull        64
        47: aload_2
        48: invokeinterface #81,  1           // InterfaceMethod java/sql/PreparedStatement.close:()V
        53: goto          64
        56: astore        4
        58: aload_3
        59: aload         4
        61: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        64: aload_3
        65: athrow
        66: aload_1
        67: ifnull        101
        70: aload_1
        71: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
        76: goto          101
        79: astore_2
        80: aload_1
        81: ifnull        99
        84: aload_1
        85: invokeinterface #82,  1           // InterfaceMethod java/sql/Connection.close:()V
        90: goto          99
        93: astore_3
        94: aload_2
        95: aload_3
        96: invokevirtual #77                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        99: aload_2
       100: athrow
       101: goto          114
       104: astore_1
       105: getstatic     #85                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       108: ldc           #171                // String Couldn\'t delete RaidPoints entries.
       110: aload_1
       111: invokevirtual #91                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       114: return
      Exception table:
         from    to  target type
            22    29    42   Class java/lang/Throwable
            47    53    56   Class java/lang/Throwable
            13    66    79   Class java/lang/Throwable
            84    90    93   Class java/lang/Throwable
             9   101   104   Class java/lang/Exception
      LineNumberTable:
        line 126: 0
        line 128: 9
        line 129: 13
        line 131: 22
        line 132: 29
        line 128: 42
        line 132: 66
        line 128: 79
        line 136: 101
        line 133: 104
        line 135: 105
        line 137: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      44     2    ps   Ljava/sql/PreparedStatement;
           13      88     1   con   Ljava/sql/Connection;
          105       9     1     e   Ljava/lang/Exception;
            0     115     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/RaidPointManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public final int calculateRanking(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=6, args_size=2
         0: new           #173                // class java/util/HashMap
         3: dup
         4: invokespecial #175                // Method java/util/HashMap."<init>":()V
         7: astore_2
         8: aload_0
         9: getfield      #10                 // Field _entries:Ljava/util/Map;
        12: invokeinterface #176,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        17: invokeinterface #180,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          79
        32: aload_3
        33: invokeinterface #191,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #53                 // class java/lang/Integer
        41: invokevirtual #124                // Method java/lang/Integer.intValue:()I
        44: istore        4
        46: aload_0
        47: iload         4
        49: invokevirtual #194                // Method getPointsByOwnerId:(I)I
        52: istore        5
        54: iload         5
        56: ifle          76
        59: aload_2
        60: iload         4
        62: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        65: iload         5
        67: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        70: invokeinterface #68,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        75: pop
        76: goto          23
        79: new           #198                // class java/util/concurrent/atomic/AtomicInteger
        82: dup
        83: iconst_1
        84: invokespecial #200                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        87: astore_3
        88: new           #203                // class java/util/LinkedHashMap
        91: dup
        92: invokespecial #205                // Method java/util/LinkedHashMap."<init>":()V
        95: astore        4
        97: aload_2
        98: invokeinterface #206,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
       103: invokeinterface #209,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
       108: invokestatic  #210                // InterfaceMethod java/util/Map$Entry.comparingByValue:()Ljava/util/Comparator;
       111: invokestatic  #216                // Method java/util/Collections.reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
       114: invokeinterface #222,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
       119: aload         4
       121: aload_3
       122: invokedynamic #226,  0            // InvokeDynamic #4:accept:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
       127: invokeinterface #230,  2          // InterfaceMethod java/util/stream/Stream.forEachOrdered:(Ljava/util/function/Consumer;)V
       132: aload         4
       134: iload_1
       135: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       138: invokeinterface #112,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       143: checkcast     #53                 // class java/lang/Integer
       146: astore        5
       148: aload         5
       150: ifnonnull     157
       153: iconst_0
       154: goto          162
       157: aload         5
       159: invokevirtual #124                // Method java/lang/Integer.intValue:()I
       162: ireturn
      LineNumberTable:
        line 145: 0
        line 146: 8
        line 148: 46
        line 149: 54
        line 150: 59
        line 151: 76
        line 153: 79
        line 155: 88
        line 157: 97
        line 159: 132
        line 160: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      22     5 points   I
           46      30     4 ownerId   I
            0     163     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
            0     163     1 objectId   I
            8     155     2 playersData   Ljava/util/Map;
           88      75     3 counter   Ljava/util/concurrent/atomic/AtomicInteger;
           97      66     4 rankMap   Ljava/util/Map;
          148      15     5  rank   Ljava/lang/Integer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     155     2 playersData   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
           97      66     4 rankMap   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/Map, class java/util/Iterator ]
        frame_type = 52 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 254 /* append */
          offset_delta = 77
          locals = [ class java/util/concurrent/atomic/AtomicInteger, class java/util/Map, class java/lang/Integer ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.Map<java.lang.Integer, java.lang.Integer> getWinners();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: new           #173                // class java/util/HashMap
         3: dup
         4: invokespecial #175                // Method java/util/HashMap."<init>":()V
         7: astore_1
         8: aload_0
         9: getfield      #10                 // Field _entries:Ljava/util/Map;
        12: invokeinterface #176,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
        17: invokeinterface #180,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore_2
        23: aload_2
        24: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          76
        32: aload_2
        33: invokeinterface #191,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #53                 // class java/lang/Integer
        41: invokevirtual #124                // Method java/lang/Integer.intValue:()I
        44: istore_3
        45: aload_0
        46: iload_3
        47: invokevirtual #194                // Method getPointsByOwnerId:(I)I
        50: istore        4
        52: iload         4
        54: ifle          73
        57: aload_1
        58: iload_3
        59: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: iload         4
        64: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        67: invokeinterface #68,  3           // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        72: pop
        73: goto          23
        76: new           #198                // class java/util/concurrent/atomic/AtomicInteger
        79: dup
        80: iconst_1
        81: invokespecial #200                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
        84: astore_2
        85: new           #203                // class java/util/LinkedHashMap
        88: dup
        89: invokespecial #205                // Method java/util/LinkedHashMap."<init>":()V
        92: astore_3
        93: aload_1
        94: invokeinterface #206,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        99: invokeinterface #209,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
       104: invokestatic  #210                // InterfaceMethod java/util/Map$Entry.comparingByValue:()Ljava/util/Comparator;
       107: invokestatic  #216                // Method java/util/Collections.reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
       110: invokeinterface #222,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
       115: ldc2_w        #234                // long 100l
       118: invokeinterface #236,  3          // InterfaceMethod java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
       123: aload_3
       124: aload_2
       125: invokedynamic #240,  0            // InvokeDynamic #5:accept:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
       130: invokeinterface #230,  2          // InterfaceMethod java/util/stream/Stream.forEachOrdered:(Ljava/util/function/Consumer;)V
       135: aload_3
       136: areturn
      LineNumberTable:
        line 173: 0
        line 174: 8
        line 176: 45
        line 177: 52
        line 178: 57
        line 179: 73
        line 181: 76
        line 183: 85
        line 185: 93
        line 187: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      21     4 points   I
           45      28     3 objectId   I
            0     137     0  this   Lext/mods/gameserver/data/manager/RaidPointManager;
            8     129     1 playersData   Ljava/util/Map;
           85      52     2 counter   Ljava/util/concurrent/atomic/AtomicInteger;
           93      44     3 rankMap   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     129     1 playersData   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
           93      44     3 rankMap   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/util/Map, class java/util/Iterator ]
        frame_type = 49 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #306                         // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static final ext.mods.gameserver.data.manager.RaidPointManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/RaidPointManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #241                // Field ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/RaidPointManager;
         3: areturn
      LineNumberTable:
        line 192: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #92                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/RaidPointManager
         6: invokevirtual #253                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #259                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #85                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "RaidPointManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/RaidPointManager$SingletonHolder
BootstrapMethods:
  0: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #322 (Ljava/lang/Object;)Ljava/lang/Object;
      #323 REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$new$0:(Ljava/lang/Integer;)Ljava/util/Map;
      #326 (Ljava/lang/Integer;)Ljava/util/Map;
  1: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #322 (Ljava/lang/Object;)Ljava/lang/Object;
      #327 REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$addPoints$0:(Ljava/lang/Integer;)Ljava/util/Map;
      #326 (Ljava/lang/Integer;)Ljava/util/Map;
  2: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #330 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #331 REF_invokeStatic java/lang/Integer.sum:(II)I
      #335 (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  3: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #337 (Ljava/lang/Object;)I
      #339 REF_invokeVirtual java/lang/Number.intValue:()I
      #343 (Ljava/lang/Integer;)I
  4: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #345 (Ljava/lang/Object;)V
      #347 REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$calculateRanking$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
      #350 (Ljava/util/Map$Entry;)V
  5: #355 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #345 (Ljava/lang/Object;)V
      #352 REF_invokeStatic ext/mods/gameserver/data/manager/RaidPointManager.lambda$getWinners$0:(Ljava/util/Map;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/Map$Entry;)V
      #350 (Ljava/util/Map$Entry;)V
InnerClasses:
  public static #363= #211 of #63;        // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #369= #365 of #367; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
