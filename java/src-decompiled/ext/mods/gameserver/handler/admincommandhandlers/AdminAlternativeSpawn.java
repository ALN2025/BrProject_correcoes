// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminAlternativeSpawn
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminAlternativeSpawn.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.class
  Last modified 9 de jul de 2026; size 13768 bytes
  MD5 checksum f1ec1c67e2c5b7fe71d0448f6ec29673
  Compiled from "AdminAlternativeSpawn.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminAlternativeSpawn implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = String             #19           // admin_maker
   #19 = Utf8               admin_maker
   #20 = Methodref          #21.#22       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // equals:(Ljava/lang/Object;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               equals
   #25 = Utf8               (Ljava/lang/Object;)Z
   #26 = Methodref          #7.#27        // java/util/StringTokenizer.hasMoreTokens:()Z
   #27 = NameAndType        #28:#29       // hasMoreTokens:()Z
   #28 = Utf8               hasMoreTokens
   #29 = Utf8               ()Z
   #30 = Methodref          #31.#32       // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
   #31 = Class              #33           // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn
   #32 = NameAndType        #34:#35       // showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
   #33 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn
   #34 = Utf8               showNpcMakersInfo
   #35 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #36 = Methodref          #7.#37        // java/util/StringTokenizer.countTokens:()I
   #37 = NameAndType        #38:#39       // countTokens:()I
   #38 = Utf8               countTokens
   #39 = Utf8               ()I
   #40 = Methodref          #41.#42       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #41 = Class              #43           // ext/mods/commons/lang/StringUtil
   #42 = NameAndType        #44:#45       // isDigit:(Ljava/lang/String;)Z
   #43 = Utf8               ext/mods/commons/lang/StringUtil
   #44 = Utf8               isDigit
   #45 = Utf8               (Ljava/lang/String;)Z
   #46 = Methodref          #47.#48       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #47 = Class              #49           // java/lang/Integer
   #48 = NameAndType        #50:#51       // parseInt:(Ljava/lang/String;)I
   #49 = Utf8               java/lang/Integer
   #50 = Utf8               parseInt
   #51 = Utf8               (Ljava/lang/String;)I
   #52 = Methodref          #53.#54       // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #53 = Class              #55           // ext/mods/gameserver/data/manager/SpawnManager
   #54 = NameAndType        #56:#57       // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #55 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #56 = Utf8               getInstance
   #57 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #58 = Methodref          #53.#59       // ext/mods/gameserver/data/manager/SpawnManager.getNpcMaker:(Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
   #59 = NameAndType        #60:#61       // getNpcMaker:(Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
   #60 = Utf8               getNpcMaker
   #61 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
   #62 = InvokeDynamic      #0:#63        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #63 = NameAndType        #64:#65       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #64 = Utf8               makeConcatWithConstants
   #65 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #67 = Class              #69           // ext/mods/gameserver/model/actor/Player
   #68 = NameAndType        #70:#71       // sendMessage:(Ljava/lang/String;)V
   #69 = Utf8               ext/mods/gameserver/model/actor/Player
   #70 = Utf8               sendMessage
   #71 = Utf8               (Ljava/lang/String;)V
   #72 = Methodref          #31.#73       // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
   #73 = NameAndType        #74:#75       // showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
   #74 = Utf8               showNpcMakerInfo
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
   #76 = Methodref          #21.#77       // java/lang/String.hashCode:()I
   #77 = NameAndType        #78:#39       // hashCode:()I
   #78 = Utf8               hashCode
   #79 = String             #80           // delete
   #80 = Utf8               delete
   #81 = String             #82           // respawn
   #82 = Utf8               respawn
   #83 = String             #84           // scripts
   #84 = Utf8               scripts
   #85 = String             #86           // spawn
   #86 = Utf8               spawn
   #87 = String             #88           // switch
   #88 = Utf8               switch
   #89 = Methodref          #90.#91       // ext/mods/gameserver/model/spawn/NpcMaker.deleteAll:()I
   #90 = Class              #92           // ext/mods/gameserver/model/spawn/NpcMaker
   #91 = NameAndType        #93:#39       // deleteAll:()I
   #92 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
   #93 = Utf8               deleteAll
   #94 = Methodref          #90.#95       // ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
   #95 = NameAndType        #96:#97       // getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
   #96 = Utf8               getMaker
   #97 = Utf8               ()Lext/mods/gameserver/scripting/SpawnMaker;
   #98 = String             #99           // 1000
   #99 = Utf8               1000
  #100 = Methodref          #101.#102     // ext/mods/gameserver/scripting/SpawnMaker.onMakerScriptEvent:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;II)V
  #101 = Class              #103          // ext/mods/gameserver/scripting/SpawnMaker
  #102 = NameAndType        #104:#105     // onMakerScriptEvent:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;II)V
  #103 = Utf8               ext/mods/gameserver/scripting/SpawnMaker
  #104 = Utf8               onMakerScriptEvent
  #105 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;II)V
  #106 = String             #107          // 1001
  #107 = Utf8               1001
  #108 = Methodref          #31.#109      // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.showMakerScripts:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #109 = NameAndType        #110:#75      // showMakerScripts:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
  #110 = Utf8               showMakerScripts
  #111 = String             #112          // Usage: //maker [delete|respawn|scripts|spawn|switch <name>]
  #112 = Utf8               Usage: //maker [delete|respawn|scripts|spawn|switch <name>]
  #113 = String             #114          // admin_terr
  #114 = Utf8               admin_terr
  #115 = String             #116          // visual_clear
  #116 = Utf8               visual_clear
  #117 = String             #118          // TERR
  #118 = Utf8               TERR
  #119 = Methodref          #67.#120      // ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #120 = NameAndType        #121:#122     // getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #121 = Utf8               getDebugPacket
  #122 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
  #124 = Class              #126          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #125 = NameAndType        #127:#6       // reset:()V
  #126 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #127 = Utf8               reset
  #128 = Methodref          #124.#129     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #129 = NameAndType        #130:#131     // sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #130 = Utf8               sendTo
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #132 = Methodref          #53.#133      // ext/mods/gameserver/data/manager/SpawnManager.getTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
  #133 = NameAndType        #134:#135     // getTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
  #134 = Utf8               getTerritory
  #135 = Utf8               (Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
  #136 = InvokeDynamic      #1:#63        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #137 = String             #138          // goto
  #138 = Utf8               goto
  #139 = String             #140          // test
  #140 = Utf8               test
  #141 = String             #142          // visual
  #142 = Utf8               visual
  #143 = Methodref          #144.#145     // ext/mods/commons/geometry/Territory.getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #144 = Class              #146          // ext/mods/commons/geometry/Territory
  #145 = NameAndType        #147:#148     // getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #146 = Utf8               ext/mods/commons/geometry/Territory
  #147 = Utf8               getRandomGeoLocation
  #148 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #149 = Methodref          #67.#150      // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #150 = NameAndType        #151:#152     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #151 = Utf8               teleToLocation
  #152 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #153 = Fieldref           #154.#155     // java/awt/Color.GREEN:Ljava/awt/Color;
  #154 = Class              #156          // java/awt/Color
  #155 = NameAndType        #157:#158     // GREEN:Ljava/awt/Color;
  #156 = Utf8               java/awt/Color
  #157 = Utf8               GREEN
  #158 = Utf8               Ljava/awt/Color;
  #159 = Methodref          #124.#160     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #160 = NameAndType        #161:#162     // addPoint:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #161 = Utf8               addPoint
  #162 = Utf8               (Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #163 = Methodref          #144.#164     // ext/mods/commons/geometry/Territory.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #164 = NameAndType        #165:#166     // visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #165 = Utf8               visualize
  #166 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #167 = String             #168          // Usage: //terr goto|visual|visual_clear name
  #168 = Utf8               Usage: //terr goto|visual|visual_clear name
  #169 = String             #170          // admin_spawn_event
  #170 = Utf8               admin_spawn_event
  #171 = String             #172          // Usage: //spawn_event <event_name>
  #172 = Utf8               Usage: //spawn_event <event_name>
  #173 = Methodref          #53.#174      // ext/mods/gameserver/data/manager/SpawnManager.spawnEventNpcs:(Ljava/lang/String;Z)J
  #174 = NameAndType        #175:#176     // spawnEventNpcs:(Ljava/lang/String;Z)J
  #175 = Utf8               spawnEventNpcs
  #176 = Utf8               (Ljava/lang/String;Z)J
  #177 = InvokeDynamic      #2:#178       // #2:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
  #178 = NameAndType        #64:#179      // makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
  #179 = Utf8               (JLjava/lang/String;)Ljava/lang/String;
  #180 = String             #181          // admin_despawn_event
  #181 = Utf8               admin_despawn_event
  #182 = String             #183          // Usage: //despawn_event <event_name>
  #183 = Utf8               Usage: //despawn_event <event_name>
  #184 = Methodref          #53.#185      // ext/mods/gameserver/data/manager/SpawnManager.despawnEventNpcs:(Ljava/lang/String;Z)J
  #185 = NameAndType        #186:#176     // despawnEventNpcs:(Ljava/lang/String;Z)J
  #186 = Utf8               despawnEventNpcs
  #187 = InvokeDynamic      #3:#178       // #3:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
  #188 = Fieldref           #31.#189      // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.ADMIN_COMMANDS:[Ljava/lang/String;
  #189 = NameAndType        #190:#191     // ADMIN_COMMANDS:[Ljava/lang/String;
  #190 = Utf8               ADMIN_COMMANDS
  #191 = Utf8               [Ljava/lang/String;
  #192 = Class              #193          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #193 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #194 = Methodref          #192.#195     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #195 = NameAndType        #5:#196       // "<init>":(I)V
  #196 = Utf8               (I)V
  #197 = Methodref          #67.#198      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #198 = NameAndType        #199:#200     // getLocale:()Ljava/util/Locale;
  #199 = Utf8               getLocale
  #200 = Utf8               ()Ljava/util/Locale;
  #201 = String             #202          // html/admin/spawnlist/maker_check.htm
  #202 = Utf8               html/admin/spawnlist/maker_check.htm
  #203 = Methodref          #192.#204     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #204 = NameAndType        #205:#206     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #205 = Utf8               setFile
  #206 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #207 = Methodref          #67.#208      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #208 = NameAndType        #209:#148     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #209 = Utf8               getPosition
  #210 = Methodref          #53.#211      // ext/mods/gameserver/data/manager/SpawnManager.getNpcMakers:(Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #211 = NameAndType        #212:#213     // getNpcMakers:(Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #212 = Utf8               getNpcMakers
  #213 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #214 = Class              #215          // ext/mods/commons/data/Pagination
  #215 = Utf8               ext/mods/commons/data/Pagination
  #216 = InterfaceMethodref #217.#218     // java/util/List.stream:()Ljava/util/stream/Stream;
  #217 = Class              #219          // java/util/List
  #218 = NameAndType        #220:#221     // stream:()Ljava/util/stream/Stream;
  #219 = Utf8               java/util/List
  #220 = Utf8               stream
  #221 = Utf8               ()Ljava/util/stream/Stream;
  #222 = InvokeDynamic      #4:#223       // #4:apply:()Ljava/util/function/Function;
  #223 = NameAndType        #224:#225     // apply:()Ljava/util/function/Function;
  #224 = Utf8               apply
  #225 = Utf8               ()Ljava/util/function/Function;
  #226 = InterfaceMethodref #227.#228     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #227 = Class              #229          // java/util/stream/Stream
  #228 = NameAndType        #230:#231     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #229 = Utf8               java/util/stream/Stream
  #230 = Utf8               map
  #231 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #232 = InterfaceMethodref #227.#233     // java/util/stream/Stream.distinct:()Ljava/util/stream/Stream;
  #233 = NameAndType        #234:#221     // distinct:()Ljava/util/stream/Stream;
  #234 = Utf8               distinct
  #235 = Class              #236          // ext/mods/gameserver/handler/IAdminCommandHandler
  #236 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #237 = Methodref          #214.#238     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #238 = NameAndType        #5:#239       // "<init>":(Ljava/util/stream/Stream;II)V
  #239 = Utf8               (Ljava/util/stream/Stream;II)V
  #240 = Methodref          #214.#241     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #241 = NameAndType        #242:#243     // iterator:()Ljava/util/Iterator;
  #242 = Utf8               iterator
  #243 = Utf8               ()Ljava/util/Iterator;
  #244 = InterfaceMethodref #245.#246     // java/util/Iterator.hasNext:()Z
  #245 = Class              #247          // java/util/Iterator
  #246 = NameAndType        #248:#29      // hasNext:()Z
  #247 = Utf8               java/util/Iterator
  #248 = Utf8               hasNext
  #249 = InterfaceMethodref #245.#250     // java/util/Iterator.next:()Ljava/lang/Object;
  #250 = NameAndType        #251:#252     // next:()Ljava/lang/Object;
  #251 = Utf8               next
  #252 = Utf8               ()Ljava/lang/Object;
  #253 = String             #254          // <table><tr><td width=280><font color=LEVEL>
  #254 = Utf8               <table><tr><td width=280><font color=LEVEL>
  #255 = Methodref          #144.#256     // ext/mods/commons/geometry/Territory.getName:()Ljava/lang/String;
  #256 = NameAndType        #257:#17      // getName:()Ljava/lang/String;
  #257 = Utf8               getName
  #258 = String             #259          // </font></td></tr></table>
  #259 = Utf8               </font></td></tr></table>
  #260 = Methodref          #214.#261     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #261 = NameAndType        #262:#263     // append:([Ljava/lang/Object;)V
  #262 = Utf8               append
  #263 = Utf8               ([Ljava/lang/Object;)V
  #264 = String             #265          // <table><tr><td width=170>min=
  #265 = Utf8               <table><tr><td width=170>min=
  #266 = Methodref          #144.#267     // ext/mods/commons/geometry/Territory.getMinZ:()I
  #267 = NameAndType        #268:#39      // getMinZ:()I
  #268 = Utf8               getMinZ
  #269 = Methodref          #47.#270      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #270 = NameAndType        #271:#272     // valueOf:(I)Ljava/lang/Integer;
  #271 = Utf8               valueOf
  #272 = Utf8               (I)Ljava/lang/Integer;
  #273 = String             #274          // , max=
  #274 = Utf8               , max=
  #275 = Methodref          #144.#276     // ext/mods/commons/geometry/Territory.getMaxZ:()I
  #276 = NameAndType        #277:#39      // getMaxZ:()I
  #277 = Utf8               getMaxZ
  #278 = String             #279          // </td><td width=110><a action=\"bypass -h admin_terr goto
  #279 = Utf8               </td><td width=110><a action=\"bypass -h admin_terr goto
  #280 = String             #281          // \">Go To</a> | <a action=\"bypass -h admin_terr test
  #281 = Utf8               \">Go To</a> | <a action=\"bypass -h admin_terr test
  #282 = String             #283          // \">Test</a> | <a action=\"bypass -h admin_terr visual
  #283 = Utf8               \">Test</a> | <a action=\"bypass -h admin_terr visual
  #284 = String             #285          // \">Visualize</a></td></tr></table>
  #285 = Utf8               \">Visualize</a></td></tr></table>
  #286 = InvokeDynamic      #5:#287       // #5:test:(Lext/mods/commons/geometry/Territory;)Ljava/util/function/Predicate;
  #287 = NameAndType        #140:#288     // test:(Lext/mods/commons/geometry/Territory;)Ljava/util/function/Predicate;
  #288 = Utf8               (Lext/mods/commons/geometry/Territory;)Ljava/util/function/Predicate;
  #289 = InterfaceMethodref #227.#290     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #290 = NameAndType        #291:#292     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #291 = Utf8               filter
  #292 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #293 = InterfaceMethodref #227.#294     // java/util/stream/Stream.toList:()Ljava/util/List;
  #294 = NameAndType        #295:#296     // toList:()Ljava/util/List;
  #295 = Utf8               toList
  #296 = Utf8               ()Ljava/util/List;
  #297 = InterfaceMethodref #217.#241     // java/util/List.iterator:()Ljava/util/Iterator;
  #298 = String             #299          // <table width=280 bgcolor=000000><tr>
  #299 = Utf8               <table width=280 bgcolor=000000><tr>
  #300 = String             #301          // <table width=280><tr>
  #301 = Utf8               <table width=280><tr>
  #302 = String             #303          // <td width=10></td><td width=270><a action=\"bypass -h admin_maker
  #303 = Utf8               <td width=10></td><td width=270><a action=\"bypass -h admin_maker
  #304 = Methodref          #90.#256      // ext/mods/gameserver/model/spawn/NpcMaker.getName:()Ljava/lang/String;
  #305 = String             #306          // \">
  #306 = Utf8               \">
  #307 = String             #308          // </a></td>
  #308 = Utf8               </a></td>
  #309 = String             #310          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #310 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #311 = String             #312          // bypass admin_maker %page%
  #312 = Utf8               bypass admin_maker %page%
  #313 = Methodref          #214.#314     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #314 = NameAndType        #315:#71      // generatePages:(Ljava/lang/String;)V
  #315 = Utf8               generatePages
  #316 = String             #317          // %TERRITORIESLIST%
  #317 = Utf8               %TERRITORIESLIST%
  #318 = Methodref          #214.#319     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #319 = NameAndType        #320:#17      // getContent:()Ljava/lang/String;
  #320 = Utf8               getContent
  #321 = Methodref          #192.#322     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #322 = NameAndType        #323:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #323 = Utf8               replace
  #324 = Methodref          #67.#325      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #325 = NameAndType        #326:#327     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #326 = Utf8               sendPacket
  #327 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #328 = Methodref          #90.#329      // ext/mods/gameserver/model/spawn/NpcMaker.getSpawns:()Ljava/util/List;
  #329 = NameAndType        #330:#296     // getSpawns:()Ljava/util/List;
  #330 = Utf8               getSpawns
  #331 = InvokeDynamic      #6:#332       // #6:applyAsInt:()Ljava/util/function/ToIntFunction;
  #332 = NameAndType        #333:#334     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #333 = Utf8               applyAsInt
  #334 = Utf8               ()Ljava/util/function/ToIntFunction;
  #335 = InterfaceMethodref #227.#336     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #336 = NameAndType        #337:#338     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #337 = Utf8               mapToInt
  #338 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #339 = InterfaceMethodref #340.#341     // java/util/stream/IntStream.sum:()I
  #340 = Class              #342          // java/util/stream/IntStream
  #341 = NameAndType        #343:#39      // sum:()I
  #342 = Utf8               java/util/stream/IntStream
  #343 = Utf8               sum
  #344 = Methodref          #2.#345       // java/lang/Object.getClass:()Ljava/lang/Class;
  #345 = NameAndType        #346:#347     // getClass:()Ljava/lang/Class;
  #346 = Utf8               getClass
  #347 = Utf8               ()Ljava/lang/Class;
  #348 = Class              #349          // ext/mods/gameserver/scripting/script/maker/DefaultMaker
  #349 = Utf8               ext/mods/gameserver/scripting/script/maker/DefaultMaker
  #350 = String             #351          // html/admin/spawnlist/maker_info.htm
  #351 = Utf8               html/admin/spawnlist/maker_info.htm
  #352 = String             #353          // html/admin/spawnlist/maker_info_alt.htm
  #353 = Utf8               html/admin/spawnlist/maker_info_alt.htm
  #354 = String             #355          // %TERRNAME%
  #355 = Utf8               %TERRNAME%
  #356 = Methodref          #90.#357      // ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
  #357 = NameAndType        #134:#358     // getTerritory:()Lext/mods/commons/geometry/Territory;
  #358 = Utf8               ()Lext/mods/commons/geometry/Territory;
  #359 = String             #360          // %BANTERRNAME%
  #360 = Utf8               %BANTERRNAME%
  #361 = Methodref          #90.#362      // ext/mods/gameserver/model/spawn/NpcMaker.getBannedTerritory:()Lext/mods/commons/geometry/Territory;
  #362 = NameAndType        #363:#358     // getBannedTerritory:()Lext/mods/commons/geometry/Territory;
  #363 = Utf8               getBannedTerritory
  #364 = String             #365          //
  #365 = Utf8
  #366 = String             #367          // %MAKERNAME%
  #367 = Utf8               %MAKERNAME%
  #368 = String             #369          // %MAKERSPAWN%
  #369 = Utf8               %MAKERSPAWN%
  #370 = Methodref          #101.#371     // ext/mods/gameserver/scripting/SpawnMaker.getMakerName:()Ljava/lang/String;
  #371 = NameAndType        #372:#17      // getMakerName:()Ljava/lang/String;
  #372 = Utf8               getMakerName
  #373 = String             #374          // %MAKEREVENT%
  #374 = Utf8               %MAKEREVENT%
  #375 = Methodref          #90.#376      // ext/mods/gameserver/model/spawn/NpcMaker.getEvent:()Ljava/lang/String;
  #376 = NameAndType        #377:#17      // getEvent:()Ljava/lang/String;
  #377 = Utf8               getEvent
  #378 = String             #379          // %MAKERSTART%
  #379 = Utf8               %MAKERSTART%
  #380 = Methodref          #90.#381      // ext/mods/gameserver/model/spawn/NpcMaker.isOnStart:()Z
  #381 = NameAndType        #382:#29      // isOnStart:()Z
  #382 = Utf8               isOnStart
  #383 = InvokeDynamic      #7:#384       // #7:makeConcatWithConstants:(Z)Ljava/lang/String;
  #384 = NameAndType        #64:#385      // makeConcatWithConstants:(Z)Ljava/lang/String;
  #385 = Utf8               (Z)Ljava/lang/String;
  #386 = String             #387          // %MAKERRESPAWN%
  #387 = Utf8               %MAKERRESPAWN%
  #388 = String             #389          // %MAKERCNTA%
  #389 = Utf8               %MAKERCNTA%
  #390 = Methodref          #90.#391      // ext/mods/gameserver/model/spawn/NpcMaker.getSpawnedCount:()I
  #391 = NameAndType        #392:#39      // getSpawnedCount:()I
  #392 = Utf8               getSpawnedCount
  #393 = Methodref          #192.#394     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #394 = NameAndType        #323:#395     // replace:(Ljava/lang/String;I)V
  #395 = Utf8               (Ljava/lang/String;I)V
  #396 = String             #397          // %MAKERCNTD%
  #397 = Utf8               %MAKERCNTD%
  #398 = String             #399          // %MAKERCNTT%
  #399 = Utf8               %MAKERCNTT%
  #400 = Methodref          #90.#401      // ext/mods/gameserver/model/spawn/NpcMaker.getMaximumNpc:()I
  #401 = NameAndType        #402:#39      // getMaximumNpc:()I
  #402 = Utf8               getMaximumNpc
  #403 = InterfaceMethodref #217.#404     // java/util/List.isEmpty:()Z
  #404 = NameAndType        #405:#29      // isEmpty:()Z
  #405 = Utf8               isEmpty
  #406 = String             #407          // %NPCSLIST%
  #407 = Utf8               %NPCSLIST%
  #408 = String             #409          // <br><br><center>No NPCs at this NPC maker.</center>
  #409 = Utf8               <br><br><center>No NPCs at this NPC maker.</center>
  #410 = Class              #411          // java/lang/StringBuilder
  #411 = Utf8               java/lang/StringBuilder
  #412 = String             #413          // <table><tr><td width=40><font color=\"LEVEL\">ID:</font></td><td width=100><font color=\"LEVEL\">Name:</font></td><td width=50><font color=\"LEVEL\">NPCs:</font></td><td width=85><font color=\"LEVEL\">Resp / Rnd:</font></td></tr>
  #413 = Utf8               <table><tr><td width=40><font color=\"LEVEL\">ID:</font></td><td width=100><font color=\"LEVEL\">Name:</font></td><td width=50><font color=\"LEVEL\">NPCs:</font></td><td width=85><font color=\"LEVEL\">Resp / Rnd:</font></td></tr>
  #414 = Methodref          #410.#415     // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #415 = NameAndType        #5:#71        // "<init>":(Ljava/lang/String;)V
  #416 = Class              #417          // ext/mods/gameserver/model/spawn/MultiSpawn
  #417 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
  #418 = String             #419          // <tr><td>
  #419 = Utf8               <tr><td>
  #420 = Methodref          #416.#421     // ext/mods/gameserver/model/spawn/MultiSpawn.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #421 = NameAndType        #422:#423     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #422 = Utf8               getTemplate
  #423 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #424 = Methodref          #425.#426     // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #425 = Class              #427          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #426 = NameAndType        #428:#39      // getNpcId:()I
  #427 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #428 = Utf8               getNpcId
  #429 = String             #430          // </td><td>
  #430 = Utf8               </td><td>
  #431 = Methodref          #425.#256     // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #432 = Methodref          #416.#391     // ext/mods/gameserver/model/spawn/MultiSpawn.getSpawnedCount:()I
  #433 = Methodref          #416.#434     // ext/mods/gameserver/model/spawn/MultiSpawn.getRespawningNpcCount:()I
  #434 = NameAndType        #435:#39      // getRespawningNpcCount:()I
  #435 = Utf8               getRespawningNpcCount
  #436 = String             #437          //  /
  #437 = Utf8                /
  #438 = Methodref          #416.#439     // ext/mods/gameserver/model/spawn/MultiSpawn.getTotal:()I
  #439 = NameAndType        #440:#39      // getTotal:()I
  #440 = Utf8               getTotal
  #441 = Methodref          #416.#442     // ext/mods/gameserver/model/spawn/MultiSpawn.getRespawnDelay:()I
  #442 = NameAndType        #443:#39      // getRespawnDelay:()I
  #443 = Utf8               getRespawnDelay
  #444 = Methodref          #41.#445      // ext/mods/commons/lang/StringUtil.getTimeStamp:(I)Ljava/lang/String;
  #445 = NameAndType        #446:#447     // getTimeStamp:(I)Ljava/lang/String;
  #446 = Utf8               getTimeStamp
  #447 = Utf8               (I)Ljava/lang/String;
  #448 = Methodref          #416.#449     // ext/mods/gameserver/model/spawn/MultiSpawn.getRespawnRandom:()I
  #449 = NameAndType        #450:#39      // getRespawnRandom:()I
  #450 = Utf8               getRespawnRandom
  #451 = String             #452          // </td></tr>
  #452 = Utf8               </td></tr>
  #453 = Methodref          #41.#454      // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #454 = NameAndType        #262:#455     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #455 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #456 = String             #457          // </table>
  #457 = Utf8               </table>
  #458 = Methodref          #410.#459     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #459 = NameAndType        #262:#460     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #460 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #461 = Methodref          #410.#462     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #462 = NameAndType        #463:#17      // toString:()Ljava/lang/String;
  #463 = Utf8               toString
  #464 = String             #465          // html/admin/spawnlist/maker_scripts.htm
  #465 = Utf8               html/admin/spawnlist/maker_scripts.htm
  #466 = Methodref          #90.#467      // ext/mods/gameserver/model/spawn/NpcMaker.getQuestEvents:()Ljava/util/List;
  #467 = NameAndType        #468:#296     // getQuestEvents:()Ljava/util/List;
  #468 = Utf8               getQuestEvents
  #469 = String             #470          // %SCRIPTS%
  #470 = Utf8               %SCRIPTS%
  #471 = String             #472          // <br><br><center>This NPC maker isn\'t affected by scripts.</center>
  #472 = Utf8               <br><br><center>This NPC maker isn\'t affected by scripts.</center>
  #473 = String             #474          // <br><font color=\"LEVEL\">ON_MAKER_NPCS_KILLED</font><br1>
  #474 = Utf8               <br><font color=\"LEVEL\">ON_MAKER_NPCS_KILLED</font><br1>
  #475 = Class              #476          // ext/mods/gameserver/scripting/Quest
  #476 = Utf8               ext/mods/gameserver/scripting/Quest
  #477 = Methodref          #475.#256     // ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
  #478 = String             #479          // <br1>
  #479 = Utf8               <br1>
  #480 = Utf8               Code
  #481 = Utf8               LineNumberTable
  #482 = Utf8               LocalVariableTable
  #483 = Utf8               this
  #484 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn;
  #485 = Utf8               useAdminCommand
  #486 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #487 = Utf8               maker
  #488 = Utf8               Lext/mods/gameserver/model/spawn/NpcMaker;
  #489 = Utf8               name
  #490 = Utf8               Ljava/lang/String;
  #491 = Utf8               paramCount
  #492 = Utf8               I
  #493 = Utf8               debug
  #494 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
  #495 = Utf8               i
  #496 = Utf8               territory
  #497 = Utf8               Lext/mods/commons/geometry/Territory;
  #498 = Utf8               event
  #499 = Utf8               total
  #500 = Utf8               J
  #501 = Utf8               command
  #502 = Utf8               player
  #503 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #504 = Utf8               st
  #505 = Utf8               Ljava/util/StringTokenizer;
  #506 = Utf8               actualCommand
  #507 = Utf8               page
  #508 = Utf8               StackMapTable
  #509 = Utf8               getAdminCommandList
  #510 = Utf8               ()[Ljava/lang/String;
  #511 = Utf8               nm
  #512 = Utf8               row
  #513 = Utf8               adminReply
  #514 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #515 = Utf8               npcMakers
  #516 = Utf8               Ljava/util/List;
  #517 = Utf8               list
  #518 = Utf8               Lext/mods/commons/data/Pagination;
  #519 = Utf8               LocalVariableTypeTable
  #520 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/NpcMaker;>;
  #521 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/commons/geometry/Territory;>;
  #522 = Class              #523          // "[Ljava/lang/Object;"
  #523 = Utf8               [Ljava/lang/Object;
  #524 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #525 = Utf8               sb
  #526 = Utf8               Ljava/lang/StringBuilder;
  #527 = Utf8               respawningCount
  #528 = Utf8               spawns
  #529 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/spawn/MultiSpawn;>;
  #530 = Class              #531          // java/util/Locale
  #531 = Utf8               java/util/Locale
  #532 = Utf8               quest
  #533 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #534 = Utf8               quests
  #535 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #536 = Utf8               lambda$showNpcMakerInfo$0
  #537 = Utf8               (Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #538 = Utf8               lambda$showNpcMakersInfo$0
  #539 = Utf8               (Lext/mods/commons/geometry/Territory;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #540 = Utf8               <clinit>
  #541 = Utf8               SourceFile
  #542 = Utf8               AdminAlternativeSpawn.java
  #543 = Utf8               BootstrapMethods
  #544 = String             #545          // Maker \"\u0001\" doesn\'t exist.
  #545 = Utf8               Maker \"\u0001\" doesn\'t exist.
  #546 = String             #547          // Territory \"\u0001\" doesn\'t exist.
  #547 = Utf8               Territory \"\u0001\" doesn\'t exist.
  #548 = String             #549          // Spawned \u0001 \"\u0001\" NPCs.
  #549 = Utf8               Spawned \u0001 \"\u0001\" NPCs.
  #550 = String             #551          // Despawned \u0001 \"\u0001\" NPCs.
  #551 = Utf8               Despawned \u0001 \"\u0001\" NPCs.
  #552 = MethodType         #553          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #553 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #554 = MethodHandle       5:#356        // REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
  #555 = MethodType         #556          //  (Lext/mods/gameserver/model/spawn/NpcMaker;)Lext/mods/commons/geometry/Territory;
  #556 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)Lext/mods/commons/geometry/Territory;
  #557 = MethodType         #25           //  (Ljava/lang/Object;)Z
  #558 = MethodHandle       6:#559        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.lambda$showNpcMakersInfo$0:(Lext/mods/commons/geometry/Territory;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #559 = Methodref          #31.#560      // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.lambda$showNpcMakersInfo$0:(Lext/mods/commons/geometry/Territory;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #560 = NameAndType        #538:#539     // lambda$showNpcMakersInfo$0:(Lext/mods/commons/geometry/Territory;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #561 = MethodType         #562          //  (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #562 = Utf8               (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  #563 = MethodType         #564          //  (Ljava/lang/Object;)I
  #564 = Utf8               (Ljava/lang/Object;)I
  #565 = MethodHandle       6:#566        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.lambda$showNpcMakerInfo$0:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #566 = Methodref          #31.#567      // ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.lambda$showNpcMakerInfo$0:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #567 = NameAndType        #536:#537     // lambda$showNpcMakerInfo$0:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #568 = MethodType         #537          //  (Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  #569 = String             #570          // \u0001
  #570 = Utf8               \u0001
  #571 = MethodHandle       6:#572        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #572 = Methodref          #573.#574     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #573 = Class              #575          // java/lang/invoke/StringConcatFactory
  #574 = NameAndType        #64:#576      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #575 = Utf8               java/lang/invoke/StringConcatFactory
  #576 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #577 = MethodHandle       6:#578        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #578 = Methodref          #579.#580     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #579 = Class              #581          // java/lang/invoke/LambdaMetafactory
  #580 = NameAndType        #582:#583     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #581 = Utf8               java/lang/invoke/LambdaMetafactory
  #582 = Utf8               metafactory
  #583 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #584 = Utf8               InnerClasses
  #585 = Class              #586          // java/lang/invoke/MethodHandles$Lookup
  #586 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #587 = Class              #588          // java/lang/invoke/MethodHandles
  #588 = Utf8               java/lang/invoke/MethodHandles
  #589 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminAlternativeSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=13, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: astore        4
        17: iconst_1
        18: istore        5
        20: aload         4
        22: ldc           #18                 // String admin_maker
        24: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        27: ifeq          442
        30: aload_3
        31: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        34: ifne          44
        37: aload_2
        38: iload         5
        40: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
        43: return
        44: aload_3
        45: invokevirtual #36                 // Method java/util/StringTokenizer.countTokens:()I
        48: istore        6
        50: iload         6
        52: iconst_1
        53: if_icmpne     122
        56: aload_3
        57: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        60: astore        4
        62: aload         4
        64: invokestatic  #40                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
        67: ifeq          86
        70: aload         4
        72: invokestatic  #46                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        75: istore        5
        77: aload_2
        78: iload         5
        80: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
        83: goto          439
        86: invokestatic  #52                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        89: aload         4
        91: invokevirtual #58                 // Method ext/mods/gameserver/data/manager/SpawnManager.getNpcMaker:(Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
        94: astore        7
        96: aload         7
        98: ifnonnull     113
       101: aload_2
       102: aload         4
       104: invokedynamic #62,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       109: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       112: return
       113: aload_2
       114: aload         7
       116: invokestatic  #72                 // Method showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       119: goto          439
       122: iload         6
       124: iconst_2
       125: if_icmplt     439
       128: aload_3
       129: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       132: astore        4
       134: aload_3
       135: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       138: astore        7
       140: invokestatic  #52                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       143: aload         7
       145: invokevirtual #58                 // Method ext/mods/gameserver/data/manager/SpawnManager.getNpcMaker:(Ljava/lang/String;)Lext/mods/gameserver/model/spawn/NpcMaker;
       148: astore        8
       150: aload         8
       152: ifnonnull     167
       155: aload_2
       156: aload         7
       158: invokedynamic #62,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       163: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       166: return
       167: aload         4
       169: astore        9
       171: iconst_m1
       172: istore        10
       174: aload         9
       176: invokevirtual #76                 // Method java/lang/String.hashCode:()I
       179: lookupswitch  { // 5

             -1335458389: 228

              -889473228: 292

               109638523: 276

              1097387304: 244

              1926514952: 260
                 default: 305
            }
       228: aload         9
       230: ldc           #79                 // String delete
       232: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       235: ifeq          305
       238: iconst_0
       239: istore        10
       241: goto          305
       244: aload         9
       246: ldc           #81                 // String respawn
       248: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       251: ifeq          305
       254: iconst_1
       255: istore        10
       257: goto          305
       260: aload         9
       262: ldc           #83                 // String scripts
       264: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       267: ifeq          305
       270: iconst_2
       271: istore        10
       273: goto          305
       276: aload         9
       278: ldc           #85                 // String spawn
       280: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       283: ifeq          305
       286: iconst_3
       287: istore        10
       289: goto          305
       292: aload         9
       294: ldc           #87                 // String switch
       296: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       299: ifeq          305
       302: iconst_4
       303: istore        10
       305: iload         10
       307: tableswitch   { // 0 to 4

                       0: 340

                       1: 355

                       2: 392

                       3: 401

                       4: 424
                 default: 433
            }
       340: aload         8
       342: invokevirtual #89                 // Method ext/mods/gameserver/model/spawn/NpcMaker.deleteAll:()I
       345: pop
       346: aload_2
       347: aload         8
       349: invokestatic  #72                 // Method showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       352: goto          439
       355: aload         8
       357: invokevirtual #94                 // Method ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
       360: ldc           #98                 // String 1000
       362: aload         8
       364: iconst_0
       365: iconst_0
       366: invokevirtual #100                // Method ext/mods/gameserver/scripting/SpawnMaker.onMakerScriptEvent:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;II)V
       369: aload         8
       371: invokevirtual #94                 // Method ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
       374: ldc           #106                // String 1001
       376: aload         8
       378: iconst_0
       379: iconst_0
       380: invokevirtual #100                // Method ext/mods/gameserver/scripting/SpawnMaker.onMakerScriptEvent:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;II)V
       383: aload_2
       384: aload         8
       386: invokestatic  #72                 // Method showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       389: goto          439
       392: aload_2
       393: aload         8
       395: invokestatic  #108                // Method showMakerScripts:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       398: goto          439
       401: aload         8
       403: invokevirtual #94                 // Method ext/mods/gameserver/model/spawn/NpcMaker.getMaker:()Lext/mods/gameserver/scripting/SpawnMaker;
       406: ldc           #106                // String 1001
       408: aload         8
       410: iconst_0
       411: iconst_0
       412: invokevirtual #100                // Method ext/mods/gameserver/scripting/SpawnMaker.onMakerScriptEvent:(Ljava/lang/String;Lext/mods/gameserver/model/spawn/NpcMaker;II)V
       415: aload_2
       416: aload         8
       418: invokestatic  #72                 // Method showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       421: goto          439
       424: aload_2
       425: aload         8
       427: invokestatic  #72                 // Method showNpcMakerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/NpcMaker;)V
       430: goto          439
       433: aload_2
       434: ldc           #111                // String Usage: //maker [delete|respawn|scripts|spawn|switch <name>]
       436: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       439: goto          971
       442: aload         4
       444: ldc           #113                // String admin_terr
       446: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       449: ifeq          860
       452: aload_3
       453: invokevirtual #36                 // Method java/util/StringTokenizer.countTokens:()I
       456: istore        6
       458: iload         6
       460: ifne          472
       463: aload_2
       464: iload         5
       466: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
       469: goto          857
       472: iload         6
       474: iconst_1
       475: if_icmpne     576
       478: aload_3
       479: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       482: astore        4
       484: aload         4
       486: astore        7
       488: iconst_m1
       489: istore        8
       491: aload         7
       493: invokevirtual #76                 // Method java/lang/String.hashCode:()I
       496: lookupswitch  { // 1

              1932079246: 516
                 default: 529
            }
       516: aload         7
       518: ldc           #115                // String visual_clear
       520: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       523: ifeq          529
       526: iconst_0
       527: istore        8
       529: iload         8
       531: lookupswitch  { // 1

                       0: 548
                 default: 573
            }
       548: aload_2
       549: ldc           #117                // String TERR
       551: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       554: astore        9
       556: aload         9
       558: invokevirtual #123                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       561: aload         9
       563: aload_2
       564: invokevirtual #128                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       567: aload_2
       568: iload         5
       570: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
       573: goto          857
       576: iload         6
       578: iconst_2
       579: if_icmplt     851
       582: aload_3
       583: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       586: astore        4
       588: aload_3
       589: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       592: astore        7
       594: invokestatic  #52                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       597: aload         7
       599: invokevirtual #132                // Method ext/mods/gameserver/data/manager/SpawnManager.getTerritory:(Ljava/lang/String;)Lext/mods/commons/geometry/Territory;
       602: astore        8
       604: aload         8
       606: ifnonnull     621
       609: aload_2
       610: aload         7
       612: invokedynamic #136,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       617: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       620: return
       621: aload         4
       623: astore        9
       625: iconst_m1
       626: istore        10
       628: aload         9
       630: invokevirtual #76                 // Method java/lang/String.hashCode:()I
       633: lookupswitch  { // 3

              -816216256: 700

                 3178851: 668

                 3556498: 684
                 default: 713
            }
       668: aload         9
       670: ldc           #137                // String goto
       672: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       675: ifeq          713
       678: iconst_0
       679: istore        10
       681: goto          713
       684: aload         9
       686: ldc           #139                // String test
       688: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       691: ifeq          713
       694: iconst_1
       695: istore        10
       697: goto          713
       700: aload         9
       702: ldc           #141                // String visual
       704: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       707: ifeq          713
       710: iconst_2
       711: istore        10
       713: iload         10
       715: tableswitch   { // 0 to 2

                       0: 740

                       1: 758

                       2: 816
                 default: 848
            }
       740: aload_2
       741: aload         8
       743: invokevirtual #143                // Method ext/mods/commons/geometry/Territory.getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       746: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
       749: aload_2
       750: iload         5
       752: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
       755: goto          848
       758: aload_2
       759: ldc           #117                // String TERR
       761: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       764: astore        11
       766: aload         11
       768: invokevirtual #123                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       771: iconst_0
       772: istore        12
       774: iload         12
       776: sipush        10000
       779: if_icmpge     801
       782: aload         11
       784: getstatic     #153                // Field java/awt/Color.GREEN:Ljava/awt/Color;
       787: aload         8
       789: invokevirtual #143                // Method ext/mods/commons/geometry/Territory.getRandomGeoLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       792: invokevirtual #159                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
       795: iinc          12, 1
       798: goto          774
       801: aload         11
       803: aload_2
       804: invokevirtual #128                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       807: aload_2
       808: iload         5
       810: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
       813: goto          848
       816: aload_2
       817: ldc           #117                // String TERR
       819: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
       822: astore        11
       824: aload         11
       826: invokevirtual #123                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
       829: aload         8
       831: aload         11
       833: invokevirtual #163                // Method ext/mods/commons/geometry/Territory.visualize:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
       836: aload         11
       838: aload_2
       839: invokevirtual #128                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
       842: aload_2
       843: iload         5
       845: invokestatic  #30                 // Method showNpcMakersInfo:(Lext/mods/gameserver/model/actor/Player;I)V
       848: goto          857
       851: aload_2
       852: ldc           #167                // String Usage: //terr goto|visual|visual_clear name
       854: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       857: goto          971
       860: aload         4
       862: ldc           #169                // String admin_spawn_event
       864: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       867: ifeq          917
       870: aload_3
       871: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       874: ifne          884
       877: aload_2
       878: ldc           #171                // String Usage: //spawn_event <event_name>
       880: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       883: return
       884: aload_3
       885: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       888: astore        6
       890: invokestatic  #52                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       893: aload         6
       895: iconst_1
       896: invokevirtual #173                // Method ext/mods/gameserver/data/manager/SpawnManager.spawnEventNpcs:(Ljava/lang/String;Z)J
       899: lstore        7
       901: aload_2
       902: lload         7
       904: aload         6
       906: invokedynamic #177,  0            // InvokeDynamic #2:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
       911: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       914: goto          971
       917: aload         4
       919: ldc           #180                // String admin_despawn_event
       921: invokevirtual #20                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       924: ifeq          971
       927: aload_3
       928: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       931: ifne          941
       934: aload_2
       935: ldc           #182                // String Usage: //despawn_event <event_name>
       937: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       940: return
       941: aload_3
       942: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       945: astore        6
       947: invokestatic  #52                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
       950: aload         6
       952: iconst_1
       953: invokevirtual #184                // Method ext/mods/gameserver/data/manager/SpawnManager.despawnEventNpcs:(Ljava/lang/String;Z)J
       956: lstore        7
       958: aload_2
       959: lload         7
       961: aload         6
       963: invokedynamic #187,  0            // InvokeDynamic #3:makeConcatWithConstants:(JLjava/lang/String;)Ljava/lang/String;
       968: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       971: return
      LineNumberTable:
        line 51: 0
        line 52: 11
        line 54: 17
        line 56: 20
        line 58: 30
        line 60: 37
        line 61: 43
        line 64: 44
        line 65: 50
        line 67: 56
        line 68: 62
        line 70: 70
        line 71: 77
        line 75: 86
        line 76: 96
        line 78: 101
        line 79: 112
        line 82: 113
        line 83: 119
        line 85: 122
        line 87: 128
        line 89: 134
        line 90: 140
        line 91: 150
        line 93: 155
        line 94: 166
        line 97: 167
        line 100: 340
        line 101: 346
        line 102: 352
        line 105: 355
        line 106: 369
        line 107: 383
        line 108: 389
        line 111: 392
        line 112: 398
        line 115: 401
        line 116: 415
        line 117: 421
        line 120: 424
        line 121: 430
        line 124: 433
        line 128: 439
        line 129: 442
        line 131: 452
        line 132: 458
        line 133: 463
        line 134: 472
        line 136: 478
        line 137: 484
        line 140: 548
        line 141: 556
        line 142: 561
        line 143: 567
        line 145: 573
        line 147: 576
        line 149: 582
        line 151: 588
        line 152: 594
        line 153: 604
        line 155: 609
        line 156: 620
        line 159: 621
        line 162: 740
        line 163: 749
        line 164: 755
        line 167: 758
        line 168: 766
        line 170: 771
        line 171: 782
        line 170: 795
        line 173: 801
        line 175: 807
        line 176: 813
        line 179: 816
        line 180: 824
        line 182: 829
        line 183: 836
        line 185: 842
        line 188: 848
        line 190: 851
        line 191: 857
        line 192: 860
        line 194: 870
        line 196: 877
        line 197: 883
        line 200: 884
        line 201: 890
        line 202: 901
        line 203: 914
        line 204: 917
        line 206: 927
        line 208: 934
        line 209: 940
        line 212: 941
        line 213: 947
        line 214: 958
        line 216: 971
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           96      23     7 maker   Lext/mods/gameserver/model/spawn/NpcMaker;
          140     299     7  name   Ljava/lang/String;
          150     289     8 maker   Lext/mods/gameserver/model/spawn/NpcMaker;
           50     389     6 paramCount   I
          556      17     9 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          774      27    12     i   I
          766      50    11 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          824      24    11 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          594     254     7  name   Ljava/lang/String;
          604     244     8 territory   Lext/mods/commons/geometry/Territory;
          458     399     6 paramCount   I
          890      24     6 event   Ljava/lang/String;
          901      13     7 total   J
          947      24     6 event   Ljava/lang/String;
          958      13     7 total   J
            0     972     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn;
            0     972     1 command   Ljava/lang/String;
            0     972     2 player   Lext/mods/gameserver/model/actor/Player;
           11     961     3    st   Ljava/util/StringTokenizer;
           17     955     4 actualCommand   Ljava/lang/String;
           20     952     5  page   I
      StackMapTable: number_of_entries = 43
        frame_type = 254 /* append */
          offset_delta = 44
          locals = [ class java/util/StringTokenizer, class java/lang/String, int ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/spawn/NpcMaker ]
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class java/lang/String, class ext/mods/gameserver/model/spawn/NpcMaker ]
        frame_type = 253 /* append */
          offset_delta = 60
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 34 /* same */
        frame_type = 14 /* same */
        frame_type = 36 /* same */
        frame_type = 8 /* same */
        frame_type = 22 /* same */
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/lang/String, int ]
        frame_type = 12 /* same */
        frame_type = 18 /* same */
        frame_type = 249 /* chop */
          offset_delta = 24
        frame_type = 2 /* same */
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class java/lang/String, class ext/mods/commons/geometry/Territory ]
        frame_type = 253 /* append */
          offset_delta = 46
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int ]
        frame_type = 250 /* chop */
          offset_delta = 26
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 23 /* same */
        frame_type = 32 /* same */
        frame_type = 23 /* same */
        frame_type = 29 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #188                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 221: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_4
         1: anewarray     #21                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #18                 // String admin_maker
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #113                // String admin_terr
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #169                // String admin_spawn_event
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #180                // String admin_despawn_event
        23: aastore
        24: putstatic     #188                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        27: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "AdminAlternativeSpawn.java"
