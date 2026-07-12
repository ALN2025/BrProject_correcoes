// Bytecode for: ext.mods.gameserver.model.olympiad.OlympiadGameNormal
// File: ext\mods\gameserver\model\olympiad\OlympiadGameNormal.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/olympiad/OlympiadGameNormal.class
  Last modified 9 de jul de 2026; size 14267 bytes
  MD5 checksum 1065327b68b00989d17991ea0e25650d
  Compiled from "OlympiadGameNormal.java"
public abstract class ext.mods.gameserver.model.olympiad.OlympiadGameNormal extends ext.mods.gameserver.model.olympiad.AbstractOlympiadGame
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
  super_class: #2                         // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
  interfaces: 0, fields: 5, methods: 27, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame."<init>":(I)V
    #2 = Class              #4            // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
    #3 = NameAndType        #5:#6         // "<init>":(I)V
    #4 = Utf8               ext/mods/gameserver/model/olympiad/AbstractOlympiadGame
    #5 = Utf8               <init>
    #6 = Utf8               (I)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._damageP1:I
    #8 = Class              #10           // ext/mods/gameserver/model/olympiad/OlympiadGameNormal
    #9 = NameAndType        #11:#12       // _damageP1:I
   #10 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameNormal
   #11 = Utf8               _damageP1
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._damageP2:I
   #14 = NameAndType        #15:#12       // _damageP2:I
   #15 = Utf8               _damageP2
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._playerOne:Lext/mods/gameserver/model/olympiad/Participant;
   #17 = NameAndType        #18:#19       // _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
   #18 = Utf8               _playerOne
   #19 = Utf8               Lext/mods/gameserver/model/olympiad/Participant;
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
   #21 = NameAndType        #22:#19       // _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
   #22 = Utf8               _playerTwo
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = Class              #26           // ext/mods/gameserver/model/olympiad/Participant
   #25 = NameAndType        #27:#28       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #26 = Utf8               ext/mods/gameserver/model/olympiad/Participant
   #27 = Utf8               getPlayer
   #28 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/actor/Player.setOlympiadGameId:(I)V
   #30 = Class              #32           // ext/mods/gameserver/model/actor/Player
   #31 = NameAndType        #33:#6        // setOlympiadGameId:(I)V
   #32 = Utf8               ext/mods/gameserver/model/actor/Player
   #33 = Utf8               setOlympiadGameId
   #34 = InterfaceMethodref #35.#36       // java/util/List.isEmpty:()Z
   #35 = Class              #37           // java/util/List
   #36 = NameAndType        #38:#39       // isEmpty:()Z
   #37 = Utf8               java/util/List
   #38 = Utf8               isEmpty
   #39 = Utf8               ()Z
   #40 = InterfaceMethodref #35.#41       // java/util/List.size:()I
   #41 = NameAndType        #42:#43       // size:()I
   #42 = Utf8               size
   #43 = Utf8               ()I
   #44 = Methodref          #45.#46       // java/lang/Math.max:(II)I
   #45 = Class              #47           // java/lang/Math
   #46 = NameAndType        #48:#49       // max:(II)I
   #47 = Utf8               java/lang/Math
   #48 = Utf8               max
   #49 = Utf8               (II)I
   #50 = Methodref          #51.#52       // ext/mods/commons/random/Rnd.get:(I)I
   #51 = Class              #53           // ext/mods/commons/random/Rnd
   #52 = NameAndType        #54:#55       // get:(I)I
   #53 = Utf8               ext/mods/commons/random/Rnd
   #54 = Utf8               get
   #55 = Utf8               (I)I
   #56 = InterfaceMethodref #35.#57       // java/util/List.remove:(I)Ljava/lang/Object;
   #57 = NameAndType        #58:#59       // remove:(I)Ljava/lang/Object;
   #58 = Utf8               remove
   #59 = Utf8               (I)Ljava/lang/Object;
   #60 = Class              #61           // java/lang/Integer
   #61 = Utf8               java/lang/Integer
   #62 = Methodref          #60.#63       // java/lang/Integer.intValue:()I
   #63 = NameAndType        #64:#43       // intValue:()I
   #64 = Utf8               intValue
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #66 = Class              #68           // ext/mods/gameserver/model/World
   #67 = NameAndType        #69:#70       // getInstance:()Lext/mods/gameserver/model/World;
   #68 = Utf8               ext/mods/gameserver/model/World
   #69 = Utf8               getInstance
   #70 = Utf8               ()Lext/mods/gameserver/model/World;
   #71 = Methodref          #66.#72       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #72 = NameAndType        #27:#73       // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #73 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #74 = Methodref          #30.#75       // ext/mods/gameserver/model/actor/Player.isOnline:()Z
   #75 = NameAndType        #76:#39       // isOnline:()Z
   #76 = Utf8               isOnline
   #77 = Methodref          #60.#78       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #78 = NameAndType        #79:#80       // valueOf:(I)Ljava/lang/Integer;
   #79 = Utf8               valueOf
   #80 = Utf8               (I)Ljava/lang/Integer;
   #81 = InterfaceMethodref #35.#82       // java/util/List.add:(Ljava/lang/Object;)Z
   #82 = NameAndType        #83:#84       // add:(Ljava/lang/Object;)Z
   #83 = Utf8               add
   #84 = Utf8               (Ljava/lang/Object;)Z
   #85 = Fieldref           #86.#87       // ext/mods/Config.OLY_BLOCK_SAME_HWID:Z
   #86 = Class              #88           // ext/mods/Config
   #87 = NameAndType        #89:#90       // OLY_BLOCK_SAME_HWID:Z
   #88 = Utf8               ext/mods/Config
   #89 = Utf8               OLY_BLOCK_SAME_HWID
   #90 = Utf8               Z
   #91 = Methodref          #92.#93       // ext/mods/protection/hwid/hwidManager.hasSameHwid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #92 = Class              #94           // ext/mods/protection/hwid/hwidManager
   #93 = NameAndType        #95:#96       // hasSameHwid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #94 = Utf8               ext/mods/protection/hwid/hwidManager
   #95 = Utf8               hasSameHwid
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #97 = Methodref          #24.#98       // ext/mods/gameserver/model/olympiad/Participant."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #98 = NameAndType        #5:#99        // "<init>":(Lext/mods/gameserver/model/actor/Player;I)V
   #99 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #100 = Methodref          #24.#101      // ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
  #101 = NameAndType        #102:#43      // getObjectId:()I
  #102 = Utf8               getObjectId
  #103 = Class              #104          // ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
  #104 = Utf8               ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
  #105 = Methodref          #103.#106     // ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #106 = NameAndType        #5:#107       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #108 = Methodref          #109.#110     // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Class              #111          // ext/mods/gameserver/model/actor/Creature
  #110 = NameAndType        #112:#113     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               ext/mods/gameserver/model/actor/Creature
  #112 = Utf8               sendPacket
  #113 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = Methodref          #30.#115      // ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
  #115 = NameAndType        #116:#117     // updateEffectIcons:()V
  #116 = Utf8               updateEffectIcons
  #117 = Utf8               ()V
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #119 = Class              #121          // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  #120 = NameAndType        #122:#113     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #121 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
  #122 = Utf8               broadcastPacket
  #123 = Methodref          #24.#124      // ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
  #124 = NameAndType        #125:#117     // updatePlayer:()V
  #125 = Utf8               updatePlayer
  #126 = Methodref          #30.#110      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #127 = InterfaceMethodref #35.#128      // java/util/List.get:(I)Ljava/lang/Object;
  #128 = NameAndType        #54:#59       // get:(I)Ljava/lang/Object;
  #129 = Class              #130          // ext/mods/gameserver/model/location/Location
  #130 = Utf8               ext/mods/gameserver/model/location/Location
  #131 = Fieldref           #8.#132       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._stadiumId:I
  #132 = NameAndType        #133:#12      // _stadiumId:I
  #133 = Utf8               _stadiumId
  #134 = Methodref          #8.#135       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.portPlayerToArena:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
  #135 = NameAndType        #136:#137     // portPlayerToArena:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
  #136 = Utf8               portPlayerToArena
  #137 = Utf8               (Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
  #138 = Fieldref           #8.#139       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._aborted:Z
  #139 = NameAndType        #140:#90      // _aborted:Z
  #140 = Utf8               _aborted
  #141 = Methodref          #8.#142       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.removals:(Lext/mods/gameserver/model/actor/Player;Z)V
  #142 = NameAndType        #143:#144     // removals:(Lext/mods/gameserver/model/actor/Player;Z)V
  #143 = Utf8               removals
  #144 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #145 = Methodref          #8.#146       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.buffPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #146 = NameAndType        #147:#107     // buffPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #147 = Utf8               buffPlayer
  #148 = Methodref          #30.#149      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #149 = NameAndType        #150:#151     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #150 = Utf8               getStatus
  #151 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #152 = Methodref          #153.#154     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
  #153 = Class              #155          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #154 = NameAndType        #156:#117     // setMaxCpHpMp:()V
  #155 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #156 = Utf8               setMaxCpHpMp
  #157 = Methodref          #2.#158       // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.makeCompetitionStart:()Z
  #158 = NameAndType        #159:#39      // makeCompetitionStart:()Z
  #159 = Utf8               makeCompetitionStart
  #160 = Methodref          #30.#161      // ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
  #161 = NameAndType        #162:#163     // setOlympiadStart:(Z)V
  #162 = Utf8               setOlympiadStart
  #163 = Utf8               (Z)V
  #164 = Methodref          #165.#166     // ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #165 = Class              #167          // ext/mods/gameserver/custom/data/OlympiadEnchantData
  #166 = NameAndType        #69:#168      // getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #167 = Utf8               ext/mods/gameserver/custom/data/OlympiadEnchantData
  #168 = Utf8               ()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
  #169 = Methodref          #165.#170     // ext/mods/gameserver/custom/data/OlympiadEnchantData.applyOlympiadEnchant:(Lext/mods/gameserver/model/actor/Player;)V
  #170 = NameAndType        #171:#107     // applyOlympiadEnchant:(Lext/mods/gameserver/model/actor/Player;)V
  #171 = Utf8               applyOlympiadEnchant
  #172 = Methodref          #24.#173      // ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
  #173 = NameAndType        #174:#39      // isDefecting:()Z
  #174 = Utf8               isDefecting
  #175 = Methodref          #24.#176      // ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
  #176 = NameAndType        #177:#39      // isDisconnected:()Z
  #177 = Utf8               isDisconnected
  #178 = Methodref          #30.#179      // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #179 = NameAndType        #180:#43      // getOlympiadGameId:()I
  #180 = Utf8               getOlympiadGameId
  #181 = Methodref          #8.#182       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.cleanEffects:(Lext/mods/gameserver/model/actor/Player;)V
  #182 = NameAndType        #183:#107     // cleanEffects:(Lext/mods/gameserver/model/actor/Player;)V
  #183 = Utf8               cleanEffects
  #184 = Methodref          #2.#185       // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.portPlayerToGiranPersistent:(Lext/mods/gameserver/model/actor/Player;)V
  #185 = NameAndType        #186:#107     // portPlayerToGiranPersistent:(Lext/mods/gameserver/model/actor/Player;)V
  #186 = Utf8               portPlayerToGiranPersistent
  #187 = Methodref          #8.#188       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.portPlayerBack:(Lext/mods/gameserver/model/actor/Player;)V
  #188 = NameAndType        #189:#107     // portPlayerBack:(Lext/mods/gameserver/model/actor/Player;)V
  #189 = Utf8               portPlayerBack
  #190 = Methodref          #8.#191       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.playerStatusBack:(Lext/mods/gameserver/model/actor/Player;)V
  #191 = NameAndType        #192:#107     // playerStatusBack:(Lext/mods/gameserver/model/actor/Player;)V
  #192 = Utf8               playerStatusBack
  #193 = Methodref          #165.#194     // ext/mods/gameserver/custom/data/OlympiadEnchantData.restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
  #194 = NameAndType        #195:#107     // restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
  #195 = Utf8               restoreEnchant
  #196 = Methodref          #24.#197      // ext/mods/gameserver/model/olympiad/Participant.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #197 = NameAndType        #198:#107     // setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
  #198 = Utf8               setPlayer
  #199 = Methodref          #30.#101      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #200 = Methodref          #24.#201      // ext/mods/gameserver/model/olympiad/Participant.setDisconnection:(Z)V
  #201 = NameAndType        #202:#163     // setDisconnection:(Z)V
  #202 = Utf8               setDisconnection
  #203 = Methodref          #2.#204       // ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.setSavedLocationToGiran:(Lext/mods/gameserver/model/actor/Player;)V
  #204 = NameAndType        #205:#107     // setSavedLocationToGiran:(Lext/mods/gameserver/model/actor/Player;)V
  #205 = Utf8               setSavedLocationToGiran
  #206 = Methodref          #8.#207       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.checkBattleStatus:()Z
  #207 = NameAndType        #208:#39      // checkBattleStatus:()Z
  #208 = Utf8               checkBattleStatus
  #209 = Methodref          #30.#210      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #210 = NameAndType        #211:#39      // isDead:()Z
  #211 = Utf8               isDead
  #212 = Class              #213          // java/lang/Exception
  #213 = Utf8               java/lang/Exception
  #214 = Methodref          #24.#215      // ext/mods/gameserver/model/olympiad/Participant.getStatSet:()Lext/mods/commons/data/StatSet;
  #215 = NameAndType        #216:#217     // getStatSet:()Lext/mods/commons/data/StatSet;
  #216 = Utf8               getStatSet
  #217 = Utf8               ()Lext/mods/commons/data/StatSet;
  #218 = String             #219          // olympiad_points
  #219 = Utf8               olympiad_points
  #220 = Methodref          #221.#222     // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #221 = Class              #223          // ext/mods/commons/data/StatSet
  #222 = NameAndType        #224:#225     // getInteger:(Ljava/lang/String;)I
  #223 = Utf8               ext/mods/commons/data/StatSet
  #224 = Utf8               getInteger
  #225 = Utf8               (Ljava/lang/String;)I
  #226 = Fieldref           #86.#227      // ext/mods/Config.OLY_MAX_POINTS:I
  #227 = NameAndType        #228:#12      // OLY_MAX_POINTS:I
  #228 = Utf8               OLY_MAX_POINTS
  #229 = Methodref          #45.#230      // java/lang/Math.min:(II)I
  #230 = NameAndType        #231:#49      // min:(II)I
  #231 = Utf8               min
  #232 = Methodref          #8.#233       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
  #233 = NameAndType        #234:#235     // removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
  #234 = Utf8               removePointsFromParticipant
  #235 = Utf8               (Lext/mods/gameserver/model/olympiad/Participant;I)V
  #236 = Methodref          #237.#238     // java/lang/System.currentTimeMillis:()J
  #237 = Class              #239          // java/lang/System
  #238 = NameAndType        #240:#241     // currentTimeMillis:()J
  #239 = Utf8               java/lang/System
  #240 = Utf8               currentTimeMillis
  #241 = Utf8               ()J
  #242 = Fieldref           #8.#243       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal._startTime:J
  #243 = NameAndType        #244:#245     // _startTime:J
  #244 = Utf8               _startTime
  #245 = Utf8               J
  #246 = Methodref          #8.#247       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.getDivider:()I
  #247 = NameAndType        #248:#43      // getDivider:()I
  #248 = Utf8               getDivider
  #249 = Methodref          #45.#250      // java/lang/Math.clamp:(JII)I
  #250 = NameAndType        #251:#252     // clamp:(JII)I
  #251 = Utf8               clamp
  #252 = Utf8               (JII)I
  #253 = Fieldref           #254.#255     // ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #254 = Class              #256          // ext/mods/gameserver/network/SystemMessageId
  #255 = NameAndType        #257:#258     // S1_HAS_WON_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
  #256 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #257 = Utf8               S1_HAS_WON_THE_GAME
  #258 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #259 = Methodref          #260.#261     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #260 = Class              #262          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #261 = NameAndType        #263:#264     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #262 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #263 = Utf8               getSystemMessage
  #264 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #265 = Methodref          #24.#266      // ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
  #266 = NameAndType        #267:#268     // getName:()Ljava/lang/String;
  #267 = Utf8               getName
  #268 = Utf8               ()Ljava/lang/String;
  #269 = Methodref          #260.#270     // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #270 = NameAndType        #271:#272     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #271 = Utf8               addString
  #272 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #273 = String             #274          // competitions_won
  #274 = Utf8               competitions_won
  #275 = Methodref          #24.#276      // ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
  #276 = NameAndType        #277:#278     // updateStat:(Ljava/lang/String;I)V
  #277 = Utf8               updateStat
  #278 = Utf8               (Ljava/lang/String;I)V
  #279 = Methodref          #8.#280       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.addPointsToParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
  #280 = NameAndType        #281:#235     // addPointsToParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
  #281 = Utf8               addPointsToParticipant
  #282 = String             #283          // competitions_lost
  #283 = Utf8               competitions_lost
  #284 = Methodref          #8.#285       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.getReward:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #285 = NameAndType        #286:#287     // getReward:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #286 = Utf8               getReward
  #287 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #288 = Methodref          #8.#289       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.rewardParticipant:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #289 = NameAndType        #290:#291     // rewardParticipant:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #290 = Utf8               rewardParticipant
  #291 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
  #292 = Fieldref           #254.#293     // ext/mods/gameserver/network/SystemMessageId.THE_GAME_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
  #293 = NameAndType        #294:#258     // THE_GAME_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
  #294 = Utf8               THE_GAME_ENDED_IN_A_TIE
  #295 = String             #296          // competitions_drawn
  #296 = Utf8               competitions_drawn
  #297 = Methodref          #153.#298     // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #298 = NameAndType        #299:#300     // getHp:()D
  #299 = Utf8               getHp
  #300 = Utf8               ()D
  #301 = Methodref          #153.#302     // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
  #302 = NameAndType        #303:#300     // getCp:()D
  #303 = Utf8               getCp
  #304 = Double             0.5d
  #306 = Methodref          #8.#307       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.getType:()Lext/mods/gameserver/enums/OlympiadType;
  #307 = NameAndType        #308:#309     // getType:()Lext/mods/gameserver/enums/OlympiadType;
  #308 = Utf8               getType
  #309 = Utf8               ()Lext/mods/gameserver/enums/OlympiadType;
  #310 = Methodref          #8.#311       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.saveResults:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
  #311 = NameAndType        #312:#313     // saveResults:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
  #312 = Utf8               saveResults
  #313 = Utf8               (Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
  #314 = String             #315          // competitions_done
  #315 = Utf8               competitions_done
  #316 = Class              #317          // java/lang/String
  #317 = Utf8               java/lang/String
  #318 = Methodref          #8.#319       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.checkDefection:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #319 = NameAndType        #320:#321     // checkDefection:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #320 = Utf8               checkDefection
  #321 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #322 = Methodref          #24.#323      // ext/mods/gameserver/model/olympiad/Participant.setDefection:(Z)V
  #323 = NameAndType        #324:#163     // setDefection:(Z)V
  #324 = Utf8               setDefection
  #325 = Methodref          #326.#327     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #326 = Class              #328          // ext/mods/commons/pool/ConnectionPool
  #327 = NameAndType        #329:#330     // getConnection:()Ljava/sql/Connection;
  #328 = Utf8               ext/mods/commons/pool/ConnectionPool
  #329 = Utf8               getConnection
  #330 = Utf8               ()Ljava/sql/Connection;
  #331 = String             #332          // INSERT INTO olympiad_fights (charOneId, charTwoId, charOneClass, charTwoClass, winner, start, time, classed) values(?,?,?,?,?,?,?,?)
  #332 = Utf8               INSERT INTO olympiad_fights (charOneId, charTwoId, charOneClass, charTwoClass, winner, start, time, classed) values(?,?,?,?,?,?,?,?)
  #333 = InterfaceMethodref #334.#335     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #334 = Class              #336          // java/sql/Connection
  #335 = NameAndType        #337:#338     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #336 = Utf8               java/sql/Connection
  #337 = Utf8               prepareStatement
  #338 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #339 = InterfaceMethodref #340.#341     // java/sql/PreparedStatement.setInt:(II)V
  #340 = Class              #342          // java/sql/PreparedStatement
  #341 = NameAndType        #343:#344     // setInt:(II)V
  #342 = Utf8               java/sql/PreparedStatement
  #343 = Utf8               setInt
  #344 = Utf8               (II)V
  #345 = Methodref          #24.#346      // ext/mods/gameserver/model/olympiad/Participant.getBaseClass:()I
  #346 = NameAndType        #347:#43      // getBaseClass:()I
  #347 = Utf8               getBaseClass
  #348 = InterfaceMethodref #340.#349     // java/sql/PreparedStatement.setLong:(IJ)V
  #349 = NameAndType        #350:#351     // setLong:(IJ)V
  #350 = Utf8               setLong
  #351 = Utf8               (IJ)V
  #352 = Fieldref           #353.#354     // ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #353 = Class              #355          // ext/mods/gameserver/enums/OlympiadType
  #354 = NameAndType        #356:#357     // CLASSED:Lext/mods/gameserver/enums/OlympiadType;
  #355 = Utf8               ext/mods/gameserver/enums/OlympiadType
  #356 = Utf8               CLASSED
  #357 = Utf8               Lext/mods/gameserver/enums/OlympiadType;
  #358 = InterfaceMethodref #340.#359     // java/sql/PreparedStatement.execute:()Z
  #359 = NameAndType        #360:#39      // execute:()Z
  #360 = Utf8               execute
  #361 = InterfaceMethodref #340.#362     // java/sql/PreparedStatement.close:()V
  #362 = NameAndType        #363:#117     // close:()V
  #363 = Utf8               close
  #364 = Class              #365          // java/lang/Throwable
  #365 = Utf8               java/lang/Throwable
  #366 = Methodref          #364.#367     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #367 = NameAndType        #368:#369     // addSuppressed:(Ljava/lang/Throwable;)V
  #368 = Utf8               addSuppressed
  #369 = Utf8               (Ljava/lang/Throwable;)V
  #370 = InterfaceMethodref #334.#362     // java/sql/Connection.close:()V
  #371 = Fieldref           #8.#372       // ext/mods/gameserver/model/olympiad/OlympiadGameNormal.LOGGER:Lext/mods/commons/logging/CLogger;
  #372 = NameAndType        #373:#374     // LOGGER:Lext/mods/commons/logging/CLogger;
  #373 = Utf8               LOGGER
  #374 = Utf8               Lext/mods/commons/logging/CLogger;
  #375 = String             #376          // Couldn\'t save Olympiad results.
  #376 = Utf8               Couldn\'t save Olympiad results.
  #377 = Methodref          #378.#379     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #378 = Class              #380          // ext/mods/commons/logging/CLogger
  #379 = NameAndType        #381:#382     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #380 = Utf8               ext/mods/commons/logging/CLogger
  #381 = Utf8               error
  #382 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #383 = Utf8               INSERT_RESULT
  #384 = Utf8               Ljava/lang/String;
  #385 = Utf8               ConstantValue
  #386 = Utf8               (I[Lext/mods/gameserver/model/olympiad/Participant;)V
  #387 = Utf8               Code
  #388 = Utf8               LineNumberTable
  #389 = Utf8               LocalVariableTable
  #390 = Utf8               this
  #391 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
  #392 = Utf8               id
  #393 = Utf8               opponents
  #394 = Utf8               [Lext/mods/gameserver/model/olympiad/Participant;
  #395 = Utf8               createListOfParticipants
  #396 = Utf8               (Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
  #397 = Utf8               playerTwoObjectId
  #398 = Utf8               result
  #399 = Utf8               list
  #400 = Utf8               Ljava/util/List;
  #401 = Utf8               playerOneObjectId
  #402 = Utf8               playerOne
  #403 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #404 = Utf8               playerTwo
  #405 = Utf8               maxAttempts
  #406 = Utf8               attempts
  #407 = Utf8               LocalVariableTypeTable
  #408 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #409 = Utf8               StackMapTable
  #410 = Utf8               Signature
  #411 = Utf8               (Ljava/util/List<Ljava/lang/Integer;>;)[Lext/mods/gameserver/model/olympiad/Participant;
  #412 = Utf8               containsParticipant
  #413 = Utf8               (I)Z
  #414 = Utf8               objectId
  #415 = Utf8               sendOlympiadInfo
  #416 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #417 = Utf8               player
  #418 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #419 = Utf8               broadcastOlympiadInfo
  #420 = Utf8               (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
  #421 = Utf8               stadium
  #422 = Utf8               Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
  #423 = Utf8               packet
  #424 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #425 = Utf8               portPlayersToArena
  #426 = Utf8               (Ljava/util/List;)Z
  #427 = Utf8               spawns
  #428 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #429 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z
  #430 = Utf8               buffPlayers
  #431 = Utf8               healPlayers
  #432 = Utf8               portPlayersBack
  #433 = Utf8               safeDisconnectUsed
  #434 = Utf8               playersStatusBack
  #435 = Utf8               clearPlayers
  #436 = Utf8               handleDisconnect
  #437 = Utf8               clearDisconnections
  #438 = Utf8               setParticipantsSavedLocationToGiran
  #439 = Utf8               areParticipantsOnline
  #440 = Utf8               p1
  #441 = Utf8               p2
  #442 = Utf8               haveWinner
  #443 = Utf8               e
  #444 = Utf8               Ljava/lang/Exception;
  #445 = Utf8               playerOneLost
  #446 = Utf8               playerTwoLost
  #447 = Utf8               validateWinner
  #448 = Utf8               playerOnePoints
  #449 = Utf8               playerTwoPoints
  #450 = Utf8               pOneCrash
  #451 = Utf8               pTwoCrash
  #452 = Utf8               fightTime
  #453 = Utf8               pointDiff
  #454 = Utf8               playerOneHp
  #455 = Utf8               D
  #456 = Utf8               playerTwoHp
  #457 = Utf8               addDamage
  #458 = Utf8               damage
  #459 = Utf8               getPlayerNames
  #460 = Utf8               ()[Ljava/lang/String;
  #461 = Utf8               sm
  #462 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #463 = Utf8               resetDamage
  #464 = Utf8               ps
  #465 = Utf8               Ljava/sql/PreparedStatement;
  #466 = Utf8               con
  #467 = Utf8               Ljava/sql/Connection;
  #468 = Utf8               one
  #469 = Utf8               two
  #470 = Utf8               winner
  #471 = Utf8               startTime
  #472 = Utf8               type
  #473 = Utf8               SourceFile
  #474 = Utf8               OlympiadGameNormal.java
{
  protected int _damageP1;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _damageP2;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.olympiad.Participant _playerOne;
    descriptor: Lext/mods/gameserver/model/olympiad/Participant;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.olympiad.Participant _playerTwo;
    descriptor: Lext/mods/gameserver/model/olympiad/Participant;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.olympiad.OlympiadGameNormal(int, ext.mods.gameserver.model.olympiad.Participant[]);
    descriptor: (I[Lext/mods/gameserver/model/olympiad/Participant;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame."<init>":(I)V
         5: aload_0
         6: iconst_0
         7: putfield      #7                  // Field _damageP1:I
        10: aload_0
        11: iconst_0
        12: putfield      #13                 // Field _damageP2:I
        15: aload_0
        16: aload_2
        17: iconst_0
        18: aaload
        19: putfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        22: aload_0
        23: aload_2
        24: iconst_1
        25: aaload
        26: putfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        29: aload_0
        30: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        33: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        36: iload_1
        37: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.setOlympiadGameId:(I)V
        40: aload_0
        41: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        44: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        47: iload_1
        48: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Player.setOlympiadGameId:(I)V
        51: return
      LineNumberTable:
        line 53: 0
        line 45: 5
        line 46: 10
        line 55: 15
        line 56: 22
        line 58: 29
        line 59: 40
        line 60: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      52     1    id   I
            0      52     2 opponents   [Lext/mods/gameserver/model/olympiad/Participant;

  protected static final ext.mods.gameserver.model.olympiad.Participant[] createListOfParticipants(java.util.List<java.lang.Integer>);
    descriptor: (Ljava/util/List;)[Lext/mods/gameserver/model/olympiad/Participant;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=6, locals=8, args_size=1
         0: aload_0
         1: ifnull        23
         4: aload_0
         5: invokeinterface #34,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        10: ifne          23
        13: aload_0
        14: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
        19: iconst_2
        20: if_icmpge     25
        23: aconst_null
        24: areturn
        25: iconst_0
        26: istore_1
        27: aconst_null
        28: astore_2
        29: aconst_null
        30: astore_3
        31: bipush        10
        33: aload_0
        34: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
        39: aload_0
        40: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
        45: imul
        46: invokestatic  #44                 // Method java/lang/Math.max:(II)I
        49: istore        4
        51: iconst_0
        52: istore        5
        54: aload_0
        55: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
        60: iconst_1
        61: if_icmple     273
        64: iload         5
        66: iinc          5, 1
        69: iload         4
        71: if_icmpge     273
        74: aload_0
        75: aload_0
        76: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
        81: invokestatic  #50                 // Method ext/mods/commons/random/Rnd.get:(I)I
        84: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
        89: checkcast     #60                 // class java/lang/Integer
        92: invokevirtual #62                 // Method java/lang/Integer.intValue:()I
        95: istore_1
        96: invokestatic  #65                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        99: iload_1
       100: invokevirtual #71                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       103: astore_2
       104: aload_2
       105: ifnull        115
       108: aload_2
       109: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       112: ifne          129
       115: aload_0
       116: iload_1
       117: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       120: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       125: pop
       126: goto          54
       129: aload_0
       130: aload_0
       131: invokeinterface #40,  1           // InterfaceMethod java/util/List.size:()I
       136: invokestatic  #50                 // Method ext/mods/commons/random/Rnd.get:(I)I
       139: invokeinterface #56,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
       144: checkcast     #60                 // class java/lang/Integer
       147: invokevirtual #62                 // Method java/lang/Integer.intValue:()I
       150: istore        6
       152: invokestatic  #65                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       155: iload         6
       157: invokevirtual #71                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       160: astore_3
       161: aload_3
       162: ifnull        172
       165: aload_3
       166: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       169: ifne          198
       172: aload_0
       173: iload_1
       174: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       177: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       182: pop
       183: aload_0
       184: iload         6
       186: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       189: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       194: pop
       195: goto          54
       198: getstatic     #85                 // Field ext/mods/Config.OLY_BLOCK_SAME_HWID:Z
       201: ifeq          238
       204: aload_2
       205: aload_3
       206: invokestatic  #91                 // Method ext/mods/protection/hwid/hwidManager.hasSameHwid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
       209: ifeq          238
       212: aload_0
       213: iload_1
       214: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       217: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       222: pop
       223: aload_0
       224: iload         6
       226: invokestatic  #77                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       229: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       234: pop
       235: goto          54
       238: iconst_2
       239: anewarray     #24                 // class ext/mods/gameserver/model/olympiad/Participant
       242: astore        7
       244: aload         7
       246: iconst_0
       247: new           #24                 // class ext/mods/gameserver/model/olympiad/Participant
       250: dup
       251: aload_2
       252: iconst_1
       253: invokespecial #97                 // Method ext/mods/gameserver/model/olympiad/Participant."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       256: aastore
       257: aload         7
       259: iconst_1
       260: new           #24                 // class ext/mods/gameserver/model/olympiad/Participant
       263: dup
       264: aload_3
       265: iconst_2
       266: invokespecial #97                 // Method ext/mods/gameserver/model/olympiad/Participant."<init>":(Lext/mods/gameserver/model/actor/Player;I)V
       269: aastore
       270: aload         7
       272: areturn
       273: aconst_null
       274: areturn
      LineNumberTable:
        line 64: 0
        line 65: 23
        line 67: 25
        line 68: 27
        line 69: 29
        line 70: 31
        line 71: 51
        line 73: 54
        line 75: 74
        line 76: 96
        line 77: 104
        line 79: 115
        line 80: 126
        line 83: 129
        line 84: 152
        line 85: 161
        line 87: 172
        line 88: 183
        line 89: 195
        line 92: 198
        line 94: 212
        line 95: 223
        line 96: 235
        line 99: 238
        line 100: 244
        line 101: 257
        line 103: 270
        line 105: 273
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          152     121     6 playerTwoObjectId   I
          244      29     7 result   [Lext/mods/gameserver/model/olympiad/Participant;
            0     275     0  list   Ljava/util/List;
           27     248     1 playerOneObjectId   I
           29     246     2 playerOne   Lext/mods/gameserver/model/actor/Player;
           31     244     3 playerTwo   Lext/mods/gameserver/model/actor/Player;
           51     224     4 maxAttempts   I
           54     221     5 attempts   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     275     0  list   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 9
        frame_type = 23 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class java/util/List, int, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, int, int ]
          stack = []
        frame_type = 60 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ int ]
        frame_type = 25 /* same */
        frame_type = 39 /* same */
        frame_type = 250 /* chop */
          offset_delta = 34
    Signature: #411                         // (Ljava/util/List<Ljava/lang/Integer;>;)[Lext/mods/gameserver/model/olympiad/Participant;

  public final boolean containsParticipant(int);
    descriptor: (I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #100                // Method ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
         7: iload_1
         8: if_icmpeq     22
        11: aload_0
        12: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        15: invokevirtual #100                // Method ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
        18: iload_1
        19: if_icmpne     26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: ireturn
      LineNumberTable:
        line 111: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      28     1 objectId   I
      StackMapTable: number_of_entries = 3
        frame_type = 22 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void sendOlympiadInfo(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: new           #103                // class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
         4: dup
         5: aload_0
         6: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         9: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        12: invokespecial #105                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        15: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        18: aload_0
        19: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        22: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        25: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
        28: aload_1
        29: new           #103                // class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
        32: dup
        33: aload_0
        34: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        37: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        40: invokespecial #105                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        43: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: aload_0
        47: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        50: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        53: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
        56: return
      LineNumberTable:
        line 117: 0
        line 118: 18
        line 119: 28
        line 120: 46
        line 121: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      57     1 player   Lext/mods/gameserver/model/actor/Creature;

  public final void broadcastOlympiadInfo(ext.mods.gameserver.model.zone.type.OlympiadStadiumZone);
    descriptor: (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: new           #103                // class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
         4: dup
         5: aload_0
         6: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         9: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        12: invokespecial #105                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        15: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        18: aload_0
        19: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        22: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        25: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
        28: aload_1
        29: new           #103                // class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
        32: dup
        33: aload_0
        34: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        37: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        40: invokespecial #105                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        43: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        46: aload_0
        47: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        50: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        53: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.updateEffectIcons:()V
        56: return
      LineNumberTable:
        line 126: 0
        line 127: 18
        line 128: 28
        line 129: 46
        line 130: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      57     1 stadium   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;

  protected final void broadcastPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
         7: aload_0
         8: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        11: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        14: ifnull        28
        17: aload_0
        18: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        21: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        24: aload_1
        25: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        28: aload_0
        29: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        32: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
        35: aload_0
        36: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        39: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        42: ifnull        56
        45: aload_0
        46: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        49: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        52: aload_1
        53: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        56: return
      LineNumberTable:
        line 135: 0
        line 136: 7
        line 137: 17
        line 139: 28
        line 140: 35
        line 141: 45
        line 142: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      57     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 27 /* same */

  protected final boolean portPlayersToArena(java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (Ljava/util/List;)Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: iconst_1
         1: istore_2
         2: iload_2
         3: aload_0
         4: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         7: aload_1
         8: iconst_0
         9: invokeinterface #127,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        14: checkcast     #129                // class ext/mods/gameserver/model/location/Location
        17: aload_0
        18: getfield      #131                // Field _stadiumId:I
        21: invokestatic  #134                // Method portPlayerToArena:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
        24: iand
        25: istore_2
        26: iload_2
        27: aload_0
        28: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        31: aload_1
        32: iconst_1
        33: invokeinterface #127,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        38: checkcast     #129                // class ext/mods/gameserver/model/location/Location
        41: aload_0
        42: getfield      #131                // Field _stadiumId:I
        45: invokestatic  #134                // Method portPlayerToArena:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/location/Location;I)Z
        48: iand
        49: istore_2
        50: iload_2
        51: ireturn
      LineNumberTable:
        line 147: 0
        line 148: 2
        line 149: 26
        line 151: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      52     1 spawns   Ljava/util/List;
            2      50     2 result   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      52     1 spawns   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    Signature: #429                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z

  protected final void removals();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #138                // Field _aborted:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        12: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        15: iconst_1
        16: invokestatic  #141                // Method removals:(Lext/mods/gameserver/model/actor/Player;Z)V
        19: aload_0
        20: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        23: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        26: iconst_1
        27: invokestatic  #141                // Method removals:(Lext/mods/gameserver/model/actor/Player;Z)V
        30: return
      LineNumberTable:
        line 157: 0
        line 158: 7
        line 160: 8
        line 161: 19
        line 162: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  protected final void buffPlayers();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #138                // Field _aborted:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        12: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        15: invokestatic  #145                // Method buffPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        18: aload_0
        19: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        22: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        25: invokestatic  #145                // Method buffPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        28: return
      LineNumberTable:
        line 167: 0
        line 168: 7
        line 170: 8
        line 171: 18
        line 172: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  protected final void healPlayers();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #138                // Field _aborted:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        12: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        18: invokevirtual #152                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
        21: aload_0
        22: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        25: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        28: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        31: invokevirtual #152                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setMaxCpHpMp:()V
        34: return
      LineNumberTable:
        line 177: 0
        line 178: 7
        line 180: 8
        line 181: 21
        line 182: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  protected final boolean makeCompetitionStart();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #157                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.makeCompetitionStart:()Z
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        13: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        16: ifnull        29
        19: aload_0
        20: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        23: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        26: ifnonnull     31
        29: iconst_0
        30: ireturn
        31: aload_0
        32: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        35: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        38: iconst_1
        39: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
        42: aload_0
        43: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        46: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        49: iconst_1
        50: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Player.setOlympiadStart:(Z)V
        53: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
        56: aload_0
        57: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        60: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        63: invokevirtual #169                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.applyOlympiadEnchant:(Lext/mods/gameserver/model/actor/Player;)V
        66: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
        69: aload_0
        70: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        73: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        76: invokevirtual #169                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.applyOlympiadEnchant:(Lext/mods/gameserver/model/actor/Player;)V
        79: iconst_1
        80: ireturn
      LineNumberTable:
        line 187: 0
        line 188: 7
        line 190: 9
        line 191: 29
        line 193: 31
        line 194: 42
        line 195: 53
        line 196: 66
        line 197: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 3
        frame_type = 9 /* same */
        frame_type = 19 /* same */
        frame_type = 1 /* same */

  protected final void cleanEffects();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         7: ifnull        57
        10: aload_0
        11: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        14: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        17: ifne          57
        20: aload_0
        21: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        24: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        27: ifne          57
        30: aload_0
        31: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        34: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        37: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        40: aload_0
        41: getfield      #131                // Field _stadiumId:I
        44: if_icmpne     57
        47: aload_0
        48: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        51: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        54: invokestatic  #181                // Method cleanEffects:(Lext/mods/gameserver/model/actor/Player;)V
        57: aload_0
        58: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        61: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        64: ifnull        114
        67: aload_0
        68: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        71: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        74: ifne          114
        77: aload_0
        78: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        81: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        84: ifne          114
        87: aload_0
        88: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        91: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        94: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        97: aload_0
        98: getfield      #131                // Field _stadiumId:I
       101: if_icmpne     114
       104: aload_0
       105: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       108: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       111: invokestatic  #181                // Method cleanEffects:(Lext/mods/gameserver/model/actor/Player;)V
       114: return
      LineNumberTable:
        line 203: 0
        line 204: 47
        line 206: 57
        line 207: 104
        line 208: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     115     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 2
        frame_type = 57 /* same */
        frame_type = 56 /* same */

  protected final void portPlayersBack();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
         7: aload_0
         8: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        11: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
        14: aload_0
        15: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        18: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        21: ifne          34
        24: aload_0
        25: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        28: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        31: ifeq          38
        34: iconst_1
        35: goto          39
        38: iconst_0
        39: istore_1
        40: iload_1
        41: ifeq          107
        44: aload_0
        45: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        48: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        51: ifnull        74
        54: aload_0
        55: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        58: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        61: ifne          74
        64: aload_0
        65: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        68: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        71: invokestatic  #184                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.portPlayerToGiranPersistent:(Lext/mods/gameserver/model/actor/Player;)V
        74: aload_0
        75: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        78: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        81: ifnull        167
        84: aload_0
        85: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        88: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        91: ifne          167
        94: aload_0
        95: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        98: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       101: invokestatic  #184                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.portPlayerToGiranPersistent:(Lext/mods/gameserver/model/actor/Player;)V
       104: goto          167
       107: aload_0
       108: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       111: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       114: ifnull        137
       117: aload_0
       118: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       121: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
       124: ifne          137
       127: aload_0
       128: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       131: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       134: invokestatic  #187                // Method portPlayerBack:(Lext/mods/gameserver/model/actor/Player;)V
       137: aload_0
       138: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       141: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       144: ifnull        167
       147: aload_0
       148: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       151: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
       154: ifne          167
       157: aload_0
       158: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       161: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       164: invokestatic  #187                // Method portPlayerBack:(Lext/mods/gameserver/model/actor/Player;)V
       167: return
      LineNumberTable:
        line 213: 0
        line 214: 7
        line 215: 14
        line 216: 40
        line 218: 44
        line 219: 64
        line 220: 74
        line 221: 94
        line 225: 107
        line 226: 127
        line 227: 137
        line 228: 157
        line 230: 167
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     168     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
           40     128     1 safeDisconnectUsed   Z
      StackMapTable: number_of_entries = 7
        frame_type = 34 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ int ]
        frame_type = 32 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */

  protected final void playersStatusBack();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         7: ifnull        57
        10: aload_0
        11: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        14: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        17: ifne          57
        20: aload_0
        21: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        24: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        27: ifne          57
        30: aload_0
        31: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        34: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        37: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        40: aload_0
        41: getfield      #131                // Field _stadiumId:I
        44: if_icmpne     57
        47: aload_0
        48: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        51: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        54: invokestatic  #190                // Method playerStatusBack:(Lext/mods/gameserver/model/actor/Player;)V
        57: aload_0
        58: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        61: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        64: ifnull        114
        67: aload_0
        68: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        71: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        74: ifne          114
        77: aload_0
        78: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        81: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        84: ifne          114
        87: aload_0
        88: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        91: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        94: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        97: aload_0
        98: getfield      #131                // Field _stadiumId:I
       101: if_icmpne     114
       104: aload_0
       105: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       108: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       111: invokestatic  #190                // Method playerStatusBack:(Lext/mods/gameserver/model/actor/Player;)V
       114: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
       117: aload_0
       118: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       121: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       124: invokevirtual #193                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
       127: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
       130: aload_0
       131: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       134: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       137: invokevirtual #193                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
       140: return
      LineNumberTable:
        line 235: 0
        line 236: 47
        line 238: 57
        line 239: 104
        line 241: 114
        line 242: 127
        line 244: 140
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     141     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 2
        frame_type = 57 /* same */
        frame_type = 56 /* same */

  protected final void clearPlayers();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: ifnull        20
         7: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
        10: aload_0
        11: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        14: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        17: invokevirtual #193                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
        20: aload_0
        21: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        24: ifnull        40
        27: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
        30: aload_0
        31: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        34: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        37: invokevirtual #193                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
        40: aload_0
        41: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        44: aconst_null
        45: invokevirtual #196                // Method ext/mods/gameserver/model/olympiad/Participant.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        48: aload_0
        49: aconst_null
        50: putfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        53: aload_0
        54: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        57: aconst_null
        58: invokevirtual #196                // Method ext/mods/gameserver/model/olympiad/Participant.setPlayer:(Lext/mods/gameserver/model/actor/Player;)V
        61: aload_0
        62: aconst_null
        63: putfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        66: return
      LineNumberTable:
        line 249: 0
        line 250: 7
        line 252: 20
        line 253: 27
        line 255: 40
        line 256: 48
        line 258: 53
        line 259: 61
        line 260: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 19 /* same */

  protected final void handleDisconnect(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
         4: aload_0
         5: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         8: invokevirtual #100                // Method ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
        11: if_icmpne     25
        14: aload_0
        15: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        18: iconst_1
        19: invokevirtual #200                // Method ext/mods/gameserver/model/olympiad/Participant.setDisconnection:(Z)V
        22: goto          47
        25: aload_1
        26: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: aload_0
        30: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        33: invokevirtual #100                // Method ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
        36: if_icmpne     47
        39: aload_0
        40: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        43: iconst_1
        44: invokevirtual #200                // Method ext/mods/gameserver/model/olympiad/Participant.setDisconnection:(Z)V
        47: invokestatic  #164                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.getInstance:()Lext/mods/gameserver/custom/data/OlympiadEnchantData;
        50: aload_1
        51: invokevirtual #193                // Method ext/mods/gameserver/custom/data/OlympiadEnchantData.restoreEnchant:(Lext/mods/gameserver/model/actor/Player;)V
        54: return
      LineNumberTable:
        line 265: 0
        line 266: 14
        line 267: 25
        line 268: 39
        line 270: 47
        line 271: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      55     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 21 /* same */

  public void clearDisconnections();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: iconst_0
         5: invokevirtual #200                // Method ext/mods/gameserver/model/olympiad/Participant.setDisconnection:(Z)V
         8: aload_0
         9: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        12: iconst_0
        13: invokevirtual #200                // Method ext/mods/gameserver/model/olympiad/Participant.setDisconnection:(Z)V
        16: return
      LineNumberTable:
        line 275: 0
        line 276: 8
        line 277: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;

  public void setParticipantsSavedLocationToGiran();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
         7: aload_0
         8: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        11: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
        14: aload_0
        15: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        18: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: ifnull        34
        24: aload_0
        25: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        28: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        31: invokestatic  #203                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.setSavedLocationToGiran:(Lext/mods/gameserver/model/actor/Player;)V
        34: aload_0
        35: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        38: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        41: ifnull        54
        44: aload_0
        45: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        48: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        51: invokestatic  #203                // Method ext/mods/gameserver/model/olympiad/AbstractOlympiadGame.setSavedLocationToGiran:(Lext/mods/gameserver/model/actor/Player;)V
        54: return
      LineNumberTable:
        line 285: 0
        line 286: 7
        line 287: 14
        line 288: 24
        line 289: 34
        line 290: 44
        line 291: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 2
        frame_type = 34 /* same */
        frame_type = 19 /* same */

  public boolean areParticipantsOnline();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
         7: aload_0
         8: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        11: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
        14: aload_0
        15: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        18: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: astore_1
        22: aload_0
        23: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        26: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        29: astore_2
        30: aload_1
        31: ifnull        56
        34: aload_1
        35: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        38: ifeq          56
        41: aload_2
        42: ifnull        56
        45: aload_2
        46: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        49: ifeq          56
        52: iconst_1
        53: goto          57
        56: iconst_0
        57: ireturn
      LineNumberTable:
        line 295: 0
        line 296: 7
        line 298: 14
        line 299: 22
        line 300: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
           22      36     1    p1   Lext/mods/gameserver/model/actor/Player;
           30      28     2    p2   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected final boolean checkBattleStatus();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #138                // Field _aborted:Z
         4: ifeq          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        13: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        16: ifnull        29
        19: aload_0
        20: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        23: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        26: ifeq          31
        29: iconst_0
        30: ireturn
        31: aload_0
        32: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        35: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        38: ifnull        51
        41: aload_0
        42: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        45: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
        48: ifeq          53
        51: iconst_0
        52: ireturn
        53: iconst_1
        54: ireturn
      LineNumberTable:
        line 306: 0
        line 307: 7
        line 309: 9
        line 310: 29
        line 312: 31
        line 313: 51
        line 315: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 19 /* same */
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 1 /* same */

  protected final boolean haveWinner();
    descriptor: ()Z
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #206                // Method checkBattleStatus:()Z
         4: ifne          9
         7: iconst_1
         8: ireturn
         9: iconst_1
        10: istore_1
        11: aload_0
        12: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        15: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        21: aload_0
        22: getfield      #131                // Field _stadiumId:I
        25: if_icmpne     39
        28: aload_0
        29: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        32: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        35: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        38: istore_1
        39: goto          45
        42: astore_2
        43: iconst_1
        44: istore_1
        45: iconst_1
        46: istore_2
        47: aload_0
        48: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        51: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        54: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        57: aload_0
        58: getfield      #131                // Field _stadiumId:I
        61: if_icmpne     75
        64: aload_0
        65: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        68: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        71: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        74: istore_2
        75: goto          81
        78: astore_3
        79: iconst_1
        80: istore_2
        81: iload_1
        82: ifne          89
        85: iload_2
        86: ifeq          93
        89: iconst_1
        90: goto          94
        93: iconst_0
        94: ireturn
      Exception table:
         from    to  target type
            11    39    42   Class java/lang/Exception
            47    75    78   Class java/lang/Exception
      LineNumberTable:
        line 321: 0
        line 322: 7
        line 324: 9
        line 327: 11
        line 328: 28
        line 333: 39
        line 330: 42
        line 332: 43
        line 335: 45
        line 338: 47
        line 339: 64
        line 344: 75
        line 341: 78
        line 343: 79
        line 346: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43       2     2     e   Ljava/lang/Exception;
           79       2     3     e   Ljava/lang/Exception;
            0      95     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
           11      84     1 playerOneLost   Z
           47      48     2 playerTwoLost   Z
      StackMapTable: number_of_entries = 10
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 2 /* same */
        frame_type = 7 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected void validateWinner(ext.mods.gameserver.model.zone.type.OlympiadStadiumZone);
    descriptor: (Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=8, locals=13, args_size=2
         0: aload_0
         1: getfield      #138                // Field _aborted:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        12: invokevirtual #214                // Method ext/mods/gameserver/model/olympiad/Participant.getStatSet:()Lext/mods/commons/data/StatSet;
        15: ldc           #218                // String olympiad_points
        17: invokevirtual #220                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        20: istore_2
        21: aload_0
        22: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        25: invokevirtual #214                // Method ext/mods/gameserver/model/olympiad/Participant.getStatSet:()Lext/mods/commons/data/StatSet;
        28: ldc           #218                // String olympiad_points
        30: invokevirtual #220                // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        33: istore_3
        34: aload_0
        35: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        38: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        41: ifne          54
        44: aload_0
        45: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        48: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        51: ifeq          109
        54: aload_0
        55: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        58: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        61: ifeq          81
        64: aload_0
        65: aload_0
        66: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        69: iload_2
        70: iconst_3
        71: idiv
        72: getstatic     #226                // Field ext/mods/Config.OLY_MAX_POINTS:I
        75: invokestatic  #229                // Method java/lang/Math.min:(II)I
        78: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
        81: aload_0
        82: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        85: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
        88: ifeq          108
        91: aload_0
        92: aload_0
        93: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        96: iload_3
        97: iconst_3
        98: idiv
        99: getstatic     #226                // Field ext/mods/Config.OLY_MAX_POINTS:I
       102: invokestatic  #229                // Method java/lang/Math.min:(II)I
       105: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       108: return
       109: aload_0
       110: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       113: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       116: ifnull        129
       119: aload_0
       120: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       123: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
       126: ifeq          133
       129: iconst_1
       130: goto          134
       133: iconst_0
       134: istore        4
       136: aload_0
       137: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       140: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       143: ifnull        156
       146: aload_0
       147: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       150: invokevirtual #175                // Method ext/mods/gameserver/model/olympiad/Participant.isDisconnected:()Z
       153: ifeq          160
       156: iconst_1
       157: goto          161
       160: iconst_0
       161: istore        5
       163: invokestatic  #236                // Method java/lang/System.currentTimeMillis:()J
       166: aload_0
       167: getfield      #242                // Field _startTime:J
       170: lsub
       171: lstore        6
       173: iload_2
       174: iload_3
       175: invokestatic  #229                // Method java/lang/Math.min:(II)I
       178: aload_0
       179: invokevirtual #246                // Method getDivider:()I
       182: idiv
       183: i2l
       184: iconst_1
       185: getstatic     #226                // Field ext/mods/Config.OLY_MAX_POINTS:I
       188: invokestatic  #249                // Method java/lang/Math.clamp:(JII)I
       191: istore        8
       193: iload         4
       195: ifne          203
       198: iload         5
       200: ifeq          466
       203: iload         5
       205: ifeq          292
       208: iload         4
       210: ifne          292
       213: aload_1
       214: getstatic     #253                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       217: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       220: aload_0
       221: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       224: invokevirtual #265                // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
       227: invokevirtual #269                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       230: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       233: aload_0
       234: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       237: ldc_w         #273                // String competitions_won
       240: iconst_1
       241: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       244: aload_0
       245: aload_0
       246: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       249: iload         8
       251: invokevirtual #279                // Method addPointsToParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       254: aload_0
       255: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       258: ldc_w         #282                // String competitions_lost
       261: iconst_1
       262: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       265: aload_0
       266: aload_0
       267: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       270: iload         8
       272: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       275: aload_0
       276: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       279: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       282: aload_0
       283: invokevirtual #284                // Method getReward:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       286: invokestatic  #288                // Method rewardParticipant:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
       289: goto          443
       292: iload         4
       294: ifeq          381
       297: iload         5
       299: ifne          381
       302: aload_1
       303: getstatic     #253                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       306: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       309: aload_0
       310: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       313: invokevirtual #265                // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
       316: invokevirtual #269                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       319: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       322: aload_0
       323: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       326: ldc_w         #273                // String competitions_won
       329: iconst_1
       330: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       333: aload_0
       334: aload_0
       335: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       338: iload         8
       340: invokevirtual #279                // Method addPointsToParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       343: aload_0
       344: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       347: ldc_w         #282                // String competitions_lost
       350: iconst_1
       351: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       354: aload_0
       355: aload_0
       356: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       359: iload         8
       361: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       364: aload_0
       365: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       368: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       371: aload_0
       372: invokevirtual #284                // Method getReward:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       375: invokestatic  #288                // Method rewardParticipant:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
       378: goto          443
       381: iload         4
       383: ifeq          443
       386: iload         5
       388: ifeq          443
       391: aload_1
       392: getstatic     #292                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
       395: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       398: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       401: aload_0
       402: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       405: ldc_w         #282                // String competitions_lost
       408: iconst_1
       409: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       412: aload_0
       413: aload_0
       414: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       417: iload         8
       419: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       422: aload_0
       423: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       426: ldc_w         #282                // String competitions_lost
       429: iconst_1
       430: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       433: aload_0
       434: aload_0
       435: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       438: iload         8
       440: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       443: aload_0
       444: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       447: ldc_w         #295                // String competitions_drawn
       450: iconst_1
       451: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       454: aload_0
       455: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       458: ldc_w         #295                // String competitions_drawn
       461: iconst_1
       462: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       465: return
       466: dconst_0
       467: dstore        9
       469: aload_0
       470: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       473: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       476: ifnull        533
       479: aload_0
       480: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       483: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       486: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       489: ifne          533
       492: aload_0
       493: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       496: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       499: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       502: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
       505: aload_0
       506: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       509: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       512: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       515: invokevirtual #301                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
       518: dadd
       519: dstore        9
       521: dload         9
       523: ldc2_w        #304                // double 0.5d
       526: dcmpg
       527: ifge          533
       530: dconst_0
       531: dstore        9
       533: dconst_0
       534: dstore        11
       536: aload_0
       537: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       540: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       543: ifnull        600
       546: aload_0
       547: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       550: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       553: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       556: ifne          600
       559: aload_0
       560: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       563: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       566: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       569: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
       572: aload_0
       573: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       576: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       579: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       582: invokevirtual #301                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
       585: dadd
       586: dstore        11
       588: dload         11
       590: ldc2_w        #304                // double 0.5d
       593: dcmpg
       594: ifge          600
       597: dconst_0
       598: dstore        11
       600: aload_0
       601: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       604: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
       607: aload_0
       608: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       611: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
       614: aload_0
       615: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       618: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       621: ifnull        637
       624: aload_0
       625: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       628: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       631: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       634: ifne          695
       637: aload_0
       638: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       641: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       644: ifnull        660
       647: aload_0
       648: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       651: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       654: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       657: ifne          695
       660: aload_0
       661: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       664: ldc_w         #273                // String competitions_won
       667: iconst_1
       668: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       671: aload_0
       672: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       675: ldc_w         #282                // String competitions_lost
       678: iconst_1
       679: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       682: aload_1
       683: getstatic     #292                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
       686: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       689: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       692: goto          1093
       695: aload_0
       696: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       699: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       702: ifnull        757
       705: aload_0
       706: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       709: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       712: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       715: ifeq          757
       718: dload         11
       720: dconst_0
       721: dcmpl
       722: ifne          732
       725: dload         9
       727: dconst_0
       728: dcmpl
       729: ifne          757
       732: aload_0
       733: getfield      #7                  // Field _damageP1:I
       736: aload_0
       737: getfield      #13                 // Field _damageP2:I
       740: if_icmple     858
       743: dload         11
       745: dconst_0
       746: dcmpl
       747: ifeq          858
       750: dload         9
       752: dconst_0
       753: dcmpl
       754: ifeq          858
       757: aload_1
       758: getstatic     #253                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       761: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       764: aload_0
       765: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       768: invokevirtual #265                // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
       771: invokevirtual #269                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       774: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       777: aload_0
       778: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       781: ldc_w         #273                // String competitions_won
       784: iconst_1
       785: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       788: aload_0
       789: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       792: ldc_w         #282                // String competitions_lost
       795: iconst_1
       796: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       799: aload_0
       800: aload_0
       801: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       804: iload         8
       806: invokevirtual #279                // Method addPointsToParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       809: aload_0
       810: aload_0
       811: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       814: iload         8
       816: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       819: aload_0
       820: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       823: aload_0
       824: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       827: iconst_1
       828: aload_0
       829: getfield      #242                // Field _startTime:J
       832: lload         6
       834: aload_0
       835: invokevirtual #306                // Method getType:()Lext/mods/gameserver/enums/OlympiadType;
       838: invokestatic  #310                // Method saveResults:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
       841: aload_0
       842: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       845: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       848: aload_0
       849: invokevirtual #284                // Method getReward:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       852: invokestatic  #288                // Method rewardParticipant:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
       855: goto          1093
       858: aload_0
       859: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       862: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       865: ifnull        920
       868: aload_0
       869: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       872: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
       875: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
       878: ifeq          920
       881: dload         9
       883: dconst_0
       884: dcmpl
       885: ifne          895
       888: dload         11
       890: dconst_0
       891: dcmpl
       892: ifne          920
       895: aload_0
       896: getfield      #13                 // Field _damageP2:I
       899: aload_0
       900: getfield      #7                  // Field _damageP1:I
       903: if_icmple     1021
       906: dload         9
       908: dconst_0
       909: dcmpl
       910: ifeq          1021
       913: dload         11
       915: dconst_0
       916: dcmpl
       917: ifeq          1021
       920: aload_1
       921: getstatic     #253                // Field ext/mods/gameserver/network/SystemMessageId.S1_HAS_WON_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
       924: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       927: aload_0
       928: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       931: invokevirtual #265                // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
       934: invokevirtual #269                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       937: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       940: aload_0
       941: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       944: ldc_w         #314                // String competitions_done
       947: iconst_1
       948: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       951: aload_0
       952: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       955: ldc_w         #314                // String competitions_done
       958: iconst_1
       959: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
       962: aload_0
       963: aload_0
       964: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       967: iload         8
       969: invokevirtual #279                // Method addPointsToParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       972: aload_0
       973: aload_0
       974: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       977: iload         8
       979: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
       982: aload_0
       983: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       986: aload_0
       987: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       990: iconst_2
       991: aload_0
       992: getfield      #242                // Field _startTime:J
       995: lload         6
       997: aload_0
       998: invokevirtual #306                // Method getType:()Lext/mods/gameserver/enums/OlympiadType;
      1001: invokestatic  #310                // Method saveResults:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
      1004: aload_0
      1005: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
      1008: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
      1011: aload_0
      1012: invokevirtual #284                // Method getReward:()[Lext/mods/gameserver/model/holder/IntIntHolder;
      1015: invokestatic  #288                // Method rewardParticipant:(Lext/mods/gameserver/model/actor/Player;[Lext/mods/gameserver/model/holder/IntIntHolder;)V
      1018: goto          1093
      1021: aload_0
      1022: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
      1025: aload_0
      1026: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
      1029: iconst_0
      1030: aload_0
      1031: getfield      #242                // Field _startTime:J
      1034: lload         6
      1036: aload_0
      1037: invokevirtual #306                // Method getType:()Lext/mods/gameserver/enums/OlympiadType;
      1040: invokestatic  #310                // Method saveResults:(Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
      1043: aload_1
      1044: getstatic     #292                // Field ext/mods/gameserver/network/SystemMessageId.THE_GAME_ENDED_IN_A_TIE:Lext/mods/gameserver/network/SystemMessageId;
      1047: invokestatic  #259                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1050: invokevirtual #118                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1053: aload_0
      1054: aload_0
      1055: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
      1058: iload_2
      1059: aload_0
      1060: invokevirtual #246                // Method getDivider:()I
      1063: idiv
      1064: getstatic     #226                // Field ext/mods/Config.OLY_MAX_POINTS:I
      1067: invokestatic  #229                // Method java/lang/Math.min:(II)I
      1070: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
      1073: aload_0
      1074: aload_0
      1075: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
      1078: iload_3
      1079: aload_0
      1080: invokevirtual #246                // Method getDivider:()I
      1083: idiv
      1084: getstatic     #226                // Field ext/mods/Config.OLY_MAX_POINTS:I
      1087: invokestatic  #229                // Method java/lang/Math.min:(II)I
      1090: invokevirtual #232                // Method removePointsFromParticipant:(Lext/mods/gameserver/model/olympiad/Participant;I)V
      1093: aload_0
      1094: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
      1097: ldc_w         #314                // String competitions_done
      1100: iconst_1
      1101: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
      1104: aload_0
      1105: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
      1108: ldc_w         #314                // String competitions_done
      1111: iconst_1
      1112: invokevirtual #275                // Method ext/mods/gameserver/model/olympiad/Participant.updateStat:(Ljava/lang/String;I)V
      1115: return
      LineNumberTable:
        line 352: 0
        line 353: 7
        line 355: 8
        line 356: 21
        line 358: 34
        line 360: 54
        line 361: 64
        line 363: 81
        line 364: 91
        line 366: 108
        line 369: 109
        line 370: 136
        line 372: 163
        line 373: 173
        line 375: 193
        line 377: 203
        line 379: 213
        line 381: 233
        line 382: 244
        line 384: 254
        line 385: 265
        line 387: 275
        line 389: 292
        line 391: 302
        line 393: 322
        line 394: 333
        line 396: 343
        line 397: 354
        line 399: 364
        line 401: 381
        line 403: 391
        line 405: 401
        line 406: 412
        line 408: 422
        line 409: 433
        line 412: 443
        line 413: 454
        line 415: 465
        line 418: 466
        line 419: 469
        line 421: 492
        line 422: 521
        line 423: 530
        line 426: 533
        line 427: 536
        line 429: 559
        line 430: 588
        line 431: 597
        line 434: 600
        line 435: 607
        line 437: 614
        line 439: 660
        line 440: 671
        line 441: 682
        line 443: 695
        line 445: 757
        line 447: 777
        line 448: 788
        line 450: 799
        line 451: 809
        line 453: 819
        line 454: 841
        line 456: 858
        line 458: 920
        line 460: 940
        line 461: 951
        line 463: 962
        line 464: 972
        line 466: 982
        line 467: 1004
        line 471: 1021
        line 473: 1043
        line 475: 1053
        line 476: 1073
        line 479: 1093
        line 480: 1104
        line 481: 1115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0    1116     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0    1116     1 stadium   Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
           21    1095     2 playerOnePoints   I
           34    1082     3 playerTwoPoints   I
          136     980     4 pOneCrash   Z
          163     953     5 pTwoCrash   Z
          173     943     6 fightTime   J
          193     923     8 pointDiff   I
          469     647     9 playerOneHp   D
          536     580    11 playerTwoHp   D
      StackMapTable: number_of_entries = 28
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 45
          locals = [ int, int ]
        frame_type = 26 /* same */
        frame_type = 26 /* same */
        frame_type = 0 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 254 /* append */
          offset_delta = 41
          locals = [ int, long, int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 88
        frame_type = 251 /* same_frame_extended */
          offset_delta = 88
        frame_type = 61 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ double ]
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ double ]
        frame_type = 36 /* same */
        frame_type = 22 /* same */
        frame_type = 34 /* same */
        frame_type = 36 /* same */
        frame_type = 24 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 100
        frame_type = 36 /* same */
        frame_type = 24 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 100
        frame_type = 251 /* same_frame_extended */
          offset_delta = 71

  protected final void addDamage(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         7: ifnull        20
        10: aload_0
        11: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        14: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        17: ifnonnull     21
        20: return
        21: aload_1
        22: aload_0
        23: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        26: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        29: if_acmpne     45
        32: aload_0
        33: dup
        34: getfield      #7                  // Field _damageP1:I
        37: iload_2
        38: iadd
        39: putfield      #7                  // Field _damageP1:I
        42: goto          66
        45: aload_1
        46: aload_0
        47: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        50: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        53: if_acmpne     66
        56: aload_0
        57: dup
        58: getfield      #13                 // Field _damageP2:I
        61: iload_2
        62: iadd
        63: putfield      #13                 // Field _damageP2:I
        66: return
      LineNumberTable:
        line 486: 0
        line 487: 20
        line 489: 21
        line 490: 32
        line 491: 45
        line 492: 56
        line 493: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
            0      67     1 player   Lext/mods/gameserver/model/actor/Player;
            0      67     2 damage   I
      StackMapTable: number_of_entries = 4
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 23 /* same */
        frame_type = 20 /* same */

  public final java.lang.String[] getPlayerNames();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: iconst_2
         1: anewarray     #316                // class java/lang/String
         4: dup
         5: iconst_0
         6: aload_0
         7: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        10: invokevirtual #265                // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
        13: aastore
        14: dup
        15: iconst_1
        16: aload_0
        17: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        20: invokevirtual #265                // Method ext/mods/gameserver/model/olympiad/Participant.getName:()Ljava/lang/String;
        23: aastore
        24: areturn
      LineNumberTable:
        line 498: 0
        line 500: 10
        line 501: 20
        line 498: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;

  public boolean checkDefection();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
         4: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
         7: aload_0
         8: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        11: invokevirtual #123                // Method ext/mods/gameserver/model/olympiad/Participant.updatePlayer:()V
        14: aload_0
        15: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        18: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: invokestatic  #318                // Method checkDefection:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        24: astore_1
        25: aload_1
        26: ifnull        58
        29: aload_0
        30: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        33: iconst_1
        34: invokevirtual #322                // Method ext/mods/gameserver/model/olympiad/Participant.setDefection:(Z)V
        37: aload_0
        38: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        41: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        44: ifnull        58
        47: aload_0
        48: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        51: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        54: aload_1
        55: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: aload_0
        59: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        62: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        65: invokestatic  #318                // Method checkDefection:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        68: astore_1
        69: aload_1
        70: ifnull        102
        73: aload_0
        74: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
        77: iconst_1
        78: invokevirtual #322                // Method ext/mods/gameserver/model/olympiad/Participant.setDefection:(Z)V
        81: aload_0
        82: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        85: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        88: ifnull        102
        91: aload_0
        92: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
        95: invokevirtual #23                 // Method ext/mods/gameserver/model/olympiad/Participant.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        98: aload_1
        99: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       102: aload_0
       103: getfield      #16                 // Field _playerOne:Lext/mods/gameserver/model/olympiad/Participant;
       106: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
       109: ifne          122
       112: aload_0
       113: getfield      #20                 // Field _playerTwo:Lext/mods/gameserver/model/olympiad/Participant;
       116: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/Participant.isDefecting:()Z
       119: ifeq          126
       122: iconst_1
       123: goto          127
       126: iconst_0
       127: ireturn
      LineNumberTable:
        line 508: 0
        line 509: 7
        line 511: 14
        line 512: 25
        line 514: 29
        line 515: 37
        line 516: 47
        line 519: 58
        line 520: 69
        line 522: 73
        line 523: 81
        line 524: 91
        line 527: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     128     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;
           25     103     1    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 43 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final void resetDamage();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #7                  // Field _damageP1:I
         5: aload_0
         6: iconst_0
         7: putfield      #13                 // Field _damageP2:I
        10: return
      LineNumberTable:
        line 533: 0
        line 534: 5
        line 535: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/olympiad/OlympiadGameNormal;

  protected static final void saveResults(ext.mods.gameserver.model.olympiad.Participant, ext.mods.gameserver.model.olympiad.Participant, int, long, long, ext.mods.gameserver.enums.OlympiadType);
    descriptor: (Lext/mods/gameserver/model/olympiad/Participant;Lext/mods/gameserver/model/olympiad/Participant;IJJLext/mods/gameserver/enums/OlympiadType;)V
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=4, locals=12, args_size=6
         0: invokestatic  #325                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore        8
         5: aload         8
         7: ldc_w         #331                // String INSERT INTO olympiad_fights (charOneId, charTwoId, charOneClass, charTwoClass, winner, start, time, classed) values(?,?,?,?,?,?,?,?)
        10: invokeinterface #333,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        15: astore        9
        17: aload         9
        19: iconst_1
        20: aload_0
        21: invokevirtual #100                // Method ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
        24: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        29: aload         9
        31: iconst_2
        32: aload_1
        33: invokevirtual #100                // Method ext/mods/gameserver/model/olympiad/Participant.getObjectId:()I
        36: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        41: aload         9
        43: iconst_3
        44: aload_0
        45: invokevirtual #345                // Method ext/mods/gameserver/model/olympiad/Participant.getBaseClass:()I
        48: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        53: aload         9
        55: iconst_4
        56: aload_1
        57: invokevirtual #345                // Method ext/mods/gameserver/model/olympiad/Participant.getBaseClass:()I
        60: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        65: aload         9
        67: iconst_5
        68: iload_2
        69: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        74: aload         9
        76: bipush        6
        78: lload_3
        79: invokeinterface #348,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        84: aload         9
        86: bipush        7
        88: lload         5
        90: invokeinterface #348,  4          // InterfaceMethod java/sql/PreparedStatement.setLong:(IJ)V
        95: aload         9
        97: bipush        8
        99: aload         7
       101: getstatic     #352                // Field ext/mods/gameserver/enums/OlympiadType.CLASSED:Lext/mods/gameserver/enums/OlympiadType;
       104: if_acmpne     111
       107: iconst_1
       108: goto          112
       111: iconst_0
       112: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
       117: aload         9
       119: invokeinterface #358,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
       124: pop
       125: aload         9
       127: ifnull        169
       130: aload         9
       132: invokeinterface #361,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       137: goto          169
       140: astore        10
       142: aload         9
       144: ifnull        166
       147: aload         9
       149: invokeinterface #361,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       154: goto          166
       157: astore        11
       159: aload         10
       161: aload         11
       163: invokevirtual #366                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload         10
       168: athrow
       169: aload         8
       171: ifnull        213
       174: aload         8
       176: invokeinterface #370,  1          // InterfaceMethod java/sql/Connection.close:()V
       181: goto          213
       184: astore        9
       186: aload         8
       188: ifnull        210
       191: aload         8
       193: invokeinterface #370,  1          // InterfaceMethod java/sql/Connection.close:()V
       198: goto          210
       201: astore        10
       203: aload         9
       205: aload         10
       207: invokevirtual #366                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       210: aload         9
       212: athrow
       213: goto          229
       216: astore        8
       218: getstatic     #371                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       221: ldc_w         #375                // String Couldn\'t save Olympiad results.
       224: aload         8
       226: invokevirtual #377                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       229: return
      Exception table:
         from    to  target type
            17   125   140   Class java/lang/Throwable
           147   154   157   Class java/lang/Throwable
             5   169   184   Class java/lang/Throwable
           191   198   201   Class java/lang/Throwable
             0   213   216   Class java/lang/Exception
      LineNumberTable:
        line 539: 0
        line 540: 5
        line 542: 17
        line 543: 29
        line 544: 41
        line 545: 53
        line 546: 65
        line 547: 74
        line 548: 84
        line 549: 95
        line 550: 117
        line 551: 125
        line 539: 140
        line 551: 169
        line 539: 184
        line 555: 213
        line 552: 216
        line 554: 218
        line 556: 229
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17     152     9    ps   Ljava/sql/PreparedStatement;
            5     208     8   con   Ljava/sql/Connection;
          218      11     8     e   Ljava/lang/Exception;
            0     230     0   one   Lext/mods/gameserver/model/olympiad/Participant;
            0     230     1   two   Lext/mods/gameserver/model/olympiad/Participant;
            0     230     2 winner   I
            0     230     3 startTime   J
            0     230     5 fightTime   J
            0     230     7  type   Lext/mods/gameserver/enums/OlympiadType;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 111
          locals = [ class ext/mods/gameserver/model/olympiad/Participant, class ext/mods/gameserver/model/olympiad/Participant, int, long, long, class ext/mods/gameserver/enums/OlympiadType, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/olympiad/Participant, class ext/mods/gameserver/model/olympiad/Participant, int, long, long, class ext/mods/gameserver/enums/OlympiadType, class java/sql/Connection, class java/sql/PreparedStatement ]
          stack = [ class java/sql/PreparedStatement, int, int ]
        frame_type = 91 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Participant, class ext/mods/gameserver/model/olympiad/Participant, int, long, long, class ext/mods/gameserver/enums/OlympiadType, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/olympiad/Participant, class ext/mods/gameserver/model/olympiad/Participant, int, long, long, class ext/mods/gameserver/enums/OlympiadType, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
}
SourceFile: "OlympiadGameNormal.java"
