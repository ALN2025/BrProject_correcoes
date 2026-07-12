// Bytecode for: ext.mods.Crypta.RandomManager
// File: ext\mods\Crypta\RandomManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Crypta/RandomManager.class
  Last modified 9 de jul de 2026; size 44352 bytes
  MD5 checksum 7e540b54b5de4f67fdfc7940e364685e
  Compiled from "RandomManager.java"
public class ext.mods.Crypta.RandomManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/Crypta/RandomManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 19, methods: 59, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Fieldref           #8.#9        // ext/mods/Crypta/RandomManager.config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
     #8 = Class              #10          // ext/mods/Crypta/RandomManager
     #9 = NameAndType        #11:#12      // config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
    #10 = Utf8               ext/mods/Crypta/RandomManager
    #11 = Utf8               config
    #12 = Utf8               Lext/mods/FarmEventRandom/holder/RamdomConfig;
    #13 = Methodref          #14.#15      // ext/mods/FarmEventRandom/holder/RamdomConfig.getInterval:()I
    #14 = Class              #16          // ext/mods/FarmEventRandom/holder/RamdomConfig
    #15 = NameAndType        #17:#18      // getInterval:()I
    #16 = Utf8               ext/mods/FarmEventRandom/holder/RamdomConfig
    #17 = Utf8               getInterval
    #18 = Utf8               ()I
    #19 = Fieldref           #8.#20       // ext/mods/Crypta/RandomManager.LOGGER:Lext/mods/commons/logging/CLogger;
    #20 = NameAndType        #21:#22      // LOGGER:Lext/mods/commons/logging/CLogger;
    #21 = Utf8               LOGGER
    #22 = Utf8               Lext/mods/commons/logging/CLogger;
    #23 = String             #24          // RandomEvent: Iniciando reload...
    #24 = Utf8               RandomEvent: Iniciando reload...
    #25 = Methodref          #26.#27      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
    #26 = Class              #28          // ext/mods/commons/logging/CLogger
    #27 = NameAndType        #29:#30      // info:(Ljava/lang/Object;)V
    #28 = Utf8               ext/mods/commons/logging/CLogger
    #29 = Utf8               info
    #30 = Utf8               (Ljava/lang/Object;)V
    #31 = Fieldref           #8.#32       // ext/mods/Crypta/RandomManager.isRunning:Z
    #32 = NameAndType        #33:#34      // isRunning:Z
    #33 = Utf8               isRunning
    #34 = Utf8               Z
    #35 = Methodref          #8.#36       // ext/mods/Crypta/RandomManager.stopZones:()V
    #36 = NameAndType        #37:#6       // stopZones:()V
    #37 = Utf8               stopZones
    #38 = Fieldref           #8.#39       // ext/mods/Crypta/RandomManager.eventChecker:Ljava/util/concurrent/ScheduledFuture;
    #39 = NameAndType        #40:#41      // eventChecker:Ljava/util/concurrent/ScheduledFuture;
    #40 = Utf8               eventChecker
    #41 = Utf8               Ljava/util/concurrent/ScheduledFuture;
    #42 = InterfaceMethodref #43.#44      // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
    #43 = Class              #45          // java/util/concurrent/ScheduledFuture
    #44 = NameAndType        #46:#47      // cancel:(Z)Z
    #45 = Utf8               java/util/concurrent/ScheduledFuture
    #46 = Utf8               cancel
    #47 = Utf8               (Z)Z
    #48 = Methodref          #49.#50      // ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
    #49 = Class              #51          // ext/mods/FarmEventRandom/RandomData
    #50 = NameAndType        #52:#53      // getInstance:()Lext/mods/FarmEventRandom/RandomData;
    #51 = Utf8               ext/mods/FarmEventRandom/RandomData
    #52 = Utf8               getInstance
    #53 = Utf8               ()Lext/mods/FarmEventRandom/RandomData;
    #54 = Methodref          #49.#55      // ext/mods/FarmEventRandom/RandomData.reload:()V
    #55 = NameAndType        #56:#6       // reload:()V
    #56 = Utf8               reload
    #57 = Methodref          #8.#58       // ext/mods/Crypta/RandomManager.start:()V
    #58 = NameAndType        #59:#6       // start:()V
    #59 = Utf8               start
    #60 = String             #61          // RandomEvent: Reload completo.
    #61 = Utf8               RandomEvent: Reload completo.
    #62 = Methodref          #49.#63      // ext/mods/FarmEventRandom/RandomData.getFirstConfig:()Lext/mods/FarmEventRandom/holder/RamdomConfig;
    #63 = NameAndType        #64:#65      // getFirstConfig:()Lext/mods/FarmEventRandom/holder/RamdomConfig;
    #64 = Utf8               getFirstConfig
    #65 = Utf8               ()Lext/mods/FarmEventRandom/holder/RamdomConfig;
    #66 = Methodref          #14.#67      // ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
    #67 = NameAndType        #68:#69      // getName:()Ljava/lang/String;
    #68 = Utf8               getName
    #69 = Utf8               ()Ljava/lang/String;
    #70 = Methodref          #49.#71      // ext/mods/FarmEventRandom/RandomData.getMessages:(Ljava/lang/String;)Lext/mods/FarmEventRandom/holder/MessagesHolder;
    #71 = NameAndType        #72:#73      // getMessages:(Ljava/lang/String;)Lext/mods/FarmEventRandom/holder/MessagesHolder;
    #72 = Utf8               getMessages
    #73 = Utf8               (Ljava/lang/String;)Lext/mods/FarmEventRandom/holder/MessagesHolder;
    #74 = Fieldref           #8.#75       // ext/mods/Crypta/RandomManager.messages:Lext/mods/FarmEventRandom/holder/MessagesHolder;
    #75 = NameAndType        #76:#77      // messages:Lext/mods/FarmEventRandom/holder/MessagesHolder;
    #76 = Utf8               messages
    #77 = Utf8               Lext/mods/FarmEventRandom/holder/MessagesHolder;
    #78 = String             #79          // RandomEvent: Nenhum evento encontrado ou configurado. Verifique random_event.xml. Abortando.
    #79 = Utf8               RandomEvent: Nenhum evento encontrado ou configurado. Verifique random_event.xml. Abortando.
    #80 = Methodref          #26.#81      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
    #81 = NameAndType        #82:#30      // error:(Ljava/lang/Object;)V
    #82 = Utf8               error
    #83 = InterfaceMethodref #43.#84      // java/util/concurrent/ScheduledFuture.isCancelled:()Z
    #84 = NameAndType        #85:#86      // isCancelled:()Z
    #85 = Utf8               isCancelled
    #86 = Utf8               ()Z
    #87 = InvokeDynamic      #0:#88       // #0:run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
    #88 = NameAndType        #89:#90      // run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
    #89 = Utf8               run
    #90 = Utf8               (Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
    #91 = Long               1000l
    #93 = Methodref          #94.#95      // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
    #94 = Class              #96          // ext/mods/commons/pool/ThreadPool
    #95 = NameAndType        #97:#98      // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
    #96 = Utf8               ext/mods/commons/pool/ThreadPool
    #97 = Utf8               scheduleAtFixedRate
    #98 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
    #99 = InvokeDynamic      #1:#100      // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #100 = NameAndType        #101:#102    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #101 = Utf8               makeConcatWithConstants
   #102 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #103 = Methodref          #14.#104     // ext/mods/FarmEventRandom/holder/RamdomConfig.isEnabled:()Z
   #104 = NameAndType        #105:#86     // isEnabled:()Z
   #105 = Utf8               isEnabled
   #106 = Methodref          #14.#107     // ext/mods/FarmEventRandom/holder/RamdomConfig.isTimeToRun:()Z
   #107 = NameAndType        #108:#86     // isTimeToRun:()Z
   #108 = Utf8               isTimeToRun
   #109 = Methodref          #110.#111    // java/time/LocalTime.now:()Ljava/time/LocalTime;
   #110 = Class              #112         // java/time/LocalTime
   #111 = NameAndType        #113:#114    // now:()Ljava/time/LocalTime;
   #112 = Utf8               java/time/LocalTime
   #113 = Utf8               now
   #114 = Utf8               ()Ljava/time/LocalTime;
   #115 = Methodref          #110.#116    // java/time/LocalTime.withSecond:(I)Ljava/time/LocalTime;
   #116 = NameAndType        #117:#118    // withSecond:(I)Ljava/time/LocalTime;
   #117 = Utf8               withSecond
   #118 = Utf8               (I)Ljava/time/LocalTime;
   #119 = Methodref          #110.#120    // java/time/LocalTime.withNano:(I)Ljava/time/LocalTime;
   #120 = NameAndType        #121:#118    // withNano:(I)Ljava/time/LocalTime;
   #121 = Utf8               withNano
   #122 = Methodref          #110.#123    // java/time/LocalTime.toString:()Ljava/lang/String;
   #123 = NameAndType        #124:#69     // toString:()Ljava/lang/String;
   #124 = Utf8               toString
   #125 = Fieldref           #8.#126      // ext/mods/Crypta/RandomManager.lastEventTime:Ljava/lang/String;
   #126 = NameAndType        #127:#128    // lastEventTime:Ljava/lang/String;
   #127 = Utf8               lastEventTime
   #128 = Utf8               Ljava/lang/String;
   #129 = Methodref          #130.#131    // java/lang/String.equals:(Ljava/lang/Object;)Z
   #130 = Class              #132         // java/lang/String
   #131 = NameAndType        #133:#134    // equals:(Ljava/lang/Object;)Z
   #132 = Utf8               java/lang/String
   #133 = Utf8               equals
   #134 = Utf8               (Ljava/lang/Object;)Z
   #135 = InvokeDynamic      #2:#100      // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #136 = Methodref          #8.#137      // ext/mods/Crypta/RandomManager.sendQuestionMarkToAllOnline:()V
   #137 = NameAndType        #138:#6      // sendQuestionMarkToAllOnline:()V
   #138 = Utf8               sendQuestionMarkToAllOnline
   #139 = InvokeDynamic      #3:#140      // #3:run:()Ljava/lang/Runnable;
   #140 = NameAndType        #89:#141     // run:()Ljava/lang/Runnable;
   #141 = Utf8               ()Ljava/lang/Runnable;
   #142 = Long               60000l
   #144 = Fieldref           #8.#145      // ext/mods/Crypta/RandomManager.questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
   #145 = NameAndType        #146:#41     // questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
   #146 = Utf8               questionMarkRefresher
   #147 = Class              #148         // java/util/HashMap
   #148 = Utf8               java/util/HashMap
   #149 = Methodref          #147.#3      // java/util/HashMap."<init>":()V
   #150 = Methodref          #14.#151     // ext/mods/FarmEventRandom/holder/RamdomConfig.getPrepareMinutes:()I
   #151 = NameAndType        #152:#18     // getPrepareMinutes:()I
   #152 = Utf8               getPrepareMinutes
   #153 = String             #154         // time
   #154 = Utf8               time
   #155 = InvokeDynamic      #4:#156      // #4:makeConcatWithConstants:(I)Ljava/lang/String;
   #156 = NameAndType        #101:#157    // makeConcatWithConstants:(I)Ljava/lang/String;
   #157 = Utf8               (I)Ljava/lang/String;
   #158 = InterfaceMethodref #159.#160    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #159 = Class              #161         // java/util/Map
   #160 = NameAndType        #162:#163    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #161 = Utf8               java/util/Map
   #162 = Utf8               put
   #163 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #164 = InvokeDynamic      #5:#156      // #5:makeConcatWithConstants:(I)Ljava/lang/String;
   #165 = Methodref          #166.#167    // ext/mods/FarmEventRandom/holder/MessagesHolder.getOnPrepare:()Ljava/util/List;
   #166 = Class              #168         // ext/mods/FarmEventRandom/holder/MessagesHolder
   #167 = NameAndType        #169:#170    // getOnPrepare:()Ljava/util/List;
   #168 = Utf8               ext/mods/FarmEventRandom/holder/MessagesHolder
   #169 = Utf8               getOnPrepare
   #170 = Utf8               ()Ljava/util/List;
   #171 = InterfaceMethodref #172.#173    // java/util/List.iterator:()Ljava/util/Iterator;
   #172 = Class              #174         // java/util/List
   #173 = NameAndType        #175:#176    // iterator:()Ljava/util/Iterator;
   #174 = Utf8               java/util/List
   #175 = Utf8               iterator
   #176 = Utf8               ()Ljava/util/Iterator;
   #177 = InterfaceMethodref #178.#179    // java/util/Iterator.hasNext:()Z
   #178 = Class              #180         // java/util/Iterator
   #179 = NameAndType        #181:#86     // hasNext:()Z
   #180 = Utf8               java/util/Iterator
   #181 = Utf8               hasNext
   #182 = InterfaceMethodref #178.#183    // java/util/Iterator.next:()Ljava/lang/Object;
   #183 = NameAndType        #184:#185    // next:()Ljava/lang/Object;
   #184 = Utf8               next
   #185 = Utf8               ()Ljava/lang/Object;
   #186 = Methodref          #8.#187      // ext/mods/Crypta/RandomManager.formatMessage:(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
   #187 = NameAndType        #188:#189    // formatMessage:(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
   #188 = Utf8               formatMessage
   #189 = Utf8               (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
   #190 = InvokeDynamic      #6:#191      // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #191 = NameAndType        #101:#192    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #192 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #193 = Methodref          #194.#195    // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;Z)V
   #194 = Class              #196         // ext/mods/gameserver/model/World
   #195 = NameAndType        #197:#198    // announceToOnlinePlayers:(Ljava/lang/String;Z)V
   #196 = Utf8               ext/mods/gameserver/model/World
   #197 = Utf8               announceToOnlinePlayers
   #198 = Utf8               (Ljava/lang/String;Z)V
   #199 = InvokeDynamic      #7:#88       // #7:run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
   #200 = Long               60l
   #202 = Methodref          #94.#203     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #203 = NameAndType        #204:#205    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #204 = Utf8               schedule
   #205 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #206 = Fieldref           #8.#207      // ext/mods/Crypta/RandomManager.zoneCleanerTask:Ljava/util/concurrent/ScheduledFuture;
   #207 = NameAndType        #208:#41     // zoneCleanerTask:Ljava/util/concurrent/ScheduledFuture;
   #208 = Utf8               zoneCleanerTask
   #209 = InterfaceMethodref #43.#210     // java/util/concurrent/ScheduledFuture.isDone:()Z
   #210 = NameAndType        #211:#86     // isDone:()Z
   #211 = Utf8               isDone
   #212 = Methodref          #8.#213      // ext/mods/Crypta/RandomManager.getEventPauseDelay:()I
   #213 = NameAndType        #214:#18     // getEventPauseDelay:()I
   #214 = Utf8               getEventPauseDelay
   #215 = InvokeDynamic      #8:#216      // #8:run:(I)Ljava/lang/Runnable;
   #216 = NameAndType        #89:#217     // run:(I)Ljava/lang/Runnable;
   #217 = Utf8               (I)Ljava/lang/Runnable;
   #218 = Long               5000l
   #220 = Fieldref           #221.#222    // ext/mods/Config.DEVELOPER:Z
   #221 = Class              #223         // ext/mods/Config
   #222 = NameAndType        #224:#34     // DEVELOPER:Z
   #223 = Utf8               ext/mods/Config
   #224 = Utf8               DEVELOPER
   #225 = String             #226         // [Debug Event] activateZonesAndSpawn: Activating zones...
   #226 = Utf8               [Debug Event] activateZonesAndSpawn: Activating zones...
   #227 = Class              #228         // java/util/ArrayList
   #228 = Utf8               java/util/ArrayList
   #229 = Methodref          #230.#231    // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #230 = Class              #232         // ext/mods/gameserver/data/manager/ZoneManager
   #231 = NameAndType        #52:#233     // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #232 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #233 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #234 = Class              #235         // ext/mods/gameserver/model/zone/type/RandomZone
   #235 = Utf8               ext/mods/gameserver/model/zone/type/RandomZone
   #236 = Methodref          #230.#237    // ext/mods/gameserver/data/manager/ZoneManager.getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #237 = NameAndType        #238:#239    // getAllZones:(Ljava/lang/Class;)Ljava/util/Collection;
   #238 = Utf8               getAllZones
   #239 = Utf8               (Ljava/lang/Class;)Ljava/util/Collection;
   #240 = Methodref          #227.#241    // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #241 = NameAndType        #5:#242      // "<init>":(Ljava/util/Collection;)V
   #242 = Utf8               (Ljava/util/Collection;)V
   #243 = InterfaceMethodref #172.#244    // java/util/List.isEmpty:()Z
   #244 = NameAndType        #245:#86     // isEmpty:()Z
   #245 = Utf8               isEmpty
   #246 = String             #247         // {} Nenhuma zona do tipo RandomZone encontrada.
   #247 = Utf8               {} Nenhuma zona do tipo RandomZone encontrada.
   #248 = Methodref          #26.#249     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #249 = NameAndType        #250:#251    // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #250 = Utf8               warn
   #251 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #252 = InterfaceMethodref #172.#253    // java/util/List.stream:()Ljava/util/stream/Stream;
   #253 = NameAndType        #254:#255    // stream:()Ljava/util/stream/Stream;
   #254 = Utf8               stream
   #255 = Utf8               ()Ljava/util/stream/Stream;
   #256 = InvokeDynamic      #9:#257      // #9:test:()Ljava/util/function/Predicate;
   #257 = NameAndType        #258:#259    // test:()Ljava/util/function/Predicate;
   #258 = Utf8               test
   #259 = Utf8               ()Ljava/util/function/Predicate;
   #260 = InterfaceMethodref #261.#262    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #261 = Class              #263         // java/util/stream/Stream
   #262 = NameAndType        #264:#265    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #263 = Utf8               java/util/stream/Stream
   #264 = Utf8               filter
   #265 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #266 = Methodref          #267.#268    // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
   #267 = Class              #269         // java/util/stream/Collectors
   #268 = NameAndType        #270:#271    // toList:()Ljava/util/stream/Collector;
   #269 = Utf8               java/util/stream/Collectors
   #270 = Utf8               toList
   #271 = Utf8               ()Ljava/util/stream/Collector;
   #272 = InterfaceMethodref #261.#273    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #273 = NameAndType        #274:#275    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #274 = Utf8               collect
   #275 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #276 = String             #277         // {} Nenhuma das RandomZones encontradas tem configuração no random_event.xml.
   #277 = Utf8               {} Nenhuma das RandomZones encontradas tem configuração no random_event.xml.
   #278 = InvokeDynamic      #10:#257     // #10:test:()Ljava/util/function/Predicate;
   #279 = String             #280         // {} Nenhuma zona configurada está marcada como \'active=true\'. Nenhuma zona será ativada.
   #280 = Utf8               {} Nenhuma zona configurada está marcada como \'active=true\'. Nenhuma zona será ativada.
   #281 = InterfaceMethodref #172.#282    // java/util/List.size:()I
   #282 = NameAndType        #283:#18     // size:()I
   #283 = Utf8               size
   #284 = Methodref          #14.#285     // ext/mods/FarmEventRandom/holder/RamdomConfig.getZoneValue:()I
   #285 = NameAndType        #286:#18     // getZoneValue:()I
   #286 = Utf8               getZoneValue
   #287 = InvokeDynamic      #11:#288     // #11:makeConcatWithConstants:(II)Ljava/lang/String;
   #288 = NameAndType        #101:#289    // makeConcatWithConstants:(II)Ljava/lang/String;
   #289 = Utf8               (II)Ljava/lang/String;
   #290 = Methodref          #291.#292    // java/util/Collections.shuffle:(Ljava/util/List;)V
   #291 = Class              #293         // java/util/Collections
   #292 = NameAndType        #294:#295    // shuffle:(Ljava/util/List;)V
   #293 = Utf8               java/util/Collections
   #294 = Utf8               shuffle
   #295 = Utf8               (Ljava/util/List;)V
   #296 = Fieldref           #8.#297      // ext/mods/Crypta/RandomManager.activeZones:Ljava/util/List;
   #297 = NameAndType        #298:#299    // activeZones:Ljava/util/List;
   #298 = Utf8               activeZones
   #299 = Utf8               Ljava/util/List;
   #300 = InterfaceMethodref #172.#301    // java/util/List.clear:()V
   #301 = NameAndType        #302:#6      // clear:()V
   #302 = Utf8               clear
   #303 = Methodref          #304.#305    // java/lang/Math.min:(II)I
   #304 = Class              #306         // java/lang/Math
   #305 = NameAndType        #307:#308    // min:(II)I
   #306 = Utf8               java/lang/Math
   #307 = Utf8               min
   #308 = Utf8               (II)I
   #309 = InterfaceMethodref #172.#310    // java/util/List.get:(I)Ljava/lang/Object;
   #310 = NameAndType        #311:#312    // get:(I)Ljava/lang/Object;
   #311 = Utf8               get
   #312 = Utf8               (I)Ljava/lang/Object;
   #313 = Methodref          #234.#314    // ext/mods/gameserver/model/zone/type/RandomZone.setActive:(Z)V
   #314 = NameAndType        #315:#316    // setActive:(Z)V
   #315 = Utf8               setActive
   #316 = Utf8               (Z)V
   #317 = InterfaceMethodref #172.#318    // java/util/List.add:(Ljava/lang/Object;)Z
   #318 = NameAndType        #319:#134    // add:(Ljava/lang/Object;)Z
   #319 = Utf8               add
   #320 = Methodref          #234.#321    // ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
   #321 = NameAndType        #322:#18     // getId:()I
   #322 = Utf8               getId
   #323 = Methodref          #49.#324     // ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
   #324 = NameAndType        #325:#326    // getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
   #325 = Utf8               getZoneData
   #326 = Utf8               (Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
   #327 = Methodref          #328.#329    // ext/mods/FarmEventRandom/holder/RandomZoneData.isPartyZone:()Z
   #328 = Class              #330         // ext/mods/FarmEventRandom/holder/RandomZoneData
   #329 = NameAndType        #331:#86     // isPartyZone:()Z
   #330 = Utf8               ext/mods/FarmEventRandom/holder/RandomZoneData
   #331 = Utf8               isPartyZone
   #332 = Methodref          #328.#333    // ext/mods/FarmEventRandom/holder/RandomZoneData.isEnchanterZone:()Z
   #333 = NameAndType        #334:#86     // isEnchanterZone:()Z
   #334 = Utf8               isEnchanterZone
   #335 = Methodref          #234.#67     // ext/mods/gameserver/model/zone/type/RandomZone.getName:()Ljava/lang/String;
   #336 = InvokeDynamic      #12:#337     // #12:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #337 = NameAndType        #101:#338    // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #338 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
   #339 = Methodref          #328.#340    // ext/mods/FarmEventRandom/holder/RandomZoneData.getZoneId:()I
   #340 = NameAndType        #341:#18     // getZoneId:()I
   #341 = Utf8               getZoneId
   #342 = Methodref          #328.#343    // ext/mods/FarmEventRandom/holder/RandomZoneData.isVip:()Z
   #343 = NameAndType        #344:#86     // isVip:()Z
   #344 = Utf8               isVip
   #345 = Methodref          #328.#346    // ext/mods/FarmEventRandom/holder/RandomZoneData.isDwarvenOnly:()Z
   #346 = NameAndType        #347:#86     // isDwarvenOnly:()Z
   #347 = Utf8               isDwarvenOnly
   #348 = Methodref          #328.#349    // ext/mods/FarmEventRandom/holder/RandomZoneData.getEnchantChance:()D
   #349 = NameAndType        #350:#351    // getEnchantChance:()D
   #350 = Utf8               getEnchantChance
   #351 = Utf8               ()D
   #352 = Methodref          #328.#353    // ext/mods/FarmEventRandom/holder/RandomZoneData.getMaxEnchant:()I
   #353 = NameAndType        #354:#18     // getMaxEnchant:()I
   #354 = Utf8               getMaxEnchant
   #355 = InvokeDynamic      #13:#356     // #13:makeConcatWithConstants:(IZZZZDI)Ljava/lang/String;
   #356 = NameAndType        #101:#357    // makeConcatWithConstants:(IZZZZDI)Ljava/lang/String;
   #357 = Utf8               (IZZZZDI)Ljava/lang/String;
   #358 = InvokeDynamic      #14:#156     // #14:makeConcatWithConstants:(I)Ljava/lang/String;
   #359 = Methodref          #166.#360    // ext/mods/FarmEventRandom/holder/MessagesHolder.getOnZone:()Ljava/util/List;
   #360 = NameAndType        #361:#170    // getOnZone:()Ljava/util/List;
   #361 = Utf8               getOnZone
   #362 = String             #363         // %zone%
   #363 = Utf8               %zone%
   #364 = Methodref          #130.#365    // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #365 = NameAndType        #366:#367    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #366 = Utf8               replace
   #367 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #368 = InvokeDynamic      #15:#100     // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #369 = InvokeDynamic      #16:#370     // #16:makeConcatWithConstants:(Ljava/lang/String;DI)Ljava/lang/String;
   #370 = NameAndType        #101:#371    // makeConcatWithConstants:(Ljava/lang/String;DI)Ljava/lang/String;
   #371 = Utf8               (Ljava/lang/String;DI)Ljava/lang/String;
   #372 = String             #373         // RandomEvent: No zones were activated after selection.
   #373 = Utf8               RandomEvent: No zones were activated after selection.
   #374 = Methodref          #26.#375     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #375 = NameAndType        #250:#30     // warn:(Ljava/lang/Object;)V
   #376 = Methodref          #8.#377      // ext/mods/Crypta/RandomManager.cleanPreviousMonsters:()V
   #377 = NameAndType        #378:#6      // cleanPreviousMonsters:()V
   #378 = Utf8               cleanPreviousMonsters
   #379 = Methodref          #8.#380      // ext/mods/Crypta/RandomManager.spawnEventMonsters:()V
   #380 = NameAndType        #381:#6      // spawnEventMonsters:()V
   #381 = Utf8               spawnEventMonsters
   #382 = Methodref          #8.#383      // ext/mods/Crypta/RandomManager.startZoneCleaner:()V
   #383 = NameAndType        #384:#6      // startZoneCleaner:()V
   #384 = Utf8               startZoneCleaner
   #385 = Methodref          #8.#386      // ext/mods/Crypta/RandomManager.startCountdown:()V
   #386 = NameAndType        #387:#6      // startCountdown:()V
   #387 = Utf8               startCountdown
   #388 = Methodref          #8.#389      // ext/mods/Crypta/RandomManager.scheduleZoneSwitch:()V
   #389 = NameAndType        #390:#6      // scheduleZoneSwitch:()V
   #390 = Utf8               scheduleZoneSwitch
   #391 = Methodref          #8.#392      // ext/mods/Crypta/RandomManager.startPartyCheckTask:()V
   #392 = NameAndType        #393:#6      // startPartyCheckTask:()V
   #393 = Utf8               startPartyCheckTask
   #394 = Methodref          #8.#395      // ext/mods/Crypta/RandomManager.startEnchanterZonePvpFlagTask:()V
   #395 = NameAndType        #396:#6      // startEnchanterZonePvpFlagTask:()V
   #396 = Utf8               startEnchanterZonePvpFlagTask
   #397 = Methodref          #8.#398      // ext/mods/Crypta/RandomManager.sendTeleportConfirmationToAllPlayers:()V
   #398 = NameAndType        #399:#6      // sendTeleportConfirmationToAllPlayers:()V
   #399 = Utf8               sendTeleportConfirmationToAllPlayers
   #400 = String             #401         // [Debug Spawn] spawnEventMonsters: Starting...
   #401 = Utf8               [Debug Spawn] spawnEventMonsters: Starting...
   #402 = Fieldref           #8.#403      // ext/mods/Crypta/RandomManager.oldMonsters:Ljava/util/List;
   #403 = NameAndType        #404:#299    // oldMonsters:Ljava/util/List;
   #404 = Utf8               oldMonsters
   #405 = InvokeDynamic      #17:#156     // #17:makeConcatWithConstants:(I)Ljava/lang/String;
   #406 = Class              #407         // ext/mods/gameserver/model/actor/Npc
   #407 = Utf8               ext/mods/gameserver/model/actor/Npc
   #408 = Methodref          #406.#409    // ext/mods/gameserver/model/actor/Npc.isDead:()Z
   #409 = NameAndType        #410:#86     // isDead:()Z
   #410 = Utf8               isDead
   #411 = Methodref          #406.#412    // ext/mods/gameserver/model/actor/Npc.isDecayed:()Z
   #412 = NameAndType        #413:#86     // isDecayed:()Z
   #413 = Utf8               isDecayed
   #414 = Methodref          #406.#415    // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #415 = NameAndType        #416:#417    // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #416 = Utf8               getSpawn
   #417 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
   #418 = Methodref          #419.#420    // ext/mods/gameserver/model/spawn/ASpawn.setRespawnDelay:(I)V
   #419 = Class              #421         // ext/mods/gameserver/model/spawn/ASpawn
   #420 = NameAndType        #422:#423    // setRespawnDelay:(I)V
   #421 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
   #422 = Utf8               setRespawnDelay
   #423 = Utf8               (I)V
   #424 = Methodref          #406.#425    // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #425 = NameAndType        #426:#6      // deleteMe:()V
   #426 = Utf8               deleteMe
   #427 = Fieldref           #8.#428      // ext/mods/Crypta/RandomManager.activeSpawns:Ljava/util/List;
   #428 = NameAndType        #429:#299    // activeSpawns:Ljava/util/List;
   #429 = Utf8               activeSpawns
   #430 = InvokeDynamic      #18:#156     // #18:makeConcatWithConstants:(I)Ljava/lang/String;
   #431 = Methodref          #328.#432    // ext/mods/FarmEventRandom/holder/RandomZoneData.useOriginals:()Z
   #432 = NameAndType        #433:#86     // useOriginals:()Z
   #433 = Utf8               useOriginals
   #434 = InvokeDynamic      #19:#435     // #19:makeConcatWithConstants:(IZ)Ljava/lang/String;
   #435 = NameAndType        #101:#436    // makeConcatWithConstants:(IZ)Ljava/lang/String;
   #436 = Utf8               (IZ)Ljava/lang/String;
   #437 = Methodref          #419.#438    // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #438 = NameAndType        #439:#440    // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #439 = Utf8               getSpawnLocation
   #440 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #441 = Methodref          #442.#443    // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
   #442 = Class              #444         // ext/mods/gameserver/model/location/SpawnLocation
   #443 = NameAndType        #445:#18     // getX:()I
   #444 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #445 = Utf8               getX
   #446 = Methodref          #442.#447    // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
   #447 = NameAndType        #448:#18     // getY:()I
   #448 = Utf8               getY
   #449 = Methodref          #442.#450    // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
   #450 = NameAndType        #451:#18     // getZ:()I
   #451 = Utf8               getZ
   #452 = Methodref          #234.#453    // ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(III)Z
   #453 = NameAndType        #454:#455    // isInsideZone:(III)Z
   #454 = Utf8               isInsideZone
   #455 = Utf8               (III)Z
   #456 = Methodref          #328.#457    // ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultTitle:()Ljava/lang/String;
   #457 = NameAndType        #458:#69     // getDefaultTitle:()Ljava/lang/String;
   #458 = Utf8               getDefaultTitle
   #459 = Methodref          #328.#460    // ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultRespawnDelay:()I
   #460 = NameAndType        #461:#18     // getDefaultRespawnDelay:()I
   #461 = Utf8               getDefaultRespawnDelay
   #462 = Methodref          #419.#463    // ext/mods/gameserver/model/spawn/ASpawn.getRespawnDelay:()I
   #463 = NameAndType        #464:#18     // getRespawnDelay:()I
   #464 = Utf8               getRespawnDelay
   #465 = Methodref          #406.#466    // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #466 = NameAndType        #467:#18     // getNpcId:()I
   #467 = Utf8               getNpcId
   #468 = InvokeDynamic      #20:#469     // #20:makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
   #469 = NameAndType        #101:#470    // makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
   #470 = Utf8               (ILjava/lang/String;I)Ljava/lang/String;
   #471 = Class              #472         // ext/mods/gameserver/model/spawn/Spawn
   #472 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #473 = Methodref          #419.#474    // ext/mods/gameserver/model/spawn/ASpawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #474 = NameAndType        #475:#476    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #475 = Utf8               getTemplate
   #476 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #477 = Methodref          #471.#478    // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #478 = NameAndType        #5:#479      // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #479 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #480 = Methodref          #442.#481    // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
   #481 = NameAndType        #482:#18     // getHeading:()I
   #482 = Utf8               getHeading
   #483 = Methodref          #471.#484    // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
   #484 = NameAndType        #485:#486    // setLoc:(IIII)V
   #485 = Utf8               setLoc
   #486 = Utf8               (IIII)V
   #487 = Methodref          #471.#420    // ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
   #488 = Methodref          #489.#490    // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #489 = Class              #491         // ext/mods/gameserver/data/manager/SpawnManager
   #490 = NameAndType        #52:#492     // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #491 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #492 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #493 = Methodref          #489.#494    // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #494 = NameAndType        #495:#496    // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #495 = Utf8               addSpawn
   #496 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
   #497 = Methodref          #471.#498    // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #498 = NameAndType        #499:#500    // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #499 = Utf8               doSpawn
   #500 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
   #501 = Methodref          #471.#502    // ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #502 = NameAndType        #503:#504    // getNpc:()Lext/mods/gameserver/model/actor/Npc;
   #503 = Utf8               getNpc
   #504 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #505 = Methodref          #406.#506    // ext/mods/gameserver/model/actor/Npc.setTitle:(Ljava/lang/String;)V
   #506 = NameAndType        #507:#508    // setTitle:(Ljava/lang/String;)V
   #507 = Utf8               setTitle
   #508 = Utf8               (Ljava/lang/String;)V
   #509 = Methodref          #406.#510    // ext/mods/gameserver/model/actor/Npc.updateAbnormalEffect:()V
   #510 = NameAndType        #511:#6      // updateAbnormalEffect:()V
   #511 = Utf8               updateAbnormalEffect
   #512 = Class              #513         // java/lang/Exception
   #513 = Utf8               java/lang/Exception
   #514 = String             #515         // RandomEvent: Erro ao re-spawnar monstro original: {}
   #515 = Utf8               RandomEvent: Erro ao re-spawnar monstro original: {}
   #516 = Methodref          #512.#517    // java/lang/Exception.getMessage:()Ljava/lang/String;
   #517 = NameAndType        #518:#69     // getMessage:()Ljava/lang/String;
   #518 = Utf8               getMessage
   #519 = Methodref          #328.#520    // ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
   #520 = NameAndType        #521:#170    // getCustomSpawns:()Ljava/util/List;
   #521 = Utf8               getCustomSpawns
   #522 = Class              #523         // ext/mods/FarmEventRandom/holder/RandomSpawnHolder
   #523 = Utf8               ext/mods/FarmEventRandom/holder/RandomSpawnHolder
   #524 = Methodref          #522.#525    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getCount:()I
   #525 = NameAndType        #526:#18     // getCount:()I
   #526 = Utf8               getCount
   #527 = Methodref          #522.#443    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getX:()I
   #528 = Methodref          #522.#447    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getY:()I
   #529 = Methodref          #522.#450    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getZ:()I
   #530 = String             #531         // RandomEvent: Coordenadas (0,0,0) não são suportadas. NPC {}.
   #531 = Utf8               RandomEvent: Coordenadas (0,0,0) não são suportadas. NPC {}.
   #532 = Methodref          #522.#466    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getNpcId:()I
   #533 = Methodref          #534.#535    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #534 = Class              #536         // java/lang/Integer
   #535 = NameAndType        #537:#538    // valueOf:(I)Ljava/lang/Integer;
   #536 = Utf8               java/lang/Integer
   #537 = Utf8               valueOf
   #538 = Utf8               (I)Ljava/lang/Integer;
   #539 = Methodref          #26.#540     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #540 = NameAndType        #82:#251     // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #541 = String             #542         // RandomEvent: Coordenadas ({},{},{}) NPC {} FORA da zona {}.
   #542 = Utf8               RandomEvent: Coordenadas ({},{},{}) NPC {} FORA da zona {}.
   #543 = Class              #544         // ext/mods/gameserver/model/location/Location
   #544 = Utf8               ext/mods/gameserver/model/location/Location
   #545 = Methodref          #543.#546    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #546 = NameAndType        #5:#547      // "<init>":(III)V
   #547 = Utf8               (III)V
   #548 = InvokeDynamic      #21:#288     // #21:makeConcatWithConstants:(II)Ljava/lang/String;
   #549 = Methodref          #550.#551    // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #550 = Class              #552         // ext/mods/gameserver/data/xml/NpcData
   #551 = NameAndType        #52:#553     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #552 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #553 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #554 = Methodref          #550.#555    // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #555 = NameAndType        #475:#556    // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #556 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #557 = Integer            65535
   #558 = Methodref          #559.#560    // ext/mods/commons/random/Rnd.get:(I)I
   #559 = Class              #561         // ext/mods/commons/random/Rnd
   #560 = NameAndType        #311:#562    // get:(I)I
   #561 = Utf8               ext/mods/commons/random/Rnd
   #562 = Utf8               (I)I
   #563 = Methodref          #543.#443    // ext/mods/gameserver/model/location/Location.getX:()I
   #564 = Methodref          #543.#447    // ext/mods/gameserver/model/location/Location.getY:()I
   #565 = Methodref          #543.#450    // ext/mods/gameserver/model/location/Location.getZ:()I
   #566 = Methodref          #522.#567    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRange:()I
   #567 = NameAndType        #568:#18     // getRange:()I
   #568 = Utf8               getRange
   #569 = Methodref          #559.#570    // ext/mods/commons/random/Rnd.nextDouble:()D
   #570 = NameAndType        #571:#351    // nextDouble:()D
   #571 = Utf8               nextDouble
   #572 = Double             2.0d
   #574 = Double             3.141592653589793d
   #576 = Methodref          #304.#577    // java/lang/Math.cos:(D)D
   #577 = NameAndType        #578:#579    // cos:(D)D
   #578 = Utf8               cos
   #579 = Utf8               (D)D
   #580 = Methodref          #559.#581    // ext/mods/commons/random/Rnd.get:(II)I
   #581 = NameAndType        #311:#308    // get:(II)I
   #582 = Methodref          #304.#583    // java/lang/Math.sin:(D)D
   #583 = NameAndType        #584:#579    // sin:(D)D
   #584 = Utf8               sin
   #585 = Methodref          #586.#587    // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #586 = Class              #588         // ext/mods/gameserver/geoengine/GeoEngine
   #587 = NameAndType        #52:#589     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #588 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #589 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #590 = Methodref          #586.#591    // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #591 = NameAndType        #592:#593    // getHeight:(III)S
   #592 = Utf8               getHeight
   #593 = Utf8               (III)S
   #594 = Methodref          #522.#463    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRespawnDelay:()I
   #595 = Methodref          #522.#596    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getTitle:()Ljava/lang/String;
   #596 = NameAndType        #597:#69     // getTitle:()Ljava/lang/String;
   #597 = Utf8               getTitle
   #598 = Methodref          #130.#244    // java/lang/String.isEmpty:()Z
   #599 = String             #600         // RandomEvent: Exception spawning custom NPC ID {}: {}
   #600 = Utf8               RandomEvent: Exception spawning custom NPC ID {}: {}
   #601 = String             #602         //  hora
   #602 = Utf8                hora
   #603 = String             #604         //  hora(s)
   #604 = Utf8                hora(s)
   #605 = InvokeDynamic      #22:#606     // #22:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #606 = NameAndType        #101:#607    // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #607 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
   #608 = Methodref          #166.#609    // ext/mods/FarmEventRandom/holder/MessagesHolder.getOnStart:()Ljava/util/List;
   #609 = NameAndType        #610:#170    // getOnStart:()Ljava/util/List;
   #610 = Utf8               getOnStart
   #611 = Fieldref           #8.#612      // ext/mods/Crypta/RandomManager.timeRemaining:J
   #612 = NameAndType        #613:#614    // timeRemaining:J
   #613 = Utf8               timeRemaining
   #614 = Utf8               J
   #615 = Methodref          #14.#616     // ext/mods/FarmEventRandom/holder/RamdomConfig.getAnnounceEndMinutes:()I
   #616 = NameAndType        #617:#18     // getAnnounceEndMinutes:()I
   #617 = Utf8               getAnnounceEndMinutes
   #618 = Fieldref           #8.#619      // ext/mods/Crypta/RandomManager.screenMessageTask:Ljava/util/concurrent/ScheduledFuture;
   #619 = NameAndType        #620:#41     // screenMessageTask:Ljava/util/concurrent/ScheduledFuture;
   #620 = Utf8               screenMessageTask
   #621 = InvokeDynamic      #23:#622     // #23:run:(ZJ)Ljava/lang/Runnable;
   #622 = NameAndType        #89:#623     // run:(ZJ)Ljava/lang/Runnable;
   #623 = Utf8               (ZJ)Ljava/lang/Runnable;
   #624 = Fieldref           #8.#625      // ext/mods/Crypta/RandomManager.zoneSwitchTask:Ljava/util/concurrent/ScheduledFuture;
   #625 = NameAndType        #626:#41     // zoneSwitchTask:Ljava/util/concurrent/ScheduledFuture;
   #626 = Utf8               zoneSwitchTask
   #627 = InvokeDynamic      #24:#88      // #24:run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
   #628 = Methodref          #234.#629    // ext/mods/gameserver/model/zone/type/RandomZone.getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
   #629 = NameAndType        #630:#631    // getKnownTypeInside:(Ljava/lang/Class;)Ljava/util/List;
   #630 = Utf8               getKnownTypeInside
   #631 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
   #632 = InvokeDynamic      #25:#156     // #25:makeConcatWithConstants:(I)Ljava/lang/String;
   #633 = String             #634         // [Debug Event] Event STOPPING. Cleaning up zones.
   #634 = Utf8               [Debug Event] Event STOPPING. Cleaning up zones.
   #635 = Double             60.0d
   #637 = Methodref          #304.#638    // java/lang/Math.round:(D)J
   #638 = NameAndType        #639:#640    // round:(D)J
   #639 = Utf8               round
   #640 = Utf8               (D)J
   #641 = Methodref          #130.#642    // java/lang/String.valueOf:(J)Ljava/lang/String;
   #642 = NameAndType        #537:#643    // valueOf:(J)Ljava/lang/String;
   #643 = Utf8               (J)Ljava/lang/String;
   #644 = String             #645         // next_time
   #645 = Utf8               next_time
   #646 = Methodref          #8.#647      // ext/mods/Crypta/RandomManager.getNextEventTimeFormatted:()Ljava/lang/String;
   #647 = NameAndType        #648:#69     // getNextEventTimeFormatted:()Ljava/lang/String;
   #648 = Utf8               getNextEventTimeFormatted
   #649 = Methodref          #166.#650    // ext/mods/FarmEventRandom/holder/MessagesHolder.getOnEnd:()Ljava/util/List;
   #650 = NameAndType        #651:#170    // getOnEnd:()Ljava/util/List;
   #651 = Utf8               getOnEnd
   #652 = Fieldref           #8.#653      // ext/mods/Crypta/RandomManager._partyCheckTask:Ljava/util/concurrent/ScheduledFuture;
   #653 = NameAndType        #654:#41     // _partyCheckTask:Ljava/util/concurrent/ScheduledFuture;
   #654 = Utf8               _partyCheckTask
   #655 = Fieldref           #8.#656      // ext/mods/Crypta/RandomManager._enchanterZonePvpFlagTask:Ljava/util/concurrent/ScheduledFuture;
   #656 = NameAndType        #657:#41     // _enchanterZonePvpFlagTask:Ljava/util/concurrent/ScheduledFuture;
   #657 = Utf8               _enchanterZonePvpFlagTask
   #658 = InvokeDynamic      #26:#156     // #26:makeConcatWithConstants:(I)Ljava/lang/String;
   #659 = Methodref          #489.#660    // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #660 = NameAndType        #661:#496    // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #661 = Utf8               deleteSpawn
   #662 = InvokeDynamic      #27:#156     // #27:makeConcatWithConstants:(I)Ljava/lang/String;
   #663 = Methodref          #419.#498    // ext/mods/gameserver/model/spawn/ASpawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #664 = String             #665         // RandomEvent: Erro ao re-spawnar NPC antigo: {}
   #665 = Utf8               RandomEvent: Erro ao re-spawnar NPC antigo: {}
   #666 = Methodref          #667.#67     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #667 = Class              #668         // ext/mods/gameserver/model/actor/Player
   #668 = Utf8               ext/mods/gameserver/model/actor/Player
   #669 = Methodref          #670.#67     // ext/mods/gameserver/model/actor/Attackable.getName:()Ljava/lang/String;
   #670 = Class              #671         // ext/mods/gameserver/model/actor/Attackable
   #671 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #672 = InvokeDynamic      #28:#191     // #28:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #673 = InvokeDynamic      #29:#674     // #29:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #674 = NameAndType        #258:#675    // test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #675 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #676 = InterfaceMethodref #261.#677    // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
   #677 = NameAndType        #678:#679    // anyMatch:(Ljava/util/function/Predicate;)Z
   #678 = Utf8               anyMatch
   #679 = Utf8               (Ljava/util/function/Predicate;)Z
   #680 = Methodref          #670.#466    // ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
   #681 = InvokeDynamic      #30:#156     // #30:makeConcatWithConstants:(I)Ljava/lang/String;
   #682 = Methodref          #234.#683    // ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
   #683 = NameAndType        #454:#684    // isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
   #684 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #685 = String             #686         // [Debug Kill] No ZoneData found for the zone monster is in!
   #686 = Utf8               [Debug Kill] No ZoneData found for the zone monster is in!
   #687 = InvokeDynamic      #31:#674     // #31:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #688 = InterfaceMethodref #261.#689    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #689 = NameAndType        #690:#691    // findFirst:()Ljava/util/Optional;
   #690 = Utf8               findFirst
   #691 = Utf8               ()Ljava/util/Optional;
   #692 = Methodref          #693.#694    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #693 = Class              #695         // java/util/Optional
   #694 = NameAndType        #696:#697    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #695 = Utf8               java/util/Optional
   #696 = Utf8               orElse
   #697 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #698 = Methodref          #522.#699    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getDrops:()Ljava/util/List;
   #699 = NameAndType        #700:#170    // getDrops:()Ljava/util/List;
   #700 = Utf8               getDrops
   #701 = String             #702         // [Debug Kill] Monster is CUSTOM spawn. Using custom drops.
   #702 = Utf8               [Debug Kill] Monster is CUSTOM spawn. Using custom drops.
   #703 = Methodref          #328.#704    // ext/mods/FarmEventRandom/holder/RandomZoneData.dropsOriginals:()Z
   #704 = NameAndType        #705:#86     // dropsOriginals:()Z
   #705 = Utf8               dropsOriginals
   #706 = String             #707         // [Debug Kill] Monster is ORIGINAL spawn and DropsOriginals=true. Using default zone drops.
   #707 = Utf8               [Debug Kill] Monster is ORIGINAL spawn and DropsOriginals=true. Using default zone drops.
   #708 = Methodref          #328.#709    // ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultDrops:()Ljava/util/List;
   #709 = NameAndType        #710:#170    // getDefaultDrops:()Ljava/util/List;
   #710 = Utf8               getDefaultDrops
   #711 = Class              #712         // ext/mods/FarmEventRandom/holder/DropHolder
   #712 = Utf8               ext/mods/FarmEventRandom/holder/DropHolder
   #713 = Methodref          #711.#714    // ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
   #714 = NameAndType        #715:#18     // getChance:()I
   #715 = Utf8               getChance
   #716 = Methodref          #711.#717    // ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
   #717 = NameAndType        #718:#18     // getItemId:()I
   #718 = Utf8               getItemId
   #719 = InvokeDynamic      #32:#288     // #32:makeConcatWithConstants:(II)Ljava/lang/String;
   #720 = Methodref          #711.#525    // ext/mods/FarmEventRandom/holder/DropHolder.getCount:()I
   #721 = Methodref          #667.#722    // ext/mods/gameserver/model/actor/Player.isInParty:()Z
   #722 = NameAndType        #723:#86     // isInParty:()Z
   #723 = Utf8               isInParty
   #724 = Methodref          #667.#725    // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #725 = NameAndType        #726:#727    // getParty:()Lext/mods/gameserver/model/group/Party;
   #726 = Utf8               getParty
   #727 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #728 = Methodref          #729.#730    // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #729 = Class              #731         // ext/mods/gameserver/model/group/Party
   #730 = NameAndType        #732:#170    // getMembers:()Ljava/util/List;
   #731 = Utf8               ext/mods/gameserver/model/group/Party
   #732 = Utf8               getMembers
   #733 = Methodref          #667.#734    // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #734 = NameAndType        #735:#736    // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #735 = Utf8               addItem
   #736 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #737 = Methodref          #667.#738    // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #738 = NameAndType        #739:#86     // isOnline:()Z
   #739 = Utf8               isOnline
   #740 = Fieldref           #221.#741    // ext/mods/Config.PARTY_RANGE:I
   #741 = NameAndType        #742:#743    // PARTY_RANGE:I
   #742 = Utf8               PARTY_RANGE
   #743 = Utf8               I
   #744 = Methodref          #667.#745    // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #745 = NameAndType        #746:#747    // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #746 = Utf8               isIn3DRadius
   #747 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #748 = InvokeDynamic      #33:#288     // #33:makeConcatWithConstants:(II)Ljava/lang/String;
   #749 = String             #750         // [Debug Kill] Monster is ORIGINAL spawn and DropsOriginals=false. No event drops added.
   #750 = Utf8               [Debug Kill] Monster is ORIGINAL spawn and DropsOriginals=false. No event drops added.
   #751 = String             #752         // [Debug Kill] No drops configured or applicable for this monster!
   #752 = Utf8               [Debug Kill] No drops configured or applicable for this monster!
   #753 = InvokeDynamic      #34:#674     // #34:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #754 = InvokeDynamic      #35:#674     // #35:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #755 = InvokeDynamic      #36:#674     // #36:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #756 = InvokeDynamic      #37:#674     // #37:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #757 = Methodref          #522.#758    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateXp:()D
   #758 = NameAndType        #759:#351    // getRateXp:()D
   #759 = Utf8               getRateXp
   #760 = Double             -1.0d
   #762 = String             #763         // [Debug Rate] Usando rateXP específico do Spawn {} para NPC {}
   #763 = Utf8               [Debug Rate] Usando rateXP específico do Spawn {} para NPC {}
   #764 = Methodref          #765.#766    // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #765 = Class              #767         // java/lang/Double
   #766 = NameAndType        #537:#768    // valueOf:(D)Ljava/lang/Double;
   #767 = Utf8               java/lang/Double
   #768 = Utf8               (D)Ljava/lang/Double;
   #769 = Methodref          #26.#770     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #770 = NameAndType        #29:#251     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #771 = String             #772         // [Debug Rate] Usando rateXP padrão da Zona {} ({}) para NPC {}
   #772 = Utf8               [Debug Rate] Usando rateXP padrão da Zona {} ({}) para NPC {}
   #773 = Methodref          #328.#758    // ext/mods/FarmEventRandom/holder/RandomZoneData.getRateXp:()D
   #774 = InvokeDynamic      #38:#674     // #38:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #775 = InvokeDynamic      #39:#674     // #39:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #776 = Methodref          #522.#777    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateSp:()D
   #777 = NameAndType        #778:#351    // getRateSp:()D
   #778 = Utf8               getRateSp
   #779 = String             #780         // [Debug Rate] Usando rateSP específico do Spawn {} para NPC {}
   #780 = Utf8               [Debug Rate] Usando rateSP específico do Spawn {} para NPC {}
   #781 = String             #782         // [Debug Rate] Usando rateSP padrão da Zona {} ({}) para NPC {}
   #782 = Utf8               [Debug Rate] Usando rateSP padrão da Zona {} ({}) para NPC {}
   #783 = Methodref          #328.#777    // ext/mods/FarmEventRandom/holder/RandomZoneData.getRateSp:()D
   #784 = InvokeDynamic      #40:#674     // #40:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #785 = InvokeDynamic      #41:#674     // #41:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #786 = Methodref          #522.#787    // ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateAdena:()D
   #787 = NameAndType        #788:#351    // getRateAdena:()D
   #788 = Utf8               getRateAdena
   #789 = String             #790         // [Debug Rate] Usando rateAdena específico do Spawn {} para NPC {}
   #790 = Utf8               [Debug Rate] Usando rateAdena específico do Spawn {} para NPC {}
   #791 = String             #792         // [Debug Rate] Usando rateAdena padrão da Zona {} ({}) para NPC {}
   #792 = Utf8               [Debug Rate] Usando rateAdena padrão da Zona {} ({}) para NPC {}
   #793 = Methodref          #328.#787    // ext/mods/FarmEventRandom/holder/RandomZoneData.getRateAdena:()D
   #794 = InvokeDynamic      #42:#674     // #42:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
   #795 = Methodref          #227.#3      // java/util/ArrayList."<init>":()V
   #796 = InvokeDynamic      #43:#797     // #43:makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
   #797 = NameAndType        #101:#798    // makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
   #798 = Utf8               (Ljava/lang/String;D)Ljava/lang/String;
   #799 = Methodref          #667.#800    // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #800 = NameAndType        #801:#802    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #801 = Utf8               getInventory
   #802 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #803 = Methodref          #804.#805    // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
   #804 = Class              #806         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #805 = NameAndType        #807:#170    // getPaperdollItems:()Ljava/util/List;
   #806 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #807 = Utf8               getPaperdollItems
   #808 = Class              #809         // ext/mods/gameserver/model/item/instance/ItemInstance
   #809 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #810 = Methodref          #808.#811    // ext/mods/gameserver/model/item/instance/ItemInstance.isEnchantable:()Z
   #811 = NameAndType        #812:#86     // isEnchantable:()Z
   #812 = Utf8               isEnchantable
   #813 = Methodref          #808.#814    // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #814 = NameAndType        #815:#18     // getEnchantLevel:()I
   #815 = Utf8               getEnchantLevel
   #816 = Methodref          #808.#817    // ext/mods/gameserver/model/item/instance/ItemInstance.isWeapon:()Z
   #817 = NameAndType        #818:#86     // isWeapon:()Z
   #818 = Utf8               isWeapon
   #819 = Methodref          #808.#820    // ext/mods/gameserver/model/item/instance/ItemInstance.isArmor:()Z
   #820 = NameAndType        #821:#86     // isArmor:()Z
   #821 = Utf8               isArmor
   #822 = InvokeDynamic      #44:#100     // #44:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #823 = Methodref          #808.#824    // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
   #824 = NameAndType        #825:#826    // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
   #825 = Utf8               setEnchantLevel
   #826 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
   #827 = Methodref          #667.#828    // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #828 = NameAndType        #829:#6      // broadcastUserInfo:()V
   #829 = Utf8               broadcastUserInfo
   #830 = Methodref          #808.#831    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemName:()Ljava/lang/String;
   #831 = NameAndType        #832:#69     // getItemName:()Ljava/lang/String;
   #832 = Utf8               getItemName
   #833 = InvokeDynamic      #45:#834     // #45:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #834 = NameAndType        #101:#835    // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #835 = Utf8               (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #836 = Methodref          #667.#837    // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #837 = NameAndType        #838:#508    // sendMessage:(Ljava/lang/String;)V
   #838 = Utf8               sendMessage
   #839 = InvokeDynamic      #46:#840     // #46:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #840 = NameAndType        #101:#841    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #841 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
   #842 = String             #843         //
   #843 = Utf8
   #844 = InterfaceMethodref #159.#845    // java/util/Map.entrySet:()Ljava/util/Set;
   #845 = NameAndType        #846:#847    // entrySet:()Ljava/util/Set;
   #846 = Utf8               entrySet
   #847 = Utf8               ()Ljava/util/Set;
   #848 = InterfaceMethodref #849.#173    // java/util/Set.iterator:()Ljava/util/Iterator;
   #849 = Class              #850         // java/util/Set
   #850 = Utf8               java/util/Set
   #851 = Class              #852         // java/util/Map$Entry
   #852 = Utf8               java/util/Map$Entry
   #853 = InterfaceMethodref #851.#854    // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #854 = NameAndType        #855:#185    // getKey:()Ljava/lang/Object;
   #855 = Utf8               getKey
   #856 = InterfaceMethodref #851.#857    // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #857 = NameAndType        #858:#185    // getValue:()Ljava/lang/Object;
   #858 = Utf8               getValue
   #859 = InvokeDynamic      #47:#100     // #47:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #860 = Class              #861         // java/lang/CharSequence
   #861 = Utf8               java/lang/CharSequence
   #862 = String             #863         // unknown
   #863 = Utf8               unknown
   #864 = Methodref          #865.#866    // java/time/LocalDateTime.now:()Ljava/time/LocalDateTime;
   #865 = Class              #867         // java/time/LocalDateTime
   #866 = NameAndType        #113:#868    // now:()Ljava/time/LocalDateTime;
   #867 = Utf8               java/time/LocalDateTime
   #868 = Utf8               ()Ljava/time/LocalDateTime;
   #869 = Methodref          #865.#870    // java/time/LocalDateTime.toLocalTime:()Ljava/time/LocalTime;
   #870 = NameAndType        #871:#114    // toLocalTime:()Ljava/time/LocalTime;
   #871 = Utf8               toLocalTime
   #872 = Methodref          #865.#873    // java/time/LocalDateTime.getDayOfWeek:()Ljava/time/DayOfWeek;
   #873 = NameAndType        #874:#875    // getDayOfWeek:()Ljava/time/DayOfWeek;
   #874 = Utf8               getDayOfWeek
   #875 = Utf8               ()Ljava/time/DayOfWeek;
   #876 = Methodref          #877.#878    // java/time/DayOfWeek.getValue:()I
   #877 = Class              #879         // java/time/DayOfWeek
   #878 = NameAndType        #858:#18     // getValue:()I
   #879 = Utf8               java/time/DayOfWeek
   #880 = Methodref          #14.#881     // ext/mods/FarmEventRandom/holder/RamdomConfig.getActiveDays:()Ljava/util/Set;
   #881 = NameAndType        #882:#847    // getActiveDays:()Ljava/util/Set;
   #882 = Utf8               getActiveDays
   #883 = InterfaceMethodref #849.#884    // java/util/Set.contains:(Ljava/lang/Object;)Z
   #884 = NameAndType        #885:#134    // contains:(Ljava/lang/Object;)Z
   #885 = Utf8               contains
   #886 = Methodref          #14.#887     // ext/mods/FarmEventRandom/holder/RamdomConfig.getActiveTimes:()Ljava/util/List;
   #887 = NameAndType        #888:#170    // getActiveTimes:()Ljava/util/List;
   #888 = Utf8               getActiveTimes
   #889 = InterfaceMethodref #261.#890    // java/util/stream/Stream.sorted:()Ljava/util/stream/Stream;
   #890 = NameAndType        #891:#255    // sorted:()Ljava/util/stream/Stream;
   #891 = Utf8               sorted
   #892 = Methodref          #110.#893    // java/time/LocalTime.isAfter:(Ljava/time/LocalTime;)Z
   #893 = NameAndType        #894:#895    // isAfter:(Ljava/time/LocalTime;)Z
   #894 = Utf8               isAfter
   #895 = Utf8               (Ljava/time/LocalTime;)Z
   #896 = Methodref          #865.#897    // java/time/LocalDateTime.plusDays:(J)Ljava/time/LocalDateTime;
   #897 = NameAndType        #898:#899    // plusDays:(J)Ljava/time/LocalDateTime;
   #898 = Utf8               plusDays
   #899 = Utf8               (J)Ljava/time/LocalDateTime;
   #900 = Methodref          #865.#901    // java/time/LocalDateTime.with:(Ljava/time/temporal/TemporalAdjuster;)Ljava/time/LocalDateTime;
   #901 = NameAndType        #902:#903    // with:(Ljava/time/temporal/TemporalAdjuster;)Ljava/time/LocalDateTime;
   #902 = Utf8               with
   #903 = Utf8               (Ljava/time/temporal/TemporalAdjuster;)Ljava/time/LocalDateTime;
   #904 = String             #905         // EEE HH:mm
   #905 = Utf8               EEE HH:mm
   #906 = Methodref          #907.#908    // java/time/format/DateTimeFormatter.ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #907 = Class              #909         // java/time/format/DateTimeFormatter
   #908 = NameAndType        #910:#911    // ofPattern:(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #909 = Utf8               java/time/format/DateTimeFormatter
   #910 = Utf8               ofPattern
   #911 = Utf8               (Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;
   #912 = Methodref          #865.#913    // java/time/LocalDateTime.format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #913 = NameAndType        #914:#915    // format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #914 = Utf8               format
   #915 = Utf8               (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
   #916 = InvokeDynamic      #48:#88      // #48:run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
   #917 = Long               30000l
   #919 = String             #920         // [Debug Party Check] Tarefa iniciada.
   #920 = Utf8               [Debug Party Check] Tarefa iniciada.
   #921 = String             #922         // [Debug Party Check] Tarefa cancelada (evento inativo).
   #922 = Utf8               [Debug Party Check] Tarefa cancelada (evento inativo).
   #923 = String             #924         // [Debug Party Check] Verificando integridade das parties...
   #924 = Utf8               [Debug Party Check] Verificando integridade das parties...
   #925 = Class              #926         // java/util/HashSet
   #926 = Utf8               java/util/HashSet
   #927 = Methodref          #925.#3      // java/util/HashSet."<init>":()V
   #928 = InvokeDynamic      #49:#337     // #49:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #929 = Methodref          #667.#930    // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #930 = NameAndType        #931:#86     // isGM:()Z
   #931 = Utf8               isGM
   #932 = Methodref          #729.#933    // ext/mods/gameserver/model/group/Party.getLeaderObjectId:()I
   #933 = NameAndType        #934:#18     // getLeaderObjectId:()I
   #934 = Utf8               getLeaderObjectId
   #935 = String             #936         // Você não está mais em uma Party.
   #936 = Utf8               Você não está mais em uma Party.
   #937 = InvokeDynamic      #50:#100     // #50:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #938 = Methodref          #729.#939    // ext/mods/gameserver/model/group/Party.getMembersCount:()I
   #939 = NameAndType        #940:#18     // getMembersCount:()I
   #940 = Utf8               getMembersCount
   #941 = Methodref          #328.#942    // ext/mods/FarmEventRandom/holder/RandomZoneData.getMinPartySize:()I
   #942 = NameAndType        #943:#18     // getMinPartySize:()I
   #943 = Utf8               getMinPartySize
   #944 = InvokeDynamic      #51:#156     // #51:makeConcatWithConstants:(I)Ljava/lang/String;
   #945 = InvokeDynamic      #52:#337     // #52:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
   #946 = String             #947         // Todos os membros da sua Party devem permanecer dentro da zona do evento.
   #947 = Utf8               Todos os membros da sua Party devem permanecer dentro da zona do evento.
   #948 = String             #949         // NULO
   #949 = Utf8               NULO
   #950 = InvokeDynamic      #53:#191     // #53:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #951 = InterfaceMethodref #849.#318    // java/util/Set.add:(Ljava/lang/Object;)Z
   #952 = Methodref          #234.#953    // ext/mods/gameserver/model/zone/type/RandomZone.getReturnLocation:()Lext/mods/gameserver/model/location/Location;
   #953 = NameAndType        #954:#955    // getReturnLocation:()Lext/mods/gameserver/model/location/Location;
   #954 = Utf8               getReturnLocation
   #955 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #956 = Fieldref           #957.#958    // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
   #957 = Class              #959         // ext/mods/gameserver/network/SystemMessageId
   #958 = NameAndType        #960:#961    // S1:Lext/mods/gameserver/network/SystemMessageId;
   #959 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #960 = Utf8               S1
   #961 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #962 = Methodref          #963.#964    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #963 = Class              #965         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #964 = NameAndType        #966:#967    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #965 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #966 = Utf8               getSystemMessage
   #967 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #968 = Methodref          #963.#969    // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #969 = NameAndType        #970:#971    // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #970 = Utf8               addString
   #971 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #972 = Methodref          #729.#973    // ext/mods/gameserver/model/group/Party.getLeader:()Lext/mods/gameserver/model/actor/Player;
   #973 = NameAndType        #974:#975    // getLeader:()Lext/mods/gameserver/model/actor/Player;
   #974 = Utf8               getLeader
   #975 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #976 = InvokeDynamic      #54:#977     // #54:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #977 = NameAndType        #101:#978    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #978 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #979 = Methodref          #667.#980    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #980 = NameAndType        #981:#982    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #981 = Utf8               sendPacket
   #982 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #983 = Methodref          #667.#984    // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
   #984 = NameAndType        #985:#986    // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
   #985 = Utf8               teleToLocation
   #986 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #987 = InvokeDynamic      #55:#977     // #55:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #988 = InvokeDynamic      #56:#191     // #56:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #989 = InvokeDynamic      #57:#88      // #57:run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
   #990 = String             #991         // [Debug Enchanter Zone] Task de atualização de PvP flag iniciada (intervalo: 1 segundo).
   #991 = Utf8               [Debug Enchanter Zone] Task de atualização de PvP flag iniciada (intervalo: 1 segundo).
   #992 = String             #993         // [Debug Enchanter Zone] Task de PvP flag cancelada (evento inativo).
   #993 = Utf8               [Debug Enchanter Zone] Task de PvP flag cancelada (evento inativo).
   #994 = Methodref          #667.#995    // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
   #995 = NameAndType        #996:#997    // getPvpFlag:()B
   #996 = Utf8               getPvpFlag
   #997 = Utf8               ()B
   #998 = Methodref          #667.#999    // ext/mods/gameserver/model/actor/Player.updatePvPFlag:(I)V
   #999 = NameAndType        #1000:#423   // updatePvPFlag:(I)V
  #1000 = Utf8               updatePvPFlag
  #1001 = Methodref          #1002.#1003  // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #1002 = Class              #1004        // ext/mods/gameserver/taskmanager/PvpFlagTaskManager
  #1003 = NameAndType        #52:#1005    // getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #1004 = Utf8               ext/mods/gameserver/taskmanager/PvpFlagTaskManager
  #1005 = Utf8               ()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
  #1006 = Methodref          #1002.#1007  // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.remove:(Lext/mods/gameserver/model/actor/Player;Z)V
  #1007 = NameAndType        #1008:#1009  // remove:(Lext/mods/gameserver/model/actor/Player;Z)V
  #1008 = Utf8               remove
  #1009 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #1010 = Class              #1011        // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #1011 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #1012 = Methodref          #957.#321    // ext/mods/gameserver/network/SystemMessageId.getId:()I
  #1013 = Methodref          #1010.#1014  // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
  #1014 = NameAndType        #5:#423      // "<init>":(I)V
  #1015 = String             #1016        // Você deseja se teleportar para a Farm Zone?
  #1016 = Utf8               Você deseja se teleportar para a Farm Zone?
  #1017 = Methodref          #1010.#1018  // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1018 = NameAndType        #970:#1019   // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1019 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1020 = Methodref          #1010.#1021  // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1021 = NameAndType        #1022:#1023  // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1022 = Utf8               addTime
  #1023 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1024 = Methodref          #194.#1025   // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #1025 = NameAndType        #52:#1026    // getInstance:()Lext/mods/gameserver/model/World;
  #1026 = Utf8               ()Lext/mods/gameserver/model/World;
  #1027 = Methodref          #194.#1028   // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #1028 = NameAndType        #1029:#1030  // getPlayers:()Ljava/util/Collection;
  #1029 = Utf8               getPlayers
  #1030 = Utf8               ()Ljava/util/Collection;
  #1031 = InterfaceMethodref #1032.#173   // java/util/Collection.iterator:()Ljava/util/Iterator;
  #1032 = Class              #1033        // java/util/Collection
  #1033 = Utf8               java/util/Collection
  #1034 = Methodref          #667.#409    // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #1035 = Methodref          #667.#1036   // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #1036 = NameAndType        #1037:#86    // isInOlympiadMode:()Z
  #1037 = Utf8               isInOlympiadMode
  #1038 = Methodref          #667.#1039   // ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
  #1039 = NameAndType        #1040:#1041  // getDungeon:()Lext/mods/dungeon/Dungeon;
  #1040 = Utf8               getDungeon
  #1041 = Utf8               ()Lext/mods/dungeon/Dungeon;
  #1042 = String             #1043        // farm_event_teleport
  #1043 = Utf8               farm_event_teleport
  #1044 = Methodref          #667.#1045   // ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
  #1045 = NameAndType        #1046:#508   // setLastCommand:(Ljava/lang/String;)V
  #1046 = Utf8               setLastCommand
  #1047 = Methodref          #667.#1048   // ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
  #1048 = NameAndType        #1049:#69    // getLastCommand:()Ljava/lang/String;
  #1049 = Utf8               getLastCommand
  #1050 = Methodref          #667.#1051   // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1051 = NameAndType        #1052:#1053  // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1052 = Utf8               getCast
  #1053 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1054 = Methodref          #1055.#1056  // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #1055 = Class              #1057        // ext/mods/gameserver/model/actor/cast/PlayerCast
  #1056 = NameAndType        #1058:#86    // isCastingNow:()Z
  #1057 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #1058 = Utf8               isCastingNow
  #1059 = Methodref          #667.#1060   // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #1060 = NameAndType        #1061:#86    // isTeleporting:()Z
  #1061 = Utf8               isTeleporting
  #1062 = String             #1063        // Teleporte cancelado. Sua condição mudou.
  #1063 = Utf8               Teleporte cancelado. Sua condição mudou.
  #1064 = Fieldref           #1065.#1066  // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1065 = Class              #1067        // ext/mods/gameserver/network/serverpackets/ActionFailed
  #1066 = NameAndType        #1068:#1069  // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1067 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #1068 = Utf8               STATIC_PACKET
  #1069 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1070 = String             #1071        // Você não pode usar este comando dentro de uma dungeon.
  #1071 = Utf8               Você não pode usar este comando dentro de uma dungeon.
  #1072 = Fieldref           #1073.#1074  // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #1073 = Class              #1075        // ext/mods/gameserver/enums/ZoneId
  #1074 = NameAndType        #1076:#1077  // PVP:Lext/mods/gameserver/enums/ZoneId;
  #1075 = Utf8               ext/mods/gameserver/enums/ZoneId
  #1076 = Utf8               PVP
  #1077 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #1078 = Methodref          #667.#1079   // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1079 = NameAndType        #454:#1080   // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1080 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #1081 = Fieldref           #1073.#1082  // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #1082 = NameAndType        #1083:#1077  // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #1083 = Utf8               SIEGE
  #1084 = String             #1085        // Você não pode usar este comando desta área.
  #1085 = Utf8               Você não pode usar este comando desta área.
  #1086 = String             #1087        // Nenhuma Farm Zone ativa no momento.
  #1087 = Utf8               Nenhuma Farm Zone ativa no momento.
  #1088 = Methodref          #559.#1089   // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #1089 = NameAndType        #311:#1090   // get:(Ljava/util/List;)Ljava/lang/Object;
  #1090 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #1091 = String             #1092        // Erro ao selecionar zona do evento.
  #1092 = Utf8               Erro ao selecionar zona do evento.
  #1093 = Methodref          #328.#1094   // ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
  #1094 = NameAndType        #439:#955    // getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
  #1095 = Fieldref           #1096.#1097  // ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #1096 = Class              #1098        // ext/mods/gameserver/enums/SpawnType
  #1097 = NameAndType        #1099:#1100  // NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #1098 = Utf8               ext/mods/gameserver/enums/SpawnType
  #1099 = Utf8               NORMAL
  #1100 = Utf8               Lext/mods/gameserver/enums/SpawnType;
  #1101 = Methodref          #234.#1102   // ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #1102 = NameAndType        #1103:#1104  // getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #1103 = Utf8               getRndSpawn
  #1104 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
  #1105 = Methodref          #471.#438    // ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1106 = Methodref          #406.#443    // ext/mods/gameserver/model/actor/Npc.getX:()I
  #1107 = Methodref          #406.#447    // ext/mods/gameserver/model/actor/Npc.getY:()I
  #1108 = Methodref          #406.#450    // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #1109 = String             #1110        // Não foi possível encontrar um ponto de teleporte na Farm Zone.
  #1110 = Utf8               Não foi possível encontrar um ponto de teleporte na Farm Zone.
  #1111 = Class              #1112        // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #1112 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #1113 = Methodref          #1111.#1114  // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #1114 = NameAndType        #5:#1115     // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #1115 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #1116 = Methodref          #667.#1117   // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1117 = NameAndType        #1118:#982   // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1118 = Utf8               broadcastPacket
  #1119 = Class              #1120        // ext/mods/gameserver/network/serverpackets/SetupGauge
  #1120 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #1121 = Fieldref           #1122.#1123  // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #1122 = Class              #1124        // ext/mods/gameserver/enums/GaugeColor
  #1123 = NameAndType        #1125:#1126  // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #1124 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #1125 = Utf8               BLUE
  #1126 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #1127 = Methodref          #1119.#1128  // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #1128 = NameAndType        #5:#1129     // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #1129 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #1130 = InvokeDynamic      #58:#1131    // #58:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #1131 = NameAndType        #89:#1132    // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #1132 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #1133 = Long               17000l
  #1135 = Fieldref           #1136.#1137  // ext/mods/Crypta/RandomManager$SingletonHolder._instance:Lext/mods/Crypta/RandomManager;
  #1136 = Class              #1138        // ext/mods/Crypta/RandomManager$SingletonHolder
  #1137 = NameAndType        #1139:#1140  // _instance:Lext/mods/Crypta/RandomManager;
  #1138 = Utf8               ext/mods/Crypta/RandomManager$SingletonHolder
  #1139 = Utf8               _instance
  #1140 = Utf8               Lext/mods/Crypta/RandomManager;
  #1141 = Class              #1142        // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #1142 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #1143 = Methodref          #1141.#1014  // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #1144 = Methodref          #1145.#1146  // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #1145 = Class              #1147        // ext/mods/gameserver/data/HTMLData
  #1146 = NameAndType        #52:#1148    // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #1147 = Utf8               ext/mods/gameserver/data/HTMLData
  #1148 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #1149 = Methodref          #667.#1150   // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #1150 = NameAndType        #1151:#1152  // getLocale:()Ljava/util/Locale;
  #1151 = Utf8               getLocale
  #1152 = Utf8               ()Ljava/util/Locale;
  #1153 = String             #1154        // html/mods/tournament/tutorial_alert_random.htm
  #1154 = Utf8               html/mods/tournament/tutorial_alert_random.htm
  #1155 = Methodref          #1145.#1156  // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #1156 = NameAndType        #1157:#1158  // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #1157 = Utf8               getHtm
  #1158 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #1159 = String             #1160        // Random Event
  #1160 = Utf8               Random Event
  #1161 = String             #1162        //  hour.
  #1162 = Utf8                hour.
  #1163 = String             #1164        //  hours.
  #1164 = Utf8                hours.
  #1165 = InvokeDynamic      #59:#834     // #59:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
  #1166 = String             #1167        // %message%
  #1167 = Utf8               %message%
  #1168 = Methodref          #667.#1169   // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #1169 = NameAndType        #1170:#86    // isInCombat:()Z
  #1170 = Utf8               isInCombat
  #1171 = Methodref          #670.#415    // ext/mods/gameserver/model/actor/Attackable.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #1172 = InvokeDynamic      #60:#1173    // #60:test:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1173 = NameAndType        #258:#1174   // test:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1174 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1175 = Methodref          #471.#474    // ext/mods/gameserver/model/spawn/Spawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1176 = Methodref          #1177.#466   // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #1177 = Class              #1178        // ext/mods/gameserver/model/actor/template/NpcTemplate
  #1178 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #1179 = InvokeDynamic      #61:#1173    // #61:test:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1180 = InvokeDynamic      #62:#1173    // #62:test:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1181 = InvokeDynamic      #63:#1173    // #63:test:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1182 = InvokeDynamic      #64:#1173    // #64:test:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Ljava/util/function/Predicate;
  #1183 = Long               10000l
  #1185 = Long               3600000l
  #1187 = Methodref          #166.#1188   // ext/mods/FarmEventRandom/holder/MessagesHolder.getOnAuto:()Ljava/util/List;
  #1188 = NameAndType        #1189:#170   // getOnAuto:()Ljava/util/List;
  #1189 = Utf8               getOnAuto
  #1190 = String             #1191        // %dh
  #1191 = Utf8               %dh
  #1192 = InvokeDynamic      #65:#1193    // #65:makeConcatWithConstants:(J)Ljava/lang/String;
  #1193 = NameAndType        #101:#643    // makeConcatWithConstants:(J)Ljava/lang/String;
  #1194 = String             #1195        // %dm
  #1195 = Utf8               %dm
  #1196 = InvokeDynamic      #66:#1193    // #66:makeConcatWithConstants:(J)Ljava/lang/String;
  #1197 = String             #1198        // %ds
  #1198 = Utf8               %ds
  #1199 = InvokeDynamic      #67:#1193    // #67:makeConcatWithConstants:(J)Ljava/lang/String;
  #1200 = Methodref          #328.#1201   // ext/mods/FarmEventRandom/holder/RandomZoneData.isActive:()Z
  #1201 = NameAndType        #1202:#86    // isActive:()Z
  #1202 = Utf8               isActive
  #1203 = Methodref          #670.#409    // ext/mods/gameserver/model/actor/Attackable.isDead:()Z
  #1204 = Methodref          #670.#412    // ext/mods/gameserver/model/actor/Attackable.isDecayed:()Z
  #1205 = InvokeDynamic      #68:#674     // #68:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
  #1206 = InvokeDynamic      #69:#337     // #69:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #1207 = Methodref          #670.#425    // ext/mods/gameserver/model/actor/Attackable.deleteMe:()V
  #1208 = Methodref          #1209.#67    // java/lang/Class.getName:()Ljava/lang/String;
  #1209 = Class              #1210        // java/lang/Class
  #1210 = Utf8               java/lang/Class
  #1211 = Methodref          #26.#1212    // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1212 = NameAndType        #5:#508      // "<init>":(Ljava/lang/String;)V
  #1213 = Methodref          #291.#1214   // java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
  #1214 = NameAndType        #1215:#1216  // synchronizedList:(Ljava/util/List;)Ljava/util/List;
  #1215 = Utf8               synchronizedList
  #1216 = Utf8               (Ljava/util/List;)Ljava/util/List;
  #1217 = Utf8               Signature
  #1218 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;
  #1219 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
  #1220 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;
  #1221 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #1222 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #1223 = Utf8               ConstantValue
  #1224 = Integer            2005
  #1225 = Utf8               COUNTDOWN_INTERVAL
  #1226 = Integer            1000
  #1227 = Utf8               PARTY_CHECK_INTERVAL
  #1228 = Integer            30000
  #1229 = Utf8               Code
  #1230 = Utf8               LineNumberTable
  #1231 = Utf8               LocalVariableTable
  #1232 = Utf8               this
  #1233 = Utf8               StackMapTable
  #1234 = Utf8               checkStartEvent
  #1235 = Utf8               formatted
  #1236 = Utf8               msg
  #1237 = Utf8               currentTime
  #1238 = Utf8               data
  #1239 = Utf8               Ljava/util/Map;
  #1240 = Utf8               LocalVariableTypeTable
  #1241 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #1242 = Utf8               pauseDelay
  #1243 = Utf8               activateZonesAndSpawn
  #1244 = Utf8               zone
  #1245 = Utf8               Lext/mods/gameserver/model/zone/type/RandomZone;
  #1246 = Utf8               zData
  #1247 = Utf8               Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #1248 = Utf8               i
  #1249 = Utf8               allZones
  #1250 = Utf8               configuredZones
  #1251 = Utf8               eligibleZones
  #1252 = Utf8               hasPartyZone
  #1253 = Utf8               hasEnchanterZone
  #1254 = Utf8               npc
  #1255 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1256 = Utf8               newEventSpawn
  #1257 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #1258 = Utf8               newNpc
  #1259 = Utf8               e
  #1260 = Utf8               Ljava/lang/Exception;
  #1261 = Utf8               oldSpawn
  #1262 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #1263 = Utf8               title
  #1264 = Utf8               respawnDelay
  #1265 = Utf8               loc
  #1266 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #1267 = Utf8               oldNpc
  #1268 = Utf8               radius
  #1269 = Utf8               angle
  #1270 = Utf8               D
  #1271 = Utf8               template
  #1272 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1273 = Utf8               finalX
  #1274 = Utf8               finalY
  #1275 = Utf8               finalZ
  #1276 = Utf8               heading
  #1277 = Utf8               spawn
  #1278 = Utf8               centerPoint
  #1279 = Utf8               Lext/mods/gameserver/model/location/Location;
  #1280 = Utf8               holder
  #1281 = Utf8               Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
  #1282 = Utf8               zoneData
  #1283 = Utf8               intervalHours
  #1284 = Utf8               durationText
  #1285 = Utf8               announceIntervalMinutes
  #1286 = Utf8               announceIntervalMs
  #1287 = Utf8               enableTimedAnnouncements
  #1288 = Utf8               originalRespawn
  #1289 = Utf8               onKill
  #1290 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
  #1291 = Utf8               amount
  #1292 = Utf8               member
  #1293 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1294 = Utf8               members
  #1295 = Utf8               baseAmount
  #1296 = Utf8               remainder
  #1297 = Utf8               totalAmount
  #1298 = Utf8               drop
  #1299 = Utf8               Lext/mods/FarmEventRandom/holder/DropHolder;
  #1300 = Utf8               customSpawnData
  #1301 = Utf8               dropsToUse
  #1302 = Utf8               player
  #1303 = Utf8               monster
  #1304 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #1305 = Utf8               isEventMonster
  #1306 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #1307 = Utf8               Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
  #1308 = Utf8               shouldCancelOriginalDrop
  #1309 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)Z
  #1310 = Utf8               getActiveRateXp
  #1311 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)D
  #1312 = Utf8               getActiveRateSp
  #1313 = Utf8               getActiveRateAdena
  #1314 = Utf8               getZoneDataForZone
  #1315 = Utf8               (Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
  #1316 = Utf8               activeZone
  #1317 = Utf8               getActiveZones
  #1318 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;
  #1319 = Utf8               isEventRunning
  #1320 = Utf8               getActiveSpawns
  #1321 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
  #1322 = Utf8               onPvPKill
  #1323 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
  #1324 = Utf8               killerInZone
  #1325 = Utf8               victimInZone
  #1326 = Utf8               item
  #1327 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1328 = Utf8               killer
  #1329 = Utf8               victim
  #1330 = Utf8               killerZoneData
  #1331 = Utf8               victimZoneData
  #1332 = Utf8               sameZone
  #1333 = Utf8               enchantableItems
  #1334 = Utf8               paperdollItems
  #1335 = Utf8               itemToEnchant
  #1336 = Utf8               newEnchantLevel
  #1337 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #1338 = Utf8               entry
  #1339 = Utf8               Ljava/util/Map$Entry;
  #1340 = Utf8               values
  #1341 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;
  #1342 = Utf8               (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;
  #1343 = Utf8               nextEvent
  #1344 = Utf8               Ljava/time/LocalDateTime;
  #1345 = Utf8               Ljava/time/LocalTime;
  #1346 = Utf8               sortedTimes
  #1347 = Utf8               dayToCheck
  #1348 = Utf8               currentDay
  #1349 = Utf8               Ljava/util/List<Ljava/time/LocalTime;>;
  #1350 = Utf8               checkPartyIntegrity
  #1351 = Utf8               returnLoc
  #1352 = Utf8               sm
  #1353 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1354 = Utf8               party
  #1355 = Utf8               Lext/mods/gameserver/model/group/Party;
  #1356 = Utf8               expelParty
  #1357 = Utf8               reason
  #1358 = Utf8               playersInside
  #1359 = Utf8               processedPartyLeaders
  #1360 = Utf8               Ljava/util/Set;
  #1361 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #1362 = Utf8               updateEnchanterZonePvpFlags
  #1363 = Utf8               dlg
  #1364 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #1365 = Utf8               handleEventTeleportConfirmation
  #1366 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #1367 = Utf8               spawnLoc
  #1368 = Utf8               selectedSpawn
  #1369 = Utf8               zoneSpawns
  #1370 = Utf8               confirmed
  #1371 = Utf8               targetZone
  #1372 = Utf8               finalLoc
  #1373 = Utf8               SOE_VISUAL_SKILL_ID
  #1374 = Utf8               SOE_VISUAL_SKILL_LEVEL
  #1375 = Utf8               CAST_TIME_MS
  #1376 = Utf8               ()Lext/mods/Crypta/RandomManager;
  #1377 = Utf8               online
  #1378 = Utf8               getTutorialAlertHtml
  #1379 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #1380 = Utf8               html
  #1381 = Utf8               eventName
  #1382 = Utf8               lambda$handleEventTeleportConfirmation$0
  #1383 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1384 = Utf8               lambda$isEventMonster$0
  #1385 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1386 = Utf8               lambda$getActiveRateAdena$1
  #1387 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1388 = Utf8               s
  #1389 = Utf8               lambda$getActiveRateAdena$2
  #1390 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1391 = Utf8               as
  #1392 = Utf8               lambda$getActiveRateAdena$0
  #1393 = Utf8               lambda$getActiveRateSp$1
  #1394 = Utf8               lambda$getActiveRateSp$2
  #1395 = Utf8               lambda$getActiveRateSp$0
  #1396 = Utf8               lambda$getActiveRateXp$1
  #1397 = Utf8               lambda$getActiveRateXp$2
  #1398 = Utf8               lambda$getActiveRateXp$0
  #1399 = Utf8               lambda$shouldCancelOriginalDrop$1
  #1400 = Utf8               lambda$shouldCancelOriginalDrop$2
  #1401 = Utf8               lambda$shouldCancelOriginalDrop$0
  #1402 = Utf8               lambda$onKill$1
  #1403 = Utf8               lambda$onKill$2
  #1404 = Utf8               lambda$onKill$0
  #1405 = Utf8               lambda$scheduleZoneSwitch$0
  #1406 = Utf8               lambda$startCountdown$0
  #1407 = Utf8               (ZJ)V
  #1408 = Utf8               message
  #1409 = Utf8               seconds
  #1410 = Utf8               minutes
  #1411 = Utf8               hours
  #1412 = Utf8               lambda$activateZonesAndSpawn$1
  #1413 = Utf8               (Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1414 = Utf8               lambda$activateZonesAndSpawn$0
  #1415 = Utf8               lambda$startZoneCleaner$0
  #1416 = Utf8               i$
  #1417 = Utf8               Ljava/util/Iterator;
  #1418 = Utf8               lambda$startZoneCleaner$1
  #1419 = Utf8               <clinit>
  #1420 = Utf8               SourceFile
  #1421 = Utf8               RandomManager.java
  #1422 = Utf8               NestMembers
  #1423 = Utf8               BootstrapMethods
  #1424 = MethodType         #6           //  ()V
  #1425 = MethodHandle       5:#1426      // REF_invokeVirtual ext/mods/Crypta/RandomManager.checkStartEvent:()V
  #1426 = Methodref          #8.#1427     // ext/mods/Crypta/RandomManager.checkStartEvent:()V
  #1427 = NameAndType        #1234:#6     // checkStartEvent:()V
  #1428 = String             #1429        // RandomEvent: Event checker started. Evento: \u0001
  #1429 = Utf8               RandomEvent: Event checker started. Evento: \u0001
  #1430 = String             #1431        // RandomEvent: Event STARTING. Time matched: \u0001
  #1431 = Utf8               RandomEvent: Event STARTING. Time matched: \u0001
  #1432 = MethodHandle       6:#136       // REF_invokeStatic ext/mods/Crypta/RandomManager.sendQuestionMarkToAllOnline:()V
  #1433 = String             #1434        // \u0001 segundos
  #1434 = Utf8               \u0001 segundos
  #1435 = String             #1436        // \u0001 minutos
  #1436 = Utf8               \u0001 minutos
  #1437 = String             #1438        // \u0001: \u0001
  #1438 = Utf8               \u0001: \u0001
  #1439 = MethodHandle       5:#1440      // REF_invokeVirtual ext/mods/Crypta/RandomManager.activateZonesAndSpawn:()V
  #1440 = Methodref          #8.#1441     // ext/mods/Crypta/RandomManager.activateZonesAndSpawn:()V
  #1441 = NameAndType        #1243:#6     // activateZonesAndSpawn:()V
  #1442 = MethodHandle       6:#1443      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$startZoneCleaner$0:(I)V
  #1443 = Methodref          #8.#1444     // ext/mods/Crypta/RandomManager.lambda$startZoneCleaner$0:(I)V
  #1444 = NameAndType        #1415:#423   // lambda$startZoneCleaner$0:(I)V
  #1445 = MethodType         #134         //  (Ljava/lang/Object;)Z
  #1446 = MethodHandle       6:#1447      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$activateZonesAndSpawn$0:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1447 = Methodref          #8.#1448     // ext/mods/Crypta/RandomManager.lambda$activateZonesAndSpawn$0:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1448 = NameAndType        #1414:#1413  // lambda$activateZonesAndSpawn$0:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1449 = MethodType         #1413        //  (Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1450 = MethodHandle       6:#1451      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$activateZonesAndSpawn$1:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1451 = Methodref          #8.#1452     // ext/mods/Crypta/RandomManager.lambda$activateZonesAndSpawn$1:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1452 = NameAndType        #1412:#1413  // lambda$activateZonesAndSpawn$1:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  #1453 = String             #1454        // [Debug Event] Zonas elegíveis (active=true) encontradas: \u0001. Sorteando \u0001 delas.
  #1454 = Utf8               [Debug Event] Zonas elegíveis (active=true) encontradas: \u0001. Sorteando \u0001 delas.
  #1455 = String             #1456        // RandomEvent: Zone Activated: \u0001 (ID: \u0001)
  #1456 = Utf8               RandomEvent: Zone Activated: \u0001 (ID: \u0001)
  #1457 = String             #1458        // [Debug Event] Using ZoneData: zoneId=\u0001, isVip=\u0001, isPartyZone=\u0001, dwarvenOnly=\u0001, enchanterZone=\u0001, enchantChance=\u0001%, maxEnchant=\u0001
  #1458 = Utf8               [Debug Event] Using ZoneData: zoneId=\u0001, isVip=\u0001, isPartyZone=\u0001, dwarvenOnly=\u0001, enchanterZone=\u0001, enchantChance=\u0001%, maxEnchant=\u0001
  #1459 = String             #1460        // [Debug Event] CRITICAL: ZoneData is null even after filtering! Zone ID: \u0001
  #1460 = Utf8               [Debug Event] CRITICAL: ZoneData is null even after filtering! Zone ID: \u0001
  #1461 = String             #1462        // \u0001 [DWARVEN Only]
  #1462 = Utf8               \u0001 [DWARVEN Only]
  #1463 = String             #1464        // \u0001 [Enchanter Zone - PvP Ativo - Chance: \u0001% - Max: +\u0001]
  #1464 = Utf8               \u0001 [Enchanter Zone - PvP Ativo - Chance: \u0001% - Max: +\u0001]
  #1465 = String             #1466        // [Debug Spawn] Pausing \u0001 old monsters from active zones.
  #1466 = Utf8               [Debug Spawn] Pausing \u0001 old monsters from active zones.
  #1467 = String             #1468        // RandomEvent: No <spawns> data found for zoneId=\u0001
  #1468 = Utf8               RandomEvent: No <spawns> data found for zoneId=\u0001
  #1469 = String             #1470        // [Debug Spawn] Spawning for Zone ID \u0001 (useOriginals=\u0001)
  #1470 = Utf8               [Debug Spawn] Spawning for Zone ID \u0001 (useOriginals=\u0001)
  #1471 = String             #1472        // [Debug Spawn] MODE 1/3: Re-spawning original NPC \u0001 with default title: \u0001 and respawn: \u0001
  #1472 = Utf8               [Debug Spawn] MODE 1/3: Re-spawning original NPC \u0001 with default title: \u0001 and respawn: \u0001
  #1473 = String             #1474        // [Debug Spawn] MODE 2/3: Spawning custom NPC \u0001 Count: \u0001
  #1474 = Utf8               [Debug Spawn] MODE 2/3: Spawning custom NPC \u0001 Count: \u0001
  #1475 = String             #1476        // \u0001\u0001
  #1476 = Utf8               \u0001\u0001
  #1477 = MethodHandle       6:#1478      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$startCountdown$0:(ZJ)V
  #1478 = Methodref          #8.#1479     // ext/mods/Crypta/RandomManager.lambda$startCountdown$0:(ZJ)V
  #1479 = NameAndType        #1406:#1407  // lambda$startCountdown$0:(ZJ)V
  #1480 = MethodHandle       5:#1481      // REF_invokeVirtual ext/mods/Crypta/RandomManager.lambda$scheduleZoneSwitch$0:()V
  #1481 = Methodref          #8.#1482     // ext/mods/Crypta/RandomManager.lambda$scheduleZoneSwitch$0:()V
  #1482 = NameAndType        #1405:#6     // lambda$scheduleZoneSwitch$0:()V
  #1483 = String             #1484        // [Debug Event] cleanPreviousMonsters: Saved \u0001 old NPCs from active zones.
  #1484 = Utf8               [Debug Event] cleanPreviousMonsters: Saved \u0001 old NPCs from active zones.
  #1485 = String             #1486        // [Debug Event] Deleting \u0001 event spawns.
  #1486 = Utf8               [Debug Event] Deleting \u0001 event spawns.
  #1487 = String             #1488        // [Debug Event] Re-spawning \u0001 old monsters.
  #1488 = Utf8               [Debug Event] Re-spawning \u0001 old monsters.
  #1489 = String             #1490        // [Debug Kill] \u0001 killed \u0001
  #1490 = Utf8               [Debug Kill] \u0001 killed \u0001
  #1491 = MethodHandle       6:#1492      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$onKill$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1492 = Methodref          #8.#1493     // ext/mods/Crypta/RandomManager.lambda$onKill$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1493 = NameAndType        #1404:#1385  // lambda$onKill$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1494 = MethodType         #1495        //  (Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1495 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1496 = String             #1497        // [Debug Kill] Monster \u0001 is an event monster. Checking drops...
  #1497 = Utf8               [Debug Kill] Monster \u0001 is an event monster. Checking drops...
  #1498 = MethodHandle       6:#1499      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$onKill$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1499 = Methodref          #8.#1500     // ext/mods/Crypta/RandomManager.lambda$onKill$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1500 = NameAndType        #1402:#1387  // lambda$onKill$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1501 = MethodType         #1502        //  (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1502 = Utf8               (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1503 = String             #1504        // [Debug Kill] SUCCESS! Dropping item \u0001 (Chance: \u0001)
  #1504 = Utf8               [Debug Kill] SUCCESS! Dropping item \u0001 (Chance: \u0001)
  #1505 = String             #1506        // [Debug Kill] FAILED drop for item \u0001 (Chance: \u0001)
  #1506 = Utf8               [Debug Kill] FAILED drop for item \u0001 (Chance: \u0001)
  #1507 = MethodHandle       6:#1508      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1508 = Methodref          #8.#1509     // ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1509 = NameAndType        #1401:#1385  // lambda$shouldCancelOriginalDrop$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1510 = MethodHandle       6:#1511      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1511 = Methodref          #8.#1512     // ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1512 = NameAndType        #1399:#1387  // lambda$shouldCancelOriginalDrop$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1513 = MethodHandle       6:#1514      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1514 = Methodref          #8.#1515     // ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1515 = NameAndType        #1398:#1385  // lambda$getActiveRateXp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1516 = MethodHandle       6:#1517      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1517 = Methodref          #8.#1518     // ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1518 = NameAndType        #1396:#1387  // lambda$getActiveRateXp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1519 = MethodHandle       6:#1520      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1520 = Methodref          #8.#1521     // ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1521 = NameAndType        #1395:#1385  // lambda$getActiveRateSp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1522 = MethodHandle       6:#1523      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1523 = Methodref          #8.#1524     // ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1524 = NameAndType        #1393:#1387  // lambda$getActiveRateSp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1525 = MethodHandle       6:#1526      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1526 = Methodref          #8.#1527     // ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1527 = NameAndType        #1392:#1385  // lambda$getActiveRateAdena$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1528 = MethodHandle       6:#1529      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1529 = Methodref          #8.#1530     // ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1530 = NameAndType        #1386:#1387  // lambda$getActiveRateAdena$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  #1531 = MethodHandle       6:#1532      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$isEventMonster$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1532 = Methodref          #8.#1533     // ext/mods/Crypta/RandomManager.lambda$isEventMonster$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1533 = NameAndType        #1384:#1385  // lambda$isEventMonster$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1534 = String             #1535        // [Debug Enchant] Encantamento falhou para \u0001 (chance: \u0001%)
  #1535 = Utf8               [Debug Enchant] Encantamento falhou para \u0001 (chance: \u0001%)
  #1536 = String             #1537        // [Debug Enchant] Nenhum item encantável encontrado para \u0001
  #1537 = Utf8               [Debug Enchant] Nenhum item encantável encontrado para \u0001
  #1538 = String             #1539        // Você encantou \u0001 para +\u0001 ao vencer \u0001 em PvP!
  #1539 = Utf8               Você encantou \u0001 para +\u0001 ao vencer \u0001 em PvP!
  #1540 = String             #1541        // [Debug Enchant] \u0001 encantou \u0001 para +\u0001 (kill PvP em Enchanter_Zone)
  #1541 = Utf8               [Debug Enchant] \u0001 encantou \u0001 para +\u0001 (kill PvP em Enchanter_Zone)
  #1542 = String             #1543        // %\u0001%
  #1543 = Utf8               %\u0001%
  #1544 = MethodHandle       5:#1545      // REF_invokeVirtual ext/mods/Crypta/RandomManager.checkPartyIntegrity:()V
  #1545 = Methodref          #8.#1546     // ext/mods/Crypta/RandomManager.checkPartyIntegrity:()V
  #1546 = NameAndType        #1350:#6     // checkPartyIntegrity:()V
  #1547 = String             #1548        // [Debug Party Check] Verificando Zona: \u0001 (ID: \u0001)
  #1548 = Utf8               [Debug Party Check] Verificando Zona: \u0001 (ID: \u0001)
  #1549 = String             #1550        // [Debug Party Check] Player \u0001 não está mais em party.
  #1550 = Utf8               [Debug Party Check] Player \u0001 não está mais em party.
  #1551 = String             #1552        // Sua Party não tem mais o número mínimo de \u0001 membros.
  #1552 = Utf8               Sua Party não tem mais o número mínimo de \u0001 membros.
  #1553 = String             #1554        // [Debug Party Check] Party de \u0001 tem menos que \u0001 membros.
  #1554 = Utf8               [Debug Party Check] Party de \u0001 tem menos que \u0001 membros.
  #1555 = String             #1556        // [Debug Party Check] Membro \u0001 da party de \u0001 não está na zona.
  #1556 = Utf8               [Debug Party Check] Membro \u0001 da party de \u0001 não está na zona.
  #1557 = String             #1558        // [Debug Party Check] Expulsando party do líder \u0001 da zona \u0001. Razão: \u0001
  #1558 = Utf8               [Debug Party Check] Expulsando party do líder \u0001 da zona \u0001. Razão: \u0001
  #1559 = String             #1560        // [Debug Party Check] Expulsando jogador \u0001 (sem party) da zona \u0001. Razão: \u0001
  #1560 = Utf8               [Debug Party Check] Expulsando jogador \u0001 (sem party) da zona \u0001. Razão: \u0001
  #1561 = String             #1562        // [Debug Party Check] Party de \u0001 OK na zona \u0001
  #1562 = Utf8               [Debug Party Check] Party de \u0001 OK na zona \u0001
  #1563 = MethodHandle       5:#1564      // REF_invokeVirtual ext/mods/Crypta/RandomManager.updateEnchanterZonePvpFlags:()V
  #1564 = Methodref          #8.#1565     // ext/mods/Crypta/RandomManager.updateEnchanterZonePvpFlags:()V
  #1565 = NameAndType        #1362:#6     // updateEnchanterZonePvpFlags:()V
  #1566 = MethodHandle       6:#1567      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$handleEventTeleportConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1567 = Methodref          #8.#1568     // ext/mods/Crypta/RandomManager.lambda$handleEventTeleportConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1568 = NameAndType        #1382:#1383  // lambda$handleEventTeleportConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #1569 = String             #1570        // \u0001 is active! Zones have been announced. Duration: \u0001\u0001
  #1570 = Utf8               \u0001 is active! Zones have been announced. Duration: \u0001\u0001
  #1571 = MethodHandle       6:#1572      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1572 = Methodref          #8.#1573     // ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1573 = NameAndType        #1389:#1390  // lambda$getActiveRateAdena$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1574 = MethodHandle       6:#1575      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1575 = Methodref          #8.#1576     // ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1576 = NameAndType        #1394:#1390  // lambda$getActiveRateSp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1577 = MethodHandle       6:#1578      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1578 = Methodref          #8.#1579     // ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1579 = NameAndType        #1397:#1390  // lambda$getActiveRateXp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1580 = MethodHandle       6:#1581      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1581 = Methodref          #8.#1582     // ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1582 = NameAndType        #1400:#1390  // lambda$shouldCancelOriginalDrop$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1583 = MethodHandle       6:#1584      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$onKill$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1584 = Methodref          #8.#1585     // ext/mods/Crypta/RandomManager.lambda$onKill$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1585 = NameAndType        #1403:#1390  // lambda$onKill$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1586 = String             #1587        // \u0001h
  #1587 = Utf8               \u0001h
  #1588 = String             #1589        // \u0001m
  #1589 = Utf8               \u0001m
  #1590 = String             #1591        // \u0001s
  #1591 = Utf8               \u0001s
  #1592 = MethodHandle       6:#1593      // REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$startZoneCleaner$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1593 = Methodref          #8.#1594     // ext/mods/Crypta/RandomManager.lambda$startZoneCleaner$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1594 = NameAndType        #1418:#1385  // lambda$startZoneCleaner$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
  #1595 = String             #1596        // [Debug Cleaner] Removing non-event NPC: \u0001 (ID: \u0001)
  #1596 = Utf8               [Debug Cleaner] Removing non-event NPC: \u0001 (ID: \u0001)
  #1597 = MethodHandle       6:#1598      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1598 = Methodref          #1599.#1600  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1599 = Class              #1601        // java/lang/invoke/LambdaMetafactory
  #1600 = NameAndType        #1602:#1603  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1601 = Utf8               java/lang/invoke/LambdaMetafactory
  #1602 = Utf8               metafactory
  #1603 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1604 = MethodHandle       6:#1605      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1605 = Methodref          #1606.#1607  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1606 = Class              #1608        // java/lang/invoke/StringConcatFactory
  #1607 = NameAndType        #101:#1609   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1608 = Utf8               java/lang/invoke/StringConcatFactory
  #1609 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1610 = Utf8               InnerClasses
  #1611 = Utf8               Entry
  #1612 = Utf8               SingletonHolder
  #1613 = Class              #1614        // java/lang/invoke/MethodHandles$Lookup
  #1614 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1615 = Class              #1616        // java/lang/invoke/MethodHandles
  #1616 = Utf8               java/lang/invoke/MethodHandles
  #1617 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int TUTORIAL_QUESTION_MARK_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2005

  public ext.mods.Crypta.RandomManager();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/Crypta/RandomManager;

  public void reload();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #23                 // String RandomEvent: Iniciando reload...
         5: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         8: getstatic     #31                 // Field isRunning:Z
        11: ifeq          22
        14: aload_0
        15: invokevirtual #35                 // Method stopZones:()V
        18: iconst_0
        19: putstatic     #31                 // Field isRunning:Z
        22: getstatic     #38                 // Field eventChecker:Ljava/util/concurrent/ScheduledFuture;
        25: ifnull        42
        28: getstatic     #38                 // Field eventChecker:Ljava/util/concurrent/ScheduledFuture;
        31: iconst_1
        32: invokeinterface #42,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        37: pop
        38: aconst_null
        39: putstatic     #38                 // Field eventChecker:Ljava/util/concurrent/ScheduledFuture;
        42: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        45: invokevirtual #54                 // Method ext/mods/FarmEventRandom/RandomData.reload:()V
        48: aload_0
        49: invokevirtual #57                 // Method start:()V
        52: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        55: ldc           #60                 // String RandomEvent: Reload completo.
        57: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        60: return
      LineNumberTable:
        line 111: 0
        line 113: 8
        line 115: 14
        line 116: 18
        line 119: 22
        line 121: 28
        line 122: 38
        line 125: 42
        line 127: 48
        line 128: 52
        line 129: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/Crypta/RandomManager;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 19 /* same */

  public void start();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
         3: invokevirtual #62                 // Method ext/mods/FarmEventRandom/RandomData.getFirstConfig:()Lext/mods/FarmEventRandom/holder/RamdomConfig;
         6: putstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
         9: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        12: ifnull        30
        15: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        18: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        21: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        24: invokevirtual #70                 // Method ext/mods/FarmEventRandom/RandomData.getMessages:(Ljava/lang/String;)Lext/mods/FarmEventRandom/holder/MessagesHolder;
        27: goto          31
        30: aconst_null
        31: putstatic     #74                 // Field messages:Lext/mods/FarmEventRandom/holder/MessagesHolder;
        34: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        37: ifnull        46
        40: getstatic     #74                 // Field messages:Lext/mods/FarmEventRandom/holder/MessagesHolder;
        43: ifnonnull     55
        46: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        49: ldc           #78                 // String RandomEvent: Nenhum evento encontrado ou configurado. Verifique random_event.xml. Abortando.
        51: invokevirtual #80                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
        54: return
        55: getstatic     #38                 // Field eventChecker:Ljava/util/concurrent/ScheduledFuture;
        58: ifnull        72
        61: getstatic     #38                 // Field eventChecker:Ljava/util/concurrent/ScheduledFuture;
        64: invokeinterface #83,  1           // InterfaceMethod java/util/concurrent/ScheduledFuture.isCancelled:()Z
        69: ifeq          107
        72: aload_0
        73: invokedynamic #87,  0             // InvokeDynamic #0:run:(Lext/mods/Crypta/RandomManager;)Ljava/lang/Runnable;
        78: ldc2_w        #91                 // long 1000l
        81: ldc2_w        #91                 // long 1000l
        84: invokestatic  #93                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        87: putstatic     #38                 // Field eventChecker:Ljava/util/concurrent/ScheduledFuture;
        90: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        93: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        96: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        99: invokedynamic #99,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       104: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       107: return
      LineNumberTable:
        line 133: 0
        line 134: 9
        line 136: 34
        line 138: 46
        line 139: 54
        line 142: 55
        line 144: 72
        line 145: 90
        line 147: 107
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     108     0  this   Lext/mods/Crypta/RandomManager;
      StackMapTable: number_of_entries = 6
        frame_type = 30 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/FarmEventRandom/holder/MessagesHolder ]
        frame_type = 14 /* same */
        frame_type = 8 /* same */
        frame_type = 16 /* same */
        frame_type = 34 /* same */

  public void onKill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Attackable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=17, args_size=3
         0: aload_1
         1: ifnull        8
         4: aload_2
         5: ifnonnull     9
         8: return
         9: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
        12: ifeq          34
        15: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        18: aload_1
        19: invokevirtual #666                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        22: aload_2
        23: invokevirtual #669                // Method ext/mods/gameserver/model/actor/Attackable.getName:()Ljava/lang/String;
        26: invokedynamic #672,  0            // InvokeDynamic #28:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        31: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        34: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        37: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        42: aload_2
        43: invokedynamic #673,  0            // InvokeDynamic #29:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
        48: invokeinterface #676,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        53: istore_3
        54: iload_3
        55: ifeq          689
        58: getstatic     #31                 // Field isRunning:Z
        61: ifeq          689
        64: getstatic     #611                // Field timeRemaining:J
        67: lconst_0
        68: lcmp
        69: ifle          689
        72: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
        75: ifeq          93
        78: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        81: aload_2
        82: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
        85: invokedynamic #681,  0            // InvokeDynamic #30:makeConcatWithConstants:(I)Ljava/lang/String;
        90: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        93: aconst_null
        94: astore        4
        96: getstatic     #296                // Field activeZones:Ljava/util/List;
        99: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       104: astore        5
       106: aload         5
       108: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       113: ifeq          168
       116: aload         5
       118: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       123: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
       126: astore        6
       128: aload         6
       130: aload_2
       131: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
       134: ifeq          165
       137: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
       140: ifnull        168
       143: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
       146: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
       149: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
       152: aload         6
       154: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
       157: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       160: astore        4
       162: goto          168
       165: goto          106
       168: aload         4
       170: ifnonnull     189
       173: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       176: ifeq          188
       179: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       182: ldc_w         #685                // String [Debug Kill] No ZoneData found for the zone monster is in!
       185: invokevirtual #374                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       188: return
       189: aload         4
       191: invokevirtual #519                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
       194: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       199: aload_2
       200: invokedynamic #687,  0            // InvokeDynamic #31:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
       205: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       210: invokeinterface #688,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       215: aconst_null
       216: invokevirtual #692                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       219: checkcast     #522                // class ext/mods/FarmEventRandom/holder/RandomSpawnHolder
       222: astore        5
       224: aconst_null
       225: astore        6
       227: aload         5
       229: ifnull        270
       232: aload         5
       234: invokevirtual #698                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getDrops:()Ljava/util/List;
       237: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       242: ifne          270
       245: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       248: ifeq          260
       251: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       254: ldc_w         #701                // String [Debug Kill] Monster is CUSTOM spawn. Using custom drops.
       257: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       260: aload         5
       262: invokevirtual #698                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getDrops:()Ljava/util/List;
       265: astore        6
       267: goto          308
       270: aload         4
       272: invokevirtual #431                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.useOriginals:()Z
       275: ifeq          308
       278: aload         4
       280: invokevirtual #703                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.dropsOriginals:()Z
       283: ifeq          308
       286: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       289: ifeq          301
       292: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       295: ldc_w         #706                // String [Debug Kill] Monster is ORIGINAL spawn and DropsOriginals=true. Using default zone drops.
       298: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       301: aload         4
       303: invokevirtual #708                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getDefaultDrops:()Ljava/util/List;
       306: astore        6
       308: aload         6
       310: ifnull        635
       313: aload         6
       315: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       320: ifne          635
       323: aload         6
       325: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       330: astore        7
       332: aload         7
       334: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       339: ifeq          632
       342: aload         7
       344: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       349: checkcast     #711                // class ext/mods/FarmEventRandom/holder/DropHolder
       352: astore        8
       354: bipush        100
       356: invokestatic  #558                // Method ext/mods/commons/random/Rnd.get:(I)I
       359: aload         8
       361: invokevirtual #713                // Method ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
       364: if_icmpge     602
       367: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       370: ifeq          394
       373: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       376: aload         8
       378: invokevirtual #716                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       381: aload         8
       383: invokevirtual #713                // Method ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
       386: invokedynamic #719,  0            // InvokeDynamic #32:makeConcatWithConstants:(II)Ljava/lang/String;
       391: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       394: aload         8
       396: invokevirtual #720                // Method ext/mods/FarmEventRandom/holder/DropHolder.getCount:()I
       399: istore        9
       401: aload_1
       402: invokevirtual #721                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       405: ifeq          586
       408: aload_1
       409: invokevirtual #724                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       412: invokevirtual #728                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       415: astore        10
       417: aload         10
       419: invokeinterface #281,  1          // InterfaceMethod java/util/List.size:()I
       424: istore        11
       426: iload         11
       428: ifne          447
       431: aload_1
       432: aload         8
       434: invokevirtual #716                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       437: iload         9
       439: iconst_1
       440: invokevirtual #733                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       443: pop
       444: goto          332
       447: iload         9
       449: iload         11
       451: idiv
       452: istore        12
       454: iload         9
       456: iload         11
       458: irem
       459: istore        13
       461: aload         10
       463: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       468: astore        14
       470: aload         14
       472: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       477: ifeq          565
       480: aload         14
       482: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       487: checkcast     #667                // class ext/mods/gameserver/model/actor/Player
       490: astore        15
       492: aload         15
       494: ifnull        554
       497: aload         15
       499: invokevirtual #737                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       502: ifeq          554
       505: aload_1
       506: aload         15
       508: getstatic     #740                // Field ext/mods/Config.PARTY_RANGE:I
       511: invokevirtual #744                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       514: ifeq          554
       517: iload         12
       519: istore        16
       521: iload         13
       523: ifle          532
       526: iinc          16, 1
       529: iinc          13, -1
       532: iload         16
       534: ifle          551
       537: aload         15
       539: aload         8
       541: invokevirtual #716                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       544: iload         16
       546: iconst_1
       547: invokevirtual #733                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       550: pop
       551: goto          562
       554: iload         13
       556: ifle          562
       559: iinc          13, -1
       562: goto          470
       565: iload         13
       567: ifle          583
       570: aload_1
       571: aload         8
       573: invokevirtual #716                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       576: iload         13
       578: iconst_1
       579: invokevirtual #733                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       582: pop
       583: goto          599
       586: aload_1
       587: aload         8
       589: invokevirtual #716                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       592: iload         9
       594: iconst_1
       595: invokevirtual #733                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       598: pop
       599: goto          629
       602: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       605: ifeq          629
       608: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       611: aload         8
       613: invokevirtual #716                // Method ext/mods/FarmEventRandom/holder/DropHolder.getItemId:()I
       616: aload         8
       618: invokevirtual #713                // Method ext/mods/FarmEventRandom/holder/DropHolder.getChance:()I
       621: invokedynamic #748,  0            // InvokeDynamic #33:makeConcatWithConstants:(II)Ljava/lang/String;
       626: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       629: goto          332
       632: goto          689
       635: aload         5
       637: ifnonnull     674
       640: aload         4
       642: invokevirtual #431                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.useOriginals:()Z
       645: ifeq          674
       648: aload         4
       650: invokevirtual #703                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.dropsOriginals:()Z
       653: ifne          674
       656: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       659: ifeq          689
       662: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       665: ldc_w         #749                // String [Debug Kill] Monster is ORIGINAL spawn and DropsOriginals=false. No event drops added.
       668: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       671: goto          689
       674: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       677: ifeq          689
       680: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       683: ldc_w         #751                // String [Debug Kill] No drops configured or applicable for this monster!
       686: invokevirtual #374                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       689: return
      LineNumberTable:
        line 465: 0
        line 466: 34
        line 467: 54
        line 468: 72
        line 469: 93
        line 470: 96
        line 471: 168
        line 472: 189
        line 473: 224
        line 474: 227
        line 475: 270
        line 476: 308
        line 477: 323
        line 478: 354
        line 479: 367
        line 480: 394
        line 481: 401
        line 482: 408
        line 483: 461
        line 484: 565
        line 485: 583
        line 486: 599
        line 487: 629
        line 488: 635
        line 489: 674
        line 491: 689
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          128      37     6  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
          521      30    16 amount   I
          492      70    15 member   Lext/mods/gameserver/model/actor/Player;
          417     166    10 members   Ljava/util/List;
          426     157    11  size   I
          454     129    12 baseAmount   I
          461     122    13 remainder   I
          401     198     9 totalAmount   I
          354     275     8  drop   Lext/mods/FarmEventRandom/holder/DropHolder;
           96     593     4 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          224     465     5 customSpawnData   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
          227     462     6 dropsToUse   Ljava/util/List;
            0     690     0  this   Lext/mods/Crypta/RandomManager;
            0     690     1 player   Lext/mods/gameserver/model/actor/Player;
            0     690     2 monster   Lext/mods/gameserver/model/actor/Attackable;
           54     636     3 isEventMonster   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          417     166    10 members   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
          227     462     6 dropsToUse   Ljava/util/List<Lext/mods/FarmEventRandom/holder/DropHolder;>;
      StackMapTable: number_of_entries = 31
        frame_type = 8 /* same */
        frame_type = 0 /* same */
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ class ext/mods/FarmEventRandom/holder/RandomZoneData, class java/util/Iterator ]
        frame_type = 58 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 19 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 70
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder, class java/util/List ]
        frame_type = 9 /* same */
        frame_type = 30 /* same */
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 61
          locals = [ class ext/mods/FarmEventRandom/holder/DropHolder ]
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ int, class java/util/List, int ]
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/Crypta/RandomManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Attackable, int, class ext/mods/FarmEventRandom/holder/RandomZoneData, class ext/mods/FarmEventRandom/holder/RandomSpawnHolder, class java/util/List, class java/util/Iterator, class ext/mods/FarmEventRandom/holder/DropHolder, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 2 /* same */
        frame_type = 38 /* same */
        frame_type = 248 /* chop */
          offset_delta = 14

  public boolean shouldCancelOriginalDrop(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          16
         6: aload_1
         7: ifnull        16
        10: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        13: ifnonnull     18
        16: iconst_0
        17: ireturn
        18: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        21: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        26: aload_1
        27: invokedynamic #753,  0            // InvokeDynamic #34:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
        32: invokeinterface #676,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        37: istore_2
        38: iload_2
        39: ifne          44
        42: iconst_0
        43: ireturn
        44: aconst_null
        45: astore_3
        46: getstatic     #296                // Field activeZones:Ljava/util/List;
        49: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        54: astore        4
        56: aload         4
        58: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        63: ifeq          111
        66: aload         4
        68: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
        76: astore        5
        78: aload         5
        80: aload_1
        81: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        84: ifeq          108
        87: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        90: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        93: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        96: aload         5
        98: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
       101: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       104: astore_3
       105: goto          111
       108: goto          56
       111: aload_3
       112: ifnonnull     117
       115: iconst_0
       116: ireturn
       117: aload_3
       118: invokevirtual #519                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
       121: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       126: aload_1
       127: invokedynamic #754,  0            // InvokeDynamic #35:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
       132: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       137: invokeinterface #688,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       142: aconst_null
       143: invokevirtual #692                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       146: checkcast     #522                // class ext/mods/FarmEventRandom/holder/RandomSpawnHolder
       149: astore        4
       151: aload         4
       153: ifnull        158
       156: iconst_1
       157: ireturn
       158: aload_3
       159: invokevirtual #431                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.useOriginals:()Z
       162: ifeq          176
       165: aload_3
       166: invokevirtual #703                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.dropsOriginals:()Z
       169: ifne          176
       172: iconst_1
       173: goto          177
       176: iconst_0
       177: ireturn
      LineNumberTable:
        line 493: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           78      30     5  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     178     0  this   Lext/mods/Crypta/RandomManager;
            0     178     1 monster   Lext/mods/gameserver/model/actor/Attackable;
           38     140     2 isEventMonster   Z
           46     132     3 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          151      27     4 customSpawnData   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
      StackMapTable: number_of_entries = 10
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ class ext/mods/FarmEventRandom/holder/RandomZoneData, class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder ]
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public double getActiveRateXp(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          16
         6: aload_1
         7: ifnull        16
        10: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        13: ifnonnull     18
        16: dconst_1
        17: dreturn
        18: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        21: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        26: aload_1
        27: invokedynamic #755,  0            // InvokeDynamic #36:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
        32: invokeinterface #676,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        37: istore_2
        38: iload_2
        39: ifne          44
        42: dconst_1
        43: dreturn
        44: getstatic     #296                // Field activeZones:Ljava/util/List;
        47: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        52: astore_3
        53: aload_3
        54: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          263
        62: aload_3
        63: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
        71: astore        4
        73: aload         4
        75: aload_1
        76: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        79: ifeq          260
        82: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        85: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        88: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        91: aload         4
        93: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        96: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        99: astore        5
       101: aload         5
       103: ifnonnull     108
       106: dconst_1
       107: dreturn
       108: aload         5
       110: invokevirtual #519                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
       113: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       118: aload_1
       119: invokedynamic #756,  0            // InvokeDynamic #37:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
       124: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       129: invokeinterface #688,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       134: aconst_null
       135: invokevirtual #692                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       138: checkcast     #522                // class ext/mods/FarmEventRandom/holder/RandomSpawnHolder
       141: astore        6
       143: aload         6
       145: ifnull        206
       148: aload         6
       150: invokevirtual #757                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateXp:()D
       153: ldc2_w        #760                // double -1.0d
       156: dcmpl
       157: ifle          206
       160: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       163: ifeq          200
       166: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       169: ldc_w         #762                // String [Debug Rate] Usando rateXP específico do Spawn {} para NPC {}
       172: iconst_2
       173: anewarray     #2                  // class java/lang/Object
       176: dup
       177: iconst_0
       178: aload         6
       180: invokevirtual #757                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateXp:()D
       183: invokestatic  #764                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       186: aastore
       187: dup
       188: iconst_1
       189: aload_1
       190: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       193: invokestatic  #533                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       196: aastore
       197: invokevirtual #769                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       200: aload         6
       202: invokevirtual #757                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateXp:()D
       205: dreturn
       206: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       209: ifeq          254
       212: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       215: ldc_w         #771                // String [Debug Rate] Usando rateXP padrão da Zona {} ({}) para NPC {}
       218: iconst_3
       219: anewarray     #2                  // class java/lang/Object
       222: dup
       223: iconst_0
       224: aload         5
       226: invokevirtual #773                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getRateXp:()D
       229: invokestatic  #764                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       232: aastore
       233: dup
       234: iconst_1
       235: aload         4
       237: invokevirtual #335                // Method ext/mods/gameserver/model/zone/type/RandomZone.getName:()Ljava/lang/String;
       240: aastore
       241: dup
       242: iconst_2
       243: aload_1
       244: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       247: invokestatic  #533                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       250: aastore
       251: invokevirtual #769                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       254: aload         5
       256: invokevirtual #773                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getRateXp:()D
       259: dreturn
       260: goto          53
       263: dconst_1
       264: dreturn
      LineNumberTable:
        line 496: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101     159     5 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          143     117     6 customSpawnData   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
           73     187     4  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     265     0  this   Lext/mods/Crypta/RandomManager;
            0     265     1 monster   Lext/mods/gameserver/model/actor/Attackable;
           38     227     2 isEventMonster   Z
      StackMapTable: number_of_entries = 10
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/FarmEventRandom/holder/RandomZoneData ]
        frame_type = 252 /* append */
          offset_delta = 91
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder ]
        frame_type = 5 /* same */
        frame_type = 47 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  public double getActiveRateSp(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          16
         6: aload_1
         7: ifnull        16
        10: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        13: ifnonnull     18
        16: dconst_1
        17: dreturn
        18: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        21: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        26: aload_1
        27: invokedynamic #774,  0            // InvokeDynamic #38:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
        32: invokeinterface #676,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        37: istore_2
        38: iload_2
        39: ifne          44
        42: dconst_1
        43: dreturn
        44: getstatic     #296                // Field activeZones:Ljava/util/List;
        47: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        52: astore_3
        53: aload_3
        54: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          263
        62: aload_3
        63: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
        71: astore        4
        73: aload         4
        75: aload_1
        76: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        79: ifeq          260
        82: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        85: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        88: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        91: aload         4
        93: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        96: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        99: astore        5
       101: aload         5
       103: ifnonnull     108
       106: dconst_1
       107: dreturn
       108: aload         5
       110: invokevirtual #519                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
       113: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       118: aload_1
       119: invokedynamic #775,  0            // InvokeDynamic #39:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
       124: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       129: invokeinterface #688,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       134: aconst_null
       135: invokevirtual #692                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       138: checkcast     #522                // class ext/mods/FarmEventRandom/holder/RandomSpawnHolder
       141: astore        6
       143: aload         6
       145: ifnull        206
       148: aload         6
       150: invokevirtual #776                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateSp:()D
       153: ldc2_w        #760                // double -1.0d
       156: dcmpl
       157: ifle          206
       160: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       163: ifeq          200
       166: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       169: ldc_w         #779                // String [Debug Rate] Usando rateSP específico do Spawn {} para NPC {}
       172: iconst_2
       173: anewarray     #2                  // class java/lang/Object
       176: dup
       177: iconst_0
       178: aload         6
       180: invokevirtual #776                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateSp:()D
       183: invokestatic  #764                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       186: aastore
       187: dup
       188: iconst_1
       189: aload_1
       190: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       193: invokestatic  #533                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       196: aastore
       197: invokevirtual #769                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       200: aload         6
       202: invokevirtual #776                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateSp:()D
       205: dreturn
       206: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       209: ifeq          254
       212: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       215: ldc_w         #781                // String [Debug Rate] Usando rateSP padrão da Zona {} ({}) para NPC {}
       218: iconst_3
       219: anewarray     #2                  // class java/lang/Object
       222: dup
       223: iconst_0
       224: aload         5
       226: invokevirtual #783                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getRateSp:()D
       229: invokestatic  #764                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       232: aastore
       233: dup
       234: iconst_1
       235: aload         4
       237: invokevirtual #335                // Method ext/mods/gameserver/model/zone/type/RandomZone.getName:()Ljava/lang/String;
       240: aastore
       241: dup
       242: iconst_2
       243: aload_1
       244: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       247: invokestatic  #533                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       250: aastore
       251: invokevirtual #769                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       254: aload         5
       256: invokevirtual #783                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getRateSp:()D
       259: dreturn
       260: goto          53
       263: dconst_1
       264: dreturn
      LineNumberTable:
        line 499: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101     159     5 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          143     117     6 customSpawnData   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
           73     187     4  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     265     0  this   Lext/mods/Crypta/RandomManager;
            0     265     1 monster   Lext/mods/gameserver/model/actor/Attackable;
           38     227     2 isEventMonster   Z
      StackMapTable: number_of_entries = 10
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/FarmEventRandom/holder/RandomZoneData ]
        frame_type = 252 /* append */
          offset_delta = 91
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder ]
        frame_type = 5 /* same */
        frame_type = 47 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  public double getActiveRateAdena(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=2
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          16
         6: aload_1
         7: ifnull        16
        10: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        13: ifnonnull     18
        16: dconst_1
        17: dreturn
        18: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        21: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        26: aload_1
        27: invokedynamic #784,  0            // InvokeDynamic #40:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
        32: invokeinterface #676,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        37: istore_2
        38: iload_2
        39: ifne          44
        42: dconst_1
        43: dreturn
        44: getstatic     #296                // Field activeZones:Ljava/util/List;
        47: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        52: astore_3
        53: aload_3
        54: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        59: ifeq          263
        62: aload_3
        63: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
        71: astore        4
        73: aload         4
        75: aload_1
        76: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        79: ifeq          260
        82: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        85: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        88: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        91: aload         4
        93: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        96: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        99: astore        5
       101: aload         5
       103: ifnonnull     108
       106: dconst_1
       107: dreturn
       108: aload         5
       110: invokevirtual #519                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getCustomSpawns:()Ljava/util/List;
       113: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       118: aload_1
       119: invokedynamic #785,  0            // InvokeDynamic #41:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
       124: invokeinterface #260,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       129: invokeinterface #688,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       134: aconst_null
       135: invokevirtual #692                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       138: checkcast     #522                // class ext/mods/FarmEventRandom/holder/RandomSpawnHolder
       141: astore        6
       143: aload         6
       145: ifnull        206
       148: aload         6
       150: invokevirtual #786                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateAdena:()D
       153: ldc2_w        #760                // double -1.0d
       156: dcmpl
       157: ifle          206
       160: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       163: ifeq          200
       166: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       169: ldc_w         #789                // String [Debug Rate] Usando rateAdena específico do Spawn {} para NPC {}
       172: iconst_2
       173: anewarray     #2                  // class java/lang/Object
       176: dup
       177: iconst_0
       178: aload         6
       180: invokevirtual #786                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateAdena:()D
       183: invokestatic  #764                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       186: aastore
       187: dup
       188: iconst_1
       189: aload_1
       190: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       193: invokestatic  #533                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       196: aastore
       197: invokevirtual #769                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       200: aload         6
       202: invokevirtual #786                // Method ext/mods/FarmEventRandom/holder/RandomSpawnHolder.getRateAdena:()D
       205: dreturn
       206: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       209: ifeq          254
       212: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       215: ldc_w         #791                // String [Debug Rate] Usando rateAdena padrão da Zona {} ({}) para NPC {}
       218: iconst_3
       219: anewarray     #2                  // class java/lang/Object
       222: dup
       223: iconst_0
       224: aload         5
       226: invokevirtual #793                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getRateAdena:()D
       229: invokestatic  #764                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       232: aastore
       233: dup
       234: iconst_1
       235: aload         4
       237: invokevirtual #335                // Method ext/mods/gameserver/model/zone/type/RandomZone.getName:()Ljava/lang/String;
       240: aastore
       241: dup
       242: iconst_2
       243: aload_1
       244: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       247: invokestatic  #533                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       250: aastore
       251: invokevirtual #769                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       254: aload         5
       256: invokevirtual #793                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getRateAdena:()D
       259: dreturn
       260: goto          53
       263: dconst_1
       264: dreturn
      LineNumberTable:
        line 502: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101     159     5 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          143     117     6 customSpawnData   Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;
           73     187     4  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0     265     0  this   Lext/mods/Crypta/RandomManager;
            0     265     1 monster   Lext/mods/gameserver/model/actor/Attackable;
           38     227     2 isEventMonster   Z
      StackMapTable: number_of_entries = 10
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone, class ext/mods/FarmEventRandom/holder/RandomZoneData ]
        frame_type = 252 /* append */
          offset_delta = 91
          locals = [ class ext/mods/FarmEventRandom/holder/RandomSpawnHolder ]
        frame_type = 5 /* same */
        frame_type = 47 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isEventMonster(ext.mods.gameserver.model.actor.Attackable);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          10
         6: aload_1
         7: ifnonnull     12
        10: iconst_0
        11: ireturn
        12: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        15: invokeinterface #252,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        20: aload_1
        21: invokedynamic #794,  0            // InvokeDynamic #42:test:(Lext/mods/gameserver/model/actor/Attackable;)Ljava/util/function/Predicate;
        26: invokeinterface #676,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
        31: ireturn
      LineNumberTable:
        line 505: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/Crypta/RandomManager;
            0      32     1 monster   Lext/mods/gameserver/model/actor/Attackable;
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 1 /* same */

  public ext.mods.FarmEventRandom.holder.RandomZoneData getZoneDataForZone(ext.mods.gameserver.model.zone.type.RandomZone);
    descriptor: (Lext/mods/gameserver/model/zone/type/RandomZone;)Lext/mods/FarmEventRandom/holder/RandomZoneData;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          16
         6: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
         9: ifnull        16
        12: aload_1
        13: ifnonnull     18
        16: aconst_null
        17: areturn
        18: getstatic     #296                // Field activeZones:Ljava/util/List;
        21: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        26: astore_2
        27: aload_2
        28: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        33: ifeq          77
        36: aload_2
        37: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        42: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
        45: astore_3
        46: aload_3
        47: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        50: aload_1
        51: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        54: if_icmpne     74
        57: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        60: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        63: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        66: aload_1
        67: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        70: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        73: areturn
        74: goto          27
        77: aconst_null
        78: areturn
      LineNumberTable:
        line 515: 0
        line 516: 16
        line 518: 18
        line 520: 46
        line 522: 57
        line 524: 74
        line 526: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      28     3 activeZone   Lext/mods/gameserver/model/zone/type/RandomZone;
            0      79     0  this   Lext/mods/Crypta/RandomManager;
            0      79     1  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
      StackMapTable: number_of_entries = 5
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 46 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public java.util.List<ext.mods.gameserver.model.zone.type.RandomZone> getActiveZones();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          17
         6: getstatic     #296                // Field activeZones:Ljava/util/List;
         9: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        14: ifeq          25
        17: new           #227                // class java/util/ArrayList
        20: dup
        21: invokespecial #795                // Method java/util/ArrayList."<init>":()V
        24: areturn
        25: new           #227                // class java/util/ArrayList
        28: dup
        29: getstatic     #296                // Field activeZones:Ljava/util/List;
        32: invokespecial #240                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        35: areturn
      LineNumberTable:
        line 535: 0
        line 536: 17
        line 538: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/Crypta/RandomManager;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 7 /* same */
    Signature: #1318                        // ()Ljava/util/List<Lext/mods/gameserver/model/zone/type/RandomZone;>;

  public boolean isEventRunning();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #31                 // Field isRunning:Z
         3: ireturn
      LineNumberTable:
        line 547: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/Crypta/RandomManager;

  public java.util.List<ext.mods.gameserver.model.spawn.Spawn> getActiveSpawns();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          17
         6: getstatic     #427                // Field activeSpawns:Ljava/util/List;
         9: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        14: ifeq          25
        17: new           #227                // class java/util/ArrayList
        20: dup
        21: invokespecial #795                // Method java/util/ArrayList."<init>":()V
        24: areturn
        25: new           #227                // class java/util/ArrayList
        28: dup
        29: getstatic     #427                // Field activeSpawns:Ljava/util/List;
        32: invokespecial #240                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        35: areturn
      LineNumberTable:
        line 556: 0
        line 557: 17
        line 559: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/Crypta/RandomManager;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 7 /* same */
    Signature: #1321                        // ()Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;

  public void onPvPKill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=3
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          20
         6: aload_1
         7: ifnull        20
        10: aload_2
        11: ifnull        20
        14: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        17: ifnonnull     21
        20: return
        21: aconst_null
        22: astore_3
        23: aconst_null
        24: astore        4
        26: aconst_null
        27: astore        5
        29: getstatic     #296                // Field activeZones:Ljava/util/List;
        32: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        37: astore        6
        39: aload         6
        41: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        46: ifeq          142
        49: aload         6
        51: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        56: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
        59: astore        7
        61: aload         7
        63: aload_1
        64: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        67: istore        8
        69: aload         7
        71: aload_2
        72: invokevirtual #682                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(Lext/mods/gameserver/model/WorldObject;)Z
        75: istore        9
        77: iload         8
        79: ifeq          115
        82: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
        85: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        88: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        91: aload         7
        93: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
        96: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
        99: astore_3
       100: iload         9
       102: ifeq          115
       105: aload         7
       107: astore        5
       109: aload_3
       110: astore        4
       112: goto          142
       115: iload         9
       117: ifeq          139
       120: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
       123: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
       126: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
       129: aload         7
       131: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
       134: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       137: astore        4
       139: goto          39
       142: aload         5
       144: ifnull        157
       147: aload_3
       148: ifnull        157
       151: aload_3
       152: aload         4
       154: if_acmpeq     158
       157: return
       158: aload_3
       159: invokevirtual #332                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.isEnchanterZone:()Z
       162: ifeq          174
       165: aload_3
       166: invokevirtual #348                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getEnchantChance:()D
       169: dconst_0
       170: dcmpg
       171: ifgt          175
       174: return
       175: bipush        100
       177: invokestatic  #558                // Method ext/mods/commons/random/Rnd.get:(I)I
       180: i2d
       181: aload_3
       182: invokevirtual #348                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getEnchantChance:()D
       185: dcmpl
       186: iflt          215
       189: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       192: ifeq          214
       195: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       198: aload_1
       199: invokevirtual #666                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       202: aload_3
       203: invokevirtual #348                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getEnchantChance:()D
       206: invokedynamic #796,  0            // InvokeDynamic #43:makeConcatWithConstants:(Ljava/lang/String;D)Ljava/lang/String;
       211: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       214: return
       215: new           #227                // class java/util/ArrayList
       218: dup
       219: invokespecial #795                // Method java/util/ArrayList."<init>":()V
       222: astore        6
       224: aload_1
       225: invokevirtual #799                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       228: invokevirtual #803                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
       231: astore        7
       233: aload         7
       235: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       240: astore        8
       242: aload         8
       244: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       249: ifeq          327
       252: aload         8
       254: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       259: checkcast     #808                // class ext/mods/gameserver/model/item/instance/ItemInstance
       262: astore        9
       264: aload         9
       266: ifnonnull     272
       269: goto          242
       272: aload         9
       274: invokevirtual #810                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEnchantable:()Z
       277: ifne          283
       280: goto          242
       283: aload         9
       285: invokevirtual #813                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       288: aload_3
       289: invokevirtual #352                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getMaxEnchant:()I
       292: if_icmplt     298
       295: goto          242
       298: aload         9
       300: invokevirtual #816                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isWeapon:()Z
       303: ifne          314
       306: aload         9
       308: invokevirtual #819                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isArmor:()Z
       311: ifeq          324
       314: aload         6
       316: aload         9
       318: invokeinterface #317,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       323: pop
       324: goto          242
       327: aload         6
       329: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       334: ifeq          359
       337: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       340: ifeq          358
       343: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       346: aload_1
       347: invokevirtual #666                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       350: invokedynamic #822,  0            // InvokeDynamic #44:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       355: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       358: return
       359: aload         6
       361: aload         6
       363: invokeinterface #281,  1          // InterfaceMethod java/util/List.size:()I
       368: invokestatic  #558                // Method ext/mods/commons/random/Rnd.get:(I)I
       371: invokeinterface #309,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       376: checkcast     #808                // class ext/mods/gameserver/model/item/instance/ItemInstance
       379: astore        8
       381: aload         8
       383: invokevirtual #813                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       386: iconst_1
       387: iadd
       388: istore        9
       390: iload         9
       392: aload_3
       393: invokevirtual #352                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getMaxEnchant:()I
       396: if_icmple     405
       399: aload_3
       400: invokevirtual #352                // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getMaxEnchant:()I
       403: istore        9
       405: aload         8
       407: iload         9
       409: aload_1
       410: invokevirtual #823                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
       413: aload_1
       414: invokevirtual #827                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       417: aload_1
       418: aload         8
       420: invokevirtual #830                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemName:()Ljava/lang/String;
       423: iload         9
       425: aload_2
       426: invokevirtual #666                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       429: invokedynamic #833,  0            // InvokeDynamic #45:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
       434: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       437: getstatic     #220                // Field ext/mods/Config.DEVELOPER:Z
       440: ifeq          465
       443: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       446: aload_1
       447: invokevirtual #666                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       450: aload         8
       452: invokevirtual #830                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemName:()Ljava/lang/String;
       455: iload         9
       457: invokedynamic #839,  0            // InvokeDynamic #46:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       462: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       465: return
      LineNumberTable:
        line 569: 0
        line 570: 20
        line 572: 21
        line 573: 23
        line 574: 26
        line 576: 29
        line 578: 61
        line 579: 69
        line 581: 77
        line 583: 82
        line 584: 100
        line 586: 105
        line 587: 109
        line 588: 112
        line 591: 115
        line 593: 120
        line 595: 139
        line 597: 142
        line 598: 157
        line 600: 158
        line 601: 174
        line 603: 175
        line 605: 189
        line 606: 195
        line 607: 214
        line 610: 215
        line 611: 224
        line 612: 233
        line 614: 264
        line 615: 269
        line 617: 272
        line 618: 280
        line 620: 283
        line 621: 295
        line 623: 298
        line 625: 314
        line 627: 324
        line 629: 327
        line 631: 337
        line 632: 343
        line 633: 358
        line 636: 359
        line 638: 381
        line 639: 390
        line 640: 399
        line 642: 405
        line 644: 413
        line 646: 417
        line 648: 437
        line 649: 443
        line 650: 465
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           69      70     8 killerInZone   Z
           77      62     9 victimInZone   Z
           61      78     7  zone   Lext/mods/gameserver/model/zone/type/RandomZone;
          264      60     9  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     466     0  this   Lext/mods/Crypta/RandomManager;
            0     466     1 killer   Lext/mods/gameserver/model/actor/Player;
            0     466     2 victim   Lext/mods/gameserver/model/actor/Player;
           23     443     3 killerZoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
           26     440     4 victimZoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
           29     437     5 sameZone   Lext/mods/gameserver/model/zone/type/RandomZone;
          224     242     6 enchantableItems   Ljava/util/List;
          233     233     7 paperdollItems   Ljava/util/List;
          381      85     8 itemToEnchant   Lext/mods/gameserver/model/item/instance/ItemInstance;
          390      76     9 newEnchantLevel   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          224     242     6 enchantableItems   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
          233     233     7 paperdollItems   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 23
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/Crypta/RandomManager, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/FarmEventRandom/holder/RandomZoneData, class ext/mods/FarmEventRandom/holder/RandomZoneData, class ext/mods/gameserver/model/zone/type/RandomZone, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone, int, int ]
        frame_type = 248 /* chop */
          offset_delta = 23
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 15 /* same */
        frame_type = 0 /* same */
        frame_type = 38 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 26
          locals = [ class java/util/List, class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 10 /* same */
        frame_type = 14 /* same */
        frame_type = 15 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 30 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int ]
        frame_type = 59 /* same */

  public static java.lang.String formatMessage(java.lang.String, java.util.Map<java.lang.String, java.lang.String>);
    descriptor: (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     12
         8: ldc_w         #842                // String
        11: areturn
        12: aload_1
        13: invokeinterface #844,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        18: invokeinterface #848,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        23: astore_2
        24: aload_2
        25: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          92
        33: aload_2
        34: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #851                // class java/util/Map$Entry
        42: astore_3
        43: aload_3
        44: invokeinterface #853,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        49: ifnull        89
        52: aload_3
        53: invokeinterface #856,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        58: ifnull        89
        61: aload_0
        62: aload_3
        63: invokeinterface #853,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        68: checkcast     #130                // class java/lang/String
        71: invokedynamic #859,  0            // InvokeDynamic #47:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        76: aload_3
        77: invokeinterface #856,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        82: checkcast     #860                // class java/lang/CharSequence
        85: invokevirtual #364                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        88: astore_0
        89: goto          24
        92: aload_0
        93: areturn
      LineNumberTable:
        line 654: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      46     3 entry   Ljava/util/Map$Entry;
            0      94     0 template   Ljava/lang/String;
            0      94     1 values   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           43      46     3 entry   Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;
            0      94     1 values   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #1342                        // (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;

  public boolean handleEventTeleportConfirmation(ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=10, args_size=3
         0: getstatic     #31                 // Field isRunning:Z
         3: ifeq          10
         6: aload_1
         7: ifnonnull     12
        10: iconst_0
        11: ireturn
        12: ldc_w         #1042               // String farm_event_teleport
        15: aload_1
        16: invokevirtual #1047               // Method ext/mods/gameserver/model/actor/Player.getLastCommand:()Ljava/lang/String;
        19: invokevirtual #129                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        22: ifne          27
        25: iconst_0
        26: ireturn
        27: aload_1
        28: aconst_null
        29: invokevirtual #1044               // Method ext/mods/gameserver/model/actor/Player.setLastCommand:(Ljava/lang/String;)V
        32: iload_2
        33: ifne          38
        36: iconst_0
        37: ireturn
        38: aload_1
        39: invokevirtual #1034               // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        42: ifne          69
        45: aload_1
        46: invokevirtual #1035               // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        49: ifne          69
        52: aload_1
        53: invokevirtual #1050               // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        56: invokevirtual #1054               // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        59: ifne          69
        62: aload_1
        63: invokevirtual #1059               // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
        66: ifeq          85
        69: aload_1
        70: ldc_w         #1062               // String Teleporte cancelado. Sua condição mudou.
        73: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        76: aload_1
        77: getstatic     #1064               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        80: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        83: iconst_0
        84: ireturn
        85: aload_1
        86: invokevirtual #1038               // Method ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
        89: ifnull        108
        92: aload_1
        93: ldc_w         #1070               // String Você não pode usar este comando dentro de uma dungeon.
        96: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        99: aload_1
       100: getstatic     #1064               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       103: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       106: iconst_0
       107: ireturn
       108: aload_1
       109: getstatic     #1072               // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       112: invokevirtual #1078               // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       115: ifne          128
       118: aload_1
       119: getstatic     #1081               // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       122: invokevirtual #1078               // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       125: ifeq          144
       128: aload_1
       129: ldc_w         #1084               // String Você não pode usar este comando desta área.
       132: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       135: aload_1
       136: getstatic     #1064               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       139: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       142: iconst_0
       143: ireturn
       144: getstatic     #296                // Field activeZones:Ljava/util/List;
       147: ifnull        161
       150: getstatic     #296                // Field activeZones:Ljava/util/List;
       153: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       158: ifeq          177
       161: aload_1
       162: ldc_w         #1086               // String Nenhuma Farm Zone ativa no momento.
       165: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       168: aload_1
       169: getstatic     #1064               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       172: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       175: iconst_0
       176: ireturn
       177: getstatic     #296                // Field activeZones:Ljava/util/List;
       180: invokestatic  #1088               // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       183: checkcast     #234                // class ext/mods/gameserver/model/zone/type/RandomZone
       186: astore_3
       187: aload_3
       188: ifnonnull     207
       191: aload_1
       192: ldc_w         #1091               // String Erro ao selecionar zona do evento.
       195: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       198: aload_1
       199: getstatic     #1064               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       202: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       205: iconst_0
       206: ireturn
       207: aconst_null
       208: astore        4
       210: invokestatic  #48                 // Method ext/mods/FarmEventRandom/RandomData.getInstance:()Lext/mods/FarmEventRandom/RandomData;
       213: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
       216: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
       219: aload_3
       220: invokevirtual #320                // Method ext/mods/gameserver/model/zone/type/RandomZone.getId:()I
       223: invokevirtual #323                // Method ext/mods/FarmEventRandom/RandomData.getZoneData:(Ljava/lang/String;I)Lext/mods/FarmEventRandom/holder/RandomZoneData;
       226: astore        5
       228: aload         5
       230: ifnull        248
       233: aload         5
       235: invokevirtual #1093               // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
       238: ifnull        248
       241: aload         5
       243: invokevirtual #1093               // Method ext/mods/FarmEventRandom/holder/RandomZoneData.getSpawnLocation:()Lext/mods/gameserver/model/location/Location;
       246: astore        4
       248: aload         4
       250: ifnonnull     262
       253: aload_3
       254: getstatic     #1095               // Field ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
       257: invokevirtual #1101               // Method ext/mods/gameserver/model/zone/type/RandomZone.getRndSpawn:(Lext/mods/gameserver/enums/SpawnType;)Lext/mods/gameserver/model/location/Location;
       260: astore        4
       262: aload         4
       264: ifnonnull     451
       267: getstatic     #427                // Field activeSpawns:Ljava/util/List;
       270: ifnull        451
       273: getstatic     #427                // Field activeSpawns:Ljava/util/List;
       276: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       281: ifne          451
       284: new           #227                // class java/util/ArrayList
       287: dup
       288: invokespecial #795                // Method java/util/ArrayList."<init>":()V
       291: astore        6
       293: getstatic     #427                // Field activeSpawns:Ljava/util/List;
       296: invokeinterface #171,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       301: astore        7
       303: aload         7
       305: invokeinterface #177,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       310: ifeq          385
       313: aload         7
       315: invokeinterface #182,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       320: checkcast     #471                // class ext/mods/gameserver/model/spawn/Spawn
       323: astore        8
       325: aload         8
       327: ifnull        382
       330: aload         8
       332: invokevirtual #501                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       335: ifnull        382
       338: aload         8
       340: invokevirtual #1105               // Method ext/mods/gameserver/model/spawn/Spawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       343: astore        9
       345: aload         9
       347: ifnull        382
       350: aload_3
       351: aload         9
       353: invokevirtual #441                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       356: aload         9
       358: invokevirtual #446                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       361: aload         9
       363: invokevirtual #449                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       366: invokevirtual #452                // Method ext/mods/gameserver/model/zone/type/RandomZone.isInsideZone:(III)Z
       369: ifeq          382
       372: aload         6
       374: aload         8
       376: invokeinterface #317,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       381: pop
       382: goto          303
       385: aload         6
       387: invokeinterface #243,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       392: ifne          451
       395: aload         6
       397: invokestatic  #1088               // Method ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
       400: checkcast     #471                // class ext/mods/gameserver/model/spawn/Spawn
       403: astore        7
       405: aload         7
       407: ifnull        451
       410: aload         7
       412: invokevirtual #501                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       415: ifnull        451
       418: new           #543                // class ext/mods/gameserver/model/location/Location
       421: dup
       422: aload         7
       424: invokevirtual #501                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       427: invokevirtual #1106               // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       430: aload         7
       432: invokevirtual #501                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       435: invokevirtual #1107               // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       438: aload         7
       440: invokevirtual #501                // Method ext/mods/gameserver/model/spawn/Spawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
       443: invokevirtual #1108               // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       446: invokespecial #545                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       449: astore        4
       451: aload         4
       453: ifnonnull     487
       456: aload_3
       457: invokevirtual #952                // Method ext/mods/gameserver/model/zone/type/RandomZone.getReturnLocation:()Lext/mods/gameserver/model/location/Location;
       460: astore        6
       462: aload         6
       464: ifnull        487
       467: aload         6
       469: invokevirtual #563                // Method ext/mods/gameserver/model/location/Location.getX:()I
       472: ifeq          487
       475: aload         6
       477: invokevirtual #564                // Method ext/mods/gameserver/model/location/Location.getY:()I
       480: ifeq          487
       483: aload         6
       485: astore        4
       487: aload         4
       489: ifnonnull     508
       492: aload_1
       493: ldc_w         #1109               // String Não foi possível encontrar um ponto de teleporte na Farm Zone.
       496: invokevirtual #836                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       499: aload_1
       500: getstatic     #1064               // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       503: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       506: iconst_0
       507: ireturn
       508: aload         4
       510: astore        6
       512: sipush        2040
       515: istore        7
       517: iconst_1
       518: istore        8
       520: sipush        17000
       523: istore        9
       525: aload_1
       526: new           #1111               // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       529: dup
       530: aload_1
       531: aload_1
       532: sipush        2040
       535: iconst_1
       536: sipush        17000
       539: iconst_0
       540: invokespecial #1113               // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       543: invokevirtual #1116               // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       546: aload_1
       547: new           #1119               // class ext/mods/gameserver/network/serverpackets/SetupGauge
       550: dup
       551: getstatic     #1121               // Field ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
       554: sipush        17000
       557: invokespecial #1127               // Method ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
       560: invokevirtual #979                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       563: aload_1
       564: aload         6
       566: invokedynamic #1130,  0           // InvokeDynamic #58:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
       571: ldc2_w        #1133               // long 17000l
       574: invokestatic  #202                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       577: pop
       578: iconst_1
       579: ireturn
      LineNumberTable:
        line 875: 0
        line 876: 10
        line 878: 12
        line 879: 25
        line 881: 27
        line 883: 32
        line 884: 36
        line 886: 38
        line 887: 53
        line 889: 69
        line 890: 76
        line 891: 83
        line 894: 85
        line 896: 92
        line 897: 99
        line 898: 106
        line 901: 108
        line 902: 122
        line 904: 128
        line 905: 135
        line 906: 142
        line 909: 144
        line 911: 161
        line 912: 168
        line 913: 175
        line 916: 177
        line 917: 187
        line 919: 191
        line 920: 198
        line 921: 205
        line 924: 207
        line 925: 210
        line 926: 228
        line 928: 241
        line 931: 248
        line 933: 253
        line 936: 262
        line 938: 267
        line 940: 284
        line 941: 293
        line 943: 325
        line 945: 338
        line 946: 345
        line 948: 372
        line 951: 382
        line 953: 385
        line 955: 395
        line 956: 405
        line 958: 418
        line 964: 451
        line 966: 456
        line 967: 462
        line 969: 483
        line 973: 487
        line 975: 492
        line 976: 499
        line 977: 506
        line 980: 508
        line 981: 512
        line 982: 517
        line 983: 520
        line 985: 525
        line 986: 546
        line 988: 563
        line 995: 578
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          345      37     9 spawnLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          325      57     8 spawn   Lext/mods/gameserver/model/spawn/Spawn;
          405      46     7 selectedSpawn   Lext/mods/gameserver/model/spawn/Spawn;
          293     158     6 zoneSpawns   Ljava/util/List;
          462      25     6 returnLoc   Lext/mods/gameserver/model/location/Location;
            0     580     0  this   Lext/mods/Crypta/RandomManager;
            0     580     1 player   Lext/mods/gameserver/model/actor/Player;
            0     580     2 confirmed   Z
          187     393     3 targetZone   Lext/mods/gameserver/model/zone/type/RandomZone;
          210     370     4   loc   Lext/mods/gameserver/model/location/Location;
          228     352     5 zoneData   Lext/mods/FarmEventRandom/holder/RandomZoneData;
          512      68     6 finalLoc   Lext/mods/gameserver/model/location/Location;
          517      63     7 SOE_VISUAL_SKILL_ID   I
          520      60     8 SOE_VISUAL_SKILL_LEVEL   I
          525      55     9 CAST_TIME_MS   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          293     158     6 zoneSpawns   Ljava/util/List<Lext/mods/gameserver/model/spawn/Spawn;>;
      StackMapTable: number_of_entries = 20
        frame_type = 10 /* same */
        frame_type = 1 /* same */
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 30 /* same */
        frame_type = 15 /* same */
        frame_type = 22 /* same */
        frame_type = 19 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/zone/type/RandomZone ]
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/location/Location, class ext/mods/FarmEventRandom/holder/RandomZoneData ]
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 78
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 65
        frame_type = 35 /* same */
        frame_type = 20 /* same */

  public static ext.mods.Crypta.RandomManager getInstance();
    descriptor: ()Lext/mods/Crypta/RandomManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #1135               // Field ext/mods/Crypta/RandomManager$SingletonHolder._instance:Lext/mods/Crypta/RandomManager;
         3: areturn
      LineNumberTable:
        line 998: 0

  public boolean isRunning();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #31                 // Field isRunning:Z
         3: ireturn
      LineNumberTable:
        line 1002: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/Crypta/RandomManager;

  public java.lang.String getTutorialAlertHtml(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_1
         1: ifnull        10
         4: getstatic     #31                 // Field isRunning:Z
         7: ifne          12
        10: aconst_null
        11: areturn
        12: invokestatic  #1144               // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        15: aload_1
        16: invokevirtual #1149               // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        19: ldc_w         #1153               // String html/mods/tournament/tutorial_alert_random.htm
        22: invokevirtual #1155               // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        25: astore_2
        26: aload_2
        27: ifnull        37
        30: aload_2
        31: invokevirtual #598                // Method java/lang/String.isEmpty:()Z
        34: ifeq          39
        37: aconst_null
        38: areturn
        39: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        42: ifnull        54
        45: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        48: invokevirtual #66                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getName:()Ljava/lang/String;
        51: goto          57
        54: ldc_w         #1159               // String Random Event
        57: astore_3
        58: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        61: ifnull        73
        64: getstatic     #7                  // Field config:Lext/mods/FarmEventRandom/holder/RamdomConfig;
        67: invokevirtual #13                 // Method ext/mods/FarmEventRandom/holder/RamdomConfig.getInterval:()I
        70: goto          74
        73: iconst_1
        74: istore        4
        76: aload_3
        77: iload         4
        79: iload         4
        81: iconst_1
        82: if_icmpne     91
        85: ldc_w         #1161               // String  hour.
        88: goto          94
        91: ldc_w         #1163               // String  hours.
        94: invokedynamic #1165,  0           // InvokeDynamic #59:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        99: astore        5
       101: aload_2
       102: ldc_w         #1166               // String %message%
       105: aload         5
       107: invokevirtual #364                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       110: areturn
      LineNumberTable:
        line 1014: 0
        line 1015: 12
        line 1016: 26
        line 1017: 39
        line 1018: 58
        line 1019: 76
        line 1020: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/Crypta/RandomManager;
            0     111     1 player   Lext/mods/gameserver/model/actor/Player;
           26      85     2  html   Ljava/lang/String;
           58      53     3 eventName   Ljava/lang/String;
           76      35     4 intervalHours   I
          101      10     5   msg   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 10 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]
        frame_type = 1 /* same */
        frame_type = 14 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/String ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/Crypta/RandomManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/Crypta/RandomManager, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/String, int, class java/lang/String ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #26                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/Crypta/RandomManager
         6: invokevirtual #1208               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #1211               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #227                // class java/util/ArrayList
        18: dup
        19: invokespecial #795                // Method java/util/ArrayList."<init>":()V
        22: invokestatic  #1213               // Method java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        25: putstatic     #296                // Field activeZones:Ljava/util/List;
        28: new           #227                // class java/util/ArrayList
        31: dup
        32: invokespecial #795                // Method java/util/ArrayList."<init>":()V
        35: invokestatic  #1213               // Method java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        38: putstatic     #427                // Field activeSpawns:Ljava/util/List;
        41: new           #227                // class java/util/ArrayList
        44: dup
        45: invokespecial #795                // Method java/util/ArrayList."<init>":()V
        48: invokestatic  #1213               // Method java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        51: putstatic     #402                // Field oldMonsters:Ljava/util/List;
        54: return
      LineNumberTable:
        line 77: 0
        line 79: 15
        line 80: 28
        line 81: 41
}
SourceFile: "RandomManager.java"
NestMembers:
  ext/mods/Crypta/RandomManager$SingletonHolder
