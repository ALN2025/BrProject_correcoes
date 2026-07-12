// Bytecode for: ext.mods.gameserver.model.entity.events.lastman.LMEvent
// File: ext\mods\gameserver\model\entity\events\lastman\LMEvent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/lastman/LMEvent.class
  Last modified 9 de jul de 2026; size 23061 bytes
  MD5 checksum 12ce45e02980c659a6f9f99c4ecd6a9b
  Compiled from "LMEvent.java"
public class ext.mods.gameserver.model.entity.events.lastman.LMEvent extends ext.mods.gameserver.model.entity.Events
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  super_class: #2                         // ext/mods/gameserver/model/entity/Events
  interfaces: 0, fields: 6, methods: 37, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/entity/Events."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/entity/Events
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/entity/Events
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // html/mods/events/lm/
    #8 = Utf8               html/mods/events/lm/
    #9 = Fieldref           #10.#11       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.htmlPath:Ljava/lang/String;
   #10 = Class              #12           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #11 = NameAndType        #13:#14       // htmlPath:Ljava/lang/String;
   #12 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #13 = Utf8               htmlPath
   #14 = Utf8               Ljava/lang/String;
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
   #16 = Class              #18           // ext/mods/gameserver/enums/EventState
   #17 = NameAndType        #19:#20       // INACTIVE:Lext/mods/gameserver/enums/EventState;
   #18 = Utf8               ext/mods/gameserver/enums/EventState
   #19 = Utf8               INACTIVE
   #20 = Utf8               Lext/mods/gameserver/enums/EventState;
   #21 = Fieldref           #10.#22       // ext/mods/gameserver/model/entity/events/lastman/LMEvent._state:Lext/mods/gameserver/enums/EventState;
   #22 = NameAndType        #23:#20       // _state:Lext/mods/gameserver/enums/EventState;
   #23 = Utf8               _state
   #24 = Class              #25           // java/util/HashMap
   #25 = Utf8               java/util/HashMap
   #26 = Methodref          #24.#3        // java/util/HashMap."<init>":()V
   #27 = Fieldref           #10.#28       // ext/mods/gameserver/model/entity/events/lastman/LMEvent._player:Ljava/util/Map;
   #28 = NameAndType        #29:#30       // _player:Ljava/util/Map;
   #29 = Utf8               _player
   #30 = Utf8               Ljava/util/Map;
   #31 = Fieldref           #10.#32       // ext/mods/gameserver/model/entity/events/lastman/LMEvent._teleported:Ljava/util/Map;
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
   #49 = Fieldref           #50.#51       // ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_ID:I
   #50 = Class              #52           // ext/mods/Config
   #51 = NameAndType        #53:#54       // LM_EVENT_PARTICIPATION_NPC_ID:I
   #52 = Utf8               ext/mods/Config
   #53 = Utf8               LM_EVENT_PARTICIPATION_NPC_ID
   #54 = Utf8               I
   #55 = Methodref          #45.#56       // ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #56 = NameAndType        #57:#58       // getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #57 = Utf8               getTemplate
   #58 = Utf8               (I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #59 = Fieldref           #10.#60       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.LOGGER:Lext/mods/commons/logging/CLogger;
   #60 = NameAndType        #61:#62       // LOGGER:Lext/mods/commons/logging/CLogger;
   #61 = Utf8               LOGGER
   #62 = Utf8               Lext/mods/commons/logging/CLogger;
   #63 = String             #64           // LMEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in Configs?
   #64 = Utf8               LMEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in Configs?
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
   #76 = Fieldref           #10.#77       // ext/mods/gameserver/model/entity/events/lastman/LMEvent._npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
   #77 = NameAndType        #78:#79       // _npcSpawn:Lext/mods/gameserver/model/spawn/Spawn;
   #78 = Utf8               _npcSpawn
   #79 = Utf8               Lext/mods/gameserver/model/spawn/Spawn;
   #80 = Fieldref           #50.#81       // ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #81 = NameAndType        #82:#83       // LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
   #82 = Utf8               LM_EVENT_PARTICIPATION_NPC_COORDINATES
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
  #104 = Fieldref           #10.#105      // ext/mods/gameserver/model/entity/events/lastman/LMEvent._lastNpcSpawn:Lext/mods/gameserver/model/actor/Npc;
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
  #124 = Methodref          #10.#125      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.setState:(Lext/mods/gameserver/enums/EventState;)V
  #125 = NameAndType        #126:#127     // setState:(Lext/mods/gameserver/enums/EventState;)V
  #126 = Utf8               setState
  #127 = Utf8               (Lext/mods/gameserver/enums/EventState;)V
  #128 = Fieldref           #16.#129      // ext/mods/gameserver/enums/EventState.STARTING:Lext/mods/gameserver/enums/EventState;
  #129 = NameAndType        #130:#20      // STARTING:Lext/mods/gameserver/enums/EventState;
  #130 = Utf8               STARTING
  #131 = Methodref          #10.#132      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getPlayerCounts:()I
  #132 = NameAndType        #133:#134     // getPlayerCounts:()I
  #133 = Utf8               getPlayerCounts
  #134 = Utf8               ()I
  #135 = Fieldref           #50.#136      // ext/mods/Config.LM_EVENT_MIN_PLAYERS:I
  #136 = NameAndType        #137:#54      // LM_EVENT_MIN_PLAYERS:I
  #137 = Utf8               LM_EVENT_MIN_PLAYERS
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
  #160 = Class              #161          // ext/mods/gameserver/model/entity/events/lastman/LMPlayer
  #161 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMPlayer
  #162 = Methodref          #160.#163     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #163 = NameAndType        #164:#165     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #164 = Utf8               getPlayer
  #165 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #166 = Fieldref           #50.#167      // ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
  #167 = NameAndType        #168:#83      // LM_EVENT_PARTICIPATION_FEE:[I
  #168 = Utf8               LM_EVENT_PARTICIPATION_FEE
  #169 = Methodref          #170.#171     // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #170 = Class              #172          // ext/mods/gameserver/model/actor/Player
  #171 = NameAndType        #173:#174     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #172 = Utf8               ext/mods/gameserver/model/actor/Player
  #173 = Utf8               addItem
  #174 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #175 = InterfaceMethodref #139.#176     // java/util/Map.clear:()V
  #176 = NameAndType        #177:#6       // clear:()V
  #177 = Utf8               clear
  #178 = Methodref          #10.#179      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.unSpawnNpc:()V
  #179 = NameAndType        #180:#6       // unSpawnNpc:()V
  #180 = Utf8               unSpawnNpc
  #181 = Methodref          #35.#182      // ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
  #182 = NameAndType        #177:#43      // clear:(I)V
  #183 = Fieldref           #50.#184      // ext/mods/Config.LM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #184 = NameAndType        #185:#186     // LM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
  #185 = Utf8               LM_DOORS_IDS_TO_CLOSE
  #186 = Utf8               Ljava/util/List;
  #187 = Methodref          #10.#188      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.closeDoors:(Ljava/util/List;)V
  #188 = NameAndType        #189:#190     // closeDoors:(Ljava/util/List;)V
  #189 = Utf8               closeDoors
  #190 = Utf8               (Ljava/util/List;)V
  #191 = Fieldref           #16.#192      // ext/mods/gameserver/enums/EventState.STARTED:Lext/mods/gameserver/enums/EventState;
  #192 = NameAndType        #193:#20      // STARTED:Lext/mods/gameserver/enums/EventState;
  #193 = Utf8               STARTED
  #194 = Class              #195          // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
  #195 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
  #196 = Methodref          #194.#197     // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #197 = NameAndType        #5:#198       // "<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #198 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #199 = Class              #200          // java/util/TreeSet
  #200 = Utf8               java/util/TreeSet
  #201 = InvokeDynamic      #1:#202       // #1:applyAsInt:()Ljava/util/function/ToIntFunction;
  #202 = NameAndType        #203:#204     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #203 = Utf8               applyAsInt
  #204 = Utf8               ()Ljava/util/function/ToIntFunction;
  #205 = InterfaceMethodref #206.#207     // java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #206 = Class              #208          // java/util/Comparator
  #207 = NameAndType        #209:#210     // comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #208 = Utf8               java/util/Comparator
  #209 = Utf8               comparingInt
  #210 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #211 = InterfaceMethodref #206.#212     // java/util/Comparator.reversed:()Ljava/util/Comparator;
  #212 = NameAndType        #213:#214     // reversed:()Ljava/util/Comparator;
  #213 = Utf8               reversed
  #214 = Utf8               ()Ljava/util/Comparator;
  #215 = InvokeDynamic      #2:#216       // #2:apply:()Ljava/util/function/Function;
  #216 = NameAndType        #217:#218     // apply:()Ljava/util/function/Function;
  #217 = Utf8               apply
  #218 = Utf8               ()Ljava/util/function/Function;
  #219 = InterfaceMethodref #206.#220     // java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #220 = NameAndType        #221:#222     // thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
  #221 = Utf8               thenComparing
  #222 = Utf8               (Ljava/util/function/Function;)Ljava/util/Comparator;
  #223 = InvokeDynamic      #3:#216       // #3:apply:()Ljava/util/function/Function;
  #224 = Methodref          #199.#225     // java/util/TreeSet."<init>":(Ljava/util/Comparator;)V
  #225 = NameAndType        #5:#226       // "<init>":(Ljava/util/Comparator;)V
  #226 = Utf8               (Ljava/util/Comparator;)V
  #227 = Methodref          #199.#228     // java/util/TreeSet.addAll:(Ljava/util/Collection;)Z
  #228 = NameAndType        #229:#230     // addAll:(Ljava/util/Collection;)Z
  #229 = Utf8               addAll
  #230 = Utf8               (Ljava/util/Collection;)Z
  #231 = Methodref          #10.#232      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
  #232 = NameAndType        #233:#234     // orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
  #233 = Utf8               orderPosition
  #234 = Utf8               (Ljava/util/Collection;)Ljava/util/TreeSet;
  #235 = String             #236          //
  #236 = Utf8
  #237 = Fieldref           #50.#238      // ext/mods/Config.LM_REWARD_PLAYERS_TIE:Z
  #238 = NameAndType        #239:#240     // LM_REWARD_PLAYERS_TIE:Z
  #239 = Utf8               LM_REWARD_PLAYERS_TIE
  #240 = Utf8               Z
  #241 = String             #242          // Last Man ended, thanks to everyone who participated!\nHe did not have winners!
  #242 = Utf8               Last Man ended, thanks to everyone who participated!\nHe did not have winners!
  #243 = Methodref          #199.#244     // java/util/TreeSet.size:()I
  #244 = NameAndType        #245:#134     // size:()I
  #245 = Utf8               size
  #246 = Methodref          #199.#247     // java/util/TreeSet.isEmpty:()Z
  #247 = NameAndType        #248:#155     // isEmpty:()Z
  #248 = Utf8               isEmpty
  #249 = Methodref          #199.#250     // java/util/TreeSet.first:()Ljava/lang/Object;
  #250 = NameAndType        #251:#159     // first:()Ljava/lang/Object;
  #251 = Utf8               first
  #252 = Methodref          #160.#253     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getCredits:()S
  #253 = NameAndType        #254:#255     // getCredits:()S
  #254 = Utf8               getCredits
  #255 = Utf8               ()S
  #256 = Methodref          #160.#257     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPoints:()S
  #257 = NameAndType        #258:#255     // getPoints:()S
  #258 = Utf8               getPoints
  #259 = Methodref          #10.#260      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.rewardPlayer:(Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)V
  #260 = NameAndType        #261:#262     // rewardPlayer:(Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)V
  #261 = Utf8               rewardPlayer
  #262 = Utf8               (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)V
  #263 = Methodref          #199.#264     // java/util/TreeSet.remove:(Ljava/lang/Object;)Z
  #264 = NameAndType        #265:#266     // remove:(Ljava/lang/Object;)Z
  #265 = Utf8               remove
  #266 = Utf8               (Ljava/lang/Object;)Z
  #267 = Methodref          #170.#268     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #268 = NameAndType        #269:#113     // getName:()Ljava/lang/String;
  #269 = Utf8               getName
  #270 = InvokeDynamic      #4:#271       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #271 = NameAndType        #116:#272     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #272 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #273 = InvokeDynamic      #5:#274       // #5:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
  #274 = NameAndType        #116:#275     // makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
  #275 = Utf8               (Ljava/lang/String;S)Ljava/lang/String;
  #276 = Fieldref           #50.#277      // ext/mods/Config.LM_EVENT_PLAYER_CREDITS:S
  #277 = NameAndType        #278:#279     // LM_EVENT_PLAYER_CREDITS:S
  #278 = Utf8               LM_EVENT_PLAYER_CREDITS
  #279 = Utf8               S
  #280 = Methodref          #281.#282     // java/lang/String.valueOf:(I)Ljava/lang/String;
  #281 = Class              #283          // java/lang/String
  #282 = NameAndType        #284:#285     // valueOf:(I)Ljava/lang/String;
  #283 = Utf8               java/lang/String
  #284 = Utf8               valueOf
  #285 = Utf8               (I)Ljava/lang/String;
  #286 = InvokeDynamic      #6:#271       // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #287 = InvokeDynamic      #7:#115       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #288 = Fieldref           #16.#289      // ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
  #289 = NameAndType        #290:#20      // REWARDING:Lext/mods/gameserver/enums/EventState;
  #290 = Utf8               REWARDING
  #291 = InvokeDynamic      #8:#115       // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #292 = Fieldref           #50.#293      // ext/mods/Config.LM_EVENT_HERO:Z
  #293 = NameAndType        #294:#240     // LM_EVENT_HERO:Z
  #294 = Utf8               LM_EVENT_HERO
  #295 = Fieldref           #50.#296      // ext/mods/Config.LV_EVENT_HERO_DAYS:I
  #296 = NameAndType        #297:#54      // LV_EVENT_HERO_DAYS:I
  #297 = Utf8               LV_EVENT_HERO_DAYS
  #298 = Methodref          #10.#299      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.setHero:(Lext/mods/gameserver/model/actor/Player;I)V
  #299 = NameAndType        #300:#301     // setHero:(Lext/mods/gameserver/model/actor/Player;I)V
  #300 = Utf8               setHero
  #301 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #302 = Fieldref           #50.#303      // ext/mods/Config.LM_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #303 = NameAndType        #304:#305     // LM_EVENT_REWARDS:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #304 = Utf8               LM_EVENT_REWARDS
  #305 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #306 = Methodref          #170.#307     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #307 = NameAndType        #308:#309     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #308 = Utf8               getInventory
  #309 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #310 = Methodref          #311.#312     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #311 = Class              #313          // ext/mods/gameserver/data/xml/ItemData
  #312 = NameAndType        #38:#314      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #313 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #314 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #315 = Methodref          #316.#317     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #316 = Class              #318          // ext/mods/gameserver/model/holder/IntIntHolder
  #317 = NameAndType        #319:#134     // getId:()I
  #318 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #319 = Utf8               getId
  #320 = Methodref          #311.#321     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #321 = NameAndType        #57:#322      // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #322 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #323 = Methodref          #324.#325     // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #324 = Class              #326          // ext/mods/gameserver/model/item/kind/Item
  #325 = NameAndType        #327:#155     // isStackable:()Z
  #326 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #327 = Utf8               isStackable
  #328 = Methodref          #316.#329     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #329 = NameAndType        #330:#134     // getValue:()I
  #330 = Utf8               getValue
  #331 = Methodref          #332.#333     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #332 = Class              #334          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #333 = NameAndType        #173:#335     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #334 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #335 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #336 = Fieldref           #337.#338     // ext/mods/gameserver/network/SystemMessageId.EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #337 = Class              #339          // ext/mods/gameserver/network/SystemMessageId
  #338 = NameAndType        #340:#341     // EARNED_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
  #339 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #340 = Utf8               EARNED_S2_S1_S
  #341 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #342 = Methodref          #343.#344     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #343 = Class              #345          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #344 = NameAndType        #346:#347     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #345 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #346 = Utf8               getSystemMessage
  #347 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #348 = Methodref          #343.#349     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #349 = NameAndType        #350:#351     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #350 = Utf8               addItemName
  #351 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #352 = Methodref          #343.#353     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #353 = NameAndType        #354:#351     // addItemNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #354 = Utf8               addItemNumber
  #355 = Fieldref           #337.#356     // ext/mods/gameserver/network/SystemMessageId.EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #356 = NameAndType        #357:#341     // EARNED_ITEM_S1:Lext/mods/gameserver/network/SystemMessageId;
  #357 = Utf8               EARNED_ITEM_S1
  #358 = Methodref          #170.#359     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #359 = NameAndType        #360:#361     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #360 = Utf8               sendPacket
  #361 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #362 = Class              #363          // ext/mods/gameserver/network/serverpackets/StatusUpdate
  #363 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
  #364 = Methodref          #362.#365     // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #365 = NameAndType        #5:#366       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #366 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #367 = Class              #368          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #368 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #369 = Methodref          #367.#370     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #370 = NameAndType        #5:#43        // "<init>":(I)V
  #371 = Fieldref           #372.#373     // ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #372 = Class              #374          // ext/mods/gameserver/enums/StatusType
  #373 = NameAndType        #375:#376     // CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #374 = Utf8               ext/mods/gameserver/enums/StatusType
  #375 = Utf8               CUR_LOAD
  #376 = Utf8               Lext/mods/gameserver/enums/StatusType;
  #377 = Methodref          #170.#378     // ext/mods/gameserver/model/actor/Player.getCurrentWeight:()I
  #378 = NameAndType        #379:#134     // getCurrentWeight:()I
  #379 = Utf8               getCurrentWeight
  #380 = Methodref          #362.#381     // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #381 = NameAndType        #382:#383     // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #382 = Utf8               addAttribute
  #383 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
  #384 = Methodref          #385.#386     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #385 = Class              #387          // ext/mods/gameserver/data/HTMLData
  #386 = NameAndType        #38:#388      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #387 = Utf8               ext/mods/gameserver/data/HTMLData
  #388 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #389 = String             #390          // html/mods/events/lm/Reward.htm
  #390 = Utf8               html/mods/events/lm/Reward.htm
  #391 = Methodref          #385.#392     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #392 = NameAndType        #393:#394     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #393 = Utf8               getHtm
  #394 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #395 = Methodref          #367.#396     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #396 = NameAndType        #397:#398     // setHtml:(Ljava/lang/String;)V
  #397 = Utf8               setHtml
  #398 = Utf8               (Ljava/lang/String;)V
  #399 = Fieldref           #16.#400      // ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
  #400 = NameAndType        #401:#20      // INACTIVATING:Lext/mods/gameserver/enums/EventState;
  #401 = Utf8               INACTIVATING
  #402 = Methodref          #10.#403      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.openDoors:(Ljava/util/List;)V
  #403 = NameAndType        #404:#190     // openDoors:(Ljava/util/List;)V
  #404 = Utf8               openDoors
  #405 = Methodref          #194.#406     // ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #406 = NameAndType        #5:#407       // "<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #407 = Utf8               (Lext/mods/gameserver/model/actor/Player;[IZZ)V
  #408 = Methodref          #10.#409      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #409 = NameAndType        #410:#411     // isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #410 = Utf8               isPlayerParticipant
  #411 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #412 = Methodref          #10.#413      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.generateHex:(I)[B
  #413 = NameAndType        #414:#415     // generateHex:(I)[B
  #414 = Utf8               generateHex
  #415 = Utf8               (I)[B
  #416 = Methodref          #10.#417      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.hexToString:([B)Ljava/lang/String;
  #417 = NameAndType        #418:#419     // hexToString:([B)Ljava/lang/String;
  #418 = Utf8               hexToString
  #419 = Utf8               ([B)Ljava/lang/String;
  #420 = Methodref          #170.#421     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #421 = NameAndType        #422:#134     // getObjectId:()I
  #422 = Utf8               getObjectId
  #423 = Methodref          #424.#425     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #424 = Class              #426          // java/lang/Integer
  #425 = NameAndType        #284:#427     // valueOf:(I)Ljava/lang/Integer;
  #426 = Utf8               java/lang/Integer
  #427 = Utf8               (I)Ljava/lang/Integer;
  #428 = Methodref          #160.#429     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer."<init>":(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #429 = NameAndType        #5:#430       // "<init>":(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #430 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #431 = InterfaceMethodref #139.#432     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #432 = NameAndType        #433:#434     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #433 = Utf8               put
  #434 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #435 = InterfaceMethodref #139.#436     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #436 = NameAndType        #437:#266     // containsKey:(Ljava/lang/Object;)Z
  #437 = Utf8               containsKey
  #438 = Methodref          #439.#440     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #439 = Class              #441          // ext/mods/gameserver/model/World
  #440 = NameAndType        #38:#442      // getInstance:()Lext/mods/gameserver/model/World;
  #441 = Utf8               ext/mods/gameserver/model/World
  #442 = Utf8               ()Lext/mods/gameserver/model/World;
  #443 = Methodref          #439.#444     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #444 = NameAndType        #164:#445     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #445 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #446 = InterfaceMethodref #139.#447     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #447 = NameAndType        #265:#448     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #448 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #449 = Methodref          #170.#450     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #450 = NameAndType        #451:#452     // destroyItemByItemId:(IIZ)Z
  #451 = Utf8               destroyItemByItemId
  #452 = Utf8               (IIZ)Z
  #453 = String             #454          // -
  #454 = Utf8               -
  #455 = Methodref          #324.#268     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #456 = InvokeDynamic      #9:#271       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #457 = Class              #458          // ext/mods/gameserver/network/serverpackets/CreatureSay
  #458 = Utf8               ext/mods/gameserver/network/serverpackets/CreatureSay
  #459 = Fieldref           #460.#461     // ext/mods/gameserver/enums/SayType.HERO_VOICE:Lext/mods/gameserver/enums/SayType;
  #460 = Class              #462          // ext/mods/gameserver/enums/SayType
  #461 = NameAndType        #463:#464     // HERO_VOICE:Lext/mods/gameserver/enums/SayType;
  #462 = Utf8               ext/mods/gameserver/enums/SayType
  #463 = Utf8               HERO_VOICE
  #464 = Utf8               Lext/mods/gameserver/enums/SayType;
  #465 = String             #466          // Event Manager
  #466 = Utf8               Event Manager
  #467 = Methodref          #457.#468     // ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #468 = NameAndType        #5:#469       // "<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #469 = Utf8               (ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
  #470 = Methodref          #471.#472     // ext/mods/gameserver/model/actor/Npc.deleteMe:()V
  #471 = Class              #473          // ext/mods/gameserver/model/actor/Npc
  #472 = NameAndType        #474:#6       // deleteMe:()V
  #473 = Utf8               ext/mods/gameserver/model/actor/Npc
  #474 = Utf8               deleteMe
  #475 = Methodref          #471.#476     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #476 = NameAndType        #477:#478     // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
  #477 = Utf8               getSpawn
  #478 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
  #479 = Methodref          #92.#480      // ext/mods/gameserver/data/manager/SpawnManager.deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #480 = NameAndType        #481:#99      // deleteSpawn:(Lext/mods/gameserver/model/spawn/Spawn;)V
  #481 = Utf8               deleteSpawn
  #482 = Methodref          #71.#483      // ext/mods/gameserver/model/spawn/Spawn.doDelete:()V
  #483 = NameAndType        #484:#6       // doDelete:()V
  #484 = Utf8               doDelete
  #485 = Methodref          #10.#486      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarting:()Z
  #486 = NameAndType        #487:#155     // isStarting:()Z
  #487 = Utf8               isStarting
  #488 = Methodref          #10.#489      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #489 = NameAndType        #490:#155     // isStarted:()Z
  #490 = Utf8               isStarted
  #491 = Methodref          #10.#492      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
  #492 = NameAndType        #493:#155     // isParticipating:()Z
  #493 = Utf8               isParticipating
  #494 = Methodref          #495.#496     // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #495 = Class              #497          // ext/mods/Safedisconect/SafeDisconnectManager
  #496 = NameAndType        #38:#498      // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #497 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
  #498 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
  #499 = Methodref          #495.#500     // ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #500 = NameAndType        #501:#411     // isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #501 = Utf8               isSafeDisconnectActive
  #502 = Fieldref           #50.#503      // ext/mods/Config.SAFEDISCONNECT_INTEGRATION_LM:Z
  #503 = NameAndType        #504:#240     // SAFEDISCONNECT_INTEGRATION_LM:Z
  #504 = Utf8               SAFEDISCONNECT_INTEGRATION_LM
  #505 = Methodref          #10.#506      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #506 = NameAndType        #507:#411     // removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #507 = Utf8               removeParticipant
  #508 = Methodref          #509.#510     // ext/mods/commons/random/Rnd.get:(I)I
  #509 = Class              #511          // ext/mods/commons/random/Rnd
  #510 = NameAndType        #512:#513     // get:(I)I
  #511 = Utf8               ext/mods/commons/random/Rnd
  #512 = Utf8               get
  #513 = Utf8               (I)I
  #514 = Methodref          #170.#515     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #515 = NameAndType        #516:#517     // teleportTo:(IIII)Z
  #516 = Utf8               teleportTo
  #517 = Utf8               (IIII)Z
  #518 = String             #519          // lm_event_participation
  #519 = Utf8               lm_event_participation
  #520 = Methodref          #281.#521     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #521 = NameAndType        #522:#266     // equals:(Ljava/lang/Object;)Z
  #522 = Utf8               equals
  #523 = Methodref          #170.#524     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #524 = NameAndType        #525:#526     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #525 = Utf8               getStatus
  #526 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #527 = Methodref          #528.#529     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #528 = Class              #530          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #529 = NameAndType        #531:#134     // getLevel:()I
  #530 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #531 = Utf8               getLevel
  #532 = Methodref          #170.#533     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #533 = NameAndType        #534:#155     // isCursedWeaponEquipped:()Z
  #534 = Utf8               isCursedWeaponEquipped
  #535 = String             #536          // html/mods/events/lm/CursedWeaponEquipped.htm
  #536 = Utf8               html/mods/events/lm/CursedWeaponEquipped.htm
  #537 = Methodref          #170.#538     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #538 = NameAndType        #539:#155     // isInOlympiadMode:()Z
  #539 = Utf8               isInOlympiadMode
  #540 = String             #541          // html/mods/events/lm/Olympiad.htm
  #541 = Utf8               html/mods/events/lm/Olympiad.htm
  #542 = Methodref          #170.#543     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #543 = NameAndType        #544:#134     // getKarma:()I
  #544 = Utf8               getKarma
  #545 = String             #546          // html/mods/events/lm/Karma.htm
  #546 = Utf8               html/mods/events/lm/Karma.htm
  #547 = Fieldref           #50.#548      // ext/mods/Config.DISABLE_ID_CLASSES_LM:Ljava/util/List;
  #548 = NameAndType        #549:#186     // DISABLE_ID_CLASSES_LM:Ljava/util/List;
  #549 = Utf8               DISABLE_ID_CLASSES_LM
  #550 = Methodref          #170.#551     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #551 = NameAndType        #552:#553     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #552 = Utf8               getClassId
  #553 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #554 = Methodref          #555.#317     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #555 = Class              #556          // ext/mods/gameserver/enums/actors/ClassId
  #556 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #557 = InterfaceMethodref #558.#559     // java/util/List.contains:(Ljava/lang/Object;)Z
  #558 = Class              #560          // java/util/List
  #559 = NameAndType        #561:#266     // contains:(Ljava/lang/Object;)Z
  #560 = Utf8               java/util/List
  #561 = Utf8               contains
  #562 = String             #563          // html/mods/events/lm/Class.htm
  #563 = Utf8               html/mods/events/lm/Class.htm
  #564 = Fieldref           #50.#565      // ext/mods/Config.LM_EVENT_MIN_LVL:B
  #565 = NameAndType        #566:#567     // LM_EVENT_MIN_LVL:B
  #566 = Utf8               LM_EVENT_MIN_LVL
  #567 = Utf8               B
  #568 = Fieldref           #50.#569      // ext/mods/Config.LM_EVENT_MAX_LVL:B
  #569 = NameAndType        #570:#567     // LM_EVENT_MAX_LVL:B
  #570 = Utf8               LM_EVENT_MAX_LVL
  #571 = String             #572          // html/mods/events/lm/Level.htm
  #572 = Utf8               html/mods/events/lm/Level.htm
  #573 = String             #574          // %min%
  #574 = Utf8               %min%
  #575 = Methodref          #367.#576     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #576 = NameAndType        #577:#578     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #577 = Utf8               replace
  #578 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #579 = String             #580          // %max%
  #580 = Utf8               %max%
  #581 = Fieldref           #50.#582      // ext/mods/Config.LM_EVENT_MAX_PLAYERS:I
  #582 = NameAndType        #583:#54      // LM_EVENT_MAX_PLAYERS:I
  #583 = Utf8               LM_EVENT_MAX_PLAYERS
  #584 = String             #585          // html/mods/events/lm/Full.htm
  #585 = Utf8               html/mods/events/lm/Full.htm
  #586 = Fieldref           #50.#587      // ext/mods/Config.LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #587 = NameAndType        #588:#54      // LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
  #588 = Utf8               LM_EVENT_MAX_PARTICIPANTS_PER_IP
  #589 = Methodref          #35.#590      // ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #590 = NameAndType        #591:#592     // tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
  #591 = Utf8               tryAddPlayer
  #592 = Utf8               (ILext/mods/gameserver/model/actor/Player;I)Z
  #593 = String             #594          // html/mods/events/lm/IPRestriction.htm
  #594 = Utf8               html/mods/events/lm/IPRestriction.htm
  #595 = Methodref          #35.#596      // ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #596 = NameAndType        #597:#598     // getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
  #597 = Utf8               getLimit
  #598 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)I
  #599 = Methodref          #10.#600      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #600 = NameAndType        #601:#411     // payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
  #601 = Utf8               payParticipationFee
  #602 = String             #603          // html/mods/events/lm/ParticipationFee.htm
  #603 = Utf8               html/mods/events/lm/ParticipationFee.htm
  #604 = String             #605          // %fee%
  #605 = Utf8               %fee%
  #606 = Methodref          #10.#607      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getParticipationFee:()Ljava/lang/String;
  #607 = NameAndType        #608:#113     // getParticipationFee:()Ljava/lang/String;
  #608 = Utf8               getParticipationFee
  #609 = String             #610          // html/mods/events/lm/Registered.htm
  #610 = Utf8               html/mods/events/lm/Registered.htm
  #611 = Methodref          #10.#612      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #612 = NameAndType        #613:#411     // addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #613 = Utf8               addParticipant
  #614 = String             #615          // lm_event_remove_participation
  #615 = Utf8               lm_event_remove_participation
  #616 = String             #617          // html/mods/events/lm/Unregistered.htm
  #617 = Utf8               html/mods/events/lm/Unregistered.htm
  #618 = Methodref          #170.#619     // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #619 = NameAndType        #620:#155     // isGM:()Z
  #620 = Utf8               isGM
  #621 = Methodref          #10.#622      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #622 = NameAndType        #410:#623     // isPlayerParticipant:(I)Z
  #623 = Utf8               (I)Z
  #624 = Fieldref           #50.#625      // ext/mods/Config.LM_EVENT_SCROLL_ALLOWED:Z
  #625 = NameAndType        #626:#240     // LM_EVENT_SCROLL_ALLOWED:Z
  #626 = Utf8               LM_EVENT_SCROLL_ALLOWED
  #627 = Fieldref           #50.#628      // ext/mods/Config.LM_EVENT_POTIONS_ALLOWED:Z
  #628 = NameAndType        #629:#240     // LM_EVENT_POTIONS_ALLOWED:Z
  #629 = Utf8               LM_EVENT_POTIONS_ALLOWED
  #630 = Fieldref           #50.#631      // ext/mods/Config.LM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #631 = NameAndType        #632:#240     // LM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
  #632 = Utf8               LM_EVENT_SUMMON_BY_ITEM_ALLOWED
  #633 = InterfaceMethodref #139.#634     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #634 = NameAndType        #512:#448     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #635 = Methodref          #160.#636     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer.decreaseCredits:()V
  #636 = NameAndType        #637:#6       // decreaseCredits:()V
  #637 = Utf8               decreaseCredits
  #638 = Class              #639          // ext/mods/gameserver/model/actor/instance/Pet
  #639 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #640 = Class              #641          // ext/mods/gameserver/model/actor/Summon
  #641 = Utf8               ext/mods/gameserver/model/actor/Summon
  #642 = Methodref          #640.#643     // ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #643 = NameAndType        #644:#165     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #644 = Utf8               getOwner
  #645 = Methodref          #160.#646     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer.increasePoints:()V
  #646 = NameAndType        #647:#6       // increasePoints:()V
  #647 = Utf8               increasePoints
  #648 = Fieldref           #460.#649     // ext/mods/gameserver/enums/SayType.TELL:Lext/mods/gameserver/enums/SayType;
  #649 = NameAndType        #650:#464     // TELL:Lext/mods/gameserver/enums/SayType;
  #650 = Utf8               TELL
  #651 = String             #652          // Last Man
  #652 = Utf8               Last Man
  #653 = InvokeDynamic      #10:#654      // #10:makeConcatWithConstants:(S)Ljava/lang/String;
  #654 = NameAndType        #116:#655     // makeConcatWithConstants:(S)Ljava/lang/String;
  #655 = Utf8               (S)Ljava/lang/String;
  #656 = String             #657          // You do not have credits, leaving the event!
  #657 = Utf8               You do not have credits, leaving the event!
  #658 = InvokeDynamic      #11:#659      // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #659 = NameAndType        #116:#285     // makeConcatWithConstants:(I)Ljava/lang/String;
  #660 = Methodref          #661.#662     // ext/mods/gameserver/model/entity/events/lastman/LMManager.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #661 = Class              #663          // ext/mods/gameserver/model/entity/events/lastman/LMManager
  #662 = NameAndType        #38:#664      // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #663 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager
  #664 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #665 = Methodref          #661.#666     // ext/mods/gameserver/model/entity/events/lastman/LMManager.skipDelay:()V
  #666 = NameAndType        #667:#6       // skipDelay:()V
  #667 = Utf8               skipDelay
  #668 = Class              #669          // java/lang/Boolean
  #669 = Utf8               java/lang/Boolean
  #670 = Methodref          #668.#671     // java/lang/Boolean.booleanValue:()Z
  #671 = NameAndType        #672:#155     // booleanValue:()Z
  #672 = Utf8               booleanValue
  #673 = Methodref          #10.#674      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
  #674 = NameAndType        #675:#676     // spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
  #675 = Utf8               spawnProtection
  #676 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #677 = Methodref          #170.#678     // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
  #678 = NameAndType        #679:#155     // isMageClass:()Z
  #679 = Utf8               isMageClass
  #680 = Fieldref           #50.#681      // ext/mods/Config.LM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #681 = NameAndType        #682:#30      // LM_EVENT_MAGE_BUFFS:Ljava/util/Map;
  #682 = Utf8               LM_EVENT_MAGE_BUFFS
  #683 = Fieldref           #50.#684      // ext/mods/Config.LM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #684 = NameAndType        #685:#30      // LM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
  #685 = Utf8               LM_EVENT_FIGHTER_BUFFS
  #686 = InterfaceMethodref #139.#247     // java/util/Map.isEmpty:()Z
  #687 = InvokeDynamic      #12:#688      // #12:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #688 = NameAndType        #689:#690     // accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #689 = Utf8               accept
  #690 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
  #691 = InterfaceMethodref #139.#692     // java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
  #692 = NameAndType        #693:#694     // forEach:(Ljava/util/function/BiConsumer;)V
  #693 = Utf8               forEach
  #694 = Utf8               (Ljava/util/function/BiConsumer;)V
  #695 = Methodref          #170.#696     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #696 = NameAndType        #697:#698     // getParty:()Lext/mods/gameserver/model/group/Party;
  #697 = Utf8               getParty
  #698 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #699 = Fieldref           #700.#701     // ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
  #700 = Class              #702          // ext/mods/gameserver/enums/MessageType
  #701 = NameAndType        #703:#704     // LEFT:Lext/mods/gameserver/enums/MessageType;
  #702 = Utf8               ext/mods/gameserver/enums/MessageType
  #703 = Utf8               LEFT
  #704 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #705 = Methodref          #706.#707     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #706 = Class              #708          // ext/mods/gameserver/model/group/Party
  #707 = NameAndType        #709:#710     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #708 = Utf8               ext/mods/gameserver/model/group/Party
  #709 = Utf8               removePartyMember
  #710 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #711 = Methodref          #170.#712     // ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
  #712 = NameAndType        #713:#6       // stopAllEffectsDebuff:()V
  #713 = Utf8               stopAllEffectsDebuff
  #714 = Methodref          #668.#715     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #715 = NameAndType        #284:#716     // valueOf:(Z)Ljava/lang/Boolean;
  #716 = Utf8               (Z)Ljava/lang/Boolean;
  #717 = InterfaceMethodref #139.#244     // java/util/Map.size:()I
  #718 = Methodref          #509.#719     // ext/mods/commons/random/Rnd.nextBytes:([B)[B
  #719 = NameAndType        #720:#721     // nextBytes:([B)[B
  #720 = Utf8               nextBytes
  #721 = Utf8               ([B)[B
  #722 = Class              #723          // java/math/BigInteger
  #723 = Utf8               java/math/BigInteger
  #724 = Methodref          #722.#725     // java/math/BigInteger."<init>":([B)V
  #725 = NameAndType        #5:#726       // "<init>":([B)V
  #726 = Utf8               ([B)V
  #727 = Methodref          #722.#728     // java/math/BigInteger.toString:(I)Ljava/lang/String;
  #728 = NameAndType        #729:#285     // toString:(I)Ljava/lang/String;
  #729 = Utf8               toString
  #730 = Methodref          #170.#731     // ext/mods/gameserver/model/actor/Player.setHero:(Z)V
  #731 = NameAndType        #300:#732     // setHero:(Z)V
  #732 = Utf8               (Z)V
  #733 = Methodref          #734.#735     // java/lang/System.currentTimeMillis:()J
  #734 = Class              #736          // java/lang/System
  #735 = NameAndType        #737:#738     // currentTimeMillis:()J
  #736 = Utf8               java/lang/System
  #737 = Utf8               currentTimeMillis
  #738 = Utf8               ()J
  #739 = Methodref          #170.#740     // ext/mods/gameserver/model/actor/Player.getHeroUntil:()J
  #740 = NameAndType        #741:#738     // getHeroUntil:()J
  #741 = Utf8               getHeroUntil
  #742 = Fieldref           #743.#744     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #743 = Class              #745          // java/util/concurrent/TimeUnit
  #744 = NameAndType        #746:#747     // DAYS:Ljava/util/concurrent/TimeUnit;
  #745 = Utf8               java/util/concurrent/TimeUnit
  #746 = Utf8               DAYS
  #747 = Utf8               Ljava/util/concurrent/TimeUnit;
  #748 = Methodref          #743.#749     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #749 = NameAndType        #750:#751     // toMillis:(J)J
  #750 = Utf8               toMillis
  #751 = Utf8               (J)J
  #752 = Methodref          #170.#753     // ext/mods/gameserver/model/actor/Player.setHeroUntil:(J)V
  #753 = NameAndType        #754:#755     // setHeroUntil:(J)V
  #754 = Utf8               setHeroUntil
  #755 = Utf8               (J)V
  #756 = Methodref          #170.#757     // ext/mods/gameserver/model/actor/Player.store:()V
  #757 = NameAndType        #758:#6       // store:()V
  #758 = Utf8               store
  #759 = Class              #760          // java/lang/Object
  #760 = Utf8               java/lang/Object
  #761 = Methodref          #170.#762     // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #762 = NameAndType        #763:#764     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #763 = Utf8               getSysString
  #764 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #765 = Methodref          #170.#766     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #766 = NameAndType        #767:#398     // sendMessage:(Ljava/lang/String;)V
  #767 = Utf8               sendMessage
  #768 = Methodref          #170.#769     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #769 = NameAndType        #770:#6       // broadcastUserInfo:()V
  #770 = Utf8               broadcastUserInfo
  #771 = Fieldref           #772.#773     // ext/mods/gameserver/model/entity/events/lastman/LMEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #772 = Class              #774          // ext/mods/gameserver/model/entity/events/lastman/LMEvent$SingletonHolder
  #773 = NameAndType        #775:#776     // INSTANCE:Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #774 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent$SingletonHolder
  #775 = Utf8               INSTANCE
  #776 = Utf8               Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #777 = Methodref          #778.#779     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #778 = Class              #780          // ext/mods/gameserver/data/SkillTable
  #779 = NameAndType        #38:#781      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #780 = Utf8               ext/mods/gameserver/data/SkillTable
  #781 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #782 = Methodref          #424.#783     // java/lang/Integer.intValue:()I
  #783 = NameAndType        #784:#134     // intValue:()I
  #784 = Utf8               intValue
  #785 = Methodref          #778.#786     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #786 = NameAndType        #787:#788     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #787 = Utf8               getInfo
  #788 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #789 = Methodref          #790.#791     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #790 = Class              #792          // ext/mods/gameserver/skills/L2Skill
  #791 = NameAndType        #793:#794     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #792 = Utf8               ext/mods/gameserver/skills/L2Skill
  #793 = Utf8               getEffects
  #794 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #795 = Utf8               ConstantValue
  #796 = Utf8               Signature
  #797 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
  #798 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;
  #799 = Utf8               Code
  #800 = Utf8               LineNumberTable
  #801 = Utf8               LocalVariableTable
  #802 = Utf8               this
  #803 = Utf8               init
  #804 = Utf8               startParticipation
  #805 = Utf8               e
  #806 = Utf8               Ljava/lang/Exception;
  #807 = Utf8               tmpl
  #808 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #809 = Utf8               StackMapTable
  #810 = Class              #811          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #811 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #812 = Utf8               startFight
  #813 = Utf8               player
  #814 = Utf8               Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
  #815 = Utf8               listPlayer
  #816 = Utf8               Ljava/util/Collection;
  #817 = Utf8               players
  #818 = Utf8               Ljava/util/TreeSet;
  #819 = Utf8               LocalVariableTypeTable
  #820 = Utf8               Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
  #821 = Utf8               Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
  #822 = Utf8               (Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;)Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
  #823 = Utf8               calculateRewards
  #824 = Utf8               i
  #825 = Utf8               msg
  #826 = Utf8               inv
  #827 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #828 = Utf8               reward
  #829 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #830 = Utf8               lmplayer
  #831 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #832 = Utf8               systemMessage
  #833 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #834 = Utf8               statusUpdate
  #835 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #836 = Utf8               npcHtmlMessage
  #837 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #838 = Class              #305          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #839 = Utf8               stopFight
  #840 = Utf8               hexCode
  #841 = Utf8               objectId
  #842 = Utf8               itemId
  #843 = Utf8               itemNum
  #844 = Utf8               sysMsgToAllParticipants
  #845 = Utf8               message
  #846 = Utf8               cs
  #847 = Utf8               Lext/mods/gameserver/network/serverpackets/CreatureSay;
  #848 = Utf8               onLogin
  #849 = Utf8               onLogout
  #850 = Utf8               onBypass
  #851 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #852 = Utf8               htmContent
  #853 = Utf8               playerLevel
  #854 = Utf8               command
  #855 = Utf8               onAction
  #856 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Z
  #857 = Utf8               onScrollUse
  #858 = Utf8               onPotionUse
  #859 = Utf8               onEscapeUse
  #860 = Utf8               onItemSummon
  #861 = Utf8               onKill
  #862 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #863 = Utf8               killer
  #864 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #865 = Utf8               isTeleported
  #866 = Utf8               killedCredits
  #867 = Utf8               attackingPlayer
  #868 = Class              #869          // ext/mods/gameserver/model/actor/Creature
  #869 = Utf8               ext/mods/gameserver/model/actor/Creature
  #870 = Utf8               onTeleported
  #871 = Utf8               party
  #872 = Utf8               Lext/mods/gameserver/model/group/Party;
  #873 = Utf8               buffs
  #874 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #875 = Utf8               state
  #876 = Class              #877          // java/lang/Throwable
  #877 = Utf8               java/lang/Throwable
  #878 = Utf8               isInactive
  #879 = Utf8               array
  #880 = Utf8               [B
  #881 = Utf8               hex
  #882 = Utf8               days
  #883 = Utf8               currentTime
  #884 = Utf8               J
  #885 = Utf8               existingHeroUntil
  #886 = Utf8               newHeroUntil
  #887 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #888 = Utf8               lambda$onTeleported$0
  #889 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #890 = Utf8               key
  #891 = Utf8               Ljava/lang/Integer;
  #892 = Utf8               value
  #893 = Utf8               skill
  #894 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #895 = Utf8               SourceFile
  #896 = Utf8               LMEvent.java
  #897 = Utf8               NestMembers
  #898 = Utf8               BootstrapMethods
  #899 = String             #900          // LMEvent.startParticipation(): exception: \u0001
  #900 = Utf8               LMEvent.startParticipation(): exception: \u0001
  #901 = MethodType         #902          //  (Ljava/lang/Object;)I
  #902 = Utf8               (Ljava/lang/Object;)I
  #903 = MethodHandle       5:#252        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getCredits:()S
  #904 = MethodType         #905          //  (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)I
  #905 = Utf8               (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)I
  #906 = MethodType         #448          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #907 = MethodHandle       5:#256        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPoints:()S
  #908 = MethodType         #909          //  (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)Ljava/lang/Short;
  #909 = Utf8               (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)Ljava/lang/Short;
  #910 = MethodHandle       5:#911        // REF_invokeVirtual ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getHexCode:()Ljava/lang/String;
  #911 = Methodref          #160.#912     // ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getHexCode:()Ljava/lang/String;
  #912 = NameAndType        #913:#113     // getHexCode:()Ljava/lang/String;
  #913 = Utf8               getHexCode
  #914 = MethodType         #915          //  (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)Ljava/lang/String;
  #915 = Utf8               (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)Ljava/lang/String;
  #916 = String             #917          // \u0001 Player: \u0001
  #917 = Utf8               \u0001 Player: \u0001
  #918 = String             #919          // \u0001 Killed: \u0001
  #919 = Utf8               \u0001 Killed: \u0001
  #920 = String             #921          // \u0001 Died: \u0001
  #921 = Utf8               \u0001 Died: \u0001
  #922 = String             #923          // \u0001\n
  #923 = Utf8               \u0001\n
  #924 = String             #925          // Last Man ended, thanks to everyone who participated!\nWinner(s):\n\u0001
  #925 = Utf8               Last Man ended, thanks to everyone who participated!\nWinner(s):\n\u0001
  #926 = String             #927          // \u0001 \u0001
  #927 = Utf8               \u0001 \u0001
  #928 = String             #929          // You killed \u0001 player(s)!
  #929 = Utf8               You killed \u0001 player(s)!
  #930 = String             #931          // Now you have \u0001 credit(s)!
  #931 = Utf8               Now you have \u0001 credit(s)!
  #932 = MethodType         #933          //  (Ljava/lang/Object;Ljava/lang/Object;)V
  #933 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #934 = MethodHandle       6:#935        // REF_invokeStatic ext/mods/gameserver/model/entity/events/lastman/LMEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #935 = Methodref          #10.#936      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #936 = NameAndType        #888:#889     // lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
  #937 = MethodType         #938          //  (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #938 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)V
  #939 = MethodHandle       6:#940        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #940 = Methodref          #941.#942     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #941 = Class              #943          // java/lang/invoke/StringConcatFactory
  #942 = NameAndType        #116:#944     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #943 = Utf8               java/lang/invoke/StringConcatFactory
  #944 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #945 = MethodHandle       6:#946        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #946 = Methodref          #947.#948     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #947 = Class              #949          // java/lang/invoke/LambdaMetafactory
  #948 = NameAndType        #950:#951     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #949 = Utf8               java/lang/invoke/LambdaMetafactory
  #950 = Utf8               metafactory
  #951 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #952 = Utf8               InnerClasses
  #953 = Utf8               SingletonHolder
  #954 = Class              #955          // java/lang/invoke/MethodHandles$Lookup
  #955 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #956 = Class              #957          // java/lang/invoke/MethodHandles
  #957 = Utf8               java/lang/invoke/MethodHandles
  #958 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.events.lastman.LMEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/entity/Events."<init>":()V
         4: aload_0
         5: ldc           #7                  // String html/mods/events/lm/
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
        line 75: 0
        line 63: 4
        line 65: 10
        line 71: 17
        line 72: 28
        line 76: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;

  public void init();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
         3: iconst_4
         4: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.registerEvent:(I)V
         7: return
      LineNumberTable:
        line 80: 0
        line 81: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;

  public boolean startParticipation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: invokestatic  #44                 // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
         3: getstatic     #49                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_ID:I
         6: invokevirtual #55                 // Method ext/mods/gameserver/data/xml/NpcData.getTemplate:(I)Lext/mods/gameserver/model/actor/template/NpcTemplate;
         9: astore_1
        10: aload_1
        11: ifnonnull     24
        14: getstatic     #59                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        17: ldc           #63                 // String LMEvent.startParticipation(): NpcTemplate is a NullPointer -> Invalid npc id in Configs?
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
        40: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        43: iconst_0
        44: iaload
        45: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        48: iconst_1
        49: iaload
        50: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        53: iconst_2
        54: iaload
        55: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
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
        line 85: 0
        line 87: 10
        line 89: 14
        line 90: 22
        line 95: 24
        line 97: 36
        line 98: 63
        line 100: 71
        line 101: 81
        line 107: 93
        line 103: 96
        line 105: 97
        line 106: 113
        line 109: 115
        line 110: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           97      18     2     e   Ljava/lang/Exception;
            0     124     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
        11: getstatic     #135                // Field ext/mods/Config.LM_EVENT_MIN_PLAYERS:I
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
        54: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        57: astore_2
        58: aload_2
        59: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        62: getstatic     #166                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
        65: iconst_0
        66: iaload
        67: getstatic     #166                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
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
        96: iconst_4
        97: invokevirtual #181                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       100: iconst_0
       101: ireturn
       102: getstatic     #183                // Field ext/mods/Config.LM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
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
       145: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
       148: astore_2
       149: aload_2
       150: ifnull        167
       153: new           #194                // class ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
       156: dup
       157: aload_2
       158: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       161: iconst_0
       162: iconst_0
       163: invokespecial #196                // Method ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
       166: pop
       167: goto          130
       170: iconst_1
       171: ireturn
      LineNumberTable:
        line 115: 0
        line 117: 7
        line 119: 17
        line 121: 24
        line 122: 58
        line 124: 80
        line 126: 89
        line 127: 93
        line 128: 100
        line 131: 102
        line 133: 108
        line 135: 115
        line 137: 149
        line 138: 153
        line 139: 167
        line 141: 170
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      19     2 player   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
          149      18     2 player   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
            0     172     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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

  public java.util.TreeSet<ext.mods.gameserver.model.entity.events.lastman.LMPlayer> orderPosition(java.util.Collection<ext.mods.gameserver.model.entity.events.lastman.LMPlayer>);
    descriptor: (Ljava/util/Collection;)Ljava/util/TreeSet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: new           #199                // class java/util/TreeSet
         3: dup
         4: invokedynamic #201,  0            // InvokeDynamic #1:applyAsInt:()Ljava/util/function/ToIntFunction;
         9: invokestatic  #205                // InterfaceMethod java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
        12: invokeinterface #211,  1          // InterfaceMethod java/util/Comparator.reversed:()Ljava/util/Comparator;
        17: invokedynamic #215,  0            // InvokeDynamic #2:apply:()Ljava/util/function/Function;
        22: invokeinterface #219,  2          // InterfaceMethod java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        27: invokedynamic #223,  0            // InvokeDynamic #3:apply:()Ljava/util/function/Function;
        32: invokeinterface #219,  2          // InterfaceMethod java/util/Comparator.thenComparing:(Ljava/util/function/Function;)Ljava/util/Comparator;
        37: invokespecial #224                // Method java/util/TreeSet."<init>":(Ljava/util/Comparator;)V
        40: astore_2
        41: aload_2
        42: aload_1
        43: invokevirtual #227                // Method java/util/TreeSet.addAll:(Ljava/util/Collection;)Z
        46: pop
        47: aload_2
        48: areturn
      LineNumberTable:
        line 146: 0
        line 147: 41
        line 148: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0      49     1 listPlayer   Ljava/util/Collection;
           41       8     2 players   Ljava/util/TreeSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      49     1 listPlayer   Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
           41       8     2 players   Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
    Signature: #822                         // (Ljava/util/Collection<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;)Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;

  public java.lang.String calculateRewards();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #27                 // Field _player:Ljava/util/Map;
         5: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        10: invokevirtual #231                // Method orderPosition:(Ljava/util/Collection;)Ljava/util/TreeSet;
        13: astore_1
        14: ldc           #235                // String
        16: astore_2
        17: getstatic     #237                // Field ext/mods/Config.LM_REWARD_PLAYERS_TIE:Z
        20: ifne          34
        23: aload_0
        24: invokevirtual #131                // Method getPlayerCounts:()I
        27: iconst_1
        28: if_icmple     34
        31: ldc           #241                // String Last Man ended, thanks to everyone who participated!\nHe did not have winners!
        33: areturn
        34: iconst_0
        35: istore_3
        36: iload_3
        37: aload_1
        38: invokevirtual #243                // Method java/util/TreeSet.size:()I
        41: if_icmpge     163
        44: aload_1
        45: invokevirtual #246                // Method java/util/TreeSet.isEmpty:()Z
        48: ifeq          54
        51: goto          163
        54: aload_1
        55: invokevirtual #249                // Method java/util/TreeSet.first:()Ljava/lang/Object;
        58: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        61: astore        4
        63: aload         4
        65: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getCredits:()S
        68: ifeq          163
        71: aload         4
        73: invokevirtual #256                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPoints:()S
        76: ifne          82
        79: goto          163
        82: aload_0
        83: aload         4
        85: invokevirtual #259                // Method rewardPlayer:(Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)V
        88: aload_1
        89: aload         4
        91: invokevirtual #263                // Method java/util/TreeSet.remove:(Ljava/lang/Object;)Z
        94: pop
        95: aload_2
        96: aload         4
        98: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       101: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       104: invokedynamic #270,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       109: astore_2
       110: aload_2
       111: aload         4
       113: invokevirtual #256                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPoints:()S
       116: invokedynamic #273,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;S)Ljava/lang/String;
       121: astore_2
       122: aload_2
       123: getstatic     #276                // Field ext/mods/Config.LM_EVENT_PLAYER_CREDITS:S
       126: aload         4
       128: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getCredits:()S
       131: isub
       132: invokestatic  #280                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       135: invokedynamic #286,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       140: astore_2
       141: aload_2
       142: invokedynamic #287,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       147: astore_2
       148: getstatic     #237                // Field ext/mods/Config.LM_REWARD_PLAYERS_TIE:Z
       151: ifne          157
       154: goto          163
       157: iinc          3, 1
       160: goto          36
       163: aload_0
       164: getstatic     #288                // Field ext/mods/gameserver/enums/EventState.REWARDING:Lext/mods/gameserver/enums/EventState;
       167: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       170: aload_2
       171: invokedynamic #291,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       176: areturn
      LineNumberTable:
        line 153: 0
        line 154: 14
        line 156: 17
        line 157: 31
        line 159: 34
        line 161: 44
        line 162: 51
        line 164: 54
        line 166: 63
        line 167: 79
        line 169: 82
        line 170: 88
        line 171: 95
        line 172: 110
        line 173: 122
        line 174: 141
        line 175: 148
        line 176: 154
        line 159: 157
        line 179: 163
        line 181: 170
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63      94     4 player   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
           36     127     3     i   I
            0     177     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
           14     163     1 players   Ljava/util/TreeSet;
           17     160     2   msg   Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           14     163     1 players   Ljava/util/TreeSet<Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;>;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 34
          locals = [ class java/util/TreeSet, class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMPlayer ]
        frame_type = 250 /* chop */
          offset_delta = 74
        frame_type = 250 /* chop */
          offset_delta = 5

  public void stopFight();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getstatic     #399                // Field ext/mods/gameserver/enums/EventState.INACTIVATING:Lext/mods/gameserver/enums/EventState;
         4: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
         7: aload_0
         8: invokevirtual #178                // Method unSpawnNpc:()V
        11: getstatic     #183                // Field ext/mods/Config.LM_DOORS_IDS_TO_CLOSE:Ljava/util/List;
        14: invokestatic  #402                // Method openDoors:(Ljava/util/List;)V
        17: aload_0
        18: getfield      #27                 // Field _player:Ljava/util/Map;
        21: invokeinterface #138,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        26: invokeinterface #144,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        31: astore_1
        32: aload_1
        33: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        38: ifeq          75
        41: aload_1
        42: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        47: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        50: astore_2
        51: aload_2
        52: ifnull        72
        55: new           #194                // class ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
        58: dup
        59: aload_2
        60: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        63: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        66: iconst_0
        67: iconst_0
        68: invokespecial #405                // Method ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;[IZZ)V
        71: pop
        72: goto          32
        75: aload_0
        76: new           #24                 // class java/util/HashMap
        79: dup
        80: invokespecial #26                 // Method java/util/HashMap."<init>":()V
        83: putfield      #31                 // Field _teleported:Ljava/util/Map;
        86: aload_0
        87: new           #24                 // class java/util/HashMap
        90: dup
        91: invokespecial #26                 // Method java/util/HashMap."<init>":()V
        94: putfield      #27                 // Field _player:Ljava/util/Map;
        97: aload_0
        98: getstatic     #15                 // Field ext/mods/gameserver/enums/EventState.INACTIVE:Lext/mods/gameserver/enums/EventState;
       101: invokevirtual #124                // Method setState:(Lext/mods/gameserver/enums/EventState;)V
       104: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       107: iconst_4
       108: invokevirtual #181                // Method ext/mods/gameserver/data/manager/AntiFeedManager.clear:(I)V
       111: return
      LineNumberTable:
        line 232: 0
        line 234: 7
        line 236: 11
        line 238: 17
        line 240: 51
        line 241: 55
        line 242: 72
        line 244: 75
        line 245: 86
        line 247: 97
        line 248: 104
        line 249: 111
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      21     2 player   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
            0     112     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/util/Iterator ]
        frame_type = 39 /* same */
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
         8: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: aload_0
        18: bipush        16
        20: invokevirtual #412                // Method generateHex:(I)[B
        23: invokevirtual #416                // Method hexToString:([B)Ljava/lang/String;
        26: astore_2
        27: aload_0
        28: getfield      #27                 // Field _player:Ljava/util/Map;
        31: aload_1
        32: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        35: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: new           #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        41: dup
        42: aload_1
        43: aload_2
        44: invokespecial #428                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer."<init>":(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        47: invokeinterface #431,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        52: pop
        53: iconst_1
        54: ireturn
      LineNumberTable:
        line 253: 0
        line 254: 4
        line 256: 6
        line 257: 14
        line 259: 16
        line 260: 27
        line 261: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         9: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        12: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #435,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        20: ifeq          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 266: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         0: invokestatic  #438                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
         3: iload_1
         4: invokevirtual #443                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
         7: astore_2
         8: aload_2
         9: ifnonnull     14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: aload_2
        16: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        19: ireturn
      LineNumberTable:
        line 271: 0
        line 272: 8
        line 273: 12
        line 275: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         9: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        12: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        15: invokeinterface #446,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        20: ifnull        27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 280: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         1: getstatic     #166                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
         4: iconst_0
         5: iaload
         6: getstatic     #166                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: iconst_1
        12: invokevirtual #449                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        15: ireturn
      LineNumberTable:
        line 285: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0      16     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getParticipationFee();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=1
         0: getstatic     #166                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
         3: iconst_0
         4: iaload
         5: istore_1
         6: getstatic     #166                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_FEE:[I
         9: iconst_1
        10: iaload
        11: istore_2
        12: iload_1
        13: ifeq          20
        16: iload_2
        17: ifne          24
        20: ldc_w         #453                // String -
        23: areturn
        24: iload_2
        25: invokestatic  #280                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        28: invokestatic  #310                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        31: iload_1
        32: invokevirtual #320                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        35: invokevirtual #455                // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        38: invokedynamic #456,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        43: areturn
      LineNumberTable:
        line 290: 0
        line 291: 6
        line 293: 12
        line 294: 20
        line 296: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         0: new           #457                // class ext/mods/gameserver/network/serverpackets/CreatureSay
         3: dup
         4: iconst_0
         5: getstatic     #459                // Field ext/mods/gameserver/enums/SayType.HERO_VOICE:Lext/mods/gameserver/enums/SayType;
         8: ldc_w         #465                // String Event Manager
        11: aload_1
        12: invokespecial #467                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
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
        46: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        49: astore        4
        51: aload         4
        53: ifnull        65
        56: aload         4
        58: invokevirtual #162                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        61: aload_2
        62: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: goto          31
        68: return
      LineNumberTable:
        line 301: 0
        line 303: 16
        line 304: 51
        line 305: 56
        line 304: 65
        line 306: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      14     4 player   Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;
            0      69     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         5: invokevirtual #485                // Method isStarting:()Z
         8: ifne          19
        11: aload_0
        12: invokevirtual #488                // Method isStarted:()Z
        15: ifne          19
        18: return
        19: aload_0
        20: aload_1
        21: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        24: ifne          28
        27: return
        28: new           #194                // class ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
        31: dup
        32: aload_1
        33: iconst_0
        34: iconst_0
        35: invokespecial #196                // Method ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
        38: pop
        39: return
      LineNumberTable:
        line 320: 0
        line 321: 18
        line 323: 19
        line 324: 27
        line 326: 28
        line 327: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         5: invokevirtual #485                // Method isStarting:()Z
         8: ifne          25
        11: aload_0
        12: invokevirtual #488                // Method isStarted:()Z
        15: ifne          25
        18: aload_0
        19: invokevirtual #491                // Method isParticipating:()Z
        22: ifeq          89
        25: invokestatic  #494                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        28: aload_1
        29: invokevirtual #499                // Method ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
        32: ifeq          42
        35: getstatic     #502                // Field ext/mods/Config.SAFEDISCONNECT_INTEGRATION_LM:Z
        38: ifeq          42
        41: return
        42: aload_0
        43: aload_1
        44: invokevirtual #505                // Method removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        47: ifeq          89
        50: aload_1
        51: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        54: iconst_0
        55: iaload
        56: bipush        101
        58: invokestatic  #508                // Method ext/mods/commons/random/Rnd.get:(I)I
        61: iadd
        62: bipush        50
        64: isub
        65: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        68: iconst_1
        69: iaload
        70: bipush        101
        72: invokestatic  #508                // Method ext/mods/commons/random/Rnd.get:(I)I
        75: iadd
        76: bipush        50
        78: isub
        79: getstatic     #80                 // Field ext/mods/Config.LM_EVENT_PARTICIPATION_NPC_COORDINATES:[I
        82: iconst_2
        83: iaload
        84: iconst_0
        85: invokevirtual #514                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
        88: pop
        89: return
      LineNumberTable:
        line 331: 0
        line 333: 25
        line 334: 41
        line 336: 42
        line 337: 50
        line 339: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         5: invokevirtual #491                // Method isParticipating:()Z
         8: ifne          12
        11: return
        12: aload_1
        13: ldc_w         #518                // String lm_event_participation
        16: invokevirtual #520                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        19: ifeq          466
        22: new           #367                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        25: dup
        26: iconst_0
        27: invokespecial #369                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        30: astore        4
        32: aload_2
        33: invokevirtual #523                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        36: invokevirtual #527                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        39: istore        5
        41: aload_2
        42: invokevirtual #532                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
        45: ifeq          72
        48: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        51: aload_2
        52: ldc_w         #535                // String html/mods/events/lm/CursedWeaponEquipped.htm
        55: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        58: astore_3
        59: aload_3
        60: ifnull        457
        63: aload         4
        65: aload_3
        66: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        69: goto          457
        72: aload_2
        73: invokevirtual #537                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        76: ifeq          103
        79: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        82: aload_2
        83: ldc_w         #540                // String html/mods/events/lm/Olympiad.htm
        86: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        89: astore_3
        90: aload_3
        91: ifnull        457
        94: aload         4
        96: aload_3
        97: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       100: goto          457
       103: aload_2
       104: invokevirtual #542                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       107: ifle          134
       110: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       113: aload_2
       114: ldc_w         #545                // String html/mods/events/lm/Karma.htm
       117: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       120: astore_3
       121: aload_3
       122: ifnull        457
       125: aload         4
       127: aload_3
       128: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       131: goto          457
       134: getstatic     #547                // Field ext/mods/Config.DISABLE_ID_CLASSES_LM:Ljava/util/List;
       137: aload_2
       138: invokevirtual #550                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       141: invokevirtual #554                // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
       144: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       147: invokeinterface #557,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
       152: ifeq          179
       155: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       158: aload_2
       159: ldc_w         #562                // String html/mods/events/lm/Class.htm
       162: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       165: astore_3
       166: aload_3
       167: ifnull        457
       170: aload         4
       172: aload_3
       173: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       176: goto          457
       179: iload         5
       181: getstatic     #564                // Field ext/mods/Config.LM_EVENT_MIN_LVL:B
       184: if_icmplt     195
       187: iload         5
       189: getstatic     #568                // Field ext/mods/Config.LM_EVENT_MAX_LVL:B
       192: if_icmple     247
       195: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       198: aload_2
       199: ldc_w         #571                // String html/mods/events/lm/Level.htm
       202: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       205: astore_3
       206: aload_3
       207: ifnull        457
       210: aload         4
       212: aload_3
       213: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       216: aload         4
       218: ldc_w         #573                // String %min%
       221: getstatic     #564                // Field ext/mods/Config.LM_EVENT_MIN_LVL:B
       224: invokestatic  #280                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       227: invokevirtual #575                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       230: aload         4
       232: ldc_w         #579                // String %max%
       235: getstatic     #568                // Field ext/mods/Config.LM_EVENT_MAX_LVL:B
       238: invokestatic  #280                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       241: invokevirtual #575                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       244: goto          457
       247: aload_0
       248: invokevirtual #131                // Method getPlayerCounts:()I
       251: getstatic     #581                // Field ext/mods/Config.LM_EVENT_MAX_PLAYERS:I
       254: if_icmpne     295
       257: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       260: aload_2
       261: ldc_w         #584                // String html/mods/events/lm/Full.htm
       264: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       267: astore_3
       268: aload_3
       269: ifnull        457
       272: aload         4
       274: aload_3
       275: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       278: aload         4
       280: ldc_w         #579                // String %max%
       283: getstatic     #581                // Field ext/mods/Config.LM_EVENT_MAX_PLAYERS:I
       286: invokestatic  #280                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       289: invokevirtual #575                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       292: goto          457
       295: getstatic     #586                // Field ext/mods/Config.LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
       298: ifle          360
       301: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       304: iconst_4
       305: aload_2
       306: getstatic     #586                // Field ext/mods/Config.LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
       309: invokevirtual #589                // Method ext/mods/gameserver/data/manager/AntiFeedManager.tryAddPlayer:(ILext/mods/gameserver/model/actor/Player;I)Z
       312: ifne          360
       315: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       318: aload_2
       319: ldc_w         #593                // String html/mods/events/lm/IPRestriction.htm
       322: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       325: astore_3
       326: aload_3
       327: ifnull        457
       330: aload         4
       332: aload_3
       333: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       336: aload         4
       338: ldc_w         #579                // String %max%
       341: invokestatic  #34                 // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       344: aload_2
       345: getstatic     #586                // Field ext/mods/Config.LM_EVENT_MAX_PARTICIPANTS_PER_IP:I
       348: invokevirtual #595                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getLimit:(Lext/mods/gameserver/model/actor/Player;I)I
       351: invokestatic  #280                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       354: invokevirtual #575                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       357: goto          457
       360: aload_0
       361: aload_2
       362: invokevirtual #599                // Method payParticipationFee:(Lext/mods/gameserver/model/actor/Player;)Z
       365: ifne          404
       368: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       371: aload_2
       372: ldc_w         #602                // String html/mods/events/lm/ParticipationFee.htm
       375: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       378: astore_3
       379: aload_3
       380: ifnull        457
       383: aload         4
       385: aload_3
       386: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       389: aload         4
       391: ldc_w         #604                // String %fee%
       394: aload_0
       395: invokevirtual #606                // Method getParticipationFee:()Ljava/lang/String;
       398: invokevirtual #575                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       401: goto          457
       404: aload_0
       405: aload_2
       406: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       409: ifeq          430
       412: aload         4
       414: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       417: aload_2
       418: ldc_w         #609                // String html/mods/events/lm/Registered.htm
       421: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       424: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       427: goto          457
       430: aload_0
       431: aload_2
       432: invokevirtual #611                // Method addParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       435: ifeq          456
       438: aload         4
       440: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       443: aload_2
       444: ldc_w         #609                // String html/mods/events/lm/Registered.htm
       447: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       450: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       453: goto          457
       456: return
       457: aload_2
       458: aload         4
       460: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       463: goto          521
       466: aload_1
       467: ldc_w         #614                // String lm_event_remove_participation
       470: invokevirtual #520                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       473: ifeq          521
       476: aload_0
       477: aload_2
       478: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       481: ifeq          521
       484: aload_0
       485: aload_2
       486: invokevirtual #505                // Method removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       489: pop
       490: new           #367                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       493: dup
       494: iconst_0
       495: invokespecial #369                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       498: astore        4
       500: aload         4
       502: invokestatic  #384                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       505: aload_2
       506: ldc_w         #616                // String html/mods/events/lm/Unregistered.htm
       509: invokevirtual #391                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       512: invokevirtual #395                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       515: aload_2
       516: aload         4
       518: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       521: return
      LineNumberTable:
        line 343: 0
        line 344: 11
        line 348: 12
        line 350: 22
        line 351: 32
        line 353: 41
        line 355: 48
        line 356: 59
        line 357: 63
        line 359: 72
        line 361: 79
        line 362: 90
        line 363: 94
        line 365: 103
        line 367: 110
        line 368: 121
        line 369: 125
        line 371: 134
        line 373: 155
        line 374: 166
        line 376: 170
        line 379: 179
        line 381: 195
        line 382: 206
        line 384: 210
        line 385: 216
        line 386: 230
        line 389: 247
        line 391: 257
        line 392: 268
        line 394: 272
        line 395: 278
        line 398: 295
        line 400: 315
        line 401: 326
        line 403: 330
        line 404: 336
        line 407: 360
        line 409: 368
        line 410: 379
        line 412: 383
        line 413: 389
        line 416: 404
        line 417: 412
        line 418: 430
        line 419: 438
        line 421: 456
        line 423: 457
        line 424: 463
        line 425: 466
        line 427: 476
        line 429: 484
        line 431: 490
        line 433: 500
        line 434: 515
        line 437: 521
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
            0     522     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         5: invokevirtual #488                // Method isStarted:()Z
         8: ifne          13
        11: iconst_1
        12: ireturn
        13: aload_1
        14: invokevirtual #618                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        17: ifeq          22
        20: iconst_1
        21: ireturn
        22: aload_0
        23: aload_1
        24: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        27: ifne          40
        30: aload_0
        31: iload_2
        32: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        35: ifeq          40
        38: iconst_0
        39: ireturn
        40: aload_0
        41: aload_1
        42: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        45: ifeq          58
        48: aload_0
        49: iload_2
        50: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        53: ifne          58
        56: iconst_0
        57: ireturn
        58: iconst_1
        59: ireturn
      LineNumberTable:
        line 441: 0
        line 442: 11
        line 444: 13
        line 445: 20
        line 447: 22
        line 448: 38
        line 450: 40
        line 451: 56
        line 453: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         1: invokevirtual #488                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #624                // Field ext/mods/Config.LM_EVENT_SCROLL_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 458: 0
        line 459: 7
        line 461: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         1: invokevirtual #488                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #627                // Field ext/mods/Config.LM_EVENT_POTIONS_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 466: 0
        line 467: 7
        line 469: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
         1: invokevirtual #488                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        14: ireturn
      LineNumberTable:
        line 474: 0
        line 475: 7
        line 477: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0      15     1 objectId   I
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean onItemSummon(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #488                // Method isStarted:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: iload_1
        11: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        14: ifeq          27
        17: getstatic     #630                // Field ext/mods/Config.LM_EVENT_SUMMON_BY_ITEM_ALLOWED:Z
        20: ifne          27
        23: iconst_1
        24: goto          28
        27: iconst_0
        28: ireturn
      LineNumberTable:
        line 482: 0
        line 483: 7
        line 485: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
      stack=8, locals=6, args_size=3
         0: aload_2
         1: ifnull        22
         4: aload_0
         5: invokevirtual #488                // Method isStarted:()Z
         8: ifeq          22
        11: aload_0
        12: aload_2
        13: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        19: ifne          23
        22: return
        23: iconst_0
        24: istore_3
        25: aload_0
        26: getfield      #27                 // Field _player:Ljava/util/Map;
        29: aload_2
        30: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        33: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #633,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        44: invokevirtual #252                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getCredits:()S
        47: istore        4
        49: iload         4
        51: iconst_1
        52: if_icmpgt     66
        55: aload_0
        56: aload_2
        57: invokevirtual #505                // Method removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
        60: pop
        61: iconst_1
        62: istore_3
        63: goto          88
        66: aload_0
        67: getfield      #27                 // Field _player:Ljava/util/Map;
        70: aload_2
        71: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        74: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        77: invokeinterface #633,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        82: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
        85: invokevirtual #635                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.decreaseCredits:()V
        88: new           #194                // class ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter
        91: dup
        92: aload_2
        93: iload_3
        94: iload_3
        95: ifne          102
        98: iconst_1
        99: goto          103
       102: iconst_0
       103: invokespecial #196                // Method ext/mods/gameserver/model/entity/events/lastman/LMEventTeleporter."<init>":(Lext/mods/gameserver/model/actor/Player;ZZ)V
       106: pop
       107: aload_1
       108: ifnonnull     112
       111: return
       112: aconst_null
       113: astore        5
       115: aload_1
       116: instanceof    #638                // class ext/mods/gameserver/model/actor/instance/Pet
       119: ifne          129
       122: aload_1
       123: instanceof    #640                // class ext/mods/gameserver/model/actor/Summon
       126: ifeq          141
       129: aload_1
       130: checkcast     #640                // class ext/mods/gameserver/model/actor/Summon
       133: invokevirtual #642                // Method ext/mods/gameserver/model/actor/Summon.getOwner:()Lext/mods/gameserver/model/actor/Player;
       136: astore        5
       138: goto          154
       141: aload_1
       142: instanceof    #170                // class ext/mods/gameserver/model/actor/Player
       145: ifeq          154
       148: aload_1
       149: checkcast     #170                // class ext/mods/gameserver/model/actor/Player
       152: astore        5
       154: aload         5
       156: ifnull        286
       159: aload_0
       160: aload         5
       162: invokevirtual #408                // Method isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       165: ifeq          286
       168: aload_0
       169: getfield      #27                 // Field _player:Ljava/util/Map;
       172: aload         5
       174: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       177: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       180: invokeinterface #633,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       185: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
       188: invokevirtual #645                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.increasePoints:()V
       191: aload         5
       193: new           #457                // class ext/mods/gameserver/network/serverpackets/CreatureSay
       196: dup
       197: aload         5
       199: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       202: getstatic     #648                // Field ext/mods/gameserver/enums/SayType.TELL:Lext/mods/gameserver/enums/SayType;
       205: ldc_w         #651                // String Last Man
       208: aload_0
       209: getfield      #27                 // Field _player:Ljava/util/Map;
       212: aload         5
       214: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       217: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       220: invokeinterface #633,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       225: checkcast     #160                // class ext/mods/gameserver/model/entity/events/lastman/LMPlayer
       228: invokevirtual #256                // Method ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPoints:()S
       231: invokedynamic #653,  0            // InvokeDynamic #10:makeConcatWithConstants:(S)Ljava/lang/String;
       236: invokespecial #467                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
       239: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       242: aload         5
       244: new           #457                // class ext/mods/gameserver/network/serverpackets/CreatureSay
       247: dup
       248: aload         5
       250: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       253: getstatic     #648                // Field ext/mods/gameserver/enums/SayType.TELL:Lext/mods/gameserver/enums/SayType;
       256: ldc_w         #651                // String Last Man
       259: iload         4
       261: iconst_1
       262: if_icmpgt     271
       265: ldc_w         #656                // String You do not have credits, leaving the event!
       268: goto          280
       271: iload         4
       273: iconst_1
       274: isub
       275: invokedynamic #658,  0            // InvokeDynamic #11:makeConcatWithConstants:(I)Ljava/lang/String;
       280: invokespecial #467                // Method ext/mods/gameserver/network/serverpackets/CreatureSay."<init>":(ILext/mods/gameserver/enums/SayType;Ljava/lang/String;Ljava/lang/String;)V
       283: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       286: aload_0
       287: invokevirtual #131                // Method getPlayerCounts:()I
       290: iconst_1
       291: if_icmpne     300
       294: invokestatic  #660                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
       297: invokevirtual #665                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager.skipDelay:()V
       300: return
      LineNumberTable:
        line 490: 0
        line 491: 22
        line 493: 23
        line 494: 25
        line 496: 49
        line 498: 55
        line 499: 61
        line 502: 66
        line 504: 88
        line 506: 107
        line 507: 111
        line 509: 112
        line 510: 115
        line 511: 129
        line 512: 141
        line 513: 148
        line 515: 154
        line 517: 168
        line 519: 191
        line 520: 242
        line 523: 286
        line 524: 294
        line 525: 300
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     301     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0     301     1 killer   Lext/mods/gameserver/model/actor/Creature;
            0     301     2 player   Lext/mods/gameserver/model/actor/Player;
           25     276     3 isTeleported   Z
           49     252     4 killedCredits   S
          115     186     5 attackingPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 14
        frame_type = 22 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ int, int ]
        frame_type = 21 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = [ uninitialized 88, uninitialized 88, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = [ uninitialized 88, uninitialized 88, class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 116
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 244, uninitialized 244, int, class ext/mods/gameserver/enums/SayType, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 244, uninitialized 244, int, class ext/mods/gameserver/enums/SayType, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 13 /* same */

  public void onTeleported(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #488                // Method isStarted:()Z
         4: ifeq          22
         7: aload_1
         8: ifnull        22
        11: aload_0
        12: aload_1
        13: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokevirtual #621                // Method isPlayerParticipant:(I)Z
        19: ifne          23
        22: return
        23: aload_0
        24: getfield      #31                 // Field _teleported:Ljava/util/Map;
        27: aload_1
        28: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        31: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: invokeinterface #435,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        39: ifeq          67
        42: aload_0
        43: getfield      #31                 // Field _teleported:Ljava/util/Map;
        46: aload_1
        47: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        50: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        53: invokeinterface #633,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        58: checkcast     #668                // class java/lang/Boolean
        61: invokevirtual #670                // Method java/lang/Boolean.booleanValue:()Z
        64: ifne          71
        67: aload_1
        68: invokestatic  #673                // Method spawnProtection:(Lext/mods/gameserver/model/actor/Player;)V
        71: aload_1
        72: invokevirtual #677                // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        75: ifeq          84
        78: getstatic     #680                // Field ext/mods/Config.LM_EVENT_MAGE_BUFFS:Ljava/util/Map;
        81: goto          87
        84: getstatic     #683                // Field ext/mods/Config.LM_EVENT_FIGHTER_BUFFS:Ljava/util/Map;
        87: astore_2
        88: aload_2
        89: ifnull        101
        92: aload_2
        93: invokeinterface #686,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
        98: ifeq          102
       101: return
       102: aload_2
       103: aload_1
       104: invokedynamic #687,  0            // InvokeDynamic #12:accept:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/BiConsumer;
       109: invokeinterface #691,  2          // InterfaceMethod java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
       114: aload_1
       115: invokevirtual #695                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       118: ifnull        134
       121: aload_1
       122: invokevirtual #695                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       125: astore_3
       126: aload_3
       127: aload_1
       128: getstatic     #699                // Field ext/mods/gameserver/enums/MessageType.LEFT:Lext/mods/gameserver/enums/MessageType;
       131: invokevirtual #705                // Method ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
       134: aload_1
       135: invokevirtual #711                // Method ext/mods/gameserver/model/actor/Player.stopAllEffectsDebuff:()V
       138: aload_0
       139: getfield      #31                 // Field _teleported:Ljava/util/Map;
       142: aload_1
       143: invokevirtual #420                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       146: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       149: iconst_1
       150: invokestatic  #714                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       153: invokeinterface #431,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       158: pop
       159: return
      LineNumberTable:
        line 529: 0
        line 530: 22
        line 532: 23
        line 533: 67
        line 535: 71
        line 537: 88
        line 538: 101
        line 540: 102
        line 547: 114
        line 549: 121
        line 550: 126
        line 553: 134
        line 554: 138
        line 555: 159
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          126       8     3 party   Lext/mods/gameserver/model/group/Party;
            0     160     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
        line 569: 0
        line 571: 7
        line 572: 23
        line 574: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isInactive   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, int ]
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
        line 581: 0
        line 583: 7
        line 584: 23
        line 586: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isParticipating   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, int ]
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
        line 593: 0
        line 595: 7
        line 596: 23
        line 598: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarting   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, int ]
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
        line 605: 0
        line 607: 7
        line 608: 23
        line 610: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           23       5     1 isStarted   Z
            0      35     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
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
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMEvent, int ]
          stack = []

  public int getPlayerCounts();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _player:Ljava/util/Map;
         4: invokeinterface #717,  1          // InterfaceMethod java/util/Map.size:()I
         9: ireturn
      LineNumberTable:
        line 615: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;

  public byte[] generateHex(int);
    descriptor: (I)[B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=2
         0: iload_1
         1: newarray       byte
         3: astore_2
         4: aload_2
         5: invokestatic  #718                // Method ext/mods/commons/random/Rnd.nextBytes:([B)[B
         8: pop
         9: aload_2
        10: areturn
      LineNumberTable:
        line 620: 0
        line 621: 4
        line 622: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0      11     1  size   I
            4       7     2 array   [B

  public java.lang.String hexToString(byte[]);
    descriptor: ([B)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: new           #722                // class java/math/BigInteger
         3: dup
         4: aload_1
         5: invokespecial #724                // Method java/math/BigInteger."<init>":([B)V
         8: bipush        16
        10: invokevirtual #727                // Method java/math/BigInteger.toString:(I)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 627: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0      14     1   hex   [B

  public void setHero(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=3
         0: aload_1
         1: iconst_1
         2: invokevirtual #730                // Method ext/mods/gameserver/model/actor/Player.setHero:(Z)V
         5: invokestatic  #733                // Method java/lang/System.currentTimeMillis:()J
         8: lstore_3
         9: aload_1
        10: invokevirtual #739                // Method ext/mods/gameserver/model/actor/Player.getHeroUntil:()J
        13: lstore        5
        15: lload_3
        16: getstatic     #742                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
        19: iload_2
        20: i2l
        21: invokevirtual #748                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        24: ladd
        25: lstore        7
        27: lload         5
        29: lload_3
        30: lcmp
        31: ifle          43
        34: lload         7
        36: lload         5
        38: lload_3
        39: lsub
        40: ladd
        41: lstore        7
        43: aload_1
        44: lload         7
        46: invokevirtual #752                // Method ext/mods/gameserver/model/actor/Player.setHeroUntil:(J)V
        49: aload_1
        50: invokevirtual #756                // Method ext/mods/gameserver/model/actor/Player.store:()V
        53: aload_1
        54: aload_1
        55: sipush        10024
        58: iconst_1
        59: anewarray     #759                // class java/lang/Object
        62: dup
        63: iconst_0
        64: iload_2
        65: invokestatic  #423                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        68: aastore
        69: invokevirtual #761                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        72: invokevirtual #765                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        75: aload_1
        76: invokevirtual #768                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        79: return
      LineNumberTable:
        line 632: 0
        line 633: 5
        line 634: 9
        line 635: 15
        line 637: 27
        line 638: 34
        line 640: 43
        line 641: 49
        line 642: 53
        line 643: 75
        line 644: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
            0      80     1 player   Lext/mods/gameserver/model/actor/Player;
            0      80     2  days   I
            9      71     3 currentTime   J
           15      65     5 existingHeroUntil   J
           27      53     7 newHeroUntil   J
      StackMapTable: number_of_entries = 1
        frame_type = 254 /* append */
          offset_delta = 43
          locals = [ long, long, long ]

  public static final ext.mods.gameserver.model.entity.events.lastman.LMEvent getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #771                // Field ext/mods/gameserver/model/entity/events/lastman/LMEvent$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
         3: areturn
      LineNumberTable:
        line 648: 0
}
SourceFile: "LMEvent.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/lastman/LMEvent$SingletonHolder
BootstrapMethods:
  0: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #899 LMEvent.startParticipation(): exception: \u0001
  1: #945 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #901 (Ljava/lang/Object;)I
      #903 REF_invokeVirtual ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getCredits:()S
      #904 (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)I
  2: #945 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #906 (Ljava/lang/Object;)Ljava/lang/Object;
      #907 REF_invokeVirtual ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getPoints:()S
      #908 (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)Ljava/lang/Short;
  3: #945 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #906 (Ljava/lang/Object;)Ljava/lang/Object;
      #910 REF_invokeVirtual ext/mods/gameserver/model/entity/events/lastman/LMPlayer.getHexCode:()Ljava/lang/String;
      #914 (Lext/mods/gameserver/model/entity/events/lastman/LMPlayer;)Ljava/lang/String;
  4: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #916 \u0001 Player: \u0001
  5: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #918 \u0001 Killed: \u0001
  6: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #920 \u0001 Died: \u0001
  7: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #922 \u0001\n
  8: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #924 Last Man ended, thanks to everyone who participated!\nWinner(s):\n\u0001
  9: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #926 \u0001 \u0001
  10: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #928 You killed \u0001 player(s)!
  11: #939 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #930 Now you have \u0001 credit(s)!
  12: #945 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #932 (Ljava/lang/Object;Ljava/lang/Object;)V
      #934 REF_invokeStatic ext/mods/gameserver/model/entity/events/lastman/LMEvent.lambda$onTeleported$0:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/Integer;Ljava/lang/Integer;)V
      #937 (Ljava/lang/Integer;Ljava/lang/Integer;)V
InnerClasses:
  public static final #958= #954 of #956; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
