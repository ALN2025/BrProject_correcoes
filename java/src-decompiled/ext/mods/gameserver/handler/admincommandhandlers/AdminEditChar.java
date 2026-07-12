// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminEditChar
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminEditChar.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.class
  Last modified 9 de jul de 2026; size 23501 bytes
  MD5 checksum 98b3da56185a6cf1ab70cdedc8ffdd72
  Compiled from "AdminEditChar.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminEditChar implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #31                         // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = String             #10           //
   #10 = Utf8
   #11 = Methodref          #7.#12        // java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #14 = Methodref          #7.#15        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #15 = NameAndType        #16:#17       // nextToken:()Ljava/lang/String;
   #16 = Utf8               nextToken
   #17 = Utf8               ()Ljava/lang/String;
   #18 = String             #19           // admin_debug
   #19 = Utf8               admin_debug
   #20 = Methodref          #21.#22       // java/lang/String.startsWith:(Ljava/lang/String;)Z
   #21 = Class              #23           // java/lang/String
   #22 = NameAndType        #24:#25       // startsWith:(Ljava/lang/String;)Z
   #23 = Utf8               java/lang/String
   #24 = Utf8               startsWith
   #25 = Utf8               (Ljava/lang/String;)Z
   #26 = Methodref          #7.#27        // java/util/StringTokenizer.hasMoreTokens:()Z
   #27 = NameAndType        #28:#29       // hasMoreTokens:()Z
   #28 = Utf8               hasMoreTokens
   #29 = Utf8               ()Z
   #30 = Methodref          #31.#32       // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
   #31 = Class              #33           // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar
   #32 = NameAndType        #34:#35       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
   #33 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar
   #34 = Utf8               getTargetPlayer
   #35 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
   #36 = Methodref          #31.#37       // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #37 = NameAndType        #34:#38       // getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #38 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
   #39 = Methodref          #31.#40       // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #40 = NameAndType        #41:#42       // gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #41 = Utf8               gatherPlayerInfo
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #43 = String             #44           // admin_party_info
   #44 = Utf8               admin_party_info
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#50       // getParty:()Lext/mods/gameserver/model/group/Party;
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               getParty
   #50 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #51 = Methodref          #46.#52       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #52 = NameAndType        #53:#17       // getName:()Ljava/lang/String;
   #53 = Utf8               getName
   #54 = InvokeDynamic      #0:#55        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #55 = NameAndType        #56:#57       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #56 = Utf8               makeConcatWithConstants
   #57 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #58 = Methodref          #46.#59       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #59 = NameAndType        #60:#61       // sendMessage:(Ljava/lang/String;)V
   #60 = Utf8               sendMessage
   #61 = Utf8               (Ljava/lang/String;)V
   #62 = Class              #63           // java/lang/StringBuilder
   #63 = Utf8               java/lang/StringBuilder
   #64 = Methodref          #62.#65       // java/lang/StringBuilder."<init>":(I)V
   #65 = NameAndType        #5:#66        // "<init>":(I)V
   #66 = Utf8               (I)V
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
   #68 = Class              #70           // ext/mods/gameserver/model/group/Party
   #69 = NameAndType        #71:#72       // getMembers:()Ljava/util/List;
   #70 = Utf8               ext/mods/gameserver/model/group/Party
   #71 = Utf8               getMembers
   #72 = Utf8               ()Ljava/util/List;
   #73 = InterfaceMethodref #74.#75       // java/util/List.iterator:()Ljava/util/Iterator;
   #74 = Class              #76           // java/util/List
   #75 = NameAndType        #77:#78       // iterator:()Ljava/util/Iterator;
   #76 = Utf8               java/util/List
   #77 = Utf8               iterator
   #78 = Utf8               ()Ljava/util/Iterator;
   #79 = InterfaceMethodref #80.#81       // java/util/Iterator.hasNext:()Z
   #80 = Class              #82           // java/util/Iterator
   #81 = NameAndType        #83:#29       // hasNext:()Z
   #82 = Utf8               java/util/Iterator
   #83 = Utf8               hasNext
   #84 = InterfaceMethodref #80.#85       // java/util/Iterator.next:()Ljava/lang/Object;
   #85 = NameAndType        #86:#87       // next:()Ljava/lang/Object;
   #86 = Utf8               next
   #87 = Utf8               ()Ljava/lang/Object;
   #88 = Methodref          #68.#89       // ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
   #89 = NameAndType        #90:#91       // isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
   #90 = Utf8               isLeader
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #92 = String             #93           // <tr><td width=150><a action=\"bypass -h admin_debug
   #93 = Utf8               <tr><td width=150><a action=\"bypass -h admin_debug
   #94 = String             #95           // \">
   #95 = Utf8               \">
   #96 = String             #97           //  (
   #97 = Utf8                (
   #98 = Methodref          #46.#99       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #99 = NameAndType        #100:#101     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #100 = Utf8               getStatus
  #101 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #103 = Class              #105          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #104 = NameAndType        #106:#107     // getLevel:()I
  #105 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #106 = Utf8               getLevel
  #107 = Utf8               ()I
  #108 = Methodref          #109.#110     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #109 = Class              #111          // java/lang/Integer
  #110 = NameAndType        #112:#113     // valueOf:(I)Ljava/lang/Integer;
  #111 = Utf8               java/lang/Integer
  #112 = Utf8               valueOf
  #113 = Utf8               (I)Ljava/lang/Integer;
  #114 = String             #115          // )</a></td><td width=120 align=right>
  #115 = Utf8               )</a></td><td width=120 align=right>
  #116 = Methodref          #46.#117      // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #117 = NameAndType        #118:#119     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #118 = Utf8               getClassId
  #119 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #120 = Methodref          #121.#122     // ext/mods/gameserver/enums/actors/ClassId.toString:()Ljava/lang/String;
  #121 = Class              #123          // ext/mods/gameserver/enums/actors/ClassId
  #122 = NameAndType        #124:#17      // toString:()Ljava/lang/String;
  #123 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #124 = Utf8               toString
  #125 = String             #126          // </td></tr>
  #126 = Utf8               </td></tr>
  #127 = Methodref          #128.#129     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #128 = Class              #130          // ext/mods/commons/lang/StringUtil
  #129 = NameAndType        #131:#132     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #130 = Utf8               ext/mods/commons/lang/StringUtil
  #131 = Utf8               append
  #132 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #133 = String             #134          // \"><font color=\"LEVEL\">
  #134 = Utf8               \"><font color=\"LEVEL\">
  #135 = String             #136          // )</font></a></td><td width=120 align=right>
  #136 = Utf8               )</font></a></td><td width=120 align=right>
  #137 = Class              #138          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #138 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #139 = Methodref          #137.#65      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #140 = Methodref          #46.#141      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #141 = NameAndType        #142:#143     // getLocale:()Ljava/util/Locale;
  #142 = Utf8               getLocale
  #143 = Utf8               ()Ljava/util/Locale;
  #144 = String             #145          // html/admin/partyinfo.htm
  #145 = Utf8               html/admin/partyinfo.htm
  #146 = Methodref          #137.#147     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #147 = NameAndType        #148:#149     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #148 = Utf8               setFile
  #149 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #150 = String             #151          // %name%
  #151 = Utf8               %name%
  #152 = Methodref          #137.#153     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #153 = NameAndType        #154:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #154 = Utf8               replace
  #155 = String             #156          // %party%
  #156 = Utf8               %party%
  #157 = Methodref          #62.#122      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #158 = Methodref          #46.#159      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #159 = NameAndType        #160:#161     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #160 = Utf8               sendPacket
  #161 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #162 = String             #163          // admin_remove
  #163 = Utf8               admin_remove
  #164 = String             #165          // Usage: //remove <clan_penalty|death_penalty|skill_reuse>
  #165 = Utf8               Usage: //remove <clan_penalty|death_penalty|skill_reuse>
  #166 = Methodref          #21.#167      // java/lang/String.hashCode:()I
  #167 = NameAndType        #168:#107     // hashCode:()I
  #168 = Utf8               hashCode
  #169 = String             #170          // clan_penalty
  #170 = Utf8               clan_penalty
  #171 = Methodref          #21.#172      // java/lang/String.equals:(Ljava/lang/Object;)Z
  #172 = NameAndType        #173:#174     // equals:(Ljava/lang/Object;)Z
  #173 = Utf8               equals
  #174 = Utf8               (Ljava/lang/Object;)Z
  #175 = String             #176          // death_penalty
  #176 = Utf8               death_penalty
  #177 = String             #178          // skill_reuse
  #178 = Utf8               skill_reuse
  #179 = String             #180          // Usage: //remove clan_penalty join|create
  #180 = Utf8               Usage: //remove clan_penalty join|create
  #181 = String             #182          // create
  #182 = Utf8               create
  #183 = Methodref          #21.#184      // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #184 = NameAndType        #185:#186     // contains:(Ljava/lang/CharSequence;)Z
  #185 = Utf8               contains
  #186 = Utf8               (Ljava/lang/CharSequence;)Z
  #187 = Methodref          #46.#188      // ext/mods/gameserver/model/actor/Player.setClanCreateExpiryTime:(J)V
  #188 = NameAndType        #189:#190     // setClanCreateExpiryTime:(J)V
  #189 = Utf8               setClanCreateExpiryTime
  #190 = Utf8               (J)V
  #191 = String             #192          // join
  #192 = Utf8               join
  #193 = Methodref          #46.#194      // ext/mods/gameserver/model/actor/Player.setClanJoinExpiryTime:(J)V
  #194 = NameAndType        #195:#190     // setClanJoinExpiryTime:(J)V
  #195 = Utf8               setClanJoinExpiryTime
  #196 = InvokeDynamic      #1:#55        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #197 = Methodref          #46.#198      // ext/mods/gameserver/model/actor/Player.removeDeathPenaltyBuffLevel:()V
  #198 = NameAndType        #199:#6       // removeDeathPenaltyBuffLevel:()V
  #199 = Utf8               removeDeathPenaltyBuffLevel
  #200 = InvokeDynamic      #2:#55        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #201 = Methodref          #46.#202      // ext/mods/gameserver/model/actor/Player.getReuseTimeStamp:()Ljava/util/Map;
  #202 = NameAndType        #203:#204     // getReuseTimeStamp:()Ljava/util/Map;
  #203 = Utf8               getReuseTimeStamp
  #204 = Utf8               ()Ljava/util/Map;
  #205 = InterfaceMethodref #206.#207     // java/util/Map.clear:()V
  #206 = Class              #208          // java/util/Map
  #207 = NameAndType        #209:#6       // clear:()V
  #208 = Utf8               java/util/Map
  #209 = Utf8               clear
  #210 = Methodref          #46.#211      // ext/mods/gameserver/model/actor/Player.getDisabledSkills:()Ljava/util/Map;
  #211 = NameAndType        #212:#204     // getDisabledSkills:()Ljava/util/Map;
  #212 = Utf8               getDisabledSkills
  #213 = Class              #214          // ext/mods/gameserver/network/serverpackets/SkillCoolTime
  #214 = Utf8               ext/mods/gameserver/network/serverpackets/SkillCoolTime
  #215 = Methodref          #213.#216     // ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #216 = NameAndType        #5:#217       // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #217 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #218 = InvokeDynamic      #3:#55        // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #219 = String             #220          // admin_reset
  #220 = Utf8               admin_reset
  #221 = String             #222          // Usage: //reset <clan_graduate>
  #222 = Utf8               Usage: //reset <clan_graduate>
  #223 = String             #224          // clan_graduate
  #224 = Utf8               clan_graduate
  #225 = Methodref          #46.#226      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #226 = NameAndType        #227:#228     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #227 = Utf8               getClan
  #228 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #229 = Methodref          #230.#231     // ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #230 = Class              #232          // ext/mods/gameserver/data/sql/ClanTable
  #231 = NameAndType        #233:#234     // getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
  #232 = Utf8               ext/mods/gameserver/data/sql/ClanTable
  #233 = Utf8               getInstance
  #234 = Utf8               ()Lext/mods/gameserver/data/sql/ClanTable;
  #235 = Methodref          #230.#236     // ext/mods/gameserver/data/sql/ClanTable.clearGraduates:()V
  #236 = NameAndType        #237:#6       // clearGraduates:()V
  #237 = Utf8               clearGraduates
  #238 = String             #239          // All Clan graduates were cleaned.
  #239 = Utf8               All Clan graduates were cleaned.
  #240 = String             #241          // admin_set
  #241 = Utf8               admin_set
  #242 = String             #243          // Usage: //set <access|class|color|exp|karma|level>
  #243 = Utf8               Usage: //set <access|class|color|exp|karma|level>
  #244 = String             #245          // Usage: //set <name|noble|rec|sex|sp|tcolor|title>
  #245 = Utf8               Usage: //set <name|noble|rec|sex|sp|tcolor|title>
  #246 = String             #247          // Usage: //set <pvp|pk>
  #247 = Utf8               Usage: //set <pvp|pk>
  #248 = Class              #249          // ext/mods/gameserver/model/WorldObject
  #249 = Utf8               ext/mods/gameserver/model/WorldObject
  #250 = Methodref          #31.#251      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
  #251 = NameAndType        #252:#253     // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
  #252 = Utf8               getTarget
  #253 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
  #254 = String             #255          // access
  #255 = Utf8               access
  #256 = String             #257          // pvp
  #257 = Utf8               pvp
  #258 = String             #259          // pk
  #259 = Utf8               pk
  #260 = String             #261          // class
  #261 = Utf8               class
  #262 = String             #263          // color
  #263 = Utf8               color
  #264 = String             #265          // exp
  #265 = Utf8               exp
  #266 = String             #267          // karma
  #267 = Utf8               karma
  #268 = String             #269          // level
  #269 = Utf8               level
  #270 = String             #271          // name
  #271 = Utf8               name
  #272 = String             #273          // noble
  #273 = Utf8               noble
  #274 = String             #275          // rec
  #275 = Utf8               rec
  #276 = String             #277          // sex
  #277 = Utf8               sex
  #278 = String             #279          // sp
  #279 = Utf8               sp
  #280 = String             #281          // tcolor
  #281 = Utf8               tcolor
  #282 = String             #283          // title
  #283 = Utf8               title
  #284 = Methodref          #7.#285       // java/util/StringTokenizer.countTokens:()I
  #285 = NameAndType        #286:#107     // countTokens:()I
  #286 = Utf8               countTokens
  #287 = Methodref          #109.#288     // java/lang/Integer.parseInt:(Ljava/lang/String;)I
  #288 = NameAndType        #289:#290     // parseInt:(Ljava/lang/String;)I
  #289 = Utf8               parseInt
  #290 = Utf8               (Ljava/lang/String;)I
  #291 = Methodref          #46.#292      // ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
  #292 = NameAndType        #293:#66      // setAccessLevel:(I)V
  #293 = Utf8               setAccessLevel
  #294 = Methodref          #46.#295      // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #295 = NameAndType        #296:#297     // logout:(Z)V
  #296 = Utf8               logout
  #297 = Utf8               (Z)V
  #298 = InvokeDynamic      #4:#299       // #4:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #299 = NameAndType        #56:#300      // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #300 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #301 = Fieldref           #302.#303     // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #302 = Class              #304          // ext/mods/gameserver/network/SystemMessageId
  #303 = NameAndType        #305:#306     // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #304 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #305 = Utf8               INVALID_TARGET
  #306 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #307 = Methodref          #46.#308      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #308 = NameAndType        #160:#309     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #309 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #310 = Methodref          #311.#312     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #311 = Class              #313          // ext/mods/gameserver/model/World
  #312 = NameAndType        #233:#314     // getInstance:()Lext/mods/gameserver/model/World;
  #313 = Utf8               ext/mods/gameserver/model/World
  #314 = Utf8               ()Lext/mods/gameserver/model/World;
  #315 = Methodref          #311.#316     // ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #316 = NameAndType        #317:#318     // getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #317 = Utf8               getPlayer
  #318 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
  #319 = Methodref          #320.#321     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #320 = Class              #322          // ext/mods/commons/pool/ConnectionPool
  #321 = NameAndType        #323:#324     // getConnection:()Ljava/sql/Connection;
  #322 = Utf8               ext/mods/commons/pool/ConnectionPool
  #323 = Utf8               getConnection
  #324 = Utf8               ()Ljava/sql/Connection;
  #325 = String             #326          // UPDATE characters SET accesslevel=? WHERE char_name=?
  #326 = Utf8               UPDATE characters SET accesslevel=? WHERE char_name=?
  #327 = InterfaceMethodref #328.#329     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #328 = Class              #330          // java/sql/Connection
  #329 = NameAndType        #331:#332     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #330 = Utf8               java/sql/Connection
  #331 = Utf8               prepareStatement
  #332 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #333 = InterfaceMethodref #334.#335     // java/sql/PreparedStatement.setInt:(II)V
  #334 = Class              #336          // java/sql/PreparedStatement
  #335 = NameAndType        #337:#338     // setInt:(II)V
  #336 = Utf8               java/sql/PreparedStatement
  #337 = Utf8               setInt
  #338 = Utf8               (II)V
  #339 = InterfaceMethodref #334.#340     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #340 = NameAndType        #341:#342     // setString:(ILjava/lang/String;)V
  #341 = Utf8               setString
  #342 = Utf8               (ILjava/lang/String;)V
  #343 = InterfaceMethodref #334.#344     // java/sql/PreparedStatement.execute:()Z
  #344 = NameAndType        #345:#29      // execute:()Z
  #345 = Utf8               execute
  #346 = InterfaceMethodref #334.#347     // java/sql/PreparedStatement.getUpdateCount:()I
  #347 = NameAndType        #348:#107     // getUpdateCount:()I
  #348 = Utf8               getUpdateCount
  #349 = InvokeDynamic      #5:#55        // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #350 = InterfaceMethodref #334.#351     // java/sql/PreparedStatement.close:()V
  #351 = NameAndType        #352:#6       // close:()V
  #352 = Utf8               close
  #353 = Class              #354          // java/lang/Throwable
  #354 = Utf8               java/lang/Throwable
  #355 = Methodref          #353.#356     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #356 = NameAndType        #357:#358     // addSuppressed:(Ljava/lang/Throwable;)V
  #357 = Utf8               addSuppressed
  #358 = Utf8               (Ljava/lang/Throwable;)V
  #359 = InterfaceMethodref #328.#351     // java/sql/Connection.close:()V
  #360 = Class              #361          // java/lang/Exception
  #361 = Utf8               java/lang/Exception
  #362 = Fieldref           #31.#363      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.LOGGER:Lext/mods/commons/logging/CLogger;
  #363 = NameAndType        #364:#365     // LOGGER:Lext/mods/commons/logging/CLogger;
  #364 = Utf8               LOGGER
  #365 = Utf8               Lext/mods/commons/logging/CLogger;
  #366 = String             #367          // Couldn\'t update access.
  #367 = Utf8               Couldn\'t update access.
  #368 = Methodref          #369.#370     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #369 = Class              #371          // ext/mods/commons/logging/CLogger
  #370 = NameAndType        #372:#373     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #371 = Utf8               ext/mods/commons/logging/CLogger
  #372 = Utf8               error
  #373 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #374 = String             #375          // Usage: //set access <level> | <name> <level>
  #375 = Utf8               Usage: //set access <level> | <name> <level>
  #376 = String             #377          // The pvp value must be greater or equal to 0.
  #377 = Utf8               The pvp value must be greater or equal to 0.
  #378 = Methodref          #46.#379      // ext/mods/gameserver/model/actor/Player.setPvpKills:(I)V
  #379 = NameAndType        #380:#66      // setPvpKills:(I)V
  #380 = Utf8               setPvpKills
  #381 = Class              #382          // ext/mods/gameserver/network/serverpackets/UserInfo
  #382 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
  #383 = Methodref          #381.#216     // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
  #384 = InvokeDynamic      #6:#299       // #6:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #385 = String             #386          // Usage: //set pvp <number>
  #386 = Utf8               Usage: //set pvp <number>
  #387 = String             #388          // The pk value must be greater or equal to 0.
  #388 = Utf8               The pk value must be greater or equal to 0.
  #389 = Methodref          #46.#390      // ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
  #390 = NameAndType        #391:#66      // setPkKills:(I)V
  #391 = Utf8               setPkKills
  #392 = InvokeDynamic      #7:#299       // #7:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #393 = String             #394          // Usage: //set pk <number>
  #394 = Utf8               Usage: //set pk <number>
  #395 = Fieldref           #121.#396     // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #396 = NameAndType        #397:#398     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #397 = Utf8               VALUES
  #398 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #399 = Methodref          #121.#104     // ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
  #400 = InvokeDynamic      #8:#55        // #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #401 = InvokeDynamic      #9:#402       // #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #402 = NameAndType        #56:#403      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #403 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #404 = Methodref          #46.#405      // ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
  #405 = NameAndType        #406:#297     // abortAll:(Z)V
  #406 = Utf8               abortAll
  #407 = Fieldref           #408.#409     // ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #408 = Class              #410          // ext/mods/gameserver/enums/skills/AbnormalEffect
  #409 = NameAndType        #411:#412     // HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #410 = Utf8               ext/mods/gameserver/enums/skills/AbnormalEffect
  #411 = Utf8               HOLD_2
  #412 = Utf8               Lext/mods/gameserver/enums/skills/AbnormalEffect;
  #413 = Methodref          #46.#414      // ext/mods/gameserver/model/actor/Player.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #414 = NameAndType        #415:#416     // startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #415 = Utf8               startAbnormalEffect
  #416 = Utf8               (Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #417 = Methodref          #46.#418      // ext/mods/gameserver/model/actor/Player.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #418 = NameAndType        #419:#420     // removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
  #419 = Utf8               removeKnownObject
  #420 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #421 = Methodref          #46.#422      // ext/mods/gameserver/model/actor/Player.decayMe:()V
  #422 = NameAndType        #423:#6       // decayMe:()V
  #423 = Utf8               decayMe
  #424 = InvokeDynamic      #10:#425      // #10:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #425 = NameAndType        #426:#427     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #426 = Utf8               run
  #427 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #428 = Long               4000l
  #430 = Methodref          #431.#432     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #431 = Class              #433          // ext/mods/commons/pool/ThreadPool
  #432 = NameAndType        #434:#435     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #433 = Utf8               ext/mods/commons/pool/ThreadPool
  #434 = Utf8               schedule
  #435 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #436 = String             #437          // charclasses.htm
  #437 = Utf8               charclasses.htm
  #438 = Methodref          #31.#439      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #439 = NameAndType        #440:#441     // sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #440 = Utf8               sendFile
  #441 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #442 = InvokeDynamic      #11:#55       // #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #443 = Methodref          #109.#444     // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #444 = NameAndType        #445:#446     // decode:(Ljava/lang/String;)Ljava/lang/Integer;
  #445 = Utf8               decode
  #446 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #447 = Methodref          #109.#448     // java/lang/Integer.intValue:()I
  #448 = NameAndType        #449:#107     // intValue:()I
  #449 = Utf8               intValue
  #450 = Methodref          #46.#451      // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #451 = NameAndType        #452:#453     // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #452 = Utf8               getAppearance
  #453 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #454 = Methodref          #455.#456     // ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
  #455 = Class              #457          // ext/mods/gameserver/model/actor/container/player/Appearance
  #456 = NameAndType        #458:#66      // setNameColor:(I)V
  #457 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #458 = Utf8               setNameColor
  #459 = Methodref          #46.#460      // ext/mods/gameserver/model/actor/Player.setNameColor:(I)I
  #460 = NameAndType        #458:#461     // setNameColor:(I)I
  #461 = Utf8               (I)I
  #462 = Methodref          #46.#463      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #463 = NameAndType        #464:#6       // broadcastUserInfo:()V
  #464 = Utf8               broadcastUserInfo
  #465 = InvokeDynamic      #12:#55       // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #466 = String             #467          // Usage: //set color <number>
  #467 = Utf8               Usage: //set color <number>
  #468 = Methodref          #469.#470     // java/lang/Long.parseLong:(Ljava/lang/String;)J
  #469 = Class              #471          // java/lang/Long
  #470 = NameAndType        #472:#473     // parseLong:(Ljava/lang/String;)J
  #471 = Utf8               java/lang/Long
  #472 = Utf8               parseLong
  #473 = Utf8               (Ljava/lang/String;)J
  #474 = Methodref          #103.#475     // ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
  #475 = NameAndType        #476:#477     // getExp:()J
  #476 = Utf8               getExp
  #477 = Utf8               ()J
  #478 = Methodref          #46.#479      // ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
  #479 = NameAndType        #480:#481     // addExpAndSp:(JI)V
  #480 = Utf8               addExpAndSp
  #481 = Utf8               (JI)V
  #482 = Methodref          #46.#483      // ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
  #483 = NameAndType        #484:#481     // removeExpAndSp:(JI)V
  #484 = Utf8               removeExpAndSp
  #485 = InvokeDynamic      #13:#486      // #13:makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
  #486 = NameAndType        #56:#487      // makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
  #487 = Utf8               (Ljava/lang/String;J)Ljava/lang/String;
  #488 = String             #489          // Usage: //set exp <number>
  #489 = Utf8               Usage: //set exp <number>
  #490 = String             #491          // The karma value must be greater or equal to 0.
  #491 = Utf8               The karma value must be greater or equal to 0.
  #492 = Methodref          #46.#493      // ext/mods/gameserver/model/actor/Player.setKarma:(I)V
  #493 = NameAndType        #494:#66      // setKarma:(I)V
  #494 = Utf8               setKarma
  #495 = InvokeDynamic      #14:#299      // #14:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #496 = String             #497          // Usage: //set karma <number>
  #497 = Utf8               Usage: //set karma <number>
  #498 = Methodref          #499.#500     // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #499 = Class              #501          // ext/mods/gameserver/data/xml/PlayerLevelData
  #500 = NameAndType        #233:#502     // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #501 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
  #502 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
  #503 = Methodref          #499.#504     // ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #504 = NameAndType        #505:#506     // getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #505 = Utf8               getPlayerLevel
  #506 = Utf8               (I)Lext/mods/gameserver/model/records/PlayerLevel;
  #507 = String             #508          // Invalid used level for //set level.
  #508 = Utf8               Invalid used level for //set level.
  #509 = Methodref          #510.#511     // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
  #510 = Class              #512          // ext/mods/gameserver/model/records/PlayerLevel
  #511 = NameAndType        #513:#477     // requiredExpToLevelUp:()J
  #512 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
  #513 = Utf8               requiredExpToLevelUp
  #514 = InvokeDynamic      #15:#299      // #15:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #515 = String             #516          // Usage: //set level <number>
  #516 = Utf8               Usage: //set level <number>
  #517 = Methodref          #518.#519     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #518 = Class              #520          // java/util/Objects
  #519 = NameAndType        #521:#522     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #520 = Utf8               java/util/Objects
  #521 = Utf8               requireNonNull
  #522 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #523 = InvokeDynamic      #16:#524      // #16:typeSwitch:(Lext/mods/gameserver/model/WorldObject;I)I
  #524 = NameAndType        #525:#526     // typeSwitch:(Lext/mods/gameserver/model/WorldObject;I)I
  #525 = Utf8               typeSwitch
  #526 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)I
  #527 = String             #528          // ^[A-Za-z0-9]{1,16}$
  #528 = Utf8               ^[A-Za-z0-9]{1,16}$
  #529 = Methodref          #128.#530     // ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
  #530 = NameAndType        #531:#532     // isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
  #531 = Utf8               isValidString
  #532 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Z
  #533 = Fieldref           #302.#534     // ext/mods/gameserver/network/SystemMessageId.INCORRECT_NAME_TRY_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
  #534 = NameAndType        #535:#306     // INCORRECT_NAME_TRY_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
  #535 = Utf8               INCORRECT_NAME_TRY_AGAIN
  #536 = Methodref          #537.#538     // ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #537 = Class              #539          // ext/mods/gameserver/data/xml/NpcData
  #538 = NameAndType        #233:#540     // getInstance:()Lext/mods/gameserver/data/xml/NpcData;
  #539 = Utf8               ext/mods/gameserver/data/xml/NpcData
  #540 = Utf8               ()Lext/mods/gameserver/data/xml/NpcData;
  #541 = Methodref          #537.#542     // ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #542 = NameAndType        #543:#544     // getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #543 = Utf8               getTemplateByName
  #544 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #545 = Methodref          #546.#547     // ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #546 = Class              #548          // ext/mods/gameserver/data/sql/PlayerInfoTable
  #547 = NameAndType        #233:#549     // getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #548 = Utf8               ext/mods/gameserver/data/sql/PlayerInfoTable
  #549 = Utf8               ()Lext/mods/gameserver/data/sql/PlayerInfoTable;
  #550 = Methodref          #546.#551     // ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
  #551 = NameAndType        #552:#290     // getPlayerObjectId:(Ljava/lang/String;)I
  #552 = Utf8               getPlayerObjectId
  #553 = Methodref          #21.#554      // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #554 = NameAndType        #555:#25      // equalsIgnoreCase:(Ljava/lang/String;)Z
  #555 = Utf8               equalsIgnoreCase
  #556 = InvokeDynamic      #17:#55       // #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #557 = Methodref          #46.#558      // ext/mods/gameserver/model/actor/Player.setName:(Ljava/lang/String;)V
  #558 = NameAndType        #559:#61      // setName:(Ljava/lang/String;)V
  #559 = Utf8               setName
  #560 = Methodref          #546.#561     // ext/mods/gameserver/data/sql/PlayerInfoTable.updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
  #561 = NameAndType        #562:#563     // updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
  #562 = Utf8               updatePlayerData
  #563 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #564 = Methodref          #46.#565      // ext/mods/gameserver/model/actor/Player.store:()V
  #565 = NameAndType        #566:#6       // store:()V
  #566 = Utf8               store
  #567 = InvokeDynamic      #18:#55       // #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #568 = Class              #569          // ext/mods/gameserver/model/actor/Npc
  #569 = Utf8               ext/mods/gameserver/model/actor/Npc
  #570 = Methodref          #568.#558     // ext/mods/gameserver/model/actor/Npc.setName:(Ljava/lang/String;)V
  #571 = Class              #572          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #572 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
  #573 = Methodref          #571.#574     // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #574 = NameAndType        #5:#575       // "<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #575 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #576 = Methodref          #568.#577     // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #577 = NameAndType        #578:#161     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #578 = Utf8               broadcastPacket
  #579 = Methodref          #568.#52      // ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
  #580 = String             #581          // Usage: //set name <name>
  #581 = Utf8               Usage: //set name <name>
  #582 = Methodref          #46.#583      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #583 = NameAndType        #584:#29      // isNoble:()Z
  #584 = Utf8               isNoble
  #585 = Methodref          #46.#586      // ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
  #586 = NameAndType        #587:#588     // setNoble:(ZZ)V
  #587 = Utf8               setNoble
  #588 = Utf8               (ZZ)V
  #589 = InvokeDynamic      #19:#55       // #19:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #590 = String             #591          // Usage: //set rec <number>
  #591 = Utf8               Usage: //set rec <number>
  #592 = Methodref          #46.#593      // ext/mods/gameserver/model/actor/Player.setRecomHave:(I)V
  #593 = NameAndType        #594:#66      // setRecomHave:(I)V
  #594 = Utf8               setRecomHave
  #595 = InvokeDynamic      #20:#299      // #20:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #596 = Class              #597          // ext/mods/gameserver/enums/actors/Sex
  #597 = Utf8               ext/mods/gameserver/enums/actors/Sex
  #598 = Methodref          #21.#599      // java/lang/String.toUpperCase:()Ljava/lang/String;
  #599 = NameAndType        #600:#17      // toUpperCase:()Ljava/lang/String;
  #600 = Utf8               toUpperCase
  #601 = Methodref          #602.#603     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #602 = Class              #604          // java/lang/Enum
  #603 = NameAndType        #112:#605     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #604 = Utf8               java/lang/Enum
  #605 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #606 = Methodref          #455.#607     // ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #607 = NameAndType        #608:#609     // getSex:()Lext/mods/gameserver/enums/actors/Sex;
  #608 = Utf8               getSex
  #609 = Utf8               ()Lext/mods/gameserver/enums/actors/Sex;
  #610 = Methodref          #596.#122     // ext/mods/gameserver/enums/actors/Sex.toString:()Ljava/lang/String;
  #611 = InvokeDynamic      #21:#402      // #21:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #612 = InvokeDynamic      #22:#613      // #22:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #613 = NameAndType        #426:#614     // run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #614 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #615 = String             #616          // Usage: //set sex <sex>
  #616 = Utf8               Usage: //set sex <sex>
  #617 = Methodref          #103.#618     // ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
  #618 = NameAndType        #619:#107     // getSp:()I
  #619 = Utf8               getSp
  #620 = InvokeDynamic      #23:#299      // #23:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #621 = String             #622          // Usage: //set sp <number>
  #622 = Utf8               Usage: //set sp <number>
  #623 = Methodref          #455.#624     // ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
  #624 = NameAndType        #625:#66      // setTitleColor:(I)V
  #625 = Utf8               setTitleColor
  #626 = Methodref          #46.#627      // ext/mods/gameserver/model/actor/Player.setTitleColor:(I)I
  #627 = NameAndType        #625:#461     // setTitleColor:(I)I
  #628 = InvokeDynamic      #24:#55       // #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #629 = String             #630          // Usage: //set tcolor <number>
  #630 = Utf8               Usage: //set tcolor <number>
  #631 = String             #632          //
  #632 = Utf8
  #633 = Methodref          #46.#634      // ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
  #634 = NameAndType        #635:#61      // setTitle:(Ljava/lang/String;)V
  #635 = Utf8               setTitle
  #636 = Methodref          #46.#637      // ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
  #637 = NameAndType        #638:#6       // broadcastTitleInfo:()V
  #638 = Utf8               broadcastTitleInfo
  #639 = Methodref          #46.#640      // ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
  #640 = NameAndType        #641:#17      // getTitle:()Ljava/lang/String;
  #641 = Utf8               getTitle
  #642 = InvokeDynamic      #25:#55       // #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #643 = Methodref          #568.#634     // ext/mods/gameserver/model/actor/Npc.setTitle:(Ljava/lang/String;)V
  #644 = Methodref          #568.#640     // ext/mods/gameserver/model/actor/Npc.getTitle:()Ljava/lang/String;
  #645 = String             #646          // Usage: //set title <title>
  #646 = Utf8               Usage: //set title <title>
  #647 = String             #648          // Usage: //set access|class|color|exp|karma
  #648 = Utf8               Usage: //set access|class|color|exp|karma
  #649 = String             #650          // Usage: //set level|name|rec|sex|sp|tcolor|title
  #650 = Utf8               Usage: //set level|name|rec|sex|sp|tcolor|title
  #651 = Fieldref           #31.#652      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.ADMIN_COMMANDS:[Ljava/lang/String;
  #652 = NameAndType        #653:#654     // ADMIN_COMMANDS:[Ljava/lang/String;
  #653 = Utf8               ADMIN_COMMANDS
  #654 = Utf8               [Ljava/lang/String;
  #655 = Methodref          #46.#656      // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #656 = NameAndType        #657:#420     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #657 = Utf8               setTarget
  #658 = String             #659          // html/admin/charinfo.htm
  #659 = Utf8               html/admin/charinfo.htm
  #660 = String             #661          // %objid%
  #661 = Utf8               %objid%
  #662 = Methodref          #46.#663      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #663 = NameAndType        #664:#107     // getObjectId:()I
  #664 = Utf8               getObjectId
  #665 = Methodref          #137.#666     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #666 = NameAndType        #154:#667     // replace:(Ljava/lang/String;I)V
  #667 = Utf8               (Ljava/lang/String;I)V
  #668 = String             #669          // %clan%
  #669 = Utf8               %clan%
  #670 = Methodref          #671.#52      // ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
  #671 = Class              #672          // ext/mods/gameserver/model/pledge/Clan
  #672 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #673 = InvokeDynamic      #26:#402      // #26:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #674 = String             #675          // N/A
  #675 = Utf8               N/A
  #676 = InterfaceMethodref #74.#677      // java/util/List.size:()I
  #677 = NameAndType        #678:#107     // size:()I
  #678 = Utf8               size
  #679 = InvokeDynamic      #27:#299      // #27:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #680 = String             #681          // %baseclass%
  #681 = Utf8               %baseclass%
  #682 = Methodref          #683.#684     // ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #683 = Class              #685          // ext/mods/gameserver/data/xml/PlayerData
  #684 = NameAndType        #233:#686     // getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
  #685 = Utf8               ext/mods/gameserver/data/xml/PlayerData
  #686 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerData;
  #687 = Methodref          #46.#688      // ext/mods/gameserver/model/actor/Player.getBaseClass:()I
  #688 = NameAndType        #689:#107     // getBaseClass:()I
  #689 = Utf8               getBaseClass
  #690 = Methodref          #683.#691     // ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
  #691 = NameAndType        #692:#693     // getClassNameById:(I)Ljava/lang/String;
  #692 = Utf8               getClassNameById
  #693 = Utf8               (I)Ljava/lang/String;
  #694 = String             #695          // %xp%
  #695 = Utf8               %xp%
  #696 = Methodref          #137.#697     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
  #697 = NameAndType        #154:#698     // replace:(Ljava/lang/String;J)V
  #698 = Utf8               (Ljava/lang/String;J)V
  #699 = String             #700          // %curai%
  #700 = Utf8               %curai%
  #701 = Methodref          #46.#702      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #702 = NameAndType        #703:#704     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #703 = Utf8               getAI
  #704 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #705 = Methodref          #706.#707     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #706 = Class              #708          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #707 = NameAndType        #709:#710     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #708 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #709 = Utf8               getCurrentIntention
  #710 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #711 = Methodref          #712.#713     // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
  #712 = Class              #714          // ext/mods/gameserver/model/actor/ai/Intention
  #713 = NameAndType        #715:#716     // getType:()Lext/mods/gameserver/enums/IntentionType;
  #714 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #715 = Utf8               getType
  #716 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
  #717 = Methodref          #718.#122     // ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
  #718 = Class              #719          // ext/mods/gameserver/enums/IntentionType
  #719 = Utf8               ext/mods/gameserver/enums/IntentionType
  #720 = String             #721          // %nextai%
  #721 = Utf8               %nextai%
  #722 = Methodref          #706.#723     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #723 = NameAndType        #724:#710     // getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #724 = Utf8               getNextIntention
  #725 = String             #726          // %loc%
  #726 = Utf8               %loc%
  #727 = Methodref          #46.#728      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #728 = NameAndType        #729:#730     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #729 = Utf8               getPosition
  #730 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #731 = Methodref          #732.#122     // ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
  #732 = Class              #733          // ext/mods/gameserver/model/location/SpawnLocation
  #733 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #734 = String             #735          // %account%
  #735 = Utf8               %account%
  #736 = Methodref          #46.#737      // ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
  #737 = NameAndType        #738:#17      // getAccountName:()Ljava/lang/String;
  #738 = Utf8               getAccountName
  #739 = String             #740          // %ip%
  #740 = Utf8               %ip%
  #741 = Methodref          #46.#742      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #742 = NameAndType        #743:#744     // getClient:()Lext/mods/gameserver/network/GameClient;
  #743 = Utf8               getClient
  #744 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #745 = Methodref          #746.#747     // ext/mods/gameserver/network/GameClient.isDetached:()Z
  #746 = Class              #748          // ext/mods/gameserver/network/GameClient
  #747 = NameAndType        #749:#29      // isDetached:()Z
  #748 = Utf8               ext/mods/gameserver/network/GameClient
  #749 = Utf8               isDetached
  #750 = String             #751          // Offline trader
  #751 = Utf8               Offline trader
  #752 = Fieldref           #753.#754     // ext/mods/Config.PROXY:Z
  #753 = Class              #755          // ext/mods/Config
  #754 = NameAndType        #756:#757     // PROXY:Z
  #755 = Utf8               ext/mods/Config
  #756 = Utf8               PROXY
  #757 = Utf8               Z
  #758 = Methodref          #746.#759     // ext/mods/gameserver/network/GameClient.getRealIpAddress:()Ljava/lang/String;
  #759 = NameAndType        #760:#17      // getRealIpAddress:()Ljava/lang/String;
  #760 = Utf8               getRealIpAddress
  #761 = Methodref          #746.#762     // ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #762 = NameAndType        #323:#763     // getConnection:()Lext/mods/commons/mmocore/MMOConnection;
  #763 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #764 = Methodref          #765.#766     // ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
  #765 = Class              #767          // ext/mods/commons/mmocore/MMOConnection
  #766 = NameAndType        #768:#769     // getInetAddress:()Ljava/net/InetAddress;
  #767 = Utf8               ext/mods/commons/mmocore/MMOConnection
  #768 = Utf8               getInetAddress
  #769 = Utf8               ()Ljava/net/InetAddress;
  #770 = Methodref          #771.#772     // java/net/InetAddress.getHostAddress:()Ljava/lang/String;
  #771 = Class              #773          // java/net/InetAddress
  #772 = NameAndType        #774:#17      // getHostAddress:()Ljava/lang/String;
  #773 = Utf8               java/net/InetAddress
  #774 = Utf8               getHostAddress
  #775 = Methodref          #31.#776      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
  #776 = NameAndType        #41:#777      // gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
  #777 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
  #778 = Methodref          #455.#779     // ext/mods/gameserver/model/actor/container/player/Appearance.setSex:(Lext/mods/gameserver/enums/actors/Sex;)V
  #779 = NameAndType        #780:#781     // setSex:(Lext/mods/gameserver/enums/actors/Sex;)V
  #780 = Utf8               setSex
  #781 = Utf8               (Lext/mods/gameserver/enums/actors/Sex;)V
  #782 = Methodref          #46.#783      // ext/mods/gameserver/model/actor/Player.spawnMe:()V
  #783 = NameAndType        #784:#6       // spawnMe:()V
  #784 = Utf8               spawnMe
  #785 = Methodref          #46.#786      // ext/mods/gameserver/model/actor/Player.stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #786 = NameAndType        #787:#416     // stopAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
  #787 = Utf8               stopAbnormalEffect
  #788 = Fieldref           #789.#790     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #789 = Class              #791          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #790 = NameAndType        #792:#793     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #791 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #792 = Utf8               STATIC_PACKET
  #793 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #794 = InvokeDynamic      #28:#402      // #28:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #795 = Methodref          #121.#796     // ext/mods/gameserver/enums/actors/ClassId.getId:()I
  #796 = NameAndType        #797:#107     // getId:()I
  #797 = Utf8               getId
  #798 = Methodref          #46.#799      // ext/mods/gameserver/model/actor/Player.setClassId:(I)V
  #799 = NameAndType        #800:#66      // setClassId:(I)V
  #800 = Utf8               setClassId
  #801 = Methodref          #46.#802      // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
  #802 = NameAndType        #803:#29      // isSubClassActive:()Z
  #803 = Utf8               isSubClassActive
  #804 = Methodref          #46.#805      // ext/mods/gameserver/model/actor/Player.setBaseClass:(Lext/mods/gameserver/enums/actors/ClassId;)V
  #805 = NameAndType        #806:#807     // setBaseClass:(Lext/mods/gameserver/enums/actors/ClassId;)V
  #806 = Utf8               setBaseClass
  #807 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)V
  #808 = Methodref          #46.#809      // ext/mods/gameserver/model/actor/Player.refreshWeightPenalty:()V
  #809 = NameAndType        #810:#6       // refreshWeightPenalty:()V
  #810 = Utf8               refreshWeightPenalty
  #811 = Methodref          #46.#812      // ext/mods/gameserver/model/actor/Player.refreshHennaList:()V
  #812 = NameAndType        #813:#6       // refreshHennaList:()V
  #813 = Utf8               refreshHennaList
  #814 = InvokeDynamic      #29:#402      // #29:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #815 = Class              #816          // ext/mods/gameserver/handler/IAdminCommandHandler
  #816 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #817 = Utf8               Code
  #818 = Utf8               LineNumberTable
  #819 = Utf8               LocalVariableTable
  #820 = Utf8               this
  #821 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminEditChar;
  #822 = Utf8               useAdminCommand
  #823 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #824 = Utf8               targetPlayer
  #825 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #826 = Utf8               member
  #827 = Utf8               party
  #828 = Utf8               Lext/mods/gameserver/model/group/Party;
  #829 = Utf8               sb
  #830 = Utf8               Ljava/lang/StringBuilder;
  #831 = Utf8               html
  #832 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #833 = Utf8               param
  #834 = Utf8               Ljava/lang/String;
  #835 = Utf8               clan
  #836 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #837 = Utf8               lvl
  #838 = Utf8               I
  #839 = Utf8               count
  #840 = Utf8               ps
  #841 = Utf8               Ljava/sql/PreparedStatement;
  #842 = Utf8               con
  #843 = Utf8               Ljava/sql/Connection;
  #844 = Utf8               e
  #845 = Utf8               Ljava/lang/Exception;
  #846 = Utf8               worldPlayer
  #847 = Utf8               paramCount
  #848 = Utf8               newPvp
  #849 = Utf8               newPk
  #850 = Utf8               newClassId
  #851 = Utf8               newClass
  #852 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #853 = Utf8               colorName
  #854 = Utf8               newExp
  #855 = Utf8               J
  #856 = Utf8               currentExp
  #857 = Utf8               newKarma
  #858 = Utf8               newLevel
  #859 = Utf8               pl
  #860 = Utf8               Lext/mods/gameserver/model/records/PlayerLevel;
  #861 = Utf8               pXp
  #862 = Utf8               tXp
  #863 = Utf8               tempName
  #864 = Utf8               targetNpc
  #865 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #866 = Utf8               newName
  #867 = Utf8               newRec
  #868 = Utf8               Lext/mods/gameserver/enums/actors/Sex;
  #869 = Utf8               newSp
  #870 = Utf8               currentSp
  #871 = Utf8               colorTitle
  #872 = Utf8               newTitle
  #873 = Utf8               targetWorldObject
  #874 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #875 = Utf8               command
  #876 = Utf8               player
  #877 = Utf8               st
  #878 = Utf8               Ljava/util/StringTokenizer;
  #879 = Utf8               StackMapTable
  #880 = Utf8               getAdminCommandList
  #881 = Utf8               ()[Ljava/lang/String;
  #882 = Utf8               lambda$useAdminCommand$1
  #883 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)V
  #884 = Utf8               lambda$useAdminCommand$0
  #885 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)V
  #886 = Utf8               <clinit>
  #887 = Utf8               SourceFile
  #888 = Utf8               AdminEditChar.java
  #889 = Utf8               BootstrapMethods
  #890 = String             #891          // \u0001 isn\'t in a party.
  #891 = Utf8               \u0001 isn\'t in a party.
  #892 = String             #893          // Clan penalty is successfully removed for \u0001.
  #893 = Utf8               Clan penalty is successfully removed for \u0001.
  #894 = String             #895          // \u0001\'s Death Penalty has been lifted.
  #895 = Utf8               \u0001\'s Death Penalty has been lifted.
  #896 = String             #897          // \u0001\'s skills reuse timers are now cleaned.
  #897 = Utf8               \u0001\'s skills reuse timers are now cleaned.
  #898 = String             #899          // \u0001\'s access level is now set to \u0001.
  #899 = Utf8               \u0001\'s access level is now set to \u0001.
  #900 = String             #901          // \u0001couldn\'t be found - its access level is unaltered.
  #901 = Utf8               \u0001couldn\'t be found - its access level is unaltered.
  #902 = String             #903          // You successfully set \u0001\'s pvp to \u0001.
  #903 = Utf8               You successfully set \u0001\'s pvp to \u0001.
  #904 = String             #905          // You successfully set \u0001\'s pk to \u0001.
  #905 = Utf8               You successfully set \u0001\'s pk to \u0001.
  #906 = String             #907          // You tried to set an invalid class for \u0001.
  #907 = Utf8               You tried to set an invalid class for \u0001.
  #908 = String             #909          // \u0001 is already a(n) \u0001.
  #909 = Utf8               \u0001 is already a(n) \u0001.
  #910 = MethodType         #6            //  ()V
  #911 = MethodHandle       6:#912        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)V
  #912 = Methodref          #31.#913      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)V
  #913 = NameAndType        #884:#885     // lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)V
  #914 = String             #915          // 0x\u0001
  #915 = Utf8               0x\u0001
  #916 = String             #917          // You successfully set color name of \u0001.
  #917 = Utf8               You successfully set color name of \u0001.
  #918 = String             #919          // You successfully set \u0001\'s XP to \u0001.
  #919 = Utf8               You successfully set \u0001\'s XP to \u0001.
  #920 = String             #921          // You successfully set \u0001\'s karma to \u0001.
  #921 = Utf8               You successfully set \u0001\'s karma to \u0001.
  #922 = String             #923          // You successfully set \u0001\'s level to \u0001.
  #923 = Utf8               You successfully set \u0001\'s level to \u0001.
  #924 = String             #925          // \u0001_temp
  #925 = Utf8               \u0001_temp
  #926 = String             #927          // You successfully set your target\'s name to \u0001.
  #927 = Utf8               You successfully set your target\'s name to \u0001.
  #928 = String             #929          // You have modified \u0001\'s noble status.
  #929 = Utf8               You have modified \u0001\'s noble status.
  #930 = String             #931          // You successfully set \u0001 to \u0001.
  #931 = Utf8               You successfully set \u0001 to \u0001.
  #932 = String             #933          // \u0001\'s sex is already defined as \u0001.
  #933 = Utf8               \u0001\'s sex is already defined as \u0001.
  #934 = MethodHandle       6:#935        // REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)V
  #935 = Methodref          #31.#936      // ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)V
  #936 = NameAndType        #882:#883     // lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)V
  #937 = String             #938          // You successfully set \u0001\'s SP to \u0001.
  #938 = Utf8               You successfully set \u0001\'s SP to \u0001.
  #939 = String             #940          // You successfully set title color name of \u0001.
  #940 = Utf8               You successfully set title color name of \u0001.
  #941 = String             #942          // You successfully set your target\'s title to \u0001.
  #942 = Utf8               You successfully set your target\'s title to \u0001.
  #943 = String             #944          // <a action=\"bypass -h admin_pledge info \u0001\">\u0001</a>
  #944 = Utf8               <a action=\"bypass -h admin_pledge info \u0001\">\u0001</a>
  #945 = String             #946          // <a action=\"bypass -h admin_party_info \u0001\">\u0001 members</a>
  #946 = Utf8               <a action=\"bypass -h admin_party_info \u0001\">\u0001 members</a>
  #947 = String             #948          // You successfully set \u0001 gender to \u0001.
  #948 = Utf8               You successfully set \u0001 gender to \u0001.
  #949 = String             #950          // You successfully set \u0001 class to \u0001.
  #950 = Utf8               You successfully set \u0001 class to \u0001.
  #951 = MethodHandle       6:#952        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #952 = Methodref          #953.#954     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #953 = Class              #955          // java/lang/invoke/StringConcatFactory
  #954 = NameAndType        #56:#956      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #955 = Utf8               java/lang/invoke/StringConcatFactory
  #956 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #957 = MethodHandle       6:#958        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #958 = Methodref          #959.#960     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #959 = Class              #961          // java/lang/invoke/LambdaMetafactory
  #960 = NameAndType        #962:#963     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #961 = Utf8               java/lang/invoke/LambdaMetafactory
  #962 = Utf8               metafactory
  #963 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #964 = MethodHandle       6:#965        // REF_invokeStatic java/lang/runtime/SwitchBootstraps.typeSwitch:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #965 = Methodref          #966.#967     // java/lang/runtime/SwitchBootstraps.typeSwitch:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #966 = Class              #968          // java/lang/runtime/SwitchBootstraps
  #967 = NameAndType        #525:#969     // typeSwitch:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #968 = Utf8               java/lang/runtime/SwitchBootstraps
  #969 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #970 = Utf8               InnerClasses
  #971 = Class              #972          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #972 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #973 = Utf8               NpcInfo
  #974 = Class              #975          // java/lang/invoke/MethodHandles$Lookup
  #975 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #976 = Class              #977          // java/lang/invoke/MethodHandles
  #977 = Utf8               java/lang/invoke/MethodHandles
  #978 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminEditChar();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEditChar;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=15, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore_3
        11: aload_3
        12: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        15: pop
        16: aload_1
        17: ldc           #18                 // String admin_debug
        19: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        22: ifeq          62
        25: aload_3
        26: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        29: ifeq          45
        32: aload_0
        33: aload_2
        34: aload_3
        35: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        38: iconst_1
        39: invokevirtual #30                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
        42: goto          51
        45: aload_0
        46: aload_2
        47: iconst_1
        48: invokevirtual #36                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        51: astore        4
        53: aload_2
        54: aload         4
        56: invokestatic  #39                 // Method gatherPlayerInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
        59: goto          3442
        62: aload_1
        63: ldc           #43                 // String admin_party_info
        65: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
        68: ifeq          400
        71: aload_3
        72: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        75: ifeq          91
        78: aload_0
        79: aload_2
        80: aload_3
        81: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        84: iconst_1
        85: invokevirtual #30                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Z)Lext/mods/gameserver/model/actor/Player;
        88: goto          97
        91: aload_0
        92: aload_2
        93: iconst_1
        94: invokevirtual #36                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
        97: astore        4
        99: aload         4
       101: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       104: astore        5
       106: aload         5
       108: ifnonnull     126
       111: aload_2
       112: aload         4
       114: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       117: invokedynamic #54,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       122: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       125: return
       126: new           #62                 // class java/lang/StringBuilder
       129: dup
       130: sipush        400
       133: invokespecial #64                 // Method java/lang/StringBuilder."<init>":(I)V
       136: astore        6
       138: aload         5
       140: invokevirtual #67                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       143: invokeinterface #73,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       148: astore        7
       150: aload         7
       152: invokeinterface #79,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       157: ifeq          346
       160: aload         7
       162: invokeinterface #84,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       167: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
       170: astore        8
       172: aload         5
       174: aload         8
       176: invokevirtual #88                 // Method ext/mods/gameserver/model/group/Party.isLeader:(Lext/mods/gameserver/model/actor/Player;)Z
       179: ifne          264
       182: aload         6
       184: bipush        9
       186: anewarray     #2                  // class java/lang/Object
       189: dup
       190: iconst_0
       191: ldc           #92                 // String <tr><td width=150><a action=\"bypass -h admin_debug
       193: aastore
       194: dup
       195: iconst_1
       196: aload         8
       198: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       201: aastore
       202: dup
       203: iconst_2
       204: ldc           #94                 // String \">
       206: aastore
       207: dup
       208: iconst_3
       209: aload         8
       211: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       214: aastore
       215: dup
       216: iconst_4
       217: ldc           #96                 // String  (
       219: aastore
       220: dup
       221: iconst_5
       222: aload         8
       224: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       227: invokevirtual #102                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       230: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       233: aastore
       234: dup
       235: bipush        6
       237: ldc           #114                // String )</a></td><td width=120 align=right>
       239: aastore
       240: dup
       241: bipush        7
       243: aload         8
       245: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       248: invokevirtual #120                // Method ext/mods/gameserver/enums/actors/ClassId.toString:()Ljava/lang/String;
       251: aastore
       252: dup
       253: bipush        8
       255: ldc           #125                // String </td></tr>
       257: aastore
       258: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       261: goto          343
       264: aload         6
       266: bipush        9
       268: anewarray     #2                  // class java/lang/Object
       271: dup
       272: iconst_0
       273: ldc           #92                 // String <tr><td width=150><a action=\"bypass -h admin_debug
       275: aastore
       276: dup
       277: iconst_1
       278: aload         8
       280: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       283: aastore
       284: dup
       285: iconst_2
       286: ldc           #133                // String \"><font color=\"LEVEL\">
       288: aastore
       289: dup
       290: iconst_3
       291: aload         8
       293: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       296: aastore
       297: dup
       298: iconst_4
       299: ldc           #96                 // String  (
       301: aastore
       302: dup
       303: iconst_5
       304: aload         8
       306: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       309: invokevirtual #102                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       312: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       315: aastore
       316: dup
       317: bipush        6
       319: ldc           #135                // String )</font></a></td><td width=120 align=right>
       321: aastore
       322: dup
       323: bipush        7
       325: aload         8
       327: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       330: invokevirtual #120                // Method ext/mods/gameserver/enums/actors/ClassId.toString:()Ljava/lang/String;
       333: aastore
       334: dup
       335: bipush        8
       337: ldc           #125                // String </td></tr>
       339: aastore
       340: invokestatic  #127                // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       343: goto          150
       346: new           #137                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       349: dup
       350: iconst_0
       351: invokespecial #139                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       354: astore        7
       356: aload         7
       358: aload_2
       359: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       362: ldc           #144                // String html/admin/partyinfo.htm
       364: invokevirtual #146                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       367: aload         7
       369: ldc           #150                // String %name%
       371: aload         4
       373: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       376: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       379: aload         7
       381: ldc           #155                // String %party%
       383: aload         6
       385: invokevirtual #157                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       388: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       391: aload_2
       392: aload         7
       394: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       397: goto          3442
       400: aload_1
       401: ldc           #162                // String admin_remove
       403: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       406: ifeq          712
       409: aload_3
       410: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       413: ifne          423
       416: aload_2
       417: ldc           #164                // String Usage: //remove <clan_penalty|death_penalty|skill_reuse>
       419: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       422: return
       423: aload_0
       424: aload_2
       425: iconst_1
       426: invokevirtual #36                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       429: astore        4
       431: aload_3
       432: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       435: astore        5
       437: iconst_m1
       438: istore        6
       440: aload         5
       442: invokevirtual #166                // Method java/lang/String.hashCode:()I
       445: lookupswitch  { // 3

             -1707961594: 512

              -270549570: 496

              1934150560: 480
                 default: 525
            }
       480: aload         5
       482: ldc           #169                // String clan_penalty
       484: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       487: ifeq          525
       490: iconst_0
       491: istore        6
       493: goto          525
       496: aload         5
       498: ldc           #175                // String death_penalty
       500: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       503: ifeq          525
       506: iconst_1
       507: istore        6
       509: goto          525
       512: aload         5
       514: ldc           #177                // String skill_reuse
       516: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       519: ifeq          525
       522: iconst_2
       523: istore        6
       525: iload         6
       527: tableswitch   { // 0 to 2

                       0: 552

                       1: 624

                       2: 652
                 default: 703
            }
       552: aload_3
       553: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       556: ifne          566
       559: aload_2
       560: ldc           #179                // String Usage: //remove clan_penalty join|create
       562: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       565: return
       566: aload_3
       567: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       570: astore        7
       572: aload         7
       574: ldc           #181                // String create
       576: invokevirtual #183                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       579: ifeq          591
       582: aload         4
       584: lconst_0
       585: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.setClanCreateExpiryTime:(J)V
       588: goto          607
       591: aload         7
       593: ldc           #191                // String join
       595: invokevirtual #183                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       598: ifeq          607
       601: aload         4
       603: lconst_0
       604: invokevirtual #193                // Method ext/mods/gameserver/model/actor/Player.setClanJoinExpiryTime:(J)V
       607: aload_2
       608: aload         4
       610: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       613: invokedynamic #196,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       618: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       621: goto          709
       624: aload         4
       626: invokevirtual #197                // Method ext/mods/gameserver/model/actor/Player.removeDeathPenaltyBuffLevel:()V
       629: aload         4
       631: aload_2
       632: if_acmpeq     709
       635: aload_2
       636: aload         4
       638: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       641: invokedynamic #200,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       646: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       649: goto          709
       652: aload         4
       654: invokevirtual #201                // Method ext/mods/gameserver/model/actor/Player.getReuseTimeStamp:()Ljava/util/Map;
       657: invokeinterface #205,  1          // InterfaceMethod java/util/Map.clear:()V
       662: aload         4
       664: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.getDisabledSkills:()Ljava/util/Map;
       667: invokeinterface #205,  1          // InterfaceMethod java/util/Map.clear:()V
       672: aload         4
       674: new           #213                // class ext/mods/gameserver/network/serverpackets/SkillCoolTime
       677: dup
       678: aload         4
       680: invokespecial #215                // Method ext/mods/gameserver/network/serverpackets/SkillCoolTime."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       683: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       686: aload_2
       687: aload         4
       689: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       692: invokedynamic #218,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       697: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       700: goto          709
       703: aload_2
       704: ldc           #164                // String Usage: //remove <clan_penalty|death_penalty|skill_reuse>
       706: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       709: goto          3442
       712: aload_1
       713: ldc           #219                // String admin_reset
       715: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       718: ifeq          844
       721: aload_3
       722: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       725: ifne          735
       728: aload_2
       729: ldc           #221                // String Usage: //reset <clan_graduate>
       731: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       734: return
       735: aload_0
       736: aload_2
       737: iconst_1
       738: invokevirtual #36                 // Method getTargetPlayer:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/actor/Player;
       741: astore        4
       743: aload_3
       744: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       747: astore        5
       749: iconst_m1
       750: istore        6
       752: aload         5
       754: invokevirtual #166                // Method java/lang/String.hashCode:()I
       757: lookupswitch  { // 1

              -392811244: 776
                 default: 789
            }
       776: aload         5
       778: ldc           #223                // String clan_graduate
       780: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       783: ifeq          789
       786: iconst_0
       787: istore        6
       789: iload         6
       791: lookupswitch  { // 1

                       0: 808
                 default: 835
            }
       808: aload         4
       810: invokevirtual #225                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       813: astore        7
       815: aload         7
       817: ifnull        841
       820: invokestatic  #229                // Method ext/mods/gameserver/data/sql/ClanTable.getInstance:()Lext/mods/gameserver/data/sql/ClanTable;
       823: invokevirtual #235                // Method ext/mods/gameserver/data/sql/ClanTable.clearGraduates:()V
       826: aload_2
       827: ldc           #238                // String All Clan graduates were cleaned.
       829: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       832: goto          841
       835: aload_2
       836: ldc           #221                // String Usage: //reset <clan_graduate>
       838: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       841: goto          3442
       844: aload_1
       845: ldc           #240                // String admin_set
       847: invokevirtual #20                 // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
       850: ifeq          3442
       853: aload_3
       854: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       857: ifne          879
       860: aload_2
       861: ldc           #242                // String Usage: //set <access|class|color|exp|karma|level>
       863: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       866: aload_2
       867: ldc           #244                // String Usage: //set <name|noble|rec|sex|sp|tcolor|title>
       869: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       872: aload_2
       873: ldc           #246                // String Usage: //set <pvp|pk>
       875: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       878: return
       879: aload_0
       880: ldc           #248                // class ext/mods/gameserver/model/WorldObject
       882: aload_2
       883: iconst_1
       884: invokevirtual #250                // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
       887: astore        4
       889: aload_3
       890: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       893: astore        5
       895: iconst_m1
       896: istore        6
       898: aload         5
       900: invokevirtual #166                // Method java/lang/String.hashCode:()I
       903: lookupswitch  { // 15

             -1423461020: 1032

              -879143057: 1259

                    3579: 1065

                    3677: 1241

                  100893: 1116

                  111402: 1048

                  112784: 1205

                  113766: 1223

                 3373707: 1169

                94742904: 1082

                94842723: 1099

               101819504: 1133

               102865796: 1151

               104991738: 1187

               110371416: 1277
                 default: 1292
            }
      1032: aload         5
      1034: ldc           #254                // String access
      1036: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1039: ifeq          1292
      1042: iconst_0
      1043: istore        6
      1045: goto          1292
      1048: aload         5
      1050: ldc_w         #256                // String pvp
      1053: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1056: ifeq          1292
      1059: iconst_1
      1060: istore        6
      1062: goto          1292
      1065: aload         5
      1067: ldc_w         #258                // String pk
      1070: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1073: ifeq          1292
      1076: iconst_2
      1077: istore        6
      1079: goto          1292
      1082: aload         5
      1084: ldc_w         #260                // String class
      1087: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1090: ifeq          1292
      1093: iconst_3
      1094: istore        6
      1096: goto          1292
      1099: aload         5
      1101: ldc_w         #262                // String color
      1104: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1107: ifeq          1292
      1110: iconst_4
      1111: istore        6
      1113: goto          1292
      1116: aload         5
      1118: ldc_w         #264                // String exp
      1121: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1124: ifeq          1292
      1127: iconst_5
      1128: istore        6
      1130: goto          1292
      1133: aload         5
      1135: ldc_w         #266                // String karma
      1138: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1141: ifeq          1292
      1144: bipush        6
      1146: istore        6
      1148: goto          1292
      1151: aload         5
      1153: ldc_w         #268                // String level
      1156: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1159: ifeq          1292
      1162: bipush        7
      1164: istore        6
      1166: goto          1292
      1169: aload         5
      1171: ldc_w         #270                // String name
      1174: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1177: ifeq          1292
      1180: bipush        8
      1182: istore        6
      1184: goto          1292
      1187: aload         5
      1189: ldc_w         #272                // String noble
      1192: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1195: ifeq          1292
      1198: bipush        9
      1200: istore        6
      1202: goto          1292
      1205: aload         5
      1207: ldc_w         #274                // String rec
      1210: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1213: ifeq          1292
      1216: bipush        10
      1218: istore        6
      1220: goto          1292
      1223: aload         5
      1225: ldc_w         #276                // String sex
      1228: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1231: ifeq          1292
      1234: bipush        11
      1236: istore        6
      1238: goto          1292
      1241: aload         5
      1243: ldc_w         #278                // String sp
      1246: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1249: ifeq          1292
      1252: bipush        12
      1254: istore        6
      1256: goto          1292
      1259: aload         5
      1261: ldc_w         #280                // String tcolor
      1264: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1267: ifeq          1292
      1270: bipush        13
      1272: istore        6
      1274: goto          1292
      1277: aload         5
      1279: ldc_w         #282                // String title
      1282: invokevirtual #171                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      1285: ifeq          1292
      1288: bipush        14
      1290: istore        6
      1292: iload         6
      1294: tableswitch   { // 0 to 14

                       0: 1368

                       1: 1729

                       2: 1822

                       3: 1915

                       4: 2079

                       5: 2167

                       6: 2282

                       7: 2361

                       8: 2501

                       9: 2792

                      10: 2859

                      11: 2930

                      12: 3058

                      13: 3171

                      14: 3259
                 default: 3428
            }
      1368: aload_3
      1369: invokevirtual #284                // Method java/util/StringTokenizer.countTokens:()I
      1372: istore        7
      1374: iload         7
      1376: iconst_1
      1377: if_icmpne     1451
      1380: aload_3
      1381: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1384: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1387: istore        8
      1389: aload         4
      1391: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      1394: ifeq          1441
      1397: aload         4
      1399: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      1402: astore        9
      1404: aload         9
      1406: iload         8
      1408: invokevirtual #291                // Method ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
      1411: iload         8
      1413: ifge          1422
      1416: aload         9
      1418: iconst_0
      1419: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
      1422: aload_2
      1423: aload         9
      1425: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1428: iload         8
      1430: invokedynamic #298,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      1435: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1438: goto          1448
      1441: aload_2
      1442: getstatic     #301                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1445: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1448: goto          1714
      1451: iload         7
      1453: iconst_2
      1454: if_icmpne     1714
      1457: aload_3
      1458: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1461: astore        8
      1463: aload_3
      1464: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1467: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1470: istore        9
      1472: invokestatic  #310                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
      1475: aload         8
      1477: invokevirtual #315                // Method ext/mods/gameserver/model/World.getPlayer:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/Player;
      1480: astore        10
      1482: aload         10
      1484: ifnull        1524
      1487: aload         10
      1489: iload         9
      1491: invokevirtual #291                // Method ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
      1494: iload         9
      1496: ifge          1505
      1499: aload         10
      1501: iconst_0
      1502: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
      1505: aload_2
      1506: aload         10
      1508: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1511: iload         9
      1513: invokedynamic #298,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      1518: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1521: goto          1714
      1524: invokestatic  #319                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
      1527: astore        11
      1529: aload         11
      1531: ldc_w         #325                // String UPDATE characters SET accesslevel=? WHERE char_name=?
      1534: invokeinterface #327,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
      1539: astore        12
      1541: aload         12
      1543: iconst_1
      1544: iload         9
      1546: invokeinterface #333,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
      1551: aload         12
      1553: iconst_2
      1554: aload         8
      1556: invokeinterface #339,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
      1561: aload         12
      1563: invokeinterface #343,  1          // InterfaceMethod java/sql/PreparedStatement.execute:()Z
      1568: pop
      1569: aload         12
      1571: invokeinterface #346,  1          // InterfaceMethod java/sql/PreparedStatement.getUpdateCount:()I
      1576: istore        13
      1578: iload         13
      1580: ifne          1597
      1583: aload_2
      1584: aload         8
      1586: invokedynamic #349,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1591: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1594: goto          1610
      1597: aload_2
      1598: aload         8
      1600: iload         9
      1602: invokedynamic #298,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      1607: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1610: aload         12
      1612: ifnull        1654
      1615: aload         12
      1617: invokeinterface #350,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1622: goto          1654
      1625: astore        13
      1627: aload         12
      1629: ifnull        1651
      1632: aload         12
      1634: invokeinterface #350,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
      1639: goto          1651
      1642: astore        14
      1644: aload         13
      1646: aload         14
      1648: invokevirtual #355                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1651: aload         13
      1653: athrow
      1654: aload         11
      1656: ifnull        1698
      1659: aload         11
      1661: invokeinterface #359,  1          // InterfaceMethod java/sql/Connection.close:()V
      1666: goto          1698
      1669: astore        12
      1671: aload         11
      1673: ifnull        1695
      1676: aload         11
      1678: invokeinterface #359,  1          // InterfaceMethod java/sql/Connection.close:()V
      1683: goto          1695
      1686: astore        13
      1688: aload         12
      1690: aload         13
      1692: invokevirtual #355                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
      1695: aload         12
      1697: athrow
      1698: goto          1714
      1701: astore        11
      1703: getstatic     #362                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1706: ldc_w         #366                // String Couldn\'t update access.
      1709: aload         11
      1711: invokevirtual #368                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
      1714: goto          3442
      1717: astore        7
      1719: aload_2
      1720: ldc_w         #374                // String Usage: //set access <level> | <name> <level>
      1723: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1726: goto          3442
      1729: aload         4
      1731: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      1734: ifeq          1747
      1737: aload         4
      1739: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      1742: astore        7
      1744: goto          1748
      1747: return
      1748: aload_3
      1749: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1752: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1755: istore        8
      1757: iload         8
      1759: ifge          1770
      1762: aload_2
      1763: ldc_w         #376                // String The pvp value must be greater or equal to 0.
      1766: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1769: return
      1770: aload         7
      1772: iload         8
      1774: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Player.setPvpKills:(I)V
      1777: aload         7
      1779: new           #381                // class ext/mods/gameserver/network/serverpackets/UserInfo
      1782: dup
      1783: aload         7
      1785: invokespecial #383                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1788: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1791: aload_2
      1792: aload         7
      1794: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1797: iload         8
      1799: invokedynamic #384,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      1804: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1807: goto          3442
      1810: astore        7
      1812: aload_2
      1813: ldc_w         #385                // String Usage: //set pvp <number>
      1816: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1819: goto          3442
      1822: aload         4
      1824: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      1827: ifeq          1840
      1830: aload         4
      1832: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      1835: astore        7
      1837: goto          1841
      1840: return
      1841: aload_3
      1842: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1845: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1848: istore        8
      1850: iload         8
      1852: ifge          1863
      1855: aload_2
      1856: ldc_w         #387                // String The pk value must be greater or equal to 0.
      1859: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1862: return
      1863: aload         7
      1865: iload         8
      1867: invokevirtual #389                // Method ext/mods/gameserver/model/actor/Player.setPkKills:(I)V
      1870: aload         7
      1872: new           #381                // class ext/mods/gameserver/network/serverpackets/UserInfo
      1875: dup
      1876: aload         7
      1878: invokespecial #383                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
      1881: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1884: aload_2
      1885: aload         7
      1887: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1890: iload         8
      1892: invokedynamic #392,  0            // InvokeDynamic #7:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      1897: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1900: goto          3442
      1903: astore        7
      1905: aload_2
      1906: ldc_w         #393                // String Usage: //set pk <number>
      1909: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1912: goto          3442
      1915: aload         4
      1917: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      1920: ifeq          1933
      1923: aload         4
      1925: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      1928: astore        7
      1930: goto          1934
      1933: return
      1934: aload_3
      1935: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      1938: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      1941: istore        8
      1943: iload         8
      1945: iflt          1957
      1948: iload         8
      1950: getstatic     #395                // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
      1953: arraylength
      1954: if_icmple     1958
      1957: return
      1958: getstatic     #395                // Field ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
      1961: iload         8
      1963: aaload
      1964: astore        9
      1966: aload         9
      1968: invokevirtual #399                // Method ext/mods/gameserver/enums/actors/ClassId.getLevel:()I
      1971: iconst_m1
      1972: if_icmpne     1990
      1975: aload_2
      1976: aload         7
      1978: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1981: invokedynamic #400,  0            // InvokeDynamic #8:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      1986: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1989: return
      1990: aload         7
      1992: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
      1995: aload         9
      1997: if_acmpne     2020
      2000: aload_2
      2001: aload         7
      2003: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2006: aload         9
      2008: invokevirtual #120                // Method ext/mods/gameserver/enums/actors/ClassId.toString:()Ljava/lang/String;
      2011: invokedynamic #401,  0            // InvokeDynamic #9:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      2016: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2019: return
      2020: aload         7
      2022: iconst_0
      2023: invokevirtual #404                // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
      2026: aload         7
      2028: getstatic     #407                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
      2031: invokevirtual #413                // Method ext/mods/gameserver/model/actor/Player.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
      2034: aload         7
      2036: aload         7
      2038: invokevirtual #417                // Method ext/mods/gameserver/model/actor/Player.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
      2041: aload         7
      2043: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.decayMe:()V
      2046: aload         7
      2048: aload         9
      2050: aload_2
      2051: invokedynamic #424,  0            // InvokeDynamic #10:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
      2056: ldc2_w        #428                // long 4000l
      2059: invokestatic  #430                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
      2062: pop
      2063: goto          3442
      2066: astore        7
      2068: aload_0
      2069: aload_2
      2070: ldc_w         #436                // String charclasses.htm
      2073: invokevirtual #438                // Method sendFile:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
      2076: goto          3442
      2079: aload         4
      2081: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2084: ifeq          2097
      2087: aload         4
      2089: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2092: astore        7
      2094: goto          2098
      2097: return
      2098: aload_3
      2099: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2102: invokedynamic #442,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2107: invokestatic  #443                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      2110: invokevirtual #447                // Method java/lang/Integer.intValue:()I
      2113: istore        8
      2115: aload         7
      2117: invokevirtual #450                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
      2120: iload         8
      2122: invokevirtual #454                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setNameColor:(I)V
      2125: aload         7
      2127: iload         8
      2129: invokevirtual #459                // Method ext/mods/gameserver/model/actor/Player.setNameColor:(I)I
      2132: pop
      2133: aload         7
      2135: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      2138: aload_2
      2139: aload         7
      2141: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2144: invokedynamic #465,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2149: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2152: goto          3442
      2155: astore        7
      2157: aload_2
      2158: ldc_w         #466                // String Usage: //set color <number>
      2161: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2164: goto          3442
      2167: aload         4
      2169: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2172: ifeq          2185
      2175: aload         4
      2177: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2180: astore        7
      2182: goto          2186
      2185: return
      2186: aload_3
      2187: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2190: invokestatic  #468                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
      2193: lstore        8
      2195: aload         7
      2197: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2200: invokevirtual #474                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
      2203: lstore        10
      2205: lload         10
      2207: lload         8
      2209: lcmp
      2210: ifge          2227
      2213: aload         7
      2215: lload         8
      2217: lload         10
      2219: lsub
      2220: iconst_0
      2221: invokevirtual #478                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
      2224: goto          2246
      2227: lload         10
      2229: lload         8
      2231: lcmp
      2232: ifle          2246
      2235: aload         7
      2237: lload         10
      2239: lload         8
      2241: lsub
      2242: iconst_0
      2243: invokevirtual #482                // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
      2246: aload         7
      2248: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      2251: aload_2
      2252: aload         7
      2254: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2257: lload         8
      2259: invokedynamic #485,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;J)Ljava/lang/String;
      2264: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2267: goto          3442
      2270: astore        7
      2272: aload_2
      2273: ldc_w         #488                // String Usage: //set exp <number>
      2276: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2279: goto          3442
      2282: aload         4
      2284: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2287: ifeq          2300
      2290: aload         4
      2292: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2295: astore        7
      2297: goto          2301
      2300: return
      2301: aload_3
      2302: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2305: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      2308: istore        8
      2310: iload         8
      2312: ifge          2323
      2315: aload_2
      2316: ldc_w         #490                // String The karma value must be greater or equal to 0.
      2319: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2322: return
      2323: aload         7
      2325: iload         8
      2327: invokevirtual #492                // Method ext/mods/gameserver/model/actor/Player.setKarma:(I)V
      2330: aload_2
      2331: aload         7
      2333: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2336: iload         8
      2338: invokedynamic #495,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      2343: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2346: goto          3442
      2349: astore        7
      2351: aload_2
      2352: ldc_w         #496                // String Usage: //set karma <number>
      2355: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2358: goto          3442
      2361: aload         4
      2363: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2366: ifeq          2379
      2369: aload         4
      2371: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2374: astore        7
      2376: goto          2380
      2379: return
      2380: aload_3
      2381: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2384: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      2387: istore        8
      2389: invokestatic  #498                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
      2392: iload         8
      2394: invokevirtual #503                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
      2397: astore        9
      2399: aload         9
      2401: ifnonnull     2412
      2404: aload_2
      2405: ldc_w         #507                // String Invalid used level for //set level.
      2408: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2411: return
      2412: aload         7
      2414: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      2417: invokevirtual #474                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
      2420: lstore        10
      2422: aload         9
      2424: invokevirtual #509                // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
      2427: lstore        12
      2429: lload         10
      2431: lload         12
      2433: lcmp
      2434: ifle          2451
      2437: aload         7
      2439: lload         10
      2441: lload         12
      2443: lsub
      2444: iconst_0
      2445: invokevirtual #482                // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
      2448: goto          2470
      2451: lload         10
      2453: lload         12
      2455: lcmp
      2456: ifge          2470
      2459: aload         7
      2461: lload         12
      2463: lload         10
      2465: lsub
      2466: iconst_0
      2467: invokevirtual #478                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
      2470: aload_2
      2471: aload         7
      2473: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2476: iload         8
      2478: invokedynamic #514,  0            // InvokeDynamic #15:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      2483: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2486: goto          3442
      2489: astore        7
      2491: aload_2
      2492: ldc_w         #515                // String Usage: //set level <number>
      2495: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2498: goto          3442
      2501: aload_3
      2502: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2505: astore        7
      2507: aload         4
      2509: dup
      2510: invokestatic  #517                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
      2513: pop
      2514: astore        8
      2516: iconst_0
      2517: istore        9
      2519: aload         8
      2521: iload         9
      2523: invokedynamic #523,  0            // InvokeDynamic #16:typeSwitch:(Lext/mods/gameserver/model/WorldObject;I)I
      2528: lookupswitch  { // 2

                       0: 2556

                       1: 2724
                 default: 2770
            }
      2556: aload         8
      2558: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2561: astore        10
      2563: aload         7
      2565: ldc_w         #527                // String ^[A-Za-z0-9]{1,16}$
      2568: invokestatic  #529                // Method ext/mods/commons/lang/StringUtil.isValidString:(Ljava/lang/String;Ljava/lang/String;)Z
      2571: ifne          2582
      2574: aload_2
      2575: getstatic     #533                // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_NAME_TRY_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
      2578: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2581: return
      2582: invokestatic  #536                // Method ext/mods/gameserver/data/xml/NpcData.getInstance:()Lext/mods/gameserver/data/xml/NpcData;
      2585: aload         7
      2587: invokevirtual #541                // Method ext/mods/gameserver/data/xml/NpcData.getTemplateByName:(Ljava/lang/String;)Lext/mods/gameserver/model/actor/template/NpcTemplate;
      2590: ifnull        2601
      2593: aload_2
      2594: getstatic     #533                // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_NAME_TRY_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
      2597: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2600: return
      2601: invokestatic  #545                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
      2604: aload         7
      2606: invokevirtual #550                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getPlayerObjectId:(Ljava/lang/String;)I
      2609: ifle          2633
      2612: aload         10
      2614: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2617: aload         7
      2619: invokevirtual #553                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2622: ifne          2633
      2625: aload_2
      2626: getstatic     #533                // Field ext/mods/gameserver/network/SystemMessageId.INCORRECT_NAME_TRY_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
      2629: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2632: return
      2633: aload         10
      2635: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2638: aload         7
      2640: invokevirtual #553                // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
      2643: ifeq          2681
      2646: aload         7
      2648: invokedynamic #556,  0            // InvokeDynamic #17:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2653: astore        11
      2655: aload         10
      2657: aload         11
      2659: invokevirtual #557                // Method ext/mods/gameserver/model/actor/Player.setName:(Ljava/lang/String;)V
      2662: invokestatic  #545                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
      2665: aload         10
      2667: iconst_0
      2668: invokevirtual #560                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
      2671: aload         10
      2673: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      2676: aload         10
      2678: invokevirtual #564                // Method ext/mods/gameserver/model/actor/Player.store:()V
      2681: aload         10
      2683: aload         7
      2685: invokevirtual #557                // Method ext/mods/gameserver/model/actor/Player.setName:(Ljava/lang/String;)V
      2688: invokestatic  #545                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.getInstance:()Lext/mods/gameserver/data/sql/PlayerInfoTable;
      2691: aload         10
      2693: iconst_0
      2694: invokevirtual #560                // Method ext/mods/gameserver/data/sql/PlayerInfoTable.updatePlayerData:(Lext/mods/gameserver/model/actor/Player;Z)V
      2697: aload         10
      2699: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      2702: aload         10
      2704: invokevirtual #564                // Method ext/mods/gameserver/model/actor/Player.store:()V
      2707: aload_2
      2708: aload         10
      2710: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2713: invokedynamic #567,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2718: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2721: goto          2777
      2724: aload         8
      2726: checkcast     #568                // class ext/mods/gameserver/model/actor/Npc
      2729: astore        11
      2731: aload         11
      2733: aload         7
      2735: invokevirtual #570                // Method ext/mods/gameserver/model/actor/Npc.setName:(Ljava/lang/String;)V
      2738: aload         11
      2740: new           #571                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
      2743: dup
      2744: aload         11
      2746: aconst_null
      2747: invokespecial #573                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      2750: invokevirtual #576                // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      2753: aload_2
      2754: aload         11
      2756: invokevirtual #579                // Method ext/mods/gameserver/model/actor/Npc.getName:()Ljava/lang/String;
      2759: invokedynamic #567,  0            // InvokeDynamic #18:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2764: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2767: goto          2777
      2770: aload_2
      2771: getstatic     #301                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      2774: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      2777: goto          3442
      2780: astore        7
      2782: aload_2
      2783: ldc_w         #580                // String Usage: //set name <name>
      2786: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2789: goto          3442
      2792: aload         4
      2794: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2797: ifeq          2810
      2800: aload         4
      2802: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2805: astore        7
      2807: goto          2811
      2810: return
      2811: aload         7
      2813: aload         7
      2815: invokevirtual #582                // Method ext/mods/gameserver/model/actor/Player.isNoble:()Z
      2818: ifne          2825
      2821: iconst_1
      2822: goto          2826
      2825: iconst_0
      2826: iconst_1
      2827: invokevirtual #585                // Method ext/mods/gameserver/model/actor/Player.setNoble:(ZZ)V
      2830: aload_2
      2831: aload         7
      2833: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2836: invokedynamic #589,  0            // InvokeDynamic #19:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      2841: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2844: goto          3442
      2847: astore        7
      2849: aload_2
      2850: ldc_w         #590                // String Usage: //set rec <number>
      2853: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2856: goto          3442
      2859: aload         4
      2861: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2864: ifeq          2877
      2867: aload         4
      2869: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2872: astore        7
      2874: goto          2878
      2877: return
      2878: aload_3
      2879: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2882: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      2885: istore        8
      2887: aload         7
      2889: iload         8
      2891: invokevirtual #592                // Method ext/mods/gameserver/model/actor/Player.setRecomHave:(I)V
      2894: aload         7
      2896: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      2899: aload_2
      2900: aload         7
      2902: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2905: iload         8
      2907: invokedynamic #595,  0            // InvokeDynamic #20:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      2912: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2915: goto          3442
      2918: astore        7
      2920: aload_2
      2921: ldc_w         #590                // String Usage: //set rec <number>
      2924: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2927: goto          3442
      2930: aload         4
      2932: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      2935: ifeq          2948
      2938: aload         4
      2940: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      2943: astore        7
      2945: goto          2949
      2948: return
      2949: ldc_w         #596                // class ext/mods/gameserver/enums/actors/Sex
      2952: aload_3
      2953: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      2956: invokevirtual #598                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
      2959: invokestatic  #601                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
      2962: checkcast     #596                // class ext/mods/gameserver/enums/actors/Sex
      2965: astore        8
      2967: aload         8
      2969: aload         7
      2971: invokevirtual #450                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
      2974: invokevirtual #606                // Method ext/mods/gameserver/model/actor/container/player/Appearance.getSex:()Lext/mods/gameserver/enums/actors/Sex;
      2977: if_acmpne     3000
      2980: aload_2
      2981: aload         7
      2983: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      2986: aload         8
      2988: invokevirtual #610                // Method ext/mods/gameserver/enums/actors/Sex.toString:()Ljava/lang/String;
      2991: invokedynamic #611,  0            // InvokeDynamic #21:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      2996: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      2999: return
      3000: aload         7
      3002: iconst_0
      3003: invokevirtual #404                // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
      3006: aload         7
      3008: getstatic     #407                // Field ext/mods/gameserver/enums/skills/AbnormalEffect.HOLD_2:Lext/mods/gameserver/enums/skills/AbnormalEffect;
      3011: invokevirtual #413                // Method ext/mods/gameserver/model/actor/Player.startAbnormalEffect:(Lext/mods/gameserver/enums/skills/AbnormalEffect;)V
      3014: aload         7
      3016: aload         7
      3018: invokevirtual #417                // Method ext/mods/gameserver/model/actor/Player.removeKnownObject:(Lext/mods/gameserver/model/WorldObject;)V
      3021: aload         7
      3023: invokevirtual #421                // Method ext/mods/gameserver/model/actor/Player.decayMe:()V
      3026: aload         7
      3028: aload         8
      3030: aload_2
      3031: invokedynamic #612,  0            // InvokeDynamic #22:run:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
      3036: ldc2_w        #428                // long 4000l
      3039: invokestatic  #430                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
      3042: pop
      3043: goto          3442
      3046: astore        7
      3048: aload_2
      3049: ldc_w         #615                // String Usage: //set sex <sex>
      3052: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3055: goto          3442
      3058: aload         4
      3060: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      3063: ifeq          3076
      3066: aload         4
      3068: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      3071: astore        7
      3073: goto          3077
      3076: return
      3077: aload_3
      3078: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3081: invokestatic  #287                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      3084: istore        8
      3086: aload         7
      3088: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
      3091: invokevirtual #617                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
      3094: istore        9
      3096: iload         9
      3098: iload         8
      3100: if_icmpge     3117
      3103: aload         7
      3105: lconst_0
      3106: iload         8
      3108: iload         9
      3110: isub
      3111: invokevirtual #478                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
      3114: goto          3135
      3117: iload         9
      3119: iload         8
      3121: if_icmple     3135
      3124: aload         7
      3126: lconst_0
      3127: iload         9
      3129: iload         8
      3131: isub
      3132: invokevirtual #482                // Method ext/mods/gameserver/model/actor/Player.removeExpAndSp:(JI)V
      3135: aload         7
      3137: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      3140: aload_2
      3141: aload         7
      3143: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      3146: iload         8
      3148: invokedynamic #620,  0            // InvokeDynamic #23:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
      3153: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3156: goto          3442
      3159: astore        7
      3161: aload_2
      3162: ldc_w         #621                // String Usage: //set sp <number>
      3165: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3168: goto          3442
      3171: aload         4
      3173: instanceof    #46                 // class ext/mods/gameserver/model/actor/Player
      3176: ifeq          3189
      3179: aload         4
      3181: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      3184: astore        7
      3186: goto          3190
      3189: return
      3190: aload_3
      3191: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3194: invokedynamic #442,  0            // InvokeDynamic #11:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3199: invokestatic  #443                // Method java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;
      3202: invokevirtual #447                // Method java/lang/Integer.intValue:()I
      3205: istore        8
      3207: aload         7
      3209: invokevirtual #450                // Method ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
      3212: iload         8
      3214: invokevirtual #623                // Method ext/mods/gameserver/model/actor/container/player/Appearance.setTitleColor:(I)V
      3217: aload         7
      3219: iload         8
      3221: invokevirtual #626                // Method ext/mods/gameserver/model/actor/Player.setTitleColor:(I)I
      3224: pop
      3225: aload         7
      3227: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
      3230: aload_2
      3231: aload         7
      3233: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      3236: invokedynamic #628,  0            // InvokeDynamic #24:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3241: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3244: goto          3442
      3247: astore        7
      3249: aload_2
      3250: ldc_w         #629                // String Usage: //set tcolor <number>
      3253: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3256: goto          3442
      3259: aload_3
      3260: invokevirtual #26                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
      3263: ifeq          3273
      3266: aload_3
      3267: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
      3270: goto          3276
      3273: ldc_w         #631                // String
      3276: astore        7
      3278: aload         4
      3280: dup
      3281: invokestatic  #517                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
      3284: pop
      3285: astore        8
      3287: iconst_0
      3288: istore        9
      3290: aload         8
      3292: iload         9
      3294: invokedynamic #523,  0            // InvokeDynamic #16:typeSwitch:(Lext/mods/gameserver/model/WorldObject;I)I
      3299: lookupswitch  { // 2

                       0: 3324

                       1: 3360
                 default: 3406
            }
      3324: aload         8
      3326: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
      3329: astore        10
      3331: aload         10
      3333: aload         7
      3335: invokevirtual #633                // Method ext/mods/gameserver/model/actor/Player.setTitle:(Ljava/lang/String;)V
      3338: aload         10
      3340: invokevirtual #636                // Method ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
      3343: aload_2
      3344: aload         10
      3346: invokevirtual #639                // Method ext/mods/gameserver/model/actor/Player.getTitle:()Ljava/lang/String;
      3349: invokedynamic #642,  0            // InvokeDynamic #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3354: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3357: goto          3413
      3360: aload         8
      3362: checkcast     #568                // class ext/mods/gameserver/model/actor/Npc
      3365: astore        11
      3367: aload         11
      3369: aload         7
      3371: invokevirtual #643                // Method ext/mods/gameserver/model/actor/Npc.setTitle:(Ljava/lang/String;)V
      3374: aload         11
      3376: new           #571                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo
      3379: dup
      3380: aload         11
      3382: aconst_null
      3383: invokespecial #573                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo."<init>":(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
      3386: invokevirtual #576                // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      3389: aload_2
      3390: aload         11
      3392: invokevirtual #644                // Method ext/mods/gameserver/model/actor/Npc.getTitle:()Ljava/lang/String;
      3395: invokedynamic #642,  0            // InvokeDynamic #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      3400: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3403: goto          3413
      3406: aload_2
      3407: getstatic     #301                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      3410: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      3413: goto          3442
      3416: astore        7
      3418: aload_2
      3419: ldc_w         #645                // String Usage: //set title <title>
      3422: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3425: goto          3442
      3428: aload_2
      3429: ldc_w         #647                // String Usage: //set access|class|color|exp|karma
      3432: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3435: aload_2
      3436: ldc_w         #649                // String Usage: //set level|name|rec|sex|sp|tcolor|title
      3439: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      3442: return
      Exception table:
         from    to  target type
          1541  1610  1625   Class java/lang/Throwable
          1632  1639  1642   Class java/lang/Throwable
          1529  1654  1669   Class java/lang/Throwable
          1676  1683  1686   Class java/lang/Throwable
          1524  1698  1701   Class java/lang/Exception
          1368  1714  1717   Class java/lang/Exception
          1729  1747  1810   Class java/lang/Exception
          1748  1769  1810   Class java/lang/Exception
          1770  1807  1810   Class java/lang/Exception
          1822  1840  1903   Class java/lang/Exception
          1841  1862  1903   Class java/lang/Exception
          1863  1900  1903   Class java/lang/Exception
          1915  1933  2066   Class java/lang/Exception
          1934  1957  2066   Class java/lang/Exception
          1958  1989  2066   Class java/lang/Exception
          1990  2019  2066   Class java/lang/Exception
          2020  2063  2066   Class java/lang/Exception
          2079  2097  2155   Class java/lang/Exception
          2098  2152  2155   Class java/lang/Exception
          2167  2185  2270   Class java/lang/Exception
          2186  2267  2270   Class java/lang/Exception
          2282  2300  2349   Class java/lang/Exception
          2301  2322  2349   Class java/lang/Exception
          2323  2346  2349   Class java/lang/Exception
          2361  2379  2489   Class java/lang/Exception
          2380  2411  2489   Class java/lang/Exception
          2412  2486  2489   Class java/lang/Exception
          2501  2581  2780   Class java/lang/Exception
          2582  2600  2780   Class java/lang/Exception
          2601  2632  2780   Class java/lang/Exception
          2633  2777  2780   Class java/lang/Exception
          2792  2810  2847   Class java/lang/Exception
          2811  2844  2847   Class java/lang/Exception
          2859  2877  2918   Class java/lang/Exception
          2878  2915  2918   Class java/lang/Exception
          2930  2948  3046   Class java/lang/Exception
          2949  2999  3046   Class java/lang/Exception
          3000  3043  3046   Class java/lang/Exception
          3058  3076  3159   Class java/lang/Exception
          3077  3156  3159   Class java/lang/Exception
          3171  3189  3247   Class java/lang/Exception
          3190  3244  3247   Class java/lang/Exception
          3259  3413  3416   Class java/lang/Exception
      LineNumberTable:
        line 65: 0
        line 66: 11
        line 68: 16
        line 70: 25
        line 72: 53
        line 73: 59
        line 74: 62
        line 76: 71
        line 78: 99
        line 79: 106
        line 81: 111
        line 82: 125
        line 85: 126
        line 86: 138
        line 88: 172
        line 89: 182
        line 91: 264
        line 92: 343
        line 94: 346
        line 95: 356
        line 96: 367
        line 97: 379
        line 98: 391
        line 99: 397
        line 100: 400
        line 102: 409
        line 104: 416
        line 105: 422
        line 108: 423
        line 110: 431
        line 113: 552
        line 115: 559
        line 116: 565
        line 119: 566
        line 120: 572
        line 121: 582
        line 122: 591
        line 123: 601
        line 125: 607
        line 126: 621
        line 129: 624
        line 131: 629
        line 132: 635
        line 136: 652
        line 137: 662
        line 138: 672
        line 140: 686
        line 141: 700
        line 144: 703
        line 147: 709
        line 148: 712
        line 150: 721
        line 152: 728
        line 153: 734
        line 156: 735
        line 158: 743
        line 161: 808
        line 162: 815
        line 164: 820
        line 165: 826
        line 170: 835
        line 174: 841
        line 175: 844
        line 177: 853
        line 179: 860
        line 180: 866
        line 181: 872
        line 182: 878
        line 185: 879
        line 187: 889
        line 192: 1368
        line 193: 1374
        line 195: 1380
        line 196: 1389
        line 198: 1404
        line 200: 1411
        line 201: 1416
        line 203: 1422
        line 206: 1441
        line 207: 1448
        line 208: 1451
        line 210: 1457
        line 211: 1463
        line 213: 1472
        line 214: 1482
        line 216: 1487
        line 218: 1494
        line 219: 1499
        line 221: 1505
        line 225: 1524
        line 226: 1529
        line 228: 1541
        line 229: 1551
        line 230: 1561
        line 232: 1569
        line 233: 1578
        line 234: 1583
        line 236: 1597
        line 237: 1610
        line 225: 1625
        line 237: 1654
        line 225: 1669
        line 241: 1698
        line 238: 1701
        line 240: 1703
        line 248: 1714
        line 245: 1717
        line 247: 1719
        line 249: 1726
        line 253: 1729
        line 254: 1747
        line 256: 1748
        line 257: 1757
        line 259: 1762
        line 260: 1769
        line 263: 1770
        line 264: 1777
        line 266: 1791
        line 271: 1807
        line 268: 1810
        line 270: 1812
        line 272: 1819
        line 277: 1822
        line 278: 1840
        line 280: 1841
        line 281: 1850
        line 283: 1855
        line 284: 1862
        line 287: 1863
        line 288: 1870
        line 290: 1884
        line 295: 1900
        line 292: 1903
        line 294: 1905
        line 296: 1912
        line 300: 1915
        line 301: 1933
        line 303: 1934
        line 304: 1943
        line 305: 1957
        line 307: 1958
        line 309: 1966
        line 311: 1975
        line 312: 1989
        line 315: 1990
        line 317: 2000
        line 318: 2019
        line 321: 2020
        line 322: 2026
        line 323: 2034
        line 324: 2041
        line 326: 2046
        line 347: 2063
        line 344: 2066
        line 346: 2068
        line 348: 2076
        line 353: 2079
        line 354: 2097
        line 356: 2098
        line 357: 2115
        line 358: 2125
        line 359: 2133
        line 361: 2138
        line 366: 2152
        line 363: 2155
        line 365: 2157
        line 367: 2164
        line 372: 2167
        line 373: 2185
        line 375: 2186
        line 376: 2195
        line 378: 2205
        line 379: 2213
        line 380: 2227
        line 381: 2235
        line 383: 2246
        line 385: 2251
        line 390: 2267
        line 387: 2270
        line 389: 2272
        line 391: 2279
        line 396: 2282
        line 397: 2300
        line 399: 2301
        line 400: 2310
        line 402: 2315
        line 403: 2322
        line 406: 2323
        line 408: 2330
        line 413: 2346
        line 410: 2349
        line 412: 2351
        line 414: 2358
        line 419: 2361
        line 420: 2379
        line 422: 2380
        line 423: 2389
        line 424: 2399
        line 426: 2404
        line 427: 2411
        line 430: 2412
        line 431: 2422
        line 433: 2429
        line 434: 2437
        line 435: 2451
        line 436: 2459
        line 438: 2470
        line 443: 2486
        line 440: 2489
        line 442: 2491
        line 444: 2498
        line 449: 2501
        line 451: 2507
        line 453: 2556
        line 454: 2563
        line 456: 2574
        line 457: 2581
        line 460: 2582
        line 462: 2593
        line 463: 2600
        line 466: 2601
        line 468: 2625
        line 469: 2632
        line 472: 2633
        line 474: 2646
        line 475: 2655
        line 476: 2662
        line 477: 2671
        line 478: 2676
        line 481: 2681
        line 482: 2688
        line 483: 2697
        line 484: 2702
        line 486: 2707
        line 487: 2721
        line 489: 2724
        line 490: 2731
        line 491: 2738
        line 493: 2753
        line 494: 2767
        line 497: 2770
        line 504: 2777
        line 501: 2780
        line 503: 2782
        line 505: 2789
        line 510: 2792
        line 511: 2810
        line 513: 2811
        line 514: 2830
        line 519: 2844
        line 516: 2847
        line 518: 2849
        line 520: 2856
        line 525: 2859
        line 526: 2877
        line 528: 2878
        line 530: 2887
        line 531: 2894
        line 533: 2899
        line 538: 2915
        line 535: 2918
        line 537: 2920
        line 539: 2927
        line 544: 2930
        line 545: 2948
        line 547: 2949
        line 549: 2967
        line 551: 2980
        line 552: 2999
        line 555: 3000
        line 556: 3006
        line 557: 3014
        line 558: 3021
        line 560: 3026
        line 576: 3043
        line 573: 3046
        line 575: 3048
        line 577: 3055
        line 582: 3058
        line 583: 3076
        line 585: 3077
        line 586: 3086
        line 588: 3096
        line 589: 3103
        line 590: 3117
        line 591: 3124
        line 593: 3135
        line 595: 3140
        line 600: 3156
        line 597: 3159
        line 599: 3161
        line 601: 3168
        line 606: 3171
        line 607: 3189
        line 609: 3190
        line 610: 3207
        line 611: 3217
        line 612: 3225
        line 614: 3230
        line 619: 3244
        line 616: 3247
        line 618: 3249
        line 620: 3256
        line 625: 3259
        line 627: 3278
        line 629: 3324
        line 630: 3331
        line 631: 3338
        line 633: 3343
        line 634: 3357
        line 636: 3360
        line 637: 3367
        line 638: 3374
        line 640: 3389
        line 641: 3403
        line 644: 3406
        line 651: 3413
        line 648: 3416
        line 650: 3418
        line 652: 3425
        line 655: 3428
        line 656: 3435
        line 660: 3442
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53       6     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          172     171     8 member   Lext/mods/gameserver/model/actor/Player;
           99     298     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          106     291     5 party   Lext/mods/gameserver/model/group/Party;
          138     259     6    sb   Ljava/lang/StringBuilder;
          356      41     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          572      52     7 param   Ljava/lang/String;
          431     278     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          815      20     7  clan   Lext/mods/gameserver/model/pledge/Clan;
          743      98     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1404      37     9 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1389      59     8   lvl   I
         1578      32    13 count   I
         1541     113    12    ps   Ljava/sql/PreparedStatement;
         1529     169    11   con   Ljava/sql/Connection;
         1703      11    11     e   Ljava/lang/Exception;
         1463     251     8  name   Ljava/lang/String;
         1472     242     9   lvl   I
         1482     232    10 worldPlayer   Lext/mods/gameserver/model/actor/Player;
         1374     340     7 paramCount   I
         1719       7     7     e   Ljava/lang/Exception;
         1744       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1748      59     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1757      50     8 newPvp   I
         1812       7     7     e   Ljava/lang/Exception;
         1837       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1841      59     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1850      50     8 newPk   I
         1905       7     7     e   Ljava/lang/Exception;
         1930       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1934     129     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         1943     120     8 newClassId   I
         1966      97     9 newClass   Lext/mods/gameserver/enums/actors/ClassId;
         2068       8     7     e   Ljava/lang/Exception;
         2094       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2098      54     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2115      37     8 colorName   I
         2157       7     7     e   Ljava/lang/Exception;
         2182       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2186      81     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2195      72     8 newExp   J
         2205      62    10 currentExp   J
         2272       7     7     e   Ljava/lang/Exception;
         2297       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2301      45     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2310      36     8 newKarma   I
         2351       7     7     e   Ljava/lang/Exception;
         2376       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2380     106     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2389      97     8 newLevel   I
         2399      87     9    pl   Lext/mods/gameserver/model/records/PlayerLevel;
         2422      64    10   pXp   J
         2429      57    12   tXp   J
         2491       7     7     e   Ljava/lang/Exception;
         2655      26    11 tempName   Ljava/lang/String;
         2563     161    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2731      39    11 targetNpc   Lext/mods/gameserver/model/actor/Npc;
         2507     270     7 newName   Ljava/lang/String;
         2782       7     7     e   Ljava/lang/Exception;
         2807       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2811      33     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2849       7     7     e   Ljava/lang/Exception;
         2874       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2878      37     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2887      28     8 newRec   I
         2920       7     7     e   Ljava/lang/Exception;
         2945       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2949      94     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         2967      76     8   sex   Lext/mods/gameserver/enums/actors/Sex;
         3048       7     7     e   Ljava/lang/Exception;
         3073       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         3077      79     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         3086      70     8 newSp   I
         3096      60     9 currentSp   I
         3161       7     7     e   Ljava/lang/Exception;
         3186       3     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         3190      54     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         3207      37     8 colorTitle   I
         3249       7     7     e   Ljava/lang/Exception;
         3331      29    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
         3367      39    11 targetNpc   Lext/mods/gameserver/model/actor/Npc;
         3278     135     7 newTitle   Ljava/lang/String;
         3418       7     7     e   Ljava/lang/Exception;
          889    2553     4 targetWorldObject   Lext/mods/gameserver/model/WorldObject;
            0    3443     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEditChar;
            0    3443     1 command   Ljava/lang/String;
            0    3443     2 player   Lext/mods/gameserver/model/actor/Player;
           11    3432     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 156
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/util/StringTokenizer ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 28 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/group/Party ]
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ class java/lang/StringBuilder, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 78
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 53
        frame_type = 22 /* same */
        frame_type = 254 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]
        frame_type = 15 /* same */
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 27 /* same */
        frame_type = 50 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 22 /* same */
        frame_type = 254 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/String, int ]
        frame_type = 12 /* same */
        frame_type = 18 /* same */
        frame_type = 26 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 34 /* same */
        frame_type = 254 /* append */
          offset_delta = 152
          locals = [ class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 75
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ int, int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 53
          locals = [ class java/lang/String, int, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 18 /* same */
        frame_type = 254 /* append */
          offset_delta = 72
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, int ]
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int, int, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int, int, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = []
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/enums/actors/ClassId ]
        frame_type = 29 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 12 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ long, long ]
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ int, class ext/mods/gameserver/model/records/PlayerLevel ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ long, long ]
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 254 /* append */
          offset_delta = 17
          locals = [ class java/lang/String, class ext/mods/gameserver/model/WorldObject, int ]
        frame_type = 36 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 18 /* same */
        frame_type = 31 /* same */
        frame_type = 47 /* same */
        frame_type = 250 /* chop */
          offset_delta = 42
        frame_type = 45 /* same */
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/enums/actors/Sex ]
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ int, int ]
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class ext/mods/gameserver/model/WorldObject, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class java/lang/String, class ext/mods/gameserver/model/WorldObject, int ]
        frame_type = 33 /* same */
        frame_type = 35 /* same */
        frame_type = 45 /* same */
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */
        frame_type = 248 /* chop */
          offset_delta = 13

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #651                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 665: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminEditChar;

  public static void gatherPlayerInfo(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.network.serverpackets.NpcHtmlMessage);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #655                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
         5: aload_2
         6: aload_0
         7: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        10: ldc_w         #658                // String html/admin/charinfo.htm
        13: invokevirtual #146                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        16: aload_2
        17: ldc           #150                // String %name%
        19: aload_1
        20: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        23: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        26: aload_2
        27: ldc_w         #660                // String %objid%
        30: aload_1
        31: invokevirtual #662                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        34: invokevirtual #665                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        37: aload_2
        38: ldc_w         #668                // String %clan%
        41: aload_1
        42: invokevirtual #225                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        45: ifnull        70
        48: aload_1
        49: invokevirtual #225                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        52: invokevirtual #670                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        55: aload_1
        56: invokevirtual #225                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        59: invokevirtual #670                // Method ext/mods/gameserver/model/pledge/Clan.getName:()Ljava/lang/String;
        62: invokedynamic #673,  0            // InvokeDynamic #26:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        67: goto          73
        70: ldc_w         #674                // String N/A
        73: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
        76: aload_2
        77: ldc           #155                // String %party%
        79: aload_1
        80: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        83: ifnull        110
        86: aload_1
        87: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
        90: aload_1
        91: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        94: invokevirtual #67                 // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
        97: invokeinterface #676,  1          // InterfaceMethod java/util/List.size:()I
       102: invokedynamic #679,  0            // InvokeDynamic #27:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       107: goto          113
       110: ldc_w         #674                // String N/A
       113: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       116: aload_2
       117: ldc_w         #680                // String %baseclass%
       120: invokestatic  #682                // Method ext/mods/gameserver/data/xml/PlayerData.getInstance:()Lext/mods/gameserver/data/xml/PlayerData;
       123: aload_1
       124: invokevirtual #687                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
       127: invokevirtual #690                // Method ext/mods/gameserver/data/xml/PlayerData.getClassNameById:(I)Ljava/lang/String;
       130: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       133: aload_2
       134: ldc_w         #694                // String %xp%
       137: aload_1
       138: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       141: invokevirtual #474                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getExp:()J
       144: invokevirtual #696                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;J)V
       147: aload_2
       148: ldc_w         #699                // String %curai%
       151: aload_1
       152: invokevirtual #701                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       155: invokevirtual #705                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       158: invokevirtual #711                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       161: invokevirtual #717                // Method ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
       164: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       167: aload_2
       168: ldc_w         #720                // String %nextai%
       171: aload_1
       172: invokevirtual #701                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       175: invokevirtual #722                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       178: invokevirtual #711                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       181: invokevirtual #717                // Method ext/mods/gameserver/enums/IntentionType.toString:()Ljava/lang/String;
       184: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       187: aload_2
       188: ldc_w         #725                // String %loc%
       191: aload_1
       192: invokevirtual #727                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       195: invokevirtual #731                // Method ext/mods/gameserver/model/location/SpawnLocation.toString:()Ljava/lang/String;
       198: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       201: aload_2
       202: ldc_w         #734                // String %account%
       205: aload_1
       206: invokevirtual #736                // Method ext/mods/gameserver/model/actor/Player.getAccountName:()Ljava/lang/String;
       209: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       212: aload_2
       213: ldc_w         #739                // String %ip%
       216: aload_1
       217: invokevirtual #741                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       220: ifnull        233
       223: aload_1
       224: invokevirtual #741                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       227: invokevirtual #745                // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
       230: ifeq          239
       233: ldc_w         #750                // String Offline trader
       236: goto          268
       239: getstatic     #752                // Field ext/mods/Config.PROXY:Z
       242: ifeq          255
       245: aload_1
       246: invokevirtual #741                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       249: invokevirtual #758                // Method ext/mods/gameserver/network/GameClient.getRealIpAddress:()Ljava/lang/String;
       252: goto          268
       255: aload_1
       256: invokevirtual #741                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       259: invokevirtual #761                // Method ext/mods/gameserver/network/GameClient.getConnection:()Lext/mods/commons/mmocore/MMOConnection;
       262: invokevirtual #764                // Method ext/mods/commons/mmocore/MMOConnection.getInetAddress:()Ljava/net/InetAddress;
       265: invokevirtual #770                // Method java/net/InetAddress.getHostAddress:()Ljava/lang/String;
       268: invokevirtual #152                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       271: return
      LineNumberTable:
        line 676: 0
        line 678: 5
        line 679: 16
        line 680: 26
        line 681: 37
        line 682: 76
        line 683: 116
        line 684: 133
        line 685: 147
        line 686: 167
        line 687: 187
        line 688: 201
        line 689: 212
        line 690: 271
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     272     0 player   Lext/mods/gameserver/model/actor/Player;
            0     272     1 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     272     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 119
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_5
         1: anewarray     #21                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #18                 // String admin_debug
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #43                 // String admin_party_info
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #162                // String admin_remove
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #219                // String admin_reset
        23: aastore
        24: dup
        25: iconst_4
        26: ldc           #240                // String admin_set
        28: aastore
        29: putstatic     #651                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        32: return
      LineNumberTable:
        line 53: 0
}
SourceFile: "AdminEditChar.java"
BootstrapMethods:
  0: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #890 \u0001 isn\'t in a party.
  1: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #892 Clan penalty is successfully removed for \u0001.
  2: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #894 \u0001\'s Death Penalty has been lifted.
  3: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #896 \u0001\'s skills reuse timers are now cleaned.
  4: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #898 \u0001\'s access level is now set to \u0001.
  5: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #900 \u0001couldn\'t be found - its access level is unaltered.
  6: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #902 You successfully set \u0001\'s pvp to \u0001.
  7: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #904 You successfully set \u0001\'s pk to \u0001.
  8: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #906 You tried to set an invalid class for \u0001.
  9: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #908 \u0001 is already a(n) \u0001.
  10: #957 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #910 ()V
      #911 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.lambda$useAdminCommand$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/ClassId;Lext/mods/gameserver/model/actor/Player;)V
      #910 ()V
  11: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #914 0x\u0001
  12: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #916 You successfully set color name of \u0001.
  13: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #918 You successfully set \u0001\'s XP to \u0001.
  14: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #920 You successfully set \u0001\'s karma to \u0001.
  15: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #922 You successfully set \u0001\'s level to \u0001.
  16: #964 REF_invokeStatic java/lang/runtime/SwitchBootstraps.typeSwitch:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #46 ext/mods/gameserver/model/actor/Player
      #568 ext/mods/gameserver/model/actor/Npc
  17: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #924 \u0001_temp
  18: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #926 You successfully set your target\'s name to \u0001.
  19: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #928 You have modified \u0001\'s noble status.
  20: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #930 You successfully set \u0001 to \u0001.
  21: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #932 \u0001\'s sex is already defined as \u0001.
  22: #957 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #910 ()V
      #934 REF_invokeStatic ext/mods/gameserver/handler/admincommandhandlers/AdminEditChar.lambda$useAdminCommand$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/actors/Sex;Lext/mods/gameserver/model/actor/Player;)V
      #910 ()V
  23: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #937 You successfully set \u0001\'s SP to \u0001.
  24: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #939 You successfully set title color name of \u0001.
  25: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #941 You successfully set your target\'s title to \u0001.
  26: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #943 <a action=\"bypass -h admin_pledge info \u0001\">\u0001</a>
  27: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #945 <a action=\"bypass -h admin_party_info \u0001\">\u0001 members</a>
  28: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #947 You successfully set \u0001 gender to \u0001.
  29: #951 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #949 You successfully set \u0001 class to \u0001.
InnerClasses:
  public static #973= #571 of #971;       // NpcInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$NpcInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  public static final #978= #974 of #976; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
