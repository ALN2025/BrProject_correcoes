// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Menu
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Menu.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Menu.class
  Last modified 9 de jul de 2026; size 7074 bytes
  MD5 checksum f3b8822d1e82d2b332a1ab24d16bffff
  Compiled from "Menu.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Menu implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #32                         // ext/mods/gameserver/handler/voicedcommandhandlers/Menu
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ENABLE_MENU:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ENABLE_MENU:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ENABLE_MENU
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               getSysString
   #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #20 = NameAndType        #21:#22       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               sendMessage
   #22 = Utf8               (Ljava/lang/String;)V
   #23 = String             #24           // menu
   #24 = Utf8               menu
   #25 = Methodref          #26.#27       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #26 = Class              #28           // java/lang/String
   #27 = NameAndType        #29:#30       // equals:(Ljava/lang/Object;)Z
   #28 = Utf8               java/lang/String
   #29 = Utf8               equals
   #30 = Utf8               (Ljava/lang/Object;)Z
   #31 = Methodref          #32.#33       // ext/mods/gameserver/handler/voicedcommandhandlers/Menu.showHtm:(Lext/mods/gameserver/model/actor/Player;)V
   #32 = Class              #34           // ext/mods/gameserver/handler/voicedcommandhandlers/Menu
   #33 = NameAndType        #35:#36       // showHtm:(Lext/mods/gameserver/model/actor/Player;)V
   #34 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Menu
   #35 = Utf8               showHtm
   #36 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #37 = String             #38           // exp
   #38 = Utf8               exp
   #39 = Methodref          #26.#40       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #40 = NameAndType        #41:#42       // startsWith:(Ljava/lang/String;)Z
   #41 = Utf8               startsWith
   #42 = Utf8               (Ljava/lang/String;)Z
   #43 = Methodref          #14.#44       // ext/mods/gameserver/model/actor/Player.getStopExp:()Z
   #44 = NameAndType        #45:#46       // getStopExp:()Z
   #45 = Utf8               getStopExp
   #46 = Utf8               ()Z
   #47 = Methodref          #14.#48       // ext/mods/gameserver/model/actor/Player.setStopExp:(Z)V
   #48 = NameAndType        #49:#50       // setStopExp:(Z)V
   #49 = Utf8               setStopExp
   #50 = Utf8               (Z)V
   #51 = String             #52           // trade
   #52 = Utf8               trade
   #53 = Methodref          #14.#54       // ext/mods/gameserver/model/actor/Player.getTradeRefusal:()Z
   #54 = NameAndType        #55:#46       // getTradeRefusal:()Z
   #55 = Utf8               getTradeRefusal
   #56 = Methodref          #14.#57       // ext/mods/gameserver/model/actor/Player.setTradeRefusal:(Z)V
   #57 = NameAndType        #58:#50       // setTradeRefusal:(Z)V
   #58 = Utf8               setTradeRefusal
   #59 = String             #60           // autoloot
   #60 = Utf8               autoloot
   #61 = Methodref          #14.#62       // ext/mods/gameserver/model/actor/Player.getAutoLoot:()Z
   #62 = NameAndType        #63:#46       // getAutoLoot:()Z
   #63 = Utf8               getAutoLoot
   #64 = Methodref          #14.#65       // ext/mods/gameserver/model/actor/Player.setAutoLoot:(Z)V
   #65 = NameAndType        #66:#50       // setAutoLoot:(Z)V
   #66 = Utf8               setAutoLoot
   #67 = String             #68           // buffprotect
   #68 = Utf8               buffprotect
   #69 = Methodref          #14.#70       // ext/mods/gameserver/model/actor/Player.isBuffProtected:()Z
   #70 = NameAndType        #71:#46       // isBuffProtected:()Z
   #71 = Utf8               isBuffProtected
   #72 = Methodref          #14.#73       // ext/mods/gameserver/model/actor/Player.setBuffProtected:(Z)V
   #73 = NameAndType        #74:#50       // setBuffProtected:(Z)V
   #74 = Utf8               setBuffProtected
   #75 = String             #76           // offline
   #76 = Utf8               offline
   #77 = Methodref          #78.#79       // ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
   #78 = Class              #80           // ext/mods/gameserver/data/sql/OfflineTradersTable
   #79 = NameAndType        #81:#82       // offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
   #80 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable
   #81 = Utf8               offlineMode
   #82 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #83 = Methodref          #14.#84       // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
   #84 = NameAndType        #85:#46       // isInStoreMode:()Z
   #85 = Utf8               isInStoreMode
   #86 = Fieldref           #8.#87        // ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
   #87 = NameAndType        #88:#12       // OFFLINE_TRADE_ENABLE:Z
   #88 = Utf8               OFFLINE_TRADE_ENABLE
   #89 = Methodref          #14.#90       // ext/mods/gameserver/model/actor/Player.isCrafting:()Z
   #90 = NameAndType        #91:#46       // isCrafting:()Z
   #91 = Utf8               isCrafting
   #92 = Fieldref           #8.#93        // ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
   #93 = NameAndType        #94:#12       // OFFLINE_CRAFT_ENABLE:Z
   #94 = Utf8               OFFLINE_CRAFT_ENABLE
   #95 = Methodref          #14.#96       // ext/mods/gameserver/model/actor/Player.logout:(Z)V
   #96 = NameAndType        #97:#50       // logout:(Z)V
   #97 = Utf8               logout
   #98 = Methodref          #78.#99       // ext/mods/gameserver/data/sql/OfflineTradersTable.getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
   #99 = NameAndType        #100:#101     // getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
  #100 = Utf8               getInstance
  #101 = Utf8               ()Lext/mods/gameserver/data/sql/OfflineTradersTable;
  #102 = Methodref          #78.#103      // ext/mods/gameserver/data/sql/OfflineTradersTable.saveOfflineTraders:(Lext/mods/gameserver/model/actor/Player;)V
  #103 = NameAndType        #104:#36      // saveOfflineTraders:(Lext/mods/gameserver/model/actor/Player;)V
  #104 = Utf8               saveOfflineTraders
  #105 = String             #106          // lang
  #106 = Utf8               lang
  #107 = Methodref          #26.#108      // java/lang/String.length:()I
  #108 = NameAndType        #109:#110     // length:()I
  #109 = Utf8               length
  #110 = Utf8               ()I
  #111 = Methodref          #26.#112      // java/lang/String.substring:(I)Ljava/lang/String;
  #112 = NameAndType        #113:#114     // substring:(I)Ljava/lang/String;
  #113 = Utf8               substring
  #114 = Utf8               (I)Ljava/lang/String;
  #115 = Methodref          #26.#116      // java/lang/String.trim:()Ljava/lang/String;
  #116 = NameAndType        #117:#118     // trim:()Ljava/lang/String;
  #117 = Utf8               trim
  #118 = Utf8               ()Ljava/lang/String;
  #119 = Methodref          #120.#121     // java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #120 = Class              #122          // java/util/Locale
  #121 = NameAndType        #123:#124     // forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
  #122 = Utf8               java/util/Locale
  #123 = Utf8               forLanguageTag
  #124 = Utf8               (Ljava/lang/String;)Ljava/util/Locale;
  #125 = Methodref          #14.#126      // ext/mods/gameserver/model/actor/Player.setLocale:(Ljava/util/Locale;)V
  #126 = NameAndType        #127:#128     // setLocale:(Ljava/util/Locale;)V
  #127 = Utf8               setLocale
  #128 = Utf8               (Ljava/util/Locale;)V
  #129 = Class              #130          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #130 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #131 = Methodref          #129.#132     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #132 = NameAndType        #5:#133       // "<init>":(I)V
  #133 = Utf8               (I)V
  #134 = Methodref          #14.#135      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #135 = NameAndType        #136:#137     // getLocale:()Ljava/util/Locale;
  #136 = Utf8               getLocale
  #137 = Utf8               ()Ljava/util/Locale;
  #138 = String             #139          // html/mods/menu/menu.htm
  #139 = Utf8               html/mods/menu/menu.htm
  #140 = Methodref          #129.#141     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #141 = NameAndType        #142:#143     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #142 = Utf8               setFile
  #143 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #144 = InvokeDynamic      #0:#145       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #145 = NameAndType        #146:#147     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #146 = Utf8               makeConcatWithConstants
  #147 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #148 = InvokeDynamic      #1:#145       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #149 = Fieldref           #8.#150       // ext/mods/Config.TIME_ZONE:Ljava/lang/String;
  #150 = NameAndType        #151:#152     // TIME_ZONE:Ljava/lang/String;
  #151 = Utf8               TIME_ZONE
  #152 = Utf8               Ljava/lang/String;
  #153 = Methodref          #154.#155     // java/util/TimeZone.getTimeZone:(Ljava/lang/String;)Ljava/util/TimeZone;
  #154 = Class              #156          // java/util/TimeZone
  #155 = NameAndType        #157:#158     // getTimeZone:(Ljava/lang/String;)Ljava/util/TimeZone;
  #156 = Utf8               java/util/TimeZone
  #157 = Utf8               getTimeZone
  #158 = Utf8               (Ljava/lang/String;)Ljava/util/TimeZone;
  #159 = Methodref          #160.#161     // java/util/Calendar.getInstance:(Ljava/util/TimeZone;)Ljava/util/Calendar;
  #160 = Class              #162          // java/util/Calendar
  #161 = NameAndType        #100:#163     // getInstance:(Ljava/util/TimeZone;)Ljava/util/Calendar;
  #162 = Utf8               java/util/Calendar
  #163 = Utf8               (Ljava/util/TimeZone;)Ljava/util/Calendar;
  #164 = Class              #165          // java/text/SimpleDateFormat
  #165 = Utf8               java/text/SimpleDateFormat
  #166 = Fieldref           #8.#167       // ext/mods/Config.DATE_FORMAT:Ljava/lang/String;
  #167 = NameAndType        #168:#152     // DATE_FORMAT:Ljava/lang/String;
  #168 = Utf8               DATE_FORMAT
  #169 = Methodref          #164.#170     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
  #170 = NameAndType        #5:#171       // "<init>":(Ljava/lang/String;Ljava/util/Locale;)V
  #171 = Utf8               (Ljava/lang/String;Ljava/util/Locale;)V
  #172 = Methodref          #164.#173     // java/text/SimpleDateFormat.setTimeZone:(Ljava/util/TimeZone;)V
  #173 = NameAndType        #174:#175     // setTimeZone:(Ljava/util/TimeZone;)V
  #174 = Utf8               setTimeZone
  #175 = Utf8               (Ljava/util/TimeZone;)V
  #176 = Methodref          #160.#177     // java/util/Calendar.getTime:()Ljava/util/Date;
  #177 = NameAndType        #178:#179     // getTime:()Ljava/util/Date;
  #178 = Utf8               getTime
  #179 = Utf8               ()Ljava/util/Date;
  #180 = Methodref          #164.#181     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #181 = NameAndType        #182:#183     // format:(Ljava/util/Date;)Ljava/lang/String;
  #182 = Utf8               format
  #183 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #184 = Methodref          #185.#186     // ext/mods/gameserver/GameServer.getInstance:()Lext/mods/gameserver/GameServer;
  #185 = Class              #187          // ext/mods/gameserver/GameServer
  #186 = NameAndType        #100:#188     // getInstance:()Lext/mods/gameserver/GameServer;
  #187 = Utf8               ext/mods/gameserver/GameServer
  #188 = Utf8               ()Lext/mods/gameserver/GameServer;
  #189 = Methodref          #185.#190     // ext/mods/gameserver/GameServer.getServerStartTime:()J
  #190 = NameAndType        #191:#192     // getServerStartTime:()J
  #191 = Utf8               getServerStartTime
  #192 = Utf8               ()J
  #193 = Methodref          #194.#195     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #194 = Class              #196          // java/lang/Long
  #195 = NameAndType        #197:#198     // valueOf:(J)Ljava/lang/Long;
  #196 = Utf8               java/lang/Long
  #197 = Utf8               valueOf
  #198 = Utf8               (J)Ljava/lang/Long;
  #199 = Methodref          #164.#200     // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #200 = NameAndType        #182:#201     // format:(Ljava/lang/Object;)Ljava/lang/String;
  #201 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #202 = String             #203          // %online%
  #203 = Utf8               %online%
  #204 = Methodref          #205.#206     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #205 = Class              #207          // ext/mods/gameserver/model/World
  #206 = NameAndType        #100:#208     // getInstance:()Lext/mods/gameserver/model/World;
  #207 = Utf8               ext/mods/gameserver/model/World
  #208 = Utf8               ()Lext/mods/gameserver/model/World;
  #209 = Methodref          #205.#210     // ext/mods/gameserver/model/World.getOnlinePlayerCount:()I
  #210 = NameAndType        #211:#110     // getOnlinePlayerCount:()I
  #211 = Utf8               getOnlinePlayerCount
  #212 = Fieldref           #8.#213       // ext/mods/Config.FAKE_ONLINE_AMOUNT:I
  #213 = NameAndType        #214:#215     // FAKE_ONLINE_AMOUNT:I
  #214 = Utf8               FAKE_ONLINE_AMOUNT
  #215 = Utf8               I
  #216 = Methodref          #129.#217     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #217 = NameAndType        #218:#219     // replace:(Ljava/lang/String;I)V
  #218 = Utf8               replace
  #219 = Utf8               (Ljava/lang/String;I)V
  #220 = String             #221          // %gainexp%
  #221 = Utf8               %gainexp%
  #222 = Methodref          #129.#223     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #223 = NameAndType        #218:#224     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #224 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #225 = String             #226          // %trade%
  #226 = Utf8               %trade%
  #227 = String             #228          // %autoloot%
  #228 = Utf8               %autoloot%
  #229 = String             #230          // %buffprotect%
  #230 = Utf8               %buffprotect%
  #231 = String             #232          // %button%
  #232 = Utf8               %button%
  #233 = InvokeDynamic      #2:#145       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #234 = String             #235          // %button1%
  #235 = Utf8               %button1%
  #236 = InvokeDynamic      #3:#145       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #237 = String             #238          // %button2%
  #238 = Utf8               %button2%
  #239 = InvokeDynamic      #4:#145       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #240 = String             #241          // %button3%
  #241 = Utf8               %button3%
  #242 = InvokeDynamic      #5:#145       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #243 = String             #244          // %serverTime%
  #244 = Utf8               %serverTime%
  #245 = String             #246          // %lastRestart%
  #246 = Utf8               %lastRestart%
  #247 = String             #248          // %trader%
  #248 = Utf8               %trader%
  #249 = Methodref          #205.#250     // ext/mods/gameserver/model/World.getTraderCount:()I
  #250 = NameAndType        #251:#110     // getTraderCount:()I
  #251 = Utf8               getTraderCount
  #252 = String             #253          // %maxOnline%
  #253 = Utf8               %maxOnline%
  #254 = Methodref          #205.#255     // ext/mods/gameserver/model/World.getMaxOnline:()I
  #255 = NameAndType        #256:#110     // getMaxOnline:()I
  #256 = Utf8               getMaxOnline
  #257 = Methodref          #14.#258      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #258 = NameAndType        #259:#260     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #259 = Utf8               sendPacket
  #260 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #261 = Fieldref           #32.#262      // ext/mods/gameserver/handler/voicedcommandhandlers/Menu.VOICED_COMMANDS:[Ljava/lang/String;
  #262 = NameAndType        #263:#264     // VOICED_COMMANDS:[Ljava/lang/String;
  #263 = Utf8               VOICED_COMMANDS
  #264 = Utf8               [Ljava/lang/String;
  #265 = Class              #266          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #266 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #267 = Utf8               Code
  #268 = Utf8               LineNumberTable
  #269 = Utf8               LocalVariableTable
  #270 = Utf8               this
  #271 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Menu;
  #272 = Utf8               useVoicedCommand
  #273 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #274 = Utf8               command
  #275 = Utf8               player
  #276 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #277 = Utf8               target
  #278 = Utf8               StackMapTable
  #279 = Utf8               htm
  #280 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #281 = Utf8               ACTIVATED
  #282 = Utf8               DEACTIVATED
  #283 = Utf8               timeZone
  #284 = Utf8               Ljava/util/TimeZone;
  #285 = Utf8               currentTime
  #286 = Utf8               Ljava/util/Calendar;
  #287 = Utf8               dateFormat
  #288 = Utf8               Ljava/text/SimpleDateFormat;
  #289 = Utf8               formattedTime
  #290 = Utf8               lastRestart
  #291 = Utf8               getVoicedCommandList
  #292 = Utf8               ()[Ljava/lang/String;
  #293 = Utf8               <clinit>
  #294 = Utf8               SourceFile
  #295 = Utf8               Menu.java
  #296 = Utf8               BootstrapMethods
  #297 = String             #298          // <font color=00FF00>\u0001</font>
  #298 = Utf8               <font color=00FF00>\u0001</font>
  #299 = String             #300          // <font color=FF0000>\u0001</font>
  #300 = Utf8               <font color=FF0000>\u0001</font>
  #301 = String             #302          // value=\u0001 action=\"bypass voiced_exp\"
  #302 = Utf8               value=\u0001 action=\"bypass voiced_exp\"
  #303 = String             #304          // value=\u0001 action=\"bypass voiced_trade\"
  #304 = Utf8               value=\u0001 action=\"bypass voiced_trade\"
  #305 = String             #306          // value=\u0001 action=\"bypass voiced_autoloot\"
  #306 = Utf8               value=\u0001 action=\"bypass voiced_autoloot\"
  #307 = String             #308          // value=\u0001 action=\"bypass voiced_buffprotect\"
  #308 = Utf8               value=\u0001 action=\"bypass voiced_buffprotect\"
  #309 = MethodHandle       6:#310        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #310 = Methodref          #311.#312     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #311 = Class              #313          // java/lang/invoke/StringConcatFactory
  #312 = NameAndType        #146:#314     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #313 = Utf8               java/lang/invoke/StringConcatFactory
  #314 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #315 = Utf8               InnerClasses
  #316 = Class              #317          // java/lang/invoke/MethodHandles$Lookup
  #317 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #318 = Class              #319          // java/lang/invoke/MethodHandles
  #319 = Utf8               java/lang/invoke/MethodHandles
  #320 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.Menu();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Menu;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.ENABLE_MENU:Z
         3: ifne          23
         6: aload_2
         7: aload_2
         8: sipush        10200
        11: iconst_0
        12: anewarray     #2                  // class java/lang/Object
        15: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        18: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        21: iconst_0
        22: ireturn
        23: aload_1
        24: ldc           #23                 // String menu
        26: invokevirtual #25                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        29: ifeq          40
        32: aload_0
        33: aload_2
        34: invokevirtual #31                 // Method showHtm:(Lext/mods/gameserver/model/actor/Player;)V
        37: goto          387
        40: aload_1
        41: ldc           #37                 // String exp
        43: invokevirtual #39                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        46: ifeq          96
        49: aload_2
        50: aload_2
        51: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getStopExp:()Z
        54: ifne          61
        57: iconst_1
        58: goto          62
        61: iconst_0
        62: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.setStopExp:(Z)V
        65: aload_2
        66: aload_2
        67: aload_2
        68: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getStopExp:()Z
        71: ifeq          80
        74: sipush        10000
        77: goto          83
        80: sipush        10001
        83: iconst_0
        84: anewarray     #2                  // class java/lang/Object
        87: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        90: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        93: goto          387
        96: aload_1
        97: ldc           #51                 // String trade
        99: invokevirtual #39                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       102: ifeq          152
       105: aload_2
       106: aload_2
       107: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getTradeRefusal:()Z
       110: ifne          117
       113: iconst_1
       114: goto          118
       117: iconst_0
       118: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.setTradeRefusal:(Z)V
       121: aload_2
       122: aload_2
       123: aload_2
       124: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.getTradeRefusal:()Z
       127: ifeq          136
       130: sipush        10002
       133: goto          139
       136: sipush        10003
       139: iconst_0
       140: anewarray     #2                  // class java/lang/Object
       143: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       146: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       149: goto          387
       152: aload_1
       153: ldc           #59                 // String autoloot
       155: invokevirtual #39                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       158: ifeq          208
       161: aload_2
       162: aload_2
       163: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getAutoLoot:()Z
       166: ifne          173
       169: iconst_1
       170: goto          174
       173: iconst_0
       174: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.setAutoLoot:(Z)V
       177: aload_2
       178: aload_2
       179: aload_2
       180: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.getAutoLoot:()Z
       183: ifeq          192
       186: sipush        10004
       189: goto          195
       192: sipush        10005
       195: iconst_0
       196: anewarray     #2                  // class java/lang/Object
       199: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       202: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       205: goto          387
       208: aload_1
       209: ldc           #67                 // String buffprotect
       211: invokevirtual #39                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       214: ifeq          264
       217: aload_2
       218: aload_2
       219: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isBuffProtected:()Z
       222: ifne          229
       225: iconst_1
       226: goto          230
       229: iconst_0
       230: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.setBuffProtected:(Z)V
       233: aload_2
       234: aload_2
       235: aload_2
       236: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isBuffProtected:()Z
       239: ifeq          248
       242: sipush        10186
       245: goto          251
       248: sipush        10187
       251: iconst_0
       252: anewarray     #2                  // class java/lang/Object
       255: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       258: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       261: goto          387
       264: aload_1
       265: ldc           #75                 // String offline
       267: invokevirtual #39                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       270: ifeq          355
       273: aload_2
       274: invokestatic  #77                 // Method ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
       277: ifne          297
       280: aload_2
       281: aload_2
       282: sipush        10006
       285: iconst_0
       286: anewarray     #2                  // class java/lang/Object
       289: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       292: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       295: iconst_0
       296: ireturn
       297: aload_2
       298: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       301: ifeq          310
       304: getstatic     #86                 // Field ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
       307: ifne          323
       310: aload_2
       311: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.isCrafting:()Z
       314: ifeq          345
       317: getstatic     #92                 // Field ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
       320: ifeq          345
       323: aload_2
       324: aload_2
       325: sipush        10007
       328: iconst_0
       329: anewarray     #2                  // class java/lang/Object
       332: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       335: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       338: aload_2
       339: iconst_0
       340: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       343: iconst_1
       344: ireturn
       345: invokestatic  #98                 // Method ext/mods/gameserver/data/sql/OfflineTradersTable.getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
       348: aload_2
       349: invokevirtual #102                // Method ext/mods/gameserver/data/sql/OfflineTradersTable.saveOfflineTraders:(Lext/mods/gameserver/model/actor/Player;)V
       352: goto          387
       355: aload_1
       356: ldc           #105                // String lang
       358: invokevirtual #39                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       361: ifeq          387
       364: aload_1
       365: invokevirtual #107                // Method java/lang/String.length:()I
       368: iconst_5
       369: if_icmple     387
       372: aload_2
       373: aload_1
       374: iconst_5
       375: invokevirtual #111                // Method java/lang/String.substring:(I)Ljava/lang/String;
       378: invokevirtual #115                // Method java/lang/String.trim:()Ljava/lang/String;
       381: invokestatic  #119                // Method java/util/Locale.forLanguageTag:(Ljava/lang/String;)Ljava/util/Locale;
       384: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Player.setLocale:(Ljava/util/Locale;)V
       387: aload_0
       388: aload_2
       389: invokevirtual #31                 // Method showHtm:(Lext/mods/gameserver/model/actor/Player;)V
       392: iconst_1
       393: ireturn
      LineNumberTable:
        line 49: 0
        line 51: 6
        line 52: 21
        line 55: 23
        line 56: 32
        line 57: 40
        line 59: 49
        line 60: 65
        line 62: 96
        line 64: 105
        line 65: 121
        line 67: 152
        line 69: 161
        line 70: 177
        line 72: 208
        line 74: 217
        line 75: 233
        line 77: 264
        line 79: 273
        line 81: 280
        line 82: 295
        line 85: 297
        line 87: 323
        line 88: 338
        line 89: 343
        line 92: 345
        line 94: 355
        line 95: 372
        line 97: 387
        line 98: 392
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     394     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Menu;
            0     394     1 command   Ljava/lang/String;
            0     394     2 player   Lext/mods/gameserver/model/actor/Player;
            0     394     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 28
        frame_type = 23 /* same */
        frame_type = 16 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 12 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 12 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 12 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Menu, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 12 /* same */
        frame_type = 32 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 21 /* same */
        frame_type = 9 /* same */
        frame_type = 31 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #261                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 137: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Menu;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        7
         2: anewarray     #26                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #23                 // String menu
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #37                 // String exp
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #51                 // String trade
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #59                 // String autoloot
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #75                 // String offline
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #67                 // String buffprotect
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #105                // String lang
        40: aastore
        41: putstatic     #261                // Field VOICED_COMMANDS:[Ljava/lang/String;
        44: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "Menu.java"
BootstrapMethods:
  0: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #297 <font color=00FF00>\u0001</font>
  1: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #299 <font color=FF0000>\u0001</font>
  2: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #301 value=\u0001 action=\"bypass voiced_exp\"
  3: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #303 value=\u0001 action=\"bypass voiced_trade\"
  4: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #305 value=\u0001 action=\"bypass voiced_autoloot\"
  5: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #307 value=\u0001 action=\"bypass voiced_buffprotect\"
InnerClasses:
  public static final #320= #316 of #318; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
