// Bytecode for: ext.mods.gameserver.model.entity.events.teamvsteam.TvTEvent
// File: ext\mods\gameserver\model\entity\events\teamvsteam\TvTEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.class
  Last modified 9 de jul de 2026; size 24698 bytes
  MD5 checksum 3ecae3e8522dd7e144fd5b59bc27911a
  Compiled from "TvTEvent.java"
public class ext.mods.gameserver.model.entity.events.teamvsteam.TvTEvent extends ext.mods.gameserver.model.entity.Events
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  super_class: #2                         // ext/mods/gameserver/model/entity/Events
  interfaces: 0, fields: 6, methods: 38, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/entity/Events."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/entity/Events
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/entity/Events
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // html/mods/events/tvt/
    #8 = Utf8               html/mods/events/tvt/
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.htmlPath:Ljava/lang/String;
   #10 = Class              #12           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #11 = NameAndType        #13:#14       // htmlPath:Ljava/lang/String;
   #12 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #13 = Utf8               htmlPath
   #14 = Utf8               Ljava/lang/String;
   #15 = Class              #16           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
   #16 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
   #17 = Fieldref           #10.#18       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent._teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #18 = NameAndType        #19:#20       // _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #19 = Utf8               _teams
   #20 = Utf8               [Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
   #21 = Fieldref           #22.#23       // ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
   #22 = Class              #24           // ext/mods/gameserver/enums/EventState
   #23 = NameAndType        #25:#26       // INACTIVE:Lext/mods/gameserver/enums/EventState;
   #24 = Utf8               ext/mods/gameserver/enums/EventState
   #25 = Utf8               INACTIVE
   #26 = Utf8               Lext/mods/gameserver/enums/EventState;
   #27 = Fieldref           #10.#28       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent._state:Lext/mods/gameserver/enums/EventState;
   #28 = NameAndType        #29:#26       // _state:Lext/mods/gameserver/enums/EventState;
   #29 = Utf8               _state
   #30 = Class              #31           // java/util/HashMap
   #31 = Utf8               java/util/HashMap
   #32 = Methodref          #30.#3        // java/util/HashMap."<init>":()V
   #33 = Fieldref           #10.#34       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent._teleported:Ljava/util/Map;
   #34 = NameAndType        #35:#36       // _teleported:Ljava/util/Map;
   #35 = Utf8               _teleported
   #36 = Utf8               Ljava/util/Map;
   #37 = Methodref          #38.#39       // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #38 = Class              #40           // ext/mods/gameserver/data/manager/AntiFeedManager
   #39 = NameAndType        #41:#42       // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #40 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
   #41 = Utf8               getInstance
   #42 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #43 = Methodref          #38.#44       // ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
   #44 = NameAndType        #45:#46       // registerEvent:(I)V
   #45 = Utf8               registerEvent
   #46 = Utf8               (I)V
   #47 = Fieldref           #48.#49       // ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
   #48 = Class              #50           // ext/mods/Config
   #49 = NameAndType        #51:#14       // TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
   #50 = Utf8               ext/mods/Config
   #51 = Utf8               TVT_EVENT_TEAM_1_NAME
   #52 = Fieldref           #48.#53       // ext/mods/Config.TVT_EVENT_TEAM_1_COORDINATES:[I
   #53 = NameAndType        #54:#55       // TVT_EVENT_TEAM_1_COORDINATES:[I
   #54 = Utf8               TVT_EVENT_TEAM_1_COORDINATES
   #55 = Utf8               [I
   #56 = Methodref          #15.#57       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam."<init>":(Ljava/lang/String;[I)V
   #57 = NameAndType        #5:#58        // "<init>":(Ljava/lang/String;[I)V
   #58 = Utf8               (Ljava/lang/String;[I)V
   #59 = Fieldref           #48.#60       // ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
   #60 = NameAndType        #61:#14       // TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
   #61 = Utf8               TVT_EVENT_TEAM_2_NAME
   #62 = Fieldref           #48.#63       // ext/mods/Config.TVT_EVENT_TEAM_2_COORDINATES:[I
   #63 = NameAndType        #64:#55       // TVT_EVENT_TEAM_2_COORDINATES:[I
   #64 = Utf8               TVT_EVENT_TEAM_2_COORDINATES
   #65 = Methodref          #66.#67       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #66 = Class              #68           // ext/mods/gameserver/data/xml/NpcData
   #67 = NameAndType        #41:#69       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #68 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #69 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #70 = Fieldref           #48.#71       // ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_ID:I
   #71 = NameAndType        #72:#73       // TVT_EVENT_PARTICIPATION_NPC_ID:I
   #72 = Utf8               TVT_EVENT_PARTICIPATION_NPC_ID
   #73 = Utf8               I
   #74 = Methodref          #66.#75       // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #75 = NameAndType        #76:#77       // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #76 = Utf8               getTemplate
   #77 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #78 = Fieldref           #10.#79       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.LOGGER:Lext/mods/commons/logging/CLogger;
   #79 = NameAndType        #80:#81       // LOGGER:Lext/mods/commons/logging/CLogger;
   #80 = Utf8               LOGGER
   #81 = Utf8               Lext/mods/commons/logging/CLogger;
   #82 = String             #83           // TvTEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in Configs?
   #83 = Utf8               TvTEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in Configs?
   #84 = Methodref          #85.#86       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #85 = Class              #87           // ext/mods/commons/logging/CLogger
   #86 = NameAndType        #88:#89       // warn:(Ljava/lang/Object;)V
   #87 = Utf8               ext/mods/commons/logging/CLogger
   #88 = Utf8               warn
   #89 = Utf8               (Ljava/lang/Object;)V
   #90 = Class              #91           // ext/mods/gameserver/model/spawn/Spawn
   #91 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #92 = Methodref          #90.#93       // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #93 = NameAndType        #5:#94        // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #94 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #95 = Fieldref           #10.#96       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent._npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
   #96 = NameAndType        #97:#98       // _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
   #97 = Utf8               _npcSpawn
   #98 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
   #99 = Fieldref           #48.#100      // ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #100 = NameAndType        #101:#55      // TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
  #101 = Utf8               TVT_EVENT_PARTICIPATION_NPC_COORDINATES
  #102 = Methodref          #90.#103      // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
  #103 = NameAndType        #104:#105     // setLoc:(IIII)V
  #104 = Utf8               setLoc
  #105 = Utf8               (IIII)V
  #106 = Methodref          #90.#107      // ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
  #107 = NameAndType        #108:#46      // setRespawnDelay:(I)V
  #108 = Utf8               setRespawnDelay
  #109 = Methodref          #110.#111     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #110 = Class              #112          // ext/mods/gameserver/data/manager/SpawnManager
  #111 = NameAndType        #41:#113      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #112 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #113 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #114 = Methodref          #110.#115     // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #115 = NameAndType        #116:#117     // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #116 = Utf8               addSpawn
  #117 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
  #118 = Methodref          #90.#119      // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #119 = NameAndType        #120:#121     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #120 = Utf8               doSpawn
  #121 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #122 = Fieldref           #10.#123      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent._lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
  #123 = NameAndType        #124:#125     // _lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
  #124 = Utf8               _lastNpcSpawn
  #125 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #126 = Class              #127          // java/lang/Exception
  #127 = Utf8               java/lang/Exception
  #128 = Methodref          #126.#129     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #129 = NameAndType        #130:#131     // getMessage:()Ljava/lang/String;
  #130 = Utf8               getMessage
  #131 = Utf8               ()Ljava/lang/String;
  #132 = InvokeDynamic      #0:#133       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #133 = NameAndType        #134:#135     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #134 = Utf8               makeConcatWithConstants
  #135 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #136 = Methodref          #85.#137      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #137 = NameAndType        #88:#138      // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #138 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #139 = Fieldref           #22.#140      // ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
  #140 = NameAndType        #141:#26      // PARTICIPATING:Lext/mods/gameserver/enums/EventState;
  #141 = Utf8               PARTICIPATING
  #142 = Methodref          #10.#143      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.setState:(Lext/mods/gameserver/enums/EventState;)V
  #143 = NameAndType        #144:#145     // setState:(Lext/mods/gameserver/enums/EventState;)V
  #144 = Utf8               setState
  #145 = Utf8               (Lext/mods/gameserver/enums/EventState;)V
  #146 = InterfaceMethodref #147.#148     // java/util/List.stream:()Ljava/util/stream/Stream;
  #147 = Class              #149          // java/util/List
  #148 = NameAndType        #150:#151     // stream:()Ljava/util/stream/Stream;
  #149 = Utf8               java/util/List
  #150 = Utf8               stream
  #151 = Utf8               ()Ljava/util/stream/Stream;
  #152 = InvokeDynamic      #1:#153       // #1:applyAsInt:()Ljava/util/function/ToIntFunction;
  #153 = NameAndType        #154:#155     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #154 = Utf8               applyAsInt
  #155 = Utf8               ()Ljava/util/function/ToIntFunction;
  #156 = InterfaceMethodref #157.#158     // java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #157 = Class              #159          // java/util/Comparator
  #158 = NameAndType        #160:#161     // comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #159 = Utf8               java/util/Comparator
  #160 = Utf8               comparingInt
  #161 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #162 = InterfaceMethodref #163.#164     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #163 = Class              #165          // java/util/stream/Stream
  #164 = NameAndType        #166:#167     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #165 = Utf8               java/util/stream/Stream
  #166 = Utf8               sorted
  #167 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #168 = InterfaceMethodref #163.#169     // java/util/stream/Stream.toList:()Ljava/util/List;
  #169 = NameAndType        #170:#171     // toList:()Ljava/util/List;
  #170 = Utf8               toList
  #171 = Utf8               ()Ljava/util/List;
  #172 = Fieldref           #22.#173      // ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
  #173 = NameAndType        #174:#26      // STARTING:Lext/mods/gameserver/enums/EventState;
  #174 = Utf8               STARTING
  #175 = Methodref          #15.#176      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
  #176 = NameAndType        #177:#178     // getParticipatedPlayers:()Ljava/util/Map;
  #177 = Utf8               getParticipatedPlayers
  #178 = Utf8               ()Ljava/util/Map;
  #179 = InterfaceMethodref #180.#181     // java/util/Map.putAll:(Ljava/util/Map;)V
  #180 = Class              #182          // java/util/Map
  #181 = NameAndType        #183:#184     // putAll:(Ljava/util/Map;)V
  #182 = Utf8               java/util/Map
  #183 = Utf8               putAll
  #184 = Utf8               (Ljava/util/Map;)V
  #185 = Methodref          #15.#186      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
  #186 = NameAndType        #187:#6       // cleanMe:()V
  #187 = Utf8               cleanMe
  #188 = Class              #189          // java/util/ArrayList
  #189 = Utf8               java/util/ArrayList
  #190 = InterfaceMethodref #180.#191     // java/util/Map.values:()Ljava/util/Collection;
  #191 = NameAndType        #192:#193     // values:()Ljava/util/Collection;
  #192 = Utf8               values
  #193 = Utf8               ()Ljava/util/Collection;
  #194 = Methodref          #188.#195     // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #195 = NameAndType        #5:#196       // "<init>":(Ljava/util/Collection;)V
  #196 = Utf8               (Ljava/util/Collection;)V
  #197 = Methodref          #10.#198      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.sortPlayersByLevel:(Ljava/util/List;)Ljava/util/List;
  #198 = NameAndType        #199:#200     // sortPlayersByLevel:(Ljava/util/List;)Ljava/util/List;
  #199 = Utf8               sortPlayersByLevel
  #200 = Utf8               (Ljava/util/List;)Ljava/util/List;
  #201 = InterfaceMethodref #147.#202     // java/util/List.isEmpty:()Z
  #202 = NameAndType        #203:#204     // isEmpty:()Z
  #203 = Utf8               isEmpty
  #204 = Utf8               ()Z
  #205 = InterfaceMethodref #147.#206     // java/util/List.size:()I
  #206 = NameAndType        #207:#208     // size:()I
  #207 = Utf8               size
  #208 = Utf8               ()I
  #209 = InterfaceMethodref #147.#210     // java/util/List.remove:(I)Ljava/lang/Object;
  #210 = NameAndType        #211:#212     // remove:(I)Ljava/lang/Object;
  #211 = Utf8               remove
  #212 = Utf8               (I)Ljava/lang/Object;
  #213 = Class              #214          // ext/mods/gameserver/model/actor/Player
  #214 = Utf8               ext/mods/gameserver/model/actor/Player
  #215 = Methodref          #15.#216      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
  #216 = NameAndType        #217:#218     // addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
  #217 = Utf8               addPlayer
  #218 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #219 = Methodref          #213.#220     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #220 = NameAndType        #221:#222     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #221 = Utf8               getStatus
  #222 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #223 = Methodref          #224.#225     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #224 = Class              #226          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #225 = NameAndType        #227:#208     // getLevel:()I
  #226 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #227 = Utf8               getLevel
  #228 = Methodref          #15.#229      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
  #229 = NameAndType        #230:#208     // getParticipatedPlayerCount:()I
  #230 = Utf8               getParticipatedPlayerCount
  #231 = Fieldref           #48.#232      // ext/mods/Config.TVT_EVENT_MIN_PLAYERS_IN_TEAMS:I
  #232 = NameAndType        #233:#73      // TVT_EVENT_MIN_PLAYERS_IN_TEAMS:I
  #233 = Utf8               TVT_EVENT_MIN_PLAYERS_IN_TEAMS
  #234 = InterfaceMethodref #235.#236     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #235 = Class              #237          // java/util/Collection
  #236 = NameAndType        #238:#239     // iterator:()Ljava/util/Iterator;
  #237 = Utf8               java/util/Collection
  #238 = Utf8               iterator
  #239 = Utf8               ()Ljava/util/Iterator;
  #240 = InterfaceMethodref #241.#242     // java/util/Iterator.hasNext:()Z
  #241 = Class              #243          // java/util/Iterator
  #242 = NameAndType        #244:#204     // hasNext:()Z
  #243 = Utf8               java/util/Iterator
  #244 = Utf8               hasNext
  #245 = InterfaceMethodref #241.#246     // java/util/Iterator.next:()Ljava/lang/Object;
  #246 = NameAndType        #247:#248     // next:()Ljava/lang/Object;
  #247 = Utf8               next
  #248 = Utf8               ()Ljava/lang/Object;
  #249 = Fieldref           #48.#250      // ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
  #250 = NameAndType        #251:#55      // TVT_EVENT_PARTICIPATION_FEE:[I
  #251 = Utf8               TVT_EVENT_PARTICIPATION_FEE
  #252 = Methodref          #213.#253     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #253 = NameAndType        #254:#255     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #254 = Utf8               addItem
  #255 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #256 = Methodref          #10.#257      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.unSpawnNpc:()V
  #257 = NameAndType        #258:#6       // unSpawnNpc:()V
  #258 = Utf8               unSpawnNpc
  #259 = Methodref          #38.#260      // ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
  #260 = NameAndType        #261:#46      // clear:(I)V
  #261 = Utf8               clear
  #262 = Fieldref           #48.#263      // ext/mods/Config.TVT_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #263 = NameAndType        #264:#265     // TVT_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #264 = Utf8               TVT_DOORS_IDS_TO_CLOSE
  #265 = Utf8               Ljava/util/List;
  #266 = Methodref          #10.#267      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.closeDoors:(Ljava/util/List;)V
  #267 = NameAndType        #268:#269     // closeDoors:(Ljava/util/List;)V
  #268 = Utf8               closeDoors
  #269 = Utf8               (Ljava/util/List;)V
  #270 = Fieldref           #22.#271      // ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
  #271 = NameAndType        #272:#26      // STARTED:Lext/mods/gameserver/enums/EventState;
  #272 = Utf8               STARTED
  #273 = Class              #274          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
  #274 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
  #275 = Methodref          #15.#276      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getCoordinates:()[I
  #276 = NameAndType        #277:#278     // getCoordinates:()[I
  #277 = Utf8               getCoordinates
  #278 = Utf8               ()[I
  #279 = Methodref          #273.#280     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #280 = NameAndType        #5:#281       // "<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #281 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #282 = Fieldref           #48.#283      // ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
  #283 = NameAndType        #284:#14      // TVT_EVENT_ON_KILL:Ljava/lang/String;
  #284 = Utf8               TVT_EVENT_ON_KILL
  #285 = String             #286          // title
  #286 = Utf8               title
  #287 = Methodref          #288.#289     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #288 = Class              #290          // java/lang/String
  #289 = NameAndType        #291:#292     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #290 = Utf8               java/lang/String
  #291 = Utf8               equalsIgnoreCase
  #292 = Utf8               (Ljava/lang/String;)Z
  #293 = String             #294          // pmtitle
  #294 = Utf8               pmtitle
  #295 = Methodref          #213.#296     // ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
  #296 = NameAndType        #297:#131     // getTitle:()Ljava/lang/String;
  #297 = Utf8               getTitle
  #298 = Fieldref           #213.#299     // ext/mods/gameserver/model/actor/Player._originalTitle:Ljava/lang/String;
  #299 = NameAndType        #300:#14      // _originalTitle:Ljava/lang/String;
  #300 = Utf8               _originalTitle
  #301 = Methodref          #213.#302     // ext/mods/gameserver/model/actor/Player.getPointScore:()I
  #302 = NameAndType        #303:#208     // getPointScore:()I
  #303 = Utf8               getPointScore
  #304 = InvokeDynamic      #2:#305       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #305 = NameAndType        #134:#306     // makeConcatWithConstants:(I)Ljava/lang/String;
  #306 = Utf8               (I)Ljava/lang/String;
  #307 = Methodref          #213.#308     // ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
  #308 = NameAndType        #309:#310     // setTitle:(Ljava/lang/String;)V
  #309 = Utf8               setTitle
  #310 = Utf8               (Ljava/lang/String;)V
  #311 = Methodref          #213.#312     // ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
  #312 = NameAndType        #313:#6       // broadcastTitleInfo:()V
  #313 = Utf8               broadcastTitleInfo
  #314 = Class              #315          // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #315 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
  #316 = String             #317          // TvT Afk system is started, if you stay Afk you will be kicked!
  #317 = Utf8               TvT Afk system is started, if you stay Afk you will be kicked!
  #318 = Methodref          #314.#319     // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
  #319 = NameAndType        #5:#320       // "<init>":(Ljava/lang/String;I)V
  #320 = Utf8               (Ljava/lang/String;I)V
  #321 = Methodref          #213.#322     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #322 = NameAndType        #323:#324     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #323 = Utf8               sendPacket
  #324 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #325 = Methodref          #15.#326      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
  #326 = NameAndType        #327:#328     // getPoints:()S
  #327 = Utf8               getPoints
  #328 = Utf8               ()S
  #329 = Fieldref           #22.#330      // ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
  #330 = NameAndType        #331:#26      // REWARDING:Lext/mods/gameserver/enums/EventState;
  #331 = Utf8               REWARDING
  #332 = String             #333          // Team vs Team: Event has ended. No team won due to inactivity!
  #333 = Utf8               Team vs Team: Event has ended. No team won due to inactivity!
  #334 = String             #335          // Event has ended, both teams have tied.
  #335 = Utf8               Event has ended, both teams have tied.
  #336 = Methodref          #10.#337      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #337 = NameAndType        #338:#310     // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #338 = Utf8               sysMsgToAllParticipants
  #339 = Fieldref           #48.#340      // ext/mods/Config.TVT_REWARD_TEAM_TIE:Z
  #340 = NameAndType        #341:#342     // TVT_REWARD_TEAM_TIE:Z
  #341 = Utf8               TVT_REWARD_TEAM_TIE
  #342 = Utf8               Z
  #343 = Methodref          #10.#344      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.rewardTeam:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)V
  #344 = NameAndType        #345:#346     // rewardTeam:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)V
  #345 = Utf8               rewardTeam
  #346 = Utf8               (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)V
  #347 = String             #348          // Team vs Team: Event has ended with both teams tying.
  #348 = Utf8               Team vs Team: Event has ended with both teams tying.
  #349 = Methodref          #15.#350      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getName:()Ljava/lang/String;
  #350 = NameAndType        #351:#131     // getName:()Ljava/lang/String;
  #351 = Utf8               getName
  #352 = InvokeDynamic      #3:#353       // #3:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
  #353 = NameAndType        #134:#354     // makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
  #354 = Utf8               (Ljava/lang/String;S)Ljava/lang/String;
  #355 = Fieldref           #48.#356      // ext/mods/Config.TVT_REWARD_PLAYER:Z
  #356 = NameAndType        #357:#342     // TVT_REWARD_PLAYER:Z
  #357 = Utf8               TVT_REWARD_PLAYER
  #358 = Methodref          #213.#359     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #359 = NameAndType        #360:#208     // getObjectId:()I
  #360 = Utf8               getObjectId
  #361 = Methodref          #15.#362      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.onScoredPlayer:(I)Z
  #362 = NameAndType        #363:#364     // onScoredPlayer:(I)Z
  #363 = Utf8               onScoredPlayer
  #364 = Utf8               (I)Z
  #365 = Fieldref           #48.#366      // ext/mods/Config.TVT_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #366 = NameAndType        #367:#368     // TVT_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #367 = Utf8               TVT_EVENT_REWARDS
  #368 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #369 = Methodref          #213.#370     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #370 = NameAndType        #371:#372     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #371 = Utf8               getInventory
  #372 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #373 = Methodref          #374.#375     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #374 = Class              #376          // ext/mods/gameserver/data/xml/ItemData
  #375 = NameAndType        #41:#377      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #376 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #377 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #378 = Methodref          #379.#380     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #379 = Class              #381          // ext/mods/gameserver/model/holder/IntIntHolder
  #380 = NameAndType        #382:#208     // getId:()I
  #381 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #382 = Utf8               getId
  #383 = Methodref          #374.#384     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #384 = NameAndType        #76:#385      // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #385 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #386 = Methodref          #387.#388     // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #387 = Class              #389          // ext/mods/gameserver/model/item/kind/Item
  #388 = NameAndType        #390:#204     // isStackable:()Z
  #389 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #390 = Utf8               isStackable
  #391 = Methodref          #379.#392     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #392 = NameAndType        #393:#208     // getValue:()I
  #393 = Utf8               getValue
  #394 = Methodref          #395.#396     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #395 = Class              #397          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #396 = NameAndType        #254:#398     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #397 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #398 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #399 = Fieldref           #400.#401     // ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #400 = Class              #402          // ext/mods/gameserver/network/SystemMessageId
  #401 = NameAndType        #403:#404     // EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #402 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #403 = Utf8               EARNED_S2_S1_S
  #404 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #405 = Methodref          #406.#407     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #406 = Class              #408          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #407 = NameAndType        #409:#410     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #408 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #409 = Utf8               getSystemMessage
  #410 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #411 = Methodref          #406.#412     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #412 = NameAndType        #413:#414     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #413 = Utf8               addItemName
  #414 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #415 = Methodref          #406.#416     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #416 = NameAndType        #417:#414     // addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #417 = Utf8               addItemNumber
  #418 = Fieldref           #400.#419     // ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #419 = NameAndType        #420:#404     // EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #420 = Utf8               EARNED_ITEM_S1
  #421 = Class              #422          // ext/mods/gameserver/network/serverpackets/StatusUpdate
  #422 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
  #423 = Methodref          #421.#424     // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #424 = NameAndType        #5:#425       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #425 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #426 = Class              #427          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #427 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #428 = Methodref          #426.#429     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #429 = NameAndType        #5:#46        // "<init>":(I)V
  #430 = Fieldref           #431.#432     // ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #431 = Class              #433          // ext/mods/gameserver/enums/StatusType
  #432 = NameAndType        #434:#435     // CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #433 = Utf8               ext/mods/gameserver/enums/StatusType
  #434 = Utf8               CUR_LOAD
  #435 = Utf8               Lext/mods/gameserver/enums/StatusType;
  #436 = Methodref          #213.#437     // ext/mods/gameserver/model/actor/Player.getCurrentWeight:()I
  #437 = NameAndType        #438:#208     // getCurrentWeight:()I
  #438 = Utf8               getCurrentWeight
  #439 = Methodref          #421.#440     // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #440 = NameAndType        #441:#442     // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #441 = Utf8               addAttribute
  #442 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
  #443 = Methodref          #444.#445     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #444 = Class              #446          // ext/mods/gameserver/data/HTMLData
  #445 = NameAndType        #41:#447      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #446 = Utf8               ext/mods/gameserver/data/HTMLData
  #447 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #448 = String             #449          // html/mods/events/tvt/Reward.htm
  #449 = Utf8               html/mods/events/tvt/Reward.htm
  #450 = Methodref          #444.#451     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #451 = NameAndType        #452:#453     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #452 = Utf8               getHtm
  #453 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #454 = Methodref          #426.#455     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #455 = NameAndType        #456:#310     // setHtml:(Ljava/lang/String;)V
  #456 = Utf8               setHtml
  #457 = Fieldref           #22.#458      // ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
  #458 = NameAndType        #459:#26      // INACTIVATING:Lext/mods/gameserver/enums/EventState;
  #459 = Utf8               INACTIVATING
  #460 = Methodref          #10.#461      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.openDoors:(Ljava/util/List;)V
  #461 = NameAndType        #462:#269     // openDoors:(Ljava/util/List;)V
  #462 = Utf8               openDoors
  #463 = Methodref          #213.#464     // ext/mods/gameserver/model/actor/Player.clearPoints:()V
  #464 = NameAndType        #465:#6       // clearPoints:()V
  #465 = Utf8               clearPoints
  #466 = InvokeDynamic      #4:#467       // #4:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #467 = NameAndType        #468:#469     // run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #468 = Utf8               run
  #469 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #470 = Fieldref           #48.#471      // ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #471 = NameAndType        #472:#73      // TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #472 = Utf8               TVT_EVENT_START_LEAVE_TELEPORT_DELAY
  #473 = Methodref          #474.#475     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #474 = Class              #476          // ext/mods/commons/pool/ThreadPool
  #475 = NameAndType        #477:#478     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #476 = Utf8               ext/mods/commons/pool/ThreadPool
  #477 = Utf8               schedule
  #478 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #479 = Methodref          #480.#481     // ext/mods/commons/random/Rnd.get:(I)I
  #480 = Class              #482          // ext/mods/commons/random/Rnd
  #481 = NameAndType        #483:#484     // get:(I)I
  #482 = Utf8               ext/mods/commons/random/Rnd
  #483 = Utf8               get
  #484 = Utf8               (I)I
  #485 = Methodref          #10.#486      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getParticipantTeamId:(I)B
  #486 = NameAndType        #487:#488     // getParticipantTeamId:(I)B
  #487 = Utf8               getParticipantTeamId
  #488 = Utf8               (I)B
  #489 = Methodref          #15.#490      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.removePlayer:(I)V
  #490 = NameAndType        #491:#46      // removePlayer:(I)V
  #491 = Utf8               removePlayer
  #492 = Methodref          #213.#493     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #493 = NameAndType        #494:#495     // destroyItemByItemId:(IIZ)Z
  #494 = Utf8               destroyItemByItemId
  #495 = Utf8               (IIZ)Z
  #496 = String             #497          // -
  #497 = Utf8               -
  #498 = Methodref          #288.#499     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #499 = NameAndType        #500:#306     // valueOf:(I)Ljava/lang/String;
  #500 = Utf8               valueOf
  #501 = Methodref          #387.#350     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #502 = InvokeDynamic      #5:#503       // #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #503 = NameAndType        #134:#504     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #504 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #505 = Class              #506          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #506 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #507 = Fieldref           #508.#509     // ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
  #508 = Class              #510          // ext/mods/gameserver/enums/SayType
  #509 = NameAndType        #511:#512     // PARTY:Lext/mods/gameserver/enums/SayType;
  #510 = Utf8               ext/mods/gameserver/enums/SayType
  #511 = Utf8               PARTY
  #512 = Utf8               Lext/mods/gameserver/enums/SayType;
  #513 = String             #514          // Event Manager
  #514 = Utf8               Event Manager
  #515 = Methodref          #505.#516     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #516 = NameAndType        #5:#517       // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #517 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #518 = Methodref          #519.#520     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #519 = Class              #521          // ext/mods/gameserver/model/actor/Npc
  #520 = NameAndType        #522:#6       // deleteMe:()V
  #521 = Utf8               ext/mods/gameserver/model/actor/Npc
  #522 = Utf8               deleteMe
  #523 = Methodref          #519.#524     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #524 = NameAndType        #525:#526     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #525 = Utf8               getSpawn
  #526 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #527 = Methodref          #110.#528     // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #528 = NameAndType        #529:#117     // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #529 = Utf8               deleteSpawn
  #530 = Methodref          #90.#531      // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
  #531 = NameAndType        #532:#6       // doDelete:()V
  #532 = Utf8               doDelete
  #533 = Methodref          #10.#534      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarting:()Z
  #534 = NameAndType        #535:#204     // isStarting:()Z
  #535 = Utf8               isStarting
  #536 = Methodref          #10.#537      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #537 = NameAndType        #538:#204     // isStarted:()Z
  #538 = Utf8               isStarted
  #539 = Methodref          #10.#540      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
  #540 = NameAndType        #541:#204     // isParticipating:()Z
  #541 = Utf8               isParticipating
  #542 = Methodref          #543.#544     // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #543 = Class              #545          // ext/mods/Safedisconect/SafeDisconnectManager
  #544 = NameAndType        #41:#546      // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #545 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
  #546 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
  #547 = Methodref          #543.#548     // ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #548 = NameAndType        #549:#218     // isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #549 = Utf8               isSafeDisconnectActive
  #550 = Fieldref           #48.#551      // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_TVT:Z
  #551 = NameAndType        #552:#342     // SAFEDISCONNECT_INTEGRATION_TVT:Z
  #552 = Utf8               SAFEDISCONNECT_INTEGRATION_TVT
  #553 = Methodref          #10.#554      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.removeParticipant:(I)Z
  #554 = NameAndType        #555:#364     // removeParticipant:(I)Z
  #555 = Utf8               removeParticipant
  #556 = Methodref          #213.#557     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #557 = NameAndType        #558:#559     // teleportTo:(IIII)Z
  #558 = Utf8               teleportTo
  #559 = Utf8               (IIII)Z
  #560 = Fieldref           #561.#562     // ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
  #561 = Class              #563          // ext/mods/gameserver/enums/TeamType
  #562 = NameAndType        #564:#565     // NONE:Lext/mods/gameserver/enums/TeamType;
  #563 = Utf8               ext/mods/gameserver/enums/TeamType
  #564 = Utf8               NONE
  #565 = Utf8               Lext/mods/gameserver/enums/TeamType;
  #566 = Methodref          #213.#567     // ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #567 = NameAndType        #568:#569     // setTeam:(Lext/mods/gameserver/enums/TeamType;)V
  #568 = Utf8               setTeam
  #569 = Utf8               (Lext/mods/gameserver/enums/TeamType;)V
  #570 = String             #571          // tvt_event_participation
  #571 = Utf8               tvt_event_participation
  #572 = Methodref          #288.#573     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #573 = NameAndType        #574:#575     // equals:(Ljava/lang/Object;)Z
  #574 = Utf8               equals
  #575 = Utf8               (Ljava/lang/Object;)Z
  #576 = Methodref          #213.#577     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #577 = NameAndType        #578:#204     // isCursedWeaponEquipped:()Z
  #578 = Utf8               isCursedWeaponEquipped
  #579 = String             #580          // html/mods/events/tvt/CursedWeaponEquipped.htm
  #580 = Utf8               html/mods/events/tvt/CursedWeaponEquipped.htm
  #581 = Methodref          #582.#583     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #582 = Class              #584          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #583 = NameAndType        #41:#585      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #584 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #585 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #586 = Methodref          #582.#587     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #587 = NameAndType        #588:#218     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #588 = Utf8               isRegistered
  #589 = String             #590          // html/mods/events/tvt/Olympiad.htm
  #590 = Utf8               html/mods/events/tvt/Olympiad.htm
  #591 = Methodref          #213.#592     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #592 = NameAndType        #593:#208     // getKarma:()I
  #593 = Utf8               getKarma
  #594 = String             #595          // html/mods/events/tvt/Karma.htm
  #595 = Utf8               html/mods/events/tvt/Karma.htm
  #596 = Fieldref           #48.#597      // ext/mods/Config.DISABLE_ID_CLASSES_TVT:Ljava/util/List;
  #597 = NameAndType        #598:#265     // DISABLE_ID_CLASSES_TVT:Ljava/util/List;
  #598 = Utf8               DISABLE_ID_CLASSES_TVT
  #599 = Methodref          #213.#600     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #600 = NameAndType        #601:#602     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #601 = Utf8               getClassId
  #602 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #603 = Methodref          #604.#380     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #604 = Class              #605          // ext/mods/gameserver/enums/actors/ClassId
  #605 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #606 = Methodref          #607.#608     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #607 = Class              #609          // java/lang/Integer
  #608 = NameAndType        #500:#610     // valueOf:(I)Ljava/lang/Integer;
  #609 = Utf8               java/lang/Integer
  #610 = Utf8               (I)Ljava/lang/Integer;
  #611 = InterfaceMethodref #147.#612     // java/util/List.contains:(Ljava/lang/Object;)Z
  #612 = NameAndType        #613:#575     // contains:(Ljava/lang/Object;)Z
  #613 = Utf8               contains
  #614 = String             #615          // html/mods/events/tvt/Class.htm
  #615 = Utf8               html/mods/events/tvt/Class.htm
  #616 = Fieldref           #48.#617      // ext/mods/Config.TVT_EVENT_MIN_LVL:B
  #617 = NameAndType        #618:#619     // TVT_EVENT_MIN_LVL:B
  #618 = Utf8               TVT_EVENT_MIN_LVL
  #619 = Utf8               B
  #620 = Fieldref           #48.#621      // ext/mods/Config.TVT_EVENT_MAX_LVL:B
  #621 = NameAndType        #622:#619     // TVT_EVENT_MAX_LVL:B
  #622 = Utf8               TVT_EVENT_MAX_LVL
  #623 = String             #624          // html/mods/events/tvt/Level.htm
  #624 = Utf8               html/mods/events/tvt/Level.htm
  #625 = String             #626          // %min%
  #626 = Utf8               %min%
  #627 = Methodref          #426.#628     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #628 = NameAndType        #629:#630     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #629 = Utf8               replace
  #630 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #631 = String             #632          // %max%
  #632 = Utf8               %max%
  #633 = Fieldref           #48.#634      // ext/mods/Config.TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
  #634 = NameAndType        #635:#73      // TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
  #635 = Utf8               TVT_EVENT_MAX_PLAYERS_IN_TEAMS
  #636 = String             #637          // html/mods/events/tvt/TeamsFull.htm
  #637 = Utf8               html/mods/events/tvt/TeamsFull.htm
  #638 = Fieldref           #48.#639      // ext/mods/Config.TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #639 = NameAndType        #640:#73      // TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #640 = Utf8               TVT_EVENT_MAX_PARTICIPANTS_PER_IP
  #641 = Methodref          #38.#642      // ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #642 = NameAndType        #643:#644     // tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #643 = Utf8               tryAddPlayer
  #644 = Utf8               (ILext/mods/gameserver/model/actor/Player;I)Z
  #645 = String             #646          // html/mods/events/tvt/IPRestriction.htm
  #646 = Utf8               html/mods/events/tvt/IPRestriction.htm
  #647 = Methodref          #38.#648      // ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #648 = NameAndType        #649:#650     // getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #649 = Utf8               getLimit
  #650 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)I
  #651 = Methodref          #10.#652      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #652 = NameAndType        #653:#218     // payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #653 = Utf8               payParticipationFee
  #654 = String             #655          // html/mods/events/tvt/ParticipationFee.htm
  #655 = Utf8               html/mods/events/tvt/ParticipationFee.htm
  #656 = String             #657          // %fee%
  #657 = Utf8               %fee%
  #658 = Methodref          #10.#659      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getParticipationFee:()Ljava/lang/String;
  #659 = NameAndType        #660:#131     // getParticipationFee:()Ljava/lang/String;
  #660 = Utf8               getParticipationFee
  #661 = Methodref          #10.#662      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #662 = NameAndType        #663:#218     // addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #663 = Utf8               addParticipant
  #664 = String             #665          // html/mods/events/tvt/Registered.htm
  #665 = Utf8               html/mods/events/tvt/Registered.htm
  #666 = String             #667          // tvt_event_remove_participation
  #667 = Utf8               tvt_event_remove_participation
  #668 = Methodref          #38.#669      // ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
  #669 = NameAndType        #491:#670     // removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
  #670 = Utf8               (ILext/mods/gameserver/model/actor/Player;)Z
  #671 = String             #672          // html/mods/events/tvt/Unregistered.htm
  #672 = Utf8               html/mods/events/tvt/Unregistered.htm
  #673 = Methodref          #213.#674     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #674 = NameAndType        #675:#204     // isGM:()Z
  #675 = Utf8               isGM
  #676 = Fieldref           #677.#678     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #677 = Class              #679          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #678 = NameAndType        #680:#681     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #679 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #680 = Utf8               STATIC_PACKET
  #681 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #682 = Fieldref           #48.#683      // ext/mods/Config.TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
  #683 = NameAndType        #684:#342     // TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
  #684 = Utf8               TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED
  #685 = Methodref          #10.#686      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #686 = NameAndType        #687:#364     // isPlayerParticipant:(I)Z
  #687 = Utf8               isPlayerParticipant
  #688 = Fieldref           #48.#689      // ext/mods/Config.TVT_EVENT_SCROLL_ALLOWED:Z
  #689 = NameAndType        #690:#342     // TVT_EVENT_SCROLL_ALLOWED:Z
  #690 = Utf8               TVT_EVENT_SCROLL_ALLOWED
  #691 = Fieldref           #48.#692      // ext/mods/Config.TVT_EVENT_POTIONS_ALLOWED:Z
  #692 = NameAndType        #693:#342     // TVT_EVENT_POTIONS_ALLOWED:Z
  #693 = Utf8               TVT_EVENT_POTIONS_ALLOWED
  #694 = Fieldref           #48.#695      // ext/mods/Config.TVT_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #695 = NameAndType        #696:#342     // TVT_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #696 = Utf8               TVT_EVENT_SUMMON_BY_ITEM_ALLOWED
  #697 = Class              #698          // ext/mods/gameserver/model/actor/instance/Pet
  #698 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #699 = Class              #700          // ext/mods/gameserver/model/actor/Summon
  #700 = Utf8               ext/mods/gameserver/model/actor/Summon
  #701 = Methodref          #699.#702     // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #702 = NameAndType        #703:#704     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #703 = Utf8               getOwner
  #704 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #705 = Methodref          #15.#706      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.increasePoints:()V
  #706 = NameAndType        #707:#6       // increasePoints:()V
  #707 = Utf8               increasePoints
  #708 = Methodref          #15.#709      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.increasePoints:(I)V
  #709 = NameAndType        #707:#46      // increasePoints:(I)V
  #710 = Class              #711          // ext/mods/gameserver/network/serverpackets/UserInfo
  #711 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #712 = Methodref          #710.#713     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #713 = NameAndType        #5:#714       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #714 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #715 = Methodref          #213.#350     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #716 = InvokeDynamic      #6:#503       // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #717 = Methodref          #288.#718     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #718 = NameAndType        #719:#131     // toLowerCase:()Ljava/lang/String;
  #719 = Utf8               toLowerCase
  #720 = Methodref          #288.#721     // java/lang/String.hashCode:()I
  #721 = NameAndType        #722:#208     // hashCode:()I
  #722 = Utf8               hashCode
  #723 = String             #724          // pm
  #724 = Utf8               pm
  #725 = Methodref          #213.#726     // ext/mods/gameserver/model/actor/Player.increasePointScore:()V
  #726 = NameAndType        #727:#6       // increasePointScore:()V
  #727 = Utf8               increasePointScore
  #728 = InterfaceMethodref #180.#729     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #729 = NameAndType        #730:#575     // containsKey:(Ljava/lang/Object;)Z
  #730 = Utf8               containsKey
  #731 = InterfaceMethodref #180.#732     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #732 = NameAndType        #483:#733     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #733 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #734 = Class              #735          // java/lang/Boolean
  #735 = Utf8               java/lang/Boolean
  #736 = Methodref          #734.#737     // java/lang/Boolean.booleanValue:()Z
  #737 = NameAndType        #738:#204     // booleanValue:()Z
  #738 = Utf8               booleanValue
  #739 = Methodref          #10.#740      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
  #740 = NameAndType        #741:#714     // spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
  #741 = Utf8               spawnProtection
  #742 = Methodref          #213.#743     // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
  #743 = NameAndType        #744:#204     // isMageClass:()Z
  #744 = Utf8               isMageClass
  #745 = Fieldref           #48.#746      // ext/mods/Config.TVT_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #746 = NameAndType        #747:#36      // TVT_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #747 = Utf8               TVT_EVENT_MAGE_BUFFS
  #748 = Fieldref           #48.#749      // ext/mods/Config.TVT_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #749 = NameAndType        #750:#36      // TVT_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #750 = Utf8               TVT_EVENT_FIGHTER_BUFFS
  #751 = InterfaceMethodref #180.#202     // java/util/Map.isEmpty:()Z
  #752 = InvokeDynamic      #7:#753       // #7:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #753 = NameAndType        #754:#755     // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #754 = Utf8               accept
  #755 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #756 = InterfaceMethodref #180.#757     // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #757 = NameAndType        #758:#759     // forEach:(Ljava/util/function/BiConsumer;)V
  #758 = Utf8               forEach
  #759 = Utf8               (Ljava/util/function/BiConsumer;)V
  #760 = Methodref          #213.#761     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #761 = NameAndType        #762:#763     // getParty:()Lext/mods/gameserver/model/group/Party;
  #762 = Utf8               getParty
  #763 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #764 = Fieldref           #765.#766     // ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
  #765 = Class              #767          // ext/mods/gameserver/enums/MessageType
  #766 = NameAndType        #768:#769     // LEFT:Lext/mods/gameserver/enums/MessageType;
  #767 = Utf8               ext/mods/gameserver/enums/MessageType
  #768 = Utf8               LEFT
  #769 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #770 = Methodref          #771.#772     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #771 = Class              #773          // ext/mods/gameserver/model/group/Party
  #772 = NameAndType        #774:#775     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #773 = Utf8               ext/mods/gameserver/model/group/Party
  #774 = Utf8               removePartyMember
  #775 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #776 = Methodref          #777.#778     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
  #777 = Class              #779          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
  #778 = NameAndType        #41:#780      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
  #779 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK
  #780 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
  #781 = Methodref          #213.#782     // ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
  #782 = NameAndType        #783:#6       // stopAllEffectsDebuff:()V
  #783 = Utf8               stopAllEffectsDebuff
  #784 = Methodref          #734.#785     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #785 = NameAndType        #500:#786     // valueOf:(Z)Ljava/lang/Boolean;
  #786 = Utf8               (Z)Ljava/lang/Boolean;
  #787 = InterfaceMethodref #180.#788     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #788 = NameAndType        #789:#790     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #789 = Utf8               put
  #790 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #791 = Methodref          #15.#792      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
  #792 = NameAndType        #793:#364     // containsPlayer:(I)Z
  #793 = Utf8               containsPlayer
  #794 = Fieldref           #795.#796     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #795 = Class              #797          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent$SingletonHolder
  #796 = NameAndType        #798:#799     // INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #797 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent$SingletonHolder
  #798 = Utf8               INSTANCE
  #799 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #800 = Methodref          #801.#802     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #801 = Class              #803          // ext/mods/gameserver/data/SkillTable
  #802 = NameAndType        #41:#804      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #803 = Utf8               ext/mods/gameserver/data/SkillTable
  #804 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #805 = Methodref          #607.#806     // java/lang/Integer.intValue:()I
  #806 = NameAndType        #807:#208     // intValue:()I
  #807 = Utf8               intValue
  #808 = Methodref          #801.#809     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #809 = NameAndType        #810:#811     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #810 = Utf8               getInfo
  #811 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #812 = Methodref          #813.#814     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #813 = Class              #815          // ext/mods/gameserver/skills/L2Skill
  #814 = NameAndType        #816:#817     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #815 = Utf8               ext/mods/gameserver/skills/L2Skill
  #816 = Utf8               getEffects
  #817 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #818 = Utf8               ConstantValue
  #819 = Utf8               Signature
  #820 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
  #821 = Utf8               Code
  #822 = Utf8               LineNumberTable
  #823 = Utf8               LocalVariableTable
  #824 = Utf8               this
  #825 = Utf8               init
  #826 = Utf8               startParticipation
  #827 = Utf8               e
  #828 = Utf8               Ljava/lang/Exception;
  #829 = Utf8               tmpl
  #830 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #831 = Utf8               StackMapTable
  #832 = Class              #833          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #833 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #834 = Utf8               players
  #835 = Utf8               LocalVariableTypeTable
  #836 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #837 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
  #838 = Utf8               startFight
  #839 = Utf8               highestLevelPlayer
  #840 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #841 = Utf8               player
  #842 = Utf8               team
  #843 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
  #844 = Utf8               allParticipants
  #845 = Utf8               balance
  #846 = Utf8               priority
  #847 = Utf8               allParticipantsSorted
  #848 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
  #849 = Class              #55           // "[I"
  #850 = Class              #20           // "[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;"
  #851 = Utf8               calculateRewards
  #852 = Utf8               i
  #853 = Utf8               inv
  #854 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #855 = Utf8               reward
  #856 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #857 = Utf8               systemMessage
  #858 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #859 = Utf8               statusUpdate
  #860 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #861 = Utf8               npcHtmlMessage
  #862 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #863 = Class              #368          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #864 = Utf8               stopFight
  #865 = Utf8               teamId
  #866 = Utf8               objectId
  #867 = Utf8               itemId
  #868 = Utf8               itemNum
  #869 = Utf8               message
  #870 = Utf8               cs
  #871 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #872 = Utf8               onLogin
  #873 = Utf8               onLogout
  #874 = Utf8               onBypass
  #875 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #876 = Utf8               htmContent
  #877 = Utf8               playerLevel
  #878 = Utf8               command
  #879 = Utf8               onAction
  #880 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #881 = Utf8               playerTeamId
  #882 = Utf8               targetedPlayerTeamId
  #883 = Utf8               onScrollUse
  #884 = Utf8               onPotionUse
  #885 = Utf8               onEscapeUse
  #886 = Utf8               onItemSummon
  #887 = Utf8               onKill
  #888 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #889 = Utf8               killerTeam
  #890 = Utf8               killMessage
  #891 = Utf8               killerTeamId
  #892 = Utf8               killer
  #893 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #894 = Utf8               killedTeamId
  #895 = Utf8               attackingPlayer
  #896 = Class              #897          // ext/mods/gameserver/model/actor/Creature
  #897 = Utf8               ext/mods/gameserver/model/actor/Creature
  #898 = Utf8               onTeleported
  #899 = Utf8               party
  #900 = Utf8               Lext/mods/gameserver/model/group/Party;
  #901 = Utf8               buffs
  #902 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #903 = Utf8               state
  #904 = Class              #905          // java/lang/Object
  #905 = Utf8               java/lang/Object
  #906 = Class              #907          // java/lang/Throwable
  #907 = Utf8               java/lang/Throwable
  #908 = Utf8               isInactive
  #909 = Utf8               getParticipantTeamCoordinates
  #910 = Utf8               (I)[I
  #911 = Utf8               getTeamsPlayerCounts
  #912 = Utf8               getTeamsPoints
  #913 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #914 = Utf8               lambda$onTeleported$0
  #915 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #916 = Utf8               key
  #917 = Utf8               Ljava/lang/Integer;
  #918 = Utf8               value
  #919 = Utf8               skill
  #920 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #921 = Utf8               lambda$stopFight$0
  #922 = Utf8               lambda$sortPlayersByLevel$0
  #923 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #924 = Utf8               p
  #925 = Utf8               SourceFile
  #926 = Utf8               TvTEvent.java
  #927 = Utf8               NestMembers
  #928 = Utf8               BootstrapMethods
  #929 = String             #930          // TvTEvent.startParticipation(): exception: \u0001
  #930 = Utf8               TvTEvent.startParticipation(): exception: \u0001
  #931 = MethodType         #932          //  (Ljava/lang/Object;)I
  #932 = Utf8               (Ljava/lang/Object;)I
  #933 = MethodHandle       6:#934        // REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
  #934 = Methodref          #10.#935      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
  #935 = NameAndType        #922:#923     // lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
  #936 = MethodType         #923          //  (Lext/mods/gameserver/model/actor/Player;)I
  #937 = String             #938          // Kills: \u0001
  #938 = Utf8               Kills: \u0001
  #939 = String             #940          // Team vs Team: Event finish! Team \u0001 won with \u0001 kills!
  #940 = Utf8               Team vs Team: Event finish! Team \u0001 won with \u0001 kills!
  #941 = MethodType         #6            //  ()V
  #942 = MethodHandle       6:#943        // REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$stopFight$0:(Lext/mods/gameserver/model/actor/Player;)V
  #943 = Methodref          #10.#944      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$stopFight$0:(Lext/mods/gameserver/model/actor/Player;)V
  #944 = NameAndType        #921:#714     // lambda$stopFight$0:(Lext/mods/gameserver/model/actor/Player;)V
  #945 = String             #946          // \u0001 \u0001
  #946 = Utf8               \u0001 \u0001
  #947 = String             #948          // \u0001 Hunted Player \u0001!
  #948 = Utf8               \u0001 Hunted Player \u0001!
  #949 = MethodType         #950          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #950 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #951 = MethodHandle       6:#952        // REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #952 = Methodref          #10.#953      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #953 = NameAndType        #914:#915     // lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #954 = MethodType         #955          //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #955 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #956 = MethodHandle       6:#957        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #957 = Methodref          #958.#959     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #958 = Class              #960          // java/lang/invoke/StringConcatFactory
  #959 = NameAndType        #134:#961     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #960 = Utf8               java/lang/invoke/StringConcatFactory
  #961 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #962 = MethodHandle       6:#963        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #963 = Methodref          #964.#965     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #964 = Class              #966          // java/lang/invoke/LambdaMetafactory
  #965 = NameAndType        #967:#968     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #966 = Utf8               java/lang/invoke/LambdaMetafactory
  #967 = Utf8               metafactory
  #968 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #969 = Utf8               InnerClasses
  #970 = Utf8               SingletonHolder
  #971 = Class              #972          // java/lang/invoke/MethodHandles$Lookup
  #972 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #973 = Class              #974          // java/lang/invoke/MethodHandles
  #974 = Utf8               java/lang/invoke/MethodHandles
  #975 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.events.teamvsteam.TvTEventTeam[] _teams;
    descriptor: [Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
    flags: (0x0001) ACC_PUBLIC

  public void init();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
         3: iconst_5
         4: invokevirtual #43                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
         7: aload_0
         8: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        11: iconst_0
        12: new           #15                 // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
        15: dup
        16: getstatic     #47                 // Field ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
        19: getstatic     #52                 // Field ext/mods/Config.TVT_EVENT_TEAM_1_COORDINATES:[I
        22: invokespecial #56                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam."<init>":(Ljava/lang/String;[I)V
        25: aastore
        26: aload_0
        27: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        30: iconst_1
        31: new           #15                 // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam
        34: dup
        35: getstatic     #59                 // Field ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
        38: getstatic     #62                 // Field ext/mods/Config.TVT_EVENT_TEAM_2_COORDINATES:[I
        41: invokespecial #56                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam."<init>":(Ljava/lang/String;[I)V
        44: aastore
        45: return
      LineNumberTable:
        line 84: 0
        line 85: 7
        line 86: 26
        line 87: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;

  public boolean startParticipation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: invokestatic  #65                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
         3: getstatic     #70                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_ID:I
         6: invokevirtual #74                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: astore_1
        10: aload_1
        11: ifnonnull     24
        14: getstatic     #78                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        17: ldc           #82                 // String TvTEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in Configs?
        19: invokevirtual #84                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        22: iconst_0
        23: ireturn
        24: aload_0
        25: new           #90                 // class ext/mods/gameserver/model/spawn/Spawn
        28: dup
        29: aload_1
        30: invokespecial #92                 // Method ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
        33: putfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        36: aload_0
        37: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        40: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        43: iconst_0
        44: iaload
        45: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        48: iconst_1
        49: iaload
        50: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        53: iconst_2
        54: iaload
        55: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        58: iconst_3
        59: iaload
        60: invokevirtual #102                // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
        63: aload_0
        64: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        67: iconst_1
        68: invokevirtual #106                // Method ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
        71: invokestatic  #109                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        74: aload_0
        75: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        78: invokevirtual #114                // Method ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
        81: aload_0
        82: aload_0
        83: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        86: iconst_0
        87: invokevirtual #118                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
        90: putfield      #122                // Field _lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
        93: goto          115
        96: astore_2
        97: getstatic     #78                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       100: aload_2
       101: invokevirtual #128                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       104: invokedynamic #132,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       109: aload_2
       110: invokevirtual #136                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       113: iconst_0
       114: ireturn
       115: aload_0
       116: getstatic     #139                // Field ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
       119: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       122: iconst_1
       123: ireturn
      Exception table:
         from    to  target type
            24    93    96   Class java/lang/Exception
      LineNumberTable:
        line 91: 0
        line 93: 10
        line 95: 14
        line 96: 22
        line 101: 24
        line 103: 36
        line 104: 63
        line 106: 71
        line 107: 81
        line 113: 93
        line 109: 96
        line 111: 97
        line 112: 113
        line 115: 115
        line 116: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           97      18     2     e   Ljava/lang/Exception;
            0     124     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
           10     114     1  tmpl   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 71
          stack = [ class java/lang/Exception ]
        frame_type = 18 /* same */

  public boolean startFight();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=1
         0: aload_0
         1: getstatic     #172                // Field ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: new           #30                 // class java/util/HashMap
        10: dup
        11: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        14: astore_1
        15: aload_1
        16: aload_0
        17: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        20: iconst_0
        21: aaload
        22: invokevirtual #175                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        25: invokeinterface #179,  2          // InterfaceMethod java/util/Map.putAll:(Ljava/util/Map;)V
        30: aload_1
        31: aload_0
        32: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        35: iconst_1
        36: aaload
        37: invokevirtual #175                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        40: invokeinterface #179,  2          // InterfaceMethod java/util/Map.putAll:(Ljava/util/Map;)V
        45: aload_0
        46: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        49: iconst_0
        50: aaload
        51: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
        54: aload_0
        55: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        58: iconst_1
        59: aaload
        60: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
        63: iconst_2
        64: newarray       int
        66: dup
        67: iconst_0
        68: iconst_0
        69: iastore
        70: dup
        71: iconst_1
        72: iconst_0
        73: iastore
        74: astore_2
        75: iconst_0
        76: istore_3
        77: new           #188                // class java/util/ArrayList
        80: dup
        81: aload_0
        82: new           #188                // class java/util/ArrayList
        85: dup
        86: aload_1
        87: invokeinterface #190,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        92: invokespecial #194                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        95: invokevirtual #197                // Method sortPlayersByLevel:(Ljava/util/List;)Ljava/util/List;
        98: invokespecial #194                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       101: astore        4
       103: aload         4
       105: invokeinterface #201,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       110: ifne          242
       113: aload         4
       115: aload         4
       117: invokeinterface #205,  1          // InterfaceMethod java/util/List.size:()I
       122: iconst_1
       123: isub
       124: invokeinterface #209,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       129: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
       132: astore        5
       134: aload_0
       135: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       138: iload_3
       139: aaload
       140: aload         5
       142: invokevirtual #215                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
       145: pop
       146: aload_2
       147: iload_3
       148: dup2
       149: iaload
       150: aload         5
       152: invokevirtual #219                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       155: invokevirtual #223                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       158: iadd
       159: iastore
       160: aload         4
       162: invokeinterface #201,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       167: ifeq          173
       170: goto          242
       173: iconst_1
       174: iload_3
       175: isub
       176: istore_3
       177: aload         4
       179: aload         4
       181: invokeinterface #205,  1          // InterfaceMethod java/util/List.size:()I
       186: iconst_1
       187: isub
       188: invokeinterface #209,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       193: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
       196: astore        5
       198: aload_0
       199: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       202: iload_3
       203: aaload
       204: aload         5
       206: invokevirtual #215                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
       209: pop
       210: aload_2
       211: iload_3
       212: dup2
       213: iaload
       214: aload         5
       216: invokevirtual #219                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       219: invokevirtual #223                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       222: iadd
       223: iastore
       224: aload_2
       225: iconst_0
       226: iaload
       227: aload_2
       228: iconst_1
       229: iaload
       230: if_icmple     237
       233: iconst_1
       234: goto          238
       237: iconst_0
       238: istore_3
       239: goto          103
       242: aload_0
       243: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       246: iconst_0
       247: aaload
       248: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
       251: getstatic     #231                // Field ext/mods/Config.TVT_EVENT_MIN_PLAYERS_IN_TEAMS:I
       254: if_icmplt     272
       257: aload_0
       258: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       261: iconst_1
       262: aaload
       263: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
       266: getstatic     #231                // Field ext/mods/Config.TVT_EVENT_MIN_PLAYERS_IN_TEAMS:I
       269: if_icmpge     365
       272: aload_0
       273: getstatic     #21                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
       276: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       279: aload_1
       280: invokeinterface #190,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       285: invokeinterface #234,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       290: astore        5
       292: aload         5
       294: invokeinterface #240,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       299: ifeq          334
       302: aload         5
       304: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       309: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
       312: astore        6
       314: aload         6
       316: getstatic     #249                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
       319: iconst_0
       320: iaload
       321: getstatic     #249                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
       324: iconst_1
       325: iaload
       326: iconst_1
       327: invokevirtual #252                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       330: pop
       331: goto          292
       334: aload_0
       335: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       338: iconst_0
       339: aaload
       340: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
       343: aload_0
       344: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       347: iconst_1
       348: aaload
       349: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
       352: aload_0
       353: invokevirtual #256                // Method unSpawnNpc:()V
       356: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       359: iconst_5
       360: invokevirtual #259                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       363: iconst_0
       364: ireturn
       365: getstatic     #262                // Field ext/mods/Config.TVT_DOORS_IDS_TO_CLOSE:Ljava/util/List;
       368: invokestatic  #266                // Method closeDoors:(Ljava/util/List;)V
       371: aload_0
       372: getstatic     #270                // Field ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
       375: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       378: aload_0
       379: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       382: astore        5
       384: aload         5
       386: arraylength
       387: istore        6
       389: iconst_0
       390: istore        7
       392: iload         7
       394: iload         6
       396: if_icmpge     548
       399: aload         5
       401: iload         7
       403: aaload
       404: astore        8
       406: aload         8
       408: invokevirtual #175                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
       411: invokeinterface #190,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       416: invokeinterface #234,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       421: astore        9
       423: aload         9
       425: invokeinterface #240,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       430: ifeq          542
       433: aload         9
       435: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       440: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
       443: astore        10
       445: aload         10
       447: ifnull        539
       450: new           #273                // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
       453: dup
       454: aload         10
       456: aload         8
       458: invokevirtual #275                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getCoordinates:()[I
       461: iconst_0
       462: iconst_0
       463: invokespecial #279                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
       466: pop
       467: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       470: ldc_w         #285                // String title
       473: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       476: ifne          491
       479: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       482: ldc_w         #293                // String pmtitle
       485: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       488: ifeq          521
       491: aload         10
       493: aload         10
       495: invokevirtual #295                // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
       498: putfield      #298                // Field ext/mods/gameserver/model/actor/Player._originalTitle:Ljava/lang/String;
       501: aload         10
       503: aload         10
       505: invokevirtual #301                // Method ext/mods/gameserver/model/actor/Player.getPointScore:()I
       508: invokedynamic #304,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       513: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
       516: aload         10
       518: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
       521: aload         10
       523: new           #314                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
       526: dup
       527: ldc_w         #316                // String TvT Afk system is started, if you stay Afk you will be kicked!
       530: sipush        6000
       533: invokespecial #318                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
       536: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       539: goto          423
       542: iinc          7, 1
       545: goto          392
       548: iconst_1
       549: ireturn
      LineNumberTable:
        line 126: 0
        line 128: 7
        line 129: 15
        line 130: 30
        line 131: 45
        line 132: 54
        line 134: 63
        line 139: 75
        line 140: 77
        line 141: 103
        line 143: 113
        line 144: 134
        line 145: 146
        line 147: 160
        line 148: 170
        line 150: 173
        line 151: 177
        line 152: 198
        line 153: 210
        line 155: 224
        line 156: 239
        line 158: 242
        line 160: 272
        line 162: 279
        line 163: 314
        line 165: 334
        line 166: 343
        line 168: 352
        line 169: 356
        line 170: 363
        line 173: 365
        line 175: 371
        line 177: 378
        line 179: 406
        line 181: 445
        line 183: 450
        line 184: 467
        line 186: 491
        line 187: 501
        line 188: 516
        line 190: 521
        line 192: 539
        line 177: 542
        line 195: 548
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          134     105     5 highestLevelPlayer   Lext/mods/gameserver/model/actor/Player;
          314      17     6 players   Lext/mods/gameserver/model/actor/Player;
          445      94    10 player   Lext/mods/gameserver/model/actor/Player;
          406     136     8  team   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0     550     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
           15     535     1 allParticipants   Ljava/util/Map;
           75     475     2 balance   [I
           77     473     3 priority   I
          103     447     4 allParticipantsSorted   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           15     535     1 allParticipants   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
          103     447     4 allParticipantsSorted   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 16
        frame_type = 255 /* full_frame */
          offset_delta = 103
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, class java/util/Map, class "[I", int, class java/util/List ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 63 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 3
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 41
        frame_type = 30 /* same */
        frame_type = 254 /* append */
          offset_delta = 26
          locals = [ class "[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 5

  public java.lang.String calculateRewards();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
         4: iconst_0
         5: aaload
         6: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
         9: aload_0
        10: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        13: iconst_1
        14: aaload
        15: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
        18: if_icmpne     97
        21: aload_0
        22: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        25: iconst_0
        26: aaload
        27: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        30: ifeq          45
        33: aload_0
        34: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        37: iconst_1
        38: aaload
        39: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        42: ifne          56
        45: aload_0
        46: getstatic     #329                // Field ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
        49: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
        52: ldc_w         #332                // String Team vs Team: Event has ended. No team won due to inactivity!
        55: areturn
        56: aload_0
        57: ldc_w         #334                // String Event has ended, both teams have tied.
        60: invokevirtual #336                // Method sysMsgToAllParticipants:(Ljava/lang/String;)V
        63: getstatic     #339                // Field ext/mods/Config.TVT_REWARD_TEAM_TIE:Z
        66: ifeq          93
        69: aload_0
        70: aload_0
        71: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        74: iconst_0
        75: aaload
        76: invokevirtual #343                // Method rewardTeam:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)V
        79: aload_0
        80: aload_0
        81: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        84: iconst_1
        85: aaload
        86: invokevirtual #343                // Method rewardTeam:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)V
        89: ldc_w         #347                // String Team vs Team: Event has ended with both teams tying.
        92: areturn
        93: ldc_w         #347                // String Team vs Team: Event has ended with both teams tying.
        96: areturn
        97: aload_0
        98: getstatic     #329                // Field ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
       101: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       104: aload_0
       105: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       108: aload_0
       109: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       112: iconst_0
       113: aaload
       114: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
       117: aload_0
       118: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       121: iconst_1
       122: aaload
       123: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
       126: if_icmple     133
       129: iconst_0
       130: goto          134
       133: iconst_1
       134: aaload
       135: astore_1
       136: aload_0
       137: aload_1
       138: invokevirtual #343                // Method rewardTeam:(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;)V
       141: aload_1
       142: invokevirtual #349                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getName:()Ljava/lang/String;
       145: aload_1
       146: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
       149: invokedynamic #352,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
       154: areturn
      LineNumberTable:
        line 200: 0
        line 202: 21
        line 204: 45
        line 206: 52
        line 209: 56
        line 210: 63
        line 212: 69
        line 213: 79
        line 214: 89
        line 216: 93
        line 219: 97
        line 221: 104
        line 222: 136
        line 223: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     155     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
          136      19     1  team   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
      StackMapTable: number_of_entries = 6
        frame_type = 45 /* same */
        frame_type = 10 /* same */
        frame_type = 36 /* same */
        frame_type = 3 /* same */
        frame_type = 99 /* same_locals_1_stack_item */
          stack = [ class "[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent ]
          stack = [ class "[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;", int ]

  public void stopFight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=1
         0: aload_0
         1: getstatic     #457                // Field ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: aload_0
         8: invokevirtual #256                // Method unSpawnNpc:()V
        11: getstatic     #262                // Field ext/mods/Config.TVT_DOORS_IDS_TO_CLOSE:Ljava/util/List;
        14: invokestatic  #460                // Method openDoors:(Ljava/util/List;)V
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        21: astore_1
        22: aload_1
        23: arraylength
        24: istore_2
        25: iconst_0
        26: istore_3
        27: iload_3
        28: iload_2
        29: if_icmpge     158
        32: aload_1
        33: iload_3
        34: aaload
        35: astore        4
        37: aload         4
        39: invokevirtual #175                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        42: invokeinterface #190,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        47: invokeinterface #234,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        52: astore        5
        54: aload         5
        56: invokeinterface #240,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        61: ifeq          147
        64: aload         5
        66: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        71: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
        74: astore        6
        76: aload         6
        78: ifnull        144
        81: new           #273                // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
        84: dup
        85: aload         6
        87: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        90: iconst_0
        91: iconst_0
        92: invokespecial #279                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
        95: pop
        96: aload         6
        98: invokevirtual #463                // Method ext/mods/gameserver/model/actor/Player.clearPoints:()V
       101: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       104: ldc_w         #285                // String title
       107: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       110: ifne          125
       113: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       116: ldc_w         #293                // String pmtitle
       119: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       122: ifeq          144
       125: aload         6
       127: invokedynamic #466,  0            // InvokeDynamic #4:run:(Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
       132: getstatic     #470                // Field ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
       135: sipush        1000
       138: imul
       139: i2l
       140: invokestatic  #473                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       143: pop
       144: goto          54
       147: aload         4
       149: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
       152: iinc          3, 1
       155: goto          27
       158: aload_0
       159: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       162: iconst_0
       163: aaload
       164: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
       167: aload_0
       168: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       171: iconst_1
       172: aaload
       173: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.cleanMe:()V
       176: aload_0
       177: new           #30                 // class java/util/HashMap
       180: dup
       181: invokespecial #32                 // Method java/util/HashMap."<init>":()V
       184: putfield      #33                 // Field _teleported:Ljava/util/Map;
       187: aload_0
       188: getstatic     #21                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
       191: invokevirtual #142                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       194: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       197: iconst_5
       198: invokevirtual #259                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       201: return
      LineNumberTable:
        line 278: 0
        line 280: 7
        line 282: 11
        line 284: 17
        line 286: 37
        line 288: 76
        line 290: 81
        line 291: 96
        line 292: 101
        line 294: 125
        line 302: 144
        line 304: 147
        line 284: 152
        line 307: 158
        line 308: 167
        line 310: 176
        line 312: 187
        line 313: 194
        line 314: 201
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           76      68     6 player   Lext/mods/gameserver/model/actor/Player;
           37     115     4  team   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
            0     202     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 27
          locals = [ class "[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent ]
          stack = []

  public synchronized boolean addParticipant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: iconst_0
         7: istore_2
         8: aload_0
         9: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        12: iconst_0
        13: aaload
        14: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        21: iconst_1
        22: aaload
        23: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        26: if_icmpne     38
        29: iconst_2
        30: invokestatic  #479                // Method ext/mods/commons/random/Rnd.get:(I)I
        33: i2b
        34: istore_2
        35: goto          66
        38: aload_0
        39: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        42: iconst_0
        43: aaload
        44: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        47: aload_0
        48: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        51: iconst_1
        52: aaload
        53: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        56: if_icmple     63
        59: iconst_1
        60: goto          64
        63: iconst_0
        64: i2b
        65: istore_2
        66: aload_0
        67: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        70: iload_2
        71: aaload
        72: aload_1
        73: invokevirtual #215                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
        76: ireturn
      LineNumberTable:
        line 318: 0
        line 319: 4
        line 321: 6
        line 323: 8
        line 324: 29
        line 326: 38
        line 328: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      77     1 player   Lext/mods/gameserver/model/actor/Player;
            8      69     2 teamId   B
      StackMapTable: number_of_entries = 5
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 1 /* same */

  public boolean removeParticipant(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #485                // Method getParticipantTeamId:(I)B
         5: istore_2
         6: iload_2
         7: iconst_m1
         8: if_icmpeq     23
        11: aload_0
        12: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        15: iload_2
        16: aaload
        17: iload_1
        18: invokevirtual #489                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.removePlayer:(I)V
        21: iconst_1
        22: ireturn
        23: iconst_0
        24: ireturn
      LineNumberTable:
        line 333: 0
        line 335: 6
        line 337: 11
        line 338: 21
        line 341: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      25     1 objectId   I
            6      19     2 teamId   B
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]

  public boolean payParticipationFee(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: getstatic     #249                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
         4: iconst_0
         5: iaload
         6: getstatic     #249                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: iconst_1
        12: invokevirtual #492                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        15: ireturn
      LineNumberTable:
        line 346: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getParticipationFee();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: getstatic     #249                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
         3: iconst_0
         4: iaload
         5: istore_1
         6: getstatic     #249                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: istore_2
        12: iload_1
        13: ifeq          20
        16: iload_2
        17: ifne          24
        20: ldc_w         #496                // String -
        23: areturn
        24: iload_2
        25: invokestatic  #498                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        28: invokestatic  #373                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        31: iload_1
        32: invokevirtual #383                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        35: invokevirtual #501                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        38: invokedynamic #502,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        43: areturn
      LineNumberTable:
        line 351: 0
        line 352: 6
        line 354: 12
        line 355: 20
        line 357: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            6      38     1 itemId   I
           12      32     2 itemNum   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ int, int ]
        frame_type = 3 /* same */

  public void sysMsgToAllParticipants(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: new           #505                // class ext/mods/gameserver/network/serverpackets/CreatureSay
         3: dup
         4: iconst_0
         5: getstatic     #507                // Field ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
         8: ldc_w         #513                // String Event Manager
        11: aload_1
        12: invokespecial #515                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        15: astore_2
        16: aload_0
        17: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        20: iconst_0
        21: aaload
        22: invokevirtual #175                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        25: invokeinterface #190,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        30: invokeinterface #234,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        35: astore_3
        36: aload_3
        37: invokeinterface #240,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        42: ifeq          70
        45: aload_3
        46: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        51: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
        54: astore        4
        56: aload         4
        58: ifnull        67
        61: aload         4
        63: aload_2
        64: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: goto          36
        70: aload_0
        71: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        74: iconst_1
        75: aaload
        76: invokevirtual #175                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        79: invokeinterface #190,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        84: invokeinterface #234,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        89: astore_3
        90: aload_3
        91: invokeinterface #240,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        96: ifeq          124
        99: aload_3
       100: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       105: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
       108: astore        4
       110: aload         4
       112: ifnull        121
       115: aload         4
       117: aload_2
       118: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       121: goto          90
       124: return
      LineNumberTable:
        line 362: 0
        line 364: 16
        line 366: 56
        line 367: 61
        line 368: 67
        line 370: 70
        line 372: 110
        line 373: 115
        line 374: 121
        line 375: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      11     4 player   Lext/mods/gameserver/model/actor/Player;
          110      11     4 player   Lext/mods/gameserver/model/actor/Player;
            0     125     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0     125     1 message   Ljava/lang/String;
           16     109     2    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/network/serverpackets/CreatureSay, class java/util/Iterator ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void onLogin(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: aload_1
         1: ifnull        18
         4: aload_0
         5: invokevirtual #533                // Method isStarting:()Z
         8: ifne          19
        11: aload_0
        12: invokevirtual #536                // Method isStarted:()Z
        15: ifne          19
        18: return
        19: aload_0
        20: aload_1
        21: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        24: invokevirtual #485                // Method getParticipantTeamId:(I)B
        27: istore_2
        28: iload_2
        29: iconst_m1
        30: if_icmpne     34
        33: return
        34: aload_0
        35: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        38: iload_2
        39: aaload
        40: aload_1
        41: invokevirtual #215                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
        44: pop
        45: new           #273                // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
        48: dup
        49: aload_1
        50: aload_0
        51: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        54: iload_2
        55: aaload
        56: invokevirtual #275                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getCoordinates:()[I
        59: iconst_1
        60: iconst_0
        61: invokespecial #279                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
        64: pop
        65: return
      LineNumberTable:
        line 389: 0
        line 390: 18
        line 392: 19
        line 394: 28
        line 395: 33
        line 397: 34
        line 398: 45
        line 399: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      66     1 player   Lext/mods/gameserver/model/actor/Player;
           28      38     2 teamId   B
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]

  public void onLogout(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnull        135
         4: aload_0
         5: invokevirtual #533                // Method isStarting:()Z
         8: ifne          25
        11: aload_0
        12: invokevirtual #536                // Method isStarted:()Z
        15: ifne          25
        18: aload_0
        19: invokevirtual #539                // Method isParticipating:()Z
        22: ifeq          135
        25: invokestatic  #542                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        28: aload_1
        29: invokevirtual #547                // Method ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
        32: ifeq          42
        35: getstatic     #550                // Field ext/mods/Config.SAFEDISCONNECT_INTEGRATION_TVT:Z
        38: ifeq          42
        41: return
        42: aload_0
        43: aload_1
        44: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        47: invokevirtual #553                // Method removeParticipant:(I)Z
        50: ifeq          99
        53: aload_1
        54: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        57: iconst_0
        58: iaload
        59: bipush        101
        61: invokestatic  #479                // Method ext/mods/commons/random/Rnd.get:(I)I
        64: iadd
        65: bipush        50
        67: isub
        68: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        71: iconst_1
        72: iaload
        73: bipush        101
        75: invokestatic  #479                // Method ext/mods/commons/random/Rnd.get:(I)I
        78: iadd
        79: bipush        50
        81: isub
        82: getstatic     #99                 // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        85: iconst_2
        86: iaload
        87: iconst_0
        88: invokevirtual #556                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        91: pop
        92: aload_1
        93: getstatic     #560                // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
        96: invokevirtual #566                // Method ext/mods/gameserver/model/actor/Player.setTeam:(Lext/mods/gameserver/enums/TeamType;)V
        99: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       102: ldc_w         #285                // String title
       105: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       108: ifne          123
       111: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       114: ldc_w         #293                // String pmtitle
       117: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       120: ifeq          135
       123: aload_1
       124: aload_1
       125: getfield      #298                // Field ext/mods/gameserver/model/actor/Player._originalTitle:Ljava/lang/String;
       128: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
       131: aload_1
       132: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
       135: return
      LineNumberTable:
        line 403: 0
        line 405: 25
        line 406: 41
        line 408: 42
        line 410: 53
        line 411: 92
        line 414: 99
        line 416: 123
        line 417: 131
        line 420: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     136     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0     136     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 25 /* same */
        frame_type = 16 /* same */
        frame_type = 56 /* same */
        frame_type = 23 /* same */
        frame_type = 11 /* same */

  public synchronized void onBypass(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=5, locals=6, args_size=3
         0: aload_2
         1: ifnull        11
         4: aload_0
         5: invokevirtual #539                // Method isParticipating:()Z
         8: ifne          12
        11: return
        12: aload_1
        13: ldc_w         #570                // String tvt_event_participation
        16: invokevirtual #572                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        19: ifeq          463
        22: new           #426                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        25: dup
        26: iconst_0
        27: invokespecial #428                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        30: astore        4
        32: aload_2
        33: invokevirtual #219                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        36: invokevirtual #223                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        39: istore        5
        41: aload_2
        42: invokevirtual #576                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        45: ifeq          72
        48: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        51: aload_2
        52: ldc_w         #579                // String html/mods/events/tvt/CursedWeaponEquipped.htm
        55: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        58: astore_3
        59: aload_3
        60: ifnull        454
        63: aload         4
        65: aload_3
        66: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        69: goto          454
        72: invokestatic  #581                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        75: aload_2
        76: invokevirtual #586                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        79: ifeq          106
        82: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        85: aload_2
        86: ldc_w         #589                // String html/mods/events/tvt/Olympiad.htm
        89: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        92: astore_3
        93: aload_3
        94: ifnull        454
        97: aload         4
        99: aload_3
       100: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       103: goto          454
       106: aload_2
       107: invokevirtual #591                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       110: ifle          137
       113: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       116: aload_2
       117: ldc_w         #594                // String html/mods/events/tvt/Karma.htm
       120: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       123: astore_3
       124: aload_3
       125: ifnull        454
       128: aload         4
       130: aload_3
       131: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       134: goto          454
       137: getstatic     #596                // Field ext/mods/Config.DISABLE_ID_CLASSES_TVT:Ljava/util/List;
       140: aload_2
       141: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       144: invokevirtual #603                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       147: invokestatic  #606                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       150: invokeinterface #611,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       155: ifeq          182
       158: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       161: aload_2
       162: ldc_w         #614                // String html/mods/events/tvt/Class.htm
       165: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       168: astore_3
       169: aload_3
       170: ifnull        454
       173: aload         4
       175: aload_3
       176: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       179: goto          454
       182: iload         5
       184: getstatic     #616                // Field ext/mods/Config.TVT_EVENT_MIN_LVL:B
       187: if_icmplt     198
       190: iload         5
       192: getstatic     #620                // Field ext/mods/Config.TVT_EVENT_MAX_LVL:B
       195: if_icmple     250
       198: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       201: aload_2
       202: ldc_w         #623                // String html/mods/events/tvt/Level.htm
       205: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       208: astore_3
       209: aload_3
       210: ifnull        454
       213: aload         4
       215: aload_3
       216: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       219: aload         4
       221: ldc_w         #625                // String %min%
       224: getstatic     #616                // Field ext/mods/Config.TVT_EVENT_MIN_LVL:B
       227: invokestatic  #498                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       230: invokevirtual #627                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       233: aload         4
       235: ldc_w         #631                // String %max%
       238: getstatic     #620                // Field ext/mods/Config.TVT_EVENT_MAX_LVL:B
       241: invokestatic  #498                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       244: invokevirtual #627                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       247: goto          454
       250: aload_0
       251: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       254: iconst_0
       255: aaload
       256: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
       259: getstatic     #633                // Field ext/mods/Config.TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
       262: if_icmpne     318
       265: aload_0
       266: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       269: iconst_1
       270: aaload
       271: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
       274: getstatic     #633                // Field ext/mods/Config.TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
       277: if_icmpne     318
       280: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       283: aload_2
       284: ldc_w         #636                // String html/mods/events/tvt/TeamsFull.htm
       287: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       290: astore_3
       291: aload_3
       292: ifnull        454
       295: aload         4
       297: aload_3
       298: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       301: aload         4
       303: ldc_w         #631                // String %max%
       306: getstatic     #633                // Field ext/mods/Config.TVT_EVENT_MAX_PLAYERS_IN_TEAMS:I
       309: invokestatic  #498                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       312: invokevirtual #627                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       315: goto          454
       318: getstatic     #638                // Field ext/mods/Config.TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
       321: ifle          383
       324: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       327: iconst_5
       328: aload_2
       329: getstatic     #638                // Field ext/mods/Config.TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
       332: invokevirtual #641                // Method ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
       335: ifne          383
       338: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       341: aload_2
       342: ldc_w         #645                // String html/mods/events/tvt/IPRestriction.htm
       345: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       348: astore_3
       349: aload_3
       350: ifnull        454
       353: aload         4
       355: aload_3
       356: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       359: aload         4
       361: ldc_w         #631                // String %max%
       364: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       367: aload_2
       368: getstatic     #638                // Field ext/mods/Config.TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
       371: invokevirtual #647                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
       374: invokestatic  #498                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       377: invokevirtual #627                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       380: goto          454
       383: aload_0
       384: aload_2
       385: invokevirtual #651                // Method payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       388: ifne          427
       391: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       394: aload_2
       395: ldc_w         #654                // String html/mods/events/tvt/ParticipationFee.htm
       398: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       401: astore_3
       402: aload_3
       403: ifnull        454
       406: aload         4
       408: aload_3
       409: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       412: aload         4
       414: ldc_w         #656                // String %fee%
       417: aload_0
       418: invokevirtual #658                // Method getParticipationFee:()Ljava/lang/String;
       421: invokevirtual #627                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       424: goto          454
       427: aload_0
       428: aload_2
       429: invokevirtual #661                // Method addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       432: ifeq          453
       435: aload         4
       437: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       440: aload_2
       441: ldc_w         #664                // String html/mods/events/tvt/Registered.htm
       444: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       447: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       450: goto          454
       453: return
       454: aload_2
       455: aload         4
       457: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       460: goto          528
       463: aload_1
       464: ldc_w         #666                // String tvt_event_remove_participation
       467: invokevirtual #572                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       470: ifeq          528
       473: aload_0
       474: aload_2
       475: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       478: invokevirtual #553                // Method removeParticipant:(I)Z
       481: pop
       482: getstatic     #638                // Field ext/mods/Config.TVT_EVENT_MAX_PARTICIPANTS_PER_IP:I
       485: ifle          497
       488: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       491: iconst_5
       492: aload_2
       493: invokevirtual #668                // Method ext/mods/gameserver/data/manager/AntiFeedManager.removePlayer:(ILext/mods/gameserver/model/actor/Player;)Z
       496: pop
       497: new           #426                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       500: dup
       501: iconst_0
       502: invokespecial #428                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       505: astore        4
       507: aload         4
       509: invokestatic  #443                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       512: aload_2
       513: ldc_w         #671                // String html/mods/events/tvt/Unregistered.htm
       516: invokevirtual #450                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       519: invokevirtual #454                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       522: aload_2
       523: aload         4
       525: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       528: return
      LineNumberTable:
        line 424: 0
        line 425: 11
        line 429: 12
        line 431: 22
        line 432: 32
        line 434: 41
        line 436: 48
        line 437: 59
        line 438: 63
        line 440: 72
        line 442: 82
        line 443: 93
        line 444: 97
        line 446: 106
        line 448: 113
        line 449: 124
        line 450: 128
        line 452: 137
        line 454: 158
        line 455: 169
        line 456: 173
        line 458: 182
        line 460: 198
        line 461: 209
        line 463: 213
        line 464: 219
        line 465: 233
        line 468: 250
        line 470: 280
        line 471: 291
        line 473: 295
        line 474: 301
        line 477: 318
        line 479: 338
        line 480: 349
        line 482: 353
        line 483: 359
        line 486: 383
        line 488: 391
        line 489: 402
        line 491: 406
        line 492: 412
        line 495: 427
        line 496: 435
        line 498: 453
        line 500: 454
        line 501: 460
        line 502: 463
        line 504: 473
        line 506: 482
        line 507: 488
        line 509: 497
        line 510: 507
        line 511: 522
        line 513: 528
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      13     3 htmContent   Ljava/lang/String;
           93      13     3 htmContent   Ljava/lang/String;
          124      13     3 htmContent   Ljava/lang/String;
          169      13     3 htmContent   Ljava/lang/String;
          209      41     3 htmContent   Ljava/lang/String;
          291      27     3 htmContent   Ljava/lang/String;
          349      34     3 htmContent   Ljava/lang/String;
          402      25     3 htmContent   Ljava/lang/String;
           32     428     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           41     419     5 playerLevel   I
          507      21     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     529     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0     529     1 command   Ljava/lang/String;
            0     529     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 16
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 33 /* same */
        frame_type = 30 /* same */
        frame_type = 44 /* same */
        frame_type = 15 /* same */
        frame_type = 51 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 43 /* same */
        frame_type = 25 /* same */
        frame_type = 0 /* same */
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 33 /* same */
        frame_type = 30 /* same */

  public boolean onAction(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_0
         5: invokevirtual #536                // Method isStarted:()Z
         8: ifne          13
        11: iconst_1
        12: ireturn
        13: aload_1
        14: invokevirtual #673                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        17: ifeq          22
        20: iconst_1
        21: ireturn
        22: aload_0
        23: aload_1
        24: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokevirtual #485                // Method getParticipantTeamId:(I)B
        30: istore_3
        31: aload_0
        32: iload_2
        33: invokevirtual #485                // Method getParticipantTeamId:(I)B
        36: istore        4
        38: iload_3
        39: iconst_m1
        40: if_icmpeq     49
        43: iload         4
        45: iconst_m1
        46: if_icmpeq     60
        49: iload_3
        50: iconst_m1
        51: if_icmpne     69
        54: iload         4
        56: iconst_m1
        57: if_icmpeq     69
        60: aload_1
        61: getstatic     #676                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        64: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: iconst_0
        68: ireturn
        69: iload_3
        70: iconst_m1
        71: if_icmpeq     109
        74: iload         4
        76: iconst_m1
        77: if_icmpeq     109
        80: iload_3
        81: iload         4
        83: if_icmpne     109
        86: aload_1
        87: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        90: iload_2
        91: if_icmpeq     109
        94: getstatic     #682                // Field ext/mods/Config.TVT_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
        97: ifne          109
       100: aload_1
       101: getstatic     #676                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       104: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       107: iconst_0
       108: ireturn
       109: iconst_1
       110: ireturn
      LineNumberTable:
        line 517: 0
        line 518: 11
        line 520: 13
        line 521: 20
        line 523: 22
        line 524: 31
        line 526: 38
        line 528: 60
        line 529: 67
        line 532: 69
        line 534: 100
        line 535: 107
        line 538: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0     111     1 player   Lext/mods/gameserver/model/actor/Player;
            0     111     2 objectId   I
           31      80     3 playerTeamId   B
           38      73     4 targetedPlayerTeamId   B
      StackMapTable: number_of_entries = 7
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ int, int ]
        frame_type = 10 /* same */
        frame_type = 8 /* same */
        frame_type = 39 /* same */

  public boolean onScrollUse(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #536                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #685                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #688                // Field ext/mods/Config.TVT_EVENT_SCROLL_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 543: 0
        line 544: 7
        line 546: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      29     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 9 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean onPotionUse(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #536                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #685                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #691                // Field ext/mods/Config.TVT_EVENT_POTIONS_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 551: 0
        line 552: 7
        line 554: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      29     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 9 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean onEscapeUse(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #536                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #685                // Method isPlayerParticipant:(I)Z
        14: ireturn
      LineNumberTable:
        line 559: 0
        line 560: 7
        line 562: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      15     1 objectId   I
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean onItemSummon(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #536                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #685                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #694                // Field ext/mods/Config.TVT_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 567: 0
        line 568: 7
        line 570: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      29     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 9 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void onKill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=3
         0: aload_2
         1: ifnull        11
         4: aload_0
         5: invokevirtual #536                // Method isStarted:()Z
         8: ifne          12
        11: return
        12: aload_0
        13: aload_2
        14: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        17: invokevirtual #485                // Method getParticipantTeamId:(I)B
        20: istore_3
        21: iload_3
        22: iconst_m1
        23: if_icmpne     27
        26: return
        27: new           #273                // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter
        30: dup
        31: aload_2
        32: aload_0
        33: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        36: iload_3
        37: aaload
        38: invokevirtual #275                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getCoordinates:()[I
        41: iconst_0
        42: iconst_0
        43: invokespecial #279                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
        46: pop
        47: aconst_null
        48: astore        4
        50: aload_1
        51: instanceof    #697                // class ext/mods/gameserver/model/actor/instance/Pet
        54: ifne          64
        57: aload_1
        58: instanceof    #699                // class ext/mods/gameserver/model/actor/Summon
        61: ifeq          76
        64: aload_1
        65: checkcast     #699                // class ext/mods/gameserver/model/actor/Summon
        68: invokevirtual #701                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        71: astore        4
        73: goto          89
        76: aload_1
        77: instanceof    #213                // class ext/mods/gameserver/model/actor/Player
        80: ifeq          89
        83: aload_1
        84: checkcast     #213                // class ext/mods/gameserver/model/actor/Player
        87: astore        4
        89: aload         4
        91: ifnull        348
        94: aload_0
        95: aload         4
        97: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       100: invokevirtual #485                // Method getParticipantTeamId:(I)B
       103: istore        5
       105: iload         5
       107: iconst_m1
       108: if_icmpeq     348
       111: iload         5
       113: iload_3
       114: if_icmpeq     348
       117: aload_0
       118: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
       121: iload         5
       123: aaload
       124: astore        6
       126: aload         6
       128: invokevirtual #705                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.increasePoints:()V
       131: aload         6
       133: aload         4
       135: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       138: invokevirtual #708                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.increasePoints:(I)V
       141: aload         4
       143: new           #710                // class ext/mods/gameserver/network/serverpackets/UserInfo
       146: dup
       147: aload         4
       149: invokespecial #712                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       152: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       155: aload         4
       157: invokevirtual #715                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       160: aload_2
       161: invokevirtual #715                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       164: invokedynamic #716,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       169: astore        7
       171: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       174: invokevirtual #717                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
       177: astore        8
       179: iconst_m1
       180: istore        9
       182: aload         8
       184: invokevirtual #720                // Method java/lang/String.hashCode:()I
       187: lookupswitch  { // 3

              -447853957: 254

                    3581: 220

               110371416: 237
                 default: 268
            }
       220: aload         8
       222: ldc_w         #723                // String pm
       225: invokevirtual #572                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       228: ifeq          268
       231: iconst_0
       232: istore        9
       234: goto          268
       237: aload         8
       239: ldc_w         #285                // String title
       242: invokevirtual #572                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       245: ifeq          268
       248: iconst_1
       249: istore        9
       251: goto          268
       254: aload         8
       256: ldc_w         #293                // String pmtitle
       259: invokevirtual #572                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       262: ifeq          268
       265: iconst_2
       266: istore        9
       268: iload         9
       270: tableswitch   { // 0 to 2

                       0: 296

                       1: 305

                       2: 305
                 default: 348
            }
       296: aload_0
       297: aload         7
       299: invokevirtual #336                // Method sysMsgToAllParticipants:(Ljava/lang/String;)V
       302: goto          348
       305: aload         4
       307: invokevirtual #725                // Method ext/mods/gameserver/model/actor/Player.increasePointScore:()V
       310: aload         4
       312: aload         4
       314: invokevirtual #301                // Method ext/mods/gameserver/model/actor/Player.getPointScore:()I
       317: invokedynamic #304,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       322: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
       325: aload         4
       327: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
       330: getstatic     #282                // Field ext/mods/Config.TVT_EVENT_ON_KILL:Ljava/lang/String;
       333: ldc_w         #293                // String pmtitle
       336: invokevirtual #287                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       339: ifeq          348
       342: aload_0
       343: aload         7
       345: invokevirtual #336                // Method sysMsgToAllParticipants:(Ljava/lang/String;)V
       348: return
      LineNumberTable:
        line 575: 0
        line 576: 11
        line 578: 12
        line 579: 21
        line 580: 26
        line 582: 27
        line 584: 47
        line 585: 50
        line 586: 64
        line 587: 76
        line 588: 83
        line 590: 89
        line 592: 94
        line 593: 105
        line 595: 117
        line 596: 126
        line 597: 131
        line 598: 141
        line 600: 155
        line 601: 171
        line 604: 296
        line 605: 302
        line 608: 305
        line 609: 310
        line 610: 325
        line 611: 330
        line 612: 342
        line 617: 348
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126     222     6 killerTeam   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
          171     177     7 killMessage   Ljava/lang/String;
          105     243     5 killerTeamId   B
            0     349     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0     349     1 killer   Lext/mods/gameserver/model/actor/Creature;
            0     349     2 player   Lext/mods/gameserver/model/actor/Player;
           21     328     3 killedTeamId   B
           50     299     4 attackingPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 13
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 130
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 27 /* same */
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/actor/Player ]
          stack = []

  public void onTeleported(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #536                // Method isStarted:()Z
         4: ifeq          22
         7: aload_1
         8: ifnull        22
        11: aload_0
        12: aload_1
        13: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #685                // Method isPlayerParticipant:(I)Z
        19: ifne          23
        22: return
        23: aload_0
        24: getfield      #33                 // Field _teleported:Ljava/util/Map;
        27: aload_1
        28: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        31: invokestatic  #606                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: invokeinterface #728,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        39: ifeq          67
        42: aload_0
        43: getfield      #33                 // Field _teleported:Ljava/util/Map;
        46: aload_1
        47: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: invokestatic  #606                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: invokeinterface #731,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        58: checkcast     #734                // class java/lang/Boolean
        61: invokevirtual #736                // Method java/lang/Boolean.booleanValue:()Z
        64: ifne          71
        67: aload_1
        68: invokestatic  #739                // Method spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
        71: aload_1
        72: invokevirtual #742                // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        75: ifeq          84
        78: getstatic     #745                // Field ext/mods/Config.TVT_EVENT_MAGE_BUFFS:Ljava/util/Map;
        81: goto          87
        84: getstatic     #748                // Field ext/mods/Config.TVT_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
        87: astore_2
        88: aload_2
        89: ifnull        101
        92: aload_2
        93: invokeinterface #751,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        98: ifeq          102
       101: return
       102: aload_2
       103: aload_1
       104: invokedynamic #752,  0            // InvokeDynamic #7:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       109: invokeinterface #756,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       114: aload_1
       115: invokevirtual #760                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       118: ifnull        134
       121: aload_1
       122: invokevirtual #760                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       125: astore_3
       126: aload_3
       127: aload_1
       128: getstatic     #764                // Field ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
       131: invokevirtual #770                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       134: invokestatic  #776                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTAntiAFK;
       137: pop
       138: aload_1
       139: invokevirtual #781                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
       142: aload_0
       143: getfield      #33                 // Field _teleported:Ljava/util/Map;
       146: aload_1
       147: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       150: invokestatic  #606                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       153: iconst_1
       154: invokestatic  #784                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       157: invokeinterface #787,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       162: pop
       163: return
      LineNumberTable:
        line 621: 0
        line 622: 22
        line 624: 23
        line 625: 67
        line 627: 71
        line 629: 88
        line 630: 101
        line 632: 102
        line 639: 114
        line 641: 121
        line 642: 126
        line 645: 134
        line 647: 138
        line 648: 142
        line 649: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126       8     3 party   Lext/mods/gameserver/model/group/Party;
            0     164     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0     164     1 player   Lext/mods/gameserver/model/actor/Player;
           88      76     2 buffs   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           88      76     2 buffs   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 9
        frame_type = 22 /* same */
        frame_type = 0 /* same */
        frame_type = 43 /* same */
        frame_type = 3 /* same */
        frame_type = 12 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class java/util/Map ]
        frame_type = 0 /* same */
        frame_type = 31 /* same */

  public boolean isInactive();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #21                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
        14: if_acmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: istore_1
        23: aload_2
        24: monitorexit
        25: goto          33
        28: astore_3
        29: aload_2
        30: monitorexit
        31: aload_3
        32: athrow
        33: iload_1
        34: ireturn
      Exception table:
         from    to  target type
             7    25    28   any
            28    31    28   any
      LineNumberTable:
        line 663: 0
        line 665: 7
        line 666: 23
        line 668: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isInactive   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
           33       2     1 isInactive   Z
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ top, class java/lang/Object ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, int ]
          stack = []

  public boolean isParticipating();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #139                // Field ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
        14: if_acmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: istore_1
        23: aload_2
        24: monitorexit
        25: goto          33
        28: astore_3
        29: aload_2
        30: monitorexit
        31: aload_3
        32: athrow
        33: iload_1
        34: ireturn
      Exception table:
         from    to  target type
             7    25    28   any
            28    31    28   any
      LineNumberTable:
        line 675: 0
        line 677: 7
        line 678: 23
        line 680: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isParticipating   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
           33       2     1 isParticipating   Z
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ top, class java/lang/Object ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, int ]
          stack = []

  public boolean isStarting();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #172                // Field ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
        14: if_acmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: istore_1
        23: aload_2
        24: monitorexit
        25: goto          33
        28: astore_3
        29: aload_2
        30: monitorexit
        31: aload_3
        32: athrow
        33: iload_1
        34: ireturn
      Exception table:
         from    to  target type
             7    25    28   any
            28    31    28   any
      LineNumberTable:
        line 687: 0
        line 689: 7
        line 690: 23
        line 692: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarting   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
           33       2     1 isStarting   Z
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ top, class java/lang/Object ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, int ]
          stack = []

  public boolean isStarted();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #27                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #270                // Field ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
        14: if_acmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: istore_1
        23: aload_2
        24: monitorexit
        25: goto          33
        28: astore_3
        29: aload_2
        30: monitorexit
        31: aload_3
        32: athrow
        33: iload_1
        34: ireturn
      Exception table:
         from    to  target type
             7    25    28   any
            28    31    28   any
      LineNumberTable:
        line 699: 0
        line 701: 7
        line 702: 23
        line 704: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarted   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
           33       2     1 isStarted   Z
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ top, class java/lang/Object ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent, int ]
          stack = []

  public byte getParticipantTeamId(int);
    descriptor: (I)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
         4: iconst_0
         5: aaload
         6: iload_1
         7: invokevirtual #791                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
        10: ifeq          17
        13: iconst_0
        14: goto          35
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        21: iconst_1
        22: aaload
        23: iload_1
        24: invokevirtual #791                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
        27: ifeq          34
        30: iconst_1
        31: goto          35
        34: iconst_m1
        35: i2b
        36: ireturn
      LineNumberTable:
        line 709: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      37     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int[] getParticipantTeamCoordinates(int);
    descriptor: (I)[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
         4: iconst_0
         5: aaload
         6: iload_1
         7: invokevirtual #791                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
        10: ifeq          25
        13: aload_0
        14: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        17: iconst_0
        18: aaload
        19: invokevirtual #275                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getCoordinates:()[I
        22: goto          51
        25: aload_0
        26: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        29: iconst_1
        30: aaload
        31: iload_1
        32: invokevirtual #791                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
        35: ifeq          50
        38: aload_0
        39: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        42: iconst_1
        43: aaload
        44: invokevirtual #275                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getCoordinates:()[I
        47: goto          51
        50: aconst_null
        51: areturn
      LineNumberTable:
        line 714: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      52     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 25 /* same */
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class "[I" ]

  public boolean isPlayerParticipant(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #539                // Method isParticipating:()Z
         4: ifne          23
         7: aload_0
         8: invokevirtual #533                // Method isStarting:()Z
        11: ifne          23
        14: aload_0
        15: invokevirtual #536                // Method isStarted:()Z
        18: ifne          23
        21: iconst_0
        22: ireturn
        23: aload_0
        24: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        27: iconst_0
        28: aaload
        29: iload_1
        30: invokevirtual #791                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
        33: ifne          49
        36: aload_0
        37: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        40: iconst_1
        41: aaload
        42: iload_1
        43: invokevirtual #791                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.containsPlayer:(I)Z
        46: ifeq          53
        49: iconst_1
        50: goto          54
        53: iconst_0
        54: ireturn
      LineNumberTable:
        line 719: 0
        line 720: 21
        line 722: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
            0      55     1 objectId   I
      StackMapTable: number_of_entries = 4
        frame_type = 23 /* same */
        frame_type = 25 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int[] getTeamsPlayerCounts();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: iconst_2
         1: newarray       int
         3: dup
         4: iconst_0
         5: aload_0
         6: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
         9: iconst_0
        10: aaload
        11: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        14: iastore
        15: dup
        16: iconst_1
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        21: iconst_1
        22: aaload
        23: invokevirtual #228                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getParticipatedPlayerCount:()I
        26: iastore
        27: areturn
      LineNumberTable:
        line 727: 0
        line 729: 11
        line 730: 23
        line 727: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;

  public int[] getTeamsPoints();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: iconst_2
         1: newarray       int
         3: dup
         4: iconst_0
         5: aload_0
         6: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
         9: iconst_0
        10: aaload
        11: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
        14: iastore
        15: dup
        16: iconst_1
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam;
        21: iconst_1
        22: aaload
        23: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEventTeam.getPoints:()S
        26: iastore
        27: areturn
      LineNumberTable:
        line 736: 0
        line 738: 11
        line 739: 23
        line 736: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;

  public static final ext.mods.gameserver.model.entity.events.teamvsteam.TvTEvent getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #794                // Field ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
         3: areturn
      LineNumberTable:
        line 745: 0
}
SourceFile: "TvTEvent.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent$SingletonHolder
BootstrapMethods:
  0: #956 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #929 TvTEvent.startParticipation(): exception: \u0001
  1: #962 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #931 (Ljava/lang/Object;)I
      #933 REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
      #936 (Lext/mods/gameserver/model/actor/Player;)I
  2: #956 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #937 Kills: \u0001
  3: #956 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #939 Team vs Team: Event finish! Team \u0001 won with \u0001 kills!
  4: #962 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #941 ()V
      #942 REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$stopFight$0:(Lext/mods/gameserver/model/actor/Player;)V
      #941 ()V
  5: #956 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #945 \u0001 \u0001
  6: #956 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #947 \u0001 Hunted Player \u0001!
  7: #962 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #949 (Ljava/lang/Object;Ljava/lang/Object;)V
      #951 REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #954 (Ljava/lang/Integer;Ljava/lang/Integer;)V
InnerClasses:
  public static final #975= #971 of #973; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
