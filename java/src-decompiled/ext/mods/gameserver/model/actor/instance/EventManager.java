// Bytecode for: ext.mods.gameserver.model.actor.instance.EventManager
// File: ext\mods\gameserver\model\actor\instance\EventManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/EventManager.class
  Last modified 9 de jul de 2026; size 7108 bytes
  MD5 checksum 0c463c154fe5f183e80a4fe34422c17a
  Compiled from "EventManager.java"
public class ext.mods.gameserver.model.actor.instance.EventManager extends ext.mods.gameserver.model.actor.Npc
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #54                         // ext/mods/gameserver/model/actor/instance/EventManager
  super_class: #2                         // ext/mods/gameserver/model/actor/Npc
  interfaces: 0, fields: 4, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Npc
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Npc
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
    #8 = Class              #10           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #10 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #14 = NameAndType        #15:#16       // onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #15 = Utf8               onBypass
   #16 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #18 = Class              #20           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #19 = NameAndType        #11:#21       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #20 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #21 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #22 = Methodref          #18.#14       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #24 = Class              #26           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #25 = NameAndType        #11:#27       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #26 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #27 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #28 = Methodref          #24.#14       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #30 = Class              #32           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #31 = NameAndType        #11:#33       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #32 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #33 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #34 = Methodref          #30.#14       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #35 = Methodref          #18.#36       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
   #36 = NameAndType        #37:#38       // isParticipating:()Z
   #37 = Utf8               isParticipating
   #38 = Utf8               ()Z
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #40 = Class              #42           // ext/mods/gameserver/model/actor/Player
   #41 = NameAndType        #43:#44       // getObjectId:()I
   #42 = Utf8               ext/mods/gameserver/model/actor/Player
   #43 = Utf8               getObjectId
   #44 = Utf8               ()I
   #45 = Methodref          #18.#46       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
   #46 = NameAndType        #47:#48       // isPlayerParticipant:(I)Z
   #47 = Utf8               isPlayerParticipant
   #48 = Utf8               (I)Z
   #49 = Methodref          #50.#51       // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
   #50 = Class              #52           // ext/mods/gameserver/data/HTMLData
   #51 = NameAndType        #11:#53       // getInstance:()Lext/mods/gameserver/data/HTMLData;
   #52 = Utf8               ext/mods/gameserver/data/HTMLData
   #53 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
   #54 = Class              #55           // ext/mods/gameserver/model/actor/instance/EventManager
   #55 = Utf8               ext/mods/gameserver/model/actor/instance/EventManager
   #56 = String             #57           // html/mods/events/tvt/Participation.htm
   #57 = Utf8               html/mods/events/tvt/Participation.htm
   #58 = Methodref          #50.#59       // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #59 = NameAndType        #60:#61       // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #60 = Utf8               getHtm
   #61 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
   #62 = String             #63           // html/mods/events/tvt/RemoveParticipation.htm
   #63 = Utf8               html/mods/events/tvt/RemoveParticipation.htm
   #64 = Methodref          #18.#65       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPlayerCounts:()[I
   #65 = NameAndType        #66:#67       // getTeamsPlayerCounts:()[I
   #66 = Utf8               getTeamsPlayerCounts
   #67 = Utf8               ()[I
   #68 = Class              #69           // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #69 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #70 = Methodref          #54.#41       // ext/mods/gameserver/model/actor/instance/EventManager.getObjectId:()I
   #71 = Methodref          #68.#72       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #72 = NameAndType        #5:#73        // "<init>":(I)V
   #73 = Utf8               (I)V
   #74 = Methodref          #68.#75       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
   #75 = NameAndType        #76:#77       // setHtml:(Ljava/lang/String;)V
   #76 = Utf8               setHtml
   #77 = Utf8               (Ljava/lang/String;)V
   #78 = String             #79           // %objectId%
   #79 = Utf8               %objectId%
   #80 = Methodref          #81.#82       // java/lang/String.valueOf:(I)Ljava/lang/String;
   #81 = Class              #83           // java/lang/String
   #82 = NameAndType        #84:#85       // valueOf:(I)Ljava/lang/String;
   #83 = Utf8               java/lang/String
   #84 = Utf8               valueOf
   #85 = Utf8               (I)Ljava/lang/String;
   #86 = Methodref          #68.#87       // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
   #87 = NameAndType        #88:#89       // replace:(Ljava/lang/String;Ljava/lang/String;)V
   #88 = Utf8               replace
   #89 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #90 = String             #91           // %team1name%
   #91 = Utf8               %team1name%
   #92 = Fieldref           #93.#94       // ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
   #93 = Class              #95           // ext/mods/Config
   #94 = NameAndType        #96:#97       // TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
   #95 = Utf8               ext/mods/Config
   #96 = Utf8               TVT_EVENT_TEAM_1_NAME
   #97 = Utf8               Ljava/lang/String;
   #98 = String             #99           // %team1playercount%
   #99 = Utf8               %team1playercount%
  #100 = String             #101          // %team2name%
  #101 = Utf8               %team2name%
  #102 = Fieldref           #93.#103      // ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #103 = NameAndType        #104:#97      // TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #104 = Utf8               TVT_EVENT_TEAM_2_NAME
  #105 = String             #106          // %team2playercount%
  #106 = Utf8               %team2playercount%
  #107 = String             #108          // %playercount%
  #108 = Utf8               %playercount%
  #109 = String             #110          // %fee%
  #110 = Utf8               %fee%
  #111 = Methodref          #18.#112      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getParticipationFee:()Ljava/lang/String;
  #112 = NameAndType        #113:#114     // getParticipationFee:()Ljava/lang/String;
  #113 = Utf8               getParticipationFee
  #114 = Utf8               ()Ljava/lang/String;
  #115 = Methodref          #40.#116      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #116 = NameAndType        #117:#118     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #117 = Utf8               sendPacket
  #118 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #119 = Methodref          #18.#120      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarting:()Z
  #120 = NameAndType        #121:#38      // isStarting:()Z
  #121 = Utf8               isStarting
  #122 = Methodref          #18.#123      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #123 = NameAndType        #124:#38      // isStarted:()Z
  #124 = Utf8               isStarted
  #125 = String             #126          // html/mods/events/tvt/Status.htm
  #126 = Utf8               html/mods/events/tvt/Status.htm
  #127 = Methodref          #18.#128      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPoints:()[I
  #128 = NameAndType        #129:#67      // getTeamsPoints:()[I
  #129 = Utf8               getTeamsPoints
  #130 = String             #131          // %team1points%
  #131 = Utf8               %team1points%
  #132 = String             #133          // %team2points%
  #133 = Utf8               %team2points%
  #134 = Methodref          #24.#36       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
  #135 = Methodref          #24.#46       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #136 = String             #137          // html/mods/events/dm/Participation.htm
  #137 = Utf8               html/mods/events/dm/Participation.htm
  #138 = String             #139          // html/mods/events/dm/RemoveParticipation.htm
  #139 = Utf8               html/mods/events/dm/RemoveParticipation.htm
  #140 = Methodref          #24.#141      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getPlayerCounts:()I
  #141 = NameAndType        #142:#44      // getPlayerCounts:()I
  #142 = Utf8               getPlayerCounts
  #143 = Methodref          #24.#112      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getParticipationFee:()Ljava/lang/String;
  #144 = Methodref          #24.#120      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarting:()Z
  #145 = Methodref          #24.#123      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #146 = String             #147          // html/mods/events/dm/Status.htm
  #147 = Utf8               html/mods/events/dm/Status.htm
  #148 = Fieldref           #93.#149      // ext/mods/Config.DM_REWARD_FIRST_PLAYERS:I
  #149 = NameAndType        #150:#151     // DM_REWARD_FIRST_PLAYERS:I
  #150 = Utf8               DM_REWARD_FIRST_PLAYERS
  #151 = Utf8               I
  #152 = Methodref          #24.#153      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getFirstPosition:(I)[Ljava/lang/String;
  #153 = NameAndType        #154:#155     // getFirstPosition:(I)[Ljava/lang/String;
  #154 = Utf8               getFirstPosition
  #155 = Utf8               (I)[Ljava/lang/String;
  #156 = String             #157          //
  #157 = Utf8
  #158 = String             #159          // \\,
  #159 = Utf8               \\,
  #160 = Methodref          #81.#161      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #161 = NameAndType        #162:#163     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #162 = Utf8               split
  #163 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #164 = InvokeDynamic      #0:#165       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #165 = NameAndType        #166:#167     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #166 = Utf8               makeConcatWithConstants
  #167 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #168 = String             #169          // %positions%
  #169 = Utf8               %positions%
  #170 = Methodref          #30.#36       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
  #171 = Methodref          #30.#46       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #172 = String             #173          // html/mods/events/lm/Participation.htm
  #173 = Utf8               html/mods/events/lm/Participation.htm
  #174 = String             #175          // html/mods/events/lm/RemoveParticipation.htm
  #175 = Utf8               html/mods/events/lm/RemoveParticipation.htm
  #176 = Methodref          #30.#141      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getPlayerCounts:()I
  #177 = Methodref          #30.#112      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getParticipationFee:()Ljava/lang/String;
  #178 = Methodref          #30.#120      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarting:()Z
  #179 = Methodref          #30.#123      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #180 = String             #181          // html/mods/events/lm/Status.htm
  #181 = Utf8               html/mods/events/lm/Status.htm
  #182 = String             #183          // %countplayer%
  #183 = Utf8               %countplayer%
  #184 = Methodref          #8.#36        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
  #185 = Methodref          #8.#46        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
  #186 = String             #187          // html/mods/events/ctf/Participation.htm
  #187 = Utf8               html/mods/events/ctf/Participation.htm
  #188 = String             #189          // html/mods/events/ctf/RemoveParticipation.htm
  #189 = Utf8               html/mods/events/ctf/RemoveParticipation.htm
  #190 = Methodref          #8.#65        // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPlayerCounts:()[I
  #191 = Fieldref           #93.#192      // ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #192 = NameAndType        #193:#97      // CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #193 = Utf8               CTF_EVENT_TEAM_1_NAME
  #194 = Fieldref           #93.#195      // ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #195 = NameAndType        #196:#97      // CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #196 = Utf8               CTF_EVENT_TEAM_2_NAME
  #197 = Methodref          #8.#112       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipationFee:()Ljava/lang/String;
  #198 = Methodref          #8.#120       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
  #199 = Methodref          #8.#123       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #200 = String             #201          // html/mods/events/ctf/Status.htm
  #201 = Utf8               html/mods/events/ctf/Status.htm
  #202 = Methodref          #8.#128       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPoints:()[I
  #203 = Fieldref           #204.#205     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #204 = Class              #206          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #205 = NameAndType        #207:#208     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #206 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #207 = Utf8               STATIC_PACKET
  #208 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #209 = Utf8               ctfhtmlPath
  #210 = Utf8               ConstantValue
  #211 = String             #212          // html/mods/events/ctf/
  #212 = Utf8               html/mods/events/ctf/
  #213 = Utf8               TvthtmlPath
  #214 = String             #215          // html/mods/events/tvt/
  #215 = Utf8               html/mods/events/tvt/
  #216 = Utf8               dmhtmlPath
  #217 = String             #218          // html/mods/events/dm/
  #218 = Utf8               html/mods/events/dm/
  #219 = Utf8               lmhtmlPath
  #220 = String             #221          // html/mods/events/lm/
  #221 = Utf8               html/mods/events/lm/
  #222 = Utf8               Code
  #223 = Utf8               LineNumberTable
  #224 = Utf8               LocalVariableTable
  #225 = Utf8               this
  #226 = Utf8               Lext/mods/gameserver/model/actor/instance/EventManager;
  #227 = Utf8               objectId
  #228 = Utf8               template
  #229 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #230 = Utf8               onBypassFeedback
  #231 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #232 = Utf8               player
  #233 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #234 = Utf8               command
  #235 = Utf8               showChatWindow
  #236 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #237 = Utf8               htmContent
  #238 = Utf8               teamsPlayerCounts
  #239 = Utf8               [I
  #240 = Utf8               npcHtmlMessage
  #241 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #242 = Utf8               isParticipant
  #243 = Utf8               Z
  #244 = Utf8               teamsPointsCounts
  #245 = Utf8               PlayerCounts
  #246 = Utf8               row
  #247 = Utf8               [Ljava/lang/String;
  #248 = Utf8               i
  #249 = Utf8               firstPositions
  #250 = Utf8               htmltext
  #251 = Utf8               val
  #252 = Utf8               StackMapTable
  #253 = Class              #239          // "[I"
  #254 = Class              #247          // "[Ljava/lang/String;"
  #255 = Utf8               isInvul
  #256 = Utf8               SourceFile
  #257 = Utf8               EventManager.java
  #258 = Utf8               BootstrapMethods
  #259 = String             #260          // \u0001<tr><td></td><td>\u0001</td><td align=\"center\">\u0001</td></tr>
  #260 = Utf8               \u0001<tr><td></td><td>\u0001</td><td align=\"center\">\u0001</td></tr>
  #261 = MethodHandle       6:#262        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #262 = Methodref          #263.#264     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #263 = Class              #265          // java/lang/invoke/StringConcatFactory
  #264 = NameAndType        #166:#266     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #265 = Utf8               java/lang/invoke/StringConcatFactory
  #266 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #267 = Utf8               InnerClasses
  #268 = Class              #269          // java/lang/invoke/MethodHandles$Lookup
  #269 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #270 = Class              #271          // java/lang/invoke/MethodHandles
  #271 = Utf8               java/lang/invoke/MethodHandles
  #272 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.EventManager(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Npc."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: return
      LineNumberTable:
        line 41: 0
        line 42: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/instance/EventManager;
            0       7     1 objectId   I
            0       7     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;

  public void onBypassFeedback(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         3: aload_2
         4: aload_1
         5: invokevirtual #13                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
         8: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        11: aload_2
        12: aload_1
        13: invokevirtual #22                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        16: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        19: aload_2
        20: aload_1
        21: invokevirtual #28                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        24: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        27: aload_2
        28: aload_1
        29: invokevirtual #34                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
        32: return
      LineNumberTable:
        line 47: 0
        line 48: 8
        line 49: 16
        line 50: 24
        line 51: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/instance/EventManager;
            0      33     1 player   Lext/mods/gameserver/model/actor/Player;
            0      33     2 command   Ljava/lang/String;

  public void showChatWindow(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
         8: invokevirtual #35                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
        11: ifeq          194
        14: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        17: aload_1
        18: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        21: invokevirtual #45                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
        24: istore_3
        25: iload_3
        26: ifne          43
        29: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        32: aload_1
        33: ldc           #56                 // String html/mods/events/tvt/Participation.htm
        35: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        38: astore        4
        40: goto          54
        43: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        46: aload_1
        47: ldc           #62                 // String html/mods/events/tvt/RemoveParticipation.htm
        49: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
        52: astore        4
        54: aload         4
        56: ifnull        191
        59: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        62: invokevirtual #64                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPlayerCounts:()[I
        65: astore        5
        67: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
        70: dup
        71: aload_0
        72: invokevirtual #70                 // Method getObjectId:()I
        75: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
        78: astore        6
        80: aload         6
        82: aload         4
        84: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
        87: aload         6
        89: ldc           #78                 // String %objectId%
        91: aload_0
        92: invokevirtual #70                 // Method getObjectId:()I
        95: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
        98: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       101: aload         6
       103: ldc           #90                 // String %team1name%
       105: getstatic     #92                 // Field ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
       108: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       111: aload         6
       113: ldc           #98                 // String %team1playercount%
       115: aload         5
       117: iconst_0
       118: iaload
       119: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       122: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       125: aload         6
       127: ldc           #100                // String %team2name%
       129: getstatic     #102                // Field ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
       132: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       135: aload         6
       137: ldc           #105                // String %team2playercount%
       139: aload         5
       141: iconst_1
       142: iaload
       143: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       146: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       149: aload         6
       151: ldc           #107                // String %playercount%
       153: aload         5
       155: iconst_0
       156: iaload
       157: aload         5
       159: iconst_1
       160: iaload
       161: iadd
       162: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       165: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       168: iload_3
       169: ifne          185
       172: aload         6
       174: ldc           #109                // String %fee%
       176: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       179: invokevirtual #111                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getParticipationFee:()Ljava/lang/String;
       182: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       185: aload_1
       186: aload         6
       188: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       191: goto          1167
       194: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       197: invokevirtual #119                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarting:()Z
       200: ifne          212
       203: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       206: invokevirtual #122                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       209: ifeq          346
       212: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       215: aload_1
       216: ldc           #125                // String html/mods/events/tvt/Status.htm
       218: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       221: astore_3
       222: aload_3
       223: ifnull        343
       226: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       229: invokevirtual #64                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPlayerCounts:()[I
       232: astore        4
       234: invokestatic  #17                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       237: invokevirtual #127                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPoints:()[I
       240: astore        5
       242: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       245: dup
       246: aload_0
       247: invokevirtual #70                 // Method getObjectId:()I
       250: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       253: astore        6
       255: aload         6
       257: aload_3
       258: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       261: aload         6
       263: ldc           #90                 // String %team1name%
       265: getstatic     #92                 // Field ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
       268: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       271: aload         6
       273: ldc           #98                 // String %team1playercount%
       275: aload         4
       277: iconst_0
       278: iaload
       279: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       282: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       285: aload         6
       287: ldc           #130                // String %team1points%
       289: aload         5
       291: iconst_0
       292: iaload
       293: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       296: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       299: aload         6
       301: ldc           #100                // String %team2name%
       303: getstatic     #102                // Field ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
       306: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       309: aload         6
       311: ldc           #105                // String %team2playercount%
       313: aload         4
       315: iconst_1
       316: iaload
       317: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       320: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       323: aload         6
       325: ldc           #132                // String %team2points%
       327: aload         5
       329: iconst_1
       330: iaload
       331: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       334: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       337: aload_1
       338: aload         6
       340: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       343: goto          1167
       346: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       349: invokevirtual #134                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
       352: ifeq          480
       355: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       358: aload_1
       359: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       362: invokevirtual #135                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
       365: istore_3
       366: iload_3
       367: ifne          384
       370: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       373: aload_1
       374: ldc           #136                // String html/mods/events/dm/Participation.htm
       376: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       379: astore        4
       381: goto          395
       384: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       387: aload_1
       388: ldc           #138                // String html/mods/events/dm/RemoveParticipation.htm
       390: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       393: astore        4
       395: aload         4
       397: ifnull        477
       400: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       403: invokevirtual #140                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getPlayerCounts:()I
       406: istore        5
       408: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       411: dup
       412: aload_0
       413: invokevirtual #70                 // Method getObjectId:()I
       416: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       419: astore        6
       421: aload         6
       423: aload         4
       425: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       428: aload         6
       430: ldc           #78                 // String %objectId%
       432: aload_0
       433: invokevirtual #70                 // Method getObjectId:()I
       436: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       439: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       442: aload         6
       444: ldc           #107                // String %playercount%
       446: iload         5
       448: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       451: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       454: iload_3
       455: ifne          471
       458: aload         6
       460: ldc           #109                // String %fee%
       462: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       465: invokevirtual #143                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getParticipationFee:()Ljava/lang/String;
       468: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       471: aload_1
       472: aload         6
       474: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       477: goto          1167
       480: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       483: invokevirtual #144                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarting:()Z
       486: ifne          498
       489: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       492: invokevirtual #145                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       495: ifeq          615
       498: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       501: aload_1
       502: ldc           #146                // String html/mods/events/dm/Status.htm
       504: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       507: astore_3
       508: aload_3
       509: ifnull        612
       512: invokestatic  #23                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       515: getstatic     #148                // Field ext/mods/Config.DM_REWARD_FIRST_PLAYERS:I
       518: invokevirtual #152                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getFirstPosition:(I)[Ljava/lang/String;
       521: astore        4
       523: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       526: dup
       527: aload_0
       528: invokevirtual #70                 // Method getObjectId:()I
       531: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       534: astore        5
       536: ldc           #156                // String
       538: astore        6
       540: aload         4
       542: ifnull        591
       545: iconst_0
       546: istore        7
       548: iload         7
       550: aload         4
       552: arraylength
       553: if_icmpge     591
       556: aload         4
       558: iload         7
       560: aaload
       561: ldc           #158                // String \\,
       563: invokevirtual #160                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
       566: astore        8
       568: aload         6
       570: aload         8
       572: iconst_0
       573: aaload
       574: aload         8
       576: iconst_1
       577: aaload
       578: invokedynamic #164,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       583: astore        6
       585: iinc          7, 1
       588: goto          548
       591: aload         5
       593: aload_3
       594: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       597: aload         5
       599: ldc           #168                // String %positions%
       601: aload         6
       603: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       606: aload_1
       607: aload         5
       609: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       612: goto          1167
       615: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       618: invokevirtual #170                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
       621: ifeq          745
       624: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       627: aload_1
       628: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       631: invokevirtual #171                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
       634: istore_3
       635: iload_3
       636: ifne          653
       639: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       642: aload_1
       643: ldc           #172                // String html/mods/events/lm/Participation.htm
       645: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       648: astore        4
       650: goto          664
       653: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       656: aload_1
       657: ldc           #174                // String html/mods/events/lm/RemoveParticipation.htm
       659: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       662: astore        4
       664: aload         4
       666: ifnull        742
       669: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       672: dup
       673: aload_0
       674: invokevirtual #70                 // Method getObjectId:()I
       677: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       680: astore        5
       682: aload         5
       684: aload         4
       686: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       689: aload         5
       691: ldc           #78                 // String %objectId%
       693: aload_0
       694: invokevirtual #70                 // Method getObjectId:()I
       697: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       700: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       703: aload         5
       705: ldc           #107                // String %playercount%
       707: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       710: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getPlayerCounts:()I
       713: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       716: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       719: iload_3
       720: ifne          736
       723: aload         5
       725: ldc           #109                // String %fee%
       727: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       730: invokevirtual #177                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getParticipationFee:()Ljava/lang/String;
       733: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       736: aload_1
       737: aload         5
       739: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       742: goto          1167
       745: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       748: invokevirtual #178                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarting:()Z
       751: ifne          763
       754: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       757: invokevirtual #179                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       760: ifeq          829
       763: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       766: aload_1
       767: ldc           #180                // String html/mods/events/lm/Status.htm
       769: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       772: astore_3
       773: aload_3
       774: ifnull        826
       777: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       780: dup
       781: aload_0
       782: invokevirtual #70                 // Method getObjectId:()I
       785: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       788: astore        4
       790: ldc           #156                // String
       792: astore        5
       794: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       797: invokevirtual #176                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getPlayerCounts:()I
       800: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       803: astore        5
       805: aload         4
       807: aload_3
       808: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       811: aload         4
       813: ldc           #182                // String %countplayer%
       815: aload         5
       817: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       820: aload_1
       821: aload         4
       823: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       826: goto          1167
       829: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       832: invokevirtual #184                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
       835: ifeq          1018
       838: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       841: aload_1
       842: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       845: invokevirtual #185                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
       848: istore_3
       849: iload_3
       850: ifne          867
       853: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       856: aload_1
       857: ldc           #186                // String html/mods/events/ctf/Participation.htm
       859: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       862: astore        4
       864: goto          878
       867: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       870: aload_1
       871: ldc           #188                // String html/mods/events/ctf/RemoveParticipation.htm
       873: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       876: astore        4
       878: aload         4
       880: ifnull        1015
       883: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       886: invokevirtual #190                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPlayerCounts:()[I
       889: astore        5
       891: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       894: dup
       895: aload_0
       896: invokevirtual #70                 // Method getObjectId:()I
       899: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       902: astore        6
       904: aload         6
       906: aload         4
       908: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       911: aload         6
       913: ldc           #78                 // String %objectId%
       915: aload_0
       916: invokevirtual #70                 // Method getObjectId:()I
       919: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       922: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       925: aload         6
       927: ldc           #90                 // String %team1name%
       929: getstatic     #191                // Field ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
       932: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       935: aload         6
       937: ldc           #98                 // String %team1playercount%
       939: aload         5
       941: iconst_0
       942: iaload
       943: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       946: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       949: aload         6
       951: ldc           #100                // String %team2name%
       953: getstatic     #194                // Field ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
       956: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       959: aload         6
       961: ldc           #105                // String %team2playercount%
       963: aload         5
       965: iconst_1
       966: iaload
       967: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       970: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       973: aload         6
       975: ldc           #107                // String %playercount%
       977: aload         5
       979: iconst_0
       980: iaload
       981: aload         5
       983: iconst_1
       984: iaload
       985: iadd
       986: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       989: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
       992: iload_3
       993: ifne          1009
       996: aload         6
       998: ldc           #109                // String %fee%
      1000: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      1003: invokevirtual #197                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getParticipationFee:()Ljava/lang/String;
      1006: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1009: aload_1
      1010: aload         6
      1012: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1015: goto          1167
      1018: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      1021: invokevirtual #198                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
      1024: ifne          1036
      1027: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      1030: invokevirtual #199                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
      1033: ifeq          1167
      1036: invokestatic  #49                 // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
      1039: aload_1
      1040: ldc           #200                // String html/mods/events/ctf/Status.htm
      1042: invokevirtual #58                 // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
      1045: astore_3
      1046: aload_3
      1047: ifnull        1167
      1050: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      1053: invokevirtual #190                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPlayerCounts:()[I
      1056: astore        4
      1058: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
      1061: invokevirtual #202                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPoints:()[I
      1064: astore        5
      1066: new           #68                 // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
      1069: dup
      1070: aload_0
      1071: invokevirtual #70                 // Method getObjectId:()I
      1074: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
      1077: astore        6
      1079: aload         6
      1081: aload_3
      1082: invokevirtual #74                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
      1085: aload         6
      1087: ldc           #90                 // String %team1name%
      1089: getstatic     #191                // Field ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
      1092: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1095: aload         6
      1097: ldc           #98                 // String %team1playercount%
      1099: aload         4
      1101: iconst_0
      1102: iaload
      1103: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1106: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1109: aload         6
      1111: ldc           #130                // String %team1points%
      1113: aload         5
      1115: iconst_0
      1116: iaload
      1117: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1120: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1123: aload         6
      1125: ldc           #100                // String %team2name%
      1127: getstatic     #194                // Field ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
      1130: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1133: aload         6
      1135: ldc           #105                // String %team2playercount%
      1137: aload         4
      1139: iconst_1
      1140: iaload
      1141: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1144: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1147: aload         6
      1149: ldc           #132                // String %team2points%
      1151: aload         5
      1153: iconst_1
      1154: iaload
      1155: invokestatic  #80                 // Method java/lang/String.valueOf:(I)Ljava/lang/String;
      1158: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
      1161: aload_1
      1162: aload         6
      1164: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1167: aload_1
      1168: getstatic     #203                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
      1171: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1174: return
      LineNumberTable:
        line 56: 0
        line 57: 4
        line 59: 5
        line 61: 14
        line 64: 25
        line 65: 29
        line 67: 43
        line 69: 54
        line 71: 59
        line 72: 67
        line 74: 80
        line 75: 87
        line 76: 101
        line 77: 111
        line 78: 125
        line 79: 135
        line 80: 149
        line 81: 168
        line 82: 172
        line 84: 185
        line 86: 191
        line 87: 194
        line 89: 212
        line 91: 222
        line 93: 226
        line 94: 234
        line 95: 242
        line 97: 255
        line 98: 261
        line 99: 271
        line 100: 285
        line 101: 299
        line 102: 309
        line 103: 323
        line 104: 337
        line 106: 343
        line 107: 346
        line 109: 355
        line 112: 366
        line 113: 370
        line 115: 384
        line 117: 395
        line 119: 400
        line 120: 408
        line 122: 421
        line 123: 428
        line 124: 442
        line 125: 454
        line 126: 458
        line 128: 471
        line 130: 477
        line 131: 480
        line 133: 498
        line 135: 508
        line 137: 512
        line 138: 523
        line 140: 536
        line 141: 540
        line 143: 545
        line 145: 556
        line 146: 568
        line 143: 585
        line 150: 591
        line 151: 597
        line 152: 606
        line 154: 612
        line 155: 615
        line 157: 624
        line 160: 635
        line 161: 639
        line 163: 653
        line 165: 664
        line 167: 669
        line 169: 682
        line 170: 689
        line 171: 703
        line 172: 719
        line 173: 723
        line 175: 736
        line 177: 742
        line 178: 745
        line 180: 763
        line 182: 773
        line 184: 777
        line 185: 790
        line 186: 794
        line 187: 805
        line 188: 811
        line 189: 820
        line 191: 826
        line 192: 829
        line 194: 838
        line 197: 849
        line 198: 853
        line 200: 867
        line 202: 878
        line 204: 883
        line 205: 891
        line 207: 904
        line 208: 911
        line 209: 925
        line 210: 935
        line 211: 949
        line 212: 959
        line 213: 973
        line 214: 992
        line 215: 996
        line 217: 1009
        line 219: 1015
        line 220: 1018
        line 222: 1036
        line 224: 1046
        line 226: 1050
        line 227: 1058
        line 228: 1066
        line 230: 1079
        line 231: 1085
        line 232: 1095
        line 233: 1109
        line 234: 1123
        line 235: 1133
        line 236: 1147
        line 237: 1161
        line 241: 1167
        line 242: 1174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40       3     4 htmContent   Ljava/lang/String;
           67     124     5 teamsPlayerCounts   [I
           80     111     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
           25     166     3 isParticipant   Z
           54     137     4 htmContent   Ljava/lang/String;
          234     109     4 teamsPlayerCounts   [I
          242     101     5 teamsPointsCounts   [I
          255      88     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          222     121     3 htmContent   Ljava/lang/String;
          381       3     4 htmContent   Ljava/lang/String;
          408      69     5 PlayerCounts   I
          421      56     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          366     111     3 isParticipant   Z
          395      82     4 htmContent   Ljava/lang/String;
          568      17     8   row   [Ljava/lang/String;
          548      43     7     i   I
          523      89     4 firstPositions   [Ljava/lang/String;
          536      76     5 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          540      72     6 htmltext   Ljava/lang/String;
          508     104     3 htmContent   Ljava/lang/String;
          650       3     4 htmContent   Ljava/lang/String;
          682      60     5 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          635     107     3 isParticipant   Z
          664      78     4 htmContent   Ljava/lang/String;
          790      36     4 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          794      32     5 htmltext   Ljava/lang/String;
          773      53     3 htmContent   Ljava/lang/String;
          864       3     4 htmContent   Ljava/lang/String;
          891     124     5 teamsPlayerCounts   [I
          904     111     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          849     166     3 isParticipant   Z
          878     137     4 htmContent   Ljava/lang/String;
         1058     109     4 teamsPlayerCounts   [I
         1066     101     5 teamsPointsCounts   [I
         1079      88     6 npcHtmlMessage   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
         1046     121     3 htmContent   Ljava/lang/String;
            0    1175     0  this   Lext/mods/gameserver/model/actor/instance/EventManager;
            0    1175     1 player   Lext/mods/gameserver/model/actor/Player;
            0    1175     2   val   I
      StackMapTable: number_of_entries = 34
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 130
          locals = [ class "[I", class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/instance/EventManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 17 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 130
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 75
          locals = [ int, class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/instance/EventManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/actor/instance/EventManager, class ext/mods/gameserver/model/actor/Player, int, class java/lang/String, class "[Ljava/lang/String;", class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage, class java/lang/String, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 42
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/instance/EventManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 17 /* same */
        frame_type = 62 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 130
          locals = [ class "[I", class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/instance/EventManager, class ext/mods/gameserver/model/actor/Player, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 17 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 130

  public boolean isInvul();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 247: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/EventManager;
}
SourceFile: "EventManager.java"
BootstrapMethods:
  0: #261 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #259 \u0001<tr><td></td><td>\u0001</td><td align=\"center\">\u0001</td></tr>
InnerClasses:
  public static final #272= #268 of #270; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
