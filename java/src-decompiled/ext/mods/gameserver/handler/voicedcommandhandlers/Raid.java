// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Raid
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Raid.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Raid.class
  Last modified 9 de jul de 2026; size 16632 bytes
  MD5 checksum 7f746188bd7d3dfbeacf743e97d31e26
  Compiled from "Raid.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Raid implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #57                         // ext/mods/gameserver/handler/voicedcommandhandlers/Raid
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 7, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.RAID_BOSS_LIST:[I
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // RAID_BOSS_LIST:[I
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               RAID_BOSS_LIST
   #12 = Utf8               [I
   #13 = InterfaceMethodref #14.#15       // java/util/stream/IntStream.of:([I)Ljava/util/stream/IntStream;
   #14 = Class              #16           // java/util/stream/IntStream
   #15 = NameAndType        #17:#18       // of:([I)Ljava/util/stream/IntStream;
   #16 = Utf8               java/util/stream/IntStream
   #17 = Utf8               of
   #18 = Utf8               ([I)Ljava/util/stream/IntStream;
   #19 = InterfaceMethodref #14.#20       // java/util/stream/IntStream.boxed:()Ljava/util/stream/Stream;
   #20 = NameAndType        #21:#22       // boxed:()Ljava/util/stream/Stream;
   #21 = Utf8               boxed
   #22 = Utf8               ()Ljava/util/stream/Stream;
   #23 = InvokeDynamic      #0:#24        // #0:apply:()Ljava/util/function/Function;
   #24 = NameAndType        #25:#26       // apply:()Ljava/util/function/Function;
   #25 = Utf8               apply
   #26 = Utf8               ()Ljava/util/function/Function;
   #27 = InterfaceMethodref #28.#29       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #28 = Class              #30           // java/util/stream/Stream
   #29 = NameAndType        #31:#32       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #30 = Utf8               java/util/stream/Stream
   #31 = Utf8               map
   #32 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #33 = InvokeDynamic      #1:#34        // #1:test:()Ljava/util/function/Predicate;
   #34 = NameAndType        #35:#36       // test:()Ljava/util/function/Predicate;
   #35 = Utf8               test
   #36 = Utf8               ()Ljava/util/function/Predicate;
   #37 = InterfaceMethodref #28.#38       // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #38 = NameAndType        #39:#40       // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #39 = Utf8               filter
   #40 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #41 = InvokeDynamic      #2:#24        // #2:apply:()Ljava/util/function/Function;
   #42 = InterfaceMethodref #43.#44       // java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #43 = Class              #45           // java/util/Comparator
   #44 = NameAndType        #46:#47       // comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
   #45 = Utf8               java/util/Comparator
   #46 = Utf8               comparing
   #47 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
   #48 = InterfaceMethodref #28.#49       // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #49 = NameAndType        #50:#51       // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #50 = Utf8               sorted
   #51 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #52 = InterfaceMethodref #28.#53       // java/util/stream/Stream.toList:()Ljava/util/List;
   #53 = NameAndType        #54:#55       // toList:()Ljava/util/List;
   #54 = Utf8               toList
   #55 = Utf8               ()Ljava/util/List;
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.bosses:Ljava/util/List;
   #57 = Class              #59           // ext/mods/gameserver/handler/voicedcommandhandlers/Raid
   #58 = NameAndType        #60:#61       // bosses:Ljava/util/List;
   #59 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Raid
   #60 = Utf8               bosses
   #61 = Utf8               Ljava/util/List;
   #62 = Class              #63           // java/util/StringTokenizer
   #63 = Utf8               java/util/StringTokenizer
   #64 = String             #65           //
   #65 = Utf8
   #66 = Methodref          #62.#67       // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #67 = NameAndType        #5:#68        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #68 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #69 = Methodref          #62.#70       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #70 = NameAndType        #71:#72       // nextToken:()Ljava/lang/String;
   #71 = Utf8               nextToken
   #72 = Utf8               ()Ljava/lang/String;
   #73 = Methodref          #62.#74       // java/util/StringTokenizer.hasMoreTokens:()Z
   #74 = NameAndType        #75:#76       // hasMoreTokens:()Z
   #75 = Utf8               hasMoreTokens
   #76 = Utf8               ()Z
   #77 = String             #78           // tele
   #78 = Utf8               tele
   #79 = Methodref          #80.#81       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #80 = Class              #82           // java/lang/String
   #81 = NameAndType        #83:#84       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #82 = Utf8               java/lang/String
   #83 = Utf8               equalsIgnoreCase
   #84 = Utf8               (Ljava/lang/String;)Z
   #85 = Methodref          #86.#87       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #86 = Class              #88           // java/lang/Integer
   #87 = NameAndType        #89:#90       // parseInt:(Ljava/lang/String;)I
   #88 = Utf8               java/lang/Integer
   #89 = Utf8               parseInt
   #90 = Utf8               (Ljava/lang/String;)I
   #91 = Methodref          #57.#92       // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.handleTeleport:(Lext/mods/gameserver/model/actor/Player;I)V
   #92 = NameAndType        #93:#94       // handleTeleport:(Lext/mods/gameserver/model/actor/Player;I)V
   #93 = Utf8               handleTeleport
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #95 = Methodref          #57.#96       // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.showRaidHtm:(Lext/mods/gameserver/model/actor/Player;I)V
   #96 = NameAndType        #97:#94       // showRaidHtm:(Lext/mods/gameserver/model/actor/Player;I)V
   #97 = Utf8               showRaidHtm
   #98 = Class              #99           // java/lang/Exception
   #99 = Utf8               java/lang/Exception
  #100 = Fieldref           #57.#101      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.LOGGER:Lext/mods/commons/logging/CLogger;
  #101 = NameAndType        #102:#103     // LOGGER:Lext/mods/commons/logging/CLogger;
  #102 = Utf8               LOGGER
  #103 = Utf8               Lext/mods/commons/logging/CLogger;
  #104 = Methodref          #105.#106     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
  #105 = Class              #107          // ext/mods/commons/logging/CLogger
  #106 = NameAndType        #108:#109     // error:(Ljava/lang/Object;)V
  #107 = Utf8               ext/mods/commons/logging/CLogger
  #108 = Utf8               error
  #109 = Utf8               (Ljava/lang/Object;)V
  #110 = Fieldref           #8.#111       // ext/mods/Config.SHOW_RAID_HTM:Z
  #111 = NameAndType        #112:#113     // SHOW_RAID_HTM:Z
  #112 = Utf8               SHOW_RAID_HTM
  #113 = Utf8               Z
  #114 = Methodref          #115.#116     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #115 = Class              #117          // ext/mods/gameserver/model/actor/Player
  #116 = NameAndType        #118:#119     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #117 = Utf8               ext/mods/gameserver/model/actor/Player
  #118 = Utf8               getSysString
  #119 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #120 = Methodref          #115.#121     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #121 = NameAndType        #122:#123     // sendMessage:(Ljava/lang/String;)V
  #122 = Utf8               sendMessage
  #123 = Utf8               (Ljava/lang/String;)V
  #124 = Class              #125          // ext/mods/commons/data/Pagination
  #125 = Utf8               ext/mods/commons/data/Pagination
  #126 = InterfaceMethodref #127.#128     // java/util/List.stream:()Ljava/util/stream/Stream;
  #127 = Class              #129          // java/util/List
  #128 = NameAndType        #130:#22      // stream:()Ljava/util/stream/Stream;
  #129 = Utf8               java/util/List
  #130 = Utf8               stream
  #131 = Methodref          #124.#132     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #132 = NameAndType        #5:#133       // "<init>":(Ljava/util/stream/Stream;II)V
  #133 = Utf8               (Ljava/util/stream/Stream;II)V
  #134 = String             #135          // <html><title>Raid Boss Spawn Info</title><body>
  #135 = Utf8               <html><title>Raid Boss Spawn Info</title><body>
  #136 = Methodref          #124.#137     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #137 = NameAndType        #138:#139     // append:([Ljava/lang/Object;)V
  #138 = Utf8               append
  #139 = Utf8               ([Ljava/lang/Object;)V
  #140 = String             #141          // <center><br>
  #141 = Utf8               <center><br>
  #142 = Methodref          #124.#143     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #143 = NameAndType        #144:#145     // iterator:()Ljava/util/Iterator;
  #144 = Utf8               iterator
  #145 = Utf8               ()Ljava/util/Iterator;
  #146 = InterfaceMethodref #147.#148     // java/util/Iterator.hasNext:()Z
  #147 = Class              #149          // java/util/Iterator
  #148 = NameAndType        #150:#76      // hasNext:()Z
  #149 = Utf8               java/util/Iterator
  #150 = Utf8               hasNext
  #151 = InterfaceMethodref #147.#152     // java/util/Iterator.next:()Ljava/lang/Object;
  #152 = NameAndType        #153:#154     // next:()Ljava/lang/Object;
  #153 = Utf8               next
  #154 = Utf8               ()Ljava/lang/Object;
  #155 = Class              #156          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #156 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #157 = Methodref          #155.#158     // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #158 = NameAndType        #159:#72      // getName:()Ljava/lang/String;
  #159 = Utf8               getName
  #160 = Methodref          #80.#161      // java/lang/String.length:()I
  #161 = NameAndType        #162:#163     // length:()I
  #162 = Utf8               length
  #163 = Utf8               ()I
  #164 = Methodref          #80.#165      // java/lang/String.substring:(II)Ljava/lang/String;
  #165 = NameAndType        #166:#167     // substring:(II)Ljava/lang/String;
  #166 = Utf8               substring
  #167 = Utf8               (II)Ljava/lang/String;
  #168 = InvokeDynamic      #3:#169       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #169 = NameAndType        #170:#171     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #170 = Utf8               makeConcatWithConstants
  #171 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #172 = Fieldref           #8.#173       // ext/mods/Config.RAID_BOSS_TELEPORT_ENABLED:Z
  #173 = NameAndType        #174:#113     // RAID_BOSS_TELEPORT_ENABLED:Z
  #174 = Utf8               RAID_BOSS_TELEPORT_ENABLED
  #175 = Methodref          #155.#176     // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #176 = NameAndType        #177:#163     // getNpcId:()I
  #177 = Utf8               getNpcId
  #178 = InvokeDynamic      #4:#179       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #179 = NameAndType        #170:#167     // makeConcatWithConstants:(II)Ljava/lang/String;
  #180 = String             #181          //
  #181 = Utf8
  #182 = Methodref          #183.#184     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #183 = Class              #185          // ext/mods/gameserver/data/manager/SpawnManager
  #184 = NameAndType        #186:#187     // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #185 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #186 = Utf8               getInstance
  #187 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #188 = Methodref          #183.#189     // ext/mods/gameserver/data/manager/SpawnManager.getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
  #189 = NameAndType        #190:#191     // getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
  #190 = Utf8               getSpawn
  #191 = Utf8               (I)Lext/mods/gameserver/model/spawn/ASpawn;
  #192 = Methodref          #193.#194     // ext/mods/gameserver/model/spawn/ASpawn.getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
  #193 = Class              #195          // ext/mods/gameserver/model/spawn/ASpawn
  #194 = NameAndType        #196:#197     // getSpawnData:()Lext/mods/gameserver/model/spawn/SpawnData;
  #195 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
  #196 = Utf8               getSpawnData
  #197 = Utf8               ()Lext/mods/gameserver/model/spawn/SpawnData;
  #198 = Methodref          #199.#200     // ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
  #199 = Class              #201          // ext/mods/gameserver/model/spawn/SpawnData
  #200 = NameAndType        #202:#203     // getRespawnTime:()J
  #201 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
  #202 = Utf8               getRespawnTime
  #203 = Utf8               ()J
  #204 = Methodref          #205.#206     // java/lang/System.currentTimeMillis:()J
  #205 = Class              #207          // java/lang/System
  #206 = NameAndType        #208:#203     // currentTimeMillis:()J
  #207 = Utf8               java/lang/System
  #208 = Utf8               currentTimeMillis
  #209 = String             #210          // <table width=280 height=22 bgcolor=000000><tr>
  #210 = Utf8               <table width=280 height=22 bgcolor=000000><tr>
  #211 = String             #212          // <table width=280><tr>
  #212 = Utf8               <table width=280><tr>
  #213 = String             #214          // <td width=\"140\" align=\"left\">
  #214 = Utf8               <td width=\"140\" align=\"left\">
  #215 = Methodref          #155.#216     // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #216 = NameAndType        #217:#218     // getLevel:()B
  #217 = Utf8               getLevel
  #218 = Utf8               ()B
  #219 = InvokeDynamic      #5:#220       // #5:makeConcatWithConstants:(B)Ljava/lang/String;
  #220 = NameAndType        #170:#221     // makeConcatWithConstants:(B)Ljava/lang/String;
  #221 = Utf8               (B)Ljava/lang/String;
  #222 = String             #223          // </td>
  #223 = Utf8               </td>
  #224 = Methodref          #57.#225      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.formatRemaining:(J)Ljava/lang/String;
  #225 = NameAndType        #226:#227     // formatRemaining:(J)Ljava/lang/String;
  #226 = Utf8               formatRemaining
  #227 = Utf8               (J)Ljava/lang/String;
  #228 = InvokeDynamic      #6:#169       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #229 = String             #230          // <td width=\"50\" align=\"center\">
  #230 = Utf8               <td width=\"50\" align=\"center\">
  #231 = String             #232          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #232 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #233 = InvokeDynamic      #7:#169       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #234 = Methodref          #124.#235     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #235 = NameAndType        #236:#237     // generateSpace:(I)V
  #236 = Utf8               generateSpace
  #237 = Utf8               (I)V
  #238 = String             #239          // bypass voiced_raid %page%
  #239 = Utf8               bypass voiced_raid %page%
  #240 = Methodref          #124.#241     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #241 = NameAndType        #242:#123     // generatePages:(Ljava/lang/String;)V
  #242 = Utf8               generatePages
  #243 = String             #244          // </body></html>
  #244 = Utf8               </body></html>
  #245 = Class              #246          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #246 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #247 = Methodref          #245.#248     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #248 = NameAndType        #5:#237       // "<init>":(I)V
  #249 = Methodref          #124.#250     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #250 = NameAndType        #251:#72      // getContent:()Ljava/lang/String;
  #251 = Utf8               getContent
  #252 = Methodref          #245.#253     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #253 = NameAndType        #254:#123     // setHtml:(Ljava/lang/String;)V
  #254 = Utf8               setHtml
  #255 = Methodref          #115.#256     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #256 = NameAndType        #257:#258     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #257 = Utf8               sendPacket
  #258 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #259 = String             #260          // 00D-00H-00M
  #260 = Utf8               00D-00H-00M
  #261 = Long               60000l
  #263 = Long               1440l
  #265 = Long               60l
  #267 = String             #268          // %02dD-%02dH-%02dM
  #268 = Utf8               %02dD-%02dH-%02dM
  #269 = Methodref          #270.#271     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #270 = Class              #272          // java/lang/Long
  #271 = NameAndType        #273:#274     // valueOf:(J)Ljava/lang/Long;
  #272 = Utf8               java/lang/Long
  #273 = Utf8               valueOf
  #274 = Utf8               (J)Ljava/lang/Long;
  #275 = Methodref          #80.#276      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #276 = NameAndType        #277:#278     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #277 = Utf8               format
  #278 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #279 = Methodref          #57.#280      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.canTeleport:(Lext/mods/gameserver/model/actor/Player;)Z
  #280 = NameAndType        #281:#282     // canTeleport:(Lext/mods/gameserver/model/actor/Player;)Z
  #281 = Utf8               canTeleport
  #282 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #283 = String             #284          // Não foi possível localizar o boss selecionado.
  #284 = Utf8               Não foi possível localizar o boss selecionado.
  #285 = Methodref          #57.#286      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.chargeTeleportFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #286 = NameAndType        #287:#282     // chargeTeleportFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #287 = Utf8               chargeTeleportFee
  #288 = Methodref          #57.#289      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.resolveBossLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
  #289 = NameAndType        #290:#291     // resolveBossLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
  #290 = Utf8               resolveBossLocation
  #291 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
  #292 = String             #293          // Não foi possível determinar a localização do boss selecionado.
  #293 = Utf8               Não foi possível determinar a localização do boss selecionado.
  #294 = Methodref          #57.#295      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.calculateTeleportLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #295 = NameAndType        #296:#297     // calculateTeleportLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #296 = Utf8               calculateTeleportLocation
  #297 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #298 = String             #299          // Não foi possível encontrar um ponto seguro para o teleporte.
  #299 = Utf8               Não foi possível encontrar um ponto seguro para o teleporte.
  #300 = Class              #301          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #301 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #302 = Methodref          #300.#303     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #303 = NameAndType        #5:#304       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #304 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #305 = Methodref          #115.#306     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #306 = NameAndType        #307:#258     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #307 = Utf8               broadcastPacket
  #308 = Class              #309          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #309 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #310 = Fieldref           #311.#312     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #311 = Class              #313          // ext/mods/gameserver/enums/GaugeColor
  #312 = NameAndType        #314:#315     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #313 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #314 = Utf8               BLUE
  #315 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #316 = Methodref          #308.#317     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #317 = NameAndType        #5:#318       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #318 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #319 = InvokeDynamic      #8:#320       // #8:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #320 = NameAndType        #321:#322     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #321 = Utf8               run
  #322 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #323 = Long               17000l
  #325 = Methodref          #326.#327     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #326 = Class              #328          // ext/mods/commons/pool/ThreadPool
  #327 = NameAndType        #329:#330     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #328 = Utf8               ext/mods/commons/pool/ThreadPool
  #329 = Utf8               schedule
  #330 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #331 = Methodref          #115.#332     // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #332 = NameAndType        #333:#76      // isDead:()Z
  #333 = Utf8               isDead
  #334 = String             #335          // Você não pode usar este teleporte enquanto está morto.
  #335 = Utf8               Você não pode usar este teleporte enquanto está morto.
  #336 = Methodref          #115.#337     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #337 = NameAndType        #338:#163     // getKarma:()I
  #338 = Utf8               getKarma
  #339 = String             #340          // Você não pode usar este teleporte enquanto está PK.
  #340 = Utf8               Você não pode usar este teleporte enquanto está PK.
  #341 = Methodref          #115.#342     // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #342 = NameAndType        #343:#76      // isInCombat:()Z
  #343 = Utf8               isInCombat
  #344 = String             #345          // Você não pode usar este teleporte em combate.
  #345 = Utf8               Você não pode usar este teleporte em combate.
  #346 = Methodref          #115.#347     // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #347 = NameAndType        #348:#349     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #348 = Utf8               getCast
  #349 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #350 = Methodref          #351.#352     // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #351 = Class              #353          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #352 = NameAndType        #354:#76      // isCastingNow:()Z
  #353 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #354 = Utf8               isCastingNow
  #355 = Methodref          #115.#356     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #356 = NameAndType        #357:#76      // isTeleporting:()Z
  #357 = Utf8               isTeleporting
  #358 = String             #359          // Aguarde sua ação atual terminar.
  #359 = Utf8               Aguarde sua ação atual terminar.
  #360 = Methodref          #115.#361     // ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
  #361 = NameAndType        #362:#363     // getDungeon:()Lext/mods/dungeon/Dungeon;
  #362 = Utf8               getDungeon
  #363 = Utf8               ()Lext/mods/dungeon/Dungeon;
  #364 = String             #365          // Você não pode usar este teleporte dentro de dungeons.
  #365 = Utf8               Você não pode usar este teleporte dentro de dungeons.
  #366 = Methodref          #115.#367     // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
  #367 = NameAndType        #368:#76      // isInTournament:()Z
  #368 = Utf8               isInTournament
  #369 = String             #370          // Você não pode usar este teleporte durante torneios.
  #370 = Utf8               Você não pode usar este teleporte durante torneios.
  #371 = Methodref          #372.#373     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #372 = Class              #374          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #373 = NameAndType        #186:#375     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #374 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #375 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #376 = Methodref          #372.#377     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #377 = NameAndType        #378:#76      // isStarted:()Z
  #378 = Utf8               isStarted
  #379 = Methodref          #115.#380     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #380 = NameAndType        #381:#163     // getObjectId:()I
  #381 = Utf8               getObjectId
  #382 = Methodref          #372.#383     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onEscapeUse:(I)Z
  #383 = NameAndType        #384:#385     // onEscapeUse:(I)Z
  #384 = Utf8               onEscapeUse
  #385 = Utf8               (I)Z
  #386 = Methodref          #387.#388     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #387 = Class              #389          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #388 = NameAndType        #186:#390     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #389 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #390 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #391 = Methodref          #387.#377     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #392 = Methodref          #387.#383     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
  #393 = Methodref          #394.#395     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #394 = Class              #396          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #395 = NameAndType        #186:#397     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #396 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #397 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #398 = Methodref          #394.#377     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #399 = Methodref          #394.#383     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
  #400 = Methodref          #401.#402     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #401 = Class              #403          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #402 = NameAndType        #186:#404     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #403 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #404 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #405 = Methodref          #401.#377     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #406 = Methodref          #401.#383     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
  #407 = Methodref          #115.#408     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #408 = NameAndType        #409:#76      // isInOlympiadMode:()Z
  #409 = Utf8               isInOlympiadMode
  #410 = Methodref          #115.#411     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #411 = NameAndType        #412:#76      // isInObserverMode:()Z
  #412 = Utf8               isInObserverMode
  #413 = Methodref          #115.#414     // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #414 = NameAndType        #415:#76      // isFestivalParticipant:()Z
  #415 = Utf8               isFestivalParticipant
  #416 = Methodref          #115.#417     // ext/mods/gameserver/model/actor/Player.isInJail:()Z
  #417 = NameAndType        #418:#76      // isInJail:()Z
  #418 = Utf8               isInJail
  #419 = Fieldref           #420.#421     // ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
  #420 = Class              #422          // ext/mods/gameserver/enums/ZoneId
  #421 = NameAndType        #423:#424     // BOSS:Lext/mods/gameserver/enums/ZoneId;
  #422 = Utf8               ext/mods/gameserver/enums/ZoneId
  #423 = Utf8               BOSS
  #424 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #425 = Methodref          #115.#426     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #426 = NameAndType        #427:#428     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #427 = Utf8               isInsideZone
  #428 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #429 = String             #430          // Seu estado atual não permite usar este teleporte.
  #430 = Utf8               Seu estado atual não permite usar este teleporte.
  #431 = Methodref          #432.#433     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #432 = Class              #434          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #433 = NameAndType        #186:#435     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #434 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #435 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #436 = Methodref          #432.#437     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #437 = NameAndType        #438:#282     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #438 = Utf8               isRegistered
  #439 = String             #440          // Você não pode usar este teleporte enquanto está registrado na Olimpíada.
  #440 = Utf8               Você não pode usar este teleporte enquanto está registrado na Olimpíada.
  #441 = Fieldref           #8.#442       // ext/mods/Config.BOSS_TELEPORT_MIN_RANGE:I
  #442 = NameAndType        #443:#444     // BOSS_TELEPORT_MIN_RANGE:I
  #443 = Utf8               BOSS_TELEPORT_MIN_RANGE
  #444 = Utf8               I
  #445 = Methodref          #446.#447     // java/lang/Math.max:(II)I
  #446 = Class              #448          // java/lang/Math
  #447 = NameAndType        #449:#450     // max:(II)I
  #448 = Utf8               java/lang/Math
  #449 = Utf8               max
  #450 = Utf8               (II)I
  #451 = Fieldref           #8.#452       // ext/mods/Config.BOSS_TELEPORT_MAX_RANGE:I
  #452 = NameAndType        #453:#444     // BOSS_TELEPORT_MAX_RANGE:I
  #453 = Utf8               BOSS_TELEPORT_MAX_RANGE
  #454 = Methodref          #446.#455     // java/lang/Math.toRadians:(D)D
  #455 = NameAndType        #456:#457     // toRadians:(D)D
  #456 = Utf8               toRadians
  #457 = Utf8               (D)D
  #458 = Methodref          #459.#460     // ext/mods/gameserver/model/location/Location.getX:()I
  #459 = Class              #461          // ext/mods/gameserver/model/location/Location
  #460 = NameAndType        #462:#163     // getX:()I
  #461 = Utf8               ext/mods/gameserver/model/location/Location
  #462 = Utf8               getX
  #463 = Methodref          #446.#464     // java/lang/Math.cos:(D)D
  #464 = NameAndType        #465:#457     // cos:(D)D
  #465 = Utf8               cos
  #466 = Methodref          #446.#467     // java/lang/Math.round:(D)J
  #467 = NameAndType        #468:#469     // round:(D)J
  #468 = Utf8               round
  #469 = Utf8               (D)J
  #470 = Methodref          #459.#471     // ext/mods/gameserver/model/location/Location.getY:()I
  #471 = NameAndType        #472:#163     // getY:()I
  #472 = Utf8               getY
  #473 = Methodref          #446.#474     // java/lang/Math.sin:(D)D
  #474 = NameAndType        #475:#457     // sin:(D)D
  #475 = Utf8               sin
  #476 = Methodref          #459.#477     // ext/mods/gameserver/model/location/Location.getZ:()I
  #477 = NameAndType        #478:#163     // getZ:()I
  #478 = Utf8               getZ
  #479 = Methodref          #480.#481     // ext/mods/gameserver/model/actor/move/MovementIntegration.getValidLocation:(IIIIII)Lext/mods/gameserver/model/location/Location;
  #480 = Class              #482          // ext/mods/gameserver/model/actor/move/MovementIntegration
  #481 = NameAndType        #483:#484     // getValidLocation:(IIIIII)Lext/mods/gameserver/model/location/Location;
  #482 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
  #483 = Utf8               getValidLocation
  #484 = Utf8               (IIIIII)Lext/mods/gameserver/model/location/Location;
  #485 = Methodref          #486.#487     // ext/mods/commons/random/Rnd.get:(II)I
  #486 = Class              #488          // ext/mods/commons/random/Rnd
  #487 = NameAndType        #489:#450     // get:(II)I
  #488 = Utf8               ext/mods/commons/random/Rnd
  #489 = Utf8               get
  #490 = Methodref          #193.#491     // ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #491 = NameAndType        #492:#493     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #492 = Utf8               getNpc
  #493 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #494 = Methodref          #495.#460     // ext/mods/gameserver/model/actor/Npc.getX:()I
  #495 = Class              #496          // ext/mods/gameserver/model/actor/Npc
  #496 = Utf8               ext/mods/gameserver/model/actor/Npc
  #497 = Methodref          #495.#471     // ext/mods/gameserver/model/actor/Npc.getY:()I
  #498 = Methodref          #495.#477     // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #499 = Methodref          #459.#500     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #500 = NameAndType        #5:#501       // "<init>":(III)V
  #501 = Utf8               (III)V
  #502 = Methodref          #199.#460     // ext/mods/gameserver/model/spawn/SpawnData.getX:()I
  #503 = Methodref          #199.#471     // ext/mods/gameserver/model/spawn/SpawnData.getY:()I
  #504 = Methodref          #199.#477     // ext/mods/gameserver/model/spawn/SpawnData.getZ:()I
  #505 = Class              #506          // ext/mods/gameserver/model/spawn/Spawn
  #506 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #507 = Methodref          #505.#508     // ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
  #508 = NameAndType        #509:#163     // getLocX:()I
  #509 = Utf8               getLocX
  #510 = Methodref          #505.#511     // ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
  #511 = NameAndType        #512:#163     // getLocY:()I
  #512 = Utf8               getLocY
  #513 = Methodref          #505.#514     // ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
  #514 = NameAndType        #515:#163     // getLocZ:()I
  #515 = Utf8               getLocZ
  #516 = Class              #517          // ext/mods/gameserver/model/spawn/MultiSpawn
  #517 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
  #518 = Methodref          #516.#519     // ext/mods/gameserver/model/spawn/MultiSpawn.getCoords:()[[I
  #519 = NameAndType        #520:#521     // getCoords:()[[I
  #520 = Utf8               getCoords
  #521 = Utf8               ()[[I
  #522 = Methodref          #57.#523      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.getClosestSpawnLocation:(Lext/mods/gameserver/model/actor/Player;[[I)Lext/mods/gameserver/model/location/Location;
  #523 = NameAndType        #524:#525     // getClosestSpawnLocation:(Lext/mods/gameserver/model/actor/Player;[[I)Lext/mods/gameserver/model/location/Location;
  #524 = Utf8               getClosestSpawnLocation
  #525 = Utf8               (Lext/mods/gameserver/model/actor/Player;[[I)Lext/mods/gameserver/model/location/Location;
  #526 = Methodref          #193.#527     // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #527 = NameAndType        #528:#529     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #528 = Utf8               getSpawnLocation
  #529 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #530 = Methodref          #531.#460     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #531 = Class              #532          // ext/mods/gameserver/model/location/SpawnLocation
  #532 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #533 = Methodref          #531.#471     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #534 = Methodref          #531.#477     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #535 = Long               9223372036854775807l
  #537 = Methodref          #115.#460     // ext/mods/gameserver/model/actor/Player.getX:()I
  #538 = Methodref          #115.#471     // ext/mods/gameserver/model/actor/Player.getY:()I
  #539 = Fieldref           #8.#540       // ext/mods/Config.BOSS_TELEPORT_ITEM_ID:I
  #540 = NameAndType        #541:#444     // BOSS_TELEPORT_ITEM_ID:I
  #541 = Utf8               BOSS_TELEPORT_ITEM_ID
  #542 = Fieldref           #8.#543       // ext/mods/Config.BOSS_TELEPORT_ITEM_COUNT:J
  #543 = NameAndType        #544:#545     // BOSS_TELEPORT_ITEM_COUNT:J
  #544 = Utf8               BOSS_TELEPORT_ITEM_COUNT
  #545 = Utf8               J
  #546 = Long               2147483647l
  #548 = String             #549          // Quantidade configurada inválida para o teleporte.
  #549 = Utf8               Quantidade configurada inválida para o teleporte.
  #550 = Methodref          #115.#551     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #551 = NameAndType        #552:#553     // destroyItemByItemId:(IIZ)Z
  #552 = Utf8               destroyItemByItemId
  #553 = Utf8               (IIZ)Z
  #554 = Fieldref           #57.#555      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.VOICED_COMMANDS:[Ljava/lang/String;
  #555 = NameAndType        #556:#557     // VOICED_COMMANDS:[Ljava/lang/String;
  #556 = Utf8               VOICED_COMMANDS
  #557 = Utf8               [Ljava/lang/String;
  #558 = Methodref          #115.#559     // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #559 = NameAndType        #560:#561     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #560 = Utf8               teleToLocation
  #561 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #562 = Methodref          #563.#564     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #563 = Class              #565          // ext/mods/gameserver/data/xml/NpcData
  #564 = NameAndType        #186:#566     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #565 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #566 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #567 = Methodref          #86.#568      // java/lang/Integer.intValue:()I
  #568 = NameAndType        #569:#163     // intValue:()I
  #569 = Utf8               intValue
  #570 = Methodref          #563.#571     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #571 = NameAndType        #572:#573     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #572 = Utf8               getTemplate
  #573 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #574 = Methodref          #575.#158     // java/lang/Class.getName:()Ljava/lang/String;
  #575 = Class              #576          // java/lang/Class
  #576 = Utf8               java/lang/Class
  #577 = Methodref          #105.#578     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #578 = NameAndType        #5:#123       // "<init>":(Ljava/lang/String;)V
  #579 = InterfaceMethodref #127.#580     // java/util/List.of:()Ljava/util/List;
  #580 = NameAndType        #17:#55       // of:()Ljava/util/List;
  #581 = String             #582          // raid
  #582 = Utf8               raid
  #583 = Class              #584          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #584 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #585 = Utf8               PAGE_LIMIT_15
  #586 = Utf8               ConstantValue
  #587 = Integer            15
  #588 = Utf8               SOE_VISUAL_SKILL_ID
  #589 = Integer            2040
  #590 = Utf8               SOE_VISUAL_SKILL_LEVEL
  #591 = Integer            1
  #592 = Utf8               CAST_TIME_MS
  #593 = Integer            17000
  #594 = Utf8               Signature
  #595 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #596 = Utf8               Code
  #597 = Utf8               LineNumberTable
  #598 = Utf8               LocalVariableTable
  #599 = Utf8               this
  #600 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Raid;
  #601 = Utf8               load
  #602 = Utf8               useVoicedCommand
  #603 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #604 = Utf8               npcId
  #605 = Utf8               token
  #606 = Utf8               Ljava/lang/String;
  #607 = Utf8               page
  #608 = Utf8               e
  #609 = Utf8               Ljava/lang/Exception;
  #610 = Utf8               command
  #611 = Utf8               player
  #612 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #613 = Utf8               target
  #614 = Utf8               st
  #615 = Utf8               Ljava/util/StringTokenizer;
  #616 = Utf8               StackMapTable
  #617 = Utf8               spawnData
  #618 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
  #619 = Utf8               npcName
  #620 = Utf8               teleLink
  #621 = Utf8               spawn
  #622 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #623 = Utf8               npc
  #624 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #625 = Utf8               row
  #626 = Utf8               list
  #627 = Utf8               Lext/mods/commons/data/Pagination;
  #628 = Utf8               html
  #629 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #630 = Utf8               LocalVariableTypeTable
  #631 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #632 = Class              #633          // "[Ljava/lang/Object;"
  #633 = Utf8               [Ljava/lang/Object;
  #634 = Utf8               respawnTime
  #635 = Utf8               remainingMs
  #636 = Utf8               totalMinutes
  #637 = Utf8               days
  #638 = Utf8               hours
  #639 = Utf8               minutes
  #640 = Utf8               bossLoc
  #641 = Utf8               Lext/mods/gameserver/model/location/Location;
  #642 = Utf8               targetLoc
  #643 = Utf8               angle
  #644 = Utf8               D
  #645 = Utf8               x
  #646 = Utf8               y
  #647 = Utf8               z
  #648 = Utf8               valid
  #649 = Utf8               angleDeg
  #650 = Utf8               radius
  #651 = Utf8               i
  #652 = Utf8               minRange
  #653 = Utf8               maxRange
  #654 = Utf8               radiusStep
  #655 = Utf8               angleStep
  #656 = Utf8               single
  #657 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #658 = Utf8               coords
  #659 = Utf8               [[I
  #660 = Utf8               multi
  #661 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #662 = Utf8               spawnLoc
  #663 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #664 = Utf8               dx
  #665 = Utf8               dy
  #666 = Utf8               dist
  #667 = Utf8               bestIdx
  #668 = Utf8               bestDist
  #669 = Utf8               count
  #670 = Utf8               getVoicedCommandList
  #671 = Utf8               ()[Ljava/lang/String;
  #672 = Utf8               lambda$handleTeleport$0
  #673 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #674 = Utf8               lambda$load$1
  #675 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #676 = Utf8               o
  #677 = Utf8               lambda$load$0
  #678 = Utf8               (Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #679 = Utf8               id
  #680 = Utf8               Ljava/lang/Integer;
  #681 = Utf8               <clinit>
  #682 = Utf8               SourceFile
  #683 = Utf8               Raid.java
  #684 = Utf8               BootstrapMethods
  #685 = MethodType         #686          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #686 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #687 = MethodHandle       6:#688        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #688 = Methodref          #57.#689      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #689 = NameAndType        #677:#678     // lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #690 = MethodType         #678          //  (Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #691 = MethodType         #692          //  (Ljava/lang/Object;)Z
  #692 = Utf8               (Ljava/lang/Object;)Z
  #693 = MethodHandle       6:#694        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #694 = Methodref          #57.#695      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #695 = NameAndType        #674:#675     // lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #696 = MethodType         #675          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #697 = MethodHandle       5:#215        // REF_invokeVirtual ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #698 = MethodType         #699          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Byte;
  #699 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Byte;
  #700 = String             #701          // \u0001...
  #701 = Utf8               \u0001...
  #702 = String             #703          // <a action=\"bypass voiced_raid tele \u0001 \u0001\">Tele</a>
  #703 = Utf8               <a action=\"bypass voiced_raid tele \u0001 \u0001\">Tele</a>
  #704 = String             #705          // [\u0001]
  #705 = Utf8               [\u0001]
  #706 = String             #707          // <td width=\"90\" align=\"right\"><font color=\"FB5858\">\u0001</font></td>
  #707 = Utf8               <td width=\"90\" align=\"right\"><font color=\"FB5858\">\u0001</font></td>
  #708 = String             #709          // <td width=\"90\" align=\"right\"><font color=\"9CC300\">\u0001</font></td>
  #709 = Utf8               <td width=\"90\" align=\"right\"><font color=\"9CC300\">\u0001</font></td>
  #710 = MethodType         #6            //  ()V
  #711 = MethodHandle       6:#712        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #712 = Methodref          #57.#713      // ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #713 = NameAndType        #672:#673     // lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #714 = MethodHandle       6:#715        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #715 = Methodref          #716.#717     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #716 = Class              #718          // java/lang/invoke/LambdaMetafactory
  #717 = NameAndType        #719:#720     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #718 = Utf8               java/lang/invoke/LambdaMetafactory
  #719 = Utf8               metafactory
  #720 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #721 = MethodHandle       6:#722        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #722 = Methodref          #723.#724     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #723 = Class              #725          // java/lang/invoke/StringConcatFactory
  #724 = NameAndType        #170:#726     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #725 = Utf8               java/lang/invoke/StringConcatFactory
  #726 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #727 = Utf8               InnerClasses
  #728 = Class              #729          // java/lang/invoke/MethodHandles$Lookup
  #729 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #730 = Class              #731          // java/lang/invoke/MethodHandles
  #731 = Utf8               java/lang/invoke/MethodHandles
  #732 = Utf8               Lookup
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public static final int PAGE_LIMIT_15;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 15

  public static java.util.List<ext.mods.gameserver.model.actor.template.NpcTemplate> bosses;
    descriptor: Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Signature: #595                         // Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;

  public ext.mods.gameserver.handler.voicedcommandhandlers.Raid();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Raid;

  public static void load();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #7                  // Field ext/mods/Config.RAID_BOSS_LIST:[I
         3: invokestatic  #13                 // InterfaceMethod java/util/stream/IntStream.of:([I)Ljava/util/stream/IntStream;
         6: invokeinterface #19,  1           // InterfaceMethod java/util/stream/IntStream.boxed:()Ljava/util/stream/Stream;
        11: invokedynamic #23,  0             // InvokeDynamic #0:apply:()Ljava/util/function/Function;
        16: invokeinterface #27,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        21: invokedynamic #33,  0             // InvokeDynamic #1:test:()Ljava/util/function/Predicate;
        26: invokeinterface #37,  2           // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        31: invokedynamic #41,  0             // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        36: invokestatic  #42                 // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        39: invokeinterface #48,  2           // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
        44: invokeinterface #52,  1           // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        49: putstatic     #56                 // Field bosses:Ljava/util/List;
        52: return
      LineNumberTable:
        line 75: 0
        line 76: 52

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=8, args_size=4
         0: new           #62                 // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #64                 // String
         7: invokespecial #66                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore        4
        12: aload         4
        14: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        17: pop
        18: iconst_1
        19: istore        5
        21: aload         4
        23: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        26: ifeq          95
        29: aload         4
        31: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        34: astore        6
        36: ldc           #77                 // String tele
        38: aload         6
        40: invokevirtual #79                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        43: ifeq          88
        46: aload         4
        48: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        51: invokestatic  #85                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        54: istore        7
        56: aload         4
        58: invokevirtual #73                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        61: ifeq          75
        64: aload         4
        66: invokevirtual #69                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        69: invokestatic  #85                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        72: goto          76
        75: iconst_1
        76: istore        5
        78: aload_0
        79: aload_2
        80: iload         7
        82: invokevirtual #91                 // Method handleTeleport:(Lext/mods/gameserver/model/actor/Player;I)V
        85: goto          95
        88: aload         6
        90: invokestatic  #85                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        93: istore        5
        95: aload_0
        96: aload_2
        97: iload         5
        99: invokevirtual #95                 // Method showRaidHtm:(Lext/mods/gameserver/model/actor/Player;I)V
       102: goto          121
       105: astore        5
       107: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       110: aload         5
       112: invokevirtual #104                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
       115: aload_0
       116: aload_2
       117: iconst_1
       118: invokevirtual #95                 // Method showRaidHtm:(Lext/mods/gameserver/model/actor/Player;I)V
       121: iconst_1
       122: ireturn
      Exception table:
         from    to  target type
            18   102   105   Class java/lang/Exception
      LineNumberTable:
        line 86: 0
        line 87: 12
        line 91: 18
        line 92: 21
        line 94: 29
        line 95: 36
        line 97: 46
        line 98: 56
        line 99: 78
        line 100: 85
        line 103: 88
        line 106: 95
        line 112: 102
        line 108: 105
        line 110: 107
        line 111: 115
        line 114: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      29     7 npcId   I
           36      59     6 token   Ljava/lang/String;
           21      81     5  page   I
          107      14     5     e   Ljava/lang/Exception;
            0     123     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Raid;
            0     123     1 command   Ljava/lang/String;
            0     123     2 player   Lext/mods/gameserver/model/actor/Player;
            0     123     3 target   Ljava/lang/String;
           12     111     4    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Raid, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, int, class java/lang/String, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Raid, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #554                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 403: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Raid;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #105                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #57                 // class ext/mods/gameserver/handler/voicedcommandhandlers/Raid
         6: invokevirtual #574                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #577                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: invokestatic  #579                // InterfaceMethod java/util/List.of:()Ljava/util/List;
        18: putstatic     #56                 // Field bosses:Ljava/util/List;
        21: iconst_1
        22: anewarray     #80                 // class java/lang/String
        25: dup
        26: iconst_0
        27: ldc_w         #581                // String raid
        30: aastore
        31: putstatic     #554                // Field VOICED_COMMANDS:[Ljava/lang/String;
        34: return
      LineNumberTable:
        line 64: 0
        line 71: 15
        line 78: 21
}
SourceFile: "Raid.java"
BootstrapMethods:
  0: #714 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #685 (Ljava/lang/Object;)Ljava/lang/Object;
      #687 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
      #690 (Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  1: #714 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #691 (Ljava/lang/Object;)Z
      #693 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
      #696 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  2: #714 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #685 (Ljava/lang/Object;)Ljava/lang/Object;
      #697 REF_invokeVirtual ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
      #698 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Byte;
  3: #721 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #700 \u0001...
  4: #721 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #702 <a action=\"bypass voiced_raid tele \u0001 \u0001\">Tele</a>
  5: #721 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #704 [\u0001]
  6: #721 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #706 <td width=\"90\" align=\"right\"><font color=\"FB5858\">\u0001</font></td>
  7: #721 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #708 <td width=\"90\" align=\"right\"><font color=\"9CC300\">\u0001</font></td>
  8: #714 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #710 ()V
      #711 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Raid.lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
      #710 ()V
InnerClasses:
  public static final #732= #728 of #730; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
