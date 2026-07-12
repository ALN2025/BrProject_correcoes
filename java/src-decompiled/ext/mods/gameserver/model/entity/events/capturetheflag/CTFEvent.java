// Bytecode for: ext.mods.gameserver.model.entity.events.capturetheflag.CTFEvent
// File: ext\mods\gameserver\model\entity\events\capturetheflag\CTFEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.class
  Last modified 9 de jul de 2026; size 28068 bytes
  MD5 checksum 1e1f7aa2115fdb496644a9c9303c5bcf
  Compiled from "CTFEvent.java"
public class ext.mods.gameserver.model.entity.events.capturetheflag.CTFEvent extends ext.mods.gameserver.model.entity.Events
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  super_class: #2                         // ext/mods/gameserver/model/entity/Events
  interfaces: 0, fields: 16, methods: 51, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/entity/Events."<init>":()V
     #2 = Class              #4           // ext/mods/gameserver/model/entity/Events
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               ext/mods/gameserver/model/entity/Events
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = String             #8           // html/mods/events/ctf/
     #8 = Utf8               html/mods/events/ctf/
     #9 = Fieldref           #10.#11      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.htmlPath:Ljava/lang/String;
    #10 = Class              #12          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
    #11 = NameAndType        #13:#14      // htmlPath:Ljava/lang/String;
    #12 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
    #13 = Utf8               htmlPath
    #14 = Utf8               Ljava/lang/String;
    #15 = Class              #16          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
    #16 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
    #17 = Fieldref           #10.#18      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
    #18 = NameAndType        #19:#20      // _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
    #19 = Utf8               _teams
    #20 = Utf8               [Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
    #21 = Fieldref           #22.#23      // ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
    #22 = Class              #24          // ext/mods/gameserver/enums/EventState
    #23 = NameAndType        #25:#26      // INACTIVE:Lext/mods/gameserver/enums/EventState;
    #24 = Utf8               ext/mods/gameserver/enums/EventState
    #25 = Utf8               INACTIVE
    #26 = Utf8               Lext/mods/gameserver/enums/EventState;
    #27 = Fieldref           #10.#28      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._state:Lext/mods/gameserver/enums/EventState;
    #28 = NameAndType        #29:#26      // _state:Lext/mods/gameserver/enums/EventState;
    #29 = Utf8               _state
    #30 = Class              #31          // java/util/HashMap
    #31 = Utf8               java/util/HashMap
    #32 = Methodref          #30.#3       // java/util/HashMap."<init>":()V
    #33 = Fieldref           #10.#34      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._teleported:Ljava/util/Map;
    #34 = NameAndType        #35:#36      // _teleported:Ljava/util/Map;
    #35 = Utf8               _teleported
    #36 = Utf8               Ljava/util/Map;
    #37 = Methodref          #38.#39      // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
    #38 = Class              #40          // ext/mods/gameserver/data/manager/AntiFeedManager
    #39 = NameAndType        #41:#42      // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
    #40 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
    #41 = Utf8               getInstance
    #42 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
    #43 = Methodref          #38.#44      // ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
    #44 = NameAndType        #45:#46      // registerEvent:(I)V
    #45 = Utf8               registerEvent
    #46 = Utf8               (I)V
    #47 = Fieldref           #48.#49      // ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
    #48 = Class              #50          // ext/mods/Config
    #49 = NameAndType        #51:#14      // CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
    #50 = Utf8               ext/mods/Config
    #51 = Utf8               CTF_EVENT_TEAM_1_NAME
    #52 = Fieldref           #48.#53      // ext/mods/Config.CTF_EVENT_TEAM_1_COORDINATES:[I
    #53 = NameAndType        #54:#55      // CTF_EVENT_TEAM_1_COORDINATES:[I
    #54 = Utf8               CTF_EVENT_TEAM_1_COORDINATES
    #55 = Utf8               [I
    #56 = Methodref          #15.#57      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam."<init>":(Ljava/lang/String;[I)V
    #57 = NameAndType        #5:#58       // "<init>":(Ljava/lang/String;[I)V
    #58 = Utf8               (Ljava/lang/String;[I)V
    #59 = Fieldref           #48.#60      // ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
    #60 = NameAndType        #61:#14      // CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
    #61 = Utf8               CTF_EVENT_TEAM_2_NAME
    #62 = Fieldref           #48.#63      // ext/mods/Config.CTF_EVENT_TEAM_2_COORDINATES:[I
    #63 = NameAndType        #64:#55      // CTF_EVENT_TEAM_2_COORDINATES:[I
    #64 = Utf8               CTF_EVENT_TEAM_2_COORDINATES
    #65 = Methodref          #66.#67      // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
    #66 = Class              #68          // ext/mods/gameserver/data/xml/NpcData
    #67 = NameAndType        #41:#69      // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
    #68 = Utf8               ext/mods/gameserver/data/xml/NpcData
    #69 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
    #70 = Fieldref           #48.#71      // ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_ID:I
    #71 = NameAndType        #72:#73      // CTF_EVENT_PARTICIPATION_NPC_ID:I
    #72 = Utf8               CTF_EVENT_PARTICIPATION_NPC_ID
    #73 = Utf8               I
    #74 = Methodref          #66.#75      // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
    #75 = NameAndType        #76:#77      // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
    #76 = Utf8               getTemplate
    #77 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
    #78 = Fieldref           #10.#79      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.LOGGER:Lext/mods/commons/logging/CLogger;
    #79 = NameAndType        #80:#81      // LOGGER:Lext/mods/commons/logging/CLogger;
    #80 = Utf8               LOGGER
    #81 = Utf8               Lext/mods/commons/logging/CLogger;
    #82 = String             #83          // CTFEvent: EventManager is a NullPointer -> Invalid npc id in configs?
    #83 = Utf8               CTFEvent: EventManager is a NullPointer -> Invalid npc id in configs?
    #84 = Methodref          #85.#86      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
    #85 = Class              #87          // ext/mods/commons/logging/CLogger
    #86 = NameAndType        #88:#89      // warn:(Ljava/lang/Object;)V
    #87 = Utf8               ext/mods/commons/logging/CLogger
    #88 = Utf8               warn
    #89 = Utf8               (Ljava/lang/Object;)V
    #90 = Class              #91          // ext/mods/gameserver/model/spawn/Spawn
    #91 = Utf8               ext/mods/gameserver/model/spawn/Spawn
    #92 = Methodref          #90.#93      // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #93 = NameAndType        #5:#94       // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #94 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #95 = Fieldref           #10.#96      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
    #96 = NameAndType        #97:#98      // _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
    #97 = Utf8               _npcSpawn
    #98 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
    #99 = Fieldref           #48.#100     // ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #100 = NameAndType        #101:#55     // CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #101 = Utf8               CTF_EVENT_PARTICIPATION_NPC_COORDINATES
   #102 = Methodref          #90.#103     // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
   #103 = NameAndType        #104:#105    // setLoc:(IIII)V
   #104 = Utf8               setLoc
   #105 = Utf8               (IIII)V
   #106 = Integer            60000
   #107 = Methodref          #90.#108     // ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
   #108 = NameAndType        #109:#46     // setRespawnDelay:(I)V
   #109 = Utf8               setRespawnDelay
   #110 = Methodref          #111.#112    // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #111 = Class              #113         // ext/mods/gameserver/data/manager/SpawnManager
   #112 = NameAndType        #41:#114     // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #113 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #114 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #115 = Methodref          #111.#116    // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #116 = NameAndType        #117:#118    // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #117 = Utf8               addSpawn
   #118 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
   #119 = Methodref          #90.#120     // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #120 = NameAndType        #121:#122    // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
   #121 = Utf8               doSpawn
   #122 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
   #123 = Fieldref           #10.#124     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
   #124 = NameAndType        #125:#126    // _lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
   #125 = Utf8               _lastNpcSpawn
   #126 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #127 = Class              #128         // java/lang/Exception
   #128 = Utf8               java/lang/Exception
   #129 = Methodref          #127.#130    // java/lang/Exception.getMessage:()Ljava/lang/String;
   #130 = NameAndType        #131:#132    // getMessage:()Ljava/lang/String;
   #131 = Utf8               getMessage
   #132 = Utf8               ()Ljava/lang/String;
   #133 = InvokeDynamic      #0:#134      // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #134 = NameAndType        #135:#136    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #135 = Utf8               makeConcatWithConstants
   #136 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #137 = Methodref          #85.#138     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #138 = NameAndType        #88:#139     // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #139 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #140 = Fieldref           #22.#141     // ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
   #141 = NameAndType        #142:#26     // PARTICIPATING:Lext/mods/gameserver/enums/EventState;
   #142 = Utf8               PARTICIPATING
   #143 = Methodref          #10.#144     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.setState:(Lext/mods/gameserver/enums/EventState;)V
   #144 = NameAndType        #145:#146    // setState:(Lext/mods/gameserver/enums/EventState;)V
   #145 = Utf8               setState
   #146 = Utf8               (Lext/mods/gameserver/enums/EventState;)V
   #147 = InterfaceMethodref #148.#149    // java/util/List.stream:()Ljava/util/stream/Stream;
   #148 = Class              #150         // java/util/List
   #149 = NameAndType        #151:#152    // stream:()Ljava/util/stream/Stream;
   #150 = Utf8               java/util/List
   #151 = Utf8               stream
   #152 = Utf8               ()Ljava/util/stream/Stream;
   #153 = InvokeDynamic      #1:#154      // #1:applyAsInt:()Ljava/util/function/ToIntFunction;
   #154 = NameAndType        #155:#156    // applyAsInt:()Ljava/util/function/ToIntFunction;
   #155 = Utf8               applyAsInt
   #156 = Utf8               ()Ljava/util/function/ToIntFunction;
   #157 = InterfaceMethodref #158.#159    // java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
   #158 = Class              #160         // java/util/Comparator
   #159 = NameAndType        #161:#162    // comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
   #160 = Utf8               java/util/Comparator
   #161 = Utf8               comparingInt
   #162 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
   #163 = InterfaceMethodref #164.#165    // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #164 = Class              #166         // java/util/stream/Stream
   #165 = NameAndType        #167:#168    // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #166 = Utf8               java/util/stream/Stream
   #167 = Utf8               sorted
   #168 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #169 = InterfaceMethodref #164.#170    // java/util/stream/Stream.toList:()Ljava/util/List;
   #170 = NameAndType        #171:#172    // toList:()Ljava/util/List;
   #171 = Utf8               toList
   #172 = Utf8               ()Ljava/util/List;
   #173 = Fieldref           #22.#174     // ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
   #174 = NameAndType        #175:#26     // STARTING:Lext/mods/gameserver/enums/EventState;
   #175 = Utf8               STARTING
   #176 = Methodref          #15.#177     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
   #177 = NameAndType        #178:#179    // getParticipatedPlayers:()Ljava/util/Map;
   #178 = Utf8               getParticipatedPlayers
   #179 = Utf8               ()Ljava/util/Map;
   #180 = InterfaceMethodref #181.#182    // java/util/Map.putAll:(Ljava/util/Map;)V
   #181 = Class              #183         // java/util/Map
   #182 = NameAndType        #184:#185    // putAll:(Ljava/util/Map;)V
   #183 = Utf8               java/util/Map
   #184 = Utf8               putAll
   #185 = Utf8               (Ljava/util/Map;)V
   #186 = Methodref          #15.#187     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
   #187 = NameAndType        #188:#6      // cleanMe:()V
   #188 = Utf8               cleanMe
   #189 = Methodref          #10.#190     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.needParticipationFee:()Z
   #190 = NameAndType        #191:#192    // needParticipationFee:()Z
   #191 = Utf8               needParticipationFee
   #192 = Utf8               ()Z
   #193 = InterfaceMethodref #181.#194    // java/util/Map.values:()Ljava/util/Collection;
   #194 = NameAndType        #195:#196    // values:()Ljava/util/Collection;
   #195 = Utf8               values
   #196 = Utf8               ()Ljava/util/Collection;
   #197 = InterfaceMethodref #198.#199    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #198 = Class              #200         // java/util/Collection
   #199 = NameAndType        #201:#202    // iterator:()Ljava/util/Iterator;
   #200 = Utf8               java/util/Collection
   #201 = Utf8               iterator
   #202 = Utf8               ()Ljava/util/Iterator;
   #203 = InterfaceMethodref #204.#205    // java/util/Iterator.hasNext:()Z
   #204 = Class              #206         // java/util/Iterator
   #205 = NameAndType        #207:#192    // hasNext:()Z
   #206 = Utf8               java/util/Iterator
   #207 = Utf8               hasNext
   #208 = InterfaceMethodref #204.#209    // java/util/Iterator.next:()Ljava/lang/Object;
   #209 = NameAndType        #210:#211    // next:()Ljava/lang/Object;
   #210 = Utf8               next
   #211 = Utf8               ()Ljava/lang/Object;
   #212 = Class              #213         // ext/mods/gameserver/model/actor/Player
   #213 = Utf8               ext/mods/gameserver/model/actor/Player
   #214 = Methodref          #10.#215     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.hasParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
   #215 = NameAndType        #216:#217    // hasParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
   #216 = Utf8               hasParticipationFee
   #217 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #218 = InterfaceMethodref #204.#219    // java/util/Iterator.remove:()V
   #219 = NameAndType        #220:#6      // remove:()V
   #220 = Utf8               remove
   #221 = Class              #222         // java/util/ArrayList
   #222 = Utf8               java/util/ArrayList
   #223 = Methodref          #221.#224    // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #224 = NameAndType        #5:#225      // "<init>":(Ljava/util/Collection;)V
   #225 = Utf8               (Ljava/util/Collection;)V
   #226 = Methodref          #10.#227     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sortPlayersByLevel:(Ljava/util/List;)Ljava/util/List;
   #227 = NameAndType        #228:#229    // sortPlayersByLevel:(Ljava/util/List;)Ljava/util/List;
   #228 = Utf8               sortPlayersByLevel
   #229 = Utf8               (Ljava/util/List;)Ljava/util/List;
   #230 = InterfaceMethodref #148.#231    // java/util/List.isEmpty:()Z
   #231 = NameAndType        #232:#192    // isEmpty:()Z
   #232 = Utf8               isEmpty
   #233 = InterfaceMethodref #148.#234    // java/util/List.size:()I
   #234 = NameAndType        #235:#236    // size:()I
   #235 = Utf8               size
   #236 = Utf8               ()I
   #237 = InterfaceMethodref #148.#238    // java/util/List.remove:(I)Ljava/lang/Object;
   #238 = NameAndType        #220:#239    // remove:(I)Ljava/lang/Object;
   #239 = Utf8               (I)Ljava/lang/Object;
   #240 = Methodref          #15.#241     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
   #241 = NameAndType        #242:#217    // addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
   #242 = Utf8               addPlayer
   #243 = Methodref          #212.#244    // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #244 = NameAndType        #245:#246    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #245 = Utf8               getStatus
   #246 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #247 = Methodref          #248.#249    // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #248 = Class              #250         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #249 = NameAndType        #251:#236    // getLevel:()I
   #250 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #251 = Utf8               getLevel
   #252 = Methodref          #15.#253     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
   #253 = NameAndType        #254:#236    // getParticipatedPlayerCount:()I
   #254 = Utf8               getParticipatedPlayerCount
   #255 = Fieldref           #48.#256     // ext/mods/Config.CTF_EVENT_MIN_PLAYERS_IN_TEAMS:I
   #256 = NameAndType        #257:#73     // CTF_EVENT_MIN_PLAYERS_IN_TEAMS:I
   #257 = Utf8               CTF_EVENT_MIN_PLAYERS_IN_TEAMS
   #258 = Fieldref           #48.#259     // ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
   #259 = NameAndType        #260:#55     // CTF_EVENT_PARTICIPATION_FEE:[I
   #260 = Utf8               CTF_EVENT_PARTICIPATION_FEE
   #261 = Methodref          #212.#262    // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #262 = NameAndType        #263:#264    // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #263 = Utf8               addItem
   #264 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #265 = Methodref          #10.#266     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.unSpawnNpc:()V
   #266 = NameAndType        #267:#6      // unSpawnNpc:()V
   #267 = Utf8               unSpawnNpc
   #268 = Methodref          #38.#269     // ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
   #269 = NameAndType        #270:#46     // clear:(I)V
   #270 = Utf8               clear
   #271 = Methodref          #10.#272     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
   #272 = NameAndType        #273:#217    // payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
   #273 = Utf8               payParticipationFee
   #274 = Methodref          #10.#275     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.spawnFirstHeadQuarters:()V
   #275 = NameAndType        #276:#6      // spawnFirstHeadQuarters:()V
   #276 = Utf8               spawnFirstHeadQuarters
   #277 = Methodref          #10.#278     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.spawnSecondHeadQuarters:()V
   #278 = NameAndType        #279:#6      // spawnSecondHeadQuarters:()V
   #279 = Utf8               spawnSecondHeadQuarters
   #280 = Fieldref           #48.#281     // ext/mods/Config.CTF_DOORS_IDS_TO_CLOSE:Ljava/util/List;
   #281 = NameAndType        #282:#283    // CTF_DOORS_IDS_TO_CLOSE:Ljava/util/List;
   #282 = Utf8               CTF_DOORS_IDS_TO_CLOSE
   #283 = Utf8               Ljava/util/List;
   #284 = Methodref          #10.#285     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.closeDoors:(Ljava/util/List;)V
   #285 = NameAndType        #286:#287    // closeDoors:(Ljava/util/List;)V
   #286 = Utf8               closeDoors
   #287 = Utf8               (Ljava/util/List;)V
   #288 = Fieldref           #22.#289     // ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
   #289 = NameAndType        #290:#26     // STARTED:Lext/mods/gameserver/enums/EventState;
   #290 = Utf8               STARTED
   #291 = Class              #292         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
   #292 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
   #293 = Methodref          #15.#294     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getCoordinates:()[I
   #294 = NameAndType        #295:#296    // getCoordinates:()[I
   #295 = Utf8               getCoordinates
   #296 = Utf8               ()[I
   #297 = Methodref          #291.#298    // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #298 = NameAndType        #5:#299      // "<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #299 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
   #300 = Methodref          #15.#301     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
   #301 = NameAndType        #302:#303    // getPoints:()S
   #302 = Utf8               getPoints
   #303 = Utf8               ()S
   #304 = Fieldref           #22.#305     // ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
   #305 = NameAndType        #306:#26     // REWARDING:Lext/mods/gameserver/enums/EventState;
   #306 = Utf8               REWARDING
   #307 = String             #308         // CTF Event: Event has ended. No team won due to inactivity!
   #308 = Utf8               CTF Event: Event has ended. No team won due to inactivity!
   #309 = String             #310         // Event has ended, both teams have tied.
   #310 = Utf8               Event has ended, both teams have tied.
   #311 = Methodref          #10.#312     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
   #312 = NameAndType        #313:#314    // sysMsgToAllParticipants:(Ljava/lang/String;)V
   #313 = Utf8               sysMsgToAllParticipants
   #314 = Utf8               (Ljava/lang/String;)V
   #315 = Fieldref           #48.#316     // ext/mods/Config.CTF_REWARD_TEAM_TIE:Z
   #316 = NameAndType        #317:#318    // CTF_REWARD_TEAM_TIE:Z
   #317 = Utf8               CTF_REWARD_TEAM_TIE
   #318 = Utf8               Z
   #319 = Methodref          #10.#320     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.rewardTeam:(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;)V
   #320 = NameAndType        #321:#322    // rewardTeam:(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;)V
   #321 = Utf8               rewardTeam
   #322 = Utf8               (Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;)V
   #323 = String             #324         // CTF Event: Event has ended with both teams tying.
   #324 = Utf8               CTF Event: Event has ended with both teams tying.
   #325 = Methodref          #15.#326     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
   #326 = NameAndType        #327:#132    // getName:()Ljava/lang/String;
   #327 = Utf8               getName
   #328 = InvokeDynamic      #2:#329      // #2:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
   #329 = NameAndType        #135:#330    // makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
   #330 = Utf8               (Ljava/lang/String;S)Ljava/lang/String;
   #331 = Fieldref           #48.#332     // ext/mods/Config.CTF_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #332 = NameAndType        #333:#334    // CTF_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #333 = Utf8               CTF_EVENT_REWARDS
   #334 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
   #335 = Methodref          #212.#336    // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #336 = NameAndType        #337:#338    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #337 = Utf8               getInventory
   #338 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #339 = Methodref          #340.#341    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #340 = Class              #342         // ext/mods/gameserver/data/xml/ItemData
   #341 = NameAndType        #41:#343     // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #342 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #343 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #344 = Methodref          #345.#346    // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #345 = Class              #347         // ext/mods/gameserver/model/holder/IntIntHolder
   #346 = NameAndType        #348:#236    // getId:()I
   #347 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #348 = Utf8               getId
   #349 = Methodref          #340.#350    // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #350 = NameAndType        #76:#351     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #351 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #352 = Methodref          #353.#354    // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
   #353 = Class              #355         // ext/mods/gameserver/model/item/kind/Item
   #354 = NameAndType        #356:#192    // isStackable:()Z
   #355 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #356 = Utf8               isStackable
   #357 = Methodref          #345.#358    // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
   #358 = NameAndType        #359:#236    // getValue:()I
   #359 = Utf8               getValue
   #360 = Methodref          #361.#362    // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #361 = Class              #363         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #362 = NameAndType        #263:#364    // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #363 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #364 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #365 = Fieldref           #366.#367    // ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
   #366 = Class              #368         // ext/mods/gameserver/network/SystemMessageId
   #367 = NameAndType        #369:#370    // EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
   #368 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #369 = Utf8               EARNED_S2_S1_S
   #370 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #371 = Methodref          #372.#373    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #372 = Class              #374         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #373 = NameAndType        #375:#376    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #374 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #375 = Utf8               getSystemMessage
   #376 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #377 = Methodref          #372.#378    // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #378 = NameAndType        #379:#380    // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #379 = Utf8               addItemName
   #380 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #381 = Methodref          #372.#382    // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #382 = NameAndType        #383:#380    // addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #383 = Utf8               addItemNumber
   #384 = Fieldref           #366.#385    // ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
   #385 = NameAndType        #386:#370    // EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
   #386 = Utf8               EARNED_ITEM_S1
   #387 = Methodref          #212.#388    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #388 = NameAndType        #389:#390    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #389 = Utf8               sendPacket
   #390 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #391 = Class              #392         // ext/mods/gameserver/network/serverpackets/StatusUpdate
   #392 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
   #393 = Methodref          #391.#394    // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #394 = NameAndType        #5:#395      // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #395 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #396 = Class              #397         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #397 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #398 = Methodref          #396.#399    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #399 = NameAndType        #5:#46       // "<init>":(I)V
   #400 = Fieldref           #401.#402    // ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
   #401 = Class              #403         // ext/mods/gameserver/enums/StatusType
   #402 = NameAndType        #404:#405    // CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
   #403 = Utf8               ext/mods/gameserver/enums/StatusType
   #404 = Utf8               CUR_LOAD
   #405 = Utf8               Lext/mods/gameserver/enums/StatusType;
   #406 = Methodref          #212.#407    // ext/mods/gameserver/model/actor/Player.getCurrentWeight:()I
   #407 = NameAndType        #408:#236    // getCurrentWeight:()I
   #408 = Utf8               getCurrentWeight
   #409 = Methodref          #391.#410    // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
   #410 = NameAndType        #411:#412    // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
   #411 = Utf8               addAttribute
   #412 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
   #413 = Methodref          #414.#415    // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #414 = Class              #416         // ext/mods/gameserver/data/HTMLData
   #415 = NameAndType        #41:#417     // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #416 = Utf8               ext/mods/gameserver/data/HTMLData
   #417 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #418 = String             #419         // html/mods/events/ctf/Reward.htm
   #419 = Utf8               html/mods/events/ctf/Reward.htm
   #420 = Methodref          #414.#421    // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #421 = NameAndType        #422:#423    // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #422 = Utf8               getHtm
   #423 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #424 = Methodref          #396.#425    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #425 = NameAndType        #426:#314    // setHtml:(Ljava/lang/String;)V
   #426 = Utf8               setHtml
   #427 = Fieldref           #22.#428     // ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
   #428 = NameAndType        #429:#26     // INACTIVATING:Lext/mods/gameserver/enums/EventState;
   #429 = Utf8               INACTIVATING
   #430 = Methodref          #10.#431     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.openDoors:(Ljava/util/List;)V
   #431 = NameAndType        #432:#287    // openDoors:(Ljava/util/List;)V
   #432 = Utf8               openDoors
   #433 = Fieldref           #10.#434     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._team1Carrier:Lext/mods/gameserver/model/actor/Player;
   #434 = NameAndType        #435:#436    // _team1Carrier:Lext/mods/gameserver/model/actor/Player;
   #435 = Utf8               _team1Carrier
   #436 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #437 = Methodref          #10.#438     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
   #438 = NameAndType        #439:#440    // removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
   #439 = Utf8               removeFlagCarrier
   #440 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #441 = Fieldref           #10.#442     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._team2Carrier:Lext/mods/gameserver/model/actor/Player;
   #442 = NameAndType        #443:#436    // _team2Carrier:Lext/mods/gameserver/model/actor/Player;
   #443 = Utf8               _team2Carrier
   #444 = Methodref          #445.#446    // ext/mods/commons/random/Rnd.get:(I)I
   #445 = Class              #447         // ext/mods/commons/random/Rnd
   #446 = NameAndType        #448:#449    // get:(I)I
   #447 = Utf8               ext/mods/commons/random/Rnd
   #448 = Utf8               get
   #449 = Utf8               (I)I
   #450 = Methodref          #10.#451     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipantTeamId:(I)B
   #451 = NameAndType        #452:#453    // getParticipantTeamId:(I)B
   #452 = Utf8               getParticipantTeamId
   #453 = Utf8               (I)B
   #454 = Methodref          #15.#455     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.removePlayer:(I)V
   #455 = NameAndType        #456:#46     // removePlayer:(I)V
   #456 = Utf8               removePlayer
   #457 = Methodref          #361.#458    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(II)I
   #458 = NameAndType        #459:#460    // getItemCount:(II)I
   #459 = Utf8               getItemCount
   #460 = Utf8               (II)I
   #461 = Methodref          #212.#462    // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
   #462 = NameAndType        #463:#464    // destroyItemByItemId:(IIZ)Z
   #463 = Utf8               destroyItemByItemId
   #464 = Utf8               (IIZ)Z
   #465 = String             #466         // -
   #466 = Utf8               -
   #467 = Methodref          #468.#469    // java/lang/String.valueOf:(I)Ljava/lang/String;
   #468 = Class              #470         // java/lang/String
   #469 = NameAndType        #471:#472    // valueOf:(I)Ljava/lang/String;
   #470 = Utf8               java/lang/String
   #471 = Utf8               valueOf
   #472 = Utf8               (I)Ljava/lang/String;
   #473 = Methodref          #353.#326    // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #474 = InvokeDynamic      #3:#475      // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #475 = NameAndType        #135:#476    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #476 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #477 = Class              #478         // ext/mods/gameserver/network/serverpackets/CreatureSay
   #478 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
   #479 = Fieldref           #480.#481    // ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
   #480 = Class              #482         // ext/mods/gameserver/enums/SayType
   #481 = NameAndType        #483:#484    // PARTY:Lext/mods/gameserver/enums/SayType;
   #482 = Utf8               ext/mods/gameserver/enums/SayType
   #483 = Utf8               PARTY
   #484 = Utf8               Lext/mods/gameserver/enums/SayType;
   #485 = String             #486         // Event Manager
   #486 = Utf8               Event Manager
   #487 = Methodref          #477.#488    // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #488 = NameAndType        #5:#489      // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #489 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
   #490 = Fieldref           #48.#491     // ext/mods/Config.CTF_EVENT_TEAM_1_HEADQUARTERS_ID:I
   #491 = NameAndType        #492:#73     // CTF_EVENT_TEAM_1_HEADQUARTERS_ID:I
   #492 = Utf8               CTF_EVENT_TEAM_1_HEADQUARTERS_ID
   #493 = String             #494         // CTFEvent: First Head Quater is a NullPointer -> Invalid npc id in configs?
   #494 = Utf8               CTFEvent: First Head Quater is a NullPointer -> Invalid npc id in configs?
   #495 = Fieldref           #10.#496     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._flag1Spawn:Lext/mods/gameserver/model/spawn/Spawn;
   #496 = NameAndType        #497:#98     // _flag1Spawn:Lext/mods/gameserver/model/spawn/Spawn;
   #497 = Utf8               _flag1Spawn
   #498 = Fieldref           #48.#499     // ext/mods/Config.CTF_EVENT_TEAM_1_FLAG_COORDINATES:[I
   #499 = NameAndType        #500:#55     // CTF_EVENT_TEAM_1_FLAG_COORDINATES:[I
   #500 = Utf8               CTF_EVENT_TEAM_1_FLAG_COORDINATES
   #501 = Fieldref           #10.#502     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._lastFlag1Spawn:Lext/mods/gameserver/model/actor/Npc;
   #502 = NameAndType        #503:#126    // _lastFlag1Spawn:Lext/mods/gameserver/model/actor/Npc;
   #503 = Utf8               _lastFlag1Spawn
   #504 = Methodref          #505.#506    // ext/mods/gameserver/model/actor/Npc.setTitle:(Ljava/lang/String;)V
   #505 = Class              #507         // ext/mods/gameserver/model/actor/Npc
   #506 = NameAndType        #508:#314    // setTitle:(Ljava/lang/String;)V
   #507 = Utf8               ext/mods/gameserver/model/actor/Npc
   #508 = Utf8               setTitle
   #509 = InvokeDynamic      #4:#134      // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #510 = Fieldref           #48.#511     // ext/mods/Config.CTF_EVENT_TEAM_2_HEADQUARTERS_ID:I
   #511 = NameAndType        #512:#73     // CTF_EVENT_TEAM_2_HEADQUARTERS_ID:I
   #512 = Utf8               CTF_EVENT_TEAM_2_HEADQUARTERS_ID
   #513 = String             #514         // CTFEvent: Second Head Quater is a NullPointer -> Invalid npc id in configs?
   #514 = Utf8               CTFEvent: Second Head Quater is a NullPointer -> Invalid npc id in configs?
   #515 = Fieldref           #10.#516     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._flag2Spawn:Lext/mods/gameserver/model/spawn/Spawn;
   #516 = NameAndType        #517:#98     // _flag2Spawn:Lext/mods/gameserver/model/spawn/Spawn;
   #517 = Utf8               _flag2Spawn
   #518 = Fieldref           #48.#519     // ext/mods/Config.CTF_EVENT_TEAM_2_FLAG_COORDINATES:[I
   #519 = NameAndType        #520:#55     // CTF_EVENT_TEAM_2_FLAG_COORDINATES:[I
   #520 = Utf8               CTF_EVENT_TEAM_2_FLAG_COORDINATES
   #521 = Fieldref           #10.#522     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._lastFlag2Spawn:Lext/mods/gameserver/model/actor/Npc;
   #522 = NameAndType        #523:#126    // _lastFlag2Spawn:Lext/mods/gameserver/model/actor/Npc;
   #523 = Utf8               _lastFlag2Spawn
   #524 = InvokeDynamic      #5:#134      // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #525 = Methodref          #505.#526    // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
   #526 = NameAndType        #527:#6      // deleteMe:()V
   #527 = Utf8               deleteMe
   #528 = Methodref          #505.#529    // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #529 = NameAndType        #530:#531    // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #530 = Utf8               getSpawn
   #531 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
   #532 = Methodref          #111.#533    // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #533 = NameAndType        #534:#118    // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #534 = Utf8               deleteSpawn
   #535 = Methodref          #90.#536     // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
   #536 = NameAndType        #537:#6      // doDelete:()V
   #537 = Utf8               doDelete
   #538 = Methodref          #10.#539     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
   #539 = NameAndType        #540:#192    // isStarting:()Z
   #540 = Utf8               isStarting
   #541 = Methodref          #10.#542     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #542 = NameAndType        #543:#192    // isStarted:()Z
   #543 = Utf8               isStarted
   #544 = Methodref          #212.#545    // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #545 = NameAndType        #546:#236    // getObjectId:()I
   #546 = Utf8               getObjectId
   #547 = Methodref          #10.#548     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
   #548 = NameAndType        #549:#192    // isParticipating:()Z
   #549 = Utf8               isParticipating
   #550 = Methodref          #551.#552    // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
   #551 = Class              #553         // ext/mods/Safedisconect/SafeDisconnectManager
   #552 = NameAndType        #41:#554     // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
   #553 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
   #554 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
   #555 = Methodref          #551.#556    // ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
   #556 = NameAndType        #557:#217    // isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
   #557 = Utf8               isSafeDisconnectActive
   #558 = Fieldref           #48.#559     // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_CTF:Z
   #559 = NameAndType        #560:#318    // SAFEDISCONNECT_INTEGRATION_CTF:Z
   #560 = Utf8               SAFEDISCONNECT_INTEGRATION_CTF
   #561 = Methodref          #10.#562     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
   #562 = NameAndType        #563:#217    // playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
   #563 = Utf8               playerIsCarrier
   #564 = Methodref          #10.#565     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeParticipant:(I)Z
   #565 = NameAndType        #566:#567    // removeParticipant:(I)Z
   #566 = Utf8               removeParticipant
   #567 = Utf8               (I)Z
   #568 = Methodref          #212.#569    // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
   #569 = NameAndType        #570:#571    // teleportTo:(IIII)Z
   #570 = Utf8               teleportTo
   #571 = Utf8               (IIII)Z
   #572 = String             #573         // ctf_event_participation
   #573 = Utf8               ctf_event_participation
   #574 = Methodref          #468.#575    // java/lang/String.equals:(Ljava/lang/Object;)Z
   #575 = NameAndType        #576:#577    // equals:(Ljava/lang/Object;)Z
   #576 = Utf8               equals
   #577 = Utf8               (Ljava/lang/Object;)Z
   #578 = Methodref          #212.#579    // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
   #579 = NameAndType        #580:#192    // isCursedWeaponEquipped:()Z
   #580 = Utf8               isCursedWeaponEquipped
   #581 = String             #582         // html/mods/events/ctf/CursedWeaponEquipped.htm
   #582 = Utf8               html/mods/events/ctf/CursedWeaponEquipped.htm
   #583 = Methodref          #584.#585    // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #584 = Class              #586         // ext/mods/gameserver/model/olympiad/OlympiadManager
   #585 = NameAndType        #41:#587     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #586 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
   #587 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #588 = Methodref          #584.#589    // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
   #589 = NameAndType        #590:#217    // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
   #590 = Utf8               isRegistered
   #591 = String             #592         // html/mods/events/ctf/Olympiad.htm
   #592 = Utf8               html/mods/events/ctf/Olympiad.htm
   #593 = Methodref          #212.#594    // ext/mods/gameserver/model/actor/Player.getKarma:()I
   #594 = NameAndType        #595:#236    // getKarma:()I
   #595 = Utf8               getKarma
   #596 = String             #597         // html/mods/events/ctf/Karma.htm
   #597 = Utf8               html/mods/events/ctf/Karma.htm
   #598 = Fieldref           #48.#599     // ext/mods/Config.CTF_EVENT_MIN_LVL:B
   #599 = NameAndType        #600:#601    // CTF_EVENT_MIN_LVL:B
   #600 = Utf8               CTF_EVENT_MIN_LVL
   #601 = Utf8               B
   #602 = Fieldref           #48.#603     // ext/mods/Config.CTF_EVENT_MAX_LVL:B
   #603 = NameAndType        #604:#601    // CTF_EVENT_MAX_LVL:B
   #604 = Utf8               CTF_EVENT_MAX_LVL
   #605 = String             #606         // html/mods/events/ctf/Level.htm
   #606 = Utf8               html/mods/events/ctf/Level.htm
   #607 = String             #608         // %min%
   #608 = Utf8               %min%
   #609 = Methodref          #396.#610    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #610 = NameAndType        #611:#612    // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #611 = Utf8               replace
   #612 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #613 = String             #614         // %max%
   #614 = Utf8               %max%
   #615 = Fieldref           #48.#616     // ext/mods/Config.CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
   #616 = NameAndType        #617:#73     // CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
   #617 = Utf8               CTF_EVENT_MAX_PLAYERS_IN_TEAMS
   #618 = String             #619         // html/mods/events/ctf/TeamsFull.htm
   #619 = Utf8               html/mods/events/ctf/TeamsFull.htm
   #620 = Fieldref           #48.#621     // ext/mods/Config.CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
   #621 = NameAndType        #622:#73     // CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
   #622 = Utf8               CTF_EVENT_MAX_PARTICIPANTS_PER_IP
   #623 = Methodref          #38.#624     // ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
   #624 = NameAndType        #625:#626    // tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
   #625 = Utf8               tryAddPlayer
   #626 = Utf8               (ILext/mods/gameserver/model/actor/Player;I)Z
   #627 = String             #628         // html/mods/events/ctf/IPRestriction.htm
   #628 = Utf8               html/mods/events/ctf/IPRestriction.htm
   #629 = Methodref          #38.#630     // ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
   #630 = NameAndType        #631:#632    // getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
   #631 = Utf8               getLimit
   #632 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)I
   #633 = String             #634         // html/mods/events/ctf/ParticipationFee.htm
   #634 = Utf8               html/mods/events/ctf/ParticipationFee.htm
   #635 = String             #636         // %fee%
   #636 = Utf8               %fee%
   #637 = Methodref          #10.#638     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipationFee:()Ljava/lang/String;
   #638 = NameAndType        #639:#132    // getParticipationFee:()Ljava/lang/String;
   #639 = Utf8               getParticipationFee
   #640 = Methodref          #10.#641     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #641 = NameAndType        #642:#217    // addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #642 = Utf8               addParticipant
   #643 = String             #644         // html/mods/events/ctf/Registered.htm
   #644 = Utf8               html/mods/events/ctf/Registered.htm
   #645 = String             #646         // ctf_event_remove_participation
   #646 = Utf8               ctf_event_remove_participation
   #647 = String             #648         // html/mods/events/ctf/Unregistered.htm
   #648 = Utf8               html/mods/events/ctf/Unregistered.htm
   #649 = Methodref          #212.#650    // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #650 = NameAndType        #651:#192    // isGM:()Z
   #651 = Utf8               isGM
   #652 = Fieldref           #653.#654    // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #653 = Class              #655         // ext/mods/gameserver/network/serverpackets/ActionFailed
   #654 = NameAndType        #656:#657    // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #655 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #656 = Utf8               STATIC_PACKET
   #657 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #658 = Fieldref           #48.#659     // ext/mods/Config.CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
   #659 = NameAndType        #660:#318    // CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
   #660 = Utf8               CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED
   #661 = Methodref          #10.#662     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
   #662 = NameAndType        #663:#567    // isPlayerParticipant:(I)Z
   #663 = Utf8               isPlayerParticipant
   #664 = Fieldref           #48.#665     // ext/mods/Config.CTF_EVENT_SCROLL_ALLOWED:Z
   #665 = NameAndType        #666:#318    // CTF_EVENT_SCROLL_ALLOWED:Z
   #666 = Utf8               CTF_EVENT_SCROLL_ALLOWED
   #667 = Fieldref           #48.#668     // ext/mods/Config.CTF_EVENT_POTIONS_ALLOWED:Z
   #668 = NameAndType        #669:#318    // CTF_EVENT_POTIONS_ALLOWED:Z
   #669 = Utf8               CTF_EVENT_POTIONS_ALLOWED
   #670 = Fieldref           #48.#671     // ext/mods/Config.CTF_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
   #671 = NameAndType        #672:#318    // CTF_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
   #672 = Utf8               CTF_EVENT_SUMMON_BY_ITEM_ALLOWED
   #673 = Class              #674         // ext/mods/gameserver/model/actor/instance/Pet
   #674 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #675 = Class              #676         // ext/mods/gameserver/model/actor/Summon
   #676 = Utf8               ext/mods/gameserver/model/actor/Summon
   #677 = Methodref          #675.#678    // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #678 = NameAndType        #679:#680    // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #679 = Utf8               getOwner
   #680 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #681 = Methodref          #212.#326    // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #682 = InvokeDynamic      #6:#475      // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #683 = Methodref          #684.#685    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #684 = Class              #686         // java/lang/Integer
   #685 = NameAndType        #471:#687    // valueOf:(I)Ljava/lang/Integer;
   #686 = Utf8               java/lang/Integer
   #687 = Utf8               (I)Ljava/lang/Integer;
   #688 = InterfaceMethodref #181.#689    // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #689 = NameAndType        #690:#577    // containsKey:(Ljava/lang/Object;)Z
   #690 = Utf8               containsKey
   #691 = InterfaceMethodref #181.#692    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #692 = NameAndType        #448:#693    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #693 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #694 = Class              #695         // java/lang/Boolean
   #695 = Utf8               java/lang/Boolean
   #696 = Methodref          #694.#697    // java/lang/Boolean.booleanValue:()Z
   #697 = NameAndType        #698:#192    // booleanValue:()Z
   #698 = Utf8               booleanValue
   #699 = Methodref          #10.#700     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
   #700 = NameAndType        #701:#440    // spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
   #701 = Utf8               spawnProtection
   #702 = Methodref          #212.#703    // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
   #703 = NameAndType        #704:#192    // isMageClass:()Z
   #704 = Utf8               isMageClass
   #705 = Fieldref           #48.#706     // ext/mods/Config.CTF_EVENT_MAGE_BUFFS:Ljava/util/Map;
   #706 = NameAndType        #707:#36     // CTF_EVENT_MAGE_BUFFS:Ljava/util/Map;
   #707 = Utf8               CTF_EVENT_MAGE_BUFFS
   #708 = Fieldref           #48.#709     // ext/mods/Config.CTF_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
   #709 = NameAndType        #710:#36     // CTF_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
   #710 = Utf8               CTF_EVENT_FIGHTER_BUFFS
   #711 = InterfaceMethodref #181.#231    // java/util/Map.isEmpty:()Z
   #712 = InvokeDynamic      #7:#713      // #7:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #713 = NameAndType        #714:#715    // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #714 = Utf8               accept
   #715 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
   #716 = InterfaceMethodref #181.#717    // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
   #717 = NameAndType        #718:#719    // forEach:(Ljava/util/function/BiConsumer;)V
   #718 = Utf8               forEach
   #719 = Utf8               (Ljava/util/function/BiConsumer;)V
   #720 = Methodref          #212.#721    // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #721 = NameAndType        #722:#723    // getParty:()Lext/mods/gameserver/model/group/Party;
   #722 = Utf8               getParty
   #723 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #724 = Fieldref           #725.#726    // ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
   #725 = Class              #727         // ext/mods/gameserver/enums/MessageType
   #726 = NameAndType        #728:#729    // LEFT:Lext/mods/gameserver/enums/MessageType;
   #727 = Utf8               ext/mods/gameserver/enums/MessageType
   #728 = Utf8               LEFT
   #729 = Utf8               Lext/mods/gameserver/enums/MessageType;
   #730 = Methodref          #731.#732    // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
   #731 = Class              #733         // ext/mods/gameserver/model/group/Party
   #732 = NameAndType        #734:#735    // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
   #733 = Utf8               ext/mods/gameserver/model/group/Party
   #734 = Utf8               removePartyMember
   #735 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
   #736 = Methodref          #212.#737    // ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
   #737 = NameAndType        #738:#6      // stopAllEffectsDebuff:()V
   #738 = Utf8               stopAllEffectsDebuff
   #739 = Methodref          #694.#740    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #740 = NameAndType        #471:#741    // valueOf:(Z)Ljava/lang/Boolean;
   #741 = Utf8               (Z)Ljava/lang/Boolean;
   #742 = InterfaceMethodref #181.#743    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #743 = NameAndType        #744:#745    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #744 = Utf8               put
   #745 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #746 = Methodref          #15.#747     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
   #747 = NameAndType        #748:#567    // containsPlayer:(I)Z
   #748 = Utf8               containsPlayer
   #749 = Fieldref           #750.#751    // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #750 = Class              #752         // ext/mods/gameserver/enums/Paperdoll
   #751 = NameAndType        #753:#754    // RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #752 = Utf8               ext/mods/gameserver/enums/Paperdoll
   #753 = Utf8               RHAND
   #754 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
   #755 = Methodref          #361.#756    // ext/mods/gameserver/model/itemcontainer/PcInventory.hasItemIn:(Lext/mods/gameserver/enums/Paperdoll;)Z
   #756 = NameAndType        #757:#758    // hasItemIn:(Lext/mods/gameserver/enums/Paperdoll;)Z
   #757 = Utf8               hasItemIn
   #758 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Z
   #759 = Methodref          #361.#760    // ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #760 = NameAndType        #761:#762    // unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #761 = Utf8               unequipItemInBodySlotAndRecord
   #762 = Utf8               (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #763 = Fieldref           #750.#764    // ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
   #764 = NameAndType        #765:#754    // LHAND:Lext/mods/gameserver/enums/Paperdoll;
   #765 = Utf8               LHAND
   #766 = Methodref          #10.#767     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
   #767 = NameAndType        #768:#769    // getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
   #768 = Utf8               getEnemyTeamFlagId
   #769 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
   #770 = Methodref          #361.#771    // ext/mods/gameserver/model/itemcontainer/PcInventory.unblock:()V
   #771 = NameAndType        #772:#6      // unblock:()V
   #772 = Utf8               unblock
   #773 = Fieldref           #10.#774     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._team1CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #774 = NameAndType        #775:#776    // _team1CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #775 = Utf8               _team1CarrierRHand
   #776 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #777 = Fieldref           #10.#778     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._team2CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #778 = NameAndType        #779:#776    // _team2CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #779 = Utf8               _team2CarrierRHand
   #780 = Fieldref           #10.#781     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._team1CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #781 = NameAndType        #782:#776    // _team1CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #782 = Utf8               _team1CarrierLHand
   #783 = Fieldref           #10.#784     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent._team2CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #784 = NameAndType        #785:#776    // _team2CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #785 = Utf8               _team2CarrierLHand
   #786 = Methodref          #787.#788    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #787 = Class              #789         // ext/mods/gameserver/model/item/instance/ItemInstance
   #788 = NameAndType        #790:#236    // getItemId:()I
   #789 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #790 = Utf8               getItemId
   #791 = Methodref          #361.#792    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #792 = NameAndType        #793:#794    // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #793 = Utf8               getItemByItemId
   #794 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #795 = Methodref          #361.#796    // ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #796 = NameAndType        #797:#798    // equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #797 = Utf8               equipItem
   #798 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #799 = Methodref          #10.#800     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.setCarrierUnequippedWeapons:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #800 = NameAndType        #801:#802    // setCarrierUnequippedWeapons:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #801 = Utf8               setCarrierUnequippedWeapons
   #802 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #803 = Methodref          #212.#804    // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
   #804 = NameAndType        #805:#6      // broadcastUserInfo:()V
   #805 = Utf8               broadcastUserInfo
   #806 = Methodref          #212.#807    // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #807 = NameAndType        #808:#192    // isOnline:()Z
   #808 = Utf8               isOnline
   #809 = Fieldref           #48.#810     // ext/mods/Config.CTF_EVENT_TEAM_2_FLAG:I
   #810 = NameAndType        #811:#73     // CTF_EVENT_TEAM_2_FLAG:I
   #811 = Utf8               CTF_EVENT_TEAM_2_FLAG
   #812 = Fieldref           #48.#813     // ext/mods/Config.CTF_EVENT_TEAM_1_FLAG:I
   #813 = NameAndType        #814:#73     // CTF_EVENT_TEAM_1_FLAG:I
   #814 = Utf8               CTF_EVENT_TEAM_1_FLAG
   #815 = Class              #816         // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #816 = Utf8               ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
   #817 = Methodref          #815.#818    // ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
   #818 = NameAndType        #5:#819      // "<init>":(Ljava/lang/String;I)V
   #819 = Utf8               (Ljava/lang/String;I)V
   #820 = Fieldref           #821.#822    // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #821 = Class              #823         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent$SingletonHolder
   #822 = NameAndType        #824:#825    // INSTANCE:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #823 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent$SingletonHolder
   #824 = Utf8               INSTANCE
   #825 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #826 = Methodref          #827.#828    // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #827 = Class              #829         // ext/mods/gameserver/data/SkillTable
   #828 = NameAndType        #41:#830     // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #829 = Utf8               ext/mods/gameserver/data/SkillTable
   #830 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #831 = Methodref          #684.#832    // java/lang/Integer.intValue:()I
   #832 = NameAndType        #833:#236    // intValue:()I
   #833 = Utf8               intValue
   #834 = Methodref          #827.#835    // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #835 = NameAndType        #836:#837    // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #836 = Utf8               getInfo
   #837 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #838 = Methodref          #839.#840    // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #839 = Class              #841         // ext/mods/gameserver/skills/L2Skill
   #840 = NameAndType        #842:#843    // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #841 = Utf8               ext/mods/gameserver/skills/L2Skill
   #842 = Utf8               getEffects
   #843 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #844 = Utf8               ConstantValue
   #845 = Utf8               Signature
   #846 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
   #847 = Utf8               Code
   #848 = Utf8               LineNumberTable
   #849 = Utf8               LocalVariableTable
   #850 = Utf8               this
   #851 = Utf8               init
   #852 = Utf8               startParticipation
   #853 = Utf8               e
   #854 = Utf8               Ljava/lang/Exception;
   #855 = Utf8               tmpl
   #856 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #857 = Utf8               StackMapTable
   #858 = Class              #859         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #859 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #860 = Utf8               players
   #861 = Utf8               LocalVariableTypeTable
   #862 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
   #863 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;)Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
   #864 = Utf8               startFight
   #865 = Utf8               player
   #866 = Utf8               iter
   #867 = Utf8               Ljava/util/Iterator;
   #868 = Utf8               highestLevelPlayer
   #869 = Utf8               playerInstance
   #870 = Utf8               team
   #871 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #872 = Utf8               allParticipants
   #873 = Utf8               balance
   #874 = Utf8               priority
   #875 = Utf8               allParticipantsSorted
   #876 = Utf8               Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
   #877 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
   #878 = Class              #55          // "[I"
   #879 = Class              #20          // "[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;"
   #880 = Utf8               calculateRewards
   #881 = Utf8               i
   #882 = Utf8               inv
   #883 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #884 = Utf8               reward
   #885 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
   #886 = Utf8               systemMessage
   #887 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #888 = Utf8               statusUpdate
   #889 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
   #890 = Utf8               npcHtmlMessage
   #891 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
   #892 = Class              #334         // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
   #893 = Utf8               stopFight
   #894 = Utf8               teamId
   #895 = Utf8               objectId
   #896 = Utf8               itemId
   #897 = Utf8               itemNum
   #898 = Utf8               message
   #899 = Utf8               cs
   #900 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
   #901 = Utf8               onLogin
   #902 = Utf8               onLogout
   #903 = Utf8               onBypass
   #904 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #905 = Utf8               htmContent
   #906 = Utf8               playerLevel
   #907 = Utf8               command
   #908 = Utf8               onAction
   #909 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
   #910 = Utf8               playerTeamId
   #911 = Utf8               targetedPlayerTeamId
   #912 = Utf8               onScrollUse
   #913 = Utf8               onPotionUse
   #914 = Utf8               onEscapeUse
   #915 = Utf8               onItemSummon
   #916 = Utf8               onKill
   #917 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
   #918 = Utf8               killerTeamId
   #919 = Utf8               killedTeamId
   #920 = Utf8               killer
   #921 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #922 = Utf8               attackingPlayer
   #923 = Utf8               onTeleported
   #924 = Utf8               party
   #925 = Utf8               Lext/mods/gameserver/model/group/Party;
   #926 = Utf8               buffs
   #927 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
   #928 = Utf8               state
   #929 = Class              #930         // java/lang/Object
   #930 = Utf8               java/lang/Object
   #931 = Class              #932         // java/lang/Throwable
   #932 = Utf8               java/lang/Throwable
   #933 = Utf8               isInactive
   #934 = Utf8               getParticipantTeam
   #935 = Utf8               (I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
   #936 = Utf8               getParticipantEnemyTeam
   #937 = Utf8               getParticipantTeamCoordinates
   #938 = Utf8               (I)[I
   #939 = Utf8               getTeamsPlayerCounts
   #940 = Utf8               getTeamsPoints
   #941 = Utf8               carrierRHand
   #942 = Utf8               carrierLHand
   #943 = Utf8               setTeamCarrier
   #944 = Utf8               getTeamCarrier
   #945 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #946 = Utf8               getEnemyCarrier
   #947 = Utf8               itemRight
   #948 = Utf8               itemLeft
   #949 = Utf8               broadcastScreenMessage
   #950 = Utf8               duration
   #951 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #952 = Utf8               lambda$onTeleported$0
   #953 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
   #954 = Utf8               key
   #955 = Utf8               Ljava/lang/Integer;
   #956 = Utf8               value
   #957 = Utf8               skill
   #958 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #959 = Utf8               lambda$sortPlayersByLevel$0
   #960 = Utf8               p
   #961 = Utf8               SourceFile
   #962 = Utf8               CTFEvent.java
   #963 = Utf8               NestMembers
   #964 = Utf8               BootstrapMethods
   #965 = String             #966         // CTFEventEngine: exception: \u0001
   #966 = Utf8               CTFEventEngine: exception: \u0001
   #967 = MethodType         #968         //  (Ljava/lang/Object;)I
   #968 = Utf8               (Ljava/lang/Object;)I
   #969 = MethodHandle       6:#970       // REF_invokeStatic ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
   #970 = Methodref          #10.#971     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
   #971 = NameAndType        #959:#769    // lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
   #972 = MethodType         #769         //  (Lext/mods/gameserver/model/actor/Player;)I
   #973 = String             #974         // CTF Event: Event finish. Team \u0001 won with \u0001 points.
   #974 = Utf8               CTF Event: Event finish. Team \u0001 won with \u0001 points.
   #975 = String             #976         // \u0001 \u0001
   #976 = Utf8               \u0001 \u0001
   #977 = String             #978         // SpawnFirstHeadQuaters: exception: \u0001
   #978 = Utf8               SpawnFirstHeadQuaters: exception: \u0001
   #979 = String             #980         // SpawnSecondHeadQuaters: exception: \u0001
   #980 = Utf8               SpawnSecondHeadQuaters: exception: \u0001
   #981 = String             #982         // \u0001 Hunted Player \u0001!
   #982 = Utf8               \u0001 Hunted Player \u0001!
   #983 = MethodType         #984         //  (Ljava/lang/Object;Ljava/lang/Object;)V
   #984 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
   #985 = MethodHandle       6:#986       // REF_invokeStatic ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
   #986 = Methodref          #10.#987     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
   #987 = NameAndType        #952:#953    // lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
   #988 = MethodType         #989         //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
   #989 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
   #990 = MethodHandle       6:#991       // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #991 = Methodref          #992.#993    // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #992 = Class              #994         // java/lang/invoke/StringConcatFactory
   #993 = NameAndType        #135:#995    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #994 = Utf8               java/lang/invoke/StringConcatFactory
   #995 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #996 = MethodHandle       6:#997       // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #997 = Methodref          #998.#999    // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #998 = Class              #1000        // java/lang/invoke/LambdaMetafactory
   #999 = NameAndType        #1001:#1002  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1000 = Utf8               java/lang/invoke/LambdaMetafactory
  #1001 = Utf8               metafactory
  #1002 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1003 = Utf8               InnerClasses
  #1004 = Utf8               SingletonHolder
  #1005 = Class              #1006        // java/lang/invoke/MethodHandles$Lookup
  #1006 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1007 = Class              #1008        // java/lang/invoke/MethodHandles
  #1008 = Utf8               java/lang/invoke/MethodHandles
  #1009 = Utf8               Lookup
{
  public void init();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
         3: iconst_2
         4: invokevirtual #43                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
         7: aload_0
         8: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        11: iconst_0
        12: new           #15                 // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
        15: dup
        16: getstatic     #47                 // Field ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
        19: getstatic     #52                 // Field ext/mods/Config.CTF_EVENT_TEAM_1_COORDINATES:[I
        22: invokespecial #56                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam."<init>":(Ljava/lang/String;[I)V
        25: aastore
        26: aload_0
        27: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        30: iconst_1
        31: new           #15                 // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam
        34: dup
        35: getstatic     #59                 // Field ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
        38: getstatic     #62                 // Field ext/mods/Config.CTF_EVENT_TEAM_2_COORDINATES:[I
        41: invokespecial #56                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam."<init>":(Ljava/lang/String;[I)V
        44: aastore
        45: return
      LineNumberTable:
        line 99: 0
        line 100: 7
        line 101: 26
        line 102: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;

  public boolean startParticipation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: invokestatic  #65                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
         3: getstatic     #70                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_ID:I
         6: invokevirtual #74                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: astore_1
        10: aload_1
        11: ifnonnull     24
        14: getstatic     #78                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        17: ldc           #82                 // String CTFEvent: EventManager is a NullPointer -> Invalid npc id in configs?
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
        40: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        43: iconst_0
        44: iaload
        45: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        48: iconst_1
        49: iaload
        50: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        53: iconst_2
        54: iaload
        55: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        58: iconst_3
        59: iaload
        60: invokevirtual #102                // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
        63: aload_0
        64: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        67: ldc           #106                // int 60000
        69: invokevirtual #107                // Method ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
        72: invokestatic  #110                // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        75: aload_0
        76: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        79: invokevirtual #115                // Method ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
        82: aload_0
        83: aload_0
        84: getfield      #95                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        87: iconst_0
        88: invokevirtual #119                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
        91: putfield      #123                // Field _lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
        94: goto          116
        97: astore_2
        98: getstatic     #78                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       101: aload_2
       102: invokevirtual #129                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       105: invokedynamic #133,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       110: aload_2
       111: invokevirtual #137                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       114: iconst_0
       115: ireturn
       116: aload_0
       117: getstatic     #140                // Field ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
       120: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       123: iconst_1
       124: ireturn
      Exception table:
         from    to  target type
            24    94    97   Class java/lang/Exception
      LineNumberTable:
        line 106: 0
        line 108: 10
        line 110: 14
        line 111: 22
        line 116: 24
        line 117: 36
        line 118: 63
        line 120: 72
        line 121: 82
        line 127: 94
        line 123: 97
        line 125: 98
        line 126: 114
        line 129: 116
        line 130: 123
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           98      18     2     e   Ljava/lang/Exception;
            0     125     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
           10     115     1  tmpl   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate ]
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 72
          stack = [ class java/lang/Exception ]
        frame_type = 18 /* same */

  public boolean startFight();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=1
         0: aload_0
         1: getstatic     #173                // Field ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: new           #30                 // class java/util/HashMap
        10: dup
        11: invokespecial #32                 // Method java/util/HashMap."<init>":()V
        14: astore_1
        15: aload_1
        16: aload_0
        17: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        20: iconst_0
        21: aaload
        22: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        25: invokeinterface #180,  2          // InterfaceMethod java/util/Map.putAll:(Ljava/util/Map;)V
        30: aload_1
        31: aload_0
        32: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        35: iconst_1
        36: aaload
        37: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        40: invokeinterface #180,  2          // InterfaceMethod java/util/Map.putAll:(Ljava/util/Map;)V
        45: aload_0
        46: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        49: iconst_0
        50: aaload
        51: invokevirtual #186                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
        54: aload_0
        55: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        58: iconst_1
        59: aaload
        60: invokevirtual #186                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
        63: aload_0
        64: invokevirtual #189                // Method needParticipationFee:()Z
        67: ifeq          118
        70: aload_1
        71: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        76: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        81: astore_3
        82: aload_3
        83: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        88: ifeq          118
        91: aload_3
        92: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        97: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       100: astore_2
       101: aload_0
       102: aload_2
       103: invokevirtual #214                // Method hasParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       106: ifne          82
       109: aload_3
       110: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.remove:()V
       115: goto          82
       118: iconst_2
       119: newarray       int
       121: dup
       122: iconst_0
       123: iconst_0
       124: iastore
       125: dup
       126: iconst_1
       127: iconst_0
       128: iastore
       129: astore        4
       131: iconst_0
       132: istore        5
       134: new           #221                // class java/util/ArrayList
       137: dup
       138: aload_0
       139: new           #221                // class java/util/ArrayList
       142: dup
       143: aload_1
       144: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       149: invokespecial #223                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       152: invokevirtual #226                // Method sortPlayersByLevel:(Ljava/util/List;)Ljava/util/List;
       155: invokespecial #223                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       158: astore        6
       160: aload         6
       162: invokeinterface #230,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       167: ifne          310
       170: aload         6
       172: aload         6
       174: invokeinterface #233,  1          // InterfaceMethod java/util/List.size:()I
       179: iconst_1
       180: isub
       181: invokeinterface #237,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       186: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       189: astore        7
       191: aload_0
       192: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       195: iload         5
       197: aaload
       198: aload         7
       200: invokevirtual #240                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
       203: pop
       204: aload         4
       206: iload         5
       208: dup2
       209: iaload
       210: aload         7
       212: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       215: invokevirtual #247                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       218: iadd
       219: iastore
       220: aload         6
       222: invokeinterface #230,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       227: ifeq          233
       230: goto          310
       233: iconst_1
       234: iload         5
       236: isub
       237: istore        5
       239: aload         6
       241: aload         6
       243: invokeinterface #233,  1          // InterfaceMethod java/util/List.size:()I
       248: iconst_1
       249: isub
       250: invokeinterface #237,  2          // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       255: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       258: astore        7
       260: aload_0
       261: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       264: iload         5
       266: aaload
       267: aload         7
       269: invokevirtual #240                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
       272: pop
       273: aload         4
       275: iload         5
       277: dup2
       278: iaload
       279: aload         7
       281: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       284: invokevirtual #247                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       287: iadd
       288: iastore
       289: aload         4
       291: iconst_0
       292: iaload
       293: aload         4
       295: iconst_1
       296: iaload
       297: if_icmple     304
       300: iconst_1
       301: goto          305
       304: iconst_0
       305: istore        5
       307: goto          160
       310: aload_0
       311: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       314: iconst_0
       315: aaload
       316: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
       319: getstatic     #255                // Field ext/mods/Config.CTF_EVENT_MIN_PLAYERS_IN_TEAMS:I
       322: if_icmplt     340
       325: aload_0
       326: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       329: iconst_1
       330: aaload
       331: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
       334: getstatic     #255                // Field ext/mods/Config.CTF_EVENT_MIN_PLAYERS_IN_TEAMS:I
       337: if_icmpge     433
       340: aload_0
       341: getstatic     #21                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
       344: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       347: aload_1
       348: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       353: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       358: astore        7
       360: aload         7
       362: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       367: ifeq          402
       370: aload         7
       372: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       377: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       380: astore        8
       382: aload         8
       384: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
       387: iconst_0
       388: iaload
       389: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
       392: iconst_1
       393: iaload
       394: iconst_1
       395: invokevirtual #261                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       398: pop
       399: goto          360
       402: aload_0
       403: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       406: iconst_0
       407: aaload
       408: invokevirtual #186                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
       411: aload_0
       412: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       415: iconst_1
       416: aaload
       417: invokevirtual #186                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
       420: aload_0
       421: invokevirtual #265                // Method unSpawnNpc:()V
       424: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       427: iconst_2
       428: invokevirtual #268                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       431: iconst_0
       432: ireturn
       433: aload_0
       434: invokevirtual #189                // Method needParticipationFee:()Z
       437: ifeq          552
       440: aload_0
       441: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       444: iconst_0
       445: aaload
       446: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
       449: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       454: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       459: astore_3
       460: aload_3
       461: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       466: ifeq          496
       469: aload_3
       470: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       475: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       478: astore_2
       479: aload_0
       480: aload_2
       481: invokevirtual #271                // Method payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       484: ifne          460
       487: aload_3
       488: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.remove:()V
       493: goto          460
       496: aload_0
       497: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       500: iconst_1
       501: aaload
       502: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
       505: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       510: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       515: astore_3
       516: aload_3
       517: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       522: ifeq          552
       525: aload_3
       526: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       531: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       534: astore_2
       535: aload_0
       536: aload_2
       537: invokevirtual #271                // Method payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       540: ifne          516
       543: aload_3
       544: invokeinterface #218,  1          // InterfaceMethod java/util/Iterator.remove:()V
       549: goto          516
       552: aload_0
       553: invokevirtual #274                // Method spawnFirstHeadQuarters:()V
       556: aload_0
       557: invokevirtual #277                // Method spawnSecondHeadQuarters:()V
       560: getstatic     #280                // Field ext/mods/Config.CTF_DOORS_IDS_TO_CLOSE:Ljava/util/List;
       563: invokestatic  #284                // Method closeDoors:(Ljava/util/List;)V
       566: aload_0
       567: getstatic     #288                // Field ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
       570: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       573: aload_0
       574: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       577: astore        7
       579: aload         7
       581: arraylength
       582: istore        8
       584: iconst_0
       585: istore        9
       587: iload         9
       589: iload         8
       591: if_icmpge     671
       594: aload         7
       596: iload         9
       598: aaload
       599: astore        10
       601: aload         10
       603: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
       606: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       611: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       616: astore        11
       618: aload         11
       620: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       625: ifeq          665
       628: aload         11
       630: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       635: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       638: astore        12
       640: aload         12
       642: ifnull        662
       645: new           #291                // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
       648: dup
       649: aload         12
       651: aload         10
       653: invokevirtual #293                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getCoordinates:()[I
       656: iconst_0
       657: iconst_0
       658: invokespecial #297                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
       661: pop
       662: goto          618
       665: iinc          9, 1
       668: goto          587
       671: iconst_1
       672: ireturn
      LineNumberTable:
        line 140: 0
        line 142: 7
        line 144: 15
        line 145: 30
        line 147: 45
        line 148: 54
        line 152: 63
        line 154: 70
        line 155: 82
        line 157: 91
        line 158: 101
        line 159: 109
        line 163: 118
        line 168: 131
        line 169: 134
        line 170: 160
        line 172: 170
        line 173: 191
        line 174: 204
        line 176: 220
        line 177: 230
        line 179: 233
        line 180: 239
        line 181: 260
        line 182: 273
        line 184: 289
        line 185: 307
        line 187: 310
        line 189: 340
        line 191: 347
        line 192: 382
        line 194: 402
        line 195: 411
        line 197: 420
        line 198: 424
        line 199: 431
        line 202: 433
        line 204: 440
        line 205: 460
        line 207: 469
        line 208: 479
        line 209: 487
        line 212: 496
        line 213: 516
        line 215: 525
        line 216: 535
        line 217: 543
        line 221: 552
        line 222: 556
        line 224: 560
        line 226: 566
        line 228: 573
        line 230: 601
        line 232: 640
        line 233: 645
        line 234: 662
        line 228: 665
        line 237: 671
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101      17     2 player   Lext/mods/gameserver/model/actor/Player;
           82      36     3  iter   Ljava/util/Iterator;
          191     116     7 highestLevelPlayer   Lext/mods/gameserver/model/actor/Player;
          382      17     8 players   Lext/mods/gameserver/model/actor/Player;
          479      17     2 player   Lext/mods/gameserver/model/actor/Player;
          535      17     2 player   Lext/mods/gameserver/model/actor/Player;
          460      92     3  iter   Ljava/util/Iterator;
          640      22    12 playerInstance   Lext/mods/gameserver/model/actor/Player;
          601      64    10  team   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
            0     673     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
           15     658     1 allParticipants   Ljava/util/Map;
          131     542     4 balance   [I
          134     539     5 priority   I
          160     513     6 allParticipantsSorted   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           82      36     3  iter   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
          460      92     3  iter   Ljava/util/Iterator<Lext/mods/gameserver/model/actor/Player;>;
           15     658     1 allParticipants   Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/actor/Player;>;
          160     513     6 allParticipantsSorted   Ljava/util/List<Lext/mods/gameserver/model/actor/Player;>;
      StackMapTable: number_of_entries = 20
        frame_type = 254 /* append */
          offset_delta = 82
          locals = [ class java/util/Map, top, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 35
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, class java/util/Map, top, top, class "[I", int, class java/util/List ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 41
        frame_type = 30 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, class java/util/Map, top, class java/util/Iterator, class "[I", int, class java/util/List ]
          stack = []
        frame_type = 35 /* same */
        frame_type = 19 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, class java/util/Map, top, top, class "[I", int, class java/util/List ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 34
          locals = [ class "[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam, class java/util/Iterator ]
        frame_type = 43 /* same */
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
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
         9: aload_0
        10: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        13: iconst_1
        14: aaload
        15: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
        18: if_icmpne     97
        21: aload_0
        22: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        25: iconst_0
        26: aaload
        27: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        30: ifeq          45
        33: aload_0
        34: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        37: iconst_1
        38: aaload
        39: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        42: ifne          56
        45: aload_0
        46: getstatic     #304                // Field ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
        49: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
        52: ldc_w         #307                // String CTF Event: Event has ended. No team won due to inactivity!
        55: areturn
        56: aload_0
        57: ldc_w         #309                // String Event has ended, both teams have tied.
        60: invokevirtual #311                // Method sysMsgToAllParticipants:(Ljava/lang/String;)V
        63: getstatic     #315                // Field ext/mods/Config.CTF_REWARD_TEAM_TIE:Z
        66: ifeq          93
        69: aload_0
        70: aload_0
        71: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        74: iconst_0
        75: aaload
        76: invokevirtual #319                // Method rewardTeam:(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;)V
        79: aload_0
        80: aload_0
        81: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        84: iconst_1
        85: aaload
        86: invokevirtual #319                // Method rewardTeam:(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;)V
        89: ldc_w         #323                // String CTF Event: Event has ended with both teams tying.
        92: areturn
        93: ldc_w         #323                // String CTF Event: Event has ended with both teams tying.
        96: areturn
        97: aload_0
        98: getstatic     #304                // Field ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
       101: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       104: aload_0
       105: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       108: aload_0
       109: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       112: iconst_0
       113: aaload
       114: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
       117: aload_0
       118: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       121: iconst_1
       122: aaload
       123: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
       126: if_icmple     133
       129: iconst_0
       130: goto          134
       133: iconst_1
       134: aaload
       135: astore_1
       136: aload_0
       137: aload_1
       138: invokevirtual #319                // Method rewardTeam:(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;)V
       141: aload_1
       142: invokevirtual #325                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getName:()Ljava/lang/String;
       145: aload_1
       146: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
       149: invokedynamic #328,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
       154: areturn
      LineNumberTable:
        line 242: 0
        line 244: 21
        line 246: 45
        line 247: 52
        line 250: 56
        line 251: 63
        line 253: 69
        line 254: 79
        line 255: 89
        line 258: 93
        line 261: 97
        line 263: 104
        line 264: 136
        line 265: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     155     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
          136      19     1  team   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
      StackMapTable: number_of_entries = 6
        frame_type = 45 /* same */
        frame_type = 10 /* same */
        frame_type = 36 /* same */
        frame_type = 3 /* same */
        frame_type = 99 /* same_locals_1_stack_item */
          stack = [ class "[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;" ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent ]
          stack = [ class "[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;", int ]

  public void stopFight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=1
         0: aload_0
         1: getstatic     #427                // Field ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: aload_0
         8: invokevirtual #265                // Method unSpawnNpc:()V
        11: getstatic     #280                // Field ext/mods/Config.CTF_DOORS_IDS_TO_CLOSE:Ljava/util/List;
        14: invokestatic  #430                // Method openDoors:(Ljava/util/List;)V
        17: aload_0
        18: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        21: ifnull        32
        24: aload_0
        25: aload_0
        26: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #437                // Method removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
        32: aload_0
        33: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        36: ifnull        47
        39: aload_0
        40: aload_0
        41: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        44: invokevirtual #437                // Method removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
        47: aload_0
        48: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        51: astore_1
        52: aload_1
        53: arraylength
        54: istore_2
        55: iconst_0
        56: istore_3
        57: iload_3
        58: iload_2
        59: if_icmpge     135
        62: aload_1
        63: iload_3
        64: aaload
        65: astore        4
        67: aload         4
        69: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        72: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        77: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        82: astore        5
        84: aload         5
        86: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        91: ifeq          129
        94: aload         5
        96: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       101: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       104: astore        6
       106: aload         6
       108: ifnull        126
       111: new           #291                // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
       114: dup
       115: aload         6
       117: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
       120: iconst_0
       121: iconst_0
       122: invokespecial #297                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
       125: pop
       126: goto          84
       129: iinc          3, 1
       132: goto          57
       135: aload_0
       136: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       139: iconst_0
       140: aaload
       141: invokevirtual #186                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
       144: aload_0
       145: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       148: iconst_1
       149: aaload
       150: invokevirtual #186                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.cleanMe:()V
       153: aload_0
       154: new           #30                 // class java/util/HashMap
       157: dup
       158: invokespecial #32                 // Method java/util/HashMap."<init>":()V
       161: putfield      #33                 // Field _teleported:Ljava/util/Map;
       164: aload_0
       165: getstatic     #21                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
       168: invokevirtual #143                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       171: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       174: iconst_2
       175: invokevirtual #268                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       178: return
      LineNumberTable:
        line 314: 0
        line 316: 7
        line 318: 11
        line 320: 17
        line 321: 24
        line 323: 32
        line 324: 39
        line 326: 47
        line 328: 67
        line 330: 106
        line 331: 111
        line 332: 126
        line 326: 129
        line 335: 135
        line 336: 144
        line 338: 153
        line 340: 164
        line 341: 171
        line 342: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          106      20     6 player   Lext/mods/gameserver/model/actor/Player;
           67      62     4  team   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
            0     179     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      StackMapTable: number_of_entries = 7
        frame_type = 32 /* same */
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam, class java/util/Iterator ]
        frame_type = 41 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 5

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
         9: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        12: iconst_0
        13: aaload
        14: ifnull        26
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        21: iconst_1
        22: aaload
        23: ifnonnull     28
        26: iconst_0
        27: ireturn
        28: aload_0
        29: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        32: iconst_0
        33: aaload
        34: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        37: aload_0
        38: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        41: iconst_1
        42: aaload
        43: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        46: if_icmpne     58
        49: iconst_2
        50: invokestatic  #444                // Method ext/mods/commons/random/Rnd.get:(I)I
        53: i2b
        54: istore_2
        55: goto          86
        58: aload_0
        59: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        62: iconst_0
        63: aaload
        64: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        67: aload_0
        68: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        71: iconst_1
        72: aaload
        73: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        76: if_icmple     83
        79: iconst_1
        80: goto          84
        83: iconst_0
        84: i2b
        85: istore_2
        86: aload_0
        87: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        90: iload_2
        91: aaload
        92: aload_1
        93: invokevirtual #240                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
        96: ireturn
      LineNumberTable:
        line 346: 0
        line 347: 4
        line 349: 6
        line 351: 8
        line 352: 26
        line 354: 28
        line 355: 49
        line 357: 58
        line 359: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      97     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      97     1 player   Lext/mods/gameserver/model/actor/Player;
            8      89     2 teamId   B
      StackMapTable: number_of_entries = 7
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 1 /* same */
        frame_type = 29 /* same */
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
         2: invokevirtual #450                // Method getParticipantTeamId:(I)B
         5: istore_2
         6: iload_2
         7: iconst_m1
         8: if_icmpeq     23
        11: aload_0
        12: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        15: iload_2
        16: aaload
        17: iload_1
        18: invokevirtual #454                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.removePlayer:(I)V
        21: iconst_1
        22: ireturn
        23: iconst_0
        24: ireturn
      LineNumberTable:
        line 364: 0
        line 366: 6
        line 368: 11
        line 369: 21
        line 372: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      25     1 objectId   I
            6      19     2 teamId   B
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]

  public boolean needParticipationFee();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
         3: iconst_0
         4: iaload
         5: ifeq          20
         8: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
        11: iconst_1
        12: iaload
        13: ifeq          20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 377: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean hasParticipationFee(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
         7: iconst_0
         8: iaload
         9: iconst_m1
        10: invokevirtual #457                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(II)I
        13: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
        16: iconst_1
        17: iaload
        18: if_icmplt     25
        21: iconst_1
        22: goto          26
        25: iconst_0
        26: ireturn
      LineNumberTable:
        line 382: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      27     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean payParticipationFee(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
         4: iconst_0
         5: iaload
         6: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: iconst_1
        12: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        15: ireturn
      LineNumberTable:
        line 387: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getParticipationFee();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
         3: iconst_0
         4: iaload
         5: istore_1
         6: getstatic     #258                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: istore_2
        12: iload_1
        13: ifeq          20
        16: iload_2
        17: ifne          24
        20: ldc_w         #465                // String -
        23: areturn
        24: iload_2
        25: invokestatic  #467                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        28: invokestatic  #339                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        31: iload_1
        32: invokevirtual #349                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        35: invokevirtual #473                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        38: invokedynamic #474,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        43: areturn
      LineNumberTable:
        line 392: 0
        line 393: 6
        line 395: 12
        line 396: 20
        line 398: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         0: new           #477                // class ext/mods/gameserver/network/serverpackets/CreatureSay
         3: dup
         4: iconst_0
         5: getstatic     #479                // Field ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
         8: ldc_w         #485                // String Event Manager
        11: aload_1
        12: invokespecial #487                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        15: astore_2
        16: aload_0
        17: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        20: iconst_0
        21: aaload
        22: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        25: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        30: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        35: astore_3
        36: aload_3
        37: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        42: ifeq          70
        45: aload_3
        46: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        51: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
        54: astore        4
        56: aload         4
        58: ifnull        67
        61: aload         4
        63: aload_2
        64: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        67: goto          36
        70: aload_0
        71: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        74: iconst_1
        75: aaload
        76: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        79: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        84: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        89: astore_3
        90: aload_3
        91: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        96: ifeq          124
        99: aload_3
       100: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       105: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
       108: astore        4
       110: aload         4
       112: ifnull        121
       115: aload         4
       117: aload_2
       118: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       121: goto          90
       124: return
      LineNumberTable:
        line 403: 0
        line 405: 16
        line 407: 56
        line 408: 61
        line 409: 67
        line 411: 70
        line 413: 110
        line 414: 115
        line 415: 121
        line 416: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      11     4 player   Lext/mods/gameserver/model/actor/Player;
          110      11     4 player   Lext/mods/gameserver/model/actor/Player;
            0     125     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         5: invokevirtual #538                // Method isStarting:()Z
         8: ifne          19
        11: aload_0
        12: invokevirtual #541                // Method isStarted:()Z
        15: ifne          19
        18: return
        19: aload_0
        20: aload_1
        21: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        24: invokevirtual #450                // Method getParticipantTeamId:(I)B
        27: istore_2
        28: iload_2
        29: iconst_m1
        30: if_icmpne     34
        33: return
        34: aload_0
        35: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        38: iload_2
        39: aaload
        40: aload_1
        41: invokevirtual #240                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.addPlayer:(Lext/mods/gameserver/model/actor/Player;)Z
        44: pop
        45: new           #291                // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
        48: dup
        49: aload_1
        50: aload_0
        51: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        54: iload_2
        55: aaload
        56: invokevirtual #293                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getCoordinates:()[I
        59: iconst_1
        60: iconst_0
        61: invokespecial #297                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
        64: pop
        65: return
      LineNumberTable:
        line 498: 0
        line 499: 18
        line 501: 19
        line 502: 28
        line 503: 33
        line 505: 34
        line 506: 45
        line 507: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         1: ifnull        105
         4: aload_0
         5: invokevirtual #538                // Method isStarting:()Z
         8: ifne          25
        11: aload_0
        12: invokevirtual #541                // Method isStarted:()Z
        15: ifne          25
        18: aload_0
        19: invokevirtual #547                // Method isParticipating:()Z
        22: ifeq          105
        25: invokestatic  #550                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        28: aload_1
        29: invokevirtual #555                // Method ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
        32: ifeq          55
        35: getstatic     #558                // Field ext/mods/Config.SAFEDISCONNECT_INTEGRATION_CTF:Z
        38: ifeq          55
        41: aload_0
        42: aload_1
        43: invokevirtual #561                // Method playerIsCarrier:(Lext/mods/gameserver/model/actor/Player;)Z
        46: ifeq          54
        49: aload_0
        50: aload_1
        51: invokevirtual #437                // Method removeFlagCarrier:(Lext/mods/gameserver/model/actor/Player;)V
        54: return
        55: aload_0
        56: aload_1
        57: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        60: invokevirtual #564                // Method removeParticipant:(I)Z
        63: ifeq          105
        66: aload_1
        67: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        70: iconst_0
        71: iaload
        72: bipush        101
        74: invokestatic  #444                // Method ext/mods/commons/random/Rnd.get:(I)I
        77: iadd
        78: bipush        50
        80: isub
        81: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        84: iconst_1
        85: iaload
        86: bipush        101
        88: invokestatic  #444                // Method ext/mods/commons/random/Rnd.get:(I)I
        91: iadd
        92: bipush        50
        94: isub
        95: getstatic     #99                 // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        98: iconst_2
        99: iaload
       100: iconst_0
       101: invokevirtual #568                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       104: pop
       105: return
      LineNumberTable:
        line 511: 0
        line 513: 25
        line 515: 41
        line 516: 49
        line 517: 54
        line 520: 55
        line 521: 66
        line 523: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     106     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     106     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 25 /* same */
        frame_type = 28 /* same */
        frame_type = 0 /* same */
        frame_type = 49 /* same */

  public synchronized void onBypass(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=5, locals=6, args_size=3
         0: aload_2
         1: ifnull        11
         4: aload_0
         5: invokevirtual #547                // Method isParticipating:()Z
         8: ifne          12
        11: return
        12: aload_1
        13: ldc_w         #572                // String ctf_event_participation
        16: invokevirtual #574                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        19: ifeq          418
        22: new           #396                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        25: dup
        26: iconst_0
        27: invokespecial #398                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        30: astore        4
        32: aload_2
        33: invokevirtual #243                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        36: invokevirtual #247                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        39: istore        5
        41: aload_2
        42: invokevirtual #578                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        45: ifeq          72
        48: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        51: aload_2
        52: ldc_w         #581                // String html/mods/events/ctf/CursedWeaponEquipped.htm
        55: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        58: astore_3
        59: aload_3
        60: ifnull        409
        63: aload         4
        65: aload_3
        66: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        69: goto          409
        72: invokestatic  #583                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        75: aload_2
        76: invokevirtual #588                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        79: ifeq          106
        82: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        85: aload_2
        86: ldc_w         #591                // String html/mods/events/ctf/Olympiad.htm
        89: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        92: astore_3
        93: aload_3
        94: ifnull        409
        97: aload         4
        99: aload_3
       100: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       103: goto          409
       106: aload_2
       107: invokevirtual #593                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       110: ifle          137
       113: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       116: aload_2
       117: ldc_w         #596                // String html/mods/events/ctf/Karma.htm
       120: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       123: astore_3
       124: aload_3
       125: ifnull        409
       128: aload         4
       130: aload_3
       131: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       134: goto          409
       137: iload         5
       139: getstatic     #598                // Field ext/mods/Config.CTF_EVENT_MIN_LVL:B
       142: if_icmplt     153
       145: iload         5
       147: getstatic     #602                // Field ext/mods/Config.CTF_EVENT_MAX_LVL:B
       150: if_icmple     205
       153: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       156: aload_2
       157: ldc_w         #605                // String html/mods/events/ctf/Level.htm
       160: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       163: astore_3
       164: aload_3
       165: ifnull        409
       168: aload         4
       170: aload_3
       171: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       174: aload         4
       176: ldc_w         #607                // String %min%
       179: getstatic     #598                // Field ext/mods/Config.CTF_EVENT_MIN_LVL:B
       182: invokestatic  #467                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       185: invokevirtual #609                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       188: aload         4
       190: ldc_w         #613                // String %max%
       193: getstatic     #602                // Field ext/mods/Config.CTF_EVENT_MAX_LVL:B
       196: invokestatic  #467                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       199: invokevirtual #609                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       202: goto          409
       205: aload_0
       206: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       209: iconst_0
       210: aaload
       211: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
       214: getstatic     #615                // Field ext/mods/Config.CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
       217: if_icmpne     273
       220: aload_0
       221: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       224: iconst_1
       225: aaload
       226: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
       229: getstatic     #615                // Field ext/mods/Config.CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
       232: if_icmpne     273
       235: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       238: aload_2
       239: ldc_w         #618                // String html/mods/events/ctf/TeamsFull.htm
       242: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       245: astore_3
       246: aload_3
       247: ifnull        409
       250: aload         4
       252: aload_3
       253: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       256: aload         4
       258: ldc_w         #613                // String %max%
       261: getstatic     #615                // Field ext/mods/Config.CTF_EVENT_MAX_PLAYERS_IN_TEAMS:I
       264: invokestatic  #467                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       267: invokevirtual #609                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       270: goto          409
       273: getstatic     #620                // Field ext/mods/Config.CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
       276: ifle          338
       279: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       282: iconst_2
       283: aload_2
       284: getstatic     #620                // Field ext/mods/Config.CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
       287: invokevirtual #623                // Method ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
       290: ifne          338
       293: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       296: aload_2
       297: ldc_w         #627                // String html/mods/events/ctf/IPRestriction.htm
       300: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       303: astore_3
       304: aload_3
       305: ifnull        409
       308: aload         4
       310: aload_3
       311: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       314: aload         4
       316: ldc_w         #613                // String %max%
       319: invokestatic  #37                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       322: aload_2
       323: getstatic     #620                // Field ext/mods/Config.CTF_EVENT_MAX_PARTICIPANTS_PER_IP:I
       326: invokevirtual #629                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
       329: invokestatic  #467                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       332: invokevirtual #609                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       335: goto          409
       338: aload_0
       339: aload_2
       340: invokevirtual #271                // Method payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       343: ifne          382
       346: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       349: aload_2
       350: ldc_w         #633                // String html/mods/events/ctf/ParticipationFee.htm
       353: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       356: astore_3
       357: aload_3
       358: ifnull        409
       361: aload         4
       363: aload_3
       364: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       367: aload         4
       369: ldc_w         #635                // String %fee%
       372: aload_0
       373: invokevirtual #637                // Method getParticipationFee:()Ljava/lang/String;
       376: invokevirtual #609                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       379: goto          409
       382: aload_0
       383: aload_2
       384: invokevirtual #640                // Method addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       387: ifeq          408
       390: aload         4
       392: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       395: aload_2
       396: ldc_w         #643                // String html/mods/events/ctf/Registered.htm
       399: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       402: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       405: goto          409
       408: return
       409: aload_2
       410: aload         4
       412: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       415: goto          468
       418: aload_1
       419: ldc_w         #645                // String ctf_event_remove_participation
       422: invokevirtual #574                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       425: ifeq          468
       428: aload_0
       429: aload_2
       430: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       433: invokevirtual #564                // Method removeParticipant:(I)Z
       436: pop
       437: new           #396                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       440: dup
       441: iconst_0
       442: invokespecial #398                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       445: astore        4
       447: aload         4
       449: invokestatic  #413                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       452: aload_2
       453: ldc_w         #647                // String html/mods/events/ctf/Unregistered.htm
       456: invokevirtual #420                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       459: invokevirtual #424                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       462: aload_2
       463: aload         4
       465: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       468: return
      LineNumberTable:
        line 527: 0
        line 528: 11
        line 532: 12
        line 534: 22
        line 535: 32
        line 537: 41
        line 539: 48
        line 540: 59
        line 541: 63
        line 543: 72
        line 545: 82
        line 546: 93
        line 547: 97
        line 549: 106
        line 551: 113
        line 552: 124
        line 553: 128
        line 555: 137
        line 557: 153
        line 558: 164
        line 560: 168
        line 561: 174
        line 562: 188
        line 565: 205
        line 567: 235
        line 568: 246
        line 570: 250
        line 571: 256
        line 574: 273
        line 576: 293
        line 577: 304
        line 579: 308
        line 580: 314
        line 583: 338
        line 585: 346
        line 586: 357
        line 588: 361
        line 589: 367
        line 592: 382
        line 593: 390
        line 595: 408
        line 597: 409
        line 598: 415
        line 599: 418
        line 601: 428
        line 602: 437
        line 603: 447
        line 604: 462
        line 606: 468
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      13     3 htmContent   Ljava/lang/String;
           93      13     3 htmContent   Ljava/lang/String;
          124      13     3 htmContent   Ljava/lang/String;
          164      41     3 htmContent   Ljava/lang/String;
          246      27     3 htmContent   Ljava/lang/String;
          304      34     3 htmContent   Ljava/lang/String;
          357      25     3 htmContent   Ljava/lang/String;
           32     383     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           41     374     5 playerLevel   I
          447      21     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     469     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     469     1 command   Ljava/lang/String;
            0     469     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 14
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 33 /* same */
        frame_type = 30 /* same */
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
        frame_type = 49 /* same */

  public boolean onAction(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_0
         5: invokevirtual #541                // Method isStarted:()Z
         8: ifne          13
        11: iconst_1
        12: ireturn
        13: aload_1
        14: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        17: ifeq          22
        20: iconst_1
        21: ireturn
        22: aload_0
        23: aload_1
        24: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        27: invokevirtual #450                // Method getParticipantTeamId:(I)B
        30: istore_3
        31: aload_0
        32: iload_2
        33: invokevirtual #450                // Method getParticipantTeamId:(I)B
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
        61: getstatic     #652                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        64: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
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
        87: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        90: iload_2
        91: if_icmpeq     109
        94: getstatic     #658                // Field ext/mods/Config.CTF_EVENT_TARGET_TEAM_MEMBERS_ALLOWED:Z
        97: ifne          109
       100: aload_1
       101: getstatic     #652                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       104: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       107: iconst_0
       108: ireturn
       109: iconst_1
       110: ireturn
      LineNumberTable:
        line 610: 0
        line 611: 11
        line 613: 13
        line 614: 20
        line 616: 22
        line 617: 31
        line 619: 38
        line 621: 60
        line 622: 67
        line 625: 69
        line 627: 100
        line 628: 107
        line 631: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         1: invokevirtual #541                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #661                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #664                // Field ext/mods/Config.CTF_EVENT_SCROLL_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 636: 0
        line 637: 7
        line 639: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         1: invokevirtual #541                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #661                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #667                // Field ext/mods/Config.CTF_EVENT_POTIONS_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 644: 0
        line 645: 7
        line 647: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         1: invokevirtual #541                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #661                // Method isPlayerParticipant:(I)Z
        14: ireturn
      LineNumberTable:
        line 652: 0
        line 653: 7
        line 655: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      15     1 objectId   I
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean onItemSummon(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #541                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #661                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #670                // Field ext/mods/Config.CTF_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 660: 0
        line 661: 7
        line 663: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
      stack=6, locals=6, args_size=3
         0: aload_2
         1: ifnull        23
         4: aload_0
         5: invokevirtual #541                // Method isStarted:()Z
         8: ifeq          23
        11: aload_0
        12: aload_2
        13: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #450                // Method getParticipantTeamId:(I)B
        19: iconst_m1
        20: if_icmpne     24
        23: return
        24: new           #291                // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter
        27: dup
        28: aload_2
        29: aload_0
        30: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        33: aload_0
        34: aload_2
        35: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        38: invokevirtual #450                // Method getParticipantTeamId:(I)B
        41: aaload
        42: invokevirtual #293                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getCoordinates:()[I
        45: iconst_0
        46: iconst_0
        47: invokespecial #297                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
        50: pop
        51: aconst_null
        52: astore_3
        53: aload_1
        54: instanceof    #673                // class ext/mods/gameserver/model/actor/instance/Pet
        57: ifne          67
        60: aload_1
        61: instanceof    #675                // class ext/mods/gameserver/model/actor/Summon
        64: ifeq          78
        67: aload_1
        68: checkcast     #675                // class ext/mods/gameserver/model/actor/Summon
        71: invokevirtual #677                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        74: astore_3
        75: goto          90
        78: aload_1
        79: instanceof    #212                // class ext/mods/gameserver/model/actor/Player
        82: ifeq          90
        85: aload_1
        86: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
        89: astore_3
        90: aload_3
        91: ifnull        150
        94: aload_0
        95: aload_3
        96: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        99: invokevirtual #450                // Method getParticipantTeamId:(I)B
       102: istore        4
       104: aload_0
       105: aload_2
       106: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       109: invokevirtual #450                // Method getParticipantTeamId:(I)B
       112: istore        5
       114: iload         4
       116: iconst_m1
       117: if_icmpeq     150
       120: iload         5
       122: iconst_m1
       123: if_icmpeq     150
       126: iload         4
       128: iload         5
       130: if_icmpeq     150
       133: aload_0
       134: aload_3
       135: invokevirtual #681                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       138: aload_2
       139: invokevirtual #681                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       142: invokedynamic #682,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       147: invokevirtual #311                // Method sysMsgToAllParticipants:(Ljava/lang/String;)V
       150: return
      LineNumberTable:
        line 668: 0
        line 669: 23
        line 671: 24
        line 673: 51
        line 674: 53
        line 675: 67
        line 676: 78
        line 677: 85
        line 679: 90
        line 681: 94
        line 682: 104
        line 683: 114
        line 684: 133
        line 686: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          104      46     4 killerTeamId   B
          114      36     5 killedTeamId   B
            0     151     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     151     1 killer   Lext/mods/gameserver/model/actor/Creature;
            0     151     2 player   Lext/mods/gameserver/model/actor/Player;
           53      98     3 attackingPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 23 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 11 /* same */
        frame_type = 59 /* same */

  public void onTeleported(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #541                // Method isStarted:()Z
         4: ifeq          22
         7: aload_1
         8: ifnull        22
        11: aload_0
        12: aload_1
        13: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #661                // Method isPlayerParticipant:(I)Z
        19: ifne          23
        22: return
        23: aload_0
        24: getfield      #33                 // Field _teleported:Ljava/util/Map;
        27: aload_1
        28: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        31: invokestatic  #683                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: invokeinterface #688,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        39: ifeq          67
        42: aload_0
        43: getfield      #33                 // Field _teleported:Ljava/util/Map;
        46: aload_1
        47: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: invokestatic  #683                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: invokeinterface #691,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        58: checkcast     #694                // class java/lang/Boolean
        61: invokevirtual #696                // Method java/lang/Boolean.booleanValue:()Z
        64: ifne          71
        67: aload_1
        68: invokestatic  #699                // Method spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
        71: aload_1
        72: invokevirtual #702                // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        75: ifeq          84
        78: getstatic     #705                // Field ext/mods/Config.CTF_EVENT_MAGE_BUFFS:Ljava/util/Map;
        81: goto          87
        84: getstatic     #708                // Field ext/mods/Config.CTF_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
        87: astore_2
        88: aload_2
        89: ifnull        101
        92: aload_2
        93: invokeinterface #711,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        98: ifeq          102
       101: return
       102: aload_2
       103: aload_1
       104: invokedynamic #712,  0            // InvokeDynamic #7:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       109: invokeinterface #716,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       114: aload_1
       115: invokevirtual #720                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       118: ifnull        134
       121: aload_1
       122: invokevirtual #720                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       125: astore_3
       126: aload_3
       127: aload_1
       128: getstatic     #724                // Field ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
       131: invokevirtual #730                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       134: aload_1
       135: invokevirtual #736                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
       138: aload_0
       139: getfield      #33                 // Field _teleported:Ljava/util/Map;
       142: aload_1
       143: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       146: invokestatic  #683                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       149: iconst_1
       150: invokestatic  #739                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       153: invokeinterface #742,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       158: pop
       159: return
      LineNumberTable:
        line 690: 0
        line 691: 22
        line 693: 23
        line 694: 67
        line 696: 71
        line 698: 88
        line 699: 101
        line 701: 102
        line 708: 114
        line 710: 121
        line 711: 126
        line 714: 134
        line 715: 138
        line 716: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126       8     3 party   Lext/mods/gameserver/model/group/Party;
            0     160     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     160     1 player   Lext/mods/gameserver/model/actor/Player;
           88      72     2 buffs   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           88      72     2 buffs   Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
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
        line 730: 0
        line 732: 7
        line 733: 23
        line 735: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isInactive   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, int ]
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
        11: getstatic     #140                // Field ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
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
        line 742: 0
        line 744: 7
        line 745: 23
        line 747: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isParticipating   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, int ]
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
        11: getstatic     #173                // Field ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
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
        line 754: 0
        line 756: 7
        line 757: 23
        line 759: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarting   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, int ]
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
        11: getstatic     #288                // Field ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
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
        line 766: 0
        line 768: 7
        line 769: 23
        line 771: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarted   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent, int ]
          stack = []

  public byte getParticipantTeamId(int);
    descriptor: (I)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: ifnull        18
         9: aload_0
        10: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        13: iconst_1
        14: aaload
        15: ifnonnull     20
        18: iconst_m1
        19: ireturn
        20: aload_0
        21: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        24: iconst_0
        25: aaload
        26: iload_1
        27: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        30: ifeq          37
        33: iconst_0
        34: goto          55
        37: aload_0
        38: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        41: iconst_1
        42: aaload
        43: iload_1
        44: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        47: ifeq          54
        50: iconst_1
        51: goto          55
        54: iconst_m1
        55: i2b
        56: ireturn
      LineNumberTable:
        line 776: 0
        line 777: 18
        line 779: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      57     1 objectId   I
      StackMapTable: number_of_entries = 5
        frame_type = 18 /* same */
        frame_type = 1 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeam getParticipantTeam(int);
    descriptor: (I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: iload_1
         7: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        10: ifeq          22
        13: aload_0
        14: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        17: iconst_0
        18: aaload
        19: goto          45
        22: aload_0
        23: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        26: iconst_1
        27: aaload
        28: iload_1
        29: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        32: ifeq          44
        35: aload_0
        36: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        39: iconst_1
        40: aaload
        41: goto          45
        44: aconst_null
        45: areturn
      LineNumberTable:
        line 784: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      46     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam ]

  public ext.mods.gameserver.model.entity.events.capturetheflag.CTFEventTeam getParticipantEnemyTeam(int);
    descriptor: (I)Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: iload_1
         7: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        10: ifeq          22
        13: aload_0
        14: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        17: iconst_1
        18: aaload
        19: goto          45
        22: aload_0
        23: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        26: iconst_1
        27: aaload
        28: iload_1
        29: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        32: ifeq          44
        35: aload_0
        36: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        39: iconst_0
        40: aaload
        41: goto          45
        44: aconst_null
        45: areturn
      LineNumberTable:
        line 789: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      46     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 22 /* same */
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam ]

  public int[] getParticipantTeamCoordinates(int);
    descriptor: (I)[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: iload_1
         7: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        10: ifeq          25
        13: aload_0
        14: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        17: iconst_0
        18: aaload
        19: invokevirtual #293                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getCoordinates:()[I
        22: goto          51
        25: aload_0
        26: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        29: iconst_1
        30: aaload
        31: iload_1
        32: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        35: ifeq          50
        38: aload_0
        39: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        42: iconst_1
        43: aaload
        44: invokevirtual #293                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getCoordinates:()[I
        47: goto          51
        50: aconst_null
        51: areturn
      LineNumberTable:
        line 794: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         1: invokevirtual #547                // Method isParticipating:()Z
         4: ifne          23
         7: aload_0
         8: invokevirtual #538                // Method isStarting:()Z
        11: ifne          23
        14: aload_0
        15: invokevirtual #541                // Method isStarted:()Z
        18: ifne          23
        21: iconst_0
        22: ireturn
        23: aload_0
        24: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        27: iconst_0
        28: aaload
        29: iload_1
        30: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        33: ifne          49
        36: aload_0
        37: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        40: iconst_1
        41: aaload
        42: iload_1
        43: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        46: ifeq          53
        49: iconst_1
        50: goto          54
        53: iconst_0
        54: ireturn
      LineNumberTable:
        line 799: 0
        line 800: 21
        line 802: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
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
         6: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         9: iconst_0
        10: aaload
        11: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        14: iastore
        15: dup
        16: iconst_1
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        21: iconst_1
        22: aaload
        23: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayerCount:()I
        26: iastore
        27: areturn
      LineNumberTable:
        line 807: 0
        line 809: 11
        line 810: 23
        line 807: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;

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
         6: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         9: iconst_0
        10: aaload
        11: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
        14: iastore
        15: dup
        16: iconst_1
        17: aload_0
        18: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        21: iconst_1
        22: aaload
        23: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getPoints:()S
        26: iastore
        27: areturn
      LineNumberTable:
        line 816: 0
        line 818: 11
        line 819: 23
        line 816: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;

  public void removeFlagCarrier(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_1
         1: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: getstatic     #749                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
         7: invokevirtual #755                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.hasItemIn:(Lext/mods/gameserver/enums/Paperdoll;)Z
        10: ifeq          40
        13: aload_1
        14: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        17: getstatic     #749                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
        20: invokevirtual #755                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.hasItemIn:(Lext/mods/gameserver/enums/Paperdoll;)Z
        23: ifeq          75
        26: aload_1
        27: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        30: sipush        128
        33: invokevirtual #759                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
        36: pop
        37: goto          75
        40: aload_1
        41: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        44: sipush        16384
        47: invokevirtual #759                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
        50: pop
        51: aload_1
        52: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        55: getstatic     #763                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
        58: invokevirtual #755                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.hasItemIn:(Lext/mods/gameserver/enums/Paperdoll;)Z
        61: ifeq          75
        64: aload_1
        65: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        68: sipush        256
        71: invokevirtual #759                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
        74: pop
        75: aload_1
        76: aload_0
        77: aload_1
        78: invokevirtual #766                // Method getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
        81: iconst_1
        82: iconst_0
        83: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        86: pop
        87: aload_1
        88: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        91: invokevirtual #770                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.unblock:()V
        94: aload_0
        95: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        98: iconst_0
        99: aaload
       100: aload_1
       101: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       104: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
       107: ifeq          117
       110: aload_0
       111: getfield      #773                // Field _team1CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
       114: goto          121
       117: aload_0
       118: getfield      #777                // Field _team2CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
       121: astore_2
       122: aload_0
       123: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       126: iconst_0
       127: aaload
       128: aload_1
       129: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       132: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
       135: ifeq          145
       138: aload_0
       139: getfield      #780                // Field _team1CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
       142: goto          149
       145: aload_0
       146: getfield      #783                // Field _team2CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
       149: astore_3
       150: aload_2
       151: ifnull        176
       154: aload_1
       155: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       158: aload_2
       159: invokevirtual #786                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       162: invokevirtual #791                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       165: ifnull        176
       168: aload_1
       169: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       172: aload_2
       173: invokevirtual #795                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       176: aload_3
       177: ifnull        202
       180: aload_1
       181: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       184: aload_3
       185: invokevirtual #786                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       188: invokevirtual #791                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       191: ifnull        202
       194: aload_1
       195: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       198: aload_3
       199: invokevirtual #795                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       202: aload_0
       203: aload_1
       204: aconst_null
       205: aconst_null
       206: invokevirtual #799                // Method setCarrierUnequippedWeapons:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       209: aload_0
       210: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
       213: iconst_0
       214: aaload
       215: aload_1
       216: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       219: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
       222: ifeq          233
       225: aload_0
       226: aconst_null
       227: putfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
       230: goto          238
       233: aload_0
       234: aconst_null
       235: putfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
       238: aload_1
       239: invokevirtual #803                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
       242: return
      LineNumberTable:
        line 825: 0
        line 827: 13
        line 828: 26
        line 832: 40
        line 833: 51
        line 834: 64
        line 837: 75
        line 839: 87
        line 841: 94
        line 842: 122
        line 843: 150
        line 844: 168
        line 846: 176
        line 847: 194
        line 849: 202
        line 851: 209
        line 852: 225
        line 854: 233
        line 856: 238
        line 857: 242
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     243     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     243     1 player   Lext/mods/gameserver/model/actor/Player;
          122     121     2 carrierRHand   Lext/mods/gameserver/model/item/instance/ItemInstance;
          150      93     3 carrierLHand   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 10
        frame_type = 40 /* same */
        frame_type = 34 /* same */
        frame_type = 41 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 25 /* same */
        frame_type = 30 /* same */
        frame_type = 4 /* same */

  public void setTeamCarrier(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: aload_1
         7: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        13: ifeq          24
        16: aload_0
        17: aload_1
        18: putfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        21: goto          29
        24: aload_0
        25: aload_1
        26: putfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        29: return
      LineNumberTable:
        line 861: 0
        line 862: 16
        line 864: 24
        line 865: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      30     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 4 /* same */

  public ext.mods.gameserver.model.actor.Player getTeamCarrier(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: aload_1
         7: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        13: iconst_1
        14: if_icmpne     82
        17: aload_0
        18: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        21: ifnull        82
        24: aload_0
        25: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        28: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        31: ifeq          68
        34: aload_0
        35: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        38: iconst_1
        39: aaload
        40: aload_1
        41: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        44: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        47: iconst_1
        48: if_icmpne     82
        51: aload_0
        52: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        55: ifnull        82
        58: aload_0
        59: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        62: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        65: ifne          82
        68: aload_1
        69: aload_0
        70: aload_1
        71: invokevirtual #766                // Method getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
        74: iconst_1
        75: iconst_0
        76: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        79: pop
        80: aconst_null
        81: areturn
        82: aload_0
        83: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        86: iconst_0
        87: aaload
        88: aload_1
        89: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        92: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        95: ifeq          105
        98: aload_0
        99: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
       102: goto          109
       105: aload_0
       106: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
       109: areturn
      LineNumberTable:
        line 869: 0
        line 871: 68
        line 872: 80
        line 875: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     110     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 13 /* same */
        frame_type = 22 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]

  public ext.mods.gameserver.model.actor.Player getEnemyCarrier(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: aload_1
         7: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        13: iconst_1
        14: if_icmpne     82
        17: aload_0
        18: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        21: ifnull        82
        24: aload_0
        25: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        28: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        31: ifeq          68
        34: aload_0
        35: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        38: iconst_1
        39: aaload
        40: aload_1
        41: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        44: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        47: iconst_1
        48: if_icmpne     82
        51: aload_0
        52: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        55: ifnull        82
        58: aload_0
        59: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
        62: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        65: ifne          82
        68: aload_1
        69: aload_0
        70: aload_1
        71: invokevirtual #766                // Method getEnemyTeamFlagId:(Lext/mods/gameserver/model/actor/Player;)I
        74: iconst_1
        75: iconst_0
        76: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        79: pop
        80: aconst_null
        81: areturn
        82: aload_0
        83: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
        86: iconst_0
        87: aaload
        88: aload_1
        89: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        92: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        95: ifeq          105
        98: aload_0
        99: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
       102: goto          109
       105: aload_0
       106: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
       109: areturn
      LineNumberTable:
        line 880: 0
        line 882: 68
        line 883: 80
        line 886: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0     110     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 13 /* same */
        frame_type = 22 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]

  public boolean playerIsCarrier(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #433                // Field _team1Carrier:Lext/mods/gameserver/model/actor/Player;
         5: if_acmpeq     16
         8: aload_1
         9: aload_0
        10: getfield      #441                // Field _team2Carrier:Lext/mods/gameserver/model/actor/Player;
        13: if_acmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 891: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      22     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 16 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getEnemyTeamFlagId(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: aload_1
         7: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        13: ifeq          22
        16: getstatic     #809                // Field ext/mods/Config.CTF_EVENT_TEAM_2_FLAG:I
        19: goto          25
        22: getstatic     #812                // Field ext/mods/Config.CTF_EVENT_TEAM_1_FLAG:I
        25: ireturn
      LineNumberTable:
        line 896: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      26     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setCarrierUnequippedWeapons(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: iconst_0
         5: aaload
         6: aload_1
         7: invokevirtual #544                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: invokevirtual #746                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.containsPlayer:(I)Z
        13: ifeq          29
        16: aload_0
        17: aload_2
        18: putfield      #773                // Field _team1CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
        21: aload_0
        22: aload_3
        23: putfield      #780                // Field _team1CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
        26: goto          39
        29: aload_0
        30: aload_2
        31: putfield      #777                // Field _team2CarrierRHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
        34: aload_0
        35: aload_3
        36: putfield      #783                // Field _team2CarrierLHand:Lext/mods/gameserver/model/item/instance/ItemInstance;
        39: return
      LineNumberTable:
        line 901: 0
        line 903: 16
        line 904: 21
        line 908: 29
        line 909: 34
        line 911: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
            0      40     2 itemRight   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      40     3 itemLeft   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 9 /* same */

  public void broadcastScreenMessage(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=3
         0: aload_0
         1: getfield      #17                 // Field _teams:[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
         4: astore_3
         5: aload_3
         6: arraylength
         7: istore        4
         9: iconst_0
        10: istore        5
        12: iload         5
        14: iload         4
        16: if_icmpge     96
        19: aload_3
        20: iload         5
        22: aaload
        23: astore        6
        25: aload         6
        27: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam.getParticipatedPlayers:()Ljava/util/Map;
        30: invokeinterface #193,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        35: invokeinterface #197,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        40: astore        7
        42: aload         7
        44: invokeinterface #203,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        49: ifeq          90
        52: aload         7
        54: invokeinterface #208,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        59: checkcast     #212                // class ext/mods/gameserver/model/actor/Player
        62: astore        8
        64: aload         8
        66: ifnull        87
        69: aload         8
        71: new           #815                // class ext/mods/gameserver/network/serverpackets/ExShowScreenMessage
        74: dup
        75: aload_1
        76: iload_2
        77: sipush        1000
        80: imul
        81: invokespecial #817                // Method ext/mods/gameserver/network/serverpackets/ExShowScreenMessage."<init>":(Ljava/lang/String;I)V
        84: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        87: goto          42
        90: iinc          5, 1
        93: goto          12
        96: return
      LineNumberTable:
        line 915: 0
        line 917: 25
        line 919: 64
        line 920: 69
        line 921: 87
        line 915: 90
        line 923: 96
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      23     8 player   Lext/mods/gameserver/model/actor/Player;
           25      65     6  team   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;
            0      97     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
            0      97     1 message   Ljava/lang/String;
            0      97     2 duration   I
      StackMapTable: number_of_entries = 5
        frame_type = 254 /* append */
          offset_delta = 12
          locals = [ class "[Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFEventTeam, class java/util/Iterator ]
        frame_type = 44 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 5

  public static final ext.mods.gameserver.model.entity.events.capturetheflag.CTFEvent getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #820                // Field ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         3: areturn
      LineNumberTable:
        line 927: 0
}
SourceFile: "CTFEvent.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent$SingletonHolder
BootstrapMethods:
  0: #990 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #965 CTFEventEngine: exception: \u0001
  1: #996 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #967 (Ljava/lang/Object;)I
      #969 REF_invokeStatic ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.lambda$sortPlayersByLevel$0:(Lext/mods/gameserver/model/actor/Player;)I
      #972 (Lext/mods/gameserver/model/actor/Player;)I
  2: #990 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #973 CTF Event: Event finish. Team \u0001 won with \u0001 points.
  3: #990 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #975 \u0001 \u0001
  4: #990 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #977 SpawnFirstHeadQuaters: exception: \u0001
  5: #990 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #979 SpawnSecondHeadQuaters: exception: \u0001
  6: #990 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #981 \u0001 Hunted Player \u0001!
  7: #996 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #983 (Ljava/lang/Object;Ljava/lang/Object;)V
      #985 REF_invokeStatic ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #988 (Ljava/lang/Integer;Ljava/lang/Integer;)V
InnerClasses:
  public static final #1009= #1005 of #1007; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