BootstrapMethods:
  0: #571 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #544 Maker \"\u0001\" doesn\'t exist.
  1: #571 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #546 Territory \"\u0001\" doesn\'t exist.
  2: #571 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #548 Spawned \u0001 \"\u0001\" NPCs.
  3: #571 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #550 Despawned \u0001 \"\u0001\" NPCs.
  4: #577 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #552 (Ljava/lang/Object;)Ljava/lang/Object;
      #554 REF_invokeVirtual ext/mods/gameserver/model/spawn/NpcMaker.getTerritory:()Lext/mods/commons/geometry/Territory;
      #555 (Lext/mods/gameserver/model/spawn/NpcMaker;)Lext/mods/commons/geometry/Territory;
  5: #577 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #557 (Ljava/lang/Object;)Z
      #558 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.lambda$showNpcMakersInfo$0:(Lext/mods/commons/geometry/Territory;Lext/mods/gameserver/model/spawn/NpcMaker;)Z
      #561 (Lext/mods/gameserver/model/spawn/NpcMaker;)Z
  6: #577 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #563 (Ljava/lang/Object;)I
      #565 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminAlternativeSpawn.lambda$showNpcMakerInfo$0:(Lext/mods/gameserver/model/spawn/MultiSpawn;)I
      #568 (Lext/mods/gameserver/model/spawn/MultiSpawn;)I
  7: #571 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #569 \u0001
InnerClasses:
  public static final #589= #585 of #587; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