BootstrapMethods:
  0: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1425 REF_invokeVirtual ext/mods/Crypta/RandomManager.checkStartEvent:()V
      #1424 ()V
  1: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1428 RandomEvent: Event checker started. Evento: \u0001
  2: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1430 RandomEvent: Event STARTING. Time matched: \u0001
  3: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1432 REF_invokeStatic ext/mods/Crypta/RandomManager.sendQuestionMarkToAllOnline:()V
      #1424 ()V
  4: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1433 \u0001 segundos
  5: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1435 \u0001 minutos
  6: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1437 \u0001: \u0001
  7: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1439 REF_invokeVirtual ext/mods/Crypta/RandomManager.activateZonesAndSpawn:()V
      #1424 ()V
  8: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1442 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$startZoneCleaner$0:(I)V
      #1424 ()V
  9: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1446 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$activateZonesAndSpawn$0:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
      #1449 (Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  10: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1450 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$activateZonesAndSpawn$1:(Lext/mods/gameserver/model/zone/type/RandomZone;)Z
      #1449 (Lext/mods/gameserver/model/zone/type/RandomZone;)Z
  11: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1453 [Debug Event] Zonas elegíveis (active=true) encontradas: \u0001. Sorteando \u0001 delas.
  12: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1455 RandomEvent: Zone Activated: \u0001 (ID: \u0001)
  13: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1457 [Debug Event] Using ZoneData: zoneId=\u0001, isVip=\u0001, isPartyZone=\u0001, dwarvenOnly=\u0001, enchanterZone=\u0001, enchantChance=\u0001%, maxEnchant=\u0001
  14: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1459 [Debug Event] CRITICAL: ZoneData is null even after filtering! Zone ID: \u0001
  15: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1461 \u0001 [DWARVEN Only]
  16: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1463 \u0001 [Enchanter Zone - PvP Ativo - Chance: \u0001% - Max: +\u0001]
  17: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1465 [Debug Spawn] Pausing \u0001 old monsters from active zones.
  18: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1467 RandomEvent: No <spawns> data found for zoneId=\u0001
  19: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1469 [Debug Spawn] Spawning for Zone ID \u0001 (useOriginals=\u0001)
  20: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1471 [Debug Spawn] MODE 1/3: Re-spawning original NPC \u0001 with default title: \u0001 and respawn: \u0001
  21: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1473 [Debug Spawn] MODE 2/3: Spawning custom NPC \u0001 Count: \u0001
  22: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1475 \u0001\u0001
  23: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1477 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$startCountdown$0:(ZJ)V
      #1424 ()V
  24: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1480 REF_invokeVirtual ext/mods/Crypta/RandomManager.lambda$scheduleZoneSwitch$0:()V
      #1424 ()V
  25: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1483 [Debug Event] cleanPreviousMonsters: Saved \u0001 old NPCs from active zones.
  26: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1485 [Debug Event] Deleting \u0001 event spawns.
  27: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1487 [Debug Event] Re-spawning \u0001 old monsters.
  28: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1489 [Debug Kill] \u0001 killed \u0001
  29: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1491 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$onKill$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  30: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1496 [Debug Kill] Monster \u0001 is an event monster. Checking drops...
  31: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1498 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$onKill$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
      #1501 (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  32: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1503 [Debug Kill] SUCCESS! Dropping item \u0001 (Chance: \u0001)
  33: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1505 [Debug Kill] FAILED drop for item \u0001 (Chance: \u0001)
  34: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1507 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  35: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1510 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
      #1501 (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  36: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1513 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  37: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1516 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
      #1501 (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  38: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1519 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  39: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1522 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
      #1501 (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  40: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1525 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  41: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1528 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
      #1501 (Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;)Z
  42: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1531 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$isEventMonster$0:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  43: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1534 [Debug Enchant] Encantamento falhou para \u0001 (chance: \u0001%)
  44: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1536 [Debug Enchant] Nenhum item encantável encontrado para \u0001
  45: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1538 Você encantou \u0001 para +\u0001 ao vencer \u0001 em PvP!
  46: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1540 [Debug Enchant] \u0001 encantou \u0001 para +\u0001 (kill PvP em Enchanter_Zone)
  47: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1542 %\u0001%
  48: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1544 REF_invokeVirtual ext/mods/Crypta/RandomManager.checkPartyIntegrity:()V
      #1424 ()V
  49: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1547 [Debug Party Check] Verificando Zona: \u0001 (ID: \u0001)
  50: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1549 [Debug Party Check] Player \u0001 não está mais em party.
  51: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1551 Sua Party não tem mais o número mínimo de \u0001 membros.
  52: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1553 [Debug Party Check] Party de \u0001 tem menos que \u0001 membros.
  53: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1555 [Debug Party Check] Membro \u0001 da party de \u0001 não está na zona.
  54: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1557 [Debug Party Check] Expulsando party do líder \u0001 da zona \u0001. Razão: \u0001
  55: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1559 [Debug Party Check] Expulsando jogador \u0001 (sem party) da zona \u0001. Razão: \u0001
  56: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1561 [Debug Party Check] Party de \u0001 OK na zona \u0001
  57: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1563 REF_invokeVirtual ext/mods/Crypta/RandomManager.updateEnchanterZonePvpFlags:()V
      #1424 ()V
  58: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1424 ()V
      #1566 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$handleEventTeleportConfirmation$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
      #1424 ()V
  59: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1569 \u0001 is active! Zones have been announced. Duration: \u0001\u0001
  60: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1571 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateAdena$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  61: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1574 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateSp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  62: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1577 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$getActiveRateXp$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  63: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1580 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$shouldCancelOriginalDrop$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  64: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1583 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$onKill$2:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/FarmEventRandom/holder/RandomSpawnHolder;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  65: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1586 \u0001h
  66: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1588 \u0001m
  67: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1590 \u0001s
  68: #1597 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1445 (Ljava/lang/Object;)Z
      #1592 REF_invokeStatic ext/mods/Crypta/RandomManager.lambda$startZoneCleaner$1:(Lext/mods/gameserver/model/actor/Attackable;Lext/mods/gameserver/model/spawn/Spawn;)Z
      #1494 (Lext/mods/gameserver/model/spawn/Spawn;)Z
  69: #1604 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1595 [Debug Cleaner] Removing non-event NPC: \u0001 (ID: \u0001)
InnerClasses:
  public static #1611= #851 of #159;      // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #1617= #1613 of #1615; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
