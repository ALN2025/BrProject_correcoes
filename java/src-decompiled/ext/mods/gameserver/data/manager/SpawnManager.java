// Bytecode for: ext.mods.gameserver.data.manager.SpawnManager
// File: ext\mods\gameserver\data\manager\SpawnManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/SpawnManager.class
  Last modified 9 de jul de 2026; size 41003 bytes
  MD5 checksum 0ac2cd7fd15b14ce45c2fc6430d3f84d
  Compiled from "SpawnManager.java"
public class ext.mods.gameserver.data.manager.SpawnManager implements ext.mods.commons.data.xml.IXmlReader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/data/manager/SpawnManager
  super_class: #7                         // java/lang/Object
  interfaces: 1, fields: 11, methods: 62, attributes: 4
Constant pool:
     #1 = Fieldref           #2.#3        // ext/mods/Config.AUTOFARM_DEBUG_RETURN:Z
     #2 = Class              #4           // ext/mods/Config
     #3 = NameAndType        #5:#6        // AUTOFARM_DEBUG_RETURN:Z
     #4 = Utf8               ext/mods/Config
     #5 = Utf8               AUTOFARM_DEBUG_RETURN
     #6 = Utf8               Z
     #7 = Class              #8           // java/lang/Object
     #8 = Utf8               java/lang/Object
     #9 = String             #10          // null
    #10 = Utf8               null
    #11 = Fieldref           #12.#13      // ext/mods/gameserver/data/manager/SpawnManager.LOGGER:Lext/mods/commons/logging/CLogger;
    #12 = Class              #14          // ext/mods/gameserver/data/manager/SpawnManager
    #13 = NameAndType        #15:#16      // LOGGER:Lext/mods/commons/logging/CLogger;
    #14 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
    #15 = Utf8               LOGGER
    #16 = Utf8               Lext/mods/commons/logging/CLogger;
    #17 = Methodref          #18.#19      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #18 = Class              #20          // ext/mods/commons/logging/CLogger
    #19 = NameAndType        #21:#22      // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #20 = Utf8               ext/mods/commons/logging/CLogger
    #21 = Utf8               info
    #22 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
    #23 = Methodref          #7.#24       // java/lang/Object."<init>":()V
    #24 = NameAndType        #25:#26      // "<init>":()V
    #25 = Utf8               <init>
    #26 = Utf8               ()V
    #27 = Class              #28          // java/util/concurrent/ConcurrentHashMap
    #28 = Utf8               java/util/concurrent/ConcurrentHashMap
    #29 = Methodref          #27.#24      // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #30 = Fieldref           #12.#31      // ext/mods/gameserver/data/manager/SpawnManager._spawnData:Ljava/util/Map;
    #31 = NameAndType        #32:#33      // _spawnData:Ljava/util/Map;
    #32 = Utf8               _spawnData
    #33 = Utf8               Ljava/util/Map;
    #34 = Methodref          #27.#35      // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #35 = NameAndType        #36:#37      // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #36 = Utf8               newKeySet
    #37 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #38 = Fieldref           #12.#39      // ext/mods/gameserver/data/manager/SpawnManager._territories:Ljava/util/Set;
    #39 = NameAndType        #40:#41      // _territories:Ljava/util/Set;
    #40 = Utf8               _territories
    #41 = Utf8               Ljava/util/Set;
    #42 = Fieldref           #12.#43      // ext/mods/gameserver/data/manager/SpawnManager._makers:Ljava/util/Set;
    #43 = NameAndType        #44:#41      // _makers:Ljava/util/Set;
    #44 = Utf8               _makers
    #45 = Fieldref           #12.#46      // ext/mods/gameserver/data/manager/SpawnManager._spawns:Ljava/util/Set;
    #46 = NameAndType        #47:#41      // _spawns:Ljava/util/Set;
    #47 = Utf8               _spawns
    #48 = Fieldref           #12.#49      // ext/mods/gameserver/data/manager/SpawnManager._dynamicGroupId:I
    #49 = NameAndType        #50:#51      // _dynamicGroupId:I
    #50 = Utf8               _dynamicGroupId
    #51 = Utf8               I
    #52 = Methodref          #12.#53      // ext/mods/gameserver/data/manager/SpawnManager.load:()V
    #53 = NameAndType        #54:#26      // load:()V
    #54 = Utf8               load
    #55 = Methodref          #12.#56      // ext/mods/gameserver/data/manager/SpawnManager.loadSpawnData:()V
    #56 = NameAndType        #57:#26      // loadSpawnData:()V
    #57 = Utf8               loadSpawnData
    #58 = String             #59          // Loaded {} spawn data.
    #59 = Utf8               Loaded {} spawn data.
    #60 = InterfaceMethodref #61.#62      // java/util/Map.size:()I
    #61 = Class              #63          // java/util/Map
    #62 = NameAndType        #64:#65      // size:()I
    #63 = Utf8               java/util/Map
    #64 = Utf8               size
    #65 = Utf8               ()I
    #66 = Methodref          #67.#68      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
    #67 = Class              #69          // java/lang/Integer
    #68 = NameAndType        #70:#71      // valueOf:(I)Ljava/lang/Integer;
    #69 = Utf8               java/lang/Integer
    #70 = Utf8               valueOf
    #71 = Utf8               (I)Ljava/lang/Integer;
    #72 = String             #73          // xml/spawnlist/
    #73 = Utf8               xml/spawnlist/
    #74 = Methodref          #12.#75      // ext/mods/gameserver/data/manager/SpawnManager.parseDataFile:(Ljava/lang/String;)V
    #75 = NameAndType        #76:#77      // parseDataFile:(Ljava/lang/String;)V
    #76 = Utf8               parseDataFile
    #77 = Utf8               (Ljava/lang/String;)V
    #78 = String             #79          // Loaded {} territories.
    #79 = Utf8               Loaded {} territories.
    #80 = InterfaceMethodref #81.#62      // java/util/Set.size:()I
    #81 = Class              #82          // java/util/Set
    #82 = Utf8               java/util/Set
    #83 = String             #84          // Loaded {} NPC makers.
    #84 = Utf8               Loaded {} NPC makers.
    #85 = Class              #86          // java/util/ArrayList
    #86 = Utf8               java/util/ArrayList
    #87 = Methodref          #85.#24      // java/util/ArrayList."<init>":()V
    #88 = String             #89          // list
    #89 = Utf8               list
    #90 = InvokeDynamic      #0:#91       // #0:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
    #91 = NameAndType        #92:#93      // accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
    #92 = Utf8               accept
    #93 = Utf8               (Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
    #94 = Methodref          #12.#95      // ext/mods/gameserver/data/manager/SpawnManager.forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
    #95 = NameAndType        #96:#97      // forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
    #96 = Utf8               forEach
    #97 = Utf8               (Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
    #98 = InterfaceMethodref #61.#99      // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
    #99 = NameAndType        #100:#101    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #100 = Utf8               get
   #101 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #102 = Class              #103         // ext/mods/gameserver/model/spawn/SpawnData
   #103 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
   #104 = Methodref          #12.#105     // ext/mods/gameserver/data/manager/SpawnManager.save:()V
   #105 = NameAndType        #106:#26     // save:()V
   #106 = Utf8               save
   #107 = InterfaceMethodref #61.#108     // java/util/Map.clear:()V
   #108 = NameAndType        #109:#26     // clear:()V
   #109 = Utf8               clear
   #110 = InterfaceMethodref #81.#108     // java/util/Set.clear:()V
   #111 = Methodref          #12.#112     // ext/mods/gameserver/data/manager/SpawnManager.spawn:()V
   #112 = NameAndType        #113:#26     // spawn:()V
   #113 = Utf8               spawn
   #114 = InterfaceMethodref #81.#115     // java/util/Set.stream:()Ljava/util/stream/Stream;
   #115 = NameAndType        #116:#117    // stream:()Ljava/util/stream/Stream;
   #116 = Utf8               stream
   #117 = Utf8               ()Ljava/util/stream/Stream;
   #118 = InvokeDynamic      #1:#119      // #1:apply:()Ljava/util/function/Function;
   #119 = NameAndType        #120:#121    // apply:()Ljava/util/function/Function;
   #120 = Utf8               apply
   #121 = Utf8               ()Ljava/util/function/Function;
   #122 = InterfaceMethodref #123.#124    // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #123 = Class              #125         // java/util/stream/Stream
   #124 = NameAndType        #126:#127    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #125 = Utf8               java/util/stream/Stream
   #126 = Utf8               map
   #127 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #128 = InvokeDynamic      #2:#119      // #2:apply:()Ljava/util/function/Function;
   #129 = InterfaceMethodref #123.#130    // java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #130 = NameAndType        #131:#127    // flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #131 = Utf8               flatMap
   #132 = InvokeDynamic      #3:#133      // #3:accept:()Ljava/util/function/Consumer;
   #133 = NameAndType        #92:#134     // accept:()Ljava/util/function/Consumer;
   #134 = Utf8               ()Ljava/util/function/Consumer;
   #135 = InterfaceMethodref #123.#136    // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
   #136 = NameAndType        #96:#137     // forEach:(Ljava/util/function/Consumer;)V
   #137 = Utf8               (Ljava/util/function/Consumer;)V
   #138 = InvokeDynamic      #4:#133      // #4:accept:()Ljava/util/function/Consumer;
   #139 = InterfaceMethodref #81.#136     // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
   #140 = Methodref          #141.#142    // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #141 = Class              #143         // ext/mods/commons/pool/ConnectionPool
   #142 = NameAndType        #144:#145    // getConnection:()Ljava/sql/Connection;
   #143 = Utf8               ext/mods/commons/pool/ConnectionPool
   #144 = Utf8               getConnection
   #145 = Utf8               ()Ljava/sql/Connection;
   #146 = String             #147         // TRUNCATE spawn_data
   #147 = Utf8               TRUNCATE spawn_data
   #148 = InterfaceMethodref #149.#150    // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #149 = Class              #151         // java/sql/Connection
   #150 = NameAndType        #152:#153    // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #151 = Utf8               java/sql/Connection
   #152 = Utf8               prepareStatement
   #153 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #154 = String             #155         // INSERT INTO spawn_data (name, status, current_hp, current_mp, loc_x, loc_y, loc_z, heading, db_value, respawn_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
   #155 = Utf8               INSERT INTO spawn_data (name, status, current_hp, current_mp, loc_x, loc_y, loc_z, heading, db_value, respawn_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
   #156 = InterfaceMethodref #157.#158    // java/sql/PreparedStatement.execute:()Z
   #157 = Class              #159         // java/sql/PreparedStatement
   #158 = NameAndType        #160:#161    // execute:()Z
   #159 = Utf8               java/sql/PreparedStatement
   #160 = Utf8               execute
   #161 = Utf8               ()Z
   #162 = InterfaceMethodref #61.#163     // java/util/Map.values:()Ljava/util/Collection;
   #163 = NameAndType        #164:#165    // values:()Ljava/util/Collection;
   #164 = Utf8               values
   #165 = Utf8               ()Ljava/util/Collection;
   #166 = InterfaceMethodref #167.#168    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #167 = Class              #169         // java/util/Collection
   #168 = NameAndType        #170:#171    // iterator:()Ljava/util/Iterator;
   #169 = Utf8               java/util/Collection
   #170 = Utf8               iterator
   #171 = Utf8               ()Ljava/util/Iterator;
   #172 = InterfaceMethodref #173.#174    // java/util/Iterator.hasNext:()Z
   #173 = Class              #175         // java/util/Iterator
   #174 = NameAndType        #176:#161    // hasNext:()Z
   #175 = Utf8               java/util/Iterator
   #176 = Utf8               hasNext
   #177 = InterfaceMethodref #173.#178    // java/util/Iterator.next:()Ljava/lang/Object;
   #178 = NameAndType        #179:#180    // next:()Ljava/lang/Object;
   #179 = Utf8               next
   #180 = Utf8               ()Ljava/lang/Object;
   #181 = Methodref          #102.#182    // ext/mods/gameserver/model/spawn/SpawnData.getStatus:()B
   #182 = NameAndType        #183:#184    // getStatus:()B
   #183 = Utf8               getStatus
   #184 = Utf8               ()B
   #185 = Methodref          #102.#186    // ext/mods/gameserver/model/spawn/SpawnData.save:(Ljava/sql/PreparedStatement;)V
   #186 = NameAndType        #106:#187    // save:(Ljava/sql/PreparedStatement;)V
   #187 = Utf8               (Ljava/sql/PreparedStatement;)V
   #188 = InterfaceMethodref #157.#189    // java/sql/PreparedStatement.addBatch:()V
   #189 = NameAndType        #190:#26     // addBatch:()V
   #190 = Utf8               addBatch
   #191 = Class              #192         // java/lang/Exception
   #192 = Utf8               java/lang/Exception
   #193 = String             #194         // Couldn\'t save spawn data for name \"{}\".
   #194 = Utf8               Couldn\'t save spawn data for name \"{}\".
   #195 = Methodref          #102.#196    // ext/mods/gameserver/model/spawn/SpawnData.getName:()Ljava/lang/String;
   #196 = NameAndType        #197:#198    // getName:()Ljava/lang/String;
   #197 = Utf8               getName
   #198 = Utf8               ()Ljava/lang/String;
   #199 = Methodref          #18.#200     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #200 = NameAndType        #201:#202    // warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #201 = Utf8               warn
   #202 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #203 = InterfaceMethodref #157.#204    // java/sql/PreparedStatement.executeBatch:()[I
   #204 = NameAndType        #205:#206    // executeBatch:()[I
   #205 = Utf8               executeBatch
   #206 = Utf8               ()[I
   #207 = InterfaceMethodref #157.#208    // java/sql/PreparedStatement.close:()V
   #208 = NameAndType        #209:#26     // close:()V
   #209 = Utf8               close
   #210 = Class              #211         // java/lang/Throwable
   #211 = Utf8               java/lang/Throwable
   #212 = Methodref          #210.#213    // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #213 = NameAndType        #214:#215    // addSuppressed:(Ljava/lang/Throwable;)V
   #214 = Utf8               addSuppressed
   #215 = Utf8               (Ljava/lang/Throwable;)V
   #216 = InterfaceMethodref #149.#208    // java/sql/Connection.close:()V
   #217 = String             #218         // Couldn\'t save spawn data.
   #218 = Utf8               Couldn\'t save spawn data.
   #219 = Methodref          #18.#220     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #220 = NameAndType        #201:#221    // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #221 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #222 = String             #223         // UPDATE spawn_data SET name = ?, status = ?, current_hp = ?, current_mp = ?, loc_x = ?, loc_y = ?, loc_z = ?, heading = ?, db_value = ?, respawn_time =? WHERE name=?
   #223 = Utf8               UPDATE spawn_data SET name = ?, status = ?, current_hp = ?, current_mp = ?, loc_x = ?, loc_y = ?, loc_z = ?, heading = ?, db_value = ?, respawn_time =? WHERE name=?
   #224 = InterfaceMethodref #157.#225    // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
   #225 = NameAndType        #226:#227    // setString:(ILjava/lang/String;)V
   #226 = Utf8               setString
   #227 = Utf8               (ILjava/lang/String;)V
   #228 = String             #229         // SELECT * FROM spawn_data ORDER BY name
   #229 = Utf8               SELECT * FROM spawn_data ORDER BY name
   #230 = InterfaceMethodref #157.#231    // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
   #231 = NameAndType        #232:#233    // executeQuery:()Ljava/sql/ResultSet;
   #232 = Utf8               executeQuery
   #233 = Utf8               ()Ljava/sql/ResultSet;
   #234 = InterfaceMethodref #235.#236    // java/sql/ResultSet.next:()Z
   #235 = Class              #237         // java/sql/ResultSet
   #236 = NameAndType        #179:#161    // next:()Z
   #237 = Utf8               java/sql/ResultSet
   #238 = String             #239         // name
   #239 = Utf8               name
   #240 = InterfaceMethodref #235.#241    // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #241 = NameAndType        #242:#243    // getString:(Ljava/lang/String;)Ljava/lang/String;
   #242 = Utf8               getString
   #243 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #244 = Methodref          #102.#245    // ext/mods/gameserver/model/spawn/SpawnData."<init>":(Ljava/lang/String;Ljava/sql/ResultSet;)V
   #245 = NameAndType        #25:#246     // "<init>":(Ljava/lang/String;Ljava/sql/ResultSet;)V
   #246 = Utf8               (Ljava/lang/String;Ljava/sql/ResultSet;)V
   #247 = InterfaceMethodref #61.#248     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #248 = NameAndType        #249:#250    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #249 = Utf8               put
   #250 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #251 = InterfaceMethodref #235.#208    // java/sql/ResultSet.close:()V
   #252 = String             #253         // Couldn\'t load spawn data.
   #253 = Utf8               Couldn\'t load spawn data.
   #254 = Fieldref           #2.#255      // ext/mods/Config.NO_SPAWNS:Z
   #255 = NameAndType        #256:#6      // NO_SPAWNS:Z
   #256 = Utf8               NO_SPAWNS
   #257 = InvokeDynamic      #5:#258      // #5:test:()Ljava/util/function/Predicate;
   #258 = NameAndType        #259:#260    // test:()Ljava/util/function/Predicate;
   #259 = Utf8               test
   #260 = Utf8               ()Ljava/util/function/Predicate;
   #261 = InterfaceMethodref #123.#262    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #262 = NameAndType        #263:#264    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #263 = Utf8               filter
   #264 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #265 = InvokeDynamic      #6:#266      // #6:applyAsInt:()Ljava/util/function/ToIntFunction;
   #266 = NameAndType        #267:#268    // applyAsInt:()Ljava/util/function/ToIntFunction;
   #267 = Utf8               applyAsInt
   #268 = Utf8               ()Ljava/util/function/ToIntFunction;
   #269 = InterfaceMethodref #123.#270    // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #270 = NameAndType        #271:#272    // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #271 = Utf8               mapToInt
   #272 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #273 = InterfaceMethodref #274.#275    // java/util/stream/IntStream.sum:()I
   #274 = Class              #276         // java/util/stream/IntStream
   #275 = NameAndType        #277:#65     // sum:()I
   #276 = Utf8               java/util/stream/IntStream
   #277 = Utf8               sum
   #278 = String             #279         // Spawned {} NPCs.
   #279 = Utf8               Spawned {} NPCs.
   #280 = Methodref          #281.#282    // java/lang/Long.valueOf:(J)Ljava/lang/Long;
   #281 = Class              #283         // java/lang/Long
   #282 = NameAndType        #70:#284     // valueOf:(J)Ljava/lang/Long;
   #283 = Utf8               java/lang/Long
   #284 = Utf8               (J)Ljava/lang/Long;
   #285 = Fieldref           #2.#286      // ext/mods/Config.SPAWN_EVENTS:[Ljava/lang/String;
   #286 = NameAndType        #287:#288    // SPAWN_EVENTS:[Ljava/lang/String;
   #287 = Utf8               SPAWN_EVENTS
   #288 = Utf8               [Ljava/lang/String;
   #289 = Methodref          #12.#290     // ext/mods/gameserver/data/manager/SpawnManager.spawnEventNpcs:(Ljava/lang/String;Z)J
   #290 = NameAndType        #291:#292    // spawnEventNpcs:(Ljava/lang/String;Z)J
   #291 = Utf8               spawnEventNpcs
   #292 = Utf8               (Ljava/lang/String;Z)J
   #293 = Methodref          #12.#294     // ext/mods/gameserver/data/manager/SpawnManager.notifySevenSignsChange:()V
   #294 = NameAndType        #295:#26     // notifySevenSignsChange:()V
   #295 = Utf8               notifySevenSignsChange
   #296 = String             #297         // ssq_seal1_none
   #297 = Utf8               ssq_seal1_none
   #298 = Methodref          #12.#299     // ext/mods/gameserver/data/manager/SpawnManager.despawnEventNpcs:(Ljava/lang/String;Z)J
   #299 = NameAndType        #300:#292    // despawnEventNpcs:(Ljava/lang/String;Z)J
   #300 = Utf8               despawnEventNpcs
   #301 = String             #302         // ssq_seal1_dawn
   #302 = Utf8               ssq_seal1_dawn
   #303 = String             #304         // ssq_seal1_twilight
   #304 = Utf8               ssq_seal1_twilight
   #305 = String             #306         // ssq_seal2_none
   #306 = Utf8               ssq_seal2_none
   #307 = String             #308         // ssq_seal2_dawn
   #308 = Utf8               ssq_seal2_dawn
   #309 = String             #310         // ssq_seal2_twilight
   #310 = Utf8               ssq_seal2_twilight
   #311 = String             #312         // ssq_event
   #312 = Utf8               ssq_event
   #313 = Fieldref           #314.#315    // ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
   #314 = Class              #316         // ext/mods/gameserver/data/manager/SpawnManager$1
   #315 = NameAndType        #317:#318    // $SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
   #316 = Utf8               ext/mods/gameserver/data/manager/SpawnManager$1
   #317 = Utf8               $SwitchMap$ext$mods$gameserver$enums$PeriodType
   #318 = Utf8               [I
   #319 = Methodref          #320.#321    // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #320 = Class              #322         // ext/mods/gameserver/data/manager/SevenSignsManager
   #321 = NameAndType        #323:#324    // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #322 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #323 = Utf8               getInstance
   #324 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #325 = Methodref          #320.#326    // ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
   #326 = NameAndType        #327:#328    // getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
   #327 = Utf8               getCurrentPeriod
   #328 = Utf8               ()Lext/mods/gameserver/enums/PeriodType;
   #329 = Methodref          #330.#331    // ext/mods/gameserver/enums/PeriodType.ordinal:()I
   #330 = Class              #332         // ext/mods/gameserver/enums/PeriodType
   #331 = NameAndType        #333:#65     // ordinal:()I
   #332 = Utf8               ext/mods/gameserver/enums/PeriodType
   #333 = Utf8               ordinal
   #334 = String             #335         // Spawned {} Seven Signs - Event NPCs.
   #335 = Utf8               Spawned {} Seven Signs - Event NPCs.
   #336 = Methodref          #320.#337    // ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
   #337 = NameAndType        #338:#339    // getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
   #338 = Utf8               getWinningCabal
   #339 = Utf8               ()Lext/mods/gameserver/enums/CabalType;
   #340 = Fieldref           #314.#341    // ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #341 = NameAndType        #342:#318    // $SwitchMap$ext$mods$gameserver$enums$CabalType:[I
   #342 = Utf8               $SwitchMap$ext$mods$gameserver$enums$CabalType
   #343 = Fieldref           #344.#345    // ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
   #344 = Class              #346         // ext/mods/gameserver/enums/SealType
   #345 = NameAndType        #347:#348    // AVARICE:Lext/mods/gameserver/enums/SealType;
   #346 = Utf8               ext/mods/gameserver/enums/SealType
   #347 = Utf8               AVARICE
   #348 = Utf8               Lext/mods/gameserver/enums/SealType;
   #349 = Methodref          #320.#350    // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #350 = NameAndType        #351:#352    // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #351 = Utf8               getSealOwner
   #352 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
   #353 = Methodref          #354.#331    // ext/mods/gameserver/enums/CabalType.ordinal:()I
   #354 = Class              #355         // ext/mods/gameserver/enums/CabalType
   #355 = Utf8               ext/mods/gameserver/enums/CabalType
   #356 = String             #357         // Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal none.
   #357 = Utf8               Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal none.
   #358 = Fieldref           #354.#359    // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
   #359 = NameAndType        #360:#361    // DUSK:Lext/mods/gameserver/enums/CabalType;
   #360 = Utf8               DUSK
   #361 = Utf8               Lext/mods/gameserver/enums/CabalType;
   #362 = String             #363         // Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dusk.
   #363 = Utf8               Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dusk.
   #364 = String             #365         // Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dawn, seal cabal Dusk.
   #365 = Utf8               Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dawn, seal cabal Dusk.
   #366 = Fieldref           #354.#367    // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
   #367 = NameAndType        #368:#361    // DAWN:Lext/mods/gameserver/enums/CabalType;
   #368 = Utf8               DAWN
   #369 = String             #370         // Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dawn.
   #370 = Utf8               Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dawn.
   #371 = String             #372         // Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dusk, seal cabal Dawn.
   #372 = Utf8               Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dusk, seal cabal Dawn.
   #373 = Fieldref           #344.#374    // ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
   #374 = NameAndType        #375:#348    // GNOSIS:Lext/mods/gameserver/enums/SealType;
   #375 = Utf8               GNOSIS
   #376 = String             #377         // Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal none.
   #377 = Utf8               Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal none.
   #378 = String             #379         // Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dusk.
   #379 = Utf8               Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dusk.
   #380 = String             #381         // Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dawn, seal cabal Dusk.
   #381 = Utf8               Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dawn, seal cabal Dusk.
   #382 = String             #383         // Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dawn.
   #383 = Utf8               Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dawn.
   #384 = String             #385         // Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dusk, seal cabal Dawn.
   #385 = Utf8               Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dusk, seal cabal Dawn.
   #386 = InvokeDynamic      #7:#266      // #7:applyAsInt:()Ljava/util/function/ToIntFunction;
   #387 = String             #388         // Despawned {} NPCs.
   #388 = Utf8               Despawned {} NPCs.
   #389 = InvokeDynamic      #8:#133      // #8:accept:()Ljava/util/function/Consumer;
   #390 = InvokeDynamic      #9:#391      // #9:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #391 = NameAndType        #259:#392    // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #392 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
   #393 = InterfaceMethodref #123.#394    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #394 = NameAndType        #395:#396    // findFirst:()Ljava/util/Optional;
   #395 = Utf8               findFirst
   #396 = Utf8               ()Ljava/util/Optional;
   #397 = Methodref          #398.#399    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #398 = Class              #400         // java/util/Optional
   #399 = NameAndType        #401:#101    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #400 = Utf8               java/util/Optional
   #401 = Utf8               orElse
   #402 = Class              #403         // ext/mods/commons/geometry/Territory
   #403 = Utf8               ext/mods/commons/geometry/Territory
   #404 = String             #405         // ;
   #405 = Utf8               ;
   #406 = Methodref          #407.#408    // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #407 = Class              #409         // java/lang/String
   #408 = NameAndType        #410:#411    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #409 = Utf8               java/lang/String
   #410 = Utf8               split
   #411 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #412 = Methodref          #12.#413     // ext/mods/gameserver/data/manager/SpawnManager.getTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
   #413 = NameAndType        #414:#415    // getTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
   #414 = Utf8               getTerritory
   #415 = Utf8               (Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
   #416 = String             #417         // %03d
   #417 = Utf8               %03d
   #418 = Methodref          #407.#419    // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #419 = NameAndType        #420:#421    // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #420 = Utf8               format
   #421 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #422 = InvokeDynamic      #10:#423     // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #423 = NameAndType        #424:#243    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #424 = Utf8               makeConcatWithConstants
   #425 = Class              #426         // java/util/HashSet
   #426 = Utf8               java/util/HashSet
   #427 = Methodref          #425.#24     // java/util/HashSet."<init>":()V
   #428 = Integer            2147483647
   #429 = Integer            -2147483648
   #430 = String             #431         // Territory {} does not exist.
   #431 = Utf8               Territory {} does not exist.
   #432 = Methodref          #18.#433     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #433 = NameAndType        #201:#22     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #434 = Methodref          #402.#435    // ext/mods/commons/geometry/Territory.getMinZ:()I
   #435 = NameAndType        #436:#65     // getMinZ:()I
   #436 = Utf8               getMinZ
   #437 = Methodref          #438.#439    // java/lang/Math.min:(II)I
   #438 = Class              #440         // java/lang/Math
   #439 = NameAndType        #441:#442    // min:(II)I
   #440 = Utf8               java/lang/Math
   #441 = Utf8               min
   #442 = Utf8               (II)I
   #443 = Methodref          #402.#444    // ext/mods/commons/geometry/Territory.getMaxZ:()I
   #444 = NameAndType        #445:#65     // getMaxZ:()I
   #445 = Utf8               getMaxZ
   #446 = Methodref          #438.#447    // java/lang/Math.max:(II)I
   #447 = NameAndType        #448:#442    // max:(II)I
   #448 = Utf8               max
   #449 = Methodref          #402.#450    // ext/mods/commons/geometry/Territory.getShape:()Lext/mods/commons/geometry/AShape;
   #450 = NameAndType        #451:#452    // getShape:()Lext/mods/commons/geometry/AShape;
   #451 = Utf8               getShape
   #452 = Utf8               ()Lext/mods/commons/geometry/AShape;
   #453 = Class              #454         // ext/mods/commons/geometry/Polygon
   #454 = Utf8               ext/mods/commons/geometry/Polygon
   #455 = Methodref          #453.#456    // ext/mods/commons/geometry/Polygon.getShapes:()Ljava/util/Collection;
   #456 = NameAndType        #457:#165    // getShapes:()Ljava/util/Collection;
   #457 = Utf8               getShapes
   #458 = InterfaceMethodref #81.#459     // java/util/Set.addAll:(Ljava/util/Collection;)Z
   #459 = NameAndType        #460:#461    // addAll:(Ljava/util/Collection;)Z
   #460 = Utf8               addAll
   #461 = Utf8               (Ljava/util/Collection;)Z
   #462 = Class              #463         // ext/mods/commons/geometry/Triangle
   #463 = Utf8               ext/mods/commons/geometry/Triangle
   #464 = InterfaceMethodref #81.#465     // java/util/Set.add:(Ljava/lang/Object;)Z
   #465 = NameAndType        #466:#467    // add:(Ljava/lang/Object;)Z
   #466 = Utf8               add
   #467 = Utf8               (Ljava/lang/Object;)Z
   #468 = Methodref          #402.#469    // ext/mods/commons/geometry/Territory."<init>":(Ljava/lang/String;IILjava/util/Set;)V
   #469 = NameAndType        #25:#470     // "<init>":(Ljava/lang/String;IILjava/util/Set;)V
   #470 = Utf8               (Ljava/lang/String;IILjava/util/Set;)V
   #471 = InvokeDynamic      #11:#472     // #11:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #472 = NameAndType        #259:#473    // test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #473 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #474 = InterfaceMethodref #123.#475    // java/util/stream/Stream.toList:()Ljava/util/List;
   #475 = NameAndType        #476:#477    // toList:()Ljava/util/List;
   #476 = Utf8               toList
   #477 = Utf8               ()Ljava/util/List;
   #478 = InvokeDynamic      #12:#391     // #12:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #479 = Class              #480         // ext/mods/gameserver/model/spawn/NpcMaker
   #480 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
   #481 = InvokeDynamic      #13:#391     // #13:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #482 = InvokeDynamic      #14:#483     // #14:accept:(Lext/mods/gameserver/scripting/Quest;)Ljava/util/function/Consumer;
   #483 = NameAndType        #92:#484     // accept:(Lext/mods/gameserver/scripting/Quest;)Ljava/util/function/Consumer;
   #484 = Utf8               (Lext/mods/gameserver/scripting/Quest;)Ljava/util/function/Consumer;
   #485 = InvokeDynamic      #15:#391     // #15:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #486 = InvokeDynamic      #16:#483     // #16:accept:(Lext/mods/gameserver/scripting/Quest;)Ljava/util/function/Consumer;
   #487 = Methodref          #407.#488    // java/lang/String.length:()I
   #488 = NameAndType        #489:#65     // length:()I
   #489 = Utf8               length
   #490 = InvokeDynamic      #17:#391     // #17:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #491 = String             #492         // Spawned {} \"{}\" NPCs.
   #492 = Utf8               Spawned {} \"{}\" NPCs.
   #493 = InvokeDynamic      #18:#391     // #18:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #494 = String             #495         // Despawned {} \"{}\" NPCs.
   #495 = Utf8               Despawned {} \"{}\" NPCs.
   #496 = Methodref          #407.#497    // java/lang/String.isEmpty:()Z
   #497 = NameAndType        #498:#161    // isEmpty:()Z
   #498 = Utf8               isEmpty
   #499 = InvokeDynamic      #19:#500     // #19:test:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
   #500 = NameAndType        #259:#501    // test:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
   #501 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
   #502 = InvokeDynamic      #20:#500     // #20:test:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
   #503 = Methodref          #12.#504     // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #504 = NameAndType        #505:#506    // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #505 = Utf8               addSpawn
   #506 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
   #507 = Class              #508         // java/io/File
   #508 = Utf8               java/io/File
   #509 = Fieldref           #12.#510     // ext/mods/gameserver/data/manager/SpawnManager.OTHER_XML_FOLDER:Ljava/lang/String;
   #510 = NameAndType        #511:#512    // OTHER_XML_FOLDER:Ljava/lang/String;
   #511 = Utf8               OTHER_XML_FOLDER
   #512 = Utf8               Ljava/lang/String;
   #513 = Methodref          #507.#514    // java/io/File."<init>":(Ljava/lang/String;)V
   #514 = NameAndType        #25:#77      // "<init>":(Ljava/lang/String;)V
   #515 = Methodref          #507.#516    // java/io/File.exists:()Z
   #516 = NameAndType        #517:#161    // exists:()Z
   #517 = Utf8               exists
   #518 = Methodref          #507.#519    // java/io/File.mkdir:()Z
   #519 = NameAndType        #520:#161    // mkdir:()Z
   #520 = Utf8               mkdir
   #521 = Class              #522         // java/lang/SecurityException
   #522 = Utf8               java/lang/SecurityException
   #523 = Methodref          #524.#525    // ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #524 = Class              #526         // ext/mods/gameserver/model/spawn/Spawn
   #525 = NameAndType        #527:#528    // getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #526 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #527 = Utf8               getNpc
   #528 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #529 = Methodref          #530.#196    // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
   #530 = Class              #531         // ext/mods/gameserver/model/actor/Npc
   #531 = Utf8               ext/mods/gameserver/model/actor/Npc
   #532 = String             #533         // (\\s|\')+
   #533 = Utf8               (\\s|\')+
   #534 = String             #535         //
   #535 = Utf8
   #536 = Methodref          #407.#537    // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #537 = NameAndType        #538:#539    // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #538 = Utf8               replaceAll
   #539 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #540 = Methodref          #407.#541    // java/lang/String.toLowerCase:()Ljava/lang/String;
   #541 = NameAndType        #542:#198    // toLowerCase:()Ljava/lang/String;
   #542 = Utf8               toLowerCase
   #543 = Methodref          #530.#544    // ext/mods/gameserver/model/actor/Npc.getX:()I
   #544 = NameAndType        #545:#65     // getX:()I
   #545 = Utf8               getX
   #546 = Methodref          #530.#547    // ext/mods/gameserver/model/actor/Npc.getY:()I
   #547 = NameAndType        #548:#65     // getY:()I
   #548 = Utf8               getY
   #549 = InvokeDynamic      #21:#550     // #21:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #550 = NameAndType        #424:#551    // makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #551 = Utf8               (Ljava/lang/String;II)Ljava/lang/String;
   #552 = InvokeDynamic      #22:#550     // #22:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #553 = Methodref          #524.#554    // ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
   #554 = NameAndType        #555:#65     // getLocX:()I
   #555 = Utf8               getLocX
   #556 = Class              #557         // ext/mods/gameserver/model/World
   #557 = Utf8               ext/mods/gameserver/model/World
   #558 = Integer            -131072
   #559 = Methodref          #524.#560    // ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
   #560 = NameAndType        #561:#65     // getLocY:()I
   #561 = Utf8               getLocY
   #562 = Integer            -262144
   #563 = InvokeDynamic      #23:#564     // #23:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
   #564 = NameAndType        #424:#565    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
   #565 = Utf8               (Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
   #566 = Methodref          #524.#567    // ext/mods/gameserver/model/spawn/Spawn.getNpcId:()I
   #567 = NameAndType        #568:#65     // getNpcId:()I
   #568 = Utf8               getNpcId
   #569 = Methodref          #407.#570    // java/lang/String.valueOf:(I)Ljava/lang/String;
   #570 = NameAndType        #70:#571     // valueOf:(I)Ljava/lang/String;
   #571 = Utf8               (I)Ljava/lang/String;
   #572 = Methodref          #524.#573    // ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
   #573 = NameAndType        #574:#65     // getLocZ:()I
   #574 = Utf8               getLocZ
   #575 = Methodref          #524.#576    // ext/mods/gameserver/model/spawn/Spawn.getHeading:()I
   #576 = NameAndType        #577:#65     // getHeading:()I
   #577 = Utf8               getHeading
   #578 = InvokeDynamic      #24:#579     // #24:makeConcatWithConstants:(IIII)Ljava/lang/String;
   #579 = NameAndType        #424:#580    // makeConcatWithConstants:(IIII)Ljava/lang/String;
   #580 = Utf8               (IIII)Ljava/lang/String;
   #581 = Methodref          #407.#582    // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #582 = NameAndType        #70:#583     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #583 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #584 = Methodref          #530.#567    // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #585 = Methodref          #12.#586     // ext/mods/gameserver/data/manager/SpawnManager.getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
   #586 = NameAndType        #587:#588    // getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
   #587 = Utf8               getSpawn
   #588 = Utf8               (I)Lext/mods/gameserver/model/spawn/ASpawn;
   #589 = Methodref          #590.#591    // ext/mods/gameserver/model/spawn/ASpawn.getRespawnDelay:()I
   #590 = Class              #592         // ext/mods/gameserver/model/spawn/ASpawn
   #591 = NameAndType        #593:#65     // getRespawnDelay:()I
   #592 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
   #593 = Utf8               getRespawnDelay
   #594 = Methodref          #590.#595    // ext/mods/gameserver/model/spawn/ASpawn.getRespawnRandom:()I
   #595 = NameAndType        #596:#65     // getRespawnRandom:()I
   #596 = Utf8               getRespawnRandom
   #597 = InvokeDynamic      #25:#598     // #25:makeConcatWithConstants:(I)Ljava/lang/String;
   #598 = NameAndType        #424:#571    // makeConcatWithConstants:(I)Ljava/lang/String;
   #599 = InvokeDynamic      #26:#564     // #26:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
   #600 = Class              #601         // java/io/BufferedReader
   #601 = Utf8               java/io/BufferedReader
   #602 = Class              #603         // java/io/FileReader
   #603 = Utf8               java/io/FileReader
   #604 = Methodref          #602.#605    // java/io/FileReader."<init>":(Ljava/io/File;)V
   #605 = NameAndType        #25:#606     // "<init>":(Ljava/io/File;)V
   #606 = Utf8               (Ljava/io/File;)V
   #607 = Methodref          #600.#608    // java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
   #608 = NameAndType        #25:#609     // "<init>":(Ljava/io/Reader;)V
   #609 = Utf8               (Ljava/io/Reader;)V
   #610 = Class              #611         // java/io/BufferedWriter
   #611 = Utf8               java/io/BufferedWriter
   #612 = Class              #613         // java/io/FileWriter
   #613 = Utf8               java/io/FileWriter
   #614 = Methodref          #612.#605    // java/io/FileWriter."<init>":(Ljava/io/File;)V
   #615 = Methodref          #610.#616    // java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
   #616 = NameAndType        #25:#617     // "<init>":(Ljava/io/Writer;)V
   #617 = Utf8               (Ljava/io/Writer;)V
   #618 = Methodref          #600.#619    // java/io/BufferedReader.readLine:()Ljava/lang/String;
   #619 = NameAndType        #620:#198    // readLine:()Ljava/lang/String;
   #620 = Utf8               readLine
   #621 = String             #622         // </list>
   #622 = Utf8               </list>
   #623 = Methodref          #407.#624    // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #624 = NameAndType        #625:#626    // contains:(Ljava/lang/CharSequence;)Z
   #625 = Utf8               contains
   #626 = Utf8               (Ljava/lang/CharSequence;)Z
   #627 = InvokeDynamic      #27:#550     // #27:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
   #628 = Methodref          #610.#629    // java/io/BufferedWriter.write:(Ljava/lang/String;)V
   #629 = NameAndType        #630:#77     // write:(Ljava/lang/String;)V
   #630 = Utf8               write
   #631 = InvokeDynamic      #28:#632     // #28:makeConcatWithConstants:(II)Ljava/lang/String;
   #632 = NameAndType        #424:#633    // makeConcatWithConstants:(II)Ljava/lang/String;
   #633 = Utf8               (II)Ljava/lang/String;
   #634 = String             #635         // \t</territory>\n
   #635 = Utf8               \t</territory>\n
   #636 = InvokeDynamic      #29:#637     // #29:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #637 = NameAndType        #424:#539    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #638 = String             #639         // \t\t<ai type=\"default_maker\"/>\n
   #639 = Utf8               \t\t<ai type=\"default_maker\"/>\n
   #640 = Methodref          #641.#642    // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #641 = Class              #643         // ext/mods/gameserver/data/xml/NpcData
   #642 = NameAndType        #323:#644    // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #643 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #644 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #645 = Methodref          #641.#646    // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #646 = NameAndType        #647:#648    // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #647 = Utf8               getTemplate
   #648 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #649 = Methodref          #650.#196    // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
   #650 = Class              #651         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #651 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #652 = InvokeDynamic      #30:#653     // #30:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #653 = NameAndType        #424:#654    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #654 = Utf8               (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #655 = String             #656         // \t</npcmaker>\n
   #656 = Utf8               \t</npcmaker>\n
   #657 = InvokeDynamic      #31:#423     // #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #658 = Methodref          #610.#208    // java/io/BufferedWriter.close:()V
   #659 = Methodref          #600.#208    // java/io/BufferedReader.close:()V
   #660 = Methodref          #507.#661    // java/io/File.delete:()Z
   #661 = NameAndType        #662:#161    // delete:()Z
   #662 = Utf8               delete
   #663 = Methodref          #507.#664    // java/io/File.renameTo:(Ljava/io/File;)Z
   #664 = NameAndType        #665:#666    // renameTo:(Ljava/io/File;)Z
   #665 = Utf8               renameTo
   #666 = Utf8               (Ljava/io/File;)Z
   #667 = InvokeDynamic      #32:#423     // #32:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #668 = Methodref          #18.#669     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #669 = NameAndType        #201:#670    // warn:(Ljava/lang/Object;)V
   #670 = Utf8               (Ljava/lang/Object;)V
   #671 = String             #672         // <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n
   #672 = Utf8               <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n
   #673 = String             #674         // <list>\n
   #674 = Utf8               <list>\n
   #675 = String             #676         // </list>\n
   #676 = Utf8               </list>\n
   #677 = InvokeDynamic      #33:#637     // #33:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #678 = InterfaceMethodref #81.#679     // java/util/Set.remove:(Ljava/lang/Object;)Z
   #679 = NameAndType        #680:#467    // remove:(Ljava/lang/Object;)Z
   #680 = Utf8               remove
   #681 = Methodref          #524.#682    // ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #682 = NameAndType        #683:#684    // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #683 = Utf8               getSpawnLocation
   #684 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #685 = Methodref          #686.#544    // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
   #686 = Class              #687         // ext/mods/gameserver/model/location/SpawnLocation
   #687 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #688 = Methodref          #686.#547    // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
   #689 = InvokeDynamic      #34:#423     // #34:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #690 = InvokeDynamic      #35:#423     // #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #691 = String             #692         // </territory>
   #692 = Utf8               </territory>
   #693 = String             #694         // </npcmaker>
   #694 = Utf8               </npcmaker>
   #695 = Methodref          #12.#696     // ext/mods/gameserver/data/manager/SpawnManager.isEmptyXml:(Ljava/io/File;)Z
   #696 = NameAndType        #697:#666    // isEmptyXml:(Ljava/io/File;)Z
   #697 = Utf8               isEmptyXml
   #698 = InvokeDynamic      #36:#423     // #36:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #699 = Class              #700         // java/lang/StringBuilder
   #700 = Utf8               java/lang/StringBuilder
   #701 = Methodref          #699.#24     // java/lang/StringBuilder."<init>":()V
   #702 = Methodref          #407.#703    // java/lang/String.trim:()Ljava/lang/String;
   #703 = NameAndType        #704:#198    // trim:()Ljava/lang/String;
   #704 = Utf8               trim
   #705 = Methodref          #699.#706    // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #706 = NameAndType        #707:#708    // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #707 = Utf8               append
   #708 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #709 = String             #710         // <?xml version=\"1.0\" encoding=\"UTF-8\"?><list></list>
   #710 = Utf8               <?xml version=\"1.0\" encoding=\"UTF-8\"?><list></list>
   #711 = Methodref          #699.#712    // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #712 = NameAndType        #713:#198    // toString:()Ljava/lang/String;
   #713 = Utf8               toString
   #714 = Methodref          #407.#715    // java/lang/String.equals:(Ljava/lang/Object;)Z
   #715 = NameAndType        #716:#467    // equals:(Ljava/lang/Object;)Z
   #716 = Utf8               equals
   #717 = InvokeDynamic      #37:#423     // #37:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #718 = String             #719         // {} getSpawn(npcId={}) entry
   #719 = Utf8               {} getSpawn(npcId={}) entry
   #720 = String             #721         // [SpawnManager][NpcSearch]
   #721 = Utf8               [SpawnManager][NpcSearch]
   #722 = Methodref          #12.#723     // ext/mods/gameserver/data/manager/SpawnManager.npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
   #723 = NameAndType        #724:#725    // npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
   #724 = Utf8               npcSearchLog
   #725 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)V
   #726 = InvokeDynamic      #38:#119     // #38:apply:()Ljava/util/function/Function;
   #727 = InvokeDynamic      #39:#728     // #39:test:(I)Ljava/util/function/Predicate;
   #728 = NameAndType        #259:#729    // test:(I)Ljava/util/function/Predicate;
   #729 = Utf8               (I)Ljava/util/function/Predicate;
   #730 = InvokeDynamic      #40:#728     // #40:test:(I)Ljava/util/function/Predicate;
   #731 = String             #732         // {} getSpawn(npcId={}) return {}
   #732 = Utf8               {} getSpawn(npcId={}) return {}
   #733 = String             #734         // {} getClosestSpawnLocation() entry player={} npcId={}
   #734 = Utf8               {} getClosestSpawnLocation() entry player={} npcId={}
   #735 = Methodref          #736.#196    // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #736 = Class              #737         // ext/mods/gameserver/model/actor/Player
   #737 = Utf8               ext/mods/gameserver/model/actor/Player
   #738 = String             #739         // {} getClosestSpawnLocation() return null (player null)
   #739 = Utf8               {} getClosestSpawnLocation() return null (player null)
   #740 = Long               9223372036854775807l
   #742 = Methodref          #736.#544    // ext/mods/gameserver/model/actor/Player.getX:()I
   #743 = Methodref          #736.#547    // ext/mods/gameserver/model/actor/Player.getY:()I
   #744 = Methodref          #736.#745    // ext/mods/gameserver/model/actor/Player.getZ:()I
   #745 = NameAndType        #746:#65     // getZ:()I
   #746 = Utf8               getZ
   #747 = InterfaceMethodref #81.#168     // java/util/Set.iterator:()Ljava/util/Iterator;
   #748 = Methodref          #479.#749    // ext/mods/gameserver/model/spawn/NpcMaker.getSpawns:()Ljava/util/List;
   #749 = NameAndType        #750:#477    // getSpawns:()Ljava/util/List;
   #750 = Utf8               getSpawns
   #751 = InterfaceMethodref #752.#168    // java/util/List.iterator:()Ljava/util/Iterator;
   #752 = Class              #753         // java/util/List
   #753 = Utf8               java/util/List
   #754 = Methodref          #590.#567    // ext/mods/gameserver/model/spawn/ASpawn.getNpcId:()I
   #755 = Methodref          #590.#525    // ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #756 = Methodref          #530.#745    // ext/mods/gameserver/model/actor/Npc.getZ:()I
   #757 = Class              #758         // ext/mods/gameserver/model/location/Location
   #758 = Utf8               ext/mods/gameserver/model/location/Location
   #759 = Methodref          #757.#760    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #760 = NameAndType        #25:#761     // "<init>":(III)V
   #761 = Utf8               (III)V
   #762 = Methodref          #12.#763     // ext/mods/gameserver/data/manager/SpawnManager.resolveSpawnLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
   #763 = NameAndType        #764:#765    // resolveSpawnLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
   #764 = Utf8               resolveSpawnLocation
   #765 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
   #766 = Methodref          #757.#544    // ext/mods/gameserver/model/location/Location.getX:()I
   #767 = Methodref          #757.#547    // ext/mods/gameserver/model/location/Location.getY:()I
   #768 = Methodref          #757.#745    // ext/mods/gameserver/model/location/Location.getZ:()I
   #769 = String             #770         // {} getClosestSpawnLocation() return {} (fromNpc={} fromSpawnlist={})
   #770 = Utf8               {} getClosestSpawnLocation() return {} (fromNpc={} fromSpawnlist={})
   #771 = String             #772         // {} resolveSpawnLocation() entry npcId={} hasNpc={}
   #772 = Utf8               {} resolveSpawnLocation() entry npcId={} hasNpc={}
   #773 = Methodref          #774.#775    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #774 = Class              #776         // java/lang/Boolean
   #775 = NameAndType        #70:#777     // valueOf:(Z)Ljava/lang/Boolean;
   #776 = Utf8               java/lang/Boolean
   #777 = Utf8               (Z)Ljava/lang/Boolean;
   #778 = String             #779         // {} resolveSpawnLocation() return {} (from getNpc())
   #779 = Utf8               {} resolveSpawnLocation() return {} (from getNpc())
   #780 = Methodref          #590.#781    // ext/mods/gameserver/model/spawn/ASpawn.getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
   #781 = NameAndType        #782:#783    // getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
   #782 = Utf8               getSpawnData
   #783 = Utf8               ()Lext/mods/gameserver/model/spawn/SpawnData;
   #784 = Methodref          #102.#544    // ext/mods/gameserver/model/spawn/SpawnData.getX:()I
   #785 = Methodref          #102.#547    // ext/mods/gameserver/model/spawn/SpawnData.getY:()I
   #786 = Methodref          #102.#745    // ext/mods/gameserver/model/spawn/SpawnData.getZ:()I
   #787 = String             #788         // {} resolveSpawnLocation() return {} (from spawnData)
   #788 = Utf8               {} resolveSpawnLocation() return {} (from spawnData)
   #789 = Class              #790         // ext/mods/gameserver/model/spawn/MultiSpawn
   #790 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
   #791 = Methodref          #789.#792    // ext/mods/gameserver/model/spawn/MultiSpawn.getCoords:()[[I
   #792 = NameAndType        #793:#794    // getCoords:()[[I
   #793 = Utf8               getCoords
   #794 = Utf8               ()[[I
   #795 = String             #796         // {} resolveSpawnLocation() return {} (from MultiSpawn coords, idx={})
   #796 = Utf8               {} resolveSpawnLocation() return {} (from MultiSpawn coords, idx={})
   #797 = Methodref          #590.#682    // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #798 = Methodref          #686.#745    // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
   #799 = String             #800         // {} resolveSpawnLocation() return {} (from getSpawnLocation())
   #800 = Utf8               {} resolveSpawnLocation() return {} (from getSpawnLocation())
   #801 = String             #802         // {} resolveSpawnLocation() return null (no source)
   #802 = Utf8               {} resolveSpawnLocation() return null (no source)
   #803 = InvokeDynamic      #41:#119     // #41:apply:()Ljava/util/function/Function;
   #804 = InvokeDynamic      #42:#391     // #42:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #805 = InvokeDynamic      #43:#391     // #43:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
   #806 = Fieldref           #807.#808    // ext/mods/gameserver/data/manager/SpawnManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/SpawnManager;
   #807 = Class              #809         // ext/mods/gameserver/data/manager/SpawnManager$SingletonHolder
   #808 = NameAndType        #810:#811    // INSTANCE:Lext/mods/gameserver/data/manager/SpawnManager;
   #809 = Utf8               ext/mods/gameserver/data/manager/SpawnManager$SingletonHolder
   #810 = Utf8               INSTANCE
   #811 = Utf8               Lext/mods/gameserver/data/manager/SpawnManager;
   #812 = Methodref          #524.#813    // ext/mods/gameserver/model/spawn/Spawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #813 = NameAndType        #647:#814    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #814 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #815 = Methodref          #650.#816    // ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
   #816 = NameAndType        #817:#198    // getAlias:()Ljava/lang/String;
   #817 = Utf8               getAlias
   #818 = Methodref          #407.#819    // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #819 = NameAndType        #820:#821    // equalsIgnoreCase:(Ljava/lang/String;)Z
   #820 = Utf8               equalsIgnoreCase
   #821 = Utf8               (Ljava/lang/String;)Z
   #822 = Methodref          #789.#813    // ext/mods/gameserver/model/spawn/MultiSpawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #823 = InterfaceMethodref #752.#115    // java/util/List.stream:()Ljava/util/stream/Stream;
   #824 = Methodref          #789.#567    // ext/mods/gameserver/model/spawn/MultiSpawn.getNpcId:()I
   #825 = Methodref          #479.#826    // ext/mods/gameserver/model/spawn/NpcMaker.getMakerSpawnTime:()Lext/mods/gameserver/enums/MakerSpawnTime;
   #826 = NameAndType        #827:#828    // getMakerSpawnTime:()Lext/mods/gameserver/enums/MakerSpawnTime;
   #827 = Utf8               getMakerSpawnTime
   #828 = Utf8               ()Lext/mods/gameserver/enums/MakerSpawnTime;
   #829 = Methodref          #830.#196    // ext/mods/gameserver/enums/MakerSpawnTime.getName:()Ljava/lang/String;
   #830 = Class              #831         // ext/mods/gameserver/enums/MakerSpawnTime
   #831 = Utf8               ext/mods/gameserver/enums/MakerSpawnTime
   #832 = Methodref          #479.#833    // ext/mods/gameserver/model/spawn/NpcMaker.getMakerSpawnTimeParams:()[Ljava/lang/String;
   #833 = NameAndType        #834:#835    // getMakerSpawnTimeParams:()[Ljava/lang/String;
   #834 = Utf8               getMakerSpawnTimeParams
   #835 = Utf8               ()[Ljava/lang/String;
   #836 = Methodref          #479.#837    // ext/mods/gameserver/model/spawn/NpcMaker.getEvent:()Ljava/lang/String;
   #837 = NameAndType        #838:#198    // getEvent:()Ljava/lang/String;
   #838 = Utf8               getEvent
   #839 = Methodref          #479.#840    // ext/mods/gameserver/model/spawn/NpcMaker.addQuestEvent:(Lext/mods/gameserver/scripting/Quest;)V
   #840 = NameAndType        #841:#842    // addQuestEvent:(Lext/mods/gameserver/scripting/Quest;)V
   #841 = Utf8               addQuestEvent
   #842 = Utf8               (Lext/mods/gameserver/scripting/Quest;)V
   #843 = Methodref          #479.#196    // ext/mods/gameserver/model/spawn/NpcMaker.getName:()Ljava/lang/String;
   #844 = Methodref          #479.#845    // ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
   #845 = NameAndType        #414:#846    // getTerritory:()Lext/mods/commons/geometry/Territory;
   #846 = Utf8               ()Lext/mods/commons/geometry/Territory;
   #847 = Methodref          #402.#848    // ext/mods/commons/geometry/Territory.isInside:(Lext/mods/gameserver/model/location/Location;)Z
   #848 = NameAndType        #849:#850    // isInside:(Lext/mods/gameserver/model/location/Location;)Z
   #849 = Utf8               isInside
   #850 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
   #851 = Methodref          #402.#196    // ext/mods/commons/geometry/Territory.getName:()Ljava/lang/String;
   #852 = String             #853         // territory
   #853 = Utf8               territory
   #854 = InvokeDynamic      #44:#91      // #44:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
   #855 = String             #856         // npcmaker
   #856 = Utf8               npcmaker
   #857 = InvokeDynamic      #45:#858     // #45:accept:(Lext/mods/gameserver/data/manager/SpawnManager;)Ljava/util/function/Consumer;
   #858 = NameAndType        #92:#859     // accept:(Lext/mods/gameserver/data/manager/SpawnManager;)Ljava/util/function/Consumer;
   #859 = Utf8               (Lext/mods/gameserver/data/manager/SpawnManager;)Ljava/util/function/Consumer;
   #860 = Methodref          #12.#861     // ext/mods/gameserver/data/manager/SpawnManager.parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #861 = NameAndType        #862:#863    // parseAttributes:(Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #862 = Utf8               parseAttributes
   #863 = Utf8               (Lorg/w3c/dom/Node;)Lext/mods/commons/data/StatSet;
   #864 = Methodref          #865.#241    // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #865 = Class              #866         // ext/mods/commons/data/StatSet
   #866 = Utf8               ext/mods/commons/data/StatSet
   #867 = Methodref          #12.#868     // ext/mods/gameserver/data/manager/SpawnManager.findTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
   #868 = NameAndType        #869:#415    // findTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
   #869 = Utf8               findTerritory
   #870 = String             #871         // t
   #871 = Utf8               t
   #872 = Methodref          #865.#248    // ext/mods/commons/data/StatSet.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #873 = String             #874         // ban
   #874 = Utf8               ban
   #875 = Methodref          #865.#876    // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #876 = NameAndType        #242:#539    // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #877 = String             #878         // bt
   #878 = Utf8               bt
   #879 = Class              #880         // java/util/HashMap
   #880 = Utf8               java/util/HashMap
   #881 = Methodref          #879.#24     // java/util/HashMap."<init>":()V
   #882 = String             #883         // ai
   #883 = Utf8               ai
   #884 = InvokeDynamic      #46:#885     // #46:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/commons/data/StatSet;Ljava/util/Map;)Ljava/util/function/Consumer;
   #885 = NameAndType        #92:#886     // accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/commons/data/StatSet;Ljava/util/Map;)Ljava/util/function/Consumer;
   #886 = Utf8               (Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/commons/data/StatSet;Ljava/util/Map;)Ljava/util/function/Consumer;
   #887 = String             #888         // aiParams
   #888 = Utf8               aiParams
   #889 = Methodref          #479.#890    // ext/mods/gameserver/model/spawn/NpcMaker."<init>":(Lext/mods/commons/data/StatSet;)V
   #890 = NameAndType        #25:#891     // "<init>":(Lext/mods/commons/data/StatSet;)V
   #891 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #892 = String             #893         // npc
   #893 = Utf8               npc
   #894 = InvokeDynamic      #47:#895     // #47:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;)Ljava/util/function/Consumer;
   #895 = NameAndType        #92:#896     // accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;)Ljava/util/function/Consumer;
   #896 = Utf8               (Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;)Ljava/util/function/Consumer;
   #897 = Methodref          #479.#898    // ext/mods/gameserver/model/spawn/NpcMaker.setSpawns:(Ljava/util/List;)V
   #898 = NameAndType        #899:#900    // setSpawns:(Ljava/util/List;)V
   #899 = Utf8               setSpawns
   #900 = Utf8               (Ljava/util/List;)V
   #901 = InterfaceMethodref #902.#903    // org/w3c/dom/Node.getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #902 = Class              #904         // org/w3c/dom/Node
   #903 = NameAndType        #905:#906    // getAttributes:()Lorg/w3c/dom/NamedNodeMap;
   #904 = Utf8               org/w3c/dom/Node
   #905 = Utf8               getAttributes
   #906 = Utf8               ()Lorg/w3c/dom/NamedNodeMap;
   #907 = String             #908         // id
   #908 = Utf8               id
   #909 = Methodref          #12.#910     // ext/mods/gameserver/data/manager/SpawnManager.parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #910 = NameAndType        #911:#912    // parseInteger:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #911 = Utf8               parseInteger
   #912 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/Integer;
   #913 = Methodref          #67.#914     // java/lang/Integer.intValue:()I
   #914 = NameAndType        #915:#65     // intValue:()I
   #915 = Utf8               intValue
   #916 = String             #917         // NpcTemplate was not found for NPC id {} in NpcMaker name {}.
   #917 = Utf8               NpcTemplate was not found for NPC id {} in NpcMaker name {}.
   #918 = String             #919         // total
   #919 = Utf8               total
   #920 = String             #921         // respawn
   #921 = Utf8               respawn
   #922 = Methodref          #12.#923     // ext/mods/gameserver/data/manager/SpawnManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #923 = NameAndType        #924:#925    // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #924 = Utf8               parseString
   #925 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #926 = Methodref          #927.#928    // ext/mods/commons/lang/StringUtil.getTimeStamp:(Ljava/lang/String;)I
   #927 = Class              #929         // ext/mods/commons/lang/StringUtil
   #928 = NameAndType        #930:#931    // getTimeStamp:(Ljava/lang/String;)I
   #929 = Utf8               ext/mods/commons/lang/StringUtil
   #930 = Utf8               getTimeStamp
   #931 = Utf8               (Ljava/lang/String;)I
   #932 = String             #933         // respawnRand
   #933 = Utf8               respawnRand
   #934 = String             #935         // privates
   #935 = Utf8               privates
   #936 = InvokeDynamic      #48:#91      // #48:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
   #937 = Class              #938         // ext/mods/gameserver/model/memo/SpawnMemo
   #938 = Utf8               ext/mods/gameserver/model/memo/SpawnMemo
   #939 = Methodref          #937.#24     // ext/mods/gameserver/model/memo/SpawnMemo."<init>":()V
   #940 = InvokeDynamic      #49:#941     // #49:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/memo/SpawnMemo;)Ljava/util/function/Consumer;
   #941 = NameAndType        #92:#942     // accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/memo/SpawnMemo;)Ljava/util/function/Consumer;
   #942 = Utf8               (Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/memo/SpawnMemo;)Ljava/util/function/Consumer;
   #943 = String             #944         // pos
   #944 = Utf8               pos
   #945 = Class              #946         // "[[I"
   #946 = Utf8               [[I
   #947 = Methodref          #67.#948     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #948 = NameAndType        #949:#931    // parseInt:(Ljava/lang/String;)I
   #949 = Utf8               parseInt
   #950 = String             #951         // %
   #951 = Utf8               %
   #952 = String             #953         // dbName
   #953 = Utf8               dbName
   #954 = InvokeDynamic      #50:#955     // #50:apply:(Ljava/lang/String;)Ljava/util/function/Function;
   #955 = NameAndType        #120:#956    // apply:(Ljava/lang/String;)Ljava/util/function/Function;
   #956 = Utf8               (Ljava/lang/String;)Ljava/util/function/Function;
   #957 = InterfaceMethodref #61.#958     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #958 = NameAndType        #959:#960    // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #959 = Utf8               computeIfAbsent
   #960 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
   #961 = Methodref          #789.#962    // ext/mods/gameserver/model/spawn/MultiSpawn."<init>":(Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V
   #962 = NameAndType        #25:#963     // "<init>":(Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V
   #963 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;Lext/mods/gameserver/model/actor/template/NpcTemplate;IIILjava/util/List;Lext/mods/gameserver/model/memo/SpawnMemo;[[ILext/mods/gameserver/model/spawn/SpawnData;)V
   #964 = InterfaceMethodref #752.#465    // java/util/List.add:(Ljava/lang/Object;)Z
   #965 = String             #966         // Can\'t create MultiSpawn for maker {}, npc id {}
   #966 = Utf8               Can\'t create MultiSpawn for maker {}, npc id {}
   #967 = Methodref          #18.#968     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #968 = NameAndType        #969:#202    // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #969 = Utf8               error
   #970 = Methodref          #102.#514    // ext/mods/gameserver/model/spawn/SpawnData."<init>":(Ljava/lang/String;)V
   #971 = String             #972         // set
   #972 = Utf8               set
   #973 = InvokeDynamic      #51:#941     // #51:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Lext/mods/gameserver/model/memo/SpawnMemo;)Ljava/util/function/Consumer;
   #974 = Methodref          #12.#975     // ext/mods/gameserver/data/manager/SpawnManager.parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
   #975 = NameAndType        #924:#976    // parseString:(Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
   #976 = Utf8               (Lorg/w3c/dom/NamedNodeMap;Ljava/lang/String;)Ljava/lang/String;
   #977 = String             #978         // val
   #978 = Utf8               val
   #979 = Methodref          #937.#248    // ext/mods/gameserver/model/memo/SpawnMemo.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #980 = String             #981         // private
   #981 = Utf8               private
   #982 = InvokeDynamic      #52:#91      // #52:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
   #983 = Class              #984         // ext/mods/gameserver/model/records/PrivateData
   #984 = Utf8               ext/mods/gameserver/model/records/PrivateData
   #985 = Methodref          #983.#890    // ext/mods/gameserver/model/records/PrivateData."<init>":(Lext/mods/commons/data/StatSet;)V
   #986 = String             #987         // maker
   #987 = Utf8               maker
   #988 = String             #989         // type
   #989 = Utf8               type
   #990 = InvokeDynamic      #53:#991     // #53:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/Map;)Ljava/util/function/Consumer;
   #991 = NameAndType        #92:#992     // accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/Map;)Ljava/util/function/Consumer;
   #992 = Utf8               (Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/Map;)Ljava/util/function/Consumer;
   #993 = String             #994         // @
   #994 = Utf8               @
   #995 = Methodref          #407.#996    // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #996 = NameAndType        #997:#998    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #997 = Utf8               replace
   #998 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #999 = String             #1000        // minZ
  #1000 = Utf8               minZ
  #1001 = String             #1002        // maxZ
  #1002 = Utf8               maxZ
  #1003 = String             #1004        // node
  #1004 = Utf8               node
  #1005 = InvokeDynamic      #54:#91      // #54:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
  #1006 = Methodref          #402.#1007   // ext/mods/commons/geometry/Territory."<init>":(Ljava/lang/String;IILjava/util/List;)V
  #1007 = NameAndType        #25:#1008    // "<init>":(Ljava/lang/String;IILjava/util/List;)V
  #1008 = Utf8               (Ljava/lang/String;IILjava/util/List;)V
  #1009 = String             #1010        // Cannot load territory \"{}\", {}
  #1010 = Utf8               Cannot load territory \"{}\", {}
  #1011 = Methodref          #191.#1012   // java/lang/Exception.getMessage:()Ljava/lang/String;
  #1012 = NameAndType        #1013:#198   // getMessage:()Ljava/lang/String;
  #1013 = Utf8               getMessage
  #1014 = InterfaceMethodref #752.#108    // java/util/List.clear:()V
  #1015 = Class              #1016        // ext/mods/gameserver/model/location/Point2D
  #1016 = Utf8               ext/mods/gameserver/model/location/Point2D
  #1017 = String             #1018        // x
  #1018 = Utf8               x
  #1019 = String             #1020        // y
  #1020 = Utf8               y
  #1021 = Methodref          #1015.#1022  // ext/mods/gameserver/model/location/Point2D."<init>":(II)V
  #1022 = NameAndType        #25:#1023    // "<init>":(II)V
  #1023 = Utf8               (II)V
  #1024 = Fieldref           #2.#1025     // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
  #1025 = NameAndType        #1026:#1027  // DATA_PATH:Ljava/nio/file/Path;
  #1026 = Utf8               DATA_PATH
  #1027 = Utf8               Ljava/nio/file/Path;
  #1028 = String             #1029        // xml/spawnlist/custom
  #1029 = Utf8               xml/spawnlist/custom
  #1030 = InterfaceMethodref #1031.#1032  // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #1031 = Class              #1033        // java/nio/file/Path
  #1032 = NameAndType        #1034:#1035  // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #1033 = Utf8               java/nio/file/Path
  #1034 = Utf8               resolve
  #1035 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #1036 = InterfaceMethodref #1031.#712   // java/nio/file/Path.toString:()Ljava/lang/String;
  #1037 = Class              #1038        // ext/mods/commons/data/xml/IXmlReader
  #1038 = Utf8               ext/mods/commons/data/xml/IXmlReader
  #1039 = Utf8               NPC_SEARCH_TAG
  #1040 = Utf8               ConstantValue
  #1041 = Utf8               LOAD_SPAWN_DATAS
  #1042 = Utf8               TRUNCATE_SPAWN_DATAS
  #1043 = Utf8               SAVE_SPAWN_DATAS
  #1044 = Utf8               UPDATE_SPAWN_DATAS
  #1045 = Utf8               Signature
  #1046 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/model/spawn/SpawnData;>;
  #1047 = Utf8               Ljava/util/Set<Lext/mods/commons/geometry/Territory;>;
  #1048 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/spawn/NpcMaker;>;
  #1049 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/spawn/Spawn;>;
  #1050 = Utf8               Code
  #1051 = Utf8               LineNumberTable
  #1052 = Utf8               LocalVariableTable
  #1053 = Utf8               i
  #1054 = Utf8               safeArgs
  #1055 = Utf8               [Ljava/lang/Object;
  #1056 = Utf8               args
  #1057 = Utf8               StackMapTable
  #1058 = Class              #1055        // "[Ljava/lang/Object;"
  #1059 = Utf8               this
  #1060 = Utf8               parseDocument
  #1061 = Utf8               (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
  #1062 = Utf8               doc
  #1063 = Utf8               Lorg/w3c/dom/Document;
  #1064 = Utf8               path
  #1065 = Utf8               coords
  #1066 = Utf8               Ljava/util/List;
  #1067 = Utf8               LocalVariableTypeTable
  #1068 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;
  #1069 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  #1070 = Utf8               reload
  #1071 = Utf8               e
  #1072 = Utf8               Ljava/lang/Exception;
  #1073 = Utf8               status
  #1074 = Utf8               B
  #1075 = Utf8               data
  #1076 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
  #1077 = Utf8               ps
  #1078 = Utf8               Ljava/sql/PreparedStatement;
  #1079 = Utf8               con
  #1080 = Utf8               Ljava/sql/Connection;
  #1081 = Utf8               (Lext/mods/gameserver/model/spawn/SpawnData;)V
  #1082 = Utf8               rs
  #1083 = Utf8               Ljava/sql/ResultSet;
  #1084 = Utf8               event
  #1085 = Utf8               J
  #1086 = Class              #288         // "[Ljava/lang/String;"
  #1087 = Utf8               cabalWon
  #1088 = Utf8               despawn
  #1089 = Utf8               polygon
  #1090 = Utf8               Lext/mods/commons/geometry/Polygon;
  #1091 = Utf8               triangle
  #1092 = Utf8               Lext/mods/commons/geometry/Triangle;
  #1093 = Utf8               Lext/mods/commons/geometry/Territory;
  #1094 = Utf8               shape
  #1095 = Utf8               Lext/mods/commons/geometry/AShape;
  #1096 = Utf8               names
  #1097 = Utf8               groupedName
  #1098 = Utf8               shapes
  #1099 = Utf8               Ljava/util/Set<Lext/mods/commons/geometry/Triangle;>;
  #1100 = Class              #1101        // ext/mods/commons/geometry/AShape
  #1101 = Utf8               ext/mods/commons/geometry/AShape
  #1102 = Utf8               getNpcMakers
  #1103 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #1104 = Utf8               loc
  #1105 = Utf8               Lext/mods/gameserver/model/location/Location;
  #1106 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/List<Lext/mods/gameserver/model/spawn/NpcMaker;>;
  #1107 = Utf8               getNpcMaker
  #1108 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
  #1109 = Utf8               addQuestEventByName
  #1110 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)V
  #1111 = Utf8               quest
  #1112 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #1113 = Utf8               addQuestEventByEvent
  #1114 = Utf8               message
  #1115 = Utf8               startSpawnTime
  #1116 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
  #1117 = Utf8               time
  #1118 = Utf8               param1
  #1119 = Utf8               param2
  #1120 = Utf8               param3
  #1121 = Utf8               stopSpawnTime
  #1122 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #1123 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;Z)V
  #1124 = Utf8               currentLine
  #1125 = Utf8               writer
  #1126 = Utf8               Ljava/io/BufferedWriter;
  #1127 = Utf8               reader
  #1128 = Utf8               Ljava/io/BufferedReader;
  #1129 = Utf8               tempFile
  #1130 = Utf8               Ljava/io/File;
  #1131 = Utf8               outputDirectory
  #1132 = Utf8               npcMakerName
  #1133 = Utf8               fileName
  #1134 = Utf8               spawnFile
  #1135 = Utf8               spawnId
  #1136 = Utf8               spawnLoc
  #1137 = Utf8               respawnRnd
  #1138 = Utf8               respawnRndString
  #1139 = Utf8               store
  #1140 = Utf8               deleteSpawn
  #1141 = Utf8               inTerritory
  #1142 = Utf8               inNpcMaker
  #1143 = Utf8               needToDelete
  #1144 = Utf8               content
  #1145 = Utf8               Ljava/lang/StringBuilder;
  #1146 = Utf8               line
  #1147 = Utf8               expectedContent
  #1148 = Utf8               file
  #1149 = Utf8               npcId
  #1150 = Utf8               result
  #1151 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #1152 = Utf8               getClosestSpawnLocation
  #1153 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/model/location/Location;
  #1154 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1155 = Utf8               dx
  #1156 = Utf8               dy
  #1157 = Utf8               dz
  #1158 = Utf8               dist
  #1159 = Utf8               nm
  #1160 = Utf8               Lext/mods/gameserver/model/spawn/NpcMaker;
  #1161 = Utf8               player
  #1162 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1163 = Utf8               closestFromNpc
  #1164 = Utf8               bestDistFromNpc
  #1165 = Utf8               closestFromSpawnlist
  #1166 = Utf8               bestDistFromSpawnlist
  #1167 = Utf8               px
  #1168 = Utf8               py
  #1169 = Utf8               pz
  #1170 = Utf8               bestIdx
  #1171 = Utf8               bestDist
  #1172 = Utf8               multi
  #1173 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #1174 = Utf8               spawnData
  #1175 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #1176 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/ASpawn;
  #1177 = Utf8               npcAlias
  #1178 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #1179 = Utf8               lambda$getSpawn$5
  #1180 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1181 = Utf8               s
  #1182 = Utf8               lambda$getSpawn$4
  #1183 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1184 = Utf8               ms
  #1185 = Utf8               lambda$getSpawn$3
  #1186 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1187 = Utf8               lambda$getSpawn$2
  #1188 = Utf8               (ILext/mods/gameserver/model/spawn/Spawn;)Z
  #1189 = Utf8               lambda$getSpawn$1
  #1190 = Utf8               (ILext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1191 = Utf8               lambda$getSpawn$0
  #1192 = Utf8               lambda$stopSpawnTime$0
  #1193 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1194 = Utf8               spawnTimeParams
  #1195 = Utf8               lambda$startSpawnTime$0
  #1196 = Utf8               lambda$despawnEventNpcs$0
  #1197 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1198 = Utf8               lambda$spawnEventNpcs$0
  #1199 = Utf8               lambda$addQuestEventByEvent$1
  #1200 = Utf8               (Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1201 = Utf8               lambda$addQuestEventByEvent$0
  #1202 = Utf8               lambda$addQuestEventByName$1
  #1203 = Utf8               lambda$addQuestEventByName$0
  #1204 = Utf8               lambda$getNpcMaker$0
  #1205 = Utf8               lambda$getNpcMakers$0
  #1206 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1207 = Utf8               m
  #1208 = Utf8               lambda$getTerritory$0
  #1209 = Utf8               (Ljava/lang/String;Lext/mods/commons/geometry/Territory;)Z
  #1210 = Utf8               lambda$parseDocument$0
  #1211 = Utf8               (Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1212 = Utf8               listNode
  #1213 = Utf8               Lorg/w3c/dom/Node;
  #1214 = Utf8               lambda$parseDocument$3
  #1215 = Utf8               (Lorg/w3c/dom/Node;)V
  #1216 = Utf8               npcmakerNode
  #1217 = Utf8               Lext/mods/commons/data/StatSet;
  #1218 = Utf8               banName
  #1219 = Utf8               makerAIParams
  #1220 = Utf8               spawns
  #1221 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #1222 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;
  #1223 = Utf8               lambda$parseDocument$6
  #1224 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1225 = Utf8               npcNode
  #1226 = Utf8               Lorg/w3c/dom/NamedNodeMap;
  #1227 = Utf8               template
  #1228 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1229 = Utf8               respawnDelay
  #1230 = Utf8               respawnRandom
  #1231 = Utf8               privateData
  #1232 = Utf8               spawnMemo
  #1233 = Utf8               Lext/mods/gameserver/model/memo/SpawnMemo;
  #1234 = Utf8               coords2
  #1235 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/records/PrivateData;>;
  #1236 = Class              #1237        // org/w3c/dom/NamedNodeMap
  #1237 = Utf8               org/w3c/dom/NamedNodeMap
  #1238 = Utf8               lambda$parseDocument$11
  #1239 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  #1240 = Utf8               sd
  #1241 = Utf8               lambda$parseDocument$9
  #1242 = Utf8               (Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1243 = Utf8               aiNode
  #1244 = Utf8               lambda$parseDocument$10
  #1245 = Utf8               paramNode
  #1246 = Utf8               paramAttrs
  #1247 = Utf8               lambda$parseDocument$7
  #1248 = Utf8               privatesNode
  #1249 = Utf8               lambda$parseDocument$8
  #1250 = Utf8               privateNode
  #1251 = Utf8               lambda$parseDocument$4
  #1252 = Utf8               (Lext/mods/commons/data/StatSet;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1253 = Utf8               lambda$parseDocument$5
  #1254 = Utf8               (Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1255 = Utf8               lambda$parseDocument$1
  #1256 = Utf8               territoryNode
  #1257 = Utf8               terr
  #1258 = Utf8               lambda$parseDocument$2
  #1259 = Utf8               locationNode
  #1260 = Utf8               <clinit>
  #1261 = Utf8               SourceFile
  #1262 = Utf8               SpawnManager.java
  #1263 = Utf8               NestMembers
  #1264 = Utf8               BootstrapMethods
  #1265 = MethodType         #670         //  (Ljava/lang/Object;)V
  #1266 = MethodHandle       5:#1267      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1267 = Methodref          #12.#1268    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1268 = NameAndType        #1210:#1211  // lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1269 = MethodType         #1215        //  (Lorg/w3c/dom/Node;)V
  #1270 = MethodType         #101         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1271 = MethodHandle       5:#748       // REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.getSpawns:()Ljava/util/List;
  #1272 = MethodType         #1273        //  (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/List;
  #1273 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/List;
  #1274 = MethodHandle       9:#1275      // REF_invokeInterface java/util/Collection.stream:()Ljava/util/stream/Stream;
  #1275 = InterfaceMethodref #167.#115    // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #1276 = MethodType         #1277        //  (Ljava/util/List;)Ljava/util/stream/Stream;
  #1277 = Utf8               (Ljava/util/List;)Ljava/util/stream/Stream;
  #1278 = MethodHandle       5:#1279      // REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.updateSpawnData:()V
  #1279 = Methodref          #789.#1280   // ext/mods/gameserver/model/spawn/MultiSpawn.updateSpawnData:()V
  #1280 = NameAndType        #1281:#26    // updateSpawnData:()V
  #1281 = Utf8               updateSpawnData
  #1282 = MethodType         #1283        //  (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #1283 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  #1284 = MethodHandle       5:#1285      // REF_invokeVirtual ext/mods/gameserver/model/spawn/Spawn.updateSpawnData:()V
  #1285 = Methodref          #524.#1280   // ext/mods/gameserver/model/spawn/Spawn.updateSpawnData:()V
  #1286 = MethodType         #506         //  (Lext/mods/gameserver/model/spawn/Spawn;)V
  #1287 = MethodType         #467         //  (Ljava/lang/Object;)Z
  #1288 = MethodHandle       5:#1289      // REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.isOnStart:()Z
  #1289 = Methodref          #479.#1290   // ext/mods/gameserver/model/spawn/NpcMaker.isOnStart:()Z
  #1290 = NameAndType        #1291:#161   // isOnStart:()Z
  #1291 = Utf8               isOnStart
  #1292 = MethodType         #1293        //  (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1293 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1294 = MethodType         #1295        //  (Ljava/lang/Object;)I
  #1295 = Utf8               (Ljava/lang/Object;)I
  #1296 = MethodHandle       5:#1297      // REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.spawnAll:()I
  #1297 = Methodref          #479.#1298   // ext/mods/gameserver/model/spawn/NpcMaker.spawnAll:()I
  #1298 = NameAndType        #1299:#65    // spawnAll:()I
  #1299 = Utf8               spawnAll
  #1300 = MethodType         #1301        //  (Lext/mods/gameserver/model/spawn/NpcMaker;)I
  #1301 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)I
  #1302 = MethodHandle       5:#1303      // REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.deleteAll:()I
  #1303 = Methodref          #479.#1304   // ext/mods/gameserver/model/spawn/NpcMaker.deleteAll:()I
  #1304 = NameAndType        #1305:#65    // deleteAll:()I
  #1305 = Utf8               deleteAll
  #1306 = MethodHandle       5:#1307      // REF_invokeVirtual ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
  #1307 = Methodref          #524.#1308   // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
  #1308 = NameAndType        #1309:#26    // doDelete:()V
  #1309 = Utf8               doDelete
  #1310 = MethodHandle       6:#1311      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getTerritory$0:(Ljava/lang/String;Lext/mods/commons/geometry/Territory;)Z
  #1311 = Methodref          #12.#1312    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getTerritory$0:(Ljava/lang/String;Lext/mods/commons/geometry/Territory;)Z
  #1312 = NameAndType        #1208:#1209  // lambda$getTerritory$0:(Ljava/lang/String;Lext/mods/commons/geometry/Territory;)Z
  #1313 = MethodType         #1314        //  (Lext/mods/commons/geometry/Territory;)Z
  #1314 = Utf8               (Lext/mods/commons/geometry/Territory;)Z
  #1315 = String             #1316        // grouped_\u0001
  #1316 = Utf8               grouped_\u0001
  #1317 = MethodHandle       6:#1318      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getNpcMakers$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1318 = Methodref          #12.#1319    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getNpcMakers$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1319 = NameAndType        #1205:#1206  // lambda$getNpcMakers$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1320 = MethodHandle       6:#1321      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getNpcMaker$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1321 = Methodref          #12.#1322    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getNpcMaker$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1322 = NameAndType        #1204:#1197  // lambda$getNpcMaker$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1323 = MethodHandle       6:#1324      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1324 = Methodref          #12.#1325    // ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1325 = NameAndType        #1203:#1197  // lambda$addQuestEventByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1326 = MethodHandle       6:#1327      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByName$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1327 = Methodref          #12.#1328    // ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByName$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1328 = NameAndType        #1202:#1200  // lambda$addQuestEventByName$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1329 = MethodType         #1330        //  (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1330 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1331 = MethodHandle       6:#1332      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByEvent$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1332 = Methodref          #12.#1333    // ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByEvent$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1333 = NameAndType        #1201:#1197  // lambda$addQuestEventByEvent$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1334 = MethodHandle       6:#1335      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByEvent$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1335 = Methodref          #12.#1336    // ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByEvent$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1336 = NameAndType        #1199:#1200  // lambda$addQuestEventByEvent$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #1337 = MethodHandle       6:#1338      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$spawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1338 = Methodref          #12.#1339    // ext/mods/gameserver/data/manager/SpawnManager.lambda$spawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1339 = NameAndType        #1198:#1197  // lambda$spawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1340 = MethodHandle       6:#1341      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$despawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1341 = Methodref          #12.#1342    // ext/mods/gameserver/data/manager/SpawnManager.lambda$despawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1342 = NameAndType        #1196:#1197  // lambda$despawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1343 = MethodHandle       6:#1344      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$startSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1344 = Methodref          #12.#1345    // ext/mods/gameserver/data/manager/SpawnManager.lambda$startSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1345 = NameAndType        #1195:#1193  // lambda$startSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1346 = MethodHandle       6:#1347      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$stopSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1347 = Methodref          #12.#1348    // ext/mods/gameserver/data/manager/SpawnManager.lambda$stopSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1348 = NameAndType        #1192:#1193  // lambda$stopSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #1349 = String             #1350        // \u0001_\u0001\u0001
  #1350 = Utf8               \u0001_\u0001\u0001
  #1351 = String             #1352        // \u0001_\u0001\u00011
  #1352 = Utf8               \u0001_\u0001\u00011
  #1353 = String             #1354        // \u0001/\u0001_\u0001_\u0001.xml
  #1354 = Utf8               \u0001/\u0001_\u0001_\u0001.xml
  #1355 = String             #1356        // \u0001;\u0001;\u0001;\u0001
  #1356 = Utf8               \u0001;\u0001;\u0001;\u0001
  #1357 = String             #1358        // \" respawnRand=\"\u0001sec
  #1358 = Utf8               \" respawnRand=\"\u0001sec
  #1359 = String             #1360        // \u0001/\u0001_\u0001_\u0001.tmp
  #1360 = Utf8               \u0001/\u0001_\u0001_\u0001.tmp
  #1361 = String             #1362        // \t<territory name=\"\u0001\" minZ=\"\u0001\" maxZ=\"\u0001\">\n
  #1362 = Utf8               \t<territory name=\"\u0001\" minZ=\"\u0001\" maxZ=\"\u0001\">\n
  #1363 = String             #1364        // \t\t<node x=\"\u0001\" y=\"\u0001\" />\n
  #1364 = Utf8               \t\t<node x=\"\u0001\" y=\"\u0001\" />\n
  #1365 = String             #1366        // \t<npcmaker name=\"\u0001\" territory=\"\u0001\" maximumNpcs=\"1\">\n
  #1366 = Utf8               \t<npcmaker name=\"\u0001\" territory=\"\u0001\" maximumNpcs=\"1\">\n
  #1367 = String             #1368        // \t\t<npc id=\"\u0001\" pos=\"\u0001\" total=\"1\" respawn=\"\u0001sec\u0001\" /> <!-- \u0001 -->\n
  #1368 = Utf8               \t\t<npc id=\"\u0001\" pos=\"\u0001\" total=\"1\" respawn=\"\u0001sec\u0001\" /> <!-- \u0001 -->\n
  #1369 = String             #1370        // \u0001\n
  #1370 = Utf8               \u0001\n
  #1371 = String             #1372        // Could not store spawn in the spawn XML files: \u0001
  #1372 = Utf8               Could not store spawn in the spawn XML files: \u0001
  #1373 = String             #1374        // Spawn \u0001 could not be added to the spawn XML files: \u0001
  #1374 = Utf8               Spawn \u0001 could not be added to the spawn XML files: \u0001
  #1375 = String             #1376        // <territory name=\"\u0001
  #1376 = Utf8               <territory name=\"\u0001
  #1377 = String             #1378        // <npcmaker name=\"\u0001
  #1378 = Utf8               <npcmaker name=\"\u0001
  #1379 = String             #1380        // Could not remove spawn from the spawn XML files: \u0001
  #1380 = Utf8               Could not remove spawn from the spawn XML files: \u0001
  #1381 = String             #1382        // The content of the XML file could not be checked: \u0001
  #1382 = Utf8               The content of the XML file could not be checked: \u0001
  #1383 = MethodHandle       6:#1384      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$0:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1384 = Methodref          #12.#1385    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$0:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1385 = NameAndType        #1191:#1186  // lambda$getSpawn$0:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1386 = MethodType         #1186        //  (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1387 = MethodHandle       6:#1388      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$1:(ILext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1388 = Methodref          #12.#1389    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$1:(ILext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1389 = NameAndType        #1189:#1190  // lambda$getSpawn$1:(ILext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1390 = MethodType         #1391        //  (Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1391 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1392 = MethodHandle       6:#1393      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$2:(ILext/mods/gameserver/model/spawn/Spawn;)Z
  #1393 = Methodref          #12.#1394    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$2:(ILext/mods/gameserver/model/spawn/Spawn;)Z
  #1394 = NameAndType        #1187:#1188  // lambda$getSpawn$2:(ILext/mods/gameserver/model/spawn/Spawn;)Z
  #1395 = MethodType         #1396        //  (Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1396 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1397 = MethodHandle       6:#1398      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$3:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1398 = Methodref          #12.#1399    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$3:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1399 = NameAndType        #1185:#1186  // lambda$getSpawn$3:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  #1400 = MethodHandle       6:#1401      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$4:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1401 = Methodref          #12.#1402    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$4:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1402 = NameAndType        #1182:#1183  // lambda$getSpawn$4:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  #1403 = MethodHandle       6:#1404      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$5:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1404 = Methodref          #12.#1405    // ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$5:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1405 = NameAndType        #1179:#1180  // lambda$getSpawn$5:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1406 = MethodHandle       5:#1407      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1407 = Methodref          #12.#1408    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1408 = NameAndType        #1255:#1211  // lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1409 = MethodHandle       5:#1410      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #1410 = Methodref          #12.#1411    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #1411 = NameAndType        #1214:#1215  // lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
  #1412 = MethodHandle       5:#1413      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1413 = Methodref          #12.#1414    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1414 = NameAndType        #1251:#1252  // lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1415 = MethodHandle       5:#1416      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1416 = Methodref          #12.#1417    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1417 = NameAndType        #1223:#1224  // lambda$parseDocument$6:(Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1418 = MethodHandle       5:#1419      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1419 = Methodref          #12.#1420    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1420 = NameAndType        #1247:#1211  // lambda$parseDocument$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1421 = MethodHandle       5:#1422      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$9:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1422 = Methodref          #12.#1423    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$9:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1423 = NameAndType        #1241:#1242  // lambda$parseDocument$9:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1424 = MethodHandle       6:#1425      // REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$11:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  #1425 = Methodref          #12.#1426    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$11:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  #1426 = NameAndType        #1238:#1239  // lambda$parseDocument$11:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  #1427 = MethodType         #1069        //  (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  #1428 = MethodHandle       5:#1429      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$10:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1429 = Methodref          #12.#1430    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$10:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1430 = NameAndType        #1244:#1242  // lambda$parseDocument$10:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
  #1431 = MethodHandle       5:#1432      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1432 = Methodref          #12.#1433    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1433 = NameAndType        #1249:#1211  // lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1434 = MethodHandle       5:#1435      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$5:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1435 = Methodref          #12.#1436    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$5:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1436 = NameAndType        #1253:#1254  // lambda$parseDocument$5:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
  #1437 = MethodHandle       5:#1438      // REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1438 = Methodref          #12.#1439    // ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1439 = NameAndType        #1258:#1211  // lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
  #1440 = MethodHandle       6:#1441      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1441 = Methodref          #1442.#1443  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1442 = Class              #1444        // java/lang/invoke/LambdaMetafactory
  #1443 = NameAndType        #1445:#1446  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1444 = Utf8               java/lang/invoke/LambdaMetafactory
  #1445 = Utf8               metafactory
  #1446 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1447 = MethodHandle       6:#1448      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1448 = Methodref          #1449.#1450  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1449 = Class              #1451        // java/lang/invoke/StringConcatFactory
  #1450 = NameAndType        #424:#1452   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1451 = Utf8               java/lang/invoke/StringConcatFactory
  #1452 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1453 = Utf8               InnerClasses
  #1454 = Class              #1455        // java/util/concurrent/ConcurrentHashMap$KeySetView
  #1455 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #1456 = Utf8               KeySetView
  #1457 = Utf8               SingletonHolder
  #1458 = Class              #1459        // java/lang/invoke/MethodHandles$Lookup
  #1459 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1460 = Class              #1461        // java/lang/invoke/MethodHandles
  #1461 = Utf8               java/lang/invoke/MethodHandles
  #1462 = Utf8               Lookup
{
  public ext.mods.gameserver.data.manager.SpawnManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #23                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #27                 // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #29                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #30                 // Field _spawnData:Ljava/util/Map;
        15: aload_0
        16: invokestatic  #34                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        19: putfield      #38                 // Field _territories:Ljava/util/Set;
        22: aload_0
        23: invokestatic  #34                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        26: putfield      #42                 // Field _makers:Ljava/util/Set;
        29: aload_0
        30: invokestatic  #34                 // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
        33: putfield      #45                 // Field _spawns:Ljava/util/Set;
        36: aload_0
        37: iconst_0
        38: putfield      #48                 // Field _dynamicGroupId:I
        41: aload_0
        42: invokevirtual #52                 // Method load:()V
        45: return
      LineNumberTable:
        line 106: 0
        line 97: 4
        line 99: 15
        line 100: 22
        line 101: 29
        line 103: 36
        line 107: 41
        line 108: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/data/manager/SpawnManager;

  public void load();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #55                 // Method loadSpawnData:()V
         4: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         7: ldc           #58                 // String Loaded {} spawn data.
         9: iconst_1
        10: anewarray     #7                  // class java/lang/Object
        13: dup
        14: iconst_0
        15: aload_0
        16: getfield      #30                 // Field _spawnData:Ljava/util/Map;
        19: invokeinterface #60,  1           // InterfaceMethod java/util/Map.size:()I
        24: invokestatic  #66                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        27: aastore
        28: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        31: aload_0
        32: ldc           #72                 // String xml/spawnlist/
        34: invokevirtual #74                 // Method parseDataFile:(Ljava/lang/String;)V
        37: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        40: ldc           #78                 // String Loaded {} territories.
        42: iconst_1
        43: anewarray     #7                  // class java/lang/Object
        46: dup
        47: iconst_0
        48: aload_0
        49: getfield      #38                 // Field _territories:Ljava/util/Set;
        52: invokeinterface #80,  1           // InterfaceMethod java/util/Set.size:()I
        57: invokestatic  #66                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        60: aastore
        61: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        64: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        67: ldc           #83                 // String Loaded {} NPC makers.
        69: iconst_1
        70: anewarray     #7                  // class java/lang/Object
        73: dup
        74: iconst_0
        75: aload_0
        76: getfield      #42                 // Field _makers:Ljava/util/Set;
        79: invokeinterface #80,  1           // InterfaceMethod java/util/Set.size:()I
        84: invokestatic  #66                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        87: aastore
        88: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        91: return
      LineNumberTable:
        line 113: 0
        line 114: 4
        line 116: 31
        line 117: 37
        line 118: 64
        line 119: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      92     0  this   Lext/mods/gameserver/data/manager/SpawnManager;

  public void parseDocument(org.w3c.dom.Document, java.nio.file.Path);
    descriptor: (Lorg/w3c/dom/Document;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: new           #85                 // class java/util/ArrayList
         3: dup
         4: invokespecial #87                 // Method java/util/ArrayList."<init>":()V
         7: astore_3
         8: aload_0
         9: aload_1
        10: ldc           #88                 // String list
        12: aload_0
        13: aload_3
        14: invokedynamic #90,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/data/manager/SpawnManager;Ljava/util/List;)Ljava/util/function/Consumer;
        19: invokevirtual #94                 // Method forEach:(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/util/function/Consumer;)V
        22: return
      LineNumberTable:
        line 124: 0
        line 125: 8
        line 262: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      23     1   doc   Lorg/w3c/dom/Document;
            0      23     2  path   Ljava/nio/file/Path;
            8      15     3 coords   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      15     3 coords   Ljava/util/List<Lext/mods/gameserver/model/location/Point2D;>;

  public ext.mods.gameserver.model.spawn.SpawnData getSpawnData(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #30                 // Field _spawnData:Ljava/util/Map;
         4: aload_1
         5: invokeinterface #98,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #102                // class ext/mods/gameserver/model/spawn/SpawnData
        13: areturn
      LineNumberTable:
        line 266: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      14     1  name   Ljava/lang/String;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #104                // Method save:()V
         4: aload_0
         5: getfield      #30                 // Field _spawnData:Ljava/util/Map;
         8: invokeinterface #107,  1          // InterfaceMethod java/util/Map.clear:()V
        13: aload_0
        14: getfield      #38                 // Field _territories:Ljava/util/Set;
        17: invokeinterface #110,  1          // InterfaceMethod java/util/Set.clear:()V
        22: aload_0
        23: getfield      #42                 // Field _makers:Ljava/util/Set;
        26: invokeinterface #110,  1          // InterfaceMethod java/util/Set.clear:()V
        31: aload_0
        32: getfield      #45                 // Field _spawns:Ljava/util/Set;
        35: invokeinterface #110,  1          // InterfaceMethod java/util/Set.clear:()V
        40: aload_0
        41: invokevirtual #52                 // Method load:()V
        44: aload_0
        45: invokevirtual #111                // Method spawn:()V
        48: return
      LineNumberTable:
        line 274: 0
        line 276: 4
        line 277: 13
        line 278: 22
        line 279: 31
        line 281: 40
        line 282: 44
        line 283: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/data/manager/SpawnManager;

  public void save();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: invokedynamic #118,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        14: invokeinterface #122,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        19: invokedynamic #128,  0            // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        24: invokeinterface #129,  2          // InterfaceMethod java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        29: invokedynamic #132,  0            // InvokeDynamic #3:accept:()Ljava/util/function/Consumer;
        34: invokeinterface #135,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        39: aload_0
        40: getfield      #45                 // Field _spawns:Ljava/util/Set;
        43: invokedynamic #138,  0            // InvokeDynamic #4:accept:()Ljava/util/function/Consumer;
        48: invokeinterface #139,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        53: invokestatic  #140                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        56: astore_1
        57: aload_1
        58: ldc           #146                // String TRUNCATE spawn_data
        60: invokeinterface #148,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        65: astore_2
        66: aload_1
        67: ldc           #154                // String INSERT INTO spawn_data (name, status, current_hp, current_mp, loc_x, loc_y, loc_z, heading, db_value, respawn_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        69: invokeinterface #148,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        74: astore_3
        75: aload_2
        76: invokeinterface #156,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        81: pop
        82: aload_0
        83: getfield      #30                 // Field _spawnData:Ljava/util/Map;
        86: invokeinterface #162,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        91: invokeinterface #166,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        96: astore        4
        98: aload         4
       100: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       105: ifeq          177
       108: aload         4
       110: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       115: checkcast     #102                // class ext/mods/gameserver/model/spawn/SpawnData
       118: astore        5
       120: aload         5
       122: invokevirtual #181                // Method ext/mods/gameserver/model/spawn/SpawnData.getStatus:()B
       125: istore        6
       127: iload         6
       129: ifge          135
       132: goto          98
       135: aload         5
       137: aload_3
       138: invokevirtual #185                // Method ext/mods/gameserver/model/spawn/SpawnData.save:(Ljava/sql/PreparedStatement;)V
       141: aload_3
       142: invokeinterface #188,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
       147: goto          174
       150: astore        7
       152: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       155: ldc           #193                // String Couldn\'t save spawn data for name \"{}\".
       157: aload         7
       159: iconst_1
       160: anewarray     #7                  // class java/lang/Object
       163: dup
       164: iconst_0
       165: aload         5
       167: invokevirtual #195                // Method ext/mods/gameserver/model/spawn/SpawnData.getName:()Ljava/lang/String;
       170: aastore
       171: invokevirtual #199                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       174: goto          98
       177: aload_3
       178: invokeinterface #203,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       183: pop
       184: aload_3
       185: ifnull        224
       188: aload_3
       189: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       194: goto          224
       197: astore        4
       199: aload_3
       200: ifnull        221
       203: aload_3
       204: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       209: goto          221
       212: astore        5
       214: aload         4
       216: aload         5
       218: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       221: aload         4
       223: athrow
       224: aload_2
       225: ifnull        261
       228: aload_2
       229: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       234: goto          261
       237: astore_3
       238: aload_2
       239: ifnull        259
       242: aload_2
       243: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       248: goto          259
       251: astore        4
       253: aload_3
       254: aload         4
       256: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       259: aload_3
       260: athrow
       261: aload_1
       262: ifnull        296
       265: aload_1
       266: invokeinterface #216,  1          // InterfaceMethod java/sql/Connection.close:()V
       271: goto          296
       274: astore_2
       275: aload_1
       276: ifnull        294
       279: aload_1
       280: invokeinterface #216,  1          // InterfaceMethod java/sql/Connection.close:()V
       285: goto          294
       288: astore_3
       289: aload_2
       290: aload_3
       291: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       294: aload_2
       295: athrow
       296: goto          309
       299: astore_1
       300: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       303: ldc           #217                // String Couldn\'t save spawn data.
       305: aload_1
       306: invokevirtual #219                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       309: return
      Exception table:
         from    to  target type
           135   147   150   Class java/lang/Exception
            75   184   197   Class java/lang/Throwable
           203   209   212   Class java/lang/Throwable
            66   224   237   Class java/lang/Throwable
           242   248   251   Class java/lang/Throwable
            57   261   274   Class java/lang/Throwable
           279   285   288   Class java/lang/Throwable
            53   296   299   Class java/lang/Exception
      LineNumberTable:
        line 290: 0
        line 291: 39
        line 293: 53
        line 294: 57
        line 295: 66
        line 297: 75
        line 299: 82
        line 301: 120
        line 302: 127
        line 303: 132
        line 307: 135
        line 309: 141
        line 314: 147
        line 311: 150
        line 313: 152
        line 315: 174
        line 317: 177
        line 318: 184
        line 293: 197
        line 318: 224
        line 293: 237
        line 318: 261
        line 293: 274
        line 322: 296
        line 319: 299
        line 321: 300
        line 323: 309
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          152      22     7     e   Ljava/lang/Exception;
          127      47     6 status   B
          120      54     5  data   Lext/mods/gameserver/model/spawn/SpawnData;
           75     149     3    ps   Ljava/sql/PreparedStatement;
           66     195     2 delete   Ljava/sql/PreparedStatement;
           57     239     1   con   Ljava/sql/Connection;
          300       9     1     e   Ljava/lang/Exception;
            0     310     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
      StackMapTable: number_of_entries = 19
        frame_type = 255 /* full_frame */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/util/Iterator ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/spawn/SpawnData, int ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 249 /* chop */
          offset_delta = 23
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void save(ext.mods.gameserver.model.spawn.SpawnData);
    descriptor: (Lext/mods/gameserver/model/spawn/SpawnData;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=2
         0: invokestatic  #140                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_2
         4: aload_2
         5: ldc           #222                // String UPDATE spawn_data SET name = ?, status = ?, current_hp = ?, current_mp = ?, loc_x = ?, loc_y = ?, loc_z = ?, heading = ?, db_value = ?, respawn_time =? WHERE name=?
         7: invokeinterface #148,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_3
        13: aload_1
        14: invokevirtual #181                // Method ext/mods/gameserver/model/spawn/SpawnData.getStatus:()B
        17: istore        4
        19: iload         4
        21: ifge          45
        24: aload_3
        25: ifnull        34
        28: aload_3
        29: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        34: aload_2
        35: ifnull        44
        38: aload_2
        39: invokeinterface #216,  1          // InterfaceMethod java/sql/Connection.close:()V
        44: return
        45: aload_1
        46: aload_3
        47: invokevirtual #185                // Method ext/mods/gameserver/model/spawn/SpawnData.save:(Ljava/sql/PreparedStatement;)V
        50: aload_3
        51: bipush        11
        53: aload_1
        54: invokevirtual #195                // Method ext/mods/gameserver/model/spawn/SpawnData.getName:()Ljava/lang/String;
        57: invokeinterface #224,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        62: aload_3
        63: invokeinterface #188,  1          // InterfaceMethod java/sql/PreparedStatement.addBatch:()V
        68: goto          94
        71: astore        5
        73: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        76: ldc           #193                // String Couldn\'t save spawn data for name \"{}\".
        78: aload         5
        80: iconst_1
        81: anewarray     #7                  // class java/lang/Object
        84: dup
        85: iconst_0
        86: aload_1
        87: invokevirtual #195                // Method ext/mods/gameserver/model/spawn/SpawnData.getName:()Ljava/lang/String;
        90: aastore
        91: invokevirtual #199                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        94: aload_3
        95: invokeinterface #203,  1          // InterfaceMethod java/sql/PreparedStatement.executeBatch:()[I
       100: pop
       101: aload_3
       102: ifnull        141
       105: aload_3
       106: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       111: goto          141
       114: astore        4
       116: aload_3
       117: ifnull        138
       120: aload_3
       121: invokeinterface #207,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       126: goto          138
       129: astore        5
       131: aload         4
       133: aload         5
       135: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       138: aload         4
       140: athrow
       141: aload_2
       142: ifnull        178
       145: aload_2
       146: invokeinterface #216,  1          // InterfaceMethod java/sql/Connection.close:()V
       151: goto          178
       154: astore_3
       155: aload_2
       156: ifnull        176
       159: aload_2
       160: invokeinterface #216,  1          // InterfaceMethod java/sql/Connection.close:()V
       165: goto          176
       168: astore        4
       170: aload_3
       171: aload         4
       173: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       176: aload_3
       177: athrow
       178: goto          191
       181: astore_2
       182: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       185: ldc           #217                // String Couldn\'t save spawn data.
       187: aload_2
       188: invokevirtual #219                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       191: return
      Exception table:
         from    to  target type
            45    68    71   Class java/lang/Exception
            13    24   114   Class java/lang/Throwable
            45   101   114   Class java/lang/Throwable
           120   126   129   Class java/lang/Throwable
             4    34   154   Class java/lang/Throwable
            45   141   154   Class java/lang/Throwable
           159   165   168   Class java/lang/Throwable
             0    44   181   Class java/lang/Exception
            45   178   181   Class java/lang/Exception
      LineNumberTable:
        line 327: 0
        line 328: 4
        line 330: 13
        line 331: 19
        line 346: 24
        line 332: 44
        line 336: 45
        line 337: 50
        line 338: 62
        line 343: 68
        line 340: 71
        line 342: 73
        line 345: 94
        line 346: 101
        line 327: 114
        line 346: 141
        line 327: 154
        line 350: 178
        line 347: 181
        line 349: 182
        line 351: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           73      21     5     e   Ljava/lang/Exception;
           19      82     4 status   B
           13     128     3    ps   Ljava/sql/PreparedStatement;
            4     174     2   con   Ljava/sql/Connection;
          182       9     2     e   Ljava/lang/Exception;
            0     192     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0     192     1  data   Lext/mods/gameserver/model/spawn/SpawnData;
      StackMapTable: number_of_entries = 15
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, int ]
        frame_type = 9 /* same */
        frame_type = 0 /* same */
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 22 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/SpawnData, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/SpawnData, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/SpawnData, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */

  public void spawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=1
         0: getstatic     #254                // Field ext/mods/Config.NO_SPAWNS:Z
         3: ifeq          7
         6: return
         7: aload_0
         8: getfield      #42                 // Field _makers:Ljava/util/Set;
        11: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        16: invokedynamic #257,  0            // InvokeDynamic #5:test:()Ljava/util/function/Predicate;
        21: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        26: invokedynamic #265,  0            // InvokeDynamic #6:applyAsInt:()Ljava/util/function/ToIntFunction;
        31: invokeinterface #269,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        36: invokeinterface #273,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        41: i2l
        42: lstore_1
        43: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        46: ldc_w         #278                // String Spawned {} NPCs.
        49: iconst_1
        50: anewarray     #7                  // class java/lang/Object
        53: dup
        54: iconst_0
        55: lload_1
        56: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        59: aastore
        60: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        63: getstatic     #285                // Field ext/mods/Config.SPAWN_EVENTS:[Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: arraylength
        69: istore        4
        71: iconst_0
        72: istore        5
        74: iload         5
        76: iload         4
        78: if_icmpge     101
        81: aload_3
        82: iload         5
        84: aaload
        85: astore        6
        87: aload_0
        88: aload         6
        90: iconst_1
        91: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
        94: pop2
        95: iinc          5, 1
        98: goto          74
       101: aload_0
       102: invokevirtual #293                // Method notifySevenSignsChange:()V
       105: return
      LineNumberTable:
        line 380: 0
        line 381: 6
        line 383: 7
        line 384: 43
        line 386: 63
        line 387: 87
        line 386: 95
        line 389: 101
        line 390: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           87       8     6 event   Ljava/lang/String;
            0     106     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
           43      63     1 total   J
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, long, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 26

  public void notifySevenSignsChange();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=1
         0: aload_0
         1: ldc_w         #296                // String ssq_seal1_none
         4: iconst_0
         5: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
         8: pop2
         9: aload_0
        10: ldc_w         #301                // String ssq_seal1_dawn
        13: iconst_0
        14: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
        17: pop2
        18: aload_0
        19: ldc_w         #303                // String ssq_seal1_twilight
        22: iconst_0
        23: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
        26: pop2
        27: aload_0
        28: ldc_w         #305                // String ssq_seal2_none
        31: iconst_0
        32: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
        35: pop2
        36: aload_0
        37: ldc_w         #307                // String ssq_seal2_dawn
        40: iconst_0
        41: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
        44: pop2
        45: aload_0
        46: ldc_w         #309                // String ssq_seal2_twilight
        49: iconst_0
        50: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
        53: pop2
        54: aload_0
        55: ldc_w         #311                // String ssq_event
        58: iconst_0
        59: invokevirtual #298                // Method despawnEventNpcs:(Ljava/lang/String;Z)J
        62: pop2
        63: getstatic     #313                // Field ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$PeriodType:[I
        66: invokestatic  #319                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
        69: invokevirtual #325                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getCurrentPeriod:()Lext/mods/gameserver/enums/PeriodType;
        72: invokevirtual #329                // Method ext/mods/gameserver/enums/PeriodType.ordinal:()I
        75: iaload
        76: tableswitch   { // 1 to 4

                       1: 108

                       2: 108

                       3: 140

                       4: 140
                 default: 571
            }
       108: aload_0
       109: ldc_w         #311                // String ssq_event
       112: iconst_0
       113: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       116: lstore_1
       117: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       120: ldc_w         #334                // String Spawned {} Seven Signs - Event NPCs.
       123: iconst_1
       124: anewarray     #7                  // class java/lang/Object
       127: dup
       128: iconst_0
       129: lload_1
       130: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       133: aastore
       134: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       137: goto          571
       140: invokestatic  #319                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       143: invokevirtual #336                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getWinningCabal:()Lext/mods/gameserver/enums/CabalType;
       146: astore_3
       147: getstatic     #340                // Field ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
       150: invokestatic  #319                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       153: getstatic     #343                // Field ext/mods/gameserver/enums/SealType.AVARICE:Lext/mods/gameserver/enums/SealType;
       156: invokevirtual #349                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       159: invokevirtual #353                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
       162: iaload
       163: tableswitch   { // 1 to 3

                       1: 188

                       2: 220

                       3: 291
                 default: 359
            }
       188: aload_0
       189: ldc_w         #296                // String ssq_seal1_none
       192: iconst_0
       193: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       196: lstore_1
       197: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       200: ldc_w         #356                // String Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal none.
       203: iconst_1
       204: anewarray     #7                  // class java/lang/Object
       207: dup
       208: iconst_0
       209: lload_1
       210: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       213: aastore
       214: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       217: goto          359
       220: aload_3
       221: getstatic     #358                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       224: if_acmpne     259
       227: aload_0
       228: ldc_w         #303                // String ssq_seal1_twilight
       231: iconst_0
       232: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       235: lstore_1
       236: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       239: ldc_w         #362                // String Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dusk.
       242: iconst_1
       243: anewarray     #7                  // class java/lang/Object
       246: dup
       247: iconst_0
       248: lload_1
       249: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       252: aastore
       253: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       256: goto          359
       259: aload_0
       260: ldc_w         #296                // String ssq_seal1_none
       263: iconst_0
       264: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       267: lstore_1
       268: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       271: ldc_w         #364                // String Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dawn, seal cabal Dusk.
       274: iconst_1
       275: anewarray     #7                  // class java/lang/Object
       278: dup
       279: iconst_0
       280: lload_1
       281: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       284: aastore
       285: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       288: goto          359
       291: aload_3
       292: getstatic     #366                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       295: if_acmpne     330
       298: aload_0
       299: ldc_w         #301                // String ssq_seal1_dawn
       302: iconst_0
       303: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       306: lstore_1
       307: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       310: ldc_w         #369                // String Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dawn.
       313: iconst_1
       314: anewarray     #7                  // class java/lang/Object
       317: dup
       318: iconst_0
       319: lload_1
       320: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       323: aastore
       324: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       327: goto          359
       330: aload_0
       331: ldc_w         #296                // String ssq_seal1_none
       334: iconst_0
       335: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       338: lstore_1
       339: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       342: ldc_w         #371                // String Spawned {} Seven Signs - Seal of Avarice NPCs, winning cabal Dusk, seal cabal Dawn.
       345: iconst_1
       346: anewarray     #7                  // class java/lang/Object
       349: dup
       350: iconst_0
       351: lload_1
       352: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       355: aastore
       356: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       359: getstatic     #340                // Field ext/mods/gameserver/data/manager/SpawnManager$1.$SwitchMap$ext$mods$gameserver$enums$CabalType:[I
       362: invokestatic  #319                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       365: getstatic     #373                // Field ext/mods/gameserver/enums/SealType.GNOSIS:Lext/mods/gameserver/enums/SealType;
       368: invokevirtual #349                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       371: invokevirtual #353                // Method ext/mods/gameserver/enums/CabalType.ordinal:()I
       374: iaload
       375: tableswitch   { // 1 to 3

                       1: 400

                       2: 432

                       3: 503
                 default: 571
            }
       400: aload_0
       401: ldc_w         #305                // String ssq_seal2_none
       404: iconst_0
       405: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       408: lstore_1
       409: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       412: ldc_w         #376                // String Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal none.
       415: iconst_1
       416: anewarray     #7                  // class java/lang/Object
       419: dup
       420: iconst_0
       421: lload_1
       422: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       425: aastore
       426: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       429: goto          571
       432: aload_3
       433: getstatic     #358                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       436: if_acmpne     471
       439: aload_0
       440: ldc_w         #309                // String ssq_seal2_twilight
       443: iconst_0
       444: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       447: lstore_1
       448: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       451: ldc_w         #378                // String Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dusk.
       454: iconst_1
       455: anewarray     #7                  // class java/lang/Object
       458: dup
       459: iconst_0
       460: lload_1
       461: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       464: aastore
       465: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       468: goto          571
       471: aload_0
       472: ldc_w         #305                // String ssq_seal2_none
       475: iconst_0
       476: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       479: lstore_1
       480: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       483: ldc_w         #380                // String Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dawn, seal cabal Dusk.
       486: iconst_1
       487: anewarray     #7                  // class java/lang/Object
       490: dup
       491: iconst_0
       492: lload_1
       493: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       496: aastore
       497: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       500: goto          571
       503: aload_3
       504: getstatic     #366                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       507: if_acmpne     542
       510: aload_0
       511: ldc_w         #307                // String ssq_seal2_dawn
       514: iconst_0
       515: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       518: lstore_1
       519: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       522: ldc_w         #382                // String Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dawn.
       525: iconst_1
       526: anewarray     #7                  // class java/lang/Object
       529: dup
       530: iconst_0
       531: lload_1
       532: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       535: aastore
       536: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       539: goto          571
       542: aload_0
       543: ldc_w         #305                // String ssq_seal2_none
       546: iconst_0
       547: invokevirtual #289                // Method spawnEventNpcs:(Ljava/lang/String;Z)J
       550: lstore_1
       551: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       554: ldc_w         #384                // String Spawned {} Seven Signs - Seal of Gnosis NPCs, winning cabal Dusk, seal cabal Dawn.
       557: iconst_1
       558: anewarray     #7                  // class java/lang/Object
       561: dup
       562: iconst_0
       563: lload_1
       564: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       567: aastore
       568: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       571: return
      LineNumberTable:
        line 398: 0
        line 399: 9
        line 400: 18
        line 402: 27
        line 403: 36
        line 404: 45
        line 406: 54
        line 408: 63
        line 411: 108
        line 412: 117
        line 413: 137
        line 416: 140
        line 418: 147
        line 421: 188
        line 422: 197
        line 423: 217
        line 426: 220
        line 428: 227
        line 429: 236
        line 433: 259
        line 434: 268
        line 436: 288
        line 439: 291
        line 441: 298
        line 442: 307
        line 446: 330
        line 447: 339
        line 452: 359
        line 455: 400
        line 456: 409
        line 457: 429
        line 460: 432
        line 462: 439
        line 463: 448
        line 467: 471
        line 468: 480
        line 470: 500
        line 473: 503
        line 475: 510
        line 476: 519
        line 480: 542
        line 481: 551
        line 487: 571
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          117      23     1 spawn   J
          197      23     1 spawn   J
          236      23     1 spawn   J
          268      23     1 spawn   J
          307      23     1 spawn   J
          339      20     1 spawn   J
          409      23     1 spawn   J
          448      23     1 spawn   J
          480      23     1 spawn   J
          519      23     1 spawn   J
          551      20     1 spawn   J
          147     424     3 cabalWon   Lext/mods/gameserver/enums/CabalType;
            0     572     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
      StackMapTable: number_of_entries = 14
        frame_type = 251 /* same_frame_extended */
          offset_delta = 108
        frame_type = 31 /* same */
        frame_type = 254 /* append */
          offset_delta = 47
          locals = [ top, top, class ext/mods/gameserver/enums/CabalType ]
        frame_type = 31 /* same */
        frame_type = 38 /* same */
        frame_type = 31 /* same */
        frame_type = 38 /* same */
        frame_type = 28 /* same */
        frame_type = 40 /* same */
        frame_type = 31 /* same */
        frame_type = 38 /* same */
        frame_type = 31 /* same */
        frame_type = 38 /* same */
        frame_type = 248 /* chop */
          offset_delta = 28

  public final void despawn();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: invokedynamic #386,  0            // InvokeDynamic #7:applyAsInt:()Ljava/util/function/ToIntFunction;
        14: invokeinterface #269,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        19: invokeinterface #273,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        24: i2l
        25: lstore_1
        26: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        29: ldc_w         #387                // String Despawned {} NPCs.
        32: iconst_1
        33: anewarray     #7                  // class java/lang/Object
        36: dup
        37: iconst_0
        38: lload_1
        39: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        42: aastore
        43: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        46: aload_0
        47: getfield      #45                 // Field _spawns:Ljava/util/Set;
        50: invokedynamic #389,  0            // InvokeDynamic #8:accept:()Ljava/util/function/Consumer;
        55: invokeinterface #139,  2          // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        60: return
      LineNumberTable:
        line 494: 0
        line 495: 26
        line 497: 46
        line 498: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
           26      35     1 total   J

  public final ext.mods.commons.geometry.Territory getTerritory(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #38                 // Field _territories:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #390,  0            // InvokeDynamic #9:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #393,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #397                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #402                // class ext/mods/commons/geometry/Territory
        32: areturn
      LineNumberTable:
        line 506: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      33     1  name   Ljava/lang/String;

  public final java.util.List<ext.mods.gameserver.model.spawn.NpcMaker> getNpcMakers(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #471,  0            // InvokeDynamic #11:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
        15: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #474,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 559: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      26     1   loc   Lext/mods/gameserver/model/location/Location;
    Signature: #1106                        // (Lext/mods/gameserver/model/location/Location;)Ljava/util/List<Lext/mods/gameserver/model/spawn/NpcMaker;>;

  public final ext.mods.gameserver.model.spawn.NpcMaker getNpcMaker(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #478,  0            // InvokeDynamic #12:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #393,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        25: aconst_null
        26: invokevirtual #397                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        29: checkcast     #479                // class ext/mods/gameserver/model/spawn/NpcMaker
        32: areturn
      LineNumberTable:
        line 568: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      33     1  name   Ljava/lang/String;

  public final void addQuestEventByName(java.lang.String, ext.mods.gameserver.scripting.Quest);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #481,  0            // InvokeDynamic #13:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: aload_2
        21: invokedynamic #482,  0            // InvokeDynamic #14:accept:(Lext/mods/gameserver/scripting/Quest;)Ljava/util/function/Consumer;
        26: invokeinterface #135,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        31: return
      LineNumberTable:
        line 578: 0
        line 579: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      32     1  name   Ljava/lang/String;
            0      32     2 quest   Lext/mods/gameserver/scripting/Quest;

  public final void addQuestEventByEvent(java.lang.String, ext.mods.gameserver.scripting.Quest);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_1
        10: invokedynamic #485,  0            // InvokeDynamic #15:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        15: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: aload_2
        21: invokedynamic #486,  0            // InvokeDynamic #16:accept:(Lext/mods/gameserver/scripting/Quest;)Ljava/util/function/Consumer;
        26: invokeinterface #135,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        31: return
      LineNumberTable:
        line 588: 0
        line 589: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      32     1 event   Ljava/lang/String;
            0      32     2 quest   Lext/mods/gameserver/scripting/Quest;

  public final long spawnEventNpcs(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=5, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #487                // Method java/lang/String.length:()I
         8: ifne          13
        11: lconst_0
        12: lreturn
        13: aload_0
        14: getfield      #42                 // Field _makers:Ljava/util/Set;
        17: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        22: aload_1
        23: invokedynamic #490,  0            // InvokeDynamic #17:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        28: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        33: invokedynamic #265,  0            // InvokeDynamic #6:applyAsInt:()Ljava/util/function/ToIntFunction;
        38: invokeinterface #269,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        43: invokeinterface #273,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        48: i2l
        49: lstore_3
        50: iload_2
        51: ifeq          78
        54: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        57: ldc_w         #491                // String Spawned {} \"{}\" NPCs.
        60: iconst_2
        61: anewarray     #7                  // class java/lang/Object
        64: dup
        65: iconst_0
        66: lload_3
        67: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        70: aastore
        71: dup
        72: iconst_1
        73: aload_1
        74: aastore
        75: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        78: lload_3
        79: lreturn
      LineNumberTable:
        line 599: 0
        line 600: 11
        line 602: 13
        line 604: 50
        line 605: 54
        line 607: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      80     1 event   Ljava/lang/String;
            0      80     2 message   Z
           50      30     3 total   J
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 64
          locals = [ long ]

  public final long despawnEventNpcs(java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Z)J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=5, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #487                // Method java/lang/String.length:()I
         8: ifne          13
        11: lconst_0
        12: lreturn
        13: aload_0
        14: getfield      #42                 // Field _makers:Ljava/util/Set;
        17: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        22: aload_1
        23: invokedynamic #493,  0            // InvokeDynamic #18:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        28: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        33: invokedynamic #386,  0            // InvokeDynamic #7:applyAsInt:()Ljava/util/function/ToIntFunction;
        38: invokeinterface #269,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        43: invokeinterface #273,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        48: i2l
        49: lstore_3
        50: iload_2
        51: ifeq          78
        54: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        57: ldc_w         #494                // String Despawned {} \"{}\" NPCs.
        60: iconst_2
        61: anewarray     #7                  // class java/lang/Object
        64: dup
        65: iconst_0
        66: lload_3
        67: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        70: aastore
        71: dup
        72: iconst_1
        73: aload_1
        74: aastore
        75: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        78: lload_3
        79: lreturn
      LineNumberTable:
        line 618: 0
        line 619: 11
        line 621: 13
        line 623: 50
        line 624: 54
        line 626: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      80     1 event   Ljava/lang/String;
            0      80     2 message   Z
           50      30     3 total   J
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 64
          locals = [ long ]

  public final long startSpawnTime(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=8, args_size=6
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #496                // Method java/lang/String.isEmpty:()Z
         8: ifeq          13
        11: lconst_0
        12: lreturn
        13: aload_0
        14: getfield      #42                 // Field _makers:Ljava/util/Set;
        17: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        22: aload_1
        23: aload_2
        24: aload_3
        25: aload         4
        27: invokedynamic #499,  0            // InvokeDynamic #19:test:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
        32: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        37: invokedynamic #265,  0            // InvokeDynamic #6:applyAsInt:()Ljava/util/function/ToIntFunction;
        42: invokeinterface #269,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        47: invokeinterface #273,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        52: i2l
        53: lstore        6
        55: iload         5
        57: ifeq          85
        60: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc_w         #491                // String Spawned {} \"{}\" NPCs.
        66: iconst_2
        67: anewarray     #7                  // class java/lang/Object
        70: dup
        71: iconst_0
        72: lload         6
        74: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        77: aastore
        78: dup
        79: iconst_1
        80: aload_1
        81: aastore
        82: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        85: lload         6
        87: lreturn
      LineNumberTable:
        line 640: 0
        line 641: 11
        line 643: 13
        line 683: 42
        line 685: 55
        line 686: 60
        line 688: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      88     1  time   Ljava/lang/String;
            0      88     2 param1   Ljava/lang/String;
            0      88     3 param2   Ljava/lang/String;
            0      88     4 param3   Ljava/lang/String;
            0      88     5 message   Z
           55      33     6 total   J
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ long ]

  public final long stopSpawnTime(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=8, args_size=6
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #496                // Method java/lang/String.isEmpty:()Z
         8: ifeq          13
        11: lconst_0
        12: lreturn
        13: aload_0
        14: getfield      #42                 // Field _makers:Ljava/util/Set;
        17: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        22: aload_1
        23: aload_2
        24: aload_3
        25: aload         4
        27: invokedynamic #502,  0            // InvokeDynamic #20:test:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
        32: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        37: invokedynamic #386,  0            // InvokeDynamic #7:applyAsInt:()Ljava/util/function/ToIntFunction;
        42: invokeinterface #269,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        47: invokeinterface #273,  1          // InterfaceMethod java/util/stream/IntStream.sum:()I
        52: i2l
        53: lstore        6
        55: iload         5
        57: ifeq          85
        60: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc_w         #494                // String Despawned {} \"{}\" NPCs.
        66: iconst_2
        67: anewarray     #7                  // class java/lang/Object
        70: dup
        71: iconst_0
        72: lload         6
        74: invokestatic  #280                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        77: aastore
        78: dup
        79: iconst_1
        80: aload_1
        81: aastore
        82: invokevirtual #17                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        85: lload         6
        87: lreturn
      LineNumberTable:
        line 702: 0
        line 703: 11
        line 705: 13
        line 745: 42
        line 747: 55
        line 748: 60
        line 750: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      88     1  time   Ljava/lang/String;
            0      88     2 param1   Ljava/lang/String;
            0      88     3 param2   Ljava/lang/String;
            0      88     4 param3   Ljava/lang/String;
            0      88     5 message   Z
           55      33     6 total   J
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ long ]

  public void addSpawn(ext.mods.gameserver.model.spawn.Spawn);
    descriptor: (Lext/mods/gameserver/model/spawn/Spawn;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #45                 // Field _spawns:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #464,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 759: 0
        line 760: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      12     1 spawn   Lext/mods/gameserver/model/spawn/Spawn;

  public void addSpawn(ext.mods.gameserver.model.spawn.Spawn, boolean);
    descriptor: (Lext/mods/gameserver/model/spawn/Spawn;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=20, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #503                // Method addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
         5: iload_2
         6: ifeq          985
         9: new           #507                // class java/io/File
        12: dup
        13: getstatic     #509                // Field OTHER_XML_FOLDER:Ljava/lang/String;
        16: invokespecial #513                // Method java/io/File."<init>":(Ljava/lang/String;)V
        19: astore_3
        20: aload_3
        21: invokevirtual #515                // Method java/io/File.exists:()Z
        24: ifne          37
        27: aload_3
        28: invokevirtual #518                // Method java/io/File.mkdir:()Z
        31: pop
        32: goto          37
        35: astore        4
        37: aload_1
        38: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
        41: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
        44: ldc_w         #532                // String (\\s|\')+
        47: ldc_w         #534                // String
        50: invokevirtual #536                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        53: invokevirtual #540                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        56: aload_1
        57: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
        60: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
        63: aload_1
        64: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
        67: invokevirtual #546                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
        70: invokedynamic #549,  0            // InvokeDynamic #21:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
        75: astore        4
        77: aload_1
        78: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
        81: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
        84: ldc_w         #532                // String (\\s|\')+
        87: ldc_w         #534                // String
        90: invokevirtual #536                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        93: invokevirtual #540                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        96: aload_1
        97: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       100: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       103: aload_1
       104: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       107: invokevirtual #546                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       110: invokedynamic #552,  0            // InvokeDynamic #22:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
       115: astore        5
       117: aload_1
       118: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       121: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
       124: ldc_w         #532                // String (\\s|\')+
       127: ldc_w         #534                // String
       130: invokevirtual #536                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       133: invokevirtual #540                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       136: astore        6
       138: aload_1
       139: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       142: ldc_w         #558                // int -131072
       145: isub
       146: bipush        15
       148: ishr
       149: bipush        16
       151: iadd
       152: istore        7
       154: aload_1
       155: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       158: ldc_w         #562                // int -262144
       161: isub
       162: bipush        15
       164: ishr
       165: bipush        10
       167: iadd
       168: istore        8
       170: new           #507                // class java/io/File
       173: dup
       174: getstatic     #509                // Field OTHER_XML_FOLDER:Ljava/lang/String;
       177: aload         6
       179: iload         7
       181: iload         8
       183: invokedynamic #563,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
       188: invokespecial #513                // Method java/io/File."<init>":(Ljava/lang/String;)V
       191: astore        9
       193: aload_1
       194: invokevirtual #566                // Method ext/mods/gameserver/model/spawn/Spawn.getNpcId:()I
       197: invokestatic  #569                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       200: astore        10
       202: aload_1
       203: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       206: aload_1
       207: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       210: aload_1
       211: invokevirtual #572                // Method ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
       214: aload_1
       215: invokevirtual #575                // Method ext/mods/gameserver/model/spawn/Spawn.getHeading:()I
       218: invokedynamic #578,  0            // InvokeDynamic #24:makeConcatWithConstants:(IIII)Ljava/lang/String;
       223: invokestatic  #581                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       226: astore        11
       228: aload_0
       229: aload_1
       230: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       233: invokevirtual #584                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
       236: invokevirtual #585                // Method getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
       239: invokevirtual #589                // Method ext/mods/gameserver/model/spawn/ASpawn.getRespawnDelay:()I
       242: istore        12
       244: aload_0
       245: aload_1
       246: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       249: invokevirtual #584                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
       252: invokevirtual #585                // Method getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
       255: invokevirtual #594                // Method ext/mods/gameserver/model/spawn/ASpawn.getRespawnRandom:()I
       258: istore        13
       260: iload         13
       262: ifne          271
       265: ldc_w         #534                // String
       268: goto          278
       271: iload         13
       273: invokedynamic #597,  0            // InvokeDynamic #25:makeConcatWithConstants:(I)Ljava/lang/String;
       278: astore        14
       280: aload         9
       282: invokevirtual #515                // Method java/io/File.exists:()Z
       285: ifeq          695
       288: new           #507                // class java/io/File
       291: dup
       292: getstatic     #509                // Field OTHER_XML_FOLDER:Ljava/lang/String;
       295: aload         4
       297: iload         7
       299: iload         8
       301: invokedynamic #599,  0            // InvokeDynamic #26:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
       306: invokespecial #513                // Method java/io/File."<init>":(Ljava/lang/String;)V
       309: astore        15
       311: new           #600                // class java/io/BufferedReader
       314: dup
       315: new           #602                // class java/io/FileReader
       318: dup
       319: aload         9
       321: invokespecial #604                // Method java/io/FileReader."<init>":(Ljava/io/File;)V
       324: invokespecial #607                // Method java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
       327: astore        16
       329: new           #610                // class java/io/BufferedWriter
       332: dup
       333: new           #612                // class java/io/FileWriter
       336: dup
       337: aload         15
       339: invokespecial #614                // Method java/io/FileWriter."<init>":(Ljava/io/File;)V
       342: invokespecial #615                // Method java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
       345: astore        17
       347: aload         16
       349: invokevirtual #618                // Method java/io/BufferedReader.readLine:()Ljava/lang/String;
       352: dup
       353: astore        18
       355: ifnull        587
       358: aload         18
       360: ldc_w         #621                // String </list>
       363: invokevirtual #623                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       366: ifeq          572
       369: aload         17
       371: aload         4
       373: aload_1
       374: invokevirtual #572                // Method ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
       377: aload_1
       378: invokevirtual #572                // Method ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
       381: bipush        16
       383: iadd
       384: invokedynamic #627,  0            // InvokeDynamic #27:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
       389: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       392: aload         17
       394: aload_1
       395: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       398: bipush        50
       400: iadd
       401: aload_1
       402: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       405: bipush        50
       407: iadd
       408: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       413: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       416: aload         17
       418: aload_1
       419: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       422: bipush        50
       424: isub
       425: aload_1
       426: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       429: bipush        50
       431: iadd
       432: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       437: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       440: aload         17
       442: aload_1
       443: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       446: bipush        50
       448: isub
       449: aload_1
       450: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       453: bipush        50
       455: isub
       456: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       461: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       464: aload         17
       466: aload_1
       467: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       470: bipush        50
       472: iadd
       473: aload_1
       474: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       477: bipush        50
       479: isub
       480: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       485: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       488: aload         17
       490: ldc_w         #634                // String \t</territory>\n
       493: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       496: aload         17
       498: aload         5
       500: aload         4
       502: invokedynamic #636,  0            // InvokeDynamic #29:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       507: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       510: aload         17
       512: ldc_w         #638                // String \t\t<ai type=\"default_maker\"/>\n
       515: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       518: aload         17
       520: aload         10
       522: aload         11
       524: iload         12
       526: aload         14
       528: invokestatic  #640                // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       531: aload_1
       532: invokevirtual #566                // Method ext/mods/gameserver/model/spawn/Spawn.getNpcId:()I
       535: invokevirtual #645                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       538: invokevirtual #649                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
       541: invokedynamic #652,  0            // InvokeDynamic #30:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       546: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       549: aload         17
       551: ldc_w         #655                // String \t</npcmaker>\n
       554: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       557: aload         17
       559: aload         18
       561: invokedynamic #657,  0            // InvokeDynamic #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       566: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       569: goto          347
       572: aload         17
       574: aload         18
       576: invokedynamic #657,  0            // InvokeDynamic #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       581: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       584: goto          347
       587: aload         17
       589: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       592: aload         16
       594: invokevirtual #659                // Method java/io/BufferedReader.close:()V
       597: aload         9
       599: invokevirtual #660                // Method java/io/File.delete:()Z
       602: pop
       603: aload         15
       605: aload         9
       607: invokevirtual #663                // Method java/io/File.renameTo:(Ljava/io/File;)Z
       610: pop
       611: aload         17
       613: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       616: goto          641
       619: astore        18
       621: aload         17
       623: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       626: goto          638
       629: astore        19
       631: aload         18
       633: aload         19
       635: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       638: aload         18
       640: athrow
       641: aload         16
       643: invokevirtual #659                // Method java/io/BufferedReader.close:()V
       646: goto          671
       649: astore        17
       651: aload         16
       653: invokevirtual #659                // Method java/io/BufferedReader.close:()V
       656: goto          668
       659: astore        18
       661: aload         17
       663: aload         18
       665: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       668: aload         17
       670: athrow
       671: goto          692
       674: astore        16
       676: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       679: aload         16
       681: invokestatic  #581                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       684: invokedynamic #667,  0            // InvokeDynamic #32:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       689: invokevirtual #668                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       692: goto          985
       695: new           #610                // class java/io/BufferedWriter
       698: dup
       699: new           #612                // class java/io/FileWriter
       702: dup
       703: aload         9
       705: invokespecial #614                // Method java/io/FileWriter."<init>":(Ljava/io/File;)V
       708: invokespecial #615                // Method java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
       711: astore        15
       713: aload         15
       715: ldc_w         #671                // String <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n
       718: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       721: aload         15
       723: ldc_w         #673                // String <list>\n
       726: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       729: aload         15
       731: aload         4
       733: aload_1
       734: invokevirtual #572                // Method ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
       737: aload_1
       738: invokevirtual #572                // Method ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
       741: bipush        16
       743: iadd
       744: invokedynamic #627,  0            // InvokeDynamic #27:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
       749: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       752: aload         15
       754: aload_1
       755: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       758: bipush        50
       760: iadd
       761: aload_1
       762: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       765: bipush        50
       767: iadd
       768: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       773: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       776: aload         15
       778: aload_1
       779: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       782: bipush        50
       784: isub
       785: aload_1
       786: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       789: bipush        50
       791: iadd
       792: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       797: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       800: aload         15
       802: aload_1
       803: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       806: bipush        50
       808: isub
       809: aload_1
       810: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       813: bipush        50
       815: isub
       816: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       821: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       824: aload         15
       826: aload_1
       827: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       830: bipush        50
       832: iadd
       833: aload_1
       834: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       837: bipush        50
       839: isub
       840: invokedynamic #631,  0            // InvokeDynamic #28:makeConcatWithConstants:(II)Ljava/lang/String;
       845: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       848: aload         15
       850: ldc_w         #634                // String \t</territory>\n
       853: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       856: aload         15
       858: aload         5
       860: aload         4
       862: invokedynamic #636,  0            // InvokeDynamic #29:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       867: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       870: aload         15
       872: ldc_w         #638                // String \t\t<ai type=\"default_maker\"/>\n
       875: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       878: aload         15
       880: aload         10
       882: aload         11
       884: iload         12
       886: aload         14
       888: invokestatic  #640                // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
       891: aload_1
       892: invokevirtual #566                // Method ext/mods/gameserver/model/spawn/Spawn.getNpcId:()I
       895: invokevirtual #645                // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
       898: invokevirtual #649                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
       901: invokedynamic #652,  0            // InvokeDynamic #30:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       906: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       909: aload         15
       911: ldc_w         #655                // String \t</npcmaker>\n
       914: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       917: aload         15
       919: ldc_w         #675                // String </list>\n
       922: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       925: aload         15
       927: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       930: aload         15
       932: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       935: goto          960
       938: astore        16
       940: aload         15
       942: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       945: goto          957
       948: astore        17
       950: aload         16
       952: aload         17
       954: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       957: aload         16
       959: athrow
       960: goto          985
       963: astore        15
       965: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       968: aload_1
       969: invokestatic  #581                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       972: aload         15
       974: invokestatic  #581                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       977: invokedynamic #677,  0            // InvokeDynamic #33:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       982: invokevirtual #668                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       985: return
      Exception table:
         from    to  target type
            27    32    35   Class java/lang/SecurityException
           347   611   619   Class java/lang/Throwable
           621   626   629   Class java/lang/Throwable
           329   641   649   Class java/lang/Throwable
           651   656   659   Class java/lang/Throwable
           311   671   674   Class java/lang/Exception
           713   930   938   Class java/lang/Throwable
           940   945   948   Class java/lang/Throwable
           695   960   963   Class java/lang/Exception
      LineNumberTable:
        line 769: 0
        line 771: 5
        line 773: 9
        line 774: 20
        line 778: 27
        line 782: 32
        line 780: 35
        line 785: 37
        line 786: 77
        line 787: 117
        line 789: 138
        line 790: 154
        line 791: 170
        line 793: 193
        line 794: 202
        line 796: 228
        line 797: 244
        line 798: 260
        line 800: 280
        line 802: 288
        line 803: 311
        line 804: 329
        line 807: 347
        line 809: 358
        line 811: 369
        line 812: 392
        line 813: 416
        line 814: 440
        line 815: 464
        line 816: 488
        line 817: 496
        line 818: 510
        line 819: 518
        line 820: 549
        line 821: 557
        line 822: 569
        line 824: 572
        line 826: 587
        line 827: 592
        line 828: 597
        line 829: 603
        line 830: 611
        line 803: 619
        line 830: 641
        line 803: 649
        line 834: 671
        line 831: 674
        line 833: 676
        line 835: 692
        line 838: 695
        line 840: 713
        line 841: 721
        line 842: 729
        line 843: 752
        line 844: 776
        line 845: 800
        line 846: 824
        line 847: 848
        line 848: 856
        line 849: 870
        line 850: 878
        line 851: 909
        line 852: 917
        line 853: 925
        line 854: 930
        line 838: 938
        line 858: 960
        line 855: 963
        line 857: 965
        line 861: 985
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          355     256    18 currentLine   Ljava/lang/String;
          347     294    17 writer   Ljava/io/BufferedWriter;
          329     342    16 reader   Ljava/io/BufferedReader;
          676      16    16     e   Ljava/lang/Exception;
          311     381    15 tempFile   Ljava/io/File;
          713     247    15 writer   Ljava/io/BufferedWriter;
          965      20    15     e   Ljava/lang/Exception;
           20     965     3 outputDirectory   Ljava/io/File;
           77     908     4  name   Ljava/lang/String;
          117     868     5 npcMakerName   Ljava/lang/String;
          138     847     6 fileName   Ljava/lang/String;
          154     831     7     x   I
          170     815     8     y   I
          193     792     9 spawnFile   Ljava/io/File;
          202     783    10 spawnId   Ljava/lang/String;
          228     757    11 spawnLoc   Ljava/lang/String;
          244     741    12 respawn   I
          260     725    13 respawnRnd   I
          280     705    14 respawnRndString   Ljava/lang/String;
            0     986     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0     986     1 spawn   Lext/mods/gameserver/model/spawn/Spawn;
            0     986     2 store   Z
      StackMapTable: number_of_entries = 24
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File ]
          stack = [ class java/lang/SecurityException ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 233
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int ]
          stack = []
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int, class java/lang/String, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 224
          locals = [ class java/lang/String ]
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int, class java/lang/String, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int, class java/lang/String, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int, class java/lang/String, class java/io/File, class java/io/BufferedReader, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 242
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int, class java/lang/String, class java/io/BufferedWriter ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/io/File, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/lang/String, class java/lang/String, int, int, class java/lang/String, class java/io/BufferedWriter, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int ]
          stack = []

  public void deleteSpawn(ext.mods.gameserver.model.spawn.Spawn);
    descriptor: (Lext/mods/gameserver/model/spawn/Spawn;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #45                 // Field _spawns:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #678,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 869: 0
        line 870: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      12     1 spawn   Lext/mods/gameserver/model/spawn/Spawn;

  public void deleteSpawn(ext.mods.gameserver.model.spawn.Spawn, boolean);
    descriptor: (Lext/mods/gameserver/model/spawn/Spawn;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=16, args_size=3
         0: aload_1
         1: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
         4: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
         7: ldc_w         #532                // String (\\s|\')+
        10: ldc_w         #534                // String
        13: invokevirtual #536                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        16: invokevirtual #540                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        19: aload_1
        20: invokevirtual #681                // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        23: invokevirtual #685                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        26: aload_1
        27: invokevirtual #681                // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        30: invokevirtual #688                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        33: invokedynamic #549,  0            // InvokeDynamic #21:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
        38: astore_3
        39: aload_1
        40: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
        43: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
        46: ldc_w         #532                // String (\\s|\')+
        49: ldc_w         #534                // String
        52: invokevirtual #536                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        55: invokevirtual #540                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        58: aload_1
        59: invokevirtual #681                // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        62: invokevirtual #685                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
        65: aload_1
        66: invokevirtual #681                // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
        69: invokevirtual #688                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
        72: invokedynamic #552,  0            // InvokeDynamic #22:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
        77: astore        4
        79: aload_1
        80: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
        83: invokevirtual #529                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
        86: ldc_w         #532                // String (\\s|\')+
        89: ldc_w         #534                // String
        92: invokevirtual #536                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        95: invokevirtual #540                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        98: astore        5
       100: aload_1
       101: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       104: ldc_w         #558                // int -131072
       107: isub
       108: bipush        15
       110: ishr
       111: bipush        16
       113: iadd
       114: istore        6
       116: aload_1
       117: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       120: ldc_w         #562                // int -262144
       123: isub
       124: bipush        15
       126: ishr
       127: bipush        10
       129: iadd
       130: istore        7
       132: new           #507                // class java/io/File
       135: dup
       136: getstatic     #509                // Field OTHER_XML_FOLDER:Ljava/lang/String;
       139: aload         5
       141: iload         6
       143: iload         7
       145: invokedynamic #563,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
       150: invokespecial #513                // Method java/io/File."<init>":(Ljava/lang/String;)V
       153: astore        8
       155: aload         8
       157: invokevirtual #515                // Method java/io/File.exists:()Z
       160: ifne          164
       163: return
       164: new           #507                // class java/io/File
       167: dup
       168: getstatic     #509                // Field OTHER_XML_FOLDER:Ljava/lang/String;
       171: aload         5
       173: iload         6
       175: iload         7
       177: invokedynamic #599,  0            // InvokeDynamic #26:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
       182: invokespecial #513                // Method java/io/File."<init>":(Ljava/lang/String;)V
       185: astore        9
       187: new           #600                // class java/io/BufferedReader
       190: dup
       191: new           #602                // class java/io/FileReader
       194: dup
       195: aload         8
       197: invokespecial #604                // Method java/io/FileReader."<init>":(Ljava/io/File;)V
       200: invokespecial #607                // Method java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
       203: astore        10
       205: new           #610                // class java/io/BufferedWriter
       208: dup
       209: new           #612                // class java/io/FileWriter
       212: dup
       213: aload         9
       215: invokespecial #614                // Method java/io/FileWriter."<init>":(Ljava/io/File;)V
       218: invokespecial #615                // Method java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
       221: astore        11
       223: iconst_0
       224: istore        13
       226: iconst_0
       227: istore        14
       229: iconst_0
       230: istore        15
       232: aload         10
       234: invokevirtual #618                // Method java/io/BufferedReader.readLine:()Ljava/lang/String;
       237: dup
       238: astore        12
       240: ifnull        354
       243: aload         12
       245: aload_3
       246: invokedynamic #689,  0            // InvokeDynamic #34:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       251: invokevirtual #623                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       254: ifeq          260
       257: iconst_1
       258: istore        13
       260: aload         12
       262: aload         4
       264: invokedynamic #690,  0            // InvokeDynamic #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       269: invokevirtual #623                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       272: ifeq          278
       275: iconst_1
       276: istore        14
       278: iload         13
       280: ifne          288
       283: iload         14
       285: ifeq          339
       288: aload         12
       290: ldc_w         #691                // String </territory>
       293: invokevirtual #623                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       296: ifne          310
       299: aload         12
       301: ldc_w         #693                // String </npcmaker>
       304: invokevirtual #623                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       307: ifeq          333
       310: iconst_0
       311: istore        13
       313: iconst_0
       314: istore        14
       316: iload         15
       318: ifne          333
       321: aload         11
       323: aload         12
       325: invokedynamic #657,  0            // InvokeDynamic #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       330: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       333: iconst_1
       334: istore        15
       336: goto          232
       339: aload         11
       341: aload         12
       343: invokedynamic #657,  0            // InvokeDynamic #31:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       348: invokevirtual #628                // Method java/io/BufferedWriter.write:(Ljava/lang/String;)V
       351: goto          232
       354: aload         11
       356: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       359: aload         10
       361: invokevirtual #659                // Method java/io/BufferedReader.close:()V
       364: iload         15
       366: ifeq          386
       369: aload         8
       371: invokevirtual #660                // Method java/io/File.delete:()Z
       374: pop
       375: aload         9
       377: aload         8
       379: invokevirtual #663                // Method java/io/File.renameTo:(Ljava/io/File;)Z
       382: pop
       383: goto          392
       386: aload         9
       388: invokevirtual #660                // Method java/io/File.delete:()Z
       391: pop
       392: aload         11
       394: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       397: goto          422
       400: astore        12
       402: aload         11
       404: invokevirtual #658                // Method java/io/BufferedWriter.close:()V
       407: goto          419
       410: astore        13
       412: aload         12
       414: aload         13
       416: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       419: aload         12
       421: athrow
       422: aload         10
       424: invokevirtual #659                // Method java/io/BufferedReader.close:()V
       427: goto          452
       430: astore        11
       432: aload         10
       434: invokevirtual #659                // Method java/io/BufferedReader.close:()V
       437: goto          449
       440: astore        12
       442: aload         11
       444: aload         12
       446: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       449: aload         11
       451: athrow
       452: aload         8
       454: invokestatic  #695                // Method isEmptyXml:(Ljava/io/File;)Z
       457: ifeq          466
       460: aload         8
       462: invokevirtual #660                // Method java/io/File.delete:()Z
       465: pop
       466: goto          487
       469: astore        9
       471: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       474: aload         9
       476: invokestatic  #581                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       479: invokedynamic #698,  0            // InvokeDynamic #36:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       484: invokevirtual #668                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       487: return
      Exception table:
         from    to  target type
           223   392   400   Class java/lang/Throwable
           402   407   410   Class java/lang/Throwable
           205   422   430   Class java/lang/Throwable
           432   437   440   Class java/lang/Throwable
           164   466   469   Class java/lang/Exception
      LineNumberTable:
        line 874: 0
        line 875: 39
        line 877: 79
        line 878: 100
        line 879: 116
        line 880: 132
        line 882: 155
        line 884: 163
        line 889: 164
        line 890: 187
        line 891: 205
        line 894: 223
        line 895: 226
        line 896: 229
        line 897: 232
        line 899: 243
        line 900: 257
        line 902: 260
        line 903: 275
        line 905: 278
        line 907: 288
        line 909: 310
        line 910: 313
        line 911: 316
        line 912: 321
        line 914: 333
        line 917: 339
        line 920: 354
        line 921: 359
        line 923: 364
        line 925: 369
        line 926: 375
        line 929: 386
        line 930: 392
        line 890: 400
        line 930: 422
        line 890: 430
        line 931: 452
        line 932: 460
        line 937: 466
        line 934: 469
        line 936: 471
        line 938: 487
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          240     152    12 currentLine   Ljava/lang/String;
          226     166    13 inTerritory   Z
          229     163    14 inNpcMaker   Z
          232     160    15 needToDelete   Z
          223     199    11 writer   Ljava/io/BufferedWriter;
          205     247    10 reader   Ljava/io/BufferedReader;
          187     279     9 tempFile   Ljava/io/File;
          471      16     9     e   Ljava/lang/Exception;
            0     488     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0     488     1 spawn   Lext/mods/gameserver/model/spawn/Spawn;
            0     488     2 store   Z
           39     449     3  name   Ljava/lang/String;
           79     409     4 npcMakerName   Ljava/lang/String;
          100     388     5 fileName   Ljava/lang/String;
          116     372     6     x   I
          132     356     7     y   I
          155     333     8 spawnFile   Ljava/io/File;
      StackMapTable: number_of_entries = 22
        frame_type = 255 /* full_frame */
          offset_delta = 164
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, top, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, class java/lang/String, int, int, int ]
          stack = []
        frame_type = 17 /* same */
        frame_type = 9 /* same */
        frame_type = 21 /* same */
        frame_type = 22 /* same */
        frame_type = 5 /* same */
        frame_type = 14 /* same */
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter ]
          stack = []
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/io/BufferedWriter, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/spawn/Spawn, int, class java/lang/String, class java/lang/String, class java/lang/String, int, int, class java/io/File, class java/io/File, class java/io/BufferedReader, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */

  public static boolean isEmptyXml(java.io.File);
    descriptor: (Ljava/io/File;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=6, args_size=1
         0: new           #600                // class java/io/BufferedReader
         3: dup
         4: new           #602                // class java/io/FileReader
         7: dup
         8: aload_0
         9: invokespecial #604                // Method java/io/FileReader."<init>":(Ljava/io/File;)V
        12: invokespecial #607                // Method java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
        15: astore_1
        16: new           #699                // class java/lang/StringBuilder
        19: dup
        20: invokespecial #701                // Method java/lang/StringBuilder."<init>":()V
        23: astore_2
        24: aload_1
        25: invokevirtual #618                // Method java/io/BufferedReader.readLine:()Ljava/lang/String;
        28: dup
        29: astore_3
        30: ifnull        45
        33: aload_2
        34: aload_3
        35: invokevirtual #702                // Method java/lang/String.trim:()Ljava/lang/String;
        38: invokevirtual #705                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        41: pop
        42: goto          24
        45: ldc_w         #709                // String <?xml version=\"1.0\" encoding=\"UTF-8\"?><list></list>
        48: astore        4
        50: aload_2
        51: invokevirtual #711                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        54: aload         4
        56: invokevirtual #714                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        59: istore        5
        61: aload_1
        62: invokevirtual #659                // Method java/io/BufferedReader.close:()V
        65: iload         5
        67: ireturn
        68: astore_2
        69: aload_1
        70: invokevirtual #659                // Method java/io/BufferedReader.close:()V
        73: goto          82
        76: astore_3
        77: aload_2
        78: aload_3
        79: invokevirtual #212                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        82: aload_2
        83: athrow
        84: astore_1
        85: getstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        88: aload_1
        89: invokestatic  #581                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        92: invokedynamic #717,  0            // InvokeDynamic #37:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        97: invokevirtual #668                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       100: iconst_0
       101: ireturn
      Exception table:
         from    to  target type
            16    61    68   Class java/lang/Throwable
            69    73    76   Class java/lang/Throwable
             0    65    84   Class java/lang/Exception
            68    84    84   Class java/lang/Exception
      LineNumberTable:
        line 942: 0
        line 944: 16
        line 947: 24
        line 949: 33
        line 952: 45
        line 953: 50
        line 954: 61
        line 953: 65
        line 942: 68
        line 955: 84
        line 957: 85
        line 958: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      44     2 content   Ljava/lang/StringBuilder;
           30      38     3  line   Ljava/lang/String;
           50      18     4 expectedContent   Ljava/lang/String;
           16      68     1 reader   Ljava/io/BufferedReader;
           85      17     1     e   Ljava/lang/Exception;
            0     102     0  file   Ljava/io/File;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/io/BufferedReader, class java/lang/StringBuilder ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class java/io/File, class java/io/BufferedReader ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class java/io/File, class java/io/BufferedReader, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class java/io/File ]
          stack = [ class java/lang/Exception ]

  public final ext.mods.gameserver.model.spawn.ASpawn getSpawn(int);
    descriptor: (I)Lext/mods/gameserver/model/spawn/ASpawn;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=2
         0: ldc_w         #718                // String {} getSpawn(npcId={}) entry
         3: iconst_2
         4: anewarray     #7                  // class java/lang/Object
         7: dup
         8: iconst_0
         9: ldc_w         #720                // String [SpawnManager][NpcSearch]
        12: aastore
        13: dup
        14: iconst_1
        15: iload_1
        16: invokestatic  #66                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: aastore
        20: invokestatic  #722                // Method npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
        23: aload_0
        24: getfield      #42                 // Field _makers:Ljava/util/Set;
        27: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        32: invokedynamic #726,  0            // InvokeDynamic #38:apply:()Ljava/util/function/Function;
        37: invokeinterface #129,  2          // InterfaceMethod java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        42: iload_1
        43: invokedynamic #727,  0            // InvokeDynamic #39:test:(I)Ljava/util/function/Predicate;
        48: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        53: invokeinterface #393,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        58: aconst_null
        59: invokevirtual #397                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        62: checkcast     #590                // class ext/mods/gameserver/model/spawn/ASpawn
        65: astore_2
        66: aload_2
        67: ifnonnull     103
        70: aload_0
        71: getfield      #45                 // Field _spawns:Ljava/util/Set;
        74: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        79: iload_1
        80: invokedynamic #730,  0            // InvokeDynamic #40:test:(I)Ljava/util/function/Predicate;
        85: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        90: invokeinterface #393,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        95: aconst_null
        96: invokevirtual #397                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        99: checkcast     #590                // class ext/mods/gameserver/model/spawn/ASpawn
       102: astore_2
       103: ldc_w         #731                // String {} getSpawn(npcId={}) return {}
       106: iconst_3
       107: anewarray     #7                  // class java/lang/Object
       110: dup
       111: iconst_0
       112: ldc_w         #720                // String [SpawnManager][NpcSearch]
       115: aastore
       116: dup
       117: iconst_1
       118: iload_1
       119: invokestatic  #66                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       122: aastore
       123: dup
       124: iconst_2
       125: aload_2
       126: aastore
       127: invokestatic  #722                // Method npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
       130: aload_2
       131: areturn
      LineNumberTable:
        line 968: 0
        line 969: 23
        line 970: 66
        line 971: 70
        line 972: 103
        line 973: 130
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     132     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0     132     1 npcId   I
           66      66     2 result   Lext/mods/gameserver/model/spawn/ASpawn;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn ]

  public final ext.mods.gameserver.model.location.Location getClosestSpawnLocation(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=25, args_size=3
         0: ldc_w         #733                // String {} getClosestSpawnLocation() entry player={} npcId={}
         3: iconst_3
         4: anewarray     #7                  // class java/lang/Object
         7: dup
         8: iconst_0
         9: ldc_w         #720                // String [SpawnManager][NpcSearch]
        12: aastore
        13: dup
        14: iconst_1
        15: aload_1
        16: ifnull        26
        19: aload_1
        20: invokevirtual #735                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        23: goto          27
        26: aconst_null
        27: aastore
        28: dup
        29: iconst_2
        30: iload_2
        31: invokestatic  #66                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: aastore
        35: invokestatic  #722                // Method npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
        38: aload_1
        39: ifnonnull     60
        42: ldc_w         #738                // String {} getClosestSpawnLocation() return null (player null)
        45: iconst_1
        46: anewarray     #7                  // class java/lang/Object
        49: dup
        50: iconst_0
        51: ldc_w         #720                // String [SpawnManager][NpcSearch]
        54: aastore
        55: invokestatic  #722                // Method npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
        58: aconst_null
        59: areturn
        60: aconst_null
        61: astore_3
        62: ldc2_w        #740                // long 9223372036854775807l
        65: lstore        4
        67: aconst_null
        68: astore        6
        70: ldc2_w        #740                // long 9223372036854775807l
        73: lstore        7
        75: aload_1
        76: invokevirtual #742                // Method ext/mods/gameserver/model/actor/Player.getX:()I
        79: istore        9
        81: aload_1
        82: invokevirtual #743                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        85: istore        10
        87: aload_1
        88: invokevirtual #744                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        91: istore        11
        93: aload_0
        94: getfield      #42                 // Field _makers:Ljava/util/Set;
        97: invokeinterface #747,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       102: astore        12
       104: aload         12
       106: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       111: ifeq          365
       114: aload         12
       116: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       121: checkcast     #479                // class ext/mods/gameserver/model/spawn/NpcMaker
       124: astore        13
       126: aload         13
       128: invokevirtual #748                // Method ext/mods/gameserver/model/spawn/NpcMaker.getSpawns:()Ljava/util/List;
       131: invokeinterface #751,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       136: astore        14
       138: aload         14
       140: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       145: ifeq          362
       148: aload         14
       150: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       155: checkcast     #590                // class ext/mods/gameserver/model/spawn/ASpawn
       158: astore        15
       160: aload         15
       162: invokevirtual #754                // Method ext/mods/gameserver/model/spawn/ASpawn.getNpcId:()I
       165: iload_2
       166: if_icmpeq     172
       169: goto          138
       172: aload         15
       174: invokevirtual #755                // Method ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       177: ifnull        277
       180: aload         15
       182: invokevirtual #755                // Method ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       185: astore        16
       187: aload         16
       189: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       192: iload         9
       194: isub
       195: i2l
       196: lstore        17
       198: aload         16
       200: invokevirtual #546                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       203: iload         10
       205: isub
       206: i2l
       207: lstore        19
       209: aload         16
       211: invokevirtual #756                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       214: iload         11
       216: isub
       217: i2l
       218: lstore        21
       220: lload         17
       222: lload         17
       224: lmul
       225: lload         19
       227: lload         19
       229: lmul
       230: ladd
       231: lload         21
       233: lload         21
       235: lmul
       236: ladd
       237: lstore        23
       239: lload         23
       241: lload         4
       243: lcmp
       244: ifge          138
       247: lload         23
       249: lstore        4
       251: new           #757                // class ext/mods/gameserver/model/location/Location
       254: dup
       255: aload         16
       257: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       260: aload         16
       262: invokevirtual #546                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       265: aload         16
       267: invokevirtual #756                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       270: invokespecial #759                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       273: astore_3
       274: goto          138
       277: aload_0
       278: aload_1
       279: aload         15
       281: invokevirtual #762                // Method resolveSpawnLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
       284: astore        16
       286: aload         16
       288: ifnull        359
       291: aload         16
       293: invokevirtual #766                // Method ext/mods/gameserver/model/location/Location.getX:()I
       296: iload         9
       298: isub
       299: i2l
       300: lstore        17
       302: aload         16
       304: invokevirtual #767                // Method ext/mods/gameserver/model/location/Location.getY:()I
       307: iload         10
       309: isub
       310: i2l
       311: lstore        19
       313: aload         16
       315: invokevirtual #768                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       318: iload         11
       320: isub
       321: i2l
       322: lstore        21
       324: lload         17
       326: lload         17
       328: lmul
       329: lload         19
       331: lload         19
       333: lmul
       334: ladd
       335: lload         21
       337: lload         21
       339: lmul
       340: ladd
       341: lstore        23
       343: lload         23
       345: lload         7
       347: lcmp
       348: ifge          359
       351: lload         23
       353: lstore        7
       355: aload         16
       357: astore        6
       359: goto          138
       362: goto          104
       365: aload_0
       366: getfield      #45                 // Field _spawns:Ljava/util/Set;
       369: invokeinterface #747,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       374: astore        12
       376: aload         12
       378: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       383: ifeq          610
       386: aload         12
       388: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       393: checkcast     #524                // class ext/mods/gameserver/model/spawn/Spawn
       396: astore        13
       398: aload         13
       400: invokevirtual #566                // Method ext/mods/gameserver/model/spawn/Spawn.getNpcId:()I
       403: iload_2
       404: if_icmpeq     410
       407: goto          376
       410: aload         13
       412: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       415: ifnull        515
       418: aload         13
       420: invokevirtual #523                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       423: astore        14
       425: aload         14
       427: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       430: iload         9
       432: isub
       433: i2l
       434: lstore        15
       436: aload         14
       438: invokevirtual #546                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       441: iload         10
       443: isub
       444: i2l
       445: lstore        17
       447: aload         14
       449: invokevirtual #756                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       452: iload         11
       454: isub
       455: i2l
       456: lstore        19
       458: lload         15
       460: lload         15
       462: lmul
       463: lload         17
       465: lload         17
       467: lmul
       468: ladd
       469: lload         19
       471: lload         19
       473: lmul
       474: ladd
       475: lstore        21
       477: lload         21
       479: lload         4
       481: lcmp
       482: ifge          376
       485: lload         21
       487: lstore        4
       489: new           #757                // class ext/mods/gameserver/model/location/Location
       492: dup
       493: aload         14
       495: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       498: aload         14
       500: invokevirtual #546                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       503: aload         14
       505: invokevirtual #756                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       508: invokespecial #759                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       511: astore_3
       512: goto          376
       515: new           #757                // class ext/mods/gameserver/model/location/Location
       518: dup
       519: aload         13
       521: invokevirtual #553                // Method ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
       524: aload         13
       526: invokevirtual #559                // Method ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
       529: aload         13
       531: invokevirtual #572                // Method ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
       534: invokespecial #759                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       537: astore        14
       539: aload         14
       541: invokevirtual #766                // Method ext/mods/gameserver/model/location/Location.getX:()I
       544: iload         9
       546: isub
       547: i2l
       548: lstore        15
       550: aload         14
       552: invokevirtual #767                // Method ext/mods/gameserver/model/location/Location.getY:()I
       555: iload         10
       557: isub
       558: i2l
       559: lstore        17
       561: aload         14
       563: invokevirtual #768                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       566: iload         11
       568: isub
       569: i2l
       570: lstore        19
       572: lload         15
       574: lload         15
       576: lmul
       577: lload         17
       579: lload         17
       581: lmul
       582: ladd
       583: lload         19
       585: lload         19
       587: lmul
       588: ladd
       589: lstore        21
       591: lload         21
       593: lload         7
       595: lcmp
       596: ifge          607
       599: lload         21
       601: lstore        7
       603: aload         14
       605: astore        6
       607: goto          376
       610: aload_3
       611: ifnull        618
       614: aload_3
       615: goto          620
       618: aload         6
       620: astore        12
       622: ldc_w         #769                // String {} getClosestSpawnLocation() return {} (fromNpc={} fromSpawnlist={})
       625: iconst_4
       626: anewarray     #7                  // class java/lang/Object
       629: dup
       630: iconst_0
       631: ldc_w         #720                // String [SpawnManager][NpcSearch]
       634: aastore
       635: dup
       636: iconst_1
       637: aload         12
       639: aastore
       640: dup
       641: iconst_2
       642: aload_3
       643: aastore
       644: dup
       645: iconst_3
       646: aload         6
       648: aastore
       649: invokestatic  #722                // Method npcSearchLog:(Ljava/lang/String;[Ljava/lang/Object;)V
       652: aload_3
       653: ifnull        658
       656: aload_3
       657: areturn
       658: aload         6
       660: areturn
      LineNumberTable:
        line 987: 0
        line 988: 38
        line 990: 42
        line 991: 58
        line 994: 60
        line 995: 62
        line 997: 67
        line 998: 70
        line 1000: 75
        line 1001: 81
        line 1002: 87
        line 1004: 93
        line 1006: 126
        line 1008: 160
        line 1009: 169
        line 1011: 172
        line 1013: 180
        line 1014: 187
        line 1015: 198
        line 1016: 209
        line 1017: 220
        line 1018: 239
        line 1020: 247
        line 1021: 251
        line 1026: 277
        line 1027: 286
        line 1029: 291
        line 1030: 302
        line 1031: 313
        line 1032: 324
        line 1033: 343
        line 1035: 351
        line 1036: 355
        line 1039: 359
        line 1040: 362
        line 1042: 365
        line 1044: 398
        line 1045: 407
        line 1047: 410
        line 1049: 418
        line 1050: 425
        line 1051: 436
        line 1052: 447
        line 1053: 458
        line 1054: 477
        line 1056: 485
        line 1057: 489
        line 1062: 515
        line 1063: 539
        line 1064: 550
        line 1065: 561
        line 1066: 572
        line 1067: 591
        line 1069: 599
        line 1070: 603
        line 1072: 607
        line 1074: 610
        line 1075: 622
        line 1076: 652
        line 1077: 656
        line 1078: 658
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          187      90    16   npc   Lext/mods/gameserver/model/actor/Npc;
          198      79    17    dx   J
          209      68    19    dy   J
          220      57    21    dz   J
          239      38    23  dist   J
          302      57    17    dx   J
          313      46    19    dy   J
          324      35    21    dz   J
          343      16    23  dist   J
          286      73    16   loc   Lext/mods/gameserver/model/location/Location;
          160     199    15 spawn   Lext/mods/gameserver/model/spawn/ASpawn;
          126     236    13    nm   Lext/mods/gameserver/model/spawn/NpcMaker;
          425      90    14   npc   Lext/mods/gameserver/model/actor/Npc;
          436      79    15    dx   J
          447      68    17    dy   J
          458      57    19    dz   J
          477      38    21  dist   J
          539      68    14   loc   Lext/mods/gameserver/model/location/Location;
          550      57    15    dx   J
          561      46    17    dy   J
          572      35    19    dz   J
          591      16    21  dist   J
          398     209    13 spawn   Lext/mods/gameserver/model/spawn/Spawn;
            0     661     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0     661     1 player   Lext/mods/gameserver/model/actor/Player;
            0     661     2 npcId   I
           62     599     3 closestFromNpc   Lext/mods/gameserver/model/location/Location;
           67     594     4 bestDistFromNpc   J
           70     591     6 closestFromSpawnlist   Lext/mods/gameserver/model/location/Location;
           75     586     7 bestDistFromSpawnlist   J
           81     580     9    px   I
           87     574    10    py   I
           93     568    11    pz   I
          622      39    12 result   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class java/lang/String, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class java/lang/String, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 32 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/data/manager/SpawnManager, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/location/Location, long, class ext/mods/gameserver/model/location/Location, long, int, int, int, class java/util/Iterator ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/spawn/NpcMaker, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 104
        frame_type = 250 /* chop */
          offset_delta = 81
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/spawn/Spawn ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 104
        frame_type = 250 /* chop */
          offset_delta = 91
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 7 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/location/Location ]

  public final ext.mods.gameserver.model.spawn.ASpawn getSpawn(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/ASpawn;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #42                 // Field _makers:Ljava/util/Set;
         4: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: invokedynamic #803,  0            // InvokeDynamic #41:apply:()Ljava/util/function/Function;
        14: invokeinterface #129,  2          // InterfaceMethod java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        19: aload_1
        20: invokedynamic #804,  0            // InvokeDynamic #42:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        25: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        30: invokeinterface #393,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        35: aconst_null
        36: invokevirtual #397                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        39: checkcast     #590                // class ext/mods/gameserver/model/spawn/ASpawn
        42: astore_2
        43: aload_2
        44: ifnonnull     80
        47: aload_0
        48: getfield      #45                 // Field _spawns:Ljava/util/Set;
        51: invokeinterface #114,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
        56: aload_1
        57: invokedynamic #805,  0            // InvokeDynamic #43:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        62: invokeinterface #261,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        67: invokeinterface #393,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        72: aconst_null
        73: invokevirtual #397                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        76: checkcast     #590                // class ext/mods/gameserver/model/spawn/ASpawn
        79: astore_2
        80: aload_2
        81: areturn
      LineNumberTable:
        line 1141: 0
        line 1142: 43
        line 1143: 47
        line 1145: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/gameserver/data/manager/SpawnManager;
            0      82     1 npcAlias   Ljava/lang/String;
           43      39     2 result   Lext/mods/gameserver/model/spawn/ASpawn;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/model/spawn/ASpawn ]

  public static final ext.mods.gameserver.data.manager.SpawnManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/SpawnManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #806                // Field ext/mods/gameserver/data/manager/SpawnManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/SpawnManager;
         3: areturn
      LineNumberTable:
        line 1150: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #1024               // Field ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
         3: ldc_w         #1028               // String xml/spawnlist/custom
         6: invokeinterface #1030,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        11: invokeinterface #1036,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
        16: putstatic     #509                // Field OTHER_XML_FOLDER:Ljava/lang/String;
        19: return
      LineNumberTable:
        line 90: 0
}
SourceFile: "SpawnManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/SpawnManager$1
  ext/mods/gameserver/data/manager/SpawnManager$SingletonHolder
BootstrapMethods:
  0: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1266 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$0:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  1: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1270 (Ljava/lang/Object;)Ljava/lang/Object;
      #1271 REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.getSpawns:()Ljava/util/List;
      #1272 (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/List;
  2: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1270 (Ljava/lang/Object;)Ljava/lang/Object;
      #1274 REF_invokeInterface java/util/Collection.stream:()Ljava/util/stream/Stream;
      #1276 (Ljava/util/List;)Ljava/util/stream/Stream;
  3: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1278 REF_invokeVirtual ext/mods/gameserver/model/spawn/MultiSpawn.updateSpawnData:()V
      #1282 (Lext/mods/gameserver/model/spawn/MultiSpawn;)V
  4: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1284 REF_invokeVirtual ext/mods/gameserver/model/spawn/Spawn.updateSpawnData:()V
      #1286 (Lext/mods/gameserver/model/spawn/Spawn;)V
  5: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1288 REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.isOnStart:()Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  6: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1294 (Ljava/lang/Object;)I
      #1296 REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.spawnAll:()I
      #1300 (Lext/mods/gameserver/model/spawn/NpcMaker;)I
  7: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1294 (Ljava/lang/Object;)I
      #1302 REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.deleteAll:()I
      #1300 (Lext/mods/gameserver/model/spawn/NpcMaker;)I
  8: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1306 REF_invokeVirtual ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
      #1286 (Lext/mods/gameserver/model/spawn/Spawn;)V
  9: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1310 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getTerritory$0:(Ljava/lang/String;Lext/mods/commons/geometry/Territory;)Z
      #1313 (Lext/mods/commons/geometry/Territory;)Z
  10: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1315 grouped_\u0001
  11: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1317 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getNpcMakers$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  12: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1320 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getNpcMaker$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  13: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1323 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByName$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  14: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1326 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByName$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
      #1329 (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  15: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1331 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByEvent$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  16: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1334 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$addQuestEventByEvent$1:(Lext/mods/gameserver/scripting/Quest;Lext/mods/gameserver/model/spawn/NpcMaker;)V
      #1329 (Lext/mods/gameserver/model/spawn/NpcMaker;)V
  17: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1337 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$spawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  18: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1340 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$despawnEventNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  19: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1343 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$startSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  20: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1346 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$stopSpawnTime$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #1292 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  21: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1349 \u0001_\u0001\u0001
  22: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1351 \u0001_\u0001\u00011
  23: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1353 \u0001/\u0001_\u0001_\u0001.xml
  24: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1355 \u0001;\u0001;\u0001;\u0001
  25: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1357 \" respawnRand=\"\u0001sec
  26: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1359 \u0001/\u0001_\u0001_\u0001.tmp
  27: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1361 \t<territory name=\"\u0001\" minZ=\"\u0001\" maxZ=\"\u0001\">\n
  28: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1363 \t\t<node x=\"\u0001\" y=\"\u0001\" />\n
  29: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1365 \t<npcmaker name=\"\u0001\" territory=\"\u0001\" maximumNpcs=\"1\">\n
  30: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1367 \t\t<npc id=\"\u0001\" pos=\"\u0001\" total=\"1\" respawn=\"\u0001sec\u0001\" /> <!-- \u0001 -->\n
  31: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1369 \u0001\n
  32: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1371 Could not store spawn in the spawn XML files: \u0001
  33: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1373 Spawn \u0001 could not be added to the spawn XML files: \u0001
  34: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1375 <territory name=\"\u0001
  35: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1377 <npcmaker name=\"\u0001
  36: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1379 Could not remove spawn from the spawn XML files: \u0001
  37: #1447 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1381 The content of the XML file could not be checked: \u0001
  38: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1270 (Ljava/lang/Object;)Ljava/lang/Object;
      #1383 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$0:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
      #1386 (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  39: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1387 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$1:(ILext/mods/gameserver/model/spawn/MultiSpawn;)Z
      #1390 (Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  40: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1392 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$2:(ILext/mods/gameserver/model/spawn/Spawn;)Z
      #1395 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  41: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1270 (Ljava/lang/Object;)Ljava/lang/Object;
      #1397 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$3:(Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
      #1386 (Lext/mods/gameserver/model/spawn/NpcMaker;)Ljava/util/stream/Stream;
  42: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1400 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$4:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
      #1390 (Lext/mods/gameserver/model/spawn/MultiSpawn;)Z
  43: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1287 (Ljava/lang/Object;)Z
      #1403 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$getSpawn$5:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1395 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  44: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1406 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$1:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  45: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1409 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$3:(Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  46: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1412 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$4:(Lext/mods/commons/data/StatSet;Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  47: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1415 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$6:(Lext/mods/gameserver/model/spawn/NpcMaker;Ljava/util/List;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  48: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1418 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$7:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  49: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1421 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$9:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  50: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1270 (Ljava/lang/Object;)Ljava/lang/Object;
      #1424 REF_invokeStatic ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$11:(Ljava/lang/String;Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
      #1427 (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/SpawnData;
  51: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1428 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$10:(Lext/mods/gameserver/model/memo/SpawnMemo;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  52: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1431 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$8:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  53: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1434 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$5:(Ljava/util/Map;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
  54: #1440 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1265 (Ljava/lang/Object;)V
      #1437 REF_invokeVirtual ext/mods/gameserver/data/manager/SpawnManager.lambda$parseDocument$2:(Ljava/util/List;Lorg/w3c/dom/Node;)V
      #1269 (Lorg/w3c/dom/Node;)V
InnerClasses:
  public static final #1456= #1454 of #27; // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  static #314;                            // class ext/mods/gameserver/data/manager/SpawnManager$1
  public static final #1462= #1458 of #1460; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
