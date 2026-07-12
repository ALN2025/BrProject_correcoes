// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestBypassToServer
// File: ext\mods\gameserver\network\clientpackets\RequestBypassToServer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestBypassToServer.class
  Last modified 9 de jul de 2026; size 23493 bytes
  MD5 checksum 69e9941222669294688309d20286ce0c
  Compiled from "RequestBypassToServer.java"
public final class ext.mods.gameserver.network.clientpackets.RequestBypassToServer extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestBypassToServer
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 2, methods: 7, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
     #2 = Class              #4           // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Methodref          #8.#9        // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.readS:()Ljava/lang/String;
     #8 = Class              #10          // ext/mods/gameserver/network/clientpackets/RequestBypassToServer
     #9 = NameAndType        #11:#12      // readS:()Ljava/lang/String;
    #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBypassToServer
    #11 = Utf8               readS
    #12 = Utf8               ()Ljava/lang/String;
    #13 = Fieldref           #8.#14       // ext/mods/gameserver/network/clientpackets/RequestBypassToServer._command:Ljava/lang/String;
    #14 = NameAndType        #15:#16      // _command:Ljava/lang/String;
    #15 = Utf8               _command
    #16 = Utf8               Ljava/lang/String;
    #17 = Class              #18          // java/lang/Exception
    #18 = Utf8               java/lang/Exception
    #19 = Fieldref           #8.#20       // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.LOGGER:Lext/mods/commons/logging/CLogger;
    #20 = NameAndType        #21:#22      // LOGGER:Lext/mods/commons/logging/CLogger;
    #21 = Utf8               LOGGER
    #22 = Utf8               Lext/mods/commons/logging/CLogger;
    #23 = String             #24          // RequestBypassToServer readImpl failed (packet format/encoding?).
    #24 = Utf8               RequestBypassToServer readImpl failed (packet format/encoding?).
    #25 = Methodref          #26.#27      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
    #26 = Class              #28          // ext/mods/commons/logging/CLogger
    #27 = NameAndType        #29:#30      // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
    #28 = Utf8               ext/mods/commons/logging/CLogger
    #29 = Utf8               warn
    #30 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
    #31 = Methodref          #8.#32       // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.runImplInternal:()V
    #32 = NameAndType        #33:#6       // runImplInternal:()V
    #33 = Utf8               runImplInternal
    #34 = String             #35          // RequestBypassToServer runImpl failed: _command=[{}]
    #35 = Utf8               RequestBypassToServer runImpl failed: _command=[{}]
    #36 = Class              #37          // java/lang/Object
    #37 = Utf8               java/lang/Object
    #38 = String             #39          // (null)
    #39 = Utf8               (null)
    #40 = Methodref          #26.#41      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #41 = NameAndType        #29:#42      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
    #42 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
    #43 = Methodref          #8.#44       // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.getClient:()Lext/mods/commons/mmocore/MMOClient;
    #44 = NameAndType        #45:#46      // getClient:()Lext/mods/commons/mmocore/MMOClient;
    #45 = Utf8               getClient
    #46 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
    #47 = Class              #48          // ext/mods/gameserver/network/GameClient
    #48 = Utf8               ext/mods/gameserver/network/GameClient
    #49 = Methodref          #47.#50      // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
    #50 = NameAndType        #51:#52      // getPlayer:()Lext/mods/gameserver/model/actor/Player;
    #51 = Utf8               getPlayer
    #52 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
    #53 = Fieldref           #54.#55      // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
    #54 = Class              #56          // ext/mods/gameserver/network/serverpackets/ActionFailed
    #55 = NameAndType        #57:#58      // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
    #56 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
    #57 = Utf8               STATIC_PACKET
    #58 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
    #59 = Methodref          #60.#61      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #60 = Class              #62          // ext/mods/gameserver/model/actor/Player
    #61 = NameAndType        #63:#64      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #62 = Utf8               ext/mods/gameserver/model/actor/Player
    #63 = Utf8               sendPacket
    #64 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #65 = Methodref          #66.#67      // java/lang/String.isEmpty:()Z
    #66 = Class              #68          // java/lang/String
    #67 = NameAndType        #69:#70      // isEmpty:()Z
    #68 = Utf8               java/lang/String
    #69 = Utf8               isEmpty
    #70 = Utf8               ()Z
    #71 = Fieldref           #72.#73      // ext/mods/gameserver/enums/FloodProtector.SERVER_BYPASS:Lext/mods/gameserver/enums/FloodProtector;
    #72 = Class              #74          // ext/mods/gameserver/enums/FloodProtector
    #73 = NameAndType        #75:#76      // SERVER_BYPASS:Lext/mods/gameserver/enums/FloodProtector;
    #74 = Utf8               ext/mods/gameserver/enums/FloodProtector
    #75 = Utf8               SERVER_BYPASS
    #76 = Utf8               Lext/mods/gameserver/enums/FloodProtector;
    #77 = Methodref          #47.#78      // ext/mods/gameserver/network/GameClient.performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
    #78 = NameAndType        #79:#80      // performAction:(Lext/mods/gameserver/enums/FloodProtector;)Z
    #79 = Utf8               performAction
    #80 = Utf8               (Lext/mods/gameserver/enums/FloodProtector;)Z
    #81 = Methodref          #82.#83      // ext/mods/extensions/listener/manager/BypassCommandManager.getInstance:()Lext/mods/extensions/listener/manager/BypassCommandManager;
    #82 = Class              #84          // ext/mods/extensions/listener/manager/BypassCommandManager
    #83 = NameAndType        #85:#86      // getInstance:()Lext/mods/extensions/listener/manager/BypassCommandManager;
    #84 = Utf8               ext/mods/extensions/listener/manager/BypassCommandManager
    #85 = Utf8               getInstance
    #86 = Utf8               ()Lext/mods/extensions/listener/manager/BypassCommandManager;
    #87 = Methodref          #82.#88      // ext/mods/extensions/listener/manager/BypassCommandManager.notify:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    #88 = NameAndType        #89:#90      // notify:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    #89 = Utf8               notify
    #90 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    #91 = Methodref          #92.#93      // ext/mods/donation/DonationBypassAdapter.tryHandle:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    #92 = Class              #94          // ext/mods/donation/DonationBypassAdapter
    #93 = NameAndType        #95:#90      // tryHandle:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    #94 = Utf8               ext/mods/donation/DonationBypassAdapter
    #95 = Utf8               tryHandle
    #96 = String             #97          // admin_
    #97 = Utf8               admin_
    #98 = Methodref          #66.#99      // java/lang/String.startsWith:(Ljava/lang/String;)Z
    #99 = NameAndType        #100:#101    // startsWith:(Ljava/lang/String;)Z
   #100 = Utf8               startsWith
   #101 = Utf8               (Ljava/lang/String;)Z
   #102 = String             #103         //
   #103 = Utf8
   #104 = Methodref          #66.#105     // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #105 = NameAndType        #106:#107    // split:(Ljava/lang/String;)[Ljava/lang/String;
   #106 = Utf8               split
   #107 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #108 = Methodref          #109.#110    // ext/mods/gameserver/handler/AdminCommandHandler.getInstance:()Lext/mods/gameserver/handler/AdminCommandHandler;
   #109 = Class              #111         // ext/mods/gameserver/handler/AdminCommandHandler
   #110 = NameAndType        #85:#112     // getInstance:()Lext/mods/gameserver/handler/AdminCommandHandler;
   #111 = Utf8               ext/mods/gameserver/handler/AdminCommandHandler
   #112 = Utf8               ()Lext/mods/gameserver/handler/AdminCommandHandler;
   #113 = Methodref          #109.#114    // ext/mods/gameserver/handler/AdminCommandHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IAdminCommandHandler;
   #114 = NameAndType        #115:#116    // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IAdminCommandHandler;
   #115 = Utf8               getHandler
   #116 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IAdminCommandHandler;
   #117 = Methodref          #60.#118     // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #118 = NameAndType        #119:#70     // isGM:()Z
   #119 = Utf8               isGM
   #120 = Methodref          #66.#121     // java/lang/String.substring:(I)Ljava/lang/String;
   #121 = NameAndType        #122:#123    // substring:(I)Ljava/lang/String;
   #122 = Utf8               substring
   #123 = Utf8               (I)Ljava/lang/String;
   #124 = InvokeDynamic      #0:#125      // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #125 = NameAndType        #126:#127    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #126 = Utf8               makeConcatWithConstants
   #127 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #128 = Methodref          #60.#129     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #129 = NameAndType        #130:#131    // sendMessage:(Ljava/lang/String;)V
   #130 = Utf8               sendMessage
   #131 = Utf8               (Ljava/lang/String;)V
   #132 = String             #133         // No handler registered for admin command \'{}\'.
   #133 = Utf8               No handler registered for admin command \'{}\'.
   #134 = Methodref          #135.#136    // ext/mods/gameserver/data/xml/AdminData.getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #135 = Class              #137         // ext/mods/gameserver/data/xml/AdminData
   #136 = NameAndType        #85:#138     // getInstance:()Lext/mods/gameserver/data/xml/AdminData;
   #137 = Utf8               ext/mods/gameserver/data/xml/AdminData
   #138 = Utf8               ()Lext/mods/gameserver/data/xml/AdminData;
   #139 = Methodref          #60.#140     // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #140 = NameAndType        #141:#142    // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #141 = Utf8               getAccessLevel
   #142 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
   #143 = Methodref          #135.#144    // ext/mods/gameserver/data/xml/AdminData.hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
   #144 = NameAndType        #145:#146    // hasAccess:(Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
   #145 = Utf8               hasAccess
   #146 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/AccessLevel;)Z
   #147 = String             #148         // You don\'t have the access rights to use this command.
   #148 = Utf8               You don\'t have the access rights to use this command.
   #149 = String             #150         // {} tried to use admin command \'{}\' without proper Access Level.
   #150 = Utf8               {} tried to use admin command \'{}\' without proper Access Level.
   #151 = Methodref          #60.#152     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #152 = NameAndType        #153:#12     // getName:()Ljava/lang/String;
   #153 = Utf8               getName
   #154 = Fieldref           #155.#156    // ext/mods/Config.GMAUDIT:Z
   #155 = Class              #157         // ext/mods/Config
   #156 = NameAndType        #158:#159    // GMAUDIT:Z
   #157 = Utf8               ext/mods/Config
   #158 = Utf8               GMAUDIT
   #159 = Utf8               Z
   #160 = Fieldref           #8.#161      // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.GMAUDIT_LOG:Ljava/util/logging/Logger;
   #161 = NameAndType        #162:#163    // GMAUDIT_LOG:Ljava/util/logging/Logger;
   #162 = Utf8               GMAUDIT_LOG
   #163 = Utf8               Ljava/util/logging/Logger;
   #164 = Methodref          #60.#165     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #165 = NameAndType        #166:#167    // getObjectId:()I
   #166 = Utf8               getObjectId
   #167 = Utf8               ()I
   #168 = Methodref          #60.#169     // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #169 = NameAndType        #170:#171    // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #170 = Utf8               getTarget
   #171 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #172 = Methodref          #173.#152    // ext/mods/gameserver/model/WorldObject.getName:()Ljava/lang/String;
   #173 = Class              #174         // ext/mods/gameserver/model/WorldObject
   #174 = Utf8               ext/mods/gameserver/model/WorldObject
   #175 = String             #176         // none
   #176 = Utf8               none
   #177 = InvokeDynamic      #1:#178      // #1:makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #178 = NameAndType        #126:#179    // makeConcatWithConstants:(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #179 = Utf8               (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #180 = Methodref          #181.#182    // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #181 = Class              #183         // java/util/logging/Logger
   #182 = NameAndType        #184:#131    // info:(Ljava/lang/String;)V
   #183 = Utf8               java/util/logging/Logger
   #184 = Utf8               info
   #185 = InterfaceMethodref #186.#187    // ext/mods/gameserver/handler/IAdminCommandHandler.useAdminCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #186 = Class              #188         // ext/mods/gameserver/handler/IAdminCommandHandler
   #187 = NameAndType        #189:#190    // useAdminCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #188 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #189 = Utf8               useAdminCommand
   #190 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #191 = String             #192         // questnav
   #192 = Utf8               questnav
   #193 = Class              #194         // java/util/StringTokenizer
   #194 = Utf8               java/util/StringTokenizer
   #195 = Methodref          #193.#196    // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #196 = NameAndType        #5:#197      // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #197 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #198 = Methodref          #193.#199    // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #199 = NameAndType        #200:#12     // nextToken:()Ljava/lang/String;
   #200 = Utf8               nextToken
   #201 = Methodref          #202.#203    // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #202 = Class              #204         // java/lang/Integer
   #203 = NameAndType        #205:#206    // parseInt:(Ljava/lang/String;)I
   #204 = Utf8               java/lang/Integer
   #205 = Utf8               parseInt
   #206 = Utf8               (Ljava/lang/String;)I
   #207 = Methodref          #208.#209    // ext/mods/quests/QuestData.getInstance:()Lext/mods/quests/QuestData;
   #208 = Class              #210         // ext/mods/quests/QuestData
   #209 = NameAndType        #85:#211     // getInstance:()Lext/mods/quests/QuestData;
   #210 = Utf8               ext/mods/quests/QuestData
   #211 = Utf8               ()Lext/mods/quests/QuestData;
   #212 = Methodref          #208.#213    // ext/mods/quests/QuestData.getQuest:(I)Lext/mods/quests/holder/QuestHolder;
   #213 = NameAndType        #214:#215    // getQuest:(I)Lext/mods/quests/holder/QuestHolder;
   #214 = Utf8               getQuest
   #215 = Utf8               (I)Lext/mods/quests/holder/QuestHolder;
   #216 = Methodref          #217.#218    // ext/mods/quests/QuestManager.getInstance:()Lext/mods/quests/QuestManager;
   #217 = Class              #219         // ext/mods/quests/QuestManager
   #218 = NameAndType        #85:#220     // getInstance:()Lext/mods/quests/QuestManager;
   #219 = Utf8               ext/mods/quests/QuestManager
   #220 = Utf8               ()Lext/mods/quests/QuestManager;
   #221 = Methodref          #217.#222    // ext/mods/quests/QuestManager.showMenuQuest:(Lext/mods/gameserver/model/actor/Player;I)V
   #222 = NameAndType        #223:#224    // showMenuQuest:(Lext/mods/gameserver/model/actor/Player;I)V
   #223 = Utf8               showMenuQuest
   #224 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #225 = String             #226         // questnav2
   #226 = Utf8               questnav2
   #227 = Methodref          #217.#228    // ext/mods/quests/QuestManager.showCompleteQuest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
   #228 = NameAndType        #229:#230    // showCompleteQuest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
   #229 = Utf8               showCompleteQuest
   #230 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/quests/holder/QuestHolder;I)V
   #231 = String             #232         // questnotify
   #232 = Utf8               questnotify
   #233 = Methodref          #193.#234    // java/util/StringTokenizer.hasMoreTokens:()Z
   #234 = NameAndType        #235:#70     // hasMoreTokens:()Z
   #235 = Utf8               hasMoreTokens
   #236 = String             #237         // false
   #237 = Utf8               false
   #238 = String             #239         // on
   #239 = Utf8               on
   #240 = Methodref          #66.#241     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #241 = NameAndType        #242:#101    // equalsIgnoreCase:(Ljava/lang/String;)Z
   #242 = Utf8               equalsIgnoreCase
   #243 = String             #244         // true
   #244 = Utf8               true
   #245 = String             #246         // html
   #246 = Utf8               html
   #247 = Methodref          #60.#248     // ext/mods/gameserver/model/actor/Player.setQuestNotifyHtml:(Z)V
   #248 = NameAndType        #249:#250    // setQuestNotifyHtml:(Z)V
   #249 = Utf8               setQuestNotifyHtml
   #250 = Utf8               (Z)V
   #251 = String             #252         // ativada
   #252 = Utf8               ativada
   #253 = String             #254         // desativada
   #254 = Utf8               desativada
   #255 = InvokeDynamic      #2:#125      // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #256 = String             #257         // chat
   #257 = Utf8               chat
   #258 = Methodref          #60.#259     // ext/mods/gameserver/model/actor/Player.setQuestNotifyChat:(Z)V
   #259 = NameAndType        #260:#250    // setQuestNotifyChat:(Z)V
   #260 = Utf8               setQuestNotifyChat
   #261 = InvokeDynamic      #3:#125      // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #262 = String             #263         // setquest
   #263 = Utf8               setquest
   #264 = String             #265         // Quest id invalid.
   #265 = Utf8               Quest id invalid.
   #266 = Methodref          #267.#268    // ext/mods/quests/holder/QuestHolder.getRequiredClasses:()Ljava/util/Set;
   #267 = Class              #269         // ext/mods/quests/holder/QuestHolder
   #268 = NameAndType        #270:#271    // getRequiredClasses:()Ljava/util/Set;
   #269 = Utf8               ext/mods/quests/holder/QuestHolder
   #270 = Utf8               getRequiredClasses
   #271 = Utf8               ()Ljava/util/Set;
   #272 = InterfaceMethodref #273.#67     // java/util/Set.isEmpty:()Z
   #273 = Class              #274         // java/util/Set
   #274 = Utf8               java/util/Set
   #275 = Methodref          #60.#276     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #276 = NameAndType        #277:#278    // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #277 = Utf8               getClassId
   #278 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #279 = Methodref          #280.#281    // ext/mods/gameserver/enums/actors/ClassId.getId:()I
   #280 = Class              #282         // ext/mods/gameserver/enums/actors/ClassId
   #281 = NameAndType        #283:#167    // getId:()I
   #282 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #283 = Utf8               getId
   #284 = Methodref          #202.#285    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #285 = NameAndType        #286:#287    // valueOf:(I)Ljava/lang/Integer;
   #286 = Utf8               valueOf
   #287 = Utf8               (I)Ljava/lang/Integer;
   #288 = InterfaceMethodref #273.#289    // java/util/Set.contains:(Ljava/lang/Object;)Z
   #289 = NameAndType        #290:#291    // contains:(Ljava/lang/Object;)Z
   #290 = Utf8               contains
   #291 = Utf8               (Ljava/lang/Object;)Z
   #292 = String             #293         // You cannot access this quest because your class does not match.
   #293 = Utf8               You cannot access this quest because your class does not match.
   #294 = Methodref          #267.#295    // ext/mods/quests/holder/QuestHolder.getObjectives:()Ljava/util/List;
   #295 = NameAndType        #296:#297    // getObjectives:()Ljava/util/List;
   #296 = Utf8               getObjectives
   #297 = Utf8               ()Ljava/util/List;
   #298 = InterfaceMethodref #299.#300    // java/util/List.iterator:()Ljava/util/Iterator;
   #299 = Class              #301         // java/util/List
   #300 = NameAndType        #302:#303    // iterator:()Ljava/util/Iterator;
   #301 = Utf8               java/util/List
   #302 = Utf8               iterator
   #303 = Utf8               ()Ljava/util/Iterator;
   #304 = InterfaceMethodref #305.#306    // java/util/Iterator.hasNext:()Z
   #305 = Class              #307         // java/util/Iterator
   #306 = NameAndType        #308:#70     // hasNext:()Z
   #307 = Utf8               java/util/Iterator
   #308 = Utf8               hasNext
   #309 = InterfaceMethodref #305.#310    // java/util/Iterator.next:()Ljava/lang/Object;
   #310 = NameAndType        #311:#312    // next:()Ljava/lang/Object;
   #311 = Utf8               next
   #312 = Utf8               ()Ljava/lang/Object;
   #313 = Class              #314         // ext/mods/quests/holder/QuestObjective
   #314 = Utf8               ext/mods/quests/holder/QuestObjective
   #315 = Methodref          #267.#281    // ext/mods/quests/holder/QuestHolder.getId:()I
   #316 = Methodref          #313.#317    // ext/mods/quests/holder/QuestObjective.getNpcId:()I
   #317 = NameAndType        #318:#167    // getNpcId:()I
   #318 = Utf8               getNpcId
   #319 = Methodref          #60.#320     // ext/mods/gameserver/model/actor/Player.resetQuestKillCount:(II)V
   #320 = NameAndType        #321:#322    // resetQuestKillCount:(II)V
   #321 = Utf8               resetQuestKillCount
   #322 = Utf8               (II)V
   #323 = Methodref          #60.#324     // ext/mods/gameserver/model/actor/Player.setQuestCompleted:(IZ)V
   #324 = NameAndType        #325:#326    // setQuestCompleted:(IZ)V
   #325 = Utf8               setQuestCompleted
   #326 = Utf8               (IZ)V
   #327 = String             #328         // dungeon
   #328 = Utf8               dungeon
   #329 = Class              #330         // ext/mods/util/Tokenizer
   #330 = Utf8               ext/mods/util/Tokenizer
   #331 = Methodref          #329.#332    // ext/mods/util/Tokenizer."<init>":(Ljava/lang/String;)V
   #332 = NameAndType        #5:#131      // "<init>":(Ljava/lang/String;)V
   #333 = Methodref          #329.#334    // ext/mods/util/Tokenizer.getToken:(I)Ljava/lang/String;
   #334 = NameAndType        #335:#123    // getToken:(I)Ljava/lang/String;
   #335 = Utf8               getToken
   #336 = String             #337         // Invalid command parameter.
   #337 = Utf8               Invalid command parameter.
   #338 = Methodref          #66.#339     // java/lang/String.toLowerCase:()Ljava/lang/String;
   #339 = NameAndType        #340:#12     // toLowerCase:()Ljava/lang/String;
   #340 = Utf8               toLowerCase
   #341 = Methodref          #66.#342     // java/lang/String.hashCode:()I
   #342 = NameAndType        #343:#167    // hashCode:()I
   #343 = Utf8               hashCode
   #344 = String             #345         // enter
   #345 = Utf8               enter
   #346 = Methodref          #66.#347     // java/lang/String.equals:(Ljava/lang/Object;)Z
   #347 = NameAndType        #348:#291    // equals:(Ljava/lang/Object;)Z
   #348 = Utf8               equals
   #349 = Methodref          #350.#351    // ext/mods/dungeon/DungeonManager.getInstance:()Lext/mods/dungeon/DungeonManager;
   #350 = Class              #352         // ext/mods/dungeon/DungeonManager
   #351 = NameAndType        #85:#353     // getInstance:()Lext/mods/dungeon/DungeonManager;
   #352 = Utf8               ext/mods/dungeon/DungeonManager
   #353 = Utf8               ()Lext/mods/dungeon/DungeonManager;
   #354 = Methodref          #350.#355    // ext/mods/dungeon/DungeonManager.handleEnterDungeonId:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
   #355 = NameAndType        #356:#357    // handleEnterDungeonId:(Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
   #356 = Utf8               handleEnterDungeonId
   #357 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/util/Tokenizer;)V
   #358 = String             #359         // Unknown command.
   #359 = Utf8               Unknown command.
   #360 = String             #361         // droplist
   #361 = Utf8               droplist
   #362 = Methodref          #363.#364    // ext/mods/gameserver/data/manager/DropSkipManager.getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
   #363 = Class              #365         // ext/mods/gameserver/data/manager/DropSkipManager
   #364 = NameAndType        #85:#366     // getInstance:()Lext/mods/gameserver/data/manager/DropSkipManager;
   #365 = Utf8               ext/mods/gameserver/data/manager/DropSkipManager
   #366 = Utf8               ()Lext/mods/gameserver/data/manager/DropSkipManager;
   #367 = Methodref          #363.#368    // ext/mods/gameserver/data/manager/DropSkipManager.toggleSkip:(II)V
   #368 = NameAndType        #369:#322    // toggleSkip:(II)V
   #369 = Utf8               toggleSkip
   #370 = Methodref          #363.#371    // ext/mods/gameserver/data/manager/DropSkipManager.loadPlayer:(I)V
   #371 = NameAndType        #372:#373    // loadPlayer:(I)V
   #372 = Utf8               loadPlayer
   #373 = Utf8               (I)V
   #374 = Methodref          #375.#376    // ext/mods/gameserver/handler/bypasshandlers/DropListUI.sendNpcDrop:(Lext/mods/gameserver/model/actor/Player;II)V
   #375 = Class              #377         // ext/mods/gameserver/handler/bypasshandlers/DropListUI
   #376 = NameAndType        #378:#379    // sendNpcDrop:(Lext/mods/gameserver/model/actor/Player;II)V
   #377 = Utf8               ext/mods/gameserver/handler/bypasshandlers/DropListUI
   #378 = Utf8               sendNpcDrop
   #379 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
   #380 = String             #381         // player_help
   #381 = Utf8               player_help
   #382 = String             #383         // ..
   #383 = Utf8               ..
   #384 = Methodref          #66.#385     // java/lang/String.indexOf:(Ljava/lang/String;)I
   #385 = NameAndType        #386:#206    // indexOf:(Ljava/lang/String;)I
   #386 = Utf8               indexOf
   #387 = Methodref          #193.#332    // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #388 = String             #389         // #
   #389 = Utf8               #
   #390 = Class              #391         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #391 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #392 = Methodref          #390.#393    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #393 = NameAndType        #5:#373      // "<init>":(I)V
   #394 = Methodref          #60.#395     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #395 = NameAndType        #396:#397    // getLocale:()Ljava/util/Locale;
   #396 = Utf8               getLocale
   #397 = Utf8               ()Ljava/util/Locale;
   #398 = InvokeDynamic      #4:#125      // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #399 = Methodref          #390.#400    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #400 = NameAndType        #401:#402    // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #401 = Utf8               setFile
   #402 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #403 = Methodref          #390.#404    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setItemId:(I)V
   #404 = NameAndType        #405:#373    // setItemId:(I)V
   #405 = Utf8               setItemId
   #406 = String             #407         // lidias_diary/7064-16.htm
   #407 = Utf8               lidias_diary/7064-16.htm
   #408 = Methodref          #60.#409     // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #409 = NameAndType        #410:#411    // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #410 = Utf8               getQuestList
   #411 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #412 = String             #413         // Q023_LidiasHeart
   #413 = Utf8               Q023_LidiasHeart
   #414 = Methodref          #415.#416    // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #415 = Class              #417         // ext/mods/gameserver/model/actor/container/player/QuestList
   #416 = NameAndType        #418:#419    // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #417 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
   #418 = Utf8               getQuestState
   #419 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #420 = Methodref          #421.#422    // ext/mods/gameserver/scripting/QuestState.getCond:()I
   #421 = Class              #423         // ext/mods/gameserver/scripting/QuestState
   #422 = NameAndType        #424:#167    // getCond:()I
   #423 = Utf8               ext/mods/gameserver/scripting/QuestState
   #424 = Utf8               getCond
   #425 = String             #426         // diary
   #426 = Utf8               diary
   #427 = Methodref          #421.#428    // ext/mods/gameserver/scripting/QuestState.getInteger:(Ljava/lang/String;)I
   #428 = NameAndType        #429:#206    // getInteger:(Ljava/lang/String;)I
   #429 = Utf8               getInteger
   #430 = String             #431         // 1
   #431 = Utf8               1
   #432 = Methodref          #421.#433    // ext/mods/gameserver/scripting/QuestState.set:(Ljava/lang/String;Ljava/lang/String;)V
   #433 = NameAndType        #434:#197    // set:(Ljava/lang/String;Ljava/lang/String;)V
   #434 = Utf8               set
   #435 = Methodref          #390.#436    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.disableValidation:()V
   #436 = NameAndType        #437:#6      // disableValidation:()V
   #437 = Utf8               disableValidation
   #438 = String             #439         // npc_
   #439 = Utf8               npc_
   #440 = Methodref          #60.#441     // ext/mods/gameserver/model/actor/Player.validateBypass:(Ljava/lang/String;)Z
   #441 = NameAndType        #442:#101    // validateBypass:(Ljava/lang/String;)Z
   #442 = Utf8               validateBypass
   #443 = Methodref          #66.#444     // java/lang/String.indexOf:(II)I
   #444 = NameAndType        #386:#445    // indexOf:(II)I
   #445 = Utf8               (II)I
   #446 = Methodref          #66.#447     // java/lang/String.substring:(II)Ljava/lang/String;
   #447 = NameAndType        #122:#448    // substring:(II)Ljava/lang/String;
   #448 = Utf8               (II)Ljava/lang/String;
   #449 = Methodref          #450.#451    // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #450 = Class              #452         // ext/mods/gameserver/model/World
   #451 = NameAndType        #85:#453     // getInstance:()Lext/mods/gameserver/model/World;
   #452 = Utf8               ext/mods/gameserver/model/World
   #453 = Utf8               ()Lext/mods/gameserver/model/World;
   #454 = Methodref          #450.#455    // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #455 = NameAndType        #456:#457    // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #456 = Utf8               getObject
   #457 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #458 = Class              #459         // ext/mods/gameserver/model/actor/Npc
   #459 = Utf8               ext/mods/gameserver/model/actor/Npc
   #460 = Methodref          #458.#317    // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #461 = String             #462         // Quest GrandBossTeleporter
   #462 = Utf8               Quest GrandBossTeleporter
   #463 = Methodref          #458.#165    // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
   #464 = Methodref          #415.#465    // ext/mods/gameserver/model/actor/container/player/QuestList.setLastQuestNpcObjectId:(I)V
   #465 = NameAndType        #466:#373    // setLastQuestNpcObjectId:(I)V
   #466 = Utf8               setLastQuestNpcObjectId
   #467 = String             #468         // GrandBossTeleporter
   #468 = Utf8               GrandBossTeleporter
   #469 = String             #470         // 31540
   #470 = Utf8               31540
   #471 = Methodref          #415.#472    // ext/mods/gameserver/model/actor/container/player/QuestList.processQuestEvent:(Ljava/lang/String;Ljava/lang/String;)V
   #472 = NameAndType        #473:#197    // processQuestEvent:(Ljava/lang/String;Ljava/lang/String;)V
   #473 = Utf8               processQuestEvent
   #474 = String             #475         // Klein (31540) quest event failed: bypass=[{}]
   #475 = Utf8               Klein (31540) quest event failed: bypass=[{}]
   #476 = Methodref          #60.#477     // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #477 = NameAndType        #478:#479    // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #478 = Utf8               getAI
   #479 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #480 = Methodref          #481.#482    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #481 = Class              #483         // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #482 = NameAndType        #484:#485    // canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #483 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #484 = Utf8               canDoInteract
   #485 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #486 = Methodref          #458.#487    // ext/mods/gameserver/model/actor/Npc.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #487 = NameAndType        #488:#489    // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #488 = Utf8               onBypassFeedback
   #489 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #490 = Class              #491         // java/lang/NumberFormatException
   #491 = Utf8               java/lang/NumberFormatException
   #492 = String             #493         // _trans
   #493 = Utf8               _trans
   #494 = String             #495         // user_translationmenu
   #495 = Utf8               user_translationmenu
   #496 = Methodref          #497.#498    // ext/mods/Crypta/DeeplTranslator.getInstance:()Lext/mods/Crypta/DeeplTranslator;
   #497 = Class              #499         // ext/mods/Crypta/DeeplTranslator
   #498 = NameAndType        #85:#500     // getInstance:()Lext/mods/Crypta/DeeplTranslator;
   #499 = Utf8               ext/mods/Crypta/DeeplTranslator
   #500 = Utf8               ()Lext/mods/Crypta/DeeplTranslator;
   #501 = Methodref          #497.#502    // ext/mods/Crypta/DeeplTranslator.showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
   #502 = NameAndType        #503:#504    // showLanguageMenu:(Lext/mods/gameserver/model/actor/Player;)V
   #503 = Utf8               showLanguageMenu
   #504 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #505 = String             #506         // _trans set
   #506 = Utf8               _trans set
   #507 = Methodref          #66.#508     // java/lang/String.length:()I
   #508 = NameAndType        #509:#167    // length:()I
   #509 = Utf8               length
   #510 = Methodref          #497.#511    // ext/mods/Crypta/DeeplTranslator.setPlayerLanguage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #511 = NameAndType        #512:#489    // setPlayerLanguage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #512 = Utf8               setPlayerLanguage
   #513 = String             #514         // _trans toggle
   #514 = Utf8               _trans toggle
   #515 = Methodref          #60.#516     // ext/mods/gameserver/model/actor/Player.switchTranslatePreference:()V
   #516 = NameAndType        #517:#6      // switchTranslatePreference:()V
   #517 = Utf8               switchTranslatePreference
   #518 = Methodref          #60.#519     // ext/mods/gameserver/model/actor/Player.isHtmlTranslationEnabled:()Z
   #519 = NameAndType        #520:#70     // isHtmlTranslationEnabled:()Z
   #520 = Utf8               isHtmlTranslationEnabled
   #521 = InvokeDynamic      #5:#125      // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #522 = String             #523         // _trans status
   #523 = Utf8               _trans status
   #524 = Methodref          #60.#525     // ext/mods/gameserver/model/actor/Player.getDeeplLanguage:()Ljava/lang/Object;
   #525 = NameAndType        #526:#312    // getDeeplLanguage:()Ljava/lang/Object;
   #526 = Utf8               getDeeplLanguage
   #527 = String             #528         // Inglês
   #528 = Utf8               Inglês
   #529 = Methodref          #36.#530     // java/lang/Object.getClass:()Ljava/lang/Class;
   #530 = NameAndType        #531:#532    // getClass:()Ljava/lang/Class;
   #531 = Utf8               getClass
   #532 = Utf8               ()Ljava/lang/Class;
   #533 = String             #534         // getDisplayName
   #534 = Utf8               getDisplayName
   #535 = Class              #536         // java/lang/Class
   #536 = Utf8               java/lang/Class
   #537 = Methodref          #535.#538    // java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
   #538 = NameAndType        #539:#540    // getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
   #539 = Utf8               getMethod
   #540 = Utf8               (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
   #541 = Methodref          #542.#543    // java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #542 = Class              #544         // java/lang/reflect/Method
   #543 = NameAndType        #545:#546    // invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #544 = Utf8               java/lang/reflect/Method
   #545 = Utf8               invoke
   #546 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
   #547 = Methodref          #36.#548     // java/lang/Object.toString:()Ljava/lang/String;
   #548 = NameAndType        #549:#12     // toString:()Ljava/lang/String;
   #549 = Utf8               toString
   #550 = String             #551         // Ativa
   #551 = Utf8               Ativa
   #552 = String             #553         // Inativa
   #553 = Utf8               Inativa
   #554 = InvokeDynamic      #6:#555      // #6:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #555 = NameAndType        #126:#556    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #556 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #557 = Methodref          #558.#559    // ext/mods/gameserver/handler/BypassHandler.getInstance:()Lext/mods/gameserver/handler/BypassHandler;
   #558 = Class              #560         // ext/mods/gameserver/handler/BypassHandler
   #559 = NameAndType        #85:#561     // getInstance:()Lext/mods/gameserver/handler/BypassHandler;
   #560 = Utf8               ext/mods/gameserver/handler/BypassHandler
   #561 = Utf8               ()Lext/mods/gameserver/handler/BypassHandler;
   #562 = Methodref          #558.#563    // ext/mods/gameserver/handler/BypassHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
   #563 = NameAndType        #115:#564    // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
   #564 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IBypassHandler;
   #565 = InterfaceMethodref #566.#567    // ext/mods/gameserver/handler/IBypassHandler.useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #566 = Class              #568         // ext/mods/gameserver/handler/IBypassHandler
   #567 = NameAndType        #569:#570    // useBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #568 = Utf8               ext/mods/gameserver/handler/IBypassHandler
   #569 = Utf8               useBypass
   #570 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #571 = String             #572         // manor_menu_select?
   #572 = Utf8               manor_menu_select?
   #573 = String             #574         // bbs_
   #574 = Utf8               bbs_
   #575 = String             #576         // _bbs
   #576 = Utf8               _bbs
   #577 = String             #578         // _friend
   #578 = Utf8               _friend
   #579 = String             #580         // _mail
   #580 = Utf8               _mail
   #581 = String             #582         // _block
   #582 = Utf8               _block
   #583 = String             #584         // _cbauction
   #584 = Utf8               _cbauction
   #585 = String             #586         // _cbmission
   #586 = Utf8               _cbmission
   #587 = Fieldref           #155.#588    // ext/mods/Config.ENABLE_CUSTOM_BBS:Z
   #588 = NameAndType        #589:#159    // ENABLE_CUSTOM_BBS:Z
   #589 = Utf8               ENABLE_CUSTOM_BBS
   #590 = Methodref          #591.#592    // ext/mods/gameserver/communitybbs/CustomCommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
   #591 = Class              #593         // ext/mods/gameserver/communitybbs/CustomCommunityBoard
   #592 = NameAndType        #85:#594     // getInstance:()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
   #593 = Utf8               ext/mods/gameserver/communitybbs/CustomCommunityBoard
   #594 = Utf8               ()Lext/mods/gameserver/communitybbs/CustomCommunityBoard;
   #595 = Methodref          #591.#596    // ext/mods/gameserver/communitybbs/CustomCommunityBoard.handleCommands:(Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
   #596 = NameAndType        #597:#598    // handleCommands:(Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
   #597 = Utf8               handleCommands
   #598 = Utf8               (Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
   #599 = Fieldref           #155.#600    // ext/mods/Config.ENABLE_COMMUNITY_BOARD:Z
   #600 = NameAndType        #601:#159    // ENABLE_COMMUNITY_BOARD:Z
   #601 = Utf8               ENABLE_COMMUNITY_BOARD
   #602 = Methodref          #603.#604    // ext/mods/gameserver/communitybbs/CommunityBoard.getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #603 = Class              #605         // ext/mods/gameserver/communitybbs/CommunityBoard
   #604 = NameAndType        #85:#606     // getInstance:()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #605 = Utf8               ext/mods/gameserver/communitybbs/CommunityBoard
   #606 = Utf8               ()Lext/mods/gameserver/communitybbs/CommunityBoard;
   #607 = Methodref          #603.#596    // ext/mods/gameserver/communitybbs/CommunityBoard.handleCommands:(Lext/mods/gameserver/network/GameClient;Ljava/lang/String;)V
   #608 = String             #609         // Quest
   #609 = Utf8               Quest
   #610 = Methodref          #66.#611     // java/lang/String.trim:()Ljava/lang/String;
   #611 = NameAndType        #612:#12     // trim:()Ljava/lang/String;
   #612 = Utf8               trim
   #613 = Methodref          #66.#614     // java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
   #614 = NameAndType        #106:#615    // split:(Ljava/lang/String;I)[Ljava/lang/String;
   #615 = Utf8               (Ljava/lang/String;I)[Ljava/lang/String;
   #616 = String             #617         //
   #617 = Utf8
   #618 = String             #619         // Quest bypass failed: command=[{}] quest=[{}] event=[{}]
   #619 = Utf8               Quest bypass failed: command=[{}] quest=[{}] event=[{}]
   #620 = String             #621         // _match
   #621 = Utf8               _match
   #622 = String             #623         // ?
   #623 = Utf8               ?
   #624 = String             #625         // &
   #625 = Utf8               &
   #626 = String             #627         // =
   #627 = Utf8               =
   #628 = Methodref          #629.#630    // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #629 = Class              #631         // ext/mods/gameserver/data/manager/HeroManager
   #630 = NameAndType        #85:#632     // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
   #631 = Utf8               ext/mods/gameserver/data/manager/HeroManager
   #632 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
   #633 = Methodref          #629.#634    // ext/mods/gameserver/data/manager/HeroManager.getHeroByClass:(I)I
   #634 = NameAndType        #635:#636    // getHeroByClass:(I)I
   #635 = Utf8               getHeroByClass
   #636 = Utf8               (I)I
   #637 = Methodref          #629.#638    // ext/mods/gameserver/data/manager/HeroManager.showHeroFights:(Lext/mods/gameserver/model/actor/Player;III)V
   #638 = NameAndType        #639:#640    // showHeroFights:(Lext/mods/gameserver/model/actor/Player;III)V
   #639 = Utf8               showHeroFights
   #640 = Utf8               (Lext/mods/gameserver/model/actor/Player;III)V
   #641 = String             #642         // _diary
   #642 = Utf8               _diary
   #643 = Methodref          #629.#644    // ext/mods/gameserver/data/manager/HeroManager.showHeroDiary:(Lext/mods/gameserver/model/actor/Player;III)V
   #644 = NameAndType        #645:#640    // showHeroDiary:(Lext/mods/gameserver/model/actor/Player;III)V
   #645 = Utf8               showHeroDiary
   #646 = String             #647         // arenachange
   #647 = Utf8               arenachange
   #648 = Methodref          #60.#649     // ext/mods/gameserver/model/actor/Player.getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #649 = NameAndType        #650:#651    // getCurrentFolk:()Lext/mods/gameserver/model/actor/instance/Folk;
   #650 = Utf8               getCurrentFolk
   #651 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Folk;
   #652 = Class              #653         // ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
   #653 = Utf8               ext/mods/gameserver/model/actor/instance/OlympiadManagerNpc
   #654 = Methodref          #60.#655     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #655 = NameAndType        #656:#70     // isInObserverMode:()Z
   #656 = Utf8               isInObserverMode
   #657 = Methodref          #60.#658     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #658 = NameAndType        #659:#70     // isInOlympiadMode:()Z
   #659 = Utf8               isInOlympiadMode
   #660 = Methodref          #60.#661     // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
   #661 = NameAndType        #662:#167    // getOlympiadGameId:()I
   #662 = Utf8               getOlympiadGameId
   #663 = Methodref          #664.#665    // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #664 = Class              #666         // ext/mods/gameserver/model/olympiad/OlympiadManager
   #665 = NameAndType        #85:#667     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #666 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
   #667 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #668 = Methodref          #664.#669    // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
   #669 = NameAndType        #670:#671    // isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
   #670 = Utf8               isRegisteredInComp
   #671 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #672 = Fieldref           #673.#674    // ext/mods/gameserver/network/SystemMessageId.WHILE_YOU_ARE_ON_THE_WAITING_LIST_YOU_ARE_NOT_ALLOWED_TO_WATCH_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #673 = Class              #675         // ext/mods/gameserver/network/SystemMessageId
   #674 = NameAndType        #676:#677    // WHILE_YOU_ARE_ON_THE_WAITING_LIST_YOU_ARE_NOT_ALLOWED_TO_WATCH_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #675 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #676 = Utf8               WHILE_YOU_ARE_ON_THE_WAITING_LIST_YOU_ARE_NOT_ALLOWED_TO_WATCH_THE_GAME
   #677 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #678 = Methodref          #60.#679     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #679 = NameAndType        #63:#680     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #680 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #681 = Methodref          #60.#682     // ext/mods/gameserver/model/actor/Player.enterOlympiadObserverMode:(I)V
   #682 = NameAndType        #683:#373    // enterOlympiadObserverMode:(I)V
   #683 = Utf8               enterOlympiadObserverMode
   #684 = String             #685         // report
   #685 = Utf8               report
   #686 = Methodref          #687.#688    // ext/mods/gameserver/data/manager/BotsPreventionManager.getInstance:()Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #687 = Class              #689         // ext/mods/gameserver/data/manager/BotsPreventionManager
   #688 = NameAndType        #85:#690     // getInstance:()Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #689 = Utf8               ext/mods/gameserver/data/manager/BotsPreventionManager
   #690 = Utf8               ()Lext/mods/gameserver/data/manager/BotsPreventionManager;
   #691 = Methodref          #687.#692    // ext/mods/gameserver/data/manager/BotsPreventionManager.analyseBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #692 = NameAndType        #693:#190    // analyseBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #693 = Utf8               analyseBypass
   #694 = String             #695         // QuestGatekeeper
   #695 = Utf8               QuestGatekeeper
   #696 = Methodref          #60.#697     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #697 = NameAndType        #698:#699    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #698 = Utf8               getInventory
   #699 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #700 = Methodref          #701.#702    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #701 = Class              #703         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #702 = NameAndType        #704:#705    // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #703 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #704 = Utf8               getItemByItemId
   #705 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #706 = Methodref          #707.#708    // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #707 = Class              #709         // ext/mods/gameserver/model/item/instance/ItemInstance
   #708 = NameAndType        #710:#167    // getCount:()I
   #709 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #710 = Utf8               getCount
   #711 = InvokeDynamic      #7:#712      // #7:makeConcatWithConstants:(II)Ljava/lang/String;
   #712 = NameAndType        #126:#448    // makeConcatWithConstants:(II)Ljava/lang/String;
   #713 = Methodref          #60.#714     // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
   #714 = NameAndType        #715:#716    // destroyItemByItemId:(IIZ)Z
   #715 = Utf8               destroyItemByItemId
   #716 = Utf8               (IIZ)Z
   #717 = Methodref          #60.#718     // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
   #718 = NameAndType        #719:#720    // teleportTo:(IIII)Z
   #719 = Utf8               teleportTo
   #720 = Utf8               (IIII)Z
   #721 = String             #722         // npcfind_byid
   #722 = Utf8               npcfind_byid
   #723 = Methodref          #724.#725    // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #724 = Class              #726         // ext/mods/gameserver/data/manager/SpawnManager
   #725 = NameAndType        #85:#727     // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
   #726 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
   #727 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
   #728 = Methodref          #724.#729    // ext/mods/gameserver/data/manager/SpawnManager.getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
   #729 = NameAndType        #730:#731    // getSpawn:(I)Lext/mods/gameserver/model/spawn/ASpawn;
   #730 = Utf8               getSpawn
   #731 = Utf8               (I)Lext/mods/gameserver/model/spawn/ASpawn;
   #732 = Methodref          #60.#733     // ext/mods/gameserver/model/actor/Player.getRadarList:()Lext/mods/gameserver/model/actor/container/player/RadarList;
   #733 = NameAndType        #734:#735    // getRadarList:()Lext/mods/gameserver/model/actor/container/player/RadarList;
   #734 = Utf8               getRadarList
   #735 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/RadarList;
   #736 = Methodref          #737.#738    // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #737 = Class              #739         // ext/mods/gameserver/model/spawn/ASpawn
   #738 = NameAndType        #740:#741    // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #739 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
   #740 = Utf8               getSpawnLocation
   #741 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #742 = Methodref          #743.#744    // ext/mods/gameserver/model/actor/container/player/RadarList.addMarker:(Lext/mods/gameserver/model/location/Location;)V
   #743 = Class              #745         // ext/mods/gameserver/model/actor/container/player/RadarList
   #744 = NameAndType        #746:#747    // addMarker:(Lext/mods/gameserver/model/location/Location;)V
   #745 = Utf8               ext/mods/gameserver/model/actor/container/player/RadarList
   #746 = Utf8               addMarker
   #747 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #748 = Methodref          #450.#749    // ext/mods/gameserver/model/World.getNpc:(I)Lext/mods/gameserver/model/actor/Npc;
   #749 = NameAndType        #750:#751    // getNpc:(I)Lext/mods/gameserver/model/actor/Npc;
   #750 = Utf8               getNpc
   #751 = Utf8               (I)Lext/mods/gameserver/model/actor/Npc;
   #752 = Methodref          #458.#753    // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #753 = NameAndType        #754:#741    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #754 = Utf8               getPosition
   #755 = Methodref          #8.#756      // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.isBuffShopManagerCommand:(Ljava/lang/String;)Z
   #756 = NameAndType        #757:#101    // isBuffShopManagerCommand:(Ljava/lang/String;)Z
   #757 = Utf8               isBuffShopManagerCommand
   #758 = Methodref          #759.#760    // ext/mods/sellBuffEngine/BuffShopBypassHandler.getInstance:()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
   #759 = Class              #761         // ext/mods/sellBuffEngine/BuffShopBypassHandler
   #760 = NameAndType        #85:#762     // getInstance:()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
   #761 = Utf8               ext/mods/sellBuffEngine/BuffShopBypassHandler
   #762 = Utf8               ()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
   #763 = Methodref          #759.#764    // ext/mods/sellBuffEngine/BuffShopBypassHandler.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #764 = NameAndType        #765:#489    // handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #765 = Utf8               handleBypass
   #766 = String             #767         // voiced_
   #767 = Utf8               voiced_
   #768 = Methodref          #769.#770    // ext/mods/gameserver/handler/VoicedCommandHandler.getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
   #769 = Class              #771         // ext/mods/gameserver/handler/VoicedCommandHandler
   #770 = NameAndType        #85:#772     // getInstance:()Lext/mods/gameserver/handler/VoicedCommandHandler;
   #771 = Utf8               ext/mods/gameserver/handler/VoicedCommandHandler
   #772 = Utf8               ()Lext/mods/gameserver/handler/VoicedCommandHandler;
   #773 = Methodref          #769.#774    // ext/mods/gameserver/handler/VoicedCommandHandler.getHandler:(Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #774 = NameAndType        #115:#775    // getHandler:(Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #775 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #776 = InvokeDynamic      #8:#125      // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #777 = InvokeDynamic      #9:#125      // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #778 = Methodref          #26.#779     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #779 = NameAndType        #29:#780     // warn:(Ljava/lang/Object;)V
   #780 = Utf8               (Ljava/lang/Object;)V
   #781 = InterfaceMethodref #782.#783    // ext/mods/gameserver/handler/IVoicedCommandHandler.useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #782 = Class              #784         // ext/mods/gameserver/handler/IVoicedCommandHandler
   #783 = NameAndType        #785:#786    // useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #784 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
   #785 = Utf8               useVoicedCommand
   #786 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #787 = String             #788         // autofarm
   #788 = Utf8               autofarm
   #789 = Methodref          #790.#791    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #790 = Class              #792         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #791 = NameAndType        #85:#793     // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #792 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #793 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #794 = Methodref          #790.#764    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #795 = String             #796         // menu_select
   #796 = Utf8               menu_select
   #797 = Methodref          #458.#798    // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #798 = NameAndType        #799:#800    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #799 = Utf8               getTemplate
   #800 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #801 = Fieldref           #802.#803    // ext/mods/gameserver/enums/EventHandler.AI_MENU_SELECTED:Lext/mods/gameserver/enums/EventHandler;
   #802 = Class              #804         // ext/mods/gameserver/enums/EventHandler
   #803 = NameAndType        #805:#806    // AI_MENU_SELECTED:Lext/mods/gameserver/enums/EventHandler;
   #804 = Utf8               ext/mods/gameserver/enums/EventHandler
   #805 = Utf8               AI_MENU_SELECTED
   #806 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #807 = Methodref          #808.#809    // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #808 = Class              #810         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #809 = NameAndType        #811:#812    // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #810 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #811 = Utf8               getEventQuests
   #812 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #813 = InterfaceMethodref #299.#67     // java/util/List.isEmpty:()Z
   #814 = Methodref          #815.#816    // ext/mods/commons/util/QueryParser.parse:(Ljava/lang/String;)Ljava/util/Map;
   #815 = Class              #817         // ext/mods/commons/util/QueryParser
   #816 = NameAndType        #818:#819    // parse:(Ljava/lang/String;)Ljava/util/Map;
   #817 = Utf8               ext/mods/commons/util/QueryParser
   #818 = Utf8               parse
   #819 = Utf8               (Ljava/lang/String;)Ljava/util/Map;
   #820 = String             #821         // ask
   #821 = Utf8               ask
   #822 = String             #823         // 0
   #823 = Utf8               0
   #824 = InterfaceMethodref #825.#826    // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #825 = Class              #827         // java/util/Map
   #826 = NameAndType        #828:#829    // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #827 = Utf8               java/util/Map
   #828 = Utf8               getOrDefault
   #829 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #830 = String             #831         // reply
   #831 = Utf8               reply
   #832 = InterfaceMethodref #299.#833    // java/util/List.get:(I)Ljava/lang/Object;
   #833 = NameAndType        #834:#835    // get:(I)Ljava/lang/Object;
   #834 = Utf8               get
   #835 = Utf8               (I)Ljava/lang/Object;
   #836 = Class              #837         // ext/mods/gameserver/scripting/Quest
   #837 = Utf8               ext/mods/gameserver/scripting/Quest
   #838 = Methodref          #836.#839    // ext/mods/gameserver/scripting/Quest.notifyMENU_SELECTED:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;II)V
   #839 = NameAndType        #840:#841    // notifyMENU_SELECTED:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;II)V
   #840 = Utf8               notifyMENU_SELECTED
   #841 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;II)V
   #842 = String             #843         // pc[{}] target[{}] unhandle {}
   #843 = Utf8               pc[{}] target[{}] unhandle {}
   #844 = String             #845         // pc[{}] target[{}] menu_select on incorrect target
   #845 = Utf8               pc[{}] target[{}] menu_select on incorrect target
   #846 = String             #847         // radar
   #847 = Utf8               radar
   #848 = Methodref          #193.#849    // java/util/StringTokenizer.countTokens:()I
   #849 = NameAndType        #850:#167    // countTokens:()I
   #850 = Utf8               countTokens
   #851 = Methodref          #743.#852    // ext/mods/gameserver/model/actor/container/player/RadarList.removeAllMarkers:()V
   #852 = NameAndType        #853:#6      // removeAllMarkers:()V
   #853 = Utf8               removeAllMarkers
   #854 = Class              #855         // ext/mods/gameserver/model/location/Location
   #855 = Utf8               ext/mods/gameserver/model/location/Location
   #856 = Methodref          #854.#857    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #857 = NameAndType        #5:#858      // "<init>":(III)V
   #858 = Utf8               (III)V
   #859 = Methodref          #743.#860    // ext/mods/gameserver/model/actor/container/player/RadarList.loadMarkers:()V
   #860 = NameAndType        #861:#6      // loadMarkers:()V
   #861 = Utf8               loadMarkers
   #862 = String             #863         // Marker added to radar.
   #863 = Utf8               Marker added to radar.
   #864 = String             #865         // Invalid coordinates.
   #865 = Utf8               Invalid coordinates.
   #866 = String             #867         // Invalid command format. Use: radar x y z
   #867 = Utf8               Invalid command format. Use: radar x y z
   #868 = Methodref          #8.#869      // ext/mods/gameserver/network/clientpackets/RequestBypassToServer.useBypassHandler:(Lext/mods/gameserver/model/actor/Player;)V
   #869 = NameAndType        #870:#504    // useBypassHandler:(Lext/mods/gameserver/model/actor/Player;)V
   #870 = Utf8               useBypassHandler
   #871 = String             #872         // index
   #872 = Utf8               index
   #873 = String             #874         // setprice
   #874 = Utf8               setprice
   #875 = String             #876         // settitle
   #876 = Utf8               settitle
   #877 = String             #878         // setbuffs
   #878 = Utf8               setbuffs
   #879 = String             #880         // close
   #880 = Utf8               close
   #881 = String             #882         // setshop
   #882 = Utf8               setshop
   #883 = String             #884         // list
   #884 = Utf8               list
   #885 = String             #886         // add
   #886 = Utf8               add
   #887 = String             #888         // del
   #888 = Utf8               del
   #889 = String             #890         // startshop
   #890 = Utf8               startshop
   #891 = String             #892         // stopshop
   #892 = Utf8               stopshop
   #893 = String             #894         // showShop
   #894 = Utf8               showShop
   #895 = String             #896         // cast
   #896 = Utf8               cast
   #897 = String             #898         // remove_buff
   #898 = Utf8               remove_buff
   #899 = String             #900         // remove_buffatt
   #900 = Utf8               remove_buffatt
   #901 = String             #902         // manage_my_buffs
   #902 = Utf8               manage_my_buffs
   #903 = String             #904         // cast_confirm
   #904 = Utf8               cast_confirm
   #905 = String             #906         // shopskill
   #906 = Utf8               shopskill
   #907 = String             #908         // buy_skill
   #908 = Utf8               buy_skill
   #909 = String             #910         // show_skill_shop
   #910 = Utf8               show_skill_shop
   #911 = Methodref          #66.#912     // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #912 = NameAndType        #913:#914    // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #913 = Utf8               replace
   #914 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #915 = String             #916         // gmaudit
   #916 = Utf8               gmaudit
   #917 = Methodref          #181.#918    // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #918 = NameAndType        #919:#920    // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #919 = Utf8               getLogger
   #920 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #921 = Utf8               Code
   #922 = Utf8               LineNumberTable
   #923 = Utf8               LocalVariableTable
   #924 = Utf8               this
   #925 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestBypassToServer;
   #926 = Utf8               readImpl
   #927 = Utf8               e
   #928 = Utf8               Ljava/lang/Exception;
   #929 = Utf8               StackMapTable
   #930 = Utf8               runImpl
   #931 = Utf8               player
   #932 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #933 = Class              #934         // "[Ljava/lang/Object;"
   #934 = Utf8               [Ljava/lang/Object;
   #935 = Utf8               command
   #936 = Utf8               ach
   #937 = Utf8               Lext/mods/gameserver/handler/IAdminCommandHandler;
   #938 = Utf8               st
   #939 = Utf8               Ljava/util/StringTokenizer;
   #940 = Utf8               questId
   #941 = Utf8               I
   #942 = Utf8               page
   #943 = Utf8               quest
   #944 = Utf8               Lext/mods/quests/holder/QuestHolder;
   #945 = Utf8               type
   #946 = Utf8               status
   #947 = Utf8               enable
   #948 = Utf8               obj
   #949 = Utf8               Lext/mods/quests/holder/QuestObjective;
   #950 = Utf8               setQuestId
   #951 = Utf8               isClassValid
   #952 = Utf8               tokenizer
   #953 = Utf8               Lext/mods/util/Tokenizer;
   #954 = Utf8               param
   #955 = Utf8               itemId
   #956 = Utf8               npcId
   #957 = Utf8               qs
   #958 = Utf8               Lext/mods/gameserver/scripting/QuestState;
   #959 = Utf8               path
   #960 = Utf8               cmd
   #961 = Utf8               [Ljava/lang/String;
   #962 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
   #963 = Utf8               id
   #964 = Utf8               npc
   #965 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #966 = Utf8               object
   #967 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #968 = Utf8               bypassRest
   #969 = Utf8               nfe
   #970 = Utf8               Ljava/lang/NumberFormatException;
   #971 = Utf8               endOfId
   #972 = Utf8               langCode
   #973 = Utf8               Ljava/lang/reflect/Method;
   #974 = Utf8               currentLang
   #975 = Utf8               Ljava/lang/Object;
   #976 = Utf8               langName
   #977 = Utf8               handler
   #978 = Utf8               Lext/mods/gameserver/handler/IBypassHandler;
   #979 = Utf8               targetNpc
   #980 = Utf8               str
   #981 = Utf8               params
   #982 = Utf8               heroclass
   #983 = Utf8               heropage
   #984 = Utf8               heroid
   #985 = Utf8               isManager
   #986 = Utf8               arenaId
   #987 = Utf8               args
   #988 = Utf8               loc
   #989 = Utf8               loc1
   #990 = Utf8               loc2
   #991 = Utf8               itemid
   #992 = Utf8               count
   #993 = Utf8               raid
   #994 = Utf8               raidId
   #995 = Utf8               spawn
   #996 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
   #997 = Utf8               Lext/mods/gameserver/handler/IVoicedCommandHandler;
   #998 = Utf8               props
   #999 = Utf8               Ljava/util/Map;
  #1000 = Utf8               Ljava/util/List;
  #1001 = Utf8               target
  #1002 = Utf8               getLocX
  #1003 = Utf8               getLocY
  #1004 = Utf8               getLocZ
  #1005 = Utf8               LocalVariableTypeTable
  #1006 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;
  #1007 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #1008 = Class              #961         // "[Ljava/lang/String;"
  #1009 = Utf8               fullCommand
  #1010 = Utf8               commandPart
  #1011 = Utf8               spaceIdx
  #1012 = Utf8               <clinit>
  #1013 = Utf8               SourceFile
  #1014 = Utf8               RequestBypassToServer.java
  #1015 = Utf8               BootstrapMethods
  #1016 = String             #1017        // The command \u0001 doesn\'t exist.
  #1017 = Utf8               The command \u0001 doesn\'t exist.
  #1018 = String             #1019        // \u0001 [\u0001] used \'\u0001\' command on: \u0001
  #1019 = Utf8               \u0001 [\u0001] used \'\u0001\' command on: \u0001
  #1020 = String             #1021        // Notificação via HTML \u0001.
  #1021 = Utf8               Notificação via HTML \u0001.
  #1022 = String             #1023        // Notificação via chat \u0001.
  #1023 = Utf8               Notificação via chat \u0001.
  #1024 = String             #1025        // html/help/\u0001
  #1025 = Utf8               html/help/\u0001
  #1026 = String             #1027        // Tradução HTML \u0001.
  #1027 = Utf8               Tradução HTML \u0001.
  #1028 = String             #1029        // Idioma atual: \u0001 | Tradução HTML: \u0001
  #1029 = Utf8               Idioma atual: \u0001 | Tradução HTML: \u0001
  #1030 = String             #1031        // Incorrect item count. You need \u0001 \u0001
  #1031 = Utf8               Incorrect item count. You need \u0001 \u0001
  #1032 = String             #1033        // The command \u0001 does not exist!
  #1033 = Utf8               The command \u0001 does not exist!
  #1034 = String             #1035        // No handler registered for command \'\u0001\'
  #1035 = Utf8               No handler registered for command \'\u0001\'
  #1036 = MethodHandle       6:#1037      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1037 = Methodref          #1038.#1039  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1038 = Class              #1040        // java/lang/invoke/StringConcatFactory
  #1039 = NameAndType        #126:#1041   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1040 = Utf8               java/lang/invoke/StringConcatFactory
  #1041 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1042 = Utf8               InnerClasses
  #1043 = Class              #1044        // java/lang/invoke/MethodHandles$Lookup
  #1044 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1045 = Class              #1046        // java/lang/invoke/MethodHandles
  #1046 = Utf8               java/lang/invoke/MethodHandles
  #1047 = Utf8               Lookup
{
  public ext.mods.gameserver.network.clientpackets.RequestBypassToServer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestBypassToServer;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readS:()Ljava/lang/String;
         5: putfield      #13                 // Field _command:Ljava/lang/String;
         8: goto          23
        11: astore_1
        12: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: ldc           #23                 // String RequestBypassToServer readImpl failed (packet format/encoding?).
        17: aload_1
        18: invokevirtual #25                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
        21: aload_1
        22: athrow
        23: return
      Exception table:
         from    to  target type
             0     8    11   Class java/lang/Exception
      LineNumberTable:
        line 76: 0
        line 82: 8
        line 78: 11
        line 80: 12
        line 81: 21
        line 83: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           12      11     1     e   Ljava/lang/Exception;
            0      24     0  this   Lext/mods/gameserver/network/clientpackets/RequestBypassToServer;
      StackMapTable: number_of_entries = 2
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #31                 // Method runImplInternal:()V
         4: goto          65
         7: astore_1
         8: getstatic     #19                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        11: ldc           #34                 // String RequestBypassToServer runImpl failed: _command=[{}]
        13: iconst_2
        14: anewarray     #36                 // class java/lang/Object
        17: dup
        18: iconst_0
        19: aload_0
        20: getfield      #13                 // Field _command:Ljava/lang/String;
        23: ifnull        33
        26: aload_0
        27: getfield      #13                 // Field _command:Ljava/lang/String;
        30: goto          35
        33: ldc           #38                 // String (null)
        35: aastore
        36: dup
        37: iconst_1
        38: aload_1
        39: aastore
        40: invokevirtual #40                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        43: aload_0
        44: invokevirtual #43                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        47: checkcast     #47                 // class ext/mods/gameserver/network/GameClient
        50: invokevirtual #49                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        53: astore_2
        54: aload_2
        55: ifnull        65
        58: aload_2
        59: getstatic     #53                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        62: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        65: return
      Exception table:
         from    to  target type
             0     4     7   Class java/lang/Exception
      LineNumberTable:
        line 90: 0
        line 98: 4
        line 92: 7
        line 94: 8
        line 95: 43
        line 96: 54
        line 97: 58
        line 99: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      11     2 player   Lext/mods/gameserver/model/actor/Player;
            8      57     1     e   Ljava/lang/Exception;
            0      66     0  this   Lext/mods/gameserver/network/clientpackets/RequestBypassToServer;
      StackMapTable: number_of_entries = 4
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestBypassToServer, class java/lang/Exception ]
          stack = [ class ext/mods/commons/logging/CLogger, class java/lang/String, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestBypassToServer, class java/lang/Exception ]
          stack = [ class ext/mods/commons/logging/CLogger, class java/lang/String, class "[Ljava/lang/Object;", class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 29

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc_w         #915                // String gmaudit
         3: invokestatic  #917                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         6: putstatic     #160                // Field GMAUDIT_LOG:Ljava/util/logging/Logger;
         9: return
      LineNumberTable:
        line 67: 0
}
SourceFile: "RequestBypassToServer.java"
BootstrapMethods:
  0: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1016 The command \u0001 doesn\'t exist.
  1: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1018 \u0001 [\u0001] used \'\u0001\' command on: \u0001
  2: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1020 Notificação via HTML \u0001.
  3: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1022 Notificação via chat \u0001.
  4: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1024 html/help/\u0001
  5: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1026 Tradução HTML \u0001.
  6: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1028 Idioma atual: \u0001 | Tradução HTML: \u0001
  7: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1030 Incorrect item count. You need \u0001 \u0001
  8: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1032 The command \u0001 does not exist!
  9: #1036 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1034 No handler registered for command \'\u0001\'
InnerClasses:
  public static final #1047= #1043 of #1045; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
