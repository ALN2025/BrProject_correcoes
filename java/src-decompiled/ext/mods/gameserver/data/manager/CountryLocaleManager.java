// Bytecode for: ext.mods.gameserver.data.manager.CountryLocaleManager
// File: ext\mods\gameserver\data\manager\CountryLocaleManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/manager/CountryLocaleManager.class
  Last modified 9 de jul de 2026; size 9668 bytes
  MD5 checksum e7a74635c336846ddde1e5d15a3d860b
  Compiled from "CountryLocaleManager.java"
public final class ext.mods.gameserver.data.manager.CountryLocaleManager
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/data/manager/CountryLocaleManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 15, attributes: 4
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
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/data/manager/CountryLocaleManager._cache:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/data/manager/CountryLocaleManager
   #12 = NameAndType        #14:#15       // _cache:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager
   #14 = Utf8               _cache
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #17.#18       // ext/mods/Config.COUNTRY_LOCALE_ENABLE:Z
   #17 = Class              #19           // ext/mods/Config
   #18 = NameAndType        #20:#21       // COUNTRY_LOCALE_ENABLE:Z
   #19 = Utf8               ext/mods/Config
   #20 = Utf8               COUNTRY_LOCALE_ENABLE
   #21 = Utf8               Z
   #22 = Methodref          #11.#23       // ext/mods/gameserver/data/manager/CountryLocaleManager.resolveIp:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/String;
   #23 = NameAndType        #24:#25       // resolveIp:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/String;
   #24 = Utf8               resolveIp
   #25 = Utf8               (Lext/mods/gameserver/network/GameClient;)Ljava/lang/String;
   #26 = Methodref          #11.#27       // ext/mods/gameserver/data/manager/CountryLocaleManager.isPrivateOrLocal:(Ljava/lang/String;)Z
   #27 = NameAndType        #28:#29       // isPrivateOrLocal:(Ljava/lang/String;)Z
   #28 = Utf8               isPrivateOrLocal
   #29 = Utf8               (Ljava/lang/String;)Z
   #30 = InterfaceMethodref #31.#32       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #31 = Class              #33           // java/util/Map
   #32 = NameAndType        #34:#35       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #33 = Utf8               java/util/Map
   #34 = Utf8               get
   #35 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #36 = Class              #37           // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
   #37 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
   #38 = Methodref          #11.#39       // ext/mods/gameserver/data/manager/CountryLocaleManager.apply:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)V
   #39 = NameAndType        #40:#41       // apply:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)V
   #40 = Utf8               apply
   #41 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)V
   #42 = InvokeDynamic      #0:#43        // #0:run:(Lext/mods/gameserver/data/manager/CountryLocaleManager;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/Runnable;
   #43 = NameAndType        #44:#45       // run:(Lext/mods/gameserver/data/manager/CountryLocaleManager;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/Runnable;
   #44 = Utf8               run
   #45 = Utf8               (Lext/mods/gameserver/data/manager/CountryLocaleManager;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/Runnable;
   #46 = Methodref          #47.#48       // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #47 = Class              #49           // ext/mods/commons/pool/ThreadPool
   #48 = NameAndType        #50:#51       // execute:(Ljava/lang/Runnable;)V
   #49 = Utf8               ext/mods/commons/pool/ThreadPool
   #50 = Utf8               execute
   #51 = Utf8               (Ljava/lang/Runnable;)V
   #52 = Methodref          #53.#54       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #53 = Class              #55           // ext/mods/gameserver/model/actor/Player
   #54 = NameAndType        #56:#57       // isOnline:()Z
   #55 = Utf8               ext/mods/gameserver/model/actor/Player
   #56 = Utf8               isOnline
   #57 = Utf8               ()Z
   #58 = Methodref          #36.#59       // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryCode:()Ljava/lang/String;
   #59 = NameAndType        #60:#61       // countryCode:()Ljava/lang/String;
   #60 = Utf8               countryCode
   #61 = Utf8               ()Ljava/lang/String;
   #62 = Methodref          #11.#63       // ext/mods/gameserver/data/manager/CountryLocaleManager.mapCountryToLocale:(Ljava/lang/String;)Ljava/util/Locale;
   #63 = NameAndType        #64:#65       // mapCountryToLocale:(Ljava/lang/String;)Ljava/util/Locale;
   #64 = Utf8               mapCountryToLocale
   #65 = Utf8               (Ljava/lang/String;)Ljava/util/Locale;
   #66 = Fieldref           #17.#67       // ext/mods/Config.COUNTRY_LOCALE_AUTO_SET:Z
   #67 = NameAndType        #68:#21       // COUNTRY_LOCALE_AUTO_SET:Z
   #68 = Utf8               COUNTRY_LOCALE_AUTO_SET
   #69 = Methodref          #53.#70       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #70 = NameAndType        #71:#72       // getLocale:()Ljava/util/Locale;
   #71 = Utf8               getLocale
   #72 = Utf8               ()Ljava/util/Locale;
   #73 = Methodref          #11.#74       // ext/mods/gameserver/data/manager/CountryLocaleManager.isDefaultLocale:(Ljava/util/Locale;)Z
   #74 = NameAndType        #75:#76       // isDefaultLocale:(Ljava/util/Locale;)Z
   #75 = Utf8               isDefaultLocale
   #76 = Utf8               (Ljava/util/Locale;)Z
   #77 = Methodref          #53.#78       // ext/mods/gameserver/model/actor/Player.setLocale:(Ljava/util/Locale;)V
   #78 = NameAndType        #79:#80       // setLocale:(Ljava/util/Locale;)V
   #79 = Utf8               setLocale
   #80 = Utf8               (Ljava/util/Locale;)V
   #81 = Fieldref           #17.#82       // ext/mods/Config.COUNTRY_LOCALE_NOTIFY:Z
   #82 = NameAndType        #83:#21       // COUNTRY_LOCALE_NOTIFY:Z
   #83 = Utf8               COUNTRY_LOCALE_NOTIFY
   #84 = Methodref          #36.#85       // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo.countryName:()Ljava/lang/String;
   #85 = NameAndType        #86:#61       // countryName:()Ljava/lang/String;
   #86 = Utf8               countryName
   #87 = Methodref          #88.#89       // java/util/Locale.getDisplayName:(Ljava/util/Locale;)Ljava/lang/String;
   #88 = Class              #90           // java/util/Locale
   #89 = NameAndType        #91:#92       // getDisplayName:(Ljava/util/Locale;)Ljava/lang/String;
   #90 = Utf8               java/util/Locale
   #91 = Utf8               getDisplayName
   #92 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
   #93 = Methodref          #53.#94       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #94 = NameAndType        #95:#96       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #95 = Utf8               getSysString
   #96 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #97 = Methodref          #53.#98       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #98 = NameAndType        #99:#100      // sendMessage:(Ljava/lang/String;)V
   #99 = Utf8               sendMessage
  #100 = Utf8               (Ljava/lang/String;)V
  #101 = Methodref          #88.#102      // java/util/Locale.toLanguageTag:()Ljava/lang/String;
  #102 = NameAndType        #103:#61      // toLanguageTag:()Ljava/lang/String;
  #103 = Utf8               toLanguageTag
  #104 = Fieldref           #17.#105      // ext/mods/Config.DEFAULT_LOCALE:Ljava/util/Locale;
  #105 = NameAndType        #106:#107     // DEFAULT_LOCALE:Ljava/util/Locale;
  #106 = Utf8               DEFAULT_LOCALE
  #107 = Utf8               Ljava/util/Locale;
  #108 = Methodref          #109.#110     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #109 = Class              #111          // java/lang/String
  #110 = NameAndType        #112:#29      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #111 = Utf8               java/lang/String
  #112 = Utf8               equalsIgnoreCase
  #113 = Methodref          #109.#114     // java/lang/String.isEmpty:()Z
  #114 = NameAndType        #115:#57      // isEmpty:()Z
  #115 = Utf8               isEmpty
  #116 = Fieldref           #17.#117      // ext/mods/Config.COUNTRY_LOCALE_MAP:Ljava/util/Map;
  #117 = NameAndType        #118:#15      // COUNTRY_LOCALE_MAP:Ljava/util/Map;
  #118 = Utf8               COUNTRY_LOCALE_MAP
  #119 = Fieldref           #88.#120      // java/util/Locale.ROOT:Ljava/util/Locale;
  #120 = NameAndType        #121:#107     // ROOT:Ljava/util/Locale;
  #121 = Utf8               ROOT
  #122 = Methodref          #109.#123     // java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
  #123 = NameAndType        #124:#92      // toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
  #124 = Utf8               toUpperCase
  #125 = Methodref          #88.#126      // java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #126 = NameAndType        #127:#65      // forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #127 = Utf8               forLanguageTag
  #128 = Fieldref           #17.#129      // ext/mods/Config.LOCALES:Ljava/util/Set;
  #129 = NameAndType        #130:#131     // LOCALES:Ljava/util/Set;
  #130 = Utf8               LOCALES
  #131 = Utf8               Ljava/util/Set;
  #132 = InterfaceMethodref #133.#134     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #133 = Class              #135          // java/util/Set
  #134 = NameAndType        #136:#137     // contains:(Ljava/lang/Object;)Z
  #135 = Utf8               java/util/Set
  #136 = Utf8               contains
  #137 = Utf8               (Ljava/lang/Object;)Z
  #138 = Fieldref           #17.#139      // ext/mods/Config.COUNTRY_LOCALE_API_URL:Ljava/lang/String;
  #139 = NameAndType        #140:#141     // COUNTRY_LOCALE_API_URL:Ljava/lang/String;
  #140 = Utf8               COUNTRY_LOCALE_API_URL
  #141 = Utf8               Ljava/lang/String;
  #142 = Methodref          #109.#143     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #143 = NameAndType        #144:#145     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #144 = Utf8               format
  #145 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #146 = Methodref          #147.#148     // java/net/URI.create:(Ljava/lang/String;)Ljava/net/URI;
  #147 = Class              #149          // java/net/URI
  #148 = NameAndType        #150:#151     // create:(Ljava/lang/String;)Ljava/net/URI;
  #149 = Utf8               java/net/URI
  #150 = Utf8               create
  #151 = Utf8               (Ljava/lang/String;)Ljava/net/URI;
  #152 = Methodref          #147.#153     // java/net/URI.toURL:()Ljava/net/URL;
  #153 = NameAndType        #154:#155     // toURL:()Ljava/net/URL;
  #154 = Utf8               toURL
  #155 = Utf8               ()Ljava/net/URL;
  #156 = Methodref          #157.#158     // java/net/URL.openConnection:()Ljava/net/URLConnection;
  #157 = Class              #159          // java/net/URL
  #158 = NameAndType        #160:#161     // openConnection:()Ljava/net/URLConnection;
  #159 = Utf8               java/net/URL
  #160 = Utf8               openConnection
  #161 = Utf8               ()Ljava/net/URLConnection;
  #162 = Class              #163          // java/net/HttpURLConnection
  #163 = Utf8               java/net/HttpURLConnection
  #164 = Fieldref           #17.#165      // ext/mods/Config.COUNTRY_LOCALE_TIMEOUT_MS:I
  #165 = NameAndType        #166:#167     // COUNTRY_LOCALE_TIMEOUT_MS:I
  #166 = Utf8               COUNTRY_LOCALE_TIMEOUT_MS
  #167 = Utf8               I
  #168 = Methodref          #162.#169     // java/net/HttpURLConnection.setConnectTimeout:(I)V
  #169 = NameAndType        #170:#171     // setConnectTimeout:(I)V
  #170 = Utf8               setConnectTimeout
  #171 = Utf8               (I)V
  #172 = Methodref          #162.#173     // java/net/HttpURLConnection.setReadTimeout:(I)V
  #173 = NameAndType        #174:#171     // setReadTimeout:(I)V
  #174 = Utf8               setReadTimeout
  #175 = String             #176          // Accept
  #176 = Utf8               Accept
  #177 = String             #178          // application/json
  #178 = Utf8               application/json
  #179 = Methodref          #162.#180     // java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
  #180 = NameAndType        #181:#182     // setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
  #181 = Utf8               setRequestProperty
  #182 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #183 = String             #184          // User-Agent
  #184 = Utf8               User-Agent
  #185 = String             #186          // Brproject-GameServer
  #186 = Utf8               Brproject-GameServer
  #187 = Methodref          #162.#188     // java/net/HttpURLConnection.getResponseCode:()I
  #188 = NameAndType        #189:#190     // getResponseCode:()I
  #189 = Utf8               getResponseCode
  #190 = Utf8               ()I
  #191 = Methodref          #162.#192     // java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
  #192 = NameAndType        #193:#194     // getInputStream:()Ljava/io/InputStream;
  #193 = Utf8               getInputStream
  #194 = Utf8               ()Ljava/io/InputStream;
  #195 = Methodref          #196.#197     // java/io/InputStream.readAllBytes:()[B
  #196 = Class              #198          // java/io/InputStream
  #197 = NameAndType        #199:#200     // readAllBytes:()[B
  #198 = Utf8               java/io/InputStream
  #199 = Utf8               readAllBytes
  #200 = Utf8               ()[B
  #201 = Fieldref           #202.#203     // java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
  #202 = Class              #204          // java/nio/charset/StandardCharsets
  #203 = NameAndType        #205:#206     // UTF_8:Ljava/nio/charset/Charset;
  #204 = Utf8               java/nio/charset/StandardCharsets
  #205 = Utf8               UTF_8
  #206 = Utf8               Ljava/nio/charset/Charset;
  #207 = Methodref          #109.#208     // java/lang/String."<init>":([BLjava/nio/charset/Charset;)V
  #208 = NameAndType        #5:#209       // "<init>":([BLjava/nio/charset/Charset;)V
  #209 = Utf8               ([BLjava/nio/charset/Charset;)V
  #210 = String             #211          // \"success\"
  #211 = Utf8               \"success\"
  #212 = Methodref          #109.#213     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #213 = NameAndType        #136:#214     // contains:(Ljava/lang/CharSequence;)Z
  #214 = Utf8               (Ljava/lang/CharSequence;)Z
  #215 = Fieldref           #11.#216      // ext/mods/gameserver/data/manager/CountryLocaleManager.COUNTRY_CODE_PATTERN:Ljava/util/regex/Pattern;
  #216 = NameAndType        #217:#218     // COUNTRY_CODE_PATTERN:Ljava/util/regex/Pattern;
  #217 = Utf8               COUNTRY_CODE_PATTERN
  #218 = Utf8               Ljava/util/regex/Pattern;
  #219 = Methodref          #11.#220      // ext/mods/gameserver/data/manager/CountryLocaleManager.extract:(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
  #220 = NameAndType        #221:#222     // extract:(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
  #221 = Utf8               extract
  #222 = Utf8               (Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
  #223 = Fieldref           #11.#224      // ext/mods/gameserver/data/manager/CountryLocaleManager.COUNTRY_NAME_PATTERN:Ljava/util/regex/Pattern;
  #224 = NameAndType        #225:#218     // COUNTRY_NAME_PATTERN:Ljava/util/regex/Pattern;
  #225 = Utf8               COUNTRY_NAME_PATTERN
  #226 = Methodref          #36.#227      // ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #227 = NameAndType        #5:#182       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #228 = Class              #229          // java/lang/Exception
  #229 = Utf8               java/lang/Exception
  #230 = Fieldref           #17.#231      // ext/mods/Config.DEVELOPER:Z
  #231 = NameAndType        #232:#21      // DEVELOPER:Z
  #232 = Utf8               DEVELOPER
  #233 = Fieldref           #11.#234      // ext/mods/gameserver/data/manager/CountryLocaleManager.LOGGER:Lext/mods/commons/logging/CLogger;
  #234 = NameAndType        #235:#236     // LOGGER:Lext/mods/commons/logging/CLogger;
  #235 = Utf8               LOGGER
  #236 = Utf8               Lext/mods/commons/logging/CLogger;
  #237 = String             #238          // Country lookup failed for {}: {}
  #238 = Utf8               Country lookup failed for {}: {}
  #239 = Methodref          #228.#240     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #240 = NameAndType        #241:#61      // getMessage:()Ljava/lang/String;
  #241 = Utf8               getMessage
  #242 = Methodref          #243.#244     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #243 = Class              #245          // ext/mods/commons/logging/CLogger
  #244 = NameAndType        #246:#247     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #245 = Utf8               ext/mods/commons/logging/CLogger
  #246 = Utf8               warn
  #247 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #248 = Methodref          #249.#250     // java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #249 = Class              #251          // java/util/regex/Pattern
  #250 = NameAndType        #252:#253     // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #251 = Utf8               java/util/regex/Pattern
  #252 = Utf8               matcher
  #253 = Utf8               (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
  #254 = Methodref          #255.#256     // java/util/regex/Matcher.find:()Z
  #255 = Class              #257          // java/util/regex/Matcher
  #256 = NameAndType        #258:#57      // find:()Z
  #257 = Utf8               java/util/regex/Matcher
  #258 = Utf8               find
  #259 = Methodref          #255.#260     // java/util/regex/Matcher.group:(I)Ljava/lang/String;
  #260 = NameAndType        #261:#262     // group:(I)Ljava/lang/String;
  #261 = Utf8               group
  #262 = Utf8               (I)Ljava/lang/String;
  #263 = Methodref          #264.#265     // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #264 = Class              #266          // ext/mods/gameserver/network/GameClient
  #265 = NameAndType        #267:#268     // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #266 = Utf8               ext/mods/gameserver/network/GameClient
  #267 = Utf8               getConnection
  #268 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #269 = Methodref          #270.#271     // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #270 = Class              #272          // ext/mods/commons/mmocore/MMOConnection
  #271 = NameAndType        #273:#274     // getInetAddress:()Ljava/net/InetAddress;
  #272 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #273 = Utf8               getInetAddress
  #274 = Utf8               ()Ljava/net/InetAddress;
  #275 = Methodref          #276.#277     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #276 = Class              #278          // java/net/InetAddress
  #277 = NameAndType        #279:#61      // getHostAddress:()Ljava/lang/String;
  #278 = Utf8               java/net/InetAddress
  #279 = Utf8               getHostAddress
  #280 = Methodref          #276.#281     // java/net/InetAddress.getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
  #281 = NameAndType        #282:#283     // getByName:(Ljava/lang/String;)Ljava/net/InetAddress;
  #282 = Utf8               getByName
  #283 = Utf8               (Ljava/lang/String;)Ljava/net/InetAddress;
  #284 = Methodref          #276.#285     // java/net/InetAddress.isAnyLocalAddress:()Z
  #285 = NameAndType        #286:#57      // isAnyLocalAddress:()Z
  #286 = Utf8               isAnyLocalAddress
  #287 = Methodref          #276.#288     // java/net/InetAddress.isLoopbackAddress:()Z
  #288 = NameAndType        #289:#57      // isLoopbackAddress:()Z
  #289 = Utf8               isLoopbackAddress
  #290 = Methodref          #276.#291     // java/net/InetAddress.isSiteLocalAddress:()Z
  #291 = NameAndType        #292:#57      // isSiteLocalAddress:()Z
  #292 = Utf8               isSiteLocalAddress
  #293 = Methodref          #109.#294     // java/lang/String.isBlank:()Z
  #294 = NameAndType        #295:#57      // isBlank:()Z
  #295 = Utf8               isBlank
  #296 = String             #297          // ,
  #297 = Utf8               ,
  #298 = Methodref          #109.#299     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #299 = NameAndType        #300:#301     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #300 = Utf8               split
  #301 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #302 = Methodref          #109.#303     // java/lang/String.trim:()Ljava/lang/String;
  #303 = NameAndType        #304:#61      // trim:()Ljava/lang/String;
  #304 = Utf8               trim
  #305 = Methodref          #109.#306     // java/lang/String.indexOf:(I)I
  #306 = NameAndType        #307:#308     // indexOf:(I)I
  #307 = Utf8               indexOf
  #308 = Utf8               (I)I
  #309 = Methodref          #109.#310     // java/lang/String.substring:(II)Ljava/lang/String;
  #310 = NameAndType        #311:#312     // substring:(II)Ljava/lang/String;
  #311 = Utf8               substring
  #312 = Utf8               (II)Ljava/lang/String;
  #313 = Methodref          #109.#314     // java/lang/String.substring:(I)Ljava/lang/String;
  #314 = NameAndType        #311:#262     // substring:(I)Ljava/lang/String;
  #315 = InterfaceMethodref #31.#316      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #316 = NameAndType        #317:#318     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #317 = Utf8               put
  #318 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #319 = Class              #320          // java/util/HashMap
  #320 = Utf8               java/util/HashMap
  #321 = Methodref          #319.#3       // java/util/HashMap."<init>":()V
  #322 = String             #323          // BR
  #323 = Utf8               BR
  #324 = String             #325          // pt-BR
  #325 = Utf8               pt-BR
  #326 = String             #327          // PT
  #327 = Utf8               PT
  #328 = String             #329          // US
  #329 = Utf8               US
  #330 = String             #331          // en-US
  #331 = Utf8               en-US
  #332 = String             #333          // GB
  #333 = Utf8               GB
  #334 = String             #335          // RU
  #335 = Utf8               RU
  #336 = String             #337          // ru-RU
  #337 = Utf8               ru-RU
  #338 = String             #339          // BY
  #339 = Utf8               BY
  #340 = String             #341          // KZ
  #341 = Utf8               KZ
  #342 = String             #343          // UA
  #343 = Utf8               UA
  #344 = Fieldref           #345.#346     // ext/mods/gameserver/data/manager/CountryLocaleManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CountryLocaleManager;
  #345 = Class              #347          // ext/mods/gameserver/data/manager/CountryLocaleManager$SingletonHolder
  #346 = NameAndType        #348:#349     // INSTANCE:Lext/mods/gameserver/data/manager/CountryLocaleManager;
  #347 = Utf8               ext/mods/gameserver/data/manager/CountryLocaleManager$SingletonHolder
  #348 = Utf8               INSTANCE
  #349 = Utf8               Lext/mods/gameserver/data/manager/CountryLocaleManager;
  #350 = Methodref          #11.#351      // ext/mods/gameserver/data/manager/CountryLocaleManager.buildDefaultCountryMap:()Ljava/util/Map;
  #351 = NameAndType        #352:#353     // buildDefaultCountryMap:()Ljava/util/Map;
  #352 = Utf8               buildDefaultCountryMap
  #353 = Utf8               ()Ljava/util/Map;
  #354 = Methodref          #11.#355      // ext/mods/gameserver/data/manager/CountryLocaleManager.parseCountryMap:(Ljava/lang/String;Ljava/util/Map;)V
  #355 = NameAndType        #356:#357     // parseCountryMap:(Ljava/lang/String;Ljava/util/Map;)V
  #356 = Utf8               parseCountryMap
  #357 = Utf8               (Ljava/lang/String;Ljava/util/Map;)V
  #358 = InterfaceMethodref #31.#359      // java/util/Map.clear:()V
  #359 = NameAndType        #360:#6       // clear:()V
  #360 = Utf8               clear
  #361 = InterfaceMethodref #31.#362      // java/util/Map.putAll:(Ljava/util/Map;)V
  #362 = NameAndType        #363:#364     // putAll:(Ljava/util/Map;)V
  #363 = Utf8               putAll
  #364 = Utf8               (Ljava/util/Map;)V
  #365 = Methodref          #53.#366      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #366 = NameAndType        #367:#368     // getClient:()Lext/mods/gameserver/network/GameClient;
  #367 = Utf8               getClient
  #368 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #369 = Methodref          #11.#370      // ext/mods/gameserver/data/manager/CountryLocaleManager.lookup:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
  #370 = NameAndType        #371:#372     // lookup:(Ljava/lang/String;)Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
  #371 = Utf8               lookup
  #372 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
  #373 = Methodref          #374.#375     // java/lang/Class.getName:()Ljava/lang/String;
  #374 = Class              #376          // java/lang/Class
  #375 = NameAndType        #377:#61      // getName:()Ljava/lang/String;
  #376 = Utf8               java/lang/Class
  #377 = Utf8               getName
  #378 = Methodref          #243.#379     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #379 = NameAndType        #5:#100       // "<init>":(Ljava/lang/String;)V
  #380 = String             #381          // \"countryCode\"\\s*:\\s*\"([^\"]+)\"
  #381 = Utf8               \"countryCode\"\\s*:\\s*\"([^\"]+)\"
  #382 = Methodref          #249.#383     // java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #383 = NameAndType        #384:#385     // compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
  #384 = Utf8               compile
  #385 = Utf8               (Ljava/lang/String;)Ljava/util/regex/Pattern;
  #386 = String             #387          // \"country\"\\s*:\\s*\"([^\"]+)\"
  #387 = Utf8               \"country\"\\s*:\\s*\"([^\"]+)\"
  #388 = Utf8               Signature
  #389 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;>;
  #390 = Utf8               Code
  #391 = Utf8               LineNumberTable
  #392 = Utf8               LocalVariableTable
  #393 = Utf8               this
  #394 = Utf8               onEnterWorld
  #395 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
  #396 = Utf8               player
  #397 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #398 = Utf8               client
  #399 = Utf8               Lext/mods/gameserver/network/GameClient;
  #400 = Utf8               ip
  #401 = Utf8               cached
  #402 = Utf8               Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
  #403 = Utf8               StackMapTable
  #404 = Utf8               info
  #405 = Utf8               mapped
  #406 = Utf8               canAutoSet
  #407 = Utf8               current
  #408 = Utf8               tag
  #409 = Utf8               locale
  #410 = Utf8               url
  #411 = Utf8               conn
  #412 = Utf8               Ljava/net/HttpURLConnection;
  #413 = Utf8               body
  #414 = Utf8               [B
  #415 = Utf8               json
  #416 = Utf8               code
  #417 = Utf8               name
  #418 = Utf8               e
  #419 = Utf8               Ljava/lang/Exception;
  #420 = Class              #414          // "[B"
  #421 = Utf8               pattern
  #422 = Utf8               Ljava/util/regex/Matcher;
  #423 = Utf8               addr
  #424 = Utf8               Ljava/net/InetAddress;
  #425 = Utf8               part
  #426 = Utf8               eq
  #427 = Utf8               entry
  #428 = Utf8               raw
  #429 = Utf8               target
  #430 = Utf8               LocalVariableTypeTable
  #431 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #432 = Class              #433          // "[Ljava/lang/String;"
  #433 = Utf8               [Ljava/lang/String;
  #434 = Utf8               (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
  #435 = Utf8               map
  #436 = Utf8               ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #437 = Utf8               getInstance
  #438 = Utf8               ()Lext/mods/gameserver/data/manager/CountryLocaleManager;
  #439 = Utf8               reloadCountryMap
  #440 = Utf8               lambda$onEnterWorld$0
  #441 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #442 = Utf8               <clinit>
  #443 = Utf8               SourceFile
  #444 = Utf8               CountryLocaleManager.java
  #445 = Utf8               NestMembers
  #446 = Utf8               BootstrapMethods
  #447 = MethodType         #6            //  ()V
  #448 = MethodHandle       5:#449        // REF_invokeVirtual ext/mods/gameserver/data/manager/CountryLocaleManager.lambda$onEnterWorld$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #449 = Methodref          #11.#450      // ext/mods/gameserver/data/manager/CountryLocaleManager.lambda$onEnterWorld$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #450 = NameAndType        #440:#441     // lambda$onEnterWorld$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #451 = MethodHandle       6:#452        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #452 = Methodref          #453.#454     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #453 = Class              #455          // java/lang/invoke/LambdaMetafactory
  #454 = NameAndType        #456:#457     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Utf8               java/lang/invoke/LambdaMetafactory
  #456 = Utf8               metafactory
  #457 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #458 = Utf8               InnerClasses
  #459 = Utf8               CountryInfo
  #460 = Utf8               SingletonHolder
  #461 = Class              #462          // java/lang/invoke/MethodHandles$Lookup
  #462 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #463 = Class              #464          // java/lang/invoke/MethodHandles
  #464 = Utf8               java/lang/invoke/MethodHandles
  #465 = Utf8               Lookup
{
  protected ext.mods.gameserver.data.manager.CountryLocaleManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentHashMap
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        12: putfield      #10                 // Field _cache:Ljava/util/Map;
        15: return
      LineNumberTable:
        line 41: 0
        line 34: 4
        line 42: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager;

  public void onEnterWorld(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.GameClient);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: getstatic     #16                 // Field ext/mods/Config.COUNTRY_LOCALE_ENABLE:Z
         3: ifeq          14
         6: aload_1
         7: ifnull        14
        10: aload_2
        11: ifnonnull     15
        14: return
        15: aload_2
        16: invokestatic  #22                 // Method resolveIp:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/String;
        19: astore_3
        20: aload_3
        21: ifnull        31
        24: aload_3
        25: invokestatic  #26                 // Method isPrivateOrLocal:(Ljava/lang/String;)Z
        28: ifeq          32
        31: return
        32: aload_0
        33: getfield      #10                 // Field _cache:Ljava/util/Map;
        36: aload_3
        37: invokeinterface #30,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        42: checkcast     #36                 // class ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
        45: astore        4
        47: aload         4
        49: ifnull        60
        52: aload_0
        53: aload_1
        54: aload         4
        56: invokevirtual #38                 // Method apply:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;)V
        59: return
        60: aload_0
        61: aload_1
        62: aload_3
        63: invokedynamic #42,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/data/manager/CountryLocaleManager;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/Runnable;
        68: invokestatic  #46                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        71: return
      LineNumberTable:
        line 46: 0
        line 47: 14
        line 49: 15
        line 50: 20
        line 51: 31
        line 53: 32
        line 54: 47
        line 56: 52
        line 57: 59
        line 60: 60
        line 72: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/data/manager/CountryLocaleManager;
            0      72     1 player   Lext/mods/gameserver/model/actor/Player;
            0      72     2 client   Lext/mods/gameserver/network/GameClient;
           20      52     3    ip   Ljava/lang/String;
           47      25     4 cached   Lext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo;
      StackMapTable: number_of_entries = 5
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/String ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo ]

  static java.util.Map<java.lang.String, java.lang.String> buildDefaultCountryMap();
    descriptor: ()Ljava/util/Map;
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=1, args_size=0
         0: new           #319                // class java/util/HashMap
         3: dup
         4: invokespecial #321                // Method java/util/HashMap."<init>":()V
         7: astore_0
         8: aload_0
         9: ldc_w         #322                // String BR
        12: ldc_w         #324                // String pt-BR
        15: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        20: pop
        21: aload_0
        22: ldc_w         #326                // String PT
        25: ldc_w         #324                // String pt-BR
        28: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        33: pop
        34: aload_0
        35: ldc_w         #328                // String US
        38: ldc_w         #330                // String en-US
        41: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        46: pop
        47: aload_0
        48: ldc_w         #332                // String GB
        51: ldc_w         #330                // String en-US
        54: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        59: pop
        60: aload_0
        61: ldc_w         #334                // String RU
        64: ldc_w         #336                // String ru-RU
        67: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        72: pop
        73: aload_0
        74: ldc_w         #338                // String BY
        77: ldc_w         #336                // String ru-RU
        80: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        85: pop
        86: aload_0
        87: ldc_w         #340                // String KZ
        90: ldc_w         #336                // String ru-RU
        93: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        98: pop
        99: aload_0
       100: ldc_w         #342                // String UA
       103: ldc_w         #336                // String ru-RU
       106: invokeinterface #315,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       111: pop
       112: aload_0
       113: areturn
      LineNumberTable:
        line 205: 0
        line 206: 8
        line 207: 21
        line 208: 34
        line 209: 47
        line 210: 60
        line 211: 73
        line 212: 86
        line 213: 99
        line 214: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8     106     0   map   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     106     0   map   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
    Signature: #436                         // ()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;

  public static ext.mods.gameserver.data.manager.CountryLocaleManager getInstance();
    descriptor: ()Lext/mods/gameserver/data/manager/CountryLocaleManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #344                // Field ext/mods/gameserver/data/manager/CountryLocaleManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/data/manager/CountryLocaleManager;
         3: areturn
      LineNumberTable:
        line 219: 0

  public static void reloadCountryMap(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #350                // Method buildDefaultCountryMap:()Ljava/util/Map;
         3: astore_1
         4: aload_0
         5: aload_1
         6: invokestatic  #354                // Method parseCountryMap:(Ljava/lang/String;Ljava/util/Map;)V
         9: getstatic     #116                // Field ext/mods/Config.COUNTRY_LOCALE_MAP:Ljava/util/Map;
        12: invokeinterface #358,  1          // InterfaceMethod java/util/Map.clear:()V
        17: getstatic     #116                // Field ext/mods/Config.COUNTRY_LOCALE_MAP:Ljava/util/Map;
        20: aload_1
        21: invokeinterface #361,  2          // InterfaceMethod java/util/Map.putAll:(Ljava/util/Map;)V
        26: return
      LineNumberTable:
        line 229: 0
        line 230: 4
        line 231: 9
        line 232: 17
        line 233: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0   raw   Ljava/lang/String;
            4      23     1   map   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            4      23     1   map   Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #243                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/data/manager/CountryLocaleManager
         6: invokevirtual #373                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #378                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #233                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: ldc_w         #380                // String \"countryCode\"\\s*:\\s*\"([^\"]+)\"
        18: invokestatic  #382                // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        21: putstatic     #215                // Field COUNTRY_CODE_PATTERN:Ljava/util/regex/Pattern;
        24: ldc_w         #386                // String \"country\"\\s*:\\s*\"([^\"]+)\"
        27: invokestatic  #382                // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        30: putstatic     #223                // Field COUNTRY_NAME_PATTERN:Ljava/util/regex/Pattern;
        33: return
      LineNumberTable:
        line 29: 0
        line 31: 15
        line 32: 24
}
SourceFile: "CountryLocaleManager.java"
NestMembers:
  ext/mods/gameserver/data/manager/CountryLocaleManager$SingletonHolder
  ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo
BootstrapMethods:
  0: #451 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #447 ()V
      #448 REF_invokeVirtual ext/mods/gameserver/data/manager/CountryLocaleManager.lambda$onEnterWorld$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      #447 ()V
InnerClasses:
  public static final #459= #36 of #11;   // CountryInfo=class ext/mods/gameserver/data/manager/CountryLocaleManager$CountryInfo of class ext/mods/gameserver/data/manager/CountryLocaleManager
  public static final #465= #461 of #463; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
