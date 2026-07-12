// Bytecode for: ext.mods.gameserver.handler.admincommandhandlers.AdminTest
// File: ext\mods\gameserver\handler\admincommandhandlers\AdminTest.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/admincommandhandlers/AdminTest.class
  Last modified 9 de jul de 2026; size 7112 bytes
  MD5 checksum 55ac7ad3827a68786ad57b4f300b3f96
  Compiled from "AdminTest.java"
public class ext.mods.gameserver.handler.admincommandhandlers.AdminTest implements ext.mods.gameserver.handler.IAdminCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #54                         // ext/mods/gameserver/handler/admincommandhandlers/AdminTest
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/StringTokenizer
    #8 = Utf8               java/util/StringTokenizer
    #9 = Methodref          #7.#10        // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #10 = NameAndType        #5:#11        // "<init>":(Ljava/lang/String;)V
   #11 = Utf8               (Ljava/lang/String;)V
   #12 = Methodref          #7.#13        // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #13 = NameAndType        #14:#15       // nextToken:()Ljava/lang/String;
   #14 = Utf8               nextToken
   #15 = Utf8               ()Ljava/lang/String;
   #16 = Methodref          #7.#17        // java/util/StringTokenizer.hasMoreTokens:()Z
   #17 = NameAndType        #18:#19       // hasMoreTokens:()Z
   #18 = Utf8               hasMoreTokens
   #19 = Utf8               ()Z
   #20 = String             #21           // Usage : //test setquest || ssq_change || manor_change || dt_set(add, reset, print)
   #21 = Utf8               Usage : //test setquest || ssq_change || manor_change || dt_set(add, reset, print)
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #23 = Class              #25           // ext/mods/gameserver/model/actor/Player
   #24 = NameAndType        #26:#11       // sendMessage:(Ljava/lang/String;)V
   #25 = Utf8               ext/mods/gameserver/model/actor/Player
   #26 = Utf8               sendMessage
   #27 = Methodref          #28.#29       // java/lang/String.hashCode:()I
   #28 = Class              #30           // java/lang/String
   #29 = NameAndType        #31:#32       // hashCode:()I
   #30 = Utf8               java/lang/String
   #31 = Utf8               hashCode
   #32 = Utf8               ()I
   #33 = String             #34           // setquest
   #34 = Utf8               setquest
   #35 = Methodref          #28.#36       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #36 = NameAndType        #37:#38       // equals:(Ljava/lang/Object;)Z
   #37 = Utf8               equals
   #38 = Utf8               (Ljava/lang/Object;)Z
   #39 = String             #40           // ssq_change
   #40 = Utf8               ssq_change
   #41 = String             #42           // manor_change
   #42 = Utf8               manor_change
   #43 = String             #44           // dt_set
   #44 = Utf8               dt_set
   #45 = String             #46           // dt_add
   #46 = Utf8               dt_add
   #47 = String             #48           // dt_reset
   #48 = Utf8               dt_reset
   #49 = String             #50           // dt_print
   #50 = Utf8               dt_print
   #51 = Class              #52           // ext/mods/gameserver/model/WorldObject
   #52 = Utf8               ext/mods/gameserver/model/WorldObject
   #53 = Methodref          #54.#55       // ext/mods/gameserver/handler/admincommandhandlers/AdminTest.getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #54 = Class              #56           // ext/mods/gameserver/handler/admincommandhandlers/AdminTest
   #55 = NameAndType        #57:#58       // getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #56 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminTest
   #57 = Utf8               getTarget
   #58 = Utf8               (Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Class              #62           // ext/mods/gameserver/network/SystemMessageId
   #61 = NameAndType        #63:#64       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #62 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #63 = Utf8               INVALID_TARGET
   #64 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #65 = Methodref          #23.#66       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #66 = NameAndType        #67:#68       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = Utf8               sendPacket
   #68 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #69 = Methodref          #70.#71       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #70 = Class              #72           // java/lang/Integer
   #71 = NameAndType        #73:#74       // parseInt:(Ljava/lang/String;)I
   #72 = Utf8               java/lang/Integer
   #73 = Utf8               parseInt
   #74 = Utf8               (Ljava/lang/String;)I
   #75 = Methodref          #76.#77       // ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
   #76 = Class              #78           // ext/mods/gameserver/data/xml/ScriptData
   #77 = NameAndType        #79:#80       // getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
   #78 = Utf8               ext/mods/gameserver/data/xml/ScriptData
   #79 = Utf8               getInstance
   #80 = Utf8               ()Lext/mods/gameserver/data/xml/ScriptData;
   #81 = Methodref          #76.#82       // ext/mods/gameserver/data/xml/ScriptData.getQuest:(I)Lext/mods/gameserver/scripting/Quest;
   #82 = NameAndType        #83:#84       // getQuest:(I)Lext/mods/gameserver/scripting/Quest;
   #83 = Utf8               getQuest
   #84 = Utf8               (I)Lext/mods/gameserver/scripting/Quest;
   #85 = InvokeDynamic      #0:#86        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #86 = NameAndType        #87:#88       // makeConcatWithConstants:(I)Ljava/lang/String;
   #87 = Utf8               makeConcatWithConstants
   #88 = Utf8               (I)Ljava/lang/String;
   #89 = Methodref          #90.#91       // ext/mods/gameserver/scripting/Quest.getQuestState:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/scripting/QuestState;
   #90 = Class              #92           // ext/mods/gameserver/scripting/Quest
   #91 = NameAndType        #93:#94       // getQuestState:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/scripting/QuestState;
   #92 = Utf8               ext/mods/gameserver/scripting/Quest
   #93 = Utf8               getQuestState
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/scripting/QuestState;
   #95 = Methodref          #23.#96       // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #96 = NameAndType        #97:#15       // getName:()Ljava/lang/String;
   #97 = Utf8               getName
   #98 = InvokeDynamic      #1:#99        // #1:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #99 = NameAndType        #87:#100      // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #100 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/enums/QuestStatus.STARTED:Lext/mods/gameserver/enums/QuestStatus;
  #102 = Class              #104          // ext/mods/gameserver/enums/QuestStatus
  #103 = NameAndType        #105:#106     // STARTED:Lext/mods/gameserver/enums/QuestStatus;
  #104 = Utf8               ext/mods/gameserver/enums/QuestStatus
  #105 = Utf8               STARTED
  #106 = Utf8               Lext/mods/gameserver/enums/QuestStatus;
  #107 = Methodref          #108.#109     // ext/mods/gameserver/scripting/QuestState.setState:(Lext/mods/gameserver/enums/QuestStatus;)V
  #108 = Class              #110          // ext/mods/gameserver/scripting/QuestState
  #109 = NameAndType        #111:#112     // setState:(Lext/mods/gameserver/enums/QuestStatus;)V
  #110 = Utf8               ext/mods/gameserver/scripting/QuestState
  #111 = Utf8               setState
  #112 = Utf8               (Lext/mods/gameserver/enums/QuestStatus;)V
  #113 = Methodref          #108.#114     // ext/mods/gameserver/scripting/QuestState.setCond:(I)V
  #114 = NameAndType        #115:#116     // setCond:(I)V
  #115 = Utf8               setCond
  #116 = Utf8               (I)V
  #117 = Methodref          #90.#96       // ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
  #118 = InvokeDynamic      #2:#119       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #119 = NameAndType        #87:#120      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #120 = Utf8               (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
  #121 = InvokeDynamic      #3:#122       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #122 = NameAndType        #87:#123      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #123 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #124 = String             #125          // Invalid command format. Use //test setquest <questId> <cond>
  #125 = Utf8               Invalid command format. Use //test setquest <questId> <cond>
  #126 = Class              #127          // java/lang/NumberFormatException
  #127 = Utf8               java/lang/NumberFormatException
  #128 = Methodref          #129.#130     // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #129 = Class              #131          // ext/mods/gameserver/data/manager/SevenSignsManager
  #130 = NameAndType        #79:#132      // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #131 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #132 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #133 = Methodref          #129.#134     // ext/mods/gameserver/data/manager/SevenSignsManager.changePeriod:()V
  #134 = NameAndType        #135:#6       // changePeriod:()V
  #135 = Utf8               changePeriod
  #136 = Methodref          #137.#138     // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
  #137 = Class              #139          // ext/mods/gameserver/data/manager/CastleManorManager
  #138 = NameAndType        #79:#140      // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
  #139 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
  #140 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
  #141 = Methodref          #137.#142     // ext/mods/gameserver/data/manager/CastleManorManager.changeMode:()V
  #142 = NameAndType        #143:#6       // changeMode:()V
  #143 = Utf8               changeMode
  #144 = Methodref          #54.#145      // ext/mods/gameserver/handler/admincommandhandlers/AdminTest.parseTime:(Ljava/lang/String;)J
  #145 = NameAndType        #146:#147     // parseTime:(Ljava/lang/String;)J
  #146 = Utf8               parseTime
  #147 = Utf8               (Ljava/lang/String;)J
  #148 = Methodref          #149.#150     // ext/mods/commons/util/LinTime.setDeltaTime:(J)V
  #149 = Class              #151          // ext/mods/commons/util/LinTime
  #150 = NameAndType        #152:#153     // setDeltaTime:(J)V
  #151 = Utf8               ext/mods/commons/util/LinTime
  #152 = Utf8               setDeltaTime
  #153 = Utf8               (J)V
  #154 = InvokeDynamic      #4:#155       // #4:makeConcatWithConstants:(J)Ljava/lang/String;
  #155 = NameAndType        #87:#156      // makeConcatWithConstants:(J)Ljava/lang/String;
  #156 = Utf8               (J)Ljava/lang/String;
  #157 = Methodref          #149.#158     // ext/mods/commons/util/LinTime.addDeltaTime:(J)V
  #158 = NameAndType        #159:#153     // addDeltaTime:(J)V
  #159 = Utf8               addDeltaTime
  #160 = InvokeDynamic      #5:#155       // #5:makeConcatWithConstants:(J)Ljava/lang/String;
  #161 = Methodref          #149.#162     // ext/mods/commons/util/LinTime.resetDeltaTime:()V
  #162 = NameAndType        #163:#6       // resetDeltaTime:()V
  #163 = Utf8               resetDeltaTime
  #164 = String             #165          // + reset dt
  #165 = Utf8               + reset dt
  #166 = String             #167          //
  #167 = Utf8
  #168 = String             #169          // min
  #169 = Utf8               min
  #170 = String             #171          // hour
  #171 = Utf8               hour
  #172 = String             #173          // day
  #173 = Utf8               day
  #174 = String             #175          // time
  #175 = Utf8               time
  #176 = String             #177          // sec
  #177 = Utf8               sec
  #178 = Fieldref           #179.#180     // java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
  #179 = Class              #181          // java/util/concurrent/TimeUnit
  #180 = NameAndType        #182:#183     // MINUTES:Ljava/util/concurrent/TimeUnit;
  #181 = Utf8               java/util/concurrent/TimeUnit
  #182 = Utf8               MINUTES
  #183 = Utf8               Ljava/util/concurrent/TimeUnit;
  #184 = Fieldref           #179.#185     // java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
  #185 = NameAndType        #186:#183     // HOURS:Ljava/util/concurrent/TimeUnit;
  #186 = Utf8               HOURS
  #187 = Fieldref           #179.#188     // java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
  #188 = NameAndType        #189:#183     // DAYS:Ljava/util/concurrent/TimeUnit;
  #189 = Utf8               DAYS
  #190 = Fieldref           #179.#191     // java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
  #191 = NameAndType        #192:#183     // NANOSECONDS:Ljava/util/concurrent/TimeUnit;
  #192 = Utf8               NANOSECONDS
  #193 = Fieldref           #179.#194     // java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
  #194 = NameAndType        #195:#183     // SECONDS:Ljava/util/concurrent/TimeUnit;
  #195 = Utf8               SECONDS
  #196 = Fieldref           #179.#197     // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #197 = NameAndType        #198:#183     // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #198 = Utf8               MILLISECONDS
  #199 = Class              #200          // java/util/Date
  #200 = Utf8               java/util/Date
  #201 = Methodref          #149.#202     // ext/mods/commons/util/LinTime.currentTimeMillis:()J
  #202 = NameAndType        #203:#204     // currentTimeMillis:()J
  #203 = Utf8               currentTimeMillis
  #204 = Utf8               ()J
  #205 = Methodref          #199.#206     // java/util/Date."<init>":(J)V
  #206 = NameAndType        #5:#153       // "<init>":(J)V
  #207 = Class              #208          // java/text/SimpleDateFormat
  #208 = Utf8               java/text/SimpleDateFormat
  #209 = String             #210          // yyyy/MM/dd HH:mm:ss
  #210 = Utf8               yyyy/MM/dd HH:mm:ss
  #211 = Methodref          #207.#10      // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #212 = Methodref          #207.#213     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #213 = NameAndType        #214:#215     // format:(Ljava/util/Date;)Ljava/lang/String;
  #214 = Utf8               format
  #215 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #216 = InvokeDynamic      #6:#217       // #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #217 = NameAndType        #87:#218      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #218 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #219 = String             #220          // + dt: %s %s
  #220 = Utf8               + dt: %s %s
  #221 = Methodref          #149.#222     // ext/mods/commons/util/LinTime.deltaTime:()J
  #222 = NameAndType        #223:#204     // deltaTime:()J
  #223 = Utf8               deltaTime
  #224 = Methodref          #179.#225     // java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
  #225 = NameAndType        #226:#227     // convert:(JLjava/util/concurrent/TimeUnit;)J
  #226 = Utf8               convert
  #227 = Utf8               (JLjava/util/concurrent/TimeUnit;)J
  #228 = Methodref          #229.#230     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #229 = Class              #231          // java/lang/Long
  #230 = NameAndType        #232:#233     // valueOf:(J)Ljava/lang/Long;
  #231 = Utf8               java/lang/Long
  #232 = Utf8               valueOf
  #233 = Utf8               (J)Ljava/lang/Long;
  #234 = Methodref          #28.#235      // java/lang/String.formatted:([Ljava/lang/Object;)Ljava/lang/String;
  #235 = NameAndType        #236:#237     // formatted:([Ljava/lang/Object;)Ljava/lang/String;
  #236 = Utf8               formatted
  #237 = Utf8               ([Ljava/lang/Object;)Ljava/lang/String;
  #238 = Methodref          #28.#239      // java/lang/String.endsWith:(Ljava/lang/String;)Z
  #239 = NameAndType        #240:#241     // endsWith:(Ljava/lang/String;)Z
  #240 = Utf8               endsWith
  #241 = Utf8               (Ljava/lang/String;)Z
  #242 = Methodref          #28.#243      // java/lang/String.length:()I
  #243 = NameAndType        #244:#32      // length:()I
  #244 = Utf8               length
  #245 = Methodref          #28.#246      // java/lang/String.substring:(II)Ljava/lang/String;
  #246 = NameAndType        #247:#248     // substring:(II)Ljava/lang/String;
  #247 = Utf8               substring
  #248 = Utf8               (II)Ljava/lang/String;
  #249 = Methodref          #229.#250     // java/lang/Long.parseLong:(Ljava/lang/String;)J
  #250 = NameAndType        #251:#147     // parseLong:(Ljava/lang/String;)J
  #251 = Utf8               parseLong
  #252 = Methodref          #179.#253     // java/util/concurrent/TimeUnit.toMillis:(J)J
  #253 = NameAndType        #254:#255     // toMillis:(J)J
  #254 = Utf8               toMillis
  #255 = Utf8               (J)J
  #256 = Fieldref           #54.#257      // ext/mods/gameserver/handler/admincommandhandlers/AdminTest.ADMIN_COMMANDS:[Ljava/lang/String;
  #257 = NameAndType        #258:#259     // ADMIN_COMMANDS:[Ljava/lang/String;
  #258 = Utf8               ADMIN_COMMANDS
  #259 = Utf8               [Ljava/lang/String;
  #260 = String             #261          // admin_test
  #261 = Utf8               admin_test
  #262 = Class              #263          // ext/mods/gameserver/handler/IAdminCommandHandler
  #263 = Utf8               ext/mods/gameserver/handler/IAdminCommandHandler
  #264 = Utf8               Code
  #265 = Utf8               LineNumberTable
  #266 = Utf8               LocalVariableTable
  #267 = Utf8               this
  #268 = Utf8               Lext/mods/gameserver/handler/admincommandhandlers/AdminTest;
  #269 = Utf8               useAdminCommand
  #270 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
  #271 = Utf8               cond
  #272 = Utf8               I
  #273 = Utf8               quest
  #274 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #275 = Utf8               qs
  #276 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #277 = Utf8               questId
  #278 = Utf8               targetPlayer
  #279 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #280 = Utf8               targetObject
  #281 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #282 = Utf8               e
  #283 = Utf8               Ljava/lang/NumberFormatException;
  #284 = Utf8               J
  #285 = Utf8               date
  #286 = Utf8               Ljava/util/Date;
  #287 = Utf8               sdf
  #288 = Utf8               Ljava/text/SimpleDateFormat;
  #289 = Utf8               name
  #290 = Utf8               Ljava/lang/String;
  #291 = Utf8               tu
  #292 = Utf8               command
  #293 = Utf8               player
  #294 = Utf8               st
  #295 = Utf8               Ljava/util/StringTokenizer;
  #296 = Utf8               StackMapTable
  #297 = Utf8               input
  #298 = Utf8               getAdminCommandList
  #299 = Utf8               ()[Ljava/lang/String;
  #300 = Utf8               <clinit>
  #301 = Utf8               SourceFile
  #302 = Utf8               AdminTest.java
  #303 = Utf8               BootstrapMethods
  #304 = String             #305          // Quest with id: \u0001 not found
  #305 = Utf8               Quest with id: \u0001 not found
  #306 = String             #307          // Cannot initialize new quest state with cond \u0001 for player \u0001. To initialize new quest state, use cond 0.
  #307 = Utf8               Cannot initialize new quest state with cond \u0001 for player \u0001. To initialize new quest state, use cond 0.
  #308 = String             #309          // \u0001\'s \u0001 quest condition set to \u0001
  #309 = Utf8               \u0001\'s \u0001 quest condition set to \u0001
  #310 = String             #311          // \u0001\'s \u0001 quest has been created. To start it, use test startquest <questId> <cond>
  #311 = Utf8               \u0001\'s \u0001 quest has been created. To start it, use test startquest <questId> <cond>
  #312 = String             #313          // + set dt \u0001
  #313 = Utf8               + set dt \u0001
  #314 = String             #315          // + add dt \u0001
  #315 = Utf8               + add dt \u0001
  #316 = String             #317          // + dt: \u0001
  #317 = Utf8               + dt: \u0001
  #318 = MethodHandle       6:#319        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #319 = Methodref          #320.#321     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #320 = Class              #322          // java/lang/invoke/StringConcatFactory
  #321 = NameAndType        #87:#323      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #322 = Utf8               java/lang/invoke/StringConcatFactory
  #323 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #324 = Utf8               InnerClasses
  #325 = Class              #326          // java/lang/invoke/MethodHandles$Lookup
  #326 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #327 = Class              #328          // java/lang/invoke/MethodHandles
  #328 = Utf8               java/lang/invoke/MethodHandles
  #329 = Utf8               Lookup
{
  public ext.mods.gameserver.handler.admincommandhandlers.AdminTest();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminTest;

  public void useAdminCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=12, args_size=3
         0: new           #7                  // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #9                  // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        13: pop
        14: aload_3
        15: invokevirtual #16                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        18: ifne          28
        21: aload_2
        22: ldc           #20                 // String Usage : //test setquest || ssq_change || manor_change || dt_set(add, reset, print)
        24: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        27: return
        28: aload_3
        29: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        32: astore        4
        34: iconst_m1
        35: istore        5
        37: aload         4
        39: invokevirtual #27                 // Method java/lang/String.hashCode:()I
        42: lookupswitch  { // 7

             -2107142754: 124

             -2062357134: 140

             -1321997198: 172

             -1321979853: 156

               885290558: 204

               886759648: 188

              1432209856: 108
                 default: 218
            }
       108: aload         4
       110: ldc           #33                 // String setquest
       112: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       115: ifeq          218
       118: iconst_0
       119: istore        5
       121: goto          218
       124: aload         4
       126: ldc           #39                 // String ssq_change
       128: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       131: ifeq          218
       134: iconst_1
       135: istore        5
       137: goto          218
       140: aload         4
       142: ldc           #41                 // String manor_change
       144: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       147: ifeq          218
       150: iconst_2
       151: istore        5
       153: goto          218
       156: aload         4
       158: ldc           #43                 // String dt_set
       160: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       163: ifeq          218
       166: iconst_3
       167: istore        5
       169: goto          218
       172: aload         4
       174: ldc           #45                 // String dt_add
       176: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       179: ifeq          218
       182: iconst_4
       183: istore        5
       185: goto          218
       188: aload         4
       190: ldc           #47                 // String dt_reset
       192: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       195: ifeq          218
       198: iconst_5
       199: istore        5
       201: goto          218
       204: aload         4
       206: ldc           #49                 // String dt_print
       208: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       211: ifeq          218
       214: bipush        6
       216: istore        5
       218: iload         5
       220: tableswitch   { // 0 to 6

                       0: 264

                       1: 503

                       2: 512

                       3: 521

                       4: 549

                       5: 577

                       6: 589
                 default: 903
            }
       264: aload_0
       265: ldc           #51                 // class ext/mods/gameserver/model/WorldObject
       267: aload_2
       268: iconst_1
       269: invokevirtual #53                 // Method getTarget:(Ljava/lang/Class;Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/model/WorldObject;
       272: astore        6
       274: aload         6
       276: ifnonnull     287
       279: aload_2
       280: getstatic     #59                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       283: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       286: return
       287: aload         6
       289: instanceof    #23                 // class ext/mods/gameserver/model/actor/Player
       292: ifeq          489
       295: aload         6
       297: checkcast     #23                 // class ext/mods/gameserver/model/actor/Player
       300: astore        7
       302: aload_3
       303: invokevirtual #16                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       306: ifeq          483
       309: aload_3
       310: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       313: invokestatic  #69                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       316: istore        8
       318: aload_3
       319: invokevirtual #16                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       322: ifeq          474
       325: aload_3
       326: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       329: invokestatic  #69                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
       332: istore        9
       334: invokestatic  #75                 // Method ext/mods/gameserver/data/xml/ScriptData.getInstance:()Lext/mods/gameserver/data/xml/ScriptData;
       337: iload         8
       339: invokevirtual #81                 // Method ext/mods/gameserver/data/xml/ScriptData.getQuest:(I)Lext/mods/gameserver/scripting/Quest;
       342: astore        10
       344: aload         10
       346: ifnonnull     361
       349: aload_2
       350: iload         8
       352: invokedynamic #85,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       357: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       360: return
       361: aload         10
       363: aload         7
       365: iload         9
       367: ifeq          376
       370: iload         9
       372: iconst_1
       373: if_icmpne     380
       376: iconst_1
       377: goto          381
       380: iconst_0
       381: invokevirtual #89                 // Method ext/mods/gameserver/scripting/Quest.getQuestState:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/scripting/QuestState;
       384: astore        11
       386: aload         11
       388: ifnonnull     408
       391: aload_2
       392: iload         9
       394: aload         7
       396: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       399: invokedynamic #98,  0             // InvokeDynamic #1:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
       404: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       407: return
       408: iload         9
       410: ifle          452
       413: aload         11
       415: getstatic     #101                // Field ext/mods/gameserver/enums/QuestStatus.STARTED:Lext/mods/gameserver/enums/QuestStatus;
       418: invokevirtual #107                // Method ext/mods/gameserver/scripting/QuestState.setState:(Lext/mods/gameserver/enums/QuestStatus;)V
       421: aload         11
       423: iload         9
       425: invokevirtual #113                // Method ext/mods/gameserver/scripting/QuestState.setCond:(I)V
       428: aload_2
       429: aload         7
       431: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       434: aload         10
       436: invokevirtual #117                // Method ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
       439: iload         9
       441: invokedynamic #118,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
       446: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       449: goto          471
       452: aload_2
       453: aload         7
       455: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       458: aload         10
       460: invokevirtual #117                // Method ext/mods/gameserver/scripting/Quest.getName:()Ljava/lang/String;
       463: invokedynamic #121,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       468: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       471: goto          480
       474: aload_2
       475: ldc           #124                // String Invalid command format. Use //test setquest <questId> <cond>
       477: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       480: goto          489
       483: aload_2
       484: ldc           #124                // String Invalid command format. Use //test setquest <questId> <cond>
       486: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       489: goto          909
       492: astore        6
       494: aload_2
       495: ldc           #124                // String Invalid command format. Use //test setquest <questId> <cond>
       497: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       500: goto          909
       503: invokestatic  #128                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       506: invokevirtual #133                // Method ext/mods/gameserver/data/manager/SevenSignsManager.changePeriod:()V
       509: goto          909
       512: invokestatic  #136                // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
       515: invokevirtual #141                // Method ext/mods/gameserver/data/manager/CastleManorManager.changeMode:()V
       518: goto          909
       521: aload_3
       522: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       525: invokestatic  #144                // Method parseTime:(Ljava/lang/String;)J
       528: lstore        6
       530: lload         6
       532: invokestatic  #148                // Method ext/mods/commons/util/LinTime.setDeltaTime:(J)V
       535: aload_2
       536: lload         6
       538: invokedynamic #154,  0            // InvokeDynamic #4:makeConcatWithConstants:(J)Ljava/lang/String;
       543: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       546: goto          909
       549: aload_3
       550: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       553: invokestatic  #144                // Method parseTime:(Ljava/lang/String;)J
       556: lstore        6
       558: lload         6
       560: invokestatic  #157                // Method ext/mods/commons/util/LinTime.addDeltaTime:(J)V
       563: aload_2
       564: lload         6
       566: invokedynamic #160,  0            // InvokeDynamic #5:makeConcatWithConstants:(J)Ljava/lang/String;
       571: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       574: goto          909
       577: invokestatic  #161                // Method ext/mods/commons/util/LinTime.resetDeltaTime:()V
       580: aload_2
       581: ldc           #164                // String + reset dt
       583: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       586: goto          909
       589: aload_3
       590: invokevirtual #16                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
       593: ifeq          603
       596: aload_3
       597: invokevirtual #12                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
       600: goto          605
       603: ldc           #166                // String
       605: astore        6
       607: aload         6
       609: astore        8
       611: iconst_m1
       612: istore        9
       614: aload         8
       616: invokevirtual #27                 // Method java/lang/String.hashCode:()I
       619: lookupswitch  { // 5

                   99228: 700

                  108114: 668

                  113745: 732

                 3208676: 684

                 3560141: 716
                 default: 745
            }
       668: aload         8
       670: ldc           #168                // String min
       672: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       675: ifeq          745
       678: iconst_0
       679: istore        9
       681: goto          745
       684: aload         8
       686: ldc           #170                // String hour
       688: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       691: ifeq          745
       694: iconst_1
       695: istore        9
       697: goto          745
       700: aload         8
       702: ldc           #172                // String day
       704: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       707: ifeq          745
       710: iconst_2
       711: istore        9
       713: goto          745
       716: aload         8
       718: ldc           #174                // String time
       720: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       723: ifeq          745
       726: iconst_3
       727: istore        9
       729: goto          745
       732: aload         8
       734: ldc           #176                // String sec
       736: invokevirtual #35                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       739: ifeq          745
       742: iconst_4
       743: istore        9
       745: iload         9
       747: tableswitch   { // 0 to 4

                       0: 780

                       1: 786

                       2: 792

                       3: 798

                       4: 804
                 default: 810
            }
       780: getstatic     #178                // Field java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
       783: goto          813
       786: getstatic     #184                // Field java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
       789: goto          813
       792: getstatic     #187                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
       795: goto          813
       798: getstatic     #190                // Field java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
       801: goto          813
       804: getstatic     #193                // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
       807: goto          813
       810: getstatic     #196                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
       813: astore        7
       815: aload         7
       817: getstatic     #190                // Field java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
       820: if_acmpne     865
       823: new           #199                // class java/util/Date
       826: dup
       827: invokestatic  #201                // Method ext/mods/commons/util/LinTime.currentTimeMillis:()J
       830: invokespecial #205                // Method java/util/Date."<init>":(J)V
       833: astore        8
       835: new           #207                // class java/text/SimpleDateFormat
       838: dup
       839: ldc           #209                // String yyyy/MM/dd HH:mm:ss
       841: invokespecial #211                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       844: astore        9
       846: aload_2
       847: aload         9
       849: aload         8
       851: invokevirtual #212                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       854: invokedynamic #216,  0            // InvokeDynamic #6:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       859: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       862: goto          909
       865: aload_2
       866: ldc           #219                // String + dt: %s %s
       868: iconst_2
       869: anewarray     #2                  // class java/lang/Object
       872: dup
       873: iconst_0
       874: aload         7
       876: invokestatic  #221                // Method ext/mods/commons/util/LinTime.deltaTime:()J
       879: getstatic     #196                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
       882: invokevirtual #224                // Method java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
       885: invokestatic  #228                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
       888: aastore
       889: dup
       890: iconst_1
       891: aload         6
       893: aastore
       894: invokevirtual #234                // Method java/lang/String.formatted:([Ljava/lang/Object;)Ljava/lang/String;
       897: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       900: goto          909
       903: aload_2
       904: ldc           #20                 // String Usage : //test setquest || ssq_change || manor_change || dt_set(add, reset, print)
       906: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       909: return
      Exception table:
         from    to  target type
           264   286   492   Class java/lang/NumberFormatException
           287   360   492   Class java/lang/NumberFormatException
           361   407   492   Class java/lang/NumberFormatException
           408   489   492   Class java/lang/NumberFormatException
      LineNumberTable:
        line 48: 0
        line 49: 9
        line 51: 14
        line 53: 21
        line 54: 27
        line 57: 28
        line 62: 264
        line 64: 274
        line 66: 279
        line 67: 286
        line 70: 287
        line 72: 302
        line 74: 309
        line 75: 318
        line 77: 325
        line 78: 334
        line 80: 344
        line 82: 349
        line 83: 360
        line 86: 361
        line 88: 386
        line 90: 391
        line 91: 407
        line 94: 408
        line 96: 413
        line 97: 421
        line 98: 428
        line 101: 452
        line 102: 471
        line 104: 474
        line 105: 480
        line 107: 483
        line 113: 489
        line 110: 492
        line 112: 494
        line 114: 500
        line 117: 503
        line 118: 509
        line 121: 512
        line 122: 518
        line 126: 521
        line 127: 530
        line 128: 535
        line 129: 546
        line 134: 549
        line 135: 558
        line 136: 563
        line 137: 574
        line 141: 577
        line 142: 580
        line 143: 586
        line 146: 589
        line 147: 607
        line 149: 780
        line 150: 786
        line 151: 792
        line 152: 798
        line 153: 804
        line 154: 810
        line 147: 813
        line 157: 815
        line 159: 823
        line 160: 835
        line 161: 846
        line 162: 862
        line 164: 865
        line 166: 900
        line 169: 903
        line 172: 909
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          334     137     9  cond   I
          344     127    10 quest   Lext/mods/gameserver/scripting/Quest;
          386      85    11    qs   Lext/mods/gameserver/scripting/QuestState;
          318     162     8 questId   I
          302     187     7 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          274     215     6 targetObject   Lext/mods/gameserver/model/WorldObject;
          494       6     6     e   Ljava/lang/NumberFormatException;
          530      19     6  time   J
          558      19     6  time   J
          835      27     8  date   Ljava/util/Date;
          846      16     9   sdf   Ljava/text/SimpleDateFormat;
          607     296     6  name   Ljava/lang/String;
          815      88     7    tu   Ljava/util/concurrent/TimeUnit;
            0     910     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminTest;
            0     910     1 command   Ljava/lang/String;
            0     910     2 player   Lext/mods/gameserver/model/actor/Player;
            9     901     3    st   Ljava/util/StringTokenizer;
      StackMapTable: number_of_entries = 47
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/util/StringTokenizer ]
        frame_type = 253 /* append */
          offset_delta = 79
          locals = [ class java/lang/String, int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 13 /* same */
        frame_type = 45 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTest, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/scripting/Quest ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTest, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/scripting/Quest ]
          stack = [ class ext/mods/gameserver/scripting/Quest, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTest, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/scripting/Quest ]
          stack = [ class ext/mods/gameserver/scripting/Quest, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTest, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/scripting/Quest ]
          stack = [ class ext/mods/gameserver/scripting/Quest, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 43 /* same */
        frame_type = 248 /* chop */
          offset_delta = 18
        frame_type = 2 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 10 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 27 /* same */
        frame_type = 27 /* same */
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 62
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTest, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class java/lang/String, top, class java/lang/String, int ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 12 /* same */
        frame_type = 34 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/admincommandhandlers/AdminTest, class java/lang/String, class ext/mods/gameserver/model/actor/Player, class java/util/StringTokenizer, class java/lang/String, int, class java/lang/String ]
          stack = [ class java/util/concurrent/TimeUnit ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class java/util/concurrent/TimeUnit ]
        frame_type = 249 /* chop */
          offset_delta = 37
        frame_type = 249 /* chop */
          offset_delta = 5

  public static long parseTime(java.lang.String);
    descriptor: (Ljava/lang/String;)J
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: ldc           #176                // String sec
         3: invokevirtual #238                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
         6: ifeq          30
         9: getstatic     #193                // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        12: aload_0
        13: iconst_0
        14: aload_0
        15: invokevirtual #242                // Method java/lang/String.length:()I
        18: iconst_3
        19: isub
        20: invokevirtual #245                // Method java/lang/String.substring:(II)Ljava/lang/String;
        23: invokestatic  #249                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        26: invokevirtual #252                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        29: lreturn
        30: aload_0
        31: ldc           #168                // String min
        33: invokevirtual #238                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        36: ifeq          60
        39: getstatic     #178                // Field java/util/concurrent/TimeUnit.MINUTES:Ljava/util/concurrent/TimeUnit;
        42: aload_0
        43: iconst_0
        44: aload_0
        45: invokevirtual #242                // Method java/lang/String.length:()I
        48: iconst_3
        49: isub
        50: invokevirtual #245                // Method java/lang/String.substring:(II)Ljava/lang/String;
        53: invokestatic  #249                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        56: invokevirtual #252                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        59: lreturn
        60: aload_0
        61: ldc           #170                // String hour
        63: invokevirtual #238                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        66: ifeq          90
        69: getstatic     #184                // Field java/util/concurrent/TimeUnit.HOURS:Ljava/util/concurrent/TimeUnit;
        72: aload_0
        73: iconst_0
        74: aload_0
        75: invokevirtual #242                // Method java/lang/String.length:()I
        78: iconst_4
        79: isub
        80: invokevirtual #245                // Method java/lang/String.substring:(II)Ljava/lang/String;
        83: invokestatic  #249                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
        86: invokevirtual #252                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
        89: lreturn
        90: aload_0
        91: ldc           #172                // String day
        93: invokevirtual #238                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
        96: ifeq          120
        99: getstatic     #187                // Field java/util/concurrent/TimeUnit.DAYS:Ljava/util/concurrent/TimeUnit;
       102: aload_0
       103: iconst_0
       104: aload_0
       105: invokevirtual #242                // Method java/lang/String.length:()I
       108: iconst_3
       109: isub
       110: invokevirtual #245                // Method java/lang/String.substring:(II)Ljava/lang/String;
       113: invokestatic  #249                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
       116: invokevirtual #252                // Method java/util/concurrent/TimeUnit.toMillis:(J)J
       119: lreturn
       120: aload_0
       121: invokestatic  #249                // Method java/lang/Long.parseLong:(Ljava/lang/String;)J
       124: lreturn
      LineNumberTable:
        line 176: 0
        line 177: 9
        line 179: 30
        line 180: 39
        line 182: 60
        line 183: 69
        line 185: 90
        line 186: 99
        line 188: 120
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     125     0 input   Ljava/lang/String;
      StackMapTable: number_of_entries = 4
        frame_type = 30 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */
        frame_type = 29 /* same */

  public java.lang.String[] getAdminCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #256                // Field ADMIN_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/admincommandhandlers/AdminTest;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #28                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc_w         #260                // String admin_test
         9: aastore
        10: putstatic     #256                // Field ADMIN_COMMANDS:[Ljava/lang/String;
        13: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "AdminTest.java"
BootstrapMethods:
  0: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #304 Quest with id: \u0001 not found
  1: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #306 Cannot initialize new quest state with cond \u0001 for player \u0001. To initialize new quest state, use cond 0.
  2: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #308 \u0001\'s \u0001 quest condition set to \u0001
  3: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #310 \u0001\'s \u0001 quest has been created. To start it, use test startquest <questId> <cond>
  4: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #312 + set dt \u0001
  5: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 + add dt \u0001
  6: #318 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #316 + dt: \u0001
InnerClasses:
  public static final #329= #325 of #327; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
