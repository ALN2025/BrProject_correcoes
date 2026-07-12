// Bytecode for: ext.mods.gameserver.handler.bypasshandlers.UserNpcInfo
// File: ext\mods\gameserver\handler\bypasshandlers\UserNpcInfo.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.class
  Last modified 9 de jul de 2026; size 21881 bytes
  MD5 checksum f3f94adfa2c006c68904c1b4163eebb2
  Compiled from "UserNpcInfo.java"
public class ext.mods.gameserver.handler.bypasshandlers.UserNpcInfo implements ext.mods.gameserver.handler.IBypassHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #46                         // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 4, methods: 13, attributes: 3
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
   #18 = Methodref          #19.#20       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #19 = Class              #21           // java/lang/Integer
   #20 = NameAndType        #22:#23       // parseInt:(Ljava/lang/String;)I
   #21 = Utf8               java/lang/Integer
   #22 = Utf8               parseInt
   #23 = Utf8               (Ljava/lang/String;)I
   #24 = Methodref          #25.#26       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #25 = Class              #27           // ext/mods/gameserver/model/World
   #26 = NameAndType        #28:#29       // getInstance:()Lext/mods/gameserver/model/World;
   #27 = Utf8               ext/mods/gameserver/model/World
   #28 = Utf8               getInstance
   #29 = Utf8               ()Lext/mods/gameserver/model/World;
   #30 = Methodref          #25.#31       // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #31 = NameAndType        #32:#33       // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #32 = Utf8               getObject
   #33 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #34 = Class              #35           // ext/mods/gameserver/model/actor/Npc
   #35 = Utf8               ext/mods/gameserver/model/actor/Npc
   #36 = Class              #37           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #37 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #38 = Methodref          #36.#39       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #39 = NameAndType        #5:#40        // "<init>":(I)V
   #40 = Utf8               (I)V
   #41 = Methodref          #7.#42        // java/util/StringTokenizer.hasMoreTokens:()Z
   #42 = NameAndType        #43:#44       // hasMoreTokens:()Z
   #43 = Utf8               hasMoreTokens
   #44 = Utf8               ()Z
   #45 = Methodref          #46.#47       // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.showNpcStatsInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #46 = Class              #48           // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo
   #47 = NameAndType        #49:#50       // showNpcStatsInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #48 = Utf8               ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo
   #49 = Utf8               showNpcStatsInfos
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #51 = Methodref          #52.#53       // java/lang/String.hashCode:()I
   #52 = Class              #54           // java/lang/String
   #53 = NameAndType        #55:#56       // hashCode:()I
   #54 = Utf8               java/lang/String
   #55 = Utf8               hashCode
   #56 = Utf8               ()I
   #57 = String             #58           // aggr
   #58 = Utf8               aggr
   #59 = Methodref          #52.#60       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #60 = NameAndType        #61:#62       // equals:(Ljava/lang/Object;)Z
   #61 = Utf8               equals
   #62 = Utf8               (Ljava/lang/Object;)Z
   #63 = String             #64           // drop
   #64 = Utf8               drop
   #65 = String             #66           // spoil
   #66 = Utf8               spoil
   #67 = String             #68           // skill
   #68 = Utf8               skill
   #69 = String             #70           // effects
   #70 = Utf8               effects
   #71 = Methodref          #46.#72       // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.showAggrInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #72 = NameAndType        #73:#50       // showAggrInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #73 = Utf8               showAggrInfo
   #74 = Methodref          #52.#75       // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
   #75 = NameAndType        #76:#77       // equalsIgnoreCase:(Ljava/lang/String;)Z
   #76 = Utf8               equalsIgnoreCase
   #77 = Utf8               (Ljava/lang/String;)Z
   #78 = Methodref          #46.#79       // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.showNpcInfoDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
   #79 = NameAndType        #80:#81       // showNpcInfoDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
   #80 = Utf8               showNpcInfoDrop
   #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
   #82 = Class              #83           // java/lang/Exception
   #83 = Utf8               java/lang/Exception
   #84 = Methodref          #46.#85       // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.showSkillInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #85 = NameAndType        #86:#50       // showSkillInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #86 = Utf8               showSkillInfos
   #87 = Methodref          #46.#88       // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.showNpcInfoEffects:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
   #88 = NameAndType        #89:#90       // showNpcInfoEffects:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
   #89 = Utf8               showNpcInfoEffects
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
   #91 = Methodref          #92.#93       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Class              #94           // ext/mods/gameserver/model/actor/Player
   #93 = NameAndType        #95:#96       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = Utf8               ext/mods/gameserver/model/actor/Player
   #95 = Utf8               sendPacket
   #96 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = Fieldref           #46.#98       // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.LOGGER:Lext/mods/commons/logging/CLogger;
   #98 = NameAndType        #99:#100      // LOGGER:Lext/mods/commons/logging/CLogger;
   #99 = Utf8               LOGGER
  #100 = Utf8               Lext/mods/commons/logging/CLogger;
  #101 = String             #102          // bypass user_npc_info error
  #102 = Utf8               bypass user_npc_info error
  #103 = Methodref          #104.#105     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #104 = Class              #106          // ext/mods/commons/logging/CLogger
  #105 = NameAndType        #107:#108     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #106 = Utf8               ext/mods/commons/logging/CLogger
  #107 = Utf8               error
  #108 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #109 = Methodref          #92.#110      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #110 = NameAndType        #111:#112     // getLocale:()Ljava/util/Locale;
  #111 = Utf8               getLocale
  #112 = Utf8               ()Ljava/util/Locale;
  #113 = String             #114          // html/mods/npcinfo/stat.htm
  #114 = Utf8               html/mods/npcinfo/stat.htm
  #115 = Methodref          #36.#116      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #116 = NameAndType        #117:#118     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #117 = Utf8               setFile
  #118 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #119 = String             #120          // %objid%
  #120 = Utf8               %objid%
  #121 = Methodref          #34.#122      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #122 = NameAndType        #123:#56      // getObjectId:()I
  #123 = Utf8               getObjectId
  #124 = Methodref          #36.#125      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #125 = NameAndType        #126:#127     // replace:(Ljava/lang/String;I)V
  #126 = Utf8               replace
  #127 = Utf8               (Ljava/lang/String;I)V
  #128 = String             #129          // %hp%
  #129 = Utf8               %hp%
  #130 = Methodref          #34.#131      // ext/mods/gameserver/model/actor/Npc.isChampion:()Z
  #131 = NameAndType        #132:#44      // isChampion:()Z
  #132 = Utf8               isChampion
  #133 = Methodref          #34.#134      // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #134 = NameAndType        #135:#136     // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #135 = Utf8               getStatus
  #136 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
  #138 = Class              #140          // ext/mods/gameserver/model/actor/status/NpcStatus
  #139 = NameAndType        #141:#142     // getHp:()D
  #140 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #141 = Utf8               getHp
  #142 = Utf8               ()D
  #143 = Fieldref           #144.#145     // ext/mods/Config.CHAMPION_HP:I
  #144 = Class              #146          // ext/mods/Config
  #145 = NameAndType        #147:#148     // CHAMPION_HP:I
  #146 = Utf8               ext/mods/Config
  #147 = Utf8               CHAMPION_HP
  #148 = Utf8               I
  #149 = String             #150          // %hpmax%
  #150 = Utf8               %hpmax%
  #151 = Methodref          #138.#152     // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
  #152 = NameAndType        #153:#56      // getMaxHp:()I
  #153 = Utf8               getMaxHp
  #154 = String             #155          // %mp%
  #155 = Utf8               %mp%
  #156 = Methodref          #138.#157     // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
  #157 = NameAndType        #158:#142     // getMp:()D
  #158 = Utf8               getMp
  #159 = String             #160          // %mpmax%
  #160 = Utf8               %mpmax%
  #161 = Methodref          #138.#162     // ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
  #162 = NameAndType        #163:#56      // getMaxMp:()I
  #163 = Utf8               getMaxMp
  #164 = String             #165          // %patk%
  #165 = Utf8               %patk%
  #166 = Methodref          #138.#167     // ext/mods/gameserver/model/actor/status/NpcStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #167 = NameAndType        #168:#169     // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #168 = Utf8               getPAtk
  #169 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #170 = Fieldref           #144.#171     // ext/mods/Config.CHAMPION_ATK:D
  #171 = NameAndType        #172:#173     // CHAMPION_ATK:D
  #172 = Utf8               CHAMPION_ATK
  #173 = Utf8               D
  #174 = Methodref          #36.#175      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
  #175 = NameAndType        #126:#176     // replace:(Ljava/lang/String;D)V
  #176 = Utf8               (Ljava/lang/String;D)V
  #177 = String             #178          // %matk%
  #178 = Utf8               %matk%
  #179 = Methodref          #138.#180     // ext/mods/gameserver/model/actor/status/NpcStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #180 = NameAndType        #181:#182     // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #181 = Utf8               getMAtk
  #182 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #183 = Fieldref           #144.#184     // ext/mods/Config.CHAMPION_MATK:D
  #184 = NameAndType        #185:#173     // CHAMPION_MATK:D
  #185 = Utf8               CHAMPION_MATK
  #186 = String             #187          // %pdef%
  #187 = Utf8               %pdef%
  #188 = Methodref          #138.#189     // ext/mods/gameserver/model/actor/status/NpcStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #189 = NameAndType        #190:#169     // getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
  #190 = Utf8               getPDef
  #191 = String             #192          // %mdef%
  #192 = Utf8               %mdef%
  #193 = Methodref          #138.#194     // ext/mods/gameserver/model/actor/status/NpcStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #194 = NameAndType        #195:#182     // getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #195 = Utf8               getMDef
  #196 = String             #197          // %accu%
  #197 = Utf8               %accu%
  #198 = Methodref          #138.#199     // ext/mods/gameserver/model/actor/status/NpcStatus.getAccuracy:()I
  #199 = NameAndType        #200:#56      // getAccuracy:()I
  #200 = Utf8               getAccuracy
  #201 = String             #202          // %evas%
  #202 = Utf8               %evas%
  #203 = Methodref          #138.#204     // ext/mods/gameserver/model/actor/status/NpcStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #204 = NameAndType        #205:#169     // getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #205 = Utf8               getEvasionRate
  #206 = String             #207          // %crit%
  #207 = Utf8               %crit%
  #208 = Methodref          #138.#209     // ext/mods/gameserver/model/actor/status/NpcStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #209 = NameAndType        #210:#182     // getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #210 = Utf8               getCriticalHit
  #211 = String             #212          // %rspd%
  #212 = Utf8               %rspd%
  #213 = Methodref          #138.#214     // ext/mods/gameserver/model/actor/status/NpcStatus.getMoveSpeed:()F
  #214 = NameAndType        #215:#216     // getMoveSpeed:()F
  #215 = Utf8               getMoveSpeed
  #216 = Utf8               ()F
  #217 = String             #218          // %aspd%
  #218 = Utf8               %aspd%
  #219 = Methodref          #138.#220     // ext/mods/gameserver/model/actor/status/NpcStatus.getPAtkSpd:()I
  #220 = NameAndType        #221:#56      // getPAtkSpd:()I
  #221 = Utf8               getPAtkSpd
  #222 = Fieldref           #144.#223     // ext/mods/Config.CHAMPION_SPD_ATK:D
  #223 = NameAndType        #224:#173     // CHAMPION_SPD_ATK:D
  #224 = Utf8               CHAMPION_SPD_ATK
  #225 = String             #226          // %cspd%
  #226 = Utf8               %cspd%
  #227 = Methodref          #138.#228     // ext/mods/gameserver/model/actor/status/NpcStatus.getMAtkSpd:()I
  #228 = NameAndType        #229:#56      // getMAtkSpd:()I
  #229 = Utf8               getMAtkSpd
  #230 = Fieldref           #144.#231     // ext/mods/Config.CHAMPION_SPD_MATK:D
  #231 = NameAndType        #232:#173     // CHAMPION_SPD_MATK:D
  #232 = Utf8               CHAMPION_SPD_MATK
  #233 = String             #234          // %str%
  #234 = Utf8               %str%
  #235 = Methodref          #138.#236     // ext/mods/gameserver/model/actor/status/NpcStatus.getSTR:()I
  #236 = NameAndType        #237:#56      // getSTR:()I
  #237 = Utf8               getSTR
  #238 = String             #239          // %dex%
  #239 = Utf8               %dex%
  #240 = Methodref          #138.#241     // ext/mods/gameserver/model/actor/status/NpcStatus.getDEX:()I
  #241 = NameAndType        #242:#56      // getDEX:()I
  #242 = Utf8               getDEX
  #243 = String             #244          // %con%
  #244 = Utf8               %con%
  #245 = Methodref          #138.#246     // ext/mods/gameserver/model/actor/status/NpcStatus.getCON:()I
  #246 = NameAndType        #247:#56      // getCON:()I
  #247 = Utf8               getCON
  #248 = String             #249          // %int%
  #249 = Utf8               %int%
  #250 = Methodref          #138.#251     // ext/mods/gameserver/model/actor/status/NpcStatus.getINT:()I
  #251 = NameAndType        #252:#56      // getINT:()I
  #252 = Utf8               getINT
  #253 = String             #254          // %wit%
  #254 = Utf8               %wit%
  #255 = Methodref          #138.#256     // ext/mods/gameserver/model/actor/status/NpcStatus.getWIT:()I
  #256 = NameAndType        #257:#56      // getWIT:()I
  #257 = Utf8               getWIT
  #258 = String             #259          // %men%
  #259 = Utf8               %men%
  #260 = Methodref          #138.#261     // ext/mods/gameserver/model/actor/status/NpcStatus.getMEN:()I
  #261 = NameAndType        #262:#56      // getMEN:()I
  #262 = Utf8               getMEN
  #263 = String             #264          // %ele_fire%
  #264 = Utf8               %ele_fire%
  #265 = Fieldref           #266.#267     // ext/mods/gameserver/enums/skills/ElementType.FIRE:Lext/mods/gameserver/enums/skills/ElementType;
  #266 = Class              #268          // ext/mods/gameserver/enums/skills/ElementType
  #267 = NameAndType        #269:#270     // FIRE:Lext/mods/gameserver/enums/skills/ElementType;
  #268 = Utf8               ext/mods/gameserver/enums/skills/ElementType
  #269 = Utf8               FIRE
  #270 = Utf8               Lext/mods/gameserver/enums/skills/ElementType;
  #271 = Methodref          #138.#272     // ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
  #272 = NameAndType        #273:#274     // getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
  #273 = Utf8               getDefenseElementValue
  #274 = Utf8               (Lext/mods/gameserver/enums/skills/ElementType;)D
  #275 = String             #276          // %ele_water%
  #276 = Utf8               %ele_water%
  #277 = Fieldref           #266.#278     // ext/mods/gameserver/enums/skills/ElementType.WATER:Lext/mods/gameserver/enums/skills/ElementType;
  #278 = NameAndType        #279:#270     // WATER:Lext/mods/gameserver/enums/skills/ElementType;
  #279 = Utf8               WATER
  #280 = String             #281          // %ele_wind%
  #281 = Utf8               %ele_wind%
  #282 = Fieldref           #266.#283     // ext/mods/gameserver/enums/skills/ElementType.WIND:Lext/mods/gameserver/enums/skills/ElementType;
  #283 = NameAndType        #284:#270     // WIND:Lext/mods/gameserver/enums/skills/ElementType;
  #284 = Utf8               WIND
  #285 = String             #286          // %ele_earth%
  #286 = Utf8               %ele_earth%
  #287 = Fieldref           #266.#288     // ext/mods/gameserver/enums/skills/ElementType.EARTH:Lext/mods/gameserver/enums/skills/ElementType;
  #288 = NameAndType        #289:#270     // EARTH:Lext/mods/gameserver/enums/skills/ElementType;
  #289 = Utf8               EARTH
  #290 = String             #291          // %ele_holy%
  #291 = Utf8               %ele_holy%
  #292 = Fieldref           #266.#293     // ext/mods/gameserver/enums/skills/ElementType.HOLY:Lext/mods/gameserver/enums/skills/ElementType;
  #293 = NameAndType        #294:#270     // HOLY:Lext/mods/gameserver/enums/skills/ElementType;
  #294 = Utf8               HOLY
  #295 = String             #296          // %ele_dark%
  #296 = Utf8               %ele_dark%
  #297 = Fieldref           #266.#298     // ext/mods/gameserver/enums/skills/ElementType.DARK:Lext/mods/gameserver/enums/skills/ElementType;
  #298 = NameAndType        #299:#270     // DARK:Lext/mods/gameserver/enums/skills/ElementType;
  #299 = Utf8               DARK
  #300 = String             #301          // html/mods/npcinfo/aggr.htm
  #301 = Utf8               html/mods/npcinfo/aggr.htm
  #302 = Class              #303          // ext/mods/gameserver/model/actor/Attackable
  #303 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #304 = String             #305          // %content%
  #305 = Utf8               %content%
  #306 = InvokeDynamic      #0:#307       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #307 = NameAndType        #308:#309     // makeConcatWithConstants:(I)Ljava/lang/String;
  #308 = Utf8               makeConcatWithConstants
  #309 = Utf8               (I)Ljava/lang/String;
  #310 = Methodref          #36.#311      // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #311 = NameAndType        #126:#13      // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #312 = Methodref          #302.#313     // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #313 = NameAndType        #314:#315     // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #314 = Utf8               getAI
  #315 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #316 = Methodref          #317.#318     // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #317 = Class              #319          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #318 = NameAndType        #320:#321     // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #319 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #320 = Utf8               getAggroList
  #321 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #322 = Methodref          #323.#324     // ext/mods/gameserver/model/actor/container/attackable/AggroList.isEmpty:()Z
  #323 = Class              #325          // ext/mods/gameserver/model/actor/container/attackable/AggroList
  #324 = NameAndType        #326:#44      // isEmpty:()Z
  #325 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
  #326 = Utf8               isEmpty
  #327 = InvokeDynamic      #1:#307       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #328 = Class              #329          // java/lang/StringBuilder
  #329 = Utf8               java/lang/StringBuilder
  #330 = Methodref          #328.#39      // java/lang/StringBuilder."<init>":(I)V
  #331 = InvokeDynamic      #2:#307       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #332 = Methodref          #328.#333     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #333 = NameAndType        #334:#335     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #334 = Utf8               append
  #335 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #336 = Methodref          #323.#337     // ext/mods/gameserver/model/actor/container/attackable/AggroList.values:()Ljava/util/Collection;
  #337 = NameAndType        #338:#339     // values:()Ljava/util/Collection;
  #338 = Utf8               values
  #339 = Utf8               ()Ljava/util/Collection;
  #340 = InterfaceMethodref #341.#342     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #341 = Class              #343          // java/util/Collection
  #342 = NameAndType        #344:#345     // stream:()Ljava/util/stream/Stream;
  #343 = Utf8               java/util/Collection
  #344 = Utf8               stream
  #345 = Utf8               ()Ljava/util/stream/Stream;
  #346 = InvokeDynamic      #3:#347       // #3:apply:()Ljava/util/function/Function;
  #347 = NameAndType        #348:#349     // apply:()Ljava/util/function/Function;
  #348 = Utf8               apply
  #349 = Utf8               ()Ljava/util/function/Function;
  #350 = InterfaceMethodref #351.#352     // java/util/Comparator.reverseOrder:()Ljava/util/Comparator;
  #351 = Class              #353          // java/util/Comparator
  #352 = NameAndType        #354:#355     // reverseOrder:()Ljava/util/Comparator;
  #353 = Utf8               java/util/Comparator
  #354 = Utf8               reverseOrder
  #355 = Utf8               ()Ljava/util/Comparator;
  #356 = InterfaceMethodref #351.#357     // java/util/Comparator.comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
  #357 = NameAndType        #358:#359     // comparing:(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
  #358 = Utf8               comparing
  #359 = Utf8               (Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
  #360 = InterfaceMethodref #361.#362     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #361 = Class              #363          // java/util/stream/Stream
  #362 = NameAndType        #364:#365     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #363 = Utf8               java/util/stream/Stream
  #364 = Utf8               sorted
  #365 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #366 = Long               15l
  #368 = InterfaceMethodref #361.#369     // java/util/stream/Stream.limit:(J)Ljava/util/stream/Stream;
  #369 = NameAndType        #370:#371     // limit:(J)Ljava/util/stream/Stream;
  #370 = Utf8               limit
  #371 = Utf8               (J)Ljava/util/stream/Stream;
  #372 = InterfaceMethodref #361.#373     // java/util/stream/Stream.toList:()Ljava/util/List;
  #373 = NameAndType        #374:#375     // toList:()Ljava/util/List;
  #374 = Utf8               toList
  #375 = Utf8               ()Ljava/util/List;
  #376 = InterfaceMethodref #377.#378     // java/util/List.iterator:()Ljava/util/Iterator;
  #377 = Class              #379          // java/util/List
  #378 = NameAndType        #380:#381     // iterator:()Ljava/util/Iterator;
  #379 = Utf8               java/util/List
  #380 = Utf8               iterator
  #381 = Utf8               ()Ljava/util/Iterator;
  #382 = InterfaceMethodref #383.#384     // java/util/Iterator.hasNext:()Z
  #383 = Class              #385          // java/util/Iterator
  #384 = NameAndType        #386:#44      // hasNext:()Z
  #385 = Utf8               java/util/Iterator
  #386 = Utf8               hasNext
  #387 = InterfaceMethodref #383.#388     // java/util/Iterator.next:()Ljava/lang/Object;
  #388 = NameAndType        #389:#390     // next:()Ljava/lang/Object;
  #389 = Utf8               next
  #390 = Utf8               ()Ljava/lang/Object;
  #391 = Class              #392          // ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #392 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #393 = String             #394          // <tr><td>
  #394 = Utf8               <tr><td>
  #395 = Methodref          #391.#396     // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getAttacker:()Lext/mods/gameserver/model/actor/Creature;
  #396 = NameAndType        #397:#398     // getAttacker:()Lext/mods/gameserver/model/actor/Creature;
  #397 = Utf8               getAttacker
  #398 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #399 = Methodref          #400.#401     // ext/mods/gameserver/model/actor/Creature.getName:()Ljava/lang/String;
  #400 = Class              #402          // ext/mods/gameserver/model/actor/Creature
  #401 = NameAndType        #403:#17      // getName:()Ljava/lang/String;
  #402 = Utf8               ext/mods/gameserver/model/actor/Creature
  #403 = Utf8               getName
  #404 = String             #405          // </td><td>
  #405 = Utf8               </td><td>
  #406 = Methodref          #391.#407     // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getDamage:()D
  #407 = NameAndType        #408:#142     // getDamage:()D
  #408 = Utf8               getDamage
  #409 = Methodref          #410.#411     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #410 = Class              #412          // java/lang/Double
  #411 = NameAndType        #413:#414     // valueOf:(D)Ljava/lang/Double;
  #412 = Utf8               java/lang/Double
  #413 = Utf8               valueOf
  #414 = Utf8               (D)Ljava/lang/Double;
  #415 = Methodref          #391.#416     // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
  #416 = NameAndType        #417:#142     // getHate:()D
  #417 = Utf8               getHate
  #418 = String             #419          // </td></tr>
  #419 = Utf8               </td></tr>
  #420 = Methodref          #421.#422     // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #421 = Class              #423          // ext/mods/commons/lang/StringUtil
  #422 = NameAndType        #334:#424     // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #423 = Utf8               ext/mods/commons/lang/StringUtil
  #424 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #425 = String             #426          // </table><img src=\"L2UI.SquareGray\" width=277 height=1>
  #426 = Utf8               </table><img src=\"L2UI.SquareGray\" width=277 height=1>
  #427 = Methodref          #328.#428     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #428 = NameAndType        #429:#17      // toString:()Ljava/lang/String;
  #429 = Utf8               toString
  #430 = String             #431          // html/mods/npcinfo/droplist.htm
  #431 = Utf8               html/mods/npcinfo/droplist.htm
  #432 = Methodref          #34.#433      // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #433 = NameAndType        #434:#435     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #434 = Utf8               getTemplate
  #435 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #436 = Methodref          #437.#438     // ext/mods/gameserver/model/actor/template/NpcTemplate.getDropData:()Ljava/util/List;
  #437 = Class              #439          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #438 = NameAndType        #440:#375     // getDropData:()Ljava/util/List;
  #439 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #440 = Utf8               getDropData
  #441 = InterfaceMethodref #377.#342     // java/util/List.stream:()Ljava/util/stream/Stream;
  #442 = InvokeDynamic      #4:#443       // #4:test:(Z)Ljava/util/function/Predicate;
  #443 = NameAndType        #444:#445     // test:(Z)Ljava/util/function/Predicate;
  #444 = Utf8               test
  #445 = Utf8               (Z)Ljava/util/function/Predicate;
  #446 = InterfaceMethodref #361.#447     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #447 = NameAndType        #448:#449     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #448 = Utf8               filter
  #449 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #450 = InvokeDynamic      #5:#451       // #5:test:()Ljava/util/function/Predicate;
  #451 = NameAndType        #444:#452     // test:()Ljava/util/function/Predicate;
  #452 = Utf8               ()Ljava/util/function/Predicate;
  #453 = InvokeDynamic      #6:#451       // #6:test:()Ljava/util/function/Predicate;
  #454 = Class              #455          // ext/mods/commons/data/Pagination
  #455 = Utf8               ext/mods/commons/data/Pagination
  #456 = Methodref          #454.#457     // ext/mods/commons/data/Pagination."<init>":(Ljava/util/stream/Stream;II)V
  #457 = NameAndType        #5:#458       // "<init>":(Ljava/util/stream/Stream;II)V
  #458 = Utf8               (Ljava/util/stream/Stream;II)V
  #459 = Methodref          #454.#378     // ext/mods/commons/data/Pagination.iterator:()Ljava/util/Iterator;
  #460 = Class              #461          // ext/mods/gameserver/model/item/DropCategory
  #461 = Utf8               ext/mods/gameserver/model/item/DropCategory
  #462 = Methodref          #463.#464     // ext/mods/gameserver/data/DropCalc.getInstance:()Lext/mods/gameserver/data/DropCalc;
  #463 = Class              #465          // ext/mods/gameserver/data/DropCalc
  #464 = NameAndType        #28:#466      // getInstance:()Lext/mods/gameserver/data/DropCalc;
  #465 = Utf8               ext/mods/gameserver/data/DropCalc
  #466 = Utf8               ()Lext/mods/gameserver/data/DropCalc;
  #467 = Methodref          #460.#468     // ext/mods/gameserver/model/item/DropCategory.getDropType:()Lext/mods/gameserver/enums/DropType;
  #468 = NameAndType        #469:#470     // getDropType:()Lext/mods/gameserver/enums/DropType;
  #469 = Utf8               getDropType
  #470 = Utf8               ()Lext/mods/gameserver/enums/DropType;
  #471 = Methodref          #34.#472      // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
  #472 = NameAndType        #473:#44      // isRaidBoss:()Z
  #473 = Utf8               isRaidBoss
  #474 = Class              #475          // ext/mods/gameserver/model/actor/instance/GrandBoss
  #475 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
  #476 = Methodref          #463.#477     // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #477 = NameAndType        #478:#479     // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #478 = Utf8               calcDropChance
  #479 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropCategory;Lext/mods/gameserver/enums/DropType;ZZ)D
  #480 = Double             100.0d
  #482 = Methodref          #483.#484     // java/lang/Math.min:(DD)D
  #483 = Class              #485          // java/lang/Math
  #484 = NameAndType        #486:#487     // min:(DD)D
  #485 = Utf8               java/lang/Math
  #486 = Utf8               min
  #487 = Utf8               (DD)D
  #488 = Methodref          #460.#489     // ext/mods/gameserver/model/item/DropCategory.getChance:()D
  #489 = NameAndType        #490:#142     // getChance:()D
  #490 = Utf8               getChance
  #491 = Methodref          #492.#493     // ext/mods/gameserver/enums/DropType.getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #492 = Class              #494          // ext/mods/gameserver/enums/DropType
  #493 = NameAndType        #495:#496     // getDropRate:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #494 = Utf8               ext/mods/gameserver/enums/DropType
  #495 = Utf8               getDropRate
  #496 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;ZZ)D
  #497 = Methodref          #460.#498     // ext/mods/gameserver/model/item/DropCategory.getCategoryCumulativeChance:()D
  #498 = NameAndType        #499:#142     // getCategoryCumulativeChance:()D
  #499 = Utf8               getCategoryCumulativeChance
  #500 = Fieldref           #144.#501     // ext/mods/Config.ALTERNATE_DROP_LIST:Z
  #501 = NameAndType        #502:#503     // ALTERNATE_DROP_LIST:Z
  #502 = Utf8               ALTERNATE_DROP_LIST
  #503 = Utf8               Z
  #504 = String             #505          // <br></center>Category:
  #505 = Utf8               <br></center>Category:
  #506 = String             #507          //  - Rate:
  #507 = Utf8                - Rate:
  #508 = Fieldref           #46.#509      // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.PERCENT:Ljava/text/DecimalFormat;
  #509 = NameAndType        #510:#511     // PERCENT:Ljava/text/DecimalFormat;
  #510 = Utf8               PERCENT
  #511 = Utf8               Ljava/text/DecimalFormat;
  #512 = Methodref          #513.#514     // java/text/DecimalFormat.format:(D)Ljava/lang/String;
  #513 = Class              #515          // java/text/DecimalFormat
  #514 = NameAndType        #516:#517     // format:(D)Ljava/lang/String;
  #515 = Utf8               java/text/DecimalFormat
  #516 = Utf8               format
  #517 = Utf8               (D)Ljava/lang/String;
  #518 = String             #519          // %<center>
  #519 = Utf8               %<center>
  #520 = Methodref          #454.#521     // ext/mods/commons/data/Pagination.append:([Ljava/lang/Object;)V
  #521 = NameAndType        #334:#522     // append:([Ljava/lang/Object;)V
  #522 = Utf8               ([Ljava/lang/Object;)V
  #523 = Methodref          #460.#524     // ext/mods/gameserver/model/item/DropCategory.getAllDrops:()Ljava/util/List;
  #524 = NameAndType        #525:#375     // getAllDrops:()Ljava/util/List;
  #525 = Utf8               getAllDrops
  #526 = Class              #527          // ext/mods/gameserver/model/item/DropData
  #527 = Utf8               ext/mods/gameserver/model/item/DropData
  #528 = Methodref          #529.#530     // ext/mods/gameserver/data/xml/SkipData.getInstance:()Lext/mods/gameserver/data/xml/SkipData;
  #529 = Class              #531          // ext/mods/gameserver/data/xml/SkipData
  #530 = NameAndType        #28:#532      // getInstance:()Lext/mods/gameserver/data/xml/SkipData;
  #531 = Utf8               ext/mods/gameserver/data/xml/SkipData
  #532 = Utf8               ()Lext/mods/gameserver/data/xml/SkipData;
  #533 = Methodref          #526.#534     // ext/mods/gameserver/model/item/DropData.getItemId:()I
  #534 = NameAndType        #535:#56      // getItemId:()I
  #535 = Utf8               getItemId
  #536 = Methodref          #529.#537     // ext/mods/gameserver/data/xml/SkipData.isSkipped:(I)Z
  #537 = NameAndType        #538:#539     // isSkipped:(I)Z
  #538 = Utf8               isSkipped
  #539 = Utf8               (I)Z
  #540 = Methodref          #463.#541     // ext/mods/gameserver/data/DropCalc.calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #541 = NameAndType        #478:#542     // calcDropChance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #542 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/DropData;Lext/mods/gameserver/enums/DropType;ZZ)D
  #543 = Double             99.99d
  #545 = Methodref          #483.#546     // java/lang/Math.max:(DD)D
  #546 = NameAndType        #547:#487     // max:(DD)D
  #547 = Utf8               max
  #548 = Double             10.0d
  #550 = Methodref          #483.#551     // java/lang/Math.pow:(DD)D
  #551 = NameAndType        #552:#487     // pow:(DD)D
  #552 = Utf8               pow
  #553 = Double             80.0d
  #555 = Methodref          #138.#556     // ext/mods/gameserver/model/actor/status/NpcStatus.getLevel:()I
  #556 = NameAndType        #557:#56      // getLevel:()I
  #557 = Utf8               getLevel
  #558 = Double             90.0d
  #560 = Methodref          #526.#561     // ext/mods/gameserver/model/item/DropData.getMinDrop:()I
  #561 = NameAndType        #562:#56      // getMinDrop:()I
  #562 = Utf8               getMinDrop
  #563 = Methodref          #526.#564     // ext/mods/gameserver/model/item/DropData.getMaxDrop:()I
  #564 = NameAndType        #565:#56      // getMaxDrop:()I
  #565 = Utf8               getMaxDrop
  #566 = Fieldref           #492.#567     // ext/mods/gameserver/enums/DropType.CURRENCY:Lext/mods/gameserver/enums/DropType;
  #567 = NameAndType        #568:#569     // CURRENCY:Lext/mods/gameserver/enums/DropType;
  #568 = Utf8               CURRENCY
  #569 = Utf8               Lext/mods/gameserver/enums/DropType;
  #570 = Methodref          #483.#571     // java/lang/Math.max:(II)I
  #571 = NameAndType        #547:#572     // max:(II)I
  #572 = Utf8               (II)I
  #573 = String             #574          // 90EE90
  #574 = Utf8               90EE90
  #575 = Double             5.0d
  #577 = String             #578          // BDB76B
  #578 = Utf8               BDB76B
  #579 = String             #580          // F08080
  #580 = Utf8               F08080
  #581 = InvokeDynamic      #7:#307       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #582 = InvokeDynamic      #8:#583       // #8:makeConcatWithConstants:(II)Ljava/lang/String;
  #583 = NameAndType        #308:#584     // makeConcatWithConstants:(II)Ljava/lang/String;
  #584 = Utf8               (II)Ljava/lang/String;
  #585 = Methodref          #586.#587     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #586 = Class              #588          // ext/mods/gameserver/data/xml/ItemData
  #587 = NameAndType        #28:#589      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #588 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #589 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #590 = Methodref          #586.#591     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #591 = NameAndType        #434:#592     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #592 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #593 = Methodref          #594.#401     // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
  #594 = Class              #595          // ext/mods/gameserver/model/item/kind/Item
  #595 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #596 = String             #597          // Recipe:
  #597 = Utf8               Recipe:
  #598 = Methodref          #52.#599      // java/lang/String.startsWith:(Ljava/lang/String;)Z
  #599 = NameAndType        #600:#77      // startsWith:(Ljava/lang/String;)Z
  #600 = Utf8               startsWith
  #601 = Methodref          #52.#602      // java/lang/String.substring:(I)Ljava/lang/String;
  #602 = NameAndType        #603:#309     // substring:(I)Ljava/lang/String;
  #603 = Utf8               substring
  #604 = InvokeDynamic      #9:#605       // #9:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #605 = NameAndType        #308:#606     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #606 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #607 = Methodref          #421.#608     // ext/mods/commons/lang/StringUtil.trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #608 = NameAndType        #609:#610     // trimAndDress:(Ljava/lang/String;I)Ljava/lang/String;
  #609 = Utf8               trimAndDress
  #610 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #611 = String             #612          // <table width=280 bgcolor=000000><tr>
  #612 = Utf8               <table width=280 bgcolor=000000><tr>
  #613 = String             #614          // <table width=280><tr>
  #614 = Utf8               <table width=280><tr>
  #615 = Methodref          #594.#616     // ext/mods/gameserver/model/item/kind/Item.getIcon:()Ljava/lang/String;
  #616 = NameAndType        #617:#17      // getIcon:()Ljava/lang/String;
  #617 = Utf8               getIcon
  #618 = InvokeDynamic      #10:#619      // #10:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #619 = NameAndType        #308:#620     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #620 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #621 = String             #622          // <td width=246>&nbsp;
  #622 = Utf8               <td width=246>&nbsp;
  #623 = String             #624          // <br1>
  #624 = Utf8               <br1>
  #625 = String             #626          // <table width=240><tr><td width=80><font color=B09878>Rate:</font> <font color=
  #626 = Utf8               <table width=240><tr><td width=80><font color=B09878>Rate:</font> <font color=
  #627 = String             #628          // >
  #628 = Utf8               >
  #629 = String             #630          // %</font></td><td width=160><font color=B09878>Amount: </font>
  #630 = Utf8               %</font></td><td width=160><font color=B09878>Amount: </font>
  #631 = String             #632          // </td></tr></table>
  #632 = Utf8               </td></tr></table>
  #633 = String             #634          // </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
  #634 = Utf8               </td></tr></table><img src=L2UI.SquareGray width=280 height=1>
  #635 = Methodref          #454.#636     // ext/mods/commons/data/Pagination.totalEntries:()I
  #636 = NameAndType        #637:#56      // totalEntries:()I
  #637 = Utf8               totalEntries
  #638 = Methodref          #454.#639     // ext/mods/commons/data/Pagination.generateSpace:(I)V
  #639 = NameAndType        #640:#40      // generateSpace:(I)V
  #640 = Utf8               generateSpace
  #641 = InvokeDynamic      #11:#642      // #11:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #642 = NameAndType        #308:#610     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #643 = Methodref          #454.#644     // ext/mods/commons/data/Pagination.generatePages:(Ljava/lang/String;)V
  #644 = NameAndType        #645:#646     // generatePages:(Ljava/lang/String;)V
  #645 = Utf8               generatePages
  #646 = Utf8               (Ljava/lang/String;)V
  #647 = Methodref          #454.#648     // ext/mods/commons/data/Pagination.getContent:()Ljava/lang/String;
  #648 = NameAndType        #649:#17      // getContent:()Ljava/lang/String;
  #649 = Utf8               getContent
  #650 = Methodref          #526.#489     // ext/mods/gameserver/model/item/DropData.getChance:()D
  #651 = InvokeDynamic      #12:#583      // #12:makeConcatWithConstants:(II)Ljava/lang/String;
  #652 = InvokeDynamic      #13:#653      // #13:makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
  #653 = NameAndType        #308:#654     // makeConcatWithConstants:(ILjava/lang/String;I)Ljava/lang/String;
  #654 = Utf8               (ILjava/lang/String;I)Ljava/lang/String;
  #655 = InvokeDynamic      #14:#656      // #14:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #656 = NameAndType        #308:#657     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #657 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #658 = String             #659          // html/mods/npcinfo/skills.htm
  #659 = Utf8               html/mods/npcinfo/skills.htm
  #660 = Methodref          #437.#661     // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:()Ljava/util/Map;
  #661 = NameAndType        #662:#663     // getSkills:()Ljava/util/Map;
  #662 = Utf8               getSkills
  #663 = Utf8               ()Ljava/util/Map;
  #664 = InterfaceMethodref #665.#324     // java/util/Map.isEmpty:()Z
  #665 = Class              #666          // java/util/Map
  #666 = Utf8               java/util/Map
  #667 = String             #668          // This NPC doesn\'t hold any skill.
  #668 = Utf8               This NPC doesn\'t hold any skill.
  #669 = InterfaceMethodref #665.#670     // java/util/Map.entrySet:()Ljava/util/Set;
  #670 = NameAndType        #671:#672     // entrySet:()Ljava/util/Set;
  #671 = Utf8               entrySet
  #672 = Utf8               ()Ljava/util/Set;
  #673 = InterfaceMethodref #674.#378     // java/util/Set.iterator:()Ljava/util/Iterator;
  #674 = Class              #675          // java/util/Set
  #675 = Utf8               java/util/Set
  #676 = Class              #677          // java/util/Map$Entry
  #677 = Utf8               java/util/Map$Entry
  #678 = InterfaceMethodref #676.#679     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #679 = NameAndType        #680:#390     // getKey:()Ljava/lang/Object;
  #680 = Utf8               getKey
  #681 = Class              #682          // ext/mods/gameserver/enums/actors/NpcSkillType
  #682 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #683 = String             #684          // <br><font color=\"LEVEL\">
  #684 = Utf8               <br><font color=\"LEVEL\">
  #685 = Methodref          #681.#686     // ext/mods/gameserver/enums/actors/NpcSkillType.name:()Ljava/lang/String;
  #686 = NameAndType        #687:#17      // name:()Ljava/lang/String;
  #687 = Utf8               name
  #688 = String             #689          // </font><br1>
  #689 = Utf8               </font><br1>
  #690 = InterfaceMethodref #676.#691     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #691 = NameAndType        #692:#390     // getValue:()Ljava/lang/Object;
  #692 = Utf8               getValue
  #693 = Class              #694          // ext/mods/gameserver/skills/L2Skill
  #694 = Utf8               ext/mods/gameserver/skills/L2Skill
  #695 = Methodref          #693.#696     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #696 = NameAndType        #697:#698     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #697 = Utf8               getSkillType
  #698 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #699 = Fieldref           #700.#701     // ext/mods/gameserver/enums/skills/SkillType.NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #700 = Class              #702          // ext/mods/gameserver/enums/skills/SkillType
  #701 = NameAndType        #703:#704     // NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #702 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #703 = Utf8               NOTDONE
  #704 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #705 = Methodref          #693.#401     // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #706 = InvokeDynamic      #15:#605      // #15:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #707 = String             #708          //  [
  #708 = Utf8                [
  #709 = Methodref          #693.#710     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #710 = NameAndType        #711:#56      // getId:()I
  #711 = Utf8               getId
  #712 = Methodref          #19.#713      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #713 = NameAndType        #413:#714     // valueOf:(I)Ljava/lang/Integer;
  #714 = Utf8               (I)Ljava/lang/Integer;
  #715 = String             #716          // -
  #716 = Utf8               -
  #717 = Methodref          #693.#556     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #718 = String             #719          // ]<br1>
  #719 = Utf8               ]<br1>
  #720 = Methodref          #34.#721      // ext/mods/gameserver/model/actor/Npc.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #721 = NameAndType        #722:#723     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #722 = Utf8               getAllEffects
  #723 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #724 = Methodref          #725.#726     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #725 = Class              #727          // java/util/Arrays
  #726 = NameAndType        #344:#728     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #727 = Utf8               java/util/Arrays
  #728 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #729 = String             #730          // html/mods/npcinfo/effects.htm
  #730 = Utf8               html/mods/npcinfo/effects.htm
  #731 = InvokeDynamic      #16:#307      // #16:makeConcatWithConstants:(I)Ljava/lang/String;
  #732 = Methodref          #454.#324     // ext/mods/commons/data/Pagination.isEmpty:()Z
  #733 = String             #734          // This NPC\'s Effects is empty.
  #734 = Utf8               This NPC\'s Effects is empty.
  #735 = String             #736          // <table width=270><tr><td width=220>Effect</td><td width=50>Time Left</td></tr>
  #736 = Utf8               <table width=270><tr><td width=220>Effect</td><td width=50>Time Left</td></tr>
  #737 = Class              #738          // ext/mods/gameserver/skills/AbstractEffect
  #738 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #739 = Methodref          #737.#740     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #740 = NameAndType        #741:#742     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #741 = Utf8               getSkill
  #742 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #743 = Methodref          #693.#744     // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #744 = NameAndType        #745:#44      // isToggle:()Z
  #745 = Utf8               isToggle
  #746 = String             #747          // toggle
  #747 = Utf8               toggle
  #748 = Methodref          #737.#749     // ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
  #749 = NameAndType        #750:#56      // getPeriod:()I
  #750 = Utf8               getPeriod
  #751 = Methodref          #737.#752     // ext/mods/gameserver/skills/AbstractEffect.getTime:()I
  #752 = NameAndType        #753:#56      // getTime:()I
  #753 = Utf8               getTime
  #754 = InvokeDynamic      #17:#307      // #17:makeConcatWithConstants:(I)Ljava/lang/String;
  #755 = String             #756          // </table><br>
  #756 = Utf8               </table><br>
  #757 = String             #758          // <br><img src=\"L2UI.SquareGray\" width=277 height=1><table width=\"100%\" bgcolor=000000><tr>
  #758 = Utf8               <br><img src=\"L2UI.SquareGray\" width=277 height=1><table width=\"100%\" bgcolor=000000><tr>
  #759 = Fieldref           #46.#760      // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.COMMANDS:[Ljava/lang/String;
  #760 = NameAndType        #761:#762     // COMMANDS:[Ljava/lang/String;
  #761 = Utf8               COMMANDS
  #762 = Utf8               [Ljava/lang/String;
  #763 = InterfaceMethodref #377.#324     // java/util/List.isEmpty:()Z
  #764 = InvokeDynamic      #18:#451      // #18:test:()Ljava/util/function/Predicate;
  #765 = InterfaceMethodref #361.#766     // java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
  #766 = NameAndType        #767:#768     // noneMatch:(Ljava/util/function/Predicate;)Z
  #767 = Utf8               noneMatch
  #768 = Utf8               (Ljava/util/function/Predicate;)Z
  #769 = Fieldref           #492.#770     // ext/mods/gameserver/enums/DropType.SPOIL:Lext/mods/gameserver/enums/DropType;
  #770 = NameAndType        #771:#569     // SPOIL:Lext/mods/gameserver/enums/DropType;
  #771 = Utf8               SPOIL
  #772 = String             #773          // user_npc_info
  #773 = Utf8               user_npc_info
  #774 = String             #775          // #.###
  #775 = Utf8               #.###
  #776 = Methodref          #513.#777     // java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
  #777 = NameAndType        #5:#646       // "<init>":(Ljava/lang/String;)V
  #778 = Class              #779          // ext/mods/gameserver/handler/IBypassHandler
  #779 = Utf8               ext/mods/gameserver/handler/IBypassHandler
  #780 = Utf8               PAGE_LIMIT_1
  #781 = Utf8               ConstantValue
  #782 = Integer            1
  #783 = Utf8               PAGE_LIMIT_10
  #784 = Integer            10
  #785 = Utf8               Code
  #786 = Utf8               LineNumberTable
  #787 = Utf8               LocalVariableTable
  #788 = Utf8               this
  #789 = Utf8               Lext/mods/gameserver/handler/bypasshandlers/UserNpcInfo;
  #790 = Utf8               useBypass
  #791 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
  #792 = Utf8               page
  #793 = Utf8               subPage
  #794 = Utf8               e
  #795 = Utf8               Ljava/lang/Exception;
  #796 = Utf8               type
  #797 = Utf8               Ljava/lang/String;
  #798 = Utf8               html
  #799 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #800 = Utf8               objId
  #801 = Utf8               wo
  #802 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #803 = Utf8               command
  #804 = Utf8               player
  #805 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #806 = Utf8               target
  #807 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #808 = Utf8               st
  #809 = Utf8               Ljava/util/StringTokenizer;
  #810 = Utf8               StackMapTable
  #811 = Class              #812          // ext/mods/gameserver/model/WorldObject
  #812 = Utf8               ext/mods/gameserver/model/WorldObject
  #813 = Utf8               npc
  #814 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #815 = Utf8               ai
  #816 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #817 = Utf8               aggroList
  #818 = Utf8               Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #819 = Utf8               sb
  #820 = Utf8               Ljava/lang/StringBuilder;
  #821 = Utf8               chance
  #822 = Utf8               normChance
  #823 = Utf8               overflowFactor
  #824 = Utf8               inverseCategoryChance
  #825 = Utf8               reduceFactor
  #826 = Utf8               levelFactor
  #827 = Utf8               color
  #828 = Utf8               percent
  #829 = Utf8               amount
  #830 = Utf8               item
  #831 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #832 = Utf8               Lext/mods/gameserver/model/item/DropData;
  #833 = Utf8               droplist
  #834 = Utf8               Lext/mods/commons/data/Pagination;
  #835 = Utf8               catChance
  #836 = Utf8               baseCatChance
  #837 = Utf8               chanceMultiplier
  #838 = Utf8               countMultiplier
  #839 = Utf8               category
  #840 = Utf8               Lext/mods/gameserver/model/item/DropCategory;
  #841 = Utf8               isDrop
  #842 = Utf8               row
  #843 = Utf8               filteredCategories
  #844 = Utf8               Ljava/util/List;
  #845 = Utf8               list
  #846 = Utf8               LocalVariableTypeTable
  #847 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/item/DropData;>;
  #848 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/DropCategory;>;
  #849 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/model/item/DropCategory;>;
  #850 = Class              #851          // "[Ljava/lang/Object;"
  #851 = Utf8               [Ljava/lang/Object;
  #852 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #853 = Utf8               entry
  #854 = Utf8               Ljava/util/Map$Entry;
  #855 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #856 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/enums/actors/NpcSkillType;Lext/mods/gameserver/skills/L2Skill;>;
  #857 = Utf8               effect
  #858 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #859 = Utf8               EFFECTS_PER_LIST
  #860 = Utf8               Lext/mods/commons/data/Pagination<Lext/mods/gameserver/skills/AbstractEffect;>;
  #861 = Utf8               getBypassList
  #862 = Utf8               ()[Ljava/lang/String;
  #863 = Utf8               lambda$showNpcInfoDrop$3
  #864 = Utf8               (Lext/mods/gameserver/model/item/DropCategory;)Z
  #865 = Utf8               lambda$showNpcInfoDrop$1
  #866 = Utf8               lambda$showNpcInfoDrop$2
  #867 = Utf8               (Lext/mods/gameserver/model/item/DropData;)Z
  #868 = Utf8               lambda$showNpcInfoDrop$0
  #869 = Utf8               (ZLext/mods/gameserver/model/item/DropCategory;)Z
  #870 = Utf8               <clinit>
  #871 = Utf8               SourceFile
  #872 = Utf8               UserNpcInfo.java
  #873 = Utf8               BootstrapMethods
  #874 = String             #875          // This NPC can\'t build aggro towards targets.<br><button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  #875 = Utf8               This NPC can\'t build aggro towards targets.<br><button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  #876 = String             #877          // This NPC\'s AggroList is empty.<br><button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  #877 = Utf8               This NPC\'s AggroList is empty.<br><button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  #878 = String             #879          // <button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Attacker</font></td><td><font color=\"LEVEL\">Damage</font></td><td><font color=\"LEVEL\">Hate</font></td></tr>
  #879 = Utf8               <button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Attacker</font></td><td><font color=\"LEVEL\">Damage</font></td><td><font color=\"LEVEL\">Hate</font></td></tr>
  #880 = MethodType         #881          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #881 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #882 = MethodHandle       5:#415        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
  #883 = MethodType         #884          //  (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  #884 = Utf8               (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  #885 = MethodType         #62           //  (Ljava/lang/Object;)Z
  #886 = MethodHandle       6:#887        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
  #887 = Methodref          #46.#888      // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
  #888 = NameAndType        #868:#869     // lambda$showNpcInfoDrop$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
  #889 = MethodType         #864          //  (Lext/mods/gameserver/model/item/DropCategory;)Z
  #890 = MethodHandle       6:#891        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #891 = Methodref          #46.#892      // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #892 = NameAndType        #865:#864     // lambda$showNpcInfoDrop$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #893 = MethodHandle       6:#894        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #894 = Methodref          #46.#895      // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #895 = NameAndType        #863:#864     // lambda$showNpcInfoDrop$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
  #896 = String             #897          // \u0001
  #897 = Utf8               \u0001
  #898 = String             #899          // \u0001-\u0001
  #899 = Utf8               \u0001-\u0001
  #900 = String             #901          // R: \u0001
  #901 = Utf8               R: \u0001
  #902 = String             #903          // <td width=44 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=\"-5\"><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  #903 = Utf8               <td width=44 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=\"-5\"><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  #904 = String             #905          // bypass user_npc_info \u0001 \u0001 %page%
  #905 = Utf8               bypass user_npc_info \u0001 \u0001 %page%
  #906 = String             #907          // \u0001 - \u0001
  #907 = Utf8               \u0001 - \u0001
  #908 = String             #909          // bypass user_npc_info \u0001 \u0001 \u0001 %page%
  #909 = Utf8               bypass user_npc_info \u0001 \u0001 \u0001 %page%
  #910 = String             #911          // bypass user_npc_info \u0001 \u0001 %page% 1
  #911 = Utf8               bypass user_npc_info \u0001 \u0001 %page% 1
  #912 = String             #913          // <font color=\"777777\">\u0001</font>
  #913 = Utf8               <font color=\"777777\">\u0001</font>
  #914 = String             #915          // <button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 effects\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  #915 = Utf8               <button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 effects\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  #916 = String             #917          // \u0001s
  #917 = Utf8               \u0001s
  #918 = MethodHandle       6:#919        // REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$2:(Lext/mods/gameserver/model/item/DropData;)Z
  #919 = Methodref          #46.#920      // ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$2:(Lext/mods/gameserver/model/item/DropData;)Z
  #920 = NameAndType        #866:#867     // lambda$showNpcInfoDrop$2:(Lext/mods/gameserver/model/item/DropData;)Z
  #921 = MethodType         #867          //  (Lext/mods/gameserver/model/item/DropData;)Z
  #922 = MethodHandle       6:#923        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #923 = Methodref          #924.#925     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #924 = Class              #926          // java/lang/invoke/StringConcatFactory
  #925 = NameAndType        #308:#927     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #926 = Utf8               java/lang/invoke/StringConcatFactory
  #927 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #928 = MethodHandle       6:#929        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #929 = Methodref          #930.#931     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #930 = Class              #932          // java/lang/invoke/LambdaMetafactory
  #931 = NameAndType        #933:#934     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #932 = Utf8               java/lang/invoke/LambdaMetafactory
  #933 = Utf8               metafactory
  #934 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #935 = Utf8               InnerClasses
  #936 = Utf8               Entry
  #937 = Class              #938          // java/lang/invoke/MethodHandles$Lookup
  #938 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #939 = Class              #940          // java/lang/invoke/MethodHandles
  #940 = Utf8               java/lang/invoke/MethodHandles
  #941 = Utf8               Lookup
{
  public static final int PAGE_LIMIT_1;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int PAGE_LIMIT_10;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 10

  public ext.mods.gameserver.handler.bypasshandlers.UserNpcInfo();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/bypasshandlers/UserNpcInfo;

  public boolean useBypass(java.lang.String, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=13, args_size=4
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: ldc           #9                  // String
         7: invokespecial #11                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;Ljava/lang/String;)V
        10: astore        4
        12: aload         4
        14: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        17: pop
        18: aload         4
        20: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        23: invokestatic  #18                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        26: istore        5
        28: invokestatic  #24                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        31: iload         5
        33: invokevirtual #30                 // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        36: astore        6
        38: aload         6
        40: instanceof    #34                 // class ext/mods/gameserver/model/actor/Npc
        43: ifeq          434
        46: new           #36                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        49: dup
        50: iconst_0
        51: invokespecial #38                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        54: astore        7
        56: aload         4
        58: invokevirtual #41                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        61: ifne          78
        64: aload_2
        65: aload         6
        67: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
        70: aload         7
        72: invokestatic  #45                 // Method showNpcStatsInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
        75: goto          428
        78: aload         4
        80: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        83: astore        8
        85: aload         8
        87: astore        9
        89: iconst_m1
        90: istore        10
        92: aload         9
        94: invokevirtual #51                 // Method java/lang/String.hashCode:()I
        97: lookupswitch  { // 5

             -1833928446: 212

                 2992017: 148

                 3092207: 164

               109496913: 196

               109651541: 180
                 default: 225
            }
       148: aload         9
       150: ldc           #57                 // String aggr
       152: invokevirtual #59                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       155: ifeq          225
       158: iconst_0
       159: istore        10
       161: goto          225
       164: aload         9
       166: ldc           #63                 // String drop
       168: invokevirtual #59                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       171: ifeq          225
       174: iconst_1
       175: istore        10
       177: goto          225
       180: aload         9
       182: ldc           #65                 // String spoil
       184: invokevirtual #59                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       187: ifeq          225
       190: iconst_2
       191: istore        10
       193: goto          225
       196: aload         9
       198: ldc           #67                 // String skill
       200: invokevirtual #59                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       203: ifeq          225
       206: iconst_3
       207: istore        10
       209: goto          225
       212: aload         9
       214: ldc           #69                 // String effects
       216: invokevirtual #59                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       219: ifeq          225
       222: iconst_4
       223: istore        10
       225: iload         10
       227: tableswitch   { // 0 to 4

                       0: 260

                       1: 274

                       2: 274

                       3: 362

                       4: 376
                 default: 428
            }
       260: aload_2
       261: aload         6
       263: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
       266: aload         7
       268: invokestatic  #71                 // Method showAggrInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       271: goto          428
       274: aload         4
       276: invokevirtual #41                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       279: ifeq          293
       282: aload         4
       284: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       287: invokestatic  #18                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       290: goto          294
       293: iconst_1
       294: istore        11
       296: aload         4
       298: invokevirtual #41                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       301: ifeq          315
       304: aload         4
       306: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       309: invokestatic  #18                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       312: goto          316
       315: iconst_1
       316: istore        12
       318: aload_2
       319: aload         6
       321: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
       324: aload         7
       326: iload         11
       328: iload         12
       330: aload         8
       332: ldc           #63                 // String drop
       334: invokevirtual #74                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
       337: invokestatic  #78                 // Method showNpcInfoDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
       340: goto          428
       343: astore        11
       345: aload_2
       346: aload         6
       348: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
       351: aload         7
       353: iconst_1
       354: iconst_1
       355: iconst_1
       356: invokestatic  #78                 // Method showNpcInfoDrop:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;IIZ)V
       359: goto          428
       362: aload_2
       363: aload         6
       365: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
       368: aload         7
       370: invokestatic  #84                 // Method showSkillInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
       373: goto          428
       376: aload         4
       378: invokevirtual #41                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       381: ifeq          395
       384: aload         4
       386: invokevirtual #14                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       389: invokestatic  #18                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       392: goto          396
       395: iconst_1
       396: istore        11
       398: aload_2
       399: aload         6
       401: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
       404: aload         7
       406: iload         11
       408: invokestatic  #87                 // Method showNpcInfoEffects:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
       411: goto          428
       414: astore        11
       416: aload_2
       417: aload         6
       419: checkcast     #34                 // class ext/mods/gameserver/model/actor/Npc
       422: aload         7
       424: iconst_1
       425: invokestatic  #87                 // Method showNpcInfoEffects:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
       428: aload_2
       429: aload         7
       431: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       434: goto          449
       437: astore        5
       439: getstatic     #97                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       442: ldc           #101                // String bypass user_npc_info error
       444: aload         5
       446: invokevirtual #103                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       449: iconst_1
       450: ireturn
      Exception table:
         from    to  target type
           274   340   343   Class java/lang/Exception
           376   411   414   Class java/lang/Exception
            18   434   437   Class java/lang/Exception
      LineNumberTable:
        line 65: 0
        line 66: 12
        line 70: 18
        line 71: 28
        line 72: 38
        line 74: 46
        line 76: 56
        line 77: 64
        line 80: 78
        line 81: 85
        line 84: 260
        line 85: 271
        line 90: 274
        line 91: 296
        line 93: 318
        line 98: 340
        line 95: 343
        line 97: 345
        line 99: 359
        line 102: 362
        line 103: 373
        line 108: 376
        line 109: 398
        line 114: 411
        line 111: 414
        line 113: 416
        line 118: 428
        line 124: 434
        line 121: 437
        line 123: 439
        line 125: 449
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          296      44    11  page   I
          318      22    12 subPage   I
          345      14    11     e   Ljava/lang/Exception;
          398      13    11  page   I
          416      12    11     e   Ljava/lang/Exception;
           85     343     8  type   Ljava/lang/String;
           56     378     7  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           28     406     5 objId   I
           38     396     6    wo   Lext/mods/gameserver/model/WorldObject;
          439      10     5     e   Ljava/lang/Exception;
            0     451     0  this   Lext/mods/gameserver/handler/bypasshandlers/UserNpcInfo;
            0     451     1 command   Ljava/lang/String;
            0     451     2 player   Lext/mods/gameserver/model/actor/Player;
            0     451     3 target   Lext/mods/gameserver/model/actor/Creature;
           12     439     4    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 23
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class java/util/StringTokenizer, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 69
          locals = [ class java/lang/String, class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 34 /* same */
        frame_type = 13 /* same */
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Creature, class java/util/StringTokenizer, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, class java/lang/String, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 18 /* same */
        frame_type = 13 /* same */
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 248 /* chop */
          offset_delta = 13
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 11 /* same */

  public static void showNpcStatsInfos(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.network.serverpackets.NpcHtmlMessage);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_2
         1: aload_0
         2: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
         5: ldc           #113                // String html/mods/npcinfo/stat.htm
         7: invokevirtual #115                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
        10: aload_2
        11: ldc           #119                // String %objid%
        13: aload_1
        14: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
        17: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        20: aload_2
        21: ldc           #128                // String %hp%
        23: aload_1
        24: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
        27: ifeq          45
        30: aload_1
        31: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        34: invokevirtual #137                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
        37: d2i
        38: getstatic     #143                // Field ext/mods/Config.CHAMPION_HP:I
        41: imul
        42: goto          53
        45: aload_1
        46: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        49: invokevirtual #137                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
        52: d2i
        53: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        56: aload_2
        57: ldc           #149                // String %hpmax%
        59: aload_1
        60: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
        63: ifeq          80
        66: aload_1
        67: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        70: invokevirtual #151                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
        73: getstatic     #143                // Field ext/mods/Config.CHAMPION_HP:I
        76: imul
        77: goto          87
        80: aload_1
        81: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        84: invokevirtual #151                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxHp:()I
        87: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
        90: aload_2
        91: ldc           #154                // String %mp%
        93: aload_1
        94: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        97: invokevirtual #156                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
       100: d2i
       101: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       104: aload_2
       105: ldc           #159                // String %mpmax%
       107: aload_1
       108: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       111: invokevirtual #161                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMaxMp:()I
       114: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       117: aload_2
       118: ldc           #164                // String %patk%
       120: aload_1
       121: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       124: ifeq          143
       127: aload_1
       128: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       131: aconst_null
       132: invokevirtual #166                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
       135: i2d
       136: getstatic     #170                // Field ext/mods/Config.CHAMPION_ATK:D
       139: dmul
       140: goto          152
       143: aload_1
       144: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       147: aconst_null
       148: invokevirtual #166                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
       151: i2d
       152: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       155: aload_2
       156: ldc           #177                // String %matk%
       158: aload_1
       159: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       162: ifeq          182
       165: aload_1
       166: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       169: aconst_null
       170: aconst_null
       171: invokevirtual #179                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       174: i2d
       175: getstatic     #183                // Field ext/mods/Config.CHAMPION_MATK:D
       178: dmul
       179: goto          192
       182: aload_1
       183: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       186: aconst_null
       187: aconst_null
       188: invokevirtual #179                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       191: i2d
       192: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       195: aload_2
       196: ldc           #186                // String %pdef%
       198: aload_1
       199: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       202: aconst_null
       203: invokevirtual #188                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPDef:(Lext/mods/gameserver/model/actor/Creature;)I
       206: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       209: aload_2
       210: ldc           #191                // String %mdef%
       212: aload_1
       213: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       216: aconst_null
       217: aconst_null
       218: invokevirtual #193                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMDef:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       221: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       224: aload_2
       225: ldc           #196                // String %accu%
       227: aload_1
       228: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       231: invokevirtual #198                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getAccuracy:()I
       234: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       237: aload_2
       238: ldc           #201                // String %evas%
       240: aload_1
       241: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       244: aconst_null
       245: invokevirtual #203                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
       248: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       251: aload_2
       252: ldc           #206                // String %crit%
       254: aload_1
       255: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       258: aconst_null
       259: aconst_null
       260: invokevirtual #208                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
       263: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       266: aload_2
       267: ldc           #211                // String %rspd%
       269: aload_1
       270: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       273: invokevirtual #213                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMoveSpeed:()F
       276: f2i
       277: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       280: aload_2
       281: ldc           #217                // String %aspd%
       283: aload_1
       284: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       287: ifeq          305
       290: aload_1
       291: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       294: invokevirtual #219                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPAtkSpd:()I
       297: i2d
       298: getstatic     #222                // Field ext/mods/Config.CHAMPION_SPD_ATK:D
       301: dmul
       302: goto          313
       305: aload_1
       306: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       309: invokevirtual #219                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPAtkSpd:()I
       312: i2d
       313: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       316: aload_2
       317: ldc           #225                // String %cspd%
       319: aload_1
       320: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isChampion:()Z
       323: ifeq          341
       326: aload_1
       327: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       330: invokevirtual #227                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMAtkSpd:()I
       333: i2d
       334: getstatic     #230                // Field ext/mods/Config.CHAMPION_SPD_MATK:D
       337: dmul
       338: goto          349
       341: aload_1
       342: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       345: invokevirtual #227                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMAtkSpd:()I
       348: i2d
       349: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       352: aload_2
       353: ldc           #233                // String %str%
       355: aload_1
       356: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       359: invokevirtual #235                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getSTR:()I
       362: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       365: aload_2
       366: ldc           #238                // String %dex%
       368: aload_1
       369: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       372: invokevirtual #240                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDEX:()I
       375: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       378: aload_2
       379: ldc           #243                // String %con%
       381: aload_1
       382: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       385: invokevirtual #245                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getCON:()I
       388: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       391: aload_2
       392: ldc           #248                // String %int%
       394: aload_1
       395: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       398: invokevirtual #250                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getINT:()I
       401: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       404: aload_2
       405: ldc           #253                // String %wit%
       407: aload_1
       408: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       411: invokevirtual #255                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getWIT:()I
       414: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       417: aload_2
       418: ldc_w         #258                // String %men%
       421: aload_1
       422: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       425: invokevirtual #260                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMEN:()I
       428: invokevirtual #124                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       431: aload_2
       432: ldc_w         #263                // String %ele_fire%
       435: aload_1
       436: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       439: getstatic     #265                // Field ext/mods/gameserver/enums/skills/ElementType.FIRE:Lext/mods/gameserver/enums/skills/ElementType;
       442: invokevirtual #271                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
       445: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       448: aload_2
       449: ldc_w         #275                // String %ele_water%
       452: aload_1
       453: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       456: getstatic     #277                // Field ext/mods/gameserver/enums/skills/ElementType.WATER:Lext/mods/gameserver/enums/skills/ElementType;
       459: invokevirtual #271                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
       462: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       465: aload_2
       466: ldc_w         #280                // String %ele_wind%
       469: aload_1
       470: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       473: getstatic     #282                // Field ext/mods/gameserver/enums/skills/ElementType.WIND:Lext/mods/gameserver/enums/skills/ElementType;
       476: invokevirtual #271                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
       479: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       482: aload_2
       483: ldc_w         #285                // String %ele_earth%
       486: aload_1
       487: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       490: getstatic     #287                // Field ext/mods/gameserver/enums/skills/ElementType.EARTH:Lext/mods/gameserver/enums/skills/ElementType;
       493: invokevirtual #271                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
       496: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       499: aload_2
       500: ldc_w         #290                // String %ele_holy%
       503: aload_1
       504: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       507: getstatic     #292                // Field ext/mods/gameserver/enums/skills/ElementType.HOLY:Lext/mods/gameserver/enums/skills/ElementType;
       510: invokevirtual #271                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
       513: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       516: aload_2
       517: ldc_w         #295                // String %ele_dark%
       520: aload_1
       521: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       524: getstatic     #297                // Field ext/mods/gameserver/enums/skills/ElementType.DARK:Lext/mods/gameserver/enums/skills/ElementType;
       527: invokevirtual #271                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getDefenseElementValue:(Lext/mods/gameserver/enums/skills/ElementType;)D
       530: invokevirtual #174                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;D)V
       533: return
      LineNumberTable:
        line 130: 0
        line 132: 10
        line 133: 20
        line 134: 56
        line 135: 90
        line 136: 104
        line 137: 117
        line 138: 155
        line 139: 195
        line 140: 209
        line 141: 224
        line 142: 237
        line 143: 251
        line 144: 266
        line 145: 280
        line 146: 316
        line 147: 352
        line 148: 365
        line 149: 378
        line 150: 391
        line 151: 404
        line 152: 417
        line 153: 431
        line 154: 448
        line 155: 465
        line 156: 482
        line 157: 499
        line 158: 516
        line 159: 533
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     534     0 player   Lext/mods/gameserver/model/actor/Player;
            0     534     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0     534     2  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
          stack = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, double ]

  public java.lang.String[] getBypassList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #759                // Field COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 391: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/bypasshandlers/UserNpcInfo;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #52                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #772                // String user_npc_info
         9: aastore
        10: putstatic     #759                // Field COMMANDS:[Ljava/lang/String;
        13: new           #513                // class java/text/DecimalFormat
        16: dup
        17: ldc_w         #774                // String #.###
        20: invokespecial #776                // Method java/text/DecimalFormat."<init>":(Ljava/lang/String;)V
        23: putstatic     #508                // Field PERCENT:Ljava/text/DecimalFormat;
        26: return
      LineNumberTable:
        line 56: 0
        line 58: 13
}
SourceFile: "UserNpcInfo.java"
BootstrapMethods:
  0: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #874 This NPC can\'t build aggro towards targets.<br><button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  1: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #876 This NPC\'s AggroList is empty.<br><button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  2: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #878 <button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 aggr\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\"><br><table width=\"280\"><tr><td><font color=\"LEVEL\">Attacker</font></td><td><font color=\"LEVEL\">Damage</font></td><td><font color=\"LEVEL\">Hate</font></td></tr>
  3: #928 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #880 (Ljava/lang/Object;)Ljava/lang/Object;
      #882 REF_invokeVirtual ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
      #883 (Lext/mods/gameserver/model/actor/container/npc/AggroInfo;)Ljava/lang/Double;
  4: #928 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #885 (Ljava/lang/Object;)Z
      #886 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$0:(ZLext/mods/gameserver/model/item/DropCategory;)Z
      #889 (Lext/mods/gameserver/model/item/DropCategory;)Z
  5: #928 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #885 (Ljava/lang/Object;)Z
      #890 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$1:(Lext/mods/gameserver/model/item/DropCategory;)Z
      #889 (Lext/mods/gameserver/model/item/DropCategory;)Z
  6: #928 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #885 (Ljava/lang/Object;)Z
      #893 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$3:(Lext/mods/gameserver/model/item/DropCategory;)Z
      #889 (Lext/mods/gameserver/model/item/DropCategory;)Z
  7: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #896 \u0001
  8: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #898 \u0001-\u0001
  9: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #900 R: \u0001
  10: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #902 <td width=44 height=41 align=center><table bgcolor=FFFFFF cellpadding=6 cellspacing=\"-5\"><tr><td><button width=32 height=32 back=\u0001 fore=\u0001></td></tr></table></td>
  11: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #904 bypass user_npc_info \u0001 \u0001 %page%
  12: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #906 \u0001 - \u0001
  13: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #908 bypass user_npc_info \u0001 \u0001 \u0001 %page%
  14: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #910 bypass user_npc_info \u0001 \u0001 %page% 1
  15: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #912 <font color=\"777777\">\u0001</font>
  16: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #914 <button value=\"Refresh\" action=\"bypass -h user_npc_info \u0001 effects\" width=65 height=19 back=\"L2UI_ch3.smallbutton2_over\" fore=\"L2UI_ch3.smallbutton2\">
  17: #922 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #916 \u0001s
  18: #928 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #885 (Ljava/lang/Object;)Z
      #918 REF_invokeStatic ext/mods/gameserver/handler/bypasshandlers/UserNpcInfo.lambda$showNpcInfoDrop$2:(Lext/mods/gameserver/model/item/DropData;)Z
      #921 (Lext/mods/gameserver/model/item/DropData;)Z
InnerClasses:
  public static #936= #676 of #665;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #941= #937 of #939; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
