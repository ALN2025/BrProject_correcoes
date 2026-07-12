// Bytecode for: ext.mods.gameserver.network.GamePacketHandler
// File: ext\mods\gameserver\network\GamePacketHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/GamePacketHandler.class
  Last modified 9 de jul de 2026; size 25986 bytes
  MD5 checksum 948b03c74044882cd9f856d8ebd2451a
  Compiled from "GamePacketHandler.java"
public final class ext.mods.gameserver.network.GamePacketHandler extends java.lang.Object implements ext.mods.commons.mmocore.IPacketHandler<ext.mods.gameserver.network.GameClient>, ext.mods.commons.mmocore.IClientFactory<ext.mods.gameserver.network.GameClient>, ext.mods.commons.mmocore.IMMOExecutor<ext.mods.gameserver.network.GameClient>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #42                         // ext/mods/gameserver/network/GamePacketHandler
  super_class: #2                         // java/lang/Object
  interfaces: 3, fields: 1, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/GameClient.dropPacket:()Z
    #8 = Class              #10           // ext/mods/gameserver/network/GameClient
    #9 = NameAndType        #11:#12       // dropPacket:()Z
   #10 = Utf8               ext/mods/gameserver/network/GameClient
   #11 = Utf8               dropPacket
   #12 = Utf8               ()Z
   #13 = Methodref          #14.#15       // java/nio/ByteBuffer.get:()B
   #14 = Class              #16           // java/nio/ByteBuffer
   #15 = NameAndType        #17:#18       // get:()B
   #16 = Utf8               java/nio/ByteBuffer
   #17 = Utf8               get
   #18 = Utf8               ()B
   #19 = Methodref          #8.#20        // ext/mods/gameserver/network/GameClient.getState:()Lext/mods/gameserver/network/GameClient$GameClientState;
   #20 = NameAndType        #21:#22       // getState:()Lext/mods/gameserver/network/GameClient$GameClientState;
   #21 = Utf8               getState
   #22 = Utf8               ()Lext/mods/gameserver/network/GameClient$GameClientState;
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/network/GamePacketHandler$1.$SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
   #24 = Class              #26           // ext/mods/gameserver/network/GamePacketHandler$1
   #25 = NameAndType        #27:#28       // $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
   #26 = Utf8               ext/mods/gameserver/network/GamePacketHandler$1
   #27 = Utf8               $SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState
   #28 = Utf8               [I
   #29 = Methodref          #30.#31       // ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
   #30 = Class              #32           // ext/mods/gameserver/network/GameClient$GameClientState
   #31 = NameAndType        #33:#34       // ordinal:()I
   #32 = Utf8               ext/mods/gameserver/network/GameClient$GameClientState
   #33 = Utf8               ordinal
   #34 = Utf8               ()I
   #35 = Class              #36           // ext/mods/gameserver/network/clientpackets/SendProtocolVersion
   #36 = Utf8               ext/mods/gameserver/network/clientpackets/SendProtocolVersion
   #37 = Methodref          #35.#3        // ext/mods/gameserver/network/clientpackets/SendProtocolVersion."<init>":()V
   #38 = Class              #39           // ext/mods/gameserver/network/clientpackets/AuthLogin
   #39 = Utf8               ext/mods/gameserver/network/clientpackets/AuthLogin
   #40 = Methodref          #38.#3        // ext/mods/gameserver/network/clientpackets/AuthLogin."<init>":()V
   #41 = Methodref          #42.#43       // ext/mods/gameserver/network/GamePacketHandler.printDebug:(ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
   #42 = Class              #44           // ext/mods/gameserver/network/GamePacketHandler
   #43 = NameAndType        #45:#46       // printDebug:(ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
   #44 = Utf8               ext/mods/gameserver/network/GamePacketHandler
   #45 = Utf8               printDebug
   #46 = Utf8               (ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
   #47 = Class              #48           // ext/mods/gameserver/network/clientpackets/Logout
   #48 = Utf8               ext/mods/gameserver/network/clientpackets/Logout
   #49 = Methodref          #47.#3        // ext/mods/gameserver/network/clientpackets/Logout."<init>":()V
   #50 = Class              #51           // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate
   #51 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCharacterCreate
   #52 = Methodref          #50.#3        // ext/mods/gameserver/network/clientpackets/RequestCharacterCreate."<init>":()V
   #53 = Class              #54           // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete
   #54 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCharacterDelete
   #55 = Methodref          #53.#3        // ext/mods/gameserver/network/clientpackets/RequestCharacterDelete."<init>":()V
   #56 = Class              #57           // ext/mods/gameserver/network/clientpackets/RequestGameStart
   #57 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGameStart
   #58 = Methodref          #56.#3        // ext/mods/gameserver/network/clientpackets/RequestGameStart."<init>":()V
   #59 = Class              #60           // ext/mods/gameserver/network/clientpackets/RequestNewCharacter
   #60 = Utf8               ext/mods/gameserver/network/clientpackets/RequestNewCharacter
   #61 = Methodref          #59.#3        // ext/mods/gameserver/network/clientpackets/RequestNewCharacter."<init>":()V
   #62 = Class              #63           // ext/mods/gameserver/network/clientpackets/CharacterRestore
   #63 = Utf8               ext/mods/gameserver/network/clientpackets/CharacterRestore
   #64 = Methodref          #62.#3        // ext/mods/gameserver/network/clientpackets/CharacterRestore."<init>":()V
   #65 = Class              #66           // ext/mods/gameserver/network/clientpackets/RequestPledgeCrest
   #66 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeCrest
   #67 = Methodref          #65.#3        // ext/mods/gameserver/network/clientpackets/RequestPledgeCrest."<init>":()V
   #68 = Class              #69           // ext/mods/gameserver/network/clientpackets/EnterWorld
   #69 = Utf8               ext/mods/gameserver/network/clientpackets/EnterWorld
   #70 = Methodref          #68.#3        // ext/mods/gameserver/network/clientpackets/EnterWorld."<init>":()V
   #71 = Methodref          #14.#72       // java/nio/ByteBuffer.remaining:()I
   #72 = NameAndType        #73:#34       // remaining:()I
   #73 = Utf8               remaining
   #74 = Methodref          #14.#75       // java/nio/ByteBuffer.getShort:()S
   #75 = NameAndType        #76:#77       // getShort:()S
   #76 = Utf8               getShort
   #77 = Utf8               ()S
   #78 = Integer            65535
   #79 = Fieldref           #42.#80       // ext/mods/gameserver/network/GamePacketHandler.LOGGER:Lext/mods/commons/logging/CLogger;
   #80 = NameAndType        #81:#82       // LOGGER:Lext/mods/commons/logging/CLogger;
   #81 = Utf8               LOGGER
   #82 = Utf8               Lext/mods/commons/logging/CLogger;
   #83 = String             #84           // {} sent a 0xd0 without the second opcode.
   #84 = Utf8               {} sent a 0xd0 without the second opcode.
   #85 = Methodref          #8.#86        // ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
   #86 = NameAndType        #87:#88       // toString:()Ljava/lang/String;
   #87 = Utf8               toString
   #88 = Utf8               ()Ljava/lang/String;
   #89 = Methodref          #90.#91       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #90 = Class              #92           // ext/mods/commons/logging/CLogger
   #91 = NameAndType        #93:#94       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #92 = Utf8               ext/mods/commons/logging/CLogger
   #93 = Utf8               warn
   #94 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #95 = Class              #96           // ext/mods/gameserver/network/clientpackets/RequestManorList
   #96 = Utf8               ext/mods/gameserver/network/clientpackets/RequestManorList
   #97 = Methodref          #95.#3        // ext/mods/gameserver/network/clientpackets/RequestManorList."<init>":()V
   #98 = Methodref          #42.#99       // ext/mods/gameserver/network/GamePacketHandler.printDebugDoubleOpcode:(IILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
   #99 = NameAndType        #100:#101     // printDebugDoubleOpcode:(IILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
  #100 = Utf8               printDebugDoubleOpcode
  #101 = Utf8               (IILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
  #102 = Class              #103          // ext/mods/gameserver/network/clientpackets/RequestQuestList
  #103 = Utf8               ext/mods/gameserver/network/clientpackets/RequestQuestList
  #104 = Methodref          #102.#3       // ext/mods/gameserver/network/clientpackets/RequestQuestList."<init>":()V
  #105 = Class              #106          // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation
  #106 = Utf8               ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation
  #107 = Methodref          #105.#3       // ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation."<init>":()V
  #108 = Class              #109          // ext/mods/gameserver/network/clientpackets/Action
  #109 = Utf8               ext/mods/gameserver/network/clientpackets/Action
  #110 = Methodref          #108.#3       // ext/mods/gameserver/network/clientpackets/Action."<init>":()V
  #111 = Class              #112          // ext/mods/gameserver/network/clientpackets/AttackRequest
  #112 = Utf8               ext/mods/gameserver/network/clientpackets/AttackRequest
  #113 = Methodref          #111.#3       // ext/mods/gameserver/network/clientpackets/AttackRequest."<init>":()V
  #114 = Class              #115          // ext/mods/gameserver/network/clientpackets/RequestItemList
  #115 = Utf8               ext/mods/gameserver/network/clientpackets/RequestItemList
  #116 = Methodref          #114.#3       // ext/mods/gameserver/network/clientpackets/RequestItemList."<init>":()V
  #117 = Class              #118          // ext/mods/gameserver/network/clientpackets/RequestUnEquipItem
  #118 = Utf8               ext/mods/gameserver/network/clientpackets/RequestUnEquipItem
  #119 = Methodref          #117.#3       // ext/mods/gameserver/network/clientpackets/RequestUnEquipItem."<init>":()V
  #120 = Class              #121          // ext/mods/gameserver/network/clientpackets/RequestDropItem
  #121 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDropItem
  #122 = Methodref          #120.#3       // ext/mods/gameserver/network/clientpackets/RequestDropItem."<init>":()V
  #123 = Class              #124          // ext/mods/gameserver/network/clientpackets/UseItem
  #124 = Utf8               ext/mods/gameserver/network/clientpackets/UseItem
  #125 = Methodref          #123.#3       // ext/mods/gameserver/network/clientpackets/UseItem."<init>":()V
  #126 = Class              #127          // ext/mods/gameserver/network/clientpackets/TradeRequest
  #127 = Utf8               ext/mods/gameserver/network/clientpackets/TradeRequest
  #128 = Methodref          #126.#3       // ext/mods/gameserver/network/clientpackets/TradeRequest."<init>":()V
  #129 = Class              #130          // ext/mods/gameserver/network/clientpackets/AddTradeItem
  #130 = Utf8               ext/mods/gameserver/network/clientpackets/AddTradeItem
  #131 = Methodref          #129.#3       // ext/mods/gameserver/network/clientpackets/AddTradeItem."<init>":()V
  #132 = Class              #133          // ext/mods/gameserver/network/clientpackets/TradeDone
  #133 = Utf8               ext/mods/gameserver/network/clientpackets/TradeDone
  #134 = Methodref          #132.#3       // ext/mods/gameserver/network/clientpackets/TradeDone."<init>":()V
  #135 = Class              #136          // ext/mods/gameserver/network/clientpackets/DummyPacket
  #136 = Utf8               ext/mods/gameserver/network/clientpackets/DummyPacket
  #137 = Methodref          #135.#3       // ext/mods/gameserver/network/clientpackets/DummyPacket."<init>":()V
  #138 = Class              #139          // ext/mods/gameserver/network/clientpackets/RequestSocialAction
  #139 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSocialAction
  #140 = Methodref          #138.#3       // ext/mods/gameserver/network/clientpackets/RequestSocialAction."<init>":()V
  #141 = Class              #142          // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType
  #142 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangeMoveType
  #143 = Methodref          #141.#3       // ext/mods/gameserver/network/clientpackets/RequestChangeMoveType."<init>":()V
  #144 = Class              #145          // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType
  #145 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangeWaitType
  #146 = Methodref          #144.#3       // ext/mods/gameserver/network/clientpackets/RequestChangeWaitType."<init>":()V
  #147 = Class              #148          // ext/mods/gameserver/network/clientpackets/RequestSellItem
  #148 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSellItem
  #149 = Methodref          #147.#3       // ext/mods/gameserver/network/clientpackets/RequestSellItem."<init>":()V
  #150 = Class              #151          // ext/mods/gameserver/network/clientpackets/RequestBuyItem
  #151 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBuyItem
  #152 = Methodref          #150.#3       // ext/mods/gameserver/network/clientpackets/RequestBuyItem."<init>":()V
  #153 = Class              #154          // ext/mods/gameserver/network/clientpackets/RequestLinkHtml
  #154 = Utf8               ext/mods/gameserver/network/clientpackets/RequestLinkHtml
  #155 = Methodref          #153.#3       // ext/mods/gameserver/network/clientpackets/RequestLinkHtml."<init>":()V
  #156 = Class              #157          // ext/mods/gameserver/network/clientpackets/RequestBypassToServer
  #157 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBypassToServer
  #158 = Methodref          #156.#3       // ext/mods/gameserver/network/clientpackets/RequestBypassToServer."<init>":()V
  #159 = Class              #160          // ext/mods/gameserver/network/clientpackets/RequestBBSwrite
  #160 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBBSwrite
  #161 = Methodref          #159.#3       // ext/mods/gameserver/network/clientpackets/RequestBBSwrite."<init>":()V
  #162 = Class              #163          // ext/mods/gameserver/network/clientpackets/RequestJoinPledge
  #163 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinPledge
  #164 = Methodref          #162.#3       // ext/mods/gameserver/network/clientpackets/RequestJoinPledge."<init>":()V
  #165 = Class              #166          // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge
  #166 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge
  #167 = Methodref          #165.#3       // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge."<init>":()V
  #168 = Class              #169          // ext/mods/gameserver/network/clientpackets/RequestWithdrawPledge
  #169 = Utf8               ext/mods/gameserver/network/clientpackets/RequestWithdrawPledge
  #170 = Methodref          #168.#3       // ext/mods/gameserver/network/clientpackets/RequestWithdrawPledge."<init>":()V
  #171 = Class              #172          // ext/mods/gameserver/network/clientpackets/RequestOustPledgeMember
  #172 = Utf8               ext/mods/gameserver/network/clientpackets/RequestOustPledgeMember
  #173 = Methodref          #171.#3       // ext/mods/gameserver/network/clientpackets/RequestOustPledgeMember."<init>":()V
  #174 = Class              #175          // ext/mods/gameserver/network/clientpackets/RequestJoinParty
  #175 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinParty
  #176 = Methodref          #174.#3       // ext/mods/gameserver/network/clientpackets/RequestJoinParty."<init>":()V
  #177 = Class              #178          // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty
  #178 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty
  #179 = Methodref          #177.#3       // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty."<init>":()V
  #180 = Class              #181          // ext/mods/gameserver/network/clientpackets/RequestWithdrawParty
  #181 = Utf8               ext/mods/gameserver/network/clientpackets/RequestWithdrawParty
  #182 = Methodref          #180.#3       // ext/mods/gameserver/network/clientpackets/RequestWithdrawParty."<init>":()V
  #183 = Class              #184          // ext/mods/gameserver/network/clientpackets/RequestOustPartyMember
  #184 = Utf8               ext/mods/gameserver/network/clientpackets/RequestOustPartyMember
  #185 = Methodref          #183.#3       // ext/mods/gameserver/network/clientpackets/RequestOustPartyMember."<init>":()V
  #186 = Class              #187          // ext/mods/gameserver/network/clientpackets/RequestMagicSkillUse
  #187 = Utf8               ext/mods/gameserver/network/clientpackets/RequestMagicSkillUse
  #188 = Methodref          #186.#3       // ext/mods/gameserver/network/clientpackets/RequestMagicSkillUse."<init>":()V
  #189 = Class              #190          // ext/mods/gameserver/network/clientpackets/Appearing
  #190 = Utf8               ext/mods/gameserver/network/clientpackets/Appearing
  #191 = Methodref          #189.#3       // ext/mods/gameserver/network/clientpackets/Appearing."<init>":()V
  #192 = Fieldref           #193.#194     // ext/mods/Config.ALLOW_WAREHOUSE:Z
  #193 = Class              #195          // ext/mods/Config
  #194 = NameAndType        #196:#197     // ALLOW_WAREHOUSE:Z
  #195 = Utf8               ext/mods/Config
  #196 = Utf8               ALLOW_WAREHOUSE
  #197 = Utf8               Z
  #198 = Class              #199          // ext/mods/gameserver/network/clientpackets/SendWarehouseDepositList
  #199 = Utf8               ext/mods/gameserver/network/clientpackets/SendWarehouseDepositList
  #200 = Methodref          #198.#3       // ext/mods/gameserver/network/clientpackets/SendWarehouseDepositList."<init>":()V
  #201 = Class              #202          // ext/mods/gameserver/network/clientpackets/SendWarehouseWithdrawList
  #202 = Utf8               ext/mods/gameserver/network/clientpackets/SendWarehouseWithdrawList
  #203 = Methodref          #201.#3       // ext/mods/gameserver/network/clientpackets/SendWarehouseWithdrawList."<init>":()V
  #204 = Class              #205          // ext/mods/gameserver/network/clientpackets/RequestShortCutReg
  #205 = Utf8               ext/mods/gameserver/network/clientpackets/RequestShortCutReg
  #206 = Methodref          #204.#3       // ext/mods/gameserver/network/clientpackets/RequestShortCutReg."<init>":()V
  #207 = Class              #208          // ext/mods/gameserver/network/clientpackets/RequestShortCutDel
  #208 = Utf8               ext/mods/gameserver/network/clientpackets/RequestShortCutDel
  #209 = Methodref          #207.#3       // ext/mods/gameserver/network/clientpackets/RequestShortCutDel."<init>":()V
  #210 = Class              #211          // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore
  #211 = Utf8               ext/mods/gameserver/network/clientpackets/CannotMoveAnymore
  #212 = Methodref          #210.#3       // ext/mods/gameserver/network/clientpackets/CannotMoveAnymore."<init>":()V
  #213 = Class              #214          // ext/mods/gameserver/network/clientpackets/RequestTargetCancel
  #214 = Utf8               ext/mods/gameserver/network/clientpackets/RequestTargetCancel
  #215 = Methodref          #213.#3       // ext/mods/gameserver/network/clientpackets/RequestTargetCancel."<init>":()V
  #216 = Class              #217          // ext/mods/gameserver/network/clientpackets/Say2
  #217 = Utf8               ext/mods/gameserver/network/clientpackets/Say2
  #218 = Methodref          #216.#3       // ext/mods/gameserver/network/clientpackets/Say2."<init>":()V
  #219 = Class              #220          // ext/mods/gameserver/network/clientpackets/RequestPledgeMemberList
  #220 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeMemberList
  #221 = Methodref          #219.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeMemberList."<init>":()V
  #222 = Class              #223          // ext/mods/gameserver/network/clientpackets/RequestSkillList
  #223 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSkillList
  #224 = Methodref          #222.#3       // ext/mods/gameserver/network/clientpackets/RequestSkillList."<init>":()V
  #225 = Class              #226          // ext/mods/gameserver/network/clientpackets/RequestGetOnVehicle
  #226 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGetOnVehicle
  #227 = Methodref          #225.#3       // ext/mods/gameserver/network/clientpackets/RequestGetOnVehicle."<init>":()V
  #228 = Class              #229          // ext/mods/gameserver/network/clientpackets/RequestGetOffVehicle
  #229 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGetOffVehicle
  #230 = Methodref          #228.#3       // ext/mods/gameserver/network/clientpackets/RequestGetOffVehicle."<init>":()V
  #231 = Class              #232          // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest
  #232 = Utf8               ext/mods/gameserver/network/clientpackets/AnswerTradeRequest
  #233 = Methodref          #231.#3       // ext/mods/gameserver/network/clientpackets/AnswerTradeRequest."<init>":()V
  #234 = Class              #235          // ext/mods/gameserver/network/clientpackets/RequestActionUse
  #235 = Utf8               ext/mods/gameserver/network/clientpackets/RequestActionUse
  #236 = Methodref          #234.#3       // ext/mods/gameserver/network/clientpackets/RequestActionUse."<init>":()V
  #237 = Class              #238          // ext/mods/gameserver/network/clientpackets/RequestRestart
  #238 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRestart
  #239 = Methodref          #237.#3       // ext/mods/gameserver/network/clientpackets/RequestRestart."<init>":()V
  #240 = Class              #241          // ext/mods/gameserver/network/clientpackets/ValidatePosition
  #241 = Utf8               ext/mods/gameserver/network/clientpackets/ValidatePosition
  #242 = Methodref          #240.#3       // ext/mods/gameserver/network/clientpackets/ValidatePosition."<init>":()V
  #243 = Class              #244          // ext/mods/gameserver/network/clientpackets/StartRotating
  #244 = Utf8               ext/mods/gameserver/network/clientpackets/StartRotating
  #245 = Methodref          #243.#3       // ext/mods/gameserver/network/clientpackets/StartRotating."<init>":()V
  #246 = Class              #247          // ext/mods/gameserver/network/clientpackets/FinishRotating
  #247 = Utf8               ext/mods/gameserver/network/clientpackets/FinishRotating
  #248 = Methodref          #246.#3       // ext/mods/gameserver/network/clientpackets/FinishRotating."<init>":()V
  #249 = Class              #250          // ext/mods/gameserver/network/clientpackets/RequestStartPledgeWar
  #250 = Utf8               ext/mods/gameserver/network/clientpackets/RequestStartPledgeWar
  #251 = Methodref          #249.#3       // ext/mods/gameserver/network/clientpackets/RequestStartPledgeWar."<init>":()V
  #252 = Class              #253          // ext/mods/gameserver/network/clientpackets/RequestReplyStartPledgeWar
  #253 = Utf8               ext/mods/gameserver/network/clientpackets/RequestReplyStartPledgeWar
  #254 = Methodref          #252.#3       // ext/mods/gameserver/network/clientpackets/RequestReplyStartPledgeWar."<init>":()V
  #255 = Class              #256          // ext/mods/gameserver/network/clientpackets/RequestStopPledgeWar
  #256 = Utf8               ext/mods/gameserver/network/clientpackets/RequestStopPledgeWar
  #257 = Methodref          #255.#3       // ext/mods/gameserver/network/clientpackets/RequestStopPledgeWar."<init>":()V
  #258 = Class              #259          // ext/mods/gameserver/network/clientpackets/RequestReplyStopPledgeWar
  #259 = Utf8               ext/mods/gameserver/network/clientpackets/RequestReplyStopPledgeWar
  #260 = Methodref          #258.#3       // ext/mods/gameserver/network/clientpackets/RequestReplyStopPledgeWar."<init>":()V
  #261 = Class              #262          // ext/mods/gameserver/network/clientpackets/RequestSurrenderPledgeWar
  #262 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSurrenderPledgeWar
  #263 = Methodref          #261.#3       // ext/mods/gameserver/network/clientpackets/RequestSurrenderPledgeWar."<init>":()V
  #264 = Class              #265          // ext/mods/gameserver/network/clientpackets/RequestReplySurrenderPledgeWar
  #265 = Utf8               ext/mods/gameserver/network/clientpackets/RequestReplySurrenderPledgeWar
  #266 = Methodref          #264.#3       // ext/mods/gameserver/network/clientpackets/RequestReplySurrenderPledgeWar."<init>":()V
  #267 = Class              #268          // ext/mods/gameserver/network/clientpackets/RequestSetPledgeCrest
  #268 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSetPledgeCrest
  #269 = Methodref          #267.#3       // ext/mods/gameserver/network/clientpackets/RequestSetPledgeCrest."<init>":()V
  #270 = Class              #271          // ext/mods/gameserver/network/clientpackets/RequestGiveNickName
  #271 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGiveNickName
  #272 = Methodref          #270.#3       // ext/mods/gameserver/network/clientpackets/RequestGiveNickName."<init>":()V
  #273 = Class              #274          // ext/mods/gameserver/network/clientpackets/RequestShowBoard
  #274 = Utf8               ext/mods/gameserver/network/clientpackets/RequestShowBoard
  #275 = Methodref          #273.#3       // ext/mods/gameserver/network/clientpackets/RequestShowBoard."<init>":()V
  #276 = Class              #277          // ext/mods/gameserver/network/clientpackets/RequestEnchantItem
  #277 = Utf8               ext/mods/gameserver/network/clientpackets/RequestEnchantItem
  #278 = Methodref          #276.#3       // ext/mods/gameserver/network/clientpackets/RequestEnchantItem."<init>":()V
  #279 = Class              #280          // ext/mods/gameserver/network/clientpackets/RequestDestroyItem
  #280 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDestroyItem
  #281 = Methodref          #279.#3       // ext/mods/gameserver/network/clientpackets/RequestDestroyItem."<init>":()V
  #282 = Class              #283          // ext/mods/gameserver/network/clientpackets/SendBypassBuildCmd
  #283 = Utf8               ext/mods/gameserver/network/clientpackets/SendBypassBuildCmd
  #284 = Methodref          #282.#3       // ext/mods/gameserver/network/clientpackets/SendBypassBuildCmd."<init>":()V
  #285 = Class              #286          // ext/mods/gameserver/network/clientpackets/RequestMoveToLocationInVehicle
  #286 = Utf8               ext/mods/gameserver/network/clientpackets/RequestMoveToLocationInVehicle
  #287 = Methodref          #285.#3       // ext/mods/gameserver/network/clientpackets/RequestMoveToLocationInVehicle."<init>":()V
  #288 = Class              #289          // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle
  #289 = Utf8               ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle
  #290 = Methodref          #288.#3       // ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle."<init>":()V
  #291 = Class              #292          // ext/mods/gameserver/network/clientpackets/RequestFriendInvite
  #292 = Utf8               ext/mods/gameserver/network/clientpackets/RequestFriendInvite
  #293 = Methodref          #291.#3       // ext/mods/gameserver/network/clientpackets/RequestFriendInvite."<init>":()V
  #294 = Class              #295          // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite
  #295 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite
  #296 = Methodref          #294.#3       // ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite."<init>":()V
  #297 = Class              #298          // ext/mods/gameserver/network/clientpackets/RequestFriendList
  #298 = Utf8               ext/mods/gameserver/network/clientpackets/RequestFriendList
  #299 = Methodref          #297.#3       // ext/mods/gameserver/network/clientpackets/RequestFriendList."<init>":()V
  #300 = Class              #301          // ext/mods/gameserver/network/clientpackets/RequestFriendDel
  #301 = Utf8               ext/mods/gameserver/network/clientpackets/RequestFriendDel
  #302 = Methodref          #300.#3       // ext/mods/gameserver/network/clientpackets/RequestFriendDel."<init>":()V
  #303 = Class              #304          // ext/mods/gameserver/network/clientpackets/RequestQuestAbort
  #304 = Utf8               ext/mods/gameserver/network/clientpackets/RequestQuestAbort
  #305 = Methodref          #303.#3       // ext/mods/gameserver/network/clientpackets/RequestQuestAbort."<init>":()V
  #306 = Class              #307          // ext/mods/gameserver/network/clientpackets/RequestPledgeInfo
  #307 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeInfo
  #308 = Methodref          #306.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeInfo."<init>":()V
  #309 = Class              #310          // ext/mods/gameserver/network/clientpackets/RequestSurrenderPersonally
  #310 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSurrenderPersonally
  #311 = Methodref          #309.#3       // ext/mods/gameserver/network/clientpackets/RequestSurrenderPersonally."<init>":()V
  #312 = Class              #313          // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo
  #313 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo
  #314 = Methodref          #312.#3       // ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo."<init>":()V
  #315 = Class              #316          // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill
  #316 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAcquireSkill
  #317 = Methodref          #315.#3       // ext/mods/gameserver/network/clientpackets/RequestAcquireSkill."<init>":()V
  #318 = Class              #319          // ext/mods/gameserver/network/clientpackets/RequestRestartPoint
  #319 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRestartPoint
  #320 = Methodref          #318.#3       // ext/mods/gameserver/network/clientpackets/RequestRestartPoint."<init>":()V
  #321 = Class              #322          // ext/mods/gameserver/network/clientpackets/RequestGMCommand
  #322 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGMCommand
  #323 = Methodref          #321.#3       // ext/mods/gameserver/network/clientpackets/RequestGMCommand."<init>":()V
  #324 = Class              #325          // ext/mods/gameserver/network/clientpackets/RequestListPartyWaiting
  #325 = Utf8               ext/mods/gameserver/network/clientpackets/RequestListPartyWaiting
  #326 = Methodref          #324.#3       // ext/mods/gameserver/network/clientpackets/RequestListPartyWaiting."<init>":()V
  #327 = Class              #328          // ext/mods/gameserver/network/clientpackets/RequestManagePartyRoom
  #328 = Utf8               ext/mods/gameserver/network/clientpackets/RequestManagePartyRoom
  #329 = Methodref          #327.#3       // ext/mods/gameserver/network/clientpackets/RequestManagePartyRoom."<init>":()V
  #330 = Class              #331          // ext/mods/gameserver/network/clientpackets/RequestJoinPartyRoom
  #331 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinPartyRoom
  #332 = Methodref          #330.#3       // ext/mods/gameserver/network/clientpackets/RequestJoinPartyRoom."<init>":()V
  #333 = Class              #334          // ext/mods/gameserver/network/clientpackets/RequestCrystallizeItem
  #334 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCrystallizeItem
  #335 = Methodref          #333.#3       // ext/mods/gameserver/network/clientpackets/RequestCrystallizeItem."<init>":()V
  #336 = Class              #337          // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageSell
  #337 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageSell
  #338 = Methodref          #336.#3       // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageSell."<init>":()V
  #339 = Class              #340          // ext/mods/gameserver/network/clientpackets/SetPrivateStoreListSell
  #340 = Utf8               ext/mods/gameserver/network/clientpackets/SetPrivateStoreListSell
  #341 = Methodref          #339.#3       // ext/mods/gameserver/network/clientpackets/SetPrivateStoreListSell."<init>":()V
  #342 = Class              #343          // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitSell
  #343 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitSell
  #344 = Methodref          #342.#3       // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitSell."<init>":()V
  #345 = Class              #346          // ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgSell
  #346 = Utf8               ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgSell
  #347 = Methodref          #345.#3       // ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgSell."<init>":()V
  #348 = Class              #349          // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreBuy
  #349 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPrivateStoreBuy
  #350 = Methodref          #348.#3       // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreBuy."<init>":()V
  #351 = Class              #352          // ext/mods/gameserver/network/clientpackets/RequestTutorialLinkHtml
  #352 = Utf8               ext/mods/gameserver/network/clientpackets/RequestTutorialLinkHtml
  #353 = Methodref          #351.#3       // ext/mods/gameserver/network/clientpackets/RequestTutorialLinkHtml."<init>":()V
  #354 = Class              #355          // ext/mods/gameserver/network/clientpackets/RequestTutorialPassCmdToServer
  #355 = Utf8               ext/mods/gameserver/network/clientpackets/RequestTutorialPassCmdToServer
  #356 = Methodref          #354.#3       // ext/mods/gameserver/network/clientpackets/RequestTutorialPassCmdToServer."<init>":()V
  #357 = Class              #358          // ext/mods/gameserver/network/clientpackets/RequestTutorialQuestionMark
  #358 = Utf8               ext/mods/gameserver/network/clientpackets/RequestTutorialQuestionMark
  #359 = Methodref          #357.#3       // ext/mods/gameserver/network/clientpackets/RequestTutorialQuestionMark."<init>":()V
  #360 = Class              #361          // ext/mods/gameserver/network/clientpackets/RequestTutorialClientEvent
  #361 = Utf8               ext/mods/gameserver/network/clientpackets/RequestTutorialClientEvent
  #362 = Methodref          #360.#3       // ext/mods/gameserver/network/clientpackets/RequestTutorialClientEvent."<init>":()V
  #363 = Class              #364          // ext/mods/gameserver/network/clientpackets/RequestPetition
  #364 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPetition
  #365 = Methodref          #363.#3       // ext/mods/gameserver/network/clientpackets/RequestPetition."<init>":()V
  #366 = Class              #367          // ext/mods/gameserver/network/clientpackets/RequestPetitionCancel
  #367 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPetitionCancel
  #368 = Methodref          #366.#3       // ext/mods/gameserver/network/clientpackets/RequestPetitionCancel."<init>":()V
  #369 = Class              #370          // ext/mods/gameserver/network/clientpackets/RequestGmList
  #370 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGmList
  #371 = Methodref          #369.#3       // ext/mods/gameserver/network/clientpackets/RequestGmList."<init>":()V
  #372 = Class              #373          // ext/mods/gameserver/network/clientpackets/RequestJoinAlly
  #373 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinAlly
  #374 = Methodref          #372.#3       // ext/mods/gameserver/network/clientpackets/RequestJoinAlly."<init>":()V
  #375 = Class              #376          // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly
  #376 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly
  #377 = Methodref          #375.#3       // ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly."<init>":()V
  #378 = Class              #379          // ext/mods/gameserver/network/clientpackets/AllyLeave
  #379 = Utf8               ext/mods/gameserver/network/clientpackets/AllyLeave
  #380 = Methodref          #378.#3       // ext/mods/gameserver/network/clientpackets/AllyLeave."<init>":()V
  #381 = Class              #382          // ext/mods/gameserver/network/clientpackets/AllyDismiss
  #382 = Utf8               ext/mods/gameserver/network/clientpackets/AllyDismiss
  #383 = Methodref          #381.#3       // ext/mods/gameserver/network/clientpackets/AllyDismiss."<init>":()V
  #384 = Class              #385          // ext/mods/gameserver/network/clientpackets/RequestDismissAlly
  #385 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDismissAlly
  #386 = Methodref          #384.#3       // ext/mods/gameserver/network/clientpackets/RequestDismissAlly."<init>":()V
  #387 = Class              #388          // ext/mods/gameserver/network/clientpackets/RequestSetAllyCrest
  #388 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSetAllyCrest
  #389 = Methodref          #387.#3       // ext/mods/gameserver/network/clientpackets/RequestSetAllyCrest."<init>":()V
  #390 = Class              #391          // ext/mods/gameserver/network/clientpackets/RequestAllyCrest
  #391 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAllyCrest
  #392 = Methodref          #390.#3       // ext/mods/gameserver/network/clientpackets/RequestAllyCrest."<init>":()V
  #393 = Class              #394          // ext/mods/gameserver/network/clientpackets/RequestChangePetName
  #394 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangePetName
  #395 = Methodref          #393.#3       // ext/mods/gameserver/network/clientpackets/RequestChangePetName."<init>":()V
  #396 = Class              #397          // ext/mods/gameserver/network/clientpackets/RequestPetUseItem
  #397 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPetUseItem
  #398 = Methodref          #396.#3       // ext/mods/gameserver/network/clientpackets/RequestPetUseItem."<init>":()V
  #399 = Class              #400          // ext/mods/gameserver/network/clientpackets/RequestGiveItemToPet
  #400 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGiveItemToPet
  #401 = Methodref          #399.#3       // ext/mods/gameserver/network/clientpackets/RequestGiveItemToPet."<init>":()V
  #402 = Class              #403          // ext/mods/gameserver/network/clientpackets/RequestGetItemFromPet
  #403 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGetItemFromPet
  #404 = Methodref          #402.#3       // ext/mods/gameserver/network/clientpackets/RequestGetItemFromPet."<init>":()V
  #405 = Class              #406          // ext/mods/gameserver/network/clientpackets/RequestAllyInfo
  #406 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAllyInfo
  #407 = Methodref          #405.#3       // ext/mods/gameserver/network/clientpackets/RequestAllyInfo."<init>":()V
  #408 = Class              #409          // ext/mods/gameserver/network/clientpackets/RequestPetGetItem
  #409 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPetGetItem
  #410 = Methodref          #408.#3       // ext/mods/gameserver/network/clientpackets/RequestPetGetItem."<init>":()V
  #411 = Class              #412          // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageBuy
  #412 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageBuy
  #413 = Methodref          #411.#3       // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageBuy."<init>":()V
  #414 = Class              #415          // ext/mods/gameserver/network/clientpackets/SetPrivateStoreListBuy
  #415 = Utf8               ext/mods/gameserver/network/clientpackets/SetPrivateStoreListBuy
  #416 = Methodref          #414.#3       // ext/mods/gameserver/network/clientpackets/SetPrivateStoreListBuy."<init>":()V
  #417 = Class              #418          // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitBuy
  #418 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitBuy
  #419 = Methodref          #417.#3       // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitBuy."<init>":()V
  #420 = Class              #421          // ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgBuy
  #421 = Utf8               ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgBuy
  #422 = Methodref          #420.#3       // ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgBuy."<init>":()V
  #423 = Class              #424          // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreSell
  #424 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPrivateStoreSell
  #425 = Methodref          #423.#3       // ext/mods/gameserver/network/clientpackets/RequestPrivateStoreSell."<init>":()V
  #426 = Class              #427          // ext/mods/gameserver/network/clientpackets/SendTimeCheck
  #427 = Utf8               ext/mods/gameserver/network/clientpackets/SendTimeCheck
  #428 = Methodref          #426.#3       // ext/mods/gameserver/network/clientpackets/SendTimeCheck."<init>":()V
  #429 = Class              #430          // ext/mods/gameserver/network/clientpackets/RequestPackageSendableItemList
  #430 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPackageSendableItemList
  #431 = Methodref          #429.#3       // ext/mods/gameserver/network/clientpackets/RequestPackageSendableItemList."<init>":()V
  #432 = Class              #433          // ext/mods/gameserver/network/clientpackets/RequestPackageSend
  #433 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPackageSend
  #434 = Methodref          #432.#3       // ext/mods/gameserver/network/clientpackets/RequestPackageSend."<init>":()V
  #435 = Class              #436          // ext/mods/gameserver/network/clientpackets/RequestBlock
  #436 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBlock
  #437 = Methodref          #435.#3       // ext/mods/gameserver/network/clientpackets/RequestBlock."<init>":()V
  #438 = Class              #439          // ext/mods/gameserver/network/clientpackets/RequestSiegeAttackerList
  #439 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSiegeAttackerList
  #440 = Methodref          #438.#3       // ext/mods/gameserver/network/clientpackets/RequestSiegeAttackerList."<init>":()V
  #441 = Class              #442          // ext/mods/gameserver/network/clientpackets/RequestSiegeDefenderList
  #442 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSiegeDefenderList
  #443 = Methodref          #441.#3       // ext/mods/gameserver/network/clientpackets/RequestSiegeDefenderList."<init>":()V
  #444 = Class              #445          // ext/mods/gameserver/network/clientpackets/RequestJoinSiege
  #445 = Utf8               ext/mods/gameserver/network/clientpackets/RequestJoinSiege
  #446 = Methodref          #444.#3       // ext/mods/gameserver/network/clientpackets/RequestJoinSiege."<init>":()V
  #447 = Class              #448          // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList
  #448 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList
  #449 = Methodref          #447.#3       // ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList."<init>":()V
  #450 = Class              #451          // ext/mods/gameserver/network/clientpackets/MultiSellChoose
  #451 = Utf8               ext/mods/gameserver/network/clientpackets/MultiSellChoose
  #452 = Methodref          #450.#3       // ext/mods/gameserver/network/clientpackets/MultiSellChoose."<init>":()V
  #453 = Class              #454          // ext/mods/gameserver/network/clientpackets/RequestUserCommand
  #454 = Utf8               ext/mods/gameserver/network/clientpackets/RequestUserCommand
  #455 = Methodref          #453.#3       // ext/mods/gameserver/network/clientpackets/RequestUserCommand."<init>":()V
  #456 = Class              #457          // ext/mods/gameserver/network/clientpackets/SnoopQuit
  #457 = Utf8               ext/mods/gameserver/network/clientpackets/SnoopQuit
  #458 = Methodref          #456.#3       // ext/mods/gameserver/network/clientpackets/SnoopQuit."<init>":()V
  #459 = Class              #460          // ext/mods/gameserver/network/clientpackets/RequestRecipeBookOpen
  #460 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeBookOpen
  #461 = Methodref          #459.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeBookOpen."<init>":()V
  #462 = Class              #463          // ext/mods/gameserver/network/clientpackets/RequestRecipeBookDestroy
  #463 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeBookDestroy
  #464 = Methodref          #462.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeBookDestroy."<init>":()V
  #465 = Class              #466          // ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeInfo
  #466 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeInfo
  #467 = Methodref          #465.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeInfo."<init>":()V
  #468 = Class              #469          // ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeSelf
  #469 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeSelf
  #470 = Methodref          #468.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeSelf."<init>":()V
  #471 = Class              #472          // ext/mods/gameserver/network/clientpackets/RequestRecipeShopMessageSet
  #472 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeShopMessageSet
  #473 = Methodref          #471.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeShopMessageSet."<init>":()V
  #474 = Class              #475          // ext/mods/gameserver/network/clientpackets/RequestRecipeShopListSet
  #475 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeShopListSet
  #476 = Methodref          #474.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeShopListSet."<init>":()V
  #477 = Class              #478          // ext/mods/gameserver/network/clientpackets/RequestRecipeShopManageQuit
  #478 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeShopManageQuit
  #479 = Methodref          #477.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeShopManageQuit."<init>":()V
  #480 = Class              #481          // ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeInfo
  #481 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeInfo
  #482 = Methodref          #480.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeInfo."<init>":()V
  #483 = Class              #484          // ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeItem
  #484 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeItem
  #485 = Methodref          #483.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeItem."<init>":()V
  #486 = Class              #487          // ext/mods/gameserver/network/clientpackets/RequestRecipeShopManagePrev
  #487 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecipeShopManagePrev
  #488 = Methodref          #486.#3       // ext/mods/gameserver/network/clientpackets/RequestRecipeShopManagePrev."<init>":()V
  #489 = Class              #490          // ext/mods/gameserver/network/clientpackets/ObserverReturn
  #490 = Utf8               ext/mods/gameserver/network/clientpackets/ObserverReturn
  #491 = Methodref          #489.#3       // ext/mods/gameserver/network/clientpackets/ObserverReturn."<init>":()V
  #492 = Class              #493          // ext/mods/gameserver/network/clientpackets/RequestEvaluate
  #493 = Utf8               ext/mods/gameserver/network/clientpackets/RequestEvaluate
  #494 = Methodref          #492.#3       // ext/mods/gameserver/network/clientpackets/RequestEvaluate."<init>":()V
  #495 = Class              #496          // ext/mods/gameserver/network/clientpackets/RequestHennaItemList
  #496 = Utf8               ext/mods/gameserver/network/clientpackets/RequestHennaItemList
  #497 = Methodref          #495.#3       // ext/mods/gameserver/network/clientpackets/RequestHennaItemList."<init>":()V
  #498 = Class              #499          // ext/mods/gameserver/network/clientpackets/RequestHennaItemInfo
  #499 = Utf8               ext/mods/gameserver/network/clientpackets/RequestHennaItemInfo
  #500 = Methodref          #498.#3       // ext/mods/gameserver/network/clientpackets/RequestHennaItemInfo."<init>":()V
  #501 = Class              #502          // ext/mods/gameserver/network/clientpackets/RequestHennaEquip
  #502 = Utf8               ext/mods/gameserver/network/clientpackets/RequestHennaEquip
  #503 = Methodref          #501.#3       // ext/mods/gameserver/network/clientpackets/RequestHennaEquip."<init>":()V
  #504 = Class              #505          // ext/mods/gameserver/network/clientpackets/RequestHennaUnequipList
  #505 = Utf8               ext/mods/gameserver/network/clientpackets/RequestHennaUnequipList
  #506 = Methodref          #504.#3       // ext/mods/gameserver/network/clientpackets/RequestHennaUnequipList."<init>":()V
  #507 = Class              #508          // ext/mods/gameserver/network/clientpackets/RequestHennaUnequipInfo
  #508 = Utf8               ext/mods/gameserver/network/clientpackets/RequestHennaUnequipInfo
  #509 = Methodref          #507.#3       // ext/mods/gameserver/network/clientpackets/RequestHennaUnequipInfo."<init>":()V
  #510 = Class              #511          // ext/mods/gameserver/network/clientpackets/RequestHennaUnequip
  #511 = Utf8               ext/mods/gameserver/network/clientpackets/RequestHennaUnequip
  #512 = Methodref          #510.#3       // ext/mods/gameserver/network/clientpackets/RequestHennaUnequip."<init>":()V
  #513 = Class              #514          // ext/mods/gameserver/network/clientpackets/RequestPledgePower
  #514 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgePower
  #515 = Methodref          #513.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgePower."<init>":()V
  #516 = Class              #517          // ext/mods/gameserver/network/clientpackets/RequestMakeMacro
  #517 = Utf8               ext/mods/gameserver/network/clientpackets/RequestMakeMacro
  #518 = Methodref          #516.#3       // ext/mods/gameserver/network/clientpackets/RequestMakeMacro."<init>":()V
  #519 = Class              #520          // ext/mods/gameserver/network/clientpackets/RequestDeleteMacro
  #520 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDeleteMacro
  #521 = Methodref          #519.#3       // ext/mods/gameserver/network/clientpackets/RequestDeleteMacro."<init>":()V
  #522 = Class              #523          // ext/mods/gameserver/network/clientpackets/RequestBuyProcure
  #523 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBuyProcure
  #524 = Methodref          #522.#3       // ext/mods/gameserver/network/clientpackets/RequestBuyProcure."<init>":()V
  #525 = Class              #526          // ext/mods/gameserver/network/clientpackets/RequestBuySeed
  #526 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBuySeed
  #527 = Methodref          #525.#3       // ext/mods/gameserver/network/clientpackets/RequestBuySeed."<init>":()V
  #528 = Class              #529          // ext/mods/gameserver/network/clientpackets/DlgAnswer
  #529 = Utf8               ext/mods/gameserver/network/clientpackets/DlgAnswer
  #530 = Methodref          #528.#3       // ext/mods/gameserver/network/clientpackets/DlgAnswer."<init>":()V
  #531 = Class              #532          // ext/mods/gameserver/network/clientpackets/RequestPreviewItem
  #532 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPreviewItem
  #533 = Methodref          #531.#3       // ext/mods/gameserver/network/clientpackets/RequestPreviewItem."<init>":()V
  #534 = Class              #535          // ext/mods/gameserver/network/clientpackets/RequestSSQStatus
  #535 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSSQStatus
  #536 = Methodref          #534.#3       // ext/mods/gameserver/network/clientpackets/RequestSSQStatus."<init>":()V
  #537 = Class              #538          // ext/mods/gameserver/network/clientpackets/PetitionVote
  #538 = Utf8               ext/mods/gameserver/network/clientpackets/PetitionVote
  #539 = Methodref          #537.#3       // ext/mods/gameserver/network/clientpackets/PetitionVote."<init>":()V
  #540 = Class              #541          // ext/mods/gameserver/network/clientpackets/GameGuardReply
  #541 = Utf8               ext/mods/gameserver/network/clientpackets/GameGuardReply
  #542 = Methodref          #540.#3       // ext/mods/gameserver/network/clientpackets/GameGuardReply."<init>":()V
  #543 = Class              #544          // ext/mods/gameserver/network/clientpackets/RequestSendL2FriendSay
  #544 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSendL2FriendSay
  #545 = Methodref          #543.#3       // ext/mods/gameserver/network/clientpackets/RequestSendL2FriendSay."<init>":()V
  #546 = Class              #547          // ext/mods/gameserver/network/clientpackets/RequestShowMiniMap
  #547 = Utf8               ext/mods/gameserver/network/clientpackets/RequestShowMiniMap
  #548 = Methodref          #546.#3       // ext/mods/gameserver/network/clientpackets/RequestShowMiniMap."<init>":()V
  #549 = Class              #550          // ext/mods/gameserver/network/clientpackets/RequestRecordInfo
  #550 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRecordInfo
  #551 = Methodref          #549.#3       // ext/mods/gameserver/network/clientpackets/RequestRecordInfo."<init>":()V
  #552 = Class              #553          // ext/mods/gameserver/network/clientpackets/RequestOustFromPartyRoom
  #553 = Utf8               ext/mods/gameserver/network/clientpackets/RequestOustFromPartyRoom
  #554 = Methodref          #552.#3       // ext/mods/gameserver/network/clientpackets/RequestOustFromPartyRoom."<init>":()V
  #555 = Class              #556          // ext/mods/gameserver/network/clientpackets/RequestDismissPartyRoom
  #556 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDismissPartyRoom
  #557 = Methodref          #555.#3       // ext/mods/gameserver/network/clientpackets/RequestDismissPartyRoom."<init>":()V
  #558 = Class              #559          // ext/mods/gameserver/network/clientpackets/RequestWithdrawPartyRoom
  #559 = Utf8               ext/mods/gameserver/network/clientpackets/RequestWithdrawPartyRoom
  #560 = Methodref          #558.#3       // ext/mods/gameserver/network/clientpackets/RequestWithdrawPartyRoom."<init>":()V
  #561 = Class              #562          // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader
  #562 = Utf8               ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader
  #563 = Methodref          #561.#3       // ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader."<init>":()V
  #564 = Class              #565          // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot
  #565 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot
  #566 = Methodref          #564.#3       // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot."<init>":()V
  #567 = Class              #568          // ext/mods/gameserver/network/clientpackets/RequestExEnchantSkillInfo
  #568 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExEnchantSkillInfo
  #569 = Methodref          #567.#3       // ext/mods/gameserver/network/clientpackets/RequestExEnchantSkillInfo."<init>":()V
  #570 = Class              #571          // ext/mods/gameserver/network/clientpackets/RequestExEnchantSkill
  #571 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExEnchantSkill
  #572 = Methodref          #570.#3       // ext/mods/gameserver/network/clientpackets/RequestExEnchantSkill."<init>":()V
  #573 = Class              #574          // ext/mods/gameserver/network/clientpackets/RequestProcureCropList
  #574 = Utf8               ext/mods/gameserver/network/clientpackets/RequestProcureCropList
  #575 = Methodref          #573.#3       // ext/mods/gameserver/network/clientpackets/RequestProcureCropList."<init>":()V
  #576 = Class              #577          // ext/mods/gameserver/network/clientpackets/RequestSetSeed
  #577 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSetSeed
  #578 = Methodref          #576.#3       // ext/mods/gameserver/network/clientpackets/RequestSetSeed."<init>":()V
  #579 = Class              #580          // ext/mods/gameserver/network/clientpackets/RequestSetCrop
  #580 = Utf8               ext/mods/gameserver/network/clientpackets/RequestSetCrop
  #581 = Methodref          #579.#3       // ext/mods/gameserver/network/clientpackets/RequestSetCrop."<init>":()V
  #582 = Class              #583          // ext/mods/gameserver/network/clientpackets/RequestWriteHeroWords
  #583 = Utf8               ext/mods/gameserver/network/clientpackets/RequestWriteHeroWords
  #584 = Methodref          #582.#3       // ext/mods/gameserver/network/clientpackets/RequestWriteHeroWords."<init>":()V
  #585 = Class              #586          // ext/mods/gameserver/network/clientpackets/RequestExAskJoinMPCC
  #586 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExAskJoinMPCC
  #587 = Methodref          #585.#3       // ext/mods/gameserver/network/clientpackets/RequestExAskJoinMPCC."<init>":()V
  #588 = Class              #589          // ext/mods/gameserver/network/clientpackets/RequestExAcceptJoinMPCC
  #589 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExAcceptJoinMPCC
  #590 = Methodref          #588.#3       // ext/mods/gameserver/network/clientpackets/RequestExAcceptJoinMPCC."<init>":()V
  #591 = Class              #592          // ext/mods/gameserver/network/clientpackets/RequestExOustFromMPCC
  #592 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExOustFromMPCC
  #593 = Methodref          #591.#3       // ext/mods/gameserver/network/clientpackets/RequestExOustFromMPCC."<init>":()V
  #594 = Class              #595          // ext/mods/gameserver/network/clientpackets/RequestExPledgeCrestLarge
  #595 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExPledgeCrestLarge
  #596 = Methodref          #594.#3       // ext/mods/gameserver/network/clientpackets/RequestExPledgeCrestLarge."<init>":()V
  #597 = Class              #598          // ext/mods/gameserver/network/clientpackets/RequestExSetPledgeCrestLarge
  #598 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExSetPledgeCrestLarge
  #599 = Methodref          #597.#3       // ext/mods/gameserver/network/clientpackets/RequestExSetPledgeCrestLarge."<init>":()V
  #600 = Class              #601          // ext/mods/gameserver/network/clientpackets/RequestOlympiadObserverEnd
  #601 = Utf8               ext/mods/gameserver/network/clientpackets/RequestOlympiadObserverEnd
  #602 = Methodref          #600.#3       // ext/mods/gameserver/network/clientpackets/RequestOlympiadObserverEnd."<init>":()V
  #603 = Class              #604          // ext/mods/gameserver/network/clientpackets/RequestOlympiadMatchList
  #604 = Utf8               ext/mods/gameserver/network/clientpackets/RequestOlympiadMatchList
  #605 = Methodref          #603.#3       // ext/mods/gameserver/network/clientpackets/RequestOlympiadMatchList."<init>":()V
  #606 = Class              #607          // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom
  #607 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom
  #608 = Methodref          #606.#3       // ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom."<init>":()V
  #609 = Class              #610          // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom
  #610 = Utf8               ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom
  #611 = Methodref          #609.#3       // ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom."<init>":()V
  #612 = Class              #613          // ext/mods/gameserver/network/clientpackets/RequestListPartyMatchingWaitingRoom
  #613 = Utf8               ext/mods/gameserver/network/clientpackets/RequestListPartyMatchingWaitingRoom
  #614 = Methodref          #612.#3       // ext/mods/gameserver/network/clientpackets/RequestListPartyMatchingWaitingRoom."<init>":()V
  #615 = Class              #616          // ext/mods/gameserver/network/clientpackets/RequestExitPartyMatchingWaitingRoom
  #616 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExitPartyMatchingWaitingRoom
  #617 = Methodref          #615.#3       // ext/mods/gameserver/network/clientpackets/RequestExitPartyMatchingWaitingRoom."<init>":()V
  #618 = Class              #619          // ext/mods/gameserver/network/clientpackets/RequestGetBossRecord
  #619 = Utf8               ext/mods/gameserver/network/clientpackets/RequestGetBossRecord
  #620 = Methodref          #618.#3       // ext/mods/gameserver/network/clientpackets/RequestGetBossRecord."<init>":()V
  #621 = Class              #622          // ext/mods/gameserver/network/clientpackets/RequestPledgeSetAcademyMaster
  #622 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeSetAcademyMaster
  #623 = Methodref          #621.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeSetAcademyMaster."<init>":()V
  #624 = Class              #625          // ext/mods/gameserver/network/clientpackets/RequestPledgePowerGradeList
  #625 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgePowerGradeList
  #626 = Methodref          #624.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgePowerGradeList."<init>":()V
  #627 = Class              #628          // ext/mods/gameserver/network/clientpackets/RequestPledgeMemberPowerInfo
  #628 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeMemberPowerInfo
  #629 = Methodref          #627.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeMemberPowerInfo."<init>":()V
  #630 = Class              #631          // ext/mods/gameserver/network/clientpackets/RequestPledgeSetMemberPowerGrade
  #631 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeSetMemberPowerGrade
  #632 = Methodref          #630.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeSetMemberPowerGrade."<init>":()V
  #633 = Class              #634          // ext/mods/gameserver/network/clientpackets/RequestPledgeMemberInfo
  #634 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeMemberInfo
  #635 = Methodref          #633.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeMemberInfo."<init>":()V
  #636 = Class              #637          // ext/mods/gameserver/network/clientpackets/RequestPledgeWarList
  #637 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeWarList
  #638 = Methodref          #636.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeWarList."<init>":()V
  #639 = Class              #640          // ext/mods/gameserver/network/clientpackets/RequestExFishRanking
  #640 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExFishRanking
  #641 = Methodref          #639.#3       // ext/mods/gameserver/network/clientpackets/RequestExFishRanking."<init>":()V
  #642 = Class              #643          // ext/mods/gameserver/network/clientpackets/RequestPCCafeCouponUse
  #643 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPCCafeCouponUse
  #644 = Methodref          #642.#3       // ext/mods/gameserver/network/clientpackets/RequestPCCafeCouponUse."<init>":()V
  #645 = Class              #646          // ext/mods/gameserver/network/clientpackets/RequestCursedWeaponList
  #646 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCursedWeaponList
  #647 = Methodref          #645.#3       // ext/mods/gameserver/network/clientpackets/RequestCursedWeaponList."<init>":()V
  #648 = Class              #649          // ext/mods/gameserver/network/clientpackets/RequestCursedWeaponLocation
  #649 = Utf8               ext/mods/gameserver/network/clientpackets/RequestCursedWeaponLocation
  #650 = Methodref          #648.#3       // ext/mods/gameserver/network/clientpackets/RequestCursedWeaponLocation."<init>":()V
  #651 = Class              #652          // ext/mods/gameserver/network/clientpackets/RequestPledgeReorganizeMember
  #652 = Utf8               ext/mods/gameserver/network/clientpackets/RequestPledgeReorganizeMember
  #653 = Methodref          #651.#3       // ext/mods/gameserver/network/clientpackets/RequestPledgeReorganizeMember."<init>":()V
  #654 = Class              #655          // ext/mods/gameserver/network/clientpackets/RequestExMPCCShowPartyMembersInfo
  #655 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExMPCCShowPartyMembersInfo
  #656 = Methodref          #654.#3       // ext/mods/gameserver/network/clientpackets/RequestExMPCCShowPartyMembersInfo."<init>":()V
  #657 = Class              #658          // ext/mods/gameserver/network/clientpackets/RequestDuelStart
  #658 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDuelStart
  #659 = Methodref          #657.#3       // ext/mods/gameserver/network/clientpackets/RequestDuelStart."<init>":()V
  #660 = Class              #661          // ext/mods/gameserver/network/clientpackets/RequestDuelAnswerStart
  #661 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDuelAnswerStart
  #662 = Methodref          #660.#3       // ext/mods/gameserver/network/clientpackets/RequestDuelAnswerStart."<init>":()V
  #663 = Class              #664          // ext/mods/gameserver/network/clientpackets/RequestConfirmTargetItem
  #664 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmTargetItem
  #665 = Methodref          #663.#3       // ext/mods/gameserver/network/clientpackets/RequestConfirmTargetItem."<init>":()V
  #666 = Class              #667          // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem
  #667 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem
  #668 = Methodref          #666.#3       // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem."<init>":()V
  #669 = Class              #670          // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone
  #670 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone
  #671 = Methodref          #669.#3       // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone."<init>":()V
  #672 = Class              #673          // ext/mods/gameserver/network/clientpackets/RequestRefine
  #673 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRefine
  #674 = Methodref          #672.#3       // ext/mods/gameserver/network/clientpackets/RequestRefine."<init>":()V
  #675 = Class              #676          // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem
  #676 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem
  #677 = Methodref          #675.#3       // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem."<init>":()V
  #678 = Class              #679          // ext/mods/gameserver/network/clientpackets/RequestRefineCancel
  #679 = Utf8               ext/mods/gameserver/network/clientpackets/RequestRefineCancel
  #680 = Methodref          #678.#3       // ext/mods/gameserver/network/clientpackets/RequestRefineCancel."<init>":()V
  #681 = Class              #682          // ext/mods/gameserver/network/clientpackets/RequestExMagicSkillUseGround
  #682 = Utf8               ext/mods/gameserver/network/clientpackets/RequestExMagicSkillUseGround
  #683 = Methodref          #681.#3       // ext/mods/gameserver/network/clientpackets/RequestExMagicSkillUseGround."<init>":()V
  #684 = Class              #685          // ext/mods/gameserver/network/clientpackets/RequestDuelSurrender
  #685 = Utf8               ext/mods/gameserver/network/clientpackets/RequestDuelSurrender
  #686 = Methodref          #684.#3       // ext/mods/gameserver/network/clientpackets/RequestDuelSurrender."<init>":()V
  #687 = Methodref          #8.#688       // ext/mods/gameserver/network/GameClient."<init>":(Lext/mods/commons/mmocore/MMOConnection;)V
  #688 = NameAndType        #5:#689       // "<init>":(Lext/mods/commons/mmocore/MMOConnection;)V
  #689 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)V
  #690 = Methodref          #691.#692     // ext/mods/commons/mmocore/ReceivablePacket.getClient:()Lext/mods/commons/mmocore/MMOClient;
  #691 = Class              #693          // ext/mods/commons/mmocore/ReceivablePacket
  #692 = NameAndType        #694:#695     // getClient:()Lext/mods/commons/mmocore/MMOClient;
  #693 = Utf8               ext/mods/commons/mmocore/ReceivablePacket
  #694 = Utf8               getClient
  #695 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #696 = Methodref          #8.#697       // ext/mods/gameserver/network/GameClient.execute:(Lext/mods/commons/mmocore/ReceivablePacket;)V
  #697 = NameAndType        #698:#699     // execute:(Lext/mods/commons/mmocore/ReceivablePacket;)V
  #698 = Utf8               execute
  #699 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket;)V
  #700 = Methodref          #8.#701       // ext/mods/gameserver/network/GameClient.onUnknownPacket:()V
  #701 = NameAndType        #702:#6       // onUnknownPacket:()V
  #702 = Utf8               onUnknownPacket
  #703 = Fieldref           #193.#704     // ext/mods/Config.PACKET_HANDLER_DEBUG:Z
  #704 = NameAndType        #705:#197     // PACKET_HANDLER_DEBUG:Z
  #705 = Utf8               PACKET_HANDLER_DEBUG
  #706 = String             #707          // {} sent unknown packet 0x{} on state {}.
  #707 = Utf8               {} sent unknown packet 0x{} on state {}.
  #708 = Methodref          #709.#710     // java/lang/Integer.toHexString:(I)Ljava/lang/String;
  #709 = Class              #711          // java/lang/Integer
  #710 = NameAndType        #712:#713     // toHexString:(I)Ljava/lang/String;
  #711 = Utf8               java/lang/Integer
  #712 = Utf8               toHexString
  #713 = Utf8               (I)Ljava/lang/String;
  #714 = Methodref          #30.#715      // ext/mods/gameserver/network/GameClient$GameClientState.name:()Ljava/lang/String;
  #715 = NameAndType        #716:#88      // name:()Ljava/lang/String;
  #716 = Utf8               name
  #717 = Methodref          #14.#718      // java/nio/ByteBuffer.get:([B)Ljava/nio/ByteBuffer;
  #718 = NameAndType        #17:#719      // get:([B)Ljava/nio/ByteBuffer;
  #719 = Utf8               ([B)Ljava/nio/ByteBuffer;
  #720 = Methodref          #721.#722     // ext/mods/commons/lang/HexUtil.printData:([BI)Ljava/lang/String;
  #721 = Class              #723          // ext/mods/commons/lang/HexUtil
  #722 = NameAndType        #724:#725     // printData:([BI)Ljava/lang/String;
  #723 = Utf8               ext/mods/commons/lang/HexUtil
  #724 = Utf8               printData
  #725 = Utf8               ([BI)Ljava/lang/String;
  #726 = Methodref          #90.#727      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #727 = NameAndType        #93:#728      // warn:(Ljava/lang/Object;)V
  #728 = Utf8               (Ljava/lang/Object;)V
  #729 = String             #730          // {} sent unknown packet 0x{}:{} on state {}.
  #730 = Utf8               {} sent unknown packet 0x{}:{} on state {}.
  #731 = Methodref          #42.#732      // ext/mods/gameserver/network/GamePacketHandler.handlePacket:(Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #732 = NameAndType        #733:#734     // handlePacket:(Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #733 = Utf8               handlePacket
  #734 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #735 = Methodref          #42.#736      // ext/mods/gameserver/network/GamePacketHandler.create:(Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/gameserver/network/GameClient;
  #736 = NameAndType        #737:#738     // create:(Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/gameserver/network/GameClient;
  #737 = Utf8               create
  #738 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/gameserver/network/GameClient;
  #739 = Methodref          #740.#741     // java/lang/Class.getName:()Ljava/lang/String;
  #740 = Class              #742          // java/lang/Class
  #741 = NameAndType        #743:#88      // getName:()Ljava/lang/String;
  #742 = Utf8               java/lang/Class
  #743 = Utf8               getName
  #744 = Methodref          #90.#745      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #745 = NameAndType        #5:#746       // "<init>":(Ljava/lang/String;)V
  #746 = Utf8               (Ljava/lang/String;)V
  #747 = Class              #748          // ext/mods/commons/mmocore/IPacketHandler
  #748 = Utf8               ext/mods/commons/mmocore/IPacketHandler
  #749 = Class              #750          // ext/mods/commons/mmocore/IClientFactory
  #750 = Utf8               ext/mods/commons/mmocore/IClientFactory
  #751 = Class              #752          // ext/mods/commons/mmocore/IMMOExecutor
  #752 = Utf8               ext/mods/commons/mmocore/IMMOExecutor
  #753 = Utf8               Code
  #754 = Utf8               LineNumberTable
  #755 = Utf8               LocalVariableTable
  #756 = Utf8               this
  #757 = Utf8               Lext/mods/gameserver/network/GamePacketHandler;
  #758 = Utf8               id2
  #759 = Utf8               I
  #760 = Utf8               buf
  #761 = Utf8               Ljava/nio/ByteBuffer;
  #762 = Utf8               client
  #763 = Utf8               Lext/mods/gameserver/network/GameClient;
  #764 = Utf8               opcode
  #765 = Utf8               state
  #766 = Utf8               Lext/mods/gameserver/network/GameClient$GameClientState;
  #767 = Utf8               msg
  #768 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket;
  #769 = Utf8               LocalVariableTypeTable
  #770 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
  #771 = Utf8               StackMapTable
  #772 = Utf8               Signature
  #773 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
  #774 = Utf8               con
  #775 = Utf8               Lext/mods/commons/mmocore/MMOConnection;
  #776 = Utf8               Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;
  #777 = Utf8               (Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;)Lext/mods/gameserver/network/GameClient;
  #778 = Utf8               rp
  #779 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;)V
  #780 = Utf8               size
  #781 = Utf8               array
  #782 = Utf8               [B
  #783 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
  #784 = Utf8               MethodParameters
  #785 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
  #786 = Utf8               <clinit>
  #787 = Utf8               Ljava/lang/Object;Lext/mods/commons/mmocore/IPacketHandler<Lext/mods/gameserver/network/GameClient;>;Lext/mods/commons/mmocore/IClientFactory<Lext/mods/gameserver/network/GameClient;>;Lext/mods/commons/mmocore/IMMOExecutor<Lext/mods/gameserver/network/GameClient;>;
  #788 = Utf8               SourceFile
  #789 = Utf8               GamePacketHandler.java
  #790 = Utf8               NestMembers
  #791 = Utf8               InnerClasses
  #792 = Utf8               GameClientState
{
  public ext.mods.gameserver.network.GamePacketHandler();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/GamePacketHandler;

  public ext.mods.commons.mmocore.ReceivablePacket<ext.mods.gameserver.network.GameClient> handlePacket(java.nio.ByteBuffer, ext.mods.gameserver.network.GameClient);
    descriptor: (Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=3
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/network/GameClient.dropPacket:()Z
         4: ifeq          9
         7: aconst_null
         8: areturn
         9: aload_1
        10: invokevirtual #13                 // Method java/nio/ByteBuffer.get:()B
        13: sipush        255
        16: iand
        17: istore_3
        18: aload_2
        19: invokevirtual #19                 // Method ext/mods/gameserver/network/GameClient.getState:()Lext/mods/gameserver/network/GameClient$GameClientState;
        22: astore        4
        24: aconst_null
        25: astore        5
        27: getstatic     #23                 // Field ext/mods/gameserver/network/GamePacketHandler$1.$SwitchMap$ext$mods$gameserver$network$GameClient$GameClientState:[I
        30: aload         4
        32: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient$GameClientState.ordinal:()I
        35: iaload
        36: tableswitch   { // 1 to 4

                       1: 68

                       2: 131

                       3: 295

                       4: 456
                 default: 3993
            }
        68: iload_3
        69: lookupswitch  { // 2

                       0: 96

                       8: 108
                 default: 120
            }
        96: new           #35                 // class ext/mods/gameserver/network/clientpackets/SendProtocolVersion
        99: dup
       100: invokespecial #37                 // Method ext/mods/gameserver/network/clientpackets/SendProtocolVersion."<init>":()V
       103: astore        5
       105: goto          3993
       108: new           #38                 // class ext/mods/gameserver/network/clientpackets/AuthLogin
       111: dup
       112: invokespecial #40                 // Method ext/mods/gameserver/network/clientpackets/AuthLogin."<init>":()V
       115: astore        5
       117: goto          3993
       120: iload_3
       121: aload_1
       122: aload         4
       124: aload_2
       125: invokestatic  #41                 // Method printDebug:(ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
       128: goto          3993
       131: iload_3
       132: lookupswitch  { // 7

                       9: 200

                      11: 212

                      12: 224

                      13: 236

                      14: 248

                      98: 260

                     104: 272
                 default: 284
            }
       200: new           #47                 // class ext/mods/gameserver/network/clientpackets/Logout
       203: dup
       204: invokespecial #49                 // Method ext/mods/gameserver/network/clientpackets/Logout."<init>":()V
       207: astore        5
       209: goto          3993
       212: new           #50                 // class ext/mods/gameserver/network/clientpackets/RequestCharacterCreate
       215: dup
       216: invokespecial #52                 // Method ext/mods/gameserver/network/clientpackets/RequestCharacterCreate."<init>":()V
       219: astore        5
       221: goto          3993
       224: new           #53                 // class ext/mods/gameserver/network/clientpackets/RequestCharacterDelete
       227: dup
       228: invokespecial #55                 // Method ext/mods/gameserver/network/clientpackets/RequestCharacterDelete."<init>":()V
       231: astore        5
       233: goto          3993
       236: new           #56                 // class ext/mods/gameserver/network/clientpackets/RequestGameStart
       239: dup
       240: invokespecial #58                 // Method ext/mods/gameserver/network/clientpackets/RequestGameStart."<init>":()V
       243: astore        5
       245: goto          3993
       248: new           #59                 // class ext/mods/gameserver/network/clientpackets/RequestNewCharacter
       251: dup
       252: invokespecial #61                 // Method ext/mods/gameserver/network/clientpackets/RequestNewCharacter."<init>":()V
       255: astore        5
       257: goto          3993
       260: new           #62                 // class ext/mods/gameserver/network/clientpackets/CharacterRestore
       263: dup
       264: invokespecial #64                 // Method ext/mods/gameserver/network/clientpackets/CharacterRestore."<init>":()V
       267: astore        5
       269: goto          3993
       272: new           #65                 // class ext/mods/gameserver/network/clientpackets/RequestPledgeCrest
       275: dup
       276: invokespecial #67                 // Method ext/mods/gameserver/network/clientpackets/RequestPledgeCrest."<init>":()V
       279: astore        5
       281: goto          3993
       284: iload_3
       285: aload_1
       286: aload         4
       288: aload_2
       289: invokestatic  #41                 // Method printDebug:(ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
       292: goto          3993
       295: iload_3
       296: lookupswitch  { // 3

                       3: 332

                      63: 433

                     208: 344
                 default: 445
            }
       332: new           #68                 // class ext/mods/gameserver/network/clientpackets/EnterWorld
       335: dup
       336: invokespecial #70                 // Method ext/mods/gameserver/network/clientpackets/EnterWorld."<init>":()V
       339: astore        5
       341: goto          3993
       344: iconst_m1
       345: istore        6
       347: aload_1
       348: invokevirtual #71                 // Method java/nio/ByteBuffer.remaining:()I
       351: iconst_2
       352: if_icmplt     367
       355: aload_1
       356: invokevirtual #74                 // Method java/nio/ByteBuffer.getShort:()S
       359: ldc           #78                 // int 65535
       361: iand
       362: istore        6
       364: goto          389
       367: getstatic     #79                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       370: ldc           #83                 // String {} sent a 0xd0 without the second opcode.
       372: iconst_1
       373: anewarray     #2                  // class java/lang/Object
       376: dup
       377: iconst_0
       378: aload_2
       379: invokevirtual #85                 // Method ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
       382: aastore
       383: invokevirtual #89                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       386: goto          3993
       389: iload         6
       391: lookupswitch  { // 1

                       8: 408
                 default: 420
            }
       408: new           #95                 // class ext/mods/gameserver/network/clientpackets/RequestManorList
       411: dup
       412: invokespecial #97                 // Method ext/mods/gameserver/network/clientpackets/RequestManorList."<init>":()V
       415: astore        5
       417: goto          3993
       420: iload_3
       421: iload         6
       423: aload_1
       424: aload         4
       426: aload_2
       427: invokestatic  #98                 // Method printDebugDoubleOpcode:(IILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
       430: goto          3993
       433: new           #102                // class ext/mods/gameserver/network/clientpackets/RequestQuestList
       436: dup
       437: invokespecial #104                // Method ext/mods/gameserver/network/clientpackets/RequestQuestList."<init>":()V
       440: astore        5
       442: goto          3993
       445: iload_3
       446: aload_1
       447: aload         4
       449: aload_2
       450: invokestatic  #41                 // Method printDebug:(ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
       453: goto          3993
       456: iload_3
       457: tableswitch   { // 1 to 208

                       1: 1304

                       2: 3985

                       3: 3985

                       4: 1316

                       5: 3985

                       6: 3985

                       7: 3985

                       8: 3985

                       9: 1328

                      10: 1340

                      11: 3985

                      12: 3985

                      13: 3985

                      14: 3985

                      15: 1352

                      16: 3985

                      17: 1364

                      18: 1376

                      19: 3985

                      20: 1388

                      21: 1400

                      22: 1412

                      23: 1424

                      24: 3985

                      25: 3985

                      26: 1436

                      27: 1448

                      28: 1460

                      29: 1472

                      30: 1484

                      31: 1496

                      32: 1508

                      33: 1520

                      34: 1532

                      35: 1544

                      36: 1556

                      37: 1568

                      38: 1580

                      39: 1592

                      40: 3985

                      41: 1604

                      42: 1616

                      43: 1628

                      44: 1640

                      45: 1652

                      46: 1655

                      47: 1667

                      48: 1679

                      49: 1691

                      50: 1709

                      51: 1721

                      52: 1733

                      53: 1745

                      54: 1757

                      55: 1769

                      56: 1781

                      57: 3985

                      58: 3985

                      59: 3985

                      60: 1793

                      61: 3985

                      62: 1805

                      63: 1817

                      64: 3985

                      65: 3985

                      66: 1829

                      67: 1841

                      68: 1853

                      69: 1865

                      70: 1877

                      71: 3985

                      72: 1889

                      73: 3985

                      74: 1901

                      75: 1913

                      76: 3985

                      77: 1925

                      78: 1937

                      79: 1949

                      80: 1961

                      81: 1973

                      82: 1985

                      83: 1997

                      84: 3985

                      85: 2009

                      86: 3985

                      87: 2021

                      88: 2033

                      89: 2045

                      90: 3985

                      91: 2057

                      92: 2069

                      93: 2081

                      94: 2093

                      95: 2105

                      96: 2117

                      97: 2129

                      98: 3985

                      99: 2141

                     100: 2153

                     101: 3985

                     102: 2165

                     103: 3985

                     104: 2177

                     105: 2189

                     106: 3985

                     107: 2201

                     108: 2213

                     109: 2225

                     110: 2237

                     111: 2249

                     112: 2261

                     113: 2273

                     114: 2285

                     115: 2297

                     116: 2309

                     117: 3985

                     118: 2321

                     119: 2333

                     120: 3985

                     121: 2345

                     122: 3985

                     123: 2357

                     124: 2369

                     125: 2381

                     126: 2393

                     127: 2405

                     128: 2417

                     129: 2429

                     130: 2441

                     131: 2453

                     132: 2465

                     133: 2477

                     134: 2489

                     135: 2501

                     136: 2513

                     137: 2525

                     138: 2537

                     139: 2549

                     140: 2561

                     141: 3985

                     142: 2573

                     143: 2585

                     144: 2597

                     145: 2609

                     146: 3985

                     147: 2621

                     148: 2633

                     149: 3985

                     150: 2645

                     151: 2657

                     152: 3985

                     153: 3985

                     154: 3985

                     155: 3985

                     156: 3985

                     157: 2669

                     158: 2672

                     159: 2684

                     160: 2696

                     161: 3985

                     162: 2708

                     163: 2720

                     164: 2732

                     165: 2744

                     166: 3985

                     167: 2756

                     168: 3985

                     169: 3985

                     170: 2768

                     171: 2780

                     172: 2792

                     173: 2804

                     174: 2816

                     175: 2828

                     176: 3985

                     177: 2840

                     178: 2852

                     179: 2864

                     180: 3985

                     181: 2876

                     182: 2888

                     183: 2900

                     184: 2912

                     185: 2924

                     186: 2936

                     187: 2948

                     188: 2960

                     189: 2972

                     190: 2984

                     191: 2996

                     192: 3008

                     193: 3020

                     194: 3032

                     195: 3044

                     196: 3056

                     197: 3068

                     198: 3080

                     199: 3092

                     200: 3104

                     201: 3985

                     202: 3116

                     203: 3985

                     204: 3128

                     205: 3140

                     206: 3152

                     207: 3155

                     208: 3167
                 default: 3985
            }
      1304: new           #105                // class ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation
      1307: dup
      1308: invokespecial #107                // Method ext/mods/gameserver/network/clientpackets/MoveBackwardToLocation."<init>":()V
      1311: astore        5
      1313: goto          3993
      1316: new           #108                // class ext/mods/gameserver/network/clientpackets/Action
      1319: dup
      1320: invokespecial #110                // Method ext/mods/gameserver/network/clientpackets/Action."<init>":()V
      1323: astore        5
      1325: goto          3993
      1328: new           #47                 // class ext/mods/gameserver/network/clientpackets/Logout
      1331: dup
      1332: invokespecial #49                 // Method ext/mods/gameserver/network/clientpackets/Logout."<init>":()V
      1335: astore        5
      1337: goto          3993
      1340: new           #111                // class ext/mods/gameserver/network/clientpackets/AttackRequest
      1343: dup
      1344: invokespecial #113                // Method ext/mods/gameserver/network/clientpackets/AttackRequest."<init>":()V
      1347: astore        5
      1349: goto          3993
      1352: new           #114                // class ext/mods/gameserver/network/clientpackets/RequestItemList
      1355: dup
      1356: invokespecial #116                // Method ext/mods/gameserver/network/clientpackets/RequestItemList."<init>":()V
      1359: astore        5
      1361: goto          3993
      1364: new           #117                // class ext/mods/gameserver/network/clientpackets/RequestUnEquipItem
      1367: dup
      1368: invokespecial #119                // Method ext/mods/gameserver/network/clientpackets/RequestUnEquipItem."<init>":()V
      1371: astore        5
      1373: goto          3993
      1376: new           #120                // class ext/mods/gameserver/network/clientpackets/RequestDropItem
      1379: dup
      1380: invokespecial #122                // Method ext/mods/gameserver/network/clientpackets/RequestDropItem."<init>":()V
      1383: astore        5
      1385: goto          3993
      1388: new           #123                // class ext/mods/gameserver/network/clientpackets/UseItem
      1391: dup
      1392: invokespecial #125                // Method ext/mods/gameserver/network/clientpackets/UseItem."<init>":()V
      1395: astore        5
      1397: goto          3993
      1400: new           #126                // class ext/mods/gameserver/network/clientpackets/TradeRequest
      1403: dup
      1404: invokespecial #128                // Method ext/mods/gameserver/network/clientpackets/TradeRequest."<init>":()V
      1407: astore        5
      1409: goto          3993
      1412: new           #129                // class ext/mods/gameserver/network/clientpackets/AddTradeItem
      1415: dup
      1416: invokespecial #131                // Method ext/mods/gameserver/network/clientpackets/AddTradeItem."<init>":()V
      1419: astore        5
      1421: goto          3993
      1424: new           #132                // class ext/mods/gameserver/network/clientpackets/TradeDone
      1427: dup
      1428: invokespecial #134                // Method ext/mods/gameserver/network/clientpackets/TradeDone."<init>":()V
      1431: astore        5
      1433: goto          3993
      1436: new           #135                // class ext/mods/gameserver/network/clientpackets/DummyPacket
      1439: dup
      1440: invokespecial #137                // Method ext/mods/gameserver/network/clientpackets/DummyPacket."<init>":()V
      1443: astore        5
      1445: goto          3993
      1448: new           #138                // class ext/mods/gameserver/network/clientpackets/RequestSocialAction
      1451: dup
      1452: invokespecial #140                // Method ext/mods/gameserver/network/clientpackets/RequestSocialAction."<init>":()V
      1455: astore        5
      1457: goto          3993
      1460: new           #141                // class ext/mods/gameserver/network/clientpackets/RequestChangeMoveType
      1463: dup
      1464: invokespecial #143                // Method ext/mods/gameserver/network/clientpackets/RequestChangeMoveType."<init>":()V
      1467: astore        5
      1469: goto          3993
      1472: new           #144                // class ext/mods/gameserver/network/clientpackets/RequestChangeWaitType
      1475: dup
      1476: invokespecial #146                // Method ext/mods/gameserver/network/clientpackets/RequestChangeWaitType."<init>":()V
      1479: astore        5
      1481: goto          3993
      1484: new           #147                // class ext/mods/gameserver/network/clientpackets/RequestSellItem
      1487: dup
      1488: invokespecial #149                // Method ext/mods/gameserver/network/clientpackets/RequestSellItem."<init>":()V
      1491: astore        5
      1493: goto          3993
      1496: new           #150                // class ext/mods/gameserver/network/clientpackets/RequestBuyItem
      1499: dup
      1500: invokespecial #152                // Method ext/mods/gameserver/network/clientpackets/RequestBuyItem."<init>":()V
      1503: astore        5
      1505: goto          3993
      1508: new           #153                // class ext/mods/gameserver/network/clientpackets/RequestLinkHtml
      1511: dup
      1512: invokespecial #155                // Method ext/mods/gameserver/network/clientpackets/RequestLinkHtml."<init>":()V
      1515: astore        5
      1517: goto          3993
      1520: new           #156                // class ext/mods/gameserver/network/clientpackets/RequestBypassToServer
      1523: dup
      1524: invokespecial #158                // Method ext/mods/gameserver/network/clientpackets/RequestBypassToServer."<init>":()V
      1527: astore        5
      1529: goto          3993
      1532: new           #159                // class ext/mods/gameserver/network/clientpackets/RequestBBSwrite
      1535: dup
      1536: invokespecial #161                // Method ext/mods/gameserver/network/clientpackets/RequestBBSwrite."<init>":()V
      1539: astore        5
      1541: goto          3993
      1544: new           #135                // class ext/mods/gameserver/network/clientpackets/DummyPacket
      1547: dup
      1548: invokespecial #137                // Method ext/mods/gameserver/network/clientpackets/DummyPacket."<init>":()V
      1551: astore        5
      1553: goto          3993
      1556: new           #162                // class ext/mods/gameserver/network/clientpackets/RequestJoinPledge
      1559: dup
      1560: invokespecial #164                // Method ext/mods/gameserver/network/clientpackets/RequestJoinPledge."<init>":()V
      1563: astore        5
      1565: goto          3993
      1568: new           #165                // class ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge
      1571: dup
      1572: invokespecial #167                // Method ext/mods/gameserver/network/clientpackets/RequestAnswerJoinPledge."<init>":()V
      1575: astore        5
      1577: goto          3993
      1580: new           #168                // class ext/mods/gameserver/network/clientpackets/RequestWithdrawPledge
      1583: dup
      1584: invokespecial #170                // Method ext/mods/gameserver/network/clientpackets/RequestWithdrawPledge."<init>":()V
      1587: astore        5
      1589: goto          3993
      1592: new           #171                // class ext/mods/gameserver/network/clientpackets/RequestOustPledgeMember
      1595: dup
      1596: invokespecial #173                // Method ext/mods/gameserver/network/clientpackets/RequestOustPledgeMember."<init>":()V
      1599: astore        5
      1601: goto          3993
      1604: new           #174                // class ext/mods/gameserver/network/clientpackets/RequestJoinParty
      1607: dup
      1608: invokespecial #176                // Method ext/mods/gameserver/network/clientpackets/RequestJoinParty."<init>":()V
      1611: astore        5
      1613: goto          3993
      1616: new           #177                // class ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty
      1619: dup
      1620: invokespecial #179                // Method ext/mods/gameserver/network/clientpackets/RequestAnswerJoinParty."<init>":()V
      1623: astore        5
      1625: goto          3993
      1628: new           #180                // class ext/mods/gameserver/network/clientpackets/RequestWithdrawParty
      1631: dup
      1632: invokespecial #182                // Method ext/mods/gameserver/network/clientpackets/RequestWithdrawParty."<init>":()V
      1635: astore        5
      1637: goto          3993
      1640: new           #183                // class ext/mods/gameserver/network/clientpackets/RequestOustPartyMember
      1643: dup
      1644: invokespecial #185                // Method ext/mods/gameserver/network/clientpackets/RequestOustPartyMember."<init>":()V
      1647: astore        5
      1649: goto          3993
      1652: goto          3993
      1655: new           #135                // class ext/mods/gameserver/network/clientpackets/DummyPacket
      1658: dup
      1659: invokespecial #137                // Method ext/mods/gameserver/network/clientpackets/DummyPacket."<init>":()V
      1662: astore        5
      1664: goto          3993
      1667: new           #186                // class ext/mods/gameserver/network/clientpackets/RequestMagicSkillUse
      1670: dup
      1671: invokespecial #188                // Method ext/mods/gameserver/network/clientpackets/RequestMagicSkillUse."<init>":()V
      1674: astore        5
      1676: goto          3993
      1679: new           #189                // class ext/mods/gameserver/network/clientpackets/Appearing
      1682: dup
      1683: invokespecial #191                // Method ext/mods/gameserver/network/clientpackets/Appearing."<init>":()V
      1686: astore        5
      1688: goto          3993
      1691: getstatic     #192                // Field ext/mods/Config.ALLOW_WAREHOUSE:Z
      1694: ifeq          3993
      1697: new           #198                // class ext/mods/gameserver/network/clientpackets/SendWarehouseDepositList
      1700: dup
      1701: invokespecial #200                // Method ext/mods/gameserver/network/clientpackets/SendWarehouseDepositList."<init>":()V
      1704: astore        5
      1706: goto          3993
      1709: new           #201                // class ext/mods/gameserver/network/clientpackets/SendWarehouseWithdrawList
      1712: dup
      1713: invokespecial #203                // Method ext/mods/gameserver/network/clientpackets/SendWarehouseWithdrawList."<init>":()V
      1716: astore        5
      1718: goto          3993
      1721: new           #204                // class ext/mods/gameserver/network/clientpackets/RequestShortCutReg
      1724: dup
      1725: invokespecial #206                // Method ext/mods/gameserver/network/clientpackets/RequestShortCutReg."<init>":()V
      1728: astore        5
      1730: goto          3993
      1733: new           #135                // class ext/mods/gameserver/network/clientpackets/DummyPacket
      1736: dup
      1737: invokespecial #137                // Method ext/mods/gameserver/network/clientpackets/DummyPacket."<init>":()V
      1740: astore        5
      1742: goto          3993
      1745: new           #207                // class ext/mods/gameserver/network/clientpackets/RequestShortCutDel
      1748: dup
      1749: invokespecial #209                // Method ext/mods/gameserver/network/clientpackets/RequestShortCutDel."<init>":()V
      1752: astore        5
      1754: goto          3993
      1757: new           #210                // class ext/mods/gameserver/network/clientpackets/CannotMoveAnymore
      1760: dup
      1761: invokespecial #212                // Method ext/mods/gameserver/network/clientpackets/CannotMoveAnymore."<init>":()V
      1764: astore        5
      1766: goto          3993
      1769: new           #213                // class ext/mods/gameserver/network/clientpackets/RequestTargetCancel
      1772: dup
      1773: invokespecial #215                // Method ext/mods/gameserver/network/clientpackets/RequestTargetCancel."<init>":()V
      1776: astore        5
      1778: goto          3993
      1781: new           #216                // class ext/mods/gameserver/network/clientpackets/Say2
      1784: dup
      1785: invokespecial #218                // Method ext/mods/gameserver/network/clientpackets/Say2."<init>":()V
      1788: astore        5
      1790: goto          3993
      1793: new           #219                // class ext/mods/gameserver/network/clientpackets/RequestPledgeMemberList
      1796: dup
      1797: invokespecial #221                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeMemberList."<init>":()V
      1800: astore        5
      1802: goto          3993
      1805: new           #135                // class ext/mods/gameserver/network/clientpackets/DummyPacket
      1808: dup
      1809: invokespecial #137                // Method ext/mods/gameserver/network/clientpackets/DummyPacket."<init>":()V
      1812: astore        5
      1814: goto          3993
      1817: new           #222                // class ext/mods/gameserver/network/clientpackets/RequestSkillList
      1820: dup
      1821: invokespecial #224                // Method ext/mods/gameserver/network/clientpackets/RequestSkillList."<init>":()V
      1824: astore        5
      1826: goto          3993
      1829: new           #225                // class ext/mods/gameserver/network/clientpackets/RequestGetOnVehicle
      1832: dup
      1833: invokespecial #227                // Method ext/mods/gameserver/network/clientpackets/RequestGetOnVehicle."<init>":()V
      1836: astore        5
      1838: goto          3993
      1841: new           #228                // class ext/mods/gameserver/network/clientpackets/RequestGetOffVehicle
      1844: dup
      1845: invokespecial #230                // Method ext/mods/gameserver/network/clientpackets/RequestGetOffVehicle."<init>":()V
      1848: astore        5
      1850: goto          3993
      1853: new           #231                // class ext/mods/gameserver/network/clientpackets/AnswerTradeRequest
      1856: dup
      1857: invokespecial #233                // Method ext/mods/gameserver/network/clientpackets/AnswerTradeRequest."<init>":()V
      1860: astore        5
      1862: goto          3993
      1865: new           #234                // class ext/mods/gameserver/network/clientpackets/RequestActionUse
      1868: dup
      1869: invokespecial #236                // Method ext/mods/gameserver/network/clientpackets/RequestActionUse."<init>":()V
      1872: astore        5
      1874: goto          3993
      1877: new           #237                // class ext/mods/gameserver/network/clientpackets/RequestRestart
      1880: dup
      1881: invokespecial #239                // Method ext/mods/gameserver/network/clientpackets/RequestRestart."<init>":()V
      1884: astore        5
      1886: goto          3993
      1889: new           #240                // class ext/mods/gameserver/network/clientpackets/ValidatePosition
      1892: dup
      1893: invokespecial #242                // Method ext/mods/gameserver/network/clientpackets/ValidatePosition."<init>":()V
      1896: astore        5
      1898: goto          3993
      1901: new           #243                // class ext/mods/gameserver/network/clientpackets/StartRotating
      1904: dup
      1905: invokespecial #245                // Method ext/mods/gameserver/network/clientpackets/StartRotating."<init>":()V
      1908: astore        5
      1910: goto          3993
      1913: new           #246                // class ext/mods/gameserver/network/clientpackets/FinishRotating
      1916: dup
      1917: invokespecial #248                // Method ext/mods/gameserver/network/clientpackets/FinishRotating."<init>":()V
      1920: astore        5
      1922: goto          3993
      1925: new           #249                // class ext/mods/gameserver/network/clientpackets/RequestStartPledgeWar
      1928: dup
      1929: invokespecial #251                // Method ext/mods/gameserver/network/clientpackets/RequestStartPledgeWar."<init>":()V
      1932: astore        5
      1934: goto          3993
      1937: new           #252                // class ext/mods/gameserver/network/clientpackets/RequestReplyStartPledgeWar
      1940: dup
      1941: invokespecial #254                // Method ext/mods/gameserver/network/clientpackets/RequestReplyStartPledgeWar."<init>":()V
      1944: astore        5
      1946: goto          3993
      1949: new           #255                // class ext/mods/gameserver/network/clientpackets/RequestStopPledgeWar
      1952: dup
      1953: invokespecial #257                // Method ext/mods/gameserver/network/clientpackets/RequestStopPledgeWar."<init>":()V
      1956: astore        5
      1958: goto          3993
      1961: new           #258                // class ext/mods/gameserver/network/clientpackets/RequestReplyStopPledgeWar
      1964: dup
      1965: invokespecial #260                // Method ext/mods/gameserver/network/clientpackets/RequestReplyStopPledgeWar."<init>":()V
      1968: astore        5
      1970: goto          3993
      1973: new           #261                // class ext/mods/gameserver/network/clientpackets/RequestSurrenderPledgeWar
      1976: dup
      1977: invokespecial #263                // Method ext/mods/gameserver/network/clientpackets/RequestSurrenderPledgeWar."<init>":()V
      1980: astore        5
      1982: goto          3993
      1985: new           #264                // class ext/mods/gameserver/network/clientpackets/RequestReplySurrenderPledgeWar
      1988: dup
      1989: invokespecial #266                // Method ext/mods/gameserver/network/clientpackets/RequestReplySurrenderPledgeWar."<init>":()V
      1992: astore        5
      1994: goto          3993
      1997: new           #267                // class ext/mods/gameserver/network/clientpackets/RequestSetPledgeCrest
      2000: dup
      2001: invokespecial #269                // Method ext/mods/gameserver/network/clientpackets/RequestSetPledgeCrest."<init>":()V
      2004: astore        5
      2006: goto          3993
      2009: new           #270                // class ext/mods/gameserver/network/clientpackets/RequestGiveNickName
      2012: dup
      2013: invokespecial #272                // Method ext/mods/gameserver/network/clientpackets/RequestGiveNickName."<init>":()V
      2016: astore        5
      2018: goto          3993
      2021: new           #273                // class ext/mods/gameserver/network/clientpackets/RequestShowBoard
      2024: dup
      2025: invokespecial #275                // Method ext/mods/gameserver/network/clientpackets/RequestShowBoard."<init>":()V
      2028: astore        5
      2030: goto          3993
      2033: new           #276                // class ext/mods/gameserver/network/clientpackets/RequestEnchantItem
      2036: dup
      2037: invokespecial #278                // Method ext/mods/gameserver/network/clientpackets/RequestEnchantItem."<init>":()V
      2040: astore        5
      2042: goto          3993
      2045: new           #279                // class ext/mods/gameserver/network/clientpackets/RequestDestroyItem
      2048: dup
      2049: invokespecial #281                // Method ext/mods/gameserver/network/clientpackets/RequestDestroyItem."<init>":()V
      2052: astore        5
      2054: goto          3993
      2057: new           #282                // class ext/mods/gameserver/network/clientpackets/SendBypassBuildCmd
      2060: dup
      2061: invokespecial #284                // Method ext/mods/gameserver/network/clientpackets/SendBypassBuildCmd."<init>":()V
      2064: astore        5
      2066: goto          3993
      2069: new           #285                // class ext/mods/gameserver/network/clientpackets/RequestMoveToLocationInVehicle
      2072: dup
      2073: invokespecial #287                // Method ext/mods/gameserver/network/clientpackets/RequestMoveToLocationInVehicle."<init>":()V
      2076: astore        5
      2078: goto          3993
      2081: new           #288                // class ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle
      2084: dup
      2085: invokespecial #290                // Method ext/mods/gameserver/network/clientpackets/CannotMoveAnymoreInVehicle."<init>":()V
      2088: astore        5
      2090: goto          3993
      2093: new           #291                // class ext/mods/gameserver/network/clientpackets/RequestFriendInvite
      2096: dup
      2097: invokespecial #293                // Method ext/mods/gameserver/network/clientpackets/RequestFriendInvite."<init>":()V
      2100: astore        5
      2102: goto          3993
      2105: new           #294                // class ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite
      2108: dup
      2109: invokespecial #296                // Method ext/mods/gameserver/network/clientpackets/RequestAnswerFriendInvite."<init>":()V
      2112: astore        5
      2114: goto          3993
      2117: new           #297                // class ext/mods/gameserver/network/clientpackets/RequestFriendList
      2120: dup
      2121: invokespecial #299                // Method ext/mods/gameserver/network/clientpackets/RequestFriendList."<init>":()V
      2124: astore        5
      2126: goto          3993
      2129: new           #300                // class ext/mods/gameserver/network/clientpackets/RequestFriendDel
      2132: dup
      2133: invokespecial #302                // Method ext/mods/gameserver/network/clientpackets/RequestFriendDel."<init>":()V
      2136: astore        5
      2138: goto          3993
      2141: new           #102                // class ext/mods/gameserver/network/clientpackets/RequestQuestList
      2144: dup
      2145: invokespecial #104                // Method ext/mods/gameserver/network/clientpackets/RequestQuestList."<init>":()V
      2148: astore        5
      2150: goto          3993
      2153: new           #303                // class ext/mods/gameserver/network/clientpackets/RequestQuestAbort
      2156: dup
      2157: invokespecial #305                // Method ext/mods/gameserver/network/clientpackets/RequestQuestAbort."<init>":()V
      2160: astore        5
      2162: goto          3993
      2165: new           #306                // class ext/mods/gameserver/network/clientpackets/RequestPledgeInfo
      2168: dup
      2169: invokespecial #308                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeInfo."<init>":()V
      2172: astore        5
      2174: goto          3993
      2177: new           #65                 // class ext/mods/gameserver/network/clientpackets/RequestPledgeCrest
      2180: dup
      2181: invokespecial #67                 // Method ext/mods/gameserver/network/clientpackets/RequestPledgeCrest."<init>":()V
      2184: astore        5
      2186: goto          3993
      2189: new           #309                // class ext/mods/gameserver/network/clientpackets/RequestSurrenderPersonally
      2192: dup
      2193: invokespecial #311                // Method ext/mods/gameserver/network/clientpackets/RequestSurrenderPersonally."<init>":()V
      2196: astore        5
      2198: goto          3993
      2201: new           #312                // class ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo
      2204: dup
      2205: invokespecial #314                // Method ext/mods/gameserver/network/clientpackets/RequestAcquireSkillInfo."<init>":()V
      2208: astore        5
      2210: goto          3993
      2213: new           #315                // class ext/mods/gameserver/network/clientpackets/RequestAcquireSkill
      2216: dup
      2217: invokespecial #317                // Method ext/mods/gameserver/network/clientpackets/RequestAcquireSkill."<init>":()V
      2220: astore        5
      2222: goto          3993
      2225: new           #318                // class ext/mods/gameserver/network/clientpackets/RequestRestartPoint
      2228: dup
      2229: invokespecial #320                // Method ext/mods/gameserver/network/clientpackets/RequestRestartPoint."<init>":()V
      2232: astore        5
      2234: goto          3993
      2237: new           #321                // class ext/mods/gameserver/network/clientpackets/RequestGMCommand
      2240: dup
      2241: invokespecial #323                // Method ext/mods/gameserver/network/clientpackets/RequestGMCommand."<init>":()V
      2244: astore        5
      2246: goto          3993
      2249: new           #324                // class ext/mods/gameserver/network/clientpackets/RequestListPartyWaiting
      2252: dup
      2253: invokespecial #326                // Method ext/mods/gameserver/network/clientpackets/RequestListPartyWaiting."<init>":()V
      2256: astore        5
      2258: goto          3993
      2261: new           #327                // class ext/mods/gameserver/network/clientpackets/RequestManagePartyRoom
      2264: dup
      2265: invokespecial #329                // Method ext/mods/gameserver/network/clientpackets/RequestManagePartyRoom."<init>":()V
      2268: astore        5
      2270: goto          3993
      2273: new           #330                // class ext/mods/gameserver/network/clientpackets/RequestJoinPartyRoom
      2276: dup
      2277: invokespecial #332                // Method ext/mods/gameserver/network/clientpackets/RequestJoinPartyRoom."<init>":()V
      2280: astore        5
      2282: goto          3993
      2285: new           #333                // class ext/mods/gameserver/network/clientpackets/RequestCrystallizeItem
      2288: dup
      2289: invokespecial #335                // Method ext/mods/gameserver/network/clientpackets/RequestCrystallizeItem."<init>":()V
      2292: astore        5
      2294: goto          3993
      2297: new           #336                // class ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageSell
      2300: dup
      2301: invokespecial #338                // Method ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageSell."<init>":()V
      2304: astore        5
      2306: goto          3993
      2309: new           #339                // class ext/mods/gameserver/network/clientpackets/SetPrivateStoreListSell
      2312: dup
      2313: invokespecial #341                // Method ext/mods/gameserver/network/clientpackets/SetPrivateStoreListSell."<init>":()V
      2316: astore        5
      2318: goto          3993
      2321: new           #342                // class ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitSell
      2324: dup
      2325: invokespecial #344                // Method ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitSell."<init>":()V
      2328: astore        5
      2330: goto          3993
      2333: new           #345                // class ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgSell
      2336: dup
      2337: invokespecial #347                // Method ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgSell."<init>":()V
      2340: astore        5
      2342: goto          3993
      2345: new           #348                // class ext/mods/gameserver/network/clientpackets/RequestPrivateStoreBuy
      2348: dup
      2349: invokespecial #350                // Method ext/mods/gameserver/network/clientpackets/RequestPrivateStoreBuy."<init>":()V
      2352: astore        5
      2354: goto          3993
      2357: new           #351                // class ext/mods/gameserver/network/clientpackets/RequestTutorialLinkHtml
      2360: dup
      2361: invokespecial #353                // Method ext/mods/gameserver/network/clientpackets/RequestTutorialLinkHtml."<init>":()V
      2364: astore        5
      2366: goto          3993
      2369: new           #354                // class ext/mods/gameserver/network/clientpackets/RequestTutorialPassCmdToServer
      2372: dup
      2373: invokespecial #356                // Method ext/mods/gameserver/network/clientpackets/RequestTutorialPassCmdToServer."<init>":()V
      2376: astore        5
      2378: goto          3993
      2381: new           #357                // class ext/mods/gameserver/network/clientpackets/RequestTutorialQuestionMark
      2384: dup
      2385: invokespecial #359                // Method ext/mods/gameserver/network/clientpackets/RequestTutorialQuestionMark."<init>":()V
      2388: astore        5
      2390: goto          3993
      2393: new           #360                // class ext/mods/gameserver/network/clientpackets/RequestTutorialClientEvent
      2396: dup
      2397: invokespecial #362                // Method ext/mods/gameserver/network/clientpackets/RequestTutorialClientEvent."<init>":()V
      2400: astore        5
      2402: goto          3993
      2405: new           #363                // class ext/mods/gameserver/network/clientpackets/RequestPetition
      2408: dup
      2409: invokespecial #365                // Method ext/mods/gameserver/network/clientpackets/RequestPetition."<init>":()V
      2412: astore        5
      2414: goto          3993
      2417: new           #366                // class ext/mods/gameserver/network/clientpackets/RequestPetitionCancel
      2420: dup
      2421: invokespecial #368                // Method ext/mods/gameserver/network/clientpackets/RequestPetitionCancel."<init>":()V
      2424: astore        5
      2426: goto          3993
      2429: new           #369                // class ext/mods/gameserver/network/clientpackets/RequestGmList
      2432: dup
      2433: invokespecial #371                // Method ext/mods/gameserver/network/clientpackets/RequestGmList."<init>":()V
      2436: astore        5
      2438: goto          3993
      2441: new           #372                // class ext/mods/gameserver/network/clientpackets/RequestJoinAlly
      2444: dup
      2445: invokespecial #374                // Method ext/mods/gameserver/network/clientpackets/RequestJoinAlly."<init>":()V
      2448: astore        5
      2450: goto          3993
      2453: new           #375                // class ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly
      2456: dup
      2457: invokespecial #377                // Method ext/mods/gameserver/network/clientpackets/RequestAnswerJoinAlly."<init>":()V
      2460: astore        5
      2462: goto          3993
      2465: new           #378                // class ext/mods/gameserver/network/clientpackets/AllyLeave
      2468: dup
      2469: invokespecial #380                // Method ext/mods/gameserver/network/clientpackets/AllyLeave."<init>":()V
      2472: astore        5
      2474: goto          3993
      2477: new           #381                // class ext/mods/gameserver/network/clientpackets/AllyDismiss
      2480: dup
      2481: invokespecial #383                // Method ext/mods/gameserver/network/clientpackets/AllyDismiss."<init>":()V
      2484: astore        5
      2486: goto          3993
      2489: new           #384                // class ext/mods/gameserver/network/clientpackets/RequestDismissAlly
      2492: dup
      2493: invokespecial #386                // Method ext/mods/gameserver/network/clientpackets/RequestDismissAlly."<init>":()V
      2496: astore        5
      2498: goto          3993
      2501: new           #387                // class ext/mods/gameserver/network/clientpackets/RequestSetAllyCrest
      2504: dup
      2505: invokespecial #389                // Method ext/mods/gameserver/network/clientpackets/RequestSetAllyCrest."<init>":()V
      2508: astore        5
      2510: goto          3993
      2513: new           #390                // class ext/mods/gameserver/network/clientpackets/RequestAllyCrest
      2516: dup
      2517: invokespecial #392                // Method ext/mods/gameserver/network/clientpackets/RequestAllyCrest."<init>":()V
      2520: astore        5
      2522: goto          3993
      2525: new           #393                // class ext/mods/gameserver/network/clientpackets/RequestChangePetName
      2528: dup
      2529: invokespecial #395                // Method ext/mods/gameserver/network/clientpackets/RequestChangePetName."<init>":()V
      2532: astore        5
      2534: goto          3993
      2537: new           #396                // class ext/mods/gameserver/network/clientpackets/RequestPetUseItem
      2540: dup
      2541: invokespecial #398                // Method ext/mods/gameserver/network/clientpackets/RequestPetUseItem."<init>":()V
      2544: astore        5
      2546: goto          3993
      2549: new           #399                // class ext/mods/gameserver/network/clientpackets/RequestGiveItemToPet
      2552: dup
      2553: invokespecial #401                // Method ext/mods/gameserver/network/clientpackets/RequestGiveItemToPet."<init>":()V
      2556: astore        5
      2558: goto          3993
      2561: new           #402                // class ext/mods/gameserver/network/clientpackets/RequestGetItemFromPet
      2564: dup
      2565: invokespecial #404                // Method ext/mods/gameserver/network/clientpackets/RequestGetItemFromPet."<init>":()V
      2568: astore        5
      2570: goto          3993
      2573: new           #405                // class ext/mods/gameserver/network/clientpackets/RequestAllyInfo
      2576: dup
      2577: invokespecial #407                // Method ext/mods/gameserver/network/clientpackets/RequestAllyInfo."<init>":()V
      2580: astore        5
      2582: goto          3993
      2585: new           #408                // class ext/mods/gameserver/network/clientpackets/RequestPetGetItem
      2588: dup
      2589: invokespecial #410                // Method ext/mods/gameserver/network/clientpackets/RequestPetGetItem."<init>":()V
      2592: astore        5
      2594: goto          3993
      2597: new           #411                // class ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageBuy
      2600: dup
      2601: invokespecial #413                // Method ext/mods/gameserver/network/clientpackets/RequestPrivateStoreManageBuy."<init>":()V
      2604: astore        5
      2606: goto          3993
      2609: new           #414                // class ext/mods/gameserver/network/clientpackets/SetPrivateStoreListBuy
      2612: dup
      2613: invokespecial #416                // Method ext/mods/gameserver/network/clientpackets/SetPrivateStoreListBuy."<init>":()V
      2616: astore        5
      2618: goto          3993
      2621: new           #417                // class ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitBuy
      2624: dup
      2625: invokespecial #419                // Method ext/mods/gameserver/network/clientpackets/RequestPrivateStoreQuitBuy."<init>":()V
      2628: astore        5
      2630: goto          3993
      2633: new           #420                // class ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgBuy
      2636: dup
      2637: invokespecial #422                // Method ext/mods/gameserver/network/clientpackets/SetPrivateStoreMsgBuy."<init>":()V
      2640: astore        5
      2642: goto          3993
      2645: new           #423                // class ext/mods/gameserver/network/clientpackets/RequestPrivateStoreSell
      2648: dup
      2649: invokespecial #425                // Method ext/mods/gameserver/network/clientpackets/RequestPrivateStoreSell."<init>":()V
      2652: astore        5
      2654: goto          3993
      2657: new           #426                // class ext/mods/gameserver/network/clientpackets/SendTimeCheck
      2660: dup
      2661: invokespecial #428                // Method ext/mods/gameserver/network/clientpackets/SendTimeCheck."<init>":()V
      2664: astore        5
      2666: goto          3993
      2669: goto          3993
      2672: new           #429                // class ext/mods/gameserver/network/clientpackets/RequestPackageSendableItemList
      2675: dup
      2676: invokespecial #431                // Method ext/mods/gameserver/network/clientpackets/RequestPackageSendableItemList."<init>":()V
      2679: astore        5
      2681: goto          3993
      2684: new           #432                // class ext/mods/gameserver/network/clientpackets/RequestPackageSend
      2687: dup
      2688: invokespecial #434                // Method ext/mods/gameserver/network/clientpackets/RequestPackageSend."<init>":()V
      2691: astore        5
      2693: goto          3993
      2696: new           #435                // class ext/mods/gameserver/network/clientpackets/RequestBlock
      2699: dup
      2700: invokespecial #437                // Method ext/mods/gameserver/network/clientpackets/RequestBlock."<init>":()V
      2703: astore        5
      2705: goto          3993
      2708: new           #438                // class ext/mods/gameserver/network/clientpackets/RequestSiegeAttackerList
      2711: dup
      2712: invokespecial #440                // Method ext/mods/gameserver/network/clientpackets/RequestSiegeAttackerList."<init>":()V
      2715: astore        5
      2717: goto          3993
      2720: new           #441                // class ext/mods/gameserver/network/clientpackets/RequestSiegeDefenderList
      2723: dup
      2724: invokespecial #443                // Method ext/mods/gameserver/network/clientpackets/RequestSiegeDefenderList."<init>":()V
      2727: astore        5
      2729: goto          3993
      2732: new           #444                // class ext/mods/gameserver/network/clientpackets/RequestJoinSiege
      2735: dup
      2736: invokespecial #446                // Method ext/mods/gameserver/network/clientpackets/RequestJoinSiege."<init>":()V
      2739: astore        5
      2741: goto          3993
      2744: new           #447                // class ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList
      2747: dup
      2748: invokespecial #449                // Method ext/mods/gameserver/network/clientpackets/RequestConfirmSiegeWaitingList."<init>":()V
      2751: astore        5
      2753: goto          3993
      2756: new           #450                // class ext/mods/gameserver/network/clientpackets/MultiSellChoose
      2759: dup
      2760: invokespecial #452                // Method ext/mods/gameserver/network/clientpackets/MultiSellChoose."<init>":()V
      2763: astore        5
      2765: goto          3993
      2768: new           #453                // class ext/mods/gameserver/network/clientpackets/RequestUserCommand
      2771: dup
      2772: invokespecial #455                // Method ext/mods/gameserver/network/clientpackets/RequestUserCommand."<init>":()V
      2775: astore        5
      2777: goto          3993
      2780: new           #456                // class ext/mods/gameserver/network/clientpackets/SnoopQuit
      2783: dup
      2784: invokespecial #458                // Method ext/mods/gameserver/network/clientpackets/SnoopQuit."<init>":()V
      2787: astore        5
      2789: goto          3993
      2792: new           #459                // class ext/mods/gameserver/network/clientpackets/RequestRecipeBookOpen
      2795: dup
      2796: invokespecial #461                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeBookOpen."<init>":()V
      2799: astore        5
      2801: goto          3993
      2804: new           #462                // class ext/mods/gameserver/network/clientpackets/RequestRecipeBookDestroy
      2807: dup
      2808: invokespecial #464                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeBookDestroy."<init>":()V
      2811: astore        5
      2813: goto          3993
      2816: new           #465                // class ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeInfo
      2819: dup
      2820: invokespecial #467                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeInfo."<init>":()V
      2823: astore        5
      2825: goto          3993
      2828: new           #468                // class ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeSelf
      2831: dup
      2832: invokespecial #470                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeItemMakeSelf."<init>":()V
      2835: astore        5
      2837: goto          3993
      2840: new           #471                // class ext/mods/gameserver/network/clientpackets/RequestRecipeShopMessageSet
      2843: dup
      2844: invokespecial #473                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeShopMessageSet."<init>":()V
      2847: astore        5
      2849: goto          3993
      2852: new           #474                // class ext/mods/gameserver/network/clientpackets/RequestRecipeShopListSet
      2855: dup
      2856: invokespecial #476                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeShopListSet."<init>":()V
      2859: astore        5
      2861: goto          3993
      2864: new           #477                // class ext/mods/gameserver/network/clientpackets/RequestRecipeShopManageQuit
      2867: dup
      2868: invokespecial #479                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeShopManageQuit."<init>":()V
      2871: astore        5
      2873: goto          3993
      2876: new           #480                // class ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeInfo
      2879: dup
      2880: invokespecial #482                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeInfo."<init>":()V
      2883: astore        5
      2885: goto          3993
      2888: new           #483                // class ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeItem
      2891: dup
      2892: invokespecial #485                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeShopMakeItem."<init>":()V
      2895: astore        5
      2897: goto          3993
      2900: new           #486                // class ext/mods/gameserver/network/clientpackets/RequestRecipeShopManagePrev
      2903: dup
      2904: invokespecial #488                // Method ext/mods/gameserver/network/clientpackets/RequestRecipeShopManagePrev."<init>":()V
      2907: astore        5
      2909: goto          3993
      2912: new           #489                // class ext/mods/gameserver/network/clientpackets/ObserverReturn
      2915: dup
      2916: invokespecial #491                // Method ext/mods/gameserver/network/clientpackets/ObserverReturn."<init>":()V
      2919: astore        5
      2921: goto          3993
      2924: new           #492                // class ext/mods/gameserver/network/clientpackets/RequestEvaluate
      2927: dup
      2928: invokespecial #494                // Method ext/mods/gameserver/network/clientpackets/RequestEvaluate."<init>":()V
      2931: astore        5
      2933: goto          3993
      2936: new           #495                // class ext/mods/gameserver/network/clientpackets/RequestHennaItemList
      2939: dup
      2940: invokespecial #497                // Method ext/mods/gameserver/network/clientpackets/RequestHennaItemList."<init>":()V
      2943: astore        5
      2945: goto          3993
      2948: new           #498                // class ext/mods/gameserver/network/clientpackets/RequestHennaItemInfo
      2951: dup
      2952: invokespecial #500                // Method ext/mods/gameserver/network/clientpackets/RequestHennaItemInfo."<init>":()V
      2955: astore        5
      2957: goto          3993
      2960: new           #501                // class ext/mods/gameserver/network/clientpackets/RequestHennaEquip
      2963: dup
      2964: invokespecial #503                // Method ext/mods/gameserver/network/clientpackets/RequestHennaEquip."<init>":()V
      2967: astore        5
      2969: goto          3993
      2972: new           #504                // class ext/mods/gameserver/network/clientpackets/RequestHennaUnequipList
      2975: dup
      2976: invokespecial #506                // Method ext/mods/gameserver/network/clientpackets/RequestHennaUnequipList."<init>":()V
      2979: astore        5
      2981: goto          3993
      2984: new           #507                // class ext/mods/gameserver/network/clientpackets/RequestHennaUnequipInfo
      2987: dup
      2988: invokespecial #509                // Method ext/mods/gameserver/network/clientpackets/RequestHennaUnequipInfo."<init>":()V
      2991: astore        5
      2993: goto          3993
      2996: new           #510                // class ext/mods/gameserver/network/clientpackets/RequestHennaUnequip
      2999: dup
      3000: invokespecial #512                // Method ext/mods/gameserver/network/clientpackets/RequestHennaUnequip."<init>":()V
      3003: astore        5
      3005: goto          3993
      3008: new           #513                // class ext/mods/gameserver/network/clientpackets/RequestPledgePower
      3011: dup
      3012: invokespecial #515                // Method ext/mods/gameserver/network/clientpackets/RequestPledgePower."<init>":()V
      3015: astore        5
      3017: goto          3993
      3020: new           #516                // class ext/mods/gameserver/network/clientpackets/RequestMakeMacro
      3023: dup
      3024: invokespecial #518                // Method ext/mods/gameserver/network/clientpackets/RequestMakeMacro."<init>":()V
      3027: astore        5
      3029: goto          3993
      3032: new           #519                // class ext/mods/gameserver/network/clientpackets/RequestDeleteMacro
      3035: dup
      3036: invokespecial #521                // Method ext/mods/gameserver/network/clientpackets/RequestDeleteMacro."<init>":()V
      3039: astore        5
      3041: goto          3993
      3044: new           #522                // class ext/mods/gameserver/network/clientpackets/RequestBuyProcure
      3047: dup
      3048: invokespecial #524                // Method ext/mods/gameserver/network/clientpackets/RequestBuyProcure."<init>":()V
      3051: astore        5
      3053: goto          3993
      3056: new           #525                // class ext/mods/gameserver/network/clientpackets/RequestBuySeed
      3059: dup
      3060: invokespecial #527                // Method ext/mods/gameserver/network/clientpackets/RequestBuySeed."<init>":()V
      3063: astore        5
      3065: goto          3993
      3068: new           #528                // class ext/mods/gameserver/network/clientpackets/DlgAnswer
      3071: dup
      3072: invokespecial #530                // Method ext/mods/gameserver/network/clientpackets/DlgAnswer."<init>":()V
      3075: astore        5
      3077: goto          3993
      3080: new           #531                // class ext/mods/gameserver/network/clientpackets/RequestPreviewItem
      3083: dup
      3084: invokespecial #533                // Method ext/mods/gameserver/network/clientpackets/RequestPreviewItem."<init>":()V
      3087: astore        5
      3089: goto          3993
      3092: new           #534                // class ext/mods/gameserver/network/clientpackets/RequestSSQStatus
      3095: dup
      3096: invokespecial #536                // Method ext/mods/gameserver/network/clientpackets/RequestSSQStatus."<init>":()V
      3099: astore        5
      3101: goto          3993
      3104: new           #537                // class ext/mods/gameserver/network/clientpackets/PetitionVote
      3107: dup
      3108: invokespecial #539                // Method ext/mods/gameserver/network/clientpackets/PetitionVote."<init>":()V
      3111: astore        5
      3113: goto          3993
      3116: new           #540                // class ext/mods/gameserver/network/clientpackets/GameGuardReply
      3119: dup
      3120: invokespecial #542                // Method ext/mods/gameserver/network/clientpackets/GameGuardReply."<init>":()V
      3123: astore        5
      3125: goto          3993
      3128: new           #543                // class ext/mods/gameserver/network/clientpackets/RequestSendL2FriendSay
      3131: dup
      3132: invokespecial #545                // Method ext/mods/gameserver/network/clientpackets/RequestSendL2FriendSay."<init>":()V
      3135: astore        5
      3137: goto          3993
      3140: new           #546                // class ext/mods/gameserver/network/clientpackets/RequestShowMiniMap
      3143: dup
      3144: invokespecial #548                // Method ext/mods/gameserver/network/clientpackets/RequestShowMiniMap."<init>":()V
      3147: astore        5
      3149: goto          3993
      3152: goto          3993
      3155: new           #549                // class ext/mods/gameserver/network/clientpackets/RequestRecordInfo
      3158: dup
      3159: invokespecial #551                // Method ext/mods/gameserver/network/clientpackets/RequestRecordInfo."<init>":()V
      3162: astore        5
      3164: goto          3993
      3167: iconst_m1
      3168: istore        6
      3170: aload_1
      3171: invokevirtual #71                 // Method java/nio/ByteBuffer.remaining:()I
      3174: iconst_2
      3175: if_icmplt     3190
      3178: aload_1
      3179: invokevirtual #74                 // Method java/nio/ByteBuffer.getShort:()S
      3182: ldc           #78                 // int 65535
      3184: iand
      3185: istore        6
      3187: goto          3212
      3190: getstatic     #79                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
      3193: ldc           #83                 // String {} sent a 0xd0 without the second opcode.
      3195: iconst_1
      3196: anewarray     #2                  // class java/lang/Object
      3199: dup
      3200: iconst_0
      3201: aload_2
      3202: invokevirtual #85                 // Method ext/mods/gameserver/network/GameClient.toString:()Ljava/lang/String;
      3205: aastore
      3206: invokevirtual #89                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
      3209: goto          3993
      3212: iload         6
      3214: tableswitch   { // 1 to 48

                       1: 3420

                       2: 3432

                       3: 3444

                       4: 3456

                       5: 3468

                       6: 3480

                       7: 3492

                       8: 3504

                       9: 3516

                      10: 3528

                      11: 3540

                      12: 3552

                      13: 3564

                      14: 3576

                      15: 3588

                      16: 3600

                      17: 3612

                      18: 3624

                      19: 3636

                      20: 3648

                      21: 3660

                      22: 3672

                      23: 3684

                      24: 3696

                      25: 3708

                      26: 3720

                      27: 3732

                      28: 3744

                      29: 3756

                      30: 3768

                      31: 3780

                      32: 3792

                      33: 3972

                      34: 3804

                      35: 3816

                      36: 3828

                      37: 3972

                      38: 3840

                      39: 3852

                      40: 3864

                      41: 3876

                      42: 3888

                      43: 3900

                      44: 3912

                      45: 3924

                      46: 3936

                      47: 3948

                      48: 3960
                 default: 3972
            }
      3420: new           #552                // class ext/mods/gameserver/network/clientpackets/RequestOustFromPartyRoom
      3423: dup
      3424: invokespecial #554                // Method ext/mods/gameserver/network/clientpackets/RequestOustFromPartyRoom."<init>":()V
      3427: astore        5
      3429: goto          3993
      3432: new           #555                // class ext/mods/gameserver/network/clientpackets/RequestDismissPartyRoom
      3435: dup
      3436: invokespecial #557                // Method ext/mods/gameserver/network/clientpackets/RequestDismissPartyRoom."<init>":()V
      3439: astore        5
      3441: goto          3993
      3444: new           #558                // class ext/mods/gameserver/network/clientpackets/RequestWithdrawPartyRoom
      3447: dup
      3448: invokespecial #560                // Method ext/mods/gameserver/network/clientpackets/RequestWithdrawPartyRoom."<init>":()V
      3451: astore        5
      3453: goto          3993
      3456: new           #561                // class ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader
      3459: dup
      3460: invokespecial #563                // Method ext/mods/gameserver/network/clientpackets/RequestChangePartyLeader."<init>":()V
      3463: astore        5
      3465: goto          3993
      3468: new           #564                // class ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot
      3471: dup
      3472: invokespecial #566                // Method ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot."<init>":()V
      3475: astore        5
      3477: goto          3993
      3480: new           #567                // class ext/mods/gameserver/network/clientpackets/RequestExEnchantSkillInfo
      3483: dup
      3484: invokespecial #569                // Method ext/mods/gameserver/network/clientpackets/RequestExEnchantSkillInfo."<init>":()V
      3487: astore        5
      3489: goto          3993
      3492: new           #570                // class ext/mods/gameserver/network/clientpackets/RequestExEnchantSkill
      3495: dup
      3496: invokespecial #572                // Method ext/mods/gameserver/network/clientpackets/RequestExEnchantSkill."<init>":()V
      3499: astore        5
      3501: goto          3993
      3504: new           #95                 // class ext/mods/gameserver/network/clientpackets/RequestManorList
      3507: dup
      3508: invokespecial #97                 // Method ext/mods/gameserver/network/clientpackets/RequestManorList."<init>":()V
      3511: astore        5
      3513: goto          3993
      3516: new           #573                // class ext/mods/gameserver/network/clientpackets/RequestProcureCropList
      3519: dup
      3520: invokespecial #575                // Method ext/mods/gameserver/network/clientpackets/RequestProcureCropList."<init>":()V
      3523: astore        5
      3525: goto          3993
      3528: new           #576                // class ext/mods/gameserver/network/clientpackets/RequestSetSeed
      3531: dup
      3532: invokespecial #578                // Method ext/mods/gameserver/network/clientpackets/RequestSetSeed."<init>":()V
      3535: astore        5
      3537: goto          3993
      3540: new           #579                // class ext/mods/gameserver/network/clientpackets/RequestSetCrop
      3543: dup
      3544: invokespecial #581                // Method ext/mods/gameserver/network/clientpackets/RequestSetCrop."<init>":()V
      3547: astore        5
      3549: goto          3993
      3552: new           #582                // class ext/mods/gameserver/network/clientpackets/RequestWriteHeroWords
      3555: dup
      3556: invokespecial #584                // Method ext/mods/gameserver/network/clientpackets/RequestWriteHeroWords."<init>":()V
      3559: astore        5
      3561: goto          3993
      3564: new           #585                // class ext/mods/gameserver/network/clientpackets/RequestExAskJoinMPCC
      3567: dup
      3568: invokespecial #587                // Method ext/mods/gameserver/network/clientpackets/RequestExAskJoinMPCC."<init>":()V
      3571: astore        5
      3573: goto          3993
      3576: new           #588                // class ext/mods/gameserver/network/clientpackets/RequestExAcceptJoinMPCC
      3579: dup
      3580: invokespecial #590                // Method ext/mods/gameserver/network/clientpackets/RequestExAcceptJoinMPCC."<init>":()V
      3583: astore        5
      3585: goto          3993
      3588: new           #591                // class ext/mods/gameserver/network/clientpackets/RequestExOustFromMPCC
      3591: dup
      3592: invokespecial #593                // Method ext/mods/gameserver/network/clientpackets/RequestExOustFromMPCC."<init>":()V
      3595: astore        5
      3597: goto          3993
      3600: new           #594                // class ext/mods/gameserver/network/clientpackets/RequestExPledgeCrestLarge
      3603: dup
      3604: invokespecial #596                // Method ext/mods/gameserver/network/clientpackets/RequestExPledgeCrestLarge."<init>":()V
      3607: astore        5
      3609: goto          3993
      3612: new           #597                // class ext/mods/gameserver/network/clientpackets/RequestExSetPledgeCrestLarge
      3615: dup
      3616: invokespecial #599                // Method ext/mods/gameserver/network/clientpackets/RequestExSetPledgeCrestLarge."<init>":()V
      3619: astore        5
      3621: goto          3993
      3624: new           #600                // class ext/mods/gameserver/network/clientpackets/RequestOlympiadObserverEnd
      3627: dup
      3628: invokespecial #602                // Method ext/mods/gameserver/network/clientpackets/RequestOlympiadObserverEnd."<init>":()V
      3631: astore        5
      3633: goto          3993
      3636: new           #603                // class ext/mods/gameserver/network/clientpackets/RequestOlympiadMatchList
      3639: dup
      3640: invokespecial #605                // Method ext/mods/gameserver/network/clientpackets/RequestOlympiadMatchList."<init>":()V
      3643: astore        5
      3645: goto          3993
      3648: new           #606                // class ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom
      3651: dup
      3652: invokespecial #608                // Method ext/mods/gameserver/network/clientpackets/RequestAskJoinPartyRoom."<init>":()V
      3655: astore        5
      3657: goto          3993
      3660: new           #609                // class ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom
      3663: dup
      3664: invokespecial #611                // Method ext/mods/gameserver/network/clientpackets/AnswerJoinPartyRoom."<init>":()V
      3667: astore        5
      3669: goto          3993
      3672: new           #612                // class ext/mods/gameserver/network/clientpackets/RequestListPartyMatchingWaitingRoom
      3675: dup
      3676: invokespecial #614                // Method ext/mods/gameserver/network/clientpackets/RequestListPartyMatchingWaitingRoom."<init>":()V
      3679: astore        5
      3681: goto          3993
      3684: new           #615                // class ext/mods/gameserver/network/clientpackets/RequestExitPartyMatchingWaitingRoom
      3687: dup
      3688: invokespecial #617                // Method ext/mods/gameserver/network/clientpackets/RequestExitPartyMatchingWaitingRoom."<init>":()V
      3691: astore        5
      3693: goto          3993
      3696: new           #618                // class ext/mods/gameserver/network/clientpackets/RequestGetBossRecord
      3699: dup
      3700: invokespecial #620                // Method ext/mods/gameserver/network/clientpackets/RequestGetBossRecord."<init>":()V
      3703: astore        5
      3705: goto          3993
      3708: new           #621                // class ext/mods/gameserver/network/clientpackets/RequestPledgeSetAcademyMaster
      3711: dup
      3712: invokespecial #623                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeSetAcademyMaster."<init>":()V
      3715: astore        5
      3717: goto          3993
      3720: new           #624                // class ext/mods/gameserver/network/clientpackets/RequestPledgePowerGradeList
      3723: dup
      3724: invokespecial #626                // Method ext/mods/gameserver/network/clientpackets/RequestPledgePowerGradeList."<init>":()V
      3727: astore        5
      3729: goto          3993
      3732: new           #627                // class ext/mods/gameserver/network/clientpackets/RequestPledgeMemberPowerInfo
      3735: dup
      3736: invokespecial #629                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeMemberPowerInfo."<init>":()V
      3739: astore        5
      3741: goto          3993
      3744: new           #630                // class ext/mods/gameserver/network/clientpackets/RequestPledgeSetMemberPowerGrade
      3747: dup
      3748: invokespecial #632                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeSetMemberPowerGrade."<init>":()V
      3751: astore        5
      3753: goto          3993
      3756: new           #633                // class ext/mods/gameserver/network/clientpackets/RequestPledgeMemberInfo
      3759: dup
      3760: invokespecial #635                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeMemberInfo."<init>":()V
      3763: astore        5
      3765: goto          3993
      3768: new           #636                // class ext/mods/gameserver/network/clientpackets/RequestPledgeWarList
      3771: dup
      3772: invokespecial #638                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeWarList."<init>":()V
      3775: astore        5
      3777: goto          3993
      3780: new           #639                // class ext/mods/gameserver/network/clientpackets/RequestExFishRanking
      3783: dup
      3784: invokespecial #641                // Method ext/mods/gameserver/network/clientpackets/RequestExFishRanking."<init>":()V
      3787: astore        5
      3789: goto          3993
      3792: new           #642                // class ext/mods/gameserver/network/clientpackets/RequestPCCafeCouponUse
      3795: dup
      3796: invokespecial #644                // Method ext/mods/gameserver/network/clientpackets/RequestPCCafeCouponUse."<init>":()V
      3799: astore        5
      3801: goto          3993
      3804: new           #645                // class ext/mods/gameserver/network/clientpackets/RequestCursedWeaponList
      3807: dup
      3808: invokespecial #647                // Method ext/mods/gameserver/network/clientpackets/RequestCursedWeaponList."<init>":()V
      3811: astore        5
      3813: goto          3993
      3816: new           #648                // class ext/mods/gameserver/network/clientpackets/RequestCursedWeaponLocation
      3819: dup
      3820: invokespecial #650                // Method ext/mods/gameserver/network/clientpackets/RequestCursedWeaponLocation."<init>":()V
      3823: astore        5
      3825: goto          3993
      3828: new           #651                // class ext/mods/gameserver/network/clientpackets/RequestPledgeReorganizeMember
      3831: dup
      3832: invokespecial #653                // Method ext/mods/gameserver/network/clientpackets/RequestPledgeReorganizeMember."<init>":()V
      3835: astore        5
      3837: goto          3993
      3840: new           #654                // class ext/mods/gameserver/network/clientpackets/RequestExMPCCShowPartyMembersInfo
      3843: dup
      3844: invokespecial #656                // Method ext/mods/gameserver/network/clientpackets/RequestExMPCCShowPartyMembersInfo."<init>":()V
      3847: astore        5
      3849: goto          3993
      3852: new           #657                // class ext/mods/gameserver/network/clientpackets/RequestDuelStart
      3855: dup
      3856: invokespecial #659                // Method ext/mods/gameserver/network/clientpackets/RequestDuelStart."<init>":()V
      3859: astore        5
      3861: goto          3993
      3864: new           #660                // class ext/mods/gameserver/network/clientpackets/RequestDuelAnswerStart
      3867: dup
      3868: invokespecial #662                // Method ext/mods/gameserver/network/clientpackets/RequestDuelAnswerStart."<init>":()V
      3871: astore        5
      3873: goto          3993
      3876: new           #663                // class ext/mods/gameserver/network/clientpackets/RequestConfirmTargetItem
      3879: dup
      3880: invokespecial #665                // Method ext/mods/gameserver/network/clientpackets/RequestConfirmTargetItem."<init>":()V
      3883: astore        5
      3885: goto          3993
      3888: new           #666                // class ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem
      3891: dup
      3892: invokespecial #668                // Method ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem."<init>":()V
      3895: astore        5
      3897: goto          3993
      3900: new           #669                // class ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone
      3903: dup
      3904: invokespecial #671                // Method ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone."<init>":()V
      3907: astore        5
      3909: goto          3993
      3912: new           #672                // class ext/mods/gameserver/network/clientpackets/RequestRefine
      3915: dup
      3916: invokespecial #674                // Method ext/mods/gameserver/network/clientpackets/RequestRefine."<init>":()V
      3919: astore        5
      3921: goto          3993
      3924: new           #675                // class ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem
      3927: dup
      3928: invokespecial #677                // Method ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem."<init>":()V
      3931: astore        5
      3933: goto          3993
      3936: new           #678                // class ext/mods/gameserver/network/clientpackets/RequestRefineCancel
      3939: dup
      3940: invokespecial #680                // Method ext/mods/gameserver/network/clientpackets/RequestRefineCancel."<init>":()V
      3943: astore        5
      3945: goto          3993
      3948: new           #681                // class ext/mods/gameserver/network/clientpackets/RequestExMagicSkillUseGround
      3951: dup
      3952: invokespecial #683                // Method ext/mods/gameserver/network/clientpackets/RequestExMagicSkillUseGround."<init>":()V
      3955: astore        5
      3957: goto          3993
      3960: new           #684                // class ext/mods/gameserver/network/clientpackets/RequestDuelSurrender
      3963: dup
      3964: invokespecial #686                // Method ext/mods/gameserver/network/clientpackets/RequestDuelSurrender."<init>":()V
      3967: astore        5
      3969: goto          3993
      3972: iload_3
      3973: iload         6
      3975: aload_1
      3976: aload         4
      3978: aload_2
      3979: invokestatic  #98                 // Method printDebugDoubleOpcode:(IILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
      3982: goto          3993
      3985: iload_3
      3986: aload_1
      3987: aload         4
      3989: aload_2
      3990: invokestatic  #41                 // Method printDebug:(ILjava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient$GameClientState;Lext/mods/gameserver/network/GameClient;)V
      3993: aload         5
      3995: areturn
      LineNumberTable:
        line 46: 0
        line 47: 7
        line 49: 9
        line 50: 18
        line 52: 24
        line 54: 27
        line 57: 68
        line 60: 96
        line 61: 105
        line 63: 108
        line 64: 117
        line 66: 120
        line 67: 128
        line 72: 131
        line 75: 200
        line 76: 209
        line 78: 212
        line 79: 221
        line 81: 224
        line 82: 233
        line 84: 236
        line 85: 245
        line 87: 248
        line 88: 257
        line 90: 260
        line 91: 269
        line 93: 272
        line 94: 281
        line 96: 284
        line 97: 292
        line 102: 295
        line 105: 332
        line 106: 341
        line 109: 344
        line 110: 347
        line 111: 355
        line 114: 367
        line 115: 386
        line 118: 389
        line 121: 408
        line 122: 417
        line 124: 420
        line 125: 430
        line 130: 433
        line 131: 442
        line 134: 445
        line 135: 453
        line 140: 456
        line 143: 1304
        line 144: 1313
        line 146: 1316
        line 147: 1325
        line 149: 1328
        line 150: 1337
        line 152: 1340
        line 153: 1349
        line 155: 1352
        line 156: 1361
        line 158: 1364
        line 159: 1373
        line 161: 1376
        line 162: 1385
        line 164: 1388
        line 165: 1397
        line 167: 1400
        line 168: 1409
        line 170: 1412
        line 171: 1421
        line 173: 1424
        line 174: 1433
        line 176: 1436
        line 177: 1445
        line 179: 1448
        line 180: 1457
        line 182: 1460
        line 183: 1469
        line 185: 1472
        line 186: 1481
        line 188: 1484
        line 189: 1493
        line 191: 1496
        line 192: 1505
        line 194: 1508
        line 195: 1517
        line 197: 1520
        line 198: 1529
        line 200: 1532
        line 201: 1541
        line 203: 1544
        line 204: 1553
        line 206: 1556
        line 207: 1565
        line 209: 1568
        line 210: 1577
        line 212: 1580
        line 213: 1589
        line 215: 1592
        line 216: 1601
        line 218: 1604
        line 219: 1613
        line 221: 1616
        line 222: 1625
        line 224: 1628
        line 225: 1637
        line 227: 1640
        line 228: 1649
        line 230: 1652
        line 232: 1655
        line 233: 1664
        line 235: 1667
        line 236: 1676
        line 238: 1679
        line 239: 1688
        line 241: 1691
        line 242: 1697
        line 245: 1709
        line 246: 1718
        line 248: 1721
        line 249: 1730
        line 251: 1733
        line 252: 1742
        line 254: 1745
        line 255: 1754
        line 257: 1757
        line 258: 1766
        line 260: 1769
        line 261: 1778
        line 263: 1781
        line 264: 1790
        line 266: 1793
        line 267: 1802
        line 269: 1805
        line 270: 1814
        line 272: 1817
        line 273: 1826
        line 275: 1829
        line 276: 1838
        line 278: 1841
        line 279: 1850
        line 281: 1853
        line 282: 1862
        line 284: 1865
        line 285: 1874
        line 287: 1877
        line 288: 1886
        line 290: 1889
        line 291: 1898
        line 293: 1901
        line 294: 1910
        line 296: 1913
        line 297: 1922
        line 299: 1925
        line 300: 1934
        line 302: 1937
        line 303: 1946
        line 305: 1949
        line 306: 1958
        line 308: 1961
        line 309: 1970
        line 311: 1973
        line 312: 1982
        line 314: 1985
        line 315: 1994
        line 317: 1997
        line 318: 2006
        line 320: 2009
        line 321: 2018
        line 323: 2021
        line 324: 2030
        line 326: 2033
        line 327: 2042
        line 329: 2045
        line 330: 2054
        line 332: 2057
        line 333: 2066
        line 335: 2069
        line 336: 2078
        line 338: 2081
        line 339: 2090
        line 341: 2093
        line 342: 2102
        line 344: 2105
        line 345: 2114
        line 347: 2117
        line 348: 2126
        line 350: 2129
        line 351: 2138
        line 353: 2141
        line 354: 2150
        line 356: 2153
        line 357: 2162
        line 359: 2165
        line 360: 2174
        line 362: 2177
        line 363: 2186
        line 365: 2189
        line 366: 2198
        line 368: 2201
        line 369: 2210
        line 371: 2213
        line 372: 2222
        line 374: 2225
        line 375: 2234
        line 377: 2237
        line 378: 2246
        line 380: 2249
        line 381: 2258
        line 383: 2261
        line 384: 2270
        line 386: 2273
        line 387: 2282
        line 389: 2285
        line 390: 2294
        line 392: 2297
        line 393: 2306
        line 395: 2309
        line 396: 2318
        line 398: 2321
        line 399: 2330
        line 401: 2333
        line 402: 2342
        line 404: 2345
        line 405: 2354
        line 407: 2357
        line 408: 2366
        line 410: 2369
        line 411: 2378
        line 413: 2381
        line 414: 2390
        line 416: 2393
        line 417: 2402
        line 419: 2405
        line 420: 2414
        line 422: 2417
        line 423: 2426
        line 425: 2429
        line 426: 2438
        line 428: 2441
        line 429: 2450
        line 431: 2453
        line 432: 2462
        line 434: 2465
        line 435: 2474
        line 437: 2477
        line 438: 2486
        line 440: 2489
        line 441: 2498
        line 443: 2501
        line 444: 2510
        line 446: 2513
        line 447: 2522
        line 449: 2525
        line 450: 2534
        line 452: 2537
        line 453: 2546
        line 455: 2549
        line 456: 2558
        line 458: 2561
        line 459: 2570
        line 461: 2573
        line 462: 2582
        line 464: 2585
        line 465: 2594
        line 467: 2597
        line 468: 2606
        line 470: 2609
        line 471: 2618
        line 473: 2621
        line 474: 2630
        line 476: 2633
        line 477: 2642
        line 479: 2645
        line 480: 2654
        line 482: 2657
        line 483: 2666
        line 485: 2669
        line 487: 2672
        line 488: 2681
        line 490: 2684
        line 491: 2693
        line 493: 2696
        line 494: 2705
        line 496: 2708
        line 497: 2717
        line 499: 2720
        line 500: 2729
        line 502: 2732
        line 503: 2741
        line 505: 2744
        line 506: 2753
        line 508: 2756
        line 509: 2765
        line 511: 2768
        line 512: 2777
        line 514: 2780
        line 515: 2789
        line 517: 2792
        line 518: 2801
        line 520: 2804
        line 521: 2813
        line 523: 2816
        line 524: 2825
        line 526: 2828
        line 527: 2837
        line 529: 2840
        line 530: 2849
        line 532: 2852
        line 533: 2861
        line 535: 2864
        line 536: 2873
        line 538: 2876
        line 539: 2885
        line 541: 2888
        line 542: 2897
        line 544: 2900
        line 545: 2909
        line 547: 2912
        line 548: 2921
        line 550: 2924
        line 551: 2933
        line 553: 2936
        line 554: 2945
        line 556: 2948
        line 557: 2957
        line 559: 2960
        line 560: 2969
        line 562: 2972
        line 563: 2981
        line 565: 2984
        line 566: 2993
        line 568: 2996
        line 569: 3005
        line 571: 3008
        line 572: 3017
        line 574: 3020
        line 575: 3029
        line 577: 3032
        line 578: 3041
        line 580: 3044
        line 581: 3053
        line 583: 3056
        line 584: 3065
        line 586: 3068
        line 587: 3077
        line 589: 3080
        line 590: 3089
        line 592: 3092
        line 593: 3101
        line 595: 3104
        line 596: 3113
        line 598: 3116
        line 599: 3125
        line 601: 3128
        line 602: 3137
        line 604: 3140
        line 605: 3149
        line 607: 3152
        line 609: 3155
        line 610: 3164
        line 613: 3167
        line 614: 3170
        line 615: 3178
        line 618: 3190
        line 619: 3209
        line 622: 3212
        line 625: 3420
        line 626: 3429
        line 628: 3432
        line 629: 3441
        line 631: 3444
        line 632: 3453
        line 634: 3456
        line 635: 3465
        line 637: 3468
        line 638: 3477
        line 640: 3480
        line 641: 3489
        line 643: 3492
        line 644: 3501
        line 646: 3504
        line 647: 3513
        line 649: 3516
        line 650: 3525
        line 652: 3528
        line 653: 3537
        line 655: 3540
        line 656: 3549
        line 658: 3552
        line 659: 3561
        line 661: 3564
        line 662: 3573
        line 664: 3576
        line 665: 3585
        line 667: 3588
        line 668: 3597
        line 670: 3600
        line 671: 3609
        line 673: 3612
        line 674: 3621
        line 676: 3624
        line 677: 3633
        line 679: 3636
        line 680: 3645
        line 682: 3648
        line 683: 3657
        line 685: 3660
        line 686: 3669
        line 688: 3672
        line 689: 3681
        line 691: 3684
        line 692: 3693
        line 694: 3696
        line 695: 3705
        line 697: 3708
        line 698: 3717
        line 700: 3720
        line 701: 3729
        line 703: 3732
        line 704: 3741
        line 706: 3744
        line 707: 3753
        line 709: 3756
        line 710: 3765
        line 712: 3768
        line 713: 3777
        line 715: 3780
        line 716: 3789
        line 718: 3792
        line 719: 3801
        line 721: 3804
        line 722: 3813
        line 724: 3816
        line 725: 3825
        line 727: 3828
        line 728: 3837
        line 730: 3840
        line 731: 3849
        line 733: 3852
        line 734: 3861
        line 736: 3864
        line 737: 3873
        line 739: 3876
        line 740: 3885
        line 742: 3888
        line 743: 3897
        line 745: 3900
        line 746: 3909
        line 748: 3912
        line 749: 3921
        line 751: 3924
        line 752: 3933
        line 754: 3936
        line 755: 3945
        line 757: 3948
        line 758: 3957
        line 760: 3960
        line 761: 3969
        line 763: 3972
        line 764: 3982
        line 768: 3985
        line 773: 3993
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          347      86     6   id2   I
         3170     815     6   id2   I
            0    3996     0  this   Lext/mods/gameserver/network/GamePacketHandler;
            0    3996     1   buf   Ljava/nio/ByteBuffer;
            0    3996     2 client   Lext/mods/gameserver/network/GameClient;
           18    3978     3 opcode   I
           24    3972     4 state   Lext/mods/gameserver/network/GameClient$GameClientState;
           27    3969     5   msg   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           27    3969     5   msg   Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
      StackMapTable: number_of_entries = 233
        frame_type = 9 /* same */
        frame_type = 254 /* append */
          offset_delta = 58
          locals = [ int, class ext/mods/gameserver/network/GameClient$GameClientState, class ext/mods/commons/mmocore/ReceivablePacket ]
        frame_type = 27 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 10 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 10 /* same */
        frame_type = 36 /* same */
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 21 /* same */
        frame_type = 18 /* same */
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 11 /* same */
        frame_type = 10 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 847
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 2 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 2 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 2 /* same */
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 21 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 207
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 7 /* same */
    Signature: #773                         // (Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;

  public ext.mods.gameserver.network.GameClient create(ext.mods.commons.mmocore.MMOConnection<ext.mods.gameserver.network.GameClient>);
    descriptor: (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/gameserver/network/GameClient;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: new           #8                  // class ext/mods/gameserver/network/GameClient
         3: dup
         4: aload_1
         5: invokespecial #687                // Method ext/mods/gameserver/network/GameClient."<init>":(Lext/mods/commons/mmocore/MMOConnection;)V
         8: areturn
      LineNumberTable:
        line 779: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/GamePacketHandler;
            0       9     1   con   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     1   con   Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;
    Signature: #777                         // (Lext/mods/commons/mmocore/MMOConnection<Lext/mods/gameserver/network/GameClient;>;)Lext/mods/gameserver/network/GameClient;

  public void execute(ext.mods.commons.mmocore.ReceivablePacket<ext.mods.gameserver.network.GameClient>);
    descriptor: (Lext/mods/commons/mmocore/ReceivablePacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #690                // Method ext/mods/commons/mmocore/ReceivablePacket.getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #8                  // class ext/mods/gameserver/network/GameClient
         7: aload_1
         8: invokevirtual #696                // Method ext/mods/gameserver/network/GameClient.execute:(Lext/mods/commons/mmocore/ReceivablePacket;)V
        11: return
      LineNumberTable:
        line 785: 0
        line 786: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/network/GamePacketHandler;
            0      12     1    rp   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     1    rp   Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;
    Signature: #779                         // (Lext/mods/commons/mmocore/ReceivablePacket<Lext/mods/gameserver/network/GameClient;>;)V

  public ext.mods.commons.mmocore.ReceivablePacket handlePacket(java.nio.ByteBuffer, ext.mods.commons.mmocore.MMOClient);
    descriptor: (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: checkcast     #8                  // class ext/mods/gameserver/network/GameClient
         6: invokevirtual #731                // Method handlePacket:(Ljava/nio/ByteBuffer;Lext/mods/gameserver/network/GameClient;)Lext/mods/commons/mmocore/ReceivablePacket;
         9: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/network/GamePacketHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
      <no name>                      synthetic

  public ext.mods.commons.mmocore.MMOClient create(ext.mods.commons.mmocore.MMOConnection);
    descriptor: (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #735                // Method create:(Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/gameserver/network/GameClient;
         5: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/network/GamePacketHandler;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #90                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #42                 // class ext/mods/gameserver/network/GamePacketHandler
         6: invokevirtual #739                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #744                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #79                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 41: 0
}
Signature: #787                         // Ljava/lang/Object;Lext/mods/commons/mmocore/IPacketHandler<Lext/mods/gameserver/network/GameClient;>;Lext/mods/commons/mmocore/IClientFactory<Lext/mods/gameserver/network/GameClient;>;Lext/mods/commons/mmocore/IMMOExecutor<Lext/mods/gameserver/network/GameClient;>;
SourceFile: "GamePacketHandler.java"
NestMembers:
  ext/mods/gameserver/network/GamePacketHandler$1
InnerClasses:
  public static final #792= #30 of #8;    // GameClientState=class ext/mods/gameserver/network/GameClient$GameClientState of class ext/mods/gameserver/network/GameClient
  static #24;                             // class ext/mods/gameserver/network/GamePacketHandler$1
