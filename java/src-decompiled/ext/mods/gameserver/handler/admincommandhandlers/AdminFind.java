// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminFind
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminFind.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminFind.class
  Last modified 9 de jul de 2026; size 17772 bytes
  MD5 checksum 44c9b71acb2a0fb85a54738f84f32880
  Compiled from "AdminFind.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminFind implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/admincommandhandlers/AdminFind
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 18, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = Methodref          #7.#10        // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #7.#13        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #13 = NameAndType        #14:#15       // nextToken:()Ljava/lang/String;
   #14 = Utf8               nextToken
   #15 = Utf8               ()Ljava/lang/String;
   #16 = String             #17           // admin_find
   #17 = Utf8               admin_find
   #18 = Methodref          #19.#20       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #19 = Class              #21           // java/lang/String
   #20 = NameAndType        #22:#23       // startsWith:(Ljava/lang/String;)Z
   #21 = Utf8               java/lang/String
   #22 = Utf8               startsWith
   #23 = Utf8               (Ljava/lang/String;)Z
   #24 = Methodref          #7.#25        // java/util/StringTokenizer.countTokens:()I
   #25 = NameAndType        #26:#27       // countTokens:()I
   #26 = Utf8               countTokens
   #27 = Utf8               ()I
   #28 = String             #29           //
   #29 = Utf8
   #30 = Methodref          #31.#32       // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #31 = Class              #33           // ext/mods/gameserver/handler/admincommandhandlers/AdminFind
   #32 = NameAndType        #34:#35       // listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #33 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminFind
   #34 = Utf8               listPlayers
   #35 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
   #36 = Methodref          #19.#37       // java/lang/String.toLowerCase:()Ljava/lang/String;
   #37 = NameAndType        #38:#15       // toLowerCase:()Ljava/lang/String;
   #38 = Utf8               toLowerCase
   #39 = Methodref          #19.#40       // java/lang/String.hashCode:()I
   #40 = NameAndType        #41:#27       // hashCode:()I
   #41 = Utf8               hashCode
   #42 = String             #43           // player
   #43 = Utf8               player
   #44 = Methodref          #19.#45       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #45 = NameAndType        #46:#47       // equals:(Ljava/lang/Object;)Z
   #46 = Utf8               equals
   #47 = Utf8               (Ljava/lang/Object;)Z
   #48 = String             #49           // ip
   #49 = Utf8               ip
   #50 = String             #51           // account
   #51 = Utf8               account
   #52 = String             #53           // dualbox
   #53 = Utf8               dualbox
   #54 = String             #55           // item
   #55 = Utf8               item
   #56 = String             #57           // npc
   #57 = Utf8               npc
   #58 = Methodref          #59.#60       // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #59 = Class              #61           // ext/mods/commons/lang/StringUtil
   #60 = NameAndType        #62:#23       // isDigit:(Ljava/lang/String;)Z
   #61 = Utf8               ext/mods/commons/lang/StringUtil
   #62 = Utf8               isDigit
   #63 = Methodref          #64.#65       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #64 = Class              #66           // java/lang/Integer
   #65 = NameAndType        #67:#68       // parseInt:(Ljava/lang/String;)I
   #66 = Utf8               java/lang/Integer
   #67 = Utf8               parseInt
   #68 = Utf8               (Ljava/lang/String;)I
   #69 = Class              #70           // java/lang/Exception
   #70 = Utf8               java/lang/Exception
   #71 = String             #72           // Usage: //find player name
   #72 = Utf8               Usage: //find player name
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #74 = Class              #76           // ext/mods/gameserver/model/actor/Player
   #75 = NameAndType        #77:#11       // sendMessage:(Ljava/lang/String;)V
   #76 = Utf8               ext/mods/gameserver/model/actor/Player
   #77 = Utf8               sendMessage
   #78 = String             #79           // 127.0.0.1
   #79 = Utf8               127.0.0.1
   #80 = Methodref          #31.#81       // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.listPlayersPerIp:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #81 = NameAndType        #82:#83       // listPlayersPerIp:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #82 = Utf8               listPlayersPerIp
   #83 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #84 = String             #85           // Usage: //find ip 111.222.333.444
   #85 = Utf8               Usage: //find ip 111.222.333.444
   #86 = Methodref          #74.#87       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #87 = NameAndType        #88:#15       // getName:()Ljava/lang/String;
   #88 = Utf8               getName
   #89 = Methodref          #31.#90       // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.listPlayersPerAccount:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #90 = NameAndType        #91:#83       // listPlayersPerAccount:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #91 = Utf8               listPlayersPerAccount
   #92 = String             #93           // Usage: //find account name
   #93 = Utf8               Usage: //find account name
   #94 = String             #95           // Usage: //find dualbox [number > 0]
   #95 = Utf8               Usage: //find dualbox [number > 0]
   #96 = Methodref          #31.#97       // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.listDualbox:(Lext/mods/gameserver/model/actor/Player;I)V
   #97 = NameAndType        #98:#99       // listDualbox:(Lext/mods/gameserver/model/actor/Player;I)V
   #98 = Utf8               listDualbox
   #99 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #100 = Methodref          #31.#101      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.listItems:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #101 = NameAndType        #102:#35      // listItems:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #102 = Utf8               listItems
  #103 = Methodref          #19.#104      // java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
  #104 = NameAndType        #105:#106     // split:(Ljava/lang/String;I)[Ljava/lang/String;
  #105 = Utf8               split
  #106 = Utf8               (Ljava/lang/String;I)[Ljava/lang/String;
  #107 = Methodref          #19.#108      // java/lang/String.trim:()Ljava/lang/String;
  #108 = NameAndType        #109:#15      // trim:()Ljava/lang/String;
  #109 = Utf8               trim
  #110 = Methodref          #31.#111      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.listNpcs:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #111 = NameAndType        #112:#35      // listNpcs:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
  #112 = Utf8               listNpcs
  #113 = String             #114          // Usage: //find [account|dualbox|ip|item|npc|player name/id]
  #114 = Utf8               Usage: //find [account|dualbox|ip|item|npc|player name/id]
  #115 = Class              #116          // ext/mods/commons/data/Pagination
  #116 = Utf8               ext/mods/commons/data/Pagination
  #117 = Methodref          #118.#119     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #118 = Class              #120          // ext/mods/gameserver/model/World
  #119 = NameAndType        #121:#122     // getInstance:()Lext/mods/gameserver/model/World;
  #120 = Utf8               ext/mods/gameserver/model/World
  #121 = Utf8               getInstance
  #122 = Utf8               ()Lext/mods/gameserver/model/World;
  #123 = Methodref          #118.#124     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #124 = NameAndType        #125:#126     // getPlayers:()Ljava/util/Collection;
  #125 = Utf8               getPlayers
  #126 = Utf8               ()Ljava/util/Collection;
  #127 = InterfaceMethodref #128.#129     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #128 = Class              #130          // java/util/Collection
  #129 = NameAndType        #131:#132     // stream:()Ljava/util/stream/Stream;
  #130 = Utf8               java/util/Collection
  #131 = Utf8               stream
  #132 = Utf8               ()Ljava/util/stream/Stream;
  #133 = Class              #134          // ext/mods/gameserver/handler/IAdminCommandHandler
  #134 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #135 = InvokeDynamic      #0:#136       // #0:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #136 = NameAndType        #137:#138     // test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #137 = Utf8               test
  #138 = Utf8               (Ljava/lang/String;)Ljava/util/function/Predicate;
  #139 = Methodref          #115.#140     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #140 = NameAndType        #5:#141       // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #141 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;)V
  #142 = String             #143          // <html><body>
  #143 = Utf8               <html><body>
  #144 = Methodref          #115.#145     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #145 = NameAndType        #146:#147     // append:([Ljava/lang/Object;)V
  #146 = Utf8               append
  #147 = Utf8               ([Ljava/lang/Object;)V
  #148 = String             #149          // bypass admin_find player
  #149 = Utf8               bypass admin_find player
  #150 = Methodref          #115.#151     // ext/mods/commons/data/Pagination.generateSearch:(Ljava/lang/String;I)V
  #151 = NameAndType        #152:#153     // generateSearch:(Ljava/lang/String;I)V
  #152 = Utf8               generateSearch
  #153 = Utf8               (Ljava/lang/String;I)V
  #154 = String             #155          // <br1><table width=280 height=26><tr><td width=140>Name</td><td width=120>Class</td><td width=20>Lvl</td></tr></table>
  #155 = Utf8               <br1><table width=280 height=26><tr><td width=140>Name</td><td width=120>Class</td><td width=20>Lvl</td></tr></table>
  #156 = Methodref          #115.#129     // ext/mods/commons/data/Pagination.stream:()Ljava/util/stream/Stream;
  #157 = InvokeDynamic      #1:#158       // #1:test:()Ljava/util/function/Predicate;
  #158 = NameAndType        #137:#159     // test:()Ljava/util/function/Predicate;
  #159 = Utf8               ()Ljava/util/function/Predicate;
  #160 = InterfaceMethodref #161.#162     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #161 = Class              #163          // java/util/stream/Stream
  #162 = NameAndType        #164:#165     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #163 = Utf8               java/util/stream/Stream
  #164 = Utf8               filter
  #165 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #166 = Methodref          #167.#168     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #167 = Class              #169          // java/util/stream/Collectors
  #168 = NameAndType        #170:#171     // toList:()Ljava/util/stream/Collector;
  #169 = Utf8               java/util/stream/Collectors
  #170 = Utf8               toList
  #171 = Utf8               ()Ljava/util/stream/Collector;
  #172 = InterfaceMethodref #161.#173     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #173 = NameAndType        #174:#175     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #174 = Utf8               collect
  #175 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #176 = Class              #177          // java/util/List
  #177 = Utf8               java/util/List
  #178 = InvokeDynamic      #2:#158       // #2:test:()Ljava/util/function/Predicate;
  #179 = Class              #180          // java/util/ArrayList
  #180 = Utf8               java/util/ArrayList
  #181 = Methodref          #179.#182     // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #182 = NameAndType        #5:#183       // "<init>":(Ljava/util/Collection;)V
  #183 = Utf8               (Ljava/util/Collection;)V
  #184 = InterfaceMethodref #176.#185     // java/util/List.addAll:(Ljava/util/Collection;)Z
  #185 = NameAndType        #186:#187     // addAll:(Ljava/util/Collection;)Z
  #186 = Utf8               addAll
  #187 = Utf8               (Ljava/util/Collection;)Z
  #188 = InterfaceMethodref #176.#189     // java/util/List.iterator:()Ljava/util/Iterator;
  #189 = NameAndType        #190:#191     // iterator:()Ljava/util/Iterator;
  #190 = Utf8               iterator
  #191 = Utf8               ()Ljava/util/Iterator;
  #192 = InterfaceMethodref #193.#194     // java/util/Iterator.hasNext:()Z
  #193 = Class              #195          // java/util/Iterator
  #194 = NameAndType        #196:#197     // hasNext:()Z
  #195 = Utf8               java/util/Iterator
  #196 = Utf8               hasNext
  #197 = Utf8               ()Z
  #198 = InterfaceMethodref #193.#199     // java/util/Iterator.next:()Ljava/lang/Object;
  #199 = NameAndType        #200:#201     // next:()Ljava/lang/Object;
  #200 = Utf8               next
  #201 = Utf8               ()Ljava/lang/Object;
  #202 = Methodref          #74.#203      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #203 = NameAndType        #204:#205     // getClient:()Lext/mods/gameserver/network/GameClient;
  #204 = Utf8               getClient
  #205 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #206 = Methodref          #207.#208     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #207 = Class              #209          // ext/mods/gameserver/network/GameClient
  #208 = NameAndType        #210:#197     // isDetached:()Z
  #209 = Utf8               ext/mods/gameserver/network/GameClient
  #210 = Utf8               isDetached
  #211 = Methodref          #115.#212     // ext/mods/commons/data/Pagination.indexOf:(Ljava/lang/Object;)I
  #212 = NameAndType        #213:#214     // indexOf:(Ljava/lang/Object;)I
  #213 = Utf8               indexOf
  #214 = Utf8               (Ljava/lang/Object;)I
  #215 = String             #216          // <table width=280 height=22 bgcolor=000000><tr>
  #216 = Utf8               <table width=280 height=22 bgcolor=000000><tr>
  #217 = String             #218          // <table width=280><tr>
  #218 = Utf8               <table width=280><tr>
  #219 = String             #220          // <td width=140><a action=\"bypass -h admin_debug
  #220 = Utf8               <td width=140><a action=\"bypass -h admin_debug
  #221 = String             #222          // \">
  #222 = Utf8               \">
  #223 = InvokeDynamic      #3:#224       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #224 = NameAndType        #225:#226     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #225 = Utf8               makeConcatWithConstants
  #226 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #227 = String             #228          // </a></td><td width=120>
  #228 = Utf8               </a></td><td width=120>
  #229 = Methodref          #74.#230      // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #230 = NameAndType        #231:#232     // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #231 = Utf8               getTemplate
  #232 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
  #233 = Methodref          #234.#235     // ext/mods/gameserver/model/actor/template/PlayerTemplate.getClassName:()Ljava/lang/String;
  #234 = Class              #236          // ext/mods/gameserver/model/actor/template/PlayerTemplate
  #235 = NameAndType        #237:#15      // getClassName:()Ljava/lang/String;
  #236 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
  #237 = Utf8               getClassName
  #238 = String             #239          // </td><td width=20>
  #239 = Utf8               </td><td width=20>
  #240 = Methodref          #74.#241      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #241 = NameAndType        #242:#243     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #242 = Utf8               getStatus
  #243 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #244 = Methodref          #245.#246     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #245 = Class              #247          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #246 = NameAndType        #248:#27      // getLevel:()I
  #247 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #248 = Utf8               getLevel
  #249 = Methodref          #64.#250      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #250 = NameAndType        #251:#252     // valueOf:(I)Ljava/lang/Integer;
  #251 = Utf8               valueOf
  #252 = Utf8               (I)Ljava/lang/Integer;
  #253 = String             #254          // </td>
  #254 = Utf8               </td>
  #255 = String             #256          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #256 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #257 = Methodref          #115.#258     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #258 = NameAndType        #259:#260     // generateSpace:(I)V
  #259 = Utf8               generateSpace
  #260 = Utf8               (I)V
  #261 = InvokeDynamic      #4:#224       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #262 = Methodref          #115.#263     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #263 = NameAndType        #264:#11      // generatePages:(Ljava/lang/String;)V
  #264 = Utf8               generatePages
  #265 = String             #266          // </body></html>
  #266 = Utf8               </body></html>
  #267 = Class              #268          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #268 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #269 = Methodref          #267.#270     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #270 = NameAndType        #5:#260       // "<init>":(I)V
  #271 = Methodref          #115.#272     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #272 = NameAndType        #273:#15      // getContent:()Ljava/lang/String;
  #273 = Utf8               getContent
  #274 = Methodref          #267.#275     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #275 = NameAndType        #276:#11      // setHtml:(Ljava/lang/String;)V
  #276 = Utf8               setHtml
  #277 = Methodref          #74.#278      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #278 = NameAndType        #279:#280     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #279 = Utf8               sendPacket
  #280 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #281 = String             #282          // disconnected
  #282 = Utf8               disconnected
  #283 = String             #284          // ^(?:(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2(?:[0-4][0-9]|5[0-5]))\\.){3}(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2(?:[0-4][0-9]|5[0-5]))$
  #284 = Utf8               ^(?:(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2(?:[0-4][0-9]|5[0-5]))\\.){3}(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2(?:[0-4][0-9]|5[0-5]))$
  #285 = Methodref          #19.#286      // java/lang/String.matches:(Ljava/lang/String;)Z
  #286 = NameAndType        #287:#23      // matches:(Ljava/lang/String;)Z
  #287 = Utf8               matches
  #288 = Class              #289          // java/lang/IllegalArgumentException
  #289 = Utf8               java/lang/IllegalArgumentException
  #290 = String             #291          // Malformed IPv4 number
  #291 = Utf8               Malformed IPv4 number
  #292 = Methodref          #288.#10      // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
  #293 = Methodref          #74.#294      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #294 = NameAndType        #295:#296     // getLocale:()Ljava/util/Locale;
  #295 = Utf8               getLocale
  #296 = Utf8               ()Ljava/util/Locale;
  #297 = String             #298          // html/admin/ipfind.htm
  #298 = Utf8               html/admin/ipfind.htm
  #299 = Methodref          #267.#300     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #300 = NameAndType        #301:#302     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #301 = Utf8               setFile
  #302 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #303 = Class              #304          // java/lang/StringBuilder
  #304 = Utf8               java/lang/StringBuilder
  #305 = Methodref          #303.#270     // java/lang/StringBuilder."<init>":(I)V
  #306 = InterfaceMethodref #128.#189     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #307 = Methodref          #207.#308     // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #308 = NameAndType        #309:#310     // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #309 = Utf8               getConnection
  #310 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #311 = Methodref          #312.#313     // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #312 = Class              #314          // ext/mods/commons/mmocore/MMOConnection
  #313 = NameAndType        #315:#316     // getInetAddress:()Ljava/net/InetAddress;
  #314 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #315 = Utf8               getInetAddress
  #316 = Utf8               ()Ljava/net/InetAddress;
  #317 = Methodref          #318.#319     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #318 = Class              #320          // java/net/InetAddress
  #319 = NameAndType        #321:#15      // getHostAddress:()Ljava/lang/String;
  #320 = Utf8               java/net/InetAddress
  #321 = Utf8               getHostAddress
  #322 = String             #323          // <tr><td><a action=\"bypass -h admin_debug
  #323 = Utf8               <tr><td><a action=\"bypass -h admin_debug
  #324 = String             #325          // </a></td><td>
  #325 = Utf8               </a></td><td>
  #326 = String             #327          // </td><td>
  #327 = Utf8               </td><td>
  #328 = String             #329          // </td></tr>
  #329 = Utf8               </td></tr>
  #330 = Methodref          #59.#331      // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #331 = NameAndType        #146:#332     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #332 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #333 = String             #334          // %number%
  #334 = Utf8               %number%
  #335 = String             #336          // more than 20
  #336 = Utf8               more than 20
  #337 = Methodref          #267.#338     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #338 = NameAndType        #339:#340     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #339 = Utf8               replace
  #340 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #341 = Methodref          #267.#342     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #342 = NameAndType        #339:#153     // replace:(Ljava/lang/String;I)V
  #343 = String             #344          // %ip%
  #344 = Utf8               %ip%
  #345 = String             #346          // %results%
  #346 = Utf8               %results%
  #347 = Methodref          #303.#348     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #348 = NameAndType        #349:#15      // toString:()Ljava/lang/String;
  #349 = Utf8               toString
  #350 = Methodref          #118.#351     // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #351 = NameAndType        #352:#353     // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #352 = Utf8               getPlayer
  #353 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #354 = Fieldref           #355.#356     // ext/mods/gameserver/network/SystemMessageId.TARGET_CANT_FOUND:Lext/mods/gameserver/network/SystemMessageId;
  #355 = Class              #357          // ext/mods/gameserver/network/SystemMessageId
  #356 = NameAndType        #358:#359     // TARGET_CANT_FOUND:Lext/mods/gameserver/network/SystemMessageId;
  #357 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #358 = Utf8               TARGET_CANT_FOUND
  #359 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #360 = Methodref          #74.#361      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #361 = NameAndType        #279:#362     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #362 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #363 = String             #364          // html/admin/accountinfo.htm
  #364 = Utf8               html/admin/accountinfo.htm
  #365 = String             #366          // %name%
  #366 = Utf8               %name%
  #367 = String             #368          // %characters%
  #368 = Utf8               %characters%
  #369 = String             #370          // <br1>
  #370 = Utf8               <br1>
  #371 = Methodref          #74.#372      // ext/mods/gameserver/model/actor/Player.getAccountChars:()Ljava/util/Map;
  #372 = NameAndType        #373:#374     // getAccountChars:()Ljava/util/Map;
  #373 = Utf8               getAccountChars
  #374 = Utf8               ()Ljava/util/Map;
  #375 = InterfaceMethodref #376.#377     // java/util/Map.values:()Ljava/util/Collection;
  #376 = Class              #378          // java/util/Map
  #377 = NameAndType        #379:#126     // values:()Ljava/util/Collection;
  #378 = Utf8               java/util/Map
  #379 = Utf8               values
  #380 = Methodref          #19.#381      // java/lang/String.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #381 = NameAndType        #382:#383     // join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #382 = Utf8               join
  #383 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
  #384 = String             #385          // %account%
  #385 = Utf8               %account%
  #386 = Methodref          #74.#387      // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
  #387 = NameAndType        #388:#15      // getAccountName:()Ljava/lang/String;
  #388 = Utf8               getAccountName
  #389 = Class              #390          // java/util/HashMap
  #390 = Utf8               java/util/HashMap
  #391 = Methodref          #389.#3       // java/util/HashMap."<init>":()V
  #392 = InvokeDynamic      #5:#393       // #5:apply:()Ljava/util/function/Function;
  #393 = NameAndType        #394:#395     // apply:()Ljava/util/function/Function;
  #394 = Utf8               apply
  #395 = Utf8               ()Ljava/util/function/Function;
  #396 = InterfaceMethodref #376.#397     // java/util/Map.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #397 = NameAndType        #398:#399     // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #398 = Utf8               computeIfAbsent
  #399 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #400 = InterfaceMethodref #176.#401     // java/util/List.add:(Ljava/lang/Object;)Z
  #401 = NameAndType        #402:#47      // add:(Ljava/lang/Object;)Z
  #402 = Utf8               add
  #403 = InterfaceMethodref #176.#404     // java/util/List.size:()I
  #404 = NameAndType        #405:#27      // size:()I
  #405 = Utf8               size
  #406 = InterfaceMethodref #376.#407     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #407 = NameAndType        #408:#409     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #408 = Utf8               get
  #409 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #410 = InterfaceMethodref #376.#411     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #411 = NameAndType        #412:#413     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #412 = Utf8               put
  #413 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #414 = Methodref          #64.#415      // java/lang/Integer.intValue:()I
  #415 = NameAndType        #416:#27      // intValue:()I
  #416 = Utf8               intValue
  #417 = InterfaceMethodref #376.#418     // java/util/Map.entrySet:()Ljava/util/Set;
  #418 = NameAndType        #419:#420     // entrySet:()Ljava/util/Set;
  #419 = Utf8               entrySet
  #420 = Utf8               ()Ljava/util/Set;
  #421 = InterfaceMethodref #422.#129     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #422 = Class              #423          // java/util/Set
  #423 = Utf8               java/util/Set
  #424 = InterfaceMethodref #425.#426     // java/util/Map$Entry.comparingByValue:()Ljava/util/Comparator;
  #425 = Class              #427          // java/util/Map$Entry
  #426 = NameAndType        #428:#429     // comparingByValue:()Ljava/util/Comparator;
  #427 = Utf8               java/util/Map$Entry
  #428 = Utf8               comparingByValue
  #429 = Utf8               ()Ljava/util/Comparator;
  #430 = Methodref          #431.#432     // java/util/Collections.reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #431 = Class              #433          // java/util/Collections
  #432 = NameAndType        #434:#435     // reverseOrder:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #433 = Utf8               java/util/Collections
  #434 = Utf8               reverseOrder
  #435 = Utf8               (Ljava/util/Comparator;)Ljava/util/Comparator;
  #436 = InterfaceMethodref #161.#437     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #437 = NameAndType        #438:#439     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #438 = Utf8               sorted
  #439 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #440 = InvokeDynamic      #6:#393       // #6:apply:()Ljava/util/function/Function;
  #441 = InterfaceMethodref #161.#442     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #442 = NameAndType        #443:#444     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #443 = Utf8               map
  #444 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #445 = InterfaceMethodref #161.#446     // java/util/stream/Stream.toList:()Ljava/util/List;
  #446 = NameAndType        #170:#447     // toList:()Ljava/util/List;
  #447 = Utf8               ()Ljava/util/List;
  #448 = Methodref          #303.#3       // java/lang/StringBuilder."<init>":()V
  #449 = String             #450          // <a action=\"bypass -h admin_find ip
  #450 = Utf8               <a action=\"bypass -h admin_find ip
  #451 = String             #452          //  (
  #452 = Utf8                (
  #453 = String             #454          // )</a><br1>
  #454 = Utf8               )</a><br1>
  #455 = String             #456          // html/admin/dualbox.htm
  #456 = Utf8               html/admin/dualbox.htm
  #457 = String             #458          // %multibox%
  #458 = Utf8               %multibox%
  #459 = Methodref          #460.#461     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #460 = Class              #462          // ext/mods/gameserver/data/xml/ItemData
  #461 = NameAndType        #121:#463     // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #462 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #463 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #464 = Methodref          #460.#465     // ext/mods/gameserver/data/xml/ItemData.getTemplates:()[Lext/mods/gameserver/model/item/kind/Item;
  #465 = NameAndType        #466:#467     // getTemplates:()[Lext/mods/gameserver/model/item/kind/Item;
  #466 = Utf8               getTemplates
  #467 = Utf8               ()[Lext/mods/gameserver/model/item/kind/Item;
  #468 = Methodref          #469.#470     // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
  #469 = Class              #471          // java/util/Arrays
  #470 = NameAndType        #472:#473     // asList:([Ljava/lang/Object;)Ljava/util/List;
  #471 = Utf8               java/util/Arrays
  #472 = Utf8               asList
  #473 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #474 = InterfaceMethodref #176.#129     // java/util/List.stream:()Ljava/util/stream/Stream;
  #475 = InvokeDynamic      #7:#136       // #7:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #476 = String             #477          // bypass admin_find item
  #477 = Utf8               bypass admin_find item
  #478 = Methodref          #115.#189     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #479 = Class              #480          // ext/mods/gameserver/model/item/kind/Item
  #480 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #481 = Methodref          #479.#482     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #482 = NameAndType        #483:#15      // getIcon:()Ljava/lang/String;
  #483 = Utf8               getIcon
  #484 = InvokeDynamic      #8:#485       // #8:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #485 = NameAndType        #225:#486     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #486 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #487 = String             #488          // <td width=160>
  #488 = Utf8               <td width=160>
  #489 = Methodref          #479.#87      // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #490 = Methodref          #59.#491      // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #491 = NameAndType        #492:#493     // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #492 = Utf8               trimAndDress
  #493 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #494 = String             #495          // <br1><font color=\"B09878\">Item Id:</font> <font color=BDB76B>
  #495 = Utf8               <br1><font color=\"B09878\">Item Id:</font> <font color=BDB76B>
  #496 = Methodref          #479.#497     // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
  #497 = NameAndType        #498:#27      // getItemId:()I
  #498 = Utf8               getItemId
  #499 = Methodref          #479.#500     // ext/mods/gameserver/model/item/kind/Item.isQuestItem:()Z
  #500 = NameAndType        #501:#197     // isQuestItem:()Z
  #501 = Utf8               isQuestItem
  #502 = String             #503          //  (Quest)
  #503 = Utf8                (Quest)
  #504 = String             #505          // </font></td>
  #505 = Utf8               </font></td>
  #506 = String             #507          // <td><edit var=\"amount_
  #507 = Utf8               <td><edit var=\"amount_
  #508 = String             #509          // \" width=52 type=number></td>
  #509 = Utf8               \" width=52 type=number></td>
  #510 = String             #511          // <td><button action=\"bypass admin_give
  #511 = Utf8               <td><button action=\"bypass admin_give
  #512 = String             #513          //  $amount_
  #513 = Utf8                $amount_
  #514 = String             #515          // \" width=32 height=32 back=L2UI_CH3.mapbutton_zoomin2 fore=L2UI_CH3.mapbutton_zoomin1></td>
  #515 = Utf8               \" width=32 height=32 back=L2UI_CH3.mapbutton_zoomin2 fore=L2UI_CH3.mapbutton_zoomin1></td>
  #516 = InvokeDynamic      #9:#224       // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #517 = Methodref          #518.#519     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #518 = Class              #520          // ext/mods/gameserver/data/xml/NpcData
  #519 = NameAndType        #121:#521     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #520 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #521 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #522 = Methodref          #518.#523     // ext/mods/gameserver/data/xml/NpcData.getTemplates:()Ljava/util/Collection;
  #523 = NameAndType        #466:#126     // getTemplates:()Ljava/util/Collection;
  #524 = InvokeDynamic      #10:#136      // #10:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #525 = InvokeDynamic      #11:#393      // #11:apply:()Ljava/util/function/Function;
  #526 = InterfaceMethodref #527.#528     // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #527 = Class              #529          // java/util/Comparator
  #528 = NameAndType        #530:#531     // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #529 = Utf8               java/util/Comparator
  #530 = Utf8               comparing
  #531 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
  #532 = Methodref          #115.#533     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
  #533 = NameAndType        #5:#534       // "<init>":(Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
  #534 = Utf8               (Ljava/util/stream/Stream;IILjava/util/function/Predicate;Ljava/util/Comparator;)V
  #535 = String             #536          // bypass admin_find npc
  #536 = Utf8               bypass admin_find npc
  #537 = Class              #538          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #538 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #539 = String             #540          // <td width=216 height=41><font color=\"B09878\">
  #540 = Utf8               <td width=216 height=41><font color=\"B09878\">
  #541 = Methodref          #537.#542     // ext/mods/gameserver/model/actor/template/NpcTemplate.getTitle:()Ljava/lang/String;
  #542 = NameAndType        #543:#15      // getTitle:()Ljava/lang/String;
  #543 = Utf8               getTitle
  #544 = String             #545          // </font><br1>
  #545 = Utf8               </font><br1>
  #546 = Methodref          #537.#87      // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #547 = String             #548          // <td><button action=\"bypass admin_spawn
  #548 = Utf8               <td><button action=\"bypass admin_spawn
  #549 = Methodref          #537.#550     // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #550 = NameAndType        #551:#27      // getNpcId:()I
  #551 = Utf8               getNpcId
  #552 = String             #553          // <td><button action=\"bypass admin_list_spawns
  #553 = Utf8               <td><button action=\"bypass admin_list_spawns
  #554 = String             #555          // \" width=32 height=32 back=L2UI_CH3.mapicon_mark_light fore=L2UI_CH3.mapicon_mark></td>
  #555 = Utf8               \" width=32 height=32 back=L2UI_CH3.mapicon_mark_light fore=L2UI_CH3.mapicon_mark></td>
  #556 = InvokeDynamic      #12:#224      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #557 = String             #558          //
  #558 = Utf8
  #559 = Methodref          #19.#560      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #560 = NameAndType        #105:#561     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #561 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #562 = Methodref          #469.#563     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #563 = NameAndType        #131:#564     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #564 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #565 = InvokeDynamic      #13:#136      // #13:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
  #566 = InterfaceMethodref #161.#567     // java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
  #567 = NameAndType        #568:#569     // allMatch:(Ljava/util/function/Predicate;)Z
  #568 = Utf8               allMatch
  #569 = Utf8               (Ljava/util/function/Predicate;)Z
  #570 = Fieldref           #31.#571      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.ADMIN_COMMANDS:[Ljava/lang/String;
  #571 = NameAndType        #572:#573     // ADMIN_COMMANDS:[Ljava/lang/String;
  #572 = Utf8               ADMIN_COMMANDS
  #573 = Utf8               [Ljava/lang/String;
  #574 = Methodref          #19.#575      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #575 = NameAndType        #576:#577     // contains:(Ljava/lang/CharSequence;)Z
  #576 = Utf8               contains
  #577 = Utf8               (Ljava/lang/CharSequence;)Z
  #578 = Methodref          #19.#579      // java/lang/String.isEmpty:()Z
  #579 = NameAndType        #580:#197     // isEmpty:()Z
  #580 = Utf8               isEmpty
  #581 = Methodref          #31.#582      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.matches:(Ljava/lang/String;Ljava/lang/String;)Z
  #582 = NameAndType        #287:#583     // matches:(Ljava/lang/String;Ljava/lang/String;)Z
  #583 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
  #584 = Methodref          #179.#3       // java/util/ArrayList."<init>":()V
  #585 = Utf8               Code
  #586 = Utf8               LineNumberTable
  #587 = Utf8               LocalVariableTable
  #588 = Utf8               this
  #589 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminFind;
  #590 = Utf8               useAdminCommand
  #591 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #592 = Utf8               e
  #593 = Utf8               Ljava/lang/Exception;
  #594 = Utf8               multibox
  #595 = Utf8               I
  #596 = Utf8               paramCount
  #597 = Utf8               param
  #598 = Utf8               Ljava/lang/String;
  #599 = Utf8               nameIpOrPage
  #600 = Utf8               search
  #601 = Utf8               command
  #602 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #603 = Utf8               st
  #604 = Utf8               Ljava/util/StringTokenizer;
  #605 = Utf8               StackMapTable
  #606 = Utf8               isOffline
  #607 = Utf8               Z
  #608 = Utf8               targetPlayer
  #609 = Utf8               page
  #610 = Utf8               list
  #611 = Utf8               Lext/mods/commons/data/Pagination;
  #612 = Utf8               onlinePlayers
  #613 = Utf8               Ljava/util/List;
  #614 = Utf8               offlinePlayers
  #615 = Utf8               allPlayers
  #616 = Utf8               html
  #617 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #618 = Utf8               LocalVariableTypeTable
  #619 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/actor/Player;>;
  #620 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #621 = Class              #622          // "[Ljava/lang/Object;"
  #622 = Utf8               [Ljava/lang/Object;
  #623 = Utf8               client
  #624 = Utf8               Lext/mods/gameserver/network/GameClient;
  #625 = Utf8               worldPlayer
  #626 = Utf8               ipAdress
  #627 = Utf8               findDisconnected
  #628 = Utf8               charactersFound
  #629 = Utf8               sb
  #630 = Utf8               Ljava/lang/StringBuilder;
  #631 = Utf8               Exceptions
  #632 = Utf8               name
  #633 = Utf8               count
  #634 = Utf8               Ljava/lang/Integer;
  #635 = Utf8               dualboxIP
  #636 = Utf8               ips
  #637 = Utf8               Ljava/util/Map;
  #638 = Utf8               dualboxIPs
  #639 = Utf8               keys
  #640 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;>;
  #641 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;
  #642 = Utf8               Ljava/util/List<Ljava/lang/String;>;
  #643 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #644 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/item/kind/Item;>;
  #645 = Utf8               template
  #646 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #647 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #648 = Utf8               getAdminCommandList
  #649 = Utf8               ()[Ljava/lang/String;
  #650 = Utf8               lambda$matches$0
  #651 = Utf8               result
  #652 = Utf8               lambda$listNpcs$0
  #653 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #654 = Utf8               lambda$listItems$0
  #655 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/item/kind/Item;)Z
  #656 = Utf8               lambda$listDualbox$0
  #657 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #658 = Utf8               k
  #659 = Utf8               lambda$listPlayers$2
  #660 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #661 = Utf8               p
  #662 = Utf8               lambda$listPlayers$1
  #663 = Utf8               lambda$listPlayers$0
  #664 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #665 = Utf8               <clinit>
  #666 = Utf8               SourceFile
  #667 = Utf8               AdminFind.java
  #668 = Utf8               BootstrapMethods
  #669 = MethodType         #47           //  (Ljava/lang/Object;)Z
  #670 = MethodHandle       6:#671        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #671 = Methodref          #31.#672      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #672 = NameAndType        #663:#664     // lambda$listPlayers$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #673 = MethodType         #660          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #674 = MethodHandle       6:#675        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
  #675 = Methodref          #31.#676      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
  #676 = NameAndType        #662:#660     // lambda$listPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
  #677 = MethodHandle       6:#678        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$2:(Lext/mods/gameserver/model/actor/Player;)Z
  #678 = Methodref          #31.#679      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$2:(Lext/mods/gameserver/model/actor/Player;)Z
  #679 = NameAndType        #659:#660     // lambda$listPlayers$2:(Lext/mods/gameserver/model/actor/Player;)Z
  #680 = String             #681          // <font color=\"LEVEL\">[OFFLINE] \u0001</font>
  #681 = Utf8               <font color=\"LEVEL\">[OFFLINE] \u0001</font>
  #682 = String             #683          // bypass admin_find player %page% \u0001
  #683 = Utf8               bypass admin_find player %page% \u0001
  #684 = MethodType         #409          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #685 = MethodHandle       6:#686        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listDualbox$0:(Ljava/lang/String;)Ljava/util/List;
  #686 = Methodref          #31.#687      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listDualbox$0:(Ljava/lang/String;)Ljava/util/List;
  #687 = NameAndType        #656:#657     // lambda$listDualbox$0:(Ljava/lang/String;)Ljava/util/List;
  #688 = MethodType         #657          //  (Ljava/lang/String;)Ljava/util/List;
  #689 = MethodHandle       9:#690        // REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #690 = InterfaceMethodref #425.#691     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #691 = NameAndType        #692:#201     // getKey:()Ljava/lang/Object;
  #692 = Utf8               getKey
  #693 = MethodType         #694          //  (Ljava/util/Map$Entry;)Ljava/lang/String;
  #694 = Utf8               (Ljava/util/Map$Entry;)Ljava/lang/String;
  #695 = MethodHandle       6:#696        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listItems$0:(Ljava/lang/String;Lext/mods/gameserver/model/item/kind/Item;)Z
  #696 = Methodref          #31.#697      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listItems$0:(Ljava/lang/String;Lext/mods/gameserver/model/item/kind/Item;)Z
  #697 = NameAndType        #654:#655     // lambda$listItems$0:(Ljava/lang/String;Lext/mods/gameserver/model/item/kind/Item;)Z
  #698 = MethodType         #699          //  (Lext/mods/gameserver/model/item/kind/Item;)Z
  #699 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Z
  #700 = String             #701          // <td width=36 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=-5><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  #701 = Utf8               <td width=36 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=-5><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  #702 = String             #703          // bypass admin_find item %page% \u0001
  #703 = Utf8               bypass admin_find item %page% \u0001
  #704 = MethodHandle       6:#705        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #705 = Methodref          #31.#706      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #706 = NameAndType        #652:#653     // lambda$listNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #707 = MethodType         #708          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #708 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #709 = MethodHandle       5:#546        // REF_invokeVirtual ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #710 = MethodType         #711          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/String;
  #711 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/String;
  #712 = String             #713          // bypass admin_find npc %page% \u0001
  #713 = Utf8               bypass admin_find npc %page% \u0001
  #714 = MethodHandle       6:#715        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #715 = Methodref          #31.#716      // ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #716 = NameAndType        #650:#583     // lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
  #717 = MethodType         #23           //  (Ljava/lang/String;)Z
  #718 = MethodHandle       6:#719        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #719 = Methodref          #720.#721     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #720 = Class              #722          // java/lang/invoke/LambdaMetafactory
  #721 = NameAndType        #723:#724     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #722 = Utf8               java/lang/invoke/LambdaMetafactory
  #723 = Utf8               metafactory
  #724 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #725 = MethodHandle       6:#726        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #726 = Methodref          #727.#728     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #727 = Class              #729          // java/lang/invoke/StringConcatFactory
  #728 = NameAndType        #225:#730     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #729 = Utf8               java/lang/invoke/StringConcatFactory
  #730 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #731 = Utf8               InnerClasses
  #732 = Utf8               Entry
  #733 = Class              #734          // java/lang/invoke/MethodHandles$Lookup
  #734 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #735 = Class              #736          // java/lang/invoke/MethodHandles
  #736 = Utf8               java/lang/invoke/MethodHandles
  #737 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminFind();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminFind;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=11, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        13: pop
        14: aload_1
        15: ldc           #16                 // String admin_find
        17: invokevirtual #18                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        20: ifeq          641
        23: aload_3
        24: invokevirtual #24                 // Method java/util/StringTokenizer.countTokens:()I
        27: istore        4
        29: iload         4
        31: iconst_1
        32: if_icmpge     43
        35: aload_2
        36: iconst_1
        37: ldc           #28                 // String
        39: invokestatic  #30                 // Method listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
        42: return
        43: aload_3
        44: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        47: astore        5
        49: iload         4
        51: iconst_1
        52: if_icmple     62
        55: aload_3
        56: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        59: goto          64
        62: ldc           #28                 // String
        64: astore        6
        66: iload         4
        68: iconst_2
        69: if_icmple     82
        72: aload_3
        73: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        76: invokevirtual #36                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
        79: goto          84
        82: ldc           #28                 // String
        84: astore        7
        86: aload         5
        88: astore        8
        90: iconst_m1
        91: istore        9
        93: aload         8
        95: invokevirtual #39                 // Method java/lang/String.hashCode:()I
        98: lookupswitch  { // 6

             -1177318867: 188

              -985752863: 156

                    3367: 172

                  109281: 236

                 3242771: 220

              1998562255: 204
                 default: 249
            }
       156: aload         8
       158: ldc           #42                 // String player
       160: invokevirtual #44                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       163: ifeq          249
       166: iconst_0
       167: istore        9
       169: goto          249
       172: aload         8
       174: ldc           #48                 // String ip
       176: invokevirtual #44                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       179: ifeq          249
       182: iconst_1
       183: istore        9
       185: goto          249
       188: aload         8
       190: ldc           #50                 // String account
       192: invokevirtual #44                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       195: ifeq          249
       198: iconst_2
       199: istore        9
       201: goto          249
       204: aload         8
       206: ldc           #52                 // String dualbox
       208: invokevirtual #44                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       211: ifeq          249
       214: iconst_3
       215: istore        9
       217: goto          249
       220: aload         8
       222: ldc           #54                 // String item
       224: invokevirtual #44                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       227: ifeq          249
       230: iconst_4
       231: istore        9
       233: goto          249
       236: aload         8
       238: ldc           #56                 // String npc
       240: invokevirtual #44                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       243: ifeq          249
       246: iconst_5
       247: istore        9
       249: iload         9
       251: tableswitch   { // 0 to 5

                       0: 288

                       1: 345

                       2: 378

                       3: 420

                       4: 459

                       5: 547
                 default: 635
            }
       288: iload         4
       290: iconst_2
       291: if_icmpge     302
       294: aload_2
       295: iconst_1
       296: ldc           #28                 // String
       298: invokestatic  #30                 // Method listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       301: return
       302: aload         6
       304: invokestatic  #58                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       307: ifeq          324
       310: aload_2
       311: aload         6
       313: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       316: aload         7
       318: invokestatic  #30                 // Method listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       321: goto          331
       324: aload_2
       325: iconst_1
       326: aload         6
       328: invokestatic  #30                 // Method listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       331: goto          641
       334: astore        10
       336: aload_2
       337: ldc           #71                 // String Usage: //find player name
       339: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       342: goto          641
       345: iload         4
       347: iconst_2
       348: if_icmpge     358
       351: aload_2
       352: ldc           #78                 // String 127.0.0.1
       354: invokestatic  #80                 // Method listPlayersPerIp:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       357: return
       358: aload_2
       359: aload         6
       361: invokestatic  #80                 // Method listPlayersPerIp:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       364: goto          641
       367: astore        10
       369: aload_2
       370: ldc           #84                 // String Usage: //find ip 111.222.333.444
       372: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       375: goto          641
       378: iload         4
       380: iconst_2
       381: if_icmpge     393
       384: aload_2
       385: aload_2
       386: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       389: invokestatic  #89                 // Method listPlayersPerAccount:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       392: return
       393: aload_2
       394: aload         6
       396: invokestatic  #89                 // Method listPlayersPerAccount:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       399: goto          641
       402: astore        10
       404: aload_2
       405: ldc           #92                 // String Usage: //find account name
       407: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       410: aload_2
       411: iconst_1
       412: ldc           #28                 // String
       414: invokestatic  #30                 // Method listPlayers:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       417: goto          641
       420: aload         6
       422: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       425: istore        10
       427: iload         10
       429: iconst_1
       430: if_icmpge     440
       433: aload_2
       434: ldc           #94                 // String Usage: //find dualbox [number > 0]
       436: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       439: return
       440: aload_2
       441: iload         10
       443: invokestatic  #96                 // Method listDualbox:(Lext/mods/gameserver/model/actor/Player;I)V
       446: goto          641
       449: astore        10
       451: aload_2
       452: iconst_2
       453: invokestatic  #96                 // Method listDualbox:(Lext/mods/gameserver/model/actor/Player;I)V
       456: goto          641
       459: iload         4
       461: iconst_2
       462: if_icmpge     473
       465: aload_2
       466: iconst_1
       467: ldc           #28                 // String
       469: invokestatic  #100                // Method listItems:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       472: return
       473: aload         6
       475: invokestatic  #58                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       478: ifeq          505
       481: aload_2
       482: aload         6
       484: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       487: aload_1
       488: aload         6
       490: iconst_2
       491: invokevirtual #103                // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       494: iconst_1
       495: aaload
       496: invokevirtual #107                // Method java/lang/String.trim:()Ljava/lang/String;
       499: invokestatic  #100                // Method listItems:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       502: goto          522
       505: aload_2
       506: iconst_1
       507: aload_1
       508: aload         5
       510: iconst_2
       511: invokevirtual #103                // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       514: iconst_1
       515: aaload
       516: invokevirtual #107                // Method java/lang/String.trim:()Ljava/lang/String;
       519: invokestatic  #100                // Method listItems:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       522: goto          641
       525: astore        10
       527: aload_2
       528: iconst_1
       529: aload_1
       530: aload         5
       532: iconst_2
       533: invokevirtual #103                // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       536: iconst_1
       537: aaload
       538: invokevirtual #107                // Method java/lang/String.trim:()Ljava/lang/String;
       541: invokestatic  #100                // Method listItems:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       544: goto          641
       547: iload         4
       549: iconst_2
       550: if_icmpge     561
       553: aload_2
       554: iconst_1
       555: ldc           #28                 // String
       557: invokestatic  #110                // Method listNpcs:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       560: return
       561: aload         6
       563: invokestatic  #58                 // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       566: ifeq          593
       569: aload_2
       570: aload         6
       572: invokestatic  #63                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       575: aload_1
       576: aload         6
       578: iconst_2
       579: invokevirtual #103                // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       582: iconst_1
       583: aaload
       584: invokevirtual #107                // Method java/lang/String.trim:()Ljava/lang/String;
       587: invokestatic  #110                // Method listNpcs:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       590: goto          610
       593: aload_2
       594: iconst_1
       595: aload_1
       596: aload         5
       598: iconst_2
       599: invokevirtual #103                // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       602: iconst_1
       603: aaload
       604: invokevirtual #107                // Method java/lang/String.trim:()Ljava/lang/String;
       607: invokestatic  #110                // Method listNpcs:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       610: goto          641
       613: astore        10
       615: aload_2
       616: iconst_1
       617: aload_1
       618: aload         5
       620: iconst_2
       621: invokevirtual #103                // Method java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
       624: iconst_1
       625: aaload
       626: invokevirtual #107                // Method java/lang/String.trim:()Ljava/lang/String;
       629: invokestatic  #110                // Method listNpcs:(Lext/mods/gameserver/model/actor/Player;ILjava/lang/String;)V
       632: goto          641
       635: aload_2
       636: ldc           #113                // String Usage: //find [account|dualbox|ip|item|npc|player name/id]
       638: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       641: return
      Exception table:
         from    to  target type
           302   331   334   Class java/lang/Exception
           358   364   367   Class java/lang/Exception
           393   399   402   Class java/lang/Exception
           420   439   449   Class java/lang/Exception
           440   446   449   Class java/lang/Exception
           473   522   525   Class java/lang/Exception
           561   610   613   Class java/lang/Exception
      LineNumberTable:
        line 54: 0
        line 55: 9
        line 57: 14
        line 59: 23
        line 60: 29
        line 62: 35
        line 63: 42
        line 66: 43
        line 67: 49
        line 68: 66
        line 70: 86
        line 73: 288
        line 75: 294
        line 76: 301
        line 81: 302
        line 82: 310
        line 84: 324
        line 89: 331
        line 86: 334
        line 88: 336
        line 90: 342
        line 93: 345
        line 95: 351
        line 96: 357
        line 101: 358
        line 106: 364
        line 103: 367
        line 105: 369
        line 107: 375
        line 110: 378
        line 112: 384
        line 113: 392
        line 118: 393
        line 124: 399
        line 120: 402
        line 122: 404
        line 123: 410
        line 125: 417
        line 130: 420
        line 131: 427
        line 133: 433
        line 134: 439
        line 137: 440
        line 142: 446
        line 139: 449
        line 141: 451
        line 143: 456
        line 146: 459
        line 148: 465
        line 149: 472
        line 154: 473
        line 155: 481
        line 157: 505
        line 162: 522
        line 159: 525
        line 161: 527
        line 163: 544
        line 166: 547
        line 168: 553
        line 169: 560
        line 174: 561
        line 175: 569
        line 177: 593
        line 182: 610
        line 179: 613
        line 181: 615
        line 183: 632
        line 186: 635
        line 190: 641
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          336       6    10     e   Ljava/lang/Exception;
          369       6    10     e   Ljava/lang/Exception;
          404      13    10     e   Ljava/lang/Exception;
          427      19    10 multibox   I
          451       5    10     e   Ljava/lang/Exception;
          527      17    10     e   Ljava/lang/Exception;
          615      17    10     e   Ljava/lang/Exception;
           29     612     4 paramCount   I
           49     592     5 param   Ljava/lang/String;
           66     575     6 nameIpOrPage   Ljava/lang/String;
           86     555     7 search   Ljava/lang/String;
            0     642     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminFind;
            0     642     1 command   Ljava/lang/String;
            0     642     2 player   Lext/mods/gameserver/model/actor/Player;
            9     633     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 38
        frame_type = 253 /* append */
          offset_delta = 43
          locals = [ class java/util/StringTokenizer, int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 71
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 38 /* same */
        frame_type = 13 /* same */
        frame_type = 21 /* same */
        frame_type = 6 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 12 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */
        frame_type = 14 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminFind, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, int, class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 9 /* same */
        frame_type = 13 /* same */
        frame_type = 31 /* same */
        frame_type = 16 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */
        frame_type = 13 /* same */
        frame_type = 31 /* same */
        frame_type = 16 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminFind, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer ]
          stack = []

  public static boolean matches(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #36                 // Method java/lang/String.toLowerCase:()Ljava/lang/String;
         4: ldc_w         #557                // String
         7: invokevirtual #559                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        10: invokestatic  #562                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        13: aload_0
        14: invokedynamic #565,  0            // InvokeDynamic #13:test:(Ljava/lang/String;)Ljava/util/function/Predicate;
        19: invokeinterface #566,  2          // InterfaceMethod java/util/stream/Stream.allMatch:(Ljava/util/function/Predicate;)Z
        24: ireturn
      LineNumberTable:
        line 405: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  name   Ljava/lang/String;
            0      25     1 search   Ljava/lang/String;

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #570                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 411: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminFind;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #19                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #16                 // String admin_find
         8: aastore
         9: putstatic     #570                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 46: 0
}
SourceFile: "AdminFind.java"
BootstrapMethods:
  0: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #669 (Ljava/lang/Object;)Z
      #670 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
      #673 (Lext/mods/gameserver/model/actor/Player;)Z
  1: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #669 (Ljava/lang/Object;)Z
      #674 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$1:(Lext/mods/gameserver/model/actor/Player;)Z
      #673 (Lext/mods/gameserver/model/actor/Player;)Z
  2: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #669 (Ljava/lang/Object;)Z
      #677 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listPlayers$2:(Lext/mods/gameserver/model/actor/Player;)Z
      #673 (Lext/mods/gameserver/model/actor/Player;)Z
  3: #725 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #680 <font color=\"LEVEL\">[OFFLINE] \u0001</font>
  4: #725 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #682 bypass admin_find player %page% \u0001
  5: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #684 (Ljava/lang/Object;)Ljava/lang/Object;
      #685 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listDualbox$0:(Ljava/lang/String;)Ljava/util/List;
      #688 (Ljava/lang/String;)Ljava/util/List;
  6: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #684 (Ljava/lang/Object;)Ljava/lang/Object;
      #689 REF_invokeInterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
      #693 (Ljava/util/Map$Entry;)Ljava/lang/String;
  7: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #669 (Ljava/lang/Object;)Z
      #695 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listItems$0:(Ljava/lang/String;Lext/mods/gameserver/model/item/kind/Item;)Z
      #698 (Lext/mods/gameserver/model/item/kind/Item;)Z
  8: #725 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #700 <td width=36 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=-5><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  9: #725 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #702 bypass admin_find item %page% \u0001
  10: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #669 (Ljava/lang/Object;)Z
      #704 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$listNpcs$0:(Ljava/lang/String;Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
      #707 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  11: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #684 (Ljava/lang/Object;)Ljava/lang/Object;
      #709 REF_invokeVirtual ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
      #710 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/String;
  12: #725 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #712 bypass admin_find npc %page% \u0001
  13: #718 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #669 (Ljava/lang/Object;)Z
      #714 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminFind.lambda$matches$0:(Ljava/lang/String;Ljava/lang/String;)Z
      #717 (Ljava/lang/String;)Z
InnerClasses:
  public static #732= #425 of #376;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #737= #733 of #735; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
