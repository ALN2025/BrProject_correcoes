// Bytecode for: ext.mods.Config
// File: ext\mods\Config.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/Config.class
  Last modified 9 de jul de 2026; size 107885 bytes
  MD5 checksum f9b4d22f8e1e3cec6f020b026af42aab
  Compiled from "Config.java"
public final class ext.mods.Config
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #27                         // ext/mods/Config
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 979, methods: 36, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/lang/IllegalStateException
     #8 = Utf8               java/lang/IllegalStateException
     #9 = String             #10          // Utility class
    #10 = Utf8               Utility class
    #11 = Methodref          #7.#12       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
    #12 = NameAndType        #5:#13       // "<init>":(Ljava/lang/String;)V
    #13 = Utf8               (Ljava/lang/String;)V
    #14 = Class              #15          // ext/mods/commons/config/ExProperties
    #15 = Utf8               ext/mods/commons/config/ExProperties
    #16 = Methodref          #14.#3       // ext/mods/commons/config/ExProperties."<init>":()V
    #17 = Class              #18          // java/io/File
    #18 = Utf8               java/io/File
    #19 = Methodref          #17.#12      // java/io/File."<init>":(Ljava/lang/String;)V
    #20 = Methodref          #14.#21      // ext/mods/commons/config/ExProperties.load:(Ljava/io/File;)V
    #21 = NameAndType        #22:#23      // load:(Ljava/io/File;)V
    #22 = Utf8               load
    #23 = Utf8               (Ljava/io/File;)V
    #24 = Class              #25          // java/lang/Exception
    #25 = Utf8               java/lang/Exception
    #26 = Fieldref           #27.#28      // ext/mods/Config.LOGGER:Lext/mods/commons/logging/CLogger;
    #27 = Class              #29          // ext/mods/Config
    #28 = NameAndType        #30:#31      // LOGGER:Lext/mods/commons/logging/CLogger;
    #29 = Utf8               ext/mods/Config
    #30 = Utf8               LOGGER
    #31 = Utf8               Lext/mods/commons/logging/CLogger;
    #32 = String             #33          // An error occured loading \'{}\' config.
    #33 = Utf8               An error occured loading \'{}\' config.
    #34 = Methodref          #35.#36      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    #35 = Class              #37          // ext/mods/commons/logging/CLogger
    #36 = NameAndType        #38:#39      // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    #37 = Utf8               ext/mods/commons/logging/CLogger
    #38 = Utf8               error
    #39 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    #40 = Fieldref           #27.#41      // ext/mods/Config.OFFLINE_FILE:Ljava/lang/String;
    #41 = NameAndType        #42:#43      // OFFLINE_FILE:Ljava/lang/String;
    #42 = Utf8               OFFLINE_FILE
    #43 = Utf8               Ljava/lang/String;
    #44 = Methodref          #27.#45      // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    #45 = NameAndType        #46:#47      // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    #46 = Utf8               initProperties
    #47 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    #48 = String             #49          // OfflineTradeEnable
    #49 = Utf8               OfflineTradeEnable
    #50 = Methodref          #14.#51      // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Z)Z
    #51 = NameAndType        #52:#53      // getProperty:(Ljava/lang/String;Z)Z
    #52 = Utf8               getProperty
    #53 = Utf8               (Ljava/lang/String;Z)Z
    #54 = Fieldref           #27.#55      // ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
    #55 = NameAndType        #56:#57      // OFFLINE_TRADE_ENABLE:Z
    #56 = Utf8               OFFLINE_TRADE_ENABLE
    #57 = Utf8               Z
    #58 = String             #59          // OfflineCraftEnable
    #59 = Utf8               OfflineCraftEnable
    #60 = Fieldref           #27.#61      // ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
    #61 = NameAndType        #62:#57      // OFFLINE_CRAFT_ENABLE:Z
    #62 = Utf8               OFFLINE_CRAFT_ENABLE
    #63 = String             #64          // OfflineModeInPeaceZone
    #64 = Utf8               OfflineModeInPeaceZone
    #65 = Fieldref           #27.#66      // ext/mods/Config.OFFLINE_MODE_IN_PEACE_ZONE:Z
    #66 = NameAndType        #67:#57      // OFFLINE_MODE_IN_PEACE_ZONE:Z
    #67 = Utf8               OFFLINE_MODE_IN_PEACE_ZONE
    #68 = String             #69          // OfflineModeNoDamage
    #69 = Utf8               OfflineModeNoDamage
    #70 = Fieldref           #27.#71      // ext/mods/Config.OFFLINE_MODE_NO_DAMAGE:Z
    #71 = NameAndType        #72:#57      // OFFLINE_MODE_NO_DAMAGE:Z
    #72 = Utf8               OFFLINE_MODE_NO_DAMAGE
    #73 = String             #74          // RestoreOffliners
    #74 = Utf8               RestoreOffliners
    #75 = Fieldref           #27.#76      // ext/mods/Config.RESTORE_OFFLINERS:Z
    #76 = NameAndType        #77:#57      // RESTORE_OFFLINERS:Z
    #77 = Utf8               RESTORE_OFFLINERS
    #78 = String             #79          // OfflineMaxDays
    #79 = Utf8               OfflineMaxDays
    #80 = Methodref          #14.#81      // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
    #81 = NameAndType        #52:#82      // getProperty:(Ljava/lang/String;I)I
    #82 = Utf8               (Ljava/lang/String;I)I
    #83 = Fieldref           #27.#84      // ext/mods/Config.OFFLINE_MAX_DAYS:I
    #84 = NameAndType        #85:#86      // OFFLINE_MAX_DAYS:I
    #85 = Utf8               OFFLINE_MAX_DAYS
    #86 = Utf8               I
    #87 = String             #88          // OfflineDisconnectFinished
    #88 = Utf8               OfflineDisconnectFinished
    #89 = Fieldref           #27.#90      // ext/mods/Config.OFFLINE_DISCONNECT_FINISHED:Z
    #90 = NameAndType        #91:#57      // OFFLINE_DISCONNECT_FINISHED:Z
    #91 = Utf8               OFFLINE_DISCONNECT_FINISHED
    #92 = String             #93          // OfflineSleepEffect
    #93 = Utf8               OfflineSleepEffect
    #94 = Fieldref           #27.#95      // ext/mods/Config.OFFLINE_SLEEP_EFFECT:Z
    #95 = NameAndType        #96:#57      // OFFLINE_SLEEP_EFFECT:Z
    #96 = Utf8               OFFLINE_SLEEP_EFFECT
    #97 = String             #98          // RestoreStoreItems
    #98 = Utf8               RestoreStoreItems
    #99 = Fieldref           #27.#100     // ext/mods/Config.RESTORE_STORE_ITEMS:Z
   #100 = NameAndType        #101:#57     // RESTORE_STORE_ITEMS:Z
   #101 = Utf8               RESTORE_STORE_ITEMS
   #102 = Fieldref           #27.#103     // ext/mods/Config.SAFE_DISCONNECT_FILE:Ljava/lang/String;
   #103 = NameAndType        #104:#43     // SAFE_DISCONNECT_FILE:Ljava/lang/String;
   #104 = Utf8               SAFE_DISCONNECT_FILE
   #105 = String             #106         // SafeDisconnectEnabled
   #106 = Utf8               SafeDisconnectEnabled
   #107 = Fieldref           #27.#108     // ext/mods/Config.SAFEDISCONNECT_ENABLED:Z
   #108 = NameAndType        #109:#57     // SAFEDISCONNECT_ENABLED:Z
   #109 = Utf8               SAFEDISCONNECT_ENABLED
   #110 = String             #111         // SafeDisconnectTimeoutMs
   #111 = Utf8               SafeDisconnectTimeoutMs
   #112 = Long               300000l
   #114 = Methodref          #14.#115     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;J)J
   #115 = NameAndType        #52:#116     // getProperty:(Ljava/lang/String;J)J
   #116 = Utf8               (Ljava/lang/String;J)J
   #117 = Fieldref           #27.#118     // ext/mods/Config.SAFEDISCONNECT_TIMEOUT_MS:J
   #118 = NameAndType        #119:#120    // SAFEDISCONNECT_TIMEOUT_MS:J
   #119 = Utf8               SAFEDISCONNECT_TIMEOUT_MS
   #120 = Utf8               J
   #121 = String             #122         // SafeDisconnectAllowOlympiad
   #122 = Utf8               SafeDisconnectAllowOlympiad
   #123 = Fieldref           #27.#124     // ext/mods/Config.SAFEDISCONNECT_ALLOW_OLYMPIAD:Z
   #124 = NameAndType        #125:#57     // SAFEDISCONNECT_ALLOW_OLYMPIAD:Z
   #125 = Utf8               SAFEDISCONNECT_ALLOW_OLYMPIAD
   #126 = String             #127         // SafeDisconnectAllowBoss
   #127 = Utf8               SafeDisconnectAllowBoss
   #128 = Fieldref           #27.#129     // ext/mods/Config.SAFEDISCONNECT_ALLOW_BOSS:Z
   #129 = NameAndType        #130:#57     // SAFEDISCONNECT_ALLOW_BOSS:Z
   #130 = Utf8               SAFEDISCONNECT_ALLOW_BOSS
   #131 = String             #132         // SafeDisconnectAllowQuest
   #132 = Utf8               SafeDisconnectAllowQuest
   #133 = Fieldref           #27.#134     // ext/mods/Config.SAFEDISCONNECT_ALLOW_QUEST:Z
   #134 = NameAndType        #135:#57     // SAFEDISCONNECT_ALLOW_QUEST:Z
   #135 = Utf8               SAFEDISCONNECT_ALLOW_QUEST
   #136 = String             #137         // SafeDisconnectAllowFarm
   #137 = Utf8               SafeDisconnectAllowFarm
   #138 = Fieldref           #27.#139     // ext/mods/Config.SAFEDISCONNECT_ALLOW_FARM:Z
   #139 = NameAndType        #140:#57     // SAFEDISCONNECT_ALLOW_FARM:Z
   #140 = Utf8               SAFEDISCONNECT_ALLOW_FARM
   #141 = String             #142         // SafeDisconnectIntegrationOlympiad
   #142 = Utf8               SafeDisconnectIntegrationOlympiad
   #143 = Fieldref           #27.#144     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_OLYMPIAD:Z
   #144 = NameAndType        #145:#57     // SAFEDISCONNECT_INTEGRATION_OLYMPIAD:Z
   #145 = Utf8               SAFEDISCONNECT_INTEGRATION_OLYMPIAD
   #146 = String             #147         // SafeDisconnectIntegrationDungeon
   #147 = Utf8               SafeDisconnectIntegrationDungeon
   #148 = Fieldref           #27.#149     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_DUNGEON:Z
   #149 = NameAndType        #150:#57     // SAFEDISCONNECT_INTEGRATION_DUNGEON:Z
   #150 = Utf8               SAFEDISCONNECT_INTEGRATION_DUNGEON
   #151 = String             #152         // SafeDisconnectIntegrationTournament
   #152 = Utf8               SafeDisconnectIntegrationTournament
   #153 = Fieldref           #27.#154     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_TOURNAMENT:Z
   #154 = NameAndType        #155:#57     // SAFEDISCONNECT_INTEGRATION_TOURNAMENT:Z
   #155 = Utf8               SAFEDISCONNECT_INTEGRATION_TOURNAMENT
   #156 = String             #157         // SafeDisconnectIntegrationTvT
   #157 = Utf8               SafeDisconnectIntegrationTvT
   #158 = Fieldref           #27.#159     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_TVT:Z
   #159 = NameAndType        #160:#57     // SAFEDISCONNECT_INTEGRATION_TVT:Z
   #160 = Utf8               SAFEDISCONNECT_INTEGRATION_TVT
   #161 = String             #162         // SafeDisconnectIntegrationCTF
   #162 = Utf8               SafeDisconnectIntegrationCTF
   #163 = Fieldref           #27.#164     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_CTF:Z
   #164 = NameAndType        #165:#57     // SAFEDISCONNECT_INTEGRATION_CTF:Z
   #165 = Utf8               SAFEDISCONNECT_INTEGRATION_CTF
   #166 = String             #167         // SafeDisconnectIntegrationDM
   #167 = Utf8               SafeDisconnectIntegrationDM
   #168 = Fieldref           #27.#169     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_DM:Z
   #169 = NameAndType        #170:#57     // SAFEDISCONNECT_INTEGRATION_DM:Z
   #170 = Utf8               SAFEDISCONNECT_INTEGRATION_DM
   #171 = String             #172         // SafeDisconnectIntegrationLM
   #172 = Utf8               SafeDisconnectIntegrationLM
   #173 = Fieldref           #27.#174     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_LM:Z
   #174 = NameAndType        #175:#57     // SAFEDISCONNECT_INTEGRATION_LM:Z
   #175 = Utf8               SAFEDISCONNECT_INTEGRATION_LM
   #176 = String             #177         // SafeDisconnectInvulnerable
   #177 = Utf8               SafeDisconnectInvulnerable
   #178 = Fieldref           #27.#179     // ext/mods/Config.SAFEDISCONNECT_INVULNERABLE:Z
   #179 = NameAndType        #180:#57     // SAFEDISCONNECT_INVULNERABLE:Z
   #180 = Utf8               SAFEDISCONNECT_INVULNERABLE
   #181 = String             #182         // SafeDisconnectImmobilize
   #182 = Utf8               SafeDisconnectImmobilize
   #183 = Fieldref           #27.#184     // ext/mods/Config.SAFEDISCONNECT_IMMOBILIZE:Z
   #184 = NameAndType        #185:#57     // SAFEDISCONNECT_IMMOBILIZE:Z
   #185 = Utf8               SAFEDISCONNECT_IMMOBILIZE
   #186 = String             #187         // SafeDisconnectChangeNameColor
   #187 = Utf8               SafeDisconnectChangeNameColor
   #188 = Fieldref           #27.#189     // ext/mods/Config.SAFEDISCONNECT_CHANGE_NAME_COLOR:Z
   #189 = NameAndType        #190:#57     // SAFEDISCONNECT_CHANGE_NAME_COLOR:Z
   #190 = Utf8               SAFEDISCONNECT_CHANGE_NAME_COLOR
   #191 = String             #192         // SafeDisconnectAutoFarmRestoreDelayMs
   #192 = Utf8               SafeDisconnectAutoFarmRestoreDelayMs
   #193 = Long               1500l
   #195 = Fieldref           #27.#196     // ext/mods/Config.SAFEDISCONNECT_AUTOFARM_RESTORE_DELAY_MS:J
   #196 = NameAndType        #197:#120    // SAFEDISCONNECT_AUTOFARM_RESTORE_DELAY_MS:J
   #197 = Utf8               SAFEDISCONNECT_AUTOFARM_RESTORE_DELAY_MS
   #198 = String             #199         // SafeDisconnectTitle
   #199 = Utf8               SafeDisconnectTitle
   #200 = String             #201         // Disconnect...
   #201 = Utf8               Disconnect...
   #202 = Methodref          #14.#203     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #203 = NameAndType        #52:#204     // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #204 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #205 = Fieldref           #27.#206     // ext/mods/Config.SAFEDISCONNECT_TITLE:Ljava/lang/String;
   #206 = NameAndType        #207:#43     // SAFEDISCONNECT_TITLE:Ljava/lang/String;
   #207 = Utf8               SAFEDISCONNECT_TITLE
   #208 = String             #209         // SafeDisconnectNameColor
   #209 = Utf8               SafeDisconnectNameColor
   #210 = String             #211         // 00FFFF
   #211 = Utf8               00FFFF
   #212 = String             #213         // 0x
   #213 = Utf8               0x
   #214 = Methodref          #215.#216    // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #215 = Class              #217         // java/lang/String
   #216 = NameAndType        #218:#219    // startsWith:(Ljava/lang/String;)Z
   #217 = Utf8               java/lang/String
   #218 = Utf8               startsWith
   #219 = Utf8               (Ljava/lang/String;)Z
   #220 = String             #221         // 0X
   #221 = Utf8               0X
   #222 = Methodref          #215.#223    // java/lang/String.substring:(I)Ljava/lang/String;
   #223 = NameAndType        #224:#225    // substring:(I)Ljava/lang/String;
   #224 = Utf8               substring
   #225 = Utf8               (I)Ljava/lang/String;
   #226 = InvokeDynamic      #0:#227      // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #227 = NameAndType        #228:#229    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #228 = Utf8               makeConcatWithConstants
   #229 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #230 = Methodref          #231.#232    // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
   #231 = Class              #233         // java/lang/Integer
   #232 = NameAndType        #234:#235    // decode:(Ljava/lang/String;)Ljava/lang/Integer;
   #233 = Utf8               java/lang/Integer
   #234 = Utf8               decode
   #235 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #236 = Methodref          #231.#237    // java/lang/Integer.intValue:()I
   #237 = NameAndType        #238:#239    // intValue:()I
   #238 = Utf8               intValue
   #239 = Utf8               ()I
   #240 = Fieldref           #27.#241     // ext/mods/Config.SAFEDISCONNECT_NAME_COLOR:I
   #241 = NameAndType        #242:#86     // SAFEDISCONNECT_NAME_COLOR:I
   #242 = Utf8               SAFEDISCONNECT_NAME_COLOR
   #243 = Class              #244         // java/lang/NumberFormatException
   #244 = Utf8               java/lang/NumberFormatException
   #245 = String             #246         // 0x00FFFF
   #246 = Utf8               0x00FFFF
   #247 = Fieldref           #27.#248     // ext/mods/Config.BOSS_ZERG_FILE:Ljava/lang/String;
   #248 = NameAndType        #249:#43     // BOSS_ZERG_FILE:Ljava/lang/String;
   #249 = Utf8               BOSS_ZERG_FILE
   #250 = String             #251         // BossZergEnabled
   #251 = Utf8               BossZergEnabled
   #252 = Fieldref           #27.#253     // ext/mods/Config.BOSS_ZERG_ENABLED:Z
   #253 = NameAndType        #254:#57     // BOSS_ZERG_ENABLED:Z
   #254 = Utf8               BOSS_ZERG_ENABLED
   #255 = String             #256         // BossZergFlagEnabled
   #256 = Utf8               BossZergFlagEnabled
   #257 = Fieldref           #27.#258     // ext/mods/Config.BOSS_ZERG_FLAG_ENABLED:Z
   #258 = NameAndType        #259:#57     // BOSS_ZERG_FLAG_ENABLED:Z
   #259 = Utf8               BOSS_ZERG_FLAG_ENABLED
   #260 = String             #261         // BossZergFlagRange
   #261 = Utf8               BossZergFlagRange
   #262 = Fieldref           #27.#263     // ext/mods/Config.BOSS_ZERG_FLAG_RANGE:I
   #263 = NameAndType        #264:#86     // BOSS_ZERG_FLAG_RANGE:I
   #264 = Utf8               BOSS_ZERG_FLAG_RANGE
   #265 = String             #266         // BossZergFlagRenewMs
   #266 = Utf8               BossZergFlagRenewMs
   #267 = Long               10000l
   #269 = Fieldref           #27.#270     // ext/mods/Config.BOSS_ZERG_FLAG_RENEW_MS:J
   #270 = NameAndType        #271:#120    // BOSS_ZERG_FLAG_RENEW_MS:J
   #271 = Utf8               BOSS_ZERG_FLAG_RENEW_MS
   #272 = String             #273         // BossZergFlagMinPlayers
   #273 = Utf8               BossZergFlagMinPlayers
   #274 = Fieldref           #27.#275     // ext/mods/Config.BOSS_ZERG_FLAG_MIN_PLAYERS:I
   #275 = NameAndType        #276:#86     // BOSS_ZERG_FLAG_MIN_PLAYERS:I
   #276 = Utf8               BOSS_ZERG_FLAG_MIN_PLAYERS
   #277 = String             #278         // BossZergFlagWarningRange
   #278 = Utf8               BossZergFlagWarningRange
   #279 = Fieldref           #27.#280     // ext/mods/Config.BOSS_ZERG_FLAG_WARNING_RANGE:I
   #280 = NameAndType        #281:#86     // BOSS_ZERG_FLAG_WARNING_RANGE:I
   #281 = Utf8               BOSS_ZERG_FLAG_WARNING_RANGE
   #282 = String             #283         // BossZergFlagAreaRadius
   #283 = Utf8               BossZergFlagAreaRadius
   #284 = Fieldref           #27.#285     // ext/mods/Config.BOSS_ZERG_FLAG_AREA_RADIUS:I
   #285 = NameAndType        #286:#86     // BOSS_ZERG_FLAG_AREA_RADIUS:I
   #286 = Utf8               BOSS_ZERG_FLAG_AREA_RADIUS
   #287 = String             #288         // BossZergFlagAreaColor
   #288 = Utf8               BossZergFlagAreaColor
   #289 = String             #290         // FFA500
   #290 = Utf8               FFA500
   #291 = Fieldref           #27.#292     // ext/mods/Config.BOSS_ZERG_FLAG_AREA_COLOR:I
   #292 = NameAndType        #293:#86     // BOSS_ZERG_FLAG_AREA_COLOR:I
   #293 = Utf8               BOSS_ZERG_FLAG_AREA_COLOR
   #294 = String             #295         // 0xFFA500
   #295 = Utf8               0xFFA500
   #296 = String             #297         // BossZergRange
   #297 = Utf8               BossZergRange
   #298 = Fieldref           #27.#299     // ext/mods/Config.BOSS_ZERG_RANGE:I
   #299 = NameAndType        #300:#86     // BOSS_ZERG_RANGE:I
   #300 = Utf8               BOSS_ZERG_RANGE
   #301 = String             #302         // BossZergMinPartySize
   #302 = Utf8               BossZergMinPartySize
   #303 = Fieldref           #27.#304     // ext/mods/Config.BOSS_ZERG_MIN_PARTY_SIZE:I
   #304 = NameAndType        #305:#86     // BOSS_ZERG_MIN_PARTY_SIZE:I
   #305 = Utf8               BOSS_ZERG_MIN_PARTY_SIZE
   #306 = String             #307         // BossZergMaxAllyMembers
   #307 = Utf8               BossZergMaxAllyMembers
   #308 = Fieldref           #27.#309     // ext/mods/Config.BOSS_ZERG_MAX_ALLY_MEMBERS:I
   #309 = NameAndType        #310:#86     // BOSS_ZERG_MAX_ALLY_MEMBERS:I
   #310 = Utf8               BOSS_ZERG_MAX_ALLY_MEMBERS
   #311 = String             #312         // BossZergShowAllyCount
   #312 = Utf8               BossZergShowAllyCount
   #313 = Fieldref           #27.#314     // ext/mods/Config.BOSS_ZERG_SHOW_ALLY_COUNT:Z
   #314 = NameAndType        #315:#57     // BOSS_ZERG_SHOW_ALLY_COUNT:Z
   #315 = Utf8               BOSS_ZERG_SHOW_ALLY_COUNT
   #316 = String             #317         // BossZergAnnounce
   #317 = Utf8               BossZergAnnounce
   #318 = Fieldref           #27.#319     // ext/mods/Config.BOSS_ZERG_ANNOUNCE:Z
   #319 = NameAndType        #320:#57     // BOSS_ZERG_ANNOUNCE:Z
   #320 = Utf8               BOSS_ZERG_ANNOUNCE
   #321 = String             #322         // BossZergAnnounceCooldownMs
   #322 = Utf8               BossZergAnnounceCooldownMs
   #323 = Long               60000l
   #325 = Fieldref           #27.#326     // ext/mods/Config.BOSS_ZERG_ANNOUNCE_COOLDOWN_MS:J
   #326 = NameAndType        #327:#120    // BOSS_ZERG_ANNOUNCE_COOLDOWN_MS:J
   #327 = Utf8               BOSS_ZERG_ANNOUNCE_COOLDOWN_MS
   #328 = String             #329         // BossZergShowArea
   #329 = Utf8               BossZergShowArea
   #330 = Fieldref           #27.#331     // ext/mods/Config.BOSS_ZERG_SHOW_AREA:Z
   #331 = NameAndType        #332:#57     // BOSS_ZERG_SHOW_AREA:Z
   #332 = Utf8               BOSS_ZERG_SHOW_AREA
   #333 = String             #334         // BossZergAreaRadius
   #334 = Utf8               BossZergAreaRadius
   #335 = Fieldref           #27.#336     // ext/mods/Config.BOSS_ZERG_AREA_RADIUS:I
   #336 = NameAndType        #337:#86     // BOSS_ZERG_AREA_RADIUS:I
   #337 = Utf8               BOSS_ZERG_AREA_RADIUS
   #338 = String             #339         // BossZergCheckIntervalMs
   #339 = Utf8               BossZergCheckIntervalMs
   #340 = Long               3000l
   #342 = Fieldref           #27.#343     // ext/mods/Config.BOSS_ZERG_CHECK_INTERVAL_MS:J
   #343 = NameAndType        #344:#120    // BOSS_ZERG_CHECK_INTERVAL_MS:J
   #344 = Utf8               BOSS_ZERG_CHECK_INTERVAL_MS
   #345 = String             #346         // BossZergFlagAreaEnabled
   #346 = Utf8               BossZergFlagAreaEnabled
   #347 = Fieldref           #27.#348     // ext/mods/Config.BOSS_ZERG_FLAG_AREA_ENABLED:Z
   #348 = NameAndType        #349:#57     // BOSS_ZERG_FLAG_AREA_ENABLED:Z
   #349 = Utf8               BOSS_ZERG_FLAG_AREA_ENABLED
   #350 = String             #351         // BossZergHealPenaltyEnabled
   #351 = Utf8               BossZergHealPenaltyEnabled
   #352 = Fieldref           #27.#353     // ext/mods/Config.BOSS_ZERG_HEAL_PENALTY_ENABLED:Z
   #353 = NameAndType        #354:#57     // BOSS_ZERG_HEAL_PENALTY_ENABLED:Z
   #354 = Utf8               BOSS_ZERG_HEAL_PENALTY_ENABLED
   #355 = String             #356         // BossZergHealPenaltyMultiplier
   #356 = Utf8               BossZergHealPenaltyMultiplier
   #357 = Double             0.75d
   #359 = Methodref          #14.#360     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;D)D
   #360 = NameAndType        #52:#361     // getProperty:(Ljava/lang/String;D)D
   #361 = Utf8               (Ljava/lang/String;D)D
   #362 = Fieldref           #27.#363     // ext/mods/Config.BOSS_ZERG_HEAL_PENALTY_MULTIPLIER:D
   #363 = NameAndType        #364:#365    // BOSS_ZERG_HEAL_PENALTY_MULTIPLIER:D
   #364 = Utf8               BOSS_ZERG_HEAL_PENALTY_MULTIPLIER
   #365 = Utf8               D
   #366 = String             #367         // BossZergPrayerReverseMultiplier
   #367 = Utf8               BossZergPrayerReverseMultiplier
   #368 = Double             0.85d
   #370 = Fieldref           #27.#371     // ext/mods/Config.BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER:D
   #371 = NameAndType        #372:#365    // BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER:D
   #372 = Utf8               BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER
   #373 = String             #374         // BossZergPrayerSkillIds
   #374 = Utf8               BossZergPrayerSkillIds
   #375 = String             #376         //
   #376 = Utf8
   #377 = Methodref          #215.#378    // java/lang/String.trim:()Ljava/lang/String;
   #378 = NameAndType        #379:#380    // trim:()Ljava/lang/String;
   #379 = Utf8               trim
   #380 = Utf8               ()Ljava/lang/String;
   #381 = Methodref          #215.#382    // java/lang/String.isEmpty:()Z
   #382 = NameAndType        #383:#384    // isEmpty:()Z
   #383 = Utf8               isEmpty
   #384 = Utf8               ()Z
   #385 = Fieldref           #27.#386     // ext/mods/Config.BOSS_ZERG_PRAYER_SKILL_IDS:[I
   #386 = NameAndType        #387:#388    // BOSS_ZERG_PRAYER_SKILL_IDS:[I
   #387 = Utf8               BOSS_ZERG_PRAYER_SKILL_IDS
   #388 = Utf8               [I
   #389 = String             #390         // ,
   #390 = Utf8               ,
   #391 = Methodref          #215.#392    // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #392 = NameAndType        #393:#394    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #393 = Utf8               split
   #394 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #395 = Class              #396         // java/util/ArrayList
   #396 = Utf8               java/util/ArrayList
   #397 = Methodref          #395.#398    // java/util/ArrayList."<init>":(I)V
   #398 = NameAndType        #5:#399      // "<init>":(I)V
   #399 = Utf8               (I)V
   #400 = Methodref          #231.#401    // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #401 = NameAndType        #402:#403    // parseInt:(Ljava/lang/String;)I
   #402 = Utf8               parseInt
   #403 = Utf8               (Ljava/lang/String;)I
   #404 = Methodref          #231.#405    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #405 = NameAndType        #406:#407    // valueOf:(I)Ljava/lang/Integer;
   #406 = Utf8               valueOf
   #407 = Utf8               (I)Ljava/lang/Integer;
   #408 = InterfaceMethodref #409.#410    // java/util/List.add:(Ljava/lang/Object;)Z
   #409 = Class              #411         // java/util/List
   #410 = NameAndType        #412:#413    // add:(Ljava/lang/Object;)Z
   #411 = Utf8               java/util/List
   #412 = Utf8               add
   #413 = Utf8               (Ljava/lang/Object;)Z
   #414 = String             #415         // BossZerg: Invalid prayer skill id \'{}\'.
   #415 = Utf8               BossZerg: Invalid prayer skill id \'{}\'.
   #416 = Methodref          #35.#417     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #417 = NameAndType        #418:#419    // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #418 = Utf8               warn
   #419 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #420 = InterfaceMethodref #409.#421    // java/util/List.stream:()Ljava/util/stream/Stream;
   #421 = NameAndType        #422:#423    // stream:()Ljava/util/stream/Stream;
   #422 = Utf8               stream
   #423 = Utf8               ()Ljava/util/stream/Stream;
   #424 = InvokeDynamic      #1:#425      // #1:applyAsInt:()Ljava/util/function/ToIntFunction;
   #425 = NameAndType        #426:#427    // applyAsInt:()Ljava/util/function/ToIntFunction;
   #426 = Utf8               applyAsInt
   #427 = Utf8               ()Ljava/util/function/ToIntFunction;
   #428 = InterfaceMethodref #429.#430    // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #429 = Class              #431         // java/util/stream/Stream
   #430 = NameAndType        #432:#433    // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #431 = Utf8               java/util/stream/Stream
   #432 = Utf8               mapToInt
   #433 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
   #434 = InterfaceMethodref #435.#436    // java/util/stream/IntStream.toArray:()[I
   #435 = Class              #437         // java/util/stream/IntStream
   #436 = NameAndType        #438:#439    // toArray:()[I
   #437 = Utf8               java/util/stream/IntStream
   #438 = Utf8               toArray
   #439 = Utf8               ()[I
   #440 = String             #441         // BossZergIgnoredBossIds
   #441 = Utf8               BossZergIgnoredBossIds
   #442 = Class              #443         // java/util/HashSet
   #443 = Utf8               java/util/HashSet
   #444 = Methodref          #442.#3      // java/util/HashSet."<init>":()V
   #445 = InterfaceMethodref #446.#410    // java/util/Set.add:(Ljava/lang/Object;)Z
   #446 = Class              #447         // java/util/Set
   #447 = Utf8               java/util/Set
   #448 = String             #449         // BossZerg: Invalid ignored boss id \'{}\'.
   #449 = Utf8               BossZerg: Invalid ignored boss id \'{}\'.
   #450 = Fieldref           #27.#451     // ext/mods/Config.BOSS_ZERG_IGNORED_BOSS_IDS:Ljava/util/Set;
   #451 = NameAndType        #452:#453    // BOSS_ZERG_IGNORED_BOSS_IDS:Ljava/util/Set;
   #452 = Utf8               BOSS_ZERG_IGNORED_BOSS_IDS
   #453 = Utf8               Ljava/util/Set;
   #454 = Fieldref           #27.#455     // ext/mods/Config.CLANS_FILE:Ljava/lang/String;
   #455 = NameAndType        #456:#43     // CLANS_FILE:Ljava/lang/String;
   #456 = Utf8               CLANS_FILE
   #457 = String             #458         // DaysBeforeJoinAClan
   #458 = Utf8               DaysBeforeJoinAClan
   #459 = Fieldref           #27.#460     // ext/mods/Config.CLAN_JOIN_DAYS:I
   #460 = NameAndType        #461:#86     // CLAN_JOIN_DAYS:I
   #461 = Utf8               CLAN_JOIN_DAYS
   #462 = String             #463         // DaysBeforeCreateAClan
   #463 = Utf8               DaysBeforeCreateAClan
   #464 = Fieldref           #27.#465     // ext/mods/Config.CLAN_CREATE_DAYS:I
   #465 = NameAndType        #466:#86     // CLAN_CREATE_DAYS:I
   #466 = Utf8               CLAN_CREATE_DAYS
   #467 = String             #468         // MaxNumOfClansInAlly
   #468 = Utf8               MaxNumOfClansInAlly
   #469 = Fieldref           #27.#470     // ext/mods/Config.MAX_NUM_OF_CLANS_IN_ALLY:I
   #470 = NameAndType        #471:#86     // MAX_NUM_OF_CLANS_IN_ALLY:I
   #471 = Utf8               MAX_NUM_OF_CLANS_IN_ALLY
   #472 = String             #473         // ClanMembersForWar
   #473 = Utf8               ClanMembersForWar
   #474 = Fieldref           #27.#475     // ext/mods/Config.CLAN_MEMBERS_FOR_WAR:I
   #475 = NameAndType        #476:#86     // CLAN_MEMBERS_FOR_WAR:I
   #476 = Utf8               CLAN_MEMBERS_FOR_WAR
   #477 = String             #478         // ClanWarPenaltyWhenEnded
   #478 = Utf8               ClanWarPenaltyWhenEnded
   #479 = Fieldref           #27.#480     // ext/mods/Config.CLAN_WAR_PENALTY_WHEN_ENDED:I
   #480 = NameAndType        #481:#86     // CLAN_WAR_PENALTY_WHEN_ENDED:I
   #481 = Utf8               CLAN_WAR_PENALTY_WHEN_ENDED
   #482 = String             #483         // DaysToPassToDissolveAClan
   #483 = Utf8               DaysToPassToDissolveAClan
   #484 = Fieldref           #27.#485     // ext/mods/Config.CLAN_DISSOLVE_DAYS:I
   #485 = NameAndType        #486:#86     // CLAN_DISSOLVE_DAYS:I
   #486 = Utf8               CLAN_DISSOLVE_DAYS
   #487 = String             #488         // DaysBeforeJoinAllyWhenLeaved
   #488 = Utf8               DaysBeforeJoinAllyWhenLeaved
   #489 = Fieldref           #27.#490     // ext/mods/Config.ALLY_JOIN_DAYS_WHEN_LEAVED:I
   #490 = NameAndType        #491:#86     // ALLY_JOIN_DAYS_WHEN_LEAVED:I
   #491 = Utf8               ALLY_JOIN_DAYS_WHEN_LEAVED
   #492 = String             #493         // DaysBeforeJoinAllyWhenDismissed
   #493 = Utf8               DaysBeforeJoinAllyWhenDismissed
   #494 = Fieldref           #27.#495     // ext/mods/Config.ALLY_JOIN_DAYS_WHEN_DISMISSED:I
   #495 = NameAndType        #496:#86     // ALLY_JOIN_DAYS_WHEN_DISMISSED:I
   #496 = Utf8               ALLY_JOIN_DAYS_WHEN_DISMISSED
   #497 = String             #498         // DaysBeforeAcceptNewClanWhenDismissed
   #498 = Utf8               DaysBeforeAcceptNewClanWhenDismissed
   #499 = Fieldref           #27.#500     // ext/mods/Config.ACCEPT_CLAN_DAYS_WHEN_DISMISSED:I
   #500 = NameAndType        #501:#86     // ACCEPT_CLAN_DAYS_WHEN_DISMISSED:I
   #501 = Utf8               ACCEPT_CLAN_DAYS_WHEN_DISMISSED
   #502 = String             #503         // DaysBeforeCreateNewAllyWhenDissolved
   #503 = Utf8               DaysBeforeCreateNewAllyWhenDissolved
   #504 = Fieldref           #27.#505     // ext/mods/Config.CREATE_ALLY_DAYS_WHEN_DISSOLVED:I
   #505 = NameAndType        #506:#86     // CREATE_ALLY_DAYS_WHEN_DISSOLVED:I
   #506 = Utf8               CREATE_ALLY_DAYS_WHEN_DISSOLVED
   #507 = String             #508         // MembersCanWithdrawFromClanWH
   #508 = Utf8               MembersCanWithdrawFromClanWH
   #509 = Fieldref           #27.#510     // ext/mods/Config.MEMBERS_CAN_WITHDRAW_FROM_CLANWH:Z
   #510 = NameAndType        #511:#57     // MEMBERS_CAN_WITHDRAW_FROM_CLANWH:Z
   #511 = Utf8               MEMBERS_CAN_WITHDRAW_FROM_CLANWH
   #512 = String             #513         // ManorRefreshTime
   #513 = Utf8               ManorRefreshTime
   #514 = Fieldref           #27.#515     // ext/mods/Config.MANOR_REFRESH_TIME:I
   #515 = NameAndType        #516:#86     // MANOR_REFRESH_TIME:I
   #516 = Utf8               MANOR_REFRESH_TIME
   #517 = String             #518         // ManorRefreshMin
   #518 = Utf8               ManorRefreshMin
   #519 = Fieldref           #27.#520     // ext/mods/Config.MANOR_REFRESH_MIN:I
   #520 = NameAndType        #521:#86     // MANOR_REFRESH_MIN:I
   #521 = Utf8               MANOR_REFRESH_MIN
   #522 = String             #523         // ManorApproveTime
   #523 = Utf8               ManorApproveTime
   #524 = Fieldref           #27.#525     // ext/mods/Config.MANOR_APPROVE_TIME:I
   #525 = NameAndType        #526:#86     // MANOR_APPROVE_TIME:I
   #526 = Utf8               MANOR_APPROVE_TIME
   #527 = String             #528         // ManorApproveMin
   #528 = Utf8               ManorApproveMin
   #529 = Fieldref           #27.#530     // ext/mods/Config.MANOR_APPROVE_MIN:I
   #530 = NameAndType        #531:#86     // MANOR_APPROVE_MIN:I
   #531 = Utf8               MANOR_APPROVE_MIN
   #532 = String             #533         // ManorMaintenanceMin
   #533 = Utf8               ManorMaintenanceMin
   #534 = Fieldref           #27.#535     // ext/mods/Config.MANOR_MAINTENANCE_MIN:I
   #535 = NameAndType        #536:#86     // MANOR_MAINTENANCE_MIN:I
   #536 = Utf8               MANOR_MAINTENANCE_MIN
   #537 = String             #538         // ManorSavePeriodRate
   #538 = Utf8               ManorSavePeriodRate
   #539 = Integer            3600000
   #540 = Fieldref           #27.#541     // ext/mods/Config.MANOR_SAVE_PERIOD_RATE:I
   #541 = NameAndType        #542:#86     // MANOR_SAVE_PERIOD_RATE:I
   #542 = Utf8               MANOR_SAVE_PERIOD_RATE
   #543 = String             #544         // CastleTeleportFunctionFeeRatio
   #544 = Utf8               CastleTeleportFunctionFeeRatio
   #545 = Long               604800000l
   #547 = Fieldref           #27.#548     // ext/mods/Config.CS_TELE_FEE_RATIO:J
   #548 = NameAndType        #549:#120    // CS_TELE_FEE_RATIO:J
   #549 = Utf8               CS_TELE_FEE_RATIO
   #550 = String             #551         // CastleTeleportFunctionFeeLvl1
   #551 = Utf8               CastleTeleportFunctionFeeLvl1
   #552 = Fieldref           #27.#553     // ext/mods/Config.CS_TELE1_FEE:I
   #553 = NameAndType        #554:#86     // CS_TELE1_FEE:I
   #554 = Utf8               CS_TELE1_FEE
   #555 = String             #556         // CastleTeleportFunctionFeeLvl2
   #556 = Utf8               CastleTeleportFunctionFeeLvl2
   #557 = Fieldref           #27.#558     // ext/mods/Config.CS_TELE2_FEE:I
   #558 = NameAndType        #559:#86     // CS_TELE2_FEE:I
   #559 = Utf8               CS_TELE2_FEE
   #560 = String             #561         // CastleSupportFunctionFeeRatio
   #561 = Utf8               CastleSupportFunctionFeeRatio
   #562 = Long               86400000l
   #564 = Fieldref           #27.#565     // ext/mods/Config.CS_SUPPORT_FEE_RATIO:J
   #565 = NameAndType        #566:#120    // CS_SUPPORT_FEE_RATIO:J
   #566 = Utf8               CS_SUPPORT_FEE_RATIO
   #567 = String             #568         // CastleSupportFeeLvl1
   #568 = Utf8               CastleSupportFeeLvl1
   #569 = Fieldref           #27.#570     // ext/mods/Config.CS_SUPPORT1_FEE:I
   #570 = NameAndType        #571:#86     // CS_SUPPORT1_FEE:I
   #571 = Utf8               CS_SUPPORT1_FEE
   #572 = String             #573         // CastleSupportFeeLvl2
   #573 = Utf8               CastleSupportFeeLvl2
   #574 = Fieldref           #27.#575     // ext/mods/Config.CS_SUPPORT2_FEE:I
   #575 = NameAndType        #576:#86     // CS_SUPPORT2_FEE:I
   #576 = Utf8               CS_SUPPORT2_FEE
   #577 = String             #578         // CastleSupportFeeLvl3
   #578 = Utf8               CastleSupportFeeLvl3
   #579 = Integer            37000
   #580 = Fieldref           #27.#581     // ext/mods/Config.CS_SUPPORT3_FEE:I
   #581 = NameAndType        #582:#86     // CS_SUPPORT3_FEE:I
   #582 = Utf8               CS_SUPPORT3_FEE
   #583 = String             #584         // CastleSupportFeeLvl4
   #584 = Utf8               CastleSupportFeeLvl4
   #585 = Integer            52000
   #586 = Fieldref           #27.#587     // ext/mods/Config.CS_SUPPORT4_FEE:I
   #587 = NameAndType        #588:#86     // CS_SUPPORT4_FEE:I
   #588 = Utf8               CS_SUPPORT4_FEE
   #589 = String             #590         // CastleMpRegenerationFunctionFeeRatio
   #590 = Utf8               CastleMpRegenerationFunctionFeeRatio
   #591 = Fieldref           #27.#592     // ext/mods/Config.CS_MPREG_FEE_RATIO:J
   #592 = NameAndType        #593:#120    // CS_MPREG_FEE_RATIO:J
   #593 = Utf8               CS_MPREG_FEE_RATIO
   #594 = String             #595         // CastleMpRegenerationFeeLvl1
   #595 = Utf8               CastleMpRegenerationFeeLvl1
   #596 = Fieldref           #27.#597     // ext/mods/Config.CS_MPREG1_FEE:I
   #597 = NameAndType        #598:#86     // CS_MPREG1_FEE:I
   #598 = Utf8               CS_MPREG1_FEE
   #599 = String             #600         // CastleMpRegenerationFeeLvl2
   #600 = Utf8               CastleMpRegenerationFeeLvl2
   #601 = Fieldref           #27.#602     // ext/mods/Config.CS_MPREG2_FEE:I
   #602 = NameAndType        #603:#86     // CS_MPREG2_FEE:I
   #603 = Utf8               CS_MPREG2_FEE
   #604 = String             #605         // CastleMpRegenerationFeeLvl3
   #605 = Utf8               CastleMpRegenerationFeeLvl3
   #606 = Fieldref           #27.#607     // ext/mods/Config.CS_MPREG3_FEE:I
   #607 = NameAndType        #608:#86     // CS_MPREG3_FEE:I
   #608 = Utf8               CS_MPREG3_FEE
   #609 = String             #610         // CastleMpRegenerationFeeLvl4
   #610 = Utf8               CastleMpRegenerationFeeLvl4
   #611 = Fieldref           #27.#612     // ext/mods/Config.CS_MPREG4_FEE:I
   #612 = NameAndType        #613:#86     // CS_MPREG4_FEE:I
   #613 = Utf8               CS_MPREG4_FEE
   #614 = String             #615         // CastleHpRegenerationFunctionFeeRatio
   #615 = Utf8               CastleHpRegenerationFunctionFeeRatio
   #616 = Fieldref           #27.#617     // ext/mods/Config.CS_HPREG_FEE_RATIO:J
   #617 = NameAndType        #618:#120    // CS_HPREG_FEE_RATIO:J
   #618 = Utf8               CS_HPREG_FEE_RATIO
   #619 = String             #620         // CastleHpRegenerationFeeLvl1
   #620 = Utf8               CastleHpRegenerationFeeLvl1
   #621 = Fieldref           #27.#622     // ext/mods/Config.CS_HPREG1_FEE:I
   #622 = NameAndType        #623:#86     // CS_HPREG1_FEE:I
   #623 = Utf8               CS_HPREG1_FEE
   #624 = String             #625         // CastleHpRegenerationFeeLvl2
   #625 = Utf8               CastleHpRegenerationFeeLvl2
   #626 = Fieldref           #27.#627     // ext/mods/Config.CS_HPREG2_FEE:I
   #627 = NameAndType        #628:#86     // CS_HPREG2_FEE:I
   #628 = Utf8               CS_HPREG2_FEE
   #629 = String             #630         // CastleHpRegenerationFeeLvl3
   #630 = Utf8               CastleHpRegenerationFeeLvl3
   #631 = Fieldref           #27.#632     // ext/mods/Config.CS_HPREG3_FEE:I
   #632 = NameAndType        #633:#86     // CS_HPREG3_FEE:I
   #633 = Utf8               CS_HPREG3_FEE
   #634 = String             #635         // CastleHpRegenerationFeeLvl4
   #635 = Utf8               CastleHpRegenerationFeeLvl4
   #636 = Fieldref           #27.#637     // ext/mods/Config.CS_HPREG4_FEE:I
   #637 = NameAndType        #638:#86     // CS_HPREG4_FEE:I
   #638 = Utf8               CS_HPREG4_FEE
   #639 = String             #640         // CastleHpRegenerationFeeLvl5
   #640 = Utf8               CastleHpRegenerationFeeLvl5
   #641 = Fieldref           #27.#642     // ext/mods/Config.CS_HPREG5_FEE:I
   #642 = NameAndType        #643:#86     // CS_HPREG5_FEE:I
   #643 = Utf8               CS_HPREG5_FEE
   #644 = String             #645         // CastleExpRegenerationFunctionFeeRatio
   #645 = Utf8               CastleExpRegenerationFunctionFeeRatio
   #646 = Fieldref           #27.#647     // ext/mods/Config.CS_EXPREG_FEE_RATIO:J
   #647 = NameAndType        #648:#120    // CS_EXPREG_FEE_RATIO:J
   #648 = Utf8               CS_EXPREG_FEE_RATIO
   #649 = String             #650         // CastleExpRegenerationFeeLvl1
   #650 = Utf8               CastleExpRegenerationFeeLvl1
   #651 = Fieldref           #27.#652     // ext/mods/Config.CS_EXPREG1_FEE:I
   #652 = NameAndType        #653:#86     // CS_EXPREG1_FEE:I
   #653 = Utf8               CS_EXPREG1_FEE
   #654 = String             #655         // CastleExpRegenerationFeeLvl2
   #655 = Utf8               CastleExpRegenerationFeeLvl2
   #656 = Fieldref           #27.#657     // ext/mods/Config.CS_EXPREG2_FEE:I
   #657 = NameAndType        #658:#86     // CS_EXPREG2_FEE:I
   #658 = Utf8               CS_EXPREG2_FEE
   #659 = String             #660         // CastleExpRegenerationFeeLvl3
   #660 = Utf8               CastleExpRegenerationFeeLvl3
   #661 = Fieldref           #27.#662     // ext/mods/Config.CS_EXPREG3_FEE:I
   #662 = NameAndType        #663:#86     // CS_EXPREG3_FEE:I
   #663 = Utf8               CS_EXPREG3_FEE
   #664 = String             #665         // CastleExpRegenerationFeeLvl4
   #665 = Utf8               CastleExpRegenerationFeeLvl4
   #666 = Fieldref           #27.#667     // ext/mods/Config.CS_EXPREG4_FEE:I
   #667 = NameAndType        #668:#86     // CS_EXPREG4_FEE:I
   #668 = Utf8               CS_EXPREG4_FEE
   #669 = Fieldref           #27.#670     // ext/mods/Config.BOSS_HEAL_FILE:Ljava/lang/String;
   #670 = NameAndType        #671:#43     // BOSS_HEAL_FILE:Ljava/lang/String;
   #671 = Utf8               BOSS_HEAL_FILE
   #672 = String             #673         // BlockHealOnRaidBoss
   #673 = Utf8               BlockHealOnRaidBoss
   #674 = Fieldref           #27.#675     // ext/mods/Config.BLOCK_HEAL_ON_RAIDBOSS:Z
   #675 = NameAndType        #676:#57     // BLOCK_HEAL_ON_RAIDBOSS:Z
   #676 = Utf8               BLOCK_HEAL_ON_RAIDBOSS
   #677 = String             #678         // BlockHealOnGrandBoss
   #678 = Utf8               BlockHealOnGrandBoss
   #679 = Fieldref           #27.#680     // ext/mods/Config.BLOCK_HEAL_ON_GRANDBOSS:Z
   #680 = NameAndType        #681:#57     // BLOCK_HEAL_ON_GRANDBOSS:Z
   #681 = Utf8               BLOCK_HEAL_ON_GRANDBOSS
   #682 = String             #683         // BlockedHealSkillIds
   #683 = Utf8               BlockedHealSkillIds
   #684 = Fieldref           #27.#685     // ext/mods/Config.BLOCKED_HEAL_SKILL_IDS:Ljava/util/Set;
   #685 = NameAndType        #686:#453    // BLOCKED_HEAL_SKILL_IDS:Ljava/util/Set;
   #686 = Utf8               BLOCKED_HEAL_SKILL_IDS
   #687 = String             #688         // Invalid skill ID in BlockedHealSkillIds: {}
   #688 = Utf8               Invalid skill ID in BlockedHealSkillIds: {}
   #689 = String             #690         // HealBlockMessage
   #690 = Utf8               HealBlockMessage
   #691 = Fieldref           #27.#692     // ext/mods/Config.HEAL_BLOCK_MESSAGE:Ljava/lang/String;
   #692 = NameAndType        #693:#43     // HEAL_BLOCK_MESSAGE:Ljava/lang/String;
   #693 = Utf8               HEAL_BLOCK_MESSAGE
   #694 = Fieldref           #27.#695     // ext/mods/Config.EVENTS_FILE:Ljava/lang/String;
   #695 = NameAndType        #696:#43     // EVENTS_FILE:Ljava/lang/String;
   #696 = Utf8               EVENTS_FILE
   #697 = String             #698         // OlympiadEnabled
   #698 = Utf8               OlympiadEnabled
   #699 = Fieldref           #27.#700     // ext/mods/Config.OLY_ENABLED:Z
   #700 = NameAndType        #701:#57     // OLY_ENABLED:Z
   #701 = Utf8               OLY_ENABLED
   #702 = String             #703         // OlyStartTime
   #703 = Utf8               OlyStartTime
   #704 = Fieldref           #27.#705     // ext/mods/Config.OLY_START_TIME:I
   #705 = NameAndType        #706:#86     // OLY_START_TIME:I
   #706 = Utf8               OLY_START_TIME
   #707 = String             #708         // OlyMin
   #708 = Utf8               OlyMin
   #709 = Fieldref           #27.#710     // ext/mods/Config.OLY_MIN:I
   #710 = NameAndType        #711:#86     // OLY_MIN:I
   #711 = Utf8               OLY_MIN
   #712 = String             #713         // OlyCPeriod
   #713 = Utf8               OlyCPeriod
   #714 = Long               21600000l
   #716 = Fieldref           #27.#717     // ext/mods/Config.OLY_CPERIOD:J
   #717 = NameAndType        #718:#120    // OLY_CPERIOD:J
   #718 = Utf8               OLY_CPERIOD
   #719 = String             #720         // OlyBattle
   #720 = Utf8               OlyBattle
   #721 = Long               180000l
   #723 = Fieldref           #27.#724     // ext/mods/Config.OLY_BATTLE:J
   #724 = NameAndType        #725:#120    // OLY_BATTLE:J
   #725 = Utf8               OLY_BATTLE
   #726 = String             #727         // OlyWPeriod
   #727 = Utf8               OlyWPeriod
   #728 = Fieldref           #27.#729     // ext/mods/Config.OLY_WPERIOD:J
   #729 = NameAndType        #730:#120    // OLY_WPERIOD:J
   #730 = Utf8               OLY_WPERIOD
   #731 = String             #732         // OlyVPeriod
   #732 = Utf8               OlyVPeriod
   #733 = Fieldref           #27.#734     // ext/mods/Config.OLY_VPERIOD:J
   #734 = NameAndType        #735:#120    // OLY_VPERIOD:J
   #735 = Utf8               OLY_VPERIOD
   #736 = String             #737         // OlyWaitTime
   #737 = Utf8               OlyWaitTime
   #738 = Fieldref           #27.#739     // ext/mods/Config.OLY_WAIT_TIME:I
   #739 = NameAndType        #740:#86     // OLY_WAIT_TIME:I
   #740 = Utf8               OLY_WAIT_TIME
   #741 = String             #742         // OlyWaitBattle
   #742 = Utf8               OlyWaitBattle
   #743 = Fieldref           #27.#744     // ext/mods/Config.OLY_WAIT_BATTLE:I
   #744 = NameAndType        #745:#86     // OLY_WAIT_BATTLE:I
   #745 = Utf8               OLY_WAIT_BATTLE
   #746 = String             #747         // OlyWaitEnd
   #747 = Utf8               OlyWaitEnd
   #748 = Fieldref           #27.#749     // ext/mods/Config.OLY_WAIT_END:I
   #749 = NameAndType        #750:#86     // OLY_WAIT_END:I
   #750 = Utf8               OLY_WAIT_END
   #751 = String             #752         // OlyStartPoints
   #752 = Utf8               OlyStartPoints
   #753 = Fieldref           #27.#754     // ext/mods/Config.OLY_START_POINTS:I
   #754 = NameAndType        #755:#86     // OLY_START_POINTS:I
   #755 = Utf8               OLY_START_POINTS
   #756 = String             #757         // OlyWeeklyPoints
   #757 = Utf8               OlyWeeklyPoints
   #758 = Fieldref           #27.#759     // ext/mods/Config.OLY_WEEKLY_POINTS:I
   #759 = NameAndType        #760:#86     // OLY_WEEKLY_POINTS:I
   #760 = Utf8               OLY_WEEKLY_POINTS
   #761 = String             #762         // OlyMinMatchesToBeClassed
   #762 = Utf8               OlyMinMatchesToBeClassed
   #763 = Fieldref           #27.#764     // ext/mods/Config.OLY_MIN_MATCHES:I
   #764 = NameAndType        #765:#86     // OLY_MIN_MATCHES:I
   #765 = Utf8               OLY_MIN_MATCHES
   #766 = String             #767         // OlyClassedParticipants
   #767 = Utf8               OlyClassedParticipants
   #768 = Fieldref           #27.#769     // ext/mods/Config.OLY_CLASSED:I
   #769 = NameAndType        #770:#86     // OLY_CLASSED:I
   #770 = Utf8               OLY_CLASSED
   #771 = String             #772         // OlyNonClassedParticipants
   #772 = Utf8               OlyNonClassedParticipants
   #773 = Fieldref           #27.#774     // ext/mods/Config.OLY_NONCLASSED:I
   #774 = NameAndType        #775:#86     // OLY_NONCLASSED:I
   #775 = Utf8               OLY_NONCLASSED
   #776 = String             #777         // OlyClassedReward
   #777 = Utf8               OlyClassedReward
   #778 = String             #779         // 6651-50
   #779 = Utf8               6651-50
   #780 = Methodref          #14.#781     // ext/mods/commons/config/ExProperties.parseIntIntList:(Ljava/lang/String;Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
   #781 = NameAndType        #782:#783    // parseIntIntList:(Ljava/lang/String;Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
   #782 = Utf8               parseIntIntList
   #783 = Utf8               (Ljava/lang/String;Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
   #784 = Fieldref           #27.#785     // ext/mods/Config.OLY_CLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #785 = NameAndType        #786:#787    // OLY_CLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #786 = Utf8               OLY_CLASSED_REWARD
   #787 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
   #788 = String             #789         // OlyNonClassedReward
   #789 = Utf8               OlyNonClassedReward
   #790 = String             #791         // 6651-30
   #791 = Utf8               6651-30
   #792 = Fieldref           #27.#793     // ext/mods/Config.OLY_NONCLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #793 = NameAndType        #794:#787    // OLY_NONCLASSED_REWARD:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #794 = Utf8               OLY_NONCLASSED_REWARD
   #795 = String             #796         // OlyGPPerPoint
   #796 = Utf8               OlyGPPerPoint
   #797 = Fieldref           #27.#798     // ext/mods/Config.OLY_GP_PER_POINT:I
   #798 = NameAndType        #799:#86     // OLY_GP_PER_POINT:I
   #799 = Utf8               OLY_GP_PER_POINT
   #800 = String             #801         // OlyHeroPoints
   #801 = Utf8               OlyHeroPoints
   #802 = Fieldref           #27.#803     // ext/mods/Config.OLY_HERO_POINTS:I
   #803 = NameAndType        #804:#86     // OLY_HERO_POINTS:I
   #804 = Utf8               OLY_HERO_POINTS
   #805 = String             #806         // OlyRank1Points
   #806 = Utf8               OlyRank1Points
   #807 = Fieldref           #27.#808     // ext/mods/Config.OLY_RANK1_POINTS:I
   #808 = NameAndType        #809:#86     // OLY_RANK1_POINTS:I
   #809 = Utf8               OLY_RANK1_POINTS
   #810 = String             #811         // OlyRank2Points
   #811 = Utf8               OlyRank2Points
   #812 = Fieldref           #27.#813     // ext/mods/Config.OLY_RANK2_POINTS:I
   #813 = NameAndType        #814:#86     // OLY_RANK2_POINTS:I
   #814 = Utf8               OLY_RANK2_POINTS
   #815 = String             #816         // OlyRank3Points
   #816 = Utf8               OlyRank3Points
   #817 = Fieldref           #27.#818     // ext/mods/Config.OLY_RANK3_POINTS:I
   #818 = NameAndType        #819:#86     // OLY_RANK3_POINTS:I
   #819 = Utf8               OLY_RANK3_POINTS
   #820 = String             #821         // OlyRank4Points
   #821 = Utf8               OlyRank4Points
   #822 = Fieldref           #27.#823     // ext/mods/Config.OLY_RANK4_POINTS:I
   #823 = NameAndType        #824:#86     // OLY_RANK4_POINTS:I
   #824 = Utf8               OLY_RANK4_POINTS
   #825 = String             #826         // OlyRank5Points
   #826 = Utf8               OlyRank5Points
   #827 = Fieldref           #27.#828     // ext/mods/Config.OLY_RANK5_POINTS:I
   #828 = NameAndType        #829:#86     // OLY_RANK5_POINTS:I
   #829 = Utf8               OLY_RANK5_POINTS
   #830 = String             #831         // OlyMaxPoints
   #831 = Utf8               OlyMaxPoints
   #832 = Fieldref           #27.#833     // ext/mods/Config.OLY_MAX_POINTS:I
   #833 = NameAndType        #834:#86     // OLY_MAX_POINTS:I
   #834 = Utf8               OLY_MAX_POINTS
   #835 = String             #836         // OlyDividerClassed
   #836 = Utf8               OlyDividerClassed
   #837 = Fieldref           #27.#838     // ext/mods/Config.OLY_DIVIDER_CLASSED:I
   #838 = NameAndType        #839:#86     // OLY_DIVIDER_CLASSED:I
   #839 = Utf8               OLY_DIVIDER_CLASSED
   #840 = String             #841         // OlyDividerNonClassed
   #841 = Utf8               OlyDividerNonClassed
   #842 = Fieldref           #27.#843     // ext/mods/Config.OLY_DIVIDER_NON_CLASSED:I
   #843 = NameAndType        #844:#86     // OLY_DIVIDER_NON_CLASSED:I
   #844 = Utf8               OLY_DIVIDER_NON_CLASSED
   #845 = String             #846         // OlyAnnounceGames
   #846 = Utf8               OlyAnnounceGames
   #847 = Fieldref           #27.#848     // ext/mods/Config.OLY_ANNOUNCE_GAMES:Z
   #848 = NameAndType        #849:#57     // OLY_ANNOUNCE_GAMES:Z
   #849 = Utf8               OLY_ANNOUNCE_GAMES
   #850 = String             #851         // OlyMaxEnchant
   #851 = Utf8               OlyMaxEnchant
   #852 = Fieldref           #27.#853     // ext/mods/Config.OLY_ENCHANT_LIMIT:I
   #853 = NameAndType        #854:#86     // OLY_ENCHANT_LIMIT:I
   #854 = Utf8               OLY_ENCHANT_LIMIT
   #855 = String             #856         // OlyShowMonthlyWinners
   #856 = Utf8               OlyShowMonthlyWinners
   #857 = Fieldref           #27.#858     // ext/mods/Config.OLY_SHOW_MONTHLY_WINNERS:Z
   #858 = NameAndType        #859:#57     // OLY_SHOW_MONTHLY_WINNERS:Z
   #859 = Utf8               OLY_SHOW_MONTHLY_WINNERS
   #860 = String             #861         // SevenSignsBypassPrerequisites
   #861 = Utf8               SevenSignsBypassPrerequisites
   #862 = Fieldref           #27.#863     // ext/mods/Config.SEVEN_SIGNS_BYPASS_PREREQUISITES:Z
   #863 = NameAndType        #864:#57     // SEVEN_SIGNS_BYPASS_PREREQUISITES:Z
   #864 = Utf8               SEVEN_SIGNS_BYPASS_PREREQUISITES
   #865 = String             #866         // FestivalMinPlayer
   #866 = Utf8               FestivalMinPlayer
   #867 = Methodref          #868.#869    // java/lang/Math.clamp:(JII)I
   #868 = Class              #870         // java/lang/Math
   #869 = NameAndType        #871:#872    // clamp:(JII)I
   #870 = Utf8               java/lang/Math
   #871 = Utf8               clamp
   #872 = Utf8               (JII)I
   #873 = Fieldref           #27.#874     // ext/mods/Config.FESTIVAL_MIN_PLAYER:I
   #874 = NameAndType        #875:#86     // FESTIVAL_MIN_PLAYER:I
   #875 = Utf8               FESTIVAL_MIN_PLAYER
   #876 = String             #877         // MaxPlayerContrib
   #877 = Utf8               MaxPlayerContrib
   #878 = Integer            1000000
   #879 = Fieldref           #27.#880     // ext/mods/Config.MAXIMUM_PLAYER_CONTRIB:I
   #880 = NameAndType        #881:#86     // MAXIMUM_PLAYER_CONTRIB:I
   #881 = Utf8               MAXIMUM_PLAYER_CONTRIB
   #882 = String             #883         // NeededPartyMembers
   #883 = Utf8               NeededPartyMembers
   #884 = Fieldref           #27.#885     // ext/mods/Config.FS_PARTY_MEMBER_COUNT:I
   #885 = NameAndType        #886:#86     // FS_PARTY_MEMBER_COUNT:I
   #886 = Utf8               FS_PARTY_MEMBER_COUNT
   #887 = String             #888         // RiftMinPartySize
   #888 = Utf8               RiftMinPartySize
   #889 = Fieldref           #27.#890     // ext/mods/Config.RIFT_MIN_PARTY_SIZE:I
   #890 = NameAndType        #891:#86     // RIFT_MIN_PARTY_SIZE:I
   #891 = Utf8               RIFT_MIN_PARTY_SIZE
   #892 = String             #893         // AutoJumpsDelayMin
   #893 = Utf8               AutoJumpsDelayMin
   #894 = Fieldref           #27.#895     // ext/mods/Config.RIFT_AUTO_JUMPS_TIME_MIN:I
   #895 = NameAndType        #896:#86     // RIFT_AUTO_JUMPS_TIME_MIN:I
   #896 = Utf8               RIFT_AUTO_JUMPS_TIME_MIN
   #897 = String             #898         // AutoJumpsDelayRnd
   #898 = Utf8               AutoJumpsDelayRnd
   #899 = Fieldref           #27.#900     // ext/mods/Config.RIFT_AUTO_JUMPS_TIME_RND:I
   #900 = NameAndType        #901:#86     // RIFT_AUTO_JUMPS_TIME_RND:I
   #901 = Utf8               RIFT_AUTO_JUMPS_TIME_RND
   #902 = String             #903         // RecruitCost
   #903 = Utf8               RecruitCost
   #904 = Fieldref           #27.#905     // ext/mods/Config.RIFT_ENTER_COST_RECRUIT:I
   #905 = NameAndType        #906:#86     // RIFT_ENTER_COST_RECRUIT:I
   #906 = Utf8               RIFT_ENTER_COST_RECRUIT
   #907 = String             #908         // SoldierCost
   #908 = Utf8               SoldierCost
   #909 = Fieldref           #27.#910     // ext/mods/Config.RIFT_ENTER_COST_SOLDIER:I
   #910 = NameAndType        #911:#86     // RIFT_ENTER_COST_SOLDIER:I
   #911 = Utf8               RIFT_ENTER_COST_SOLDIER
   #912 = String             #913         // OfficerCost
   #913 = Utf8               OfficerCost
   #914 = Fieldref           #27.#915     // ext/mods/Config.RIFT_ENTER_COST_OFFICER:I
   #915 = NameAndType        #916:#86     // RIFT_ENTER_COST_OFFICER:I
   #916 = Utf8               RIFT_ENTER_COST_OFFICER
   #917 = String             #918         // CaptainCost
   #918 = Utf8               CaptainCost
   #919 = Fieldref           #27.#920     // ext/mods/Config.RIFT_ENTER_COST_CAPTAIN:I
   #920 = NameAndType        #921:#86     // RIFT_ENTER_COST_CAPTAIN:I
   #921 = Utf8               RIFT_ENTER_COST_CAPTAIN
   #922 = String             #923         // CommanderCost
   #923 = Utf8               CommanderCost
   #924 = Fieldref           #27.#925     // ext/mods/Config.RIFT_ENTER_COST_COMMANDER:I
   #925 = NameAndType        #926:#86     // RIFT_ENTER_COST_COMMANDER:I
   #926 = Utf8               RIFT_ENTER_COST_COMMANDER
   #927 = String             #928         // HeroCost
   #928 = Utf8               HeroCost
   #929 = Fieldref           #27.#930     // ext/mods/Config.RIFT_ENTER_COST_HERO:I
   #930 = NameAndType        #931:#86     // RIFT_ENTER_COST_HERO:I
   #931 = Utf8               RIFT_ENTER_COST_HERO
   #932 = String             #933         // AnakazelPortChance
   #933 = Utf8               AnakazelPortChance
   #934 = Fieldref           #27.#935     // ext/mods/Config.RIFT_ANAKAZEL_PORT_CHANCE:I
   #935 = NameAndType        #936:#86     // RIFT_ANAKAZEL_PORT_CHANCE:I
   #936 = Utf8               RIFT_ANAKAZEL_PORT_CHANCE
   #937 = String             #938         // LotteryPrize
   #938 = Utf8               LotteryPrize
   #939 = Integer            50000
   #940 = Fieldref           #27.#941     // ext/mods/Config.LOTTERY_PRIZE:I
   #941 = NameAndType        #942:#86     // LOTTERY_PRIZE:I
   #942 = Utf8               LOTTERY_PRIZE
   #943 = String             #944         // LotteryTicketPrice
   #944 = Utf8               LotteryTicketPrice
   #945 = Fieldref           #27.#946     // ext/mods/Config.LOTTERY_TICKET_PRICE:I
   #946 = NameAndType        #947:#86     // LOTTERY_TICKET_PRICE:I
   #947 = Utf8               LOTTERY_TICKET_PRICE
   #948 = String             #949         // Lottery5NumberRate
   #949 = Utf8               Lottery5NumberRate
   #950 = Double             0.6d
   #952 = Fieldref           #27.#953     // ext/mods/Config.LOTTERY_5_NUMBER_RATE:D
   #953 = NameAndType        #954:#365    // LOTTERY_5_NUMBER_RATE:D
   #954 = Utf8               LOTTERY_5_NUMBER_RATE
   #955 = String             #956         // Lottery4NumberRate
   #956 = Utf8               Lottery4NumberRate
   #957 = Double             0.2d
   #959 = Fieldref           #27.#960     // ext/mods/Config.LOTTERY_4_NUMBER_RATE:D
   #960 = NameAndType        #961:#365    // LOTTERY_4_NUMBER_RATE:D
   #961 = Utf8               LOTTERY_4_NUMBER_RATE
   #962 = String             #963         // Lottery3NumberRate
   #963 = Utf8               Lottery3NumberRate
   #964 = Fieldref           #27.#965     // ext/mods/Config.LOTTERY_3_NUMBER_RATE:D
   #965 = NameAndType        #966:#365    // LOTTERY_3_NUMBER_RATE:D
   #966 = Utf8               LOTTERY_3_NUMBER_RATE
   #967 = String             #968         // Lottery2and1NumberPrize
   #968 = Utf8               Lottery2and1NumberPrize
   #969 = Fieldref           #27.#970     // ext/mods/Config.LOTTERY_2_AND_1_NUMBER_PRIZE:I
   #970 = NameAndType        #971:#86     // LOTTERY_2_AND_1_NUMBER_PRIZE:I
   #971 = Utf8               LOTTERY_2_AND_1_NUMBER_PRIZE
   #972 = String             #973         // AllowFishChampionship
   #973 = Utf8               AllowFishChampionship
   #974 = Fieldref           #27.#975     // ext/mods/Config.ALLOW_FISH_CHAMPIONSHIP:Z
   #975 = NameAndType        #976:#57     // ALLOW_FISH_CHAMPIONSHIP:Z
   #976 = Utf8               ALLOW_FISH_CHAMPIONSHIP
   #977 = String             #978         // FishChampionshipRewardItemId
   #978 = Utf8               FishChampionshipRewardItemId
   #979 = Fieldref           #27.#980     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_ITEM:I
   #980 = NameAndType        #981:#86     // FISH_CHAMPIONSHIP_REWARD_ITEM:I
   #981 = Utf8               FISH_CHAMPIONSHIP_REWARD_ITEM
   #982 = String             #983         // FishChampionshipReward1
   #983 = Utf8               FishChampionshipReward1
   #984 = Integer            800000
   #985 = Fieldref           #27.#986     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_1:I
   #986 = NameAndType        #987:#86     // FISH_CHAMPIONSHIP_REWARD_1:I
   #987 = Utf8               FISH_CHAMPIONSHIP_REWARD_1
   #988 = String             #989         // FishChampionshipReward2
   #989 = Utf8               FishChampionshipReward2
   #990 = Integer            500000
   #991 = Fieldref           #27.#992     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_2:I
   #992 = NameAndType        #993:#86     // FISH_CHAMPIONSHIP_REWARD_2:I
   #993 = Utf8               FISH_CHAMPIONSHIP_REWARD_2
   #994 = String             #995         // FishChampionshipReward3
   #995 = Utf8               FishChampionshipReward3
   #996 = Integer            300000
   #997 = Fieldref           #27.#998     // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_3:I
   #998 = NameAndType        #999:#86     // FISH_CHAMPIONSHIP_REWARD_3:I
   #999 = Utf8               FISH_CHAMPIONSHIP_REWARD_3
  #1000 = String             #1001        // FishChampionshipReward4
  #1001 = Utf8               FishChampionshipReward4
  #1002 = Integer            200000
  #1003 = Fieldref           #27.#1004    // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_4:I
  #1004 = NameAndType        #1005:#86    // FISH_CHAMPIONSHIP_REWARD_4:I
  #1005 = Utf8               FISH_CHAMPIONSHIP_REWARD_4
  #1006 = String             #1007        // FishChampionshipReward5
  #1007 = Utf8               FishChampionshipReward5
  #1008 = Integer            100000
  #1009 = Fieldref           #27.#1010    // ext/mods/Config.FISH_CHAMPIONSHIP_REWARD_5:I
  #1010 = NameAndType        #1011:#86    // FISH_CHAMPIONSHIP_REWARD_5:I
  #1011 = Utf8               FISH_CHAMPIONSHIP_REWARD_5
  #1012 = String             #1013        // CofferPriceId
  #1013 = Utf8               CofferPriceId
  #1014 = Fieldref           #27.#1015    // ext/mods/Config.COFFER_PRICE_ID:I
  #1015 = NameAndType        #1016:#86    // COFFER_PRICE_ID:I
  #1016 = Utf8               COFFER_PRICE_ID
  #1017 = String             #1018        // CofferPriceCount
  #1018 = Utf8               CofferPriceCount
  #1019 = Fieldref           #27.#1020    // ext/mods/Config.COFFER_PRICE_AMOUNT:I
  #1020 = NameAndType        #1021:#86    // COFFER_PRICE_AMOUNT:I
  #1021 = Utf8               COFFER_PRICE_AMOUNT
  #1022 = String             #1023        // AllowEventCommands
  #1023 = Utf8               AllowEventCommands
  #1024 = Fieldref           #27.#1025    // ext/mods/Config.EVENT_COMMANDS:Z
  #1025 = NameAndType        #1026:#57    // EVENT_COMMANDS:Z
  #1026 = Utf8               EVENT_COMMANDS
  #1027 = String             #1028        // CTFEventEnabled
  #1028 = Utf8               CTFEventEnabled
  #1029 = Fieldref           #27.#1030    // ext/mods/Config.CTF_EVENT_ENABLED:Z
  #1030 = NameAndType        #1031:#57    // CTF_EVENT_ENABLED:Z
  #1031 = Utf8               CTF_EVENT_ENABLED
  #1032 = String             #1033        // CTFEventInterval
  #1033 = Utf8               CTFEventInterval
  #1034 = String             #1035        // 00:00,04:00,08:00,12:00,16:00,20:00
  #1035 = Utf8               00:00,04:00,08:00,12:00,16:00,20:00
  #1036 = Fieldref           #27.#1037    // ext/mods/Config.CTF_EVENT_INTERVAL:[Ljava/lang/String;
  #1037 = NameAndType        #1038:#1039  // CTF_EVENT_INTERVAL:[Ljava/lang/String;
  #1038 = Utf8               CTF_EVENT_INTERVAL
  #1039 = Utf8               [Ljava/lang/String;
  #1040 = String             #1041        // CTFEventParticipationTime
  #1041 = Utf8               CTFEventParticipationTime
  #1042 = Fieldref           #27.#1043    // ext/mods/Config.CTF_EVENT_PARTICIPATION_TIME:I
  #1043 = NameAndType        #1044:#86    // CTF_EVENT_PARTICIPATION_TIME:I
  #1044 = Utf8               CTF_EVENT_PARTICIPATION_TIME
  #1045 = String             #1046        // CTFEventRunningTime
  #1046 = Utf8               CTFEventRunningTime
  #1047 = Fieldref           #27.#1048    // ext/mods/Config.CTF_EVENT_RUNNING_TIME:I
  #1048 = NameAndType        #1049:#86    // CTF_EVENT_RUNNING_TIME:I
  #1049 = Utf8               CTF_EVENT_RUNNING_TIME
  #1050 = String             #1051        // CTFNpcLocName
  #1051 = Utf8               CTFNpcLocName
  #1052 = String             #1053        // Giran Town
  #1053 = Utf8               Giran Town
  #1054 = Fieldref           #27.#1055    // ext/mods/Config.CTF_NPC_LOC_NAME:Ljava/lang/String;
  #1055 = NameAndType        #1056:#43    // CTF_NPC_LOC_NAME:Ljava/lang/String;
  #1056 = Utf8               CTF_NPC_LOC_NAME
  #1057 = String             #1058        // CTFEventParticipationNpcId
  #1058 = Utf8               CTFEventParticipationNpcId
  #1059 = Fieldref           #27.#1060    // ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_ID:I
  #1060 = NameAndType        #1061:#86    // CTF_EVENT_PARTICIPATION_NPC_ID:I
  #1061 = Utf8               CTF_EVENT_PARTICIPATION_NPC_ID
  #1062 = String             #1063        // CTFEventFirstTeamHeadquartersId
  #1063 = Utf8               CTFEventFirstTeamHeadquartersId
  #1064 = Fieldref           #27.#1065    // ext/mods/Config.CTF_EVENT_TEAM_1_HEADQUARTERS_ID:I
  #1065 = NameAndType        #1066:#86    // CTF_EVENT_TEAM_1_HEADQUARTERS_ID:I
  #1066 = Utf8               CTF_EVENT_TEAM_1_HEADQUARTERS_ID
  #1067 = String             #1068        // CTFEventSecondTeamHeadquartersId
  #1068 = Utf8               CTFEventSecondTeamHeadquartersId
  #1069 = Fieldref           #27.#1070    // ext/mods/Config.CTF_EVENT_TEAM_2_HEADQUARTERS_ID:I
  #1070 = NameAndType        #1071:#86    // CTF_EVENT_TEAM_2_HEADQUARTERS_ID:I
  #1071 = Utf8               CTF_EVENT_TEAM_2_HEADQUARTERS_ID
  #1072 = String             #1073        // CTFEventFirstTeamFlag
  #1073 = Utf8               CTFEventFirstTeamFlag
  #1074 = Fieldref           #27.#1075    // ext/mods/Config.CTF_EVENT_TEAM_1_FLAG:I
  #1075 = NameAndType        #1076:#86    // CTF_EVENT_TEAM_1_FLAG:I
  #1076 = Utf8               CTF_EVENT_TEAM_1_FLAG
  #1077 = String             #1078        // CTFEventSecondTeamFlag
  #1078 = Utf8               CTFEventSecondTeamFlag
  #1079 = Fieldref           #27.#1080    // ext/mods/Config.CTF_EVENT_TEAM_2_FLAG:I
  #1080 = NameAndType        #1081:#86    // CTF_EVENT_TEAM_2_FLAG:I
  #1081 = Utf8               CTF_EVENT_TEAM_2_FLAG
  #1082 = String             #1083        // CTFEventCaptureSkillId
  #1083 = Utf8               CTFEventCaptureSkillId
  #1084 = Fieldref           #27.#1085    // ext/mods/Config.CTF_EVENT_CAPTURE_SKILL:I
  #1085 = NameAndType        #1086:#86    // CTF_EVENT_CAPTURE_SKILL:I
  #1086 = Utf8               CTF_EVENT_CAPTURE_SKILL
  #1087 = String             #1088        // CTFEventParticipationFee
  #1088 = Utf8               CTFEventParticipationFee
  #1089 = Methodref          #14.#1090    // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[I)[I
  #1090 = NameAndType        #52:#1091    // getProperty:(Ljava/lang/String;[I)[I
  #1091 = Utf8               (Ljava/lang/String;[I)[I
  #1092 = Fieldref           #27.#1093    // ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
  #1093 = NameAndType        #1094:#388   // CTF_EVENT_PARTICIPATION_FEE:[I
  #1094 = Utf8               CTF_EVENT_PARTICIPATION_FEE
  #1095 = String             #1096        // CTFEventParticipationNpcCoordinates
  #1096 = Utf8               CTFEventParticipationNpcCoordinates
  #1097 = Integer            83425
  #1098 = Integer            148585
  #1099 = Fieldref           #27.#1100    // ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1100 = NameAndType        #1101:#388   // CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1101 = Utf8               CTF_EVENT_PARTICIPATION_NPC_COORDINATES
  #1102 = String             #1103        // CTFEventMinPlayersInTeams
  #1103 = Utf8               CTFEventMinPlayersInTeams
  #1104 = Fieldref           #27.#1105    // ext/mods/Config.CTF_EVENT_MIN_PLAYERS_IN_TEAMS:I
  #1105 = NameAndType        #1106:#86    // CTF_EVENT_MIN_PLAYERS_IN_TEAMS:I
  #1106 = Utf8               CTF_EVENT_MIN_PLAYERS_IN_TEAMS
  #1107 = String             #1108        // CTFEventMaxPlayersInTeams
  #1108 = Utf8               CTFEventMaxPlayersInTeams
  #1109 = Fieldref           #27.#1110    // ext/mods/Config.CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
  #1110 = NameAndType        #1111:#86    // CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
  #1111 = Utf8               CTF_EVENT_MAX_PLAYERS_IN_TEAMS
  #1112 = String             #1113        // CTFEventMinPlayerLevel
  #1113 = Utf8               CTFEventMinPlayerLevel
  #1114 = String             #1115        // 1
  #1115 = Utf8               1
  #1116 = Methodref          #1117.#1118  // java/lang/Byte.parseByte:(Ljava/lang/String;)B
  #1117 = Class              #1119        // java/lang/Byte
  #1118 = NameAndType        #1120:#1121  // parseByte:(Ljava/lang/String;)B
  #1119 = Utf8               java/lang/Byte
  #1120 = Utf8               parseByte
  #1121 = Utf8               (Ljava/lang/String;)B
  #1122 = Fieldref           #27.#1123    // ext/mods/Config.CTF_EVENT_MIN_LVL:B
  #1123 = NameAndType        #1124:#1125  // CTF_EVENT_MIN_LVL:B
  #1124 = Utf8               CTF_EVENT_MIN_LVL
  #1125 = Utf8               B
  #1126 = String             #1127        // CTFEventMaxPlayerLevel
  #1127 = Utf8               CTFEventMaxPlayerLevel
  #1128 = String             #1129        // 80
  #1129 = Utf8               80
  #1130 = Fieldref           #27.#1131    // ext/mods/Config.CTF_EVENT_MAX_LVL:B
  #1131 = NameAndType        #1132:#1125  // CTF_EVENT_MAX_LVL:B
  #1132 = Utf8               CTF_EVENT_MAX_LVL
  #1133 = String             #1134        // CTFEventRespawnTeleportDelay
  #1134 = Utf8               CTFEventRespawnTeleportDelay
  #1135 = Fieldref           #27.#1136    // ext/mods/Config.CTF_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1136 = NameAndType        #1137:#86    // CTF_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1137 = Utf8               CTF_EVENT_RESPAWN_TELEPORT_DELAY
  #1138 = String             #1139        // CTFEventStartLeaveTeleportDelay
  #1139 = Utf8               CTFEventStartLeaveTeleportDelay
  #1140 = Fieldref           #27.#1141    // ext/mods/Config.CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1141 = NameAndType        #1142:#86    // CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1142 = Utf8               CTF_EVENT_START_LEAVE_TELEPORT_DELAY
  #1143 = String             #1144        // CTFEventTeam1Name
  #1144 = Utf8               CTFEventTeam1Name
  #1145 = String             #1146        // Team1
  #1146 = Utf8               Team1
  #1147 = Fieldref           #27.#1148    // ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #1148 = NameAndType        #1149:#43    // CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #1149 = Utf8               CTF_EVENT_TEAM_1_NAME
  #1150 = String             #1151        // CTFEventTeam1Coordinates
  #1151 = Utf8               CTFEventTeam1Coordinates
  #1152 = Integer            148607
  #1153 = Integer            46719
  #1154 = Fieldref           #27.#1155    // ext/mods/Config.CTF_EVENT_TEAM_1_COORDINATES:[I
  #1155 = NameAndType        #1156:#388   // CTF_EVENT_TEAM_1_COORDINATES:[I
  #1156 = Utf8               CTF_EVENT_TEAM_1_COORDINATES
  #1157 = String             #1158        // CTFEventTeam1FlagCoordinates
  #1158 = Utf8               CTFEventTeam1FlagCoordinates
  #1159 = Integer            148314
  #1160 = Integer            46715
  #1161 = Fieldref           #27.#1162    // ext/mods/Config.CTF_EVENT_TEAM_1_FLAG_COORDINATES:[I
  #1162 = NameAndType        #1163:#388   // CTF_EVENT_TEAM_1_FLAG_COORDINATES:[I
  #1163 = Utf8               CTF_EVENT_TEAM_1_FLAG_COORDINATES
  #1164 = String             #1165        // CTFEventTeam2Name
  #1165 = Utf8               CTFEventTeam2Name
  #1166 = String             #1167        // Team2
  #1167 = Utf8               Team2
  #1168 = Fieldref           #27.#1169    // ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #1169 = NameAndType        #1170:#43    // CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #1170 = Utf8               CTF_EVENT_TEAM_2_NAME
  #1171 = String             #1172        // CTFEventTeam2Coordinates
  #1172 = Utf8               CTFEventTeam2Coordinates
  #1173 = Integer            150439
  #1174 = Integer            46731
  #1175 = Fieldref           #27.#1176    // ext/mods/Config.CTF_EVENT_TEAM_2_COORDINATES:[I
  #1176 = NameAndType        #1177:#388   // CTF_EVENT_TEAM_2_COORDINATES:[I
  #1177 = Utf8               CTF_EVENT_TEAM_2_COORDINATES
  #1178 = String             #1179        // CTFEventTeam2FlagCoordinates
  #1179 = Utf8               CTFEventTeam2FlagCoordinates
  #1180 = Integer            150686
  #1181 = Integer            46713
  #1182 = Fieldref           #27.#1183    // ext/mods/Config.CTF_EVENT_TEAM_2_FLAG_COORDINATES:[I
  #1183 = NameAndType        #1184:#388   // CTF_EVENT_TEAM_2_FLAG_COORDINATES:[I
  #1184 = Utf8               CTF_EVENT_TEAM_2_FLAG_COORDINATES
  #1185 = String             #1186        // CTFEventReward
  #1186 = Utf8               CTFEventReward
  #1187 = String             #1188        // 57-100000;4037-20
  #1188 = Utf8               57-100000;4037-20
  #1189 = Fieldref           #27.#1190    // ext/mods/Config.CTF_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1190 = NameAndType        #1191:#787   // CTF_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1191 = Utf8               CTF_EVENT_REWARDS
  #1192 = String             #1193        // CTFEventTargetTeamMembersAllowed
  #1193 = Utf8               CTFEventTargetTeamMembersAllowed
  #1194 = Fieldref           #27.#1195    // ext/mods/Config.CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
  #1195 = NameAndType        #1196:#57    // CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
  #1196 = Utf8               CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED
  #1197 = String             #1198        // CTFEventScrollsAllowed
  #1198 = Utf8               CTFEventScrollsAllowed
  #1199 = Fieldref           #27.#1200    // ext/mods/Config.CTF_EVENT_SCROLL_ALLOWED:Z
  #1200 = NameAndType        #1201:#57    // CTF_EVENT_SCROLL_ALLOWED:Z
  #1201 = Utf8               CTF_EVENT_SCROLL_ALLOWED
  #1202 = String             #1203        // CTFEventPotionsAllowed
  #1203 = Utf8               CTFEventPotionsAllowed
  #1204 = Fieldref           #27.#1205    // ext/mods/Config.CTF_EVENT_POTIONS_ALLOWED:Z
  #1205 = NameAndType        #1206:#57    // CTF_EVENT_POTIONS_ALLOWED:Z
  #1206 = Utf8               CTF_EVENT_POTIONS_ALLOWED
  #1207 = String             #1208        // CTFEventSummonByItemAllowed
  #1208 = Utf8               CTFEventSummonByItemAllowed
  #1209 = Fieldref           #27.#1210    // ext/mods/Config.CTF_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1210 = NameAndType        #1211:#57    // CTF_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1211 = Utf8               CTF_EVENT_SUMMON_BY_ITEM_ALLOWED
  #1212 = String             #1213        // CTFDoorsToOpen
  #1213 = Utf8               CTFDoorsToOpen
  #1214 = String             #1215        // 24190001;24190002;24190003;24190004
  #1215 = Utf8               24190001;24190002;24190003;24190004
  #1216 = String             #1217        // ;
  #1217 = Utf8               ;
  #1218 = Fieldref           #27.#1219    // ext/mods/Config.CTF_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1219 = NameAndType        #1220:#1221  // CTF_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1220 = Utf8               CTF_DOORS_IDS_TO_OPEN
  #1221 = Utf8               Ljava/util/List;
  #1222 = InvokeDynamic      #2:#227      // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1223 = Methodref          #35.#1224    // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #1224 = NameAndType        #418:#1225   // warn:(Ljava/lang/Object;)V
  #1225 = Utf8               (Ljava/lang/Object;)V
  #1226 = String             #1227        // CTFDoorsToClose
  #1227 = Utf8               CTFDoorsToClose
  #1228 = Fieldref           #27.#1229    // ext/mods/Config.CTF_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1229 = NameAndType        #1230:#1221  // CTF_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1230 = Utf8               CTF_DOORS_IDS_TO_CLOSE
  #1231 = String             #1232        // CTFRewardTeamTie
  #1232 = Utf8               CTFRewardTeamTie
  #1233 = Fieldref           #27.#1234    // ext/mods/Config.CTF_REWARD_TEAM_TIE:Z
  #1234 = NameAndType        #1235:#57    // CTF_REWARD_TEAM_TIE:Z
  #1235 = Utf8               CTF_REWARD_TEAM_TIE
  #1236 = String             #1237        // CTFEventEffectsRemoval
  #1237 = Utf8               CTFEventEffectsRemoval
  #1238 = Fieldref           #27.#1239    // ext/mods/Config.CTF_EVENT_EFFECTS_REMOVAL:I
  #1239 = NameAndType        #1240:#86    // CTF_EVENT_EFFECTS_REMOVAL:I
  #1240 = Utf8               CTF_EVENT_EFFECTS_REMOVAL
  #1241 = Class              #1242        // java/util/HashMap
  #1242 = Utf8               java/util/HashMap
  #1243 = Methodref          #1241.#3     // java/util/HashMap."<init>":()V
  #1244 = Fieldref           #27.#1245    // ext/mods/Config.CTF_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1245 = NameAndType        #1246:#1247  // CTF_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1246 = Utf8               CTF_EVENT_FIGHTER_BUFFS
  #1247 = Utf8               Ljava/util/Map;
  #1248 = String             #1249        // CTFEventFighterBuffs
  #1249 = Utf8               CTFEventFighterBuffs
  #1250 = Class              #1039        // "[Ljava/lang/String;"
  #1251 = Methodref          #14.#1252    // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
  #1252 = NameAndType        #52:#1253    // getProperty:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
  #1253 = Utf8               (Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
  #1254 = InterfaceMethodref #1255.#1256  // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1255 = Class              #1257        // java/util/Map
  #1256 = NameAndType        #1258:#1259  // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1257 = Utf8               java/util/Map
  #1258 = Utf8               put
  #1259 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1260 = Fieldref           #27.#1261    // ext/mods/Config.CTF_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1261 = NameAndType        #1262:#1247  // CTF_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1262 = Utf8               CTF_EVENT_MAGE_BUFFS
  #1263 = String             #1264        // CTFEventMageBuffs
  #1264 = Utf8               CTFEventMageBuffs
  #1265 = String             #1266        // AllowDlgCTFInvite
  #1266 = Utf8               AllowDlgCTFInvite
  #1267 = Fieldref           #27.#1268    // ext/mods/Config.ALLOW_CTF_DLG:Z
  #1268 = NameAndType        #1269:#57    // ALLOW_CTF_DLG:Z
  #1269 = Utf8               ALLOW_CTF_DLG
  #1270 = String             #1271        // CTFEventMaxParticipantsPerIP
  #1271 = Utf8               CTFEventMaxParticipantsPerIP
  #1272 = Fieldref           #27.#1273    // ext/mods/Config.CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1273 = NameAndType        #1274:#86    // CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1274 = Utf8               CTF_EVENT_MAX_PARTICIPANTS_PER_IP
  #1275 = String             #1276        // DMEventEnabled
  #1276 = Utf8               DMEventEnabled
  #1277 = Fieldref           #27.#1278    // ext/mods/Config.DM_EVENT_ENABLED:Z
  #1278 = NameAndType        #1279:#57    // DM_EVENT_ENABLED:Z
  #1279 = Utf8               DM_EVENT_ENABLED
  #1280 = String             #1281        // DMEventInterval
  #1281 = Utf8               DMEventInterval
  #1282 = String             #1283        // 01:00,05:00,09:00,13:00,17:00,21:00
  #1283 = Utf8               01:00,05:00,09:00,13:00,17:00,21:00
  #1284 = Fieldref           #27.#1285    // ext/mods/Config.DM_EVENT_INTERVAL:[Ljava/lang/String;
  #1285 = NameAndType        #1286:#1039  // DM_EVENT_INTERVAL:[Ljava/lang/String;
  #1286 = Utf8               DM_EVENT_INTERVAL
  #1287 = String             #1288        // DMEventParticipationTime
  #1288 = Utf8               DMEventParticipationTime
  #1289 = Fieldref           #27.#1290    // ext/mods/Config.DM_EVENT_PARTICIPATION_TIME:I
  #1290 = NameAndType        #1291:#86    // DM_EVENT_PARTICIPATION_TIME:I
  #1291 = Utf8               DM_EVENT_PARTICIPATION_TIME
  #1292 = String             #1293        // DMEventRunningTime
  #1293 = Utf8               DMEventRunningTime
  #1294 = Fieldref           #27.#1295    // ext/mods/Config.DM_EVENT_RUNNING_TIME:I
  #1295 = NameAndType        #1296:#86    // DM_EVENT_RUNNING_TIME:I
  #1296 = Utf8               DM_EVENT_RUNNING_TIME
  #1297 = String             #1298        // DMNpcLocName
  #1298 = Utf8               DMNpcLocName
  #1299 = Fieldref           #27.#1300    // ext/mods/Config.DM_NPC_LOC_NAME:Ljava/lang/String;
  #1300 = NameAndType        #1301:#43    // DM_NPC_LOC_NAME:Ljava/lang/String;
  #1301 = Utf8               DM_NPC_LOC_NAME
  #1302 = String             #1303        // DMEventParticipationNpcId
  #1303 = Utf8               DMEventParticipationNpcId
  #1304 = Fieldref           #27.#1305    // ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_ID:I
  #1305 = NameAndType        #1306:#86    // DM_EVENT_PARTICIPATION_NPC_ID:I
  #1306 = Utf8               DM_EVENT_PARTICIPATION_NPC_ID
  #1307 = String             #1308        // DMEventParticipationFee
  #1308 = Utf8               DMEventParticipationFee
  #1309 = Fieldref           #27.#1310    // ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
  #1310 = NameAndType        #1311:#388   // DM_EVENT_PARTICIPATION_FEE:[I
  #1311 = Utf8               DM_EVENT_PARTICIPATION_FEE
  #1312 = String             #1313        // DMEventParticipationNpcCoordinates
  #1313 = Utf8               DMEventParticipationNpcCoordinates
  #1314 = Fieldref           #27.#1315    // ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1315 = NameAndType        #1316:#388   // DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1316 = Utf8               DM_EVENT_PARTICIPATION_NPC_COORDINATES
  #1317 = String             #1318        // DMEventMinPlayers
  #1318 = Utf8               DMEventMinPlayers
  #1319 = Fieldref           #27.#1320    // ext/mods/Config.DM_EVENT_MIN_PLAYERS:I
  #1320 = NameAndType        #1321:#86    // DM_EVENT_MIN_PLAYERS:I
  #1321 = Utf8               DM_EVENT_MIN_PLAYERS
  #1322 = String             #1323        // DMEventMaxPlayers
  #1323 = Utf8               DMEventMaxPlayers
  #1324 = Fieldref           #27.#1325    // ext/mods/Config.DM_EVENT_MAX_PLAYERS:I
  #1325 = NameAndType        #1326:#86    // DM_EVENT_MAX_PLAYERS:I
  #1326 = Utf8               DM_EVENT_MAX_PLAYERS
  #1327 = String             #1328        // DMEventMinPlayerLevel
  #1328 = Utf8               DMEventMinPlayerLevel
  #1329 = Fieldref           #27.#1330    // ext/mods/Config.DM_EVENT_MIN_LVL:B
  #1330 = NameAndType        #1331:#1125  // DM_EVENT_MIN_LVL:B
  #1331 = Utf8               DM_EVENT_MIN_LVL
  #1332 = String             #1333        // DMEventMaxPlayerLevel
  #1333 = Utf8               DMEventMaxPlayerLevel
  #1334 = Fieldref           #27.#1335    // ext/mods/Config.DM_EVENT_MAX_LVL:B
  #1335 = NameAndType        #1336:#1125  // DM_EVENT_MAX_LVL:B
  #1336 = Utf8               DM_EVENT_MAX_LVL
  #1337 = Methodref          #395.#3      // java/util/ArrayList."<init>":()V
  #1338 = Fieldref           #27.#1339    // ext/mods/Config.DM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
  #1339 = NameAndType        #1340:#1221  // DM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
  #1340 = Utf8               DM_EVENT_PLAYER_COORDINATES
  #1341 = String             #1342        // DMEventPlayerCoordinates
  #1342 = Utf8               DMEventPlayerCoordinates
  #1343 = String             #1344        // 0,0,0
  #1344 = Utf8               0,0,0
  #1345 = InvokeDynamic      #3:#227      // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1346 = String             #1347        // DMEventRespawnTeleportDelay
  #1347 = Utf8               DMEventRespawnTeleportDelay
  #1348 = Fieldref           #27.#1349    // ext/mods/Config.DM_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1349 = NameAndType        #1350:#86    // DM_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1350 = Utf8               DM_EVENT_RESPAWN_TELEPORT_DELAY
  #1351 = String             #1352        // DMEventStartLeaveTeleportDelay
  #1352 = Utf8               DMEventStartLeaveTeleportDelay
  #1353 = Fieldref           #27.#1354    // ext/mods/Config.DM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1354 = NameAndType        #1355:#86    // DM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1355 = Utf8               DM_EVENT_START_LEAVE_TELEPORT_DELAY
  #1356 = String             #1357        // DMShowTopRank
  #1357 = Utf8               DMShowTopRank
  #1358 = Fieldref           #27.#1359    // ext/mods/Config.DM_SHOW_TOP_RANK:Z
  #1359 = NameAndType        #1360:#57    // DM_SHOW_TOP_RANK:Z
  #1360 = Utf8               DM_SHOW_TOP_RANK
  #1361 = String             #1362        // DMTopRank
  #1362 = Utf8               DMTopRank
  #1363 = Fieldref           #27.#1364    // ext/mods/Config.DM_TOP_RANK:I
  #1364 = NameAndType        #1365:#86    // DM_TOP_RANK:I
  #1365 = Utf8               DM_TOP_RANK
  #1366 = Fieldref           #27.#1367    // ext/mods/Config.DM_EVENT_REWARDS:Ljava/util/Map;
  #1367 = NameAndType        #1368:#1247  // DM_EVENT_REWARDS:Ljava/util/Map;
  #1368 = Utf8               DM_EVENT_REWARDS
  #1369 = String             #1370        // DMRewardFirstPlayers
  #1370 = Utf8               DMRewardFirstPlayers
  #1371 = Fieldref           #27.#1372    // ext/mods/Config.DM_REWARD_FIRST_PLAYERS:I
  #1372 = NameAndType        #1373:#86    // DM_REWARD_FIRST_PLAYERS:I
  #1373 = Utf8               DM_REWARD_FIRST_PLAYERS
  #1374 = String             #1375        // DMEventReward
  #1375 = Utf8               DMEventReward
  #1376 = String             #1377        // 57,100000;5575,5000|57,50000|57,25000
  #1377 = Utf8               57,100000;5575,5000|57,50000|57,25000
  #1378 = String             #1379        // \\|
  #1379 = Utf8               \\|
  #1380 = String             #1381        // DMRewardFirstPlayers < DMEventReward
  #1381 = Utf8               DMRewardFirstPlayers < DMEventReward
  #1382 = String             #1383        // \\;
  #1383 = Utf8               \\;
  #1384 = String             #1385        // \\-
  #1385 = Utf8               \\-
  #1386 = InvokeDynamic      #4:#227      // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1387 = InterfaceMethodref #409.#382    // java/util/List.isEmpty:()Z
  #1388 = InterfaceMethodref #1255.#1389  // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #1389 = NameAndType        #1390:#1391  // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #1390 = Utf8               get
  #1391 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #1392 = String             #1393        // DMEventReward array index out of bounds (1)
  #1393 = Utf8               DMEventReward array index out of bounds (1)
  #1394 = Methodref          #24.#1395    // java/lang/Exception.printStackTrace:()V
  #1395 = NameAndType        #1396:#6     // printStackTrace:()V
  #1396 = Utf8               printStackTrace
  #1397 = InterfaceMethodref #1255.#1398  // java/util/Map.size:()I
  #1398 = NameAndType        #1399:#239   // size:()I
  #1399 = Utf8               size
  #1400 = String             #1401        // DMEventReward array index out of bounds (2)
  #1401 = Utf8               DMEventReward array index out of bounds (2)
  #1402 = String             #1403        // DMRewardPlayersTie
  #1403 = Utf8               DMRewardPlayersTie
  #1404 = Fieldref           #27.#1405    // ext/mods/Config.DM_REWARD_PLAYERS_TIE:Z
  #1405 = NameAndType        #1406:#57    // DM_REWARD_PLAYERS_TIE:Z
  #1406 = Utf8               DM_REWARD_PLAYERS_TIE
  #1407 = String             #1408        // DMEventScrollsAllowed
  #1408 = Utf8               DMEventScrollsAllowed
  #1409 = Fieldref           #27.#1410    // ext/mods/Config.DM_EVENT_SCROLL_ALLOWED:Z
  #1410 = NameAndType        #1411:#57    // DM_EVENT_SCROLL_ALLOWED:Z
  #1411 = Utf8               DM_EVENT_SCROLL_ALLOWED
  #1412 = String             #1413        // DMEventPotionsAllowed
  #1413 = Utf8               DMEventPotionsAllowed
  #1414 = Fieldref           #27.#1415    // ext/mods/Config.DM_EVENT_POTIONS_ALLOWED:Z
  #1415 = NameAndType        #1416:#57    // DM_EVENT_POTIONS_ALLOWED:Z
  #1416 = Utf8               DM_EVENT_POTIONS_ALLOWED
  #1417 = String             #1418        // DMEventSummonByItemAllowed
  #1418 = Utf8               DMEventSummonByItemAllowed
  #1419 = Fieldref           #27.#1420    // ext/mods/Config.DM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1420 = NameAndType        #1421:#57    // DM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1421 = Utf8               DM_EVENT_SUMMON_BY_ITEM_ALLOWED
  #1422 = String             #1423        // DMDoorsToOpen
  #1423 = Utf8               DMDoorsToOpen
  #1424 = Fieldref           #27.#1425    // ext/mods/Config.DM_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1425 = NameAndType        #1426:#1221  // DM_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1426 = Utf8               DM_DOORS_IDS_TO_OPEN
  #1427 = InvokeDynamic      #5:#227      // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1428 = String             #1429        // DMDoorsToClose
  #1429 = Utf8               DMDoorsToClose
  #1430 = Fieldref           #27.#1431    // ext/mods/Config.DM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1431 = NameAndType        #1432:#1221  // DM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1432 = Utf8               DM_DOORS_IDS_TO_CLOSE
  #1433 = String             #1434        // DMEventEffectsRemoval
  #1434 = Utf8               DMEventEffectsRemoval
  #1435 = Fieldref           #27.#1436    // ext/mods/Config.DM_EVENT_EFFECTS_REMOVAL:I
  #1436 = NameAndType        #1437:#86    // DM_EVENT_EFFECTS_REMOVAL:I
  #1437 = Utf8               DM_EVENT_EFFECTS_REMOVAL
  #1438 = Fieldref           #27.#1439    // ext/mods/Config.DM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1439 = NameAndType        #1440:#1247  // DM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1440 = Utf8               DM_EVENT_FIGHTER_BUFFS
  #1441 = String             #1442        // DMEventFighterBuffs
  #1442 = Utf8               DMEventFighterBuffs
  #1443 = Fieldref           #27.#1444    // ext/mods/Config.DM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1444 = NameAndType        #1445:#1247  // DM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1445 = Utf8               DM_EVENT_MAGE_BUFFS
  #1446 = String             #1447        // DMEventMageBuffs
  #1447 = Utf8               DMEventMageBuffs
  #1448 = String             #1449        // DMDisabledForClasses
  #1449 = Utf8               DMDisabledForClasses
  #1450 = Methodref          #14.#1451    // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #1451 = NameAndType        #52:#229     // getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #1452 = Fieldref           #27.#1453    // ext/mods/Config.DISABLE_ID_CLASSES_STRING_DM:Ljava/lang/String;
  #1453 = NameAndType        #1454:#43    // DISABLE_ID_CLASSES_STRING_DM:Ljava/lang/String;
  #1454 = Utf8               DISABLE_ID_CLASSES_STRING_DM
  #1455 = Fieldref           #27.#1456    // ext/mods/Config.DISABLE_ID_CLASSES_DM:Ljava/util/List;
  #1456 = NameAndType        #1457:#1221  // DISABLE_ID_CLASSES_DM:Ljava/util/List;
  #1457 = Utf8               DISABLE_ID_CLASSES_DM
  #1458 = String             #1459        // AllowDlgDMInvite
  #1459 = Utf8               AllowDlgDMInvite
  #1460 = Fieldref           #27.#1461    // ext/mods/Config.ALLOW_DM_DLG:Z
  #1461 = NameAndType        #1462:#57    // ALLOW_DM_DLG:Z
  #1462 = Utf8               ALLOW_DM_DLG
  #1463 = String             #1464        // DMEventMaxParticipantsPerIP
  #1464 = Utf8               DMEventMaxParticipantsPerIP
  #1465 = Fieldref           #27.#1466    // ext/mods/Config.DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1466 = NameAndType        #1467:#86    // DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1467 = Utf8               DM_EVENT_MAX_PARTICIPANTS_PER_IP
  #1468 = String             #1469        // LMEventEnabled
  #1469 = Utf8               LMEventEnabled
  #1470 = Fieldref           #27.#1471    // ext/mods/Config.LM_EVENT_ENABLED:Z
  #1471 = NameAndType        #1472:#57    // LM_EVENT_ENABLED:Z
  #1472 = Utf8               LM_EVENT_ENABLED
  #1473 = String             #1474        // LMEventInterval
  #1474 = Utf8               LMEventInterval
  #1475 = String             #1476        // 02:00,06:00,10:00,14:00,18:00,22:00
  #1476 = Utf8               02:00,06:00,10:00,14:00,18:00,22:00
  #1477 = Fieldref           #27.#1478    // ext/mods/Config.LM_EVENT_INTERVAL:[Ljava/lang/String;
  #1478 = NameAndType        #1479:#1039  // LM_EVENT_INTERVAL:[Ljava/lang/String;
  #1479 = Utf8               LM_EVENT_INTERVAL
  #1480 = String             #1481        // LMEventParticipationTime
  #1481 = Utf8               LMEventParticipationTime
  #1482 = Fieldref           #27.#1483    // ext/mods/Config.LM_EVENT_PARTICIPATION_TIME:I
  #1483 = NameAndType        #1484:#86    // LM_EVENT_PARTICIPATION_TIME:I
  #1484 = Utf8               LM_EVENT_PARTICIPATION_TIME
  #1485 = String             #1486        // LMEventHero
  #1486 = Utf8               LMEventHero
  #1487 = Fieldref           #27.#1488    // ext/mods/Config.LM_EVENT_HERO:Z
  #1488 = NameAndType        #1489:#57    // LM_EVENT_HERO:Z
  #1489 = Utf8               LM_EVENT_HERO
  #1490 = String             #1491        // LMEventHeroDays
  #1491 = Utf8               LMEventHeroDays
  #1492 = Fieldref           #27.#1493    // ext/mods/Config.LV_EVENT_HERO_DAYS:I
  #1493 = NameAndType        #1494:#86    // LV_EVENT_HERO_DAYS:I
  #1494 = Utf8               LV_EVENT_HERO_DAYS
  #1495 = String             #1496        // LMEventRunningTime
  #1496 = Utf8               LMEventRunningTime
  #1497 = Fieldref           #27.#1498    // ext/mods/Config.LM_EVENT_RUNNING_TIME:I
  #1498 = NameAndType        #1499:#86    // LM_EVENT_RUNNING_TIME:I
  #1499 = Utf8               LM_EVENT_RUNNING_TIME
  #1500 = String             #1501        // LMEventPlayerCredits
  #1501 = Utf8               LMEventPlayerCredits
  #1502 = Methodref          #1503.#1504  // java/lang/Short.parseShort:(Ljava/lang/String;)S
  #1503 = Class              #1505        // java/lang/Short
  #1504 = NameAndType        #1506:#1507  // parseShort:(Ljava/lang/String;)S
  #1505 = Utf8               java/lang/Short
  #1506 = Utf8               parseShort
  #1507 = Utf8               (Ljava/lang/String;)S
  #1508 = Fieldref           #27.#1509    // ext/mods/Config.LM_EVENT_PLAYER_CREDITS:S
  #1509 = NameAndType        #1510:#1511  // LM_EVENT_PLAYER_CREDITS:S
  #1510 = Utf8               LM_EVENT_PLAYER_CREDITS
  #1511 = Utf8               S
  #1512 = String             #1513        // LMNpcLocName
  #1513 = Utf8               LMNpcLocName
  #1514 = Fieldref           #27.#1515    // ext/mods/Config.LM_NPC_LOC_NAME:Ljava/lang/String;
  #1515 = NameAndType        #1516:#43    // LM_NPC_LOC_NAME:Ljava/lang/String;
  #1516 = Utf8               LM_NPC_LOC_NAME
  #1517 = String             #1518        // LMEventParticipationNpcId
  #1518 = Utf8               LMEventParticipationNpcId
  #1519 = Fieldref           #27.#1520    // ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_ID:I
  #1520 = NameAndType        #1521:#86    // LM_EVENT_PARTICIPATION_NPC_ID:I
  #1521 = Utf8               LM_EVENT_PARTICIPATION_NPC_ID
  #1522 = String             #1523        // LMEventParticipationFee
  #1523 = Utf8               LMEventParticipationFee
  #1524 = Fieldref           #27.#1525    // ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
  #1525 = NameAndType        #1526:#388   // LM_EVENT_PARTICIPATION_FEE:[I
  #1526 = Utf8               LM_EVENT_PARTICIPATION_FEE
  #1527 = String             #1528        // LMEventParticipationNpcCoordinates
  #1528 = Utf8               LMEventParticipationNpcCoordinates
  #1529 = Fieldref           #27.#1530    // ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1530 = NameAndType        #1531:#388   // LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1531 = Utf8               LM_EVENT_PARTICIPATION_NPC_COORDINATES
  #1532 = String             #1533        // LMEventMinPlayers
  #1533 = Utf8               LMEventMinPlayers
  #1534 = Fieldref           #27.#1535    // ext/mods/Config.LM_EVENT_MIN_PLAYERS:I
  #1535 = NameAndType        #1536:#86    // LM_EVENT_MIN_PLAYERS:I
  #1536 = Utf8               LM_EVENT_MIN_PLAYERS
  #1537 = String             #1538        // LMEventMaxPlayers
  #1538 = Utf8               LMEventMaxPlayers
  #1539 = Fieldref           #27.#1540    // ext/mods/Config.LM_EVENT_MAX_PLAYERS:I
  #1540 = NameAndType        #1541:#86    // LM_EVENT_MAX_PLAYERS:I
  #1541 = Utf8               LM_EVENT_MAX_PLAYERS
  #1542 = String             #1543        // LMEventMinPlayerLevel
  #1543 = Utf8               LMEventMinPlayerLevel
  #1544 = Fieldref           #27.#1545    // ext/mods/Config.LM_EVENT_MIN_LVL:B
  #1545 = NameAndType        #1546:#1125  // LM_EVENT_MIN_LVL:B
  #1546 = Utf8               LM_EVENT_MIN_LVL
  #1547 = String             #1548        // LMEventMaxPlayerLevel
  #1548 = Utf8               LMEventMaxPlayerLevel
  #1549 = Fieldref           #27.#1550    // ext/mods/Config.LM_EVENT_MAX_LVL:B
  #1550 = NameAndType        #1551:#1125  // LM_EVENT_MAX_LVL:B
  #1551 = Utf8               LM_EVENT_MAX_LVL
  #1552 = Fieldref           #27.#1553    // ext/mods/Config.LM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
  #1553 = NameAndType        #1554:#1221  // LM_EVENT_PLAYER_COORDINATES:Ljava/util/List;
  #1554 = Utf8               LM_EVENT_PLAYER_COORDINATES
  #1555 = String             #1556        // LMEventPlayerCoordinates
  #1556 = Utf8               LMEventPlayerCoordinates
  #1557 = InvokeDynamic      #6:#227      // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1558 = String             #1559        // LMEventRespawnTeleportDelay
  #1559 = Utf8               LMEventRespawnTeleportDelay
  #1560 = Fieldref           #27.#1561    // ext/mods/Config.LM_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1561 = NameAndType        #1562:#86    // LM_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1562 = Utf8               LM_EVENT_RESPAWN_TELEPORT_DELAY
  #1563 = String             #1564        // LMEventStartLeaveTeleportDelay
  #1564 = Utf8               LMEventStartLeaveTeleportDelay
  #1565 = Fieldref           #27.#1566    // ext/mods/Config.LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1566 = NameAndType        #1567:#86    // LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1567 = Utf8               LM_EVENT_START_LEAVE_TELEPORT_DELAY
  #1568 = String             #1569        // LMEventReward
  #1569 = Utf8               LMEventReward
  #1570 = String             #1571        // 4037-50;57-100000
  #1571 = Utf8               4037-50;57-100000
  #1572 = Fieldref           #27.#1573    // ext/mods/Config.LM_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1573 = NameAndType        #1574:#787   // LM_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1574 = Utf8               LM_EVENT_REWARDS
  #1575 = String             #1576        // LMRewardPlayersTie
  #1576 = Utf8               LMRewardPlayersTie
  #1577 = Fieldref           #27.#1578    // ext/mods/Config.LM_REWARD_PLAYERS_TIE:Z
  #1578 = NameAndType        #1579:#57    // LM_REWARD_PLAYERS_TIE:Z
  #1579 = Utf8               LM_REWARD_PLAYERS_TIE
  #1580 = String             #1581        // LMEventScrollsAllowed
  #1581 = Utf8               LMEventScrollsAllowed
  #1582 = Fieldref           #27.#1583    // ext/mods/Config.LM_EVENT_SCROLL_ALLOWED:Z
  #1583 = NameAndType        #1584:#57    // LM_EVENT_SCROLL_ALLOWED:Z
  #1584 = Utf8               LM_EVENT_SCROLL_ALLOWED
  #1585 = String             #1586        // LMEventPotionsAllowed
  #1586 = Utf8               LMEventPotionsAllowed
  #1587 = Fieldref           #27.#1588    // ext/mods/Config.LM_EVENT_POTIONS_ALLOWED:Z
  #1588 = NameAndType        #1589:#57    // LM_EVENT_POTIONS_ALLOWED:Z
  #1589 = Utf8               LM_EVENT_POTIONS_ALLOWED
  #1590 = String             #1591        // LMEventSummonByItemAllowed
  #1591 = Utf8               LMEventSummonByItemAllowed
  #1592 = Fieldref           #27.#1593    // ext/mods/Config.LM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1593 = NameAndType        #1594:#57    // LM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1594 = Utf8               LM_EVENT_SUMMON_BY_ITEM_ALLOWED
  #1595 = String             #1596        // LMDoorsToOpen
  #1596 = Utf8               LMDoorsToOpen
  #1597 = Fieldref           #27.#1598    // ext/mods/Config.LM_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1598 = NameAndType        #1599:#1221  // LM_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1599 = Utf8               LM_DOORS_IDS_TO_OPEN
  #1600 = InvokeDynamic      #7:#227      // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1601 = String             #1602        // LMDoorsToClose
  #1602 = Utf8               LMDoorsToClose
  #1603 = Fieldref           #27.#1604    // ext/mods/Config.LM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1604 = NameAndType        #1605:#1221  // LM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1605 = Utf8               LM_DOORS_IDS_TO_CLOSE
  #1606 = String             #1607        // LMEventEffectsRemoval
  #1607 = Utf8               LMEventEffectsRemoval
  #1608 = Fieldref           #27.#1609    // ext/mods/Config.LM_EVENT_EFFECTS_REMOVAL:I
  #1609 = NameAndType        #1610:#86    // LM_EVENT_EFFECTS_REMOVAL:I
  #1610 = Utf8               LM_EVENT_EFFECTS_REMOVAL
  #1611 = Fieldref           #27.#1612    // ext/mods/Config.LM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1612 = NameAndType        #1613:#1247  // LM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1613 = Utf8               LM_EVENT_FIGHTER_BUFFS
  #1614 = String             #1615        // LMEventFighterBuffs
  #1615 = Utf8               LMEventFighterBuffs
  #1616 = Fieldref           #27.#1617    // ext/mods/Config.LM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1617 = NameAndType        #1618:#1247  // LM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1618 = Utf8               LM_EVENT_MAGE_BUFFS
  #1619 = String             #1620        // LMEventMageBuffs
  #1620 = Utf8               LMEventMageBuffs
  #1621 = String             #1622        // LMDisabledForClasses
  #1622 = Utf8               LMDisabledForClasses
  #1623 = Fieldref           #27.#1624    // ext/mods/Config.DISABLE_ID_CLASSES_STRING_LM:Ljava/lang/String;
  #1624 = NameAndType        #1625:#43    // DISABLE_ID_CLASSES_STRING_LM:Ljava/lang/String;
  #1625 = Utf8               DISABLE_ID_CLASSES_STRING_LM
  #1626 = Fieldref           #27.#1627    // ext/mods/Config.DISABLE_ID_CLASSES_LM:Ljava/util/List;
  #1627 = NameAndType        #1628:#1221  // DISABLE_ID_CLASSES_LM:Ljava/util/List;
  #1628 = Utf8               DISABLE_ID_CLASSES_LM
  #1629 = String             #1630        // AllowDlgLMInvite
  #1630 = Utf8               AllowDlgLMInvite
  #1631 = Fieldref           #27.#1632    // ext/mods/Config.ALLOW_LM_DLG:Z
  #1632 = NameAndType        #1633:#57    // ALLOW_LM_DLG:Z
  #1633 = Utf8               ALLOW_LM_DLG
  #1634 = String             #1635        // LMEventMaxParticipantsPerIP
  #1635 = Utf8               LMEventMaxParticipantsPerIP
  #1636 = Fieldref           #27.#1637    // ext/mods/Config.LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1637 = NameAndType        #1638:#86    // LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1638 = Utf8               LM_EVENT_MAX_PARTICIPANTS_PER_IP
  #1639 = String             #1640        // TvTEventEnabled
  #1640 = Utf8               TvTEventEnabled
  #1641 = Fieldref           #27.#1642    // ext/mods/Config.TVT_EVENT_ENABLED:Z
  #1642 = NameAndType        #1643:#57    // TVT_EVENT_ENABLED:Z
  #1643 = Utf8               TVT_EVENT_ENABLED
  #1644 = String             #1645        // TvTEventInterval
  #1645 = Utf8               TvTEventInterval
  #1646 = String             #1647        // 03:00,07:00,11:00,15:00,19:00,23:00
  #1647 = Utf8               03:00,07:00,11:00,15:00,19:00,23:00
  #1648 = Fieldref           #27.#1649    // ext/mods/Config.TVT_EVENT_INTERVAL:[Ljava/lang/String;
  #1649 = NameAndType        #1650:#1039  // TVT_EVENT_INTERVAL:[Ljava/lang/String;
  #1650 = Utf8               TVT_EVENT_INTERVAL
  #1651 = String             #1652        // TvTEventParticipationTime
  #1652 = Utf8               TvTEventParticipationTime
  #1653 = Fieldref           #27.#1654    // ext/mods/Config.TVT_EVENT_PARTICIPATION_TIME:I
  #1654 = NameAndType        #1655:#86    // TVT_EVENT_PARTICIPATION_TIME:I
  #1655 = Utf8               TVT_EVENT_PARTICIPATION_TIME
  #1656 = String             #1657        // TvTEventRunningTime
  #1657 = Utf8               TvTEventRunningTime
  #1658 = Fieldref           #27.#1659    // ext/mods/Config.TVT_EVENT_RUNNING_TIME:I
  #1659 = NameAndType        #1660:#86    // TVT_EVENT_RUNNING_TIME:I
  #1660 = Utf8               TVT_EVENT_RUNNING_TIME
  #1661 = String             #1662        // TvTNpcLocName
  #1662 = Utf8               TvTNpcLocName
  #1663 = Fieldref           #27.#1664    // ext/mods/Config.TVT_NPC_LOC_NAME:Ljava/lang/String;
  #1664 = NameAndType        #1665:#43    // TVT_NPC_LOC_NAME:Ljava/lang/String;
  #1665 = Utf8               TVT_NPC_LOC_NAME
  #1666 = String             #1667        // TvTEventParticipationNpcId
  #1667 = Utf8               TvTEventParticipationNpcId
  #1668 = Fieldref           #27.#1669    // ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_ID:I
  #1669 = NameAndType        #1670:#86    // TVT_EVENT_PARTICIPATION_NPC_ID:I
  #1670 = Utf8               TVT_EVENT_PARTICIPATION_NPC_ID
  #1671 = String             #1672        // TvTEventParticipationNpcCoordinates
  #1672 = Utf8               TvTEventParticipationNpcCoordinates
  #1673 = Fieldref           #27.#1674    // ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1674 = NameAndType        #1675:#388   // TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #1675 = Utf8               TVT_EVENT_PARTICIPATION_NPC_COORDINATES
  #1676 = String             #1677        // TvTEventParticipationFee
  #1677 = Utf8               TvTEventParticipationFee
  #1678 = Fieldref           #27.#1679    // ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
  #1679 = NameAndType        #1680:#388   // TVT_EVENT_PARTICIPATION_FEE:[I
  #1680 = Utf8               TVT_EVENT_PARTICIPATION_FEE
  #1681 = String             #1682        // TvTEventReward
  #1682 = Utf8               TvTEventReward
  #1683 = Fieldref           #27.#1684    // ext/mods/Config.TVT_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1684 = NameAndType        #1685:#787   // TVT_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1685 = Utf8               TVT_EVENT_REWARDS
  #1686 = String             #1687        // TvTEventMinPlayersInTeams
  #1687 = Utf8               TvTEventMinPlayersInTeams
  #1688 = Fieldref           #27.#1689    // ext/mods/Config.TVT_EVENT_MIN_PLAYERS_IN_TEAMS:I
  #1689 = NameAndType        #1690:#86    // TVT_EVENT_MIN_PLAYERS_IN_TEAMS:I
  #1690 = Utf8               TVT_EVENT_MIN_PLAYERS_IN_TEAMS
  #1691 = String             #1692        // TvTEventMaxPlayersInTeams
  #1692 = Utf8               TvTEventMaxPlayersInTeams
  #1693 = Fieldref           #27.#1694    // ext/mods/Config.TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
  #1694 = NameAndType        #1695:#86    // TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
  #1695 = Utf8               TVT_EVENT_MAX_PLAYERS_IN_TEAMS
  #1696 = String             #1697        // TvTEventMinPlayerLevel
  #1697 = Utf8               TvTEventMinPlayerLevel
  #1698 = Fieldref           #27.#1699    // ext/mods/Config.TVT_EVENT_MIN_LVL:B
  #1699 = NameAndType        #1700:#1125  // TVT_EVENT_MIN_LVL:B
  #1700 = Utf8               TVT_EVENT_MIN_LVL
  #1701 = String             #1702        // TvTEventMaxPlayerLevel
  #1702 = Utf8               TvTEventMaxPlayerLevel
  #1703 = Fieldref           #27.#1704    // ext/mods/Config.TVT_EVENT_MAX_LVL:B
  #1704 = NameAndType        #1705:#1125  // TVT_EVENT_MAX_LVL:B
  #1705 = Utf8               TVT_EVENT_MAX_LVL
  #1706 = String             #1707        // TvTEventRespawnTeleportDelay
  #1707 = Utf8               TvTEventRespawnTeleportDelay
  #1708 = Fieldref           #27.#1709    // ext/mods/Config.TVT_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1709 = NameAndType        #1710:#86    // TVT_EVENT_RESPAWN_TELEPORT_DELAY:I
  #1710 = Utf8               TVT_EVENT_RESPAWN_TELEPORT_DELAY
  #1711 = String             #1712        // TvTEventStartLeaveTeleportDelay
  #1712 = Utf8               TvTEventStartLeaveTeleportDelay
  #1713 = Fieldref           #27.#1714    // ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1714 = NameAndType        #1715:#86    // TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #1715 = Utf8               TVT_EVENT_START_LEAVE_TELEPORT_DELAY
  #1716 = String             #1717        // TvTEventEffectsRemoval
  #1717 = Utf8               TvTEventEffectsRemoval
  #1718 = Fieldref           #27.#1719    // ext/mods/Config.TVT_EVENT_EFFECTS_REMOVAL:I
  #1719 = NameAndType        #1720:#86    // TVT_EVENT_EFFECTS_REMOVAL:I
  #1720 = Utf8               TVT_EVENT_EFFECTS_REMOVAL
  #1721 = String             #1722        // TvTEventTeam1Name
  #1722 = Utf8               TvTEventTeam1Name
  #1723 = Fieldref           #27.#1724    // ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #1724 = NameAndType        #1725:#43    // TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #1725 = Utf8               TVT_EVENT_TEAM_1_NAME
  #1726 = String             #1727        // TvTEventTeam1Coordinates
  #1727 = Utf8               TvTEventTeam1Coordinates
  #1728 = Integer            148476
  #1729 = Integer            46061
  #1730 = Fieldref           #27.#1731    // ext/mods/Config.TVT_EVENT_TEAM_1_COORDINATES:[I
  #1731 = NameAndType        #1732:#388   // TVT_EVENT_TEAM_1_COORDINATES:[I
  #1732 = Utf8               TVT_EVENT_TEAM_1_COORDINATES
  #1733 = String             #1734        // TvTEventTeam2Name
  #1734 = Utf8               TvTEventTeam2Name
  #1735 = Fieldref           #27.#1736    // ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #1736 = NameAndType        #1737:#43    // TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #1737 = Utf8               TVT_EVENT_TEAM_2_NAME
  #1738 = String             #1739        // TvTEventTeam2Coordinates
  #1739 = Utf8               TvTEventTeam2Coordinates
  #1740 = Integer            150480
  #1741 = Integer            47444
  #1742 = Fieldref           #27.#1743    // ext/mods/Config.TVT_EVENT_TEAM_2_COORDINATES:[I
  #1743 = NameAndType        #1744:#388   // TVT_EVENT_TEAM_2_COORDINATES:[I
  #1744 = Utf8               TVT_EVENT_TEAM_2_COORDINATES
  #1745 = String             #1746        // TvTEventTargetTeamMembersAllowed
  #1746 = Utf8               TvTEventTargetTeamMembersAllowed
  #1747 = Fieldref           #27.#1748    // ext/mods/Config.TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
  #1748 = NameAndType        #1749:#57    // TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
  #1749 = Utf8               TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED
  #1750 = String             #1751        // TvTEventScrollsAllowed
  #1751 = Utf8               TvTEventScrollsAllowed
  #1752 = Fieldref           #27.#1753    // ext/mods/Config.TVT_EVENT_SCROLL_ALLOWED:Z
  #1753 = NameAndType        #1754:#57    // TVT_EVENT_SCROLL_ALLOWED:Z
  #1754 = Utf8               TVT_EVENT_SCROLL_ALLOWED
  #1755 = String             #1756        // TvTEventPotionsAllowed
  #1756 = Utf8               TvTEventPotionsAllowed
  #1757 = Fieldref           #27.#1758    // ext/mods/Config.TVT_EVENT_POTIONS_ALLOWED:Z
  #1758 = NameAndType        #1759:#57    // TVT_EVENT_POTIONS_ALLOWED:Z
  #1759 = Utf8               TVT_EVENT_POTIONS_ALLOWED
  #1760 = String             #1761        // TvTEventSummonByItemAllowed
  #1761 = Utf8               TvTEventSummonByItemAllowed
  #1762 = Fieldref           #27.#1763    // ext/mods/Config.TVT_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1763 = NameAndType        #1764:#57    // TVT_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #1764 = Utf8               TVT_EVENT_SUMMON_BY_ITEM_ALLOWED
  #1765 = String             #1766        // TvTDoorsToOpen
  #1766 = Utf8               TvTDoorsToOpen
  #1767 = Fieldref           #27.#1768    // ext/mods/Config.TVT_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1768 = NameAndType        #1769:#1221  // TVT_DOORS_IDS_TO_OPEN:Ljava/util/List;
  #1769 = Utf8               TVT_DOORS_IDS_TO_OPEN
  #1770 = InvokeDynamic      #8:#227      // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1771 = String             #1772        // TvTDoorsToClose
  #1772 = Utf8               TvTDoorsToClose
  #1773 = Fieldref           #27.#1774    // ext/mods/Config.TVT_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1774 = NameAndType        #1775:#1221  // TVT_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #1775 = Utf8               TVT_DOORS_IDS_TO_CLOSE
  #1776 = String             #1777        // TvTRewardTeamTie
  #1777 = Utf8               TvTRewardTeamTie
  #1778 = Fieldref           #27.#1779    // ext/mods/Config.TVT_REWARD_TEAM_TIE:Z
  #1779 = NameAndType        #1780:#57    // TVT_REWARD_TEAM_TIE:Z
  #1780 = Utf8               TVT_REWARD_TEAM_TIE
  #1781 = Fieldref           #27.#1782    // ext/mods/Config.TVT_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1782 = NameAndType        #1783:#1247  // TVT_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #1783 = Utf8               TVT_EVENT_FIGHTER_BUFFS
  #1784 = String             #1785        // TvTEventFighterBuffs
  #1785 = Utf8               TvTEventFighterBuffs
  #1786 = Fieldref           #27.#1787    // ext/mods/Config.TVT_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1787 = NameAndType        #1788:#1247  // TVT_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #1788 = Utf8               TVT_EVENT_MAGE_BUFFS
  #1789 = String             #1790        // TvTEventMageBuffs
  #1790 = Utf8               TvTEventMageBuffs
  #1791 = String             #1792        // TvTRewardOnlyKillers
  #1792 = Utf8               TvTRewardOnlyKillers
  #1793 = Fieldref           #27.#1794    // ext/mods/Config.TVT_REWARD_PLAYER:Z
  #1794 = NameAndType        #1795:#57    // TVT_REWARD_PLAYER:Z
  #1795 = Utf8               TVT_REWARD_PLAYER
  #1796 = String             #1797        // TvTEventOnKill
  #1797 = Utf8               TvTEventOnKill
  #1798 = String             #1799        // pmteam
  #1799 = Utf8               pmteam
  #1800 = Fieldref           #27.#1801    // ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
  #1801 = NameAndType        #1802:#43    // TVT_EVENT_ON_KILL:Ljava/lang/String;
  #1802 = Utf8               TVT_EVENT_ON_KILL
  #1803 = String             #1804        // TvTDisabledForClasses
  #1804 = Utf8               TvTDisabledForClasses
  #1805 = Fieldref           #27.#1806    // ext/mods/Config.DISABLE_ID_CLASSES_STRING_TVT:Ljava/lang/String;
  #1806 = NameAndType        #1807:#43    // DISABLE_ID_CLASSES_STRING_TVT:Ljava/lang/String;
  #1807 = Utf8               DISABLE_ID_CLASSES_STRING_TVT
  #1808 = Fieldref           #27.#1809    // ext/mods/Config.DISABLE_ID_CLASSES_TVT:Ljava/util/List;
  #1809 = NameAndType        #1810:#1221  // DISABLE_ID_CLASSES_TVT:Ljava/util/List;
  #1810 = Utf8               DISABLE_ID_CLASSES_TVT
  #1811 = String             #1812        // AllowDlgTvTInvite
  #1812 = Utf8               AllowDlgTvTInvite
  #1813 = Fieldref           #27.#1814    // ext/mods/Config.ALLOW_TVT_DLG:Z
  #1814 = NameAndType        #1815:#57    // ALLOW_TVT_DLG:Z
  #1815 = Utf8               ALLOW_TVT_DLG
  #1816 = String             #1817        // TvTEventMaxParticipantsPerIP
  #1817 = Utf8               TvTEventMaxParticipantsPerIP
  #1818 = Fieldref           #27.#1819    // ext/mods/Config.TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1819 = NameAndType        #1820:#86    // TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #1820 = Utf8               TVT_EVENT_MAX_PARTICIPANTS_PER_IP
  #1821 = Fieldref           #27.#1822    // ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
  #1822 = NameAndType        #1823:#43    // GEOENGINE_FILE:Ljava/lang/String;
  #1823 = Utf8               GEOENGINE_FILE
  #1824 = String             #1825        // GeoDataPath
  #1825 = Utf8               GeoDataPath
  #1826 = String             #1827        // ./data/geodata/
  #1827 = Utf8               ./data/geodata/
  #1828 = Methodref          #27.#1829    // ext/mods/Config.getString:(Lext/mods/commons/config/ExProperties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1829 = NameAndType        #1830:#1831  // getString:(Lext/mods/commons/config/ExProperties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1830 = Utf8               getString
  #1831 = Utf8               (Lext/mods/commons/config/ExProperties;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1832 = Fieldref           #27.#1833    // ext/mods/Config.GEODATA_PATH:Ljava/lang/String;
  #1833 = NameAndType        #1834:#43    // GEODATA_PATH:Ljava/lang/String;
  #1834 = Utf8               GEODATA_PATH
  #1835 = Class              #1836        // ext/mods/gameserver/enums/GeoType
  #1836 = Utf8               ext/mods/gameserver/enums/GeoType
  #1837 = String             #1838        // GeoDataType
  #1838 = Utf8               GeoDataType
  #1839 = String             #1840        // L2OFF
  #1840 = Utf8               L2OFF
  #1841 = Methodref          #1842.#1843  // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #1842 = Class              #1844        // java/lang/Enum
  #1843 = NameAndType        #406:#1845   // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #1844 = Utf8               java/lang/Enum
  #1845 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #1846 = Fieldref           #27.#1847    // ext/mods/Config.GEODATA_TYPE:Lext/mods/gameserver/enums/GeoType;
  #1847 = NameAndType        #1848:#1849  // GEODATA_TYPE:Lext/mods/gameserver/enums/GeoType;
  #1848 = Utf8               GEODATA_TYPE
  #1849 = Utf8               Lext/mods/gameserver/enums/GeoType;
  #1850 = String             #1851        // MaxGeopathFailCount
  #1851 = Utf8               MaxGeopathFailCount
  #1852 = Methodref          #868.#1853   // java/lang/Math.max:(II)I
  #1853 = NameAndType        #1854:#1855  // max:(II)I
  #1854 = Utf8               max
  #1855 = Utf8               (II)I
  #1856 = Fieldref           #27.#1857    // ext/mods/Config.MAX_GEOPATH_FAIL_COUNT:I
  #1857 = NameAndType        #1858:#86    // MAX_GEOPATH_FAIL_COUNT:I
  #1858 = Utf8               MAX_GEOPATH_FAIL_COUNT
  #1859 = String             #1860        // PartOfCharacterHeight
  #1860 = Utf8               PartOfCharacterHeight
  #1861 = Fieldref           #27.#1862    // ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
  #1862 = NameAndType        #1863:#86    // PART_OF_CHARACTER_HEIGHT:I
  #1863 = Utf8               PART_OF_CHARACTER_HEIGHT
  #1864 = String             #1865        // MaxObstacleHeight
  #1865 = Utf8               MaxObstacleHeight
  #1866 = Fieldref           #27.#1867    // ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
  #1867 = NameAndType        #1868:#86    // MAX_OBSTACLE_HEIGHT:I
  #1868 = Utf8               MAX_OBSTACLE_HEIGHT
  #1869 = String             #1870        // NpcZindex
  #1870 = Utf8               NpcZindex
  #1871 = Fieldref           #27.#1872    // ext/mods/Config.NPC_Z_INDEX:I
  #1872 = NameAndType        #1873:#86    // NPC_Z_INDEX:I
  #1873 = Utf8               NPC_Z_INDEX
  #1874 = String             #1875        // MoveWeight
  #1875 = Utf8               MoveWeight
  #1876 = Fieldref           #27.#1877    // ext/mods/Config.MOVE_WEIGHT:I
  #1877 = NameAndType        #1878:#86    // MOVE_WEIGHT:I
  #1878 = Utf8               MOVE_WEIGHT
  #1879 = String             #1880        // MoveWeightDiag
  #1880 = Utf8               MoveWeightDiag
  #1881 = Fieldref           #27.#1882    // ext/mods/Config.MOVE_WEIGHT_DIAG:I
  #1882 = NameAndType        #1883:#86    // MOVE_WEIGHT_DIAG:I
  #1883 = Utf8               MOVE_WEIGHT_DIAG
  #1884 = String             #1885        // ObstacleWeight
  #1885 = Utf8               ObstacleWeight
  #1886 = Fieldref           #27.#1887    // ext/mods/Config.OBSTACLE_WEIGHT:I
  #1887 = NameAndType        #1888:#86    // OBSTACLE_WEIGHT:I
  #1888 = Utf8               OBSTACLE_WEIGHT
  #1889 = Double             2.0d
  #1891 = Methodref          #868.#1892   // java/lang/Math.sqrt:(D)D
  #1892 = NameAndType        #1893:#1894  // sqrt:(D)D
  #1893 = Utf8               sqrt
  #1894 = Utf8               (D)D
  #1895 = Fieldref           #27.#1896    // ext/mods/Config.OBSTACLE_WEIGHT_DIAG:I
  #1896 = NameAndType        #1897:#86    // OBSTACLE_WEIGHT_DIAG:I
  #1897 = Utf8               OBSTACLE_WEIGHT_DIAG
  #1898 = String             #1899        // EnableBoundaryCellPenalty
  #1899 = Utf8               EnableBoundaryCellPenalty
  #1900 = Fieldref           #27.#1901    // ext/mods/Config.ENABLE_BOUNDARY_CELL_PENALTY:Z
  #1901 = NameAndType        #1902:#57    // ENABLE_BOUNDARY_CELL_PENALTY:Z
  #1902 = Utf8               ENABLE_BOUNDARY_CELL_PENALTY
  #1903 = String             #1904        // BoundaryCellPenalty
  #1904 = Utf8               BoundaryCellPenalty
  #1905 = Fieldref           #27.#1906    // ext/mods/Config.BOUNDARY_CELL_PENALTY:I
  #1906 = NameAndType        #1907:#86    // BOUNDARY_CELL_PENALTY:I
  #1907 = Utf8               BOUNDARY_CELL_PENALTY
  #1908 = String             #1909        // BoundaryBuffer
  #1909 = Utf8               BoundaryBuffer
  #1910 = Fieldref           #27.#1911    // ext/mods/Config.BOUNDARY_BUFFER:I
  #1911 = NameAndType        #1912:#86    // BOUNDARY_BUFFER:I
  #1912 = Utf8               BOUNDARY_BUFFER
  #1913 = String             #1914        // HeuristicWeight
  #1914 = Utf8               HeuristicWeight
  #1915 = Fieldref           #27.#1916    // ext/mods/Config.HEURISTIC_WEIGHT:I
  #1916 = NameAndType        #1917:#86    // HEURISTIC_WEIGHT:I
  #1917 = Utf8               HEURISTIC_WEIGHT
  #1918 = String             #1919        // MaxIterations
  #1919 = Utf8               MaxIterations
  #1920 = Fieldref           #27.#1921    // ext/mods/Config.MAX_ITERATIONS:I
  #1921 = NameAndType        #1922:#86    // MAX_ITERATIONS:I
  #1922 = Utf8               MAX_ITERATIONS
  #1923 = String             #1924        // SistemaPathfinding
  #1924 = Utf8               SistemaPathfinding
  #1925 = Fieldref           #27.#1926    // ext/mods/Config.SISTEMA_PATHFINDING:Z
  #1926 = NameAndType        #1927:#57    // SISTEMA_PATHFINDING:Z
  #1927 = Utf8               SISTEMA_PATHFINDING
  #1928 = String             #1929        // UseOptimizedMovement
  #1929 = Utf8               UseOptimizedMovement
  #1930 = Fieldref           #27.#1931    // ext/mods/Config.USE_OPTIMIZED_MOVEMENT:Z
  #1931 = NameAndType        #1932:#57    // USE_OPTIMIZED_MOVEMENT:Z
  #1932 = Utf8               USE_OPTIMIZED_MOVEMENT
  #1933 = String             #1934        // EnableClientSidePrediction
  #1934 = Utf8               EnableClientSidePrediction
  #1935 = Fieldref           #27.#1936    // ext/mods/Config.ENABLE_CLIENT_SIDE_PREDICTION:Z
  #1936 = NameAndType        #1937:#57    // ENABLE_CLIENT_SIDE_PREDICTION:Z
  #1937 = Utf8               ENABLE_CLIENT_SIDE_PREDICTION
  #1938 = String             #1939        // MovementValidationInterval
  #1939 = Utf8               MovementValidationInterval
  #1940 = Fieldref           #27.#1941    // ext/mods/Config.MOVEMENT_VALIDATION_INTERVAL:I
  #1941 = NameAndType        #1942:#86    // MOVEMENT_VALIDATION_INTERVAL:I
  #1942 = Utf8               MOVEMENT_VALIDATION_INTERVAL
  #1943 = String             #1944        // MovementReconciliationThreshold
  #1944 = Utf8               MovementReconciliationThreshold
  #1945 = Double             32.0d
  #1947 = Fieldref           #27.#1948    // ext/mods/Config.MOVEMENT_RECONCILIATION_THRESHOLD:D
  #1948 = NameAndType        #1949:#365   // MOVEMENT_RECONCILIATION_THRESHOLD:D
  #1949 = Utf8               MOVEMENT_RECONCILIATION_THRESHOLD
  #1950 = String             #1951        // PathfindingMaxNodes
  #1951 = Utf8               PathfindingMaxNodes
  #1952 = Fieldref           #27.#1953    // ext/mods/Config.PATHFINDING_MAX_NODES:I
  #1953 = NameAndType        #1954:#86    // PATHFINDING_MAX_NODES:I
  #1954 = Utf8               PATHFINDING_MAX_NODES
  #1955 = String             #1956        // PathfindingMaxIterations
  #1956 = Utf8               PathfindingMaxIterations
  #1957 = Fieldref           #27.#1958    // ext/mods/Config.PATHFINDING_MAX_ITERATIONS:I
  #1958 = NameAndType        #1959:#86    // PATHFINDING_MAX_ITERATIONS:I
  #1959 = Utf8               PATHFINDING_MAX_ITERATIONS
  #1960 = String             #1961        // EnablePathSmoothing
  #1961 = Utf8               EnablePathSmoothing
  #1962 = Fieldref           #27.#1963    // ext/mods/Config.ENABLE_PATH_SMOOTHING:Z
  #1963 = NameAndType        #1964:#57    // ENABLE_PATH_SMOOTHING:Z
  #1964 = Utf8               ENABLE_PATH_SMOOTHING
  #1965 = String             #1966        // GeoEngineCacheSize
  #1966 = Utf8               GeoEngineCacheSize
  #1967 = Fieldref           #27.#1968    // ext/mods/Config.GEOENGINE_CACHE_SIZE:I
  #1968 = NameAndType        #1969:#86    // GEOENGINE_CACHE_SIZE:I
  #1969 = Utf8               GEOENGINE_CACHE_SIZE
  #1970 = String             #1971        // EnablePathfindingCache
  #1971 = Utf8               EnablePathfindingCache
  #1972 = Fieldref           #27.#1973    // ext/mods/Config.ENABLE_PATHFINDING_CACHE:Z
  #1973 = NameAndType        #1974:#57    // ENABLE_PATHFINDING_CACHE:Z
  #1974 = Utf8               ENABLE_PATHFINDING_CACHE
  #1975 = String             #1976        // PathfindingCacheSize
  #1976 = Utf8               PathfindingCacheSize
  #1977 = Fieldref           #27.#1978    // ext/mods/Config.PATHFINDING_CACHE_SIZE:I
  #1978 = NameAndType        #1979:#86    // PATHFINDING_CACHE_SIZE:I
  #1979 = Utf8               PATHFINDING_CACHE_SIZE
  #1980 = String             #1981        // PathfindingCacheExpiration
  #1981 = Utf8               PathfindingCacheExpiration
  #1982 = Fieldref           #27.#1983    // ext/mods/Config.PATHFINDING_CACHE_EXPIRATION:I
  #1983 = NameAndType        #1984:#86    // PATHFINDING_CACHE_EXPIRATION:I
  #1984 = Utf8               PATHFINDING_CACHE_EXPIRATION
  #1985 = String             #1986        // PathfindingThreads
  #1986 = Utf8               PathfindingThreads
  #1987 = Fieldref           #27.#1988    // ext/mods/Config.PATHFINDING_THREADS:I
  #1988 = NameAndType        #1989:#86    // PATHFINDING_THREADS:I
  #1989 = Utf8               PATHFINDING_THREADS
  #1990 = String             #1991        // UsePathfindingPool
  #1991 = Utf8               UsePathfindingPool
  #1992 = Fieldref           #27.#1993    // ext/mods/Config.USE_PATHFINDING_POOL:Z
  #1993 = NameAndType        #1994:#57    // USE_PATHFINDING_POOL:Z
  #1994 = Utf8               USE_PATHFINDING_POOL
  #1995 = String             #1996        // UseL2BRPathfinding
  #1996 = Utf8               UseL2BRPathfinding
  #1997 = Fieldref           #27.#1998    // ext/mods/Config.USE_L2BR_PATHFINDING:Z
  #1998 = NameAndType        #1999:#57    // USE_L2BR_PATHFINDING:Z
  #1999 = Utf8               USE_L2BR_PATHFINDING
  #2000 = Methodref          #2001.#2002  // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
  #2001 = Class              #2003        // java/lang/Runtime
  #2002 = NameAndType        #2004:#2005  // getRuntime:()Ljava/lang/Runtime;
  #2003 = Utf8               java/lang/Runtime
  #2004 = Utf8               getRuntime
  #2005 = Utf8               ()Ljava/lang/Runtime;
  #2006 = Methodref          #2001.#2007  // java/lang/Runtime.availableProcessors:()I
  #2007 = NameAndType        #2008:#239   // availableProcessors:()I
  #2008 = Utf8               availableProcessors
  #2009 = String             #2010        // EnableSmoothObstacleAvoidance
  #2010 = Utf8               EnableSmoothObstacleAvoidance
  #2011 = Fieldref           #27.#2012    // ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
  #2012 = NameAndType        #2013:#57    // ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
  #2013 = Utf8               ENABLE_SMOOTH_OBSTACLE_AVOIDANCE
  #2014 = String             #2015        // ObstacleSmoothingDistance
  #2015 = Utf8               ObstacleSmoothingDistance
  #2016 = Fieldref           #27.#2017    // ext/mods/Config.OBSTACLE_SMOOTHING_DISTANCE:I
  #2017 = NameAndType        #2018:#86    // OBSTACLE_SMOOTHING_DISTANCE:I
  #2018 = Utf8               OBSTACLE_SMOOTHING_DISTANCE
  #2019 = String             #2020        // ObstacleDetectionDistance
  #2020 = Utf8               ObstacleDetectionDistance
  #2021 = Fieldref           #27.#2022    // ext/mods/Config.OBSTACLE_DETECTION_DISTANCE:I
  #2022 = NameAndType        #2023:#86    // OBSTACLE_DETECTION_DISTANCE:I
  #2023 = Utf8               OBSTACLE_DETECTION_DISTANCE
  #2024 = String             #2025        // PathfindingSmoothingLevel
  #2025 = Utf8               PathfindingSmoothingLevel
  #2026 = Fieldref           #27.#2027    // ext/mods/Config.PATHFINDING_SMOOTHING_LEVEL:I
  #2027 = NameAndType        #2028:#86    // PATHFINDING_SMOOTHING_LEVEL:I
  #2028 = Utf8               PATHFINDING_SMOOTHING_LEVEL
  #2029 = String             #2030        // EnableRealTimeObstacleAvoidance
  #2030 = Utf8               EnableRealTimeObstacleAvoidance
  #2031 = Fieldref           #27.#2032    // ext/mods/Config.ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
  #2032 = NameAndType        #2033:#57    // ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
  #2033 = Utf8               ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE
  #2034 = String             #2035        // AttackUsePathfinder
  #2035 = Utf8               AttackUsePathfinder
  #2036 = Fieldref           #27.#2037    // ext/mods/Config.ATTACK_USE_PATHFINDER:Z
  #2037 = NameAndType        #2038:#57    // ATTACK_USE_PATHFINDER:Z
  #2038 = Utf8               ATTACK_USE_PATHFINDER
  #2039 = String             #2040        // GeoHeightTolerance
  #2040 = Utf8               GeoHeightTolerance
  #2041 = Fieldref           #27.#2042    // ext/mods/Config.GEO_HEIGHT_TOLERANCE:I
  #2042 = NameAndType        #2043:#86    // GEO_HEIGHT_TOLERANCE:I
  #2043 = Utf8               GEO_HEIGHT_TOLERANCE
  #2044 = String             #2045        // ShortDistanceThreshold
  #2045 = Utf8               ShortDistanceThreshold
  #2046 = Fieldref           #27.#2047    // ext/mods/Config.SHORT_DISTANCE_THRESHOLD:I
  #2047 = NameAndType        #2048:#86    // SHORT_DISTANCE_THRESHOLD:I
  #2048 = Utf8               SHORT_DISTANCE_THRESHOLD
  #2049 = String             #2050        // MaxShortDistanceHeightDiff
  #2050 = Utf8               MaxShortDistanceHeightDiff
  #2051 = Fieldref           #27.#2052    // ext/mods/Config.MAX_SHORT_DISTANCE_HEIGHT_DIFF:I
  #2052 = NameAndType        #2053:#86    // MAX_SHORT_DISTANCE_HEIGHT_DIFF:I
  #2053 = Utf8               MAX_SHORT_DISTANCE_HEIGHT_DIFF
  #2054 = String             #2055        // MaxConsecutiveBlocks
  #2055 = Utf8               MaxConsecutiveBlocks
  #2056 = Fieldref           #27.#2057    // ext/mods/Config.MAX_CONSECUTIVE_BLOCKS:I
  #2057 = NameAndType        #2058:#86    // MAX_CONSECUTIVE_BLOCKS:I
  #2058 = Utf8               MAX_CONSECUTIVE_BLOCKS
  #2059 = String             #2060        // EnableNpcMovementOptimization
  #2060 = Utf8               EnableNpcMovementOptimization
  #2061 = Fieldref           #27.#2062    // ext/mods/Config.ENABLE_NPC_MOVEMENT_OPTIMIZATION:Z
  #2062 = NameAndType        #2063:#57    // ENABLE_NPC_MOVEMENT_OPTIMIZATION:Z
  #2063 = Utf8               ENABLE_NPC_MOVEMENT_OPTIMIZATION
  #2064 = String             #2065        // NpcMovementPlayerRange
  #2065 = Utf8               NpcMovementPlayerRange
  #2066 = Fieldref           #27.#2067    // ext/mods/Config.NPC_MOVEMENT_PLAYER_RANGE:I
  #2067 = NameAndType        #2068:#86    // NPC_MOVEMENT_PLAYER_RANGE:I
  #2068 = Utf8               NPC_MOVEMENT_PLAYER_RANGE
  #2069 = String             #2070        // EnableCreatureCollision
  #2070 = Utf8               EnableCreatureCollision
  #2071 = Fieldref           #27.#2072    // ext/mods/Config.ENABLE_CREATURE_COLLISION:Z
  #2072 = NameAndType        #2073:#57    // ENABLE_CREATURE_COLLISION:Z
  #2073 = Utf8               ENABLE_CREATURE_COLLISION
  #2074 = String             #2075        // CreatureCollisionCheckRadius
  #2075 = Utf8               CreatureCollisionCheckRadius
  #2076 = Fieldref           #27.#2077    // ext/mods/Config.CREATURE_COLLISION_CHECK_RADIUS:I
  #2077 = NameAndType        #2078:#86    // CREATURE_COLLISION_CHECK_RADIUS:I
  #2078 = Utf8               CREATURE_COLLISION_CHECK_RADIUS
  #2079 = String             #2080        // CreatureCollisionAvoidanceRadius
  #2080 = Utf8               CreatureCollisionAvoidanceRadius
  #2081 = Fieldref           #27.#2082    // ext/mods/Config.CREATURE_COLLISION_AVOIDANCE_RADIUS:I
  #2082 = NameAndType        #2083:#86    // CREATURE_COLLISION_AVOIDANCE_RADIUS:I
  #2083 = Utf8               CREATURE_COLLISION_AVOIDANCE_RADIUS
  #2084 = String             #2085        // MaxAlternativePositions
  #2085 = Utf8               MaxAlternativePositions
  #2086 = Fieldref           #27.#2087    // ext/mods/Config.MAX_ALTERNATIVE_POSITIONS:I
  #2087 = NameAndType        #2088:#86    // MAX_ALTERNATIVE_POSITIONS:I
  #2088 = Utf8               MAX_ALTERNATIVE_POSITIONS
  #2089 = String             #2090        // CreatureCollisionPushForce
  #2090 = Utf8               CreatureCollisionPushForce
  #2091 = Double             0.3d
  #2093 = Fieldref           #27.#2094    // ext/mods/Config.CREATURE_COLLISION_PUSH_FORCE:D
  #2094 = NameAndType        #2095:#365   // CREATURE_COLLISION_PUSH_FORCE:D
  #2095 = Utf8               CREATURE_COLLISION_PUSH_FORCE
  #2096 = String             #2097        // ext.mods.Config.ServerID
  #2097 = Utf8               ext.mods.Config.ServerID
  #2098 = Methodref          #2099.#1451  // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
  #2099 = Class              #2100        // java/lang/System
  #2100 = Utf8               java/lang/System
  #2101 = String             #2102        // ext.mods.Config.HexID
  #2102 = Utf8               ext.mods.Config.HexID
  #2103 = Fieldref           #27.#2104    // ext/mods/Config.HEXID_FILE:Ljava/lang/String;
  #2104 = NameAndType        #2105:#43    // HEXID_FILE:Ljava/lang/String;
  #2105 = Utf8               HEXID_FILE
  #2106 = String             #2107        // ServerID
  #2107 = Utf8               ServerID
  #2108 = Fieldref           #27.#2109    // ext/mods/Config.SERVER_ID:I
  #2109 = NameAndType        #2110:#86    // SERVER_ID:I
  #2110 = Utf8               SERVER_ID
  #2111 = Class              #2112        // java/math/BigInteger
  #2112 = Utf8               java/math/BigInteger
  #2113 = String             #2114        // HexID
  #2114 = Utf8               HexID
  #2115 = Methodref          #2111.#2116  // java/math/BigInteger."<init>":(Ljava/lang/String;I)V
  #2116 = NameAndType        #5:#2117     // "<init>":(Ljava/lang/String;I)V
  #2117 = Utf8               (Ljava/lang/String;I)V
  #2118 = Methodref          #2111.#2119  // java/math/BigInteger.toByteArray:()[B
  #2119 = NameAndType        #2120:#2121  // toByteArray:()[B
  #2120 = Utf8               toByteArray
  #2121 = Utf8               ()[B
  #2122 = Fieldref           #27.#2123    // ext/mods/Config.HEX_ID:[B
  #2123 = NameAndType        #2124:#2125  // HEX_ID:[B
  #2124 = Utf8               HEX_ID
  #2125 = Utf8               [B
  #2126 = Fieldref           #27.#2127    // ext/mods/Config.LANGUAGE_FILE:Ljava/lang/String;
  #2127 = NameAndType        #2128:#43    // LANGUAGE_FILE:Ljava/lang/String;
  #2128 = Utf8               LANGUAGE_FILE
  #2129 = String             #2130        // defaultLocale
  #2130 = Utf8               defaultLocale
  #2131 = String             #2132        // en-US
  #2132 = Utf8               en-US
  #2133 = Methodref          #2134.#2135  // java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #2134 = Class              #2136        // java/util/Locale
  #2135 = NameAndType        #2137:#2138  // forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #2136 = Utf8               java/util/Locale
  #2137 = Utf8               forLanguageTag
  #2138 = Utf8               (Ljava/lang/String;)Ljava/util/Locale;
  #2139 = Fieldref           #27.#2140    // ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
  #2140 = NameAndType        #2141:#2142  // DEFAULT_LOCALE:Ljava/util/Locale;
  #2141 = Utf8               DEFAULT_LOCALE
  #2142 = Utf8               Ljava/util/Locale;
  #2143 = String             #2144        // locales
  #2144 = Utf8               locales
  #2145 = InterfaceMethodref #429.#2146   // java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #2146 = NameAndType        #2147:#2148  // of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #2147 = Utf8               of
  #2148 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #2149 = InvokeDynamic      #9:#2150     // #9:apply:()Ljava/util/function/Function;
  #2150 = NameAndType        #2151:#2152  // apply:()Ljava/util/function/Function;
  #2151 = Utf8               apply
  #2152 = Utf8               ()Ljava/util/function/Function;
  #2153 = InterfaceMethodref #429.#2154   // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #2154 = NameAndType        #2155:#2156  // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #2155 = Utf8               map
  #2156 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #2157 = InterfaceMethodref #429.#2158   // java/util/stream/Stream.toList:()Ljava/util/List;
  #2158 = NameAndType        #2159:#2160  // toList:()Ljava/util/List;
  #2159 = Utf8               toList
  #2160 = Utf8               ()Ljava/util/List;
  #2161 = InterfaceMethodref #446.#2162   // java/util/Set.copyOf:(Ljava/util/Collection;)Ljava/util/Set;
  #2162 = NameAndType        #2163:#2164  // copyOf:(Ljava/util/Collection;)Ljava/util/Set;
  #2163 = Utf8               copyOf
  #2164 = Utf8               (Ljava/util/Collection;)Ljava/util/Set;
  #2165 = Fieldref           #27.#2166    // ext/mods/Config.LOCALES:Ljava/util/Set;
  #2166 = NameAndType        #2167:#453   // LOCALES:Ljava/util/Set;
  #2167 = Utf8               LOCALES
  #2168 = String             #2169        // charset
  #2169 = Utf8               charset
  #2170 = String             #2171        // utf-8
  #2171 = Utf8               utf-8
  #2172 = Methodref          #2173.#2174  // java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
  #2173 = Class              #2175        // java/nio/charset/Charset
  #2174 = NameAndType        #2176:#2177  // forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
  #2175 = Utf8               java/nio/charset/Charset
  #2176 = Utf8               forName
  #2177 = Utf8               (Ljava/lang/String;)Ljava/nio/charset/Charset;
  #2178 = Fieldref           #27.#2179    // ext/mods/Config.CHARSET:Ljava/nio/charset/Charset;
  #2179 = NameAndType        #2180:#2181  // CHARSET:Ljava/nio/charset/Charset;
  #2180 = Utf8               CHARSET
  #2181 = Utf8               Ljava/nio/charset/Charset;
  #2182 = String             #2183        // CountryLocaleEnable
  #2183 = Utf8               CountryLocaleEnable
  #2184 = Fieldref           #27.#2185    // ext/mods/Config.COUNTRY_LOCALE_ENABLE:Z
  #2185 = NameAndType        #2186:#57    // COUNTRY_LOCALE_ENABLE:Z
  #2186 = Utf8               COUNTRY_LOCALE_ENABLE
  #2187 = String             #2188        // CountryLocaleNotify
  #2188 = Utf8               CountryLocaleNotify
  #2189 = Fieldref           #27.#2190    // ext/mods/Config.COUNTRY_LOCALE_NOTIFY:Z
  #2190 = NameAndType        #2191:#57    // COUNTRY_LOCALE_NOTIFY:Z
  #2191 = Utf8               COUNTRY_LOCALE_NOTIFY
  #2192 = String             #2193        // CountryLocaleAutoSet
  #2193 = Utf8               CountryLocaleAutoSet
  #2194 = Fieldref           #27.#2195    // ext/mods/Config.COUNTRY_LOCALE_AUTO_SET:Z
  #2195 = NameAndType        #2196:#57    // COUNTRY_LOCALE_AUTO_SET:Z
  #2196 = Utf8               COUNTRY_LOCALE_AUTO_SET
  #2197 = String             #2198        // CountryLocaleApiUrl
  #2198 = Utf8               CountryLocaleApiUrl
  #2199 = Fieldref           #27.#2200    // ext/mods/Config.COUNTRY_LOCALE_API_URL:Ljava/lang/String;
  #2200 = NameAndType        #2201:#43    // COUNTRY_LOCALE_API_URL:Ljava/lang/String;
  #2201 = Utf8               COUNTRY_LOCALE_API_URL
  #2202 = String             #2203        // CountryLocaleTimeoutMs
  #2203 = Utf8               CountryLocaleTimeoutMs
  #2204 = Fieldref           #27.#2205    // ext/mods/Config.COUNTRY_LOCALE_TIMEOUT_MS:I
  #2205 = NameAndType        #2206:#86    // COUNTRY_LOCALE_TIMEOUT_MS:I
  #2206 = Utf8               COUNTRY_LOCALE_TIMEOUT_MS
  #2207 = String             #2208        // CountryLocaleMap
  #2208 = Utf8               CountryLocaleMap
  #2209 = Methodref          #2210.#2211  // ext/mods/gameserver/data/manager/CountryLocaleManager.reloadCountryMap:(Ljava/lang/String;)V
  #2210 = Class              #2212        // ext/mods/gameserver/data/manager/CountryLocaleManager
  #2211 = NameAndType        #2213:#13    // reloadCountryMap:(Ljava/lang/String;)V
  #2212 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager
  #2213 = Utf8               reloadCountryMap
  #2214 = Methodref          #27.#2215    // ext/mods/Config.saveHexid:(ILjava/lang/String;Ljava/lang/String;)V
  #2215 = NameAndType        #2216:#2217  // saveHexid:(ILjava/lang/String;Ljava/lang/String;)V
  #2216 = Utf8               saveHexid
  #2217 = Utf8               (ILjava/lang/String;Ljava/lang/String;)V
  #2218 = Methodref          #17.#2219    // java/io/File.createNewFile:()Z
  #2219 = NameAndType        #2220:#384   // createNewFile:()Z
  #2220 = Utf8               createNewFile
  #2221 = Class              #2222        // java/util/Properties
  #2222 = Utf8               java/util/Properties
  #2223 = Methodref          #2221.#3     // java/util/Properties."<init>":()V
  #2224 = Methodref          #215.#2225   // java/lang/String.valueOf:(I)Ljava/lang/String;
  #2225 = NameAndType        #406:#225    // valueOf:(I)Ljava/lang/String;
  #2226 = Methodref          #2221.#2227  // java/util/Properties.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
  #2227 = NameAndType        #2228:#2229  // setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
  #2228 = Utf8               setProperty
  #2229 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
  #2230 = Class              #2231        // java/io/FileOutputStream
  #2231 = Utf8               java/io/FileOutputStream
  #2232 = Methodref          #2230.#2233  // java/io/FileOutputStream."<init>":(Ljava/io/File;)V
  #2233 = NameAndType        #5:#23       // "<init>":(Ljava/io/File;)V
  #2234 = String             #2235        // the hexID to auth into login
  #2235 = Utf8               the hexID to auth into login
  #2236 = Methodref          #2221.#2237  // java/util/Properties.store:(Ljava/io/OutputStream;Ljava/lang/String;)V
  #2237 = NameAndType        #2238:#2239  // store:(Ljava/io/OutputStream;Ljava/lang/String;)V
  #2238 = Utf8               store
  #2239 = Utf8               (Ljava/io/OutputStream;Ljava/lang/String;)V
  #2240 = Methodref          #2241.#2242  // java/io/OutputStream.close:()V
  #2241 = Class              #2243        // java/io/OutputStream
  #2242 = NameAndType        #2244:#6     // close:()V
  #2243 = Utf8               java/io/OutputStream
  #2244 = Utf8               close
  #2245 = Class              #2246        // java/lang/Throwable
  #2246 = Utf8               java/lang/Throwable
  #2247 = Methodref          #2245.#2248  // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #2248 = NameAndType        #2249:#2250  // addSuppressed:(Ljava/lang/Throwable;)V
  #2249 = Utf8               addSuppressed
  #2250 = Utf8               (Ljava/lang/Throwable;)V
  #2251 = String             #2252        // Failed to save hex ID to \'{}\' file.
  #2252 = Utf8               Failed to save hex ID to \'{}\' file.
  #2253 = Fieldref           #27.#2254    // ext/mods/Config.NPCS_FILE:Ljava/lang/String;
  #2254 = NameAndType        #2255:#43    // NPCS_FILE:Ljava/lang/String;
  #2255 = Utf8               NPCS_FILE
  #2256 = String             #2257        // SpawnMultiplier
  #2257 = Utf8               SpawnMultiplier
  #2258 = Fieldref           #27.#2259    // ext/mods/Config.SPAWN_MULTIPLIER:D
  #2259 = NameAndType        #2260:#365   // SPAWN_MULTIPLIER:D
  #2260 = Utf8               SPAWN_MULTIPLIER
  #2261 = String             #2262        // SpawnEvents
  #2262 = Utf8               SpawnEvents
  #2263 = String             #2264        // extra_mob
  #2264 = Utf8               extra_mob
  #2265 = String             #2266        // 18age
  #2266 = Utf8               18age
  #2267 = String             #2268        // start_weapon
  #2268 = Utf8               start_weapon
  #2269 = Methodref          #14.#2270    // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #2270 = NameAndType        #52:#2271    // getProperty:(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #2271 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
  #2272 = Fieldref           #27.#2273    // ext/mods/Config.SPAWN_EVENTS:[Ljava/lang/String;
  #2273 = NameAndType        #2274:#1039  // SPAWN_EVENTS:[Ljava/lang/String;
  #2274 = Utf8               SPAWN_EVENTS
  #2275 = String             #2276        // MonsterMaxRange
  #2276 = Utf8               MonsterMaxRange
  #2277 = Fieldref           #27.#2278    // ext/mods/Config.MONSTER_MAX_RANGE:I
  #2278 = NameAndType        #2279:#86    // MONSTER_MAX_RANGE:I
  #2279 = Utf8               MONSTER_MAX_RANGE
  #2280 = String             #2281        // ChampionFrequency
  #2281 = Utf8               ChampionFrequency
  #2282 = Fieldref           #27.#2283    // ext/mods/Config.CHAMPION_FREQUENCY:I
  #2283 = NameAndType        #2284:#86    // CHAMPION_FREQUENCY:I
  #2284 = Utf8               CHAMPION_FREQUENCY
  #2285 = String             #2286        // ChampionMinLevel
  #2286 = Utf8               ChampionMinLevel
  #2287 = Fieldref           #27.#2288    // ext/mods/Config.CHAMP_MIN_LVL:I
  #2288 = NameAndType        #2289:#86    // CHAMP_MIN_LVL:I
  #2289 = Utf8               CHAMP_MIN_LVL
  #2290 = String             #2291        // ChampionMaxLevel
  #2291 = Utf8               ChampionMaxLevel
  #2292 = Fieldref           #27.#2293    // ext/mods/Config.CHAMP_MAX_LVL:I
  #2293 = NameAndType        #2294:#86    // CHAMP_MAX_LVL:I
  #2294 = Utf8               CHAMP_MAX_LVL
  #2295 = String             #2296        // ChampionHp
  #2296 = Utf8               ChampionHp
  #2297 = Fieldref           #27.#2298    // ext/mods/Config.CHAMPION_HP:I
  #2298 = NameAndType        #2299:#86    // CHAMPION_HP:I
  #2299 = Utf8               CHAMPION_HP
  #2300 = String             #2301        // ChampionHpRegen
  #2301 = Utf8               ChampionHpRegen
  #2302 = Fieldref           #27.#2303    // ext/mods/Config.CHAMPION_HP_REGEN:D
  #2303 = NameAndType        #2304:#365   // CHAMPION_HP_REGEN:D
  #2304 = Utf8               CHAMPION_HP_REGEN
  #2305 = String             #2306        // ChampionRateXp
  #2306 = Utf8               ChampionRateXp
  #2307 = Fieldref           #27.#2308    // ext/mods/Config.CHAMPION_RATE_XP:D
  #2308 = NameAndType        #2309:#365   // CHAMPION_RATE_XP:D
  #2309 = Utf8               CHAMPION_RATE_XP
  #2310 = String             #2311        // ChampionRateSp
  #2311 = Utf8               ChampionRateSp
  #2312 = Fieldref           #27.#2313    // ext/mods/Config.CHAMPION_RATE_SP:D
  #2313 = NameAndType        #2314:#365   // CHAMPION_RATE_SP:D
  #2314 = Utf8               CHAMPION_RATE_SP
  #2315 = String             #2316        // PremiumChampionRateXp
  #2316 = Utf8               PremiumChampionRateXp
  #2317 = Fieldref           #27.#2318    // ext/mods/Config.PREMIUM_CHAMPION_RATE_XP:D
  #2318 = NameAndType        #2319:#365   // PREMIUM_CHAMPION_RATE_XP:D
  #2319 = Utf8               PREMIUM_CHAMPION_RATE_XP
  #2320 = String             #2321        // PremiumChampionRateSp
  #2321 = Utf8               PremiumChampionRateSp
  #2322 = Fieldref           #27.#2323    // ext/mods/Config.PREMIUM_CHAMPION_RATE_SP:D
  #2323 = NameAndType        #2324:#365   // PREMIUM_CHAMPION_RATE_SP:D
  #2324 = Utf8               PREMIUM_CHAMPION_RATE_SP
  #2325 = String             #2326        // ChampionRewards
  #2326 = Utf8               ChampionRewards
  #2327 = Fieldref           #27.#2328    // ext/mods/Config.CHAMPION_REWARDS:I
  #2328 = NameAndType        #2329:#86    // CHAMPION_REWARDS:I
  #2329 = Utf8               CHAMPION_REWARDS
  #2330 = String             #2331        // PremiumChampionRewards
  #2331 = Utf8               PremiumChampionRewards
  #2332 = Fieldref           #27.#2333    // ext/mods/Config.PREMIUM_CHAMPION_REWARDS:I
  #2333 = NameAndType        #2334:#86    // PREMIUM_CHAMPION_REWARDS:I
  #2334 = Utf8               PREMIUM_CHAMPION_REWARDS
  #2335 = String             #2336        // ChampionAdenasRewards
  #2336 = Utf8               ChampionAdenasRewards
  #2337 = Fieldref           #27.#2338    // ext/mods/Config.CHAMPION_ADENAS_REWARDS:I
  #2338 = NameAndType        #2339:#86    // CHAMPION_ADENAS_REWARDS:I
  #2339 = Utf8               CHAMPION_ADENAS_REWARDS
  #2340 = String             #2341        // ChampionSealStoneRewards
  #2341 = Utf8               ChampionSealStoneRewards
  #2342 = Fieldref           #27.#2343    // ext/mods/Config.CHAMPION_SEALSTONE_REWARDS:I
  #2343 = NameAndType        #2344:#86    // CHAMPION_SEALSTONE_REWARDS:I
  #2344 = Utf8               CHAMPION_SEALSTONE_REWARDS
  #2345 = String             #2346        // PremiumChampionAdenasRewards
  #2346 = Utf8               PremiumChampionAdenasRewards
  #2347 = Fieldref           #27.#2348    // ext/mods/Config.PREMIUM_CHAMPION_ADENAS_REWARDS:I
  #2348 = NameAndType        #2349:#86    // PREMIUM_CHAMPION_ADENAS_REWARDS:I
  #2349 = Utf8               PREMIUM_CHAMPION_ADENAS_REWARDS
  #2350 = String             #2351        // PremiumChampionSealStoneRewards
  #2351 = Utf8               PremiumChampionSealStoneRewards
  #2352 = Fieldref           #27.#2353    // ext/mods/Config.PREMIUM_CHAMPION_SEALSTONE_REWARDS:I
  #2353 = NameAndType        #2354:#86    // PREMIUM_CHAMPION_SEALSTONE_REWARDS:I
  #2354 = Utf8               PREMIUM_CHAMPION_SEALSTONE_REWARDS
  #2355 = String             #2356        // ChampionSpoilRewards
  #2356 = Utf8               ChampionSpoilRewards
  #2357 = Fieldref           #27.#2358    // ext/mods/Config.CHAMPION_SPOIL_REWARDS:I
  #2358 = NameAndType        #2359:#86    // CHAMPION_SPOIL_REWARDS:I
  #2359 = Utf8               CHAMPION_SPOIL_REWARDS
  #2360 = String             #2361        // PremiumChampionSpoilRewards
  #2361 = Utf8               PremiumChampionSpoilRewards
  #2362 = Fieldref           #27.#2363    // ext/mods/Config.PREMIUM_CHAMPION_SPOIL_REWARDS:I
  #2363 = NameAndType        #2364:#86    // PREMIUM_CHAMPION_SPOIL_REWARDS:I
  #2364 = Utf8               PREMIUM_CHAMPION_SPOIL_REWARDS
  #2365 = String             #2366        // ChampionAtk
  #2366 = Utf8               ChampionAtk
  #2367 = Fieldref           #27.#2368    // ext/mods/Config.CHAMPION_ATK:D
  #2368 = NameAndType        #2369:#365   // CHAMPION_ATK:D
  #2369 = Utf8               CHAMPION_ATK
  #2370 = String             #2371        // ChampionMAtk
  #2371 = Utf8               ChampionMAtk
  #2372 = Fieldref           #27.#2373    // ext/mods/Config.CHAMPION_MATK:D
  #2373 = NameAndType        #2374:#365   // CHAMPION_MATK:D
  #2374 = Utf8               CHAMPION_MATK
  #2375 = String             #2376        // ChampionSpdAtk
  #2376 = Utf8               ChampionSpdAtk
  #2377 = Fieldref           #27.#2378    // ext/mods/Config.CHAMPION_SPD_ATK:D
  #2378 = NameAndType        #2379:#365   // CHAMPION_SPD_ATK:D
  #2379 = Utf8               CHAMPION_SPD_ATK
  #2380 = String             #2381        // ChampionSpdMAtk
  #2381 = Utf8               ChampionSpdMAtk
  #2382 = Fieldref           #27.#2383    // ext/mods/Config.CHAMPION_SPD_MATK:D
  #2383 = NameAndType        #2384:#365   // CHAMPION_SPD_MATK:D
  #2384 = Utf8               CHAMPION_SPD_MATK
  #2385 = String             #2386        // ChampionRewardItem
  #2386 = Utf8               ChampionRewardItem
  #2387 = Fieldref           #27.#2388    // ext/mods/Config.CHAMPION_REWARD:I
  #2388 = NameAndType        #2389:#86    // CHAMPION_REWARD:I
  #2389 = Utf8               CHAMPION_REWARD
  #2390 = String             #2391        // ChampionRewardItemID
  #2391 = Utf8               ChampionRewardItemID
  #2392 = Fieldref           #27.#2393    // ext/mods/Config.CHAMPION_REWARD_ID:I
  #2393 = NameAndType        #2394:#86    // CHAMPION_REWARD_ID:I
  #2394 = Utf8               CHAMPION_REWARD_ID
  #2395 = String             #2396        // ChampionRewardItemQty
  #2396 = Utf8               ChampionRewardItemQty
  #2397 = Fieldref           #27.#2398    // ext/mods/Config.CHAMPION_REWARD_QTY:I
  #2398 = NameAndType        #2399:#86    // CHAMPION_REWARD_QTY:I
  #2399 = Utf8               CHAMPION_REWARD_QTY
  #2400 = String             #2401        // ChampionAura
  #2401 = Utf8               ChampionAura
  #2402 = Fieldref           #27.#2403    // ext/mods/Config.CHAMPION_AURA:I
  #2403 = NameAndType        #2404:#86    // CHAMPION_AURA:I
  #2404 = Utf8               CHAMPION_AURA
  #2405 = String             #2406        // AllowEntireTree
  #2406 = Utf8               AllowEntireTree
  #2407 = Fieldref           #27.#2408    // ext/mods/Config.ALLOW_ENTIRE_TREE:Z
  #2408 = NameAndType        #2409:#57    // ALLOW_ENTIRE_TREE:Z
  #2409 = Utf8               ALLOW_ENTIRE_TREE
  #2410 = Class              #2411        // ext/mods/Config$ClassMasterSettings
  #2411 = Utf8               ext/mods/Config$ClassMasterSettings
  #2412 = String             #2413        // ConfigClassMaster
  #2413 = Utf8               ConfigClassMaster
  #2414 = Methodref          #2410.#12    // ext/mods/Config$ClassMasterSettings."<init>":(Ljava/lang/String;)V
  #2415 = Fieldref           #27.#2416    // ext/mods/Config.CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
  #2416 = NameAndType        #2417:#2418  // CLASS_MASTER_SETTINGS:Lext/mods/Config$ClassMasterSettings;
  #2417 = Utf8               CLASS_MASTER_SETTINGS
  #2418 = Utf8               Lext/mods/Config$ClassMasterSettings;
  #2419 = String             #2420        // AlternateClassMaster
  #2420 = Utf8               AlternateClassMaster
  #2421 = Fieldref           #27.#2422    // ext/mods/Config.ALTERNATE_CLASS_MASTER:Z
  #2422 = NameAndType        #2423:#57    // ALTERNATE_CLASS_MASTER:Z
  #2423 = Utf8               ALTERNATE_CLASS_MASTER
  #2424 = String             #2425        // NobleItemId
  #2425 = Utf8               NobleItemId
  #2426 = Fieldref           #27.#2427    // ext/mods/Config.NOBLE_ITEM_ID:I
  #2427 = NameAndType        #2428:#86    // NOBLE_ITEM_ID:I
  #2428 = Utf8               NOBLE_ITEM_ID
  #2429 = String             #2430        // NobleItemCount
  #2430 = Utf8               NobleItemCount
  #2431 = Fieldref           #27.#2432    // ext/mods/Config.NOBLE_ITEM_COUNT:I
  #2432 = NameAndType        #2433:#86    // NOBLE_ITEM_COUNT:I
  #2433 = Utf8               NOBLE_ITEM_COUNT
  #2434 = String             #2435        // WeddingPrice
  #2435 = Utf8               WeddingPrice
  #2436 = Fieldref           #27.#2437    // ext/mods/Config.WEDDING_PRICE:I
  #2437 = NameAndType        #2438:#86    // WEDDING_PRICE:I
  #2438 = Utf8               WEDDING_PRICE
  #2439 = String             #2440        // WeddingAllowSameSex
  #2440 = Utf8               WeddingAllowSameSex
  #2441 = Fieldref           #27.#2442    // ext/mods/Config.WEDDING_SAMESEX:Z
  #2442 = NameAndType        #2443:#57    // WEDDING_SAMESEX:Z
  #2443 = Utf8               WEDDING_SAMESEX
  #2444 = String             #2445        // WeddingFormalWear
  #2445 = Utf8               WeddingFormalWear
  #2446 = Fieldref           #27.#2447    // ext/mods/Config.WEDDING_FORMALWEAR:Z
  #2447 = NameAndType        #2448:#57    // WEDDING_FORMALWEAR:Z
  #2448 = Utf8               WEDDING_FORMALWEAR
  #2449 = String             #2450        // BufferMaxSchemesPerChar
  #2450 = Utf8               BufferMaxSchemesPerChar
  #2451 = Fieldref           #27.#2452    // ext/mods/Config.BUFFER_MAX_SCHEMES:I
  #2452 = NameAndType        #2453:#86    // BUFFER_MAX_SCHEMES:I
  #2453 = Utf8               BUFFER_MAX_SCHEMES
  #2454 = String             #2455        // BufferStaticCostPerBuff
  #2455 = Utf8               BufferStaticCostPerBuff
  #2456 = Fieldref           #27.#2457    // ext/mods/Config.BUFFER_STATIC_BUFF_COST:I
  #2457 = NameAndType        #2458:#86    // BUFFER_STATIC_BUFF_COST:I
  #2458 = Utf8               BUFFER_STATIC_BUFF_COST
  #2459 = String             #2460        // FreeTeleport
  #2460 = Utf8               FreeTeleport
  #2461 = Fieldref           #27.#2462    // ext/mods/Config.FREE_TELEPORT:Z
  #2462 = NameAndType        #2463:#57    // FREE_TELEPORT:Z
  #2463 = Utf8               FREE_TELEPORT
  #2464 = String             #2465        // LvlFreeTeleport
  #2465 = Utf8               LvlFreeTeleport
  #2466 = Fieldref           #27.#2467    // ext/mods/Config.LVL_FREE_TELEPORT:I
  #2467 = NameAndType        #2468:#86    // LVL_FREE_TELEPORT:I
  #2468 = Utf8               LVL_FREE_TELEPORT
  #2469 = String             #2470        // AnnounceMammonSpawn
  #2470 = Utf8               AnnounceMammonSpawn
  #2471 = Fieldref           #27.#2472    // ext/mods/Config.ANNOUNCE_MAMMON_SPAWN:Z
  #2472 = NameAndType        #2473:#57    // ANNOUNCE_MAMMON_SPAWN:Z
  #2473 = Utf8               ANNOUNCE_MAMMON_SPAWN
  #2474 = String             #2475        // MobAggroInPeaceZone
  #2475 = Utf8               MobAggroInPeaceZone
  #2476 = Fieldref           #27.#2477    // ext/mods/Config.MOB_AGGRO_IN_PEACEZONE:Z
  #2477 = NameAndType        #2478:#57    // MOB_AGGRO_IN_PEACEZONE:Z
  #2478 = Utf8               MOB_AGGRO_IN_PEACEZONE
  #2479 = String             #2480        // ShowNpcLevel
  #2480 = Utf8               ShowNpcLevel
  #2481 = Fieldref           #27.#2482    // ext/mods/Config.SHOW_NPC_LVL:Z
  #2482 = NameAndType        #2483:#57    // SHOW_NPC_LVL:Z
  #2483 = Utf8               SHOW_NPC_LVL
  #2484 = String             #2485        // ShowNpcTitleFormat
  #2485 = Utf8               ShowNpcTitleFormat
  #2486 = String             #2487        // Lvl %level% %aggro% %title%
  #2487 = Utf8               Lvl %level% %aggro% %title%
  #2488 = Fieldref           #27.#2489    // ext/mods/Config.SHOW_NPC_TITLE_FORMAT:Ljava/lang/String;
  #2489 = NameAndType        #2490:#43    // SHOW_NPC_TITLE_FORMAT:Ljava/lang/String;
  #2490 = Utf8               SHOW_NPC_TITLE_FORMAT
  #2491 = String             #2492        // ShowNpcTitleColor
  #2492 = Utf8               ShowNpcTitleColor
  #2493 = Fieldref           #27.#2494    // ext/mods/Config.SHOW_NPC_TITLE_COLOR:Ljava/lang/String;
  #2494 = NameAndType        #2495:#43    // SHOW_NPC_TITLE_COLOR:Ljava/lang/String;
  #2495 = Utf8               SHOW_NPC_TITLE_COLOR
  #2496 = String             #2497        // ShowNpcCrest
  #2497 = Utf8               ShowNpcCrest
  #2498 = Fieldref           #27.#2499    // ext/mods/Config.SHOW_NPC_CREST:Z
  #2499 = NameAndType        #2500:#57    // SHOW_NPC_CREST:Z
  #2500 = Utf8               SHOW_NPC_CREST
  #2501 = String             #2502        // ShowSummonCrest
  #2502 = Utf8               ShowSummonCrest
  #2503 = Fieldref           #27.#2504    // ext/mods/Config.SHOW_SUMMON_CREST:Z
  #2504 = NameAndType        #2505:#57    // SHOW_SUMMON_CREST:Z
  #2505 = Utf8               SHOW_SUMMON_CREST
  #2506 = String             #2507        // RequiredStriderLevel
  #2507 = Utf8               RequiredStriderLevel
  #2508 = Fieldref           #27.#2509    // ext/mods/Config.WYVERN_REQUIRED_LEVEL:I
  #2509 = NameAndType        #2510:#86    // WYVERN_REQUIRED_LEVEL:I
  #2510 = Utf8               WYVERN_REQUIRED_LEVEL
  #2511 = String             #2512        // RequiredCrystalsNumber
  #2512 = Utf8               RequiredCrystalsNumber
  #2513 = Fieldref           #27.#2514    // ext/mods/Config.WYVERN_REQUIRED_CRYSTALS:I
  #2514 = NameAndType        #2515:#86    // WYVERN_REQUIRED_CRYSTALS:I
  #2515 = Utf8               WYVERN_REQUIRED_CRYSTALS
  #2516 = String             #2517        // NpcStatMultipliers
  #2517 = Utf8               NpcStatMultipliers
  #2518 = Fieldref           #27.#2519    // ext/mods/Config.NPC_STAT_MULTIPLIERS:Z
  #2519 = NameAndType        #2520:#57    // NPC_STAT_MULTIPLIERS:Z
  #2520 = Utf8               NPC_STAT_MULTIPLIERS
  #2521 = String             #2522        // MonsterHP
  #2522 = Utf8               MonsterHP
  #2523 = Double             10.0d
  #2525 = Fieldref           #27.#2526    // ext/mods/Config.MONSTER_HP_MULTIPLIER:D
  #2526 = NameAndType        #2527:#365   // MONSTER_HP_MULTIPLIER:D
  #2527 = Utf8               MONSTER_HP_MULTIPLIER
  #2528 = String             #2529        // MonsterMP
  #2529 = Utf8               MonsterMP
  #2530 = Fieldref           #27.#2531    // ext/mods/Config.MONSTER_MP_MULTIPLIER:D
  #2531 = NameAndType        #2532:#365   // MONSTER_MP_MULTIPLIER:D
  #2532 = Utf8               MONSTER_MP_MULTIPLIER
  #2533 = String             #2534        // MonsterPAtk
  #2534 = Utf8               MonsterPAtk
  #2535 = Fieldref           #27.#2536    // ext/mods/Config.MONSTER_PATK_MULTIPLIER:D
  #2536 = NameAndType        #2537:#365   // MONSTER_PATK_MULTIPLIER:D
  #2537 = Utf8               MONSTER_PATK_MULTIPLIER
  #2538 = String             #2539        // MonsterMAtk
  #2539 = Utf8               MonsterMAtk
  #2540 = Fieldref           #27.#2541    // ext/mods/Config.MONSTER_MATK_MULTIPLIER:D
  #2541 = NameAndType        #2542:#365   // MONSTER_MATK_MULTIPLIER:D
  #2542 = Utf8               MONSTER_MATK_MULTIPLIER
  #2543 = String             #2544        // MonsterPDef
  #2544 = Utf8               MonsterPDef
  #2545 = Fieldref           #27.#2546    // ext/mods/Config.MONSTER_PDEF_MULTIPLIER:D
  #2546 = NameAndType        #2547:#365   // MONSTER_PDEF_MULTIPLIER:D
  #2547 = Utf8               MONSTER_PDEF_MULTIPLIER
  #2548 = String             #2549        // MonsterMDef
  #2549 = Utf8               MonsterMDef
  #2550 = Fieldref           #27.#2551    // ext/mods/Config.MONSTER_MDEF_MULTIPLIER:D
  #2551 = NameAndType        #2552:#365   // MONSTER_MDEF_MULTIPLIER:D
  #2552 = Utf8               MONSTER_MDEF_MULTIPLIER
  #2553 = String             #2554        // RaidbossHP
  #2554 = Utf8               RaidbossHP
  #2555 = Fieldref           #27.#2556    // ext/mods/Config.RAIDBOSS_HP_MULTIPLIER:D
  #2556 = NameAndType        #2557:#365   // RAIDBOSS_HP_MULTIPLIER:D
  #2557 = Utf8               RAIDBOSS_HP_MULTIPLIER
  #2558 = String             #2559        // RaidbossMP
  #2559 = Utf8               RaidbossMP
  #2560 = Fieldref           #27.#2561    // ext/mods/Config.RAIDBOSS_MP_MULTIPLIER:D
  #2561 = NameAndType        #2562:#365   // RAIDBOSS_MP_MULTIPLIER:D
  #2562 = Utf8               RAIDBOSS_MP_MULTIPLIER
  #2563 = String             #2564        // RaidbossPAtk
  #2564 = Utf8               RaidbossPAtk
  #2565 = Fieldref           #27.#2566    // ext/mods/Config.RAIDBOSS_PATK_MULTIPLIER:D
  #2566 = NameAndType        #2567:#365   // RAIDBOSS_PATK_MULTIPLIER:D
  #2567 = Utf8               RAIDBOSS_PATK_MULTIPLIER
  #2568 = String             #2569        // RaidbossMAtk
  #2569 = Utf8               RaidbossMAtk
  #2570 = Fieldref           #27.#2571    // ext/mods/Config.RAIDBOSS_MATK_MULTIPLIER:D
  #2571 = NameAndType        #2572:#365   // RAIDBOSS_MATK_MULTIPLIER:D
  #2572 = Utf8               RAIDBOSS_MATK_MULTIPLIER
  #2573 = String             #2574        // RaidbossPDef
  #2574 = Utf8               RaidbossPDef
  #2575 = Fieldref           #27.#2576    // ext/mods/Config.RAIDBOSS_PDEF_MULTIPLIER:D
  #2576 = NameAndType        #2577:#365   // RAIDBOSS_PDEF_MULTIPLIER:D
  #2577 = Utf8               RAIDBOSS_PDEF_MULTIPLIER
  #2578 = String             #2579        // RaidbossMDef
  #2579 = Utf8               RaidbossMDef
  #2580 = Fieldref           #27.#2581    // ext/mods/Config.RAIDBOSS_MDEF_MULTIPLIER:D
  #2581 = NameAndType        #2582:#365   // RAIDBOSS_MDEF_MULTIPLIER:D
  #2582 = Utf8               RAIDBOSS_MDEF_MULTIPLIER
  #2583 = String             #2584        // GrandbossHP
  #2584 = Utf8               GrandbossHP
  #2585 = Fieldref           #27.#2586    // ext/mods/Config.GRANDBOSS_HP_MULTIPLIER:D
  #2586 = NameAndType        #2587:#365   // GRANDBOSS_HP_MULTIPLIER:D
  #2587 = Utf8               GRANDBOSS_HP_MULTIPLIER
  #2588 = String             #2589        // GrandbossMP
  #2589 = Utf8               GrandbossMP
  #2590 = Fieldref           #27.#2591    // ext/mods/Config.GRANDBOSS_MP_MULTIPLIER:D
  #2591 = NameAndType        #2592:#365   // GRANDBOSS_MP_MULTIPLIER:D
  #2592 = Utf8               GRANDBOSS_MP_MULTIPLIER
  #2593 = String             #2594        // GrandbossPAtk
  #2594 = Utf8               GrandbossPAtk
  #2595 = Fieldref           #27.#2596    // ext/mods/Config.GRANDBOSS_PATK_MULTIPLIER:D
  #2596 = NameAndType        #2597:#365   // GRANDBOSS_PATK_MULTIPLIER:D
  #2597 = Utf8               GRANDBOSS_PATK_MULTIPLIER
  #2598 = String             #2599        // GrandbossMAtk
  #2599 = Utf8               GrandbossMAtk
  #2600 = Fieldref           #27.#2601    // ext/mods/Config.GRANDBOSS_MATK_MULTIPLIER:D
  #2601 = NameAndType        #2602:#365   // GRANDBOSS_MATK_MULTIPLIER:D
  #2602 = Utf8               GRANDBOSS_MATK_MULTIPLIER
  #2603 = String             #2604        // GrandbossPDef
  #2604 = Utf8               GrandbossPDef
  #2605 = Fieldref           #27.#2606    // ext/mods/Config.GRANDBOSS_PDEF_MULTIPLIER:D
  #2606 = NameAndType        #2607:#365   // GRANDBOSS_PDEF_MULTIPLIER:D
  #2607 = Utf8               GRANDBOSS_PDEF_MULTIPLIER
  #2608 = String             #2609        // GrandbossMDef
  #2609 = Utf8               GrandbossMDef
  #2610 = Fieldref           #27.#2611    // ext/mods/Config.GRANDBOSS_MDEF_MULTIPLIER:D
  #2611 = NameAndType        #2612:#365   // GRANDBOSS_MDEF_MULTIPLIER:D
  #2612 = Utf8               GRANDBOSS_MDEF_MULTIPLIER
  #2613 = String             #2614        // DisableRaidCurse
  #2614 = Utf8               DisableRaidCurse
  #2615 = Fieldref           #27.#2616    // ext/mods/Config.RAID_DISABLE_CURSE:Z
  #2616 = NameAndType        #2617:#57    // RAID_DISABLE_CURSE:Z
  #2617 = Utf8               RAID_DISABLE_CURSE
  #2618 = String             #2619        // AntharasWaitTime
  #2619 = Utf8               AntharasWaitTime
  #2620 = Integer            60000
  #2621 = Fieldref           #27.#2622    // ext/mods/Config.WAIT_TIME_ANTHARAS:I
  #2622 = NameAndType        #2623:#86    // WAIT_TIME_ANTHARAS:I
  #2623 = Utf8               WAIT_TIME_ANTHARAS
  #2624 = String             #2625        // AntharasNeedItem
  #2625 = Utf8               AntharasNeedItem
  #2626 = Fieldref           #27.#2627    // ext/mods/Config.NEED_ITEM_ANTHARAS:Z
  #2627 = NameAndType        #2628:#57    // NEED_ITEM_ANTHARAS:Z
  #2628 = Utf8               NEED_ITEM_ANTHARAS
  #2629 = String             #2630        // ValakasWaitTime
  #2630 = Utf8               ValakasWaitTime
  #2631 = Fieldref           #27.#2632    // ext/mods/Config.WAIT_TIME_VALAKAS:I
  #2632 = NameAndType        #2633:#86    // WAIT_TIME_VALAKAS:I
  #2633 = Utf8               WAIT_TIME_VALAKAS
  #2634 = String             #2635        // ValakasNeedItem
  #2635 = Utf8               ValakasNeedItem
  #2636 = Fieldref           #27.#2637    // ext/mods/Config.NEED_ITEM_VALAKAS:Z
  #2637 = NameAndType        #2638:#57    // NEED_ITEM_VALAKAS:Z
  #2638 = Utf8               NEED_ITEM_VALAKAS
  #2639 = String             #2640        // FrintezzaWaitTime
  #2640 = Utf8               FrintezzaWaitTime
  #2641 = Fieldref           #27.#2642    // ext/mods/Config.WAIT_TIME_FRINTEZZA:I
  #2642 = NameAndType        #2643:#86    // WAIT_TIME_FRINTEZZA:I
  #2643 = Utf8               WAIT_TIME_FRINTEZZA
  #2644 = String             #2645        // FrintezzaMinimumAllowedPlayers
  #2645 = Utf8               FrintezzaMinimumAllowedPlayers
  #2646 = Fieldref           #27.#2647    // ext/mods/Config.FRINTEZZA_MINIMUM_ALLOWED_PLAYERS:I
  #2647 = NameAndType        #2648:#86    // FRINTEZZA_MINIMUM_ALLOWED_PLAYERS:I
  #2648 = Utf8               FRINTEZZA_MINIMUM_ALLOWED_PLAYERS
  #2649 = String             #2650        // FrintezzaMaximumAllowedPlayers
  #2650 = Utf8               FrintezzaMaximumAllowedPlayers
  #2651 = Fieldref           #27.#2652    // ext/mods/Config.FRINTEZZA_MAXIMUM_ALLOWED_PLAYERS:I
  #2652 = NameAndType        #2653:#86    // FRINTEZZA_MAXIMUM_ALLOWED_PLAYERS:I
  #2653 = Utf8               FRINTEZZA_MAXIMUM_ALLOWED_PLAYERS
  #2654 = String             #2655        // FrintezzaMinimumParties
  #2655 = Utf8               FrintezzaMinimumParties
  #2656 = Fieldref           #27.#2657    // ext/mods/Config.FRINTEZZA_MINIMUM_PARTIES:I
  #2657 = NameAndType        #2658:#86    // FRINTEZZA_MINIMUM_PARTIES:I
  #2658 = Utf8               FRINTEZZA_MINIMUM_PARTIES
  #2659 = String             #2660        // FrintezzaMaximumParties
  #2660 = Utf8               FrintezzaMaximumParties
  #2661 = Fieldref           #27.#2662    // ext/mods/Config.FRINTEZZA_MAXIMUM_PARTIES:I
  #2662 = NameAndType        #2663:#86    // FRINTEZZA_MAXIMUM_PARTIES:I
  #2663 = Utf8               FRINTEZZA_MAXIMUM_PARTIES
  #2664 = String             #2665        // FrintezzaNeedItem
  #2665 = Utf8               FrintezzaNeedItem
  #2666 = Fieldref           #27.#2667    // ext/mods/Config.NEED_ITEM_FRINTEZZA:Z
  #2667 = NameAndType        #2668:#57    // NEED_ITEM_FRINTEZZA:Z
  #2668 = Utf8               NEED_ITEM_FRINTEZZA
  #2669 = String             #2670        // BaiumNeedItem
  #2670 = Utf8               BaiumNeedItem
  #2671 = Fieldref           #27.#2672    // ext/mods/Config.NEED_ITEM_BAIUM:Z
  #2672 = NameAndType        #2673:#57    // NEED_ITEM_BAIUM:Z
  #2673 = Utf8               NEED_ITEM_BAIUM
  #2674 = String             #2675        // ShilenNeedItem
  #2675 = Utf8               ShilenNeedItem
  #2676 = Fieldref           #27.#2677    // ext/mods/Config.NEED_ITEM_SHILEN:Z
  #2677 = NameAndType        #2678:#57    // NEED_ITEM_SHILEN:Z
  #2678 = Utf8               NEED_ITEM_SHILEN
  #2679 = String             #2680        // GuardAttackAggroMob
  #2680 = Utf8               GuardAttackAggroMob
  #2681 = Fieldref           #27.#2682    // ext/mods/Config.GUARD_ATTACK_AGGRO_MOB:Z
  #2682 = NameAndType        #2683:#57    // GUARD_ATTACK_AGGRO_MOB:Z
  #2683 = Utf8               GUARD_ATTACK_AGGRO_MOB
  #2684 = String             #2685        // RandomWalkRate
  #2685 = Utf8               RandomWalkRate
  #2686 = Fieldref           #27.#2687    // ext/mods/Config.RANDOM_WALK_RATE:I
  #2687 = NameAndType        #2688:#86    // RANDOM_WALK_RATE:I
  #2688 = Utf8               RANDOM_WALK_RATE
  #2689 = String             #2690        // MaxDriftRange
  #2690 = Utf8               MaxDriftRange
  #2691 = Fieldref           #27.#2692    // ext/mods/Config.MAX_DRIFT_RANGE:I
  #2692 = NameAndType        #2693:#86    // MAX_DRIFT_RANGE:I
  #2693 = Utf8               MAX_DRIFT_RANGE
  #2694 = String             #2695        // DebugMeleeAttack
  #2695 = Utf8               DebugMeleeAttack
  #2696 = Fieldref           #27.#2697    // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
  #2697 = NameAndType        #2698:#57    // DEBUG_MELEE_ATTACK:Z
  #2698 = Utf8               DEBUG_MELEE_ATTACK
  #2699 = String             #2700        // EnableGuardChat
  #2700 = Utf8               EnableGuardChat
  #2701 = Fieldref           #27.#2702    // ext/mods/Config.ENABLE_GUARD_CHAT:Z
  #2702 = NameAndType        #2703:#57    // ENABLE_GUARD_CHAT:Z
  #2703 = Utf8               ENABLE_GUARD_CHAT
  #2704 = String             #2705        // GuardChatRange
  #2705 = Utf8               GuardChatRange
  #2706 = Fieldref           #27.#2707    // ext/mods/Config.GUARD_CHAT_RANGE:I
  #2707 = NameAndType        #2708:#86    // GUARD_CHAT_RANGE:I
  #2708 = Utf8               GUARD_CHAT_RANGE
  #2709 = String             #2710        // GuardChattyChance
  #2710 = Utf8               GuardChattyChance
  #2711 = Fieldref           #27.#2712    // ext/mods/Config.GUARD_CHATTY_CHANCE:I
  #2712 = NameAndType        #2713:#86    // GUARD_CHATTY_CHANCE:I
  #2713 = Utf8               GUARD_CHATTY_CHANCE
  #2714 = String             #2715        // GuardSayNormalChance
  #2715 = Utf8               GuardSayNormalChance
  #2716 = Fieldref           #27.#2717    // ext/mods/Config.GUARD_SAY_NORMAL_CHANCE:I
  #2717 = NameAndType        #2718:#86    // GUARD_SAY_NORMAL_CHANCE:I
  #2718 = Utf8               GUARD_SAY_NORMAL_CHANCE
  #2719 = String             #2720        // GuardSayNormalPeriod
  #2720 = Utf8               GuardSayNormalPeriod
  #2721 = Fieldref           #27.#2722    // ext/mods/Config.GUARD_SAY_NORMAL_PERIOD:J
  #2722 = NameAndType        #2723:#120   // GUARD_SAY_NORMAL_PERIOD:J
  #2723 = Utf8               GUARD_SAY_NORMAL_PERIOD
  #2724 = String             #2725        // GuardSayAggroPeriod
  #2725 = Utf8               GuardSayAggroPeriod
  #2726 = Fieldref           #27.#2727    // ext/mods/Config.GUARD_SAY_AGGRO_PERIOD:J
  #2727 = NameAndType        #2728:#120   // GUARD_SAY_AGGRO_PERIOD:J
  #2728 = Utf8               GUARD_SAY_AGGRO_PERIOD
  #2729 = String             #2730        // NpcAnimation
  #2730 = Utf8               NpcAnimation
  #2731 = Fieldref           #27.#2732    // ext/mods/Config.NPC_ANIMATION:I
  #2732 = NameAndType        #2733:#86    // NPC_ANIMATION:I
  #2733 = Utf8               NPC_ANIMATION
  #2734 = String             #2735        // MonsterAnimation
  #2735 = Utf8               MonsterAnimation
  #2736 = Fieldref           #27.#2737    // ext/mods/Config.MONSTER_ANIMATION:I
  #2737 = NameAndType        #2738:#86    // MONSTER_ANIMATION:I
  #2738 = Utf8               MONSTER_ANIMATION
  #2739 = String             #2740        // DefaultSeeRange
  #2740 = Utf8               DefaultSeeRange
  #2741 = Fieldref           #27.#2742    // ext/mods/Config.DEFAULT_SEE_RANGE:I
  #2742 = NameAndType        #2743:#86    // DEFAULT_SEE_RANGE:I
  #2743 = Utf8               DEFAULT_SEE_RANGE
  #2744 = String             #2745        // SummonDriftRange
  #2745 = Utf8               SummonDriftRange
  #2746 = Fieldref           #27.#2747    // ext/mods/Config.SUMMON_DRIFT_RANGE:I
  #2747 = NameAndType        #2748:#86    // SUMMON_DRIFT_RANGE:I
  #2748 = Utf8               SUMMON_DRIFT_RANGE
  #2749 = String             #2750        // RaidBossList
  #2750 = Utf8               RaidBossList
  #2751 = Fieldref           #27.#2752    // ext/mods/Config.RAID_BOSS_LIST:[I
  #2752 = NameAndType        #2753:#388   // RAID_BOSS_LIST:[I
  #2753 = Utf8               RAID_BOSS_LIST
  #2754 = String             #2755        // EpicBossList
  #2755 = Utf8               EpicBossList
  #2756 = Fieldref           #27.#2757    // ext/mods/Config.EPIC_BOSS_LIST:[I
  #2757 = NameAndType        #2758:#388   // EPIC_BOSS_LIST:[I
  #2758 = Utf8               EPIC_BOSS_LIST
  #2759 = Fieldref           #27.#2760    // ext/mods/Config.PLAYERS_FILE:Ljava/lang/String;
  #2760 = NameAndType        #2761:#43    // PLAYERS_FILE:Ljava/lang/String;
  #2761 = Utf8               PLAYERS_FILE
  #2762 = String             #2763        // CancelLesserEffect
  #2763 = Utf8               CancelLesserEffect
  #2764 = Fieldref           #27.#2765    // ext/mods/Config.EFFECT_CANCELING:Z
  #2765 = NameAndType        #2766:#57    // EFFECT_CANCELING:Z
  #2766 = Utf8               EFFECT_CANCELING
  #2767 = String             #2768        // HpRegenMultiplier
  #2768 = Utf8               HpRegenMultiplier
  #2769 = Fieldref           #27.#2770    // ext/mods/Config.HP_REGEN_MULTIPLIER:D
  #2770 = NameAndType        #2771:#365   // HP_REGEN_MULTIPLIER:D
  #2771 = Utf8               HP_REGEN_MULTIPLIER
  #2772 = String             #2773        // MpRegenMultiplier
  #2773 = Utf8               MpRegenMultiplier
  #2774 = Fieldref           #27.#2775    // ext/mods/Config.MP_REGEN_MULTIPLIER:D
  #2775 = NameAndType        #2776:#365   // MP_REGEN_MULTIPLIER:D
  #2776 = Utf8               MP_REGEN_MULTIPLIER
  #2777 = String             #2778        // CpRegenMultiplier
  #2778 = Utf8               CpRegenMultiplier
  #2779 = Fieldref           #27.#2780    // ext/mods/Config.CP_REGEN_MULTIPLIER:D
  #2780 = NameAndType        #2781:#365   // CP_REGEN_MULTIPLIER:D
  #2781 = Utf8               CP_REGEN_MULTIPLIER
  #2782 = String             #2783        // PlayerSpawnProtection
  #2783 = Utf8               PlayerSpawnProtection
  #2784 = Fieldref           #27.#2785    // ext/mods/Config.PLAYER_SPAWN_PROTECTION:I
  #2785 = NameAndType        #2786:#86    // PLAYER_SPAWN_PROTECTION:I
  #2786 = Utf8               PLAYER_SPAWN_PROTECTION
  #2787 = String             #2788        // PlayerFakeDeathUpProtection
  #2788 = Utf8               PlayerFakeDeathUpProtection
  #2789 = Fieldref           #27.#2790    // ext/mods/Config.PLAYER_FAKEDEATH_UP_PROTECTION:I
  #2790 = NameAndType        #2791:#86    // PLAYER_FAKEDEATH_UP_PROTECTION:I
  #2791 = Utf8               PLAYER_FAKEDEATH_UP_PROTECTION
  #2792 = String             #2793        // RespawnRestoreHP
  #2793 = Utf8               RespawnRestoreHP
  #2794 = Double             0.7d
  #2796 = Fieldref           #27.#2797    // ext/mods/Config.RESPAWN_RESTORE_HP:D
  #2797 = NameAndType        #2798:#365   // RESPAWN_RESTORE_HP:D
  #2798 = Utf8               RESPAWN_RESTORE_HP
  #2799 = String             #2800        // MaxPvtStoreBuySlotsDwarf
  #2800 = Utf8               MaxPvtStoreBuySlotsDwarf
  #2801 = Fieldref           #27.#2802    // ext/mods/Config.MAX_PVTSTOREBUY_SLOTS_DWARF:I
  #2802 = NameAndType        #2803:#86    // MAX_PVTSTOREBUY_SLOTS_DWARF:I
  #2803 = Utf8               MAX_PVTSTOREBUY_SLOTS_DWARF
  #2804 = String             #2805        // MaxPvtStoreBuySlotsOther
  #2805 = Utf8               MaxPvtStoreBuySlotsOther
  #2806 = Fieldref           #27.#2807    // ext/mods/Config.MAX_PVTSTOREBUY_SLOTS_OTHER:I
  #2807 = NameAndType        #2808:#86    // MAX_PVTSTOREBUY_SLOTS_OTHER:I
  #2808 = Utf8               MAX_PVTSTOREBUY_SLOTS_OTHER
  #2809 = String             #2810        // MaxPvtStoreSellSlotsDwarf
  #2810 = Utf8               MaxPvtStoreSellSlotsDwarf
  #2811 = Fieldref           #27.#2812    // ext/mods/Config.MAX_PVTSTORESELL_SLOTS_DWARF:I
  #2812 = NameAndType        #2813:#86    // MAX_PVTSTORESELL_SLOTS_DWARF:I
  #2813 = Utf8               MAX_PVTSTORESELL_SLOTS_DWARF
  #2814 = String             #2815        // MaxPvtStoreSellSlotsOther
  #2815 = Utf8               MaxPvtStoreSellSlotsOther
  #2816 = Fieldref           #27.#2817    // ext/mods/Config.MAX_PVTSTORESELL_SLOTS_OTHER:I
  #2817 = NameAndType        #2818:#86    // MAX_PVTSTORESELL_SLOTS_OTHER:I
  #2818 = Utf8               MAX_PVTSTORESELL_SLOTS_OTHER
  #2819 = String             #2820        // UseDeepBlueDropRules
  #2820 = Utf8               UseDeepBlueDropRules
  #2821 = Fieldref           #27.#2822    // ext/mods/Config.DEEPBLUE_DROP_RULES:Z
  #2822 = NameAndType        #2823:#57    // DEEPBLUE_DROP_RULES:Z
  #2823 = Utf8               DEEPBLUE_DROP_RULES
  #2824 = String             #2825        // AllowDelevel
  #2825 = Utf8               AllowDelevel
  #2826 = Fieldref           #27.#2827    // ext/mods/Config.ALLOW_DELEVEL:Z
  #2827 = NameAndType        #2828:#57    // ALLOW_DELEVEL:Z
  #2828 = Utf8               ALLOW_DELEVEL
  #2829 = String             #2830        // DeathPenaltyChance
  #2830 = Utf8               DeathPenaltyChance
  #2831 = Fieldref           #27.#2832    // ext/mods/Config.DEATH_PENALTY_CHANCE:I
  #2832 = NameAndType        #2833:#86    // DEATH_PENALTY_CHANCE:I
  #2833 = Utf8               DEATH_PENALTY_CHANCE
  #2834 = String             #2835        // MaximumSlotsForNoDwarf
  #2835 = Utf8               MaximumSlotsForNoDwarf
  #2836 = Fieldref           #27.#2837    // ext/mods/Config.INVENTORY_MAXIMUM_NO_DWARF:I
  #2837 = NameAndType        #2838:#86    // INVENTORY_MAXIMUM_NO_DWARF:I
  #2838 = Utf8               INVENTORY_MAXIMUM_NO_DWARF
  #2839 = String             #2840        // MaximumSlotsForDwarf
  #2840 = Utf8               MaximumSlotsForDwarf
  #2841 = Fieldref           #27.#2842    // ext/mods/Config.INVENTORY_MAXIMUM_DWARF:I
  #2842 = NameAndType        #2843:#86    // INVENTORY_MAXIMUM_DWARF:I
  #2843 = Utf8               INVENTORY_MAXIMUM_DWARF
  #2844 = String             #2845        // MaximumSlotsForPet
  #2845 = Utf8               MaximumSlotsForPet
  #2846 = Fieldref           #27.#2847    // ext/mods/Config.INVENTORY_MAXIMUM_PET:I
  #2847 = NameAndType        #2848:#86    // INVENTORY_MAXIMUM_PET:I
  #2848 = Utf8               INVENTORY_MAXIMUM_PET
  #2849 = Fieldref           #27.#2850    // ext/mods/Config.MAX_ITEM_IN_PACKET:I
  #2850 = NameAndType        #2851:#86    // MAX_ITEM_IN_PACKET:I
  #2851 = Utf8               MAX_ITEM_IN_PACKET
  #2852 = String             #2853        // WeightLimit
  #2853 = Utf8               WeightLimit
  #2854 = Fieldref           #27.#2855    // ext/mods/Config.WEIGHT_LIMIT:D
  #2855 = NameAndType        #2856:#365   // WEIGHT_LIMIT:D
  #2856 = Utf8               WEIGHT_LIMIT
  #2857 = String             #2858        // MaximumWarehouseSlotsForNoDwarf
  #2858 = Utf8               MaximumWarehouseSlotsForNoDwarf
  #2859 = Fieldref           #27.#2860    // ext/mods/Config.WAREHOUSE_SLOTS_NO_DWARF:I
  #2860 = NameAndType        #2861:#86    // WAREHOUSE_SLOTS_NO_DWARF:I
  #2861 = Utf8               WAREHOUSE_SLOTS_NO_DWARF
  #2862 = String             #2863        // MaximumWarehouseSlotsForDwarf
  #2863 = Utf8               MaximumWarehouseSlotsForDwarf
  #2864 = Fieldref           #27.#2865    // ext/mods/Config.WAREHOUSE_SLOTS_DWARF:I
  #2865 = NameAndType        #2866:#86    // WAREHOUSE_SLOTS_DWARF:I
  #2866 = Utf8               WAREHOUSE_SLOTS_DWARF
  #2867 = String             #2868        // MaximumWarehouseSlotsForClan
  #2868 = Utf8               MaximumWarehouseSlotsForClan
  #2869 = Fieldref           #27.#2870    // ext/mods/Config.WAREHOUSE_SLOTS_CLAN:I
  #2870 = NameAndType        #2871:#86    // WAREHOUSE_SLOTS_CLAN:I
  #2871 = Utf8               WAREHOUSE_SLOTS_CLAN
  #2872 = String             #2873        // MaximumFreightSlots
  #2873 = Utf8               MaximumFreightSlots
  #2874 = Fieldref           #27.#2875    // ext/mods/Config.FREIGHT_SLOTS:I
  #2875 = NameAndType        #2876:#86    // FREIGHT_SLOTS:I
  #2876 = Utf8               FREIGHT_SLOTS
  #2877 = String             #2878        // RegionBasedFreight
  #2878 = Utf8               RegionBasedFreight
  #2879 = Fieldref           #27.#2880    // ext/mods/Config.REGION_BASED_FREIGHT:Z
  #2880 = NameAndType        #2881:#57    // REGION_BASED_FREIGHT:Z
  #2881 = Utf8               REGION_BASED_FREIGHT
  #2882 = String             #2883        // FreightPrice
  #2883 = Utf8               FreightPrice
  #2884 = Fieldref           #27.#2885    // ext/mods/Config.FREIGHT_PRICE:I
  #2885 = NameAndType        #2886:#86    // FREIGHT_PRICE:I
  #2886 = Utf8               FREIGHT_PRICE
  #2887 = String             #2888        // SubclassRequireMimir
  #2888 = Utf8               SubclassRequireMimir
  #2889 = Fieldref           #27.#2890    // ext/mods/Config.SUBCLASS_REQUIRE_MIMIR:Z
  #2890 = NameAndType        #2891:#57    // SUBCLASS_REQUIRE_MIMIR:Z
  #2891 = Utf8               SUBCLASS_REQUIRE_MIMIR
  #2892 = String             #2893        // SubclassRequireFate
  #2893 = Utf8               SubclassRequireFate
  #2894 = Fieldref           #27.#2895    // ext/mods/Config.SUBCLASS_REQUIRE_FATE:Z
  #2895 = NameAndType        #2896:#57    // SUBCLASS_REQUIRE_FATE:Z
  #2896 = Utf8               SUBCLASS_REQUIRE_FATE
  #2897 = String             #2898        // AugmentationNGSkillChance
  #2898 = Utf8               AugmentationNGSkillChance
  #2899 = Fieldref           #27.#2900    // ext/mods/Config.AUGMENTATION_NG_SKILL_CHANCE:I
  #2900 = NameAndType        #2901:#86    // AUGMENTATION_NG_SKILL_CHANCE:I
  #2901 = Utf8               AUGMENTATION_NG_SKILL_CHANCE
  #2902 = String             #2903        // AugmentationNGGlowChance
  #2903 = Utf8               AugmentationNGGlowChance
  #2904 = Fieldref           #27.#2905    // ext/mods/Config.AUGMENTATION_NG_GLOW_CHANCE:I
  #2905 = NameAndType        #2906:#86    // AUGMENTATION_NG_GLOW_CHANCE:I
  #2906 = Utf8               AUGMENTATION_NG_GLOW_CHANCE
  #2907 = String             #2908        // AugmentationMidSkillChance
  #2908 = Utf8               AugmentationMidSkillChance
  #2909 = Fieldref           #27.#2910    // ext/mods/Config.AUGMENTATION_MID_SKILL_CHANCE:I
  #2910 = NameAndType        #2911:#86    // AUGMENTATION_MID_SKILL_CHANCE:I
  #2911 = Utf8               AUGMENTATION_MID_SKILL_CHANCE
  #2912 = String             #2913        // AugmentationMidGlowChance
  #2913 = Utf8               AugmentationMidGlowChance
  #2914 = Fieldref           #27.#2915    // ext/mods/Config.AUGMENTATION_MID_GLOW_CHANCE:I
  #2915 = NameAndType        #2916:#86    // AUGMENTATION_MID_GLOW_CHANCE:I
  #2916 = Utf8               AUGMENTATION_MID_GLOW_CHANCE
  #2917 = String             #2918        // AugmentationHighSkillChance
  #2918 = Utf8               AugmentationHighSkillChance
  #2919 = Fieldref           #27.#2920    // ext/mods/Config.AUGMENTATION_HIGH_SKILL_CHANCE:I
  #2920 = NameAndType        #2921:#86    // AUGMENTATION_HIGH_SKILL_CHANCE:I
  #2921 = Utf8               AUGMENTATION_HIGH_SKILL_CHANCE
  #2922 = String             #2923        // AugmentationHighGlowChance
  #2923 = Utf8               AugmentationHighGlowChance
  #2924 = Fieldref           #27.#2925    // ext/mods/Config.AUGMENTATION_HIGH_GLOW_CHANCE:I
  #2925 = NameAndType        #2926:#86    // AUGMENTATION_HIGH_GLOW_CHANCE:I
  #2926 = Utf8               AUGMENTATION_HIGH_GLOW_CHANCE
  #2927 = String             #2928        // AugmentationTopSkillChance
  #2928 = Utf8               AugmentationTopSkillChance
  #2929 = Fieldref           #27.#2930    // ext/mods/Config.AUGMENTATION_TOP_SKILL_CHANCE:I
  #2930 = NameAndType        #2931:#86    // AUGMENTATION_TOP_SKILL_CHANCE:I
  #2931 = Utf8               AUGMENTATION_TOP_SKILL_CHANCE
  #2932 = String             #2933        // AugmentationTopGlowChance
  #2933 = Utf8               AugmentationTopGlowChance
  #2934 = Fieldref           #27.#2935    // ext/mods/Config.AUGMENTATION_TOP_GLOW_CHANCE:I
  #2935 = NameAndType        #2936:#86    // AUGMENTATION_TOP_GLOW_CHANCE:I
  #2936 = Utf8               AUGMENTATION_TOP_GLOW_CHANCE
  #2937 = String             #2938        // AugmentationBaseStatChance
  #2938 = Utf8               AugmentationBaseStatChance
  #2939 = Fieldref           #27.#2940    // ext/mods/Config.AUGMENTATION_BASESTAT_CHANCE:I
  #2940 = NameAndType        #2941:#86    // AUGMENTATION_BASESTAT_CHANCE:I
  #2941 = Utf8               AUGMENTATION_BASESTAT_CHANCE
  #2942 = String             #2943        // KarmaPlayerCanShop
  #2943 = Utf8               KarmaPlayerCanShop
  #2944 = Fieldref           #27.#2945    // ext/mods/Config.KARMA_PLAYER_CAN_SHOP:Z
  #2945 = NameAndType        #2946:#57    // KARMA_PLAYER_CAN_SHOP:Z
  #2946 = Utf8               KARMA_PLAYER_CAN_SHOP
  #2947 = String             #2948        // KarmaPlayerCanUseGK
  #2948 = Utf8               KarmaPlayerCanUseGK
  #2949 = Fieldref           #27.#2950    // ext/mods/Config.KARMA_PLAYER_CAN_USE_GK:Z
  #2950 = NameAndType        #2951:#57    // KARMA_PLAYER_CAN_USE_GK:Z
  #2951 = Utf8               KARMA_PLAYER_CAN_USE_GK
  #2952 = String             #2953        // KarmaPlayerCanTeleport
  #2953 = Utf8               KarmaPlayerCanTeleport
  #2954 = Fieldref           #27.#2955    // ext/mods/Config.KARMA_PLAYER_CAN_TELEPORT:Z
  #2955 = NameAndType        #2956:#57    // KARMA_PLAYER_CAN_TELEPORT:Z
  #2956 = Utf8               KARMA_PLAYER_CAN_TELEPORT
  #2957 = String             #2958        // KarmaPlayerCanTrade
  #2958 = Utf8               KarmaPlayerCanTrade
  #2959 = Fieldref           #27.#2960    // ext/mods/Config.KARMA_PLAYER_CAN_TRADE:Z
  #2960 = NameAndType        #2961:#57    // KARMA_PLAYER_CAN_TRADE:Z
  #2961 = Utf8               KARMA_PLAYER_CAN_TRADE
  #2962 = String             #2963        // KarmaPlayerCanUseWareHouse
  #2963 = Utf8               KarmaPlayerCanUseWareHouse
  #2964 = Fieldref           #27.#2965    // ext/mods/Config.KARMA_PLAYER_CAN_USE_WH:Z
  #2965 = NameAndType        #2966:#57    // KARMA_PLAYER_CAN_USE_WH:Z
  #2966 = Utf8               KARMA_PLAYER_CAN_USE_WH
  #2967 = String             #2968        // CanGMDropEquipment
  #2968 = Utf8               CanGMDropEquipment
  #2969 = Fieldref           #27.#2970    // ext/mods/Config.KARMA_DROP_GM:Z
  #2970 = NameAndType        #2971:#57    // KARMA_DROP_GM:Z
  #2971 = Utf8               KARMA_DROP_GM
  #2972 = String             #2973        // AwardPKKillPVPPoint
  #2973 = Utf8               AwardPKKillPVPPoint
  #2974 = Fieldref           #27.#2975    // ext/mods/Config.KARMA_AWARD_PK_KILL:Z
  #2975 = NameAndType        #2976:#57    // KARMA_AWARD_PK_KILL:Z
  #2976 = Utf8               KARMA_AWARD_PK_KILL
  #2977 = String             #2978        // MinimumPKRequiredToDrop
  #2978 = Utf8               MinimumPKRequiredToDrop
  #2979 = Fieldref           #27.#2980    // ext/mods/Config.KARMA_PK_LIMIT:I
  #2980 = NameAndType        #2981:#86    // KARMA_PK_LIMIT:I
  #2981 = Utf8               KARMA_PK_LIMIT
  #2982 = String             #2983        // ListOfPetItems
  #2983 = Utf8               ListOfPetItems
  #2984 = Fieldref           #27.#2985    // ext/mods/Config.KARMA_NONDROPPABLE_PET_ITEMS:[I
  #2985 = NameAndType        #2986:#388   // KARMA_NONDROPPABLE_PET_ITEMS:[I
  #2986 = Utf8               KARMA_NONDROPPABLE_PET_ITEMS
  #2987 = String             #2988        // ListOfNonDroppableItemsForPK
  #2988 = Utf8               ListOfNonDroppableItemsForPK
  #2989 = Fieldref           #27.#2990    // ext/mods/Config.KARMA_NONDROPPABLE_ITEMS:[I
  #2990 = NameAndType        #2991:#388   // KARMA_NONDROPPABLE_ITEMS:[I
  #2991 = Utf8               KARMA_NONDROPPABLE_ITEMS
  #2992 = String             #2993        // PvPVsNormalTime
  #2993 = Utf8               PvPVsNormalTime
  #2994 = Integer            40000
  #2995 = Fieldref           #27.#2996    // ext/mods/Config.PVP_NORMAL_TIME:I
  #2996 = NameAndType        #2997:#86    // PVP_NORMAL_TIME:I
  #2997 = Utf8               PVP_NORMAL_TIME
  #2998 = String             #2999        // PvPVsPvPTime
  #2999 = Utf8               PvPVsPvPTime
  #3000 = Fieldref           #27.#3001    // ext/mods/Config.PVP_PVP_TIME:I
  #3001 = NameAndType        #3002:#86    // PVP_PVP_TIME:I
  #3002 = Utf8               PVP_PVP_TIME
  #3003 = String             #3004        // PartyXpCutoffMethod
  #3004 = Utf8               PartyXpCutoffMethod
  #3005 = String             #3006        // level
  #3006 = Utf8               level
  #3007 = Fieldref           #27.#3008    // ext/mods/Config.PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
  #3008 = NameAndType        #3009:#43    // PARTY_XP_CUTOFF_METHOD:Ljava/lang/String;
  #3009 = Utf8               PARTY_XP_CUTOFF_METHOD
  #3010 = String             #3011        // PartyXpCutoffPercent
  #3011 = Utf8               PartyXpCutoffPercent
  #3012 = Double             3.0d
  #3014 = Fieldref           #27.#3015    // ext/mods/Config.PARTY_XP_CUTOFF_PERCENT:D
  #3015 = NameAndType        #3016:#365   // PARTY_XP_CUTOFF_PERCENT:D
  #3016 = Utf8               PARTY_XP_CUTOFF_PERCENT
  #3017 = String             #3018        // PartyXpCutoffLevel
  #3018 = Utf8               PartyXpCutoffLevel
  #3019 = Fieldref           #27.#3020    // ext/mods/Config.PARTY_XP_CUTOFF_LEVEL:I
  #3020 = NameAndType        #3021:#86    // PARTY_XP_CUTOFF_LEVEL:I
  #3021 = Utf8               PARTY_XP_CUTOFF_LEVEL
  #3022 = String             #3023        // PartyRange
  #3023 = Utf8               PartyRange
  #3024 = Fieldref           #27.#3025    // ext/mods/Config.PARTY_RANGE:I
  #3025 = NameAndType        #3026:#86    // PARTY_RANGE:I
  #3026 = Utf8               PARTY_RANGE
  #3027 = String             #3028        // DefaultAccessLevel
  #3028 = Utf8               DefaultAccessLevel
  #3029 = Fieldref           #27.#3030    // ext/mods/Config.DEFAULT_ACCESS_LEVEL:I
  #3030 = NameAndType        #3031:#86    // DEFAULT_ACCESS_LEVEL:I
  #3031 = Utf8               DEFAULT_ACCESS_LEVEL
  #3032 = String             #3033        // GMHeroAura
  #3033 = Utf8               GMHeroAura
  #3034 = Fieldref           #27.#3035    // ext/mods/Config.GM_HERO_AURA:Z
  #3035 = NameAndType        #3036:#57    // GM_HERO_AURA:Z
  #3036 = Utf8               GM_HERO_AURA
  #3037 = String             #3038        // GMStartupInvulnerable
  #3038 = Utf8               GMStartupInvulnerable
  #3039 = Fieldref           #27.#3040    // ext/mods/Config.GM_STARTUP_INVULNERABLE:Z
  #3040 = NameAndType        #3041:#57    // GM_STARTUP_INVULNERABLE:Z
  #3041 = Utf8               GM_STARTUP_INVULNERABLE
  #3042 = String             #3043        // GMStartupInvisible
  #3043 = Utf8               GMStartupInvisible
  #3044 = Fieldref           #27.#3045    // ext/mods/Config.GM_STARTUP_INVISIBLE:Z
  #3045 = NameAndType        #3046:#57    // GM_STARTUP_INVISIBLE:Z
  #3046 = Utf8               GM_STARTUP_INVISIBLE
  #3047 = String             #3048        // GMStartupBlockAll
  #3048 = Utf8               GMStartupBlockAll
  #3049 = Fieldref           #27.#3050    // ext/mods/Config.GM_STARTUP_BLOCK_ALL:Z
  #3050 = NameAndType        #3051:#57    // GM_STARTUP_BLOCK_ALL:Z
  #3051 = Utf8               GM_STARTUP_BLOCK_ALL
  #3052 = String             #3053        // GMStartupAutoList
  #3053 = Utf8               GMStartupAutoList
  #3054 = Fieldref           #27.#3055    // ext/mods/Config.GM_STARTUP_AUTO_LIST:Z
  #3055 = NameAndType        #3056:#57    // GM_STARTUP_AUTO_LIST:Z
  #3056 = Utf8               GM_STARTUP_AUTO_LIST
  #3057 = String             #3058        // PetitioningAllowed
  #3058 = Utf8               PetitioningAllowed
  #3059 = Fieldref           #27.#3060    // ext/mods/Config.PETITIONING_ALLOWED:Z
  #3060 = NameAndType        #3061:#57    // PETITIONING_ALLOWED:Z
  #3061 = Utf8               PETITIONING_ALLOWED
  #3062 = String             #3063        // MaxPetitionsPerPlayer
  #3063 = Utf8               MaxPetitionsPerPlayer
  #3064 = Fieldref           #27.#3065    // ext/mods/Config.MAX_PETITIONS_PER_PLAYER:I
  #3065 = NameAndType        #3066:#86    // MAX_PETITIONS_PER_PLAYER:I
  #3066 = Utf8               MAX_PETITIONS_PER_PLAYER
  #3067 = String             #3068        // MaxPetitionsPending
  #3068 = Utf8               MaxPetitionsPending
  #3069 = Fieldref           #27.#3070    // ext/mods/Config.MAX_PETITIONS_PENDING:I
  #3070 = NameAndType        #3071:#86    // MAX_PETITIONS_PENDING:I
  #3071 = Utf8               MAX_PETITIONS_PENDING
  #3072 = String             #3073        // CraftingEnabled
  #3073 = Utf8               CraftingEnabled
  #3074 = Fieldref           #27.#3075    // ext/mods/Config.IS_CRAFTING_ENABLED:Z
  #3075 = NameAndType        #3076:#57    // IS_CRAFTING_ENABLED:Z
  #3076 = Utf8               IS_CRAFTING_ENABLED
  #3077 = String             #3078        // DwarfRecipeLimit
  #3078 = Utf8               DwarfRecipeLimit
  #3079 = Fieldref           #27.#3080    // ext/mods/Config.DWARF_RECIPE_LIMIT:I
  #3080 = NameAndType        #3081:#86    // DWARF_RECIPE_LIMIT:I
  #3081 = Utf8               DWARF_RECIPE_LIMIT
  #3082 = String             #3083        // CommonRecipeLimit
  #3083 = Utf8               CommonRecipeLimit
  #3084 = Fieldref           #27.#3085    // ext/mods/Config.COMMON_RECIPE_LIMIT:I
  #3085 = NameAndType        #3086:#86    // COMMON_RECIPE_LIMIT:I
  #3086 = Utf8               COMMON_RECIPE_LIMIT
  #3087 = String             #3088        // AutoLearnSkills
  #3088 = Utf8               AutoLearnSkills
  #3089 = Fieldref           #27.#3090    // ext/mods/Config.AUTO_LEARN_SKILLS:Z
  #3090 = NameAndType        #3091:#57    // AUTO_LEARN_SKILLS:Z
  #3091 = Utf8               AUTO_LEARN_SKILLS
  #3092 = String             #3093        // LvlAutoLearnSkills
  #3093 = Utf8               LvlAutoLearnSkills
  #3094 = Fieldref           #27.#3095    // ext/mods/Config.LVL_AUTO_LEARN_SKILLS:I
  #3095 = NameAndType        #3096:#86    // LVL_AUTO_LEARN_SKILLS:I
  #3096 = Utf8               LVL_AUTO_LEARN_SKILLS
  #3097 = String             #3098        // MagicFailures
  #3098 = Utf8               MagicFailures
  #3099 = Fieldref           #27.#3100    // ext/mods/Config.MAGIC_FAILURES:Z
  #3100 = NameAndType        #3101:#57    // MAGIC_FAILURES:Z
  #3101 = Utf8               MAGIC_FAILURES
  #3102 = String             #3103        // PerfectShieldBlockRate
  #3103 = Utf8               PerfectShieldBlockRate
  #3104 = Fieldref           #27.#3105    // ext/mods/Config.PERFECT_SHIELD_BLOCK_RATE:I
  #3105 = NameAndType        #3106:#86    // PERFECT_SHIELD_BLOCK_RATE:I
  #3106 = Utf8               PERFECT_SHIELD_BLOCK_RATE
  #3107 = String             #3108        // LifeCrystalNeeded
  #3108 = Utf8               LifeCrystalNeeded
  #3109 = Fieldref           #27.#3110    // ext/mods/Config.LIFE_CRYSTAL_NEEDED:Z
  #3110 = NameAndType        #3111:#57    // LIFE_CRYSTAL_NEEDED:Z
  #3111 = Utf8               LIFE_CRYSTAL_NEEDED
  #3112 = String             #3113        // SpBookNeeded
  #3113 = Utf8               SpBookNeeded
  #3114 = Fieldref           #27.#3115    // ext/mods/Config.SP_BOOK_NEEDED:Z
  #3115 = NameAndType        #3116:#57    // SP_BOOK_NEEDED:Z
  #3116 = Utf8               SP_BOOK_NEEDED
  #3117 = String             #3118        // EnchantSkillSpBookNeeded
  #3118 = Utf8               EnchantSkillSpBookNeeded
  #3119 = Fieldref           #27.#3120    // ext/mods/Config.ES_SP_BOOK_NEEDED:Z
  #3120 = NameAndType        #3121:#57    // ES_SP_BOOK_NEEDED:Z
  #3121 = Utf8               ES_SP_BOOK_NEEDED
  #3122 = String             #3123        // DivineInspirationSpBookNeeded
  #3123 = Utf8               DivineInspirationSpBookNeeded
  #3124 = Fieldref           #27.#3125    // ext/mods/Config.DIVINE_SP_BOOK_NEEDED:Z
  #3125 = NameAndType        #3126:#57    // DIVINE_SP_BOOK_NEEDED:Z
  #3126 = Utf8               DIVINE_SP_BOOK_NEEDED
  #3127 = String             #3128        // SubClassWithoutQuests
  #3128 = Utf8               SubClassWithoutQuests
  #3129 = Fieldref           #27.#3130    // ext/mods/Config.SUBCLASS_WITHOUT_QUESTS:Z
  #3130 = NameAndType        #3131:#57    // SUBCLASS_WITHOUT_QUESTS:Z
  #3131 = Utf8               SUBCLASS_WITHOUT_QUESTS
  #3132 = String             #3133        // MaxBuffsAmount
  #3133 = Utf8               MaxBuffsAmount
  #3134 = Fieldref           #27.#3135    // ext/mods/Config.MAX_BUFFS_AMOUNT:I
  #3135 = NameAndType        #3136:#86    // MAX_BUFFS_AMOUNT:I
  #3136 = Utf8               MAX_BUFFS_AMOUNT
  #3137 = String             #3138        // StoreSkillCooltime
  #3138 = Utf8               StoreSkillCooltime
  #3139 = Fieldref           #27.#3140    // ext/mods/Config.STORE_SKILL_COOLTIME:Z
  #3140 = NameAndType        #3141:#57    // STORE_SKILL_COOLTIME:Z
  #3141 = Utf8               STORE_SKILL_COOLTIME
  #3142 = String             #3143        // ExpertisePenalty
  #3143 = Utf8               ExpertisePenalty
  #3144 = Fieldref           #27.#3145    // ext/mods/Config.EXPERTISE_PENALTY:Z
  #3145 = NameAndType        #3146:#57    // EXPERTISE_PENALTY:Z
  #3146 = Utf8               EXPERTISE_PENALTY
  #3147 = Fieldref           #27.#3148    // ext/mods/Config.SIEGE_FILE:Ljava/lang/String;
  #3148 = NameAndType        #3149:#43    // SIEGE_FILE:Ljava/lang/String;
  #3149 = Utf8               SIEGE_FILE
  #3150 = String             #3151        // SiegeLength
  #3151 = Utf8               SiegeLength
  #3152 = Fieldref           #27.#3153    // ext/mods/Config.SIEGE_LENGTH:I
  #3153 = NameAndType        #3154:#86    // SIEGE_LENGTH:I
  #3154 = Utf8               SIEGE_LENGTH
  #3155 = String             #3156        // SiegeClanMinLevel
  #3156 = Utf8               SiegeClanMinLevel
  #3157 = Fieldref           #27.#3158    // ext/mods/Config.MINIMUM_CLAN_LEVEL:I
  #3158 = NameAndType        #3159:#86    // MINIMUM_CLAN_LEVEL:I
  #3159 = Utf8               MINIMUM_CLAN_LEVEL
  #3160 = String             #3161        // AttackerMaxClans
  #3161 = Utf8               AttackerMaxClans
  #3162 = Fieldref           #27.#3163    // ext/mods/Config.MAX_ATTACKERS_NUMBER:I
  #3163 = NameAndType        #3164:#86    // MAX_ATTACKERS_NUMBER:I
  #3164 = Utf8               MAX_ATTACKERS_NUMBER
  #3165 = String             #3166        // DefenderMaxClans
  #3166 = Utf8               DefenderMaxClans
  #3167 = Fieldref           #27.#3168    // ext/mods/Config.MAX_DEFENDERS_NUMBER:I
  #3168 = NameAndType        #3169:#86    // MAX_DEFENDERS_NUMBER:I
  #3169 = Utf8               MAX_DEFENDERS_NUMBER
  #3170 = String             #3171        // ChSiegeClanMinLevel
  #3171 = Utf8               ChSiegeClanMinLevel
  #3172 = Fieldref           #27.#3173    // ext/mods/Config.CH_MINIMUM_CLAN_LEVEL:I
  #3173 = NameAndType        #3174:#86    // CH_MINIMUM_CLAN_LEVEL:I
  #3174 = Utf8               CH_MINIMUM_CLAN_LEVEL
  #3175 = String             #3176        // ChAttackerMaxClans
  #3176 = Utf8               ChAttackerMaxClans
  #3177 = Fieldref           #27.#3178    // ext/mods/Config.CH_MAX_ATTACKERS_NUMBER:I
  #3178 = NameAndType        #3179:#86    // CH_MAX_ATTACKERS_NUMBER:I
  #3179 = Utf8               CH_MAX_ATTACKERS_NUMBER
  #3180 = String             #3181        // SiegeInfo
  #3181 = Utf8               SiegeInfo
  #3182 = Fieldref           #27.#3183    // ext/mods/Config.SIEGE_INFO:Z
  #3183 = NameAndType        #3184:#57    // SIEGE_INFO:Z
  #3184 = Utf8               SIEGE_INFO
  #3185 = Fieldref           #27.#3186    // ext/mods/Config.PROTECTION_FILE:Ljava/lang/String;
  #3186 = NameAndType        #3187:#43    // PROTECTION_FILE:Ljava/lang/String;
  #3187 = Utf8               PROTECTION_FILE
  #3188 = String             #3189        // AllowGuardSystem
  #3189 = Utf8               AllowGuardSystem
  #3190 = Fieldref           #27.#3191    // ext/mods/Config.ALLOW_GUARD_SYSTEM:Z
  #3191 = NameAndType        #3192:#57    // ALLOW_GUARD_SYSTEM:Z
  #3192 = Utf8               ALLOW_GUARD_SYSTEM
  #3193 = String             #3194        // AllowedWindowsCount
  #3194 = Utf8               AllowedWindowsCount
  #3195 = Fieldref           #27.#3196    // ext/mods/Config.PROTECT_WINDOWS_COUNT:I
  #3196 = NameAndType        #3197:#86    // PROTECT_WINDOWS_COUNT:I
  #3197 = Utf8               PROTECT_WINDOWS_COUNT
  #3198 = String             #3199        // UseClientHWID
  #3199 = Utf8               UseClientHWID
  #3200 = Fieldref           #27.#3201    // ext/mods/Config.GET_CLIENT_HWID:I
  #3201 = NameAndType        #3202:#86    // GET_CLIENT_HWID:I
  #3202 = Utf8               GET_CLIENT_HWID
  #3203 = String             #3204        // EnableConsoleLog
  #3204 = Utf8               EnableConsoleLog
  #3205 = Fieldref           #27.#3206    // ext/mods/Config.ENABLE_CONSOLE_LOG:Z
  #3206 = NameAndType        #3207:#57    // ENABLE_CONSOLE_LOG:Z
  #3207 = Utf8               ENABLE_CONSOLE_LOG
  #3208 = String             #3209        // KickWithEmptyHWID
  #3209 = Utf8               KickWithEmptyHWID
  #3210 = Fieldref           #27.#3211    // ext/mods/Config.PROTECT_KICK_WITH_EMPTY_HWID:Z
  #3211 = NameAndType        #3212:#57    // PROTECT_KICK_WITH_EMPTY_HWID:Z
  #3212 = Utf8               PROTECT_KICK_WITH_EMPTY_HWID
  #3213 = String             #3214        // KickWithLastErrorHWID
  #3214 = Utf8               KickWithLastErrorHWID
  #3215 = Fieldref           #27.#3216    // ext/mods/Config.PROTECT_KICK_WITH_LASTERROR_HWID:Z
  #3216 = NameAndType        #3217:#57    // PROTECT_KICK_WITH_LASTERROR_HWID:Z
  #3217 = Utf8               PROTECT_KICK_WITH_LASTERROR_HWID
  #3218 = String             #3219        // GOGX2_RB(]Slnjt15~EgyqTv%[$YR]!1E~ayK?$9[R%%m4{zoMF$D?f:zvS2q&>~
  #3219 = Utf8               GOGX2_RB(]Slnjt15~EgyqTv%[$YR]!1E~ayK?$9[R%%m4{zoMF$D?f:zvS2q&>~
  #3220 = String             #3221        // b*qR43<9J1pD>Q4Uns6FsKao~VbU0H]y`A0ytTveiWn)SuSYsM?m*eblL!pwza!t
  #3221 = Utf8               b*qR43<9J1pD>Q4Uns6FsKao~VbU0H]y`A0ytTveiWn)SuSYsM?m*eblL!pwza!t
  #3222 = Methodref          #215.#3223   // java/lang/String.getBytes:()[B
  #3223 = NameAndType        #3224:#2121  // getBytes:()[B
  #3224 = Utf8               getBytes
  #3225 = Methodref          #2099.#3226  // java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #3226 = NameAndType        #3227:#3228  // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
  #3227 = Utf8               arraycopy
  #3228 = Utf8               (Ljava/lang/Object;ILjava/lang/Object;II)V
  #3229 = Methodref          #3230.#3231  // ext/mods/protection/hwid/crypt/FirstKey.expandKey:([BI)[B
  #3230 = Class              #3232        // ext/mods/protection/hwid/crypt/FirstKey
  #3231 = NameAndType        #3233:#3234  // expandKey:([BI)[B
  #3232 = Utf8               ext/mods/protection/hwid/crypt/FirstKey
  #3233 = Utf8               expandKey
  #3234 = Utf8               ([BI)[B
  #3235 = Fieldref           #27.#3236    // ext/mods/Config.GUARD_CLIENT_CRYPT_KEY:[B
  #3236 = NameAndType        #3237:#2125  // GUARD_CLIENT_CRYPT_KEY:[B
  #3237 = Utf8               GUARD_CLIENT_CRYPT_KEY
  #3238 = Fieldref           #27.#3239    // ext/mods/Config.GUARD_CLIENT_CRYPT:[B
  #3239 = NameAndType        #3240:#2125  // GUARD_CLIENT_CRYPT:[B
  #3240 = Utf8               GUARD_CLIENT_CRYPT
  #3241 = Fieldref           #27.#3242    // ext/mods/Config.GUARD_SERVER_CRYPT_KEY:[B
  #3242 = NameAndType        #3243:#2125  // GUARD_SERVER_CRYPT_KEY:[B
  #3243 = Utf8               GUARD_SERVER_CRYPT_KEY
  #3244 = Fieldref           #27.#3245    // ext/mods/Config.GUARD_SERVER_CRYPT:[B
  #3245 = NameAndType        #3246:#2125  // GUARD_SERVER_CRYPT:[B
  #3246 = Utf8               GUARD_SERVER_CRYPT
  #3247 = Fieldref           #27.#3248    // ext/mods/Config.SERVER_FILE:Ljava/lang/String;
  #3248 = NameAndType        #3249:#43    // SERVER_FILE:Ljava/lang/String;
  #3249 = Utf8               SERVER_FILE
  #3250 = String             #3251        // Hostname
  #3251 = Utf8               Hostname
  #3252 = String             #3253        // *
  #3253 = Utf8               *
  #3254 = Fieldref           #27.#3255    // ext/mods/Config.HOSTNAME:Ljava/lang/String;
  #3255 = NameAndType        #3256:#43    // HOSTNAME:Ljava/lang/String;
  #3256 = Utf8               HOSTNAME
  #3257 = String             #3258        // GameserverHostname
  #3258 = Utf8               GameserverHostname
  #3259 = Fieldref           #27.#3260    // ext/mods/Config.GAMESERVER_HOSTNAME:Ljava/lang/String;
  #3260 = NameAndType        #3261:#43    // GAMESERVER_HOSTNAME:Ljava/lang/String;
  #3261 = Utf8               GAMESERVER_HOSTNAME
  #3262 = String             #3263        // GameserverPort
  #3263 = Utf8               GameserverPort
  #3264 = Fieldref           #27.#3265    // ext/mods/Config.GAMESERVER_PORT:I
  #3265 = NameAndType        #3266:#86    // GAMESERVER_PORT:I
  #3266 = Utf8               GAMESERVER_PORT
  #3267 = String             #3268        // LoginHost
  #3268 = Utf8               LoginHost
  #3269 = String             #3270        // 127.0.0.1
  #3270 = Utf8               127.0.0.1
  #3271 = Fieldref           #27.#3272    // ext/mods/Config.GAMESERVER_LOGIN_HOSTNAME:Ljava/lang/String;
  #3272 = NameAndType        #3273:#43    // GAMESERVER_LOGIN_HOSTNAME:Ljava/lang/String;
  #3273 = Utf8               GAMESERVER_LOGIN_HOSTNAME
  #3274 = String             #3275        // LoginPort
  #3275 = Utf8               LoginPort
  #3276 = Fieldref           #27.#3277    // ext/mods/Config.GAMESERVER_LOGIN_PORT:I
  #3277 = NameAndType        #3278:#86    // GAMESERVER_LOGIN_PORT:I
  #3278 = Utf8               GAMESERVER_LOGIN_PORT
  #3279 = String             #3280        // RequestServerID
  #3280 = Utf8               RequestServerID
  #3281 = Fieldref           #27.#3282    // ext/mods/Config.REQUEST_ID:I
  #3282 = NameAndType        #3283:#86    // REQUEST_ID:I
  #3283 = Utf8               REQUEST_ID
  #3284 = String             #3285        // AcceptAlternateID
  #3285 = Utf8               AcceptAlternateID
  #3286 = Fieldref           #27.#3287    // ext/mods/Config.ACCEPT_ALTERNATE_ID:Z
  #3287 = NameAndType        #3288:#57    // ACCEPT_ALTERNATE_ID:Z
  #3288 = Utf8               ACCEPT_ALTERNATE_ID
  #3289 = String             #3290        // UseBlowfishCipher
  #3290 = Utf8               UseBlowfishCipher
  #3291 = Fieldref           #27.#3292    // ext/mods/Config.USE_BLOWFISH_CIPHER:Z
  #3292 = NameAndType        #3293:#57    // USE_BLOWFISH_CIPHER:Z
  #3293 = Utf8               USE_BLOWFISH_CIPHER
  #3294 = Methodref          #27.#3295    // ext/mods/Config.loadDatabaseProperties:(Lext/mods/commons/config/ExProperties;)V
  #3295 = NameAndType        #3296:#3297  // loadDatabaseProperties:(Lext/mods/commons/config/ExProperties;)V
  #3296 = Utf8               loadDatabaseProperties
  #3297 = Utf8               (Lext/mods/commons/config/ExProperties;)V
  #3298 = String             #3299        // CnameTemplate
  #3299 = Utf8               CnameTemplate
  #3300 = String             #3301        // .*
  #3301 = Utf8               .*
  #3302 = Fieldref           #27.#3303    // ext/mods/Config.CNAME_TEMPLATE:Ljava/lang/String;
  #3303 = NameAndType        #3304:#43    // CNAME_TEMPLATE:Ljava/lang/String;
  #3304 = Utf8               CNAME_TEMPLATE
  #3305 = String             #3306        // DonateCnameTemplate
  #3306 = Utf8               DonateCnameTemplate
  #3307 = Fieldref           #27.#3308    // ext/mods/Config.DONATE_CNAME_TEMPLATE:Ljava/lang/String;
  #3308 = NameAndType        #3309:#43    // DONATE_CNAME_TEMPLATE:Ljava/lang/String;
  #3309 = Utf8               DONATE_CNAME_TEMPLATE
  #3310 = String             #3311        // TitleTemplate
  #3311 = Utf8               TitleTemplate
  #3312 = Fieldref           #27.#3313    // ext/mods/Config.TITLE_TEMPLATE:Ljava/lang/String;
  #3313 = NameAndType        #3314:#43    // TITLE_TEMPLATE:Ljava/lang/String;
  #3314 = Utf8               TITLE_TEMPLATE
  #3315 = String             #3316        // PetNameTemplate
  #3316 = Utf8               PetNameTemplate
  #3317 = Fieldref           #27.#3318    // ext/mods/Config.PET_NAME_TEMPLATE:Ljava/lang/String;
  #3318 = NameAndType        #3319:#43    // PET_NAME_TEMPLATE:Ljava/lang/String;
  #3319 = Utf8               PET_NAME_TEMPLATE
  #3320 = String             #3321        // ClanAllyNameTemplate
  #3321 = Utf8               ClanAllyNameTemplate
  #3322 = Fieldref           #27.#3323    // ext/mods/Config.CLAN_ALLY_NAME_TEMPLATE:Ljava/lang/String;
  #3323 = NameAndType        #3324:#43    // CLAN_ALLY_NAME_TEMPLATE:Ljava/lang/String;
  #3324 = Utf8               CLAN_ALLY_NAME_TEMPLATE
  #3325 = String             #3326        // ServerListBrackets
  #3326 = Utf8               ServerListBrackets
  #3327 = Fieldref           #27.#3328    // ext/mods/Config.SERVER_LIST_BRACKET:Z
  #3328 = NameAndType        #3329:#57    // SERVER_LIST_BRACKET:Z
  #3329 = Utf8               SERVER_LIST_BRACKET
  #3330 = String             #3331        // ServerListClock
  #3331 = Utf8               ServerListClock
  #3332 = Fieldref           #27.#3333    // ext/mods/Config.SERVER_LIST_CLOCK:Z
  #3333 = NameAndType        #3334:#57    // SERVER_LIST_CLOCK:Z
  #3334 = Utf8               SERVER_LIST_CLOCK
  #3335 = String             #3336        // ServerGMOnly
  #3336 = Utf8               ServerGMOnly
  #3337 = Fieldref           #27.#3338    // ext/mods/Config.SERVER_GMONLY:Z
  #3338 = NameAndType        #3339:#57    // SERVER_GMONLY:Z
  #3339 = Utf8               SERVER_GMONLY
  #3340 = String             #3341        // ServerListAgeLimit
  #3341 = Utf8               ServerListAgeLimit
  #3342 = Fieldref           #27.#3343    // ext/mods/Config.SERVER_LIST_AGE:I
  #3343 = NameAndType        #3344:#86    // SERVER_LIST_AGE:I
  #3344 = Utf8               SERVER_LIST_AGE
  #3345 = String             #3346        // TestServer
  #3346 = Utf8               TestServer
  #3347 = Fieldref           #27.#3348    // ext/mods/Config.SERVER_LIST_TESTSERVER:Z
  #3348 = NameAndType        #3349:#57    // SERVER_LIST_TESTSERVER:Z
  #3349 = Utf8               SERVER_LIST_TESTSERVER
  #3350 = String             #3351        // PvpServer
  #3351 = Utf8               PvpServer
  #3352 = Fieldref           #27.#3353    // ext/mods/Config.SERVER_LIST_PVPSERVER:Z
  #3353 = NameAndType        #3354:#57    // SERVER_LIST_PVPSERVER:Z
  #3354 = Utf8               SERVER_LIST_PVPSERVER
  #3355 = String             #3356        // DeleteCharAfterDays
  #3356 = Utf8               DeleteCharAfterDays
  #3357 = Fieldref           #27.#3358    // ext/mods/Config.DELETE_DAYS:I
  #3358 = NameAndType        #3359:#86    // DELETE_DAYS:I
  #3359 = Utf8               DELETE_DAYS
  #3360 = String             #3361        // MaximumOnlineUsers
  #3361 = Utf8               MaximumOnlineUsers
  #3362 = Fieldref           #27.#3363    // ext/mods/Config.MAXIMUM_ONLINE_USERS:I
  #3363 = NameAndType        #3364:#86    // MAXIMUM_ONLINE_USERS:I
  #3364 = Utf8               MAXIMUM_ONLINE_USERS
  #3365 = String             #3366        // AutoLoot
  #3366 = Utf8               AutoLoot
  #3367 = Fieldref           #27.#3368    // ext/mods/Config.AUTO_LOOT:Z
  #3368 = NameAndType        #3369:#57    // AUTO_LOOT:Z
  #3369 = Utf8               AUTO_LOOT
  #3370 = String             #3371        // AutoLootHerbs
  #3371 = Utf8               AutoLootHerbs
  #3372 = Fieldref           #27.#3373    // ext/mods/Config.AUTO_LOOT_HERBS:Z
  #3373 = NameAndType        #3374:#57    // AUTO_LOOT_HERBS:Z
  #3374 = Utf8               AUTO_LOOT_HERBS
  #3375 = String             #3376        // AutoLootRaid
  #3376 = Utf8               AutoLootRaid
  #3377 = Fieldref           #27.#3378    // ext/mods/Config.AUTO_LOOT_RAID:Z
  #3378 = NameAndType        #3379:#57    // AUTO_LOOT_RAID:Z
  #3379 = Utf8               AUTO_LOOT_RAID
  #3380 = String             #3381        // AllowDiscardItem
  #3381 = Utf8               AllowDiscardItem
  #3382 = Fieldref           #27.#3383    // ext/mods/Config.ALLOW_DISCARDITEM:Z
  #3383 = NameAndType        #3384:#57    // ALLOW_DISCARDITEM:Z
  #3384 = Utf8               ALLOW_DISCARDITEM
  #3385 = String             #3386        // MultipleItemDrop
  #3386 = Utf8               MultipleItemDrop
  #3387 = Fieldref           #27.#3388    // ext/mods/Config.MULTIPLE_ITEM_DROP:Z
  #3388 = NameAndType        #3389:#57    // MULTIPLE_ITEM_DROP:Z
  #3389 = Utf8               MULTIPLE_ITEM_DROP
  #3390 = String             #3391        // AutoDestroyHerbTime
  #3391 = Utf8               AutoDestroyHerbTime
  #3392 = Fieldref           #27.#3393    // ext/mods/Config.HERB_AUTO_DESTROY_TIME:I
  #3393 = NameAndType        #3394:#86    // HERB_AUTO_DESTROY_TIME:I
  #3394 = Utf8               HERB_AUTO_DESTROY_TIME
  #3395 = String             #3396        // AutoDestroyItemTime
  #3396 = Utf8               AutoDestroyItemTime
  #3397 = Fieldref           #27.#3398    // ext/mods/Config.ITEM_AUTO_DESTROY_TIME:I
  #3398 = NameAndType        #3399:#86    // ITEM_AUTO_DESTROY_TIME:I
  #3399 = Utf8               ITEM_AUTO_DESTROY_TIME
  #3400 = String             #3401        // AutoDestroyEquipableItemTime
  #3401 = Utf8               AutoDestroyEquipableItemTime
  #3402 = Fieldref           #27.#3403    // ext/mods/Config.EQUIPABLE_ITEM_AUTO_DESTROY_TIME:I
  #3403 = NameAndType        #3404:#86    // EQUIPABLE_ITEM_AUTO_DESTROY_TIME:I
  #3404 = Utf8               EQUIPABLE_ITEM_AUTO_DESTROY_TIME
  #3405 = Fieldref           #27.#3406    // ext/mods/Config.SPECIAL_ITEM_DESTROY_TIME:Ljava/util/Map;
  #3406 = NameAndType        #3407:#1247  // SPECIAL_ITEM_DESTROY_TIME:Ljava/util/Map;
  #3407 = Utf8               SPECIAL_ITEM_DESTROY_TIME
  #3408 = String             #3409        // AutoDestroySpecialItemTime
  #3409 = Utf8               AutoDestroySpecialItemTime
  #3410 = String             #3411        // -
  #3411 = Utf8               -
  #3412 = String             #3413        // PlayerDroppedItemMultiplier
  #3413 = Utf8               PlayerDroppedItemMultiplier
  #3414 = Fieldref           #27.#3415    // ext/mods/Config.PLAYER_DROPPED_ITEM_MULTIPLIER:I
  #3415 = NameAndType        #3416:#86    // PLAYER_DROPPED_ITEM_MULTIPLIER:I
  #3416 = Utf8               PLAYER_DROPPED_ITEM_MULTIPLIER
  #3417 = Fieldref           #27.#3418    // ext/mods/Config.ITEMS_FILE:Ljava/lang/String;
  #3418 = NameAndType        #3419:#43    // ITEMS_FILE:Ljava/lang/String;
  #3419 = Utf8               ITEMS_FILE
  #3420 = String             #3421        // ItemsGcCleanupEnabled
  #3421 = Utf8               ItemsGcCleanupEnabled
  #3422 = Fieldref           #27.#3423    // ext/mods/Config.ITEMS_GC_CLEANUP_ENABLED:Z
  #3423 = NameAndType        #3424:#57    // ITEMS_GC_CLEANUP_ENABLED:Z
  #3424 = Utf8               ITEMS_GC_CLEANUP_ENABLED
  #3425 = String             #3426        // ItemsGcCleanupTime
  #3426 = Utf8               ItemsGcCleanupTime
  #3427 = Fieldref           #27.#3428    // ext/mods/Config.ITEMS_GC_CLEANUP_TIME_MS:I
  #3428 = NameAndType        #3429:#86    // ITEMS_GC_CLEANUP_TIME_MS:I
  #3429 = Utf8               ITEMS_GC_CLEANUP_TIME_MS
  #3430 = String             #3431        // AllowFreight
  #3431 = Utf8               AllowFreight
  #3432 = Fieldref           #27.#3433    // ext/mods/Config.ALLOW_FREIGHT:Z
  #3433 = NameAndType        #3434:#57    // ALLOW_FREIGHT:Z
  #3434 = Utf8               ALLOW_FREIGHT
  #3435 = String             #3436        // AllowWarehouse
  #3436 = Utf8               AllowWarehouse
  #3437 = Fieldref           #27.#3438    // ext/mods/Config.ALLOW_WAREHOUSE:Z
  #3438 = NameAndType        #3439:#57    // ALLOW_WAREHOUSE:Z
  #3439 = Utf8               ALLOW_WAREHOUSE
  #3440 = String             #3441        // AllowWear
  #3441 = Utf8               AllowWear
  #3442 = Fieldref           #27.#3443    // ext/mods/Config.ALLOW_WEAR:Z
  #3443 = NameAndType        #3444:#57    // ALLOW_WEAR:Z
  #3444 = Utf8               ALLOW_WEAR
  #3445 = String             #3446        // WearDelay
  #3446 = Utf8               WearDelay
  #3447 = Fieldref           #27.#3448    // ext/mods/Config.WEAR_DELAY:I
  #3448 = NameAndType        #3449:#86    // WEAR_DELAY:I
  #3449 = Utf8               WEAR_DELAY
  #3450 = String             #3451        // WearPrice
  #3451 = Utf8               WearPrice
  #3452 = Fieldref           #27.#3453    // ext/mods/Config.WEAR_PRICE:I
  #3453 = NameAndType        #3454:#86    // WEAR_PRICE:I
  #3454 = Utf8               WEAR_PRICE
  #3455 = String             #3456        // AllowLottery
  #3456 = Utf8               AllowLottery
  #3457 = Fieldref           #27.#3458    // ext/mods/Config.ALLOW_LOTTERY:Z
  #3458 = NameAndType        #3459:#57    // ALLOW_LOTTERY:Z
  #3459 = Utf8               ALLOW_LOTTERY
  #3460 = String             #3461        // AllowWater
  #3461 = Utf8               AllowWater
  #3462 = Fieldref           #27.#3463    // ext/mods/Config.ALLOW_WATER:Z
  #3463 = NameAndType        #3464:#57    // ALLOW_WATER:Z
  #3464 = Utf8               ALLOW_WATER
  #3465 = String             #3466        // AllowManor
  #3466 = Utf8               AllowManor
  #3467 = Fieldref           #27.#3468    // ext/mods/Config.ALLOW_MANOR:Z
  #3468 = NameAndType        #3469:#57    // ALLOW_MANOR:Z
  #3469 = Utf8               ALLOW_MANOR
  #3470 = String             #3471        // AllowBoat
  #3471 = Utf8               AllowBoat
  #3472 = Fieldref           #27.#3473    // ext/mods/Config.ALLOW_BOAT:Z
  #3473 = NameAndType        #3474:#57    // ALLOW_BOAT:Z
  #3474 = Utf8               ALLOW_BOAT
  #3475 = String             #3476        // AllowCursedWeapons
  #3476 = Utf8               AllowCursedWeapons
  #3477 = Fieldref           #27.#3478    // ext/mods/Config.ALLOW_CURSED_WEAPONS:Z
  #3478 = NameAndType        #3479:#57    // ALLOW_CURSED_WEAPONS:Z
  #3479 = Utf8               ALLOW_CURSED_WEAPONS
  #3480 = String             #3481        // AllowShadowWeapon
  #3481 = Utf8               AllowShadowWeapon
  #3482 = Fieldref           #27.#3483    // ext/mods/Config.ALLOW_SHADOW_WEAPONS:Z
  #3483 = NameAndType        #3484:#57    // ALLOW_SHADOW_WEAPONS:Z
  #3484 = Utf8               ALLOW_SHADOW_WEAPONS
  #3485 = String             #3486        // EnableFallingDamage
  #3486 = Utf8               EnableFallingDamage
  #3487 = Fieldref           #27.#3488    // ext/mods/Config.ENABLE_FALLING_DAMAGE:Z
  #3488 = NameAndType        #3489:#57    // ENABLE_FALLING_DAMAGE:Z
  #3489 = Utf8               ENABLE_FALLING_DAMAGE
  #3490 = String             #3491        // NoSpawns
  #3491 = Utf8               NoSpawns
  #3492 = Fieldref           #27.#3493    // ext/mods/Config.NO_SPAWNS:Z
  #3493 = NameAndType        #3494:#57    // NO_SPAWNS:Z
  #3494 = Utf8               NO_SPAWNS
  #3495 = String             #3496        // Developer
  #3496 = Utf8               Developer
  #3497 = Fieldref           #27.#3498    // ext/mods/Config.DEVELOPER:Z
  #3498 = NameAndType        #3499:#57    // DEVELOPER:Z
  #3499 = Utf8               DEVELOPER
  #3500 = String             #3501        // PacketHandlerDebug
  #3501 = Utf8               PacketHandlerDebug
  #3502 = Fieldref           #27.#3503    // ext/mods/Config.PACKET_HANDLER_DEBUG:Z
  #3503 = NameAndType        #3504:#57    // PACKET_HANDLER_DEBUG:Z
  #3504 = Utf8               PACKET_HANDLER_DEBUG
  #3505 = String             #3506        // ClientPacket
  #3506 = Utf8               ClientPacket
  #3507 = String             #3508        // ValidatePosition
  #3508 = Utf8               ValidatePosition
  #3509 = Methodref          #3510.#3511  // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #3510 = Class              #3512        // java/util/Arrays
  #3511 = NameAndType        #3513:#3514  // asList:([Ljava/lang/Object;)Ljava/util/List;
  #3512 = Utf8               java/util/Arrays
  #3513 = Utf8               asList
  #3514 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #3515 = Fieldref           #27.#3516    // ext/mods/Config.CLIENT_PACKETS:Ljava/util/List;
  #3516 = NameAndType        #3517:#1221  // CLIENT_PACKETS:Ljava/util/List;
  #3517 = Utf8               CLIENT_PACKETS
  #3518 = String             #3519        // ServerPacket
  #3519 = Utf8               ServerPacket
  #3520 = String             #3521        // AbnormalStatusUpdate,AcquireSkillList,Attack,AutoAttackStart,AutoAttackStop,DeleteObject,ExAutoSoulShot,ExStorageMaxCount,MoveToLocation,NpcInfo,NpcSay,SkillCoolTime,SocialAction,StatusUpdate,UserInfo
  #3521 = Utf8               AbnormalStatusUpdate,AcquireSkillList,Attack,AutoAttackStart,AutoAttackStop,DeleteObject,ExAutoSoulShot,ExStorageMaxCount,MoveToLocation,NpcInfo,NpcSay,SkillCoolTime,SocialAction,StatusUpdate,UserInfo
  #3522 = Fieldref           #27.#3523    // ext/mods/Config.SERVER_PACKETS:Ljava/util/List;
  #3523 = NameAndType        #3524:#1221  // SERVER_PACKETS:Ljava/util/List;
  #3524 = Utf8               SERVER_PACKETS
  #3525 = String             #3526        // LogChat
  #3526 = Utf8               LogChat
  #3527 = Fieldref           #27.#3528    // ext/mods/Config.LOG_CHAT:Z
  #3528 = NameAndType        #3529:#57    // LOG_CHAT:Z
  #3529 = Utf8               LOG_CHAT
  #3530 = String             #3531        // LogItems
  #3531 = Utf8               LogItems
  #3532 = Fieldref           #27.#3533    // ext/mods/Config.LOG_ITEMS:Z
  #3533 = NameAndType        #3534:#57    // LOG_ITEMS:Z
  #3534 = Utf8               LOG_ITEMS
  #3535 = String             #3536        // DropItems
  #3536 = Utf8               DropItems
  #3537 = Fieldref           #27.#3538    // ext/mods/Config.DROP_ITEMS:Z
  #3538 = NameAndType        #3539:#57    // DROP_ITEMS:Z
  #3539 = Utf8               DROP_ITEMS
  #3540 = String             #3541        // GMAudit
  #3541 = Utf8               GMAudit
  #3542 = Fieldref           #27.#3543    // ext/mods/Config.GMAUDIT:Z
  #3543 = NameAndType        #3544:#57    // GMAUDIT:Z
  #3544 = Utf8               GMAUDIT
  #3545 = String             #3546        // EnableCustomBbs
  #3546 = Utf8               EnableCustomBbs
  #3547 = Fieldref           #27.#3548    // ext/mods/Config.ENABLE_CUSTOM_BBS:Z
  #3548 = NameAndType        #3549:#57    // ENABLE_CUSTOM_BBS:Z
  #3549 = Utf8               ENABLE_CUSTOM_BBS
  #3550 = String             #3551        // EnableCommunityBoard
  #3551 = Utf8               EnableCommunityBoard
  #3552 = Fieldref           #27.#3553    // ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
  #3553 = NameAndType        #3554:#57    // ENABLE_COMMUNITY_BOARD:Z
  #3554 = Utf8               ENABLE_COMMUNITY_BOARD
  #3555 = String             #3556        // BBSDefault
  #3556 = Utf8               BBSDefault
  #3557 = String             #3558        // _bbshome
  #3558 = Utf8               _bbshome
  #3559 = Fieldref           #27.#3560    // ext/mods/Config.BBS_DEFAULT:Ljava/lang/String;
  #3560 = NameAndType        #3561:#43    // BBS_DEFAULT:Ljava/lang/String;
  #3561 = Utf8               BBS_DEFAULT
  #3562 = String             #3563        // RollDiceTime
  #3563 = Utf8               RollDiceTime
  #3564 = Fieldref           #27.#3565    // ext/mods/Config.ROLL_DICE_TIME:I
  #3565 = NameAndType        #3566:#86    // ROLL_DICE_TIME:I
  #3566 = Utf8               ROLL_DICE_TIME
  #3567 = String             #3568        // HeroVoiceTime
  #3568 = Utf8               HeroVoiceTime
  #3569 = Fieldref           #27.#3570    // ext/mods/Config.HERO_VOICE_TIME:I
  #3570 = NameAndType        #3571:#86    // HERO_VOICE_TIME:I
  #3571 = Utf8               HERO_VOICE_TIME
  #3572 = String             #3573        // SubclassTime
  #3573 = Utf8               SubclassTime
  #3574 = Fieldref           #27.#3575    // ext/mods/Config.SUBCLASS_TIME:I
  #3575 = NameAndType        #3576:#86    // SUBCLASS_TIME:I
  #3576 = Utf8               SUBCLASS_TIME
  #3577 = String             #3578        // DropItemTime
  #3578 = Utf8               DropItemTime
  #3579 = Fieldref           #27.#3580    // ext/mods/Config.DROP_ITEM_TIME:I
  #3580 = NameAndType        #3581:#86    // DROP_ITEM_TIME:I
  #3581 = Utf8               DROP_ITEM_TIME
  #3582 = String             #3583        // ServerBypassTime
  #3583 = Utf8               ServerBypassTime
  #3584 = Fieldref           #27.#3585    // ext/mods/Config.SERVER_BYPASS_TIME:I
  #3585 = NameAndType        #3586:#86    // SERVER_BYPASS_TIME:I
  #3586 = Utf8               SERVER_BYPASS_TIME
  #3587 = String             #3588        // MultisellTime
  #3588 = Utf8               MultisellTime
  #3589 = Fieldref           #27.#3590    // ext/mods/Config.MULTISELL_TIME:I
  #3590 = NameAndType        #3591:#86    // MULTISELL_TIME:I
  #3591 = Utf8               MULTISELL_TIME
  #3592 = String             #3593        // ManufactureTime
  #3593 = Utf8               ManufactureTime
  #3594 = Fieldref           #27.#3595    // ext/mods/Config.MANUFACTURE_TIME:I
  #3595 = NameAndType        #3596:#86    // MANUFACTURE_TIME:I
  #3596 = Utf8               MANUFACTURE_TIME
  #3597 = String             #3598        // ManorTime
  #3598 = Utf8               ManorTime
  #3599 = Fieldref           #27.#3600    // ext/mods/Config.MANOR_TIME:I
  #3600 = NameAndType        #3601:#86    // MANOR_TIME:I
  #3601 = Utf8               MANOR_TIME
  #3602 = String             #3603        // SendMailTime
  #3603 = Utf8               SendMailTime
  #3604 = Fieldref           #27.#3605    // ext/mods/Config.SENDMAIL_TIME:I
  #3605 = NameAndType        #3606:#86    // SENDMAIL_TIME:I
  #3606 = Utf8               SENDMAIL_TIME
  #3607 = String             #3608        // CharacterSelectTime
  #3608 = Utf8               CharacterSelectTime
  #3609 = Fieldref           #27.#3610    // ext/mods/Config.CHARACTER_SELECT_TIME:I
  #3610 = NameAndType        #3611:#86    // CHARACTER_SELECT_TIME:I
  #3611 = Utf8               CHARACTER_SELECT_TIME
  #3612 = String             #3613        // GlobalChatTime
  #3613 = Utf8               GlobalChatTime
  #3614 = Fieldref           #27.#3615    // ext/mods/Config.GLOBAL_CHAT_TIME:I
  #3615 = NameAndType        #3616:#86    // GLOBAL_CHAT_TIME:I
  #3616 = Utf8               GLOBAL_CHAT_TIME
  #3617 = String             #3618        // TradeChatTime
  #3618 = Utf8               TradeChatTime
  #3619 = Fieldref           #27.#3620    // ext/mods/Config.TRADE_CHAT_TIME:I
  #3620 = NameAndType        #3621:#86    // TRADE_CHAT_TIME:I
  #3621 = Utf8               TRADE_CHAT_TIME
  #3622 = String             #3623        // SocialTime
  #3623 = Utf8               SocialTime
  #3624 = Fieldref           #27.#3625    // ext/mods/Config.SOCIAL_TIME:I
  #3625 = NameAndType        #3626:#86    // SOCIAL_TIME:I
  #3626 = Utf8               SOCIAL_TIME
  #3627 = String             #3628        // ItemTime
  #3628 = Utf8               ItemTime
  #3629 = Fieldref           #27.#3630    // ext/mods/Config.ITEM_TIME:I
  #3630 = NameAndType        #3631:#86    // ITEM_TIME:I
  #3631 = Utf8               ITEM_TIME
  #3632 = String             #3633        // ActionTime
  #3633 = Utf8               ActionTime
  #3634 = Fieldref           #27.#3635    // ext/mods/Config.ACTION_TIME:I
  #3635 = NameAndType        #3636:#86    // ACTION_TIME:I
  #3636 = Utf8               ACTION_TIME
  #3637 = String             #3638        // ScheduledThreadPoolCount
  #3638 = Utf8               ScheduledThreadPoolCount
  #3639 = Fieldref           #27.#3640    // ext/mods/Config.SCHEDULED_THREAD_POOL_COUNT:I
  #3640 = NameAndType        #3641:#86    // SCHEDULED_THREAD_POOL_COUNT:I
  #3641 = Utf8               SCHEDULED_THREAD_POOL_COUNT
  #3642 = String             #3643        // InstantThreadPoolCount
  #3643 = Utf8               InstantThreadPoolCount
  #3644 = Fieldref           #27.#3645    // ext/mods/Config.INSTANT_THREAD_POOL_COUNT:I
  #3645 = NameAndType        #3646:#86    // INSTANT_THREAD_POOL_COUNT:I
  #3646 = Utf8               INSTANT_THREAD_POOL_COUNT
  #3647 = String             #3648        // L2WalkerProtection
  #3648 = Utf8               L2WalkerProtection
  #3649 = Fieldref           #27.#3650    // ext/mods/Config.L2WALKER_PROTECTION:Z
  #3650 = NameAndType        #3651:#57    // L2WALKER_PROTECTION:Z
  #3651 = Utf8               L2WALKER_PROTECTION
  #3652 = String             #3653        // ZoneTown
  #3653 = Utf8               ZoneTown
  #3654 = Fieldref           #27.#3655    // ext/mods/Config.ZONE_TOWN:I
  #3655 = NameAndType        #3656:#86    // ZONE_TOWN:I
  #3656 = Utf8               ZONE_TOWN
  #3657 = String             #3658        // ShowServerNews
  #3658 = Utf8               ShowServerNews
  #3659 = Fieldref           #27.#3660    // ext/mods/Config.SERVER_NEWS:Z
  #3660 = NameAndType        #3661:#57    // SERVER_NEWS:Z
  #3661 = Utf8               SERVER_NEWS
  #3662 = Fieldref           #27.#3663    // ext/mods/Config.RATES_FILE:Ljava/lang/String;
  #3663 = NameAndType        #3664:#43    // RATES_FILE:Ljava/lang/String;
  #3664 = Utf8               RATES_FILE
  #3665 = String             #3666        // RateXp
  #3666 = Utf8               RateXp
  #3667 = Fieldref           #27.#3668    // ext/mods/Config.RATE_XP:D
  #3668 = NameAndType        #3669:#365   // RATE_XP:D
  #3669 = Utf8               RATE_XP
  #3670 = String             #3671        // RateSp
  #3671 = Utf8               RateSp
  #3672 = Fieldref           #27.#3673    // ext/mods/Config.RATE_SP:D
  #3673 = NameAndType        #3674:#365   // RATE_SP:D
  #3674 = Utf8               RATE_SP
  #3675 = String             #3676        // RatePartyXp
  #3676 = Utf8               RatePartyXp
  #3677 = Fieldref           #27.#3678    // ext/mods/Config.RATE_PARTY_XP:D
  #3678 = NameAndType        #3679:#365   // RATE_PARTY_XP:D
  #3679 = Utf8               RATE_PARTY_XP
  #3680 = String             #3681        // RatePartySp
  #3681 = Utf8               RatePartySp
  #3682 = Fieldref           #27.#3683    // ext/mods/Config.RATE_PARTY_SP:D
  #3683 = NameAndType        #3684:#365   // RATE_PARTY_SP:D
  #3684 = Utf8               RATE_PARTY_SP
  #3685 = String             #3686        // RateDropCurrency
  #3686 = Utf8               RateDropCurrency
  #3687 = Fieldref           #27.#3688    // ext/mods/Config.RATE_DROP_CURRENCY:D
  #3688 = NameAndType        #3689:#365   // RATE_DROP_CURRENCY:D
  #3689 = Utf8               RATE_DROP_CURRENCY
  #3690 = String             #3691        // RateDropSealStone
  #3691 = Utf8               RateDropSealStone
  #3692 = Fieldref           #27.#3693    // ext/mods/Config.RATE_DROP_SEAL_STONE:D
  #3693 = NameAndType        #3694:#365   // RATE_DROP_SEAL_STONE:D
  #3694 = Utf8               RATE_DROP_SEAL_STONE
  #3695 = String             #3696        // RateDropItems
  #3696 = Utf8               RateDropItems
  #3697 = Fieldref           #27.#3698    // ext/mods/Config.RATE_DROP_ITEMS:D
  #3698 = NameAndType        #3699:#365   // RATE_DROP_ITEMS:D
  #3699 = Utf8               RATE_DROP_ITEMS
  #3700 = String             #3701        // RateRaidDropItems
  #3701 = Utf8               RateRaidDropItems
  #3702 = Fieldref           #27.#3703    // ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
  #3703 = NameAndType        #3704:#365   // RATE_DROP_ITEMS_BY_RAID:D
  #3704 = Utf8               RATE_DROP_ITEMS_BY_RAID
  #3705 = String             #3706        // RateGrandDropItems
  #3706 = Utf8               RateGrandDropItems
  #3707 = Fieldref           #27.#3708    // ext/mods/Config.RATE_DROP_ITEMS_BY_GRAND:D
  #3708 = NameAndType        #3709:#365   // RATE_DROP_ITEMS_BY_GRAND:D
  #3709 = Utf8               RATE_DROP_ITEMS_BY_GRAND
  #3710 = String             #3711        // RateDropSpoil
  #3711 = Utf8               RateDropSpoil
  #3712 = Fieldref           #27.#3713    // ext/mods/Config.RATE_DROP_SPOIL:D
  #3713 = NameAndType        #3714:#365   // RATE_DROP_SPOIL:D
  #3714 = Utf8               RATE_DROP_SPOIL
  #3715 = String             #3716        // PremiumRateXp
  #3716 = Utf8               PremiumRateXp
  #3717 = Fieldref           #27.#3718    // ext/mods/Config.PREMIUM_RATE_XP:D
  #3718 = NameAndType        #3719:#365   // PREMIUM_RATE_XP:D
  #3719 = Utf8               PREMIUM_RATE_XP
  #3720 = String             #3721        // PremiumRateSp
  #3721 = Utf8               PremiumRateSp
  #3722 = Fieldref           #27.#3723    // ext/mods/Config.PREMIUM_RATE_SP:D
  #3723 = NameAndType        #3724:#365   // PREMIUM_RATE_SP:D
  #3724 = Utf8               PREMIUM_RATE_SP
  #3725 = String             #3726        // PremiumRateDropCurrency
  #3726 = Utf8               PremiumRateDropCurrency
  #3727 = Fieldref           #27.#3728    // ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
  #3728 = NameAndType        #3729:#365   // PREMIUM_RATE_DROP_CURRENCY:D
  #3729 = Utf8               PREMIUM_RATE_DROP_CURRENCY
  #3730 = String             #3731        // PremiumRateDropSealStone
  #3731 = Utf8               PremiumRateDropSealStone
  #3732 = Fieldref           #27.#3733    // ext/mods/Config.PREMIUM_RATE_DROP_SEAL_STONE:D
  #3733 = NameAndType        #3734:#365   // PREMIUM_RATE_DROP_SEAL_STONE:D
  #3734 = Utf8               PREMIUM_RATE_DROP_SEAL_STONE
  #3735 = String             #3736        // PremiumRateDropSpoil
  #3736 = Utf8               PremiumRateDropSpoil
  #3737 = Fieldref           #27.#3738    // ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
  #3738 = NameAndType        #3739:#365   // PREMIUM_RATE_DROP_SPOIL:D
  #3739 = Utf8               PREMIUM_RATE_DROP_SPOIL
  #3740 = String             #3741        // PremiumRateDropItems
  #3741 = Utf8               PremiumRateDropItems
  #3742 = Fieldref           #27.#3743    // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
  #3743 = NameAndType        #3744:#365   // PREMIUM_RATE_DROP_ITEMS:D
  #3744 = Utf8               PREMIUM_RATE_DROP_ITEMS
  #3745 = String             #3746        // PremiumRateRaidDropItems
  #3746 = Utf8               PremiumRateRaidDropItems
  #3747 = Fieldref           #27.#3748    // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
  #3748 = NameAndType        #3749:#365   // PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
  #3749 = Utf8               PREMIUM_RATE_DROP_ITEMS_BY_RAID
  #3750 = String             #3751        // PremiumRateGrandDropItems
  #3751 = Utf8               PremiumRateGrandDropItems
  #3752 = Fieldref           #27.#3753    // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_GRAND:D
  #3753 = NameAndType        #3754:#365   // PREMIUM_RATE_DROP_ITEMS_BY_GRAND:D
  #3754 = Utf8               PREMIUM_RATE_DROP_ITEMS_BY_GRAND
  #3755 = String             #3756        // PremiumRateQuestDrop
  #3756 = Utf8               PremiumRateQuestDrop
  #3757 = Fieldref           #27.#3758    // ext/mods/Config.PREMIUM_RATE_QUEST_DROP:D
  #3758 = NameAndType        #3759:#365   // PREMIUM_RATE_QUEST_DROP:D
  #3759 = Utf8               PREMIUM_RATE_QUEST_DROP
  #3760 = String             #3761        // PremiumRateQuestReward
  #3761 = Utf8               PremiumRateQuestReward
  #3762 = Fieldref           #27.#3763    // ext/mods/Config.PREMIUM_RATE_QUEST_REWARD:D
  #3763 = NameAndType        #3764:#365   // PREMIUM_RATE_QUEST_REWARD:D
  #3764 = Utf8               PREMIUM_RATE_QUEST_REWARD
  #3765 = String             #3766        // PremiumRateQuestRewardXP
  #3766 = Utf8               PremiumRateQuestRewardXP
  #3767 = Fieldref           #27.#3768    // ext/mods/Config.PREMIUM_RATE_QUEST_REWARD_XP:D
  #3768 = NameAndType        #3769:#365   // PREMIUM_RATE_QUEST_REWARD_XP:D
  #3769 = Utf8               PREMIUM_RATE_QUEST_REWARD_XP
  #3770 = String             #3771        // PremiumRateQuestRewardSP
  #3771 = Utf8               PremiumRateQuestRewardSP
  #3772 = Fieldref           #27.#3773    // ext/mods/Config.PREMIUM_RATE_QUEST_REWARD_SP:D
  #3773 = NameAndType        #3774:#365   // PREMIUM_RATE_QUEST_REWARD_SP:D
  #3774 = Utf8               PREMIUM_RATE_QUEST_REWARD_SP
  #3775 = String             #3776        // PremiumRateQuestRewardAdena
  #3776 = Utf8               PremiumRateQuestRewardAdena
  #3777 = Fieldref           #27.#3778    // ext/mods/Config.PREMIUM_RATE_QUEST_REWARD_ADENA:D
  #3778 = NameAndType        #3779:#365   // PREMIUM_RATE_QUEST_REWARD_ADENA:D
  #3779 = Utf8               PREMIUM_RATE_QUEST_REWARD_ADENA
  #3780 = String             #3781        // DynamicXp
  #3781 = Utf8               DynamicXp
  #3782 = Fieldref           #27.#3783    // ext/mods/Config.DYNAMIC_XP:Z
  #3783 = NameAndType        #3784:#57    // DYNAMIC_XP:Z
  #3784 = Utf8               DYNAMIC_XP
  #3785 = Fieldref           #27.#3786    // ext/mods/Config.DYNAMIC_XP_RATES:Ljava/util/Map;
  #3786 = NameAndType        #3787:#1247  // DYNAMIC_XP_RATES:Ljava/util/Map;
  #3787 = Utf8               DYNAMIC_XP_RATES
  #3788 = String             #3789        // DynamicXpRates
  #3789 = Utf8               DynamicXpRates
  #3790 = String             #3791        // :
  #3791 = Utf8               :
  #3792 = InvokeDynamic      #10:#227     // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #3793 = Methodref          #3794.#3795  // java/lang/Double.parseDouble:(Ljava/lang/String;)D
  #3794 = Class              #3796        // java/lang/Double
  #3795 = NameAndType        #3797:#3798  // parseDouble:(Ljava/lang/String;)D
  #3796 = Utf8               java/lang/Double
  #3797 = Utf8               parseDouble
  #3798 = Utf8               (Ljava/lang/String;)D
  #3799 = Methodref          #3794.#3800  // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #3800 = NameAndType        #406:#3801   // valueOf:(D)Ljava/lang/Double;
  #3801 = Utf8               (D)Ljava/lang/Double;
  #3802 = Methodref          #243.#1395   // java/lang/NumberFormatException.printStackTrace:()V
  #3803 = Methodref          #215.#3804   // java/lang/String.equals:(Ljava/lang/Object;)Z
  #3804 = NameAndType        #3805:#413   // equals:(Ljava/lang/Object;)Z
  #3805 = Utf8               equals
  #3806 = InvokeDynamic      #11:#3807    // #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #3807 = NameAndType        #228:#204    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #3808 = String             #3809        // RateDropHerbs
  #3809 = Utf8               RateDropHerbs
  #3810 = Fieldref           #27.#3811    // ext/mods/Config.RATE_DROP_HERBS:D
  #3811 = NameAndType        #3812:#365   // RATE_DROP_HERBS:D
  #3812 = Utf8               RATE_DROP_HERBS
  #3813 = String             #3814        // RateDropManor
  #3814 = Utf8               RateDropManor
  #3815 = Fieldref           #27.#3816    // ext/mods/Config.RATE_DROP_MANOR:I
  #3816 = NameAndType        #3817:#86    // RATE_DROP_MANOR:I
  #3817 = Utf8               RATE_DROP_MANOR
  #3818 = String             #3819        // RateQuestDrop
  #3819 = Utf8               RateQuestDrop
  #3820 = Fieldref           #27.#3821    // ext/mods/Config.RATE_QUEST_DROP:D
  #3821 = NameAndType        #3822:#365   // RATE_QUEST_DROP:D
  #3822 = Utf8               RATE_QUEST_DROP
  #3823 = String             #3824        // RateQuestReward
  #3824 = Utf8               RateQuestReward
  #3825 = Fieldref           #27.#3826    // ext/mods/Config.RATE_QUEST_REWARD:D
  #3826 = NameAndType        #3827:#365   // RATE_QUEST_REWARD:D
  #3827 = Utf8               RATE_QUEST_REWARD
  #3828 = String             #3829        // RateQuestRewardXP
  #3829 = Utf8               RateQuestRewardXP
  #3830 = Fieldref           #27.#3831    // ext/mods/Config.RATE_QUEST_REWARD_XP:D
  #3831 = NameAndType        #3832:#365   // RATE_QUEST_REWARD_XP:D
  #3832 = Utf8               RATE_QUEST_REWARD_XP
  #3833 = String             #3834        // RateQuestRewardSP
  #3834 = Utf8               RateQuestRewardSP
  #3835 = Fieldref           #27.#3836    // ext/mods/Config.RATE_QUEST_REWARD_SP:D
  #3836 = NameAndType        #3837:#365   // RATE_QUEST_REWARD_SP:D
  #3837 = Utf8               RATE_QUEST_REWARD_SP
  #3838 = String             #3839        // RateQuestRewardAdena
  #3839 = Utf8               RateQuestRewardAdena
  #3840 = Fieldref           #27.#3841    // ext/mods/Config.RATE_QUEST_REWARD_ADENA:D
  #3841 = NameAndType        #3842:#365   // RATE_QUEST_REWARD_ADENA:D
  #3842 = Utf8               RATE_QUEST_REWARD_ADENA
  #3843 = String             #3844        // RateKarmaExpLost
  #3844 = Utf8               RateKarmaExpLost
  #3845 = Fieldref           #27.#3846    // ext/mods/Config.RATE_KARMA_EXP_LOST:D
  #3846 = NameAndType        #3847:#365   // RATE_KARMA_EXP_LOST:D
  #3847 = Utf8               RATE_KARMA_EXP_LOST
  #3848 = String             #3849        // RateSiegeGuardsPrice
  #3849 = Utf8               RateSiegeGuardsPrice
  #3850 = Fieldref           #27.#3851    // ext/mods/Config.RATE_SIEGE_GUARDS_PRICE:D
  #3851 = NameAndType        #3852:#365   // RATE_SIEGE_GUARDS_PRICE:D
  #3852 = Utf8               RATE_SIEGE_GUARDS_PRICE
  #3853 = String             #3854        // PlayerDropLimit
  #3854 = Utf8               PlayerDropLimit
  #3855 = Fieldref           #27.#3856    // ext/mods/Config.PLAYER_DROP_LIMIT:I
  #3856 = NameAndType        #3857:#86    // PLAYER_DROP_LIMIT:I
  #3857 = Utf8               PLAYER_DROP_LIMIT
  #3858 = String             #3859        // PlayerRateDrop
  #3859 = Utf8               PlayerRateDrop
  #3860 = Fieldref           #27.#3861    // ext/mods/Config.PLAYER_RATE_DROP:I
  #3861 = NameAndType        #3862:#86    // PLAYER_RATE_DROP:I
  #3862 = Utf8               PLAYER_RATE_DROP
  #3863 = String             #3864        // PlayerRateDropItem
  #3864 = Utf8               PlayerRateDropItem
  #3865 = Fieldref           #27.#3866    // ext/mods/Config.PLAYER_RATE_DROP_ITEM:I
  #3866 = NameAndType        #3867:#86    // PLAYER_RATE_DROP_ITEM:I
  #3867 = Utf8               PLAYER_RATE_DROP_ITEM
  #3868 = String             #3869        // PlayerRateDropEquip
  #3869 = Utf8               PlayerRateDropEquip
  #3870 = Fieldref           #27.#3871    // ext/mods/Config.PLAYER_RATE_DROP_EQUIP:I
  #3871 = NameAndType        #3872:#86    // PLAYER_RATE_DROP_EQUIP:I
  #3872 = Utf8               PLAYER_RATE_DROP_EQUIP
  #3873 = String             #3874        // PlayerRateDropEquipWeapon
  #3874 = Utf8               PlayerRateDropEquipWeapon
  #3875 = Fieldref           #27.#3876    // ext/mods/Config.PLAYER_RATE_DROP_EQUIP_WEAPON:I
  #3876 = NameAndType        #3877:#86    // PLAYER_RATE_DROP_EQUIP_WEAPON:I
  #3877 = Utf8               PLAYER_RATE_DROP_EQUIP_WEAPON
  #3878 = String             #3879        // PetXpRate
  #3879 = Utf8               PetXpRate
  #3880 = Fieldref           #27.#3881    // ext/mods/Config.PET_XP_RATE:D
  #3881 = NameAndType        #3882:#365   // PET_XP_RATE:D
  #3882 = Utf8               PET_XP_RATE
  #3883 = String             #3884        // PetFoodRate
  #3884 = Utf8               PetFoodRate
  #3885 = Fieldref           #27.#3886    // ext/mods/Config.PET_FOOD_RATE:I
  #3886 = NameAndType        #3887:#86    // PET_FOOD_RATE:I
  #3887 = Utf8               PET_FOOD_RATE
  #3888 = String             #3889        // SinEaterXpRate
  #3889 = Utf8               SinEaterXpRate
  #3890 = Fieldref           #27.#3891    // ext/mods/Config.SINEATER_XP_RATE:D
  #3891 = NameAndType        #3892:#365   // SINEATER_XP_RATE:D
  #3892 = Utf8               SINEATER_XP_RATE
  #3893 = String             #3894        // KarmaDropLimit
  #3894 = Utf8               KarmaDropLimit
  #3895 = Fieldref           #27.#3896    // ext/mods/Config.KARMA_DROP_LIMIT:I
  #3896 = NameAndType        #3897:#86    // KARMA_DROP_LIMIT:I
  #3897 = Utf8               KARMA_DROP_LIMIT
  #3898 = String             #3899        // KarmaRateDrop
  #3899 = Utf8               KarmaRateDrop
  #3900 = Fieldref           #27.#3901    // ext/mods/Config.KARMA_RATE_DROP:I
  #3901 = NameAndType        #3902:#86    // KARMA_RATE_DROP:I
  #3902 = Utf8               KARMA_RATE_DROP
  #3903 = String             #3904        // KarmaRateDropItem
  #3904 = Utf8               KarmaRateDropItem
  #3905 = Fieldref           #27.#3906    // ext/mods/Config.KARMA_RATE_DROP_ITEM:I
  #3906 = NameAndType        #3907:#86    // KARMA_RATE_DROP_ITEM:I
  #3907 = Utf8               KARMA_RATE_DROP_ITEM
  #3908 = String             #3909        // KarmaRateDropEquip
  #3909 = Utf8               KarmaRateDropEquip
  #3910 = Fieldref           #27.#3911    // ext/mods/Config.KARMA_RATE_DROP_EQUIP:I
  #3911 = NameAndType        #3912:#86    // KARMA_RATE_DROP_EQUIP:I
  #3912 = Utf8               KARMA_RATE_DROP_EQUIP
  #3913 = String             #3914        // KarmaRateDropEquipWeapon
  #3914 = Utf8               KarmaRateDropEquipWeapon
  #3915 = Fieldref           #27.#3916    // ext/mods/Config.KARMA_RATE_DROP_EQUIP_WEAPON:I
  #3916 = NameAndType        #3917:#86    // KARMA_RATE_DROP_EQUIP_WEAPON:I
  #3917 = Utf8               KARMA_RATE_DROP_EQUIP_WEAPON
  #3918 = String             #3919        // GrandBossRateXp
  #3919 = Utf8               GrandBossRateXp
  #3920 = Fieldref           #27.#3921    // ext/mods/Config.GRANDBOSS_RATE_XP:D
  #3921 = NameAndType        #3922:#365   // GRANDBOSS_RATE_XP:D
  #3922 = Utf8               GRANDBOSS_RATE_XP
  #3923 = String             #3924        // GrandBossRateSp
  #3924 = Utf8               GrandBossRateSp
  #3925 = Fieldref           #27.#3926    // ext/mods/Config.GRANDBOSS_RATE_SP:D
  #3926 = NameAndType        #3927:#365   // GRANDBOSS_RATE_SP:D
  #3927 = Utf8               GRANDBOSS_RATE_SP
  #3928 = String             #3929        // RaidBossRateXp
  #3929 = Utf8               RaidBossRateXp
  #3930 = Fieldref           #27.#3931    // ext/mods/Config.RAIDBOSS_RATE_XP:D
  #3931 = NameAndType        #3932:#365   // RAIDBOSS_RATE_XP:D
  #3932 = Utf8               RAIDBOSS_RATE_XP
  #3933 = String             #3934        // RaidBossRateSp
  #3934 = Utf8               RaidBossRateSp
  #3935 = Fieldref           #27.#3936    // ext/mods/Config.RAIDBOSS_RATE_SP:D
  #3936 = NameAndType        #3937:#365   // RAIDBOSS_RATE_SP:D
  #3937 = Utf8               RAIDBOSS_RATE_SP
  #3938 = Fieldref           #27.#3939    // ext/mods/Config.BR_FILE:Ljava/lang/String;
  #3939 = NameAndType        #3940:#43    // BR_FILE:Ljava/lang/String;
  #3940 = Utf8               BR_FILE
  #3941 = String             #3942        // InfinitySS
  #3942 = Utf8               InfinitySS
  #3943 = Fieldref           #27.#3944    // ext/mods/Config.INFINITY_SS:Z
  #3944 = NameAndType        #3945:#57    // INFINITY_SS:Z
  #3945 = Utf8               INFINITY_SS
  #3946 = String             #3947        // InfinityArrows
  #3947 = Utf8               InfinityArrows
  #3948 = Fieldref           #27.#3949    // ext/mods/Config.INFINITY_ARROWS:Z
  #3949 = NameAndType        #3950:#57    // INFINITY_ARROWS:Z
  #3950 = Utf8               INFINITY_ARROWS
  #3951 = String             #3952        // InfinitySSPremiumOnly
  #3952 = Utf8               InfinitySSPremiumOnly
  #3953 = Fieldref           #27.#3954    // ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
  #3954 = NameAndType        #3955:#57    // INFINITY_SS_PREMIUM_ONLY:Z
  #3955 = Utf8               INFINITY_SS_PREMIUM_ONLY
  #3956 = String             #3957        // InfinityArrowsPremiumOnly
  #3957 = Utf8               InfinityArrowsPremiumOnly
  #3958 = Fieldref           #27.#3959    // ext/mods/Config.INFINITY_ARROWS_PREMIUM_ONLY:Z
  #3959 = NameAndType        #3960:#57    // INFINITY_ARROWS_PREMIUM_ONLY:Z
  #3960 = Utf8               INFINITY_ARROWS_PREMIUM_ONLY
  #3961 = String             #3962        // OlyUseCustomPeriodSettings
  #3962 = Utf8               OlyUseCustomPeriodSettings
  #3963 = Fieldref           #27.#3964    // ext/mods/Config.OLY_USE_CUSTOM_PERIOD_SETTINGS:Z
  #3964 = NameAndType        #3965:#57    // OLY_USE_CUSTOM_PERIOD_SETTINGS:Z
  #3965 = Utf8               OLY_USE_CUSTOM_PERIOD_SETTINGS
  #3966 = String             #3967        // OlyBlockSameHwid
  #3967 = Utf8               OlyBlockSameHwid
  #3968 = Fieldref           #27.#3969    // ext/mods/Config.OLY_BLOCK_SAME_HWID:Z
  #3969 = NameAndType        #3970:#57    // OLY_BLOCK_SAME_HWID:Z
  #3970 = Utf8               OLY_BLOCK_SAME_HWID
  #3971 = String             #3972        // OlyPeriod
  #3972 = Utf8               OlyPeriod
  #3973 = String             #3974        // MONTH
  #3974 = Utf8               MONTH
  #3975 = Methodref          #3976.#3977  // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #3976 = Class              #3978        // ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod
  #3977 = NameAndType        #406:#3979   // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #3978 = Utf8               ext/mods/gameserver/model/olympiad/enums/OlympiadPeriod
  #3979 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #3980 = Fieldref           #27.#3981    // ext/mods/Config.OLY_PERIOD:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #3981 = NameAndType        #3982:#3983  // OLY_PERIOD:Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #3982 = Utf8               OLY_PERIOD
  #3983 = Utf8               Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
  #3984 = String             #3985        // OlyPeriodMultiplier
  #3985 = Utf8               OlyPeriodMultiplier
  #3986 = Fieldref           #27.#3987    // ext/mods/Config.OLY_PERIOD_MULTIPLIER:I
  #3987 = NameAndType        #3988:#86    // OLY_PERIOD_MULTIPLIER:I
  #3988 = Utf8               OLY_PERIOD_MULTIPLIER
  #3989 = String             #3990        // EnableModifySkillDuration
  #3990 = Utf8               EnableModifySkillDuration
  #3991 = Fieldref           #27.#3992    // ext/mods/Config.ENABLE_MODIFY_SKILL_DURATION:Z
  #3992 = NameAndType        #3993:#57    // ENABLE_MODIFY_SKILL_DURATION:Z
  #3993 = Utf8               ENABLE_MODIFY_SKILL_DURATION
  #3994 = Fieldref           #27.#3995    // ext/mods/Config.SKILL_DURATION_LIST:Ljava/util/HashMap;
  #3995 = NameAndType        #3996:#3997  // SKILL_DURATION_LIST:Ljava/util/HashMap;
  #3996 = Utf8               SKILL_DURATION_LIST
  #3997 = Utf8               Ljava/util/HashMap;
  #3998 = String             #3999        // SkillDurationList
  #3999 = Utf8               SkillDurationList
  #4000 = InvokeDynamic      #12:#227     // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #4001 = Methodref          #1241.#1256  // java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #4002 = InvokeDynamic      #13:#3807    // #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #4003 = String             #4004        // GlobalChat
  #4004 = Utf8               GlobalChat
  #4005 = String             #4006        // ON
  #4006 = Utf8               ON
  #4007 = Fieldref           #27.#4008    // ext/mods/Config.GLOBAL_CHAT:Ljava/lang/String;
  #4008 = NameAndType        #4009:#43    // GLOBAL_CHAT:Ljava/lang/String;
  #4009 = Utf8               GLOBAL_CHAT
  #4010 = String             #4011        // TradeChat
  #4011 = Utf8               TradeChat
  #4012 = Fieldref           #27.#4013    // ext/mods/Config.TRADE_CHAT:Ljava/lang/String;
  #4013 = NameAndType        #4014:#43    // TRADE_CHAT:Ljava/lang/String;
  #4014 = Utf8               TRADE_CHAT
  #4015 = String             #4016        // AllChatLevel
  #4016 = Utf8               AllChatLevel
  #4017 = Fieldref           #27.#4018    // ext/mods/Config.CHAT_ALL_LEVEL:I
  #4018 = NameAndType        #4019:#86    // CHAT_ALL_LEVEL:I
  #4019 = Utf8               CHAT_ALL_LEVEL
  #4020 = String             #4021        // TellChatLevel
  #4021 = Utf8               TellChatLevel
  #4022 = Fieldref           #27.#4023    // ext/mods/Config.CHAT_TELL_LEVEL:I
  #4023 = NameAndType        #4024:#86    // CHAT_TELL_LEVEL:I
  #4024 = Utf8               CHAT_TELL_LEVEL
  #4025 = String             #4026        // ShoutChatLevel
  #4026 = Utf8               ShoutChatLevel
  #4027 = Fieldref           #27.#4028    // ext/mods/Config.CHAT_SHOUT_LEVEL:I
  #4028 = NameAndType        #4029:#86    // CHAT_SHOUT_LEVEL:I
  #4029 = Utf8               CHAT_SHOUT_LEVEL
  #4030 = String             #4031        // TradeChatLevel
  #4031 = Utf8               TradeChatLevel
  #4032 = Fieldref           #27.#4033    // ext/mods/Config.CHAT_TRADE_LEVEL:I
  #4033 = NameAndType        #4034:#86    // CHAT_TRADE_LEVEL:I
  #4034 = Utf8               CHAT_TRADE_LEVEL
  #4035 = String             #4036        // EnableMenu
  #4036 = Utf8               EnableMenu
  #4037 = Fieldref           #27.#4038    // ext/mods/Config.ENABLE_MENU:Z
  #4038 = NameAndType        #4039:#57    // ENABLE_MENU:Z
  #4039 = Utf8               ENABLE_MENU
  #4040 = String             #4041        // PropStopExp
  #4041 = Utf8               PropStopExp
  #4042 = Fieldref           #27.#4043    // ext/mods/Config.PROP_STOP_EXP:Z
  #4043 = NameAndType        #4044:#57    // PROP_STOP_EXP:Z
  #4044 = Utf8               PROP_STOP_EXP
  #4045 = String             #4046        // PropTradeRefusal
  #4046 = Utf8               PropTradeRefusal
  #4047 = Fieldref           #27.#4048    // ext/mods/Config.PROP_TRADE_REFUSAL:Z
  #4048 = NameAndType        #4049:#57    // PROP_TRADE_REFUSAL:Z
  #4049 = Utf8               PROP_TRADE_REFUSAL
  #4050 = String             #4051        // PropAutoLoot
  #4051 = Utf8               PropAutoLoot
  #4052 = Fieldref           #27.#4053    // ext/mods/Config.PROP_AUTO_LOOT:Z
  #4053 = NameAndType        #4054:#57    // PROP_AUTO_LOOT:Z
  #4054 = Utf8               PROP_AUTO_LOOT
  #4055 = String             #4056        // PropBuffProtected
  #4056 = Utf8               PropBuffProtected
  #4057 = Fieldref           #27.#4058    // ext/mods/Config.PROP_BUFF_PROTECTED:Z
  #4058 = NameAndType        #4059:#57    // PROP_BUFF_PROTECTED:Z
  #4059 = Utf8               PROP_BUFF_PROTECTED
  #4060 = String             #4061        // EnabledOnlineCommand
  #4061 = Utf8               EnabledOnlineCommand
  #4062 = Fieldref           #27.#4063    // ext/mods/Config.ENABLE_ONLINE_COMMAND:Z
  #4063 = NameAndType        #4064:#57    // ENABLE_ONLINE_COMMAND:Z
  #4064 = Utf8               ENABLE_ONLINE_COMMAND
  #4065 = String             #4066        // MultiplierOnlineCommand
  #4066 = Utf8               MultiplierOnlineCommand
  #4067 = Fieldref           #27.#4068    // ext/mods/Config.MULTIPLIER_ONLINE_COMMAND:I
  #4068 = NameAndType        #4069:#86    // MULTIPLIER_ONLINE_COMMAND:I
  #4069 = Utf8               MULTIPLIER_ONLINE_COMMAND
  #4070 = String             #4071        // EnableBotsPrevention
  #4071 = Utf8               EnableBotsPrevention
  #4072 = Fieldref           #27.#4073    // ext/mods/Config.BOTS_PREVENTION:Z
  #4073 = NameAndType        #4074:#57    // BOTS_PREVENTION:Z
  #4074 = Utf8               BOTS_PREVENTION
  #4075 = String             #4076        // BotsLogs
  #4076 = Utf8               BotsLogs
  #4077 = Fieldref           #27.#4078    // ext/mods/Config.BOTS_LOGS:Z
  #4078 = NameAndType        #4079:#57    // BOTS_LOGS:Z
  #4079 = Utf8               BOTS_LOGS
  #4080 = String             #4081        // KillsCounter
  #4081 = Utf8               KillsCounter
  #4082 = Fieldref           #27.#4083    // ext/mods/Config.KILLS_COUNTER:I
  #4083 = NameAndType        #4084:#86    // KILLS_COUNTER:I
  #4084 = Utf8               KILLS_COUNTER
  #4085 = String             #4086        // KillsCounterRandomization
  #4086 = Utf8               KillsCounterRandomization
  #4087 = Fieldref           #27.#4088    // ext/mods/Config.KILLS_COUNTER_RANDOMIZATION:I
  #4088 = NameAndType        #4089:#86    // KILLS_COUNTER_RANDOMIZATION:I
  #4089 = Utf8               KILLS_COUNTER_RANDOMIZATION
  #4090 = String             #4091        // ValidationTime
  #4091 = Utf8               ValidationTime
  #4092 = Fieldref           #27.#4093    // ext/mods/Config.VALIDATION_TIME:I
  #4093 = NameAndType        #4094:#86    // VALIDATION_TIME:I
  #4094 = Utf8               VALIDATION_TIME
  #4095 = String             #4096        // Punishment
  #4096 = Utf8               Punishment
  #4097 = Fieldref           #27.#4098    // ext/mods/Config.PUNISHMENT:I
  #4098 = NameAndType        #4099:#86    // PUNISHMENT:I
  #4099 = Utf8               PUNISHMENT
  #4100 = String             #4101        // PunishmentTime
  #4101 = Utf8               PunishmentTime
  #4102 = Fieldref           #27.#4103    // ext/mods/Config.PUNISHMENT_TIME:I
  #4103 = NameAndType        #4104:#86    // PUNISHMENT_TIME:I
  #4104 = Utf8               PUNISHMENT_TIME
  #4105 = String             #4106        // UsePremiumServices
  #4106 = Utf8               UsePremiumServices
  #4107 = Fieldref           #27.#4108    // ext/mods/Config.USE_PREMIUM_SERVICE:Z
  #4108 = NameAndType        #4109:#57    // USE_PREMIUM_SERVICE:Z
  #4109 = Utf8               USE_PREMIUM_SERVICE
  #4110 = String             #4111        // AlternateDropList
  #4111 = Utf8               AlternateDropList
  #4112 = Fieldref           #27.#4113    // ext/mods/Config.ALTERNATE_DROP_LIST:Z
  #4113 = NameAndType        #4114:#57    // ALTERNATE_DROP_LIST:Z
  #4114 = Utf8               ALTERNATE_DROP_LIST
  #4115 = String             #4116        // AttackPTS
  #4116 = Utf8               AttackPTS
  #4117 = Fieldref           #27.#4118    // ext/mods/Config.ATTACK_PTS:Z
  #4118 = NameAndType        #4119:#57    // ATTACK_PTS:Z
  #4119 = Utf8               ATTACK_PTS
  #4120 = String             #4121        // SubClassSkills
  #4121 = Utf8               SubClassSkills
  #4122 = Fieldref           #27.#4123    // ext/mods/Config.SUBCLASS_SKILLS:Z
  #4123 = NameAndType        #4124:#57    // SUBCLASS_SKILLS:Z
  #4124 = Utf8               SUBCLASS_SKILLS
  #4125 = String             #4126        // SubclassEverywhere
  #4126 = Utf8               SubclassEverywhere
  #4127 = Fieldref           #27.#4128    // ext/mods/Config.GAME_SUBCLASS_EVERYWHERE:Z
  #4128 = NameAndType        #4129:#57    // GAME_SUBCLASS_EVERYWHERE:Z
  #4129 = Utf8               GAME_SUBCLASS_EVERYWHERE
  #4130 = String             #4131        // ShowNpcInfo
  #4131 = Utf8               ShowNpcInfo
  #4132 = Fieldref           #27.#4133    // ext/mods/Config.SHOW_NPC_INFO:Z
  #4133 = NameAndType        #4134:#57    // SHOW_NPC_INFO:Z
  #4134 = Utf8               SHOW_NPC_INFO
  #4135 = String             #4136        // AllowGrandBossesTeleport
  #4136 = Utf8               AllowGrandBossesTeleport
  #4137 = Fieldref           #27.#4138    // ext/mods/Config.ALLOW_GRAND_BOSSES_TELEPORT:Z
  #4138 = NameAndType        #4139:#57    // ALLOW_GRAND_BOSSES_TELEPORT:Z
  #4139 = Utf8               ALLOW_GRAND_BOSSES_TELEPORT
  #4140 = String             #4141        // UseChatFilter
  #4141 = Utf8               UseChatFilter
  #4142 = Fieldref           #27.#4143    // ext/mods/Config.USE_SAY_FILTER:Z
  #4143 = NameAndType        #4144:#57    // USE_SAY_FILTER:Z
  #4144 = Utf8               USE_SAY_FILTER
  #4145 = String             #4146        // ChatFilterChars
  #4146 = Utf8               ChatFilterChars
  #4147 = String             #4148        // ^_^
  #4148 = Utf8               ^_^
  #4149 = Fieldref           #27.#4150    // ext/mods/Config.CHAT_FILTER_CHARS:Ljava/lang/String;
  #4150 = NameAndType        #4151:#43    // CHAT_FILTER_CHARS:Ljava/lang/String;
  #4151 = Utf8               CHAT_FILTER_CHARS
  #4152 = Fieldref           #27.#4153    // ext/mods/Config.CHAT_FILTER_FILE:Ljava/lang/String;
  #4153 = NameAndType        #4154:#43    // CHAT_FILTER_FILE:Ljava/lang/String;
  #4154 = Utf8               CHAT_FILTER_FILE
  #4155 = Methodref          #4156.#4157  // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #4156 = Class              #4158        // java/nio/file/Paths
  #4157 = NameAndType        #1390:#4159  // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #4158 = Utf8               java/nio/file/Paths
  #4159 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #4160 = Fieldref           #4161.#4162  // java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
  #4161 = Class              #4163        // java/nio/charset/StandardCharsets
  #4162 = NameAndType        #4164:#2181  // UTF_8:Ljava/nio/charset/Charset;
  #4163 = Utf8               java/nio/charset/StandardCharsets
  #4164 = Utf8               UTF_8
  #4165 = Methodref          #4166.#4167  // java/nio/file/Files.lines:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/stream/Stream;
  #4166 = Class              #4168        // java/nio/file/Files
  #4167 = NameAndType        #4169:#4170  // lines:(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/stream/Stream;
  #4168 = Utf8               java/nio/file/Files
  #4169 = Utf8               lines
  #4170 = Utf8               (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/stream/Stream;
  #4171 = InvokeDynamic      #14:#2150    // #14:apply:()Ljava/util/function/Function;
  #4172 = InvokeDynamic      #15:#4173    // #15:test:()Ljava/util/function/Predicate;
  #4173 = NameAndType        #4174:#4175  // test:()Ljava/util/function/Predicate;
  #4174 = Utf8               test
  #4175 = Utf8               ()Ljava/util/function/Predicate;
  #4176 = InterfaceMethodref #429.#4177   // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #4177 = NameAndType        #4178:#4179  // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #4178 = Utf8               filter
  #4179 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #4180 = Fieldref           #27.#4181    // ext/mods/Config.FILTER_LIST:Ljava/util/List;
  #4181 = NameAndType        #4182:#1221  // FILTER_LIST:Ljava/util/List;
  #4182 = Utf8               FILTER_LIST
  #4183 = InterfaceMethodref #409.#1398   // java/util/List.size:()I
  #4184 = InvokeDynamic      #16:#4185    // #16:makeConcatWithConstants:(I)Ljava/lang/String;
  #4185 = NameAndType        #228:#225    // makeConcatWithConstants:(I)Ljava/lang/String;
  #4186 = Methodref          #35.#4187    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #4187 = NameAndType        #4188:#1225  // info:(Ljava/lang/Object;)V
  #4188 = Utf8               info
  #4189 = InterfaceMethodref #429.#2242   // java/util/stream/Stream.close:()V
  #4190 = Class              #4191        // java/io/IOException
  #4191 = Utf8               java/io/IOException
  #4192 = String             #4193        // Error while loading chat filter words!
  #4193 = Utf8               Error while loading chat filter words!
  #4194 = Methodref          #35.#4195    // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #4195 = NameAndType        #418:#4196   // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #4196 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #4197 = String             #4198        // CabalBuffer
  #4198 = Utf8               CabalBuffer
  #4199 = Fieldref           #27.#4200    // ext/mods/Config.CABAL_BUFFER:Z
  #4200 = NameAndType        #4201:#57    // CABAL_BUFFER:Z
  #4201 = Utf8               CABAL_BUFFER
  #4202 = String             #4203        // SuperHaste
  #4203 = Utf8               SuperHaste
  #4204 = Fieldref           #27.#4205    // ext/mods/Config.SUPER_HASTE:Z
  #4205 = NameAndType        #4206:#57    // SUPER_HASTE:Z
  #4206 = Utf8               SUPER_HASTE
  #4207 = String             #4208        // ListOfRestrictedCharNames
  #4208 = Utf8               ListOfRestrictedCharNames
  #4209 = Fieldref           #27.#4210    // ext/mods/Config.RESTRICTED_CHAR_NAMES:Ljava/lang/String;
  #4210 = NameAndType        #4211:#43    // RESTRICTED_CHAR_NAMES:Ljava/lang/String;
  #4211 = Utf8               RESTRICTED_CHAR_NAMES
  #4212 = Fieldref           #27.#4213    // ext/mods/Config.LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
  #4213 = NameAndType        #4214:#1221  // LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
  #4214 = Utf8               LIST_RESTRICTED_CHAR_NAMES
  #4215 = Methodref          #215.#4216   // java/lang/String.toLowerCase:()Ljava/lang/String;
  #4216 = NameAndType        #4217:#380   // toLowerCase:()Ljava/lang/String;
  #4217 = Utf8               toLowerCase
  #4218 = String             #4219        // FakeOnlineAmount
  #4219 = Utf8               FakeOnlineAmount
  #4220 = Fieldref           #27.#4221    // ext/mods/Config.FAKE_ONLINE_AMOUNT:I
  #4221 = NameAndType        #4222:#86    // FAKE_ONLINE_AMOUNT:I
  #4222 = Utf8               FAKE_ONLINE_AMOUNT
  #4223 = String             #4224        // PremiumBuffsCategory
  #4224 = Utf8               PremiumBuffsCategory
  #4225 = Fieldref           #27.#4226    // ext/mods/Config.BUFFS_CATEGORY:Ljava/lang/String;
  #4226 = NameAndType        #4227:#43    // BUFFS_CATEGORY:Ljava/lang/String;
  #4227 = Utf8               BUFFS_CATEGORY
  #4228 = Fieldref           #27.#4229    // ext/mods/Config.PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #4229 = NameAndType        #4230:#1221  // PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
  #4230 = Utf8               PREMIUM_BUFFS_CATEGORY
  #4231 = String             #4232        // AntiFeedEnable
  #4232 = Utf8               AntiFeedEnable
  #4233 = Fieldref           #27.#4234    // ext/mods/Config.ANTIFEED_ENABLE:Z
  #4234 = NameAndType        #4235:#57    // ANTIFEED_ENABLE:Z
  #4235 = Utf8               ANTIFEED_ENABLE
  #4236 = String             #4237        // AntiFeedDualbox
  #4237 = Utf8               AntiFeedDualbox
  #4238 = Fieldref           #27.#4239    // ext/mods/Config.ANTIFEED_DUALBOX:Z
  #4239 = NameAndType        #4240:#57    // ANTIFEED_DUALBOX:Z
  #4240 = Utf8               ANTIFEED_DUALBOX
  #4241 = String             #4242        // AntiFeedDisconnectedAsDualbox
  #4242 = Utf8               AntiFeedDisconnectedAsDualbox
  #4243 = Fieldref           #27.#4244    // ext/mods/Config.ANTIFEED_DISCONNECTED_AS_DUALBOX:Z
  #4244 = NameAndType        #4245:#57    // ANTIFEED_DISCONNECTED_AS_DUALBOX:Z
  #4245 = Utf8               ANTIFEED_DISCONNECTED_AS_DUALBOX
  #4246 = String             #4247        // AntiFeedInterval
  #4247 = Utf8               AntiFeedInterval
  #4248 = Fieldref           #27.#4249    // ext/mods/Config.ANTIFEED_INTERVAL:I
  #4249 = NameAndType        #4250:#86    // ANTIFEED_INTERVAL:I
  #4250 = Utf8               ANTIFEED_INTERVAL
  #4251 = String             #4252        // DualboxCheckMaxPlayersPerIP
  #4252 = Utf8               DualboxCheckMaxPlayersPerIP
  #4253 = Fieldref           #27.#4254    // ext/mods/Config.DUALBOX_CHECK_MAX_PLAYERS_PER_IP:I
  #4254 = NameAndType        #4255:#86    // DUALBOX_CHECK_MAX_PLAYERS_PER_IP:I
  #4255 = Utf8               DUALBOX_CHECK_MAX_PLAYERS_PER_IP
  #4256 = String             #4257        // DualboxCheckMaxOlympiadParticipantsPerIP
  #4257 = Utf8               DualboxCheckMaxOlympiadParticipantsPerIP
  #4258 = Fieldref           #27.#4259    // ext/mods/Config.DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
  #4259 = NameAndType        #4260:#86    // DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP:I
  #4260 = Utf8               DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP
  #4261 = String             #4262        // AutoLootItemIds
  #4262 = Utf8               AutoLootItemIds
  #4263 = String             #4264        // 0
  #4264 = Utf8               0
  #4265 = Fieldref           #27.#4266    // ext/mods/Config.AUTO_LOOT_ITEM_IDS:Ljava/util/List;
  #4266 = NameAndType        #4267:#1221  // AUTO_LOOT_ITEM_IDS:Ljava/util/List;
  #4267 = Utf8               AUTO_LOOT_ITEM_IDS
  #4268 = InvokeDynamic      #17:#227     // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #4269 = String             #4270        // HitTime
  #4270 = Utf8               HitTime
  #4271 = Fieldref           #27.#4272    // ext/mods/Config.HIT_TIME:Z
  #4272 = NameAndType        #4273:#57    // HIT_TIME:Z
  #4273 = Utf8               HIT_TIME
  #4274 = String             #4275        // ShowRaidHtm
  #4275 = Utf8               ShowRaidHtm
  #4276 = Fieldref           #27.#4277    // ext/mods/Config.SHOW_RAID_HTM:Z
  #4277 = NameAndType        #4278:#57    // SHOW_RAID_HTM:Z
  #4278 = Utf8               SHOW_RAID_HTM
  #4279 = String             #4280        // ShowEpicHtm
  #4280 = Utf8               ShowEpicHtm
  #4281 = Fieldref           #27.#4282    // ext/mods/Config.SHOW_EPIC_HTM:Z
  #4282 = NameAndType        #4283:#57    // SHOW_EPIC_HTM:Z
  #4283 = Utf8               SHOW_EPIC_HTM
  #4284 = String             #4285        // UseConfigRaidGrandBossRespawn
  #4285 = Utf8               UseConfigRaidGrandBossRespawn
  #4286 = Fieldref           #27.#4287    // ext/mods/Config.USE_CONFIG_RAID_GRAND_BOSS_RESPAWN:Z
  #4287 = NameAndType        #4288:#57    // USE_CONFIG_RAID_GRAND_BOSS_RESPAWN:Z
  #4288 = Utf8               USE_CONFIG_RAID_GRAND_BOSS_RESPAWN
  #4289 = String             #4290        // RaidBossRespawn
  #4290 = Utf8               RaidBossRespawn
  #4291 = Methodref          #27.#4292    // ext/mods/Config.parseBossRespawn:(Ljava/lang/String;)[J
  #4292 = NameAndType        #4293:#4294  // parseBossRespawn:(Ljava/lang/String;)[J
  #4293 = Utf8               parseBossRespawn
  #4294 = Utf8               (Ljava/lang/String;)[J
  #4295 = Fieldref           #27.#4296    // ext/mods/Config.RAID_BOSS_RESPAWN_BASE_MS:J
  #4296 = NameAndType        #4297:#120   // RAID_BOSS_RESPAWN_BASE_MS:J
  #4297 = Utf8               RAID_BOSS_RESPAWN_BASE_MS
  #4298 = Fieldref           #27.#4299    // ext/mods/Config.RAID_BOSS_RESPAWN_RANDOM_MS:J
  #4299 = NameAndType        #4300:#120   // RAID_BOSS_RESPAWN_RANDOM_MS:J
  #4300 = Utf8               RAID_BOSS_RESPAWN_RANDOM_MS
  #4301 = String             #4302        // GrandBossRespawn
  #4302 = Utf8               GrandBossRespawn
  #4303 = Fieldref           #27.#4304    // ext/mods/Config.GRAND_BOSS_RESPAWN_BASE_MS:J
  #4304 = NameAndType        #4305:#120   // GRAND_BOSS_RESPAWN_BASE_MS:J
  #4305 = Utf8               GRAND_BOSS_RESPAWN_BASE_MS
  #4306 = Fieldref           #27.#4307    // ext/mods/Config.GRAND_BOSS_RESPAWN_RANDOM_MS:J
  #4307 = NameAndType        #4308:#120   // GRAND_BOSS_RESPAWN_RANDOM_MS:J
  #4308 = Utf8               GRAND_BOSS_RESPAWN_RANDOM_MS
  #4309 = String             #4310        // RaidBossRespawnById
  #4310 = Utf8               RaidBossRespawnById
  #4311 = Methodref          #27.#4312    // ext/mods/Config.parseBossRespawnOverrides:(Ljava/lang/String;)Ljava/util/Map;
  #4312 = NameAndType        #4313:#4314  // parseBossRespawnOverrides:(Ljava/lang/String;)Ljava/util/Map;
  #4313 = Utf8               parseBossRespawnOverrides
  #4314 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
  #4315 = Fieldref           #27.#4316    // ext/mods/Config.RAID_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #4316 = NameAndType        #4317:#1247  // RAID_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #4317 = Utf8               RAID_BOSS_RESPAWN_OVERRIDES
  #4318 = String             #4319        // GrandBossRespawnById
  #4319 = Utf8               GrandBossRespawnById
  #4320 = Fieldref           #27.#4321    // ext/mods/Config.GRAND_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #4321 = NameAndType        #4322:#1247  // GRAND_BOSS_RESPAWN_OVERRIDES:Ljava/util/Map;
  #4322 = Utf8               GRAND_BOSS_RESPAWN_OVERRIDES
  #4323 = String             #4324        // RaidBossTeleportEnabled
  #4324 = Utf8               RaidBossTeleportEnabled
  #4325 = Fieldref           #27.#4326    // ext/mods/Config.RAID_BOSS_TELEPORT_ENABLED:Z
  #4326 = NameAndType        #4327:#57    // RAID_BOSS_TELEPORT_ENABLED:Z
  #4327 = Utf8               RAID_BOSS_TELEPORT_ENABLED
  #4328 = String             #4329        // EpicBossTeleportEnabled
  #4329 = Utf8               EpicBossTeleportEnabled
  #4330 = Fieldref           #27.#4331    // ext/mods/Config.EPIC_BOSS_TELEPORT_ENABLED:Z
  #4331 = NameAndType        #4332:#57    // EPIC_BOSS_TELEPORT_ENABLED:Z
  #4332 = Utf8               EPIC_BOSS_TELEPORT_ENABLED
  #4333 = String             #4334        // BossTeleportMinRange
  #4334 = Utf8               BossTeleportMinRange
  #4335 = Fieldref           #27.#4336    // ext/mods/Config.BOSS_TELEPORT_MIN_RANGE:I
  #4336 = NameAndType        #4337:#86    // BOSS_TELEPORT_MIN_RANGE:I
  #4337 = Utf8               BOSS_TELEPORT_MIN_RANGE
  #4338 = String             #4339        // BossTeleportMaxRange
  #4339 = Utf8               BossTeleportMaxRange
  #4340 = Fieldref           #27.#4341    // ext/mods/Config.BOSS_TELEPORT_MAX_RANGE:I
  #4341 = NameAndType        #4342:#86    // BOSS_TELEPORT_MAX_RANGE:I
  #4342 = Utf8               BOSS_TELEPORT_MAX_RANGE
  #4343 = String             #4344        // BossTeleportItemId
  #4344 = Utf8               BossTeleportItemId
  #4345 = Fieldref           #27.#4346    // ext/mods/Config.BOSS_TELEPORT_ITEM_ID:I
  #4346 = NameAndType        #4347:#86    // BOSS_TELEPORT_ITEM_ID:I
  #4347 = Utf8               BOSS_TELEPORT_ITEM_ID
  #4348 = String             #4349        // BossTeleportItemCount
  #4349 = Utf8               BossTeleportItemCount
  #4350 = Fieldref           #27.#4351    // ext/mods/Config.BOSS_TELEPORT_ITEM_COUNT:J
  #4351 = NameAndType        #4352:#120   // BOSS_TELEPORT_ITEM_COUNT:J
  #4352 = Utf8               BOSS_TELEPORT_ITEM_COUNT
  #4353 = String             #4354        // TimeZone
  #4354 = Utf8               TimeZone
  #4355 = String             #4356        // GMT+2
  #4356 = Utf8               GMT+2
  #4357 = Fieldref           #27.#4358    // ext/mods/Config.TIME_ZONE:Ljava/lang/String;
  #4358 = NameAndType        #4359:#43    // TIME_ZONE:Ljava/lang/String;
  #4359 = Utf8               TIME_ZONE
  #4360 = String             #4361        // DateFormat
  #4361 = Utf8               DateFormat
  #4362 = String             #4363        // E MMM dd HH:mm yyyy \'GMT+2\'
  #4363 = Utf8               E MMM dd HH:mm yyyy \'GMT+2\'
  #4364 = Fieldref           #27.#4365    // ext/mods/Config.DATE_FORMAT:Ljava/lang/String;
  #4365 = NameAndType        #4366:#43    // DATE_FORMAT:Ljava/lang/String;
  #4366 = Utf8               DATE_FORMAT
  #4367 = String             #4368        // CustomBufferManagerNpc
  #4368 = Utf8               CustomBufferManagerNpc
  #4369 = Fieldref           #27.#4370    // ext/mods/Config.CUSTOM_BUFFER_MANAGER_NPC:Z
  #4370 = NameAndType        #4371:#57    // CUSTOM_BUFFER_MANAGER_NPC:Z
  #4371 = Utf8               CUSTOM_BUFFER_MANAGER_NPC
  #4372 = String             #4373        // SkipCategory
  #4373 = Utf8               SkipCategory
  #4374 = Fieldref           #27.#4375    // ext/mods/Config.SKIP_CATEGORY:[Ljava/lang/String;
  #4375 = NameAndType        #4376:#1039  // SKIP_CATEGORY:[Ljava/lang/String;
  #4376 = Utf8               SKIP_CATEGORY
  #4377 = String             #4378        // Barakiel
  #4378 = Utf8               Barakiel
  #4379 = Fieldref           #27.#4380    // ext/mods/Config.BARAKIEL:Z
  #4380 = NameAndType        #4381:#57    // BARAKIEL:Z
  #4381 = Utf8               BARAKIEL
  #4382 = String             #4383        // CreatureSee
  #4383 = Utf8               CreatureSee
  #4384 = Fieldref           #27.#4385    // ext/mods/Config.CREATURE_SEE:Z
  #4385 = NameAndType        #4386:#57    // CREATURE_SEE:Z
  #4386 = Utf8               CREATURE_SEE
  #4387 = String             #4388        // NewRegen
  #4388 = Utf8               NewRegen
  #4389 = Fieldref           #27.#4390    // ext/mods/Config.NEW_REGEN:Z
  #4390 = NameAndType        #4391:#57    // NEW_REGEN:Z
  #4391 = Utf8               NEW_REGEN
  #4392 = String             #4393        // CatacombsInAnyPeriod
  #4393 = Utf8               CatacombsInAnyPeriod
  #4394 = Fieldref           #27.#4395    // ext/mods/Config.CATACOMBS_IN_ANY_PERIOD:Z
  #4395 = NameAndType        #4396:#57    // CATACOMBS_IN_ANY_PERIOD:Z
  #4396 = Utf8               CATACOMBS_IN_ANY_PERIOD
  #4397 = String             #4398        // StrictSevenSigns
  #4398 = Utf8               StrictSevenSigns
  #4399 = Fieldref           #27.#4400    // ext/mods/Config.STRICT_SEVENSIGNS:Z
  #4400 = NameAndType        #4401:#57    // STRICT_SEVENSIGNS:Z
  #4401 = Utf8               STRICT_SEVENSIGNS
  #4402 = String             #4403        // ClassOverlord
  #4403 = Utf8               ClassOverlord
  #4404 = Fieldref           #27.#4405    // ext/mods/Config.CLASS_OVERLORD:Z
  #4405 = NameAndType        #4406:#57    // CLASS_OVERLORD:Z
  #4406 = Utf8               CLASS_OVERLORD
  #4407 = String             #4408        // RaceElf
  #4408 = Utf8               RaceElf
  #4409 = Fieldref           #27.#4410    // ext/mods/Config.RACE_ELF:Z
  #4410 = NameAndType        #4411:#57    // RACE_ELF:Z
  #4411 = Utf8               RACE_ELF
  #4412 = String             #4413        // RestrictedClasses
  #4413 = Utf8               RestrictedClasses
  #4414 = Fieldref           #27.#4415    // ext/mods/Config.RESTRICTED_CLASSES:Z
  #4415 = NameAndType        #4416:#57    // RESTRICTED_CLASSES:Z
  #4416 = Utf8               RESTRICTED_CLASSES
  #4417 = String             #4418        // BankingEnabled
  #4418 = Utf8               BankingEnabled
  #4419 = Fieldref           #27.#4420    // ext/mods/Config.ENABLE_COMMAND_GOLDBAR:Z
  #4420 = NameAndType        #4421:#57    // ENABLE_COMMAND_GOLDBAR:Z
  #4421 = Utf8               ENABLE_COMMAND_GOLDBAR
  #4422 = String             #4423        // BankingGoldbarCount
  #4423 = Utf8               BankingGoldbarCount
  #4424 = Fieldref           #27.#4425    // ext/mods/Config.BANKING_SYSTEM_GOLDBARS:I
  #4425 = NameAndType        #4426:#86    // BANKING_SYSTEM_GOLDBARS:I
  #4426 = Utf8               BANKING_SYSTEM_GOLDBARS
  #4427 = String             #4428        // BankingAdenaCount
  #4428 = Utf8               BankingAdenaCount
  #4429 = Fieldref           #27.#4430    // ext/mods/Config.BANKING_SYSTEM_ADENA:I
  #4430 = NameAndType        #4431:#86    // BANKING_SYSTEM_ADENA:I
  #4431 = Utf8               BANKING_SYSTEM_ADENA
  #4432 = String             #4433        // AutoPotionsEnabled
  #4433 = Utf8               AutoPotionsEnabled
  #4434 = Fieldref           #27.#4435    // ext/mods/Config.AUTO_POTIONS_ENABLED:Z
  #4435 = NameAndType        #4436:#57    // AUTO_POTIONS_ENABLED:Z
  #4436 = Utf8               AUTO_POTIONS_ENABLED
  #4437 = String             #4438        // AutoPotionsInOlympiad
  #4438 = Utf8               AutoPotionsInOlympiad
  #4439 = Fieldref           #27.#4440    // ext/mods/Config.AUTO_POTIONS_IN_OLYMPIAD:Z
  #4440 = NameAndType        #4441:#57    // AUTO_POTIONS_IN_OLYMPIAD:Z
  #4441 = Utf8               AUTO_POTIONS_IN_OLYMPIAD
  #4442 = String             #4443        // AutoPotionMinimumLevel
  #4443 = Utf8               AutoPotionMinimumLevel
  #4444 = Fieldref           #27.#4445    // ext/mods/Config.AUTO_POTION_MIN_LEVEL:I
  #4445 = NameAndType        #4446:#86    // AUTO_POTION_MIN_LEVEL:I
  #4446 = Utf8               AUTO_POTION_MIN_LEVEL
  #4447 = String             #4448        // AcpPeriod
  #4448 = Utf8               AcpPeriod
  #4449 = Fieldref           #27.#4450    // ext/mods/Config.ACP_PERIOD:I
  #4450 = NameAndType        #4451:#86    // ACP_PERIOD:I
  #4451 = Utf8               ACP_PERIOD
  #4452 = String             #4453        // AutoCpEnabled
  #4453 = Utf8               AutoCpEnabled
  #4454 = Fieldref           #27.#4455    // ext/mods/Config.AUTO_CP_ENABLED:Z
  #4455 = NameAndType        #4456:#57    // AUTO_CP_ENABLED:Z
  #4456 = Utf8               AUTO_CP_ENABLED
  #4457 = String             #4458        // AutoHpEnabled
  #4458 = Utf8               AutoHpEnabled
  #4459 = Fieldref           #27.#4460    // ext/mods/Config.AUTO_HP_ENABLED:Z
  #4460 = NameAndType        #4461:#57    // AUTO_HP_ENABLED:Z
  #4461 = Utf8               AUTO_HP_ENABLED
  #4462 = String             #4463        // AutoMpEnabled
  #4463 = Utf8               AutoMpEnabled
  #4464 = Fieldref           #27.#4465    // ext/mods/Config.AUTO_MP_ENABLED:Z
  #4465 = NameAndType        #4466:#57    // AUTO_MP_ENABLED:Z
  #4466 = Utf8               AUTO_MP_ENABLED
  #4467 = Fieldref           #27.#4468    // ext/mods/Config.AUTO_CP_ITEM_IDS:Ljava/util/Set;
  #4468 = NameAndType        #4469:#453   // AUTO_CP_ITEM_IDS:Ljava/util/Set;
  #4469 = Utf8               AUTO_CP_ITEM_IDS
  #4470 = String             #4471        // AutoCpItemIds
  #4471 = Utf8               AutoCpItemIds
  #4472 = Fieldref           #27.#4473    // ext/mods/Config.AUTO_HP_ITEM_IDS:Ljava/util/Set;
  #4473 = NameAndType        #4474:#453   // AUTO_HP_ITEM_IDS:Ljava/util/Set;
  #4474 = Utf8               AUTO_HP_ITEM_IDS
  #4475 = String             #4476        // AutoHpItemIds
  #4476 = Utf8               AutoHpItemIds
  #4477 = Fieldref           #27.#4478    // ext/mods/Config.AUTO_MP_ITEM_IDS:Ljava/util/Set;
  #4478 = NameAndType        #4479:#453   // AUTO_MP_ITEM_IDS:Ljava/util/Set;
  #4479 = Utf8               AUTO_MP_ITEM_IDS
  #4480 = String             #4481        // AutoMpItemIds
  #4481 = Utf8               AutoMpItemIds
  #4482 = String             #4483        // MultisellMaxAmount
  #4483 = Utf8               MultisellMaxAmount
  #4484 = Fieldref           #27.#4485    // ext/mods/Config.MULTISELL_MAX_AMOUNT:I
  #4485 = NameAndType        #4486:#86    // MULTISELL_MAX_AMOUNT:I
  #4486 = Utf8               MULTISELL_MAX_AMOUNT
  #4487 = String             #4488        // EnabledAuction
  #4488 = Utf8               EnabledAuction
  #4489 = Fieldref           #27.#4490    // ext/mods/Config.ENABLED_AUCTION:Z
  #4490 = NameAndType        #4491:#57    // ENABLED_AUCTION:Z
  #4491 = Utf8               ENABLED_AUCTION
  #4492 = String             #4493        // AuctionLimitItem
  #4493 = Utf8               AuctionLimitItem
  #4494 = Fieldref           #27.#4495    // ext/mods/Config.AUCTION_LIMIT_ITEM:I
  #4495 = NameAndType        #4496:#86    // AUCTION_LIMIT_ITEM:I
  #4496 = Utf8               AUCTION_LIMIT_ITEM
  #4497 = String             #4498        // AuctionFee
  #4498 = Utf8               AuctionFee
  #4499 = Fieldref           #27.#4500    // ext/mods/Config.AUCTION_FEE:I
  #4500 = NameAndType        #4501:#86    // AUCTION_FEE:I
  #4501 = Utf8               AUCTION_FEE
  #4502 = String             #4503        // AuctionItemFee
  #4503 = Utf8               AuctionItemFee
  #4504 = Fieldref           #27.#4505    // ext/mods/Config.AUCTION_ITEM_FEE:I
  #4505 = NameAndType        #4506:#86    // AUCTION_ITEM_FEE:I
  #4506 = Utf8               AUCTION_ITEM_FEE
  #4507 = String             #4508        // AuctionItemFeeName
  #4508 = Utf8               AuctionItemFeeName
  #4509 = String             #4510        // Adena
  #4510 = Utf8               Adena
  #4511 = Fieldref           #27.#4512    // ext/mods/Config.AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
  #4512 = NameAndType        #4513:#43    // AUCTION_ITEM_FEE_NAME:Ljava/lang/String;
  #4513 = Utf8               AUCTION_ITEM_FEE_NAME
  #4514 = String             #4515        // AutoFarmEnabled
  #4515 = Utf8               AutoFarmEnabled
  #4516 = Fieldref           #27.#4517    // ext/mods/Config.AUTOFARM_ENABLED:Z
  #4517 = NameAndType        #4518:#57    // AUTOFARM_ENABLED:Z
  #4518 = Utf8               AUTOFARM_ENABLED
  #4519 = String             #4520        // MaxZoneArea
  #4520 = Utf8               MaxZoneArea
  #4521 = Integer            7000000
  #4522 = Fieldref           #27.#4523    // ext/mods/Config.AUTOFARM_MAX_ZONE_AREA:I
  #4523 = NameAndType        #4524:#86    // AUTOFARM_MAX_ZONE_AREA:I
  #4524 = Utf8               AUTOFARM_MAX_ZONE_AREA
  #4525 = String             #4526        // MaxRoutePerimeter
  #4526 = Utf8               MaxRoutePerimeter
  #4527 = Fieldref           #27.#4528    // ext/mods/Config.AUTOFARM_MAX_ROUTE_PERIMITER:I
  #4528 = NameAndType        #4529:#86    // AUTOFARM_MAX_ROUTE_PERIMITER:I
  #4529 = Utf8               AUTOFARM_MAX_ROUTE_PERIMITER
  #4530 = String             #4531        // MaxOpenRadius
  #4531 = Utf8               MaxOpenRadius
  #4532 = Fieldref           #27.#4533    // ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
  #4533 = NameAndType        #4534:#86    // AUTOFARM_MAX_OPEN_RADIUS:I
  #4534 = Utf8               AUTOFARM_MAX_OPEN_RADIUS
  #4535 = String             #4536        // MaxZones
  #4536 = Utf8               MaxZones
  #4537 = Fieldref           #27.#4538    // ext/mods/Config.AUTOFARM_MAX_ZONES:I
  #4538 = NameAndType        #4539:#86    // AUTOFARM_MAX_ZONES:I
  #4539 = Utf8               AUTOFARM_MAX_ZONES
  #4540 = String             #4541        // MaxRoutes
  #4541 = Utf8               MaxRoutes
  #4542 = Fieldref           #27.#4543    // ext/mods/Config.AUTOFARM_MAX_ROUTES:I
  #4543 = NameAndType        #4544:#86    // AUTOFARM_MAX_ROUTES:I
  #4544 = Utf8               AUTOFARM_MAX_ROUTES
  #4545 = String             #4546        // MaxZoneNodes
  #4546 = Utf8               MaxZoneNodes
  #4547 = Fieldref           #27.#4548    // ext/mods/Config.AUTOFARM_MAX_ZONE_NODES:I
  #4548 = NameAndType        #4549:#86    // AUTOFARM_MAX_ZONE_NODES:I
  #4549 = Utf8               AUTOFARM_MAX_ZONE_NODES
  #4550 = String             #4551        // MaxRouteNodes
  #4551 = Utf8               MaxRouteNodes
  #4552 = Fieldref           #27.#4553    // ext/mods/Config.AUTOFARM_MAX_ROUTE_NODES:I
  #4553 = NameAndType        #4554:#86    // AUTOFARM_MAX_ROUTE_NODES:I
  #4554 = Utf8               AUTOFARM_MAX_ROUTE_NODES
  #4555 = String             #4556        // MaxTimer
  #4556 = Utf8               MaxTimer
  #4557 = Fieldref           #27.#4558    // ext/mods/Config.AUTOFARM_MAX_TIMER:I
  #4558 = NameAndType        #4559:#86    // AUTOFARM_MAX_TIMER:I
  #4559 = Utf8               AUTOFARM_MAX_TIMER
  #4560 = String             #4561        // HpHealRate
  #4561 = Utf8               HpHealRate
  #4562 = Double             100.0d
  #4564 = Fieldref           #27.#4565    // ext/mods/Config.AUTOFARM_HP_HEAL_RATE:D
  #4565 = NameAndType        #4566:#365   // AUTOFARM_HP_HEAL_RATE:D
  #4566 = Utf8               AUTOFARM_HP_HEAL_RATE
  #4567 = String             #4568        // MpHealRate
  #4568 = Utf8               MpHealRate
  #4569 = Fieldref           #27.#4570    // ext/mods/Config.AUTOFARM_MP_HEAL_RATE:D
  #4570 = NameAndType        #4571:#365   // AUTOFARM_MP_HEAL_RATE:D
  #4571 = Utf8               AUTOFARM_MP_HEAL_RATE
  #4572 = String             #4573        // DebuffChance
  #4573 = Utf8               DebuffChance
  #4574 = Fieldref           #27.#4575    // ext/mods/Config.AUTOFARM_DEBUFF_CHANCE:I
  #4575 = NameAndType        #4576:#86    // AUTOFARM_DEBUFF_CHANCE:I
  #4576 = Utf8               AUTOFARM_DEBUFF_CHANCE
  #4577 = String             #4578        // HpPotions
  #4578 = Utf8               HpPotions
  #4579 = Fieldref           #27.#4580    // ext/mods/Config.AUTOFARM_HP_POTIONS:[I
  #4580 = NameAndType        #4581:#388   // AUTOFARM_HP_POTIONS:[I
  #4581 = Utf8               AUTOFARM_HP_POTIONS
  #4582 = String             #4583        // MpPotions
  #4583 = Utf8               MpPotions
  #4584 = Fieldref           #27.#4585    // ext/mods/Config.AUTOFARM_MP_POTIONS:[I
  #4585 = NameAndType        #4586:#388   // AUTOFARM_MP_POTIONS:[I
  #4586 = Utf8               AUTOFARM_MP_POTIONS
  #4587 = String             #4588        // AllowDualbox
  #4588 = Utf8               AllowDualbox
  #4589 = Fieldref           #27.#4590    // ext/mods/Config.AUTOFARM_ALLOW_DUALBOX:Z
  #4590 = NameAndType        #4591:#57    // AUTOFARM_ALLOW_DUALBOX:Z
  #4591 = Utf8               AUTOFARM_ALLOW_DUALBOX
  #4592 = String             #4593        // DisableTown
  #4593 = Utf8               DisableTown
  #4594 = Fieldref           #27.#4595    // ext/mods/Config.AUTOFARM_DISABLE_TOWN:Z
  #4595 = NameAndType        #4596:#57    // AUTOFARM_DISABLE_TOWN:Z
  #4596 = Utf8               AUTOFARM_DISABLE_TOWN
  #4597 = String             #4598        // SendLogMessages
  #4598 = Utf8               SendLogMessages
  #4599 = Fieldref           #27.#4600    // ext/mods/Config.AUTOFARM_SEND_LOG_MESSAGES:Z
  #4600 = NameAndType        #4601:#57    // AUTOFARM_SEND_LOG_MESSAGES:Z
  #4601 = Utf8               AUTOFARM_SEND_LOG_MESSAGES
  #4602 = String             #4603        // ChangePlayerTitle
  #4603 = Utf8               ChangePlayerTitle
  #4604 = Fieldref           #27.#4605    // ext/mods/Config.AUTOFARM_CHANGE_PLAYER_TITLE:Z
  #4605 = NameAndType        #4606:#57    // AUTOFARM_CHANGE_PLAYER_TITLE:Z
  #4606 = Utf8               AUTOFARM_CHANGE_PLAYER_TITLE
  #4607 = String             #4608        // ChangePlayerNameColor
  #4608 = Utf8               ChangePlayerNameColor
  #4609 = Fieldref           #27.#4610    // ext/mods/Config.AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
  #4610 = NameAndType        #4611:#57    // AUTOFARM_CHANGE_PLAYER_NAME_COLOR:Z
  #4611 = Utf8               AUTOFARM_CHANGE_PLAYER_NAME_COLOR
  #4612 = String             #4613        // PlayerNameColor
  #4613 = Utf8               PlayerNameColor
  #4614 = String             #4615        // 000000
  #4615 = Utf8               000000
  #4616 = Fieldref           #27.#4617    // ext/mods/Config.AUTOFARM_PLAYER_NAME_COLOR:Ljava/lang/String;
  #4617 = NameAndType        #4618:#43    // AUTOFARM_PLAYER_NAME_COLOR:Ljava/lang/String;
  #4618 = Utf8               AUTOFARM_PLAYER_NAME_COLOR
  #4619 = String             #4620        // DebugAutoFarmReturn
  #4620 = Utf8               DebugAutoFarmReturn
  #4621 = Fieldref           #27.#4622    // ext/mods/Config.AUTOFARM_DEBUG_RETURN:Z
  #4622 = NameAndType        #4623:#57    // AUTOFARM_DEBUG_RETURN:Z
  #4623 = Utf8               AUTOFARM_DEBUG_RETURN
  #4624 = String             #4625        // EnableOfflineFarmCommand
  #4625 = Utf8               EnableOfflineFarmCommand
  #4626 = Fieldref           #27.#4627    // ext/mods/Config.ENABLE_OFFLINE_FARM_COMMAND:Z
  #4627 = NameAndType        #4628:#57    // ENABLE_OFFLINE_FARM_COMMAND:Z
  #4628 = Utf8               ENABLE_OFFLINE_FARM_COMMAND
  #4629 = String             #4630        // OfflineFarmPremium
  #4630 = Utf8               OfflineFarmPremium
  #4631 = Fieldref           #27.#4632    // ext/mods/Config.OFFLINE_FARM_PREMIUM:Z
  #4632 = NameAndType        #4633:#57    // OFFLINE_FARM_PREMIUM:Z
  #4633 = Utf8               OFFLINE_FARM_PREMIUM
  #4634 = String             #4635        // OfflineFarmLogoutOnDeath
  #4635 = Utf8               OfflineFarmLogoutOnDeath
  #4636 = Fieldref           #27.#4637    // ext/mods/Config.OFFLINE_FARM_LOGOUT_ON_DEATH:Z
  #4637 = NameAndType        #4638:#57    // OFFLINE_FARM_LOGOUT_ON_DEATH:Z
  #4638 = Utf8               OFFLINE_FARM_LOGOUT_ON_DEATH
  #4639 = String             #4640        // DualboxCheckMaxOfflinePlayPerIP
  #4640 = Utf8               DualboxCheckMaxOfflinePlayPerIP
  #4641 = Fieldref           #27.#4642    // ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
  #4642 = NameAndType        #4643:#86    // DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP:I
  #4643 = Utf8               DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP
  #4644 = String             #4645        // DualboxCheckMaxOfflinePlayPremiumPerIP
  #4645 = Utf8               DualboxCheckMaxOfflinePlayPremiumPerIP
  #4646 = Fieldref           #27.#4647    // ext/mods/Config.DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
  #4647 = NameAndType        #4648:#86    // DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP:I
  #4648 = Utf8               DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP
  #4649 = String             #4650        // DualboxCountOfflineTraders
  #4650 = Utf8               DualboxCountOfflineTraders
  #4651 = Fieldref           #27.#4652    // ext/mods/Config.DUALBOX_COUNT_OFFLINE_TRADERS:Z
  #4652 = NameAndType        #4653:#57    // DUALBOX_COUNT_OFFLINE_TRADERS:Z
  #4653 = Utf8               DUALBOX_COUNT_OFFLINE_TRADERS
  #4654 = String             #4655        // OfflineFarmSetNameColor
  #4655 = Utf8               OfflineFarmSetNameColor
  #4656 = Fieldref           #27.#4657    // ext/mods/Config.AWAY_PLAY_SET_NAME_COLOR:Z
  #4657 = NameAndType        #4658:#57    // AWAY_PLAY_SET_NAME_COLOR:Z
  #4658 = Utf8               AWAY_PLAY_SET_NAME_COLOR
  #4659 = String             #4660        // OfflineFarmNameColor
  #4660 = Utf8               OfflineFarmNameColor
  #4661 = String             #4662        // 00FF00
  #4662 = Utf8               00FF00
  #4663 = Fieldref           #27.#4664    // ext/mods/Config.AWAY_PLAY_NAME_COLOR:Ljava/lang/String;
  #4664 = NameAndType        #4665:#43    // AWAY_PLAY_NAME_COLOR:Ljava/lang/String;
  #4665 = Utf8               AWAY_PLAY_NAME_COLOR
  #4666 = String             #4667        // HpPotionItemId
  #4667 = Utf8               HpPotionItemId
  #4668 = Fieldref           #27.#4669    // ext/mods/Config.HP_POTION_ITEM_ID:I
  #4669 = NameAndType        #4670:#86    // HP_POTION_ITEM_ID:I
  #4670 = Utf8               HP_POTION_ITEM_ID
  #4671 = String             #4672        // MpPotionItemId
  #4672 = Utf8               MpPotionItemId
  #4673 = Fieldref           #27.#4674    // ext/mods/Config.MP_POTION_ITEM_ID:I
  #4674 = NameAndType        #4675:#86    // MP_POTION_ITEM_ID:I
  #4675 = Utf8               MP_POTION_ITEM_ID
  #4676 = String             #4677        // AutofarmMaxLevelDifference
  #4677 = Utf8               AutofarmMaxLevelDifference
  #4678 = Fieldref           #27.#4679    // ext/mods/Config.AUTOFARM_MAX_LEVEL_DIFFERENCE:I
  #4679 = NameAndType        #4680:#86    // AUTOFARM_MAX_LEVEL_DIFFERENCE:I
  #4680 = Utf8               AUTOFARM_MAX_LEVEL_DIFFERENCE
  #4681 = String             #4682        // IgnoreRaidBosses
  #4682 = Utf8               IgnoreRaidBosses
  #4683 = Fieldref           #27.#4684    // ext/mods/Config.IGNORE_RAID_BOSSES:Z
  #4684 = NameAndType        #4685:#57    // IGNORE_RAID_BOSSES:Z
  #4685 = Utf8               IGNORE_RAID_BOSSES
  #4686 = String             #4687        // IgnoreRaidMinions
  #4687 = Utf8               IgnoreRaidMinions
  #4688 = Fieldref           #27.#4689    // ext/mods/Config.IGNORE_RAID_MINIONS:Z
  #4689 = NameAndType        #4690:#57    // IGNORE_RAID_MINIONS:Z
  #4690 = Utf8               IGNORE_RAID_MINIONS
  #4691 = String             #4692        // IgnoreAgathions
  #4692 = Utf8               IgnoreAgathions
  #4693 = Fieldref           #27.#4694    // ext/mods/Config.IGNORE_AGATHIONS:Z
  #4694 = NameAndType        #4695:#57    // IGNORE_AGATHIONS:Z
  #4695 = Utf8               IGNORE_AGATHIONS
  #4696 = String             #4697        // IgnoreChests
  #4697 = Utf8               IgnoreChests
  #4698 = Fieldref           #27.#4699    // ext/mods/Config.IGNORE_CHESTS:Z
  #4699 = NameAndType        #4700:#57    // IGNORE_CHESTS:Z
  #4700 = Utf8               IGNORE_CHESTS
  #4701 = String             #4702        // SellBuffEnable
  #4702 = Utf8               SellBuffEnable
  #4703 = Fieldref           #27.#4704    // ext/mods/Config.SELLBUFF_ENABLED:Z
  #4704 = NameAndType        #4705:#57    // SELLBUFF_ENABLED:Z
  #4705 = Utf8               SELLBUFF_ENABLED
  #4706 = String             #4707        // MpCostMultipler
  #4707 = Utf8               MpCostMultipler
  #4708 = Fieldref           #27.#4709    // ext/mods/Config.SELLBUFF_MP_MULTIPLER:I
  #4709 = NameAndType        #4710:#86    // SELLBUFF_MP_MULTIPLER:I
  #4710 = Utf8               SELLBUFF_MP_MULTIPLER
  #4711 = String             #4712        // PaymentID
  #4712 = Utf8               PaymentID
  #4713 = Fieldref           #27.#4714    // ext/mods/Config.SELLBUFF_PAYMENT_ID:I
  #4714 = NameAndType        #4715:#86    // SELLBUFF_PAYMENT_ID:I
  #4715 = Utf8               SELLBUFF_PAYMENT_ID
  #4716 = String             #4717        // MinimumPrice
  #4717 = Utf8               MinimumPrice
  #4718 = Fieldref           #27.#4719    // ext/mods/Config.SELLBUFF_MIN_PRICE:J
  #4719 = NameAndType        #4720:#120   // SELLBUFF_MIN_PRICE:J
  #4720 = Utf8               SELLBUFF_MIN_PRICE
  #4721 = String             #4722        // MaximumPrice
  #4722 = Utf8               MaximumPrice
  #4723 = Integer            100000000
  #4724 = Fieldref           #27.#4725    // ext/mods/Config.SELLBUFF_MAX_PRICE:J
  #4725 = NameAndType        #4726:#120   // SELLBUFF_MAX_PRICE:J
  #4726 = Utf8               SELLBUFF_MAX_PRICE
  #4727 = String             #4728        // MaxBuffs
  #4728 = Utf8               MaxBuffs
  #4729 = Fieldref           #27.#4730    // ext/mods/Config.SELLBUFF_MAX_BUFFS:I
  #4730 = NameAndType        #4731:#86    // SELLBUFF_MAX_BUFFS:I
  #4731 = Utf8               SELLBUFF_MAX_BUFFS
  #4732 = String             #4733        // CustomTimeBuff
  #4733 = Utf8               CustomTimeBuff
  #4734 = Fieldref           #27.#4735    // ext/mods/Config.CUSTOM_TIME_BUFF:Z
  #4735 = NameAndType        #4736:#57    // CUSTOM_TIME_BUFF:Z
  #4736 = Utf8               CUSTOM_TIME_BUFF
  #4737 = String             #4738        // EnterAnakazel
  #4738 = Utf8               EnterAnakazel
  #4739 = Fieldref           #27.#4740    // ext/mods/Config.ENTER_ANAKAZEL:Z
  #4740 = NameAndType        #4741:#57    // ENTER_ANAKAZEL:Z
  #4741 = Utf8               ENTER_ANAKAZEL
  #4742 = String             #4743        // MaxRunSpeed
  #4743 = Utf8               MaxRunSpeed
  #4744 = Fieldref           #27.#4745    // ext/mods/Config.MAX_RUN_SPEED:I
  #4745 = NameAndType        #4746:#86    // MAX_RUN_SPEED:I
  #4746 = Utf8               MAX_RUN_SPEED
  #4747 = String             #4748        // MaxPAtk
  #4748 = Utf8               MaxPAtk
  #4749 = Integer            999999
  #4750 = Fieldref           #27.#4751    // ext/mods/Config.MAX_PATK:I
  #4751 = NameAndType        #4752:#86    // MAX_PATK:I
  #4752 = Utf8               MAX_PATK
  #4753 = String             #4754        // MaxMAtk
  #4754 = Utf8               MaxMAtk
  #4755 = Fieldref           #27.#4756    // ext/mods/Config.MAX_MATK:I
  #4756 = NameAndType        #4757:#86    // MAX_MATK:I
  #4757 = Utf8               MAX_MATK
  #4758 = String             #4759        // MaxPCritRate
  #4759 = Utf8               MaxPCritRate
  #4760 = Fieldref           #27.#4761    // ext/mods/Config.MAX_PCRIT_RATE:I
  #4761 = NameAndType        #4762:#86    // MAX_PCRIT_RATE:I
  #4762 = Utf8               MAX_PCRIT_RATE
  #4763 = String             #4764        // MaxMCritRate
  #4764 = Utf8               MaxMCritRate
  #4765 = Fieldref           #27.#4766    // ext/mods/Config.MAX_MCRIT_RATE:I
  #4766 = NameAndType        #4767:#86    // MAX_MCRIT_RATE:I
  #4767 = Utf8               MAX_MCRIT_RATE
  #4768 = String             #4769        // MaxPAtkSpeed
  #4769 = Utf8               MaxPAtkSpeed
  #4770 = Fieldref           #27.#4771    // ext/mods/Config.MAX_PATK_SPEED:I
  #4771 = NameAndType        #4772:#86    // MAX_PATK_SPEED:I
  #4772 = Utf8               MAX_PATK_SPEED
  #4773 = String             #4774        // MaxMAtkSpeed
  #4774 = Utf8               MaxMAtkSpeed
  #4775 = Fieldref           #27.#4776    // ext/mods/Config.MAX_MATK_SPEED:I
  #4776 = NameAndType        #4777:#86    // MAX_MATK_SPEED:I
  #4777 = Utf8               MAX_MATK_SPEED
  #4778 = String             #4779        // MaxEvasion
  #4779 = Utf8               MaxEvasion
  #4780 = Fieldref           #27.#4781    // ext/mods/Config.MAX_EVASION:I
  #4781 = NameAndType        #4782:#86    // MAX_EVASION:I
  #4782 = Utf8               MAX_EVASION
  #4783 = String             #4784        // NewFollow
  #4784 = Utf8               NewFollow
  #4785 = Fieldref           #27.#4786    // ext/mods/Config.NEW_FOLLOW:Z
  #4786 = NameAndType        #4787:#57    // NEW_FOLLOW:Z
  #4787 = Utf8               NEW_FOLLOW
  #4788 = String             #4789        // EnableMission
  #4789 = Utf8               EnableMission
  #4790 = Fieldref           #27.#4791    // ext/mods/Config.ENABLE_MISSION:Z
  #4791 = NameAndType        #4792:#57    // ENABLE_MISSION:Z
  #4792 = Utf8               ENABLE_MISSION
  #4793 = String             #4794        // RandomPvpZone
  #4794 = Utf8               RandomPvpZone
  #4795 = Fieldref           #27.#4796    // ext/mods/Config.RANDOM_PVP_ZONE:Z
  #4796 = NameAndType        #4797:#57    // RANDOM_PVP_ZONE:Z
  #4797 = Utf8               RANDOM_PVP_ZONE
  #4798 = String             #4799        // PTSEmulationSpawn
  #4799 = Utf8               PTSEmulationSpawn
  #4800 = Fieldref           #27.#4801    // ext/mods/Config.PTS_EMULATION_SPAWN:Z
  #4801 = NameAndType        #4802:#57    // PTS_EMULATION_SPAWN:Z
  #4802 = Utf8               PTS_EMULATION_SPAWN
  #4803 = String             #4804        // PTSEmulationSpawnDuraion
  #4804 = Utf8               PTSEmulationSpawnDuraion
  #4805 = Fieldref           #27.#4806    // ext/mods/Config.PTS_EMULATION_SPAWN_DURATION:I
  #4806 = NameAndType        #4807:#86    // PTS_EMULATION_SPAWN_DURATION:I
  #4807 = Utf8               PTS_EMULATION_SPAWN_DURATION
  #4808 = String             #4809        // StopToggle
  #4809 = Utf8               StopToggle
  #4810 = Fieldref           #27.#4811    // ext/mods/Config.STOP_TOGGLE:Z
  #4811 = NameAndType        #4812:#57    // STOP_TOGGLE:Z
  #4812 = Utf8               STOP_TOGGLE
  #4813 = String             #4814        // AnnounceDieRaidBoss
  #4814 = Utf8               AnnounceDieRaidBoss
  #4815 = Fieldref           #27.#4816    // ext/mods/Config.ANNOUNCE_DIE_RAIDBOSS:Z
  #4816 = NameAndType        #4817:#57    // ANNOUNCE_DIE_RAIDBOSS:Z
  #4817 = Utf8               ANNOUNCE_DIE_RAIDBOSS
  #4818 = String             #4819        // AnnounceSpawnRaidBoss
  #4819 = Utf8               AnnounceSpawnRaidBoss
  #4820 = Fieldref           #27.#4821    // ext/mods/Config.ANNOUNCE_SPAWN_RAIDBOSS:Z
  #4821 = NameAndType        #4822:#57    // ANNOUNCE_SPAWN_RAIDBOSS:Z
  #4822 = Utf8               ANNOUNCE_SPAWN_RAIDBOSS
  #4823 = String             #4824        // AnnounceDieGrandBoss
  #4824 = Utf8               AnnounceDieGrandBoss
  #4825 = Fieldref           #27.#4826    // ext/mods/Config.ANNOUNCE_DIE_GRANDBOSS:Z
  #4826 = NameAndType        #4827:#57    // ANNOUNCE_DIE_GRANDBOSS:Z
  #4827 = Utf8               ANNOUNCE_DIE_GRANDBOSS
  #4828 = String             #4829        // AnnounceSpawnGrandBoss
  #4829 = Utf8               AnnounceSpawnGrandBoss
  #4830 = Fieldref           #27.#4831    // ext/mods/Config.ANNOUNCE_SPAWN_GRANDBOSS:Z
  #4831 = NameAndType        #4832:#57    // ANNOUNCE_SPAWN_GRANDBOSS:Z
  #4832 = Utf8               ANNOUNCE_SPAWN_GRANDBOSS
  #4833 = String             #4834        // NpcSoulshot
  #4834 = Utf8               NpcSoulshot
  #4835 = Fieldref           #27.#4836    // ext/mods/Config.NPC_SOULSHOT:Z
  #4836 = NameAndType        #4837:#57    // NPC_SOULSHOT:Z
  #4837 = Utf8               NPC_SOULSHOT
  #4838 = String             #4839        // NpcSpiritshot
  #4839 = Utf8               NpcSpiritshot
  #4840 = Fieldref           #27.#4841    // ext/mods/Config.NPC_SPIRITSHOT:Z
  #4841 = NameAndType        #4842:#57    // NPC_SPIRITSHOT:Z
  #4842 = Utf8               NPC_SPIRITSHOT
  #4843 = String             #4844        // ReturnHomeMonster
  #4844 = Utf8               ReturnHomeMonster
  #4845 = Fieldref           #27.#4846    // ext/mods/Config.RETURN_HOME_MONSTER:Z
  #4846 = NameAndType        #4847:#57    // RETURN_HOME_MONSTER:Z
  #4847 = Utf8               RETURN_HOME_MONSTER
  #4848 = String             #4849        // ReturnHomeMonsterRadius
  #4849 = Utf8               ReturnHomeMonsterRadius
  #4850 = Fieldref           #27.#4851    // ext/mods/Config.RETURN_HOME_MONSTER_RADIUS:I
  #4851 = NameAndType        #4852:#86    // RETURN_HOME_MONSTER_RADIUS:I
  #4852 = Utf8               RETURN_HOME_MONSTER_RADIUS
  #4853 = String             #4854        // ReturnHomeRaidBoss
  #4854 = Utf8               ReturnHomeRaidBoss
  #4855 = Fieldref           #27.#4856    // ext/mods/Config.RETURN_HOME_RAIDBOSS:Z
  #4856 = NameAndType        #4857:#57    // RETURN_HOME_RAIDBOSS:Z
  #4857 = Utf8               RETURN_HOME_RAIDBOSS
  #4858 = String             #4859        // ReturnHomeRaidBossRadius
  #4859 = Utf8               ReturnHomeRaidBossRadius
  #4860 = Fieldref           #27.#4861    // ext/mods/Config.RETURN_HOME_RAIDBOSS_RADIUS:I
  #4861 = NameAndType        #4862:#86    // RETURN_HOME_RAIDBOSS_RADIUS:I
  #4862 = Utf8               RETURN_HOME_RAIDBOSS_RADIUS
  #4863 = String             #4864        // CancelReturnEnabled
  #4864 = Utf8               CancelReturnEnabled
  #4865 = Fieldref           #27.#4866    // ext/mods/Config.CANCEL_RETURN_ENABLED:Z
  #4866 = NameAndType        #4867:#57    // CANCEL_RETURN_ENABLED:Z
  #4867 = Utf8               CANCEL_RETURN_ENABLED
  #4868 = String             #4869        // CancelReturnMode
  #4869 = Utf8               CancelReturnMode
  #4870 = String             #4871        // CANCEL_ONLY
  #4871 = Utf8               CANCEL_ONLY
  #4872 = Fieldref           #27.#4873    // ext/mods/Config.CANCEL_RETURN_MODE:Ljava/lang/String;
  #4873 = NameAndType        #4874:#43    // CANCEL_RETURN_MODE:Ljava/lang/String;
  #4874 = Utf8               CANCEL_RETURN_MODE
  #4875 = String             #4876        // CancelReturnMassOnly
  #4876 = Utf8               CancelReturnMassOnly
  #4877 = Fieldref           #27.#4878    // ext/mods/Config.CANCEL_RETURN_MASS_ONLY:Z
  #4878 = NameAndType        #4879:#57    // CANCEL_RETURN_MASS_ONLY:Z
  #4879 = Utf8               CANCEL_RETURN_MASS_ONLY
  #4880 = String             #4881        // CancelReturnMassMinCount
  #4881 = Utf8               CancelReturnMassMinCount
  #4882 = Fieldref           #27.#4883    // ext/mods/Config.CANCEL_RETURN_MASS_MIN_COUNT:I
  #4883 = NameAndType        #4884:#86    // CANCEL_RETURN_MASS_MIN_COUNT:I
  #4884 = Utf8               CANCEL_RETURN_MASS_MIN_COUNT
  #4885 = String             #4886        // CancelReturnTimeMs
  #4886 = Utf8               CancelReturnTimeMs
  #4887 = Fieldref           #27.#4888    // ext/mods/Config.CANCEL_RETURN_TIME_MS:I
  #4888 = NameAndType        #4889:#86    // CANCEL_RETURN_TIME_MS:I
  #4889 = Utf8               CANCEL_RETURN_TIME_MS
  #4890 = String             #4891        // CancelReturnSkipOlympiad
  #4891 = Utf8               CancelReturnSkipOlympiad
  #4892 = Fieldref           #27.#4893    // ext/mods/Config.CANCEL_RETURN_SKIP_OLYMPIAD:Z
  #4893 = NameAndType        #4894:#57    // CANCEL_RETURN_SKIP_OLYMPIAD:Z
  #4894 = Utf8               CANCEL_RETURN_SKIP_OLYMPIAD
  #4895 = String             #4896        // CancelReturnNotify
  #4896 = Utf8               CancelReturnNotify
  #4897 = Fieldref           #27.#4898    // ext/mods/Config.CANCEL_RETURN_NOTIFY:Z
  #4898 = NameAndType        #4899:#57    // CANCEL_RETURN_NOTIFY:Z
  #4899 = Utf8               CANCEL_RETURN_NOTIFY
  #4900 = String             #4901        // CancelReturnMessage
  #4901 = Utf8               CancelReturnMessage
  #4902 = String             #4903        // Seus buffs foram restaurados.
  #4903 = Utf8               Seus buffs foram restaurados.
  #4904 = Fieldref           #27.#4905    // ext/mods/Config.CANCEL_RETURN_MESSAGE:Ljava/lang/String;
  #4905 = NameAndType        #4906:#43    // CANCEL_RETURN_MESSAGE:Ljava/lang/String;
  #4906 = Utf8               CANCEL_RETURN_MESSAGE
  #4907 = String             #4908        // sql.url
  #4908 = Utf8               sql.url
  #4909 = String             #4910        // jdbc:mariadb://localhost/rusacis?useUnicode=true&characterEncoding=UTF-8
  #4910 = Utf8               jdbc:mariadb://localhost/rusacis?useUnicode=true&characterEncoding=UTF-8
  #4911 = Fieldref           #27.#4912    // ext/mods/Config.DATABASE_URL:Ljava/lang/String;
  #4912 = NameAndType        #4913:#43    // DATABASE_URL:Ljava/lang/String;
  #4913 = Utf8               DATABASE_URL
  #4914 = String             #4915        // sql.login
  #4915 = Utf8               sql.login
  #4916 = String             #4917        // root
  #4917 = Utf8               root
  #4918 = Fieldref           #27.#4919    // ext/mods/Config.DATABASE_LOGIN:Ljava/lang/String;
  #4919 = NameAndType        #4920:#43    // DATABASE_LOGIN:Ljava/lang/String;
  #4920 = Utf8               DATABASE_LOGIN
  #4921 = String             #4922        // sql.password
  #4922 = Utf8               sql.password
  #4923 = Fieldref           #27.#4924    // ext/mods/Config.DATABASE_PASSWORD:Ljava/lang/String;
  #4924 = NameAndType        #4925:#43    // DATABASE_PASSWORD:Ljava/lang/String;
  #4925 = Utf8               DATABASE_PASSWORD
  #4926 = Fieldref           #27.#4927    // ext/mods/Config.LOGINSERVER_FILE:Ljava/lang/String;
  #4927 = NameAndType        #4928:#43    // LOGINSERVER_FILE:Ljava/lang/String;
  #4928 = Utf8               LOGINSERVER_FILE
  #4929 = String             #4930        // localhost
  #4930 = Utf8               localhost
  #4931 = String             #4932        // LoginserverHostname
  #4932 = Utf8               LoginserverHostname
  #4933 = Fieldref           #27.#4934    // ext/mods/Config.LOGINSERVER_HOSTNAME:Ljava/lang/String;
  #4934 = NameAndType        #4935:#43    // LOGINSERVER_HOSTNAME:Ljava/lang/String;
  #4935 = Utf8               LOGINSERVER_HOSTNAME
  #4936 = String             #4937        // LoginserverPort
  #4937 = Utf8               LoginserverPort
  #4938 = Fieldref           #27.#4939    // ext/mods/Config.LOGINSERVER_PORT:I
  #4939 = NameAndType        #4940:#86    // LOGINSERVER_PORT:I
  #4940 = Utf8               LOGINSERVER_PORT
  #4941 = String             #4942        // LoginHostname
  #4942 = Utf8               LoginHostname
  #4943 = String             #4944        // LoginTryBeforeBan
  #4944 = Utf8               LoginTryBeforeBan
  #4945 = Fieldref           #27.#4946    // ext/mods/Config.LOGIN_TRY_BEFORE_BAN:I
  #4946 = NameAndType        #4947:#86    // LOGIN_TRY_BEFORE_BAN:I
  #4947 = Utf8               LOGIN_TRY_BEFORE_BAN
  #4948 = String             #4949        // LoginBlockAfterBan
  #4949 = Utf8               LoginBlockAfterBan
  #4950 = Fieldref           #27.#4951    // ext/mods/Config.LOGIN_BLOCK_AFTER_BAN:I
  #4951 = NameAndType        #4952:#86    // LOGIN_BLOCK_AFTER_BAN:I
  #4952 = Utf8               LOGIN_BLOCK_AFTER_BAN
  #4953 = String             #4954        // AcceptNewGameServer
  #4954 = Utf8               AcceptNewGameServer
  #4955 = Fieldref           #27.#4956    // ext/mods/Config.ACCEPT_NEW_GAMESERVER:Z
  #4956 = NameAndType        #4957:#57    // ACCEPT_NEW_GAMESERVER:Z
  #4957 = Utf8               ACCEPT_NEW_GAMESERVER
  #4958 = String             #4959        // ShowLicence
  #4959 = Utf8               ShowLicence
  #4960 = Fieldref           #27.#4961    // ext/mods/Config.SHOW_LICENCE:Z
  #4961 = NameAndType        #4962:#57    // SHOW_LICENCE:Z
  #4962 = Utf8               SHOW_LICENCE
  #4963 = String             #4964        // AutoCreateAccounts
  #4964 = Utf8               AutoCreateAccounts
  #4965 = Fieldref           #27.#4966    // ext/mods/Config.AUTO_CREATE_ACCOUNTS:Z
  #4966 = NameAndType        #4967:#57    // AUTO_CREATE_ACCOUNTS:Z
  #4967 = Utf8               AUTO_CREATE_ACCOUNTS
  #4968 = String             #4969        // EnableFloodProtection
  #4969 = Utf8               EnableFloodProtection
  #4970 = Fieldref           #27.#4971    // ext/mods/Config.FLOOD_PROTECTION:Z
  #4971 = NameAndType        #4972:#57    // FLOOD_PROTECTION:Z
  #4972 = Utf8               FLOOD_PROTECTION
  #4973 = String             #4974        // FastConnectionLimit
  #4974 = Utf8               FastConnectionLimit
  #4975 = Fieldref           #27.#4976    // ext/mods/Config.FAST_CONNECTION_LIMIT:I
  #4976 = NameAndType        #4977:#86    // FAST_CONNECTION_LIMIT:I
  #4977 = Utf8               FAST_CONNECTION_LIMIT
  #4978 = String             #4979        // NormalConnectionTime
  #4979 = Utf8               NormalConnectionTime
  #4980 = Fieldref           #27.#4981    // ext/mods/Config.NORMAL_CONNECTION_TIME:I
  #4981 = NameAndType        #4982:#86    // NORMAL_CONNECTION_TIME:I
  #4982 = Utf8               NORMAL_CONNECTION_TIME
  #4983 = String             #4984        // FastConnectionTime
  #4984 = Utf8               FastConnectionTime
  #4985 = Fieldref           #27.#4986    // ext/mods/Config.FAST_CONNECTION_TIME:I
  #4986 = NameAndType        #4987:#86    // FAST_CONNECTION_TIME:I
  #4987 = Utf8               FAST_CONNECTION_TIME
  #4988 = String             #4989        // MaxConnectionPerIP
  #4989 = Utf8               MaxConnectionPerIP
  #4990 = Fieldref           #27.#4991    // ext/mods/Config.MAX_CONNECTION_PER_IP:I
  #4991 = NameAndType        #4992:#86    // MAX_CONNECTION_PER_IP:I
  #4992 = Utf8               MAX_CONNECTION_PER_IP
  #4993 = String             #4994        // ShowConnect
  #4994 = Utf8               ShowConnect
  #4995 = Fieldref           #27.#4996    // ext/mods/Config.SHOW_CONNECT:Z
  #4996 = NameAndType        #4997:#57    // SHOW_CONNECT:Z
  #4997 = Utf8               SHOW_CONNECT
  #4998 = String             #4999        // Proxy
  #4999 = Utf8               Proxy
  #5000 = Fieldref           #27.#5001    // ext/mods/Config.PROXY:Z
  #5001 = NameAndType        #5002:#57    // PROXY:Z
  #5002 = Utf8               PROXY
  #5003 = Fieldref           #27.#5004    // ext/mods/Config.TRANSLATOR_FILE:Ljava/lang/String;
  #5004 = NameAndType        #5005:#43    // TRANSLATOR_FILE:Ljava/lang/String;
  #5005 = Utf8               TRANSLATOR_FILE
  #5006 = String             #5007        // DeeplAuthKey
  #5007 = Utf8               DeeplAuthKey
  #5008 = Fieldref           #27.#5009    // ext/mods/Config.DEEPL_AUTH_KEY:Ljava/lang/String;
  #5009 = NameAndType        #5010:#43    // DEEPL_AUTH_KEY:Ljava/lang/String;
  #5010 = Utf8               DEEPL_AUTH_KEY
  #5011 = String             #5012        // DeeplContext
  #5012 = Utf8               DeeplContext
  #5013 = Fieldref           #27.#5014    // ext/mods/Config.DEEP_CONTEXT_STRING:Ljava/lang/String;
  #5014 = NameAndType        #5015:#43    // DEEP_CONTEXT_STRING:Ljava/lang/String;
  #5015 = Utf8               DEEP_CONTEXT_STRING
  #5016 = String             #5017        // DoNotTranslate
  #5017 = Utf8               DoNotTranslate
  #5018 = Fieldref           #27.#5019    // ext/mods/Config.DO_NOT_TRANSLATE:Ljava/util/List;
  #5019 = NameAndType        #5020:#1221  // DO_NOT_TRANSLATE:Ljava/util/List;
  #5020 = Utf8               DO_NOT_TRANSLATE
  #5021 = Fieldref           #27.#5022    // ext/mods/Config.BOSS_JEWEL_UPGRADES_FILE:Ljava/lang/String;
  #5022 = NameAndType        #5023:#43    // BOSS_JEWEL_UPGRADES_FILE:Ljava/lang/String;
  #5023 = Utf8               BOSS_JEWEL_UPGRADES_FILE
  #5024 = String             #5025        // UpgradeBossJewelsEnchant
  #5025 = Utf8               UpgradeBossJewelsEnchant
  #5026 = Fieldref           #27.#5027    // ext/mods/Config.UPGRADE_BOSS_JEWELS_ENCHANT:Z
  #5027 = NameAndType        #5028:#57    // UPGRADE_BOSS_JEWELS_ENCHANT:Z
  #5028 = Utf8               UPGRADE_BOSS_JEWELS_ENCHANT
  #5029 = String             #5030        // UpgradeBossJewelsEnchant: {}
  #5030 = Utf8               UpgradeBossJewelsEnchant: {}
  #5031 = Methodref          #5032.#5033  // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #5032 = Class              #5034        // java/lang/Boolean
  #5033 = NameAndType        #406:#5035   // valueOf:(Z)Ljava/lang/Boolean;
  #5034 = Utf8               java/lang/Boolean
  #5035 = Utf8               (Z)Ljava/lang/Boolean;
  #5036 = Methodref          #35.#5037    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #5037 = NameAndType        #4188:#419   // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #5038 = String             #5039        // UpgradeBossJewels
  #5039 = Utf8               UpgradeBossJewels
  #5040 = Fieldref           #27.#5041    // ext/mods/Config.UPGRADE_BOSS_JEWELS:Ljava/util/List;
  #5041 = NameAndType        #5042:#1221  // UPGRADE_BOSS_JEWELS:Ljava/util/List;
  #5042 = Utf8               UPGRADE_BOSS_JEWELS
  #5043 = Class              #5044        // ext/mods/Config$JewelUpgrade
  #5044 = Utf8               ext/mods/Config$JewelUpgrade
  #5045 = Methodref          #5043.#5046  // ext/mods/Config$JewelUpgrade."<init>":(III)V
  #5046 = NameAndType        #5:#5047     // "<init>":(III)V
  #5047 = Utf8               (III)V
  #5048 = Fieldref           #27.#5049    // ext/mods/Config.UPGRADEABLE_BOSS_JEWELS:Ljava/util/Set;
  #5049 = NameAndType        #5050:#453   // UPGRADEABLE_BOSS_JEWELS:Ljava/util/Set;
  #5050 = Utf8               UPGRADEABLE_BOSS_JEWELS
  #5051 = String             #5052        // Loaded JewelUpgrade: itemId={}, enchantLevel={}, newItemId={}
  #5052 = Utf8               Loaded JewelUpgrade: itemId={}, enchantLevel={}, newItemId={}
  #5053 = String             #5054        // Failed to parse JewelUpgrade: {}
  #5054 = Utf8               Failed to parse JewelUpgrade: {}
  #5055 = Methodref          #35.#5056    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #5056 = NameAndType        #38:#419     // error:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #5057 = String             #5058        // Invalid JewelUpgrade format: {}
  #5058 = Utf8               Invalid JewelUpgrade format: {}
  #5059 = String             #5060        // Loaded {} boss jewel upgrades.
  #5060 = Utf8               Loaded {} boss jewel upgrades.
  #5061 = String             #5062        // Loaded {} upgradeable boss jewels.
  #5062 = Utf8               Loaded {} upgradeable boss jewels.
  #5063 = InterfaceMethodref #446.#1398   // java/util/Set.size:()I
  #5064 = Methodref          #215.#5065   // java/lang/String.isBlank:()Z
  #5065 = NameAndType        #5066:#384   // isBlank:()Z
  #5066 = Utf8               isBlank
  #5067 = Fieldref           #27.#5068    // ext/mods/Config.CONFIG_PATH:Ljava/nio/file/Path;
  #5068 = NameAndType        #5069:#5070  // CONFIG_PATH:Ljava/nio/file/Path;
  #5069 = Utf8               CONFIG_PATH
  #5070 = Utf8               Ljava/nio/file/Path;
  #5071 = String             #5072        // custom/Pix.properties
  #5072 = Utf8               custom/Pix.properties
  #5073 = InterfaceMethodref #5074.#5075  // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #5074 = Class              #5076        // java/nio/file/Path
  #5075 = NameAndType        #5077:#5078  // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #5076 = Utf8               java/nio/file/Path
  #5077 = Utf8               resolve
  #5078 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #5079 = InterfaceMethodref #5074.#5080  // java/nio/file/Path.toString:()Ljava/lang/String;
  #5080 = NameAndType        #5081:#380   // toString:()Ljava/lang/String;
  #5081 = Utf8               toString
  #5082 = String             #5083        // EnablePixMod
  #5083 = Utf8               EnablePixMod
  #5084 = Fieldref           #27.#5085    // ext/mods/Config.ENABLE_PIX_MOD:Z
  #5085 = NameAndType        #5086:#57    // ENABLE_PIX_MOD:Z
  #5086 = Utf8               ENABLE_PIX_MOD
  #5087 = String             #5088        // AnnounceDonatorItemGlobal
  #5088 = Utf8               AnnounceDonatorItemGlobal
  #5089 = Fieldref           #27.#5090    // ext/mods/Config.ANNOUNCE_DONATOR_ITEM_GLOBAL:Z
  #5090 = NameAndType        #5091:#57    // ANNOUNCE_DONATOR_ITEM_GLOBAL:Z
  #5091 = Utf8               ANNOUNCE_DONATOR_ITEM_GLOBAL
  #5092 = String             #5093        // donation.properties
  #5093 = Utf8               donation.properties
  #5094 = String             #5095        // EnableDonationManager
  #5095 = Utf8               EnableDonationManager
  #5096 = Fieldref           #27.#5097    // ext/mods/Config.DONATION_ENABLED:Z
  #5097 = NameAndType        #5098:#57    // DONATION_ENABLED:Z
  #5098 = Utf8               DONATION_ENABLED
  #5099 = String             #5100        // PurchasableItem
  #5100 = Utf8               PurchasableItem
  #5101 = Fieldref           #27.#5102    // ext/mods/Config.DONATION_PURCHASABLE_ITEM:I
  #5102 = NameAndType        #5103:#86    // DONATION_PURCHASABLE_ITEM:I
  #5103 = Utf8               DONATION_PURCHASABLE_ITEM
  #5104 = String             #5105        // DeleteInactivePurchases
  #5105 = Utf8               DeleteInactivePurchases
  #5106 = Fieldref           #27.#5107    // ext/mods/Config.DONATION_DELETE_INACTIVE:Z
  #5107 = NameAndType        #5108:#57    // DONATION_DELETE_INACTIVE:Z
  #5108 = Utf8               DONATION_DELETE_INACTIVE
  #5109 = String             #5110        // DeletePaymentData
  #5110 = Utf8               DeletePaymentData
  #5111 = Fieldref           #27.#5112    // ext/mods/Config.DONATION_DELETE_PAYMENT_DATA:Z
  #5112 = NameAndType        #5113:#57    // DONATION_DELETE_PAYMENT_DATA:Z
  #5113 = Utf8               DONATION_DELETE_PAYMENT_DATA
  #5114 = String             #5115        // HideEndedPurchases
  #5115 = Utf8               HideEndedPurchases
  #5116 = Fieldref           #27.#5117    // ext/mods/Config.DONATION_HIDE_ENDED:Z
  #5117 = NameAndType        #5118:#57    // DONATION_HIDE_ENDED:Z
  #5118 = Utf8               DONATION_HIDE_ENDED
  #5119 = String             #5120        // ServerName
  #5120 = Utf8               ServerName
  #5121 = String             #5122        // Brproject
  #5122 = Utf8               Brproject
  #5123 = Fieldref           #27.#5124    // ext/mods/Config.DONATION_SERVER_NAME:Ljava/lang/String;
  #5124 = NameAndType        #5125:#43    // DONATION_SERVER_NAME:Ljava/lang/String;
  #5125 = Utf8               DONATION_SERVER_NAME
  #5126 = String             #5127        // Calculator
  #5127 = Utf8               Calculator
  #5128 = Fieldref           #27.#5129    // ext/mods/Config.DONATION_CALCULATOR:Z
  #5129 = NameAndType        #5130:#57    // DONATION_CALCULATOR:Z
  #5130 = Utf8               DONATION_CALCULATOR
  #5131 = String             #5132        // ShowDropdown
  #5132 = Utf8               ShowDropdown
  #5133 = Fieldref           #27.#5134    // ext/mods/Config.DONATION_DROPDOWN:Z
  #5134 = NameAndType        #5135:#57    // DONATION_DROPDOWN:Z
  #5135 = Utf8               DONATION_DROPDOWN
  #5136 = String             #5137        // RequireTerms
  #5137 = Utf8               RequireTerms
  #5138 = Fieldref           #27.#5139    // ext/mods/Config.DONATION_REQUIRE_TERMS:Z
  #5139 = NameAndType        #5140:#57    // DONATION_REQUIRE_TERMS:Z
  #5140 = Utf8               DONATION_REQUIRE_TERMS
  #5141 = String             #5142        // AllowedEmailAddresses
  #5142 = Utf8               AllowedEmailAddresses
  #5143 = Methodref          #27.#5144    // ext/mods/Config.parseDonationStringArray:(Ljava/lang/String;)[Ljava/lang/String;
  #5144 = NameAndType        #5145:#394   // parseDonationStringArray:(Ljava/lang/String;)[Ljava/lang/String;
  #5145 = Utf8               parseDonationStringArray
  #5146 = Fieldref           #27.#5147    // ext/mods/Config.DONATION_ALLOWED_EMAILS:[Ljava/lang/String;
  #5147 = NameAndType        #5148:#1039  // DONATION_ALLOWED_EMAILS:[Ljava/lang/String;
  #5148 = Utf8               DONATION_ALLOWED_EMAILS
  #5149 = String             #5150        // MercadoPagoApiToken
  #5150 = Utf8               MercadoPagoApiToken
  #5151 = Fieldref           #27.#5152    // ext/mods/Config.DONATION_MP_TOKEN:Ljava/lang/String;
  #5152 = NameAndType        #5153:#43    // DONATION_MP_TOKEN:Ljava/lang/String;
  #5153 = Utf8               DONATION_MP_TOKEN
  #5154 = String             #5155        // MercadoPagoPixPrice
  #5155 = Utf8               MercadoPagoPixPrice
  #5156 = String             #5157        // 1.00
  #5157 = Utf8               1.00
  #5158 = Fieldref           #27.#5159    // ext/mods/Config.DONATION_MP_PIX_PRICE:Ljava/lang/String;
  #5159 = NameAndType        #5160:#43    // DONATION_MP_PIX_PRICE:Ljava/lang/String;
  #5160 = Utf8               DONATION_MP_PIX_PRICE
  #5161 = String             #5162        // MercadoPagoPix
  #5162 = Utf8               MercadoPagoPix
  #5163 = Fieldref           #27.#5164    // ext/mods/Config.DONATION_MP_PIX:Z
  #5164 = NameAndType        #5165:#57    // DONATION_MP_PIX:Z
  #5165 = Utf8               DONATION_MP_PIX
  #5166 = String             #5167        // MercadoPagoPixExpirationTime
  #5167 = Utf8               MercadoPagoPixExpirationTime
  #5168 = Fieldref           #27.#5169    // ext/mods/Config.DONATION_MP_PIX_EXPIRATION_TIME:I
  #5169 = NameAndType        #5170:#86    // DONATION_MP_PIX_EXPIRATION_TIME:I
  #5170 = Utf8               DONATION_MP_PIX_EXPIRATION_TIME
  #5171 = String             #5172        // MercadoPagoPixMail
  #5172 = Utf8               MercadoPagoPixMail
  #5173 = Fieldref           #27.#5174    // ext/mods/Config.DONATION_MP_PIX_MAIL:Z
  #5174 = NameAndType        #5175:#57    // DONATION_MP_PIX_MAIL:Z
  #5175 = Utf8               DONATION_MP_PIX_MAIL
  #5176 = String             #5177        // MercadoPagoPixAccountOwner
  #5177 = Utf8               MercadoPagoPixAccountOwner
  #5178 = Fieldref           #27.#5179    // ext/mods/Config.DONATION_MP_PIX_ACCOUNT_OWNER:Ljava/lang/String;
  #5179 = NameAndType        #5180:#43    // DONATION_MP_PIX_ACCOUNT_OWNER:Ljava/lang/String;
  #5180 = Utf8               DONATION_MP_PIX_ACCOUNT_OWNER
  #5181 = String             #5182        // MercadoPagoPixAccountCpf
  #5182 = Utf8               MercadoPagoPixAccountCpf
  #5183 = Fieldref           #27.#5184    // ext/mods/Config.DONATION_MP_PIX_ACCOUNT_CPF:Ljava/lang/String;
  #5184 = NameAndType        #5185:#43    // DONATION_MP_PIX_ACCOUNT_CPF:Ljava/lang/String;
  #5185 = Utf8               DONATION_MP_PIX_ACCOUNT_CPF
  #5186 = String             #5187        // MercadoPagoPixAccountBank
  #5187 = Utf8               MercadoPagoPixAccountBank
  #5188 = Fieldref           #27.#5189    // ext/mods/Config.DONATION_MP_PIX_ACCOUNT_BANK:Ljava/lang/String;
  #5189 = NameAndType        #5190:#43    // DONATION_MP_PIX_ACCOUNT_BANK:Ljava/lang/String;
  #5190 = Utf8               DONATION_MP_PIX_ACCOUNT_BANK
  #5191 = String             #5192        // MercadoPagoPixDropdown
  #5192 = Utf8               MercadoPagoPixDropdown
  #5193 = String             #5194        // 5,10,15,20,25
  #5194 = Utf8               5,10,15,20,25
  #5195 = Methodref          #27.#5196    // ext/mods/Config.parseDonationIntArray:(Ljava/lang/String;)[I
  #5196 = NameAndType        #5197:#5198  // parseDonationIntArray:(Ljava/lang/String;)[I
  #5197 = Utf8               parseDonationIntArray
  #5198 = Utf8               (Ljava/lang/String;)[I
  #5199 = Fieldref           #27.#5200    // ext/mods/Config.DONATION_MP_PIX_DROPDOWN:[I
  #5200 = NameAndType        #5201:#388   // DONATION_MP_PIX_DROPDOWN:[I
  #5201 = Utf8               DONATION_MP_PIX_DROPDOWN
  #5202 = String             #5203        // MercadoPagoLinkPrice
  #5203 = Utf8               MercadoPagoLinkPrice
  #5204 = Fieldref           #27.#5205    // ext/mods/Config.DONATION_MP_LINK_PRICE:Ljava/lang/String;
  #5205 = NameAndType        #5206:#43    // DONATION_MP_LINK_PRICE:Ljava/lang/String;
  #5206 = Utf8               DONATION_MP_LINK_PRICE
  #5207 = String             #5208        // MercadoPagoLink
  #5208 = Utf8               MercadoPagoLink
  #5209 = Fieldref           #27.#5210    // ext/mods/Config.DONATION_MP_LINK:Z
  #5210 = NameAndType        #5211:#57    // DONATION_MP_LINK:Z
  #5211 = Utf8               DONATION_MP_LINK
  #5212 = String             #5213        // MercadoPagoLinkMail
  #5213 = Utf8               MercadoPagoLinkMail
  #5214 = Fieldref           #27.#5215    // ext/mods/Config.DONATION_MP_LINK_MAIL:Z
  #5215 = NameAndType        #5216:#57    // DONATION_MP_LINK_MAIL:Z
  #5216 = Utf8               DONATION_MP_LINK_MAIL
  #5217 = String             #5218        // MercadoPagoCurrency
  #5218 = Utf8               MercadoPagoCurrency
  #5219 = String             #5220        // BRL
  #5220 = Utf8               BRL
  #5221 = Fieldref           #27.#5222    // ext/mods/Config.DONATION_MP_CURRENCY:Ljava/lang/String;
  #5222 = NameAndType        #5223:#43    // DONATION_MP_CURRENCY:Ljava/lang/String;
  #5223 = Utf8               DONATION_MP_CURRENCY
  #5224 = String             #5225        // MercadoPagoCurrencies
  #5225 = Utf8               MercadoPagoCurrencies
  #5226 = Fieldref           #27.#5227    // ext/mods/Config.DONATION_MP_CURRENCIES:[Ljava/lang/String;
  #5227 = NameAndType        #5228:#1039  // DONATION_MP_CURRENCIES:[Ljava/lang/String;
  #5228 = Utf8               DONATION_MP_CURRENCIES
  #5229 = String             #5230        // MercadoPagoLinkExpirationTime
  #5230 = Utf8               MercadoPagoLinkExpirationTime
  #5231 = Fieldref           #27.#5232    // ext/mods/Config.DONATION_MP_LINK_EXPIRATION_TIME:I
  #5232 = NameAndType        #5233:#86    // DONATION_MP_LINK_EXPIRATION_TIME:I
  #5233 = Utf8               DONATION_MP_LINK_EXPIRATION_TIME
  #5234 = String             #5235        // MercadoPagoLinkDropdown
  #5235 = Utf8               MercadoPagoLinkDropdown
  #5236 = Fieldref           #27.#5237    // ext/mods/Config.DONATION_MP_LINK_DROPDOWN:[I
  #5237 = NameAndType        #5238:#388   // DONATION_MP_LINK_DROPDOWN:[I
  #5238 = Utf8               DONATION_MP_LINK_DROPDOWN
  #5239 = String             #5240        // PayPalLink
  #5240 = Utf8               PayPalLink
  #5241 = Fieldref           #27.#5242    // ext/mods/Config.DONATION_PAYPAL_LINK:Z
  #5242 = NameAndType        #5243:#57    // DONATION_PAYPAL_LINK:Z
  #5243 = Utf8               DONATION_PAYPAL_LINK
  #5244 = String             #5245        // PayPalClientId
  #5245 = Utf8               PayPalClientId
  #5246 = Fieldref           #27.#5247    // ext/mods/Config.DONATION_PAYPAL_CLIENT_ID:Ljava/lang/String;
  #5247 = NameAndType        #5248:#43    // DONATION_PAYPAL_CLIENT_ID:Ljava/lang/String;
  #5248 = Utf8               DONATION_PAYPAL_CLIENT_ID
  #5249 = String             #5250        // PayPalClientSecret
  #5250 = Utf8               PayPalClientSecret
  #5251 = Fieldref           #27.#5252    // ext/mods/Config.DONATION_PAYPAL_CLIENT_SECRET:Ljava/lang/String;
  #5252 = NameAndType        #5253:#43    // DONATION_PAYPAL_CLIENT_SECRET:Ljava/lang/String;
  #5253 = Utf8               DONATION_PAYPAL_CLIENT_SECRET
  #5254 = String             #5255        // PayPalPrice
  #5255 = Utf8               PayPalPrice
  #5256 = String             #5257        // 2.00
  #5257 = Utf8               2.00
  #5258 = Fieldref           #27.#5259    // ext/mods/Config.DONATION_PAYPAL_PRICE:Ljava/lang/String;
  #5259 = NameAndType        #5260:#43    // DONATION_PAYPAL_PRICE:Ljava/lang/String;
  #5260 = Utf8               DONATION_PAYPAL_PRICE
  #5261 = String             #5262        // PayPalSandboxEnabled
  #5262 = Utf8               PayPalSandboxEnabled
  #5263 = Fieldref           #27.#5264    // ext/mods/Config.DONATION_PAYPAL_SANDBOX_ENABLED:Z
  #5264 = NameAndType        #5265:#57    // DONATION_PAYPAL_SANDBOX_ENABLED:Z
  #5265 = Utf8               DONATION_PAYPAL_SANDBOX_ENABLED
  #5266 = String             #5267        // PayPalAccountEmail
  #5267 = Utf8               PayPalAccountEmail
  #5268 = Fieldref           #27.#5269    // ext/mods/Config.DONATION_PAYPAL_ACCOUNT_EMAIL:Ljava/lang/String;
  #5269 = NameAndType        #5270:#43    // DONATION_PAYPAL_ACCOUNT_EMAIL:Ljava/lang/String;
  #5270 = Utf8               DONATION_PAYPAL_ACCOUNT_EMAIL
  #5271 = String             #5272        // PayPalMail
  #5272 = Utf8               PayPalMail
  #5273 = Fieldref           #27.#5274    // ext/mods/Config.DONATION_PAYPAL_MAIL:Z
  #5274 = NameAndType        #5275:#57    // DONATION_PAYPAL_MAIL:Z
  #5275 = Utf8               DONATION_PAYPAL_MAIL
  #5276 = String             #5277        // PayPalLinkExpirationTime
  #5277 = Utf8               PayPalLinkExpirationTime
  #5278 = Fieldref           #27.#5279    // ext/mods/Config.DONATION_PAYPAL_LINK_EXPIRATION_TIME:I
  #5279 = NameAndType        #5280:#86    // DONATION_PAYPAL_LINK_EXPIRATION_TIME:I
  #5280 = Utf8               DONATION_PAYPAL_LINK_EXPIRATION_TIME
  #5281 = String             #5282        // PayPalCurrency
  #5282 = Utf8               PayPalCurrency
  #5283 = Fieldref           #27.#5284    // ext/mods/Config.DONATION_PAYPAL_CURRENCY:Ljava/lang/String;
  #5284 = NameAndType        #5285:#43    // DONATION_PAYPAL_CURRENCY:Ljava/lang/String;
  #5285 = Utf8               DONATION_PAYPAL_CURRENCY
  #5286 = String             #5287        // PayPalCurrencies
  #5287 = Utf8               PayPalCurrencies
  #5288 = Fieldref           #27.#5289    // ext/mods/Config.DONATION_PAYPAL_CURRENCIES:[Ljava/lang/String;
  #5289 = NameAndType        #5290:#1039  // DONATION_PAYPAL_CURRENCIES:[Ljava/lang/String;
  #5290 = Utf8               DONATION_PAYPAL_CURRENCIES
  #5291 = String             #5292        // PayPalDropdown
  #5292 = Utf8               PayPalDropdown
  #5293 = Fieldref           #27.#5294    // ext/mods/Config.DONATION_PAYPAL_DROPDOWN:[I
  #5294 = NameAndType        #5295:#388   // DONATION_PAYPAL_DROPDOWN:[I
  #5295 = Utf8               DONATION_PAYPAL_DROPDOWN
  #5296 = String             #5297        // PayPalWebSite
  #5297 = Utf8               PayPalWebSite
  #5298 = Fieldref           #27.#5299    // ext/mods/Config.DONATION_PAYPAL_WEBSITE:Ljava/lang/String;
  #5299 = NameAndType        #5300:#43    // DONATION_PAYPAL_WEBSITE:Ljava/lang/String;
  #5300 = Utf8               DONATION_PAYPAL_WEBSITE
  #5301 = String             #5302        // PayPalNoteMsg
  #5302 = Utf8               PayPalNoteMsg
  #5303 = Fieldref           #27.#5304    // ext/mods/Config.DONATION_PAYPAL_NOTE_MSG:Ljava/lang/String;
  #5304 = NameAndType        #5305:#43    // DONATION_PAYPAL_NOTE_MSG:Ljava/lang/String;
  #5305 = Utf8               DONATION_PAYPAL_NOTE_MSG
  #5306 = String             #5307        // PayPalLogoImage
  #5307 = Utf8               PayPalLogoImage
  #5308 = Fieldref           #27.#5309    // ext/mods/Config.DONATION_PAYPAL_LOGO_IMAGE:Ljava/lang/String;
  #5309 = NameAndType        #5310:#43    // DONATION_PAYPAL_LOGO_IMAGE:Ljava/lang/String;
  #5310 = Utf8               DONATION_PAYPAL_LOGO_IMAGE
  #5311 = String             #5312        // PayPalPhoneCountryCode
  #5312 = Utf8               PayPalPhoneCountryCode
  #5313 = Fieldref           #27.#5314    // ext/mods/Config.DONATION_PAYPAL_PHONE_CODE:Ljava/lang/String;
  #5314 = NameAndType        #5315:#43    // DONATION_PAYPAL_PHONE_CODE:Ljava/lang/String;
  #5315 = Utf8               DONATION_PAYPAL_PHONE_CODE
  #5316 = String             #5317        // PayPalPhoneNumber
  #5317 = Utf8               PayPalPhoneNumber
  #5318 = Fieldref           #27.#5319    // ext/mods/Config.DONATION_PAYPAL_PHONE_NUMBER:Ljava/lang/String;
  #5319 = NameAndType        #5320:#43    // DONATION_PAYPAL_PHONE_NUMBER:Ljava/lang/String;
  #5320 = Utf8               DONATION_PAYPAL_PHONE_NUMBER
  #5321 = String             #5322        // BinancePay
  #5322 = Utf8               BinancePay
  #5323 = Fieldref           #27.#5324    // ext/mods/Config.DONATION_BINANCE_PAY:Z
  #5324 = NameAndType        #5325:#57    // DONATION_BINANCE_PAY:Z
  #5325 = Utf8               DONATION_BINANCE_PAY
  #5326 = String             #5327        // BinanceApiKey
  #5327 = Utf8               BinanceApiKey
  #5328 = Fieldref           #27.#5329    // ext/mods/Config.DONATION_BINANCE_API_KEY:Ljava/lang/String;
  #5329 = NameAndType        #5330:#43    // DONATION_BINANCE_API_KEY:Ljava/lang/String;
  #5330 = Utf8               DONATION_BINANCE_API_KEY
  #5331 = String             #5332        // BinanceSecretKey
  #5332 = Utf8               BinanceSecretKey
  #5333 = Fieldref           #27.#5334    // ext/mods/Config.DONATION_BINANCE_SECRET_KEY:Ljava/lang/String;
  #5334 = NameAndType        #5335:#43    // DONATION_BINANCE_SECRET_KEY:Ljava/lang/String;
  #5335 = Utf8               DONATION_BINANCE_SECRET_KEY
  #5336 = String             #5337        // BinancePrice
  #5337 = Utf8               BinancePrice
  #5338 = Fieldref           #27.#5339    // ext/mods/Config.DONATION_BINANCE_PRICE:Ljava/lang/String;
  #5339 = NameAndType        #5340:#43    // DONATION_BINANCE_PRICE:Ljava/lang/String;
  #5340 = Utf8               DONATION_BINANCE_PRICE
  #5341 = String             #5342        // BinanceFiatCurrency
  #5342 = Utf8               BinanceFiatCurrency
  #5343 = Fieldref           #27.#5344    // ext/mods/Config.DONATION_BINANCE_FIAT_CURRENCY:Ljava/lang/String;
  #5344 = NameAndType        #5345:#43    // DONATION_BINANCE_FIAT_CURRENCY:Ljava/lang/String;
  #5345 = Utf8               DONATION_BINANCE_FIAT_CURRENCY
  #5346 = String             #5347        // BinancePayCurrency
  #5347 = Utf8               BinancePayCurrency
  #5348 = Fieldref           #27.#5349    // ext/mods/Config.DONATION_BINANCE_PAY_CURRENCY:[Ljava/lang/String;
  #5349 = NameAndType        #5350:#1039  // DONATION_BINANCE_PAY_CURRENCY:[Ljava/lang/String;
  #5350 = Utf8               DONATION_BINANCE_PAY_CURRENCY
  #5351 = String             #5352        // BinanceMail
  #5352 = Utf8               BinanceMail
  #5353 = Fieldref           #27.#5354    // ext/mods/Config.DONATION_BINANCE_MAIL:Z
  #5354 = NameAndType        #5355:#57    // DONATION_BINANCE_MAIL:Z
  #5355 = Utf8               DONATION_BINANCE_MAIL
  #5356 = String             #5357        // BinanceExpirationTime
  #5357 = Utf8               BinanceExpirationTime
  #5358 = Fieldref           #27.#5359    // ext/mods/Config.DONATION_BINANCE_EXPIRATION_TIME:I
  #5359 = NameAndType        #5360:#86    // DONATION_BINANCE_EXPIRATION_TIME:I
  #5360 = Utf8               DONATION_BINANCE_EXPIRATION_TIME
  #5361 = String             #5362        // BinanceDropdown
  #5362 = Utf8               BinanceDropdown
  #5363 = Fieldref           #27.#5364    // ext/mods/Config.DONATION_BINANCE_DROPDOWN:[I
  #5364 = NameAndType        #5365:#388   // DONATION_BINANCE_DROPDOWN:[I
  #5365 = Utf8               DONATION_BINANCE_DROPDOWN
  #5366 = String             #5367        // BinanceCurrencyTaskInterval
  #5367 = Utf8               BinanceCurrencyTaskInterval
  #5368 = Fieldref           #27.#5369    // ext/mods/Config.DONATION_BINANCE_CURRENCY_TASK_INTERVAL:I
  #5369 = NameAndType        #5370:#86    // DONATION_BINANCE_CURRENCY_TASK_INTERVAL:I
  #5370 = Utf8               DONATION_BINANCE_CURRENCY_TASK_INTERVAL
  #5371 = String             #5372        // CurrencyBeaconApiKey
  #5372 = Utf8               CurrencyBeaconApiKey
  #5373 = Fieldref           #27.#5374    // ext/mods/Config.DONATION_CURRENCY_CB_API_KEY:Ljava/lang/String;
  #5374 = NameAndType        #5375:#43    // DONATION_CURRENCY_CB_API_KEY:Ljava/lang/String;
  #5375 = Utf8               DONATION_CURRENCY_CB_API_KEY
  #5376 = String             #5377        // AwesomeApi
  #5377 = Utf8               AwesomeApi
  #5378 = Fieldref           #27.#5379    // ext/mods/Config.DONATION_CURRENCY_AWESOMEAPI:Z
  #5379 = NameAndType        #5380:#57    // DONATION_CURRENCY_AWESOMEAPI:Z
  #5380 = Utf8               DONATION_CURRENCY_AWESOMEAPI
  #5381 = String             #5382        // FiatCurrencyTaskInterval
  #5382 = Utf8               FiatCurrencyTaskInterval
  #5383 = Fieldref           #27.#5384    // ext/mods/Config.DONATION_CURRENCY_TASK_INTERVAL:I
  #5384 = NameAndType        #5385:#86    // DONATION_CURRENCY_TASK_INTERVAL:I
  #5385 = Utf8               DONATION_CURRENCY_TASK_INTERVAL
  #5386 = String             #5387        // MailerApiToken
  #5387 = Utf8               MailerApiToken
  #5388 = Fieldref           #27.#5389    // ext/mods/Config.DONATION_MAILER_TOKEN:Ljava/lang/String;
  #5389 = NameAndType        #5390:#43    // DONATION_MAILER_TOKEN:Ljava/lang/String;
  #5390 = Utf8               DONATION_MAILER_TOKEN
  #5391 = String             #5392        // MailerAddress
  #5392 = Utf8               MailerAddress
  #5393 = Fieldref           #27.#5394    // ext/mods/Config.DONATION_MAILER_ADDRESS:Ljava/lang/String;
  #5394 = NameAndType        #5395:#43    // DONATION_MAILER_ADDRESS:Ljava/lang/String;
  #5395 = Utf8               DONATION_MAILER_ADDRESS
  #5396 = String             #5397        // MailerTemplateId
  #5397 = Utf8               MailerTemplateId
  #5398 = Fieldref           #27.#5399    // ext/mods/Config.DONATION_MAILER_TEMPLATE:Ljava/lang/String;
  #5399 = NameAndType        #5400:#43    // DONATION_MAILER_TEMPLATE:Ljava/lang/String;
  #5400 = Utf8               DONATION_MAILER_TEMPLATE
  #5401 = String             #5402        // MaximumNumberEmails
  #5402 = Utf8               MaximumNumberEmails
  #5403 = Fieldref           #27.#5404    // ext/mods/Config.DONATION_MAXIMUM_NUMBER_EMAILS:I
  #5404 = NameAndType        #5405:#86    // DONATION_MAXIMUM_NUMBER_EMAILS:I
  #5405 = Utf8               DONATION_MAXIMUM_NUMBER_EMAILS
  #5406 = String             #5407        // PayTime
  #5407 = Utf8               PayTime
  #5408 = Fieldref           #27.#5409    // ext/mods/Config.DONATION_PAY_TIME:I
  #5409 = NameAndType        #5410:#86    // DONATION_PAY_TIME:I
  #5410 = Utf8               DONATION_PAY_TIME
  #5411 = String             #5412        // CheckTime
  #5412 = Utf8               CheckTime
  #5413 = Fieldref           #27.#5414    // ext/mods/Config.DONATION_CHECK_TIME:I
  #5414 = NameAndType        #5415:#86    // DONATION_CHECK_TIME:I
  #5415 = Utf8               DONATION_CHECK_TIME
  #5416 = String             #5417        // Loading gameserver configuration files.
  #5417 = Utf8               Loading gameserver configuration files.
  #5418 = Methodref          #27.#5419    // ext/mods/Config.loadOfflineShop:()V
  #5419 = NameAndType        #5420:#6     // loadOfflineShop:()V
  #5420 = Utf8               loadOfflineShop
  #5421 = Methodref          #27.#5422    // ext/mods/Config.loadSafeDisconnect:()V
  #5422 = NameAndType        #5423:#6     // loadSafeDisconnect:()V
  #5423 = Utf8               loadSafeDisconnect
  #5424 = Methodref          #27.#5425    // ext/mods/Config.loadBossZerg:()V
  #5425 = NameAndType        #5426:#6     // loadBossZerg:()V
  #5426 = Utf8               loadBossZerg
  #5427 = Methodref          #27.#5428    // ext/mods/Config.loadClans:()V
  #5428 = NameAndType        #5429:#6     // loadClans:()V
  #5429 = Utf8               loadClans
  #5430 = Methodref          #27.#5431    // ext/mods/Config.loadEvents:()V
  #5431 = NameAndType        #5432:#6     // loadEvents:()V
  #5432 = Utf8               loadEvents
  #5433 = Methodref          #27.#5434    // ext/mods/Config.loadGeoengine:()V
  #5434 = NameAndType        #5435:#6     // loadGeoengine:()V
  #5435 = Utf8               loadGeoengine
  #5436 = Methodref          #27.#5437    // ext/mods/Config.loadHexID:()V
  #5437 = NameAndType        #5438:#6     // loadHexID:()V
  #5438 = Utf8               loadHexID
  #5439 = Methodref          #27.#5440    // ext/mods/Config.loadLanguage:()V
  #5440 = NameAndType        #5441:#6     // loadLanguage:()V
  #5441 = Utf8               loadLanguage
  #5442 = Methodref          #27.#5443    // ext/mods/Config.loadProtection:()V
  #5443 = NameAndType        #5444:#6     // loadProtection:()V
  #5444 = Utf8               loadProtection
  #5445 = Methodref          #27.#5446    // ext/mods/Config.loadNpcs:()V
  #5446 = NameAndType        #5447:#6     // loadNpcs:()V
  #5447 = Utf8               loadNpcs
  #5448 = Methodref          #27.#5449    // ext/mods/Config.loadPlayers:()V
  #5449 = NameAndType        #5450:#6     // loadPlayers:()V
  #5450 = Utf8               loadPlayers
  #5451 = Methodref          #27.#5452    // ext/mods/Config.loadSieges:()V
  #5452 = NameAndType        #5453:#6     // loadSieges:()V
  #5453 = Utf8               loadSieges
  #5454 = Methodref          #27.#5455    // ext/mods/Config.loadServer:()V
  #5455 = NameAndType        #5456:#6     // loadServer:()V
  #5456 = Utf8               loadServer
  #5457 = Methodref          #27.#5458    // ext/mods/Config.loadRates:()V
  #5458 = NameAndType        #5459:#6     // loadRates:()V
  #5459 = Utf8               loadRates
  #5460 = Methodref          #27.#5461    // ext/mods/Config.loadRusAcis:()V
  #5461 = NameAndType        #5462:#6     // loadRusAcis:()V
  #5462 = Utf8               loadRusAcis
  #5463 = Methodref          #27.#5464    // ext/mods/Config.loadDonation:()V
  #5464 = NameAndType        #5465:#6     // loadDonation:()V
  #5465 = Utf8               loadDonation
  #5466 = Methodref          #27.#5467    // ext/mods/Config.loadTranslator:()V
  #5467 = NameAndType        #5468:#6     // loadTranslator:()V
  #5468 = Utf8               loadTranslator
  #5469 = Methodref          #27.#5470    // ext/mods/Config.loadBossJewelUpgrades:()V
  #5470 = NameAndType        #5471:#6     // loadBossJewelUpgrades:()V
  #5471 = Utf8               loadBossJewelUpgrades
  #5472 = Methodref          #27.#5473    // ext/mods/Config.loadBossHealConfigs:()V
  #5473 = NameAndType        #5474:#6     // loadBossHealConfigs:()V
  #5474 = Utf8               loadBossHealConfigs
  #5475 = String             #5476        // Loading loginserver configuration files.
  #5476 = Utf8               Loading loginserver configuration files.
  #5477 = Methodref          #27.#5478    // ext/mods/Config.loadLogin:()V
  #5478 = NameAndType        #5479:#6     // loadLogin:()V
  #5479 = Utf8               loadLogin
  #5480 = String             #5481        // Loading account manager configuration files.
  #5481 = Utf8               Loading account manager configuration files.
  #5482 = String             #5483        // Loading gameserver registration configuration files.
  #5483 = Utf8               Loading gameserver registration configuration files.
  #5484 = Fieldref           #27.#5485    // ext/mods/Config.BOSS_RESPAWN_PATTERN:Ljava/util/regex/Pattern;
  #5485 = NameAndType        #5486:#5487  // BOSS_RESPAWN_PATTERN:Ljava/util/regex/Pattern;
  #5486 = Utf8               BOSS_RESPAWN_PATTERN
  #5487 = Utf8               Ljava/util/regex/Pattern;
  #5488 = String             #5489        //
  #5489 = Utf8
  #5490 = Methodref          #215.#5491   // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #5491 = NameAndType        #5492:#5493  // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #5492 = Utf8               replace
  #5493 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #5494 = Methodref          #5495.#5496  // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #5495 = Class              #5497        // java/util/regex/Pattern
  #5496 = NameAndType        #5498:#5499  // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #5497 = Utf8               java/util/regex/Pattern
  #5498 = Utf8               matcher
  #5499 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #5500 = Methodref          #5501.#5502  // java/util/regex/Matcher.matches:()Z
  #5501 = Class              #5503        // java/util/regex/Matcher
  #5502 = NameAndType        #5504:#384   // matches:()Z
  #5503 = Utf8               java/util/regex/Matcher
  #5504 = Utf8               matches
  #5505 = Methodref          #5501.#5506  // java/util/regex/Matcher.group:(I)Ljava/lang/String;
  #5506 = NameAndType        #5507:#225   // group:(I)Ljava/lang/String;
  #5507 = Utf8               group
  #5508 = Methodref          #5509.#5510  // java/lang/Long.parseLong:(Ljava/lang/String;)J
  #5509 = Class              #5511        // java/lang/Long
  #5510 = NameAndType        #5512:#5513  // parseLong:(Ljava/lang/String;)J
  #5511 = Utf8               java/lang/Long
  #5512 = Utf8               parseLong
  #5513 = Utf8               (Ljava/lang/String;)J
  #5514 = Long               24l
  #5516 = Long               3600000l
  #5518 = InterfaceMethodref #1255.#5519  // java/util/Map.of:()Ljava/util/Map;
  #5519 = NameAndType        #2147:#5520  // of:()Ljava/util/Map;
  #5520 = Utf8               ()Ljava/util/Map;
  #5521 = Methodref          #215.#5522   // java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
  #5522 = NameAndType        #393:#5523   // split:(Ljava/lang/String;I)[Ljava/lang/String;
  #5523 = Utf8               (Ljava/lang/String;I)[Ljava/lang/String;
  #5524 = Methodref          #215.#5525   // java/lang/String.charAt:(I)C
  #5525 = NameAndType        #5526:#5527  // charAt:(I)C
  #5526 = Utf8               charAt
  #5527 = Utf8               (I)C
  #5528 = Methodref          #5529.#5530  // java/lang/Class.getName:()Ljava/lang/String;
  #5529 = Class              #5531        // java/lang/Class
  #5530 = NameAndType        #5532:#380   // getName:()Ljava/lang/String;
  #5531 = Utf8               java/lang/Class
  #5532 = Utf8               getName
  #5533 = Methodref          #35.#12      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #5534 = String             #5535        // ext.mods.Config.devMode
  #5535 = Utf8               ext.mods.Config.devMode
  #5536 = String             #5537        // false
  #5537 = Utf8               false
  #5538 = Methodref          #2099.#203   // java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #5539 = String             #5540        // true
  #5540 = Utf8               true
  #5541 = Methodref          #215.#5542   // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #5542 = NameAndType        #5543:#219   // equalsIgnoreCase:(Ljava/lang/String;)Z
  #5543 = Utf8               equalsIgnoreCase
  #5544 = Fieldref           #27.#5545    // ext/mods/Config.DEV_MODE:Z
  #5545 = NameAndType        #5546:#57    // DEV_MODE:Z
  #5546 = Utf8               DEV_MODE
  #5547 = String             #5548        // ext.mods.Config.basePath
  #5548 = Utf8               ext.mods.Config.basePath
  #5549 = String             #5550        // .
  #5550 = Utf8               .
  #5551 = InterfaceMethodref #5074.#5552  // java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #5552 = NameAndType        #2147:#4159  // of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
  #5553 = Fieldref           #27.#5554    // ext/mods/Config.BASE_PATH:Ljava/nio/file/Path;
  #5554 = NameAndType        #5555:#5070  // BASE_PATH:Ljava/nio/file/Path;
  #5555 = Utf8               BASE_PATH
  #5556 = String             #5557        // ext.mods.Config.dataPath
  #5557 = Utf8               ext.mods.Config.dataPath
  #5558 = String             #5559        // data
  #5559 = Utf8               data
  #5560 = Fieldref           #27.#5561    // ext/mods/Config.DATA_PATH:Ljava/nio/file/Path;
  #5561 = NameAndType        #5562:#5070  // DATA_PATH:Ljava/nio/file/Path;
  #5562 = Utf8               DATA_PATH
  #5563 = String             #5564        // ext.mods.Config.configPath
  #5564 = Utf8               ext.mods.Config.configPath
  #5565 = String             #5566        // config
  #5566 = Utf8               config
  #5567 = String             #5568        // chatfilter.txt
  #5568 = Utf8               chatfilter.txt
  #5569 = String             #5570        // bossHeal.properties
  #5570 = Utf8               bossHeal.properties
  #5571 = String             #5572        // clans.properties
  #5572 = Utf8               clans.properties
  #5573 = String             #5574        // events.properties
  #5574 = Utf8               events.properties
  #5575 = String             #5576        // geoengine.properties
  #5576 = Utf8               geoengine.properties
  #5577 = String             #5578        // hexid.txt
  #5578 = Utf8               hexid.txt
  #5579 = String             #5580        // language.properties
  #5580 = Utf8               language.properties
  #5581 = String             #5582        // loginserver.properties
  #5582 = Utf8               loginserver.properties
  #5583 = String             #5584        // npcs.properties
  #5584 = Utf8               npcs.properties
  #5585 = String             #5586        // offlineshop.properties
  #5586 = Utf8               offlineshop.properties
  #5587 = String             #5588        // players.properties
  #5588 = Utf8               players.properties
  #5589 = String             #5590        // rates.properties
  #5590 = Utf8               rates.properties
  #5591 = String             #5592        // project.properties
  #5592 = Utf8               project.properties
  #5593 = String             #5594        // server.properties
  #5594 = Utf8               server.properties
  #5595 = String             #5596        // safedisconnect.properties
  #5596 = Utf8               safedisconnect.properties
  #5597 = String             #5598        // bosszerg.properties
  #5598 = Utf8               bosszerg.properties
  #5599 = String             #5600        // siege.properties
  #5600 = Utf8               siege.properties
  #5601 = String             #5602        // protection.properties
  #5602 = Utf8               protection.properties
  #5603 = String             #5604        // translator.properties
  #5604 = Utf8               translator.properties
  #5605 = String             #5606        // items.properties
  #5606 = Utf8               items.properties
  #5607 = Fieldref           #27.#5608    // ext/mods/Config.FST_KEY:B
  #5608 = NameAndType        #5609:#1125  // FST_KEY:B
  #5609 = Utf8               FST_KEY
  #5610 = Fieldref           #27.#5611    // ext/mods/Config.SCN_KEY:B
  #5611 = NameAndType        #5612:#1125  // SCN_KEY:B
  #5612 = Utf8               SCN_KEY
  #5613 = Fieldref           #27.#5614    // ext/mods/Config.ANP_KEY:B
  #5614 = NameAndType        #5615:#1125  // ANP_KEY:B
  #5615 = Utf8               ANP_KEY
  #5616 = Fieldref           #27.#5617    // ext/mods/Config.ULT_KEY:B
  #5617 = NameAndType        #5618:#1125  // ULT_KEY:B
  #5618 = Utf8               ULT_KEY
  #5619 = Fieldref           #27.#5620    // ext/mods/Config.NPROTECT_KEY:I
  #5620 = NameAndType        #5621:#86    // NPROTECT_KEY:I
  #5621 = Utf8               NPROTECT_KEY
  #5622 = String             #5623        // BossJewelUpgrades.properties
  #5623 = Utf8               BossJewelUpgrades.properties
  #5624 = InterfaceMethodref #446.#5625   // java/util/Set.of:(Ljava/lang/Object;)Ljava/util/Set;
  #5625 = NameAndType        #2147:#5626  // of:(Ljava/lang/Object;)Ljava/util/Set;
  #5626 = Utf8               (Ljava/lang/Object;)Ljava/util/Set;
  #5627 = String             #5628        // http://ip-api.com/json/%s?fields=status,country,countryCode
  #5628 = Utf8               http://ip-api.com/json/%s?fields=status,country,countryCode
  #5629 = Fieldref           #27.#5630    // ext/mods/Config.COUNTRY_LOCALE_MAP:Ljava/util/Map;
  #5630 = NameAndType        #5631:#1247  // COUNTRY_LOCALE_MAP:Ljava/util/Map;
  #5631 = Utf8               COUNTRY_LOCALE_MAP
  #5632 = Fieldref           #27.#5633    // ext/mods/Config.RESERVE_HOST_ON_LOGIN:Z
  #5633 = NameAndType        #5634:#57    // RESERVE_HOST_ON_LOGIN:Z
  #5634 = Utf8               RESERVE_HOST_ON_LOGIN
  #5635 = Fieldref           #27.#5636    // ext/mods/Config.MMO_SELECTOR_SLEEP_TIME:I
  #5636 = NameAndType        #5637:#86    // MMO_SELECTOR_SLEEP_TIME:I
  #5637 = Utf8               MMO_SELECTOR_SLEEP_TIME
  #5638 = Fieldref           #27.#5639    // ext/mods/Config.MMO_MAX_SEND_PER_PASS:I
  #5639 = NameAndType        #5640:#86    // MMO_MAX_SEND_PER_PASS:I
  #5640 = Utf8               MMO_MAX_SEND_PER_PASS
  #5641 = Fieldref           #27.#5642    // ext/mods/Config.MMO_MAX_READ_PER_PASS:I
  #5642 = NameAndType        #5643:#86    // MMO_MAX_READ_PER_PASS:I
  #5643 = Utf8               MMO_MAX_READ_PER_PASS
  #5644 = Fieldref           #27.#5645    // ext/mods/Config.MMO_HELPER_BUFFER_COUNT:I
  #5645 = NameAndType        #5646:#86    // MMO_HELPER_BUFFER_COUNT:I
  #5646 = Utf8               MMO_HELPER_BUFFER_COUNT
  #5647 = Fieldref           #27.#5648    // ext/mods/Config.CLIENT_PACKET_QUEUE_SIZE:I
  #5648 = NameAndType        #5649:#86    // CLIENT_PACKET_QUEUE_SIZE:I
  #5649 = Utf8               CLIENT_PACKET_QUEUE_SIZE
  #5650 = Fieldref           #27.#5651    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_BURST_SIZE:I
  #5651 = NameAndType        #5652:#86    // CLIENT_PACKET_QUEUE_MAX_BURST_SIZE:I
  #5652 = Utf8               CLIENT_PACKET_QUEUE_MAX_BURST_SIZE
  #5653 = Fieldref           #27.#5654    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND:I
  #5654 = NameAndType        #5655:#86    // CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND:I
  #5655 = Utf8               CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND
  #5656 = Fieldref           #27.#5657    // ext/mods/Config.CLIENT_PACKET_QUEUE_MEASURE_INTERVAL:I
  #5657 = NameAndType        #5658:#86    // CLIENT_PACKET_QUEUE_MEASURE_INTERVAL:I
  #5658 = Utf8               CLIENT_PACKET_QUEUE_MEASURE_INTERVAL
  #5659 = Fieldref           #27.#5660    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND:I
  #5660 = NameAndType        #5661:#86    // CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND:I
  #5661 = Utf8               CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND
  #5662 = Fieldref           #27.#5663    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN:I
  #5663 = NameAndType        #5664:#86    // CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN:I
  #5664 = Utf8               CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN
  #5665 = Fieldref           #27.#5666    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN:I
  #5666 = NameAndType        #5667:#86    // CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN:I
  #5667 = Utf8               CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN
  #5668 = Fieldref           #27.#5669    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN:I
  #5669 = NameAndType        #5670:#86    // CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN:I
  #5670 = Utf8               CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN
  #5671 = Fieldref           #27.#5672    // ext/mods/Config.CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN:I
  #5672 = NameAndType        #5673:#86    // CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN:I
  #5673 = Utf8               CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN
  #5674 = String             #5675        // ^(\\d+)d\\+(\\d+)h(?:\\+(\\d+)h)?$
  #5675 = Utf8               ^(\\d+)d\\+(\\d+)h(?:\\+(\\d+)h)?$
  #5676 = Methodref          #5495.#5677  // java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
  #5677 = NameAndType        #5678:#5679  // compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
  #5678 = Utf8               compile
  #5679 = Utf8               (Ljava/lang/String;I)Ljava/util/regex/Pattern;
  #5680 = Utf8               Signature
  #5681 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #5682 = Utf8               Ljava/util/List<Lext/mods/Config$JewelUpgrade;>;
  #5683 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #5684 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #5685 = Utf8               Ljava/util/List<[I>;
  #5686 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<[I>;>;
  #5687 = Utf8               Ljava/util/Set<Ljava/util/Locale;>;
  #5688 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #5689 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Double;>;
  #5690 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #5691 = Utf8               TRANSLATOR_ENABLE
  #5692 = Utf8               Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #5693 = Utf8               Ljava/util/Map<Ljava/lang/Integer;[J>;
  #5694 = Utf8               Code
  #5695 = Utf8               LineNumberTable
  #5696 = Utf8               LocalVariableTable
  #5697 = Utf8               this
  #5698 = Utf8               Lext/mods/Config;
  #5699 = Utf8               e
  #5700 = Utf8               Ljava/lang/Exception;
  #5701 = Utf8               filename
  #5702 = Utf8               result
  #5703 = Utf8               Lext/mods/commons/config/ExProperties;
  #5704 = Utf8               StackMapTable
  #5705 = Utf8               offline
  #5706 = Utf8               Ljava/lang/NumberFormatException;
  #5707 = Utf8               safeDisconnect
  #5708 = Utf8               nameColor
  #5709 = Utf8               trimmed
  #5710 = Utf8               part
  #5711 = Utf8               parts
  #5712 = Utf8               ids
  #5713 = Utf8               bossZerg
  #5714 = Utf8               flagColor
  #5715 = Utf8               prayerIds
  #5716 = Utf8               ignoredBossIds
  #5717 = Utf8               ignoredIds
  #5718 = Utf8               LocalVariableTypeTable
  #5719 = Utf8               clans
  #5720 = Utf8               id
  #5721 = Utf8               bossHeal
  #5722 = Utf8               blockedIds
  #5723 = Utf8               nfe
  #5724 = Utf8               itm
  #5725 = Utf8               Ljava/lang/Integer;
  #5726 = Utf8               item
  #5727 = Utf8               itemData
  #5728 = Utf8               coordSplit
  #5729 = Utf8               coordPlayer
  #5730 = Utf8               reward
  #5731 = Utf8               rewards
  #5732 = Utf8               value
  #5733 = Utf8               rewardSplit
  #5734 = Utf8               pos
  #5735 = Utf8               countPosRewards
  #5736 = Utf8               classId
  #5737 = Utf8               events
  #5738 = Utf8               CtfFighterBuffs
  #5739 = Utf8               CtfMageBuffs
  #5740 = Utf8               propertySplit
  #5741 = Utf8               i
  #5742 = Utf8               DmFighterBuffs
  #5743 = Utf8               DmMageBuffs
  #5744 = Utf8               propertySplitLM
  #5745 = Utf8               LmFighterBuffs
  #5746 = Utf8               LmMageBuffs
  #5747 = Utf8               tvTDoorsToOpen
  #5748 = Utf8               tvTDoorsToClose
  #5749 = Utf8               TvtFighterBuffs
  #5750 = Utf8               TvtMageBuffs
  #5751 = Utf8               geoengine
  #5752 = Utf8               hexid
  #5753 = Utf8               serverId
  #5754 = Utf8               language
  #5755 = Utf8               (ILjava/lang/String;)V
  #5756 = Utf8               hexId
  #5757 = Utf8               out
  #5758 = Utf8               Ljava/io/OutputStream;
  #5759 = Utf8               file
  #5760 = Utf8               Ljava/io/File;
  #5761 = Utf8               hexSetting
  #5762 = Utf8               Ljava/util/Properties;
  #5763 = Utf8               npcs
  #5764 = Utf8               players
  #5765 = Utf8               sieges
  #5766 = Utf8               Protect
  #5767 = Utf8               key_client
  #5768 = Utf8               key_server
  #5769 = Utf8               keyS
  #5770 = Utf8               tmpS
  #5771 = Utf8               keyC
  #5772 = Utf8               tmpC
  #5773 = Utf8               server
  #5774 = Utf8               items
  #5775 = Utf8               itemsGcSeconds
  #5776 = Utf8               rateSplit
  #5777 = Utf8               rate
  #5778 = Utf8               rates
  #5779 = Utf8               skillSplit
  #5780 = Utf8               skill
  #5781 = Utf8               Ljava/util/stream/Stream;
  #5782 = Utf8               Ljava/io/IOException;
  #5783 = Utf8               name
  #5784 = Utf8               buffs
  #5785 = Utf8               s
  #5786 = Utf8               rusacis
  #5787 = Utf8               autoLootItemIds
  #5788 = Utf8               raidRespawn
  #5789 = Utf8               [J
  #5790 = Utf8               grandRespawn
  #5791 = Utf8               Ljava/util/stream/Stream<Ljava/lang/String;>;
  #5792 = Class              #5789        // "[J"
  #5793 = Utf8               properties
  #5794 = Utf8               translator
  #5795 = Utf8               itemId
  #5796 = Utf8               enchantLevel
  #5797 = Utf8               newItemId
  #5798 = Utf8               upgrade
  #5799 = Utf8               bossJewelUpgrades
  #5800 = Utf8               jewelUpgrades
  #5801 = Class              #388         // "[I"
  #5802 = Utf8               pix
  #5803 = Utf8               donation
  #5804 = Utf8               loadGameServer
  #5805 = Utf8               loadLoginServer
  #5806 = Utf8               loadAccountManager
  #5807 = Utf8               loadGameServerRegistration
  #5808 = Utf8               defaultValue
  #5809 = Utf8               systemValue
  #5810 = Utf8               Ljava/util/regex/Matcher;
  #5811 = Utf8               days
  #5812 = Utf8               hours
  #5813 = Utf8               randomGroup
  #5814 = Utf8               randomHours
  #5815 = Utf8               baseMs
  #5816 = Utf8               randomMs
  #5817 = Utf8               npcId
  #5818 = Utf8               respawn
  #5819 = Utf8               entry
  #5820 = Utf8               overrides
  #5821 = Utf8               entries
  #5822 = Utf8               (Ljava/lang/String;)Ljava/util/Map<Ljava/lang/Integer;[J>;
  #5823 = Utf8               lambda$loadRusAcis$0
  #5824 = Utf8               line
  #5825 = Utf8               <clinit>
  #5826 = Utf8               SourceFile
  #5827 = Utf8               Config.java
  #5828 = Utf8               NestMembers
  #5829 = Utf8               BootstrapMethods
  #5830 = String             #5831        // 0x\u0001
  #5831 = Utf8               0x\u0001
  #5832 = MethodType         #5833        //  (Ljava/lang/Object;)I
  #5833 = Utf8               (Ljava/lang/Object;)I
  #5834 = MethodHandle       5:#236       // REF_invokeVirtual java/lang/Integer.intValue:()I
  #5835 = MethodType         #5836        //  (Ljava/lang/Integer;)I
  #5836 = Utf8               (Ljava/lang/Integer;)I
  #5837 = String             #5838        // CTFDoors: Wrong doorId passed: \u0001
  #5838 = Utf8               CTFDoors: Wrong doorId passed: \u0001
  #5839 = String             #5840        // DMEventPlayerCoordinates \"\u0001\"
  #5840 = Utf8               DMEventPlayerCoordinates \"\u0001\"
  #5841 = String             #5842        // DMEventReward \"\u0001\"
  #5842 = Utf8               DMEventReward \"\u0001\"
  #5843 = String             #5844        // DMDoors: Wrong doorId passed: \u0001
  #5844 = Utf8               DMDoors: Wrong doorId passed: \u0001
  #5845 = String             #5846        // LMEventPlayerCoordinates \"\u0001\"
  #5846 = Utf8               LMEventPlayerCoordinates \"\u0001\"
  #5847 = String             #5848        // LMDoors: Wrong doorId passed: \u0001
  #5848 = Utf8               LMDoors: Wrong doorId passed: \u0001
  #5849 = String             #5850        // TVTDoors: Wrong doorId passed: \u0001
  #5850 = Utf8               TVTDoors: Wrong doorId passed: \u0001
  #5851 = MethodType         #1391        //  (Ljava/lang/Object;)Ljava/lang/Object;
  #5852 = MethodHandle       6:#2133      // REF_invokeStatic java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #5853 = MethodType         #2138        //  (Ljava/lang/String;)Ljava/util/Locale;
  #5854 = String             #5855        // [DynamicXpRates]: invalid config property -> DynamicXpRates \"\u0001\"
  #5855 = Utf8               [DynamicXpRates]: invalid config property -> DynamicXpRates \"\u0001\"
  #5856 = String             #5857        // [DynamicXpRates]: invalid config property -> DynamicXpRates \"\u0001\"\u0001
  #5857 = Utf8               [DynamicXpRates]: invalid config property -> DynamicXpRates \"\u0001\"\u0001
  #5858 = String             #5859        // [SkillDurationList]: invalid config property -> SkillDurationList \"\u0001\"
  #5859 = Utf8               [SkillDurationList]: invalid config property -> SkillDurationList \"\u0001\"
  #5860 = String             #5861        // [SkillDurationList]: invalid config property -> SkillList \"\u0001\"\u0001
  #5861 = Utf8               [SkillDurationList]: invalid config property -> SkillList \"\u0001\"\u0001
  #5862 = MethodHandle       5:#377       // REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
  #5863 = MethodType         #229         //  (Ljava/lang/String;)Ljava/lang/String;
  #5864 = MethodType         #413         //  (Ljava/lang/Object;)Z
  #5865 = MethodHandle       6:#5866      // REF_invokeStatic ext/mods/Config.lambda$loadRusAcis$0:(Ljava/lang/String;)Z
  #5866 = Methodref          #27.#5867    // ext/mods/Config.lambda$loadRusAcis$0:(Ljava/lang/String;)Z
  #5867 = NameAndType        #5823:#219   // lambda$loadRusAcis$0:(Ljava/lang/String;)Z
  #5868 = MethodType         #219         //  (Ljava/lang/String;)Z
  #5869 = String             #5870        // Loaded \u0001 Filter Words.
  #5870 = Utf8               Loaded \u0001 Filter Words.
  #5871 = String             #5872        // Auto loot item ids: Wrong ItemId passed: \u0001
  #5872 = Utf8               Auto loot item ids: Wrong ItemId passed: \u0001
  #5873 = MethodHandle       6:#5874      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #5874 = Methodref          #5875.#5876  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #5875 = Class              #5877        // java/lang/invoke/StringConcatFactory
  #5876 = NameAndType        #228:#5878   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #5877 = Utf8               java/lang/invoke/StringConcatFactory
  #5878 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #5879 = MethodHandle       6:#5880      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #5880 = Methodref          #5881.#5882  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #5881 = Class              #5883        // java/lang/invoke/LambdaMetafactory
  #5882 = NameAndType        #5884:#5885  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #5883 = Utf8               java/lang/invoke/LambdaMetafactory
  #5884 = Utf8               metafactory
  #5885 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #5886 = Utf8               InnerClasses
  #5887 = Utf8               ClassMasterSettings
  #5888 = Utf8               JewelUpgrade
  #5889 = Class              #5890        // java/lang/invoke/MethodHandles$Lookup
  #5890 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #5891 = Class              #5892        // java/lang/invoke/MethodHandles
  #5892 = Utf8               java/lang/invoke/MethodHandles
  #5893 = Utf8               Lookup
{
  public static final boolean DEV_MODE;
    descriptor: Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.nio.file.Path BASE_PATH;
    descriptor: Ljava/nio/file/Path;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.nio.file.Path DATA_PATH;
    descriptor: Ljava/nio/file/Path;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.nio.file.Path CONFIG_PATH;
    descriptor: Ljava/nio/file/Path;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.lang.String GEOENGINE_FILE;
    descriptor: Ljava/lang/String;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static byte[] GUARD_CLIENT_CRYPT_KEY;
    descriptor: [B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte[] GUARD_CLIENT_CRYPT;
    descriptor: [B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte[] GUARD_SERVER_CRYPT_KEY;
    descriptor: [B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte[] GUARD_SERVER_CRYPT;
    descriptor: [B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_GUARD_SYSTEM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PROTECT_WINDOWS_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GET_CLIENT_HWID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_CONSOLE_LOG;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROTECT_KICK_WITH_EMPTY_HWID;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROTECT_KICK_WITH_LASTERROR_HWID;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte FST_KEY;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte SCN_KEY;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte ANP_KEY;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte ULT_KEY;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NPROTECT_KEY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BLOCK_HEAL_ON_RAIDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BLOCK_HEAL_ON_GRANDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Set<java.lang.Integer> BLOCKED_HEAL_SKILL_IDS;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5681                        // Ljava/util/Set<Ljava/lang/Integer;>;

  public static java.lang.String HEAL_BLOCK_MESSAGE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean UPGRADE_BOSS_JEWELS_ENCHANT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<ext.mods.Config$JewelUpgrade> UPGRADE_BOSS_JEWELS;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5682                        // Ljava/util/List<Lext/mods/Config$JewelUpgrade;>;

  public static java.util.Set<java.lang.Integer> UPGRADEABLE_BOSS_JEWELS;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5681                        // Ljava/util/Set<Ljava/lang/Integer;>;

  public static int CLAN_JOIN_DAYS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLAN_CREATE_DAYS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLAN_DISSOLVE_DAYS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ALLY_JOIN_DAYS_WHEN_LEAVED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ALLY_JOIN_DAYS_WHEN_DISMISSED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ACCEPT_CLAN_DAYS_WHEN_DISMISSED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CREATE_ALLY_DAYS_WHEN_DISSOLVED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_NUM_OF_CLANS_IN_ALLY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLAN_MEMBERS_FOR_WAR;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLAN_WAR_PENALTY_WHEN_ENDED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean MEMBERS_CAN_WITHDRAW_FROM_CLANWH;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_REFRESH_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_REFRESH_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_APPROVE_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_APPROVE_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_MAINTENANCE_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_SAVE_PERIOD_RATE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long CS_TELE_FEE_RATIO;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_TELE1_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_TELE2_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long CS_MPREG_FEE_RATIO;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_MPREG1_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_MPREG2_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_MPREG3_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_MPREG4_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long CS_HPREG_FEE_RATIO;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_HPREG1_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_HPREG2_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_HPREG3_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_HPREG4_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_HPREG5_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long CS_EXPREG_FEE_RATIO;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_EXPREG1_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_EXPREG2_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_EXPREG3_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_EXPREG4_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long CS_SUPPORT_FEE_RATIO;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_SUPPORT1_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_SUPPORT2_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_SUPPORT3_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CS_SUPPORT4_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OLY_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_START_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long OLY_CPERIOD;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long OLY_BATTLE;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long OLY_WPERIOD;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long OLY_VPERIOD;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_WAIT_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_WAIT_BATTLE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_WAIT_END;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_START_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_WEEKLY_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_MIN_MATCHES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_CLASSED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_NONCLASSED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OLY_BLOCK_SAME_HWID;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.gameserver.model.holder.IntIntHolder[] OLY_CLASSED_REWARD;
    descriptor: [Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.gameserver.model.holder.IntIntHolder[] OLY_NONCLASSED_REWARD;
    descriptor: [Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_GP_PER_POINT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_HERO_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_RANK1_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_RANK2_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_RANK3_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_RANK4_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_RANK5_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_MAX_POINTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_DIVIDER_CLASSED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_DIVIDER_NON_CLASSED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OLY_ANNOUNCE_GAMES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_ENCHANT_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OLY_SHOW_MONTHLY_WINNERS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SEVEN_SIGNS_BYPASS_PREREQUISITES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FESTIVAL_MIN_PLAYER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAXIMUM_PLAYER_CONTRIB;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SUBCLASS_REQUIRE_MIMIR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SUBCLASS_REQUIRE_FATE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FS_PARTY_MEMBER_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_MIN_PARTY_SIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_AUTO_JUMPS_TIME_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_AUTO_JUMPS_TIME_RND;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ENTER_COST_RECRUIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ENTER_COST_SOLDIER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ENTER_COST_OFFICER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ENTER_COST_CAPTAIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ENTER_COST_COMMANDER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ENTER_COST_HERO;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RIFT_ANAKAZEL_PORT_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LOTTERY_PRIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LOTTERY_TICKET_PRICE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double LOTTERY_5_NUMBER_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double LOTTERY_4_NUMBER_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double LOTTERY_3_NUMBER_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LOTTERY_2_AND_1_NUMBER_PRIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_FISH_CHAMPIONSHIP;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FISH_CHAMPIONSHIP_REWARD_ITEM;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FISH_CHAMPIONSHIP_REWARD_1;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FISH_CHAMPIONSHIP_REWARD_2;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FISH_CHAMPIONSHIP_REWARD_3;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FISH_CHAMPIONSHIP_REWARD_4;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FISH_CHAMPIONSHIP_REWARD_5;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int COFFER_PRICE_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int COFFER_PRICE_AMOUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean EVENT_COMMANDS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CTF_EVENT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] CTF_EVENT_INTERVAL;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_PARTICIPATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_RUNNING_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CTF_NPC_LOC_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_PARTICIPATION_NPC_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_TEAM_1_HEADQUARTERS_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_TEAM_2_HEADQUARTERS_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_TEAM_1_FLAG;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_TEAM_2_FLAG;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_CAPTURE_SKILL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] CTF_EVENT_PARTICIPATION_FEE;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] CTF_EVENT_PARTICIPATION_NPC_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_MIN_PLAYERS_IN_TEAMS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_MAX_PLAYERS_IN_TEAMS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte CTF_EVENT_MIN_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte CTF_EVENT_MAX_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_RESPAWN_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_START_LEAVE_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CTF_EVENT_TEAM_1_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] CTF_EVENT_TEAM_1_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] CTF_EVENT_TEAM_1_FLAG_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CTF_EVENT_TEAM_2_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] CTF_EVENT_TEAM_2_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] CTF_EVENT_TEAM_2_FLAG_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.gameserver.model.holder.IntIntHolder[] CTF_EVENT_REWARDS;
    descriptor: [Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CTF_EVENT_SCROLL_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CTF_EVENT_POTIONS_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CTF_EVENT_SUMMON_BY_ITEM_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> CTF_DOORS_IDS_TO_OPEN;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static java.util.List<java.lang.Integer> CTF_DOORS_IDS_TO_CLOSE;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean CTF_REWARD_TEAM_TIE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_EFFECTS_REMOVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.lang.Integer> CTF_EVENT_FIGHTER_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.util.Map<java.lang.Integer, java.lang.Integer> CTF_EVENT_MAGE_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static boolean ALLOW_CTF_DLG;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CTF_EVENT_MAX_PARTICIPANTS_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DM_EVENT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] DM_EVENT_INTERVAL;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_PARTICIPATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_RUNNING_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DM_NPC_LOC_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_PARTICIPATION_NPC_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] DM_EVENT_PARTICIPATION_FEE;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] DM_EVENT_PARTICIPATION_NPC_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_MIN_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_MAX_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte DM_EVENT_MIN_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte DM_EVENT_MAX_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<int[]> DM_EVENT_PLAYER_COORDINATES;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5685                        // Ljava/util/List<[I>;

  public static int DM_EVENT_RESPAWN_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_START_LEAVE_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DM_SHOW_TOP_RANK;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_TOP_RANK;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_REWARD_FIRST_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.util.List<int[]>> DM_EVENT_REWARDS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5686                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<[I>;>;

  public static boolean DM_REWARD_PLAYERS_TIE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DM_EVENT_SCROLL_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DM_EVENT_POTIONS_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DM_EVENT_SUMMON_BY_ITEM_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> DM_DOORS_IDS_TO_OPEN;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static java.util.List<java.lang.Integer> DM_DOORS_IDS_TO_CLOSE;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static int DM_EVENT_EFFECTS_REMOVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.lang.Integer> DM_EVENT_FIGHTER_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.util.Map<java.lang.Integer, java.lang.Integer> DM_EVENT_MAGE_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.lang.String DISABLE_ID_CLASSES_STRING_DM;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> DISABLE_ID_CLASSES_DM;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean ALLOW_DM_DLG;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DM_EVENT_MAX_PARTICIPANTS_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LM_EVENT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] LM_EVENT_INTERVAL;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_PARTICIPATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LM_EVENT_HERO;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LV_EVENT_HERO_DAYS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_RUNNING_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String LM_NPC_LOC_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_PARTICIPATION_NPC_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static short LM_EVENT_PLAYER_CREDITS;
    descriptor: S
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] LM_EVENT_PARTICIPATION_NPC_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] LM_EVENT_PARTICIPATION_FEE;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_MIN_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_MAX_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_RESPAWN_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_START_LEAVE_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<int[]> LM_EVENT_PLAYER_COORDINATES;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5685                        // Ljava/util/List<[I>;

  public static ext.mods.gameserver.model.holder.IntIntHolder[] LM_EVENT_REWARDS;
    descriptor: [Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LM_EVENT_SCROLL_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LM_EVENT_POTIONS_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LM_EVENT_SUMMON_BY_ITEM_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> LM_DOORS_IDS_TO_OPEN;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static java.util.List<java.lang.Integer> LM_DOORS_IDS_TO_CLOSE;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean LM_REWARD_PLAYERS_TIE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte LM_EVENT_MIN_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte LM_EVENT_MAX_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_EFFECTS_REMOVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.lang.Integer> LM_EVENT_FIGHTER_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.util.Map<java.lang.Integer, java.lang.Integer> LM_EVENT_MAGE_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.lang.String DISABLE_ID_CLASSES_STRING_LM;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> DISABLE_ID_CLASSES_LM;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean ALLOW_LM_DLG;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LM_EVENT_MAX_PARTICIPANTS_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean TVT_EVENT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] TVT_EVENT_INTERVAL;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_PARTICIPATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_RUNNING_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String TVT_NPC_LOC_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_PARTICIPATION_NPC_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] TVT_EVENT_PARTICIPATION_NPC_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] TVT_EVENT_PARTICIPATION_FEE;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_MIN_PLAYERS_IN_TEAMS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_MAX_PLAYERS_IN_TEAMS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_RESPAWN_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_START_LEAVE_TELEPORT_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String TVT_EVENT_TEAM_1_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] TVT_EVENT_TEAM_1_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String TVT_EVENT_TEAM_2_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] TVT_EVENT_TEAM_2_COORDINATES;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.gameserver.model.holder.IntIntHolder[] TVT_EVENT_REWARDS;
    descriptor: [Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean TVT_EVENT_SCROLL_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean TVT_EVENT_POTIONS_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean TVT_EVENT_SUMMON_BY_ITEM_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> TVT_DOORS_IDS_TO_OPEN;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static java.util.List<java.lang.Integer> TVT_DOORS_IDS_TO_CLOSE;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean TVT_REWARD_TEAM_TIE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte TVT_EVENT_MIN_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte TVT_EVENT_MAX_LVL;
    descriptor: B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_EFFECTS_REMOVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.lang.Integer> TVT_EVENT_FIGHTER_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.util.Map<java.lang.Integer, java.lang.Integer> TVT_EVENT_MAGE_BUFFS;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static boolean TVT_REWARD_PLAYER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String TVT_EVENT_ON_KILL;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DISABLE_ID_CLASSES_STRING_TVT;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> DISABLE_ID_CLASSES_TVT;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean ALLOW_TVT_DLG;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TVT_EVENT_MAX_PARTICIPANTS_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String GEODATA_PATH;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.gameserver.enums.GeoType GEODATA_TYPE;
    descriptor: Lext/mods/gameserver/enums/GeoType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_GEOPATH_FAIL_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PART_OF_CHARACTER_HEIGHT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_OBSTACLE_HEIGHT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NPC_Z_INDEX;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MOVE_WEIGHT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MOVE_WEIGHT_DIAG;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OBSTACLE_WEIGHT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OBSTACLE_WEIGHT_DIAG;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_BOUNDARY_CELL_PENALTY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOUNDARY_CELL_PENALTY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOUNDARY_BUFFER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int HEURISTIC_WEIGHT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_ITERATIONS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SERVER_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static byte[] HEX_ID;
    descriptor: [B
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Locale DEFAULT_LOCALE;
    descriptor: Ljava/util/Locale;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Set<java.util.Locale> LOCALES;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5687                        // Ljava/util/Set<Ljava/util/Locale;>;

  public static java.nio.charset.Charset CHARSET;
    descriptor: Ljava/nio/charset/Charset;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean COUNTRY_LOCALE_ENABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean COUNTRY_LOCALE_NOTIFY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean COUNTRY_LOCALE_AUTO_SET;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String COUNTRY_LOCALE_API_URL;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int COUNTRY_LOCALE_TIMEOUT_MS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static final java.util.Map<java.lang.String, java.lang.String> COUNTRY_LOCALE_MAP;
    descriptor: Ljava/util/Map;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Signature: #5688                        // Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;

  public static java.lang.String LOGINSERVER_HOSTNAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LOGINSERVER_PORT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LOGIN_TRY_BEFORE_BAN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LOGIN_BLOCK_AFTER_BAN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ACCEPT_NEW_GAMESERVER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_LICENCE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_CREATE_ACCOUNTS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean FLOOD_PROTECTION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FAST_CONNECTION_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NORMAL_CONNECTION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FAST_CONNECTION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_CONNECTION_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_CONNECT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double SPAWN_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] SPAWN_EVENTS;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MONSTER_MAX_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_FREQUENCY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMP_MIN_LVL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMP_MAX_LVL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_HP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_HP_REGEN;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_RATE_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_RATE_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_CHAMPION_RATE_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_CHAMPION_RATE_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PREMIUM_CHAMPION_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_ADENAS_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_SEALSTONE_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PREMIUM_CHAMPION_ADENAS_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PREMIUM_CHAMPION_SEALSTONE_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_SPOIL_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PREMIUM_CHAMPION_SPOIL_REWARDS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_ATK;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_MATK;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_SPD_ATK;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CHAMPION_SPD_MATK;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_REWARD;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_REWARD_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_REWARD_QTY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAMPION_AURA;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_ENTIRE_TREE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.Config$ClassMasterSettings CLASS_MASTER_SETTINGS;
    descriptor: Lext/mods/Config$ClassMasterSettings;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALTERNATE_CLASS_MASTER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NOBLE_ITEM_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NOBLE_ITEM_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WEDDING_PRICE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean WEDDING_SAMESEX;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean WEDDING_FORMALWEAR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BUFFER_MAX_SCHEMES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BUFFER_STATIC_BUFF_COST;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean FREE_TELEPORT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LVL_FREE_TELEPORT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANNOUNCE_MAMMON_SPAWN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean MOB_AGGRO_IN_PEACEZONE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_NPC_LVL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String SHOW_NPC_TITLE_FORMAT;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String SHOW_NPC_TITLE_COLOR;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_NPC_CREST;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_SUMMON_CREST;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WYVERN_REQUIRED_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WYVERN_REQUIRED_CRYSTALS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RAID_DISABLE_CURSE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WAIT_TIME_ANTHARAS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEED_ITEM_ANTHARAS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WAIT_TIME_VALAKAS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEED_ITEM_VALAKAS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WAIT_TIME_FRINTEZZA;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FRINTEZZA_MINIMUM_ALLOWED_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FRINTEZZA_MAXIMUM_ALLOWED_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FRINTEZZA_MINIMUM_PARTIES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FRINTEZZA_MAXIMUM_PARTIES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEED_ITEM_FRINTEZZA;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEED_ITEM_BAIUM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEED_ITEM_SHILEN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GUARD_ATTACK_AGGRO_MOB;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RANDOM_WALK_RATE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_DRIFT_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DEBUG_MELEE_ATTACK;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_GUARD_CHAT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GUARD_CHAT_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GUARD_CHATTY_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GUARD_SAY_NORMAL_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long GUARD_SAY_NORMAL_PERIOD;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long GUARD_SAY_AGGRO_PERIOD;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NPC_ANIMATION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MONSTER_ANIMATION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DEFAULT_SEE_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SUMMON_DRIFT_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] RAID_BOSS_LIST;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] EPIC_BOSS_LIST;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_TRADE_ENABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_CRAFT_ENABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_MODE_IN_PEACE_ZONE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_MODE_NO_DAMAGE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RESTORE_OFFLINERS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OFFLINE_MAX_DAYS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_DISCONNECT_FINISHED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_SLEEP_EFFECT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RESTORE_STORE_ITEMS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean EFFECT_CANCELING;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double HP_REGEN_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MP_REGEN_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CP_REGEN_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_SPAWN_PROTECTION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_FAKEDEATH_UP_PROTECTION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RESPAWN_RESTORE_HP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PVTSTOREBUY_SLOTS_DWARF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PVTSTOREBUY_SLOTS_OTHER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PVTSTORESELL_SLOTS_DWARF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PVTSTORESELL_SLOTS_OTHER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DEEPBLUE_DROP_RULES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_DELEVEL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DEATH_PENALTY_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int INVENTORY_MAXIMUM_NO_DWARF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int INVENTORY_MAXIMUM_DWARF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int INVENTORY_MAXIMUM_PET;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_ITEM_IN_PACKET;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double WEIGHT_LIMIT;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WAREHOUSE_SLOTS_NO_DWARF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WAREHOUSE_SLOTS_DWARF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WAREHOUSE_SLOTS_CLAN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FREIGHT_SLOTS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean REGION_BASED_FREIGHT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int FREIGHT_PRICE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_NG_SKILL_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_NG_GLOW_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_MID_SKILL_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_MID_GLOW_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_HIGH_SKILL_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_HIGH_GLOW_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_TOP_SKILL_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_TOP_GLOW_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUGMENTATION_BASESTAT_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_PLAYER_CAN_SHOP;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_PLAYER_CAN_USE_GK;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_PLAYER_CAN_TELEPORT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_PLAYER_CAN_TRADE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_PLAYER_CAN_USE_WH;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_DROP_GM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean KARMA_AWARD_PK_KILL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KARMA_PK_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] KARMA_NONDROPPABLE_PET_ITEMS;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] KARMA_NONDROPPABLE_ITEMS;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PVP_NORMAL_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PVP_PVP_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String PARTY_XP_CUTOFF_METHOD;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PARTY_XP_CUTOFF_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PARTY_XP_CUTOFF_PERCENT;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PARTY_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DEFAULT_ACCESS_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GM_HERO_AURA;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GM_STARTUP_INVULNERABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GM_STARTUP_INVISIBLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GM_STARTUP_BLOCK_ALL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GM_STARTUP_AUTO_LIST;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PETITIONING_ALLOWED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PETITIONS_PER_PLAYER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PETITIONS_PENDING;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean IS_CRAFTING_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DWARF_RECIPE_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int COMMON_RECIPE_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_LEARN_SKILLS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int LVL_AUTO_LEARN_SKILLS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean MAGIC_FAILURES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PERFECT_SHIELD_BLOCK_RATE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LIFE_CRYSTAL_NEEDED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SP_BOOK_NEEDED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ES_SP_BOOK_NEEDED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DIVINE_SP_BOOK_NEEDED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SUBCLASS_WITHOUT_QUESTS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean STORE_SKILL_COOLTIME;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean EXPERTISE_PENALTY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_BUFFS_AMOUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SIEGE_LENGTH;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MINIMUM_CLAN_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_ATTACKERS_NUMBER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_DEFENDERS_NUMBER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CH_MINIMUM_CLAN_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CH_MAX_ATTACKERS_NUMBER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SIEGE_INFO;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String HOSTNAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String GAMESERVER_HOSTNAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GAMESERVER_PORT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String GAMESERVER_LOGIN_HOSTNAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GAMESERVER_LOGIN_PORT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int REQUEST_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ACCEPT_ALTERNATE_ID;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean USE_BLOWFISH_CIPHER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DATABASE_URL;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DATABASE_LOGIN;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DATABASE_PASSWORD;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CNAME_TEMPLATE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATE_CNAME_TEMPLATE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String TITLE_TEMPLATE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String PET_NAME_TEMPLATE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CLAN_ALLY_NAME_TEMPLATE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SERVER_LIST_BRACKET;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SERVER_LIST_CLOCK;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SERVER_LIST_AGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SERVER_LIST_TESTSERVER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SERVER_LIST_PVPSERVER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SERVER_GMONLY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DELETE_DAYS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAXIMUM_ONLINE_USERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_LOOT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_LOOT_HERBS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_LOOT_RAID;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_DISCARDITEM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean MULTIPLE_ITEM_DROP;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int HERB_AUTO_DESTROY_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ITEM_AUTO_DESTROY_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int EQUIPABLE_ITEM_AUTO_DESTROY_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.lang.Integer> SPECIAL_ITEM_DESTROY_TIME;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5684                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static int PLAYER_DROPPED_ITEM_MULTIPLIER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ITEMS_GC_CLEANUP_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ITEMS_GC_CLEANUP_TIME_MS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_PARTY_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_PARTY_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_DROP_CURRENCY;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_DROP_SEAL_STONE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_DROP_ITEMS;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_DROP_ITEMS_BY_RAID;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_DROP_ITEMS_BY_GRAND;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_DROP_SPOIL;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_DROP_CURRENCY;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_DROP_SEAL_STONE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_DROP_SPOIL;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_DROP_ITEMS;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_DROP_ITEMS_BY_RAID;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_DROP_ITEMS_BY_GRAND;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_QUEST_DROP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_QUEST_REWARD;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_QUEST_REWARD_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_QUEST_REWARD_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PREMIUM_RATE_QUEST_REWARD_ADENA;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DYNAMIC_XP;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, java.lang.Double> DYNAMIC_XP_RATES;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5689                        // Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Double;>;

  public static double RATE_DROP_HERBS;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RATE_DROP_MANOR;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_QUEST_DROP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_QUEST_REWARD;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_QUEST_REWARD_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_QUEST_REWARD_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_QUEST_REWARD_ADENA;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_KARMA_EXP_LOST;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RATE_SIEGE_GUARDS_PRICE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_DROP_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_RATE_DROP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_RATE_DROP_ITEM;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_RATE_DROP_EQUIP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PLAYER_RATE_DROP_EQUIP_WEAPON;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KARMA_DROP_LIMIT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KARMA_RATE_DROP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KARMA_RATE_DROP_ITEM;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KARMA_RATE_DROP_EQUIP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KARMA_RATE_DROP_EQUIP_WEAPON;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double PET_XP_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PET_FOOD_RATE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double SINEATER_XP_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_RATE_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_RATE_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_RATE_XP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_RATE_SP;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_FREIGHT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_WAREHOUSE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_WEAR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WEAR_DELAY;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int WEAR_PRICE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_LOTTERY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_WATER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_BOAT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_CURSED_WEAPONS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_SHADOW_WEAPONS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_MANOR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_FALLING_DAMAGE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NO_SPAWNS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DEVELOPER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PACKET_HANDLER_DEBUG;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.String> CLIENT_PACKETS;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5690                        // Ljava/util/List<Ljava/lang/String;>;

  public static java.util.List<java.lang.String> SERVER_PACKETS;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5690                        // Ljava/util/List<Ljava/lang/String;>;

  public static boolean LOG_CHAT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean LOG_ITEMS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DROP_ITEMS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GMAUDIT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_CUSTOM_BBS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_COMMUNITY_BOARD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String BBS_DEFAULT;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ROLL_DICE_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int HERO_VOICE_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SUBCLASS_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DROP_ITEM_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SERVER_BYPASS_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MULTISELL_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANUFACTURE_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MANOR_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SENDMAIL_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHARACTER_SELECT_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GLOBAL_CHAT_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int TRADE_CHAT_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SOCIAL_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ITEM_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ACTION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SCHEDULED_THREAD_POOL_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int INSTANT_THREAD_POOL_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean L2WALKER_PROTECTION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SERVER_NEWS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ZONE_TOWN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean TRANSLATOR_ENABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DEEPL_AUTH_KEY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DEEP_CONTEXT_STRING;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.String> DO_NOT_TRANSLATE;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5690                        // Ljava/util/List<Ljava/lang/String;>;

  public static boolean RESERVE_HOST_ON_LOGIN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MMO_SELECTOR_SLEEP_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MMO_MAX_SEND_PER_PASS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MMO_MAX_READ_PER_PASS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MMO_HELPER_BUFFER_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_SIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_BURST_SIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MEASURE_INTERVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean INFINITY_SS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean INFINITY_ARROWS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean INFINITY_SS_PREMIUM_ONLY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean INFINITY_ARROWS_PREMIUM_ONLY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OLY_USE_CUSTOM_PERIOD_SETTINGS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static ext.mods.gameserver.model.olympiad.enums.OlympiadPeriod OLY_PERIOD;
    descriptor: Lext/mods/gameserver/model/olympiad/enums/OlympiadPeriod;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OLY_PERIOD_MULTIPLIER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_MODIFY_SKILL_DURATION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.HashMap<java.lang.Integer, java.lang.Integer> SKILL_DURATION_LIST;
    descriptor: Ljava/util/HashMap;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5692                        // Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public static java.lang.String GLOBAL_CHAT;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String TRADE_CHAT;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAT_ALL_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAT_TELL_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAT_SHOUT_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CHAT_TRADE_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_MENU;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROP_STOP_EXP;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROP_TRADE_REFUSAL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROP_AUTO_LOOT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROP_BUFF_PROTECTED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_ONLINE_COMMAND;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MULTIPLIER_ONLINE_COMMAND;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOTS_PREVENTION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOTS_LOGS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KILLS_COUNTER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int KILLS_COUNTER_RANDOMIZATION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int VALIDATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PUNISHMENT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PUNISHMENT_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean USE_PREMIUM_SERVICE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALTERNATE_DROP_LIST;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ATTACK_PTS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SUBCLASS_SKILLS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean GAME_SUBCLASS_EVERYWHERE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_NPC_INFO;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ALLOW_GRAND_BOSSES_TELEPORT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.String> FILTER_LIST;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5690                        // Ljava/util/List<Ljava/lang/String;>;

  public static boolean USE_SAY_FILTER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CHAT_FILTER_CHARS;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CABAL_BUFFER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SUPER_HASTE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String RESTRICTED_CHAR_NAMES;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.String> LIST_RESTRICTED_CHAR_NAMES;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5690                        // Ljava/util/List<Ljava/lang/String;>;

  public static int FAKE_ONLINE_AMOUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String BUFFS_CATEGORY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.String> PREMIUM_BUFFS_CATEGORY;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5690                        // Ljava/util/List<Ljava/lang/String;>;

  public static boolean ANTIFEED_ENABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANTIFEED_DUALBOX;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANTIFEED_DISCONNECTED_AS_DUALBOX;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ANTIFEED_INTERVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DUALBOX_CHECK_MAX_PLAYERS_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DUALBOX_CHECK_MAX_OLYMPIAD_PARTICIPANTS_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.List<java.lang.Integer> AUTO_LOOT_ITEM_IDS;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5683                        // Ljava/util/List<Ljava/lang/Integer;>;

  public static boolean NPC_STAT_MULTIPLIERS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MONSTER_HP_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MONSTER_MP_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MONSTER_PATK_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MONSTER_MATK_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MONSTER_PDEF_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MONSTER_MDEF_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_HP_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_MP_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_PATK_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_MATK_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_PDEF_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double RAIDBOSS_MDEF_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_HP_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_MP_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_PATK_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_MATK_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_PDEF_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double GRANDBOSS_MDEF_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean HIT_TIME;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_RAID_HTM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SHOW_EPIC_HTM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RAID_BOSS_TELEPORT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean EPIC_BOSS_TELEPORT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_TELEPORT_MIN_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_TELEPORT_MAX_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_TELEPORT_ITEM_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long BOSS_TELEPORT_ITEM_COUNT;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean USE_CONFIG_RAID_GRAND_BOSS_RESPAWN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long RAID_BOSS_RESPAWN_BASE_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long RAID_BOSS_RESPAWN_RANDOM_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long GRAND_BOSS_RESPAWN_BASE_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long GRAND_BOSS_RESPAWN_RANDOM_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Map<java.lang.Integer, long[]> RAID_BOSS_RESPAWN_OVERRIDES;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5693                        // Ljava/util/Map<Ljava/lang/Integer;[J>;

  public static java.util.Map<java.lang.Integer, long[]> GRAND_BOSS_RESPAWN_OVERRIDES;
    descriptor: Ljava/util/Map;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5693                        // Ljava/util/Map<Ljava/lang/Integer;[J>;

  public static java.lang.String TIME_ZONE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DATE_FORMAT;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CUSTOM_BUFFER_MANAGER_NPC;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] SKIP_CATEGORY;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BARAKIEL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CREATURE_SEE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEW_REGEN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CATACOMBS_IN_ANY_PERIOD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean STRICT_SEVENSIGNS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CLASS_OVERLORD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RACE_ELF;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RESTRICTED_CLASSES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BANKING_SYSTEM_GOLDBARS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BANKING_SYSTEM_ADENA;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_COMMAND_GOLDBAR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_POTIONS_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_POTIONS_IN_OLYMPIAD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTO_POTION_MIN_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int ACP_PERIOD;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_CP_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_HP_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTO_MP_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Set<java.lang.Integer> AUTO_CP_ITEM_IDS;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5681                        // Ljava/util/Set<Ljava/lang/Integer;>;

  public static java.util.Set<java.lang.Integer> AUTO_HP_ITEM_IDS;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5681                        // Ljava/util/Set<Ljava/lang/Integer;>;

  public static java.util.Set<java.lang.Integer> AUTO_MP_ITEM_IDS;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5681                        // Ljava/util/Set<Ljava/lang/Integer;>;

  public static int MULTISELL_MAX_AMOUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLED_AUCTION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUCTION_LIMIT_ITEM;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUCTION_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUCTION_ITEM_FEE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String AUCTION_ITEM_FEE_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_ALLOW_DUALBOX;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_SEND_LOG_MESSAGES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_CHANGE_PLAYER_TITLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_CHANGE_PLAYER_NAME_COLOR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_DISABLE_TOWN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double AUTOFARM_HP_HEAL_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double AUTOFARM_MP_HEAL_RATE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_ZONE_AREA;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_ROUTE_PERIMITER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_ZONES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_ROUTES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_ZONE_NODES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_ROUTE_NODES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_DEBUFF_CHANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_TIMER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_OPEN_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] AUTOFARM_HP_POTIONS;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] AUTOFARM_MP_POTIONS;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String AUTOFARM_PLAYER_NAME_COLOR;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AUTOFARM_DEBUG_RETURN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_OFFLINE_FARM_COMMAND;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_FARM_PREMIUM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean OFFLINE_FARM_LOGOUT_ON_DEATH;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DUALBOX_CHECK_MAX_OFFLINEPLAY_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DUALBOX_CHECK_MAX_OFFLINEPLAY_PREMIUM_PER_IP;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DUALBOX_COUNT_OFFLINE_TRADERS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean AWAY_PLAY_SET_NAME_COLOR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String AWAY_PLAY_NAME_COLOR;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int HP_POTION_ITEM_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MP_POTION_ITEM_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int AUTOFARM_MAX_LEVEL_DIFFERENCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean IGNORE_RAID_BOSSES;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean IGNORE_RAID_MINIONS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean IGNORE_AGATHIONS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean IGNORE_CHESTS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SELLBUFF_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SELLBUFF_MP_MULTIPLER;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SELLBUFF_PAYMENT_ID;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long SELLBUFF_MIN_PRICE;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long SELLBUFF_MAX_PRICE;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SELLBUFF_MAX_BUFFS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CUSTOM_TIME_BUFF;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_PIX_MOD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANNOUNCE_DONATOR_ITEM_GLOBAL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_PURCHASABLE_ITEM;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_DELETE_INACTIVE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_DELETE_PAYMENT_DATA;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_HIDE_ENDED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_CALCULATOR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_DROPDOWN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_REQUIRE_TERMS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] DONATION_ALLOWED_EMAILS;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_TOKEN;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_PIX_PRICE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_MP_PIX;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_MP_PIX_EXPIRATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_MP_PIX_MAIL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_PIX_ACCOUNT_OWNER;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_PIX_ACCOUNT_CPF;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_PIX_ACCOUNT_BANK;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] DONATION_MP_PIX_DROPDOWN;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_LINK_PRICE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_MP_LINK;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_MP_LINK_MAIL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MP_CURRENCY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] DONATION_MP_CURRENCIES;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_MP_LINK_EXPIRATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] DONATION_MP_LINK_DROPDOWN;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_PAYPAL_LINK;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_CLIENT_ID;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_CLIENT_SECRET;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_PRICE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_PAYPAL_SANDBOX_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_ACCOUNT_EMAIL;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_PAYPAL_MAIL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_PAYPAL_LINK_EXPIRATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_CURRENCY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] DONATION_PAYPAL_CURRENCIES;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] DONATION_PAYPAL_DROPDOWN;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_WEBSITE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_NOTE_MSG;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_LOGO_IMAGE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_PHONE_CODE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_PAYPAL_PHONE_NUMBER;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_BINANCE_PAY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_BINANCE_API_KEY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_BINANCE_SECRET_KEY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_BINANCE_PRICE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_BINANCE_FIAT_CURRENCY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String[] DONATION_BINANCE_PAY_CURRENCY;
    descriptor: [Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_BINANCE_MAIL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_BINANCE_EXPIRATION_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] DONATION_BINANCE_DROPDOWN;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_BINANCE_CURRENCY_TASK_INTERVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_CURRENCY_CB_API_KEY;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean DONATION_CURRENCY_AWESOMEAPI;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_CURRENCY_TASK_INTERVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MAILER_TOKEN;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MAILER_ADDRESS;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_MAILER_TEMPLATE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_MAXIMUM_NUMBER_EMAILS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String DONATION_SERVER_NAME;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_PAY_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int DONATION_CHECK_TIME;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENTER_ANAKAZEL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_RUN_SPEED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PATK;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_MATK;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PCRIT_RATE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_MCRIT_RATE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_PATK_SPEED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_MATK_SPEED;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_EVASION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NEW_FOLLOW;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_MISSION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RANDOM_PVP_ZONE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PTS_EMULATION_SPAWN;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PTS_EMULATION_SPAWN_DURATION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean STOP_TOGGLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANNOUNCE_DIE_RAIDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANNOUNCE_SPAWN_RAIDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANNOUNCE_DIE_GRANDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ANNOUNCE_SPAWN_GRANDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean PROXY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NPC_SOULSHOT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean NPC_SPIRITSHOT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RETURN_HOME_MONSTER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RETURN_HOME_MONSTER_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean RETURN_HOME_RAIDBOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int RETURN_HOME_RAIDBOSS_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CANCEL_RETURN_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CANCEL_RETURN_MODE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CANCEL_RETURN_MASS_ONLY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CANCEL_RETURN_MASS_MIN_COUNT;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CANCEL_RETURN_TIME_MS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CANCEL_RETURN_SKIP_OLYMPIAD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean CANCEL_RETURN_NOTIFY;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String CANCEL_RETURN_MESSAGE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SISTEMA_PATHFINDING;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean USE_OPTIMIZED_MOVEMENT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_CLIENT_SIDE_PREDICTION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MOVEMENT_VALIDATION_INTERVAL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double MOVEMENT_RECONCILIATION_THRESHOLD;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PATHFINDING_MAX_NODES;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PATHFINDING_MAX_ITERATIONS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_PATH_SMOOTHING;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GEOENGINE_CACHE_SIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_PATHFINDING_CACHE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PATHFINDING_CACHE_SIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PATHFINDING_CACHE_EXPIRATION;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PATHFINDING_THREADS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean USE_PATHFINDING_POOL;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean USE_L2BR_PATHFINDING;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_SMOOTH_OBSTACLE_AVOIDANCE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OBSTACLE_SMOOTHING_DISTANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int OBSTACLE_DETECTION_DISTANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int PATHFINDING_SMOOTHING_LEVEL;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ATTACK_USE_PATHFINDER;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int GEO_HEIGHT_TOLERANCE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SHORT_DISTANCE_THRESHOLD;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_SHORT_DISTANCE_HEIGHT_DIFF;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_CONSECUTIVE_BLOCKS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_NPC_MOVEMENT_OPTIMIZATION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int NPC_MOVEMENT_PLAYER_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean ENABLE_CREATURE_COLLISION;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CREATURE_COLLISION_CHECK_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int CREATURE_COLLISION_AVOIDANCE_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int MAX_ALTERNATIVE_POSITIONS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double CREATURE_COLLISION_PUSH_FORCE;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long SAFEDISCONNECT_TIMEOUT_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_ALLOW_OLYMPIAD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_ALLOW_BOSS;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_ALLOW_QUEST;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_ALLOW_FARM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_OLYMPIAD;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_DUNGEON;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_TOURNAMENT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_TVT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_CTF;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_DM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INTEGRATION_LM;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_INVULNERABLE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_IMMOBILIZE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean SAFEDISCONNECT_CHANGE_NAME_COLOR;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int SAFEDISCONNECT_NAME_COLOR;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long SAFEDISCONNECT_AUTOFARM_RESTORE_DELAY_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.lang.String SAFEDISCONNECT_TITLE;
    descriptor: Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_FLAG_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_FLAG_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long BOSS_ZERG_FLAG_RENEW_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_FLAG_MIN_PLAYERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_FLAG_WARNING_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_FLAG_AREA_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_FLAG_AREA_COLOR;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_RANGE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_MIN_PARTY_SIZE;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_MAX_ALLY_MEMBERS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_SHOW_ALLY_COUNT;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_ANNOUNCE;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long BOSS_ZERG_ANNOUNCE_COOLDOWN_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_SHOW_AREA;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int BOSS_ZERG_AREA_RADIUS;
    descriptor: I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static long BOSS_ZERG_CHECK_INTERVAL_MS;
    descriptor: J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_FLAG_AREA_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static boolean BOSS_ZERG_HEAL_PENALTY_ENABLED;
    descriptor: Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double BOSS_ZERG_HEAL_PENALTY_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static double BOSS_ZERG_PRAYER_REVERSE_MULTIPLIER;
    descriptor: D
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static int[] BOSS_ZERG_PRAYER_SKILL_IDS;
    descriptor: [I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC

  public static java.util.Set<java.lang.Integer> BOSS_ZERG_IGNORED_BOSS_IDS;
    descriptor: Ljava/util/Set;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #5681                        // Ljava/util/Set<Ljava/lang/Integer;>;

  public static final ext.mods.commons.config.ExProperties initProperties(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=1
         0: new           #14                 // class ext/mods/commons/config/ExProperties
         3: dup
         4: invokespecial #16                 // Method ext/mods/commons/config/ExProperties."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #17                 // class java/io/File
        12: dup
        13: aload_0
        14: invokespecial #19                 // Method java/io/File."<init>":(Ljava/lang/String;)V
        17: invokevirtual #20                 // Method ext/mods/commons/config/ExProperties.load:(Ljava/io/File;)V
        20: goto          41
        23: astore_2
        24: getstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        27: ldc           #32                 // String An error occured loading \'{}\' config.
        29: aload_2
        30: iconst_1
        31: anewarray     #2                  // class java/lang/Object
        34: dup
        35: iconst_0
        36: aload_0
        37: aastore
        38: invokevirtual #34                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        41: aload_1
        42: areturn
      Exception table:
         from    to  target type
             8    20    23   Class java/lang/Exception
      LineNumberTable:
        line 1298: 0
        line 1302: 8
        line 1307: 20
        line 1304: 23
        line 1306: 24
        line 1309: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      17     2     e   Ljava/lang/Exception;
            0      43     0 filename   Ljava/lang/String;
            8      35     1 result   Lext/mods/commons/config/ExProperties;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class java/lang/String, class ext/mods/commons/config/ExProperties ]
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */

  public static final void saveHexid(int, java.lang.String);
    descriptor: (ILjava/lang/String;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: iload_0
         1: aload_1
         2: getstatic     #2103               // Field HEXID_FILE:Ljava/lang/String;
         5: invokestatic  #2214               // Method saveHexid:(ILjava/lang/String;Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 2331: 0
        line 2332: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0 serverId   I
            0       9     1 hexId   Ljava/lang/String;

  public static final void saveHexid(int, java.lang.String, java.lang.String);
    descriptor: (ILjava/lang/String;Ljava/lang/String;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=7, locals=8, args_size=3
         0: new           #17                 // class java/io/File
         3: dup
         4: aload_2
         5: invokespecial #19                 // Method java/io/File."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #2218               // Method java/io/File.createNewFile:()Z
        13: pop
        14: new           #2221               // class java/util/Properties
        17: dup
        18: invokespecial #2223               // Method java/util/Properties."<init>":()V
        21: astore        4
        23: aload         4
        25: ldc_w         #2106               // String ServerID
        28: iload_0
        29: invokestatic  #2224               // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        32: invokevirtual #2226               // Method java/util/Properties.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
        35: pop
        36: aload         4
        38: ldc_w         #2113               // String HexID
        41: aload_1
        42: invokevirtual #2226               // Method java/util/Properties.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
        45: pop
        46: new           #2230               // class java/io/FileOutputStream
        49: dup
        50: aload_3
        51: invokespecial #2232               // Method java/io/FileOutputStream."<init>":(Ljava/io/File;)V
        54: astore        5
        56: aload         4
        58: aload         5
        60: ldc_w         #2234               // String the hexID to auth into login
        63: invokevirtual #2236               // Method java/util/Properties.store:(Ljava/io/OutputStream;Ljava/lang/String;)V
        66: aload         5
        68: invokevirtual #2240               // Method java/io/OutputStream.close:()V
        71: goto          96
        74: astore        6
        76: aload         5
        78: invokevirtual #2240               // Method java/io/OutputStream.close:()V
        81: goto          93
        84: astore        7
        86: aload         6
        88: aload         7
        90: invokevirtual #2247               // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        93: aload         6
        95: athrow
        96: goto          118
        99: astore_3
       100: getstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       103: ldc_w         #2251               // String Failed to save hex ID to \'{}\' file.
       106: aload_3
       107: iconst_1
       108: anewarray     #2                  // class java/lang/Object
       111: dup
       112: iconst_0
       113: aload_2
       114: aastore
       115: invokevirtual #34                 // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       118: return
      Exception table:
         from    to  target type
            56    66    74   Class java/lang/Throwable
            76    81    84   Class java/lang/Throwable
             0    96    99   Class java/lang/Exception
      LineNumberTable:
        line 2344: 0
        line 2345: 9
        line 2347: 14
        line 2348: 23
        line 2349: 36
        line 2351: 46
        line 2353: 56
        line 2354: 66
        line 2351: 74
        line 2359: 96
        line 2356: 99
        line 2358: 100
        line 2360: 118
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      40     5   out   Ljava/io/OutputStream;
            9      87     3  file   Ljava/io/File;
           23      73     4 hexSetting   Ljava/util/Properties;
          100      18     3     e   Ljava/lang/Exception;
            0     119     0 serverId   I
            0     119     1 hexId   Ljava/lang/String;
            0     119     2 filename   Ljava/lang/String;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ int, class java/lang/String, class java/lang/String, class java/io/File, class java/util/Properties, class java/io/OutputStream ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ int, class java/lang/String, class java/lang/String, class java/io/File, class java/util/Properties, class java/io/OutputStream, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ int, class java/lang/String, class java/lang/String ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 18 /* same */

  public static final void loadGameServer();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc_w         #5416               // String Loading gameserver configuration files.
         6: invokevirtual #4186               // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         9: invokestatic  #5418               // Method loadOfflineShop:()V
        12: invokestatic  #5421               // Method loadSafeDisconnect:()V
        15: invokestatic  #5424               // Method loadBossZerg:()V
        18: invokestatic  #5427               // Method loadClans:()V
        21: invokestatic  #5430               // Method loadEvents:()V
        24: invokestatic  #5433               // Method loadGeoengine:()V
        27: invokestatic  #5436               // Method loadHexID:()V
        30: invokestatic  #5439               // Method loadLanguage:()V
        33: invokestatic  #5442               // Method loadProtection:()V
        36: invokestatic  #5445               // Method loadNpcs:()V
        39: invokestatic  #5448               // Method loadPlayers:()V
        42: invokestatic  #5451               // Method loadSieges:()V
        45: invokestatic  #5454               // Method loadServer:()V
        48: invokestatic  #5457               // Method loadRates:()V
        51: invokestatic  #5460               // Method loadRusAcis:()V
        54: invokestatic  #5463               // Method loadDonation:()V
        57: invokestatic  #5466               // Method loadTranslator:()V
        60: invokestatic  #5469               // Method loadBossJewelUpgrades:()V
        63: invokestatic  #5472               // Method loadBossHealConfigs:()V
        66: return
      LineNumberTable:
        line 3348: 0
        line 3350: 9
        line 3352: 12
        line 3354: 15
        line 3356: 18
        line 3358: 21
        line 3360: 24
        line 3362: 27
        line 3364: 30
        line 3366: 33
        line 3368: 36
        line 3370: 39
        line 3372: 42
        line 3374: 45
        line 3376: 48
        line 3378: 51
        line 3380: 54
        line 3382: 57
        line 3384: 60
        line 3386: 63
        line 3387: 66

  public static final void loadLoginServer();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc_w         #5475               // String Loading loginserver configuration files.
         6: invokevirtual #4186               // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         9: invokestatic  #5477               // Method loadLogin:()V
        12: return
      LineNumberTable:
        line 3391: 0
        line 3393: 9
        line 3394: 12

  public static final void loadAccountManager();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc_w         #5480               // String Loading account manager configuration files.
         6: invokevirtual #4186               // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         9: invokestatic  #5477               // Method loadLogin:()V
        12: return
      LineNumberTable:
        line 3398: 0
        line 3400: 9
        line 3401: 12

  public static final void loadGameServerRegistration();
    descriptor: ()V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc_w         #5482               // String Loading gameserver registration configuration files.
         6: invokevirtual #4186               // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         9: invokestatic  #5477               // Method loadLogin:()V
        12: return
      LineNumberTable:
        line 3405: 0
        line 3407: 9
        line 3408: 12

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #35                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #27                 // class ext/mods/Config
         6: invokevirtual #5528               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #5533               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #26                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: ldc_w         #5534               // String ext.mods.Config.devMode
        18: ldc_w         #5536               // String false
        21: invokestatic  #5538               // Method java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        24: ldc_w         #5539               // String true
        27: invokevirtual #5541               // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        30: putstatic     #5544               // Field DEV_MODE:Z
        33: ldc_w         #5547               // String ext.mods.Config.basePath
        36: ldc_w         #5549               // String .
        39: invokestatic  #5538               // Method java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        42: iconst_0
        43: anewarray     #215                // class java/lang/String
        46: invokestatic  #5551               // InterfaceMethod java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        49: putstatic     #5553               // Field BASE_PATH:Ljava/nio/file/Path;
        52: ldc_w         #5556               // String ext.mods.Config.dataPath
        55: ldc_w         #5558               // String data
        58: invokestatic  #5538               // Method java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        61: iconst_0
        62: anewarray     #215                // class java/lang/String
        65: invokestatic  #5551               // InterfaceMethod java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        68: putstatic     #5560               // Field DATA_PATH:Ljava/nio/file/Path;
        71: ldc_w         #5563               // String ext.mods.Config.configPath
        74: ldc_w         #5565               // String config
        77: invokestatic  #5538               // Method java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        80: iconst_0
        81: anewarray     #215                // class java/lang/String
        84: invokestatic  #5551               // InterfaceMethod java/nio/file/Path.of:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        87: putstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
        90: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
        93: ldc_w         #5567               // String chatfilter.txt
        96: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       101: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       106: putstatic     #4152               // Field CHAT_FILTER_FILE:Ljava/lang/String;
       109: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       112: ldc_w         #5569               // String bossHeal.properties
       115: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       120: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       125: putstatic     #669                // Field BOSS_HEAL_FILE:Ljava/lang/String;
       128: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       131: ldc_w         #5571               // String clans.properties
       134: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       139: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       144: putstatic     #454                // Field CLANS_FILE:Ljava/lang/String;
       147: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       150: ldc_w         #5573               // String events.properties
       153: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       158: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       163: putstatic     #694                // Field EVENTS_FILE:Ljava/lang/String;
       166: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       169: ldc_w         #5575               // String geoengine.properties
       172: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       177: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       182: putstatic     #1821               // Field GEOENGINE_FILE:Ljava/lang/String;
       185: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       188: ldc_w         #5577               // String hexid.txt
       191: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       196: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       201: putstatic     #2103               // Field HEXID_FILE:Ljava/lang/String;
       204: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       207: ldc_w         #5579               // String language.properties
       210: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       215: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       220: putstatic     #2126               // Field LANGUAGE_FILE:Ljava/lang/String;
       223: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       226: ldc_w         #5581               // String loginserver.properties
       229: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       234: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       239: putstatic     #4926               // Field LOGINSERVER_FILE:Ljava/lang/String;
       242: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       245: ldc_w         #5583               // String npcs.properties
       248: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       253: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       258: putstatic     #2253               // Field NPCS_FILE:Ljava/lang/String;
       261: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       264: ldc_w         #5585               // String offlineshop.properties
       267: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       272: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       277: putstatic     #40                 // Field OFFLINE_FILE:Ljava/lang/String;
       280: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       283: ldc_w         #5587               // String players.properties
       286: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       291: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       296: putstatic     #2759               // Field PLAYERS_FILE:Ljava/lang/String;
       299: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       302: ldc_w         #5589               // String rates.properties
       305: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       310: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       315: putstatic     #3662               // Field RATES_FILE:Ljava/lang/String;
       318: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       321: ldc_w         #5591               // String project.properties
       324: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       329: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       334: putstatic     #3938               // Field BR_FILE:Ljava/lang/String;
       337: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       340: ldc_w         #5593               // String server.properties
       343: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       348: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       353: putstatic     #3247               // Field SERVER_FILE:Ljava/lang/String;
       356: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       359: ldc_w         #5595               // String safedisconnect.properties
       362: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       367: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       372: putstatic     #102                // Field SAFE_DISCONNECT_FILE:Ljava/lang/String;
       375: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       378: ldc_w         #5597               // String bosszerg.properties
       381: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       386: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       391: putstatic     #247                // Field BOSS_ZERG_FILE:Ljava/lang/String;
       394: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       397: ldc_w         #5599               // String siege.properties
       400: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       405: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       410: putstatic     #3147               // Field SIEGE_FILE:Ljava/lang/String;
       413: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       416: ldc_w         #5601               // String protection.properties
       419: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       424: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       429: putstatic     #3185               // Field PROTECTION_FILE:Ljava/lang/String;
       432: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       435: ldc_w         #5603               // String translator.properties
       438: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       443: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       448: putstatic     #5003               // Field TRANSLATOR_FILE:Ljava/lang/String;
       451: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       454: ldc_w         #5605               // String items.properties
       457: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       462: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       467: putstatic     #3417               // Field ITEMS_FILE:Ljava/lang/String;
       470: bipush        110
       472: putstatic     #5607               // Field FST_KEY:B
       475: bipush        36
       477: putstatic     #5610               // Field SCN_KEY:B
       480: bipush        -5
       482: putstatic     #5613               // Field ANP_KEY:B
       485: bipush        12
       487: putstatic     #5616               // Field ULT_KEY:B
       490: iconst_m1
       491: putstatic     #5619               // Field NPROTECT_KEY:I
       494: new           #442                // class java/util/HashSet
       497: dup
       498: invokespecial #444                // Method java/util/HashSet."<init>":()V
       501: putstatic     #684                // Field BLOCKED_HEAL_SKILL_IDS:Ljava/util/Set;
       504: getstatic     #5067               // Field CONFIG_PATH:Ljava/nio/file/Path;
       507: ldc_w         #5622               // String BossJewelUpgrades.properties
       510: invokeinterface #5073,  2         // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       515: invokeinterface #5079,  1         // InterfaceMethod java/nio/file/Path.toString:()Ljava/lang/String;
       520: putstatic     #5021               // Field BOSS_JEWEL_UPGRADES_FILE:Ljava/lang/String;
       523: new           #395                // class java/util/ArrayList
       526: dup
       527: invokespecial #1337               // Method java/util/ArrayList."<init>":()V
       530: putstatic     #5040               // Field UPGRADE_BOSS_JEWELS:Ljava/util/List;
       533: new           #442                // class java/util/HashSet
       536: dup
       537: invokespecial #444                // Method java/util/HashSet."<init>":()V
       540: putstatic     #5048               // Field UPGRADEABLE_BOSS_JEWELS:Ljava/util/Set;
       543: iconst_2
       544: newarray       int
       546: putstatic     #1092               // Field CTF_EVENT_PARTICIPATION_FEE:[I
       549: iconst_4
       550: newarray       int
       552: putstatic     #1099               // Field CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
       555: iconst_3
       556: newarray       int
       558: putstatic     #1154               // Field CTF_EVENT_TEAM_1_COORDINATES:[I
       561: iconst_4
       562: newarray       int
       564: putstatic     #1161               // Field CTF_EVENT_TEAM_1_FLAG_COORDINATES:[I
       567: iconst_3
       568: newarray       int
       570: putstatic     #1175               // Field CTF_EVENT_TEAM_2_COORDINATES:[I
       573: iconst_4
       574: newarray       int
       576: putstatic     #1182               // Field CTF_EVENT_TEAM_2_FLAG_COORDINATES:[I
       579: iconst_2
       580: newarray       int
       582: putstatic     #1309               // Field DM_EVENT_PARTICIPATION_FEE:[I
       585: iconst_4
       586: newarray       int
       588: putstatic     #1314               // Field DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
       591: iconst_4
       592: newarray       int
       594: putstatic     #1529               // Field LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
       597: iconst_2
       598: newarray       int
       600: putstatic     #1524               // Field LM_EVENT_PARTICIPATION_FEE:[I
       603: iconst_4
       604: newarray       int
       606: putstatic     #1673               // Field TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
       609: iconst_2
       610: newarray       int
       612: putstatic     #1678               // Field TVT_EVENT_PARTICIPATION_FEE:[I
       615: iconst_3
       616: newarray       int
       618: putstatic     #1730               // Field TVT_EVENT_TEAM_1_COORDINATES:[I
       621: iconst_3
       622: newarray       int
       624: putstatic     #1742               // Field TVT_EVENT_TEAM_2_COORDINATES:[I
       627: ldc_w         #2131               // String en-US
       630: invokestatic  #2133               // Method java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
       633: putstatic     #2139               // Field DEFAULT_LOCALE:Ljava/util/Locale;
       636: getstatic     #2139               // Field DEFAULT_LOCALE:Ljava/util/Locale;
       639: invokestatic  #5624               // InterfaceMethod java/util/Set.of:(Ljava/lang/Object;)Ljava/util/Set;
       642: putstatic     #2165               // Field LOCALES:Ljava/util/Set;
       645: ldc_w         #2170               // String utf-8
       648: invokestatic  #2172               // Method java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
       651: putstatic     #2178               // Field CHARSET:Ljava/nio/charset/Charset;
       654: iconst_1
       655: putstatic     #2189               // Field COUNTRY_LOCALE_NOTIFY:Z
       658: iconst_1
       659: putstatic     #2194               // Field COUNTRY_LOCALE_AUTO_SET:Z
       662: ldc_w         #5627               // String http://ip-api.com/json/%s?fields=status,country,countryCode
       665: putstatic     #2199               // Field COUNTRY_LOCALE_API_URL:Ljava/lang/String;
       668: sipush        2500
       671: putstatic     #2204               // Field COUNTRY_LOCALE_TIMEOUT_MS:I
       674: new           #1241               // class java/util/HashMap
       677: dup
       678: invokespecial #1243               // Method java/util/HashMap."<init>":()V
       681: putstatic     #5629               // Field COUNTRY_LOCALE_MAP:Ljava/util/Map;
       684: iconst_0
       685: putstatic     #5632               // Field RESERVE_HOST_ON_LOGIN:Z
       688: bipush        20
       690: putstatic     #5635               // Field MMO_SELECTOR_SLEEP_TIME:I
       693: bipush        80
       695: putstatic     #5638               // Field MMO_MAX_SEND_PER_PASS:I
       698: bipush        80
       700: putstatic     #5641               // Field MMO_MAX_READ_PER_PASS:I
       703: bipush        20
       705: putstatic     #5644               // Field MMO_HELPER_BUFFER_COUNT:I
       708: getstatic     #5641               // Field MMO_MAX_READ_PER_PASS:I
       711: iconst_2
       712: iadd
       713: putstatic     #5647               // Field CLIENT_PACKET_QUEUE_SIZE:I
       716: getstatic     #5641               // Field MMO_MAX_READ_PER_PASS:I
       719: iconst_1
       720: iadd
       721: putstatic     #5650               // Field CLIENT_PACKET_QUEUE_MAX_BURST_SIZE:I
       724: sipush        320
       727: putstatic     #5653               // Field CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND:I
       730: iconst_5
       731: putstatic     #5656               // Field CLIENT_PACKET_QUEUE_MEASURE_INTERVAL:I
       734: sipush        160
       737: putstatic     #5659               // Field CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND:I
       740: iconst_2
       741: putstatic     #5662               // Field CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN:I
       744: iconst_1
       745: putstatic     #5665               // Field CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN:I
       748: iconst_1
       749: putstatic     #5668               // Field CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN:I
       752: iconst_5
       753: putstatic     #5671               // Field CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN:I
       756: new           #395                // class java/util/ArrayList
       759: dup
       760: invokespecial #1337               // Method java/util/ArrayList."<init>":()V
       763: putstatic     #4212               // Field LIST_RESTRICTED_CHAR_NAMES:Ljava/util/List;
       766: new           #395                // class java/util/ArrayList
       769: dup
       770: invokespecial #1337               // Method java/util/ArrayList."<init>":()V
       773: putstatic     #4228               // Field PREMIUM_BUFFS_CATEGORY:Ljava/util/List;
       776: iconst_0
       777: newarray       int
       779: putstatic     #385                // Field BOSS_ZERG_PRAYER_SKILL_IDS:[I
       782: new           #442                // class java/util/HashSet
       785: dup
       786: invokespecial #444                // Method java/util/HashSet."<init>":()V
       789: putstatic     #450                // Field BOSS_ZERG_IGNORED_BOSS_IDS:Ljava/util/Set;
       792: ldc_w         #5674               // String ^(\\d+)d\\+(\\d+)h(?:\\+(\\d+)h)?$
       795: iconst_2
       796: invokestatic  #5676               // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
       799: putstatic     #5484               // Field BOSS_RESPAWN_PATTERN:Ljava/util/regex/Pattern;
       802: return
      LineNumberTable:
        line 63: 0
        line 65: 15
        line 67: 33
        line 69: 52
        line 71: 71
        line 73: 90
        line 75: 109
        line 76: 128
        line 77: 147
        line 78: 166
        line 79: 185
        line 80: 204
        line 81: 223
        line 82: 242
        line 83: 261
        line 84: 280
        line 85: 299
        line 86: 318
        line 87: 337
        line 88: 356
        line 89: 375
        line 90: 394
        line 91: 413
        line 92: 432
        line 93: 451
        line 107: 470
        line 108: 475
        line 109: 480
        line 110: 485
        line 111: 490
        line 115: 494
        line 118: 504
        line 120: 523
        line 121: 533
        line 274: 543
        line 275: 549
        line 283: 555
        line 284: 561
        line 286: 567
        line 287: 573
        line 308: 579
        line 309: 585
        line 344: 591
        line 345: 597
        line 374: 603
        line 375: 609
        line 381: 615
        line 383: 621
        line 434: 627
        line 435: 636
        line 436: 645
        line 440: 654
        line 441: 658
        line 442: 662
        line 443: 668
        line 444: 674
        line 877: 684
        line 880: 688
        line 881: 693
        line 882: 698
        line 883: 703
        line 886: 708
        line 887: 716
        line 888: 724
        line 889: 730
        line 890: 734
        line 891: 740
        line 892: 744
        line 893: 748
        line 894: 752
        line 954: 756
        line 959: 766
        line 1288: 776
        line 1289: 782
        line 3430: 792
}
SourceFile: "Config.java"
NestMembers:
  ext/mods/Config$ClassMasterSettings
  ext/mods/Config$JewelUpgrade
BootstrapMethods:
  0: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5830 0x\u0001
  1: #5879 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5832 (Ljava/lang/Object;)I
      #5834 REF_invokeVirtual java/lang/Integer.intValue:()I
      #5835 (Ljava/lang/Integer;)I
  2: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5837 CTFDoors: Wrong doorId passed: \u0001
  3: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5839 DMEventPlayerCoordinates \"\u0001\"
  4: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5841 DMEventReward \"\u0001\"
  5: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5843 DMDoors: Wrong doorId passed: \u0001
  6: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5845 LMEventPlayerCoordinates \"\u0001\"
  7: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5847 LMDoors: Wrong doorId passed: \u0001
  8: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5849 TVTDoors: Wrong doorId passed: \u0001
  9: #5879 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5851 (Ljava/lang/Object;)Ljava/lang/Object;
      #5852 REF_invokeStatic java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
      #5853 (Ljava/lang/String;)Ljava/util/Locale;
  10: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5854 [DynamicXpRates]: invalid config property -> DynamicXpRates \"\u0001\"
  11: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5856 [DynamicXpRates]: invalid config property -> DynamicXpRates \"\u0001\"\u0001
  12: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5858 [SkillDurationList]: invalid config property -> SkillDurationList \"\u0001\"
  13: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5860 [SkillDurationList]: invalid config property -> SkillList \"\u0001\"\u0001
  14: #5879 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5851 (Ljava/lang/Object;)Ljava/lang/Object;
      #5862 REF_invokeVirtual java/lang/String.trim:()Ljava/lang/String;
      #5863 (Ljava/lang/String;)Ljava/lang/String;
  15: #5879 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5864 (Ljava/lang/Object;)Z
      #5865 REF_invokeStatic ext/mods/Config.lambda$loadRusAcis$0:(Ljava/lang/String;)Z
      #5868 (Ljava/lang/String;)Z
  16: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5869 Loaded \u0001 Filter Words.
  17: #5873 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #5871 Auto loot item ids: Wrong ItemId passed: \u0001
InnerClasses:
  public static final #5887= #2410 of #27; // ClassMasterSettings=class ext/mods/Config$ClassMasterSettings of class ext/mods/Config
  public static #5888= #5043 of #27;      // JewelUpgrade=class ext/mods/Config$JewelUpgrade of class ext/mods/Config
  public static final #5893= #5889 of #5891; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
