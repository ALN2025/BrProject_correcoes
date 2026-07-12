// Bytecode for: ext.mods.gameserver.model.entity.events.deathmatch.DMEvent
// File: ext\mods\gameserver\model\entity\events\deathmatch\DMEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.class
  Last modified 9 de jul de 2026; size 22916 bytes
  MD5 checksum 640ed93d06c685a83c6f4a3910518ded
  Compiled from "DMEvent.java"
public class ext.mods.gameserver.model.entity.events.deathmatch.DMEvent extends ext.mods.gameserver.model.entity.Events
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  super_class: #2                         // ext/mods/gameserver/model/entity/Events
  interfaces: 0, fields: 6, methods: 37, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/entity/Events."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/entity/Events
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/entity/Events
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // html/mods/events/dm/
    #8 = Utf8               html/mods/events/dm/
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.htmlPath:Ljava/lang/String;
   #10 = Class              #12           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #11 = NameAndType        #13:#14       // htmlPath:Ljava/lang/String;
   #12 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #13 = Utf8               htmlPath
   #14 = Utf8               Ljava/lang/String;
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
   #16 = Class              #18           // ext/mods/gameserver/enums/EventState
   #17 = NameAndType        #19:#20       // INACTIVE:Lext/mods/gameserver/enums/EventState;
   #18 = Utf8               ext/mods/gameserver/enums/EventState
   #19 = Utf8               INACTIVE
   #20 = Utf8               Lext/mods/gameserver/enums/EventState;
   #21 = Fieldref           #10.#22       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent._state:Lext/mods/gameserver/enums/EventState;
   #22 = NameAndType        #23:#20       // _state:Lext/mods/gameserver/enums/EventState;
   #23 = Utf8               _state
   #24 = Class              #25           // java/util/HashMap
   #25 = Utf8               java/util/HashMap
   #26 = Methodref          #24.#3        // java/util/HashMap."<init>":()V
   #27 = Fieldref           #10.#28       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent._player:Ljava/util/Map;
   #28 = NameAndType        #29:#30       // _player:Ljava/util/Map;
   #29 = Utf8               _player
   #30 = Utf8               Ljava/util/Map;
   #31 = Fieldref           #10.#32       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent._teleported:Ljava/util/Map;
   #32 = NameAndType        #33:#30       // _teleported:Ljava/util/Map;
   #33 = Utf8               _teleported
   #34 = Methodref          #35.#36       // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #35 = Class              #37           // ext/mods/gameserver/data/manager/AntiFeedManager
   #36 = NameAndType        #38:#39       // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #37 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
   #38 = Utf8               getInstance
   #39 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
   #40 = Methodref          #35.#41       // ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
   #41 = NameAndType        #42:#43       // registerEvent:(I)V
   #42 = Utf8               registerEvent
   #43 = Utf8               (I)V
   #44 = Methodref          #45.#46       // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #45 = Class              #47           // ext/mods/gameserver/data/xml/NpcData
   #46 = NameAndType        #38:#48       // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
   #47 = Utf8               ext/mods/gameserver/data/xml/NpcData
   #48 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
   #49 = Fieldref           #50.#51       // ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_ID:I
   #50 = Class              #52           // ext/mods/Config
   #51 = NameAndType        #53:#54       // DM_EVENT_PARTICIPATION_NPC_ID:I
   #52 = Utf8               ext/mods/Config
   #53 = Utf8               DM_EVENT_PARTICIPATION_NPC_ID
   #54 = Utf8               I
   #55 = Methodref          #45.#56       // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #56 = NameAndType        #57:#58       // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #57 = Utf8               getTemplate
   #58 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #59 = Fieldref           #10.#60       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.LOGGER:Lext/mods/commons/logging/CLogger;
   #60 = NameAndType        #61:#62       // LOGGER:Lext/mods/commons/logging/CLogger;
   #61 = Utf8               LOGGER
   #62 = Utf8               Lext/mods/commons/logging/CLogger;
   #63 = String             #64           // DMEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in configs?
   #64 = Utf8               DMEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in configs?
   #65 = Methodref          #66.#67       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #66 = Class              #68           // ext/mods/commons/logging/CLogger
   #67 = NameAndType        #69:#70       // warn:(Ljava/lang/Object;)V
   #68 = Utf8               ext/mods/commons/logging/CLogger
   #69 = Utf8               warn
   #70 = Utf8               (Ljava/lang/Object;)V
   #71 = Class              #72           // ext/mods/gameserver/model/spawn/Spawn
   #72 = Utf8               ext/mods/gameserver/model/spawn/Spawn
   #73 = Methodref          #71.#74       // ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #74 = NameAndType        #5:#75        // "<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #75 = Utf8               (Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
   #76 = Fieldref           #10.#77       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent._npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
   #77 = NameAndType        #78:#79       // _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
   #78 = Utf8               _npcSpawn
   #79 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
   #80 = Fieldref           #50.#81       // ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #81 = NameAndType        #82:#83       // DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #82 = Utf8               DM_EVENT_PARTICIPATION_NPC_COORDINATES
   #83 = Utf8               [I
   #84 = Methodref          #71.#85       // ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
   #85 = NameAndType        #86:#87       // setLoc:(IIII)V
   #86 = Utf8               setLoc
   #87 = Utf8               (IIII)V
   #88 = Methodref          #71.#89       // ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
   #89 = NameAndType        #90:#43       // setRespawnDelay:(I)V
   #90 = Utf8               setRespawnDelay
   #91 = Methodref          #92.#93       // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #92 = Class              #94           // ext/mods/gameserver/data/manager/SpawnManager
   #93 = NameAndType        #38:#95       // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #94 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #95 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #96 = Methodref          #92.#97       // ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #97 = NameAndType        #98:#99       // addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
   #98 = Utf8               addSpawn
   #99 = Utf8               (Lext/mods/gameserver/model/spawn/Spawn;)V
  #100 = Methodref          #71.#101      // ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #101 = NameAndType        #102:#103     // doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
  #102 = Utf8               doSpawn
  #103 = Utf8               (Z)Lext/mods/gameserver/model/actor/Npc;
  #104 = Fieldref           #10.#105      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent._lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
  #105 = NameAndType        #106:#107     // _lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
  #106 = Utf8               _lastNpcSpawn
  #107 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #108 = Class              #109          // java/lang/Exception
  #109 = Utf8               java/lang/Exception
  #110 = Methodref          #108.#111     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #111 = NameAndType        #112:#113     // getMessage:()Ljava/lang/String;
  #112 = Utf8               getMessage
  #113 = Utf8               ()Ljava/lang/String;
  #114 = InvokeDynamic      #0:#115       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #115 = NameAndType        #116:#117     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #116 = Utf8               makeConcatWithConstants
  #117 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #118 = Methodref          #66.#119      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #119 = NameAndType        #69:#120      // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #120 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #121 = Fieldref           #16.#122      // ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
  #122 = NameAndType        #123:#20      // PARTICIPATING:Lext/mods/gameserver/enums/EventState;
  #123 = Utf8               PARTICIPATING
  #124 = Methodref          #10.#125      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.setState:(Lext/mods/gameserver/enums/EventState;)V
  #125 = NameAndType        #126:#127     // setState:(Lext/mods/gameserver/enums/EventState;)V
  #126 = Utf8               setState
  #127 = Utf8               (Lext/mods/gameserver/enums/EventState;)V
  #128 = Fieldref           #16.#129      // ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
  #129 = NameAndType        #130:#20      // STARTING:Lext/mods/gameserver/enums/EventState;
  #130 = Utf8               STARTING
  #131 = Methodref          #10.#132      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getPlayerCounts:()I
  #132 = NameAndType        #133:#134     // getPlayerCounts:()I
  #133 = Utf8               getPlayerCounts
  #134 = Utf8               ()I
  #135 = Fieldref           #50.#136      // ext/mods/Config.DM_EVENT_MIN_PLAYERS:I
  #136 = NameAndType        #137:#54      // DM_EVENT_MIN_PLAYERS:I
  #137 = Utf8               DM_EVENT_MIN_PLAYERS
  #138 = InterfaceMethodref #139.#140     // java/util/Map.values:()Ljava/util/Collection;
  #139 = Class              #141          // java/util/Map
  #140 = NameAndType        #142:#143     // values:()Ljava/util/Collection;
  #141 = Utf8               java/util/Map
  #142 = Utf8               values
  #143 = Utf8               ()Ljava/util/Collection;
  #144 = InterfaceMethodref #145.#146     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #145 = Class              #147          // java/util/Collection
  #146 = NameAndType        #148:#149     // iterator:()Ljava/util/Iterator;
  #147 = Utf8               java/util/Collection
  #148 = Utf8               iterator
  #149 = Utf8               ()Ljava/util/Iterator;
  #150 = InterfaceMethodref #151.#152     // java/util/Iterator.hasNext:()Z
  #151 = Class              #153          // java/util/Iterator
  #152 = NameAndType        #154:#155     // hasNext:()Z
  #153 = Utf8               java/util/Iterator
  #154 = Utf8               hasNext
  #155 = Utf8               ()Z
  #156 = InterfaceMethodref #151.#157     // java/util/Iterator.next:()Ljava/lang/Object;
  #157 = NameAndType        #158:#159     // next:()Ljava/lang/Object;
  #158 = Utf8               next
  #159 = Utf8               ()Ljava/lang/Object;
  #160 = Class              #161          // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
  #161 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
  #162 = Methodref          #160.#163     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #163 = NameAndType        #164:#165     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #164 = Utf8               getPlayer
  #165 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #166 = Fieldref           #50.#167      // ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
  #167 = NameAndType        #168:#83      // DM_EVENT_PARTICIPATION_FEE:[I
  #168 = Utf8               DM_EVENT_PARTICIPATION_FEE
  #169 = Methodref          #170.#171     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #170 = Class              #172          // ext/mods/gameserver/model/actor/Player
  #171 = NameAndType        #173:#174     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #172 = Utf8               ext/mods/gameserver/model/actor/Player
  #173 = Utf8               addItem
  #174 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #175 = InterfaceMethodref #139.#176     // java/util/Map.clear:()V
  #176 = NameAndType        #177:#6       // clear:()V
  #177 = Utf8               clear
  #178 = Methodref          #10.#179      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.unSpawnNpc:()V
  #179 = NameAndType        #180:#6       // unSpawnNpc:()V
  #180 = Utf8               unSpawnNpc
  #181 = Methodref          #35.#182      // ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
  #182 = NameAndType        #177:#43      // clear:(I)V
  #183 = Fieldref           #50.#184      // ext/mods/Config.DM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #184 = NameAndType        #185:#186     // DM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #185 = Utf8               DM_DOORS_IDS_TO_CLOSE
  #186 = Utf8               Ljava/util/List;
  #187 = Methodref          #10.#188      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.closeDoors:(Ljava/util/List;)V
  #188 = NameAndType        #189:#190     // closeDoors:(Ljava/util/List;)V
  #189 = Utf8               closeDoors
  #190 = Utf8               (Ljava/util/List;)V
  #191 = Fieldref           #16.#192      // ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
  #192 = NameAndType        #193:#20      // STARTED:Lext/mods/gameserver/enums/EventState;
  #193 = Utf8               STARTED
  #194 = Class              #195          // ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
  #195 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
  #196 = Methodref          #194.#197     // ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #197 = NameAndType        #5:#198       // "<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #198 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #199 = Class              #200          // java/util/TreeSet
  #200 = Utf8               java/util/TreeSet
  #201 = InvokeDynamic      #1:#202       // #1:apply:()Ljava/util/function/Function;
  #202 = NameAndType        #203:#204     // apply:()Ljava/util/function/Function;
  #203 = Utf8               apply
  #204 = Utf8               ()Ljava/util/function/Function;
  #205 = InterfaceMethodref #206.#207     // java/util/Comparator.reverseOrder:()Ljava/util/Comparator;
  #206 = Class              #208          // java/util/Comparator
  #207 = NameAndType        #209:#210     // reverseOrder:()Ljava/util/Comparator;
  #208 = Utf8               java/util/Comparator
  #209 = Utf8               reverseOrder
  #210 = Utf8               ()Ljava/util/Comparator;
  #211 = InterfaceMethodref #206.#212     // java/util/Comparator.comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
  #212 = NameAndType        #213:#214     // comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
  #213 = Utf8               comparing
  #214 = Utf8               (Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
  #215 = InvokeDynamic      #2:#202       // #2:apply:()Ljava/util/function/Function;
  #216 = InterfaceMethodref #206.#217     // java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #217 = NameAndType        #218:#219     // thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #218 = Utf8               thenComparing
  #219 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
  #220 = InvokeDynamic      #3:#202       // #3:apply:()Ljava/util/function/Function;
  #221 = Methodref          #199.#222     // java/util/TreeSet."<init>":(Ljava/util/Comparator;)V
  #222 = NameAndType        #5:#223       // "<init>":(Ljava/util/Comparator;)V
  #223 = Utf8               (Ljava/util/Comparator;)V
  #224 = Methodref          #199.#225     // java/util/TreeSet.addAll:(Ljava/util/Collection;)Z
  #225 = NameAndType        #226:#227     // addAll:(Ljava/util/Collection;)Z
  #226 = Utf8               addAll
  #227 = Utf8               (Ljava/util/Collection;)Z
  #228 = Methodref          #10.#229      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
  #229 = NameAndType        #230:#231     // orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
  #230 = Utf8               orderPosition
  #231 = Utf8               (Ljava/util/Collection;)Ljava/util/TreeSet;
  #232 = String             #233          //
  #233 = Utf8
  #234 = Fieldref           #50.#235      // ext/mods/Config.DM_REWARD_FIRST_PLAYERS:I
  #235 = NameAndType        #236:#54      // DM_REWARD_FIRST_PLAYERS:I
  #236 = Utf8               DM_REWARD_FIRST_PLAYERS
  #237 = Methodref          #199.#238     // java/util/TreeSet.isEmpty:()Z
  #238 = NameAndType        #239:#155     // isEmpty:()Z
  #239 = Utf8               isEmpty
  #240 = Methodref          #199.#241     // java/util/TreeSet.first:()Ljava/lang/Object;
  #241 = NameAndType        #242:#159     // first:()Ljava/lang/Object;
  #242 = Utf8               first
  #243 = Methodref          #160.#244     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
  #244 = NameAndType        #245:#246     // getPoints:()S
  #245 = Utf8               getPoints
  #246 = Utf8               ()S
  #247 = Methodref          #10.#248      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.rewardPlayer:(Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;I)V
  #248 = NameAndType        #249:#250     // rewardPlayer:(Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;I)V
  #249 = Utf8               rewardPlayer
  #250 = Utf8               (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;I)V
  #251 = Methodref          #199.#252     // java/util/TreeSet.remove:(Ljava/lang/Object;)Z
  #252 = NameAndType        #253:#254     // remove:(Ljava/lang/Object;)Z
  #253 = Utf8               remove
  #254 = Utf8               (Ljava/lang/Object;)Z
  #255 = Methodref          #170.#256     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #256 = NameAndType        #257:#113     // getName:()Ljava/lang/String;
  #257 = Utf8               getName
  #258 = InvokeDynamic      #4:#259       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #259 = NameAndType        #116:#260     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #260 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #261 = InvokeDynamic      #5:#262       // #5:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
  #262 = NameAndType        #116:#263     // makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
  #263 = Utf8               (Ljava/lang/String;S)Ljava/lang/String;
  #264 = InvokeDynamic      #6:#115       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #265 = Fieldref           #50.#266      // ext/mods/Config.DM_REWARD_PLAYERS_TIE:Z
  #266 = NameAndType        #267:#268     // DM_REWARD_PLAYERS_TIE:Z
  #267 = Utf8               DM_REWARD_PLAYERS_TIE
  #268 = Utf8               Z
  #269 = Fieldref           #16.#270      // ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
  #270 = NameAndType        #271:#20      // REWARDING:Lext/mods/gameserver/enums/EventState;
  #271 = Utf8               REWARDING
  #272 = InvokeDynamic      #7:#115       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #273 = Fieldref           #50.#274      // ext/mods/Config.DM_EVENT_REWARDS:Ljava/util/Map;
  #274 = NameAndType        #275:#30      // DM_EVENT_REWARDS:Ljava/util/Map;
  #275 = Utf8               DM_EVENT_REWARDS
  #276 = Methodref          #277.#278     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #277 = Class              #279          // java/lang/Integer
  #278 = NameAndType        #280:#281     // valueOf:(I)Ljava/lang/Integer;
  #279 = Utf8               java/lang/Integer
  #280 = Utf8               valueOf
  #281 = Utf8               (I)Ljava/lang/Integer;
  #282 = InterfaceMethodref #139.#283     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #283 = NameAndType        #284:#285     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #284 = Utf8               get
  #285 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #286 = Class              #287          // java/util/List
  #287 = Utf8               java/util/List
  #288 = InterfaceMethodref #286.#146     // java/util/List.iterator:()Ljava/util/Iterator;
  #289 = Class              #83           // "[I"
  #290 = Methodref          #170.#291     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #291 = NameAndType        #292:#293     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #292 = Utf8               getInventory
  #293 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #294 = Methodref          #295.#296     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #295 = Class              #297          // ext/mods/gameserver/data/xml/ItemData
  #296 = NameAndType        #38:#298      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #297 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #298 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #299 = Methodref          #295.#300     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #300 = NameAndType        #57:#301      // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #301 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #302 = Methodref          #303.#304     // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #303 = Class              #305          // ext/mods/gameserver/model/item/kind/Item
  #304 = NameAndType        #306:#155     // isStackable:()Z
  #305 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #306 = Utf8               isStackable
  #307 = Methodref          #308.#309     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #308 = Class              #310          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #309 = NameAndType        #173:#311     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #310 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #311 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #312 = Fieldref           #313.#314     // ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #313 = Class              #315          // ext/mods/gameserver/network/SystemMessageId
  #314 = NameAndType        #316:#317     // EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #315 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #316 = Utf8               EARNED_S2_S1_S
  #317 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #318 = Methodref          #319.#320     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #319 = Class              #321          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #320 = NameAndType        #322:#323     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #321 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #322 = Utf8               getSystemMessage
  #323 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #324 = Methodref          #319.#325     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #325 = NameAndType        #326:#327     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #326 = Utf8               addItemName
  #327 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #328 = Methodref          #319.#329     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #329 = NameAndType        #330:#327     // addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #330 = Utf8               addItemNumber
  #331 = Fieldref           #313.#332     // ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #332 = NameAndType        #333:#317     // EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #333 = Utf8               EARNED_ITEM_S1
  #334 = Methodref          #170.#335     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #335 = NameAndType        #336:#337     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #336 = Utf8               sendPacket
  #337 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #338 = Class              #339          // ext/mods/gameserver/network/serverpackets/StatusUpdate
  #339 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
  #340 = Methodref          #338.#341     // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #341 = NameAndType        #5:#342       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #342 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #343 = Class              #344          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #344 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #345 = Methodref          #343.#346     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #346 = NameAndType        #5:#43        // "<init>":(I)V
  #347 = Fieldref           #348.#349     // ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #348 = Class              #350          // ext/mods/gameserver/enums/StatusType
  #349 = NameAndType        #351:#352     // CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #350 = Utf8               ext/mods/gameserver/enums/StatusType
  #351 = Utf8               CUR_LOAD
  #352 = Utf8               Lext/mods/gameserver/enums/StatusType;
  #353 = Methodref          #170.#354     // ext/mods/gameserver/model/actor/Player.getCurrentWeight:()I
  #354 = NameAndType        #355:#134     // getCurrentWeight:()I
  #355 = Utf8               getCurrentWeight
  #356 = Methodref          #338.#357     // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #357 = NameAndType        #358:#359     // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #358 = Utf8               addAttribute
  #359 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
  #360 = Methodref          #361.#362     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #361 = Class              #363          // ext/mods/gameserver/data/HTMLData
  #362 = NameAndType        #38:#364      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #363 = Utf8               ext/mods/gameserver/data/HTMLData
  #364 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #365 = String             #366          // html/mods/events/dm/Reward.htm
  #366 = Utf8               html/mods/events/dm/Reward.htm
  #367 = Methodref          #361.#368     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #368 = NameAndType        #369:#370     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #369 = Utf8               getHtm
  #370 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #371 = Methodref          #343.#372     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #372 = NameAndType        #373:#374     // setHtml:(Ljava/lang/String;)V
  #373 = Utf8               setHtml
  #374 = Utf8               (Ljava/lang/String;)V
  #375 = Fieldref           #16.#376      // ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
  #376 = NameAndType        #377:#20      // INACTIVATING:Lext/mods/gameserver/enums/EventState;
  #377 = Utf8               INACTIVATING
  #378 = Methodref          #10.#379      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.openDoors:(Ljava/util/List;)V
  #379 = NameAndType        #380:#190     // openDoors:(Ljava/util/List;)V
  #380 = Utf8               openDoors
  #381 = Fieldref           #50.#382      // ext/mods/Config.DM_SHOW_TOP_RANK:Z
  #382 = NameAndType        #383:#268     // DM_SHOW_TOP_RANK:Z
  #383 = Utf8               DM_SHOW_TOP_RANK
  #384 = Fieldref           #50.#385      // ext/mods/Config.DM_TOP_RANK:I
  #385 = NameAndType        #386:#54      // DM_TOP_RANK:I
  #386 = Utf8               DM_TOP_RANK
  #387 = Methodref          #10.#388      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getFirstPosition:(I)[Ljava/lang/String;
  #388 = NameAndType        #389:#390     // getFirstPosition:(I)[Ljava/lang/String;
  #389 = Utf8               getFirstPosition
  #390 = Utf8               (I)[Ljava/lang/String;
  #391 = Methodref          #392.#393     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #392 = Class              #394          // java/lang/Boolean
  #393 = NameAndType        #280:#395     // valueOf:(Z)Ljava/lang/Boolean;
  #394 = Utf8               java/lang/Boolean
  #395 = Utf8               (Z)Ljava/lang/Boolean;
  #396 = String             #397          // D9CC46
  #397 = Utf8               D9CC46
  #398 = String             #399          // FFFFFF
  #399 = Utf8               FFFFFF
  #400 = Methodref          #392.#401     // java/lang/Boolean.booleanValue:()Z
  #401 = NameAndType        #402:#155     // booleanValue:()Z
  #402 = Utf8               booleanValue
  #403 = String             #404          // \\,
  #404 = Utf8               \\,
  #405 = Methodref          #406.#407     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #406 = Class              #408          // java/lang/String
  #407 = NameAndType        #409:#410     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #408 = Utf8               java/lang/String
  #409 = Utf8               split
  #410 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #411 = InvokeDynamic      #8:#115       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #412 = Methodref          #406.#413     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #413 = NameAndType        #280:#414     // valueOf:(I)Ljava/lang/String;
  #414 = Utf8               (I)Ljava/lang/String;
  #415 = InvokeDynamic      #9:#416       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #416 = NameAndType        #116:#417     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #417 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #418 = InvokeDynamic      #10:#416      // #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #419 = InvokeDynamic      #11:#416      // #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #420 = InvokeDynamic      #12:#115      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #421 = String             #422          // html/mods/events/dm/TopRank.htm
  #422 = Utf8               html/mods/events/dm/TopRank.htm
  #423 = String             #424          // %toprank%
  #424 = Utf8               %toprank%
  #425 = Methodref          #343.#426     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #426 = NameAndType        #427:#428     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #427 = Utf8               replace
  #428 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #429 = Methodref          #194.#430     // ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #430 = NameAndType        #5:#431       // "<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #431 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #432 = Methodref          #10.#433      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #433 = NameAndType        #434:#435     // isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #434 = Utf8               isPlayerParticipant
  #435 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #436 = Methodref          #10.#437      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.generateHex:(I)[B
  #437 = NameAndType        #438:#439     // generateHex:(I)[B
  #438 = Utf8               generateHex
  #439 = Utf8               (I)[B
  #440 = Methodref          #10.#441      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.hexToString:([B)Ljava/lang/String;
  #441 = NameAndType        #442:#443     // hexToString:([B)Ljava/lang/String;
  #442 = Utf8               hexToString
  #443 = Utf8               ([B)Ljava/lang/String;
  #444 = Methodref          #170.#445     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #445 = NameAndType        #446:#134     // getObjectId:()I
  #446 = Utf8               getObjectId
  #447 = Methodref          #160.#448     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer."<init>":(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #448 = NameAndType        #5:#449       // "<init>":(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #449 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #450 = InterfaceMethodref #139.#451     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #451 = NameAndType        #452:#453     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #452 = Utf8               put
  #453 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #454 = InterfaceMethodref #139.#455     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #455 = NameAndType        #456:#254     // containsKey:(Ljava/lang/Object;)Z
  #456 = Utf8               containsKey
  #457 = Methodref          #458.#459     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #458 = Class              #460          // ext/mods/gameserver/model/World
  #459 = NameAndType        #38:#461      // getInstance:()Lext/mods/gameserver/model/World;
  #460 = Utf8               ext/mods/gameserver/model/World
  #461 = Utf8               ()Lext/mods/gameserver/model/World;
  #462 = Methodref          #458.#463     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #463 = NameAndType        #164:#464     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #464 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #465 = InterfaceMethodref #139.#466     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #466 = NameAndType        #253:#285     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #467 = Methodref          #170.#468     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #468 = NameAndType        #469:#470     // destroyItemByItemId:(IIZ)Z
  #469 = Utf8               destroyItemByItemId
  #470 = Utf8               (IIZ)Z
  #471 = String             #472          // -
  #472 = Utf8               -
  #473 = Methodref          #303.#256     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #474 = InvokeDynamic      #13:#259      // #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #475 = Class              #476          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #476 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #477 = Fieldref           #478.#479     // ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
  #478 = Class              #480          // ext/mods/gameserver/enums/SayType
  #479 = NameAndType        #481:#482     // PARTY:Lext/mods/gameserver/enums/SayType;
  #480 = Utf8               ext/mods/gameserver/enums/SayType
  #481 = Utf8               PARTY
  #482 = Utf8               Lext/mods/gameserver/enums/SayType;
  #483 = String             #484          // Event Manager
  #484 = Utf8               Event Manager
  #485 = Methodref          #475.#486     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #486 = NameAndType        #5:#487       // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #487 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #488 = Methodref          #489.#490     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #489 = Class              #491          // ext/mods/gameserver/model/actor/Npc
  #490 = NameAndType        #492:#6       // deleteMe:()V
  #491 = Utf8               ext/mods/gameserver/model/actor/Npc
  #492 = Utf8               deleteMe
  #493 = Methodref          #489.#494     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #494 = NameAndType        #495:#496     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #495 = Utf8               getSpawn
  #496 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #497 = Methodref          #92.#498      // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #498 = NameAndType        #499:#99      // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #499 = Utf8               deleteSpawn
  #500 = Methodref          #71.#501      // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
  #501 = NameAndType        #502:#6       // doDelete:()V
  #502 = Utf8               doDelete
  #503 = Methodref          #10.#504      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarting:()Z
  #504 = NameAndType        #505:#155     // isStarting:()Z
  #505 = Utf8               isStarting
  #506 = Methodref          #10.#507      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #507 = NameAndType        #508:#155     // isStarted:()Z
  #508 = Utf8               isStarted
  #509 = Methodref          #10.#510      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
  #510 = NameAndType        #511:#155     // isParticipating:()Z
  #511 = Utf8               isParticipating
  #512 = Methodref          #513.#514     // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #513 = Class              #515          // ext/mods/Safedisconect/SafeDisconnectManager
  #514 = NameAndType        #38:#516      // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #515 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
  #516 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
  #517 = Methodref          #513.#518     // ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #518 = NameAndType        #519:#435     // isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #519 = Utf8               isSafeDisconnectActive
  #520 = Fieldref           #50.#521      // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_DM:Z
  #521 = NameAndType        #522:#268     // SAFEDISCONNECT_INTEGRATION_DM:Z
  #522 = Utf8               SAFEDISCONNECT_INTEGRATION_DM
  #523 = Methodref          #10.#524      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #524 = NameAndType        #525:#435     // removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #525 = Utf8               removeParticipant
  #526 = Methodref          #527.#528     // ext/mods/commons/random/Rnd.get:(I)I
  #527 = Class              #529          // ext/mods/commons/random/Rnd
  #528 = NameAndType        #284:#530     // get:(I)I
  #529 = Utf8               ext/mods/commons/random/Rnd
  #530 = Utf8               (I)I
  #531 = Methodref          #170.#532     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #532 = NameAndType        #533:#534     // teleportTo:(IIII)Z
  #533 = Utf8               teleportTo
  #534 = Utf8               (IIII)Z
  #535 = String             #536          // dm_event_participation
  #536 = Utf8               dm_event_participation
  #537 = Methodref          #406.#538     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #538 = NameAndType        #539:#254     // equals:(Ljava/lang/Object;)Z
  #539 = Utf8               equals
  #540 = Methodref          #170.#541     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #541 = NameAndType        #542:#543     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #542 = Utf8               getStatus
  #543 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #544 = Methodref          #545.#546     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #545 = Class              #547          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #546 = NameAndType        #548:#134     // getLevel:()I
  #547 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #548 = Utf8               getLevel
  #549 = Methodref          #170.#550     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #550 = NameAndType        #551:#155     // isCursedWeaponEquipped:()Z
  #551 = Utf8               isCursedWeaponEquipped
  #552 = String             #553          // html/mods/events/dm/CursedWeaponEquipped.htm
  #553 = Utf8               html/mods/events/dm/CursedWeaponEquipped.htm
  #554 = Methodref          #170.#555     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #555 = NameAndType        #556:#155     // isInOlympiadMode:()Z
  #556 = Utf8               isInOlympiadMode
  #557 = String             #558          // html/mods/events/dm/Olympiad.htm
  #558 = Utf8               html/mods/events/dm/Olympiad.htm
  #559 = Methodref          #170.#560     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #560 = NameAndType        #561:#134     // getKarma:()I
  #561 = Utf8               getKarma
  #562 = String             #563          // html/mods/events/dm/Karma.htm
  #563 = Utf8               html/mods/events/dm/Karma.htm
  #564 = Fieldref           #50.#565      // ext/mods/Config.DISABLE_ID_CLASSES_DM:Ljava/util/List;
  #565 = NameAndType        #566:#186     // DISABLE_ID_CLASSES_DM:Ljava/util/List;
  #566 = Utf8               DISABLE_ID_CLASSES_DM
  #567 = Methodref          #170.#568     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #568 = NameAndType        #569:#570     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #569 = Utf8               getClassId
  #570 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #571 = Methodref          #572.#573     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #572 = Class              #574          // ext/mods/gameserver/enums/actors/ClassId
  #573 = NameAndType        #575:#134     // getId:()I
  #574 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #575 = Utf8               getId
  #576 = InterfaceMethodref #286.#577     // java/util/List.contains:(Ljava/lang/Object;)Z
  #577 = NameAndType        #578:#254     // contains:(Ljava/lang/Object;)Z
  #578 = Utf8               contains
  #579 = String             #580          // html/mods/events/dm/Class.htm
  #580 = Utf8               html/mods/events/dm/Class.htm
  #581 = Fieldref           #50.#582      // ext/mods/Config.DM_EVENT_MIN_LVL:B
  #582 = NameAndType        #583:#584     // DM_EVENT_MIN_LVL:B
  #583 = Utf8               DM_EVENT_MIN_LVL
  #584 = Utf8               B
  #585 = Fieldref           #50.#586      // ext/mods/Config.DM_EVENT_MAX_LVL:B
  #586 = NameAndType        #587:#584     // DM_EVENT_MAX_LVL:B
  #587 = Utf8               DM_EVENT_MAX_LVL
  #588 = String             #589          // html/mods/events/dm/Level.htm
  #589 = Utf8               html/mods/events/dm/Level.htm
  #590 = String             #591          // %min%
  #591 = Utf8               %min%
  #592 = String             #593          // %max%
  #593 = Utf8               %max%
  #594 = Fieldref           #50.#595      // ext/mods/Config.DM_EVENT_MAX_PLAYERS:I
  #595 = NameAndType        #596:#54      // DM_EVENT_MAX_PLAYERS:I
  #596 = Utf8               DM_EVENT_MAX_PLAYERS
  #597 = String             #598          // html/mods/events/dm/Full.htm
  #598 = Utf8               html/mods/events/dm/Full.htm
  #599 = Fieldref           #50.#600      // ext/mods/Config.DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #600 = NameAndType        #601:#54      // DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #601 = Utf8               DM_EVENT_MAX_PARTICIPANTS_PER_IP
  #602 = Methodref          #35.#603      // ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #603 = NameAndType        #604:#605     // tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #604 = Utf8               tryAddPlayer
  #605 = Utf8               (ILext/mods/gameserver/model/actor/Player;I)Z
  #606 = String             #607          // html/mods/events/dm/IPRestriction.htm
  #607 = Utf8               html/mods/events/dm/IPRestriction.htm
  #608 = Methodref          #35.#609      // ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #609 = NameAndType        #610:#611     // getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #610 = Utf8               getLimit
  #611 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)I
  #612 = Methodref          #10.#613      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #613 = NameAndType        #614:#435     // payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #614 = Utf8               payParticipationFee
  #615 = String             #616          // html/mods/events/dm/ParticipationFee.htm
  #616 = Utf8               html/mods/events/dm/ParticipationFee.htm
  #617 = String             #618          // %fee%
  #618 = Utf8               %fee%
  #619 = Methodref          #10.#620      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getParticipationFee:()Ljava/lang/String;
  #620 = NameAndType        #621:#113     // getParticipationFee:()Ljava/lang/String;
  #621 = Utf8               getParticipationFee
  #622 = String             #623          // html/mods/events/dm/Registered.htm
  #623 = Utf8               html/mods/events/dm/Registered.htm
  #624 = Methodref          #10.#625      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #625 = NameAndType        #626:#435     // addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #626 = Utf8               addParticipant
  #627 = String             #628          // dm_event_remove_participation
  #628 = Utf8               dm_event_remove_participation
  #629 = String             #630          // html/mods/events/dm/Unregistered.htm
  #630 = Utf8               html/mods/events/dm/Unregistered.htm
  #631 = Methodref          #170.#632     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #632 = NameAndType        #633:#155     // isGM:()Z
  #633 = Utf8               isGM
  #634 = Methodref          #10.#635      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #635 = NameAndType        #434:#636     // isPlayerParticipant:(I)Z
  #636 = Utf8               (I)Z
  #637 = Fieldref           #50.#638      // ext/mods/Config.DM_EVENT_SCROLL_ALLOWED:Z
  #638 = NameAndType        #639:#268     // DM_EVENT_SCROLL_ALLOWED:Z
  #639 = Utf8               DM_EVENT_SCROLL_ALLOWED
  #640 = Fieldref           #50.#641      // ext/mods/Config.DM_EVENT_POTIONS_ALLOWED:Z
  #641 = NameAndType        #642:#268     // DM_EVENT_POTIONS_ALLOWED:Z
  #642 = Utf8               DM_EVENT_POTIONS_ALLOWED
  #643 = Fieldref           #50.#644      // ext/mods/Config.DM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #644 = NameAndType        #645:#268     // DM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #645 = Utf8               DM_EVENT_SUMMON_BY_ITEM_ALLOWED
  #646 = Class              #647          // ext/mods/gameserver/model/actor/instance/Pet
  #647 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #648 = Class              #649          // ext/mods/gameserver/model/actor/Summon
  #649 = Utf8               ext/mods/gameserver/model/actor/Summon
  #650 = Methodref          #648.#651     // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #651 = NameAndType        #652:#165     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #652 = Utf8               getOwner
  #653 = Methodref          #160.#654     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.increasePoints:()V
  #654 = NameAndType        #655:#6       // increasePoints:()V
  #655 = Utf8               increasePoints
  #656 = InvokeDynamic      #14:#259      // #14:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #657 = Methodref          #10.#658      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #658 = NameAndType        #659:#374     // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #659 = Utf8               sysMsgToAllParticipants
  #660 = Methodref          #160.#661     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.increaseDeath:()V
  #661 = NameAndType        #662:#6       // increaseDeath:()V
  #662 = Utf8               increaseDeath
  #663 = Methodref          #10.#664      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
  #664 = NameAndType        #665:#666     // spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
  #665 = Utf8               spawnProtection
  #666 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #667 = Methodref          #170.#668     // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
  #668 = NameAndType        #669:#155     // isMageClass:()Z
  #669 = Utf8               isMageClass
  #670 = Fieldref           #50.#671      // ext/mods/Config.DM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #671 = NameAndType        #672:#30      // DM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #672 = Utf8               DM_EVENT_MAGE_BUFFS
  #673 = Fieldref           #50.#674      // ext/mods/Config.DM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #674 = NameAndType        #675:#30      // DM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #675 = Utf8               DM_EVENT_FIGHTER_BUFFS
  #676 = InterfaceMethodref #139.#238     // java/util/Map.isEmpty:()Z
  #677 = InvokeDynamic      #15:#678      // #15:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #678 = NameAndType        #679:#680     // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #679 = Utf8               accept
  #680 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #681 = InterfaceMethodref #139.#682     // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #682 = NameAndType        #683:#684     // forEach:(Ljava/util/function/BiConsumer;)V
  #683 = Utf8               forEach
  #684 = Utf8               (Ljava/util/function/BiConsumer;)V
  #685 = Methodref          #170.#686     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #686 = NameAndType        #687:#688     // getParty:()Lext/mods/gameserver/model/group/Party;
  #687 = Utf8               getParty
  #688 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #689 = Fieldref           #690.#691     // ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
  #690 = Class              #692          // ext/mods/gameserver/enums/MessageType
  #691 = NameAndType        #693:#694     // LEFT:Lext/mods/gameserver/enums/MessageType;
  #692 = Utf8               ext/mods/gameserver/enums/MessageType
  #693 = Utf8               LEFT
  #694 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #695 = Methodref          #696.#697     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #696 = Class              #698          // ext/mods/gameserver/model/group/Party
  #697 = NameAndType        #699:#700     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #698 = Utf8               ext/mods/gameserver/model/group/Party
  #699 = Utf8               removePartyMember
  #700 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #701 = Methodref          #170.#702     // ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
  #702 = NameAndType        #703:#6       // stopAllEffectsDebuff:()V
  #703 = Utf8               stopAllEffectsDebuff
  #704 = InterfaceMethodref #139.#705     // java/util/Map.size:()I
  #705 = NameAndType        #706:#134     // size:()I
  #706 = Utf8               size
  #707 = InvokeDynamic      #16:#416      // #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #708 = String             #709          // \\;
  #709 = Utf8               \\;
  #710 = Methodref          #527.#711     // ext/mods/commons/random/Rnd.nextBytes:([B)[B
  #711 = NameAndType        #712:#713     // nextBytes:([B)[B
  #712 = Utf8               nextBytes
  #713 = Utf8               ([B)[B
  #714 = Class              #715          // java/math/BigInteger
  #715 = Utf8               java/math/BigInteger
  #716 = Methodref          #714.#717     // java/math/BigInteger."<init>":([B)V
  #717 = NameAndType        #5:#718       // "<init>":([B)V
  #718 = Utf8               ([B)V
  #719 = Methodref          #714.#720     // java/math/BigInteger.toString:(I)Ljava/lang/String;
  #720 = NameAndType        #721:#414     // toString:(I)Ljava/lang/String;
  #721 = Utf8               toString
  #722 = Fieldref           #723.#724     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #723 = Class              #725          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent$SingletonHolder
  #724 = NameAndType        #726:#727     // INSTANCE:Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #725 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent$SingletonHolder
  #726 = Utf8               INSTANCE
  #727 = Utf8               Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #728 = Methodref          #729.#730     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #729 = Class              #731          // ext/mods/gameserver/data/SkillTable
  #730 = NameAndType        #38:#732      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #731 = Utf8               ext/mods/gameserver/data/SkillTable
  #732 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #733 = Methodref          #277.#734     // java/lang/Integer.intValue:()I
  #734 = NameAndType        #735:#134     // intValue:()I
  #735 = Utf8               intValue
  #736 = Methodref          #729.#737     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #737 = NameAndType        #738:#739     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #738 = Utf8               getInfo
  #739 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #740 = Methodref          #741.#742     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #741 = Class              #743          // ext/mods/gameserver/skills/L2Skill
  #742 = NameAndType        #744:#745     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #743 = Utf8               ext/mods/gameserver/skills/L2Skill
  #744 = Utf8               getEffects
  #745 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #746 = Utf8               ConstantValue
  #747 = Utf8               Signature
  #748 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
  #749 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
  #750 = Utf8               Code
  #751 = Utf8               LineNumberTable
  #752 = Utf8               LocalVariableTable
  #753 = Utf8               this
  #754 = Utf8               init
  #755 = Utf8               startParticipation
  #756 = Utf8               e
  #757 = Utf8               Ljava/lang/Exception;
  #758 = Utf8               tmpl
  #759 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #760 = Utf8               StackMapTable
  #761 = Class              #762          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #762 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #763 = Utf8               startFight
  #764 = Utf8               player
  #765 = Utf8               Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
  #766 = Utf8               listPlayer
  #767 = Utf8               Ljava/util/Collection;
  #768 = Utf8               players
  #769 = Utf8               Ljava/util/TreeSet;
  #770 = Utf8               LocalVariableTypeTable
  #771 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
  #772 = Utf8               Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
  #773 = Utf8               (Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;)Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
  #774 = Utf8               calculateRewards
  #775 = Utf8               playerPointPrev
  #776 = Utf8               i
  #777 = Utf8               msg
  #778 = Utf8               inv
  #779 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #780 = Utf8               reward
  #781 = Utf8               dmplayer
  #782 = Utf8               pos
  #783 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #784 = Utf8               systemMessage
  #785 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #786 = Utf8               rewards
  #787 = Utf8               statusUpdate
  #788 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #789 = Utf8               npcHtmlMessage
  #790 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #791 = Utf8               Ljava/util/List<[I>;
  #792 = Utf8               stopFight
  #793 = Utf8               color
  #794 = Utf8               row
  #795 = Utf8               [Ljava/lang/String;
  #796 = Utf8               c
  #797 = Utf8               Ljava/lang/Boolean;
  #798 = Utf8               c1
  #799 = Utf8               c2
  #800 = Utf8               topPositions
  #801 = Utf8               activeChar
  #802 = Utf8               htmltext
  #803 = Class              #795          // "[Ljava/lang/String;"
  #804 = Utf8               hexCode
  #805 = Utf8               objectId
  #806 = Utf8               itemId
  #807 = Utf8               itemNum
  #808 = Utf8               message
  #809 = Utf8               cs
  #810 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #811 = Utf8               onLogin
  #812 = Utf8               onLogout
  #813 = Utf8               onBypass
  #814 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #815 = Utf8               htmContent
  #816 = Utf8               playerLevel
  #817 = Utf8               command
  #818 = Utf8               onAction
  #819 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #820 = Utf8               onScrollUse
  #821 = Utf8               onPotionUse
  #822 = Utf8               onEscapeUse
  #823 = Utf8               onItemSummon
  #824 = Utf8               onKill
  #825 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #826 = Utf8               killer
  #827 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #828 = Utf8               attackingPlayer
  #829 = Utf8               onTeleported
  #830 = Utf8               party
  #831 = Utf8               Lext/mods/gameserver/model/group/Party;
  #832 = Utf8               buffs
  #833 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #834 = Utf8               state
  #835 = Class              #836          // java/lang/Object
  #836 = Utf8               java/lang/Object
  #837 = Class              #838          // java/lang/Throwable
  #838 = Utf8               java/lang/Throwable
  #839 = Utf8               isInactive
  #840 = Utf8               j
  #841 = Utf8               countPos
  #842 = Utf8               text
  #843 = Utf8               array
  #844 = Utf8               [B
  #845 = Utf8               hex
  #846 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #847 = Utf8               lambda$onTeleported$0
  #848 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #849 = Utf8               key
  #850 = Utf8               Ljava/lang/Integer;
  #851 = Utf8               value
  #852 = Utf8               skill
  #853 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #854 = Utf8               SourceFile
  #855 = Utf8               DMEvent.java
  #856 = Utf8               NestMembers
  #857 = Utf8               BootstrapMethods
  #858 = String             #859          // DMEvent.startParticipation(): exception: \u0001
  #859 = Utf8               DMEvent.startParticipation(): exception: \u0001
  #860 = MethodType         #285          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #861 = MethodHandle       5:#243        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
  #862 = MethodType         #863          //  (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/Short;
  #863 = Utf8               (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/Short;
  #864 = MethodHandle       5:#865        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getDeath:()S
  #865 = Methodref          #160.#866     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getDeath:()S
  #866 = NameAndType        #867:#246     // getDeath:()S
  #867 = Utf8               getDeath
  #868 = MethodHandle       5:#869        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getHexCode:()Ljava/lang/String;
  #869 = Methodref          #160.#870     // ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getHexCode:()Ljava/lang/String;
  #870 = NameAndType        #871:#113     // getHexCode:()Ljava/lang/String;
  #871 = Utf8               getHexCode
  #872 = MethodType         #873          //  (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/String;
  #873 = Utf8               (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/String;
  #874 = String             #875          // \u0001 Player: \u0001
  #875 = Utf8               \u0001 Player: \u0001
  #876 = String             #877          // \u0001 Killed: \u0001
  #877 = Utf8               \u0001 Killed: \u0001
  #878 = String             #879          // \u0001\n
  #879 = Utf8               \u0001\n
  #880 = String             #881          // Deathmatch: ended, thanks to everyone who participated!\nWinner(s):\n\u0001
  #881 = Utf8               Deathmatch: ended, thanks to everyone who participated!\nWinner(s):\n\u0001
  #882 = String             #883          // \u0001<tr>
  #883 = Utf8               \u0001<tr>
  #884 = String             #885          // \u0001<td width=\"35\" align=\"center\"><font color=\"\u0001\">\u0001</font></td>
  #885 = Utf8               \u0001<td width=\"35\" align=\"center\"><font color=\"\u0001\">\u0001</font></td>
  #886 = String             #887          // \u0001<td width=\"100\" align=\"left\"><font color=\"\u0001\">\u0001</font></td>
  #887 = Utf8               \u0001<td width=\"100\" align=\"left\"><font color=\"\u0001\">\u0001</font></td>
  #888 = String             #889          // \u0001<td width=\"125\" align=\"right\"><font color=\"\u0001\">\u0001</font></td>
  #889 = Utf8               \u0001<td width=\"125\" align=\"right\"><font color=\"\u0001\">\u0001</font></td>
  #890 = String             #891          // \u0001</tr>
  #891 = Utf8               \u0001</tr>
  #892 = String             #893          // \u0001 \u0001
  #893 = Utf8               \u0001 \u0001
  #894 = String             #895          // \u0001 Hunted Player \u0001!
  #895 = Utf8               \u0001 Hunted Player \u0001!
  #896 = MethodType         #897          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #897 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #898 = MethodHandle       6:#899        // REF_invokeStatic ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #899 = Methodref          #10.#900      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #900 = NameAndType        #847:#848     // lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #901 = MethodType         #902          //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #902 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #903 = String             #904          // \u0001\u0001,\u0001;
  #904 = Utf8               \u0001\u0001,\u0001;
  #905 = MethodHandle       6:#906        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #906 = Methodref          #907.#908     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #907 = Class              #909          // java/lang/invoke/StringConcatFactory
  #908 = NameAndType        #116:#910     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #909 = Utf8               java/lang/invoke/StringConcatFactory
  #910 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #911 = MethodHandle       6:#912        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #912 = Methodref          #913.#914     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #913 = Class              #915          // java/lang/invoke/LambdaMetafactory
  #914 = NameAndType        #916:#917     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #915 = Utf8               java/lang/invoke/LambdaMetafactory
  #916 = Utf8               metafactory
  #917 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #918 = Utf8               InnerClasses
  #919 = Utf8               SingletonHolder
  #920 = Class              #921          // java/lang/invoke/MethodHandles$Lookup
  #921 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #922 = Class              #923          // java/lang/invoke/MethodHandles
  #923 = Utf8               java/lang/invoke/MethodHandles
  #924 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.events.deathmatch.DMEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/entity/Events."<init>":()V
         4: aload_0
         5: ldc           #7                  // String html/mods/events/dm/
         7: putfield      #9                  // Field htmlPath:Ljava/lang/String;
        10: aload_0
        11: getstatic     #15                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
        14: putfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
        17: aload_0
        18: new           #24                 // class java/util/HashMap
        21: dup
        22: invokespecial #26                 // Method java/util/HashMap."<init>":()V
        25: putfield      #27                 // Field _player:Ljava/util/Map;
        28: aload_0
        29: new           #24                 // class java/util/HashMap
        32: dup
        33: invokespecial #26                 // Method java/util/HashMap."<init>":()V
        36: putfield      #31                 // Field _teleported:Ljava/util/Map;
        39: return
      LineNumberTable:
        line 74: 0
        line 62: 4
        line 64: 10
        line 70: 17
        line 71: 28
        line 75: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;

  public void init();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
         3: iconst_3
         4: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
         7: return
      LineNumberTable:
        line 79: 0
        line 80: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;

  public boolean startParticipation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: invokestatic  #44                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
         3: getstatic     #49                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_ID:I
         6: invokevirtual #55                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: astore_1
        10: aload_1
        11: ifnonnull     24
        14: getstatic     #59                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        17: ldc           #63                 // String DMEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in configs?
        19: invokevirtual #65                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        22: iconst_0
        23: ireturn
        24: aload_0
        25: new           #71                 // class ext/mods/gameserver/model/spawn/Spawn
        28: dup
        29: aload_1
        30: invokespecial #73                 // Method ext/mods/gameserver/model/spawn/Spawn."<init>":(Lext/mods/gameserver/model/actor/template/NpcTemplate;)V
        33: putfield      #76                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        36: aload_0
        37: getfield      #76                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        40: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        43: iconst_0
        44: iaload
        45: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        48: iconst_1
        49: iaload
        50: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        53: iconst_2
        54: iaload
        55: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        58: iconst_3
        59: iaload
        60: invokevirtual #84                 // Method ext/mods/gameserver/model/spawn/Spawn.setLoc:(IIII)V
        63: aload_0
        64: getfield      #76                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        67: iconst_1
        68: invokevirtual #88                 // Method ext/mods/gameserver/model/spawn/Spawn.setRespawnDelay:(I)V
        71: invokestatic  #91                 // Method ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
        74: aload_0
        75: getfield      #76                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        78: invokevirtual #96                 // Method ext/mods/gameserver/data/manager/SpawnManager.addSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
        81: aload_0
        82: aload_0
        83: getfield      #76                 // Field _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
        86: iconst_0
        87: invokevirtual #100                // Method ext/mods/gameserver/model/spawn/Spawn.doSpawn:(Z)Lext/mods/gameserver/model/actor/Npc;
        90: putfield      #104                // Field _lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
        93: goto          115
        96: astore_2
        97: getstatic     #59                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       100: aload_2
       101: invokevirtual #110                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       104: invokedynamic #114,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       109: aload_2
       110: invokevirtual #118                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       113: iconst_0
       114: ireturn
       115: aload_0
       116: getstatic     #121                // Field ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
       119: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       122: iconst_1
       123: ireturn
      Exception table:
         from    to  target type
            24    93    96   Class java/lang/Exception
      LineNumberTable:
        line 84: 0
        line 86: 10
        line 88: 14
        line 89: 22
        line 94: 24
        line 95: 36
        line 96: 63
        line 98: 71
        line 99: 81
        line 105: 93
        line 101: 96
        line 103: 97
        line 104: 113
        line 107: 115
        line 108: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           97      18     2     e   Ljava/lang/Exception;
            0     124     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getstatic     #128                // Field ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: aload_0
         8: invokevirtual #131                // Method getPlayerCounts:()I
        11: getstatic     #135                // Field ext/mods/Config.DM_EVENT_MIN_PLAYERS:I
        14: if_icmpge     102
        17: aload_0
        18: getstatic     #15                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
        21: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
        24: aload_0
        25: getfield      #27                 // Field _player:Ljava/util/Map;
        28: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        33: invokeinterface #144,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        38: astore_1
        39: aload_1
        40: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        45: ifeq          80
        48: aload_1
        49: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        54: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
        57: astore_2
        58: aload_2
        59: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        62: getstatic     #166                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
        65: iconst_0
        66: iaload
        67: getstatic     #166                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
        70: iconst_1
        71: iaload
        72: iconst_1
        73: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
        76: pop
        77: goto          39
        80: aload_0
        81: getfield      #27                 // Field _player:Ljava/util/Map;
        84: invokeinterface #175,  1          // InterfaceMethod java/util/Map.clear:()V
        89: aload_0
        90: invokevirtual #178                // Method unSpawnNpc:()V
        93: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
        96: iconst_3
        97: invokevirtual #181                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       100: iconst_0
       101: ireturn
       102: getstatic     #183                // Field ext/mods/Config.DM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
       105: invokestatic  #187                // Method closeDoors:(Ljava/util/List;)V
       108: aload_0
       109: getstatic     #191                // Field ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
       112: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       115: aload_0
       116: getfield      #27                 // Field _player:Ljava/util/Map;
       119: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       124: invokeinterface #144,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       129: astore_1
       130: aload_1
       131: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       136: ifeq          170
       139: aload_1
       140: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       145: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
       148: astore_2
       149: aload_2
       150: ifnull        167
       153: new           #194                // class ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
       156: dup
       157: aload_2
       158: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       161: iconst_0
       162: iconst_0
       163: invokespecial #196                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
       166: pop
       167: goto          130
       170: iconst_1
       171: ireturn
      LineNumberTable:
        line 113: 0
        line 115: 7
        line 117: 17
        line 119: 24
        line 120: 58
        line 122: 80
        line 124: 89
        line 125: 93
        line 126: 100
        line 129: 102
        line 131: 108
        line 133: 115
        line 135: 149
        line 136: 153
        line 137: 167
        line 139: 170
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      19     2 player   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
          149      18     2 player   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0     172     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 40
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/Iterator ]
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public java.util.TreeSet<ext.mods.gameserver.model.entity.events.deathmatch.DMPlayer> orderPosition(java.util.Collection<ext.mods.gameserver.model.entity.events.deathmatch.DMPlayer>);
    descriptor: (Ljava/util/Collection;)Ljava/util/TreeSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: new           #199                // class java/util/TreeSet
         3: dup
         4: invokedynamic #201,  0            // InvokeDynamic #1:apply:()Ljava/util/function/Function;
         9: invokestatic  #205                // InterfaceMethod java/util/Comparator.reverseOrder:()Ljava/util/Comparator;
        12: invokestatic  #211                // InterfaceMethod java/util/Comparator.comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
        15: invokedynamic #215,  0            // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        20: invokeinterface #216,  2          // InterfaceMethod java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        25: invokedynamic #220,  0            // InvokeDynamic #3:apply:()Ljava/util/function/Function;
        30: invokeinterface #216,  2          // InterfaceMethod java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        35: invokespecial #221                // Method java/util/TreeSet."<init>":(Ljava/util/Comparator;)V
        38: astore_2
        39: aload_2
        40: aload_1
        41: invokevirtual #224                // Method java/util/TreeSet.addAll:(Ljava/util/Collection;)Z
        44: pop
        45: aload_2
        46: areturn
      LineNumberTable:
        line 144: 0
        line 145: 39
        line 146: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      47     1 listPlayer   Ljava/util/Collection;
           39       8     2 players   Ljava/util/TreeSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      47     1 listPlayer   Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
           39       8     2 players   Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
    Signature: #773                         // (Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;)Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;

  public java.lang.String calculateRewards();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #27                 // Field _player:Ljava/util/Map;
         5: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        10: invokevirtual #228                // Method orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
        13: astore_1
        14: ldc           #232                // String
        16: astore_2
        17: iconst_0
        18: istore_3
        19: iload_3
        20: getstatic     #234                // Field ext/mods/Config.DM_REWARD_FIRST_PLAYERS:I
        23: if_icmpge     164
        26: aload_1
        27: invokevirtual #237                // Method java/util/TreeSet.isEmpty:()Z
        30: ifeq          36
        33: goto          164
        36: aload_1
        37: invokevirtual #240                // Method java/util/TreeSet.first:()Ljava/lang/Object;
        40: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
        43: astore        4
        45: aload         4
        47: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
        50: ifne          56
        53: goto          164
        56: aload_0
        57: aload         4
        59: iload_3
        60: iconst_1
        61: iadd
        62: invokevirtual #247                // Method rewardPlayer:(Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;I)V
        65: aload_1
        66: aload         4
        68: invokevirtual #251                // Method java/util/TreeSet.remove:(Ljava/lang/Object;)Z
        71: pop
        72: aload         4
        74: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
        77: istore        5
        79: aload_1
        80: invokevirtual #237                // Method java/util/TreeSet.isEmpty:()Z
        83: ifne          158
        86: aload         4
        88: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
        91: iload         5
        93: if_icmpeq     99
        96: goto          158
        99: aload_0
       100: aload         4
       102: iload_3
       103: iconst_1
       104: iadd
       105: invokevirtual #247                // Method rewardPlayer:(Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;I)V
       108: aload_1
       109: aload         4
       111: invokevirtual #251                // Method java/util/TreeSet.remove:(Ljava/lang/Object;)Z
       114: pop
       115: aload_2
       116: aload         4
       118: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       121: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       124: invokedynamic #258,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       129: astore_2
       130: aload_2
       131: aload         4
       133: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
       136: invokedynamic #261,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
       141: astore_2
       142: aload_2
       143: invokedynamic #264,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       148: astore_2
       149: getstatic     #265                // Field ext/mods/Config.DM_REWARD_PLAYERS_TIE:Z
       152: ifne          79
       155: goto          158
       158: iinc          3, 1
       161: goto          19
       164: aload_0
       165: getstatic     #269                // Field ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
       168: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       171: aload_2
       172: invokedynamic #272,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       177: areturn
      LineNumberTable:
        line 151: 0
        line 152: 14
        line 154: 17
        line 156: 26
        line 157: 33
        line 159: 36
        line 161: 45
        line 162: 53
        line 164: 56
        line 165: 65
        line 166: 72
        line 168: 79
        line 170: 86
        line 171: 96
        line 173: 99
        line 174: 108
        line 175: 115
        line 176: 130
        line 177: 142
        line 179: 149
        line 180: 155
        line 154: 158
        line 184: 164
        line 186: 171
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45     113     4 player   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
           79      79     5 playerPointPrev   I
           19     145     3     i   I
            0     178     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
           14     164     1 players   Ljava/util/TreeSet;
           17     161     2   msg   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14     164     1 players   Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
      StackMapTable: number_of_entries = 7
        frame_type = 254 /* append */
          offset_delta = 19
          locals = [ class java/util/TreeSet, class java/lang/String, int ]
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 19 /* same */
        frame_type = 249 /* chop */
          offset_delta = 58
        frame_type = 250 /* chop */
          offset_delta = 5

  public void stopFight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=1
         0: aload_0
         1: getstatic     #375                // Field ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: aload_0
         8: invokevirtual #178                // Method unSpawnNpc:()V
        11: getstatic     #183                // Field ext/mods/Config.DM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
        14: invokestatic  #378                // Method openDoors:(Ljava/util/List;)V
        17: ldc           #232                // String
        19: astore_2
        20: getstatic     #381                // Field ext/mods/Config.DM_SHOW_TOP_RANK:Z
        23: ifeq          169
        26: aload_0
        27: getstatic     #384                // Field ext/mods/Config.DM_TOP_RANK:I
        30: invokevirtual #387                // Method getFirstPosition:(I)[Ljava/lang/String;
        33: astore_1
        34: iconst_1
        35: invokestatic  #391                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        38: astore_3
        39: ldc_w         #396                // String D9CC46
        42: astore        4
        44: ldc_w         #398                // String FFFFFF
        47: astore        5
        49: aload_1
        50: ifnull        169
        53: iconst_0
        54: istore        6
        56: iload         6
        58: aload_1
        59: arraylength
        60: if_icmpge     169
        63: aload_3
        64: invokevirtual #400                // Method java/lang/Boolean.booleanValue:()Z
        67: ifeq          75
        70: aload         4
        72: goto          77
        75: aload         5
        77: astore        7
        79: aload_1
        80: iload         6
        82: aaload
        83: ldc_w         #403                // String \\,
        86: invokevirtual #405                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        89: astore        8
        91: aload_2
        92: invokedynamic #411,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        97: astore_2
        98: aload_2
        99: aload         7
       101: iload         6
       103: iconst_1
       104: iadd
       105: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       108: invokedynamic #415,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       113: astore_2
       114: aload_2
       115: aload         7
       117: aload         8
       119: iconst_0
       120: aaload
       121: invokedynamic #418,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       126: astore_2
       127: aload_2
       128: aload         7
       130: aload         8
       132: iconst_1
       133: aaload
       134: invokedynamic #419,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       139: astore_2
       140: aload_2
       141: invokedynamic #420,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       146: astore_2
       147: aload_3
       148: invokevirtual #400                // Method java/lang/Boolean.booleanValue:()Z
       151: ifne          158
       154: iconst_1
       155: goto          159
       158: iconst_0
       159: invokestatic  #391                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       162: astore_3
       163: iinc          6, 1
       166: goto          56
       169: aload_0
       170: getfield      #27                 // Field _player:Ljava/util/Map;
       173: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
       178: invokeinterface #144,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       183: astore_3
       184: aload_3
       185: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       190: ifeq          288
       193: aload_3
       194: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       199: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
       202: astore        4
       204: aload         4
       206: ifnull        285
       209: aload         4
       211: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       214: astore        5
       216: getstatic     #381                // Field ext/mods/Config.DM_SHOW_TOP_RANK:Z
       219: ifeq          267
       222: new           #343                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       225: dup
       226: iconst_0
       227: invokespecial #345                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       230: astore        6
       232: aload         6
       234: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       237: aload         5
       239: ldc_w         #421                // String html/mods/events/dm/TopRank.htm
       242: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       245: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       248: aload         6
       250: ldc_w         #423                // String %toprank%
       253: aload_2
       254: invokevirtual #425                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       257: aload         4
       259: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       262: aload         6
       264: invokevirtual #334                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       267: new           #194                // class ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
       270: dup
       271: aload         4
       273: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       276: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
       279: iconst_0
       280: iconst_0
       281: invokespecial #429                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
       284: pop
       285: goto          184
       288: aload_0
       289: new           #24                 // class java/util/HashMap
       292: dup
       293: invokespecial #26                 // Method java/util/HashMap."<init>":()V
       296: putfield      #31                 // Field _teleported:Ljava/util/Map;
       299: aload_0
       300: new           #24                 // class java/util/HashMap
       303: dup
       304: invokespecial #26                 // Method java/util/HashMap."<init>":()V
       307: putfield      #27                 // Field _player:Ljava/util/Map;
       310: aload_0
       311: getstatic     #15                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
       314: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       317: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       320: iconst_3
       321: invokevirtual #181                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       324: return
      LineNumberTable:
        line 236: 0
        line 238: 7
        line 240: 11
        line 243: 17
        line 244: 20
        line 246: 26
        line 247: 34
        line 248: 39
        line 249: 44
        line 250: 49
        line 251: 53
        line 253: 63
        line 254: 79
        line 255: 91
        line 256: 98
        line 257: 114
        line 258: 127
        line 259: 140
        line 260: 147
        line 251: 163
        line 264: 169
        line 266: 204
        line 268: 209
        line 269: 216
        line 271: 222
        line 272: 232
        line 273: 248
        line 274: 257
        line 277: 267
        line 279: 285
        line 281: 288
        line 282: 299
        line 284: 310
        line 285: 317
        line 286: 324
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           79      84     7 color   Ljava/lang/String;
           91      72     8   row   [Ljava/lang/String;
           56     113     6     i   I
           39     130     3     c   Ljava/lang/Boolean;
           44     125     4    c1   Ljava/lang/String;
           49     120     5    c2   Ljava/lang/String;
           34     135     1 topPositions   [Ljava/lang/String;
          232      35     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          216      69     5 activeChar   Lext/mods/gameserver/model/actor/Player;
          204      81     4 player   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0     325     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
           20     305     2 htmltext   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMEvent, class "[Ljava/lang/String;", class java/lang/String, class java/lang/Boolean, class java/lang/String, class java/lang/String, int ]
          stack = []
        frame_type = 18 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 80
          locals = [ class java/lang/String, class "[Ljava/lang/String;" ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMEvent, top, class java/lang/String ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 82
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 250 /* chop */
          offset_delta = 2

  public synchronized boolean addParticipant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: aload_1
         8: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: aload_0
        18: bipush        16
        20: invokevirtual #436                // Method generateHex:(I)[B
        23: invokevirtual #440                // Method hexToString:([B)Ljava/lang/String;
        26: astore_2
        27: aload_0
        28: getfield      #27                 // Field _player:Ljava/util/Map;
        31: aload_1
        32: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        35: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: new           #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
        41: dup
        42: aload_1
        43: aload_2
        44: invokespecial #447                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer."<init>":(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        47: invokeinterface #450,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        52: pop
        53: iconst_1
        54: ireturn
      LineNumberTable:
        line 290: 0
        line 291: 4
        line 293: 6
        line 294: 14
        line 296: 16
        line 297: 27
        line 298: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      55     1 player   Lext/mods/gameserver/model/actor/Player;
           27      28     2 hexCode   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 6 /* same */
        frame_type = 9 /* same */

  public boolean isPlayerParticipant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        27
         4: aload_0
         5: getfield      #27                 // Field _player:Ljava/util/Map;
         8: aload_1
         9: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        12: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #454,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        20: ifeq          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 303: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      29     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isPlayerParticipant(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #457                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_1
         4: invokevirtual #462                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
         7: astore_2
         8: aload_2
         9: ifnonnull     14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: aload_2
        16: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        19: ireturn
      LineNumberTable:
        line 308: 0
        line 309: 8
        line 310: 12
        line 312: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      20     1 objectId   I
            8      12     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  public boolean removeParticipant(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        27
         4: aload_0
         5: getfield      #27                 // Field _player:Ljava/util/Map;
         8: aload_1
         9: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        12: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #465,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        20: ifnull        27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 317: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      29     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean payParticipationFee(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: getstatic     #166                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
         4: iconst_0
         5: iaload
         6: getstatic     #166                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: iconst_1
        12: invokevirtual #467                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        15: ireturn
      LineNumberTable:
        line 322: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getParticipationFee();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: getstatic     #166                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
         3: iconst_0
         4: iaload
         5: istore_1
         6: getstatic     #166                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: istore_2
        12: iload_1
        13: ifeq          20
        16: iload_2
        17: ifne          24
        20: ldc_w         #471                // String -
        23: areturn
        24: iload_2
        25: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        28: invokestatic  #294                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        31: iload_1
        32: invokevirtual #299                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        35: invokevirtual #473                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        38: invokedynamic #474,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        43: areturn
      LineNumberTable:
        line 327: 0
        line 328: 6
        line 330: 12
        line 331: 20
        line 333: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
         0: new           #475                // class ext/mods/gameserver/network/serverpackets/CreatureSay
         3: dup
         4: iconst_0
         5: getstatic     #477                // Field ext/mods/gameserver/enums/SayType.PARTY:Lext/mods/gameserver/enums/SayType;
         8: ldc_w         #483                // String Event Manager
        11: aload_1
        12: invokespecial #485                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
        15: astore_2
        16: aload_0
        17: getfield      #27                 // Field _player:Ljava/util/Map;
        20: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        25: invokeinterface #144,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        30: astore_3
        31: aload_3
        32: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        37: ifeq          68
        40: aload_3
        41: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        46: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
        49: astore        4
        51: aload         4
        53: ifnull        65
        56: aload         4
        58: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        61: aload_2
        62: invokevirtual #334                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: goto          31
        68: return
      LineNumberTable:
        line 338: 0
        line 340: 16
        line 341: 51
        line 342: 56
        line 341: 65
        line 343: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      14     4 player   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
            0      69     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      69     1 message   Ljava/lang/String;
           16      53     2    cs   Lext/mods/gameserver/network/serverpackets/CreatureSay;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/network/serverpackets/CreatureSay, class java/util/Iterator ]
        frame_type = 33 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public void onLogin(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnull        18
         4: aload_0
         5: invokevirtual #503                // Method isStarting:()Z
         8: ifne          19
        11: aload_0
        12: invokevirtual #506                // Method isStarted:()Z
        15: ifne          19
        18: return
        19: aload_0
        20: aload_1
        21: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        24: ifne          28
        27: return
        28: new           #194                // class ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
        31: dup
        32: aload_1
        33: iconst_0
        34: iconst_0
        35: invokespecial #196                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
        38: pop
        39: return
      LineNumberTable:
        line 357: 0
        line 358: 18
        line 360: 19
        line 361: 27
        line 363: 28
        line 364: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      40     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 0 /* same */
        frame_type = 8 /* same */

  public void onLogout(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_1
         1: ifnull        89
         4: aload_0
         5: invokevirtual #503                // Method isStarting:()Z
         8: ifne          25
        11: aload_0
        12: invokevirtual #506                // Method isStarted:()Z
        15: ifne          25
        18: aload_0
        19: invokevirtual #509                // Method isParticipating:()Z
        22: ifeq          89
        25: invokestatic  #512                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        28: aload_1
        29: invokevirtual #517                // Method ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
        32: ifeq          42
        35: getstatic     #520                // Field ext/mods/Config.SAFEDISCONNECT_INTEGRATION_DM:Z
        38: ifeq          42
        41: return
        42: aload_0
        43: aload_1
        44: invokevirtual #523                // Method removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        47: ifeq          89
        50: aload_1
        51: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        54: iconst_0
        55: iaload
        56: bipush        101
        58: invokestatic  #526                // Method ext/mods/commons/random/Rnd.get:(I)I
        61: iadd
        62: bipush        50
        64: isub
        65: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        68: iconst_1
        69: iaload
        70: bipush        101
        72: invokestatic  #526                // Method ext/mods/commons/random/Rnd.get:(I)I
        75: iadd
        76: bipush        50
        78: isub
        79: getstatic     #80                 // Field ext/mods/Config.DM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        82: iconst_2
        83: iaload
        84: iconst_0
        85: invokevirtual #531                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        88: pop
        89: return
      LineNumberTable:
        line 368: 0
        line 370: 25
        line 371: 41
        line 373: 42
        line 374: 50
        line 376: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      90     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 25 /* same */
        frame_type = 16 /* same */
        frame_type = 46 /* same */

  public synchronized void onBypass(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=5, locals=6, args_size=3
         0: aload_2
         1: ifnull        11
         4: aload_0
         5: invokevirtual #509                // Method isParticipating:()Z
         8: ifne          12
        11: return
        12: aload_1
        13: ldc_w         #535                // String dm_event_participation
        16: invokevirtual #537                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        19: ifeq          466
        22: new           #343                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        25: dup
        26: iconst_0
        27: invokespecial #345                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        30: astore        4
        32: aload_2
        33: invokevirtual #540                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        36: invokevirtual #544                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        39: istore        5
        41: aload_2
        42: invokevirtual #549                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        45: ifeq          72
        48: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        51: aload_2
        52: ldc_w         #552                // String html/mods/events/dm/CursedWeaponEquipped.htm
        55: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        58: astore_3
        59: aload_3
        60: ifnull        457
        63: aload         4
        65: aload_3
        66: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        69: goto          457
        72: aload_2
        73: invokevirtual #554                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        76: ifeq          103
        79: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        82: aload_2
        83: ldc_w         #557                // String html/mods/events/dm/Olympiad.htm
        86: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        89: astore_3
        90: aload_3
        91: ifnull        457
        94: aload         4
        96: aload_3
        97: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       100: goto          457
       103: aload_2
       104: invokevirtual #559                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       107: ifle          134
       110: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       113: aload_2
       114: ldc_w         #562                // String html/mods/events/dm/Karma.htm
       117: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       120: astore_3
       121: aload_3
       122: ifnull        457
       125: aload         4
       127: aload_3
       128: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       131: goto          457
       134: getstatic     #564                // Field ext/mods/Config.DISABLE_ID_CLASSES_DM:Ljava/util/List;
       137: aload_2
       138: invokevirtual #567                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       141: invokevirtual #571                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       144: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       147: invokeinterface #576,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       152: ifeq          179
       155: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       158: aload_2
       159: ldc_w         #579                // String html/mods/events/dm/Class.htm
       162: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       165: astore_3
       166: aload_3
       167: ifnull        457
       170: aload         4
       172: aload_3
       173: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       176: goto          457
       179: iload         5
       181: getstatic     #581                // Field ext/mods/Config.DM_EVENT_MIN_LVL:B
       184: if_icmplt     195
       187: iload         5
       189: getstatic     #585                // Field ext/mods/Config.DM_EVENT_MAX_LVL:B
       192: if_icmple     247
       195: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       198: aload_2
       199: ldc_w         #588                // String html/mods/events/dm/Level.htm
       202: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       205: astore_3
       206: aload_3
       207: ifnull        457
       210: aload         4
       212: aload_3
       213: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       216: aload         4
       218: ldc_w         #590                // String %min%
       221: getstatic     #581                // Field ext/mods/Config.DM_EVENT_MIN_LVL:B
       224: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       227: invokevirtual #425                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       230: aload         4
       232: ldc_w         #592                // String %max%
       235: getstatic     #585                // Field ext/mods/Config.DM_EVENT_MAX_LVL:B
       238: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       241: invokevirtual #425                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       244: goto          457
       247: aload_0
       248: invokevirtual #131                // Method getPlayerCounts:()I
       251: getstatic     #594                // Field ext/mods/Config.DM_EVENT_MAX_PLAYERS:I
       254: if_icmpne     295
       257: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       260: aload_2
       261: ldc_w         #597                // String html/mods/events/dm/Full.htm
       264: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       267: astore_3
       268: aload_3
       269: ifnull        457
       272: aload         4
       274: aload_3
       275: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       278: aload         4
       280: ldc_w         #592                // String %max%
       283: getstatic     #594                // Field ext/mods/Config.DM_EVENT_MAX_PLAYERS:I
       286: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       289: invokevirtual #425                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       292: goto          457
       295: getstatic     #599                // Field ext/mods/Config.DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
       298: ifle          360
       301: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       304: iconst_3
       305: aload_2
       306: getstatic     #599                // Field ext/mods/Config.DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
       309: invokevirtual #602                // Method ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
       312: ifne          360
       315: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       318: aload_2
       319: ldc_w         #606                // String html/mods/events/dm/IPRestriction.htm
       322: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       325: astore_3
       326: aload_3
       327: ifnull        457
       330: aload         4
       332: aload_3
       333: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       336: aload         4
       338: ldc_w         #592                // String %max%
       341: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       344: aload_2
       345: getstatic     #599                // Field ext/mods/Config.DM_EVENT_MAX_PARTICIPANTS_PER_IP:I
       348: invokevirtual #608                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
       351: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       354: invokevirtual #425                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       357: goto          457
       360: aload_0
       361: aload_2
       362: invokevirtual #612                // Method payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       365: ifne          404
       368: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       371: aload_2
       372: ldc_w         #615                // String html/mods/events/dm/ParticipationFee.htm
       375: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       378: astore_3
       379: aload_3
       380: ifnull        457
       383: aload         4
       385: aload_3
       386: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       389: aload         4
       391: ldc_w         #617                // String %fee%
       394: aload_0
       395: invokevirtual #619                // Method getParticipationFee:()Ljava/lang/String;
       398: invokevirtual #425                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       401: goto          457
       404: aload_0
       405: aload_2
       406: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       409: ifeq          430
       412: aload         4
       414: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       417: aload_2
       418: ldc_w         #622                // String html/mods/events/dm/Registered.htm
       421: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       424: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       427: goto          457
       430: aload_0
       431: aload_2
       432: invokevirtual #624                // Method addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       435: ifeq          456
       438: aload         4
       440: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       443: aload_2
       444: ldc_w         #622                // String html/mods/events/dm/Registered.htm
       447: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       450: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       453: goto          457
       456: return
       457: aload_2
       458: aload         4
       460: invokevirtual #334                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       463: goto          521
       466: aload_1
       467: ldc_w         #627                // String dm_event_remove_participation
       470: invokevirtual #537                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       473: ifeq          521
       476: aload_0
       477: aload_2
       478: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       481: ifeq          521
       484: aload_0
       485: aload_2
       486: invokevirtual #523                // Method removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       489: pop
       490: new           #343                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       493: dup
       494: iconst_0
       495: invokespecial #345                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       498: astore        4
       500: aload         4
       502: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       505: aload_2
       506: ldc_w         #629                // String html/mods/events/dm/Unregistered.htm
       509: invokevirtual #367                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       512: invokevirtual #371                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       515: aload_2
       516: aload         4
       518: invokevirtual #334                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       521: return
      LineNumberTable:
        line 380: 0
        line 381: 11
        line 385: 12
        line 387: 22
        line 388: 32
        line 390: 41
        line 392: 48
        line 393: 59
        line 394: 63
        line 396: 72
        line 398: 79
        line 399: 90
        line 400: 94
        line 402: 103
        line 404: 110
        line 405: 121
        line 406: 125
        line 408: 134
        line 410: 155
        line 411: 166
        line 412: 170
        line 414: 179
        line 416: 195
        line 417: 206
        line 419: 210
        line 420: 216
        line 421: 230
        line 424: 247
        line 426: 257
        line 427: 268
        line 429: 272
        line 430: 278
        line 433: 295
        line 435: 315
        line 436: 326
        line 438: 330
        line 439: 336
        line 442: 360
        line 444: 368
        line 445: 379
        line 447: 383
        line 448: 389
        line 451: 404
        line 452: 412
        line 453: 430
        line 454: 438
        line 456: 456
        line 458: 457
        line 459: 463
        line 460: 466
        line 462: 476
        line 464: 484
        line 466: 490
        line 468: 500
        line 469: 515
        line 472: 521
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      13     3 htmContent   Ljava/lang/String;
           90      13     3 htmContent   Ljava/lang/String;
          121      13     3 htmContent   Ljava/lang/String;
          166      13     3 htmContent   Ljava/lang/String;
          206      41     3 htmContent   Ljava/lang/String;
          268      27     3 htmContent   Ljava/lang/String;
          326      34     3 htmContent   Ljava/lang/String;
          379      25     3 htmContent   Ljava/lang/String;
           32     431     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           41     422     5 playerLevel   I
          500      21     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     522     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0     522     1 command   Ljava/lang/String;
            0     522     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 16
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ top, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 30 /* same */
        frame_type = 30 /* same */
        frame_type = 44 /* same */
        frame_type = 15 /* same */
        frame_type = 51 /* same */
        frame_type = 47 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 43 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 0 /* same */
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 54 /* same */

  public boolean onAction(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ifnull        11
         4: aload_0
         5: invokevirtual #506                // Method isStarted:()Z
         8: ifne          13
        11: iconst_1
        12: ireturn
        13: aload_1
        14: invokevirtual #631                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        17: ifeq          22
        20: iconst_1
        21: ireturn
        22: aload_0
        23: aload_1
        24: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        27: ifne          40
        30: aload_0
        31: iload_2
        32: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        35: ifeq          40
        38: iconst_0
        39: ireturn
        40: aload_0
        41: aload_1
        42: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        45: ifeq          58
        48: aload_0
        49: iload_2
        50: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        53: ifne          58
        56: iconst_0
        57: ireturn
        58: iconst_1
        59: ireturn
      LineNumberTable:
        line 476: 0
        line 477: 11
        line 479: 13
        line 480: 20
        line 482: 22
        line 483: 38
        line 485: 40
        line 486: 56
        line 488: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      60     1 player   Lext/mods/gameserver/model/actor/Player;
            0      60     2 objectId   I
      StackMapTable: number_of_entries = 5
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */

  public boolean onScrollUse(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #506                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #637                // Field ext/mods/Config.DM_EVENT_SCROLL_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 493: 0
        line 494: 7
        line 496: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
         1: invokevirtual #506                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #640                // Field ext/mods/Config.DM_EVENT_POTIONS_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 501: 0
        line 502: 7
        line 504: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
         1: invokevirtual #506                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        14: ireturn
      LineNumberTable:
        line 509: 0
        line 510: 7
        line 512: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      15     1 objectId   I
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean onItemSummon(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #506                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #643                // Field ext/mods/Config.DM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 517: 0
        line 518: 7
        line 520: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
      stack=5, locals=4, args_size=3
         0: aload_2
         1: ifnull        22
         4: aload_0
         5: invokevirtual #506                // Method isStarted:()Z
         8: ifeq          22
        11: aload_0
        12: aload_2
        13: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        19: ifne          23
        22: return
        23: new           #194                // class ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter
        26: dup
        27: aload_2
        28: iconst_0
        29: iconst_0
        30: invokespecial #196                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
        33: pop
        34: aconst_null
        35: astore_3
        36: aload_1
        37: instanceof    #646                // class ext/mods/gameserver/model/actor/instance/Pet
        40: ifne          50
        43: aload_1
        44: instanceof    #648                // class ext/mods/gameserver/model/actor/Summon
        47: ifeq          61
        50: aload_1
        51: checkcast     #648                // class ext/mods/gameserver/model/actor/Summon
        54: invokevirtual #650                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
        57: astore_3
        58: goto          73
        61: aload_1
        62: instanceof    #170                // class ext/mods/gameserver/model/actor/Player
        65: ifeq          73
        68: aload_1
        69: checkcast     #170                // class ext/mods/gameserver/model/actor/Player
        72: astore_3
        73: aload_3
        74: ifnull        146
        77: aload_0
        78: aload_3
        79: invokevirtual #432                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        82: ifeq          146
        85: aload_0
        86: getfield      #27                 // Field _player:Ljava/util/Map;
        89: aload_3
        90: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        93: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        96: invokeinterface #282,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       101: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
       104: invokevirtual #653                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.increasePoints:()V
       107: aload_0
       108: aload_3
       109: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       112: aload_2
       113: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       116: invokedynamic #656,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       121: invokevirtual #657                // Method sysMsgToAllParticipants:(Ljava/lang/String;)V
       124: aload_0
       125: getfield      #27                 // Field _player:Ljava/util/Map;
       128: aload_3
       129: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       132: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       135: invokeinterface #282,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       140: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
       143: invokevirtual #660                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.increaseDeath:()V
       146: return
      LineNumberTable:
        line 525: 0
        line 526: 22
        line 528: 23
        line 530: 34
        line 531: 36
        line 532: 50
        line 533: 61
        line 534: 68
        line 536: 73
        line 538: 85
        line 539: 107
        line 540: 124
        line 542: 146
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     147     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0     147     1 killer   Lext/mods/gameserver/model/actor/Creature;
            0     147     2 player   Lext/mods/gameserver/model/actor/Player;
           36     111     3 attackingPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 22 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 11 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72

  public void onTeleported(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #506                // Method isStarted:()Z
         4: ifeq          22
         7: aload_1
         8: ifnull        22
        11: aload_0
        12: aload_1
        13: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #634                // Method isPlayerParticipant:(I)Z
        19: ifne          23
        22: return
        23: aload_0
        24: getfield      #31                 // Field _teleported:Ljava/util/Map;
        27: aload_1
        28: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        31: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: invokeinterface #454,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        39: ifeq          67
        42: aload_0
        43: getfield      #31                 // Field _teleported:Ljava/util/Map;
        46: aload_1
        47: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: invokeinterface #282,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        58: checkcast     #392                // class java/lang/Boolean
        61: invokevirtual #400                // Method java/lang/Boolean.booleanValue:()Z
        64: ifne          71
        67: aload_1
        68: invokestatic  #663                // Method spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
        71: aload_1
        72: invokevirtual #667                // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        75: ifeq          84
        78: getstatic     #670                // Field ext/mods/Config.DM_EVENT_MAGE_BUFFS:Ljava/util/Map;
        81: goto          87
        84: getstatic     #673                // Field ext/mods/Config.DM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
        87: astore_2
        88: aload_2
        89: ifnull        101
        92: aload_2
        93: invokeinterface #676,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        98: ifeq          102
       101: return
       102: aload_2
       103: aload_1
       104: invokedynamic #677,  0            // InvokeDynamic #15:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       109: invokeinterface #681,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       114: aload_1
       115: invokevirtual #685                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       118: ifnull        134
       121: aload_1
       122: invokevirtual #685                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       125: astore_3
       126: aload_3
       127: aload_1
       128: getstatic     #689                // Field ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
       131: invokevirtual #695                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       134: aload_1
       135: invokevirtual #701                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
       138: aload_0
       139: getfield      #31                 // Field _teleported:Ljava/util/Map;
       142: aload_1
       143: invokevirtual #444                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       146: invokestatic  #276                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       149: iconst_1
       150: invokestatic  #391                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       153: invokeinterface #450,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       158: pop
       159: return
      LineNumberTable:
        line 546: 0
        line 547: 22
        line 549: 23
        line 550: 67
        line 552: 71
        line 554: 88
        line 555: 101
        line 557: 102
        line 564: 114
        line 566: 121
        line 567: 126
        line 570: 134
        line 571: 138
        line 572: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126       8     3 party   Lext/mods/gameserver/model/group/Party;
            0     160     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
         1: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #15                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
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
        line 586: 0
        line 588: 7
        line 589: 23
        line 591: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isInactive   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMEvent, int ]
          stack = []

  public boolean isParticipating();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #121                // Field ext/mods/gameserver/enums/EventState.PARTICIPATING:Lext/mods/gameserver/enums/EventState;
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
        line 598: 0
        line 600: 7
        line 601: 23
        line 603: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isParticipating   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMEvent, int ]
          stack = []

  public boolean isStarting();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #128                // Field ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
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
        line 610: 0
        line 612: 7
        line 613: 23
        line 615: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarting   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMEvent, int ]
          stack = []

  public boolean isStarted();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
         4: dup
         5: astore_2
         6: monitorenter
         7: aload_0
         8: getfield      #21                 // Field _state:Lext/mods/gameserver/enums/EventState;
        11: getstatic     #191                // Field ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
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
        line 622: 0
        line 624: 7
        line 625: 23
        line 627: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarted   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMEvent, int ]
          stack = []

  public int getPlayerCounts();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _player:Ljava/util/Map;
         4: invokeinterface #704,  1          // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 632: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;

  public java.lang.String[] getFirstPosition(int);
    descriptor: (I)[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #27                 // Field _player:Ljava/util/Map;
         5: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        10: invokevirtual #228                // Method orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
        13: astore_2
        14: ldc           #232                // String
        16: astore_3
        17: iconst_0
        18: istore        4
        20: iload         4
        22: iload_1
        23: if_icmpge     170
        26: aload_2
        27: invokevirtual #237                // Method java/util/TreeSet.isEmpty:()Z
        30: ifeq          36
        33: goto          170
        36: aload_2
        37: invokevirtual #240                // Method java/util/TreeSet.first:()Ljava/lang/Object;
        40: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
        43: astore        5
        45: aload         5
        47: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
        50: ifne          56
        53: goto          170
        56: aload_3
        57: aload         5
        59: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        62: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        65: aload         5
        67: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
        70: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        73: invokedynamic #707,  0            // InvokeDynamic #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        78: astore_3
        79: aload_2
        80: aload         5
        82: invokevirtual #251                // Method java/util/TreeSet.remove:(Ljava/lang/Object;)Z
        85: pop
        86: aload         5
        88: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
        91: istore        6
        93: getstatic     #265                // Field ext/mods/Config.DM_REWARD_PLAYERS_TIE:Z
        96: ifne          102
        99: goto          164
       102: aload_2
       103: invokevirtual #237                // Method java/util/TreeSet.isEmpty:()Z
       106: ifne          164
       109: aload_2
       110: invokevirtual #240                // Method java/util/TreeSet.first:()Ljava/lang/Object;
       113: checkcast     #160                // class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer
       116: astore        5
       118: aload         5
       120: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
       123: iload         6
       125: if_icmpeq     131
       128: goto          164
       131: aload_3
       132: aload         5
       134: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       137: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       140: aload         5
       142: invokevirtual #243                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
       145: invokestatic  #412                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       148: invokedynamic #707,  0            // InvokeDynamic #16:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       153: astore_3
       154: aload_2
       155: aload         5
       157: invokevirtual #251                // Method java/util/TreeSet.remove:(Ljava/lang/Object;)Z
       160: pop
       161: goto          102
       164: iinc          4, 1
       167: goto          20
       170: aload_3
       171: ldc           #232                // String
       173: if_acmpeq     184
       176: aload_3
       177: ldc_w         #708                // String \\;
       180: invokevirtual #405                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       183: areturn
       184: aconst_null
       185: areturn
      LineNumberTable:
        line 637: 0
        line 638: 14
        line 639: 17
        line 641: 26
        line 642: 33
        line 644: 36
        line 646: 45
        line 647: 53
        line 649: 56
        line 650: 79
        line 652: 86
        line 654: 93
        line 655: 99
        line 657: 102
        line 659: 109
        line 660: 118
        line 661: 128
        line 663: 131
        line 664: 154
        line 639: 164
        line 668: 170
        line 669: 176
        line 671: 184
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           45     119     5 player   Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;
           93      71     6 playerPointPrev   I
           20     150     4     j   I
            0     186     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0     186     1 countPos   I
           14     172     2 players   Ljava/util/TreeSet;
           17     169     3  text   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14     172     2 players   Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;>;
      StackMapTable: number_of_entries = 8
        frame_type = 254 /* append */
          offset_delta = 20
          locals = [ class java/util/TreeSet, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ int ]
        frame_type = 28 /* same */
        frame_type = 249 /* chop */
          offset_delta = 32
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 13 /* same */

  public byte[] generateHex(int);
    descriptor: (I)[B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=2
         0: iload_1
         1: newarray       byte
         3: astore_2
         4: aload_2
         5: invokestatic  #710                // Method ext/mods/commons/random/Rnd.nextBytes:([B)[B
         8: pop
         9: aload_2
        10: areturn
      LineNumberTable:
        line 676: 0
        line 677: 4
        line 678: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      11     1  size   I
            4       7     2 array   [B

  public java.lang.String hexToString(byte[]);
    descriptor: ([B)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: new           #714                // class java/math/BigInteger
         3: dup
         4: aload_1
         5: invokespecial #716                // Method java/math/BigInteger."<init>":([B)V
         8: bipush        16
        10: invokevirtual #719                // Method java/math/BigInteger.toString:(I)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 683: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
            0      14     1   hex   [B

  public static final ext.mods.gameserver.model.entity.events.deathmatch.DMEvent getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #722                // Field ext/mods/gameserver/model/entity/events/deathmatch/DMEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
         3: areturn
      LineNumberTable:
        line 688: 0
}
SourceFile: "DMEvent.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/deathmatch/DMEvent$SingletonHolder
BootstrapMethods:
  0: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #858 DMEvent.startParticipation(): exception: \u0001
  1: #911 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #860 (Ljava/lang/Object;)Ljava/lang/Object;
      #861 REF_invokeVirtual ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getPoints:()S
      #862 (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/Short;
  2: #911 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #860 (Ljava/lang/Object;)Ljava/lang/Object;
      #864 REF_invokeVirtual ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getDeath:()S
      #862 (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/Short;
  3: #911 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #860 (Ljava/lang/Object;)Ljava/lang/Object;
      #868 REF_invokeVirtual ext/mods/gameserver/model/entity/events/deathmatch/DMPlayer.getHexCode:()Ljava/lang/String;
      #872 (Lext/mods/gameserver/model/entity/events/deathmatch/DMPlayer;)Ljava/lang/String;
  4: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #874 \u0001 Player: \u0001
  5: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #876 \u0001 Killed: \u0001
  6: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #878 \u0001\n
  7: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #880 Deathmatch: ended, thanks to everyone who participated!\nWinner(s):\n\u0001
  8: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #882 \u0001<tr>
  9: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #884 \u0001<td width=\"35\" align=\"center\"><font color=\"\u0001\">\u0001</font></td>
  10: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #886 \u0001<td width=\"100\" align=\"left\"><font color=\"\u0001\">\u0001</font></td>
  11: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #888 \u0001<td width=\"125\" align=\"right\"><font color=\"\u0001\">\u0001</font></td>
  12: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #890 \u0001</tr>
  13: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #892 \u0001 \u0001
  14: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #894 \u0001 Hunted Player \u0001!
  15: #911 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #896 (Ljava/lang/Object;Ljava/lang/Object;)V
      #898 REF_invokeStatic ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #901 (Ljava/lang/Integer;Ljava/lang/Integer;)V
  16: #905 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #903 \u0001\u0001,\u0001;
InnerClasses:
  public static final #924= #920 of #922; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
