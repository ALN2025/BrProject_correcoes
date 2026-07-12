// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminInfo
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.class
  Last modified 9 de jul de 2026; size 42021 bytes
  MD5 checksum dd8bd7960175f0f9e788fa1ce89456ed
  Compiled from "AdminInfo.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminInfo implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 21, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = String             #8           // admin_info
     #8 = Utf8               admin_info
     #9 = Methodref          #10.#11      // java/lang/String.startsWith:(Ljava/lang/String;)Z
    #10 = Class              #12          // java/lang/String
    #11 = NameAndType        #13:#14      // startsWith:(Ljava/lang/String;)Z
    #12 = Utf8               java/lang/String
    #13 = Utf8               startsWith
    #14 = Utf8               (Ljava/lang/String;)Z
    #15 = Class              #16          // ext/mods/gameserver/model/WorldObject
    #16 = Utf8               ext/mods/gameserver/model/WorldObject
    #17 = Methodref          #18.#19      // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
    #18 = Class              #20          // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo
    #19 = NameAndType        #21:#22      // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
    #20 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminInfo
    #21 = Utf8               getTarget
    #22 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
    #23 = Class              #24          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
    #24 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
    #25 = Methodref          #23.#26      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
    #26 = NameAndType        #5:#27       // "<init>":(I)V
    #27 = Utf8               (I)V
    #28 = Class              #29          // ext/mods/gameserver/model/actor/instance/Door
    #29 = Utf8               ext/mods/gameserver/model/actor/instance/Door
    #30 = Methodref          #18.#31      // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.showDoorInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #31 = NameAndType        #32:#33      // showDoorInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #32 = Utf8               showDoorInfo
    #33 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #34 = Class              #35          // ext/mods/gameserver/model/actor/Npc
    #35 = Utf8               ext/mods/gameserver/model/actor/Npc
    #36 = Class              #37          // java/util/StringTokenizer
    #37 = Utf8               java/util/StringTokenizer
    #38 = String             #39          //
    #39 = Utf8
    #40 = Methodref          #36.#41      // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
    #41 = NameAndType        #5:#42       // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
    #42 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
    #43 = Methodref          #36.#44      // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
    #44 = NameAndType        #45:#46      // nextToken:()Ljava/lang/String;
    #45 = Utf8               nextToken
    #46 = Utf8               ()Ljava/lang/String;
    #47 = Methodref          #36.#48      // java/util/StringTokenizer.hasMoreTokens:()Z
    #48 = NameAndType        #49:#50      // hasMoreTokens:()Z
    #49 = Utf8               hasMoreTokens
    #50 = Utf8               ()Z
    #51 = Methodref          #18.#52      // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendGeneralInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
    #52 = NameAndType        #53:#54      // sendGeneralInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
    #53 = Utf8               sendGeneralInfos
    #54 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
    #55 = Methodref          #10.#56      // java/lang/String.hashCode:()I
    #56 = NameAndType        #57:#58      // hashCode:()I
    #57 = Utf8               hashCode
    #58 = Utf8               ()I
    #59 = String             #60          // ai
    #60 = Utf8               ai
    #61 = Methodref          #10.#62      // java/lang/String.equals:(Ljava/lang/Object;)Z
    #62 = NameAndType        #63:#64      // equals:(Ljava/lang/Object;)Z
    #63 = Utf8               equals
    #64 = Utf8               (Ljava/lang/Object;)Z
    #65 = String             #66          // aggro
    #66 = Utf8               aggro
    #67 = String             #68          // desire
    #68 = Utf8               desire
    #69 = String             #70          // drop
    #70 = Utf8               drop
    #71 = String             #72          // spoil
    #72 = Utf8               spoil
    #73 = String             #74          // script
    #74 = Utf8               script
    #75 = String             #76          // shop
    #76 = Utf8               shop
    #77 = String             #78          // skill
    #78 = Utf8               skill
    #79 = String             #80          // spawn
    #80 = Utf8               spawn
    #81 = String             #82          // stat
    #82 = Utf8               stat
    #83 = Methodref          #84.#85      // java/lang/Integer.parseInt:(Ljava/lang/String;)I
    #84 = Class              #86          // java/lang/Integer
    #85 = NameAndType        #87:#88      // parseInt:(Ljava/lang/String;)I
    #86 = Utf8               java/lang/Integer
    #87 = Utf8               parseInt
    #88 = Utf8               (Ljava/lang/String;)I
    #89 = Methodref          #18.#90      // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendAiInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
    #90 = NameAndType        #91:#54      // sendAiInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
    #91 = Utf8               sendAiInfos
    #92 = Class              #93          // java/lang/Exception
    #93 = Utf8               java/lang/Exception
    #94 = Methodref          #18.#95      // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendAggroInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #95 = NameAndType        #96:#97      // sendAggroInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #96 = Utf8               sendAggroInfos
    #97 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #98 = Methodref          #18.#99      // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendDesireInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    #99 = NameAndType        #100:#97     // sendDesireInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #100 = Utf8               sendDesireInfos
   #101 = Methodref          #10.#102     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #102 = NameAndType        #103:#14     // equalsIgnoreCase:(Ljava/lang/String;)Z
   #103 = Utf8               equalsIgnoreCase
   #104 = Methodref          #18.#105     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendDropInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
   #105 = NameAndType        #106:#107    // sendDropInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
   #106 = Utf8               sendDropInfos
   #107 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
   #108 = Methodref          #18.#109     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendScriptInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #109 = NameAndType        #110:#97     // sendScriptInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #110 = Utf8               sendScriptInfos
   #111 = Methodref          #18.#112     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendShopInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #112 = NameAndType        #113:#97     // sendShopInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #113 = Utf8               sendShopInfos
   #114 = Methodref          #18.#115     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendSkillInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #115 = NameAndType        #116:#97     // sendSkillInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #116 = Utf8               sendSkillInfos
   #117 = Methodref          #18.#118     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendSpawnInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #118 = NameAndType        #119:#97     // sendSpawnInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #119 = Utf8               sendSpawnInfos
   #120 = Methodref          #18.#121     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendStatsInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #121 = NameAndType        #122:#97     // sendStatsInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #122 = Utf8               sendStatsInfos
   #123 = Methodref          #124.#125    // ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
   #124 = Class              #126         // ext/mods/commons/lang/StringUtil
   #125 = NameAndType        #127:#14     // isDigit:(Ljava/lang/String;)Z
   #126 = Utf8               ext/mods/commons/lang/StringUtil
   #127 = Utf8               isDigit
   #128 = Methodref          #84.#129     // java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #129 = NameAndType        #130:#131    // valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
   #130 = Utf8               valueOf
   #131 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #132 = Methodref          #84.#133     // java/lang/Integer.intValue:()I
   #133 = NameAndType        #134:#58     // intValue:()I
   #134 = Utf8               intValue
   #135 = Class              #136         // ext/mods/gameserver/model/actor/Player
   #136 = Utf8               ext/mods/gameserver/model/actor/Player
   #137 = Methodref          #138.#139    // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #138 = Class              #140         // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar
   #139 = NameAndType        #141:#142    // gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #140 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar
   #141 = Utf8               gatherPlayerInfo
   #142 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #143 = Class              #144         // ext/mods/gameserver/model/actor/Summon
   #144 = Utf8               ext/mods/gameserver/model/actor/Summon
   #145 = Methodref          #15.#146     // ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #146 = NameAndType        #147:#148    // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #147 = Utf8               getActingPlayer
   #148 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #149 = Methodref          #135.#150    // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
   #150 = NameAndType        #151:#152    // getLocale:()Ljava/util/Locale;
   #151 = Utf8               getLocale
   #152 = Utf8               ()Ljava/util/Locale;
   #153 = String             #154         // html/admin/petinfo.htm
   #154 = Utf8               html/admin/petinfo.htm
   #155 = Methodref          #23.#156     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #156 = NameAndType        #157:#158    // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
   #157 = Utf8               setFile
   #158 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
   #159 = String             #160         // %name%
   #160 = Utf8               %name%
   #161 = Methodref          #143.#162    // ext/mods/gameserver/model/actor/Summon.getName:()Ljava/lang/String;
   #162 = NameAndType        #163:#46     // getName:()Ljava/lang/String;
   #163 = Utf8               getName
   #164 = String             #165         // N/A
   #165 = Utf8               N/A
   #166 = Methodref          #23.#167     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #167 = NameAndType        #168:#42     // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #168 = Utf8               replace
   #169 = String             #170         // %level%
   #170 = Utf8               %level%
   #171 = Methodref          #143.#172    // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #172 = NameAndType        #173:#174    // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #173 = Utf8               getStatus
   #174 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #175 = Methodref          #176.#177    // ext/mods/gameserver/model/actor/status/SummonStatus.getLevel:()I
   #176 = Class              #178         // ext/mods/gameserver/model/actor/status/SummonStatus
   #177 = NameAndType        #179:#58     // getLevel:()I
   #178 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
   #179 = Utf8               getLevel
   #180 = Methodref          #23.#181     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
   #181 = NameAndType        #168:#182    // replace:(Ljava/lang/String;I)V
   #182 = Utf8               (Ljava/lang/String;I)V
   #183 = String             #184         // %exp%
   #184 = Utf8               %exp%
   #185 = Methodref          #176.#186    // ext/mods/gameserver/model/actor/status/SummonStatus.getExp:()J
   #186 = NameAndType        #187:#188    // getExp:()J
   #187 = Utf8               getExp
   #188 = Utf8               ()J
   #189 = Methodref          #23.#190     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
   #190 = NameAndType        #168:#191    // replace:(Ljava/lang/String;J)V
   #191 = Utf8               (Ljava/lang/String;J)V
   #192 = String             #193         // %owner%
   #193 = Utf8               %owner%
   #194 = Methodref          #135.#162    // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #195 = InvokeDynamic      #0:#196      // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #196 = NameAndType        #197:#198    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #197 = Utf8               makeConcatWithConstants
   #198 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #199 = String             #200         // %class%
   #200 = Utf8               %class%
   #201 = Methodref          #2.#202      // java/lang/Object.getClass:()Ljava/lang/Class;
   #202 = NameAndType        #203:#204    // getClass:()Ljava/lang/Class;
   #203 = Utf8               getClass
   #204 = Utf8               ()Ljava/lang/Class;
   #205 = Methodref          #206.#207    // java/lang/Class.getSimpleName:()Ljava/lang/String;
   #206 = Class              #208         // java/lang/Class
   #207 = NameAndType        #209:#46     // getSimpleName:()Ljava/lang/String;
   #208 = Utf8               java/lang/Class
   #209 = Utf8               getSimpleName
   #210 = String             #211         // %ai%
   #211 = Utf8               %ai%
   #212 = Methodref          #143.#213    // ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
   #213 = NameAndType        #214:#215    // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
   #214 = Utf8               getAI
   #215 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
   #216 = Methodref          #217.#218    // ext/mods/gameserver/model/actor/ai/type/SummonAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #217 = Class              #219         // ext/mods/gameserver/model/actor/ai/type/SummonAI
   #218 = NameAndType        #220:#221    // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #219 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
   #220 = Utf8               getCurrentIntention
   #221 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #222 = Methodref          #223.#224    // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #223 = Class              #225         // ext/mods/gameserver/model/actor/ai/Intention
   #224 = NameAndType        #226:#227    // getType:()Lext/mods/gameserver/enums/IntentionType;
   #225 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #226 = Utf8               getType
   #227 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #228 = Methodref          #229.#230    // ext/mods/gameserver/enums/IntentionType.name:()Ljava/lang/String;
   #229 = Class              #231         // ext/mods/gameserver/enums/IntentionType
   #230 = NameAndType        #232:#46     // name:()Ljava/lang/String;
   #231 = Utf8               ext/mods/gameserver/enums/IntentionType
   #232 = Utf8               name
   #233 = String             #234         // %hp%
   #234 = Utf8               %hp%
   #235 = Methodref          #176.#236    // ext/mods/gameserver/model/actor/status/SummonStatus.getHp:()D
   #236 = NameAndType        #237:#238    // getHp:()D
   #237 = Utf8               getHp
   #238 = Utf8               ()D
   #239 = Methodref          #176.#240    // ext/mods/gameserver/model/actor/status/SummonStatus.getMaxHp:()I
   #240 = NameAndType        #241:#58     // getMaxHp:()I
   #241 = Utf8               getMaxHp
   #242 = InvokeDynamic      #1:#243      // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #243 = NameAndType        #197:#244    // makeConcatWithConstants:(II)Ljava/lang/String;
   #244 = Utf8               (II)Ljava/lang/String;
   #245 = String             #246         // %mp%
   #246 = Utf8               %mp%
   #247 = Methodref          #176.#248    // ext/mods/gameserver/model/actor/status/SummonStatus.getMp:()D
   #248 = NameAndType        #249:#238    // getMp:()D
   #249 = Utf8               getMp
   #250 = Methodref          #176.#251    // ext/mods/gameserver/model/actor/status/SummonStatus.getMaxMp:()I
   #251 = NameAndType        #252:#58     // getMaxMp:()I
   #252 = Utf8               getMaxMp
   #253 = String             #254         // %karma%
   #254 = Utf8               %karma%
   #255 = Methodref          #143.#256    // ext/mods/gameserver/model/actor/Summon.getKarma:()I
   #256 = NameAndType        #257:#58     // getKarma:()I
   #257 = Utf8               getKarma
   #258 = String             #259         // %undead%
   #259 = Utf8               %undead%
   #260 = Methodref          #143.#261    // ext/mods/gameserver/model/actor/Summon.isUndead:()Z
   #261 = NameAndType        #262:#50     // isUndead:()Z
   #262 = Utf8               isUndead
   #263 = String             #264         // yes
   #264 = Utf8               yes
   #265 = String             #266         // no
   #266 = Utf8               no
   #267 = Class              #268         // ext/mods/gameserver/model/actor/instance/Pet
   #268 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #269 = String             #270         // %inv%
   #270 = Utf8               %inv%
   #271 = String             #272         //  <a action=\"bypass admin_summon inventory\">view</a>
   #272 = Utf8                <a action=\"bypass admin_summon inventory\">view</a>
   #273 = String             #274         // %food%
   #274 = Utf8               %food%
   #275 = Methodref          #267.#276    // ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
   #276 = NameAndType        #277:#58     // getCurrentFed:()I
   #277 = Utf8               getCurrentFed
   #278 = Methodref          #267.#279    // ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
   #279 = NameAndType        #280:#281    // getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
   #280 = Utf8               getPetData
   #281 = Utf8               ()Lext/mods/gameserver/model/records/PetDataEntry;
   #282 = Methodref          #283.#284    // ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
   #283 = Class              #285         // ext/mods/gameserver/model/records/PetDataEntry
   #284 = NameAndType        #286:#58     // maxMeal:()I
   #285 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
   #286 = Utf8               maxMeal
   #287 = String             #288         // %load%
   #288 = Utf8               %load%
   #289 = Methodref          #267.#290    // ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #290 = NameAndType        #291:#292    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #291 = Utf8               getInventory
   #292 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #293 = Methodref          #294.#295    // ext/mods/gameserver/model/itemcontainer/PetInventory.getTotalWeight:()I
   #294 = Class              #296         // ext/mods/gameserver/model/itemcontainer/PetInventory
   #295 = NameAndType        #297:#58     // getTotalWeight:()I
   #296 = Utf8               ext/mods/gameserver/model/itemcontainer/PetInventory
   #297 = Utf8               getTotalWeight
   #298 = Methodref          #267.#299    // ext/mods/gameserver/model/actor/instance/Pet.getWeightLimit:()I
   #299 = NameAndType        #300:#58     // getWeightLimit:()I
   #300 = Utf8               getWeightLimit
   #301 = String             #302         // none
   #302 = Utf8               none
   #303 = Class              #304         // ext/mods/gameserver/model/actor/instance/StaticObject
   #304 = Utf8               ext/mods/gameserver/model/actor/instance/StaticObject
   #305 = String             #306         // html/admin/staticinfo.htm
   #306 = Utf8               html/admin/staticinfo.htm
   #307 = String             #308         // %x%
   #308 = Utf8               %x%
   #309 = Methodref          #303.#310    // ext/mods/gameserver/model/actor/instance/StaticObject.getX:()I
   #310 = NameAndType        #311:#58     // getX:()I
   #311 = Utf8               getX
   #312 = String             #313         // %y%
   #313 = Utf8               %y%
   #314 = Methodref          #303.#315    // ext/mods/gameserver/model/actor/instance/StaticObject.getY:()I
   #315 = NameAndType        #316:#58     // getY:()I
   #316 = Utf8               getY
   #317 = String             #318         // %z%
   #318 = Utf8               %z%
   #319 = Methodref          #303.#320    // ext/mods/gameserver/model/actor/instance/StaticObject.getZ:()I
   #320 = NameAndType        #321:#58     // getZ:()I
   #321 = Utf8               getZ
   #322 = String             #323         // %objid%
   #323 = Utf8               %objid%
   #324 = Methodref          #303.#325    // ext/mods/gameserver/model/actor/instance/StaticObject.getObjectId:()I
   #325 = NameAndType        #326:#58     // getObjectId:()I
   #326 = Utf8               getObjectId
   #327 = String             #328         // %staticid%
   #328 = Utf8               %staticid%
   #329 = Methodref          #303.#330    // ext/mods/gameserver/model/actor/instance/StaticObject.getStaticObjectId:()I
   #330 = NameAndType        #331:#58     // getStaticObjectId:()I
   #331 = Utf8               getStaticObjectId
   #332 = Methodref          #135.#333    // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #333 = NameAndType        #334:#335    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #334 = Utf8               sendPacket
   #335 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #336 = Methodref          #143.#146    // ext/mods/gameserver/model/actor/Summon.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #337 = String             #338         // html/admin/doorinfo.htm
   #338 = Utf8               html/admin/doorinfo.htm
   #339 = Methodref          #28.#162     // ext/mods/gameserver/model/actor/instance/Door.getName:()Ljava/lang/String;
   #340 = Methodref          #28.#325     // ext/mods/gameserver/model/actor/instance/Door.getObjectId:()I
   #341 = String             #342         // %doorid%
   #342 = Utf8               %doorid%
   #343 = Methodref          #28.#344     // ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #344 = NameAndType        #345:#346    // getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #345 = Utf8               getTemplate
   #346 = Utf8               ()Lext/mods/gameserver/model/actor/template/DoorTemplate;
   #347 = Methodref          #348.#349    // ext/mods/gameserver/model/actor/template/DoorTemplate.getId:()I
   #348 = Class              #350         // ext/mods/gameserver/model/actor/template/DoorTemplate
   #349 = NameAndType        #351:#58     // getId:()I
   #350 = Utf8               ext/mods/gameserver/model/actor/template/DoorTemplate
   #351 = Utf8               getId
   #352 = String             #353         // %doortype%
   #353 = Utf8               %doortype%
   #354 = Methodref          #348.#355    // ext/mods/gameserver/model/actor/template/DoorTemplate.getType:()Lext/mods/gameserver/enums/DoorType;
   #355 = NameAndType        #226:#356    // getType:()Lext/mods/gameserver/enums/DoorType;
   #356 = Utf8               ()Lext/mods/gameserver/enums/DoorType;
   #357 = Methodref          #358.#359    // ext/mods/gameserver/enums/DoorType.toString:()Ljava/lang/String;
   #358 = Class              #360         // ext/mods/gameserver/enums/DoorType
   #359 = NameAndType        #361:#46     // toString:()Ljava/lang/String;
   #360 = Utf8               ext/mods/gameserver/enums/DoorType
   #361 = Utf8               toString
   #362 = String             #363         // %doorlvl%
   #363 = Utf8               %doorlvl%
   #364 = Methodref          #348.#177    // ext/mods/gameserver/model/actor/template/DoorTemplate.getLevel:()I
   #365 = String             #366         // %residence%
   #366 = Utf8               %residence%
   #367 = Methodref          #28.#368     // ext/mods/gameserver/model/actor/instance/Door.getResidence:()Lext/mods/gameserver/model/residence/Residence;
   #368 = NameAndType        #369:#370    // getResidence:()Lext/mods/gameserver/model/residence/Residence;
   #369 = Utf8               getResidence
   #370 = Utf8               ()Lext/mods/gameserver/model/residence/Residence;
   #371 = Methodref          #372.#162    // ext/mods/gameserver/model/residence/Residence.getName:()Ljava/lang/String;
   #372 = Class              #373         // ext/mods/gameserver/model/residence/Residence
   #373 = Utf8               ext/mods/gameserver/model/residence/Residence
   #374 = String             #375         // %opentype%
   #375 = Utf8               %opentype%
   #376 = Methodref          #348.#377    // ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenType:()Lext/mods/gameserver/enums/OpenType;
   #377 = NameAndType        #378:#379    // getOpenType:()Lext/mods/gameserver/enums/OpenType;
   #378 = Utf8               getOpenType
   #379 = Utf8               ()Lext/mods/gameserver/enums/OpenType;
   #380 = Methodref          #381.#359    // ext/mods/gameserver/enums/OpenType.toString:()Ljava/lang/String;
   #381 = Class              #382         // ext/mods/gameserver/enums/OpenType
   #382 = Utf8               ext/mods/gameserver/enums/OpenType
   #383 = String             #384         // %initial%
   #384 = Utf8               %initial%
   #385 = Methodref          #348.#386    // ext/mods/gameserver/model/actor/template/DoorTemplate.isOpened:()Z
   #386 = NameAndType        #387:#50     // isOpened:()Z
   #387 = Utf8               isOpened
   #388 = String             #389         // Opened
   #389 = Utf8               Opened
   #390 = String             #391         // Closed
   #391 = Utf8               Closed
   #392 = String             #393         // %ot%
   #393 = Utf8               %ot%
   #394 = Methodref          #348.#395    // ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenTime:()I
   #395 = NameAndType        #396:#58     // getOpenTime:()I
   #396 = Utf8               getOpenTime
   #397 = String             #398         // %ct%
   #398 = Utf8               %ct%
   #399 = Methodref          #348.#400    // ext/mods/gameserver/model/actor/template/DoorTemplate.getCloseTime:()I
   #400 = NameAndType        #401:#58     // getCloseTime:()I
   #401 = Utf8               getCloseTime
   #402 = String             #403         // %rt%
   #403 = Utf8               %rt%
   #404 = Methodref          #348.#405    // ext/mods/gameserver/model/actor/template/DoorTemplate.getRandomTime:()I
   #405 = NameAndType        #406:#58     // getRandomTime:()I
   #406 = Utf8               getRandomTime
   #407 = String             #408         // %controlid%
   #408 = Utf8               %controlid%
   #409 = Methodref          #348.#410    // ext/mods/gameserver/model/actor/template/DoorTemplate.getTriggerId:()I
   #410 = NameAndType        #411:#58     // getTriggerId:()I
   #411 = Utf8               getTriggerId
   #412 = Methodref          #28.#413     // ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #413 = NameAndType        #173:#414    // getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #414 = Utf8               ()Lext/mods/gameserver/model/actor/status/DoorStatus;
   #415 = Methodref          #416.#236    // ext/mods/gameserver/model/actor/status/DoorStatus.getHp:()D
   #416 = Class              #417         // ext/mods/gameserver/model/actor/status/DoorStatus
   #417 = Utf8               ext/mods/gameserver/model/actor/status/DoorStatus
   #418 = String             #419         // %hpmax%
   #419 = Utf8               %hpmax%
   #420 = Methodref          #416.#240    // ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
   #421 = String             #422         // %hpratio%
   #422 = Utf8               %hpratio%
   #423 = Methodref          #416.#424    // ext/mods/gameserver/model/actor/status/DoorStatus.getUpgradeHpRatio:()I
   #424 = NameAndType        #425:#58     // getUpgradeHpRatio:()I
   #425 = Utf8               getUpgradeHpRatio
   #426 = String             #427         // %pdef%
   #427 = Utf8               %pdef%
   #428 = Methodref          #416.#429    // ext/mods/gameserver/model/actor/status/DoorStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
   #429 = NameAndType        #430:#431    // getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
   #430 = Utf8               getPDef
   #431 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
   #432 = String             #433         // %mdef%
   #433 = Utf8               %mdef%
   #434 = Methodref          #416.#435    // ext/mods/gameserver/model/actor/status/DoorStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #435 = NameAndType        #436:#437    // getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #436 = Utf8               getMDef
   #437 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #438 = String             #439         // %spawn%
   #439 = Utf8               %spawn%
   #440 = Methodref          #28.#441     // ext/mods/gameserver/model/actor/instance/Door.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #441 = NameAndType        #442:#443    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #442 = Utf8               getPosition
   #443 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #444 = Methodref          #445.#359    // ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
   #445 = Class              #446         // ext/mods/gameserver/model/location/SpawnLocation
   #446 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #447 = String             #448         // %height%
   #448 = Utf8               %height%
   #449 = Methodref          #348.#450    // ext/mods/gameserver/model/actor/template/DoorTemplate.getCollisionHeight:()D
   #450 = NameAndType        #451:#238    // getCollisionHeight:()D
   #451 = Utf8               getCollisionHeight
   #452 = Methodref          #23.#453     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
   #453 = NameAndType        #168:#454    // replace:(Ljava/lang/String;D)V
   #454 = Utf8               (Ljava/lang/String;D)V
   #455 = Fieldref           #18.#456     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.ADMIN_COMMANDS:[Ljava/lang/String;
   #456 = NameAndType        #457:#458    // ADMIN_COMMANDS:[Ljava/lang/String;
   #457 = Utf8               ADMIN_COMMANDS
   #458 = Utf8               [Ljava/lang/String;
   #459 = String             #460         // html/admin/npcinfo/default.htm
   #460 = Utf8               html/admin/npcinfo/default.htm
   #461 = Class              #462         // java/lang/StringBuilder
   #462 = Utf8               java/lang/StringBuilder
   #463 = Methodref          #461.#26     // java/lang/StringBuilder."<init>":(I)V
   #464 = String             #465         // <center><table width=240><tr><td width=70>
   #465 = Utf8               <center><table width=240><tr><td width=70>
   #466 = Methodref          #461.#467    // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #467 = NameAndType        #468:#469    // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #468 = Utf8               append
   #469 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #470 = String             #471         // [AI Path]</td><td width=70><a action=\"bypass -h admin_info ai 1\">Template</a></td><td width=70><a action=\"bypass -h admin_info ai 2\">Spawn</a></td><td width=70><a action=\"bypass -h admin_info ai 3\">Npc</a></td></tr></table></center><br>
   #471 = Utf8               [AI Path]</td><td width=70><a action=\"bypass -h admin_info ai 1\">Template</a></td><td width=70><a action=\"bypass -h admin_info ai 2\">Spawn</a></td><td width=70><a action=\"bypass -h admin_info ai 3\">Npc</a></td></tr></table></center><br>
   #472 = Methodref          #34.#473     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #473 = NameAndType        #345:#474    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #474 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #475 = Methodref          #476.#477    // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:()Ljava/util/Map;
   #476 = Class              #478         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #477 = NameAndType        #479:#480    // getEventQuests:()Ljava/util/Map;
   #478 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #479 = Utf8               getEventQuests
   #480 = Utf8               ()Ljava/util/Map;
   #481 = InterfaceMethodref #482.#483    // java/util/Map.values:()Ljava/util/Collection;
   #482 = Class              #484         // java/util/Map
   #483 = NameAndType        #485:#486    // values:()Ljava/util/Collection;
   #484 = Utf8               java/util/Map
   #485 = Utf8               values
   #486 = Utf8               ()Ljava/util/Collection;
   #487 = InterfaceMethodref #488.#489    // java/util/Collection.stream:()Ljava/util/stream/Stream;
   #488 = Class              #490         // java/util/Collection
   #489 = NameAndType        #491:#492    // stream:()Ljava/util/stream/Stream;
   #490 = Utf8               java/util/Collection
   #491 = Utf8               stream
   #492 = Utf8               ()Ljava/util/stream/Stream;
   #493 = InvokeDynamic      #2:#494      // #2:apply:()Ljava/util/function/Function;
   #494 = NameAndType        #495:#496    // apply:()Ljava/util/function/Function;
   #495 = Utf8               apply
   #496 = Utf8               ()Ljava/util/function/Function;
   #497 = InterfaceMethodref #498.#499    // java/util/stream/Stream.flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #498 = Class              #500         // java/util/stream/Stream
   #499 = NameAndType        #501:#502    // flatMap:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #500 = Utf8               java/util/stream/Stream
   #501 = Utf8               flatMap
   #502 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #503 = InvokeDynamic      #3:#504      // #3:test:()Ljava/util/function/Predicate;
   #504 = NameAndType        #505:#506    // test:()Ljava/util/function/Predicate;
   #505 = Utf8               test
   #506 = Utf8               ()Ljava/util/function/Predicate;
   #507 = InterfaceMethodref #498.#508    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #508 = NameAndType        #509:#510    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #509 = Utf8               filter
   #510 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #511 = InterfaceMethodref #498.#512    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #512 = NameAndType        #513:#514    // findFirst:()Ljava/util/Optional;
   #513 = Utf8               findFirst
   #514 = Utf8               ()Ljava/util/Optional;
   #515 = Methodref          #516.#517    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #516 = Class              #518         // java/util/Optional
   #517 = NameAndType        #519:#520    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #518 = Utf8               java/util/Optional
   #519 = Utf8               orElse
   #520 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #521 = Class              #522         // ext/mods/gameserver/scripting/Quest
   #522 = Utf8               ext/mods/gameserver/scripting/Quest
   #523 = String             #524         // This NPC doesn\'t hold any AI related script.
   #524 = Utf8               This NPC doesn\'t hold any AI related script.
   #525 = Methodref          #124.#526    // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #526 = NameAndType        #468:#527    // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #527 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
   #528 = String             #529         // <br1>
   #529 = Utf8               <br1>
   #530 = Methodref          #206.#531    // java/lang/Class.getSuperclass:()Ljava/lang/Class;
   #531 = NameAndType        #532:#204    // getSuperclass:()Ljava/lang/Class;
   #532 = Utf8               getSuperclass
   #533 = String             #534         // <a action=\"bypass -h admin_info ai 0\">AI Path</a></td><td width=70>[Template]</a></td><td width=70><a action=\"bypass -h admin_info ai 2\">Spawn</a></td><td width=70><a action=\"bypass -h admin_info ai 3\">Npc</a></td></tr></table></center><br>
   #534 = Utf8               <a action=\"bypass -h admin_info ai 0\">AI Path</a></td><td width=70>[Template]</a></td><td width=70><a action=\"bypass -h admin_info ai 2\">Spawn</a></td><td width=70><a action=\"bypass -h admin_info ai 3\">Npc</a></td></tr></table></center><br>
   #535 = Methodref          #476.#536    // ext/mods/gameserver/model/actor/template/NpcTemplate.getAiParams:()Lext/mods/gameserver/model/memo/NpcMemo;
   #536 = NameAndType        #537:#538    // getAiParams:()Lext/mods/gameserver/model/memo/NpcMemo;
   #537 = Utf8               getAiParams
   #538 = Utf8               ()Lext/mods/gameserver/model/memo/NpcMemo;
   #539 = Methodref          #540.#541    // ext/mods/gameserver/model/memo/NpcMemo.isEmpty:()Z
   #540 = Class              #542         // ext/mods/gameserver/model/memo/NpcMemo
   #541 = NameAndType        #543:#50     // isEmpty:()Z
   #542 = Utf8               ext/mods/gameserver/model/memo/NpcMemo
   #543 = Utf8               isEmpty
   #544 = String             #545         // This NPC\'s template doesn\'t hold any AI parameters.
   #545 = Utf8               This NPC\'s template doesn\'t hold any AI parameters.
   #546 = Methodref          #540.#547    // ext/mods/gameserver/model/memo/NpcMemo.entrySet:()Ljava/util/Set;
   #547 = NameAndType        #548:#549    // entrySet:()Ljava/util/Set;
   #548 = Utf8               entrySet
   #549 = Utf8               ()Ljava/util/Set;
   #550 = InterfaceMethodref #551.#552    // java/util/Set.iterator:()Ljava/util/Iterator;
   #551 = Class              #553         // java/util/Set
   #552 = NameAndType        #554:#555    // iterator:()Ljava/util/Iterator;
   #553 = Utf8               java/util/Set
   #554 = Utf8               iterator
   #555 = Utf8               ()Ljava/util/Iterator;
   #556 = InterfaceMethodref #557.#558    // java/util/Iterator.hasNext:()Z
   #557 = Class              #559         // java/util/Iterator
   #558 = NameAndType        #560:#50     // hasNext:()Z
   #559 = Utf8               java/util/Iterator
   #560 = Utf8               hasNext
   #561 = InterfaceMethodref #557.#562    // java/util/Iterator.next:()Ljava/lang/Object;
   #562 = NameAndType        #563:#564    // next:()Ljava/lang/Object;
   #563 = Utf8               next
   #564 = Utf8               ()Ljava/lang/Object;
   #565 = Class              #566         // java/util/Map$Entry
   #566 = Utf8               java/util/Map$Entry
   #567 = String             #568         // <font color=\"LEVEL\">[
   #568 = Utf8               <font color=\"LEVEL\">[
   #569 = InterfaceMethodref #565.#570    // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #570 = NameAndType        #571:#564    // getKey:()Ljava/lang/Object;
   #571 = Utf8               getKey
   #572 = String             #573         // ]</font>
   #573 = Utf8               ]</font>
   #574 = InterfaceMethodref #565.#575    // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #575 = NameAndType        #576:#564    // getValue:()Ljava/lang/Object;
   #576 = Utf8               getValue
   #577 = String             #578         // <a action=\"bypass -h admin_info ai 0\">AI Path</a></td><td width=70><a action=\"bypass -h admin_info ai 1\">Template</a></td><td width=70>[Spawn]</td><td width=70><a action=\"bypass -h admin_info ai 3\">Npc</a></td></tr></table></center><br>
   #578 = Utf8               <a action=\"bypass -h admin_info ai 0\">AI Path</a></td><td width=70><a action=\"bypass -h admin_info ai 1\">Template</a></td><td width=70>[Spawn]</td><td width=70><a action=\"bypass -h admin_info ai 3\">Npc</a></td></tr></table></center><br>
   #579 = Methodref          #34.#580     // ext/mods/gameserver/model/actor/Npc.getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #580 = NameAndType        #581:#582    // getSpawn:()Lext/mods/gameserver/model/spawn/ASpawn;
   #581 = Utf8               getSpawn
   #582 = Utf8               ()Lext/mods/gameserver/model/spawn/ASpawn;
   #583 = String             #584         // This NPC doesn\'t have any Spawn.
   #584 = Utf8               This NPC doesn\'t have any Spawn.
   #585 = Methodref          #586.#587    // ext/mods/gameserver/model/spawn/ASpawn.getMemo:()Lext/mods/gameserver/model/memo/SpawnMemo;
   #586 = Class              #588         // ext/mods/gameserver/model/spawn/ASpawn
   #587 = NameAndType        #589:#590    // getMemo:()Lext/mods/gameserver/model/memo/SpawnMemo;
   #588 = Utf8               ext/mods/gameserver/model/spawn/ASpawn
   #589 = Utf8               getMemo
   #590 = Utf8               ()Lext/mods/gameserver/model/memo/SpawnMemo;
   #591 = Methodref          #592.#541    // ext/mods/gameserver/model/memo/SpawnMemo.isEmpty:()Z
   #592 = Class              #593         // ext/mods/gameserver/model/memo/SpawnMemo
   #593 = Utf8               ext/mods/gameserver/model/memo/SpawnMemo
   #594 = String             #595         // This NPC Spawn doesn\'t hold any memos.
   #595 = Utf8               This NPC Spawn doesn\'t hold any memos.
   #596 = Methodref          #592.#547    // ext/mods/gameserver/model/memo/SpawnMemo.entrySet:()Ljava/util/Set;
   #597 = String             #598         // <a action=\"bypass -h admin_info ai 0\">AI Path</a></td><td width=70><a action=\"bypass -h admin_info ai 1\">Template</a></td><td width=70><a action=\"bypass -h admin_info ai 2\">Spawn</a></td><td width=70>[Npc]</td></tr></table></center><br>
   #598 = Utf8               <a action=\"bypass -h admin_info ai 0\">AI Path</a></td><td width=70><a action=\"bypass -h admin_info ai 1\">Template</a></td><td width=70><a action=\"bypass -h admin_info ai 2\">Spawn</a></td><td width=70>[Npc]</td></tr></table></center><br>
   #599 = String             #600         // <table width=280>
   #600 = Utf8               <table width=280>
   #601 = String             #602         // <tr><td width=140><font color=\"LEVEL\">[i_ai0]</font>
   #602 = Utf8               <tr><td width=140><font color=\"LEVEL\">[i_ai0]</font>
   #603 = Fieldref           #34.#604     // ext/mods/gameserver/model/actor/Npc._i_ai0:I
   #604 = NameAndType        #605:#606    // _i_ai0:I
   #605 = Utf8               _i_ai0
   #606 = Utf8               I
   #607 = Methodref          #84.#608     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #608 = NameAndType        #130:#609    // valueOf:(I)Ljava/lang/Integer;
   #609 = Utf8               (I)Ljava/lang/Integer;
   #610 = String             #611         // </td><td width=140 align=left><font color=\"LEVEL\">[i_quest0]</font>
   #611 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[i_quest0]</font>
   #612 = Fieldref           #34.#613     // ext/mods/gameserver/model/actor/Npc._i_quest0:I
   #613 = NameAndType        #614:#606    // _i_quest0:I
   #614 = Utf8               _i_quest0
   #615 = String             #616         // </td></tr>
   #616 = Utf8               </td></tr>
   #617 = String             #618         // <tr><td width=140><font color=\"LEVEL\">[i_ai1]</font>
   #618 = Utf8               <tr><td width=140><font color=\"LEVEL\">[i_ai1]</font>
   #619 = Fieldref           #34.#620     // ext/mods/gameserver/model/actor/Npc._i_ai1:I
   #620 = NameAndType        #621:#606    // _i_ai1:I
   #621 = Utf8               _i_ai1
   #622 = String             #623         // </td><td width=140 align=left><font color=\"LEVEL\">[i_quest1]</font>
   #623 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[i_quest1]</font>
   #624 = Fieldref           #34.#625     // ext/mods/gameserver/model/actor/Npc._i_quest1:I
   #625 = NameAndType        #626:#606    // _i_quest1:I
   #626 = Utf8               _i_quest1
   #627 = String             #628         // <tr><td width=140><font color=\"LEVEL\">[i_ai2]</font>
   #628 = Utf8               <tr><td width=140><font color=\"LEVEL\">[i_ai2]</font>
   #629 = Fieldref           #34.#630     // ext/mods/gameserver/model/actor/Npc._i_ai2:I
   #630 = NameAndType        #631:#606    // _i_ai2:I
   #631 = Utf8               _i_ai2
   #632 = String             #633         // </td><td width=140 align=left><font color=\"LEVEL\">[i_quest2]</font>
   #633 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[i_quest2]</font>
   #634 = Fieldref           #34.#635     // ext/mods/gameserver/model/actor/Npc._i_quest2:I
   #635 = NameAndType        #636:#606    // _i_quest2:I
   #636 = Utf8               _i_quest2
   #637 = String             #638         // <tr><td width=140><font color=\"LEVEL\">[i_ai3]</font>
   #638 = Utf8               <tr><td width=140><font color=\"LEVEL\">[i_ai3]</font>
   #639 = Fieldref           #34.#640     // ext/mods/gameserver/model/actor/Npc._i_ai3:I
   #640 = NameAndType        #641:#606    // _i_ai3:I
   #641 = Utf8               _i_ai3
   #642 = String             #643         // </td><td width=140 align=left><font color=\"LEVEL\">[i_quest3]</font>
   #643 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[i_quest3]</font>
   #644 = Fieldref           #34.#645     // ext/mods/gameserver/model/actor/Npc._i_quest3:I
   #645 = NameAndType        #646:#606    // _i_quest3:I
   #646 = Utf8               _i_quest3
   #647 = String             #648         // <tr><td width=140><font color=\"LEVEL\">[i_ai4]</font>
   #648 = Utf8               <tr><td width=140><font color=\"LEVEL\">[i_ai4]</font>
   #649 = Fieldref           #34.#650     // ext/mods/gameserver/model/actor/Npc._i_ai4:I
   #650 = NameAndType        #651:#606    // _i_ai4:I
   #651 = Utf8               _i_ai4
   #652 = String             #653         // </td><td width=140 align=left><font color=\"LEVEL\">[i_quest4]</font>
   #653 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[i_quest4]</font>
   #654 = Fieldref           #34.#655     // ext/mods/gameserver/model/actor/Npc._i_quest4:I
   #655 = NameAndType        #656:#606    // _i_quest4:I
   #656 = Utf8               _i_quest4
   #657 = String             #658         // </table><br><table width=280>
   #658 = Utf8               </table><br><table width=280>
   #659 = String             #660         // <tr><td width=140><font color=\"LEVEL\">[c_ai0]</font>
   #660 = Utf8               <tr><td width=140><font color=\"LEVEL\">[c_ai0]</font>
   #661 = Fieldref           #34.#662     // ext/mods/gameserver/model/actor/Npc._c_ai0:Lext/mods/gameserver/model/actor/Creature;
   #662 = NameAndType        #663:#664    // _c_ai0:Lext/mods/gameserver/model/actor/Creature;
   #663 = Utf8               _c_ai0
   #664 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #665 = Methodref          #124.#666    // ext/mods/commons/lang/StringUtil.getCreatureDescription:(Ljava/lang/StringBuilder;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/String;
   #666 = NameAndType        #667:#668    // getCreatureDescription:(Ljava/lang/StringBuilder;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/String;
   #667 = Utf8               getCreatureDescription
   #668 = Utf8               (Ljava/lang/StringBuilder;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/String;
   #669 = String             #670         // </td><td width=140 align=left><font color=\"LEVEL\">[c_quest0]</font>
   #670 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[c_quest0]</font>
   #671 = Fieldref           #34.#672     // ext/mods/gameserver/model/actor/Npc._c_quest0:Lext/mods/gameserver/model/actor/Creature;
   #672 = NameAndType        #673:#664    // _c_quest0:Lext/mods/gameserver/model/actor/Creature;
   #673 = Utf8               _c_quest0
   #674 = String             #675         // <tr><td width=140><font color=\"LEVEL\">[c_ai1]</font>
   #675 = Utf8               <tr><td width=140><font color=\"LEVEL\">[c_ai1]</font>
   #676 = Fieldref           #34.#677     // ext/mods/gameserver/model/actor/Npc._c_ai1:Lext/mods/gameserver/model/actor/Creature;
   #677 = NameAndType        #678:#664    // _c_ai1:Lext/mods/gameserver/model/actor/Creature;
   #678 = Utf8               _c_ai1
   #679 = String             #680         // </td><td width=140 align=left><font color=\"LEVEL\">[c_quest1]</font>
   #680 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[c_quest1]</font>
   #681 = Fieldref           #34.#682     // ext/mods/gameserver/model/actor/Npc._c_quest1:Lext/mods/gameserver/model/actor/Creature;
   #682 = NameAndType        #683:#664    // _c_quest1:Lext/mods/gameserver/model/actor/Creature;
   #683 = Utf8               _c_quest1
   #684 = String             #685         // <tr><td width=140><font color=\"LEVEL\">[c_ai2]</font>
   #685 = Utf8               <tr><td width=140><font color=\"LEVEL\">[c_ai2]</font>
   #686 = Fieldref           #34.#687     // ext/mods/gameserver/model/actor/Npc._c_ai2:Lext/mods/gameserver/model/actor/Creature;
   #687 = NameAndType        #688:#664    // _c_ai2:Lext/mods/gameserver/model/actor/Creature;
   #688 = Utf8               _c_ai2
   #689 = String             #690         // </td><td width=140 align=left><font color=\"LEVEL\">[c_quest2]</font>
   #690 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[c_quest2]</font>
   #691 = Fieldref           #34.#692     // ext/mods/gameserver/model/actor/Npc._c_quest2:Lext/mods/gameserver/model/actor/Creature;
   #692 = NameAndType        #693:#664    // _c_quest2:Lext/mods/gameserver/model/actor/Creature;
   #693 = Utf8               _c_quest2
   #694 = String             #695         // <tr><td width=140><font color=\"LEVEL\">[c_ai3]</font>
   #695 = Utf8               <tr><td width=140><font color=\"LEVEL\">[c_ai3]</font>
   #696 = Fieldref           #34.#697     // ext/mods/gameserver/model/actor/Npc._c_ai3:Lext/mods/gameserver/model/actor/Creature;
   #697 = NameAndType        #698:#664    // _c_ai3:Lext/mods/gameserver/model/actor/Creature;
   #698 = Utf8               _c_ai3
   #699 = String             #700         // </td><td width=140 align=left><font color=\"LEVEL\">[c_quest3]</font>
   #700 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[c_quest3]</font>
   #701 = Fieldref           #34.#702     // ext/mods/gameserver/model/actor/Npc._c_quest3:Lext/mods/gameserver/model/actor/Creature;
   #702 = NameAndType        #703:#664    // _c_quest3:Lext/mods/gameserver/model/actor/Creature;
   #703 = Utf8               _c_quest3
   #704 = String             #705         // <tr><td width=140><font color=\"LEVEL\">[c_ai4]</font>
   #705 = Utf8               <tr><td width=140><font color=\"LEVEL\">[c_ai4]</font>
   #706 = Fieldref           #34.#707     // ext/mods/gameserver/model/actor/Npc._c_ai4:Lext/mods/gameserver/model/actor/Creature;
   #707 = NameAndType        #708:#664    // _c_ai4:Lext/mods/gameserver/model/actor/Creature;
   #708 = Utf8               _c_ai4
   #709 = String             #710         // </td><td width=140 align=left><font color=\"LEVEL\">[c_quest4]</font>
   #710 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[c_quest4]</font>
   #711 = Fieldref           #34.#712     // ext/mods/gameserver/model/actor/Npc._c_quest4:Lext/mods/gameserver/model/actor/Creature;
   #712 = NameAndType        #713:#664    // _c_quest4:Lext/mods/gameserver/model/actor/Creature;
   #713 = Utf8               _c_quest4
   #714 = String             #715         // <tr><td width=140><font color=\"LEVEL\">[param1]</font>
   #715 = Utf8               <tr><td width=140><font color=\"LEVEL\">[param1]</font>
   #716 = Fieldref           #34.#717     // ext/mods/gameserver/model/actor/Npc._param1:I
   #717 = NameAndType        #718:#606    // _param1:I
   #718 = Utf8               _param1
   #719 = String             #720         // </td><td width=140 align=left><font color=\"LEVEL\">[flag]</font>
   #720 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[flag]</font>
   #721 = Fieldref           #34.#722     // ext/mods/gameserver/model/actor/Npc._flag:I
   #722 = NameAndType        #723:#606    // _flag:I
   #723 = Utf8               _flag
   #724 = String             #725         // <tr><td width=140><font color=\"LEVEL\">[param2]</font>
   #725 = Utf8               <tr><td width=140><font color=\"LEVEL\">[param2]</font>
   #726 = Fieldref           #34.#727     // ext/mods/gameserver/model/actor/Npc._param2:I
   #727 = NameAndType        #728:#606    // _param2:I
   #728 = Utf8               _param2
   #729 = String             #730         // </td><td width=140 align=left><font color=\"LEVEL\">[respawnTime]</font>
   #730 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[respawnTime]</font>
   #731 = Fieldref           #34.#732     // ext/mods/gameserver/model/actor/Npc._respawnTime:I
   #732 = NameAndType        #733:#606    // _respawnTime:I
   #733 = Utf8               _respawnTime
   #734 = String             #735         // <tr><td width=140><font color=\"LEVEL\">[param3]</font>
   #735 = Utf8               <tr><td width=140><font color=\"LEVEL\">[param3]</font>
   #736 = Fieldref           #34.#737     // ext/mods/gameserver/model/actor/Npc._param3:I
   #737 = NameAndType        #738:#606    // _param3:I
   #738 = Utf8               _param3
   #739 = String             #740         // </td><td width=140 align=left><font color=\"LEVEL\">[weightPoint]</font>
   #740 = Utf8               </td><td width=140 align=left><font color=\"LEVEL\">[weightPoint]</font>
   #741 = Fieldref           #34.#742     // ext/mods/gameserver/model/actor/Npc._weightPoint:I
   #742 = NameAndType        #743:#606    // _weightPoint:I
   #743 = Utf8               _weightPoint
   #744 = String             #745         // </table>
   #745 = Utf8               </table>
   #746 = String             #747         // %content%
   #747 = Utf8               %content%
   #748 = Methodref          #461.#359    // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #749 = Class              #750         // ext/mods/gameserver/model/actor/Attackable
   #750 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #751 = String             #752         // This NPC can\'t build aggro towards targets.<br><button value=\"Refresh\" action=\"bypass -h admin_info aggro\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
   #752 = Utf8               This NPC can\'t build aggro towards targets.<br><button value=\"Refresh\" action=\"bypass -h admin_info aggro\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
   #753 = Methodref          #749.#754    // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #754 = NameAndType        #214:#755    // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #755 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
   #756 = Methodref          #757.#758    // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #757 = Class              #759         // ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #758 = NameAndType        #760:#761    // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #759 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #760 = Utf8               getAggroList
   #761 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
   #762 = Methodref          #763.#541    // ext/mods/gameserver/model/actor/container/attackable/AggroList.isEmpty:()Z
   #763 = Class              #764         // ext/mods/gameserver/model/actor/container/attackable/AggroList
   #764 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
   #765 = String             #766         // This NPC\'s AggroList is empty.<br><button value=\"Refresh\" action=\"bypass -h admin_info aggro\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
   #766 = Utf8               This NPC\'s AggroList is empty.<br><button value=\"Refresh\" action=\"bypass -h admin_info aggro\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
   #767 = String             #768         // <button value=\"Refresh\" action=\"bypass -h admin_info aggro\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Attacker</font></td><td><font color=\"LEVEL\">Damage</font></td><td><font color=\"LEVEL\">Hate</font></td></tr>
   #768 = Utf8               <button value=\"Refresh\" action=\"bypass -h admin_info aggro\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Attacker</font></td><td><font color=\"LEVEL\">Damage</font></td><td><font color=\"LEVEL\">Hate</font></td></tr>
   #769 = Methodref          #763.#483    // ext/mods/gameserver/model/actor/container/attackable/AggroList.values:()Ljava/util/Collection;
   #770 = InvokeDynamic      #4:#494      // #4:apply:()Ljava/util/function/Function;
   #771 = InterfaceMethodref #772.#773    // java/util/Comparator.reverseOrder:()Ljava/util/Comparator;
   #772 = Class              #774         // java/util/Comparator
   #773 = NameAndType        #775:#776    // reverseOrder:()Ljava/util/Comparator;
   #774 = Utf8               java/util/Comparator
   #775 = Utf8               reverseOrder
   #776 = Utf8               ()Ljava/util/Comparator;
   #777 = InterfaceMethodref #772.#778    // java/util/Comparator.comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
   #778 = NameAndType        #779:#780    // comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
   #779 = Utf8               comparing
   #780 = Utf8               (Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
   #781 = InterfaceMethodref #498.#782    // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #782 = NameAndType        #783:#784    // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #783 = Utf8               sorted
   #784 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #785 = Long               15l
   #787 = InterfaceMethodref #498.#788    // java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
   #788 = NameAndType        #789:#790    // limit:(J)Ljava/util/stream/Stream;
   #789 = Utf8               limit
   #790 = Utf8               (J)Ljava/util/stream/Stream;
   #791 = InterfaceMethodref #498.#792    // java/util/stream/Stream.toList:()Ljava/util/List;
   #792 = NameAndType        #793:#794    // toList:()Ljava/util/List;
   #793 = Utf8               toList
   #794 = Utf8               ()Ljava/util/List;
   #795 = InterfaceMethodref #796.#552    // java/util/List.iterator:()Ljava/util/Iterator;
   #796 = Class              #797         // java/util/List
   #797 = Utf8               java/util/List
   #798 = Class              #799         // ext/mods/gameserver/model/actor/container/npc/AggroInfo
   #799 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
   #800 = String             #801         // <tr><td>
   #801 = Utf8               <tr><td>
   #802 = Methodref          #798.#803    // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
   #803 = NameAndType        #804:#805    // getAttacker:()Lext/mods/gameserver/model/actor/Creature;
   #804 = Utf8               getAttacker
   #805 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #806 = Methodref          #807.#162    // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
   #807 = Class              #808         // ext/mods/gameserver/model/actor/Creature
   #808 = Utf8               ext/mods/gameserver/model/actor/Creature
   #809 = String             #810         // </td><td>
   #810 = Utf8               </td><td>
   #811 = Methodref          #798.#812    // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getDamage:()D
   #812 = NameAndType        #813:#238    // getDamage:()D
   #813 = Utf8               getDamage
   #814 = Methodref          #815.#816    // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #815 = Class              #817         // java/lang/Double
   #816 = NameAndType        #130:#818    // valueOf:(D)Ljava/lang/Double;
   #817 = Utf8               java/lang/Double
   #818 = Utf8               (D)Ljava/lang/Double;
   #819 = Methodref          #798.#820    // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
   #820 = NameAndType        #821:#238    // getHate:()D
   #821 = Utf8               getHate
   #822 = String             #823         // </table><img src=\"L2UI.SquareGray\" width=280 height=1>
   #823 = Utf8               </table><img src=\"L2UI.SquareGray\" width=280 height=1>
   #824 = Methodref          #34.#825     // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #825 = NameAndType        #214:#826    // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #826 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #827 = Methodref          #828.#829    // ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
   #828 = Class              #830         // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #829 = NameAndType        #831:#549    // getDesires:()Ljava/util/Set;
   #830 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
   #831 = Utf8               getDesires
   #832 = InterfaceMethodref #551.#541    // java/util/Set.isEmpty:()Z
   #833 = String             #834         // This NPC\'s Desires are empty.<br><button value=\"Refresh\" action=\"bypass -h admin_info desire\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
   #834 = Utf8               This NPC\'s Desires are empty.<br><button value=\"Refresh\" action=\"bypass -h admin_info desire\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
   #835 = String             #836         // <button value=\"Refresh\" action=\"bypass -h admin_info desire\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Type</font></td><td><font color=\"LEVEL\">Weight</font></td></tr>
   #836 = Utf8               <button value=\"Refresh\" action=\"bypass -h admin_info desire\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Type</font></td><td><font color=\"LEVEL\">Weight</font></td></tr>
   #837 = Class              #838         // ext/mods/gameserver/model/actor/ai/Desire
   #838 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
   #839 = Methodref          #837.#224    // ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
   #840 = Methodref          #837.#841    // ext/mods/gameserver/model/actor/ai/Desire.getWeight:()D
   #841 = NameAndType        #842:#238    // getWeight:()D
   #842 = Utf8               getWeight
   #843 = Methodref          #476.#844    // ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
   #844 = NameAndType        #845:#794    // getDropData:()Ljava/util/List;
   #845 = Utf8               getDropData
   #846 = InterfaceMethodref #796.#489    // java/util/List.stream:()Ljava/util/stream/Stream;
   #847 = InvokeDynamic      #5:#848      // #5:test:(Z)Ljava/util/function/Predicate;
   #848 = NameAndType        #505:#849    // test:(Z)Ljava/util/function/Predicate;
   #849 = Utf8               (Z)Ljava/util/function/Predicate;
   #850 = InvokeDynamic      #6:#504      // #6:test:()Ljava/util/function/Predicate;
   #851 = InvokeDynamic      #7:#504      // #7:test:()Ljava/util/function/Predicate;
   #852 = Class              #853         // ext/mods/commons/data/Pagination
   #853 = Utf8               ext/mods/commons/data/Pagination
   #854 = Class              #855         // ext/mods/gameserver/handler/IAdminCommandHandler
   #855 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
   #856 = Methodref          #852.#857    // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
   #857 = NameAndType        #5:#858      // "<init>":(Ljava/util/stream/Stream;II)V
   #858 = Utf8               (Ljava/util/stream/Stream;II)V
   #859 = Methodref          #852.#552    // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
   #860 = Class              #861         // ext/mods/gameserver/model/item/DropCategory
   #861 = Utf8               ext/mods/gameserver/model/item/DropCategory
   #862 = Methodref          #863.#864    // ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
   #863 = Class              #865         // ext/mods/gameserver/data/DropCalc
   #864 = NameAndType        #866:#867    // getInstance:()Lext/mods/gameserver/data/DropCalc;
   #865 = Utf8               ext/mods/gameserver/data/DropCalc
   #866 = Utf8               getInstance
   #867 = Utf8               ()Lext/mods/gameserver/data/DropCalc;
   #868 = Methodref          #860.#869    // ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
   #869 = NameAndType        #870:#871    // getDropType:()Lext/mods/gameserver/enums/DropType;
   #870 = Utf8               getDropType
   #871 = Utf8               ()Lext/mods/gameserver/enums/DropType;
   #872 = Methodref          #34.#873     // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
   #873 = NameAndType        #874:#50     // isRaidBoss:()Z
   #874 = Utf8               isRaidBoss
   #875 = Class              #876         // ext/mods/gameserver/model/actor/instance/GrandBoss
   #876 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
   #877 = Methodref          #863.#878    // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
   #878 = NameAndType        #879:#880    // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
   #879 = Utf8               calcDropChance
   #880 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
   #881 = Double             100.0d
   #883 = Methodref          #884.#885    // java/lang/Math.min:(DD)D
   #884 = Class              #886         // java/lang/Math
   #885 = NameAndType        #887:#888    // min:(DD)D
   #886 = Utf8               java/lang/Math
   #887 = Utf8               min
   #888 = Utf8               (DD)D
   #889 = Methodref          #860.#890    // ext/mods/gameserver/model/item/DropCategory.getChance:()D
   #890 = NameAndType        #891:#238    // getChance:()D
   #891 = Utf8               getChance
   #892 = Methodref          #893.#894    // ext/mods/gameserver/enums/DropType.getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
   #893 = Class              #895         // ext/mods/gameserver/enums/DropType
   #894 = NameAndType        #896:#897    // getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
   #895 = Utf8               ext/mods/gameserver/enums/DropType
   #896 = Utf8               getDropRate
   #897 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
   #898 = Methodref          #860.#899    // ext/mods/gameserver/model/item/DropCategory.getCategoryCumulativeChance:()D
   #899 = NameAndType        #900:#238    // getCategoryCumulativeChance:()D
   #900 = Utf8               getCategoryCumulativeChance
   #901 = Fieldref           #902.#903    // ext/mods/Config.ALTERNATE_DROP_LIST:Z
   #902 = Class              #904         // ext/mods/Config
   #903 = NameAndType        #905:#906    // ALTERNATE_DROP_LIST:Z
   #904 = Utf8               ext/mods/Config
   #905 = Utf8               ALTERNATE_DROP_LIST
   #906 = Utf8               Z
   #907 = String             #908         // <br></center>Category:
   #908 = Utf8               <br></center>Category:
   #909 = String             #910         //  - Rate:
   #910 = Utf8                - Rate:
   #911 = Fieldref           #18.#912     // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.PERCENT:Ljava/text/DecimalFormat;
   #912 = NameAndType        #913:#914    // PERCENT:Ljava/text/DecimalFormat;
   #913 = Utf8               PERCENT
   #914 = Utf8               Ljava/text/DecimalFormat;
   #915 = Methodref          #916.#917    // java/text/DecimalFormat.format:(D)Ljava/lang/String;
   #916 = Class              #918         // java/text/DecimalFormat
   #917 = NameAndType        #919:#920    // format:(D)Ljava/lang/String;
   #918 = Utf8               java/text/DecimalFormat
   #919 = Utf8               format
   #920 = Utf8               (D)Ljava/lang/String;
   #921 = String             #922         // %<center>
   #922 = Utf8               %<center>
   #923 = Methodref          #852.#924    // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
   #924 = NameAndType        #468:#925    // append:([Ljava/lang/Object;)V
   #925 = Utf8               ([Ljava/lang/Object;)V
   #926 = Methodref          #860.#927    // ext/mods/gameserver/model/item/DropCategory.getAllDrops:()Ljava/util/List;
   #927 = NameAndType        #928:#794    // getAllDrops:()Ljava/util/List;
   #928 = Utf8               getAllDrops
   #929 = Class              #930         // ext/mods/gameserver/model/item/DropData
   #930 = Utf8               ext/mods/gameserver/model/item/DropData
   #931 = Methodref          #932.#933    // ext/mods/gameserver/data/xml/SkipData.getInstance:()Lext/mods/gameserver/data/xml/SkipData;
   #932 = Class              #934         // ext/mods/gameserver/data/xml/SkipData
   #933 = NameAndType        #866:#935    // getInstance:()Lext/mods/gameserver/data/xml/SkipData;
   #934 = Utf8               ext/mods/gameserver/data/xml/SkipData
   #935 = Utf8               ()Lext/mods/gameserver/data/xml/SkipData;
   #936 = Methodref          #929.#937    // ext/mods/gameserver/model/item/DropData.getItemId:()I
   #937 = NameAndType        #938:#58     // getItemId:()I
   #938 = Utf8               getItemId
   #939 = Methodref          #932.#940    // ext/mods/gameserver/data/xml/SkipData.isSkipped:(I)Z
   #940 = NameAndType        #941:#942    // isSkipped:(I)Z
   #941 = Utf8               isSkipped
   #942 = Utf8               (I)Z
   #943 = Methodref          #863.#944    // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
   #944 = NameAndType        #879:#945    // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
   #945 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
   #946 = Methodref          #884.#947    // java/lang/Math.max:(DD)D
   #947 = NameAndType        #948:#888    // max:(DD)D
   #948 = Utf8               max
   #949 = Double             10.0d
   #951 = Methodref          #884.#952    // java/lang/Math.pow:(DD)D
   #952 = NameAndType        #953:#888    // pow:(DD)D
   #953 = Utf8               pow
   #954 = Methodref          #929.#955    // ext/mods/gameserver/model/item/DropData.getMinDrop:()I
   #955 = NameAndType        #956:#58     // getMinDrop:()I
   #956 = Utf8               getMinDrop
   #957 = Methodref          #929.#958    // ext/mods/gameserver/model/item/DropData.getMaxDrop:()I
   #958 = NameAndType        #959:#58     // getMaxDrop:()I
   #959 = Utf8               getMaxDrop
   #960 = Methodref          #884.#961    // java/lang/Math.max:(II)I
   #961 = NameAndType        #948:#962    // max:(II)I
   #962 = Utf8               (II)I
   #963 = Double             80.0d
   #965 = String             #966         // 90EE90
   #966 = Utf8               90EE90
   #967 = Double             5.0d
   #969 = String             #970         // BDB76B
   #970 = Utf8               BDB76B
   #971 = String             #972         // F08080
   #972 = Utf8               F08080
   #973 = InvokeDynamic      #8:#974      // #8:makeConcatWithConstants:(I)Ljava/lang/String;
   #974 = NameAndType        #197:#975    // makeConcatWithConstants:(I)Ljava/lang/String;
   #975 = Utf8               (I)Ljava/lang/String;
   #976 = InvokeDynamic      #9:#243      // #9:makeConcatWithConstants:(II)Ljava/lang/String;
   #977 = Methodref          #978.#979    // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #978 = Class              #980         // ext/mods/gameserver/data/xml/ItemData
   #979 = NameAndType        #866:#981    // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
   #980 = Utf8               ext/mods/gameserver/data/xml/ItemData
   #981 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
   #982 = Methodref          #978.#983    // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #983 = NameAndType        #345:#984    // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
   #984 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #985 = Methodref          #986.#162    // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #986 = Class              #987         // ext/mods/gameserver/model/item/kind/Item
   #987 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #988 = String             #989         // Recipe:
   #989 = Utf8               Recipe:
   #990 = Methodref          #10.#991     // java/lang/String.substring:(I)Ljava/lang/String;
   #991 = NameAndType        #992:#975    // substring:(I)Ljava/lang/String;
   #992 = Utf8               substring
   #993 = InvokeDynamic      #10:#994     // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #994 = NameAndType        #197:#995    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #995 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #996 = Methodref          #124.#997    // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
   #997 = NameAndType        #998:#999    // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
   #998 = Utf8               trimAndDress
   #999 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #1000 = String             #1001        // <table width=280 bgcolor=000000><tr>
  #1001 = Utf8               <table width=280 bgcolor=000000><tr>
  #1002 = String             #1003        // <table width=280><tr>
  #1003 = Utf8               <table width=280><tr>
  #1004 = Methodref          #986.#1005   // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #1005 = NameAndType        #1006:#46    // getIcon:()Ljava/lang/String;
  #1006 = Utf8               getIcon
  #1007 = InvokeDynamic      #11:#196     // #11:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1008 = String             #1009        // <td width=246>&nbsp;
  #1009 = Utf8               <td width=246>&nbsp;
  #1010 = String             #1011        // <table width=240><tr><td width=80><font color=B09878>Rate:</font> <font color=
  #1011 = Utf8               <table width=240><tr><td width=80><font color=B09878>Rate:</font> <font color=
  #1012 = String             #1013        // >
  #1013 = Utf8               >
  #1014 = String             #1015        // %</font></td><td width=160><font color=B09878>Amount: </font>
  #1015 = Utf8               %</font></td><td width=160><font color=B09878>Amount: </font>
  #1016 = String             #1017        // </td></tr></table>
  #1017 = Utf8               </td></tr></table>
  #1018 = String             #1019        // </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
  #1019 = Utf8               </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
  #1020 = Methodref          #852.#1021   // ext/mods/commons/data/Pagination.totalEntries:()I
  #1021 = NameAndType        #1022:#58    // totalEntries:()I
  #1022 = Utf8               totalEntries
  #1023 = Methodref          #852.#1024   // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #1024 = NameAndType        #1025:#27    // generateSpace:(I)V
  #1025 = Utf8               generateSpace
  #1026 = InvokeDynamic      #12:#1027    // #12:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #1027 = NameAndType        #197:#999    // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #1028 = Methodref          #852.#1029   // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #1029 = NameAndType        #1030:#1031  // generatePages:(Ljava/lang/String;)V
  #1030 = Utf8               generatePages
  #1031 = Utf8               (Ljava/lang/String;)V
  #1032 = Methodref          #852.#1033   // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #1033 = NameAndType        #1034:#46    // getContent:()Ljava/lang/String;
  #1034 = Utf8               getContent
  #1035 = Methodref          #929.#890    // ext/mods/gameserver/model/item/DropData.getChance:()D
  #1036 = InvokeDynamic      #13:#243     // #13:makeConcatWithConstants:(II)Ljava/lang/String;
  #1037 = InvokeDynamic      #14:#994     // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1038 = String             #1039        // html/admin/npcinfo/general-0.htm
  #1039 = Utf8               html/admin/npcinfo/general-0.htm
  #1040 = String             #1041        // %objectId%
  #1041 = Utf8               %objectId%
  #1042 = Methodref          #34.#325     // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #1043 = String             #1044        // %npcId%
  #1044 = Utf8               %npcId%
  #1045 = Methodref          #476.#1046   // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #1046 = NameAndType        #1047:#58    // getNpcId:()I
  #1047 = Utf8               getNpcId
  #1048 = String             #1049        // %idTemplate%
  #1049 = Utf8               %idTemplate%
  #1050 = Methodref          #476.#1051   // ext/mods/gameserver/model/actor/template/NpcTemplate.getIdTemplate:()I
  #1051 = NameAndType        #1052:#58    // getIdTemplate:()I
  #1052 = Utf8               getIdTemplate
  #1053 = Methodref          #476.#162    // ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
  #1054 = String             #1055        // %title%
  #1055 = Utf8               %title%
  #1056 = Methodref          #476.#1057   // ext/mods/gameserver/model/actor/template/NpcTemplate.getTitle:()Ljava/lang/String;
  #1057 = NameAndType        #1058:#46    // getTitle:()Ljava/lang/String;
  #1058 = Utf8               getTitle
  #1059 = String             #1060        // %alias%
  #1060 = Utf8               %alias%
  #1061 = Methodref          #476.#1062   // ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
  #1062 = NameAndType        #1063:#46    // getAlias:()Ljava/lang/String;
  #1063 = Utf8               getAlias
  #1064 = String             #1065        // %usingServerSideName%
  #1065 = Utf8               %usingServerSideName%
  #1066 = Methodref          #476.#1067   // ext/mods/gameserver/model/actor/template/NpcTemplate.isUsingServerSideName:()Z
  #1067 = NameAndType        #1068:#50    // isUsingServerSideName:()Z
  #1068 = Utf8               isUsingServerSideName
  #1069 = Methodref          #23.#1070    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
  #1070 = NameAndType        #168:#1071   // replace:(Ljava/lang/String;Z)V
  #1071 = Utf8               (Ljava/lang/String;Z)V
  #1072 = String             #1073        // %usingServerSideTitle%
  #1073 = Utf8               %usingServerSideTitle%
  #1074 = Methodref          #476.#1075   // ext/mods/gameserver/model/actor/template/NpcTemplate.isUsingServerSideTitle:()Z
  #1075 = NameAndType        #1076:#50    // isUsingServerSideTitle:()Z
  #1076 = Utf8               isUsingServerSideTitle
  #1077 = String             #1078        // %type%
  #1078 = Utf8               %type%
  #1079 = Methodref          #476.#1080   // ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
  #1080 = NameAndType        #179:#1081   // getLevel:()B
  #1081 = Utf8               ()B
  #1082 = String             #1083        // %radius%
  #1083 = Utf8               %radius%
  #1084 = Methodref          #476.#1085   // ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
  #1085 = NameAndType        #1086:#238   // getCollisionRadius:()D
  #1086 = Utf8               getCollisionRadius
  #1087 = Methodref          #476.#450    // ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionHeight:()D
  #1088 = String             #1089        // %hitTimeFactor%
  #1089 = Utf8               %hitTimeFactor%
  #1090 = Methodref          #476.#1091   // ext/mods/gameserver/model/actor/template/NpcTemplate.getHitTimeFactor:()D
  #1091 = NameAndType        #1092:#238   // getHitTimeFactor:()D
  #1092 = Utf8               getHitTimeFactor
  #1093 = String             #1094        // %rHand%
  #1094 = Utf8               %rHand%
  #1095 = Methodref          #476.#1096   // ext/mods/gameserver/model/actor/template/NpcTemplate.getRightHand:()I
  #1096 = NameAndType        #1097:#58    // getRightHand:()I
  #1097 = Utf8               getRightHand
  #1098 = String             #1099        // %lHand%
  #1099 = Utf8               %lHand%
  #1100 = Methodref          #476.#1101   // ext/mods/gameserver/model/actor/template/NpcTemplate.getLeftHand:()I
  #1101 = NameAndType        #1102:#58    // getLeftHand:()I
  #1102 = Utf8               getLeftHand
  #1103 = String             #1104        // html/admin/npcinfo/general-1.htm
  #1104 = Utf8               html/admin/npcinfo/general-1.htm
  #1105 = Methodref          #476.#1106   // ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardExp:()D
  #1106 = NameAndType        #1107:#238   // getRewardExp:()D
  #1107 = Utf8               getRewardExp
  #1108 = String             #1109        // %sp%
  #1109 = Utf8               %sp%
  #1110 = Methodref          #476.#1111   // ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardSp:()D
  #1111 = NameAndType        #1112:#238   // getRewardSp:()D
  #1112 = Utf8               getRewardSp
  #1113 = String             #1114        // %baseAttackRange%
  #1114 = Utf8               %baseAttackRange%
  #1115 = Methodref          #476.#1116   // ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseAttackRange:()I
  #1116 = NameAndType        #1117:#58    // getBaseAttackRange:()I
  #1117 = Utf8               getBaseAttackRange
  #1118 = String             #1119        // %baseDamageRange%
  #1119 = Utf8               %baseDamageRange%
  #1120 = Methodref          #476.#1121   // ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseDamageRange:()[I
  #1121 = NameAndType        #1122:#1123  // getBaseDamageRange:()[I
  #1122 = Utf8               getBaseDamageRange
  #1123 = Utf8               ()[I
  #1124 = Methodref          #1125.#1126  // java/util/Arrays.toString:([I)Ljava/lang/String;
  #1125 = Class              #1127        // java/util/Arrays
  #1126 = NameAndType        #361:#1128   // toString:([I)Ljava/lang/String;
  #1127 = Utf8               java/util/Arrays
  #1128 = Utf8               ([I)Ljava/lang/String;
  #1129 = String             #1130        // %baseRandomDamage%
  #1130 = Utf8               %baseRandomDamage%
  #1131 = Methodref          #476.#1132   // ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseRandomDamage:()I
  #1132 = NameAndType        #1133:#58    // getBaseRandomDamage:()I
  #1133 = Utf8               getBaseRandomDamage
  #1134 = String             #1135        // %race%
  #1135 = Utf8               %race%
  #1136 = Methodref          #476.#1137   // ext/mods/gameserver/model/actor/template/NpcTemplate.getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
  #1137 = NameAndType        #1138:#1139  // getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
  #1138 = Utf8               getRace
  #1139 = Utf8               ()Lext/mods/gameserver/enums/actors/NpcRace;
  #1140 = Methodref          #1141.#359   // ext/mods/gameserver/enums/actors/NpcRace.toString:()Ljava/lang/String;
  #1141 = Class              #1142        // ext/mods/gameserver/enums/actors/NpcRace
  #1142 = Utf8               ext/mods/gameserver/enums/actors/NpcRace
  #1143 = String             #1144        // %clan%
  #1144 = Utf8               %clan%
  #1145 = Methodref          #476.#1146   // ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
  #1146 = NameAndType        #1147:#1148  // getClans:()[Ljava/lang/String;
  #1147 = Utf8               getClans
  #1148 = Utf8               ()[Ljava/lang/String;
  #1149 = Methodref          #1125.#1150  // java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
  #1150 = NameAndType        #361:#1151   // toString:([Ljava/lang/Object;)Ljava/lang/String;
  #1151 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #1152 = String             #1153        // %clanRange%
  #1153 = Utf8               %clanRange%
  #1154 = Methodref          #476.#1155   // ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
  #1155 = NameAndType        #1156:#58    // getClanRange:()I
  #1156 = Utf8               getClanRange
  #1157 = String             #1158        // %ignoredIds%
  #1158 = Utf8               %ignoredIds%
  #1159 = Methodref          #476.#1160   // ext/mods/gameserver/model/actor/template/NpcTemplate.getIgnoredIds:()[I
  #1160 = NameAndType        #1161:#1123  // getIgnoredIds:()[I
  #1161 = Utf8               getIgnoredIds
  #1162 = String             #1163        // html/admin/npcinfo/general-2.htm
  #1163 = Utf8               html/admin/npcinfo/general-2.htm
  #1164 = String             #1165        // %isUndying%
  #1165 = Utf8               %isUndying%
  #1166 = Methodref          #476.#1167   // ext/mods/gameserver/model/actor/template/NpcTemplate.isUndying:()Z
  #1167 = NameAndType        #1168:#50    // isUndying:()Z
  #1168 = Utf8               isUndying
  #1169 = String             #1170        // %canBeAttacked%
  #1170 = Utf8               %canBeAttacked%
  #1171 = Methodref          #476.#1172   // ext/mods/gameserver/model/actor/template/NpcTemplate.canBeAttacked:()Z
  #1172 = NameAndType        #1173:#50    // canBeAttacked:()Z
  #1173 = Utf8               canBeAttacked
  #1174 = String             #1175        // %isNoSleepMode%
  #1175 = Utf8               %isNoSleepMode%
  #1176 = Methodref          #476.#1177   // ext/mods/gameserver/model/actor/template/NpcTemplate.isNoSleepMode:()Z
  #1177 = NameAndType        #1178:#50    // isNoSleepMode:()Z
  #1178 = Utf8               isNoSleepMode
  #1179 = String             #1180        // %aggroRange%
  #1180 = Utf8               %aggroRange%
  #1181 = Methodref          #476.#1182   // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
  #1182 = NameAndType        #1183:#58    // getAggroRange:()I
  #1183 = Utf8               getAggroRange
  #1184 = String             #1185        // %canMove%
  #1185 = Utf8               %canMove%
  #1186 = Methodref          #476.#1187   // ext/mods/gameserver/model/actor/template/NpcTemplate.canMove:()Z
  #1187 = NameAndType        #1188:#50    // canMove:()Z
  #1188 = Utf8               canMove
  #1189 = String             #1190        // %isSeedable%
  #1190 = Utf8               %isSeedable%
  #1191 = Methodref          #476.#1192   // ext/mods/gameserver/model/actor/template/NpcTemplate.isSeedable:()Z
  #1192 = NameAndType        #1193:#50    // isSeedable:()Z
  #1193 = Utf8               isSeedable
  #1194 = Methodref          #34.#368     // ext/mods/gameserver/model/actor/Npc.getResidence:()Lext/mods/gameserver/model/residence/Residence;
  #1195 = String             #1196        // html/admin/npcinfo/script.htm
  #1196 = Utf8               html/admin/npcinfo/script.htm
  #1197 = InterfaceMethodref #482.#541    // java/util/Map.isEmpty:()Z
  #1198 = String             #1199        // This NPC isn\'t affected by scripts.
  #1199 = Utf8               This NPC isn\'t affected by scripts.
  #1200 = InterfaceMethodref #482.#547    // java/util/Map.entrySet:()Ljava/util/Set;
  #1201 = Class              #1202        // ext/mods/gameserver/enums/EventHandler
  #1202 = Utf8               ext/mods/gameserver/enums/EventHandler
  #1203 = String             #1204        // <br><font color=\"LEVEL\">
  #1204 = Utf8               <br><font color=\"LEVEL\">
  #1205 = Methodref          #1201.#230   // ext/mods/gameserver/enums/EventHandler.name:()Ljava/lang/String;
  #1206 = String             #1207        // </font><br1>
  #1207 = Utf8               </font><br1>
  #1208 = Methodref          #521.#162    // ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
  #1209 = String             #1210        // %scripts%
  #1210 = Utf8               %scripts%
  #1211 = Methodref          #461.#1212   // java/lang/StringBuilder.setLength:(I)V
  #1212 = NameAndType        #1213:#27    // setLength:(I)V
  #1213 = Utf8               setLength
  #1214 = Methodref          #1215.#1216  // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #1215 = Class              #1217        // ext/mods/gameserver/data/xml/ScriptData
  #1216 = NameAndType        #866:#1218   // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
  #1217 = Utf8               ext/mods/gameserver/data/xml/ScriptData
  #1218 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
  #1219 = Methodref          #1215.#1220  // ext/mods/gameserver/data/xml/ScriptData.getQuests:()Ljava/util/List;
  #1220 = NameAndType        #1221:#794   // getQuests:()Ljava/util/List;
  #1221 = Utf8               getQuests
  #1222 = Methodref          #521.#1223   // ext/mods/gameserver/scripting/Quest.getQuestTimers:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/List;
  #1223 = NameAndType        #1224:#1225  // getQuestTimers:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/List;
  #1224 = Utf8               getQuestTimers
  #1225 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Ljava/util/List;
  #1226 = InterfaceMethodref #796.#541    // java/util/List.isEmpty:()Z
  #1227 = Class              #1228        // ext/mods/gameserver/scripting/QuestTimer
  #1228 = Utf8               ext/mods/gameserver/scripting/QuestTimer
  #1229 = Methodref          #1227.#162   // ext/mods/gameserver/scripting/QuestTimer.getName:()Ljava/lang/String;
  #1230 = Methodref          #1227.#1231  // ext/mods/gameserver/scripting/QuestTimer.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1231 = NameAndType        #1232:#148   // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1232 = Utf8               getPlayer
  #1233 = String             #1234        //
  #1234 = Utf8
  #1235 = InvokeDynamic      #15:#994     // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1236 = String             #1237        // %tasks%
  #1237 = Utf8               %tasks%
  #1238 = String             #1239        // html/admin/npcinfo/spawn.htm
  #1239 = Utf8               html/admin/npcinfo/spawn.htm
  #1240 = String             #1241        // %loc%
  #1241 = Utf8               %loc%
  #1242 = Methodref          #34.#310     // ext/mods/gameserver/model/actor/Npc.getX:()I
  #1243 = Methodref          #34.#315     // ext/mods/gameserver/model/actor/Npc.getY:()I
  #1244 = Methodref          #34.#320     // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #1245 = InvokeDynamic      #16:#1246    // #16:makeConcatWithConstants:(III)Ljava/lang/String;
  #1246 = NameAndType        #197:#1247   // makeConcatWithConstants:(III)Ljava/lang/String;
  #1247 = Utf8               (III)Ljava/lang/String;
  #1248 = String             #1249        // %dist%
  #1249 = Utf8               %dist%
  #1250 = Methodref          #135.#1251   // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #1251 = NameAndType        #1252:#1253  // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #1252 = Utf8               distance3D
  #1253 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #1254 = String             #1255        // %corpse%
  #1255 = Utf8               %corpse%
  #1256 = Methodref          #476.#1257   // ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
  #1257 = NameAndType        #1258:#58    // getCorpseTime:()I
  #1258 = Utf8               getCorpseTime
  #1259 = Methodref          #124.#1260   // ext/mods/commons/lang/StringUtil.getTimeStamp:(I)Ljava/lang/String;
  #1260 = NameAndType        #1261:#975   // getTimeStamp:(I)Ljava/lang/String;
  #1261 = Utf8               getTimeStamp
  #1262 = Methodref          #2.#359      // java/lang/Object.toString:()Ljava/lang/String;
  #1263 = Class              #1264        // ext/mods/gameserver/model/spawn/MultiSpawn
  #1264 = Utf8               ext/mods/gameserver/model/spawn/MultiSpawn
  #1265 = String             #1266        // %spawndesc%
  #1266 = Utf8               %spawndesc%
  #1267 = Methodref          #1263.#1268  // ext/mods/gameserver/model/spawn/MultiSpawn.getNpcMaker:()Lext/mods/gameserver/model/spawn/NpcMaker;
  #1268 = NameAndType        #1269:#1270  // getNpcMaker:()Lext/mods/gameserver/model/spawn/NpcMaker;
  #1269 = Utf8               getNpcMaker
  #1270 = Utf8               ()Lext/mods/gameserver/model/spawn/NpcMaker;
  #1271 = Methodref          #1272.#162   // ext/mods/gameserver/model/spawn/NpcMaker.getName:()Ljava/lang/String;
  #1272 = Class              #1273        // ext/mods/gameserver/model/spawn/NpcMaker
  #1273 = Utf8               ext/mods/gameserver/model/spawn/NpcMaker
  #1274 = Methodref          #1263.#1275  // ext/mods/gameserver/model/spawn/MultiSpawn.getDescription:()Ljava/lang/String;
  #1275 = NameAndType        #1276:#46    // getDescription:()Ljava/lang/String;
  #1276 = Utf8               getDescription
  #1277 = InvokeDynamic      #17:#196     // #17:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1278 = Methodref          #1263.#1279  // ext/mods/gameserver/model/spawn/MultiSpawn.getCoords:()[[I
  #1279 = NameAndType        #1280:#1281  // getCoords:()[[I
  #1280 = Utf8               getCoords
  #1281 = Utf8               ()[[I
  #1282 = String             #1283        // %spawninfo%
  #1283 = Utf8               %spawninfo%
  #1284 = String             #1285        // loc: anywhere
  #1285 = Utf8               loc: anywhere
  #1286 = InvokeDynamic      #18:#1246    // #18:makeConcatWithConstants:(III)Ljava/lang/String;
  #1287 = InvokeDynamic      #19:#974     // #19:makeConcatWithConstants:(I)Ljava/lang/String;
  #1288 = Methodref          #586.#1275   // ext/mods/gameserver/model/spawn/ASpawn.getDescription:()Ljava/lang/String;
  #1289 = Methodref          #586.#1290   // ext/mods/gameserver/model/spawn/ASpawn.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1290 = NameAndType        #1291:#443   // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1291 = Utf8               getSpawnLocation
  #1292 = Methodref          #10.#1293    // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1293 = NameAndType        #130:#1294   // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1294 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #1295 = InvokeDynamic      #20:#994     // #20:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1296 = String             #1297        // %loc2d%
  #1297 = Utf8               %loc2d%
  #1298 = Methodref          #34.#1290    // ext/mods/gameserver/model/actor/Npc.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1299 = Methodref          #34.#1300    // ext/mods/gameserver/model/actor/Npc.distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #1300 = NameAndType        #1301:#1302  // distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #1301 = Utf8               distance2D
  #1302 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #1303 = String             #1304        // %loc3d%
  #1304 = Utf8               %loc3d%
  #1305 = Methodref          #34.#1306    // ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1306 = NameAndType        #1252:#1302  // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1307 = String             #1308        // %resp%
  #1308 = Utf8               %resp%
  #1309 = Methodref          #586.#1310   // ext/mods/gameserver/model/spawn/ASpawn.getRespawnDelay:()I
  #1310 = NameAndType        #1311:#58    // getRespawnDelay:()I
  #1311 = Utf8               getRespawnDelay
  #1312 = String             #1313        // %rand_resp%
  #1313 = Utf8               %rand_resp%
  #1314 = Methodref          #586.#1315   // ext/mods/gameserver/model/spawn/ASpawn.getRespawnRandom:()I
  #1315 = NameAndType        #1316:#58    // getRespawnRandom:()I
  #1316 = Utf8               getRespawnRandom
  #1317 = String             #1318        // %privates%
  #1318 = Utf8               %privates%
  #1319 = Methodref          #586.#1320   // ext/mods/gameserver/model/spawn/ASpawn.getPrivateData:()Ljava/util/List;
  #1320 = NameAndType        #1321:#794   // getPrivateData:()Ljava/util/List;
  #1321 = Utf8               getPrivateData
  #1322 = String             #1323        // <font color=FF0000>--</font>
  #1323 = Utf8               <font color=FF0000>--</font>
  #1324 = Methodref          #34.#1325    // ext/mods/gameserver/model/actor/Npc.isMaster:()Z
  #1325 = NameAndType        #1326:#50    // isMaster:()Z
  #1326 = Utf8               isMaster
  #1327 = String             #1328        // I\'m a master, holding
  #1328 = Utf8               I\'m a master, holding
  #1329 = Methodref          #34.#1330    // ext/mods/gameserver/model/actor/Npc.getMinions:()Ljava/util/Set;
  #1330 = NameAndType        #1331:#549   // getMinions:()Ljava/util/Set;
  #1331 = Utf8               getMinions
  #1332 = InterfaceMethodref #551.#1333   // java/util/Set.size:()I
  #1333 = NameAndType        #1334:#58    // size:()I
  #1334 = Utf8               size
  #1335 = String             #1336        //  crappy minions.
  #1336 = Utf8                crappy minions.
  #1337 = Methodref          #34.#1338    // ext/mods/gameserver/model/actor/Npc.hasMaster:()Z
  #1338 = NameAndType        #1339:#50    // hasMaster:()Z
  #1339 = Utf8               hasMaster
  #1340 = String             #1341        // I\'m a crappy minion, my master <font color=LEVEL>
  #1341 = Utf8               I\'m a crappy minion, my master <font color=LEVEL>
  #1342 = Methodref          #34.#1343    // ext/mods/gameserver/model/actor/Npc.getMaster:()Lext/mods/gameserver/model/actor/Npc;
  #1343 = NameAndType        #1344:#1345  // getMaster:()Lext/mods/gameserver/model/actor/Npc;
  #1344 = Utf8               getMaster
  #1345 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #1346 = Methodref          #34.#162     // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #1347 = String             #1348        // </font> holds
  #1348 = Utf8               </font> holds
  #1349 = String             #1350        //  minions.
  #1350 = Utf8                minions.
  #1351 = String             #1352        // I\'m a regular NPC
  #1352 = Utf8               I\'m a regular NPC
  #1353 = String             #1354        // %minion%
  #1354 = Utf8               %minion%
  #1355 = String             #1356        // html/admin/npcinfo/stat.htm
  #1356 = Utf8               html/admin/npcinfo/stat.htm
  #1357 = Methodref          #34.#1358    // ext/mods/gameserver/model/actor/Npc.isChampion:()Z
  #1358 = NameAndType        #1359:#50    // isChampion:()Z
  #1359 = Utf8               isChampion
  #1360 = Methodref          #34.#1361    // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #1361 = NameAndType        #173:#1362   // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #1362 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #1363 = Methodref          #1364.#236   // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
  #1364 = Class              #1365        // ext/mods/gameserver/model/actor/status/NpcStatus
  #1365 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #1366 = Fieldref           #902.#1367   // ext/mods/Config.CHAMPION_HP:I
  #1367 = NameAndType        #1368:#606   // CHAMPION_HP:I
  #1368 = Utf8               CHAMPION_HP
  #1369 = Methodref          #1364.#240   // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
  #1370 = Methodref          #1364.#248   // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
  #1371 = String             #1372        // %mpmax%
  #1372 = Utf8               %mpmax%
  #1373 = Methodref          #1364.#251   // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
  #1374 = String             #1375        // %hpreg%
  #1375 = Utf8               %hpreg%
  #1376 = String             #1377        // %.2f
  #1377 = Utf8               %.2f
  #1378 = Methodref          #1364.#1379  // ext/mods/gameserver/model/actor/status/NpcStatus.getRegenHp:()D
  #1379 = NameAndType        #1380:#238   // getRegenHp:()D
  #1380 = Utf8               getRegenHp
  #1381 = Methodref          #10.#1382    // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1382 = NameAndType        #919:#1383   // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1383 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1384 = String             #1385        // %mpreg%
  #1385 = Utf8               %mpreg%
  #1386 = Methodref          #1364.#1387  // ext/mods/gameserver/model/actor/status/NpcStatus.getRegenMp:()D
  #1387 = NameAndType        #1388:#238   // getRegenMp:()D
  #1388 = Utf8               getRegenMp
  #1389 = String             #1390        // %patk%
  #1390 = Utf8               %patk%
  #1391 = Methodref          #1364.#1392  // ext/mods/gameserver/model/actor/status/NpcStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #1392 = NameAndType        #1393:#431   // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #1393 = Utf8               getPAtk
  #1394 = Fieldref           #902.#1395   // ext/mods/Config.CHAMPION_ATK:D
  #1395 = NameAndType        #1396:#1397  // CHAMPION_ATK:D
  #1396 = Utf8               CHAMPION_ATK
  #1397 = Utf8               D
  #1398 = String             #1399        // %matk%
  #1399 = Utf8               %matk%
  #1400 = Methodref          #1364.#1401  // ext/mods/gameserver/model/actor/status/NpcStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1401 = NameAndType        #1402:#437   // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1402 = Utf8               getMAtk
  #1403 = Fieldref           #902.#1404   // ext/mods/Config.CHAMPION_MATK:D
  #1404 = NameAndType        #1405:#1397  // CHAMPION_MATK:D
  #1405 = Utf8               CHAMPION_MATK
  #1406 = Methodref          #1364.#429   // ext/mods/gameserver/model/actor/status/NpcStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #1407 = Methodref          #1364.#435   // ext/mods/gameserver/model/actor/status/NpcStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1408 = String             #1409        // %accu%
  #1409 = Utf8               %accu%
  #1410 = Methodref          #1364.#1411  // ext/mods/gameserver/model/actor/status/NpcStatus.getAccuracy:()I
  #1411 = NameAndType        #1412:#58    // getAccuracy:()I
  #1412 = Utf8               getAccuracy
  #1413 = String             #1414        // %evas%
  #1414 = Utf8               %evas%
  #1415 = Methodref          #1364.#1416  // ext/mods/gameserver/model/actor/status/NpcStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #1416 = NameAndType        #1417:#431   // getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #1417 = Utf8               getEvasionRate
  #1418 = String             #1419        // %crit%
  #1419 = Utf8               %crit%
  #1420 = Methodref          #1364.#1421  // ext/mods/gameserver/model/actor/status/NpcStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1421 = NameAndType        #1422:#437   // getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1422 = Utf8               getCriticalHit
  #1423 = String             #1424        // %rspd%
  #1424 = Utf8               %rspd%
  #1425 = Methodref          #1364.#1426  // ext/mods/gameserver/model/actor/status/NpcStatus.getMoveSpeed:()F
  #1426 = NameAndType        #1427:#1428  // getMoveSpeed:()F
  #1427 = Utf8               getMoveSpeed
  #1428 = Utf8               ()F
  #1429 = String             #1430        // %aspd%
  #1430 = Utf8               %aspd%
  #1431 = Methodref          #1364.#1432  // ext/mods/gameserver/model/actor/status/NpcStatus.getPAtkSpd:()I
  #1432 = NameAndType        #1433:#58    // getPAtkSpd:()I
  #1433 = Utf8               getPAtkSpd
  #1434 = Fieldref           #902.#1435   // ext/mods/Config.CHAMPION_SPD_ATK:D
  #1435 = NameAndType        #1436:#1397  // CHAMPION_SPD_ATK:D
  #1436 = Utf8               CHAMPION_SPD_ATK
  #1437 = String             #1438        // %cspd%
  #1438 = Utf8               %cspd%
  #1439 = Methodref          #1364.#1440  // ext/mods/gameserver/model/actor/status/NpcStatus.getMAtkSpd:()I
  #1440 = NameAndType        #1441:#58    // getMAtkSpd:()I
  #1441 = Utf8               getMAtkSpd
  #1442 = Fieldref           #902.#1443   // ext/mods/Config.CHAMPION_SPD_MATK:D
  #1443 = NameAndType        #1444:#1397  // CHAMPION_SPD_MATK:D
  #1444 = Utf8               CHAMPION_SPD_MATK
  #1445 = String             #1446        // %str%
  #1446 = Utf8               %str%
  #1447 = Methodref          #1364.#1448  // ext/mods/gameserver/model/actor/status/NpcStatus.getSTR:()I
  #1448 = NameAndType        #1449:#58    // getSTR:()I
  #1449 = Utf8               getSTR
  #1450 = String             #1451        // %dex%
  #1451 = Utf8               %dex%
  #1452 = Methodref          #1364.#1453  // ext/mods/gameserver/model/actor/status/NpcStatus.getDEX:()I
  #1453 = NameAndType        #1454:#58    // getDEX:()I
  #1454 = Utf8               getDEX
  #1455 = String             #1456        // %con%
  #1456 = Utf8               %con%
  #1457 = Methodref          #1364.#1458  // ext/mods/gameserver/model/actor/status/NpcStatus.getCON:()I
  #1458 = NameAndType        #1459:#58    // getCON:()I
  #1459 = Utf8               getCON
  #1460 = String             #1461        // %int%
  #1461 = Utf8               %int%
  #1462 = Methodref          #1364.#1463  // ext/mods/gameserver/model/actor/status/NpcStatus.getINT:()I
  #1463 = NameAndType        #1464:#58    // getINT:()I
  #1464 = Utf8               getINT
  #1465 = String             #1466        // %wit%
  #1466 = Utf8               %wit%
  #1467 = Methodref          #1364.#1468  // ext/mods/gameserver/model/actor/status/NpcStatus.getWIT:()I
  #1468 = NameAndType        #1469:#58    // getWIT:()I
  #1469 = Utf8               getWIT
  #1470 = String             #1471        // %men%
  #1471 = Utf8               %men%
  #1472 = Methodref          #1364.#1473  // ext/mods/gameserver/model/actor/status/NpcStatus.getMEN:()I
  #1473 = NameAndType        #1474:#58    // getMEN:()I
  #1474 = Utf8               getMEN
  #1475 = String             #1476        // %ele_fire%
  #1476 = Utf8               %ele_fire%
  #1477 = Fieldref           #1478.#1479  // ext/mods/gameserver/enums/skills/ElementType.FIRE:Lext/mods/gameserver/enums/skills/ElementType;
  #1478 = Class              #1480        // ext/mods/gameserver/enums/skills/ElementType
  #1479 = NameAndType        #1481:#1482  // FIRE:Lext/mods/gameserver/enums/skills/ElementType;
  #1480 = Utf8               ext/mods/gameserver/enums/skills/ElementType
  #1481 = Utf8               FIRE
  #1482 = Utf8               Lext/mods/gameserver/enums/skills/ElementType;
  #1483 = Methodref          #1364.#1484  // ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
  #1484 = NameAndType        #1485:#1486  // getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
  #1485 = Utf8               getDefenseElementValue
  #1486 = Utf8               (Lext/mods/gameserver/enums/skills/ElementType;)D
  #1487 = String             #1488        // %ele_water%
  #1488 = Utf8               %ele_water%
  #1489 = Fieldref           #1478.#1490  // ext/mods/gameserver/enums/skills/ElementType.WATER:Lext/mods/gameserver/enums/skills/ElementType;
  #1490 = NameAndType        #1491:#1482  // WATER:Lext/mods/gameserver/enums/skills/ElementType;
  #1491 = Utf8               WATER
  #1492 = String             #1493        // %ele_wind%
  #1493 = Utf8               %ele_wind%
  #1494 = Fieldref           #1478.#1495  // ext/mods/gameserver/enums/skills/ElementType.WIND:Lext/mods/gameserver/enums/skills/ElementType;
  #1495 = NameAndType        #1496:#1482  // WIND:Lext/mods/gameserver/enums/skills/ElementType;
  #1496 = Utf8               WIND
  #1497 = String             #1498        // %ele_earth%
  #1498 = Utf8               %ele_earth%
  #1499 = Fieldref           #1478.#1500  // ext/mods/gameserver/enums/skills/ElementType.EARTH:Lext/mods/gameserver/enums/skills/ElementType;
  #1500 = NameAndType        #1501:#1482  // EARTH:Lext/mods/gameserver/enums/skills/ElementType;
  #1501 = Utf8               EARTH
  #1502 = String             #1503        // %ele_holy%
  #1503 = Utf8               %ele_holy%
  #1504 = Fieldref           #1478.#1505  // ext/mods/gameserver/enums/skills/ElementType.HOLY:Lext/mods/gameserver/enums/skills/ElementType;
  #1505 = NameAndType        #1506:#1482  // HOLY:Lext/mods/gameserver/enums/skills/ElementType;
  #1506 = Utf8               HOLY
  #1507 = String             #1508        // %ele_dark%
  #1508 = Utf8               %ele_dark%
  #1509 = Fieldref           #1478.#1510  // ext/mods/gameserver/enums/skills/ElementType.DARK:Lext/mods/gameserver/enums/skills/ElementType;
  #1510 = NameAndType        #1511:#1482  // DARK:Lext/mods/gameserver/enums/skills/ElementType;
  #1511 = Utf8               DARK
  #1512 = Methodref          #1513.#1514  // ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
  #1513 = Class              #1515        // ext/mods/gameserver/data/manager/BuyListManager
  #1514 = NameAndType        #866:#1516   // getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
  #1515 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
  #1516 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
  #1517 = Methodref          #34.#1046    // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #1518 = Methodref          #1513.#1519  // ext/mods/gameserver/data/manager/BuyListManager.getBuyListsByNpcId:(I)Ljava/util/List;
  #1519 = NameAndType        #1520:#1521  // getBuyListsByNpcId:(I)Ljava/util/List;
  #1520 = Utf8               getBuyListsByNpcId
  #1521 = Utf8               (I)Ljava/util/List;
  #1522 = String             #1523        // This NPC doesn\'t hold any buyList.
  #1523 = Utf8               This NPC doesn\'t hold any buyList.
  #1524 = Methodref          #34.#1525    // ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #1525 = NameAndType        #1526:#1527  // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #1526 = Utf8               getCastle
  #1527 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #1528 = String             #1529        // Tax rate:
  #1529 = Utf8               Tax rate:
  #1530 = Methodref          #1531.#1532  // ext/mods/gameserver/model/residence/castle/Castle.getCurrentTaxPercent:()I
  #1531 = Class              #1533        // ext/mods/gameserver/model/residence/castle/Castle
  #1532 = NameAndType        #1534:#58    // getCurrentTaxPercent:()I
  #1533 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #1534 = Utf8               getCurrentTaxPercent
  #1535 = String             #1536        // %<br>
  #1536 = Utf8               %<br>
  #1537 = String             #1538        // <table width=\"100%\">
  #1538 = Utf8               <table width=\"100%\">
  #1539 = Class              #1540        // ext/mods/gameserver/model/buylist/NpcBuyList
  #1540 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
  #1541 = String             #1542        // <tr><td><a action=\"bypass -h admin_buy
  #1542 = Utf8               <tr><td><a action=\"bypass -h admin_buy
  #1543 = Methodref          #1539.#1544  // ext/mods/gameserver/model/buylist/NpcBuyList.getListId:()I
  #1544 = NameAndType        #1545:#58    // getListId:()I
  #1545 = Utf8               getListId
  #1546 = String             #1547        //  1\">Buylist id:
  #1547 = Utf8                1\">Buylist id:
  #1548 = String             #1549        // </a></td></tr>
  #1549 = Utf8               </a></td></tr>
  #1550 = Methodref          #476.#1551   // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:()Ljava/util/Map;
  #1551 = NameAndType        #1552:#480   // getSkills:()Ljava/util/Map;
  #1552 = Utf8               getSkills
  #1553 = String             #1554        // This NPC doesn\'t hold any skill.
  #1554 = Utf8               This NPC doesn\'t hold any skill.
  #1555 = Class              #1556        // ext/mods/gameserver/enums/actors/NpcSkillType
  #1556 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #1557 = Methodref          #1555.#230   // ext/mods/gameserver/enums/actors/NpcSkillType.name:()Ljava/lang/String;
  #1558 = Class              #1559        // ext/mods/gameserver/skills/L2Skill
  #1559 = Utf8               ext/mods/gameserver/skills/L2Skill
  #1560 = Methodref          #1558.#1561  // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #1561 = NameAndType        #1562:#1563  // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #1562 = Utf8               getSkillType
  #1563 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #1564 = Fieldref           #1565.#1566  // ext/mods/gameserver/enums/skills/SkillType.NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #1565 = Class              #1567        // ext/mods/gameserver/enums/skills/SkillType
  #1566 = NameAndType        #1568:#1569  // NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #1567 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #1568 = Utf8               NOTDONE
  #1569 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #1570 = Methodref          #1558.#162   // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #1571 = InvokeDynamic      #21:#994     // #21:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1572 = String             #1573        //  [
  #1573 = Utf8                [
  #1574 = Methodref          #1558.#349   // ext/mods/gameserver/skills/L2Skill.getId:()I
  #1575 = String             #1576        // -
  #1576 = Utf8               -
  #1577 = Methodref          #1558.#177   // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #1578 = String             #1579        // ]<br1>
  #1579 = Utf8               ]<br1>
  #1580 = InvokeDynamic      #22:#504     // #22:test:()Ljava/util/function/Predicate;
  #1581 = InterfaceMethodref #498.#1582   // java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
  #1582 = NameAndType        #1583:#1584  // noneMatch:(Ljava/util/function/Predicate;)Z
  #1583 = Utf8               noneMatch
  #1584 = Utf8               (Ljava/util/function/Predicate;)Z
  #1585 = Fieldref           #893.#1586   // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
  #1586 = NameAndType        #1587:#1588  // SPOIL:Lext/mods/gameserver/enums/DropType;
  #1587 = Utf8               SPOIL
  #1588 = Utf8               Lext/mods/gameserver/enums/DropType;
  #1589 = Methodref          #521.#1590   // ext/mods/gameserver/scripting/Quest.isRealQuest:()Z
  #1590 = NameAndType        #1591:#50    // isRealQuest:()Z
  #1591 = Utf8               isRealQuest
  #1592 = String             #1593        // #.###
  #1593 = Utf8               #.###
  #1594 = Methodref          #916.#1595   // java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
  #1595 = NameAndType        #5:#1031     // "<init>":(Ljava/lang/String;)V
  #1596 = Utf8               Code
  #1597 = Utf8               LineNumberTable
  #1598 = Utf8               LocalVariableTable
  #1599 = Utf8               this
  #1600 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminInfo;
  #1601 = Utf8               useAdminCommand
  #1602 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #1603 = Utf8               targetDoor
  #1604 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #1605 = Utf8               page
  #1606 = Utf8               e
  #1607 = Utf8               Ljava/lang/Exception;
  #1608 = Utf8               subPage
  #1609 = Utf8               subCommand
  #1610 = Utf8               Ljava/lang/String;
  #1611 = Utf8               st
  #1612 = Utf8               Ljava/util/StringTokenizer;
  #1613 = Utf8               targetNpc
  #1614 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1615 = Utf8               targetPlayer
  #1616 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1617 = Utf8               targetPet
  #1618 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #1619 = Utf8               owner
  #1620 = Utf8               targetSummon
  #1621 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #1622 = Utf8               targetStaticObject
  #1623 = Utf8               Lext/mods/gameserver/model/actor/instance/StaticObject;
  #1624 = Utf8               targetWorldObject
  #1625 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #1626 = Utf8               html
  #1627 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #1628 = Utf8               command
  #1629 = Utf8               player
  #1630 = Utf8               StackMapTable
  #1631 = Utf8               showPetInfo
  #1632 = Utf8               (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
  #1633 = Utf8               pet
  #1634 = Utf8               getAdminCommandList
  #1635 = Utf8               checkedClass
  #1636 = Utf8               Ljava/lang/Class;
  #1637 = Utf8               aiScript
  #1638 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #1639 = Utf8               aiParam
  #1640 = Utf8               Ljava/util/Map$Entry;
  #1641 = Utf8               Lext/mods/gameserver/model/spawn/ASpawn;
  #1642 = Utf8               npc
  #1643 = Utf8               index
  #1644 = Utf8               sb
  #1645 = Utf8               Ljava/lang/StringBuilder;
  #1646 = Utf8               LocalVariableTypeTable
  #1647 = Utf8               Ljava/lang/Class<*>;
  #1648 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;
  #1649 = Utf8               attackable
  #1650 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #1651 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #1652 = Utf8               aggroList
  #1653 = Utf8               Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #1654 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
  #1655 = Utf8               desires
  #1656 = Utf8               Ljava/util/Set;
  #1657 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/ai/Desire;>;
  #1658 = Utf8               chance
  #1659 = Utf8               normChance
  #1660 = Utf8               overflowFactor
  #1661 = Utf8               inverseCategoryChance
  #1662 = Utf8               reduceFactor
  #1663 = Utf8               color
  #1664 = Utf8               percent
  #1665 = Utf8               amount
  #1666 = Utf8               item
  #1667 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #1668 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #1669 = Utf8               droplist
  #1670 = Utf8               Lext/mods/commons/data/Pagination;
  #1671 = Utf8               catChance
  #1672 = Utf8               baseCatChance
  #1673 = Utf8               chanceMultiplier
  #1674 = Utf8               countMultiplier
  #1675 = Utf8               category
  #1676 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #1677 = Utf8               isDrop
  #1678 = Utf8               row
  #1679 = Utf8               filteredCategories
  #1680 = Utf8               Ljava/util/List;
  #1681 = Utf8               list
  #1682 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/item/DropData;>;
  #1683 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/DropCategory;>;
  #1684 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/item/DropCategory;>;
  #1685 = Class              #1686        // "[Ljava/lang/Object;"
  #1686 = Utf8               [Ljava/lang/Object;
  #1687 = Utf8               quest
  #1688 = Utf8               entry
  #1689 = Utf8               type
  #1690 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #1691 = Utf8               qt
  #1692 = Utf8               Lext/mods/gameserver/scripting/QuestTimer;
  #1693 = Utf8               qts
  #1694 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/enums/EventHandler;Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;>;
  #1695 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/QuestTimer;>;
  #1696 = Utf8               coords
  #1697 = Utf8               [[I
  #1698 = Utf8               ms
  #1699 = Utf8               Lext/mods/gameserver/model/spawn/MultiSpawn;
  #1700 = Class              #1697        // "[[I"
  #1701 = Utf8               buyList
  #1702 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #1703 = Utf8               buyLists
  #1704 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/buylist/NpcBuyList;>;
  #1705 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1706 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #1707 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/enums/actors/NpcSkillType;Lext/mods/gameserver/skills/L2Skill;>;
  #1708 = Utf8               lambda$sendDropInfos$3
  #1709 = Utf8               (Lext/mods/gameserver/model/item/DropCategory;)Z
  #1710 = Utf8               lambda$sendDropInfos$1
  #1711 = Utf8               lambda$sendDropInfos$2
  #1712 = Utf8               (Lext/mods/gameserver/model/item/DropData;)Z
  #1713 = Utf8               lambda$sendDropInfos$0
  #1714 = Utf8               (ZLext/mods/gameserver/model/item/DropCategory;)Z
  #1715 = Utf8               lambda$sendAiInfos$0
  #1716 = Utf8               (Lext/mods/gameserver/scripting/Quest;)Z
  #1717 = Utf8               q
  #1718 = Utf8               <clinit>
  #1719 = Utf8               SourceFile
  #1720 = Utf8               AdminInfo.java
  #1721 = Utf8               BootstrapMethods
  #1722 = String             #1723        //  <a action=\"bypass -h admin_debug \u0001\">\u0001</a>
  #1723 = Utf8                <a action=\"bypass -h admin_debug \u0001\">\u0001</a>
  #1724 = String             #1725        // \u0001/\u0001
  #1725 = Utf8               \u0001/\u0001
  #1726 = MethodType         #520         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #1727 = MethodHandle       9:#487       // REF_invokeInterface java/util/Collection.stream:()Ljava/util/stream/Stream;
  #1728 = MethodType         #1729        //  (Ljava/util/List;)Ljava/util/stream/Stream;
  #1729 = Utf8               (Ljava/util/List;)Ljava/util/stream/Stream;
  #1730 = MethodType         #64          //  (Ljava/lang/Object;)Z
  #1731 = MethodHandle       6:#1732      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendAiInfos$0:(Lext/mods/gameserver/scripting/Quest;)Z
  #1732 = Methodref          #18.#1733    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendAiInfos$0:(Lext/mods/gameserver/scripting/Quest;)Z
  #1733 = NameAndType        #1715:#1716  // lambda$sendAiInfos$0:(Lext/mods/gameserver/scripting/Quest;)Z
  #1734 = MethodType         #1716        //  (Lext/mods/gameserver/scripting/Quest;)Z
  #1735 = MethodHandle       5:#819       // REF_invokeVirtual ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
  #1736 = MethodType         #1737        //  (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  #1737 = Utf8               (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  #1738 = MethodHandle       6:#1739      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
  #1739 = Methodref          #18.#1740    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
  #1740 = NameAndType        #1713:#1714  // lambda$sendDropInfos$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
  #1741 = MethodType         #1709        //  (Lext/mods/gameserver/model/item/DropCategory;)Z
  #1742 = MethodHandle       6:#1743      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #1743 = Methodref          #18.#1744    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #1744 = NameAndType        #1710:#1709  // lambda$sendDropInfos$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #1745 = MethodHandle       6:#1746      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #1746 = Methodref          #18.#1747    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #1747 = NameAndType        #1708:#1709  // lambda$sendDropInfos$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #1748 = String             #1749        // \u0001
  #1749 = Utf8               \u0001
  #1750 = String             #1751        // \u0001-\u0001
  #1751 = Utf8               \u0001-\u0001
  #1752 = String             #1753        // R: \u0001
  #1753 = Utf8               R: \u0001
  #1754 = String             #1755        // <td width=44 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=\"-5\"><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  #1755 = Utf8               <td width=44 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=\"-5\"><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  #1756 = String             #1757        // bypass admin_info \u0001 \u0001 %page%
  #1757 = Utf8               bypass admin_info \u0001 \u0001 %page%
  #1758 = String             #1759        // \u0001 - \u0001
  #1759 = Utf8               \u0001 - \u0001
  #1760 = String             #1761        // bypass admin_info \u0001 %page% 1
  #1761 = Utf8               bypass admin_info \u0001 %page% 1
  #1762 = String             #1763        //  affecting player \u0001
  #1763 = Utf8                affecting player \u0001
  #1764 = String             #1765        // \u0001 \u0001 \u0001
  #1765 = Utf8               \u0001 \u0001 \u0001
  #1766 = String             #1767        // <a action=\"bypass -h admin_maker \u0001\">\u0001</a>
  #1767 = Utf8               <a action=\"bypass -h admin_maker \u0001\">\u0001</a>
  #1768 = String             #1769        // loc: fixed \u0001, \u0001, \u0001
  #1769 = Utf8               loc: fixed \u0001, \u0001, \u0001
  #1770 = String             #1771        // loc: fixed random 1 of \u0001
  #1771 = Utf8               loc: fixed random 1 of \u0001
  #1772 = String             #1773        // loc: \u0001
  #1773 = Utf8               loc: \u0001
  #1774 = String             #1775        // <font color=\"777777\">\u0001</font>
  #1775 = Utf8               <font color=\"777777\">\u0001</font>
  #1776 = MethodHandle       6:#1777      // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$2:(Lext/mods/gameserver/model/item/DropData;)Z
  #1777 = Methodref          #18.#1778    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$2:(Lext/mods/gameserver/model/item/DropData;)Z
  #1778 = NameAndType        #1711:#1712  // lambda$sendDropInfos$2:(Lext/mods/gameserver/model/item/DropData;)Z
  #1779 = MethodType         #1712        //  (Lext/mods/gameserver/model/item/DropData;)Z
  #1780 = MethodHandle       6:#1781      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1781 = Methodref          #1782.#1783  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1782 = Class              #1784        // java/lang/invoke/StringConcatFactory
  #1783 = NameAndType        #197:#1785   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1784 = Utf8               java/lang/invoke/StringConcatFactory
  #1785 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1786 = MethodHandle       6:#1787      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1787 = Methodref          #1788.#1789  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1788 = Class              #1790        // java/lang/invoke/LambdaMetafactory
  #1789 = NameAndType        #1791:#1792  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1790 = Utf8               java/lang/invoke/LambdaMetafactory
  #1791 = Utf8               metafactory
  #1792 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1793 = Utf8               InnerClasses
  #1794 = Utf8               Entry
  #1795 = Class              #1796        // java/lang/invoke/MethodHandles$Lookup
  #1796 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1797 = Class              #1798        // java/lang/invoke/MethodHandles
  #1798 = Utf8               java/lang/invoke/MethodHandles
  #1799 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminInfo;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=16, args_size=3
         0: aload_1
         1: ldc           #7                  // String admin_info
         3: invokevirtual #9                  // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
         6: ifeq          1173
         9: aload_0
        10: ldc           #15                 // class ext/mods/gameserver/model/WorldObject
        12: aload_2
        13: iconst_1
        14: invokevirtual #17                 // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
        17: astore_3
        18: new           #23                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        21: dup
        22: iconst_0
        23: invokespecial #25                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        26: astore        4
        28: aload_3
        29: instanceof    #28                 // class ext/mods/gameserver/model/actor/instance/Door
        32: ifeq          52
        35: aload_3
        36: checkcast     #28                 // class ext/mods/gameserver/model/actor/instance/Door
        39: astore        5
        41: aload_2
        42: aload         5
        44: aload         4
        46: invokestatic  #30                 // Method showDoorInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
        49: goto          1167
        52: aload_3
        53: instanceof    #34                 // class ext/mods/gameserver/model/actor/Npc
        56: ifeq          667
        59: aload_3
        60: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
        63: astore        6
        65: new           #36                 // class java/util/StringTokenizer
        68: dup
        69: aload_1
        70: ldc           #38                 // String
        72: invokespecial #40                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        75: astore        10
        77: aload         10
        79: invokevirtual #43                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        82: pop
        83: aload         10
        85: invokevirtual #47                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        88: ifne          103
        91: aload_2
        92: aload         6
        94: aload         4
        96: iconst_0
        97: invokestatic  #51                 // Method sendGeneralInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
       100: goto          664
       103: aload         10
       105: invokevirtual #43                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       108: astore        11
       110: aload         11
       112: astore        12
       114: iconst_m1
       115: istore        13
       117: aload         12
       119: invokevirtual #55                 // Method java/lang/String.hashCode:()I
       122: lookupswitch  { // 10

             -1335246070: 244

              -907685685: 292

                    3112: 212

                 3092207: 260

                 3529462: 308

                 3540564: 359

                92752638: 228

               109496913: 325

               109638523: 342

               109651541: 276
                 default: 373
            }
       212: aload         12
       214: ldc           #59                 // String ai
       216: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       219: ifeq          373
       222: iconst_0
       223: istore        13
       225: goto          373
       228: aload         12
       230: ldc           #65                 // String aggro
       232: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       235: ifeq          373
       238: iconst_1
       239: istore        13
       241: goto          373
       244: aload         12
       246: ldc           #67                 // String desire
       248: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       251: ifeq          373
       254: iconst_2
       255: istore        13
       257: goto          373
       260: aload         12
       262: ldc           #69                 // String drop
       264: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       267: ifeq          373
       270: iconst_3
       271: istore        13
       273: goto          373
       276: aload         12
       278: ldc           #71                 // String spoil
       280: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       283: ifeq          373
       286: iconst_4
       287: istore        13
       289: goto          373
       292: aload         12
       294: ldc           #73                 // String script
       296: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       299: ifeq          373
       302: iconst_5
       303: istore        13
       305: goto          373
       308: aload         12
       310: ldc           #75                 // String shop
       312: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       315: ifeq          373
       318: bipush        6
       320: istore        13
       322: goto          373
       325: aload         12
       327: ldc           #77                 // String skill
       329: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       332: ifeq          373
       335: bipush        7
       337: istore        13
       339: goto          373
       342: aload         12
       344: ldc           #79                 // String spawn
       346: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       349: ifeq          373
       352: bipush        8
       354: istore        13
       356: goto          373
       359: aload         12
       361: ldc           #81                 // String stat
       363: invokevirtual #61                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       366: ifeq          373
       369: bipush        9
       371: istore        13
       373: iload         13
       375: tableswitch   { // 0 to 9

                       0: 428

                       1: 477

                       2: 488

                       3: 499

                       4: 499

                       5: 581

                       6: 592

                       7: 603

                       8: 614

                       9: 625
                 default: 636
            }
       428: aload         10
       430: invokevirtual #47                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       433: ifeq          447
       436: aload         10
       438: invokevirtual #43                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       441: invokestatic  #83                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       444: goto          448
       447: iconst_0
       448: istore        14
       450: aload_2
       451: aload         6
       453: aload         4
       455: iload         14
       457: invokestatic  #89                 // Method sendAiInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
       460: goto          664
       463: astore        14
       465: aload_2
       466: aload         6
       468: aload         4
       470: iconst_0
       471: invokestatic  #89                 // Method sendAiInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
       474: goto          664
       477: aload_2
       478: aload         6
       480: aload         4
       482: invokestatic  #94                 // Method sendAggroInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       485: goto          664
       488: aload_2
       489: aload         6
       491: aload         4
       493: invokestatic  #98                 // Method sendDesireInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       496: goto          664
       499: aload         10
       501: invokevirtual #47                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       504: ifeq          518
       507: aload         10
       509: invokevirtual #43                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       512: invokestatic  #83                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       515: goto          519
       518: iconst_1
       519: istore        14
       521: aload         10
       523: invokevirtual #47                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       526: ifeq          540
       529: aload         10
       531: invokevirtual #43                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       534: invokestatic  #83                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       537: goto          541
       540: iconst_1
       541: istore        15
       543: aload_2
       544: aload         6
       546: aload         4
       548: iload         14
       550: iload         15
       552: aload         11
       554: ldc           #69                 // String drop
       556: invokevirtual #101                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       559: invokestatic  #104                // Method sendDropInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
       562: goto          664
       565: astore        14
       567: aload_2
       568: aload         6
       570: aload         4
       572: iconst_1
       573: iconst_1
       574: iconst_1
       575: invokestatic  #104                // Method sendDropInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
       578: goto          664
       581: aload_2
       582: aload         6
       584: aload         4
       586: invokestatic  #108                // Method sendScriptInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       589: goto          664
       592: aload_2
       593: aload         6
       595: aload         4
       597: invokestatic  #111                // Method sendShopInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       600: goto          664
       603: aload_2
       604: aload         6
       606: aload         4
       608: invokestatic  #114                // Method sendSkillInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       611: goto          664
       614: aload_2
       615: aload         6
       617: aload         4
       619: invokestatic  #117                // Method sendSpawnInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       622: goto          664
       625: aload_2
       626: aload         6
       628: aload         4
       630: invokestatic  #120                // Method sendStatsInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       633: goto          664
       636: aload_2
       637: aload         6
       639: aload         4
       641: aload         11
       643: invokestatic  #123                // Method ext/mods/commons/lang/StringUtil.isDigit:(Ljava/lang/String;)Z
       646: ifeq          660
       649: aload         11
       651: invokestatic  #128                // Method java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
       654: invokevirtual #132                // Method java/lang/Integer.intValue:()I
       657: goto          661
       660: iconst_0
       661: invokestatic  #51                 // Method sendGeneralInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
       664: goto          1167
       667: aload_3
       668: instanceof    #135                // class ext/mods/gameserver/model/actor/Player
       671: ifeq          691
       674: aload_3
       675: checkcast     #135                // class ext/mods/gameserver/model/actor/Player
       678: astore        7
       680: aload_2
       681: aload         7
       683: aload         4
       685: invokestatic  #137                // Method ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       688: goto          1167
       691: aload_3
       692: instanceof    #143                // class ext/mods/gameserver/model/actor/Summon
       695: ifeq          1062
       698: aload_3
       699: checkcast     #143                // class ext/mods/gameserver/model/actor/Summon
       702: astore        8
       704: aload_3
       705: invokevirtual #145                // Method ext/mods/gameserver/model/WorldObject.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       708: astore        10
       710: aload         4
       712: aload_2
       713: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       716: ldc           #153                // String html/admin/petinfo.htm
       718: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       721: aload         4
       723: ldc           #159                // String %name%
       725: aload         8
       727: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Summon.getName:()Ljava/lang/String;
       730: ifnonnull     738
       733: ldc           #164                // String N/A
       735: goto          743
       738: aload         8
       740: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Summon.getName:()Ljava/lang/String;
       743: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       746: aload         4
       748: ldc           #169                // String %level%
       750: aload         8
       752: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       755: invokevirtual #175                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getLevel:()I
       758: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       761: aload         4
       763: ldc           #183                // String %exp%
       765: aload         8
       767: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       770: invokevirtual #185                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getExp:()J
       773: invokevirtual #189                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
       776: aload         4
       778: ldc           #192                // String %owner%
       780: aload         10
       782: ifnonnull     790
       785: ldc           #164                // String N/A
       787: goto          805
       790: aload         10
       792: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       795: aload         10
       797: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       800: invokedynamic #195,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       805: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       808: aload         4
       810: ldc           #199                // String %class%
       812: aload         8
       814: invokevirtual #201                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       817: invokevirtual #205                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       820: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       823: aload         4
       825: ldc           #210                // String %ai%
       827: aload         8
       829: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       832: invokevirtual #216                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       835: invokevirtual #222                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       838: invokevirtual #228                // Method ext/mods/gameserver/enums/IntentionType.name:()Ljava/lang/String;
       841: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       844: aload         4
       846: ldc           #233                // String %hp%
       848: aload         8
       850: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       853: invokevirtual #235                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getHp:()D
       856: d2i
       857: aload         8
       859: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       862: invokevirtual #239                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getMaxHp:()I
       865: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       870: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       873: aload         4
       875: ldc           #245                // String %mp%
       877: aload         8
       879: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       882: invokevirtual #247                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getMp:()D
       885: d2i
       886: aload         8
       888: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       891: invokevirtual #250                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getMaxMp:()I
       894: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       899: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       902: aload         4
       904: ldc           #253                // String %karma%
       906: aload         8
       908: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Summon.getKarma:()I
       911: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       914: aload         4
       916: ldc_w         #258                // String %undead%
       919: aload         8
       921: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Summon.isUndead:()Z
       924: ifeq          933
       927: ldc_w         #263                // String yes
       930: goto          936
       933: ldc_w         #265                // String no
       936: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       939: aload_3
       940: instanceof    #267                // class ext/mods/gameserver/model/actor/instance/Pet
       943: ifeq          1028
       946: aload_3
       947: checkcast     #267                // class ext/mods/gameserver/model/actor/instance/Pet
       950: astore        11
       952: aload         4
       954: ldc_w         #269                // String %inv%
       957: aload         10
       959: ifnonnull     967
       962: ldc           #164                // String N/A
       964: goto          970
       967: ldc_w         #271                // String  <a action=\"bypass admin_summon inventory\">view</a>
       970: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       973: aload         4
       975: ldc_w         #273                // String %food%
       978: aload         11
       980: invokevirtual #275                // Method ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
       983: aload         11
       985: invokevirtual #278                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
       988: invokevirtual #282                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
       991: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       996: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       999: aload         4
      1001: ldc_w         #287                // String %load%
      1004: aload         11
      1006: invokevirtual #289                // Method ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
      1009: invokevirtual #293                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getTotalWeight:()I
      1012: aload         11
      1014: invokevirtual #298                // Method ext/mods/gameserver/model/actor/instance/Pet.getWeightLimit:()I
      1017: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
      1022: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1025: goto          1059
      1028: aload         4
      1030: ldc_w         #269                // String %inv%
      1033: ldc_w         #301                // String none
      1036: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1039: aload         4
      1041: ldc_w         #273                // String %food%
      1044: ldc           #164                // String N/A
      1046: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1049: aload         4
      1051: ldc_w         #287                // String %load%
      1054: ldc           #164                // String N/A
      1056: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1059: goto          1167
      1062: aload_3
      1063: instanceof    #303                // class ext/mods/gameserver/model/actor/instance/StaticObject
      1066: ifeq          1167
      1069: aload_3
      1070: checkcast     #303                // class ext/mods/gameserver/model/actor/instance/StaticObject
      1073: astore        9
      1075: aload         4
      1077: aload_2
      1078: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
      1081: ldc_w         #305                // String html/admin/staticinfo.htm
      1084: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
      1087: aload         4
      1089: ldc_w         #307                // String %x%
      1092: aload         9
      1094: invokevirtual #309                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getX:()I
      1097: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1100: aload         4
      1102: ldc_w         #312                // String %y%
      1105: aload         9
      1107: invokevirtual #314                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getY:()I
      1110: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1113: aload         4
      1115: ldc_w         #317                // String %z%
      1118: aload         9
      1120: invokevirtual #319                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getZ:()I
      1123: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1126: aload         4
      1128: ldc_w         #322                // String %objid%
      1131: aload         9
      1133: invokevirtual #324                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getObjectId:()I
      1136: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1139: aload         4
      1141: ldc_w         #327                // String %staticid%
      1144: aload         9
      1146: invokevirtual #329                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getStaticObjectId:()I
      1149: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
      1152: aload         4
      1154: ldc           #199                // String %class%
      1156: aload         9
      1158: invokevirtual #201                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      1161: invokevirtual #205                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      1164: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1167: aload_2
      1168: aload         4
      1170: invokevirtual #332                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1173: return
      Exception table:
         from    to  target type
           428   460   463   Class java/lang/Exception
           499   562   565   Class java/lang/Exception
      LineNumberTable:
        line 79: 0
        line 81: 9
        line 83: 18
        line 84: 28
        line 85: 41
        line 86: 52
        line 88: 65
        line 89: 77
        line 91: 83
        line 92: 91
        line 95: 103
        line 96: 110
        line 101: 428
        line 103: 450
        line 108: 460
        line 105: 463
        line 107: 465
        line 110: 474
        line 113: 477
        line 114: 485
        line 117: 488
        line 118: 496
        line 123: 499
        line 124: 521
        line 126: 543
        line 131: 562
        line 128: 565
        line 130: 567
        line 132: 578
        line 135: 581
        line 136: 589
        line 139: 592
        line 140: 600
        line 143: 603
        line 144: 611
        line 147: 614
        line 148: 622
        line 151: 625
        line 152: 633
        line 155: 636
        line 158: 664
        line 159: 667
        line 160: 680
        line 161: 691
        line 163: 704
        line 165: 710
        line 166: 721
        line 167: 746
        line 168: 761
        line 169: 776
        line 170: 808
        line 171: 823
        line 172: 844
        line 173: 873
        line 174: 902
        line 175: 914
        line 177: 939
        line 179: 952
        line 180: 973
        line 181: 999
        line 185: 1028
        line 186: 1039
        line 187: 1049
        line 189: 1059
        line 190: 1062
        line 192: 1075
        line 193: 1087
        line 194: 1100
        line 195: 1113
        line 196: 1126
        line 197: 1139
        line 198: 1152
        line 200: 1167
        line 202: 1173
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      11     5 targetDoor   Lext/mods/gameserver/model/actor/instance/Door;
          450      10    14  page   I
          465       9    14     e   Ljava/lang/Exception;
          521      41    14  page   I
          543      19    15 subPage   I
          567      11    14     e   Ljava/lang/Exception;
          110     554    11 subCommand   Ljava/lang/String;
           77     587    10    st   Ljava/util/StringTokenizer;
           65     602     6 targetNpc   Lext/mods/gameserver/model/actor/Npc;
          680      11     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          952      76    11 targetPet   Lext/mods/gameserver/model/actor/instance/Pet;
          710     349    10 owner   Lext/mods/gameserver/model/actor/Player;
          704     358     8 targetSummon   Lext/mods/gameserver/model/actor/Summon;
         1075      92     9 targetStaticObject   Lext/mods/gameserver/model/actor/instance/StaticObject;
           18    1155     3 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
           28    1145     4  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0    1174     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminInfo;
            0    1174     1 command   Ljava/lang/String;
            0    1174     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 49
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, class ext/mods/gameserver/model/actor/Npc, top, top, top, class java/util/StringTokenizer ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 108
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 13 /* same */
        frame_type = 54 /* same */
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, class ext/mods/gameserver/model/actor/Npc, top, top, top, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, class ext/mods/gameserver/model/actor/Npc, top, top, top, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, class ext/mods/gameserver/model/actor/Npc, top, top, top, class java/util/StringTokenizer, class java/lang/String, class java/lang/String, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, class ext/mods/gameserver/model/actor/Npc ]
          stack = []
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 127
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, top, top, top, class ext/mods/gameserver/model/actor/Summon, top, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 57
        frame_type = 249 /* chop */
          offset_delta = 30
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 104
        frame_type = 249 /* chop */
          offset_delta = 5

  public static void showPetInfo(ext.mods.gameserver.model.actor.Summon, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.NpcHtmlMessage);
    descriptor: (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=6, args_size=3
         0: aload_0
         1: ifnull        332
         4: aload_0
         5: astore_3
         6: aload_0
         7: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Summon.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore        4
        12: aload_2
        13: aload_1
        14: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        17: ldc           #153                // String html/admin/petinfo.htm
        19: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        22: aload_2
        23: ldc           #159                // String %name%
        25: aload_0
        26: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Summon.getName:()Ljava/lang/String;
        29: ifnonnull     37
        32: ldc           #164                // String N/A
        34: goto          41
        37: aload_0
        38: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Summon.getName:()Ljava/lang/String;
        41: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        44: aload_2
        45: ldc           #169                // String %level%
        47: aload_3
        48: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
        51: invokevirtual #175                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getLevel:()I
        54: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        57: aload_2
        58: ldc           #183                // String %exp%
        60: aload_3
        61: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
        64: invokevirtual #185                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getExp:()J
        67: invokevirtual #189                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
        70: aload_2
        71: ldc           #192                // String %owner%
        73: aload         4
        75: ifnonnull     83
        78: ldc           #164                // String N/A
        80: goto          98
        83: aload         4
        85: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        88: aload         4
        90: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        93: invokedynamic #195,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        98: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       101: aload_2
       102: ldc           #199                // String %class%
       104: aload_3
       105: invokevirtual #201                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       108: invokevirtual #205                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       111: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       114: aload_2
       115: ldc           #210                // String %ai%
       117: aload_3
       118: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       121: invokevirtual #216                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       124: invokevirtual #222                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       127: invokevirtual #228                // Method ext/mods/gameserver/enums/IntentionType.name:()Ljava/lang/String;
       130: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       133: aload_2
       134: ldc           #233                // String %hp%
       136: aload_3
       137: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       140: invokevirtual #235                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getHp:()D
       143: d2i
       144: aload_3
       145: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       148: invokevirtual #239                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getMaxHp:()I
       151: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       156: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       159: aload_2
       160: ldc           #245                // String %mp%
       162: aload_3
       163: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       166: invokevirtual #247                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getMp:()D
       169: d2i
       170: aload_3
       171: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       174: invokevirtual #250                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getMaxMp:()I
       177: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       182: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       185: aload_2
       186: ldc           #253                // String %karma%
       188: aload_3
       189: invokevirtual #255                // Method ext/mods/gameserver/model/actor/Summon.getKarma:()I
       192: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       195: aload_2
       196: ldc_w         #258                // String %undead%
       199: aload_3
       200: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Summon.isUndead:()Z
       203: ifeq          212
       206: ldc_w         #263                // String yes
       209: goto          215
       212: ldc_w         #265                // String no
       215: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       218: aload_0
       219: instanceof    #267                // class ext/mods/gameserver/model/actor/instance/Pet
       222: ifeq          304
       225: aload_0
       226: checkcast     #267                // class ext/mods/gameserver/model/actor/instance/Pet
       229: astore        5
       231: aload_2
       232: ldc_w         #269                // String %inv%
       235: aload         4
       237: ifnonnull     245
       240: ldc           #164                // String N/A
       242: goto          248
       245: ldc_w         #271                // String  <a action=\"bypass admin_summon inventory\">view</a>
       248: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       251: aload_2
       252: ldc_w         #273                // String %food%
       255: aload         5
       257: invokevirtual #275                // Method ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
       260: aload         5
       262: invokevirtual #278                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
       265: invokevirtual #282                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
       268: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       273: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       276: aload_2
       277: ldc_w         #287                // String %load%
       280: aload         5
       282: invokevirtual #289                // Method ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
       285: invokevirtual #293                // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getTotalWeight:()I
       288: aload         5
       290: invokevirtual #298                // Method ext/mods/gameserver/model/actor/instance/Pet.getWeightLimit:()I
       293: invokedynamic #242,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       298: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       301: goto          332
       304: aload_2
       305: ldc_w         #269                // String %inv%
       308: ldc_w         #301                // String none
       311: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       314: aload_2
       315: ldc_w         #273                // String %food%
       318: ldc           #164                // String N/A
       320: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       323: aload_2
       324: ldc_w         #287                // String %load%
       327: ldc           #164                // String N/A
       329: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       332: return
      LineNumberTable:
        line 206: 0
        line 208: 4
        line 209: 6
        line 211: 12
        line 212: 22
        line 213: 44
        line 214: 57
        line 215: 70
        line 216: 101
        line 217: 114
        line 218: 133
        line 219: 159
        line 220: 185
        line 221: 195
        line 223: 218
        line 225: 231
        line 226: 251
        line 227: 276
        line 231: 304
        line 232: 314
        line 233: 323
        line 236: 332
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          231      73     5 targetPet   Lext/mods/gameserver/model/actor/instance/Pet;
            6     326     3 targetSummon   Lext/mods/gameserver/model/actor/Summon;
           12     320     4 owner   Lext/mods/gameserver/model/actor/Player;
            0     333     0   pet   Lext/mods/gameserver/model/actor/Summon;
            0     333     1 player   Lext/mods/gameserver/model/actor/Player;
            0     333     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Pet ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 55
        frame_type = 249 /* chop */
          offset_delta = 27

  public static void showDoorInfo(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.instance.Door, ext.mods.gameserver.network.serverpackets.NpcHtmlMessage);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_2
         1: aload_0
         2: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
         5: ldc_w         #337                // String html/admin/doorinfo.htm
         8: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        11: aload_2
        12: ldc           #159                // String %name%
        14: aload_1
        15: invokevirtual #339                // Method ext/mods/gameserver/model/actor/instance/Door.getName:()Ljava/lang/String;
        18: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        21: aload_2
        22: ldc_w         #322                // String %objid%
        25: aload_1
        26: invokevirtual #340                // Method ext/mods/gameserver/model/actor/instance/Door.getObjectId:()I
        29: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        32: aload_2
        33: ldc_w         #341                // String %doorid%
        36: aload_1
        37: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        40: invokevirtual #347                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getId:()I
        43: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        46: aload_2
        47: ldc_w         #352                // String %doortype%
        50: aload_1
        51: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        54: invokevirtual #354                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getType:()Lext/mods/gameserver/enums/DoorType;
        57: invokevirtual #357                // Method ext/mods/gameserver/enums/DoorType.toString:()Ljava/lang/String;
        60: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        63: aload_2
        64: ldc_w         #362                // String %doorlvl%
        67: aload_1
        68: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
        71: invokevirtual #364                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getLevel:()I
        74: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        77: aload_2
        78: ldc_w         #365                // String %residence%
        81: aload_1
        82: invokevirtual #367                // Method ext/mods/gameserver/model/actor/instance/Door.getResidence:()Lext/mods/gameserver/model/residence/Residence;
        85: ifnull        98
        88: aload_1
        89: invokevirtual #367                // Method ext/mods/gameserver/model/actor/instance/Door.getResidence:()Lext/mods/gameserver/model/residence/Residence;
        92: invokevirtual #371                // Method ext/mods/gameserver/model/residence/Residence.getName:()Ljava/lang/String;
        95: goto          101
        98: ldc_w         #301                // String none
       101: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       104: aload_2
       105: ldc_w         #374                // String %opentype%
       108: aload_1
       109: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       112: invokevirtual #376                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenType:()Lext/mods/gameserver/enums/OpenType;
       115: invokevirtual #380                // Method ext/mods/gameserver/enums/OpenType.toString:()Ljava/lang/String;
       118: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       121: aload_2
       122: ldc_w         #383                // String %initial%
       125: aload_1
       126: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       129: invokevirtual #385                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.isOpened:()Z
       132: ifeq          141
       135: ldc_w         #388                // String Opened
       138: goto          144
       141: ldc_w         #390                // String Closed
       144: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       147: aload_2
       148: ldc_w         #392                // String %ot%
       151: aload_1
       152: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       155: invokevirtual #394                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getOpenTime:()I
       158: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       161: aload_2
       162: ldc_w         #397                // String %ct%
       165: aload_1
       166: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       169: invokevirtual #399                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getCloseTime:()I
       172: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       175: aload_2
       176: ldc_w         #402                // String %rt%
       179: aload_1
       180: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       183: invokevirtual #404                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getRandomTime:()I
       186: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       189: aload_2
       190: ldc_w         #407                // String %controlid%
       193: aload_1
       194: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       197: invokevirtual #409                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getTriggerId:()I
       200: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       203: aload_2
       204: ldc           #233                // String %hp%
       206: aload_1
       207: invokevirtual #412                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
       210: invokevirtual #415                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getHp:()D
       213: d2i
       214: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       217: aload_2
       218: ldc_w         #418                // String %hpmax%
       221: aload_1
       222: invokevirtual #412                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
       225: invokevirtual #420                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getMaxHp:()I
       228: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       231: aload_2
       232: ldc_w         #421                // String %hpratio%
       235: aload_1
       236: invokevirtual #412                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
       239: invokevirtual #423                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getUpgradeHpRatio:()I
       242: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       245: aload_2
       246: ldc_w         #426                // String %pdef%
       249: aload_1
       250: invokevirtual #412                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
       253: aconst_null
       254: invokevirtual #428                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
       257: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       260: aload_2
       261: ldc_w         #432                // String %mdef%
       264: aload_1
       265: invokevirtual #412                // Method ext/mods/gameserver/model/actor/instance/Door.getStatus:()Lext/mods/gameserver/model/actor/status/DoorStatus;
       268: aconst_null
       269: aconst_null
       270: invokevirtual #434                // Method ext/mods/gameserver/model/actor/status/DoorStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       273: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       276: aload_2
       277: ldc_w         #438                // String %spawn%
       280: aload_1
       281: invokevirtual #440                // Method ext/mods/gameserver/model/actor/instance/Door.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       284: invokevirtual #444                // Method ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
       287: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       290: aload_2
       291: ldc_w         #447                // String %height%
       294: aload_1
       295: invokevirtual #343                // Method ext/mods/gameserver/model/actor/instance/Door.getTemplate:()Lext/mods/gameserver/model/actor/template/DoorTemplate;
       298: invokevirtual #449                // Method ext/mods/gameserver/model/actor/template/DoorTemplate.getCollisionHeight:()D
       301: invokevirtual #452                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       304: return
      LineNumberTable:
        line 240: 0
        line 241: 11
        line 242: 21
        line 243: 32
        line 244: 46
        line 245: 63
        line 246: 77
        line 247: 104
        line 248: 121
        line 249: 147
        line 250: 161
        line 251: 175
        line 252: 189
        line 253: 203
        line 254: 217
        line 255: 231
        line 256: 245
        line 257: 260
        line 258: 276
        line 259: 290
        line 260: 304
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     305     0 player   Lext/mods/gameserver/model/actor/Player;
            0     305     1 targetDoor   Lext/mods/gameserver/model/actor/instance/Door;
            0     305     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Door, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #455                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 265: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminInfo;

  public static void sendGeneralInfos(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.network.serverpackets.NpcHtmlMessage, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=4, args_size=4
         0: iload_3
         1: tableswitch   { // 0 to 2

                       0: 28

                       1: 247

                       2: 430
                 default: 28
            }
        28: aload_2
        29: aload_0
        30: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        33: ldc_w         #1038               // String html/admin/npcinfo/general-0.htm
        36: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        39: aload_2
        40: ldc_w         #1040               // String %objectId%
        43: aload_1
        44: invokevirtual #1042               // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
        47: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        50: aload_2
        51: ldc_w         #1043               // String %npcId%
        54: aload_1
        55: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        58: invokevirtual #1045               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        61: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        64: aload_2
        65: ldc_w         #1048               // String %idTemplate%
        68: aload_1
        69: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        72: invokevirtual #1050               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getIdTemplate:()I
        75: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        78: aload_2
        79: ldc           #159                // String %name%
        81: aload_1
        82: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        85: invokevirtual #1053               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getName:()Ljava/lang/String;
        88: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        91: aload_2
        92: ldc_w         #1054               // String %title%
        95: aload_1
        96: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        99: invokevirtual #1056               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getTitle:()Ljava/lang/String;
       102: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       105: aload_2
       106: ldc_w         #1059               // String %alias%
       109: aload_1
       110: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       113: invokevirtual #1061               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
       116: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       119: aload_2
       120: ldc_w         #1064               // String %usingServerSideName%
       123: aload_1
       124: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       127: invokevirtual #1066               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isUsingServerSideName:()Z
       130: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       133: aload_2
       134: ldc_w         #1072               // String %usingServerSideTitle%
       137: aload_1
       138: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       141: invokevirtual #1074               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isUsingServerSideTitle:()Z
       144: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       147: aload_2
       148: ldc_w         #1077               // String %type%
       151: aload_1
       152: invokevirtual #201                // Method java/lang/Object.getClass:()Ljava/lang/Class;
       155: invokevirtual #205                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
       158: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       161: aload_2
       162: ldc           #169                // String %level%
       164: aload_1
       165: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       168: invokevirtual #1079               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLevel:()B
       171: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       174: aload_2
       175: ldc_w         #1082               // String %radius%
       178: aload_1
       179: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       182: invokevirtual #1084               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionRadius:()D
       185: invokevirtual #452                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       188: aload_2
       189: ldc_w         #447                // String %height%
       192: aload_1
       193: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       196: invokevirtual #1087               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCollisionHeight:()D
       199: invokevirtual #452                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       202: aload_2
       203: ldc_w         #1088               // String %hitTimeFactor%
       206: aload_1
       207: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       210: invokevirtual #1090               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getHitTimeFactor:()D
       213: invokevirtual #452                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       216: aload_2
       217: ldc_w         #1093               // String %rHand%
       220: aload_1
       221: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       224: invokevirtual #1095               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRightHand:()I
       227: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       230: aload_2
       231: ldc_w         #1098               // String %lHand%
       234: aload_1
       235: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       238: invokevirtual #1100               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getLeftHand:()I
       241: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       244: goto          552
       247: aload_2
       248: aload_0
       249: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       252: ldc_w         #1103               // String html/admin/npcinfo/general-1.htm
       255: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       258: aload_2
       259: ldc           #183                // String %exp%
       261: aload_1
       262: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       265: invokevirtual #1105               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardExp:()D
       268: invokevirtual #452                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       271: aload_2
       272: ldc_w         #1108               // String %sp%
       275: aload_1
       276: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       279: invokevirtual #1110               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRewardSp:()D
       282: invokevirtual #452                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       285: aload_2
       286: ldc_w         #1113               // String %baseAttackRange%
       289: aload_1
       290: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       293: invokevirtual #1115               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseAttackRange:()I
       296: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       299: aload_2
       300: ldc_w         #1118               // String %baseDamageRange%
       303: aload_1
       304: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       307: invokevirtual #1120               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseDamageRange:()[I
       310: invokestatic  #1124               // Method java/util/Arrays.toString:([I)Ljava/lang/String;
       313: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       316: aload_2
       317: ldc_w         #1129               // String %baseRandomDamage%
       320: aload_1
       321: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       324: invokevirtual #1131               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getBaseRandomDamage:()I
       327: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       330: aload_2
       331: ldc_w         #1134               // String %race%
       334: aload_1
       335: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       338: invokevirtual #1136               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
       341: invokevirtual #1140               // Method ext/mods/gameserver/enums/actors/NpcRace.toString:()Ljava/lang/String;
       344: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       347: aload_2
       348: ldc_w         #1143               // String %clan%
       351: aload_1
       352: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       355: invokevirtual #1145               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       358: ifnonnull     367
       361: ldc_w         #301                // String none
       364: goto          377
       367: aload_1
       368: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       371: invokevirtual #1145               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       374: invokestatic  #1149               // Method java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
       377: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       380: aload_2
       381: ldc_w         #1152               // String %clanRange%
       384: aload_1
       385: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       388: invokevirtual #1154               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       391: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       394: aload_2
       395: ldc_w         #1157               // String %ignoredIds%
       398: aload_1
       399: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       402: invokevirtual #1159               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getIgnoredIds:()[I
       405: ifnonnull     414
       408: ldc_w         #301                // String none
       411: goto          424
       414: aload_1
       415: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       418: invokevirtual #1159               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getIgnoredIds:()[I
       421: invokestatic  #1124               // Method java/util/Arrays.toString:([I)Ljava/lang/String;
       424: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       427: goto          552
       430: aload_2
       431: aload_0
       432: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       435: ldc_w         #1162               // String html/admin/npcinfo/general-2.htm
       438: invokevirtual #155                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       441: aload_2
       442: ldc_w         #1164               // String %isUndying%
       445: aload_1
       446: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       449: invokevirtual #1166               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isUndying:()Z
       452: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       455: aload_2
       456: ldc_w         #1169               // String %canBeAttacked%
       459: aload_1
       460: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       463: invokevirtual #1171               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canBeAttacked:()Z
       466: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       469: aload_2
       470: ldc_w         #1174               // String %isNoSleepMode%
       473: aload_1
       474: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       477: invokevirtual #1176               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isNoSleepMode:()Z
       480: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       483: aload_2
       484: ldc_w         #1179               // String %aggroRange%
       487: aload_1
       488: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       491: invokevirtual #1181               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
       494: invokevirtual #180                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       497: aload_2
       498: ldc_w         #1184               // String %canMove%
       501: aload_1
       502: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       505: invokevirtual #1186               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.canMove:()Z
       508: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       511: aload_2
       512: ldc_w         #1189               // String %isSeedable%
       515: aload_1
       516: invokevirtual #472                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       519: invokevirtual #1191               // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isSeedable:()Z
       522: invokevirtual #1069               // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Z)V
       525: aload_2
       526: ldc_w         #365                // String %residence%
       529: aload_1
       530: invokevirtual #1194               // Method ext/mods/gameserver/model/actor/Npc.getResidence:()Lext/mods/gameserver/model/residence/Residence;
       533: ifnull        546
       536: aload_1
       537: invokevirtual #1194               // Method ext/mods/gameserver/model/actor/Npc.getResidence:()Lext/mods/gameserver/model/residence/Residence;
       540: invokevirtual #371                // Method ext/mods/gameserver/model/residence/Residence.getName:()Ljava/lang/String;
       543: goto          549
       546: ldc_w         #301                // String none
       549: invokevirtual #166                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       552: return
      LineNumberTable:
        line 559: 0
        line 563: 28
        line 564: 39
        line 566: 50
        line 567: 64
        line 569: 78
        line 570: 91
        line 571: 105
        line 573: 119
        line 574: 133
        line 576: 147
        line 577: 161
        line 579: 174
        line 580: 188
        line 582: 202
        line 584: 216
        line 585: 230
        line 586: 244
        line 589: 247
        line 590: 258
        line 591: 271
        line 593: 285
        line 594: 299
        line 595: 316
        line 597: 330
        line 599: 347
        line 600: 380
        line 601: 394
        line 602: 427
        line 605: 430
        line 606: 441
        line 607: 455
        line 608: 469
        line 609: 483
        line 610: 497
        line 611: 511
        line 613: 525
        line 616: 552
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     553     0 player   Lext/mods/gameserver/model/actor/Player;
            0     553     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0     553     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     553     3 index   I
      StackMapTable: number_of_entries = 10
        frame_type = 28 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 218
        frame_type = 255 /* full_frame */
          offset_delta = 119
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 115
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 2 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #10                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #7                  // String admin_info
         8: aastore
         9: putstatic     #455                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        12: new           #916                // class java/text/DecimalFormat
        15: dup
        16: ldc_w         #1592               // String #.###
        19: invokespecial #1594               // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        22: putstatic     #911                // Field PERCENT:Ljava/text/DecimalFormat;
        25: return
      LineNumberTable:
        line 69: 0
        line 74: 12
}
SourceFile: "AdminInfo.java"
BootstrapMethods:
  0: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1722  <a action=\"bypass -h admin_debug \u0001\">\u0001</a>
  1: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1724 \u0001/\u0001
  2: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1726 (Ljava/lang/Object;)Ljava/lang/Object;
      #1727 REF_invokeInterface java/util/Collection.stream:()Ljava/util/stream/Stream;
      #1728 (Ljava/util/List;)Ljava/util/stream/Stream;
  3: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1730 (Ljava/lang/Object;)Z
      #1731 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendAiInfos$0:(Lext/mods/gameserver/scripting/Quest;)Z
      #1734 (Lext/mods/gameserver/scripting/Quest;)Z
  4: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1726 (Ljava/lang/Object;)Ljava/lang/Object;
      #1735 REF_invokeVirtual ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
      #1736 (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  5: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1730 (Ljava/lang/Object;)Z
      #1738 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
      #1741 (Lext/mods/gameserver/model/item/DropCategory;)Z
  6: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1730 (Ljava/lang/Object;)Z
      #1742 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
      #1741 (Lext/mods/gameserver/model/item/DropCategory;)Z
  7: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1730 (Ljava/lang/Object;)Z
      #1745 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
      #1741 (Lext/mods/gameserver/model/item/DropCategory;)Z
  8: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1748 \u0001
  9: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1750 \u0001-\u0001
  10: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1752 R: \u0001
  11: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1754 <td width=44 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=\"-5\"><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  12: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1756 bypass admin_info \u0001 \u0001 %page%
  13: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1758 \u0001 - \u0001
  14: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1760 bypass admin_info \u0001 %page% 1
  15: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1762  affecting player \u0001
  16: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1764 \u0001 \u0001 \u0001
  17: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1766 <a action=\"bypass -h admin_maker \u0001\">\u0001</a>
  18: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1768 loc: fixed \u0001, \u0001, \u0001
  19: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1770 loc: fixed random 1 of \u0001
  20: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1772 loc: \u0001
  21: #1780 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1774 <font color=\"777777\">\u0001</font>
  22: #1786 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1730 (Ljava/lang/Object;)Z
      #1776 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.lambda$sendDropInfos$2:(Lext/mods/gameserver/model/item/DropData;)Z
      #1779 (Lext/mods/gameserver/model/item/DropData;)Z
InnerClasses:
  public static #1794= #565 of #482;      // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #1799= #1795 of #1797; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
