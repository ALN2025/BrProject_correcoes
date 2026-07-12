// Bytecode for: ext.mods.gameserver.communitybbs.CustomCommunityBoard
// File: ext\mods\gameserver\communitybbs\CustomCommunityBoard.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/communitybbs/CustomCommunityBoard.class
  Last modified 9 de jul de 2026; size 5605 bytes
  MD5 checksum ff7ce373d98720e9af6c10fa85359ba9
  Compiled from "CustomCommunityBoard.java"
public class ext.mods.gameserver.communitybbs.CustomCommunityBoard
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/communitybbs/CustomCommunityBoard
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 4, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ENABLE_CUSTOM_BBS:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ENABLE_CUSTOM_BBS:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ENABLE_CUSTOM_BBS
   #12 = Utf8               Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/communitybbs/CustomCommunityBoard.LOGGER:Lext/mods/commons/logging/CLogger;
   #14 = Class              #16           // ext/mods/gameserver/communitybbs/CustomCommunityBoard
   #15 = NameAndType        #17:#18       // LOGGER:Lext/mods/commons/logging/CLogger;
   #16 = Utf8               ext/mods/gameserver/communitybbs/CustomCommunityBoard
   #17 = Utf8               LOGGER
   #18 = Utf8               Lext/mods/commons/logging/CLogger;
   #19 = String             #20           // Loaded custom community board.
   #20 = Utf8               Loaded custom community board.
   #21 = Methodref          #22.#23       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #22 = Class              #24           // ext/mods/commons/logging/CLogger
   #23 = NameAndType        #25:#26       // info:(Ljava/lang/Object;)V
   #24 = Utf8               ext/mods/commons/logging/CLogger
   #25 = Utf8               info
   #26 = Utf8               (Ljava/lang/Object;)V
   #27 = Methodref          #28.#29       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #28 = Class              #30           // ext/mods/gameserver/network/GameClient
   #29 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = Utf8               ext/mods/gameserver/network/GameClient
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Fieldref           #34.#35       // ext/mods/gameserver/network/SystemMessageId.CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
   #34 = Class              #36           // ext/mods/gameserver/network/SystemMessageId
   #35 = NameAndType        #37:#38       // CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
   #36 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #37 = Utf8               CB_OFFLINE
   #38 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #40 = Class              #42           // ext/mods/gameserver/model/actor/Player
   #41 = NameAndType        #43:#44       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #42 = Utf8               ext/mods/gameserver/model/actor/Player
   #43 = Utf8               sendPacket
   #44 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #45 = Methodref          #40.#46       // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #46 = NameAndType        #47:#48       // isGM:()Z
   #47 = Utf8               isGM
   #48 = Utf8               ()Z
   #49 = Methodref          #40.#50       // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #50 = NameAndType        #51:#52       // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #51 = Utf8               getCast
   #52 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
   #54 = Class              #56           // ext/mods/gameserver/model/actor/cast/PlayerCast
   #55 = NameAndType        #57:#48       // isCastingNow:()Z
   #56 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #57 = Utf8               isCastingNow
   #58 = Methodref          #40.#59       // ext/mods/gameserver/model/actor/Player.isInJail:()Z
   #59 = NameAndType        #60:#48       // isInJail:()Z
   #60 = Utf8               isInJail
   #61 = Methodref          #40.#62       // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
   #62 = NameAndType        #63:#48       // isInCombat:()Z
   #63 = Utf8               isInCombat
   #64 = Methodref          #40.#65       // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #65 = NameAndType        #66:#48       // isInDuel:()Z
   #66 = Utf8               isInDuel
   #67 = Methodref          #40.#68       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #68 = NameAndType        #69:#48       // isInOlympiadMode:()Z
   #69 = Utf8               isInOlympiadMode
   #70 = Fieldref           #71.#72       // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #71 = Class              #73           // ext/mods/gameserver/enums/ZoneId
   #72 = NameAndType        #74:#75       // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #73 = Utf8               ext/mods/gameserver/enums/ZoneId
   #74 = Utf8               SIEGE
   #75 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #76 = Methodref          #40.#77       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #77 = NameAndType        #78:#79       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #78 = Utf8               isInsideZone
   #79 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #80 = Fieldref           #71.#81       // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
   #81 = NameAndType        #82:#75       // PVP:Lext/mods/gameserver/enums/ZoneId;
   #82 = Utf8               PVP
   #83 = Methodref          #40.#84       // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
   #84 = NameAndType        #85:#86       // getPvpFlag:()B
   #85 = Utf8               getPvpFlag
   #86 = Utf8               ()B
   #87 = Methodref          #40.#88       // ext/mods/gameserver/model/actor/Player.getKarma:()I
   #88 = NameAndType        #89:#90       // getKarma:()I
   #89 = Utf8               getKarma
   #90 = Utf8               ()I
   #91 = Methodref          #40.#92       // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
   #92 = NameAndType        #93:#48       // isAlikeDead:()Z
   #93 = Utf8               isAlikeDead
   #94 = String             #95           // You can\'t use the Community Board right now.
   #95 = Utf8               You can\'t use the Community Board right now.
   #96 = Methodref          #40.#97       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #97 = NameAndType        #98:#99       // sendMessage:(Ljava/lang/String;)V
   #98 = Utf8               sendMessage
   #99 = Utf8               (Ljava/lang/String;)V
  #100 = String             #101          // _bbsgetfav_add
  #101 = Utf8               _bbsgetfav_add
  #102 = Methodref          #103.#104     // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #103 = Class              #105          // java/lang/String
  #104 = NameAndType        #106:#107     // startsWith:(Ljava/lang/String;)Z
  #105 = Utf8               java/lang/String
  #106 = Utf8               startsWith
  #107 = Utf8               (Ljava/lang/String;)Z
  #108 = Methodref          #109.#110     // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #109 = Class              #111          // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager
  #110 = NameAndType        #112:#113     // getInstance:()Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #111 = Utf8               ext/mods/gameserver/communitybbs/custom/ServiceBBSManager
  #112 = Utf8               getInstance
  #113 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
  #114 = Methodref          #109.#115     // ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #115 = NameAndType        #116:#117     // parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #116 = Utf8               parseCmd
  #117 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #118 = String             #119          // _bbshome
  #119 = Utf8               _bbshome
  #120 = Methodref          #121.#122     // ext/mods/gameserver/communitybbs/custom/IndexCBManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #121 = Class              #123          // ext/mods/gameserver/communitybbs/custom/IndexCBManager
  #122 = NameAndType        #112:#124     // getInstance:()Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #123 = Utf8               ext/mods/gameserver/communitybbs/custom/IndexCBManager
  #124 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
  #125 = Methodref          #121.#115     // ext/mods/gameserver/communitybbs/custom/IndexCBManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #126 = String             #127          // _bbsgetfav
  #127 = Utf8               _bbsgetfav
  #128 = Methodref          #129.#130     // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #129 = Class              #131          // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager
  #130 = NameAndType        #112:#132     // getInstance:()Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #131 = Utf8               ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager
  #132 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
  #133 = Methodref          #129.#115     // ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #134 = String             #135          // _bbsloc
  #135 = Utf8               _bbsloc
  #136 = Methodref          #137.#138     // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #137 = Class              #139          // ext/mods/gameserver/communitybbs/custom/BuffBBSManager
  #138 = NameAndType        #112:#140     // getInstance:()Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #139 = Utf8               ext/mods/gameserver/communitybbs/custom/BuffBBSManager
  #140 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
  #141 = Methodref          #137.#115     // ext/mods/gameserver/communitybbs/custom/BuffBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #142 = String             #143          // _bbsclan
  #143 = Utf8               _bbsclan
  #144 = Methodref          #145.#146     // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #145 = Class              #147          // ext/mods/gameserver/communitybbs/custom/RankingBBSManager
  #146 = NameAndType        #112:#148     // getInstance:()Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #147 = Utf8               ext/mods/gameserver/communitybbs/custom/RankingBBSManager
  #148 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
  #149 = Methodref          #145.#115     // ext/mods/gameserver/communitybbs/custom/RankingBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #150 = String             #151          // _bbsmemo
  #151 = Utf8               _bbsmemo
  #152 = Methodref          #153.#154     // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #153 = Class              #155          // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager
  #154 = NameAndType        #112:#156     // getInstance:()Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #155 = Utf8               ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager
  #156 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
  #157 = Methodref          #153.#115     // ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #158 = String             #159          // _maillist_0_1_0_
  #159 = Utf8               _maillist_0_1_0_
  #160 = Methodref          #161.#162     // ext/mods/gameserver/communitybbs/custom/ShopBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #161 = Class              #163          // ext/mods/gameserver/communitybbs/custom/ShopBBSManager
  #162 = NameAndType        #112:#164     // getInstance:()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #163 = Utf8               ext/mods/gameserver/communitybbs/custom/ShopBBSManager
  #164 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
  #165 = Methodref          #161.#115     // ext/mods/gameserver/communitybbs/custom/ShopBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #166 = String             #167          // _bbsmultisell;
  #167 = Utf8               _bbsmultisell;
  #168 = Class              #169          // java/util/StringTokenizer
  #169 = Utf8               java/util/StringTokenizer
  #170 = String             #171          // ;
  #171 = Utf8               ;
  #172 = Methodref          #168.#173     // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #173 = NameAndType        #5:#174       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
  #174 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #175 = Methodref          #168.#176     // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
  #176 = NameAndType        #177:#178     // nextToken:()Ljava/lang/String;
  #177 = Utf8               nextToken
  #178 = Utf8               ()Ljava/lang/String;
  #179 = InvokeDynamic      #0:#180       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #180 = NameAndType        #181:#182     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #181 = Utf8               makeConcatWithConstants
  #182 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #183 = Methodref          #184.#185     // ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #184 = Class              #186          // ext/mods/gameserver/data/xml/MultisellData
  #185 = NameAndType        #112:#187     // getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
  #186 = Utf8               ext/mods/gameserver/data/xml/MultisellData
  #187 = Utf8               ()Lext/mods/gameserver/data/xml/MultisellData;
  #188 = InvokeDynamic      #1:#180       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #189 = Methodref          #184.#190     // ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #190 = NameAndType        #191:#192     // separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #191 = Utf8               separateAndSendCb
  #192 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
  #193 = String             #194          // _bbsexcmultisell;
  #194 = Utf8               _bbsexcmultisell;
  #195 = String             #196          // _friend
  #196 = Utf8               _friend
  #197 = Methodref          #198.#199     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
  #198 = Class              #200          // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager
  #199 = NameAndType        #112:#201     // getInstance:()Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
  #200 = Utf8               ext/mods/gameserver/communitybbs/custom/AuctionBBSManager
  #201 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
  #202 = Methodref          #198.#115     // ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #203 = String             #204          // _cbmission
  #204 = Utf8               _cbmission
  #205 = Methodref          #206.#207     // ext/mods/gameserver/communitybbs/custom/MissionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #206 = Class              #208          // ext/mods/gameserver/communitybbs/custom/MissionBBSManager
  #207 = NameAndType        #112:#209     // getInstance:()Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #208 = Utf8               ext/mods/gameserver/communitybbs/custom/MissionBBSManager
  #209 = Utf8               ()Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
  #210 = Methodref          #206.#115     // ext/mods/gameserver/communitybbs/custom/MissionBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #211 = InvokeDynamic      #2:#180       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #212 = Methodref          #213.#214     // ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #213 = Class              #215          // ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  #214 = NameAndType        #216:#117     // separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #215 = Utf8               ext/mods/gameserver/communitybbs/manager/BaseBBSManager
  #216 = Utf8               separateAndSend
  #217 = Fieldref           #218.#219     // ext/mods/gameserver/communitybbs/CustomCommunityBoard$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
  #218 = Class              #220          // ext/mods/gameserver/communitybbs/CustomCommunityBoard$SingletonHolder
  #219 = NameAndType        #221:#222     // INSTANCE:Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
  #220 = Utf8               ext/mods/gameserver/communitybbs/CustomCommunityBoard$SingletonHolder
  #221 = Utf8               INSTANCE
  #222 = Utf8               Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
  #223 = Methodref          #224.#225     // java/lang/Class.getName:()Ljava/lang/String;
  #224 = Class              #226          // java/lang/Class
  #225 = NameAndType        #227:#178     // getName:()Ljava/lang/String;
  #226 = Utf8               java/lang/Class
  #227 = Utf8               getName
  #228 = Methodref          #22.#229      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #229 = NameAndType        #5:#99        // "<init>":(Ljava/lang/String;)V
  #230 = Utf8               Code
  #231 = Utf8               LineNumberTable
  #232 = Utf8               LocalVariableTable
  #233 = Utf8               this
  #234 = Utf8               StackMapTable
  #235 = Utf8               handleCommands
  #236 = Utf8               (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
  #237 = Utf8               st
  #238 = Utf8               Ljava/util/StringTokenizer;
  #239 = Utf8               client
  #240 = Utf8               Lext/mods/gameserver/network/GameClient;
  #241 = Utf8               command
  #242 = Utf8               Ljava/lang/String;
  #243 = Utf8               player
  #244 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #245 = Utf8               ()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
  #246 = Utf8               <clinit>
  #247 = Utf8               SourceFile
  #248 = Utf8               CustomCommunityBoard.java
  #249 = Utf8               NestMembers
  #250 = Utf8               BootstrapMethods
  #251 = String             #252          // _maillist_0_1_0_;\u0001
  #252 = Utf8               _maillist_0_1_0_;\u0001
  #253 = String             #254          // \u0001
  #254 = Utf8               \u0001
  #255 = String             #256          // <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  #256 = Utf8               <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
  #257 = MethodHandle       6:#258        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #258 = Methodref          #259.#260     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #259 = Class              #261          // java/lang/invoke/StringConcatFactory
  #260 = NameAndType        #181:#262     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #261 = Utf8               java/lang/invoke/StringConcatFactory
  #262 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Utf8               InnerClasses
  #264 = Utf8               SingletonHolder
  #265 = Class              #266          // java/lang/invoke/MethodHandles$Lookup
  #266 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #267 = Class              #268          // java/lang/invoke/MethodHandles
  #268 = Utf8               java/lang/invoke/MethodHandles
  #269 = Utf8               Lookup
{
  protected ext.mods.gameserver.communitybbs.CustomCommunityBoard();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: getstatic     #7                  // Field ext/mods/Config.ENABLE_CUSTOM_BBS:Z
         7: ifne          11
        10: return
        11: getstatic     #13                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        14: ldc           #19                 // String Loaded custom community board.
        16: invokevirtual #21                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        19: return
      LineNumberTable:
        line 45: 0
        line 46: 4
        line 47: 10
        line 49: 11
        line 50: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/communitybbs/CustomCommunityBoard ]
          stack = []

  public void handleCommands(ext.mods.gameserver.network.GameClient, java.lang.String);
    descriptor: (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: invokevirtual #27                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore_3
         5: aload_3
         6: ifnonnull     10
         9: return
        10: getstatic     #7                  // Field ext/mods/Config.ENABLE_CUSTOM_BBS:Z
        13: ifne          24
        16: aload_3
        17: getstatic     #33                 // Field ext/mods/gameserver/network/SystemMessageId.CB_OFFLINE:Lext/mods/gameserver/network/SystemMessageId;
        20: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        23: return
        24: aload_3
        25: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        28: ifne          117
        31: aload_3
        32: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        35: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        38: ifne          110
        41: aload_3
        42: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.isInJail:()Z
        45: ifne          110
        48: aload_3
        49: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
        52: ifne          110
        55: aload_3
        56: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
        59: ifne          110
        62: aload_3
        63: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        66: ifne          110
        69: aload_3
        70: getstatic     #70                 // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        73: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        76: ifne          110
        79: aload_3
        80: getstatic     #80                 // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        83: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        86: ifne          110
        89: aload_3
        90: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
        93: ifgt          110
        96: aload_3
        97: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       100: ifgt          110
       103: aload_3
       104: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
       107: ifeq          117
       110: aload_3
       111: ldc           #94                 // String You can\'t use the Community Board right now.
       113: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       116: return
       117: aload_2
       118: ldc           #100                // String _bbsgetfav_add
       120: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       123: ifeq          137
       126: invokestatic  #108                // Method ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ServiceBBSManager;
       129: aload_2
       130: aload_3
       131: invokevirtual #114                // Method ext/mods/gameserver/communitybbs/custom/ServiceBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       134: goto          437
       137: aload_2
       138: ldc           #118                // String _bbshome
       140: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       143: ifeq          157
       146: invokestatic  #120                // Method ext/mods/gameserver/communitybbs/custom/IndexCBManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/IndexCBManager;
       149: aload_2
       150: aload_3
       151: invokevirtual #125                // Method ext/mods/gameserver/communitybbs/custom/IndexCBManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       154: goto          437
       157: aload_2
       158: ldc           #126                // String _bbsgetfav
       160: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       163: ifeq          177
       166: invokestatic  #128                // Method ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager;
       169: aload_2
       170: aload_3
       171: invokevirtual #133                // Method ext/mods/gameserver/communitybbs/custom/GateKeeperBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       174: goto          437
       177: aload_2
       178: ldc           #134                // String _bbsloc
       180: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       183: ifeq          197
       186: invokestatic  #136                // Method ext/mods/gameserver/communitybbs/custom/BuffBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/BuffBBSManager;
       189: aload_2
       190: aload_3
       191: invokevirtual #141                // Method ext/mods/gameserver/communitybbs/custom/BuffBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       194: goto          437
       197: aload_2
       198: ldc           #142                // String _bbsclan
       200: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       203: ifeq          217
       206: invokestatic  #144                // Method ext/mods/gameserver/communitybbs/custom/RankingBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/RankingBBSManager;
       209: aload_2
       210: aload_3
       211: invokevirtual #149                // Method ext/mods/gameserver/communitybbs/custom/RankingBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       214: goto          437
       217: aload_2
       218: ldc           #150                // String _bbsmemo
       220: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       223: ifeq          237
       226: invokestatic  #152                // Method ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager;
       229: aload_2
       230: aload_3
       231: invokevirtual #157                // Method ext/mods/gameserver/communitybbs/custom/ClassMasterBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       234: goto          437
       237: aload_2
       238: ldc           #158                // String _maillist_0_1_0_
       240: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       243: ifeq          257
       246: invokestatic  #160                // Method ext/mods/gameserver/communitybbs/custom/ShopBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
       249: aload_2
       250: aload_3
       251: invokevirtual #165                // Method ext/mods/gameserver/communitybbs/custom/ShopBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       254: goto          437
       257: aload_2
       258: ldc           #166                // String _bbsmultisell;
       260: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       263: ifeq          322
       266: new           #168                // class java/util/StringTokenizer
       269: dup
       270: aload_2
       271: ldc           #170                // String ;
       273: invokespecial #172                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       276: astore        4
       278: aload         4
       280: invokevirtual #175                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       283: pop
       284: invokestatic  #160                // Method ext/mods/gameserver/communitybbs/custom/ShopBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
       287: aload         4
       289: invokevirtual #175                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       292: invokedynamic #179,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       297: aload_3
       298: invokevirtual #165                // Method ext/mods/gameserver/communitybbs/custom/ShopBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       301: invokestatic  #183                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       304: aload         4
       306: invokevirtual #175                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       309: invokedynamic #188,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       314: aload_3
       315: iconst_0
       316: invokevirtual #189                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
       319: goto          437
       322: aload_2
       323: ldc           #193                // String _bbsexcmultisell;
       325: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       328: ifeq          387
       331: new           #168                // class java/util/StringTokenizer
       334: dup
       335: aload_2
       336: ldc           #170                // String ;
       338: invokespecial #172                // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
       341: astore        4
       343: aload         4
       345: invokevirtual #175                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       348: pop
       349: invokestatic  #160                // Method ext/mods/gameserver/communitybbs/custom/ShopBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/ShopBBSManager;
       352: aload         4
       354: invokevirtual #175                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       357: invokedynamic #179,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       362: aload_3
       363: invokevirtual #165                // Method ext/mods/gameserver/communitybbs/custom/ShopBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       366: invokestatic  #183                // Method ext/mods/gameserver/data/xml/MultisellData.getInstance:()Lext/mods/gameserver/data/xml/MultisellData;
       369: aload         4
       371: invokevirtual #175                // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       374: invokedynamic #188,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       379: aload_3
       380: iconst_1
       381: invokevirtual #189                // Method ext/mods/gameserver/data/xml/MultisellData.separateAndSendCb:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Z)V
       384: goto          437
       387: aload_2
       388: ldc           #195                // String _friend
       390: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       393: ifeq          407
       396: invokestatic  #197                // Method ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/AuctionBBSManager;
       399: aload_2
       400: aload_3
       401: invokevirtual #202                // Method ext/mods/gameserver/communitybbs/custom/AuctionBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       404: goto          437
       407: aload_2
       408: ldc           #203                // String _cbmission
       410: invokevirtual #102                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       413: ifeq          427
       416: invokestatic  #205                // Method ext/mods/gameserver/communitybbs/custom/MissionBBSManager.getInstance:()Lext/mods/gameserver/communitybbs/custom/MissionBBSManager;
       419: aload_2
       420: aload_3
       421: invokevirtual #210                // Method ext/mods/gameserver/communitybbs/custom/MissionBBSManager.parseCmd:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       424: goto          437
       427: aload_2
       428: invokedynamic #211,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       433: aload_3
       434: invokestatic  #212                // Method ext/mods/gameserver/communitybbs/manager/BaseBBSManager.separateAndSend:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       437: return
      LineNumberTable:
        line 54: 0
        line 55: 5
        line 56: 9
        line 58: 10
        line 60: 16
        line 61: 23
        line 64: 24
        line 66: 110
        line 67: 116
        line 70: 117
        line 71: 126
        line 72: 137
        line 73: 146
        line 74: 157
        line 75: 166
        line 76: 177
        line 77: 186
        line 78: 197
        line 79: 206
        line 80: 217
        line 81: 226
        line 82: 237
        line 83: 246
        line 84: 257
        line 86: 266
        line 87: 278
        line 88: 284
        line 89: 301
        line 90: 319
        line 91: 322
        line 93: 331
        line 94: 343
        line 95: 349
        line 96: 366
        line 97: 384
        line 98: 387
        line 99: 396
        line 100: 407
        line 101: 416
        line 103: 427
        line 104: 437
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          278      41     4    st   Ljava/util/StringTokenizer;
          343      41     4    st   Ljava/util/StringTokenizer;
            0     438     0  this   Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
            0     438     1 client   Lext/mods/gameserver/network/GameClient;
            0     438     2 command   Ljava/lang/String;
            5     433     3 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 16
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 85
        frame_type = 6 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 9 /* same */

  public static ext.mods.gameserver.communitybbs.CustomCommunityBoard getInstance();
    descriptor: ()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #217                // Field ext/mods/gameserver/communitybbs/CustomCommunityBoard$SingletonHolder.INSTANCE:Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
         3: areturn
      LineNumberTable:
        line 108: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #22                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/communitybbs/CustomCommunityBoard
         6: invokevirtual #223                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #228                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #13                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 42: 0
}
SourceFile: "CustomCommunityBoard.java"
NestMembers:
  ext/mods/gameserver/communitybbs/CustomCommunityBoard$SingletonHolder
BootstrapMethods:
  0: #257 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #251 _maillist_0_1_0_;\u0001
  1: #257 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #253 \u0001
  2: #257 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #255 <html><body><br><br><center>The command: \u0001 isn\'t implemented.</center></body></html>
InnerClasses:
  public static final #269= #265 of #267; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
