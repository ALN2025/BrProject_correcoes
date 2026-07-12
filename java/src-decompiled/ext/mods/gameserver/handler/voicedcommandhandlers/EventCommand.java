// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.EventCommand
// File: ext\mods\gameserver\handler\voicedcommandhandlers\EventCommand.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand.class
  Last modified 9 de jul de 2026; size 7066 bytes
  MD5 checksum 8a1538c3cb62161e7c694d7be0ea2f88
  Compiled from "EventCommand.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.EventCommand implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #43                         // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 8, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // ctfinfo
    #8 = Utf8               ctfinfo
    #9 = Methodref          #10.#11       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #10 = Class              #12           // java/lang/String
   #11 = NameAndType        #13:#14       // equals:(Ljava/lang/Object;)Z
   #12 = Utf8               java/lang/String
   #13 = Utf8               equals
   #14 = Utf8               (Ljava/lang/Object;)Z
   #15 = String             #16           // ctfjoin
   #16 = Utf8               ctfjoin
   #17 = String             #18           // ctfleave
   #18 = Utf8               ctfleave
   #19 = Fieldref           #20.#21       // ext/mods/Config.CTF_EVENT_ENABLED:Z
   #20 = Class              #22           // ext/mods/Config
   #21 = NameAndType        #23:#24       // CTF_EVENT_ENABLED:Z
   #22 = Utf8               ext/mods/Config
   #23 = Utf8               CTF_EVENT_ENABLED
   #24 = Utf8               Z
   #25 = Methodref          #10.#26       // java/lang/String.hashCode:()I
   #26 = NameAndType        #27:#28       // hashCode:()I
   #27 = Utf8               hashCode
   #28 = Utf8               ()I
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #30 = Class              #32           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #31 = NameAndType        #33:#34       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #32 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #33 = Utf8               getInstance
   #34 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #35 = Methodref          #30.#36       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
   #36 = NameAndType        #37:#38       // isStarting:()Z
   #37 = Utf8               isStarting
   #38 = Utf8               ()Z
   #39 = Methodref          #30.#40       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #40 = NameAndType        #41:#38       // isStarted:()Z
   #41 = Utf8               isStarted
   #42 = Methodref          #43.#44       // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand.showCTFStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
   #43 = Class              #45           // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand
   #44 = NameAndType        #46:#47       // showCTFStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
   #45 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand
   #46 = Utf8               showCTFStatusPage
   #47 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #49 = Class              #51           // ext/mods/gameserver/model/actor/Player
   #50 = NameAndType        #52:#53       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #51 = Utf8               ext/mods/gameserver/model/actor/Player
   #52 = Utf8               getSysString
   #53 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #54 = Methodref          #49.#55       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #55 = NameAndType        #56:#57       // sendMessage:(Ljava/lang/String;)V
   #56 = Utf8               sendMessage
   #57 = Utf8               (Ljava/lang/String;)V
   #58 = Methodref          #49.#59       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #59 = NameAndType        #60:#28       // getObjectId:()I
   #60 = Utf8               getObjectId
   #61 = Methodref          #30.#62       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
   #62 = NameAndType        #63:#64       // isPlayerParticipant:(I)Z
   #63 = Utf8               isPlayerParticipant
   #64 = Utf8               (I)Z
   #65 = String             #66           // ctf_event_participation
   #66 = Utf8               ctf_event_participation
   #67 = Methodref          #30.#68       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #68 = NameAndType        #69:#70       // onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #69 = Utf8               onBypass
   #70 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #71 = String             #72           // ctf_event_remove_participation
   #72 = Utf8               ctf_event_remove_participation
   #73 = String             #74           // dminfo
   #74 = Utf8               dminfo
   #75 = String             #76           // dmjoin
   #76 = Utf8               dmjoin
   #77 = String             #78           // dmleave
   #78 = Utf8               dmleave
   #79 = Fieldref           #20.#80       // ext/mods/Config.DM_EVENT_ENABLED:Z
   #80 = NameAndType        #81:#24       // DM_EVENT_ENABLED:Z
   #81 = Utf8               DM_EVENT_ENABLED
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #83 = Class              #85           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #84 = NameAndType        #33:#86       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #85 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #86 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #87 = Methodref          #83.#36       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarting:()Z
   #88 = Methodref          #83.#40       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
   #89 = Methodref          #43.#90       // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand.showDMStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
   #90 = NameAndType        #91:#47       // showDMStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
   #91 = Utf8               showDMStatusPage
   #92 = Methodref          #83.#93       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #93 = NameAndType        #63:#94       // isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #95 = String             #96           // dm_event_participation
   #96 = Utf8               dm_event_participation
   #97 = Methodref          #83.#68       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
   #98 = String             #99           // dm_event_remove_participation
   #99 = Utf8               dm_event_remove_participation
  #100 = String             #101          // lminfo
  #101 = Utf8               lminfo
  #102 = String             #103          // lmjoin
  #103 = Utf8               lmjoin
  #104 = String             #105          // lmleave
  #105 = Utf8               lmleave
  #106 = Fieldref           #20.#107      // ext/mods/Config.LM_EVENT_ENABLED:Z
  #107 = NameAndType        #108:#24      // LM_EVENT_ENABLED:Z
  #108 = Utf8               LM_EVENT_ENABLED
  #109 = Methodref          #110.#111     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #110 = Class              #112          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #111 = NameAndType        #33:#113      // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #112 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #113 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #114 = Methodref          #110.#36      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarting:()Z
  #115 = Methodref          #110.#40      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #116 = Methodref          #43.#117      // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand.showLMStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
  #117 = NameAndType        #118:#47      // showLMStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
  #118 = Utf8               showLMStatusPage
  #119 = Methodref          #110.#93      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #120 = String             #121          // lm_event_participation
  #121 = Utf8               lm_event_participation
  #122 = Methodref          #110.#68      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #123 = String             #124          // lm_event_remove_participation
  #124 = Utf8               lm_event_remove_participation
  #125 = String             #126          // tvtinfo
  #126 = Utf8               tvtinfo
  #127 = String             #128          // tvtjoin
  #128 = Utf8               tvtjoin
  #129 = String             #130          // tvtleave
  #130 = Utf8               tvtleave
  #131 = Fieldref           #20.#132      // ext/mods/Config.TVT_EVENT_ENABLED:Z
  #132 = NameAndType        #133:#24      // TVT_EVENT_ENABLED:Z
  #133 = Utf8               TVT_EVENT_ENABLED
  #134 = Methodref          #135.#136     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #135 = Class              #137          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #136 = NameAndType        #33:#138      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #137 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #138 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #139 = Methodref          #135.#36      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarting:()Z
  #140 = Methodref          #135.#40      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #141 = Methodref          #43.#142      // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand.showTvTStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
  #142 = NameAndType        #143:#47      // showTvTStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
  #143 = Utf8               showTvTStatusPage
  #144 = Methodref          #135.#62      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #145 = String             #146          // tvt_event_participation
  #146 = Utf8               tvt_event_participation
  #147 = Methodref          #135.#68      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #148 = String             #149          // tvt_event_remove_participation
  #149 = Utf8               tvt_event_remove_participation
  #150 = Class              #151          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #151 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #152 = Methodref          #150.#153     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #153 = NameAndType        #5:#154       // "<init>":(I)V
  #154 = Utf8               (I)V
  #155 = Methodref          #49.#156      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #156 = NameAndType        #157:#158     // getLocale:()Ljava/util/Locale;
  #157 = Utf8               getLocale
  #158 = Utf8               ()Ljava/util/Locale;
  #159 = String             #160          // html/mods/events/ctf/Status.htm
  #160 = Utf8               html/mods/events/ctf/Status.htm
  #161 = Methodref          #150.#162     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #162 = NameAndType        #163:#164     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #163 = Utf8               setFile
  #164 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #165 = String             #166          // %team1name%
  #166 = Utf8               %team1name%
  #167 = Fieldref           #20.#168      // ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #168 = NameAndType        #169:#170     // CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #169 = Utf8               CTF_EVENT_TEAM_1_NAME
  #170 = Utf8               Ljava/lang/String;
  #171 = Methodref          #150.#172     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;Ljava/lang/String;)V
  #172 = NameAndType        #173:#174     // replace:(Ljava/lang/String;Ljava/lang/String;)V
  #173 = Utf8               replace
  #174 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #175 = String             #176          // %team1playercount%
  #176 = Utf8               %team1playercount%
  #177 = Methodref          #30.#178      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPlayerCounts:()[I
  #178 = NameAndType        #179:#180     // getTeamsPlayerCounts:()[I
  #179 = Utf8               getTeamsPlayerCounts
  #180 = Utf8               ()[I
  #181 = Methodref          #10.#182      // java/lang/String.valueOf:(I)Ljava/lang/String;
  #182 = NameAndType        #183:#184     // valueOf:(I)Ljava/lang/String;
  #183 = Utf8               valueOf
  #184 = Utf8               (I)Ljava/lang/String;
  #185 = String             #186          // %team1points%
  #186 = Utf8               %team1points%
  #187 = Methodref          #30.#188      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getTeamsPoints:()[I
  #188 = NameAndType        #189:#180     // getTeamsPoints:()[I
  #189 = Utf8               getTeamsPoints
  #190 = String             #191          // %team2name%
  #191 = Utf8               %team2name%
  #192 = Fieldref           #20.#193      // ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #193 = NameAndType        #194:#170     // CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #194 = Utf8               CTF_EVENT_TEAM_2_NAME
  #195 = String             #196          // %team2playercount%
  #196 = Utf8               %team2playercount%
  #197 = String             #198          // %team2points%
  #198 = Utf8               %team2points%
  #199 = Methodref          #49.#200      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #200 = NameAndType        #201:#202     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #201 = Utf8               sendPacket
  #202 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #203 = Fieldref           #20.#204      // ext/mods/Config.DM_REWARD_FIRST_PLAYERS:I
  #204 = NameAndType        #205:#206     // DM_REWARD_FIRST_PLAYERS:I
  #205 = Utf8               DM_REWARD_FIRST_PLAYERS
  #206 = Utf8               I
  #207 = Methodref          #83.#208      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getFirstPosition:(I)[Ljava/lang/String;
  #208 = NameAndType        #209:#210     // getFirstPosition:(I)[Ljava/lang/String;
  #209 = Utf8               getFirstPosition
  #210 = Utf8               (I)[Ljava/lang/String;
  #211 = String             #212          // html/mods/events/dm/Status.htm
  #212 = Utf8               html/mods/events/dm/Status.htm
  #213 = String             #214          //
  #214 = Utf8
  #215 = String             #216          // \\,
  #216 = Utf8               \\,
  #217 = Methodref          #10.#218      // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
  #218 = NameAndType        #219:#220     // split:(Ljava/lang/String;)[Ljava/lang/String;
  #219 = Utf8               split
  #220 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
  #221 = InvokeDynamic      #0:#222       // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #222 = NameAndType        #223:#224     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #223 = Utf8               makeConcatWithConstants
  #224 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #225 = String             #226          // %positions%
  #226 = Utf8               %positions%
  #227 = String             #228          // html/mods/events/lm/Status.htm
  #228 = Utf8               html/mods/events/lm/Status.htm
  #229 = Methodref          #110.#230     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getPlayerCounts:()I
  #230 = NameAndType        #231:#28      // getPlayerCounts:()I
  #231 = Utf8               getPlayerCounts
  #232 = String             #233          // %countplayer%
  #233 = Utf8               %countplayer%
  #234 = String             #235          // html/mods/events/tvt/Status.htm
  #235 = Utf8               html/mods/events/tvt/Status.htm
  #236 = Fieldref           #20.#237      // ext/mods/Config.TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #237 = NameAndType        #238:#170     // TVT_EVENT_TEAM_1_NAME:Ljava/lang/String;
  #238 = Utf8               TVT_EVENT_TEAM_1_NAME
  #239 = Methodref          #135.#178     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPlayerCounts:()[I
  #240 = Methodref          #135.#188     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getTeamsPoints:()[I
  #241 = Fieldref           #20.#242      // ext/mods/Config.TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #242 = NameAndType        #243:#170     // TVT_EVENT_TEAM_2_NAME:Ljava/lang/String;
  #243 = Utf8               TVT_EVENT_TEAM_2_NAME
  #244 = Fieldref           #43.#245      // ext/mods/gameserver/handler/voicedcommandhandlers/EventCommand.VOICED_COMMANDS:[Ljava/lang/String;
  #245 = NameAndType        #246:#247     // VOICED_COMMANDS:[Ljava/lang/String;
  #246 = Utf8               VOICED_COMMANDS
  #247 = Utf8               [Ljava/lang/String;
  #248 = Class              #249          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #249 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #250 = Utf8               Code
  #251 = Utf8               LineNumberTable
  #252 = Utf8               LocalVariableTable
  #253 = Utf8               this
  #254 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/EventCommand;
  #255 = Utf8               useVoicedCommand
  #256 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #257 = Utf8               command
  #258 = Utf8               player
  #259 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #260 = Utf8               target
  #261 = Utf8               StackMapTable
  #262 = Utf8               html
  #263 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #264 = Utf8               row
  #265 = Utf8               i
  #266 = Utf8               firstPositions
  #267 = Utf8               htmltext
  #268 = Class              #247          // "[Ljava/lang/String;"
  #269 = Utf8               getVoicedCommandList
  #270 = Utf8               ()[Ljava/lang/String;
  #271 = Utf8               <clinit>
  #272 = Utf8               SourceFile
  #273 = Utf8               EventCommand.java
  #274 = Utf8               BootstrapMethods
  #275 = String             #276          // \u0001<tr><td>\u0001</td><td width=\"100\" align=\"center\">\u0001</td></tr>
  #276 = Utf8               \u0001<tr><td>\u0001</td><td width=\"100\" align=\"center\">\u0001</td></tr>
  #277 = MethodHandle       6:#278        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #278 = Methodref          #279.#280     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #279 = Class              #281          // java/lang/invoke/StringConcatFactory
  #280 = NameAndType        #223:#282     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #281 = Utf8               java/lang/invoke/StringConcatFactory
  #282 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #283 = Utf8               InnerClasses
  #284 = Class              #285          // java/lang/invoke/MethodHandles$Lookup
  #285 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #286 = Class              #287          // java/lang/invoke/MethodHandles
  #287 = Utf8               java/lang/invoke/MethodHandles
  #288 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.EventCommand();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/EventCommand;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_1
         1: ldc           #7                  // String ctfinfo
         3: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         6: ifne          27
         9: aload_1
        10: ldc           #15                 // String ctfjoin
        12: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        15: ifne          27
        18: aload_1
        19: ldc           #17                 // String ctfleave
        21: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        24: ifeq          298
        27: getstatic     #19                 // Field ext/mods/Config.CTF_EVENT_ENABLED:Z
        30: ifeq          281
        33: aload_1
        34: astore        4
        36: iconst_m1
        37: istore        5
        39: aload         4
        41: invokevirtual #25                 // Method java/lang/String.hashCode:()I
        44: lookupswitch  { // 3

              -661204542: 112

              1086968899: 80

              1086999743: 96
                 default: 125
            }
        80: aload         4
        82: ldc           #7                  // String ctfinfo
        84: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        87: ifeq          125
        90: iconst_0
        91: istore        5
        93: goto          125
        96: aload         4
        98: ldc           #15                 // String ctfjoin
       100: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       103: ifeq          125
       106: iconst_1
       107: istore        5
       109: goto          125
       112: aload         4
       114: ldc           #17                 // String ctfleave
       116: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       119: ifeq          125
       122: iconst_2
       123: istore        5
       125: iload         5
       127: tableswitch   { // 0 to 2

                       0: 152

                       1: 195

                       2: 238
                 default: 278
            }
       152: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       155: invokevirtual #35                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarting:()Z
       158: ifne          170
       161: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       164: invokevirtual #39                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       167: ifeq          177
       170: aload_0
       171: aload_2
       172: invokevirtual #42                 // Method showCTFStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
       175: iconst_1
       176: ireturn
       177: aload_2
       178: aload_2
       179: sipush        10048
       182: iconst_0
       183: anewarray     #2                  // class java/lang/Object
       186: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       189: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       192: goto          278
       195: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       198: aload_2
       199: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       202: invokevirtual #61                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
       205: ifne          220
       208: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       211: ldc           #65                 // String ctf_event_participation
       213: aload_2
       214: invokevirtual #67                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       217: goto          278
       220: aload_2
       221: aload_2
       222: sipush        10049
       225: iconst_0
       226: anewarray     #2                  // class java/lang/Object
       229: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       232: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       235: goto          278
       238: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       241: aload_2
       242: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       245: invokevirtual #61                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
       248: ifeq          263
       251: invokestatic  #29                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       254: ldc           #71                 // String ctf_event_remove_participation
       256: aload_2
       257: invokevirtual #67                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       260: goto          278
       263: aload_2
       264: aload_2
       265: sipush        10050
       268: iconst_0
       269: anewarray     #2                  // class java/lang/Object
       272: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       275: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       278: goto          296
       281: aload_2
       282: aload_2
       283: sipush        10200
       286: iconst_0
       287: anewarray     #2                  // class java/lang/Object
       290: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       293: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       296: iconst_1
       297: ireturn
       298: aload_1
       299: ldc           #73                 // String dminfo
       301: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       304: ifne          325
       307: aload_1
       308: ldc           #75                 // String dmjoin
       310: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       313: ifne          325
       316: aload_1
       317: ldc           #77                 // String dmleave
       319: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       322: ifeq          588
       325: getstatic     #79                 // Field ext/mods/Config.DM_EVENT_ENABLED:Z
       328: ifeq          571
       331: aload_1
       332: astore        4
       334: iconst_m1
       335: istore        5
       337: aload         4
       339: invokevirtual #25                 // Method java/lang/String.hashCode:()I
       342: lookupswitch  { // 3

             -1328151369: 376

             -1328120525: 392

              1779478478: 408
                 default: 421
            }
       376: aload         4
       378: ldc           #73                 // String dminfo
       380: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       383: ifeq          421
       386: iconst_0
       387: istore        5
       389: goto          421
       392: aload         4
       394: ldc           #75                 // String dmjoin
       396: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       399: ifeq          421
       402: iconst_1
       403: istore        5
       405: goto          421
       408: aload         4
       410: ldc           #77                 // String dmleave
       412: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       415: ifeq          421
       418: iconst_2
       419: istore        5
       421: iload         5
       423: tableswitch   { // 0 to 2

                       0: 448

                       1: 491

                       2: 531
                 default: 568
            }
       448: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       451: invokevirtual #87                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarting:()Z
       454: ifne          466
       457: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       460: invokevirtual #88                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       463: ifeq          473
       466: aload_0
       467: aload_2
       468: invokevirtual #89                 // Method showDMStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
       471: iconst_1
       472: ireturn
       473: aload_2
       474: aload_2
       475: sipush        10051
       478: iconst_0
       479: anewarray     #2                  // class java/lang/Object
       482: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       485: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       488: goto          568
       491: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       494: aload_2
       495: invokevirtual #92                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       498: ifne          513
       501: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       504: ldc           #95                 // String dm_event_participation
       506: aload_2
       507: invokevirtual #97                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       510: goto          568
       513: aload_2
       514: aload_2
       515: sipush        10052
       518: iconst_0
       519: anewarray     #2                  // class java/lang/Object
       522: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       525: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       528: goto          568
       531: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       534: aload_2
       535: invokevirtual #92                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       538: ifeq          553
       541: invokestatic  #82                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       544: ldc           #98                 // String dm_event_remove_participation
       546: aload_2
       547: invokevirtual #97                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       550: goto          568
       553: aload_2
       554: aload_2
       555: sipush        10053
       558: iconst_0
       559: anewarray     #2                  // class java/lang/Object
       562: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       565: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       568: goto          586
       571: aload_2
       572: aload_2
       573: sipush        10201
       576: iconst_0
       577: anewarray     #2                  // class java/lang/Object
       580: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       583: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       586: iconst_1
       587: ireturn
       588: aload_1
       589: ldc           #100                // String lminfo
       591: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       594: ifne          615
       597: aload_1
       598: ldc           #102                // String lmjoin
       600: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       603: ifne          615
       606: aload_1
       607: ldc           #104                // String lmleave
       609: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       612: ifeq          880
       615: getstatic     #106                // Field ext/mods/Config.LM_EVENT_ENABLED:Z
       618: ifeq          863
       621: aload_1
       622: astore        4
       624: iconst_m1
       625: istore        5
       627: aload         4
       629: invokevirtual #25                 // Method java/lang/String.hashCode:()I
       632: lookupswitch  { // 3

             -1099118161: 668

             -1099087317: 684

               289573334: 700
                 default: 713
            }
       668: aload         4
       670: ldc           #100                // String lminfo
       672: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       675: ifeq          713
       678: iconst_0
       679: istore        5
       681: goto          713
       684: aload         4
       686: ldc           #102                // String lmjoin
       688: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       691: ifeq          713
       694: iconst_1
       695: istore        5
       697: goto          713
       700: aload         4
       702: ldc           #104                // String lmleave
       704: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       707: ifeq          713
       710: iconst_2
       711: istore        5
       713: iload         5
       715: tableswitch   { // 0 to 2

                       0: 740

                       1: 783

                       2: 823
                 default: 860
            }
       740: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       743: invokevirtual #114                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarting:()Z
       746: ifne          758
       749: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       752: invokevirtual #115                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       755: ifeq          765
       758: aload_0
       759: aload_2
       760: invokevirtual #116                // Method showLMStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
       763: iconst_1
       764: ireturn
       765: aload_2
       766: aload_2
       767: sipush        10054
       770: iconst_0
       771: anewarray     #2                  // class java/lang/Object
       774: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       777: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       780: goto          860
       783: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       786: aload_2
       787: invokevirtual #119                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       790: ifne          805
       793: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       796: ldc           #120                // String lm_event_participation
       798: aload_2
       799: invokevirtual #122                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       802: goto          860
       805: aload_2
       806: aload_2
       807: sipush        10055
       810: iconst_0
       811: anewarray     #2                  // class java/lang/Object
       814: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       817: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       820: goto          860
       823: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       826: aload_2
       827: invokevirtual #119                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       830: ifeq          845
       833: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       836: ldc           #123                // String lm_event_remove_participation
       838: aload_2
       839: invokevirtual #122                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
       842: goto          860
       845: aload_2
       846: aload_2
       847: sipush        10056
       850: iconst_0
       851: anewarray     #2                  // class java/lang/Object
       854: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       857: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       860: goto          878
       863: aload_2
       864: aload_2
       865: sipush        10200
       868: iconst_0
       869: anewarray     #2                  // class java/lang/Object
       872: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       875: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       878: iconst_1
       879: ireturn
       880: aload_1
       881: ldc           #125                // String tvtinfo
       883: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       886: ifne          907
       889: aload_1
       890: ldc           #127                // String tvtjoin
       892: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       895: ifne          907
       898: aload_1
       899: ldc           #129                // String tvtleave
       901: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       904: ifeq          1178
       907: getstatic     #131                // Field ext/mods/Config.TVT_EVENT_ENABLED:Z
       910: ifeq          1161
       913: aload_1
       914: astore        4
       916: iconst_m1
       917: istore        5
       919: aload         4
       921: invokevirtual #25                 // Method java/lang/String.hashCode:()I
       924: lookupswitch  { // 3

              -935150112: 960

              -935119268: 976

              1077615557: 992
                 default: 1005
            }
       960: aload         4
       962: ldc           #125                // String tvtinfo
       964: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       967: ifeq          1005
       970: iconst_0
       971: istore        5
       973: goto          1005
       976: aload         4
       978: ldc           #127                // String tvtjoin
       980: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       983: ifeq          1005
       986: iconst_1
       987: istore        5
       989: goto          1005
       992: aload         4
       994: ldc           #129                // String tvtleave
       996: invokevirtual #9                  // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       999: ifeq          1005
      1002: iconst_2
      1003: istore        5
      1005: iload         5
      1007: tableswitch   { // 0 to 2

                       0: 1032

                       1: 1075

                       2: 1118
                 default: 1158
            }
      1032: invokestatic  #134                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1035: invokevirtual #139                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarting:()Z
      1038: ifne          1050
      1041: invokestatic  #134                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1044: invokevirtual #140                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
      1047: ifeq          1057
      1050: aload_0
      1051: aload_2
      1052: invokevirtual #141                // Method showTvTStatusPage:(Lext/mods/gameserver/model/actor/Player;)V
      1055: iconst_1
      1056: ireturn
      1057: aload_2
      1058: aload_2
      1059: sipush        10057
      1062: iconst_0
      1063: anewarray     #2                  // class java/lang/Object
      1066: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1069: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1072: goto          1158
      1075: invokestatic  #134                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1078: aload_2
      1079: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1082: invokevirtual #144                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
      1085: ifne          1100
      1088: invokestatic  #134                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1091: ldc           #145                // String tvt_event_participation
      1093: aload_2
      1094: invokevirtual #147                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
      1097: goto          1158
      1100: aload_2
      1101: aload_2
      1102: sipush        10058
      1105: iconst_0
      1106: anewarray     #2                  // class java/lang/Object
      1109: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1112: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1115: goto          1158
      1118: invokestatic  #134                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1121: aload_2
      1122: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1125: invokevirtual #144                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
      1128: ifeq          1143
      1131: invokestatic  #134                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
      1134: ldc           #148                // String tvt_event_remove_participation
      1136: aload_2
      1137: invokevirtual #147                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onBypass:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
      1140: goto          1158
      1143: aload_2
      1144: aload_2
      1145: sipush        10059
      1148: iconst_0
      1149: anewarray     #2                  // class java/lang/Object
      1152: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1155: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1158: goto          1176
      1161: aload_2
      1162: aload_2
      1163: sipush        10200
      1166: iconst_0
      1167: anewarray     #2                  // class java/lang/Object
      1170: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
      1173: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
      1176: iconst_1
      1177: ireturn
      1178: iconst_0
      1179: ireturn
      LineNumberTable:
        line 50: 0
        line 52: 27
        line 54: 33
        line 57: 152
        line 59: 170
        line 60: 175
        line 62: 177
        line 63: 192
        line 66: 195
        line 67: 208
        line 69: 220
        line 70: 235
        line 73: 238
        line 74: 251
        line 76: 263
        line 78: 278
        line 81: 281
        line 83: 296
        line 86: 298
        line 88: 325
        line 90: 331
        line 93: 448
        line 95: 466
        line 96: 471
        line 98: 473
        line 99: 488
        line 102: 491
        line 103: 501
        line 105: 513
        line 106: 528
        line 109: 531
        line 110: 541
        line 112: 553
        line 114: 568
        line 117: 571
        line 119: 586
        line 122: 588
        line 124: 615
        line 126: 621
        line 129: 740
        line 131: 758
        line 132: 763
        line 134: 765
        line 135: 780
        line 138: 783
        line 139: 793
        line 141: 805
        line 142: 820
        line 145: 823
        line 146: 833
        line 148: 845
        line 150: 860
        line 153: 863
        line 155: 878
        line 158: 880
        line 160: 907
        line 162: 913
        line 165: 1032
        line 167: 1050
        line 168: 1055
        line 170: 1057
        line 171: 1072
        line 174: 1075
        line 175: 1088
        line 177: 1100
        line 178: 1115
        line 181: 1118
        line 182: 1131
        line 184: 1143
        line 186: 1158
        line 189: 1161
        line 191: 1176
        line 194: 1178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0    1180     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/EventCommand;
            0    1180     1 command   Ljava/lang/String;
            0    1180     2 player   Lext/mods/gameserver/model/actor/Player;
            0    1180     3 target   Ljava/lang/String;
      StackMapTable: number_of_entries = 64
        frame_type = 27 /* same */
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 17 /* same */
        frame_type = 6 /* same */
        frame_type = 17 /* same */
        frame_type = 24 /* same */
        frame_type = 17 /* same */
        frame_type = 24 /* same */
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 17 /* same */
        frame_type = 6 /* same */
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 17 /* same */
        frame_type = 6 /* same */
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 17 /* same */
        frame_type = 21 /* same */
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 26 /* same */
        frame_type = 17 /* same */
        frame_type = 6 /* same */
        frame_type = 17 /* same */
        frame_type = 24 /* same */
        frame_type = 17 /* same */
        frame_type = 24 /* same */
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #244                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 255: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/EventCommand;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        12
         2: anewarray     #10                 // class java/lang/String
         5: dup
         6: iconst_0
         7: ldc           #7                  // String ctfinfo
         9: aastore
        10: dup
        11: iconst_1
        12: ldc           #15                 // String ctfjoin
        14: aastore
        15: dup
        16: iconst_2
        17: ldc           #17                 // String ctfleave
        19: aastore
        20: dup
        21: iconst_3
        22: ldc           #73                 // String dminfo
        24: aastore
        25: dup
        26: iconst_4
        27: ldc           #75                 // String dmjoin
        29: aastore
        30: dup
        31: iconst_5
        32: ldc           #77                 // String dmleave
        34: aastore
        35: dup
        36: bipush        6
        38: ldc           #100                // String lminfo
        40: aastore
        41: dup
        42: bipush        7
        44: ldc           #102                // String lmjoin
        46: aastore
        47: dup
        48: bipush        8
        50: ldc           #104                // String lmleave
        52: aastore
        53: dup
        54: bipush        9
        56: ldc           #125                // String tvtinfo
        58: aastore
        59: dup
        60: bipush        10
        62: ldc           #127                // String tvtjoin
        64: aastore
        65: dup
        66: bipush        11
        68: ldc           #129                // String tvtleave
        70: aastore
        71: putstatic     #244                // Field VOICED_COMMANDS:[Ljava/lang/String;
        74: return
      LineNumberTable:
        line 31: 0
}
SourceFile: "EventCommand.java"
BootstrapMethods:
  0: #277 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #275 \u0001<tr><td>\u0001</td><td width=\"100\" align=\"center\">\u0001</td></tr>
InnerClasses:
  public static final #288= #284 of #286; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
