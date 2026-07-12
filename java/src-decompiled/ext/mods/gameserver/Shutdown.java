// Bytecode for: ext.mods.gameserver.Shutdown
// File: ext\mods\gameserver\Shutdown.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/Shutdown.class
  Last modified 9 de jul de 2026; size 12618 bytes
  MD5 checksum 7df9867f43cb58348eda15f06ad5fbca
  Compiled from "Shutdown.java"
public class ext.mods.gameserver.Shutdown extends java.lang.Thread
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/Shutdown
  super_class: #2                         // java/lang/Thread
  interfaces: 0, fields: 9, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Thread."<init>":()V
    #2 = Class              #4            // java/lang/Thread
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Thread
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/Shutdown._secondsShut:I
    #8 = Class              #10           // ext/mods/gameserver/Shutdown
    #9 = NameAndType        #11:#12       // _secondsShut:I
   #10 = Utf8               ext/mods/gameserver/Shutdown
   #11 = Utf8               _secondsShut
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/Shutdown._shutdownMode:I
   #14 = NameAndType        #15:#12       // _shutdownMode:I
   #15 = Utf8               _shutdownMode
   #16 = Methodref          #17.#18       // java/lang/Math.max:(II)I
   #17 = Class              #19           // java/lang/Math
   #18 = NameAndType        #20:#21       // max:(II)I
   #19 = Utf8               java/lang/Math
   #20 = Utf8               max
   #21 = Utf8               (II)I
   #22 = Fieldref           #23.#24       // ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
   #23 = Class              #25           // ext/mods/gameserver/Shutdown$SingletonHolder
   #24 = NameAndType        #26:#27       // INSTANCE:Lext/mods/gameserver/Shutdown;
   #25 = Utf8               ext/mods/gameserver/Shutdown$SingletonHolder
   #26 = Utf8               INSTANCE
   #27 = Utf8               Lext/mods/gameserver/Shutdown;
   #28 = String             #29           // os.name
   #29 = Utf8               os.name
   #30 = Methodref          #31.#32       // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #31 = Class              #33           // java/lang/System
   #32 = NameAndType        #34:#35       // getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #33 = Utf8               java/lang/System
   #34 = Utf8               getProperty
   #35 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #36 = Methodref          #37.#38       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #37 = Class              #39           // java/lang/String
   #38 = NameAndType        #40:#41       // toLowerCase:()Ljava/lang/String;
   #39 = Utf8               java/lang/String
   #40 = Utf8               toLowerCase
   #41 = Utf8               ()Ljava/lang/String;
   #42 = String             #43           // win
   #43 = Utf8               win
   #44 = Methodref          #37.#45       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #45 = NameAndType        #46:#47       // contains:(Ljava/lang/CharSequence;)Z
   #46 = Utf8               contains
   #47 = Utf8               (Ljava/lang/CharSequence;)Z
   #48 = String             #49           // mac
   #49 = Utf8               mac
   #50 = Methodref          #8.#51        // ext/mods/gameserver/Shutdown.playServerLoadedSound:()V
   #51 = NameAndType        #52:#6        // playServerLoadedSound:()V
   #52 = Utf8               playServerLoadedSound
   #53 = Methodref          #54.#55       // ext/mods/extensions/listener/manager/GameListenerManager.getInstance:()Lext/mods/extensions/listener/manager/GameListenerManager;
   #54 = Class              #56           // ext/mods/extensions/listener/manager/GameListenerManager
   #55 = NameAndType        #57:#58       // getInstance:()Lext/mods/extensions/listener/manager/GameListenerManager;
   #56 = Utf8               ext/mods/extensions/listener/manager/GameListenerManager
   #57 = Utf8               getInstance
   #58 = Utf8               ()Lext/mods/extensions/listener/manager/GameListenerManager;
   #59 = Methodref          #54.#60       // ext/mods/extensions/listener/manager/GameListenerManager.notifyShutdown:()V
   #60 = NameAndType        #61:#6        // notifyShutdown:()V
   #61 = Utf8               notifyShutdown
   #62 = Fieldref           #8.#63        // ext/mods/gameserver/Shutdown.MODE_TEXT:[Ljava/lang/String;
   #63 = NameAndType        #64:#65       // MODE_TEXT:[Ljava/lang/String;
   #64 = Utf8               MODE_TEXT
   #65 = Utf8               [Ljava/lang/String;
   #66 = InvokeDynamic      #0:#67        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #67 = NameAndType        #68:#35       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #68 = Utf8               makeConcatWithConstants
   #69 = Methodref          #70.#71       // ext/mods/commons/lang/StringUtil.printSection:(Ljava/lang/String;)V
   #70 = Class              #72           // ext/mods/commons/lang/StringUtil
   #71 = NameAndType        #73:#74       // printSection:(Ljava/lang/String;)V
   #72 = Utf8               ext/mods/commons/lang/StringUtil
   #73 = Utf8               printSection
   #74 = Utf8               (Ljava/lang/String;)V
   #75 = Fieldref           #76.#77       // ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
   #76 = Class              #78           // ext/mods/Config
   #77 = NameAndType        #79:#80       // OFFLINE_TRADE_ENABLE:Z
   #78 = Utf8               ext/mods/Config
   #79 = Utf8               OFFLINE_TRADE_ENABLE
   #80 = Utf8               Z
   #81 = Fieldref           #76.#82       // ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
   #82 = NameAndType        #83:#80       // OFFLINE_CRAFT_ENABLE:Z
   #83 = Utf8               OFFLINE_CRAFT_ENABLE
   #84 = Fieldref           #76.#85       // ext/mods/Config.RESTORE_OFFLINERS:Z
   #85 = NameAndType        #86:#80       // RESTORE_OFFLINERS:Z
   #86 = Utf8               RESTORE_OFFLINERS
   #87 = Methodref          #88.#89       // ext/mods/gameserver/data/sql/OfflineTradersTable.getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
   #88 = Class              #90           // ext/mods/gameserver/data/sql/OfflineTradersTable
   #89 = NameAndType        #57:#91       // getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
   #90 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable
   #91 = Utf8               ()Lext/mods/gameserver/data/sql/OfflineTradersTable;
   #92 = Methodref          #88.#93       // ext/mods/gameserver/data/sql/OfflineTradersTable.store:()V
   #93 = NameAndType        #94:#6        // store:()V
   #94 = Utf8               store
   #95 = Class              #96           // java/lang/Throwable
   #96 = Utf8               java/lang/Throwable
   #97 = Methodref          #8.#98        // ext/mods/gameserver/Shutdown.disconnectAllPlayers:()V
   #98 = NameAndType        #99:#6        // disconnectAllPlayers:()V
   #99 = Utf8               disconnectAllPlayers
  #100 = Fieldref           #8.#101       // ext/mods/gameserver/Shutdown.LOGGER:Lext/mods/commons/logging/CLogger;
  #101 = NameAndType        #102:#103     // LOGGER:Lext/mods/commons/logging/CLogger;
  #102 = Utf8               LOGGER
  #103 = Utf8               Lext/mods/commons/logging/CLogger;
  #104 = String             #105          // Players have been disconnected.
  #105 = Utf8               Players have been disconnected.
  #106 = Methodref          #107.#108     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #107 = Class              #109          // ext/mods/commons/logging/CLogger
  #108 = NameAndType        #110:#111     // info:(Ljava/lang/Object;)V
  #109 = Utf8               ext/mods/commons/logging/CLogger
  #110 = Utf8               info
  #111 = Utf8               (Ljava/lang/Object;)V
  #112 = Class              #113          // java/lang/Exception
  #113 = Utf8               java/lang/Exception
  #114 = Methodref          #115.#116     // ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
  #115 = Class              #117          // ext/mods/gameserver/LoginServerThread
  #116 = NameAndType        #57:#118      // getInstance:()Lext/mods/gameserver/LoginServerThread;
  #117 = Utf8               ext/mods/gameserver/LoginServerThread
  #118 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #119 = Methodref          #115.#120     // ext/mods/gameserver/LoginServerThread.interrupt:()V
  #120 = NameAndType        #121:#6       // interrupt:()V
  #121 = Utf8               interrupt
  #122 = Methodref          #123.#124     // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #123 = Class              #125          // ext/mods/gameserver/data/manager/SevenSignsManager
  #124 = NameAndType        #57:#126      // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #125 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #126 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #127 = Methodref          #123.#128     // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
  #128 = NameAndType        #129:#130     // isSealValidationPeriod:()Z
  #129 = Utf8               isSealValidationPeriod
  #130 = Utf8               ()Z
  #131 = Methodref          #132.#133     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #132 = Class              #134          // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #133 = NameAndType        #57:#135      // getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #134 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
  #135 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
  #136 = Methodref          #132.#137     // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.saveFestivalData:(Z)V
  #137 = NameAndType        #138:#139     // saveFestivalData:(Z)V
  #138 = Utf8               saveFestivalData
  #139 = Utf8               (Z)V
  #140 = String             #141          // FestivalOfDarknessManager has been saved.
  #141 = Utf8               FestivalOfDarknessManager has been saved.
  #142 = Methodref          #123.#143     // ext/mods/gameserver/data/manager/SevenSignsManager.saveSevenSignsData:()V
  #143 = NameAndType        #144:#6       // saveSevenSignsData:()V
  #144 = Utf8               saveSevenSignsData
  #145 = Methodref          #123.#146     // ext/mods/gameserver/data/manager/SevenSignsManager.saveSevenSignsStatus:()V
  #146 = NameAndType        #147:#6       // saveSevenSignsStatus:()V
  #147 = Utf8               saveSevenSignsStatus
  #148 = String             #149          // SevenSignsManager has been saved.
  #149 = Utf8               SevenSignsManager has been saved.
  #150 = Methodref          #151.#152     // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #151 = Class              #153          // ext/mods/gameserver/data/xml/ScriptData
  #152 = NameAndType        #57:#154      // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #153 = Utf8               ext/mods/gameserver/data/xml/ScriptData
  #154 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
  #155 = Methodref          #151.#156     // ext/mods/gameserver/data/xml/ScriptData.stopAllScripts:()V
  #156 = NameAndType        #157:#6       // stopAllScripts:()V
  #157 = Utf8               stopAllScripts
  #158 = String             #159          // Running scripts have been stopped.
  #159 = Utf8               Running scripts have been stopped.
  #160 = Methodref          #161.#162     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #161 = Class              #163          // ext/mods/gameserver/data/manager/ZoneManager
  #162 = NameAndType        #57:#164      // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #163 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #164 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #165 = Methodref          #161.#166     // ext/mods/gameserver/data/manager/ZoneManager.save:()V
  #166 = NameAndType        #167:#6       // save:()V
  #167 = Utf8               save
  #168 = String             #169          // ZoneManager has been saved.
  #169 = Utf8               ZoneManager has been saved.
  #170 = Methodref          #171.#172     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #171 = Class              #173          // ext/mods/gameserver/data/manager/SpawnManager
  #172 = NameAndType        #57:#174      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #173 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #174 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #175 = Methodref          #171.#166     // ext/mods/gameserver/data/manager/SpawnManager.save:()V
  #176 = String             #177          // SpawnManager has been saved.
  #177 = Utf8               SpawnManager has been saved.
  #178 = Fieldref           #76.#179      // ext/mods/Config.OLY_ENABLED:Z
  #179 = NameAndType        #180:#80      // OLY_ENABLED:Z
  #180 = Utf8               OLY_ENABLED
  #181 = Methodref          #182.#183     // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #182 = Class              #184          // ext/mods/gameserver/model/olympiad/Olympiad
  #183 = NameAndType        #57:#185      // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
  #184 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
  #185 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
  #186 = Methodref          #182.#187     // ext/mods/gameserver/model/olympiad/Olympiad.saveOlympiadStatus:()V
  #187 = NameAndType        #188:#6       // saveOlympiadStatus:()V
  #188 = Utf8               saveOlympiadStatus
  #189 = String             #190          // Olympiad has been saved.
  #190 = Utf8               Olympiad has been saved.
  #191 = Methodref          #192.#193     // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #192 = Class              #194          // ext/mods/gameserver/data/manager/HeroManager
  #193 = NameAndType        #57:#195      // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #194 = Utf8               ext/mods/gameserver/data/manager/HeroManager
  #195 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
  #196 = Methodref          #192.#197     // ext/mods/gameserver/data/manager/HeroManager.shutdown:()V
  #197 = NameAndType        #198:#6       // shutdown:()V
  #198 = Utf8               shutdown
  #199 = String             #200          // HeroManager has been saved.
  #200 = Utf8               HeroManager has been saved.
  #201 = Methodref          #202.#203     // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
  #202 = Class              #204          // ext/mods/gameserver/data/manager/CastleManorManager
  #203 = NameAndType        #57:#205      // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
  #204 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
  #205 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
  #206 = Methodref          #202.#207     // ext/mods/gameserver/data/manager/CastleManorManager.storeMe:()Z
  #207 = NameAndType        #208:#130     // storeMe:()Z
  #208 = Utf8               storeMe
  #209 = String             #210          // CastleManorManager has been saved.
  #210 = Utf8               CastleManorManager has been saved.
  #211 = Methodref          #212.#213     // ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #212 = Class              #214          // ext/mods/gameserver/data/manager/FishingChampionshipManager
  #213 = NameAndType        #57:#215      // getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #214 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager
  #215 = Utf8               ()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
  #216 = Methodref          #212.#197     // ext/mods/gameserver/data/manager/FishingChampionshipManager.shutdown:()V
  #217 = String             #218          // FishingChampionshipManager has been saved.
  #218 = Utf8               FishingChampionshipManager has been saved.
  #219 = Methodref          #220.#221     // ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
  #220 = Class              #222          // ext/mods/gameserver/data/manager/BufferManager
  #221 = NameAndType        #57:#223      // getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
  #222 = Utf8               ext/mods/gameserver/data/manager/BufferManager
  #223 = Utf8               ()Lext/mods/gameserver/data/manager/BufferManager;
  #224 = Methodref          #220.#225     // ext/mods/gameserver/data/manager/BufferManager.saveSchemes:()V
  #225 = NameAndType        #226:#6       // saveSchemes:()V
  #226 = Utf8               saveSchemes
  #227 = String             #228          // BufferManager has been saved.
  #228 = Utf8               BufferManager has been saved.
  #229 = Methodref          #230.#231     // ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
  #230 = Class              #232          // ext/mods/gameserver/data/manager/PetitionManager
  #231 = NameAndType        #57:#233      // getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
  #232 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
  #233 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
  #234 = Methodref          #230.#93      // ext/mods/gameserver/data/manager/PetitionManager.store:()V
  #235 = String             #236          // PetitionManager has been saved.
  #236 = Utf8               PetitionManager has been saved.
  #237 = Methodref          #238.#239     // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #238 = Class              #240          // ext/mods/gameserver/data/manager/ClanHallManager
  #239 = NameAndType        #57:#241      // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
  #240 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
  #241 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
  #242 = Methodref          #238.#166     // ext/mods/gameserver/data/manager/ClanHallManager.save:()V
  #243 = String             #244          // ClanHallManager has been saved.
  #244 = Utf8               ClanHallManager has been saved.
  #245 = Methodref          #246.#247     // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #246 = Class              #248          // ext/mods/gameserver/data/manager/RelationManager
  #247 = NameAndType        #57:#249      // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #248 = Utf8               ext/mods/gameserver/data/manager/RelationManager
  #249 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
  #250 = Methodref          #246.#166     // ext/mods/gameserver/data/manager/RelationManager.save:()V
  #251 = String             #252          // RelationManager has been saved.
  #252 = Utf8               RelationManager has been saved.
  #253 = Methodref          #254.#255     // ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
  #254 = Class              #256          // ext/mods/gameserver/data/manager/CoupleManager
  #255 = NameAndType        #57:#257      // getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
  #256 = Utf8               ext/mods/gameserver/data/manager/CoupleManager
  #257 = Utf8               ()Lext/mods/gameserver/data/manager/CoupleManager;
  #258 = Methodref          #254.#166     // ext/mods/gameserver/data/manager/CoupleManager.save:()V
  #259 = String             #260          // CoupleManager has been saved.
  #260 = Utf8               CoupleManager has been saved.
  #261 = Methodref          #262.#263     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #262 = Class              #264          // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #263 = NameAndType        #57:#265      // getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #264 = Utf8               ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #265 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #266 = Methodref          #262.#166     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.save:()V
  #267 = String             #268          // ItemInstanceTaskManager has been saved.
  #268 = Utf8               ItemInstanceTaskManager has been saved.
  #269 = Methodref          #270.#271     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #270 = Class              #272          // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
  #271 = NameAndType        #57:#273      // getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #272 = Utf8               ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
  #273 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #274 = Methodref          #270.#166     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.save:()V
  #275 = String             #276          // ItemsOnGroundTaskManager has been saved.
  #276 = Utf8               ItemsOnGroundTaskManager has been saved.
  #277 = Methodref          #278.#279     // ext/mods/gameserver/data/sql/ServerMemoTable.getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
  #278 = Class              #280          // ext/mods/gameserver/data/sql/ServerMemoTable
  #279 = NameAndType        #57:#281      // getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
  #280 = Utf8               ext/mods/gameserver/data/sql/ServerMemoTable
  #281 = Utf8               ()Lext/mods/gameserver/data/sql/ServerMemoTable;
  #282 = String             #283          // server_crash
  #283 = Utf8               server_crash
  #284 = Methodref          #278.#285     // ext/mods/gameserver/data/sql/ServerMemoTable.set:(Ljava/lang/String;Z)V
  #285 = NameAndType        #286:#287     // set:(Ljava/lang/String;Z)V
  #286 = Utf8               set
  #287 = Utf8               (Ljava/lang/String;Z)V
  #288 = Methodref          #289.#290     // ext/mods/gameserver/GameServer.getInstance:()Lext/mods/gameserver/GameServer;
  #289 = Class              #291          // ext/mods/gameserver/GameServer
  #290 = NameAndType        #57:#292      // getInstance:()Lext/mods/gameserver/GameServer;
  #291 = Utf8               ext/mods/gameserver/GameServer
  #292 = Utf8               ()Lext/mods/gameserver/GameServer;
  #293 = Methodref          #289.#294     // ext/mods/gameserver/GameServer.getSelectorThread:()Lext/mods/commons/mmocore/SelectorThread;
  #294 = NameAndType        #295:#296     // getSelectorThread:()Lext/mods/commons/mmocore/SelectorThread;
  #295 = Utf8               getSelectorThread
  #296 = Utf8               ()Lext/mods/commons/mmocore/SelectorThread;
  #297 = Methodref          #298.#197     // ext/mods/commons/mmocore/SelectorThread.shutdown:()V
  #298 = Class              #299          // ext/mods/commons/mmocore/SelectorThread
  #299 = Utf8               ext/mods/commons/mmocore/SelectorThread
  #300 = Methodref          #301.#302     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #301 = Class              #303          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  #302 = NameAndType        #57:#304      // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #303 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  #304 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #305 = Methodref          #301.#197     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.shutdown:()V
  #306 = String             #307          // PathfinderCache has been shut down.
  #307 = Utf8               PathfinderCache has been shut down.
  #308 = Methodref          #309.#197     // ext/mods/commons/pool/ThreadPool.shutdown:()V
  #309 = Class              #310          // ext/mods/commons/pool/ThreadPool
  #310 = Utf8               ext/mods/commons/pool/ThreadPool
  #311 = String             #312          // ThreadPool has been shut down.
  #312 = Utf8               ThreadPool has been shut down.
  #313 = Methodref          #314.#197     // ext/mods/commons/pool/ConnectionPool.shutdown:()V
  #314 = Class              #315          // ext/mods/commons/pool/ConnectionPool
  #315 = Utf8               ext/mods/commons/pool/ConnectionPool
  #316 = Methodref          #317.#318     // ext/mods/commons/util/JvmOptimizer.setNormalShutdown:()V
  #317 = Class              #319          // ext/mods/commons/util/JvmOptimizer
  #318 = NameAndType        #320:#6       // setNormalShutdown:()V
  #319 = Utf8               ext/mods/commons/util/JvmOptimizer
  #320 = Utf8               setNormalShutdown
  #321 = Methodref          #322.#323     // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
  #322 = Class              #324          // java/lang/Runtime
  #323 = NameAndType        #325:#326     // getRuntime:()Ljava/lang/Runtime;
  #324 = Utf8               java/lang/Runtime
  #325 = Utf8               getRuntime
  #326 = Utf8               ()Ljava/lang/Runtime;
  #327 = Methodref          #322.#328     // java/lang/Runtime.halt:(I)V
  #328 = NameAndType        #329:#330     // halt:(I)V
  #329 = Utf8               halt
  #330 = Utf8               (I)V
  #331 = Methodref          #8.#332       // ext/mods/gameserver/Shutdown.countdown:()V
  #332 = NameAndType        #333:#6       // countdown:()V
  #333 = Utf8               countdown
  #334 = Methodref          #8.#335       // ext/mods/gameserver/Shutdown.setMode:(I)V
  #335 = NameAndType        #336:#330     // setMode:(I)V
  #336 = Utf8               setMode
  #337 = Methodref          #8.#338       // ext/mods/gameserver/Shutdown.run:()V
  #338 = NameAndType        #339:#6       // run:()V
  #339 = Utf8               run
  #340 = Methodref          #31.#341      // java/lang/System.exit:(I)V
  #341 = NameAndType        #342:#330     // exit:(I)V
  #342 = Utf8               exit
  #343 = String             #344          // GM: {} issued {} process in {} seconds.
  #344 = Utf8               GM: {} issued {} process in {} seconds.
  #345 = Class              #346          // java/lang/Object
  #346 = Utf8               java/lang/Object
  #347 = Methodref          #348.#349     // ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
  #348 = Class              #350          // ext/mods/gameserver/model/actor/Player
  #349 = NameAndType        #351:#41      // toString:()Ljava/lang/String;
  #350 = Utf8               ext/mods/gameserver/model/actor/Player
  #351 = Utf8               toString
  #352 = Methodref          #353.#354     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #353 = Class              #355          // java/lang/Integer
  #354 = NameAndType        #356:#357     // valueOf:(I)Ljava/lang/Integer;
  #355 = Utf8               java/lang/Integer
  #356 = Utf8               valueOf
  #357 = Utf8               (I)Ljava/lang/Integer;
  #358 = Methodref          #107.#359     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #359 = NameAndType        #110:#360     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #360 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #361 = Methodref          #8.#362       // ext/mods/gameserver/Shutdown.sendServerQuit:(I)V
  #362 = NameAndType        #363:#330     // sendServerQuit:(I)V
  #363 = Utf8               sendServerQuit
  #364 = Fieldref           #8.#365       // ext/mods/gameserver/Shutdown._counterInstance:Lext/mods/gameserver/Shutdown;
  #365 = NameAndType        #366:#27      // _counterInstance:Lext/mods/gameserver/Shutdown;
  #366 = Utf8               _counterInstance
  #367 = Methodref          #8.#368       // ext/mods/gameserver/Shutdown."<init>":(IZ)V
  #368 = NameAndType        #5:#369       // "<init>":(IZ)V
  #369 = Utf8               (IZ)V
  #370 = Methodref          #8.#371       // ext/mods/gameserver/Shutdown.start:()V
  #371 = NameAndType        #372:#6       // start:()V
  #372 = Utf8               start
  #373 = String             #374          // GM: {} aborted {} process.
  #374 = Utf8               GM: {} aborted {} process.
  #375 = InvokeDynamic      #1:#67        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #376 = Methodref          #377.#378     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #377 = Class              #379          // ext/mods/gameserver/model/World
  #378 = NameAndType        #380:#74      // announceToOnlinePlayers:(Ljava/lang/String;)V
  #379 = Utf8               ext/mods/gameserver/model/World
  #380 = Utf8               announceToOnlinePlayers
  #381 = Methodref          #115.#382     // ext/mods/gameserver/LoginServerThread.getServerType:()Lext/mods/commons/network/ServerType;
  #382 = NameAndType        #383:#384     // getServerType:()Lext/mods/commons/network/ServerType;
  #383 = Utf8               getServerType
  #384 = Utf8               ()Lext/mods/commons/network/ServerType;
  #385 = Fieldref           #386.#387     // ext/mods/commons/network/ServerType.DOWN:Lext/mods/commons/network/ServerType;
  #386 = Class              #388          // ext/mods/commons/network/ServerType
  #387 = NameAndType        #389:#390     // DOWN:Lext/mods/commons/network/ServerType;
  #388 = Utf8               ext/mods/commons/network/ServerType
  #389 = Utf8               DOWN
  #390 = Utf8               Lext/mods/commons/network/ServerType;
  #391 = Fieldref           #76.#392      // ext/mods/Config.SERVER_GMONLY:Z
  #392 = NameAndType        #393:#80      // SERVER_GMONLY:Z
  #393 = Utf8               SERVER_GMONLY
  #394 = Fieldref           #386.#395     // ext/mods/commons/network/ServerType.GM_ONLY:Lext/mods/commons/network/ServerType;
  #395 = NameAndType        #396:#390     // GM_ONLY:Lext/mods/commons/network/ServerType;
  #396 = Utf8               GM_ONLY
  #397 = Fieldref           #386.#398     // ext/mods/commons/network/ServerType.AUTO:Lext/mods/commons/network/ServerType;
  #398 = NameAndType        #399:#390     // AUTO:Lext/mods/commons/network/ServerType;
  #399 = Utf8               AUTO
  #400 = Methodref          #115.#401     // ext/mods/gameserver/LoginServerThread.setServerType:(Lext/mods/commons/network/ServerType;)V
  #401 = NameAndType        #402:#403     // setServerType:(Lext/mods/commons/network/ServerType;)V
  #402 = Utf8               setServerType
  #403 = Utf8               (Lext/mods/commons/network/ServerType;)V
  #404 = Long               1000l
  #406 = Methodref          #2.#407       // java/lang/Thread.sleep:(J)V
  #407 = NameAndType        #408:#409     // sleep:(J)V
  #408 = Utf8               sleep
  #409 = Utf8               (J)V
  #410 = Class              #411          // java/lang/InterruptedException
  #411 = Utf8               java/lang/InterruptedException
  #412 = Fieldref           #413.#414     // ext/mods/gameserver/network/SystemMessageId.THE_SERVER_WILL_BE_COMING_DOWN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #413 = Class              #415          // ext/mods/gameserver/network/SystemMessageId
  #414 = NameAndType        #416:#417     // THE_SERVER_WILL_BE_COMING_DOWN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #415 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #416 = Utf8               THE_SERVER_WILL_BE_COMING_DOWN_IN_S1_SECONDS
  #417 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #418 = Methodref          #419.#420     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #419 = Class              #421          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #420 = NameAndType        #422:#423     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #421 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #422 = Utf8               getSystemMessage
  #423 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #424 = Methodref          #419.#425     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #425 = NameAndType        #426:#427     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #426 = Utf8               addNumber
  #427 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #428 = Methodref          #377.#429     // ext/mods/gameserver/model/World.toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #429 = NameAndType        #430:#431     // toAllOnlinePlayers:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #430 = Utf8               toAllOnlinePlayers
  #431 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #432 = Methodref          #433.#434     // ext/mods/fakeplayer/FakePlayerManager.getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
  #433 = Class              #435          // ext/mods/fakeplayer/FakePlayerManager
  #434 = NameAndType        #57:#436      // getInstance:()Lext/mods/fakeplayer/FakePlayerManager;
  #435 = Utf8               ext/mods/fakeplayer/FakePlayerManager
  #436 = Utf8               ()Lext/mods/fakeplayer/FakePlayerManager;
  #437 = Methodref          #433.#438     // ext/mods/fakeplayer/FakePlayerManager.getFakePlayers:()Ljava/util/List;
  #438 = NameAndType        #439:#440     // getFakePlayers:()Ljava/util/List;
  #439 = Utf8               getFakePlayers
  #440 = Utf8               ()Ljava/util/List;
  #441 = InterfaceMethodref #442.#443     // java/util/List.iterator:()Ljava/util/Iterator;
  #442 = Class              #444          // java/util/List
  #443 = NameAndType        #445:#446     // iterator:()Ljava/util/Iterator;
  #444 = Utf8               java/util/List
  #445 = Utf8               iterator
  #446 = Utf8               ()Ljava/util/Iterator;
  #447 = InterfaceMethodref #448.#449     // java/util/Iterator.hasNext:()Z
  #448 = Class              #450          // java/util/Iterator
  #449 = NameAndType        #451:#130     // hasNext:()Z
  #450 = Utf8               java/util/Iterator
  #451 = Utf8               hasNext
  #452 = InterfaceMethodref #448.#453     // java/util/Iterator.next:()Ljava/lang/Object;
  #453 = NameAndType        #454:#455     // next:()Ljava/lang/Object;
  #454 = Utf8               next
  #455 = Utf8               ()Ljava/lang/Object;
  #456 = Class              #457          // ext/mods/fakeplayer/FakePlayer
  #457 = Utf8               ext/mods/fakeplayer/FakePlayer
  #458 = Methodref          #456.#459     // ext/mods/fakeplayer/FakePlayer.despawnPlayer:()V
  #459 = NameAndType        #460:#6       // despawnPlayer:()V
  #460 = Utf8               despawnPlayer
  #461 = Methodref          #377.#462     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #462 = NameAndType        #57:#463      // getInstance:()Lext/mods/gameserver/model/World;
  #463 = Utf8               ()Lext/mods/gameserver/model/World;
  #464 = Methodref          #377.#465     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #465 = NameAndType        #466:#467     // getPlayers:()Ljava/util/Collection;
  #466 = Utf8               getPlayers
  #467 = Utf8               ()Ljava/util/Collection;
  #468 = InterfaceMethodref #469.#443     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #469 = Class              #470          // java/util/Collection
  #470 = Utf8               java/util/Collection
  #471 = Methodref          #348.#472     // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #472 = NameAndType        #473:#474     // getClient:()Lext/mods/gameserver/network/GameClient;
  #473 = Utf8               getClient
  #474 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #475 = Methodref          #476.#477     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #476 = Class              #478          // ext/mods/gameserver/network/GameClient
  #477 = NameAndType        #479:#130     // isDetached:()Z
  #478 = Utf8               ext/mods/gameserver/network/GameClient
  #479 = Utf8               isDetached
  #480 = Fieldref           #481.#482     // ext/mods/gameserver/network/serverpackets/ServerClose.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ServerClose;
  #481 = Class              #483          // ext/mods/gameserver/network/serverpackets/ServerClose
  #482 = NameAndType        #484:#485     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ServerClose;
  #483 = Utf8               ext/mods/gameserver/network/serverpackets/ServerClose
  #484 = Utf8               STATIC_PACKET
  #485 = Utf8               Lext/mods/gameserver/network/serverpackets/ServerClose;
  #486 = Methodref          #476.#487     // ext/mods/gameserver/network/GameClient.close:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #487 = NameAndType        #488:#431     // close:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #488 = Utf8               close
  #489 = Methodref          #476.#490     // ext/mods/gameserver/network/GameClient.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #490 = NameAndType        #491:#492     // setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #491 = Utf8               setPlayer
  #492 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #493 = Methodref          #348.#494     // ext/mods/gameserver/model/actor/Player.setClient:(Lext/mods/gameserver/network/GameClient;)V
  #494 = NameAndType        #495:#496     // setClient:(Lext/mods/gameserver/network/GameClient;)V
  #495 = Utf8               setClient
  #496 = Utf8               (Lext/mods/gameserver/network/GameClient;)V
  #497 = Methodref          #348.#498     // ext/mods/gameserver/model/actor/Player.deleteMe:()V
  #498 = NameAndType        #499:#6       // deleteMe:()V
  #499 = Utf8               deleteMe
  #500 = Class              #501          // java/io/File
  #501 = Utf8               java/io/File
  #502 = String             #503          // ../sound/Shutdown.wav
  #503 = Utf8               ../sound/Shutdown.wav
  #504 = Methodref          #500.#505     // java/io/File."<init>":(Ljava/lang/String;)V
  #505 = NameAndType        #5:#74        // "<init>":(Ljava/lang/String;)V
  #506 = Methodref          #500.#507     // java/io/File.exists:()Z
  #507 = NameAndType        #508:#130     // exists:()Z
  #508 = Utf8               exists
  #509 = Fieldref           #31.#510      // java/lang/System.err:Ljava/io/PrintStream;
  #510 = NameAndType        #511:#512     // err:Ljava/io/PrintStream;
  #511 = Utf8               err
  #512 = Utf8               Ljava/io/PrintStream;
  #513 = Methodref          #500.#514     // java/io/File.getAbsolutePath:()Ljava/lang/String;
  #514 = NameAndType        #515:#41      // getAbsolutePath:()Ljava/lang/String;
  #515 = Utf8               getAbsolutePath
  #516 = InvokeDynamic      #2:#67        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #517 = Methodref          #518.#519     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #518 = Class              #520          // java/io/PrintStream
  #519 = NameAndType        #521:#74      // println:(Ljava/lang/String;)V
  #520 = Utf8               java/io/PrintStream
  #521 = Utf8               println
  #522 = Methodref          #523.#524     // javax/sound/sampled/AudioSystem.getAudioInputStream:(Ljava/io/File;)Ljavax/sound/sampled/AudioInputStream;
  #523 = Class              #525          // javax/sound/sampled/AudioSystem
  #524 = NameAndType        #526:#527     // getAudioInputStream:(Ljava/io/File;)Ljavax/sound/sampled/AudioInputStream;
  #525 = Utf8               javax/sound/sampled/AudioSystem
  #526 = Utf8               getAudioInputStream
  #527 = Utf8               (Ljava/io/File;)Ljavax/sound/sampled/AudioInputStream;
  #528 = Methodref          #523.#529     // javax/sound/sampled/AudioSystem.getClip:()Ljavax/sound/sampled/Clip;
  #529 = NameAndType        #530:#531     // getClip:()Ljavax/sound/sampled/Clip;
  #530 = Utf8               getClip
  #531 = Utf8               ()Ljavax/sound/sampled/Clip;
  #532 = InterfaceMethodref #533.#534     // javax/sound/sampled/Clip.open:(Ljavax/sound/sampled/AudioInputStream;)V
  #533 = Class              #535          // javax/sound/sampled/Clip
  #534 = NameAndType        #536:#537     // open:(Ljavax/sound/sampled/AudioInputStream;)V
  #535 = Utf8               javax/sound/sampled/Clip
  #536 = Utf8               open
  #537 = Utf8               (Ljavax/sound/sampled/AudioInputStream;)V
  #538 = InterfaceMethodref #533.#371     // javax/sound/sampled/Clip.start:()V
  #539 = Methodref          #112.#540     // java/lang/Exception.printStackTrace:()V
  #540 = NameAndType        #541:#6       // printStackTrace:()V
  #541 = Utf8               printStackTrace
  #542 = Methodref          #543.#544     // java/lang/Class.getName:()Ljava/lang/String;
  #543 = Class              #545          // java/lang/Class
  #544 = NameAndType        #546:#41      // getName:()Ljava/lang/String;
  #545 = Utf8               java/lang/Class
  #546 = Utf8               getName
  #547 = Methodref          #107.#505     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #548 = String             #549          // SIGTERM
  #549 = Utf8               SIGTERM
  #550 = String             #551          // shutting down
  #551 = Utf8               shutting down
  #552 = String             #553          // restarting
  #553 = Utf8               restarting
  #554 = String             #555          // aborting
  #555 = Utf8               aborting
  #556 = Utf8               ConstantValue
  #557 = Integer            0
  #558 = Utf8               GM_SHUTDOWN
  #559 = Integer            1
  #560 = Utf8               GM_RESTART
  #561 = Integer            2
  #562 = Utf8               ABORT
  #563 = Integer            3
  #564 = Utf8               Code
  #565 = Utf8               LineNumberTable
  #566 = Utf8               LocalVariableTable
  #567 = Utf8               this
  #568 = Utf8               seconds
  #569 = Utf8               restart
  #570 = Utf8               StackMapTable
  #571 = Utf8               os
  #572 = Utf8               Ljava/lang/String;
  #573 = Utf8               startShutdown
  #574 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)V
  #575 = Utf8               player
  #576 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #577 = Utf8               abort
  #578 = Utf8               mode
  #579 = Utf8               fake
  #580 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #581 = Utf8               client
  #582 = Utf8               Lext/mods/gameserver/network/GameClient;
  #583 = Utf8               soundFile
  #584 = Utf8               Ljava/io/File;
  #585 = Utf8               audioStream
  #586 = Utf8               Ljavax/sound/sampled/AudioInputStream;
  #587 = Utf8               clip
  #588 = Utf8               Ljavax/sound/sampled/Clip;
  #589 = Utf8               e
  #590 = Utf8               Ljava/lang/Exception;
  #591 = Utf8               ()Lext/mods/gameserver/Shutdown;
  #592 = Utf8               <clinit>
  #593 = Utf8               SourceFile
  #594 = Utf8               Shutdown.java
  #595 = Utf8               NestMembers
  #596 = Utf8               BootstrapMethods
  #597 = String             #598          // Under \u0001 process
  #598 = Utf8               Under \u0001 process
  #599 = String             #600          // Server aborted \u0001 process and continues normal operation.
  #600 = Utf8               Server aborted \u0001 process and continues normal operation.
  #601 = String             #602          // ? Arquivo de som não encontrado: \u0001
  #602 = Utf8               ? Arquivo de som não encontrado: \u0001
  #603 = MethodHandle       6:#604        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #604 = Methodref          #605.#606     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #605 = Class              #607          // java/lang/invoke/StringConcatFactory
  #606 = NameAndType        #68:#608      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #607 = Utf8               java/lang/invoke/StringConcatFactory
  #608 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #609 = Utf8               InnerClasses
  #610 = Utf8               SingletonHolder
  #611 = Class              #612          // java/lang/invoke/MethodHandles$Lookup
  #612 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #613 = Class              #614          // java/lang/invoke/MethodHandles
  #614 = Utf8               java/lang/invoke/MethodHandles
  #615 = Utf8               Lookup
{
  public static final int SIGTERM;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int GM_SHUTDOWN;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int GM_RESTART;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int ABORT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  protected ext.mods.gameserver.Shutdown();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Thread."<init>":()V
         4: aload_0
         5: iconst_m1
         6: putfield      #7                  // Field _secondsShut:I
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field _shutdownMode:I
        14: return
      LineNumberTable:
        line 87: 0
        line 88: 4
        line 89: 9
        line 90: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/Shutdown;

  public ext.mods.gameserver.Shutdown(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Thread."<init>":()V
         4: aload_0
         5: iconst_0
         6: iload_1
         7: invokestatic  #16                 // Method java/lang/Math.max:(II)I
        10: putfield      #7                  // Field _secondsShut:I
        13: aload_0
        14: iload_2
        15: ifeq          22
        18: iconst_2
        19: goto          23
        22: iconst_1
        23: putfield      #13                 // Field _shutdownMode:I
        26: return
      LineNumberTable:
        line 93: 0
        line 94: 4
        line 95: 13
        line 96: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/Shutdown;
            0      27     1 seconds   I
            0      27     2 restart   Z
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/Shutdown, int, int ]
          stack = [ class ext/mods/gameserver/Shutdown ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/Shutdown, int, int ]
          stack = [ class ext/mods/gameserver/Shutdown, int ]

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
         4: if_acmpne     461
         7: ldc           #28                 // String os.name
         9: invokestatic  #30                 // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        12: invokevirtual #36                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        15: astore_1
        16: aload_1
        17: ldc           #42                 // String win
        19: invokevirtual #44                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        22: ifne          34
        25: aload_1
        26: ldc           #48                 // String mac
        28: invokevirtual #44                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        31: ifeq          38
        34: aload_0
        35: invokevirtual #50                 // Method playServerLoadedSound:()V
        38: invokestatic  #53                 // Method ext/mods/extensions/listener/manager/GameListenerManager.getInstance:()Lext/mods/extensions/listener/manager/GameListenerManager;
        41: invokevirtual #59                 // Method ext/mods/extensions/listener/manager/GameListenerManager.notifyShutdown:()V
        44: getstatic     #62                 // Field MODE_TEXT:[Ljava/lang/String;
        47: aload_0
        48: getfield      #13                 // Field _shutdownMode:I
        51: aaload
        52: invokedynamic #66,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        57: invokestatic  #69                 // Method ext/mods/commons/lang/StringUtil.printSection:(Ljava/lang/String;)V
        60: getstatic     #75                 // Field ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
        63: ifne          72
        66: getstatic     #81                 // Field ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
        69: ifeq          84
        72: getstatic     #84                 // Field ext/mods/Config.RESTORE_OFFLINERS:Z
        75: ifeq          84
        78: invokestatic  #87                 // Method ext/mods/gameserver/data/sql/OfflineTradersTable.getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
        81: invokevirtual #92                 // Method ext/mods/gameserver/data/sql/OfflineTradersTable.store:()V
        84: goto          88
        87: astore_2
        88: invokestatic  #97                 // Method disconnectAllPlayers:()V
        91: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        94: ldc           #104                // String Players have been disconnected.
        96: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        99: goto          103
       102: astore_2
       103: invokestatic  #114                // Method ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
       106: invokevirtual #119                // Method ext/mods/gameserver/LoginServerThread.interrupt:()V
       109: goto          113
       112: astore_2
       113: invokestatic  #122                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       116: invokevirtual #127                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       119: ifne          137
       122: invokestatic  #131                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       125: iconst_0
       126: invokevirtual #136                // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.saveFestivalData:(Z)V
       129: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       132: ldc           #140                // String FestivalOfDarknessManager has been saved.
       134: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       137: invokestatic  #122                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       140: invokevirtual #142                // Method ext/mods/gameserver/data/manager/SevenSignsManager.saveSevenSignsData:()V
       143: invokestatic  #122                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       146: invokevirtual #145                // Method ext/mods/gameserver/data/manager/SevenSignsManager.saveSevenSignsStatus:()V
       149: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       152: ldc           #148                // String SevenSignsManager has been saved.
       154: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       157: invokestatic  #150                // Method ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
       160: invokevirtual #155                // Method ext/mods/gameserver/data/xml/ScriptData.stopAllScripts:()V
       163: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       166: ldc           #158                // String Running scripts have been stopped.
       168: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       171: invokestatic  #160                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       174: invokevirtual #165                // Method ext/mods/gameserver/data/manager/ZoneManager.save:()V
       177: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       180: ldc           #168                // String ZoneManager has been saved.
       182: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       185: invokestatic  #170                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       188: invokevirtual #175                // Method ext/mods/gameserver/data/manager/SpawnManager.save:()V
       191: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       194: ldc           #176                // String SpawnManager has been saved.
       196: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       199: getstatic     #178                // Field ext/mods/Config.OLY_ENABLED:Z
       202: ifeq          219
       205: invokestatic  #181                // Method ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
       208: invokevirtual #186                // Method ext/mods/gameserver/model/olympiad/Olympiad.saveOlympiadStatus:()V
       211: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       214: ldc           #189                // String Olympiad has been saved.
       216: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       219: invokestatic  #191                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       222: invokevirtual #196                // Method ext/mods/gameserver/data/manager/HeroManager.shutdown:()V
       225: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       228: ldc           #199                // String HeroManager has been saved.
       230: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       233: invokestatic  #201                // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
       236: invokevirtual #206                // Method ext/mods/gameserver/data/manager/CastleManorManager.storeMe:()Z
       239: pop
       240: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       243: ldc           #209                // String CastleManorManager has been saved.
       245: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       248: invokestatic  #211                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
       251: invokevirtual #216                // Method ext/mods/gameserver/data/manager/FishingChampionshipManager.shutdown:()V
       254: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       257: ldc           #217                // String FishingChampionshipManager has been saved.
       259: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       262: invokestatic  #219                // Method ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
       265: invokevirtual #224                // Method ext/mods/gameserver/data/manager/BufferManager.saveSchemes:()V
       268: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       271: ldc           #227                // String BufferManager has been saved.
       273: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       276: invokestatic  #229                // Method ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
       279: invokevirtual #234                // Method ext/mods/gameserver/data/manager/PetitionManager.store:()V
       282: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       285: ldc           #235                // String PetitionManager has been saved.
       287: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       290: invokestatic  #237                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       293: invokevirtual #242                // Method ext/mods/gameserver/data/manager/ClanHallManager.save:()V
       296: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       299: ldc           #243                // String ClanHallManager has been saved.
       301: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       304: invokestatic  #245                // Method ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
       307: invokevirtual #250                // Method ext/mods/gameserver/data/manager/RelationManager.save:()V
       310: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       313: ldc           #251                // String RelationManager has been saved.
       315: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       318: invokestatic  #253                // Method ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
       321: invokevirtual #258                // Method ext/mods/gameserver/data/manager/CoupleManager.save:()V
       324: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       327: ldc_w         #259                // String CoupleManager has been saved.
       330: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       333: invokestatic  #261                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
       336: invokevirtual #266                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.save:()V
       339: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       342: ldc_w         #267                // String ItemInstanceTaskManager has been saved.
       345: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       348: invokestatic  #269                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
       351: invokevirtual #274                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.save:()V
       354: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       357: ldc_w         #275                // String ItemsOnGroundTaskManager has been saved.
       360: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       363: invokestatic  #277                // Method ext/mods/gameserver/data/sql/ServerMemoTable.getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
       366: ldc_w         #282                // String server_crash
       369: iconst_0
       370: invokevirtual #284                // Method ext/mods/gameserver/data/sql/ServerMemoTable.set:(Ljava/lang/String;Z)V
       373: invokestatic  #288                // Method ext/mods/gameserver/GameServer.getInstance:()Lext/mods/gameserver/GameServer;
       376: invokevirtual #293                // Method ext/mods/gameserver/GameServer.getSelectorThread:()Lext/mods/commons/mmocore/SelectorThread;
       379: invokevirtual #297                // Method ext/mods/commons/mmocore/SelectorThread.shutdown:()V
       382: goto          386
       385: astore_2
       386: invokestatic  #300                // Method ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
       389: invokevirtual #305                // Method ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.shutdown:()V
       392: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       395: ldc_w         #306                // String PathfinderCache has been shut down.
       398: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       401: goto          405
       404: astore_2
       405: invokestatic  #308                // Method ext/mods/commons/pool/ThreadPool.shutdown:()V
       408: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       411: ldc_w         #311                // String ThreadPool has been shut down.
       414: invokevirtual #106                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       417: invokestatic  #313                // Method ext/mods/commons/pool/ConnectionPool.shutdown:()V
       420: goto          424
       423: astore_2
       424: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
       427: getfield      #13                 // Field _shutdownMode:I
       430: iconst_1
       431: if_icmpne     437
       434: invokestatic  #316                // Method ext/mods/commons/util/JvmOptimizer.setNormalShutdown:()V
       437: invokestatic  #321                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
       440: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
       443: getfield      #13                 // Field _shutdownMode:I
       446: iconst_2
       447: if_icmpne     454
       450: iconst_2
       451: goto          455
       454: iconst_0
       455: invokevirtual #327                // Method java/lang/Runtime.halt:(I)V
       458: goto          536
       461: aload_0
       462: invokevirtual #331                // Method countdown:()V
       465: aload_0
       466: getfield      #13                 // Field _shutdownMode:I
       469: lookupswitch  { // 2

                       1: 496

                       2: 519
                 default: 536
            }
       496: invokestatic  #316                // Method ext/mods/commons/util/JvmOptimizer.setNormalShutdown:()V
       499: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
       502: iconst_1
       503: invokevirtual #334                // Method setMode:(I)V
       506: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
       509: invokevirtual #337                // Method run:()V
       512: iconst_0
       513: invokestatic  #340                // Method java/lang/System.exit:(I)V
       516: goto          536
       519: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
       522: iconst_2
       523: invokevirtual #334                // Method setMode:(I)V
       526: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
       529: invokevirtual #337                // Method run:()V
       532: iconst_2
       533: invokestatic  #340                // Method java/lang/System.exit:(I)V
       536: return
      Exception table:
         from    to  target type
            60    84    87   Class java/lang/Throwable
            88    99   102   Class java/lang/Exception
           103   109   112   Class java/lang/Exception
           373   382   385   Class java/lang/Exception
           386   401   404   Class java/lang/Exception
           417   420   423   Class java/lang/Exception
      LineNumberTable:
        line 108: 0
        line 110: 7
        line 111: 16
        line 112: 34
        line 114: 38
        line 115: 44
        line 119: 60
        line 120: 78
        line 124: 84
        line 122: 87
        line 128: 88
        line 129: 91
        line 133: 99
        line 131: 102
        line 137: 103
        line 141: 109
        line 139: 112
        line 143: 113
        line 145: 122
        line 146: 129
        line 149: 137
        line 150: 143
        line 151: 149
        line 153: 157
        line 154: 163
        line 156: 171
        line 157: 177
        line 159: 185
        line 160: 191
        line 162: 199
        line 164: 205
        line 165: 211
        line 168: 219
        line 169: 225
        line 171: 233
        line 172: 240
        line 174: 248
        line 175: 254
        line 177: 262
        line 178: 268
        line 180: 276
        line 181: 282
        line 183: 290
        line 184: 296
        line 186: 304
        line 187: 310
        line 189: 318
        line 190: 324
        line 192: 333
        line 193: 339
        line 195: 348
        line 196: 354
        line 198: 363
        line 202: 373
        line 206: 382
        line 204: 385
        line 210: 386
        line 211: 392
        line 215: 401
        line 213: 404
        line 217: 405
        line 218: 408
        line 222: 417
        line 226: 420
        line 224: 423
        line 228: 424
        line 230: 434
        line 233: 437
        line 234: 458
        line 237: 461
        line 239: 465
        line 242: 496
        line 243: 499
        line 244: 506
        line 245: 512
        line 246: 516
        line 249: 519
        line 250: 526
        line 251: 532
        line 255: 536
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16     442     1    os   Ljava/lang/String;
            0     537     0  this   Lext/mods/gameserver/Shutdown;
      StackMapTable: number_of_entries = 25
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/lang/String ]
        frame_type = 3 /* same */
        frame_type = 33 /* same */
        frame_type = 11 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 23 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 165
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 12 /* same */
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class java/lang/Runtime ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/Shutdown, class java/lang/String ]
          stack = [ class java/lang/Runtime, int ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 34 /* same */
        frame_type = 22 /* same */
        frame_type = 16 /* same */

  public void startShutdown(ext.mods.gameserver.model.actor.Player, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=4
         0: aload_0
         1: iload_3
         2: ifeq          9
         5: iconst_2
         6: goto          10
         9: iconst_1
        10: putfield      #13                 // Field _shutdownMode:I
        13: aload_1
        14: ifnull        55
        17: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        20: ldc_w         #343                // String GM: {} issued {} process in {} seconds.
        23: iconst_3
        24: anewarray     #345                // class java/lang/Object
        27: dup
        28: iconst_0
        29: aload_1
        30: invokevirtual #347                // Method ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
        33: aastore
        34: dup
        35: iconst_1
        36: getstatic     #62                 // Field MODE_TEXT:[Ljava/lang/String;
        39: aload_0
        40: getfield      #13                 // Field _shutdownMode:I
        43: aaload
        44: aastore
        45: dup
        46: iconst_2
        47: iload_2
        48: invokestatic  #352                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        51: aastore
        52: invokevirtual #358                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        55: aload_0
        56: getfield      #13                 // Field _shutdownMode:I
        59: ifle          207
        62: iload_2
        63: lookupswitch  { // 16

                       1: 200

                       2: 200

                       3: 200

                       4: 200

                       5: 200

                      10: 200

                      30: 200

                      60: 200

                     120: 200

                     180: 200

                     240: 200

                     300: 200

                     360: 200

                     420: 200

                     480: 200

                     540: 200
                 default: 203
            }
       200: goto          207
       203: iload_2
       204: invokestatic  #361                // Method sendServerQuit:(I)V
       207: getstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
       210: ifnull        220
       213: getstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
       216: iconst_3
       217: invokevirtual #334                // Method setMode:(I)V
       220: new           #8                  // class ext/mods/gameserver/Shutdown
       223: dup
       224: iload_2
       225: iload_3
       226: invokespecial #367                // Method "<init>":(IZ)V
       229: putstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
       232: getstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
       235: invokevirtual #370                // Method start:()V
       238: return
      LineNumberTable:
        line 265: 0
        line 267: 13
        line 268: 17
        line 270: 55
        line 272: 62
        line 275: 200
        line 278: 203
        line 282: 207
        line 283: 213
        line 285: 220
        line 286: 232
        line 287: 238
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     239     0  this   Lext/mods/gameserver/Shutdown;
            0     239     1 player   Lext/mods/gameserver/model/actor/Player;
            0     239     2 seconds   I
            0     239     3 restart   Z
      StackMapTable: number_of_entries = 7
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/Shutdown ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/Shutdown, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = [ class ext/mods/gameserver/Shutdown, int ]
        frame_type = 44 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 144
        frame_type = 2 /* same */
        frame_type = 3 /* same */
        frame_type = 12 /* same */

  public void abort(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: getstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
         3: ifnull        60
         6: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc_w         #373                // String GM: {} aborted {} process.
        12: iconst_2
        13: anewarray     #345                // class java/lang/Object
        16: dup
        17: iconst_0
        18: aload_1
        19: invokevirtual #347                // Method ext/mods/gameserver/model/actor/Player.toString:()Ljava/lang/String;
        22: aastore
        23: dup
        24: iconst_1
        25: getstatic     #62                 // Field MODE_TEXT:[Ljava/lang/String;
        28: aload_0
        29: getfield      #13                 // Field _shutdownMode:I
        32: aaload
        33: aastore
        34: invokevirtual #358                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        37: getstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
        40: iconst_3
        41: invokevirtual #334                // Method setMode:(I)V
        44: getstatic     #62                 // Field MODE_TEXT:[Ljava/lang/String;
        47: aload_0
        48: getfield      #13                 // Field _shutdownMode:I
        51: aaload
        52: invokedynamic #375,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        57: invokestatic  #376                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        60: return
      LineNumberTable:
        line 295: 0
        line 297: 6
        line 298: 37
        line 300: 44
        line 302: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/Shutdown;
            0      61     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 60 /* same */

  public void playServerLoadedSound();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=1
         0: new           #500                // class java/io/File
         3: dup
         4: ldc_w         #502                // String ../sound/Shutdown.wav
         7: invokespecial #504                // Method java/io/File."<init>":(Ljava/lang/String;)V
        10: astore_1
        11: aload_1
        12: invokevirtual #506                // Method java/io/File.exists:()Z
        15: ifne          34
        18: getstatic     #509                // Field java/lang/System.err:Ljava/io/PrintStream;
        21: aload_1
        22: invokevirtual #513                // Method java/io/File.getAbsolutePath:()Ljava/lang/String;
        25: invokedynamic #516,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        30: invokevirtual #517                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        33: return
        34: aload_1
        35: invokestatic  #522                // Method javax/sound/sampled/AudioSystem.getAudioInputStream:(Ljava/io/File;)Ljavax/sound/sampled/AudioInputStream;
        38: astore_2
        39: invokestatic  #528                // Method javax/sound/sampled/AudioSystem.getClip:()Ljavax/sound/sampled/Clip;
        42: astore_3
        43: aload_3
        44: aload_2
        45: invokeinterface #532,  2          // InterfaceMethod javax/sound/sampled/Clip.open:(Ljavax/sound/sampled/AudioInputStream;)V
        50: aload_3
        51: invokeinterface #538,  1          // InterfaceMethod javax/sound/sampled/Clip.start:()V
        56: goto          64
        59: astore_1
        60: aload_1
        61: invokevirtual #539                // Method java/lang/Exception.printStackTrace:()V
        64: return
      Exception table:
         from    to  target type
             0    33    59   Class java/lang/Exception
            34    56    59   Class java/lang/Exception
      LineNumberTable:
        line 383: 0
        line 384: 11
        line 386: 18
        line 387: 33
        line 390: 34
        line 392: 39
        line 393: 43
        line 394: 50
        line 400: 56
        line 397: 59
        line 399: 60
        line 401: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11      45     1 soundFile   Ljava/io/File;
           39      17     2 audioStream   Ljavax/sound/sampled/AudioInputStream;
           43      13     3  clip   Ljavax/sound/sampled/Clip;
           60       4     1     e   Ljava/lang/Exception;
            0      65     0  this   Lext/mods/gameserver/Shutdown;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class java/io/File ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/Shutdown ]
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */

  public static ext.mods.gameserver.Shutdown getInstance();
    descriptor: ()Lext/mods/gameserver/Shutdown;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #22                 // Field ext/mods/gameserver/Shutdown$SingletonHolder.INSTANCE:Lext/mods/gameserver/Shutdown;
         3: areturn
      LineNumberTable:
        line 405: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #107                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/Shutdown
         6: invokevirtual #542                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #547                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: aconst_null
        16: putstatic     #364                // Field _counterInstance:Lext/mods/gameserver/Shutdown;
        19: iconst_4
        20: anewarray     #37                 // class java/lang/String
        23: dup
        24: iconst_0
        25: ldc_w         #548                // String SIGTERM
        28: aastore
        29: dup
        30: iconst_1
        31: ldc_w         #550                // String shutting down
        34: aastore
        35: dup
        36: iconst_2
        37: ldc_w         #552                // String restarting
        40: aastore
        41: dup
        42: iconst_3
        43: ldc_w         #554                // String aborting
        46: aastore
        47: putstatic     #62                 // Field MODE_TEXT:[Ljava/lang/String;
        50: return
      LineNumberTable:
        line 67: 0
        line 69: 15
        line 78: 19
}
SourceFile: "Shutdown.java"
NestMembers:
  ext/mods/gameserver/Shutdown$SingletonHolder
BootstrapMethods:
  0: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #597 Under \u0001 process
  1: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #599 Server aborted \u0001 process and continues normal operation.
  2: #603 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #601 ? Arquivo de som não encontrado: \u0001
InnerClasses:
  public static final #615= #611 of #613; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
