// Bytecode for: ext.mods.gameserver.LoginServerThread
// File: ext\mods\gameserver\LoginServerThread.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/LoginServerThread.class
  Last modified 9 de jul de 2026; size 19574 bytes
  MD5 checksum da8bdee526b9905cece8775f395d52ad
  Compiled from "LoginServerThread.kt"
public final class ext.mods.gameserver.LoginServerThread extends java.lang.Thread
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/LoginServerThread
  super_class: #4                         // java/lang/Thread
  interfaces: 0, fields: 17, methods: 26, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/LoginServerThread
    #2 = Class              #1            // ext/mods/gameserver/LoginServerThread
    #3 = Utf8               java/lang/Thread
    #4 = Class              #3            // java/lang/Thread
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Utf8               LoginServerThread
    #8 = String             #7            // LoginServerThread
    #9 = Utf8               (Ljava/lang/String;)V
   #10 = NameAndType        #5:#9         // "<init>":(Ljava/lang/String;)V
   #11 = Methodref          #4.#10        // java/lang/Thread."<init>":(Ljava/lang/String;)V
   #12 = Utf8               java/util/concurrent/ConcurrentHashMap
   #13 = Class              #12           // java/util/concurrent/ConcurrentHashMap
   #14 = NameAndType        #5:#6         // "<init>":()V
   #15 = Methodref          #13.#14       // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #16 = Utf8               clients
   #17 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #18 = NameAndType        #16:#17       // clients:Ljava/util/concurrent/ConcurrentHashMap;
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/LoginServerThread.clients:Ljava/util/concurrent/ConcurrentHashMap;
   #20 = Utf8               ext/mods/Config
   #21 = Class              #20           // ext/mods/Config
   #22 = Utf8               MAXIMUM_ONLINE_USERS
   #23 = Utf8               I
   #24 = NameAndType        #22:#23       // MAXIMUM_ONLINE_USERS:I
   #25 = Fieldref           #21.#24       // ext/mods/Config.MAXIMUM_ONLINE_USERS:I
   #26 = Utf8               _maxPlayers
   #27 = NameAndType        #26:#23       // _maxPlayers:I
   #28 = Fieldref           #2.#27        // ext/mods/gameserver/LoginServerThread._maxPlayers:I
   #29 = Utf8               ext/mods/commons/network/ServerType
   #30 = Class              #29           // ext/mods/commons/network/ServerType
   #31 = Utf8               AUTO
   #32 = Utf8               Lext/mods/commons/network/ServerType;
   #33 = NameAndType        #31:#32       // AUTO:Lext/mods/commons/network/ServerType;
   #34 = Fieldref           #30.#33       // ext/mods/commons/network/ServerType.AUTO:Lext/mods/commons/network/ServerType;
   #35 = Utf8               _serverType
   #36 = NameAndType        #35:#32       // _serverType:Lext/mods/commons/network/ServerType;
   #37 = Fieldref           #2.#36        // ext/mods/gameserver/LoginServerThread._serverType:Lext/mods/commons/network/ServerType;
   #38 = Utf8               HEX_ID
   #39 = Utf8               [B
   #40 = NameAndType        #38:#39       // HEX_ID:[B
   #41 = Fieldref           #21.#40       // ext/mods/Config.HEX_ID:[B
   #42 = Utf8               REQUEST_ID
   #43 = NameAndType        #42:#23       // REQUEST_ID:I
   #44 = Fieldref           #21.#43       // ext/mods/Config.REQUEST_ID:I
   #45 = Utf8               requestId
   #46 = NameAndType        #45:#23       // requestId:I
   #47 = Fieldref           #2.#46        // ext/mods/gameserver/LoginServerThread.requestId:I
   #48 = Utf8               Companion
   #49 = Utf8               Lext/mods/gameserver/LoginServerThread$Companion;
   #50 = NameAndType        #48:#49       // Companion:Lext/mods/gameserver/LoginServerThread$Companion;
   #51 = Fieldref           #2.#50        // ext/mods/gameserver/LoginServerThread.Companion:Lext/mods/gameserver/LoginServerThread$Companion;
   #52 = Utf8               ext/mods/gameserver/LoginServerThread$Companion
   #53 = Class              #52           // ext/mods/gameserver/LoginServerThread$Companion
   #54 = Utf8               generateHex
   #55 = Utf8               (I)[B
   #56 = NameAndType        #54:#55       // generateHex:(I)[B
   #57 = Methodref          #53.#56       // ext/mods/gameserver/LoginServerThread$Companion.generateHex:(I)[B
   #58 = Utf8               hexId
   #59 = NameAndType        #58:#39       // hexId:[B
   #60 = Fieldref           #2.#59        // ext/mods/gameserver/LoginServerThread.hexId:[B
   #61 = Utf8               SERVER_ID
   #62 = NameAndType        #61:#23       // SERVER_ID:I
   #63 = Fieldref           #21.#62       // ext/mods/Config.SERVER_ID:I
   #64 = Utf8               setPriority
   #65 = Utf8               (I)V
   #66 = NameAndType        #64:#65       // setPriority:(I)V
   #67 = Methodref          #2.#66        // ext/mods/gameserver/LoginServerThread.setPriority:(I)V
   #68 = Utf8               tempHex
   #69 = Utf8               this
   #70 = Utf8               Lext/mods/gameserver/LoginServerThread;
   #71 = Class              #39           // "[B"
   #72 = Utf8               getMaxPlayers
   #73 = Utf8               ()I
   #74 = Utf8               setMaxPlayers
   #75 = Utf8               ext/mods/commons/network/AttributeType
   #76 = Class              #75           // ext/mods/commons/network/AttributeType
   #77 = Utf8               MAX_PLAYERS
   #78 = Utf8               Lext/mods/commons/network/AttributeType;
   #79 = NameAndType        #77:#78       // MAX_PLAYERS:Lext/mods/commons/network/AttributeType;
   #80 = Fieldref           #76.#79       // ext/mods/commons/network/AttributeType.MAX_PLAYERS:Lext/mods/commons/network/AttributeType;
   #81 = Utf8               sendServerStatus
   #82 = Utf8               (Lext/mods/commons/network/AttributeType;I)V
   #83 = NameAndType        #81:#82       // sendServerStatus:(Lext/mods/commons/network/AttributeType;I)V
   #84 = Methodref          #2.#83        // ext/mods/gameserver/LoginServerThread.sendServerStatus:(Lext/mods/commons/network/AttributeType;I)V
   #85 = Utf8               value
   #86 = Utf8               getServerType
   #87 = Utf8               ()Lext/mods/commons/network/ServerType;
   #88 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #89 = Utf8               setServerType
   #90 = Utf8               (Lext/mods/commons/network/ServerType;)V
   #91 = Utf8               STATUS
   #92 = NameAndType        #91:#78       // STATUS:Lext/mods/commons/network/AttributeType;
   #93 = Fieldref           #76.#92       // ext/mods/commons/network/AttributeType.STATUS:Lext/mods/commons/network/AttributeType;
   #94 = Utf8               getId
   #95 = NameAndType        #94:#73       // getId:()I
   #96 = Methodref          #30.#95       // ext/mods/commons/network/ServerType.getId:()I
   #97 = Utf8               getServerName
   #98 = Utf8               ()Ljava/lang/String;
   #99 = Utf8               _serverName
  #100 = Utf8               Ljava/lang/String;
  #101 = NameAndType        #99:#100      // _serverName:Ljava/lang/String;
  #102 = Fieldref           #2.#101       // ext/mods/gameserver/LoginServerThread._serverName:Ljava/lang/String;
  #103 = Utf8               BrProject
  #104 = String             #103          // BrProject
  #105 = Utf8               java/lang/String
  #106 = Class              #105          // java/lang/String
  #107 = Utf8               setMaxPlayer
  #108 = Utf8               Lkotlin/jvm/JvmName;
  #109 = Utf8               name
  #110 = NameAndType        #74:#65       // setMaxPlayers:(I)V
  #111 = Methodref          #2.#110       // ext/mods/gameserver/LoginServerThread.setMaxPlayers:(I)V
  #112 = Utf8               num
  #113 = Utf8               run
  #114 = Utf8               java/lang/Exception
  #115 = Class              #114          // java/lang/Exception
  #116 = Utf8               java/lang/InterruptedException
  #117 = Class              #116          // java/lang/InterruptedException
  #118 = Utf8               isInterrupted
  #119 = Utf8               ()Z
  #120 = NameAndType        #118:#119     // isInterrupted:()Z
  #121 = Methodref          #2.#120       // ext/mods/gameserver/LoginServerThread.isInterrupted:()Z
  #122 = Utf8               LOGGER
  #123 = Utf8               Lext/mods/commons/logging/CLogger;
  #124 = NameAndType        #122:#123     // LOGGER:Lext/mods/commons/logging/CLogger;
  #125 = Fieldref           #2.#124       // ext/mods/gameserver/LoginServerThread.LOGGER:Lext/mods/commons/logging/CLogger;
  #126 = Utf8               Connecting to login on {}:{}.
  #127 = String             #126          // Connecting to login on {}:{}.
  #128 = Utf8               java/lang/Object
  #129 = Class              #128          // java/lang/Object
  #130 = Utf8               GAMESERVER_LOGIN_HOSTNAME
  #131 = NameAndType        #130:#100     // GAMESERVER_LOGIN_HOSTNAME:Ljava/lang/String;
  #132 = Fieldref           #21.#131      // ext/mods/Config.GAMESERVER_LOGIN_HOSTNAME:Ljava/lang/String;
  #133 = Utf8               GAMESERVER_LOGIN_PORT
  #134 = NameAndType        #133:#23      // GAMESERVER_LOGIN_PORT:I
  #135 = Fieldref           #21.#134      // ext/mods/Config.GAMESERVER_LOGIN_PORT:I
  #136 = Utf8               java/lang/Integer
  #137 = Class              #136          // java/lang/Integer
  #138 = Utf8               valueOf
  #139 = Utf8               (I)Ljava/lang/Integer;
  #140 = NameAndType        #138:#139     // valueOf:(I)Ljava/lang/Integer;
  #141 = Methodref          #137.#140     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #142 = Utf8               ext/mods/commons/logging/CLogger
  #143 = Class              #142          // ext/mods/commons/logging/CLogger
  #144 = Utf8               info
  #145 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #146 = NameAndType        #144:#145     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #147 = Methodref          #143.#146     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #148 = Utf8               java/net/Socket
  #149 = Class              #148          // java/net/Socket
  #150 = Utf8               (Ljava/lang/String;I)V
  #151 = NameAndType        #5:#150       // "<init>":(Ljava/lang/String;I)V
  #152 = Methodref          #149.#151     // java/net/Socket."<init>":(Ljava/lang/String;I)V
  #153 = Utf8               loginSocket
  #154 = Utf8               Ljava/net/Socket;
  #155 = NameAndType        #153:#154     // loginSocket:Ljava/net/Socket;
  #156 = Fieldref           #2.#155       // ext/mods/gameserver/LoginServerThread.loginSocket:Ljava/net/Socket;
  #157 = Utf8               kotlin/jvm/internal/Intrinsics
  #158 = Class              #157          // kotlin/jvm/internal/Intrinsics
  #159 = Utf8               checkNotNull
  #160 = Utf8               (Ljava/lang/Object;)V
  #161 = NameAndType        #159:#160     // checkNotNull:(Ljava/lang/Object;)V
  #162 = Methodref          #158.#161     // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
  #163 = Utf8               getInputStream
  #164 = Utf8               ()Ljava/io/InputStream;
  #165 = NameAndType        #163:#164     // getInputStream:()Ljava/io/InputStream;
  #166 = Methodref          #149.#165     // java/net/Socket.getInputStream:()Ljava/io/InputStream;
  #167 = Utf8               inputStream
  #168 = Utf8               Ljava/io/InputStream;
  #169 = NameAndType        #167:#168     // inputStream:Ljava/io/InputStream;
  #170 = Fieldref           #2.#169       // ext/mods/gameserver/LoginServerThread.inputStream:Ljava/io/InputStream;
  #171 = Utf8               java/io/BufferedOutputStream
  #172 = Class              #171          // java/io/BufferedOutputStream
  #173 = Utf8               getOutputStream
  #174 = Utf8               ()Ljava/io/OutputStream;
  #175 = NameAndType        #173:#174     // getOutputStream:()Ljava/io/OutputStream;
  #176 = Methodref          #149.#175     // java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
  #177 = Utf8               (Ljava/io/OutputStream;)V
  #178 = NameAndType        #5:#177       // "<init>":(Ljava/io/OutputStream;)V
  #179 = Methodref          #172.#178     // java/io/BufferedOutputStream."<init>":(Ljava/io/OutputStream;)V
  #180 = Utf8               java/io/OutputStream
  #181 = Class              #180          // java/io/OutputStream
  #182 = Utf8               outputStream
  #183 = Utf8               Ljava/io/OutputStream;
  #184 = NameAndType        #182:#183     // outputStream:Ljava/io/OutputStream;
  #185 = Fieldref           #2.#184       // ext/mods/gameserver/LoginServerThread.outputStream:Ljava/io/OutputStream;
  #186 = Utf8               blowfishKey
  #187 = NameAndType        #186:#39      // blowfishKey:[B
  #188 = Fieldref           #2.#187       // ext/mods/gameserver/LoginServerThread.blowfishKey:[B
  #189 = Utf8               ext/mods/loginserver/crypt/NewCrypt
  #190 = Class              #189          // ext/mods/loginserver/crypt/NewCrypt
  #191 = Utf8               _;v.]05-31!|+-%xT!^[$\u0000
  #192 = String             #191          // _;v.]05-31!|+-%xT!^[$\u0000
  #193 = Methodref          #190.#10      // ext/mods/loginserver/crypt/NewCrypt."<init>":(Ljava/lang/String;)V
  #194 = Utf8               blowfish
  #195 = Utf8               Lext/mods/loginserver/crypt/NewCrypt;
  #196 = NameAndType        #194:#195     // blowfish:Lext/mods/loginserver/crypt/NewCrypt;
  #197 = Fieldref           #2.#196       // ext/mods/gameserver/LoginServerThread.blowfish:Lext/mods/loginserver/crypt/NewCrypt;
  #198 = Utf8               java/io/InputStream
  #199 = Class              #198          // java/io/InputStream
  #200 = Utf8               read
  #201 = NameAndType        #200:#73      // read:()I
  #202 = Methodref          #199.#201     // java/io/InputStream.read:()I
  #203 = Utf8               ([BII)I
  #204 = NameAndType        #200:#203     // read:([BII)I
  #205 = Methodref          #199.#204     // java/io/InputStream.read:([BII)I
  #206 = Utf8               decrypt
  #207 = Utf8               ([B)[B
  #208 = NameAndType        #206:#207     // decrypt:([B)[B
  #209 = Methodref          #190.#208     // ext/mods/loginserver/crypt/NewCrypt.decrypt:([B)[B
  #210 = Utf8               verifyChecksum
  #211 = Utf8               ([B)Z
  #212 = NameAndType        #210:#211     // verifyChecksum:([B)Z
  #213 = Methodref          #190.#212     // ext/mods/loginserver/crypt/NewCrypt.verifyChecksum:([B)Z
  #214 = Utf8               handlePacket
  #215 = Utf8               (I[B)V
  #216 = NameAndType        #214:#215     // handlePacket:(I[B)V
  #217 = Methodref          #2.#216       // ext/mods/gameserver/LoginServerThread.handlePacket:(I[B)V
  #218 = Utf8               close
  #219 = NameAndType        #218:#6       // close:()V
  #220 = Methodref          #149.#219     // java/net/Socket.close:()V
  #221 = Methodref          #181.#219     // java/io/OutputStream.close:()V
  #222 = Methodref          #199.#219     // java/io/InputStream.close:()V
  #223 = Utf8               No connection found with loginserver, next try in 10 seconds.
  #224 = String             #223          // No connection found with loginserver, next try in 10 seconds.
  #225 = Utf8               error
  #226 = NameAndType        #225:#160     // error:(Ljava/lang/Object;)V
  #227 = Methodref          #143.#226     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
  #228 = Long               10000l
  #230 = Utf8               sleep
  #231 = Utf8               (J)V
  #232 = NameAndType        #230:#231     // sleep:(J)V
  #233 = Methodref          #4.#232       // java/lang/Thread.sleep:(J)V
  #234 = Utf8               n
  #235 = Utf8               lengthLo
  #236 = Utf8               lengthHi
  #237 = Utf8               length
  #238 = Utf8               incoming
  #239 = Utf8               receivedBytes
  #240 = Utf8               left
  #241 = Utf8               bf
  #242 = Utf8               packetType
  #243 = Utf8               inp
  #244 = Utf8               <unused var>
  #245 = Utf8               Ljava/lang/Exception;
  #246 = Utf8               Ljava/lang/InterruptedException;
  #247 = Utf8               java/lang/Throwable
  #248 = Class              #247          // java/lang/Throwable
  #249 = Utf8               handleInitLs
  #250 = Utf8               ([B)V
  #251 = NameAndType        #249:#250     // handleInitLs:([B)V
  #252 = Methodref          #2.#251       // ext/mods/gameserver/LoginServerThread.handleInitLs:([B)V
  #253 = Utf8               handleLoginServerFail
  #254 = NameAndType        #253:#250     // handleLoginServerFail:([B)V
  #255 = Methodref          #2.#254       // ext/mods/gameserver/LoginServerThread.handleLoginServerFail:([B)V
  #256 = Utf8               handleAuthResponse
  #257 = NameAndType        #256:#250     // handleAuthResponse:([B)V
  #258 = Methodref          #2.#257       // ext/mods/gameserver/LoginServerThread.handleAuthResponse:([B)V
  #259 = Utf8               handlePlayerAuthResponse
  #260 = NameAndType        #259:#250     // handlePlayerAuthResponse:([B)V
  #261 = Methodref          #2.#260       // ext/mods/gameserver/LoginServerThread.handlePlayerAuthResponse:([B)V
  #262 = Utf8               handleKickPlayer
  #263 = NameAndType        #262:#250     // handleKickPlayer:([B)V
  #264 = Methodref          #2.#263       // ext/mods/gameserver/LoginServerThread.handleKickPlayer:([B)V
  #265 = Utf8               data
  #266 = Utf8               ext/mods/gameserver/network/loginserverpackets/InitLS
  #267 = Class              #266          // ext/mods/gameserver/network/loginserverpackets/InitLS
  #268 = NameAndType        #5:#250       // "<init>":([B)V
  #269 = Methodref          #267.#268     // ext/mods/gameserver/network/loginserverpackets/InitLS."<init>":([B)V
  #270 = Utf8               getRevision
  #271 = NameAndType        #270:#73      // getRevision:()I
  #272 = Methodref          #267.#271     // ext/mods/gameserver/network/loginserverpackets/InitLS.getRevision:()I
  #273 = Utf8               Revision mismatch between LS and GS.
  #274 = String             #273          // Revision mismatch between LS and GS.
  #275 = Utf8               warn
  #276 = NameAndType        #275:#160     // warn:(Ljava/lang/Object;)V
  #277 = Methodref          #143.#276     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #278 = Utf8               RSA
  #279 = String             #278          // RSA
  #280 = Utf8               java/security/KeyFactory
  #281 = Class              #280          // java/security/KeyFactory
  #282 = Utf8               getInstance
  #283 = Utf8               (Ljava/lang/String;)Ljava/security/KeyFactory;
  #284 = NameAndType        #282:#283     // getInstance:(Ljava/lang/String;)Ljava/security/KeyFactory;
  #285 = Methodref          #281.#284     // java/security/KeyFactory.getInstance:(Ljava/lang/String;)Ljava/security/KeyFactory;
  #286 = Utf8               java/math/BigInteger
  #287 = Class              #286          // java/math/BigInteger
  #288 = Utf8               getRSAKey
  #289 = Utf8               ()[B
  #290 = NameAndType        #288:#289     // getRSAKey:()[B
  #291 = Methodref          #267.#290     // ext/mods/gameserver/network/loginserverpackets/InitLS.getRSAKey:()[B
  #292 = Methodref          #287.#268     // java/math/BigInteger."<init>":([B)V
  #293 = Utf8               java/security/spec/RSAPublicKeySpec
  #294 = Class              #293          // java/security/spec/RSAPublicKeySpec
  #295 = Utf8               java/security/spec/RSAKeyGenParameterSpec
  #296 = Class              #295          // java/security/spec/RSAKeyGenParameterSpec
  #297 = Utf8               F4
  #298 = Utf8               Ljava/math/BigInteger;
  #299 = NameAndType        #297:#298     // F4:Ljava/math/BigInteger;
  #300 = Fieldref           #296.#299     // java/security/spec/RSAKeyGenParameterSpec.F4:Ljava/math/BigInteger;
  #301 = Utf8               (Ljava/math/BigInteger;Ljava/math/BigInteger;)V
  #302 = NameAndType        #5:#301       // "<init>":(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
  #303 = Methodref          #294.#302     // java/security/spec/RSAPublicKeySpec."<init>":(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
  #304 = Utf8               java/security/spec/KeySpec
  #305 = Class              #304          // java/security/spec/KeySpec
  #306 = Utf8               generatePublic
  #307 = Utf8               (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
  #308 = NameAndType        #306:#307     // generatePublic:(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
  #309 = Methodref          #281.#308     // java/security/KeyFactory.generatePublic:(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
  #310 = Utf8               null cannot be cast to non-null type java.security.interfaces.RSAPublicKey
  #311 = String             #310          // null cannot be cast to non-null type java.security.interfaces.RSAPublicKey
  #312 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #313 = NameAndType        #159:#312     // checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #314 = Methodref          #158.#313     // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #315 = Utf8               java/security/interfaces/RSAPublicKey
  #316 = Class              #315          // java/security/interfaces/RSAPublicKey
  #317 = Utf8               publicKey
  #318 = Utf8               Ljava/security/interfaces/RSAPublicKey;
  #319 = NameAndType        #317:#318     // publicKey:Ljava/security/interfaces/RSAPublicKey;
  #320 = Fieldref           #2.#319       // ext/mods/gameserver/LoginServerThread.publicKey:Ljava/security/interfaces/RSAPublicKey;
  #321 = Utf8               ext/mods/gameserver/network/gameserverpackets/BlowFishKey
  #322 = Class              #321          // ext/mods/gameserver/network/gameserverpackets/BlowFishKey
  #323 = Utf8               ([BLjava/security/interfaces/RSAPublicKey;)V
  #324 = NameAndType        #5:#323       // "<init>":([BLjava/security/interfaces/RSAPublicKey;)V
  #325 = Methodref          #322.#324     // ext/mods/gameserver/network/gameserverpackets/BlowFishKey."<init>":([BLjava/security/interfaces/RSAPublicKey;)V
  #326 = Utf8               ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket
  #327 = Class              #326          // ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket
  #328 = Utf8               sendPacket
  #329 = Utf8               (Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
  #330 = NameAndType        #328:#329     // sendPacket:(Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
  #331 = Methodref          #2.#330       // ext/mods/gameserver/LoginServerThread.sendPacket:(Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
  #332 = Methodref          #190.#268     // ext/mods/loginserver/crypt/NewCrypt."<init>":([B)V
  #333 = Utf8               ext/mods/gameserver/network/gameserverpackets/AuthRequest
  #334 = Class              #333          // ext/mods/gameserver/network/gameserverpackets/AuthRequest
  #335 = Utf8               ACCEPT_ALTERNATE_ID
  #336 = Utf8               Z
  #337 = NameAndType        #335:#336     // ACCEPT_ALTERNATE_ID:Z
  #338 = Fieldref           #21.#337      // ext/mods/Config.ACCEPT_ALTERNATE_ID:Z
  #339 = Utf8               HOSTNAME
  #340 = NameAndType        #339:#100     // HOSTNAME:Ljava/lang/String;
  #341 = Fieldref           #21.#340      // ext/mods/Config.HOSTNAME:Ljava/lang/String;
  #342 = Utf8               GAMESERVER_PORT
  #343 = NameAndType        #342:#23      // GAMESERVER_PORT:I
  #344 = Fieldref           #21.#343      // ext/mods/Config.GAMESERVER_PORT:I
  #345 = Utf8               RESERVE_HOST_ON_LOGIN
  #346 = NameAndType        #345:#336     // RESERVE_HOST_ON_LOGIN:Z
  #347 = Fieldref           #21.#346      // ext/mods/Config.RESERVE_HOST_ON_LOGIN:Z
  #348 = Utf8               (IZ[BLjava/lang/String;IZI)V
  #349 = NameAndType        #5:#348       // "<init>":(IZ[BLjava/lang/String;IZI)V
  #350 = Methodref          #334.#349     // ext/mods/gameserver/network/gameserverpackets/AuthRequest."<init>":(IZ[BLjava/lang/String;IZI)V
  #351 = Utf8               Troubles while init the public key sent by login.
  #352 = String             #351          // Troubles while init the public key sent by login.
  #353 = Utf8               kfac
  #354 = Utf8               Ljava/security/KeyFactory;
  #355 = Utf8               modulus
  #356 = Utf8               kspec
  #357 = Utf8               Ljava/security/spec/RSAPublicKeySpec;
  #358 = Utf8               e
  #359 = Utf8               init
  #360 = Utf8               Lext/mods/gameserver/network/loginserverpackets/InitLS;
  #361 = Utf8               ext/mods/gameserver/network/loginserverpackets/LoginServerFail
  #362 = Class              #361          // ext/mods/gameserver/network/loginserverpackets/LoginServerFail
  #363 = Methodref          #362.#268     // ext/mods/gameserver/network/loginserverpackets/LoginServerFail."<init>":([B)V
  #364 = Utf8               LoginServer registration failed: {}.
  #365 = String             #364          // LoginServer registration failed: {}.
  #366 = Utf8               getReasonString
  #367 = NameAndType        #366:#98      // getReasonString:()Ljava/lang/String;
  #368 = Methodref          #362.#367     // ext/mods/gameserver/network/loginserverpackets/LoginServerFail.getReasonString:()Ljava/lang/String;
  #369 = Utf8               lsf
  #370 = Utf8               Lext/mods/gameserver/network/loginserverpackets/LoginServerFail;
  #371 = Utf8               ext/mods/gameserver/network/loginserverpackets/AuthResponse
  #372 = Class              #371          // ext/mods/gameserver/network/loginserverpackets/AuthResponse
  #373 = Methodref          #372.#268     // ext/mods/gameserver/network/loginserverpackets/AuthResponse."<init>":([B)V
  #374 = Utf8               getServerId
  #375 = NameAndType        #374:#73      // getServerId:()I
  #376 = Methodref          #372.#375     // ext/mods/gameserver/network/loginserverpackets/AuthResponse.getServerId:()I
  #377 = Utf8               serverId
  #378 = NameAndType        #377:#23      // serverId:I
  #379 = Fieldref           #2.#378       // ext/mods/gameserver/LoginServerThread.serverId:I
  #380 = NameAndType        #97:#98       // getServerName:()Ljava/lang/String;
  #381 = Methodref          #372.#380     // ext/mods/gameserver/network/loginserverpackets/AuthResponse.getServerName:()Ljava/lang/String;
  #382 = Utf8               toString
  #383 = Utf8               (I)Ljava/lang/String;
  #384 = NameAndType        #382:#383     // toString:(I)Ljava/lang/String;
  #385 = Methodref          #287.#384     // java/math/BigInteger.toString:(I)Ljava/lang/String;
  #386 = Utf8               saveHexid
  #387 = Utf8               (ILjava/lang/String;)V
  #388 = NameAndType        #386:#387     // saveHexid:(ILjava/lang/String;)V
  #389 = Methodref          #21.#388      // ext/mods/Config.saveHexid:(ILjava/lang/String;)V
  #390 = Utf8               Registered as server: [{}] {}.
  #391 = String             #390          // Registered as server: [{}] {}.
  #392 = Utf8               ext/mods/gameserver/network/gameserverpackets/ServerStatus
  #393 = Class              #392          // ext/mods/gameserver/network/gameserverpackets/ServerStatus
  #394 = Methodref          #393.#14      // ext/mods/gameserver/network/gameserverpackets/ServerStatus."<init>":()V
  #395 = Utf8               SERVER_GMONLY
  #396 = NameAndType        #395:#336     // SERVER_GMONLY:Z
  #397 = Fieldref           #21.#396      // ext/mods/Config.SERVER_GMONLY:Z
  #398 = Utf8               GM_ONLY
  #399 = NameAndType        #398:#32      // GM_ONLY:Lext/mods/commons/network/ServerType;
  #400 = Fieldref           #30.#399      // ext/mods/commons/network/ServerType.GM_ONLY:Lext/mods/commons/network/ServerType;
  #401 = Utf8               addAttribute
  #402 = NameAndType        #401:#82      // addAttribute:(Lext/mods/commons/network/AttributeType;I)V
  #403 = Methodref          #393.#402     // ext/mods/gameserver/network/gameserverpackets/ServerStatus.addAttribute:(Lext/mods/commons/network/AttributeType;I)V
  #404 = Utf8               CLOCK
  #405 = NameAndType        #404:#78      // CLOCK:Lext/mods/commons/network/AttributeType;
  #406 = Fieldref           #76.#405      // ext/mods/commons/network/AttributeType.CLOCK:Lext/mods/commons/network/AttributeType;
  #407 = Utf8               SERVER_LIST_CLOCK
  #408 = NameAndType        #407:#336     // SERVER_LIST_CLOCK:Z
  #409 = Fieldref           #21.#408      // ext/mods/Config.SERVER_LIST_CLOCK:Z
  #410 = Utf8               (Lext/mods/commons/network/AttributeType;Z)V
  #411 = NameAndType        #401:#410     // addAttribute:(Lext/mods/commons/network/AttributeType;Z)V
  #412 = Methodref          #393.#411     // ext/mods/gameserver/network/gameserverpackets/ServerStatus.addAttribute:(Lext/mods/commons/network/AttributeType;Z)V
  #413 = Utf8               BRACKETS
  #414 = NameAndType        #413:#78      // BRACKETS:Lext/mods/commons/network/AttributeType;
  #415 = Fieldref           #76.#414      // ext/mods/commons/network/AttributeType.BRACKETS:Lext/mods/commons/network/AttributeType;
  #416 = Utf8               SERVER_LIST_BRACKET
  #417 = NameAndType        #416:#336     // SERVER_LIST_BRACKET:Z
  #418 = Fieldref           #21.#417      // ext/mods/Config.SERVER_LIST_BRACKET:Z
  #419 = Utf8               AGE_LIMIT
  #420 = NameAndType        #419:#78      // AGE_LIMIT:Lext/mods/commons/network/AttributeType;
  #421 = Fieldref           #76.#420      // ext/mods/commons/network/AttributeType.AGE_LIMIT:Lext/mods/commons/network/AttributeType;
  #422 = Utf8               SERVER_LIST_AGE
  #423 = NameAndType        #422:#23      // SERVER_LIST_AGE:I
  #424 = Fieldref           #21.#423      // ext/mods/Config.SERVER_LIST_AGE:I
  #425 = Utf8               TEST_SERVER
  #426 = NameAndType        #425:#78      // TEST_SERVER:Lext/mods/commons/network/AttributeType;
  #427 = Fieldref           #76.#426      // ext/mods/commons/network/AttributeType.TEST_SERVER:Lext/mods/commons/network/AttributeType;
  #428 = Utf8               SERVER_LIST_TESTSERVER
  #429 = NameAndType        #428:#336     // SERVER_LIST_TESTSERVER:Z
  #430 = Fieldref           #21.#429      // ext/mods/Config.SERVER_LIST_TESTSERVER:Z
  #431 = Utf8               PVP_SERVER
  #432 = NameAndType        #431:#78      // PVP_SERVER:Lext/mods/commons/network/AttributeType;
  #433 = Fieldref           #76.#432      // ext/mods/commons/network/AttributeType.PVP_SERVER:Lext/mods/commons/network/AttributeType;
  #434 = Utf8               SERVER_LIST_PVPSERVER
  #435 = NameAndType        #434:#336     // SERVER_LIST_PVPSERVER:Z
  #436 = Fieldref           #21.#435      // ext/mods/Config.SERVER_LIST_PVPSERVER:Z
  #437 = Utf8               ext/mods/gameserver/model/World
  #438 = Class              #437          // ext/mods/gameserver/model/World
  #439 = Utf8               ()Lext/mods/gameserver/model/World;
  #440 = NameAndType        #282:#439     // getInstance:()Lext/mods/gameserver/model/World;
  #441 = Methodref          #438.#440     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #442 = Utf8               getPlayers
  #443 = Utf8               ()Ljava/util/Collection;
  #444 = NameAndType        #442:#443     // getPlayers:()Ljava/util/Collection;
  #445 = Methodref          #438.#444     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #446 = Utf8               java/util/Collection
  #447 = Class              #446          // java/util/Collection
  #448 = Utf8               isEmpty
  #449 = NameAndType        #448:#119     // isEmpty:()Z
  #450 = InterfaceMethodref #447.#449     // java/util/Collection.isEmpty:()Z
  #451 = Utf8               java/lang/Iterable
  #452 = Class              #451          // java/lang/Iterable
  #453 = Utf8               java/util/ArrayList
  #454 = Class              #453          // java/util/ArrayList
  #455 = Utf8               kotlin/collections/CollectionsKt
  #456 = Class              #455          // kotlin/collections/CollectionsKt
  #457 = Utf8               collectionSizeOrDefault
  #458 = Utf8               (Ljava/lang/Iterable;I)I
  #459 = NameAndType        #457:#458     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #460 = Methodref          #456.#459     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #461 = NameAndType        #5:#65        // "<init>":(I)V
  #462 = Methodref          #454.#461     // java/util/ArrayList."<init>":(I)V
  #463 = Utf8               iterator
  #464 = Utf8               ()Ljava/util/Iterator;
  #465 = NameAndType        #463:#464     // iterator:()Ljava/util/Iterator;
  #466 = InterfaceMethodref #452.#465     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #467 = Utf8               java/util/Iterator
  #468 = Class              #467          // java/util/Iterator
  #469 = Utf8               hasNext
  #470 = NameAndType        #469:#119     // hasNext:()Z
  #471 = InterfaceMethodref #468.#470     // java/util/Iterator.hasNext:()Z
  #472 = Utf8               next
  #473 = Utf8               ()Ljava/lang/Object;
  #474 = NameAndType        #472:#473     // next:()Ljava/lang/Object;
  #475 = InterfaceMethodref #468.#474     // java/util/Iterator.next:()Ljava/lang/Object;
  #476 = Utf8               ext/mods/gameserver/model/actor/Player
  #477 = Class              #476          // ext/mods/gameserver/model/actor/Player
  #478 = Utf8               getAccountName
  #479 = NameAndType        #478:#98      // getAccountName:()Ljava/lang/String;
  #480 = Methodref          #477.#479     // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
  #481 = Utf8               add
  #482 = Utf8               (Ljava/lang/Object;)Z
  #483 = NameAndType        #481:#482     // add:(Ljava/lang/Object;)Z
  #484 = InterfaceMethodref #447.#483     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #485 = Utf8               java/util/List
  #486 = Class              #485          // java/util/List
  #487 = Utf8               (Ljava/util/Collection;)V
  #488 = NameAndType        #5:#487       // "<init>":(Ljava/util/Collection;)V
  #489 = Methodref          #454.#488     // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #490 = Utf8               ext/mods/gameserver/network/gameserverpackets/PlayerInGame
  #491 = Class              #490          // ext/mods/gameserver/network/gameserverpackets/PlayerInGame
  #492 = Utf8               (Ljava/util/List;)V
  #493 = NameAndType        #5:#492       // "<init>":(Ljava/util/List;)V
  #494 = Methodref          #491.#493     // ext/mods/gameserver/network/gameserverpackets/PlayerInGame."<init>":(Ljava/util/List;)V
  #495 = Utf8               $i$a$-map-LoginServerThread$handleAuthResponse$playerList$1
  #496 = Utf8               it
  #497 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #498 = Utf8               item$iv$iv
  #499 = Utf8               Ljava/lang/Object;
  #500 = Utf8               $i$f$mapTo
  #501 = Utf8               $this$mapTo$iv$iv
  #502 = Utf8               Ljava/lang/Iterable;
  #503 = Utf8               destination$iv$iv
  #504 = Utf8               Ljava/util/Collection;
  #505 = Utf8               $i$f$map
  #506 = Utf8               $this$map$iv
  #507 = Utf8               playerList
  #508 = Utf8               Ljava/util/ArrayList;
  #509 = Utf8               aresp
  #510 = Utf8               Lext/mods/gameserver/network/loginserverpackets/AuthResponse;
  #511 = Utf8               ss
  #512 = Utf8               Lext/mods/gameserver/network/gameserverpackets/ServerStatus;
  #513 = Utf8               players
  #514 = Utf8               ext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse
  #515 = Class              #514          // ext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse
  #516 = Methodref          #515.#268     // ext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse."<init>":([B)V
  #517 = Utf8               getAccount
  #518 = NameAndType        #517:#98      // getAccount:()Ljava/lang/String;
  #519 = Methodref          #515.#518     // ext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse.getAccount:()Ljava/lang/String;
  #520 = Utf8               get
  #521 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #522 = NameAndType        #520:#521     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #523 = Methodref          #13.#522      // java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #524 = Utf8               ext/mods/gameserver/network/GameClient
  #525 = Class              #524          // ext/mods/gameserver/network/GameClient
  #526 = Utf8               getRealIpAddress
  #527 = NameAndType        #526:#98      // getRealIpAddress:()Ljava/lang/String;
  #528 = Methodref          #515.#527     // ext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse.getRealIpAddress:()Ljava/lang/String;
  #529 = Utf8               setRealIpAddress
  #530 = NameAndType        #529:#9       // setRealIpAddress:(Ljava/lang/String;)V
  #531 = Methodref          #525.#530     // ext/mods/gameserver/network/GameClient.setRealIpAddress:(Ljava/lang/String;)V
  #532 = Utf8               isAuthed
  #533 = NameAndType        #532:#119     // isAuthed:()Z
  #534 = Methodref          #515.#533     // ext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse.isAuthed:()Z
  #535 = Methodref          #491.#10      // ext/mods/gameserver/network/gameserverpackets/PlayerInGame."<init>":(Ljava/lang/String;)V
  #536 = Utf8               ext/mods/gameserver/network/GameClient$GameClientState
  #537 = Class              #536          // ext/mods/gameserver/network/GameClient$GameClientState
  #538 = Utf8               AUTHED
  #539 = Utf8               Lext/mods/gameserver/network/GameClient$GameClientState;
  #540 = NameAndType        #538:#539     // AUTHED:Lext/mods/gameserver/network/GameClient$GameClientState;
  #541 = Fieldref           #537.#540     // ext/mods/gameserver/network/GameClient$GameClientState.AUTHED:Lext/mods/gameserver/network/GameClient$GameClientState;
  #542 = Utf8               setState
  #543 = Utf8               (Lext/mods/gameserver/network/GameClient$GameClientState;)V
  #544 = NameAndType        #542:#543     // setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
  #545 = Methodref          #525.#544     // ext/mods/gameserver/network/GameClient.setState:(Lext/mods/gameserver/network/GameClient$GameClientState;)V
  #546 = Utf8               getSessionId
  #547 = Utf8               ()Lext/mods/gameserver/network/SessionKey;
  #548 = NameAndType        #546:#547     // getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #549 = Methodref          #525.#548     // ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
  #550 = Utf8               ext/mods/gameserver/network/SessionKey
  #551 = Class              #550          // ext/mods/gameserver/network/SessionKey
  #552 = Utf8               playOkID1
  #553 = NameAndType        #552:#23      // playOkID1:I
  #554 = Fieldref           #551.#553     // ext/mods/gameserver/network/SessionKey.playOkID1:I
  #555 = Utf8               ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #556 = Class              #555          // ext/mods/gameserver/network/serverpackets/CharSelectInfo
  #557 = Methodref          #556.#151     // ext/mods/gameserver/network/serverpackets/CharSelectInfo."<init>":(Ljava/lang/String;I)V
  #558 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #559 = Class              #558          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
  #560 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #561 = NameAndType        #328:#560     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #562 = Methodref          #525.#561     // ext/mods/gameserver/network/GameClient.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #563 = Utf8               ext/mods/gameserver/network/serverpackets/AuthLoginFail
  #564 = Class              #563          // ext/mods/gameserver/network/serverpackets/AuthLoginFail
  #565 = Utf8               ext/mods/gameserver/enums/FailReason
  #566 = Class              #565          // ext/mods/gameserver/enums/FailReason
  #567 = Utf8               SYSTEM_ERROR_LOGIN_LATER
  #568 = Utf8               Lext/mods/gameserver/enums/FailReason;
  #569 = NameAndType        #567:#568     // SYSTEM_ERROR_LOGIN_LATER:Lext/mods/gameserver/enums/FailReason;
  #570 = Fieldref           #566.#569     // ext/mods/gameserver/enums/FailReason.SYSTEM_ERROR_LOGIN_LATER:Lext/mods/gameserver/enums/FailReason;
  #571 = Utf8               (Lext/mods/gameserver/enums/FailReason;)V
  #572 = NameAndType        #5:#571       // "<init>":(Lext/mods/gameserver/enums/FailReason;)V
  #573 = Methodref          #564.#572     // ext/mods/gameserver/network/serverpackets/AuthLoginFail."<init>":(Lext/mods/gameserver/enums/FailReason;)V
  #574 = Utf8               closeNow
  #575 = NameAndType        #574:#6       // closeNow:()V
  #576 = Methodref          #525.#575     // ext/mods/gameserver/network/GameClient.closeNow:()V
  #577 = Utf8               playOk
  #578 = Utf8               par
  #579 = Utf8               Lext/mods/gameserver/network/loginserverpackets/PlayerAuthResponse;
  #580 = Utf8               client
  #581 = Utf8               Lext/mods/gameserver/network/GameClient;
  #582 = Utf8               ext/mods/gameserver/network/loginserverpackets/KickPlayer
  #583 = Class              #582          // ext/mods/gameserver/network/loginserverpackets/KickPlayer
  #584 = Methodref          #583.#268     // ext/mods/gameserver/network/loginserverpackets/KickPlayer."<init>":([B)V
  #585 = Methodref          #583.#518     // ext/mods/gameserver/network/loginserverpackets/KickPlayer.getAccount:()Ljava/lang/String;
  #586 = Utf8               kickPlayer
  #587 = NameAndType        #586:#9       // kickPlayer:(Ljava/lang/String;)V
  #588 = Methodref          #2.#587       // ext/mods/gameserver/LoginServerThread.kickPlayer:(Ljava/lang/String;)V
  #589 = Utf8               kp
  #590 = Utf8               Lext/mods/gameserver/network/loginserverpackets/KickPlayer;
  #591 = Utf8               sendLogout
  #592 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #593 = Utf8               java/io/IOException
  #594 = Class              #593          // java/io/IOException
  #595 = Utf8               ext/mods/gameserver/network/gameserverpackets/PlayerLogout
  #596 = Class              #595          // ext/mods/gameserver/network/gameserverpackets/PlayerLogout
  #597 = Methodref          #596.#10      // ext/mods/gameserver/network/gameserverpackets/PlayerLogout."<init>":(Ljava/lang/String;)V
  #598 = Utf8               remove
  #599 = NameAndType        #598:#521     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #600 = Methodref          #13.#599      // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #601 = Utf8               Error while sending logout packet to login.
  #602 = String             #601          // Error while sending logout packet to login.
  #603 = Utf8               Ljava/io/IOException;
  #604 = Utf8               account
  #605 = Utf8               addClient
  #606 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/GameClient;)V
  #607 = Utf8               putIfAbsent
  #608 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #609 = NameAndType        #607:#608     // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #610 = Methodref          #13.#609      // java/util/concurrent/ConcurrentHashMap.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #611 = Utf8               isDetached
  #612 = NameAndType        #611:#119     // isDetached:()Z
  #613 = Methodref          #525.#612     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #614 = Utf8               ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest
  #615 = Class              #614          // ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest
  #616 = Methodref          #525.#479     // ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
  #617 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/SessionKey;)V
  #618 = NameAndType        #5:#617       // "<init>":(Ljava/lang/String;Lext/mods/gameserver/network/SessionKey;)V
  #619 = Methodref          #615.#618     // ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest."<init>":(Ljava/lang/String;Lext/mods/gameserver/network/SessionKey;)V
  #620 = Utf8               Error while sending player auth request.
  #621 = String             #620          // Error while sending player auth request.
  #622 = Utf8               session
  #623 = Utf8               Lext/mods/gameserver/network/SessionKey;
  #624 = Utf8               existing
  #625 = Utf8               (Ljava/lang/String;IIIILext/mods/gameserver/network/GameClient;)V
  #626 = Utf8               setAccountName
  #627 = NameAndType        #626:#9       // setAccountName:(Ljava/lang/String;)V
  #628 = Methodref          #525.#627     // ext/mods/gameserver/network/GameClient.setAccountName:(Ljava/lang/String;)V
  #629 = Utf8               (IIII)V
  #630 = NameAndType        #5:#629       // "<init>":(IIII)V
  #631 = Methodref          #551.#630     // ext/mods/gameserver/network/SessionKey."<init>":(IIII)V
  #632 = Utf8               setSessionId
  #633 = Utf8               (Lext/mods/gameserver/network/SessionKey;)V
  #634 = NameAndType        #632:#633     // setSessionId:(Lext/mods/gameserver/network/SessionKey;)V
  #635 = Methodref          #525.#634     // ext/mods/gameserver/network/GameClient.setSessionId:(Lext/mods/gameserver/network/SessionKey;)V
  #636 = Utf8               loginName
  #637 = Utf8               loginKey1
  #638 = Utf8               loginKey2
  #639 = Utf8               playKey1
  #640 = Utf8               playKey2
  #641 = Utf8               sendAccessLevel
  #642 = Utf8               ext/mods/gameserver/network/gameserverpackets/ChangeAccessLevel
  #643 = Class              #642          // ext/mods/gameserver/network/gameserverpackets/ChangeAccessLevel
  #644 = Methodref          #643.#151     // ext/mods/gameserver/network/gameserverpackets/ChangeAccessLevel."<init>":(Ljava/lang/String;I)V
  #645 = Utf8               level
  #646 = Utf8               type
  #647 = Utf8               getContent
  #648 = NameAndType        #647:#289     // getContent:()[B
  #649 = Methodref          #327.#648     // ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket.getContent:()[B
  #650 = Utf8               appendChecksum
  #651 = NameAndType        #650:#250     // appendChecksum:([B)V
  #652 = Methodref          #190.#651     // ext/mods/loginserver/crypt/NewCrypt.appendChecksum:([B)V
  #653 = Utf8               crypt
  #654 = NameAndType        #653:#207     // crypt:([B)[B
  #655 = Methodref          #190.#654     // ext/mods/loginserver/crypt/NewCrypt.crypt:([B)[B
  #656 = Utf8               write
  #657 = NameAndType        #656:#65      // write:(I)V
  #658 = Methodref          #181.#657     // java/io/OutputStream.write:(I)V
  #659 = NameAndType        #656:#250     // write:([B)V
  #660 = Methodref          #181.#659     // java/io/OutputStream.write:([B)V
  #661 = Utf8               flush
  #662 = NameAndType        #661:#6       // flush:()V
  #663 = Methodref          #181.#662     // java/io/OutputStream.flush:()V
  #664 = Utf8               kotlin/Unit
  #665 = Class              #664          // kotlin/Unit
  #666 = Utf8               INSTANCE
  #667 = Utf8               Lkotlin/Unit;
  #668 = NameAndType        #666:#667     // INSTANCE:Lkotlin/Unit;
  #669 = Fieldref           #665.#668     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #670 = Utf8               getMessage
  #671 = NameAndType        #670:#98      // getMessage:()Ljava/lang/String;
  #672 = Methodref          #594.#671     // java/io/IOException.getMessage:()Ljava/lang/String;
  #673 = Utf8               Error sending packet to LoginServer: \u0001
  #674 = String             #673          // Error sending packet to LoginServer: \u0001
  #675 = Utf8               java/lang/invoke/StringConcatFactory
  #676 = Class              #675          // java/lang/invoke/StringConcatFactory
  #677 = Utf8               makeConcatWithConstants
  #678 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #679 = NameAndType        #677:#678     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #680 = Methodref          #676.#679     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #681 = MethodHandle       6:#680        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #682 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #683 = NameAndType        #677:#682     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #684 = InvokeDynamic      #0:#683       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #685 = Utf8               $i$a$-synchronized-LoginServerThread$sendPacket$1
  #686 = Utf8               len
  #687 = Utf8               out
  #688 = Utf8               sl
  #689 = Utf8               Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;
  #690 = Utf8               instanceHolder$lambda$0
  #691 = Utf8               ()Lext/mods/gameserver/LoginServerThread;
  #692 = Methodref          #2.#14        // ext/mods/gameserver/LoginServerThread."<init>":()V
  #693 = Utf8               Lkotlin/jvm/JvmStatic;
  #694 = NameAndType        #282:#691     // getInstance:()Lext/mods/gameserver/LoginServerThread;
  #695 = Methodref          #53.#694      // ext/mods/gameserver/LoginServerThread$Companion.getInstance:()Lext/mods/gameserver/LoginServerThread;
  #696 = Utf8               size
  #697 = Utf8               access$getInstanceHolder$cp
  #698 = Utf8               ()Lkotlin/Lazy;
  #699 = Utf8               instanceHolder
  #700 = Utf8               Lkotlin/Lazy;
  #701 = NameAndType        #699:#700     // instanceHolder:Lkotlin/Lazy;
  #702 = Fieldref           #2.#701       // ext/mods/gameserver/LoginServerThread.instanceHolder:Lkotlin/Lazy;
  #703 = Utf8               <clinit>
  #704 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #705 = NameAndType        #5:#704       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #706 = Methodref          #53.#705      // ext/mods/gameserver/LoginServerThread$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #707 = Utf8               java/lang/Class
  #708 = Class              #707          // java/lang/Class
  #709 = Utf8               getName
  #710 = NameAndType        #709:#98      // getName:()Ljava/lang/String;
  #711 = Methodref          #708.#710     // java/lang/Class.getName:()Ljava/lang/String;
  #712 = Methodref          #143.#10      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #713 = MethodType         #473          //  ()Ljava/lang/Object;
  #714 = NameAndType        #690:#691     // instanceHolder$lambda$0:()Lext/mods/gameserver/LoginServerThread;
  #715 = Methodref          #2.#714       // ext/mods/gameserver/LoginServerThread.instanceHolder$lambda$0:()Lext/mods/gameserver/LoginServerThread;
  #716 = MethodHandle       6:#715        // REF_invokeStatic ext/mods/gameserver/LoginServerThread.instanceHolder$lambda$0:()Lext/mods/gameserver/LoginServerThread;
  #717 = MethodType         #691          //  ()Lext/mods/gameserver/LoginServerThread;
  #718 = Utf8               java/lang/invoke/LambdaMetafactory
  #719 = Class              #718          // java/lang/invoke/LambdaMetafactory
  #720 = Utf8               metafactory
  #721 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #722 = NameAndType        #720:#721     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #723 = Methodref          #719.#722     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #724 = MethodHandle       6:#723        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #725 = Utf8               invoke
  #726 = Utf8               ()Lkotlin/jvm/functions/Function0;
  #727 = NameAndType        #725:#726     // invoke:()Lkotlin/jvm/functions/Function0;
  #728 = InvokeDynamic      #1:#727       // #1:invoke:()Lkotlin/jvm/functions/Function0;
  #729 = Utf8               kotlin/LazyKt
  #730 = Class              #729          // kotlin/LazyKt
  #731 = Utf8               lazy
  #732 = Utf8               (Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
  #733 = NameAndType        #731:#732     // lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
  #734 = Methodref          #730.#733     // kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
  #735 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lext/mods/gameserver/network/GameClient;>;
  #736 = Utf8               REVISION
  #737 = Integer            258
  #738 = Utf8               Lkotlin/Lazy<Lext/mods/gameserver/LoginServerThread;>;
  #739 = Utf8               Lkotlin/Metadata;
  #740 = Utf8               mv
  #741 = Integer            2
  #742 = Integer            3
  #743 = Integer            0
  #744 = Utf8               k
  #745 = Integer            1
  #746 = Utf8               xi
  #747 = Integer            48
  #748 = Utf8               d1
  #749 = Utf8               \u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 F2\u00020\u0001:\u0001FB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\'\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0016H\u0007J\b\u0010+\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u00010\u0006J\u0016\u00106\u001a\u00020)2\u0006\u00105\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0007J6\u00106\u001a\u00020)2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0007J\u0016\u0010=\u001a\u00020)2\u0006\u00105\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0016J\u000e\u0010?\u001a\u00020)2\u0006\u00105\u001a\u00020\u0006J\u0018\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020EH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G
  #750 = Utf8               d2
  #751 = Utf8               Ljava/lang/Thread;
  #752 = Utf8
  #753 = Utf8               maxPlayers
  #754 = Utf8               serverType
  #755 = Utf8               Brproject
  #756 = Utf8               GameClientState
  #757 = Utf8               kotlin/jvm/internal/Ref$ObjectRef
  #758 = Class              #757          // kotlin/jvm/internal/Ref$ObjectRef
  #759 = Utf8               kotlin/jvm/internal/Ref
  #760 = Class              #759          // kotlin/jvm/internal/Ref
  #761 = Utf8               ObjectRef
  #762 = Utf8               LoginServerThread.kt
  #763 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #764 = Utf8               SMAP\nLoginServerThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginServerThread.kt\next/mods/gameserver/LoginServerThread\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1586#2:319\n1661#2,3:320\n*S KotlinDebug\n*F\n+ 1 LoginServerThread.kt\next/mods/gameserver/LoginServerThread\n*L\n204#1:319\n204#1:320,3\n*E\n
  #765 = Utf8               RuntimeInvisibleAnnotations
  #766 = Utf8               Signature
  #767 = Utf8               ConstantValue
  #768 = Utf8               Code
  #769 = Utf8               StackMapTable
  #770 = Utf8               LineNumberTable
  #771 = Utf8               LocalVariableTable
  #772 = Utf8               RuntimeInvisibleParameterAnnotations
  #773 = Utf8               RuntimeVisibleAnnotations
  #774 = Utf8               InnerClasses
  #775 = Utf8               SourceFile
  #776 = Utf8               SourceDebugExtension
  #777 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.LoginServerThread$Companion Companion;
    descriptor: Lext/mods/gameserver/LoginServerThread$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #88()
        org.jetbrains.annotations.NotNull

  public final int getMaxPlayers();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field _maxPlayers:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/LoginServerThread;

  public final void setMaxPlayers(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #28                 // Field _maxPlayers:I
         5: aload_0
         6: getstatic     #80                 // Field ext/mods/commons/network/AttributeType.MAX_PLAYERS:Lext/mods/commons/network/AttributeType;
         9: iload_1
        10: invokespecial #84                 // Method sendServerStatus:(Lext/mods/commons/network/AttributeType;I)V
        13: return
      LineNumberTable:
        line 79: 0
        line 80: 5
        line 81: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/LoginServerThread;
            0      14     1 value   I

  public final ext.mods.commons.network.ServerType getServerType();
    descriptor: ()Lext/mods/commons/network/ServerType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _serverType:Lext/mods/commons/network/ServerType;
         4: areturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/LoginServerThread;
    RuntimeInvisibleAnnotations:
      0: #88()
        org.jetbrains.annotations.NotNull

  public final void setServerType(ext.mods.commons.network.ServerType);
    descriptor: (Lext/mods/commons/network/ServerType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #37                 // Field _serverType:Lext/mods/commons/network/ServerType;
         5: aload_0
         6: getstatic     #93                 // Field ext/mods/commons/network/AttributeType.STATUS:Lext/mods/commons/network/AttributeType;
         9: aload_1
        10: invokevirtual #96                 // Method ext/mods/commons/network/ServerType.getId:()I
        13: invokespecial #84                 // Method sendServerStatus:(Lext/mods/commons/network/AttributeType;I)V
        16: return
      LineNumberTable:
        line 85: 0
        line 86: 5
        line 87: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/LoginServerThread;
            0      17     1 value   Lext/mods/commons/network/ServerType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #88()
          org.jetbrains.annotations.NotNull

  public final java.lang.String getServerName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _serverName:Ljava/lang/String;
         4: dup
         5: ifnonnull     11
         8: pop
         9: ldc           #104                // String BrProject
        11: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/LoginServerThread;
    RuntimeInvisibleAnnotations:
      0: #88()
        org.jetbrains.annotations.NotNull

  public final void setMaxPlayer(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #111                // Method setMaxPlayers:(I)V
         5: return
      LineNumberTable:
        line 104: 0
        line 105: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/LoginServerThread;
            0       6     1   num   I
    RuntimeInvisibleAnnotations:
      0: #108(#109=s#107)
        kotlin.jvm.JvmName(
          name="setMaxPlayer"
        )

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=11, args_size=1
         0: aload_0
         1: invokevirtual #121                // Method isInterrupted:()Z
         4: ifne          509
         7: nop
         8: getstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        11: ldc           #127                // String Connecting to login on {}:{}.
        13: iconst_2
        14: anewarray     #129                // class java/lang/Object
        17: astore_1
        18: aload_1
        19: iconst_0
        20: getstatic     #132                // Field ext/mods/Config.GAMESERVER_LOGIN_HOSTNAME:Ljava/lang/String;
        23: aastore
        24: aload_1
        25: iconst_1
        26: getstatic     #135                // Field ext/mods/Config.GAMESERVER_LOGIN_PORT:I
        29: invokestatic  #141                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: aastore
        33: aload_1
        34: invokevirtual #147                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        37: aload_0
        38: new           #149                // class java/net/Socket
        41: dup
        42: getstatic     #132                // Field ext/mods/Config.GAMESERVER_LOGIN_HOSTNAME:Ljava/lang/String;
        45: getstatic     #135                // Field ext/mods/Config.GAMESERVER_LOGIN_PORT:I
        48: invokespecial #152                // Method java/net/Socket."<init>":(Ljava/lang/String;I)V
        51: putfield      #156                // Field loginSocket:Ljava/net/Socket;
        54: aload_0
        55: aload_0
        56: getfield      #156                // Field loginSocket:Ljava/net/Socket;
        59: dup
        60: invokestatic  #162                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        63: invokevirtual #166                // Method java/net/Socket.getInputStream:()Ljava/io/InputStream;
        66: putfield      #170                // Field inputStream:Ljava/io/InputStream;
        69: aload_0
        70: new           #172                // class java/io/BufferedOutputStream
        73: dup
        74: aload_0
        75: getfield      #156                // Field loginSocket:Ljava/net/Socket;
        78: dup
        79: invokestatic  #162                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        82: invokevirtual #176                // Method java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        85: invokespecial #179                // Method java/io/BufferedOutputStream."<init>":(Ljava/io/OutputStream;)V
        88: checkcast     #181                // class java/io/OutputStream
        91: putfield      #185                // Field outputStream:Ljava/io/OutputStream;
        94: aload_0
        95: getstatic     #51                 // Field Companion:Lext/mods/gameserver/LoginServerThread$Companion;
        98: bipush        40
       100: invokevirtual #57                 // Method ext/mods/gameserver/LoginServerThread$Companion.generateHex:(I)[B
       103: putfield      #188                // Field blowfishKey:[B
       106: aload_0
       107: new           #190                // class ext/mods/loginserver/crypt/NewCrypt
       110: dup
       111: ldc           #192                // String _;v.]05-31!|+-%xT!^[$\u0000
       113: invokespecial #193                // Method ext/mods/loginserver/crypt/NewCrypt."<init>":(Ljava/lang/String;)V
       116: putfield      #197                // Field blowfish:Lext/mods/loginserver/crypt/NewCrypt;
       119: aload_0
       120: getfield      #170                // Field inputStream:Ljava/io/InputStream;
       123: dup
       124: invokestatic  #162                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
       127: astore_1
       128: aload_0
       129: invokevirtual #121                // Method isInterrupted:()Z
       132: ifne          290
       135: aload_1
       136: invokevirtual #202                // Method java/io/InputStream.read:()I
       139: istore_2
       140: iload_2
       141: iflt          290
       144: aload_1
       145: invokevirtual #202                // Method java/io/InputStream.read:()I
       148: istore_3
       149: iload_3
       150: iflt          290
       153: iload_3
       154: sipush        256
       157: imul
       158: iload_2
       159: iadd
       160: istore        4
       162: iload         4
       164: iconst_2
       165: if_icmplt     290
       168: iload         4
       170: iconst_2
       171: isub
       172: newarray       byte
       174: astore        5
       176: iconst_0
       177: istore        6
       179: iload         4
       181: iconst_2
       182: isub
       183: istore        7
       185: iload         6
       187: iload         4
       189: iconst_2
       190: isub
       191: if_icmpge     229
       194: aload_1
       195: aload         5
       197: iload         6
       199: iload         7
       201: invokevirtual #205                // Method java/io/InputStream.read:([BII)I
       204: istore        8
       206: iload         8
       208: iconst_m1
       209: if_icmpeq     229
       212: iload         6
       214: iload         8
       216: iadd
       217: istore        6
       219: iload         7
       221: iload         8
       223: isub
       224: istore        7
       226: goto          185
       229: iload         6
       231: iload         4
       233: iconst_2
       234: isub
       235: if_icmpne     290
       238: aload_0
       239: getfield      #197                // Field blowfish:Lext/mods/loginserver/crypt/NewCrypt;
       242: dup
       243: ifnonnull     250
       246: pop
       247: goto          290
       250: astore        8
       252: aload         8
       254: aload         5
       256: invokevirtual #209                // Method ext/mods/loginserver/crypt/NewCrypt.decrypt:([B)[B
       259: astore        9
       261: aload         9
       263: invokestatic  #213                // Method ext/mods/loginserver/crypt/NewCrypt.verifyChecksum:([B)Z
       266: ifeq          290
       269: aload         9
       271: iconst_0
       272: baload
       273: sipush        255
       276: iand
       277: istore        10
       279: aload_0
       280: iload         10
       282: aload         9
       284: invokespecial #217                // Method handlePacket:(I[B)V
       287: goto          128
       290: nop
       291: aload_0
       292: aconst_null
       293: putfield      #197                // Field blowfish:Lext/mods/loginserver/crypt/NewCrypt;
       296: aload_0
       297: getfield      #156                // Field loginSocket:Ljava/net/Socket;
       300: dup
       301: ifnull        310
       304: invokevirtual #220                // Method java/net/Socket.close:()V
       307: goto          311
       310: pop
       311: aload_0
       312: getfield      #185                // Field outputStream:Ljava/io/OutputStream;
       315: dup
       316: ifnull        325
       319: invokevirtual #221                // Method java/io/OutputStream.close:()V
       322: goto          326
       325: pop
       326: aload_0
       327: getfield      #170                // Field inputStream:Ljava/io/InputStream;
       330: dup
       331: ifnull        340
       334: invokevirtual #222                // Method java/io/InputStream.close:()V
       337: goto          345
       340: pop
       341: goto          345
       344: astore_2
       345: aload_0
       346: invokevirtual #121                // Method isInterrupted:()Z
       349: ifeq          353
       352: return
       353: goto          497
       356: astore_1
       357: getstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       360: ldc           #224                // String No connection found with loginserver, next try in 10 seconds.
       362: invokevirtual #227                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
       365: nop
       366: aload_0
       367: aconst_null
       368: putfield      #197                // Field blowfish:Lext/mods/loginserver/crypt/NewCrypt;
       371: aload_0
       372: getfield      #156                // Field loginSocket:Ljava/net/Socket;
       375: dup
       376: ifnull        385
       379: invokevirtual #220                // Method java/net/Socket.close:()V
       382: goto          386
       385: pop
       386: aload_0
       387: getfield      #185                // Field outputStream:Ljava/io/OutputStream;
       390: dup
       391: ifnull        400
       394: invokevirtual #221                // Method java/io/OutputStream.close:()V
       397: goto          401
       400: pop
       401: aload_0
       402: getfield      #170                // Field inputStream:Ljava/io/InputStream;
       405: dup
       406: ifnull        415
       409: invokevirtual #222                // Method java/io/InputStream.close:()V
       412: goto          420
       415: pop
       416: goto          420
       419: astore_2
       420: aload_0
       421: invokevirtual #121                // Method isInterrupted:()Z
       424: ifeq          428
       427: return
       428: goto          497
       431: astore_1
       432: nop
       433: aload_0
       434: aconst_null
       435: putfield      #197                // Field blowfish:Lext/mods/loginserver/crypt/NewCrypt;
       438: aload_0
       439: getfield      #156                // Field loginSocket:Ljava/net/Socket;
       442: dup
       443: ifnull        452
       446: invokevirtual #220                // Method java/net/Socket.close:()V
       449: goto          453
       452: pop
       453: aload_0
       454: getfield      #185                // Field outputStream:Ljava/io/OutputStream;
       457: dup
       458: ifnull        467
       461: invokevirtual #221                // Method java/io/OutputStream.close:()V
       464: goto          468
       467: pop
       468: aload_0
       469: getfield      #170                // Field inputStream:Ljava/io/InputStream;
       472: dup
       473: ifnull        482
       476: invokevirtual #222                // Method java/io/InputStream.close:()V
       479: goto          487
       482: pop
       483: goto          487
       486: astore_3
       487: aload_0
       488: invokevirtual #121                // Method isInterrupted:()Z
       491: ifeq          495
       494: return
       495: aload_1
       496: athrow
       497: nop
       498: ldc2_w        #228                // long 10000l
       501: invokestatic  #233                // Method java/lang/Thread.sleep:(J)V
       504: goto          0
       507: astore_1
       508: return
       509: return
      Exception table:
         from    to  target type
           290   341   344   Class java/lang/Exception
           365   416   419   Class java/lang/Exception
             7   290   356   Class java/lang/Exception
           432   483   486   Class java/lang/Exception
             7   290   431   any
           356   365   431   any
           431   432   431   any
           497   504   507   Class java/lang/InterruptedException
      StackMapTable: number_of_entries = 35
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 127
          locals = [ class java/io/InputStream ]
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/LoginServerThread, class java/io/InputStream, int, int, int, class "[B", int, int ]
          stack = []
        frame_type = 43 /* same */
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/loginserver/crypt/NewCrypt ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/LoginServerThread, class java/io/InputStream ]
          stack = []
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ class java/net/Socket ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/io/OutputStream ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/io/InputStream ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/LoginServerThread ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/LoginServerThread, class java/lang/Exception ]
          stack = [ class java/net/Socket ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/io/OutputStream ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/io/InputStream ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/LoginServerThread ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/LoginServerThread, class java/lang/Throwable ]
          stack = [ class java/net/Socket ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/io/OutputStream ]
        frame_type = 0 /* same */
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/io/InputStream ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 7 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/LoginServerThread, class java/lang/Object ]
          stack = []
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/lang/InterruptedException ]
        frame_type = 250 /* chop */
          offset_delta = 1
      LineNumberTable:
        line 107: 0
        line 108: 7
        line 109: 8
        line 110: 37
        line 111: 54
        line 112: 69
        line 113: 94
        line 114: 106
        line 115: 119
        line 116: 128
        line 117: 135
        line 118: 140
        line 119: 144
        line 120: 149
        line 121: 153
        line 122: 162
        line 123: 168
        line 124: 176
        line 125: 179
        line 126: 185
        line 127: 194
        line 128: 206
        line 129: 212
        line 130: 219
        line 132: 229
        line 133: 238
        line 134: 252
        line 135: 261
        line 136: 269
        line 137: 279
        line 142: 290
        line 143: 291
        line 144: 296
        line 145: 311
        line 146: 326
        line 147: 344
        line 148: 345
        line 149: 353
        line 139: 356
        line 140: 357
        line 142: 365
        line 143: 366
        line 144: 371
        line 145: 386
        line 146: 401
        line 147: 419
        line 148: 420
        line 149: 428
        line 142: 431
        line 143: 433
        line 144: 438
        line 145: 453
        line 146: 468
        line 147: 486
        line 148: 487
        line 150: 497
        line 151: 498
        line 152: 507
        line 153: 508
        line 156: 509
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          206      20     8     n   I
          140     147     2 lengthLo   I
          149     138     3 lengthHi   I
          162     125     4 length   I
          176     111     5 incoming   [B
          179     108     6 receivedBytes   I
          185     102     7  left   I
          252      35     8    bf   Lext/mods/loginserver/crypt/NewCrypt;
          261      26     9 decrypt   [B
          279       8    10 packetType   I
          128     162     1   inp   Ljava/io/InputStream;
          357       8     1 <unused var>   Ljava/lang/Exception;
          508       1     1 <unused var>   Ljava/lang/InterruptedException;
            0     510     0  this   Lext/mods/gameserver/LoginServerThread;

  public final void sendLogout(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: nop
         6: aload_0
         7: new           #596                // class ext/mods/gameserver/network/gameserverpackets/PlayerLogout
        10: dup
        11: aload_1
        12: invokespecial #597                // Method ext/mods/gameserver/network/gameserverpackets/PlayerLogout."<init>":(Ljava/lang/String;)V
        15: checkcast     #327                // class ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket
        18: invokespecial #331                // Method sendPacket:(Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
        21: aload_0
        22: getfield      #19                 // Field clients:Ljava/util/concurrent/ConcurrentHashMap;
        25: aload_1
        26: invokevirtual #600                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        29: pop
        30: goto          67
        33: astore_2
        34: getstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        37: ldc_w         #602                // String Error while sending logout packet to login.
        40: invokevirtual #227                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
        43: aload_0
        44: getfield      #19                 // Field clients:Ljava/util/concurrent/ConcurrentHashMap;
        47: aload_1
        48: invokevirtual #600                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        51: pop
        52: goto          67
        55: astore_2
        56: aload_0
        57: getfield      #19                 // Field clients:Ljava/util/concurrent/ConcurrentHashMap;
        60: aload_1
        61: invokevirtual #600                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        64: pop
        65: aload_2
        66: athrow
        67: return
      Exception table:
         from    to  target type
             5    21    33   Class java/io/IOException
             5    21    55   any
            33    43    55   any
            55    56    55   any
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 11 /* same */
      LineNumberTable:
        line 227: 0
        line 228: 5
        line 229: 6
        line 233: 21
        line 234: 30
        line 230: 33
        line 231: 34
        line 233: 43
        line 234: 52
        line 233: 55
        line 235: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34       9     2     e   Ljava/io/IOException;
            0      68     0  this   Lext/mods/gameserver/LoginServerThread;
            0      68     1 account   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #592()
          org.jetbrains.annotations.Nullable

  public final void addClient(java.lang.String, ext.mods.gameserver.network.GameClient);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/network/GameClient;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=3
         0: aload_0
         1: getfield      #19                 // Field clients:Ljava/util/concurrent/ConcurrentHashMap;
         4: aload_1
         5: aload_2
         6: invokevirtual #610                // Method java/util/concurrent/ConcurrentHashMap.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         9: checkcast     #525                // class ext/mods/gameserver/network/GameClient
        12: astore_3
        13: aload_2
        14: invokevirtual #613                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        17: ifeq          21
        20: return
        21: aload_3
        22: ifnonnull     86
        25: nop
        26: aload_2
        27: invokevirtual #549                // Method ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
        30: astore        4
        32: aload         4
        34: ifnull        60
        37: aload_0
        38: new           #615                // class ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest
        41: dup
        42: aload_2
        43: invokevirtual #616                // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
        46: aload         4
        48: invokespecial #619                // Method ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest."<init>":(Ljava/lang/String;Lext/mods/gameserver/network/SessionKey;)V
        51: checkcast     #327                // class ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket
        54: invokespecial #331                // Method sendPacket:(Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
        57: goto          94
        60: getstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        63: ldc_w         #621                // String Error while sending player auth request.
        66: invokevirtual #227                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
        69: goto          94
        72: astore        4
        74: getstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        77: ldc_w         #621                // String Error while sending player auth request.
        80: invokevirtual #227                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
        83: goto          94
        86: aload_2
        87: invokevirtual #576                // Method ext/mods/gameserver/network/GameClient.closeNow:()V
        90: aload_3
        91: invokevirtual #576                // Method ext/mods/gameserver/network/GameClient.closeNow:()V
        94: return
      Exception table:
         from    to  target type
            25    69    72   Class java/io/IOException
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/network/GameClient ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/network/SessionKey ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/LoginServerThread, class java/lang/String, class ext/mods/gameserver/network/GameClient, class ext/mods/gameserver/network/GameClient ]
          stack = [ class java/io/IOException ]
        frame_type = 13 /* same */
        frame_type = 7 /* same */
      LineNumberTable:
        line 237: 0
        line 238: 13
        line 239: 21
        line 240: 25
        line 241: 26
        line 242: 32
        line 243: 37
        line 245: 60
        line 247: 72
        line 248: 74
        line 251: 86
        line 252: 90
        line 254: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           32      37     4 session   Lext/mods/gameserver/network/SessionKey;
           74       9     4     e   Ljava/io/IOException;
           13      82     3 existing   Lext/mods/gameserver/network/GameClient;
            0      95     0  this   Lext/mods/gameserver/LoginServerThread;
            0      95     1 account   Ljava/lang/String;
            0      95     2 client   Lext/mods/gameserver/network/GameClient;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #88()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #88()
          org.jetbrains.annotations.NotNull

  public final void addClient(java.lang.String, int, int, int, int, ext.mods.gameserver.network.GameClient);
    descriptor: (Ljava/lang/String;IIIILext/mods/gameserver/network/GameClient;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=9, args_size=7
         0: aload_0
         1: getfield      #19                 // Field clients:Ljava/util/concurrent/ConcurrentHashMap;
         4: aload_1
         5: aload         6
         7: invokevirtual #610                // Method java/util/concurrent/ConcurrentHashMap.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        10: checkcast     #525                // class ext/mods/gameserver/network/GameClient
        13: astore        7
        15: aload         7
        17: ifnull        26
        20: aload         7
        22: invokevirtual #576                // Method ext/mods/gameserver/network/GameClient.closeNow:()V
        25: return
        26: aload         6
        28: invokevirtual #613                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        31: ifeq          35
        34: return
        35: nop
        36: aload         6
        38: aload_1
        39: invokevirtual #628                // Method ext/mods/gameserver/network/GameClient.setAccountName:(Ljava/lang/String;)V
        42: aload         6
        44: new           #551                // class ext/mods/gameserver/network/SessionKey
        47: dup
        48: iload_2
        49: iload_3
        50: iload         4
        52: iload         5
        54: invokespecial #631                // Method ext/mods/gameserver/network/SessionKey."<init>":(IIII)V
        57: invokevirtual #635                // Method ext/mods/gameserver/network/GameClient.setSessionId:(Lext/mods/gameserver/network/SessionKey;)V
        60: aload_0
        61: new           #615                // class ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest
        64: dup
        65: aload         6
        67: invokevirtual #616                // Method ext/mods/gameserver/network/GameClient.getAccountName:()Ljava/lang/String;
        70: aload         6
        72: invokevirtual #549                // Method ext/mods/gameserver/network/GameClient.getSessionId:()Lext/mods/gameserver/network/SessionKey;
        75: dup
        76: invokestatic  #162                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        79: invokespecial #619                // Method ext/mods/gameserver/network/gameserverpackets/PlayerAuthRequest."<init>":(Ljava/lang/String;Lext/mods/gameserver/network/SessionKey;)V
        82: checkcast     #327                // class ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket
        85: invokespecial #331                // Method sendPacket:(Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
        88: goto          102
        91: astore        8
        93: getstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        96: ldc_w         #621                // String Error while sending player auth request.
        99: invokevirtual #227                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;)V
       102: return
      Exception table:
         from    to  target type
            35    88    91   Class java/io/IOException
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/network/GameClient ]
        frame_type = 8 /* same */
        frame_type = 119 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
        frame_type = 10 /* same */
      LineNumberTable:
        line 256: 0
        line 257: 15
        line 258: 20
        line 259: 25
        line 261: 26
        line 262: 35
        line 263: 36
        line 264: 42
        line 265: 60
        line 266: 91
        line 267: 93
        line 269: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           93       9     8     e   Ljava/io/IOException;
           15      88     7 existing   Lext/mods/gameserver/network/GameClient;
            0     103     0  this   Lext/mods/gameserver/LoginServerThread;
            0     103     1 loginName   Ljava/lang/String;
            0     103     2 loginKey1   I
            0     103     3 loginKey2   I
            0     103     4 playKey1   I
            0     103     5 playKey2   I
            0     103     6 client   Lext/mods/gameserver/network/GameClient;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #88()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
        0: #88()
          org.jetbrains.annotations.NotNull

  public final void sendAccessLevel(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=4, args_size=3
         0: nop
         1: aload_0
         2: new           #643                // class ext/mods/gameserver/network/gameserverpackets/ChangeAccessLevel
         5: dup
         6: aload_1
         7: iload_2
         8: invokespecial #644                // Method ext/mods/gameserver/network/gameserverpackets/ChangeAccessLevel."<init>":(Ljava/lang/String;I)V
        11: checkcast     #327                // class ext/mods/gameserver/network/gameserverpackets/GameServerBasePacket
        14: invokespecial #331                // Method sendPacket:(Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;)V
        17: goto          21
        20: astore_3
        21: return
      Exception table:
         from    to  target type
             0    17    20   Class java/io/IOException
      StackMapTable: number_of_entries = 2
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 271: 0
        line 272: 1
        line 273: 20
        line 274: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/LoginServerThread;
            0      22     1 account   Ljava/lang/String;
            0      22     2 level   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #88()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final void kickPlayer(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #19                 // Field clients:Ljava/util/concurrent/ConcurrentHashMap;
         4: aload_1
         5: invokevirtual #523                // Method java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
         8: checkcast     #525                // class ext/mods/gameserver/network/GameClient
        11: dup
        12: ifnull        21
        15: invokevirtual #576                // Method ext/mods/gameserver/network/GameClient.closeNow:()V
        18: goto          22
        21: pop
        22: return
      StackMapTable: number_of_entries = 2
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/GameClient ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 276: 0
        line 277: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/LoginServerThread;
            0      23     1 account   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #88()
          org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.LoginServerThread getInstance();
    descriptor: ()Lext/mods/gameserver/LoginServerThread;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #51                 // Field Companion:Lext/mods/gameserver/LoginServerThread$Companion;
         3: invokevirtual #695                // Method ext/mods/gameserver/LoginServerThread$Companion.getInstance:()Lext/mods/gameserver/LoginServerThread;
         6: areturn
      LineNumberTable:
        line 310: 6
    RuntimeVisibleAnnotations:
      0: #693()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #88()
        org.jetbrains.annotations.NotNull

  public static final byte[] generateHex(int);
    descriptor: (I)[B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #51                 // Field Companion:Lext/mods/gameserver/LoginServerThread$Companion;
         3: iload_0
         4: invokevirtual #57                 // Method ext/mods/gameserver/LoginServerThread$Companion.generateHex:(I)[B
         7: areturn
      LineNumberTable:
        line 316: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  size   I
    RuntimeVisibleAnnotations:
      0: #693()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #88()
        org.jetbrains.annotations.NotNull

  public static final kotlin.Lazy access$getInstanceHolder$cp();
    descriptor: ()Lkotlin/Lazy;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #702                // Field instanceHolder:Lkotlin/Lazy;
         3: areturn
      LineNumberTable:
        line 64: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #53                 // class ext/mods/gameserver/LoginServerThread$Companion
         3: dup
         4: aconst_null
         5: invokespecial #706                // Method ext/mods/gameserver/LoginServerThread$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #51                 // Field Companion:Lext/mods/gameserver/LoginServerThread$Companion;
        11: new           #143                // class ext/mods/commons/logging/CLogger
        14: dup
        15: ldc           #2                  // class ext/mods/gameserver/LoginServerThread
        17: invokevirtual #711                // Method java/lang/Class.getName:()Ljava/lang/String;
        20: invokespecial #712                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        23: putstatic     #125                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: invokedynamic #728,  0            // InvokeDynamic #1:invoke:()Lkotlin/jvm/functions/Function0;
        31: invokestatic  #734                // Method kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
        34: putstatic     #702                // Field instanceHolder:Lkotlin/Lazy;
        37: return
      LineNumberTable:
        line 307: 11
        line 308: 26
}
InnerClasses:
  public static final #48= #53 of #2;     // Companion=class ext/mods/gameserver/LoginServerThread$Companion of class ext/mods/gameserver/LoginServerThread
  public static final #756= #537 of #525; // GameClientState=class ext/mods/gameserver/network/GameClient$GameClientState of class ext/mods/gameserver/network/GameClient
  public static final #761= #758 of #760; // ObjectRef=class kotlin/jvm/internal/Ref$ObjectRef of class kotlin/jvm/internal/Ref
SourceFile: "LoginServerThread.kt"
SourceDebugExtension:
  SMAP
  LoginServerThread.kt
  Kotlin
  *S Kotlin
  *F
  + 1 LoginServerThread.kt
  ext/mods/gameserver/LoginServerThread
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,318:1
  1586#2:319
  1661#2,3:320
  *S KotlinDebug
  *F
  + 1 LoginServerThread.kt
  ext/mods/gameserver/LoginServerThread
  *L
  204#1:319
  204#1:320,3
  *E
RuntimeVisibleAnnotations:
  0: #739(#740=[I#741,I#742,I#743],#744=I#745,#746=I#747,#748=[s#749],#750=[s#70,s#751,s#5,s#6,s#16,s#17,s#752,s#581,s#153,s#154,s#167,s#168,s#182,s#183,s#194,s#195,s#186,s#752,s#317,s#318,s#58,s#45,s#752,s#377,s#99,s#85,s#753,s#72,s#73,s#74,s#65,s#32,s#754,s#86,s#87,s#89,s#90,s#26,s#35,s#97,s#107,s#752,s#112,s#113,s#214,s#242,s#265,s#249,s#253,s#256,s#259,s#262,s#591,s#604,s#605,s#580,s#636,s#637,s#638,s#639,s#640,s#641,s#645,s#586,s#81,s#646,s#78,s#328,s#688,s#689,s#48,s#755])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 F2\u00020\u0001:\u0001FB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\'\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0016H\u0007J\b\u0010+\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u00010\u0006J\u0016\u00106\u001a\u00020)2\u0006\u00105\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0007J6\u00106\u001a\u00020)2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0007J\u0016\u0010=\u001a\u00020)2\u0006\u00105\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0016J\u000e\u0010?\u001a\u00020)2\u0006\u00105\u001a\u00020\u0006J\u0018\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020EH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"]
      d2=["Lext/mods/gameserver/LoginServerThread;","Ljava/lang/Thread;","<init>","()V","clients","Ljava/util/concurrent/ConcurrentHashMap;","","Lext/mods/gameserver/network/GameClient;","loginSocket","Ljava/net/Socket;","inputStream","Ljava/io/InputStream;","outputStream","Ljava/io/OutputStream;","blowfish","Lext/mods/loginserver/crypt/NewCrypt;","blowfishKey","","publicKey","Ljava/security/interfaces/RSAPublicKey;","hexId","requestId","","serverId","_serverName","value","maxPlayers","getMaxPlayers","()I","setMaxPlayers","(I)V","Lext/mods/commons/network/ServerType;","serverType","getServerType","()Lext/mods/commons/network/ServerType;","setServerType","(Lext/mods/commons/network/ServerType;)V","_maxPlayers","_serverType","getServerName","setMaxPlayer","","num","run","handlePacket","packetType","data","handleInitLs","handleLoginServerFail","handleAuthResponse","handlePlayerAuthResponse","handleKickPlayer","sendLogout","account","addClient","client","loginName","loginKey1","loginKey2","playKey1","playKey2","sendAccessLevel","level","kickPlayer","sendServerStatus","type","Lext/mods/commons/network/AttributeType;","sendPacket","sl","Lext/mods/gameserver/network/gameserverpackets/GameServerBasePacket;","Companion","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #763(#85=[s#764])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nLoginServerThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginServerThread.kt\next/mods/gameserver/LoginServerThread\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1586#2:319\n1661#2,3:320\n*S KotlinDebug\n*F\n+ 1 LoginServerThread.kt\next/mods/gameserver/LoginServerThread\n*L\n204#1:319\n204#1:320,3\n*E\n"]
    )
BootstrapMethods:
  0: #681 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #674 Error sending packet to LoginServer: \u0001
  1: #724 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #713 ()Ljava/lang/Object;
      #716 REF_invokeStatic ext/mods/gameserver/LoginServerThread.instanceHolder$lambda$0:()Lext/mods/gameserver/LoginServerThread;
      #717 ()Lext/mods/gameserver/LoginServerThread;
