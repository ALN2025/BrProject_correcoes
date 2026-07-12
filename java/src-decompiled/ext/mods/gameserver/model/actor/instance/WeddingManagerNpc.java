// Bytecode for: ext.mods.gameserver.model.actor.instance.WeddingManagerNpc
// File: ext\mods\gameserver\model\actor\instance\WeddingManagerNpc.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/WeddingManagerNpc.class
  Last modified 9 de jul de 2026; size 7506 bytes
  MD5 checksum a85f9c301fa46549efd6733a3a3ab77a
  Compiled from "WeddingManagerNpc.java"
public class ext.mods.gameserver.model.actor.instance.WeddingManagerNpc extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/actor/instance/WeddingManagerNpc
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Player.getCoupleId:()I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player
    #9 = NameAndType        #11:#12       // getCoupleId:()I
   #10 = Utf8               ext/mods/gameserver/model/actor/Player
   #11 = Utf8               getCoupleId
   #12 = Utf8               ()I
   #13 = String             #14           // html/mods/wedding/start2.htm
   #14 = Utf8               html/mods/wedding/start2.htm
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/instance/WeddingManagerNpc.sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #16 = Class              #18           // ext/mods/gameserver/model/actor/instance/WeddingManagerNpc
   #17 = NameAndType        #19:#20       // sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/WeddingManagerNpc
   #19 = Utf8               sendHtmlMessage
   #20 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #21 = Methodref          #8.#22        // ext/mods/gameserver/model/actor/Player.isUnderMarryRequest:()Z
   #22 = NameAndType        #23:#24       // isUnderMarryRequest:()Z
   #23 = Utf8               isUnderMarryRequest
   #24 = Utf8               ()Z
   #25 = String             #26           // html/mods/wedding/waitforpartner.htm
   #26 = Utf8               html/mods/wedding/waitforpartner.htm
   #27 = String             #28           // html/mods/wedding/start.htm
   #28 = Utf8               html/mods/wedding/start.htm
   #29 = String             #30           // AskWedding
   #30 = Utf8               AskWedding
   #31 = Methodref          #32.#33       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #32 = Class              #34           // java/lang/String
   #33 = NameAndType        #35:#36       // startsWith:(Ljava/lang/String;)Z
   #34 = Utf8               java/lang/String
   #35 = Utf8               startsWith
   #36 = Utf8               (Ljava/lang/String;)Z
   #37 = Class              #38           // java/util/StringTokenizer
   #38 = Utf8               java/util/StringTokenizer
   #39 = Methodref          #37.#40       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #40 = NameAndType        #5:#41        // "<init>":(Ljava/lang/String;)V
   #41 = Utf8               (Ljava/lang/String;)V
   #42 = Methodref          #37.#43       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #43 = NameAndType        #44:#45       // nextToken:()Ljava/lang/String;
   #44 = Utf8               nextToken
   #45 = Utf8               ()Ljava/lang/String;
   #46 = Methodref          #37.#47       // java/util/StringTokenizer.hasMoreTokens:()Z
   #47 = NameAndType        #48:#24       // hasMoreTokens:()Z
   #48 = Utf8               hasMoreTokens
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #50 = Class              #52           // ext/mods/gameserver/model/World
   #51 = NameAndType        #53:#54       // getInstance:()Lext/mods/gameserver/model/World;
   #52 = Utf8               ext/mods/gameserver/model/World
   #53 = Utf8               getInstance
   #54 = Utf8               ()Lext/mods/gameserver/model/World;
   #55 = Methodref          #50.#56       // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #56 = NameAndType        #57:#58       // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #57 = Utf8               getPlayer
   #58 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
   #59 = String             #60           // html/mods/wedding/notfound.htm
   #60 = Utf8               html/mods/wedding/notfound.htm
   #61 = Methodref          #16.#62       // ext/mods/gameserver/model/actor/instance/WeddingManagerNpc.weddingConditions:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #62 = NameAndType        #63:#64       // weddingConditions:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #63 = Utf8               weddingConditions
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #65 = Methodref          #8.#66        // ext/mods/gameserver/model/actor/Player.setUnderMarryRequest:(Z)V
   #66 = NameAndType        #67:#68       // setUnderMarryRequest:(Z)V
   #67 = Utf8               setUnderMarryRequest
   #68 = Utf8               (Z)V
   #69 = Methodref          #8.#70        // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #70 = NameAndType        #71:#12       // getObjectId:()I
   #71 = Utf8               getObjectId
   #72 = Methodref          #8.#73        // ext/mods/gameserver/model/actor/Player.setRequesterId:(I)V
   #73 = NameAndType        #74:#75       // setRequesterId:(I)V
   #74 = Utf8               setRequesterId
   #75 = Utf8               (I)V
   #76 = Class              #77           // ext/mods/gameserver/network/serverpackets/ConfirmDlg
   #77 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
   #78 = Methodref          #76.#79       // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
   #79 = NameAndType        #5:#75        // "<init>":(I)V
   #80 = Methodref          #8.#81        // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #81 = NameAndType        #82:#45       // getName:()Ljava/lang/String;
   #82 = Utf8               getName
   #83 = InvokeDynamic      #0:#84        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #84 = NameAndType        #85:#86       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #85 = Utf8               makeConcatWithConstants
   #86 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #87 = Methodref          #76.#88       // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
   #88 = NameAndType        #89:#90       // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
   #89 = Utf8               addString
   #90 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
   #91 = Methodref          #8.#92        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = NameAndType        #93:#94       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #93 = Utf8               sendPacket
   #94 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = String             #96           // Divorce
   #96 = Utf8               Divorce
   #97 = Methodref          #98.#99       // ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
   #98 = Class              #100          // ext/mods/gameserver/data/manager/CoupleManager
   #99 = NameAndType        #53:#101      // getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
  #100 = Utf8               ext/mods/gameserver/data/manager/CoupleManager
  #101 = Utf8               ()Lext/mods/gameserver/data/manager/CoupleManager;
  #102 = Methodref          #98.#103      // ext/mods/gameserver/data/manager/CoupleManager.deleteCouple:(I)V
  #103 = NameAndType        #104:#75      // deleteCouple:(I)V
  #104 = Utf8               deleteCouple
  #105 = String             #106          // GoToLove
  #106 = Utf8               GoToLove
  #107 = Methodref          #98.#108      // ext/mods/gameserver/data/manager/CoupleManager.getPartnerId:(II)I
  #108 = NameAndType        #109:#110     // getPartnerId:(II)I
  #109 = Utf8               getPartnerId
  #110 = Utf8               (II)I
  #111 = Class              #112          // java/lang/Object
  #112 = Utf8               java/lang/Object
  #113 = Methodref          #8.#114       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #114 = NameAndType        #115:#116     // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
  #115 = Utf8               getSysString
  #116 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
  #117 = Methodref          #8.#118       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #118 = NameAndType        #119:#41      // sendMessage:(Ljava/lang/String;)V
  #119 = Utf8               sendMessage
  #120 = Methodref          #50.#121      // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #121 = NameAndType        #57:#122      // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
  #122 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
  #123 = Fieldref           #124.#125     // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #124 = Class              #126          // ext/mods/gameserver/enums/ZoneId
  #125 = NameAndType        #127:#128     // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
  #126 = Utf8               ext/mods/gameserver/enums/ZoneId
  #127 = Utf8               NO_SUMMON_FRIEND
  #128 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #129 = Methodref          #8.#130       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #130 = NameAndType        #131:#132     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #131 = Utf8               isInsideZone
  #132 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #133 = Methodref          #8.#134       // ext/mods/gameserver/model/actor/Player.isInJail:()Z
  #134 = NameAndType        #135:#24      // isInJail:()Z
  #135 = Utf8               isInJail
  #136 = Methodref          #8.#137       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #137 = NameAndType        #138:#24      // isInOlympiadMode:()Z
  #138 = Utf8               isInOlympiadMode
  #139 = Methodref          #8.#140       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #140 = NameAndType        #141:#24      // isInDuel:()Z
  #141 = Utf8               isInDuel
  #142 = Methodref          #8.#143       // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
  #143 = NameAndType        #144:#24      // isFestivalParticipant:()Z
  #144 = Utf8               isFestivalParticipant
  #145 = Methodref          #8.#146       // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #146 = NameAndType        #147:#24      // isInObserverMode:()Z
  #147 = Utf8               isInObserverMode
  #148 = Methodref          #8.#149       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #149 = NameAndType        #150:#151     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #150 = Utf8               getClan
  #151 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #152 = Methodref          #153.#154     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #153 = Class              #155          // ext/mods/gameserver/data/manager/CastleManager
  #154 = NameAndType        #53:#156      // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #155 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #156 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #157 = Methodref          #153.#158     // ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #158 = NameAndType        #159:#160     // getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #159 = Utf8               getCastleByOwner
  #160 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
  #161 = Methodref          #162.#163     // ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #162 = Class              #164          // ext/mods/gameserver/model/residence/castle/Castle
  #163 = NameAndType        #165:#166     // getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
  #164 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #165 = Utf8               getSiege
  #166 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Siege;
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
  #168 = Class              #170          // ext/mods/gameserver/model/residence/castle/Siege
  #169 = NameAndType        #171:#24      // isInProgress:()Z
  #170 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #171 = Utf8               isInProgress
  #172 = Methodref          #8.#173       // ext/mods/gameserver/model/actor/Player.getX:()I
  #173 = NameAndType        #174:#12      // getX:()I
  #174 = Utf8               getX
  #175 = Methodref          #8.#176       // ext/mods/gameserver/model/actor/Player.getY:()I
  #176 = NameAndType        #177:#12      // getY:()I
  #177 = Utf8               getY
  #178 = Methodref          #8.#179       // ext/mods/gameserver/model/actor/Player.getZ:()I
  #179 = NameAndType        #180:#12      // getZ:()I
  #180 = Utf8               getZ
  #181 = Methodref          #8.#182       // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #182 = NameAndType        #183:#184     // teleportTo:(IIII)Z
  #183 = Utf8               teleportTo
  #184 = Utf8               (IIII)Z
  #185 = String             #186          // html/mods/wedding/error_wrongtarget.htm
  #186 = Utf8               html/mods/wedding/error_wrongtarget.htm
  #187 = Fieldref           #188.#189     // ext/mods/Config.WEDDING_SAMESEX:Z
  #188 = Class              #190          // ext/mods/Config
  #189 = NameAndType        #191:#192     // WEDDING_SAMESEX:Z
  #190 = Utf8               ext/mods/Config
  #191 = Utf8               WEDDING_SAMESEX
  #192 = Utf8               Z
  #193 = Methodref          #8.#194       // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #194 = NameAndType        #195:#196     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #195 = Utf8               getAppearance
  #196 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #197 = Methodref          #198.#199     // ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #198 = Class              #200          // ext/mods/gameserver/model/actor/container/player/Appearance
  #199 = NameAndType        #201:#202     // getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #200 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #201 = Utf8               getSex
  #202 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
  #203 = String             #204          // html/mods/wedding/error_sex.htm
  #204 = Utf8               html/mods/wedding/error_sex.htm
  #205 = Methodref          #206.#207     // ext/mods/gameserver/data/manager/RelationManager.getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #206 = Class              #208          // ext/mods/gameserver/data/manager/RelationManager
  #207 = NameAndType        #53:#209      // getInstance:()Lext/mods/gameserver/data/manager/RelationManager;
  #208 = Utf8               ext/mods/gameserver/data/manager/RelationManager
  #209 = Utf8               ()Lext/mods/gameserver/data/manager/RelationManager;
  #210 = Methodref          #206.#211     // ext/mods/gameserver/data/manager/RelationManager.areFriends:(II)Z
  #211 = NameAndType        #212:#213     // areFriends:(II)Z
  #212 = Utf8               areFriends
  #213 = Utf8               (II)Z
  #214 = String             #215          // html/mods/wedding/error_friendlist.htm
  #215 = Utf8               html/mods/wedding/error_friendlist.htm
  #216 = String             #217          // html/mods/wedding/error_alreadymarried.htm
  #217 = Utf8               html/mods/wedding/error_alreadymarried.htm
  #218 = Fieldref           #188.#219     // ext/mods/Config.WEDDING_FORMALWEAR:Z
  #219 = NameAndType        #220:#192     // WEDDING_FORMALWEAR:Z
  #220 = Utf8               WEDDING_FORMALWEAR
  #221 = Methodref          #8.#222       // ext/mods/gameserver/model/actor/Player.isWearingFormalWear:()Z
  #222 = NameAndType        #223:#24      // isWearingFormalWear:()Z
  #223 = Utf8               isWearingFormalWear
  #224 = String             #225          // html/mods/wedding/error_noformal.htm
  #225 = Utf8               html/mods/wedding/error_noformal.htm
  #226 = Methodref          #8.#227       // ext/mods/gameserver/model/actor/Player.getAdena:()I
  #227 = NameAndType        #228:#12      // getAdena:()I
  #228 = Utf8               getAdena
  #229 = Fieldref           #188.#230     // ext/mods/Config.WEDDING_PRICE:I
  #230 = NameAndType        #231:#232     // WEDDING_PRICE:I
  #231 = Utf8               WEDDING_PRICE
  #232 = Utf8               I
  #233 = String             #234          // html/mods/wedding/error_adena.htm
  #234 = Utf8               html/mods/wedding/error_adena.htm
  #235 = Methodref          #8.#236       // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #236 = NameAndType        #237:#238     // reduceAdena:(IZ)Z
  #237 = Utf8               reduceAdena
  #238 = Utf8               (IZ)Z
  #239 = Class              #240          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #240 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #241 = Methodref          #239.#242     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #242 = NameAndType        #5:#243       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #243 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #244 = Methodref          #8.#245       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #245 = NameAndType        #246:#94      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #246 = Utf8               broadcastPacket
  #247 = Methodref          #8.#248       // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #248 = NameAndType        #249:#250     // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #249 = Utf8               getMissions
  #250 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
  #251 = Fieldref           #252.#253     // ext/mods/gameserver/enums/actors/MissionType.MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
  #252 = Class              #254          // ext/mods/gameserver/enums/actors/MissionType
  #253 = NameAndType        #255:#256     // MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
  #254 = Utf8               ext/mods/gameserver/enums/actors/MissionType
  #255 = Utf8               MARRIED
  #256 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
  #257 = Methodref          #258.#259     // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #258 = Class              #260          // ext/mods/gameserver/model/actor/container/player/MissionList
  #259 = NameAndType        #261:#262     // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
  #260 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
  #261 = Utf8               update
  #262 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
  #263 = Methodref          #50.#264      // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #264 = NameAndType        #265:#41      // announceToOnlinePlayers:(Ljava/lang/String;)V
  #265 = Utf8               announceToOnlinePlayers
  #266 = Class              #267          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #267 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #268 = Methodref          #16.#70       // ext/mods/gameserver/model/actor/instance/WeddingManagerNpc.getObjectId:()I
  #269 = Methodref          #266.#79      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #270 = Methodref          #8.#271       // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #271 = NameAndType        #272:#273     // getLocale:()Ljava/util/Locale;
  #272 = Utf8               getLocale
  #273 = Utf8               ()Ljava/util/Locale;
  #274 = Methodref          #266.#275     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #275 = NameAndType        #276:#277     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #276 = Utf8               setFile
  #277 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #278 = String             #279          // %objectId%
  #279 = Utf8               %objectId%
  #280 = Methodref          #266.#281     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #281 = NameAndType        #282:#283     // replace:(Ljava/lang/String;I)V
  #282 = Utf8               replace
  #283 = Utf8               (Ljava/lang/String;I)V
  #284 = String             #285          // %adenaCost%
  #285 = Utf8               %adenaCost%
  #286 = Methodref          #287.#288     // ext/mods/commons/lang/StringUtil.formatNumber:(J)Ljava/lang/String;
  #287 = Class              #289          // ext/mods/commons/lang/StringUtil
  #288 = NameAndType        #290:#291     // formatNumber:(J)Ljava/lang/String;
  #289 = Utf8               ext/mods/commons/lang/StringUtil
  #290 = Utf8               formatNumber
  #291 = Utf8               (J)Ljava/lang/String;
  #292 = Methodref          #266.#293     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #293 = NameAndType        #282:#294     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #294 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #295 = String             #296          // %needOrNot%
  #296 = Utf8               %needOrNot%
  #297 = Utf8               Code
  #298 = Utf8               LineNumberTable
  #299 = Utf8               LocalVariableTable
  #300 = Utf8               this
  #301 = Utf8               Lext/mods/gameserver/model/actor/instance/WeddingManagerNpc;
  #302 = Utf8               objectId
  #303 = Utf8               template
  #304 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #305 = Utf8               onInteract
  #306 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #307 = Utf8               player
  #308 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #309 = Utf8               StackMapTable
  #310 = Utf8               onBypassFeedback
  #311 = Utf8               partner
  #312 = Utf8               st
  #313 = Utf8               Ljava/util/StringTokenizer;
  #314 = Utf8               partnerId
  #315 = Utf8               command
  #316 = Utf8               Ljava/lang/String;
  #317 = Utf8               requester
  #318 = Utf8               justMarried
  #319 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
  #320 = Utf8               file
  #321 = Utf8               html
  #322 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #323 = Utf8               SourceFile
  #324 = Utf8               WeddingManagerNpc.java
  #325 = Utf8               BootstrapMethods
  #326 = String             #327          // \u0001 asked you to marry. Do you want to start a new relationship ?
  #327 = Utf8               \u0001 asked you to marry. Do you want to start a new relationship ?
  #328 = MethodHandle       6:#329        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #329 = Methodref          #330.#331     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #330 = Class              #332          // java/lang/invoke/StringConcatFactory
  #331 = NameAndType        #85:#333      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #332 = Utf8               java/lang/invoke/StringConcatFactory
  #333 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #334 = Utf8               InnerClasses
  #335 = Class              #336          // java/lang/invoke/MethodHandles$Lookup
  #336 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #337 = Class              #338          // java/lang/invoke/MethodHandles
  #338 = Utf8               java/lang/invoke/MethodHandles
  #339 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.WeddingManagerNpc(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 41: 0
        line 42: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/WeddingManagerNpc;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getCoupleId:()I
         4: ifle          17
         7: aload_0
         8: aload_1
         9: ldc           #13                 // String html/mods/wedding/start2.htm
        11: invokevirtual #15                 // Method sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        14: goto          41
        17: aload_1
        18: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.isUnderMarryRequest:()Z
        21: ifeq          34
        24: aload_0
        25: aload_1
        26: ldc           #25                 // String html/mods/wedding/waitforpartner.htm
        28: invokevirtual #15                 // Method sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        31: goto          41
        34: aload_0
        35: aload_1
        36: ldc           #27                 // String html/mods/wedding/start.htm
        38: invokevirtual #15                 // Method sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        41: return
      LineNumberTable:
        line 47: 0
        line 48: 7
        line 49: 17
        line 50: 24
        line 52: 34
        line 53: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/actor/instance/WeddingManagerNpc;
            0      42     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 16 /* same */
        frame_type = 6 /* same */

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=3
         0: aload_2
         1: ldc           #29                 // String AskWedding
         3: invokevirtual #31                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          126
         9: new           #37                 // class java/util/StringTokenizer
        12: dup
        13: aload_2
        14: invokespecial #39                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
        17: astore_3
        18: aload_3
        19: invokevirtual #42                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        22: pop
        23: aload_3
        24: invokevirtual #46                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        27: ifeq          116
        30: invokestatic  #49                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        33: aload_3
        34: invokevirtual #42                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        37: invokevirtual #55                 // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
        40: astore        4
        42: aload         4
        44: ifnonnull     55
        47: aload_0
        48: aload_1
        49: ldc           #59                 // String html/mods/wedding/notfound.htm
        51: invokevirtual #15                 // Method sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        54: return
        55: aload_0
        56: aload_1
        57: aload         4
        59: invokevirtual #61                 // Method weddingConditions:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
        62: ifne          66
        65: return
        66: aload_1
        67: iconst_1
        68: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.setUnderMarryRequest:(Z)V
        71: aload         4
        73: iconst_1
        74: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.setUnderMarryRequest:(Z)V
        77: aload         4
        79: aload_1
        80: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        83: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.setRequesterId:(I)V
        86: aload         4
        88: new           #76                 // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
        91: dup
        92: sipush        1983
        95: invokespecial #78                 // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(I)V
        98: aload_1
        99: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       102: invokedynamic #83,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       107: invokevirtual #87                 // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       110: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       113: goto          123
       116: aload_0
       117: aload_1
       118: ldc           #59                 // String html/mods/wedding/notfound.htm
       120: invokevirtual #15                 // Method sendHtmlMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       123: goto          369
       126: aload_2
       127: ldc           #95                 // String Divorce
       129: invokevirtual #31                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       132: ifeq          148
       135: invokestatic  #97                 // Method ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
       138: aload_1
       139: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getCoupleId:()I
       142: invokevirtual #102                // Method ext/mods/gameserver/data/manager/CoupleManager.deleteCouple:(I)V
       145: goto          369
       148: aload_2
       149: ldc           #105                // String GoToLove
       151: invokevirtual #31                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       154: ifeq          369
       157: invokestatic  #97                 // Method ext/mods/gameserver/data/manager/CoupleManager.getInstance:()Lext/mods/gameserver/data/manager/CoupleManager;
       160: aload_1
       161: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Player.getCoupleId:()I
       164: aload_1
       165: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       168: invokevirtual #107                // Method ext/mods/gameserver/data/manager/CoupleManager.getPartnerId:(II)I
       171: istore_3
       172: iload_3
       173: ifne          192
       176: aload_1
       177: aload_1
       178: sipush        10061
       181: iconst_0
       182: anewarray     #111                // class java/lang/Object
       185: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       188: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       191: return
       192: invokestatic  #49                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       195: iload_3
       196: invokevirtual #120                // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
       199: astore        4
       201: aload         4
       203: ifnonnull     222
       206: aload_1
       207: aload_1
       208: sipush        10062
       211: iconst_0
       212: anewarray     #111                // class java/lang/Object
       215: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       218: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       221: return
       222: aload         4
       224: getstatic     #123                // Field ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
       227: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       230: ifne          273
       233: aload         4
       235: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
       238: ifne          273
       241: aload         4
       243: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       246: ifne          273
       249: aload         4
       251: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       254: ifne          273
       257: aload         4
       259: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       262: ifne          273
       265: aload         4
       267: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       270: ifeq          289
       273: aload_1
       274: aload_1
       275: sipush        10063
       278: iconst_0
       279: anewarray     #111                // class java/lang/Object
       282: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       285: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       288: return
       289: aload         4
       291: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       294: ifnull        347
       297: invokestatic  #152                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       300: aload         4
       302: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       305: invokevirtual #157                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
       308: ifnull        347
       311: invokestatic  #152                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       314: aload         4
       316: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       319: invokevirtual #157                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
       322: invokevirtual #161                // Method ext/mods/gameserver/model/residence/castle/Castle.getSiege:()Lext/mods/gameserver/model/residence/castle/Siege;
       325: invokevirtual #167                // Method ext/mods/gameserver/model/residence/castle/Siege.isInProgress:()Z
       328: ifeq          347
       331: aload_1
       332: aload_1
       333: sipush        10064
       336: iconst_0
       337: anewarray     #111                // class java/lang/Object
       340: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       343: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       346: return
       347: aload_1
       348: aload         4
       350: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       353: aload         4
       355: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       358: aload         4
       360: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       363: bipush        20
       365: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       368: pop
       369: return
      LineNumberTable:
        line 58: 0
        line 60: 9
        line 61: 18
        line 63: 23
        line 65: 30
        line 66: 42
        line 68: 47
        line 69: 54
        line 72: 55
        line 73: 65
        line 75: 66
        line 76: 71
        line 78: 77
        line 79: 86
        line 80: 113
        line 82: 116
        line 83: 123
        line 84: 126
        line 85: 135
        line 86: 148
        line 88: 157
        line 89: 172
        line 91: 176
        line 92: 191
        line 95: 192
        line 96: 201
        line 98: 206
        line 99: 221
        line 102: 222
        line 104: 273
        line 105: 288
        line 108: 289
        line 110: 331
        line 111: 346
        line 114: 347
        line 116: 369
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      71     4 partner   Lext/mods/gameserver/model/actor/Player;
           18     105     3    st   Ljava/util/StringTokenizer;
          172     197     3 partnerId   I
          201     168     4 partner   Lext/mods/gameserver/model/actor/Player;
            0     370     0  this   Lext/mods/gameserver/model/actor/instance/WeddingManagerNpc;
            0     370     1 player   Lext/mods/gameserver/model/actor/Player;
            0     370     2 command   Ljava/lang/String;
      StackMapTable: number_of_entries = 12
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class java/util/StringTokenizer, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 49
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 2 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 50 /* same */
        frame_type = 15 /* same */
        frame_type = 57 /* same */
        frame_type = 249 /* chop */
          offset_delta = 21

  public static void justMarried(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=9, locals=2, args_size=2
         0: aload_0
         1: iconst_0
         2: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.setUnderMarryRequest:(Z)V
         5: aload_1
         6: iconst_0
         7: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.setUnderMarryRequest:(Z)V
        10: aload_0
        11: getstatic     #229                // Field ext/mods/Config.WEDDING_PRICE:I
        14: iconst_1
        15: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
        18: pop
        19: aload_1
        20: getstatic     #229                // Field ext/mods/Config.WEDDING_PRICE:I
        23: iconst_1
        24: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
        27: pop
        28: aload_0
        29: aload_0
        30: sipush        10065
        33: iconst_1
        34: anewarray     #111                // class java/lang/Object
        37: dup
        38: iconst_0
        39: aload_1
        40: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        43: aastore
        44: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        47: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        50: aload_1
        51: aload_1
        52: sipush        10066
        55: iconst_1
        56: anewarray     #111                // class java/lang/Object
        59: dup
        60: iconst_0
        61: aload_0
        62: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        65: aastore
        66: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        69: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        72: aload_0
        73: new           #239                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        76: dup
        77: aload_0
        78: aload_0
        79: sipush        2230
        82: iconst_1
        83: iconst_1
        84: iconst_0
        85: invokespecial #241                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
        88: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: aload_1
        92: new           #239                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        95: dup
        96: aload_1
        97: aload_1
        98: sipush        2230
       101: iconst_1
       102: iconst_1
       103: iconst_0
       104: invokespecial #241                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       107: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       110: aload_0
       111: new           #239                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       114: dup
       115: aload_0
       116: aload_0
       117: sipush        2025
       120: iconst_1
       121: iconst_1
       122: iconst_0
       123: invokespecial #241                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       126: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       129: aload_1
       130: new           #239                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       133: dup
       134: aload_1
       135: aload_1
       136: sipush        2025
       139: iconst_1
       140: iconst_1
       141: iconst_0
       142: invokespecial #241                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       145: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       148: aload_0
       149: invokevirtual #247                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       152: getstatic     #251                // Field ext/mods/gameserver/enums/actors/MissionType.MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
       155: invokevirtual #257                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       158: aload_1
       159: invokevirtual #247                // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
       162: getstatic     #251                // Field ext/mods/gameserver/enums/actors/MissionType.MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
       165: invokevirtual #257                // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
       168: aload_0
       169: sipush        10067
       172: iconst_2
       173: anewarray     #111                // class java/lang/Object
       176: dup
       177: iconst_0
       178: aload_0
       179: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       182: aastore
       183: dup
       184: iconst_1
       185: aload_1
       186: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       189: aastore
       190: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       193: invokestatic  #263                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
       196: return
      LineNumberTable:
        line 161: 0
        line 162: 5
        line 164: 10
        line 165: 19
        line 167: 28
        line 168: 50
        line 170: 72
        line 171: 91
        line 173: 110
        line 174: 129
        line 176: 148
        line 177: 158
        line 179: 168
        line 180: 196
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     197     0 requester   Lext/mods/gameserver/model/actor/Player;
            0     197     1 partner   Lext/mods/gameserver/model/actor/Player;
}
SourceFile: "WeddingManagerNpc.java"
BootstrapMethods:
  0: #328 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #326 \u0001 asked you to marry. Do you want to start a new relationship ?
InnerClasses:
  public static final #339= #335 of #337; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
