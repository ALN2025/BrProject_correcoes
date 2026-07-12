// Bytecode for: ext.mods.gameserver.network.GameClient
// File: ext\mods\gameserver\network\GameClient.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/GameClient.class
  Last modified 9 de jul de 2026; size 27480 bytes
  MD5 checksum 9b389a8d71e0fe264b9e6d05c2acc0ba
  Compiled from "GameClient.java"
public final class ext.mods.gameserver.network.GameClient extends ext.mods.commons.mmocore.MMOClient<ext.mods.commons.mmocore.MMOConnection<ext.mods.gameserver.network.GameClient>> implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/network/GameClient
  super_class: #2                         // ext/mods/commons/mmocore/MMOClient
  interfaces: 1, fields: 45, methods: 58, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/mmocore/MMOClient."<init>":(Lext/mods/commons/mmocore/MMOConnection;)V
    #2 = Class              #4            // ext/mods/commons/mmocore/MMOClient
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/commons/mmocore/MMOConnection;)V
    #4 = Utf8               ext/mods/commons/mmocore/MMOClient
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/FloodProtector.VALUES_LENGTH:I
    #8 = Class              #10           // ext/mods/gameserver/enums/FloodProtector
    #9 = NameAndType        #11:#12       // VALUES_LENGTH:I
   #10 = Utf8               ext/mods/gameserver/enums/FloodProtector
   #11 = Utf8               VALUES_LENGTH
   #12 = Utf8               I
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/network/GameClient._floodProtectors:[J
   #14 = Class              #16           // ext/mods/gameserver/network/GameClient
   #15 = NameAndType        #17:#18       // _floodProtectors:[J
   #16 = Utf8               ext/mods/gameserver/network/GameClient
   #17 = Utf8               _floodProtectors
   #18 = Utf8               [J
   #19 = Class              #20           // java/util/concurrent/locks/ReentrantLock
   #20 = Utf8               java/util/concurrent/locks/ReentrantLock
   #21 = Methodref          #19.#22       // java/util/concurrent/locks/ReentrantLock."<init>":()V
   #22 = NameAndType        #5:#23        // "<init>":()V
   #23 = Utf8               ()V
   #24 = Fieldref           #14.#25       // ext/mods/gameserver/network/GameClient._queueLock:Ljava/util/concurrent/locks/ReentrantLock;
   #25 = NameAndType        #26:#27       // _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
   #26 = Utf8               _queueLock
   #27 = Utf8               Ljava/util/concurrent/locks/ReentrantLock;
   #28 = Fieldref           #14.#29       // ext/mods/gameserver/network/GameClient._activeCharLock:Ljava/util/concurrent/locks/ReentrantLock;
   #29 = NameAndType        #30:#27       // _activeCharLock:Ljava/util/concurrent/locks/ReentrantLock;
   #30 = Utf8               _activeCharLock
   #31 = Fieldref           #32.#33       // ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
   #32 = Class              #34           // ext/mods/gameserver/network/GameClient$GameClientState
   #33 = NameAndType        #35:#36       // CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
   #34 = Utf8               ext/mods/gameserver/network/GameClient$GameClientState
   #35 = Utf8               CONNECTED
   #36 = Utf8               Lext/mods/gameserver/network/GameClient$GameClientState;
   #37 = Fieldref           #14.#38       // ext/mods/gameserver/network/GameClient._state:Lext/mods/gameserver/network/GameClient$GameClientState;
   #38 = NameAndType        #39:#36       // _state:Lext/mods/gameserver/network/GameClient$GameClientState;
   #39 = Utf8               _state
   #40 = Methodref          #41.#42       // java/lang/System.currentTimeMillis:()J
   #41 = Class              #43           // java/lang/System
   #42 = NameAndType        #44:#45       // currentTimeMillis:()J
   #43 = Utf8               java/lang/System
   #44 = Utf8               currentTimeMillis
   #45 = Utf8               ()J
   #46 = Fieldref           #14.#47       // ext/mods/gameserver/network/GameClient._connectionStartTime:J
   #47 = NameAndType        #48:#49       // _connectionStartTime:J
   #48 = Utf8               _connectionStartTime
   #49 = Utf8               J
   #50 = Class              #51           // ext/mods/gameserver/network/GameCrypt
   #51 = Utf8               ext/mods/gameserver/network/GameCrypt
   #52 = Methodref          #50.#22       // ext/mods/gameserver/network/GameCrypt."<init>":()V
   #53 = Fieldref           #14.#54       // ext/mods/gameserver/network/GameClient._crypt:Lext/mods/gameserver/network/GameCrypt;
   #54 = NameAndType        #55:#56       // _crypt:Lext/mods/gameserver/network/GameCrypt;
   #55 = Utf8               _crypt
   #56 = Utf8               Lext/mods/gameserver/network/GameCrypt;
   #57 = Class              #58           // ext/mods/gameserver/network/ClientStats
   #58 = Utf8               ext/mods/gameserver/network/ClientStats
   #59 = Methodref          #57.#22       // ext/mods/gameserver/network/ClientStats."<init>":()V
   #60 = Fieldref           #14.#61       // ext/mods/gameserver/network/GameClient._stats:Lext/mods/gameserver/network/ClientStats;
   #61 = NameAndType        #62:#63       // _stats:Lext/mods/gameserver/network/ClientStats;
   #62 = Utf8               _stats
   #63 = Utf8               Lext/mods/gameserver/network/ClientStats;
   #64 = Class              #65           // java/util/concurrent/ArrayBlockingQueue
   #65 = Utf8               java/util/concurrent/ArrayBlockingQueue
   #66 = Fieldref           #67.#68       // ext/mods/Config.CLIENT_PACKET_QUEUE_SIZE:I
   #67 = Class              #69           // ext/mods/Config
   #68 = NameAndType        #70:#12       // CLIENT_PACKET_QUEUE_SIZE:I
   #69 = Utf8               ext/mods/Config
   #70 = Utf8               CLIENT_PACKET_QUEUE_SIZE
   #71 = Methodref          #64.#72       // java/util/concurrent/ArrayBlockingQueue."<init>":(I)V
   #72 = NameAndType        #5:#73        // "<init>":(I)V
   #73 = Utf8               (I)V
   #74 = Fieldref           #14.#75       // ext/mods/gameserver/network/GameClient._packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
   #75 = NameAndType        #76:#77       // _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
   #76 = Utf8               _packetQueue
   #77 = Utf8               Ljava/util/concurrent/ArrayBlockingQueue;
   #78 = InvokeDynamic      #0:#79        // #0:run:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
   #79 = NameAndType        #80:#81       // run:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
   #80 = Utf8               run
   #81 = Utf8               (Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
   #82 = Long               300000l
   #84 = Long               900000l
   #86 = Methodref          #87.#88       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #87 = Class              #89           // ext/mods/commons/pool/ThreadPool
   #88 = NameAndType        #90:#91       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #89 = Utf8               ext/mods/commons/pool/ThreadPool
   #90 = Utf8               scheduleAtFixedRate
   #91 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #92 = Fieldref           #14.#93       // ext/mods/gameserver/network/GameClient._autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
   #93 = NameAndType        #94:#95       // _autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
   #94 = Utf8               _autoSaveInDB
   #95 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #96 = Methodref          #19.#97       // java/util/concurrent/locks/ReentrantLock.tryLock:()Z
   #97 = NameAndType        #98:#99       // tryLock:()Z
   #98 = Utf8               tryLock
   #99 = Utf8               ()Z
  #100 = Methodref          #64.#101      // java/util/concurrent/ArrayBlockingQueue.poll:()Ljava/lang/Object;
  #101 = NameAndType        #102:#103     // poll:()Ljava/lang/Object;
  #102 = Utf8               poll
  #103 = Utf8               ()Ljava/lang/Object;
  #104 = Class              #105          // ext/mods/commons/mmocore/ReceivablePacket
  #105 = Utf8               ext/mods/commons/mmocore/ReceivablePacket
  #106 = Methodref          #19.#107      // java/util/concurrent/locks/ReentrantLock.unlock:()V
  #107 = NameAndType        #108:#23      // unlock:()V
  #108 = Utf8               unlock
  #109 = Fieldref           #14.#110      // ext/mods/gameserver/network/GameClient._isDetached:Z
  #110 = NameAndType        #111:#112     // _isDetached:Z
  #111 = Utf8               _isDetached
  #112 = Utf8               Z
  #113 = Methodref          #64.#114      // java/util/concurrent/ArrayBlockingQueue.clear:()V
  #114 = NameAndType        #115:#23      // clear:()V
  #115 = Utf8               clear
  #116 = Methodref          #104.#117     // ext/mods/commons/mmocore/ReceivablePacket.run:()V
  #117 = NameAndType        #80:#23       // run:()V
  #118 = Class              #119          // java/lang/Exception
  #119 = Utf8               java/lang/Exception
  #120 = Fieldref           #14.#121      // ext/mods/gameserver/network/GameClient.LOGGER:Lext/mods/commons/logging/CLogger;
  #121 = NameAndType        #122:#123     // LOGGER:Lext/mods/commons/logging/CLogger;
  #122 = Utf8               LOGGER
  #123 = Utf8               Lext/mods/commons/logging/CLogger;
  #124 = String             #125          // Execution failed on {} for {}.
  #125 = Utf8               Execution failed on {} for {}.
  #126 = Class              #127          // java/lang/Object
  #127 = Utf8               java/lang/Object
  #128 = Methodref          #126.#129     // java/lang/Object.getClass:()Ljava/lang/Class;
  #129 = NameAndType        #130:#131     // getClass:()Ljava/lang/Class;
  #130 = Utf8               getClass
  #131 = Utf8               ()Ljava/lang/Class;
  #132 = Methodref          #133.#134     // java/lang/Class.getSimpleName:()Ljava/lang/String;
  #133 = Class              #135          // java/lang/Class
  #134 = NameAndType        #136:#137     // getSimpleName:()Ljava/lang/String;
  #135 = Utf8               java/lang/Class
  #136 = Utf8               getSimpleName
  #137 = Utf8               ()Ljava/lang/String;
  #138 = Methodref          #14.#139      // ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
  #139 = NameAndType        #140:#137     // toString:()Ljava/lang/String;
  #140 = Utf8               toString
  #141 = Methodref          #142.#143     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #142 = Class              #144          // ext/mods/commons/logging/CLogger
  #143 = NameAndType        #145:#146     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #144 = Utf8               ext/mods/commons/logging/CLogger
  #145 = Utf8               error
  #146 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #147 = Methodref          #14.#148      // ext/mods/gameserver/network/GameClient.getStats:()Lext/mods/gameserver/network/ClientStats;
  #148 = NameAndType        #149:#150     // getStats:()Lext/mods/gameserver/network/ClientStats;
  #149 = Utf8               getStats
  #150 = Utf8               ()Lext/mods/gameserver/network/ClientStats;
  #151 = Methodref          #57.#152      // ext/mods/gameserver/network/ClientStats.countBurst:(I)Z
  #152 = NameAndType        #153:#154     // countBurst:(I)Z
  #153 = Utf8               countBurst
  #154 = Utf8               (I)Z
  #155 = Methodref          #14.#156      // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #156 = NameAndType        #157:#158     // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #157 = Utf8               getConnection
  #158 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #159 = Methodref          #160.#161     // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #160 = Class              #162          // ext/mods/commons/mmocore/MMOConnection
  #161 = NameAndType        #163:#164     // getInetAddress:()Ljava/net/InetAddress;
  #162 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #163 = Utf8               getInetAddress
  #164 = Utf8               ()Ljava/net/InetAddress;
  #165 = Methodref          #14.#166      // ext/mods/gameserver/network/GameClient.getState:()Lext/mods/gameserver/network/GameClient$GameClientState;
  #166 = NameAndType        #167:#168     // getState:()Lext/mods/gameserver/network/GameClient$GameClientState;
  #167 = Utf8               getState
  #168 = Utf8               ()Lext/mods/gameserver/network/GameClient$GameClientState;
  #169 = Methodref          #32.#170      // ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
  #170 = NameAndType        #171:#172     // ordinal:()I
  #171 = Utf8               ordinal
  #172 = Utf8               ()I
  #173 = String             #174          // disconnected
  #174 = Utf8               disconnected
  #175 = Methodref          #176.#177     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #176 = Class              #178          // java/net/InetAddress
  #177 = NameAndType        #179:#137     // getHostAddress:()Ljava/lang/String;
  #178 = Utf8               java/net/InetAddress
  #179 = Utf8               getHostAddress
  #180 = InvokeDynamic      #1:#181       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #181 = NameAndType        #182:#183     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #182 = Utf8               makeConcatWithConstants
  #183 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #184 = Methodref          #14.#185      // ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
  #185 = NameAndType        #186:#137     // getAccountName:()Ljava/lang/String;
  #186 = Utf8               getAccountName
  #187 = InvokeDynamic      #2:#188       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #188 = NameAndType        #182:#189     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #189 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #190 = Methodref          #14.#191      // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #191 = NameAndType        #192:#193     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #192 = Utf8               getPlayer
  #193 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #194 = Methodref          #195.#196     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #195 = Class              #197          // ext/mods/gameserver/model/actor/Player
  #196 = NameAndType        #198:#137     // getName:()Ljava/lang/String;
  #197 = Utf8               ext/mods/gameserver/model/actor/Player
  #198 = Utf8               getName
  #199 = InvokeDynamic      #3:#200       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #200 = NameAndType        #182:#201     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #201 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #202 = Class              #203          // java/lang/IllegalStateException
  #203 = Utf8               java/lang/IllegalStateException
  #204 = String             #205          // Missing state on switch
  #205 = Utf8               Missing state on switch
  #206 = Methodref          #202.#207     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #207 = NameAndType        #5:#208       // "<init>":(Ljava/lang/String;)V
  #208 = Utf8               (Ljava/lang/String;)V
  #209 = Class              #210          // java/lang/NullPointerException
  #210 = Utf8               java/lang/NullPointerException
  #211 = String             #212          // [Character read failed due to disconnect]
  #212 = Utf8               [Character read failed due to disconnect]
  #213 = Methodref          #214.#215     // java/nio/ByteBuffer.array:()[B
  #214 = Class              #216          // java/nio/ByteBuffer
  #215 = NameAndType        #217:#218     // array:()[B
  #216 = Utf8               java/nio/ByteBuffer
  #217 = Utf8               array
  #218 = Utf8               ()[B
  #219 = Methodref          #214.#220     // java/nio/ByteBuffer.position:()I
  #220 = NameAndType        #221:#172     // position:()I
  #221 = Utf8               position
  #222 = Methodref          #50.#223      // ext/mods/gameserver/network/GameCrypt.decrypt:([BII)V
  #223 = NameAndType        #224:#225     // decrypt:([BII)V
  #224 = Utf8               decrypt
  #225 = Utf8               ([BII)V
  #226 = Methodref          #50.#227      // ext/mods/gameserver/network/GameCrypt.encrypt:([BII)V
  #227 = NameAndType        #228:#225     // encrypt:([BII)V
  #228 = Utf8               encrypt
  #229 = Methodref          #214.#230     // java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
  #230 = NameAndType        #221:#231     // position:(I)Ljava/nio/ByteBuffer;
  #231 = Utf8               (I)Ljava/nio/ByteBuffer;
  #232 = InvokeDynamic      #4:#79        // #4:run:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
  #233 = Methodref          #87.#234      // ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
  #234 = NameAndType        #235:#236     // executeIO:(Ljava/lang/Runnable;)V
  #235 = Utf8               executeIO
  #236 = Utf8               (Ljava/lang/Runnable;)V
  #237 = Class              #238          // java/util/concurrent/RejectedExecutionException
  #238 = Utf8               java/util/concurrent/RejectedExecutionException
  #239 = String             #240          // {} disconnected abnormally.
  #240 = Utf8               {} disconnected abnormally.
  #241 = Methodref          #142.#242     // ext/mods/commons/logging/CLogger.debug:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #242 = NameAndType        #243:#244     // debug:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #243 = Utf8               debug
  #244 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #245 = Methodref          #246.#247     // ext/mods/gameserver/network/BlowFishKeygen.getRandomKey:()[B
  #246 = Class              #248          // ext/mods/gameserver/network/BlowFishKeygen
  #247 = NameAndType        #249:#218     // getRandomKey:()[B
  #248 = Utf8               ext/mods/gameserver/network/BlowFishKeygen
  #249 = Utf8               getRandomKey
  #250 = Methodref          #50.#251      // ext/mods/gameserver/network/GameCrypt.setKey:([B)V
  #251 = NameAndType        #252:#253     // setKey:([B)V
  #252 = Utf8               setKey
  #253 = Utf8               ([B)V
  #254 = Methodref          #255.#256     // ext/mods/protection/hwid/hwid.isProtectionOn:()Z
  #255 = Class              #257          // ext/mods/protection/hwid/hwid
  #256 = NameAndType        #258:#99      // isProtectionOn:()Z
  #257 = Utf8               ext/mods/protection/hwid/hwid
  #258 = Utf8               isProtectionOn
  #259 = Methodref          #255.#260     // ext/mods/protection/hwid/hwid.getKey:([B)[B
  #260 = NameAndType        #261:#262     // getKey:([B)[B
  #261 = Utf8               getKey
  #262 = Utf8               ([B)[B
  #263 = Fieldref           #14.#264      // ext/mods/gameserver/network/GameClient._player:Lext/mods/gameserver/model/actor/Player;
  #264 = NameAndType        #265:#266     // _player:Lext/mods/gameserver/model/actor/Player;
  #265 = Utf8               _player
  #266 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #267 = Fieldref           #14.#268      // ext/mods/gameserver/network/GameClient._isAuthedGG:Z
  #268 = NameAndType        #269:#112     // _isAuthedGG:Z
  #269 = Utf8               _isAuthedGG
  #270 = Fieldref           #14.#271      // ext/mods/gameserver/network/GameClient._accountName:Ljava/lang/String;
  #271 = NameAndType        #272:#273     // _accountName:Ljava/lang/String;
  #272 = Utf8               _accountName
  #273 = Utf8               Ljava/lang/String;
  #274 = Fieldref           #14.#275      // ext/mods/gameserver/network/GameClient._sessionId:Lext/mods/gameserver/network/SessionKey;
  #275 = NameAndType        #276:#277     // _sessionId:Lext/mods/gameserver/network/SessionKey;
  #276 = Utf8               _sessionId
  #277 = Utf8               Lext/mods/gameserver/network/SessionKey;
  #278 = Fieldref           #14.#279      // ext/mods/gameserver/network/GameClient._realIpAddress:Ljava/lang/String;
  #279 = NameAndType        #280:#273     // _realIpAddress:Ljava/lang/String;
  #280 = Utf8               _realIpAddress
  #281 = Methodref          #160.#282     // ext/mods/commons/mmocore/MMOConnection.sendPacket:(Lext/mods/commons/mmocore/SendablePacket;)V
  #282 = NameAndType        #283:#284     // sendPacket:(Lext/mods/commons/mmocore/SendablePacket;)V
  #283 = Utf8               sendPacket
  #284 = Utf8               (Lext/mods/commons/mmocore/SendablePacket;)V
  #285 = Methodref          #286.#287     // ext/mods/gameserver/network/serverpackets/L2GameServerPacket.runImpl:()V
  #286 = Class              #288          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #287 = NameAndType        #289:#23      // runImpl:()V
  #288 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #289 = Utf8               runImpl
  #290 = Methodref          #14.#291      // ext/mods/gameserver/network/GameClient.getObjectIdForSlot:(I)I
  #291 = NameAndType        #292:#293     // getObjectIdForSlot:(I)I
  #292 = Utf8               getObjectIdForSlot
  #293 = Utf8               (I)I
  #294 = Methodref          #295.#296     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #295 = Class              #297          // ext/mods/commons/pool/ConnectionPool
  #296 = NameAndType        #157:#298     // getConnection:()Ljava/sql/Connection;
  #297 = Utf8               ext/mods/commons/pool/ConnectionPool
  #298 = Utf8               ()Ljava/sql/Connection;
  #299 = String             #300          // SELECT clanId FROM characters WHERE obj_id=?
  #300 = Utf8               SELECT clanId FROM characters WHERE obj_id=?
  #301 = InterfaceMethodref #302.#303     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #302 = Class              #304          // java/sql/Connection
  #303 = NameAndType        #305:#306     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #304 = Utf8               java/sql/Connection
  #305 = Utf8               prepareStatement
  #306 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #307 = InterfaceMethodref #308.#309     // java/sql/PreparedStatement.setInt:(II)V
  #308 = Class              #310          // java/sql/PreparedStatement
  #309 = NameAndType        #311:#312     // setInt:(II)V
  #310 = Utf8               java/sql/PreparedStatement
  #311 = Utf8               setInt
  #312 = Utf8               (II)V
  #313 = InterfaceMethodref #308.#314     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #314 = NameAndType        #315:#316     // executeQuery:()Ljava/sql/ResultSet;
  #315 = Utf8               executeQuery
  #316 = Utf8               ()Ljava/sql/ResultSet;
  #317 = InterfaceMethodref #318.#319     // java/sql/ResultSet.next:()Z
  #318 = Class              #320          // java/sql/ResultSet
  #319 = NameAndType        #321:#99      // next:()Z
  #320 = Utf8               java/sql/ResultSet
  #321 = Utf8               next
  #322 = InterfaceMethodref #318.#323     // java/sql/ResultSet.getInt:(I)I
  #323 = NameAndType        #324:#293     // getInt:(I)I
  #324 = Utf8               getInt
  #325 = Methodref          #326.#327     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #326 = Class              #328          // ext/mods/gameserver/data/sql/ClanTable
  #327 = NameAndType        #329:#330     // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #328 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #329 = Utf8               getInstance
  #330 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #331 = Methodref          #326.#332     // ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #332 = NameAndType        #333:#334     // getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
  #333 = Utf8               getClan
  #334 = Utf8               (I)Lext/mods/gameserver/model/pledge/Clan;
  #335 = Methodref          #336.#337     // ext/mods/gameserver/model/pledge/Clan.getLeaderId:()I
  #336 = Class              #338          // ext/mods/gameserver/model/pledge/Clan
  #337 = NameAndType        #339:#172     // getLeaderId:()I
  #338 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #339 = Utf8               getLeaderId
  #340 = InterfaceMethodref #318.#341     // java/sql/ResultSet.close:()V
  #341 = NameAndType        #342:#23      // close:()V
  #342 = Utf8               close
  #343 = Class              #344          // java/lang/Throwable
  #344 = Utf8               java/lang/Throwable
  #345 = Methodref          #343.#346     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #346 = NameAndType        #347:#348     // addSuppressed:(Ljava/lang/Throwable;)V
  #347 = Utf8               addSuppressed
  #348 = Utf8               (Ljava/lang/Throwable;)V
  #349 = InterfaceMethodref #308.#341     // java/sql/PreparedStatement.close:()V
  #350 = Fieldref           #67.#351      // ext/mods/Config.DELETE_DAYS:I
  #351 = NameAndType        #352:#12      // DELETE_DAYS:I
  #352 = Utf8               DELETE_DAYS
  #353 = Methodref          #14.#354      // ext/mods/gameserver/network/GameClient.deleteCharByObjId:(I)V
  #354 = NameAndType        #355:#73      // deleteCharByObjId:(I)V
  #355 = Utf8               deleteCharByObjId
  #356 = String             #357          // UPDATE characters SET deletetime=? WHERE obj_id=?
  #357 = Utf8               UPDATE characters SET deletetime=? WHERE obj_id=?
  #358 = Long               86400000l
  #360 = InterfaceMethodref #308.#361     // java/sql/PreparedStatement.setLong:(IJ)V
  #361 = NameAndType        #362:#363     // setLong:(IJ)V
  #362 = Utf8               setLong
  #363 = Utf8               (IJ)V
  #364 = InterfaceMethodref #308.#365     // java/sql/PreparedStatement.execute:()Z
  #365 = NameAndType        #366:#99      // execute:()Z
  #366 = Utf8               execute
  #367 = InterfaceMethodref #302.#341     // java/sql/Connection.close:()V
  #368 = String             #369          // Couldn\'t mark as delete a player.
  #369 = Utf8               Couldn\'t mark as delete a player.
  #370 = Methodref          #142.#371     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #371 = NameAndType        #145:#372     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #372 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #373 = String             #374          // Couldn\'t restore player.
  #374 = Utf8               Couldn\'t restore player.
  #375 = Methodref          #376.#377     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #376 = Class              #378          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #377 = NameAndType        #329:#379     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #378 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #379 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #380 = Methodref          #376.#381     // ext/mods/gameserver/data/sql/PlayerInfoTable.removePlayer:(I)V
  #381 = NameAndType        #382:#73      // removePlayer:(I)V
  #382 = Utf8               removePlayer
  #383 = Methodref          #384.#385     // ext/mods/extensions/listener/manager/GameListenerManager.getInstance:()Lext/mods/extensions/listener/manager/GameListenerManager;
  #384 = Class              #386          // ext/mods/extensions/listener/manager/GameListenerManager
  #385 = NameAndType        #329:#387     // getInstance:()Lext/mods/extensions/listener/manager/GameListenerManager;
  #386 = Utf8               ext/mods/extensions/listener/manager/GameListenerManager
  #387 = Utf8               ()Lext/mods/extensions/listener/manager/GameListenerManager;
  #388 = Methodref          #384.#389     // ext/mods/extensions/listener/manager/GameListenerManager.notifyCharacterDelete:(I)V
  #389 = NameAndType        #390:#73      // notifyCharacterDelete:(I)V
  #390 = Utf8               notifyCharacterDelete
  #391 = String             #392          // DELETE FROM character_hennas WHERE char_obj_id=?
  #392 = Utf8               DELETE FROM character_hennas WHERE char_obj_id=?
  #393 = String             #394          // DELETE FROM character_macroses WHERE char_obj_id=?
  #394 = Utf8               DELETE FROM character_macroses WHERE char_obj_id=?
  #395 = String             #396          // DELETE FROM character_memo WHERE charId=?
  #396 = Utf8               DELETE FROM character_memo WHERE charId=?
  #397 = String             #398          // DELETE FROM character_quests WHERE charId=?
  #398 = Utf8               DELETE FROM character_quests WHERE charId=?
  #399 = String             #400          // DELETE FROM character_recipebook WHERE charId=?
  #400 = Utf8               DELETE FROM character_recipebook WHERE charId=?
  #401 = String             #402          // DELETE FROM character_relations WHERE char_id=? OR friend_id=?
  #402 = Utf8               DELETE FROM character_relations WHERE char_id=? OR friend_id=?
  #403 = String             #404          // DELETE FROM character_shortcuts WHERE char_obj_id=?
  #404 = Utf8               DELETE FROM character_shortcuts WHERE char_obj_id=?
  #405 = String             #406          // DELETE FROM character_skills WHERE char_obj_id=?
  #406 = Utf8               DELETE FROM character_skills WHERE char_obj_id=?
  #407 = String             #408          // DELETE FROM character_skills_save WHERE char_obj_id=?
  #408 = Utf8               DELETE FROM character_skills_save WHERE char_obj_id=?
  #409 = String             #410          // DELETE FROM character_subclasses WHERE char_obj_id=?
  #410 = Utf8               DELETE FROM character_subclasses WHERE char_obj_id=?
  #411 = String             #412          // DELETE FROM heroes WHERE char_id=?
  #412 = Utf8               DELETE FROM heroes WHERE char_id=?
  #413 = String             #414          // DELETE FROM olympiad_nobles WHERE char_id=?
  #414 = Utf8               DELETE FROM olympiad_nobles WHERE char_id=?
  #415 = String             #416          // DELETE FROM seven_signs WHERE char_obj_id=?
  #416 = Utf8               DELETE FROM seven_signs WHERE char_obj_id=?
  #417 = String             #418          // DELETE FROM pets WHERE item_obj_id IN (SELECT object_id FROM items WHERE items.owner_id=?)
  #418 = Utf8               DELETE FROM pets WHERE item_obj_id IN (SELECT object_id FROM items WHERE items.owner_id=?)
  #419 = String             #420          // DELETE FROM augmentations WHERE item_oid IN (SELECT object_id FROM items WHERE items.owner_id=?)
  #420 = Utf8               DELETE FROM augmentations WHERE item_oid IN (SELECT object_id FROM items WHERE items.owner_id=?)
  #421 = String             #422          // DELETE FROM items WHERE owner_id=?
  #422 = Utf8               DELETE FROM items WHERE owner_id=?
  #423 = String             #424          // DELETE FROM character_raid_points WHERE char_id=?
  #424 = Utf8               DELETE FROM character_raid_points WHERE char_id=?
  #425 = String             #426          // DELETE FROM characters WHERE obj_Id=?
  #426 = Utf8               DELETE FROM characters WHERE obj_Id=?
  #427 = String             #428          // DELETE FROM character_data WHERE charId=?
  #428 = Utf8               DELETE FROM character_data WHERE charId=?
  #429 = String             #430          // Couldn\'t delete player.
  #430 = Utf8               Couldn\'t delete player.
  #431 = Methodref          #432.#433     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #432 = Class              #434          // ext/mods/gameserver/model/World
  #433 = NameAndType        #329:#435     // getInstance:()Lext/mods/gameserver/model/World;
  #434 = Utf8               ext/mods/gameserver/model/World
  #435 = Utf8               ()Lext/mods/gameserver/model/World;
  #436 = Methodref          #432.#437     // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #437 = NameAndType        #192:#438     // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #438 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #439 = Methodref          #195.#440     // ext/mods/gameserver/model/actor/Player.restore:(I)Lext/mods/gameserver/model/actor/Player;
  #440 = NameAndType        #441:#438     // restore:(I)Lext/mods/gameserver/model/actor/Player;
  #441 = Utf8               restore
  #442 = Methodref          #443.#444     // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #443 = Class              #445          // ext/mods/Safedisconect/SafeDisconnectManager
  #444 = NameAndType        #329:#446     // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #445 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
  #446 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
  #447 = Methodref          #443.#448     // ext/mods/Safedisconect/SafeDisconnectManager.prepareReconnect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)Z
  #448 = NameAndType        #449:#450     // prepareReconnect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)Z
  #449 = Utf8               prepareReconnect
  #450 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)Z
  #451 = Methodref          #443.#452     // ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #452 = NameAndType        #453:#454     // isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
  #453 = Utf8               isSafeDisconnectActive
  #454 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #455 = String             #456          // SafeDisconnect active for {}, skipping detach/delete during reconnect.
  #456 = Utf8               SafeDisconnect active for {}, skipping detach/delete during reconnect.
  #457 = Methodref          #142.#458     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #458 = NameAndType        #459:#244     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #459 = Utf8               info
  #460 = Methodref          #195.#461     // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #461 = NameAndType        #462:#463     // getClient:()Lext/mods/gameserver/network/GameClient;
  #462 = Utf8               getClient
  #463 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #464 = Methodref          #14.#465      // ext/mods/gameserver/network/GameClient.closeNow:()V
  #465 = NameAndType        #466:#23      // closeNow:()V
  #466 = Utf8               closeNow
  #467 = Methodref          #195.#468     // ext/mods/gameserver/model/actor/Player.deleteMe:()V
  #468 = NameAndType        #469:#23      // deleteMe:()V
  #469 = Utf8               deleteMe
  #470 = Fieldref           #14.#471      // ext/mods/gameserver/network/GameClient._slots:[Lext/mods/gameserver/model/CharSelectSlot;
  #471 = NameAndType        #472:#473     // _slots:[Lext/mods/gameserver/model/CharSelectSlot;
  #472 = Utf8               _slots
  #473 = Utf8               [Lext/mods/gameserver/model/CharSelectSlot;
  #474 = Methodref          #160.#475     // ext/mods/commons/mmocore/MMOConnection.close:(Lext/mods/commons/mmocore/SendablePacket;)V
  #475 = NameAndType        #342:#284     // close:(Lext/mods/commons/mmocore/SendablePacket;)V
  #476 = Methodref          #255.#477     // ext/mods/protection/hwid/hwid.removePlayer:(Lext/mods/gameserver/network/GameClient;)V
  #477 = NameAndType        #382:#478     // removePlayer:(Lext/mods/gameserver/network/GameClient;)V
  #478 = Utf8               (Lext/mods/gameserver/network/GameClient;)V
  #479 = Methodref          #14.#480      // ext/mods/gameserver/network/GameClient.getCharSelectSlot:(I)Lext/mods/gameserver/model/CharSelectSlot;
  #480 = NameAndType        #481:#482     // getCharSelectSlot:(I)Lext/mods/gameserver/model/CharSelectSlot;
  #481 = Utf8               getCharSelectSlot
  #482 = Utf8               (I)Lext/mods/gameserver/model/CharSelectSlot;
  #483 = Methodref          #484.#485     // ext/mods/gameserver/model/CharSelectSlot.getObjectId:()I
  #484 = Class              #486          // ext/mods/gameserver/model/CharSelectSlot
  #485 = NameAndType        #487:#172     // getObjectId:()I
  #486 = Utf8               ext/mods/gameserver/model/CharSelectSlot
  #487 = Utf8               getObjectId
  #488 = Fieldref           #489.#490     // ext/mods/gameserver/network/serverpackets/ServerClose.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ServerClose;
  #489 = Class              #491          // ext/mods/gameserver/network/serverpackets/ServerClose
  #490 = NameAndType        #492:#493     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ServerClose;
  #491 = Utf8               ext/mods/gameserver/network/serverpackets/ServerClose
  #492 = Utf8               STATIC_PACKET
  #493 = Utf8               Lext/mods/gameserver/network/serverpackets/ServerClose;
  #494 = Methodref          #14.#495      // ext/mods/gameserver/network/GameClient.close:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #495 = NameAndType        #342:#496     // close:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #496 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #497 = Fieldref           #14.#498      // ext/mods/gameserver/network/GameClient._cleanupTask:Ljava/util/concurrent/ScheduledFuture;
  #498 = NameAndType        #499:#95      // _cleanupTask:Ljava/util/concurrent/ScheduledFuture;
  #499 = Utf8               _cleanupTask
  #500 = InterfaceMethodref #501.#502     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #501 = Class              #503          // java/util/concurrent/ScheduledFuture
  #502 = NameAndType        #504:#505     // cancel:(Z)Z
  #503 = Utf8               java/util/concurrent/ScheduledFuture
  #504 = Utf8               cancel
  #505 = Utf8               (Z)Z
  #506 = Class              #507          // ext/mods/gameserver/network/GameClient$CleanupTask
  #507 = Utf8               ext/mods/gameserver/network/GameClient$CleanupTask
  #508 = Methodref          #506.#509     // ext/mods/gameserver/network/GameClient$CleanupTask."<init>":(Lext/mods/gameserver/network/GameClient;)V
  #509 = NameAndType        #5:#478       // "<init>":(Lext/mods/gameserver/network/GameClient;)V
  #510 = Methodref          #87.#511      // ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #511 = NameAndType        #512:#513     // scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #512 = Utf8               scheduleIO
  #513 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #514 = Long               100l
  #516 = Long               15000l
  #518 = Methodref          #64.#519      // java/util/concurrent/ArrayBlockingQueue.size:()I
  #519 = NameAndType        #520:#172     // size:()I
  #520 = Utf8               size
  #521 = Methodref          #57.#522      // ext/mods/gameserver/network/ClientStats.countPacket:(I)Z
  #522 = NameAndType        #523:#154     // countPacket:(I)Z
  #523 = Utf8               countPacket
  #524 = Fieldref           #525.#526     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #525 = Class              #527          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #526 = NameAndType        #492:#528     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #527 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #528 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #529 = Methodref          #14.#530      // ext/mods/gameserver/network/GameClient.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #530 = NameAndType        #283:#496     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #531 = Methodref          #57.#532      // ext/mods/gameserver/network/ClientStats.dropPacket:()Z
  #532 = NameAndType        #533:#99      // dropPacket:()Z
  #533 = Utf8               dropPacket
  #534 = Fieldref           #67.#535      // ext/mods/Config.PACKET_HANDLER_DEBUG:Z
  #535 = NameAndType        #536:#112     // PACKET_HANDLER_DEBUG:Z
  #536 = Utf8               PACKET_HANDLER_DEBUG
  #537 = String             #538          // {} has been disconnected: too many buffer underflows in non-authed state.
  #538 = Utf8               {} has been disconnected: too many buffer underflows in non-authed state.
  #539 = Methodref          #142.#540     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #540 = NameAndType        #541:#244     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #541 = Utf8               warn
  #542 = Methodref          #57.#543      // ext/mods/gameserver/network/ClientStats.countUnderflowException:()Z
  #543 = NameAndType        #544:#99      // countUnderflowException:()Z
  #544 = Utf8               countUnderflowException
  #545 = String             #546          // {} has been disconnected: too many buffer underflows.
  #546 = Utf8               {} has been disconnected: too many buffer underflows.
  #547 = String             #548          // {} has been disconnected: too many unknown packets in non-authed state.
  #548 = Utf8               {} has been disconnected: too many unknown packets in non-authed state.
  #549 = Methodref          #57.#550      // ext/mods/gameserver/network/ClientStats.countUnknownPacket:()Z
  #550 = NameAndType        #551:#99      // countUnknownPacket:()Z
  #551 = Utf8               countUnknownPacket
  #552 = String             #553          // {} has been disconnected: too many unknown packets.
  #553 = Utf8               {} has been disconnected: too many unknown packets.
  #554 = Methodref          #57.#555      // ext/mods/gameserver/network/ClientStats.countFloods:()Z
  #555 = NameAndType        #556:#99      // countFloods:()Z
  #556 = Utf8               countFloods
  #557 = String             #558          // {} has been disconnected: too many floods ({} long and {} short).
  #558 = Utf8               {} has been disconnected: too many floods ({} long and {} short).
  #559 = Fieldref           #57.#560      // ext/mods/gameserver/network/ClientStats.longFloods:I
  #560 = NameAndType        #561:#12      // longFloods:I
  #561 = Utf8               longFloods
  #562 = Methodref          #563.#564     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #563 = Class              #565          // java/lang/Integer
  #564 = NameAndType        #566:#567     // valueOf:(I)Ljava/lang/Integer;
  #565 = Utf8               java/lang/Integer
  #566 = Utf8               valueOf
  #567 = Utf8               (I)Ljava/lang/Integer;
  #568 = Fieldref           #57.#569      // ext/mods/gameserver/network/ClientStats.shortFloods:I
  #569 = NameAndType        #570:#12      // shortFloods:I
  #570 = Utf8               shortFloods
  #571 = Methodref          #64.#572      // java/util/concurrent/ArrayBlockingQueue.offer:(Ljava/lang/Object;)Z
  #572 = NameAndType        #573:#574     // offer:(Ljava/lang/Object;)Z
  #573 = Utf8               offer
  #574 = Utf8               (Ljava/lang/Object;)Z
  #575 = Methodref          #57.#576      // ext/mods/gameserver/network/ClientStats.countQueueOverflow:()Z
  #576 = NameAndType        #577:#99      // countQueueOverflow:()Z
  #577 = Utf8               countQueueOverflow
  #578 = String             #579          // {} has been disconnected: too many queue overflows.
  #579 = Utf8               {} has been disconnected: too many queue overflows.
  #580 = Methodref          #19.#581      // java/util/concurrent/locks/ReentrantLock.isLocked:()Z
  #581 = NameAndType        #582:#99      // isLocked:()Z
  #582 = Utf8               isLocked
  #583 = Fieldref           #57.#584      // ext/mods/gameserver/network/ClientStats.processedPackets:I
  #584 = NameAndType        #585:#12      // processedPackets:I
  #585 = Utf8               processedPackets
  #586 = String             #587          // {} has been disconnected: too many packets in non-authed state.
  #587 = Utf8               {} has been disconnected: too many packets in non-authed state.
  #588 = Methodref          #8.#589       // ext/mods/gameserver/enums/FloodProtector.getReuseDelay:()I
  #589 = NameAndType        #590:#172     // getReuseDelay:()I
  #590 = Utf8               getReuseDelay
  #591 = Methodref          #41.#592      // java/lang/System.nanoTime:()J
  #592 = NameAndType        #593:#45      // nanoTime:()J
  #593 = Utf8               nanoTime
  #594 = Methodref          #8.#595       // ext/mods/gameserver/enums/FloodProtector.getId:()I
  #595 = NameAndType        #596:#172     // getId:()I
  #596 = Utf8               getId
  #597 = Long               1000000l
  #599 = Methodref          #195.#600     // ext/mods/gameserver/model/actor/Player.isRunning:()Z
  #600 = NameAndType        #601:#99      // isRunning:()Z
  #601 = Utf8               isRunning
  #602 = Methodref          #195.#603     // ext/mods/gameserver/model/actor/Player.sitDown:()Z
  #603 = NameAndType        #604:#99      // sitDown:()Z
  #604 = Utf8               sitDown
  #605 = Methodref          #195.#606     // ext/mods/gameserver/model/actor/Player.setOnlineStatus:(ZZ)V
  #606 = NameAndType        #607:#608     // setOnlineStatus:(ZZ)V
  #607 = Utf8               setOnlineStatus
  #608 = Utf8               (ZZ)V
  #609 = Methodref          #432.#610     // ext/mods/gameserver/model/World.addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #610 = NameAndType        #611:#612     // addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #611 = Utf8               addPlayer
  #612 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #613 = Methodref          #14.#614      // ext/mods/gameserver/network/GameClient.setDetached:(Z)V
  #614 = NameAndType        #615:#616     // setDetached:(Z)V
  #615 = Utf8               setDetached
  #616 = Utf8               (Z)V
  #617 = Methodref          #195.#618     // ext/mods/gameserver/model/actor/Player.setClient:(Lext/mods/gameserver/network/GameClient;)V
  #618 = NameAndType        #619:#478     // setClient:(Lext/mods/gameserver/network/GameClient;)V
  #619 = Utf8               setClient
  #620 = Methodref          #14.#621      // ext/mods/gameserver/network/GameClient.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #621 = NameAndType        #622:#612     // setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #622 = Utf8               setPlayer
  #623 = Methodref          #195.#185     // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
  #624 = Methodref          #14.#625      // ext/mods/gameserver/network/GameClient.setAccountName:(Ljava/lang/String;)V
  #625 = NameAndType        #626:#208     // setAccountName:(Ljava/lang/String;)V
  #626 = Utf8               setAccountName
  #627 = Fieldref           #32.#628      // ext/mods/gameserver/network/GameClient$GameClientState.IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
  #628 = NameAndType        #629:#36      // IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
  #629 = Utf8               IN_GAME
  #630 = Methodref          #14.#631      // ext/mods/gameserver/network/GameClient.setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
  #631 = NameAndType        #632:#633     // setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
  #632 = Utf8               setState
  #633 = Utf8               (Lext/mods/gameserver/network/GameClient$GameClientState;)V
  #634 = Methodref          #195.#635     // ext/mods/gameserver/model/actor/Player.spawnMe:()V
  #635 = NameAndType        #636:#23      // spawnMe:()V
  #636 = Utf8               spawnMe
  #637 = Methodref          #638.#639     // ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
  #638 = Class              #640          // ext/mods/gameserver/LoginServerThread
  #639 = NameAndType        #329:#641     // getInstance:()Lext/mods/gameserver/LoginServerThread;
  #640 = Utf8               ext/mods/gameserver/LoginServerThread
  #641 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #642 = Methodref          #638.#643     // ext/mods/gameserver/LoginServerThread.addClient:(Ljava/lang/String;Lext/mods/gameserver/network/GameClient;)V
  #643 = NameAndType        #644:#645     // addClient:(Ljava/lang/String;Lext/mods/gameserver/network/GameClient;)V
  #644 = Utf8               addClient
  #645 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/GameClient;)V
  #646 = Fieldref           #14.#647      // ext/mods/gameserver/network/GameClient._playerName:Ljava/lang/String;
  #647 = NameAndType        #648:#273     // _playerName:Ljava/lang/String;
  #648 = Utf8               _playerName
  #649 = Fieldref           #14.#650      // ext/mods/gameserver/network/GameClient._playerId:I
  #650 = NameAndType        #651:#12      // _playerId:I
  #651 = Utf8               _playerId
  #652 = Fieldref           #14.#653      // ext/mods/gameserver/network/GameClient._count:I
  #653 = NameAndType        #654:#12      // _count:I
  #654 = Utf8               _count
  #655 = Fieldref           #14.#656      // ext/mods/gameserver/network/GameClient._hwid:Ljava/lang/String;
  #656 = NameAndType        #657:#273     // _hwid:Ljava/lang/String;
  #657 = Utf8               _hwid
  #658 = Fieldref           #14.#659      // ext/mods/gameserver/network/GameClient._revision:I
  #659 = NameAndType        #660:#12      // _revision:I
  #660 = Utf8               _revision
  #661 = Fieldref           #14.#662      // ext/mods/gameserver/network/GameClient._loginName:Ljava/lang/String;
  #662 = NameAndType        #663:#273     // _loginName:Ljava/lang/String;
  #663 = Utf8               _loginName
  #664 = Methodref          #14.#665      // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #665 = NameAndType        #666:#99      // isDetached:()Z
  #666 = Utf8               isDetached
  #667 = Methodref          #668.#669     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #668 = Class              #670          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #669 = NameAndType        #329:#671     // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #670 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #671 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #672 = Methodref          #195.#485     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #673 = Methodref          #668.#674     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
  #674 = NameAndType        #675:#154     // isPlayerParticipant:(I)Z
  #675 = Utf8               isPlayerParticipant
  #676 = Methodref          #668.#677     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #677 = NameAndType        #678:#99      // isStarted:()Z
  #678 = Utf8               isStarted
  #679 = Methodref          #668.#680     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #680 = NameAndType        #681:#612     // onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #681 = Utf8               onLogout
  #682 = Methodref          #683.#684     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #683 = Class              #685          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #684 = NameAndType        #329:#686     // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #685 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #686 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #687 = Methodref          #683.#674     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #688 = Methodref          #683.#677     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #689 = Methodref          #683.#680     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #690 = Methodref          #691.#692     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #691 = Class              #693          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #692 = NameAndType        #329:#694     // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #693 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #694 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #695 = Methodref          #691.#674     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #696 = Methodref          #691.#677     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #697 = Methodref          #691.#680     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #698 = Methodref          #699.#700     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #699 = Class              #701          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #700 = NameAndType        #329:#702     // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #701 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #702 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #703 = Methodref          #699.#674     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #704 = Methodref          #699.#677     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #705 = Methodref          #699.#680     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #706 = Methodref          #707.#708     // ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
  #707 = Class              #709          // ext/mods/gameserver/data/sql/OfflineTradersTable
  #708 = NameAndType        #710:#454     // offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
  #709 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable
  #710 = Utf8               offlineMode
  #711 = Methodref          #195.#712     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #712 = NameAndType        #713:#714     // getParty:()Lext/mods/gameserver/model/group/Party;
  #713 = Utf8               getParty
  #714 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #715 = Fieldref           #716.#717     // ext/mods/gameserver/enums/MessageType.EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #716 = Class              #718          // ext/mods/gameserver/enums/MessageType
  #717 = NameAndType        #719:#720     // EXPELLED:Lext/mods/gameserver/enums/MessageType;
  #718 = Utf8               ext/mods/gameserver/enums/MessageType
  #719 = Utf8               EXPELLED
  #720 = Utf8               Lext/mods/gameserver/enums/MessageType;
  #721 = Methodref          #722.#723     // ext/mods/gameserver/model/group/Party.removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #722 = Class              #724          // ext/mods/gameserver/model/group/Party
  #723 = NameAndType        #725:#726     // removePartyMember:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #724 = Utf8               ext/mods/gameserver/model/group/Party
  #725 = Utf8               removePartyMember
  #726 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/MessageType;)V
  #727 = Methodref          #728.#729     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #728 = Class              #730          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #729 = NameAndType        #329:#731     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #730 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #731 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #732 = Methodref          #728.#733     // ext/mods/gameserver/model/olympiad/OlympiadManager.unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
  #733 = NameAndType        #734:#454     // unRegisterNoble:(Lext/mods/gameserver/model/actor/Player;)Z
  #734 = Utf8               unRegisterNoble
  #735 = Methodref          #736.#737     // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #736 = Class              #738          // ext/mods/gameserver/data/manager/AntiFeedManager
  #737 = NameAndType        #329:#739     // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #738 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
  #739 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #740 = Methodref          #736.#741     // ext/mods/gameserver/data/manager/AntiFeedManager.onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
  #741 = NameAndType        #742:#478     // onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
  #742 = Utf8               onDisconnect
  #743 = Methodref          #195.#744     // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #744 = NameAndType        #745:#746     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #745 = Utf8               getSummon
  #746 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #747 = Methodref          #748.#749     // ext/mods/gameserver/model/actor/Summon.doRevive:()V
  #748 = Class              #750          // ext/mods/gameserver/model/actor/Summon
  #749 = NameAndType        #751:#23      // doRevive:()V
  #750 = Utf8               ext/mods/gameserver/model/actor/Summon
  #751 = Utf8               doRevive
  #752 = Methodref          #748.#753     // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #753 = NameAndType        #754:#612     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #754 = Utf8               unSummon
  #755 = Fieldref           #67.#756      // ext/mods/Config.OFFLINE_SLEEP_EFFECT:Z
  #756 = NameAndType        #757:#112     // OFFLINE_SLEEP_EFFECT:Z
  #757 = Utf8               OFFLINE_SLEEP_EFFECT
  #758 = String             #759          // 0x80
  #759 = Utf8               0x80
  #760 = Methodref          #563.#761     // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #761 = NameAndType        #762:#763     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #762 = Utf8               decode
  #763 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #764 = Methodref          #563.#765     // java/lang/Integer.intValue:()I
  #765 = NameAndType        #766:#172     // intValue:()I
  #766 = Utf8               intValue
  #767 = Methodref          #195.#768     // ext/mods/gameserver/model/actor/Player.startAbnormalEffect:(I)V
  #768 = NameAndType        #769:#73      // startAbnormalEffect:(I)V
  #769 = Utf8               startAbnormalEffect
  #770 = Methodref          #195.#771     // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #771 = NameAndType        #772:#23      // broadcastUserInfo:()V
  #772 = Utf8               broadcastUserInfo
  #773 = Methodref          #195.#774     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #774 = NameAndType        #333:#775     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #775 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #776 = Methodref          #336.#777     // ext/mods/gameserver/model/pledge/Clan.broadcastClanStatus:()V
  #777 = NameAndType        #778:#23      // broadcastClanStatus:()V
  #778 = Utf8               broadcastClanStatus
  #779 = Methodref          #195.#780     // ext/mods/gameserver/model/actor/Player.getOfflineStartTime:()J
  #780 = NameAndType        #781:#45      // getOfflineStartTime:()J
  #781 = Utf8               getOfflineStartTime
  #782 = Methodref          #195.#783     // ext/mods/gameserver/model/actor/Player.setOfflineStartTime:(J)V
  #783 = NameAndType        #784:#785     // setOfflineStartTime:(J)V
  #784 = Utf8               setOfflineStartTime
  #785 = Utf8               (J)V
  #786 = Methodref          #443.#787     // ext/mods/Safedisconect/SafeDisconnectManager.handleDisconnect:(Lext/mods/gameserver/network/GameClient;)Z
  #787 = NameAndType        #788:#789     // handleDisconnect:(Lext/mods/gameserver/network/GameClient;)Z
  #788 = Utf8               handleDisconnect
  #789 = Utf8               (Lext/mods/gameserver/network/GameClient;)Z
  #790 = Methodref          #195.#791     // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #791 = NameAndType        #792:#99      // isInCombat:()Z
  #792 = Utf8               isInCombat
  #793 = Methodref          #195.#581     // ext/mods/gameserver/model/actor/Player.isLocked:()Z
  #794 = Methodref          #14.#795      // ext/mods/gameserver/network/GameClient.cleanMe:(Z)V
  #795 = NameAndType        #796:#616     // cleanMe:(Z)V
  #796 = Utf8               cleanMe
  #797 = InvokeDynamic      #5:#79        // #5:run:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
  #798 = Methodref          #195.#799     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #799 = NameAndType        #800:#99      // isOnline:()Z
  #800 = Utf8               isOnline
  #801 = Methodref          #195.#802     // ext/mods/gameserver/model/actor/Player.store:()V
  #802 = NameAndType        #803:#23      // store:()V
  #803 = Utf8               store
  #804 = Methodref          #748.#802     // ext/mods/gameserver/model/actor/Summon.store:()V
  #805 = Methodref          #133.#196     // java/lang/Class.getName:()Ljava/lang/String;
  #806 = Methodref          #142.#207     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #807 = Class              #808          // java/lang/Runnable
  #808 = Utf8               java/lang/Runnable
  #809 = Utf8               SELECT_CLAN
  #810 = Utf8               ConstantValue
  #811 = Utf8               UPDATE_DELETE_TIME
  #812 = Utf8               DELETE_CHAR_HENNAS
  #813 = Utf8               DELETE_CHAR_MACROS
  #814 = Utf8               DELETE_CHAR_MEMOS
  #815 = Utf8               DELETE_CHAR_QUESTS
  #816 = Utf8               DELETE_CHAR_RECIPES
  #817 = Utf8               DELETE_CHAR_RELATIONS
  #818 = Utf8               DELETE_CHAR_SHORTCUTS
  #819 = Utf8               DELETE_CHAR_SKILLS
  #820 = Utf8               DELETE_CHAR_SKILLS_SAVE
  #821 = Utf8               DELETE_CHAR_SUBCLASSES
  #822 = Utf8               DELETE_CHAR_HERO
  #823 = Utf8               DELETE_CHAR_NOBLE
  #824 = Utf8               DELETE_CHAR_SEVEN_SIGNS
  #825 = Utf8               DELETE_CHAR_PETS
  #826 = Utf8               DELETE_CHAR_AUGMENTS
  #827 = Utf8               DELETE_CHAR_ITEMS
  #828 = Utf8               DELETE_CHAR_RBP
  #829 = Utf8               DELETE_CHAR
  #830 = Utf8               DELETE_CHAR_CACHE
  #831 = Utf8               Signature
  #832 = Utf8               Ljava/util/concurrent/ArrayBlockingQueue<Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;>;
  #833 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #834 = Utf8               Code
  #835 = Utf8               LineNumberTable
  #836 = Utf8               LocalVariableTable
  #837 = Utf8               this
  #838 = Utf8               Lext/mods/gameserver/network/GameClient;
  #839 = Utf8               con
  #840 = Utf8               Lext/mods/commons/mmocore/MMOConnection;
  #841 = Utf8               LocalVariableTypeTable
  #842 = Utf8               Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;
  #843 = Utf8               (Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;)V
  #844 = Utf8               e
  #845 = Utf8               Ljava/lang/Exception;
  #846 = Utf8               count
  #847 = Utf8               packet
  #848 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket;
  #849 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
  #850 = Utf8               StackMapTable
  #851 = Utf8               address
  #852 = Utf8               Ljava/net/InetAddress;
  #853 = Utf8               Ljava/lang/NullPointerException;
  #854 = Class              #855          // java/lang/String
  #855 = Utf8               java/lang/String
  #856 = Utf8               (Ljava/nio/ByteBuffer;I)Z
  #857 = Utf8               buf
  #858 = Utf8               Ljava/nio/ByteBuffer;
  #859 = Utf8               onDisconnection
  #860 = Utf8               onForcedDisconnection
  #861 = Utf8               enableCrypt
  #862 = Utf8               key
  #863 = Utf8               [B
  #864 = Class              #863          // "[B"
  #865 = Utf8               pState
  #866 = Utf8               getConnectionStartTime
  #867 = Utf8               player
  #868 = Utf8               getActiveCharLock
  #869 = Utf8               ()Ljava/util/concurrent/locks/ReentrantLock;
  #870 = Utf8               getFloodProtectors
  #871 = Utf8               ()[J
  #872 = Utf8               setGameGuardOk
  #873 = Utf8               val
  #874 = Utf8               pAccountName
  #875 = Utf8               setSessionId
  #876 = Utf8               (Lext/mods/gameserver/network/SessionKey;)V
  #877 = Utf8               sk
  #878 = Utf8               getSessionId
  #879 = Utf8               ()Lext/mods/gameserver/network/SessionKey;
  #880 = Utf8               getRealIpAddress
  #881 = Utf8               setRealIpAddress
  #882 = Utf8               realIpAddress
  #883 = Utf8               gsp
  #884 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #885 = Utf8               b
  #886 = Utf8               markToDeleteChar
  #887 = Utf8               (I)B
  #888 = Utf8               clan
  #889 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #890 = Utf8               clanId
  #891 = Utf8               rs
  #892 = Utf8               Ljava/sql/ResultSet;
  #893 = Utf8               ps
  #894 = Utf8               Ljava/sql/PreparedStatement;
  #895 = Utf8               Ljava/sql/Connection;
  #896 = Utf8               slot
  #897 = Utf8               objectId
  #898 = Utf8               answer
  #899 = Utf8               B
  #900 = Utf8               markRestoredChar
  #901 = Utf8               loadCharFromDisk
  #902 = Utf8               id
  #903 = Utf8               setCharSelectSlot
  #904 = Utf8               ([Lext/mods/gameserver/model/CharSelectSlot;)V
  #905 = Utf8               list
  #906 = Utf8               Lext/mods/gameserver/model/CharSelectSlot;
  #907 = Utf8               fast
  #908 = Utf8               onBufferUnderflow
  #909 = Utf8               onUnknownPacket
  #910 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket;)V
  #911 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;)V
  #912 = Utf8               performAction
  #913 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
  #914 = Utf8               fp
  #915 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
  #916 = Utf8               reuseDelay
  #917 = Utf8               currentTime
  #918 = Utf8               value
  #919 = Class              #18           // "[J"
  #920 = Utf8               spawnOffline
  #921 = Utf8               getPlayerName
  #922 = Utf8               setPlayerName
  #923 = Utf8               name
  #924 = Utf8               setPlayerId
  #925 = Utf8               plId
  #926 = Utf8               getPlayerId
  #927 = Utf8               getCount
  #928 = Utf8               setCount
  #929 = Utf8               getHWID
  #930 = Utf8               setHWID
  #931 = Utf8               hwid
  #932 = Utf8               setRevision
  #933 = Utf8               revision
  #934 = Utf8               getRevision
  #935 = Utf8               getLoginName
  #936 = Utf8               setLoginName
  #937 = Utf8               lambda$onDisconnection$0
  #938 = Utf8               summon
  #939 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #940 = Utf8               lambda$new$0
  #941 = Utf8               lambda$new$1
  #942 = Utf8               <clinit>
  #943 = Utf8               Lext/mods/commons/mmocore/MMOClient<Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;>;Ljava/lang/Runnable;
  #944 = Utf8               SourceFile
  #945 = Utf8               GameClient.java
  #946 = Utf8               NestMembers
  #947 = Utf8               BootstrapMethods
  #948 = MethodType         #23           //  ()V
  #949 = MethodHandle       5:#950        // REF_invokeVirtual ext/mods/gameserver/network/GameClient.lambda$new$0:()V
  #950 = Methodref          #14.#951      // ext/mods/gameserver/network/GameClient.lambda$new$0:()V
  #951 = NameAndType        #940:#23      // lambda$new$0:()V
  #952 = String             #953          // [IP: \u0001]
  #953 = Utf8               [IP: \u0001]
  #954 = String             #955          // [Account: \u0001 - IP: \u0001]
  #955 = Utf8               [Account: \u0001 - IP: \u0001]
  #956 = String             #957          // [Character: \u0001 - Account: \u0001 - IP: \u0001]
  #957 = Utf8               [Character: \u0001 - Account: \u0001 - IP: \u0001]
  #958 = MethodHandle       5:#959        // REF_invokeVirtual ext/mods/gameserver/network/GameClient.lambda$onDisconnection$0:()V
  #959 = Methodref          #14.#960      // ext/mods/gameserver/network/GameClient.lambda$onDisconnection$0:()V
  #960 = NameAndType        #937:#23      // lambda$onDisconnection$0:()V
  #961 = MethodHandle       5:#962        // REF_invokeVirtual ext/mods/gameserver/network/GameClient.lambda$new$1:()V
  #962 = Methodref          #14.#963      // ext/mods/gameserver/network/GameClient.lambda$new$1:()V
  #963 = NameAndType        #941:#23      // lambda$new$1:()V
  #964 = MethodHandle       6:#965        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #965 = Methodref          #966.#967     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #966 = Class              #968          // java/lang/invoke/LambdaMetafactory
  #967 = NameAndType        #969:#970     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #968 = Utf8               java/lang/invoke/LambdaMetafactory
  #969 = Utf8               metafactory
  #970 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #971 = MethodHandle       6:#972        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #972 = Methodref          #973.#974     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #973 = Class              #975          // java/lang/invoke/StringConcatFactory
  #974 = NameAndType        #182:#976     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #975 = Utf8               java/lang/invoke/StringConcatFactory
  #976 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #977 = Utf8               InnerClasses
  #978 = Utf8               GameClientState
  #979 = Utf8               CleanupTask
  #980 = Class              #981          // java/lang/invoke/MethodHandles$Lookup
  #981 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #982 = Class              #983          // java/lang/invoke/MethodHandles
  #983 = Utf8               java/lang/invoke/MethodHandles
  #984 = Utf8               Lookup
{
  protected final java.util.concurrent.ScheduledFuture<?> _autoSaveInDB;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #833                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected java.util.concurrent.ScheduledFuture<?> _cleanupTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #833                         // Ljava/util/concurrent/ScheduledFuture<*>;

  public ext.mods.gameserver.network.GameClient(ext.mods.commons.mmocore.MMOConnection<ext.mods.gameserver.network.GameClient>);
    descriptor: (Lext/mods/commons/mmocore/MMOConnection;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/commons/mmocore/MMOClient."<init>":(Lext/mods/commons/mmocore/MMOConnection;)V
         5: aload_0
         6: getstatic     #7                  // Field ext/mods/gameserver/enums/FloodProtector.VALUES_LENGTH:I
         9: newarray       long
        11: putfield      #13                 // Field _floodProtectors:[J
        14: aload_0
        15: new           #19                 // class java/util/concurrent/locks/ReentrantLock
        18: dup
        19: invokespecial #21                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
        22: putfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
        25: aload_0
        26: new           #19                 // class java/util/concurrent/locks/ReentrantLock
        29: dup
        30: invokespecial #21                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
        33: putfield      #28                 // Field _activeCharLock:Ljava/util/concurrent/locks/ReentrantLock;
        36: aload_0
        37: getstatic     #31                 // Field ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
        40: putfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
        43: aload_0
        44: invokestatic  #40                 // Method java/lang/System.currentTimeMillis:()J
        47: putfield      #46                 // Field _connectionStartTime:J
        50: aload_0
        51: new           #50                 // class ext/mods/gameserver/network/GameCrypt
        54: dup
        55: invokespecial #52                 // Method ext/mods/gameserver/network/GameCrypt."<init>":()V
        58: putfield      #53                 // Field _crypt:Lext/mods/gameserver/network/GameCrypt;
        61: aload_0
        62: new           #57                 // class ext/mods/gameserver/network/ClientStats
        65: dup
        66: invokespecial #59                 // Method ext/mods/gameserver/network/ClientStats."<init>":()V
        69: putfield      #60                 // Field _stats:Lext/mods/gameserver/network/ClientStats;
        72: aload_0
        73: new           #64                 // class java/util/concurrent/ArrayBlockingQueue
        76: dup
        77: getstatic     #66                 // Field ext/mods/Config.CLIENT_PACKET_QUEUE_SIZE:I
        80: invokespecial #71                 // Method java/util/concurrent/ArrayBlockingQueue."<init>":(I)V
        83: putfield      #74                 // Field _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
        86: aload_0
        87: aload_0
        88: invokedynamic #78,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
        93: ldc2_w        #82                 // long 300000l
        96: ldc2_w        #84                 // long 900000l
        99: invokestatic  #86                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       102: putfield      #92                 // Field _autoSaveInDB:Ljava/util/concurrent/ScheduledFuture;
       105: return
      LineNumberTable:
        line 127: 0
        line 101: 5
        line 103: 14
        line 104: 25
        line 129: 36
        line 130: 43
        line 131: 50
        line 132: 61
        line 133: 72
        line 135: 86
        line 148: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     106     0  this   Lext/mods/gameserver/network/GameClient;
            0     106     1   con   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     106     1   con   Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;
    Signature: #843                         // (Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;)V

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
         4: invokevirtual #96                 // Method java/util/concurrent/locks/ReentrantLock.tryLock:()Z
         7: ifne          11
        10: return
        11: iconst_0
        12: istore_1
        13: aload_0
        14: getfield      #74                 // Field _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
        17: invokevirtual #100                // Method java/util/concurrent/ArrayBlockingQueue.poll:()Ljava/lang/Object;
        20: checkcast     #104                // class ext/mods/commons/mmocore/ReceivablePacket
        23: astore_2
        24: aload_2
        25: ifnonnull     36
        28: aload_0
        29: getfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
        32: invokevirtual #106                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        35: return
        36: aload_0
        37: getfield      #109                // Field _isDetached:Z
        40: ifeq          58
        43: aload_0
        44: getfield      #74                 // Field _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
        47: invokevirtual #113                // Method java/util/concurrent/ArrayBlockingQueue.clear:()V
        50: aload_0
        51: getfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
        54: invokevirtual #106                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        57: return
        58: aload_2
        59: invokevirtual #116                // Method ext/mods/commons/mmocore/ReceivablePacket.run:()V
        62: goto          96
        65: astore_3
        66: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        69: ldc           #124                // String Execution failed on {} for {}.
        71: aload_3
        72: iconst_2
        73: anewarray     #126                // class java/lang/Object
        76: dup
        77: iconst_0
        78: aload_2
        79: invokevirtual #128                // Method java/lang/Object.getClass:()Ljava/lang/Class;
        82: invokevirtual #132                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
        85: aastore
        86: dup
        87: iconst_1
        88: aload_0
        89: invokevirtual #138                // Method toString:()Ljava/lang/String;
        92: aastore
        93: invokevirtual #141                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        96: iinc          1, 1
        99: aload_0
       100: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
       103: iload_1
       104: invokevirtual #151                // Method ext/mods/gameserver/network/ClientStats.countBurst:(I)Z
       107: ifeq          13
       110: aload_0
       111: getfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
       114: invokevirtual #106                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
       117: return
       118: astore        4
       120: aload_0
       121: getfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
       124: invokevirtual #106                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
       127: aload         4
       129: athrow
      Exception table:
         from    to  target type
            58    62    65   Class java/lang/Exception
            11    28   118   any
            36    50   118   any
            58   110   118   any
           118   120   118   any
      LineNumberTable:
        line 153: 0
        line 154: 10
        line 158: 11
        line 162: 13
        line 163: 24
        line 188: 28
        line 164: 35
        line 166: 36
        line 168: 43
        line 188: 50
        line 169: 57
        line 174: 58
        line 179: 62
        line 176: 65
        line 178: 66
        line 181: 96
        line 182: 99
        line 188: 110
        line 183: 117
        line 188: 118
        line 189: 127
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      30     3     e   Ljava/lang/Exception;
           13     105     1 count   I
           24      94     2 packet   Lext/mods/commons/mmocore/ReceivablePacket;
            0     130     0  this   Lext/mods/gameserver/network/GameClient;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           24      94     2 packet   Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
      StackMapTable: number_of_entries = 7
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/commons/mmocore/ReceivablePacket ]
        frame_type = 21 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 30 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/network/GameClient ]
          stack = [ class java/lang/Throwable ]

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #155                // Method getConnection:()Lext/mods/commons/mmocore/MMOConnection;
         4: invokevirtual #159                // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
         7: astore_1
         8: aload_0
         9: invokevirtual #165                // Method getState:()Lext/mods/gameserver/network/GameClient$GameClientState;
        12: invokevirtual #169                // Method ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
        15: tableswitch   { // 0 to 3

                       0: 44

                       1: 63

                       2: 86

                       3: 86
                 default: 128
            }
        44: aload_1
        45: ifnonnull     53
        48: ldc           #173                // String disconnected
        50: goto          57
        53: aload_1
        54: invokevirtual #175                // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
        57: invokedynamic #180,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        62: areturn
        63: aload_0
        64: invokevirtual #184                // Method getAccountName:()Ljava/lang/String;
        67: aload_1
        68: ifnonnull     76
        71: ldc           #173                // String disconnected
        73: goto          80
        76: aload_1
        77: invokevirtual #175                // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
        80: invokedynamic #187,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        85: areturn
        86: aload_0
        87: invokevirtual #190                // Method getPlayer:()Lext/mods/gameserver/model/actor/Player;
        90: ifnonnull     98
        93: ldc           #173                // String disconnected
        95: goto          105
        98: aload_0
        99: invokevirtual #190                // Method getPlayer:()Lext/mods/gameserver/model/actor/Player;
       102: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       105: aload_0
       106: invokevirtual #184                // Method getAccountName:()Ljava/lang/String;
       109: aload_1
       110: ifnonnull     118
       113: ldc           #173                // String disconnected
       115: goto          122
       118: aload_1
       119: invokevirtual #175                // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
       122: invokedynamic #199,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       127: areturn
       128: new           #202                // class java/lang/IllegalStateException
       131: dup
       132: ldc           #204                // String Missing state on switch
       134: invokespecial #206                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       137: athrow
       138: astore_1
       139: ldc           #211                // String [Character read failed due to disconnect]
       141: areturn
      Exception table:
         from    to  target type
             0    62   138   Class java/lang/NullPointerException
            63    85   138   Class java/lang/NullPointerException
            86   127   138   Class java/lang/NullPointerException
           128   138   138   Class java/lang/NullPointerException
      LineNumberTable:
        line 197: 0
        line 198: 8
        line 201: 44
        line 204: 63
        line 207: 86
        line 210: 128
        line 213: 138
        line 215: 139
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8     130     1 address   Ljava/net/InetAddress;
          139       3     1     e   Ljava/lang/NullPointerException;
            0     142     0  this   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 13
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class java/net/InetAddress ]
        frame_type = 8 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/network/GameClient, class java/net/InetAddress ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 11 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/network/GameClient, class java/net/InetAddress ]
          stack = [ class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/network/GameClient, class java/net/InetAddress ]
          stack = [ class java/lang/String, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/network/GameClient ]
          stack = [ class java/lang/NullPointerException ]

  public boolean decrypt(java.nio.ByteBuffer, int);
    descriptor: (Ljava/nio/ByteBuffer;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #53                 // Field _crypt:Lext/mods/gameserver/network/GameCrypt;
         4: aload_1
         5: invokevirtual #213                // Method java/nio/ByteBuffer.array:()[B
         8: aload_1
         9: invokevirtual #219                // Method java/nio/ByteBuffer.position:()I
        12: iload_2
        13: invokevirtual #222                // Method ext/mods/gameserver/network/GameCrypt.decrypt:([BII)V
        16: iconst_1
        17: ireturn
      LineNumberTable:
        line 222: 0
        line 223: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/network/GameClient;
            0      18     1   buf   Ljava/nio/ByteBuffer;
            0      18     2  size   I

  public boolean encrypt(java.nio.ByteBuffer, int);
    descriptor: (Ljava/nio/ByteBuffer;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getfield      #53                 // Field _crypt:Lext/mods/gameserver/network/GameCrypt;
         4: aload_1
         5: invokevirtual #213                // Method java/nio/ByteBuffer.array:()[B
         8: aload_1
         9: invokevirtual #219                // Method java/nio/ByteBuffer.position:()I
        12: iload_2
        13: invokevirtual #226                // Method ext/mods/gameserver/network/GameCrypt.encrypt:([BII)V
        16: aload_1
        17: aload_1
        18: invokevirtual #219                // Method java/nio/ByteBuffer.position:()I
        21: iload_2
        22: iadd
        23: invokevirtual #229                // Method java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
        26: pop
        27: iconst_1
        28: ireturn
      LineNumberTable:
        line 229: 0
        line 230: 16
        line 231: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/network/GameClient;
            0      29     1   buf   Ljava/nio/ByteBuffer;
            0      29     2  size   I

  protected void onDisconnection();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokedynamic #232,  0            // InvokeDynamic #4:run:(Lext/mods/gameserver/network/GameClient;)Ljava/lang/Runnable;
         6: invokestatic  #233                // Method ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
         9: goto          13
        12: astore_1
        13: return
      Exception table:
         from    to  target type
             0     9    12   Class java/util/concurrent/RejectedExecutionException
      LineNumberTable:
        line 239: 0
        line 300: 9
        line 298: 12
        line 301: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/RejectedExecutionException ]
        frame_type = 0 /* same */

  protected void onForcedDisconnection();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #239                // String {} disconnected abnormally.
         5: iconst_1
         6: anewarray     #126                // class java/lang/Object
         9: dup
        10: iconst_0
        11: aload_0
        12: invokevirtual #138                // Method toString:()Ljava/lang/String;
        15: aastore
        16: invokevirtual #241                // Method ext/mods/commons/logging/CLogger.debug:(Ljava/lang/Object;[Ljava/lang/Object;)V
        19: return
      LineNumberTable:
        line 306: 0
        line 307: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/network/GameClient;

  public byte[] enableCrypt();
    descriptor: ()[B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #245                // Method ext/mods/gameserver/network/BlowFishKeygen.getRandomKey:()[B
         3: astore_1
         4: aload_0
         5: getfield      #53                 // Field _crypt:Lext/mods/gameserver/network/GameCrypt;
         8: aload_1
         9: invokevirtual #250                // Method ext/mods/gameserver/network/GameCrypt.setKey:([B)V
        12: invokestatic  #254                // Method ext/mods/protection/hwid/hwid.isProtectionOn:()Z
        15: ifeq          23
        18: aload_1
        19: invokestatic  #259                // Method ext/mods/protection/hwid/hwid.getKey:([B)[B
        22: astore_1
        23: aload_1
        24: areturn
      LineNumberTable:
        line 311: 0
        line 312: 4
        line 313: 12
        line 315: 18
        line 318: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/GameClient;
            4      21     1   key   [B
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class "[B" ]

  public ext.mods.gameserver.network.GameClient$GameClientState getState();
    descriptor: ()Lext/mods/gameserver/network/GameClient$GameClientState;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
         4: areturn
      LineNumberTable:
        line 323: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setState(ext.mods.gameserver.network.GameClient$GameClientState);
    descriptor: (Lext/mods/gameserver/network/GameClient$GameClientState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
         4: aload_1
         5: if_acmpeq     20
         8: aload_0
         9: aload_1
        10: putfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
        13: aload_0
        14: getfield      #74                 // Field _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
        17: invokevirtual #113                // Method java/util/concurrent/ArrayBlockingQueue.clear:()V
        20: return
      LineNumberTable:
        line 328: 0
        line 330: 8
        line 331: 13
        line 333: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/network/GameClient;
            0      21     1 pState   Lext/mods/gameserver/network/GameClient$GameClientState;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */

  public ext.mods.gameserver.network.ClientStats getStats();
    descriptor: ()Lext/mods/gameserver/network/ClientStats;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _stats:Lext/mods/gameserver/network/ClientStats;
         4: areturn
      LineNumberTable:
        line 337: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public long getConnectionStartTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _connectionStartTime:J
         4: lreturn
      LineNumberTable:
        line 342: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #263                // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 347: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setPlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #263                // Field _player:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 352: 0
        line 353: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  public java.util.concurrent.locks.ReentrantLock getActiveCharLock();
    descriptor: ()Ljava/util/concurrent/locks/ReentrantLock;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _activeCharLock:Ljava/util/concurrent/locks/ReentrantLock;
         4: areturn
      LineNumberTable:
        line 357: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public long[] getFloodProtectors();
    descriptor: ()[J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _floodProtectors:[J
         4: areturn
      LineNumberTable:
        line 362: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setGameGuardOk(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #267                // Field _isAuthedGG:Z
         5: return
      LineNumberTable:
        line 367: 0
        line 368: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1   val   Z

  public void setAccountName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #270                // Field _accountName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 372: 0
        line 373: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1 pAccountName   Ljava/lang/String;

  public java.lang.String getAccountName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #270                // Field _accountName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 377: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setSessionId(ext.mods.gameserver.network.SessionKey);
    descriptor: (Lext/mods/gameserver/network/SessionKey;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #274                // Field _sessionId:Lext/mods/gameserver/network/SessionKey;
         5: return
      LineNumberTable:
        line 382: 0
        line 383: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1    sk   Lext/mods/gameserver/network/SessionKey;

  public ext.mods.gameserver.network.SessionKey getSessionId();
    descriptor: ()Lext/mods/gameserver/network/SessionKey;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #274                // Field _sessionId:Lext/mods/gameserver/network/SessionKey;
         4: areturn
      LineNumberTable:
        line 387: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public java.lang.String getRealIpAddress();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #278                // Field _realIpAddress:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 392: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setRealIpAddress(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #278                // Field _realIpAddress:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 397: 0
        line 398: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1 realIpAddress   Ljava/lang/String;

  public void sendPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #109                // Field _isDetached:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: invokevirtual #155                // Method getConnection:()Lext/mods/commons/mmocore/MMOConnection;
        12: aload_1
        13: invokevirtual #281                // Method ext/mods/commons/mmocore/MMOConnection.sendPacket:(Lext/mods/commons/mmocore/SendablePacket;)V
        16: aload_1
        17: invokevirtual #285                // Method ext/mods/gameserver/network/serverpackets/L2GameServerPacket.runImpl:()V
        20: return
      LineNumberTable:
        line 402: 0
        line 403: 7
        line 405: 8
        line 406: 16
        line 407: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/network/GameClient;
            0      21     1   gsp   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public boolean isDetached();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #109                // Field _isDetached:Z
         4: ireturn
      LineNumberTable:
        line 411: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setDetached(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #109                // Field _isDetached:Z
         5: return
      LineNumberTable:
        line 416: 0
        line 417: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1     b   Z

  public byte markToDeleteChar(int);
    descriptor: (I)B
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=9, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #290                // Method getObjectIdForSlot:(I)I
         5: istore_2
         6: iload_2
         7: ifge          12
        10: iconst_m1
        11: ireturn
        12: iconst_0
        13: istore_3
        14: invokestatic  #294                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        17: astore        4
        19: aload         4
        21: ldc_w         #299                // String SELECT clanId FROM characters WHERE obj_id=?
        24: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        29: astore        5
        31: aload         5
        33: iconst_1
        34: iload_2
        35: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        40: aload         5
        42: invokeinterface #313,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        47: astore        6
        49: aload         6
        51: invokeinterface #317,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        56: pop
        57: aload         6
        59: iconst_1
        60: invokeinterface #322,  2          // InterfaceMethod java/sql/ResultSet.getInt:(I)I
        65: istore        7
        67: iload         7
        69: ifeq          108
        72: invokestatic  #325                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
        75: iload         7
        77: invokevirtual #331                // Method ext/mods/gameserver/data/sql/ClanTable.getClan:(I)Lext/mods/gameserver/model/pledge/Clan;
        80: astore        8
        82: aload         8
        84: ifnonnull     92
        87: iconst_0
        88: istore_3
        89: goto          108
        92: aload         8
        94: invokevirtual #335                // Method ext/mods/gameserver/model/pledge/Clan.getLeaderId:()I
        97: iload_2
        98: if_icmpne     106
       101: iconst_2
       102: istore_3
       103: goto          108
       106: iconst_1
       107: istore_3
       108: aload         6
       110: ifnull        152
       113: aload         6
       115: invokeinterface #340,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       120: goto          152
       123: astore        7
       125: aload         6
       127: ifnull        149
       130: aload         6
       132: invokeinterface #340,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       137: goto          149
       140: astore        8
       142: aload         7
       144: aload         8
       146: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       149: aload         7
       151: athrow
       152: aload         5
       154: ifnull        196
       157: aload         5
       159: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       164: goto          196
       167: astore        6
       169: aload         5
       171: ifnull        193
       174: aload         5
       176: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       181: goto          193
       184: astore        7
       186: aload         6
       188: aload         7
       190: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       193: aload         6
       195: athrow
       196: iload_3
       197: ifne          306
       200: getstatic     #350                // Field ext/mods/Config.DELETE_DAYS:I
       203: ifne          213
       206: iload_2
       207: invokestatic  #353                // Method deleteCharByObjId:(I)V
       210: goto          306
       213: aload         4
       215: ldc_w         #356                // String UPDATE characters SET deletetime=? WHERE obj_id=?
       218: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       223: astore        5
       225: aload         5
       227: iconst_1
       228: invokestatic  #40                 // Method java/lang/System.currentTimeMillis:()J
       231: getstatic     #350                // Field ext/mods/Config.DELETE_DAYS:I
       234: i2l
       235: ldc2_w        #358                // long 86400000l
       238: lmul
       239: ladd
       240: invokeinterface #360,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
       245: aload         5
       247: iconst_2
       248: iload_2
       249: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       254: aload         5
       256: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       261: pop
       262: aload         5
       264: ifnull        306
       267: aload         5
       269: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       274: goto          306
       277: astore        6
       279: aload         5
       281: ifnull        303
       284: aload         5
       286: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       291: goto          303
       294: astore        7
       296: aload         6
       298: aload         7
       300: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       303: aload         6
       305: athrow
       306: aload         4
       308: ifnull        350
       311: aload         4
       313: invokeinterface #367,  1          // InterfaceMethod java/sql/Connection.close:()V
       318: goto          350
       321: astore        5
       323: aload         4
       325: ifnull        347
       328: aload         4
       330: invokeinterface #367,  1          // InterfaceMethod java/sql/Connection.close:()V
       335: goto          347
       338: astore        6
       340: aload         5
       342: aload         6
       344: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       347: aload         5
       349: athrow
       350: goto          368
       353: astore        4
       355: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       358: ldc_w         #368                // String Couldn\'t mark as delete a player.
       361: aload         4
       363: invokevirtual #370                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       366: iconst_m1
       367: ireturn
       368: iload_3
       369: ireturn
      Exception table:
         from    to  target type
            49   108   123   Class java/lang/Throwable
           130   137   140   Class java/lang/Throwable
            31   152   167   Class java/lang/Throwable
           174   181   184   Class java/lang/Throwable
           225   262   277   Class java/lang/Throwable
           284   291   294   Class java/lang/Throwable
            19   306   321   Class java/lang/Throwable
           328   335   338   Class java/lang/Throwable
            14   350   353   Class java/lang/Exception
      LineNumberTable:
        line 430: 0
        line 431: 6
        line 432: 10
        line 434: 12
        line 436: 14
        line 438: 19
        line 440: 31
        line 442: 40
        line 444: 49
        line 446: 57
        line 447: 67
        line 449: 72
        line 450: 82
        line 451: 87
        line 452: 92
        line 453: 101
        line 455: 106
        line 457: 108
        line 442: 123
        line 458: 152
        line 438: 167
        line 460: 196
        line 462: 200
        line 463: 206
        line 466: 213
        line 468: 225
        line 469: 245
        line 470: 254
        line 471: 262
        line 466: 277
        line 474: 306
        line 436: 321
        line 479: 350
        line 475: 353
        line 477: 355
        line 478: 366
        line 480: 368
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           82      26     8  clan   Lext/mods/gameserver/model/pledge/Clan;
           67      41     7 clanId   I
           49     103     6    rs   Ljava/sql/ResultSet;
           31     165     5    ps   Ljava/sql/PreparedStatement;
          225      81     5    ps   Ljava/sql/PreparedStatement;
           19     331     4   con   Ljava/sql/Connection;
          355      13     4     e   Ljava/lang/Exception;
            0     370     0  this   Lext/mods/gameserver/network/GameClient;
            0     370     1  slot   I
            6     364     2 objectId   I
           14     356     3 answer   B
      StackMapTable: number_of_entries = 23
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, int, class ext/mods/gameserver/model/pledge/Clan ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 14 /* same */

  public void markRestoredChar(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #290                // Method getObjectIdForSlot:(I)I
         5: istore_2
         6: iload_2
         7: ifge          11
        10: return
        11: invokestatic  #294                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        14: astore_3
        15: aload_3
        16: ldc_w         #356                // String UPDATE characters SET deletetime=? WHERE obj_id=?
        19: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        24: astore        4
        26: aload         4
        28: iconst_1
        29: lconst_0
        30: invokeinterface #360,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        35: aload         4
        37: iconst_2
        38: iload_2
        39: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        44: aload         4
        46: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        51: pop
        52: aload         4
        54: ifnull        96
        57: aload         4
        59: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        64: goto          96
        67: astore        5
        69: aload         4
        71: ifnull        93
        74: aload         4
        76: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        81: goto          93
        84: astore        6
        86: aload         5
        88: aload         6
        90: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        93: aload         5
        95: athrow
        96: aload_3
        97: ifnull        136
       100: aload_3
       101: invokeinterface #367,  1          // InterfaceMethod java/sql/Connection.close:()V
       106: goto          136
       109: astore        4
       111: aload_3
       112: ifnull        133
       115: aload_3
       116: invokeinterface #367,  1          // InterfaceMethod java/sql/Connection.close:()V
       121: goto          133
       124: astore        5
       126: aload         4
       128: aload         5
       130: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       133: aload         4
       135: athrow
       136: goto          150
       139: astore_3
       140: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       143: ldc_w         #373                // String Couldn\'t restore player.
       146: aload_3
       147: invokevirtual #370                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       150: return
      Exception table:
         from    to  target type
            26    52    67   Class java/lang/Throwable
            74    81    84   Class java/lang/Throwable
            15    96   109   Class java/lang/Throwable
           115   121   124   Class java/lang/Throwable
            11   136   139   Class java/lang/Exception
      LineNumberTable:
        line 485: 0
        line 486: 6
        line 487: 10
        line 489: 11
        line 490: 15
        line 492: 26
        line 493: 35
        line 494: 44
        line 495: 52
        line 489: 67
        line 495: 96
        line 489: 109
        line 499: 136
        line 496: 139
        line 498: 140
        line 500: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      70     4    ps   Ljava/sql/PreparedStatement;
           15     121     3   con   Ljava/sql/Connection;
          140      10     3     e   Ljava/lang/Exception;
            0     151     0  this   Lext/mods/gameserver/network/GameClient;
            0     151     1  slot   I
            6     145     2 objectId   I
      StackMapTable: number_of_entries = 11
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/network/GameClient, int, int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public static void deleteCharByObjId(int);
    descriptor: (I)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=5, args_size=1
         0: iload_0
         1: ifge          5
         4: return
         5: invokestatic  #375                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
         8: iload_0
         9: invokevirtual #380                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.removePlayer:(I)V
        12: invokestatic  #383                // Method ext/mods/extensions/listener/manager/GameListenerManager.getInstance:()Lext/mods/extensions/listener/manager/GameListenerManager;
        15: iload_0
        16: invokevirtual #388                // Method ext/mods/extensions/listener/manager/GameListenerManager.notifyCharacterDelete:(I)V
        19: invokestatic  #294                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
        22: astore_1
        23: aload_1
        24: ldc_w         #391                // String DELETE FROM character_hennas WHERE char_obj_id=?
        27: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        32: astore_2
        33: aload_2
        34: iconst_1
        35: iload_0
        36: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        41: aload_2
        42: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
        47: pop
        48: aload_2
        49: ifnull        85
        52: aload_2
        53: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        58: goto          85
        61: astore_3
        62: aload_2
        63: ifnull        83
        66: aload_2
        67: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
        72: goto          83
        75: astore        4
        77: aload_3
        78: aload         4
        80: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        83: aload_3
        84: athrow
        85: aload_1
        86: ldc_w         #393                // String DELETE FROM character_macroses WHERE char_obj_id=?
        89: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        94: astore_2
        95: aload_2
        96: iconst_1
        97: iload_0
        98: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       103: aload_2
       104: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       109: pop
       110: aload_2
       111: ifnull        147
       114: aload_2
       115: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       120: goto          147
       123: astore_3
       124: aload_2
       125: ifnull        145
       128: aload_2
       129: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       134: goto          145
       137: astore        4
       139: aload_3
       140: aload         4
       142: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       145: aload_3
       146: athrow
       147: aload_1
       148: ldc_w         #395                // String DELETE FROM character_memo WHERE charId=?
       151: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       156: astore_2
       157: aload_2
       158: iconst_1
       159: iload_0
       160: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       165: aload_2
       166: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       171: pop
       172: aload_2
       173: ifnull        209
       176: aload_2
       177: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       182: goto          209
       185: astore_3
       186: aload_2
       187: ifnull        207
       190: aload_2
       191: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       196: goto          207
       199: astore        4
       201: aload_3
       202: aload         4
       204: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       207: aload_3
       208: athrow
       209: aload_1
       210: ldc_w         #397                // String DELETE FROM character_quests WHERE charId=?
       213: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       218: astore_2
       219: aload_2
       220: iconst_1
       221: iload_0
       222: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       227: aload_2
       228: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       233: pop
       234: aload_2
       235: ifnull        271
       238: aload_2
       239: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       244: goto          271
       247: astore_3
       248: aload_2
       249: ifnull        269
       252: aload_2
       253: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       258: goto          269
       261: astore        4
       263: aload_3
       264: aload         4
       266: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       269: aload_3
       270: athrow
       271: aload_1
       272: ldc_w         #399                // String DELETE FROM character_recipebook WHERE charId=?
       275: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       280: astore_2
       281: aload_2
       282: iconst_1
       283: iload_0
       284: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       289: aload_2
       290: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       295: pop
       296: aload_2
       297: ifnull        333
       300: aload_2
       301: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       306: goto          333
       309: astore_3
       310: aload_2
       311: ifnull        331
       314: aload_2
       315: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       320: goto          331
       323: astore        4
       325: aload_3
       326: aload         4
       328: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       331: aload_3
       332: athrow
       333: aload_1
       334: ldc_w         #401                // String DELETE FROM character_relations WHERE char_id=? OR friend_id=?
       337: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       342: astore_2
       343: aload_2
       344: iconst_1
       345: iload_0
       346: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       351: aload_2
       352: iconst_2
       353: iload_0
       354: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       359: aload_2
       360: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       365: pop
       366: aload_2
       367: ifnull        403
       370: aload_2
       371: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       376: goto          403
       379: astore_3
       380: aload_2
       381: ifnull        401
       384: aload_2
       385: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       390: goto          401
       393: astore        4
       395: aload_3
       396: aload         4
       398: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       401: aload_3
       402: athrow
       403: aload_1
       404: ldc_w         #403                // String DELETE FROM character_shortcuts WHERE char_obj_id=?
       407: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       412: astore_2
       413: aload_2
       414: iconst_1
       415: iload_0
       416: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       421: aload_2
       422: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       427: pop
       428: aload_2
       429: ifnull        465
       432: aload_2
       433: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       438: goto          465
       441: astore_3
       442: aload_2
       443: ifnull        463
       446: aload_2
       447: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       452: goto          463
       455: astore        4
       457: aload_3
       458: aload         4
       460: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       463: aload_3
       464: athrow
       465: aload_1
       466: ldc_w         #405                // String DELETE FROM character_skills WHERE char_obj_id=?
       469: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       474: astore_2
       475: aload_2
       476: iconst_1
       477: iload_0
       478: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       483: aload_2
       484: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       489: pop
       490: aload_2
       491: ifnull        527
       494: aload_2
       495: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       500: goto          527
       503: astore_3
       504: aload_2
       505: ifnull        525
       508: aload_2
       509: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       514: goto          525
       517: astore        4
       519: aload_3
       520: aload         4
       522: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       525: aload_3
       526: athrow
       527: aload_1
       528: ldc_w         #407                // String DELETE FROM character_skills_save WHERE char_obj_id=?
       531: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       536: astore_2
       537: aload_2
       538: iconst_1
       539: iload_0
       540: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       545: aload_2
       546: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       551: pop
       552: aload_2
       553: ifnull        589
       556: aload_2
       557: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       562: goto          589
       565: astore_3
       566: aload_2
       567: ifnull        587
       570: aload_2
       571: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       576: goto          587
       579: astore        4
       581: aload_3
       582: aload         4
       584: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       587: aload_3
       588: athrow
       589: aload_1
       590: ldc_w         #409                // String DELETE FROM character_subclasses WHERE char_obj_id=?
       593: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       598: astore_2
       599: aload_2
       600: iconst_1
       601: iload_0
       602: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       607: aload_2
       608: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       613: pop
       614: aload_2
       615: ifnull        651
       618: aload_2
       619: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       624: goto          651
       627: astore_3
       628: aload_2
       629: ifnull        649
       632: aload_2
       633: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       638: goto          649
       641: astore        4
       643: aload_3
       644: aload         4
       646: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       649: aload_3
       650: athrow
       651: aload_1
       652: ldc_w         #411                // String DELETE FROM heroes WHERE char_id=?
       655: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       660: astore_2
       661: aload_2
       662: iconst_1
       663: iload_0
       664: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       669: aload_2
       670: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       675: pop
       676: aload_2
       677: ifnull        713
       680: aload_2
       681: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       686: goto          713
       689: astore_3
       690: aload_2
       691: ifnull        711
       694: aload_2
       695: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       700: goto          711
       703: astore        4
       705: aload_3
       706: aload         4
       708: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       711: aload_3
       712: athrow
       713: aload_1
       714: ldc_w         #413                // String DELETE FROM olympiad_nobles WHERE char_id=?
       717: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       722: astore_2
       723: aload_2
       724: iconst_1
       725: iload_0
       726: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       731: aload_2
       732: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       737: pop
       738: aload_2
       739: ifnull        775
       742: aload_2
       743: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       748: goto          775
       751: astore_3
       752: aload_2
       753: ifnull        773
       756: aload_2
       757: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       762: goto          773
       765: astore        4
       767: aload_3
       768: aload         4
       770: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       773: aload_3
       774: athrow
       775: aload_1
       776: ldc_w         #415                // String DELETE FROM seven_signs WHERE char_obj_id=?
       779: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       784: astore_2
       785: aload_2
       786: iconst_1
       787: iload_0
       788: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       793: aload_2
       794: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       799: pop
       800: aload_2
       801: ifnull        837
       804: aload_2
       805: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       810: goto          837
       813: astore_3
       814: aload_2
       815: ifnull        835
       818: aload_2
       819: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       824: goto          835
       827: astore        4
       829: aload_3
       830: aload         4
       832: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       835: aload_3
       836: athrow
       837: aload_1
       838: ldc_w         #417                // String DELETE FROM pets WHERE item_obj_id IN (SELECT object_id FROM items WHERE items.owner_id=?)
       841: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       846: astore_2
       847: aload_2
       848: iconst_1
       849: iload_0
       850: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       855: aload_2
       856: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       861: pop
       862: aload_2
       863: ifnull        899
       866: aload_2
       867: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       872: goto          899
       875: astore_3
       876: aload_2
       877: ifnull        897
       880: aload_2
       881: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       886: goto          897
       889: astore        4
       891: aload_3
       892: aload         4
       894: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       897: aload_3
       898: athrow
       899: aload_1
       900: ldc_w         #419                // String DELETE FROM augmentations WHERE item_oid IN (SELECT object_id FROM items WHERE items.owner_id=?)
       903: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       908: astore_2
       909: aload_2
       910: iconst_1
       911: iload_0
       912: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       917: aload_2
       918: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       923: pop
       924: aload_2
       925: ifnull        961
       928: aload_2
       929: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       934: goto          961
       937: astore_3
       938: aload_2
       939: ifnull        959
       942: aload_2
       943: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       948: goto          959
       951: astore        4
       953: aload_3
       954: aload         4
       956: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       959: aload_3
       960: athrow
       961: aload_1
       962: ldc_w         #421                // String DELETE FROM items WHERE owner_id=?
       965: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
       970: astore_2
       971: aload_2
       972: iconst_1
       973: iload_0
       974: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       979: aload_2
       980: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       985: pop
       986: aload_2
       987: ifnull        1023
       990: aload_2
       991: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       996: goto          1023
       999: astore_3
      1000: aload_2
      1001: ifnull        1021
      1004: aload_2
      1005: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1010: goto          1021
      1013: astore        4
      1015: aload_3
      1016: aload         4
      1018: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1021: aload_3
      1022: athrow
      1023: aload_1
      1024: ldc_w         #423                // String DELETE FROM character_raid_points WHERE char_id=?
      1027: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1032: astore_2
      1033: aload_2
      1034: iconst_1
      1035: iload_0
      1036: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1041: aload_2
      1042: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
      1047: pop
      1048: aload_2
      1049: ifnull        1085
      1052: aload_2
      1053: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1058: goto          1085
      1061: astore_3
      1062: aload_2
      1063: ifnull        1083
      1066: aload_2
      1067: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1072: goto          1083
      1075: astore        4
      1077: aload_3
      1078: aload         4
      1080: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1083: aload_3
      1084: athrow
      1085: aload_1
      1086: ldc_w         #425                // String DELETE FROM characters WHERE obj_Id=?
      1089: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1094: astore_2
      1095: aload_2
      1096: iconst_1
      1097: iload_0
      1098: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1103: aload_2
      1104: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
      1109: pop
      1110: aload_2
      1111: ifnull        1147
      1114: aload_2
      1115: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1120: goto          1147
      1123: astore_3
      1124: aload_2
      1125: ifnull        1145
      1128: aload_2
      1129: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1134: goto          1145
      1137: astore        4
      1139: aload_3
      1140: aload         4
      1142: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1145: aload_3
      1146: athrow
      1147: aload_1
      1148: ldc_w         #427                // String DELETE FROM character_data WHERE charId=?
      1151: invokeinterface #301,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1156: astore_2
      1157: aload_2
      1158: iconst_1
      1159: iload_0
      1160: invokeinterface #307,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1165: aload_2
      1166: invokeinterface #364,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
      1171: pop
      1172: aload_2
      1173: ifnull        1209
      1176: aload_2
      1177: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1182: goto          1209
      1185: astore_3
      1186: aload_2
      1187: ifnull        1207
      1190: aload_2
      1191: invokeinterface #349,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1196: goto          1207
      1199: astore        4
      1201: aload_3
      1202: aload         4
      1204: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1207: aload_3
      1208: athrow
      1209: aload_1
      1210: ifnull        1244
      1213: aload_1
      1214: invokeinterface #367,  1          // InterfaceMethod java/sql/Connection.close:()V
      1219: goto          1244
      1222: astore_2
      1223: aload_1
      1224: ifnull        1242
      1227: aload_1
      1228: invokeinterface #367,  1          // InterfaceMethod java/sql/Connection.close:()V
      1233: goto          1242
      1236: astore_3
      1237: aload_2
      1238: aload_3
      1239: invokevirtual #345                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1242: aload_2
      1243: athrow
      1244: goto          1258
      1247: astore_1
      1248: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1251: ldc_w         #429                // String Couldn\'t delete player.
      1254: aload_1
      1255: invokevirtual #370                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
      1258: return
      Exception table:
         from    to  target type
            33    48    61   Class java/lang/Throwable
            66    72    75   Class java/lang/Throwable
            95   110   123   Class java/lang/Throwable
           128   134   137   Class java/lang/Throwable
           157   172   185   Class java/lang/Throwable
           190   196   199   Class java/lang/Throwable
           219   234   247   Class java/lang/Throwable
           252   258   261   Class java/lang/Throwable
           281   296   309   Class java/lang/Throwable
           314   320   323   Class java/lang/Throwable
           343   366   379   Class java/lang/Throwable
           384   390   393   Class java/lang/Throwable
           413   428   441   Class java/lang/Throwable
           446   452   455   Class java/lang/Throwable
           475   490   503   Class java/lang/Throwable
           508   514   517   Class java/lang/Throwable
           537   552   565   Class java/lang/Throwable
           570   576   579   Class java/lang/Throwable
           599   614   627   Class java/lang/Throwable
           632   638   641   Class java/lang/Throwable
           661   676   689   Class java/lang/Throwable
           694   700   703   Class java/lang/Throwable
           723   738   751   Class java/lang/Throwable
           756   762   765   Class java/lang/Throwable
           785   800   813   Class java/lang/Throwable
           818   824   827   Class java/lang/Throwable
           847   862   875   Class java/lang/Throwable
           880   886   889   Class java/lang/Throwable
           909   924   937   Class java/lang/Throwable
           942   948   951   Class java/lang/Throwable
           971   986   999   Class java/lang/Throwable
          1004  1010  1013   Class java/lang/Throwable
          1033  1048  1061   Class java/lang/Throwable
          1066  1072  1075   Class java/lang/Throwable
          1095  1110  1123   Class java/lang/Throwable
          1128  1134  1137   Class java/lang/Throwable
          1157  1172  1185   Class java/lang/Throwable
          1190  1196  1199   Class java/lang/Throwable
            23  1209  1222   Class java/lang/Throwable
          1227  1233  1236   Class java/lang/Throwable
            19  1244  1247   Class java/lang/Exception
      LineNumberTable:
        line 504: 0
        line 505: 4
        line 507: 5
        line 508: 12
        line 510: 19
        line 512: 23
        line 514: 33
        line 515: 41
        line 516: 48
        line 512: 61
        line 518: 85
        line 520: 95
        line 521: 103
        line 522: 110
        line 518: 123
        line 524: 147
        line 526: 157
        line 527: 165
        line 528: 172
        line 524: 185
        line 530: 209
        line 532: 219
        line 533: 227
        line 534: 234
        line 530: 247
        line 536: 271
        line 538: 281
        line 539: 289
        line 540: 296
        line 536: 309
        line 542: 333
        line 544: 343
        line 545: 351
        line 546: 359
        line 547: 366
        line 542: 379
        line 549: 403
        line 551: 413
        line 552: 421
        line 553: 428
        line 549: 441
        line 555: 465
        line 557: 475
        line 558: 483
        line 559: 490
        line 555: 503
        line 561: 527
        line 563: 537
        line 564: 545
        line 565: 552
        line 561: 565
        line 567: 589
        line 569: 599
        line 570: 607
        line 571: 614
        line 567: 627
        line 573: 651
        line 575: 661
        line 576: 669
        line 577: 676
        line 573: 689
        line 579: 713
        line 581: 723
        line 582: 731
        line 583: 738
        line 579: 751
        line 585: 775
        line 587: 785
        line 588: 793
        line 589: 800
        line 585: 813
        line 591: 837
        line 593: 847
        line 594: 855
        line 595: 862
        line 591: 875
        line 597: 899
        line 599: 909
        line 600: 917
        line 601: 924
        line 597: 937
        line 603: 961
        line 605: 971
        line 606: 979
        line 607: 986
        line 603: 999
        line 609: 1023
        line 611: 1033
        line 612: 1041
        line 613: 1048
        line 609: 1061
        line 615: 1085
        line 617: 1095
        line 618: 1103
        line 619: 1110
        line 615: 1123
        line 621: 1147
        line 623: 1157
        line 624: 1165
        line 625: 1172
        line 621: 1185
        line 626: 1209
        line 510: 1222
        line 630: 1244
        line 627: 1247
        line 629: 1248
        line 631: 1258
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      52     2    ps   Ljava/sql/PreparedStatement;
           95      52     2    ps   Ljava/sql/PreparedStatement;
          157      52     2    ps   Ljava/sql/PreparedStatement;
          219      52     2    ps   Ljava/sql/PreparedStatement;
          281      52     2    ps   Ljava/sql/PreparedStatement;
          343      60     2    ps   Ljava/sql/PreparedStatement;
          413      52     2    ps   Ljava/sql/PreparedStatement;
          475      52     2    ps   Ljava/sql/PreparedStatement;
          537      52     2    ps   Ljava/sql/PreparedStatement;
          599      52     2    ps   Ljava/sql/PreparedStatement;
          661      52     2    ps   Ljava/sql/PreparedStatement;
          723      52     2    ps   Ljava/sql/PreparedStatement;
          785      52     2    ps   Ljava/sql/PreparedStatement;
          847      52     2    ps   Ljava/sql/PreparedStatement;
          909      52     2    ps   Ljava/sql/PreparedStatement;
          971      52     2    ps   Ljava/sql/PreparedStatement;
         1033      52     2    ps   Ljava/sql/PreparedStatement;
         1095      52     2    ps   Ljava/sql/PreparedStatement;
         1157      52     2    ps   Ljava/sql/PreparedStatement;
           23    1221     1   con   Ljava/sql/Connection;
         1248      10     1     e   Ljava/lang/Exception;
            0    1259     0 objectId   I
      StackMapTable: number_of_entries = 83
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ int, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public ext.mods.gameserver.model.actor.Player loadCharFromDisk(int);
    descriptor: (I)Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #290                // Method getObjectIdForSlot:(I)I
         5: istore_2
         6: iload_2
         7: ifge          12
        10: aconst_null
        11: areturn
        12: invokestatic  #431                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        15: iload_2
        16: invokevirtual #436                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        19: astore_3
        20: aload_3
        21: ifnonnull     29
        24: iload_2
        25: invokestatic  #439                // Method ext/mods/gameserver/model/actor/Player.restore:(I)Lext/mods/gameserver/model/actor/Player;
        28: areturn
        29: invokestatic  #442                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        32: aload_3
        33: aload_0
        34: invokevirtual #447                // Method ext/mods/Safedisconect/SafeDisconnectManager.prepareReconnect:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/GameClient;)Z
        37: ifeq          42
        40: aload_3
        41: areturn
        42: invokestatic  #442                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
        45: aload_3
        46: invokevirtual #451                // Method ext/mods/Safedisconect/SafeDisconnectManager.isSafeDisconnectActive:(Lext/mods/gameserver/model/actor/Player;)Z
        49: ifeq          74
        52: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        55: ldc_w         #455                // String SafeDisconnect active for {}, skipping detach/delete during reconnect.
        58: iconst_1
        59: anewarray     #126                // class java/lang/Object
        62: dup
        63: iconst_0
        64: aload_3
        65: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        68: aastore
        69: invokevirtual #457                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        72: aload_3
        73: areturn
        74: aload_3
        75: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        78: ifnull        91
        81: aload_3
        82: invokevirtual #460                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        85: invokevirtual #464                // Method closeNow:()V
        88: goto          95
        91: aload_3
        92: invokevirtual #467                // Method ext/mods/gameserver/model/actor/Player.deleteMe:()V
        95: aconst_null
        96: areturn
      LineNumberTable:
        line 635: 0
        line 636: 6
        line 637: 10
        line 639: 12
        line 640: 20
        line 641: 24
        line 643: 29
        line 644: 40
        line 646: 42
        line 648: 52
        line 649: 72
        line 652: 74
        line 653: 81
        line 655: 91
        line 657: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      97     0  this   Lext/mods/gameserver/network/GameClient;
            0      97     1  slot   I
            6      91     2 objectId   I
           20      77     3 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 12 /* same */
        frame_type = 31 /* same */
        frame_type = 16 /* same */
        frame_type = 3 /* same */

  public ext.mods.gameserver.model.CharSelectSlot getCharSelectSlot(int);
    descriptor: (I)Lext/mods/gameserver/model/CharSelectSlot;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #470                // Field _slots:[Lext/mods/gameserver/model/CharSelectSlot;
         4: ifnull        20
         7: iload_1
         8: iflt          20
        11: iload_1
        12: aload_0
        13: getfield      #470                // Field _slots:[Lext/mods/gameserver/model/CharSelectSlot;
        16: arraylength
        17: if_icmplt     22
        20: aconst_null
        21: areturn
        22: aload_0
        23: getfield      #470                // Field _slots:[Lext/mods/gameserver/model/CharSelectSlot;
        26: iload_1
        27: aaload
        28: areturn
      LineNumberTable:
        line 667: 0
        line 668: 20
        line 670: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/network/GameClient;
            0      29     1    id   I
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 1 /* same */

  public void setCharSelectSlot(ext.mods.gameserver.model.CharSelectSlot[]);
    descriptor: ([Lext/mods/gameserver/model/CharSelectSlot;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #470                // Field _slots:[Lext/mods/gameserver/model/CharSelectSlot;
         5: return
      LineNumberTable:
        line 679: 0
        line 680: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1  list   [Lext/mods/gameserver/model/CharSelectSlot;

  public void close(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #155                // Method getConnection:()Lext/mods/commons/mmocore/MMOConnection;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: invokevirtual #155                // Method getConnection:()Lext/mods/commons/mmocore/MMOConnection;
        12: aload_1
        13: invokevirtual #474                // Method ext/mods/commons/mmocore/MMOConnection.close:(Lext/mods/commons/mmocore/SendablePacket;)V
        16: aconst_null
        17: invokestatic  #476                // Method ext/mods/protection/hwid/hwid.removePlayer:(Lext/mods/gameserver/network/GameClient;)V
        20: return
      LineNumberTable:
        line 684: 0
        line 685: 7
        line 687: 8
        line 688: 16
        line 689: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/network/GameClient;
            0      21     1   gsp   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public synchronized void closeNow();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #109                // Field _isDetached:Z
         5: aload_0
         6: getstatic     #488                // Field ext/mods/gameserver/network/serverpackets/ServerClose.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ServerClose;
         9: invokevirtual #494                // Method close:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        12: aload_0
        13: getfield      #497                // Field _cleanupTask:Ljava/util/concurrent/ScheduledFuture;
        16: ifnull        35
        19: aload_0
        20: getfield      #497                // Field _cleanupTask:Ljava/util/concurrent/ScheduledFuture;
        23: iconst_1
        24: invokeinterface #500,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        29: pop
        30: aload_0
        31: aconst_null
        32: putfield      #497                // Field _cleanupTask:Ljava/util/concurrent/ScheduledFuture;
        35: new           #506                // class ext/mods/gameserver/network/GameClient$CleanupTask
        38: dup
        39: aload_0
        40: invokespecial #508                // Method ext/mods/gameserver/network/GameClient$CleanupTask."<init>":(Lext/mods/gameserver/network/GameClient;)V
        43: lconst_0
        44: invokestatic  #510                // Method ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        47: pop
        48: return
      LineNumberTable:
        line 706: 0
        line 708: 5
        line 710: 12
        line 712: 19
        line 713: 30
        line 716: 35
        line 717: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 1
        frame_type = 35 /* same */

  public synchronized void cleanMe(boolean);
    descriptor: (Z)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #497                // Field _cleanupTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnonnull     35
         7: aload_0
         8: new           #506                // class ext/mods/gameserver/network/GameClient$CleanupTask
        11: dup
        12: aload_0
        13: invokespecial #508                // Method ext/mods/gameserver/network/GameClient$CleanupTask."<init>":(Lext/mods/gameserver/network/GameClient;)V
        16: iload_1
        17: ifeq          26
        20: ldc2_w        #514                // long 100l
        23: goto          29
        26: ldc2_w        #516                // long 15000l
        29: invokestatic  #510                // Method ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        32: putfield      #497                // Field _cleanupTask:Ljava/util/concurrent/ScheduledFuture;
        35: return
      LineNumberTable:
        line 721: 0
        line 722: 7
        line 723: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/network/GameClient;
            0      36     1  fast   Z
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/network/GameClient, int ]
          stack = [ class ext/mods/gameserver/network/GameClient, class ext/mods/gameserver/network/GameClient$CleanupTask ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/network/GameClient, int ]
          stack = [ class ext/mods/gameserver/network/GameClient, class ext/mods/gameserver/network/GameClient$CleanupTask, long ]
        frame_type = 5 /* same */

  public boolean dropPacket();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #109                // Field _isDetached:Z
         4: ifeq          9
         7: iconst_1
         8: ireturn
         9: aload_0
        10: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        13: aload_0
        14: getfield      #74                 // Field _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
        17: invokevirtual #518                // Method java/util/concurrent/ArrayBlockingQueue.size:()I
        20: invokevirtual #521                // Method ext/mods/gameserver/network/ClientStats.countPacket:(I)Z
        23: ifeq          35
        26: aload_0
        27: getstatic     #524                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        30: invokevirtual #529                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        33: iconst_1
        34: ireturn
        35: aload_0
        36: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        39: invokevirtual #531                // Method ext/mods/gameserver/network/ClientStats.dropPacket:()Z
        42: ireturn
      LineNumberTable:
        line 753: 0
        line 754: 7
        line 756: 9
        line 758: 26
        line 759: 33
        line 762: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 25 /* same */

  public void onBufferUnderflow();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
         4: getstatic     #31                 // Field ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
         7: if_acmpne     43
        10: getstatic     #534                // Field ext/mods/Config.PACKET_HANDLER_DEBUG:Z
        13: ifeq          36
        16: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        19: ldc_w         #537                // String {} has been disconnected: too many buffer underflows in non-authed state.
        22: iconst_1
        23: anewarray     #126                // class java/lang/Object
        26: dup
        27: iconst_0
        28: aload_0
        29: invokevirtual #138                // Method toString:()Ljava/lang/String;
        32: aastore
        33: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        36: aload_0
        37: invokevirtual #464                // Method closeNow:()V
        40: goto          77
        43: aload_0
        44: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        47: invokevirtual #542                // Method ext/mods/gameserver/network/ClientStats.countUnderflowException:()Z
        50: ifeq          77
        53: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        56: ldc_w         #545                // String {} has been disconnected: too many buffer underflows.
        59: iconst_1
        60: anewarray     #126                // class java/lang/Object
        63: dup
        64: iconst_0
        65: aload_0
        66: invokevirtual #138                // Method toString:()Ljava/lang/String;
        69: aastore
        70: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        73: aload_0
        74: invokevirtual #464                // Method closeNow:()V
        77: return
      LineNumberTable:
        line 770: 0
        line 772: 10
        line 773: 16
        line 775: 36
        line 777: 43
        line 779: 53
        line 780: 73
        line 782: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 3
        frame_type = 36 /* same */
        frame_type = 6 /* same */
        frame_type = 33 /* same */

  public void onUnknownPacket();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
         4: getstatic     #31                 // Field ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
         7: if_acmpne     43
        10: getstatic     #534                // Field ext/mods/Config.PACKET_HANDLER_DEBUG:Z
        13: ifeq          36
        16: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        19: ldc_w         #547                // String {} has been disconnected: too many unknown packets in non-authed state.
        22: iconst_1
        23: anewarray     #126                // class java/lang/Object
        26: dup
        27: iconst_0
        28: aload_0
        29: invokevirtual #138                // Method toString:()Ljava/lang/String;
        32: aastore
        33: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        36: aload_0
        37: invokevirtual #464                // Method closeNow:()V
        40: goto          77
        43: aload_0
        44: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        47: invokevirtual #549                // Method ext/mods/gameserver/network/ClientStats.countUnknownPacket:()Z
        50: ifeq          77
        53: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        56: ldc_w         #552                // String {} has been disconnected: too many unknown packets.
        59: iconst_1
        60: anewarray     #126                // class java/lang/Object
        63: dup
        64: iconst_0
        65: aload_0
        66: invokevirtual #138                // Method toString:()Ljava/lang/String;
        69: aastore
        70: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        73: aload_0
        74: invokevirtual #464                // Method closeNow:()V
        77: return
      LineNumberTable:
        line 789: 0
        line 791: 10
        line 792: 16
        line 794: 36
        line 796: 43
        line 798: 53
        line 799: 73
        line 801: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/network/GameClient;
      StackMapTable: number_of_entries = 3
        frame_type = 36 /* same */
        frame_type = 6 /* same */
        frame_type = 33 /* same */

  public void execute(ext.mods.commons.mmocore.ReceivablePacket<ext.mods.gameserver.network.GameClient>);
    descriptor: (Lext/mods/commons/mmocore/ReceivablePacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
         4: invokevirtual #554                // Method ext/mods/gameserver/network/ClientStats.countFloods:()Z
         7: ifeq          61
        10: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        13: ldc_w         #557                // String {} has been disconnected: too many floods ({} long and {} short).
        16: iconst_3
        17: anewarray     #126                // class java/lang/Object
        20: dup
        21: iconst_0
        22: aload_0
        23: invokevirtual #138                // Method toString:()Ljava/lang/String;
        26: aastore
        27: dup
        28: iconst_1
        29: aload_0
        30: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        33: getfield      #559                // Field ext/mods/gameserver/network/ClientStats.longFloods:I
        36: invokestatic  #562                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        39: aastore
        40: dup
        41: iconst_2
        42: aload_0
        43: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        46: getfield      #568                // Field ext/mods/gameserver/network/ClientStats.shortFloods:I
        49: invokestatic  #562                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        52: aastore
        53: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        56: aload_0
        57: invokevirtual #464                // Method closeNow:()V
        60: return
        61: aload_0
        62: getfield      #74                 // Field _packetQueue:Ljava/util/concurrent/ArrayBlockingQueue;
        65: aload_1
        66: invokevirtual #571                // Method java/util/concurrent/ArrayBlockingQueue.offer:(Ljava/lang/Object;)Z
        69: ifne          117
        72: aload_0
        73: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
        76: invokevirtual #575                // Method ext/mods/gameserver/network/ClientStats.countQueueOverflow:()Z
        79: ifeq          109
        82: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        85: ldc_w         #578                // String {} has been disconnected: too many queue overflows.
        88: iconst_1
        89: anewarray     #126                // class java/lang/Object
        92: dup
        93: iconst_0
        94: aload_0
        95: invokevirtual #138                // Method toString:()Ljava/lang/String;
        98: aastore
        99: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       102: aload_0
       103: invokevirtual #464                // Method closeNow:()V
       106: goto          116
       109: aload_0
       110: getstatic     #524                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       113: invokevirtual #529                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       116: return
       117: aload_0
       118: getfield      #24                 // Field _queueLock:Ljava/util/concurrent/locks/ReentrantLock;
       121: invokevirtual #580                // Method java/util/concurrent/locks/ReentrantLock.isLocked:()Z
       124: ifeq          128
       127: return
       128: aload_0
       129: getfield      #37                 // Field _state:Lext/mods/gameserver/network/GameClient$GameClientState;
       132: getstatic     #31                 // Field ext/mods/gameserver/network/GameClient$GameClientState.CONNECTED:Lext/mods/gameserver/network/GameClient$GameClientState;
       135: if_acmpne     180
       138: aload_0
       139: invokevirtual #147                // Method getStats:()Lext/mods/gameserver/network/ClientStats;
       142: getfield      #583                // Field ext/mods/gameserver/network/ClientStats.processedPackets:I
       145: iconst_3
       146: if_icmple     180
       149: getstatic     #534                // Field ext/mods/Config.PACKET_HANDLER_DEBUG:Z
       152: ifeq          175
       155: getstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       158: ldc_w         #586                // String {} has been disconnected: too many packets in non-authed state.
       161: iconst_1
       162: anewarray     #126                // class java/lang/Object
       165: dup
       166: iconst_0
       167: aload_0
       168: invokevirtual #138                // Method toString:()Ljava/lang/String;
       171: aastore
       172: invokevirtual #539                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       175: aload_0
       176: invokevirtual #464                // Method closeNow:()V
       179: return
       180: aload_0
       181: invokestatic  #233                // Method ext/mods/commons/pool/ThreadPool.executeIO:(Ljava/lang/Runnable;)V
       184: goto          188
       187: astore_2
       188: return
      Exception table:
         from    to  target type
           128   179   187   Class java/util/concurrent/RejectedExecutionException
           180   184   187   Class java/util/concurrent/RejectedExecutionException
      LineNumberTable:
        line 809: 0
        line 811: 10
        line 812: 56
        line 813: 60
        line 816: 61
        line 818: 72
        line 820: 82
        line 821: 102
        line 824: 109
        line 826: 116
        line 829: 117
        line 830: 127
        line 834: 128
        line 836: 149
        line 837: 155
        line 839: 175
        line 840: 179
        line 843: 180
        line 847: 184
        line 845: 187
        line 848: 188
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     189     0  this   Lext/mods/gameserver/network/GameClient;
            0     189     1 packet   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     189     1 packet   Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
      StackMapTable: number_of_entries = 9
        frame_type = 61 /* same */
        frame_type = 47 /* same */
        frame_type = 6 /* same */
        frame_type = 0 /* same */
        frame_type = 10 /* same */
        frame_type = 46 /* same */
        frame_type = 4 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/RejectedExecutionException ]
        frame_type = 0 /* same */
    Signature: #911                         // (Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;)V

  public boolean performAction(ext.mods.gameserver.enums.FloodProtector);
    descriptor: (Lext/mods/gameserver/enums/FloodProtector;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=8, args_size=2
         0: aload_1
         1: invokevirtual #588                // Method ext/mods/gameserver/enums/FloodProtector.getReuseDelay:()I
         4: istore_2
         5: iload_2
         6: ifne          11
         9: iconst_1
        10: ireturn
        11: invokestatic  #591                // Method java/lang/System.nanoTime:()J
        14: lstore_3
        15: aload_0
        16: getfield      #13                 // Field _floodProtectors:[J
        19: astore        5
        21: aload         5
        23: dup
        24: astore        6
        26: monitorenter
        27: aload         5
        29: aload_1
        30: invokevirtual #594                // Method ext/mods/gameserver/enums/FloodProtector.getId:()I
        33: laload
        34: lload_3
        35: lcmp
        36: ifle          44
        39: iconst_0
        40: aload         6
        42: monitorexit
        43: ireturn
        44: aload         5
        46: aload_1
        47: invokevirtual #594                // Method ext/mods/gameserver/enums/FloodProtector.getId:()I
        50: lload_3
        51: iload_2
        52: i2l
        53: ldc2_w        #597                // long 1000000l
        56: lmul
        57: ladd
        58: lastore
        59: iconst_1
        60: aload         6
        62: monitorexit
        63: ireturn
        64: astore        7
        66: aload         6
        68: monitorexit
        69: aload         7
        71: athrow
      Exception table:
         from    to  target type
            27    43    64   any
            44    63    64   any
            64    69    64   any
      LineNumberTable:
        line 857: 0
        line 858: 5
        line 859: 9
        line 861: 11
        line 862: 15
        line 864: 21
        line 866: 27
        line 867: 39
        line 869: 44
        line 870: 59
        line 871: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/network/GameClient;
            0      72     1    fp   Lext/mods/gameserver/enums/FloodProtector;
            5      67     2 reuseDelay   I
           15      57     3 currentTime   J
           21      51     5 value   [J
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 254 /* append */
          offset_delta = 32
          locals = [ long, class "[J", class java/lang/Object ]
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]

  public void spawnOffline(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Player.isRunning:()Z
         4: pop
         5: aload_1
         6: invokevirtual #602                // Method ext/mods/gameserver/model/actor/Player.sitDown:()Z
         9: pop
        10: aload_1
        11: iconst_1
        12: iconst_0
        13: invokevirtual #605                // Method ext/mods/gameserver/model/actor/Player.setOnlineStatus:(ZZ)V
        16: invokestatic  #431                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        19: aload_1
        20: invokevirtual #609                // Method ext/mods/gameserver/model/World.addPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        23: aload_0
        24: iconst_1
        25: invokevirtual #613                // Method setDetached:(Z)V
        28: aload_1
        29: aload_0
        30: invokevirtual #617                // Method ext/mods/gameserver/model/actor/Player.setClient:(Lext/mods/gameserver/network/GameClient;)V
        33: aload_0
        34: aload_1
        35: invokevirtual #620                // Method setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        38: aload_0
        39: aload_1
        40: invokevirtual #623                // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
        43: invokevirtual #624                // Method setAccountName:(Ljava/lang/String;)V
        46: aload_1
        47: iconst_1
        48: iconst_1
        49: invokevirtual #605                // Method ext/mods/gameserver/model/actor/Player.setOnlineStatus:(ZZ)V
        52: aload_0
        53: getstatic     #627                // Field ext/mods/gameserver/network/GameClient$GameClientState.IN_GAME:Lext/mods/gameserver/network/GameClient$GameClientState;
        56: invokevirtual #630                // Method setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
        59: aload_1
        60: invokevirtual #634                // Method ext/mods/gameserver/model/actor/Player.spawnMe:()V
        63: invokestatic  #637                // Method ext/mods/gameserver/LoginServerThread.getInstance:()Lext/mods/gameserver/LoginServerThread;
        66: aload_1
        67: invokevirtual #623                // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
        70: aload_0
        71: invokevirtual #642                // Method ext/mods/gameserver/LoginServerThread.addClient:(Ljava/lang/String;Lext/mods/gameserver/network/GameClient;)V
        74: return
      LineNumberTable:
        line 876: 0
        line 877: 5
        line 878: 10
        line 880: 16
        line 882: 23
        line 883: 28
        line 884: 33
        line 885: 38
        line 886: 46
        line 887: 52
        line 888: 59
        line 890: 63
        line 891: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/gameserver/network/GameClient;
            0      75     1 player   Lext/mods/gameserver/model/actor/Player;

  public final java.lang.String getPlayerName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #646                // Field _playerName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 902: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setPlayerName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #646                // Field _playerName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 907: 0
        line 908: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1  name   Ljava/lang/String;

  public void setPlayerId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #649                // Field _playerId:I
         5: return
      LineNumberTable:
        line 912: 0
        line 913: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1  plId   I

  public int getPlayerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #649                // Field _playerId:I
         4: ireturn
      LineNumberTable:
        line 917: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #652                // Field _count:I
         4: ireturn
      LineNumberTable:
        line 922: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setCount(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #652                // Field _count:I
         5: return
      LineNumberTable:
        line 927: 0
        line 928: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1 count   I

  public final java.lang.String getHWID();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #655                // Field _hwid:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 932: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setHWID(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #655                // Field _hwid:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 937: 0
        line 938: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1  hwid   Ljava/lang/String;

  public void setRevision(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #658                // Field _revision:I
         5: return
      LineNumberTable:
        line 942: 0
        line 943: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1 revision   I

  public int getRevision();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #658                // Field _revision:I
         4: ireturn
      LineNumberTable:
        line 947: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public final java.lang.String getLoginName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #661                // Field _loginName:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 952: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GameClient;

  public void setLoginName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #661                // Field _loginName:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 957: 0
        line 958: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GameClient;
            0       6     1  name   Ljava/lang/String;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #142                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/network/GameClient
         6: invokevirtual #805                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #806                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #120                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 68: 0
}
Signature: #943                         // Lext/mods/commons/mmocore/MMOClient<Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;>;Ljava/lang/Runnable;
SourceFile: "GameClient.java"
NestMembers:
  ext/mods/gameserver/network/GameClient$CleanupTask
  ext/mods/gameserver/network/GameClient$GameClientState
BootstrapMethods:
  0: #964 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #948 ()V
      #949 REF_invokeVirtual ext/mods/gameserver/network/GameClient.lambda$new$0:()V
      #948 ()V
  1: #971 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #952 [IP: \u0001]
  2: #971 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #954 [Account: \u0001 - IP: \u0001]
  3: #971 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #956 [Character: \u0001 - Account: \u0001 - IP: \u0001]
  4: #964 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #948 ()V
      #958 REF_invokeVirtual ext/mods/gameserver/network/GameClient.lambda$onDisconnection$0:()V
      #948 ()V
  5: #964 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #948 ()V
      #961 REF_invokeVirtual ext/mods/gameserver/network/GameClient.lambda$new$1:()V
      #948 ()V
InnerClasses:
  public static final #978= #32 of #14;   // GameClientState=class ext/mods/gameserver/network/GameClient$GameClientState of class ext/mods/gameserver/network/GameClient
  protected #979= #506 of #14;            // CleanupTask=class ext/mods/gameserver/network/GameClient$CleanupTask of class ext/mods/gameserver/network/GameClient
  public static final #984= #980 of #982; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
