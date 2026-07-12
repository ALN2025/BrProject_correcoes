// Bytecode for: ext.mods.gameserver.GameServer
// File: ext\mods\gameserver\GameServer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/GameServer.class
  Last modified 9 de jul de 2026; size 33542 bytes
  MD5 checksum 416e7fd0e07614629e33b4ee3936d1f4
  Compiled from "GameServer.kt"
public final class ext.mods.gameserver.GameServer implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/GameServer
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 15, methods: 57, attributes: 6
Constant pool:
     #1 = Utf8               ext/mods/gameserver/GameServer
     #2 = Class              #1           // ext/mods/gameserver/GameServer
     #3 = Utf8               java/lang/Object
     #4 = Class              #3           // java/lang/Object
     #5 = Utf8               java/lang/Runnable
     #6 = Class              #5           // java/lang/Runnable
     #7 = Utf8               getSelectorThread
     #8 = Utf8               ()Lext/mods/commons/mmocore/SelectorThread;
     #9 = Utf8               ()Lext/mods/commons/mmocore/SelectorThread<Lext/mods/gameserver/network/GameClient;>;
    #10 = Utf8               Lorg/jetbrains/annotations/Nullable;
    #11 = Utf8               selectorThread
    #12 = Utf8               Lext/mods/commons/mmocore/SelectorThread;
    #13 = NameAndType        #11:#12      // selectorThread:Lext/mods/commons/mmocore/SelectorThread;
    #14 = Fieldref           #2.#13       // ext/mods/gameserver/GameServer.selectorThread:Lext/mods/commons/mmocore/SelectorThread;
    #15 = Utf8               this
    #16 = Utf8               Lext/mods/gameserver/GameServer;
    #17 = Utf8               getServerLoadStart
    #18 = Utf8               ()J
    #19 = Utf8               serverLoadStart
    #20 = Utf8               J
    #21 = NameAndType        #19:#20      // serverLoadStart:J
    #22 = Fieldref           #2.#21       // ext/mods/gameserver/GameServer.serverLoadStart:J
    #23 = Utf8               setServerLoadStart
    #24 = Utf8               (J)V
    #25 = Utf8               <set-?>
    #26 = Utf8               getServerStartTimeMillis
    #27 = Utf8               serverStartTimeMillis
    #28 = NameAndType        #27:#20      // serverStartTimeMillis:J
    #29 = Fieldref           #2.#28       // ext/mods/gameserver/GameServer.serverStartTimeMillis:J
    #30 = Utf8               getServerStartTime
    #31 = Utf8               <init>
    #32 = Utf8               ()V
    #33 = Utf8               java/lang/String
    #34 = Class              #33          // java/lang/String
    #35 = Utf8               ([Ljava/lang/String;)V
    #36 = NameAndType        #31:#35      // "<init>":([Ljava/lang/String;)V
    #37 = Methodref          #2.#36       // ext/mods/gameserver/GameServer."<init>":([Ljava/lang/String;)V
    #38 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #39 = NameAndType        #31:#32      // "<init>":()V
    #40 = Methodref          #4.#39       // java/lang/Object."<init>":()V
    #41 = Utf8               java/util/concurrent/CountDownLatch
    #42 = Class              #41          // java/util/concurrent/CountDownLatch
    #43 = Utf8               (I)V
    #44 = NameAndType        #31:#43      // "<init>":(I)V
    #45 = Methodref          #42.#44      // java/util/concurrent/CountDownLatch."<init>":(I)V
    #46 = Utf8               doorsCastlesTasksLatch
    #47 = Utf8               Ljava/util/concurrent/CountDownLatch;
    #48 = NameAndType        #46:#47      // doorsCastlesTasksLatch:Ljava/util/concurrent/CountDownLatch;
    #49 = Fieldref           #2.#48       // ext/mods/gameserver/GameServer.doorsCastlesTasksLatch:Ljava/util/concurrent/CountDownLatch;
    #50 = Utf8               java/util/concurrent/atomic/AtomicBoolean
    #51 = Class              #50          // java/util/concurrent/atomic/AtomicBoolean
    #52 = Utf8               (Z)V
    #53 = NameAndType        #31:#52      // "<init>":(Z)V
    #54 = Methodref          #51.#53      // java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
    #55 = Utf8               doorsCastlesTasksReady
    #56 = Utf8               Ljava/util/concurrent/atomic/AtomicBoolean;
    #57 = NameAndType        #55:#56      // doorsCastlesTasksReady:Ljava/util/concurrent/atomic/AtomicBoolean;
    #58 = Fieldref           #2.#57       // ext/mods/gameserver/GameServer.doorsCastlesTasksReady:Ljava/util/concurrent/atomic/AtomicBoolean;
    #59 = Utf8               npcsSpawnsLatch
    #60 = NameAndType        #59:#47      // npcsSpawnsLatch:Ljava/util/concurrent/CountDownLatch;
    #61 = Fieldref           #2.#60       // ext/mods/gameserver/GameServer.npcsSpawnsLatch:Ljava/util/concurrent/CountDownLatch;
    #62 = Utf8               npcsAndSpawnsReady
    #63 = NameAndType        #62:#56      // npcsAndSpawnsReady:Ljava/util/concurrent/atomic/AtomicBoolean;
    #64 = Fieldref           #2.#63       // ext/mods/gameserver/GameServer.npcsAndSpawnsReady:Ljava/util/concurrent/atomic/AtomicBoolean;
    #65 = Utf8               java/lang/System
    #66 = Class              #65          // java/lang/System
    #67 = Utf8               currentTimeMillis
    #68 = NameAndType        #67:#18      // currentTimeMillis:()J
    #69 = Methodref          #66.#68      // java/lang/System.currentTimeMillis:()J
    #70 = Utf8               ext.mods.commons.data.xml.IXmlReader
    #71 = String             #70          // ext.mods.commons.data.xml.IXmlReader
    #72 = Utf8               ext.mods.commons.lang.StringUtil
    #73 = String             #72          // ext.mods.commons.lang.StringUtil
    #74 = Utf8               ext.mods.gameserver.data.manager.SevenSignsManager
    #75 = String             #74          // ext.mods.gameserver.data.manager.SevenSignsManager
    #76 = Utf8               ext.mods.gameserver.data.manager.FestivalOfDarknessManager
    #77 = String             #76          // ext.mods.gameserver.data.manager.FestivalOfDarknessManager
    #78 = Utf8               kotlin/collections/CollectionsKt
    #79 = Class              #78          // kotlin/collections/CollectionsKt
    #80 = Utf8               listOf
    #81 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
    #82 = NameAndType        #80:#81      // listOf:([Ljava/lang/Object;)Ljava/util/List;
    #83 = Methodref          #79.#82      // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
    #84 = Utf8               DOORS_CASTLES_LOGGER_NAMES
    #85 = Utf8               Ljava/util/List;
    #86 = NameAndType        #84:#85      // DOORS_CASTLES_LOGGER_NAMES:Ljava/util/List;
    #87 = Fieldref           #2.#86       // ext/mods/gameserver/GameServer.DOORS_CASTLES_LOGGER_NAMES:Ljava/util/List;
    #88 = Utf8               java/util/LinkedHashMap
    #89 = Class              #88          // java/util/LinkedHashMap
    #90 = Methodref          #89.#39      // java/util/LinkedHashMap."<init>":()V
    #91 = Utf8               java/util/Map
    #92 = Class              #91          // java/util/Map
    #93 = Utf8               _suppressedDoorsLoggerLevels
    #94 = Utf8               Ljava/util/Map;
    #95 = NameAndType        #93:#94      // _suppressedDoorsLoggerLevels:Ljava/util/Map;
    #96 = Fieldref           #2.#95       // ext/mods/gameserver/GameServer._suppressedDoorsLoggerLevels:Ljava/util/Map;
    #97 = Utf8               NPC_SPAWN_LOGGER_NAMES
    #98 = NameAndType        #97:#85      // NPC_SPAWN_LOGGER_NAMES:Ljava/util/List;
    #99 = Fieldref           #2.#98       // ext/mods/gameserver/GameServer.NPC_SPAWN_LOGGER_NAMES:Ljava/util/List;
   #100 = Utf8               _suppressedLoggerLevels
   #101 = NameAndType        #100:#94     // _suppressedLoggerLevels:Ljava/util/Map;
   #102 = Fieldref           #2.#101      // ext/mods/gameserver/GameServer._suppressedLoggerLevels:Ljava/util/Map;
   #103 = Utf8               instance
   #104 = NameAndType        #103:#16     // instance:Lext/mods/gameserver/GameServer;
   #105 = Fieldref           #2.#104      // ext/mods/gameserver/GameServer.instance:Lext/mods/gameserver/GameServer;
   #106 = Utf8               setupEnvironment
   #107 = NameAndType        #106:#35     // setupEnvironment:([Ljava/lang/String;)V
   #108 = Methodref          #2.#107      // ext/mods/gameserver/GameServer.setupEnvironment:([Ljava/lang/String;)V
   #109 = Utf8               ext/mods/gameserver/GameServer$1
   #110 = Class              #109         // ext/mods/gameserver/GameServer$1
   #111 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #112 = NameAndType        #31:#111     // "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #113 = Methodref          #110.#112    // ext/mods/gameserver/GameServer$1."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #114 = Utf8               kotlin/jvm/functions/Function2
   #115 = Class              #114         // kotlin/jvm/functions/Function2
   #116 = Utf8               kotlinx/coroutines/BuildersKt
   #117 = Class              #116         // kotlinx/coroutines/BuildersKt
   #118 = Utf8               runBlocking$default
   #119 = Utf8               (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
   #120 = NameAndType        #118:#119    // runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
   #121 = Methodref          #117.#120    // kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
   #122 = Utf8               startNetwork
   #123 = NameAndType        #122:#32     // startNetwork:()V
   #124 = Methodref          #2.#123      // ext/mods/gameserver/GameServer.startNetwork:()V
   #125 = Utf8               scheduleDeferredDoorsCastlesTasks
   #126 = NameAndType        #125:#32     // scheduleDeferredDoorsCastlesTasks:()V
   #127 = Methodref          #2.#126      // ext/mods/gameserver/GameServer.scheduleDeferredDoorsCastlesTasks:()V
   #128 = Utf8               scheduleDeferredNpcsSpawns
   #129 = NameAndType        #128:#32     // scheduleDeferredNpcsSpawns:()V
   #130 = Methodref          #2.#129      // ext/mods/gameserver/GameServer.scheduleDeferredNpcsSpawns:()V
   #131 = Utf8               os.name
   #132 = String             #131         // os.name
   #133 = Utf8               getProperty
   #134 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #135 = NameAndType        #133:#134    // getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #136 = Methodref          #66.#135     // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
   #137 = Utf8               java/util/Locale
   #138 = Class              #137         // java/util/Locale
   #139 = Utf8               ROOT
   #140 = Utf8               Ljava/util/Locale;
   #141 = NameAndType        #139:#140    // ROOT:Ljava/util/Locale;
   #142 = Fieldref           #138.#141    // java/util/Locale.ROOT:Ljava/util/Locale;
   #143 = Utf8               toLowerCase
   #144 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
   #145 = NameAndType        #143:#144    // toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
   #146 = Methodref          #34.#145     // java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
   #147 = Utf8               toLowerCase(...)
   #148 = String             #147         // toLowerCase(...)
   #149 = Utf8               kotlin/jvm/internal/Intrinsics
   #150 = Class              #149         // kotlin/jvm/internal/Intrinsics
   #151 = Utf8               checkNotNullExpressionValue
   #152 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #153 = NameAndType        #151:#152    // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #154 = Methodref          #150.#153    // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #155 = Utf8               java/lang/CharSequence
   #156 = Class              #155         // java/lang/CharSequence
   #157 = Utf8               win
   #158 = String             #157         // win
   #159 = Utf8               kotlin/text/StringsKt
   #160 = Class              #159         // kotlin/text/StringsKt
   #161 = Utf8               contains$default
   #162 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
   #163 = NameAndType        #161:#162    // contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
   #164 = Methodref          #160.#163    // kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
   #165 = Utf8               mac
   #166 = String             #165         // mac
   #167 = Utf8               playServerLoadedSound
   #168 = NameAndType        #167:#32     // playServerLoadedSound:()V
   #169 = Methodref          #2.#168      // ext/mods/gameserver/GameServer.playServerLoadedSound:()V
   #170 = Utf8               os
   #171 = Utf8               Ljava/lang/String;
   #172 = Utf8               args
   #173 = Utf8               [Ljava/lang/String;
   #174 = Class              #173         // "[Ljava/lang/String;"
   #175 = Utf8               ext/mods/Config
   #176 = Class              #175         // ext/mods/Config
   #177 = Utf8               DEV_MODE
   #178 = Utf8               Z
   #179 = NameAndType        #177:#178    // DEV_MODE:Z
   #180 = Fieldref           #176.#179    // ext/mods/Config.DEV_MODE:Z
   #181 = Utf8               BASE_PATH
   #182 = Utf8               Ljava/nio/file/Path;
   #183 = NameAndType        #181:#182    // BASE_PATH:Ljava/nio/file/Path;
   #184 = Fieldref           #176.#183    // ext/mods/Config.BASE_PATH:Ljava/nio/file/Path;
   #185 = Utf8               dev
   #186 = String             #185         // dev
   #187 = Utf8               java/nio/file/Path
   #188 = Class              #187         // java/nio/file/Path
   #189 = Utf8               resolve
   #190 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
   #191 = NameAndType        #189:#190    // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #192 = InterfaceMethodref #188.#191    // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
   #193 = Utf8               game
   #194 = String             #193         // game
   #195 = Utf8               toFile
   #196 = Utf8               ()Ljava/io/File;
   #197 = NameAndType        #195:#196    // toFile:()Ljava/io/File;
   #198 = InterfaceMethodref #188.#197    // java/nio/file/Path.toFile:()Ljava/io/File;
   #199 = Utf8               java/io/File
   #200 = Class              #199         // java/io/File
   #201 = Utf8               mkdirs
   #202 = Utf8               ()Z
   #203 = NameAndType        #201:#202    // mkdirs:()Z
   #204 = Methodref          #200.#203    // java/io/File.mkdirs:()Z
   #205 = Utf8               Companion
   #206 = Utf8               Lext/mods/gameserver/GameServer$Companion;
   #207 = NameAndType        #205:#206    // Companion:Lext/mods/gameserver/GameServer$Companion;
   #208 = Fieldref           #2.#207      // ext/mods/gameserver/GameServer.Companion:Lext/mods/gameserver/GameServer$Companion;
   #209 = Utf8               ext/mods/gameserver/GameServer$Companion
   #210 = Class              #209         // ext/mods/gameserver/GameServer$Companion
   #211 = Utf8               access$createDirectories
   #212 = Utf8               (Lext/mods/gameserver/GameServer$Companion;)V
   #213 = NameAndType        #211:#212    // access$createDirectories:(Lext/mods/gameserver/GameServer$Companion;)V
   #214 = Methodref          #210.#213    // ext/mods/gameserver/GameServer$Companion.access$createDirectories:(Lext/mods/gameserver/GameServer$Companion;)V
   #215 = Utf8               configureLogging
   #216 = NameAndType        #215:#32     // configureLogging:()V
   #217 = Methodref          #2.#216      // ext/mods/gameserver/GameServer.configureLogging:()V
   #218 = Utf8               initGUI
   #219 = NameAndType        #218:#32     // initGUI:()V
   #220 = Methodref          #2.#219      // ext/mods/gameserver/GameServer.initGUI:()V
   #221 = Utf8               ext/mods/security/gui/LauncherApp
   #222 = Class              #221         // ext/mods/security/gui/LauncherApp
   #223 = Utf8               setKey
   #224 = Utf8               (Ljava/lang/String;)V
   #225 = NameAndType        #223:#224    // setKey:(Ljava/lang/String;)V
   #226 = Methodref          #222.#225    // ext/mods/security/gui/LauncherApp.setKey:(Ljava/lang/String;)V
   #227 = Utf8               L2_KEY
   #228 = String             #227         // L2_KEY
   #229 = Utf8               getenv
   #230 = NameAndType        #229:#134    // getenv:(Ljava/lang/String;)Ljava/lang/String;
   #231 = Methodref          #66.#230     // java/lang/System.getenv:(Ljava/lang/String;)Ljava/lang/String;
   #232 = Utf8               setLoggedUserEmail
   #233 = NameAndType        #232:#224    // setLoggedUserEmail:(Ljava/lang/String;)V
   #234 = Methodref          #222.#233    // ext/mods/security/gui/LauncherApp.setLoggedUserEmail:(Ljava/lang/String;)V
   #235 = Utf8               ext/mods/security/LicenseValidator
   #236 = Class              #235         // ext/mods/security/LicenseValidator
   #237 = Utf8               getPublicIPAddress
   #238 = Utf8               ()Ljava/lang/String;
   #239 = NameAndType        #237:#238    // getPublicIPAddress:()Ljava/lang/String;
   #240 = Methodref          #236.#239    // ext/mods/security/LicenseValidator.getPublicIPAddress:()Ljava/lang/String;
   #241 = Utf8               getKey
   #242 = NameAndType        #241:#238    // getKey:()Ljava/lang/String;
   #243 = Methodref          #222.#242    // ext/mods/security/gui/LauncherApp.getKey:()Ljava/lang/String;
   #244 = Utf8               getLoggedUserEmail
   #245 = NameAndType        #244:#238    // getLoggedUserEmail:()Ljava/lang/String;
   #246 = Methodref          #222.#245    // ext/mods/security/gui/LauncherApp.getLoggedUserEmail:()Ljava/lang/String;
   #247 = Utf8               checkLicenseAndGetExpiry
   #248 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #249 = NameAndType        #247:#248    // checkLicenseAndGetExpiry:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #250 = Methodref          #236.#249    // ext/mods/security/LicenseValidator.checkLicenseAndGetExpiry:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #251 = Utf8               Licença inválida.
   #252 = String             #251         // Licença inválida.
   #253 = Utf8               javax/swing/JOptionPane
   #254 = Class              #253         // javax/swing/JOptionPane
   #255 = Utf8               showMessageDialog
   #256 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #257 = NameAndType        #255:#256    // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;)V
   #258 = Methodref          #254.#257    // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;)V
   #259 = Long               10000l
   #261 = Utf8               java/lang/Thread
   #262 = Class              #261         // java/lang/Thread
   #263 = Utf8               sleep
   #264 = NameAndType        #263:#24     // sleep:(J)V
   #265 = Methodref          #262.#264    // java/lang/Thread.sleep:(J)V
   #266 = Utf8               exit
   #267 = NameAndType        #266:#43     // exit:(I)V
   #268 = Methodref          #66.#267     // java/lang/System.exit:(I)V
   #269 = Utf8               $i$a$-let-GameServer$setupEnvironment$1
   #270 = Utf8               I
   #271 = Utf8               it
   #272 = Utf8               expiryDate
   #273 = Utf8               java/lang/Throwable
   #274 = Class              #273         // java/lang/Throwable
   #275 = Utf8               java/lang/Exception
   #276 = Class              #275         // java/lang/Exception
   #277 = Utf8               java/io/FileInputStream
   #278 = Class              #277         // java/io/FileInputStream
   #279 = Utf8               CONFIG_PATH
   #280 = NameAndType        #279:#182    // CONFIG_PATH:Ljava/nio/file/Path;
   #281 = Fieldref           #176.#280    // ext/mods/Config.CONFIG_PATH:Ljava/nio/file/Path;
   #282 = Utf8               logging.properties
   #283 = String             #282         // logging.properties
   #284 = Utf8               (Ljava/io/File;)V
   #285 = NameAndType        #31:#284     // "<init>":(Ljava/io/File;)V
   #286 = Methodref          #278.#285    // java/io/FileInputStream."<init>":(Ljava/io/File;)V
   #287 = Utf8               java/io/Closeable
   #288 = Class              #287         // java/io/Closeable
   #289 = Utf8               java/util/logging/LogManager
   #290 = Class              #289         // java/util/logging/LogManager
   #291 = Utf8               getLogManager
   #292 = Utf8               ()Ljava/util/logging/LogManager;
   #293 = NameAndType        #291:#292    // getLogManager:()Ljava/util/logging/LogManager;
   #294 = Methodref          #290.#293    // java/util/logging/LogManager.getLogManager:()Ljava/util/logging/LogManager;
   #295 = Utf8               java/io/InputStream
   #296 = Class              #295         // java/io/InputStream
   #297 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #298 = MethodType         #297         //  (Ljava/lang/Object;)Ljava/lang/Object;
   #299 = Utf8               configureLogging$lambda$0$0
   #300 = Utf8               (Ljava/lang/String;)Ljava/util/function/BiFunction;
   #301 = NameAndType        #299:#300    // configureLogging$lambda$0$0:(Ljava/lang/String;)Ljava/util/function/BiFunction;
   #302 = Methodref          #2.#301      // ext/mods/gameserver/GameServer.configureLogging$lambda$0$0:(Ljava/lang/String;)Ljava/util/function/BiFunction;
   #303 = MethodHandle       6:#302       // REF_invokeStatic ext/mods/gameserver/GameServer.configureLogging$lambda$0$0:(Ljava/lang/String;)Ljava/util/function/BiFunction;
   #304 = MethodType         #300         //  (Ljava/lang/String;)Ljava/util/function/BiFunction;
   #305 = Utf8               java/lang/invoke/LambdaMetafactory
   #306 = Class              #305         // java/lang/invoke/LambdaMetafactory
   #307 = Utf8               metafactory
   #308 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #309 = NameAndType        #307:#308    // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #310 = Methodref          #306.#309    // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #311 = MethodHandle       6:#310       // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #312 = Utf8               apply
   #313 = Utf8               ()Ljava/util/function/Function;
   #314 = NameAndType        #312:#313    // apply:()Ljava/util/function/Function;
   #315 = InvokeDynamic      #0:#314      // #0:apply:()Ljava/util/function/Function;
   #316 = Utf8               updateConfiguration
   #317 = Utf8               (Ljava/io/InputStream;Ljava/util/function/Function;)V
   #318 = NameAndType        #316:#317    // updateConfiguration:(Ljava/io/InputStream;Ljava/util/function/Function;)V
   #319 = Methodref          #290.#318    // java/util/logging/LogManager.updateConfiguration:(Ljava/io/InputStream;Ljava/util/function/Function;)V
   #320 = Utf8               kotlin/Unit
   #321 = Class              #320         // kotlin/Unit
   #322 = Utf8               INSTANCE
   #323 = Utf8               Lkotlin/Unit;
   #324 = NameAndType        #322:#323    // INSTANCE:Lkotlin/Unit;
   #325 = Fieldref           #321.#324    // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #326 = Utf8               kotlin/io/CloseableKt
   #327 = Class              #326         // kotlin/io/CloseableKt
   #328 = Utf8               closeFinally
   #329 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #330 = NameAndType        #328:#329    // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #331 = Methodref          #327.#330    // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #332 = Utf8               $i$a$-use-GameServer$configureLogging$1
   #333 = Utf8               is
   #334 = Utf8               Ljava/io/FileInputStream;
   #335 = Utf8               java/awt/GraphicsEnvironment
   #336 = Class              #335         // java/awt/GraphicsEnvironment
   #337 = Utf8               isHeadless
   #338 = NameAndType        #337:#202    // isHeadless:()Z
   #339 = Methodref          #336.#338    // java/awt/GraphicsEnvironment.isHeadless:()Z
   #340 = Utf8               ext/mods/commons/gui/InterfaceGS
   #341 = Class              #340         // ext/mods/commons/gui/InterfaceGS
   #342 = Methodref          #341.#39     // ext/mods/commons/gui/InterfaceGS."<init>":()V
   #343 = Utf8               Game: Running in Interface GUI.
   #344 = String             #343         // Game: Running in Interface GUI.
   #345 = Utf8               out
   #346 = Utf8               Ljava/io/PrintStream;
   #347 = NameAndType        #345:#346    // out:Ljava/io/PrintStream;
   #348 = Fieldref           #66.#347     // java/lang/System.out:Ljava/io/PrintStream;
   #349 = Utf8               java/io/PrintStream
   #350 = Class              #349         // java/io/PrintStream
   #351 = Utf8               println
   #352 = Utf8               (Ljava/lang/Object;)V
   #353 = NameAndType        #351:#352    // println:(Ljava/lang/Object;)V
   #354 = Methodref          #350.#353    // java/io/PrintStream.println:(Ljava/lang/Object;)V
   #355 = Utf8               Game: Fallback to console mode.
   #356 = String             #355         // Game: Fallback to console mode.
   #357 = Utf8               t
   #358 = Utf8               Ljava/lang/Throwable;
   #359 = Utf8               loadParallel
   #360 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #361 = Utf8               (Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
   #362 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2
   #363 = Class              #362         // ext/mods/gameserver/GameServer$loadParallel$2
   #364 = Methodref          #363.#112    // ext/mods/gameserver/GameServer$loadParallel$2."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #365 = Utf8               kotlinx/coroutines/CoroutineScopeKt
   #366 = Class              #365         // kotlinx/coroutines/CoroutineScopeKt
   #367 = Utf8               coroutineScope
   #368 = Utf8               (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #369 = NameAndType        #367:#368    // coroutineScope:(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #370 = Methodref          #366.#369    // kotlinx/coroutines/CoroutineScopeKt.coroutineScope:(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #371 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #372 = Class              #371         // kotlin/coroutines/intrinsics/IntrinsicsKt
   #373 = Utf8               getCOROUTINE_SUSPENDED
   #374 = Utf8               ()Ljava/lang/Object;
   #375 = NameAndType        #373:#374    // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #376 = Methodref          #372.#375    // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #377 = Utf8               $completion
   #378 = Utf8               Lkotlin/coroutines/Continuation;
   #379 = Utf8               loadConfigAndPools
   #380 = Utf8               Config
   #381 = String             #380         // Config
   #382 = Utf8               ext/mods/commons/lang/StringUtil
   #383 = Class              #382         // ext/mods/commons/lang/StringUtil
   #384 = Utf8               printSection
   #385 = NameAndType        #384:#224    // printSection:(Ljava/lang/String;)V
   #386 = Methodref          #383.#385    // ext/mods/commons/lang/StringUtil.printSection:(Ljava/lang/String;)V
   #387 = Utf8               loadGameServer
   #388 = NameAndType        #387:#32     // loadGameServer:()V
   #389 = Methodref          #176.#388    // ext/mods/Config.loadGameServer:()V
   #390 = Utf8               Poolers
   #391 = String             #390         // Poolers
   #392 = Utf8               ext/mods/commons/pool/ConnectionPool
   #393 = Class              #392         // ext/mods/commons/pool/ConnectionPool
   #394 = Utf8               init
   #395 = NameAndType        #394:#32     // init:()V
   #396 = Methodref          #393.#395    // ext/mods/commons/pool/ConnectionPool.init:()V
   #397 = Utf8               ext/mods/commons/pool/ThreadPool
   #398 = Class              #397         // ext/mods/commons/pool/ThreadPool
   #399 = Methodref          #398.#395    // ext/mods/commons/pool/ThreadPool.init:()V
   #400 = Utf8               loadIdFactory
   #401 = Utf8               IdFactory
   #402 = String             #401         // IdFactory
   #403 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #404 = Class              #403         // ext/mods/gameserver/idfactory/IdFactory
   #405 = Utf8               getInstance
   #406 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #407 = NameAndType        #405:#406    // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #408 = Methodref          #404.#407    // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #409 = Utf8               loadWorldAndCache
   #410 = Utf8               Cache & World
   #411 = String             #410         // Cache & World
   #412 = Utf8               ext/mods/gameserver/data/HTMLData
   #413 = Class              #412         // ext/mods/gameserver/data/HTMLData
   #414 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #415 = NameAndType        #405:#414    // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #416 = Methodref          #413.#415    // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #417 = Utf8               load
   #418 = NameAndType        #417:#32     // load:()V
   #419 = Methodref          #413.#418    // ext/mods/gameserver/data/HTMLData.load:()V
   #420 = Utf8               ext/mods/gameserver/data/xml/SysString
   #421 = Class              #420         // ext/mods/gameserver/data/xml/SysString
   #422 = Utf8               ()Lext/mods/gameserver/data/xml/SysString;
   #423 = NameAndType        #405:#422    // getInstance:()Lext/mods/gameserver/data/xml/SysString;
   #424 = Methodref          #421.#423    // ext/mods/gameserver/data/xml/SysString.getInstance:()Lext/mods/gameserver/data/xml/SysString;
   #425 = Methodref          #421.#418    // ext/mods/gameserver/data/xml/SysString.load:()V
   #426 = Utf8               ext/mods/gameserver/data/cache/CrestCache
   #427 = Class              #426         // ext/mods/gameserver/data/cache/CrestCache
   #428 = Utf8               ()Lext/mods/gameserver/data/cache/CrestCache;
   #429 = NameAndType        #405:#428    // getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
   #430 = Methodref          #427.#429    // ext/mods/gameserver/data/cache/CrestCache.getInstance:()Lext/mods/gameserver/data/cache/CrestCache;
   #431 = Utf8               ext/mods/gameserver/model/World
   #432 = Class              #431         // ext/mods/gameserver/model/World
   #433 = Utf8               ()Lext/mods/gameserver/model/World;
   #434 = NameAndType        #405:#433    // getInstance:()Lext/mods/gameserver/model/World;
   #435 = Methodref          #432.#434    // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #436 = Utf8               ext/mods/gameserver/data/xml/AnnouncementData
   #437 = Class              #436         // ext/mods/gameserver/data/xml/AnnouncementData
   #438 = Utf8               ()Lext/mods/gameserver/data/xml/AnnouncementData;
   #439 = NameAndType        #405:#438    // getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
   #440 = Methodref          #437.#439    // ext/mods/gameserver/data/xml/AnnouncementData.getInstance:()Lext/mods/gameserver/data/xml/AnnouncementData;
   #441 = Utf8               ext/mods/gameserver/data/sql/ServerMemoTable
   #442 = Class              #441         // ext/mods/gameserver/data/sql/ServerMemoTable
   #443 = Utf8               ()Lext/mods/gameserver/data/sql/ServerMemoTable;
   #444 = NameAndType        #405:#443    // getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
   #445 = Methodref          #442.#444    // ext/mods/gameserver/data/sql/ServerMemoTable.getInstance:()Lext/mods/gameserver/data/sql/ServerMemoTable;
   #446 = Utf8               ext/mods/gameserver/model/memo/GlobalMemo
   #447 = Class              #446         // ext/mods/gameserver/model/memo/GlobalMemo
   #448 = Utf8               ()Lext/mods/gameserver/model/memo/GlobalMemo;
   #449 = NameAndType        #405:#448    // getInstance:()Lext/mods/gameserver/model/memo/GlobalMemo;
   #450 = Methodref          #447.#449    // ext/mods/gameserver/model/memo/GlobalMemo.getInstance:()Lext/mods/gameserver/model/memo/GlobalMemo;
   #451 = Utf8               server_crash
   #452 = String             #451         // server_crash
   #453 = Utf8               getBool
   #454 = Utf8               (Ljava/lang/String;Z)Z
   #455 = NameAndType        #453:#454    // getBool:(Ljava/lang/String;Z)Z
   #456 = Methodref          #442.#455    // ext/mods/gameserver/data/sql/ServerMemoTable.getBool:(Ljava/lang/String;Z)Z
   #457 = Utf8               isServerCrash
   #458 = NameAndType        #457:#178    // isServerCrash:Z
   #459 = Fieldref           #2.#458      // ext/mods/gameserver/GameServer.isServerCrash:Z
   #460 = Utf8               loadSkills
   #461 = Utf8               Skills
   #462 = String             #461         // Skills
   #463 = Utf8               ext/mods/gameserver/data/SkillTable
   #464 = Class              #463         // ext/mods/gameserver/data/SkillTable
   #465 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #466 = NameAndType        #405:#465    // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #467 = Methodref          #464.#466    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #468 = Utf8               ext/mods/gameserver/data/xml/SkillTreeData
   #469 = Class              #468         // ext/mods/gameserver/data/xml/SkillTreeData
   #470 = Utf8               ()Lext/mods/gameserver/data/xml/SkillTreeData;
   #471 = NameAndType        #405:#470    // getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
   #472 = Methodref          #469.#471    // ext/mods/gameserver/data/xml/SkillTreeData.getInstance:()Lext/mods/gameserver/data/xml/SkillTreeData;
   #473 = Utf8               loadItemsMassive
   #474 = Utf8               Items
   #475 = String             #474         // Items
   #476 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #477 = Class              #476         // ext/mods/gameserver/data/xml/ItemData
   #478 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #479 = NameAndType        #405:#478    // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #480 = Methodref          #477.#479    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #481 = Utf8               ext/mods/gameserver/data/xml/SummonItemData
   #482 = Class              #481         // ext/mods/gameserver/data/xml/SummonItemData
   #483 = Utf8               ()Lext/mods/gameserver/data/xml/SummonItemData;
   #484 = NameAndType        #405:#483    // getInstance:()Lext/mods/gameserver/data/xml/SummonItemData;
   #485 = Methodref          #482.#484    // ext/mods/gameserver/data/xml/SummonItemData.getInstance:()Lext/mods/gameserver/data/xml/SummonItemData;
   #486 = Utf8               ext/mods/summonmobitem/SummonMobItemData
   #487 = Class              #486         // ext/mods/summonmobitem/SummonMobItemData
   #488 = Utf8               ()Lext/mods/summonmobitem/SummonMobItemData;
   #489 = NameAndType        #405:#488    // getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
   #490 = Methodref          #487.#489    // ext/mods/summonmobitem/SummonMobItemData.getInstance:()Lext/mods/summonmobitem/SummonMobItemData;
   #491 = Utf8               ext/mods/gameserver/data/xml/HennaData
   #492 = Class              #491         // ext/mods/gameserver/data/xml/HennaData
   #493 = Utf8               ()Lext/mods/gameserver/data/xml/HennaData;
   #494 = NameAndType        #405:#493    // getInstance:()Lext/mods/gameserver/data/xml/HennaData;
   #495 = Methodref          #492.#494    // ext/mods/gameserver/data/xml/HennaData.getInstance:()Lext/mods/gameserver/data/xml/HennaData;
   #496 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
   #497 = Class              #496         // ext/mods/gameserver/data/manager/BuyListManager
   #498 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
   #499 = NameAndType        #405:#498    // getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
   #500 = Methodref          #497.#499    // ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
   #501 = Utf8               ext/mods/gameserver/data/xml/MultisellData
   #502 = Class              #501         // ext/mods/gameserver/data/xml/MultisellData
   #503 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
   #504 = NameAndType        #405:#503    // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
   #505 = Methodref          #502.#504    // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
   #506 = Utf8               ext/mods/gameserver/data/xml/RecipeData
   #507 = Class              #506         // ext/mods/gameserver/data/xml/RecipeData
   #508 = Utf8               ()Lext/mods/gameserver/data/xml/RecipeData;
   #509 = NameAndType        #405:#508    // getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
   #510 = Methodref          #507.#509    // ext/mods/gameserver/data/xml/RecipeData.getInstance:()Lext/mods/gameserver/data/xml/RecipeData;
   #511 = Utf8               ext/mods/gameserver/data/xml/ArmorSetData
   #512 = Class              #511         // ext/mods/gameserver/data/xml/ArmorSetData
   #513 = Utf8               ()Lext/mods/gameserver/data/xml/ArmorSetData;
   #514 = NameAndType        #405:#513    // getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
   #515 = Methodref          #512.#514    // ext/mods/gameserver/data/xml/ArmorSetData.getInstance:()Lext/mods/gameserver/data/xml/ArmorSetData;
   #516 = Utf8               ext/mods/gameserver/data/xml/FishData
   #517 = Class              #516         // ext/mods/gameserver/data/xml/FishData
   #518 = Utf8               ()Lext/mods/gameserver/data/xml/FishData;
   #519 = NameAndType        #405:#518    // getInstance:()Lext/mods/gameserver/data/xml/FishData;
   #520 = Methodref          #517.#519    // ext/mods/gameserver/data/xml/FishData.getInstance:()Lext/mods/gameserver/data/xml/FishData;
   #521 = Utf8               ext/mods/gameserver/data/xml/SpellbookData
   #522 = Class              #521         // ext/mods/gameserver/data/xml/SpellbookData
   #523 = Utf8               ()Lext/mods/gameserver/data/xml/SpellbookData;
   #524 = NameAndType        #405:#523    // getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
   #525 = Methodref          #522.#524    // ext/mods/gameserver/data/xml/SpellbookData.getInstance:()Lext/mods/gameserver/data/xml/SpellbookData;
   #526 = Utf8               ext/mods/gameserver/data/xml/SoulCrystalData
   #527 = Class              #526         // ext/mods/gameserver/data/xml/SoulCrystalData
   #528 = Utf8               ()Lext/mods/gameserver/data/xml/SoulCrystalData;
   #529 = NameAndType        #405:#528    // getInstance:()Lext/mods/gameserver/data/xml/SoulCrystalData;
   #530 = Methodref          #527.#529    // ext/mods/gameserver/data/xml/SoulCrystalData.getInstance:()Lext/mods/gameserver/data/xml/SoulCrystalData;
   #531 = Utf8               ext/mods/gameserver/data/xml/AugmentationData
   #532 = Class              #531         // ext/mods/gameserver/data/xml/AugmentationData
   #533 = Utf8               ()Lext/mods/gameserver/data/xml/AugmentationData;
   #534 = NameAndType        #405:#533    // getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
   #535 = Methodref          #532.#534    // ext/mods/gameserver/data/xml/AugmentationData.getInstance:()Lext/mods/gameserver/data/xml/AugmentationData;
   #536 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
   #537 = Class              #536         // ext/mods/gameserver/data/manager/CursedWeaponManager
   #538 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #539 = NameAndType        #405:#538    // getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #540 = Methodref          #537.#539    // ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #541 = Utf8               ext/mods/gameserver/data/xml/SkipData
   #542 = Class              #541         // ext/mods/gameserver/data/xml/SkipData
   #543 = Utf8               ()Lext/mods/gameserver/data/xml/SkipData;
   #544 = NameAndType        #405:#543    // getInstance:()Lext/mods/gameserver/data/xml/SkipData;
   #545 = Methodref          #542.#544    // ext/mods/gameserver/data/xml/SkipData.getInstance:()Lext/mods/gameserver/data/xml/SkipData;
   #546 = Utf8               loadAdminsCharacters
   #547 = Utf8               Admins & Chars
   #548 = String             #547         // Admins & Chars
   #549 = Utf8               ext/mods/gameserver/data/xml/AdminData
   #550 = Class              #549         // ext/mods/gameserver/data/xml/AdminData
   #551 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
   #552 = NameAndType        #405:#551    // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #553 = Methodref          #550.#552    // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #554 = Utf8               ext/mods/gameserver/data/sql/BookmarkTable
   #555 = Class              #554         // ext/mods/gameserver/data/sql/BookmarkTable
   #556 = Utf8               ()Lext/mods/gameserver/data/sql/BookmarkTable;
   #557 = NameAndType        #405:#556    // getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
   #558 = Methodref          #555.#557    // ext/mods/gameserver/data/sql/BookmarkTable.getInstance:()Lext/mods/gameserver/data/sql/BookmarkTable;
   #559 = Utf8               ext/mods/gameserver/data/manager/PetitionManager
   #560 = Class              #559         // ext/mods/gameserver/data/manager/PetitionManager
   #561 = Utf8               ()Lext/mods/gameserver/data/manager/PetitionManager;
   #562 = NameAndType        #405:#561    // getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #563 = Methodref          #560.#562    // ext/mods/gameserver/data/manager/PetitionManager.getInstance:()Lext/mods/gameserver/data/manager/PetitionManager;
   #564 = Utf8               ext/mods/gameserver/data/xml/PlayerData
   #565 = Class              #564         // ext/mods/gameserver/data/xml/PlayerData
   #566 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
   #567 = NameAndType        #405:#566    // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #568 = Methodref          #565.#567    // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
   #569 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
   #570 = Class              #569         // ext/mods/gameserver/data/sql/PlayerInfoTable
   #571 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #572 = NameAndType        #405:#571    // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #573 = Methodref          #570.#572    // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
   #574 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
   #575 = Class              #574         // ext/mods/gameserver/data/xml/PlayerLevelData
   #576 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #577 = NameAndType        #405:#576    // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #578 = Methodref          #575.#577    // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #579 = Utf8               ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #580 = Class              #579         // ext/mods/gameserver/data/manager/PartyMatchRoomManager
   #581 = Utf8               ()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #582 = NameAndType        #405:#581    // getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #583 = Methodref          #580.#582    // ext/mods/gameserver/data/manager/PartyMatchRoomManager.getInstance:()Lext/mods/gameserver/data/manager/PartyMatchRoomManager;
   #584 = Utf8               ext/mods/gameserver/data/manager/RaidPointManager
   #585 = Class              #584         // ext/mods/gameserver/data/manager/RaidPointManager
   #586 = Utf8               ()Lext/mods/gameserver/data/manager/RaidPointManager;
   #587 = NameAndType        #405:#586    // getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
   #588 = Methodref          #585.#587    // ext/mods/gameserver/data/manager/RaidPointManager.getInstance:()Lext/mods/gameserver/data/manager/RaidPointManager;
   #589 = Utf8               ext/mods/gameserver/data/xml/HealSpsData
   #590 = Class              #589         // ext/mods/gameserver/data/xml/HealSpsData
   #591 = Utf8               ()Lext/mods/gameserver/data/xml/HealSpsData;
   #592 = NameAndType        #405:#591    // getInstance:()Lext/mods/gameserver/data/xml/HealSpsData;
   #593 = Methodref          #590.#592    // ext/mods/gameserver/data/xml/HealSpsData.getInstance:()Lext/mods/gameserver/data/xml/HealSpsData;
   #594 = Utf8               ext/mods/gameserver/data/xml/RestartPointData
   #595 = Class              #594         // ext/mods/gameserver/data/xml/RestartPointData
   #596 = Utf8               ()Lext/mods/gameserver/data/xml/RestartPointData;
   #597 = NameAndType        #405:#596    // getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
   #598 = Methodref          #595.#597    // ext/mods/gameserver/data/xml/RestartPointData.getInstance:()Lext/mods/gameserver/data/xml/RestartPointData;
   #599 = Utf8               Clans
   #600 = String             #599         // Clans
   #601 = Utf8               ext/mods/gameserver/data/sql/ClanTable
   #602 = Class              #601         // ext/mods/gameserver/data/sql/ClanTable
   #603 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
   #604 = NameAndType        #405:#603    // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #605 = Methodref          #602.#604    // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
   #606 = Utf8               loadGeoAndZones
   #607 = Utf8               Geodata & Zones
   #608 = String             #607         // Geodata & Zones
   #609 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #610 = Class              #609         // ext/mods/gameserver/geoengine/GeoEngine
   #611 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #612 = NameAndType        #205:#611    // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #613 = Fieldref           #610.#612    // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #614 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #615 = Class              #614         // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #616 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #617 = NameAndType        #405:#616    // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #618 = Methodref          #615.#617    // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #619 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
   #620 = Class              #619         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
   #621 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #622 = NameAndType        #405:#621    // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #623 = Methodref          #620.#622    // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #624 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
   #625 = Class              #624         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
   #626 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
   #627 = NameAndType        #405:#626    // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
   #628 = Methodref          #625.#627    // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
   #629 = Utf8               startAutoGeneration
   #630 = NameAndType        #629:#32     // startAutoGeneration:()V
   #631 = Methodref          #625.#630    // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.startAutoGeneration:()V
   #632 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #633 = Class              #632         // ext/mods/gameserver/data/manager/ZoneManager
   #634 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #635 = NameAndType        #405:#634    // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #636 = Methodref          #633.#635    // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #637 = Utf8               loadDoorsCastlesTasks
   #638 = Utf8               Doors & Castles
   #639 = String             #638         // Doors & Castles
   #640 = Utf8               suppressDoorsCastlesLogs
   #641 = NameAndType        #640:#52     // suppressDoorsCastlesLogs:(Z)V
   #642 = Methodref          #2.#641      // ext/mods/gameserver/GameServer.suppressDoorsCastlesLogs:(Z)V
   #643 = Utf8               ext/mods/gameserver/data/xml/DoorData
   #644 = Class              #643         // ext/mods/gameserver/data/xml/DoorData
   #645 = Utf8               ()Lext/mods/gameserver/data/xml/DoorData;
   #646 = NameAndType        #405:#645    // getInstance:()Lext/mods/gameserver/data/xml/DoorData;
   #647 = Methodref          #644.#646    // ext/mods/gameserver/data/xml/DoorData.getInstance:()Lext/mods/gameserver/data/xml/DoorData;
   #648 = Utf8               spawn
   #649 = NameAndType        #648:#32     // spawn:()V
   #650 = Methodref          #644.#649    // ext/mods/gameserver/data/xml/DoorData.spawn:()V
   #651 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #652 = Class              #651         // ext/mods/gameserver/data/manager/CastleManager
   #653 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #654 = NameAndType        #405:#653    // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #655 = Methodref          #652.#654    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #656 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #657 = Class              #656         // ext/mods/gameserver/data/manager/ClanHallManager
   #658 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #659 = NameAndType        #405:#658    // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #660 = Methodref          #657.#659    // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #661 = Utf8               Task Managers
   #662 = String             #661         // Task Managers
   #663 = Utf8               ext/mods/gameserver/taskmanager/AiTaskManager
   #664 = Class              #663         // ext/mods/gameserver/taskmanager/AiTaskManager
   #665 = Utf8               ()Lext/mods/gameserver/taskmanager/AiTaskManager;
   #666 = NameAndType        #405:#665    // getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
   #667 = Methodref          #664.#666    // ext/mods/gameserver/taskmanager/AiTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AiTaskManager;
   #668 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #669 = Class              #668         // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #670 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #671 = NameAndType        #405:#670    // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #672 = Methodref          #669.#671    // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #673 = Utf8               ext/mods/gameserver/taskmanager/BoatTaskManager
   #674 = Class              #673         // ext/mods/gameserver/taskmanager/BoatTaskManager
   #675 = Utf8               ()Lext/mods/gameserver/taskmanager/BoatTaskManager;
   #676 = NameAndType        #405:#675    // getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
   #677 = Methodref          #674.#676    // ext/mods/gameserver/taskmanager/BoatTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/BoatTaskManager;
   #678 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
   #679 = Class              #678         // ext/mods/gameserver/taskmanager/DecayTaskManager
   #680 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #681 = NameAndType        #405:#680    // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #682 = Methodref          #679.#681    // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #683 = Utf8               ext/mods/gameserver/taskmanager/DelayedItemsManager
   #684 = Class              #683         // ext/mods/gameserver/taskmanager/DelayedItemsManager
   #685 = Utf8               ()Lext/mods/gameserver/taskmanager/DelayedItemsManager;
   #686 = NameAndType        #405:#685    // getInstance:()Lext/mods/gameserver/taskmanager/DelayedItemsManager;
   #687 = Methodref          #684.#686    // ext/mods/gameserver/taskmanager/DelayedItemsManager.getInstance:()Lext/mods/gameserver/taskmanager/DelayedItemsManager;
   #688 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #689 = Class              #688         // ext/mods/gameserver/taskmanager/GameTimeTaskManager
   #690 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #691 = NameAndType        #405:#690    // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #692 = Methodref          #689.#691    // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
   #693 = Utf8               ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
   #694 = Class              #693         // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
   #695 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
   #696 = NameAndType        #405:#695    // getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
   #697 = Methodref          #694.#696    // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
   #698 = Utf8               ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager
   #699 = Class              #698         // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager
   #700 = Utf8               ()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
   #701 = NameAndType        #405:#700    // getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
   #702 = Methodref          #699.#701    // ext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/MakerSpawnScheduleTaskManager;
   #703 = Utf8               ext/mods/gameserver/taskmanager/PvpFlagTaskManager
   #704 = Class              #703         // ext/mods/gameserver/taskmanager/PvpFlagTaskManager
   #705 = Utf8               ()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
   #706 = NameAndType        #405:#705    // getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
   #707 = Methodref          #704.#706    // ext/mods/gameserver/taskmanager/PvpFlagTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/PvpFlagTaskManager;
   #708 = Utf8               ext/mods/gameserver/taskmanager/ShadowItemTaskManager
   #709 = Class              #708         // ext/mods/gameserver/taskmanager/ShadowItemTaskManager
   #710 = Utf8               ()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
   #711 = NameAndType        #405:#710    // getInstance:()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
   #712 = Methodref          #709.#711    // ext/mods/gameserver/taskmanager/ShadowItemTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
   #713 = Utf8               ext/mods/gameserver/taskmanager/WaterTaskManager
   #714 = Class              #713         // ext/mods/gameserver/taskmanager/WaterTaskManager
   #715 = Utf8               ()Lext/mods/gameserver/taskmanager/WaterTaskManager;
   #716 = NameAndType        #405:#715    // getInstance:()Lext/mods/gameserver/taskmanager/WaterTaskManager;
   #717 = Methodref          #714.#716    // ext/mods/gameserver/taskmanager/WaterTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/WaterTaskManager;
   #718 = Utf8               ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager
   #719 = Class              #718         // ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager
   #720 = Utf8               ()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
   #721 = NameAndType        #405:#720    // getInstance:()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
   #722 = Methodref          #719.#721    // ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
   #723 = Utf8               ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
   #724 = Class              #723         // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
   #725 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
   #726 = NameAndType        #405:#725    // getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
   #727 = Methodref          #724.#726    // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
   #728 = MethodType         #32          //  ()V
   #729 = Utf8               loadDoorsCastlesTasks$lambda$0
   #730 = NameAndType        #729:#32     // loadDoorsCastlesTasks$lambda$0:()V
   #731 = Methodref          #2.#730      // ext/mods/gameserver/GameServer.loadDoorsCastlesTasks$lambda$0:()V
   #732 = MethodHandle       6:#731       // REF_invokeStatic ext/mods/gameserver/GameServer.loadDoorsCastlesTasks$lambda$0:()V
   #733 = Utf8               run
   #734 = Utf8               ()Ljava/lang/Runnable;
   #735 = NameAndType        #733:#734    // run:()Ljava/lang/Runnable;
   #736 = InvokeDynamic      #1:#735      // #1:run:()Ljava/lang/Runnable;
   #737 = Utf8               access$getTimeUntilMidnight
   #738 = Utf8               (Lext/mods/gameserver/GameServer$Companion;)J
   #739 = NameAndType        #737:#738    // access$getTimeUntilMidnight:(Lext/mods/gameserver/GameServer$Companion;)J
   #740 = Methodref          #210.#739    // ext/mods/gameserver/GameServer$Companion.access$getTimeUntilMidnight:(Lext/mods/gameserver/GameServer$Companion;)J
   #741 = Long               86400000l
   #743 = Utf8               scheduleAtFixedRate
   #744 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #745 = NameAndType        #743:#744    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #746 = Methodref          #398.#745    // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #747 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
   #748 = Class              #747         // ext/mods/gameserver/data/manager/SevenSignsManager
   #749 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #750 = NameAndType        #405:#749    // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #751 = Methodref          #748.#750    // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
   #752 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #753 = Class              #752         // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #754 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #755 = NameAndType        #405:#754    // getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #756 = Methodref          #753.#755    // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #757 = Utf8               ext/mods/gameserver/data/xml/ManorAreaData
   #758 = Class              #757         // ext/mods/gameserver/data/xml/ManorAreaData
   #759 = Utf8               ()Lext/mods/gameserver/data/xml/ManorAreaData;
   #760 = NameAndType        #405:#759    // getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
   #761 = Methodref          #758.#760    // ext/mods/gameserver/data/xml/ManorAreaData.getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
   #762 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
   #763 = Class              #762         // ext/mods/gameserver/data/manager/CastleManorManager
   #764 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
   #765 = NameAndType        #405:#764    // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #766 = Methodref          #763.#765    // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #767 = Utf8               quiet
   #768 = Utf8               loadDoorsCastlesTasks$default
   #769 = Utf8               (Lext/mods/gameserver/GameServer;ZILjava/lang/Object;)V
   #770 = NameAndType        #637:#52     // loadDoorsCastlesTasks:(Z)V
   #771 = Methodref          #2.#770      // ext/mods/gameserver/GameServer.loadDoorsCastlesTasks:(Z)V
   #772 = Utf8               java/util/List
   #773 = Class              #772         // java/util/List
   #774 = Utf8               iterator
   #775 = Utf8               ()Ljava/util/Iterator;
   #776 = NameAndType        #774:#775    // iterator:()Ljava/util/Iterator;
   #777 = InterfaceMethodref #773.#776    // java/util/List.iterator:()Ljava/util/Iterator;
   #778 = Utf8               java/util/Iterator
   #779 = Class              #778         // java/util/Iterator
   #780 = Utf8               hasNext
   #781 = NameAndType        #780:#202    // hasNext:()Z
   #782 = InterfaceMethodref #779.#781    // java/util/Iterator.hasNext:()Z
   #783 = Utf8               next
   #784 = NameAndType        #783:#374    // next:()Ljava/lang/Object;
   #785 = InterfaceMethodref #779.#784    // java/util/Iterator.next:()Ljava/lang/Object;
   #786 = Utf8               java/util/logging/Logger
   #787 = Class              #786         // java/util/logging/Logger
   #788 = Utf8               getLogger
   #789 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #790 = NameAndType        #788:#789    // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #791 = Methodref          #787.#790    // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #792 = Utf8               getLevel
   #793 = Utf8               ()Ljava/util/logging/Level;
   #794 = NameAndType        #792:#793    // getLevel:()Ljava/util/logging/Level;
   #795 = Methodref          #787.#794    // java/util/logging/Logger.getLevel:()Ljava/util/logging/Level;
   #796 = Utf8               put
   #797 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #798 = NameAndType        #796:#797    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #799 = InterfaceMethodref #92.#798     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #800 = Utf8               java/util/logging/Level
   #801 = Class              #800         // java/util/logging/Level
   #802 = Utf8               WARNING
   #803 = Utf8               Ljava/util/logging/Level;
   #804 = NameAndType        #802:#803    // WARNING:Ljava/util/logging/Level;
   #805 = Fieldref           #801.#804    // java/util/logging/Level.WARNING:Ljava/util/logging/Level;
   #806 = Utf8               setLevel
   #807 = Utf8               (Ljava/util/logging/Level;)V
   #808 = NameAndType        #806:#807    // setLevel:(Ljava/util/logging/Level;)V
   #809 = Methodref          #787.#808    // java/util/logging/Logger.setLevel:(Ljava/util/logging/Level;)V
   #810 = Utf8               get
   #811 = NameAndType        #810:#297    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #812 = InterfaceMethodref #92.#811     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #813 = Utf8               INFO
   #814 = NameAndType        #813:#803    // INFO:Ljava/util/logging/Level;
   #815 = Fieldref           #801.#814    // java/util/logging/Level.INFO:Ljava/util/logging/Level;
   #816 = Utf8               remove
   #817 = NameAndType        #816:#297    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #818 = InterfaceMethodref #92.#817     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #819 = Utf8               log
   #820 = Utf8               Ljava/util/logging/Logger;
   #821 = Utf8               name
   #822 = Utf8               enable
   #823 = Utf8               scheduleDeferredDoorsCastlesTasks$lambda$0
   #824 = Utf8               (Lext/mods/gameserver/GameServer;)V
   #825 = NameAndType        #823:#824    // scheduleDeferredDoorsCastlesTasks$lambda$0:(Lext/mods/gameserver/GameServer;)V
   #826 = Methodref          #2.#825      // ext/mods/gameserver/GameServer.scheduleDeferredDoorsCastlesTasks$lambda$0:(Lext/mods/gameserver/GameServer;)V
   #827 = MethodHandle       6:#826       // REF_invokeStatic ext/mods/gameserver/GameServer.scheduleDeferredDoorsCastlesTasks$lambda$0:(Lext/mods/gameserver/GameServer;)V
   #828 = Utf8               (Lext/mods/gameserver/GameServer;)Ljava/lang/Runnable;
   #829 = NameAndType        #733:#828    // run:(Lext/mods/gameserver/GameServer;)Ljava/lang/Runnable;
   #830 = InvokeDynamic      #2:#829      // #2:run:(Lext/mods/gameserver/GameServer;)Ljava/lang/Runnable;
   #831 = Utf8               executeParallel
   #832 = Utf8               (Ljava/lang/Runnable;)V
   #833 = NameAndType        #831:#832    // executeParallel:(Ljava/lang/Runnable;)V
   #834 = Methodref          #398.#833    // ext/mods/commons/pool/ThreadPool.executeParallel:(Ljava/lang/Runnable;)V
   #835 = Utf8               loadNpcsSpawns
   #836 = Utf8               NPCs
   #837 = String             #836         // NPCs
   #838 = Utf8               suppressNpcSpawnLogs
   #839 = NameAndType        #838:#52     // suppressNpcSpawnLogs:(Z)V
   #840 = Methodref          #2.#839      // ext/mods/gameserver/GameServer.suppressNpcSpawnLogs:(Z)V
   #841 = Utf8               ext/mods/gameserver/data/manager/BufferManager
   #842 = Class              #841         // ext/mods/gameserver/data/manager/BufferManager
   #843 = Utf8               ()Lext/mods/gameserver/data/manager/BufferManager;
   #844 = NameAndType        #405:#843    // getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
   #845 = Methodref          #842.#844    // ext/mods/gameserver/data/manager/BufferManager.getInstance:()Lext/mods/gameserver/data/manager/BufferManager;
   #846 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #847 = Class              #846         // ext/mods/gameserver/data/xml/NpcData
   #848 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #849 = NameAndType        #405:#848    // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #850 = Methodref          #847.#849    // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #851 = Utf8               ext/mods/gameserver/data/xml/WalkerRouteData
   #852 = Class              #851         // ext/mods/gameserver/data/xml/WalkerRouteData
   #853 = Utf8               ()Lext/mods/gameserver/data/xml/WalkerRouteData;
   #854 = NameAndType        #405:#853    // getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
   #855 = Methodref          #852.#854    // ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
   #856 = Utf8               ext/mods/gameserver/data/xml/StaticObjectData
   #857 = Class              #856         // ext/mods/gameserver/data/xml/StaticObjectData
   #858 = Utf8               ()Lext/mods/gameserver/data/xml/StaticObjectData;
   #859 = NameAndType        #405:#858    // getInstance:()Lext/mods/gameserver/data/xml/StaticObjectData;
   #860 = Methodref          #857.#859    // ext/mods/gameserver/data/xml/StaticObjectData.getInstance:()Lext/mods/gameserver/data/xml/StaticObjectData;
   #861 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #862 = Class              #861         // ext/mods/gameserver/data/manager/SpawnManager
   #863 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #864 = NameAndType        #405:#863    // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #865 = Methodref          #862.#864    // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #866 = Utf8               ext/mods/gameserver/data/xml/NewbieBuffData
   #867 = Class              #866         // ext/mods/gameserver/data/xml/NewbieBuffData
   #868 = Utf8               ()Lext/mods/gameserver/data/xml/NewbieBuffData;
   #869 = NameAndType        #405:#868    // getInstance:()Lext/mods/gameserver/data/xml/NewbieBuffData;
   #870 = Methodref          #867.#869    // ext/mods/gameserver/data/xml/NewbieBuffData.getInstance:()Lext/mods/gameserver/data/xml/NewbieBuffData;
   #871 = Utf8               ext/mods/gameserver/data/xml/InstantTeleportData
   #872 = Class              #871         // ext/mods/gameserver/data/xml/InstantTeleportData
   #873 = Utf8               ()Lext/mods/gameserver/data/xml/InstantTeleportData;
   #874 = NameAndType        #405:#873    // getInstance:()Lext/mods/gameserver/data/xml/InstantTeleportData;
   #875 = Methodref          #872.#874    // ext/mods/gameserver/data/xml/InstantTeleportData.getInstance:()Lext/mods/gameserver/data/xml/InstantTeleportData;
   #876 = Utf8               ext/mods/gameserver/data/xml/TeleportData
   #877 = Class              #876         // ext/mods/gameserver/data/xml/TeleportData
   #878 = Utf8               ()Lext/mods/gameserver/data/xml/TeleportData;
   #879 = NameAndType        #405:#878    // getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
   #880 = Methodref          #877.#879    // ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
   #881 = Utf8               ext/mods/gameserver/data/xml/ObserverGroupData
   #882 = Class              #881         // ext/mods/gameserver/data/xml/ObserverGroupData
   #883 = Utf8               ()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #884 = NameAndType        #405:#883    // getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #885 = Methodref          #882.#884    // ext/mods/gameserver/data/xml/ObserverGroupData.getInstance:()Lext/mods/gameserver/data/xml/ObserverGroupData;
   #886 = Utf8               spawnEntities
   #887 = NameAndType        #886:#32     // spawnEntities:()V
   #888 = Methodref          #652.#887    // ext/mods/gameserver/data/manager/CastleManager.spawnEntities:()V
   #889 = Utf8               Spawns
   #890 = String             #889         // Spawns
   #891 = Utf8               PTS_EMULATION_SPAWN
   #892 = NameAndType        #891:#178    // PTS_EMULATION_SPAWN:Z
   #893 = Fieldref           #176.#892    // ext/mods/Config.PTS_EMULATION_SPAWN:Z
   #894 = Utf8               ext/mods/gameserver/GameServer$NpcSpawn
   #895 = Class              #894         // ext/mods/gameserver/GameServer$NpcSpawn
   #896 = NameAndType        #31:#824     // "<init>":(Lext/mods/gameserver/GameServer;)V
   #897 = Methodref          #895.#896    // ext/mods/gameserver/GameServer$NpcSpawn."<init>":(Lext/mods/gameserver/GameServer;)V
   #898 = Utf8               PTS_EMULATION_SPAWN_DURATION
   #899 = NameAndType        #898:#270    // PTS_EMULATION_SPAWN_DURATION:I
   #900 = Fieldref           #176.#899    // ext/mods/Config.PTS_EMULATION_SPAWN_DURATION:I
   #901 = Utf8               schedule
   #902 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #903 = NameAndType        #901:#902    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #904 = Methodref          #398.#903    // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #905 = Methodref          #862.#649    // ext/mods/gameserver/data/manager/SpawnManager.spawn:()V
   #906 = Utf8               loadNpcsSpawns$default
   #907 = NameAndType        #835:#52     // loadNpcsSpawns:(Z)V
   #908 = Methodref          #2.#907      // ext/mods/gameserver/GameServer.loadNpcsSpawns:(Z)V
   #909 = Utf8               loadOlympiadScripts
   #910 = Utf8               Olympiad & Scripts
   #911 = String             #910         // Olympiad & Scripts
   #912 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
   #913 = Class              #912         // ext/mods/gameserver/model/olympiad/OlympiadGameManager
   #914 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
   #915 = NameAndType        #405:#914    // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
   #916 = Methodref          #913.#915    // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
   #917 = Utf8               ext/mods/gameserver/model/olympiad/Olympiad
   #918 = Class              #917         // ext/mods/gameserver/model/olympiad/Olympiad
   #919 = Utf8               ()Lext/mods/gameserver/model/olympiad/Olympiad;
   #920 = NameAndType        #405:#919    // getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #921 = Methodref          #918.#920    // ext/mods/gameserver/model/olympiad/Olympiad.getInstance:()Lext/mods/gameserver/model/olympiad/Olympiad;
   #922 = Utf8               ext/mods/gameserver/data/manager/HeroManager
   #923 = Class              #922         // ext/mods/gameserver/data/manager/HeroManager
   #924 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
   #925 = NameAndType        #405:#924    // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #926 = Methodref          #923.#925    // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #927 = Utf8               ext/mods/gameserver/data/xml/ScriptData
   #928 = Class              #927         // ext/mods/gameserver/data/xml/ScriptData
   #929 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
   #930 = NameAndType        #405:#929    // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
   #931 = Methodref          #928.#930    // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
   #932 = Utf8               ALLOW_BOAT
   #933 = NameAndType        #932:#178    // ALLOW_BOAT:Z
   #934 = Fieldref           #176.#933    // ext/mods/Config.ALLOW_BOAT:Z
   #935 = Utf8               ext/mods/gameserver/data/xml/BoatData
   #936 = Class              #935         // ext/mods/gameserver/data/xml/BoatData
   #937 = Utf8               ()Lext/mods/gameserver/data/xml/BoatData;
   #938 = NameAndType        #405:#937    // getInstance:()Lext/mods/gameserver/data/xml/BoatData;
   #939 = Methodref          #936.#938    // ext/mods/gameserver/data/xml/BoatData.getInstance:()Lext/mods/gameserver/data/xml/BoatData;
   #940 = Methodref          #936.#418    // ext/mods/gameserver/data/xml/BoatData.load:()V
   #941 = Utf8               Community
   #942 = String             #941         // Community
   #943 = Utf8               ENABLE_CUSTOM_BBS
   #944 = NameAndType        #943:#178    // ENABLE_CUSTOM_BBS:Z
   #945 = Fieldref           #176.#944    // ext/mods/Config.ENABLE_CUSTOM_BBS:Z
   #946 = Utf8               ext/mods/gameserver/communitybbs/CustomCommunityBoard
   #947 = Class              #946         // ext/mods/gameserver/communitybbs/CustomCommunityBoard
   #948 = Utf8               ()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
   #949 = NameAndType        #405:#948    // getInstance:()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
   #950 = Methodref          #947.#949    // ext/mods/gameserver/communitybbs/CustomCommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
   #951 = Utf8               ENABLE_COMMUNITY_BOARD
   #952 = NameAndType        #951:#178    // ENABLE_COMMUNITY_BOARD:Z
   #953 = Fieldref           #176.#952    // ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
   #954 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #955 = Class              #954         // ext/mods/gameserver/communitybbs/CommunityBoard
   #956 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #957 = NameAndType        #405:#956    // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #958 = Methodref          #955.#957    // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #959 = Utf8               loadEvents
   #960 = Utf8               ext/mods/gameserver/data/manager/DerbyTrackManager
   #961 = Class              #960         // ext/mods/gameserver/data/manager/DerbyTrackManager
   #962 = Utf8               ()Lext/mods/gameserver/data/manager/DerbyTrackManager;
   #963 = NameAndType        #405:#962    // getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
   #964 = Methodref          #961.#963    // ext/mods/gameserver/data/manager/DerbyTrackManager.getInstance:()Lext/mods/gameserver/data/manager/DerbyTrackManager;
   #965 = Utf8               ext/mods/gameserver/data/manager/LotteryManager
   #966 = Class              #965         // ext/mods/gameserver/data/manager/LotteryManager
   #967 = Utf8               ()Lext/mods/gameserver/data/manager/LotteryManager;
   #968 = NameAndType        #405:#967    // getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
   #969 = Methodref          #966.#968    // ext/mods/gameserver/data/manager/LotteryManager.getInstance:()Lext/mods/gameserver/data/manager/LotteryManager;
   #970 = Utf8               ALLOW_FISH_CHAMPIONSHIP
   #971 = NameAndType        #970:#178    // ALLOW_FISH_CHAMPIONSHIP:Z
   #972 = Fieldref           #176.#971    // ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
   #973 = Utf8               ext/mods/gameserver/data/manager/FishingChampionshipManager
   #974 = Class              #973         // ext/mods/gameserver/data/manager/FishingChampionshipManager
   #975 = Utf8               ()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
   #976 = NameAndType        #405:#975    // getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
   #977 = Methodref          #974.#976    // ext/mods/gameserver/data/manager/FishingChampionshipManager.getInstance:()Lext/mods/gameserver/data/manager/FishingChampionshipManager;
   #978 = Utf8               loadCustomMods
   #979 = Utf8               customMods
   #980 = NameAndType        #979:#32     // customMods:()V
   #981 = Methodref          #210.#980    // ext/mods/gameserver/GameServer$Companion.customMods:()V
   #982 = Utf8               loadHandlers
   #983 = Utf8               LOGGER
   #984 = Utf8               Lext/mods/commons/logging/CLogger;
   #985 = NameAndType        #983:#984    // LOGGER:Lext/mods/commons/logging/CLogger;
   #986 = Fieldref           #2.#985      // ext/mods/gameserver/GameServer.LOGGER:Lext/mods/commons/logging/CLogger;
   #987 = Utf8               ext/mods/gameserver/handler/AdminCommandHandler
   #988 = Class              #987         // ext/mods/gameserver/handler/AdminCommandHandler
   #989 = Utf8               ()Lext/mods/gameserver/handler/AdminCommandHandler;
   #990 = NameAndType        #405:#989    // getInstance:()Lext/mods/gameserver/handler/AdminCommandHandler;
   #991 = Methodref          #988.#990    // ext/mods/gameserver/handler/AdminCommandHandler.getInstance:()Lext/mods/gameserver/handler/AdminCommandHandler;
   #992 = Utf8               size
   #993 = Utf8               ()I
   #994 = NameAndType        #992:#993    // size:()I
   #995 = Methodref          #988.#994    // ext/mods/gameserver/handler/AdminCommandHandler.size:()I
   #996 = Utf8               Loaded \u0001 admin handlers.
   #997 = String             #996         // Loaded \u0001 admin handlers.
   #998 = Utf8               java/lang/invoke/StringConcatFactory
   #999 = Class              #998         // java/lang/invoke/StringConcatFactory
  #1000 = Utf8               makeConcatWithConstants
  #1001 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1002 = NameAndType        #1000:#1001  // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1003 = Methodref          #999.#1002   // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1004 = MethodHandle       6:#1003      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1005 = Utf8               (I)Ljava/lang/String;
  #1006 = NameAndType        #1000:#1005  // makeConcatWithConstants:(I)Ljava/lang/String;
  #1007 = InvokeDynamic      #3:#1006     // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #1008 = Utf8               ext/mods/commons/logging/CLogger
  #1009 = Class              #1008        // ext/mods/commons/logging/CLogger
  #1010 = Utf8               info
  #1011 = NameAndType        #1010:#352   // info:(Ljava/lang/Object;)V
  #1012 = Methodref          #1009.#1011  // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #1013 = Utf8               ext/mods/gameserver/handler/BypassHandler
  #1014 = Class              #1013        // ext/mods/gameserver/handler/BypassHandler
  #1015 = Utf8               ()Lext/mods/gameserver/handler/BypassHandler;
  #1016 = NameAndType        #405:#1015   // getInstance:()Lext/mods/gameserver/handler/BypassHandler;
  #1017 = Methodref          #1014.#1016  // ext/mods/gameserver/handler/BypassHandler.getInstance:()Lext/mods/gameserver/handler/BypassHandler;
  #1018 = Methodref          #1014.#994   // ext/mods/gameserver/handler/BypassHandler.size:()I
  #1019 = Utf8               Loaded \u0001 bypass handlers.
  #1020 = String             #1019        // Loaded \u0001 bypass handlers.
  #1021 = InvokeDynamic      #4:#1006     // #4:makeConcatWithConstants:(I)Ljava/lang/String;
  #1022 = Utf8               ext/mods/gameserver/handler/ChatHandler
  #1023 = Class              #1022        // ext/mods/gameserver/handler/ChatHandler
  #1024 = Utf8               ()Lext/mods/gameserver/handler/ChatHandler;
  #1025 = NameAndType        #405:#1024   // getInstance:()Lext/mods/gameserver/handler/ChatHandler;
  #1026 = Methodref          #1023.#1025  // ext/mods/gameserver/handler/ChatHandler.getInstance:()Lext/mods/gameserver/handler/ChatHandler;
  #1027 = Methodref          #1023.#994   // ext/mods/gameserver/handler/ChatHandler.size:()I
  #1028 = Utf8               Loaded \u0001 chat handlers.
  #1029 = String             #1028        // Loaded \u0001 chat handlers.
  #1030 = InvokeDynamic      #5:#1006     // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #1031 = Utf8               ext/mods/gameserver/handler/ItemHandler
  #1032 = Class              #1031        // ext/mods/gameserver/handler/ItemHandler
  #1033 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
  #1034 = NameAndType        #405:#1033   // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #1035 = Methodref          #1032.#1034  // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #1036 = Methodref          #1032.#994   // ext/mods/gameserver/handler/ItemHandler.size:()I
  #1037 = Utf8               Loaded \u0001 item handlers.
  #1038 = String             #1037        // Loaded \u0001 item handlers.
  #1039 = InvokeDynamic      #6:#1006     // #6:makeConcatWithConstants:(I)Ljava/lang/String;
  #1040 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #1041 = Class              #1040        // ext/mods/gameserver/handler/SkillHandler
  #1042 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #1043 = NameAndType        #405:#1042   // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #1044 = Methodref          #1041.#1043  // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #1045 = Methodref          #1041.#994   // ext/mods/gameserver/handler/SkillHandler.size:()I
  #1046 = Utf8               Loaded \u0001 skill handlers.
  #1047 = String             #1046        // Loaded \u0001 skill handlers.
  #1048 = InvokeDynamic      #7:#1006     // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #1049 = Utf8               ext/mods/gameserver/handler/TargetHandler
  #1050 = Class              #1049        // ext/mods/gameserver/handler/TargetHandler
  #1051 = Utf8               ()Lext/mods/gameserver/handler/TargetHandler;
  #1052 = NameAndType        #405:#1051   // getInstance:()Lext/mods/gameserver/handler/TargetHandler;
  #1053 = Methodref          #1050.#1052  // ext/mods/gameserver/handler/TargetHandler.getInstance:()Lext/mods/gameserver/handler/TargetHandler;
  #1054 = Methodref          #1050.#994   // ext/mods/gameserver/handler/TargetHandler.size:()I
  #1055 = Utf8               Loaded \u0001 target handlers.
  #1056 = String             #1055        // Loaded \u0001 target handlers.
  #1057 = InvokeDynamic      #8:#1006     // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #1058 = Utf8               ext/mods/gameserver/handler/UserCommandHandler
  #1059 = Class              #1058        // ext/mods/gameserver/handler/UserCommandHandler
  #1060 = Utf8               ()Lext/mods/gameserver/handler/UserCommandHandler;
  #1061 = NameAndType        #405:#1060   // getInstance:()Lext/mods/gameserver/handler/UserCommandHandler;
  #1062 = Methodref          #1059.#1061  // ext/mods/gameserver/handler/UserCommandHandler.getInstance:()Lext/mods/gameserver/handler/UserCommandHandler;
  #1063 = Methodref          #1059.#994   // ext/mods/gameserver/handler/UserCommandHandler.size:()I
  #1064 = Utf8               Loaded \u0001 user handlers.
  #1065 = String             #1064        // Loaded \u0001 user handlers.
  #1066 = InvokeDynamic      #9:#1006     // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #1067 = Utf8               ext/mods/gameserver/handler/VoicedCommandHandler
  #1068 = Class              #1067        // ext/mods/gameserver/handler/VoicedCommandHandler
  #1069 = Utf8               ()Lext/mods/gameserver/handler/VoicedCommandHandler;
  #1070 = NameAndType        #405:#1069   // getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
  #1071 = Methodref          #1068.#1070  // ext/mods/gameserver/handler/VoicedCommandHandler.getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
  #1072 = Methodref          #1068.#994   // ext/mods/gameserver/handler/VoicedCommandHandler.size:()I
  #1073 = Utf8               Loaded \u0001 voiced handlers.
  #1074 = String             #1073        // Loaded \u0001 voiced handlers.
  #1075 = InvokeDynamic      #10:#1006    // #10:makeConcatWithConstants:(I)Ljava/lang/String;
  #1076 = Utf8               scheduleDeferredNpcsSpawns$lambda$0
  #1077 = NameAndType        #1076:#824   // scheduleDeferredNpcsSpawns$lambda$0:(Lext/mods/gameserver/GameServer;)V
  #1078 = Methodref          #2.#1077     // ext/mods/gameserver/GameServer.scheduleDeferredNpcsSpawns$lambda$0:(Lext/mods/gameserver/GameServer;)V
  #1079 = MethodHandle       6:#1078      // REF_invokeStatic ext/mods/gameserver/GameServer.scheduleDeferredNpcsSpawns$lambda$0:(Lext/mods/gameserver/GameServer;)V
  #1080 = InvokeDynamic      #11:#829     // #11:run:(Lext/mods/gameserver/GameServer;)Ljava/lang/Runnable;
  #1081 = Utf8               awaitNpcsSpawnsReady
  #1082 = NameAndType        #810:#202    // get:()Z
  #1083 = Methodref          #51.#1082    // java/util/concurrent/atomic/AtomicBoolean.get:()Z
  #1084 = Long               120l
  #1086 = Utf8               java/util/concurrent/TimeUnit
  #1087 = Class              #1086        // java/util/concurrent/TimeUnit
  #1088 = Utf8               SECONDS
  #1089 = Utf8               Ljava/util/concurrent/TimeUnit;
  #1090 = NameAndType        #1088:#1089  // SECONDS:Ljava/util/concurrent/TimeUnit;
  #1091 = Fieldref           #1087.#1090  // java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
  #1092 = Utf8               await
  #1093 = Utf8               (JLjava/util/concurrent/TimeUnit;)Z
  #1094 = NameAndType        #1092:#1093  // await:(JLjava/util/concurrent/TimeUnit;)Z
  #1095 = Methodref          #42.#1094    // java/util/concurrent/CountDownLatch.await:(JLjava/util/concurrent/TimeUnit;)Z
  #1096 = Utf8               Server crashed on last session!
  #1097 = String             #1096        // Server crashed on last session!
  #1098 = Utf8               set
  #1099 = Utf8               (Ljava/lang/String;Z)V
  #1100 = NameAndType        #1098:#1099  // set:(Ljava/lang/String;Z)V
  #1101 = Methodref          #442.#1100   // ext/mods/gameserver/data/sql/ServerMemoTable.set:(Ljava/lang/String;Z)V
  #1102 = Utf8               Gameserver used memory: {} / {} Mo.
  #1103 = String             #1102        // Gameserver used memory: {} / {} Mo.
  #1104 = Utf8               ext/mods/commons/util/SysUtil
  #1105 = Class              #1104        // ext/mods/commons/util/SysUtil
  #1106 = Utf8               getUsedMemory
  #1107 = NameAndType        #1106:#18    // getUsedMemory:()J
  #1108 = Methodref          #1105.#1107  // ext/mods/commons/util/SysUtil.getUsedMemory:()J
  #1109 = Utf8               java/lang/Long
  #1110 = Class              #1109        // java/lang/Long
  #1111 = Utf8               valueOf
  #1112 = Utf8               (J)Ljava/lang/Long;
  #1113 = NameAndType        #1111:#1112  // valueOf:(J)Ljava/lang/Long;
  #1114 = Methodref          #1110.#1113  // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #1115 = Utf8               getMaxMemory
  #1116 = NameAndType        #1115:#18    // getMaxMemory:()J
  #1117 = Methodref          #1105.#1116  // ext/mods/commons/util/SysUtil.getMaxMemory:()J
  #1118 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #1119 = NameAndType        #1010:#1118  // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #1120 = Methodref          #1009.#1119  // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #1121 = Utf8               Maximum allowed players: {}.
  #1122 = String             #1121        // Maximum allowed players: {}.
  #1123 = Utf8               MAXIMUM_ONLINE_USERS
  #1124 = NameAndType        #1123:#270   // MAXIMUM_ONLINE_USERS:I
  #1125 = Fieldref           #176.#1124   // ext/mods/Config.MAXIMUM_ONLINE_USERS:I
  #1126 = Utf8               java/lang/Integer
  #1127 = Class              #1126        // java/lang/Integer
  #1128 = Utf8               (I)Ljava/lang/Integer;
  #1129 = NameAndType        #1111:#1128  // valueOf:(I)Ljava/lang/Integer;
  #1130 = Methodref          #1127.#1129  // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #1131 = Utf8               Login
  #1132 = String             #1131        // Login
  #1133 = Utf8               ext/mods/gameserver/LoginServerThread
  #1134 = Class              #1133        // ext/mods/gameserver/LoginServerThread
  #1135 = Utf8               Lext/mods/gameserver/LoginServerThread$Companion;
  #1136 = NameAndType        #205:#1135   // Companion:Lext/mods/gameserver/LoginServerThread$Companion;
  #1137 = Fieldref           #1134.#1136  // ext/mods/gameserver/LoginServerThread.Companion:Lext/mods/gameserver/LoginServerThread$Companion;
  #1138 = Utf8               ext/mods/gameserver/LoginServerThread$Companion
  #1139 = Class              #1138        // ext/mods/gameserver/LoginServerThread$Companion
  #1140 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #1141 = NameAndType        #405:#1140   // getInstance:()Lext/mods/gameserver/LoginServerThread;
  #1142 = Methodref          #1139.#1141  // ext/mods/gameserver/LoginServerThread$Companion.getInstance:()Lext/mods/gameserver/LoginServerThread;
  #1143 = Utf8               start
  #1144 = NameAndType        #1143:#32    // start:()V
  #1145 = Methodref          #1134.#1144  // ext/mods/gameserver/LoginServerThread.start:()V
  #1146 = Utf8               ext/mods/commons/mmocore/SelectorConfig
  #1147 = Class              #1146        // ext/mods/commons/mmocore/SelectorConfig
  #1148 = Methodref          #1147.#39    // ext/mods/commons/mmocore/SelectorConfig."<init>":()V
  #1149 = Utf8               MMO_MAX_READ_PER_PASS
  #1150 = NameAndType        #1149:#270   // MMO_MAX_READ_PER_PASS:I
  #1151 = Fieldref           #176.#1150   // ext/mods/Config.MMO_MAX_READ_PER_PASS:I
  #1152 = Utf8               MAX_READ_PER_PASS
  #1153 = NameAndType        #1152:#270   // MAX_READ_PER_PASS:I
  #1154 = Fieldref           #1147.#1153  // ext/mods/commons/mmocore/SelectorConfig.MAX_READ_PER_PASS:I
  #1155 = Utf8               MMO_MAX_SEND_PER_PASS
  #1156 = NameAndType        #1155:#270   // MMO_MAX_SEND_PER_PASS:I
  #1157 = Fieldref           #176.#1156   // ext/mods/Config.MMO_MAX_SEND_PER_PASS:I
  #1158 = Utf8               MAX_SEND_PER_PASS
  #1159 = NameAndType        #1158:#270   // MAX_SEND_PER_PASS:I
  #1160 = Fieldref           #1147.#1159  // ext/mods/commons/mmocore/SelectorConfig.MAX_SEND_PER_PASS:I
  #1161 = Utf8               MMO_SELECTOR_SLEEP_TIME
  #1162 = NameAndType        #1161:#270   // MMO_SELECTOR_SLEEP_TIME:I
  #1163 = Fieldref           #176.#1162   // ext/mods/Config.MMO_SELECTOR_SLEEP_TIME:I
  #1164 = Utf8               SLEEP_TIME
  #1165 = NameAndType        #1164:#270   // SLEEP_TIME:I
  #1166 = Fieldref           #1147.#1165  // ext/mods/commons/mmocore/SelectorConfig.SLEEP_TIME:I
  #1167 = Utf8               MMO_HELPER_BUFFER_COUNT
  #1168 = NameAndType        #1167:#270   // MMO_HELPER_BUFFER_COUNT:I
  #1169 = Fieldref           #176.#1168   // ext/mods/Config.MMO_HELPER_BUFFER_COUNT:I
  #1170 = Utf8               HELPER_BUFFER_COUNT
  #1171 = NameAndType        #1170:#270   // HELPER_BUFFER_COUNT:I
  #1172 = Fieldref           #1147.#1171  // ext/mods/commons/mmocore/SelectorConfig.HELPER_BUFFER_COUNT:I
  #1173 = Utf8               ext/mods/gameserver/network/GamePacketHandler
  #1174 = Class              #1173        // ext/mods/gameserver/network/GamePacketHandler
  #1175 = Methodref          #1174.#39    // ext/mods/gameserver/network/GamePacketHandler."<init>":()V
  #1176 = Utf8               ext/mods/commons/mmocore/SelectorThread
  #1177 = Class              #1176        // ext/mods/commons/mmocore/SelectorThread
  #1178 = Utf8               ext/mods/commons/mmocore/IMMOExecutor
  #1179 = Class              #1178        // ext/mods/commons/mmocore/IMMOExecutor
  #1180 = Utf8               ext/mods/commons/mmocore/IPacketHandler
  #1181 = Class              #1180        // ext/mods/commons/mmocore/IPacketHandler
  #1182 = Utf8               ext/mods/commons/mmocore/IClientFactory
  #1183 = Class              #1182        // ext/mods/commons/mmocore/IClientFactory
  #1184 = Utf8               ext/mods/commons/network/IPv4Filter
  #1185 = Class              #1184        // ext/mods/commons/network/IPv4Filter
  #1186 = Methodref          #1185.#39    // ext/mods/commons/network/IPv4Filter."<init>":()V
  #1187 = Utf8               ext/mods/commons/mmocore/IAcceptFilter
  #1188 = Class              #1187        // ext/mods/commons/mmocore/IAcceptFilter
  #1189 = Utf8               (Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor;Lext/mods/commons/mmocore/IPacketHandler;Lext/mods/commons/mmocore/IClientFactory;Lext/mods/commons/mmocore/IAcceptFilter;)V
  #1190 = NameAndType        #31:#1189    // "<init>":(Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor;Lext/mods/commons/mmocore/IPacketHandler;Lext/mods/commons/mmocore/IClientFactory;Lext/mods/commons/mmocore/IAcceptFilter;)V
  #1191 = Methodref          #1177.#1190  // ext/mods/commons/mmocore/SelectorThread."<init>":(Lext/mods/commons/mmocore/SelectorConfig;Lext/mods/commons/mmocore/IMMOExecutor;Lext/mods/commons/mmocore/IPacketHandler;Lext/mods/commons/mmocore/IClientFactory;Lext/mods/commons/mmocore/IAcceptFilter;)V
  #1192 = Utf8               GAMESERVER_HOSTNAME
  #1193 = NameAndType        #1192:#171   // GAMESERVER_HOSTNAME:Ljava/lang/String;
  #1194 = Fieldref           #176.#1193   // ext/mods/Config.GAMESERVER_HOSTNAME:Ljava/lang/String;
  #1195 = Utf8               *
  #1196 = String             #1195        // *
  #1197 = Utf8               areEqual
  #1198 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #1199 = NameAndType        #1197:#1198  // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #1200 = Methodref          #150.#1199   // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #1201 = Utf8               java/net/InetAddress
  #1202 = Class              #1201        // java/net/InetAddress
  #1203 = Utf8               getByName
  #1204 = Utf8               (Ljava/lang/String;)Ljava/net/InetAddress;
  #1205 = NameAndType        #1203:#1204  // getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
  #1206 = Methodref          #1202.#1205  // java/net/InetAddress.getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
  #1207 = Utf8               The GameServer bind address is invalid, using all available IPs.
  #1208 = String             #1207        // The GameServer bind address is invalid, using all available IPs.
  #1209 = Utf8               error
  #1210 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #1211 = NameAndType        #1209:#1210  // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #1212 = Methodref          #1009.#1211  // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #1213 = Utf8               GAMESERVER_PORT
  #1214 = NameAndType        #1213:#270   // GAMESERVER_PORT:I
  #1215 = Fieldref           #176.#1214   // ext/mods/Config.GAMESERVER_PORT:I
  #1216 = Utf8               openServerSocket
  #1217 = Utf8               (Ljava/net/InetAddress;I)V
  #1218 = NameAndType        #1216:#1217  // openServerSocket:(Ljava/net/InetAddress;I)V
  #1219 = Methodref          #1177.#1218  // ext/mods/commons/mmocore/SelectorThread.openServerSocket:(Ljava/net/InetAddress;I)V
  #1220 = Utf8               Failed to open server socket.
  #1221 = String             #1220        // Failed to open server socket.
  #1222 = Methodref          #1177.#1144  // ext/mods/commons/mmocore/SelectorThread.start:()V
  #1223 = Utf8               e
  #1224 = Utf8               Ljava/lang/Exception;
  #1225 = Utf8               sc
  #1226 = Utf8               Lext/mods/commons/mmocore/SelectorConfig;
  #1227 = Utf8               handler
  #1228 = Utf8               Lext/mods/gameserver/network/GamePacketHandler;
  #1229 = Utf8               bindAddress
  #1230 = Utf8               Ljava/net/InetAddress;
  #1231 = Utf8               configureLogging$lambda$0$0$0
  #1232 = Utf8               .pattern
  #1233 = String             #1232        // .pattern
  #1234 = Utf8               endsWith$default
  #1235 = Utf8               (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
  #1236 = NameAndType        #1234:#1235  // endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
  #1237 = Methodref          #160.#1236   // kotlin/text/StringsKt.endsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
  #1238 = Utf8
  #1239 = String             #1238        //
  #1240 = Utf8               toString
  #1241 = NameAndType        #1240:#238   // toString:()Ljava/lang/String;
  #1242 = Methodref          #4.#1241     // java/lang/Object.toString:()Ljava/lang/String;
  #1243 = Utf8               v
  #1244 = Utf8               $key
  #1245 = Utf8               newValue
  #1246 = MethodType         #797         //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1247 = NameAndType        #1231:#248   // configureLogging$lambda$0$0$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1248 = Methodref          #2.#1247     // ext/mods/gameserver/GameServer.configureLogging$lambda$0$0$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1249 = MethodHandle       6:#1248      // REF_invokeStatic ext/mods/gameserver/GameServer.configureLogging$lambda$0$0$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1250 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1251 = MethodType         #1250        //  (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1252 = NameAndType        #312:#300    // apply:(Ljava/lang/String;)Ljava/util/function/BiFunction;
  #1253 = InvokeDynamic      #12:#1252    // #12:apply:(Ljava/lang/String;)Ljava/util/function/BiFunction;
  #1254 = Utf8               key
  #1255 = Utf8               resetDailyCounters
  #1256 = NameAndType        #1255:#32    // resetDailyCounters:()V
  #1257 = Methodref          #487.#1256   // ext/mods/summonmobitem/SummonMobItemData.resetDailyCounters:()V
  #1258 = Utf8               getMessage
  #1259 = NameAndType        #1258:#238   // getMessage:()Ljava/lang/String;
  #1260 = Methodref          #276.#1259   // java/lang/Exception.getMessage:()Ljava/lang/String;
  #1261 = Utf8               Failed to reset daily summon item counters: \u0001
  #1262 = String             #1261        // Failed to reset daily summon item counters: \u0001
  #1263 = NameAndType        #1000:#134   // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1264 = InvokeDynamic      #13:#1263    // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1265 = NameAndType        #1209:#352   // error:(Ljava/lang/Object;)V
  #1266 = Methodref          #1009.#1265  // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
  #1267 = NameAndType        #1098:#52    // set:(Z)V
  #1268 = Methodref          #51.#1267    // java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
  #1269 = Utf8               countDown
  #1270 = NameAndType        #1269:#32    // countDown:()V
  #1271 = Methodref          #42.#1270    // java/util/concurrent/CountDownLatch.countDown:()V
  #1272 = Utf8               ext/mods/gameserver/LoadMetricsService
  #1273 = Class              #1272        // ext/mods/gameserver/LoadMetricsService
  #1274 = Utf8               Lext/mods/gameserver/LoadMetricsService;
  #1275 = NameAndType        #322:#1274   // INSTANCE:Lext/mods/gameserver/LoadMetricsService;
  #1276 = Fieldref           #1273.#1275  // ext/mods/gameserver/LoadMetricsService.INSTANCE:Lext/mods/gameserver/LoadMetricsService;
  #1277 = Utf8               Doors & Castles & Tasks (deferred)
  #1278 = String             #1277        // Doors & Castles & Tasks (deferred)
  #1279 = Utf8               record
  #1280 = Utf8               (Ljava/lang/String;J)V
  #1281 = NameAndType        #1279:#1280  // record:(Ljava/lang/String;J)V
  #1282 = Methodref          #1273.#1281  // ext/mods/gameserver/LoadMetricsService.record:(Ljava/lang/String;J)V
  #1283 = Utf8               Erro ao carregar Doors & Castles & Tasks em background
  #1284 = String             #1283        // Erro ao carregar Doors & Castles & Tasks em background
  #1285 = Utf8               $i$a$-measureTimeMillis-GameServer$scheduleDeferredDoorsCastlesTasks$1$ms$1
  #1286 = Utf8               $i$f$measureTimeMillis
  #1287 = Utf8               start$iv
  #1288 = Utf8               ms
  #1289 = Utf8               this$0
  #1290 = Utf8               NPCs & Spawns (deferred)
  #1291 = String             #1290        // NPCs & Spawns (deferred)
  #1292 = Utf8               Erro ao carregar NPCs/Spawns em background
  #1293 = String             #1292        // Erro ao carregar NPCs/Spawns em background
  #1294 = Utf8               $i$a$-measureTimeMillis-GameServer$scheduleDeferredNpcsSpawns$1$ms$1
  #1295 = Utf8               ()Lext/mods/gameserver/GameServer;
  #1296 = NameAndType        #405:#1295   // getInstance:()Lext/mods/gameserver/GameServer;
  #1297 = Methodref          #210.#1296   // ext/mods/gameserver/GameServer$Companion.getInstance:()Lext/mods/gameserver/GameServer;
  #1298 = Utf8               main
  #1299 = Utf8               Lkotlin/jvm/JvmStatic;
  #1300 = NameAndType        #1298:#35    // main:([Ljava/lang/String;)V
  #1301 = Methodref          #210.#1300   // ext/mods/gameserver/GameServer$Companion.main:([Ljava/lang/String;)V
  #1302 = Utf8               access$getInstance$cp
  #1303 = Utf8               access$getLOGGER$cp
  #1304 = Utf8               ()Lext/mods/commons/logging/CLogger;
  #1305 = Utf8               access$loadParallel
  #1306 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #1307 = NameAndType        #359:#360    // loadParallel:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #1308 = Methodref          #2.#1307     // ext/mods/gameserver/GameServer.loadParallel:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #1309 = Utf8               $this
  #1310 = Utf8               access$loadConfigAndPools
  #1311 = NameAndType        #379:#32     // loadConfigAndPools:()V
  #1312 = Methodref          #2.#1311     // ext/mods/gameserver/GameServer.loadConfigAndPools:()V
  #1313 = Utf8               access$loadWorldAndCache
  #1314 = NameAndType        #409:#32     // loadWorldAndCache:()V
  #1315 = Methodref          #2.#1314     // ext/mods/gameserver/GameServer.loadWorldAndCache:()V
  #1316 = Utf8               access$loadIdFactory
  #1317 = NameAndType        #400:#32     // loadIdFactory:()V
  #1318 = Methodref          #2.#1317     // ext/mods/gameserver/GameServer.loadIdFactory:()V
  #1319 = Utf8               access$loadSkills
  #1320 = NameAndType        #460:#32     // loadSkills:()V
  #1321 = Methodref          #2.#1320     // ext/mods/gameserver/GameServer.loadSkills:()V
  #1322 = Utf8               access$loadItemsMassive
  #1323 = NameAndType        #473:#32     // loadItemsMassive:()V
  #1324 = Methodref          #2.#1323     // ext/mods/gameserver/GameServer.loadItemsMassive:()V
  #1325 = Utf8               access$loadAdminsCharacters
  #1326 = NameAndType        #546:#32     // loadAdminsCharacters:()V
  #1327 = Methodref          #2.#1326     // ext/mods/gameserver/GameServer.loadAdminsCharacters:()V
  #1328 = Utf8               access$loadGeoAndZones
  #1329 = NameAndType        #606:#32     // loadGeoAndZones:()V
  #1330 = Methodref          #2.#1329     // ext/mods/gameserver/GameServer.loadGeoAndZones:()V
  #1331 = Utf8               access$loadOlympiadScripts
  #1332 = NameAndType        #909:#32     // loadOlympiadScripts:()V
  #1333 = Methodref          #2.#1332     // ext/mods/gameserver/GameServer.loadOlympiadScripts:()V
  #1334 = Utf8               access$loadEvents
  #1335 = NameAndType        #959:#32     // loadEvents:()V
  #1336 = Methodref          #2.#1335     // ext/mods/gameserver/GameServer.loadEvents:()V
  #1337 = Utf8               access$loadCustomMods
  #1338 = NameAndType        #978:#32     // loadCustomMods:()V
  #1339 = Methodref          #2.#1338     // ext/mods/gameserver/GameServer.loadCustomMods:()V
  #1340 = Utf8               access$loadHandlers
  #1341 = NameAndType        #982:#32     // loadHandlers:()V
  #1342 = Methodref          #2.#1341     // ext/mods/gameserver/GameServer.loadHandlers:()V
  #1343 = Utf8               <clinit>
  #1344 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1345 = NameAndType        #31:#1344    // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1346 = Methodref          #210.#1345   // ext/mods/gameserver/GameServer$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1347 = Utf8               java/lang/Class
  #1348 = Class              #1347        // java/lang/Class
  #1349 = Utf8               getName
  #1350 = NameAndType        #1349:#238   // getName:()Ljava/lang/String;
  #1351 = Methodref          #1348.#1350  // java/lang/Class.getName:()Ljava/lang/String;
  #1352 = NameAndType        #31:#224     // "<init>":(Ljava/lang/String;)V
  #1353 = Methodref          #1009.#1352  // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1354 = Utf8               Lext/mods/commons/mmocore/SelectorThread<Lext/mods/gameserver/network/GameClient;>;
  #1355 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #1356 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/logging/Level;>;
  #1357 = Utf8               Lkotlin/Metadata;
  #1358 = Utf8               mv
  #1359 = Integer            2
  #1360 = Integer            3
  #1361 = Integer            0
  #1362 = Utf8               k
  #1363 = Integer            1
  #1364 = Utf8               xi
  #1365 = Integer            48
  #1366 = Utf8               d1
  #1367 = Utf8               \u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 C2\u00020\u0001:\u0002CDB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0002\u0010\u0007J\u0006\u0010\u001e\u001a\u00020\u0017J\u001b\u0010\u001f\u001a\u00020 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u000e\u0010#\u001a\u00020 H\u0082@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010\'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\u0012\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u000fH\u0002J\b\u00105\u001a\u00020 H\u0002J\u0012\u00106\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020\u000fH\u0002J\u0010\u00109\u001a\u00020 2\u0006\u00104\u001a\u00020\u000fH\u0002J\b\u0010:\u001a\u00020 H\u0002J\b\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020 H\u0002J\b\u0010=\u001a\u00020 H\u0002J\b\u0010>\u001a\u00020 H\u0002J\u0006\u0010?\u001a\u00020 J\b\u0010@\u001a\u00020 H\u0002J\b\u0010A\u001a\u00020 H\u0016J\u0006\u0010B\u001a\u00020 R.\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E
  #1368 = Utf8               d2
  #1369 = Utf8               Ljava/lang/Runnable;
  #1370 = Utf8               value
  #1371 = Utf8               Lext/mods/gameserver/network/GameClient;
  #1372 = Utf8               NpcSpawn
  #1373 = Utf8               Brproject
  #1374 = Utf8               GameServer.kt
  #1375 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #1376 = Utf8               SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,703:1\n1#2:704\n29#3,3:705\n29#3,3:708\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer\n*L\n554#1:705,3\n643#1:708,3\n*E\n
  #1377 = Utf8               RuntimeInvisibleAnnotations
  #1378 = Utf8               Signature
  #1379 = Utf8               Code
  #1380 = Utf8               LineNumberTable
  #1381 = Utf8               LocalVariableTable
  #1382 = Utf8               StackMapTable
  #1383 = Utf8               RuntimeInvisibleParameterAnnotations
  #1384 = Utf8               RuntimeVisibleAnnotations
  #1385 = Utf8               InnerClasses
  #1386 = Utf8               SourceFile
  #1387 = Utf8               SourceDebugExtension
  #1388 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.GameServer$Companion Companion;
    descriptor: Lext/mods/gameserver/GameServer$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #38()
        org.jetbrains.annotations.NotNull

  public final ext.mods.commons.mmocore.SelectorThread<ext.mods.gameserver.network.GameClient> getSelectorThread();
    descriptor: ()Lext/mods/commons/mmocore/SelectorThread;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field selectorThread:Lext/mods/commons/mmocore/SelectorThread;
         4: areturn
      LineNumberTable:
        line 206: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/GameServer;
    Signature: #9                           // ()Lext/mods/commons/mmocore/SelectorThread<Lext/mods/gameserver/network/GameClient;>;
    RuntimeInvisibleAnnotations:
      0: #10()
        org.jetbrains.annotations.Nullable

  public final long getServerLoadStart();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field serverLoadStart:J
         4: lreturn
      LineNumberTable:
        line 215: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/GameServer;

  public final void setServerLoadStart(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #22                 // Field serverLoadStart:J
         5: return
      LineNumberTable:
        line 215: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/GameServer;
            0       6     1 <set-?>   J

  public final long getServerStartTimeMillis();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field serverStartTimeMillis:J
         4: lreturn
      LineNumberTable:
        line 216: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/GameServer;

  public final long getServerStartTime();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field serverStartTimeMillis:J
         4: lreturn
      LineNumberTable:
        line 218: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/GameServer;

  public ext.mods.gameserver.GameServer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: anewarray     #34                 // class java/lang/String
         5: invokespecial #37                 // Method "<init>":([Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 337: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/GameServer;

  public ext.mods.gameserver.GameServer(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokespecial #40                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #42                 // class java/util/concurrent/CountDownLatch
         8: dup
         9: iconst_1
        10: invokespecial #45                 // Method java/util/concurrent/CountDownLatch."<init>":(I)V
        13: putfield      #49                 // Field doorsCastlesTasksLatch:Ljava/util/concurrent/CountDownLatch;
        16: aload_0
        17: new           #51                 // class java/util/concurrent/atomic/AtomicBoolean
        20: dup
        21: iconst_0
        22: invokespecial #54                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
        25: putfield      #58                 // Field doorsCastlesTasksReady:Ljava/util/concurrent/atomic/AtomicBoolean;
        28: aload_0
        29: new           #42                 // class java/util/concurrent/CountDownLatch
        32: dup
        33: iconst_1
        34: invokespecial #45                 // Method java/util/concurrent/CountDownLatch."<init>":(I)V
        37: putfield      #61                 // Field npcsSpawnsLatch:Ljava/util/concurrent/CountDownLatch;
        40: aload_0
        41: new           #51                 // class java/util/concurrent/atomic/AtomicBoolean
        44: dup
        45: iconst_0
        46: invokespecial #54                 // Method java/util/concurrent/atomic/AtomicBoolean."<init>":(Z)V
        49: putfield      #64                 // Field npcsAndSpawnsReady:Ljava/util/concurrent/atomic/AtomicBoolean;
        52: aload_0
        53: invokestatic  #69                 // Method java/lang/System.currentTimeMillis:()J
        56: putfield      #22                 // Field serverLoadStart:J
        59: aload_0
        60: iconst_4
        61: anewarray     #34                 // class java/lang/String
        64: astore_2
        65: aload_2
        66: iconst_0
        67: ldc           #71                 // String ext.mods.commons.data.xml.IXmlReader
        69: aastore
        70: aload_2
        71: iconst_1
        72: ldc           #73                 // String ext.mods.commons.lang.StringUtil
        74: aastore
        75: aload_2
        76: iconst_2
        77: ldc           #75                 // String ext.mods.gameserver.data.manager.SevenSignsManager
        79: aastore
        80: aload_2
        81: iconst_3
        82: ldc           #77                 // String ext.mods.gameserver.data.manager.FestivalOfDarknessManager
        84: aastore
        85: aload_2
        86: invokestatic  #83                 // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        89: putfield      #87                 // Field DOORS_CASTLES_LOGGER_NAMES:Ljava/util/List;
        92: aload_0
        93: new           #89                 // class java/util/LinkedHashMap
        96: dup
        97: invokespecial #90                 // Method java/util/LinkedHashMap."<init>":()V
       100: checkcast     #92                 // class java/util/Map
       103: putfield      #96                 // Field _suppressedDoorsLoggerLevels:Ljava/util/Map;
       106: aload_0
       107: iconst_2
       108: anewarray     #34                 // class java/lang/String
       111: astore_2
       112: aload_2
       113: iconst_0
       114: ldc           #71                 // String ext.mods.commons.data.xml.IXmlReader
       116: aastore
       117: aload_2
       118: iconst_1
       119: ldc           #73                 // String ext.mods.commons.lang.StringUtil
       121: aastore
       122: aload_2
       123: invokestatic  #83                 // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
       126: putfield      #99                 // Field NPC_SPAWN_LOGGER_NAMES:Ljava/util/List;
       129: aload_0
       130: new           #89                 // class java/util/LinkedHashMap
       133: dup
       134: invokespecial #90                 // Method java/util/LinkedHashMap."<init>":()V
       137: checkcast     #92                 // class java/util/Map
       140: putfield      #102                // Field _suppressedLoggerLevels:Ljava/util/Map;
       143: aload_0
       144: putstatic     #105                // Field instance:Lext/mods/gameserver/GameServer;
       147: aload_0
       148: aload_1
       149: invokespecial #108                // Method setupEnvironment:([Ljava/lang/String;)V
       152: aconst_null
       153: new           #110                // class ext/mods/gameserver/GameServer$1
       156: dup
       157: aload_0
       158: aconst_null
       159: invokespecial #113                // Method ext/mods/gameserver/GameServer$1."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
       162: checkcast     #115                // class kotlin/jvm/functions/Function2
       165: iconst_1
       166: aconst_null
       167: invokestatic  #121                // Method kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
       170: pop
       171: aload_0
       172: invokespecial #124                // Method startNetwork:()V
       175: aload_0
       176: invokespecial #127                // Method scheduleDeferredDoorsCastlesTasks:()V
       179: aload_0
       180: invokespecial #130                // Method scheduleDeferredNpcsSpawns:()V
       183: ldc           #132                // String os.name
       185: invokestatic  #136                // Method java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
       188: getstatic     #142                // Field java/util/Locale.ROOT:Ljava/util/Locale;
       191: invokevirtual #146                // Method java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
       194: dup
       195: ldc           #148                // String toLowerCase(...)
       197: invokestatic  #154                // Method kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
       200: astore_2
       201: aload_2
       202: checkcast     #156                // class java/lang/CharSequence
       205: ldc           #158                // String win
       207: checkcast     #156                // class java/lang/CharSequence
       210: iconst_0
       211: iconst_2
       212: aconst_null
       213: invokestatic  #164                // Method kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
       216: ifne          237
       219: aload_2
       220: checkcast     #156                // class java/lang/CharSequence
       223: ldc           #166                // String mac
       225: checkcast     #156                // class java/lang/CharSequence
       228: iconst_0
       229: iconst_2
       230: aconst_null
       231: invokestatic  #164                // Method kotlin/text/StringsKt.contains$default:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
       234: ifeq          241
       237: aload_0
       238: invokevirtual #169                // Method playServerLoadedSound:()V
       241: return
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 237
          locals = [ class ext/mods/gameserver/GameServer, class "[Ljava/lang/String;", class java/lang/String ]
          stack = []
        frame_type = 3 /* same */
      LineNumberTable:
        line 338: 0
        line 210: 4
        line 211: 16
        line 213: 28
        line 214: 40
        line 215: 52
        line 531: 59
        line 532: 60
        line 533: 72
        line 532: 75
        line 534: 77
        line 532: 80
        line 535: 82
        line 532: 85
        line 531: 86
        line 537: 92
        line 537: 103
        line 591: 106
        line 592: 107
        line 593: 119
        line 592: 122
        line 591: 123
        line 595: 129
        line 595: 140
        line 339: 143
        line 340: 147
        line 341: 152
        line 344: 171
        line 345: 175
        line 346: 179
        line 347: 183
        line 347: 200
        line 348: 201
        line 349: 237
        line 351: 241
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          201      41     2    os   Ljava/lang/String;
            0     242     0  this   Lext/mods/gameserver/GameServer;
            0     242     1  args   [Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #38()
          org.jetbrains.annotations.NotNull

  static void loadDoorsCastlesTasks$default(ext.mods.gameserver.GameServer, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/GameServer;ZILjava/lang/Object;)V
    flags: (0x1008) ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          8
         6: iconst_0
         7: istore_1
         8: aload_0
         9: iload_1
        10: invokespecial #771                // Method loadDoorsCastlesTasks:(Z)V
        13: return
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
      LineNumberTable:
        line 495: 0

  static void loadNpcsSpawns$default(ext.mods.gameserver.GameServer, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/GameServer;ZILjava/lang/Object;)V
    flags: (0x1008) ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          8
         6: iconst_0
         7: istore_1
         8: aload_0
         9: iload_1
        10: invokespecial #908                // Method loadNpcsSpawns:(Z)V
        13: return
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */
      LineNumberTable:
        line 565: 0

  public final void awaitNpcsSpawnsReady();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #64                 // Field npcsAndSpawnsReady:Ljava/util/concurrent/atomic/AtomicBoolean;
         4: invokevirtual #1083               // Method java/util/concurrent/atomic/AtomicBoolean.get:()Z
         7: ifne          24
        10: aload_0
        11: getfield      #61                 // Field npcsSpawnsLatch:Ljava/util/concurrent/CountDownLatch;
        14: ldc2_w        #1084               // long 120l
        17: getstatic     #1091               // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        20: invokevirtual #1095               // Method java/util/concurrent/CountDownLatch.await:(JLjava/util/concurrent/TimeUnit;)Z
        23: pop
        24: return
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */
      LineNumberTable:
        line 656: 0
        line 657: 10
        line 659: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/GameServer;

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 694: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/GameServer;

  public final void playServerLoadedSound();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 702: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/GameServer;

  public static final ext.mods.gameserver.GameServer getInstance();
    descriptor: ()Lext/mods/gameserver/GameServer;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #208                // Field Companion:Lext/mods/gameserver/GameServer$Companion;
         3: invokevirtual #1297               // Method ext/mods/gameserver/GameServer$Companion.getInstance:()Lext/mods/gameserver/GameServer;
         6: areturn
      LineNumberTable:
        line 222: 6
    RuntimeInvisibleAnnotations:
      0: #10()
        org.jetbrains.annotations.Nullable

  public static final void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #208                // Field Companion:Lext/mods/gameserver/GameServer$Companion;
         3: aload_0
         4: invokevirtual #1301               // Method ext/mods/gameserver/GameServer$Companion.main:([Ljava/lang/String;)V
         7: return
      LineNumberTable:
        line 234: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  args   [Ljava/lang/String;
    RuntimeVisibleAnnotations:
      0: #1299()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #38()
          org.jetbrains.annotations.NotNull

  public static final void customMods();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #208                // Field Companion:Lext/mods/gameserver/GameServer$Companion;
         3: invokevirtual #981                // Method ext/mods/gameserver/GameServer$Companion.customMods:()V
         6: return
      LineNumberTable:
        line 335: 6
    RuntimeVisibleAnnotations:
      0: #1299()
        kotlin.jvm.JvmStatic

  public static final ext.mods.gameserver.GameServer access$getInstance$cp();
    descriptor: ()Lext/mods/gameserver/GameServer;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #105                // Field instance:Lext/mods/gameserver/GameServer;
         3: areturn
      LineNumberTable:
        line 205: 0

  public static final ext.mods.commons.logging.CLogger access$getLOGGER$cp();
    descriptor: ()Lext/mods/commons/logging/CLogger;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #986                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: areturn
      LineNumberTable:
        line 205: 0

  public static final java.lang.Object access$loadParallel(ext.mods.gameserver.GameServer, kotlin.coroutines.Continuation);
    descriptor: (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1308               // Method loadParallel:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
         5: areturn
      LineNumberTable:
        line 205: 2
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 $this   Lext/mods/gameserver/GameServer;
            0       6     1 $completion   Lkotlin/coroutines/Continuation;

  public static final void access$loadConfigAndPools(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1312               // Method loadConfigAndPools:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadWorldAndCache(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1315               // Method loadWorldAndCache:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadIdFactory(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1318               // Method loadIdFactory:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadSkills(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1321               // Method loadSkills:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadItemsMassive(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1324               // Method loadItemsMassive:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadAdminsCharacters(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1327               // Method loadAdminsCharacters:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadGeoAndZones(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1330               // Method loadGeoAndZones:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadOlympiadScripts(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1333               // Method loadOlympiadScripts:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadEvents(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1336               // Method loadEvents:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadCustomMods(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1339               // Method loadCustomMods:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  public static final void access$loadHandlers(ext.mods.gameserver.GameServer);
    descriptor: (Lext/mods/gameserver/GameServer;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1342               // Method loadHandlers:()V
         4: return
      LineNumberTable:
        line 205: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/GameServer;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #210                // class ext/mods/gameserver/GameServer$Companion
         3: dup
         4: aconst_null
         5: invokespecial #1346               // Method ext/mods/gameserver/GameServer$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #208                // Field Companion:Lext/mods/gameserver/GameServer$Companion;
        11: new           #1009               // class ext/mods/commons/logging/CLogger
        14: dup
        15: ldc           #2                  // class ext/mods/gameserver/GameServer
        17: invokevirtual #1351               // Method java/lang/Class.getName:()Ljava/lang/String;
        20: invokespecial #1353               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        23: putstatic     #986                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: return
      LineNumberTable:
        line 220: 11
}
InnerClasses:
  static final #110;                      // class ext/mods/gameserver/GameServer$1
  public static final #205= #210 of #2;   // Companion=class ext/mods/gameserver/GameServer$Companion of class ext/mods/gameserver/GameServer
  public final #1372= #895 of #2;         // NpcSpawn=class ext/mods/gameserver/GameServer$NpcSpawn of class ext/mods/gameserver/GameServer
  static final #363;                      // class ext/mods/gameserver/GameServer$loadParallel$2
  public static final #205= #1139 of #1134; // Companion=class ext/mods/gameserver/LoginServerThread$Companion of class ext/mods/gameserver/LoginServerThread
  public static final #205= #615 of #610; // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
SourceFile: "GameServer.kt"
SourceDebugExtension:
  SMAP
  GameServer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/GameServer
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  + 3 Timing.kt
  kotlin/system/TimingKt
  *L
  1#1,703:1
  1#2:704
  29#3,3:705
  29#3,3:708
  *S KotlinDebug
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/GameServer
  *L
  554#1:705,3
  643#1:708,3
  *E
RuntimeVisibleAnnotations:
  0: #1357(#1358=[I#1359,I#1360,I#1361],#1362=I#1363,#1364=I#1365,#1366=[s#1367],#1368=[s#16,s#1369,s#31,s#32,s#172,s#1238,s#1238,s#35,s#1370,s#12,s#1371,s#11,s#7,s#8,s#457,s#1238,s#46,s#47,s#55,s#56,s#59,s#62,s#19,s#1238,s#17,s#18,s#23,s#24,s#27,s#26,s#30,s#106,s#1238,s#215,s#218,s#359,s#360,s#379,s#400,s#409,s#460,s#473,s#546,s#606,s#637,s#767,s#84,s#1238,s#93,s#1238,s#803,s#640,s#822,s#125,s#835,s#97,s#100,s#838,s#909,s#959,s#978,s#982,s#128,s#1081,s#122,s#733,s#167,s#205,s#1372,s#1373])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 C2\u00020\u0001:\u0002CDB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0002\u0010\u0007J\u0006\u0010\u001e\u001a\u00020\u0017J\u001b\u0010\u001f\u001a\u00020 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u000e\u0010#\u001a\u00020 H\u0082@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010\'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\u0012\u0010,\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u000fH\u0002J\b\u00105\u001a\u00020 H\u0002J\u0012\u00106\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020\u000fH\u0002J\u0010\u00109\u001a\u00020 2\u0006\u00104\u001a\u00020\u000fH\u0002J\b\u0010:\u001a\u00020 H\u0002J\b\u0010;\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020 H\u0002J\b\u0010=\u001a\u00020 H\u0002J\b\u0010>\u001a\u00020 H\u0002J\u0006\u0010?\u001a\u00020 J\b\u0010@\u001a\u00020 H\u0002J\b\u0010A\u001a\u00020 H\u0016J\u0006\u0010B\u001a\u00020 R.\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"]
      d2=["Lext/mods/gameserver/GameServer;","Ljava/lang/Runnable;","<init>","()V","args","","","([Ljava/lang/String;)V","value","Lext/mods/commons/mmocore/SelectorThread;","Lext/mods/gameserver/network/GameClient;","selectorThread","getSelectorThread","()Lext/mods/commons/mmocore/SelectorThread;","isServerCrash","","doorsCastlesTasksLatch","Ljava/util/concurrent/CountDownLatch;","doorsCastlesTasksReady","Ljava/util/concurrent/atomic/AtomicBoolean;","npcsSpawnsLatch","npcsAndSpawnsReady","serverLoadStart","","getServerLoadStart","()J","setServerLoadStart","(J)V","serverStartTimeMillis","getServerStartTimeMillis","getServerStartTime","setupEnvironment","","configureLogging","initGUI","loadParallel","(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;","loadConfigAndPools","loadIdFactory","loadWorldAndCache","loadSkills","loadItemsMassive","loadAdminsCharacters","loadGeoAndZones","loadDoorsCastlesTasks","quiet","DOORS_CASTLES_LOGGER_NAMES","","_suppressedDoorsLoggerLevels","","Ljava/util/logging/Level;","suppressDoorsCastlesLogs","enable","scheduleDeferredDoorsCastlesTasks","loadNpcsSpawns","NPC_SPAWN_LOGGER_NAMES","_suppressedLoggerLevels","suppressNpcSpawnLogs","loadOlympiadScripts","loadEvents","loadCustomMods","loadHandlers","scheduleDeferredNpcsSpawns","awaitNpcsSpawnsReady","startNetwork","run","playServerLoadedSound","Companion","NpcSpawn","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #1375(#1370=[s#1376])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,703:1\n1#2:704\n29#3,3:705\n29#3,3:708\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer\n*L\n554#1:705,3\n643#1:708,3\n*E\n"]
    )
BootstrapMethods:
  0: #311 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #298 (Ljava/lang/Object;)Ljava/lang/Object;
      #303 REF_invokeStatic ext/mods/gameserver/GameServer.configureLogging$lambda$0$0:(Ljava/lang/String;)Ljava/util/function/BiFunction;
      #304 (Ljava/lang/String;)Ljava/util/function/BiFunction;
  1: #311 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #728 ()V
      #732 REF_invokeStatic ext/mods/gameserver/GameServer.loadDoorsCastlesTasks$lambda$0:()V
      #728 ()V
  2: #311 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #728 ()V
      #827 REF_invokeStatic ext/mods/gameserver/GameServer.scheduleDeferredDoorsCastlesTasks$lambda$0:(Lext/mods/gameserver/GameServer;)V
      #728 ()V
  3: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #997 Loaded \u0001 admin handlers.
  4: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1020 Loaded \u0001 bypass handlers.
  5: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1029 Loaded \u0001 chat handlers.
  6: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1038 Loaded \u0001 item handlers.
  7: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1047 Loaded \u0001 skill handlers.
  8: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1056 Loaded \u0001 target handlers.
  9: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1065 Loaded \u0001 user handlers.
  10: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1074 Loaded \u0001 voiced handlers.
  11: #311 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #728 ()V
      #1079 REF_invokeStatic ext/mods/gameserver/GameServer.scheduleDeferredNpcsSpawns$lambda$0:(Lext/mods/gameserver/GameServer;)V
      #728 ()V
  12: #311 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1246 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #1249 REF_invokeStatic ext/mods/gameserver/GameServer.configureLogging$lambda$0$0$0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      #1251 (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  13: #1004 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1262 Failed to reset daily summon item counters: \u0001
