// Bytecode for: ext.mods.gameserver.model.entity.events.teamvsteam.TvTManager
// File: ext\mods\gameserver\model\entity\events\teamvsteam\TvTManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.class
  Last modified 9 de jul de 2026; size 9927 bytes
  MD5 checksum ad92c04dcf12473950b26f0c44df08a1
  Compiled from "TvTManager.java"
public class ext.mods.gameserver.model.entity.events.teamvsteam.TvTManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #23                         // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.TVT_EVENT_ENABLED:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // TVT_EVENT_ENABLED:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               TVT_EVENT_ENABLED
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #14 = Class              #16           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #15 = NameAndType        #17:#18       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #16 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #17 = Utf8               getInstance
   #18 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.init:()V
   #20 = NameAndType        #21:#6        // init:()V
   #21 = Utf8               init
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.scheduleEventStart:()V
   #23 = Class              #25           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
   #24 = NameAndType        #26:#6        // scheduleEventStart:()V
   #25 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
   #26 = Utf8               scheduleEventStart
   #27 = Fieldref           #23.#28       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #28 = NameAndType        #29:#30       // LOGGER:Lext/mods/commons/logging/CLogger;
   #29 = Utf8               LOGGER
   #30 = Utf8               Lext/mods/commons/logging/CLogger;
   #31 = String             #32           // Team vs Team Engine: is Started.
   #32 = Utf8               Team vs Team Engine: is Started.
   #33 = Methodref          #34.#35       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #34 = Class              #36           // ext/mods/commons/logging/CLogger
   #35 = NameAndType        #37:#38       // info:(Ljava/lang/Object;)V
   #36 = Utf8               ext/mods/commons/logging/CLogger
   #37 = Utf8               info
   #38 = Utf8               (Ljava/lang/Object;)V
   #39 = String             #40           // Team vs Team Engine: is disabled.
   #40 = Utf8               Team vs Team Engine: is disabled.
   #41 = Methodref          #42.#43       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #42 = Class              #44           // java/util/Calendar
   #43 = NameAndType        #17:#45       // getInstance:()Ljava/util/Calendar;
   #44 = Utf8               java/util/Calendar
   #45 = Utf8               ()Ljava/util/Calendar;
   #46 = Fieldref           #8.#47        // ext/mods/Config.TVT_EVENT_INTERVAL:[Ljava/lang/String;
   #47 = NameAndType        #48:#49       // TVT_EVENT_INTERVAL:[Ljava/lang/String;
   #48 = Utf8               TVT_EVENT_INTERVAL
   #49 = Utf8               [Ljava/lang/String;
   #50 = Methodref          #42.#51       // java/util/Calendar.setLenient:(Z)V
   #51 = NameAndType        #52:#53       // setLenient:(Z)V
   #52 = Utf8               setLenient
   #53 = Utf8               (Z)V
   #54 = String             #55           // :
   #55 = Utf8               :
   #56 = Methodref          #57.#58       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #57 = Class              #59           // java/lang/String
   #58 = NameAndType        #60:#61       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #59 = Utf8               java/lang/String
   #60 = Utf8               split
   #61 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #62 = Methodref          #63.#64       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #63 = Class              #65           // java/lang/Integer
   #64 = NameAndType        #66:#67       // parseInt:(Ljava/lang/String;)I
   #65 = Utf8               java/lang/Integer
   #66 = Utf8               parseInt
   #67 = Utf8               (Ljava/lang/String;)I
   #68 = Methodref          #42.#69       // java/util/Calendar.set:(II)V
   #69 = NameAndType        #70:#71       // set:(II)V
   #70 = Utf8               set
   #71 = Utf8               (II)V
   #72 = String             #73           // 00
   #73 = Utf8               00
   #74 = Methodref          #42.#75       // java/util/Calendar.getTimeInMillis:()J
   #75 = NameAndType        #76:#77       // getTimeInMillis:()J
   #76 = Utf8               getTimeInMillis
   #77 = Utf8               ()J
   #78 = Methodref          #42.#79       // java/util/Calendar.add:(II)V
   #79 = NameAndType        #80:#71       // add:(II)V
   #80 = Utf8               add
   #81 = Fieldref           #23.#82       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager._nextEvent:Ljava/util/Calendar;
   #82 = NameAndType        #83:#84       // _nextEvent:Ljava/util/Calendar;
   #83 = Utf8               _nextEvent
   #84 = Utf8               Ljava/util/Calendar;
   #85 = Class              #86           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask
   #86 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask
   #87 = Methodref          #85.#88       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask."<init>":(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;J)V
   #88 = NameAndType        #5:#89        // "<init>":(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;J)V
   #89 = Utf8               (Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;J)V
   #90 = Fieldref           #23.#91       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager._task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
   #91 = NameAndType        #92:#93       // _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
   #92 = Utf8               _task
   #93 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
   #94 = Methodref          #95.#96       // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #95 = Class              #97           // ext/mods/commons/pool/ThreadPool
   #96 = NameAndType        #98:#99       // execute:(Ljava/lang/Runnable;)V
   #97 = Utf8               ext/mods/commons/pool/ThreadPool
   #98 = Utf8               execute
   #99 = Utf8               (Ljava/lang/Runnable;)V
  #100 = Class              #101          // java/lang/Exception
  #101 = Utf8               java/lang/Exception
  #102 = String             #103          // TvTEventEngine: Error figuring out a start time. Check TvTEventInterval in config file.
  #103 = Utf8               TvTEventEngine: Error figuring out a start time. Check TvTEventInterval in config file.
  #104 = Methodref          #34.#105      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #105 = NameAndType        #106:#38      // warn:(Ljava/lang/Object;)V
  #106 = Utf8               warn
  #107 = Methodref          #14.#108      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.startParticipation:()Z
  #108 = NameAndType        #109:#110     // startParticipation:()Z
  #109 = Utf8               startParticipation
  #110 = Utf8               ()Z
  #111 = String             #112          // Team vs Team: Event was cancelled.
  #112 = Utf8               Team vs Team: Event was cancelled.
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #114 = Class              #116          // ext/mods/gameserver/model/World
  #115 = NameAndType        #117:#118     // announceToOnlinePlayers:(Ljava/lang/String;)V
  #116 = Utf8               ext/mods/gameserver/model/World
  #117 = Utf8               announceToOnlinePlayers
  #118 = Utf8               (Ljava/lang/String;)V
  #119 = Fieldref           #8.#120       // ext/mods/Config.TVT_NPC_LOC_NAME:Ljava/lang/String;
  #120 = NameAndType        #121:#122     // TVT_NPC_LOC_NAME:Ljava/lang/String;
  #121 = Utf8               TVT_NPC_LOC_NAME
  #122 = Utf8               Ljava/lang/String;
  #123 = InvokeDynamic      #0:#124       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #124 = NameAndType        #125:#126     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #125 = Utf8               makeConcatWithConstants
  #126 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #127 = Fieldref           #8.#128       // ext/mods/Config.EVENT_COMMANDS:Z
  #128 = NameAndType        #129:#12      // EVENT_COMMANDS:Z
  #129 = Utf8               EVENT_COMMANDS
  #130 = String             #131          // Team vs Team: Command: .tvtjoin / .tvtleave / .tvtinfo
  #131 = Utf8               Team vs Team: Command: .tvtjoin / .tvtleave / .tvtinfo
  #132 = Fieldref           #8.#133       // ext/mods/Config.ALLOW_TVT_DLG:Z
  #133 = NameAndType        #134:#12      // ALLOW_TVT_DLG:Z
  #134 = Utf8               ALLOW_TVT_DLG
  #135 = Methodref          #114.#136     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #136 = NameAndType        #17:#137      // getInstance:()Lext/mods/gameserver/model/World;
  #137 = Utf8               ()Lext/mods/gameserver/model/World;
  #138 = Methodref          #114.#139     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #139 = NameAndType        #140:#141     // getPlayers:()Ljava/util/Collection;
  #140 = Utf8               getPlayers
  #141 = Utf8               ()Ljava/util/Collection;
  #142 = InterfaceMethodref #143.#144     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #143 = Class              #145          // java/util/Collection
  #144 = NameAndType        #146:#147     // iterator:()Ljava/util/Iterator;
  #145 = Utf8               java/util/Collection
  #146 = Utf8               iterator
  #147 = Utf8               ()Ljava/util/Iterator;
  #148 = InterfaceMethodref #149.#150     // java/util/Iterator.hasNext:()Z
  #149 = Class              #151          // java/util/Iterator
  #150 = NameAndType        #152:#110     // hasNext:()Z
  #151 = Utf8               java/util/Iterator
  #152 = Utf8               hasNext
  #153 = InterfaceMethodref #149.#154     // java/util/Iterator.next:()Ljava/lang/Object;
  #154 = NameAndType        #155:#156     // next:()Ljava/lang/Object;
  #155 = Utf8               next
  #156 = Utf8               ()Ljava/lang/Object;
  #157 = Class              #158          // ext/mods/gameserver/model/actor/Player
  #158 = Utf8               ext/mods/gameserver/model/actor/Player
  #159 = Methodref          #160.#161     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #160 = Class              #162          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #161 = NameAndType        #17:#163      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #162 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #163 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #164 = Methodref          #160.#165     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #165 = NameAndType        #166:#167     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #166 = Utf8               isRegistered
  #167 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #168 = Methodref          #157.#169     // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #169 = NameAndType        #170:#110     // isAlikeDead:()Z
  #170 = Utf8               isAlikeDead
  #171 = Methodref          #157.#172     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #172 = NameAndType        #173:#110     // isTeleporting:()Z
  #173 = Utf8               isTeleporting
  #174 = Methodref          #157.#175     // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #175 = NameAndType        #176:#110     // isDead:()Z
  #176 = Utf8               isDead
  #177 = Methodref          #157.#178     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #178 = NameAndType        #179:#110     // isInObserverMode:()Z
  #179 = Utf8               isInObserverMode
  #180 = Methodref          #157.#181     // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #181 = NameAndType        #182:#110     // isInStoreMode:()Z
  #182 = Utf8               isInStoreMode
  #183 = Methodref          #14.#184      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #184 = NameAndType        #185:#110     // isStarted:()Z
  #185 = Utf8               isStarted
  #186 = Methodref          #157.#187     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #187 = NameAndType        #188:#189     // getObjectId:()I
  #188 = Utf8               getObjectId
  #189 = Utf8               ()I
  #190 = Methodref          #14.#191      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #191 = NameAndType        #192:#193     // isPlayerParticipant:(I)Z
  #192 = Utf8               isPlayerParticipant
  #193 = Utf8               (I)Z
  #194 = Fieldref           #195.#196     // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #195 = Class              #197          // ext/mods/gameserver/enums/ZoneId
  #196 = NameAndType        #198:#199     // CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #197 = Utf8               ext/mods/gameserver/enums/ZoneId
  #198 = Utf8               CASTLE
  #199 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #200 = Methodref          #157.#201     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #201 = NameAndType        #202:#203     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #202 = Utf8               isInsideZone
  #203 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #204 = Fieldref           #195.#205     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #205 = NameAndType        #206:#199     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #206 = Utf8               SIEGE
  #207 = Methodref          #157.#208     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #208 = NameAndType        #209:#210     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #209 = Utf8               getClassId
  #210 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #211 = Fieldref           #212.#213     // ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #212 = Class              #214          // ext/mods/gameserver/enums/actors/ClassId
  #213 = NameAndType        #215:#216     // BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #214 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #215 = Utf8               BISHOP
  #216 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #217 = Fieldref           #212.#218     // ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #218 = NameAndType        #219:#216     // CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #219 = Utf8               CARDINAL
  #220 = Fieldref           #212.#221     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #221 = NameAndType        #222:#216     // SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #222 = Utf8               SHILLIEN_ELDER
  #223 = Fieldref           #212.#224     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #224 = NameAndType        #225:#216     // SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #225 = Utf8               SHILLIEN_SAINT
  #226 = Fieldref           #212.#227     // ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #227 = NameAndType        #228:#216     // ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #228 = Utf8               ELVEN_ELDER
  #229 = Fieldref           #212.#230     // ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #230 = NameAndType        #231:#216     // EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #231 = Utf8               EVAS_SAINT
  #232 = Fieldref           #212.#233     // ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #233 = NameAndType        #234:#216     // PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #234 = Utf8               PROPHET
  #235 = Fieldref           #212.#236     // ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #236 = NameAndType        #237:#216     // HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #237 = Utf8               HIEROPHANT
  #238 = Class              #239          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #239 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #240 = Fieldref           #241.#242     // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #241 = Class              #243          // ext/mods/gameserver/network/SystemMessageId
  #242 = NameAndType        #244:#245     // S1:Lext/mods/gameserver/network/SystemMessageId;
  #243 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #244 = Utf8               S1
  #245 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #246 = Methodref          #238.#247     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #247 = NameAndType        #5:#248       // "<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #248 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #249 = String             #250          // Do you wish to Join TvT Event?
  #250 = Utf8               Do you wish to Join TvT Event?
  #251 = Methodref          #238.#252     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #252 = NameAndType        #253:#254     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #253 = Utf8               addString
  #254 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #255 = Integer            45000
  #256 = Methodref          #238.#257     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #257 = NameAndType        #258:#259     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #258 = Utf8               addTime
  #259 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #260 = Integer            100004
  #261 = Methodref          #238.#262     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #262 = NameAndType        #263:#259     // addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #263 = Utf8               addRequesterId
  #264 = Methodref          #157.#265     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #265 = NameAndType        #266:#267     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #266 = Utf8               sendPacket
  #267 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #268 = Methodref          #23.#269      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.sendQuestionMarkToAllOnline:()V
  #269 = NameAndType        #270:#6       // sendQuestionMarkToAllOnline:()V
  #270 = Utf8               sendQuestionMarkToAllOnline
  #271 = InvokeDynamic      #1:#272       // #1:run:()Ljava/lang/Runnable;
  #272 = NameAndType        #273:#274     // run:()Ljava/lang/Runnable;
  #273 = Utf8               run
  #274 = Utf8               ()Ljava/lang/Runnable;
  #275 = Long               60000l
  #277 = Methodref          #95.#278      // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #278 = NameAndType        #279:#280     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #279 = Utf8               scheduleAtFixedRate
  #280 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #281 = Fieldref           #23.#282      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager._questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #282 = NameAndType        #283:#284     // _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #283 = Utf8               _questionMarkRefresher
  #284 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #285 = Methodref          #286.#287     // java/lang/System.currentTimeMillis:()J
  #286 = Class              #288          // java/lang/System
  #287 = NameAndType        #289:#77      // currentTimeMillis:()J
  #288 = Utf8               java/lang/System
  #289 = Utf8               currentTimeMillis
  #290 = Fieldref           #8.#291       // ext/mods/Config.TVT_EVENT_PARTICIPATION_TIME:I
  #291 = NameAndType        #292:#293     // TVT_EVENT_PARTICIPATION_TIME:I
  #292 = Utf8               TVT_EVENT_PARTICIPATION_TIME
  #293 = Utf8               I
  #294 = Methodref          #85.#295      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask.setStartTime:(J)V
  #295 = NameAndType        #296:#297     // setStartTime:(J)V
  #296 = Utf8               setStartTime
  #297 = Utf8               (J)V
  #298 = Methodref          #14.#299      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.startFight:()Z
  #299 = NameAndType        #300:#110     // startFight:()Z
  #300 = Utf8               startFight
  #301 = String             #302          // Team vs Team: Event cancelled due to lack of Participation.
  #302 = Utf8               Team vs Team: Event cancelled due to lack of Participation.
  #303 = Fieldref           #8.#304       // ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #304 = NameAndType        #305:#293     // TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #305 = Utf8               TVT_EVENT_START_LEAVE_TELEPORT_DELAY
  #306 = InvokeDynamic      #2:#307       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #307 = NameAndType        #125:#308     // makeConcatWithConstants:(I)Ljava/lang/String;
  #308 = Utf8               (I)Ljava/lang/String;
  #309 = Methodref          #14.#310      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #310 = NameAndType        #311:#118     // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #311 = Utf8               sysMsgToAllParticipants
  #312 = Fieldref           #8.#313       // ext/mods/Config.TVT_EVENT_RUNNING_TIME:I
  #313 = NameAndType        #314:#293     // TVT_EVENT_RUNNING_TIME:I
  #314 = Utf8               TVT_EVENT_RUNNING_TIME
  #315 = InterfaceMethodref #316.#317     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #316 = Class              #318          // java/util/concurrent/ScheduledFuture
  #317 = NameAndType        #319:#320     // cancel:(Z)Z
  #318 = Utf8               java/util/concurrent/ScheduledFuture
  #319 = Utf8               cancel
  #320 = Utf8               (Z)Z
  #321 = Methodref          #14.#322      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.calculateRewards:()Ljava/lang/String;
  #322 = NameAndType        #323:#324     // calculateRewards:()Ljava/lang/String;
  #323 = Utf8               calculateRewards
  #324 = Utf8               ()Ljava/lang/String;
  #325 = InvokeDynamic      #3:#307       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #326 = Methodref          #14.#327      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.stopFight:()V
  #327 = NameAndType        #328:#6       // stopFight:()V
  #328 = Utf8               stopFight
  #329 = Fieldref           #85.#330      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
  #330 = NameAndType        #331:#284     // nextRun:Ljava/util/concurrent/ScheduledFuture;
  #331 = Utf8               nextRun
  #332 = Class              #333          // java/text/SimpleDateFormat
  #333 = Utf8               java/text/SimpleDateFormat
  #334 = String             #335          // HH:mm
  #335 = Utf8               HH:mm
  #336 = Methodref          #332.#337     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #337 = NameAndType        #5:#118       // "<init>":(Ljava/lang/String;)V
  #338 = Methodref          #42.#339      // java/util/Calendar.getTime:()Ljava/util/Date;
  #339 = NameAndType        #340:#341     // getTime:()Ljava/util/Date;
  #340 = Utf8               getTime
  #341 = Utf8               ()Ljava/util/Date;
  #342 = Methodref          #332.#343     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #343 = NameAndType        #344:#345     // format:(Ljava/util/Date;)Ljava/lang/String;
  #344 = Utf8               format
  #345 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #346 = String             #347          // 00:00
  #347 = Utf8               00:00
  #348 = Methodref          #14.#349      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
  #349 = NameAndType        #350:#110     // isParticipating:()Z
  #350 = Utf8               isParticipating
  #351 = Methodref          #157.#352     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #352 = NameAndType        #353:#110     // isOnline:()Z
  #353 = Utf8               isOnline
  #354 = Class              #355          // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #355 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #356 = Methodref          #354.#357     // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #357 = NameAndType        #5:#358       // "<init>":(I)V
  #358 = Utf8               (I)V
  #359 = Methodref          #360.#361     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #360 = Class              #362          // ext/mods/gameserver/data/HTMLData
  #361 = NameAndType        #17:#363      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #362 = Utf8               ext/mods/gameserver/data/HTMLData
  #363 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #364 = Methodref          #157.#365     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #365 = NameAndType        #366:#367     // getLocale:()Ljava/util/Locale;
  #366 = Utf8               getLocale
  #367 = Utf8               ()Ljava/util/Locale;
  #368 = String             #369          // html/mods/tournament/tutorial_alert_tvt.htm
  #369 = Utf8               html/mods/tournament/tutorial_alert_tvt.htm
  #370 = Methodref          #360.#371     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #371 = NameAndType        #372:#373     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #372 = Utf8               getHtm
  #373 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #374 = Methodref          #57.#375      // java/lang/String.isEmpty:()Z
  #375 = NameAndType        #376:#110     // isEmpty:()Z
  #376 = Utf8               isEmpty
  #377 = InvokeDynamic      #4:#124       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #378 = String             #379          // Team vs Team event is in progress. Use .tvtinfo for status.
  #379 = Utf8               Team vs Team event is in progress. Use .tvtinfo for status.
  #380 = String             #381          // Join TvT
  #381 = Utf8               Join TvT
  #382 = String             #383          // Info
  #383 = Utf8               Info
  #384 = String             #385          // tvtjoin
  #385 = Utf8               tvtjoin
  #386 = String             #387          // tvtinfo
  #387 = Utf8               tvtinfo
  #388 = String             #389          // %message%
  #389 = Utf8               %message%
  #390 = Methodref          #57.#391      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #391 = NameAndType        #392:#393     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #392 = Utf8               replace
  #393 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #394 = String             #395          // %button_label%
  #395 = Utf8               %button_label%
  #396 = String             #397          // %button_bypass%
  #397 = Utf8               %button_bypass%
  #398 = Fieldref           #399.#400     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #399 = Class              #401          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$SingletonHolder
  #400 = NameAndType        #402:#403     // INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #401 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$SingletonHolder
  #402 = Utf8               INSTANCE
  #403 = Utf8               Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #404 = Methodref          #405.#406     // java/lang/Class.getName:()Ljava/lang/String;
  #405 = Class              #407          // java/lang/Class
  #406 = NameAndType        #408:#324     // getName:()Ljava/lang/String;
  #407 = Utf8               java/lang/Class
  #408 = Utf8               getName
  #409 = Methodref          #34.#337      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #410 = Utf8               Signature
  #411 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #412 = Utf8               JOIN_TVT_REQ_ID
  #413 = Utf8               ConstantValue
  #414 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #415 = Integer            2004
  #416 = Utf8               Code
  #417 = Utf8               LineNumberTable
  #418 = Utf8               LocalVariableTable
  #419 = Utf8               this
  #420 = Utf8               StackMapTable
  #421 = Utf8               splitTimeOfDay
  #422 = Utf8               timeOfDay
  #423 = Utf8               currentTime
  #424 = Utf8               nextStartTime
  #425 = Utf8               testStartTime
  #426 = Utf8               e
  #427 = Utf8               Ljava/lang/Exception;
  #428 = Class              #49           // "[Ljava/lang/String;"
  #429 = Utf8               startReg
  #430 = Utf8               confirm
  #431 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #432 = Utf8               players
  #433 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #434 = Utf8               startEvent
  #435 = Utf8               endEvent
  #436 = Utf8               skipDelay
  #437 = Utf8               getNextTime
  #438 = Utf8               Ljava/text/SimpleDateFormat;
  #439 = Utf8               eventHour
  #440 = Utf8               eventMinute
  #441 = Utf8               eventTime
  #442 = Utf8               online
  #443 = Utf8               getTutorialAlertHtml
  #444 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #445 = Utf8               player
  #446 = Utf8               html
  #447 = Utf8               message
  #448 = Utf8               buttonLabel
  #449 = Utf8               buttonBypass
  #450 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
  #451 = Utf8               <clinit>
  #452 = Utf8               SourceFile
  #453 = Utf8               TvTManager.java
  #454 = Utf8               NestMembers
  #455 = Utf8               BootstrapMethods
  #456 = String             #457          // Team vs Team: Joinable in \u0001!
  #457 = Utf8               Team vs Team: Joinable in \u0001!
  #458 = MethodType         #6            //  ()V
  #459 = MethodHandle       6:#268        // REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.sendQuestionMarkToAllOnline:()V
  #460 = String             #461          // Teleporting participants in \u0001 second(s).
  #461 = Utf8               Teleporting participants in \u0001 second(s).
  #462 = String             #463          // Teleporting back to town in \u0001 second(s).
  #463 = Utf8               Teleporting back to town in \u0001 second(s).
  #464 = String             #465          // Registration is open! Join in \u0001. Commands: .tvtjoin / .tvtleave / .tvtinfo
  #465 = Utf8               Registration is open! Join in \u0001. Commands: .tvtjoin / .tvtleave / .tvtinfo
  #466 = MethodHandle       6:#467        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #467 = Methodref          #468.#469     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #468 = Class              #470          // java/lang/invoke/StringConcatFactory
  #469 = NameAndType        #125:#471     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #470 = Utf8               java/lang/invoke/StringConcatFactory
  #471 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #472 = MethodHandle       6:#473        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #473 = Methodref          #474.#475     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #474 = Class              #476          // java/lang/invoke/LambdaMetafactory
  #475 = NameAndType        #477:#478     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #476 = Utf8               java/lang/invoke/LambdaMetafactory
  #477 = Utf8               metafactory
  #478 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #479 = Utf8               InnerClasses
  #480 = Utf8               TvTStartTask
  #481 = Utf8               SingletonHolder
  #482 = Class              #483          // java/lang/invoke/MethodHandles$Lookup
  #483 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #484 = Class              #485          // java/lang/invoke/MethodHandles
  #485 = Utf8               java/lang/invoke/MethodHandles
  #486 = Utf8               Lookup
{
  public static final int JOIN_TVT_REQ_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 100004

  public static final int TUTORIAL_QUESTION_MARK_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2004

  public java.util.Calendar _nextEvent;
    descriptor: Ljava/util/Calendar;
    flags: (0x0001) ACC_PUBLIC

  protected ext.mods.gameserver.model.entity.events.teamvsteam.TvTManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: getstatic     #7                  // Field ext/mods/Config.TVT_EVENT_ENABLED:Z
         7: ifeq          31
        10: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        13: invokevirtual #19                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.init:()V
        16: aload_0
        17: invokevirtual #22                 // Method scheduleEventStart:()V
        20: getstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        23: ldc           #31                 // String Team vs Team Engine: is Started.
        25: invokevirtual #33                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        28: goto          39
        31: getstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        34: ldc           #39                 // String Team vs Team Engine: is disabled.
        36: invokevirtual #33                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        39: return
      LineNumberTable:
        line 52: 0
        line 53: 4
        line 55: 10
        line 57: 16
        line 58: 20
        line 61: 31
        line 62: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager ]
          stack = []
        frame_type = 7 /* same */

  public void scheduleEventStart();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=1
         0: invokestatic  #41                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: aconst_null
         5: astore_2
         6: aconst_null
         7: astore_3
         8: getstatic     #46                 // Field ext/mods/Config.TVT_EVENT_INTERVAL:[Ljava/lang/String;
        11: astore        4
        13: aload         4
        15: arraylength
        16: istore        5
        18: iconst_0
        19: istore        6
        21: iload         6
        23: iload         5
        25: if_icmpge     132
        28: aload         4
        30: iload         6
        32: aaload
        33: astore        7
        35: invokestatic  #41                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        38: astore_3
        39: aload_3
        40: iconst_1
        41: invokevirtual #50                 // Method java/util/Calendar.setLenient:(Z)V
        44: aload         7
        46: ldc           #54                 // String :
        48: invokevirtual #56                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        51: astore        8
        53: aload_3
        54: bipush        11
        56: aload         8
        58: iconst_0
        59: aaload
        60: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        63: invokevirtual #68                 // Method java/util/Calendar.set:(II)V
        66: aload_3
        67: bipush        12
        69: aload         8
        71: iconst_1
        72: aaload
        73: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        76: invokevirtual #68                 // Method java/util/Calendar.set:(II)V
        79: aload_3
        80: bipush        13
        82: ldc           #72                 // String 00
        84: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        87: invokevirtual #68                 // Method java/util/Calendar.set:(II)V
        90: aload_3
        91: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
        94: aload_1
        95: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
        98: lcmp
        99: ifge          108
       102: aload_3
       103: iconst_5
       104: iconst_1
       105: invokevirtual #78                 // Method java/util/Calendar.add:(II)V
       108: aload_2
       109: ifnull        124
       112: aload_3
       113: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
       116: aload_2
       117: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
       120: lcmp
       121: ifge          126
       124: aload_3
       125: astore_2
       126: iinc          6, 1
       129: goto          21
       132: aload_0
       133: aload_2
       134: putfield      #81                 // Field _nextEvent:Ljava/util/Calendar;
       137: aload_2
       138: ifnull        164
       141: aload_0
       142: new           #85                 // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask
       145: dup
       146: aload_0
       147: aload_2
       148: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
       151: invokespecial #87                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask."<init>":(Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;J)V
       154: putfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
       157: aload_0
       158: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
       161: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       164: goto          176
       167: astore_1
       168: getstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       171: ldc           #102                // String TvTEventEngine: Error figuring out a start time. Check TvTEventInterval in config file.
       173: invokevirtual #104                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       176: return
      Exception table:
         from    to  target type
             0   164   167   Class java/lang/Exception
      LineNumberTable:
        line 68: 0
        line 69: 4
        line 70: 6
        line 72: 8
        line 74: 35
        line 75: 39
        line 77: 44
        line 78: 53
        line 79: 66
        line 80: 79
        line 82: 90
        line 83: 102
        line 85: 108
        line 86: 124
        line 72: 126
        line 89: 132
        line 91: 137
        line 93: 141
        line 94: 157
        line 100: 164
        line 97: 167
        line 99: 168
        line 101: 176
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      73     8 splitTimeOfDay   [Ljava/lang/String;
           35      91     7 timeOfDay   Ljava/lang/String;
            4     160     1 currentTime   Ljava/util/Calendar;
            6     158     2 nextStartTime   Ljava/util/Calendar;
            8     156     3 testStartTime   Ljava/util/Calendar;
          168       8     1     e   Ljava/lang/Exception;
            0     177     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager, class java/util/Calendar, class java/util/Calendar, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 86
          locals = [ class java/lang/String, class "[Ljava/lang/String;" ]
        frame_type = 15 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 248 /* chop */
          offset_delta = 31
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 8 /* same */

  public void startReg();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=1
         0: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
         3: invokevirtual #107                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.startParticipation:()Z
         6: ifne          21
         9: ldc           #111                // String Team vs Team: Event was cancelled.
        11: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        14: aload_0
        15: invokevirtual #22                 // Method scheduleEventStart:()V
        18: goto          338
        21: getstatic     #119                // Field ext/mods/Config.TVT_NPC_LOC_NAME:Ljava/lang/String;
        24: invokedynamic #123,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        29: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: getstatic     #127                // Field ext/mods/Config.EVENT_COMMANDS:Z
        35: ifeq          43
        38: ldc           #130                // String Team vs Team: Command: .tvtjoin / .tvtleave / .tvtinfo
        40: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        43: getstatic     #132                // Field ext/mods/Config.ALLOW_TVT_DLG:Z
        46: ifeq          291
        49: invokestatic  #135                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        52: invokevirtual #138                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        55: invokeinterface #142,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        60: astore_1
        61: aload_1
        62: invokeinterface #148,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        67: ifeq          291
        70: aload_1
        71: invokeinterface #153,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        76: checkcast     #157                // class ext/mods/gameserver/model/actor/Player
        79: astore_2
        80: invokestatic  #159                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        83: aload_2
        84: invokevirtual #164                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        87: ifne          61
        90: aload_2
        91: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
        94: ifne          61
        97: aload_2
        98: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       101: ifne          61
       104: aload_2
       105: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       108: ifne          61
       111: aload_2
       112: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       115: ifne          61
       118: aload_2
       119: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       122: ifne          61
       125: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       128: invokevirtual #183                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       131: ifeq          147
       134: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       137: aload_2
       138: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       141: invokevirtual #190                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
       144: ifne          61
       147: aload_2
       148: getstatic     #194                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       151: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       154: ifne          61
       157: aload_2
       158: getstatic     #204                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       161: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       164: ifne          61
       167: aload_2
       168: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       171: getstatic     #211                // Field ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
       174: if_acmpeq     61
       177: aload_2
       178: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       181: getstatic     #217                // Field ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
       184: if_acmpeq     61
       187: aload_2
       188: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       191: getstatic     #220                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       194: if_acmpeq     61
       197: aload_2
       198: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       201: getstatic     #223                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       204: if_acmpeq     61
       207: aload_2
       208: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       211: getstatic     #226                // Field ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       214: if_acmpeq     61
       217: aload_2
       218: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       221: getstatic     #229                // Field ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       224: if_acmpeq     61
       227: aload_2
       228: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       231: getstatic     #232                // Field ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
       234: if_acmpeq     61
       237: aload_2
       238: invokevirtual #207                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       241: getstatic     #235                // Field ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
       244: if_acmpne     250
       247: goto          61
       250: new           #238                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       253: dup
       254: getstatic     #240                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       257: invokespecial #246                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
       260: astore_3
       261: aload_3
       262: ldc           #249                // String Do you wish to Join TvT Event?
       264: invokevirtual #251                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       267: pop
       268: aload_3
       269: ldc           #255                // int 45000
       271: invokevirtual #256                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       274: pop
       275: aload_3
       276: ldc_w         #260                // int 100004
       279: invokevirtual #261                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       282: pop
       283: aload_2
       284: aload_3
       285: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       288: goto          61
       291: invokestatic  #268                // Method sendQuestionMarkToAllOnline:()V
       294: aload_0
       295: invokedynamic #271,  0            // InvokeDynamic #1:run:()Ljava/lang/Runnable;
       300: ldc2_w        #275                // long 60000l
       303: ldc2_w        #275                // long 60000l
       306: invokestatic  #277                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       309: putfield      #281                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
       312: aload_0
       313: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
       316: invokestatic  #285                // Method java/lang/System.currentTimeMillis:()J
       319: ldc2_w        #275                // long 60000l
       322: getstatic     #290                // Field ext/mods/Config.TVT_EVENT_PARTICIPATION_TIME:I
       325: i2l
       326: lmul
       327: ladd
       328: invokevirtual #294                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask.setStartTime:(J)V
       331: aload_0
       332: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
       335: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       338: return
      LineNumberTable:
        line 105: 0
        line 107: 9
        line 108: 14
        line 112: 21
        line 114: 32
        line 115: 38
        line 117: 43
        line 119: 49
        line 121: 80
        line 122: 247
        line 124: 250
        line 125: 261
        line 126: 268
        line 127: 275
        line 128: 283
        line 129: 288
        line 131: 291
        line 132: 294
        line 133: 312
        line 134: 331
        line 136: 338
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          261      27     3 confirm   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
           80     208     2 players   Lext/mods/gameserver/model/actor/Player;
            0     339     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
      StackMapTable: number_of_entries = 7
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 102
        frame_type = 249 /* chop */
          offset_delta = 40
        frame_type = 46 /* same */

  public void startEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
         3: invokevirtual #298                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.startFight:()Z
         6: ifne          22
         9: ldc_w         #301                // String Team vs Team: Event cancelled due to lack of Participation.
        12: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        15: aload_0
        16: invokevirtual #22                 // Method scheduleEventStart:()V
        19: goto          62
        22: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        25: getstatic     #303                // Field ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
        28: invokedynamic #306,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        33: invokevirtual #309                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        36: aload_0
        37: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
        40: invokestatic  #285                // Method java/lang/System.currentTimeMillis:()J
        43: ldc2_w        #275                // long 60000l
        46: getstatic     #312                // Field ext/mods/Config.TVT_EVENT_RUNNING_TIME:I
        49: i2l
        50: lmul
        51: ladd
        52: invokevirtual #294                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask.setStartTime:(J)V
        55: aload_0
        56: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
        59: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        62: return
      LineNumberTable:
        line 140: 0
        line 142: 9
        line 143: 15
        line 147: 22
        line 148: 36
        line 149: 55
        line 151: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 39 /* same */

  public void endEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #281                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #281                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #315,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #281                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        23: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        26: invokevirtual #321                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.calculateRewards:()Ljava/lang/String;
        29: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        35: getstatic     #303                // Field ext/mods/Config.TVT_EVENT_START_LEAVE_TELEPORT_DELAY:I
        38: invokedynamic #325,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #309                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        46: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        49: invokevirtual #326                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.stopFight:()V
        52: aload_0
        53: invokevirtual #22                 // Method scheduleEventStart:()V
        56: return
      LineNumberTable:
        line 155: 0
        line 157: 7
        line 158: 18
        line 160: 23
        line 161: 32
        line 162: 46
        line 164: 52
        line 165: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void skipDelay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
        12: getfield      #329                // Field ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
        15: iconst_0
        16: invokeinterface #315,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        21: ifeq          41
        24: aload_0
        25: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
        28: invokestatic  #285                // Method java/lang/System.currentTimeMillis:()J
        31: invokevirtual #294                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask.setStartTime:(J)V
        34: aload_0
        35: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask;
        38: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        41: return
      LineNumberTable:
        line 169: 0
        line 170: 7
        line 172: 8
        line 174: 24
        line 175: 34
        line 177: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 32 /* same */

  public java.lang.String getNextTime();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=1
         0: invokestatic  #41                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: getstatic     #46                 // Field ext/mods/Config.TVT_EVENT_INTERVAL:[Ljava/lang/String;
         7: astore_2
         8: aload_2
         9: arraylength
        10: istore_3
        11: iconst_0
        12: istore        4
        14: iload         4
        16: iload_3
        17: if_icmpge     132
        20: aload_2
        21: iload         4
        23: aaload
        24: astore        5
        26: aload         5
        28: ldc           #54                 // String :
        30: invokevirtual #56                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        33: astore        6
        35: aload         6
        37: iconst_0
        38: aaload
        39: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        42: istore        7
        44: aload         6
        46: iconst_1
        47: aaload
        48: invokestatic  #62                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        51: istore        8
        53: invokestatic  #41                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        56: astore        9
        58: aload         9
        60: iconst_1
        61: invokevirtual #50                 // Method java/util/Calendar.setLenient:(Z)V
        64: aload         9
        66: bipush        11
        68: iload         7
        70: invokevirtual #68                 // Method java/util/Calendar.set:(II)V
        73: aload         9
        75: bipush        12
        77: iload         8
        79: invokevirtual #68                 // Method java/util/Calendar.set:(II)V
        82: aload         9
        84: bipush        13
        86: iconst_0
        87: invokevirtual #68                 // Method java/util/Calendar.set:(II)V
        90: aload         9
        92: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
        95: aload_1
        96: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
        99: lcmp
       100: ifle          126
       103: new           #332                // class java/text/SimpleDateFormat
       106: dup
       107: ldc_w         #334                // String HH:mm
       110: invokespecial #336                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       113: astore        10
       115: aload         10
       117: aload         9
       119: invokevirtual #338                // Method java/util/Calendar.getTime:()Ljava/util/Date;
       122: invokevirtual #342                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       125: areturn
       126: iinc          4, 1
       129: goto          14
       132: ldc_w         #346                // String 00:00
       135: areturn
      LineNumberTable:
        line 261: 0
        line 262: 4
        line 264: 26
        line 265: 35
        line 266: 44
        line 268: 53
        line 269: 58
        line 270: 64
        line 271: 73
        line 272: 82
        line 274: 90
        line 276: 103
        line 277: 115
        line 262: 126
        line 281: 132
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          115      11    10 format   Ljava/text/SimpleDateFormat;
           35      91     6 splitTimeOfDay   [Ljava/lang/String;
           44      82     7 eventHour   I
           53      73     8 eventMinute   I
           58      68     9 eventTime   Ljava/util/Calendar;
           26     100     5 timeOfDay   Ljava/lang/String;
            0     136     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
            4     132     1 currentTime   Ljava/util/Calendar;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 111
        frame_type = 248 /* chop */
          offset_delta = 5

  public java.lang.String getTutorialAlertHtml(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: ifnull        22
         4: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
         7: invokevirtual #348                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
        10: ifne          24
        13: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        16: invokevirtual #183                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
        19: ifne          24
        22: aconst_null
        23: areturn
        24: invokestatic  #359                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        27: aload_1
        28: invokevirtual #364                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: ldc_w         #368                // String html/mods/tournament/tutorial_alert_tvt.htm
        34: invokevirtual #370                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        37: astore_2
        38: aload_2
        39: ifnull        49
        42: aload_2
        43: invokevirtual #374                // Method java/lang/String.isEmpty:()Z
        46: ifeq          51
        49: aconst_null
        50: areturn
        51: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        54: invokevirtual #348                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
        57: ifeq          71
        60: getstatic     #119                // Field ext/mods/Config.TVT_NPC_LOC_NAME:Ljava/lang/String;
        63: invokedynamic #377,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        68: goto          74
        71: ldc_w         #378                // String Team vs Team event is in progress. Use .tvtinfo for status.
        74: astore_3
        75: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        78: invokevirtual #348                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
        81: ifeq          90
        84: ldc_w         #380                // String Join TvT
        87: goto          93
        90: ldc_w         #382                // String Info
        93: astore        4
        95: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        98: invokevirtual #348                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isParticipating:()Z
       101: ifeq          110
       104: ldc_w         #384                // String tvtjoin
       107: goto          113
       110: ldc_w         #386                // String tvtinfo
       113: astore        5
       115: aload_2
       116: ldc_w         #388                // String %message%
       119: aload_3
       120: invokevirtual #390                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       123: ldc_w         #394                // String %button_label%
       126: aload         4
       128: invokevirtual #390                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       131: ldc_w         #396                // String %button_bypass%
       134: aload         5
       136: invokevirtual #390                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       139: areturn
      LineNumberTable:
        line 297: 0
        line 298: 22
        line 299: 24
        line 300: 38
        line 301: 49
        line 302: 51
        line 303: 60
        line 304: 71
        line 305: 75
        line 306: 95
        line 307: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
            0     140     1 player   Lext/mods/gameserver/model/actor/Player;
           38     102     2  html   Ljava/lang/String;
           75      65     3 message   Ljava/lang/String;
           95      45     4 buttonLabel   Ljava/lang/String;
          115      25     5 buttonBypass   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 22 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/String ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/lang/String ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]

  public static final ext.mods.gameserver.model.entity.events.teamvsteam.TvTManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #398                // Field ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/teamvsteam/TvTManager;
         3: areturn
      LineNumberTable:
        line 312: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #34                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #23                 // class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
         6: invokevirtual #404                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #409                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "TvTManager.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$SingletonHolder
  ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask
BootstrapMethods:
  0: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 Team vs Team: Joinable in \u0001!
  1: #472 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #458 ()V
      #459 REF_invokeStatic ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager.sendQuestionMarkToAllOnline:()V
      #458 ()V
  2: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 Teleporting participants in \u0001 second(s).
  3: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #462 Teleporting back to town in \u0001 second(s).
  4: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #464 Registration is open! Join in \u0001. Commands: .tvtjoin / .tvtleave / .tvtinfo
InnerClasses:
  #480= #85 of #23;                       // TvTStartTask=class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager$TvTStartTask of class ext/mods/gameserver/model/entity/events/teamvsteam/TvTManager
  public static final #486= #482 of #484; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
