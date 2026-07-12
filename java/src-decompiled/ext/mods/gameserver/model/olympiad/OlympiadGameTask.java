// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadGameTask
// File: ext\mods\gameserver\model\olympiad\OlympiadGameTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadGameTask.class
  Last modified 9 de jul de 2026; size 8975 bytes
  MD5 checksum 5b4cc707ecef4b2c6a5c6099fb6b3104
  Compiled from "OlympiadGameTask.java"
public final class ext.mods.gameserver.model.olympiad.OlympiadGameTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/olympiad/OlympiadGameTask
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 12, methods: 23, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
    #8 = Class              #10           // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
    #9 = NameAndType        #11:#12       // IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #10 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
   #11 = Utf8               IDLE
   #12 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #14 = Class              #16           // ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #15 = NameAndType        #17:#12       // _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #16 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #17 = Utf8               _state
   #18 = Fieldref           #14.#19       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._needAnnounce:Z
   #19 = NameAndType        #20:#21       // _needAnnounce:Z
   #20 = Utf8               _needAnnounce
   #21 = Utf8               Z
   #22 = Fieldref           #14.#23       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._countDown:I
   #23 = NameAndType        #24:#25       // _countDown:I
   #24 = Utf8               _countDown
   #25 = Utf8               I
   #26 = Fieldref           #14.#27       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._pausedByDisconnect:Z
   #27 = NameAndType        #28:#21       // _pausedByDisconnect:Z
   #28 = Utf8               _pausedByDisconnect
   #29 = Class              #30           // java/util/HashSet
   #30 = Utf8               java/util/HashSet
   #31 = Methodref          #29.#3        // java/util/HashSet."<init>":()V
   #32 = Fieldref           #14.#33       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._pausedPlayers:Ljava/util/Set;
   #33 = NameAndType        #34:#35       // _pausedPlayers:Ljava/util/Set;
   #34 = Utf8               _pausedPlayers
   #35 = Utf8               Ljava/util/Set;
   #36 = Fieldref           #14.#37       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._zone:Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
   #37 = NameAndType        #38:#39       // _zone:Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
   #38 = Utf8               _zone
   #39 = Utf8               Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.registerTask:(Lext/mods/gameserver/model/olympiad/OlympiadGameTask;)V
   #41 = Class              #43           // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #42 = NameAndType        #44:#45       // registerTask:(Lext/mods/gameserver/model/olympiad/OlympiadGameTask;)V
   #43 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #44 = Utf8               registerTask
   #45 = Utf8               (Lext/mods/gameserver/model/olympiad/OlympiadGameTask;)V
   #46 = Methodref          #8.#47        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
   #47 = NameAndType        #48:#49       // ordinal:()I
   #48 = Utf8               ordinal
   #49 = Utf8               ()I
   #50 = Fieldref           #8.#51        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #51 = NameAndType        #52:#12       // GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #52 = Utf8               GAME_STARTED
   #53 = Fieldref           #8.#54        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #54 = NameAndType        #55:#12       // CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #55 = Utf8               CLEANUP
   #56 = Fieldref           #8.#57        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #57 = NameAndType        #58:#12       // BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #58 = Utf8               BATTLE_COUNTDOWN
   #59 = Fieldref           #8.#60        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #60 = NameAndType        #61:#12       // BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #61 = Utf8               BATTLE_IN_PROGRESS
   #62 = Fieldref           #8.#63        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #63 = NameAndType        #64:#12       // TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #64 = Utf8               TELE_TO_TOWN
   #65 = Fieldref           #14.#66       // ext/mods/gameserver/model/olympiad/OlympiadGameTask._game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
   #66 = NameAndType        #67:#68       // _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
   #67 = Utf8               _game
   #68 = Utf8               Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
   #69 = Fieldref           #8.#70        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BEGIN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #70 = NameAndType        #71:#12       // BEGIN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #71 = Utf8               BEGIN
   #72 = Methodref          #73.#74       // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #73 = Class              #75           // ext/mods/commons/pool/ThreadPool
   #74 = NameAndType        #76:#77       // execute:(Ljava/lang/Runnable;)V
   #75 = Utf8               ext/mods/commons/pool/ThreadPool
   #76 = Utf8               execute
   #77 = Utf8               (Ljava/lang/Runnable;)V
   #78 = Long               1000l
   #80 = Methodref          #73.#81       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #81 = NameAndType        #82:#83       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #82 = Utf8               schedule
   #83 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #84 = Fieldref           #8.#85        // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_ARENA:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #85 = NameAndType        #86:#12       // TELE_TO_ARENA:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
   #86 = Utf8               TELE_TO_ARENA
   #87 = Fieldref           #88.#89       // ext/mods/Config.OLY_WAIT_TIME:I
   #88 = Class              #90           // ext/mods/Config
   #89 = NameAndType        #91:#25       // OLY_WAIT_TIME:I
   #90 = Utf8               ext/mods/Config
   #91 = Utf8               OLY_WAIT_TIME
   #92 = Fieldref           #93.#94       // ext/mods/gameserver/network/SystemMessageId.YOU_WILL_ENTER_THE_OLYMPIAD_STADIUM_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Class              #95           // ext/mods/gameserver/network/SystemMessageId
   #94 = NameAndType        #96:#97       // YOU_WILL_ENTER_THE_OLYMPIAD_STADIUM_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
   #95 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #96 = Utf8               YOU_WILL_ENTER_THE_OLYMPIAD_STADIUM_IN_S1_SECOND_S
   #97 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #98 = Methodref          #99.#100      // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = Class              #101          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #100 = NameAndType        #102:#103     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #101 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #102 = Utf8               getSystemMessage
  #103 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #104 = Methodref          #99.#105      // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = NameAndType        #106:#107     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = Utf8               addNumber
  #107 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #108 = Methodref          #109.#110     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Class              #111          // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #110 = NameAndType        #112:#113     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  #112 = Utf8               broadcastPacket
  #113 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = Fieldref           #14.#115      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.TELEPORT_TO_ARENA:[I
  #115 = NameAndType        #116:#117     // TELEPORT_TO_ARENA:[I
  #116 = Utf8               TELEPORT_TO_ARENA
  #117 = Utf8               [I
  #118 = Methodref          #14.#119      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getDelay:([I)I
  #119 = NameAndType        #120:#121     // getDelay:([I)I
  #120 = Utf8               getDelay
  #121 = Utf8               ([I)I
  #122 = Methodref          #14.#123      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.startGame:()Z
  #123 = NameAndType        #124:#125     // startGame:()Z
  #124 = Utf8               startGame
  #125 = Utf8               ()Z
  #126 = Fieldref           #8.#127       // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #127 = NameAndType        #128:#12      // GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #128 = Utf8               GAME_STOPPED
  #129 = Fieldref           #88.#130      // ext/mods/Config.OLY_WAIT_BATTLE:I
  #130 = NameAndType        #131:#25      // OLY_WAIT_BATTLE:I
  #131 = Utf8               OLY_WAIT_BATTLE
  #132 = Fieldref           #14.#133      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.BATTLE_START_TIME:[I
  #133 = NameAndType        #134:#117     // BATTLE_START_TIME:[I
  #134 = Utf8               BATTLE_START_TIME
  #135 = Fieldref           #93.#136      // ext/mods/gameserver/network/SystemMessageId.THE_GAME_WILL_START_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
  #136 = NameAndType        #137:#97      // THE_GAME_WILL_START_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
  #137 = Utf8               THE_GAME_WILL_START_IN_S1_SECOND_S
  #138 = Methodref          #41.#110      // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #139 = Fieldref           #8.#140       // ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #140 = NameAndType        #141:#12      // BATTLE_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
  #141 = Utf8               BATTLE_STARTED
  #142 = Methodref          #109.#143     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.buffPlayers:()V
  #143 = NameAndType        #144:#6       // buffPlayers:()V
  #144 = Utf8               buffPlayers
  #145 = Methodref          #109.#146     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.healPlayers:()V
  #146 = NameAndType        #147:#6       // healPlayers:()V
  #147 = Utf8               healPlayers
  #148 = Methodref          #109.#149     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.resetDamage:()V
  #149 = NameAndType        #150:#6       // resetDamage:()V
  #150 = Utf8               resetDamage
  #151 = Methodref          #14.#152      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.startBattle:()Z
  #152 = NameAndType        #153:#125     // startBattle:()Z
  #153 = Utf8               startBattle
  #154 = Methodref          #14.#155      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.checkBattle:()Z
  #155 = NameAndType        #156:#125     // checkBattle:()Z
  #156 = Utf8               checkBattle
  #157 = Fieldref           #88.#158      // ext/mods/Config.OLY_BATTLE:J
  #158 = NameAndType        #159:#160     // OLY_BATTLE:J
  #159 = Utf8               OLY_BATTLE
  #160 = Utf8               J
  #161 = Fieldref           #88.#162      // ext/mods/Config.OLY_WAIT_END:I
  #162 = NameAndType        #163:#25      // OLY_WAIT_END:I
  #163 = Utf8               OLY_WAIT_END
  #164 = Methodref          #14.#165      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.stopGame:()V
  #165 = NameAndType        #166:#6       // stopGame:()V
  #166 = Utf8               stopGame
  #167 = Fieldref           #14.#168      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.TELEPORT_TO_TOWN:[I
  #168 = NameAndType        #169:#117     // TELEPORT_TO_TOWN:[I
  #169 = Utf8               TELEPORT_TO_TOWN
  #170 = Fieldref           #93.#171      // ext/mods/gameserver/network/SystemMessageId.YOU_WILL_BE_MOVED_TO_TOWN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #171 = NameAndType        #172:#97      // YOU_WILL_BE_MOVED_TO_TOWN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
  #172 = Utf8               YOU_WILL_BE_MOVED_TO_TOWN_IN_S1_SECONDS
  #173 = Methodref          #14.#174      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.cleanupGame:()V
  #174 = NameAndType        #175:#6       // cleanupGame:()V
  #175 = Utf8               cleanupGame
  #176 = Class              #177          // java/lang/Exception
  #177 = Utf8               java/lang/Exception
  #178 = Fieldref           #14.#179      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.LOGGER:Lext/mods/commons/logging/CLogger;
  #179 = NameAndType        #180:#181     // LOGGER:Lext/mods/commons/logging/CLogger;
  #180 = Utf8               LOGGER
  #181 = Utf8               Lext/mods/commons/logging/CLogger;
  #182 = String             #183          // Couldn\'t return players back in town.
  #183 = Utf8               Couldn\'t return players back in town.
  #184 = Methodref          #185.#186     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #185 = Class              #187          // ext/mods/commons/logging/CLogger
  #186 = NameAndType        #188:#189     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #187 = Utf8               ext/mods/commons/logging/CLogger
  #188 = Utf8               error
  #189 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #190 = Methodref          #14.#191      // ext/mods/gameserver/model/olympiad/OlympiadGameTask._stateBetween:(Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;)Z
  #191 = NameAndType        #192:#193     // _stateBetween:(Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;)Z
  #192 = Utf8               _stateBetween
  #193 = Utf8               (Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;)Z
  #194 = Methodref          #195.#196     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #195 = Class              #197          // ext/mods/gameserver/model/actor/Player
  #196 = NameAndType        #198:#49      // getObjectId:()I
  #197 = Utf8               ext/mods/gameserver/model/actor/Player
  #198 = Utf8               getObjectId
  #199 = Methodref          #200.#201     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #200 = Class              #202          // java/lang/Integer
  #201 = NameAndType        #203:#204     // valueOf:(I)Ljava/lang/Integer;
  #202 = Utf8               java/lang/Integer
  #203 = Utf8               valueOf
  #204 = Utf8               (I)Ljava/lang/Integer;
  #205 = InterfaceMethodref #206.#207     // java/util/Set.add:(Ljava/lang/Object;)Z
  #206 = Class              #208          // java/util/Set
  #207 = NameAndType        #209:#210     // add:(Ljava/lang/Object;)Z
  #208 = Utf8               java/util/Set
  #209 = Utf8               add
  #210 = Utf8               (Ljava/lang/Object;)Z
  #211 = InterfaceMethodref #206.#212     // java/util/Set.remove:(Ljava/lang/Object;)Z
  #212 = NameAndType        #213:#210     // remove:(Ljava/lang/Object;)Z
  #213 = Utf8               remove
  #214 = InterfaceMethodref #206.#215     // java/util/Set.isEmpty:()Z
  #215 = NameAndType        #216:#125     // isEmpty:()Z
  #216 = Utf8               isEmpty
  #217 = Class              #218          // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
  #218 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameNormal
  #219 = Methodref          #217.#220     // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.areParticipantsOnline:()Z
  #220 = NameAndType        #221:#125     // areParticipantsOnline:()Z
  #221 = Utf8               areParticipantsOnline
  #222 = Methodref          #14.#223      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.restartBattleAfterReconnect:()V
  #223 = NameAndType        #224:#6       // restartBattleAfterReconnect:()V
  #224 = Utf8               restartBattleAfterReconnect
  #225 = Methodref          #109.#226     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
  #226 = NameAndType        #227:#228     // handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
  #227 = Utf8               handleDisconnect
  #228 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #229 = Methodref          #217.#230     // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.clearDisconnections:()V
  #230 = NameAndType        #231:#6       // clearDisconnections:()V
  #231 = Utf8               clearDisconnections
  #232 = Fieldref           #233.#234     // ext/mods/gameserver/enums/SpawnType.NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #233 = Class              #235          // ext/mods/gameserver/enums/SpawnType
  #234 = NameAndType        #236:#237     // NORMAL:Lext/mods/gameserver/enums/SpawnType;
  #235 = Utf8               ext/mods/gameserver/enums/SpawnType
  #236 = Utf8               NORMAL
  #237 = Utf8               Lext/mods/gameserver/enums/SpawnType;
  #238 = Methodref          #41.#239      // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #239 = NameAndType        #240:#241     // getSpawns:(Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #240 = Utf8               getSpawns
  #241 = Utf8               (Lext/mods/gameserver/enums/SpawnType;)Ljava/util/List;
  #242 = Methodref          #109.#243     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.portPlayersToArena:(Ljava/util/List;)Z
  #243 = NameAndType        #244:#245     // portPlayersToArena:(Ljava/util/List;)Z
  #244 = Utf8               portPlayersToArena
  #245 = Utf8               (Ljava/util/List;)Z
  #246 = Methodref          #217.#247     // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.setParticipantsSavedLocationToGiran:()V
  #247 = NameAndType        #248:#6       // setParticipantsSavedLocationToGiran:()V
  #248 = Utf8               setParticipantsSavedLocationToGiran
  #249 = Methodref          #109.#250     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.removals:()V
  #250 = NameAndType        #251:#6       // removals:()V
  #251 = Utf8               removals
  #252 = Methodref          #109.#253     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.cleanEffects:()V
  #253 = NameAndType        #254:#6       // cleanEffects:()V
  #254 = Utf8               cleanEffects
  #255 = Methodref          #109.#256     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.checkDefection:()Z
  #256 = NameAndType        #257:#125     // checkDefection:()Z
  #257 = Utf8               checkDefection
  #258 = Methodref          #259.#260     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #259 = Class              #261          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #260 = NameAndType        #262:#263     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #261 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #262 = Utf8               getInstance
  #263 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #264 = Methodref          #259.#265     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.startBattle:()V
  #265 = NameAndType        #153:#6       // startBattle:()V
  #266 = Methodref          #109.#267     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.checkBattleStatus:()Z
  #267 = NameAndType        #268:#125     // checkBattleStatus:()Z
  #268 = Utf8               checkBattleStatus
  #269 = Methodref          #109.#270     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.makeCompetitionStart:()Z
  #270 = NameAndType        #271:#125     // makeCompetitionStart:()Z
  #271 = Utf8               makeCompetitionStart
  #272 = Methodref          #109.#273     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.broadcastOlympiadInfo:(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #273 = NameAndType        #274:#275     // broadcastOlympiadInfo:(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #274 = Utf8               broadcastOlympiadInfo
  #275 = Utf8               (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #276 = Fieldref           #93.#277      // ext/mods/gameserver/network/SystemMessageId.STARTS_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #277 = NameAndType        #278:#97      // STARTS_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #278 = Utf8               STARTS_THE_GAME
  #279 = Methodref          #41.#280      // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.updateZoneStatus:()V
  #280 = NameAndType        #281:#6       // updateZoneStatus:()V
  #281 = Utf8               updateZoneStatus
  #282 = Methodref          #109.#283     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.haveWinner:()Z
  #283 = NameAndType        #284:#125     // haveWinner:()Z
  #284 = Utf8               haveWinner
  #285 = Methodref          #109.#286     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.validateWinner:(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #286 = NameAndType        #287:#275     // validateWinner:(Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #287 = Utf8               validateWinner
  #288 = Methodref          #109.#289     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.playersStatusBack:()V
  #289 = NameAndType        #290:#6       // playersStatusBack:()V
  #290 = Utf8               playersStatusBack
  #291 = Methodref          #109.#292     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.portPlayersBack:()V
  #292 = NameAndType        #293:#6       // portPlayersBack:()V
  #293 = Utf8               portPlayersBack
  #294 = Methodref          #109.#295     // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.clearPlayers:()V
  #295 = NameAndType        #296:#6       // clearPlayers:()V
  #296 = Utf8               clearPlayers
  #297 = Methodref          #298.#299     // java/lang/Class.getName:()Ljava/lang/String;
  #298 = Class              #300          // java/lang/Class
  #299 = NameAndType        #301:#302     // getName:()Ljava/lang/String;
  #300 = Utf8               java/lang/Class
  #301 = Utf8               getName
  #302 = Utf8               ()Ljava/lang/String;
  #303 = Methodref          #185.#304     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #304 = NameAndType        #5:#305       // "<init>":(Ljava/lang/String;)V
  #305 = Utf8               (Ljava/lang/String;)V
  #306 = Fieldref           #14.#307      // ext/mods/gameserver/model/olympiad/OlympiadGameTask.BATTLE_PERIOD:J
  #307 = NameAndType        #308:#160     // BATTLE_PERIOD:J
  #308 = Utf8               BATTLE_PERIOD
  #309 = Class              #310          // java/lang/Runnable
  #310 = Utf8               java/lang/Runnable
  #311 = Utf8               Signature
  #312 = Utf8               Ljava/util/Set<Ljava/lang/Integer;>;
  #313 = Utf8               Code
  #314 = Utf8               LineNumberTable
  #315 = Utf8               LocalVariableTable
  #316 = Utf8               this
  #317 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #318 = Utf8               zone
  #319 = Utf8               isRunning
  #320 = Utf8               StackMapTable
  #321 = Utf8               isGameStarted
  #322 = Utf8               isInTimerTime
  #323 = Utf8               isBattleStarted
  #324 = Utf8               isBattleFinished
  #325 = Utf8               needAnnounce
  #326 = Utf8               getZone
  #327 = Utf8               ()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #328 = Utf8               getGame
  #329 = Utf8               ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
  #330 = Utf8               attachGame
  #331 = Utf8               (Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
  #332 = Utf8               game
  #333 = Utf8               run
  #334 = Utf8               delay
  #335 = Utf8               e
  #336 = Utf8               Ljava/lang/Exception;
  #337 = Utf8               pauseForDisconnect
  #338 = Utf8               player
  #339 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #340 = Utf8               resumeForReconnect
  #341 = Utf8               normal
  #342 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
  #343 = Utf8               handleTimeoutDisconnect
  #344 = Utf8               normalGame
  #345 = Utf8               min
  #346 = Utf8               max
  #347 = Utf8               time
  #348 = Utf8               i
  #349 = Utf8               times
  #350 = Class              #117          // "[I"
  #351 = Utf8               <clinit>
  #352 = Utf8               SourceFile
  #353 = Utf8               OlympiadGameTask.java
  #354 = Utf8               NestMembers
  #355 = Utf8               InnerClasses
  #356 = Utf8               GameState
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected static final long BATTLE_PERIOD;
    descriptor: J
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public static final int[] TELEPORT_TO_ARENA;
    descriptor: [I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int[] BATTLE_START_TIME;
    descriptor: [I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int[] TELEPORT_TO_TOWN;
    descriptor: [I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.gameserver.model.olympiad.OlympiadGameTask(ext.mods.gameserver.model.zone.type.OlympiadStadiumZone);
    descriptor: (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: getstatic     #7                  // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         8: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        11: aload_0
        12: iconst_0
        13: putfield      #18                 // Field _needAnnounce:Z
        16: aload_0
        17: iconst_0
        18: putfield      #22                 // Field _countDown:I
        21: aload_0
        22: iconst_0
        23: putfield      #26                 // Field _pausedByDisconnect:Z
        26: aload_0
        27: new           #29                 // class java/util/HashSet
        30: dup
        31: invokespecial #31                 // Method java/util/HashSet."<init>":()V
        34: putfield      #32                 // Field _pausedPlayers:Ljava/util/Set;
        37: aload_0
        38: aload_1
        39: putfield      #36                 // Field _zone:Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
        42: aload_1
        43: aload_0
        44: invokevirtual #40                 // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.registerTask:(Lext/mods/gameserver/model/olympiad/OlympiadGameTask;)V
        47: return
      LineNumberTable:
        line 105: 0
        line 84: 4
        line 85: 11
        line 86: 16
        line 87: 21
        line 88: 26
        line 106: 37
        line 107: 42
        line 108: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0      48     1  zone   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;

  public final boolean isRunning();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         4: getstatic     #7                  // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         7: if_acmpeq     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isGameStarted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         4: invokevirtual #46                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
         7: getstatic     #50                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        10: invokevirtual #46                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
        13: if_icmplt     36
        16: aload_0
        17: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        20: invokevirtual #46                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
        23: getstatic     #53                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        26: invokevirtual #46                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
        29: if_icmpgt     36
        32: iconst_1
        33: goto          37
        36: iconst_0
        37: ireturn
      LineNumberTable:
        line 117: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 2
        frame_type = 36 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInTimerTime();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         4: getstatic     #56                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isBattleStarted();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         4: getstatic     #59                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isBattleFinished();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         4: getstatic     #62                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean needAnnounce();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _needAnnounce:Z
         4: ifeq          14
         7: aload_0
         8: iconst_0
         9: putfield      #18                 // Field _needAnnounce:Z
        12: iconst_1
        13: ireturn
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 137: 0
        line 139: 7
        line 140: 12
        line 142: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public final ext.mods.gameserver.model.zone.type.OlympiadStadiumZone getZone();
    descriptor: ()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field _zone:Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
         4: areturn
      LineNumberTable:
        line 147: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;

  public final ext.mods.gameserver.model.olympiad.AbstractOlympiadGame getGame();
    descriptor: ()Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
         4: areturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;

  public final void attachGame(ext.mods.gameserver.model.olympiad.AbstractOlympiadGame);
    descriptor: (Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        15
         4: aload_0
         5: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
         8: getstatic     #7                  // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        11: if_acmpeq     15
        14: return
        15: aload_0
        16: aload_1
        17: putfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        20: aload_0
        21: getstatic     #69                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BEGIN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        24: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        27: aload_0
        28: iconst_0
        29: putfield      #18                 // Field _needAnnounce:Z
        32: aload_0
        33: invokestatic  #72                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        36: return
      LineNumberTable:
        line 157: 0
        line 158: 14
        line 160: 15
        line 161: 20
        line 162: 27
        line 164: 32
        line 165: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0      37     1  game   Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public final void run();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _pausedByDisconnect:Z
         4: ifeq          16
         7: aload_0
         8: ldc2_w        #78                 // long 1000l
        11: invokestatic  #80                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        14: pop
        15: return
        16: iconst_1
        17: istore_1
        18: aload_0
        19: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        22: invokevirtual #46                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
        25: tableswitch   { // 0 to 8

                       0: 76

                       1: 93

                       2: 138

                       3: 180

                       4: 225

                       5: 275

                       6: 316

                       7: 345

                       8: 390
                 default: 407
            }
        76: aload_0
        77: getstatic     #84                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_ARENA:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        80: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        83: aload_0
        84: getstatic     #87                 // Field ext/mods/Config.OLY_WAIT_TIME:I
        87: putfield      #22                 // Field _countDown:I
        90: goto          407
        93: aload_0
        94: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        97: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_WILL_ENTER_THE_OLYMPIAD_STADIUM_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
       100: invokestatic  #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       103: aload_0
       104: getfield      #22                 // Field _countDown:I
       107: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       110: invokevirtual #108                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: aload_0
       114: getstatic     #114                // Field TELEPORT_TO_ARENA:[I
       117: invokevirtual #118                // Method getDelay:([I)I
       120: istore_1
       121: aload_0
       122: getfield      #22                 // Field _countDown:I
       125: ifgt          407
       128: aload_0
       129: getstatic     #50                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       132: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       135: goto          407
       138: aload_0
       139: invokevirtual #122                // Method startGame:()Z
       142: ifne          155
       145: aload_0
       146: getstatic     #126                // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       149: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       152: goto          407
       155: aload_0
       156: getstatic     #56                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_COUNTDOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       159: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       162: aload_0
       163: getstatic     #129                // Field ext/mods/Config.OLY_WAIT_BATTLE:I
       166: putfield      #22                 // Field _countDown:I
       169: aload_0
       170: getstatic     #132                // Field BATTLE_START_TIME:[I
       173: invokevirtual #118                // Method getDelay:([I)I
       176: istore_1
       177: goto          407
       180: aload_0
       181: getfield      #36                 // Field _zone:Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
       184: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_WILL_START_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
       187: invokestatic  #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       190: aload_0
       191: getfield      #22                 // Field _countDown:I
       194: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       197: invokevirtual #138                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       200: aload_0
       201: getstatic     #132                // Field BATTLE_START_TIME:[I
       204: invokevirtual #118                // Method getDelay:([I)I
       207: istore_1
       208: aload_0
       209: getfield      #22                 // Field _countDown:I
       212: ifgt          407
       215: aload_0
       216: getstatic     #139                // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       219: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       222: goto          407
       225: aload_0
       226: iconst_0
       227: putfield      #22                 // Field _countDown:I
       230: aload_0
       231: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       234: invokevirtual #142                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.buffPlayers:()V
       237: aload_0
       238: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       241: invokevirtual #145                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.healPlayers:()V
       244: aload_0
       245: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       248: invokevirtual #148                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.resetDamage:()V
       251: aload_0
       252: getstatic     #59                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       255: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       258: aload_0
       259: invokevirtual #151                // Method startBattle:()Z
       262: ifne          407
       265: aload_0
       266: getstatic     #126                // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       269: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       272: goto          407
       275: aload_0
       276: dup
       277: getfield      #22                 // Field _countDown:I
       280: sipush        1000
       283: iadd
       284: putfield      #22                 // Field _countDown:I
       287: aload_0
       288: invokevirtual #154                // Method checkBattle:()Z
       291: ifne          306
       294: aload_0
       295: getfield      #22                 // Field _countDown:I
       298: i2l
       299: getstatic     #157                // Field ext/mods/Config.OLY_BATTLE:J
       302: lcmp
       303: ifle          407
       306: aload_0
       307: getstatic     #126                // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       310: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       313: goto          407
       316: aload_0
       317: getstatic     #62                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.TELE_TO_TOWN:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       320: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       323: aload_0
       324: getstatic     #161                // Field ext/mods/Config.OLY_WAIT_END:I
       327: putfield      #22                 // Field _countDown:I
       330: aload_0
       331: invokevirtual #164                // Method stopGame:()V
       334: aload_0
       335: getstatic     #167                // Field TELEPORT_TO_TOWN:[I
       338: invokevirtual #118                // Method getDelay:([I)I
       341: istore_1
       342: goto          407
       345: aload_0
       346: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       349: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.YOU_WILL_BE_MOVED_TO_TOWN_IN_S1_SECONDS:Lext/mods/gameserver/network/SystemMessageId;
       352: invokestatic  #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       355: aload_0
       356: getfield      #22                 // Field _countDown:I
       359: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       362: invokevirtual #108                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       365: aload_0
       366: getstatic     #167                // Field TELEPORT_TO_TOWN:[I
       369: invokevirtual #118                // Method getDelay:([I)I
       372: istore_1
       373: aload_0
       374: getfield      #22                 // Field _countDown:I
       377: ifgt          407
       380: aload_0
       381: getstatic     #53                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.CLEANUP:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       384: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       387: goto          407
       390: aload_0
       391: invokevirtual #173                // Method cleanupGame:()V
       394: aload_0
       395: getstatic     #7                  // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       398: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       401: aload_0
       402: aconst_null
       403: putfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       406: return
       407: aload_0
       408: iload_1
       409: i2l
       410: ldc2_w        #78                 // long 1000l
       413: lmul
       414: invokestatic  #80                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       417: pop
       418: goto          506
       421: astore_1
       422: aload_0
       423: getfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       426: invokevirtual #46                 // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.ordinal:()I
       429: tableswitch   { // 6 to 9

                       6: 460

                       7: 460

                       8: 460

                       9: 460
                 default: 482
            }
       460: getstatic     #178                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       463: ldc           #182                // String Couldn\'t return players back in town.
       465: aload_1
       466: invokevirtual #184                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       469: aload_0
       470: getstatic     #7                  // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.IDLE:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       473: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       476: aload_0
       477: aconst_null
       478: putfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
       481: return
       482: getstatic     #178                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       485: ldc           #182                // String Couldn\'t return players back in town.
       487: aload_1
       488: invokevirtual #184                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       491: aload_0
       492: getstatic     #126                // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       495: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
       498: aload_0
       499: ldc2_w        #78                 // long 1000l
       502: invokestatic  #80                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       505: pop
       506: return
      Exception table:
         from    to  target type
             0    15   421   Class java/lang/Exception
            16   406   421   Class java/lang/Exception
           407   418   421   Class java/lang/Exception
      LineNumberTable:
        line 172: 0
        line 174: 7
        line 175: 15
        line 178: 16
        line 179: 18
        line 182: 76
        line 183: 83
        line 184: 90
        line 187: 93
        line 189: 113
        line 190: 121
        line 191: 128
        line 195: 138
        line 197: 145
        line 198: 152
        line 201: 155
        line 202: 162
        line 203: 169
        line 204: 177
        line 207: 180
        line 209: 200
        line 210: 208
        line 211: 215
        line 216: 225
        line 218: 230
        line 219: 237
        line 220: 244
        line 222: 251
        line 223: 258
        line 224: 265
        line 229: 275
        line 230: 287
        line 231: 306
        line 236: 316
        line 237: 323
        line 238: 330
        line 239: 334
        line 240: 342
        line 243: 345
        line 245: 365
        line 246: 373
        line 247: 380
        line 252: 390
        line 253: 394
        line 254: 401
        line 255: 406
        line 257: 407
        line 274: 418
        line 259: 421
        line 261: 422
        line 264: 460
        line 265: 469
        line 266: 476
        line 267: 481
        line 270: 482
        line 271: 491
        line 273: 498
        line 275: 506
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18     400     1 delay   I
          422      84     1     e   Ljava/lang/Exception;
            0     507     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
      StackMapTable: number_of_entries = 17
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ int ]
        frame_type = 16 /* same */
        frame_type = 44 /* same */
        frame_type = 16 /* same */
        frame_type = 24 /* same */
        frame_type = 44 /* same */
        frame_type = 49 /* same */
        frame_type = 30 /* same */
        frame_type = 9 /* same */
        frame_type = 28 /* same */
        frame_type = 44 /* same */
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/olympiad/OlympiadGameTask ]
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/lang/Exception ]
        frame_type = 21 /* same */
        frame_type = 250 /* chop */
          offset_delta = 23

  public synchronized void pauseForDisconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
         4: ifnull        20
         7: aload_0
         8: getstatic     #50                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STARTED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        11: getstatic     #59                 // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.BATTLE_IN_PROGRESS:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        14: invokevirtual #190                // Method _stateBetween:(Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;)Z
        17: ifne          21
        20: return
        21: aload_0
        22: getfield      #32                 // Field _pausedPlayers:Ljava/util/Set;
        25: aload_1
        26: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: invokestatic  #199                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: invokeinterface #205,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        37: pop
        38: aload_0
        39: getfield      #26                 // Field _pausedByDisconnect:Z
        42: ifne          69
        45: aload_0
        46: iconst_1
        47: putfield      #26                 // Field _pausedByDisconnect:Z
        50: aload_0
        51: getfield      #36                 // Field _zone:Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
        54: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_WILL_START_IN_S1_SECOND_S:Lext/mods/gameserver/network/SystemMessageId;
        57: invokestatic  #98                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        60: getstatic     #129                // Field ext/mods/Config.OLY_WAIT_BATTLE:I
        63: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        66: invokevirtual #138                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        69: return
      LineNumberTable:
        line 279: 0
        line 280: 20
        line 282: 21
        line 283: 38
        line 285: 45
        line 286: 50
        line 288: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0      70     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 47 /* same */

  public synchronized void resumeForReconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #26                 // Field _pausedByDisconnect:Z
         4: ifeq          14
         7: aload_0
         8: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        11: ifnonnull     15
        14: return
        15: aload_0
        16: getfield      #32                 // Field _pausedPlayers:Ljava/util/Set;
        19: aload_1
        20: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        23: invokestatic  #199                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        26: invokeinterface #211,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        31: pop
        32: aload_0
        33: getfield      #32                 // Field _pausedPlayers:Ljava/util/Set;
        36: invokeinterface #214,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
        41: ifne          45
        44: return
        45: aload_0
        46: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        49: astore_3
        50: aload_3
        51: instanceof    #217                // class ext/mods/gameserver/model/olympiad/OlympiadGameNormal
        54: ifeq          70
        57: aload_3
        58: checkcast     #217                // class ext/mods/gameserver/model/olympiad/OlympiadGameNormal
        61: astore_2
        62: aload_2
        63: invokevirtual #219                // Method ext/mods/gameserver/model/olympiad/OlympiadGameNormal.areParticipantsOnline:()Z
        66: ifne          70
        69: return
        70: aload_0
        71: invokevirtual #222                // Method restartBattleAfterReconnect:()V
        74: aload_0
        75: invokestatic  #72                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        78: return
      LineNumberTable:
        line 292: 0
        line 293: 14
        line 295: 15
        line 296: 32
        line 297: 44
        line 299: 45
        line 300: 69
        line 302: 70
        line 303: 74
        line 304: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62       8     2 normal   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      79     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0      79     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 29 /* same */
        frame_type = 24 /* same */

  public synchronized void handleTimeoutDisconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #32                 // Field _pausedPlayers:Ljava/util/Set;
        12: aload_1
        13: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        16: invokestatic  #199                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        19: invokeinterface #211,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        24: pop
        25: aload_0
        26: iconst_0
        27: putfield      #26                 // Field _pausedByDisconnect:Z
        30: aload_0
        31: getfield      #65                 // Field _game:Lext/mods/gameserver/model/olympiad/AbstractOlympiadGame;
        34: aload_1
        35: invokevirtual #225                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.handleDisconnect:(Lext/mods/gameserver/model/actor/Player;)V
        38: aload_0
        39: getstatic     #126                // Field ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState.GAME_STOPPED:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        42: putfield      #13                 // Field _state:Lext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState;
        45: aload_0
        46: invokestatic  #72                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        49: return
      LineNumberTable:
        line 308: 0
        line 309: 7
        line 311: 8
        line 312: 25
        line 313: 30
        line 314: 38
        line 315: 45
        line 316: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
            0      50     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #185                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/model/olympiad/OlympiadGameTask
         6: invokevirtual #297                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #303                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #178                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #157                // Field ext/mods/Config.OLY_BATTLE:J
        18: putstatic     #306                // Field BATTLE_PERIOD:J
        21: bipush        11
        23: newarray       int
        25: dup
        26: iconst_0
        27: bipush        120
        29: iastore
        30: dup
        31: iconst_1
        32: bipush        60
        34: iastore
        35: dup
        36: iconst_2
        37: bipush        30
        39: iastore
        40: dup
        41: iconst_3
        42: bipush        15
        44: iastore
        45: dup
        46: iconst_4
        47: bipush        10
        49: iastore
        50: dup
        51: iconst_5
        52: iconst_5
        53: iastore
        54: dup
        55: bipush        6
        57: iconst_4
        58: iastore
        59: dup
        60: bipush        7
        62: iconst_3
        63: iastore
        64: dup
        65: bipush        8
        67: iconst_2
        68: iastore
        69: dup
        70: bipush        9
        72: iconst_1
        73: iastore
        74: dup
        75: bipush        10
        77: iconst_0
        78: iastore
        79: putstatic     #114                // Field TELEPORT_TO_ARENA:[I
        82: bipush        12
        84: newarray       int
        86: dup
        87: iconst_0
        88: bipush        60
        90: iastore
        91: dup
        92: iconst_1
        93: bipush        50
        95: iastore
        96: dup
        97: iconst_2
        98: bipush        40
       100: iastore
       101: dup
       102: iconst_3
       103: bipush        30
       105: iastore
       106: dup
       107: iconst_4
       108: bipush        20
       110: iastore
       111: dup
       112: iconst_5
       113: bipush        10
       115: iastore
       116: dup
       117: bipush        6
       119: iconst_5
       120: iastore
       121: dup
       122: bipush        7
       124: iconst_4
       125: iastore
       126: dup
       127: bipush        8
       129: iconst_3
       130: iastore
       131: dup
       132: bipush        9
       134: iconst_2
       135: iastore
       136: dup
       137: bipush        10
       139: iconst_1
       140: iastore
       141: dup
       142: bipush        11
       144: iconst_0
       145: iastore
       146: putstatic     #132                // Field BATTLE_START_TIME:[I
       149: bipush        10
       151: newarray       int
       153: dup
       154: iconst_0
       155: bipush        40
       157: iastore
       158: dup
       159: iconst_1
       160: bipush        30
       162: iastore
       163: dup
       164: iconst_2
       165: bipush        20
       167: iastore
       168: dup
       169: iconst_3
       170: bipush        10
       172: iastore
       173: dup
       174: iconst_4
       175: iconst_5
       176: iastore
       177: dup
       178: iconst_5
       179: iconst_4
       180: iastore
       181: dup
       182: bipush        6
       184: iconst_3
       185: iastore
       186: dup
       187: bipush        7
       189: iconst_2
       190: iastore
       191: dup
       192: bipush        8
       194: iconst_1
       195: iastore
       196: dup
       197: bipush        9
       199: iconst_0
       200: iastore
       201: putstatic     #167                // Field TELEPORT_TO_TOWN:[I
       204: return
      LineNumberTable:
        line 35: 0
        line 37: 15
        line 39: 21
        line 53: 82
        line 68: 149
}
SourceFile: "OlympiadGameTask.java"
NestMembers:
  ext/mods/gameserver/model/olympiad/OlympiadGameTask$GameState
