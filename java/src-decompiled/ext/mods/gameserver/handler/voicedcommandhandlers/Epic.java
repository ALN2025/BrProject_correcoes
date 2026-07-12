// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.Epic
// File: ext\mods\gameserver\handler\voicedcommandhandlers\Epic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/Epic.class
  Last modified 9 de jul de 2026; size 17377 bytes
  MD5 checksum 44b39a981764d79229ac9b1dc89861a6
  Compiled from "Epic.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.Epic implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #57                         // ext/mods/gameserver/handler/voicedcommandhandlers/Epic
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 7, methods: 16, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.EPIC_BOSS_LIST:[I
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // EPIC_BOSS_LIST:[I
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               EPIC_BOSS_LIST
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
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.bosses:Ljava/util/List;
   #57 = Class              #59           // ext/mods/gameserver/handler/voicedcommandhandlers/Epic
   #58 = NameAndType        #60:#61       // bosses:Ljava/util/List;
   #59 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/Epic
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
   #91 = Methodref          #57.#92       // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.handleTeleport:(Lext/mods/gameserver/model/actor/Player;I)V
   #92 = NameAndType        #93:#94       // handleTeleport:(Lext/mods/gameserver/model/actor/Player;I)V
   #93 = Utf8               handleTeleport
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #95 = Methodref          #57.#96       // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.showEpicHtm:(Lext/mods/gameserver/model/actor/Player;I)V
   #96 = NameAndType        #97:#94       // showEpicHtm:(Lext/mods/gameserver/model/actor/Player;I)V
   #97 = Utf8               showEpicHtm
   #98 = Class              #99           // java/lang/Exception
   #99 = Utf8               java/lang/Exception
  #100 = Fieldref           #57.#101      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.LOGGER:Lext/mods/commons/logging/CLogger;
  #101 = NameAndType        #102:#103     // LOGGER:Lext/mods/commons/logging/CLogger;
  #102 = Utf8               LOGGER
  #103 = Utf8               Lext/mods/commons/logging/CLogger;
  #104 = Methodref          #105.#106     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
  #105 = Class              #107          // ext/mods/commons/logging/CLogger
  #106 = NameAndType        #108:#109     // error:(Ljava/lang/Object;)V
  #107 = Utf8               ext/mods/commons/logging/CLogger
  #108 = Utf8               error
  #109 = Utf8               (Ljava/lang/Object;)V
  #110 = Fieldref           #8.#111       // ext/mods/Config.SHOW_EPIC_HTM:Z
  #111 = NameAndType        #112:#113     // SHOW_EPIC_HTM:Z
  #112 = Utf8               SHOW_EPIC_HTM
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
  #134 = String             #135          // <html><title>Epic Boss Spawn Info</title><body>
  #135 = Utf8               <html><title>Epic Boss Spawn Info</title><body>
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
  #172 = Fieldref           #8.#173       // ext/mods/Config.EPIC_BOSS_TELEPORT_ENABLED:Z
  #173 = NameAndType        #174:#113     // EPIC_BOSS_TELEPORT_ENABLED:Z
  #174 = Utf8               EPIC_BOSS_TELEPORT_ENABLED
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
  #198 = Methodref          #193.#176     // ext/mods/gameserver/model/spawn/ASpawn.getNpcId:()I
  #199 = Methodref          #200.#201     // ext/mods/gameserver/model/spawn/SpawnData.getRespawnTime:()J
  #200 = Class              #202          // ext/mods/gameserver/model/spawn/SpawnData
  #201 = NameAndType        #203:#204     // getRespawnTime:()J
  #202 = Utf8               ext/mods/gameserver/model/spawn/SpawnData
  #203 = Utf8               getRespawnTime
  #204 = Utf8               ()J
  #205 = Methodref          #206.#207     // java/lang/System.currentTimeMillis:()J
  #206 = Class              #208          // java/lang/System
  #207 = NameAndType        #209:#204     // currentTimeMillis:()J
  #208 = Utf8               java/lang/System
  #209 = Utf8               currentTimeMillis
  #210 = String             #211          // <table width=280 height=22 bgcolor=000000><tr>
  #211 = Utf8               <table width=280 height=22 bgcolor=000000><tr>
  #212 = String             #213          // <table width=280><tr>
  #213 = Utf8               <table width=280><tr>
  #214 = String             #215          // <td width=\"140\" align=\"left\">
  #215 = Utf8               <td width=\"140\" align=\"left\">
  #216 = Methodref          #155.#217     // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #217 = NameAndType        #218:#219     // getLevel:()B
  #218 = Utf8               getLevel
  #219 = Utf8               ()B
  #220 = InvokeDynamic      #5:#221       // #5:makeConcatWithConstants:(B)Ljava/lang/String;
  #221 = NameAndType        #170:#222     // makeConcatWithConstants:(B)Ljava/lang/String;
  #222 = Utf8               (B)Ljava/lang/String;
  #223 = String             #224          // </td>
  #224 = Utf8               </td>
  #225 = Methodref          #57.#226      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.formatRemaining:(J)Ljava/lang/String;
  #226 = NameAndType        #227:#228     // formatRemaining:(J)Ljava/lang/String;
  #227 = Utf8               formatRemaining
  #228 = Utf8               (J)Ljava/lang/String;
  #229 = InvokeDynamic      #6:#169       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #230 = String             #231          // <td width=\"50\" align=\"center\">
  #231 = Utf8               <td width=\"50\" align=\"center\">
  #232 = String             #233          // </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #233 = Utf8               </tr></table><img src=\"L2UI.SquareGray\" width=280 height=1>
  #234 = InvokeDynamic      #7:#169       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #235 = Methodref          #124.#236     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #236 = NameAndType        #237:#238     // generateSpace:(I)V
  #237 = Utf8               generateSpace
  #238 = Utf8               (I)V
  #239 = String             #240          // bypass voiced_epic %page%
  #240 = Utf8               bypass voiced_epic %page%
  #241 = Methodref          #124.#242     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #242 = NameAndType        #243:#123     // generatePages:(Ljava/lang/String;)V
  #243 = Utf8               generatePages
  #244 = String             #245          // </body></html>
  #245 = Utf8               </body></html>
  #246 = Class              #247          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #247 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #248 = Methodref          #246.#249     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #249 = NameAndType        #5:#238       // "<init>":(I)V
  #250 = Methodref          #124.#251     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #251 = NameAndType        #252:#72      // getContent:()Ljava/lang/String;
  #252 = Utf8               getContent
  #253 = Methodref          #246.#254     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #254 = NameAndType        #255:#123     // setHtml:(Ljava/lang/String;)V
  #255 = Utf8               setHtml
  #256 = Methodref          #115.#257     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #257 = NameAndType        #258:#259     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #258 = Utf8               sendPacket
  #259 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #260 = String             #261          // 00D-00H-00M
  #261 = Utf8               00D-00H-00M
  #262 = Long               60000l
  #264 = Long               1440l
  #266 = Long               60l
  #268 = String             #269          // %02dD-%02dH-%02dM
  #269 = Utf8               %02dD-%02dH-%02dM
  #270 = Methodref          #271.#272     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #271 = Class              #273          // java/lang/Long
  #272 = NameAndType        #274:#275     // valueOf:(J)Ljava/lang/Long;
  #273 = Utf8               java/lang/Long
  #274 = Utf8               valueOf
  #275 = Utf8               (J)Ljava/lang/Long;
  #276 = Methodref          #80.#277      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #277 = NameAndType        #278:#279     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #278 = Utf8               format
  #279 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #280 = Methodref          #57.#281      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.canTeleport:(Lext/mods/gameserver/model/actor/Player;)Z
  #281 = NameAndType        #282:#283     // canTeleport:(Lext/mods/gameserver/model/actor/Player;)Z
  #282 = Utf8               canTeleport
  #283 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #284 = String             #285          // Não foi possível localizar o boss selecionado.
  #285 = Utf8               Não foi possível localizar o boss selecionado.
  #286 = Methodref          #57.#287      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.chargeTeleportFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #287 = NameAndType        #288:#283     // chargeTeleportFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #288 = Utf8               chargeTeleportFee
  #289 = Methodref          #57.#290      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.resolveBossLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
  #290 = NameAndType        #291:#292     // resolveBossLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
  #291 = Utf8               resolveBossLocation
  #292 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/spawn/ASpawn;)Lext/mods/gameserver/model/location/Location;
  #293 = String             #294          // Não foi possível determinar a localização do boss selecionado.
  #294 = Utf8               Não foi possível determinar a localização do boss selecionado.
  #295 = Methodref          #57.#296      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.calculateTeleportLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #296 = NameAndType        #297:#298     // calculateTeleportLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #297 = Utf8               calculateTeleportLocation
  #298 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #299 = String             #300          // Não foi possível encontrar um ponto seguro para o teleporte.
  #300 = Utf8               Não foi possível encontrar um ponto seguro para o teleporte.
  #301 = Class              #302          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #302 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #303 = Methodref          #301.#304     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #304 = NameAndType        #5:#305       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #305 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #306 = Methodref          #115.#307     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #307 = NameAndType        #308:#259     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #308 = Utf8               broadcastPacket
  #309 = Class              #310          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #310 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #311 = Fieldref           #312.#313     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #312 = Class              #314          // ext/mods/gameserver/enums/GaugeColor
  #313 = NameAndType        #315:#316     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #314 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #315 = Utf8               BLUE
  #316 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #317 = Methodref          #309.#318     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #318 = NameAndType        #5:#319       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #319 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #320 = InvokeDynamic      #8:#321       // #8:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #321 = NameAndType        #322:#323     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #322 = Utf8               run
  #323 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #324 = Long               17000l
  #326 = Methodref          #327.#328     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #327 = Class              #329          // ext/mods/commons/pool/ThreadPool
  #328 = NameAndType        #330:#331     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #329 = Utf8               ext/mods/commons/pool/ThreadPool
  #330 = Utf8               schedule
  #331 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #332 = Methodref          #115.#333     // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #333 = NameAndType        #334:#76      // isDead:()Z
  #334 = Utf8               isDead
  #335 = String             #336          // Você não pode usar este teleporte enquanto está morto.
  #336 = Utf8               Você não pode usar este teleporte enquanto está morto.
  #337 = Methodref          #115.#338     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #338 = NameAndType        #339:#163     // getKarma:()I
  #339 = Utf8               getKarma
  #340 = String             #341          // Você não pode usar este teleporte enquanto está PK.
  #341 = Utf8               Você não pode usar este teleporte enquanto está PK.
  #342 = Methodref          #115.#343     // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #343 = NameAndType        #344:#76      // isInCombat:()Z
  #344 = Utf8               isInCombat
  #345 = String             #346          // Você não pode usar este teleporte em combate.
  #346 = Utf8               Você não pode usar este teleporte em combate.
  #347 = Methodref          #115.#348     // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #348 = NameAndType        #349:#350     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #349 = Utf8               getCast
  #350 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #351 = Methodref          #352.#353     // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #352 = Class              #354          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #353 = NameAndType        #355:#76      // isCastingNow:()Z
  #354 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #355 = Utf8               isCastingNow
  #356 = Methodref          #115.#357     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #357 = NameAndType        #358:#76      // isTeleporting:()Z
  #358 = Utf8               isTeleporting
  #359 = String             #360          // Aguarde sua ação atual terminar.
  #360 = Utf8               Aguarde sua ação atual terminar.
  #361 = Methodref          #115.#362     // ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
  #362 = NameAndType        #363:#364     // getDungeon:()Lext/mods/dungeon/Dungeon;
  #363 = Utf8               getDungeon
  #364 = Utf8               ()Lext/mods/dungeon/Dungeon;
  #365 = String             #366          // Você não pode usar este teleporte dentro de dungeons.
  #366 = Utf8               Você não pode usar este teleporte dentro de dungeons.
  #367 = Methodref          #115.#368     // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
  #368 = NameAndType        #369:#76      // isInTournament:()Z
  #369 = Utf8               isInTournament
  #370 = String             #371          // Você não pode usar este teleporte durante torneios.
  #371 = Utf8               Você não pode usar este teleporte durante torneios.
  #372 = Methodref          #373.#374     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #373 = Class              #375          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #374 = NameAndType        #186:#376     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #375 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #376 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #377 = Methodref          #373.#378     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #378 = NameAndType        #379:#76      // isStarted:()Z
  #379 = Utf8               isStarted
  #380 = Methodref          #115.#381     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #381 = NameAndType        #382:#163     // getObjectId:()I
  #382 = Utf8               getObjectId
  #383 = Methodref          #373.#384     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onEscapeUse:(I)Z
  #384 = NameAndType        #385:#386     // onEscapeUse:(I)Z
  #385 = Utf8               onEscapeUse
  #386 = Utf8               (I)Z
  #387 = Methodref          #388.#389     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #388 = Class              #390          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #389 = NameAndType        #186:#391     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #390 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #391 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #392 = Methodref          #388.#378     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #393 = Methodref          #388.#384     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onEscapeUse:(I)Z
  #394 = Methodref          #395.#396     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #395 = Class              #397          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #396 = NameAndType        #186:#398     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #397 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #398 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #399 = Methodref          #395.#378     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #400 = Methodref          #395.#384     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onEscapeUse:(I)Z
  #401 = Methodref          #402.#403     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #402 = Class              #404          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #403 = NameAndType        #186:#405     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #404 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #405 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #406 = Methodref          #402.#378     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #407 = Methodref          #402.#384     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onEscapeUse:(I)Z
  #408 = Methodref          #115.#409     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #409 = NameAndType        #410:#76      // isInOlympiadMode:()Z
  #410 = Utf8               isInOlympiadMode
  #411 = Methodref          #115.#412     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #412 = NameAndType        #413:#76      // isInObserverMode:()Z
  #413 = Utf8               isInObserverMode
  #414 = Methodref          #115.#415     // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #415 = NameAndType        #416:#76      // isFestivalParticipant:()Z
  #416 = Utf8               isFestivalParticipant
  #417 = Methodref          #115.#418     // ext/mods/gameserver/model/actor/Player.isInJail:()Z
  #418 = NameAndType        #419:#76      // isInJail:()Z
  #419 = Utf8               isInJail
  #420 = Fieldref           #421.#422     // ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
  #421 = Class              #423          // ext/mods/gameserver/enums/ZoneId
  #422 = NameAndType        #424:#425     // BOSS:Lext/mods/gameserver/enums/ZoneId;
  #423 = Utf8               ext/mods/gameserver/enums/ZoneId
  #424 = Utf8               BOSS
  #425 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #426 = Methodref          #115.#427     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #427 = NameAndType        #428:#429     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #428 = Utf8               isInsideZone
  #429 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #430 = String             #431          // Seu estado atual não permite usar este teleporte.
  #431 = Utf8               Seu estado atual não permite usar este teleporte.
  #432 = Methodref          #433.#434     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #433 = Class              #435          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #434 = NameAndType        #186:#436     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #435 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #436 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #437 = Methodref          #433.#438     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #438 = NameAndType        #439:#283     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #439 = Utf8               isRegistered
  #440 = String             #441          // Você não pode usar este teleporte enquanto está registrado na Olimpíada.
  #441 = Utf8               Você não pode usar este teleporte enquanto está registrado na Olimpíada.
  #442 = Fieldref           #8.#443       // ext/mods/Config.BOSS_TELEPORT_MIN_RANGE:I
  #443 = NameAndType        #444:#445     // BOSS_TELEPORT_MIN_RANGE:I
  #444 = Utf8               BOSS_TELEPORT_MIN_RANGE
  #445 = Utf8               I
  #446 = Methodref          #447.#448     // java/lang/Math.max:(II)I
  #447 = Class              #449          // java/lang/Math
  #448 = NameAndType        #450:#451     // max:(II)I
  #449 = Utf8               java/lang/Math
  #450 = Utf8               max
  #451 = Utf8               (II)I
  #452 = Fieldref           #8.#453       // ext/mods/Config.BOSS_TELEPORT_MAX_RANGE:I
  #453 = NameAndType        #454:#445     // BOSS_TELEPORT_MAX_RANGE:I
  #454 = Utf8               BOSS_TELEPORT_MAX_RANGE
  #455 = Methodref          #447.#456     // java/lang/Math.toRadians:(D)D
  #456 = NameAndType        #457:#458     // toRadians:(D)D
  #457 = Utf8               toRadians
  #458 = Utf8               (D)D
  #459 = Methodref          #460.#461     // ext/mods/gameserver/model/location/Location.getX:()I
  #460 = Class              #462          // ext/mods/gameserver/model/location/Location
  #461 = NameAndType        #463:#163     // getX:()I
  #462 = Utf8               ext/mods/gameserver/model/location/Location
  #463 = Utf8               getX
  #464 = Methodref          #447.#465     // java/lang/Math.cos:(D)D
  #465 = NameAndType        #466:#458     // cos:(D)D
  #466 = Utf8               cos
  #467 = Methodref          #447.#468     // java/lang/Math.round:(D)J
  #468 = NameAndType        #469:#470     // round:(D)J
  #469 = Utf8               round
  #470 = Utf8               (D)J
  #471 = Methodref          #460.#472     // ext/mods/gameserver/model/location/Location.getY:()I
  #472 = NameAndType        #473:#163     // getY:()I
  #473 = Utf8               getY
  #474 = Methodref          #447.#475     // java/lang/Math.sin:(D)D
  #475 = NameAndType        #476:#458     // sin:(D)D
  #476 = Utf8               sin
  #477 = Methodref          #460.#478     // ext/mods/gameserver/model/location/Location.getZ:()I
  #478 = NameAndType        #479:#163     // getZ:()I
  #479 = Utf8               getZ
  #480 = Methodref          #481.#482     // ext/mods/gameserver/model/actor/move/MovementIntegration.getValidLocation:(IIIIII)Lext/mods/gameserver/model/location/Location;
  #481 = Class              #483          // ext/mods/gameserver/model/actor/move/MovementIntegration
  #482 = NameAndType        #484:#485     // getValidLocation:(IIIIII)Lext/mods/gameserver/model/location/Location;
  #483 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
  #484 = Utf8               getValidLocation
  #485 = Utf8               (IIIIII)Lext/mods/gameserver/model/location/Location;
  #486 = Methodref          #487.#488     // ext/mods/commons/random/Rnd.get:(II)I
  #487 = Class              #489          // ext/mods/commons/random/Rnd
  #488 = NameAndType        #490:#451     // get:(II)I
  #489 = Utf8               ext/mods/commons/random/Rnd
  #490 = Utf8               get
  #491 = Methodref          #193.#492     // ext/mods/gameserver/model/spawn/ASpawn.getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #492 = NameAndType        #493:#494     // getNpc:()Lext/mods/gameserver/model/actor/Npc;
  #493 = Utf8               getNpc
  #494 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #495 = Methodref          #496.#461     // ext/mods/gameserver/model/actor/Npc.getX:()I
  #496 = Class              #497          // ext/mods/gameserver/model/actor/Npc
  #497 = Utf8               ext/mods/gameserver/model/actor/Npc
  #498 = Methodref          #496.#472     // ext/mods/gameserver/model/actor/Npc.getY:()I
  #499 = Methodref          #496.#478     // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #500 = Methodref          #460.#501     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #501 = NameAndType        #5:#502       // "<init>":(III)V
  #502 = Utf8               (III)V
  #503 = Methodref          #200.#461     // ext/mods/gameserver/model/spawn/SpawnData.getX:()I
  #504 = Methodref          #200.#472     // ext/mods/gameserver/model/spawn/SpawnData.getY:()I
  #505 = Methodref          #200.#478     // ext/mods/gameserver/model/spawn/SpawnData.getZ:()I
  #506 = Class              #507          // ext/mods/gameserver/model/spawn/Spawn
  #507 = Utf8               ext/mods/gameserver/model/spawn/Spawn
  #508 = Methodref          #506.#509     // ext/mods/gameserver/model/spawn/Spawn.getLocX:()I
  #509 = NameAndType        #510:#163     // getLocX:()I
  #510 = Utf8               getLocX
  #511 = Methodref          #506.#512     // ext/mods/gameserver/model/spawn/Spawn.getLocY:()I
  #512 = NameAndType        #513:#163     // getLocY:()I
  #513 = Utf8               getLocY
  #514 = Methodref          #506.#515     // ext/mods/gameserver/model/spawn/Spawn.getLocZ:()I
  #515 = NameAndType        #516:#163     // getLocZ:()I
  #516 = Utf8               getLocZ
  #517 = Class              #518          // ext/mods/gameserver/model/spawn/MultiSpawn
  #518 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
  #519 = Methodref          #517.#520     // ext/mods/gameserver/model/spawn/MultiSpawn.getCoords:()[[I
  #520 = NameAndType        #521:#522     // getCoords:()[[I
  #521 = Utf8               getCoords
  #522 = Utf8               ()[[I
  #523 = Methodref          #57.#524      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.getClosestSpawnLocation:(Lext/mods/gameserver/model/actor/Player;[[I)Lext/mods/gameserver/model/location/Location;
  #524 = NameAndType        #525:#526     // getClosestSpawnLocation:(Lext/mods/gameserver/model/actor/Player;[[I)Lext/mods/gameserver/model/location/Location;
  #525 = Utf8               getClosestSpawnLocation
  #526 = Utf8               (Lext/mods/gameserver/model/actor/Player;[[I)Lext/mods/gameserver/model/location/Location;
  #527 = Methodref          #193.#528     // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #528 = NameAndType        #529:#530     // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #529 = Utf8               getSpawnLocation
  #530 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #531 = Methodref          #532.#461     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
  #532 = Class              #533          // ext/mods/gameserver/model/location/SpawnLocation
  #533 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #534 = Methodref          #532.#472     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
  #535 = Methodref          #532.#478     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
  #536 = Long               9223372036854775807l
  #538 = Methodref          #115.#461     // ext/mods/gameserver/model/actor/Player.getX:()I
  #539 = Methodref          #115.#472     // ext/mods/gameserver/model/actor/Player.getY:()I
  #540 = Fieldref           #8.#541       // ext/mods/Config.BOSS_TELEPORT_ITEM_ID:I
  #541 = NameAndType        #542:#445     // BOSS_TELEPORT_ITEM_ID:I
  #542 = Utf8               BOSS_TELEPORT_ITEM_ID
  #543 = Fieldref           #8.#544       // ext/mods/Config.BOSS_TELEPORT_ITEM_COUNT:J
  #544 = NameAndType        #545:#546     // BOSS_TELEPORT_ITEM_COUNT:J
  #545 = Utf8               BOSS_TELEPORT_ITEM_COUNT
  #546 = Utf8               J
  #547 = Long               2147483647l
  #549 = String             #550          // Quantidade configurada inválida para o teleporte.
  #550 = Utf8               Quantidade configurada inválida para o teleporte.
  #551 = Methodref          #115.#552     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #552 = NameAndType        #553:#554     // destroyItemByItemId:(IIZ)Z
  #553 = Utf8               destroyItemByItemId
  #554 = Utf8               (IIZ)Z
  #555 = Fieldref           #57.#556      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.VOICED_COMMANDS:[Ljava/lang/String;
  #556 = NameAndType        #557:#558     // VOICED_COMMANDS:[Ljava/lang/String;
  #557 = Utf8               VOICED_COMMANDS
  #558 = Utf8               [Ljava/lang/String;
  #559 = Methodref          #115.#560     // ext/mods/gameserver/model/actor/Player.teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #560 = NameAndType        #561:#562     // teleToLocation:(Lext/mods/gameserver/model/location/Location;)V
  #561 = Utf8               teleToLocation
  #562 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #563 = Methodref          #564.#565     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #564 = Class              #566          // ext/mods/gameserver/data/xml/NpcData
  #565 = NameAndType        #186:#567     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #566 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #567 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #568 = Methodref          #86.#569      // java/lang/Integer.intValue:()I
  #569 = NameAndType        #570:#163     // intValue:()I
  #570 = Utf8               intValue
  #571 = Methodref          #564.#572     // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #572 = NameAndType        #573:#574     // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #573 = Utf8               getTemplate
  #574 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #575 = Methodref          #576.#158     // java/lang/Class.getName:()Ljava/lang/String;
  #576 = Class              #577          // java/lang/Class
  #577 = Utf8               java/lang/Class
  #578 = Methodref          #105.#579     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #579 = NameAndType        #5:#123       // "<init>":(Ljava/lang/String;)V
  #580 = InterfaceMethodref #127.#581     // java/util/List.of:()Ljava/util/List;
  #581 = NameAndType        #17:#55       // of:()Ljava/util/List;
  #582 = String             #583          // epic
  #583 = Utf8               epic
  #584 = Class              #585          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #585 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #586 = Utf8               PAGE_LIMIT_15
  #587 = Utf8               ConstantValue
  #588 = Integer            15
  #589 = Utf8               SOE_VISUAL_SKILL_ID
  #590 = Integer            2040
  #591 = Utf8               SOE_VISUAL_SKILL_LEVEL
  #592 = Integer            1
  #593 = Utf8               CAST_TIME_MS
  #594 = Integer            17000
  #595 = Utf8               Signature
  #596 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #597 = Utf8               Code
  #598 = Utf8               LineNumberTable
  #599 = Utf8               LocalVariableTable
  #600 = Utf8               this
  #601 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/Epic;
  #602 = Utf8               load
  #603 = Utf8               useVoicedCommand
  #604 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #605 = Utf8               npcId
  #606 = Utf8               token
  #607 = Utf8               Ljava/lang/String;
  #608 = Utf8               page
  #609 = Utf8               e
  #610 = Utf8               Ljava/lang/Exception;
  #611 = Utf8               command
  #612 = Utf8               player
  #613 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #614 = Utf8               target
  #615 = Utf8               st
  #616 = Utf8               Ljava/util/StringTokenizer;
  #617 = Utf8               StackMapTable
  #618 = Utf8               spawnData
  #619 = Utf8               Lext/mods/gameserver/model/spawn/SpawnData;
  #620 = Utf8               npcName
  #621 = Utf8               teleLink
  #622 = Utf8               spawn
  #623 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #624 = Utf8               npc
  #625 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #626 = Utf8               row
  #627 = Utf8               list
  #628 = Utf8               Lext/mods/commons/data/Pagination;
  #629 = Utf8               antarasDeadMessageDisplayed
  #630 = Utf8               antarasLiveMessageDisplayed
  #631 = Utf8               html
  #632 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #633 = Utf8               LocalVariableTypeTable
  #634 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;
  #635 = Class              #636          // "[Ljava/lang/Object;"
  #636 = Utf8               [Ljava/lang/Object;
  #637 = Utf8               respawnTime
  #638 = Utf8               remainingMs
  #639 = Utf8               totalMinutes
  #640 = Utf8               days
  #641 = Utf8               hours
  #642 = Utf8               minutes
  #643 = Utf8               bossLoc
  #644 = Utf8               Lext/mods/gameserver/model/location/Location;
  #645 = Utf8               targetLoc
  #646 = Utf8               angle
  #647 = Utf8               D
  #648 = Utf8               x
  #649 = Utf8               y
  #650 = Utf8               z
  #651 = Utf8               valid
  #652 = Utf8               angleDeg
  #653 = Utf8               radius
  #654 = Utf8               i
  #655 = Utf8               minRange
  #656 = Utf8               maxRange
  #657 = Utf8               radiusStep
  #658 = Utf8               angleStep
  #659 = Utf8               single
  #660 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
  #661 = Utf8               coords
  #662 = Utf8               [[I
  #663 = Utf8               multi
  #664 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #665 = Utf8               spawnLoc
  #666 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #667 = Utf8               dx
  #668 = Utf8               dy
  #669 = Utf8               dist
  #670 = Utf8               bestIdx
  #671 = Utf8               bestDist
  #672 = Utf8               count
  #673 = Utf8               getVoicedCommandList
  #674 = Utf8               ()[Ljava/lang/String;
  #675 = Utf8               lambda$handleTeleport$0
  #676 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #677 = Utf8               lambda$load$1
  #678 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #679 = Utf8               o
  #680 = Utf8               lambda$load$0
  #681 = Utf8               (Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #682 = Utf8               id
  #683 = Utf8               Ljava/lang/Integer;
  #684 = Utf8               <clinit>
  #685 = Utf8               SourceFile
  #686 = Utf8               Epic.java
  #687 = Utf8               BootstrapMethods
  #688 = MethodType         #689          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #689 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #690 = MethodHandle       6:#691        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #691 = Methodref          #57.#692      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #692 = NameAndType        #680:#681     // lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #693 = MethodType         #681          //  (Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #694 = MethodType         #695          //  (Ljava/lang/Object;)Z
  #695 = Utf8               (Ljava/lang/Object;)Z
  #696 = MethodHandle       6:#697        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #697 = Methodref          #57.#698      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #698 = NameAndType        #677:#678     // lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #699 = MethodType         #678          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  #700 = MethodHandle       5:#216        // REF_invokeVirtual ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #701 = MethodType         #702          //  (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Byte;
  #702 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Byte;
  #703 = String             #704          // \u0001...
  #704 = Utf8               \u0001...
  #705 = String             #706          // <a action=\"bypass voiced_epic tele \u0001 \u0001\">Tele</a>
  #706 = Utf8               <a action=\"bypass voiced_epic tele \u0001 \u0001\">Tele</a>
  #707 = String             #708          // [\u0001]
  #708 = Utf8               [\u0001]
  #709 = String             #710          // <td width=\"90\" align=\"right\"><font color=\"FB5858\">\u0001</font></td>
  #710 = Utf8               <td width=\"90\" align=\"right\"><font color=\"FB5858\">\u0001</font></td>
  #711 = String             #712          // <td width=\"90\" align=\"right\"><font color=\"9CC300\">\u0001</font></td>
  #712 = Utf8               <td width=\"90\" align=\"right\"><font color=\"9CC300\">\u0001</font></td>
  #713 = MethodType         #6            //  ()V
  #714 = MethodHandle       6:#715        // REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #715 = Methodref          #57.#716      // ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #716 = NameAndType        #675:#676     // lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
  #717 = MethodHandle       6:#718        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #718 = Methodref          #719.#720     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #719 = Class              #721          // java/lang/invoke/LambdaMetafactory
  #720 = NameAndType        #722:#723     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #721 = Utf8               java/lang/invoke/LambdaMetafactory
  #722 = Utf8               metafactory
  #723 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #724 = MethodHandle       6:#725        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #725 = Methodref          #726.#727     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #726 = Class              #728          // java/lang/invoke/StringConcatFactory
  #727 = NameAndType        #170:#729     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #728 = Utf8               java/lang/invoke/StringConcatFactory
  #729 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #730 = Utf8               InnerClasses
  #731 = Class              #732          // java/lang/invoke/MethodHandles$Lookup
  #732 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #733 = Class              #734          // java/lang/invoke/MethodHandles
  #734 = Utf8               java/lang/invoke/MethodHandles
  #735 = Utf8               Lookup
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
    Signature: #596                         // Ljava/util/List<Lext/mods/gameserver/model/actor/template/NpcTemplate;>;

  public ext.mods.gameserver.handler.voicedcommandhandlers.Epic();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Epic;

  public static void load();
    descriptor: ()V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: getstatic     #7                  // Field ext/mods/Config.EPIC_BOSS_LIST:[I
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
        line 76: 0
        line 77: 52

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
        99: invokevirtual #95                 // Method showEpicHtm:(Lext/mods/gameserver/model/actor/Player;I)V
       102: goto          121
       105: astore        5
       107: getstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       110: aload         5
       112: invokevirtual #104                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
       115: aload_0
       116: aload_2
       117: iconst_1
       118: invokevirtual #95                 // Method showEpicHtm:(Lext/mods/gameserver/model/actor/Player;I)V
       121: iconst_1
       122: ireturn
      Exception table:
         from    to  target type
            18   102   105   Class java/lang/Exception
      LineNumberTable:
        line 87: 0
        line 88: 12
        line 92: 18
        line 93: 21
        line 95: 29
        line 96: 36
        line 98: 46
        line 99: 56
        line 100: 78
        line 101: 85
        line 104: 88
        line 107: 95
        line 113: 102
        line 109: 105
        line 111: 107
        line 112: 115
        line 115: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      29     7 npcId   I
           36      59     6 token   Ljava/lang/String;
           21      81     5  page   I
          107      14     5     e   Ljava/lang/Exception;
            0     123     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Epic;
            0     123     1 command   Ljava/lang/String;
            0     123     2 player   Lext/mods/gameserver/model/actor/Player;
            0     123     3 target   Ljava/lang/String;
           12     111     4    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Epic, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer, int, class java/lang/String, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/voicedcommandhandlers/Epic, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/lang/String, class java/util/StringTokenizer ]
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #555                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 431: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/Epic;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #105                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #57                 // class ext/mods/gameserver/handler/voicedcommandhandlers/Epic
         6: invokevirtual #575                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #578                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #100                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: invokestatic  #580                // InterfaceMethod java/util/List.of:()Ljava/util/List;
        18: putstatic     #56                 // Field bosses:Ljava/util/List;
        21: iconst_1
        22: anewarray     #80                 // class java/lang/String
        25: dup
        26: iconst_0
        27: ldc_w         #582                // String epic
        30: aastore
        31: putstatic     #555                // Field VOICED_COMMANDS:[Ljava/lang/String;
        34: return
      LineNumberTable:
        line 65: 0
        line 72: 15
        line 79: 21
}
SourceFile: "Epic.java"
BootstrapMethods:
  0: #717 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #688 (Ljava/lang/Object;)Ljava/lang/Object;
      #690 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$load$0:(Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
      #693 (Ljava/lang/Integer;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  1: #717 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #694 (Ljava/lang/Object;)Z
      #696 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$load$1:(Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
      #699 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Z
  2: #717 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #688 (Ljava/lang/Object;)Ljava/lang/Object;
      #700 REF_invokeVirtual ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
      #701 (Lext/mods/gameserver/model/actor/template/NpcTemplate;)Ljava/lang/Byte;
  3: #724 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #703 \u0001...
  4: #724 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #705 <a action=\"bypass voiced_epic tele \u0001 \u0001\">Tele</a>
  5: #724 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #707 [\u0001]
  6: #724 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #709 <td width=\"90\" align=\"right\"><font color=\"FB5858\">\u0001</font></td>
  7: #724 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #711 <td width=\"90\" align=\"right\"><font color=\"9CC300\">\u0001</font></td>
  8: #717 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #713 ()V
      #714 REF_invokeStatic ext/mods/gameserver/handler/voicedcommandhandlers/Epic.lambda$handleTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)V
      #713 ()V
InnerClasses:
  public static final #735= #731 of #733; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
