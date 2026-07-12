// Bytecode for: ext.mods.gameserver.communitybbs.custom.IndexCBManager
// File: ext\mods\gameserver\communitybbs\custom\IndexCBManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/custom/IndexCBManager.class
  Last modified 9 de jul de 2026; size 15128 bytes
  MD5 checksum 06dee1a371e1f884cedee29ac19fa461
  Compiled from "IndexCBManager.java"
public class ext.mods.gameserver.communitybbs.custom.IndexCBManager extends ext.mods.gameserver.communitybbs.manager.BaseBBSManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #28                         // ext/mods/gameserver/communitybbs/custom/IndexCBManager
  super_class: #2                         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  interfaces: 0, fields: 1, methods: 17, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // _bbshome
    #8 = Utf8               _bbshome
    #9 = Methodref          #10.#11       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // startsWith:(Ljava/lang/String;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               startsWith
   #14 = Utf8               (Ljava/lang/String;)Z
   #15 = Methodref          #16.#17       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #16 = Class              #18           // ext/mods/gameserver/data/HTMLData
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #18 = Utf8               ext/mods/gameserver/data/HTMLData
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #22 = Class              #24           // ext/mods/gameserver/model/actor/Player
   #23 = NameAndType        #25:#26       // getLocale:()Ljava/util/Locale;
   #24 = Utf8               ext/mods/gameserver/model/actor/Player
   #25 = Utf8               getLocale
   #26 = Utf8               ()Ljava/util/Locale;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getFolder:()Ljava/lang/String;
   #28 = Class              #30           // ext/mods/gameserver/communitybbs/custom/IndexCBManager
   #29 = NameAndType        #31:#32       // getFolder:()Ljava/lang/String;
   #30 = Utf8               ext/mods/gameserver/communitybbs/custom/IndexCBManager
   #31 = Utf8               getFolder
   #32 = Utf8               ()Ljava/lang/String;
   #33 = InvokeDynamic      #0:#34        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #34 = NameAndType        #35:#36       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #35 = Utf8               makeConcatWithConstants
   #36 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #37 = Methodref          #16.#38       // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #38 = NameAndType        #39:#40       // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #39 = Utf8               getHtm
   #40 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
   #41 = String             #42           // <font color=\"FF99FF\">--------</font>
   #42 = Utf8               <font color=\"FF99FF\">--------</font>
   #43 = String             #44           // %name%
   #44 = Utf8               %name%
   #45 = Methodref          #22.#46       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #46 = NameAndType        #47:#32       // getName:()Ljava/lang/String;
   #47 = Utf8               getName
   #48 = Methodref          #10.#49       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #49 = NameAndType        #50:#51       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #50 = Utf8               valueOf
   #51 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #52 = Methodref          #10.#53       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #53 = NameAndType        #54:#55       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #54 = Utf8               replace
   #55 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #56 = String             #57           // %accountName%
   #57 = Utf8               %accountName%
   #58 = Methodref          #22.#59       // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
   #59 = NameAndType        #60:#32       // getAccountName:()Ljava/lang/String;
   #60 = Utf8               getAccountName
   #61 = String             #62           // %class%
   #62 = Utf8               %class%
   #63 = Methodref          #22.#64       // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #64 = NameAndType        #65:#66       // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #65 = Utf8               getTemplate
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
   #68 = Class              #70           // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #69 = NameAndType        #71:#32       // getClassName:()Ljava/lang/String;
   #70 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #71 = Utf8               getClassName
   #72 = String             #73           // %lvl%
   #73 = Utf8               %lvl%
   #74 = Methodref          #22.#75       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #75 = NameAndType        #76:#77       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #76 = Utf8               getStatus
   #77 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #79 = Class              #81           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #80 = NameAndType        #82:#83       // getLevel:()I
   #81 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #82 = Utf8               getLevel
   #83 = Utf8               ()I
   #84 = Methodref          #10.#85       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #85 = NameAndType        #50:#86       // valueOf:(I)Ljava/lang/String;
   #86 = Utf8               (I)Ljava/lang/String;
   #87 = String             #88           // %players%
   #88 = Utf8               %players%
   #89 = Methodref          #90.#91       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #90 = Class              #92           // ext/mods/gameserver/model/World
   #91 = NameAndType        #19:#93       // getInstance:()Lext/mods/gameserver/model/World;
   #92 = Utf8               ext/mods/gameserver/model/World
   #93 = Utf8               ()Lext/mods/gameserver/model/World;
   #94 = Methodref          #90.#95       // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
   #95 = NameAndType        #96:#97       // getPlayers:()Ljava/util/Collection;
   #96 = Utf8               getPlayers
   #97 = Utf8               ()Ljava/util/Collection;
   #98 = InterfaceMethodref #99.#100      // java/util/Collection.size:()I
   #99 = Class              #101          // java/util/Collection
  #100 = NameAndType        #102:#83      // size:()I
  #101 = Utf8               java/util/Collection
  #102 = Utf8               size
  #103 = String             #104          // %pvpkills%
  #104 = Utf8               %pvpkills%
  #105 = Methodref          #22.#106      // ext/mods/gameserver/model/actor/Player.getPvpKills:()I
  #106 = NameAndType        #107:#83      // getPvpKills:()I
  #107 = Utf8               getPvpKills
  #108 = String             #109          // %pkkills%
  #109 = Utf8               %pkkills%
  #110 = Methodref          #22.#111      // ext/mods/gameserver/model/actor/Player.getPkKills:()I
  #111 = NameAndType        #112:#83      // getPkKills:()I
  #112 = Utf8               getPkKills
  #113 = String             #114          // %hpRegen%
  #114 = Utf8               %hpRegen%
  #115 = Methodref          #79.#116      // ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenHp:()D
  #116 = NameAndType        #117:#118     // getRegenHp:()D
  #117 = Utf8               getRegenHp
  #118 = Utf8               ()D
  #119 = Methodref          #28.#120      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getRateNumber:(D)Ljava/lang/String;
  #120 = NameAndType        #121:#122     // getRateNumber:(D)Ljava/lang/String;
  #121 = Utf8               getRateNumber
  #122 = Utf8               (D)Ljava/lang/String;
  #123 = String             #124          // %mpRegen%
  #124 = Utf8               %mpRegen%
  #125 = Methodref          #79.#126      // ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenMp:()D
  #126 = NameAndType        #127:#118     // getRegenMp:()D
  #127 = Utf8               getRegenMp
  #128 = String             #129          // %cpRegen%
  #129 = Utf8               %cpRegen%
  #130 = Methodref          #79.#131      // ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenCp:()D
  #131 = NameAndType        #132:#118     // getRegenCp:()D
  #132 = Utf8               getRegenCp
  #133 = String             #134          // %rec%
  #134 = Utf8               %rec%
  #135 = Methodref          #22.#136      // ext/mods/gameserver/model/actor/Player.getRecomHave:()I
  #136 = NameAndType        #137:#83      // getRecomHave:()I
  #137 = Utf8               getRecomHave
  #138 = Methodref          #139.#140     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #139 = Class              #141          // ext/mods/gameserver/data/sql/ClanTable
  #140 = NameAndType        #19:#142      // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #141 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #142 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #143 = Methodref          #22.#144      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #144 = NameAndType        #145:#83      // getClanId:()I
  #145 = Utf8               getClanId
  #146 = Methodref          #139.#147     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #147 = NameAndType        #148:#149     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #148 = Utf8               getClan
  #149 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #150 = String             #151          // %clan%
  #151 = Utf8               %clan%
  #152 = Methodref          #153.#46      // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #153 = Class              #154          // ext/mods/gameserver/model/pledge/Clan
  #154 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #155 = Methodref          #10.#156      // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #156 = NameAndType        #157:#158     // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #157 = Utf8               replaceAll
  #158 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #159 = String             #160          // <font color=FF0000>No</font>
  #160 = Utf8               <font color=FF0000>No</font>
  #161 = Methodref          #22.#162      // ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
  #162 = NameAndType        #163:#164     // getPremServiceData:()J
  #163 = Utf8               getPremServiceData
  #164 = Utf8               ()J
  #165 = String             #166          // %rate_xp%
  #166 = Utf8               %rate_xp%
  #167 = Fieldref           #168.#169     // ext/mods/Config.PREMIUM_RATE_XP:D
  #168 = Class              #170          // ext/mods/Config
  #169 = NameAndType        #171:#172     // PREMIUM_RATE_XP:D
  #170 = Utf8               ext/mods/Config
  #171 = Utf8               PREMIUM_RATE_XP
  #172 = Utf8               D
  #173 = String             #174          // %rate_sp%
  #174 = Utf8               %rate_sp%
  #175 = Fieldref           #168.#176     // ext/mods/Config.PREMIUM_RATE_SP:D
  #176 = NameAndType        #177:#172     // PREMIUM_RATE_SP:D
  #177 = Utf8               PREMIUM_RATE_SP
  #178 = String             #179          // %rate_adena%
  #179 = Utf8               %rate_adena%
  #180 = Fieldref           #168.#181     // ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
  #181 = NameAndType        #182:#172     // PREMIUM_RATE_DROP_CURRENCY:D
  #182 = Utf8               PREMIUM_RATE_DROP_CURRENCY
  #183 = String             #184          // %rate_seal%
  #184 = Utf8               %rate_seal%
  #185 = Fieldref           #168.#186     // ext/mods/Config.PREMIUM_RATE_DROP_SEAL_STONE:D
  #186 = NameAndType        #187:#172     // PREMIUM_RATE_DROP_SEAL_STONE:D
  #187 = Utf8               PREMIUM_RATE_DROP_SEAL_STONE
  #188 = String             #189          // %rate_items%
  #189 = Utf8               %rate_items%
  #190 = Fieldref           #168.#191     // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
  #191 = NameAndType        #192:#172     // PREMIUM_RATE_DROP_ITEMS:D
  #192 = Utf8               PREMIUM_RATE_DROP_ITEMS
  #193 = String             #194          // %rate_spoil%
  #194 = Utf8               %rate_spoil%
  #195 = Fieldref           #168.#196     // ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
  #196 = NameAndType        #197:#172     // PREMIUM_RATE_DROP_SPOIL:D
  #197 = Utf8               PREMIUM_RATE_DROP_SPOIL
  #198 = String             #199          // %rate_quest%
  #199 = Utf8               %rate_quest%
  #200 = Fieldref           #168.#201     // ext/mods/Config.PREMIUM_RATE_QUEST_DROP:D
  #201 = NameAndType        #202:#172     // PREMIUM_RATE_QUEST_DROP:D
  #202 = Utf8               PREMIUM_RATE_QUEST_DROP
  #203 = String             #204          // %rate_raid%
  #204 = Utf8               %rate_raid%
  #205 = Fieldref           #168.#206     // ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
  #206 = NameAndType        #207:#172     // PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
  #207 = Utf8               PREMIUM_RATE_DROP_ITEMS_BY_RAID
  #208 = Fieldref           #168.#209     // ext/mods/Config.RATE_XP:D
  #209 = NameAndType        #210:#172     // RATE_XP:D
  #210 = Utf8               RATE_XP
  #211 = Fieldref           #168.#212     // ext/mods/Config.RATE_SP:D
  #212 = NameAndType        #213:#172     // RATE_SP:D
  #213 = Utf8               RATE_SP
  #214 = Fieldref           #168.#215     // ext/mods/Config.RATE_DROP_CURRENCY:D
  #215 = NameAndType        #216:#172     // RATE_DROP_CURRENCY:D
  #216 = Utf8               RATE_DROP_CURRENCY
  #217 = Fieldref           #168.#218     // ext/mods/Config.RATE_DROP_SEAL_STONE:D
  #218 = NameAndType        #219:#172     // RATE_DROP_SEAL_STONE:D
  #219 = Utf8               RATE_DROP_SEAL_STONE
  #220 = Fieldref           #168.#221     // ext/mods/Config.RATE_DROP_ITEMS:D
  #221 = NameAndType        #222:#172     // RATE_DROP_ITEMS:D
  #222 = Utf8               RATE_DROP_ITEMS
  #223 = Fieldref           #168.#224     // ext/mods/Config.RATE_DROP_SPOIL:D
  #224 = NameAndType        #225:#172     // RATE_DROP_SPOIL:D
  #225 = Utf8               RATE_DROP_SPOIL
  #226 = Fieldref           #168.#227     // ext/mods/Config.RATE_QUEST_DROP:D
  #227 = NameAndType        #228:#172     // RATE_QUEST_DROP:D
  #228 = Utf8               RATE_QUEST_DROP
  #229 = Fieldref           #168.#230     // ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
  #230 = NameAndType        #231:#172     // RATE_DROP_ITEMS_BY_RAID:D
  #231 = Utf8               RATE_DROP_ITEMS_BY_RAID
  #232 = String             #233          // %premium%
  #233 = Utf8               %premium%
  #234 = Methodref          #22.#235      // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #235 = NameAndType        #236:#83      // getPremiumService:()I
  #236 = Utf8               getPremiumService
  #237 = String             #238          // <font color=00FF00>ON</font>
  #238 = Utf8               <font color=00FF00>ON</font>
  #239 = String             #240          // <font color=FF0000>OFF</font>
  #240 = Utf8               <font color=FF0000>OFF</font>
  #241 = String             #242          // %premiumEnd%
  #242 = Utf8               %premiumEnd%
  #243 = Fieldref           #28.#244      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.DATE_FORMAT:Ljava/text/SimpleDateFormat;
  #244 = NameAndType        #245:#246     // DATE_FORMAT:Ljava/text/SimpleDateFormat;
  #245 = Utf8               DATE_FORMAT
  #246 = Utf8               Ljava/text/SimpleDateFormat;
  #247 = Methodref          #248.#249     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #248 = Class              #250          // java/lang/Long
  #249 = NameAndType        #50:#251      // valueOf:(J)Ljava/lang/Long;
  #250 = Utf8               java/lang/Long
  #251 = Utf8               (J)Ljava/lang/Long;
  #252 = Methodref          #253.#254     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #253 = Class              #255          // java/text/SimpleDateFormat
  #254 = NameAndType        #256:#51      // format:(Ljava/lang/Object;)Ljava/lang/String;
  #255 = Utf8               java/text/SimpleDateFormat
  #256 = Utf8               format
  #257 = String             #258          //
  #258 = Utf8
  #259 = String             #260          // %nameaccount%
  #260 = Utf8               %nameaccount%
  #261 = String             #262          // %ip%
  #262 = Utf8               %ip%
  #263 = Methodref          #22.#264      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #264 = NameAndType        #265:#266     // getClient:()Lext/mods/gameserver/network/GameClient;
  #265 = Utf8               getClient
  #266 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #267 = Methodref          #268.#269     // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #268 = Class              #270          // ext/mods/gameserver/network/GameClient
  #269 = NameAndType        #271:#272     // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #270 = Utf8               ext/mods/gameserver/network/GameClient
  #271 = Utf8               getConnection
  #272 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #273 = Methodref          #274.#275     // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #274 = Class              #276          // ext/mods/commons/mmocore/MMOConnection
  #275 = NameAndType        #277:#278     // getInetAddress:()Ljava/net/InetAddress;
  #276 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #277 = Utf8               getInetAddress
  #278 = Utf8               ()Ljava/net/InetAddress;
  #279 = Methodref          #280.#281     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #280 = Class              #282          // java/net/InetAddress
  #281 = NameAndType        #283:#32      // getHostAddress:()Ljava/lang/String;
  #282 = Utf8               java/net/InetAddress
  #283 = Utf8               getHostAddress
  #284 = String             #285          // %charId%
  #285 = Utf8               %charId%
  #286 = Methodref          #22.#287      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #287 = NameAndType        #288:#83      // getObjectId:()I
  #288 = Utf8               getObjectId
  #289 = String             #290          // %playername%
  #290 = Utf8               %playername%
  #291 = String             #292          // %expirespremium%
  #292 = Utf8               %expirespremium%
  #293 = String             #294          // %statuspremium%
  #294 = Utf8               %statuspremium%
  #295 = String             #296          // <font color=\"FF99FF\">Normal</font>
  #296 = Utf8               <font color=\"FF99FF\">Normal</font>
  #297 = String             #298          // %server_rate_xp%
  #298 = Utf8               %server_rate_xp%
  #299 = String             #300          // %server_rate_sp%
  #300 = Utf8               %server_rate_sp%
  #301 = String             #302          // %server_rate_adena%
  #302 = Utf8               %server_rate_adena%
  #303 = String             #304          // %server_rate_items%
  #304 = Utf8               %server_rate_items%
  #305 = String             #306          // %server_rate_spoil%
  #306 = Utf8               %server_rate_spoil%
  #307 = String             #308          // %server_rate_quest%
  #308 = Utf8               %server_rate_quest%
  #309 = String             #310          // %server_quest_reward%
  #310 = Utf8               %server_quest_reward%
  #311 = Fieldref           #168.#312     // ext/mods/Config.RATE_QUEST_REWARD:D
  #312 = NameAndType        #313:#172     // RATE_QUEST_REWARD:D
  #313 = Utf8               RATE_QUEST_REWARD
  #314 = String             #315          // %server_r_drop%
  #315 = Utf8               %server_r_drop%
  #316 = String             #317          // %server_g_drop%
  #317 = Utf8               %server_g_drop%
  #318 = Fieldref           #168.#319     // ext/mods/Config.RATE_DROP_ITEMS_BY_GRAND:D
  #319 = NameAndType        #320:#172     // RATE_DROP_ITEMS_BY_GRAND:D
  #320 = Utf8               RATE_DROP_ITEMS_BY_GRAND
  #321 = String             #322          // %server_karma_drop%
  #322 = Utf8               %server_karma_drop%
  #323 = Fieldref           #168.#324     // ext/mods/Config.KARMA_RATE_DROP:I
  #324 = NameAndType        #325:#326     // KARMA_RATE_DROP:I
  #325 = Utf8               KARMA_RATE_DROP
  #326 = Utf8               I
  #327 = InvokeDynamic      #1:#34        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #328 = String             #329          // <font color=\"00FF7F\">Premium</font>
  #329 = Utf8               <font color=\"00FF7F\">Premium</font>
  #330 = Double             6.5d
  #332 = Methodref          #10.#333      // java/lang/String.valueOf:(D)Ljava/lang/String;
  #333 = NameAndType        #50:#122      // valueOf:(D)Ljava/lang/String;
  #334 = Double             2.6d
  #336 = Fieldref           #168.#337     // ext/mods/Config.PREMIUM_RATE_QUEST_REWARD:D
  #337 = NameAndType        #338:#172     // PREMIUM_RATE_QUEST_REWARD:D
  #338 = Utf8               PREMIUM_RATE_QUEST_REWARD
  #339 = String             #340          // %rate_party_xp%
  #340 = Utf8               %rate_party_xp%
  #341 = Fieldref           #168.#342     // ext/mods/Config.RATE_PARTY_XP:D
  #342 = NameAndType        #343:#172     // RATE_PARTY_XP:D
  #343 = Utf8               RATE_PARTY_XP
  #344 = String             #345          // %rate_party_sp%
  #345 = Utf8               %rate_party_sp%
  #346 = Fieldref           #168.#347     // ext/mods/Config.RATE_PARTY_SP:D
  #347 = NameAndType        #348:#172     // RATE_PARTY_SP:D
  #348 = Utf8               RATE_PARTY_SP
  #349 = String             #350          // %rate_drop_manor%
  #350 = Utf8               %rate_drop_manor%
  #351 = Fieldref           #168.#352     // ext/mods/Config.RATE_DROP_MANOR:I
  #352 = NameAndType        #353:#326     // RATE_DROP_MANOR:I
  #353 = Utf8               RATE_DROP_MANOR
  #354 = String             #355          // %pet_rate_xp%
  #355 = Utf8               %pet_rate_xp%
  #356 = Fieldref           #168.#357     // ext/mods/Config.PET_XP_RATE:D
  #357 = NameAndType        #358:#172     // PET_XP_RATE:D
  #358 = Utf8               PET_XP_RATE
  #359 = String             #360          // %sineater_rate_xp%
  #360 = Utf8               %sineater_rate_xp%
  #361 = Fieldref           #168.#362     // ext/mods/Config.SINEATER_XP_RATE:D
  #362 = NameAndType        #363:#172     // SINEATER_XP_RATE:D
  #363 = Utf8               SINEATER_XP_RATE
  #364 = String             #365          // %pet_food_rate%
  #365 = Utf8               %pet_food_rate%
  #366 = Fieldref           #168.#367     // ext/mods/Config.PET_FOOD_RATE:I
  #367 = NameAndType        #368:#326     // PET_FOOD_RATE:I
  #368 = Utf8               PET_FOOD_RATE
  #369 = String             #370          // %server_stone_top%
  #370 = Utf8               %server_stone_top%
  #371 = Fieldref           #168.#372     // ext/mods/Config.AUGMENTATION_TOP_SKILL_CHANCE:I
  #372 = NameAndType        #373:#326     // AUGMENTATION_TOP_SKILL_CHANCE:I
  #373 = Utf8               AUGMENTATION_TOP_SKILL_CHANCE
  #374 = String             #375          // %server_stone_high%
  #375 = Utf8               %server_stone_high%
  #376 = Fieldref           #168.#377     // ext/mods/Config.AUGMENTATION_HIGH_SKILL_CHANCE:I
  #377 = NameAndType        #378:#326     // AUGMENTATION_HIGH_SKILL_CHANCE:I
  #378 = Utf8               AUGMENTATION_HIGH_SKILL_CHANCE
  #379 = String             #380          // %server_stone_mid%
  #380 = Utf8               %server_stone_mid%
  #381 = Fieldref           #168.#382     // ext/mods/Config.AUGMENTATION_MID_SKILL_CHANCE:I
  #382 = NameAndType        #383:#326     // AUGMENTATION_MID_SKILL_CHANCE:I
  #383 = Utf8               AUGMENTATION_MID_SKILL_CHANCE
  #384 = String             #385          // %server_stone_low%
  #385 = Utf8               %server_stone_low%
  #386 = Fieldref           #168.#387     // ext/mods/Config.AUGMENTATION_NG_SKILL_CHANCE:I
  #387 = NameAndType        #388:#326     // AUGMENTATION_NG_SKILL_CHANCE:I
  #388 = Utf8               AUGMENTATION_NG_SKILL_CHANCE
  #389 = String             #390          // %deathpenality%
  #390 = Utf8               %deathpenality%
  #391 = Fieldref           #168.#392     // ext/mods/Config.DEATH_PENALTY_CHANCE:I
  #392 = NameAndType        #393:#326     // DEATH_PENALTY_CHANCE:I
  #393 = Utf8               DEATH_PENALTY_CHANCE
  #394 = String             #395          // %level%
  #395 = Utf8               %level%
  #396 = String             #397          // %currentdate%
  #397 = Utf8               %currentdate%
  #398 = Methodref          #399.#400     // java/lang/System.currentTimeMillis:()J
  #399 = Class              #401          // java/lang/System
  #400 = NameAndType        #402:#164     // currentTimeMillis:()J
  #401 = Utf8               java/lang/System
  #402 = Utf8               currentTimeMillis
  #403 = String             #404          // No
  #404 = Utf8               No
  #405 = Methodref          #22.#406      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #406 = NameAndType        #407:#408     // isSubClassActive:()Z
  #407 = Utf8               isSubClassActive
  #408 = Utf8               ()Z
  #409 = String             #410          // %subclass%
  #410 = Utf8               %subclass%
  #411 = String             #412          // SubClass
  #412 = Utf8               SubClass
  #413 = String             #414          // Main
  #414 = Utf8               Main
  #415 = String             #416          // %xp%
  #416 = Utf8               %xp%
  #417 = Methodref          #79.#418      // ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
  #418 = NameAndType        #419:#164     // getExp:()J
  #419 = Utf8               getExp
  #420 = Methodref          #28.#421      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getLongNumber:(J)Ljava/lang/String;
  #421 = NameAndType        #422:#423     // getLongNumber:(J)Ljava/lang/String;
  #422 = Utf8               getLongNumber
  #423 = Utf8               (J)Ljava/lang/String;
  #424 = String             #425          // %sp%
  #425 = Utf8               %sp%
  #426 = Methodref          #79.#427      // ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
  #427 = NameAndType        #428:#83      // getSp:()I
  #428 = Utf8               getSp
  #429 = Methodref          #28.#430      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getIntNumber:(I)Ljava/lang/String;
  #430 = NameAndType        #431:#86      // getIntNumber:(I)Ljava/lang/String;
  #431 = Utf8               getIntNumber
  #432 = String             #433          // %ordinal%
  #433 = Utf8               %ordinal%
  #434 = Methodref          #22.#435      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #435 = NameAndType        #436:#437     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #436 = Utf8               getClassId
  #437 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #438 = Methodref          #439.#440     // ext/mods/gameserver/enums/actors/ClassId.ordinal:()I
  #439 = Class              #441          // ext/mods/gameserver/enums/actors/ClassId
  #440 = NameAndType        #442:#83      // ordinal:()I
  #441 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #442 = Utf8               ordinal
  #443 = String             #444          // %classid%
  #444 = Utf8               %classid%
  #445 = String             #446          // %x%
  #446 = Utf8               %x%
  #447 = Methodref          #22.#448      // ext/mods/gameserver/model/actor/Player.getX:()I
  #448 = NameAndType        #449:#83      // getX:()I
  #449 = Utf8               getX
  #450 = String             #451          // %y%
  #451 = Utf8               %y%
  #452 = Methodref          #22.#453      // ext/mods/gameserver/model/actor/Player.getY:()I
  #453 = NameAndType        #454:#83      // getY:()I
  #454 = Utf8               getY
  #455 = String             #456          // %z%
  #456 = Utf8               %z%
  #457 = Methodref          #22.#458      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #458 = NameAndType        #459:#83      // getZ:()I
  #459 = Utf8               getZ
  #460 = String             #461          // %currenthp%
  #461 = Utf8               %currenthp%
  #462 = Methodref          #79.#463      // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #463 = NameAndType        #464:#118     // getHp:()D
  #464 = Utf8               getHp
  #465 = Methodref          #28.#466      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getDoubleNumber:(D)Ljava/lang/String;
  #466 = NameAndType        #467:#122     // getDoubleNumber:(D)Ljava/lang/String;
  #467 = Utf8               getDoubleNumber
  #468 = String             #469          // %maxhp%
  #469 = Utf8               %maxhp%
  #470 = Methodref          #79.#471      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #471 = NameAndType        #472:#83      // getMaxHp:()I
  #472 = Utf8               getMaxHp
  #473 = String             #474          // %currentmp%
  #474 = Utf8               %currentmp%
  #475 = Methodref          #79.#476      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #476 = NameAndType        #477:#118     // getMp:()D
  #477 = Utf8               getMp
  #478 = String             #479          // %maxmp%
  #479 = Utf8               %maxmp%
  #480 = Methodref          #79.#481      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #481 = NameAndType        #482:#83      // getMaxMp:()I
  #482 = Utf8               getMaxMp
  #483 = String             #484          // %currentcp%
  #484 = Utf8               %currentcp%
  #485 = Methodref          #79.#486      // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
  #486 = NameAndType        #487:#118     // getCp:()D
  #487 = Utf8               getCp
  #488 = String             #489          // %maxcp%
  #489 = Utf8               %maxcp%
  #490 = Methodref          #79.#491      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #491 = NameAndType        #492:#83      // getMaxCp:()I
  #492 = Utf8               getMaxCp
  #493 = String             #494          // %karma%
  #494 = Utf8               %karma%
  #495 = Methodref          #22.#496      // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #496 = NameAndType        #497:#83      // getKarma:()I
  #497 = Utf8               getKarma
  #498 = String             #499          // %pvpflag%
  #499 = Utf8               %pvpflag%
  #500 = Methodref          #22.#501      // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #501 = NameAndType        #502:#503     // getPvpFlag:()B
  #502 = Utf8               getPvpFlag
  #503 = Utf8               ()B
  #504 = String             #505          // %patk%
  #505 = Utf8               %patk%
  #506 = Methodref          #79.#507      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #507 = NameAndType        #508:#509     // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #508 = Utf8               getPAtk
  #509 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #510 = String             #511          // %matk%
  #511 = Utf8               %matk%
  #512 = Methodref          #79.#513      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #513 = NameAndType        #514:#515     // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #514 = Utf8               getMAtk
  #515 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #516 = String             #517          // %pdef%
  #517 = Utf8               %pdef%
  #518 = Methodref          #79.#519      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #519 = NameAndType        #520:#509     // getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #520 = Utf8               getPDef
  #521 = String             #522          // %mdef%
  #522 = Utf8               %mdef%
  #523 = Methodref          #79.#524      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #524 = NameAndType        #525:#515     // getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #525 = Utf8               getMDef
  #526 = String             #527          // %accuracy%
  #527 = Utf8               %accuracy%
  #528 = Methodref          #79.#529      // ext/mods/gameserver/model/actor/status/PlayerStatus.getAccuracy:()I
  #529 = NameAndType        #530:#83      // getAccuracy:()I
  #530 = Utf8               getAccuracy
  #531 = String             #532          // %evasion%
  #532 = Utf8               %evasion%
  #533 = Methodref          #79.#534      // ext/mods/gameserver/model/actor/status/PlayerStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #534 = NameAndType        #535:#509     // getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #535 = Utf8               getEvasionRate
  #536 = String             #537          // %critical%
  #537 = Utf8               %critical%
  #538 = Methodref          #79.#539      // ext/mods/gameserver/model/actor/status/PlayerStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #539 = NameAndType        #540:#515     // getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #540 = Utf8               getCriticalHit
  #541 = String             #542          // %mcritical%
  #542 = Utf8               %mcritical%
  #543 = Methodref          #79.#544      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #544 = NameAndType        #545:#515     // getMCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #545 = Utf8               getMCriticalHit
  #546 = String             #547          // %runspeed%
  #547 = Utf8               %runspeed%
  #548 = Methodref          #79.#549      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMoveSpeed:()F
  #549 = NameAndType        #550:#551     // getMoveSpeed:()F
  #550 = Utf8               getMoveSpeed
  #551 = Utf8               ()F
  #552 = Methodref          #28.#553      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getFloatNumber:(F)Ljava/lang/String;
  #553 = NameAndType        #554:#555     // getFloatNumber:(F)Ljava/lang/String;
  #554 = Utf8               getFloatNumber
  #555 = Utf8               (F)Ljava/lang/String;
  #556 = String             #557          // %patkspd%
  #557 = Utf8               %patkspd%
  #558 = Methodref          #79.#559      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtkSpd:()I
  #559 = NameAndType        #560:#83      // getPAtkSpd:()I
  #560 = Utf8               getPAtkSpd
  #561 = String             #562          // %matkspd%
  #562 = Utf8               %matkspd%
  #563 = Methodref          #79.#564      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtkSpd:()I
  #564 = NameAndType        #565:#83      // getMAtkSpd:()I
  #565 = Utf8               getMAtkSpd
  #566 = String             #567          // %access%
  #567 = Utf8               %access%
  #568 = Methodref          #22.#569      // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #569 = NameAndType        #570:#571     // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #570 = Utf8               getAccessLevel
  #571 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
  #572 = Methodref          #573.#80      // ext/mods/gameserver/model/AccessLevel.getLevel:()I
  #573 = Class              #574          // ext/mods/gameserver/model/AccessLevel
  #574 = Utf8               ext/mods/gameserver/model/AccessLevel
  #575 = String             #576          // %account%
  #576 = Utf8               %account%
  #577 = String             #578          // %max_players%
  #578 = Utf8               %max_players%
  #579 = String             #580          // %trade%
  #580 = Utf8               %trade%
  #581 = Methodref          #22.#582      // ext/mods/gameserver/model/actor/Player.getTradeRefusal:()Z
  #582 = NameAndType        #583:#408     // getTradeRefusal:()Z
  #583 = Utf8               getTradeRefusal
  #584 = String             #585          // %messagerefusal%
  #585 = Utf8               %messagerefusal%
  #586 = Methodref          #22.#587      // ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
  #587 = NameAndType        #588:#408     // isBlockingAll:()Z
  #588 = Utf8               isBlockingAll
  #589 = String             #590          // %gainxp%
  #590 = Utf8               %gainxp%
  #591 = Methodref          #22.#592      // ext/mods/gameserver/model/actor/Player.getStopExp:()Z
  #592 = NameAndType        #593:#408     // getStopExp:()Z
  #593 = Utf8               getStopExp
  #594 = String             #595          // %playeron%
  #595 = Utf8               %playeron%
  #596 = Methodref          #28.#597      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getRealOnline:()Ljava/lang/String;
  #597 = NameAndType        #598:#32      // getRealOnline:()Ljava/lang/String;
  #598 = Utf8               getRealOnline
  #599 = String             #600          // %offmode%
  #600 = Utf8               %offmode%
  #601 = Methodref          #28.#602      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getRealOffline:()Ljava/lang/String;
  #602 = NameAndType        #603:#32      // getRealOffline:()Ljava/lang/String;
  #603 = Utf8               getRealOffline
  #604 = String             #605          // %heroeon%
  #605 = Utf8               %heroeon%
  #606 = Methodref          #28.#607      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getHeroOnline:()Ljava/lang/String;
  #607 = NameAndType        #608:#32      // getHeroOnline:()Ljava/lang/String;
  #608 = Utf8               getHeroOnline
  #609 = String             #610          // %leaderon%
  #610 = Utf8               %leaderon%
  #611 = Methodref          #28.#612      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getClanLeaderOnline:()Ljava/lang/String;
  #612 = NameAndType        #613:#32      // getClanLeaderOnline:()Ljava/lang/String;
  #613 = Utf8               getClanLeaderOnline
  #614 = String             #615          // %noblesseon%
  #615 = Utf8               %noblesseon%
  #616 = Methodref          #28.#617      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getNobleOnline:()Ljava/lang/String;
  #617 = NameAndType        #618:#32      // getNobleOnline:()Ljava/lang/String;
  #618 = Utf8               getNobleOnline
  #619 = String             #620          // %jailon%
  #620 = Utf8               %jailon%
  #621 = Methodref          #28.#622      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getJailOnline:()Ljava/lang/String;
  #622 = NameAndType        #623:#32      // getJailOnline:()Ljava/lang/String;
  #623 = Utf8               getJailOnline
  #624 = String             #625          // %gmon%
  #625 = Utf8               %gmon%
  #626 = Methodref          #28.#627      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getGMOnline:()Ljava/lang/String;
  #627 = NameAndType        #628:#32      // getGMOnline:()Ljava/lang/String;
  #628 = Utf8               getGMOnline
  #629 = Methodref          #22.#630      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #630 = NameAndType        #631:#408     // isNoble:()Z
  #631 = Utf8               isNoble
  #632 = String             #633          // %noble%
  #633 = Utf8               %noble%
  #634 = String             #635          // Yes
  #635 = Utf8               Yes
  #636 = String             #637          // %time%
  #637 = Utf8               %time%
  #638 = Methodref          #639.#640     // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #639 = Class              #641          // ext/mods/gameserver/taskmanager/GameTimeTaskManager
  #640 = NameAndType        #19:#642      // getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #641 = Utf8               ext/mods/gameserver/taskmanager/GameTimeTaskManager
  #642 = Utf8               ()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
  #643 = Methodref          #639.#644     // ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameTimeFormated:()Ljava/lang/String;
  #644 = NameAndType        #645:#32      // getGameTimeFormated:()Ljava/lang/String;
  #645 = Utf8               getGameTimeFormated
  #646 = Methodref          #28.#647      // ext/mods/gameserver/communitybbs/custom/IndexCBManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #647 = NameAndType        #648:#649     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #648 = Utf8               separateAndSend
  #649 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #650 = Methodref          #2.#651       // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #651 = NameAndType        #652:#649     // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #652 = Utf8               parseCmd
  #653 = InterfaceMethodref #99.#654      // java/util/Collection.iterator:()Ljava/util/Iterator;
  #654 = NameAndType        #655:#656     // iterator:()Ljava/util/Iterator;
  #655 = Utf8               iterator
  #656 = Utf8               ()Ljava/util/Iterator;
  #657 = InterfaceMethodref #658.#659     // java/util/Iterator.hasNext:()Z
  #658 = Class              #660          // java/util/Iterator
  #659 = NameAndType        #661:#408     // hasNext:()Z
  #660 = Utf8               java/util/Iterator
  #661 = Utf8               hasNext
  #662 = InterfaceMethodref #658.#663     // java/util/Iterator.next:()Ljava/lang/Object;
  #663 = NameAndType        #664:#665     // next:()Ljava/lang/Object;
  #664 = Utf8               next
  #665 = Utf8               ()Ljava/lang/Object;
  #666 = Methodref          #667.#668     // ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
  #667 = Class              #669          // ext/mods/gameserver/data/sql/OfflineTradersTable
  #668 = NameAndType        #670:#671     // offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
  #669 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable
  #670 = Utf8               offlineMode
  #671 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #672 = Methodref          #22.#673      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #673 = NameAndType        #674:#408     // isGM:()Z
  #674 = Utf8               isGM
  #675 = InvokeDynamic      #2:#676       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #676 = NameAndType        #35:#86       // makeConcatWithConstants:(I)Ljava/lang/String;
  #677 = Methodref          #22.#678      // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #678 = NameAndType        #679:#408     // isInStoreMode:()Z
  #679 = Utf8               isInStoreMode
  #680 = Methodref          #22.#681      // ext/mods/gameserver/model/actor/Player.isHero:()Z
  #681 = NameAndType        #682:#408     // isHero:()Z
  #682 = Utf8               isHero
  #683 = Methodref          #22.#684      // ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
  #684 = NameAndType        #685:#408     // isClanLeader:()Z
  #685 = Utf8               isClanLeader
  #686 = Methodref          #22.#687      // ext/mods/gameserver/model/actor/Player.isInJail:()Z
  #687 = NameAndType        #688:#408     // isInJail:()Z
  #688 = Utf8               isInJail
  #689 = Class              #690          // java/text/DecimalFormat
  #690 = Utf8               java/text/DecimalFormat
  #691 = String             #692          // ##,###
  #692 = Utf8               ##,###
  #693 = Methodref          #689.#694     // java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
  #694 = NameAndType        #5:#695       // "<init>":(Ljava/lang/String;)V
  #695 = Utf8               (Ljava/lang/String;)V
  #696 = Methodref          #689.#697     // java/text/DecimalFormat.format:(D)Ljava/lang/String;
  #697 = NameAndType        #256:#122     // format:(D)Ljava/lang/String;
  #698 = String             #699          // ##.##
  #699 = Utf8               ##.##
  #700 = String             #701          // #,###,###,###
  #701 = Utf8               #,###,###,###
  #702 = Methodref          #689.#703     // java/text/DecimalFormat.format:(J)Ljava/lang/String;
  #703 = NameAndType        #256:#423     // format:(J)Ljava/lang/String;
  #704 = String             #705          // #,###
  #705 = Utf8               #,###
  #706 = String             #707          // custom/
  #707 = Utf8               custom/
  #708 = Fieldref           #709.#710     // ext/mods/gameserver/communitybbs/custom/IndexCBManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #709 = Class              #711          // ext/mods/gameserver/communitybbs/custom/IndexCBManager$SingletonHolder
  #710 = NameAndType        #712:#713     // INSTANCE:Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #711 = Utf8               ext/mods/gameserver/communitybbs/custom/IndexCBManager$SingletonHolder
  #712 = Utf8               INSTANCE
  #713 = Utf8               Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #714 = String             #715          // dd/MM/yyyy HH:mm
  #715 = Utf8               dd/MM/yyyy HH:mm
  #716 = Methodref          #253.#694     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #717 = Utf8               Code
  #718 = Utf8               LineNumberTable
  #719 = Utf8               LocalVariableTable
  #720 = Utf8               this
  #721 = Utf8               content
  #722 = Utf8               Ljava/lang/String;
  #723 = Utf8               noexpirespremium
  #724 = Utf8               clan
  #725 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #726 = Utf8               playerClan
  #727 = Utf8               command
  #728 = Utf8               player
  #729 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #730 = Utf8               StackMapTable
  #731 = Utf8               onlinePlayer
  #732 = Utf8               counter
  #733 = Utf8               var2
  #734 = Utf8               Ljava/util/Iterator;
  #735 = Utf8               realOnline
  #736 = Utf8               LocalVariableTypeTable
  #737 = Utf8               Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
  #738 = Utf8               realOffline
  #739 = Utf8               heroOnline
  #740 = Utf8               clanLeaderOnline
  #741 = Utf8               nobleOnline
  #742 = Utf8               jailOnline
  #743 = Utf8               gmOnline
  #744 = Utf8               number
  #745 = Utf8               df
  #746 = Utf8               Ljava/text/DecimalFormat;
  #747 = Utf8               fivenumbers
  #748 = Utf8               ratenumbers
  #749 = Utf8               billionnumbers
  #750 = Utf8               J
  #751 = Utf8               F
  #752 = Utf8               fournumbers
  #753 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #754 = Utf8               <clinit>
  #755 = Utf8               SourceFile
  #756 = Utf8               IndexCBManager.java
  #757 = Utf8               NestMembers
  #758 = Utf8               BootstrapMethods
  #759 = String             #760          // html/CommunityBoard/\u0001index.htm
  #760 = Utf8               html/CommunityBoard/\u0001index.htm
  #761 = String             #762          // <font color=\"00FF7F\">\u0001</font>
  #762 = Utf8               <font color=\"00FF7F\">\u0001</font>
  #763 = String             #764          // \u0001
  #764 = Utf8               \u0001
  #765 = MethodHandle       6:#766        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #766 = Methodref          #767.#768     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #767 = Class              #769          // java/lang/invoke/StringConcatFactory
  #768 = NameAndType        #35:#770      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #769 = Utf8               java/lang/invoke/StringConcatFactory
  #770 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #771 = Utf8               InnerClasses
  #772 = Utf8               SingletonHolder
  #773 = Class              #774          // java/lang/invoke/MethodHandles$Lookup
  #774 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #775 = Class              #776          // java/lang/invoke/MethodHandles
  #776 = Utf8               java/lang/invoke/MethodHandles
  #777 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.custom.IndexCBManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager."<init>":()V
         4: return
      LineNumberTable:
        line 39: 0
        line 40: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;

  public void parseCmd(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=3
         0: aload_1
         1: ldc           #7                  // String _bbshome
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          2596
         9: invokestatic  #15                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        12: aload_2
        13: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        16: aload_0
        17: invokevirtual #27                 // Method getFolder:()Ljava/lang/String;
        20: invokedynamic #33,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        25: invokevirtual #37                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        28: astore_3
        29: ldc           #41                 // String <font color=\"FF99FF\">--------</font>
        31: astore        4
        33: aload_3
        34: ldc           #43                 // String %name%
        36: aload_2
        37: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        40: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        43: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        46: astore_3
        47: aload_3
        48: ldc           #56                 // String %accountName%
        50: aload_2
        51: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
        54: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        57: astore_3
        58: aload_3
        59: ldc           #61                 // String %class%
        61: aload_2
        62: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        65: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
        68: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        71: astore_3
        72: aload_3
        73: ldc           #72                 // String %lvl%
        75: aload_2
        76: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        79: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        82: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        85: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        88: astore_3
        89: aload_3
        90: ldc           #87                 // String %players%
        92: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        95: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        98: invokeinterface #98,  1           // InterfaceMethod java/util/Collection.size:()I
       103: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       106: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       109: astore_3
       110: aload_3
       111: ldc           #103                // String %pvpkills%
       113: aload_2
       114: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPvpKills:()I
       117: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       120: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       123: astore_3
       124: aload_3
       125: ldc           #108                // String %pkkills%
       127: aload_2
       128: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.getPkKills:()I
       131: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       134: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       137: astore_3
       138: aload_3
       139: ldc           #113                // String %hpRegen%
       141: aload_2
       142: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       145: invokevirtual #115                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenHp:()D
       148: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       151: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       154: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       157: astore_3
       158: aload_3
       159: ldc           #123                // String %mpRegen%
       161: aload_2
       162: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       165: invokevirtual #125                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenMp:()D
       168: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       171: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       174: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       177: astore_3
       178: aload_3
       179: ldc           #128                // String %cpRegen%
       181: aload_2
       182: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       185: invokevirtual #130                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenCp:()D
       188: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       191: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       194: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       197: astore_3
       198: aload_3
       199: ldc           #133                // String %rec%
       201: aload_2
       202: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.getRecomHave:()I
       205: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       208: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       211: astore_3
       212: invokestatic  #138                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       215: aload_2
       216: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
       219: invokevirtual #146                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
       222: astore        5
       224: aload         5
       226: ifnull        244
       229: aload_3
       230: ldc           #150                // String %clan%
       232: aload         5
       234: invokevirtual #152                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
       237: invokevirtual #155                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       240: astore_3
       241: goto          253
       244: aload_3
       245: ldc           #150                // String %clan%
       247: ldc           #159                // String <font color=FF0000>No</font>
       249: invokevirtual #155                // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       252: astore_3
       253: aload_2
       254: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
       257: lconst_1
       258: lcmp
       259: ifne          393
       262: aload_3
       263: ldc           #165                // String %rate_xp%
       265: getstatic     #167                // Field ext/mods/Config.PREMIUM_RATE_XP:D
       268: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       271: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       274: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       277: astore_3
       278: aload_3
       279: ldc           #173                // String %rate_sp%
       281: getstatic     #175                // Field ext/mods/Config.PREMIUM_RATE_SP:D
       284: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       287: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       290: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       293: astore_3
       294: aload_3
       295: ldc           #178                // String %rate_adena%
       297: getstatic     #180                // Field ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
       300: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       303: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       306: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       309: astore_3
       310: aload_3
       311: ldc           #183                // String %rate_seal%
       313: getstatic     #185                // Field ext/mods/Config.PREMIUM_RATE_DROP_SEAL_STONE:D
       316: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       319: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       322: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       325: astore_3
       326: aload_3
       327: ldc           #188                // String %rate_items%
       329: getstatic     #190                // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
       332: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       335: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       338: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       341: astore_3
       342: aload_3
       343: ldc           #193                // String %rate_spoil%
       345: getstatic     #195                // Field ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
       348: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       351: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       354: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       357: astore_3
       358: aload_3
       359: ldc           #198                // String %rate_quest%
       361: getstatic     #200                // Field ext/mods/Config.PREMIUM_RATE_QUEST_DROP:D
       364: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       367: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       370: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       373: astore_3
       374: aload_3
       375: ldc           #203                // String %rate_raid%
       377: getstatic     #205                // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS_BY_RAID:D
       380: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       383: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       386: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       389: astore_3
       390: goto          521
       393: aload_3
       394: ldc           #165                // String %rate_xp%
       396: getstatic     #208                // Field ext/mods/Config.RATE_XP:D
       399: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       402: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       405: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       408: astore_3
       409: aload_3
       410: ldc           #173                // String %rate_sp%
       412: getstatic     #211                // Field ext/mods/Config.RATE_SP:D
       415: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       418: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       421: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       424: astore_3
       425: aload_3
       426: ldc           #178                // String %rate_adena%
       428: getstatic     #214                // Field ext/mods/Config.RATE_DROP_CURRENCY:D
       431: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       434: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       437: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       440: astore_3
       441: aload_3
       442: ldc           #183                // String %rate_seal%
       444: getstatic     #217                // Field ext/mods/Config.RATE_DROP_SEAL_STONE:D
       447: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       450: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       453: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       456: astore_3
       457: aload_3
       458: ldc           #188                // String %rate_items%
       460: getstatic     #220                // Field ext/mods/Config.RATE_DROP_ITEMS:D
       463: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       466: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       469: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       472: astore_3
       473: aload_3
       474: ldc           #193                // String %rate_spoil%
       476: getstatic     #223                // Field ext/mods/Config.RATE_DROP_SPOIL:D
       479: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       482: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       485: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       488: astore_3
       489: aload_3
       490: ldc           #198                // String %rate_quest%
       492: getstatic     #226                // Field ext/mods/Config.RATE_QUEST_DROP:D
       495: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       498: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       501: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       504: astore_3
       505: aload_3
       506: ldc           #203                // String %rate_raid%
       508: getstatic     #229                // Field ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
       511: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       514: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       517: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       520: astore_3
       521: aload_3
       522: ldc           #232                // String %premium%
       524: aload_2
       525: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       528: iconst_1
       529: if_icmpne     537
       532: ldc           #237                // String <font color=00FF00>ON</font>
       534: goto          539
       537: ldc           #239                // String <font color=FF0000>OFF</font>
       539: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       542: astore_3
       543: aload_3
       544: ldc           #241                // String %premiumEnd%
       546: aload_2
       547: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       550: iconst_1
       551: if_icmpne     570
       554: getstatic     #243                // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
       557: aload_2
       558: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
       561: invokestatic  #247                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       564: invokevirtual #252                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
       567: goto          573
       570: ldc_w         #257                // String
       573: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       576: astore_3
       577: aload_2
       578: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       581: ifne          998
       584: aload_3
       585: ldc_w         #259                // String %nameaccount%
       588: aload_2
       589: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       592: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       595: astore_3
       596: aload_3
       597: ldc_w         #261                // String %ip%
       600: aload_2
       601: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       604: invokevirtual #267                // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       607: invokevirtual #273                // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       610: invokevirtual #279                // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
       613: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       616: astore_3
       617: aload_3
       618: ldc_w         #284                // String %charId%
       621: aload_2
       622: invokevirtual #286                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       625: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       628: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       631: astore_3
       632: aload_3
       633: ldc_w         #289                // String %playername%
       636: aload_2
       637: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       640: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       643: astore_3
       644: aload_3
       645: ldc_w         #291                // String %expirespremium%
       648: aload         4
       650: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       653: astore_3
       654: aload_3
       655: ldc_w         #293                // String %statuspremium%
       658: ldc_w         #295                // String <font color=\"FF99FF\">Normal</font>
       661: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       664: astore_3
       665: aload_2
       666: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       669: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       672: iconst_1
       673: if_icmplt     701
       676: aload_2
       677: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       680: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       683: bipush        39
       685: if_icmpgt     701
       688: aload_3
       689: ldc_w         #297                // String %server_rate_xp%
       692: bipush        20
       694: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       697: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       700: astore_3
       701: aload_2
       702: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       705: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       708: bipush        40
       710: if_icmplt     741
       713: aload_2
       714: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       717: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       720: bipush        51
       722: if_icmpgt     741
       725: aload_3
       726: ldc_w         #297                // String %server_rate_xp%
       729: bipush        20
       731: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       734: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       737: astore_3
       738: goto          778
       741: aload_2
       742: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       745: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       748: bipush        52
       750: if_icmplt     778
       753: aload_2
       754: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       757: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       760: bipush        61
       762: if_icmpgt     778
       765: aload_3
       766: ldc_w         #297                // String %server_rate_xp%
       769: bipush        10
       771: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       774: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       777: astore_3
       778: aload_2
       779: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       782: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       785: bipush        62
       787: if_icmplt     817
       790: aload_2
       791: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       794: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       797: bipush        75
       799: if_icmpgt     817
       802: aload_3
       803: ldc_w         #297                // String %server_rate_xp%
       806: iconst_5
       807: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       810: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       813: astore_3
       814: goto          841
       817: aload_2
       818: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       821: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       824: bipush        76
       826: if_icmplt     841
       829: aload_3
       830: ldc_w         #297                // String %server_rate_xp%
       833: iconst_2
       834: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       837: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       840: astore_3
       841: aload_3
       842: ldc_w         #299                // String %server_rate_sp%
       845: getstatic     #211                // Field ext/mods/Config.RATE_SP:D
       848: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       851: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       854: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       857: astore_3
       858: aload_3
       859: ldc_w         #301                // String %server_rate_adena%
       862: getstatic     #214                // Field ext/mods/Config.RATE_DROP_CURRENCY:D
       865: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       868: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       871: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       874: astore_3
       875: aload_3
       876: ldc_w         #303                // String %server_rate_items%
       879: getstatic     #220                // Field ext/mods/Config.RATE_DROP_ITEMS:D
       882: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       885: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       888: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       891: astore_3
       892: aload_3
       893: ldc_w         #305                // String %server_rate_spoil%
       896: getstatic     #223                // Field ext/mods/Config.RATE_DROP_SPOIL:D
       899: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       902: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       905: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       908: astore_3
       909: aload_3
       910: ldc_w         #307                // String %server_rate_quest%
       913: getstatic     #226                // Field ext/mods/Config.RATE_QUEST_DROP:D
       916: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       919: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       922: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       925: astore_3
       926: aload_3
       927: ldc_w         #309                // String %server_quest_reward%
       930: getstatic     #311                // Field ext/mods/Config.RATE_QUEST_REWARD:D
       933: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       936: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       939: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       942: astore_3
       943: aload_3
       944: ldc_w         #314                // String %server_r_drop%
       947: getstatic     #229                // Field ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
       950: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       953: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       956: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       959: astore_3
       960: aload_3
       961: ldc_w         #316                // String %server_g_drop%
       964: getstatic     #318                // Field ext/mods/Config.RATE_DROP_ITEMS_BY_GRAND:D
       967: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       970: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       973: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       976: astore_3
       977: aload_3
       978: ldc_w         #321                // String %server_karma_drop%
       981: getstatic     #323                // Field ext/mods/Config.KARMA_RATE_DROP:I
       984: i2d
       985: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
       988: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
       991: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       994: astore_3
       995: goto          1432
       998: aload_3
       999: ldc_w         #259                // String %nameaccount%
      1002: aload_2
      1003: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
      1006: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1009: astore_3
      1010: aload_3
      1011: ldc_w         #261                // String %ip%
      1014: aload_2
      1015: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
      1018: invokevirtual #267                // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
      1021: invokevirtual #273                // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
      1024: invokevirtual #279                // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
      1027: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1030: astore_3
      1031: aload_3
      1032: ldc_w         #284                // String %charId%
      1035: aload_2
      1036: invokevirtual #286                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1039: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1042: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1045: astore_3
      1046: aload_3
      1047: ldc_w         #289                // String %playername%
      1050: aload_2
      1051: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1054: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1057: astore_3
      1058: aload_3
      1059: ldc_w         #291                // String %expirespremium%
      1062: getstatic     #243                // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
      1065: aload_2
      1066: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Player.getPremServiceData:()J
      1069: invokestatic  #247                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      1072: invokevirtual #252                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      1075: invokedynamic #327,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1080: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1083: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1086: astore_3
      1087: aload_3
      1088: ldc_w         #293                // String %statuspremium%
      1091: ldc_w         #328                // String <font color=\"00FF7F\">Premium</font>
      1094: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1097: astore_3
      1098: aload_2
      1099: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1102: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1105: iconst_1
      1106: if_icmplt     1134
      1109: aload_2
      1110: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1113: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1116: bipush        39
      1118: if_icmpgt     1134
      1121: aload_3
      1122: ldc_w         #297                // String %server_rate_xp%
      1125: bipush        26
      1127: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1130: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1133: astore_3
      1134: aload_2
      1135: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1138: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1141: bipush        40
      1143: if_icmplt     1174
      1146: aload_2
      1147: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1150: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1153: bipush        51
      1155: if_icmpgt     1174
      1158: aload_3
      1159: ldc_w         #297                // String %server_rate_xp%
      1162: bipush        26
      1164: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1167: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1170: astore_3
      1171: goto          1211
      1174: aload_2
      1175: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1178: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1181: bipush        52
      1183: if_icmplt     1211
      1186: aload_2
      1187: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1190: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1193: bipush        61
      1195: if_icmpgt     1211
      1198: aload_3
      1199: ldc_w         #297                // String %server_rate_xp%
      1202: bipush        13
      1204: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1207: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1210: astore_3
      1211: aload_2
      1212: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1215: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1218: bipush        62
      1220: if_icmplt     1252
      1223: aload_2
      1224: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1227: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1230: bipush        75
      1232: if_icmpgt     1252
      1235: aload_3
      1236: ldc_w         #297                // String %server_rate_xp%
      1239: ldc2_w        #330                // double 6.5d
      1242: invokestatic  #332                // Method java/lang/String.valueOf:(D)Ljava/lang/String;
      1245: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1248: astore_3
      1249: goto          1278
      1252: aload_2
      1253: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1256: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1259: bipush        76
      1261: if_icmplt     1278
      1264: aload_3
      1265: ldc_w         #297                // String %server_rate_xp%
      1268: ldc2_w        #334                // double 2.6d
      1271: invokestatic  #332                // Method java/lang/String.valueOf:(D)Ljava/lang/String;
      1274: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1277: astore_3
      1278: aload_3
      1279: ldc_w         #299                // String %server_rate_sp%
      1282: getstatic     #175                // Field ext/mods/Config.PREMIUM_RATE_SP:D
      1285: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1288: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1291: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1294: astore_3
      1295: aload_3
      1296: ldc_w         #301                // String %server_rate_adena%
      1299: getstatic     #180                // Field ext/mods/Config.PREMIUM_RATE_DROP_CURRENCY:D
      1302: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1305: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1308: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1311: astore_3
      1312: aload_3
      1313: ldc_w         #303                // String %server_rate_items%
      1316: getstatic     #190                // Field ext/mods/Config.PREMIUM_RATE_DROP_ITEMS:D
      1319: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1322: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1325: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1328: astore_3
      1329: aload_3
      1330: ldc_w         #305                // String %server_rate_spoil%
      1333: getstatic     #195                // Field ext/mods/Config.PREMIUM_RATE_DROP_SPOIL:D
      1336: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1339: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1342: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1345: astore_3
      1346: aload_3
      1347: ldc_w         #307                // String %server_rate_quest%
      1350: getstatic     #200                // Field ext/mods/Config.PREMIUM_RATE_QUEST_DROP:D
      1353: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1356: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1359: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1362: astore_3
      1363: aload_3
      1364: ldc_w         #309                // String %server_quest_reward%
      1367: getstatic     #336                // Field ext/mods/Config.PREMIUM_RATE_QUEST_REWARD:D
      1370: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1373: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1376: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1379: astore_3
      1380: aload_3
      1381: ldc_w         #314                // String %server_r_drop%
      1384: getstatic     #229                // Field ext/mods/Config.RATE_DROP_ITEMS_BY_RAID:D
      1387: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1390: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1393: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1396: astore_3
      1397: aload_3
      1398: ldc_w         #316                // String %server_g_drop%
      1401: getstatic     #318                // Field ext/mods/Config.RATE_DROP_ITEMS_BY_GRAND:D
      1404: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1407: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1410: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1413: astore_3
      1414: aload_3
      1415: ldc_w         #321                // String %server_karma_drop%
      1418: getstatic     #323                // Field ext/mods/Config.KARMA_RATE_DROP:I
      1421: i2d
      1422: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1425: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1428: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1431: astore_3
      1432: aload_3
      1433: ldc_w         #339                // String %rate_party_xp%
      1436: getstatic     #341                // Field ext/mods/Config.RATE_PARTY_XP:D
      1439: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1442: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1445: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1448: astore_3
      1449: aload_3
      1450: ldc_w         #344                // String %rate_party_sp%
      1453: getstatic     #346                // Field ext/mods/Config.RATE_PARTY_SP:D
      1456: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1459: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1462: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1465: astore_3
      1466: aload_3
      1467: ldc_w         #349                // String %rate_drop_manor%
      1470: getstatic     #351                // Field ext/mods/Config.RATE_DROP_MANOR:I
      1473: i2d
      1474: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1477: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1480: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1483: astore_3
      1484: aload_3
      1485: ldc_w         #354                // String %pet_rate_xp%
      1488: getstatic     #356                // Field ext/mods/Config.PET_XP_RATE:D
      1491: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1494: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1497: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1500: astore_3
      1501: aload_3
      1502: ldc_w         #359                // String %sineater_rate_xp%
      1505: getstatic     #361                // Field ext/mods/Config.SINEATER_XP_RATE:D
      1508: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1511: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1514: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1517: astore_3
      1518: aload_3
      1519: ldc_w         #364                // String %pet_food_rate%
      1522: getstatic     #366                // Field ext/mods/Config.PET_FOOD_RATE:I
      1525: i2d
      1526: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1529: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1532: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1535: astore_3
      1536: aload_3
      1537: ldc_w         #369                // String %server_stone_top%
      1540: getstatic     #371                // Field ext/mods/Config.AUGMENTATION_TOP_SKILL_CHANCE:I
      1543: i2d
      1544: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1547: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1550: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1553: astore_3
      1554: aload_3
      1555: ldc_w         #374                // String %server_stone_high%
      1558: getstatic     #376                // Field ext/mods/Config.AUGMENTATION_HIGH_SKILL_CHANCE:I
      1561: i2d
      1562: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1565: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1568: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1571: astore_3
      1572: aload_3
      1573: ldc_w         #379                // String %server_stone_mid%
      1576: getstatic     #381                // Field ext/mods/Config.AUGMENTATION_MID_SKILL_CHANCE:I
      1579: i2d
      1580: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1583: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1586: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1589: astore_3
      1590: aload_3
      1591: ldc_w         #384                // String %server_stone_low%
      1594: getstatic     #386                // Field ext/mods/Config.AUGMENTATION_NG_SKILL_CHANCE:I
      1597: i2d
      1598: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1601: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1604: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1607: astore_3
      1608: aload_3
      1609: ldc_w         #389                // String %deathpenality%
      1612: getstatic     #391                // Field ext/mods/Config.DEATH_PENALTY_CHANCE:I
      1615: i2d
      1616: invokestatic  #119                // Method getRateNumber:(D)Ljava/lang/String;
      1619: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1622: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1625: astore_3
      1626: aload_3
      1627: ldc_w         #394                // String %level%
      1630: aload_2
      1631: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1634: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
      1637: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1640: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1643: astore_3
      1644: aload_3
      1645: ldc_w         #396                // String %currentdate%
      1648: getstatic     #243                // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
      1651: invokestatic  #398                // Method java/lang/System.currentTimeMillis:()J
      1654: invokestatic  #247                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      1657: invokevirtual #252                // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
      1660: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1663: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1666: astore_3
      1667: invokestatic  #138                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
      1670: aload_2
      1671: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
      1674: invokevirtual #146                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
      1677: astore        6
      1679: aload         6
      1681: ifnull        1699
      1684: aload_3
      1685: ldc           #150                // String %clan%
      1687: aload         6
      1689: invokevirtual #152                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
      1692: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1695: astore_3
      1696: goto          1709
      1699: aload_3
      1700: ldc           #150                // String %clan%
      1702: ldc_w         #403                // String No
      1705: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1708: astore_3
      1709: aload_2
      1710: invokevirtual #405                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
      1713: ifeq          1733
      1716: aload_3
      1717: ldc_w         #409                // String %subclass%
      1720: ldc_w         #411                // String SubClass
      1723: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1726: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1729: astore_3
      1730: goto          1747
      1733: aload_3
      1734: ldc_w         #409                // String %subclass%
      1737: ldc_w         #413                // String Main
      1740: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1743: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1746: astore_3
      1747: aload_3
      1748: ldc_w         #415                // String %xp%
      1751: aload_2
      1752: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1755: invokevirtual #417                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
      1758: invokestatic  #420                // Method getLongNumber:(J)Ljava/lang/String;
      1761: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1764: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1767: astore_3
      1768: aload_3
      1769: ldc_w         #424                // String %sp%
      1772: aload_2
      1773: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1776: invokevirtual #426                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
      1779: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      1782: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1785: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1788: astore_3
      1789: aload_3
      1790: ldc           #61                 // String %class%
      1792: aload_2
      1793: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
      1796: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
      1799: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1802: astore_3
      1803: aload_3
      1804: ldc_w         #432                // String %ordinal%
      1807: aload_2
      1808: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
      1811: invokevirtual #438                // Method ext/mods/gameserver/enums/actors/ClassId.ordinal:()I
      1814: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1817: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1820: astore_3
      1821: aload_3
      1822: ldc_w         #443                // String %classid%
      1825: aload_2
      1826: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
      1829: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1832: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1835: astore_3
      1836: aload_3
      1837: ldc_w         #445                // String %x%
      1840: aload_2
      1841: invokevirtual #447                // Method ext/mods/gameserver/model/actor/Player.getX:()I
      1844: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1847: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1850: astore_3
      1851: aload_3
      1852: ldc_w         #450                // String %y%
      1855: aload_2
      1856: invokevirtual #452                // Method ext/mods/gameserver/model/actor/Player.getY:()I
      1859: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1862: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1865: astore_3
      1866: aload_3
      1867: ldc_w         #455                // String %z%
      1870: aload_2
      1871: invokevirtual #457                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
      1874: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1877: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1880: astore_3
      1881: aload_3
      1882: ldc_w         #460                // String %currenthp%
      1885: aload_2
      1886: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1889: invokevirtual #462                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
      1892: invokestatic  #465                // Method getDoubleNumber:(D)Ljava/lang/String;
      1895: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1898: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1901: astore_3
      1902: aload_3
      1903: ldc_w         #468                // String %maxhp%
      1906: aload_2
      1907: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1910: invokevirtual #470                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
      1913: i2d
      1914: invokestatic  #465                // Method getDoubleNumber:(D)Ljava/lang/String;
      1917: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1920: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1923: astore_3
      1924: aload_3
      1925: ldc_w         #473                // String %currentmp%
      1928: aload_2
      1929: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1932: invokevirtual #475                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
      1935: invokestatic  #465                // Method getDoubleNumber:(D)Ljava/lang/String;
      1938: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1941: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1944: astore_3
      1945: aload_3
      1946: ldc_w         #478                // String %maxmp%
      1949: aload_2
      1950: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1953: invokevirtual #480                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
      1956: i2d
      1957: invokestatic  #465                // Method getDoubleNumber:(D)Ljava/lang/String;
      1960: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1963: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1966: astore_3
      1967: aload_3
      1968: ldc_w         #483                // String %currentcp%
      1971: aload_2
      1972: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1975: invokevirtual #485                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
      1978: invokestatic  #465                // Method getDoubleNumber:(D)Ljava/lang/String;
      1981: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      1984: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      1987: astore_3
      1988: aload_3
      1989: ldc_w         #488                // String %maxcp%
      1992: aload_2
      1993: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      1996: invokevirtual #490                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
      1999: i2d
      2000: invokestatic  #465                // Method getDoubleNumber:(D)Ljava/lang/String;
      2003: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2006: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2009: astore_3
      2010: aload_3
      2011: ldc_w         #493                // String %karma%
      2014: aload_2
      2015: invokevirtual #495                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
      2018: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2021: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2024: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2027: astore_3
      2028: aload_3
      2029: ldc_w         #498                // String %pvpflag%
      2032: aload_2
      2033: invokevirtual #500                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
      2036: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      2039: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2042: astore_3
      2043: aload_3
      2044: ldc           #103                // String %pvpkills%
      2046: aload_2
      2047: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getPvpKills:()I
      2050: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2053: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2056: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2059: astore_3
      2060: aload_3
      2061: ldc           #108                // String %pkkills%
      2063: aload_2
      2064: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Player.getPkKills:()I
      2067: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2070: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2073: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2076: astore_3
      2077: aload_3
      2078: ldc_w         #504                // String %patk%
      2081: aload_2
      2082: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2085: aconst_null
      2086: invokevirtual #506                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
      2089: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2092: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2095: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2098: astore_3
      2099: aload_3
      2100: ldc_w         #510                // String %matk%
      2103: aload_2
      2104: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2107: aconst_null
      2108: aconst_null
      2109: invokevirtual #512                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
      2112: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2115: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2118: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2121: astore_3
      2122: aload_3
      2123: ldc_w         #516                // String %pdef%
      2126: aload_2
      2127: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2130: aconst_null
      2131: invokevirtual #518                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
      2134: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2137: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2140: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2143: astore_3
      2144: aload_3
      2145: ldc_w         #521                // String %mdef%
      2148: aload_2
      2149: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2152: aconst_null
      2153: aconst_null
      2154: invokevirtual #523                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
      2157: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2160: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2163: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2166: astore_3
      2167: aload_3
      2168: ldc_w         #526                // String %accuracy%
      2171: aload_2
      2172: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2175: invokevirtual #528                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getAccuracy:()I
      2178: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2181: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2184: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2187: astore_3
      2188: aload_3
      2189: ldc_w         #531                // String %evasion%
      2192: aload_2
      2193: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2196: aconst_null
      2197: invokevirtual #533                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
      2200: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2203: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2206: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2209: astore_3
      2210: aload_3
      2211: ldc_w         #536                // String %critical%
      2214: aload_2
      2215: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2218: aconst_null
      2219: aconst_null
      2220: invokevirtual #538                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
      2223: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2226: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2229: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2232: astore_3
      2233: aload_3
      2234: ldc_w         #541                // String %mcritical%
      2237: aload_2
      2238: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2241: aconst_null
      2242: aconst_null
      2243: invokevirtual #543                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
      2246: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2249: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2252: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2255: astore_3
      2256: aload_3
      2257: ldc_w         #546                // String %runspeed%
      2260: aload_2
      2261: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2264: invokevirtual #548                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMoveSpeed:()F
      2267: invokestatic  #552                // Method getFloatNumber:(F)Ljava/lang/String;
      2270: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2273: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2276: astore_3
      2277: aload_3
      2278: ldc_w         #556                // String %patkspd%
      2281: aload_2
      2282: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2285: invokevirtual #558                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtkSpd:()I
      2288: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2291: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2294: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2297: astore_3
      2298: aload_3
      2299: ldc_w         #561                // String %matkspd%
      2302: aload_2
      2303: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2306: invokevirtual #563                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtkSpd:()I
      2309: invokestatic  #429                // Method getIntNumber:(I)Ljava/lang/String;
      2312: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2315: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2318: astore_3
      2319: aload_3
      2320: ldc_w         #566                // String %access%
      2323: aload_2
      2324: invokevirtual #568                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
      2327: invokevirtual #572                // Method ext/mods/gameserver/model/AccessLevel.getLevel:()I
      2330: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      2333: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2336: astore_3
      2337: aload_3
      2338: ldc_w         #575                // String %account%
      2341: aload_2
      2342: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
      2345: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2348: astore_3
      2349: aload_3
      2350: ldc_w         #577                // String %max_players%
      2353: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      2356: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
      2359: invokeinterface #98,  1           // InterfaceMethod java/util/Collection.size:()I
      2364: invokestatic  #84                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      2367: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2370: astore_3
      2371: aload_3
      2372: ldc_w         #579                // String %trade%
      2375: aload_2
      2376: invokevirtual #581                // Method ext/mods/gameserver/model/actor/Player.getTradeRefusal:()Z
      2379: ifeq          2387
      2382: ldc           #237                // String <font color=00FF00>ON</font>
      2384: goto          2389
      2387: ldc           #239                // String <font color=FF0000>OFF</font>
      2389: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2392: astore_3
      2393: aload_3
      2394: ldc_w         #584                // String %messagerefusal%
      2397: aload_2
      2398: invokevirtual #586                // Method ext/mods/gameserver/model/actor/Player.isBlockingAll:()Z
      2401: ifeq          2409
      2404: ldc           #237                // String <font color=00FF00>ON</font>
      2406: goto          2411
      2409: ldc           #239                // String <font color=FF0000>OFF</font>
      2411: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2414: astore_3
      2415: aload_3
      2416: ldc_w         #589                // String %gainxp%
      2419: aload_2
      2420: invokevirtual #591                // Method ext/mods/gameserver/model/actor/Player.getStopExp:()Z
      2423: ifeq          2431
      2426: ldc           #237                // String <font color=00FF00>ON</font>
      2428: goto          2433
      2431: ldc           #239                // String <font color=FF0000>OFF</font>
      2433: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2436: astore_3
      2437: aload_3
      2438: ldc_w         #594                // String %playeron%
      2441: aload_0
      2442: invokevirtual #596                // Method getRealOnline:()Ljava/lang/String;
      2445: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2448: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2451: astore_3
      2452: aload_3
      2453: ldc_w         #599                // String %offmode%
      2456: aload_0
      2457: invokevirtual #601                // Method getRealOffline:()Ljava/lang/String;
      2460: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2463: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2466: astore_3
      2467: aload_3
      2468: ldc_w         #604                // String %heroeon%
      2471: aload_0
      2472: invokevirtual #606                // Method getHeroOnline:()Ljava/lang/String;
      2475: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2478: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2481: astore_3
      2482: aload_3
      2483: ldc_w         #609                // String %leaderon%
      2486: aload_0
      2487: invokevirtual #611                // Method getClanLeaderOnline:()Ljava/lang/String;
      2490: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2493: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2496: astore_3
      2497: aload_3
      2498: ldc_w         #614                // String %noblesseon%
      2501: aload_0
      2502: invokevirtual #616                // Method getNobleOnline:()Ljava/lang/String;
      2505: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2508: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2511: astore_3
      2512: aload_3
      2513: ldc_w         #619                // String %jailon%
      2516: aload_0
      2517: invokevirtual #621                // Method getJailOnline:()Ljava/lang/String;
      2520: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2523: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2526: astore_3
      2527: aload_3
      2528: ldc_w         #624                // String %gmon%
      2531: aload_0
      2532: invokevirtual #626                // Method getGMOnline:()Ljava/lang/String;
      2535: invokestatic  #48                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      2538: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2541: astore_3
      2542: aload_2
      2543: invokevirtual #629                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
      2546: ifeq          2563
      2549: aload_3
      2550: ldc_w         #632                // String %noble%
      2553: ldc_w         #634                // String Yes
      2556: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2559: astore_3
      2560: goto          2574
      2563: aload_3
      2564: ldc_w         #632                // String %noble%
      2567: ldc_w         #403                // String No
      2570: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2573: astore_3
      2574: aload_3
      2575: ldc_w         #636                // String %time%
      2578: invokestatic  #638                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/GameTimeTaskManager;
      2581: invokevirtual #643                // Method ext/mods/gameserver/taskmanager/GameTimeTaskManager.getGameTimeFormated:()Ljava/lang/String;
      2584: invokevirtual #52                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      2587: astore_3
      2588: aload_3
      2589: aload_2
      2590: invokestatic  #646                // Method separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
      2593: goto          2602
      2596: aload_0
      2597: aload_1
      2598: aload_2
      2599: invokespecial #650                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
      2602: return
      LineNumberTable:
        line 45: 0
        line 47: 9
        line 48: 29
        line 49: 33
        line 50: 47
        line 51: 58
        line 52: 72
        line 53: 89
        line 54: 110
        line 55: 124
        line 56: 138
        line 57: 158
        line 58: 178
        line 59: 198
        line 61: 212
        line 63: 224
        line 64: 229
        line 66: 244
        line 68: 253
        line 70: 262
        line 71: 278
        line 72: 294
        line 73: 310
        line 74: 326
        line 75: 342
        line 76: 358
        line 77: 374
        line 81: 393
        line 82: 409
        line 83: 425
        line 84: 441
        line 85: 457
        line 86: 473
        line 87: 489
        line 88: 505
        line 91: 521
        line 92: 543
        line 94: 577
        line 96: 584
        line 97: 596
        line 98: 617
        line 99: 632
        line 100: 644
        line 101: 654
        line 103: 665
        line 105: 688
        line 107: 701
        line 109: 725
        line 111: 741
        line 113: 765
        line 115: 778
        line 117: 802
        line 119: 817
        line 121: 829
        line 124: 841
        line 125: 858
        line 126: 875
        line 127: 892
        line 128: 909
        line 129: 926
        line 130: 943
        line 131: 960
        line 132: 977
        line 136: 998
        line 137: 1010
        line 138: 1031
        line 139: 1046
        line 140: 1058
        line 141: 1087
        line 143: 1098
        line 145: 1121
        line 147: 1134
        line 149: 1158
        line 151: 1174
        line 153: 1198
        line 155: 1211
        line 157: 1235
        line 159: 1252
        line 161: 1264
        line 164: 1278
        line 165: 1295
        line 166: 1312
        line 167: 1329
        line 168: 1346
        line 169: 1363
        line 170: 1380
        line 171: 1397
        line 172: 1414
        line 175: 1432
        line 176: 1449
        line 177: 1466
        line 178: 1484
        line 179: 1501
        line 180: 1518
        line 181: 1536
        line 182: 1554
        line 183: 1572
        line 184: 1590
        line 185: 1608
        line 186: 1626
        line 187: 1644
        line 189: 1667
        line 190: 1679
        line 192: 1684
        line 196: 1699
        line 199: 1709
        line 201: 1716
        line 205: 1733
        line 208: 1747
        line 209: 1768
        line 210: 1789
        line 211: 1803
        line 212: 1821
        line 213: 1836
        line 214: 1851
        line 215: 1866
        line 216: 1881
        line 217: 1902
        line 218: 1924
        line 219: 1945
        line 220: 1967
        line 221: 1988
        line 222: 2010
        line 223: 2028
        line 224: 2043
        line 225: 2060
        line 226: 2077
        line 227: 2099
        line 228: 2122
        line 229: 2144
        line 230: 2167
        line 231: 2188
        line 232: 2210
        line 233: 2233
        line 234: 2256
        line 235: 2277
        line 236: 2298
        line 237: 2319
        line 238: 2337
        line 239: 2349
        line 240: 2371
        line 241: 2393
        line 242: 2415
        line 243: 2437
        line 244: 2452
        line 245: 2467
        line 246: 2482
        line 247: 2497
        line 248: 2512
        line 249: 2527
        line 251: 2542
        line 253: 2549
        line 257: 2563
        line 260: 2574
        line 262: 2588
        line 263: 2593
        line 265: 2596
        line 266: 2602
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29    2564     3 content   Ljava/lang/String;
           33    2560     4 noexpirespremium   Ljava/lang/String;
          224    2369     5  clan   Lext/mods/gameserver/model/pledge/Clan;
         1679     914     6 playerClan   Lext/mods/gameserver/model/pledge/Clan;
            0    2603     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            0    2603     1 command   Ljava/lang/String;
            0    2603     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 34
        frame_type = 254 /* append */
          offset_delta = 244
          locals = [ class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 8 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 139
        frame_type = 251 /* same_frame_extended */
          offset_delta = 127
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 127
        frame_type = 39 /* same */
        frame_type = 36 /* same */
        frame_type = 38 /* same */
        frame_type = 23 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 156
        frame_type = 251 /* same_frame_extended */
          offset_delta = 135
        frame_type = 39 /* same */
        frame_type = 36 /* same */
        frame_type = 40 /* same */
        frame_type = 25 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 153
        frame_type = 252 /* append */
          offset_delta = 266
          locals = [ class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 9 /* same */
        frame_type = 23 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 639
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/lang/String, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 129
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/communitybbs/custom/IndexCBManager, class java/lang/String, class ext/mods/gameserver/model/actor/Player ]
          stack = []
        frame_type = 5 /* same */

  public java.lang.String getRealOnline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          60
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        37: ifnull        57
        40: aload_3
        41: invokestatic  #666                // Method ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
        44: ifne          57
        47: aload_3
        48: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        51: ifne          57
        54: iinc          1, 1
        57: goto          14
        60: iload_1
        61: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: areturn
      LineNumberTable:
        line 270: 0
        line 271: 2
        line 273: 14
        line 275: 23
        line 276: 33
        line 278: 54
        line 280: 57
        line 282: 60
        line 283: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      24     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      69     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      67     1 counter   I
           14      55     2  var2   Ljava/util/Iterator;
           67       2     3 realOnline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      55     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */

  public java.lang.String getRealOffline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          60
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #677                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
        37: ifeq          57
        40: aload_3
        41: invokestatic  #666                // Method ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
        44: ifeq          57
        47: aload_3
        48: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        51: ifne          57
        54: iinc          1, 1
        57: goto          14
        60: iload_1
        61: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: areturn
      LineNumberTable:
        line 288: 0
        line 289: 2
        line 291: 14
        line 293: 23
        line 294: 33
        line 296: 54
        line 298: 57
        line 300: 60
        line 301: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      24     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      69     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      67     1 counter   I
           14      55     2  var2   Ljava/util/Iterator;
           67       2     3 realOffline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      55     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */

  public java.lang.String getHeroOnline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          60
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        37: ifnull        57
        40: aload_3
        41: invokevirtual #680                // Method ext/mods/gameserver/model/actor/Player.isHero:()Z
        44: ifeq          57
        47: aload_3
        48: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        51: ifne          57
        54: iinc          1, 1
        57: goto          14
        60: iload_1
        61: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: areturn
      LineNumberTable:
        line 306: 0
        line 307: 2
        line 309: 14
        line 311: 23
        line 312: 33
        line 314: 54
        line 316: 57
        line 318: 60
        line 319: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      24     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      69     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      67     1 counter   I
           14      55     2  var2   Ljava/util/Iterator;
           67       2     3 heroOnline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      55     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */

  public java.lang.String getClanLeaderOnline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          60
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        37: ifnull        57
        40: aload_3
        41: invokevirtual #683                // Method ext/mods/gameserver/model/actor/Player.isClanLeader:()Z
        44: ifeq          57
        47: aload_3
        48: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        51: ifne          57
        54: iinc          1, 1
        57: goto          14
        60: iload_1
        61: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: areturn
      LineNumberTable:
        line 324: 0
        line 325: 2
        line 327: 14
        line 329: 23
        line 330: 33
        line 332: 54
        line 334: 57
        line 336: 60
        line 337: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      24     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      69     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      67     1 counter   I
           14      55     2  var2   Ljava/util/Iterator;
           67       2     3 clanLeaderOnline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      55     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */

  public java.lang.String getNobleOnline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          60
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        37: ifnull        57
        40: aload_3
        41: invokevirtual #629                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
        44: ifeq          57
        47: aload_3
        48: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        51: ifne          57
        54: iinc          1, 1
        57: goto          14
        60: iload_1
        61: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: areturn
      LineNumberTable:
        line 342: 0
        line 343: 2
        line 345: 14
        line 347: 23
        line 348: 33
        line 350: 54
        line 352: 57
        line 354: 60
        line 355: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      24     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      69     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      67     1 counter   I
           14      55     2  var2   Ljava/util/Iterator;
           67       2     3 nobleOnline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      55     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */

  public java.lang.String getJailOnline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          60
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        37: ifnull        57
        40: aload_3
        41: invokevirtual #686                // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
        44: ifeq          57
        47: aload_3
        48: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        51: ifne          57
        54: iinc          1, 1
        57: goto          14
        60: iload_1
        61: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        66: astore_3
        67: aload_3
        68: areturn
      LineNumberTable:
        line 360: 0
        line 361: 2
        line 363: 14
        line 365: 23
        line 366: 33
        line 368: 54
        line 370: 57
        line 372: 60
        line 373: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      24     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      69     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      67     1 counter   I
           14      55     2  var2   Ljava/util/Iterator;
           67       2     3 jailOnline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      55     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 42 /* same */
        frame_type = 2 /* same */

  public java.lang.String getGMOnline();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: invokestatic  #89                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         5: invokevirtual #94                 // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
         8: invokeinterface #653,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        13: astore_2
        14: aload_2
        15: invokeinterface #657,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        20: ifeq          53
        23: aload_2
        24: invokeinterface #662,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        29: checkcast     #22                 // class ext/mods/gameserver/model/actor/Player
        32: astore_3
        33: aload_3
        34: invokevirtual #263                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        37: ifnull        50
        40: aload_3
        41: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        44: ifeq          50
        47: iinc          1, 1
        50: goto          14
        53: iload_1
        54: invokedynamic #675,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        59: astore_3
        60: aload_3
        61: areturn
      LineNumberTable:
        line 378: 0
        line 379: 2
        line 381: 14
        line 383: 23
        line 384: 33
        line 386: 47
        line 388: 50
        line 390: 53
        line 391: 60
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      17     3 onlinePlayer   Lext/mods/gameserver/model/actor/Player;
            0      62     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
            2      60     1 counter   I
           14      48     2  var2   Ljava/util/Iterator;
           60       2     3 gmOnline   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14      48     2  var2   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 35 /* same */
        frame_type = 2 /* same */

  public static java.lang.String getDoubleNumber(double);
    descriptor: (D)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: new           #689                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #691                // String ##,###
         7: invokespecial #693                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: astore_2
        11: aload_2
        12: dload_0
        13: invokevirtual #696                // Method java/text/DecimalFormat.format:(D)Ljava/lang/String;
        16: astore_3
        17: aload_3
        18: areturn
      LineNumberTable:
        line 396: 0
        line 397: 11
        line 398: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0 number   D
           11       8     2    df   Ljava/text/DecimalFormat;
           17       2     3 fivenumbers   Ljava/lang/String;

  public static java.lang.String getRateNumber(double);
    descriptor: (D)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: new           #689                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #698                // String ##.##
         7: invokespecial #693                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: astore_2
        11: aload_2
        12: dload_0
        13: invokevirtual #696                // Method java/text/DecimalFormat.format:(D)Ljava/lang/String;
        16: astore_3
        17: aload_3
        18: areturn
      LineNumberTable:
        line 403: 0
        line 404: 11
        line 405: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0 number   D
           11       8     2    df   Ljava/text/DecimalFormat;
           17       2     3 ratenumbers   Ljava/lang/String;

  public static java.lang.String getIntNumber(int);
    descriptor: (I)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=1
         0: new           #689                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #700                // String #,###,###,###
         7: invokespecial #693                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: astore_1
        11: aload_1
        12: iload_0
        13: i2l
        14: invokevirtual #702                // Method java/text/DecimalFormat.format:(J)Ljava/lang/String;
        17: astore_2
        18: aload_2
        19: areturn
      LineNumberTable:
        line 410: 0
        line 411: 11
        line 412: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0 number   I
           11       9     1    df   Ljava/text/DecimalFormat;
           18       2     2 billionnumbers   Ljava/lang/String;

  public static java.lang.String getLongNumber(long);
    descriptor: (J)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=4, args_size=1
         0: new           #689                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #700                // String #,###,###,###
         7: invokespecial #693                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: astore_2
        11: aload_2
        12: lload_0
        13: invokevirtual #702                // Method java/text/DecimalFormat.format:(J)Ljava/lang/String;
        16: astore_3
        17: aload_3
        18: areturn
      LineNumberTable:
        line 417: 0
        line 418: 11
        line 419: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0 number   J
           11       8     2    df   Ljava/text/DecimalFormat;
           17       2     3 billionnumbers   Ljava/lang/String;

  public static java.lang.String getFloatNumber(float);
    descriptor: (F)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=1
         0: new           #689                // class java/text/DecimalFormat
         3: dup
         4: ldc_w         #704                // String #,###
         7: invokespecial #693                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        10: astore_1
        11: aload_1
        12: fload_0
        13: f2d
        14: invokevirtual #696                // Method java/text/DecimalFormat.format:(D)Ljava/lang/String;
        17: astore_2
        18: aload_2
        19: areturn
      LineNumberTable:
        line 424: 0
        line 425: 11
        line 426: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0 number   F
           11       9     1    df   Ljava/text/DecimalFormat;
           18       2     2 fournumbers   Ljava/lang/String;

  protected java.lang.String getFolder();
    descriptor: ()Ljava/lang/String;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #706                // String custom/
         3: areturn
      LineNumberTable:
        line 432: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/communitybbs/custom/IndexCBManager;

  public static ext.mods.gameserver.communitybbs.custom.IndexCBManager getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #708                // Field ext/mods/gameserver/communitybbs/custom/IndexCBManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
         3: areturn
      LineNumberTable:
        line 437: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #253                // class java/text/SimpleDateFormat
         3: dup
         4: ldc_w         #714                // String dd/MM/yyyy HH:mm
         7: invokespecial #716                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
        10: putstatic     #243                // Field DATE_FORMAT:Ljava/text/SimpleDateFormat;
        13: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "IndexCBManager.java"
NestMembers:
  ext/mods/gameserver/communitybbs/custom/IndexCBManager$SingletonHolder
BootstrapMethods:
  0: #765 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #759 html/CommunityBoard/\u0001index.htm
  1: #765 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #761 <font color=\"00FF7F\">\u0001</font>
  2: #765 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #763 \u0001
InnerClasses:
  public static final #777= #773 of #775; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
